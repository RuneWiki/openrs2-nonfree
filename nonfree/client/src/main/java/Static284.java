import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static284 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "Z")
	public static boolean aBoolean341 = false;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(CB)Z")
	public static boolean method4265(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
