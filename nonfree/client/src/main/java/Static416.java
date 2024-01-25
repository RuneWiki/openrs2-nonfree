import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static416 {

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "[Lclient!vb;")
	public static Class317_Sub1[] aClass317_Sub1Array1;

	@OriginalMember(owner = "client!pw", name = "q", descriptor = "Lclient!pu;")
	public static Class270 aClass270_86;

	@OriginalMember(owner = "client!pw", name = "v", descriptor = "Lclient!pu;")
	public static Class270 aClass270_87;

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(IB)Z")
	public static boolean method5728(@OriginalArg(0) int arg0) {
		if (arg0 == 15 || arg0 == 13 || arg0 == 49 || arg0 == 30 || arg0 == 45) {
			return true;
		} else {
			return arg0 == 25 || arg0 == 1007;
		}
	}
}
