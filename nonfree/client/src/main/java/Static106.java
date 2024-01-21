import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static106 {

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
	public static int anInt2328;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "Lclient!g;")
	public static Class26 aClass26_28;

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "Z")
	public static boolean aBoolean99;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "[Lclient!u;")
	public static Class74[] aClass74Array17 = new Class74[100];

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "J")
	public static long aLong83 = 0L;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "[I")
	public static int[] anIntArray328 = new int[5];

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_1491 = Static72.method1077("Keine Antwort vom Server)3");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!u;")
	public static Class74 aClass74_1492 = Static72.method1077("sl_button");

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!u;")
	public static Class74 aClass74_1493 = Static72.method1077(")1p");

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
	public static int anInt2330 = 0;

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
	public static int anInt2333 = 0;

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!u;")
	public static Class74 aClass74_1494 = Static72.method1077("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1596() {
		aShortArrayArray1 = null;
		aClass74_1494 = null;
		aClass74_1492 = null;
		aClass74_1491 = null;
		aClass74Array17 = null;
		aClass74_1493 = null;
		aClass26_28 = null;
		anIntArray328 = null;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V")
	public static void method1597(@OriginalArg(0) int arg0) {
		if (Static68.anInt1490 == arg0) {
			return;
		}
		if (Static68.anInt1490 == 0) {
			Static11.method254();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static2.anInt40 = 0;
			Static61.anInt1572 = 0;
			Static8.anInt255 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static64.aClass62_3 != null) {
			Static64.aClass62_3.method1347();
			Static64.aClass62_3 = null;
		}
		if (Static68.anInt1490 == 25 || Static68.anInt1490 == 40) {
			Static71.method1071();
			Static58.method698();
		}
		if (Static68.anInt1490 == 25) {
			Static77.anInt1674 = 0;
			Static61.anInt1576 = 0;
			Static34.anInt849 = 1;
			Static48.anInt1154 = 1;
			Static30.anInt728 = 0;
		}
		if (arg0 == 35) {
			Static112.method1683();
			Static36.method612();
			if (Static123.aClass9_56 == null) {
				Static123.aClass9_56 = Static80.method1253(503, 765, Static51.aCanvas2);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static123.aClass9_56 = null;
			Static112.method1683();
			Static15.method349(Static50.aClass26_Sub1_35, Static51.aCanvas2, Static55.aClass26_Sub1_20);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static123.aClass9_56 = null;
			Static36.method612();
			Static125.method1895(Static51.aCanvas2, Static50.aClass26_Sub1_35);
		}
		Static46.aBoolean43 = true;
		Static68.anInt1490 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILclient!u;)V")
	public static void method1598(@OriginalArg(0) int arg0, @OriginalArg(2) Class74 arg1) {
		Static128.aClass2_Sub10_Sub1_3.method1533(154);
		Static128.aClass2_Sub10_Sub1_3.method1493(arg1.method1696());
		Static128.aClass2_Sub10_Sub1_3.method1500(arg0);
	}
}
