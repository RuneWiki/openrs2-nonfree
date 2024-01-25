import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!au", name = "b", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_6 = new Class71(100, 6);

	@OriginalMember(owner = "client!au", name = "a", descriptor = "([JIII[Ljava/lang/Object;)V")
	public static void method979(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Object[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg1 + arg2) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) long local20 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local20;
		@Pc(34) Object local34 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg1; local54 < arg2; local54++) {
			if ((long) (local54 & local52) + local20 > arg0[local54]) {
				@Pc(71) long local71 = arg0[local54];
				arg0[local54] = arg0[local16];
				arg0[local16] = local71;
				@Pc(85) Object local85 = arg3[local54];
				arg3[local54] = arg3[local16];
				arg3[local16++] = local85;
			}
		}
		arg0[arg2] = arg0[local16];
		arg0[local16] = local20;
		arg3[arg2] = arg3[local16];
		arg3[local16] = local34;
		method979(arg0, arg1, local16 - 1, arg3);
		method979(arg0, local16 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!au", name = "a", descriptor = "(ILclient!oh;[ILclient!oh;)V")
	public static void method980(@OriginalArg(1) Class237 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class237 arg2) {
		Static115.aClass237_32 = arg0;
		Static503.aClass237_138 = arg2;
		if (arg1 != null) {
			Static232.anIntArray311 = arg1;
		}
	}
}
