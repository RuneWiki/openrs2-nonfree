import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static186 {

	@OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
	public static int anInt3871 = 0;

	@OriginalMember(owner = "client!mm", name = "c", descriptor = "(II)Z")
	public static boolean method3282(@OriginalArg(1) int arg0) {
		if (arg0 == 12 || arg0 == 48 || arg0 == 44 || arg0 == 57 || arg0 == 59) {
			return true;
		} else if (arg0 == 3 || arg0 == 45 || arg0 == 1005) {
			return true;
		} else if (arg0 == 15 || arg0 == 30 || arg0 == 19 || arg0 == 47 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 22 || arg0 == 5 || arg0 == 1004 || arg0 == 34;
		}
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!qs;IZ)V")
	public static void method3283(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(2) int arg2) {
		Static89.aClass172ArrayArray1[arg2][arg0] = arg1;
	}

	@OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILclient!fp;)Z")
	public static boolean method3284(@OriginalArg(1) Class74 arg0) {
		if (arg0 == null) {
			return false;
		} else if (!arg0.aBoolean125) {
			return false;
		} else if (!arg0.method1448()) {
			return false;
		} else if (Static142.aClass207_22.method5555((long) arg0.anInt1729) == null) {
			return Static136.aClass207_21.method5555((long) arg0.anInt1727) == null;
		} else {
			return false;
		}
	}
}
