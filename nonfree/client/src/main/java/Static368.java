import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static368 {

	@OriginalMember(owner = "client!sm", name = "hb", descriptor = "I")
	public static int anInt6278;

	@OriginalMember(owner = "client!sm", name = "fb", descriptor = "I")
	public static int anInt6276 = 0;

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "(II)I")
	public static int method5070(@OriginalArg(1) int arg0) {
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
