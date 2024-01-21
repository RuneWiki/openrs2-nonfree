import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static168 {

	@OriginalMember(owner = "client!t", name = "r", descriptor = "I")
	public static int anInt3761;

	@OriginalMember(owner = "client!t", name = "A", descriptor = "J")
	public static long aLong127;

	@OriginalMember(owner = "client!t", name = "T", descriptor = "Lclient!bc;")
	public static Class1 aClass1_31;

	@OriginalMember(owner = "client!t", name = "s", descriptor = "I")
	public static int anInt3762 = -1;

	@OriginalMember(owner = "client!t", name = "t", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1452 = Static120.method1824(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!t", name = "y", descriptor = "[I")
	public static final int[] anIntArray459 = new int[4000];

	@OriginalMember(owner = "client!t", name = "W", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1459 = Static120.method1824("flash1:");

	@OriginalMember(owner = "client!t", name = "z", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1453 = aClass80_1459;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1454 = Static120.method1824("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!t", name = "U", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1458 = Static120.method1824("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!t", name = "D", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1455 = aClass80_1458;

	@OriginalMember(owner = "client!t", name = "E", descriptor = "I")
	public static final int anInt3768 = 50;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "I")
	public static int anInt3770 = 0;

	@OriginalMember(owner = "client!t", name = "J", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1456 = Static120.method1824(" more options");

	@OriginalMember(owner = "client!t", name = "Q", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1457 = aClass80_1459;

	@OriginalMember(owner = "client!t", name = "R", descriptor = "[I")
	public static final int[] anIntArray460 = new int[2048];

	@OriginalMember(owner = "client!t", name = "X", descriptor = "[S")
	public static final short[] aShortArray47 = new short[] { -1, -1, -1, -1, -1 };

	@OriginalMember(owner = "client!t", name = "Y", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1460 = aClass80_1456;

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(II)V")
	public static void method2708(@OriginalArg(0) int arg0) {
		if (Static188.anIntArray514 == null || arg0 > Static188.anIntArray514.length) {
			Static188.anIntArray514 = new int[arg0];
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILclient!lh;)V")
	public static void method2710(@OriginalArg(1) Class3_Sub16 arg0) {
		Static181.method2906(200000, arg0);
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(II)I")
	public static int method2711(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}
}
