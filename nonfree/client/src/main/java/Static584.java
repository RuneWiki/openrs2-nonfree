import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static584 {

	@OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
	public static int anInt9522;

	@OriginalMember(owner = "client!wj", name = "l", descriptor = "Lclient!fm;")
	public static Class116 aClass116_2;

	@OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
	public static int anInt9529;

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7921(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg6 < 0 || arg4 < 0 || arg6 >= Static188.anInt3850 - 1 || arg4 >= Static49.anInt1174 - 1) {
			return;
		}
		if (Static389.aClass346ArrayArrayArray2 == null) {
			return;
		}
		@Pc(36) Interface24 local36;
		if (arg2 == 0) {
			local36 = (Interface24) Static353.method5256(arg3, arg6, arg4);
			@Pc(42) Interface24 local42 = (Interface24) Static212.method3430(arg3, arg6, arg4);
			if (local36 != null && arg0 != 2) {
				if (local36 instanceof Class6_Sub1_Sub3_Sub2) {
					((Class6_Sub1_Sub3_Sub2) local36).aClass283_4.method6483(arg1);
				} else {
					Static356.method5275(arg2, arg1, arg5, arg6, arg4, arg0, arg3, local36.method7337());
				}
			}
			if (local42 != null) {
				if (!(local42 instanceof Class6_Sub1_Sub3_Sub2)) {
					Static356.method5275(arg2, arg1, arg5, arg6, arg4, arg0, arg3, local42.method7337());
					return;
				}
				((Class6_Sub1_Sub3_Sub2) local42).aClass283_4.method6483(arg1);
				return;
			}
			return;
		}
		if (arg2 != 1) {
			if (arg2 == 2) {
				local36 = (Interface24) Static224.method3516(arg3, arg6, arg4, vda.class);
				if (local36 == null) {
					return;
				}
				if (arg0 == 11) {
					arg0 = 10;
				}
				if (!(local36 instanceof Class6_Sub1_Sub1_Sub3)) {
					Static356.method5275(arg2, arg1, arg5, arg6, arg4, arg0, arg3, local36.method7337());
					return;
				}
				((Class6_Sub1_Sub1_Sub3) local36).aClass283_2.method6483(arg1);
			} else if (arg2 == 3) {
				local36 = (Interface24) Static317.method4928(arg3, arg6, arg4);
				if (local36 != null) {
					if (!(local36 instanceof Class6_Sub1_Sub2_Sub1)) {
						Static356.method5275(arg2, arg1, arg5, arg6, arg4, arg0, arg3, local36.method7337());
						return;
					}
					((Class6_Sub1_Sub2_Sub1) local36).aClass283_3.method6483(arg1);
					return;
				}
			}
			return;
		}
		local36 = (Interface24) Static122.method1787(arg3, arg6, arg4);
		if (local36 == null) {
			return;
		}
		if (!(local36 instanceof Class6_Sub1_Sub5_Sub1)) {
			@Pc(204) int local204 = local36.method7337();
			if (arg0 != 4 && arg0 != 5) {
				if (arg0 == 6) {
					Static356.method5275(arg2, arg1, arg5 + 4, arg6, arg4, 4, arg3, local204);
				} else if (arg0 == 7) {
					Static356.method5275(arg2, arg1, (arg5 + 2 & 0x3) + 4, arg6, arg4, 4, arg3, local204);
					return;
				} else if (arg0 == 8) {
					Static356.method5275(arg2, arg1, arg5 + 4, arg6, arg4, 4, arg3, local204);
					Static356.method5275(arg2, arg1, (arg5 + 2 & 0x3) + 4, arg6, arg4, 4, arg3, local204);
					return;
				}
				return;
			}
			Static356.method5275(arg2, arg1, arg5, arg6, arg4, 4, arg3, local204);
			return;
		}
		((Class6_Sub1_Sub5_Sub1) local36).aClass283_1.method6483(arg1);
		return;
	}

	@OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/lang/String;Lclient!rj;ZZ)V")
	public static void method7922(@OriginalArg(1) String arg0, @OriginalArg(2) Class287 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3) {
			Static585.method7928(arg0, arg1, 3);
			return;
		}
		@Pc(14) String local14;
		if (Static464.aString79.startsWith("win") && arg1.aBoolean630) {
			local14 = null;
			if (Static562.anApplet2 != null) {
				local14 = Static562.anApplet2.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(32) Class347 local32 = Static585.method7928(arg0, arg1, 0);
				Static140.aClass287_4 = arg1;
				Static114.aString19 = arg0;
				Static407.aClass347_3 = local32;
				return;
			}
		}
		if (Static464.aString79.startsWith("mac")) {
			local14 = null;
			if (Static562.anApplet2 != null) {
				local14 = Static562.anApplet2.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg2) {
				Static585.method7928(arg0, arg1, 1);
				return;
			}
		}
		Static585.method7928(arg0, arg1, 2);
	}
}
