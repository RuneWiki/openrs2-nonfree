import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3 aClass2_Sub1_Sub1_Sub3_5;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "Lclient!ja;")
	public static Class31 aClass31_2 = new Class31(4096);

	@OriginalMember(owner = "client!le", name = "q", descriptor = "Lclient!kc;")
	private static Class36 aClass36_768 = Static14.method2017("Message");

	@OriginalMember(owner = "client!le", name = "f", descriptor = "Lclient!kc;")
	public static Class36 aClass36_766 = aClass36_768;

	@OriginalMember(owner = "client!le", name = "i", descriptor = "Lclient!kc;")
	public static Class36 aClass36_767 = Static14.method2017("headicons_prayer");

	@OriginalMember(owner = "client!le", name = "n", descriptor = "[Z")
	public static boolean[] aBooleanArray8 = new boolean[112];

	@OriginalMember(owner = "client!le", name = "r", descriptor = "I")
	public static int anInt1597 = 0;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "Lclient!kc;")
	public static Class36 aClass36_769 = Static14.method2017("backvmid1");

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	public static int anInt1599 = 0;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "I")
	public static int anInt1600 = 0;

	@OriginalMember(owner = "client!le", name = "w", descriptor = "I")
	public static int anInt1601 = -1;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)V")
	public static void method1107() {
		if (Static10.anInt243 > 1) {
			Static10.anInt243--;
		}
		if (Static7.anInt191 > 0) {
			Static7.anInt191--;
		}
		if (Static69.aBoolean76) {
			Static69.aBoolean76 = false;
			Static76.method1457();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static49.method961(); local27++) {
		}
		if (Static23.anInt591 != 30 && Static23.anInt591 != 35) {
			return;
		}
		if (Static94.aBoolean110 && Static23.anInt591 == 30) {
			Static95.anInt2522 = 0;
			Static73.anInt1843 = 0;
			while (Static94.method1762()) {
			}
			for (@Pc(66) int local66 = 0; local66 < aBooleanArray8.length; local66++) {
				aBooleanArray8[local66] = false;
			}
		}
		Static39.method752(Static42.aClass2_Sub12_Sub1_1);
		@Pc(88) Object local88 = Static56.aClass60_1.anObject4;
		@Pc(125) int local125;
		@Pc(118) int local118;
		@Pc(127) int local127;
		@Pc(160) int local160;
		synchronized (Static56.aClass60_1.anObject4) {
			if (!Static17.aBoolean15) {
				Static56.aClass60_1.anInt2366 = 0;
			} else if (Static95.anInt2522 != 0 || Static56.aClass60_1.anInt2366 >= 40) {
				Static42.aClass2_Sub12_Sub1_1.method1422(222);
				local118 = 0;
				Static42.aClass2_Sub12_Sub1_1.method1409(0);
				local125 = Static42.aClass2_Sub12_Sub1_1.anInt1939;
				@Pc(141) int local141;
				for (local127 = 0; local127 < Static56.aClass60_1.anInt2366 && Static42.aClass2_Sub12_Sub1_1.anInt1939 - local125 < 240; local127++) {
					local141 = Static56.aClass60_1.anIntArray282[local127];
					if (local141 < 0) {
						local141 = 0;
					} else if (local141 > 502) {
						local141 = 502;
					}
					local160 = Static56.aClass60_1.anIntArray283[local127];
					if (local160 < 0) {
						local160 = 0;
					} else if (local160 > 764) {
						local160 = 764;
					}
					local118++;
					@Pc(180) int local180 = local141 * 765 + local160;
					if (Static56.aClass60_1.anIntArray282[local127] == -1 && Static56.aClass60_1.anIntArray283[local127] == -1) {
						local180 = 524287;
						local141 = -1;
						local160 = -1;
					}
					if (local160 != Static17.anInt444 || Static16.anInt348 != local141) {
						@Pc(226) int local226 = local160 - Static17.anInt444;
						Static17.anInt444 = local160;
						@Pc(233) int local233 = local141 - Static16.anInt348;
						Static16.anInt348 = local141;
						if (Static73.anInt1836 < 8 && local226 >= -32 && local226 <= 31 && local233 >= -32 && local233 <= 31) {
							local226 += 32;
							local233 += 32;
							Static42.aClass2_Sub12_Sub1_1.method1373((local226 << 6) + ((Static73.anInt1836 << 12) + local233));
							Static73.anInt1836 = 0;
						} else if (Static73.anInt1836 < 8) {
							Static42.aClass2_Sub12_Sub1_1.method1390((Static73.anInt1836 << 19) + local180 + 8388608);
							Static73.anInt1836 = 0;
						} else {
							Static42.aClass2_Sub12_Sub1_1.method1394((Static73.anInt1836 << 19) + local180 - 1073741824);
							Static73.anInt1836 = 0;
						}
					} else if (Static73.anInt1836 < 2047) {
						Static73.anInt1836++;
					}
				}
				Static42.aClass2_Sub12_Sub1_1.method1402(Static42.aClass2_Sub12_Sub1_1.anInt1939 - local125);
				if (local118 < Static56.aClass60_1.anInt2366) {
					Static56.aClass60_1.anInt2366 -= local118;
					for (local141 = 0; local141 < Static56.aClass60_1.anInt2366; local141++) {
						Static56.aClass60_1.anIntArray283[local141] = Static56.aClass60_1.anIntArray283[local141 + local118];
						Static56.aClass60_1.anIntArray282[local141] = Static56.aClass60_1.anIntArray282[local141 + local118];
					}
				} else {
					Static56.aClass60_1.anInt2366 = 0;
				}
			}
		}
		if (Static95.anInt2522 != 0) {
			local118 = Static59.anInt1578;
			@Pc(393) long local393 = (Static83.aLong66 - Static10.aLong7) / 50L;
			if (local118 < 0) {
				local118 = 0;
			} else if (local118 > 764) {
				local118 = 764;
			}
			@Pc(411) byte local411 = 0;
			Static10.aLong7 = Static83.aLong66;
			if (Static95.anInt2522 == 2) {
				local411 = 1;
			}
			if (local393 > 4095L) {
				local393 = 4095L;
			}
			local125 = Static90.anInt2349;
			Static42.aClass2_Sub12_Sub1_1.method1422(236);
			local160 = (int) local393;
			if (local125 < 0) {
				local125 = 0;
			} else if (local125 > 502) {
				local125 = 502;
			}
			local127 = local125 * 765 + local118;
			Static42.aClass2_Sub12_Sub1_1.method1380((local160 << 20) + (local411 << 19) + local127);
		}
		if (Static48.anInt1262 > 0) {
			Static48.anInt1262--;
		}
		if (aBooleanArray8[96] || aBooleanArray8[97] || aBooleanArray8[98] || aBooleanArray8[99]) {
			Static90.aBoolean104 = true;
		}
		if (Static90.aBoolean104 && Static48.anInt1262 <= 0) {
			Static90.aBoolean104 = false;
			Static48.anInt1262 = 20;
			Static42.aClass2_Sub12_Sub1_1.method1422(58);
			Static42.aClass2_Sub12_Sub1_1.method1392(Static100.anInt2618);
			Static42.aClass2_Sub12_Sub1_1.method1383(Static14.anInt2903);
		}
		if (Static103.aBoolean123 && !Static22.aBoolean22) {
			Static22.aBoolean22 = true;
			Static42.aClass2_Sub12_Sub1_1.method1422(167);
			Static42.aClass2_Sub12_Sub1_1.method1409(1);
		}
		if (!Static103.aBoolean123 && Static22.aBoolean22) {
			Static22.aBoolean22 = false;
			Static42.aClass2_Sub12_Sub1_1.method1422(167);
			Static42.aClass2_Sub12_Sub1_1.method1409(0);
		}
		Static19.method2027();
		if (Static23.anInt591 != 30 && Static23.anInt591 != 35) {
			return;
		}
		Static64.method1133();
		Static14.method2020();
		Static1.anInt2++;
		if (Static1.anInt2 > 750) {
			Static76.method1457();
			return;
		}
		Static74.method1423();
		Static114.method2078();
		Static2.method2068();
		Static100.anInt2609++;
		if (Static7.anInt193 != 0) {
			Static92.anInt2411 += 20;
			if (Static92.anInt2411 >= 400) {
				Static7.anInt193 = 0;
			}
		}
		if (Static20.anInt498 != 0) {
			Static85.anInt2207++;
			if (Static85.anInt2207 >= 15) {
				if (Static20.anInt498 == 2) {
					Static100.aBoolean118 = true;
				}
				if (Static20.anInt498 == 3) {
					Static115.aBoolean77 = true;
				}
				Static20.anInt498 = 0;
			}
		}
		if (anInt1597 != 0) {
			Static65.anInt1685++;
			if (Static99.anInt2035 + 5 < Static115.anInt1789 || Static115.anInt1789 < Static99.anInt2035 - 5 || Static64.anInt1640 > Static13.anInt308 + 5 || Static64.anInt1640 < Static13.anInt308 - 5) {
				Static41.aBoolean53 = true;
			}
			if (Static73.anInt1843 == 0) {
				if (anInt1597 == 2) {
					Static100.aBoolean118 = true;
				}
				if (anInt1597 == 3) {
					Static115.aBoolean77 = true;
				}
				anInt1597 = 0;
				if (Static41.aBoolean53 && Static65.anInt1685 >= 5) {
					Static111.anInt2883 = -1;
					Static69.method1199();
					if (Static111.anInt2883 == Static101.anInt2658 && Static77.anInt2024 != Static81.anInt2062) {
						@Pc(762) Class2_Sub1_Sub6 local762 = Static71.method1274(Static101.anInt2658);
						@Pc(764) byte local764 = 0;
						if (Static100.anInt2623 == 1 && local762.anInt694 == 206) {
							local764 = 1;
						}
						if (local762.anIntArray57[Static81.anInt2062] <= 0) {
							local764 = 0;
						}
						if (Static100.method1851(Static67.method1163(local762))) {
							local125 = Static77.anInt2024;
							local118 = Static81.anInt2062;
							local762.anIntArray57[local118] = local762.anIntArray57[local125];
							local762.anIntArray54[local118] = local762.anIntArray54[local125];
							local762.anIntArray57[local125] = -1;
							local762.anIntArray54[local125] = 0;
						} else if (local764 == 1) {
							local125 = Static77.anInt2024;
							local118 = Static81.anInt2062;
							while (local118 != local125) {
								if (local125 > local118) {
									local762.method540(local125 - 1, local125);
									local125--;
								} else if (local118 > local125) {
									local762.method540(local125 + 1, local125);
									local125++;
								}
							}
						} else {
							local762.method540(Static81.anInt2062, Static77.anInt2024);
						}
						Static42.aClass2_Sub12_Sub1_1.method1422(224);
						Static42.aClass2_Sub12_Sub1_1.method1379(Static81.anInt2062);
						Static42.aClass2_Sub12_Sub1_1.method1381(local764);
						Static42.aClass2_Sub12_Sub1_1.method1380(Static101.anInt2658);
						Static42.aClass2_Sub12_Sub1_1.method1392(Static77.anInt2024);
					}
				} else if ((Static100.anInt2614 == 1 || Static52.method1001(Static43.anInt1141 - 1)) && Static43.anInt1141 > 2) {
					Static113.method2045();
				} else if (Static43.anInt1141 > 0) {
					Static55.method1925(Static43.anInt1141 - 1);
				}
				Static85.anInt2207 = 10;
				Static95.anInt2522 = 0;
			}
		}
		if (Static46.anInt1229 == -1) {
			if (Static78.anInt2037 != -1) {
				Static22.method486(338, 516, Static78.anInt2037, 4, 34, 4);
			} else if (Static32.anInt900 != -1) {
				Static22.method486(338, 516, Static32.anInt900, 4, 34, 4);
			}
			if (Static94.anInt2471 != -1) {
				Static22.method486(466, 743, Static94.anInt2471, 205, 34, 553);
			} else if (Static101.anIntArray323[Static109.anInt2825] != -1) {
				Static22.method486(466, 743, Static101.anIntArray323[Static109.anInt2825], 205, 34, 553);
			}
			if (Static49.anInt1312 != -1) {
				Static22.method486(453, 496, Static49.anInt1312, 357, 34, 17);
			} else if (Static39.anInt980 != -1) {
				Static22.method486(453, 496, Static39.anInt980, 357, 34, 17);
			}
		} else {
			Static22.method486(503, 765, Static46.anInt1229, 0, 34, 0);
			if (Static9.anInt237 != -1) {
				Static22.method486(503, 765, Static9.anInt237, 0, 34, 0);
			}
		}
		if (Static46.anInt1229 == -1) {
			if (Static78.anInt2037 != -1) {
				Static22.method486(338, 516, Static78.anInt2037, 4, -35, 4);
			} else if (Static32.anInt900 != -1) {
				Static22.method486(338, 516, Static32.anInt900, 4, -35, 4);
			}
			if (Static94.anInt2471 != -1) {
				Static22.method486(466, 743, Static94.anInt2471, 205, -35, 553);
			} else if (Static101.anIntArray323[Static109.anInt2825] != -1) {
				Static22.method486(466, 743, Static101.anIntArray323[Static109.anInt2825], 205, -35, 553);
			}
			if (Static49.anInt1312 != -1) {
				Static22.method486(453, 496, Static49.anInt1312, 357, -35, 17);
			} else if (Static39.anInt980 != -1) {
				Static22.method486(453, 496, Static39.anInt980, 357, -35, 17);
			}
		} else {
			Static22.method486(503, 765, Static46.anInt1229, 0, -35, 0);
			if (Static9.anInt237 != -1) {
				Static22.method486(503, 765, Static9.anInt237, 0, -35, 0);
			}
		}
		Static45.method900();
		@Pc(1123) int local1123;
		if (Static93.anInt2420 != -1) {
			local1123 = Static93.anInt2420;
			local125 = Static93.anInt2435;
			@Pc(1145) boolean local1145 = Static29.method623(0, 0, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray258[0], 0, local1123, 0, local125, 0, true, 0, Static55.aClass2_Sub1_Sub4_Sub2_Sub2_3.anIntArray252[0]);
			if (local1145) {
				Static7.anInt193 = 1;
				Static15.anInt313 = Static90.anInt2349;
				Static40.anInt2190 = Static59.anInt1578;
				Static92.anInt2411 = 0;
			}
			Static93.anInt2420 = -1;
		}
		if (Static95.anInt2522 == 1 && Static90.aClass36_1092 != null) {
			Static115.aBoolean77 = true;
			Static90.aClass36_1092 = null;
			Static95.anInt2522 = 0;
		}
		Static29.method626();
		if (Static46.anInt1229 == -1) {
			Static58.method1077();
			Static39.method754();
			Static58.method1073();
		}
		if (Static73.anInt1843 == 1 || Static95.anInt2522 == 1) {
			Static19.anInt2917++;
		}
		if (Static117.anInt1947 == -1 && Static58.anInt1526 == -1 && Static95.anInt2530 == -1) {
			if (Static16.anInt349 > 0) {
				Static16.anInt349--;
			}
		} else if (Static16.anInt349 < Static33.anInt408) {
			Static16.anInt349++;
			if (Static16.anInt349 == Static33.anInt408) {
				if (Static117.anInt1947 != -1) {
					Static115.aBoolean77 = true;
				}
				if (Static58.anInt1526 != -1) {
					Static100.aBoolean118 = true;
				}
			}
		}
		Static29.method630();
		if (Static88.aBoolean100) {
			Static8.method184();
		}
		for (local1123 = 0; local1123 < 5; local1123++) {
			@Pc(1258) int local1258 = Static66.anIntArray215[local1123]++;
		}
		Static23.method487();
		local125 = Static29.method621();
		local118 = Static83.method1508();
		if (local125 > 4500 && local118 > 4500) {
			Static7.anInt191 = 250;
			Static50.method964(4000);
			Static42.aClass2_Sub12_Sub1_1.method1422(82);
		}
		Static47.anInt1244++;
		Static71.anInt1810++;
		Static19.anInt2918++;
		if (Static19.anInt2918 > 500) {
			local127 = (int) (Math.random() * 8.0D);
			Static19.anInt2918 = 0;
			if ((local127 & 0x4) == 4) {
				Static25.anInt633 += Static56.anInt1491;
			}
			if ((local127 & 0x2) == 2) {
				Static57.anInt1504 += Static115.anInt1790;
			}
			if ((local127 & 0x1) == 1) {
				Static63.anInt1623 += Static84.anInt2109;
			}
		}
		if (Static25.anInt633 < -40) {
			Static56.anInt1491 = 1;
		}
		if (Static25.anInt633 > 40) {
			Static56.anInt1491 = -1;
		}
		if (Static47.anInt1244 > 500) {
			local127 = (int) (Math.random() * 8.0D);
			Static47.anInt1244 = 0;
			if ((local127 & 0x2) == 2) {
				Static7.anInt194 += Static76.anInt2016;
			}
			if ((local127 & 0x1) == 1) {
				Static65.anInt1672 += Static36.anInt952;
			}
		}
		if (Static57.anInt1504 < -55) {
			Static115.anInt1790 = 2;
		}
		if (Static63.anInt1623 < -50) {
			Static84.anInt2109 = 2;
		}
		if (Static7.anInt194 < -20) {
			Static76.anInt2016 = 1;
		}
		if (Static63.anInt1623 > 50) {
			Static84.anInt2109 = -2;
		}
		if (Static57.anInt1504 > 55) {
			Static115.anInt1790 = -2;
		}
		if (Static7.anInt194 > 10) {
			Static76.anInt2016 = -1;
		}
		if (Static65.anInt1672 < -60) {
			Static36.anInt952 = 2;
		}
		if (Static65.anInt1672 > 60) {
			Static36.anInt952 = -2;
		}
		if (Static71.anInt1810 > 50) {
			Static42.aClass2_Sub12_Sub1_1.method1422(99);
		}
		try {
			if (Static57.aClass51_3 != null && Static42.aClass2_Sub12_Sub1_1.anInt1939 > 0) {
				Static57.aClass51_3.method1486(Static42.aClass2_Sub12_Sub1_1.anInt1939, Static42.aClass2_Sub12_Sub1_1.aByteArray20);
				Static42.aClass2_Sub12_Sub1_1.anInt1939 = 0;
				Static71.anInt1810 = 0;
			}
		} catch (@Pc(1476) IOException local1476) {
			Static76.method1457();
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(III[BZ[Lclient!ad;IIII)V")
	public static void method1108(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) Class4[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (arg7 + local7 > 0 && local7 + arg7 < 103 && arg8 + local11 > 0 && local11 + arg8 < 103) {
					arg4[arg2].anIntArrayArray3[local7 + arg7][arg8 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(90) Class2_Sub12 local90 = new Class2_Sub12(arg3);
		for (@Pc(92) int local92 = 0; local92 < 4; local92++) {
			for (@Pc(96) int local96 = 0; local96 < 64; local96++) {
				for (@Pc(100) int local100 = 0; local100 < 64; local100++) {
					if (local92 == arg6 && arg0 <= local96 && local96 < arg0 + 8 && local100 >= arg1 && arg1 + 8 > local100) {
						Static3.method938(0, Static71.method1276(arg5, local100 & 0x7, local96 & 0x7) + arg8, local90, 0, arg5, arg7 + Static23.method492(arg5, local100 & 0x7, local96 & 0x7), arg2);
					} else {
						Static3.method938(0, -1, local90, 0, 0, -1, 0);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Lclient!ed;B)Z")
	public static boolean method1109(@OriginalArg(0) Class2_Sub1_Sub6 arg0) {
		@Pc(6) int local6 = arg0.anInt694;
		if (Static106.anInt2726 == 2) {
			if (local6 == 201) {
				Static105.aClass36_1347 = Static105.aClass36_1352;
				Static105.aClass36_1343 = Static105.aClass36_1340;
				Static115.aBoolean77 = true;
				Static16.aBoolean8 = true;
				Static23.anInt594 = 1;
				Static32.anInt910 = 0;
			}
			if (local6 == 202) {
				Static23.anInt594 = 2;
				Static32.anInt910 = 0;
				Static115.aBoolean77 = true;
				Static105.aClass36_1343 = Static80.aClass36_969;
				Static16.aBoolean8 = true;
				Static105.aClass36_1347 = Static105.aClass36_1352;
			}
		}
		if (local6 == 205) {
			Static7.anInt191 = 250;
			return true;
		}
		if (local6 == 501) {
			Static105.aClass36_1343 = Static100.aClass36_1278;
			Static105.aClass36_1347 = Static105.aClass36_1352;
			Static32.anInt910 = 0;
			Static23.anInt594 = 4;
			Static115.aBoolean77 = true;
			Static16.aBoolean8 = true;
		}
		if (local6 == 502) {
			Static115.aBoolean77 = true;
			Static16.aBoolean8 = true;
			Static105.aClass36_1343 = Static6.aClass36_84;
			Static32.anInt910 = 0;
			Static105.aClass36_1347 = Static105.aClass36_1352;
			Static23.anInt594 = 5;
		}
		@Pc(99) int local99;
		@Pc(103) int local103;
		if (local6 >= 300 && local6 <= 313) {
			local99 = (local6 - 300) / 2;
			local103 = local6 & 0x1;
			Static47.aClass67_1.method1999(local103 == 1, local99);
		}
		if (local6 >= 314 && local6 <= 323) {
			local99 = (local6 - 314) / 2;
			local103 = local6 & 0x1;
			Static47.aClass67_1.method2001(local103 == 1, local99);
		}
		if (local6 == 324) {
			Static47.aClass67_1.method2010(false);
		}
		if (local6 == 325) {
			Static47.aClass67_1.method2010(true);
		}
		if (local6 == 326) {
			Static42.aClass2_Sub12_Sub1_1.method1422(109);
			Static47.aClass67_1.method2007(Static42.aClass2_Sub12_Sub1_1);
			return true;
		}
		if (local6 == 620) {
			Static66.aBoolean75 = !Static66.aBoolean75;
		}
		if (local6 >= 601 && local6 <= 613) {
			Static11.method220();
			if (Static105.aClass36_1348.method1028() > 0) {
				Static42.aClass2_Sub12_Sub1_1.method1422(95);
				Static42.aClass2_Sub12_Sub1_1.method1377(Static105.aClass36_1348.method1021());
				Static42.aClass2_Sub12_Sub1_1.method1409(local6 - 601);
				Static42.aClass2_Sub12_Sub1_1.method1409(Static66.aBoolean75 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public static void method1110() {
		aBooleanArray8 = null;
		aClass2_Sub1_Sub1_Sub3_5 = null;
		aClass31_2 = null;
		aClass36_768 = null;
		aClass36_766 = null;
		aClass36_769 = null;
		aClass36_767 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BLclient!ac;)V")
	public static void method1111(@OriginalArg(1) Class3 arg0) {
		Static110.aClass3_26 = arg0;
	}
}
