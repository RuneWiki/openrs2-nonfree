import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static296 {

	@OriginalMember(owner = "client!wk", name = "W", descriptor = "[Lclient!ee;")
	public static Class48[] aClass48Array1;

	@OriginalMember(owner = "client!wk", name = "X", descriptor = "Lclient!jd;")
	public static Class84 aClass84_134;

	@OriginalMember(owner = "client!wk", name = "Q", descriptor = "Lclient!fa;")
	public static Class53 aClass53_13 = new Class53(128);

	@OriginalMember(owner = "client!wk", name = "T", descriptor = "I")
	public static int anInt6182 = 0;

	@OriginalMember(owner = "client!wk", name = "V", descriptor = "Ljava/lang/String;")
	public static String aString299 = null;

	@OriginalMember(owner = "client!wk", name = "Y", descriptor = "Ljava/lang/String;")
	public static String aString300 = "Connecting to update server";

	@OriginalMember(owner = "client!wk", name = "g", descriptor = "(I)V")
	public static void method4923() {
		Static150.method2607(false);
		System.gc();
		Static21.method453(25);
	}

	@OriginalMember(owner = "client!wk", name = "e", descriptor = "(B)V")
	public static void method4924() {
		@Pc(12) int local12 = Static52.method1039();
		if (local12 == 0) {
			Static104.aByteArrayArrayArray6 = null;
			Static237.method3915(0);
		} else if (local12 == 1) {
			Static180.method3127((byte) 0);
			Static237.method3915(512);
			if (Static134.aByteArrayArrayArray9 != null) {
				Static104.method1946();
			}
		} else {
			Static180.method3127((byte) (Static213.anInt4460 - 4 & 0xFF));
			Static237.method3915(2);
		}
	}
}
