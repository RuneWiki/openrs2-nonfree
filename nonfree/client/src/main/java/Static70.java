import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static70 {

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "I")
	public static int anInt1246;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "I")
	public static int anInt1247;

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	public static int anInt1250 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIB)I")
	public static int method1030(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(13) int local13 = arg5;
			arg5 = arg2;
			arg2 = local13;
		}
		@Pc(25) int local25 = arg4 & 0x3;
		if (local25 == 0) {
			return arg1;
		} else if (local25 == 1) {
			return arg3;
		} else if (local25 == 2) {
			return 7 + 1 - arg1 - arg5;
		} else {
			return 7 + 1 - arg3 - arg2;
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)I")
	public static int method1031(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(48) int local48 = Static368.method4613(arg0 + 45365, arg1 + 91923, 4) + (Static368.method4613(arg0 + 10294, arg1 - -37821, 2) - 128 >> 1) + (Static368.method4613(arg0, arg1, 1) - 128 >> 2) - 128;
		local48 = (int) ((double) local48 * 0.3D) + 35;
		if (local48 < 10) {
			local48 = 10;
		} else if (local48 > 60) {
			local48 = 60;
		}
		return local48;
	}
}
