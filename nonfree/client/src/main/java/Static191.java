import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!mg", name = "G", descriptor = "Lclient!en;")
	public static Class63 aClass63_1;

	@OriginalMember(owner = "client!mg", name = "Q", descriptor = "[[S")
	public static short[][] aShortArrayArray32;

	@OriginalMember(owner = "client!mg", name = "S", descriptor = "Lclient!fh;")
	public static Class6_Sub12_Sub1 aClass6_Sub12_Sub1_3;

	@OriginalMember(owner = "client!mg", name = "M", descriptor = "[B")
	public static final byte[] aByteArray59 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!mg", name = "R", descriptor = "[I")
	public static final int[] anIntArray428 = new int[1024];

	@OriginalMember(owner = "client!mg", name = "e", descriptor = "(B)V")
	public static void method3584() {
		Static105.method2133(false);
		Static67.anInt1246 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static303.aByteArrayArray17.length; local14++) {
			if (Static271.anIntArray542[local14] != -1 && Static303.aByteArrayArray17[local14] == null) {
				Static303.aByteArrayArray17[local14] = Static71.aClass53_36.method1033(0, Static271.anIntArray542[local14]);
				if (Static303.aByteArrayArray17[local14] == null) {
					Static67.anInt1246++;
					local12 = false;
				}
			}
			if (Static237.anIntArray495[local14] != -1 && Static83.aByteArrayArray4[local14] == null) {
				Static83.aByteArrayArray4[local14] = Static71.aClass53_36.method1020(0, Static237.anIntArray495[local14], Static243.anIntArrayArray160[local14]);
				if (Static83.aByteArrayArray4[local14] == null) {
					local12 = false;
					Static67.anInt1246++;
				}
			}
			if (Static101.anIntArray259[local14] != -1 && Static308.aByteArrayArray18[local14] == null) {
				Static308.aByteArrayArray18[local14] = Static71.aClass53_36.method1033(0, Static101.anIntArray259[local14]);
				if (Static308.aByteArrayArray18[local14] == null) {
					Static67.anInt1246++;
					local12 = false;
				}
			}
			if (Static324.anIntArray681[local14] != -1 && Static179.aByteArrayArray11[local14] == null) {
				Static179.aByteArrayArray11[local14] = Static71.aClass53_36.method1033(0, Static324.anIntArray681[local14]);
				if (Static179.aByteArrayArray11[local14] == null) {
					local12 = false;
					Static67.anInt1246++;
				}
			}
			if (Static49.anIntArray108 != null && Static227.aByteArrayArray14[local14] == null && Static49.anIntArray108[local14] != -1) {
				Static227.aByteArrayArray14[local14] = Static71.aClass53_36.method1020(0, Static49.anIntArray108[local14], Static243.anIntArrayArray160[local14]);
				if (Static227.aByteArrayArray14[local14] == null) {
					Static67.anInt1246++;
					local12 = false;
				}
			}
		}
		if (Static37.aClass41_1 == null) {
			if (Static115.aClass6_Sub2_Sub19_3 == null || !Static138.aClass53_114.method1034(Static115.aClass6_Sub2_Sub19_3.aString257 + "_staticelements")) {
				Static37.aClass41_1 = new Class41(0);
			} else if (Static138.aClass53_114.method1007(Static115.aClass6_Sub2_Sub19_3.aString257 + "_staticelements")) {
				Static37.aClass41_1 = Static207.method3712(Static177.aBoolean242, Static115.aClass6_Sub2_Sub19_3.aString257 + "_staticelements", Static138.aClass53_114);
			} else {
				Static67.anInt1246++;
				local12 = false;
			}
		}
		if (!local12) {
			Static22.anInt360 = 1;
			return;
		}
		Static15.anInt290 = 0;
		local12 = true;
		@Pc(264) int local264;
		@Pc(275) int local275;
		for (@Pc(245) int local245 = 0; local245 < Static303.aByteArrayArray17.length; local245++) {
			@Pc(251) byte[] local251 = Static83.aByteArrayArray4[local245];
			if (local251 != null) {
				local264 = (Static303.anIntArray647[local245] >> 8) * 64 - Static44.anInt881;
				local275 = (Static303.anIntArray647[local245] & 0xFF) * 64 - Static300.anInt5672;
				if (Static334.aBoolean408) {
					local275 = 10;
					local264 = 10;
				}
				local12 &= Static106.method2152(local251, local275, local264);
			}
			local251 = Static179.aByteArrayArray11[local245];
			if (local251 != null) {
				local264 = (Static303.anIntArray647[local245] >> 8) * 64 - Static44.anInt881;
				local275 = (Static303.anIntArray647[local245] & 0xFF) * 64 - Static300.anInt5672;
				if (Static334.aBoolean408) {
					local275 = 10;
					local264 = 10;
				}
				local12 &= Static106.method2152(local251, local275, local264);
			}
		}
		if (!local12) {
			Static22.anInt360 = 2;
			return;
		}
		if (Static22.anInt360 != 0) {
			Static113.method2274(true, Static171.aString133 + "<br>(100%)", Static298.aClass30_4);
		}
		Static24.method359();
		Static83.method1391();
		@Pc(360) boolean local360 = false;
		if (Static289.aClass81_7.method2975() && Static20.aBoolean26) {
			for (local264 = 0; local264 < Static303.aByteArrayArray17.length; local264++) {
				if (Static179.aByteArrayArray11[local264] != null || Static308.aByteArrayArray18[local264] != null) {
					local360 = true;
					break;
				}
			}
		}
		if (Static334.aBoolean407) {
			local264 = Static152.anIntArray353[Static256.anInt4752];
		} else {
			local264 = Static166.anIntArray375[Static256.anInt4752];
		}
		if (Static289.aClass81_7.method2949()) {
			local264++;
		}
		Static122.method2432(Static153.anInt2883, Static246.anInt4606, local264, local360, Static289.aClass81_7.method3038() > 0);
		for (local275 = 0; local275 < 4; local275++) {
			Static334.aClass27Array1[local275].method522();
		}
		Static17.method5614();
		Static76.method3066(false);
		Static207.method3711();
		Static24.method359();
		System.gc();
		Static105.method2133(true);
		Static238.method4717(4);
		@Pc(451) int[][] local451 = null;
		if (!Static334.aBoolean408) {
			Static289.method4944(false);
			Static226.method4032(Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0] >> 3, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0] >> 3);
			Static115.method2323();
			Static300.method5150(null, false, 4, Static289.aClass81_7);
			local451 = Static5.anIntArrayArrayArray1[0];
			Static105.method2133(true);
			Static114.method2317(false);
			if (Static227.aByteArrayArray14 != null) {
				Static142.method2689();
			}
		}
		if (Static334.aBoolean408) {
			Static232.method4112(false);
			Static226.method4032(Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray561[0] >> 3, Static253.aClass44_Sub4_Sub4_Sub1_1.anIntArray560[0] >> 3);
			Static115.method2323();
			Static300.method5150(null, false, 4, Static289.aClass81_7);
			local451 = Static5.anIntArrayArrayArray1[0];
			Static105.method2133(true);
			Static208.method5781(false);
		}
		Static83.method1391();
		Static105.method2133(true);
		Static126.method2489(4, Static289.aClass81_7, null, false, Static334.aClass27Array1);
		Static304.method5213(4, Static289.aClass81_7);
		Static105.method2133(true);
		@Pc(550) int local550 = Static320.anInt5932;
		if (local550 > Static343.anInt6225) {
			local550 = Static343.anInt6225;
		}
		if (local550 < Static343.anInt6225 - 1) {
			local550 = Static343.anInt6225 - 1;
		}
		if (Static16.method287()) {
			Static337.method5578(0);
		} else {
			Static337.method5578(local550);
		}
		Static18.method291();
		if (local360) {
			Static44.method762(true);
			Static238.method4717(1);
			if (!Static334.aBoolean408) {
				Static289.method4944(true);
				Static300.method5150(local451, true, 1, Static289.aClass81_7);
				Static105.method2133(true);
				Static114.method2317(true);
				Static304.method5213(1, Static289.aClass81_7);
			}
			if (Static334.aBoolean408) {
				Static232.method4112(true);
				Static300.method5150(local451, true, 1, Static289.aClass81_7);
				Static105.method2133(true);
				Static208.method5781(true);
			}
			Static83.method1391();
			Static105.method2133(true);
			Static126.method2489(1, Static289.aClass81_7, Static99.aClass106Array4[0], true, Static334.aClass27Array1);
			Static304.method5213(1, Static289.aClass81_7);
			Static105.method2133(true);
			Static18.method291();
			Static44.method762(false);
		}
		@Pc(655) int local655;
		@Pc(659) int local659;
		for (@Pc(651) int local651 = 0; local651 < 3; local651++) {
			for (local655 = 0; local655 < Static153.anInt2883; local655++) {
				for (local659 = 0; local659 < Static246.anInt4606; local659++) {
					Static226.method4028(local655, local659, local651);
				}
			}
		}
		Static273.method5573();
		Static24.method359();
		Static230.method4089();
		Static83.method1391();
		Static210.aBoolean290 = false;
		Static20.method297();
		if (Static95.aFrame2 != null && Static216.aClass11_5 != null && Static129.anInt2374 == 25) {
			Static131.aClass6_Sub10_Sub1_2.method2886(77);
			Static131.aClass6_Sub10_Sub1_2.method3976(1057001181);
		}
		if (!Static334.aBoolean408) {
			local655 = (Static296.anInt5969 - (Static153.anInt2883 >> 4)) / 8;
			local659 = ((Static153.anInt2883 >> 4) + Static296.anInt5969) / 8;
			@Pc(740) int local740 = (Static154.anInt2914 - (Static246.anInt4606 >> 4)) / 8;
			@Pc(748) int local748 = ((Static246.anInt4606 >> 4) + Static154.anInt2914) / 8;
			for (@Pc(752) int local752 = local655 - 1; local752 <= local659 + 1; local752++) {
				for (@Pc(758) int local758 = local740 - 1; local758 <= local748 + 1; local758++) {
					if (local752 < local655 || local659 < local752 || local758 < local740 || local758 > local748) {
						Static71.aClass53_36.method1009("m" + local752 + "_" + local758);
						Static71.aClass53_36.method1009("l" + local752 + "_" + local758);
					}
				}
			}
		}
		if (Static129.anInt2374 == 28) {
			Static290.method4952(10);
		} else {
			Static290.method4952(30);
			if (Static216.aClass11_5 != null) {
				Static131.aClass6_Sub10_Sub1_2.method2886(186);
			}
		}
		Static349.method5744();
		Static24.method359();
		Static303.method5210();
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLclient!is;)V")
	public static void method3585(@OriginalArg(1) Class20_Sub5 arg0) {
		arg0.aClass44_Sub4_Sub4_1 = null;
		if (Static86.anInt1605 < 20) {
			Static213.aClass109_5.method2935(arg0);
			Static86.anInt1605++;
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILclient!mb;B)I")
	public static int method3587(@OriginalArg(0) int arg0, @OriginalArg(1) Class132 arg1) {
		if (arg1.anIntArrayArray126 == null || arg0 >= arg1.anIntArrayArray126.length) {
			return -2;
		}
		try {
			@Pc(20) int[] local20 = arg1.anIntArrayArray126[arg0];
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = 0;
			@Pc(34) byte local34 = 0;
			while (true) {
				@Pc(39) int local39 = local20[local32++];
				@Pc(41) int local41 = 0;
				@Pc(43) byte local43 = 0;
				if (local39 == 0) {
					return local30;
				}
				if (local39 == 1) {
					local41 = Static260.anIntArray526[local20[local32++]];
				}
				if (local39 == 2) {
					local41 = Static292.anIntArray618[local20[local32++]];
				}
				if (local39 == 3) {
					local41 = Static135.anIntArray649[local20[local32++]];
				}
				@Pc(91) int local91;
				@Pc(102) Class132 local102;
				@Pc(107) int local107;
				@Pc(120) int local120;
				if (local39 == 4) {
					local91 = local20[local32++] << 16;
					@Pc(98) int local98 = local91 + local20[local32++];
					local102 = Static249.method4316(local98);
					local107 = local20[local32++];
					if (local107 != -1 && (!Static211.method3762(local107).aBoolean294 || Static177.aBoolean242)) {
						for (local120 = 0; local120 < local102.anIntArray414.length; local120++) {
							if (local107 + 1 == local102.anIntArray414[local120]) {
								local41 += local102.anIntArray411[local120];
							}
						}
					}
				}
				if (local39 == 5) {
					local41 = Static41.anIntArray721[local20[local32++]];
				}
				if (local39 == 6) {
					local41 = Class44_Sub5_Sub2.anIntArray583[Static292.anIntArray618[local20[local32++]] - 1];
				}
				if (local39 == 7) {
					local41 = Static41.anIntArray721[local20[local32++]] * 100 / 46875;
				}
				if (local39 == 8) {
					local41 = Static253.aClass44_Sub4_Sub4_Sub1_1.anInt4907;
				}
				if (local39 == 9) {
					for (local91 = 0; local91 < 25; local91++) {
						if (Static142.aBooleanArray22[local91]) {
							local41 += Static292.anIntArray618[local91];
						}
					}
				}
				if (local39 == 10) {
					local91 = local20[local32++] << 16;
					local91 += local20[local32++];
					local102 = Static249.method4316(local91);
					local107 = local20[local32++];
					if (local107 != -1 && (!Static211.method3762(local107).aBoolean294 || Static177.aBoolean242)) {
						for (local120 = 0; local120 < local102.anIntArray414.length; local120++) {
							if (local102.anIntArray414[local120] == local107 + 1) {
								local41 = 999999999;
								break;
							}
						}
					}
				}
				if (local39 == 11) {
					local41 = Static317.anInt5870;
				}
				if (local39 == 12) {
					local41 = Static319.anInt5901;
				}
				if (local39 == 13) {
					local91 = Static41.anIntArray721[local20[local32++]];
					@Pc(315) int local315 = local20[local32++];
					local41 = (0x1 << local315 & local91) == 0 ? 0 : 1;
				}
				if (local39 == 14) {
					local91 = local20[local32++];
					local41 = Static41.method5822(local91);
				}
				if (local39 == 15) {
					local43 = 1;
				}
				if (local39 == 16) {
					local43 = 2;
				}
				if (local39 == 18) {
					local41 = (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6340 >> 7) + Static44.anInt881;
				}
				if (local39 == 17) {
					local43 = 3;
				}
				if (local39 == 19) {
					local41 = Static300.anInt5672 + (Static253.aClass44_Sub4_Sub4_Sub1_1.anInt6339 >> 7);
				}
				if (local39 == 20) {
					local41 = local20[local32++];
				}
				if (local43 == 0) {
					if (local34 == 0) {
						local30 += local41;
					}
					if (local34 == 1) {
						local30 -= local41;
					}
					if (local34 == 2 && local41 != 0) {
						local30 /= local41;
					}
					if (local34 == 3) {
						local30 *= local41;
					}
					local34 = 0;
				} else {
					local34 = local43;
				}
			}
		} catch (@Pc(433) Exception local433) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mg", name = "f", descriptor = "(B)V")
	public static void method3588() {
		for (@Pc(11) int local11 = 0; local11 < 5; local11++) {
			Static345.aBooleanArray28[local11] = false;
		}
		Static275.anInt5181 = -1;
		Static334.anInt6112 = 1;
		Static12.anInt223 = -1;
		Static233.anInt4352 = 0;
		Static350.anInt6299 = 0;
	}
}
