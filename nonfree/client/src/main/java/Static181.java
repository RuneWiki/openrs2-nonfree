import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static181 {

	@OriginalMember(owner = "client!gga", name = "s", descriptor = "Lclient!vs;")
	public static Class363 aClass363_4;

	@OriginalMember(owner = "client!gga", name = "v", descriptor = "[I")
	public static int[] anIntArray182;

	@OriginalMember(owner = "client!gga", name = "w", descriptor = "Lclient!mda;")
	public static Class188 aClass188_3;

	@OriginalMember(owner = "client!gga", name = "r", descriptor = "Lclient!gr;")
	public static final Class130 aClass130_56 = new Class130(43, 2);

	@OriginalMember(owner = "client!gga", name = "a", descriptor = "(IIZ)Z")
	public static boolean method3130(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 1000 && arg0 < 1000) {
			return true;
		} else if (arg1 >= 1000 || arg0 >= 1000) {
			return arg1 >= 1000 && arg0 >= 1000;
		} else if (Static556.method8017(arg1)) {
			return false;
		} else {
			return Static556.method8017(arg0);
		}
	}
}
