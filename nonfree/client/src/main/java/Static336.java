import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static336 {

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "[I")
	public static final int[] anIntArray463 = new int[13];

	@OriginalMember(owner = "client!mr", name = "k", descriptor = "[I")
	public static int[] anIntArray464 = new int[2];

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(II)Z")
	public static boolean method5142(@OriginalArg(1) int arg0) {
		if (arg0 == 13 || arg0 == 15 || arg0 == 19 || arg0 == 18 || arg0 == 47) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1012;
		}
	}
}
