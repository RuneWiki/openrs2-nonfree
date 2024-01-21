import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!vd", name = "C", descriptor = "I")
	public static int anInt2948;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!ce;")
	public static Class13 aClass13_2 = new Class13();

	@OriginalMember(owner = "client!vd", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1179 = Static121.method2047("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1180 = Static121.method2047("<br>");

	@OriginalMember(owner = "client!vd", name = "z", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1181 = Static121.method2047("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!vd", name = "A", descriptor = "I")
	public static int anInt2947 = -1;

	@OriginalMember(owner = "client!vd", name = "B", descriptor = "Lclient!qc;")
	private static Class60 aClass60_1182 = Static121.method2047("Your friend list is full)3 Max of 100 for free users)1 and 200 for members");

	@OriginalMember(owner = "client!vd", name = "D", descriptor = "Z")
	public static boolean aBoolean124 = false;

	@OriginalMember(owner = "client!vd", name = "E", descriptor = "I")
	public static int anInt2949 = 0;

	@OriginalMember(owner = "client!vd", name = "F", descriptor = "Lclient!qc;")
	public static Class60 aClass60_1183 = aClass60_1182;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIII)V")
	public static void method2078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static8.anInt131 = 0;
		@Pc(73) int local73;
		for (@Pc(9) int local9 = -1; local9 < Static43.anInt1107 + Static114.anInt2750; local9++) {
			@Pc(16) Class4_Sub4_Sub1_Sub2 local16;
			if (local9 == -1) {
				local16 = Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1;
			} else if (local9 < Static43.anInt1107) {
				local16 = Static59.aClass4_Sub4_Sub1_Sub2_Sub2Array1[Static94.anIntArray231[local9]];
			} else {
				local16 = Static120.aClass4_Sub4_Sub1_Sub2_Sub1Array2[Static38.anIntArray72[local9 - Static43.anInt1107]];
			}
			if (local16 != null && local16.method1877()) {
				@Pc(57) Class4_Sub4_Sub11 local57;
				if (local16 instanceof Class4_Sub4_Sub1_Sub2_Sub1) {
					local57 = ((Class4_Sub4_Sub1_Sub2_Sub1) local16).aClass4_Sub4_Sub11_1;
					if (local57.anIntArray201 != null) {
						local57 = local57.method1494();
					}
					if (local57 == null) {
						continue;
					}
				}
				if (local9 >= Static43.anInt1107) {
					local57 = ((Class4_Sub4_Sub1_Sub2_Sub1) local16).aClass4_Sub4_Sub11_1;
					if (local57.anIntArray201 != null) {
						local57 = local57.method1494();
					}
					if (local57.anInt1997 >= 0 && Static65.aClass4_Sub4_Sub3_Sub2Array4.length > local57.anInt1997) {
						Static128.method1879(local16.anInt2605 + 15, local16);
						if (Static105.anInt2510 > -1) {
							Static65.aClass4_Sub4_Sub3_Sub2Array4[local57.anInt1997].method912(Static105.anInt2510 + arg3 - 12, arg1 + Static29.anInt824 + -30);
						}
					}
					if (Static63.anInt1695 == 1 && Static81.anInt1953 == Static38.anIntArray72[local9 - Static43.anInt1107] && Static81.anInt1944 % 20 < 10) {
						Static128.method1879(local16.anInt2605 + 15, local16);
						if (Static105.anInt2510 > -1) {
							Static70.aClass4_Sub4_Sub3_Sub2Array5[0].method912(Static105.anInt2510 + arg3 - 12, arg1 - -Static29.anInt824 + -28);
						}
					}
				} else {
					local73 = 30;
					@Pc(76) Class4_Sub4_Sub1_Sub2_Sub2 local76 = (Class4_Sub4_Sub1_Sub2_Sub2) local16;
					if (local76.anInt2671 != -1 || local76.anInt2653 != -1) {
						Static128.method1879(local16.anInt2605 + 15, local16);
						if (Static105.anInt2510 > -1) {
							if (local76.anInt2671 != -1) {
								Static130.aClass4_Sub4_Sub3_Sub2Array10[local76.anInt2671].method912(arg3 + Static105.anInt2510 - 12, arg1 - -Static29.anInt824 + -30);
								local73 += 25;
							}
							if (local76.anInt2653 != -1) {
								Static65.aClass4_Sub4_Sub3_Sub2Array4[local76.anInt2653].method912(arg3 + Static105.anInt2510 - 12, -local73 + arg1 - -Static29.anInt824);
								local73 += 25;
							}
						}
					}
					if (local9 >= 0 && Static63.anInt1695 == 10 && Static94.anIntArray231[local9] == anInt2949) {
						Static128.method1879(local16.anInt2605 + 15, local16);
						if (Static105.anInt2510 > -1) {
							Static70.aClass4_Sub4_Sub3_Sub2Array5[1].method912(arg3 + Static105.anInt2510 - 12, -local73 + Static29.anInt824 + arg1);
						}
					}
				}
				if (local16.aClass60_1059 != null && (Static43.anInt1107 <= local9 || Static81.anInt1955 == 0 || Static81.anInt1955 == 3 || Static81.anInt1955 == 1 && Static15.method2093(((Class4_Sub4_Sub1_Sub2_Sub2) local16).aClass60_1066))) {
					Static128.method1879(local16.anInt2605, local16);
					if (Static105.anInt2510 > -1 && Static8.anInt131 < Static64.anInt1713) {
						Static64.anIntArray174[Static8.anInt131] = Static87.aClass4_Sub4_Sub3_Sub4_5.method1743(local16.aClass60_1059) / 2;
						Static64.anIntArray170[Static8.anInt131] = Static87.aClass4_Sub4_Sub3_Sub4_5.anInt2387;
						Static64.anIntArray175[Static8.anInt131] = Static105.anInt2510;
						Static64.anIntArray176[Static8.anInt131] = Static29.anInt824;
						Static64.anIntArray172[Static8.anInt131] = local16.anInt2627;
						Static64.anIntArray171[Static8.anInt131] = local16.anInt2602;
						Static64.anIntArray173[Static8.anInt131] = local16.anInt2596;
						Static64.aClass60Array13[Static8.anInt131] = local16.aClass60_1059;
						Static8.anInt131++;
					}
				}
				if (local16.anInt2623 > Static81.anInt1944) {
					Static128.method1879(local16.anInt2605 + 15, local16);
					if (Static105.anInt2510 > -1) {
						local73 = local16.anInt2598 * 30 / local16.anInt2619;
						if (local73 > 30) {
							local73 = 30;
						}
						Static80.method1705(Static105.anInt2510 + arg3 - 15, Static29.anInt824 + arg1 + -3, local73, 5, 65280);
						Static80.method1705(local73 + Static105.anInt2510 + arg3 - 15, Static29.anInt824 + arg1 - 3, 30 - local73, 5, 16711680);
					}
				}
				for (local73 = 0; local73 < 4; local73++) {
					if (local16.anIntArray284[local73] > Static81.anInt1944) {
						Static128.method1879(local16.anInt2605 / 2, local16);
						if (Static105.anInt2510 > -1) {
							if (local73 == 1) {
								Static29.anInt824 -= 20;
							}
							if (local73 == 2) {
								Static105.anInt2510 -= 15;
								Static29.anInt824 -= 10;
							}
							if (local73 == 3) {
								Static29.anInt824 -= 10;
								Static105.anInt2510 += 15;
							}
							Static11.aClass4_Sub4_Sub3_Sub2Array1[local16.anIntArray287[local73]].method912(Static105.anInt2510 + arg3 - 12, Static29.anInt824 + -12 + arg1);
							Static71.aClass4_Sub4_Sub3_Sub4_4.method1729(Static120.method1450(local16.anIntArray285[local73]), Static105.anInt2510 + arg3 - 1, Static29.anInt824 + arg1 - -3, 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(528) int local528 = 0; local528 < Static8.anInt131; local528++) {
			local73 = Static64.anIntArray175[local528];
			@Pc(538) int local538 = Static64.anIntArray176[local528];
			@Pc(542) int local542 = Static64.anIntArray174[local528];
			@Pc(546) int local546 = Static64.anIntArray170[local528];
			@Pc(548) boolean local548 = true;
			while (local548) {
				local548 = false;
				for (@Pc(554) int local554 = 0; local554 < local528; local554++) {
					if (local538 + 2 > -Static64.anIntArray170[local554] + Static64.anIntArray176[local554] && Static64.anIntArray176[local554] + 2 > -local546 + local538 && Static64.anIntArray175[local554] + Static64.anIntArray174[local554] > -local542 + local73 && local73 + local542 > Static64.anIntArray175[local554] - Static64.anIntArray174[local554] && local538 > Static64.anIntArray176[local554] - Static64.anIntArray170[local554]) {
						local548 = true;
						local538 = Static64.anIntArray176[local554] - Static64.anIntArray170[local554];
					}
				}
			}
			Static105.anInt2510 = Static64.anIntArray175[local528];
			Static29.anInt824 = Static64.anIntArray176[local528] = local538;
			@Pc(651) Class60 local651 = Static64.aClass60Array13[local528];
			if (Static37.anInt926 == 0) {
				@Pc(655) int local655 = 16776960;
				if (Static64.anIntArray172[local528] < 6) {
					local655 = Static30.anIntArray65[Static64.anIntArray172[local528]];
				}
				if (Static64.anIntArray172[local528] == 6) {
					local655 = Static87.anInt2044 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static64.anIntArray172[local528] == 7) {
					local655 = Static87.anInt2044 % 20 >= 10 ? 65535 : 255;
				}
				if (Static64.anIntArray172[local528] == 8) {
					local655 = Static87.anInt2044 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(726) int local726;
				if (Static64.anIntArray172[local528] == 9) {
					local726 = 150 - Static64.anIntArray173[local528];
					if (local726 < 50) {
						local655 = local726 * 1280 + 16711680;
					} else if (local726 < 100) {
						local655 = 16776960 + 16384000 - local726 * 327680;
					} else if (local726 < 150) {
						local655 = (local726 - 100) * 5 + 65280;
					}
				}
				if (Static64.anIntArray172[local528] == 10) {
					local726 = 150 - Static64.anIntArray173[local528];
					if (local726 < 50) {
						local655 = local726 * 5 + 16711680;
					} else if (local726 < 100) {
						local655 = 16711935 + 16384000 - local726 * 327680;
					} else if (local726 < 150) {
						local655 = local726 * 327680 + 255 - (local726 - 100) * 5 - 32768000;
					}
				}
				if (Static64.anIntArray172[local528] == 11) {
					local726 = 150 - Static64.anIntArray173[local528];
					if (local726 < 50) {
						local655 = 16777215 - local726 * 327685;
					} else if (local726 < 100) {
						local655 = local726 * 327685 + 65280 - 16384250;
					} else if (local726 < 150) {
						local655 = 32768000 + 16777215 - local726 * 327680;
					}
				}
				if (Static64.anIntArray171[local528] == 0) {
					Static87.aClass4_Sub4_Sub3_Sub4_5.method1729(local651, arg3 + Static105.anInt2510, arg1 - -Static29.anInt824, local655, 0);
				}
				if (Static64.anIntArray171[local528] == 1) {
					Static87.aClass4_Sub4_Sub3_Sub4_5.method1736(local651, Static105.anInt2510 + arg3, arg1 + Static29.anInt824, local655, Static87.anInt2044);
				}
				if (Static64.anIntArray171[local528] == 2) {
					Static87.aClass4_Sub4_Sub3_Sub4_5.method1739(local651, Static105.anInt2510 + arg3, arg1 + Static29.anInt824, local655, Static87.anInt2044);
				}
				if (Static64.anIntArray171[local528] == 3) {
					Static87.aClass4_Sub4_Sub3_Sub4_5.method1733(local651, arg3 + Static105.anInt2510, Static29.anInt824 + arg1, local655, Static87.anInt2044, 150 - Static64.anIntArray173[local528]);
				}
				if (Static64.anIntArray171[local528] == 4) {
					local726 = (150 - Static64.anIntArray173[local528]) * (Static87.aClass4_Sub4_Sub3_Sub4_5.method1743(local651) + 100) / 150;
					Static80.method1722(Static105.anInt2510 + arg3 - 50, arg1, arg3 + Static105.anInt2510 + 50, arg1 + arg0);
					Static87.aClass4_Sub4_Sub3_Sub4_5.method1745(local651, Static105.anInt2510 + arg3 + 50 - local726, arg1 + Static29.anInt824, local655, 0);
					Static80.method1712(arg3, arg1, arg2 + arg3, arg1 + arg0);
				}
				if (Static64.anIntArray171[local528] == 5) {
					local726 = 150 - Static64.anIntArray173[local528];
					Static80.method1722(arg3, arg1 + Static29.anInt824 - Static87.aClass4_Sub4_Sub3_Sub4_5.anInt2387 - 1, arg3 - -arg2, Static29.anInt824 + arg1 + 5);
					@Pc(1056) int local1056 = 0;
					if (local726 < 25) {
						local1056 = local726 - 25;
					} else if (local726 > 125) {
						local1056 = local726 - 125;
					}
					Static87.aClass4_Sub4_Sub3_Sub4_5.method1729(local651, Static105.anInt2510 + arg3, arg1 - (-Static29.anInt824 - local1056), local655, 0);
					Static80.method1712(arg3, arg1, arg2 + arg3, arg1 + arg0);
				}
			} else {
				Static87.aClass4_Sub4_Sub3_Sub4_5.method1729(local651, arg3 + Static105.anInt2510, Static29.anInt824 + arg1, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)V")
	public static void method2080() {
		aClass60_1179 = null;
		aClass60_1180 = null;
		aClass60_1182 = null;
		aClass13_2 = null;
		aClass60_1181 = null;
		aClass60_1183 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)I")
	public static int method2082() {
		return 6;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(Z)V")
	public static void method2083() {
		if (Static71.aClass78_4 != null) {
			Static71.aClass78_4.method2085();
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIB)V")
	public static void method2084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int[] local8 = new int[4];
		@Pc(11) int[] local11 = new int[4];
		local11[0] = arg1;
		local8[0] = arg0;
		@Pc(26) int local26 = 1;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			if (Static63.anIntArray169[local28] != arg1) {
				local11[local26] = Static63.anIntArray169[local28];
				local8[local26] = Static34.anIntArray67[local28];
				local26++;
			}
		}
		Static34.anIntArray67 = local8;
		Static63.anIntArray169 = local11;
		Static24.method473(Static34.anIntArray67, Static32.aClass49Array1, Static63.anIntArray169, Static32.aClass49Array1.length - 1, 0);
	}
}
