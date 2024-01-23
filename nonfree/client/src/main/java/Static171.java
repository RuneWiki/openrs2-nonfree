import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static171 {

	@OriginalMember(owner = "client!ri", name = "R", descriptor = "Lclient!i;")
	public static Class41 aClass41_1060 = Static184.method2923("event_opbase");

	@OriginalMember(owner = "client!ri", name = "S", descriptor = "[I")
	public static int[] anIntArray419 = new int[100];

	@OriginalMember(owner = "client!ri", name = "Y", descriptor = "[I")
	public static int[] anIntArray420 = new int[5];

	@OriginalMember(owner = "client!ri", name = "Z", descriptor = "Lclient!i;")
	public static Class41 aClass41_1061 = Static184.method2923(" loggt sich aus)3");

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(II)I")
	public static int method2772(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!q;I)Lclient!i;")
	public static Class41 method2773(@OriginalArg(0) Class80 arg0) {
		if (Static76.method598(Static70.method1287(arg0)) == 0) {
			return null;
		} else if (arg0.aClass41_985 == null || arg0.aClass41_985.method1391().method1393() == 0) {
			return Static102.aBoolean133 ? Static111.aClass41_771 : null;
		} else {
			return arg0.aClass41_985;
		}
	}
}
