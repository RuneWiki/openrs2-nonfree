import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static222 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
	public static int anInt4361;

	@OriginalMember(owner = "client!hg", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIII)I")
	public static int method4017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg2 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return arg0;
		} else if (local3 == 2) {
			return 4095 - arg1;
		} else {
			return 4095 - arg0;
		}
	}
}
