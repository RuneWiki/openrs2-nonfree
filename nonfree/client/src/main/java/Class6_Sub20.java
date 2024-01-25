import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class6_Sub20 extends Class6 {

	@OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
	private int anInt2553;

	@OriginalMember(owner = "client!fn", name = "j", descriptor = "Lclient!pea;")
	private final Class121_Sub3 aClass121_Sub3_12;

	@OriginalMember(owner = "client!fn", name = "m", descriptor = "Lclient!hj;")
	private final Class6_Sub7 aClass6_Sub7_1;

	@OriginalMember(owner = "client!fn", name = "n", descriptor = "Lclient!le;")
	private final Class60_Sub2 aClass60_Sub2_2;

	@OriginalMember(owner = "client!fn", name = "D", descriptor = "I")
	private final int anInt2561;

	@OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
	private final int anInt2555;

	@OriginalMember(owner = "client!fn", name = "G", descriptor = "I")
	private final int anInt2562;

	@OriginalMember(owner = "client!fn", name = "s", descriptor = "I")
	private final int anInt2556;

	@OriginalMember(owner = "client!fn", name = "F", descriptor = "[[F")
	private float[][] aFloatArrayArray4;

	@OriginalMember(owner = "client!fn", name = "y", descriptor = "[[F")
	private float[][] aFloatArrayArray3;

	@OriginalMember(owner = "client!fn", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray2;

	@OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
	private int anInt2554;

	@OriginalMember(owner = "client!fn", name = "p", descriptor = "Lclient!av;")
	private final Interface2 anInterface2_4;

	@OriginalMember(owner = "client!fn", name = "r", descriptor = "Lclient!rm;")
	private final Interface19 anInterface19_3;

	@OriginalMember(owner = "client!fn", name = "v", descriptor = "Lclient!cm;")
	private final Class53 aClass53_8;

	@OriginalMember(owner = "client!fn", name = "E", descriptor = "Lclient!cm;")
	private final Class53 aClass53_9;

	@OriginalMember(owner = "client!fn", name = "J", descriptor = "Lclient!dga;")
	private final Class6_Sub14 aClass6_Sub14_2;

	@OriginalMember(owner = "client!fn", name = "I", descriptor = "Lclient!kj;")
	private final Class6_Sub14_Sub1 aClass6_Sub14_Sub1_2;

	@OriginalMember(owner = "client!fn", name = "z", descriptor = "Lclient!nj;")
	private final Class212 aClass212_7;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lclient!pea;Lclient!le;Lclient!hj;[I)V")
	public Class6_Sub20(@OriginalArg(0) Class121_Sub3 arg0, @OriginalArg(1) Class60_Sub2 arg1, @OriginalArg(2) Class6_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass121_Sub3_12 = arg0;
		this.aClass6_Sub7_1 = arg2;
		this.aClass60_Sub2_2 = arg1;
		@Pc(22) int local22 = this.aClass6_Sub7_1.method3487() - (arg1.anInt9652 >> 1);
		this.anInt2561 = this.aClass6_Sub7_1.method3490() - local22 >> arg1.anInt9654;
		this.anInt2555 = this.aClass6_Sub7_1.method3490() + local22 >> arg1.anInt9654;
		this.anInt2562 = this.aClass6_Sub7_1.method3492() - local22 >> arg1.anInt9654;
		this.anInt2556 = local22 + this.aClass6_Sub7_1.method3492() >> arg1.anInt9654;
		@Pc(76) int local76 = this.anInt2555 + 1 - this.anInt2561;
		@Pc(85) int local85 = this.anInt2556 + 1 - this.anInt2562;
		this.aFloatArrayArray4 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray3 = new float[local76 + 1][local85 + 1];
		this.aFloatArrayArray2 = new float[local76 + 1][local85 + 1];
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(173) int local173;
		@Pc(187) int local187;
		for (@Pc(114) int local114 = 0; local114 <= local85; local114++) {
			@Pc(121) int local121 = this.anInt2562 + local114;
			if (local121 > 0 && this.aClass60_Sub2_2.anInt9657 - 1 > local121) {
				for (local136 = 0; local136 <= local76; local136++) {
					local143 = this.anInt2561 + local136;
					if (local143 > 0 && this.aClass60_Sub2_2.anInt9656 - 1 > local143) {
						local173 = arg1.JA(local143 + 1, local121) - arg1.JA(local143 - 1, local121);
						local187 = arg1.JA(local143, local121 + 1) - arg1.JA(local143, local121 - 1);
						@Pc(202) float local202 = (float) (1.0D / Math.sqrt((double) (local173 * local173 + local187 * local187 + 65536)));
						this.aFloatArrayArray3[local136][local114] = (float) local173 * local202;
						this.aFloatArrayArray4[local136][local114] = local202 * -256.0F;
						this.aFloatArrayArray2[local136][local114] = (float) local187 * local202;
					}
				}
			}
		}
		local136 = 0;
		for (local143 = this.anInt2562; local143 <= this.anInt2556; local143++) {
			if (local143 >= 0 && local143 < arg1.anInt9657) {
				for (local173 = this.anInt2561; local173 <= this.anInt2555; local173++) {
					if (local173 >= 0 && local173 < arg1.anInt9656) {
						local187 = arg3[local136];
						@Pc(302) int[] local302 = arg1.anIntArrayArrayArray15[local173][local143];
						if (local302 != null && local187 != 0) {
							if (local187 == 1) {
								@Pc(311) int local311 = 0;
								while (local311 < local302.length) {
									if (local302[local311++] != -1 && local302[local311++] != -1 && local302[local311++] != -1) {
										this.anInt2554 += 3;
									}
								}
							} else {
								this.anInt2554 += 3;
							}
						}
					}
					local136++;
				}
			} else {
				local136 += this.anInt2555 - this.anInt2561;
			}
		}
		this.anInterface2_4 = null;
		this.anInterface19_3 = null;
		this.aClass53_8 = null;
		this.aClass53_9 = null;
		this.aClass6_Sub14_2 = null;
		this.aClass212_7 = null;
		this.aFloatArrayArray3 = this.aFloatArrayArray4 = this.aFloatArrayArray2 = null;
		this.aClass6_Sub14_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IIIBIII)V")
	private void method2157(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) long local7 = -1L;
		@Pc(15) int local15 = arg2 + (arg1 << this.aClass60_Sub2_2.anInt9654);
		@Pc(24) int local24 = arg0 + (arg5 << this.aClass60_Sub2_2.anInt9654);
		@Pc(30) int local30 = this.aClass60_Sub2_2.sa(local15, local24);
		if ((arg2 & 0x7F) == 0 || (arg0 & 0x7F) == 0) {
			local7 = (long) local24 << 16 & 0xFFFFL << 16 | (long) local15 & 0xFFFFL;
			@Pc(61) Class6 local61 = this.aClass212_7.method5106(local7);
			if (local61 != null) {
				this.method2161(((Class6_Sub26) local61).aShort73, 0);
				return;
			}
		}
		@Pc(79) short local79 = (short) this.anInt2553++;
		if (local7 != -1L) {
			this.aClass212_7.method5104(local7, new Class6_Sub26(local79));
		}
		@Pc(157) float local157;
		@Pc(146) float local146;
		@Pc(135) float local135;
		@Pc(207) float local207;
		@Pc(215) float local215;
		@Pc(222) float local222;
		@Pc(229) float local229;
		@Pc(236) float local236;
		@Pc(245) float local245;
		@Pc(254) float local254;
		@Pc(263) float local263;
		if (arg2 == 0 && arg0 == 0) {
			local146 = this.aFloatArrayArray4[arg4][arg6];
			local157 = this.aFloatArrayArray3[arg4][arg6];
			local135 = this.aFloatArrayArray2[arg4][arg6];
		} else if (this.aClass60_Sub2_2.anInt9652 == arg2 && arg0 == 0) {
			local135 = this.aFloatArrayArray2[arg4 + 1][arg6];
			local157 = this.aFloatArrayArray3[arg4 + 1][arg6];
			local146 = this.aFloatArrayArray4[arg4 + 1][arg6];
		} else if (arg2 == this.aClass60_Sub2_2.anInt9652 && arg0 == this.aClass60_Sub2_2.anInt9652) {
			local135 = this.aFloatArrayArray2[arg4 + 1][arg6 + 1];
			local146 = this.aFloatArrayArray4[arg4 + 1][arg6 + 1];
			local157 = this.aFloatArrayArray3[arg4 + 1][arg6 + 1];
		} else if (arg2 == 0 && this.aClass60_Sub2_2.anInt9652 == arg0) {
			local135 = this.aFloatArrayArray2[arg4][arg6 + 1];
			local157 = this.aFloatArrayArray3[arg4][arg6 + 1];
			local146 = this.aFloatArrayArray4[arg4][arg6 + 1];
		} else {
			local207 = (float) arg2 / (float) this.aClass60_Sub2_2.anInt9652;
			local215 = (float) arg0 / (float) this.aClass60_Sub2_2.anInt9652;
			local222 = this.aFloatArrayArray3[arg4][arg6];
			local229 = this.aFloatArrayArray4[arg4][arg6];
			local236 = this.aFloatArrayArray2[arg4][arg6];
			local245 = this.aFloatArrayArray3[arg4 + 1][arg6];
			local254 = this.aFloatArrayArray4[arg4 + 1][arg6];
			local263 = this.aFloatArrayArray2[arg4 + 1][arg6];
			@Pc(279) float local279 = local236 + (this.aFloatArrayArray2[arg4][arg6 + 1] - local236) * local207;
			@Pc(297) float local297 = local254 + (this.aFloatArrayArray4[arg4 + 1][arg6 + 1] - local254) * local207;
			@Pc(313) float local313 = local229 + local207 * (this.aFloatArrayArray4[arg4][arg6 + 1] - local229);
			@Pc(328) float local328 = local222 + local207 * (this.aFloatArrayArray3[arg4][arg6 + 1] - local222);
			@Pc(345) float local345 = local245 + (this.aFloatArrayArray3[arg4 + 1][arg6 + 1] - local245) * local207;
			local157 = (local345 - local328) * local215 + local328;
			local146 = local215 * (local297 - local313) + local313;
			@Pc(381) float local381 = local263 + local207 * (this.aFloatArrayArray2[arg4 + 1][arg6 + 1] - local263);
			local135 = local215 * (local381 - local279) + local279;
		}
		local207 = this.aClass6_Sub7_1.method3490() - local15;
		local215 = this.aClass6_Sub7_1.method3493() - local30;
		local222 = this.aClass6_Sub7_1.method3492() - local24;
		local229 = (float) Math.sqrt((double) (local215 * local215 + local207 * local207 + local222 * local222));
		local236 = 1.0F / local229;
		local207 *= local236;
		local222 *= local236;
		local215 *= local236;
		local245 = local229 / (float) this.aClass6_Sub7_1.method3487();
		local254 = 1.0F - local245 * local245;
		if (local254 < 0.0F) {
			local254 = 0.0F;
		}
		local263 = local135 * local222 + local207 * local157 + local215 * local146;
		if (local263 < 0.0F) {
			local263 = 0.0F;
		}
		@Pc(543) float local543 = local254 * local263 * 2.0F;
		if (local543 > 1.0F) {
			local543 = 1.0F;
		}
		@Pc(554) int local554 = this.aClass6_Sub7_1.method3486();
		if (arg3 <= 36) {
			return;
		}
		@Pc(568) int local568 = (int) ((float) (local554 >> 16 & 0xFF) * local543);
		if (local568 > 255) {
			local568 = 255;
		}
		@Pc(583) int local583 = (int) (local543 * (float) (local554 >> 8 & 0xFF));
		if (local583 > 255) {
			local583 = 255;
		}
		@Pc(596) int local596 = (int) ((float) (local554 & 0xFF) * local543);
		if (local596 > 255) {
			local596 = 255;
		}
		if (this.aClass121_Sub3_12.aBoolean458) {
			this.aClass6_Sub14_Sub1_2.method3726((float) local15);
			this.aClass6_Sub14_Sub1_2.method3726((float) local30);
			this.aClass6_Sub14_Sub1_2.method3726((float) local24);
		} else {
			this.aClass6_Sub14_Sub1_2.method3725((float) local15);
			this.aClass6_Sub14_Sub1_2.method3725((float) local30);
			this.aClass6_Sub14_Sub1_2.method3725((float) local24);
		}
		this.aClass6_Sub14_Sub1_2.method6035(local568);
		this.aClass6_Sub14_Sub1_2.method6035(local583);
		this.aClass6_Sub14_Sub1_2.method6035(local596);
		this.aClass6_Sub14_Sub1_2.method6035(255);
		this.method2161(local79, 0);
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(SI)V")
	private void method2161(@OriginalArg(0) short arg0, @OriginalArg(1) int arg1) {
		if (this.aClass121_Sub3_12.aBoolean458) {
			this.aClass6_Sub14_2.method5999(arg0);
		} else {
			this.aClass6_Sub14_2.method6038(arg0);
		}
		if (arg1 != 0) {
			this.method2161((short) 25, -19);
		}
		this.anInt2554++;
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(IBII[[Z)V")
	public void method2162(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean[][] arg3) {
		if (this.anInterface19_3 == null || (this.anInt2561 > arg2 + arg0 || (arg0 - arg2 > this.anInt2555 || (this.anInt2562 > arg2 + arg1 || this.anInt2556 < arg1 - arg2)))) {
			return;
		}
		for (@Pc(63) int local63 = this.anInt2562; local63 <= this.anInt2556; local63++) {
			for (@Pc(68) int local68 = this.anInt2561; local68 <= this.anInt2555; local68++) {
				@Pc(75) int local75 = local68 - arg0;
				@Pc(79) int local79 = local63 - arg1;
				if (-arg2 < local75 && arg2 > local75 && local79 > -arg2 && arg2 > local79 && arg3[arg2 + local75][arg2 + local79]) {
					this.aClass121_Sub3_12.method5679((int) (this.aClass6_Sub7_1.method3491() * 255.0F) << 24);
					this.aClass121_Sub3_12.method5727(null, null, this.aClass53_9, this.aClass53_8);
					this.aClass121_Sub3_12.method5657(this.anInt2554, 0, this.anInterface19_3);
					return;
				}
			}
		}
	}
}
