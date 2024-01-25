import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!at", name = "g", descriptor = "F")
	public static float aFloat15;

	@OriginalMember(owner = "client!at", name = "p", descriptor = "Lclient!ne;")
	public static Class247 aClass247_1;

	// $FF: synthetic field
	@OriginalMember(owner = "client!at", name = "l", descriptor = "Ljava/lang/Class;")
	private static Class aClass1;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_12 = new Class381(79, 0);

	@OriginalMember(owner = "client!at", name = "c", descriptor = "Z")
	public static boolean aBoolean17 = false;

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIIII)V")
	public static void method373(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg5 < 0 || arg4 >= Static271.anInt4910 - 1 || Static613.anInt9909 - 1 <= arg5) {
			return;
		}
		if (Static283.aClass128ArrayArrayArray1 == null) {
			return;
		}
		@Pc(47) Interface9 local47;
		if (arg3 == 0) {
			local47 = (Interface9) Static142.method6599(arg6, arg4, arg5);
			@Pc(53) Interface9 local53 = (Interface9) Static486.method6844(arg6, arg4, arg5);
			if (local47 != null && arg0 != 2) {
				if (local47 instanceof Class4_Sub1_Sub2_Sub2) {
					((Class4_Sub1_Sub2_Sub2) local47).aClass230_2.method5182(arg1);
				} else {
					Static528.method7231(arg4, arg6, arg0, arg3, arg5, local47.method8364(), arg1, arg2);
				}
			}
			if (local53 != null) {
				if (!(local53 instanceof Class4_Sub1_Sub2_Sub2)) {
					Static528.method7231(arg4, arg6, arg0, arg3, arg5, local53.method8364(), arg1, arg2);
					return;
				}
				((Class4_Sub1_Sub2_Sub2) local53).aClass230_2.method5182(arg1);
				return;
			}
			return;
		}
		if (arg3 == 1) {
			local47 = (Interface9) Static427.method6188(arg6, arg4, arg5);
			if (local47 != null) {
				if (local47 instanceof Class4_Sub1_Sub5_Sub2) {
					((Class4_Sub1_Sub5_Sub2) local47).aClass230_4.method5182(arg1);
					return;
				}
				@Pc(147) int local147 = local47.method8364();
				if (arg0 != 4 && arg0 != 5) {
					if (arg0 != 6) {
						if (arg0 == 7) {
							Static528.method7231(arg4, arg6, 4, arg3, arg5, local147, arg1, (arg2 + 2 & 0x3) + 4);
						} else if (arg0 == 8) {
							Static528.method7231(arg4, arg6, 4, arg3, arg5, local147, arg1, arg2 + 4);
							Static528.method7231(arg4, arg6, 4, arg3, arg5, local147, arg1, (arg2 + 2 & 0x3) + 4);
							return;
						}
						return;
					}
					Static528.method7231(arg4, arg6, 4, arg3, arg5, local147, arg1, arg2 + 4);
					return;
				}
				Static528.method7231(arg4, arg6, 4, arg3, arg5, local147, arg1, arg2);
				return;
			}
			return;
		}
		if (arg3 == 2) {
			local47 = (Interface9) Static367.method5340(arg6, arg4, arg5, aClass1 == null ? (aClass1 = Class20.a("dp")) : aClass1);
			if (local47 != null) {
				if (arg0 == 11) {
					arg0 = 10;
				}
				if (!(local47 instanceof Class4_Sub1_Sub1_Sub3)) {
					Static528.method7231(arg4, arg6, arg0, arg3, arg5, local47.method8364(), arg1, arg2);
					return;
				}
				((Class4_Sub1_Sub1_Sub3) local47).aClass230_3.method5182(arg1);
				return;
			}
			return;
		}
		if (arg3 != 3) {
			return;
		}
		local47 = (Interface9) Static254.method4181(arg6, arg4, arg5);
		if (local47 == null) {
			return;
		}
		if (local47 instanceof Class4_Sub1_Sub3_Sub1) {
			((Class4_Sub1_Sub3_Sub1) local47).aClass230_1.method5182(arg1);
			return;
		}
		Static528.method7231(arg4, arg6, arg0, arg3, arg5, local47.method8364(), arg1, arg2);
		return;
	}
}
