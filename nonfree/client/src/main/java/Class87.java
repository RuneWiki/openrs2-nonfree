import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public final class Class87 {

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "Lclient!bka;")
	private Class9 aClass9_3;

	@OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
	private int anInt2518;

	@OriginalMember(owner = "client!eca", name = "h", descriptor = "I")
	private int anInt2519;

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "I")
	private int anInt2520;

	@OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
	private int anInt2529;

	@OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
	public int anInt2531;

	@OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
	private final int anInt2523;

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
	private final int anInt2528;

	@OriginalMember(owner = "client!eca", name = "u", descriptor = "I")
	private final int anInt2522;

	@OriginalMember(owner = "client!eca", name = "p", descriptor = "Z")
	private final boolean aBoolean209;

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
	private final int anInt2527;

	@OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
	private final int anInt2525;

	@OriginalMember(owner = "client!eca", name = "t", descriptor = "I")
	private final int anInt2521;

	@OriginalMember(owner = "client!eca", name = "g", descriptor = "I")
	private final int anInt2530;

	@OriginalMember(owner = "client!eca", name = "s", descriptor = "I")
	private final int anInt2526;

	@OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
	private final int anInt2524;

	@OriginalMember(owner = "client!eca", name = "f", descriptor = "I")
	private final int anInt2532;

	@OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(IIIIIIIZIII)V")
	public Class87(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		this.anInt2523 = arg2;
		this.anInt2528 = arg3;
		this.anInt2522 = arg4;
		this.aBoolean209 = arg7;
		this.anInt2527 = arg1;
		this.anInt2525 = arg6;
		this.anInt2521 = arg5;
		this.anInt2530 = arg0;
		this.anInt2526 = arg8;
		this.anInt2524 = arg9;
		this.anInt2532 = arg10;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!ha;IIIIIIIIII)V")
	public void method2230(@OriginalArg(0) Class67 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		if (this.aClass9_3 == null) {
			return;
		}
		@Pc(6) int[] local6 = new int[3];
		@Pc(14) int local14 = -(this.anInt2523 - arg7 << 16);
		@Pc(21) int local21 = this.anInt2528 - arg8 << 15;
		@Pc(29) int local29 = -(this.anInt2522 - arg9 << 16);
		@Pc(32) Class181 local32 = arg0.method7683();
		local32.method6360(0, 0, 0, local6);
		@Pc(44) int local44 = local14 + local6[0];
		@Pc(50) int local50 = local21 + local6[1];
		@Pc(56) int local56 = local29 + local6[2];
		arg0.H(local44, local50, local56, local6);
		if (local6[2] < 0) {
			return;
		}
		@Pc(75) int local75 = local6[0] - this.anInt2520 / 2;
		@Pc(84) int local84 = local6[1] - this.anInt2520 / 2;
		if (local84 < arg4 && local84 + this.anInt2520 > 0 && local75 < arg3 && local75 + this.anInt2520 > 0) {
			this.aClass9_3.method8604(local75, local84, this.anInt2520, this.anInt2520, 0, arg10 << 24 | 0xFFFFFF, 1);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!ha;Lclient!eca;)V")
	private void method2231(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class87 arg1) {
		Static136.method2232(arg0);
		Static136.method2239(arg0);
		arg0.K(Static136.anIntArray123);
		arg0.KA(0, 0, this.anInt2529, this.anInt2529);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2529, this.anInt2529, this.anInt2525 | 0xFF000000, 0);
		@Pc(31) int local31 = 0;
		@Pc(33) int local33 = 0;
		@Pc(35) int local35 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean209) {
				local31 = -arg1.anInt2523;
				local33 = -arg1.anInt2528;
				local35 = -arg1.anInt2522;
			} else {
				local31 = arg1.anInt2523 - this.anInt2523;
				local33 = arg1.anInt2528 - this.anInt2528;
				local35 = arg1.anInt2522 - this.anInt2522;
			}
		}
		@Pc(79) int local79;
		@Pc(84) int local84;
		@Pc(94) int local94;
		if (this.anInt2519 != 0) {
			local79 = Class3_Sub2_Sub21.anIntArray358[this.anInt2519];
			local84 = Class3_Sub2_Sub21.anIntArray356[this.anInt2519];
			local94 = local33 * local84 - local35 * local79 >> 14;
			local35 = local33 * local79 + local35 * local84 >> 14;
			local33 = local94;
		}
		if (this.anInt2518 != 0) {
			local79 = Class3_Sub2_Sub21.anIntArray358[this.anInt2518];
			local84 = Class3_Sub2_Sub21.anIntArray356[this.anInt2518];
			local94 = local35 * local79 + local31 * local84 >> 14;
			local35 = local35 * local84 - local31 * local79 >> 14;
			local31 = local94;
		}
		@Pc(147) Class157 local147 = Static136.aClass157_1.method5211((byte) 0, 51200, true);
		local147.aa((short) 0, (short) this.anInt2527);
		arg0.xa(1.0F);
		arg0.ZA(16777215, 1.0F, 1.0F, (float) local31, (float) local33, (float) local35);
		local84 = this.anInt2529 * 1024 / (local147.RA() - local147.V());
		if (this.anInt2525 != 0) {
			local84 = local84 * 13 / 16;
		}
		@Pc(190) int[] local190 = arg0.Y();
		arg0.DA(this.anInt2529 / 2, this.anInt2529 / 2, local84, local84);
		arg0.method7642(arg0.method7646());
		@Pc(209) Class181 local209 = arg0.method7646();
		local209.method6356(0, 0, arg0.i() - local147.HA());
		local147.method5227(local209, (Class19_Sub6) null, 1024, 1);
		@Pc(231) int local231 = this.anInt2529 * 13 / 16;
		@Pc(238) int local238 = (this.anInt2529 - local231) / 2;
		Static136.aClass9_5.method8604(local238, local238, local231, local231, 0, this.anInt2525 | 0xFF000000, 1);
		this.aClass9_3 = arg0.method7664(0, 0, this.anInt2529, this.anInt2529, true);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2529, this.anInt2529, 0, 0);
		Static136.aClass9_4.method8604(0, 0, this.anInt2529, this.anInt2529, 1, 0, 0);
		this.aClass9_3.method8605();
		arg0.DA(local190[0], local190[1], local190[2], local190[3]);
		arg0.KA(Static136.anIntArray123[0], Static136.anIntArray123[1], Static136.anIntArray123[2], Static136.anIntArray123[3]);
	}

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "(Lclient!ha;Lclient!eca;)Z")
	private boolean method2233(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class87 arg1) {
		if (this.aClass9_3 == null) {
			if (this.anInt2530 == 0) {
				if (Static105.anInterface2_1.method1024(this.anInt2527)) {
					@Pc(23) int[] local23 = Static105.anInterface2_1.method1026(0.7F, this.anInt2529, this.anInt2529, this.anInt2527);
					this.aClass9_3 = arg0.method7688(local23, this.anInt2529, this.anInt2529, this.anInt2529);
				}
			} else if (this.anInt2530 == 2) {
				this.method2235(arg0, arg1);
			} else if (this.anInt2530 == 1) {
				this.method2231(arg0, arg1);
			}
		}
		return this.aClass9_3 != null;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(Lclient!ha;Lclient!eca;)V")
	private void method2235(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class87 arg1) {
		@Pc(6) Class178 local6 = Static542.method7606(Static301.aClass221_88, 0, true, this.anInt2527);
		if (local6 == null) {
			return;
		}
		arg0.K(Static136.anIntArray123);
		arg0.KA(0, 0, this.anInt2529, this.anInt2529);
		arg0.ya();
		arg0.aa(0, 0, this.anInt2529, this.anInt2529, 0, 0);
		@Pc(34) int local34 = 0;
		@Pc(36) int local36 = 0;
		@Pc(38) int local38 = 256;
		if (arg1 != null) {
			if (arg1.aBoolean209) {
				local34 = -arg1.anInt2523;
				local36 = -arg1.anInt2528;
				local38 = -arg1.anInt2522;
			} else {
				local34 = this.anInt2523 - arg1.anInt2523;
				local36 = this.anInt2528 - arg1.anInt2528;
				local38 = this.anInt2522 - arg1.anInt2522;
			}
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(91) int local91;
		@Pc(101) int local101;
		if (this.anInt2519 != 0) {
			local83 = -this.anInt2519 & 0x3FFF;
			local87 = Class3_Sub2_Sub21.anIntArray358[local83];
			local91 = Class3_Sub2_Sub21.anIntArray356[local83];
			local101 = local36 * local91 - local38 * local87 >> 14;
			local38 = local36 * local87 + local38 * local91 >> 14;
			local36 = local101;
		}
		if (this.anInt2518 != 0) {
			local83 = -this.anInt2518 & 0x3FFF;
			local87 = Class3_Sub2_Sub21.anIntArray358[local83];
			local91 = Class3_Sub2_Sub21.anIntArray356[local83];
			local101 = local38 * local87 + local34 * local91 >> 14;
			local38 = local38 * local91 - local34 * local87 >> 14;
			local34 = local101;
		}
		arg0.xa(1.0F);
		arg0.ZA(this.anInt2525, 1.0F, 1.0F, (float) local34, (float) local36, (float) local38);
		local6.method4276(this.anInt2532 & 0x3FFF, this.anInt2526 & 0x3FFF, this.anInt2524 & 0x3FFF);
		@Pc(190) Class157 local190 = arg0.method7653(local6, 2048, 0, 64, 768);
		local87 = local190.RA() - local190.V();
		local91 = local190.EA() - local190.fa();
		local101 = local87 > local91 ? local87 : local91;
		@Pc(216) int local216 = this.anInt2529 * 1024 / local101;
		@Pc(219) int[] local219 = arg0.Y();
		arg0.DA(this.anInt2529 / 2, this.anInt2529 / 2, local216, local216);
		arg0.method7642(arg0.method7646());
		@Pc(238) Class181 local238 = arg0.method7693();
		local238.method6356(0, 0, arg0.i() - local190.HA());
		local190.method5227(local238, (Class19_Sub6) null, arg0.i(), 1);
		this.aClass9_3 = arg0.method7664(0, 0, this.anInt2529, this.anInt2529, true);
		this.aClass9_3.method8605();
		arg0.DA(local219[0], local219[1], local219[2], local219[3]);
		arg0.KA(Static136.anIntArray123[0], Static136.anIntArray123[1], Static136.anIntArray123[2], Static136.anIntArray123[3]);
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIII)Z")
	public boolean method2236(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7;
		@Pc(12) int local12;
		@Pc(17) int local17;
		if (this.aBoolean209) {
			this.anInt2531 = 1073741823;
			local7 = this.anInt2523;
			local12 = this.anInt2528;
			local17 = this.anInt2522;
		} else {
			local7 = this.anInt2523 - arg0;
			local12 = this.anInt2528 - arg1;
			local17 = this.anInt2522 - arg2;
			this.anInt2531 = (int) Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17));
			if (this.anInt2531 == 0) {
				this.anInt2531 = 1;
			}
			local7 = (local7 << 8) / this.anInt2531;
			local12 = (local12 << 8) / this.anInt2531;
			local17 = (local17 << 8) / this.anInt2531;
		}
		@Pc(90) int local90 = (int) (Math.sqrt((double) (local7 * local7 + local12 * local12 + local17 * local17)) * 256.0D);
		if (local90 > 128) {
			local7 = (local7 << 16) / local90;
			local12 = (local12 << 16) / local90;
			local17 = (local17 << 16) / local90;
			this.anInt2520 = this.anInt2521 * arg3 / (this.aBoolean209 ? 1024 : this.anInt2531);
		} else {
			this.anInt2520 = 0;
		}
		if (this.anInt2520 < 8) {
			this.aClass9_3 = null;
			return false;
		}
		@Pc(143) int local143 = Static60.method735(this.anInt2520);
		if (local143 > arg3) {
			local143 = Static487.method7093(arg3);
		}
		if (local143 > 512) {
			local143 = 512;
		}
		if (local143 != this.anInt2529) {
			this.anInt2529 = local143;
		}
		this.anInt2519 = (int) (Math.asin((double) ((float) local12 / 256.0F)) * 2607.5945876176133D) & 0x3FFF;
		this.anInt2518 = (int) (Math.atan2((double) local7, (double) -local17) * 2607.5945876176133D) & 0x3FFF;
		this.aClass9_3 = null;
		return true;
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(Lclient!ha;Lclient!eca;)Z")
	public boolean method2237(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class87 arg1) {
		return this.aClass9_3 != null || this.method2233(arg0, arg1);
	}
}
