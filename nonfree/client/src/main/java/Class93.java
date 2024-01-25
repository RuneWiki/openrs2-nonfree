import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class93 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "Z")
	public boolean aBoolean297;

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
	private int anInt3587;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	public int anInt3588;

	@OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
	private int anInt3592;

	@OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
	private int anInt3593;

	@OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
	private int anInt3594;

	@OriginalMember(owner = "client!fc", name = "m", descriptor = "I")
	private int anInt3595;

	@OriginalMember(owner = "client!fc", name = "n", descriptor = "Lclient!pk;")
	public Class3_Sub27 aClass3_Sub27_2;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
	public boolean aBoolean298;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "I")
	public int anInt3599;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
	private Class93() {
		if (Static548.anIntArray581 == null) {
			Static177.method3611();
		}
		this.method3165();
	}

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!ha;Lclient!tn;I)V")
	public Class93(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class3_Sub15 arg1, @OriginalArg(2) int arg2) {
		if (Static548.anIntArray581 == null) {
			Static177.method3611();
		}
		this.anInt3588 = arg1.method8401();
		this.aBoolean298 = (this.anInt3588 & 0x10) != 0;
		this.aBoolean297 = (this.anInt3588 & 0x8) != 0;
		this.anInt3588 &= 0x7;
		@Pc(44) int local44 = arg1.method8414() << arg2;
		@Pc(50) int local50 = arg1.method8414() << arg2;
		@Pc(56) int local56 = arg1.method8414() << arg2;
		@Pc(60) int local60 = arg1.method8401();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray33 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray33.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method8414();
			local83 = local79 >>> 8;
			@Pc(87) int local87 = local79 & 0xFF;
			if (local83 >= local66) {
				local83 = local66 - 1;
			}
			if (local66 - local83 < local87) {
				local87 = local66 - local83;
			}
			this.aShortArray33[local72] = (short) (local87 | local83 << 8);
		}
		local60 = (local60 << Static276.anInt5846) + Static510.anInt8986;
		@Pc(148) int local148 = Static120.anIntArray152 == null ? Static474.anIntArray530[Static551.method8398(arg1.method8414()) & 0xFFFF] : Static120.anIntArray152[arg1.method8414()];
		local83 = arg1.method8401();
		this.anInt3595 = (local83 & 0xE0) << 3;
		this.anInt3599 = local83 & 0x1F;
		if (this.anInt3599 != 31) {
			this.method3165();
		}
		this.method3166(local60, local50, arg0, local56, local148, local44);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	private void method3165() {
		@Pc(8) int local8 = this.anInt3599;
		if (local8 == 2) {
			this.anInt3592 = 0;
			this.anInt3587 = 2048;
			this.anInt3593 = 2048;
			this.anInt3594 = 1;
		} else if (local8 == 3) {
			this.anInt3587 = 2048;
			this.anInt3593 = 4096;
			this.anInt3594 = 1;
			this.anInt3592 = 0;
		} else if (local8 == 4) {
			this.anInt3587 = 2048;
			this.anInt3593 = 2048;
			this.anInt3592 = 0;
			this.anInt3594 = 4;
		} else if (local8 == 5) {
			this.anInt3592 = 0;
			this.anInt3594 = 4;
			this.anInt3587 = 2048;
			this.anInt3593 = 8192;
		} else if (local8 == 12) {
			this.anInt3592 = 0;
			this.anInt3593 = 2048;
			this.anInt3587 = 2048;
			this.anInt3594 = 2;
		} else if (local8 == 13) {
			this.anInt3594 = 2;
			this.anInt3592 = 0;
			this.anInt3593 = 8192;
			this.anInt3587 = 2048;
		} else if (local8 == 10) {
			this.anInt3593 = 2048;
			this.anInt3594 = 3;
			this.anInt3592 = 1536;
			this.anInt3587 = 512;
		} else if (local8 == 11) {
			this.anInt3587 = 512;
			this.anInt3592 = 1536;
			this.anInt3594 = 3;
			this.anInt3593 = 4096;
		} else if (local8 == 6) {
			this.anInt3592 = 1280;
			this.anInt3594 = 3;
			this.anInt3587 = 768;
			this.anInt3593 = 2048;
		} else if (local8 == 7) {
			this.anInt3594 = 3;
			this.anInt3587 = 768;
			this.anInt3593 = 4096;
			this.anInt3592 = 1280;
		} else if (local8 == 8) {
			this.anInt3592 = 1024;
			this.anInt3587 = 1024;
			this.anInt3593 = 2048;
			this.anInt3594 = 3;
		} else if (local8 == 9) {
			this.anInt3593 = 4096;
			this.anInt3592 = 1024;
			this.anInt3587 = 1024;
			this.anInt3594 = 3;
		} else if (local8 == 14) {
			this.anInt3592 = 1280;
			this.anInt3594 = 1;
			this.anInt3587 = 768;
			this.anInt3593 = 2048;
		} else if (local8 == 15) {
			this.anInt3592 = 1536;
			this.anInt3587 = 512;
			this.anInt3594 = 1;
			this.anInt3593 = 4096;
		} else if (local8 == 16) {
			this.anInt3594 = 1;
			this.anInt3593 = 8192;
			this.anInt3592 = 1792;
			this.anInt3587 = 256;
		} else {
			this.anInt3594 = 0;
			this.anInt3592 = 0;
			this.anInt3593 = 2048;
			this.anInt3587 = 2048;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIBLclient!ha;III)V")
	private void method3166(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub27_2 = arg2.method6152(arg5, arg3, arg1, arg0, arg4, 1.0F);
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBIII)V")
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt3592 = arg2;
		this.anInt3594 = arg0;
		this.anInt3593 = arg1;
		this.anInt3587 = arg3;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IIZ)V")
	public void method3171(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) int local13;
		if (arg1) {
			local13 = 2048;
		} else {
			@Pc(27) int local27 = this.anInt3595 + arg0 * this.anInt3593 / 50 & 0x7FF;
			@Pc(30) int local30 = this.anInt3594;
			if (local30 == 1) {
				local13 = (Class3_Sub1_Sub2.anIntArray84[local27 << 3] >> 4) + 1024;
			} else if (local30 == 3) {
				local13 = Static548.anIntArray581[local27] >> 1;
			} else if (local30 == 4) {
				local13 = local27 >> 10 << 11;
			} else if (local30 == 2) {
				local13 = local27;
			} else if (local30 == 5) {
				local13 = (local27 >= 1024 ? 2048 - local27 : local27) << 1;
			} else {
				local13 = 2048;
			}
		}
		this.aClass3_Sub27_2.method5632((float) ((this.anInt3587 * local13 >> 11) + this.anInt3592) / 2048.0F);
	}
}
