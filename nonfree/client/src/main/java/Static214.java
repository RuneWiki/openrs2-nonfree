import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static214 {

	@OriginalMember(owner = "client!hj", name = "h", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!hj", name = "d", descriptor = "[I")
	public static final int[] anIntArray246 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!hj", name = "f", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_70 = new Class268(87, -2);

	@OriginalMember(owner = "client!hj", name = "a", descriptor = "(CI)Z")
	public static boolean method3650(@OriginalArg(0) char arg0) {
		return arg0 >= '0' && arg0 <= '9' || arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}
}
