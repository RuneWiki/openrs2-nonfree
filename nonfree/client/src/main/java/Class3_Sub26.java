import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iga")
public final class Class3_Sub26 extends Class3 {

	@OriginalMember(owner = "client!iga", name = "J", descriptor = "I")
	private int anInt4690;

	@OriginalMember(owner = "client!iga", name = "F", descriptor = "Lclient!vca;")
	private final Class104_Sub3 aClass104_Sub3_1;

	@OriginalMember(owner = "client!iga", name = "o", descriptor = "Lclient!hk;")
	private final Class16_Sub2 aClass16_Sub2_22;

	@OriginalMember(owner = "client!iga", name = "n", descriptor = "Lclient!bq;")
	private final Class3_Sub7 aClass3_Sub7_2;

	@OriginalMember(owner = "client!iga", name = "t", descriptor = "I")
	private final int anInt4682;

	@OriginalMember(owner = "client!iga", name = "k", descriptor = "I")
	private final int anInt4678;

	@OriginalMember(owner = "client!iga", name = "l", descriptor = "I")
	private final int anInt4679;

	@OriginalMember(owner = "client!iga", name = "K", descriptor = "I")
	private final int anInt4691;

	@OriginalMember(owner = "client!iga", name = "L", descriptor = "[[F")
	private float[][] aFloatArrayArray7;

	@OriginalMember(owner = "client!iga", name = "p", descriptor = "[[F")
	private float[][] aFloatArrayArray5;

	@OriginalMember(owner = "client!iga", name = "s", descriptor = "[[F")
	private float[][] aFloatArrayArray6;

	@OriginalMember(owner = "client!iga", name = "M", descriptor = "I")
	private int anInt4692;

	@OriginalMember(owner = "client!iga", name = "j", descriptor = "Lclient!nc;")
	private final Interface17 anInterface17_3;

	@OriginalMember(owner = "client!iga", name = "u", descriptor = "Lclient!nba;")
	private final Class243 aClass243_8;

	@OriginalMember(owner = "client!iga", name = "A", descriptor = "Lclient!wfa;")
	private final Interface26 anInterface26_4;

	@OriginalMember(owner = "client!iga", name = "r", descriptor = "Lclient!nba;")
	private final Class243 aClass243_7;

	@OriginalMember(owner = "client!iga", name = "D", descriptor = "Lclient!fca;")
	private Class3_Sub17 aClass3_Sub17_6;

	@OriginalMember(owner = "client!iga", name = "B", descriptor = "Lclient!iw;")
	private Class3_Sub17_Sub1 aClass3_Sub17_Sub1_2;

	@OriginalMember(owner = "client!iga", name = "v", descriptor = "Lclient!cja;")
	private Class62 aClass62_24;

	@OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(Lclient!hk;Lclient!vca;Lclient!bq;[I)V")
	public Class3_Sub26(@OriginalArg(0) Class16_Sub2 arg0, @OriginalArg(1) Class104_Sub3 arg1, @OriginalArg(2) Class3_Sub7 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass104_Sub3_1 = arg1;
		this.aClass16_Sub2_22 = arg0;
		this.aClass3_Sub7_2 = arg2;
		@Pc(23) int local23 = this.aClass3_Sub7_2.method6349() - (arg1.anInt9716 >> 1);
		this.anInt4682 = this.aClass3_Sub7_2.method6348() - local23 >> arg1.anInt9717;
		this.anInt4678 = local23 + this.aClass3_Sub7_2.method6348() >> arg1.anInt9717;
		this.anInt4679 = this.aClass3_Sub7_2.method6343() - local23 >> arg1.anInt9717;
		this.anInt4691 = this.aClass3_Sub7_2.method6343() + local23 >> arg1.anInt9717;
		@Pc(78) int local78 = this.anInt4678 + 1 - this.anInt4682;
		@Pc(86) int local86 = this.anInt4691 + 1 - this.anInt4679;
		this.aFloatArrayArray7 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray5 = new float[local78 + 1][local86 + 1];
		this.aFloatArrayArray6 = new float[local78 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(171) int local171;
		@Pc(188) int local188;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt4679 + local115;
			if (local122 > 0 && this.aClass104_Sub3_1.anInt9715 - 1 > local122) {
				for (local136 = 0; local136 <= local78; local136++) {
					local143 = local136 + this.anInt4682;
					if (local143 > 0 && local143 < this.aClass104_Sub3_1.anInt9718 - 1) {
						local171 = arg1.method8279(local122, local143 + 1) - arg1.method8279(local122, local143 - 1);
						local188 = arg1.method8279(local122 + 1, local143) - arg1.method8279(local122 - 1, local143);
						@Pc(203) float local203 = (float) (1.0D / Math.sqrt((double) (local188 * local188 + local171 * local171 + 65536)));
						this.aFloatArrayArray5[local136][local115] = local203 * (float) local171;
						this.aFloatArrayArray6[local136][local115] = -256.0F * local203;
						this.aFloatArrayArray7[local136][local115] = (float) local188 * local203;
					}
				}
			}
		}
		local122 = 0;
		@Pc(305) int local305;
		for (local136 = this.anInt4679; local136 <= this.anInt4691; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt9715) {
				for (local143 = this.anInt4682; local143 <= this.anInt4678; local143++) {
					if (local143 >= 0 && local143 < arg1.anInt9718) {
						local171 = arg3[local122];
						@Pc(283) int[] local283 = arg1.anIntArrayArrayArray19[local143][local136];
						if (local283 != null && local171 != 0) {
							if (local171 == 1) {
								local305 = 0;
								while (local283.length > local305) {
									if (local283[local305++] != -1 && local283[local305++] != -1 && local283[local305++] != -1) {
										this.anInt4692 += 3;
									}
								}
							} else {
								this.anInt4692 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt4678 - this.anInt4682;
			}
		}
		if (this.anInt4692 <= 0) {
			this.anInterface17_3 = null;
			this.aClass243_8 = null;
			this.anInterface26_4 = null;
			this.aClass243_7 = null;
		} else {
			this.aClass3_Sub17_6 = new Class3_Sub17(this.anInt4692 * 2);
			this.aClass3_Sub17_Sub1_2 = new Class3_Sub17_Sub1(this.anInt4692 * 16);
			this.aClass62_24 = new Class62(Static527.method7377(this.anInt4692));
			local143 = 0;
			local122 = 0;
			for (local171 = this.anInt4679; local171 <= this.anInt4691; local171++) {
				if (local171 >= 0 && arg1.anInt9715 > local171) {
					local188 = 0;
					for (local305 = this.anInt4682; local305 <= this.anInt4678; local305++) {
						if (local305 >= 0 && local305 < arg1.anInt9718) {
							@Pc(453) int local453 = arg3[local122];
							@Pc(460) int[] local460 = arg1.anIntArrayArrayArray19[local305][local171];
							if (local460 != null && local453 != 0) {
								if (local453 == 1) {
									@Pc(618) int[] local618 = arg1.anIntArrayArrayArray18[local305][local171];
									@Pc(625) int[] local625 = arg1.anIntArrayArrayArray17[local305][local171];
									@Pc(627) int local627 = 0;
									label105: while (true) {
										while (true) {
											if (local627 >= local460.length) {
												break label105;
											}
											if (local460[local627] == -1 || local460[local627 + 1] == -1 || local460[local627 + 2] == -1) {
												local627 += 3;
											} else {
												this.method3968(local171, local625[local627], local305, local618[local627], local188, local143);
												local627++;
												this.method3968(local171, local625[local627], local305, local618[local627], local188, local143);
												local627++;
												this.method3968(local171, local625[local627], local305, local618[local627], local188, local143);
												local627++;
											}
										}
									}
								} else if (local453 == 3) {
									this.method3968(local171, 0, local305, 0, local188, local143);
									this.method3968(local171, 0, local305, arg1.anInt9716, local188, local143);
									this.method3968(local171, arg1.anInt9716, local305, 0, local188, local143);
								} else if (local453 == 2) {
									this.method3968(local171, 0, local305, arg1.anInt9716, local188, local143);
									this.method3968(local171, arg1.anInt9716, local305, arg1.anInt9716, local188, local143);
									this.method3968(local171, 0, local305, 0, local188, local143);
								} else if (local453 == 5) {
									this.method3968(local171, arg1.anInt9716, local305, arg1.anInt9716, local188, local143);
									this.method3968(local171, arg1.anInt9716, local305, 0, local188, local143);
									this.method3968(local171, 0, local305, arg1.anInt9716, local188, local143);
								} else if (local453 == 4) {
									this.method3968(local171, arg1.anInt9716, local305, 0, local188, local143);
									this.method3968(local171, 0, local305, 0, local188, local143);
									this.method3968(local171, arg1.anInt9716, local305, arg1.anInt9716, local188, local143);
								}
							}
						}
						local188++;
						local122++;
					}
				} else {
					local122 += this.anInt4678 - this.anInt4682;
				}
				local143++;
			}
			this.anInterface17_3 = this.aClass16_Sub2_22.method3613(false, this.aClass3_Sub17_6.lb, this.aClass3_Sub17_6.aByteArray59);
			this.anInterface26_4 = this.aClass16_Sub2_22.method3643(16, false, this.aClass3_Sub17_Sub1_2.aByteArray59, this.aClass3_Sub17_Sub1_2.lb);
			this.aClass243_7 = new Class243(this.anInterface26_4, 5126, 3, 0);
			this.aClass243_8 = new Class243(this.anInterface26_4, 5121, 4, 12);
		}
		this.aClass62_24 = null;
		this.aFloatArrayArray5 = this.aFloatArrayArray6 = this.aFloatArrayArray7 = null;
		this.aClass3_Sub17_6 = null;
		this.aClass3_Sub17_Sub1_2 = null;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(III[[ZI)V")
	public void method3967(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean[][] arg3) {
		if (this.anInterface17_3 == null || (arg1 + arg2 < this.anInt4682 || (arg1 - arg2 > this.anInt4678 || (arg2 + arg0 < this.anInt4679 || this.anInt4691 < arg0 - arg2)))) {
			return;
		}
		for (@Pc(55) int local55 = this.anInt4679; local55 <= this.anInt4691; local55++) {
			for (@Pc(60) int local60 = this.anInt4682; local60 <= this.anInt4678; local60++) {
				@Pc(67) int local67 = local60 - arg1;
				@Pc(72) int local72 = local55 - arg0;
				if (local67 > -arg2 && local67 < arg2 && -arg2 < local72 && local72 < arg2 && arg3[arg2 + local67][arg2 + local72]) {
					this.aClass16_Sub2_22.method3644((int) (this.aClass3_Sub7_2.method6352() * 255.0F) << 24);
					this.aClass16_Sub2_22.method3629(this.aClass243_7, (Class243) null, (Class243) null, this.aClass243_8);
					this.aClass16_Sub2_22.method3632(0, this.anInterface17_3, this.anInt4692);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IIIIIIB)V")
	private void method3968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(20) int local20 = arg3 + (arg2 << this.aClass104_Sub3_1.anInt9717);
		@Pc(29) int local29 = arg1 + (arg0 << this.aClass104_Sub3_1.anInt9717);
		@Pc(36) int local36 = this.aClass104_Sub3_1.method8286(local20, local29);
		if ((arg3 & 0x7F) == 0 || (arg1 & 0x7F) == 0) {
			local7 = (long) local20 & 0xFFFFL | ((long) local29 & 0xFFFFL) << 16;
			@Pc(65) Class3 local65 = this.aClass62_24.method1682(local7);
			if (local65 != null) {
				this.method3970(((Class3_Sub33) local65).aShort76);
				return;
			}
		}
		@Pc(83) short local83 = (short) this.anInt4690++;
		if (local7 != -1L) {
			this.aClass62_24.method1686(local7, new Class3_Sub33(local83));
		}
		@Pc(131) float local131;
		@Pc(140) float local140;
		@Pc(149) float local149;
		@Pc(209) float local209;
		@Pc(217) float local217;
		@Pc(224) float local224;
		@Pc(231) float local231;
		@Pc(238) float local238;
		@Pc(247) float local247;
		@Pc(256) float local256;
		@Pc(331) float local331;
		if (arg3 == 0 && arg1 == 0) {
			local140 = this.aFloatArrayArray6[arg4][arg5];
			local149 = this.aFloatArrayArray7[arg4][arg5];
			local131 = this.aFloatArrayArray5[arg4][arg5];
		} else if (this.aClass104_Sub3_1.anInt9716 == arg3 && arg1 == 0) {
			local131 = this.aFloatArrayArray5[arg4 + 1][arg5];
			local140 = this.aFloatArrayArray6[arg4 + 1][arg5];
			local149 = this.aFloatArrayArray7[arg4 + 1][arg5];
		} else if (arg3 == this.aClass104_Sub3_1.anInt9716 && this.aClass104_Sub3_1.anInt9716 == arg1) {
			local131 = this.aFloatArrayArray5[arg4 + 1][arg5 + 1];
			local149 = this.aFloatArrayArray7[arg4 + 1][arg5 + 1];
			local140 = this.aFloatArrayArray6[arg4 + 1][arg5 + 1];
		} else if (arg3 == 0 && this.aClass104_Sub3_1.anInt9716 == arg1) {
			local131 = this.aFloatArrayArray5[arg4][arg5 + 1];
			local140 = this.aFloatArrayArray6[arg4][arg5 + 1];
			local149 = this.aFloatArrayArray7[arg4][arg5 + 1];
		} else {
			local209 = (float) arg3 / (float) this.aClass104_Sub3_1.anInt9716;
			local217 = (float) arg1 / (float) this.aClass104_Sub3_1.anInt9716;
			local224 = this.aFloatArrayArray5[arg4][arg5];
			local231 = this.aFloatArrayArray6[arg4][arg5];
			local238 = this.aFloatArrayArray7[arg4][arg5];
			local247 = this.aFloatArrayArray5[arg4 + 1][arg5];
			local256 = this.aFloatArrayArray6[arg4 + 1][arg5];
			@Pc(271) float local271 = local231 + (this.aFloatArrayArray6[arg4][arg5 + 1] - local231) * local209;
			@Pc(289) float local289 = local256 + local209 * (this.aFloatArrayArray6[arg4 + 1][arg5 + 1] - local256);
			@Pc(305) float local305 = local224 + (this.aFloatArrayArray5[arg4][arg5 + 1] - local224) * local209;
			@Pc(322) float local322 = local247 + local209 * (this.aFloatArrayArray5[arg4 + 1][arg5 + 1] - local247);
			local331 = this.aFloatArrayArray7[arg4 + 1][arg5];
			@Pc(347) float local347 = local238 + (this.aFloatArrayArray7[arg4][arg5 + 1] - local238) * local209;
			@Pc(364) float local364 = local331 + (this.aFloatArrayArray7[arg4 + 1][arg5 + 1] - local331) * local209;
			local131 = (local322 - local305) * local217 + local305;
			local140 = (local289 - local271) * local217 + local271;
			local149 = (local364 - local347) * local217 + local347;
		}
		local209 = (float) (this.aClass3_Sub7_2.method6348() - local20);
		local217 = (float) (this.aClass3_Sub7_2.method6346() - local36);
		local224 = (float) (this.aClass3_Sub7_2.method6343() - local29);
		local231 = (float) Math.sqrt((double) (local224 * local224 + local209 * local209 + local217 * local217));
		local238 = 1.0F / local231;
		local209 *= local238;
		local217 *= local238;
		local224 *= local238;
		local247 = local231 / (float) this.aClass3_Sub7_2.method6349();
		local256 = 1.0F - local247 * local247;
		if (local256 < 0.0F) {
			local256 = 0.0F;
		}
		local331 = local140 * local217 + local209 * local131 + local224 * local149;
		if (local331 < 0.0F) {
			local331 = 0.0F;
		}
		@Pc(553) float local553 = local331 * 2.0F * local256;
		if (local553 > 1.0F) {
			local553 = 1.0F;
		}
		@Pc(564) int local564 = this.aClass3_Sub7_2.method6351();
		@Pc(574) int local574 = (int) ((float) (local564 >> 16 & 0xFF) * local553);
		if (local574 > 255) {
			local574 = 255;
		}
		@Pc(589) int local589 = (int) ((float) (local564 >> 8 & 0xFF) * local553);
		if (local589 > 255) {
			local589 = 255;
		}
		@Pc(602) int local602 = (int) ((float) (local564 & 0xFF) * local553);
		if (this.aClass16_Sub2_22.aBoolean322) {
			this.aClass3_Sub17_Sub1_2.method4226((float) local20);
			this.aClass3_Sub17_Sub1_2.method4226((float) local36);
			this.aClass3_Sub17_Sub1_2.method4226((float) local29);
		} else {
			this.aClass3_Sub17_Sub1_2.method4229((float) local20);
			this.aClass3_Sub17_Sub1_2.method4229((float) local36);
			this.aClass3_Sub17_Sub1_2.method4229((float) local29);
		}
		if (local602 > 255) {
			local602 = 255;
		}
		this.aClass3_Sub17_Sub1_2.method4849(local574);
		this.aClass3_Sub17_Sub1_2.method4849(local589);
		this.aClass3_Sub17_Sub1_2.method4849(local602);
		this.aClass3_Sub17_Sub1_2.method4849(255);
		this.method3970(local83);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IS)V")
	private void method3970(@OriginalArg(1) short arg0) {
		if (this.aClass16_Sub2_22.aBoolean322) {
			this.aClass3_Sub17_6.method4876(arg0);
		} else {
			this.aClass3_Sub17_6.method4843(arg0);
		}
	}
}
