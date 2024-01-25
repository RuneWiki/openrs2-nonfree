import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static440 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "I")
	public static int anInt6880;

	@OriginalMember(owner = "client!op", name = "k", descriptor = "Lclient!nh;")
	public static Class92 aClass92_7;

	@OriginalMember(owner = "client!op", name = "a", descriptor = "(II)Z")
	public static boolean method6065(@OriginalArg(1) int arg0) {
		return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
	}
}
