import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static183 {

	@OriginalMember(owner = "client!is", name = "c", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!is", name = "h", descriptor = "Lclient!um;")
	public static Class243 aClass243_101;

	@OriginalMember(owner = "client!is", name = "k", descriptor = "Lclient!um;")
	public static Class243 aClass243_102;

	@OriginalMember(owner = "client!is", name = "d", descriptor = "I")
	public static int anInt3097 = -1;

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(IZIII)V")
	public static void method2498(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg3;
		@Pc(17) int local17 = -arg3;
		@Pc(19) int local19 = -1;
		@Pc(27) int local27 = Static391.method5106(Static3.anInt45, arg2 + arg3, Static112.anInt1900);
		@Pc(36) int local36 = Static391.method5106(Static3.anInt45, arg2 - arg3, Static112.anInt1900);
		Static291.method3606(local27, Static133.anIntArrayArray15[arg0], arg1, local36);
		while (local7 < local9) {
			local19 += 2;
			local17 += local19;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(94) int local94;
			@Pc(103) int local103;
			if (local17 > 0) {
				local9--;
				local17 -= local9 << 1;
				local67 = arg0 - local9;
				local71 = local9 + arg0;
				if (local71 >= Static356.anInt5817 && local67 <= Static3.anInt46) {
					local94 = Static391.method5106(Static3.anInt45, arg2 + local7, Static112.anInt1900);
					local103 = Static391.method5106(Static3.anInt45, arg2 - local7, Static112.anInt1900);
					if (local71 <= Static3.anInt46) {
						Static291.method3606(local94, Static133.anIntArrayArray15[local71], arg1, local103);
					}
					if (Static356.anInt5817 <= local67) {
						Static291.method3606(local94, Static133.anIntArrayArray15[local67], arg1, local103);
					}
				}
			}
			local7++;
			local67 = arg0 - local7;
			local71 = arg0 + local7;
			if (local71 >= Static356.anInt5817 && Static3.anInt46 >= local67) {
				local94 = Static391.method5106(Static3.anInt45, local9 + arg2, Static112.anInt1900);
				local103 = Static391.method5106(Static3.anInt45, arg2 - local9, Static112.anInt1900);
				if (Static3.anInt46 >= local71) {
					Static291.method3606(local94, Static133.anIntArrayArray15[local71], arg1, local103);
				}
				if (Static356.anInt5817 <= local67) {
					Static291.method3606(local94, Static133.anIntArrayArray15[local67], arg1, local103);
				}
			}
		}
	}
}
