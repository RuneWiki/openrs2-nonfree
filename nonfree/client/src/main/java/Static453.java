import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static453 {

	@OriginalMember(owner = "client!qba", name = "m", descriptor = "I")
	public static int anInt7627;

	@OriginalMember(owner = "client!qba", name = "q", descriptor = "Lclient!on;")
	public static Class262 aClass262_6;

	@OriginalMember(owner = "client!qba", name = "u", descriptor = "I")
	public static int anInt7633;

	@OriginalMember(owner = "client!qba", name = "a", descriptor = "(II)Z")
	public static boolean method6733(@OriginalArg(1) int arg0) {
		if (arg0 == 59 || arg0 == 6 || arg0 == 18 || arg0 == 11 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 9 || arg0 == 1002;
		}
	}
}
