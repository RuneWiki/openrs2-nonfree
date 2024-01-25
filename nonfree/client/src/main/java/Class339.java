import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class339 {

	@OriginalMember(owner = "client!um", name = "a", descriptor = "Z")
	public boolean aBoolean711;

	@OriginalMember(owner = "client!um", name = "b", descriptor = "I")
	public int anInt9461;

	@OriginalMember(owner = "client!um", name = "d", descriptor = "I")
	private int anInt9462;

	@OriginalMember(owner = "client!um", name = "f", descriptor = "I")
	private int anInt9464;

	@OriginalMember(owner = "client!um", name = "h", descriptor = "I")
	private int anInt9466;

	@OriginalMember(owner = "client!um", name = "j", descriptor = "I")
	private int anInt9467;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "I")
	private int anInt9469;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "I")
	public int anInt9470;

	@OriginalMember(owner = "client!um", name = "o", descriptor = "[S")
	public short[] aShortArray137;

	@OriginalMember(owner = "client!um", name = "r", descriptor = "Z")
	public boolean aBoolean713;

	@OriginalMember(owner = "client!um", name = "s", descriptor = "Lclient!tj;")
	public Class3_Sub22 aClass3_Sub22_3;

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	private Class339() {
		if (Static561.anIntArray583 == null) {
			Static127.method2249();
		}
		this.method8104();
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lclient!ha;Lclient!dc;I)V")
	public Class339(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class3_Sub9 arg1, @OriginalArg(2) int arg2) {
		if (Static561.anIntArray583 == null) {
			Static127.method2249();
		}
		this.anInt9470 = arg1.method5633();
		this.aBoolean711 = (this.anInt9470 & 0x10) != 0;
		this.aBoolean713 = (this.anInt9470 & 0x8) != 0;
		this.anInt9470 &= 0x7;
		@Pc(44) int local44 = arg1.method5610() << arg2;
		@Pc(50) int local50 = arg1.method5610() << arg2;
		@Pc(56) int local56 = arg1.method5610() << arg2;
		@Pc(60) int local60 = arg1.method5633();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray137 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray137.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method5610();
			local83 = local79 >>> 8;
			if (local83 >= local66) {
				local83 = local66 - 1;
			}
			@Pc(98) int local98 = local79 & 0xFF;
			if (local98 > local66 - local83) {
				local98 = local66 - local83;
			}
			this.aShortArray137[local72] = (short) (local83 << 8 | local98);
		}
		local60 = (local60 << Static485.anInt8241) + Static493.anInt8365;
		@Pc(157) int local157 = Static205.anIntArray530 == null ? Static303.anIntArray531[Static127.method2248(arg1.method5610()) & 0xFFFF] : Static205.anIntArray530[arg1.method5610()];
		local83 = arg1.method5633();
		this.anInt9461 = local83 & 0x1F;
		this.anInt9467 = (local83 & 0xE0) << 3;
		if (this.anInt9461 != 31) {
			this.method8104();
		}
		this.method8101(local44, local56, arg0, local60, local50, local157);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IILclient!ha;IIII)V")
	private void method8101(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub22_3 = arg2.method6126(arg0, arg1, arg4, arg3, arg5, 1.0F);
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IZZ)V")
	public void method8103(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(60) int local60;
		if (arg1) {
			local60 = 2048;
		} else {
			@Pc(24) int local24 = arg0 * this.anInt9466 / 50 + this.anInt9467 & 0x7FF;
			@Pc(27) int local27 = this.anInt9469;
			if (local27 == 1) {
				local60 = (Class3_Sub13.anIntArray147[local24 << 3] >> 4) + 1024;
			} else if (local27 == 3) {
				local60 = Static561.anIntArray583[local24] >> 1;
			} else if (local27 == 4) {
				local60 = local24 >> 10 << 11;
			} else if (local27 == 2) {
				local60 = local24;
			} else if (local27 == 5) {
				local60 = (local24 < 1024 ? local24 : 2048 - local24) << 1;
			} else {
				local60 = 2048;
			}
		}
		this.aClass3_Sub22_3.method8389((float) (this.anInt9462 + (local60 * this.anInt9464 >> 11)) / 2048.0F);
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
	private void method8104() {
		@Pc(8) int local8 = this.anInt9461;
		if (local8 == 2) {
			this.anInt9462 = 0;
			this.anInt9464 = 2048;
			this.anInt9469 = 1;
			this.anInt9466 = 2048;
		} else if (local8 == 3) {
			this.anInt9462 = 0;
			this.anInt9469 = 1;
			this.anInt9466 = 4096;
			this.anInt9464 = 2048;
		} else if (local8 == 4) {
			this.anInt9462 = 0;
			this.anInt9469 = 4;
			this.anInt9464 = 2048;
			this.anInt9466 = 2048;
		} else if (local8 == 5) {
			this.anInt9466 = 8192;
			this.anInt9462 = 0;
			this.anInt9469 = 4;
			this.anInt9464 = 2048;
		} else if (local8 == 12) {
			this.anInt9464 = 2048;
			this.anInt9466 = 2048;
			this.anInt9469 = 2;
			this.anInt9462 = 0;
		} else if (local8 == 13) {
			this.anInt9466 = 8192;
			this.anInt9462 = 0;
			this.anInt9464 = 2048;
			this.anInt9469 = 2;
		} else if (local8 == 10) {
			this.anInt9466 = 2048;
			this.anInt9462 = 1536;
			this.anInt9469 = 3;
			this.anInt9464 = 512;
		} else if (local8 == 11) {
			this.anInt9462 = 1536;
			this.anInt9469 = 3;
			this.anInt9466 = 4096;
			this.anInt9464 = 512;
		} else if (local8 == 6) {
			this.anInt9469 = 3;
			this.anInt9462 = 1280;
			this.anInt9464 = 768;
			this.anInt9466 = 2048;
		} else if (local8 == 7) {
			this.anInt9462 = 1280;
			this.anInt9469 = 3;
			this.anInt9464 = 768;
			this.anInt9466 = 4096;
		} else if (local8 == 8) {
			this.anInt9466 = 2048;
			this.anInt9464 = 1024;
			this.anInt9469 = 3;
			this.anInt9462 = 1024;
		} else if (local8 == 9) {
			this.anInt9469 = 3;
			this.anInt9464 = 1024;
			this.anInt9462 = 1024;
			this.anInt9466 = 4096;
		} else if (local8 == 14) {
			this.anInt9462 = 1280;
			this.anInt9469 = 1;
			this.anInt9466 = 2048;
			this.anInt9464 = 768;
		} else if (local8 == 15) {
			this.anInt9464 = 512;
			this.anInt9462 = 1536;
			this.anInt9466 = 4096;
			this.anInt9469 = 1;
		} else if (local8 == 16) {
			this.anInt9469 = 1;
			this.anInt9464 = 256;
			this.anInt9462 = 1792;
			this.anInt9466 = 8192;
		} else {
			this.anInt9462 = 0;
			this.anInt9464 = 2048;
			this.anInt9466 = 2048;
			this.anInt9469 = 0;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIIII)V")
	public void method8105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9466 = arg1;
		this.anInt9469 = arg2;
		this.anInt9464 = arg0;
		this.anInt9462 = arg3;
	}
}
