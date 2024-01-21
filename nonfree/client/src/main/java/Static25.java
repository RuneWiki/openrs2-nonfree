import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static25 {

	@OriginalMember(owner = "client!e", name = "a", descriptor = "Lclient!qc;")
	private static Class60 aClass60_285 = Static121.method2047("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!qc;")
	private static Class60 aClass60_289 = Static121.method2047("Login");

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Lclient!qc;")
	public static Class60 aClass60_286 = aClass60_289;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Lclient!qc;")
	public static Class60 aClass60_287 = Static121.method2047("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Lclient!qc;")
	public static Class60 aClass60_288 = aClass60_285;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	public static int anInt693 = 0;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "Lclient!qc;")
	public static Class60 aClass60_290 = Static121.method2047("Fertigkeit)2");

	@OriginalMember(owner = "client!e", name = "m", descriptor = "I")
	public static int anInt697 = 0;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public static void method478() {
		aClass60_286 = null;
		aClass60_290 = null;
		aClass60_287 = null;
		aClass60_288 = null;
		aClass60_285 = null;
		aClass60_289 = null;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public static void method479() {
		Static130.method2133(Static60.aClass4_Sub17_12);
		Static82.anInt1968++;
		if (Static73.aBoolean73 && Static11.aBoolean9) {
			@Pc(26) int local26 = Static17.anInt452;
			@Pc(28) int local28 = Static82.anInt1962;
			local28 -= Static9.anInt156;
			local26 -= Static103.anInt1662;
			if (Static22.anInt649 > local28) {
				local28 = Static22.anInt649;
			}
			if (Static56.anInt1425 > local26) {
				local26 = Static56.anInt1425;
			}
			if (Static56.anInt1425 + Static114.aClass4_Sub17_15.anInt2186 < Static60.aClass4_Sub17_12.anInt2186 + local26) {
				local26 = Static114.aClass4_Sub17_15.anInt2186 + Static56.anInt1425 - Static60.aClass4_Sub17_12.anInt2186;
			}
			if (Static114.aClass4_Sub17_15.anInt2184 + Static22.anInt649 < local28 + Static60.aClass4_Sub17_12.anInt2184) {
				local28 = Static22.anInt649 + Static114.aClass4_Sub17_15.anInt2184 - Static60.aClass4_Sub17_12.anInt2184;
			}
			@Pc(102) int local102 = local26 - Static34.anInt901;
			@Pc(110) int local110 = Static114.aClass4_Sub17_15.anInt2224 + local28 - Static22.anInt649;
			@Pc(113) int local113 = Static60.aClass4_Sub17_12.anInt2238;
			@Pc(118) int local118 = local28 - Static120.anInt1942;
			@Pc(126) int local126 = local26 + Static114.aClass4_Sub17_15.anInt2215 - Static56.anInt1425;
			if (Static82.anInt1968 > Static60.aClass4_Sub17_12.anInt2218 && (local118 > local113 || -local113 > local118 || local113 < local102 || local102 < -local113)) {
				Static71.aBoolean69 = true;
			}
			@Pc(163) Class4_Sub16 local163;
			if (Static60.aClass4_Sub17_12.anObjectArray4 != null && Static71.aBoolean69) {
				local163 = new Class4_Sub16();
				local163.anObjectArray3 = Static60.aClass4_Sub17_12.anObjectArray4;
				local163.anInt1889 = local110;
				local163.anInt1901 = local126;
				local163.aClass4_Sub17_9 = Static60.aClass4_Sub17_12;
				Static18.method296(local163);
			}
			if (Static116.anInt2785 == 0) {
				if (Static71.aBoolean69) {
					if (Static60.aClass4_Sub17_12.anObjectArray17 != null) {
						local163 = new Class4_Sub16();
						local163.anObjectArray3 = Static60.aClass4_Sub17_12.anObjectArray17;
						local163.aClass4_Sub17_8 = Static23.aClass4_Sub17_2;
						local163.aClass4_Sub17_9 = Static60.aClass4_Sub17_12;
						local163.anInt1901 = local126;
						local163.anInt1889 = local110;
						Static18.method296(local163);
					}
					if (Static23.aClass4_Sub17_2 != null && Static113.method1926(Static60.aClass4_Sub17_12) != null) {
						Static56.aClass4_Sub13_Sub1_1.method1265(118);
						Static56.aClass4_Sub13_Sub1_1.method1221(Static60.aClass4_Sub17_12.anInt2203);
						Static56.aClass4_Sub13_Sub1_1.method1207(Static23.aClass4_Sub17_2.anInt2241);
						Static56.aClass4_Sub13_Sub1_1.method1207(Static60.aClass4_Sub17_12.anInt2241);
						Static56.aClass4_Sub13_Sub1_1.method1218(Static23.aClass4_Sub17_2.anInt2203);
					}
				} else if ((Static61.anInt1533 == 1 || Static111.method1898(anInt693 - 1)) && anInt693 > 2) {
					Static120.method1449();
				} else if (anInt693 > 0) {
					Static38.method647(anInt693 - 1);
				}
				Static60.aClass4_Sub17_12 = null;
			}
		} else if (Static82.anInt1968 > 1) {
			Static60.aClass4_Sub17_12 = null;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIBII)V")
	public static void method480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static80.method1712(arg2, arg0, arg3 + arg2, arg1 + arg0);
		Static91.method1594();
		Static87.anInt2044++;
		Static83.method1467(true);
		Static107.method1833(true);
		Static83.method1467(false);
		Static107.method1833(false);
		Static83.method1469();
		Static23.method461();
		@Pc(45) int local45;
		@Pc(43) int local43;
		if (!Static110.aBoolean115) {
			local43 = Static9.anInt159 + Static52.anInt1339 & 0x7FF;
			local45 = Static69.anInt1774;
			if (local45 < Static123.anInt2916 / 256) {
				local45 = Static123.anInt2916 / 256;
			}
			if (Static101.aBooleanArray16[4] && local45 < Static83.anIntArray198[4] + 128) {
				local45 = Static83.anIntArray198[4] + 128;
			}
			Static24.method469(local43, Static54.method1001(Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2620, Static131.aClass4_Sub4_Sub1_Sub2_Sub2_1.anInt2601, Static129.anInt3003) - 50, Static112.anInt2727, local45 * 3 + 600, Static70.anInt1809, local45);
		}
		if (Static110.aBoolean115) {
			local45 = Static10.method199();
		} else {
			local45 = Static37.method640();
		}
		@Pc(107) int local107 = Static23.anInt663;
		@Pc(109) int local109 = Static75.anInt1872;
		@Pc(111) int local111 = Static120.anInt1940;
		@Pc(113) int local113 = Static74.anInt1856;
		local43 = Static88.anInt2065;
		@Pc(158) int local158;
		for (@Pc(117) int local117 = 0; local117 < 5; local117++) {
			if (Static101.aBooleanArray16[local117]) {
				local158 = (int) ((double) (Static70.anIntArray184[local117] * 2 + 1) * Math.random() - (double) Static70.anIntArray184[local117] + Math.sin((double) Static45.anIntArray110[local117] / 100.0D * (double) Static74.anIntArray192[local117]) * (double) Static83.anIntArray198[local117]);
				if (local117 == 1) {
					Static23.anInt663 += local158;
				}
				if (local117 == 3) {
					Static75.anInt1872 = local158 + Static75.anInt1872 & 0x7FF;
				}
				if (local117 == 2) {
					Static74.anInt1856 += local158;
				}
				if (local117 == 4) {
					Static120.anInt1940 += local158;
					if (Static120.anInt1940 < 128) {
						Static120.anInt1940 = 128;
					}
					if (Static120.anInt1940 > 383) {
						Static120.anInt1940 = 383;
					}
				}
				if (local117 == 0) {
					Static88.anInt2065 += local158;
				}
			}
		}
		@Pc(221) int local221 = Static17.anInt452;
		local158 = Static82.anInt1962;
		if (arg2 <= local158 && local158 < arg3 + arg2 && local221 >= arg0 && local221 < arg0 + arg1) {
			Static100.anInt2458 = 0;
			Static100.aBoolean111 = true;
			Static100.anInt2463 = Static82.anInt1962 - arg2;
			Static100.anInt2459 = Static17.anInt452 - arg0;
		} else {
			Static100.anInt2458 = 0;
			Static100.aBoolean111 = false;
		}
		Static9.method138();
		Static80.method1705(arg2, arg0, arg3, arg1, 0);
		Static9.method138();
		Static7.aClass28_3.method775(Static88.anInt2065, Static23.anInt663, Static74.anInt1856, Static120.anInt1940, Static75.anInt1872, local45);
		Static9.method138();
		Static7.aClass28_3.method805();
		Static126.method2078(arg1, arg0, arg3, arg2);
		Static17.method294(arg0, arg2);
		((Class21) Static91.anInterface2_1).method627(Static15.anInt2962);
		Static64.method1280(arg0, arg2, arg3, arg1);
		Static74.anInt1856 = local113;
		Static23.anInt663 = local107;
		Static120.anInt1940 = local111;
		Static75.anInt1872 = local109;
		Static88.anInt2065 = local43;
		if (Static10.aBoolean6 && Static127.method2105() == 0) {
			Static10.aBoolean6 = false;
		}
		if (Static10.aBoolean6) {
			Static80.method1705(arg2, arg0, arg3, arg1, 0);
			Static71.method1377(Static84.aClass60_833, false);
		}
		if (!Static10.aBoolean6 && !Static93.aBoolean105 && arg2 <= local158 && local158 < arg3 + arg2 && local221 >= arg0 && local221 < arg1 + arg0) {
			Static6.method39(arg2, local158, local221, arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIII)V")
	public static void method481(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static27.method520(arg5)) {
			Static81.method1455(arg1, arg4, -1, arg6, arg2, arg3, Static82.aClass4_Sub17ArrayArray1[arg5], arg0);
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
	public static void method482() {
		if (Static113.aClass4_Sub17_14 != null || Static60.aClass4_Sub17_12 != null) {
			return;
		}
		@Pc(18) int local18 = Static3.anInt28;
		@Pc(33) int local33;
		@Pc(91) int local91;
		@Pc(97) int local97;
		if (Static93.aBoolean105) {
			if (local18 != 1) {
				local33 = Static82.anInt1962;
				local91 = Static17.anInt452;
				if (Static33.anInt889 - 10 > local33 || Static33.anInt889 + Static31.anInt849 + 10 < local33 || local91 < Static55.anInt1407 - 10 || Static46.anInt1203 + Static55.anInt1407 + 10 < local91) {
					Static93.aBoolean105 = false;
					Static26.method505(Static46.anInt1203, Static31.anInt849, Static33.anInt889, Static55.anInt1407);
				}
			}
			if (local18 != 1) {
				return;
			}
			local33 = Static33.anInt889;
			local97 = Static31.anInt849;
			local91 = Static55.anInt1407;
			@Pc(246) int local246 = Static128.anInt2648;
			@Pc(248) int local248 = Static22.anInt652;
			@Pc(250) int local250 = -1;
			for (@Pc(252) int local252 = 0; local252 < anInt693; local252++) {
				@Pc(267) int local267 = local91 + (anInt693 + -1 + -local252) * 15 + 31;
				if (local246 > local33 && local246 < local33 + local97 && local267 - 13 < local248 && local248 < local267 + 3) {
					local250 = local252;
				}
			}
			if (local250 != -1) {
				Static38.method647(local250);
			}
			Static93.aBoolean105 = false;
			Static26.method505(Static46.anInt1203, Static31.anInt849, Static33.anInt889, Static55.anInt1407);
			return;
		}
		if (local18 == 1 && anInt693 > 0) {
			local33 = Static36.anIntArray71[anInt693 - 1];
			if (local33 == 42 || local33 == 45 || local33 == 48 || local33 == 20 || local33 == 16 || local33 == 40 || local33 == 30 || local33 == 3 || local33 == 39 || local33 == 12 || local33 == 44 || local33 == 1007) {
				local91 = Static47.anIntArray116[anInt693 - 1];
				local97 = Static20.anIntArray32[anInt693 - 1];
				@Pc(101) Class4_Sub17 local101 = Static16.method283(local97);
				if (Static120.method1445(Static73.method1384(local101)) || Static57.method323(Static73.method1384(local101))) {
					Static2.anInt1353 = 0;
					Static90.aBoolean88 = false;
					if (Static113.aClass4_Sub17_14 != null) {
						Static130.method2133(Static113.aClass4_Sub17_14);
					}
					Static113.aClass4_Sub17_14 = Static16.method283(local97);
					Static78.anInt1908 = Static128.anInt2648;
					Static117.anInt2794 = Static22.anInt652;
					Static95.anInt2331 = local91;
					Static130.method2133(Static113.aClass4_Sub17_14);
					return;
				}
			}
		}
		if (local18 == 1 && (Static61.anInt1533 == 1 && anInt693 > 2 || Static111.method1898(anInt693 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && anInt693 > 0) {
			Static38.method647(anInt693 - 1);
		}
		if (local18 == 2 && anInt693 > 0) {
			Static120.method1449();
			return;
		}
	}
}
