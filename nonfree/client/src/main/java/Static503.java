import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static503 {

	@OriginalMember(owner = "client!tf", name = "o", descriptor = "F")
	public static float aFloat166;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(CI)Z")
	public static boolean method6799(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
