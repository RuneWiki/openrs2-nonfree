import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static109 {

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
	public static int anInt2273;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Ljava/lang/String;")
	public static String aString76 = "Loaded interfaces";

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString77 = "Ok";

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
	public static void method2025(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(6) int local6 = arg0;
		@Pc(13) int local13 = (arg0 + arg2) / 2;
		@Pc(17) String local17 = arg3[local13];
		arg3[local13] = arg3[arg2];
		arg3[arg2] = local17;
		@Pc(31) short local31 = arg1[local13];
		arg1[local13] = arg1[arg2];
		arg1[arg2] = local31;
		for (@Pc(43) int local43 = arg0; local43 < arg2; local43++) {
			if (local17 == null || arg3[local43] != null && (local43 & 0x1) > arg3[local43].compareTo(local17)) {
				@Pc(73) String local73 = arg3[local43];
				arg3[local43] = arg3[local6];
				arg3[local6] = local73;
				@Pc(87) short local87 = arg1[local43];
				arg1[local43] = arg1[local6];
				arg1[local6++] = local87;
			}
		}
		arg3[arg2] = arg3[local6];
		arg3[local6] = local17;
		arg1[arg2] = arg1[local6];
		arg1[local6] = local31;
		method2025(arg0, arg1, local6 - 1, arg3);
		method2025(local6 + 1, arg1, arg2, arg3);
	}
}
