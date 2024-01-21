import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static34 {

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "Lclient!g;")
	public static Class26 aClass26_5;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "J")
	public static long aLong41;

	@OriginalMember(owner = "client!fd", name = "v", descriptor = "[Lclient!ae;")
	public static Class2_Sub2_Sub1_Sub1[] aClass2_Sub2_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "Lclient!u;")
	public static Class74 aClass74_618 = Static72.method1077("lila:");

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Lclient!u;")
	private static Class74 aClass74_619 = Static72.method1077("Login limit exceeded)3");

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "Lclient!u;")
	public static Class74 aClass74_620 = aClass74_619;

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "Lclient!u;")
	public static Class74 aClass74_621 = Static72.method1077("(U");

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "Lclient!u;")
	private static Class74 aClass74_623 = Static72.method1077("Loading ignore list");

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!u;")
	public static Class74 aClass74_622 = aClass74_623;

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Lclient!u;")
	public static Class74 aClass74_624 = Static72.method1077(" (X");

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!u;")
	public static Class74 aClass74_625 = Static72.method1077(")1j");

	@OriginalMember(owner = "client!fd", name = "w", descriptor = "Lclient!u;")
	public static Class74 aClass74_626 = Static72.method1077("*6n");

	@OriginalMember(owner = "client!fd", name = "A", descriptor = "I")
	public static int anInt849 = 1;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method600() {
		aClass26_5 = null;
		aClass74_625 = null;
		aClass74_623 = null;
		aClass74_618 = null;
		aClass74_620 = null;
		aClass74_621 = null;
		aClass74_624 = null;
		aClass2_Sub2_Sub1_Sub1Array2 = null;
		aClass74_622 = null;
		aClass74_619 = null;
		aClass74_626 = null;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!ve;I)Lclient!u;")
	public static Class74 method601(@OriginalArg(0) Class2_Sub2_Sub17 arg0) {
		if (Static89.method1326(Static19.method429(arg0)) == 0) {
			return null;
		} else if (arg0.aClass74_1693 == null || arg0.aClass74_1693.method1718().method1695() == 0) {
			return Static67.aBoolean58 ? Static67.aClass74_1037 : null;
		} else {
			return arg0.aClass74_1693;
		}
	}
}
