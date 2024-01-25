import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(IILclient!ha;IIIILclient!uo;IIII)V")
	public static void method3617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class100 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class5_Sub1_Sub20 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg3 < arg8 && arg9 + arg3 > arg8 && arg6 > arg10 - 13 && arg6 < arg10 + 3) {
			arg1 = arg4;
		}
		@Pc(41) String local41 = Static468.method6604(arg7);
		Static196.aClass70_3.method8438(Static67.aClass155Array3, arg3 + 3, arg1, local41, arg10, Static12.anIntArray9);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!mj;II)I")
	public static int method3618(@OriginalArg(0) Class238 arg0, @OriginalArg(1) int arg1) {
		if (!Static73.method1209(arg0).method1970(arg1) && arg0.anObjectArray33 == null) {
			return -1;
		} else if (arg0.anIntArray346 == null || arg1 >= arg0.anIntArray346.length) {
			return -1;
		} else {
			return arg0.anIntArray346[arg1];
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I[Ljava/lang/String;I[II)V")
	public static void method3619(@OriginalArg(1) String[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg3) / 2;
		@Pc(16) int local16 = arg3;
		@Pc(20) String local20 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local20;
		@Pc(34) int local34 = arg2[local14];
		arg2[local14] = arg2[arg1];
		arg2[arg1] = local34;
		for (@Pc(46) int local46 = arg3; local46 < arg1; local46++) {
			if (local20 == null || arg0[local46] != null && arg0[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(77) String local77 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local77;
				@Pc(91) int local91 = arg2[local46];
				arg2[local46] = arg2[local16];
				arg2[local16++] = local91;
			}
		}
		arg0[arg1] = arg0[local16];
		arg0[local16] = local20;
		arg2[arg1] = arg2[local16];
		arg2[local16] = local34;
		method3619(arg0, local16 - 1, arg2, arg3);
		method3619(arg0, arg1, arg2, local16 + 1);
	}
}
