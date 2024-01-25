import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static210 {

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "[Lclient!f;")
	public static Class14[] aClass14Array11;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II[S[Ljava/lang/String;B)V")
	public static void method3399(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) String[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(14) int local14 = (arg0 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) String local20 = arg3[local14];
		arg3[local14] = arg3[arg0];
		arg3[arg0] = local20;
		@Pc(34) short local34 = arg2[local14];
		arg2[local14] = arg2[arg0];
		arg2[arg0] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg0; local46++) {
			if (local20 == null || arg3[local46] != null && (local46 & 0x1) > arg3[local46].compareTo(local20)) {
				@Pc(71) String local71 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local71;
				@Pc(85) short local85 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local85;
			}
		}
		arg3[arg0] = arg3[local16];
		arg3[local16] = local20;
		arg2[arg0] = arg2[local16];
		arg2[local16] = local34;
		method3399(local16 - 1, arg1, arg2, arg3);
		method3399(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IIIIBII)I")
	public static int method3400(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(3) int local3 = arg4 & 0x3;
		if ((arg5 & 0x1) == 1) {
			@Pc(16) int local16 = arg0;
			arg0 = arg3;
			arg3 = local16;
		}
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1 + 7 - arg0 - arg2;
		} else if (local3 == 2) {
			return 8 - arg3 - arg1;
		} else {
			return arg2;
		}
	}
}
