import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "[J")
	public static final long[] aLongArray7 = new long[500];

	@OriginalMember(owner = "client!qb", name = "I", descriptor = "[[I")
	public static final int[][] anIntArrayArray24 = new int[104][104];

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "Lclient!ob;")
	public static final Class60 aClass60_1024 = Static158.method3034("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "Lclient!ob;")
	private static final Class60 aClass60_1026 = Static158.method3034("FULL");

	@OriginalMember(owner = "client!qb", name = "M", descriptor = "Lclient!ob;")
	public static Class60 aClass60_1025 = aClass60_1026;

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "I")
	public static int anInt3778 = 0;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIIII)V")
	public static void method2911(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static194.anInt4614 = 0;
		@Pc(151) int local151;
		@Pc(81) int local81;
		@Pc(261) int local261;
		for (@Pc(9) int local9 = -1; local9 < Static174.anInt4255 + Static166.anInt4101; local9++) {
			@Pc(28) Class2_Sub1_Sub1_Sub3 local28;
			if (local9 == -1) {
				local28 = Static103.aClass2_Sub1_Sub1_Sub3_Sub1_1;
			} else if (local9 < Static166.anInt4101) {
				local28 = Static105.aClass2_Sub1_Sub1_Sub3_Sub1Array3[Static169.anIntArray458[local9]];
			} else {
				local28 = Static10.aClass2_Sub1_Sub1_Sub3_Sub2Array1[Static180.anIntArray370[local9 - Static166.anInt4101]];
			}
			if (local28 != null && local28.method2554()) {
				@Pc(58) Class2_Sub1_Sub2 local58;
				if (local28 instanceof Class2_Sub1_Sub1_Sub3_Sub2) {
					local58 = ((Class2_Sub1_Sub1_Sub3_Sub2) local28).aClass2_Sub1_Sub2_1;
					if (local58.anIntArray32 != null) {
						local58 = local58.method273();
					}
					if (local58 == null) {
						continue;
					}
				}
				if (local9 >= Static166.anInt4101) {
					local58 = ((Class2_Sub1_Sub1_Sub3_Sub2) local28).aClass2_Sub1_Sub2_1;
					if (local58.anIntArray32 != null) {
						local58 = local58.method273();
					}
					if (local58.anInt338 >= 0 && Static22.aClass2_Sub1_Sub7_Sub4Array2.length > local58.anInt338) {
						Static46.method1062(local28, local28.method2557() + 15);
						if (Static15.anInt507 > -1) {
							Static22.aClass2_Sub1_Sub7_Sub4Array2[local58.anInt338].method2151(arg1 + Static15.anInt507 - 12, Static108.anInt3083 + arg2 - 30);
						}
					}
					@Pc(259) Class47[] local259 = Static177.aClass47Array1;
					for (local261 = 0; local261 < local259.length; local261++) {
						@Pc(267) Class47 local267 = local259[local261];
						if (local267 != null && local267.anInt2856 == 1 && Static180.anIntArray370[local9 - Static166.anInt4101] == local267.anInt2853 && Static20.anInt580 % 20 < 10) {
							Static46.method1062(local28, local28.method2557() + 15);
							if (Static15.anInt507 > -1) {
								Static63.aClass2_Sub1_Sub7_Sub4Array5[local267.anInt2860].method2151(arg1 + Static15.anInt507 - 12, Static108.anInt3083 + arg2 + -28);
							}
						}
					}
				} else {
					@Pc(79) Class2_Sub1_Sub1_Sub3_Sub1 local79 = (Class2_Sub1_Sub1_Sub3_Sub1) local28;
					local81 = 30;
					if (local79.anInt1284 != -1 || local79.anInt1272 != -1) {
						Static46.method1062(local28, local28.method2557() + 15);
						if (Static15.anInt507 > -1) {
							if (local79.anInt1284 != -1) {
								Static113.aClass2_Sub1_Sub7_Sub4Array9[local79.anInt1284].method2151(arg1 + Static15.anInt507 - 12, Static108.anInt3083 + arg2 + -30);
								local81 += 25;
							}
							if (local79.anInt1272 != -1) {
								Static22.aClass2_Sub1_Sub7_Sub4Array2[local79.anInt1272].method2151(arg1 + Static15.anInt507 - 12, Static108.anInt3083 + arg2 + -local81);
								local81 += 25;
							}
						}
					}
					if (local9 >= 0) {
						@Pc(149) Class47[] local149 = Static177.aClass47Array1;
						for (local151 = 0; local151 < local149.length; local151++) {
							@Pc(157) Class47 local157 = local149[local151];
							if (local157 != null && local157.anInt2856 == 10 && local157.anInt2853 == Static169.anIntArray458[local9]) {
								Static46.method1062(local28, local28.method2557() + 15);
								if (Static15.anInt507 > -1) {
									Static63.aClass2_Sub1_Sub7_Sub4Array5[local157.anInt2860].method2151(Static15.anInt507 + arg1 - 12, arg2 - -Static108.anInt3083 - local81);
								}
							}
						}
					}
				}
				if (local28.aClass60_919 != null && (local9 >= Static166.anInt4101 || Static63.anInt1932 == 0 || Static63.anInt1932 == 3 || Static63.anInt1932 == 1 && Static140.method2837(((Class2_Sub1_Sub1_Sub3_Sub1) local28).aClass60_288))) {
					Static46.method1062(local28, local28.method2557());
					if (Static15.anInt507 > -1 && Static131.anInt248 > Static194.anInt4614) {
						Static131.anIntArray23[Static194.anInt4614] = Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1789(local28.aClass60_919) / 2;
						Static131.anIntArray21[Static194.anInt4614] = Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.anInt2252;
						Static131.anIntArray25[Static194.anInt4614] = Static15.anInt507;
						Static131.anIntArray24[Static194.anInt4614] = Static108.anInt3083;
						Static131.anIntArray26[Static194.anInt4614] = local28.anInt3304;
						Static131.anIntArray22[Static194.anInt4614] = local28.anInt3272;
						Static131.anIntArray20[Static194.anInt4614] = local28.anInt3300;
						Static131.aClass60Array3[Static194.anInt4614] = local28.aClass60_919;
						Static194.anInt4614++;
					}
				}
				if (local28.anInt3294 > Static20.anInt580) {
					Static46.method1062(local28, local28.method2557() + 15);
					if (Static15.anInt507 > -1) {
						Static133.method2120(arg1 + Static15.anInt507 - 15, arg2 + (Static108.anInt3083 - 3), local28.anInt3282, 5, 65280);
						Static133.method2120(arg1 + Static15.anInt507 + local28.anInt3282 - 15, Static108.anInt3083 + arg2 + -3, 30 - local28.anInt3282, 5, 16711680);
					}
				}
				for (local81 = 0; local81 < 4; local81++) {
					if (local28.anIntArray367[local81] > Static20.anInt580) {
						Static46.method1062(local28, local28.method2557() / 2);
						if (Static15.anInt507 > -1) {
							if (local81 == 1) {
								Static108.anInt3083 -= 20;
							}
							if (local81 == 2) {
								Static15.anInt507 -= 15;
								Static108.anInt3083 -= 10;
							}
							if (local81 == 3) {
								Static108.anInt3083 -= 10;
								Static15.anInt507 += 15;
							}
							Static157.aClass2_Sub1_Sub7_Sub4Array10[local28.anIntArray372[local81]].method2151(arg1 + Static15.anInt507 - 12, Static108.anInt3083 + arg2 + -12);
							Static148.aClass2_Sub1_Sub7_Sub3_Sub1_5.method1793(Static72.method1661(local28.anIntArray368[local81]), arg1 + Static15.anInt507 - 1, arg2 + 3 + Static108.anInt3083, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(581) int local581 = 0; local581 < Static194.anInt4614; local581++) {
			local261 = Static131.anIntArray23[local581];
			local151 = Static131.anIntArray21[local581];
			@Pc(595) int local595 = Static131.anIntArray24[local581];
			@Pc(597) boolean local597 = true;
			local81 = Static131.anIntArray25[local581];
			while (local597) {
				local597 = false;
				for (@Pc(607) int local607 = 0; local607 < local581; local607++) {
					if (Static131.anIntArray24[local607] - Static131.anIntArray21[local607] < local595 - -2 && Static131.anIntArray24[local607] + 2 > local595 - local151 && Static131.anIntArray23[local607] + Static131.anIntArray25[local607] > -local261 + local81 && local261 + local81 > Static131.anIntArray25[local607] - Static131.anIntArray23[local607] && Static131.anIntArray24[local607] - Static131.anIntArray21[local607] < local595) {
						local597 = true;
						local595 = Static131.anIntArray24[local607] - Static131.anIntArray21[local607];
					}
				}
			}
			Static15.anInt507 = Static131.anIntArray25[local581];
			Static108.anInt3083 = Static131.anIntArray24[local581] = local595;
			@Pc(714) Class60 local714 = Static131.aClass60Array3[local581];
			if (Static86.anInt2552 == 0) {
				@Pc(731) int local731 = 16776960;
				if (Static131.anIntArray26[local581] < 6) {
					local731 = Static112.anIntArray357[Static131.anIntArray26[local581]];
				}
				if (Static131.anIntArray26[local581] == 6) {
					local731 = Static46.anInt1431 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static131.anIntArray26[local581] == 7) {
					local731 = Static46.anInt1431 % 20 < 10 ? 255 : 65535;
				}
				if (Static131.anIntArray26[local581] == 8) {
					local731 = Static46.anInt1431 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(806) int local806;
				if (Static131.anIntArray26[local581] == 9) {
					local806 = 150 - Static131.anIntArray20[local581];
					if (local806 < 50) {
						local731 = local806 * 1280 + 16711680;
					} else if (local806 < 100) {
						local731 = 16776960 - (local806 - 50) * 327680;
					} else if (local806 < 150) {
						local731 = local806 * 5 + 64780;
					}
				}
				if (Static131.anIntArray26[local581] == 10) {
					local806 = 150 - Static131.anIntArray20[local581];
					if (local806 < 50) {
						local731 = local806 * 5 + 16711680;
					} else if (local806 < 100) {
						local731 = 16384000 + 16711935 - local806 * 327680;
					} else if (local806 < 150) {
						local731 = local806 * 327680 + 255 - (local806 + -100) * 5 - 32768000;
					}
				}
				if (Static131.anIntArray26[local581] == 11) {
					local806 = 150 - Static131.anIntArray20[local581];
					if (local806 < 50) {
						local731 = 16777215 - local806 * 327685;
					} else if (local806 < 100) {
						local731 = local806 * 327685 + 65280 - 16384250;
					} else if (local806 < 150) {
						local731 = 16777215 - (local806 - 100) * 327680;
					}
				}
				if (Static131.anIntArray22[local581] == 0) {
					Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1793(local714, arg1 + Static15.anInt507, arg2 + Static108.anInt3083, local731, 0);
				}
				if (Static131.anIntArray22[local581] == 1) {
					Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1801(local714, Static15.anInt507 + arg1, arg2 + Static108.anInt3083, local731, Static46.anInt1431);
				}
				if (Static131.anIntArray22[local581] == 2) {
					Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1781(local714, Static15.anInt507 + arg1, arg2 + Static108.anInt3083, local731, Static46.anInt1431);
				}
				if (Static131.anIntArray22[local581] == 3) {
					Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1783(local714, Static15.anInt507 + arg1, arg2 + Static108.anInt3083, local731, Static46.anInt1431, 150 - Static131.anIntArray20[local581]);
				}
				if (Static131.anIntArray22[local581] == 4) {
					local806 = (150 - Static131.anIntArray20[local581]) * (Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1789(local714) + 100) / 150;
					Static133.method2127(arg1 + Static15.anInt507 - 50, arg2, arg1 + Static15.anInt507 + 50, arg0 + arg2);
					Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1786(local714, arg1 + Static15.anInt507 + 50 - local806, arg2 + Static108.anInt3083, local731, 0);
					Static133.method2110(arg1, arg2, arg1 + arg3, arg2 - -arg0);
				}
				if (Static131.anIntArray22[local581] == 5) {
					local806 = 150 - Static131.anIntArray20[local581];
					Static133.method2127(arg1, arg2 + Static108.anInt3083 - Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.anInt2252 - 1, arg1 + arg3, arg2 + Static108.anInt3083 + 5);
					@Pc(1128) int local1128 = 0;
					if (local806 < 25) {
						local1128 = local806 - 25;
					} else if (local806 > 125) {
						local1128 = local806 - 125;
					}
					Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1793(local714, arg1 + Static15.anInt507, local1128 + arg2 + Static108.anInt3083, local731, 0);
					Static133.method2110(arg1, arg2, arg1 + arg3, arg2 + arg0);
				}
			} else {
				Static74.aClass2_Sub1_Sub7_Sub3_Sub1_2.method1793(local714, arg1 + Static15.anInt507, Static108.anInt3083 + arg2, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)V")
	public static void method2912(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class2_Sub17 local7 = Static118.aClass2_Sub17ArrayArrayArray1[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class2_Sub17 local28 = Static118.aClass2_Sub17ArrayArrayArray1[local9][arg0][arg1] = Static118.aClass2_Sub17ArrayArrayArray1[local9 + 1][arg0][arg1];
			if (local28 != null) {
				local28.anInt3601--;
				for (@Pc(38) int local38 = 0; local38 < local28.anInt3604; local38++) {
					@Pc(44) Class6 local44 = local28.aClass6Array2[local38];
					if ((local44.aLong8 >> 29 & 0x3L) == 2L && local44.anInt299 == arg0 && local44.anInt291 == arg1) {
						local44.anInt295--;
					}
				}
			}
		}
		if (Static118.aClass2_Sub17ArrayArrayArray1[0][arg0][arg1] == null) {
			Static118.aClass2_Sub17ArrayArrayArray1[0][arg0][arg1] = new Class2_Sub17(0, arg0, arg1);
		}
		Static118.aClass2_Sub17ArrayArrayArray1[0][arg0][arg1].aClass2_Sub17_1 = local7;
		Static118.aClass2_Sub17ArrayArrayArray1[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBI)V")
	public static void method2913(@OriginalArg(0) int arg0, @OriginalArg(4) int arg1) {
		Static64.anInt1962 = 0;
		Static117.anInt951 = arg1;
		Static123.anInt3379 = arg0;
		Static36.anInt1076 = 0;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(II)I")
	public static int method2914(@OriginalArg(0) int arg0) {
		return arg0 >> 17 & 0x7;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII)V")
	public static void method2915(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static64.anInt1962 <= arg2 && Static123.anInt3379 >= arg2) {
			@Pc(15) int local15 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg0);
			@Pc(21) int local21 = Static96.method2447(Static36.anInt1076, Static117.anInt951, arg3);
			Static62.method1441(arg2, arg1, local21, local15);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIILjava/awt/Component;)Lclient!kg;")
	public static Class44 method2916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Component arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class44_Sub1");
			@Pc(19) Class44 local19 = (Class44) local6.getDeclaredConstructor().newInstance();
			local19.method2451(arg0, arg2, arg1);
			return local19;
		} catch (@Pc(28) Throwable local28) {
			@Pc(32) Class44_Sub2 local32 = new Class44_Sub2();
			local32.method2451(arg0, arg2, arg1);
			return local32;
		}
	}
}
