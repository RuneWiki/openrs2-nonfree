import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static100 {

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "I")
	public static int anInt2238 = 0;

	@OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
	public static int anInt2246 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(CB)Z")
	public static boolean method1742(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9';
	}
}
