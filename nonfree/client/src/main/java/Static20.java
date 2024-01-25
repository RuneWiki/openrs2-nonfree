import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static20 {

	@OriginalMember(owner = "client!bd", name = "K", descriptor = "Z")
	public static boolean aBoolean28;

	@OriginalMember(owner = "client!bd", name = "I", descriptor = "[J")
	public static final long[] aLongArray2 = new long[32];

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)I")
	public static int method556(@OriginalArg(1) int arg0) {
		if (arg0 < 96) {
			return 0;
		} else if (arg0 < 128) {
			return 2;
		} else {
			return 3;
		}
	}
}
