import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!d", name = "b", descriptor = "[I")
	public static final int[] anIntArray57 = new int[50];

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!fi;")
	public static final Class66 aClass66_15 = new Class66(32);

	@OriginalMember(owner = "client!d", name = "g", descriptor = "[S")
	public static final short[] aShortArray13 = new short[] { -10304, 9104, -1, -1, -1 };

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(BIIIIIII)V")
	public static void method1062(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg0 < 0 || Static266.anInt5101 - 1 <= arg3 || arg0 >= Static339.anInt6352 - 1) {
			return;
		}
		if (Static138.aClass51ArrayArrayArray1 == null) {
			return;
		}
		@Pc(53) Interface8 local53;
		if (arg2 == 0) {
			local53 = (Interface8) Static178.method3304(arg5, arg3, arg0);
			@Pc(262) Interface8 local262 = (Interface8) Static251.method4406(arg5, arg3, arg0);
			if (local53 != null && arg4 != 2) {
				if (local53 instanceof Class25_Sub2_Sub2) {
					((Class25_Sub2_Sub2) local53).aClass190_4.method5222(arg6);
				} else {
					Static262.method4496(arg5, arg6, arg2, arg3, arg1, arg0, arg4, local53.method5549());
				}
			}
			if (local262 != null) {
				if (local262 instanceof Class25_Sub2_Sub2) {
					((Class25_Sub2_Sub2) local262).aClass190_4.method5222(arg6);
				} else {
					Static262.method4496(arg5, arg6, arg2, arg3, arg1, arg0, arg4, local262.method5549());
				}
			}
		} else if (arg2 == 1) {
			local53 = (Interface8) Static258.method4479(arg5, arg3, arg0);
			if (local53 != null) {
				if (local53 instanceof Class25_Sub3_Sub1) {
					((Class25_Sub3_Sub1) local53).aClass190_2.method5222(arg6);
				} else {
					@Pc(153) int local153 = local53.method5549();
					if (arg4 == 4 || arg4 == 5) {
						Static262.method4496(arg5, arg6, arg2, arg3, arg1, arg0, 4, local153);
					} else if (arg4 == 6) {
						Static262.method4496(arg5, arg6, arg2, arg3, arg1 + 4, arg0, 4, local153);
					} else if (arg4 == 7) {
						Static262.method4496(arg5, arg6, arg2, arg3, (arg1 + 2 & 0x3) + 4, arg0, 4, local153);
					} else if (arg4 == 8) {
						Static262.method4496(arg5, arg6, arg2, arg3, arg1 + 4, arg0, 4, local153);
						Static262.method4496(arg5, arg6, arg2, arg3, (arg1 + 2 & 0x3) + 4, arg0, 4, local153);
					}
				}
			}
		} else if (arg2 == 2) {
			local53 = (Interface8) Static82.method1816(arg5, arg3, arg0, sl.class);
			if (local53 != null) {
				if (arg4 == 11) {
					arg4 = 10;
				}
				if (local53 instanceof Class25_Sub1_Sub2) {
					((Class25_Sub1_Sub2) local53).aClass190_1.method5222(arg6);
				} else {
					Static262.method4496(arg5, arg6, arg2, arg3, arg1, arg0, arg4, local53.method5549());
				}
			}
		} else if (arg2 == 3) {
			local53 = (Interface8) Static251.method4403(arg5, arg3, arg0);
			if (local53 != null) {
				if (local53 instanceof Class25_Sub4_Sub2) {
					((Class25_Sub4_Sub2) local53).aClass190_3.method5222(arg6);
				} else {
					Static262.method4496(arg5, arg6, arg2, arg3, arg1, arg0, arg4, local53.method5549());
				}
			}
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
	public static void method1064(@OriginalArg(0) int arg0) {
		Static131.anInt2706 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static12.anInt378; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static248.anInt4822; local6++) {
				if (Static138.aClass51ArrayArrayArray1[arg0][local3][local6] == null) {
					Static138.aClass51ArrayArrayArray1[arg0][local3][local6] = new Class51(arg0, local3, local6);
				}
			}
		}
	}
}
