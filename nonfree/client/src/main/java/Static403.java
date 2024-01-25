import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!uk", name = "r", descriptor = "I")
	public static int anInt6869;

	@OriginalMember(owner = "client!uk", name = "w", descriptor = "[J")
	public static long[] aLongArray8;

	@OriginalMember(owner = "client!uk", name = "B", descriptor = "I")
	public static int anInt6876;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)I")
	public static int method5327(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg6 < 0 || arg0 >= Static126.anInt2569 - 1 || arg6 >= Static190.anInt3697 - 1) {
			return;
		}
		if (Static40.aClass53ArrayArrayArray2 == null) {
			return;
		}
		@Pc(47) Interface11 local47;
		if (arg2 == 0) {
			local47 = (Interface11) Static138.method1998(arg4, arg0, arg6);
			@Pc(53) Interface11 local53 = (Interface11) Static3.method104(arg4, arg0, arg6);
			if (local47 != null && arg1 != 2) {
				if (local47 instanceof Class6_Sub1_Sub1) {
					((Class6_Sub1_Sub1) local47).aClass185_1.method4127(arg5);
				} else {
					Static340.method4725(arg5, arg6, arg3, arg2, local47.method5648(), arg1, arg4, arg0);
				}
			}
			if (local53 != null) {
				if (local53 instanceof Class6_Sub1_Sub1) {
					((Class6_Sub1_Sub1) local53).aClass185_1.method4127(arg5);
					return;
				}
				Static340.method4725(arg5, arg6, arg3, arg2, local53.method5648(), arg1, arg4, arg0);
				return;
			}
			return;
		}
		if (arg2 != 1) {
			if (arg2 == 2) {
				local47 = (Interface11) Static134.method1950(arg4, arg0, arg6, ou.class);
				if (local47 == null) {
					return;
				}
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (!(local47 instanceof Class6_Sub2_Sub5)) {
					Static340.method4725(arg5, arg6, arg3, arg2, local47.method5648(), arg1, arg4, arg0);
					return;
				}
				((Class6_Sub2_Sub5) local47).aClass185_3.method4127(arg5);
			} else if (arg2 == 3) {
				local47 = (Interface11) Static40.method729(arg4, arg0, arg6);
				if (local47 != null) {
					if (!(local47 instanceof Class6_Sub4_Sub1)) {
						Static340.method4725(arg5, arg6, arg3, arg2, local47.method5648(), arg1, arg4, arg0);
						return;
					}
					((Class6_Sub4_Sub1) local47).aClass185_4.method4127(arg5);
					return;
				}
			}
			return;
		}
		local47 = (Interface11) Static351.method4929(arg4, arg0, arg6);
		if (local47 == null) {
			return;
		}
		if (local47 instanceof Class6_Sub3_Sub2) {
			((Class6_Sub3_Sub2) local47).aClass185_2.method4127(arg5);
			return;
		}
		@Pc(222) int local222 = local47.method5648();
		if (arg1 != 4 && arg1 != 5) {
			if (arg1 != 6) {
				if (arg1 == 7) {
					Static340.method4725(arg5, arg6, (arg3 + 2 & 0x3) + 4, arg2, local222, 4, arg4, arg0);
				} else if (arg1 == 8) {
					Static340.method4725(arg5, arg6, arg3 + 4, arg2, local222, 4, arg4, arg0);
					Static340.method4725(arg5, arg6, (arg3 + 2 & 0x3) + 4, arg2, local222, 4, arg4, arg0);
					return;
				}
				return;
			}
			Static340.method4725(arg5, arg6, arg3 + 4, arg2, local222, 4, arg4, arg0);
			return;
		}
		Static340.method4725(arg5, arg6, arg3, arg2, local222, 4, arg4, arg0);
		return;
	}
}
