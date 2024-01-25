import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
	public static int anInt1589;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZI)I")
	public static int method1508(@OriginalArg(0) boolean arg0) {
		@Pc(10) int local10 = Static552.anInt9486;
		if (local10 == 0) {
			return arg0 ? 0 : Static483.anInt8552;
		} else if (local10 == 1) {
			return Static483.anInt8552;
		} else if (local10 == 2) {
			return 0;
		} else {
			return 0;
		}
	}
}
