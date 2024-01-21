import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "J")
	public static long aLong20;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "[I")
	public static int[] anIntArray27;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	public static int anInt397 = 0;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "[I")
	public static int[] anIntArray26 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!bb", name = "C", descriptor = "[Lclient!lf;")
	public static Class47[] aClass47Array1 = new Class47[50];

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
	public static void method337() {
		anIntArray27 = null;
		aClass47Array1 = null;
		anIntArray26 = null;
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)V")
	public static void method338(@OriginalArg(1) int arg0) {
		Static45.anInt1480 = arg0;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II[Lclient!rf;[SI)V")
	public static void method339(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class70[] arg2, @OriginalArg(3) short[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg1) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) Class70 local21 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local21;
		@Pc(35) short local35 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local35;
		for (@Pc(47) int local47 = arg1; local47 < arg0; local47++) {
			if (local21 == null || arg2[local47] != null && arg2[local47].method2922(local21) < (local47 & 0x1)) {
				@Pc(73) Class70 local73 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17] = local73;
				@Pc(87) short local87 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17++] = local87;
			}
		}
		arg2[arg0] = arg2[local17];
		arg2[local17] = local21;
		arg3[arg0] = arg3[local17];
		arg3[local17] = local35;
		method339(local17 - 1, arg1, arg2, arg3);
		method339(arg0, local17 + 1, arg2, arg3);
	}
}
