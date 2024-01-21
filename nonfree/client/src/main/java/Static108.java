import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
	public static int anInt2633;

	@OriginalMember(owner = "client!n", name = "U", descriptor = "Z")
	public static boolean aBoolean123;

	@OriginalMember(owner = "client!n", name = "V", descriptor = "Lclient!ff;")
	public static Class24 aClass24_7;

	@OriginalMember(owner = "client!n", name = "W", descriptor = "I")
	public static int anInt2635;

	@OriginalMember(owner = "client!n", name = "X", descriptor = "Lclient!id;")
	public static Class35 aClass35_34;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1554 = Static107.method1838("Abbrechen");

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Lclient!ch;")
	public static Class14 aClass14_138 = new Class14(64);

	@OriginalMember(owner = "client!n", name = "S", descriptor = "Lclient!ch;")
	public static Class14 aClass14_139 = new Class14(200);

	@OriginalMember(owner = "client!n", name = "Y", descriptor = "[Lclient!nd;")
	public static Class54[] aClass54Array1 = new Class54[500];

	@OriginalMember(owner = "client!n", name = "Z", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1556 = Static107.method1838("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!n", name = "ab", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1557 = Static107.method1838("blaugr-Un:");

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
	public static void method1849() {
		aClass35_34 = null;
		aClass14_138 = null;
		aClass14_139 = null;
		aClass24_7 = null;
		aClass28_1557 = null;
		aClass54Array1 = null;
		aClass28_1554 = null;
		aClass28_1556 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lclient!gg;")
	public static Class28 method1850(@OriginalArg(1) int arg0) {
		return arg0 < 999999999 ? Static158.method2411(arg0) : Static116.aClass28_1657;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!jc;III)Z")
	public static boolean method1851(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) byte[] local9 = arg0.method1771(arg1, arg2);
		if (local9 == null) {
			return false;
		} else {
			Static45.method876(local9);
			return true;
		}
	}
}
