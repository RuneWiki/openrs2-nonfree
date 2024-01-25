import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static216 {

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!mv;")
	public static Class194 aClass194_1;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "Lclient!rb;")
	public static final Class245 aClass245_13 = new Class245(10, 2, 2, 0);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIII)I")
	public static int method3435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg1;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg1;
		} else {
			return 7 - arg2;
		}
	}
}
