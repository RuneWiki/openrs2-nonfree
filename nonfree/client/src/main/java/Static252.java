import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static252 {

	@OriginalMember(owner = "client!mk", name = "L", descriptor = "[I")
	public static final int[] anIntArray456 = new int[13];

	@OriginalMember(owner = "client!mk", name = "d", descriptor = "(II)Z")
	public static boolean method3680(@OriginalArg(0) int arg0) {
		if (arg0 == 57 || arg0 == 10 || arg0 == 16 || arg0 == 59 || arg0 == 15) {
			return true;
		} else {
			return arg0 == 47 || arg0 == 1008;
		}
	}
}
