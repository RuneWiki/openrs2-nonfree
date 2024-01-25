import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!je", name = "a", descriptor = "F")
	public static float aFloat89;

	@OriginalMember(owner = "client!je", name = "c", descriptor = "[I")
	public static final int[] anIntArray365 = new int[5];

	@OriginalMember(owner = "client!je", name = "a", descriptor = "([Ljava/lang/String;II[SI)V")
	public static void method4019(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) short[] arg3) {
		if (arg2 <= arg1) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) String local20 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local20;
		@Pc(34) short local34 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg2; local46++) {
			if (local20 == null || arg0[local46] != null && (local46 & 0x1) > arg0[local46].compareTo(local20)) {
				@Pc(67) String local67 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local67;
				@Pc(81) short local81 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16++] = local81;
			}
		}
		arg0[arg2] = arg0[local16];
		arg0[local16] = local20;
		arg3[arg2] = arg3[local16];
		arg3[local16] = local34;
		method4019(arg0, arg1, local16 - 1, arg3);
		method4019(arg0, local16 + 1, arg2, arg3);
	}
}
