import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static496 {

	@OriginalMember(owner = "client!taa", name = "h", descriptor = "Lclient!iba;")
	public static Class140 aClass140_2;

	@OriginalMember(owner = "client!taa", name = "g", descriptor = "Lclient!cga;")
	public static final Class47 aClass47_128 = new Class47(4, 1);

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "(IIII)I")
	public static int method6749(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 7 - arg0;
		} else if (local3 == 2) {
			return 7 - arg1;
		} else {
			return arg0;
		}
	}
}
