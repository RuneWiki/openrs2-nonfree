import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bda", name = "rb", descriptor = "[I")
	public static final int[] anIntArray49 = new int[200];

	@OriginalMember(owner = "client!bda", name = "Bb", descriptor = "I")
	public static int anInt817 = 1;

	@OriginalMember(owner = "client!bda", name = "Ib", descriptor = "I")
	public static int anInt820 = 0;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIIII)I")
	public static int method562(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg0 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(14) int local14 = arg4;
			arg4 = arg1;
			arg1 = local14;
		}
		if (local3 == 0) {
			return arg3;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 + 1 - arg3 - arg4;
		} else {
			return 1 + 7 - arg1 - arg2;
		}
	}
}
