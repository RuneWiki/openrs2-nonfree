import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!rl", name = "c", descriptor = "Lclient!lga;")
	public static Class223 aClass223_103;

	@OriginalMember(owner = "client!rl", name = "h", descriptor = "Lclient!wfa;")
	public static Class391 aClass391_2;

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "[I")
	public static final int[] anIntArray580 = new int[1024];

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZII[II[IB[IIII[[[BIIZ[I[I)V")
	public static void method7618(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) byte arg7, @OriginalArg(8) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) byte[][][] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(16) int[] arg14, @OriginalArg(17) int[] arg15) {
		if (Static290.anInt10204 == -1) {
			return;
		}
		@Pc(14) int[] local14 = Static409.aClass75_13.Y();
		@Pc(18) int local18 = local14[0];
		@Pc(22) int local22 = local14[1];
		@Pc(26) int local26 = local14[2];
		@Pc(30) int local30 = local14[3];
		@Pc(32) int local32 = local26;
		@Pc(34) int local34 = local30;
		if (Static290.anInt10204 == 1) {
			local32 = (int) ((double) Static159.anInt3316 * (double) local26 / (double) Static294.anInt5224);
			local34 = (int) ((double) Static159.anInt3316 * (double) local30 / (double) Static294.anInt5224);
		}
		if (!Static429.aBoolean549) {
			if (Static290.anInt10204 == 1) {
				Static103.method1984();
			}
			@Pc(77) int local77 = arg0 - Static456.anInt7871;
			@Pc(82) int local82 = arg5 - Static468.anInt8024;
			@Pc(87) int local87 = arg10 - Static92.anInt1368;
			@Pc(109) int local109 = (int) ((double) local32 * (Static517.aDouble44 * (double) local82 + (double) local77 * Static522.aDouble46 + (double) local87 * Static427.aDouble29) / (double) arg2);
			@Pc(131) int local131 = (int) ((double) local34 * ((double) local87 * Static41.aDouble4 + Static410.aDouble27 * (double) local77 + (double) local82 * Static526.aDouble47) / (double) arg2);
			@Pc(146) double local146 = (double) local87 * Static480.aDouble55 + Static494.aDouble18 * (double) local77 + (double) local82 * Static277.aDouble21;
			@Pc(152) int local152 = local109 + Static105.anInt2096 - Static309.anInt5369;
			@Pc(160) int local160 = Static163.anInt3412 + local131 - Static84.anInt1290;
			@Pc(164) int local164 = Static334.anInt5734 + local152;
			@Pc(169) int local169 = local160 + Static159.anInt3316;
			if (local152 >= 0 && local160 >= 0 && local164 <= Static367.anInt6186 && Static294.anInt5224 >= local169 || Static290.anInt10204 == 2) {
				Static592.anInt9421 = local152;
				if (Static290.anInt10204 == 2) {
					Static498.aDouble42 = -local146;
				}
				Static211.anInt4193 = local160;
			} else if (local164 > 0 && local169 > 0 && local152 < Static367.anInt6186 && local160 < Static294.anInt5224) {
				@Pc(247) int local247 = local152 - Static105.anInt2096;
				@Pc(252) int local252 = local160 - Static163.anInt3412;
				@Pc(254) int local254 = 0;
				@Pc(256) int local256 = 0;
				@Pc(258) int local258 = 0;
				@Pc(260) int local260 = 0;
				@Pc(262) double local262 = 0.0D;
				if (Static290.anInt10204 == 0) {
					local262 = Static498.aDouble42 + local146;
					local256 = local252;
					local254 = local247;
				} else if (Static290.anInt10204 == 1) {
					local260 = local252 / Static682.anInt10442;
					local258 = local247 / Static662.anInt10244;
					local256 = local260 * Static682.anInt10442;
					local254 = Static662.anInt10244 * local258;
					local262 = (double) (local256 * local252 + local247 * local254) * (Static498.aDouble42 + local146) / (double) (local247 * local247 + local252 * local252);
				}
				local262 = -local262;
				@Pc(322) int local322 = 0;
				@Pc(324) int local324 = 0;
				@Pc(326) int local326 = 0;
				@Pc(328) int local328 = 0;
				@Pc(330) int local330 = 0;
				@Pc(344) int local344;
				@Pc(341) int local341;
				@Pc(337) int local337;
				@Pc(354) int local354;
				if (local254 < 0) {
					local337 = 0;
					local341 = local254 + Static367.anInt6186;
					local344 = -local254;
					if (Static290.anInt10204 == 1) {
						local330 = -local258;
						local326 = 0;
					}
					local354 = local344;
				} else {
					local341 = Static367.anInt6186 - local254;
					local344 = 0;
					local337 = local341;
					if (Static290.anInt10204 == 1) {
						local326 = Static585.anInt9330 - local258;
						local330 = local258;
					}
					local354 = local254;
				}
				@Pc(379) int local379 = 0;
				@Pc(390) int local390;
				@Pc(385) int local385;
				@Pc(387) int local387;
				@Pc(392) int local392;
				@Pc(408) int local408;
				if (local256 < 0) {
					local385 = Static294.anInt5224 + local256;
					local387 = 0;
					local390 = -local256;
					local392 = local390;
					if (Static290.anInt10204 == 1) {
						local322 = 0;
						local324 = -local260;
						local328 = local324;
						local379 = local260 + Static37.anInt497;
					}
					local408 = local390;
				} else {
					local390 = 0;
					local385 = Static294.anInt5224 - local256;
					local392 = local256;
					if (Static290.anInt10204 == 1) {
						local322 = Static37.anInt497 - local260;
						local328 = 0;
						local324 = local260;
						local379 = local322;
					}
					local387 = local385;
					local408 = 0;
				}
				@Pc(446) Class385 local446 = Static23.aClass284_1.aClass385_7;
				@Pc(460) int local460;
				for (@Pc(451) Class60_Sub9 local451 = (Class60_Sub9) local446.method8778(); local451 != null; local451 = (Class60_Sub9) local446.method8773()) {
					@Pc(456) Class60_Sub10[] local456 = local451.aClass60_Sub10Array1;
					@Pc(458) boolean local458 = true;
					for (local460 = 0; local460 < local456.length; local460++) {
						@Pc(466) Class60_Sub10 local466 = local456[local460];
						@Pc(469) int local469 = local466.anInt10340;
						@Pc(472) int local472 = local466.anInt10338;
						@Pc(475) int local475 = local466.anInt10341;
						@Pc(478) int local478 = local466.anInt10342;
						@Pc(485) int local485;
						local466.anInt10342 = local485 = local478 - local256;
						@Pc(493) int local493;
						local466.anInt10340 = local493 = local469 - local254;
						@Pc(500) int local500;
						local466.anInt10341 = local500 = local475 - local254;
						@Pc(508) int local508;
						local466.anInt10338 = local508 = local472 - local256;
						@Pc(512) int local512 = local466.anInt10339;
						if (local458) {
							@Pc(527) int local527 = (local493 >= local500 ? local500 : local493) - local512;
							if (local527 <= Static367.anInt6186) {
								@Pc(543) int local543 = (local508 < local485 ? local508 : local485) - local512;
								if (Static294.anInt5224 >= local543) {
									@Pc(558) int local558 = local512 + (local500 <= local493 ? local493 : local500);
									if (local558 >= 0) {
										@Pc(580) int local580 = (local485 > local508 ? local485 : local508) + local512;
										if (local580 >= 0) {
											local458 = false;
										}
									}
								}
							}
						}
					}
					if (local458) {
						local451.method8914();
						Static288.method4731(local451);
					}
				}
				if (Static290.anInt10204 == 0) {
					Static409.aClass75_13.method6665(Static391.anInterface24_1);
				}
				Static409.aClass75_13.F(-local254, -local256);
				Static409.aClass75_13.b(local344, local390, local341, local385, local262);
				Static645.method8045(Static498.aDouble42 + local262);
				Static276.aDouble20 = local262 + Static498.aDouble42;
				if (Static290.anInt10204 == 1) {
					Static92.anInt1370 = local22 - Static84.anInt1290 - local256;
					Static649.anInt10005 = local18 - Static309.anInt5369 - local254;
					Static373.anInt6283 = local34;
					Static508.anInt3295 = local32;
					Static409.aClass75_13.DA(Static649.anInt10005, Static92.anInt1370, Static508.anInt3295, Static373.anInt6283);
				} else {
					Static92.anInt1370 = local22 + Static163.anInt3412 - local256 - Static84.anInt1290;
					Static373.anInt6283 = local34;
					Static508.anInt3295 = local32;
					Static649.anInt10005 = local18 + Static105.anInt2096 - Static309.anInt5369 - local254;
					Static409.aClass75_13.DA(Static649.anInt10005, Static92.anInt1370, Static508.anInt3295, Static373.anInt6283);
				}
				Static384.method5925(Static23.aClass284_1);
				if (local392 > 0) {
					Static409.aClass75_13.KA(0, local387, Static367.anInt6186, local392 + local387);
					Static409.aClass75_13.ya();
					Static409.aClass75_13.GA(Static625.anInt9857);
					Static545.method7721(arg3, arg0, arg5, arg10, arg11, arg6, arg14, arg8, arg4, arg15, arg13, arg7, arg12, arg9, arg1, arg2, 1, false);
				}
				if (local354 > 0) {
					Static409.aClass75_13.KA(local337, local408, local337 + local354, local385 + local408);
					Static409.aClass75_13.ya();
					Static409.aClass75_13.GA(Static625.anInt9857);
					Static545.method7721(arg3, arg0, arg5, arg10, arg11, arg6, arg14, arg8, arg4, arg15, arg13, arg7, arg12, arg9, arg1, arg2, 1, false);
				}
				Static409.aClass75_13.la();
				Static319.method5020();
				if (Static290.anInt10204 == 0) {
					Static409.aClass75_13.method6715();
				}
				Static84.anInt1290 += local256;
				Static309.anInt5369 += local254;
				Static498.aDouble42 += local262;
				Static211.anInt4193 = local131 + Static163.anInt3412 - Static84.anInt1290;
				Static592.anInt9421 = Static105.anInt2096 + local109 - Static309.anInt5369;
				if (Static290.anInt10204 == 1) {
					Static6.anInt60 += local258;
					Static188.anInt3787 += local260;
					for (@Pc(840) int local840 = 0; local840 < Static37.anInt497; local840++) {
						@Pc(851) int local851 = Static667.method8846(Static37.anInt497, Static188.anInt3787 + local840) * Static585.anInt9330;
						for (local460 = 0; local460 < Static585.anInt9330; local460++) {
							@Pc(865) int local865 = local851 + Static667.method8846(Static585.anInt9330, Static6.anInt60 + local460);
							@Pc(925) boolean local925 = local322 <= local840 && local840 < local322 + local324 || local840 >= local328 && local379 + local328 > local840 && local460 >= local326 && local460 < local330 + local326;
							Static25.anInterface24Array1[local865].method8829(local460 * Static662.anInt10244, Static682.anInt10442 * local840, Static662.anInt10244, Static682.anInt10442, local925);
						}
					}
				}
			} else {
				Static429.aBoolean549 = true;
			}
		}
		if (Static429.aBoolean549) {
			Static211.anInt4193 = Static163.anInt3412;
			Static84.anInt1290 = 0;
			Static592.anInt9421 = Static105.anInt2096;
			Static92.anInt1368 = arg10;
			Static309.anInt5369 = 0;
			Static468.anInt8024 = arg5;
			Static498.aDouble42 = 0.0D;
			Static456.anInt7871 = arg0;
			if (Static290.anInt10204 == 0) {
				Static409.aClass75_13.method6665(Static391.anInterface24_1);
			}
			Static409.aClass75_13.la();
			Static409.aClass75_13.ya();
			Static409.aClass75_13.GA(Static625.anInt9857);
			Static604.aClass109_11.method4601(Static456.anInt7871, Static468.anInt8024, Static92.anInt1368, Static35.anInt464, Static500.anInt8393, Static150.anInt3123);
			Static409.aClass75_13.method6695(Static604.aClass109_11);
			if (Static290.anInt10204 == 1) {
				Static92.anInt1370 = local22;
				Static649.anInt10005 = local18;
				Static373.anInt6283 = local34;
				Static508.anInt3295 = local32;
				Static409.aClass75_13.DA(Static649.anInt10005, Static92.anInt1370, Static508.anInt3295, Static373.anInt6283);
			} else {
				Static649.anInt10005 = Static105.anInt2096 + local18;
				Static508.anInt3295 = local32;
				Static373.anInt6283 = local34;
				Static92.anInt1370 = Static163.anInt3412 + local22;
				Static409.aClass75_13.DA(Static649.anInt10005, Static92.anInt1370, Static508.anInt3295, Static373.anInt6283);
			}
			Static276.aDouble20 = 0.0D;
			Static23.aClass284_1.method7015();
			Static384.method5925(Static23.aClass284_1);
			Static545.method7721(arg3, arg0, arg5, arg10, arg11, arg6, arg14, arg8, arg4, arg15, arg13, arg7, arg12, arg9, arg1, arg2, 1, false);
			Static319.method5020();
			Static429.aBoolean549 = false;
			if (Static290.anInt10204 == 0) {
				Static409.aClass75_13.method6715();
			}
			if (Static290.anInt10204 == 1) {
				Static640.method8639();
			}
		}
		if (Static290.anInt10204 == 0) {
			Static391.anInterface24_1.method8828(Static592.anInt9421, Static211.anInt4193, Static334.anInt5734, Static159.anInt3316, 0, 0);
		}
		Static20.anInt271++;
		Static645.method8045(Static498.aDouble42);
		Static683.aDouble56 = Static498.aDouble42;
		if (Static290.anInt10204 == 0 || Static290.anInt10204 == 2) {
			if (Static290.anInt10204 == 2) {
				Static409.aClass75_13.GA(Static625.anInt9857);
				Static409.aClass75_13.ya();
			}
			Static358.anInt6041 = Static105.anInt2096 + local18 - Static309.anInt5369 - Static592.anInt9421;
			Static142.anInt2953 = local34;
			Static652.anInt10041 = local32;
			Static239.anInt4631 = local22 + Static163.anInt3412 - Static84.anInt1290 - Static211.anInt4193;
			Static409.aClass75_13.DA(Static358.anInt6041, Static239.anInt4631, Static652.anInt10041, Static142.anInt2953);
		} else if (Static290.anInt10204 == 1) {
			Static652.anInt10041 = local32;
			Static142.anInt2953 = local34;
			Static239.anInt4631 = local22 - Static84.anInt1290;
			Static358.anInt6041 = local18 - Static309.anInt5369;
			Static409.aClass75_13.DA(Static358.anInt6041, Static239.anInt4631, Static652.anInt10041, Static142.anInt2953);
			Static409.aClass75_13.KA(Static592.anInt9421, Static211.anInt4193, Static592.anInt9421 + Static334.anInt5734, Static211.anInt4193 + Static159.anInt3316);
		}
		Static545.method7721(arg3, arg0, arg5, arg10, arg11, arg6, arg14, arg8, arg4, arg15, arg13, arg7, arg12, arg9, arg1, arg2, Static290.anInt10204 == 2 ? 0 : 2, Static290.anInt10204 == 1);
		Static409.aClass75_13.la();
		Static409.aClass75_13.DA(local18, local22, local26, local30);
	}
}
