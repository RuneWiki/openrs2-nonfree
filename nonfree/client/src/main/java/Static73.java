import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "Lclient!l;")
	public static Class6_Sub3_Sub3_Sub2 aClass6_Sub3_Sub3_Sub2_3;

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "[Lclient!ra;")
	public static Class6_Sub3_Sub3_Sub3[] aClass6_Sub3_Sub3_Sub3Array4;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public static int anInt2059;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1069 = Static80.method1463("Loading wordpack )2 ");

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1068 = aClass63_1069;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "Lclient!mb;")
	public static Class49 aClass49_20 = new Class49(100);

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1070 = Static80.method1463("Loaded sprites");

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1071 = Static80.method1463("Username: ");

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1072 = Static80.method1463("Bitte versuchen Sie es in ");

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1073 = Static80.method1463("Lade Freunde)2Liste)3)3)3");

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public static int anInt2060 = 0;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1074 = aClass63_1071;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Z")
	public static boolean aBoolean110 = false;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "J")
	public static volatile long aLong50 = 0L;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1075 = aClass63_1070;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
	public static int anInt2061 = -1;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1076 = Static80.method1463("Hierhin gehen");

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!rd;")
	public static Class63 aClass63_1077 = Static80.method1463("Handel)4Duell");

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "Lclient!rd;")
	private static Class63 aClass63_1078 = Static80.method1463("Side panel redrawn");

	@OriginalMember(owner = "client!mb", name = "H", descriptor = "I")
	public static int anInt2064 = 0;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BII)V")
	public static void method1390(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class1 local7 = Static89.aClass1ArrayArrayArray1[Static101.anInt2810][arg1][arg0];
		if (local7 == null) {
			Static76.aClass19_1.method701(Static101.anInt2810, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(26) Class6_Sub3_Sub1_Sub7 local26 = (Class6_Sub3_Sub1_Sub7) local7.method3();
		@Pc(28) Class6_Sub3_Sub1_Sub7 local28 = null;
		while (local26 != null) {
			@Pc(34) Class6_Sub3_Sub8 local34 = Static91.method1664(local26.anInt3087);
			@Pc(37) int local37 = local34.anInt1378;
			if (local34.anInt1401 == 1) {
				local37 *= local26.anInt3086 + 1;
			}
			if (local21 < local37) {
				local28 = local26;
				local21 = local37;
			}
			local26 = (Class6_Sub3_Sub1_Sub7) local7.method14();
		}
		if (local28 == null) {
			Static76.aClass19_1.method701(Static101.anInt2810, arg1, arg0);
			return;
		}
		local7.method4(local28);
		@Pc(76) Class6_Sub3_Sub1_Sub7 local76 = null;
		local26 = (Class6_Sub3_Sub1_Sub7) local7.method3();
		@Pc(83) Class6_Sub3_Sub1_Sub7 local83 = null;
		while (local26 != null) {
			if (local28.anInt3087 != local26.anInt3087) {
				if (local76 == null) {
					local76 = local26;
				}
				if (local76.anInt3087 != local26.anInt3087 && local83 == null) {
					local83 = local26;
				}
			}
			local26 = (Class6_Sub3_Sub1_Sub7) local7.method14();
		}
		@Pc(121) int local121 = (arg0 << 7) + arg1 + 1610612736;
		Static76.aClass19_1.method700(Static101.anInt2810, arg1, arg0, Static110.method2038(Static101.anInt2810, arg0 * 128 + 64, arg1 * 128 + 64), local28, local121, local76, local83);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public static void method1391() {
		aClass63_1076 = null;
		aClass63_1069 = null;
		aClass63_1075 = null;
		aClass63_1078 = null;
		aClass6_Sub3_Sub3_Sub2_3 = null;
		aClass6_Sub3_Sub3_Sub3Array4 = null;
		aClass63_1073 = null;
		aClass63_1074 = null;
		aClass49_20 = null;
		aClass63_1071 = null;
		aClass63_1068 = null;
		aClass63_1072 = null;
		aClass63_1077 = null;
		aClass63_1070 = null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public static void method1392(@OriginalArg(1) int arg0) {
		if (Static46.anInt1432 == arg0) {
			return;
		}
		if (Static46.anInt1432 == 0) {
			Static103.method2132();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static120.anInt3290 = 0;
			Static48.anInt1509 = 0;
			Static93.anInt2619 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static31.aClass47_2 != null) {
			Static31.aClass47_2.method1378();
			Static31.aClass47_2 = null;
		}
		if (Static46.anInt1432 == 25 || Static46.anInt1432 == 40) {
			Static61.method1188();
			Static121.method1970();
		}
		if (Static46.anInt1432 == 25) {
			Static52.anInt1586 = 1;
			Static52.anInt1583 = 0;
			Static118.anInt3163 = 0;
			Static1.anInt7 = 0;
			Static76.anInt2137 = 1;
		}
		if (arg0 == 35) {
			Static58.method1138();
			Static56.method1130();
			if (Static86.aClass29_15 == null) {
				Static86.aClass29_15 = Static70.method1366(765, 503, Static38.aCanvas1);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static86.aClass29_15 = null;
			Static58.method1138();
			Static13.method347(Static71.aClass7_Sub1_12, Static52.aClass7_Sub1_8, Static38.aCanvas1);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static86.aClass29_15 = null;
			Static56.method1130();
			Static94.method1706(Static38.aCanvas1, Static52.aClass7_Sub1_8);
		}
		Static92.aBoolean135 = true;
		Static46.anInt1432 = arg0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public static void method1394() {
		Static54.method1097();
		if (Static112.anInt3088 == 1) {
			Static37.aClass6_Sub3_Sub3_Sub2Array5[Static34.anInt1151 / 100].method1252(Static84.anInt2419 - 12, Static76.anInt2138 + -12);
		}
		if (Static112.anInt3088 == 2) {
			Static37.aClass6_Sub3_Sub3_Sub2Array5[Static34.anInt1151 / 100 + 4].method1252(Static84.anInt2419 - 12, -8 + -4 + Static76.anInt2138);
		}
		if (Static31.anInt1025 != -1) {
			Static84.method1571(Static31.anInt1025);
			Static72.method1385(4, 512, 334, Static31.anInt1025);
		}
		if (Static102.anInt2833 != -1) {
			Static84.method1571(Static102.anInt2833);
			Static72.method1385(0, 512, 334, Static102.anInt2833);
		}
		Static23.method1542();
		if (!Static12.aBoolean23) {
			Static112.method2068();
			Static51.method1064();
		} else if (Static19.anInt634 == 0) {
			Static49.method1037();
		}
		if (Static15.anInt492 == 1) {
			aClass6_Sub3_Sub3_Sub2_3.method1252(472, 296);
		}
		@Pc(129) int local129;
		if (Static29.aBoolean48) {
			@Pc(107) byte local107 = 20;
			Static48.aClass6_Sub3_Sub3_Sub1_2.method455(Static15.method374(new Class63[] { Static101.aClass63_1529, Static118.method2114(Static114.anInt3105) }), 20, 16776960);
			@Pc(128) Runtime local128 = Runtime.getRuntime();
			local129 = local107 + 15;
			@Pc(139) int local139 = (int) ((local128.totalMemory() - local128.freeMemory()) / 1024L);
			@Pc(141) int local141 = 16776960;
			if (local139 > 32768 && Static61.aBoolean98) {
				local141 = 16711680;
			}
			if (local139 > 65536 && !Static61.aBoolean98) {
				local141 = 16711680;
			}
			Static48.aClass6_Sub3_Sub3_Sub1_2.method455(Static15.method374(new Class63[] { Static37.aClass63_663, Static118.method2114(local139), Static90.aClass63_1326 }), 35, local141);
			local129 += 15;
			if (Static35.aBoolean58) {
				Static48.aClass6_Sub3_Sub3_Sub1_2.method455(aClass63_1078, 50, 16711680);
				local129 += 15;
				Static35.aBoolean58 = false;
			}
			if (Static52.aBoolean79) {
				Static48.aClass6_Sub3_Sub3_Sub1_2.method455(Static116.aClass63_1727, local129, 16711680);
				Static52.aBoolean79 = false;
				local129 += 15;
			}
			if (Static51.aBoolean77) {
				Static48.aClass6_Sub3_Sub3_Sub1_2.method455(Static10.aClass63_258, local129, 16711680);
				Static51.aBoolean77 = false;
				local129 += 15;
			}
		}
		if (Static31.anInt1015 == 0) {
			return;
		}
		@Pc(223) int local223 = Static31.anInt1015 / 50;
		local129 = local223 / 60;
		@Pc(231) int local231 = local223 % 60;
		if (local231 >= 10) {
			Static48.aClass6_Sub3_Sub3_Sub1_2.method456(Static15.method374(new Class63[] { Static32.aClass63_602, Static118.method2114(local129), Static120.aClass63_1774, Static118.method2114(local231) }), 4, 329, 16776960);
		} else {
			Static48.aClass6_Sub3_Sub3_Sub1_2.method456(Static15.method374(new Class63[] { Static32.aClass63_602, Static118.method2114(local129), Static55.aClass63_886, Static118.method2114(local231) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILclient!wa;)V")
	public static void method1395(@OriginalArg(1) Class6_Sub3_Sub17 arg0) {
		@Pc(8) int local8 = arg0.anInt3233 >> 16;
		if (Static49.anInt1513 == local8 || Static79.anInt2158 == local8) {
			Static15.aBoolean29 = true;
		}
		if (local8 == Static25.anInt847 || Static111.anIntArray352[Static86.anInt2366] == local8) {
			Static10.aBoolean20 = true;
		}
	}
}
