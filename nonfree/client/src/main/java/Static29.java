import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!fc;")
	public static Class21 aClass21_7;

	@OriginalMember(owner = "client!g", name = "w", descriptor = "I")
	public static int anInt1151;

	@OriginalMember(owner = "client!g", name = "y", descriptor = "Lclient!fc;")
	public static Class21 aClass21_8;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!le;")
	public static Class36 aClass36_13 = new Class36(100);

	@OriginalMember(owner = "client!g", name = "v", descriptor = "Lclient!rc;")
	public static Class55 aClass55_431 = Static34.method846("");

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!rc;")
	public static Class55 aClass55_424 = aClass55_431;

	@OriginalMember(owner = "client!g", name = "n", descriptor = "Lclient!rc;")
	public static Class55 aClass55_425 = aClass55_431;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!rc;")
	public static Class55 aClass55_426 = Static34.method846("Handel)4Duell");

	@OriginalMember(owner = "client!g", name = "r", descriptor = "Lclient!rc;")
	private static Class55 aClass55_428 = Static34.method846("Could not complete login)3");

	@OriginalMember(owner = "client!g", name = "p", descriptor = "Lclient!rc;")
	public static Class55 aClass55_427 = aClass55_428;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!rc;")
	public static Class55 aClass55_429 = aClass55_431;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "[Lclient!rc;")
	public static Class55[] aClass55Array10 = new Class55[100];

	@OriginalMember(owner = "client!g", name = "u", descriptor = "Lclient!rc;")
	public static Class55 aClass55_430 = aClass55_431;

	@OriginalMember(owner = "client!g", name = "x", descriptor = "Lclient!rc;")
	public static Class55 aClass55_432 = Static34.method846("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!g", name = "z", descriptor = "I")
	public static int anInt1152 = -1;

	@OriginalMember(owner = "client!g", name = "A", descriptor = "Lclient!rc;")
	public static Class55 aClass55_433 = aClass55_431;

	@OriginalMember(owner = "client!g", name = "B", descriptor = "I")
	public static int anInt1153 = 0;

	@OriginalMember(owner = "client!g", name = "C", descriptor = "Lclient!rc;")
	public static Class55 aClass55_434 = aClass55_431;

	@OriginalMember(owner = "client!g", name = "D", descriptor = "[J")
	public static long[] aLongArray3 = new long[100];

	@OriginalMember(owner = "client!g", name = "E", descriptor = "Lclient!rc;")
	public static Class55 aClass55_435 = Static34.method846("null");

	@OriginalMember(owner = "client!g", name = "F", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method741() {
		aClass55Array10 = null;
		aClass55_431 = null;
		aClass21_8 = null;
		aClass21_7 = null;
		aClass55_424 = null;
		aClass55_427 = null;
		aClass55_430 = null;
		aClass55_425 = null;
		aClass55_434 = null;
		aClass55_435 = null;
		aLongArray3 = null;
		aClass55_429 = null;
		aClass36_13 = null;
		aClass55_426 = null;
		aClass55_428 = null;
		aClass55_433 = null;
		aClass55_432 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)V")
	public static void method742() {
		Static96.method1856(Static76.anInt2217);
		if (Static24.anInt1098 != -1) {
			Static96.method1856(Static24.anInt1098);
		}
		Static45.anInt1477 = 0;
		Static33.aClass21_9.method1445();
		Static43.anIntArray140 = Static30.method790(Static43.anIntArray140);
		Static53.method1279();
		Static69.method1383(Static76.anInt2217, 503, 765, 0);
		if (Static24.anInt1098 != -1) {
			Static69.method1383(Static24.anInt1098, 503, 765, 0);
		}
		if (Static109.aBoolean163) {
			Static109.method2036();
		} else {
			Static71.method1425();
			Static100.method1915();
		}
		try {
			@Pc(61) Graphics local61 = Static32.aCanvas1.getGraphics();
			Static33.aClass21_9.method1442(0, local61, 0);
		} catch (@Pc(69) Exception local69) {
			Static32.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(B)V")
	public static void method743() {
		if (Static25.aString4.toLowerCase().indexOf("microsoft") != -1) {
			Static9.anIntArray27[186] = 57;
			Static9.anIntArray27[187] = 27;
			Static9.anIntArray27[188] = 71;
			Static9.anIntArray27[189] = 26;
			Static9.anIntArray27[190] = 72;
			Static9.anIntArray27[191] = 73;
			Static9.anIntArray27[192] = 58;
			Static9.anIntArray27[219] = 42;
			Static9.anIntArray27[220] = 74;
			Static9.anIntArray27[221] = 43;
			Static9.anIntArray27[222] = 59;
			Static9.anIntArray27[223] = 28;
			return;
		}
		Static9.anIntArray27[44] = 71;
		Static9.anIntArray27[45] = 26;
		Static9.anIntArray27[46] = 72;
		Static9.anIntArray27[47] = 73;
		Static9.anIntArray27[59] = 57;
		Static9.anIntArray27[61] = 27;
		Static9.anIntArray27[91] = 42;
		Static9.anIntArray27[92] = 74;
		Static9.anIntArray27[93] = 43;
		if (Static25.aMethod2 == null) {
			Static9.anIntArray27[192] = 58;
			Static9.anIntArray27[222] = 59;
		} else {
			Static9.anIntArray27[192] = 28;
			Static9.anIntArray27[222] = 58;
			Static9.anIntArray27[520] = 59;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
	public static void method744() {
		if (Static57.aClass5_1 == null) {
			return;
		}
		Static32.method800();
		if (Static52.anInt1647 > 0) {
			Static57.aClass5_1.method1602(256);
			Static52.anInt1647 = 0;
		}
		Static57.aClass5_1.method1607();
		Static57.aClass5_1 = null;
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(Z)V")
	public static void method745() {
		for (@Pc(14) Class6_Sub12 local14 = (Class6_Sub12) Static109.aClass3_12.method31(); local14 != null; local14 = (Class6_Sub12) Static109.aClass3_12.method26()) {
			if (local14.anInt2382 > 0) {
				local14.anInt2382--;
			}
			if (local14.anInt2382 != 0) {
				if (local14.anInt2397 > 0) {
					local14.anInt2397--;
				}
				if (local14.anInt2397 == 0 && local14.anInt2388 >= 1 && local14.anInt2385 >= 1 && local14.anInt2388 <= 102 && local14.anInt2385 <= 102 && (local14.anInt2395 < 0 || Static91.method1742(local14.anInt2395, local14.anInt2380))) {
					Static21.method647(local14.anInt2388, local14.anInt2395, local14.anInt2385, local14.anInt2393, local14.anInt2380, local14.anInt2396, local14.anInt2381);
					local14.anInt2397 = -1;
					if (local14.anInt2399 == local14.anInt2395 && local14.anInt2399 == -1) {
						local14.method2083();
					} else if (local14.anInt2399 == local14.anInt2395 && local14.anInt2396 == local14.anInt2379 && local14.anInt2380 == local14.anInt2398) {
						local14.method2083();
					}
				}
			} else if (local14.anInt2399 < 0 || Static91.method1742(local14.anInt2399, local14.anInt2398)) {
				Static21.method647(local14.anInt2388, local14.anInt2399, local14.anInt2385, local14.anInt2393, local14.anInt2398, local14.anInt2379, local14.anInt2381);
				local14.method2083();
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "c", descriptor = "(B)V")
	public static void method746() {
		Static17.aClass36_10.method1155();
	}
}
