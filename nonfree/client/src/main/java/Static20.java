import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!au", name = "c", descriptor = "Lclient!kea;")
	public static Class161 aClass161_8;

	@OriginalMember(owner = "client!au", name = "d", descriptor = "Lclient!qf;")
	public static Class245 aClass245_1 = null;

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([Ljava/lang/String;[SIII)V")
	public static void method727(@OriginalArg(0) String[] arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(21) int local21 = (arg3 + arg2) / 2;
		@Pc(23) int local23 = arg3;
		@Pc(27) String local27 = arg0[local21];
		arg0[local21] = arg0[arg2];
		arg0[arg2] = local27;
		@Pc(41) short local41 = arg1[local21];
		arg1[local21] = arg1[arg2];
		arg1[arg2] = local41;
		for (@Pc(53) int local53 = arg3; local53 < arg2; local53++) {
			if (local27 == null || arg0[local53] != null && (local53 & 0x1) > arg0[local53].compareTo(local27)) {
				@Pc(74) String local74 = arg0[local53];
				arg0[local53] = arg0[local23];
				arg0[local23] = local74;
				@Pc(88) short local88 = arg1[local53];
				arg1[local53] = arg1[local23];
				arg1[local23++] = local88;
			}
		}
		arg0[arg2] = arg0[local23];
		arg0[local23] = local27;
		arg1[arg2] = arg1[local23];
		arg1[local23] = local41;
		method727(arg0, arg1, local23 - 1, arg3);
		method727(arg0, arg1, arg2, local23 + 1);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(IZLjava/lang/String;)V")
	public static void method729(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static239.method4182(arg0, -1, arg1, -1);
	}
}
