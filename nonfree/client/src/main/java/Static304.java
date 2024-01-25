import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static304 {

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
	public static int anInt5294;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)I")
	public static int method4242(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
