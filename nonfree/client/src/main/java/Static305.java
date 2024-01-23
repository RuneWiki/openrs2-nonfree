import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!vo", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray45;

	@OriginalMember(owner = "client!vo", name = "g", descriptor = "Lclient!dk;")
	public static Class34 aClass34_4;

	@OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
	public static int anInt5903;

	@OriginalMember(owner = "client!vo", name = "k", descriptor = "C")
	public static char aChar3;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString206 = "scroll:";

	@OriginalMember(owner = "client!vo", name = "b", descriptor = "S")
	public static short aShort89 = 1;

	@OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
	public static int anInt5900 = 99;

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
	public static void method4624(@OriginalArg(0) int arg0) {
		if (Static64.anInt1561 == arg0) {
			return;
		}
		if (Static64.anInt1561 == 0) {
			Static134.method2457();
		}
		if (arg0 == 40) {
			Static199.method3564();
		}
		if (arg0 != 40 && aClass34_4 != null) {
			aClass34_4.method1077();
			aClass34_4 = null;
		}
		@Pc(53) boolean local53 = arg0 == 5 || arg0 == 10 || arg0 == 28;
		if (arg0 == 25 || arg0 == 28) {
			Static41.anInt1021 = 0;
			Static132.anInt3032 = 1;
			Static287.anInt5650 = 0;
			Static37.anInt948 = 1;
			Static47.anInt1184 = 0;
			Static65.method1194(true);
		}
		if (arg0 == 25 || arg0 == 10) {
			Static195.method4727();
		}
		if (arg0 == 5) {
			Static257.method4042(Static121.aClass42_32);
		} else {
			Static99.method1714();
		}
		@Pc(121) boolean local121 = Static64.anInt1561 == 5 || Static64.anInt1561 == 10 || Static64.anInt1561 == 28;
		if (local121 != local53) {
			if (local53) {
				Static7.anInt116 = Static64.anInt1562;
				if (Static287.anInt5651 == 0) {
					Static96.method1669();
				} else {
					Static34.method654(Static64.anInt1562, 255, Static251.aClass42_77);
				}
				Static217.aClass21_3.method563(false);
			} else {
				Static96.method1669();
				Static217.aClass21_3.method563(true);
			}
		}
		if (Static116.aBoolean184 && (arg0 == 25 || arg0 == 28 || arg0 == 40)) {
			Static116.method1949();
		}
		Static64.anInt1561 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)V")
	public static void method4625() {
		Static57.aClass157_11.method4027();
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)Lclient!ig;")
	public static Class2_Sub8_Sub10 method4626() {
		@Pc(16) Class2_Sub8_Sub10 local16 = (Class2_Sub8_Sub10) Static247.aClass37_6.method1139();
		if (local16 != null) {
			local16.method4743();
			local16.method4686();
			return local16;
		}
		do {
			local16 = (Class2_Sub8_Sub10) Static83.aClass37_7.method1139();
			if (local16 == null) {
				return null;
			}
			if (local16.method2050() > Static221.method3670()) {
				return null;
			}
			local16.method4743();
			local16.method4686();
		} while ((local16.aLong212 & Long.MIN_VALUE) == 0L);
		return local16;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IB)I")
	public static int method4628(@OriginalArg(0) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(10) int local10 = local4 | local4 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IBIIIII)V")
	public static void method4629(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static30.method572(Static148.anInt3245, arg1, Static166.anInt3675);
		@Pc(17) int local17 = Static30.method572(Static148.anInt3245, arg0, Static166.anInt3675);
		@Pc(23) int local23 = Static30.method572(Static53.anInt1319, arg4, Static81.anInt1915);
		@Pc(36) int local36 = Static30.method572(Static53.anInt1319, arg5, Static81.anInt1915);
		@Pc(44) int local44 = Static30.method572(Static148.anInt3245, arg2 + arg1, Static166.anInt3675);
		@Pc(53) int local53 = Static30.method572(Static148.anInt3245, arg0 - arg2, Static166.anInt3675);
		@Pc(55) int local55;
		for (local55 = local11; local55 < local44; local55++) {
			Static25.method486(Static275.anIntArrayArray37[local55], local23, local36, arg3);
		}
		for (local55 = local17; local55 > local53; local55--) {
			Static25.method486(Static275.anIntArrayArray37[local55], local23, local36, arg3);
		}
		@Pc(102) int local102 = Static30.method572(Static53.anInt1319, arg4 + arg2, Static81.anInt1915);
		@Pc(111) int local111 = Static30.method572(Static53.anInt1319, arg5 - arg2, Static81.anInt1915);
		for (local55 = local44; local55 <= local53; local55++) {
			@Pc(120) int[] local120 = Static275.anIntArrayArray37[local55];
			Static25.method486(local120, local23, local102, arg3);
			Static25.method486(local120, local111, local36, arg3);
		}
	}
}
