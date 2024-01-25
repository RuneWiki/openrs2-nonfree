import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static545 {

	@OriginalMember(owner = "client!sl", name = "g", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_312 = new Class179(56, 3);

	@OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I")
	public static int method7723(@OriginalArg(1) int arg0) {
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
