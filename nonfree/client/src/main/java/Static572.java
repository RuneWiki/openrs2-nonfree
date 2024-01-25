import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static572 {

	@OriginalMember(owner = "client!uh", name = "J", descriptor = "Lclient!taa;")
	public static final Class315 aClass315_4 = new Class315();

	@OriginalMember(owner = "client!uh", name = "K", descriptor = "[Lclient!bda;")
	public static final Class31[] aClass31Array1 = new Class31[37];

	@OriginalMember(owner = "client!uh", name = "L", descriptor = "[Lclient!ak;")
	public static final Class11_Sub1_Sub1_Sub2_Sub1[] aClass11_Sub1_Sub1_Sub2_Sub1Array1 = new Class11_Sub1_Sub1_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIII)V")
	public static void method7865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static306.anInt5020 <= arg1 && arg3 <= Static252.anInt4988 && Static570.anInt9385 <= arg4 && Static177.anInt3963 >= arg0) {
			Static414.method6345(arg3, arg4, arg0, arg2, arg1);
		} else {
			Static49.method950(arg2, arg0, arg3, arg4, arg1);
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIIBIII)V")
	public static void method7866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) int local15;
		if (Static164.method3053(arg1)) {
			local15 = 0;
			@Pc(34) int local34 = 0;
			@Pc(36) int local36 = 0;
			@Pc(38) int local38 = 0;
			@Pc(47) int local47 = 0;
			if (Static558.aBoolean680) {
				local34 = Static106.anInt9893;
				local47 = Static225.anInt4615;
				local15 = Static78.anInt1693;
				local38 = Static22.anInt10183;
				local36 = Static238.anInt4740;
				Static225.anInt4615 = 1;
			}
			if (Static629.aClass78ArrayArray2[arg1] == null) {
				Static330.method3635(arg5, Static399.aClass78ArrayArray1[arg1], arg2, arg7, arg7 < 0, arg4, -1, arg3, arg6, arg0);
			} else {
				Static330.method3635(arg5, Static629.aClass78ArrayArray2[arg1], arg2, arg7, arg7 < 0, arg4, -1, arg3, arg6, arg0);
			}
			if (Static558.aBoolean680) {
				if (arg7 >= 0 && Static225.anInt4615 == 2) {
					Static233.method3884(Static22.anInt10183, Static106.anInt9893, Static78.anInt1693, Static238.anInt4740);
				}
				Static106.anInt9893 = local34;
				Static225.anInt4615 = local47;
				Static22.anInt10183 = local38;
				Static238.anInt4740 = local36;
				Static78.anInt1693 = local15;
			}
		} else if (arg7 == -1) {
			for (local15 = 0; local15 < 100; local15++) {
				Static618.aBooleanArray50[local15] = true;
			}
		} else {
			Static618.aBooleanArray50[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(IZ)Lclient!qca;")
	public static Class271 method7868(@OriginalArg(0) int arg0) {
		@Pc(6) Class271[] local6 = Static317.method4794();
		for (@Pc(13) int local13 = 0; local13 < local6.length; local13++) {
			if (arg0 == local6[local13].anInt7930) {
				return local6[local13];
			}
		}
		return null;
	}
}
