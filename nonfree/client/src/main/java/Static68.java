import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static68 {

	@OriginalMember(owner = "client!ec", name = "G", descriptor = "Lclient!tq;")
	public static Class191 aClass191_41;

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
	public static int anInt1466;

	@OriginalMember(owner = "client!ec", name = "N", descriptor = "[I")
	public static final int[] anIntArray151 = new int[14];

	@OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
	public static int anInt1468 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIII)V")
	public static void method1535(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg3;
		@Pc(15) int local15 = arg1 - arg4;
		if (local15 == 0) {
			if (local10 != 0) {
				Static86.method1933(arg4, arg0, arg3, arg2);
			}
		} else if (local10 == 0) {
			Static170.method2884(arg1, arg0, arg4, arg3);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(68) boolean local68 = local15 < local10;
			@Pc(72) int local72;
			@Pc(76) int local76;
			if (local68) {
				local72 = arg4;
				arg4 = arg3;
				local76 = arg1;
				arg3 = local72;
				arg1 = arg2;
				arg2 = local76;
			}
			if (arg1 < arg4) {
				local72 = arg4;
				local76 = arg3;
				arg4 = arg1;
				arg1 = local72;
				arg3 = arg2;
				arg2 = local76;
			}
			local72 = arg3;
			local76 = arg1 - arg4;
			@Pc(113) int local113 = arg2 - arg3;
			@Pc(122) int local122 = -(local76 >> 1);
			if (local113 < 0) {
				local113 = -local113;
			}
			@Pc(134) int local134 = arg2 <= arg3 ? -1 : 1;
			@Pc(138) int local138;
			if (local68) {
				for (local138 = arg4; local138 <= arg1; local138++) {
					Static146.anIntArrayArray91[local138][local72] = arg0;
					local122 += local113;
					if (local122 > 0) {
						local122 -= local76;
						local72 += local134;
					}
				}
			} else {
				for (local138 = arg4; local138 <= arg1; local138++) {
					Static146.anIntArrayArray91[local72][local138] = arg0;
					local122 += local113;
					if (local122 > 0) {
						local122 -= local76;
						local72 += local134;
					}
				}
			}
		}
	}
}
