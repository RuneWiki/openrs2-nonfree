import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mw")
public final class Class3_Sub35 extends Class3 {

	@OriginalMember(owner = "client!mw", name = "F", descriptor = "I")
	private int anInt6025;

	@OriginalMember(owner = "client!mw", name = "p", descriptor = "Lclient!eq;")
	private final Class3_Sub10 aClass3_Sub10_3;

	@OriginalMember(owner = "client!mw", name = "m", descriptor = "Lclient!mea;")
	private final Class34_Sub3 aClass34_Sub3_3;

	@OriginalMember(owner = "client!mw", name = "r", descriptor = "Lclient!vj;")
	private final Class45_Sub3 aClass45_Sub3_35;

	@OriginalMember(owner = "client!mw", name = "u", descriptor = "I")
	private final int anInt6019;

	@OriginalMember(owner = "client!mw", name = "n", descriptor = "I")
	private final int anInt6017;

	@OriginalMember(owner = "client!mw", name = "q", descriptor = "I")
	private final int anInt6018;

	@OriginalMember(owner = "client!mw", name = "E", descriptor = "I")
	private final int anInt6024;

	@OriginalMember(owner = "client!mw", name = "C", descriptor = "[[F")
	private float[][] aFloatArrayArray13;

	@OriginalMember(owner = "client!mw", name = "t", descriptor = "[[F")
	private float[][] aFloatArrayArray11;

	@OriginalMember(owner = "client!mw", name = "x", descriptor = "[[F")
	private float[][] aFloatArrayArray12;

	@OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
	private int anInt6022;

	@OriginalMember(owner = "client!mw", name = "l", descriptor = "Lclient!cn;")
	private final Interface2 anInterface2_4;

	@OriginalMember(owner = "client!mw", name = "o", descriptor = "Lclient!ut;")
	private final Interface21 anInterface21_5;

	@OriginalMember(owner = "client!mw", name = "D", descriptor = "Lclient!hea;")
	private final Class126 aClass126_14;

	@OriginalMember(owner = "client!mw", name = "s", descriptor = "Lclient!hea;")
	private final Class126 aClass126_13;

	@OriginalMember(owner = "client!mw", name = "v", descriptor = "Lclient!np;")
	private Class3_Sub11 aClass3_Sub11_3;

	@OriginalMember(owner = "client!mw", name = "B", descriptor = "Lclient!nea;")
	private Class3_Sub11_Sub2 aClass3_Sub11_Sub2_2;

	@OriginalMember(owner = "client!mw", name = "k", descriptor = "Lclient!wa;")
	private Class354 aClass354_29;

	@OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lclient!vj;Lclient!mea;Lclient!eq;[I)V")
	public Class3_Sub35(@OriginalArg(0) Class45_Sub3 arg0, @OriginalArg(1) Class34_Sub3 arg1, @OriginalArg(2) Class3_Sub10 arg2, @OriginalArg(3) int[] arg3) {
		this.aClass3_Sub10_3 = arg2;
		this.aClass34_Sub3_3 = arg1;
		this.aClass45_Sub3_35 = arg0;
		@Pc(22) int local22 = this.aClass3_Sub10_3.method6018() - (arg1.anInt7850 >> 1);
		this.anInt6019 = this.aClass3_Sub10_3.method6021() - local22 >> arg1.anInt7856;
		this.anInt6017 = local22 + this.aClass3_Sub10_3.method6021() >> arg1.anInt7856;
		this.anInt6018 = this.aClass3_Sub10_3.method6015() - local22 >> arg1.anInt7856;
		this.anInt6024 = this.aClass3_Sub10_3.method6015() + local22 >> arg1.anInt7856;
		@Pc(77) int local77 = this.anInt6017 + 1 - this.anInt6019;
		@Pc(86) int local86 = this.anInt6024 + 1 - this.anInt6018;
		this.aFloatArrayArray13 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray11 = new float[local77 + 1][local86 + 1];
		this.aFloatArrayArray12 = new float[local77 + 1][local86 + 1];
		@Pc(122) int local122;
		@Pc(136) int local136;
		@Pc(143) int local143;
		@Pc(173) int local173;
		@Pc(189) int local189;
		for (@Pc(115) int local115 = 0; local115 <= local86; local115++) {
			local122 = this.anInt6018 + local115;
			if (local122 > 0 && local122 < this.aClass34_Sub3_3.anInt7852 - 1) {
				for (local136 = 0; local136 <= local77; local136++) {
					local143 = local136 + this.anInt6019;
					if (local143 > 0 && local143 < this.aClass34_Sub3_3.anInt7854 - 1) {
						local173 = arg1.method6525(local122, local143 + 1) - arg1.method6525(local122, local143 - 1);
						local189 = arg1.method6525(local122 + 1, local143) - arg1.method6525(local122 - 1, local143);
						@Pc(204) float local204 = (float) (1.0D / Math.sqrt((double) (local173 * local173 + local189 * local189 + 65536)));
						this.aFloatArrayArray11[local136][local115] = (float) local173 * local204;
						this.aFloatArrayArray12[local136][local115] = local204 * -256.0F;
						this.aFloatArrayArray13[local136][local115] = (float) local189 * local204;
					}
				}
			}
		}
		local122 = 0;
		@Pc(292) int local292;
		for (local136 = this.anInt6018; local136 <= this.anInt6024; local136++) {
			if (local136 >= 0 && local136 < arg1.anInt7852) {
				for (local143 = this.anInt6019; local143 <= this.anInt6017; local143++) {
					if (local143 >= 0 && arg1.anInt7854 > local143) {
						local173 = arg3[local122];
						@Pc(280) int[] local280 = arg1.anIntArrayArrayArray15[local143][local136];
						if (local280 != null && local173 != 0) {
							if (local173 == 1) {
								local292 = 0;
								while (local280.length > local292) {
									if (local280[local292++] != -1 && local280[local292++] != -1 && local280[local292++] != -1) {
										this.anInt6022 += 3;
									}
								}
							} else {
								this.anInt6022 += 3;
							}
						}
					}
					local122++;
				}
			} else {
				local122 += this.anInt6017 - this.anInt6019;
			}
		}
		if (this.anInt6022 <= 0) {
			this.anInterface2_4 = null;
			this.anInterface21_5 = null;
			this.aClass126_14 = null;
			this.aClass126_13 = null;
		} else {
			this.aClass3_Sub11_3 = new Class3_Sub11(this.anInt6022 * 2);
			this.aClass3_Sub11_Sub2_2 = new Class3_Sub11_Sub2(this.anInt6022 * 16);
			this.aClass354_29 = new Class354(Static371.method5424(this.anInt6022));
			local143 = 0;
			local122 = 0;
			for (local173 = this.anInt6018; local173 <= this.anInt6024; local173++) {
				if (local173 >= 0 && arg1.anInt7852 > local173) {
					local189 = 0;
					for (local292 = this.anInt6019; local292 <= this.anInt6017; local292++) {
						if (local292 >= 0 && local292 < arg1.anInt7854) {
							@Pc(449) int local449 = arg3[local122];
							@Pc(456) int[] local456 = arg1.anIntArrayArrayArray15[local292][local173];
							if (local456 != null && local449 != 0) {
								if (local449 == 1) {
									@Pc(470) int[] local470 = arg1.anIntArrayArrayArray12[local292][local173];
									@Pc(477) int[] local477 = arg1.anIntArrayArrayArray14[local292][local173];
									@Pc(479) int local479 = 0;
									label108: while (true) {
										while (true) {
											if (local479 >= local456.length) {
												break label108;
											}
											if (local456[local479] == -1 || local456[local479 + 1] == -1 || local456[local479 + 2] == -1) {
												local479 += 3;
											} else {
												this.method5086(local143, local470[local479], local189, local477[local479], local173, local292);
												local479++;
												this.method5086(local143, local470[local479], local189, local477[local479], local173, local292);
												local479++;
												this.method5086(local143, local470[local479], local189, local477[local479], local173, local292);
												local479++;
											}
										}
									}
								} else if (local449 == 3) {
									this.method5086(local143, 0, local189, 0, local173, local292);
									this.method5086(local143, arg1.anInt7850, local189, 0, local173, local292);
									this.method5086(local143, 0, local189, arg1.anInt7850, local173, local292);
								} else if (local449 == 2) {
									this.method5086(local143, arg1.anInt7850, local189, 0, local173, local292);
									this.method5086(local143, arg1.anInt7850, local189, arg1.anInt7850, local173, local292);
									this.method5086(local143, 0, local189, 0, local173, local292);
								} else if (local449 == 5) {
									this.method5086(local143, arg1.anInt7850, local189, arg1.anInt7850, local173, local292);
									this.method5086(local143, 0, local189, arg1.anInt7850, local173, local292);
									this.method5086(local143, arg1.anInt7850, local189, 0, local173, local292);
								} else if (local449 == 4) {
									this.method5086(local143, 0, local189, arg1.anInt7850, local173, local292);
									this.method5086(local143, 0, local189, 0, local173, local292);
									this.method5086(local143, arg1.anInt7850, local189, arg1.anInt7850, local173, local292);
								}
							}
						}
						local189++;
						local122++;
					}
				} else {
					local122 += this.anInt6017 - this.anInt6019;
				}
				local143++;
			}
			this.anInterface2_4 = this.aClass45_Sub3_35.method7477(this.aClass3_Sub11_3.anInt6128, false, this.aClass3_Sub11_3.aByteArray62);
			this.anInterface21_5 = this.aClass45_Sub3_35.method7517(this.aClass3_Sub11_Sub2_2.aByteArray62, 16, false, this.aClass3_Sub11_Sub2_2.anInt6128);
			this.aClass126_13 = new Class126(this.anInterface21_5, 5126, 3, 0);
			this.aClass126_14 = new Class126(this.anInterface21_5, 5121, 4, 12);
		}
		this.aFloatArrayArray11 = this.aFloatArrayArray12 = this.aFloatArrayArray13 = null;
		this.aClass3_Sub11_Sub2_2 = null;
		this.aClass3_Sub11_3 = null;
		this.aClass354_29 = null;
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIIIIII)V")
	private void method5086(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = -1L;
		@Pc(16) int local16 = arg1 + (arg5 << this.aClass34_Sub3_3.anInt7856);
		@Pc(25) int local25 = arg3 + (arg4 << this.aClass34_Sub3_3.anInt7856);
		@Pc(32) int local32 = this.aClass34_Sub3_3.method6530(local16, local25);
		if ((arg1 & 0x7F) == 0 || (arg3 & 0x7F) == 0) {
			local7 = (long) local16 & 0xFFFFL | 0xFFFFL << 16 & (long) local25 << 16;
			@Pc(63) Class3 local63 = this.aClass354_29.method7689(local7);
			if (local63 != null) {
				this.method5088(((Class3_Sub40) local63).aShort116);
				return;
			}
		}
		@Pc(81) short local81 = (short) this.anInt6025++;
		if (local7 != -1L) {
			this.aClass354_29.method7691(new Class3_Sub40(local81), local7);
		}
		@Pc(124) float local124;
		@Pc(117) float local117;
		@Pc(110) float local110;
		@Pc(261) float local261;
		@Pc(269) float local269;
		@Pc(276) float local276;
		@Pc(283) float local283;
		@Pc(290) float local290;
		@Pc(299) float local299;
		@Pc(308) float local308;
		@Pc(367) float local367;
		if (arg1 == 0 && arg3 == 0) {
			local110 = this.aFloatArrayArray13[arg2][arg0];
			local117 = this.aFloatArrayArray12[arg2][arg0];
			local124 = this.aFloatArrayArray11[arg2][arg0];
		} else if (arg1 == this.aClass34_Sub3_3.anInt7850 && arg3 == 0) {
			local110 = this.aFloatArrayArray13[arg2 + 1][arg0];
			local124 = this.aFloatArrayArray11[arg2 + 1][arg0];
			local117 = this.aFloatArrayArray12[arg2 + 1][arg0];
		} else if (arg1 == this.aClass34_Sub3_3.anInt7850 && this.aClass34_Sub3_3.anInt7850 == arg3) {
			local117 = this.aFloatArrayArray12[arg2 + 1][arg0 + 1];
			local124 = this.aFloatArrayArray11[arg2 + 1][arg0 + 1];
			local110 = this.aFloatArrayArray13[arg2 + 1][arg0 + 1];
		} else if (arg1 == 0 && this.aClass34_Sub3_3.anInt7850 == arg3) {
			local124 = this.aFloatArrayArray11[arg2][arg0 + 1];
			local117 = this.aFloatArrayArray12[arg2][arg0 + 1];
			local110 = this.aFloatArrayArray13[arg2][arg0 + 1];
		} else {
			local261 = (float) arg1 / (float) this.aClass34_Sub3_3.anInt7850;
			local269 = (float) arg3 / (float) this.aClass34_Sub3_3.anInt7850;
			local276 = this.aFloatArrayArray11[arg2][arg0];
			local283 = this.aFloatArrayArray12[arg2][arg0];
			local290 = this.aFloatArrayArray13[arg2][arg0];
			local299 = this.aFloatArrayArray11[arg2 + 1][arg0];
			local308 = this.aFloatArrayArray12[arg2 + 1][arg0];
			@Pc(325) float local325 = local299 + (this.aFloatArrayArray11[arg2 + 1][arg0 + 1] - local299) * local261;
			@Pc(343) float local343 = local308 + local261 * (this.aFloatArrayArray12[arg2 + 1][arg0 + 1] - local308);
			@Pc(358) float local358 = local283 + local261 * (this.aFloatArrayArray12[arg2][arg0 + 1] - local283);
			local367 = this.aFloatArrayArray13[arg2 + 1][arg0];
			@Pc(382) float local382 = local290 + (this.aFloatArrayArray13[arg2][arg0 + 1] - local290) * local261;
			@Pc(398) float local398 = local276 + (this.aFloatArrayArray11[arg2][arg0 + 1] - local276) * local261;
			local117 = (local343 - local358) * local269 + local358;
			local124 = local269 * (local325 - local398) + local398;
			@Pc(432) float local432 = local367 + (this.aFloatArrayArray13[arg2 + 1][arg0 + 1] - local367) * local261;
			local110 = local269 * (local432 - local382) + local382;
		}
		local261 = this.aClass3_Sub10_3.method6021() - local16;
		local269 = this.aClass3_Sub10_3.method6011() - local32;
		local276 = this.aClass3_Sub10_3.method6015() - local25;
		local283 = (float) Math.sqrt((double) (local261 * local261 + local269 * local269 + local276 * local276));
		local290 = 1.0F / local283;
		local261 *= local290;
		local269 *= local290;
		local276 *= local290;
		local299 = local283 / (float) this.aClass3_Sub10_3.method6018();
		local308 = 1.0F - local299 * local299;
		if (local308 < 0.0F) {
			local308 = 0.0F;
		}
		local367 = local110 * local276 + local261 * local124 + local117 * local269;
		if (local367 < 0.0F) {
			local367 = 0.0F;
		}
		@Pc(547) float local547 = local308 * 2.0F * local367;
		if (local547 > 1.0F) {
			local547 = 1.0F;
		}
		@Pc(558) int local558 = this.aClass3_Sub10_3.method6020();
		@Pc(568) int local568 = (int) (local547 * (float) (local558 >> 16 & 0xFF));
		if (local568 > 255) {
			local568 = 255;
		}
		@Pc(583) int local583 = (int) ((float) (local558 >> 8 & 0xFF) * local547);
		if (local583 > 255) {
			local583 = 255;
		}
		@Pc(596) int local596 = (int) (local547 * (float) (local558 & 0xFF));
		if (local596 > 255) {
			local596 = 255;
		}
		if (this.aClass45_Sub3_35.aBoolean687) {
			this.aClass3_Sub11_Sub2_2.method5233((float) local16);
			this.aClass3_Sub11_Sub2_2.method5233((float) local32);
			this.aClass3_Sub11_Sub2_2.method5233((float) local25);
		} else {
			this.aClass3_Sub11_Sub2_2.method5234((float) local16);
			this.aClass3_Sub11_Sub2_2.method5234((float) local32);
			this.aClass3_Sub11_Sub2_2.method5234((float) local25);
		}
		this.aClass3_Sub11_Sub2_2.method5213(local568);
		this.aClass3_Sub11_Sub2_2.method5213(local583);
		this.aClass3_Sub11_Sub2_2.method5213(local596);
		this.aClass3_Sub11_Sub2_2.method5213(255);
		this.method5088(local81);
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(IBI[[ZI)V")
	public void method5087(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean[][] arg2, @OriginalArg(4) int arg3) {
		if (this.anInterface2_4 == null || (this.anInt6019 > arg1 + arg0 || (this.anInt6017 < arg1 - arg0 || (this.anInt6018 > arg0 + arg3 || arg3 - arg0 > this.anInt6024)))) {
			return;
		}
		for (@Pc(59) int local59 = this.anInt6018; local59 <= this.anInt6024; local59++) {
			for (@Pc(64) int local64 = this.anInt6019; local64 <= this.anInt6017; local64++) {
				@Pc(71) int local71 = local64 - arg1;
				@Pc(76) int local76 = local59 - arg3;
				if (-arg0 < local71 && local71 < arg0 && local76 > -arg0 && arg0 > local76 && arg2[arg0 + local71][local76 + arg0]) {
					this.aClass45_Sub3_35.method7458((int) (this.aClass3_Sub10_3.method6013() * 255.0F) << 24);
					this.aClass45_Sub3_35.method7498(this.aClass126_13, this.aClass126_14, null, null);
					this.aClass45_Sub3_35.method7482(this.anInterface2_4, 0, this.anInt6022);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!mw", name = "a", descriptor = "(SI)V")
	private void method5088(@OriginalArg(0) short arg0) {
		if (this.aClass45_Sub3_35.aBoolean687) {
			this.aClass3_Sub11_3.method5200(arg0);
		} else {
			this.aClass3_Sub11_3.method5222(arg0);
		}
	}
}
