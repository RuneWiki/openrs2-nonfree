import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!mq", name = "S", descriptor = "[I")
	public static final int[] anIntArray379 = new int[13];

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(IB)Z")
	public static boolean method4140(@OriginalArg(0) int arg0) {
		return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V")
	public static void method4142(@OriginalArg(1) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static350.method5101(arg0, arg1, arg1.length - 1, 0);
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lclient!ia;III[Z)Z")
	public static boolean method4144(@OriginalArg(0) Class4_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static389.aClass14Array3 != Static77.aClass14Array1) {
			@Pc(11) int local11 = Static267.aClass14Array2[arg1].R(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class14 local18 = Static267.aClass14Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.R(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method2554(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.H(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
