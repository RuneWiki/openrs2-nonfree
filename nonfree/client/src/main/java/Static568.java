import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static568 {

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
	public static final int[] anIntArray525 = new int[32];

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "[I")
	public static final int[] anIntArray526 = new int[1];

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBIIIIII)V")
	public static void method8243(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 < 0 || arg2 < 0 || arg0 >= Static326.anInt5541 - 1 || arg2 >= Static448.anInt7637 - 1) {
			return;
		}
		if (Static421.aClass217ArrayArrayArray5 == null) {
			return;
		}
		@Pc(40) Interface22 local40;
		if (arg4 == 0) {
			local40 = (Interface22) Static71.method1202(arg1, arg0, arg2);
			@Pc(46) Interface22 local46 = (Interface22) Static25.method299(arg1, arg0, arg2);
			if (local40 != null && arg3 != 2) {
				if (local40 instanceof Class4_Sub2_Sub4_Sub2) {
					((Class4_Sub2_Sub4_Sub2) local40).aClass280_4.method6682(arg5);
				} else {
					Static261.method4263(arg4, arg2, arg3, local40.method8490(), arg5, arg0, arg6, arg1);
				}
			}
			if (local46 != null) {
				if (local46 instanceof Class4_Sub2_Sub4_Sub2) {
					((Class4_Sub2_Sub4_Sub2) local46).aClass280_4.method6682(arg5);
				} else {
					Static261.method4263(arg4, arg2, arg3, local46.method8490(), arg5, arg0, arg6, arg1);
				}
			}
		} else if (arg4 == 1) {
			local40 = (Interface22) Static214.method3665(arg1, arg0, arg2);
			if (local40 != null) {
				if (local40 instanceof Class4_Sub2_Sub3_Sub1) {
					((Class4_Sub2_Sub3_Sub1) local40).aClass280_3.method6682(arg5);
				} else {
					@Pc(224) int local224 = local40.method8490();
					if (arg3 == 4 || arg3 == 5) {
						Static261.method4263(arg4, arg2, 4, local224, arg5, arg0, arg6, arg1);
					} else if (arg3 == 6) {
						Static261.method4263(arg4, arg2, 4, local224, arg5, arg0, arg6 + 4, arg1);
					} else if (arg3 == 7) {
						Static261.method4263(arg4, arg2, 4, local224, arg5, arg0, (arg6 + 2 & 0x3) + 4, arg1);
					} else if (arg3 == 8) {
						Static261.method4263(arg4, arg2, 4, local224, arg5, arg0, arg6 + 4, arg1);
						Static261.method4263(arg4, arg2, 4, local224, arg5, arg0, (arg6 + 2 & 0x3) + 4, arg1);
					}
				}
			}
		} else if (arg4 == 2) {
			local40 = (Interface22) Static217.method3700(arg1, arg0, arg2, tw.class);
			if (local40 != null) {
				if (arg3 == 11) {
					arg3 = 10;
				}
				if (local40 instanceof Class4_Sub2_Sub1_Sub2) {
					((Class4_Sub2_Sub1_Sub2) local40).aClass280_2.method6682(arg5);
				} else {
					Static261.method4263(arg4, arg2, arg3, local40.method8490(), arg5, arg0, arg6, arg1);
				}
			}
		} else if (arg4 == 3) {
			local40 = (Interface22) Static614.method8756(arg1, arg0, arg2);
			if (local40 != null) {
				if (local40 instanceof Class4_Sub2_Sub2_Sub1) {
					((Class4_Sub2_Sub2_Sub1) local40).aClass280_1.method6682(arg5);
				} else {
					Static261.method4263(arg4, arg2, arg3, local40.method8490(), arg5, arg0, arg6, arg1);
				}
			}
		}
	}
}
