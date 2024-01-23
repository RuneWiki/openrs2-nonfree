import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "F")
	public static float aFloat1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!ah", name = "g", descriptor = "I")
	public static int anInt134 = 0;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
	public static void method124() {
		aBooleanArrayArray1 = null;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZLclient!lc;Lclient!lc;Lclient!lc;Lclient!lc;)V")
	public static void method125(@OriginalArg(1) Class98 arg0, @OriginalArg(2) Class98 arg1, @OriginalArg(3) Class98 arg2, @OriginalArg(4) Class98 arg3) {
		Static121.aClass98_76 = arg1;
		Static71.aClass98_43 = arg2;
		Static190.aClass98_110 = arg3;
		Static222.aClass98_132 = arg0;
		Static148.aClass22ArrayArray1 = new Class22[Static222.aClass98_132.method2380()][];
		Static257.aBooleanArray24 = new boolean[Static222.aClass98_132.method2380()];
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IIZ[I[Ljava/lang/Object;)V")
	public static void method126(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Object[] arg3) {
		if (arg0 >= arg1) {
			return;
		}
		@Pc(15) int local15 = (arg0 + arg1) / 2;
		@Pc(17) int local17 = arg0;
		@Pc(21) int local21 = arg2[local15];
		arg2[local15] = arg2[arg1];
		arg2[arg1] = local21;
		@Pc(35) Object local35 = arg3[local15];
		arg3[local15] = arg3[arg1];
		arg3[arg1] = local35;
		for (@Pc(47) int local47 = arg0; local47 < arg1; local47++) {
			if ((local47 & 0x1) + local21 > arg2[local47]) {
				@Pc(72) int local72 = arg2[local47];
				arg2[local47] = arg2[local17];
				arg2[local17] = local72;
				@Pc(86) Object local86 = arg3[local47];
				arg3[local47] = arg3[local17];
				arg3[local17++] = local86;
			}
		}
		arg2[arg1] = arg2[local17];
		arg2[local17] = local21;
		arg3[arg1] = arg3[local17];
		arg3[local17] = local35;
		method126(arg0, local17 - 1, arg2, arg3);
		method126(local17 + 1, arg1, arg2, arg3);
	}
}
