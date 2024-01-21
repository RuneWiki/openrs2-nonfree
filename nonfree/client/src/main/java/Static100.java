import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "Lclient!pd;")
	public static Class20 aClass20_50;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
	public static int anInt2492;

	@OriginalMember(owner = "client!ra", name = "e", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_54;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "Lclient!ja;")
	private static Class39 aClass39_1296 = Static28.method504("wave2:");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1293 = aClass39_1296;

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1294 = Static28.method504("hitmarks");

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1295 = aClass39_1296;

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "[Lclient!ja;")
	public static Class39[] aClass39Array18 = new Class39[100];

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1297 = Static28.method504("(U4");

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "Lclient!ja;")
	public static Class39 aClass39_1298 = Static28.method504("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method1812() {
		Static101.aClass12_68.method233();
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
	public static void method1813() {
		aClass39_1296 = null;
		aClass39_1293 = null;
		aClass39_1298 = null;
		aClass39_1297 = null;
		aClass39_1295 = null;
		aClass4_Sub5_54 = null;
		aClass39Array18 = null;
		aClass20_50 = null;
		aClass39_1294 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)Z")
	public static boolean method1814(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
