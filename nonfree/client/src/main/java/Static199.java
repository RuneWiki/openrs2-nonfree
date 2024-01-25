import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jt", name = "k", descriptor = "Z")
	public static boolean aBoolean203 = false;

	@OriginalMember(owner = "client!jt", name = "l", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_81 = new Class211(41, 2);

	@OriginalMember(owner = "client!jt", name = "m", descriptor = "Z")
	public static boolean aBoolean204 = false;

	@OriginalMember(owner = "client!jt", name = "n", descriptor = "[I")
	public static final int[] anIntArray294 = new int[1000];

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(BI)V")
	public static void method2678(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static406.anInt6642 = arg0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZ[II[I)V")
	public static void method2679(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg0 >= arg2) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg2) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg1[local15];
		arg1[local15] = arg1[arg2];
		arg1[arg2] = local21;
		@Pc(35) int local35 = arg3[local15];
		arg3[local15] = arg3[arg2];
		arg3[arg2] = local35;
		@Pc(54) int local54 = ~local21 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg0; local56 < arg2; local56++) {
			if (arg1[local56] < (local56 & local54) + local21) {
				@Pc(71) int local71 = arg1[local56];
				arg1[local56] = arg1[local17];
				arg1[local17] = local71;
				@Pc(85) int local85 = arg3[local56];
				arg3[local56] = arg3[local17];
				arg3[local17++] = local85;
			}
		}
		arg1[arg2] = arg1[local17];
		arg1[local17] = local21;
		arg3[arg2] = arg3[local17];
		arg3[local17] = local35;
		method2679(arg0, arg1, local17 - 1, arg3);
		method2679(local17 + 1, arg1, arg2, arg3);
	}
}
