import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static66 {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "[[I")
	public static int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!cca", name = "c", descriptor = "F")
	public static float aFloat7;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(IILclient!sha;)I")
	public static int method1148(@OriginalArg(1) int arg0, @OriginalArg(2) Class321 arg1) {
		if (!Static83.method1453(arg1).method5786(arg0) && arg1.anObjectArray22 == null) {
			return -1;
		} else if (arg1.anIntArray617 == null || arg0 >= arg1.anIntArray617.length) {
			return -1;
		} else {
			return arg1.anIntArray617[arg0];
		}
	}
}
