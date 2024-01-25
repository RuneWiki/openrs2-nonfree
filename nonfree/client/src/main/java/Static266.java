import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ie", name = "b", descriptor = "Ljava/lang/Class;")
	private static Class aClass12;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IBI)Z")
	public static boolean method4099(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x8000) != 0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg2 < 0 || arg0 < 0 || arg2 >= Static362.anInt8653 - 1 || Static206.anInt11291 - 1 <= arg0) {
			return;
		}
		if (Static584.aClass262ArrayArrayArray2 == null) {
			return;
		}
		@Pc(54) Interface19 local54;
		if (arg1 == 0) {
			local54 = (Interface19) Static32.method476(arg3, arg2, arg0);
			@Pc(308) Interface19 local308 = (Interface19) Static157.method8979(arg3, arg2, arg0);
			if (local54 != null && arg5 != 2) {
				if (local54 instanceof Class19_Sub1_Sub2_Sub2) {
					((Class19_Sub1_Sub2_Sub2) local54).aClass142_3.method3547(arg6);
				} else {
					Static232.method3644(arg2, arg5, arg3, arg4, arg0, arg1, arg6, local54.method9384());
				}
			}
			if (local308 != null) {
				if (local308 instanceof Class19_Sub1_Sub2_Sub2) {
					((Class19_Sub1_Sub2_Sub2) local308).aClass142_3.method3547(arg6);
				} else {
					Static232.method3644(arg2, arg5, arg3, arg4, arg0, arg1, arg6, local308.method9384());
				}
			}
		} else if (arg1 == 1) {
			local54 = (Interface19) Static117.method2043(arg3, arg2, arg0);
			if (local54 != null) {
				if (local54 instanceof Class19_Sub1_Sub1_Sub2) {
					((Class19_Sub1_Sub1_Sub2) local54).aClass142_2.method3547(arg6);
				} else {
					@Pc(65) int local65 = local54.method9384();
					if (arg5 == 4 || arg5 == 5) {
						Static232.method3644(arg2, 4, arg3, arg4, arg0, arg1, arg6, local65);
					} else if (arg5 == 6) {
						Static232.method3644(arg2, 4, arg3, arg4 + 4, arg0, arg1, arg6, local65);
					} else if (arg5 == 7) {
						Static232.method3644(arg2, 4, arg3, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg6, local65);
					} else if (arg5 == 8) {
						Static232.method3644(arg2, 4, arg3, arg4 + 4, arg0, arg1, arg6, local65);
						Static232.method3644(arg2, 4, arg3, (arg4 + 2 & 0x3) + 4, arg0, arg1, arg6, local65);
					}
				}
			}
		} else if (arg1 == 2) {
			local54 = (Interface19) Static89.method1199(arg3, arg2, arg0, aClass12 == null ? (aClass12 = Class167.a("pe")) : aClass12);
			if (local54 != null) {
				if (arg5 == 11) {
					arg5 = 10;
				}
				if (local54 instanceof Class19_Sub1_Sub3_Sub3) {
					((Class19_Sub1_Sub3_Sub3) local54).aClass142_1.method3547(arg6);
				} else {
					Static232.method3644(arg2, arg5, arg3, arg4, arg0, arg1, arg6, local54.method9384());
				}
			}
		} else if (arg1 == 3) {
			local54 = (Interface19) Static724.method9433(arg3, arg2, arg0);
			if (local54 != null) {
				if (local54 instanceof Class19_Sub1_Sub5_Sub2) {
					((Class19_Sub1_Sub5_Sub2) local54).aClass142_4.method3547(arg6);
				} else {
					Static232.method3644(arg2, arg5, arg3, arg4, arg0, arg1, arg6, local54.method9384());
				}
			}
		}
	}
}
