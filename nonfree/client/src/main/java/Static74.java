import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "I")
	public static int anInt1798;

	@OriginalMember(owner = "client!jb", name = "d", descriptor = "Lclient!c;")
	public static Class10 aClass10_66;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!kf;")
	public static Class46 aClass46_1 = new Class46();

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
	public static int anInt1802 = 0;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lclient!df;")
	public static Class2_Sub3_Sub4 method1148(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub3_Sub4 local8 = (Class2_Sub3_Sub4) Static117.aClass17_15.method505((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(29) byte[] local29 = Static59.aClass10_57.method1605(arg0, 3);
		local8 = new Class2_Sub3_Sub4();
		if (local29 != null) {
			local8.method530(new Class2_Sub13(local29));
		}
		Static117.aClass17_15.method508((long) arg0, local8);
		return local8;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IB)Lclient!ai;")
	public static Class6 method1149(@OriginalArg(0) int arg0) {
		@Pc(5) Class6 local5 = Static106.method2806(arg0);
		for (@Pc(20) int local20 = local5.method107() - 3; local20 > 0; local20 -= 3) {
			local5 = Static58.method956(new Class6[] { local5.method111(local20, 0), Static118.aClass6_812, local5.method119(local20) });
		}
		if (local5.method107() > 9) {
			return Static58.method956(new Class6[] { Static176.aClass6_1214, local5.method111(local5.method107() - 8, 0), Static159.aClass6_1118, Static39.aClass6_302, local5, Static149.aClass6_1019 });
		} else if (local5.method107() > 6) {
			return Static58.method956(new Class6[] { Static82.aClass6_615, local5.method111(local5.method107() - 4, 0), Static165.aClass6_1154, Static39.aClass6_302, local5, Static149.aClass6_1019 });
		} else {
			return Static58.method956(new Class6[] { Static143.aClass6_984, local5, Static163.aClass6_1140 });
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1150() {
		aClass10_66 = null;
		aClass46_1 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIIIIIIIIIZ)Z")
	public static boolean method1151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static86.anIntArrayArray34[local3][local7] = 0;
				Static46.anIntArrayArray21[local3][local7] = 99999999;
			}
		}
		Static86.anIntArrayArray34[arg7][arg9] = 99;
		local7 = arg7;
		Static46.anIntArrayArray21[arg7][arg9] = 0;
		@Pc(53) int local53 = arg9;
		@Pc(55) byte local55 = 0;
		@Pc(57) int local57 = 0;
		Static52.anIntArray93[0] = arg7;
		@Pc(63) boolean local63 = false;
		@Pc(66) int local66 = local55 + 1;
		Static55.anIntArray95[0] = arg9;
		@Pc(71) int local71 = Static52.anIntArray93.length;
		@Pc(76) int[][] local76 = Static51.aClass48Array1[Static36.anInt1020].anIntArrayArray35;
		@Pc(185) int local185;
		while (local57 != local66) {
			local7 = Static52.anIntArray93[local57];
			local53 = Static55.anIntArray95[local57];
			local57 = (local57 + 1) % local71;
			if (arg0 == local7 && local53 == arg3) {
				local63 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && Static51.aClass48Array1[Static36.anInt1020].method1480(arg6 - 1, arg1, local53, arg3, local7, arg0)) {
					local63 = true;
					break;
				}
				if (arg6 < 10 && Static51.aClass48Array1[Static36.anInt1020].method1482(arg6 - 1, arg0, local7, local53, arg3, arg1)) {
					local63 = true;
					break;
				}
			}
			if (arg2 != 0 && arg4 != 0 && Static51.aClass48Array1[Static36.anInt1020].method1476(local7, arg2, arg0, arg8, local53, arg3, arg4)) {
				local63 = true;
				break;
			}
			local185 = Static46.anIntArrayArray21[local7][local53] + 1;
			if (local7 > 0 && Static86.anIntArrayArray34[local7 - 1][local53] == 0 && (local76[local7 - 1][local53] & 0x12C0108) == 0) {
				Static52.anIntArray93[local66] = local7 - 1;
				Static55.anIntArray95[local66] = local53;
				local66 = (local66 + 1) % local71;
				Static86.anIntArrayArray34[local7 - 1][local53] = 2;
				Static46.anIntArrayArray21[local7 - 1][local53] = local185;
			}
			if (local7 < 103 && Static86.anIntArrayArray34[local7 + 1][local53] == 0 && (local76[local7 + 1][local53] & 0x12C0180) == 0) {
				Static52.anIntArray93[local66] = local7 + 1;
				Static55.anIntArray95[local66] = local53;
				local66 = (local66 + 1) % local71;
				Static86.anIntArrayArray34[local7 + 1][local53] = 8;
				Static46.anIntArrayArray21[local7 + 1][local53] = local185;
			}
			if (local53 > 0 && Static86.anIntArrayArray34[local7][local53 - 1] == 0 && (local76[local7][local53 - 1] & 0x12C0102) == 0) {
				Static52.anIntArray93[local66] = local7;
				Static55.anIntArray95[local66] = local53 - 1;
				local66 = (local66 + 1) % local71;
				Static86.anIntArrayArray34[local7][local53 - 1] = 1;
				Static46.anIntArrayArray21[local7][local53 - 1] = local185;
			}
			if (local53 < 103 && Static86.anIntArrayArray34[local7][local53 + 1] == 0 && (local76[local7][local53 + 1] & 0x12C0120) == 0) {
				Static52.anIntArray93[local66] = local7;
				Static55.anIntArray95[local66] = local53 + 1;
				Static86.anIntArrayArray34[local7][local53 + 1] = 4;
				Static46.anIntArrayArray21[local7][local53 + 1] = local185;
				local66 = (local66 + 1) % local71;
			}
			if (local7 > 0 && local53 > 0 && Static86.anIntArrayArray34[local7 - 1][local53 - 1] == 0 && (local76[local7 - 1][local53 - 1] & 0x12C010E) == 0 && (local76[local7 - 1][local53] & 0x12C0108) == 0 && (local76[local7][local53 - 1] & 0x12C0102) == 0) {
				Static52.anIntArray93[local66] = local7 - 1;
				Static55.anIntArray95[local66] = local53 - 1;
				Static86.anIntArrayArray34[local7 - 1][local53 - 1] = 3;
				local66 = (local66 + 1) % local71;
				Static46.anIntArrayArray21[local7 - 1][local53 - 1] = local185;
			}
			if (local7 < 103 && local53 > 0 && Static86.anIntArrayArray34[local7 + 1][local53 - 1] == 0 && (local76[local7 + 1][local53 - 1] & 0x12C0183) == 0 && (local76[local7 + 1][local53] & 0x12C0180) == 0 && (local76[local7][local53 - 1] & 0x12C0102) == 0) {
				Static52.anIntArray93[local66] = local7 + 1;
				Static55.anIntArray95[local66] = local53 - 1;
				local66 = (local66 + 1) % local71;
				Static86.anIntArrayArray34[local7 + 1][local53 - 1] = 9;
				Static46.anIntArrayArray21[local7 + 1][local53 - 1] = local185;
			}
			if (local7 > 0 && local53 < 103 && Static86.anIntArrayArray34[local7 - 1][local53 + 1] == 0 && (local76[local7 - 1][local53 + 1] & 0x12C0138) == 0 && (local76[local7 - 1][local53] & 0x12C0108) == 0 && (local76[local7][local53 + 1] & 0x12C0120) == 0) {
				Static52.anIntArray93[local66] = local7 - 1;
				Static55.anIntArray95[local66] = local53 + 1;
				Static86.anIntArrayArray34[local7 - 1][local53 + 1] = 6;
				local66 = (local66 + 1) % local71;
				Static46.anIntArrayArray21[local7 - 1][local53 + 1] = local185;
			}
			if (local7 < 103 && local53 < 103 && Static86.anIntArrayArray34[local7 + 1][local53 + 1] == 0 && (local76[local7 + 1][local53 + 1] & 0x12C01E0) == 0 && (local76[local7 + 1][local53] & 0x12C0180) == 0 && (local76[local7][local53 + 1] & 0x12C0120) == 0) {
				Static52.anIntArray93[local66] = local7 + 1;
				Static55.anIntArray95[local66] = local53 + 1;
				Static86.anIntArrayArray34[local7 + 1][local53 + 1] = 12;
				local66 = (local66 + 1) % local71;
				Static46.anIntArrayArray21[local7 + 1][local53 + 1] = local185;
			}
		}
		Static54.anInt1439 = 0;
		@Pc(799) int local799;
		@Pc(805) int local805;
		@Pc(812) int local812;
		if (!local63) {
			if (!arg10) {
				return false;
			}
			local185 = 1000;
			local799 = 100;
			for (local805 = arg0 - 10; local805 <= arg0 + 10; local805++) {
				for (local812 = arg3 - 10; local812 <= arg3 + 10; local812++) {
					if (local805 >= 0 && local812 >= 0 && local805 < 104 && local812 < 104 && Static46.anIntArrayArray21[local805][local812] < 100) {
						@Pc(842) int local842 = 0;
						if (arg0 > local805) {
							local842 = arg0 - local805;
						} else if (local805 > arg2 + arg0 - 1) {
							local842 = local805 + 1 - arg2 - arg0;
						}
						@Pc(877) int local877 = 0;
						if (arg3 > local812) {
							local877 = arg3 - local812;
						} else if (local812 > arg4 + arg3 - 1) {
							local877 = local812 + 1 - arg3 - arg4;
						}
						@Pc(916) int local916 = local877 * local877 + local842 * local842;
						if (local185 > local916 || local916 == local185 && Static46.anIntArrayArray21[local805][local812] < local799) {
							local185 = local916;
							local799 = Static46.anIntArrayArray21[local805][local812];
							local7 = local805;
							local53 = local812;
						}
					}
				}
			}
			if (local185 == 1000) {
				return false;
			}
			if (arg7 == local7 && arg9 == local53) {
				return false;
			}
			Static54.anInt1439 = 1;
		}
		@Pc(991) byte local991 = 0;
		Static52.anIntArray93[0] = local7;
		local57 = local991 + 1;
		Static55.anIntArray95[0] = local53;
		local185 = local799 = Static86.anIntArrayArray34[local7][local53];
		while (arg7 != local7 || arg9 != local53) {
			if (local799 != local185) {
				Static52.anIntArray93[local57] = local7;
				Static55.anIntArray95[local57++] = local53;
				local799 = local185;
			}
			if ((local185 & 0x2) != 0) {
				local7++;
			} else if ((local185 & 0x8) != 0) {
				local7--;
			}
			if ((local185 & 0x1) != 0) {
				local53++;
			} else if ((local185 & 0x4) != 0) {
				local53--;
			}
			local185 = Static86.anIntArrayArray34[local7][local53];
		}
		if (local57 > 0) {
			local71 = local57--;
			@Pc(1080) int local1080 = Static52.anIntArray93[local57];
			if (local71 > 25) {
				local71 = 25;
			}
			local805 = Static55.anIntArray95[local57];
			if (arg5 == 0) {
				Static66.aClass2_Sub13_Sub1_2.method1455(75);
				Static66.aClass2_Sub13_Sub1_2.method1416(local71 + local71 + 3);
			}
			if (arg5 == 1) {
				Static66.aClass2_Sub13_Sub1_2.method1455(165);
				Static66.aClass2_Sub13_Sub1_2.method1416(local71 + local71 + 14 + 3);
			}
			if (arg5 == 2) {
				Static66.aClass2_Sub13_Sub1_2.method1455(226);
				Static66.aClass2_Sub13_Sub1_2.method1416(local71 + local71 + 3);
			}
			Static66.aClass2_Sub13_Sub1_2.method1431(local805 + Static176.anInt4061);
			Static66.aClass2_Sub13_Sub1_2.method1408(Static161.aBooleanArray19[82] ? 1 : 0);
			Static152.anInt3513 = Static52.anIntArray93[0];
			Static107.anInt2564 = Static55.anIntArray95[0];
			for (local812 = 1; local812 < local71; local812++) {
				local57--;
				Static66.aClass2_Sub13_Sub1_2.method1408(Static52.anIntArray93[local57] - local1080);
				Static66.aClass2_Sub13_Sub1_2.method1442(Static55.anIntArray95[local57] - local805);
			}
			Static66.aClass2_Sub13_Sub1_2.method1403(local1080 + Static2.anInt66);
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(II)Z")
	public static boolean method1152(@OriginalArg(1) int arg0) {
		return (arg0 >> 30 & 0x1) != 0;
	}
}
