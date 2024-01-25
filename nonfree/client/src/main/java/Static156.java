import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static156 {

	@OriginalMember(owner = "client!fca", name = "ab", descriptor = "I")
	public static int anInt5829;

	@OriginalMember(owner = "client!fca", name = "ub", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_105 = new Class126(72, -1);

	@OriginalMember(owner = "client!fca", name = "yb", descriptor = "I")
	public static int anInt5851 = 0;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(II)Z")
	public static boolean method4836(@OriginalArg(1) int arg0) {
		if (arg0 == 5 || arg0 == 52 || arg0 == 58 || arg0 == 3 || arg0 == 60) {
			return true;
		} else {
			return arg0 == 45 || arg0 == 1009;
		}
	}
}
