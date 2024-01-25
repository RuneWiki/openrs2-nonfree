import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static257 {

	@OriginalMember(owner = "client!jca", name = "b", descriptor = "F")
	public static float aFloat107;

	@OriginalMember(owner = "client!jca", name = "g", descriptor = "[I")
	public static int[] anIntArray296;

	@OriginalMember(owner = "client!jca", name = "c", descriptor = "I")
	public static int anInt4846 = 0;

	@OriginalMember(owner = "client!jca", name = "e", descriptor = "J")
	public static long aLong118 = 0L;

	@OriginalMember(owner = "client!jca", name = "a", descriptor = "(II)I")
	public static int method4273(@OriginalArg(0) int arg0) {
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
