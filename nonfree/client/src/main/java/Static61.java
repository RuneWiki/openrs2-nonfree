import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!jf", name = "V", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray2;

	@OriginalMember(owner = "client!jf", name = "ob", descriptor = "Lclient!wa;")
	public static Class81 aClass81_1;

	@OriginalMember(owner = "client!jf", name = "rb", descriptor = "Lclient!u;")
	public static Class72 aClass72_1;

	@OriginalMember(owner = "client!jf", name = "cb", descriptor = "Lclient!r;")
	public static Class61 aClass61_465 = Static129.method2060("Verbindung abgebrochen)3");

	@OriginalMember(owner = "client!jf", name = "jb", descriptor = "Lclient!r;")
	public static Class61 aClass61_466 = Static129.method2060("mapfunction");

	@OriginalMember(owner = "client!jf", name = "lb", descriptor = "[I")
	public static int[] anIntArray225 = new int[32768];

	@OriginalMember(owner = "client!jf", name = "nb", descriptor = "Z")
	public static boolean aBoolean57 = false;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(ILclient!r;)V")
	public static void method1053(@OriginalArg(1) Class61 arg0) {
		if (Static44.anInt1136 >= 2) {
			if (arg0.method1709(Static74.aClass61_546)) {
				System.gc();
			}
			if (arg0.method1709(Static44.aClass61_346)) {
				Static1.method7();
			}
			if (arg0.method1709(Static88.aClass61_1091)) {
				Static102.aBoolean98 = true;
			}
			if (arg0.method1709(Static123.aClass61_972)) {
				Static102.aBoolean98 = false;
			}
			if (arg0.method1709(Static96.aClass61_738)) {
				for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
					for (@Pc(46) int local46 = 1; local46 < 103; local46++) {
						for (@Pc(50) int local50 = 1; local50 < 103; local50++) {
							Static103.aClass66Array1[local42].anIntArrayArray22[local46][local50] = 0;
						}
					}
				}
			}
			if (arg0.method1709(Static52.aClass61_428) && Static30.anInt925 == 2) {
				throw new RuntimeException();
			}
			if (arg0.method1713(Static81.aClass61_1086)) {
				Static66.anInt1591 = arg0.method1724(12).method1716().method1704();
				Static91.method1596(null, Static123.method1929(new Class61[] { Static76.aClass61_573, Static39.method730(Static66.anInt1591) }), 0);
			}
			if (arg0.method1709(Static55.aClass61_440)) {
				Static30.aBoolean26 = true;
			}
		}
		Static1.aClass5_Sub14_Sub1_1.method1489(45);
		Static1.aClass5_Sub14_Sub1_1.method1440(arg0.method1733() - 1);
		Static1.aClass5_Sub14_Sub1_1.method1483(arg0.method1724(2));
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	public static void method1054() {
		aClass81_1 = null;
		aClass61_465 = null;
		aClass72_1 = null;
		anIntArrayArrayArray2 = null;
		anIntArray225 = null;
		aClass61_466 = null;
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V")
	public static void method1055() {
		Static1.aClass5_Sub14_Sub1_1.method1489(30);
		for (@Pc(25) Class5_Sub13 local25 = (Class5_Sub13) Static28.aClass20_3.method655(); local25 != null; local25 = (Class5_Sub13) Static28.aClass20_3.method649()) {
			if (local25.anInt2011 == 0 || local25.anInt2011 == 3) {
				Static123.method1930(local25, true);
			}
		}
		if (Static90.aClass5_Sub11_9 != null) {
			Static24.method505(Static90.aClass5_Sub11_9);
			Static90.aClass5_Sub11_9 = null;
		}
	}
}
