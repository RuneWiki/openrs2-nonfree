import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!af", name = "i", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_97 = Static177.method3050("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!af", name = "j", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_98 = Static177.method3050(":clan:");

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/Class;")
	public static Class method103(@OriginalArg(1) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!a;IBI)V")
	public static void method104(@OriginalArg(0) Class1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static123.anInt2973 != 0 && Static123.anInt2973 != 3) {
			return;
		}
		@Pc(21) int local21 = arg1 - arg0.anInt20 / 2;
		@Pc(27) int local27 = Static152.anInt3459 + Static8.anInt297 & 0x7FF;
		@Pc(39) int local39 = Class4_Sub1_Sub7_Sub4.anIntArray412[local27];
		@Pc(47) int local47 = (Static114.anInt2767 + 256) * local39 >> 8;
		@Pc(54) int local54 = arg2 - arg0.anInt50 / 2;
		@Pc(58) int local58 = Class4_Sub1_Sub7_Sub4.anIntArray416[local27];
		@Pc(66) int local66 = local58 * (Static114.anInt2767 + 256) >> 8;
		@Pc(76) int local76 = local21 * local47 + local66 * local54 >> 11;
		@Pc(87) int local87 = local21 * local66 - local47 * local54 >> 11;
		@Pc(95) int local95 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803 - local87 >> 7;
		@Pc(102) int local102 = Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832 + local76 >> 7;
		@Pc(122) boolean local122 = Static163.method2823(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray262[0], 0, Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anIntArray259[0], local102, 0, true, 0, 0, 0, local95, 1);
		if (!local122) {
			return;
		}
		Static90.aClass4_Sub11_Sub1_1.method1238(local54);
		Static90.aClass4_Sub11_Sub1_1.method1238(local21);
		Static90.aClass4_Sub11_Sub1_1.method1268(Static8.anInt297);
		Static90.aClass4_Sub11_Sub1_1.method1238(57);
		Static90.aClass4_Sub11_Sub1_1.method1238(Static152.anInt3459);
		Static90.aClass4_Sub11_Sub1_1.method1238(Static114.anInt2767);
		Static90.aClass4_Sub11_Sub1_1.method1238(89);
		Static90.aClass4_Sub11_Sub1_1.method1268(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2832);
		Static90.aClass4_Sub11_Sub1_1.method1268(Static13.aClass4_Sub1_Sub1_Sub1_Sub1_1.anInt2803);
		Static90.aClass4_Sub11_Sub1_1.method1238(Static100.anInt2544);
		Static90.aClass4_Sub11_Sub1_1.method1238(63);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)Lclient!ld;")
	public static Class4_Sub1_Sub13 method105(@OriginalArg(0) int arg0) {
		@Pc(10) Class4_Sub1_Sub13 local10 = (Class4_Sub1_Sub13) Static65.aClass66_28.method2225((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static172.aClass62_44.method2878(5, arg0);
		local10 = new Class4_Sub1_Sub13();
		if (local20 != null) {
			local10.method1917(new Class4_Sub11(local20));
		}
		Static65.aClass66_28.method2222(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IIIII)V")
	public static void method107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static53.anInt1331 == 0 && !Static86.aBoolean97) {
			Static40.method695((short) 11, arg0 - arg3, 0L, Static3.aClass46_44, arg2 - arg1, Static187.aClass46_1511);
		}
		@Pc(24) long local24 = -1L;
		for (@Pc(26) int local26 = 0; local26 < Static34.anInt3723; local26++) {
			@Pc(32) long local32 = Static34.aLongArray42[local26];
			@Pc(37) int local37 = (int) local32 & 0x7F;
			@Pc(44) int local44 = (int) local32 >> 29 & 0x3;
			@Pc(51) int local51 = (int) local32 >> 7 & 0x7F;
			@Pc(58) int local58 = (int) (local32 >>> 32) & Integer.MAX_VALUE;
			if (local24 != local32) {
				local24 = local32;
				@Pc(151) int local151;
				if (local44 == 2 && Static79.method1591(Static73.anInt1873, local37, local51, local32)) {
					@Pc(81) Class4_Sub1_Sub19 local81 = Static113.method2090(local58);
					if (local81.anIntArray442 != null) {
						local81 = local81.method3185();
					}
					if (local81 == null) {
						continue;
					}
					if (Static53.anInt1331 == 1) {
						Static40.method695((short) 2, local37, local32, Static69.method1482(new Class46[] { Static1.aClass46_1, Static142.aClass46_1218, local81.aClass46_1521 }), local51, Static21.aClass46_188);
					} else if (!Static86.aBoolean97) {
						@Pc(141) Class46[] local141 = local81.aClass46Array26;
						if (Static107.aBoolean115) {
							local141 = Static148.method2489(local141);
						}
						if (local141 != null) {
							for (local151 = 4; local151 >= 0; local151--) {
								if (local141[local151] != null) {
									@Pc(163) short local163 = 0;
									if (local151 == 0) {
										local163 = 43;
									}
									if (local151 == 1) {
										local163 = 44;
									}
									if (local151 == 2) {
										local163 = 4;
									}
									if (local151 == 3) {
										local163 = 23;
									}
									if (local151 == 4) {
										local163 = 1004;
									}
									Static40.method695(local163, local37, local32, Static69.method1482(new Class46[] { Static114.aClass46_1024, local81.aClass46_1521 }), local51, local141[local151]);
								}
							}
						}
						Static40.method695((short) 1001, local37, (long) local81.anInt4188, Static69.method1482(new Class46[] { Static114.aClass46_1024, local81.aClass46_1521 }), local51, Static49.aClass46_485);
					} else if ((Static38.anInt1000 & 0x4) == 4) {
						Static40.method695((short) 36, local37, local32, Static69.method1482(new Class46[] { Static30.aClass46_250, Static142.aClass46_1218, local81.aClass46_1521 }), local51, Static111.aClass46_1005);
					}
				}
				@Pc(299) int local299;
				@Pc(307) Class4_Sub1_Sub1_Sub1_Sub2 local307;
				@Pc(356) Class4_Sub1_Sub1_Sub1_Sub1 local356;
				if (local44 == 1) {
					@Pc(276) Class4_Sub1_Sub1_Sub1_Sub2 local276 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[local58];
					if (local276.aClass4_Sub1_Sub11_1.anInt2251 == 1 && (local276.anInt2832 & 0x7F) == 64 && (local276.anInt2803 & 0x7F) == 64) {
						for (local299 = 0; local299 < Static87.anInt2219; local299++) {
							local307 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[Static35.anIntArray82[local299]];
							if (local307 != null && local276 != local307 && local307.aClass4_Sub1_Sub11_1.anInt2251 == 1 && local276.anInt2832 == local307.anInt2832 && local276.anInt2803 == local307.anInt2803) {
								Static178.method3064(local51, Static35.anIntArray82[local299], local307.aClass4_Sub1_Sub11_1, local37);
							}
						}
						for (local151 = 0; local151 < Static126.anInt3006; local151++) {
							local356 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[Static167.anIntArray369[local151]];
							if (local356 != null && local356.anInt2832 == local276.anInt2832 && local356.anInt2803 == local276.anInt2803) {
								Static155.method2668(local37, Static167.anIntArray369[local151], local51, local356);
							}
						}
					}
					Static178.method3064(local51, local58, local276.aClass4_Sub1_Sub11_1, local37);
				}
				if (local44 == 0) {
					@Pc(400) Class4_Sub1_Sub1_Sub1_Sub1 local400 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[local58];
					if ((local400.anInt2832 & 0x7F) == 64 && (local400.anInt2803 & 0x7F) == 64) {
						for (local299 = 0; local299 < Static87.anInt2219; local299++) {
							local307 = Static97.aClass4_Sub1_Sub1_Sub1_Sub2Array1[Static35.anIntArray82[local299]];
							if (local307 != null && local307.aClass4_Sub1_Sub11_1.anInt2251 == 1 && local307.anInt2832 == local400.anInt2832 && local400.anInt2803 == local307.anInt2803) {
								Static178.method3064(local51, Static35.anIntArray82[local299], local307.aClass4_Sub1_Sub11_1, local37);
							}
						}
						for (local151 = 0; local151 < Static126.anInt3006; local151++) {
							local356 = Static152.aClass4_Sub1_Sub1_Sub1_Sub1Array1[Static167.anIntArray369[local151]];
							if (local356 != null && local356 != local400 && local356.anInt2832 == local400.anInt2832 && local356.anInt2803 == local400.anInt2803) {
								Static155.method2668(local37, Static167.anIntArray369[local151], local51, local356);
							}
						}
					}
					Static155.method2668(local37, local58, local51, local400);
				}
				if (local44 == 3) {
					@Pc(522) Class11 local522 = Static122.aClass11ArrayArrayArray1[Static73.anInt1873][local37][local51];
					if (local522 != null) {
						for (@Pc(529) Class4_Sub1_Sub1_Sub7 local529 = (Class4_Sub1_Sub1_Sub7) local522.method275(); local529 != null; local529 = (Class4_Sub1_Sub1_Sub7) local522.method278()) {
							@Pc(536) Class4_Sub1_Sub12 local536 = Static83.method1663(local529.anInt1988);
							if (Static53.anInt1331 == 1) {
								Static40.method695((short) 32, local37, (long) local529.anInt1988, Static69.method1482(new Class46[] { Static1.aClass46_1, Static109.aClass46_990, local536.aClass46_895 }), local51, Static21.aClass46_188);
							} else if (!Static86.aBoolean97) {
								@Pc(576) Class46[] local576 = local536.aClass46Array18;
								if (Static107.aBoolean115) {
									local576 = Static148.method2489(local576);
								}
								for (@Pc(588) int local588 = 4; local588 >= 0; local588--) {
									if (local576 != null && local576[local588] != null) {
										@Pc(598) byte local598 = 0;
										if (local588 == 0) {
											local598 = 45;
										}
										if (local588 == 1) {
											local598 = 25;
										}
										if (local588 == 2) {
											local598 = 7;
										}
										if (local588 == 3) {
											local598 = 6;
										}
										if (local588 == 4) {
											local598 = 50;
										}
										Static40.method695(local598, local37, (long) local529.anInt1988, Static69.method1482(new Class46[] { Static46.aClass46_469, local536.aClass46_895 }), local51, local576[local588]);
									} else if (local588 == 2) {
										Static40.method695((short) 7, local37, (long) local529.anInt1988, Static69.method1482(new Class46[] { Static46.aClass46_469, local536.aClass46_895 }), local51, Static155.aClass46_1304);
									}
								}
								Static40.method695((short) 1002, local37, (long) local529.anInt1988, Static69.method1482(new Class46[] { Static46.aClass46_469, local536.aClass46_895 }), local51, Static49.aClass46_485);
							} else if ((Static38.anInt1000 & 0x1) == 1) {
								Static40.method695((short) 8, local37, (long) local529.anInt1988, Static69.method1482(new Class46[] { Static30.aClass46_250, Static109.aClass46_990, local536.aClass46_895 }), local51, Static111.aClass46_1005);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)V")
	public static void method108(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static85.method1709(Static62.aClass46_601, Static118.aClass46_1066, Static2.aClass46_23);
		} else if (arg0 == -2) {
			Static85.method1709(Static62.aClass46_611, Static62.aClass46_606, Static141.aClass46_1208);
		} else if (arg0 == -1) {
			Static85.method1709(Static62.aClass46_617, Static182.aClass46_1490, Static2.aClass46_16);
		} else if (arg0 == 3) {
			Static85.method1709(Static62.aClass46_614, Static62.aClass46_615, Static45.aClass46_401);
		} else if (arg0 == 4) {
			Static85.method1709(Static62.aClass46_631, Static97.aClass46_897, Static137.aClass46_1199);
		} else if (arg0 == 5) {
			Static85.method1709(Static62.aClass46_620, Static143.aClass46_1226, Static107.aClass46_965);
		} else if (arg0 == 6) {
			Static85.method1709(Static62.aClass46_641, Static106.aClass46_958, Static77.aClass46_737);
		} else if (arg0 == 7) {
			Static85.method1709(Static62.aClass46_623, Static45.aClass46_398, Static166.aClass46_1354);
		} else if (arg0 == 8) {
			Static85.method1709(Static62.aClass46_603, Static123.aClass46_1092, Static113.aClass46_1018);
		} else if (arg0 == 9) {
			Static85.method1709(Static62.aClass46_636, Static93.aClass46_865, Static130.aClass46_1142);
		} else if (arg0 == 10) {
			Static85.method1709(Static62.aClass46_607, Static123.aClass46_1090, Static177.aClass46_1457);
		} else if (arg0 == 11) {
			Static85.method1709(Static62.aClass46_604, Static165.aClass46_1345, Static126.aClass46_1100);
		} else if (arg0 == 12) {
			Static85.method1709(Static62.aClass46_618, Static69.aClass46_708, Static185.aClass46_1496);
		} else if (arg0 == 13) {
			Static85.method1709(Static62.aClass46_627, Static108.aClass46_978, Static2.aClass46_27);
		} else if (arg0 == 14) {
			Static85.method1709(Static62.aClass46_626, Static95.aClass46_1105, Static64.aClass46_660);
		} else if (arg0 == 16) {
			Static85.method1709(Static62.aClass46_640, Static107.aClass46_968, Static24.aClass46_198);
		} else if (arg0 == 17) {
			Static85.method1709(Static62.aClass46_605, Static39.aClass46_356, Static173.aClass46_1417);
		} else if (arg0 == 18) {
			Static85.method1709(Static62.aClass46_619, Static63.aClass46_593, Static35.aClass46_307);
		} else if (arg0 == 19) {
			Static85.method1709(Static166.aClass46_1351, Static2.aClass46_17, Static143.aClass46_1221);
		} else if (arg0 == 20) {
			Static85.method1709(Static62.aClass46_639, Static114.aClass46_1025, Static2.aClass46_26);
		} else if (arg0 == 22) {
			Static85.method1709(Static62.aClass46_628, Static105.aClass46_955, Static108.aClass46_977);
		} else if (arg0 == 23) {
			Static85.method1709(Static62.aClass46_632, Static32.aClass46_278, Static64.aClass46_657);
		} else if (arg0 == 24) {
			Static85.method1709(Static62.aClass46_600, Static61.aClass46_597, Static117.aClass46_1056);
		} else if (arg0 == 25) {
			Static85.method1709(Static62.aClass46_638, Static131.aClass46_1146, Static2.aClass46_21);
		} else if (arg0 == 26) {
			Static85.method1709(Static62.aClass46_621, Static3.aClass46_43, Static108.aClass46_976);
		} else if (arg0 == 27) {
			Static85.method1709(Static62.aClass46_642, Static62.aClass46_635, Static54.aClass46_521);
		} else {
			Static85.method1709(Static62.aClass46_634, Static154.aClass46_1498, Static2.aClass46_20);
		}
		Static187.method3168(10);
	}
}
