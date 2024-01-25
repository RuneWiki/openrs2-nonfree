import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!lca", name = "N", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(II)I")
	public static int method4780(@OriginalArg(1) int arg0) {
		return arg0 & 0x7F;
	}

	@OriginalMember(owner = "client!lca", name = "a", descriptor = "(BIII)I")
	public static int method4782(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg0;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg0;
		}
	}
}
