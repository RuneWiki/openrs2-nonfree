import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ad")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ad", name = "<init>", descriptor = "(Lclient!ql;IIII[[I[[II)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) Class15_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) int[][] arg6, @OriginalArg(7) int arg7) {
		super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([[ZIIIII[III[ILclient!lr;Z)V")
	private void method241(@OriginalArg(0) boolean[][] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int[] arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int[] arg6, @OriginalArg(10) Class204 arg7) {
		@Pc(14) int local14 = (arg3 - arg2) * 1024 / 256;
		arg7.aBoolean526 = false;
		arg7.aBoolean528 = false;
		@Pc(26) int local26 = 0;
		@Pc(30) int local30 = local14;
		for (@Pc(32) int local32 = arg5; local32 < arg1; local32++) {
			for (@Pc(36) int local36 = arg2; local36 < arg3; local36++) {
				if (arg0[local32 - arg5][local36 - arg2]) {
					@Pc(88) int local88;
					if (super.aClass97ArrayArray3[local32][local36] != null) {
						@Pc(64) Class97 local64 = super.aClass97ArrayArray3[local32][local36];
						if (local64.aShort39 != -1 && (local64.aByte29 & 0x2) == 0 && local64.anInt3194 == -1) {
							local88 = super.aClass15_Sub1_4.method4278(local64.aShort39);
							arg7.method5140(local30 - 4, local30 - 4, local30, local26 + 4, local26, local26 + 4, Static593.method8378(local88, local64.aShort38 & 0xFFFF), Static593.method8378(local88, local64.aShort41 & 0xFFFF), Static593.method8378(local88, local64.aShort40 & 0xFFFF));
							arg7.method5140(local30, local30, local30 - 4, local26, local26 + 4, local26, Static593.method8378(local88, local64.aShort42 & 0xFFFF), Static593.method8378(local88, local64.aShort40 & 0xFFFF), Static593.method8378(local88, local64.aShort41 & 0xFFFF));
						} else if (local64.anInt3194 == -1) {
							arg7.method5140(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, local64.aShort38 & 0xFFFF, local64.aShort41 & 0xFFFF, local64.aShort40 & 0xFFFF);
							arg7.method5140(local30, local30, local30 - 4, local26, local26 + 4, local26, local64.aShort42 & 0xFFFF, local64.aShort40 & 0xFFFF, local64.aShort41 & 0xFFFF);
						} else {
							local88 = local64.anInt3194;
							arg7.method5140(local30 - 4, local30 + -4, local30, local26 + 4, local26, local26 + 4, local88, local88, local88);
							arg7.method5140(local30, local30, local30 - 4, local26, local26 + 4, local26, local88, local88, local88);
						}
					} else if (super.aClass281ArrayArray3[local32][local36] != null) {
						@Pc(280) Class281 local280 = super.aClass281ArrayArray3[local32][local36];
						for (local88 = 0; local88 < local280.aShort103; local88++) {
							arg6[local88] = local280.aShortArray123[local88] * 4 / super.anInt10458 + local26;
							arg4[local88] = local30 - local280.aShortArray124[local88] * 4 / super.anInt10458;
						}
						for (@Pc(323) int local323 = 0; local323 < local280.aShort102; local323++) {
							@Pc(330) short local330 = local280.aShortArray125[local323];
							@Pc(335) short local335 = local280.aShortArray126[local323];
							@Pc(340) short local340 = local280.aShortArray122[local323];
							@Pc(344) int local344 = arg6[local330];
							@Pc(348) int local348 = arg6[local335];
							@Pc(352) int local352 = arg6[local340];
							@Pc(356) int local356 = arg4[local330];
							@Pc(360) int local360 = arg4[local335];
							@Pc(364) int local364 = arg4[local340];
							@Pc(378) int local378;
							if (local280.anIntArray524 != null && local280.anIntArray524[local323] != -1) {
								local378 = local280.anIntArray524[local323];
								arg7.method5140(local356, local360, local364, local344, local348, local352, Static593.method8378(local378, local280.aShortArray128[local330]), Static593.method8378(local378, local280.aShortArray128[local335]), Static593.method8378(local378, local280.aShortArray128[local340]));
							} else if (local280.aShortArray127 == null || local280.aShortArray127[local323] == -1) {
								local378 = local280.anIntArray523[local323];
								arg7.method5140(local356, local360, local364, local344, local348, local352, Static593.method8378(local378, local280.aShortArray128[local330]), Static593.method8378(local378, local280.aShortArray128[local335]), Static593.method8378(local378, local280.aShortArray128[local340]));
							} else {
								local378 = super.aClass15_Sub1_4.method4278(local280.aShortArray127[local323]);
								arg7.method5140(local356, local360, local364, local344, local348, local352, Static593.method8378(local378, local280.aShortArray128[local330]), Static593.method8378(local378, local280.aShortArray128[local335]), Static593.method8378(local378, local280.aShortArray128[local340]));
							}
						}
					}
				}
				local30 -= 4;
			}
			local30 = local14;
			local26 += 4;
		}
		arg7.aBoolean526 = true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!lr;I[IIIZ[I[I)V")
	private void method242(@OriginalArg(0) Class204 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6) {
		@Pc(16) Class295 local16 = super.aClass295ArrayArray3[arg3][arg2];
		@Pc(34) int local34;
		@Pc(39) int local39;
		@Pc(44) int local44;
		@Pc(298) int local298;
		@Pc(356) int local356;
		@Pc(412) int local412;
		@Pc(486) int local486;
		@Pc(328) int local328;
		@Pc(384) int local384;
		@Pc(457) int local457;
		@Pc(498) int local498;
		@Pc(282) int local282;
		@Pc(345) int local345;
		@Pc(401) int local401;
		@Pc(446) int local446;
		@Pc(317) int local317;
		@Pc(373) int local373;
		@Pc(429) int local429;
		@Pc(474) int local474;
		@Pc(92) int local92;
		@Pc(119) int local119;
		@Pc(142) int local142;
		@Pc(167) int local167;
		@Pc(46) int local46;
		@Pc(48) int local48;
		@Pc(50) int local50;
		@Pc(52) int local52;
		@Pc(192) int local192;
		@Pc(66) int local66;
		@Pc(75) int local75;
		@Pc(287) int local287;
		@Pc(536) int local536;
		@Pc(769) int local769;
		if (local16 == null) {
			@Pc(1593) Class330 local1593 = super.aClass330ArrayArray3[arg3][arg2];
			if (local1593 != null) {
				if (super.anInt2336 == -1) {
					for (local486 = 0; local486 < local1593.aShort124; local486++) {
						local34 = local1593.aShortArray150[local486] + (arg3 << super.anInt10463);
						local39 = local1593.aShortArray148[local486];
						local44 = local1593.aShortArray149[local486] + (arg2 << super.anInt10463);
						local412 = super.anInt2332 + (local34 * super.anInt2344 + local39 * super.anInt2333 + local44 * super.anInt2339 >> 14);
						if (local412 <= super.aClass15_Sub1_4.anInt5035) {
							return;
						}
						arg5[local486] = 0;
						if (arg4) {
							local328 = local412 - super.aClass15_Sub1_4.anInt5027;
							if (local328 > 255) {
								local328 = 255;
							}
							if (local328 > 0) {
								arg5[local486] = local328;
								local384 = local328 * local1593.aShortArray151[local486] / 255;
								if (local384 > 0) {
									local39 -= local384;
								}
							}
						} else if (super.aClass15_Sub1_4.aBoolean429) {
							local328 = local412 - super.aClass15_Sub1_4.anInt5027;
							if (local328 > 0) {
								arg5[local486] = local328;
								if (arg5[local486] > 255) {
									arg5[local486] = 255;
								}
							}
						}
						local298 = (super.anInt2338 * local34 + local39 * super.anInt2337 + local44 * super.anInt2335 >> 14) + super.anInt2343;
						local356 = (local44 * super.anInt2342 + local39 * super.anInt2334 + super.anInt2341 * local34 >> 14) + super.anInt2340;
						arg6[local486] = arg0.anInt6166 + super.aClass15_Sub1_4.anInt5032 * local298 / local412;
						arg1[local486] = arg0.anInt6163 + super.aClass15_Sub1_4.anInt5040 * local356 / local412;
					}
				} else {
					for (local486 = 0; local486 < local1593.aShort124; local486++) {
						local34 = local1593.aShortArray150[local486] + (arg3 << super.anInt10463);
						local39 = local1593.aShortArray148[local486];
						local44 = local1593.aShortArray149[local486] + (arg2 << super.anInt10463);
						arg5[local486] = 0;
						if (arg4) {
							local328 = -super.aClass15_Sub1_4.anInt5027 + super.anInt2336;
							if (local328 > 255) {
								local328 = 255;
							}
							if (local328 > 0) {
								arg5[local486] = local328;
								local384 = local328 * local1593.aShortArray151[local486] / 255;
								if (local384 > 0) {
									local39 -= local384;
								}
							}
						} else if (super.aClass15_Sub1_4.aBoolean429) {
							local328 = -super.aClass15_Sub1_4.anInt5027 + super.anInt2336;
							if (local328 > 0) {
								arg5[local486] = local328;
								if (arg5[local486] > 255) {
									arg5[local486] = 255;
								}
							}
						}
						local298 = (local34 * super.anInt2338 + local39 * super.anInt2337 + super.anInt2335 * local44 >> 14) + super.anInt2343;
						local356 = (super.anInt2342 * local44 + local39 * super.anInt2334 + super.anInt2341 * local34 >> 14) + super.anInt2340;
						arg6[local486] = super.aClass15_Sub1_4.anInt5032 * local298 / super.anInt2336 + arg0.anInt6166;
						arg1[local486] = super.aClass15_Sub1_4.anInt5040 * local356 / super.anInt2336 + arg0.anInt6163;
					}
				}
				if (local1593.aShortArray152 == null) {
					for (local486 = 0; local486 < local1593.aShort125; local486++) {
						local328 = local486 * 3;
						local384 = local328 + 1;
						local457 = local384 + 1;
						local498 = arg6[local328];
						local282 = arg6[local384];
						local345 = arg6[local457];
						local401 = arg1[local328];
						local446 = arg1[local384];
						local317 = arg1[local457];
						local373 = arg5[local328] + arg5[local384] + arg5[local457];
						if ((local317 - local446) * (local498 - local282) - (local401 - local446) * (-local282 + local345) > 0) {
							arg0.aBoolean527 = local498 < 0 || local282 < 0 || local345 < 0 || arg0.anInt6162 < local498 || arg0.anInt6162 < local282 || local345 > arg0.anInt6162;
							if (local373 >= 765) {
								arg0.method5139(local401, local446, local317, local498, local282, local345, super.aClass15_Sub1_4.anInt5044);
							} else if (local373 > 0) {
								if ((local1593.anIntArray647[local328] & 0xFFFFFF) != 0) {
									arg0.method5141(local401, local446, local317, local498, local282, local345, Static98.method4085(super.aClass15_Sub1_4.anInt5044, arg5[local328], local1593.anIntArray647[local328]), Static98.method4085(super.aClass15_Sub1_4.anInt5044, arg5[local384], local1593.anIntArray647[local384]), Static98.method4085(super.aClass15_Sub1_4.anInt5044, arg5[local457], local1593.anIntArray647[local457]));
								}
							} else if ((local1593.anIntArray647[local328] & 0xFFFFFF) != 0) {
								arg0.method5141(local401, local446, local317, local498, local282, local345, local1593.anIntArray647[local328], local1593.anIntArray647[local384], local1593.anIntArray647[local457]);
							}
						}
					}
				} else {
					local486 = super.anIntArrayArray20[arg3][arg2];
					local328 = super.anIntArrayArray20[arg3 + 1][arg2];
					local384 = super.anIntArrayArray20[arg3][arg2 + 1];
					local457 = arg3 * super.anInt10458;
					local498 = local457 + super.anInt10458;
					local282 = super.anInt10458 * arg2;
					local345 = local282 + super.anInt10458;
					local401 = (local457 * super.anInt2338 + local486 * super.anInt2337 + local282 * super.anInt2335 >> 14) + super.anInt2343;
					local446 = super.anInt2340 + (local457 * super.anInt2341 + super.anInt2334 * local486 + super.anInt2342 * local282 >> 14);
					local317 = (super.anInt2344 * local457 + super.anInt2333 * local486 + local282 * super.anInt2339 >> 14) + super.anInt2332;
					local373 = super.anInt2343 + (local282 * super.anInt2335 + local328 * super.anInt2337 + local498 * super.anInt2338 >> 14);
					local429 = super.anInt2340 + (local282 * super.anInt2342 + local498 * super.anInt2341 + local328 * super.anInt2334 >> 14);
					local474 = super.anInt2332 + (local328 * super.anInt2333 + super.anInt2344 * local498 + super.anInt2339 * local282 >> 14);
					local92 = super.anInt2343 + (super.anInt2337 * local384 + super.anInt2338 * local457 + local345 * super.anInt2335 >> 14);
					local119 = (local457 * super.anInt2341 + local384 * super.anInt2334 + super.anInt2342 * local345 >> 14) + super.anInt2340;
					local142 = (super.anInt2339 * local345 + super.anInt2344 * local457 + local384 * super.anInt2333 >> 14) + super.anInt2332;
					for (local167 = 0; local167 < local1593.aShort125; local167++) {
						local46 = local167 * 3;
						local48 = local46 + 1;
						local50 = local48 + 1;
						local52 = arg6[local46];
						local192 = arg6[local48];
						local66 = arg6[local50];
						local75 = arg1[local46];
						local287 = arg1[local48];
						local536 = arg1[local50];
						local769 = arg5[local46] + arg5[local48] + arg5[local50];
						if ((local536 - local287) * (-local192 + local52) - (local75 - local287) * (local66 + -local192) > 0) {
							arg0.aBoolean527 = local52 < 0 || local192 < 0 || local66 < 0 || arg0.anInt6162 < local52 || local192 > arg0.anInt6162 || arg0.anInt6162 < local66;
							@Pc(2556) short local2556 = local1593.aShortArray152[local167];
							if (local769 >= 765) {
								arg0.method5139(local75, local287, local536, local52, local192, local66, super.aClass15_Sub1_4.anInt5044);
							} else {
								if (local2556 != -1 && this.method2116(super.aClass15_Sub1_4.anInterface4_11.method3088(local2556).aByte54)) {
									arg0.anInt6164 = 100;
								}
								if (local769 > 0) {
									if (local2556 != -1) {
										arg0.method5144(local75, local287, local536, local52, local192, local66, super.aClass15_Sub1_4.anInt5044, arg5[local46], arg5[local48], arg5[local50], local1593.anIntArray647[local46], local1593.anIntArray647[local48], local1593.anIntArray647[local50], local401, local373, local92, local446, local429, local119, local317, local474, local142, local2556);
									} else if ((local1593.anIntArray647[local46] & 0xFFFFFF) != 0) {
										arg0.method5141(local75, local287, local536, local52, local192, local66, Static364.method6010(super.aClass15_Sub1_4.anInt5044 | arg5[local46] << 24, local1593.anIntArray647[local46]), Static364.method6010(super.aClass15_Sub1_4.anInt5044 | arg5[local48] << 24, local1593.anIntArray647[local48]), Static364.method6010(arg5[local50] << 24 | super.aClass15_Sub1_4.anInt5044, local1593.anIntArray647[local50]));
									}
								} else if (local2556 != -1) {
									arg0.method5142(local75, local287, local536, local52, local192, local66, local1593.anIntArray647[local46], local1593.anIntArray647[local48], local1593.anIntArray647[local50], local401, local373, local92, local446, local429, local119, local317, local474, local142, local2556);
								} else if ((local1593.anIntArray647[local46] & 0xFFFFFF) != 0) {
									arg0.method5141(local75, local287, local536, local52, local192, local66, local1593.anIntArray647[local46], local1593.anIntArray647[local48], local1593.anIntArray647[local50]);
								}
								arg0.anInt6164 = 0;
							}
						}
					}
				}
			}
		} else if ((local16.aByte95 & 0x2) == 0) {
			@Pc(29) int local29 = arg3 * super.anInt10458;
			local34 = local29 + super.anInt10458;
			local39 = arg2 * super.anInt10458;
			local44 = local39 + super.anInt10458;
			local46 = 0;
			local48 = 0;
			local50 = 0;
			local52 = 0;
			if ((local16.aByte95 & 0x1) == 0 || arg4) {
				local66 = super.anIntArrayArray20[arg3][arg2];
				local75 = super.anIntArrayArray20[arg3 + 1][arg2];
				local287 = super.anIntArrayArray20[arg3 + 1][arg2 + 1];
				local536 = super.anIntArrayArray20[arg3][arg2 + 1];
				if (super.anInt2336 == -1) {
					local92 = (local39 * super.anInt2339 + local66 * super.anInt2333 + super.anInt2344 * local29 >> 14) + super.anInt2332;
					if (super.aClass15_Sub1_4.anInt5035 >= local92) {
						return;
					}
					local119 = (local75 * super.anInt2333 + local34 * super.anInt2344 + local39 * super.anInt2339 >> 14) + super.anInt2332;
					if (local119 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local142 = (local44 * super.anInt2339 + super.anInt2344 * local34 + local287 * super.anInt2333 >> 14) + super.anInt2332;
					if (local142 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local167 = (local536 * super.anInt2333 + local29 * super.anInt2344 + local44 * super.anInt2339 >> 14) + super.anInt2332;
					if (local167 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
				} else {
					local167 = super.anInt2336;
					local142 = super.anInt2336;
					local119 = super.anInt2336;
					local92 = super.anInt2336;
				}
				if (arg4) {
					local192 = local92 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 255) {
						local192 = 255;
					}
					if (local192 > 0) {
						local46 = local192;
						local769 = local16.aShort114 * local192 / 255;
						if (local769 > 0) {
							local66 -= local769;
						}
					}
					local192 = local119 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 255) {
						local192 = 255;
					}
					if (local192 > 0) {
						local48 = local192;
						local769 = local192 * local16.aShort112 / 255;
						if (local769 > 0) {
							local75 -= local769;
						}
					}
					local192 = local142 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 255) {
						local192 = 255;
					}
					if (local192 > 0) {
						local50 = local192;
						local769 = local192 * local16.aShort113 / 255;
						if (local769 > 0) {
							local287 -= local769;
						}
					}
					local192 = local167 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 255) {
						local192 = 255;
					}
					if (local192 > 0) {
						local52 = local192;
						local769 = local192 * local16.aShort116 / 255;
						if (local769 > 0) {
							local536 -= local769;
						}
					}
				} else if (super.aClass15_Sub1_4.aBoolean429) {
					local192 = local92 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 0) {
						local46 = local192;
						if (local192 > 255) {
							local46 = 255;
						}
					}
					local192 = local119 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 0) {
						local48 = local192;
						if (local192 > 255) {
							local48 = 255;
						}
					}
					local192 = local142 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 0) {
						local50 = local192;
						if (local192 > 255) {
							local50 = 255;
						}
					}
					local192 = local167 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 0) {
						local52 = local192;
						if (local192 > 255) {
							local52 = 255;
						}
					}
				}
				local282 = (super.anInt2335 * local39 + super.anInt2337 * local66 + super.anInt2338 * local29 >> 14) + super.anInt2343;
				local317 = super.anInt2340 + (local39 * super.anInt2342 + super.anInt2334 * local66 + super.anInt2341 * local29 >> 14);
				local298 = local282 * super.aClass15_Sub1_4.anInt5032 / local92 + arg0.anInt6166;
				local328 = arg0.anInt6163 + super.aClass15_Sub1_4.anInt5040 * local317 / local92;
				local345 = (super.anInt2338 * local34 + local75 * super.anInt2337 + local39 * super.anInt2335 >> 14) + super.anInt2343;
				local356 = super.aClass15_Sub1_4.anInt5032 * local345 / local119 + arg0.anInt6166;
				local373 = super.anInt2340 + (local75 * super.anInt2334 + local34 * super.anInt2341 + super.anInt2342 * local39 >> 14);
				local384 = arg0.anInt6163 + super.aClass15_Sub1_4.anInt5040 * local373 / local119;
				local401 = super.anInt2343 + (super.anInt2335 * local44 + super.anInt2337 * local287 + super.anInt2338 * local34 >> 14);
				local412 = arg0.anInt6166 + super.aClass15_Sub1_4.anInt5032 * local401 / local142;
				local429 = (local44 * super.anInt2342 + local34 * super.anInt2341 + local287 * super.anInt2334 >> 14) + super.anInt2340;
				local446 = (local44 * super.anInt2335 + super.anInt2338 * local29 + super.anInt2337 * local536 >> 14) + super.anInt2343;
				local457 = super.aClass15_Sub1_4.anInt5040 * local429 / local142 + arg0.anInt6163;
				local486 = super.aClass15_Sub1_4.anInt5032 * local446 / local167 + arg0.anInt6166;
				local474 = (local29 * super.anInt2341 + super.anInt2334 * local536 + super.anInt2342 * local44 >> 14) + super.anInt2340;
				local498 = local474 * super.aClass15_Sub1_4.anInt5040 / local167 + arg0.anInt6163;
			} else {
				local66 = super.anIntArrayArray20[arg3][arg2];
				if (super.anInt2336 == -1) {
					local75 = super.anInt2333 * local66;
					local92 = (super.anInt2339 * local39 + local75 + local29 * super.anInt2344 >> 14) + super.anInt2332;
					if (local92 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local119 = (local39 * super.anInt2339 + local75 + super.anInt2344 * local34 >> 14) + super.anInt2332;
					if (local119 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local142 = (local44 * super.anInt2339 + local75 + super.anInt2344 * local34 >> 14) + super.anInt2332;
					if (super.aClass15_Sub1_4.anInt5035 >= local142) {
						return;
					}
					local167 = super.anInt2332 + (local29 * super.anInt2344 + local75 + super.anInt2339 * local44 >> 14);
					if (local167 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
				} else {
					local167 = super.anInt2336;
					local142 = super.anInt2336;
					local119 = super.anInt2336;
					local92 = super.anInt2336;
				}
				if (super.aClass15_Sub1_4.aBoolean429) {
					local192 = local92 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 0) {
						local46 = local192;
						if (local192 > 255) {
							local46 = 255;
						}
					}
					local192 = local119 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 0) {
						local48 = local192;
						if (local192 > 255) {
							local48 = 255;
						}
					}
					local192 = local142 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 0) {
						local50 = local192;
						if (local192 > 255) {
							local50 = 255;
						}
					}
					local192 = local167 - super.aClass15_Sub1_4.anInt5027;
					if (local192 > 0) {
						local52 = local192;
						if (local192 > 255) {
							local52 = 255;
						}
					}
				}
				local75 = local66 * super.anInt2337;
				local282 = super.anInt2343 + (local29 * super.anInt2338 + local75 + super.anInt2335 * local39 >> 14);
				local287 = local66 * super.anInt2334;
				local298 = arg0.anInt6166 + local282 * super.aClass15_Sub1_4.anInt5032 / local92;
				local317 = super.anInt2340 + (super.anInt2341 * local29 + local287 + local39 * super.anInt2342 >> 14);
				local328 = super.aClass15_Sub1_4.anInt5040 * local317 / local92 + arg0.anInt6163;
				local345 = (local39 * super.anInt2335 + local75 + local34 * super.anInt2338 >> 14) + super.anInt2343;
				local356 = local345 * super.aClass15_Sub1_4.anInt5032 / local119 + arg0.anInt6166;
				local373 = super.anInt2340 + (local39 * super.anInt2342 + local287 + super.anInt2341 * local34 >> 14);
				local384 = arg0.anInt6163 + super.aClass15_Sub1_4.anInt5040 * local373 / local119;
				local401 = (super.anInt2335 * local44 + super.anInt2338 * local34 + local75 >> 14) + super.anInt2343;
				local412 = arg0.anInt6166 + super.aClass15_Sub1_4.anInt5032 * local401 / local142;
				local429 = super.anInt2340 + (local287 + local34 * super.anInt2341 + super.anInt2342 * local44 >> 14);
				local446 = (local29 * super.anInt2338 + local75 + local44 * super.anInt2335 >> 14) + super.anInt2343;
				local457 = super.aClass15_Sub1_4.anInt5040 * local429 / local142 + arg0.anInt6163;
				local474 = (super.anInt2342 * local44 + local287 + local29 * super.anInt2341 >> 14) + super.anInt2340;
				local486 = arg0.anInt6166 + super.aClass15_Sub1_4.anInt5032 * local446 / local167;
				local498 = arg0.anInt6163 + super.aClass15_Sub1_4.anInt5040 * local474 / local167;
			}
			@Pc(1148) boolean local1148 = local16.aShort115 != -1 && this.method2116(super.aClass15_Sub1_4.anInterface4_11.method3088(local16.aShort115).aByte54);
			local75 = local52 + local48 + local50;
			if ((local384 - local498) * (-local486 + local412) - (local356 - local486) * (local457 + -local498) > 0) {
				arg0.aBoolean527 = local412 < 0 || local486 < 0 || local356 < 0 || local412 > arg0.anInt6162 || local486 > arg0.anInt6162 || arg0.anInt6162 < local356;
				if (local75 < 765) {
					if (local1148) {
						arg0.anInt6164 = 100;
					}
					if (local75 <= 0) {
						if (local16.aShort115 < 0) {
							arg0.method5141(local457, local498, local384, local412, local486, local356, local16.anInt8875, local16.anInt8878, local16.anInt8876);
						} else {
							arg0.method5142(local457, local498, local384, local412, local486, local356, local16.anInt8875, local16.anInt8878, local16.anInt8876, local401, local446, local345, local429, local474, local373, local142, local167, local119, local16.aShort115);
						}
					} else if (local16.aShort115 >= 0) {
						arg0.method5144(local457, local498, local384, local412, local486, local356, super.aClass15_Sub1_4.anInt5044, local50, local52, local48, local16.anInt8875, local16.anInt8878, local16.anInt8876, local401, local446, local345, local429, local474, local373, local142, local167, local119, local16.aShort115);
					} else {
						arg0.method5141(local457, local498, local384, local412, local486, local356, Static364.method6010(local50 << 24 | super.aClass15_Sub1_4.anInt5044, local16.anInt8875), Static364.method6010(super.aClass15_Sub1_4.anInt5044 | local52 << 24, local16.anInt8878), Static364.method6010(local48 << 24 | super.aClass15_Sub1_4.anInt5044, local16.anInt8876));
					}
					arg0.anInt6164 = 0;
				} else {
					arg0.method5139(local457, local498, local384, local412, local486, local356, super.aClass15_Sub1_4.anInt5044);
				}
			}
			local75 = local52 + local48 + local46;
			if ((local498 - local384) * (-local356 + local298) - (local328 - local384) * (-local356 + local486) > 0) {
				arg0.aBoolean527 = local298 < 0 || local356 < 0 || local486 < 0 || arg0.anInt6162 < local298 || arg0.anInt6162 < local356 || arg0.anInt6162 < local486;
				if (local75 < 765) {
					if (local1148) {
						arg0.anInt6164 = 100;
					}
					if (local75 > 0) {
						if (local16.aShort115 >= 0) {
							arg0.method5144(local328, local384, local498, local298, local356, local486, super.aClass15_Sub1_4.anInt5044, local46, local48, local52, local16.anInt8877, local16.anInt8876, local16.anInt8878, local282, local345, local446, local317, local373, local474, local92, local119, local167, local16.aShort115);
						} else {
							arg0.method5141(local328, local384, local498, local298, local356, local486, Static364.method6010(super.aClass15_Sub1_4.anInt5044 | local46 << 24, local16.anInt8877), Static364.method6010(super.aClass15_Sub1_4.anInt5044 | local48 << 24, local16.anInt8876), Static364.method6010(local52 << 24 | super.aClass15_Sub1_4.anInt5044, local16.anInt8878));
						}
					} else if (local16.aShort115 >= 0) {
						arg0.method5142(local328, local384, local498, local298, local356, local486, local16.anInt8877, local16.anInt8876, local16.anInt8878, local282, local345, local446, local317, local373, local474, local92, local119, local167, local16.aShort115);
					} else {
						arg0.method5141(local328, local384, local498, local298, local356, local486, local16.anInt8877, local16.anInt8876, local16.anInt8878);
					}
					arg0.anInt6164 = 0;
					return;
				}
				arg0.method5139(local328, local384, local498, local298, local356, local486, super.aClass15_Sub1_4.anInt5044);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "([IZ[ILclient!lr;I[II)V")
	private void method243(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class204 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		@Pc(25) Class97 local25 = super.aClass97ArrayArray3[arg5][arg3];
		@Pc(46) int local46;
		@Pc(57) int local57;
		@Pc(251) int local251;
		@Pc(290) int local290;
		@Pc(349) int local349;
		@Pc(407) int local407;
		@Pc(279) int local279;
		@Pc(320) int local320;
		@Pc(379) int local379;
		@Pc(435) int local435;
		@Pc(223) int local223;
		@Pc(268) int local268;
		@Pc(337) int local337;
		@Pc(396) int local396;
		@Pc(240) int local240;
		@Pc(308) int local308;
		@Pc(368) int local368;
		@Pc(424) int local424;
		@Pc(85) int local85;
		@Pc(84) int local84;
		@Pc(82) int local82;
		@Pc(80) int local80;
		@Pc(473) int local473;
		if (local25 == null) {
			@Pc(1124) Class281 local1124 = super.aClass281ArrayArray3[arg5][arg3];
			if (local1124 != null) {
				@Pc(1149) short local1149;
				if (super.anInt2336 == -1) {
					for (local407 = 0; local407 < local1124.aShort103; local407++) {
						local46 = local1124.aShortArray123[local407] + (arg5 << super.anInt10463);
						local1149 = local1124.aShortArray129[local407];
						local57 = local1124.aShortArray124[local407] + (arg3 << super.anInt10463);
						local349 = (local46 * super.anInt2344 + super.anInt2333 * local1149 + local57 * super.anInt2339 >> 14) + super.anInt2332;
						if (local349 <= super.aClass15_Sub1_4.anInt5035) {
							return;
						}
						local290 = super.anInt2340 + (local1149 * super.anInt2334 + super.anInt2341 * local46 + local57 * super.anInt2342 >> 14);
						local251 = super.anInt2343 + (local46 * super.anInt2338 + super.anInt2337 * local1149 + super.anInt2335 * local57 >> 14);
						arg4[local407] = local251 * super.aClass15_Sub1_4.anInt5032 / local349 + arg2.anInt6166;
						arg1[local407] = arg2.anInt6163 + local290 * super.aClass15_Sub1_4.anInt5040 / local349;
					}
				} else {
					for (local407 = 0; local407 < local1124.aShort103; local407++) {
						local46 = local1124.aShortArray123[local407] + (arg5 << super.anInt10463);
						local1149 = local1124.aShortArray129[local407];
						local57 = local1124.aShortArray124[local407] + (arg3 << super.anInt10463);
						local290 = super.anInt2340 + (super.anInt2334 * local1149 + local46 * super.anInt2341 + local57 * super.anInt2342 >> 14);
						local251 = (super.anInt2335 * local57 + super.anInt2338 * local46 + local1149 * super.anInt2337 >> 14) + super.anInt2343;
						arg4[local407] = arg2.anInt6166 + super.aClass15_Sub1_4.anInt5032 * local251 / super.anInt2336;
						arg1[local407] = arg2.anInt6163 + local290 * super.aClass15_Sub1_4.anInt5040 / super.anInt2336;
					}
				}
				if (local1124.aShortArray127 == null) {
					for (local407 = 0; local407 < local1124.aShort102; local407++) {
						@Pc(1383) short local1383 = local1124.aShortArray125[local407];
						@Pc(1388) short local1388 = local1124.aShortArray126[local407];
						@Pc(1393) short local1393 = local1124.aShortArray122[local407];
						local435 = arg4[local1383];
						local223 = arg4[local1388];
						local268 = arg4[local1393];
						local337 = arg1[local1383];
						local396 = arg1[local1388];
						local240 = arg1[local1393];
						if ((local240 - local396) * (-local223 + local435) - (local268 - local223) * (-local396 + local337) > 0) {
							local308 = local1124.anIntArray523[local407];
							if (local308 != -1) {
								arg2.aBoolean527 = local435 < 0 || local223 < 0 || local268 < 0 || local435 > arg2.anInt6162 || arg2.anInt6162 < local223 || arg2.anInt6162 < local268;
								arg2.method5140(local337, local396, local240, local435, local223, local268, Static593.method8378(local308, local1124.aShortArray128[local1383]), Static593.method8378(local308, local1124.aShortArray128[local1388]), Static593.method8378(local308, local1124.aShortArray128[local1393]));
							}
						}
					}
				} else {
					local407 = super.anIntArrayArray20[arg5][arg3];
					local279 = super.anIntArrayArray20[arg5 + 1][arg3];
					local320 = super.anIntArrayArray20[arg5][arg3 + 1];
					local379 = arg5 * super.anInt10458;
					local435 = super.anInt10458 + local379;
					local223 = arg3 * super.anInt10458;
					local268 = local223 + super.anInt10458;
					local337 = super.anInt2343 + (local223 * super.anInt2335 + local407 * super.anInt2337 + super.anInt2338 * local379 >> 14);
					local396 = (super.anInt2342 * local223 + local379 * super.anInt2341 + super.anInt2334 * local407 >> 14) + super.anInt2340;
					local240 = super.anInt2332 + (super.anInt2339 * local223 + super.anInt2333 * local407 + super.anInt2344 * local379 >> 14);
					local308 = (local223 * super.anInt2335 + local279 * super.anInt2337 + local435 * super.anInt2338 >> 14) + super.anInt2343;
					local368 = (local435 * super.anInt2341 + super.anInt2334 * local279 + super.anInt2342 * local223 >> 14) + super.anInt2340;
					local424 = super.anInt2332 + (local223 * super.anInt2339 + super.anInt2344 * local435 + super.anInt2333 * local279 >> 14);
					local85 = super.anInt2343 + (local320 * super.anInt2337 + local379 * super.anInt2338 + super.anInt2335 * local268 >> 14);
					local84 = (super.anInt2342 * local268 + local379 * super.anInt2341 + local320 * super.anInt2334 >> 14) + super.anInt2340;
					local82 = super.anInt2332 + (local379 * super.anInt2344 + local320 * super.anInt2333 + local268 * super.anInt2339 >> 14);
					for (local80 = 0; local80 < local1124.aShort102; local80++) {
						@Pc(1760) short local1760 = local1124.aShortArray125[local80];
						@Pc(1765) short local1765 = local1124.aShortArray126[local80];
						@Pc(1770) short local1770 = local1124.aShortArray122[local80];
						local473 = arg4[local1760];
						@Pc(1778) int local1778 = arg4[local1765];
						@Pc(1782) int local1782 = arg4[local1770];
						@Pc(1786) int local1786 = arg1[local1760];
						@Pc(1790) int local1790 = arg1[local1765];
						@Pc(1794) int local1794 = arg1[local1770];
						if ((local1794 - local1790) * (-local1778 + local473) - (local1782 - local1778) * (local1786 - local1790) > 0) {
							arg2.aBoolean527 = local473 < 0 || local1778 < 0 || local1782 < 0 || arg2.anInt6162 < local473 || local1778 > arg2.anInt6162 || arg2.anInt6162 < local1782;
							@Pc(1854) short local1854 = local1124.aShortArray127[local80];
							if (local1854 == -1) {
								@Pc(1911) int local1911 = local1124.anIntArray523[local80];
								if (local1911 != -1) {
									arg2.method5140(local1786, local1790, local1794, local473, local1778, local1782, Static593.method8378(local1911, local1124.aShortArray128[local1760]), Static593.method8378(local1911, local1124.aShortArray128[local1765]), Static593.method8378(local1911, local1124.aShortArray128[local1770]));
								}
							} else {
								if (this.method2116(super.aClass15_Sub1_4.anInterface4_11.method3088(local1854).aByte54)) {
									arg2.anInt6164 = 100;
								}
								arg2.method5142(local1786, local1790, local1794, local473, local1778, local1782, local1124.aShortArray128[local1760], local1124.aShortArray128[local1765], local1124.aShortArray128[local1770], local337, local308, local85, local396, local368, local84, local240, local424, local82, local1854);
								arg2.anInt6164 = 0;
							}
						}
					}
				}
			}
		} else if ((local25.aByte29 & 0x2) == 0) {
			@Pc(41) int local41 = arg5 * super.anInt10458;
			local46 = super.anInt10458 + local41;
			@Pc(51) int local51 = super.anInt10458 * arg3;
			local57 = local51 + super.anInt10458;
			@Pc(72) int local72;
			@Pc(92) int local92;
			@Pc(206) int local206;
			if ((local25.aByte29 & 0x1) == 0) {
				local72 = super.anIntArrayArray20[arg5][arg3];
				local92 = super.anIntArrayArray20[arg5 + 1][arg3];
				local206 = super.anIntArrayArray20[arg5 + 1][arg3 + 1];
				local473 = super.anIntArrayArray20[arg5][arg3 + 1];
				if (super.anInt2336 == -1) {
					local85 = super.anInt2332 + (super.anInt2339 * local51 + local41 * super.anInt2344 + super.anInt2333 * local72 >> 14);
					if (super.aClass15_Sub1_4.anInt5035 >= local85) {
						return;
					}
					local84 = super.anInt2332 + (super.anInt2333 * local92 + super.anInt2344 * local46 + local51 * super.anInt2339 >> 14);
					if (super.aClass15_Sub1_4.anInt5035 >= local84) {
						return;
					}
					local82 = (local57 * super.anInt2339 + local46 * super.anInt2344 + local206 * super.anInt2333 >> 14) + super.anInt2332;
					if (super.aClass15_Sub1_4.anInt5035 >= local82) {
						return;
					}
					local80 = (local473 * super.anInt2333 + local41 * super.anInt2344 + super.anInt2339 * local57 >> 14) + super.anInt2332;
					if (super.aClass15_Sub1_4.anInt5035 >= local80) {
						return;
					}
				} else {
					local80 = super.anInt2336;
					local82 = super.anInt2336;
					local84 = super.anInt2336;
					local85 = super.anInt2336;
				}
				local223 = super.anInt2343 + (local72 * super.anInt2337 + local41 * super.anInt2338 + super.anInt2335 * local51 >> 14);
				local251 = arg2.anInt6166 + local223 * super.aClass15_Sub1_4.anInt5032 / local85;
				local240 = super.anInt2340 + (super.anInt2342 * local51 + super.anInt2334 * local72 + super.anInt2341 * local41 >> 14);
				local279 = arg2.anInt6163 + super.aClass15_Sub1_4.anInt5040 * local240 / local85;
				local268 = super.anInt2343 + (super.anInt2337 * local92 + local46 * super.anInt2338 + local51 * super.anInt2335 >> 14);
				local290 = arg2.anInt6166 + super.aClass15_Sub1_4.anInt5032 * local268 / local84;
				local308 = (local51 * super.anInt2342 + super.anInt2334 * local92 + super.anInt2341 * local46 >> 14) + super.anInt2340;
				local320 = super.aClass15_Sub1_4.anInt5040 * local308 / local84 + arg2.anInt6163;
				local337 = (local57 * super.anInt2335 + local46 * super.anInt2338 + local206 * super.anInt2337 >> 14) + super.anInt2343;
				local368 = super.anInt2340 + (super.anInt2342 * local57 + local46 * super.anInt2341 + super.anInt2334 * local206 >> 14);
				local349 = arg2.anInt6166 + super.aClass15_Sub1_4.anInt5032 * local337 / local82;
				local379 = super.aClass15_Sub1_4.anInt5040 * local368 / local82 + arg2.anInt6163;
				local396 = super.anInt2343 + (local473 * super.anInt2337 + super.anInt2338 * local41 + local57 * super.anInt2335 >> 14);
				local407 = arg2.anInt6166 + super.aClass15_Sub1_4.anInt5032 * local396 / local80;
				local424 = (super.anInt2342 * local57 + local41 * super.anInt2341 + local473 * super.anInt2334 >> 14) + super.anInt2340;
				local435 = arg2.anInt6163 + local424 * super.aClass15_Sub1_4.anInt5040 / local80;
			} else {
				local72 = super.anIntArrayArray20[arg5][arg3];
				if (super.anInt2336 == -1) {
					local92 = super.anInt2333 * local72;
					local85 = super.anInt2332 + (local92 + local41 * super.anInt2344 + super.anInt2339 * local51 >> 14);
					if (super.aClass15_Sub1_4.anInt5035 >= local85) {
						return;
					}
					local84 = super.anInt2332 + (local46 * super.anInt2344 + local92 + local51 * super.anInt2339 >> 14);
					if (super.aClass15_Sub1_4.anInt5035 >= local84) {
						return;
					}
					local82 = (super.anInt2339 * local57 + super.anInt2344 * local46 + local92 >> 14) + super.anInt2332;
					if (local82 <= super.aClass15_Sub1_4.anInt5035) {
						return;
					}
					local80 = super.anInt2332 + (super.anInt2344 * local41 + local92 + local57 * super.anInt2339 >> 14);
					if (super.aClass15_Sub1_4.anInt5035 >= local80) {
						return;
					}
				} else {
					local80 = super.anInt2336;
					local82 = super.anInt2336;
					local84 = super.anInt2336;
					local85 = super.anInt2336;
				}
				local92 = super.anInt2337 * local72;
				local206 = super.anInt2334 * local72;
				local223 = super.anInt2343 + (local41 * super.anInt2338 + local92 + super.anInt2335 * local51 >> 14);
				local240 = super.anInt2340 + (super.anInt2342 * local51 + local41 * super.anInt2341 + local206 >> 14);
				local251 = arg2.anInt6166 + super.aClass15_Sub1_4.anInt5032 * local223 / local85;
				local268 = super.anInt2343 + (local92 + local46 * super.anInt2338 + local51 * super.anInt2335 >> 14);
				local279 = local240 * super.aClass15_Sub1_4.anInt5040 / local85 + arg2.anInt6163;
				local290 = local268 * super.aClass15_Sub1_4.anInt5032 / local84 + arg2.anInt6166;
				local308 = (local206 + local46 * super.anInt2341 + local51 * super.anInt2342 >> 14) + super.anInt2340;
				local320 = arg2.anInt6163 + local308 * super.aClass15_Sub1_4.anInt5040 / local84;
				local337 = (local57 * super.anInt2335 + local92 + local46 * super.anInt2338 >> 14) + super.anInt2343;
				local349 = arg2.anInt6166 + super.aClass15_Sub1_4.anInt5032 * local337 / local82;
				local368 = (local46 * super.anInt2341 + local206 + local57 * super.anInt2342 >> 14) + super.anInt2340;
				local379 = super.aClass15_Sub1_4.anInt5040 * local368 / local82 + arg2.anInt6163;
				local396 = super.anInt2343 + (local41 * super.anInt2338 + local92 + super.anInt2335 * local57 >> 14);
				local407 = super.aClass15_Sub1_4.anInt5032 * local396 / local80 + arg2.anInt6166;
				local424 = super.anInt2340 + (super.anInt2342 * local57 + local41 * super.anInt2341 + local206 >> 14);
				local435 = arg2.anInt6163 + local424 * super.aClass15_Sub1_4.anInt5040 / local80;
			}
			if (-((local379 - local435) * (-local407 + local290)) + (local320 - local435) * (local349 - local407) > 0) {
				arg2.aBoolean527 = local349 < 0 || local407 < 0 || local290 < 0 || local349 > arg2.anInt6162 || local407 > arg2.anInt6162 || local290 > arg2.anInt6162;
				if (local25.aShort39 < 0) {
					arg2.method5140(local379, local435, local320, local349, local407, local290, local25.aShort38 & 0xFFFF, local25.aShort41 & 0xFFFF, local25.aShort40 & 0xFFFF);
				} else {
					if (this.method2116(super.aClass15_Sub1_4.anInterface4_11.method3088(local25.aShort39).aByte54)) {
						arg2.anInt6164 = 100;
					}
					arg2.method5142(local379, local435, local320, local349, local407, local290, local25.aShort38 & 0xFFFF, local25.aShort41 & 0xFFFF, local25.aShort40 & 0xFFFF, local223, local268, local396, local240, local308, local424, local85, local84, local80, local25.aShort39);
					arg2.anInt6164 = 0;
				}
			}
			if ((local251 - local290) * (local435 + -local320) - (local407 - local290) * (-local320 + local279) > 0) {
				arg2.aBoolean527 = local251 < 0 || local290 < 0 || local407 < 0 || arg2.anInt6162 < local251 || local290 > arg2.anInt6162 || local407 > arg2.anInt6162;
				if (local25.aShort39 >= 0) {
					if (this.method2116(super.aClass15_Sub1_4.anInterface4_11.method3088(local25.aShort39).aByte54)) {
						arg2.anInt6164 = 100;
					}
					arg2.method5142(local279, local320, local435, local251, local290, local407, local25.aShort42 & 0xFFFF, local25.aShort40 & 0xFFFF, local25.aShort41 & 0xFFFF, local223, local268, local396, local240, local308, local424, local85, local84, local80, local25.aShort39);
					arg2.anInt6164 = 0;
					return;
				}
				arg2.method5140(local279, local320, local435, local251, local290, local407, local25.aShort42 & 0xFFFF, local25.aShort40 & 0xFFFF, local25.aShort41 & 0xFFFF);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIII[[Z)V")
	@Override
	public void method8446(@OriginalArg(3) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) boolean[][] arg4) {
		@Pc(9) Class91_Sub1 local9 = (Class91_Sub1) super.aClass15_Sub1_4.method4266(Thread.currentThread());
		@Pc(12) Class204 local12 = local9.aClass204_1;
		local12.anInt6164 = 0;
		local12.aBoolean527 = false;
		if (super.aClass295ArrayArray3 != null) {
			this.method245(arg3, arg0, local9.anIntArray243, local9.anIntArray258, arg1, arg2, local12, arg4);
		} else if (super.aClass97ArrayArray3 != null) {
			this.method241(arg4, arg2, arg1, arg3, local9.anIntArray258, arg0, local9.anIntArray243, local12);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(III[I[IIILclient!lr;III[[Z)V")
	private void method245(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class204 arg6, @OriginalArg(11) boolean[][] arg7) {
		@Pc(19) int local19 = (arg0 - arg4) * 1024 / 256;
		arg6.aBoolean528 = false;
		arg6.aBoolean526 = false;
		@Pc(31) int local31 = 0;
		@Pc(35) int local35 = local19;
		for (@Pc(37) int local37 = arg1; local37 < arg5; local37++) {
			for (@Pc(41) int local41 = arg4; local41 < arg0; local41++) {
				if (arg7[local37 - arg1][local41 - arg4]) {
					@Pc(94) int local94;
					if (super.aClass295ArrayArray3[local37][local41] != null) {
						@Pc(69) Class295 local69 = super.aClass295ArrayArray3[local37][local41];
						if (local69.aShort115 != -1 && (local69.aByte95 & 0x2) == 0 && local69.anInt8879 == 0) {
							local94 = super.aClass15_Sub1_4.method4278(local69.aShort115);
							arg6.method5140(local35 - 4, local35 + -4, local35, local31 + 4, local31, local31 + 4, Static593.method8378(local94, local69.anInt8875), Static593.method8378(local94, local69.anInt8878), Static593.method8378(local94, local69.anInt8876));
							arg6.method5140(local35, local35, local35 - 4, local31, local31 + 4, local31, Static593.method8378(local94, local69.anInt8877), Static593.method8378(local94, local69.anInt8876), Static593.method8378(local94, local69.anInt8878));
						} else if (local69.anInt8879 == 0) {
							arg6.method5141(local35 - 4, local35 - 4, local35, local31 + 4, local31, local31 + 4, local69.anInt8875, local69.anInt8878, local69.anInt8876);
							arg6.method5141(local35, local35, local35 - 4, local31, local31 + 4, local31, local69.anInt8877, local69.anInt8876, local69.anInt8878);
						} else {
							local94 = local69.anInt8879;
							arg6.method5141(local35 - 4, local35 - 4, local35, local31 + 4, local31, local31 + 4, Static364.method6010(local69.anInt8875 & 0xFF000000, local94), Static364.method6010(local69.anInt8878 & 0xFF000000, local94), Static364.method6010(local69.anInt8876 & 0xFF000000, local94));
							arg6.method5141(local35, local35, local35 - 4, local31, local31 + 4, local31, Static364.method6010(local69.anInt8877 & 0xFF000000, local94), Static364.method6010(local69.anInt8876 & 0xFF000000, local94), Static364.method6010(local69.anInt8878 & 0xFF000000, local94));
						}
					} else if (super.aClass330ArrayArray3[local37][local41] != null) {
						@Pc(296) Class330 local296 = super.aClass330ArrayArray3[local37][local41];
						for (local94 = 0; local94 < local296.aShort124; local94++) {
							arg2[local94] = local31 + local296.aShortArray150[local94] * 4 / super.anInt10458;
							arg3[local94] = local35 - local296.aShortArray149[local94] * 4 / super.anInt10458;
						}
						for (@Pc(337) int local337 = 0; local337 < local296.aShort125; local337++) {
							@Pc(343) int local343 = local337 * 3;
							@Pc(347) int local347 = local343 + 1;
							@Pc(351) int local351 = local347 + 1;
							@Pc(355) int local355 = arg2[local343];
							@Pc(359) int local359 = arg2[local347];
							@Pc(363) int local363 = arg2[local351];
							@Pc(367) int local367 = arg3[local343];
							@Pc(371) int local371 = arg3[local347];
							@Pc(375) int local375 = arg3[local351];
							@Pc(415) int local415;
							if (local296.anIntArray646 != null && local296.anIntArray646[local337] != 0 && (local296.aShortArray152 == null || local296.aShortArray152 != null && local296.aShortArray152[local337] == -1)) {
								local415 = local296.anIntArray646[local337];
								arg6.method5141(local367, local371, local375, local355, local359, local363, Static364.method6010(-(-16777216 & local296.anIntArray647[local343]) - 16777216, local415), Static364.method6010(-(local296.anIntArray647[local347] & -16777216) - 16777216, local415), Static364.method6010(-(-16777216 & local296.anIntArray647[local351]) - 16777216, local415));
							} else if (local296.aShortArray152 == null || local296.aShortArray152[local337] == -1) {
								arg6.method5141(local367, local371, local375, local355, local359, local363, local296.anIntArray647[local343], local296.anIntArray647[local347], local296.anIntArray647[local351]);
							} else {
								local415 = super.aClass15_Sub1_4.method4278(local296.aShortArray152[local337]);
								arg6.method5140(local367, local371, local375, local355, local359, local363, local415, local415, local415);
							}
						}
					}
				}
				local35 -= 4;
			}
			local31 += 4;
			local35 = local19;
		}
		arg6.aBoolean526 = true;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
	@Override
	public void method8442(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(9) Class91_Sub1 local9 = (Class91_Sub1) super.aClass15_Sub1_4.method4266(Thread.currentThread());
		local9.aClass204_1.anInt6164 = 0;
		if (super.aClass295ArrayArray3 != null) {
			this.method242(local9.aClass204_1, local9.anIntArray258, arg1, arg0, super.aClass15_Sub1_4.aBoolean427, local9.anIntArray253, local9.anIntArray243);
		} else if (super.aClass97ArrayArray3 != null) {
			this.method243(local9.anIntArray253, local9.anIntArray258, local9.aClass204_1, arg1, local9.anIntArray243, arg0);
			return;
		}
	}
}
