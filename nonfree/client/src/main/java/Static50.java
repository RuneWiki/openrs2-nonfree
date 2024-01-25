import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static50 {

	@OriginalMember(owner = "client!c", name = "a", descriptor = "(BC)Z")
	public static boolean method1267(@OriginalArg(1) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
