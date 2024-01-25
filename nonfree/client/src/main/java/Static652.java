import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static652 {

	@OriginalMember(owner = "client!w", name = "a", descriptor = "I")
	public static int anInt10663;

	@OriginalMember(owner = "client!w", name = "d", descriptor = "F")
	public static float aFloat216;

	@OriginalMember(owner = "client!w", name = "b", descriptor = "I")
	public static int anInt10664 = 0;

	@OriginalMember(owner = "client!w", name = "a", descriptor = "(III)Z")
	public static boolean method8996(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static527.method7220(arg0)) {
			return true;
		} else {
			return !Static527.method7220(arg1);
		}
	}
}
