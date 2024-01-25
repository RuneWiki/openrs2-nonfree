import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
	public static int anInt5395;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "D")
	public static double aDouble11 = -1.0D;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZI)Z")
	public static boolean method4439(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 >= 1000 && arg1 < 1000) {
			return true;
		} else if (arg0 >= 1000 || arg1 >= 1000) {
			return arg0 >= 1000 && arg1 >= 1000;
		} else if (Static359.method5653(arg0)) {
			return false;
		} else {
			return Static359.method5653(arg1);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IZII)I")
	public static int method4441(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class8_Sub18 local10 = Static211.method4038(arg1, arg0);
		if (local10 == null) {
			return 0;
		} else if (arg2 >= 0 && local10.anIntArray154.length > arg2) {
			return local10.anIntArray154[arg2];
		} else {
			return 0;
		}
	}
}
