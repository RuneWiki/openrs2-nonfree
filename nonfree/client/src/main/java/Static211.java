import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static211 {

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!q;")
	public static Class93 aClass93_7;

	@OriginalMember(owner = "client!i", name = "o", descriptor = "Z")
	public static boolean aBoolean213 = false;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(FI)F")
	public static float method2364(@OriginalArg(0) float arg0) {
		return arg0 * arg0 * arg0 * ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F);
	}
}
