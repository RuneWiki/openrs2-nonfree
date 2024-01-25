import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
	public static int anInt7717;

	@OriginalMember(owner = "client!wp", name = "c", descriptor = "I")
	public static int anInt7719;

	@OriginalMember(owner = "client!wp", name = "d", descriptor = "Lclient!er;")
	public static Class64 aClass64_1;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!qw;I)V")
	public static void method6239(@OriginalArg(0) Class3_Sub38 arg0) {
		if (!Static367.aBoolean425) {
			arg0.method6288();
			Static276.anInt4608--;
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(BIIIII)V")
	public static void method6240(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg4 - arg1;
		@Pc(15) int local15 = arg2 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static229.method3306(arg4, arg1, arg3, arg0);
			}
		} else if (local10 == 0) {
			Static126.method1988(arg3, arg1, arg2, arg0);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(64) boolean local64 = local10 > local15;
			@Pc(68) int local68;
			@Pc(70) int local70;
			if (local64) {
				local68 = arg3;
				local70 = arg2;
				arg3 = arg1;
				arg1 = local68;
				arg2 = arg4;
				arg4 = local70;
			}
			if (arg2 < arg3) {
				local68 = arg3;
				local70 = arg1;
				arg3 = arg2;
				arg1 = arg4;
				arg2 = local68;
				arg4 = local70;
			}
			local68 = arg1;
			local70 = arg2 - arg3;
			@Pc(113) int local113 = arg4 - arg1;
			@Pc(118) int local118 = -(local70 >> 1);
			if (local113 < 0) {
				local113 = -local113;
			}
			@Pc(137) int local137 = arg1 < arg4 ? 1 : -1;
			@Pc(141) int local141;
			if (local64) {
				for (local141 = arg3; local141 <= arg2; local141++) {
					local118 += local113;
					Static296.anIntArrayArray42[local141][local68] = arg0;
					if (local118 > 0) {
						local118 -= local70;
						local68 += local137;
					}
				}
			} else {
				for (local141 = arg3; local141 <= arg2; local141++) {
					local118 += local113;
					Static296.anIntArrayArray42[local68][local141] = arg0;
					if (local118 > 0) {
						local118 -= local70;
						local68 += local137;
					}
				}
			}
		}
	}
}
