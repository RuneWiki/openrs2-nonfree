import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!oa", name = "h", descriptor = "[I")
	public static int[] anIntArray259;

	@OriginalMember(owner = "client!oa", name = "l", descriptor = "Lclient!uc;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_16;

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!ke;")
	private static Class39 aClass39_925 = Static2.method66("Accept challenge");

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "Lclient!ke;")
	public static Class39 aClass39_919 = aClass39_925;

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "Lclient!ke;")
	public static Class39 aClass39_920 = Static2.method66(":duelreq:");

	@OriginalMember(owner = "client!oa", name = "v", descriptor = "Lclient!ke;")
	private static Class39 aClass39_926 = Static2.method66("glow2:");

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "Lclient!ke;")
	public static Class39 aClass39_921 = aClass39_926;

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "Lclient!ke;")
	private static Class39 aClass39_922 = Static2.method66("Loaded textures");

	@OriginalMember(owner = "client!oa", name = "g", descriptor = "Lclient!ke;")
	public static Class39 aClass39_923 = Static2.method66("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!oa", name = "k", descriptor = "Lclient!ke;")
	public static Class39 aClass39_924 = aClass39_922;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "I")
	public static int anInt2080 = -1;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZIIIILclient!jd;II)V")
	public static synchronized void method1491(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) Class36 arg2, @OriginalArg(7) int arg3) {
		if (!Static66.method1376()) {
			return;
		}
		Static96.aBoolean119 = false;
		Static25.anInt694 = arg0;
		Static69.anInt2015 = -1;
		Static31.anInt1778 = 0;
		Static99.aClass36_67 = arg2;
		Static55.aBoolean84 = true;
		Static61.anInt1738 = 10;
		Static101.anInt2756 = arg3;
		Static54.anInt1505 = arg1;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public static void method1492() {
		aClass39_926 = null;
		aClass39_921 = null;
		aClass39_924 = null;
		aClass2_Sub1_Sub4_Sub3_16 = null;
		aClass39_925 = null;
		aClass39_922 = null;
		anIntArray259 = null;
		aClass39_923 = null;
		aClass39_920 = null;
		aClass39_919 = null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cc;ZZ)Z")
	public static boolean method1493(@OriginalArg(0) Class12 arg0, @OriginalArg(2) boolean arg1) {
		Static10.anInt248 = 20;
		try {
			Static78.aClass11_1 = (Class11) Class.forName("Class11_Sub1_Sub1").getDeclaredConstructor().newInstance();
			return true;
		} catch (@Pc(13) Throwable local13) {
			@Pc(22) Interface3 local22 = arg0.method330();
			if (local22 != null) {
				Static78.aClass11_1 = new Class11_Sub1_Sub2(arg0, local22);
				return true;
			} else if (arg1) {
				Static78.aClass11_1 = new Class11_Sub2(arg0);
				return true;
			} else {
				return false;
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ZI)V")
	public static void method1494(@OriginalArg(0) boolean arg0) {
		if (Static12.anInt325 == Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2896 >> 7 && Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1.anInt2899 >> 7 == Static55.anInt1552) {
			Static12.anInt325 = 0;
		}
		@Pc(21) int local21 = Static61.anInt1740;
		if (arg0) {
			local21 = 1;
		}
		for (@Pc(27) int local27 = 0; local27 < local21; local27++) {
			@Pc(35) Class2_Sub1_Sub2_Sub3_Sub1 local35;
			@Pc(33) int local33;
			if (arg0) {
				local33 = 33538048;
				local35 = Static28.aClass2_Sub1_Sub2_Sub3_Sub1_1;
			} else {
				local33 = Static7.anIntArray21[local27] << 14;
				local35 = Static45.aClass2_Sub1_Sub2_Sub3_Sub1Array1[Static7.anIntArray21[local27]];
			}
			if (local35 != null && local35.method2067()) {
				local35.aBoolean118 = false;
				if ((Static35.aBoolean136 && Static61.anInt1740 > 50 || Static61.anInt1740 > 200) && !arg0 && local35.anInt2895 == local35.anInt2894) {
					local35.aBoolean118 = true;
				}
				@Pc(87) int local87 = local35.anInt2896 >> 7;
				@Pc(92) int local92 = local35.anInt2899 >> 7;
				if (local87 >= 0 && local87 < 104 && local92 >= 0 && local92 < 104) {
					if (local35.aClass2_Sub1_Sub2_Sub2_3 == null || local35.anInt2630 > Static64.anInt1889 || Static64.anInt1889 >= local35.anInt2618) {
						if ((local35.anInt2896 & 0x7F) == 64 && (local35.anInt2899 & 0x7F) == 64) {
							if (Static94.anInt2479 == Static39.anIntArrayArray12[local87][local92]) {
								continue;
							}
							Static39.anIntArrayArray12[local87][local92] = Static94.anInt2479;
						}
						local35.anInt2633 = Static51.method1779(local35.anInt2899, local35.anInt2896, Static18.anInt560);
						Static77.aClass43_1.method1180(Static18.anInt560, local35.anInt2896, local35.anInt2899, local35.anInt2633, 60, local35, local35.anInt2909, local33, local35.aBoolean135);
					} else {
						local35.aBoolean118 = false;
						local35.anInt2633 = Static51.method1779(local35.anInt2899, local35.anInt2896, Static18.anInt560);
						Static77.aClass43_1.method1169(Static18.anInt560, local35.anInt2896, local35.anInt2899, local35.anInt2633, local35, local35.anInt2909, local33, local35.anInt2621, local35.anInt2635, local35.anInt2620, local35.anInt2617);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "(I)V")
	public static synchronized void method1495() {
		if (Static66.method1376()) {
			Static101.method1958();
			Static99.aClass36_67 = null;
			Static55.aBoolean84 = false;
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(ILclient!ke;ZLclient!jd;ILclient!ke;BI)V")
	public static synchronized void method1496(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(3) Class36 arg2, @OriginalArg(5) Class39 arg3) {
		if (Static66.method1376()) {
			@Pc(20) int local20 = arg2.method1774(arg3);
			@Pc(26) int local26 = arg2.method1754(arg1, local20);
			method1491(arg0, local26, arg2, local20);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
	public static synchronized void method1497() {
		Static87.method1644();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IB)V")
	public static synchronized void method1498() {
		if (Static66.method1376()) {
			Static99.method1904();
			Static55.aBoolean84 = false;
			Static99.aClass36_67 = null;
		}
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "(I)V")
	public static synchronized void method1499() {
		if (!Static66.method1376()) {
			return;
		}
		if (Static55.aBoolean84) {
			@Pc(23) byte[] local23 = Static29.method570(Static101.anInt2756, Static54.anInt1505, Static31.anInt1778, Static99.aClass36_67);
			if (local23 != null) {
				if (Static61.anInt1738 >= 0) {
					Static83.method1612(Static96.aBoolean119, local23, Static61.anInt1738, Static25.anInt694);
				} else if (Static69.anInt2015 >= 0) {
					Static22.method435(Static25.anInt694, Static96.aBoolean119, Static69.anInt2015, local23);
				} else {
					Static57.method1149(Static25.anInt694, Static96.aBoolean119, local23);
				}
				Static55.aBoolean84 = false;
				Static99.aClass36_67 = null;
			}
		}
		Static39.method821();
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!cc;Ljava/awt/Component;Z)Lclient!r;")
	public static Class2_Sub4_Sub2 method1500(@OriginalArg(0) Class12 arg0, @OriginalArg(1) Component arg1) {
		Static72.method1487(arg1, arg0);
		@Pc(16) Class2_Sub4_Sub2 local16 = new Class2_Sub4_Sub2();
		Static60.method1132(local16);
		return local16;
	}

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "(I)V")
	public static void method1501() {
		if (Static69.anInt2009 != 0) {
			return;
		}
		Static26.aClass39Array7[0] = Static94.aClass39_1137;
		Static21.anIntArray326[0] = 1004;
		Static101.anInt2753 = 1;
		if (Static7.anInt161 != -1) {
			Static72.anInt2052 = -1;
			Static77.anInt2113 = -1;
			Static81.method1569(0, 0, 503, Static7.anInt161, 0, 765, Static45.anInt1237, Static80.anInt2188, -1, 0);
			Static40.anInt1179 = Static72.anInt2052;
			Static35.anInt2884 = Static77.anInt2113;
			return;
		}
		Static86.method1638();
		Static72.anInt2052 = -1;
		@Pc(56) boolean local56 = false;
		Static77.anInt2113 = -1;
		if (Static80.anInt2188 > 4 && Static45.anInt1237 > 4 && Static80.anInt2188 < 516 && Static45.anInt1237 < 338) {
			if (Static78.anInt2159 == -1) {
				Static80.method1564();
			} else {
				Static81.method1569(4, 0, 338, Static78.anInt2159, 0, 516, Static45.anInt1237, Static80.anInt2188, -1, 4);
			}
		}
		Static35.anInt2884 = Static77.anInt2113;
		Static77.anInt2113 = -1;
		Static40.anInt1179 = Static72.anInt2052;
		Static72.anInt2052 = -1;
		if (Static80.anInt2188 > 553 && Static45.anInt1237 > 205 && Static80.anInt2188 < 743 && Static45.anInt1237 < 466) {
			if (Static57.anInt1650 != -1) {
				Static81.method1569(205, 0, 466, Static57.anInt1650, 1, 743, Static45.anInt1237, Static80.anInt2188, -1, 553);
			} else if (Static25.anIntArray81[Static77.anInt2108] != -1) {
				Static81.method1569(205, 0, 466, Static25.anIntArray81[Static77.anInt2108], 1, 743, Static45.anInt1237, Static80.anInt2188, -1, 553);
			}
		}
		if (Static72.anInt2052 != Static7.anInt165) {
			Static97.aBoolean120 = true;
			Static7.anInt165 = Static72.anInt2052;
		}
		if (Static77.anInt2113 != Static81.anInt2196) {
			Static97.aBoolean120 = true;
			Static81.anInt2196 = Static77.anInt2113;
		}
		Static72.anInt2052 = -1;
		Static77.anInt2113 = -1;
		if (Static80.anInt2188 > 17 && Static45.anInt1237 > 357 && Static80.anInt2188 < 496 && Static45.anInt1237 < 453) {
			if (Static99.anInt2696 != -1) {
				Static81.method1569(357, 0, 453, Static99.anInt2696, 2, 496, Static45.anInt1237, Static80.anInt2188, -1, 17);
			} else if (Static41.anInt1197 != -1) {
				Static81.method1569(357, 0, 453, Static41.anInt1197, 3, 496, Static45.anInt1237, Static80.anInt2188, -1, 17);
			} else if (Static45.anInt1237 < 434 && Static80.anInt2188 < 426) {
				Static44.method862(Static45.anInt1237 - 357, Static80.anInt2188 + -17);
			}
		}
		if ((Static99.anInt2696 != -1 || Static41.anInt1197 != -1) && Static72.anInt2052 != Static7.anInt141) {
			Static7.anInt141 = Static72.anInt2052;
			Static31.aBoolean91 = true;
		}
		if ((Static99.anInt2696 != -1 || Static41.anInt1197 != -1) && Static77.anInt2113 != Static96.anInt2626) {
			Static96.anInt2626 = Static77.anInt2113;
			Static31.aBoolean91 = true;
		}
		while (!local56) {
			local56 = true;
			for (@Pc(286) int local286 = 0; local286 < Static101.anInt2753 - 1; local286++) {
				if (Static21.anIntArray326[local286] < 1000 && Static21.anIntArray326[local286 + 1] > 1000) {
					local56 = false;
					@Pc(306) Class39 local306 = Static26.aClass39Array7[local286];
					Static26.aClass39Array7[local286] = Static26.aClass39Array7[local286 + 1];
					Static26.aClass39Array7[local286 + 1] = local306;
					@Pc(324) int local324 = Static21.anIntArray326[local286];
					Static21.anIntArray326[local286] = Static21.anIntArray326[local286 + 1];
					Static21.anIntArray326[local286 + 1] = local324;
					@Pc(342) int local342 = Static95.anIntArray313[local286];
					Static95.anIntArray313[local286] = Static95.anIntArray313[local286 + 1];
					Static95.anIntArray313[local286 + 1] = local342;
					@Pc(360) int local360 = Static60.anIntArray215[local286];
					Static60.anIntArray215[local286] = Static60.anIntArray215[local286 + 1];
					Static60.anIntArray215[local286 + 1] = local360;
					@Pc(378) int local378 = Static8.anIntArray27[local286];
					Static8.anIntArray27[local286] = Static8.anIntArray27[local286 + 1];
					Static8.anIntArray27[local286 + 1] = local378;
				}
			}
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IBLclient!jd;IIIZ)V")
	public static synchronized void method1502(@OriginalArg(0) int arg0, @OriginalArg(2) Class36 arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (!Static66.method1376()) {
			return;
		}
		Static96.aBoolean119 = false;
		Static99.aClass36_67 = arg1;
		Static31.anInt1778 = arg0;
		Static61.anInt1738 = -1;
		Static54.anInt1505 = 0;
		Static55.aBoolean84 = true;
		Static101.anInt2756 = arg3;
		Static69.anInt2015 = -1;
		Static25.anInt694 = arg2;
	}
}
