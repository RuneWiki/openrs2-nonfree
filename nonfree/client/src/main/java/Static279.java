import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static279 {

	@OriginalMember(owner = "client!km", name = "p", descriptor = "[I")
	public static final int[] anIntArray360 = new int[4096];

	@OriginalMember(owner = "client!km", name = "r", descriptor = "[I")
	public static final int[] anIntArray361 = new int[8];

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(II)I")
	public static int method4841(@OriginalArg(0) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(BI)V")
	public static void method4842(@OriginalArg(1) int arg0) {
		Static364.anIntArray461 = new int[arg0];
		Static260.anIntArray333 = new int[arg0];
		Static429.anIntArray509 = new int[arg0];
		Static539.anIntArray649 = new int[arg0];
		Static331.anIntArray443 = new int[arg0];
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Z")
	public static boolean method4843() {
		return Static68.method1703("jaclib") ? Static68.method1703("hw3d") : false;
	}
}
