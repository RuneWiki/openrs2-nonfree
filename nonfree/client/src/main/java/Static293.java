import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static293 {

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "Lclient!ha;")
	public static Class5 aClass5_6;

	@OriginalMember(owner = "client!kfa", name = "a", descriptor = "(II[[[BII[IZ[IBZII[II[II[IZ)V")
	public static void method5026(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) byte arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int[] arg15) {
		if (Static552.anInt9486 == -1) {
			return;
		}
		@Pc(12) int[] local12 = aClass5_6.Y();
		@Pc(20) int local20 = local12[0];
		@Pc(24) int local24 = local12[1];
		@Pc(28) int local28 = local12[2];
		@Pc(32) int local32 = local12[3];
		@Pc(34) int local34 = local28;
		@Pc(36) int local36 = local32;
		if (Static552.anInt9486 == 1) {
			local34 = (int) ((double) Static287.anInt5975 * (double) local28 / (double) Static84.anInt2618);
			local36 = (int) ((double) local32 * (double) Static287.anInt5975 / (double) Static84.anInt2618);
		}
		if (!Static610.aBoolean810) {
			if (Static552.anInt9486 == 1) {
				Static268.method4833();
			}
			@Pc(73) int local73 = arg4 - Static49.anInt1667;
			@Pc(77) int local77 = arg0 - Static186.anInt4075;
			@Pc(82) int local82 = arg14 - Static51.anInt1734;
			@Pc(104) int local104 = (int) ((double) local34 * ((double) local82 * Static267.aDouble6 + (double) local77 * Static492.aDouble13 + (double) local73 * Static238.aDouble3) / (double) arg3);
			@Pc(126) int local126 = (int) ((double) local36 * ((double) local82 * Static499.aDouble22 + (double) local77 * Static408.aDouble10 + (double) local73 * Static221.aDouble2) / (double) arg3);
			@Pc(141) double local141 = Static625.aDouble25 * (double) local82 + (double) local73 * Static619.aDouble9 + (double) local77 * Static246.aDouble4;
			@Pc(148) int local148 = Static642.anInt10730 + local104 - Static342.anInt6807;
			@Pc(155) int local155 = Static401.anInt7435 + local126 - Static76.anInt2540;
			@Pc(160) int local160 = local148 + Static528.anInt9203;
			@Pc(165) int local165 = local155 + Static287.anInt5975;
			if (local148 >= 0 && local155 >= 0 && Static226.anInt5043 >= local160 && Static84.anInt2618 >= local165 || Static552.anInt9486 == 2) {
				Static483.anInt8552 = local148;
				Static477.anInt8411 = local155;
				if (Static552.anInt9486 == 2) {
					Static449.aDouble11 = -local141;
				}
			} else if (local160 > 0 && local165 > 0 && Static226.anInt5043 > local148 && local155 < Static84.anInt2618) {
				@Pc(206) int local206 = local148 - Static642.anInt10730;
				@Pc(211) int local211 = local155 - Static401.anInt7435;
				@Pc(213) int local213 = 0;
				@Pc(215) int local215 = 0;
				@Pc(217) int local217 = 0;
				@Pc(219) int local219 = 0;
				@Pc(221) double local221 = 0.0D;
				if (Static552.anInt9486 == 0) {
					local221 = Static449.aDouble11 + local141;
					local213 = local206;
					local215 = local211;
				} else if (Static552.anInt9486 == 1) {
					local219 = local211 / Static633.anInt10652;
					local217 = local206 / Static361.anInt6971;
					local215 = local219 * Static633.anInt10652;
					local213 = Static361.anInt6971 * local217;
					local221 = (double) (local206 * local213 + local211 * local215) * (Static449.aDouble11 + local141) / (double) (local206 * local206 + local211 * local211);
				}
				local221 = -local221;
				@Pc(283) int local283 = 0;
				@Pc(285) int local285 = 0;
				@Pc(287) int local287 = 0;
				@Pc(289) int local289 = 0;
				@Pc(291) int local291 = 0;
				@Pc(299) int local299;
				@Pc(297) int local297;
				@Pc(315) int local315;
				@Pc(313) int local313;
				if (local213 >= 0) {
					local297 = Static226.anInt5043 - local213;
					local299 = 0;
					if (Static552.anInt9486 == 1) {
						local291 = local217;
						local287 = Static354.anInt6877 - local217;
					}
					local313 = local213;
					local315 = local297;
				} else {
					local315 = 0;
					local299 = -local213;
					local297 = Static226.anInt5043 + local213;
					local313 = local299;
					if (Static552.anInt9486 == 1) {
						local291 = -local217;
						local287 = 0;
					}
				}
				@Pc(341) int local341 = 0;
				@Pc(345) int local345;
				@Pc(350) int local350;
				@Pc(368) int local368;
				@Pc(372) int local372;
				@Pc(370) int local370;
				if (local215 >= 0) {
					local345 = 0;
					local350 = Static84.anInt2618 - local215;
					if (Static552.anInt9486 == 1) {
						local289 = 0;
						local285 = local219;
						local283 = Static123.anInt3102 - local219;
						local341 = local283;
					}
					local368 = local350;
					local370 = 0;
					local372 = local215;
				} else {
					local350 = Static84.anInt2618 + local215;
					local368 = 0;
					local345 = -local215;
					local372 = local345;
					local370 = local345;
					if (Static552.anInt9486 == 1) {
						local283 = 0;
						local285 = -local219;
						local341 = Static123.anInt3102 + local219;
						local289 = local285;
					}
				}
				@Pc(407) Class234 local407 = Static469.aClass100_3.aClass234_4;
				@Pc(421) int local421;
				for (@Pc(412) Class9_Sub2 local412 = (Class9_Sub2) local407.method6092(); local412 != null; local412 = (Class9_Sub2) local407.method6098()) {
					@Pc(417) Class9_Sub6[] local417 = local412.aClass9_Sub6Array1;
					@Pc(419) boolean local419 = true;
					for (local421 = 0; local421 < local417.length; local421++) {
						@Pc(427) Class9_Sub6 local427 = local417[local421];
						@Pc(430) int local430 = local427.anInt6271;
						@Pc(433) int local433 = local427.anInt6273;
						@Pc(436) int local436 = local427.anInt6270;
						@Pc(439) int local439 = local427.anInt6272;
						@Pc(445) int local445;
						local427.anInt6270 = local445 = local436 - local213;
						@Pc(449) int local449 = local427.anInt6269;
						@Pc(456) int local456;
						local427.anInt6272 = local456 = local439 - local215;
						@Pc(464) int local464;
						local427.anInt6271 = local464 = local430 - local213;
						@Pc(472) int local472;
						local427.anInt6273 = local472 = local433 - local215;
						if (local419) {
							@Pc(488) int local488 = (local445 <= local464 ? local445 : local464) - local449;
							if (Static226.anInt5043 >= local488) {
								@Pc(501) int local501 = (local472 < local456 ? local472 : local456) - local449;
								if (Static84.anInt2618 >= local501) {
									@Pc(517) int local517 = local449 + (local445 > local464 ? local445 : local464);
									if (local517 >= 0) {
										@Pc(531) int local531 = local449 + (local456 > local472 ? local456 : local472);
										if (local531 >= 0) {
											local419 = false;
										}
									}
								}
							}
						}
					}
					if (local419) {
						local412.method8408();
						Static72.method2064(local412);
					}
				}
				if (Static552.anInt9486 == 0) {
					aClass5_6.method6103(Static64.anInterface20_3);
				}
				aClass5_6.F(-local213, -local215);
				aClass5_6.b(local299, local345, local297, local350, local221);
				Static81.method2197(Static449.aDouble11 + local221);
				Static508.aDouble23 = Static449.aDouble11 + local221;
				if (Static552.anInt9486 == 1) {
					Static635.anInt10682 = local24 - local215 - Static76.anInt2540;
					Static459.anInt8227 = local20 - local213 - Static342.anInt6807;
					Static265.anInt5687 = local34;
					Static116.anInt2993 = local36;
					aClass5_6.DA(Static459.anInt8227, Static635.anInt10682, Static265.anInt5687, Static116.anInt2993);
				} else {
					Static635.anInt10682 = Static401.anInt7435 + local24 - local215 - Static76.anInt2540;
					Static459.anInt8227 = Static642.anInt10730 + local20 - Static342.anInt6807 - local213;
					Static116.anInt2993 = local36;
					Static265.anInt5687 = local34;
					aClass5_6.DA(Static459.anInt8227, Static635.anInt10682, Static265.anInt5687, Static116.anInt2993);
				}
				Static156.method3071(Static469.aClass100_3);
				if (local372 > 0) {
					aClass5_6.KA(0, local368, Static226.anInt5043, local372 + local368);
					aClass5_6.ya();
					aClass5_6.GA(Static102.anInt2860);
					Static118.method2555(arg12, arg4, arg0, arg14, arg2, arg7, arg15, arg11, arg13, arg5, arg1, arg8, arg9, arg10, arg6, arg3, 1, false);
				}
				if (local313 > 0) {
					aClass5_6.KA(local315, local370, local315 + local313, local370 - -local350);
					aClass5_6.ya();
					aClass5_6.GA(Static102.anInt2860);
					Static118.method2555(arg12, arg4, arg0, arg14, arg2, arg7, arg15, arg11, arg13, arg5, arg1, arg8, arg9, arg10, arg6, arg3, 1, false);
				}
				aClass5_6.la();
				Static213.method3808();
				if (Static552.anInt9486 == 0) {
					aClass5_6.method6139();
				}
				Static449.aDouble11 += local221;
				Static76.anInt2540 += local215;
				Static342.anInt6807 += local213;
				Static483.anInt8552 = Static642.anInt10730 + local104 - Static342.anInt6807;
				Static477.anInt8411 = local126 + Static401.anInt7435 - Static76.anInt2540;
				if (Static552.anInt9486 == 1) {
					Static471.anInt5158 += local219;
					Static309.anInt6228 += local217;
					for (@Pc(772) int local772 = 0; local772 < Static123.anInt3102; local772++) {
						@Pc(784) int local784 = Static364.method5868(local772 + Static471.anInt5158, Static123.anInt3102) * Static354.anInt6877;
						for (local421 = 0; local421 < Static354.anInt6877; local421++) {
							@Pc(797) int local797 = Static364.method5868(local421 + Static309.anInt6228, Static354.anInt6877) + local784;
							@Pc(834) boolean local834 = local772 >= local283 && local772 < local283 + local285 || local289 <= local772 && local772 < local341 + local289 && local421 >= local287 && local291 + local287 > local421;
							Static320.anInterface20Array1[local797].method8479(local421 * Static361.anInt6971, local772 * Static633.anInt10652, Static361.anInt6971, Static633.anInt10652, local834);
						}
					}
				}
			} else {
				Static610.aBoolean810 = true;
			}
		}
		if (Static610.aBoolean810) {
			Static449.aDouble11 = 0.0D;
			Static483.anInt8552 = Static642.anInt10730;
			Static342.anInt6807 = 0;
			Static186.anInt4075 = arg0;
			Static51.anInt1734 = arg14;
			Static477.anInt8411 = Static401.anInt7435;
			Static49.anInt1667 = arg4;
			Static76.anInt2540 = 0;
			if (Static552.anInt9486 == 0) {
				aClass5_6.method6103(Static64.anInterface20_3);
			}
			aClass5_6.la();
			aClass5_6.ya();
			aClass5_6.GA(Static102.anInt2860);
			Static319.aClass115_3.method6283(Static49.anInt1667, Static186.anInt4075, Static51.anInt1734, Static274.anInt5859, Static198.anInt4244, Static226.anInt5045);
			aClass5_6.method6122(Static319.aClass115_3);
			if (Static552.anInt9486 == 1) {
				Static265.anInt5687 = local34;
				Static116.anInt2993 = local36;
				Static635.anInt10682 = local24;
				Static459.anInt8227 = local20;
				aClass5_6.DA(Static459.anInt8227, Static635.anInt10682, Static265.anInt5687, Static116.anInt2993);
			} else {
				Static116.anInt2993 = local36;
				Static459.anInt8227 = Static642.anInt10730 + local20;
				Static265.anInt5687 = local34;
				Static635.anInt10682 = Static401.anInt7435 + local24;
				aClass5_6.DA(Static459.anInt8227, Static635.anInt10682, Static265.anInt5687, Static116.anInt2993);
			}
			Static508.aDouble23 = 0.0D;
			Static469.aClass100_3.method3066();
			Static156.method3071(Static469.aClass100_3);
			Static118.method2555(arg12, arg4, arg0, arg14, arg2, arg7, arg15, arg11, arg13, arg5, arg1, arg8, arg9, arg10, arg6, arg3, 1, false);
			Static213.method3808();
			Static610.aBoolean810 = false;
			if (Static552.anInt9486 == 0) {
				aClass5_6.method6139();
			}
			if (Static552.anInt9486 == 1) {
				Static285.method4959();
			}
		}
		if (Static552.anInt9486 == 0) {
			Static64.anInterface20_3.method8480(Static483.anInt8552, Static477.anInt8411, Static528.anInt9203, Static287.anInt5975, 0, 0);
		}
		Static409.anInt7607++;
		Static81.method2197(Static449.aDouble11);
		Static465.aDouble12 = Static449.aDouble11;
		if (Static552.anInt9486 == 0 || Static552.anInt9486 == 2) {
			if (Static552.anInt9486 == 2) {
				aClass5_6.GA(Static102.anInt2860);
				aClass5_6.ya();
			}
			Static5.anInt456 = Static401.anInt7435 + local24 - Static76.anInt2540 - Static477.anInt8411;
			Static274.anInt5862 = local20 + Static642.anInt10730 - Static342.anInt6807 - Static483.anInt8552;
			Static629.anInt10542 = local34;
			Static66.anInt2290 = local36;
			aClass5_6.DA(Static274.anInt5862, Static5.anInt456, Static629.anInt10542, Static66.anInt2290);
		} else if (Static552.anInt9486 == 1) {
			Static274.anInt5862 = local20 - Static342.anInt6807;
			Static5.anInt456 = local24 - Static76.anInt2540;
			Static66.anInt2290 = local36;
			Static629.anInt10542 = local34;
			aClass5_6.DA(Static274.anInt5862, Static5.anInt456, Static629.anInt10542, Static66.anInt2290);
			aClass5_6.KA(Static483.anInt8552, Static477.anInt8411, Static483.anInt8552 + Static528.anInt9203, Static477.anInt8411 + Static287.anInt5975);
		}
		Static118.method2555(arg12, arg4, arg0, arg14, arg2, arg7, arg15, arg11, arg13, arg5, arg1, arg8, arg9, arg10, arg6, arg3, Static552.anInt9486 == 2 ? 0 : 2, Static552.anInt9486 == 1);
		aClass5_6.la();
		aClass5_6.DA(local20, local24, local28, local32);
	}
}
