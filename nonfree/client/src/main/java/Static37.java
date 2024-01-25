import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "I")
	public static int anInt1235;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Ljava/lang/Object;")
	public static Object anObject12;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray2 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "[[I")
	public static final int[][] anIntArrayArray3 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!bf", name = "m", descriptor = "I")
	public static int anInt1238 = 0;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)I")
	public static int method1061(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 * (arg0 * arg0 >> 12) >> 12;
		@Pc(19) int local19 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (local19 * arg0 >> 12) + 40960;
		return local13 * local32 >> 12;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIIB)I")
	public static int method1063(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = arg5 & 0x3;
		if ((arg4 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg1;
			arg1 = local16;
		}
		if (local7 == 0) {
			return arg3;
		} else if (local7 == 1) {
			return arg2;
		} else if (local7 == 2) {
			return 1 + 7 - arg0 - arg3;
		} else {
			return 8 - arg2 - arg1;
		}
	}
}
