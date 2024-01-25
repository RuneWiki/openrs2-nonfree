import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Lclient!gf;")
	public static final Class102 aClass102_2 = new Class102();

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
	public static boolean method4185(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x70000) != 0 | Static477.method6910(arg0, arg1) || Static90.method2166(arg0, arg1);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg1 < 0 || Static542.anInt9387 - 1 <= arg6 || Static36.anInt1324 - 1 <= arg1) {
			return;
		}
		if (Static313.aClass206ArrayArrayArray2 == null) {
			return;
		}
		@Pc(45) Interface17 local45;
		if (arg2 == 0) {
			local45 = (Interface17) Static503.method7224(arg3, arg6, arg1);
			@Pc(51) Interface17 local51 = (Interface17) Static193.method3623(arg3, arg6, arg1);
			if (local45 != null && arg4 != 2) {
				if (local45 instanceof Class47_Sub4_Sub2) {
					((Class47_Sub4_Sub2) local45).aClass79_3.method2415(arg0);
				} else {
					Static81.method2026(arg3, local45.method7172(), arg2, arg5, arg4, arg6, arg1, arg0);
				}
			}
			if (local51 != null) {
				if (!(local51 instanceof Class47_Sub4_Sub2)) {
					Static81.method2026(arg3, local51.method7172(), arg2, arg5, arg4, arg6, arg1, arg0);
					return;
				}
				((Class47_Sub4_Sub2) local51).aClass79_3.method2415(arg0);
				return;
			}
			return;
		}
		if (arg2 == 1) {
			local45 = (Interface17) Static313.method5162(arg3, arg6, arg1);
			if (local45 != null) {
				if (local45 instanceof Class47_Sub5_Sub3) {
					((Class47_Sub5_Sub3) local45).aClass79_4.method2415(arg0);
					return;
				}
				@Pc(140) int local140 = local45.method7172();
				if (arg4 != 4 && arg4 != 5) {
					if (arg4 == 6) {
						Static81.method2026(arg3, local140, arg2, arg5 + 4, 4, arg6, arg1, arg0);
						return;
					}
					if (arg4 == 7) {
						Static81.method2026(arg3, local140, arg2, (arg5 + 2 & 0x3) + 4, 4, arg6, arg1, arg0);
					} else if (arg4 == 8) {
						Static81.method2026(arg3, local140, arg2, arg5 + 4, 4, arg6, arg1, arg0);
						Static81.method2026(arg3, local140, arg2, (arg5 + 2 & 0x3) + 4, 4, arg6, arg1, arg0);
						return;
					}
					return;
				}
				Static81.method2026(arg3, local140, arg2, arg5, 4, arg6, arg1, arg0);
				return;
			}
			return;
		}
		if (arg2 == 2) {
			local45 = (Interface17) Static52.method1507(arg3, arg6, arg1, up.class);
			if (local45 != null) {
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (!(local45 instanceof Class47_Sub2_Sub4)) {
					Static81.method2026(arg3, local45.method7172(), arg2, arg5, arg4, arg6, arg1, arg0);
					return;
				}
				((Class47_Sub2_Sub4) local45).aClass79_1.method2415(arg0);
				return;
			}
			return;
		}
		if (arg2 != 3) {
			return;
		}
		local45 = (Interface17) Static167.method3276(arg3, arg6, arg1);
		if (local45 == null) {
			return;
		}
		if (!(local45 instanceof Class47_Sub3_Sub1)) {
			Static81.method2026(arg3, local45.method7172(), arg2, arg5, arg4, arg6, arg1, arg0);
			return;
		}
		((Class47_Sub3_Sub1) local45).aClass79_2.method2415(arg0);
		return;
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(III)Lclient!uj;")
	public static Class47_Sub5 method4188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class206 local7 = Static313.aClass206ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass47_Sub5_2;
	}
}
