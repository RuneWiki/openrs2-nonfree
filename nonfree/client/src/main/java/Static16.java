import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!cc", name = "J", descriptor = "Lclient!h;")
	public static Class1_Sub1_Sub2_Sub3_Sub1 aClass1_Sub1_Sub2_Sub3_Sub1_3;

	@OriginalMember(owner = "client!cc", name = "U", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray5;

	@OriginalMember(owner = "client!cc", name = "V", descriptor = "[I")
	public static int[] anIntArray63;

	@OriginalMember(owner = "client!cc", name = "D", descriptor = "Lclient!id;")
	public static Class34 aClass34_343 = Static9.method266("headicons_prayer");

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "Lclient!id;")
	public static Class34 aClass34_344 = Static9.method266("Sprites geladen)3");

	@OriginalMember(owner = "client!cc", name = "H", descriptor = "I")
	public static int anInt633 = 1;

	@OriginalMember(owner = "client!cc", name = "K", descriptor = "Lclient!id;")
	public static Class34 aClass34_345 = Static9.method266("Willkommen auf RuneScape");

	@OriginalMember(owner = "client!cc", name = "Q", descriptor = "Lclient!id;")
	public static Class34 aClass34_346 = Static9.method266("::rect_debug");

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZIZ)I")
	public static int method378() {
		return Static31.anInt926 + Static11.anInt487;
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(B)V")
	public static void method379() {
		if (!Static67.aBoolean95) {
			return;
		}
		Static37.aClass1_Sub1_Sub2_Sub2Array3 = null;
		Static49.anIntArray152 = null;
		Static34.aClass1_Sub1_Sub2_Sub2Array1 = null;
		Static44.anIntArray126 = null;
		Static34.aClass1_Sub1_Sub2_Sub2Array2 = null;
		Static81.anIntArray262 = null;
		Static75.aClass1_Sub1_Sub2_Sub1_4 = null;
		Static21.aClass1_Sub1_Sub2_Sub1_1 = null;
		Static23.anIntArray80 = null;
		Static76.anIntArray237 = null;
		Static124.aClass1_Sub1_Sub2_Sub1Array9 = null;
		Static105.aClass1_Sub1_Sub2_Sub2_13 = null;
		Static47.anIntArray143 = null;
		Static59.anIntArray176 = null;
		Static60.aClass1_Sub1_Sub2_Sub2_6 = null;
		Static20.anIntArray75 = null;
		Static123.aClass1_Sub1_Sub2_Sub2Array10 = null;
		Static13.aClass1_Sub1_Sub2_Sub2_4 = null;
		Static93.aClass1_Sub1_Sub2_Sub2Array9 = null;
		Static92.aClass1_Sub1_Sub2_Sub2_12 = null;
		Static70.method1197();
		Static78.method1365(true);
		Static67.aBoolean95 = false;
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(III)Lclient!id;")
	public static Class34 method380(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 - arg1;
		if (local7 < -9) {
			return Static59.aClass34_770;
		} else if (local7 < -6) {
			return Static133.aClass34_1597;
		} else if (local7 < -3) {
			return Static69.aClass34_851;
		} else if (local7 < 0) {
			return Static90.aClass34_1583;
		} else if (local7 > 9) {
			return Static30.aClass34_449;
		} else if (local7 > 6) {
			return Static55.aClass34_739;
		} else if (local7 > 3) {
			return Static117.aClass34_354;
		} else if (local7 > 0) {
			return Static132.aClass34_1586;
		} else {
			return Static31.aClass34_451;
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(II)Lclient!t;")
	public static Class1_Sub1_Sub13 method381(@OriginalArg(1) int arg0) {
		@Pc(10) Class1_Sub1_Sub13 local10 = (Class1_Sub1_Sub13) Static92.aClass63_16.method1663((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static62.aClass35_14.method1573(1, arg0);
		local10 = new Class1_Sub1_Sub13();
		if (local20 != null) {
			local10.method1815(new Class1_Sub19(local20), arg0);
		}
		local10.method1820();
		Static92.aClass63_16.method1659(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "(B)V")
	public static void method382() {
		Static72.method1264();
		Static128.method1997();
		Static29.method550();
		Static2.method99();
		Static88.method1490();
		Static62.method1058();
		Static45.method1846();
		Static124.method1964();
		Static70.method1201();
		Static19.method396();
		Static60.method1039();
		Static98.method1653();
		((Class74) Static108.anInterface2_1).method1874();
		Static114.aClass63_23.method1665();
		Static102.aClass35_Sub1_24.method1581();
		Static9.aClass35_Sub1_7.method1581();
		Static106.aClass35_Sub1_25.method1581();
		Static133.aClass35_Sub1_29.method1581();
		Static10.aClass35_Sub1_8.method1581();
		Static32.aClass35_Sub1_12.method1581();
		Static74.aClass35_Sub1_16.method1581();
		Static51.aClass35_Sub1_13.method1581();
		Static10.aClass35_Sub1_9.method1581();
		Static128.aClass35_Sub1_28.method1581();
		Static80.aClass35_Sub1_17.method1581();
		Static81.aClass35_Sub1_19.method1581();
	}

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "(III)V")
	public static void method383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static7.anInt426 != 0 && arg0 != -1) {
			Static87.method1485(arg0, 0, Static80.aClass35_Sub1_17, Static7.anInt426);
			Static64.aBoolean94 = true;
		}
	}

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "(B)V")
	public static void method384() {
		aClass34_343 = null;
		aClass34_345 = null;
		aByteArrayArrayArray5 = null;
		aClass34_346 = null;
		anIntArray63 = null;
		aClass1_Sub1_Sub2_Sub3_Sub1_3 = null;
		aClass34_344 = null;
	}
}
