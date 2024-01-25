import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!wg", name = "P", descriptor = "Z")
	public static boolean aBoolean505 = false;

	@OriginalMember(owner = "client!wg", name = "Z", descriptor = "[I")
	public static final int[] anIntArray504 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!wg", name = "ab", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_194 = new Class163(12, -1);

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)I")
	public static int method6149(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 7 - arg1;
		} else if (local7 == 2) {
			return 7 - arg2;
		} else {
			return arg1;
		}
	}
}
