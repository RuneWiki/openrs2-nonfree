import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static119 {

	@OriginalMember(owner = "client!n", name = "l", descriptor = "D")
	public static double aDouble9;

	@OriginalMember(owner = "client!n", name = "c", descriptor = "I")
	public static int anInt2954 = -1;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "I")
	public static int anInt2957 = 0;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "[[S")
	public static final short[][] aShortArrayArray3 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!n", name = "D", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1712 = Static118.method2249("(Y<)4col>");

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
	public static void method2252(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub7 local7 = Static83.aClass1_Sub7ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass33_1 = null;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public static void method2255() {
		Static105.aClass87_47.method3061();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)Lclient!od;")
	public static Class1_Sub2_Sub17 method2256(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub17 local6 = (Class1_Sub2_Sub17) Static189.aClass87_72.method3062((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(32) byte[] local32 = Static23.aClass60_4.method2340(Static144.method2777(arg0), Static210.method3316(arg0));
		local6 = new Class1_Sub2_Sub17();
		if (local32 != null) {
			local6.method2507(new Class1_Sub14(local32));
		}
		Static189.aClass87_72.method3068(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!sd;Z)V")
	public static void method2258(@OriginalArg(0) Class60 arg0) {
		Static113.aClass60_23 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Lclient!dc;")
	public static Class1_Sub2_Sub8 method2259(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub8 local10 = (Class1_Sub2_Sub8) Static122.aClass87_61.method3062((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static142.aClass60_29.method2340(arg0, 28);
		local10 = new Class1_Sub2_Sub8();
		if (local20 != null) {
			local10.method655(new Class1_Sub14(local20));
		}
		Static122.aClass87_61.method3068(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!wd;ILclient!hh;II)V")
	public static void method2263(@OriginalArg(0) int arg0, @OriginalArg(2) Class97 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub2_Sub5_Sub3 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg3 == null) {
			return;
		}
		@Pc(12) int local12 = Static105.anInt2597 + Static82.anInt2025 & 0x7FF;
		@Pc(21) int local21 = arg5 * arg5 + arg0 * arg0;
		@Pc(33) int local33 = Math.max(arg1.anInt4353 / 2, arg1.anInt4354 / 2) + 10;
		if (local33 * local33 < local21) {
			return;
		}
		@Pc(47) int local47 = Class1_Sub2_Sub5_Sub2.anIntArray138[local12];
		@Pc(55) int local55 = local47 * 256 / (Static130.anInt3193 + 256);
		@Pc(67) int local67 = Class1_Sub2_Sub5_Sub2.anIntArray142[local12];
		@Pc(75) int local75 = local67 * 256 / (Static130.anInt3193 + 256);
		@Pc(86) int local86 = local55 * arg0 + local75 * arg5 >> 16;
		@Pc(97) int local97 = local75 * arg0 - local55 * arg5 >> 16;
		arg3.method1311(arg1.anInt4353 / 2 + arg4 + local86 - arg3.anInt1853 / 2, -(arg3.anInt1856 / 2) + -local97 + arg1.anInt4354 / 2 + arg2, arg1.anIntArray504, arg1.anIntArray508);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!nd;II)V")
	public static void method2267(@OriginalArg(0) Class60_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (Static195.aClass1_Sub14_4 == null) {
			Static104.method1932(0, 255, null, 255, (byte) 0, true);
			Static124.aClass60_Sub1Array1[arg1] = arg0;
		} else {
			Static195.aClass1_Sub14_4.anInt2306 = arg1 * 8 + 5;
			@Pc(22) int local22 = Static195.aClass1_Sub14_4.method1700();
			@Pc(28) int local28 = Static195.aClass1_Sub14_4.method1700();
			arg0.method2350(local22, local28);
		}
	}
}
