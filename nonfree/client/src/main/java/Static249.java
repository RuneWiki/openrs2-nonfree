import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static249 {

	@OriginalMember(owner = "client!jea", name = "e", descriptor = "I")
	public static int anInt8900;

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "I")
	public static int anInt8899 = -1;

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_141 = new Class287(27, 7);

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IBI)B")
	public static byte method6957(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IZ)Z")
	public static boolean method6960(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}
}
