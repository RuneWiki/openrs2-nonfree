import java.awt.Graphics;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!n", name = "w", descriptor = "Z")
	public static boolean aBoolean94;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "Lclient!ke;")
	public static Class39 aClass39_847 = Static2.method66("k");

	@OriginalMember(owner = "client!n", name = "z", descriptor = "I")
	public static int anInt1920 = 0;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "Lclient!ke;")
	public static Class39 aClass39_848 = Static2.method66("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!n", name = "J", descriptor = "[Lclient!rb;")
	public static Class56[] aClass56Array1 = new Class56[50];

	@OriginalMember(owner = "client!n", name = "S", descriptor = "Lclient!ke;")
	private static Class39 aClass39_851 = Static2.method66("To play on this world move to a free area first");

	@OriginalMember(owner = "client!n", name = "P", descriptor = "Lclient!ke;")
	public static Class39 aClass39_849 = aClass39_851;

	@OriginalMember(owner = "client!n", name = "R", descriptor = "Lclient!ke;")
	public static Class39 aClass39_850 = Static2.method66("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public static void method1373() {
		Static69.anImage1 = null;
		Static104.aFontMetrics1 = null;
		Static76.aFont1 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!ec;)Z")
	public static boolean method1374(@OriginalArg(1) Class2_Sub1_Sub6 arg0) {
		@Pc(10) int local10 = arg0.anInt722;
		if (Static18.anInt526 == 2) {
			if (local10 == 201) {
				Static86.aClass39_1052 = Static78.aClass39_964;
				Static86.aClass39_1056 = Static86.aClass39_1048;
				Static50.anInt1402 = 1;
				Static97.anInt2646 = 0;
				Static31.aBoolean91 = true;
				Static7.aBoolean5 = true;
			}
			if (local10 == 202) {
				Static50.anInt1402 = 2;
				Static7.aBoolean5 = true;
				Static31.aBoolean91 = true;
				Static86.aClass39_1056 = Static86.aClass39_1048;
				Static86.aClass39_1052 = Static80.aClass39_986;
				Static97.anInt2646 = 0;
			}
		}
		if (local10 == 205) {
			Static20.anInt587 = 250;
			return true;
		}
		if (local10 == 501) {
			Static86.aClass39_1056 = Static86.aClass39_1048;
			Static86.aClass39_1052 = Static85.aClass39_1042;
			Static7.aBoolean5 = true;
			Static50.anInt1402 = 4;
			Static97.anInt2646 = 0;
			Static31.aBoolean91 = true;
		}
		if (local10 == 502) {
			Static7.aBoolean5 = true;
			Static31.aBoolean91 = true;
			Static50.anInt1402 = 5;
			Static86.aClass39_1052 = Static81.aClass39_994;
			Static86.aClass39_1056 = Static86.aClass39_1048;
			Static97.anInt2646 = 0;
		}
		@Pc(104) int local104;
		@Pc(108) int local108;
		if (local10 >= 300 && local10 <= 313) {
			local104 = (local10 - 300) / 2;
			local108 = local10 & 0x1;
			Static28.aClass35_1.method923(local104, local108 == 1);
		}
		if (local10 >= 314 && local10 <= 323) {
			local104 = (local10 - 314) / 2;
			local108 = local10 & 0x1;
			Static28.aClass35_1.method921(local104, local108 == 1);
		}
		if (local10 == 324) {
			Static28.aClass35_1.method920(false);
		}
		if (local10 == 325) {
			Static28.aClass35_1.method920(true);
		}
		if (local10 == 326) {
			Static50.aClass2_Sub5_Sub1_2.method1302(173);
			Static28.aClass35_1.method914(Static50.aClass2_Sub5_Sub1_2);
			return true;
		}
		if (local10 == 620) {
			Static67.aBoolean96 = !Static67.aBoolean96;
		}
		if (local10 >= 601 && local10 <= 613) {
			Static12.method257();
			if (Static86.aClass39_1050.method1088() > 0) {
				Static50.aClass2_Sub5_Sub1_2.method1302(168);
				Static50.aClass2_Sub5_Sub1_2.method1270(Static86.aClass39_1050.method1090());
				Static50.aClass2_Sub5_Sub1_2.method1252(local10 - 601);
				Static50.aClass2_Sub5_Sub1_2.method1252(Static67.aBoolean96 ? 1 : 0);
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BIILclient!jd;)Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 method1375(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class36 arg2) {
		return Static84.method2047(arg1, arg2, arg0) ? Static21.method1875() : null;
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(B)Z")
	public static boolean method1376() {
		return Static78.aClass11_1 != null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BLclient!ec;I)I")
	public static int method1377(@OriginalArg(1) Class2_Sub1_Sub6 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray7 == null || arg1 >= arg0.anIntArrayArray7.length) {
			return -2;
		}
		try {
			@Pc(23) int[] local23 = arg0.anIntArrayArray7[arg1];
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			@Pc(29) byte local29 = 0;
			while (true) {
				@Pc(34) int local34 = local23[local27++];
				@Pc(36) int local36 = 0;
				@Pc(38) byte local38 = 0;
				if (local34 == 0) {
					return local25;
				}
				if (local34 == 15) {
					local38 = 1;
				}
				if (local34 == 16) {
					local38 = 2;
				}
				if (local34 == 17) {
					local38 = 3;
				}
				if (local34 == 1) {
					local36 = Static46.anIntArray178[local23[local27++]];
				}
				if (local34 == 2) {
					local36 = Static20.anIntArray65[local23[local27++]];
				}
				if (local34 == 3) {
					local36 = Static105.anIntArray351[local23[local27++]];
				}
				@Pc(102) int local102;
				@Pc(113) Class2_Sub1_Sub6 local113;
				@Pc(118) int local118;
				@Pc(130) int local130;
				if (local34 == 4) {
					local102 = local23[local27++] << 16;
					@Pc(109) int local109 = local102 + local23[local27++];
					local113 = Static90.method1705(local109);
					local118 = local23[local27++];
					if (local118 != -1 && (!method1384(local118).aBoolean69 || Static24.aBoolean40)) {
						for (local130 = 0; local130 < local113.anIntArray75.length; local130++) {
							if (local113.anIntArray75[local130] == local118 + 1) {
								local36 += local113.anIntArray78[local130];
							}
						}
					}
				}
				if (local34 == 5) {
					local36 = Static28.anIntArray89[local23[local27++]];
				}
				if (local34 == 6) {
					local36 = Class55.anIntArray300[Static20.anIntArray65[local23[local27++]] - 1];
				}
				if (local34 == 7) {
					local36 = Static28.anIntArray89[local23[local27++]] * 100 / 46875;
				}
				if (local34 == 8) {
					local36 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2628;
				}
				if (local34 == 9) {
					for (local102 = 0; local102 < 25; local102++) {
						if (Static105.aBooleanArray15[local102]) {
							local36 += Static20.anIntArray65[local102];
						}
					}
				}
				if (local34 == 10) {
					local102 = local23[local27++] << 16;
					local102 += local23[local27++];
					local113 = Static90.method1705(local102);
					local118 = local23[local27++];
					if (local118 != -1 && (!method1384(local118).aBoolean69 || Static24.aBoolean40)) {
						for (local130 = 0; local130 < local113.anIntArray75.length; local130++) {
							if (local118 + 1 == local113.anIntArray75[local130]) {
								local36 = 999999999;
								break;
							}
						}
					}
				}
				if (local34 == 11) {
					local36 = Static47.anInt1329;
				}
				if (local34 == 12) {
					local36 = Static4.anInt96;
				}
				if (local34 == 13) {
					local102 = Static28.anIntArray89[local23[local27++]];
					@Pc(311) int local311 = local23[local27++];
					local36 = (local102 & 0x1 << local311) == 0 ? 0 : 1;
				}
				if (local34 == 14) {
					local102 = local23[local27++];
					local36 = Static92.method1723(local102);
				}
				if (local34 == 18) {
					local36 = Static19.anInt575 + (Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 >> 7);
				}
				if (local34 == 19) {
					local36 = (Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 >> 7) + Static75.anInt454;
				}
				if (local34 == 20) {
					local36 = local23[local27++];
				}
				if (local38 == 0) {
					if (local29 == 0) {
						local25 += local36;
					}
					if (local29 == 1) {
						local25 -= local36;
					}
					if (local29 == 2 && local36 != 0) {
						local25 /= local36;
					}
					if (local29 == 3) {
						local25 *= local36;
					}
					local29 = 0;
				} else {
					local29 = local38;
				}
			}
		} catch (@Pc(421) Exception local421) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILclient!tc;)V")
	public static void method1378(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class2_Sub1_Sub2_Sub3_Sub1 arg3) {
		if (arg3 == Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1 || Static101.anInt2753 >= 400) {
			return;
		}
		@Pc(50) Class39 local50;
		if (arg3.anInt2641 == 0) {
			local50 = Static20.method431(new Class39[] { arg3.aClass39_1182, Static48.method913(Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2628, arg3.anInt2628), Static19.aClass39_284, Static41.aClass39_524, Static31.method1267(arg3.anInt2628), Static38.aClass39_497 });
		} else {
			local50 = Static20.method431(new Class39[] { arg3.aClass39_1182, Static19.aClass39_284, Static100.aClass39_1246, Static31.method1267(arg3.anInt2641), Static38.aClass39_497 });
		}
		@Pc(134) int local134;
		if (Static16.anInt461 == 1) {
			Static84.method2048(arg0, Static76.aClass39_936, Static20.method431(new Class39[] { Static87.aClass39_1062, Static100.aClass39_1251, local50 }), 45, arg1, arg2);
		} else if (Static87.anInt2324 != 1) {
			for (local134 = 4; local134 >= 0; local134--) {
				if (Static100.aClass39Array14[local134] != null) {
					@Pc(146) short local146 = 0;
					@Pc(148) int local148 = 0;
					if (Static100.aClass39Array14[local134].method1106(Static42.aClass39_535)) {
						if (arg3.anInt2628 > Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2628) {
							local146 = 2000;
						}
						if (Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2636 != 0 && arg3.anInt2636 != 0) {
							if (Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2636 == arg3.anInt2636) {
								local146 = 2000;
							} else {
								local146 = 0;
							}
						}
					} else if (Static58.aBooleanArray11[local134]) {
						local146 = 2000;
					}
					if (local134 == 0) {
						local148 = local146 + 56;
					}
					if (local134 == 1) {
						local148 = local146 + 16;
					}
					if (local134 == 2) {
						local148 = local146 + 41;
					}
					if (local134 == 3) {
						local148 = local146 + 26;
					}
					if (local134 == 4) {
						local148 = local146 + 44;
					}
					Static84.method2048(arg0, Static100.aClass39Array14[local134], Static20.method431(new Class39[] { Static79.aClass39_1261, local50 }), local148, arg1, arg2);
				}
			}
		} else if ((Static39.anInt1170 & 0x8) == 8) {
			Static84.method2048(arg0, Static23.aClass39_304, Static20.method431(new Class39[] { Static41.aClass39_516, Static100.aClass39_1251, local50 }), 5, arg1, arg2);
		}
		for (local134 = 0; local134 < Static101.anInt2753; local134++) {
			if (Static21.anIntArray326[local134] == 20) {
				Static26.aClass39Array7[local134] = Static20.method431(new Class39[] { Static26.aClass39_365, Static107.aClass39_1194, Static79.aClass39_1261, local50 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
	public static void method1379() {
		aClass39_847 = null;
		aClass56Array1 = null;
		aClass39_849 = null;
		aClass39_851 = null;
		aClass39_848 = null;
		aClass39_850 = null;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)V")
	public static void method1380() {
		try {
			if (Static108.anInt2946 == 0) {
				if (Static85.aClass10_3 != null) {
					Static85.aClass10_3.method251();
					Static85.aClass10_3 = null;
				}
				Static40.aClass19_6 = null;
				Static108.anInt2946 = 1;
				Static46.aBoolean67 = false;
				Static87.anInt2327 = 0;
			}
			if (Static108.anInt2946 == 1) {
				if (Static40.aClass19_6 == null) {
					Static40.aClass19_6 = Static61.aClass12_3.method322(Static95.anInt2515);
				}
				if (Static40.aClass19_6.anInt799 == 2) {
					throw new IOException();
				}
				if (Static40.aClass19_6.anInt799 == 1) {
					Static85.aClass10_3 = new Class10((Socket) Static40.aClass19_6.anObject3, Static61.aClass12_3);
					Static108.anInt2946 = 2;
					Static40.aClass19_6 = null;
				}
			}
			if (Static108.anInt2946 == 2) {
				@Pc(74) long local74 = Static63.aLong49 = Static22.aClass39_294.method1090();
				Static50.aClass2_Sub5_Sub1_2.anInt1772 = 0;
				Static50.aClass2_Sub5_Sub1_2.method1252(14);
				@Pc(88) int local88 = (int) (local74 >> 16 & 0x1FL);
				Static50.aClass2_Sub5_Sub1_2.method1252(local88);
				Static85.aClass10_3.method260(2, Static50.aClass2_Sub5_Sub1_2.aByteArray16);
				Static108.anInt2946 = 3;
				Static51.aClass2_Sub5_Sub1_4.anInt1772 = 0;
			}
			@Pc(117) int local117;
			if (Static108.anInt2946 == 3) {
				local117 = Static85.aClass10_3.method254();
				if (local117 != 0) {
					Static75.method363(local117);
					return;
				}
				Static51.aClass2_Sub5_Sub1_4.anInt1772 = 0;
				Static108.anInt2946 = 4;
			}
			if (Static108.anInt2946 == 4) {
				if (Static51.aClass2_Sub5_Sub1_4.anInt1772 < 8) {
					local117 = Static85.aClass10_3.method259();
					if (8 - Static51.aClass2_Sub5_Sub1_4.anInt1772 < local117) {
						local117 = 8 - Static51.aClass2_Sub5_Sub1_4.anInt1772;
					}
					if (local117 > 0) {
						Static85.aClass10_3.method261(Static51.aClass2_Sub5_Sub1_4.aByteArray16, local117, Static51.aClass2_Sub5_Sub1_4.anInt1772);
						Static51.aClass2_Sub5_Sub1_4.anInt1772 += local117;
					}
				}
				if (Static51.aClass2_Sub5_Sub1_4.anInt1772 == 8) {
					Static51.aClass2_Sub5_Sub1_4.anInt1772 = 0;
					Static61.aLong46 = Static51.aClass2_Sub5_Sub1_4.method1291();
					Static108.anInt2946 = 5;
				}
			}
			if (Static108.anInt2946 == 5) {
				@Pc(195) int[] local195 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (Static61.aLong46 >> 32), (int) Static61.aLong46 };
				Static50.aClass2_Sub5_Sub1_2.anInt1772 = 0;
				Static50.aClass2_Sub5_Sub1_2.method1252(10);
				Static50.aClass2_Sub5_Sub1_2.method1298(local195[0]);
				Static50.aClass2_Sub5_Sub1_2.method1298(local195[1]);
				Static50.aClass2_Sub5_Sub1_2.method1298(local195[2]);
				Static50.aClass2_Sub5_Sub1_2.method1298(local195[3]);
				Static50.aClass2_Sub5_Sub1_2.method1298(Static61.aClass12_3.anInt379);
				Static50.aClass2_Sub5_Sub1_2.method1270(Static22.aClass39_294.method1090());
				Static50.aClass2_Sub5_Sub1_2.method1297(Static22.aClass39_290);
				Static50.aClass2_Sub5_Sub1_2.method1259(Static10.aBigInteger1, Static80.aBigInteger2);
				Static12.aClass2_Sub5_Sub1_1.anInt1772 = 0;
				if (Static18.anInt554 == 40) {
					Static12.aClass2_Sub5_Sub1_1.method1252(18);
				} else {
					Static12.aClass2_Sub5_Sub1_1.method1252(16);
				}
				Static12.aClass2_Sub5_Sub1_1.method1252(Static50.aClass2_Sub5_Sub1_2.anInt1772 + 53);
				Static12.aClass2_Sub5_Sub1_1.method1298(418);
				Static12.aClass2_Sub5_Sub1_1.method1252(Static35.aBoolean136 ? 1 : 0);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static18.aClass36_Sub1_4.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static6.aClass36_Sub1_23.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static108.aClass36_Sub1_24.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static99.aClass36_Sub1_22.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static58.aClass36_Sub1_14.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static19.aClass36_Sub1_5.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static50.aClass36_Sub1_12.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static24.aClass36_Sub1_6.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static21.aClass36_Sub1_21.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static47.aClass36_Sub1_10.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static86.aClass36_Sub1_18.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1298(Static49.aClass36_Sub1_11.anInt2449);
				Static12.aClass2_Sub5_Sub1_1.method1272(Static50.aClass2_Sub5_Sub1_2.anInt1772, Static50.aClass2_Sub5_Sub1_2.aByteArray16);
				Static85.aClass10_3.method260(Static12.aClass2_Sub5_Sub1_1.anInt1772, Static12.aClass2_Sub5_Sub1_1.aByteArray16);
				Static50.aClass2_Sub5_Sub1_2.method1301(local195);
				for (@Pc(389) int local389 = 0; local389 < 4; local389++) {
					local195[local389] += 50;
				}
				Static51.aClass2_Sub5_Sub1_4.method1301(local195);
				Static108.anInt2946 = 6;
			}
			if (Static108.anInt2946 == 6 && Static85.aClass10_3.method259() > 0) {
				local117 = Static85.aClass10_3.method254();
				if (local117 == 21 && Static18.anInt554 == 20) {
					Static108.anInt2946 = 7;
				} else if (local117 == 2) {
					Static108.anInt2946 = 9;
				} else if (local117 == 15 && Static18.anInt554 == 40) {
					Static15.method2041();
					return;
				} else if (local117 == 23 && Static86.anInt2305 < 1) {
					Static108.anInt2946 = 0;
					Static86.anInt2305++;
				} else {
					Static75.method363(local117);
					return;
				}
			}
			if (Static108.anInt2946 == 7 && Static85.aClass10_3.method259() > 0) {
				Static89.anInt2352 = Static85.aClass10_3.method254() * 60 + 180;
				Static108.anInt2946 = 8;
			}
			if (Static108.anInt2946 == 8) {
				Static87.anInt2327 = 0;
				Static67.method1404(Static47.aClass39_593, Static97.aClass39_1188, Static20.method431(new Class39[] { Static31.method1267(Static89.anInt2352 / 60), Static72.aClass39_915 }));
				if (--Static89.anInt2352 <= 0) {
					Static108.anInt2946 = 0;
				}
			} else {
				if (Static108.anInt2946 == 9 && Static85.aClass10_3.method259() >= 8) {
					Static77.anInt2111 = Static85.aClass10_3.method254();
					Static95.aBoolean113 = Static85.aClass10_3.method254() == 1;
					Static82.anInt2217 = Static85.aClass10_3.method254();
					Static82.anInt2217 <<= 0x8;
					Static82.anInt2217 += Static85.aClass10_3.method254();
					Static30.anInt840 = Static85.aClass10_3.method254();
					Static85.aClass10_3.method261(Static51.aClass2_Sub5_Sub1_4.aByteArray16, 1, 0);
					Static51.aClass2_Sub5_Sub1_4.anInt1772 = 0;
					Static95.anInt2513 = Static51.aClass2_Sub5_Sub1_4.method1306();
					Static85.aClass10_3.method261(Static51.aClass2_Sub5_Sub1_4.aByteArray16, 2, 0);
					Static51.aClass2_Sub5_Sub1_4.anInt1772 = 0;
					Static48.anInt1342 = Static51.aClass2_Sub5_Sub1_4.method1273();
					Static108.anInt2946 = 10;
				}
				if (Static108.anInt2946 != 10) {
					Static87.anInt2327++;
					if (Static87.anInt2327 > 2000) {
						if (Static86.anInt2305 < 1) {
							Static86.anInt2305++;
							Static108.anInt2946 = 0;
							if (Static57.anInt1653 == Static95.anInt2515) {
								Static95.anInt2515 = Static49.anInt1390;
							} else {
								Static95.anInt2515 = Static57.anInt1653;
							}
						} else {
							Static75.method363(-3);
						}
					}
				} else if (Static85.aClass10_3.method259() >= Static48.anInt1342) {
					Static51.aClass2_Sub5_Sub1_4.anInt1772 = 0;
					Static85.aClass10_3.method261(Static51.aClass2_Sub5_Sub1_4.aByteArray16, Static48.anInt1342, 0);
					Static28.method559();
					Static2.anInt66 = -1;
					Static65.method1360(false);
					Static95.anInt2513 = -1;
				}
			}
		} catch (@Pc(654) IOException local654) {
			if (Static86.anInt2305 < 1) {
				Static86.anInt2305++;
				Static108.anInt2946 = 0;
				if (Static95.anInt2515 == Static57.anInt1653) {
					Static95.anInt2515 = Static49.anInt1390;
				} else {
					Static95.anInt2515 = Static57.anInt1653;
				}
			} else {
				Static75.method363(-2);
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!c;Lclient!c;)V")
	public static void method1381(@OriginalArg(1) Class2_Sub1_Sub4_Sub1 arg0, @OriginalArg(2) Class2_Sub1_Sub4_Sub1 arg1) {
		Static65.aClass51_40.method1970();
		if (Static18.anInt554 == 0 || Static18.anInt554 == 5) {
			arg1.method244(Static69.aClass39_894, 180, 54, 16777215);
			Static91.method2011(28, 62, 304, 34, 9179409);
			Static91.method2011(29, 63, 302, 32, 0);
			Static91.method2013(30, 64, Static20.anInt581 * 3, 30, 9179409);
			Static91.method2013(Static20.anInt581 * 3 + 30, 64, 300 - Static20.anInt581 * 3, 30, 0);
			arg1.method244(Static22.aClass39_298, 180, 85, 16777215);
		}
		@Pc(83) byte local83;
		@Pc(91) int local91;
		if (Static18.anInt554 == 20) {
			Static39.aClass2_Sub1_Sub4_Sub3_7.method1946(0, 0);
			local83 = 40;
			arg1.method238(Static22.aClass39_296, 180, 40, 16776960, true);
			local91 = local83 + 15;
			arg1.method238(Static22.aClass39_288, 180, 55, 16776960, true);
			@Pc(99) int local99 = local91 + 15;
			arg1.method238(Static22.aClass39_291, 180, 70, 16776960, true);
			@Pc(107) int local107 = local99 + 15;
			@Pc(108) int local108 = local107 + 10;
			arg1.method235(Static20.method431(new Class39[] { Static24.aClass39_322, Static22.aClass39_294 }), 90, 95, 16777215, true);
			@Pc(127) int local127 = local108 + 15;
			arg1.method235(Static20.method431(new Class39[] { Static78.aClass39_965, Static22.aClass39_290.method1105() }), 92, 110, 16777215, true);
			@Pc(148) int local148 = local127 + 15;
		}
		if (Static18.anInt554 == 10) {
			Static39.aClass2_Sub1_Sub4_Sub3_7.method1946(0, 0);
			if (Static83.anInt2268 == 0) {
				local83 = 80;
				arg1.method238(Static4.aClass39_47, 180, 80, 16776960, true);
				Static17.aClass2_Sub1_Sub4_Sub3_2.method1946(27, 100);
				arg1.method245(Static96.aClass39_1181, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				local91 = local83 + 30;
				Static17.aClass2_Sub1_Sub4_Sub3_2.method1946(187, 100);
				arg1.method245(Static104.aClass39_1268, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static83.anInt2268 == 2) {
				local83 = 40;
				arg1.method238(Static22.aClass39_296, 180, 40, 16776960, true);
				local91 = local83 + 15;
				arg1.method238(Static22.aClass39_288, 180, 55, 16776960, true);
				local91 += 15;
				arg1.method238(Static22.aClass39_291, 180, 70, 16776960, true);
				local91 += 15;
				local91 += 10;
				arg1.method235(Static20.method431(new Class39[] { Static24.aClass39_322, Static22.aClass39_294, Static55.anInt1551 == 0 & Static64.anInt1889 % 40 < 20 ? Static54.aClass39_662 : Static22.aClass39_295 }), 90, 95, 16777215, true);
				local91 += 15;
				arg1.method235(Static20.method431(new Class39[] { Static78.aClass39_965, Static22.aClass39_290.method1105(), Static55.anInt1551 == 1 & Static64.anInt1889 % 40 < 20 ? Static54.aClass39_662 : Static22.aClass39_295 }), 92, 110, 16777215, true);
				local91 += 15;
				Static17.aClass2_Sub1_Sub4_Sub3_2.method1946(27, 130);
				arg1.method238(Static93.aClass39_1120, 100, 155, 16777215, true);
				Static17.aClass2_Sub1_Sub4_Sub3_2.method1946(187, 130);
				arg1.method238(Static94.aClass39_1137, 260, 155, 16777215, true);
			} else if (Static83.anInt2268 == 3) {
				arg1.method238(Static39.aClass39_508, 180, 40, 16776960, true);
				local83 = 65;
				arg1.method238(Static55.aClass39_691, 180, 65, 16777215, true);
				local91 = local83 + 15;
				arg1.method238(Static57.aClass39_709, 180, 80, 16777215, true);
				local91 += 15;
				arg1.method238(Static101.aClass39_1258, 180, 95, 16777215, true);
				local91 += 15;
				arg1.method238(Static16.aClass39_241, 180, 110, 16777215, true);
				local91 += 15;
				Static17.aClass2_Sub1_Sub4_Sub3_2.method1946(107, 130);
				arg1.method238(Static94.aClass39_1137, 180, 155, 16777215, true);
			}
		}
		Static30.method574();
		try {
			@Pc(467) Graphics local467 = Static7.aCanvas1.getGraphics();
			Static65.aClass51_40.method1967(202, 171, local467);
			Static35.aClass51_62.method1967(0, 0, local467);
			Static48.aClass51_28.method1967(637, 0, local467);
			if (Static5.aBoolean2) {
				Static5.aBoolean2 = false;
				Static23.aClass51_13.method1967(128, 0, local467);
				Static96.aClass51_55.method1967(202, 371, local467);
				Static89.aClass51_47.method1967(0, 265, local467);
				Static97.aClass51_56.method1967(562, 265, local467);
				Static39.aClass51_24.method1967(128, 171, local467);
				Static84.aClass51_61.method1967(562, 171, local467);
			}
		} catch (@Pc(531) Exception local531) {
			Static7.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!g;II)Lclient!ke;")
	public static Class39 method1382(@OriginalArg(0) Class2_Sub5 arg0) {
		try {
			@Pc(12) Class39 local12 = new Class39();
			local12.anInt1601 = arg0.method1258();
			if (local12.anInt1601 > 32767) {
				local12.anInt1601 = 32767;
			}
			local12.aByteArray13 = new byte[local12.anInt1601];
			arg0.anInt1772 += Static19.aClass30_1.method827(arg0.aByteArray16, local12.aByteArray13, local12.anInt1601, 0, arg0.anInt1772);
			return local12;
		} catch (@Pc(49) Exception local49) {
			return Static89.aClass39_1074;
		}
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	public static void method1383() {
		Static94.anInt2479++;
		Static73.method1494(true);
		Static10.method169(true);
		Static73.method1494(false);
		Static10.method169(false);
		Static97.method1855();
		Static21.method1880();
		@Pc(29) int local29;
		@Pc(35) int local35;
		if (!Static87.aBoolean103) {
			local29 = Static107.anInt2653;
			local35 = Static60.anInt1625 + Static101.anInt2748 & 0x7FF;
			if (local29 < Static83.anInt2261 / 256) {
				local29 = Static83.anInt2261 / 256;
			}
			if (Static108.aBooleanArray17[4] && local29 < Static2.anIntArray9[4] + 128) {
				local29 = Static2.anIntArray9[4] + 128;
			}
			Static109.method2080(local29 * 3 + 600, Static10.anInt251, local29, local35, Static45.anInt1238, Static51.method1779(Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896, Static18.anInt560) - 50);
		}
		if (Static87.aBoolean103) {
			local29 = Static23.method448();
		} else {
			local29 = Static90.method1707();
		}
		local35 = Static88.anInt1136;
		@Pc(99) int local99 = Static41.anInt1188;
		@Pc(101) int local101 = Static5.anInt100;
		@Pc(103) int local103 = Static64.anInt1897;
		@Pc(105) int local105 = Static41.anInt1190;
		for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
			if (Static108.aBooleanArray17[local107]) {
				@Pc(156) int local156 = (int) ((double) (Static1.anIntArray1[local107] * 2 + 1) * Math.random() - (double) Static1.anIntArray1[local107] + Math.sin((double) Static69.anIntArray249[local107] / 100.0D * (double) Static6.anIntArray362[local107]) * (double) Static2.anIntArray9[local107]);
				if (local107 == 0) {
					Static88.anInt1136 += local156;
				}
				if (local107 == 4) {
					Static64.anInt1897 += local156;
					if (Static64.anInt1897 < 128) {
						Static64.anInt1897 = 128;
					}
					if (Static64.anInt1897 > 383) {
						Static64.anInt1897 = 383;
					}
				}
				if (local107 == 2) {
					Static41.anInt1188 += local156;
				}
				if (local107 == 1) {
					Static5.anInt100 += local156;
				}
				if (local107 == 3) {
					Static41.anInt1190 = local156 + Static41.anInt1190 & 0x7FF;
				}
			}
		}
		Static38.method814();
		Static32.anInt994 = 0;
		Static32.anInt999 = Static80.anInt2188 - 4;
		Static32.anInt995 = Static45.anInt1237 - 4;
		Static32.aBoolean57 = true;
		Static91.method2012();
		Static77.aClass43_1.method1178(Static88.anInt1136, Static5.anInt100, Static41.anInt1188, Static64.anInt1897, Static41.anInt1190, local29);
		Static77.aClass43_1.method1172();
		Static24.method489();
		Static61.method1235();
		((Class59) Static106.anInterface1_1).method1729(Static17.anInt489);
		Static8.method124();
		if (Static99.aBoolean124 && Static108.method2077() == 0) {
			Static99.aBoolean124 = false;
		}
		if (Static99.aBoolean124) {
			Static38.method814();
			Static91.method2012();
			Static16.method378(null, Static109.aClass39_1339, false);
		}
		Static81.method1568();
		Static64.anInt1897 = local103;
		Static41.anInt1190 = local105;
		Static88.anInt1136 = local35;
		Static5.anInt100 = local101;
		Static41.anInt1188 = local99;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ZI)Lclient!j;")
	public static Class2_Sub1_Sub7 method1384(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub7 local10 = (Class2_Sub1_Sub7) Static7.aClass54_3.method1634((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static29.aClass36_22.method1761(10, arg0);
		local10 = new Class2_Sub1_Sub7();
		local10.anInt1294 = arg0;
		if (local20 != null) {
			local10.method901(new Class2_Sub5(local20));
		}
		local10.method908();
		if (local10.anInt1327 != -1) {
			local10.method904(method1384(local10.anInt1327), method1384(local10.anInt1305));
		}
		if (!Static5.aBoolean3 && local10.aBoolean69) {
			local10.anInt1299 = 0;
			local10.aClass39_588 = Static6.aClass39_1306;
			local10.aClass39Array10 = null;
			local10.aClass39Array9 = null;
		}
		Static7.aClass54_3.method1637((long) arg0, local10);
		return local10;
	}
}
