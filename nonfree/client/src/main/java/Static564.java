import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static564 {

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "[I")
	public static int[] anIntArray823 = new int[2];

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(CI)Z")
	public static boolean method7988(@OriginalArg(0) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}
}
