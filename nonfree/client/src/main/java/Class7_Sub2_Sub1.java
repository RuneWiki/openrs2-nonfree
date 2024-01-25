import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class7_Sub2_Sub1 extends Class7_Sub2 {

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!hr;IIII[[I[[II)V")
	public Class7_Sub2_Sub1(@OriginalArg(0) Class4_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "([I[I[IIZIILclient!uv;[I)V")
	private void method1676(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class298 arg6, @OriginalArg(8) int[] arg7) {
		@Pc(12) Class300 local12 = super.aClass300ArrayArray3[arg5][arg3];
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(310) int local310;
		@Pc(349) int local349;
		@Pc(424) int local424;
		@Pc(484) int local484;
		@Pc(338) int local338;
		@Pc(377) int local377;
		@Pc(436) int local436;
		@Pc(496) int local496;
		@Pc(282) int local282;
		@Pc(327) int local327;
		@Pc(395) int local395;
		@Pc(454) int local454;
		@Pc(299) int local299;
		@Pc(366) int local366;
		@Pc(413) int local413;
		@Pc(472) int local472;
		@Pc(96) int local96;
		@Pc(119) int local119;
		@Pc(143) int local143;
		@Pc(166) int local166;
		@Pc(46) int local46;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(52) int local52;
		@Pc(195) int local195;
		@Pc(69) int local69;
		@Pc(79) int local79;
		@Pc(264) int local264;
		@Pc(534) int local534;
		@Pc(766) int local766;
		if (local12 == null) {
			@Pc(1613) Class52 local1613 = super.aClass52ArrayArray3[arg5][arg3];
			if (local1613 != null) {
				if (super.anInt9579 == -1) {
					for (local484 = 0; local484 < local1613.aShort21; local484++) {
						local34 = local1613.aShortArray24[local484] + (arg5 << super.anInt9573);
						local39 = local1613.aShortArray20[local484];
						local44 = local1613.aShortArray23[local484] + (arg3 << super.anInt9573);
						local424 = super.anInt9584 + (super.anInt9583 * local44 + super.anInt9581 * local39 + local34 * super.anInt9582 >> 15);
						if (super.aClass4_Sub1_18.anInt2868 >= local424) {
							return;
						}
						arg0[local484] = 0;
						if (arg4) {
							local338 = local424 - super.aClass4_Sub1_18.anInt2880;
							if (local338 > 255) {
								local338 = 255;
							}
							if (local338 > 0) {
								arg0[local484] = local338;
								local377 = local338 * local1613.aShortArray21[local484] / 255;
								if (local377 > 0) {
									local39 -= local377;
								}
							}
						} else if (super.aClass4_Sub1_18.aBoolean247) {
							local338 = local424 - super.aClass4_Sub1_18.anInt2880;
							if (local338 > 0) {
								arg0[local484] = local338;
								if (arg0[local484] > 255) {
									arg0[local484] = 255;
								}
							}
						}
						local310 = (local39 * super.anInt9585 + super.anInt9589 * local34 + local44 * super.anInt9590 >> 15) + super.anInt9588;
						local349 = super.anInt9591 + (local34 * super.anInt9578 + super.anInt9587 * local39 + local44 * super.anInt9586 >> 15);
						arg1[local484] = super.aClass4_Sub1_18.anInt2890 * local310 / local424 + arg6.anInt8809;
						arg7[local484] = local349 * super.aClass4_Sub1_18.anInt2897 / local424 + arg6.anInt8808;
						arg2[local484] = local424;
					}
				} else {
					for (local484 = 0; local484 < local1613.aShort21; local484++) {
						local34 = local1613.aShortArray24[local484] + (arg5 << super.anInt9573);
						local39 = local1613.aShortArray20[local484];
						local44 = local1613.aShortArray23[local484] + (arg3 << super.anInt9573);
						arg0[local484] = 0;
						if (arg4) {
							local338 = -super.aClass4_Sub1_18.anInt2880 + super.anInt9579;
							if (local338 > 255) {
								local338 = 255;
							}
							if (local338 > 0) {
								arg0[local484] = local338;
								local377 = local338 * local1613.aShortArray21[local484] / 255;
								if (local377 > 0) {
									local39 -= local377;
								}
							}
						} else if (super.aClass4_Sub1_18.aBoolean247) {
							local338 = -super.aClass4_Sub1_18.anInt2880 + super.anInt9579;
							if (local338 > 0) {
								arg0[local484] = local338;
								if (arg0[local484] > 255) {
									arg0[local484] = 255;
								}
							}
						}
						local310 = super.anInt9588 + (super.anInt9585 * local39 + super.anInt9589 * local34 + super.anInt9590 * local44 >> 15);
						local349 = super.anInt9591 + (local39 * super.anInt9587 + local34 * super.anInt9578 + local44 * super.anInt9586 >> 15);
						arg1[local484] = super.aClass4_Sub1_18.anInt2890 * local310 / super.anInt9579 + arg6.anInt8809;
						arg7[local484] = local349 * super.aClass4_Sub1_18.anInt2897 / super.anInt9579 + arg6.anInt8808;
						arg2[local484] = super.anInt9579;
					}
				}
				if (local1613.aShortArray22 == null) {
					for (local484 = 0; local484 < local1613.aShort20; local484++) {
						local338 = local484 * 3;
						local377 = local338 + 1;
						local436 = local377 + 1;
						local496 = arg1[local338];
						local282 = arg1[local377];
						local327 = arg1[local436];
						local395 = arg7[local338];
						local454 = arg7[local377];
						local299 = arg7[local436];
						local366 = arg0[local377] + arg0[local338] + arg0[local436];
						if (-((local395 - local454) * (local327 - local282)) + (local299 - local454) * (-local282 + local496) > 0) {
							arg6.aBoolean665 = local496 < 0 || local282 < 0 || local327 < 0 || local496 > arg6.anInt8805 || arg6.anInt8805 < local282 || local327 > arg6.anInt8805;
							if (local366 >= 765) {
								arg6.method7693(local395, local454, local299, local496, local282, local327, arg2[local338], arg2[local377], arg2[local436], super.aClass4_Sub1_18.anInt2889);
							} else if (local366 > 0) {
								if ((local1613.anIntArray109[local338] & 0xFFFFFF) != 0) {
									arg6.method7694(local395, local454, local299, local496, local282, local327, arg2[local338], arg2[local377], arg2[local436], Static292.method5120(local1613.anIntArray109[local338], arg0[local338], super.aClass4_Sub1_18.anInt2889), Static292.method5120(local1613.anIntArray109[local377], arg0[local377], super.aClass4_Sub1_18.anInt2889), Static292.method5120(local1613.anIntArray109[local436], arg0[local436], super.aClass4_Sub1_18.anInt2889));
								}
							} else if ((local1613.anIntArray109[local338] & 0xFFFFFF) != 0) {
								arg6.method7694(local395, local454, local299, local496, local282, local327, arg2[local338], arg2[local377], arg2[local436], local1613.anIntArray109[local338], local1613.anIntArray109[local377], local1613.anIntArray109[local436]);
							}
						}
					}
				} else {
					local484 = super.anIntArrayArray126[arg5][arg3];
					local338 = super.anIntArrayArray126[arg5 + 1][arg3];
					local377 = super.anIntArrayArray126[arg5][arg3 + 1];
					local436 = super.anInt9576 * arg5;
					local496 = local436 + super.anInt9576;
					local282 = super.anInt9576 * arg3;
					local327 = local282 + super.anInt9576;
					local395 = super.anInt9588 + (super.anInt9590 * local282 + local484 * super.anInt9585 + super.anInt9589 * local436 >> 15);
					local454 = (super.anInt9578 * local436 + local484 * super.anInt9587 + local282 * super.anInt9586 >> 15) + super.anInt9591;
					local299 = super.anInt9584 + (local282 * super.anInt9583 + local436 * super.anInt9582 + local484 * super.anInt9581 >> 15);
					local366 = (local496 * super.anInt9589 + super.anInt9585 * local338 + super.anInt9590 * local282 >> 15) + super.anInt9588;
					local413 = super.anInt9591 + (super.anInt9587 * local338 + local496 * super.anInt9578 + super.anInt9586 * local282 >> 15);
					local472 = (local282 * super.anInt9583 + super.anInt9582 * local496 + local338 * super.anInt9581 >> 15) + super.anInt9584;
					local96 = super.anInt9588 + (super.anInt9590 * local327 + local377 * super.anInt9585 + super.anInt9589 * local436 >> 15);
					local119 = (super.anInt9586 * local327 + local436 * super.anInt9578 + local377 * super.anInt9587 >> 15) + super.anInt9591;
					local143 = super.anInt9584 + (local327 * super.anInt9583 + local377 * super.anInt9581 + super.anInt9582 * local436 >> 15);
					for (local166 = 0; local166 < local1613.aShort20; local166++) {
						local46 = local166 * 3;
						local48 = local46 + 1;
						local50 = local48 + 1;
						local52 = arg1[local46];
						local195 = arg1[local48];
						local69 = arg1[local50];
						local79 = arg7[local46];
						local264 = arg7[local48];
						local534 = arg7[local50];
						local766 = arg0[local46] + arg0[local48] + arg0[local50];
						if ((local534 - local264) * (local52 - local195) - (local69 - local195) * (-local264 + local79) > 0) {
							arg6.aBoolean665 = local52 < 0 || local195 < 0 || local69 < 0 || arg6.anInt8805 < local52 || local195 > arg6.anInt8805 || arg6.anInt8805 < local69;
							@Pc(2370) short local2370 = local1613.aShortArray22[local166];
							if (local766 < 765) {
								if (local2370 != -1 && this.method8252(super.aClass4_Sub1_18.anInterface13_13.method5789(local2370).aByte104)) {
									arg6.anInt8806 = 100;
								}
								if (local766 > 0) {
									if (local2370 != -1) {
										arg6.method7696(local79, local264, local534, local52, local195, local69, arg2[local46], arg2[local48], arg2[local50], super.aClass4_Sub1_18.anInt2889, arg0[local46], arg0[local48], arg0[local50], local1613.anIntArray109[local46], local1613.anIntArray109[local48], local1613.anIntArray109[local50], local395, local366, local96, local454, local413, local119, local299, local472, local143, local2370);
									} else if ((local1613.anIntArray109[local46] & 0xFFFFFF) != 0) {
										arg6.method7694(local79, local264, local534, local52, local195, local69, arg2[local46], arg2[local48], arg2[local50], Static342.method5736(arg0[local46] << 24 | super.aClass4_Sub1_18.anInt2889, local1613.anIntArray109[local46]), Static342.method5736(super.aClass4_Sub1_18.anInt2889 | arg0[local48] << 24, local1613.anIntArray109[local48]), Static342.method5736(super.aClass4_Sub1_18.anInt2889 | arg0[local50] << 24, local1613.anIntArray109[local50]));
									}
								} else if (local2370 != -1) {
									arg6.method7689(local79, local264, local534, local52, local195, local69, local1613.anIntArray109[local46], local1613.anIntArray109[local48], local1613.anIntArray109[local50], local395, local366, local96, local454, local413, local119, local299, local472, local143, local2370);
								} else if ((local1613.anIntArray109[local46] & 0xFFFFFF) != 0) {
									arg6.method7694(local79, local264, local534, local52, local195, local69, arg2[local46], arg2[local48], arg2[local50], local1613.anIntArray109[local46], local1613.anIntArray109[local48], local1613.anIntArray109[local50]);
								}
								arg6.anInt8806 = 0;
							} else {
								arg6.method7693(local79, local264, local534, local52, local195, local69, arg2[local46], arg2[local48], arg2[local50], super.aClass4_Sub1_18.anInt2889);
							}
						}
					}
				}
			}
		} else if ((local12.aByte106 & 0x2) == 0) {
			@Pc(28) int local28 = arg5 * super.anInt9576;
			local34 = local28 + super.anInt9576;
			local39 = super.anInt9576 * arg3;
			local44 = super.anInt9576 + local39;
			local46 = 0;
			local48 = 0;
			local50 = 0;
			local52 = 0;
			if ((local12.aByte106 & 0x1) == 0 || arg4) {
				local69 = super.anIntArrayArray126[arg5][arg3];
				local79 = super.anIntArrayArray126[arg5 + 1][arg3];
				local264 = super.anIntArrayArray126[arg5 + 1][arg3 + 1];
				local534 = super.anIntArrayArray126[arg5][arg3 + 1];
				if (super.anInt9579 == -1) {
					local96 = (super.anInt9582 * local28 + local69 * super.anInt9581 + super.anInt9583 * local39 >> 15) + super.anInt9584;
					if (local96 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local119 = (super.anInt9583 * local39 + super.anInt9582 * local34 + local79 * super.anInt9581 >> 15) + super.anInt9584;
					if (local119 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local143 = (local264 * super.anInt9581 + super.anInt9582 * local34 + local44 * super.anInt9583 >> 15) + super.anInt9584;
					if (local143 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local166 = (local28 * super.anInt9582 + super.anInt9581 * local534 + local44 * super.anInt9583 >> 15) + super.anInt9584;
					if (super.aClass4_Sub1_18.anInt2868 >= local166) {
						return;
					}
				} else {
					local166 = super.anInt9579;
					local143 = super.anInt9579;
					local119 = super.anInt9579;
					local96 = super.anInt9579;
				}
				if (arg4) {
					local195 = local96 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 > 0) {
						local46 = local195;
						local766 = local12.aShort118 * local195 / 255;
						if (local766 > 0) {
							local69 -= local766;
						}
					}
					local195 = local119 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 > 0) {
						local48 = local195;
						local766 = local12.aShort121 * local195 / 255;
						if (local766 > 0) {
							local79 -= local766;
						}
					}
					local195 = local143 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 > 0) {
						local50 = local195;
						local766 = local195 * local12.aShort119 / 255;
						if (local766 > 0) {
							local264 -= local766;
						}
					}
					local195 = local166 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 255) {
						local195 = 255;
					}
					if (local195 > 0) {
						local52 = local195;
						local766 = local195 * local12.aShort122 / 255;
						if (local766 > 0) {
							local534 -= local766;
						}
					}
				} else if (super.aClass4_Sub1_18.aBoolean247) {
					local195 = local96 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 0) {
						local46 = local195;
						if (local195 > 255) {
							local46 = 255;
						}
					}
					local195 = local119 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 0) {
						local48 = local195;
						if (local195 > 255) {
							local48 = 255;
						}
					}
					local195 = local143 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 0) {
						local50 = local195;
						if (local195 > 255) {
							local50 = 255;
						}
					}
					local195 = local166 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 0) {
						local52 = local195;
						if (local195 > 255) {
							local52 = 255;
						}
					}
				}
				local282 = super.anInt9588 + (super.anInt9590 * local39 + super.anInt9589 * local28 + local69 * super.anInt9585 >> 15);
				local299 = super.anInt9591 + (local69 * super.anInt9587 + super.anInt9578 * local28 + local39 * super.anInt9586 >> 15);
				local310 = local282 * super.aClass4_Sub1_18.anInt2890 / local96 + arg6.anInt8809;
				local338 = super.aClass4_Sub1_18.anInt2897 * local299 / local96 + arg6.anInt8808;
				local327 = super.anInt9588 + (super.anInt9585 * local79 + super.anInt9589 * local34 + super.anInt9590 * local39 >> 15);
				local349 = arg6.anInt8809 + local327 * super.aClass4_Sub1_18.anInt2890 / local119;
				local366 = super.anInt9591 + (super.anInt9587 * local79 + super.anInt9578 * local34 + local39 * super.anInt9586 >> 15);
				local395 = super.anInt9588 + (super.anInt9590 * local44 + local264 * super.anInt9585 + local34 * super.anInt9589 >> 15);
				local377 = arg6.anInt8808 + super.aClass4_Sub1_18.anInt2897 * local366 / local119;
				local424 = super.aClass4_Sub1_18.anInt2890 * local395 / local143 + arg6.anInt8809;
				local413 = super.anInt9591 + (local44 * super.anInt9586 + local264 * super.anInt9587 + local34 * super.anInt9578 >> 15);
				local436 = super.aClass4_Sub1_18.anInt2897 * local413 / local143 + arg6.anInt8808;
				local454 = (super.anInt9590 * local44 + local534 * super.anInt9585 + local28 * super.anInt9589 >> 15) + super.anInt9588;
				local484 = arg6.anInt8809 + local454 * super.aClass4_Sub1_18.anInt2890 / local166;
				local472 = super.anInt9591 + (super.anInt9587 * local534 + local28 * super.anInt9578 + local44 * super.anInt9586 >> 15);
				local496 = arg6.anInt8808 + super.aClass4_Sub1_18.anInt2897 * local472 / local166;
			} else {
				local69 = super.anIntArrayArray126[arg5][arg3];
				if (super.anInt9579 == -1) {
					local79 = local69 * super.anInt9581;
					local96 = super.anInt9584 + (local39 * super.anInt9583 + local28 * super.anInt9582 + local79 >> 15);
					if (super.aClass4_Sub1_18.anInt2868 >= local96) {
						return;
					}
					local119 = (super.anInt9583 * local39 + local34 * super.anInt9582 + local79 >> 15) + super.anInt9584;
					if (local119 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local143 = super.anInt9584 + (super.anInt9583 * local44 + super.anInt9582 * local34 + local79 >> 15);
					if (local143 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local166 = super.anInt9584 + (local44 * super.anInt9583 + local28 * super.anInt9582 + local79 >> 15);
					if (super.aClass4_Sub1_18.anInt2868 >= local166) {
						return;
					}
				} else {
					local166 = super.anInt9579;
					local143 = super.anInt9579;
					local119 = super.anInt9579;
					local96 = super.anInt9579;
				}
				if (super.aClass4_Sub1_18.aBoolean247) {
					local195 = local96 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 0) {
						local46 = local195;
						if (local195 > 255) {
							local46 = 255;
						}
					}
					local195 = local119 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 0) {
						local48 = local195;
						if (local195 > 255) {
							local48 = 255;
						}
					}
					local195 = local143 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 0) {
						local50 = local195;
						if (local195 > 255) {
							local50 = 255;
						}
					}
					local195 = local166 - super.aClass4_Sub1_18.anInt2880;
					if (local195 > 0) {
						local52 = local195;
						if (local195 > 255) {
							local52 = 255;
						}
					}
				}
				local79 = local69 * super.anInt9585;
				local264 = super.anInt9587 * local69;
				local282 = (super.anInt9590 * local39 + super.anInt9589 * local28 + local79 >> 15) + super.anInt9588;
				local299 = super.anInt9591 + (local39 * super.anInt9586 + local264 + super.anInt9578 * local28 >> 15);
				local310 = arg6.anInt8809 + local282 * super.aClass4_Sub1_18.anInt2890 / local96;
				local327 = super.anInt9588 + (super.anInt9590 * local39 + local79 + local34 * super.anInt9589 >> 15);
				local338 = super.aClass4_Sub1_18.anInt2897 * local299 / local96 + arg6.anInt8808;
				local349 = local327 * super.aClass4_Sub1_18.anInt2890 / local119 + arg6.anInt8809;
				local366 = (super.anInt9586 * local39 + local34 * super.anInt9578 + local264 >> 15) + super.anInt9591;
				local377 = arg6.anInt8808 + local366 * super.aClass4_Sub1_18.anInt2897 / local119;
				local395 = super.anInt9588 + (local44 * super.anInt9590 + super.anInt9589 * local34 + local79 >> 15);
				local413 = super.anInt9591 + (local264 + local34 * super.anInt9578 + local44 * super.anInt9586 >> 15);
				local424 = arg6.anInt8809 + super.aClass4_Sub1_18.anInt2890 * local395 / local143;
				local436 = arg6.anInt8808 + super.aClass4_Sub1_18.anInt2897 * local413 / local143;
				local454 = super.anInt9588 + (local44 * super.anInt9590 + super.anInt9589 * local28 + local79 >> 15);
				local472 = (local28 * super.anInt9578 + local264 + local44 * super.anInt9586 >> 15) + super.anInt9591;
				local484 = arg6.anInt8809 + super.aClass4_Sub1_18.anInt2890 * local454 / local166;
				local496 = arg6.anInt8808 + local472 * super.aClass4_Sub1_18.anInt2897 / local166;
			}
			@Pc(1143) boolean local1143 = local12.aShort120 != -1 && this.method8252(super.aClass4_Sub1_18.anInterface13_13.method5789(local12.aShort120).aByte104);
			local79 = local52 + local50 + local48;
			if ((local424 - local484) * (-local496 + local377) - (local349 - local484) * (-local496 + local436) > 0) {
				arg6.aBoolean665 = local424 < 0 || local484 < 0 || local349 < 0 || local424 > arg6.anInt8805 || local484 > arg6.anInt8805 || local349 > arg6.anInt8805;
				if (local79 < 765) {
					if (local1143) {
						arg6.anInt8806 = 100;
					}
					if (local79 > 0) {
						if (local12.aShort120 < 0) {
							arg6.method7694(local436, local496, local377, local424, local484, local349, local143, local166, local119, Static342.method5736(super.aClass4_Sub1_18.anInt2889 | local50 << 24, local12.anInt8860), Static342.method5736(local52 << 24 | super.aClass4_Sub1_18.anInt2889, local12.anInt8861), Static342.method5736(local48 << 24 | super.aClass4_Sub1_18.anInt2889, local12.anInt8859));
						} else {
							arg6.method7696(local436, local496, local377, local424, local484, local349, local143, local166, local119, super.aClass4_Sub1_18.anInt2889, local50, local52, local48, local12.anInt8860, local12.anInt8861, local12.anInt8859, local395, local454, local327, local413, local472, local366, local143, local166, local119, local12.aShort120);
						}
					} else if (local12.aShort120 < 0) {
						arg6.method7694(local436, local496, local377, local424, local484, local349, local143, local166, local119, local12.anInt8860, local12.anInt8861, local12.anInt8859);
					} else {
						arg6.method7689(local436, local496, local377, local424, local484, local349, local12.anInt8860, local12.anInt8861, local12.anInt8859, local395, local454, local327, local413, local472, local366, local143, local166, local119, local12.aShort120);
					}
					arg6.anInt8806 = 0;
				} else {
					arg6.method7693(local436, local496, local377, local424, local484, local349, local143, local166, local119, super.aClass4_Sub1_18.anInt2889);
				}
			}
			local79 = local52 + local46 + local48;
			if ((local310 - local349) * (local496 - local377) - (local338 - local377) * (-local349 + local484) > 0) {
				arg6.aBoolean665 = local310 < 0 || local349 < 0 || local484 < 0 || local310 > arg6.anInt8805 || arg6.anInt8805 < local349 || arg6.anInt8805 < local484;
				if (local79 >= 765) {
					arg6.method7693(local338, local377, local496, local310, local349, local484, local96, local119, local166, super.aClass4_Sub1_18.anInt2889);
					return;
				}
				if (local1143) {
					arg6.anInt8806 = 100;
				}
				if (local79 <= 0) {
					if (local12.aShort120 < 0) {
						arg6.method7694(local338, local377, local496, local310, local349, local484, local96, local119, local166, local12.anInt8857, local12.anInt8859, local12.anInt8861);
					} else {
						arg6.method7689(local338, local377, local496, local310, local349, local484, local12.anInt8857, local12.anInt8859, local12.anInt8861, local282, local327, local454, local299, local366, local472, local96, local119, local166, local12.aShort120);
					}
				} else if (local12.aShort120 >= 0) {
					arg6.method7696(local338, local377, local496, local310, local349, local484, local96, local119, local166, super.aClass4_Sub1_18.anInt2889, local46, local48, local52, local12.anInt8857, local12.anInt8859, local12.anInt8861, local282, local327, local454, local299, local366, local472, local96, local119, local166, local12.aShort120);
				} else {
					arg6.method7694(local338, local377, local496, local310, local349, local484, local96, local119, local166, Static342.method5736(local46 << 24 | super.aClass4_Sub1_18.anInt2889, local12.anInt8857), Static342.method5736(super.aClass4_Sub1_18.anInt2889 | local48 << 24, local12.anInt8859), Static342.method5736(local52 << 24 | super.aClass4_Sub1_18.anInt2889, local12.anInt8861));
				}
				arg6.anInt8806 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!uv;IIII[III[II[[ZI)V")
	private void method1677(@OriginalArg(0) Class298 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(8) int[] arg5, @OriginalArg(10) boolean[][] arg6, @OriginalArg(11) int arg7) {
		@Pc(31) int local31 = (arg1 - arg7) * 1024 / 256;
		arg0.aBoolean663 = false;
		arg0.aBoolean664 = false;
		@Pc(43) int local43 = 0;
		@Pc(47) int local47 = local31;
		for (@Pc(49) int local49 = arg4; local49 < arg2; local49++) {
			for (@Pc(53) int local53 = arg7; local53 < arg1; local53++) {
				if (arg6[local49 - arg4][local53 - arg7]) {
					@Pc(90) int local90;
					if (super.aClass300ArrayArray3[local49][local53] != null) {
						@Pc(318) Class300 local318 = super.aClass300ArrayArray3[local49][local53];
						if (local318.aShort120 != -1 && (local318.aByte106 & 0x2) == 0 && local318.anInt8858 == 0) {
							local90 = super.aClass4_Sub1_18.method2742(local318.aShort120);
							arg0.method7691(local47 - 4, local47 + -4, local47, local43 + 4, local43, local43 + 4, 0, 0, 0, Static171.method3198(local318.anInt8860, local90), Static171.method3198(local318.anInt8861, local90), Static171.method3198(local318.anInt8859, local90));
							arg0.method7691(local47, local47, local47 - 4, local43, local43 + 4, local43, 0, 0, 0, Static171.method3198(local318.anInt8857, local90), Static171.method3198(local318.anInt8859, local90), Static171.method3198(local318.anInt8861, local90));
						} else if (local318.anInt8858 == 0) {
							arg0.method7694(local47 - 4, local47 + -4, local47, local43 + 4, local43, local43 + 4, 0, 0, 0, local318.anInt8860, local318.anInt8861, local318.anInt8859);
							arg0.method7694(local47, local47, local47 - 4, local43, local43 + 4, local43, 0, 0, 0, local318.anInt8857, local318.anInt8859, local318.anInt8861);
						} else {
							local90 = local318.anInt8858;
							arg0.method7694(local47 - 4, local47 + -4, local47, local43 + 4, local43, local43 + 4, 0, 0, 0, Static342.method5736(local318.anInt8860 & 0xFF000000, local90), Static342.method5736(local318.anInt8861 & 0xFF000000, local90), Static342.method5736(local318.anInt8859 & 0xFF000000, local90));
							arg0.method7694(local47, local47, local47 - 4, local43, local43 + 4, local43, 0, 0, 0, Static342.method5736(local318.anInt8857 & 0xFF000000, local90), Static342.method5736(local318.anInt8859 & 0xFF000000, local90), Static342.method5736(local318.anInt8861 & 0xFF000000, local90));
						}
					} else if (super.aClass52ArrayArray3[local49][local53] != null) {
						@Pc(88) Class52 local88 = super.aClass52ArrayArray3[local49][local53];
						for (local90 = 0; local90 < local88.aShort21; local90++) {
							arg3[local90] = local43 + local88.aShortArray24[local90] * 4 / super.anInt9576;
							arg5[local90] = local47 - local88.aShortArray23[local90] * 4 / super.anInt9576;
						}
						for (@Pc(128) int local128 = 0; local128 < local88.aShort20; local128++) {
							@Pc(134) int local134 = local128 * 3;
							@Pc(138) int local138 = local134 + 1;
							@Pc(142) int local142 = local138 + 1;
							@Pc(146) int local146 = arg3[local134];
							@Pc(150) int local150 = arg3[local138];
							@Pc(154) int local154 = arg3[local142];
							@Pc(158) int local158 = arg5[local134];
							@Pc(162) int local162 = arg5[local138];
							@Pc(166) int local166 = arg5[local142];
							@Pc(232) int local232;
							if (local88.anIntArray110 != null && local88.anIntArray110[local128] != 0 && (local88.aShortArray22 == null || local88.aShortArray22 != null && local88.aShortArray22[local128] == -1)) {
								local232 = local88.anIntArray110[local128];
								arg0.method7694(local158, local162, local166, local146, local150, local154, 0, 0, 0, Static342.method5736(-(local88.anIntArray109[local134] & -16777216) - 16777216, local232), Static342.method5736(-(local88.anIntArray109[local138] & 0xFF000000) - 16777216, local232), Static342.method5736(-(-16777216 & local88.anIntArray109[local142]) - 16777216, local232));
							} else if (local88.aShortArray22 == null || local88.aShortArray22[local128] == -1) {
								arg0.method7694(local158, local162, local166, local146, local150, local154, 0, 0, 0, local88.anIntArray109[local134], local88.anIntArray109[local138], local88.anIntArray109[local142]);
							} else {
								local232 = super.aClass4_Sub1_18.method2742(local88.aShortArray22[local128]);
								arg0.method7691(local158, local162, local166, local146, local150, local154, 0, 0, 0, local232, local232, local232);
							}
						}
					}
				}
				local47 -= 4;
			}
			local47 = local31;
			local43 += 4;
		}
		arg0.aBoolean664 = true;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIII[[Z[III[IIILclient!uv;)V")
	private void method1678(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) boolean[][] arg2, @OriginalArg(5) int[] arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int[] arg6, @OriginalArg(11) Class298 arg7) {
		@Pc(14) int local14 = (arg1 - arg4) * 1024 / 256;
		arg7.aBoolean664 = false;
		arg7.aBoolean663 = false;
		@Pc(34) int local34 = 0;
		@Pc(38) int local38 = local14;
		for (@Pc(40) int local40 = arg5; local40 < arg0; local40++) {
			for (@Pc(44) int local44 = arg4; local44 < arg1; local44++) {
				if (arg2[local40 - arg5][local44 - arg4]) {
					@Pc(80) int local80;
					if (super.aClass122ArrayArray3[local40][local44] != null) {
						@Pc(312) Class122 local312 = super.aClass122ArrayArray3[local40][local44];
						if (local312.aShort36 != -1 && (local312.aByte51 & 0x2) == 0 && local312.anInt3424 == -1) {
							local80 = super.aClass4_Sub1_18.method2742(local312.aShort36);
							arg7.method7691(local38 - 4, local38 + -4, local38, local34 + 4, local34, local34 + 4, 0, 0, 0, Static171.method3198(local312.aShort34 & 0xFFFF, local80), Static171.method3198(local312.aShort35 & 0xFFFF, local80), Static171.method3198(local312.aShort38 & 0xFFFF, local80));
							arg7.method7691(local38, local38, local38 - 4, local34, local34 + 4, local34, 0, 0, 0, Static171.method3198(local312.aShort37 & 0xFFFF, local80), Static171.method3198(local312.aShort38 & 0xFFFF, local80), Static171.method3198(local312.aShort35 & 0xFFFF, local80));
						} else if (local312.anInt3424 == -1) {
							arg7.method7691(local38 - 4, local38 + -4, local38, local34 + 4, local34, local34 + 4, 0, 0, 0, local312.aShort34 & 0xFFFF, local312.aShort35 & 0xFFFF, local312.aShort38 & 0xFFFF);
							arg7.method7691(local38, local38, local38 - 4, local34, local34 + 4, local34, 0, 0, 0, local312.aShort37 & 0xFFFF, local312.aShort38 & 0xFFFF, local312.aShort35 & 0xFFFF);
						} else {
							local80 = local312.anInt3424;
							arg7.method7691(local38 - 4, local38 + -4, local38, local34 + 4, local34, local34 + 4, 0, 0, 0, local80, local80, local80);
							arg7.method7691(local38, local38, local38 - 4, local34, local34 + 4, local34, 0, 0, 0, local80, local80, local80);
						}
					} else if (super.aClass50ArrayArray3[local40][local44] != null) {
						@Pc(78) Class50 local78 = super.aClass50ArrayArray3[local40][local44];
						for (local80 = 0; local80 < local78.aShort19; local80++) {
							arg3[local80] = local78.aShortArray9[local80] * 4 / super.anInt9576 + local34;
							arg6[local80] = local38 - local78.aShortArray11[local80] * 4 / super.anInt9576;
						}
						for (@Pc(117) int local117 = 0; local117 < local78.aShort18; local117++) {
							@Pc(124) short local124 = local78.aShortArray13[local117];
							@Pc(129) short local129 = local78.aShortArray8[local117];
							@Pc(134) short local134 = local78.aShortArray14[local117];
							@Pc(138) int local138 = arg3[local124];
							@Pc(142) int local142 = arg3[local129];
							@Pc(146) int local146 = arg3[local134];
							@Pc(150) int local150 = arg6[local124];
							@Pc(154) int local154 = arg6[local129];
							@Pc(158) int local158 = arg6[local134];
							@Pc(181) int local181;
							if (local78.anIntArray101 != null && local78.anIntArray101[local117] != -1) {
								local181 = local78.anIntArray101[local117];
								arg7.method7691(local150, local154, local158, local138, local142, local146, 0, 0, 0, Static171.method3198(local78.aShortArray7[local124], local181), Static171.method3198(local78.aShortArray7[local129], local181), Static171.method3198(local78.aShortArray7[local134], local181));
							} else if (local78.aShortArray10 == null || local78.aShortArray10[local117] == -1) {
								local181 = local78.anIntArray102[local117];
								arg7.method7691(local150, local154, local158, local138, local142, local146, 0, 0, 0, Static171.method3198(local78.aShortArray7[local124], local181), Static171.method3198(local78.aShortArray7[local129], local181), Static171.method3198(local78.aShortArray7[local134], local181));
							} else {
								local181 = super.aClass4_Sub1_18.method2742(local78.aShortArray10[local117]);
								arg7.method7691(local150, local154, local158, local138, local142, local146, 0, 0, 0, Static171.method3198(local78.aShortArray7[local124], local181), Static171.method3198(local78.aShortArray7[local129], local181), Static171.method3198(local78.aShortArray7[local134], local181));
							}
						}
					}
				}
				local38 -= 4;
			}
			local34 += 4;
			local38 = local14;
		}
		arg7.aBoolean664 = true;
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8245(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class200_Sub1 local9 = (Class200_Sub1) super.aClass4_Sub1_18.method2741(Thread.currentThread());
		@Pc(12) Class298 local12 = local9.aClass298_2;
		local12.aBoolean665 = false;
		local12.anInt8806 = 0;
		if (super.aClass300ArrayArray3 != null) {
			this.method1677(local12, arg3, arg2, local9.anIntArray585, arg0, local9.anIntArray594, arg4, arg1);
		} else if (super.aClass122ArrayArray3 != null) {
			this.method1678(arg2, arg3, arg4, local9.anIntArray585, arg1, arg0, local9.anIntArray594, local12);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(II)V")
	@Override
	public void method8247(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class200_Sub1 local9 = (Class200_Sub1) super.aClass4_Sub1_18.method2741(Thread.currentThread());
		local9.aClass298_2.anInt8806 = 0;
		if (super.aClass300ArrayArray3 != null) {
			this.method1676(local9.anIntArray606, local9.anIntArray585, local9.anIntArray601, arg1, super.aClass4_Sub1_18.aBoolean245, arg0, local9.aClass298_2, local9.anIntArray594);
		} else if (super.aClass122ArrayArray3 != null) {
			this.method1681(arg1, local9.anIntArray594, arg0, local9.anIntArray606, local9.aClass298_2, local9.anIntArray601, local9.anIntArray585);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(I[IBI[ILclient!uv;[I[I)V")
	private void method1681(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class298 arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(12) Class122 local12 = super.aClass122ArrayArray3[arg2][arg0];
		@Pc(39) int local39;
		@Pc(50) int local50;
		@Pc(221) int local221;
		@Pc(295) int local295;
		@Pc(338) int local338;
		@Pc(415) int local415;
		@Pc(249) int local249;
		@Pc(326) int local326;
		@Pc(385) int local385;
		@Pc(426) int local426;
		@Pc(210) int local210;
		@Pc(266) int local266;
		@Pc(314) int local314;
		@Pc(373) int local373;
		@Pc(238) int local238;
		@Pc(284) int local284;
		@Pc(356) int local356;
		@Pc(403) int local403;
		@Pc(88) int local88;
		@Pc(111) int local111;
		@Pc(139) int local139;
		@Pc(163) int local163;
		@Pc(464) int local464;
		if (local12 == null) {
			@Pc(1106) Class50 local1106 = super.aClass50ArrayArray3[arg2][arg0];
			if (local1106 != null) {
				@Pc(1133) short local1133;
				if (super.anInt9579 == -1) {
					for (local415 = 0; local415 < local1106.aShort19; local415++) {
						local39 = local1106.aShortArray9[local415] + (arg2 << super.anInt9573);
						local1133 = local1106.aShortArray12[local415];
						local50 = local1106.aShortArray11[local415] + (arg0 << super.anInt9573);
						local338 = (super.anInt9581 * local1133 + local39 * super.anInt9582 + local50 * super.anInt9583 >> 15) + super.anInt9584;
						if (super.aClass4_Sub1_18.anInt2868 >= local338) {
							return;
						}
						local221 = super.anInt9588 + (super.anInt9590 * local50 + super.anInt9589 * local39 + local1133 * super.anInt9585 >> 15);
						local295 = (local1133 * super.anInt9587 + super.anInt9578 * local39 + super.anInt9586 * local50 >> 15) + super.anInt9591;
						arg6[local415] = super.aClass4_Sub1_18.anInt2890 * local221 / local338 + arg4.anInt8809;
						arg1[local415] = arg4.anInt8808 + local295 * super.aClass4_Sub1_18.anInt2897 / local338;
						arg5[local415] = local338;
					}
				} else {
					for (local415 = 0; local415 < local1106.aShort19; local415++) {
						local39 = local1106.aShortArray9[local415] + (arg2 << super.anInt9573);
						local1133 = local1106.aShortArray12[local415];
						local50 = local1106.aShortArray11[local415] + (arg0 << super.anInt9573);
						local221 = (local1133 * super.anInt9585 + local39 * super.anInt9589 + local50 * super.anInt9590 >> 15) + super.anInt9588;
						local295 = (local50 * super.anInt9586 + local39 * super.anInt9578 + local1133 * super.anInt9587 >> 15) + super.anInt9591;
						arg6[local415] = arg4.anInt8809 + super.aClass4_Sub1_18.anInt2890 * local221 / super.anInt9579;
						arg1[local415] = arg4.anInt8808 + local295 * super.aClass4_Sub1_18.anInt2897 / super.anInt9579;
						arg5[local415] = super.anInt9579;
					}
				}
				if (local1106.aShortArray10 == null) {
					for (local415 = 0; local415 < local1106.aShort18; local415++) {
						@Pc(1379) short local1379 = local1106.aShortArray13[local415];
						@Pc(1384) short local1384 = local1106.aShortArray8[local415];
						@Pc(1389) short local1389 = local1106.aShortArray14[local415];
						local426 = arg6[local1379];
						local210 = arg6[local1384];
						local266 = arg6[local1389];
						local314 = arg1[local1379];
						local373 = arg1[local1384];
						local238 = arg1[local1389];
						if ((local426 - local210) * (local238 + -local373) - (local314 - local373) * (-local210 + local266) > 0) {
							local284 = local1106.anIntArray102[local415];
							if (local284 != -1) {
								arg4.aBoolean665 = local426 < 0 || local210 < 0 || local266 < 0 || arg4.anInt8805 < local426 || local210 > arg4.anInt8805 || local266 > arg4.anInt8805;
								arg4.method7691(local314, local373, local238, local426, local210, local266, arg5[1], arg5[2], arg5[3], Static171.method3198(local1106.aShortArray7[local1379], local284), Static171.method3198(local1106.aShortArray7[local1384], local284), Static171.method3198(local1106.aShortArray7[local1389], local284));
							}
						}
					}
				} else {
					local415 = super.anIntArrayArray126[arg2][arg0];
					local249 = super.anIntArrayArray126[arg2 + 1][arg0];
					local326 = super.anIntArrayArray126[arg2][arg0 + 1];
					local385 = arg2 * super.anInt9576;
					local426 = local385 + super.anInt9576;
					local210 = super.anInt9576 * arg0;
					local266 = super.anInt9576 + local210;
					local314 = super.anInt9588 + (local210 * super.anInt9590 + local415 * super.anInt9585 + super.anInt9589 * local385 >> 15);
					local373 = (super.anInt9587 * local415 + local385 * super.anInt9578 + local210 * super.anInt9586 >> 15) + super.anInt9591;
					local238 = (super.anInt9581 * local415 + super.anInt9582 * local385 + local210 * super.anInt9583 >> 15) + super.anInt9584;
					local284 = (super.anInt9590 * local210 + super.anInt9585 * local249 + super.anInt9589 * local426 >> 15) + super.anInt9588;
					local356 = (super.anInt9586 * local210 + super.anInt9587 * local249 + super.anInt9578 * local426 >> 15) + super.anInt9591;
					local403 = super.anInt9584 + (super.anInt9581 * local249 + local426 * super.anInt9582 + local210 * super.anInt9583 >> 15);
					local88 = (local266 * super.anInt9590 + local385 * super.anInt9589 + super.anInt9585 * local326 >> 15) + super.anInt9588;
					local111 = super.anInt9591 + (super.anInt9587 * local326 + super.anInt9578 * local385 + local266 * super.anInt9586 >> 15);
					local139 = super.anInt9584 + (super.anInt9581 * local326 + local385 * super.anInt9582 + local266 * super.anInt9583 >> 15);
					for (local163 = 0; local163 < local1106.aShort18; local163++) {
						@Pc(1773) short local1773 = local1106.aShortArray13[local163];
						@Pc(1778) short local1778 = local1106.aShortArray8[local163];
						@Pc(1783) short local1783 = local1106.aShortArray14[local163];
						local464 = arg6[local1773];
						@Pc(1791) int local1791 = arg6[local1778];
						@Pc(1795) int local1795 = arg6[local1783];
						@Pc(1799) int local1799 = arg1[local1773];
						@Pc(1803) int local1803 = arg1[local1778];
						@Pc(1807) int local1807 = arg1[local1783];
						if ((local1807 - local1803) * (-local1791 + local464) - (local1799 - local1803) * (local1795 + -local1791) > 0) {
							arg4.aBoolean665 = local464 < 0 || local1791 < 0 || local1795 < 0 || arg4.anInt8805 < local464 || arg4.anInt8805 < local1791 || local1795 > arg4.anInt8805;
							@Pc(1868) short local1868 = local1106.aShortArray10[local163];
							if (local1868 == -1) {
								@Pc(1876) int local1876 = local1106.anIntArray102[local163];
								if (local1876 != -1) {
									arg4.method7691(local1799, local1803, local1807, local464, local1791, local1795, arg5[1], arg5[2], arg5[3], Static171.method3198(local1106.aShortArray7[local1773], local1876), Static171.method3198(local1106.aShortArray7[local1778], local1876), Static171.method3198(local1106.aShortArray7[local1783], local1876));
								}
							} else {
								if (this.method8252(super.aClass4_Sub1_18.anInterface13_13.method5789(local1868).aByte104)) {
									arg4.anInt8806 = 100;
								}
								arg4.method7689(local1799, local1803, local1807, local464, local1791, local1795, local1106.aShortArray7[local1773], local1106.aShortArray7[local1778], local1106.aShortArray7[local1783], local314, local284, local88, local373, local356, local111, local238, local403, local139, local1868);
								arg4.anInt8806 = 0;
							}
						}
					}
				}
			}
		} else if ((local12.aByte51 & 0x2) == 0) {
			@Pc(33) int local33 = arg2 * super.anInt9576;
			local39 = local33 + super.anInt9576;
			@Pc(44) int local44 = arg0 * super.anInt9576;
			local50 = local44 + super.anInt9576;
			@Pc(62) int local62;
			@Pc(71) int local71;
			@Pc(192) int local192;
			if ((local12.aByte51 & 0x1) == 0) {
				local62 = super.anIntArrayArray126[arg2][arg0];
				local71 = super.anIntArrayArray126[arg2 + 1][arg0];
				local192 = super.anIntArrayArray126[arg2 + 1][arg0 + 1];
				local464 = super.anIntArrayArray126[arg2][arg0 + 1];
				if (super.anInt9579 == -1) {
					local88 = (local44 * super.anInt9583 + super.anInt9582 * local33 + super.anInt9581 * local62 >> 15) + super.anInt9584;
					if (super.aClass4_Sub1_18.anInt2868 >= local88) {
						return;
					}
					local111 = super.anInt9584 + (super.anInt9581 * local71 + local39 * super.anInt9582 + local44 * super.anInt9583 >> 15);
					if (super.aClass4_Sub1_18.anInt2868 >= local111) {
						return;
					}
					local139 = (local192 * super.anInt9581 + super.anInt9582 * local39 + local50 * super.anInt9583 >> 15) + super.anInt9584;
					if (local139 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local163 = super.anInt9584 + (super.anInt9581 * local464 + local33 * super.anInt9582 + local50 * super.anInt9583 >> 15);
					if (super.aClass4_Sub1_18.anInt2868 >= local163) {
						return;
					}
				} else {
					local163 = super.anInt9579;
					local139 = super.anInt9579;
					local111 = super.anInt9579;
					local88 = super.anInt9579;
				}
				local210 = super.anInt9588 + (local33 * super.anInt9589 + super.anInt9585 * local62 + super.anInt9590 * local44 >> 15);
				local238 = (super.anInt9578 * local33 + local62 * super.anInt9587 + local44 * super.anInt9586 >> 15) + super.anInt9591;
				local221 = local210 * super.aClass4_Sub1_18.anInt2890 / local88 + arg4.anInt8809;
				local249 = arg4.anInt8808 + super.aClass4_Sub1_18.anInt2897 * local238 / local88;
				local266 = super.anInt9588 + (local39 * super.anInt9589 + super.anInt9585 * local71 + local44 * super.anInt9590 >> 15);
				local295 = arg4.anInt8809 + super.aClass4_Sub1_18.anInt2890 * local266 / local111;
				local284 = super.anInt9591 + (local44 * super.anInt9586 + local71 * super.anInt9587 + super.anInt9578 * local39 >> 15);
				local326 = super.aClass4_Sub1_18.anInt2897 * local284 / local111 + arg4.anInt8808;
				local314 = super.anInt9588 + (local50 * super.anInt9590 + local192 * super.anInt9585 + local39 * super.anInt9589 >> 15);
				local338 = arg4.anInt8809 + local314 * super.aClass4_Sub1_18.anInt2890 / local139;
				local356 = super.anInt9591 + (local50 * super.anInt9586 + super.anInt9587 * local192 + local39 * super.anInt9578 >> 15);
				local373 = super.anInt9588 + (super.anInt9590 * local50 + super.anInt9589 * local33 + local464 * super.anInt9585 >> 15);
				local385 = arg4.anInt8808 + local356 * super.aClass4_Sub1_18.anInt2897 / local139;
				local403 = (super.anInt9586 * local50 + super.anInt9587 * local464 + local33 * super.anInt9578 >> 15) + super.anInt9591;
				local415 = super.aClass4_Sub1_18.anInt2890 * local373 / local163 + arg4.anInt8809;
				local426 = super.aClass4_Sub1_18.anInt2897 * local403 / local163 + arg4.anInt8808;
			} else {
				local62 = super.anIntArrayArray126[arg2][arg0];
				if (super.anInt9579 == -1) {
					local71 = local62 * super.anInt9581;
					local88 = (local44 * super.anInt9583 + local71 + super.anInt9582 * local33 >> 15) + super.anInt9584;
					if (super.aClass4_Sub1_18.anInt2868 >= local88) {
						return;
					}
					local111 = super.anInt9584 + (local44 * super.anInt9583 + local71 + super.anInt9582 * local39 >> 15);
					if (local111 <= super.aClass4_Sub1_18.anInt2868) {
						return;
					}
					local139 = (local71 + super.anInt9582 * local39 + super.anInt9583 * local50 >> 15) + super.anInt9584;
					if (super.aClass4_Sub1_18.anInt2868 >= local139) {
						return;
					}
					local163 = (super.anInt9583 * local50 + super.anInt9582 * local33 + local71 >> 15) + super.anInt9584;
					if (super.aClass4_Sub1_18.anInt2868 >= local163) {
						return;
					}
				} else {
					local163 = super.anInt9579;
					local139 = super.anInt9579;
					local111 = super.anInt9579;
					local88 = super.anInt9579;
				}
				local71 = super.anInt9585 * local62;
				local192 = super.anInt9587 * local62;
				local210 = super.anInt9588 + (super.anInt9590 * local44 + local33 * super.anInt9589 + local71 >> 15);
				local221 = local210 * super.aClass4_Sub1_18.anInt2890 / local88 + arg4.anInt8809;
				local238 = super.anInt9591 + (super.anInt9586 * local44 + local192 + super.anInt9578 * local33 >> 15);
				local249 = arg4.anInt8808 + local238 * super.aClass4_Sub1_18.anInt2897 / local88;
				local266 = (local71 + local39 * super.anInt9589 + local44 * super.anInt9590 >> 15) + super.anInt9588;
				local284 = super.anInt9591 + (super.anInt9586 * local44 + local192 + super.anInt9578 * local39 >> 15);
				local295 = local266 * super.aClass4_Sub1_18.anInt2890 / local111 + arg4.anInt8809;
				local314 = (super.anInt9589 * local39 + local71 + super.anInt9590 * local50 >> 15) + super.anInt9588;
				local326 = arg4.anInt8808 + local284 * super.aClass4_Sub1_18.anInt2897 / local111;
				local338 = arg4.anInt8809 + super.aClass4_Sub1_18.anInt2890 * local314 / local139;
				local356 = super.anInt9591 + (local192 + super.anInt9578 * local39 + local50 * super.anInt9586 >> 15);
				local373 = super.anInt9588 + (super.anInt9590 * local50 + local33 * super.anInt9589 + local71 >> 15);
				local385 = arg4.anInt8808 + local356 * super.aClass4_Sub1_18.anInt2897 / local139;
				local403 = super.anInt9591 + (local192 + super.anInt9578 * local33 + local50 * super.anInt9586 >> 15);
				local415 = arg4.anInt8809 + local373 * super.aClass4_Sub1_18.anInt2890 / local163;
				local426 = local403 * super.aClass4_Sub1_18.anInt2897 / local163 + arg4.anInt8808;
			}
			if ((local338 - local415) * (local326 - local426) - (local385 - local426) * (local295 + -local415) > 0) {
				arg4.aBoolean665 = local338 < 0 || local415 < 0 || local295 < 0 || arg4.anInt8805 < local338 || local415 > arg4.anInt8805 || arg4.anInt8805 < local295;
				if (local12.aShort36 < 0) {
					arg4.method7691(local385, local426, local326, local338, local415, local295, local139, local163, local111, local12.aShort34 & 0xFFFF, local12.aShort35 & 0xFFFF, local12.aShort38 & 0xFFFF);
				} else {
					if (this.method8252(super.aClass4_Sub1_18.anInterface13_13.method5789(local12.aShort36).aByte104)) {
						arg4.anInt8806 = 100;
					}
					arg4.method7689(local385, local426, local326, local338, local415, local295, local12.aShort34 & 0xFFFF, local12.aShort35 & 0xFFFF, local12.aShort38 & 0xFFFF, local210, local266, local373, local238, local284, local403, local88, local111, local163, local12.aShort36);
					arg4.anInt8806 = 0;
				}
			}
			if (-((local249 - local326) * (-local295 + local415)) + (local426 - local326) * (-local295 + local221) > 0) {
				arg4.aBoolean665 = local221 < 0 || local295 < 0 || local415 < 0 || local221 > arg4.anInt8805 || local295 > arg4.anInt8805 || arg4.anInt8805 < local415;
				if (local12.aShort36 >= 0) {
					if (this.method8252(super.aClass4_Sub1_18.anInterface13_13.method5789(local12.aShort36).aByte104)) {
						arg4.anInt8806 = 100;
					}
					arg4.method7689(local249, local326, local426, local221, local295, local415, local12.aShort37 & 0xFFFF, local12.aShort38 & 0xFFFF, local12.aShort35 & 0xFFFF, local210, local266, local373, local238, local284, local403, local88, local111, local163, local12.aShort36);
					arg4.anInt8806 = 0;
					return;
				}
				arg4.method7691(local249, local326, local426, local221, local295, local415, local88, local111, local163, local12.aShort37 & 0xFFFF, local12.aShort38 & 0xFFFF, local12.aShort35 & 0xFFFF);
			}
		}
	}
}
