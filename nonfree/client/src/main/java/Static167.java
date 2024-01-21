import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!si", name = "Z", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!si", name = "S", descriptor = "I")
	public static int anInt3752 = 0;

	@OriginalMember(owner = "client!si", name = "U", descriptor = "Lclient!af;")
	public static final Class5 aClass5_52 = new Class5(30);

	@OriginalMember(owner = "client!si", name = "V", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1442 = Static120.method1824("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!si", name = "W", descriptor = "Lclient!rd;")
	public static final Class80 aClass80_1443 = Static120.method1824("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!si", name = "X", descriptor = "Lclient!rd;")
	private static final Class80 aClass80_1444 = Static120.method1824("Error loading your profile)3");

	@OriginalMember(owner = "client!si", name = "Y", descriptor = "Lclient!rd;")
	public static Class80 aClass80_1445 = aClass80_1444;

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIII)I")
	public static int method2699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(12) int local12 = arg3;
			arg3 = arg2;
			arg2 = local12;
		}
		@Pc(20) int local20 = arg4 & 0x3;
		if (local20 == 0) {
			return arg0;
		} else if (local20 == 1) {
			return arg1;
		} else if (local20 == 2) {
			return 7 + 1 - arg0 - arg3;
		} else {
			return 7 + 1 - arg1 - arg2;
		}
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)I")
	public static int method2701(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 / arg1;
		@Pc(13) int local13 = arg1 - 1 & arg0;
		@Pc(19) int local19 = arg1 - 1 & arg2;
		@Pc(23) int local23 = arg2 / arg1;
		@Pc(28) int local28 = Static183.method2935(local23, local7);
		@Pc(40) int local40 = Static183.method2935(local23, local7 + 1);
		@Pc(47) int local47 = Static183.method2935(local23 + 1, local7);
		@Pc(56) int local56 = Static183.method2935(local23 + 1, local7 + 1);
		@Pc(63) int local63 = Static67.method1002(local28, arg1, local40, local13);
		@Pc(70) int local70 = Static67.method1002(local47, arg1, local56, local13);
		return Static67.method1002(local63, arg1, local70, local19);
	}

	@OriginalMember(owner = "client!si", name = "b", descriptor = "(IB)V")
	public static void method2702(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static43.method657(Static166.aClass80_1429, Static181.aClass80_1575, Static36.aClass80_287);
		} else if (arg0 == -2) {
			Static43.method657(Static105.aClass80_892, Static181.aClass80_1570, Static181.aClass80_1586);
		} else if (arg0 == -1) {
			Static43.method657(Static166.aClass80_1432, Static181.aClass80_1587, Static104.aClass80_890);
		} else if (arg0 == 3) {
			Static43.method657(Static194.aClass80_1723, Static181.aClass80_1582, Static181.aClass80_1592);
		} else if (arg0 == 4) {
			Static43.method657(Static34.aClass80_263, Static181.aClass80_1558, Static48.aClass80_406);
		} else if (arg0 == 5) {
			Static43.method657(Static168.aClass80_1455, Static181.aClass80_1560, Static68.aClass80_585);
		} else if (arg0 == 6) {
			Static43.method657(Static54.aClass80_468, Static181.aClass80_1581, Static102.aClass80_865);
		} else if (arg0 == 7) {
			Static43.method657(Static139.aClass80_1164, Static181.aClass80_1593, Static139.aClass80_1165);
		} else if (arg0 == 8) {
			Static43.method657(Static71.aClass80_611, Static181.aClass80_1585, Static58.aClass80_504);
		} else if (arg0 == 9) {
			Static43.method657(Static162.aClass80_1404, Static181.aClass80_1572, Static196.aClass80_1513);
		} else if (arg0 == 10) {
			Static43.method657(Static4.aClass80_40, Static181.aClass80_1557, Static58.aClass80_507);
		} else if (arg0 == 11) {
			Static43.method657(Static147.aClass80_1286, Static181.aClass80_1562, Static165.aClass80_1420);
		} else if (arg0 == 12) {
			Static43.method657(Static153.aClass80_210, Static181.aClass80_1553, Static129.aClass80_1100);
		} else if (arg0 == 13) {
			Static43.method657(Static166.aClass80_1433, Static181.aClass80_1583, Static169.aClass80_388);
		} else if (arg0 == 14) {
			Static43.method657(Static120.aClass80_1040, Static181.aClass80_1564, Static6.aClass80_47);
		} else if (arg0 == 16) {
			Static43.method657(Static49.aClass80_418, Static181.aClass80_1567, Static48.aClass80_401);
		} else if (arg0 == 17) {
			Static43.method657(Static75.aClass80_624, Static181.aClass80_1574, Static90.aClass80_748);
		} else if (arg0 == 18) {
			Static43.method657(Static12.aClass80_5, Static181.aClass80_1579, Static42.aClass80_356);
		} else if (arg0 == 19) {
			Static43.method657(Static56.aClass80_484, Static139.aClass80_1171, Static54.aClass80_469);
		} else if (arg0 == 20) {
			Static43.method657(Static166.aClass80_1431, Static181.aClass80_1555, Static53.aClass80_454);
		} else if (arg0 == 22) {
			Static43.method657(Static25.aClass80_194, Static181.aClass80_1566, Static43.aClass80_366);
		} else if (arg0 == 23) {
			Static43.method657(Static120.aClass80_1038, Static181.aClass80_1588, Static147.aClass80_1284);
		} else if (arg0 == 24) {
			Static43.method657(Static67.aClass80_571, Static181.aClass80_1552, aClass80_1445);
		} else if (arg0 == 25) {
			Static43.method657(Static166.aClass80_1434, Static181.aClass80_1565, Static109.aClass80_962);
		} else if (arg0 == 26) {
			Static43.method657(Static120.aClass80_1044, Static181.aClass80_1569, Static174.aClass80_1510);
		} else if (arg0 == 27) {
			Static43.method657(Static180.aClass80_1535, Static181.aClass80_1561, Static181.aClass80_1554);
		} else {
			Static43.method657(Static166.aClass80_1435, Static181.aClass80_1591, Static180.aClass80_1543);
		}
		Static132.method2019(10);
	}
}
