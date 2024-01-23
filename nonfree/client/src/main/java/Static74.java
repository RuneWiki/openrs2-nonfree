import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!g", name = "q", descriptor = "I")
	public static int anInt2005;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "[S")
	public static short[] aShortArray28;

	@OriginalMember(owner = "client!g", name = "Q", descriptor = "[Z")
	public static boolean[] aBooleanArray4;

	@OriginalMember(owner = "client!g", name = "W", descriptor = "I")
	public static int anInt2023;

	@OriginalMember(owner = "client!g", name = "rb", descriptor = "I")
	public static int anInt2036;

	@OriginalMember(owner = "client!g", name = "F", descriptor = "I")
	public static int anInt2013 = 0;

	@OriginalMember(owner = "client!g", name = "N", descriptor = "[I")
	public static int[] anIntArray153 = new int[32];

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([Ljava/lang/String;IIB[S)V")
	public static void method1458(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) short[] arg3) {
		if (arg2 >= arg1) {
			return;
		}
		@Pc(6) int local6 = arg2;
		@Pc(12) int local12 = (arg2 + arg1) / 2;
		@Pc(16) String local16 = arg0[local12];
		arg0[local12] = arg0[arg1];
		arg0[arg1] = local16;
		@Pc(30) short local30 = arg3[local12];
		arg3[local12] = arg3[arg1];
		arg3[arg1] = local30;
		for (@Pc(42) int local42 = arg2; local42 < arg1; local42++) {
			if (local16 == null || arg0[local42] != null && arg0[local42].compareTo(local16) < (local42 & 0x1)) {
				@Pc(67) String local67 = arg0[local42];
				arg0[local42] = arg0[local6];
				arg0[local6] = local67;
				@Pc(81) short local81 = arg3[local42];
				arg3[local42] = arg3[local6];
				arg3[local6++] = local81;
			}
		}
		arg0[arg1] = arg0[local6];
		arg0[local6] = local16;
		arg3[arg1] = arg3[local6];
		arg3[local6] = local30;
		method1458(arg0, local6 - 1, arg2, arg3);
		method1458(arg0, arg1, local6 + 1, arg3);
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method1469() {
		Static160.aClass79_22.method2487();
	}
}
