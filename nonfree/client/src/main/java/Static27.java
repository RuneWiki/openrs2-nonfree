import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static27 {

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[8];

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)Z")
	public static boolean method683(@OriginalArg(1) int arg0) {
		if (arg0 == 5 || arg0 == 3 || arg0 == 18 || arg0 == 44 || arg0 == 48) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1010;
		}
	}
}
