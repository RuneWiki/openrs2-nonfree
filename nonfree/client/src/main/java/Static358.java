import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static358 {

	@OriginalMember(owner = "client!no", name = "a", descriptor = "Lclient!bga;")
	public static Class31 aClass31_7;

	@OriginalMember(owner = "client!no", name = "e", descriptor = "Lclient!pu;")
	public static Class270 aClass270_69;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ZI[II[J)V")
	public static void method4884(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) long[] arg3) {
		if (arg2 >= arg0) {
			return;
		}
		@Pc(22) int local22 = (arg0 + arg2) / 2;
		@Pc(24) int local24 = arg2;
		@Pc(28) long local28 = arg3[local22];
		arg3[local22] = arg3[arg0];
		arg3[arg0] = local28;
		@Pc(42) int local42 = arg1[local22];
		arg1[local22] = arg1[arg0];
		arg1[arg0] = local42;
		@Pc(60) int local60 = local28 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(62) int local62 = arg2; local62 < arg0; local62++) {
			if ((long) (local60 & local62) + local28 > arg3[local62]) {
				@Pc(79) long local79 = arg3[local62];
				arg3[local62] = arg3[local24];
				arg3[local24] = local79;
				@Pc(93) int local93 = arg1[local62];
				arg1[local62] = arg1[local24];
				arg1[local24++] = local93;
			}
		}
		arg3[arg0] = arg3[local24];
		arg3[local24] = local28;
		arg1[arg0] = arg1[local24];
		arg1[local24] = local42;
		method4884(local24 - 1, arg1, arg2, arg3);
		method4884(arg0, arg1, local24 + 1, arg3);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IBLclient!pu;I)Lclient!uq;")
	public static Class334 method4885(@OriginalArg(2) Class270 arg0, @OriginalArg(3) int arg1) {
		@Pc(14) byte[] local14 = arg0.method5704(arg1, 0);
		return local14 == null ? null : new Class334(local14);
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method4886(@OriginalArg(1) String arg0) {
		return arg0.length() + 1;
	}
}
