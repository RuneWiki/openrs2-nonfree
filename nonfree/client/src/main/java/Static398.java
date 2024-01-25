import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static398 {

	@OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
	public static int anInt6532;

	@OriginalMember(owner = "client!tv", name = "f", descriptor = "I")
	public static int anInt6535 = 0;

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(I[Ljava/lang/String;Z[SI)V")
	public static void method5065(@OriginalArg(0) int arg0, @OriginalArg(1) String[] arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 <= arg3) {
			return;
		}
		@Pc(18) int local18 = (arg0 + arg3) / 2;
		@Pc(20) int local20 = arg3;
		@Pc(24) String local24 = arg1[local18];
		arg1[local18] = arg1[arg0];
		arg1[arg0] = local24;
		@Pc(38) short local38 = arg2[local18];
		arg2[local18] = arg2[arg0];
		arg2[arg0] = local38;
		for (@Pc(50) int local50 = arg3; local50 < arg0; local50++) {
			if (local24 == null || arg1[local50] != null && (local50 & 0x1) > arg1[local50].compareTo(local24)) {
				@Pc(71) String local71 = arg1[local50];
				arg1[local50] = arg1[local20];
				arg1[local20] = local71;
				@Pc(85) short local85 = arg2[local50];
				arg2[local50] = arg2[local20];
				arg2[local20++] = local85;
			}
		}
		arg1[arg0] = arg1[local20];
		arg1[local20] = local24;
		arg2[arg0] = arg2[local20];
		arg2[local20] = local38;
		method5065(local20 - 1, arg1, arg2, arg3);
		method5065(arg0, arg1, arg2, local20 + 1);
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(BI)I")
	public static int method5066(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!tv", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method5067(@OriginalArg(0) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
