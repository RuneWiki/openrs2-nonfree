import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "I")
	public static int anInt1579 = 0;

	@OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
	public static int anInt1584 = 0;

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIII)I")
	public static int method1538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg2) {
			return arg2;
		}
		@Pc(13) int local13 = 128 - arg1;
		@Pc(27) int local27 = (arg2 & 0x7F) * local13 + arg1 * (arg0 & 0x7F) >> 7;
		@Pc(41) int local41 = arg1 * (arg0 & 0x380) + (arg2 & 0x380) * local13 >> 7;
		@Pc(55) int local55 = (arg0 & 0xFC00) * arg1 + local13 * (arg2 & 0xFC00) >> 7;
		return local41 & 0x380 | local55 & 0xFC00 | local27 & 0x7F;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V")
	public static void method1539() {
		for (@Pc(10) Class1_Sub1_Sub13 local10 = (Class1_Sub1_Sub13) Static49.aClass195_6.method5029(); local10 != null; local10 = (Class1_Sub1_Sub13) Static49.aClass195_6.method5021()) {
			@Pc(15) Class5_Sub3_Sub1 local15 = local10.aClass5_Sub3_Sub1_1;
			if (Static285.anInt5511 != local15.aByte53 || Static215.anInt4246 > local15.anInt1881) {
				local10.method5710();
				local15.method1777();
			} else if (Static215.anInt4246 >= local15.anInt1896) {
				if (local15.anInt1887 > 0) {
					@Pc(56) Class5_Sub3_Sub3_Sub2 local56 = Static169.aClass5_Sub3_Sub3_Sub2Array2[local15.anInt1887 - 1];
					if (local56 != null && local56.anInt5050 >= 0 && local56.anInt5050 < Static48.anInt1107 * 128 && local56.anInt5047 >= 0 && local56.anInt5047 < Static337.anInt6402 * 128) {
						local15.method1780(Static16.method362(local56.anInt5050, local56.anInt5047, local15.aByte53) - local15.anInt1901, local56.anInt5047, local56.anInt5050, Static215.anInt4246);
					}
				}
				if (local15.anInt1887 < 0) {
					@Pc(121) int local121 = -local15.anInt1887 - 1;
					@Pc(126) Class5_Sub3_Sub3_Sub1 local126;
					if (Static69.anInt1424 == local121) {
						local126 = Static130.aClass5_Sub3_Sub3_Sub1_1;
					} else {
						local126 = Static254.aClass5_Sub3_Sub3_Sub1Array1[local121];
					}
					if (local126 != null && local126.anInt5050 >= 0 && Static48.anInt1107 * 128 > local126.anInt5050 && local126.anInt5047 >= 0 && local126.anInt5047 < Static337.anInt6402 * 128) {
						local15.method1780(Static16.method362(local126.anInt5050, local126.anInt5047, local15.aByte53) - local15.anInt1901, local126.anInt5047, local126.anInt5050, Static215.anInt4246);
					}
				}
				local15.method1781(anInt1579);
				Static313.method5285(local15, true);
			}
		}
	}

	@OriginalMember(owner = "client!ej", name = "b", descriptor = "(I)V")
	public static void method1540() {
		if (Static20.aClass2_5 != null) {
			Static20.aClass2_5.method3324();
			Static20.aClass2_5 = null;
			Static229.aClass13_3 = null;
		}
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIB)V")
	public static void method1541(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		if (Static251.anInt6509 != arg1) {
			Static7.anIntArray23 = new int[arg1];
			for (local14 = 0; local14 < arg1; local14++) {
				Static7.anIntArray23[local14] = (local14 << 12) / arg1;
			}
			Static102.anInt2096 = arg1 * 32;
			Static260.anInt5056 = arg1 - 1;
			Static251.anInt6509 = arg1;
		}
		if (arg0 == Static81.anInt1606) {
			return;
		}
		if (arg0 == Static251.anInt6509) {
			Static66.anIntArray158 = Static7.anIntArray23;
		} else {
			Static66.anIntArray158 = new int[arg0];
			for (local14 = 0; local14 < arg0; local14++) {
				Static66.anIntArray158[local14] = (local14 << 12) / arg0;
			}
		}
		Static81.anInt1606 = arg0;
		Static206.anInt4136 = arg0 - 1;
	}

	@OriginalMember(owner = "client!ej", name = "a", descriptor = "(IIIIIII)V")
	public static void method1542(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static156.method2956(arg5);
		@Pc(10) int local10 = 0;
		@Pc(14) int local14 = arg5 - arg2;
		if (local14 < 0) {
			local14 = 0;
		}
		@Pc(20) int local20 = arg5;
		@Pc(23) int local23 = -arg5;
		@Pc(25) int local25 = local14;
		@Pc(28) int local28 = -local14;
		@Pc(30) int local30 = -1;
		@Pc(32) int local32 = -1;
		@Pc(41) int[] local41 = Static327.anIntArrayArray63[arg3];
		@Pc(46) int local46 = arg4 - local14;
		@Pc(50) int local50 = arg4 + local14;
		Static97.method1784(arg4 - arg5, local41, arg1, local46);
		Static97.method1784(local46, local41, arg0, local50);
		Static97.method1784(local50, local41, arg1, arg5 + arg4);
		while (local10 < local20) {
			local30 += 2;
			local32 += 2;
			local28 += local32;
			local23 += local30;
			if (local28 >= 0 && local25 >= 1) {
				Static157.anIntArray359[local25] = local10;
				local25--;
				local28 -= local25 << 1;
			}
			local10++;
			@Pc(126) int[] local126;
			@Pc(132) int[] local132;
			@Pc(136) int local136;
			@Pc(141) int local141;
			@Pc(184) int local184;
			@Pc(188) int local188;
			@Pc(192) int local192;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				if (local14 <= local20) {
					local126 = Static327.anIntArrayArray63[arg3 + local20];
					local132 = Static327.anIntArrayArray63[arg3 - local20];
					local136 = arg4 + local10;
					local141 = arg4 - local10;
					Static97.method1784(local141, local126, arg1, local136);
					Static97.method1784(local141, local132, arg1, local136);
				} else {
					local126 = Static327.anIntArrayArray63[local20 + arg3];
					local132 = Static327.anIntArrayArray63[arg3 - local20];
					local136 = Static157.anIntArray359[local20];
					local141 = arg4 + local10;
					local184 = arg4 - local10;
					local188 = arg4 + local136;
					local192 = arg4 - local136;
					Static97.method1784(local184, local126, arg1, local192);
					Static97.method1784(local192, local126, arg0, local188);
					Static97.method1784(local188, local126, arg1, local141);
					Static97.method1784(local184, local132, arg1, local192);
					Static97.method1784(local192, local132, arg0, local188);
					Static97.method1784(local188, local132, arg1, local141);
				}
			}
			local126 = Static327.anIntArrayArray63[arg3 + local10];
			local132 = Static327.anIntArrayArray63[arg3 - local10];
			local136 = arg4 + local20;
			local141 = arg4 - local20;
			if (local10 < local14) {
				local184 = local10 > local25 ? Static157.anIntArray359[local10] : local25;
				local188 = local184 + arg4;
				local192 = arg4 - local184;
				Static97.method1784(local141, local126, arg1, local192);
				Static97.method1784(local192, local126, arg0, local188);
				Static97.method1784(local188, local126, arg1, local136);
				Static97.method1784(local141, local132, arg1, local192);
				Static97.method1784(local192, local132, arg0, local188);
				Static97.method1784(local188, local132, arg1, local136);
			} else {
				Static97.method1784(local141, local126, arg1, local136);
				Static97.method1784(local141, local132, arg1, local136);
			}
		}
	}
}
