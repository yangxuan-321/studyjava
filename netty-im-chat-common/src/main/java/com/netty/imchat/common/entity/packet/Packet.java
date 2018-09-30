package com.netty.imchat.common.entity.packet;

import com.netty.imchat.common.enums.ProtoclEnum;
import com.netty.imchat.common.util.EnumUtils;

/**
 * @author Kevin
 * @Title: Packaet
 * @ProjectName studyjava
 * @Description: TODO 基础 通信协议类 抽象类
 * @date 2018/9/29 18:47
 */
public abstract class Packet {
    /**
     * 协议版本
     */
    private Byte version = EnumUtils.ByteEnumUtils.getEnumCode(ProtoclEnum.FIRST_VERSION);

    public Byte getVersion() {
        return version;
    }


    /**
     * 指令
     * @return
     */
    public abstract Byte getCommand();
}