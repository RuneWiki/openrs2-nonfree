import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!nu", name = "L", descriptor = "[Lclient!l;")
	public static Class95[] aClass95Array9;

	@OriginalMember(owner = "client!nu", name = "F", descriptor = "Lclient!dq;")
	public static final Class56 aClass56_167 = new Class56(39, -1);

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([S[Ljava/lang/String;I)V")
	public static void method3653(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1) {
		method3654(arg0, arg1, 0, arg1.length - 1);
	}

	@OriginalMember(owner = "client!nu", name = "a", descriptor = "([S[Ljava/lang/String;IIB)V")
	private static void method3654(@OriginalArg(0) short[] arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(10) int local10 = (arg3 + arg2) / 2;
		@Pc(12) int local12 = arg2;
		@Pc(16) String local16 = arg1[local10];
		arg1[local10] = arg1[arg3];
		arg1[arg3] = local16;
		@Pc(30) short local30 = arg0[local10];
		arg0[local10] = arg0[arg3];
		arg0[arg3] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg3; local42++) {
			if (local16 == null || arg1[local42] != null && (local42 & 0x1) > arg1[local42].compareTo(local16)) {
				@Pc(63) String local63 = arg1[local42];
				arg1[local42] = arg1[local12];
				arg1[local12] = local63;
				@Pc(77) short local77 = arg0[local42];
				arg0[local42] = arg0[local12];
				arg0[local12++] = local77;
			}
		}
		arg1[arg3] = arg1[local12];
		arg1[local12] = local16;
		arg0[arg3] = arg0[local12];
		arg0[local12] = local30;
		method3654(arg0, arg1, arg2, local12 - 1);
		method3654(arg0, arg1, local12 + 1, arg3);
	}
}
