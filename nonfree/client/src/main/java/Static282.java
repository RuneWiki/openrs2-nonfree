import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_125 = new Class211(34, -1);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I[Ljava/lang/String;[SII)V")
	public static void method4305(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(2) short[] arg2, @OriginalArg(3) int arg3) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(22) int local22 = (arg3 + arg0) / 2;
		@Pc(24) int local24 = arg0;
		@Pc(28) String local28 = arg1[local22];
		arg1[local22] = arg1[arg3];
		arg1[arg3] = local28;
		@Pc(42) short local42 = arg2[local22];
		arg2[local22] = arg2[arg3];
		arg2[arg3] = local42;
		for (@Pc(54) int local54 = arg0; local54 < arg3; local54++) {
			if (local28 == null || arg1[local54] != null && (local54 & 0x1) > arg1[local54].compareTo(local28)) {
				@Pc(79) String local79 = arg1[local54];
				arg1[local54] = arg1[local24];
				arg1[local24] = local79;
				@Pc(93) short local93 = arg2[local54];
				arg2[local54] = arg2[local24];
				arg2[local24++] = local93;
			}
		}
		arg1[arg3] = arg1[local24];
		arg1[local24] = local28;
		arg2[arg3] = arg2[local24];
		arg2[local24] = local42;
		method4305(arg0, arg1, arg2, local24 - 1);
		method4305(local24 + 1, arg1, arg2, arg3);
	}
}
