import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!se", name = "kb", descriptor = "[I")
	public static int[] anIntArray366 = new int[] { 0, 0, 6, -2, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, -1, 1, 0, 3, 0, 0, 8, 4, -1, 28, 0, 0, 10, 0, 0, 0, 6, 0, 0, -1, -2, 0, 0, 17, 0, 0, 10, 10, -2, 0, 3, -2, 9, 14, 0, 8, 0, 0, 12, 5, 0, 0, 0, 12, 0, 0, 11, 0, 0, 0, 0, 1, 0, 0, 0, 0, 12, 5, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, -1, 2, 0, 5, 0, 2, 0, 0, 8, 7, 0, 0, 0, -2, 0, 4, 6, 0, 8, 0, 6, -2, 0, 8, 0, 0, 7, 3, 0, 0, -1, 10, 14, 0, 0, 7, 0, 15, 0, 0, 6, 0, 8, 0, -1, 0, 6, 0, 0, -1, 0, 0, 0, 0, 0, 6, 0, 0, 0, -2, 0, 0, 0, 0, 0, 2, 0, 0, 2, -1, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -1, 0, 0, -1, 6, -1, 0, 7, -1, 0, 0, 1, 0, 0, 6, 0, 0, 1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 8, 8, 15, 0, 0, 0, 8, 0, 0, 0, 0, -1, 0, 0, 0, 3, 0, 0, 2, 0, 0, 0, -1, 6, 3, 4, 0, 20, 0, 0, -2, 0, 0, 0, 0, 0, 0, 0, 3, -2, 0, 0, 5, 0, 0, 0, 2, 12, -2, 0, 1, 0, -1, -2, 0, 0, 6, 0, -2 };

	@OriginalMember(owner = "client!se", name = "rb", descriptor = "[I")
	public static int[] anIntArray367 = new int[32];

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
	public static void method3516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 - arg4;
		@Pc(13) int local13 = arg2 - arg3;
		if (local9 == 0) {
			if (local13 != 0) {
				Static19.method362(arg4, arg3, arg1, arg2);
			}
		} else if (local13 == 0) {
			Static91.method1949(arg3, arg1, arg0, arg4);
		} else {
			if (local13 < 0) {
				local13 = -local13;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(59) boolean local59 = local9 < local13;
			@Pc(63) int local63;
			@Pc(67) int local67;
			if (local59) {
				local63 = arg4;
				arg4 = arg3;
				local67 = arg0;
				arg0 = arg2;
				arg2 = local67;
				arg3 = local63;
			}
			if (arg4 > arg0) {
				local67 = arg3;
				local63 = arg4;
				arg3 = arg2;
				arg2 = local67;
				arg4 = arg0;
				arg0 = local63;
			}
			local63 = arg3;
			local67 = arg0 - arg4;
			@Pc(108) int local108 = arg2 - arg3;
			@Pc(113) int local113 = -(local67 >> 1);
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(128) int local128 = arg3 >= arg2 ? -1 : 1;
			@Pc(132) int local132;
			if (local59) {
				for (local132 = arg4; local132 <= arg0; local132++) {
					local113 += local108;
					Static29.anIntArrayArray10[local132][local63] = arg1;
					if (local113 > 0) {
						local63 += local128;
						local113 -= local67;
					}
				}
			} else {
				for (local132 = arg4; local132 <= arg0; local132++) {
					local113 += local108;
					Static29.anIntArrayArray10[local63][local132] = arg1;
					if (local113 > 0) {
						local63 += local128;
						local113 -= local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(B)I")
	public static int method3527() {
		if (Static254.aClass151_2 == null) {
			return -1;
		}
		while (Static32.anInt934 < Static254.aClass151_2.anInt5555) {
			if (Static254.aClass151_2.method4219(Static32.anInt934)) {
				return Static32.anInt934++;
			}
			Static32.anInt934++;
		}
		return -1;
	}
}
