import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static112 {

	@OriginalMember(owner = "client!ho", name = "J", descriptor = "I")
	public static int anInt5730;

	@OriginalMember(owner = "client!ho", name = "M", descriptor = "I")
	public static int anInt5733;

	@OriginalMember(owner = "client!ho", name = "C", descriptor = "Z")
	public static boolean aBoolean408 = false;

	@OriginalMember(owner = "client!ho", name = "F", descriptor = "I")
	public static int anInt5726 = 0;

	@OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
	public static void method4698() {
		Static177.aClass98_28.method2572();
		Static21.aClass98_4.method2572();
	}

	@OriginalMember(owner = "client!ho", name = "a", descriptor = "([JII[II)V")
	public static void method4705(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 <= arg2) {
			return;
		}
		@Pc(10) int local10 = arg2;
		@Pc(16) int local16 = (arg1 + arg2) / 2;
		@Pc(20) long local20 = arg0[local16];
		arg0[local16] = arg0[arg1];
		arg0[arg1] = local20;
		@Pc(34) int local34 = arg3[local16];
		arg3[local16] = arg3[arg1];
		arg3[arg1] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg1; local46++) {
			if (arg0[local46] < local20 + (long) (local46 & 0x1)) {
				@Pc(69) long local69 = arg0[local46];
				arg0[local46] = arg0[local10];
				arg0[local10] = local69;
				@Pc(83) int local83 = arg3[local46];
				arg3[local46] = arg3[local10];
				arg3[local10++] = local83;
			}
		}
		arg0[arg1] = arg0[local10];
		arg0[local10] = local20;
		arg3[arg1] = arg3[local10];
		arg3[local10] = local34;
		method4705(arg0, local10 - 1, arg2, arg3);
		method4705(arg0, arg1, local10 + 1, arg3);
	}
}
