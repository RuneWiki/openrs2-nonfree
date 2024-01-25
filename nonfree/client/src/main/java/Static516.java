import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!ria", name = "g", descriptor = "[I")
	public static final int[] anIntArray464 = new int[2];

	@OriginalMember(owner = "client!ria", name = "a", descriptor = "(ZIII)I")
	public static int method8013(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) int local12 = arg1 & 0x3;
		if (local12 == 0) {
			return arg2;
		} else if (local12 == 1) {
			return arg0;
		} else if (local12 == 2) {
			return 7 - arg2;
		} else {
			return 7 - arg0;
		}
	}
}
