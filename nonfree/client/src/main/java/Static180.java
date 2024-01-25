import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "Lclient!tr;")
	public static Class110 aClass110_8;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "Z")
	public static boolean aBoolean239 = false;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Z")
	public static boolean method2815(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBLclient!dt;)I")
	public static int method2816(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1) {
		if (!Static48.method915(arg1).method5602(arg0) && arg1.anObjectArray7 == null) {
			return -1;
		} else if (arg1.anIntArray152 == null || arg0 >= arg1.anIntArray152.length) {
			return -1;
		} else {
			return arg1.anIntArray152[arg0];
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([JIII[I)V")
	public static void method2820(@OriginalArg(0) long[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) long local20 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local20;
		@Pc(34) int local34 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local34;
		for (@Pc(46) int local46 = arg1; local46 < arg2; local46++) {
			if (local20 + (long) (local46 & 0x1) > arg0[local46]) {
				@Pc(64) long local64 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16] = local64;
				@Pc(78) int local78 = arg3[local46];
				arg3[local46] = arg3[local16];
				arg3[local16++] = local78;
			}
		}
		arg0[arg2] = arg0[local16];
		arg0[local16] = local20;
		arg3[arg2] = arg3[local16];
		arg3[local16] = local34;
		method2820(arg0, arg1, local16 - 1, arg3);
		method2820(arg0, local16 + 1, arg2, arg3);
	}
}
