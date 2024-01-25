import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!il", name = "R", descriptor = "I")
	public static int anInt4519;

	@OriginalMember(owner = "client!il", name = "S", descriptor = "Lclient!oca;")
	public static Class237 aClass237_4;

	@OriginalMember(owner = "client!il", name = "V", descriptor = "I")
	public static int anInt4520;

	@OriginalMember(owner = "client!il", name = "N", descriptor = "[I")
	public static final int[] anIntArray286 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!il", name = "P", descriptor = "[I")
	public static final int[] anIntArray287 = new int[] { 4, 4, 1, 2, 6, 4, 2, 44, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0 };

	@OriginalMember(owner = "client!il", name = "T", descriptor = "[I")
	public static final int[] anIntArray288 = new int[] { 3, 7, 15 };

	@OriginalMember(owner = "client!il", name = "W", descriptor = "I")
	public static int anInt4521 = 1;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IBIIII)V")
	public static void method3822(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 - arg4;
		@Pc(14) int local14 = arg3 - arg1;
		if (local14 == 0) {
			if (local9 != 0) {
				Static443.method6923(arg0, arg1, arg2, arg4);
			}
		} else if (local9 == 0) {
			Static32.method2513(arg2, arg3, arg1, arg4);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(61) boolean local61 = local14 < local9;
			@Pc(65) int local65;
			@Pc(67) int local67;
			if (local61) {
				local65 = arg1;
				local67 = arg3;
				arg1 = arg4;
				arg4 = local65;
				arg3 = arg0;
				arg0 = local67;
			}
			if (arg1 > arg3) {
				local65 = arg1;
				local67 = arg4;
				arg1 = arg3;
				arg3 = local65;
				arg4 = arg0;
				arg0 = local67;
			}
			local65 = arg4;
			local67 = arg3 - arg1;
			@Pc(106) int local106 = arg0 - arg4;
			@Pc(111) int local111 = -(local67 >> 1);
			@Pc(118) int local118 = arg0 > arg4 ? 1 : -1;
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(127) int local127;
			if (local61) {
				for (local127 = arg1; local127 <= arg3; local127++) {
					local111 += local106;
					Static333.anIntArrayArray56[local127][local65] = arg2;
					if (local111 > 0) {
						local65 += local118;
						local111 -= local67;
					}
				}
			} else {
				for (local127 = arg1; local127 <= arg3; local127++) {
					Static333.anIntArrayArray56[local65][local127] = arg2;
					local111 += local106;
					if (local111 > 0) {
						local65 += local118;
						local111 -= local67;
					}
				}
			}
		}
	}
}
