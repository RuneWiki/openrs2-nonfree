import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!ja", name = "A", descriptor = "I")
	public static int anInt2793;

	@OriginalMember(owner = "client!ja", name = "t", descriptor = "I")
	public static int anInt2789 = 0;

	@OriginalMember(owner = "client!ja", name = "u", descriptor = "Z")
	public static boolean aBoolean186 = false;

	@OriginalMember(owner = "client!ja", name = "z", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray16 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

	@OriginalMember(owner = "client!ja", name = "D", descriptor = "I")
	public static int anInt2796 = 0;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BI)Lclient!c;")
	public static Class27 method2608(@OriginalArg(1) int arg0) {
		@Pc(5) Class66 local5 = Static207.aClass66_71;
		@Pc(14) Class27 local14;
		synchronized (Static207.aClass66_71) {
			local14 = (Class27) Static207.aClass66_71.method1939((long) arg0);
		}
		if (local14 != null) {
			return local14;
		}
		@Pc(34) byte[] local34 = Static288.aClass170_96.method4584(Static47.method1061(arg0), Static126.method2449(arg0));
		local14 = new Class27();
		if (local34 != null) {
			local14.method763(new Class5_Sub1(local34));
		}
		@Pc(57) Class66 local57 = Static207.aClass66_71;
		synchronized (Static207.aClass66_71) {
			Static207.aClass66_71.method1936((long) arg0, local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIZIBZ)V")
	public static void method2609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(6) boolean arg5) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(19) int local19 = (arg1 + arg2) / 2;
		@Pc(21) int local21 = arg1;
		@Pc(25) Class47_Sub1 local25 = Static63.aClass47_Sub1Array1[local19];
		Static63.aClass47_Sub1Array1[local19] = Static63.aClass47_Sub1Array1[arg2];
		Static63.aClass47_Sub1Array1[arg2] = local25;
		for (@Pc(37) int local37 = arg1; local37 < arg2; local37++) {
			if (Static328.method5520(arg3, arg5, local25, arg0, arg4, Static63.aClass47_Sub1Array1[local37]) <= 0) {
				@Pc(54) Class47_Sub1 local54 = Static63.aClass47_Sub1Array1[local37];
				Static63.aClass47_Sub1Array1[local37] = Static63.aClass47_Sub1Array1[local21];
				Static63.aClass47_Sub1Array1[local21++] = local54;
			}
		}
		Static63.aClass47_Sub1Array1[arg2] = Static63.aClass47_Sub1Array1[local21];
		Static63.aClass47_Sub1Array1[local21] = local25;
		method2609(arg0, arg1, local21 - 1, arg3, arg4, arg5);
		method2609(arg0, local21 + 1, arg2, arg3, arg4, arg5);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IZII)I")
	public static int method2611(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 > 243) {
			arg0 >>= 0x4;
		} else if (arg2 > 217) {
			arg0 >>= 0x3;
		} else if (arg2 > 192) {
			arg0 >>= 0x2;
		} else if (arg2 > 179) {
			arg0 >>= 0x1;
		}
		return ((arg1 >> 2 & 0x3F) << 10) + ((arg0 >> 5 << 7) + (arg2 >> 1));
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lclient!am;I)V")
	public static void method2612(@OriginalArg(0) Class10 arg0) {
		Static190.anInt3772 = 3;
		Static249.method4371(true);
		Static322.aBoolean457 = true;
		Static32.anInt866 = 0;
		Static126.anInt2647 = 127;
		Static229.anInt4486 = 0;
		Static134.anInt2750 = 2;
		Static263.aBoolean385 = true;
		Static29.aBoolean56 = true;
		Static275.anInt5386 = 0;
		Static262.aBoolean384 = true;
		Static123.anInt2600 = 127;
		Static67.aBoolean110 = true;
		Static8.aBoolean7 = true;
		Static332.anInt6258 = 1;
		Static111.anInt2405 = 255;
		Static18.aBoolean39 = true;
		Static45.anInt1175 = 0;
		Static267.aBoolean391 = true;
		Static22.aBoolean43 = true;
		Static114.aBoolean158 = true;
		if (Static46.anInt1196 < 96) {
			Static144.method2704(0);
		} else {
			Static144.method2704(2);
		}
		Static139.aBoolean462 = false;
		Static91.aBoolean135 = false;
		Static335.anInt6338 = 0;
		Static326.anInt6197 = 2;
		Static90.aBoolean316 = true;
		Static355.anInt6625 = 2;
		Static183.aBoolean261 = true;
		aBoolean186 = false;
		Static216.anInt4318 = 0;
		@Pc(83) Class117 local83 = null;
		try {
			@Pc(87) Class60 local87 = arg0.method328();
			while (local87.anInt1838 == 0) {
				Static105.method2138(1L);
			}
			if (local87.anInt1838 == 1) {
				local83 = (Class117) local87.anObject2;
				@Pc(119) byte[] local119 = new byte[(int) local83.method3259()];
				@Pc(133) int local133;
				for (@Pc(121) int local121 = 0; local121 < local119.length; local121 += local133) {
					local133 = local83.method3261(local119, local121, local119.length - local121);
					if (local133 == -1) {
						throw new IOException("EOF");
					}
				}
				Static163.method3007(new Class5_Sub1(local119));
			}
		} catch (@Pc(161) Exception local161) {
		}
		try {
			if (local83 != null) {
				local83.method3260();
			}
		} catch (@Pc(168) Exception local168) {
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
	public static void method2613() {
		@Pc(1) Class66 local1 = Static261.aClass66_88;
		synchronized (Static261.aClass66_88) {
			Static261.aClass66_88.method1942();
		}
	}

	@OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
	public static void method2615() {
		if (Static11.aString20.toLowerCase().indexOf("microsoft") != -1) {
			Static68.anIntArray79[186] = 57;
			Static68.anIntArray79[221] = 43;
			Static68.anIntArray79[191] = 73;
			Static68.anIntArray79[223] = 28;
			Static68.anIntArray79[222] = 59;
			Static68.anIntArray79[188] = 71;
			Static68.anIntArray79[190] = 72;
			Static68.anIntArray79[220] = 74;
			Static68.anIntArray79[219] = 42;
			Static68.anIntArray79[189] = 26;
			Static68.anIntArray79[187] = 27;
			Static68.anIntArray79[192] = 58;
			return;
		}
		Static68.anIntArray79[91] = 42;
		Static68.anIntArray79[93] = 43;
		Static68.anIntArray79[92] = 74;
		if (Static11.aMethod2 == null) {
			Static68.anIntArray79[222] = 59;
			Static68.anIntArray79[192] = 58;
		} else {
			Static68.anIntArray79[222] = 58;
			Static68.anIntArray79[192] = 28;
			Static68.anIntArray79[520] = 59;
		}
		Static68.anIntArray79[47] = 73;
		Static68.anIntArray79[45] = 26;
		Static68.anIntArray79[46] = 72;
		Static68.anIntArray79[61] = 27;
		Static68.anIntArray79[44] = 71;
		Static68.anIntArray79[59] = 57;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IILclient!dl;IIIIIIII)Z")
	public static boolean method2617(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class49 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg0;
		@Pc(9) int local9 = arg1;
		@Pc(18) int local18 = arg0 - 64;
		@Pc(23) int local23 = arg1 - 64;
		Static55.anIntArrayArray6[64][64] = 99;
		Static144.anIntArrayArray19[64][64] = 0;
		@Pc(42) byte local42 = 0;
		@Pc(44) int local44 = 0;
		Static219.anIntArray309[0] = arg0;
		@Pc(51) int local51 = local42 + 1;
		Static302.anIntArray449[0] = arg1;
		@Pc(56) int[][] local56 = arg2.anIntArrayArray7;
		while (local51 != local44) {
			local7 = Static219.anIntArray309[local44];
			local9 = Static302.anIntArray449[local44];
			local44 = local44 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - local18;
			@Pc(82) int local82 = local9 - local23;
			@Pc(87) int local87 = local7 - arg2.anInt1413;
			@Pc(92) int local92 = local9 - arg2.anInt1400;
			if (arg6 == -4) {
				if (arg4 == local7 && local9 == arg5) {
					Static9.anInt309 = local9;
					Static259.anInt3212 = local7;
					return true;
				}
			} else if (arg6 == -3) {
				if (Static324.method5466(2, arg8, local9, arg4, arg3, local7, arg5, 2)) {
					Static259.anInt3212 = local7;
					Static9.anInt309 = local9;
					return true;
				}
			} else if (arg6 == -2) {
				if (arg2.method1243(2, local9, arg3, arg8, local7, arg5, arg9, 2, arg4)) {
					Static259.anInt3212 = local7;
					Static9.anInt309 = local9;
					return true;
				}
			} else if (arg6 == -1) {
				if (arg2.method1242(arg5, local7, arg4, arg9, local9, arg8, 2, arg3)) {
					Static9.anInt309 = local9;
					Static259.anInt3212 = local7;
					return true;
				}
			} else if (arg6 == 0 || arg6 == 1 || arg6 == 2 || arg6 == 3 || arg6 == 9) {
				if (arg2.method1239(2, arg5, arg4, local7, local9, arg7, arg6)) {
					Static259.anInt3212 = local7;
					Static9.anInt309 = local9;
					return true;
				}
			} else if (arg2.method1233(local9, arg5, local7, arg7, arg4, arg6, 2)) {
				Static9.anInt309 = local9;
				Static259.anInt3212 = local7;
				return true;
			}
			@Pc(243) int local243 = Static144.anIntArrayArray19[local77][local82] + 1;
			if (local77 > 0 && Static55.anIntArrayArray6[local77 - 1][local82] == 0 && (local56[local87 - 1][local92] & 0x43A40000) == 0 && (local56[local87 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static219.anIntArray309[local51] = local7 - 1;
				Static302.anIntArray449[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static55.anIntArrayArray6[local77 - 1][local82] = 2;
				Static144.anIntArrayArray19[local77 - 1][local82] = local243;
			}
			if (local77 < 126 && Static55.anIntArrayArray6[local77 + 1][local82] == 0 && (local56[local87 + 2][local92] & 0x60E40000) == 0 && (local56[local87 + 2][local92 + 1] & 0x78240000) == 0) {
				Static219.anIntArray309[local51] = local7 + 1;
				Static302.anIntArray449[local51] = local9;
				Static55.anIntArrayArray6[local77 + 1][local82] = 8;
				local51 = local51 + 1 & 0xFFF;
				Static144.anIntArrayArray19[local77 + 1][local82] = local243;
			}
			if (local82 > 0 && Static55.anIntArrayArray6[local77][local82 - 1] == 0 && (local56[local87][local92 - 1] & 0x43A40000) == 0 && (local56[local87 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static219.anIntArray309[local51] = local7;
				Static302.anIntArray449[local51] = local9 - 1;
				Static55.anIntArrayArray6[local77][local82 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static144.anIntArrayArray19[local77][local82 - 1] = local243;
			}
			if (local82 < 126 && Static55.anIntArrayArray6[local77][local82 + 1] == 0 && (local56[local87][local92 + 2] & 0x4E240000) == 0 && (local56[local87 + 1][local92 + 2] & 0x78240000) == 0) {
				Static219.anIntArray309[local51] = local7;
				Static302.anIntArray449[local51] = local9 + 1;
				Static55.anIntArrayArray6[local77][local82 + 1] = 4;
				local51 = local51 + 1 & 0xFFF;
				Static144.anIntArrayArray19[local77][local82 + 1] = local243;
			}
			if (local77 > 0 && local82 > 0 && Static55.anIntArrayArray6[local77 - 1][local82 - 1] == 0 && (local56[local87 - 1][local92] & 0x4FA40000) == 0 && (local56[local87 - 1][local92 - 1] & 0x43A40000) == 0 && (local56[local87][local92 - 1] & 0x63E40000) == 0) {
				Static219.anIntArray309[local51] = local7 - 1;
				Static302.anIntArray449[local51] = local9 - 1;
				Static55.anIntArrayArray6[local77 - 1][local82 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static144.anIntArrayArray19[local77 - 1][local82 - 1] = local243;
			}
			if (local77 < 126 && local82 > 0 && Static55.anIntArrayArray6[local77 + 1][local82 - 1] == 0 && (local56[local87 + 1][local92 - 1] & 0x63E40000) == 0 && (local56[local87 + 2][local92 - 1] & 0x60E40000) == 0 && (local56[local87 + 2][local92] & 0x78E40000) == 0) {
				Static219.anIntArray309[local51] = local7 + 1;
				Static302.anIntArray449[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static55.anIntArrayArray6[local77 + 1][local82 - 1] = 9;
				Static144.anIntArrayArray19[local77 + 1][local82 - 1] = local243;
			}
			if (local77 > 0 && local82 < 126 && Static55.anIntArrayArray6[local77 - 1][local82 + 1] == 0 && (local56[local87 - 1][local92 + 1] & 0x4FA40000) == 0 && (local56[local87 - 1][local92 + 2] & 0x4E240000) == 0 && (local56[local87][local92 + 2] & 0x7E240000) == 0) {
				Static219.anIntArray309[local51] = local7 - 1;
				Static302.anIntArray449[local51] = local9 + 1;
				Static55.anIntArrayArray6[local77 - 1][local82 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static144.anIntArrayArray19[local77 - 1][local82 + 1] = local243;
			}
			if (local77 < 126 && local82 < 126 && Static55.anIntArrayArray6[local77 + 1][local82 + 1] == 0 && (local56[local87 + 1][local92 + 2] & 0x7E240000) == 0 && (local56[local87 + 2][local92 + 2] & 0x78240000) == 0 && (local56[local87 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static219.anIntArray309[local51] = local7 + 1;
				Static302.anIntArray449[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static55.anIntArrayArray6[local77 + 1][local82 + 1] = 12;
				Static144.anIntArrayArray19[local77 + 1][local82 + 1] = local243;
			}
		}
		Static9.anInt309 = local9;
		Static259.anInt3212 = local7;
		return false;
	}
}
