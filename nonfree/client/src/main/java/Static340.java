import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static340 {

	@OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
	public static int anInt6390 = 503;

	@OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
	public static int anInt6393 = -1;

	@OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
	public static int anInt6395 = 0;

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Z")
	public static boolean method5708(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
	}

	@OriginalMember(owner = "client!lh", name = "b", descriptor = "(III)I")
	public static int method5709(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) int local16 = arg1 >> 31 & arg0 - 1;
		return ((arg1 >>> 31) + arg1) % arg0 + local16;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)Lclient!tr;")
	public static Class143 method5710() {
		try {
			return (Class143) Class.forName("Class143_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(I[BIIIIBI[B)V")
	public static void method5711(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7) {
		@Pc(10) int local10 = -(arg6 >> 2);
		@Pc(21) int local21 = -(arg6 & 0x3);
		for (@Pc(24) int local24 = -arg0; local24 < 0; local24++) {
			@Pc(32) int local32;
			for (@Pc(28) int local28 = local10; local28 < 0; local28++) {
				local32 = arg5++;
				arg1[local32] += arg7[arg3++];
				@Pc(44) int local44 = arg5++;
				arg1[local44] += arg7[arg3++];
				@Pc(56) int local56 = arg5++;
				arg1[local56] += arg7[arg3++];
				@Pc(68) int local68 = arg5++;
				arg1[local68] += arg7[arg3++];
			}
			for (@Pc(83) int local83 = local21; local83 < 0; local83++) {
				local32 = arg5++;
				arg1[local32] += arg7[arg3++];
			}
			arg5 += arg2;
			arg3 += arg4;
		}
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg0 < 1 || arg6 < 1 || Static222.anInt4533 - 2 < arg0 || arg6 > Static668.anInt11370 - 2) {
			return;
		}
		@Pc(28) int local28 = arg3;
		if (arg3 < 3 && Static45.method947(arg0, arg6)) {
			local28 = arg3 + 1;
		}
		if (Static230.aClass2_Sub54_15.aClass4_Sub9_1.method2556() == 0 && !Static586.method8860(arg0, Static578.anInt6963, arg6, local28)) {
			return;
		}
		if (Static193.aClass291ArrayArrayArray2 == null) {
			return;
		}
		Static223.aClass29_Sub1_1.method7868(arg3, Static196.aClass200Array1[arg3], arg0, arg6, arg1, Static607.aClass101_15);
		if (arg7 < 0) {
			return;
		}
		@Pc(73) int local73 = Static230.aClass2_Sub54_15.aClass4_Sub4_1.method925();
		Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub4_1, 1);
		Static223.aClass29_Sub1_1.method7859(arg5, arg6, arg3, local28, Static196.aClass200Array1[arg3], arg0, Static607.aClass101_15, arg4, arg7, arg2);
		Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub4_1, local73);
		return;
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(III[II[I[II[[[BBII[IB[IIZZ)V")
	public static void method5713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[][][] arg8, @OriginalArg(9) byte arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int[] arg12, @OriginalArg(14) int[] arg13, @OriginalArg(15) int arg14, @OriginalArg(17) boolean arg15) {
		if (Static255.anInt4904 == -1) {
			return;
		}
		@Pc(12) int[] local12 = Static435.aClass101_11.Y();
		@Pc(16) int local16 = local12[0];
		@Pc(20) int local20 = local12[1];
		@Pc(24) int local24 = local12[2];
		@Pc(34) int local34 = local12[3];
		@Pc(36) int local36 = local24;
		@Pc(38) int local38 = local34;
		if (Static255.anInt4904 == 1) {
			local36 = (int) ((double) local24 * (double) Static588.anInt10265 / (double) Static307.anInt5554);
			local38 = (int) ((double) Static588.anInt10265 * (double) local34 / (double) Static307.anInt5554);
		}
		if (!Static207.aBoolean327) {
			if (Static255.anInt4904 == 1) {
				Static204.method7273();
			}
			@Pc(77) int local77 = arg4 - Static353.anInt6794;
			@Pc(82) int local82 = arg10 - Static470.anInt5389;
			@Pc(87) int local87 = arg2 - Static476.anInt8535;
			@Pc(109) int local109 = (int) ((Static300.aDouble22 * (double) local82 + Static456.aDouble16 * (double) local77 + Static426.aDouble31 * (double) local87) * (double) local36 / (double) arg0);
			@Pc(131) int local131 = (int) (((double) local87 * Static598.aDouble26 + Static223.aDouble13 * (double) local82 + (double) local77 * Static522.aDouble21) * (double) local38 / (double) arg0);
			@Pc(146) double local146 = Static579.aDouble24 * (double) local82 + (double) local77 * Static573.aDouble23 + Static142.aDouble3 * (double) local87;
			@Pc(153) int local153 = local109 + Static569.anInt9977 - Static180.anInt3812;
			@Pc(161) int local161 = Static454.anInt6415 + local131 - Static31.anInt529;
			@Pc(165) int local165 = Static506.anInt8995 + local153;
			@Pc(169) int local169 = Static588.anInt10265 + local161;
			if (local153 >= 0 && local161 >= 0 && local165 <= Static488.anInt8751 && local169 <= Static307.anInt5554 || Static255.anInt4904 == 2) {
				Static5.anInt88 = local153;
				if (Static255.anInt4904 == 2) {
					Static612.aDouble27 = -local146;
				}
				Static590.anInt10296 = local161;
			} else if (local165 > 0 && local169 > 0 && local153 < Static488.anInt8751 && local161 < Static307.anInt5554) {
				@Pc(217) int local217 = local153 - Static569.anInt9977;
				@Pc(222) int local222 = local161 - Static454.anInt6415;
				@Pc(224) int local224 = 0;
				@Pc(226) int local226 = 0;
				@Pc(228) int local228 = 0;
				@Pc(230) int local230 = 0;
				@Pc(232) double local232 = 0.0D;
				if (Static255.anInt4904 == 0) {
					local224 = local217;
					local232 = local146 + Static612.aDouble27;
					local226 = local222;
				} else if (Static255.anInt4904 == 1) {
					local230 = local222 / Static341.anInt6402;
					local228 = local217 / Static532.anInt9333;
					local226 = Static341.anInt6402 * local230;
					local224 = local228 * Static532.anInt9333;
					local232 = (local146 + Static612.aDouble27) * (double) (local224 * local217 + local226 * local222) / (double) (local217 * local217 + local222 * local222);
				}
				local232 = -local232;
				@Pc(292) int local292 = 0;
				@Pc(294) int local294 = 0;
				@Pc(296) int local296 = 0;
				@Pc(298) int local298 = 0;
				@Pc(300) int local300 = 0;
				@Pc(313) int local313;
				@Pc(310) int local310;
				@Pc(315) int local315;
				@Pc(317) int local317;
				if (local224 < 0) {
					local310 = Static488.anInt8751 + local224;
					local313 = -local224;
					local315 = 0;
					local317 = local313;
					if (Static255.anInt4904 == 1) {
						local300 = -local228;
						local296 = 0;
					}
				} else {
					local310 = Static488.anInt8751 - local224;
					local313 = 0;
					local315 = local310;
					if (Static255.anInt4904 == 1) {
						local300 = local228;
						local296 = Static19.anInt353 - local228;
					}
					local317 = local224;
				}
				@Pc(350) int local350 = 0;
				@Pc(358) int local358;
				@Pc(362) int local362;
				@Pc(364) int local364;
				@Pc(366) int local366;
				@Pc(370) int local370;
				if (local226 < 0) {
					local358 = -local226;
					local362 = Static307.anInt5554 + local226;
					local364 = 0;
					local366 = local358;
					local370 = local358;
					if (Static255.anInt4904 == 1) {
						local294 = -local230;
						local292 = 0;
						local350 = Static395.anInt7388 + local230;
						local298 = local294;
					}
				} else {
					local362 = Static307.anInt5554 - local226;
					local358 = 0;
					local370 = 0;
					local366 = local226;
					local364 = local362;
					if (Static255.anInt4904 == 1) {
						local292 = Static395.anInt7388 - local230;
						local298 = 0;
						local294 = local230;
						local350 = local292;
					}
				}
				@Pc(420) Class60 local420 = Static480.aClass217_3.aClass60_7;
				@Pc(434) int local434;
				for (@Pc(425) Class15_Sub9 local425 = (Class15_Sub9) local420.method1547(); local425 != null; local425 = (Class15_Sub9) local420.method1546()) {
					@Pc(430) Class15_Sub6[] local430 = local425.aClass15_Sub6Array1;
					@Pc(432) boolean local432 = true;
					for (local434 = 0; local434 < local430.length; local434++) {
						@Pc(440) Class15_Sub6 local440 = local430[local434];
						@Pc(443) int local443 = local440.anInt2727;
						@Pc(446) int local446 = local440.anInt2728;
						@Pc(449) int local449 = local440.anInt2726;
						@Pc(452) int local452 = local440.anInt2725;
						@Pc(459) int local459;
						local440.anInt2728 = local459 = local446 - local226;
						@Pc(463) int local463 = local440.anInt2724;
						@Pc(470) int local470;
						local440.anInt2727 = local470 = local443 - local224;
						@Pc(478) int local478;
						local440.anInt2725 = local478 = local452 - local226;
						@Pc(486) int local486;
						local440.anInt2726 = local486 = local449 - local224;
						if (local432) {
							@Pc(503) int local503 = (local470 < local486 ? local470 : local486) - local463;
							if (local503 <= Static488.anInt8751) {
								@Pc(520) int local520 = (local478 > local459 ? local459 : local478) - local463;
								if (Static307.anInt5554 >= local520) {
									@Pc(532) int local532 = local463 + (local486 <= local470 ? local470 : local486);
									if (local532 >= 0) {
										@Pc(546) int local546 = local463 + (local478 <= local459 ? local459 : local478);
										if (local546 >= 0) {
											local432 = false;
										}
									}
								}
							}
						}
					}
					if (local432) {
						local425.method9741();
						Static137.method2402(local425);
					}
				}
				if (Static255.anInt4904 == 0) {
					Static435.aClass101_11.method8108(Static64.anInterface17_1);
				}
				Static435.aClass101_11.F(-local224, -local226);
				Static435.aClass101_11.b(local313, local358, local310, local362, local232);
				Static466.method7484(local232 + Static612.aDouble27);
				Static583.aDouble25 = local232 + Static612.aDouble27;
				if (Static255.anInt4904 == 1) {
					Static611.anInt10746 = local16 - local224 - Static180.anInt3812;
					Static41.anInt914 = local36;
					Static637.anInt10987 = local38;
					Static257.anInt4919 = local20 - Static31.anInt529 - local226;
					Static435.aClass101_11.DA(Static611.anInt10746, Static257.anInt4919, Static41.anInt914, Static637.anInt10987);
				} else {
					Static257.anInt4919 = Static454.anInt6415 + local20 - local226 - Static31.anInt529;
					Static611.anInt10746 = Static569.anInt9977 + local16 - local224 - Static180.anInt3812;
					Static41.anInt914 = local36;
					Static637.anInt10987 = local38;
					Static435.aClass101_11.DA(Static611.anInt10746, Static257.anInt4919, Static41.anInt914, Static637.anInt10987);
				}
				Static550.method8451(Static480.aClass217_3);
				if (local366 > 0) {
					Static435.aClass101_11.KA(0, local364, Static488.anInt8751, local364 + local366);
					Static435.aClass101_11.ya();
					Static435.aClass101_11.GA(Static538.anInt9382);
					Static398.method6583(arg11, arg4, arg10, arg2, arg8, arg12, arg13, arg6, arg5, arg3, arg1, arg9, arg7, arg14, arg15, arg0, 1, false);
				}
				if (local317 > 0) {
					Static435.aClass101_11.KA(local315, local370, local317 + local315, local362 + local370);
					Static435.aClass101_11.ya();
					Static435.aClass101_11.GA(Static538.anInt9382);
					Static398.method6583(arg11, arg4, arg10, arg2, arg8, arg12, arg13, arg6, arg5, arg3, arg1, arg9, arg7, arg14, arg15, arg0, 1, false);
				}
				Static435.aClass101_11.la();
				Static339.method5440();
				if (Static255.anInt4904 == 0) {
					Static435.aClass101_11.method8072();
				}
				Static180.anInt3812 += local224;
				Static31.anInt529 += local226;
				Static612.aDouble27 += local232;
				Static5.anInt88 = local109 + Static569.anInt9977 - Static180.anInt3812;
				Static590.anInt10296 = local131 + Static454.anInt6415 - Static31.anInt529;
				if (Static255.anInt4904 == 1) {
					Static130.anInt2508 += local228;
					Static7.anInt133 += local230;
					for (@Pc(790) int local790 = 0; local790 < Static395.anInt7388; local790++) {
						@Pc(802) int local802 = method5709(Static395.anInt7388, local790 + Static7.anInt133) * Static19.anInt353;
						for (local434 = 0; local434 < Static19.anInt353; local434++) {
							@Pc(815) int local815 = method5709(Static19.anInt353, local434 + Static130.anInt2508) + local802;
							@Pc(860) boolean local860 = local292 <= local790 && local790 < local292 + local294 || local790 >= local298 && local790 < local350 + local298 && local296 <= local434 && local296 + local300 > local434;
							Static17.anInterface17Array7[local815].method9555(local434 * Static532.anInt9333, Static341.anInt6402 * local790, Static532.anInt9333, Static341.anInt6402, local860);
						}
					}
				}
			} else {
				Static207.aBoolean327 = true;
			}
		}
		if (Static207.aBoolean327) {
			Static353.anInt6794 = arg4;
			Static612.aDouble27 = 0.0D;
			Static476.anInt8535 = arg2;
			Static470.anInt5389 = arg10;
			Static180.anInt3812 = 0;
			Static590.anInt10296 = Static454.anInt6415;
			Static5.anInt88 = Static569.anInt9977;
			Static31.anInt529 = 0;
			if (Static255.anInt4904 == 0) {
				Static435.aClass101_11.method8108(Static64.anInterface17_1);
			}
			Static435.aClass101_11.la();
			Static435.aClass101_11.ya();
			Static435.aClass101_11.GA(Static538.anInt9382);
			Static568.aClass76_15.method9628(Static353.anInt6794, Static470.anInt5389, Static476.anInt8535, Static283.anInt5221, Static584.anInt4542, Static387.anInt7331);
			Static435.aClass101_11.method8067(Static568.aClass76_15);
			if (Static255.anInt4904 == 1) {
				Static41.anInt914 = local36;
				Static637.anInt10987 = local38;
				Static257.anInt4919 = local20;
				Static611.anInt10746 = local16;
				Static435.aClass101_11.DA(Static611.anInt10746, Static257.anInt4919, Static41.anInt914, Static637.anInt10987);
			} else {
				Static41.anInt914 = local36;
				Static611.anInt10746 = local16 + Static569.anInt9977;
				Static257.anInt4919 = Static454.anInt6415 + local20;
				Static637.anInt10987 = local38;
				Static435.aClass101_11.DA(Static611.anInt10746, Static257.anInt4919, Static41.anInt914, Static637.anInt10987);
			}
			Static583.aDouble25 = 0.0D;
			Static480.aClass217_3.method5978();
			Static550.method8451(Static480.aClass217_3);
			Static398.method6583(arg11, arg4, arg10, arg2, arg8, arg12, arg13, arg6, arg5, arg3, arg1, arg9, arg7, arg14, arg15, arg0, 1, false);
			Static339.method5440();
			Static207.aBoolean327 = false;
			if (Static255.anInt4904 == 0) {
				Static435.aClass101_11.method8072();
			}
			if (Static255.anInt4904 == 1) {
				Static535.method8259();
			}
		}
		if (Static255.anInt4904 == 0) {
			Static64.anInterface17_1.method9556(Static5.anInt88, Static590.anInt10296, Static506.anInt8995, Static588.anInt10265, 0, 0);
		}
		Static468.anInt8414++;
		Static466.method7484(Static612.aDouble27);
		Static483.aDouble20 = Static612.aDouble27;
		if (Static255.anInt4904 == 0 || Static255.anInt4904 == 2) {
			if (Static255.anInt4904 == 2) {
				Static435.aClass101_11.GA(Static538.anInt9382);
				Static435.aClass101_11.ya();
			}
			Static39.anInt10895 = local38;
			Static422.anInt7763 = local36;
			Static670.anInt7889 = Static569.anInt9977 + local16 - Static5.anInt88 - Static180.anInt3812;
			Static569.anInt9968 = Static454.anInt6415 + local20 - Static31.anInt529 - Static590.anInt10296;
			Static435.aClass101_11.DA(Static670.anInt7889, Static569.anInt9968, Static422.anInt7763, Static39.anInt10895);
		} else if (Static255.anInt4904 == 1) {
			Static39.anInt10895 = local38;
			Static670.anInt7889 = local16 - Static180.anInt3812;
			Static569.anInt9968 = local20 - Static31.anInt529;
			Static422.anInt7763 = local36;
			Static435.aClass101_11.DA(Static670.anInt7889, Static569.anInt9968, Static422.anInt7763, Static39.anInt10895);
			Static435.aClass101_11.KA(Static5.anInt88, Static590.anInt10296, Static5.anInt88 + Static506.anInt8995, Static590.anInt10296 - -Static588.anInt10265);
		}
		Static398.method6583(arg11, arg4, arg10, arg2, arg8, arg12, arg13, arg6, arg5, arg3, arg1, arg9, arg7, arg14, arg15, arg0, Static255.anInt4904 == 2 ? 0 : 2, Static255.anInt4904 == 1);
		Static435.aClass101_11.la();
		Static435.aClass101_11.DA(local16, local20, local24, local34);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
	public static void method5714() {
		Static389.anInt7373 = 0;
		@Pc(11) int local11 = Static206.aClass2_Sub8_Sub2_1.method5226();
		@Pc(20) boolean local20 = Static206.aClass2_Sub8_Sub2_1.method5206() == 1;
		@Pc(24) int local24 = Static206.aClass2_Sub8_Sub2_1.method5226();
		@Pc(28) int local28 = Static206.aClass2_Sub8_Sub2_1.method5201();
		Static476.method7603();
		Static255.method4446(local28);
		@Pc(41) int local41 = (Static538.anInt9383 - Static206.aClass2_Sub8_Sub2_1.anInt5725) / 16;
		Static172.anIntArrayArray11 = new int[local41][4];
		@Pc(51) int local51;
		for (@Pc(47) int local47 = 0; local47 < local41; local47++) {
			for (local51 = 0; local51 < 4; local51++) {
				Static172.anIntArrayArray11[local47][local51] = Static206.aClass2_Sub8_Sub2_1.method5172();
			}
		}
		Static191.anIntArray190 = new int[local41];
		Static71.aByteArrayArray4 = new byte[local41][];
		Static617.aByteArrayArray24 = new byte[local41][];
		Static446.anIntArray403 = new int[local41];
		Static37.aByteArrayArray3 = new byte[local41][];
		Static375.anIntArray312 = null;
		Static424.aByteArrayArray16 = new byte[local41][];
		Static448.anIntArray407 = new int[local41];
		Static533.anIntArray479 = new int[local41];
		Static437.anIntArray399 = new int[local41];
		Static101.aByteArrayArray7 = null;
		local41 = 0;
		for (local51 = (local24 - (Static222.anInt4533 >> 4)) / 8; local51 <= ((Static222.anInt4533 >> 4) + local24) / 8; local51++) {
			for (@Pc(129) int local129 = (local11 - (Static668.anInt11370 >> 4)) / 8; local129 <= (local11 + (Static668.anInt11370 >> 4)) / 8; local129++) {
				Static437.anIntArray399[local41] = (local51 << 8) + local129;
				Static191.anIntArray190[local41] = Static52.aClass124_14.method3638("m" + local51 + "_" + local129);
				Static446.anIntArray403[local41] = Static52.aClass124_14.method3638("l" + local51 + "_" + local129);
				Static448.anIntArray407[local41] = Static52.aClass124_14.method3638("um" + local51 + "_" + local129);
				Static533.anIntArray479[local41] = Static52.aClass124_14.method3638("ul" + local51 + "_" + local129);
				local41++;
			}
		}
		Static285.method4770(11, local11, local24, local20);
	}

	@OriginalMember(owner = "client!lh", name = "a", descriptor = "([BZZ)Ljava/lang/Object;")
	public static Object method5715(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static535.aBoolean680) {
			try {
				@Pc(25) Class95 local25 = (Class95) Class.forName("Class95_Sub1").getDeclaredConstructor().newInstance();
				local25.method7800(arg0);
				return local25;
			} catch (@Pc(32) Throwable local32) {
				Static535.aBoolean680 = true;
			}
		}
		return arg0;
	}
}
