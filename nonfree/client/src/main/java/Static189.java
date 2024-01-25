import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jg", name = "T", descriptor = "I")
	public static int anInt3807;

	@OriginalMember(owner = "client!jg", name = "M", descriptor = "I")
	public static int anInt3802 = 0;

	@OriginalMember(owner = "client!jg", name = "O", descriptor = "I")
	public static int anInt3804 = 1;

	@OriginalMember(owner = "client!jg", name = "R", descriptor = "Z")
	public static boolean aBoolean300 = true;

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "[I")
	public static final int[] anIntArray294 = new int[3];

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(BII)I")
	public static int method3154(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(43) int local43 = (arg0 & 0x7F) * 96 >> 7;
			if (local43 < 2) {
				local43 = 2;
			} else if (local43 > 126) {
				local43 = 126;
			}
			return (arg0 & 0xFF80) + local43;
		}
	}

	@OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIIIIIII)V")
	public static void method3155(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 < 0 || arg2 < 0 || Static399.anInt6923 - 1 <= arg5 || Static127.anInt2696 - 1 <= arg2) {
			return;
		}
		if (Static151.aClass217ArrayArrayArray3 == null) {
			return;
		}
		@Pc(37) Interface12 local37;
		if (arg0 == 0) {
			local37 = (Interface12) Static391.method5292(arg6, arg5, arg2);
			@Pc(241) Interface12 local241 = (Interface12) Static307.method4518(arg6, arg5, arg2);
			if (local37 != null && arg1 != 2) {
				if (local37 instanceof Class1_Sub5_Sub2) {
					((Class1_Sub5_Sub2) local37).aClass233_2.method5378(arg4);
				} else {
					Static154.method2722(arg6, arg3, arg2, arg0, local37.method5847(), arg5, arg1, arg4);
				}
			}
			if (local241 != null) {
				if (local241 instanceof Class1_Sub5_Sub2) {
					((Class1_Sub5_Sub2) local241).aClass233_2.method5378(arg4);
				} else {
					Static154.method2722(arg6, arg3, arg2, arg0, local241.method5847(), arg5, arg1, arg4);
				}
			}
		} else if (arg0 == 1) {
			local37 = (Interface12) Static35.method4618(arg6, arg5, arg2);
			if (local37 != null) {
				if (local37 instanceof Class1_Sub1_Sub3) {
					((Class1_Sub1_Sub3) local37).aClass233_3.method5378(arg4);
				} else {
					@Pc(46) int local46 = local37.method5847();
					if (arg1 == 4 || arg1 == 5) {
						Static154.method2722(arg6, arg3, arg2, arg0, local46, arg5, 4, arg4);
					} else if (arg1 == 6) {
						Static154.method2722(arg6, arg3 + 4, arg2, arg0, local46, arg5, 4, arg4);
					} else if (arg1 == 7) {
						Static154.method2722(arg6, (arg3 + 2 & 0x3) + 4, arg2, arg0, local46, arg5, 4, arg4);
					} else if (arg1 == 8) {
						Static154.method2722(arg6, arg3 + 4, arg2, arg0, local46, arg5, 4, arg4);
						Static154.method2722(arg6, (arg3 + 2 & 0x3) + 4, arg2, arg0, local46, arg5, 4, arg4);
					}
				}
			}
		} else if (arg0 == 2) {
			local37 = (Interface12) Static372.method1267(arg6, arg5, arg2, wk.class);
			if (local37 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (local37 instanceof Class1_Sub3_Sub6) {
					((Class1_Sub3_Sub6) local37).aClass233_4.method5378(arg4);
				} else {
					Static154.method2722(arg6, arg3, arg2, arg0, local37.method5847(), arg5, arg1, arg4);
				}
			}
		} else if (arg0 == 3) {
			local37 = (Interface12) Static11.method399(arg6, arg5, arg2);
			if (local37 != null) {
				if (local37 instanceof Class1_Sub2_Sub1) {
					((Class1_Sub2_Sub1) local37).aClass233_1.method5378(arg4);
				} else {
					Static154.method2722(arg6, arg3, arg2, arg0, local37.method5847(), arg5, arg1, arg4);
				}
			}
		}
	}
}
