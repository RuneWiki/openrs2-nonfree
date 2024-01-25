import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!jt", name = "R", descriptor = "I")
	public static int anInt5274;

	@OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
	public static int anInt5284 = -1;

	@OriginalMember(owner = "client!jt", name = "J", descriptor = "I")
	public static int anInt5291 = 1;

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IZIIIIII)V")
	public static void method4734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg0 - 334;
		if (local7 < 0) {
			local7 = 0;
		} else if (local7 > 100) {
			local7 = 100;
		}
		@Pc(40) int local40 = local7 * (Static566.aShort92 - Static644.aShort114) / 100 + Static644.aShort114;
		Static668.anInt10260 = local40 * Static668.anInt10259 >> 8;
		@Pc(52) int local52 = local40 * arg6 >> 8;
		@Pc(59) int local59 = 16384 - arg1 & 0x3FFF;
		@Pc(66) int local66 = 16384 - arg5 & 0x3FFF;
		@Pc(68) int local68 = 0;
		@Pc(70) int local70 = 0;
		@Pc(72) int local72 = local52;
		if (local59 != 0) {
			local70 = -local52 * Class3_Sub7_Sub17_Sub1.anIntArray549[local59] >> 14;
			local72 = Class3_Sub7_Sub17_Sub1.anIntArray548[local59] * local52 >> 14;
		}
		if (local66 != 0) {
			local68 = local72 * Class3_Sub7_Sub17_Sub1.anIntArray549[local66] >> 14;
			local72 = local72 * Class3_Sub7_Sub17_Sub1.anIntArray548[local66] >> 14;
		}
		Static305.anInt4908 = arg3 - local68;
		Static490.anInt7687 = arg2 - local70;
		Static263.anInt4101 = arg4 - local72;
		Static46.anInt1301 = arg5;
		Static32.anInt1120 = 0;
		Static171.anInt8707 = arg1;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(III)Z")
	public static boolean method4735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method4736(@OriginalArg(0) Class3_Sub7_Sub17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static477.aClass259Array3 == Static378.aClass259Array2) {
			return;
		}
		@Pc(10) int local10 = Static43.aClass259Array1[arg1].method9294(arg3, arg2);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(25) Class259 local25 = Static43.aClass259Array1[local12];
				if (local25 != null) {
					local25.wa(arg0, arg2, local10 - local25.method9294(arg3, arg2), arg3, 0, false);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIBLclient!fe;IIII)Z")
	public static boolean method4737(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class109 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg6;
		@Pc(18) int local18 = arg0 - 64;
		@Pc(23) int local23 = arg6 - 64;
		Static716.anIntArrayArray69[64][64] = 99;
		Static296.anIntArrayArray20[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static386.anIntArray438[0] = arg0;
		@Pc(43) int local43 = 0;
		@Pc(46) int local46 = local37 + 1;
		Static267.anIntArray327[0] = arg6;
		@Pc(51) int[][] local51 = arg5.anIntArrayArray9;
		while (local46 != local43) {
			local7 = Static386.anIntArray438[local43];
			local9 = Static267.anIntArray327[local43];
			@Pc(73) int local73 = local7 - local18;
			local43 = local43 + 1 & 0xFFF;
			@Pc(84) int local84 = local9 - local23;
			@Pc(90) int local90 = local7 - arg5.anInt2978;
			@Pc(95) int local95 = local9 - arg5.anInt2989;
			if (arg2 == -4) {
				if (arg9 == local7 && local9 == arg7) {
					Static286.anInt4374 = local7;
					Static290.anInt4444 = local9;
					return true;
				}
			} else if (arg2 == -3) {
				if (Static374.method5105(arg3, arg4, local7, arg9, 2, local9, arg7, 2)) {
					Static290.anInt4444 = local9;
					Static286.anInt4374 = local7;
					return true;
				}
			} else if (arg2 == -2) {
				if (arg5.method2718(arg8, local9, arg3, arg4, arg9, 2, 2, arg7, local7)) {
					Static290.anInt4444 = local9;
					Static286.anInt4374 = local7;
					return true;
				}
			} else if (arg2 == -1) {
				if (arg5.method2720(arg3, local7, local9, arg8, arg9, arg7, arg4, 2)) {
					Static290.anInt4444 = local9;
					Static286.anInt4374 = local7;
					return true;
				}
			} else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
				if (arg5.method2729(local7, arg1, 2, arg2, arg9, arg7, local9)) {
					Static290.anInt4444 = local9;
					Static286.anInt4374 = local7;
					return true;
				}
			} else if (arg5.method2722(arg7, 2, arg1, arg9, local7, arg2, local9)) {
				Static290.anInt4444 = local9;
				Static286.anInt4374 = local7;
				return true;
			}
			@Pc(276) int local276 = Static296.anIntArrayArray20[local73][local84] + 1;
			if (local73 > 0 && Static716.anIntArrayArray69[local73 - 1][local84] == 0 && (local51[local90 - 1][local95] & 0x43A40000) == 0 && (local51[local90 - 1][local95 + 1] & 0x4E240000) == 0) {
				Static386.anIntArray438[local46] = local7 - 1;
				Static267.anIntArray327[local46] = local9;
				Static716.anIntArrayArray69[local73 - 1][local84] = 2;
				local46 = local46 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local73 - 1][local84] = local276;
			}
			if (local73 < 126 && Static716.anIntArrayArray69[local73 + 1][local84] == 0 && (local51[local90 + 2][local95] & 0x60E40000) == 0 && (local51[local90 + 2][local95 + 1] & 0x78240000) == 0) {
				Static386.anIntArray438[local46] = local7 + 1;
				Static267.anIntArray327[local46] = local9;
				Static716.anIntArrayArray69[local73 + 1][local84] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local73 + 1][local84] = local276;
			}
			if (local84 > 0 && Static716.anIntArrayArray69[local73][local84 - 1] == 0 && (local51[local90][local95 - 1] & 0x43A40000) == 0 && (local51[local90 + 1][local95 - 1] & 0x60E40000) == 0) {
				Static386.anIntArray438[local46] = local7;
				Static267.anIntArray327[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static716.anIntArrayArray69[local73][local84 - 1] = 1;
				Static296.anIntArrayArray20[local73][local84 - 1] = local276;
			}
			if (local84 < 126 && Static716.anIntArrayArray69[local73][local84 + 1] == 0 && (local51[local90][local95 + 2] & 0x4E240000) == 0 && (local51[local90 + 1][local95 + 2] & 0x78240000) == 0) {
				Static386.anIntArray438[local46] = local7;
				Static267.anIntArray327[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static716.anIntArrayArray69[local73][local84 + 1] = 4;
				Static296.anIntArrayArray20[local73][local84 + 1] = local276;
			}
			if (local73 > 0 && local84 > 0 && Static716.anIntArrayArray69[local73 - 1][local84 - 1] == 0 && (local51[local90 - 1][local95] & 0x4FA40000) == 0 && (local51[local90 - 1][local95 - 1] & 0x43A40000) == 0 && (local51[local90][local95 - 1] & 0x63E40000) == 0) {
				Static386.anIntArray438[local46] = local7 - 1;
				Static267.anIntArray327[local46] = local9 - 1;
				Static716.anIntArrayArray69[local73 - 1][local84 - 1] = 3;
				local46 = local46 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local73 - 1][local84 - 1] = local276;
			}
			if (local73 < 126 && local84 > 0 && Static716.anIntArrayArray69[local73 + 1][local84 - 1] == 0 && (local51[local90 + 1][local95 - 1] & 0x63E40000) == 0 && (local51[local90 + 2][local95 - 1] & 0x60E40000) == 0 && (local51[local90 + 2][local95] & 0x78E40000) == 0) {
				Static386.anIntArray438[local46] = local7 + 1;
				Static267.anIntArray327[local46] = local9 - 1;
				Static716.anIntArrayArray69[local73 + 1][local84 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local73 + 1][local84 - 1] = local276;
			}
			if (local73 > 0 && local84 < 126 && Static716.anIntArrayArray69[local73 - 1][local84 + 1] == 0 && (local51[local90 - 1][local95 + 1] & 0x4FA40000) == 0 && (local51[local90 - 1][local95 + 2] & 0x4E240000) == 0 && (local51[local90][local95 + 2] & 0x7E240000) == 0) {
				Static386.anIntArray438[local46] = local7 - 1;
				Static267.anIntArray327[local46] = local9 + 1;
				Static716.anIntArrayArray69[local73 - 1][local84 + 1] = 6;
				local46 = local46 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local73 - 1][local84 + 1] = local276;
			}
			if (local73 < 126 && local84 < 126 && Static716.anIntArrayArray69[local73 + 1][local84 + 1] == 0 && (local51[local90 + 1][local95 + 2] & 0x7E240000) == 0 && (local51[local90 + 2][local95 + 2] & 0x78240000) == 0 && (local51[local90 + 2][local95 + 1] & 0x78E40000) == 0) {
				Static386.anIntArray438[local46] = local7 + 1;
				Static267.anIntArray327[local46] = local9 + 1;
				Static716.anIntArrayArray69[local73 + 1][local84 + 1] = 12;
				local46 = local46 + 1 & 0xFFF;
				Static296.anIntArrayArray20[local73 + 1][local84 + 1] = local276;
			}
		}
		Static286.anInt4374 = local7;
		Static290.anInt4444 = local9;
		return false;
	}

	@OriginalMember(owner = "client!jt", name = "e", descriptor = "(B)V")
	public static void method4738() {
		if (Static357.aClass108Array6 != null) {
			for (@Pc(5) int local5 = 0; local5 < Static328.anInt8407; local5++) {
				Static357.aClass108Array6[local5] = null;
			}
			Static357.aClass108Array6 = null;
		}
		@Pc(39) int local39;
		if (Static179.aClass108Array5 != null) {
			for (local39 = 0; local39 < Static86.anInt2031; local39++) {
				Static179.aClass108Array5[local39] = null;
			}
			Static179.aClass108Array5 = null;
		}
		if (Static131.aClass108Array4 != null) {
			for (local39 = 0; local39 < Static340.anInt5461; local39++) {
				Static131.aClass108Array4[local39] = null;
			}
			Static131.aClass108Array4 = null;
		}
		Static79.aClass108Array3 = null;
		Static391.anInt6094 = -1;
		Static587.anInt8944 = -1;
		Static466.anIntArrayArrayArray12 = null;
		Static628.anIntArray700 = null;
	}

	@OriginalMember(owner = "client!jt", name = "d", descriptor = "(B)V")
	public static void method4739() {
		Static316.anInt5075 = 0;
		Static216.anInt3560++;
		Static412.anInt6361 = 0;
		Static290.method4046();
		Static531.method7070();
		Static342.method4884();
		@Pc(21) boolean local21 = false;
		@Pc(31) int local31;
		for (@Pc(23) int local23 = 0; local23 < Static316.anInt5075; local23++) {
			local31 = Static485.anIntArray562[local23];
			@Pc(38) Class3_Sub52 local38 = (Class3_Sub52) Static94.aClass313_8.method7104((long) local31);
			@Pc(41) Class9_Sub1_Sub1_Sub2_Sub2 local41 = local38.aClass9_Sub1_Sub1_Sub2_Sub2_2;
			if (local41.anInt8801 != Static216.anInt3560) {
				if (Static530.aBoolean556 && Static218.method3253(local31)) {
					Static54.method1303();
				}
				if (local41.aClass219_1.method5038()) {
					Static454.method6007(local41);
				}
				local41.method7509((Class219) null);
				local21 = true;
				local38.method9596();
			}
		}
		if (local21) {
			Static568.anInt8629 = Static94.aClass313_8.method7108();
			Static94.aClass313_8.method7105(Static169.aClass3_Sub52Array1);
		}
		if (Static95.aClass292_2.aClass3_Sub2_Sub1_2.anInt2178 != Static95.aClass292_2.anInt8012) {
			throw new RuntimeException("gnp1 pos:" + Static95.aClass292_2.aClass3_Sub2_Sub1_2.anInt2178 + " psize:" + Static95.aClass292_2.anInt8012);
		}
		for (local31 = 0; local31 < Static28.anInt1087; local31++) {
			if (Static94.aClass313_8.method7104((long) Static633.anIntArray705[local31]) == null) {
				throw new RuntimeException("gnp2 pos:" + local31 + " size:" + Static28.anInt1087);
			}
		}
		if (Static568.anInt8629 - Static28.anInt1087 != 0) {
			throw new RuntimeException("gnp3 mis:" + (Static568.anInt8629 - Static28.anInt1087));
		}
		for (@Pc(211) int local211 = 0; local211 < Static568.anInt8629; local211++) {
			if (Static169.aClass3_Sub52Array1[local211].aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8801 != Static216.anInt3560) {
				throw new RuntimeException("gnp4 uk:" + Static169.aClass3_Sub52Array1[local211].aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8783);
			}
		}
	}
}
