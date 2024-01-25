import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!cga", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray11;

	@OriginalMember(owner = "client!cga", name = "r", descriptor = "I")
	public static int anInt1587;

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "([SIBI[Ljava/lang/String;)V")
	public static void method1368(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) String local20 = arg3[local14];
		arg3[local14] = arg3[arg1];
		arg3[arg1] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg1];
		arg0[arg1] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg1; local46++) {
			if (local20 == null || arg3[local46] != null && (local46 & 0x1) > arg3[local46].compareTo(local20)) {
				@Pc(71) String local71 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16] = local71;
				@Pc(85) short local85 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local85;
			}
		}
		arg3[arg1] = arg3[local16];
		arg3[local16] = local20;
		arg0[arg1] = arg0[local16];
		arg0[local16] = local34;
		method1368(arg0, local16 - 1, arg2, arg3);
		method1368(arg0, arg1, local16 + 1, arg3);
	}
}
