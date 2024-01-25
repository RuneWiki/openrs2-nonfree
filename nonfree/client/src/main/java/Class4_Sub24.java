import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class4_Sub24 extends Class4 {

	@OriginalMember(owner = "client!iu", name = "t", descriptor = "I")
	private int anInt3408;

	@OriginalMember(owner = "client!iu", name = "x", descriptor = "I")
	private int anInt3410;

	@OriginalMember(owner = "client!iu", name = "y", descriptor = "Lclient!fd;")
	private final Class19_Sub2 aClass19_Sub2_22;

	@OriginalMember(owner = "client!iu", name = "I", descriptor = "Lclient!oq;")
	private final Class65_Sub2 aClass65_Sub2_2;

	@OriginalMember(owner = "client!iu", name = "J", descriptor = "Lclient!vp;")
	private final Class4_Sub21 aClass4_Sub21_1;

	@OriginalMember(owner = "client!iu", name = "p", descriptor = "I")
	private final int anInt3406;

	@OriginalMember(owner = "client!iu", name = "A", descriptor = "I")
	private final int anInt3412;

	@OriginalMember(owner = "client!iu", name = "H", descriptor = "I")
	private final int anInt3415;

	@OriginalMember(owner = "client!iu", name = "w", descriptor = "I")
	private final int anInt3409;

	@OriginalMember(owner = "client!iu", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!iu", name = "v", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!iu", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!iu", name = "r", descriptor = "Lclient!iv;")
	private Class4_Sub12 aClass4_Sub12_3;

	@OriginalMember(owner = "client!iu", name = "C", descriptor = "Lclient!hk;")
	private Class4_Sub12_Sub2 aClass4_Sub12_Sub2_2;

	@OriginalMember(owner = "client!iu", name = "E", descriptor = "Lclient!ib;")
	private Class102 aClass102_17;

	@OriginalMember(owner = "client!iu", name = "u", descriptor = "Lclient!bk;")
	private final Interface1 anInterface1_3;

	@OriginalMember(owner = "client!iu", name = "l", descriptor = "Lclient!vd;")
	private final Interface11 anInterface11_5;

	@OriginalMember(owner = "client!iu", name = "F", descriptor = "Lclient!pc;")
	private final Class177 aClass177_12;

	@OriginalMember(owner = "client!iu", name = "D", descriptor = "Lclient!pc;")
	private final Class177 aClass177_11;

	static {
		new Class83(" days.", " Tage.", " jours.", " dias.");
	}

	@OriginalMember(owner = "client!iu", name = "<init>", descriptor = "(Lclient!fd;Lclient!oq;Lclient!vp;[I)V")
	public Class4_Sub24(@OriginalArg(0) Class19_Sub2 arg0, @OriginalArg(1) Class65_Sub2 arg1, @OriginalArg(2) Class4_Sub21 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass19_Sub2_22 = arg0;
		this.aClass65_Sub2_2 = arg1;
		this.aClass4_Sub21_1 = arg2;
		@Pc(22) int local22 = this.aClass4_Sub21_1.method3165() - (arg1.anInt5261 >> 1);
		this.anInt3406 = this.aClass4_Sub21_1.method3160() - local22 >> arg1.anInt5256;
		this.anInt3412 = this.aClass4_Sub21_1.method3160() + local22 >> arg1.anInt5256;
		this.anInt3415 = this.aClass4_Sub21_1.method3164() - local22 >> arg1.anInt5256;
		this.anInt3409 = this.aClass4_Sub21_1.method3164() + local22 >> arg1.anInt5256;
		@Pc(78) int local78 = this.anInt3412 + 1 - this.anInt3406;
		@Pc(87) int local87 = this.anInt3409 + 1 - this.anInt3415;
		this.aFloatArrayArray3 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray4 = new float[local78 + 1][local87 + 1];
		this.aFloatArrayArray2 = new float[local78 + 1][local87 + 1];
		@Pc(123) int local123;
		@Pc(141) int local141;
		@Pc(148) int local148;
		@Pc(178) int local178;
		@Pc(193) int local193;
		for (@Pc(116) int local116 = 0; local116 <= local87; local116++) {
			local123 = this.anInt3415 + local116;
			if (local123 > 0 && this.aClass65_Sub2_2.anInt5258 - 1 > local123) {
				for (local141 = 0; local141 <= local78; local141++) {
					local148 = this.anInt3406 + local141;
					if (local148 > 0 && local148 < this.aClass65_Sub2_2.anInt5262 - 1) {
						local178 = arg1.l(local148 + 1, local123) - arg1.l(local148 - 1, local123);
						local193 = arg1.l(local148, local123 + 1) - arg1.l(local148, local123 - 1);
						@Pc(208) float local208 = (float) (1.0D / Math.sqrt((double) (local178 * local178 + local193 * local193 + 65536)));
						this.aFloatArrayArray2[local141][local116] = local208 * (float) local178;
						this.aFloatArrayArray3[local141][local116] = -256.0F * local208;
						this.aFloatArrayArray4[local141][local116] = (float) local193 * local208;
					}
				}
			}
		}
		local123 = 0;
		local141 = 0;
		for (local148 = this.anInt3415; local148 <= this.anInt3409; local148++) {
			if (local148 >= 0 && arg1.anInt5258 > local148) {
				for (local178 = this.anInt3406; local178 <= this.anInt3412; local178++) {
					if (local178 >= 0 && local178 < arg1.anInt5262) {
						local193 = arg3[local141];
						@Pc(293) int[] local293 = arg1.anIntArrayArrayArray6[local178][local148];
						if (local293 != null && local193 != 0) {
							if (local193 == 1) {
								local123 += local293.length;
							} else {
								local123 += 3;
							}
						}
					}
					local141++;
				}
			} else {
				local141 += this.anInt3412 - this.anInt3406;
			}
		}
		if (local123 > 0) {
			this.aClass4_Sub12_3 = new Class4_Sub12(local123 * 2);
			this.aClass4_Sub12_Sub2_2 = new Class4_Sub12_Sub2(local123 * 16);
			this.aClass102_17 = new Class102(Static370.method4949(local123));
			local178 = 0;
			local141 = 0;
			for (local193 = this.anInt3415; local193 <= this.anInt3409; local193++) {
				if (local193 >= 0 && local193 < arg1.anInt5258) {
					@Pc(402) int local402 = 0;
					for (@Pc(405) int local405 = this.anInt3406; local405 <= this.anInt3412; local405++) {
						if (local405 >= 0 && arg1.anInt5262 > local405) {
							@Pc(421) int local421 = arg3[local141];
							@Pc(428) int[] local428 = arg1.anIntArrayArrayArray6[local405][local193];
							@Pc(435) int[] local435 = arg1.anIntArrayArrayArray7[local405][local193];
							if (local428 != null && local421 != 0) {
								if (local421 == 1) {
									for (@Pc(591) int local591 = 0; local591 < local428.length; local591++) {
										this.method2839(local428[local591], local435[local591], local178, local402, local193, local405);
									}
								} else if (local421 == 3) {
									this.method2839(0, 0, local178, local402, local193, local405);
									this.method2839(arg1.anInt5261, 0, local178, local402, local193, local405);
									this.method2839(0, arg1.anInt5261, local178, local402, local193, local405);
								} else if (local421 == 2) {
									this.method2839(arg1.anInt5261, 0, local178, local402, local193, local405);
									this.method2839(arg1.anInt5261, arg1.anInt5261, local178, local402, local193, local405);
									this.method2839(0, 0, local178, local402, local193, local405);
								} else if (local421 == 5) {
									this.method2839(arg1.anInt5261, arg1.anInt5261, local178, local402, local193, local405);
									this.method2839(0, arg1.anInt5261, local178, local402, local193, local405);
									this.method2839(arg1.anInt5261, 0, local178, local402, local193, local405);
								} else if (local421 == 4) {
									this.method2839(0, arg1.anInt5261, local178, local402, local193, local405);
									this.method2839(0, 0, local178, local402, local193, local405);
									this.method2839(arg1.anInt5261, arg1.anInt5261, local178, local402, local193, local405);
								}
							}
						}
						local141++;
						local402++;
					}
				} else {
					local141 += this.anInt3412 - this.anInt3406;
				}
				local178++;
			}
			this.anInterface1_3 = this.aClass19_Sub2_22.method1955(this.aClass4_Sub12_3.anInt2997, false, this.aClass4_Sub12_3.aByteArray36);
			this.anInterface11_5 = this.aClass19_Sub2_22.method1960(this.aClass4_Sub12_Sub2_2.anInt2997, this.aClass4_Sub12_Sub2_2.aByteArray36, false, 16);
			this.aClass177_12 = new Class177(this.anInterface11_5, 5126, 3, 0);
			this.aClass177_11 = new Class177(this.anInterface11_5, 5121, 4, 12);
		} else {
			this.aClass177_11 = null;
			this.anInterface11_5 = null;
			this.anInterface1_3 = null;
			this.aClass177_12 = null;
		}
		this.aClass102_17 = null;
		this.aFloatArrayArray2 = this.aFloatArrayArray3 = this.aFloatArrayArray4 = null;
		this.aClass4_Sub12_3 = null;
		this.aClass4_Sub12_Sub2_2 = null;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIII)V")
	private void method2839(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(21) int local21 = (arg5 << this.aClass65_Sub2_2.anInt5256) + arg0;
		@Pc(29) int local29 = (arg4 << this.aClass65_Sub2_2.anInt5256) + arg1;
		@Pc(35) int local35 = this.aClass65_Sub2_2.a(local21, local29);
		if ((arg0 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local21 & 0xFFFFL | (long) local29 << 16 & 0xFFFFL << 16;
			@Pc(66) Class4 local66 = this.aClass102_17.method2700(local7);
			if (local66 != null) {
				this.method2840(((Class4_Sub31) local66).aShort62);
				return;
			}
		}
		@Pc(84) short local84 = (short) this.anInt3410++;
		if (local7 != -1L) {
			this.aClass102_17.method2703(local7, new Class4_Sub31(local84));
		}
		@Pc(313) float local313;
		@Pc(287) float local287;
		@Pc(322) float local322;
		@Pc(141) float local141;
		@Pc(149) float local149;
		@Pc(156) float local156;
		@Pc(163) float local163;
		@Pc(170) float local170;
		@Pc(179) float local179;
		@Pc(188) float local188;
		@Pc(230) float local230;
		if (arg0 == 0 && arg1 == 0) {
			local313 = this.aFloatArrayArray2[arg3][arg2];
			local287 = this.aFloatArrayArray3[arg3][arg2];
			local322 = this.aFloatArrayArray4[arg3][arg2];
		} else if (arg0 == this.aClass65_Sub2_2.anInt5261 && arg1 == 0) {
			local322 = this.aFloatArrayArray4[arg3 + 1][arg2];
			local287 = this.aFloatArrayArray3[arg3 + 1][arg2];
			local313 = this.aFloatArrayArray2[arg3 + 1][arg2];
		} else if (arg0 == this.aClass65_Sub2_2.anInt5261 && this.aClass65_Sub2_2.anInt5261 == arg1) {
			local322 = this.aFloatArrayArray4[arg3 + 1][arg2 + 1];
			local287 = this.aFloatArrayArray3[arg3 + 1][arg2 + 1];
			local313 = this.aFloatArrayArray2[arg3 + 1][arg2 + 1];
		} else if (arg0 == 0 && this.aClass65_Sub2_2.anInt5261 == arg1) {
			local313 = this.aFloatArrayArray2[arg3][arg2 + 1];
			local287 = this.aFloatArrayArray3[arg3][arg2 + 1];
			local322 = this.aFloatArrayArray4[arg3][arg2 + 1];
		} else {
			local141 = (float) arg0 / (float) this.aClass65_Sub2_2.anInt5261;
			local149 = (float) arg1 / (float) this.aClass65_Sub2_2.anInt5261;
			local156 = this.aFloatArrayArray2[arg3][arg2];
			local163 = this.aFloatArrayArray3[arg3][arg2];
			local170 = this.aFloatArrayArray4[arg3][arg2];
			local179 = this.aFloatArrayArray2[arg3 + 1][arg2];
			local188 = this.aFloatArrayArray3[arg3 + 1][arg2];
			@Pc(206) float local206 = local188 + (this.aFloatArrayArray3[arg3 + 1][arg2 + 1] - local188) * local141;
			@Pc(221) float local221 = local170 + (this.aFloatArrayArray4[arg3][arg2 + 1] - local170) * local141;
			local230 = this.aFloatArrayArray4[arg3 + 1][arg2];
			@Pc(248) float local248 = local179 + (this.aFloatArrayArray2[arg3 + 1][arg2 + 1] - local179) * local141;
			@Pc(263) float local263 = local156 + (this.aFloatArrayArray2[arg3][arg2 + 1] - local156) * local141;
			@Pc(279) float local279 = local163 + (this.aFloatArrayArray3[arg3][arg2 + 1] - local163) * local141;
			local287 = local149 * (local206 - local279) + local279;
			@Pc(305) float local305 = local230 + (this.aFloatArrayArray4[arg3 + 1][arg2 + 1] - local230) * local141;
			local313 = local149 * (local248 - local263) + local263;
			local322 = local221 + local149 * (local305 - local221);
		}
		local141 = this.aClass4_Sub21_1.method3160() - local21;
		local149 = this.aClass4_Sub21_1.method3161() - local35;
		local156 = this.aClass4_Sub21_1.method3164() - local29;
		local163 = (float) Math.sqrt((double) (local156 * local156 + local149 * local149 + local141 * local141));
		local170 = 1.0F / local163;
		local156 *= local170;
		local149 *= local170;
		local141 *= local170;
		local179 = local163 / (float) this.aClass4_Sub21_1.method3165();
		local188 = 1.0F - local179 * local179;
		if (local188 < 0.0F) {
			local188 = 0.0F;
		}
		local230 = local313 * local141 + local287 * local149 + local156 * local322;
		if (local230 < 0.0F) {
			local230 = 0.0F;
		}
		@Pc(543) float local543 = local230 * local188 * 2.0F;
		if (local543 > 1.0F) {
			local543 = 1.0F;
		}
		@Pc(554) int local554 = this.aClass4_Sub21_1.method3162();
		@Pc(564) int local564 = (int) (local543 * (float) (local554 >> 16 & 0xFF));
		if (local564 > 255) {
			local564 = 255;
		}
		@Pc(581) int local581 = (int) ((float) (local554 >> 8 & 0xFF) * local543);
		if (local581 > 255) {
			local581 = 255;
		}
		@Pc(594) int local594 = (int) (local543 * (float) (local554 & 0xFF));
		if (this.aClass19_Sub2_22.aBoolean215) {
			this.aClass4_Sub12_Sub2_2.method2556((float) local21);
			this.aClass4_Sub12_Sub2_2.method2556((float) local35);
			this.aClass4_Sub12_Sub2_2.method2556((float) local29);
		} else {
			this.aClass4_Sub12_Sub2_2.method2552((float) local21);
			this.aClass4_Sub12_Sub2_2.method2552((float) local35);
			this.aClass4_Sub12_Sub2_2.method2552((float) local29);
		}
		if (local594 > 255) {
			local594 = 255;
		}
		this.aClass4_Sub12_Sub2_2.method2551(local564);
		this.aClass4_Sub12_Sub2_2.method2551(local581);
		this.aClass4_Sub12_Sub2_2.method2551(local594);
		this.aClass4_Sub12_Sub2_2.method2551(255);
		this.method2840(local84);
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BS)V")
	private void method2840(@OriginalArg(1) short arg0) {
		if (this.aClass19_Sub2_22.aBoolean215) {
			this.aClass4_Sub12_3.method2524(arg0);
		} else {
			this.aClass4_Sub12_3.method2541(arg0);
		}
		this.anInt3408++;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIII[[Z)V")
	public void method2842(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface1_3 == null || (arg0 + arg1 < this.anInt3406 || (arg1 - arg0 > this.anInt3412 || (this.anInt3415 > arg2 + arg0 || arg2 - arg0 > this.anInt3409)))) {
			return;
		}
		for (@Pc(53) int local53 = this.anInt3415; local53 <= this.anInt3409; local53++) {
			for (@Pc(58) int local58 = this.anInt3406; local58 <= this.anInt3412; local58++) {
				@Pc(65) int local65 = local58 - arg1;
				@Pc(69) int local69 = local53 - arg2;
				if (local65 > -arg0 && arg0 > local65 && local69 > -arg0 && arg0 > local69 && arg3[arg0 + local65][local69 + arg0]) {
					this.aClass19_Sub2_22.method1901((int) (this.aClass4_Sub21_1.method3159() * 255.0F) << 24);
					this.aClass19_Sub2_22.method1934(this.aClass177_11, null, null, this.aClass177_12);
					this.aClass19_Sub2_22.method1967(0, this.anInt3408, this.anInterface1_3);
					return;
				}
			}
		}
	}
}
