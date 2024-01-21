import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static183 {

	@OriginalMember(owner = "client!td", name = "f", descriptor = "Lclient!eb;")
	public static Class25 aClass25_2;

	@OriginalMember(owner = "client!td", name = "r", descriptor = "Lclient!ae;")
	public static Class5 aClass5_6;

	@OriginalMember(owner = "client!td", name = "I", descriptor = "I")
	public static int anInt803;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "Z")
	private static boolean aBoolean49;

	@OriginalMember(owner = "client!td", name = "b", descriptor = "I")
	public static int anInt775 = 2;

	@OriginalMember(owner = "client!td", name = "c", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!td", name = "m", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_223 = Static181.method2795("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)Lclient!qe;")
	public static Class83 method625(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static67.method1268(new Class83[] { Static36.aClass83_294, Static129.method2179(arg0), Static158.aClass83_946 });
		} else if (arg0 < 10000000) {
			return Static67.method1268(new Class83[] { Static22.aClass83_136, Static129.method2179(arg0 / 1000), Static170.aClass83_1008, Static158.aClass83_946 });
		} else {
			return Static67.method1268(new Class83[] { Static171.aClass83_1014, Static129.method2179(arg0 / 1000000), Static143.aClass83_887, Static158.aClass83_946 });
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
	public static void method631() {
		Static180.aClass19_17 = new Class19();
	}
}
