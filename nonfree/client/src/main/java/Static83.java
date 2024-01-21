import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static83 {

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "I")
	public static int anInt2133;

	@OriginalMember(owner = "client!jd", name = "O", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "[Lclient!jd;")
	public static final Class46[] aClass46Array15 = new Class46[500];

	@OriginalMember(owner = "client!jd", name = "q", descriptor = "I")
	public static int anInt2130 = 0;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	public static int anInt2136 = 0;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_799 = Static177.method3050("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!jd", name = "Q", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_800 = Static177.method3050(" )2> <col=ffffff>");

	@OriginalMember(owner = "client!jd", name = "Y", descriptor = "I")
	public static int anInt2159 = 0;

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public static void method1640() {
		@Pc(8) int[] local8 = new int[Static95.anInt3015];
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static95.anInt3015; local12++) {
			@Pc(18) Class4_Sub1_Sub12 local18 = method1663(local12);
			if (local18.anInt2468 >= 0 || local18.anInt2503 >= 0) {
				local8[local10++] = local12;
			}
		}
		Static55.anIntArray143 = new int[local10];
		for (@Pc(41) int local41 = 0; local41 < local10; local41++) {
			Static55.anIntArray143[local41] = local8[local41];
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(BI)Lclient!l;")
	public static Class4_Sub1_Sub12 method1663(@OriginalArg(1) int arg0) {
		@Pc(12) Class4_Sub1_Sub12 local12 = (Class4_Sub1_Sub12) Static163.aClass66_47.method2225((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(26) byte[] local26 = Static23.aClass62_6.method2878(Static39.method687(arg0), Static63.method1250(arg0));
		local12 = new Class4_Sub1_Sub12();
		local12.anInt2497 = arg0;
		if (local26 != null) {
			local12.method1890(new Class4_Sub11(local26));
		}
		local12.method1886();
		if (local12.anInt2478 != -1) {
			local12.method1892(method1663(local12.anInt2479), method1663(local12.anInt2478));
		}
		if (!Static125.aBoolean128 && local12.aBoolean109) {
			local12.aClass46Array18 = null;
			local12.aClass46Array19 = null;
			local12.aClass46_895 = Static169.aClass46_1378;
			local12.anInt2489 = 0;
			local12.aBoolean108 = false;
		}
		Static163.aClass66_47.method2222(local12, (long) arg0);
		return local12;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)Z")
	public static boolean method1674(@OriginalArg(0) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBIIIIIII)V")
	public static void method1678(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static165.method2751(arg2)) {
			Static165.aClass1Array2 = null;
			Static25.method414(arg5, arg4, arg3, Static54.aClass1ArrayArray1[arg2], arg1, arg0, arg6, arg7, -1);
			if (Static165.aClass1Array2 != null) {
				Static25.method414(Static165.anInt3639, arg4, arg3, Static165.aClass1Array2, arg1, Static25.anInt621, arg6, arg7, -1412584499);
				Static165.aClass1Array2 = null;
			}
		} else if (arg7 == -1) {
			for (@Pc(14) int local14 = 0; local14 < 100; local14++) {
				Static50.aBooleanArray8[local14] = true;
			}
		} else {
			Static50.aBooleanArray8[arg7] = true;
		}
	}

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "(II)Z")
	public static boolean method1680(@OriginalArg(1) int arg0) {
		return (arg0 & -arg0) == arg0;
	}
}
