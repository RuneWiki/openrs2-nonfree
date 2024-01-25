import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static62 {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(BI)Z")
	public static boolean method916(@OriginalArg(1) int arg0) {
		if (arg0 == 11 || arg0 == 51 || arg0 == 16 || arg0 == 19 || arg0 == 59) {
			return true;
		} else {
			return arg0 == 20 || arg0 == 1011;
		}
	}
}
