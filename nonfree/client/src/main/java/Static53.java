import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!k", name = "S", descriptor = "Lclient!sd;")
	public static Class2 aClass2_12;

	@OriginalMember(owner = "client!k", name = "V", descriptor = "I")
	public static int anInt1406;

	@OriginalMember(owner = "client!k", name = "Y", descriptor = "I")
	public static int anInt1408;

	@OriginalMember(owner = "client!k", name = "gb", descriptor = "[I")
	public static int[] anIntArray165;

	@OriginalMember(owner = "client!k", name = "O", descriptor = "I")
	public static int anInt1403 = 0;

	@OriginalMember(owner = "client!k", name = "U", descriptor = "Lclient!ae;")
	private static Class5 aClass5_698 = Static56.method972("Welcome to RuneScape");

	@OriginalMember(owner = "client!k", name = "P", descriptor = "Lclient!ae;")
	public static Class5 aClass5_697 = aClass5_698;

	@OriginalMember(owner = "client!k", name = "T", descriptor = "I")
	public static volatile int anInt1405 = 0;

	@OriginalMember(owner = "client!k", name = "W", descriptor = "Lclient!ae;")
	private static Class5 aClass5_699 = Static56.method972("Loaded fonts");

	@OriginalMember(owner = "client!k", name = "X", descriptor = "I")
	public static int anInt1407 = 0;

	@OriginalMember(owner = "client!k", name = "ab", descriptor = "Lclient!ae;")
	public static Class5 aClass5_700 = aClass5_699;

	@OriginalMember(owner = "client!k", name = "cb", descriptor = "Lclient!ae;")
	private static Class5 aClass5_702 = Static56.method972("glow3:");

	@OriginalMember(owner = "client!k", name = "bb", descriptor = "Lclient!ae;")
	public static Class5 aClass5_701 = aClass5_702;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!mc;B)V")
	public static void method929(@OriginalArg(0) Class3_Sub1_Sub1_Sub1 arg0) {
		if (Static3.anInt289 == arg0.anInt1528 || arg0.anInt1536 == -1 || arg0.anInt1570 != 0 || arg0.anInt1573 + 1 > Static31.method778(arg0.anInt1536).anIntArray219[arg0.anInt1532]) {
			@Pc(34) int local34 = arg0.anInt1528 - arg0.anInt1520;
			@Pc(40) int local40 = Static3.anInt289 - arg0.anInt1520;
			@Pc(50) int local50 = arg0.anInt1562 * 64 + arg0.anInt1554 * 128;
			@Pc(60) int local60 = arg0.anInt1562 * 64 + arg0.anInt1534 * 128;
			@Pc(70) int local70 = arg0.anInt1562 * 64 + arg0.anInt1547 * 128;
			arg0.anInt1543 = (local70 * local40 + (local34 - local40) * local60) / local34;
			@Pc(94) int local94 = arg0.anInt1548 * 128 + arg0.anInt1562 * 64;
			arg0.anInt1567 = (local50 * (local34 - local40) + local40 * local94) / local34;
		}
		arg0.anInt1542 = 0;
		if (arg0.anInt1558 == 0) {
			arg0.anInt1560 = 1024;
		}
		if (arg0.anInt1558 == 1) {
			arg0.anInt1560 = 1536;
		}
		if (arg0.anInt1558 == 2) {
			arg0.anInt1560 = 0;
		}
		if (arg0.anInt1558 == 3) {
			arg0.anInt1560 = 512;
		}
		arg0.anInt1517 = arg0.anInt1560;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(III[Lclient!te;IIILclient!te;IIII)Lclient!te;")
	public static Class3_Sub1_Sub17 method930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub1_Sub17[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub1_Sub17 arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(11) int arg10) {
		if (arg8 > arg1 || arg4 < arg9 || arg1 >= arg2 || arg6 <= arg4) {
			return null;
		}
		for (@Pc(34) int local34 = 0; local34 < arg3.length; local34++) {
			@Pc(40) Class3_Sub1_Sub17 local40 = arg3[local34];
			if (local40 != null && arg0 == local40.anInt2621 && !local40.method1713(Static23.aBoolean33) && local40 != arg7) {
				@Pc(68) int local68 = local40.anInt2603 + arg9 - arg10;
				@Pc(77) int local77 = local40.anInt2655 + arg8 - arg5;
				if (local40.anInt2658 == 0) {
					@Pc(104) Class3_Sub1_Sub17 local104 = method930(local40.anInt2651, arg1, local77 + local40.anInt2667, arg3, arg4, local40.anInt2636, local40.anInt2600 + local68, arg7, local77, local68, local40.anInt2583);
					if (local104 != null) {
						return local104;
					}
					if (local40.aClass3_Sub1_Sub17Array1 != null) {
						local104 = method930(local40.anInt2651, arg1, local77 + local40.anInt2667, local40.aClass3_Sub1_Sub17Array1, arg4, local40.anInt2636, local40.anInt2600 + local68, arg7, local77, local68, local40.anInt2583);
						if (local104 != null) {
							return local104;
						}
					}
				}
				if (local40.method1731() && local77 <= arg1 && arg4 >= local68 && arg1 < local40.anInt2667 + local77 && local40.anInt2600 + local68 > arg4) {
					return local40;
				}
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ZZI)I")
	private static int method931() {
		return Static1.anInt2 + Static44.anInt1250;
	}

	@OriginalMember(owner = "client!k", name = "f", descriptor = "(I)V")
	public static void method932() {
		aClass5_697 = null;
		aClass5_701 = null;
		aClass5_698 = null;
		anIntArray165 = null;
		aClass5_700 = null;
		aClass2_12 = null;
		aClass5_702 = null;
		aClass5_699 = null;
	}

	@OriginalMember(owner = "client!k", name = "g", descriptor = "(I)Z")
	public static boolean method933() {
		@Pc(5) Class39 local5 = Static2.aClass39_1;
		synchronized (Static2.aClass39_1) {
			if (Static36.anInt2764 == Static65.anInt2448) {
				return false;
			} else {
				Static17.anInt619 = Static76.anIntArray298[Static65.anInt2448];
				Static34.anInt970 = Static50.anIntArray160[Static65.anInt2448];
				Static65.anInt2448 = Static65.anInt2448 + 1 & 0x7F;
				return true;
			}
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
	public static void method934() {
		Static72.anInt1857++;
		Static51.method1566(true);
		Static1.method1(true);
		Static51.method1566(false);
		Static1.method1(false);
		Static84.method1333();
		Static67.method1162();
		@Pc(34) int local34;
		@Pc(53) int local53;
		if (!Static38.aBoolean51) {
			local34 = Static18.anInt629;
			if (Static9.anInt420 / 256 > local34) {
				local34 = Static9.anInt420 / 256;
			}
			local53 = Static63.anInt2921 + Static51.anInt2380 & 0x7FF;
			if (Static73.aBooleanArray15[4] && Static3.anIntArray35[4] + 128 > local34) {
				local34 = Static3.anIntArray35[4] + 128;
			}
			Static94.method388(Static62.anInt1663, local53, Static85.anInt2107, local34 * 3 + 600, local34, Static15.method358(Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1543, Static12.anInt480, Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt1567) - 50);
		}
		if (Static38.aBoolean51) {
			local34 = Static32.method647();
		} else {
			local34 = Static49.method878();
		}
		local53 = Static89.anInt2280;
		@Pc(104) int local104 = Static85.anInt2111;
		@Pc(106) int local106 = Static60.anInt2989;
		@Pc(108) int local108 = Static70.anInt1827;
		@Pc(110) int local110 = Static68.anInt1577;
		for (@Pc(112) int local112 = 0; local112 < 5; local112++) {
			if (Static73.aBooleanArray15[local112]) {
				@Pc(153) int local153 = (int) ((double) (Static14.anIntArray372[local112] * 2 + 1) * Math.random() - (double) Static14.anIntArray372[local112] + Math.sin((double) Static5.anIntArray37[local112] * ((double) Static74.anIntArray216[local112] / 100.0D)) * (double) Static3.anIntArray35[local112]);
				if (local112 == 0) {
					Static89.anInt2280 += local153;
				}
				if (local112 == 3) {
					Static68.anInt1577 = Static68.anInt1577 + local153 & 0x7FF;
				}
				if (local112 == 2) {
					Static60.anInt2989 += local153;
				}
				if (local112 == 4) {
					Static70.anInt1827 += local153;
					if (Static70.anInt1827 < 128) {
						Static70.anInt1827 = 128;
					}
					if (Static70.anInt1827 > 383) {
						Static70.anInt1827 = 383;
					}
				}
				if (local112 == 1) {
					Static85.anInt2111 += local153;
				}
			}
		}
		Static27.method544();
		Static107.anInt2779 = Static100.anInt2512 - 4;
		Static107.anInt2780 = Static49.anInt1325 - 4;
		Static107.anInt2781 = 0;
		Static107.aBoolean150 = true;
		Static66.method1850();
		Static73.aClass42_1.method1038(Static89.anInt2280, Static85.anInt2111, Static60.anInt2989, Static70.anInt1827, Static68.anInt1577, local34);
		Static73.aClass42_1.method1049();
		Static1.method4();
		Static83.method1324();
		((Class57) Static25.anInterface3_1).method1562(Static74.anInt1893);
		Static72.method1210();
		if (Static96.aBoolean98 && method931() == 0) {
			Static96.aBoolean98 = false;
		}
		if (Static96.aBoolean98) {
			Static27.method544();
			Static66.method1850();
			Static37.method697(false, Static12.aClass5_186, null);
		}
		Static76.method1697();
		Static85.anInt2111 = local104;
		Static89.anInt2280 = local53;
		Static60.anInt2989 = local106;
		Static68.anInt1577 = local110;
		Static70.anInt1827 = local108;
	}
}
