import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static513 {

	@OriginalMember(owner = "client!rga", name = "d", descriptor = "J")
	public static long aLong254;

	@OriginalMember(owner = "client!rga", name = "e", descriptor = "F")
	public static float aFloat186;

	@OriginalMember(owner = "client!rga", name = "f", descriptor = "Lclient!fja;")
	public static final Class126 aClass126_170 = new Class126(83, -1);

	@OriginalMember(owner = "client!rga", name = "h", descriptor = "I")
	public static int anInt8594 = 0;

	@OriginalMember(owner = "client!rga", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
	public static void method7276(@OriginalArg(0) int arg0, @OriginalArg(1) short[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String[] arg3) {
		if (arg2 <= arg0) {
			return;
		}
		@Pc(11) int local11 = (arg0 + arg2) / 2;
		@Pc(13) int local13 = arg0;
		@Pc(17) String local17 = arg3[local11];
		arg3[local11] = arg3[arg2];
		arg3[arg2] = local17;
		@Pc(31) short local31 = arg1[local11];
		arg1[local11] = arg1[arg2];
		arg1[arg2] = local31;
		for (@Pc(43) int local43 = arg0; local43 < arg2; local43++) {
			if (local17 == null || arg3[local43] != null && arg3[local43].compareTo(local17) < (local43 & 0x1)) {
				@Pc(68) String local68 = arg3[local43];
				arg3[local43] = arg3[local13];
				arg3[local13] = local68;
				@Pc(82) short local82 = arg1[local43];
				arg1[local43] = arg1[local13];
				arg1[local13++] = local82;
			}
		}
		arg3[arg2] = arg3[local13];
		arg3[local13] = local17;
		arg1[arg2] = arg1[local13];
		arg1[local13] = local31;
		method7276(arg0, arg1, local13 - 1, arg3);
		method7276(local13 + 1, arg1, arg2, arg3);
	}
}
