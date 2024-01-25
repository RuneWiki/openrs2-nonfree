import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!oj", name = "g", descriptor = "[[B")
	public static byte[][] aByteArrayArray14;

	@OriginalMember(owner = "client!oj", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray15;

	@OriginalMember(owner = "client!oj", name = "b", descriptor = "[I")
	public static final int[] anIntArray343 = new int[5];

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIII)I")
	public static int method4129(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg2;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 1023 - arg2;
		} else {
			return 1023 - arg0;
		}
	}
}
