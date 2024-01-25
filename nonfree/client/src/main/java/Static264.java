import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static264 {

	@OriginalMember(owner = "client!qo", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
	public static int anInt5207;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
	public static int anInt5203 = 0;

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Z")
	public static boolean aBoolean388 = false;

	@OriginalMember(owner = "client!qo", name = "e", descriptor = "I")
	public static int anInt5206 = 0;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
	public static void method4799() {
		Static184.aClass21_104.method857();
		Static324.aClass21_164.method857();
		Static85.aClass21_58.method857();
		Static307.aClass21_156.method857();
		Static36.aClass21_37.method857();
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII)V")
	public static void method4800(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) int local9;
		if (Static85.anInt1910 != arg1) {
			Static273.anIntArray414 = new int[arg1];
			for (local9 = 0; local9 < arg1; local9++) {
				Static273.anIntArray414[local9] = (local9 << 12) / arg1;
			}
			Static253.anInt5162 = arg1 * 32;
			Static346.anInt6542 = arg1 - 1;
			Static85.anInt1910 = arg1;
		}
		if (arg0 == Static208.anInt4105) {
			return;
		}
		if (arg0 == Static85.anInt1910) {
			Static60.anIntArray122 = Static273.anIntArray414;
		} else {
			Static60.anIntArray122 = new int[arg0];
			for (local9 = 0; local9 < arg0; local9++) {
				Static60.anIntArray122[local9] = (local9 << 12) / arg0;
			}
		}
		Static279.anInt5435 = arg0 - 1;
		Static208.anInt4105 = arg0;
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lclient!at;IB)Ljava/lang/String;")
	public static String method4801(@OriginalArg(0) Class1_Sub7 arg0) {
		try {
			@Pc(12) int local12 = arg0.method2134();
			if (local12 > 32767) {
				local12 = 32767;
			}
			@Pc(20) byte[] local20 = new byte[local12];
			arg0.anInt2219 += Static237.aClass215_3.method5760(local20, arg0.anInt2219, local12, 0, arg0.aByteArray41);
			return Static162.method3074(local12, local20, 0);
		} catch (@Pc(44) Exception local44) {
			return "Cabbage";
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V")
	public static void method4803(@OriginalArg(1) boolean arg0) {
		@Pc(11) byte local11;
		@Pc(9) byte[][] local9;
		if (arg0) {
			local11 = 1;
			local9 = Static359.aByteArrayArray20;
		} else {
			local9 = Static355.aByteArrayArray19;
			local11 = 4;
		}
		for (@Pc(24) int local24 = 0; local24 < local11; local24++) {
			Static82.method1769();
			for (@Pc(30) int local30 = 0; local30 < Static311.anInt5653 >> 3; local30++) {
				for (@Pc(34) int local34 = 0; local34 < Static189.anInt3820 >> 3; local34++) {
					@Pc(44) int local44 = Static1.anIntArrayArrayArray4[local24][local30][local34];
					if (local44 != -1) {
						@Pc(54) int local54 = local44 >> 24 & 0x3;
						if (!arg0 || local54 == 0) {
							@Pc(67) int local67 = local44 >> 1 & 0x3;
							@Pc(73) int local73 = local44 >> 14 & 0x3FF;
							@Pc(79) int local79 = local44 >> 3 & 0x7FF;
							@Pc(89) int local89 = local79 / 8 + (local73 / 8 << 8);
							for (@Pc(91) int local91 = 0; local91 < Static37.anIntArray60.length; local91++) {
								if (local89 == Static37.anIntArray60[local91] && local9[local91] != null) {
									Static215.method3981(local9[local91], (local79 & 0x7) * 8, local54, arg0, Static9.aClass63_1, Static11.aClass196Array2, local34 * 8, (local73 & 0x7) * 8, local24, local30 * 8, local67);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIILclient!th;IIIIIII)Z")
	public static boolean method4804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class196 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg8;
		@Pc(9) int local9 = arg5;
		@Pc(18) int local18 = arg8 - 64;
		@Pc(23) int local23 = arg5 - 64;
		Static243.anIntArrayArray52[64][64] = 99;
		Static226.anIntArrayArray42[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static181.anIntArray282[0] = arg8;
		@Pc(46) int local46 = local37 + 1;
		Static77.anIntArray138[0] = arg5;
		@Pc(51) int[][] local51 = arg3.anIntArrayArray66;
		while (local46 != local39) {
			local9 = Static77.anIntArray138[local39];
			local7 = Static181.anIntArray282[local39];
			@Pc(69) int local69 = local9 - local23;
			local39 = local39 + 1 & 0xFFF;
			@Pc(80) int local80 = local7 - local18;
			@Pc(86) int local86 = local7 - arg3.anInt5923;
			@Pc(92) int local92 = local9 - arg3.anInt5905;
			if (arg4 == -4) {
				if (local7 == arg0 && arg1 == local9) {
					Static225.anInt4529 = local9;
					Static5.anInt194 = local7;
					return true;
				}
			} else if (arg4 == -3) {
				if (Static66.method1504(local9, arg1, local7, arg6, arg7, 2, 2, arg0)) {
					Static225.anInt4529 = local9;
					Static5.anInt194 = local7;
					return true;
				}
			} else if (arg4 == -2) {
				if (arg3.method5320(arg7, local7, arg6, local9, 2, arg1, arg0, 2, arg2)) {
					Static225.anInt4529 = local9;
					Static5.anInt194 = local7;
					return true;
				}
			} else if (arg4 == -1) {
				if (arg3.method5309(local7, arg2, arg7, arg1, local9, 2, arg6, arg0)) {
					Static225.anInt4529 = local9;
					Static5.anInt194 = local7;
					return true;
				}
			} else if (arg4 == 0 || arg4 == 1 || arg4 == 2 || arg4 == 3 || arg4 == 9) {
				if (arg3.method5313(arg4, arg9, local7, 2, arg1, local9, arg0)) {
					Static225.anInt4529 = local9;
					Static5.anInt194 = local7;
					return true;
				}
			} else if (arg3.method5310(arg9, 2, local9, arg0, local7, arg4, arg1)) {
				Static225.anInt4529 = local9;
				Static5.anInt194 = local7;
				return true;
			}
			@Pc(240) int local240 = Static226.anIntArrayArray42[local80][local69] + 1;
			if (local80 > 0 && Static243.anIntArrayArray52[local80 - 1][local69] == 0 && (local51[local86 - 1][local92] & 0x43A40000) == 0 && (local51[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static181.anIntArray282[local46] = local7 - 1;
				Static77.anIntArray138[local46] = local9;
				local46 = local46 + 1 & 0xFFF;
				Static243.anIntArrayArray52[local80 - 1][local69] = 2;
				Static226.anIntArrayArray42[local80 - 1][local69] = local240;
			}
			if (local80 < 126 && Static243.anIntArrayArray52[local80 + 1][local69] == 0 && (local51[local86 + 2][local92] & 0x60E40000) == 0 && (local51[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static181.anIntArray282[local46] = local7 + 1;
				Static77.anIntArray138[local46] = local9;
				Static243.anIntArrayArray52[local80 + 1][local69] = 8;
				local46 = local46 + 1 & 0xFFF;
				Static226.anIntArrayArray42[local80 + 1][local69] = local240;
			}
			if (local69 > 0 && Static243.anIntArrayArray52[local80][local69 - 1] == 0 && (local51[local86][local92 - 1] & 0x43A40000) == 0 && (local51[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static181.anIntArray282[local46] = local7;
				Static77.anIntArray138[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static243.anIntArrayArray52[local80][local69 - 1] = 1;
				Static226.anIntArrayArray42[local80][local69 - 1] = local240;
			}
			if (local69 < 126 && Static243.anIntArrayArray52[local80][local69 + 1] == 0 && (local51[local86][local92 + 2] & 0x4E240000) == 0 && (local51[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static181.anIntArray282[local46] = local7;
				Static77.anIntArray138[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static243.anIntArrayArray52[local80][local69 + 1] = 4;
				Static226.anIntArrayArray42[local80][local69 + 1] = local240;
			}
			if (local80 > 0 && local69 > 0 && Static243.anIntArrayArray52[local80 - 1][local69 - 1] == 0 && (local51[local86 - 1][local92] & 0x4FA40000) == 0 && (local51[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local51[local86][local92 - 1] & 0x63E40000) == 0) {
				Static181.anIntArray282[local46] = local7 - 1;
				Static77.anIntArray138[local46] = local9 - 1;
				local46 = local46 + 1 & 0xFFF;
				Static243.anIntArrayArray52[local80 - 1][local69 - 1] = 3;
				Static226.anIntArrayArray42[local80 - 1][local69 - 1] = local240;
			}
			if (local80 < 126 && local69 > 0 && Static243.anIntArrayArray52[local80 + 1][local69 - 1] == 0 && (local51[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local51[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local51[local86 + 2][local92] & 0x78E40000) == 0) {
				Static181.anIntArray282[local46] = local7 + 1;
				Static77.anIntArray138[local46] = local9 - 1;
				Static243.anIntArrayArray52[local80 + 1][local69 - 1] = 9;
				local46 = local46 + 1 & 0xFFF;
				Static226.anIntArrayArray42[local80 + 1][local69 - 1] = local240;
			}
			if (local80 > 0 && local69 < 126 && Static243.anIntArrayArray52[local80 - 1][local69 + 1] == 0 && (local51[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local51[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local51[local86][local92 + 2] & 0x7E240000) == 0) {
				Static181.anIntArray282[local46] = local7 - 1;
				Static77.anIntArray138[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static243.anIntArrayArray52[local80 - 1][local69 + 1] = 6;
				Static226.anIntArrayArray42[local80 - 1][local69 + 1] = local240;
			}
			if (local80 < 126 && local69 < 126 && Static243.anIntArrayArray52[local80 + 1][local69 + 1] == 0 && (local51[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local51[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local51[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static181.anIntArray282[local46] = local7 + 1;
				Static77.anIntArray138[local46] = local9 + 1;
				local46 = local46 + 1 & 0xFFF;
				Static243.anIntArrayArray52[local80 + 1][local69 + 1] = 12;
				Static226.anIntArrayArray42[local80 + 1][local69 + 1] = local240;
			}
		}
		Static225.anInt4529 = local9;
		Static5.anInt194 = local7;
		return false;
	}
}
