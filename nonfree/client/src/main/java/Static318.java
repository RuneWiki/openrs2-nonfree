import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!kr", name = "F", descriptor = "I")
	public static int anInt2325 = -1;

	@OriginalMember(owner = "client!kr", name = "a", descriptor = "([Ljava/lang/String;[IIBI)V")
	public static void method2089(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 >= arg2) {
			return;
		}
		@Pc(12) int local12 = (arg2 + arg3) / 2;
		@Pc(14) int local14 = arg3;
		@Pc(18) String local18 = arg0[local12];
		arg0[local12] = arg0[arg2];
		arg0[arg2] = local18;
		@Pc(32) int local32 = arg1[local12];
		arg1[local12] = arg1[arg2];
		arg1[arg2] = local32;
		for (@Pc(44) int local44 = arg3; local44 < arg2; local44++) {
			if (local18 == null || arg0[local44] != null && arg0[local44].compareTo(local18) < (local44 & 0x1)) {
				@Pc(68) String local68 = arg0[local44];
				arg0[local44] = arg0[local14];
				arg0[local14] = local68;
				@Pc(82) int local82 = arg1[local44];
				arg1[local44] = arg1[local14];
				arg1[local14++] = local82;
			}
		}
		arg0[arg2] = arg0[local14];
		arg0[local14] = local18;
		arg1[arg2] = arg1[local14];
		arg1[local14] = local32;
		method2089(arg0, arg1, local14 - 1, arg3);
		method2089(arg0, arg1, arg2, local14 + 1);
	}
}
