import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static108 {

	@OriginalMember(owner = "client!nc", name = "N", descriptor = "Lclient!cb;")
	public static Class13_Sub1 aClass13_Sub1_12;

	@OriginalMember(owner = "client!nc", name = "X", descriptor = "[Lclient!re;")
	public static Class3_Sub1_Sub3_Sub4[] aClass3_Sub1_Sub3_Sub4Array9;

	@OriginalMember(owner = "client!nc", name = "R", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1445 = Static122.method531("Welcome to RuneScape");

	@OriginalMember(owner = "client!nc", name = "L", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1444 = aClass73_1445;

	@OriginalMember(owner = "client!nc", name = "O", descriptor = "Lclient!dc;")
	public static Class18 aClass18_1 = new Class18();

	@OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
	public static int anInt2483 = 99;

	@OriginalMember(owner = "client!nc", name = "S", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1446 = Static122.method531("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!nc", name = "U", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
	public static int anInt2486 = 0;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)V")
	public static void method1934() {
		aClass73_1444 = null;
		aClass18_1 = null;
		aClass73_1445 = null;
		aClass3_Sub1_Sub3_Sub4Array9 = null;
		aClass73_1446 = null;
		aClass13_Sub1_12 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZILclient!vd;)Lclient!sd;")
	public static Class73 method1935(@OriginalArg(1) int arg0, @OriginalArg(2) Class83 arg1) {
		if (!Static61.method1115(arg0, Static127.method484(arg1)) && arg1.anObjectArray8 == null) {
			return null;
		} else if (arg1.aClass73Array26 == null || arg1.aClass73Array26.length <= arg0 || arg1.aClass73Array26[arg0] == null || arg1.aClass73Array26[arg0].method2442().method2435() == 0) {
			return Static8.aBoolean16 ? Static19.method372(new Class73[] { Static99.aClass73_1261, Static154.method2485(arg0) }) : null;
		} else {
			return arg1.aClass73Array26[arg0];
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public static void method1936() {
		Static167.aByteArrayArrayArray8 = null;
		Static90.aByteArrayArrayArray4 = null;
		Static98.anIntArray224 = null;
		Static96.anIntArray222 = null;
		Static125.anIntArray309 = null;
		Static65.aByteArrayArrayArray3 = null;
		Static135.aByteArrayArrayArray6 = null;
		Static22.anIntArray61 = null;
		Static139.anIntArrayArray22 = null;
		Static5.anIntArrayArrayArray1 = null;
		Static165.aByteArrayArrayArray2 = null;
		Static181.anIntArray434 = null;
	}
}
