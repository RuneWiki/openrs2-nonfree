import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static46 {

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "[I")
	public static int[] anIntArray98 = new int[] { -1, -1, 1, 1 };

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!sd;")
	private static Class73 aClass73_623 = Static122.method531("Location");

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!sd;")
	public static Class73 aClass73_622 = aClass73_623;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "I")
	public static int anInt1059 = -1;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!vd;)Lclient!sd;")
	public static Class73 method809(@OriginalArg(1) Class83 arg0) {
		if (Static172.method2691(Static127.method484(arg0)) == 0) {
			return null;
		} else if (arg0.aClass73_1981 == null || arg0.aClass73_1981.method2442().method2435() == 0) {
			return Static8.aBoolean16 ? Static101.aClass73_1305 : null;
		} else {
			return arg0.aClass73_1981;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public static void method810() {
		anIntArray98 = null;
		aClass73_622 = null;
		aClass73_623 = null;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	public static void method811(@OriginalArg(0) int arg0) {
		Static41.anInt1005 = arg0;
	}
}
