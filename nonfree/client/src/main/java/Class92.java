import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class92 {

	@OriginalMember(owner = "client!dw", name = "e", descriptor = "Lclient!pu;")
	private Class50 aClass50_7;

	@OriginalMember(owner = "client!dw", name = "f", descriptor = "I")
	private int anInt2504;

	@OriginalMember(owner = "client!dw", name = "i", descriptor = "I")
	private int anInt2507;

	@OriginalMember(owner = "client!dw", name = "l", descriptor = "I")
	private int anInt2510;

	@OriginalMember(owner = "client!dw", name = "o", descriptor = "I")
	private int anInt2512;

	@OriginalMember(owner = "client!dw", name = "p", descriptor = "I")
	public int anInt2513;

	@OriginalMember(owner = "client!dw", name = "m", descriptor = "I")
	private final int anInt2511;

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "I")
	private final int anInt2503;

	@OriginalMember(owner = "client!dw", name = "g", descriptor = "I")
	private final int anInt2505;

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "Z")
	private final boolean aBoolean229;

	@OriginalMember(owner = "client!dw", name = "q", descriptor = "I")
	private final int anInt2514;

	@OriginalMember(owner = "client!dw", name = "j", descriptor = "I")
	private final int anInt2508;

	@OriginalMember(owner = "client!dw", name = "h", descriptor = "I")
	private final int anInt2506;

	@OriginalMember(owner = "client!dw", name = "k", descriptor = "I")
	private final int anInt2509;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class92(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2511 = arg2;
		this.anInt2503 = arg3;
		this.anInt2505 = arg4;
		this.aBoolean229 = arg7;
		this.anInt2514 = arg1;
		this.anInt2508 = arg6;
		this.anInt2506 = arg5;
		this.anInt2509 = arg0;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIII)Z")
	public boolean method2245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean229) {
			this.anInt2513 = 1073741823;
			local7 = this.anInt2511;
			local12 = this.anInt2503;
			local17 = this.anInt2505;
		} else {
			local7 = this.anInt2511 - arg0;
			local12 = this.anInt2503 - arg1;
			local17 = this.anInt2505 - arg2;
			this.anInt2513 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2513 == 0) {
				this.anInt2513 = 1;
			}
			local7 = (local7 << 8) / this.anInt2513;
			local12 = (local12 << 8) / this.anInt2513;
			local17 = (local17 << 8) / this.anInt2513;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2512 = this.anInt2506 * arg3 / (this.aBoolean229 ? 1024 : this.anInt2513);
		} else {
			this.anInt2512 = 0;
		}
		if (this.anInt2512 < 8) {
			this.aClass50_7 = null;
			return false;
		}
		@Pc(143) int local143 = Static67.method917(this.anInt2512);
		if (local143 > arg3) {
			local143 = Static180.method2993(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2510) {
			this.anInt2510 = local143;
		}
		this.anInt2504 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt2507 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass50_7 = null;
		return true;
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ha;Lclient!dw;)V")
	private void method2248(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class92 arg1) {
		@Pc(6) Class329 local6 = Static347.method5290(this.anInt2514, Static469.aClass390_89);
		if (local6 == null) {
			return;
		}
		arg0.K(Static124.anIntArray87);
		arg0.KA(0, 0, this.anInt2510, this.anInt2510);
		arg0.aa(0, 0, this.anInt2510, this.anInt2510, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean229) {
				local32 = -arg1.anInt2511;
				local34 = -arg1.anInt2503;
				local36 = -arg1.anInt2505;
			} else {
				local32 = this.anInt2511 - arg1.anInt2511;
				local34 = this.anInt2503 - arg1.anInt2503;
				local36 = this.anInt2505 - arg1.anInt2505;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2504 != 0) {
			local81 = -this.anInt2504 & 0x3FFF;
			local85 = Class200.anIntArray337[local81];
			local89 = Class200.anIntArray338[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt2507 != 0) {
			local81 = -this.anInt2507 & 0x3FFF;
			local85 = Class200.anIntArray337[local81];
			local89 = Class200.anIntArray338[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class153 local172 = arg0.method6964(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method6891(arg0.method6955());
		@Pc(218) Class254 local218 = arg0.method6903();
		local218.method7361(0, 0, arg0.i() - local172.HA());
		local172.method8594(local218, (Class28_Sub9) null, arg0.i(), 1);
		this.aClass50_7 = arg0.method6936(0, 0, this.anInt2510, this.anInt2510, true);
		this.aClass50_7.method6000(3);
		arg0.KA(Static124.anIntArray87[0], Static124.anIntArray87[1], Static124.anIntArray87[2], Static124.anIntArray87[3]);
	}

	@OriginalMember(owner = "client!dw", name = "b", descriptor = "(Lclient!ha;Lclient!dw;)V")
	private void method2250(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class92 arg1) {
		Static124.method2249(arg0);
		Static124.method2255(arg0);
		arg0.K(Static124.anIntArray87);
		arg0.KA(0, 0, this.anInt2510, this.anInt2510);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2510, this.anInt2510, this.anInt2508 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean229) {
				local31 = -arg1.anInt2511;
				local33 = -arg1.anInt2503;
				local35 = -arg1.anInt2505;
			} else {
				local31 = arg1.anInt2511 - this.anInt2511;
				local33 = arg1.anInt2503 - this.anInt2503;
				local35 = arg1.anInt2505 - this.anInt2505;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2504 != 0) {
			local79 = Class200.anIntArray337[this.anInt2504];
			local84 = Class200.anIntArray338[this.anInt2504];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt2507 != 0) {
			local79 = Class200.anIntArray337[this.anInt2507];
			local84 = Class200.anIntArray338[this.anInt2507];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class153 local147 = Static124.aClass153_1.method8580((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt2514);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2510 * 1024 / (local147.RA() - local147.V());
		if (this.anInt2508 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt2510 / 2, this.anInt2510 / 2, local84, local84);
		arg0.method6891(arg0.method6955());
		@Pc(206) Class254 local206 = arg0.method6955();
		local206.method7361(0, 0, arg0.i() - local147.HA());
		local147.method8594(local206, (Class28_Sub9) null, 1024, 1);
		@Pc(228) int local228 = this.anInt2510 * 13 / 16;
		@Pc(235) int local235 = (this.anInt2510 - local228) / 2;
		Static124.aClass50_6.method5991(local235, local235, local228, local228, 0, this.anInt2508 | 0xFF000000, 1);
		this.aClass50_7 = arg0.method6936(0, 0, this.anInt2510, this.anInt2510, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2510, this.anInt2510, 0, 0);
		Static124.aClass50_8.method5991(0, 0, this.anInt2510, this.anInt2510, 1, 0, 0);
		this.aClass50_7.method6000(0);
		arg0.KA(Static124.anIntArray87[0], Static124.anIntArray87[1], Static124.anIntArray87[2], Static124.anIntArray87[3]);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method2251(@OriginalArg(0) Class65 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass50_7 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2504 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2507 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2512) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2512) / 2;
		if (local38 < arg4 && local38 + this.anInt2512 > 0 && local51 < arg3 && local51 + this.anInt2512 > 0) {
			this.aClass50_7.method6008(local51 + arg1, local38 + arg2, this.anInt2512, this.anInt2512);
		}
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "(Lclient!ha;Lclient!dw;)Z")
	public boolean method2252(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class92 arg1) {
		return this.aClass50_7 != null || this.method2254(arg0, arg1);
	}

	@OriginalMember(owner = "client!dw", name = "c", descriptor = "()V")
	public void method2253() {
		this.aClass50_7 = null;
	}

	@OriginalMember(owner = "client!dw", name = "d", descriptor = "(Lclient!ha;Lclient!dw;)Z")
	private boolean method2254(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Class92 arg1) {
		if (this.aClass50_7 == null) {
			if (this.anInt2509 == 0) {
				if (Static176.anInterface4_5.method359(this.anInt2514)) {
					@Pc(23) int[] local23 = Static176.anInterface4_5.method360(this.anInt2510, this.anInt2510, this.anInt2514, 0.7F);
					this.aClass50_7 = arg0.method6952(this.anInt2510, this.anInt2510, local23, this.anInt2510);
				}
			} else if (this.anInt2509 == 2) {
				this.method2248(arg0, arg1);
			} else if (this.anInt2509 == 1) {
				this.method2250(arg0, arg1);
			}
		}
		return this.aClass50_7 != null;
	}
}
