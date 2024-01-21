import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] aClass4_Sub4_Sub5_Sub4Array9;

	@OriginalMember(owner = "client!me", name = "o", descriptor = "Lclient!ie;")
	public static Class4_Sub4_Sub5_Sub2 aClass4_Sub4_Sub5_Sub2_2;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "I")
	public static int anInt1892 = 0;

	@OriginalMember(owner = "client!me", name = "j", descriptor = "I")
	public static int anInt1893 = 0;

	@OriginalMember(owner = "client!me", name = "m", descriptor = "[Lclient!ne;")
	public static Class4_Sub10[] aClass4_Sub10Array1 = new Class4_Sub10[2048];

	@OriginalMember(owner = "client!me", name = "q", descriptor = "Lclient!v;")
	private static Class76 aClass76_815 = Static134.method2017("Use");

	@OriginalMember(owner = "client!me", name = "p", descriptor = "Lclient!v;")
	public static Class76 aClass76_814 = aClass76_815;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method1360() {
		aClass4_Sub4_Sub5_Sub2_2 = null;
		aClass4_Sub10Array1 = null;
		aClass76_815 = null;
		aClass76_814 = null;
		aClass4_Sub4_Sub5_Sub4Array9 = null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1361(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 1 || arg5 < 1 || arg2 > 102 || arg5 > 102) {
			return;
		}
		if (Static76.aBoolean119 && Static124.anInt2712 != arg4) {
			return;
		}
		@Pc(37) int local37 = 0;
		if (arg3 == 0) {
			local37 = Static54.aClass81_10.method1954(arg4, arg2, arg5);
		}
		if (arg3 == 1) {
			local37 = Static54.aClass81_10.method1970(arg4, arg2, arg5);
		}
		if (arg3 == 2) {
			local37 = Static54.aClass81_10.method1990(arg4, arg2, arg5);
		}
		if (arg3 == 3) {
			local37 = Static54.aClass81_10.method1966(arg4, arg2, arg5);
		}
		@Pc(101) int local101;
		if (local37 != 0) {
			@Pc(94) int local94 = local37 >> 14 & 0x7FFF;
			local101 = Static54.aClass81_10.method1982(arg4, arg2, arg5, local37);
			@Pc(107) int local107 = local101 >> 6 & 0x3;
			@Pc(111) int local111 = local101 & 0x1F;
			@Pc(125) Class4_Sub4_Sub8 local125;
			if (arg3 == 0) {
				Static54.aClass81_10.method1999(arg4, arg2, arg5);
				local125 = Static104.method1600(local94);
				if (local125.anInt1500 != 0) {
					Static52.aClass50Array1[arg4].method1384(local125.aBoolean89, arg2, local107, arg5, local111);
				}
			}
			if (arg3 == 1) {
				Static54.aClass81_10.method1997(arg4, arg2, arg5);
			}
			if (arg3 == 2) {
				Static54.aClass81_10.method1984(arg4, arg2, arg5);
				local125 = Static104.method1600(local94);
				if (local125.anInt1498 + arg2 > 103 || local125.anInt1498 + arg5 > 103 || arg2 + local125.anInt1505 > 103 || arg5 + local125.anInt1505 > 103) {
					return;
				}
				if (local125.anInt1500 != 0) {
					Static52.aClass50Array1[arg4].method1379(arg5, local107, arg2, local125.anInt1505, local125.aBoolean89, local125.anInt1498);
				}
			}
			if (arg3 == 3) {
				Static54.aClass81_10.method1968(arg4, arg2, arg5);
				local125 = Static104.method1600(local94);
				if (local125.anInt1500 == 1) {
					Static52.aClass50Array1[arg4].method1388(arg2, arg5);
				}
			}
		}
		if (arg0 < 0) {
			return;
		}
		local101 = arg4;
		if (arg4 < 3 && (Static62.aByteArrayArrayArray4[1][arg2][arg5] & 0x2) == 2) {
			local101 = arg4 + 1;
		}
		Static74.method1366(Static52.aClass50Array1[arg4], arg6, arg1, arg0, local101, arg5, arg4, arg2, Static54.aClass81_10);
		return;
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	private static void method1362() {
		if (!Static6.aBoolean5) {
			return;
		}
		Static66.aClass4_Sub4_Sub5_Sub4Array6 = null;
		Static85.aClass4_Sub4_Sub5_Sub4_5 = null;
		Static68.aClass4_Sub4_Sub5_Sub2_1 = null;
		Static56.anIntArray187 = null;
		Static74.aClass4_Sub4_Sub5_Sub4Array10 = null;
		Static65.anIntArray64 = null;
		aClass4_Sub4_Sub5_Sub4Array9 = null;
		Static42.aClass4_Sub4_Sub5_Sub4Array3 = null;
		Static64.anIntArray222 = null;
		Static36.aClass4_Sub4_Sub5_Sub4_3 = null;
		Static63.anIntArray221 = null;
		Static41.anIntArray129 = null;
		Static81.anIntArray278 = null;
		Static104.aClass4_Sub4_Sub5_Sub2Array40 = null;
		Static42.aClass4_Sub4_Sub5_Sub4_4 = null;
		aClass4_Sub4_Sub5_Sub2_2 = null;
		Static105.anIntArray327 = null;
		Static52.aClass4_Sub4_Sub5_Sub4Array4 = null;
		Static120.aClass4_Sub4_Sub5_Sub4_6 = null;
		Static8.anIntArray22 = null;
		Static121.method1838();
		Static25.method367(true);
		Static6.aBoolean5 = false;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IZ)V")
	public static void method1363(@OriginalArg(0) int arg0) {
		if (Static39.anInt1113 == arg0) {
			return;
		}
		if (Static39.anInt1113 == 0) {
			Static31.method448();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static29.anInt594 = 0;
			Static8.anInt165 = 0;
			Static20.anInt424 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static79.aClass75_3 != null) {
			Static79.aClass75_3.method1842();
			Static79.aClass75_3 = null;
		}
		if (Static39.anInt1113 == 25) {
			Static60.anInt1574 = 1;
			Static122.anInt2653 = 0;
			Static134.anInt2840 = 0;
			Static84.anInt2030 = 0;
			Static78.anInt1985 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static132.method2008(Static18.aClass17_Sub1_6, Static3.aClass17_Sub1_17, Static1.aCanvas1);
		} else {
			method1362();
		}
		Static39.anInt1113 = arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBIII)V")
	public static void method1364(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static118.anInt2555 == 1) {
			Static23.aClass4_Sub4_Sub5_Sub2Array3[Static60.anInt1573 / 100].method903(Static10.anInt204 - 8, Static60.anInt1572 - 8);
		}
		if (Static118.anInt2555 == 2) {
			Static23.aClass4_Sub4_Sub5_Sub2Array3[Static60.anInt1573 / 100 + 4].method903(Static10.anInt204 - 8, Static60.anInt1572 + -8);
		}
		Static107.method1618();
		if (!Static126.aBoolean156) {
			return;
		}
		@Pc(55) int local55 = arg3 + 512 - 5;
		@Pc(59) int local59 = arg2 + 20;
		Static95.aClass4_Sub4_Sub5_Sub3_Sub1_5.method1331(Static59.method1017(new Class76[] { Static110.aClass76_1133, Static63.method1092(Static23.anInt536) }), local55, local59, 16776960, -1);
		@Pc(80) int local80 = local59 + 15;
		@Pc(82) Runtime local82 = Runtime.getRuntime();
		@Pc(92) int local92 = (int) ((local82.totalMemory() - local82.freeMemory()) / 1024L);
		@Pc(94) int local94 = 16776960;
		if (local92 > 32768 && Static76.aBoolean119) {
			local94 = 16711680;
		}
		if (local92 > 65536 && !Static76.aBoolean119) {
			local94 = 16711680;
		}
		Static95.aClass4_Sub4_Sub5_Sub3_Sub1_5.method1331(Static59.method1017(new Class76[] { Static24.aClass76_210, Static63.method1092(local92), Static13.aClass76_102 }), local55, local80, local94, -1);
		local59 = local80 + 15;
	}
}
