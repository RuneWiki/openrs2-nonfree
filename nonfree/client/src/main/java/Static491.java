import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static491 {

	@OriginalMember(owner = "client!rk", name = "c", descriptor = "[I")
	public static int[] anIntArray491;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "[I")
	public static final int[] anIntArray490 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Z")
	public static boolean method7186(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}
}
