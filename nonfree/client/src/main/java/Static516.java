import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static516 {

	@OriginalMember(owner = "client!tr", name = "c", descriptor = "[I")
	public static final int[] anIntArray643 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!tr", name = "a", descriptor = "(BII)Z")
	public static boolean method7139(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static441.method6277(arg0, arg1)) {
			return (arg0 & 0xB000) != 0 | Static571.method7639(arg0, arg1) | Static38.method1002(arg0, arg1) ? true : (arg1 & 0x37) == 0 & (Static263.method4410(arg0, arg1) | Static545.method7397(arg1, arg0));
		} else {
			return false;
		}
	}
}
