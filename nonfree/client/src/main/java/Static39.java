import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_7;

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "[I")
	public static int[] anIntArray165;

	@OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
	public static int anInt1169;

	@OriginalMember(owner = "client!hd", name = "p", descriptor = "Lclient!pa;")
	public static Class51 aClass51_24;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "I")
	public static int anInt1170;

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "Lclient!ke;")
	public static Class39 aClass39_502 = Static2.method66("Entfernen");

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "Lclient!qd;")
	public static Class54 aClass54_10 = new Class54(10);

	@OriginalMember(owner = "client!hd", name = "m", descriptor = "I")
	public static int anInt1168 = 0;

	@OriginalMember(owner = "client!hd", name = "n", descriptor = "[I")
	public static int[] anIntArray166 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "Lclient!ke;")
	public static Class39 aClass39_503 = Static2.method66("Ein");

	@OriginalMember(owner = "client!hd", name = "r", descriptor = "Lclient!ke;")
	private static Class39 aClass39_504 = Static2.method66("Malformed login packet)3");

	@OriginalMember(owner = "client!hd", name = "s", descriptor = "Lclient!ke;")
	public static Class39 aClass39_505 = Static2.method66("redstone2");

	@OriginalMember(owner = "client!hd", name = "t", descriptor = "Lclient!ke;")
	public static Class39 aClass39_506 = Static2.method66("Freund hinzuf-Ugen");

	@OriginalMember(owner = "client!hd", name = "u", descriptor = "[I")
	public static int[] anIntArray167 = new int[2048];

	@OriginalMember(owner = "client!hd", name = "v", descriptor = "Lclient!ke;")
	public static Class39 aClass39_507 = aClass39_504;

	@OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
	public static int anInt1172 = 0;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "[[I")
	public static int[][] anIntArrayArray12 = new int[104][104];

	@OriginalMember(owner = "client!hd", name = "C", descriptor = "Lclient!ke;")
	private static Class39 aClass39_509 = Static2.method66("Create a free account");

	@OriginalMember(owner = "client!hd", name = "A", descriptor = "Lclient!ke;")
	public static Class39 aClass39_508 = aClass39_509;

	@OriginalMember(owner = "client!hd", name = "B", descriptor = "Ljava/lang/Object;")
	public static Object anObject4 = new Object();

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	public static void method818() {
		aClass39_505 = null;
		anIntArray167 = null;
		aClass2_Sub1_Sub4_Sub3_7 = null;
		anIntArrayArray12 = null;
		anObject4 = null;
		aClass51_24 = null;
		aClass39_502 = null;
		aClass54_10 = null;
		aClass39_509 = null;
		aClass39_507 = null;
		aClass39_504 = null;
		aClass39_506 = null;
		anIntArray165 = null;
		aClass39_503 = null;
		aClass39_508 = null;
		anIntArray166 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BILclient!ge;)V")
	public static void method819(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub2_Sub3 arg1) {
		if (arg1.anInt2896 < 128 || arg1.anInt2899 < 128 || arg1.anInt2896 >= 13184 || arg1.anInt2899 >= 13184) {
			arg1.anInt2904 = -1;
			arg1.anInt2900 = 0;
			arg1.anInt2901 = -1;
			arg1.anInt2941 = 0;
			arg1.anInt2896 = arg1.anInt2898 * 64 + arg1.anIntArray368[0] * 128;
			arg1.anInt2899 = arg1.anInt2898 * 64 + arg1.anIntArray367[0] * 128;
			arg1.method2072();
		}
		if (arg1 == Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1 && (arg1.anInt2896 < 1536 || arg1.anInt2899 < 1536 || arg1.anInt2896 >= 11776 || arg1.anInt2899 >= 11776)) {
			arg1.anInt2900 = 0;
			arg1.anInt2941 = 0;
			arg1.anInt2904 = -1;
			arg1.anInt2901 = -1;
			arg1.anInt2896 = arg1.anIntArray368[0] * 128 + arg1.anInt2898 * 64;
			arg1.anInt2899 = arg1.anInt2898 * 64 + arg1.anIntArray367[0] * 128;
			arg1.method2072();
		}
		if (Static64.anInt1889 < arg1.anInt2900) {
			Static12.method252(arg1);
		} else if (arg1.anInt2941 >= Static64.anInt1889) {
			Static107.method1864(arg1);
		} else {
			Static21.method1881(arg1);
		}
		Static86.method1636(arg1);
		Static25.method514(arg1);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public static void method820() {
		if (Static104.anInt2782 > 1) {
			Static104.anInt2782--;
		}
		if (Static20.anInt587 > 0) {
			Static20.anInt587--;
		}
		if (Static46.aBoolean67) {
			Static46.aBoolean67 = false;
			Static102.method1975();
			return;
		}
		for (@Pc(29) int local29 = 0; local29 < 100 && Static19.method425(); local29++) {
		}
		if (Static18.anInt554 != 30 && Static18.anInt554 != 35) {
			return;
		}
		@Pc(66) int local66;
		if (Static99.aBoolean124 && Static18.anInt554 == 30) {
			Static7.anInt163 = 0;
			anInt1172 = 0;
			while (Static99.method1905()) {
			}
			for (local66 = 0; local66 < Static60.aBooleanArray10.length; local66++) {
				Static60.aBooleanArray10[local66] = false;
			}
		}
		Static23.method447(Static50.aClass2_Sub5_Sub1_2);
		@Pc(84) Object local84 = Static12.aClass15_1.anObject1;
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(118) int local118;
		@Pc(133) int local133;
		synchronized (Static12.aClass15_1.anObject1) {
			if (!Static95.aBoolean113) {
				Static12.aClass15_1.anInt589 = 0;
			} else if (anInt1172 != 0 || Static12.aClass15_1.anInt589 >= 40) {
				Static50.aClass2_Sub5_Sub1_2.method1302(249);
				Static50.aClass2_Sub5_Sub1_2.method1252(0);
				local114 = Static50.aClass2_Sub5_Sub1_2.anInt1772;
				local116 = 0;
				@Pc(138) int local138;
				for (local118 = 0; Static12.aClass15_1.anInt589 > local118 && Static50.aClass2_Sub5_Sub1_2.anInt1772 - local114 < 240; local118++) {
					local133 = Static12.aClass15_1.anIntArray67[local118];
					local138 = Static12.aClass15_1.anIntArray66[local118];
					if (local138 < 0) {
						local138 = 0;
					} else if (local138 > 502) {
						local138 = 502;
					}
					local116++;
					if (local133 < 0) {
						local133 = 0;
					} else if (local133 > 764) {
						local133 = 764;
					}
					@Pc(173) int local173 = local138 * 765 + local133;
					if (Static12.aClass15_1.anIntArray66[local118] == -1 && Static12.aClass15_1.anIntArray67[local118] == -1) {
						local138 = -1;
						local133 = -1;
						local173 = 524287;
					}
					if (Static40.anInt1185 != local133 || local138 != Static24.anInt657) {
						@Pc(216) int local216 = local133 - Static40.anInt1185;
						Static40.anInt1185 = local133;
						@Pc(222) int local222 = local138 - Static24.anInt657;
						Static24.anInt657 = local138;
						if (Static57.anInt1642 < 8 && local216 >= -32 && local216 <= 31 && local222 >= -32 && local222 <= 31) {
							local216 += 32;
							local222 += 32;
							Static50.aClass2_Sub5_Sub1_2.method1257((local216 << 6) + (Static57.anInt1642 << 12) + local222);
							Static57.anInt1642 = 0;
						} else if (Static57.anInt1642 < 8) {
							Static50.aClass2_Sub5_Sub1_2.method1246((Static57.anInt1642 << 19) + local173 + 8388608);
							Static57.anInt1642 = 0;
						} else {
							Static50.aClass2_Sub5_Sub1_2.method1298((Static57.anInt1642 << 19) + local173 - 1073741824);
							Static57.anInt1642 = 0;
						}
					} else if (Static57.anInt1642 < 2047) {
						Static57.anInt1642++;
					}
				}
				Static50.aClass2_Sub5_Sub1_2.method1266(Static50.aClass2_Sub5_Sub1_2.anInt1772 - local114);
				if (local116 < Static12.aClass15_1.anInt589) {
					Static12.aClass15_1.anInt589 -= local116;
					for (local138 = 0; local138 < Static12.aClass15_1.anInt589; local138++) {
						Static12.aClass15_1.anIntArray67[local138] = Static12.aClass15_1.anIntArray67[local138 + local116];
						Static12.aClass15_1.anIntArray66[local138] = Static12.aClass15_1.anIntArray66[local116 + local138];
					}
				} else {
					Static12.aClass15_1.anInt589 = 0;
				}
			}
		}
		if (anInt1172 != 0) {
			local114 = Static93.anInt2442;
			@Pc(381) long local381 = (Static49.aLong36 - Static21.aLong75) / 50L;
			if (local114 < 0) {
				local114 = 0;
			} else if (local114 > 502) {
				local114 = 502;
			}
			local116 = Static2.anInt91;
			Static21.aLong75 = Static49.aLong36;
			@Pc(398) byte local398 = 0;
			if (local381 > 4095L) {
				local381 = 4095L;
			}
			if (local116 < 0) {
				local116 = 0;
			} else if (local116 > 764) {
				local116 = 764;
			}
			local118 = local114 * 765 + local116;
			if (anInt1172 == 2) {
				local398 = 1;
			}
			local133 = (int) local381;
			Static50.aClass2_Sub5_Sub1_2.method1302(86);
			Static50.aClass2_Sub5_Sub1_2.method1298(local118 + (local133 << 20) + (local398 << 19));
		}
		if (Static45.anInt1241 > 0) {
			Static45.anInt1241--;
		}
		if (Static60.aBooleanArray10[96] || Static60.aBooleanArray10[97] || Static60.aBooleanArray10[98] || Static60.aBooleanArray10[99]) {
			Static68.aBoolean97 = true;
		}
		if (Static68.aBoolean97 && Static45.anInt1241 <= 0) {
			Static45.anInt1241 = 20;
			Static68.aBoolean97 = false;
			Static50.aClass2_Sub5_Sub1_2.method1302(125);
			Static50.aClass2_Sub5_Sub1_2.method1249(Static101.anInt2748);
			Static50.aClass2_Sub5_Sub1_2.method1268(Static107.anInt2653);
		}
		if (Static87.aBoolean104 && !Static56.aBoolean86) {
			Static56.aBoolean86 = true;
			Static50.aClass2_Sub5_Sub1_2.method1302(5);
			Static50.aClass2_Sub5_Sub1_2.method1252(1);
		}
		if (!Static87.aBoolean104 && Static56.aBoolean86) {
			Static56.aBoolean86 = false;
			Static50.aClass2_Sub5_Sub1_2.method1302(5);
			Static50.aClass2_Sub5_Sub1_2.method1252(0);
		}
		Static12.method255();
		if (Static18.anInt554 != 30 && Static18.anInt554 != 35) {
			return;
		}
		Static53.method1009();
		Static50.method951();
		Static12.anInt322++;
		if (Static12.anInt322 > 750) {
			Static102.method1975();
			return;
		}
		Static25.method508();
		Static2.method52();
		Static6.method2057();
		if (Static71.anInt2029 != 0) {
			Static96.anInt2639++;
			if (Static96.anInt2639 >= 15) {
				if (Static71.anInt2029 == 2) {
					Static97.aBoolean120 = true;
				}
				if (Static71.anInt2029 == 3) {
					Static31.aBoolean91 = true;
				}
				Static71.anInt2029 = 0;
			}
		}
		Static17.anInt489++;
		if (Static41.anInt1189 != 0) {
			Static53.anInt1469 += 20;
			if (Static53.anInt1469 >= 400) {
				Static41.anInt1189 = 0;
			}
		}
		if (Static69.anInt2009 != 0) {
			if (Static55.anInt1558 + 5 < Static80.anInt2188 || Static80.anInt2188 < Static55.anInt1558 - 5 || Static45.anInt1237 > Static41.anInt1198 + 5 || Static41.anInt1198 - 5 > Static45.anInt1237) {
				Static63.aBoolean92 = true;
			}
			Static76.anInt2103++;
			if (Static7.anInt163 == 0) {
				if (Static69.anInt2009 == 2) {
					Static97.aBoolean120 = true;
				}
				if (Static69.anInt2009 == 3) {
					Static31.aBoolean91 = true;
				}
				Static69.anInt2009 = 0;
				if (Static63.aBoolean92 && Static76.anInt2103 >= 5) {
					Static104.anInt2783 = -1;
					Static73.method1501();
					if (Static81.anInt2197 == Static104.anInt2783 && Static78.anInt2157 != Static93.anInt2428) {
						@Pc(740) Class2_Sub1_Sub6 local740 = Static90.method1705(Static81.anInt2197);
						@Pc(746) byte local746 = 0;
						if (Static29.anInt832 == 1 && local740.anInt722 == 206) {
							local746 = 1;
						}
						if (local740.anIntArray75[Static93.anInt2428] <= 0) {
							local746 = 0;
						}
						if (local740.aBoolean43) {
							local114 = Static78.anInt2157;
							local116 = Static93.anInt2428;
							local740.anIntArray75[local116] = local740.anIntArray75[local114];
							local740.anIntArray78[local116] = local740.anIntArray78[local114];
							local740.anIntArray75[local114] = -1;
							local740.anIntArray78[local114] = 0;
						} else if (local746 == 1) {
							local114 = Static78.anInt2157;
							local116 = Static93.anInt2428;
							while (local116 != local114) {
								if (local114 > local116) {
									local740.method518(local114 - 1, local114);
									local114--;
								} else if (local116 > local114) {
									local740.method518(local114 + 1, local114);
									local114++;
								}
							}
						} else {
							local740.method518(Static93.anInt2428, Static78.anInt2157);
						}
						Static50.aClass2_Sub5_Sub1_2.method1302(222);
						Static50.aClass2_Sub5_Sub1_2.method1252(local746);
						Static50.aClass2_Sub5_Sub1_2.method1298(Static81.anInt2197);
						Static50.aClass2_Sub5_Sub1_2.method1268(Static93.anInt2428);
						Static50.aClass2_Sub5_Sub1_2.method1249(Static78.anInt2157);
					}
				} else if ((Static90.anInt2387 == 1 || Static27.method558(Static101.anInt2753 - 1)) && Static101.anInt2753 > 2) {
					Static94.method1788();
				} else if (Static101.anInt2753 > 0) {
					Static107.method1865(Static101.anInt2753 - 1);
				}
				Static96.anInt2639 = 10;
				anInt1172 = 0;
			}
		}
		@Pc(875) int local875;
		if (Static59.anInt1706 != -1) {
			local66 = Static59.anInt1706;
			local875 = Static59.anInt1693;
			@Pc(895) boolean local895 = Static22.method440(0, 0, 0, local875, 0, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray368[0], local66, true, 0, Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anIntArray367[0]);
			if (local895) {
				Static57.anInt1654 = Static2.anInt91;
				Static53.anInt1469 = 0;
				Static41.anInt1189 = 1;
				Static105.anInt2801 = Static93.anInt2442;
			}
			Static59.anInt1706 = -1;
		}
		if (anInt1172 == 1 && Static62.aClass39_785 != null) {
			Static62.aClass39_785 = null;
			anInt1172 = 0;
			Static31.aBoolean91 = true;
		}
		Static22.method438();
		if (Static7.anInt161 == -1) {
			Static63.method1336();
			Static75.method365();
			Static8.method123();
		}
		if (Static96.anInt2626 == -1 && Static81.anInt2196 == -1 && Static35.anInt2884 == -1) {
			if (Static65.anInt1902 > 0) {
				Static65.anInt1902--;
			}
		} else if (Static55.anInt1568 > Static65.anInt1902) {
			Static65.anInt1902++;
			if (Static65.anInt1902 == Static55.anInt1568) {
				if (Static96.anInt2626 != -1) {
					Static31.aBoolean91 = true;
				}
				if (Static81.anInt2196 != -1) {
					Static97.aBoolean120 = true;
				}
			}
		}
		if (Static7.anInt163 == 1 || anInt1172 == 1) {
			Static24.anInt664++;
		}
		Static48.method911();
		if (Static87.aBoolean103) {
			Static83.method1611();
		}
		for (local66 = 0; local66 < 5; local66++) {
			@Pc(1014) int local1014 = Static6.anIntArray362[local66]++;
		}
		Static60.method1129();
		local875 = Static28.method565();
		local114 = Static109.method2079();
		if (local875 > 4500 && local114 > 4500) {
			Static20.anInt587 = 250;
			Static67.method1409(4000);
			Static50.aClass2_Sub5_Sub1_2.method1302(183);
		}
		Static57.anInt1649++;
		Static10.anInt249++;
		if (Static10.anInt249 > 500) {
			Static10.anInt249 = 0;
			local116 = (int) (Math.random() * 8.0D);
			if ((local116 & 0x1) == 1) {
				anInt1168 += Static72.anInt2065;
			}
			if ((local116 & 0x4) == 4) {
				Static60.anInt1625 += Static18.anInt525;
			}
			if ((local116 & 0x2) == 2) {
				Static7.anInt138 += Static22.anInt597;
			}
		}
		if (Static60.anInt1625 < -40) {
			Static18.anInt525 = 1;
		}
		Static64.anInt1898++;
		if (Static7.anInt138 < -55) {
			Static22.anInt597 = 2;
		}
		if (Static7.anInt138 > 55) {
			Static22.anInt597 = -2;
		}
		if (Static57.anInt1649 > 500) {
			Static57.anInt1649 = 0;
			local116 = (int) (Math.random() * 8.0D);
			if ((local116 & 0x1) == 1) {
				Static94.anInt2489 += Static45.anInt1239;
			}
			if ((local116 & 0x2) == 2) {
				Static63.anInt1865 += Static97.anInt2648;
			}
		}
		if (Static60.anInt1625 > 40) {
			Static18.anInt525 = -1;
		}
		if (Static94.anInt2489 < -60) {
			Static45.anInt1239 = 2;
		}
		if (Static63.anInt1865 < -20) {
			Static97.anInt2648 = 1;
		}
		if (Static63.anInt1865 > 10) {
			Static97.anInt2648 = -1;
		}
		if (anInt1168 < -50) {
			Static72.anInt2065 = 2;
		}
		if (Static94.anInt2489 > 60) {
			Static45.anInt1239 = -2;
		}
		if (anInt1168 > 50) {
			Static72.anInt2065 = -2;
		}
		if (Static64.anInt1898 > 50) {
			Static50.aClass2_Sub5_Sub1_2.method1302(217);
		}
		try {
			if (Static85.aClass10_3 != null && Static50.aClass2_Sub5_Sub1_2.anInt1772 > 0) {
				Static85.aClass10_3.method260(Static50.aClass2_Sub5_Sub1_2.anInt1772, Static50.aClass2_Sub5_Sub1_2.aByteArray16);
				Static64.anInt1898 = 0;
				Static50.aClass2_Sub5_Sub1_2.anInt1772 = 0;
			}
		} catch (@Pc(1232) IOException local1232) {
			Static102.method1975();
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
	public static void method821() {
		if (Static78.aClass11_1 == null) {
			return;
		}
		if (Static30.anInt844 >= 0) {
			if (Static10.anInt248 > 0) {
				Static50.anInt1408 += Static90.anInt2384;
				Static78.aClass11_1.method1859(Static30.anInt844, Static50.anInt1408);
				Static10.anInt248--;
				if (Static10.anInt248 == 0) {
					Static78.aClass11_1.method1861();
					Static10.anInt248 = 20;
					Static30.anInt844 = -1;
				}
			}
		} else if (Static10.anInt248 > 0) {
			Static10.anInt248--;
			if (Static10.anInt248 == 0) {
				if (Static51.aByteArray22 == null) {
					Static78.aClass11_1.method1867(256);
				} else {
					Static78.aClass11_1.method1867(Static21.anInt2668);
					Static30.anInt844 = Static21.anInt2668;
					Static78.aClass11_1.method1862(Static101.aBoolean126, Static21.anInt2668, Static51.aByteArray22);
					Static51.aByteArray22 = null;
				}
				Static50.anInt1408 = 0;
			}
		}
		Static78.aClass11_1.method1868();
	}
}
