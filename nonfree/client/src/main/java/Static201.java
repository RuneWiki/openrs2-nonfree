import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!js", name = "K", descriptor = "[Lclient!eq;")
	public static Class70[] aClass70Array2;

	@OriginalMember(owner = "client!js", name = "L", descriptor = "Lclient!cr;")
	public static final Class40 aClass40_4 = new Class40();

	@OriginalMember(owner = "client!js", name = "b", descriptor = "(IIIB)I")
	public static int method3293(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 & 0x3;
		if (local7 == 0) {
			return arg0;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}
}
