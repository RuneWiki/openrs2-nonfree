import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static237 {

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "Lclient!rg;")
	public static Class310 aClass310_52;

	@OriginalMember(owner = "client!hu", name = "e", descriptor = "D")
	public static double aDouble14;

	@OriginalMember(owner = "client!hu", name = "f", descriptor = "[I")
	public static final int[] anIntArray231 = new int[2];

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
	public static int anInt4576 = 0;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(III)B")
	public static byte method3982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(CB)Z")
	public static boolean method3983(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
