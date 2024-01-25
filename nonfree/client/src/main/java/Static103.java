import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
	public static int anInt2461;

	@OriginalMember(owner = "client!gr", name = "q", descriptor = "[I")
	public static final int[] anIntArray229 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
	public static int anInt2458 = 0;

	@OriginalMember(owner = "client!gr", name = "s", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_20 = new Class87(8);

	@OriginalMember(owner = "client!gr", name = "u", descriptor = "S")
	public static short aShort29 = 32767;

	@OriginalMember(owner = "client!gr", name = "v", descriptor = "[I")
	public static final int[] anIntArray230 = new int[14];

	@OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
	public static int anInt2460 = 0;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III[S[Ljava/lang/String;)V")
	public static void method2134(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) short[] arg2, @OriginalArg(4) String[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg0) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) String local21 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local21;
		@Pc(35) short local35 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local35;
		for (@Pc(47) int local47 = arg1; local47 < arg0; local47++) {
			if (local21 == null || arg3[local47] != null && arg3[local47].compareTo(local21) < (local47 & 0x1)) {
				@Pc(72) String local72 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17] = local72;
				@Pc(86) short local86 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17++] = local86;
			}
		}
		arg3[arg0] = arg3[local17];
		arg3[local17] = local21;
		arg2[arg0] = arg2[local17];
		arg2[local17] = local35;
		method2134(local17 - 1, arg1, arg2, arg3);
		method2134(arg0, local17 + 1, arg2, arg3);
	}
}
