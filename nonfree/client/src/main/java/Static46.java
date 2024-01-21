import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static46 {

	@OriginalMember(owner = "client!fa", name = "hb", descriptor = "Lclient!fd;")
	public static Class20 aClass20_3;

	@OriginalMember(owner = "client!fa", name = "nb", descriptor = "[Z")
	public static boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!fa", name = "pb", descriptor = "Z")
	public static boolean aBoolean108;

	@OriginalMember(owner = "client!fa", name = "F", descriptor = "I")
	public static int anInt1505 = 0;

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "Lclient!dd;")
	public static Class13 aClass13_525 = Static161.method2971("mapdots");

	@OriginalMember(owner = "client!fa", name = "N", descriptor = "Z")
	public static boolean aBoolean106 = false;

	@OriginalMember(owner = "client!fa", name = "kb", descriptor = "Lclient!dd;")
	private static Class13 aClass13_531 = Static161.method2971("You have only just left another world)3");

	@OriginalMember(owner = "client!fa", name = "P", descriptor = "Lclient!dd;")
	public static Class13 aClass13_526 = aClass13_531;

	@OriginalMember(owner = "client!fa", name = "T", descriptor = "Lclient!dd;")
	public static Class13 aClass13_527 = Static161.method2971("0(U");

	@OriginalMember(owner = "client!fa", name = "U", descriptor = "[[I")
	public static int[][] anIntArrayArray8 = new int[104][104];

	@OriginalMember(owner = "client!fa", name = "V", descriptor = "Lclient!dd;")
	public static Class13 aClass13_528 = Static161.method2971("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1");

	@OriginalMember(owner = "client!fa", name = "db", descriptor = "Lclient!dd;")
	private static Class13 aClass13_530 = Static161.method2971("Examine");

	@OriginalMember(owner = "client!fa", name = "cb", descriptor = "Lclient!dd;")
	public static Class13 aClass13_529 = aClass13_530;

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(BI)Lclient!dd;")
	public static Class13 method1200(@OriginalArg(1) int arg0) {
		return Static57.method1349(new Class13[] { Static3.method75(arg0 >> 24 & 0xFF), Static147.aClass13_1232, Static3.method75(arg0 >> 16 & 0xFF), Static147.aClass13_1232, Static3.method75(arg0 >> 8 & 0xFF), Static147.aClass13_1232, Static3.method75(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	public static void method1206() {
		aClass13_529 = null;
		anIntArrayArray8 = null;
		aBooleanArray25 = null;
		aClass13_527 = null;
		aClass13_525 = null;
		aClass13_531 = null;
		aClass20_3 = null;
		aClass13_526 = null;
		aClass13_528 = null;
		aClass13_530 = null;
	}
}
