import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static571 {

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lclient!pd;")
	public static Class276 method8694(@OriginalArg(1) int arg0) {
		@Pc(8) Class276[] local8 = Static357.method6115();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class276 local16 = local8[local10];
			if (local16.anInt8148 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
	public static void method8695(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub1_Sub5 local9 = Static653.method9595(1, (long) arg0);
		local9.method2489();
	}

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)Z")
	public static boolean method8696(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(12) int local12 = arg5 + arg3;
		@Pc(16) int local16 = arg0 + arg2;
		@Pc(20) int local20 = arg4 + arg1;
		if (!Static630.method7146(local20, local16, arg5, local16, arg5, local20, arg4, local16, local12)) {
			return false;
		} else if (Static630.method7146(arg4, local16, local12, local16, arg5, local20, arg4, local16, local12)) {
			if (arg5 >= Static604.anInt10572) {
				if (!Static630.method7146(arg4, arg0, local12, local16, local12, local20, local20, local16, local12)) {
					return false;
				}
				if (!Static630.method7146(arg4, arg0, local12, local16, local12, arg4, local20, arg0, local12)) {
					return false;
				}
			} else if (!Static630.method7146(arg4, arg0, arg5, local16, arg5, local20, local20, local16, arg5)) {
				return false;
			} else if (!Static630.method7146(arg4, arg0, arg5, local16, arg5, arg4, local20, arg0, arg5)) {
				return false;
			}
			if (Static483.anInt8675 <= arg4) {
				if (!Static630.method7146(local20, arg0, arg5, local16, arg5, local20, local20, local16, local12)) {
					return false;
				}
				if (!Static630.method7146(local20, arg0, local12, local16, arg5, local20, local20, arg0, local12)) {
					return false;
				}
			} else if (!Static630.method7146(arg4, arg0, arg5, local16, arg5, arg4, arg4, local16, local12)) {
				return false;
			} else if (!Static630.method7146(arg4, arg0, local12, local16, arg5, arg4, arg4, arg0, local12)) {
				return false;
			}
			return true;
		} else {
			return false;
		}
	}
}
