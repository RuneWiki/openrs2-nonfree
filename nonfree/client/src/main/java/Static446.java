import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!wn", name = "S", descriptor = "Lclient!te;")
	public static Class228 aClass228_2;

	@OriginalMember(owner = "client!wn", name = "O", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_98 = new Class44(62, -1);

	@OriginalMember(owner = "client!wn", name = "Q", descriptor = "Lclient!wv;")
	public static final Class269 aClass269_12 = new Class269("WTI", 5);

	@OriginalMember(owner = "client!wn", name = "T", descriptor = "Lclient!sl;")
	public static final Class222 aClass222_11 = new Class222("", 16);

	@OriginalMember(owner = "client!wn", name = "U", descriptor = "Z")
	public static boolean aBoolean666 = false;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(BII)Lclient!cl;")
	public static Class37 method6041(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class37 local12 = new Class37();
		local12.anInt1438 = -1;
		local12.anInt1447 = -1;
		local12.anInt1449 = arg0 + 6;
		local12.anInt1451 = arg1 + 1 + 5;
		local12.anIntArrayArray6 = new int[local12.anInt1449][local12.anInt1451];
		local12.method1060();
		return local12;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)V")
	public static void method6043(@OriginalArg(1) int arg0) {
		if (arg0 == Static297.anInt5339) {
			return;
		}
		if (Static297.anInt5339 == 0) {
			Static148.method2188();
		}
		if (arg0 == 40) {
			Static440.method5946();
		}
		if (arg0 != 40 && Static140.aClass199_13 != null) {
			Static140.aClass199_13.method4490();
			Static140.aClass199_13 = null;
		}
		if (Static297.anInt5339 == 25 || Static297.anInt5339 == 28) {
			Static102.aClass188_33.anInt5309 = 2;
			Static96.aClass188_32.anInt5309 = 2;
			Static419.aClass188_123.anInt5309 = 2;
			Static444.aClass188_128.anInt5309 = 2;
			Static269.aClass188_72.anInt5309 = 2;
			Static1.aClass188_1.anInt5309 = 2;
			Static317.aClass188_87.anInt5309 = 2;
		}
		if (arg0 == 25 || arg0 == 28) {
			Static271.anInt4993 = 0;
			Static88.anInt2012 = 0;
			Static389.anInt6846 = 1;
			Static305.anInt1350 = 1;
			Static302.anInt4904 = 0;
			Static313.method4436(true);
			Static102.aClass188_33.anInt5309 = 1;
			Static96.aClass188_32.anInt5309 = 1;
			Static419.aClass188_123.anInt5309 = 1;
			Static444.aClass188_128.anInt5309 = 1;
			Static269.aClass188_72.anInt5309 = 1;
			Static1.aClass188_1.anInt5309 = 1;
			Static317.aClass188_87.anInt5309 = 1;
		}
		if (arg0 == 25 || arg0 == 10) {
			Static137.method1996();
		}
		if (arg0 == 5) {
			Static256.method3902(Static351.aClass188_97, Static387.aClass26_9);
		} else {
			Static64.method1256();
		}
		@Pc(144) boolean local144 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		@Pc(159) boolean local159 = Static297.anInt5339 == 5 || Static297.anInt5339 == 10 || Static297.anInt5339 == 28;
		if (local144 != local159) {
			if (local144) {
				Static378.anInt6716 = Static111.anInt2288;
				if (Static399.aClass167_Sub1_1.anInt5568 == 0) {
					Static56.method1115();
				} else {
					Static226.method3489(Static399.aClass167_Sub1_1.anInt5568, Static329.aClass188_90, Static111.anInt2288);
				}
				Static239.aClass179_1.method4142(false);
			} else {
				Static56.method1115();
				Static239.aClass179_1.method4142(true);
			}
		}
		if (arg0 == 25 || arg0 == 28 || arg0 == 40) {
			Static387.aClass26_9.method2239();
		}
		Static297.anInt5339 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IIIIIII)V")
	public static void method6044(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(6) int arg3) {
		@Pc(3) Class233[] local3 = Static2.aClass233Array1;
		for (@Pc(5) int local5 = 0; local5 < local3.length; local5++) {
			@Pc(11) Class233 local11 = local3[local5];
			if (local11 != null && local11.anInt6828 == 2) {
				Static210.method3242(local11.anInt6824, local11.anInt6822 * 2, arg3 >> 1, arg0 >> 1, local11.anInt6829, local11.anInt6830);
				if (Static413.anIntArray483[0] > -1 && Static164.anInt3206 % 20 < 10) {
					Static76.aClass76Array8[local11.anInt6825].method6088(arg2 + Static413.anIntArray483[0] - 12, Static413.anIntArray483[1] + arg1 + -28);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(IB[BI)[B")
	public static byte[] method6045(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		@Pc(6) byte[] local6 = new byte[32768];
		Static459.method3348(arg1, arg0, local6, 0, 32768);
		return local6;
	}
}
