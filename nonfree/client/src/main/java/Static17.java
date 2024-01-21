import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt536;

	@OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
	public static int anInt543;

	@OriginalMember(owner = "client!client", name = "Cb", descriptor = "[I")
	public static int[] anIntArray54;

	@OriginalMember(owner = "client!client", name = "Db", descriptor = "[I")
	public static int[] anIntArray55;

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!u;")
	private static Class74 aClass74_435 = Static72.method1077("Enter name of player to delete from list");

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!u;")
	public static Class74 aClass74_436 = Static72.method1077("Sprites geladen)3");

	@OriginalMember(owner = "client!client", name = "fb", descriptor = "[J")
	public static long[] aLongArray7 = new long[32];

	@OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
	public static int anInt540 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!client", name = "lb", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!client", name = "xb", descriptor = "Lclient!u;")
	private static Class74 aClass74_439 = Static72.method1077("Connection lost");

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "Lclient!u;")
	public static Class74 aClass74_437 = aClass74_439;

	@OriginalMember(owner = "client!client", name = "qb", descriptor = "Lclient!u;")
	public static Class74 aClass74_438 = Static72.method1077("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!client", name = "tb", descriptor = "[[I")
	public static int[][] anIntArrayArray5 = new int[5][5000];

	@OriginalMember(owner = "client!client", name = "ub", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1 = new byte[4][104][104];

	@OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
	public static int anInt548 = 0;

	@OriginalMember(owner = "client!client", name = "Ab", descriptor = "Lclient!u;")
	public static Class74 aClass74_440 = aClass74_435;

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(BII)Z")
	public static boolean method402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 0 && Static11.anInt336 == arg1) {
			return true;
		} else if (arg0 == 1 && Static116.anInt2466 == arg1) {
			return true;
		} else {
			return (arg0 == 2 || arg0 == 3) && Static117.anInt2525 == arg1;
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(II)Lclient!u;")
	public static Class74 method403() {
		@Pc(3) Class74 local3 = new Class74();
		local3.anInt2481 = 0;
		local3.aByteArray38 = new byte[100];
		return local3;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!g;I)V")
	public static void method404(@OriginalArg(0) Class26 arg0) {
		Static106.aClass26_28 = arg0;
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
	public static void method405() {
		aClass74_435 = null;
		anIntArrayArray5 = null;
		anIntArray54 = null;
		aByteArrayArrayArray1 = null;
		aClass74_439 = null;
		aClass74_438 = null;
		aClass74_440 = null;
		aClass74_437 = null;
		aLongArray7 = null;
		aClass74_436 = null;
		anIntArray55 = null;
	}
}
