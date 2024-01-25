import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kr")
public final class Class169 {

	@OriginalMember(owner = "client!kr", name = "c", descriptor = "[[Lclient!saa;")
	private final Class46_Sub3_Sub1[][] aClass46_Sub3_Sub1ArrayArray1 = new Class46_Sub3_Sub1[1600][64];

	@OriginalMember(owner = "client!kr", name = "l", descriptor = "[I")
	private final int[] anIntArray414 = new int[1600];

	@OriginalMember(owner = "client!kr", name = "k", descriptor = "[I")
	private final int[] anIntArray413 = new int[8191];

	@OriginalMember(owner = "client!kr", name = "n", descriptor = "I")
	private int anInt5015 = 0;

	@OriginalMember(owner = "client!kr", name = "r", descriptor = "[[Lclient!saa;")
	private final Class46_Sub3_Sub1[][] aClass46_Sub3_Sub1ArrayArray2 = new Class46_Sub3_Sub1[64][768];

	@OriginalMember(owner = "client!kr", name = "o", descriptor = "[I")
	private final int[] anIntArray415 = new int[64];

	@OriginalMember(owner = "client!kr", name = "m", descriptor = "Lclient!rq;")
	private final Interface16 anInterface16_6;

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "Lclient!vr;")
	private final Class310 aClass310_13;

	@OriginalMember(owner = "client!kr", name = "i", descriptor = "Lclient!iaa;")
	private final Interface9 anInterface9_6;

	@OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lclient!bda;)V")
	public Class169(@OriginalArg(0) Class4_Sub2 arg0) {
		this.anInterface16_6 = arg0.method7250(true);
		this.aClass310_13 = arg0.method7266(new Class154[] { new Class154(new Class313[] { Static525.aClass313_1, Static525.aClass313_3, Static525.aClass313_5 }) });
		this.anInterface9_6 = arg0.method7227(false);
		this.anInterface9_6.method7607(49146);
		@Pc(78) Buffer local78 = this.anInterface9_6.method7613();
		if (local78 != null) {
			@Pc(85) Stream local85 = arg0.method7263(local78);
			@Pc(89) int local89;
			@Pc(95) int local95;
			if (Stream.a()) {
				for (local89 = 0; local89 < 8191; local89++) {
					local95 = local89 * 4;
					local85.c(local95);
					local85.c(local95 + 1);
					local85.c(local95 + 2);
					local85.c(local95 + 2);
					local85.c(local95 + 3);
					local85.c(local95);
				}
			} else {
				for (local89 = 0; local89 < 8191; local89++) {
					local95 = local89 * 4;
					local85.d(local95);
					local85.d(local95 + 1);
					local85.d(local95 + 2);
					local85.d(local95 + 2);
					local85.d(local95 + 3);
					local85.d(local95);
				}
			}
			local85.b();
			this.anInterface9_6.method7614();
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILclient!bda;)V")
	private void method4645(@OriginalArg(1) Class4_Sub2 arg0) {
		Static524.aFloat189 = arg0.aFloat176;
		arg0.method7240();
		arg0.method7294(false);
		arg0.method7348(false);
		arg0.method7274();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V")
	public void method4646() {
		this.anInterface16_6.method7609();
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!bda;II)V")
	private void method4647(@OriginalArg(0) Class4_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		@Pc(11) Class128_Sub3 local11 = arg0.method7225();
		@Pc(14) float local14 = local11.aFloat161;
		@Pc(23) float local23 = local11.aFloat156;
		@Pc(26) float local26 = local11.aFloat152;
		@Pc(29) float local29 = local11.aFloat159;
		@Pc(32) float local32 = local11.aFloat158;
		@Pc(35) float local35 = local11.aFloat160;
		@Pc(39) float local39 = local29 + local14;
		@Pc(43) float local43 = local32 + local23;
		@Pc(47) float local47 = local35 + local26;
		@Pc(52) float local52 = local14 - local29;
		@Pc(57) float local57 = local23 - local32;
		@Pc(62) float local62 = local26 - local35;
		@Pc(67) float local67 = local29 - local14;
		@Pc(71) float local71 = local32 - local23;
		@Pc(75) float local75 = local35 - local26;
		@Pc(81) Buffer local81 = this.anInterface16_6.method7613();
		if (local81 == null) {
			return;
		}
		@Pc(89) Stream local89 = arg0.method7263(local81);
		@Pc(95) int local95;
		@Pc(110) int local110;
		@Pc(119) int local119;
		@Pc(128) Class46_Sub3_Sub1 local128;
		@Pc(131) int local131;
		@Pc(136) byte local136;
		@Pc(141) byte local141;
		@Pc(144) byte local144;
		@Pc(149) byte local149;
		@Pc(155) float local155;
		@Pc(161) float local161;
		@Pc(167) float local167;
		@Pc(172) int local172;
		@Pc(419) float local419;
		@Pc(424) int local424;
		@Pc(364) int local364;
		@Pc(380) Class46_Sub3_Sub1 local380;
		@Pc(383) int local383;
		@Pc(396) byte local396;
		@Pc(401) byte local401;
		@Pc(413) float local413;
		if (Stream.a()) {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray414[local95] <= 64 ? this.anIntArray414[local95] : 64;
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass46_Sub3_Sub1ArrayArray1[local95][local119];
						local131 = local128.anInt4605;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt4593 >> 12;
						local161 = local128.anInt4601 >> 12;
						local167 = local128.anInt4597 >> 12;
						local172 = local128.anInt4604 >> 12;
						local89.b(local155 + local39 * (float) -local172);
						local89.b((float) -local172 * local43 + local161);
						local89.b((float) -local172 * local47 + local167);
						local89.a(local144);
						local89.a(local141);
						local89.a(local136);
						local89.a(local149);
						local89.b(0.0F);
						local89.b(0.0F);
						local89.b((float) local172 * local52 + local155);
						local89.b(local161 + (float) local172 * local57);
						local89.b(local62 * (float) local172 + local167);
						local89.a(local144);
						local89.a(local141);
						local89.a(local136);
						local89.a(local149);
						local89.b(1.0F);
						local89.b(0.0F);
						local89.b((float) local172 * local39 + local155);
						local89.b((float) local172 * local43 + local161);
						local89.b((float) local172 * local47 + local167);
						local89.a(local144);
						local89.a(local141);
						local89.a(local136);
						local89.a(local149);
						local89.b(1.0F);
						local89.b(1.0F);
						local89.b(local155 + local67 * (float) local172);
						local89.b((float) local172 * local71 + local161);
						local89.b(local75 * (float) local172 + local167);
						local89.a(local144);
						local89.a(local141);
						local89.a(local136);
						local89.a(local149);
						local89.b(0.0F);
						local89.b(1.0F);
						local7++;
					}
					if (this.anIntArray414[local95] > 64) {
						local364 = this.anIntArray414[local95] - 64 - 1;
						for (local131 = this.anIntArray415[local364] - 1; local131 >= 0; local131--) {
							local380 = this.aClass46_Sub3_Sub1ArrayArray2[local364][local131];
							local383 = local380.anInt4605;
							local144 = (byte) (local383 >> 16);
							local149 = (byte) (local383 >> 8);
							local396 = (byte) local383;
							local401 = (byte) (local383 >>> 24);
							local167 = local380.anInt4593 >> 12;
							local413 = local380.anInt4601 >> 12;
							local419 = local380.anInt4597 >> 12;
							local424 = local380.anInt4604 >> 12;
							local89.b(local167 + local39 * (float) -local424);
							local89.b(local413 + local43 * (float) -local424);
							local89.b(local419 + (float) -local424 * local47);
							local89.a(local396);
							local89.a(local149);
							local89.a(local144);
							local89.a(local401);
							local89.b(0.0F);
							local89.b(0.0F);
							local89.b(local52 * (float) local424 + local167);
							local89.b(local413 + (float) local424 * local57);
							local89.b((float) local424 * local62 + local419);
							local89.a(local396);
							local89.a(local149);
							local89.a(local144);
							local89.a(local401);
							local89.b(1.0F);
							local89.b(0.0F);
							local89.b(local167 + local39 * (float) local424);
							local89.b((float) local424 * local43 + local413);
							local89.b(local419 + (float) local424 * local47);
							local89.a(local396);
							local89.a(local149);
							local89.a(local144);
							local89.a(local401);
							local89.b(1.0F);
							local89.b(1.0F);
							local89.b(local67 * (float) local424 + local167);
							local89.b(local71 * (float) local424 + local413);
							local89.b(local419 + local75 * (float) local424);
							local89.a(local396);
							local89.a(local149);
							local89.a(local144);
							local89.a(local401);
							local89.b(0.0F);
							local7++;
							local89.b(1.0F);
						}
					}
				}
			}
		} else {
			for (local95 = arg1 - 1; local95 >= 0; local95--) {
				local110 = this.anIntArray414[local95] > 64 ? 64 : this.anIntArray414[local95];
				if (local110 > 0) {
					for (local119 = local110 - 1; local119 >= 0; local119--) {
						local128 = this.aClass46_Sub3_Sub1ArrayArray1[local95][local119];
						local131 = local128.anInt4605;
						local136 = (byte) (local131 >> 16);
						local141 = (byte) (local131 >> 8);
						local144 = (byte) local131;
						local149 = (byte) (local131 >>> 24);
						local155 = local128.anInt4593 >> 12;
						local161 = local128.anInt4601 >> 12;
						local167 = local128.anInt4597 >> 12;
						local172 = local128.anInt4604 >> 12;
						local89.a((float) -local172 * local39 + local155);
						local89.a(local161 + (float) -local172 * local43);
						local89.a(local47 * (float) -local172 + local167);
						local89.a(local144);
						local89.a(local141);
						local89.a(local136);
						local89.a(local149);
						local89.a(0.0F);
						local89.a(0.0F);
						local89.a(local52 * (float) local172 + local155);
						local89.a(local161 + local57 * (float) local172);
						local89.a(local62 * (float) local172 + local167);
						local89.a(local144);
						local89.a(local141);
						local89.a(local136);
						local89.a(local149);
						local89.a(1.0F);
						local89.a(0.0F);
						local89.a((float) local172 * local39 + local155);
						local89.a(local43 * (float) local172 + local161);
						local89.a(local167 + (float) local172 * local47);
						local89.a(local144);
						local89.a(local141);
						local89.a(local136);
						local89.a(local149);
						local89.a(1.0F);
						local89.a(1.0F);
						local89.a((float) local172 * local67 + local155);
						local89.a(local161 + (float) local172 * local71);
						local89.a(local167 + local75 * (float) local172);
						local89.a(local144);
						local89.a(local141);
						local89.a(local136);
						local89.a(local149);
						local89.a(0.0F);
						local7++;
						local89.a(1.0F);
					}
					if (this.anIntArray414[local95] > 64) {
						local364 = this.anIntArray414[local95] - 64 - 1;
						for (local131 = this.anIntArray415[local364] - 1; local131 >= 0; local131--) {
							local380 = this.aClass46_Sub3_Sub1ArrayArray2[local364][local131];
							local383 = local380.anInt4605;
							local144 = (byte) (local383 >> 16);
							local149 = (byte) (local383 >> 8);
							local396 = (byte) local383;
							local401 = (byte) (local383 >>> 24);
							local167 = local380.anInt4593 >> 12;
							local413 = local380.anInt4601 >> 12;
							local419 = local380.anInt4597 >> 12;
							local424 = local380.anInt4604 >> 12;
							local89.a(local39 * (float) -local424 + local167);
							local89.a(local43 * (float) -local424 + local413);
							local89.a(local47 * (float) -local424 + local419);
							local89.a(local396);
							local89.a(local149);
							local89.a(local144);
							local89.a(local401);
							local89.a(0.0F);
							local89.a(0.0F);
							local89.a((float) local424 * local52 + local167);
							local89.a(local57 * (float) local424 + local413);
							local89.a(local419 + local62 * (float) local424);
							local89.a(local396);
							local89.a(local149);
							local89.a(local144);
							local89.a(local401);
							local89.a(1.0F);
							local89.a(0.0F);
							local89.a(local167 + (float) local424 * local39);
							local89.a(local413 + local43 * (float) local424);
							local89.a(local419 + local47 * (float) local424);
							local89.a(local396);
							local89.a(local149);
							local89.a(local144);
							local89.a(local401);
							local89.a(1.0F);
							local89.a(1.0F);
							local89.a(local167 + local67 * (float) local424);
							local89.a((float) local424 * local71 + local413);
							local89.a(local75 * (float) local424 + local419);
							local89.a(local396);
							local89.a(local149);
							local89.a(local144);
							local89.a(local401);
							local89.a(0.0F);
							local7++;
							local89.a(1.0F);
						}
					}
				}
			}
		}
		local89.b();
		if (this.anInterface16_6.method7614()) {
			arg0.method7268(this.aClass310_13);
			arg0.method7251(this.anInterface16_6, 0);
			arg0.method7291(0, local7 * 4, Static416.aClass263_5, this.anInterface9_6, local7 * 2, 0);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!bda;Z)V")
	private void method4649(@OriginalArg(0) Class4_Sub2 arg0) {
		arg0.method7348(true);
		arg0.method7294(true);
		if (arg0.aFloat176 != Static524.aFloat189) {
			arg0.M(Static524.aFloat189);
		}
	}

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "(Lclient!ka;ZLclient!bda;)V")
	public void method4650(@OriginalArg(0) Class158 arg0, @OriginalArg(2) Class4_Sub2 arg1) {
		if (arg1.aClass128_Sub3_16 == null) {
			return;
		}
		this.method4645(arg1);
		@Pc(17) float local17 = arg1.aClass128_Sub3_16.aFloat157;
		@Pc(21) float local21 = arg1.aClass128_Sub3_16.aFloat154;
		@Pc(25) float local25 = arg1.aClass128_Sub3_16.aFloat153;
		@Pc(29) float local29 = arg1.aClass128_Sub3_16.aFloat150;
		try {
			@Pc(39) int local39;
			@Pc(49) int local49;
			@Pc(72) Class46_Sub3 local72;
			@Pc(85) int local85;
			@Pc(181) int local181;
			if (arg0.aBoolean355) {
				local39 = arg0.anInt4644 - arg0.anInt4643;
				if (local39 + 2 <= 1600) {
					local39 += 2;
					local49 = 0;
				} else {
					local49 = Static509.method7779(local39) + 1 - Static369.anInt6642;
					local39 = (local39 >> local49) + 2;
				}
				@Pc(69) Class46_Sub3 local69 = arg0.aClass185_1.aClass46_Sub3_7;
				local72 = local69.aClass46_Sub3_9;
				@Pc(74) int local74 = -2;
				@Pc(76) boolean local76 = true;
				@Pc(78) boolean local78 = true;
				while (local69 != local72) {
					this.anInt5015 = 0;
					for (local85 = 0; local85 < local39; local85++) {
						this.anIntArray414[local85] = 0;
					}
					for (@Pc(102) int local102 = 0; local102 < 64; local102++) {
						this.anIntArray415[local102] = 0;
					}
					while (local72 != local69) {
						@Pc(118) Class46_Sub3_Sub1 local118 = (Class46_Sub3_Sub1) local72;
						if (local78) {
							local76 = local118.aBoolean349;
							local74 = local118.anInt4600;
							local78 = false;
						} else if (local118.anInt4600 != local74 || local76 != local118.aBoolean349) {
							local78 = true;
							break;
						}
						local181 = (int) (local25 * (float) (local118.anInt4597 >> 12) + (float) (local118.anInt4601 >> 12) * local21 + local17 * (float) (local118.anInt4593 >> 12) + local29) - arg0.anInt4643 >> local49;
						if (local181 < 1600) {
							if (this.anIntArray414[local181] < 64) {
								this.aClass46_Sub3_Sub1ArrayArray1[local181][this.anIntArray414[local181]++] = local118;
							} else {
								label192: {
									if (this.anIntArray414[local181] == 64) {
										if (this.anInt5015 == 64) {
											break label192;
										}
										this.anIntArray414[local181] += this.anInt5015++ + 1;
									}
									this.aClass46_Sub3_Sub1ArrayArray2[this.anIntArray414[local181] - 65][this.anIntArray415[this.anIntArray414[local181] - 64 - 1]++] = local118;
								}
							}
						}
						local72 = local72.aClass46_Sub3_9;
					}
					arg1.method7281(local74 >= 0 ? local74 : -1, false, false);
					if (local76 && Static524.aFloat189 != arg1.aFloat176) {
						arg1.M(Static524.aFloat189);
					} else if (arg1.aFloat176 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method4647(arg1, local39);
				}
			} else {
				local39 = 0;
				local49 = Integer.MAX_VALUE;
				@Pc(315) int local315 = 0;
				local72 = arg0.aClass185_1.aClass46_Sub3_7;
				@Pc(322) Class46_Sub3 local322;
				@Pc(354) int local354;
				for (local322 = local72.aClass46_Sub3_9; local322 != local72; local322 = local322.aClass46_Sub3_9) {
					@Pc(327) Class46_Sub3_Sub1 local327 = (Class46_Sub3_Sub1) local322;
					local354 = (int) (local29 + (float) (local327.anInt4593 >> 12) * local17 + local21 * (float) (local327.anInt4601 >> 12) + local25 * (float) (local327.anInt4597 >> 12));
					if (local49 > local354) {
						local49 = local354;
					}
					if (local354 > local315) {
						local315 = local354;
					}
					this.anIntArray413[local39++] = local354;
				}
				@Pc(389) int local389 = local315 - local49;
				if (local389 + 2 <= 1600) {
					local389 += 2;
					local354 = 0;
				} else {
					local354 = Static509.method7779(local389) + 1 - Static369.anInt6642;
					local389 = (local389 >> local354) + 2;
				}
				local322 = local72.aClass46_Sub3_9;
				local39 = 0;
				local85 = -2;
				@Pc(425) boolean local425 = true;
				@Pc(427) boolean local427 = true;
				while (local72 != local322) {
					this.anInt5015 = 0;
					for (local181 = 0; local181 < local389; local181++) {
						this.anIntArray414[local181] = 0;
					}
					for (@Pc(451) int local451 = 0; local451 < 64; local451++) {
						this.anIntArray415[local451] = 0;
					}
					while (local322 != local72) {
						@Pc(467) Class46_Sub3_Sub1 local467 = (Class46_Sub3_Sub1) local322;
						if (local427) {
							local427 = false;
							local425 = local467.aBoolean349;
							local85 = local467.anInt4600;
						}
						if (local39 > 0 && (local467.anInt4600 != local85 || local425 != local467.aBoolean349)) {
							local427 = true;
							break;
						}
						@Pc(513) int local513 = this.anIntArray413[local39++] - local49 >> local354;
						if (local513 < 1600) {
							if (this.anIntArray414[local513] < 64) {
								this.aClass46_Sub3_Sub1ArrayArray1[local513][this.anIntArray414[local513]++] = local467;
							} else {
								label142: {
									if (this.anIntArray414[local513] == 64) {
										if (this.anInt5015 == 64) {
											break label142;
										}
										this.anIntArray414[local513] += this.anInt5015++ + 1;
									}
									this.aClass46_Sub3_Sub1ArrayArray2[this.anIntArray414[local513] - 65][this.anIntArray415[this.anIntArray414[local513] - 1 - 64]++] = local467;
								}
							}
						}
						local322 = local322.aClass46_Sub3_9;
					}
					arg1.method7281(local85 >= 0 ? local85 : -1, false, false);
					if (local425 && Static524.aFloat189 != arg1.aFloat176) {
						arg1.M(Static524.aFloat189);
					} else if (arg1.aFloat176 != 1.0F) {
						arg1.M(1.0F);
					}
					this.method4647(arg1, local389);
				}
			}
		} catch (@Pc(644) Exception local644) {
		}
		this.method4649(arg1);
	}

	@OriginalMember(owner = "client!kr", name = "b", descriptor = "(Lclient!bda;Z)V")
	public void method4651(@OriginalArg(0) Class4_Sub2 arg0) {
		this.anInterface16_6.method7616(196584, 24);
	}
}
