import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static291 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	public static int anInt5230 = 0;

	@OriginalMember(owner = "client!jc", name = "c", descriptor = "I")
	public static int anInt5231 = 0;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZI)I")
	public static int method4409(@OriginalArg(1) int arg0) {
		if (arg0 == 6406) {
			return 1;
		} else if (arg0 == 6409) {
			return 1;
		} else if (arg0 == 32841) {
			return 1;
		} else if (arg0 == 6410) {
			return 2;
		} else if (arg0 == 6407) {
			return 3;
		} else if (arg0 == 6408) {
			return 4;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
