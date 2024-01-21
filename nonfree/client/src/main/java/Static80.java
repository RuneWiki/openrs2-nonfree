import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!nd", name = "q", descriptor = "Lclient!ef;")
	public static Class16 aClass16_94;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "[I")
	public static int[] anIntArray221 = new int[200];

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
	public static int anInt2211 = 0;

	@OriginalMember(owner = "client!nd", name = "v", descriptor = "Lclient!he;")
	private static Class26 aClass26_1126 = Static6.method100("Ok");

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!he;")
	public static Class26 aClass26_1118 = aClass26_1126;

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!he;")
	private static Class26 aClass26_1121 = Static6.method100("Loaded config");

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!he;")
	public static Class26 aClass26_1119 = aClass26_1121;

	@OriginalMember(owner = "client!nd", name = "l", descriptor = "Lclient!he;")
	public static Class26 aClass26_1120 = Static6.method100("<col=00ff00>");

	@OriginalMember(owner = "client!nd", name = "n", descriptor = "Lclient!he;")
	public static Class26 aClass26_1122 = Static6.method100("Bitte benutzen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Lclient!he;")
	public static Class26 aClass26_1123 = null;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "Lclient!he;")
	public static Class26 aClass26_1124 = Static6.method100("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "Lclient!he;")
	public static Class26 aClass26_1125 = Static6.method100("<col=ffb000>");

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "J")
	public static long aLong68 = 0L;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Z")
	public static boolean method1392(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
	public static void method1393() {
		aClass16_94 = null;
		aClass26_1121 = null;
		aClass26_1125 = null;
		aClass26_1118 = null;
		aClass26_1119 = null;
		anIntArray221 = null;
		aClass26_1124 = null;
		aClass26_1120 = null;
		aClass26_1122 = null;
		aClass26_1126 = null;
		aClass26_1123 = null;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method1394() {
		Static107.aClass66_25.method1971();
		Static110.aClass66_26.method1971();
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	public static void method1395() {
		Static110.method2004(Static109.aClass3_Sub14_15);
		Static43.anInt2688++;
		if (Static93.aBoolean140 && Static54.aBoolean86) {
			@Pc(26) int local26 = Static59.anInt1807;
			local26 -= Static122.anInt3177;
			@Pc(32) int local32 = Static7.anInt187;
			local32 -= Static116.anInt3059;
			if (Static3.anInt92 > local26) {
				local26 = Static3.anInt92;
			}
			if (Static96.aClass3_Sub14_14.anInt2146 + Static3.anInt92 < local26 - -Static109.aClass3_Sub14_15.anInt2146) {
				local26 = Static96.aClass3_Sub14_14.anInt2146 + Static3.anInt92 - Static109.aClass3_Sub14_15.anInt2146;
			}
			@Pc(76) int local76 = local26 - Static54.anInt1628;
			if (local32 < Static43.anInt2683) {
				local32 = Static43.anInt2683;
			}
			if (Static109.aClass3_Sub14_15.anInt2161 + local32 > Static96.aClass3_Sub14_14.anInt2161 + Static43.anInt2683) {
				local32 = Static43.anInt2683 + Static96.aClass3_Sub14_14.anInt2161 - Static109.aClass3_Sub14_15.anInt2161;
			}
			@Pc(104) int local104 = local32 - Static31.anInt2746;
			@Pc(107) int local107 = Static109.aClass3_Sub14_15.anInt2200;
			@Pc(115) int local115 = Static96.aClass3_Sub14_14.anInt2193 + local32 - Static43.anInt2683;
			@Pc(124) int local124 = local26 + Static96.aClass3_Sub14_14.anInt2189 - Static3.anInt92;
			if (Static43.anInt2688 > Static109.aClass3_Sub14_15.anInt2169 && (local107 < local76 || local76 < -local107 || local107 < local104 || -local107 > local104)) {
				Static32.aBoolean59 = true;
			}
			@Pc(157) Class3_Sub15 local157;
			if (Static109.aClass3_Sub14_15.anObjectArray5 != null && Static32.aBoolean59) {
				local157 = new Class3_Sub15();
				local157.aClass3_Sub14_11 = Static109.aClass3_Sub14_15;
				local157.anInt2357 = local115;
				local157.anObjectArray28 = Static109.aClass3_Sub14_15.anObjectArray5;
				local157.anInt2352 = local124;
				Static28.method595(local157);
			}
			if (Static21.anInt826 == 0) {
				if (Static32.aBoolean59) {
					if (Static109.aClass3_Sub14_15.anObjectArray10 != null) {
						local157 = new Class3_Sub15();
						local157.aClass3_Sub14_11 = Static109.aClass3_Sub14_15;
						local157.anObjectArray28 = Static109.aClass3_Sub14_15.anObjectArray10;
						local157.anInt2352 = local124;
						local157.anInt2357 = local115;
						local157.aClass3_Sub14_10 = Static91.aClass3_Sub14_13;
						Static28.method595(local157);
					}
					if (Static91.aClass3_Sub14_13 != null && Static6.method96(Static109.aClass3_Sub14_15) != null) {
						Static107.aClass3_Sub11_Sub1_3.method1029(233);
						Static107.aClass3_Sub11_Sub1_3.method972(Static91.aClass3_Sub14_13.anInt2150);
						Static107.aClass3_Sub11_Sub1_3.method983(Static109.aClass3_Sub14_15.anInt2150);
						Static107.aClass3_Sub11_Sub1_3.method1009(Static109.aClass3_Sub14_15.anInt2154);
						Static107.aClass3_Sub11_Sub1_3.method976(Static91.aClass3_Sub14_13.anInt2154);
					}
				} else if ((Static131.anInt3266 == 1 || Static66.method1634(Static56.anInt1695 - 1)) && Static56.anInt1695 > 2) {
					Static15.method263();
				} else if (Static56.anInt1695 > 0) {
					Static70.method986(Static56.anInt1695 - 1);
				}
				Static109.aClass3_Sub14_15 = null;
			}
		} else if (Static43.anInt2688 > 1) {
			Static109.aClass3_Sub14_15 = null;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)I")
	public static int method1396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub2 local10 = (Class3_Sub2) Static52.aClass17_8.method599((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && local10.anIntArray17.length > arg0) {
			return local10.anIntArray17[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(III)I")
	public static int method1397(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(43) int local43 = Static21.method478(arg1 - 1, arg0 + -1) + Static21.method478(arg1 + 1, arg0 - 1) + Static21.method478(arg1 - 1, arg0 - -1) + Static21.method478(arg1 + 1, arg0 + 1);
		@Pc(74) int local74 = Static21.method478(arg1 - 1, arg0) + Static21.method478(arg1 + 1, arg0) + Static21.method478(arg1, arg0 - 1) + Static21.method478(arg1, arg0 + 1);
		@Pc(79) int local79 = Static21.method478(arg1, arg0);
		return local79 / 4 + local74 / 8 + local43 / 16;
	}
}
