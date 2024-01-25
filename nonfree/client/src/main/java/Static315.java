import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static315 {

	@OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
	public static int anInt5650;

	@OriginalMember(owner = "client!pj", name = "o", descriptor = "Lclient!gn;")
	public static Class97 aClass97_4;

	@OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
	public static int anInt5651 = 0;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Z")
	public static boolean method4489(@OriginalArg(1) int arg0) {
		if (arg0 == 15 || arg0 == 3 || arg0 == 57 || arg0 == 23 || arg0 == 44) {
			return true;
		} else {
			return arg0 == 45 || arg0 == 1006;
		}
	}
}
