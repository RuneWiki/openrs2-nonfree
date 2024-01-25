import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static604 {

	@OriginalMember(owner = "client!vha", name = "d", descriptor = "Ljava/lang/String;")
	public static String aString143 = null;

	@OriginalMember(owner = "client!vha", name = "e", descriptor = "J")
	public static long aLong264 = -1L;

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIII)V")
	public static void method8428(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static514.anInt8603 <= arg1 - arg2 && Static487.anInt8320 >= arg1 + arg2 && arg3 - arg2 >= Static304.anInt4824 && arg2 + arg3 <= Static231.anInt3977) {
			Static536.method7638(arg2, arg3, arg0, arg1);
		} else {
			Static306.method4441(arg2, arg3, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!vha", name = "a", descriptor = "(IIIIIIII)V")
	public static void method8429(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg1 < 0 || Static111.anInt1752 - 1 <= arg3 || Static279.anInt4567 - 1 <= arg1) {
			return;
		}
		if (Static535.aClass156ArrayArrayArray2 == null) {
			return;
		}
		@Pc(49) Interface20 local49;
		if (arg0 != 0) {
			if (arg0 != 1) {
				if (arg0 == 2) {
					local49 = (Interface20) Static1.method5727(arg5, arg3, arg1, paa.class);
					if (local49 == null) {
						return;
					}
					if (arg6 == 11) {
						arg6 = 10;
					}
					if (local49 instanceof Class14_Sub1_Sub1_Sub5) {
						((Class14_Sub1_Sub1_Sub5) local49).aClass169_1.method3990(arg2);
						return;
					}
					Static373.method5813(arg4, arg2, arg5, arg0, local49.method8009(), arg3, arg6, arg1);
				} else if (arg0 == 3) {
					local49 = (Interface20) Static70.method7879(arg5, arg3, arg1);
					if (local49 != null) {
						if (local49 instanceof Class14_Sub1_Sub5_Sub2) {
							((Class14_Sub1_Sub5_Sub2) local49).aClass169_2.method3990(arg2);
							return;
						}
						Static373.method5813(arg4, arg2, arg5, arg0, local49.method8009(), arg3, arg6, arg1);
						return;
					}
				}
				return;
			}
			local49 = (Interface20) Static237.method3640(arg5, arg3, arg1);
			if (local49 != null) {
				if (local49 instanceof Class14_Sub1_Sub2_Sub2) {
					((Class14_Sub1_Sub2_Sub2) local49).aClass169_3.method3990(arg2);
					return;
				}
				@Pc(142) int local142 = local49.method8009();
				if (arg6 != 4 && arg6 != 5) {
					if (arg6 == 6) {
						Static373.method5813(arg4 + 4, arg2, arg5, arg0, local142, arg3, 4, arg1);
					} else if (arg6 == 7) {
						Static373.method5813((arg4 + 2 & 0x3) + 4, arg2, arg5, arg0, local142, arg3, 4, arg1);
						return;
					} else if (arg6 == 8) {
						Static373.method5813(arg4 + 4, arg2, arg5, arg0, local142, arg3, 4, arg1);
						Static373.method5813((arg4 + 2 & 0x3) + 4, arg2, arg5, arg0, local142, arg3, 4, arg1);
						return;
					}
					return;
				}
				Static373.method5813(arg4, arg2, arg5, arg0, local142, arg3, 4, arg1);
				return;
			}
			return;
		}
		local49 = (Interface20) Static601.method8388(arg5, arg3, arg1);
		@Pc(247) Interface20 local247 = (Interface20) Static226.method3559(arg5, arg3, arg1);
		if (local49 != null && arg6 != 2) {
			if (local49 instanceof Class14_Sub1_Sub3_Sub2) {
				((Class14_Sub1_Sub3_Sub2) local49).aClass169_4.method3990(arg2);
			} else {
				Static373.method5813(arg4, arg2, arg5, arg0, local49.method8009(), arg3, arg6, arg1);
			}
		}
		if (local247 == null) {
			return;
		}
		if (!(local247 instanceof Class14_Sub1_Sub3_Sub2)) {
			Static373.method5813(arg4, arg2, arg5, arg0, local247.method8009(), arg3, arg6, arg1);
			return;
		}
		((Class14_Sub1_Sub3_Sub2) local247).aClass169_4.method3990(arg2);
		return;
	}
}
