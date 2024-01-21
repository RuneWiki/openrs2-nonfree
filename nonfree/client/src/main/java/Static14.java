import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "[Z")
	public static boolean[] aBooleanArray8;

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
	public static int anInt612;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public static int anInt600 = 0;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
	public static int anInt601 = 0;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!gg;")
	public static Class28 aClass28_408 = Static107.method1838("Ung-Ultige Session)2ID)3");

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Lclient!gg;")
	private static Class28 aClass28_411 = Static107.method1838("Checking for updates )2 ");

	@OriginalMember(owner = "client!bc", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_409 = aClass28_411;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	public static int anInt609 = 0;

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "Lclient!gg;")
	private static Class28 aClass28_414 = Static107.method1838(" has logged out)3");

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "Lclient!gg;")
	public static Class28 aClass28_410 = aClass28_414;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "Lclient!gg;")
	public static Class28 aClass28_412 = Static107.method1838("Mitglieder)2Welt");

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "Lclient!gg;")
	public static Class28 aClass28_413 = Static107.method1838("(U(Y");

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "[[I")
	public static int[][] anIntArrayArray1 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "[I")
	public static int[] anIntArray39 = new int[5];

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public static void method389() {
		aBooleanArray8 = null;
		aClass28_410 = null;
		anIntArray39 = null;
		aClass28_413 = null;
		aClass28_409 = null;
		aClass28_414 = null;
		aClass28_408 = null;
		aClass28_411 = null;
		aClass28_412 = null;
		anIntArrayArray1 = null;
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(B)V")
	public static void method395() {
		if (Static155.aClass22_4 != null) {
			Static155.aClass22_4.method962();
			Static155.aClass22_4 = null;
		}
		Static48.method901();
		Static153.method2370();
		for (@Pc(24) int local24 = 0; local24 < 4; local24++) {
			Static141.aClass36Array1[local24].method1374();
		}
		System.gc();
		Static85.method1512();
		Static148.aBoolean151 = false;
		Static6.anInt373 = -1;
		Static114.method1903();
		Static110.method1877(10);
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
	public static int method396(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(25) int local25 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local25;
		}
		return arg1;
	}
}
