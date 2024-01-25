import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class191 {

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
	private int anInt5455;

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "Z")
	public boolean aBoolean472;

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "[S")
	public short[] aShortArray107;

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "Z")
	public boolean aBoolean473;

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
	public int anInt5456;

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
	private int anInt5457;

	@OriginalMember(owner = "client!pl", name = "i", descriptor = "I")
	public int anInt5459;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "Lclient!fk;")
	public Class3_Sub8 aClass3_Sub8_2;

	@OriginalMember(owner = "client!pl", name = "m", descriptor = "I")
	private int anInt5461;

	@OriginalMember(owner = "client!pl", name = "p", descriptor = "I")
	private int anInt5464;

	@OriginalMember(owner = "client!pl", name = "r", descriptor = "I")
	private int anInt5466;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
	private Class191() {
		if (Static436.anIntArray519 == null) {
			Static225.method3376();
		}
		this.method4289();
	}

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!qa;Lclient!cu;I)V")
	public Class191(@OriginalArg(0) Class172 arg0, @OriginalArg(1) Class3_Sub7 arg1, @OriginalArg(2) int arg2) {
		if (Static436.anIntArray519 == null) {
			Static225.method3376();
		}
		this.anInt5456 = arg1.method2582();
		this.aBoolean472 = (this.anInt5456 & 0x8) != 0;
		this.aBoolean473 = (this.anInt5456 & 0x10) != 0;
		this.anInt5456 &= 0x7;
		@Pc(44) int local44 = arg1.method2588() << arg2;
		@Pc(50) int local50 = arg1.method2588() << arg2;
		@Pc(56) int local56 = arg1.method2588() << arg2;
		@Pc(60) int local60 = arg1.method2582();
		@Pc(66) int local66 = local60 * 2 + 1;
		this.aShortArray107 = new short[local66];
		@Pc(83) int local83;
		for (@Pc(72) int local72 = 0; local72 < this.aShortArray107.length; local72++) {
			@Pc(79) short local79 = (short) arg1.method2588();
			local83 = local79 >>> 8;
			@Pc(87) int local87 = local79 & 0xFF;
			if (local66 <= local83) {
				local83 = local66 - 1;
			}
			if (local66 - local83 < local87) {
				local87 = local66 - local83;
			}
			this.aShortArray107[local72] = (short) (local83 << 8 | local87);
		}
		local60 = (local60 << Static336.anInt5747) + Static421.anInt6887;
		@Pc(144) int local144 = Static135.anIntArray174 == null ? Static300.anIntArray364[Static72.method1421(arg1.method2588()) & 0xFFFF] : Static135.anIntArray174[arg1.method2588()];
		local83 = arg1.method2582();
		this.anInt5459 = local83 & 0x1F;
		this.anInt5461 = (local83 & 0xE0) << 3;
		if (this.anInt5459 != 31) {
			this.method4289();
		}
		this.method4290(local50, local144, arg0, local56, local44, local60);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBIII)V")
	public void method4286(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		this.anInt5464 = arg0;
		this.anInt5457 = arg3;
		this.anInt5466 = arg2;
		this.anInt5455 = arg1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZII)V")
	public void method4287(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(9) int local9;
		if (arg0) {
			local9 = 2048;
		} else {
			@Pc(23) int local23 = arg1 * this.anInt5457 / 50 + this.anInt5461 & 0x7FF;
			@Pc(26) int local26 = this.anInt5464;
			if (local26 == 1) {
				local9 = (Class3_Sub2_Sub17.anIntArray289[local23 << 3] >> 5) + 1024;
			} else if (local26 == 3) {
				local9 = Static436.anIntArray519[local23] >> 1;
			} else if (local26 == 4) {
				local9 = local23 >> 10 << 11;
			} else if (local26 == 2) {
				local9 = local23;
			} else if (local26 == 5) {
				local9 = (local23 < 1024 ? local23 : 2048 - local23) << 1;
			} else {
				local9 = 2048;
			}
		}
		this.aClass3_Sub8_2.method4401((float) ((local9 * this.anInt5455 >> 11) + this.anInt5466) / 2048.0F);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)V")
	private void method4289() {
		@Pc(8) int local8 = this.anInt5459;
		if (local8 == 2) {
			this.anInt5464 = 1;
			this.anInt5457 = 2048;
			this.anInt5455 = 2048;
			this.anInt5466 = 0;
		} else if (local8 == 3) {
			this.anInt5466 = 0;
			this.anInt5457 = 4096;
			this.anInt5455 = 2048;
			this.anInt5464 = 1;
		} else if (local8 == 4) {
			this.anInt5466 = 0;
			this.anInt5457 = 2048;
			this.anInt5455 = 2048;
			this.anInt5464 = 4;
		} else if (local8 == 5) {
			this.anInt5466 = 0;
			this.anInt5464 = 4;
			this.anInt5457 = 8192;
			this.anInt5455 = 2048;
		} else if (local8 == 12) {
			this.anInt5457 = 2048;
			this.anInt5455 = 2048;
			this.anInt5464 = 2;
			this.anInt5466 = 0;
		} else if (local8 == 13) {
			this.anInt5455 = 2048;
			this.anInt5466 = 0;
			this.anInt5464 = 2;
			this.anInt5457 = 8192;
		} else if (local8 == 10) {
			this.anInt5455 = 512;
			this.anInt5457 = 2048;
			this.anInt5466 = 1536;
			this.anInt5464 = 3;
		} else if (local8 == 11) {
			this.anInt5455 = 512;
			this.anInt5466 = 1536;
			this.anInt5464 = 3;
			this.anInt5457 = 4096;
		} else if (local8 == 6) {
			this.anInt5464 = 3;
			this.anInt5455 = 768;
			this.anInt5457 = 2048;
			this.anInt5466 = 1280;
		} else if (local8 == 7) {
			this.anInt5464 = 3;
			this.anInt5455 = 768;
			this.anInt5457 = 4096;
			this.anInt5466 = 1280;
		} else if (local8 == 8) {
			this.anInt5455 = 1024;
			this.anInt5464 = 3;
			this.anInt5457 = 2048;
			this.anInt5466 = 1024;
		} else if (local8 == 9) {
			this.anInt5464 = 3;
			this.anInt5466 = 1024;
			this.anInt5455 = 1024;
			this.anInt5457 = 4096;
		} else if (local8 == 14) {
			this.anInt5455 = 768;
			this.anInt5464 = 1;
			this.anInt5457 = 2048;
			this.anInt5466 = 1280;
		} else if (local8 == 15) {
			this.anInt5464 = 1;
			this.anInt5455 = 512;
			this.anInt5466 = 1536;
			this.anInt5457 = 4096;
		} else if (local8 == 16) {
			this.anInt5464 = 1;
			this.anInt5455 = 256;
			this.anInt5457 = 8192;
			this.anInt5466 = 1792;
		} else {
			this.anInt5464 = 0;
			this.anInt5466 = 0;
			this.anInt5457 = 2048;
			this.anInt5455 = 2048;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IILclient!qa;IIII)V")
	private void method4290(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		this.aClass3_Sub8_2 = arg2.method5534(arg4, arg3, arg0, arg5, arg1, 1.0F);
	}
}
