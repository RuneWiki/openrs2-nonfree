import java.awt.Graphics;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static1 {

	@OriginalMember(owner = "client!a", name = "b", descriptor = "I")
	public static int anInt2;

	@OriginalMember(owner = "client!a", name = "c", descriptor = "Lclient!b;")
	public static Class7 aClass7_1;

	@OriginalMember(owner = "client!a", name = "d", descriptor = "I")
	public static int anInt3;

	@OriginalMember(owner = "client!a", name = "j", descriptor = "[I")
	public static int[] anIntArray2;

	@OriginalMember(owner = "client!a", name = "p", descriptor = "Lclient!ge;")
	public static Class29_Sub1 aClass29_Sub1_1;

	@OriginalMember(owner = "client!a", name = "f", descriptor = "[I")
	public static int[] anIntArray1 = new int[50];

	@OriginalMember(owner = "client!a", name = "g", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1 = Static63.method1251("invback");

	@OriginalMember(owner = "client!a", name = "n", descriptor = "Lclient!mb;")
	private static Class45 aClass45_5 = Static63.method1251("Please wait 5 minutes before trying again)3");

	@OriginalMember(owner = "client!a", name = "h", descriptor = "Lclient!mb;")
	public static Class45 aClass45_2 = aClass45_5;

	@OriginalMember(owner = "client!a", name = "k", descriptor = "Lclient!mb;")
	private static Class45 aClass45_4 = Static63.method1251("Your account has been disabled)3");

	@OriginalMember(owner = "client!a", name = "i", descriptor = "Lclient!mb;")
	public static Class45 aClass45_3 = aClass45_4;

	@OriginalMember(owner = "client!a", name = "o", descriptor = "I")
	public static int anInt6 = 0;

	@OriginalMember(owner = "client!a", name = "u", descriptor = "Lclient!mb;")
	public static Class45 aClass45_6 = Static63.method1251("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!a", name = "w", descriptor = "I")
	public static int anInt11 = 0;

	@OriginalMember(owner = "client!a", name = "x", descriptor = "Lclient!mb;")
	public static Class45 aClass45_7 = Static63.method1251(" )2> @lre@");

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
	public static void method1() {
		Static10.aFont1 = null;
		Static4.anImage1 = null;
		Static42.aFontMetrics2 = null;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V")
	public static void method2() {
		if (!Static13.aBoolean12) {
			return;
		}
		@Pc(11) Class5_Sub2_Sub8 local11 = Static38.method798(Static34.anInt956, Static56.anInt1695);
		if (local11 != null && local11.anObjectArray7 != null) {
			Static33.method687(0, null, 0, local11.anObjectArray7, 0, local11);
		}
		Static13.aBoolean12 = false;
	}

	@OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
	public static void method3() {
		anIntArray1 = null;
		anIntArray2 = null;
		aClass7_1 = null;
		aClass45_6 = null;
		aClass29_Sub1_1 = null;
		aClass45_7 = null;
		aClass45_5 = null;
		aClass45_4 = null;
		aClass45_1 = null;
		aClass45_2 = null;
		aClass45_3 = null;
	}

	@OriginalMember(owner = "client!a", name = "c", descriptor = "(I)V")
	public static void method4() {
		while (true) {
			if (Static70.aClass5_Sub9_Sub1_3.method1459(Static69.anInt1989) >= 27) {
				@Pc(20) int local20 = Static70.aClass5_Sub9_Sub1_3.method1456(15);
				if (local20 != 32767) {
					@Pc(27) boolean local27 = false;
					if (Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local20] == null) {
						Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local20] = new Class5_Sub2_Sub4_Sub3_Sub2();
						local27 = true;
					}
					@Pc(43) Class5_Sub2_Sub4_Sub3_Sub2 local43 = Static54.aClass5_Sub2_Sub4_Sub3_Sub2Array1[local20];
					Static70.anIntArray297[Static62.anInt1819++] = local20;
					local43.anInt2406 = Static3.anInt94;
					@Pc(59) int local59 = Static70.aClass5_Sub9_Sub1_3.method1456(5);
					@Pc(64) int local64 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
					if (local59 > 15) {
						local59 -= 32;
					}
					if (local64 == 1) {
						Static104.anIntArray425[Static79.anInt2240++] = local20;
					}
					local43.aClass5_Sub2_Sub17_1 = Static63.method1254(Static70.aClass5_Sub9_Sub1_3.method1456(13));
					@Pc(94) int local94 = Static70.aClass5_Sub9_Sub1_3.method1456(1);
					@Pc(101) int local101 = Static3.anIntArray14[Static70.aClass5_Sub9_Sub1_3.method1456(3)];
					if (local27) {
						local43.anInt2407 = local101;
					}
					@Pc(111) int local111 = Static70.aClass5_Sub9_Sub1_3.method1456(5);
					local43.anInt2380 = local43.aClass5_Sub2_Sub17_1.anInt3063;
					local43.anInt2413 = local43.aClass5_Sub2_Sub17_1.anInt3060;
					local43.anInt2421 = local43.aClass5_Sub2_Sub17_1.anInt3068;
					local43.anInt2412 = local43.aClass5_Sub2_Sub17_1.anInt3072;
					local43.anInt2426 = local43.aClass5_Sub2_Sub17_1.anInt3059;
					local43.anInt2437 = local43.aClass5_Sub2_Sub17_1.anInt3073;
					local43.anInt2415 = local43.aClass5_Sub2_Sub17_1.anInt3082;
					local43.anInt2435 = local43.aClass5_Sub2_Sub17_1.anInt3076;
					local43.anInt2440 = local43.aClass5_Sub2_Sub17_1.anInt3057;
					if (local43.anInt2415 == 0) {
						local43.anInt2407 = 0;
					}
					if (local111 > 15) {
						local111 -= 32;
					}
					local43.method1622(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0] + local111, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0] - -local59, local94 == 1);
					continue;
				}
			}
			Static70.aClass5_Sub9_Sub1_3.method1464();
			return;
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IILclient!sd;)Z")
	public static boolean method5(@OriginalArg(1) int arg0, @OriginalArg(2) Class29 arg1) {
		@Pc(13) byte[] local13 = arg1.method745(arg0);
		if (local13 == null) {
			return false;
		} else {
			Static84.method1593(local13);
			return true;
		}
	}

	@OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
	public static void method6() {
		if (Static78.anInt2212 > 0) {
			Static78.anInt2212--;
		}
		if (Static53.anInt2368 > 1) {
			Static53.anInt2368--;
		}
		if (Static47.aBoolean72) {
			Static47.aBoolean72 = false;
			Static6.method114();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static100.method1840(); local29++) {
		}
		if (Static121.anInt2385 != 30 && Static121.anInt2385 != 35) {
			return;
		}
		if (Static21.aBoolean31 && Static121.anInt2385 == 30) {
			Static108.anInt2830 = 0;
			Static28.anInt881 = 0;
			while (Static117.method2126()) {
			}
			for (@Pc(68) int local68 = 0; local68 < Static7.aBooleanArray1.length; local68++) {
				Static7.aBooleanArray1[local68] = false;
			}
		}
		Static105.method1909(Static64.aClass5_Sub9_Sub1_2);
		@Pc(90) Object local90 = Static68.aClass1_1.anObject1;
		@Pc(117) int local117;
		@Pc(114) int local114;
		@Pc(119) int local119;
		@Pc(154) int local154;
		synchronized (Static68.aClass1_1.anObject1) {
			if (!Static14.aBoolean14) {
				Static68.aClass1_1.anInt13 = 0;
			} else if (Static28.anInt881 != 0 || Static68.aClass1_1.anInt13 >= 40) {
				Static64.aClass5_Sub9_Sub1_2.method1466(239);
				Static64.aClass5_Sub9_Sub1_2.method1428(0);
				local114 = 0;
				local117 = Static64.aClass5_Sub9_Sub1_2.anInt2140;
				@Pc(133) int local133;
				for (local119 = 0; Static68.aClass1_1.anInt13 > local119 && Static64.aClass5_Sub9_Sub1_2.anInt2140 - local117 < 240; local119++) {
					local114++;
					local133 = Static68.aClass1_1.anIntArray3[local119];
					if (local133 < 0) {
						local133 = 0;
					} else if (local133 > 502) {
						local133 = 502;
					}
					local154 = Static68.aClass1_1.anIntArray4[local119];
					if (local154 < 0) {
						local154 = 0;
					} else if (local154 > 764) {
						local154 = 764;
					}
					@Pc(174) int local174 = local154 + local133 * 765;
					if (Static68.aClass1_1.anIntArray3[local119] == -1 && Static68.aClass1_1.anIntArray4[local119] == -1) {
						local154 = -1;
						local174 = 524287;
						local133 = -1;
					}
					if (Static9.anInt341 != local154 || Static68.anInt1960 != local133) {
						@Pc(217) int local217 = local133 - Static68.anInt1960;
						@Pc(222) int local222 = local154 - Static9.anInt341;
						Static9.anInt341 = local154;
						Static68.anInt1960 = local133;
						if (Static34.anInt952 < 8 && local222 >= -32 && local222 <= 31 && local217 >= -32 && local217 <= 31) {
							local217 += 32;
							local222 += 32;
							Static64.aClass5_Sub9_Sub1_2.method1455((Static34.anInt952 << 12) + (local222 << 6) + local217);
							Static34.anInt952 = 0;
						} else if (Static34.anInt952 < 8) {
							Static64.aClass5_Sub9_Sub1_2.method1421(local174 + (Static34.anInt952 << 19) + 8388608);
							Static34.anInt952 = 0;
						} else {
							Static64.aClass5_Sub9_Sub1_2.method1413(local174 + (Static34.anInt952 << 19) - 1073741824);
							Static34.anInt952 = 0;
						}
					} else if (Static34.anInt952 < 2047) {
						Static34.anInt952++;
					}
				}
				Static64.aClass5_Sub9_Sub1_2.method1440(Static64.aClass5_Sub9_Sub1_2.anInt2140 - local117);
				if (local114 < Static68.aClass1_1.anInt13) {
					Static68.aClass1_1.anInt13 -= local114;
					for (local133 = 0; local133 < Static68.aClass1_1.anInt13; local133++) {
						Static68.aClass1_1.anIntArray4[local133] = Static68.aClass1_1.anIntArray4[local133 + local114];
						Static68.aClass1_1.anIntArray3[local133] = Static68.aClass1_1.anIntArray3[local114 + local133];
					}
				} else {
					Static68.aClass1_1.anInt13 = 0;
				}
			}
		}
		if (Static28.anInt881 != 0) {
			@Pc(384) long local384 = (Static34.aLong58 - Static10.aLong24) / 50L;
			if (local384 > 4095L) {
				local384 = 4095L;
			}
			Static10.aLong24 = Static34.aLong58;
			local117 = Static36.anInt1063;
			if (local117 < 0) {
				local117 = 0;
			} else if (local117 > 502) {
				local117 = 502;
			}
			local154 = (int) local384;
			local114 = Static67.anInt1906;
			if (local114 < 0) {
				local114 = 0;
			} else if (local114 > 764) {
				local114 = 764;
			}
			local119 = local117 * 765 + local114;
			@Pc(439) byte local439 = 0;
			if (Static28.anInt881 == 2) {
				local439 = 1;
			}
			Static64.aClass5_Sub9_Sub1_2.method1466(227);
			Static64.aClass5_Sub9_Sub1_2.method1424((local439 << 19) + (local154 << 20) + local119);
		}
		if (Static122.anInt3141 > 0) {
			Static122.anInt3141--;
		}
		if (Static7.aBooleanArray1[96] || Static7.aBooleanArray1[97] || Static7.aBooleanArray1[98] || Static7.aBooleanArray1[99]) {
			Static64.aBoolean90 = true;
		}
		if (Static64.aBoolean90 && Static122.anInt3141 <= 0) {
			Static122.anInt3141 = 20;
			Static64.aBoolean90 = false;
			Static64.aClass5_Sub9_Sub1_2.method1466(174);
			Static64.aClass5_Sub9_Sub1_2.method1430(Static112.anInt2981);
			Static64.aClass5_Sub9_Sub1_2.method1399(Static102.anInt2755);
		}
		if (Static88.aBoolean115 && !Static53.aBoolean108) {
			Static53.aBoolean108 = true;
			Static64.aClass5_Sub9_Sub1_2.method1466(207);
			Static64.aClass5_Sub9_Sub1_2.method1428(1);
		}
		if (!Static88.aBoolean115 && Static53.aBoolean108) {
			Static53.aBoolean108 = false;
			Static64.aClass5_Sub9_Sub1_2.method1466(207);
			Static64.aClass5_Sub9_Sub1_2.method1428(0);
		}
		Static21.method440();
		if (Static121.anInt2385 != 30 && Static121.anInt2385 != 35) {
			return;
		}
		Static105.method1907();
		Static102.method1890();
		Static59.anInt1778++;
		if (Static59.anInt1778 > 750) {
			Static6.method114();
			return;
		}
		Static8.method170();
		Static11.method236();
		Static12.method2142();
		if (Static68.anInt1957 != 0) {
			Static27.anInt848 += 20;
			if (Static27.anInt848 >= 400) {
				Static68.anInt1957 = 0;
			}
		}
		if (Static28.anInt879 != 0) {
			Static78.anInt2204++;
			if (Static78.anInt2204 >= 15) {
				if (Static28.anInt879 == 2) {
					Static72.aBoolean99 = true;
				}
				if (Static28.anInt879 == 3) {
					Static51.aBoolean81 = true;
				}
				Static28.anInt879 = 0;
			}
		}
		Static90.anInt2533++;
		if (Static96.anInt2617 != 0) {
			if (Static14.anInt425 > Static100.anInt2686 + 5 || Static100.anInt2686 - 5 > Static14.anInt425 || Static47.anInt1354 > Static119.anInt3088 + 5 || Static119.anInt3088 - 5 > Static47.anInt1354) {
				Static37.aBoolean55 = true;
			}
			Static100.anInt2701++;
			if (Static108.anInt2830 == 0) {
				if (Static96.anInt2617 == 2) {
					Static72.aBoolean99 = true;
				}
				if (Static96.anInt2617 == 3) {
					Static51.aBoolean81 = true;
				}
				Static96.anInt2617 = 0;
				if (Static37.aBoolean55 && Static100.anInt2701 >= 5) {
					Static103.anInt2765 = -1;
					Static37.method788();
					if (Static50.anInt1603 == Static103.anInt2765 && Static84.anInt2334 != Static70.anInt2022) {
						@Pc(724) Class5_Sub2_Sub8 local724 = Static80.method1507(Static50.anInt1603);
						@Pc(726) byte local726 = 0;
						if (Static54.anInt1636 == 1 && local724.anInt1267 == 206) {
							local726 = 1;
						}
						if (local724.anIntArray201[Static84.anInt2334] <= 0) {
							local726 = 0;
						}
						if (Static74.method1699(Static74.method1700(local724))) {
							local117 = Static70.anInt2022;
							local114 = Static84.anInt2334;
							local724.anIntArray201[local114] = local724.anIntArray201[local117];
							local724.anIntArray208[local114] = local724.anIntArray208[local117];
							local724.anIntArray201[local117] = -1;
							local724.anIntArray208[local117] = 0;
						} else if (local726 == 1) {
							local114 = Static84.anInt2334;
							local117 = Static70.anInt2022;
							while (local114 != local117) {
								if (local117 > local114) {
									local724.method948(local117, local117 - 1);
									local117--;
								} else if (local117 < local114) {
									local724.method948(local117, local117 + 1);
									local117++;
								}
							}
						} else {
							local724.method948(Static70.anInt2022, Static84.anInt2334);
						}
						Static64.aClass5_Sub9_Sub1_2.method1466(187);
						Static64.aClass5_Sub9_Sub1_2.method1398(Static50.anInt1603);
						Static64.aClass5_Sub9_Sub1_2.method1399(Static70.anInt2022);
						Static64.aClass5_Sub9_Sub1_2.method1420(local726);
						Static64.aClass5_Sub9_Sub1_2.method1432(Static84.anInt2334);
					}
				} else if ((Static75.anInt2180 == 1 || Static5.method77(Static14.anInt426 - 1)) && Static14.anInt426 > 2) {
					Static97.method1807();
				} else if (Static14.anInt426 > 0) {
					Static34.method689(Static14.anInt426 - 1);
				}
				Static28.anInt881 = 0;
				Static78.anInt2204 = 10;
			}
		}
		if (Static101.anInt1036 == -1) {
			if (Static63.anInt1837 != -1) {
				Static7.method141(4, 338, Static63.anInt1837, 516, 34, 4);
			} else if (Static16.anInt514 != -1) {
				Static7.method141(4, 338, Static16.anInt514, 516, 34, 4);
			}
			if (Static72.anInt2162 != -1) {
				Static7.method141(205, 466, Static72.anInt2162, 743, 34, 553);
			} else if (Static57.anIntArray262[Static53.anInt2372] != -1) {
				Static7.method141(205, 466, Static57.anIntArray262[Static53.anInt2372], 743, 34, 553);
			}
			if (Static67.anInt1909 != -1) {
				Static7.method141(357, 453, Static67.anInt1909, 496, 34, 17);
			} else if (Static100.anInt2693 != -1) {
				Static7.method141(357, 453, Static100.anInt2693, 496, 34, 17);
			}
		} else {
			Static7.method141(0, 503, Static101.anInt1036, 765, 34, 0);
			if (Static38.anInt1088 != -1) {
				Static7.method141(0, 503, Static38.anInt1088, 765, 34, 0);
			}
		}
		if (Static101.anInt1036 == -1) {
			if (Static63.anInt1837 != -1) {
				Static7.method141(4, 338, Static63.anInt1837, 516, -35, 4);
			} else if (Static16.anInt514 != -1) {
				Static7.method141(4, 338, Static16.anInt514, 516, -35, 4);
			}
			if (Static72.anInt2162 != -1) {
				Static7.method141(205, 466, Static72.anInt2162, 743, -35, 553);
			} else if (Static57.anIntArray262[Static53.anInt2372] != -1) {
				Static7.method141(205, 466, Static57.anIntArray262[Static53.anInt2372], 743, -35, 553);
			}
			if (Static67.anInt1909 != -1) {
				Static7.method141(357, 453, Static67.anInt1909, 496, -35, 17);
			} else if (Static100.anInt2693 != -1) {
				Static7.method141(357, 453, Static100.anInt2693, 496, -35, 17);
			}
		} else {
			Static7.method141(0, 503, Static101.anInt1036, 765, -35, 0);
			if (Static38.anInt1088 != -1) {
				Static7.method141(0, 503, Static38.anInt1088, 765, -35, 0);
			}
		}
		Static63.method1256();
		@Pc(1127) int local1127;
		if (Static43.anInt1201 != -1) {
			local117 = Static43.anInt1203;
			local1127 = Static43.anInt1201;
			@Pc(1149) boolean local1149 = Static11.method238(Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray350[0], 0, Static31.aClass5_Sub2_Sub4_Sub3_Sub1_1.anIntArray349[0], 0, 0, local1127, 0, 0, 0, local117, true);
			if (local1149) {
				Static88.anInt2499 = Static36.anInt1063;
				Static4.anInt102 = Static67.anInt1906;
				Static68.anInt1957 = 1;
				Static27.anInt848 = 0;
			}
			Static43.anInt1201 = -1;
		}
		if (Static28.anInt881 == 1 && Static53.aClass45_1006 != null) {
			Static51.aBoolean81 = true;
			Static53.aClass45_1006 = null;
			Static28.anInt881 = 0;
		}
		Static97.method1804();
		if (Static101.anInt1036 == -1) {
			Static60.method1221();
			Static87.method1683();
			Static17.method320();
		}
		if (Static108.anInt2830 == 1 || Static28.anInt881 == 1) {
			Static108.anInt2839++;
		}
		if (Static111.anInt2905 == -1 && Static32.anInt943 == -1 && Static27.anInt858 == -1) {
			if (Static57.anInt1707 > 0) {
				Static57.anInt1707--;
			}
		} else if (Static53.anInt2376 > Static57.anInt1707) {
			Static57.anInt1707++;
			if (Static57.anInt1707 == Static53.anInt2376) {
				if (Static111.anInt2905 != -1) {
					Static51.aBoolean81 = true;
				}
				if (Static32.anInt943 != -1) {
					Static72.aBoolean99 = true;
				}
			}
		}
		Static109.method1967();
		if (Static114.aBoolean131) {
			Static106.method1921();
		}
		for (local1127 = 0; local1127 < 5; local1127++) {
			@Pc(1259) int local1259 = Static99.anIntArray403[local1127]++;
		}
		Static6.method115();
		local117 = Static101.method754();
		local114 = Static46.method974();
		if (local117 > 4500 && local114 > 4500) {
			Static78.anInt2212 = 250;
			Static23.method542(4000);
			Static64.aClass5_Sub9_Sub1_2.method1466(144);
		}
		Static48.anInt1590++;
		Static78.anInt2215++;
		Static107.anInt2797++;
		if (Static107.anInt2797 > 500) {
			Static107.anInt2797 = 0;
			local119 = (int) (Math.random() * 8.0D);
			if ((local119 & 0x1) == 1) {
				Static91.anInt2541 += Static11.anInt380;
			}
			if ((local119 & 0x2) == 2) {
				Static109.anInt2871 += Static102.anInt2751;
			}
			if ((local119 & 0x4) == 4) {
				Static76.anInt2191 += Static55.anInt1677;
			}
		}
		if (Static76.anInt2191 < -40) {
			Static55.anInt1677 = 1;
		}
		if (Static76.anInt2191 > 40) {
			Static55.anInt1677 = -1;
		}
		if (Static109.anInt2871 < -55) {
			Static102.anInt2751 = 2;
		}
		if (Static91.anInt2541 < -50) {
			Static11.anInt380 = 2;
		}
		if (Static91.anInt2541 > 50) {
			Static11.anInt380 = -2;
		}
		if (Static48.anInt1590 > 500) {
			Static48.anInt1590 = 0;
			local119 = (int) (Math.random() * 8.0D);
			if ((local119 & 0x1) == 1) {
				Static100.anInt2699 += Static70.anInt2028;
			}
			if ((local119 & 0x2) == 2) {
				Static4.anInt98 += Static64.anInt1856;
			}
		}
		if (Static100.anInt2699 < -60) {
			Static70.anInt2028 = 2;
		}
		if (Static4.anInt98 < -20) {
			Static64.anInt1856 = 1;
		}
		if (Static109.anInt2871 > 55) {
			Static102.anInt2751 = -2;
		}
		if (Static100.anInt2699 > 60) {
			Static70.anInt2028 = -2;
		}
		if (Static4.anInt98 > 10) {
			Static64.anInt1856 = -1;
		}
		if (Static78.anInt2215 > 50) {
			Static64.aClass5_Sub9_Sub1_2.method1466(229);
		}
		try {
			if (Static104.aClass7_3 != null && Static64.aClass5_Sub9_Sub1_2.anInt2140 > 0) {
				Static104.aClass7_3.method80(Static64.aClass5_Sub9_Sub1_2.anInt2140, Static64.aClass5_Sub9_Sub1_2.aByteArray28);
				Static78.anInt2215 = 0;
				Static64.aClass5_Sub9_Sub1_2.anInt2140 = 0;
			}
		} catch (@Pc(1477) IOException local1477) {
			Static6.method114();
		}
	}

	@OriginalMember(owner = "client!a", name = "e", descriptor = "(I)V")
	public static void method7() {
		try {
			@Pc(6) Graphics local6 = Static75.aCanvas1.getGraphics();
			Static100.aClass11_110.method2148(local6, 0, 4);
			Static90.aClass11_102.method2148(local6, 0, 357);
			Static14.aClass11_21.method2148(local6, 722, 4);
			Static68.aClass11_82.method2148(local6, 743, 205);
			Static112.aClass11_129.method2148(local6, 0, 0);
			Static51.aClass11_67.method2148(local6, 516, 4);
			Static90.aClass11_101.method2148(local6, 516, 205);
			Static110.aClass11_124.method2148(local6, 496, 357);
			Static39.aClass11_89.method2148(local6, 0, 338);
		} catch (@Pc(77) Exception local77) {
			Static75.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(ZI)Z")
	public static boolean method8(@OriginalArg(1) int arg0) {
		if (arg0 >= 97 && arg0 <= 122) {
			return true;
		} else if (arg0 >= 65 && arg0 <= 90) {
			return true;
		} else {
			return arg0 >= 48 && arg0 <= 57;
		}
	}
}
