import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class3_Sub21 extends Class3 {

	@OriginalMember(owner = "client!jf", name = "q", descriptor = "I")
	private int anInt2916;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "I")
	private int anInt2921;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "Lclient!eo;")
	private final Class3_Sub12 aClass3_Sub12_1;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Lclient!mi;")
	private final Class155_Sub1 aClass155_Sub1_21;

	@OriginalMember(owner = "client!jf", name = "n", descriptor = "Lclient!ag;")
	private final Class7_Sub1 aClass7_Sub1_1;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
	private final int anInt2920;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
	private final int anInt2919;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
	private final int anInt2918;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
	private final int anInt2917;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!jf", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!jf", name = "m", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!rp;")
	private Class3_Sub5 aClass3_Sub5_6;

	@OriginalMember(owner = "client!jf", name = "p", descriptor = "Lclient!jt;")
	private Class3_Sub5_Sub2 aClass3_Sub5_Sub2_1;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!cp;")
	private Class44 aClass44_17;

	@OriginalMember(owner = "client!jf", name = "C", descriptor = "Lclient!hs;")
	private final Interface4 anInterface4_2;

	@OriginalMember(owner = "client!jf", name = "D", descriptor = "Lclient!ht;")
	private final Interface5 anInterface5_3;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "Lclient!ga;")
	private final Class88 aClass88_5;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "Lclient!ga;")
	private final Class88 aClass88_6;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lclient!mi;Lclient!ag;Lclient!eo;[I)V")
	public Class3_Sub21(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) Class7_Sub1 arg1, @OriginalArg(2) Class3_Sub12 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub12_1 = arg2;
		this.aClass155_Sub1_21 = arg0;
		this.aClass7_Sub1_1 = arg1;
		@Pc(20) int local20 = this.aClass3_Sub12_1.anInt6129 - (arg1.anInt134 >> 1);
		this.anInt2920 = this.aClass3_Sub12_1.anInt6127 - local20 >> arg1.anInt133;
		this.anInt2919 = local20 + this.aClass3_Sub12_1.anInt6127 >> arg1.anInt133;
		this.anInt2918 = this.aClass3_Sub12_1.anInt6122 - local20 >> arg1.anInt133;
		this.anInt2917 = local20 + this.aClass3_Sub12_1.anInt6122 >> arg1.anInt133;
		@Pc(71) int local71 = this.anInt2919 + 1 - this.anInt2920;
		@Pc(80) int local80 = this.anInt2917 + 1 - this.anInt2918;
		this.aFloatArrayArray6 = new float[local71 + 1][local80 + 1];
		this.aFloatArrayArray7 = new float[local71 + 1][local80 + 1];
		this.aFloatArrayArray5 = new float[local71 + 1][local80 + 1];
		@Pc(109) int local109;
		@Pc(121) int local121;
		@Pc(136) int local136;
		@Pc(149) int local149;
		@Pc(175) int local175;
		@Pc(190) int local190;
		for (local109 = 0; local109 <= local80; local109++) {
			local121 = this.anInt2918 + local109;
			if (local121 > 0 && local121 < this.aClass7_Sub1_1.anInt6381 - 1) {
				for (local136 = 0; local136 <= local71; local136++) {
					local149 = local136 + this.anInt2920;
					if (local149 > 0 && local149 < this.aClass7_Sub1_1.anInt6380 - 1) {
						local175 = arg1.method5648(local149 + 1, local121) - arg1.method5648(local149 - 1, local121);
						local190 = arg1.method5648(local149, local121 + 1) - arg1.method5648(local149, local121 - 1);
						@Pc(205) float local205 = (float) (1.0D / Math.sqrt((double) (local190 * local190 + local175 * local175 + 65536)));
						this.aFloatArrayArray6[local136][local109] = (float) local175 * local205;
						this.aFloatArrayArray7[local136][local109] = -256.0F * local205;
						this.aFloatArrayArray5[local136][local109] = (float) local190 * local205;
					}
				}
			}
		}
		local109 = 0;
		local121 = 0;
		for (local136 = this.anInt2918; local136 <= this.anInt2917; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt6381) {
				for (local149 = this.anInt2920; local149 <= this.anInt2919; local149++) {
					if (local149 >= 0 && arg1.anInt6380 > local149) {
						local175 = arg3[local121];
						@Pc(303) int[] local303 = arg1.anIntArrayArrayArray5[local149][local136];
						if (local303 != null && local175 != 0) {
							if (local175 == 1) {
								local109 += local303.length;
							} else {
								local109 += 3;
							}
						}
					}
					local121++;
				}
			} else {
				local121 += this.anInt2919 - this.anInt2920;
			}
		}
		if (local109 > 0) {
			this.aClass3_Sub5_6 = new Class3_Sub5(local109 * 2);
			this.aClass3_Sub5_Sub2_1 = new Class3_Sub5_Sub2(local109 * 16);
			this.aClass44_17 = new Class44(Static304.method2746(local109));
			local121 = 0;
			local136 = 0;
			for (local149 = this.anInt2918; local149 <= this.anInt2917; local149++) {
				if (local149 >= 0 && arg1.anInt6381 > local149) {
					local175 = 0;
					for (local190 = this.anInt2920; local190 <= this.anInt2919; local190++) {
						if (local190 >= 0 && local190 < arg1.anInt6380) {
							@Pc(412) int local412 = arg3[local121];
							@Pc(419) int[] local419 = arg1.anIntArrayArrayArray5[local190][local149];
							@Pc(426) int[] local426 = arg1.anIntArrayArrayArray2[local190][local149];
							if (local419 != null && local412 != 0) {
								if (local412 == 1) {
									for (@Pc(439) int local439 = 0; local439 < local419.length; local439++) {
										this.method2532(local190, local149, local426[local439], local175, local136, local419[local439]);
									}
								} else if (local412 == 3) {
									this.method2532(local190, local149, 0, local175, local136, 0);
									this.method2532(local190, local149, 0, local175, local136, arg1.anInt134);
									this.method2532(local190, local149, arg1.anInt134, local175, local136, 0);
								} else if (local412 == 2) {
									this.method2532(local190, local149, 0, local175, local136, arg1.anInt134);
									this.method2532(local190, local149, arg1.anInt134, local175, local136, arg1.anInt134);
									this.method2532(local190, local149, 0, local175, local136, 0);
								} else if (local412 == 5) {
									this.method2532(local190, local149, arg1.anInt134, local175, local136, arg1.anInt134);
									this.method2532(local190, local149, arg1.anInt134, local175, local136, 0);
									this.method2532(local190, local149, 0, local175, local136, arg1.anInt134);
								} else if (local412 == 4) {
									this.method2532(local190, local149, arg1.anInt134, local175, local136, 0);
									this.method2532(local190, local149, 0, local175, local136, 0);
									this.method2532(local190, local149, arg1.anInt134, local175, local136, arg1.anInt134);
								}
							}
						}
						local175++;
						local121++;
					}
				} else {
					local121 += this.anInt2919 - this.anInt2920;
				}
				local136++;
			}
			this.anInterface4_2 = this.aClass155_Sub1_21.method3608(this.aClass3_Sub5_6.aByteArray42, this.aClass3_Sub5_6.anInt3121, false);
			this.anInterface5_3 = this.aClass155_Sub1_21.method3622(16, this.aClass3_Sub5_Sub2_1.aByteArray42, this.aClass3_Sub5_Sub2_1.anInt3121, false);
			this.aClass88_5 = new Class88(this.aClass155_Sub1_21, this.anInterface5_3, 5126, 3, 0);
			this.aClass88_6 = new Class88(this.aClass155_Sub1_21, this.anInterface5_3, 5121, 4, 12);
		} else {
			this.aClass88_6 = null;
			this.anInterface4_2 = null;
			this.aClass88_5 = null;
			this.anInterface5_3 = null;
		}
		this.aClass44_17 = null;
		this.aClass3_Sub5_6 = null;
		this.aClass3_Sub5_Sub2_1 = null;
		this.aFloatArrayArray6 = this.aFloatArrayArray7 = this.aFloatArrayArray5 = null;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BS)V")
	private void method2531(@OriginalArg(1) short arg0) {
		if (this.aClass155_Sub1_21.aBoolean298) {
			this.aClass3_Sub5_6.method2749(arg0);
		} else {
			this.aClass3_Sub5_6.method2729(arg0);
		}
		this.anInt2921++;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIBII)V")
	private void method2532(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(1) long local1 = -1L;
		@Pc(10) int local10 = arg5 + (arg0 << this.aClass7_Sub1_1.anInt133);
		@Pc(18) int local18 = arg2 + (arg1 << this.aClass7_Sub1_1.anInt133);
		@Pc(24) int local24 = this.aClass7_Sub1_1.method5638(local10, local18);
		if ((arg5 & 0x7F) == 0 || (arg2 & 0x7F) == 0) {
			local1 = ((long) local18 & 0xFFFFL) << 16 | (long) local10 & 0xFFFFL;
			@Pc(56) Class3 local56 = this.aClass44_17.method942(local1);
			if (local56 != null) {
				this.method2531(((Class3_Sub6) local56).aShort13);
				return;
			}
		}
		@Pc(75) short local75 = (short) this.anInt2916++;
		if (local1 != -1L) {
			this.aClass44_17.method948(local1, new Class3_Sub6(local75));
		}
		@Pc(105) float local105;
		@Pc(112) float local112;
		@Pc(119) float local119;
		@Pc(168) float local168;
		@Pc(176) float local176;
		@Pc(183) float local183;
		@Pc(190) float local190;
		@Pc(197) float local197;
		@Pc(206) float local206;
		@Pc(215) float local215;
		@Pc(272) float local272;
		if (arg5 == 0 && arg2 == 0) {
			local105 = this.aFloatArrayArray6[arg3][arg4];
			local112 = this.aFloatArrayArray7[arg3][arg4];
			local119 = this.aFloatArrayArray5[arg3][arg4];
		} else if (arg5 == this.aClass7_Sub1_1.anInt134 && arg2 == 0) {
			local105 = this.aFloatArrayArray6[arg3 + 1][arg4];
			local119 = this.aFloatArrayArray5[arg3 + 1][arg4];
			local112 = this.aFloatArrayArray7[arg3 + 1][arg4];
		} else if (this.aClass7_Sub1_1.anInt134 == arg5 && arg2 == this.aClass7_Sub1_1.anInt134) {
			local112 = this.aFloatArrayArray7[arg3 + 1][arg4 + 1];
			local119 = this.aFloatArrayArray5[arg3 + 1][arg4 + 1];
			local105 = this.aFloatArrayArray6[arg3 + 1][arg4 + 1];
		} else if (arg5 == 0 && this.aClass7_Sub1_1.anInt134 == arg2) {
			local105 = this.aFloatArrayArray6[arg3][arg4 + 1];
			local119 = this.aFloatArrayArray5[arg3][arg4 + 1];
			local112 = this.aFloatArrayArray7[arg3][arg4 + 1];
		} else {
			local168 = (float) arg5 / (float) this.aClass7_Sub1_1.anInt134;
			local176 = (float) arg2 / (float) this.aClass7_Sub1_1.anInt134;
			local183 = this.aFloatArrayArray6[arg3][arg4];
			local190 = this.aFloatArrayArray7[arg3][arg4];
			local197 = this.aFloatArrayArray5[arg3][arg4];
			local206 = this.aFloatArrayArray6[arg3 + 1][arg4];
			local215 = this.aFloatArrayArray7[arg3 + 1][arg4];
			@Pc(233) float local233 = local206 + (this.aFloatArrayArray6[arg3 + 1][arg4 + 1] - local206) * local168;
			@Pc(248) float local248 = local190 + local168 * (this.aFloatArrayArray7[arg3][arg4 + 1] - local190);
			@Pc(263) float local263 = local197 + (this.aFloatArrayArray5[arg3][arg4 + 1] - local197) * local168;
			local272 = this.aFloatArrayArray5[arg3 + 1][arg4];
			@Pc(290) float local290 = local215 + (this.aFloatArrayArray7[arg3 + 1][arg4 + 1] - local215) * local168;
			@Pc(305) float local305 = local183 + local168 * (this.aFloatArrayArray6[arg3][arg4 + 1] - local183);
			local105 = local176 * (local233 - local305) + local305;
			local112 = local248 + local176 * (local290 - local248);
			@Pc(338) float local338 = local272 + (this.aFloatArrayArray5[arg3 + 1][arg4 + 1] - local272) * local168;
			local119 = local263 + (local338 - local263) * local176;
		}
		local168 = this.aClass3_Sub12_1.anInt6127 - local10;
		local176 = this.aClass3_Sub12_1.anInt6123 - local24;
		local183 = this.aClass3_Sub12_1.anInt6122 - local18;
		local190 = (float) Math.sqrt((double) (local176 * local176 + local168 * local168 + local183 * local183));
		local197 = 1.0F / local190;
		local176 *= local197;
		local168 *= local197;
		local183 *= local197;
		local206 = local190 / (float) this.aClass3_Sub12_1.anInt6129;
		local215 = 1.0F - local206 * local206;
		if (local215 < 0.0F) {
			local215 = 0.0F;
		}
		local272 = local168 * local105 + local112 * local176 + local183 * local119;
		if (local272 < 0.0F) {
			local272 = 0.0F;
		}
		@Pc(544) float local544 = local215 * 2.0F * local272;
		if (local544 > 1.0F) {
			local544 = 1.0F;
		}
		@Pc(555) int local555 = this.aClass3_Sub12_1.anInt6130;
		@Pc(565) int local565 = (int) (local544 * (float) (local555 >> 16 & 0xFF));
		if (local565 > 255) {
			local565 = 255;
		}
		@Pc(581) int local581 = (int) (local544 * (float) (local555 >> 8 & 0xFF));
		if (local581 > 255) {
			local581 = 255;
		}
		@Pc(595) int local595 = (int) (local544 * (float) (local555 & 0xFF));
		if (local595 > 255) {
			local595 = 255;
		}
		if (this.aClass155_Sub1_21.aBoolean298) {
			this.aClass3_Sub5_Sub2_1.method2794((float) local10);
			this.aClass3_Sub5_Sub2_1.method2794((float) local24);
			this.aClass3_Sub5_Sub2_1.method2794((float) local18);
		} else {
			this.aClass3_Sub5_Sub2_1.method2793((float) local10);
			this.aClass3_Sub5_Sub2_1.method2793((float) local24);
			this.aClass3_Sub5_Sub2_1.method2793((float) local18);
		}
		this.aClass3_Sub5_Sub2_1.method2791(local565);
		this.aClass3_Sub5_Sub2_1.method2791(local581);
		this.aClass3_Sub5_Sub2_1.method2791(local595);
		this.aClass3_Sub5_Sub2_1.method2791(255);
		this.method2531(local75);
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[[ZIBI)V")
	public void method2533(@OriginalArg(0) int arg0, @OriginalArg(1) boolean[][] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface4_2 == null || (this.anInt2920 > arg3 + arg2 || (this.anInt2919 < arg2 - arg3 || (this.anInt2918 > arg3 + arg0 || this.anInt2917 < arg0 - arg3)))) {
			return;
		}
		for (@Pc(54) int local54 = this.anInt2918; local54 <= this.anInt2917; local54++) {
			for (@Pc(61) int local61 = this.anInt2920; local61 <= this.anInt2919; local61++) {
				@Pc(74) int local74 = local61 - arg2;
				@Pc(79) int local79 = local54 - arg0;
				if (-arg3 < local74 && arg3 > local74 && -arg3 < local79 && local79 < arg3 && arg1[local74 + arg3][local79 + arg3]) {
					this.aClass155_Sub1_21.method3605((int) (this.aClass3_Sub12_1.aFloat69 * 255.0F) << 24);
					this.aClass155_Sub1_21.method3626(this.aClass88_5, null, this.aClass88_6, null);
					this.aClass155_Sub1_21.method3616(this.anInterface4_2, 0, this.anInt2921);
					return;
				}
			}
		}
	}
}
