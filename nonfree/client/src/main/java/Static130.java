import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static130 {

	@OriginalMember(owner = "client!wa", name = "t", descriptor = "Lclient!ea;")
	public static Class20 aClass20_61;

	@OriginalMember(owner = "client!wa", name = "x", descriptor = "Lclient!dc;")
	public static Class17 aClass17_4;

	@OriginalMember(owner = "client!wa", name = "r", descriptor = "[I")
	public static int[] anIntArray339 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!wa", name = "u", descriptor = "I")
	public static int anInt3086 = -1;

	@OriginalMember(owner = "client!wa", name = "B", descriptor = "Lclient!ec;")
	public static Class22 aClass22_952 = Static60.method1113("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
	public static int anInt3095 = 0;

	@OriginalMember(owner = "client!wa", name = "J", descriptor = "Lclient!ec;")
	public static Class22 aClass22_953 = Static60.method1113("http:)4)4");

	@OriginalMember(owner = "client!wa", name = "K", descriptor = "Z")
	public static boolean aBoolean279 = false;

	@OriginalMember(owner = "client!wa", name = "T", descriptor = "Lclient!ec;")
	public static Class22 aClass22_954 = Static60.method1113("<br>");

	@OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
	public static int anInt3100 = 0;

	@OriginalMember(owner = "client!wa", name = "bb", descriptor = "I")
	public static int anInt3102 = 0;

	@OriginalMember(owner = "client!wa", name = "eb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_955 = Static60.method1113("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(B)V")
	public static void method2004() {
		if (Static30.aClass4_Sub7_6 != null || Static133.aClass4_Sub7_16 != null) {
			return;
		}
		@Pc(17) int local17 = Static65.anInt1845;
		@Pc(24) int local24;
		@Pc(26) int local26;
		@Pc(75) int local75;
		if (Static22.aBoolean250) {
			if (local17 != 1) {
				local24 = Static72.anInt1914;
				local26 = Static117.anInt2876;
				if (Static31.anInt801 - 10 > local24 || local24 > Static31.anInt801 + Static39.anInt974 + 10 || Static101.anInt2612 - 10 > local26 || local26 > Static101.anInt2612 + Static91.anInt2422 + 10) {
					Static22.aBoolean250 = false;
					Static51.method989(Static31.anInt801, Static101.anInt2612, Static39.anInt974, Static91.anInt2422);
				}
			}
			if (local17 == 1) {
				local24 = Static31.anInt801;
				local26 = Static101.anInt2612;
				local75 = Static39.anInt974;
				@Pc(77) int local77 = Static8.anInt2382;
				@Pc(79) int local79 = Static55.anInt1118;
				@Pc(81) int local81 = -1;
				for (@Pc(83) int local83 = 0; local83 < Static99.anInt2589; local83++) {
					@Pc(99) int local99 = local26 + (Static99.anInt2589 - local83 - 1) * 15 + 31;
					if (local24 < local77 && local24 + local75 > local77 && local79 > local99 - 13 && local99 + 3 > local79) {
						local81 = local83;
					}
				}
				if (local81 != -1) {
					Static12.method172(local81);
				}
				Static22.aBoolean250 = false;
				Static51.method989(Static31.anInt801, Static101.anInt2612, Static39.anInt974, Static91.anInt2422);
				return;
			}
			return;
		}
		if (local17 == 1 && Static99.anInt2589 > 0) {
			local24 = Static38.anIntArray111[Static99.anInt2589 - 1];
			if (local24 == 38 || local24 == 15 || local24 == 51 || local24 == 18 || local24 == 41 || local24 == 17 || local24 == 30 || local24 == 7 || local24 == 19 || local24 == 35 || local24 == 21 || local24 == 1004) {
				local26 = Static101.anIntArray290[Static99.anInt2589 - 1];
				local75 = Static133.anIntArray344[Static99.anInt2589 - 1];
				@Pc(232) Class4_Sub7 local232 = Static106.method1749(local75);
				if (Static12.method171(Static124.method1890(local232)) || Static48.method899(Static124.method1890(local232))) {
					Static90.anInt2395 = 0;
					Static59.aBoolean158 = false;
					if (Static30.aClass4_Sub7_6 != null) {
						Static110.method1772(Static30.aClass4_Sub7_6);
					}
					Static30.aClass4_Sub7_6 = Static106.method1749(local75);
					Static78.anInt2045 = Static55.anInt1118;
					Static94.anInt2532 = Static8.anInt2382;
					Static89.anInt2376 = local26;
					Static110.method1772(Static30.aClass4_Sub7_6);
					return;
				}
			}
		}
		if (local17 == 1 && (Static104.anInt2626 == 1 && Static99.anInt2589 > 2 || Static28.method446(Static99.anInt2589 - 1))) {
			local17 = 2;
		}
		if (local17 == 1 && Static99.anInt2589 > 0) {
			Static12.method172(Static99.anInt2589 - 1);
		}
		if (local17 != 2 || Static99.anInt2589 <= 0) {
			return;
		}
		Static113.method1803();
	}

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "(I)V")
	public static void method2005() {
		aClass20_61 = null;
		aClass22_955 = null;
		aClass22_954 = null;
		aClass17_4 = null;
		anIntArray339 = null;
		aClass22_952 = null;
		aClass22_953 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIB)V")
	public static void method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static24.method396(arg0)) {
			Static46.method891(Static65.aClass4_Sub7ArrayArray1[arg0], arg1);
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)Z")
	public static boolean method2007(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ec;BLclient!jd;)I")
	public static int method2008(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		@Pc(11) int local11 = arg1.anInt1099;
		arg1.method732(arg0.anInt668);
		arg1.anInt1099 += Static75.aClass10_1.method168(0, arg0.anInt668, arg1.anInt1099, arg0.aByteArray7, arg1.aByteArray9);
		return arg1.anInt1099 - local11;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ea;IIIZI)V")
	public static void method2009(@OriginalArg(0) Class20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		Static105.anInt2640 = arg3;
		Static132.anInt3135 = arg1;
		Static30.aClass20_17 = arg0;
		Static49.anInt1330 = arg2;
		Static80.anInt2197 = 1;
		Static101.aBoolean232 = false;
		Static60.anInt1790 = 10000;
	}
}
