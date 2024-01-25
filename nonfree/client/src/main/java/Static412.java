import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static412 {

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "I")
	public static int anInt6979;

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
	public static int anInt6980 = 0;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)Z")
	public static boolean method6083(@OriginalArg(1) int arg0) {
		if (arg0 == 20 || arg0 == 11 || arg0 == 60 || arg0 == 17 || arg0 == 2) {
			return true;
		} else {
			return arg0 == 52 || arg0 == 1003;
		}
	}
}
