import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ei", name = "e", descriptor = "Lclient!kh;")
	public static Class60 aClass60_628 = Static200.method3116("Abbrechen");

	@OriginalMember(owner = "client!ei", name = "f", descriptor = "Z")
	public static volatile boolean aBoolean100 = true;

	@OriginalMember(owner = "client!ei", name = "h", descriptor = "[I")
	public static int[] anIntArray221 = new int[32];

	@OriginalMember(owner = "client!ei", name = "i", descriptor = "Lclient!kh;")
	public static Class60 aClass60_629 = Static200.method3116("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!ei", name = "k", descriptor = "Lclient!kh;")
	public static Class60 aClass60_630 = Static200.method3116("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ei", name = "l", descriptor = "Lclient!kh;")
	public static Class60 aClass60_631 = Static200.method3116("logo");

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!sb;Z)V")
	public static void method1419(@OriginalArg(0) Applet_Sub1 arg0) {
		if (Static43.aBoolean59) {
			Static202.method3130(arg0);
			return;
		}
		if (Static192.anInt4115 == 1 && Static166.anInt3603 >= 715 && Static39.anInt882 >= 453) {
			Static56.aBoolean74 = !Static56.aBoolean74;
			if (Static56.aBoolean74) {
				Static220.method3532();
			} else {
				Static84.method1048(Static69.anInt1711, 255, Static106.aClass7_Sub1_19);
			}
		}
		if (Static134.anInt2902 == 5) {
			return;
		}
		Static27.anInt643++;
		if (Static134.anInt2902 != 10) {
			return;
		}
		if (Static128.anInt2810 != 2) {
			if (Static192.anInt4115 == 1 && Static166.anInt3603 >= 5 && Static166.anInt3603 <= 105 && Static39.anInt882 >= 463 && Static39.anInt882 <= 498) {
				Static112.method1929();
				return;
			}
			if (Static59.aClass20_1 != null) {
				Static112.method1929();
			}
		}
		@Pc(105) int local105 = Static192.anInt4115;
		@Pc(107) int local107 = Static39.anInt882;
		@Pc(109) int local109 = Static166.anInt3603;
		if (Static94.anInt2196 == 0) {
			@Pc(120) boolean local120 = false;
			if (local105 == 1 && local109 >= 227 && local109 <= 377 && local107 >= 271 && local107 <= 311) {
				Static29.anInt699 = 0;
				Static94.anInt2196 = 3;
			}
			if (Static27.anInt645 != 0) {
				while (Static107.method1854()) {
					if (Static199.anInt4262 == 84) {
						local120 = true;
						break;
					}
				}
			}
			if (local120 || local105 == 1 && local109 >= 387 && local109 <= 537 && local107 >= 271 && local107 <= 311) {
				Static29.anInt699 = 0;
				Static12.aClass60_104 = Static216.aClass60_1588;
				Static12.aClass60_96 = Static153.aClass60_1183;
				Static94.anInt2196 = 2;
				Static12.aClass60_98 = Static216.aClass60_1615;
			}
		} else if (Static94.anInt2196 == 2) {
			@Pc(282) short local282 = 231;
			@Pc(285) int local285 = local282 + 30;
			if (local105 == 1 && local107 >= 246 && local107 < 261) {
				Static29.anInt699 = 0;
			}
			local285 += 15;
			if (local105 == 1 && local107 >= 261 && local107 < 276) {
				Static29.anInt699 = 1;
			}
			local285 += 15;
			if (local105 == 1 && local109 >= 227 && local109 <= 377 && local107 >= 301 && local107 <= 341) {
				Static12.aClass60_95 = Static12.aClass60_95.method1792().method1812();
				if (Static12.aClass60_95.method1835() == 0) {
					Static141.method2417(Static216.aClass60_1598, Static36.aClass60_1322, Static216.aClass60_1596);
				} else if (Static12.aClass60_94.method1835() == 0) {
					Static141.method2417(Static216.aClass60_1602, Static124.aClass60_933, Static216.aClass60_1592);
				} else {
					Static141.method2417(Static216.aClass60_1599, Static172.aClass60_1276, Static216.aClass60_1585);
					Static85.method1486(20);
				}
			} else {
				if (local105 == 1 && local109 >= 387 && local109 <= 537 && local107 >= 301 && local107 <= 341) {
					Static94.anInt2196 = 0;
					Static12.aClass60_94 = Static12.aClass60_99;
					Static12.aClass60_95 = Static12.aClass60_99;
				}
				while (true) {
					while (Static107.method1854()) {
						@Pc(453) boolean local453 = false;
						for (@Pc(455) int local455 = 0; local455 < Static101.aClass60_1243.method1835(); local455++) {
							if (Static128.anInt2812 == Static101.aClass60_1243.method1793(local455)) {
								local453 = true;
								break;
							}
						}
						if (Static29.anInt699 == 0) {
							if (Static199.anInt4262 == 85 && Static12.aClass60_95.method1835() > 0) {
								Static12.aClass60_95 = Static12.aClass60_95.method1797(0, Static12.aClass60_95.method1835() - 1);
							}
							if (Static199.anInt4262 == 84 || Static199.anInt4262 == 80) {
								Static29.anInt699 = 1;
							}
							if (local453 && Static12.aClass60_95.method1835() < 12) {
								Static12.aClass60_95 = Static12.aClass60_95.method1799(Static128.anInt2812);
							}
						} else if (Static29.anInt699 == 1) {
							if (Static199.anInt4262 == 85 && Static12.aClass60_94.method1835() > 0) {
								Static12.aClass60_94 = Static12.aClass60_94.method1797(0, Static12.aClass60_94.method1835() - 1);
							}
							if (Static199.anInt4262 == 84 || Static199.anInt4262 == 80) {
								Static29.anInt699 = 0;
							}
							if (Static27.anInt645 != 0 && Static199.anInt4262 == 84) {
								Static12.aClass60_95 = Static12.aClass60_95.method1792().method1812();
								if (Static12.aClass60_95.method1835() == 0) {
									Static141.method2417(Static216.aClass60_1598, Static36.aClass60_1322, Static216.aClass60_1596);
									return;
								}
								if (Static12.aClass60_94.method1835() == 0) {
									Static141.method2417(Static216.aClass60_1602, Static124.aClass60_933, Static216.aClass60_1592);
									return;
								}
								Static141.method2417(Static216.aClass60_1599, Static172.aClass60_1276, Static216.aClass60_1585);
								Static85.method1486(20);
								return;
							}
							if (local453 && Static12.aClass60_94.method1835() < 20) {
								Static12.aClass60_94 = Static12.aClass60_94.method1799(Static128.anInt2812);
							}
						}
					}
					return;
				}
			}
		} else if (Static94.anInt2196 == 3 && local105 == 1 && local109 >= 307 && local109 <= 457 && local107 >= 301 && local107 <= 341) {
			Static94.anInt2196 = 0;
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBII)V")
	public static void method1421(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static19.anInt471++;
		Static72.method1315(true);
		Static77.method1386(true);
		Static72.method1315(false);
		Static77.method1386(false);
		Static89.method1536();
		Static97.method1673();
		@Pc(29) int local29;
		@Pc(36) int local36;
		if (!Static144.aBoolean179) {
			local29 = Static124.anInt2765;
			local36 = Static31.anInt799 + Static73.anInt1793 & 0x7FF;
			if (local29 < Static52.anInt1421 / 256) {
				local29 = Static52.anInt1421 / 256;
			}
			if (Static216.aBooleanArray25[4] && Static5.anIntArray13[4] + 128 > local29) {
				local29 = Static5.anIntArray13[4] + 128;
			}
			Static48.method947(Static218.anInt4727, Static44.anInt1007, Static165.method2268(Static84.aClass9_Sub4_Sub1_2.anInt3903, Static180.anInt3841, Static84.aClass9_Sub4_Sub1_2.anInt3925) - 50, local29 * 3 + 600, local29, arg1, local36);
		}
		if (Static144.aBoolean179) {
			local29 = Static165.method2271();
		} else {
			local29 = Static21.method362();
		}
		local36 = Static17.anInt438;
		@Pc(101) int local101 = Static28.anInt2840;
		@Pc(103) int local103 = Static165.anInt2958;
		@Pc(105) int local105 = Static134.anInt2897;
		@Pc(107) int local107 = Static79.anInt1908;
		for (@Pc(109) int local109 = 0; local109 < 5; local109++) {
			if (Static216.aBooleanArray25[local109]) {
				@Pc(151) int local151 = (int) ((double) -Static201.anIntArray559[local109] + (double) (Static201.anIntArray559[local109] * 2 + 1) * Math.random() + Math.sin((double) Static68.anIntArray198[local109] * ((double) Static206.anIntArray573[local109] / 100.0D)) * (double) Static5.anIntArray13[local109]);
				if (local109 == 2) {
					Static165.anInt2958 += local151;
				}
				if (local109 == 1) {
					Static28.anInt2840 += local151;
				}
				if (local109 == 4) {
					Static134.anInt2897 += local151;
					if (Static134.anInt2897 < 128) {
						Static134.anInt2897 = 128;
					}
					if (Static134.anInt2897 > 383) {
						Static134.anInt2897 = 383;
					}
				}
				if (local109 == 0) {
					Static17.anInt438 += local151;
				}
				if (local109 == 3) {
					Static79.anInt1908 = Static79.anInt1908 + local151 & 0x7FF;
				}
			}
		}
		Static76.method1363(arg3, arg0, arg3 + arg2, arg1 + arg0);
		Static81.method1437();
		@Pc(233) int local233 = Static122.anInt2732;
		@Pc(235) int local235 = Static176.anInt768;
		if (local233 >= arg3 && local233 < arg3 + arg2 && local235 >= arg0 && arg1 + arg0 > local235) {
			Static172.aBoolean205 = true;
			Static140.anInt3125 = 0;
			@Pc(275) int local275 = Static135.anInt2931;
			@Pc(277) int local277 = Static177.anInt3788;
			@Pc(279) int local279 = Static150.anInt3353;
			Static114.anInt2617 = (local275 - local279) * (Static122.anInt2732 - arg3) / arg2 + local279;
			@Pc(295) int local295 = Static182.anInt3877;
			Static77.anInt1868 = local277 + (local295 - local277) * (Static176.anInt768 - arg0) / arg1;
		} else {
			Static172.aBoolean205 = false;
			Static140.anInt3125 = 0;
		}
		Static84.method1044();
		Static76.method1367(arg3, arg0, arg2, arg1, 0);
		Static116.method1978(Static17.anInt438, Static28.anInt2840, Static165.anInt2958, Static134.anInt2897, Static79.anInt1908, local29, null, null, null, null, null, null, Static84.aClass9_Sub4_Sub1_2.anInt3925 >> 7, Static84.aClass9_Sub4_Sub1_2.anInt3903 >> 7);
		Static84.method1044();
		Static105.method1783();
		Static36.method2899(arg0, arg1, arg3, arg2);
		Static28.method2160(arg0, arg2, arg1, arg3);
		((Class40) Static81.anInterface1_1).method1251(Static26.anInt594);
		Static157.method2653(arg1, arg2, arg3, arg0);
		Static79.anInt1908 = local107;
		Static28.anInt2840 = local101;
		Static134.anInt2897 = local105;
		Static17.anInt438 = local36;
		Static165.anInt2958 = local103;
		if (Static200.aBoolean237 && Static194.method3016() == 0) {
			Static200.aBoolean237 = false;
		}
		if (Static200.aBoolean237) {
			Static76.method1367(arg3, arg0, arg2, arg1, 0);
			Static199.method3114(Static56.aClass60_449, false);
		}
		if (!Static200.aBoolean237 && !Static162.aBoolean261 && local233 >= arg3 && arg2 + arg3 > local233 && arg0 <= local235 && local235 < arg0 + arg1) {
			Static106.method1817(arg0, arg3, local235, arg2, arg1, local233);
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lclient!ab;IIIZIIZIZII)V")
	public static void method1422(@OriginalArg(0) Class3 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int arg9) {
		if (arg3 && (Static209.aByteArrayArrayArray13[0][arg5][arg9] & 0x2) == 0) {
			if ((Static209.aByteArrayArrayArray13[arg4][arg5][arg9] & 0x10) != 0) {
				return;
			}
			if (Static38.method662(arg9, arg4, arg5) != Static204.anInt4327) {
				return;
			}
		}
		if (Static30.anInt722 > arg4) {
			Static30.anInt722 = arg4;
		}
		@Pc(54) Class1_Sub1_Sub23 local54 = Static44.method760(arg6);
		@Pc(67) int local67;
		@Pc(70) int local70;
		if (arg8 == 1 || arg8 == 3) {
			local67 = local54.anInt4018;
			local70 = local54.anInt4024;
		} else {
			local67 = local54.anInt4024;
			local70 = local54.anInt4018;
		}
		@Pc(99) int local99;
		@Pc(93) int local93;
		if (local70 + arg9 <= 104) {
			local93 = (local70 + 1 >> 1) + arg9;
			local99 = (local70 >> 1) + arg9;
		} else {
			local93 = arg9 + 1;
			local99 = arg9;
		}
		@Pc(119) int local119;
		@Pc(127) int local127;
		if (local67 + arg5 <= 104) {
			local119 = arg5 + (local67 >> 1);
			local127 = (local67 + 1 >> 1) + arg5;
		} else {
			local119 = arg5;
			local127 = arg5 + 1;
		}
		@Pc(139) int[][] local139 = Static138.anIntArrayArrayArray17[arg1];
		@Pc(165) int local165 = local139[local127][local93] + local139[local119][local93] + local139[local119][local99] + local139[local127][local99] >> 2;
		@Pc(173) int local173 = (local70 << 6) + (arg9 << 7);
		@Pc(181) int local181 = (arg5 << 7) + (local67 << 6);
		@Pc(198) long local198 = (long) (arg9 << 7 | arg5 | arg2 << 14 | arg8 << 20 | 0x40000000);
		if (local54.anInt4027 == 0) {
			local198 |= Long.MIN_VALUE;
		}
		@Pc(209) int[][] local209 = null;
		if (arg1 < 3) {
			local209 = Static138.anIntArrayArrayArray17[arg1 + 1];
		}
		if (local54.anInt3999 == 1) {
			local198 |= 0x400000L;
		}
		if (arg7 && local54.method2941()) {
			Static121.method2036(arg5, local54, arg4, arg9, arg8);
		}
		local198 |= (long) arg6 << 32;
		@Pc(299) Class9 local299;
		@Pc(313) Class1_Sub1_Sub1 local313;
		if (arg2 == 22) {
			if (!arg3 || local54.anInt4027 != 0 || local54.anInt4023 == 1 || local54.aBoolean216) {
				if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
					local313 = local54.method2943(local165, local139, local209, local181, 22, local173, arg7, arg8);
					local299 = local313.aClass9_1;
				} else {
					local299 = new Class9_Sub3(arg6, 22, arg8, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
				}
				Static121.method2031(arg4, arg5, arg9, local165, local299, local198, local54.aBoolean215);
				if (local54.anInt4023 == 1 && arg0 != null) {
					arg0.method42(arg9, arg5);
				}
			}
		} else if (arg2 == 10 || arg2 == 11) {
			if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
				local313 = local54.method2943(local165, local139, local209, local181, 10, local173, arg7, arg8);
				local299 = local313.aClass9_1;
			} else {
				local299 = new Class9_Sub3(arg6, 10, arg8, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
			}
			if (local299 != null) {
				@Pc(402) boolean local402 = Static214.method3356(arg4, arg5, arg9, local165, local67, local70, local299, arg2 == 11 ? 256 : 0, local198);
				if (local54.aBoolean219 && local402 && arg7) {
					@Pc(411) int local411 = 15;
					if (local299 instanceof Class9_Sub2) {
						local411 = ((Class9_Sub2) local299).method1707() / 4;
						if (local411 > 30) {
							local411 = 30;
						}
					}
					for (@Pc(429) int local429 = 0; local429 <= local67; local429++) {
						for (@Pc(433) int local433 = 0; local433 <= local70; local433++) {
							if (Static201.aByteArrayArrayArray12[arg4][local429 + arg5][arg9 + local433] < local411) {
								Static201.aByteArrayArrayArray12[arg4][arg5 + local429][arg9 + local433] = (byte) local411;
							}
						}
					}
				}
			}
			if (local54.anInt4023 != 0 && arg0 != null) {
				arg0.method52(arg5, arg9, local54.aBoolean223, local70, local67);
			}
		} else if (arg2 >= 12) {
			if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
				local313 = local54.method2943(local165, local139, local209, local181, arg2, local173, arg7, arg8);
				local299 = local313.aClass9_1;
			} else {
				local299 = new Class9_Sub3(arg6, arg2, arg8, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
			}
			Static214.method3356(arg4, arg5, arg9, local165, 1, 1, local299, 0, local198);
			if (arg7 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg4 > 0) {
				Static36.anIntArrayArrayArray22[arg4][arg5][arg9] |= 0x924;
			}
			if (local54.anInt4023 != 0 && arg0 != null) {
				arg0.method52(arg5, arg9, local54.aBoolean223, local70, local67);
			}
		} else if (arg2 == 0) {
			if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
				local313 = local54.method2943(local165, local139, local209, local181, 0, local173, arg7, arg8);
				local299 = local313.aClass9_1;
			} else {
				local299 = new Class9_Sub3(arg6, 0, arg8, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
			}
			Static120.method2026(arg4, arg5, arg9, local165, local299, null, Static52.anIntArray165[arg8], 0, local198);
			if (arg7) {
				if (arg8 == 0) {
					if (local54.aBoolean219) {
						Static201.aByteArrayArrayArray12[arg4][arg5][arg9] = 50;
						Static201.aByteArrayArrayArray12[arg4][arg5][arg9 + 1] = 50;
					}
					if (local54.aBoolean220) {
						Static36.anIntArrayArrayArray22[arg4][arg5][arg9] |= 0x249;
					}
				} else if (arg8 == 1) {
					if (local54.aBoolean219) {
						Static201.aByteArrayArrayArray12[arg4][arg5][arg9 + 1] = 50;
						Static201.aByteArrayArrayArray12[arg4][arg5 + 1][arg9 + 1] = 50;
					}
					if (local54.aBoolean220) {
						Static36.anIntArrayArrayArray22[arg4][arg5][arg9 + 1] |= 0x492;
					}
				} else if (arg8 == 2) {
					if (local54.aBoolean219) {
						Static201.aByteArrayArrayArray12[arg4][arg5 + 1][arg9] = 50;
						Static201.aByteArrayArrayArray12[arg4][arg5 + 1][arg9 + 1] = 50;
					}
					if (local54.aBoolean220) {
						Static36.anIntArrayArrayArray22[arg4][arg5 + 1][arg9] |= 0x249;
					}
				} else if (arg8 == 3) {
					if (local54.aBoolean219) {
						Static201.aByteArrayArrayArray12[arg4][arg5][arg9] = 50;
						Static201.aByteArrayArrayArray12[arg4][arg5 + 1][arg9] = 50;
					}
					if (local54.aBoolean220) {
						Static36.anIntArrayArrayArray22[arg4][arg5][arg9] |= 0x492;
					}
				}
			}
			if (local54.anInt4023 != 0 && arg0 != null) {
				arg0.method49(arg9, local54.aBoolean223, arg8, arg2, arg5);
			}
			if (local54.anInt4016 != 16) {
				Static197.method3073(arg4, arg5, arg9, local54.anInt4016);
			}
		} else if (arg2 == 1) {
			if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
				local313 = local54.method2943(local165, local139, local209, local181, 1, local173, arg7, arg8);
				local299 = local313.aClass9_1;
			} else {
				local299 = new Class9_Sub3(arg6, 1, arg8, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
			}
			Static120.method2026(arg4, arg5, arg9, local165, local299, null, Static35.anIntArray124[arg8], 0, local198);
			if (local54.aBoolean219 && arg7) {
				if (arg8 == 0) {
					Static201.aByteArrayArrayArray12[arg4][arg5][arg9 + 1] = 50;
				} else if (arg8 == 1) {
					Static201.aByteArrayArrayArray12[arg4][arg5 + 1][arg9 + 1] = 50;
				} else if (arg8 == 2) {
					Static201.aByteArrayArrayArray12[arg4][arg5 + 1][arg9] = 50;
				} else if (arg8 == 3) {
					Static201.aByteArrayArrayArray12[arg4][arg5][arg9] = 50;
				}
			}
			if (local54.anInt4023 != 0 && arg0 != null) {
				arg0.method49(arg9, local54.aBoolean223, arg8, arg2, arg5);
			}
		} else {
			@Pc(1033) int local1033;
			if (arg2 == 2) {
				local1033 = arg8 + 1 & 0x3;
				@Pc(1072) Class9 local1072;
				@Pc(1057) Class9 local1057;
				if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
					@Pc(1088) Class1_Sub1_Sub1 local1088 = local54.method2943(local165, local139, local209, local181, 2, local173, arg7, arg8 + 4);
					local1057 = local1088.aClass9_1;
					@Pc(1103) Class1_Sub1_Sub1 local1103 = local54.method2943(local165, local139, local209, local181, 2, local173, arg7, local1033);
					local1072 = local1103.aClass9_1;
				} else {
					local1057 = new Class9_Sub3(arg6, 2, arg8 + 4, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
					local1072 = new Class9_Sub3(arg6, 2, local1033, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
				}
				Static120.method2026(arg4, arg5, arg9, local165, local1057, local1072, Static52.anIntArray165[arg8], Static52.anIntArray165[local1033], local198);
				if (local54.aBoolean220 && arg7) {
					if (arg8 == 0) {
						Static36.anIntArrayArrayArray22[arg4][arg5][arg9] |= 0x249;
						Static36.anIntArrayArrayArray22[arg4][arg5][arg9 + 1] |= 0x492;
					} else if (arg8 == 1) {
						Static36.anIntArrayArrayArray22[arg4][arg5][arg9 + 1] |= 0x492;
						Static36.anIntArrayArrayArray22[arg4][arg5 + 1][arg9] |= 0x249;
					} else if (arg8 == 2) {
						Static36.anIntArrayArrayArray22[arg4][arg5 + 1][arg9] |= 0x249;
						Static36.anIntArrayArrayArray22[arg4][arg5][arg9] |= 0x492;
					} else if (arg8 == 3) {
						Static36.anIntArrayArrayArray22[arg4][arg5][arg9] |= 0x492;
						Static36.anIntArrayArrayArray22[arg4][arg5][arg9] |= 0x249;
					}
				}
				if (local54.anInt4023 != 0 && arg0 != null) {
					arg0.method49(arg9, local54.aBoolean223, arg8, arg2, arg5);
				}
				if (local54.anInt4016 != 16) {
					Static197.method3073(arg4, arg5, arg9, local54.anInt4016);
				}
			} else if (arg2 == 3) {
				if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
					local313 = local54.method2943(local165, local139, local209, local181, 3, local173, arg7, arg8);
					local299 = local313.aClass9_1;
				} else {
					local299 = new Class9_Sub3(arg6, 3, arg8, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
				}
				Static120.method2026(arg4, arg5, arg9, local165, local299, null, Static35.anIntArray124[arg8], 0, local198);
				if (local54.aBoolean219 && arg7) {
					if (arg8 == 0) {
						Static201.aByteArrayArrayArray12[arg4][arg5][arg9 + 1] = 50;
					} else if (arg8 == 1) {
						Static201.aByteArrayArrayArray12[arg4][arg5 + 1][arg9 + 1] = 50;
					} else if (arg8 == 2) {
						Static201.aByteArrayArrayArray12[arg4][arg5 + 1][arg9] = 50;
					} else if (arg8 == 3) {
						Static201.aByteArrayArrayArray12[arg4][arg5][arg9] = 50;
					}
				}
				if (local54.anInt4023 != 0 && arg0 != null) {
					arg0.method49(arg9, local54.aBoolean223, arg8, arg2, arg5);
				}
			} else if (arg2 == 9) {
				if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
					local313 = local54.method2943(local165, local139, local209, local181, arg2, local173, arg7, arg8);
					local299 = local313.aClass9_1;
				} else {
					local299 = new Class9_Sub3(arg6, arg2, arg8, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
				}
				Static214.method3356(arg4, arg5, arg9, local165, 1, 1, local299, 0, local198);
				if (local54.anInt4023 != 0 && arg0 != null) {
					arg0.method52(arg5, arg9, local54.aBoolean223, local70, local67);
				}
				if (local54.anInt4016 != 16) {
					Static197.method3073(arg4, arg5, arg9, local54.anInt4016);
				}
			} else if (arg2 == 4) {
				if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
					local313 = local54.method2943(local165, local139, local209, local181, 4, local173, arg7, arg8);
					local299 = local313.aClass9_1;
				} else {
					local299 = new Class9_Sub3(arg6, 4, arg8, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
				}
				Static32.method596(arg4, arg5, arg9, local165, local299, null, Static52.anIntArray165[arg8], 0, 0, 0, local198);
			} else {
				@Pc(1606) long local1606;
				@Pc(1643) Class9 local1643;
				@Pc(1640) Class1_Sub1_Sub1 local1640;
				if (arg2 == 5) {
					local1033 = 16;
					local1606 = Static84.method1047(arg4, arg5, arg9);
					if (local1606 != 0L) {
						local1033 = Static44.method760((int) (local1606 >>> 32) & Integer.MAX_VALUE).anInt4016;
					}
					if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
						local1640 = local54.method2943(local165, local139, local209, local181, 4, local173, arg7, arg8);
						local1643 = local1640.aClass9_1;
					} else {
						local1643 = new Class9_Sub3(arg6, 4, arg8, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
					}
					Static32.method596(arg4, arg5, arg9, local165, local1643, null, Static52.anIntArray165[arg8], 0, Static133.anIntArray374[arg8] * local1033, local1033 * Static195.anIntArray540[arg8], local198);
				} else if (arg2 == 6) {
					local1606 = Static84.method1047(arg4, arg5, arg9);
					local1033 = 8;
					if (local1606 != 0L) {
						local1033 = Static44.method760((int) (local1606 >>> 32) & Integer.MAX_VALUE).anInt4016 / 2;
					}
					if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
						local1640 = local54.method2943(local165, local139, local209, local181, 4, local173, arg7, arg8 + 4);
						local1643 = local1640.aClass9_1;
					} else {
						local1643 = new Class9_Sub3(arg6, 4, arg8 + 4, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
					}
					Static32.method596(arg4, arg5, arg9, local165, local1643, null, 256, arg8, Static133.anIntArray373[arg8] * local1033, Static149.anIntArray431[arg8] * local1033, local198);
				} else if (arg2 == 7) {
					@Pc(1788) int local1788 = arg8 + 2 & 0x3;
					if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
						@Pc(1810) Class1_Sub1_Sub1 local1810 = local54.method2943(local165, local139, local209, local181, 4, local173, arg7, local1788 + 4);
						local299 = local1810.aClass9_1;
					} else {
						local299 = new Class9_Sub3(arg6, 4, local1788 + 4, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
					}
					Static32.method596(arg4, arg5, arg9, local165, local299, null, 256, local1788, 0, 0, local198);
				} else if (arg2 == 8) {
					local1033 = 8;
					local1606 = Static84.method1047(arg4, arg5, arg9);
					if (local1606 != 0L) {
						local1033 = Static44.method760(Integer.MAX_VALUE & (int) (local1606 >>> 32)).anInt4016 / 2;
					}
					@Pc(1879) int local1879 = arg8 + 2 & 0x3;
					@Pc(1921) Class9 local1921;
					if (local54.anInt4003 == -1 && local54.anIntArray526 == null) {
						@Pc(1901) Class1_Sub1_Sub1 local1901 = local54.method2943(local165, local139, local209, local181, 4, local173, arg7, arg8 + 4);
						local1643 = local1901.aClass9_1;
						@Pc(1918) Class1_Sub1_Sub1 local1918 = local54.method2943(local165, local139, local209, local181, 4, local173, arg7, local1879 + 4);
						local1921 = local1918.aClass9_1;
					} else {
						local1643 = new Class9_Sub3(arg6, 4, arg8 + 4, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
						local1921 = new Class9_Sub3(arg6, 4, local1879 + 4, arg1, arg5, arg9, local54.anInt4003, local54.aBoolean222, null);
					}
					Static32.method596(arg4, arg5, arg9, local165, local1643, local1921, 256, arg8, Static133.anIntArray373[arg8] * local1033, Static149.anIntArray431[arg8] * local1033, local198);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ei", name = "a", descriptor = "(BI)Lclient!kh;")
	public static Class60 method1423(@OriginalArg(1) int arg0) {
		return Static34.method611(new Class60[] { Static40.method681(arg0 >> 24 & 0xFF), Static133.aClass60_994, Static40.method681(arg0 >> 16 & 0xFF), Static133.aClass60_994, Static40.method681(arg0 >> 8 & 0xFF), Static133.aClass60_994, Static40.method681(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V")
	public static void method1424() {
		for (@Pc(10) Class1_Sub17 local10 = (Class1_Sub17) Static16.aClass19_2.method609(); local10 != null; local10 = (Class1_Sub17) Static16.aClass19_2.method615()) {
			if (local10.aClass1_Sub7_Sub4_2 != null) {
				Static166.aClass1_Sub7_Sub2_2.method3374(local10.aClass1_Sub7_Sub4_2);
				local10.aClass1_Sub7_Sub4_2 = null;
			}
			if (local10.aClass1_Sub7_Sub4_3 != null) {
				Static166.aClass1_Sub7_Sub2_2.method3374(local10.aClass1_Sub7_Sub4_3);
				local10.aClass1_Sub7_Sub4_3 = null;
			}
		}
		Static16.aClass19_2.method619();
	}

	@OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
	public static void method1425() {
		Static201.aClass39_24.method1158();
		Static121.aClass27_68.method963();
	}
}
