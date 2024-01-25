import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static228 {

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(II)Z")
	public static boolean method3763(@OriginalArg(0) int arg0) {
		if (arg0 == 11 || arg0 == 8 || arg0 == 46 || arg0 == 6 || arg0 == 23) {
			return true;
		} else {
			return arg0 == 59 || arg0 == 1006;
		}
	}
}
