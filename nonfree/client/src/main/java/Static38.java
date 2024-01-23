import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!co", name = "c", descriptor = "[[S")
	public static short[][] aShortArrayArray1 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([I[Ljava/lang/Object;III)V")
	public static void method726(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(24) int local24 = (arg3 + arg2) / 2;
		@Pc(26) int local26 = arg2;
		@Pc(30) int local30 = arg0[local24];
		arg0[local24] = arg0[arg3];
		arg0[arg3] = local30;
		@Pc(44) Object local44 = arg1[local24];
		arg1[local24] = arg1[arg3];
		arg1[arg3] = local44;
		for (@Pc(56) int local56 = arg2; local56 < arg3; local56++) {
			if (arg0[local56] < local30 + (local56 & 0x1)) {
				@Pc(81) int local81 = arg0[local56];
				arg0[local56] = arg0[local26];
				arg0[local26] = local81;
				@Pc(95) Object local95 = arg1[local56];
				arg1[local56] = arg1[local26];
				arg1[local26++] = local95;
			}
		}
		arg0[arg3] = arg0[local26];
		arg0[local26] = local30;
		arg1[arg3] = arg1[local26];
		arg1[local26] = local44;
		method726(arg0, arg1, arg2, local26 - 1);
		method726(arg0, arg1, local26 + 1, arg3);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class8 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class8(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static180.aClass2_Sub31ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static180.aClass2_Sub31ArrayArrayArray2[local14][arg1][arg2] = new Class2_Sub31(local14, arg1, arg2);
				}
			}
			Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2].aClass8_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class8(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static180.aClass2_Sub31ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static180.aClass2_Sub31ArrayArrayArray2[local14][arg1][arg2] = new Class2_Sub31(local14, arg1, arg2);
				}
			}
			Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2].aClass8_1 = local12;
		} else {
			@Pc(134) Class95 local134 = new Class95(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static180.aClass2_Sub31ArrayArrayArray2[local14][arg1][arg2] == null) {
					Static180.aClass2_Sub31ArrayArrayArray2[local14][arg1][arg2] = new Class2_Sub31(local14, arg1, arg2);
				}
			}
			Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2].aClass95_1 = local134;
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "([JI[Ljava/lang/Object;)V")
	public static void method731(@OriginalArg(0) long[] arg0, @OriginalArg(2) Object[] arg1) {
		Static285.method4723(arg1, arg0, arg0.length - 1, 0);
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(BI)Z")
	public static boolean method732(@OriginalArg(1) int arg0) {
		if (Static124.anInt2633 == arg0) {
			return false;
		}
		Static156.anIntArrayArray49 = new int[104][104];
		Static173.anIntArrayArrayArray8 = new int[4][13][13];
		for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
			Static98.aClass52Array1[local34] = new Class52(104, 104);
		}
		Static134.aByteArrayArrayArray9 = new byte[4][104][104];
		Static208.aClass1ArrayArrayArray1 = new Class1[4][104][104];
		Static104.aByteArrayArrayArray6 = new byte[4][104][104];
		if (Static60.aBoolean106) {
			Static128.method2278();
			Static194.method3247();
			Static96.aClass147ArrayArray1 = new Class147[13][13];
		}
		Static124.anInt2633 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII)V")
	public static void method733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static290.anInt6021 < arg3 || Static127.anInt2664 > arg1) {
			return;
		}
		@Pc(39) boolean local39;
		if (arg4 < Static68.anInt1509) {
			local39 = false;
			arg4 = Static68.anInt1509;
		} else if (Static43.anInt1054 >= arg4) {
			local39 = true;
		} else {
			local39 = false;
			arg4 = Static43.anInt1054;
		}
		@Pc(62) boolean local62;
		if (Static68.anInt1509 > arg0) {
			arg0 = Static68.anInt1509;
			local62 = false;
		} else if (Static43.anInt1054 < arg0) {
			arg0 = Static43.anInt1054;
			local62 = false;
		} else {
			local62 = true;
		}
		if (arg3 < Static127.anInt2664) {
			arg3 = Static127.anInt2664;
		} else {
			Static133.method2321(arg0, arg4, Static274.anIntArrayArray50[arg3++], arg2);
		}
		if (arg1 <= Static290.anInt6021) {
			Static133.method2321(arg0, arg4, Static274.anIntArrayArray50[arg1--], arg2);
		} else {
			arg1 = Static290.anInt6021;
		}
		@Pc(122) int local122;
		if (local39 && local62) {
			for (local122 = arg3; local122 <= arg1; local122++) {
				@Pc(169) int[] local169 = Static274.anIntArrayArray50[local122];
				local169[arg4] = local169[arg0] = arg2;
			}
		} else if (local39) {
			for (local122 = arg3; local122 <= arg1; local122++) {
				Static274.anIntArrayArray50[local122][arg4] = arg2;
			}
		} else if (local62) {
			for (local122 = arg3; local122 <= arg1; local122++) {
				Static274.anIntArrayArray50[local122][arg0] = arg2;
			}
		}
	}
}
