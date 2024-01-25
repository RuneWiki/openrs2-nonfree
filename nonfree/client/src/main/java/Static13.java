import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static13 {

	@OriginalMember(owner = "client!aga", name = "b", descriptor = "Z")
	public static boolean aBoolean727;

	@OriginalMember(owner = "client!aga", name = "a", descriptor = "(II)Z")
	public static boolean method8716(@OriginalArg(0) int arg0) {
		if (arg0 == 51 || arg0 == 11 || arg0 == 2 || arg0 == 60 || arg0 == 48) {
			return true;
		} else {
			return arg0 == 57 || arg0 == 1011;
		}
	}
}
