import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ep")
public final class Class98 {

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "I")
	public int anInt2517;

	@OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
	private int anInt2524;

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
	private int anInt2525;

	@OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
	private int anInt2526;

	@OriginalMember(owner = "client!ep", name = "p", descriptor = "Lclient!tf;")
	private Class17 aClass17_17;

	@OriginalMember(owner = "client!ep", name = "q", descriptor = "I")
	private int anInt2527;

	@OriginalMember(owner = "client!ep", name = "f", descriptor = "I")
	private final int anInt2521;

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "I")
	private final int anInt2518;

	@OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
	private final int anInt2523;

	@OriginalMember(owner = "client!ep", name = "i", descriptor = "Z")
	private final boolean aBoolean180;

	@OriginalMember(owner = "client!ep", name = "e", descriptor = "I")
	private final int anInt2520;

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "I")
	private final int anInt2519;

	@OriginalMember(owner = "client!ep", name = "r", descriptor = "I")
	private final int anInt2528;

	@OriginalMember(owner = "client!ep", name = "h", descriptor = "I")
	private final int anInt2522;

	@OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(IIIIIIIZ)V")
	public Class98(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt2521 = arg2;
		this.anInt2518 = arg3;
		this.anInt2523 = arg4;
		this.aBoolean180 = arg7;
		this.anInt2520 = arg1;
		this.anInt2519 = arg6;
		this.anInt2528 = arg5;
		this.anInt2522 = arg0;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!ha;Lclient!ep;)V")
	private void method2429(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class98 arg1) {
		@Pc(6) Class334 local6 = Static111.method2111(this.anInt2520, Static539.aClass34_108);
		if (local6 == null) {
			return;
		}
		arg0.K(Static136.anIntArray164);
		arg0.KA(0, 0, this.anInt2524, this.anInt2524);
		arg0.aa(0, 0, this.anInt2524, this.anInt2524, 0, 0);
		@Pc(32) int local32 = 0;
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean180) {
				local32 = -arg1.anInt2521;
				local34 = -arg1.anInt2518;
				local36 = -arg1.anInt2523;
			} else {
				local32 = this.anInt2521 - arg1.anInt2521;
				local34 = this.anInt2518 - arg1.anInt2518;
				local36 = this.anInt2523 - arg1.anInt2523;
			}
		}
		@Pc(81) int local81;
		@Pc(85) int local85;
		@Pc(89) int local89;
		@Pc(99) int local99;
		if (this.anInt2525 != 0) {
			local81 = -this.anInt2525 & 0x3FFF;
			local85 = Class4_Sub2_Sub26.anIntArray563[local81];
			local89 = Class4_Sub2_Sub26.anIntArray562[local81];
			local99 = local34 * local89 - local36 * local85 >> 14;
			local36 = local34 * local85 + local36 * local89 >> 14;
			local34 = local99;
		}
		if (this.anInt2526 != 0) {
			local81 = -this.anInt2526 & 0x3FFF;
			local85 = Class4_Sub2_Sub26.anIntArray563[local81];
			local89 = Class4_Sub2_Sub26.anIntArray562[local81];
			local99 = local36 * local85 + local32 * local89 >> 14;
			local36 = local36 * local89 - local32 * local85 >> 14;
			local32 = local99;
		}
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local32, (float) local34, (float) local36);
		@Pc(172) Class62 local172 = arg0.method8072(local6, 2048, 0, 64, 768);
		local85 = local172.RA() - local172.V();
		local89 = local172.EA() - local172.fa();
		local99 = local172.V() + local85 / 2;
		@Pc(198) int local198 = local172.fa() + local89 / 2;
		@Pc(205) int local205 = local85 > local89 ? local85 : local89;
		arg0.DA(local99, local198, local205, local205);
		arg0.method8133(arg0.method8118());
		@Pc(218) Class92 local218 = arg0.method8078();
		local218.method3854(0, 0, arg0.i() - local172.HA());
		local172.method7332(local218, (Class3_Sub4) null, arg0.i(), 1);
		this.aClass17_17 = arg0.method8151(0, 0, this.anInt2524, this.anInt2524, true);
		this.aClass17_17.method5254(3);
		arg0.KA(Static136.anIntArray164[0], Static136.anIntArray164[1], Static136.anIntArray164[2], Static136.anIntArray164[3]);
	}

	@OriginalMember(owner = "client!ep", name = "b", descriptor = "(Lclient!ha;Lclient!ep;)V")
	private void method2430(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class98 arg1) {
		Static136.method2428(arg0);
		Static136.method2434(arg0);
		arg0.K(Static136.anIntArray164);
		arg0.KA(0, 0, this.anInt2524, this.anInt2524);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2524, this.anInt2524, this.anInt2519 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean180) {
				local31 = -arg1.anInt2521;
				local33 = -arg1.anInt2518;
				local35 = -arg1.anInt2523;
			} else {
				local31 = arg1.anInt2521 - this.anInt2521;
				local33 = arg1.anInt2518 - this.anInt2518;
				local35 = arg1.anInt2523 - this.anInt2523;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2525 != 0) {
			local79 = Class4_Sub2_Sub26.anIntArray563[this.anInt2525];
			local84 = Class4_Sub2_Sub26.anIntArray562[this.anInt2525];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt2526 != 0) {
			local79 = Class4_Sub2_Sub26.anIntArray563[this.anInt2526];
			local84 = Class4_Sub2_Sub26.anIntArray562[this.anInt2526];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class62 local147 = Static136.aClass62_1.method7329((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt2520);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2524 * 1024 / (local147.RA() - local147.V());
		if (this.anInt2519 != 0) {
			local84 = local84 * 13 / 16;
		}
		arg0.DA(this.anInt2524 / 2, this.anInt2524 / 2, local84, local84);
		arg0.method8133(arg0.method8118());
		@Pc(206) Class92 local206 = arg0.method8118();
		local206.method3854(0, 0, arg0.i() - local147.HA());
		local147.method7332(local206, (Class3_Sub4) null, 1024, 1);
		@Pc(228) int local228 = this.anInt2524 * 13 / 16;
		@Pc(235) int local235 = (this.anInt2524 - local228) / 2;
		Static136.aClass17_16.method5259(local235, local235, local228, local228, 0, this.anInt2519 | 0xFF000000, 1);
		this.aClass17_17 = arg0.method8151(0, 0, this.anInt2524, this.anInt2524, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2524, this.anInt2524, 0, 0);
		Static136.aClass17_15.method5259(0, 0, this.anInt2524, this.anInt2524, 1, 0, 0);
		this.aClass17_17.method5254(0);
		arg0.KA(Static136.anIntArray164[0], Static136.anIntArray164[1], Static136.anIntArray164[2], Static136.anIntArray164[3]);
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "(Lclient!ha;Lclient!ep;)Z")
	public boolean method2432(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class98 arg1) {
		return this.aClass17_17 != null || this.method2435(arg0, arg1);
	}

	@OriginalMember(owner = "client!ep", name = "d", descriptor = "(Lclient!ha;Lclient!ep;)Z")
	private boolean method2435(@OriginalArg(0) Class33 arg0, @OriginalArg(1) Class98 arg1) {
		if (this.aClass17_17 == null) {
			if (this.anInt2522 == 0) {
				if (Static195.anInterface9_5.method1557(this.anInt2520)) {
					@Pc(23) int[] local23 = Static195.anInterface9_5.method1559(this.anInt2520, this.anInt2524, this.anInt2524, 0.7F);
					this.aClass17_17 = arg0.method8128(local23, this.anInt2524, this.anInt2524, this.anInt2524);
				}
			} else if (this.anInt2522 == 2) {
				this.method2429(arg0, arg1);
			} else if (this.anInt2522 == 1) {
				this.method2430(arg0, arg1);
			}
		}
		return this.aClass17_17 != null;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lclient!ha;IIIIII)V")
	public void method2436(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (this.aClass17_17 == null) {
			return;
		}
		@Pc(10) int local10 = this.anInt2525 - arg5 & 0x3FFF;
		@Pc(17) int local17 = this.anInt2526 - arg6 & 0x3FFF;
		if (local17 > 8192) {
			local17 -= 16384;
		}
		if (local10 > 8192) {
			local10 -= 16384;
		}
		@Pc(38) int local38 = local10 * arg4 / 4096 + (arg4 - this.anInt2527) / 2;
		@Pc(51) int local51 = local17 * arg4 / -4096 + (arg3 - this.anInt2527) / 2;
		if (local38 < arg4 && local38 + this.anInt2527 > 0 && local51 < arg3 && local51 + this.anInt2527 > 0) {
			this.aClass17_17.method5245(local51 + arg1, local38 + arg2, this.anInt2527, this.anInt2527);
		}
	}

	@OriginalMember(owner = "client!ep", name = "c", descriptor = "()V")
	public void method2437() {
		this.aClass17_17 = null;
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIII)Z")
	public boolean method2438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean180) {
			this.anInt2517 = 1073741823;
			local7 = this.anInt2521;
			local12 = this.anInt2518;
			local17 = this.anInt2523;
		} else {
			local7 = this.anInt2521 - arg0;
			local12 = this.anInt2518 - arg1;
			local17 = this.anInt2523 - arg2;
			this.anInt2517 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2517 == 0) {
				this.anInt2517 = 1;
			}
			local7 = (local7 << 8) / this.anInt2517;
			local12 = (local12 << 8) / this.anInt2517;
			local17 = (local17 << 8) / this.anInt2517;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2527 = this.anInt2528 * arg3 / (this.aBoolean180 ? 1024 : this.anInt2517);
		} else {
			this.anInt2527 = 0;
		}
		if (this.anInt2527 < 8) {
			this.aClass17_17 = null;
			return false;
		}
		@Pc(143) int local143 = Static162.method2593(this.anInt2527);
		if (local143 > arg3) {
			local143 = Static125.method2245(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2524) {
			this.anInt2524 = local143;
		}
		this.anInt2525 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt2526 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass17_17 = null;
		return true;
	}
}
