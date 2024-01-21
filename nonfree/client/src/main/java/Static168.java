import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "[Lclient!rh;")
	public static Class77[] aClass77Array2;

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "Lclient!vb;")
	public static Class82 aClass82_67;

	@OriginalMember(owner = "client!ue", name = "o", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "[Lclient!tg;")
	public static Class81[] aClass81Array20 = new Class81[1000];

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
	public static int anInt3903 = -1;

	@OriginalMember(owner = "client!ue", name = "f", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1366 = Static120.method2057("Close");

	@OriginalMember(owner = "client!ue", name = "r", descriptor = "Lclient!tg;")
	private static Class81 aClass81_1368 = Static120.method2057("Sorry invited players only)3");

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1367 = aClass81_1368;

	@OriginalMember(owner = "client!ue", name = "n", descriptor = "I")
	public static int anInt3907 = 0;

	@OriginalMember(owner = "client!ue", name = "p", descriptor = "[I")
	public static int[] anIntArray416 = new int[128];

	@OriginalMember(owner = "client!ue", name = "u", descriptor = "Lclient!tg;")
	public static Class81 aClass81_1369 = aClass81_1366;

	@OriginalMember(owner = "client!ue", name = "x", descriptor = "I")
	public static int anInt3912 = 0;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!vb;Lclient!vb;Lclient!vb;)V")
	public static void method2982(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Class82 arg1, @OriginalArg(3) Class82 arg2) {
		Static63.anInt1550 = arg2.method2955(Static36.aClass81_343);
		Static14.anInt291 = arg1.method2955(Static98.aClass81_766);
		Static107.anInt2357 = arg1.method2955(Static37.aClass81_345);
		Static19.anInt490 = arg1.method2955(Static41.aClass81_366);
		Static31.anInt839 = arg1.method2955(Static54.aClass81_455);
		Static122.anInt2745 = arg1.method2955(Static30.aClass81_263);
		Static33.anInt928 = arg1.method2955(Static103.aClass81_795);
		Static72.anInt1734 = arg1.method2955(Static9.aClass81_87);
		Static18.anInt476 = arg1.method2955(Static50.aClass81_431);
		Static85.anInt399 = arg1.method2955(Static72.aClass81_598);
		Static160.anInt3656 = arg1.method2955(Static142.aClass81_1108);
		Static21.anInt525 = arg0.method2955(Static167.aClass81_1364);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZ)V")
	public static void method2983(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(18) int local18;
		if (Static177.anInt4018 != arg1) {
			Static116.anIntArray275 = new int[arg1];
			for (local18 = 0; local18 < arg1; local18++) {
				Static116.anIntArray275[local18] = (local18 << 12) / arg1;
			}
			Static47.anInt1130 = arg1 - 1;
			Static177.anInt4018 = arg1;
		}
		if (arg0 == Static101.anInt2218) {
			return;
		}
		Static34.anIntArray75 = new int[arg0];
		for (local18 = 0; local18 < arg0; local18++) {
			Static34.anIntArray75[local18] = (local18 << 12) / arg0;
		}
		Static151.anInt3420 = arg0 - 1;
		Static101.anInt2218 = arg0;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILclient!de;)V")
	public static void method2984(@OriginalArg(1) Class1_Sub2_Sub1_Sub3 arg0) {
		if (Static142.anInt3104 == arg0.anInt3038 || arg0.anInt3024 == -1 || arg0.anInt3037 != 0 || arg0.anInt3008 + 1 > Static73.method1277(arg0.anInt3024).anIntArray394[arg0.anInt3013]) {
			@Pc(46) int local46 = arg0.anInt3038 - arg0.anInt3029;
			@Pc(52) int local52 = Static142.anInt3104 - arg0.anInt3029;
			@Pc(62) int local62 = arg0.anInt3056 * 128 + arg0.anInt3051 * 64;
			@Pc(72) int local72 = arg0.anInt3063 * 128 + arg0.anInt3051 * 64;
			@Pc(82) int local82 = arg0.anInt3051 * 64 + arg0.anInt3021 * 128;
			arg0.anInt3040 = (local62 * local52 + local82 * (local46 - local52)) / local46;
			@Pc(106) int local106 = arg0.anInt3027 * 128 + arg0.anInt3051 * 64;
			arg0.anInt3026 = (local72 * (local46 - local52) + local106 * local52) / local46;
		}
		if (arg0.anInt3016 == 0) {
			arg0.anInt3049 = 1024;
		}
		arg0.anInt3062 = 0;
		if (arg0.anInt3016 == 1) {
			arg0.anInt3049 = 1536;
		}
		if (arg0.anInt3016 == 2) {
			arg0.anInt3049 = 0;
		}
		if (arg0.anInt3016 == 3) {
			arg0.anInt3049 = 512;
		}
		arg0.anInt3048 = arg0.anInt3049;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(Lclient!rh;Lclient!oe;IIIII)V")
	public static void method2985(@OriginalArg(0) Class77 arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 == null) {
			return;
		}
		@Pc(12) int local12 = Static35.anInt964 + Static2.anInt37 & 0x7FF;
		@Pc(24) int local24 = Math.max(arg0.anInt3217 / 2, arg0.anInt3245 / 2) + 10;
		@Pc(32) int local32 = arg2 * arg2 + arg4 * arg4;
		if (local32 > local24 * local24) {
			return;
		}
		@Pc(42) int local42 = Class1_Sub2_Sub2_Sub1.anIntArray30[local12];
		@Pc(46) int local46 = Class1_Sub2_Sub2_Sub1.anIntArray33[local12];
		@Pc(54) int local54 = local46 * 256 / (Static160.anInt3643 + 256);
		@Pc(66) int local66 = local42 * 256 / (Static160.anInt3643 + 256);
		@Pc(77) int local77 = local54 * arg2 - local66 * arg4 >> 16;
		@Pc(88) int local88 = arg2 * local66 + arg4 * local54 >> 16;
		arg1.method2138(local88 + arg5 + arg0.anInt3217 / 2 - arg1.anInt2740 / 2, -(arg1.anInt2741 / 2) + arg3 - (-(arg0.anInt3245 / 2) - -local77), arg0.anIntArray344, arg0.anIntArray339);
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
	public static void method2986() {
		anIntArray416 = null;
		aClass81_1366 = null;
		aClass81_1367 = null;
		aClass81_1369 = null;
		aClass82_67 = null;
		aClass81Array20 = null;
		aClass81_1368 = null;
		aByteArrayArrayArray9 = null;
		aClass77Array2 = null;
	}
}
