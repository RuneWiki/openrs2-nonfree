import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static343 {

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILclient!mr;)V")
	public static void method3352(@OriginalArg(1) Class1_Sub2_Sub3 arg0) {
		@Pc(9) int local9 = arg0.anInt6956 - Static6.anInt91;
		@Pc(21) int local21 = arg0.anInt6910 * 128 + arg0.method5787() * 64;
		@Pc(33) int local33 = arg0.anInt6918 * 128 + arg0.method5787() * 64;
		arg0.anInt6964 = 0;
		arg0.anInt6893 += (local21 - arg0.anInt6893) / local9;
		arg0.anInt6888 += (local33 - arg0.anInt6888) / local9;
		if (arg0.anInt6950 == 0) {
			arg0.method5773(8192);
		}
		if (arg0.anInt6950 == 1) {
			arg0.method5773(12288);
		}
		if (arg0.anInt6950 == 2) {
			arg0.method5773(0);
		}
		if (arg0.anInt6950 == 3) {
			arg0.method5773(4096);
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method3354(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		while (local14 > local11 && Static256.method4495(arg0.charAt(local11))) {
			local11++;
		}
		while (local14 > local11 && Static256.method4495(arg0.charAt(local14 - 1))) {
			local14--;
		}
		@Pc(56) int local56 = local14 - local11;
		if (local56 < 1 || local56 > 12) {
			return null;
		}
		@Pc(71) StringBuffer local71 = new StringBuffer(local56);
		for (@Pc(73) int local73 = local11; local73 < local14; local73++) {
			@Pc(79) char local79 = arg0.charAt(local73);
			if (Static138.method2695(local79)) {
				@Pc(87) char local87 = Static49.method938(local79);
				if (local87 != '\u0000') {
					local71.append(local87);
				}
			}
		}
		if (local71.length() == 0) {
			return null;
		} else {
			return local71.toString();
		}
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lclient!kr;ILclient!or;Lclient!fh;IIII)V")
	public static void method3355(@OriginalArg(0) Class46 arg0, @OriginalArg(2) Class124 arg1, @OriginalArg(3) Class68 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg0 == null) {
			return;
		}
		@Pc(16) int local16;
		if (Static135.anInt2910 == 4) {
			local16 = (int) Static366.aFloat48 & 0x3FFF;
		} else {
			local16 = Static85.anInt1601 + (int) Static366.aFloat48 & 0x3FFF;
		}
		@Pc(37) int local37 = Math.max(arg2.anInt1874 / 2, arg2.anInt1845 / 2) + 10;
		@Pc(45) int local45 = arg6 * arg6 + arg5 * arg5;
		if (local45 > local37 * local37) {
			return;
		}
		@Pc(59) int local59 = Class101.anIntArray234[local16];
		@Pc(66) int local66 = Class101.anIntArray235[local16];
		if (Static135.anInt2910 != 4) {
			local66 = local66 * 256 / (Static267.anInt5561 + 256);
			local59 = local59 * 256 / (Static267.anInt5561 + 256);
		}
		@Pc(95) int local95 = local59 * arg6 + arg5 * local66 >> 15;
		@Pc(105) int local105 = arg6 * local66 - arg5 * local59 >> 15;
		arg0.method5018(local95 + arg2.anInt1874 / 2 + arg4 - arg0.method5031() / 2, arg3 - (-(arg2.anInt1845 / 2) - -local105 - -(arg0.method5022() / 2)), arg1, arg4, arg3);
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)I")
	public static int method3356() {
		return 2;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(I[B)Z")
	public static boolean method3357(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub12 local8 = new Class2_Sub12(arg0);
		@Pc(14) int local14 = local8.method3124();
		if (local14 != 1) {
			return false;
		}
		@Pc(32) boolean local32 = local8.method3124() == 1;
		if (local32) {
			Static271.method4702(local8);
		}
		Static321.method1020(local8);
		return true;
	}

	@OriginalMember(owner = "client!vh", name = "a", descriptor = "(BIILclient!ek;IIIIIII)Z")
	public static boolean method3358(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class61 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg7;
		@Pc(18) int local18 = arg9 - 64;
		Static182.anIntArrayArray26[64][64] = 99;
		@Pc(29) int local29 = arg7 - 64;
		Static233.anIntArrayArray47[64][64] = 0;
		@Pc(37) byte local37 = 0;
		@Pc(39) int local39 = 0;
		Static309.anIntArray471[0] = arg9;
		@Pc(51) int local51 = local37 + 1;
		Static270.anIntArray432[0] = arg7;
		@Pc(56) int[][] local56 = arg2.anIntArrayArray19;
		while (local51 != local39) {
			local7 = Static309.anIntArray471[local39];
			local9 = Static270.anIntArray432[local39];
			@Pc(70) int local70 = local9 - local29;
			@Pc(76) int local76 = local9 - arg2.anInt1460;
			local39 = local39 + 1 & 0xFFF;
			@Pc(88) int local88 = local7 - arg2.anInt1457;
			@Pc(93) int local93 = local7 - local18;
			if (arg3 == -4) {
				if (arg0 == local7 && arg8 == local9) {
					Static152.anInt3473 = local9;
					Static49.anInt821 = local7;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static286.method4839(arg1, local9, 1, arg8, 1, local7, arg0, arg4)) {
					Static152.anInt3473 = local9;
					Static49.anInt821 = local7;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg2.method1605(arg1, arg4, 1, 1, arg6, local9, local7, arg0, arg8)) {
					Static49.anInt821 = local7;
					Static152.anInt3473 = local9;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg2.method1600(arg0, local9, arg1, local7, arg6, 1, arg8, arg4)) {
					Static152.anInt3473 = local9;
					Static49.anInt821 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg2.method1608(arg5, arg0, arg3, 1, local9, local7, arg8)) {
					Static49.anInt821 = local7;
					Static152.anInt3473 = local9;
					return true;
				}
			} else if (arg2.method1613(arg8, arg3, arg5, arg0, 1, local7, local9)) {
				Static152.anInt3473 = local9;
				Static49.anInt821 = local7;
				return true;
			}
			@Pc(241) int local241 = Static233.anIntArrayArray47[local93][local70] + 1;
			if (local93 > 0 && Static182.anIntArrayArray26[local93 - 1][local70] == 0 && (local56[local88 - 1][local76] & 0x42240000) == 0) {
				Static309.anIntArray471[local51] = local7 - 1;
				Static270.anIntArray432[local51] = local9;
				Static182.anIntArrayArray26[local93 - 1][local70] = 2;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray47[local93 - 1][local70] = local241;
			}
			if (local93 < 127 && Static182.anIntArrayArray26[local93 + 1][local70] == 0 && (local56[local88 + 1][local76] & 0x60240000) == 0) {
				Static309.anIntArray471[local51] = local7 + 1;
				Static270.anIntArray432[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static182.anIntArrayArray26[local93 + 1][local70] = 8;
				Static233.anIntArrayArray47[local93 + 1][local70] = local241;
			}
			if (local70 > 0 && Static182.anIntArrayArray26[local93][local70 - 1] == 0 && (local56[local88][local76 - 1] & 0x40A40000) == 0) {
				Static309.anIntArray471[local51] = local7;
				Static270.anIntArray432[local51] = local9 - 1;
				Static182.anIntArrayArray26[local93][local70 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray47[local93][local70 - 1] = local241;
			}
			if (local70 < 127 && Static182.anIntArrayArray26[local93][local70 + 1] == 0 && (local56[local88][local76 + 1] & 0x48240000) == 0) {
				Static309.anIntArray471[local51] = local7;
				Static270.anIntArray432[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static182.anIntArrayArray26[local93][local70 + 1] = 4;
				Static233.anIntArrayArray47[local93][local70 + 1] = local241;
			}
			if (local93 > 0 && local70 > 0 && Static182.anIntArrayArray26[local93 - 1][local70 - 1] == 0 && (local56[local88 - 1][local76 - 1] & 0x43A40000) == 0 && (local56[local88 - 1][local76] & 0x42240000) == 0 && (local56[local88][local76 - 1] & 0x40A40000) == 0) {
				Static309.anIntArray471[local51] = local7 - 1;
				Static270.anIntArray432[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static182.anIntArrayArray26[local93 - 1][local70 - 1] = 3;
				Static233.anIntArrayArray47[local93 - 1][local70 - 1] = local241;
			}
			if (local93 < 127 && local70 > 0 && Static182.anIntArrayArray26[local93 + 1][local70 - 1] == 0 && (local56[local88 + 1][local76 - 1] & 0x60E40000) == 0 && (local56[local88 + 1][local76] & 0x60240000) == 0 && (local56[local88][local76 - 1] & 0x40A40000) == 0) {
				Static309.anIntArray471[local51] = local7 + 1;
				Static270.anIntArray432[local51] = local9 - 1;
				Static182.anIntArrayArray26[local93 + 1][local70 - 1] = 9;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray47[local93 + 1][local70 - 1] = local241;
			}
			if (local93 > 0 && local70 < 127 && Static182.anIntArrayArray26[local93 - 1][local70 + 1] == 0 && (local56[local88 - 1][local76 + 1] & 0x4E240000) == 0 && (local56[local88 - 1][local76] & 0x42240000) == 0 && (local56[local88][local76 + 1] & 0x48240000) == 0) {
				Static309.anIntArray471[local51] = local7 - 1;
				Static270.anIntArray432[local51] = local9 + 1;
				Static182.anIntArrayArray26[local93 - 1][local70 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static233.anIntArrayArray47[local93 - 1][local70 + 1] = local241;
			}
			if (local93 < 127 && local70 < 127 && Static182.anIntArrayArray26[local93 + 1][local70 + 1] == 0 && (local56[local88 + 1][local76 + 1] & 0x78240000) == 0 && (local56[local88 + 1][local76] & 0x60240000) == 0 && (local56[local88][local76 + 1] & 0x48240000) == 0) {
				Static309.anIntArray471[local51] = local7 + 1;
				Static270.anIntArray432[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static182.anIntArrayArray26[local93 + 1][local70 + 1] = 12;
				Static233.anIntArrayArray47[local93 + 1][local70 + 1] = local241;
			}
		}
		Static49.anInt821 = local7;
		Static152.anInt3473 = local9;
		return false;
	}
}
