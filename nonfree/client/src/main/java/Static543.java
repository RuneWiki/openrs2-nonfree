import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
	public static int anInt8521;

	@OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
	public static int anInt8522;

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "Z")
	public static boolean aBoolean661 = false;

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "Lclient!ph;")
	public static final Class260 aClass260_12 = new Class260(5, 1);

	@OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
	public static int anInt8520 = -1;

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[II[IZ)V")
	public static void method7131(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg0) / 2;
		@Pc(16) int local16 = arg0;
		@Pc(20) int local20 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local20;
		@Pc(34) int local34 = arg1[local14];
		arg1[local14] = arg1[arg2];
		arg1[arg2] = local34;
		@Pc(53) int local53 = ~local20 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(55) int local55 = arg0; local55 < arg2; local55++) {
			if (local20 + (local55 & local53) > arg3[local55]) {
				@Pc(74) int local74 = arg3[local55];
				arg3[local55] = arg3[local16];
				arg3[local16] = local74;
				@Pc(88) int local88 = arg1[local55];
				arg1[local55] = arg1[local16];
				arg1[local16++] = local88;
			}
		}
		arg3[arg2] = arg3[local16];
		arg3[local16] = local20;
		arg1[arg2] = arg1[local16];
		arg1[local16] = local34;
		method7131(arg0, arg1, local16 - 1, arg3);
		method7131(local16 + 1, arg1, arg2, arg3);
	}
}
