import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!cd", name = "J", descriptor = "[I")
	public static final int[] anIntArray50 = new int[13];

	@OriginalMember(owner = "client!cd", name = "P", descriptor = "Z")
	public static boolean aBoolean36 = true;

	@OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)Lclient!lb;")
	public static Class121 method533(@OriginalArg(0) int arg0) {
		@Pc(17) Class121 local17 = (Class121) Static330.aClass26_57.method332((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static284.aClass144_91.method3896(arg0, 34);
		local17 = new Class121();
		if (local27 != null) {
			local17.method2821(arg0, new Class11_Sub25(local27));
		}
		Static330.aClass26_57.method330((long) arg0, local17);
		return local17;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(BZLjava/lang/String;)V")
	public static void method534(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		Static221.aClass144_72.anInt4430 = 1;
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(14) short[] local14 = new short[16];
		@Pc(16) int local16 = 0;
		for (@Pc(18) int local18 = 0; local18 < Static207.anInt4248; local18++) {
			@Pc(24) Class170 local24 = Static283.method4717(local18);
			if ((!arg0 || local24.aBoolean348) && local24.anInt5337 == -1 && local24.anInt5304 == -1 && local24.anInt5291 == 0 && local24.aString53.toLowerCase().indexOf(local11) != -1) {
				if (local16 >= 250) {
					Static112.anInt2070 = -1;
					Static333.aShortArray112 = null;
					return;
				}
				if (local14.length <= local16) {
					@Pc(74) short[] local74 = new short[local14.length * 2];
					for (@Pc(76) int local76 = 0; local76 < local16; local76++) {
						local74[local76] = local14[local76];
					}
					local14 = local74;
				}
				local14[local16++] = (short) local18;
			}
		}
		Static112.anInt2070 = local16;
		Static34.anInt640 = 0;
		Static333.aShortArray112 = local14;
		@Pc(113) String[] local113 = new String[Static112.anInt2070];
		for (@Pc(115) int local115 = 0; local115 < Static112.anInt2070; local115++) {
			local113[local115] = Static283.method4717(local14[local115]).aString53;
		}
		Static315.method5282(Static333.aShortArray112, local113);
		Static221.aClass144_72.method3918();
		Static221.aClass144_72.anInt4430 = 2;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIBLclient!hh;IIIIIII)Z")
	public static boolean method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class92 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg3;
		@Pc(9) int local9 = arg4;
		@Pc(18) int local18 = arg3 - 64;
		Static135.anIntArrayArray26[64][64] = 99;
		@Pc(45) int local45 = arg4 - 64;
		Static329.anIntArrayArray75[64][64] = 0;
		@Pc(53) byte local53 = 0;
		@Pc(55) int local55 = 0;
		Static182.anIntArray268[0] = arg3;
		@Pc(62) int local62 = local53 + 1;
		Static185.anIntArray283[0] = arg4;
		@Pc(67) int[][] local67 = arg2.anIntArrayArray18;
		while (local62 != local55) {
			local9 = Static185.anIntArray283[local55];
			local7 = Static182.anIntArray268[local55];
			@Pc(82) int local82 = local7 - local18;
			@Pc(88) int local88 = local9 - arg2.anInt2177;
			@Pc(93) int local93 = local9 - local45;
			local55 = local55 + 1 & 0xFFF;
			@Pc(105) int local105 = local7 - arg2.anInt2163;
			if (arg0 == -4) {
				if (local7 == arg9 && local9 == arg5) {
					Static236.anInt4751 = local9;
					Static165.anInt3290 = local7;
					return true;
				}
			} else if (arg0 == -3) {
				if (Static180.method4117(arg6, arg8, local9, 1, 1, local7, arg9, arg5)) {
					Static236.anInt4751 = local9;
					Static165.anInt3290 = local7;
					return true;
				}
			} else if (arg0 == -2) {
				if (arg2.method1764(arg8, 1, arg9, arg6, arg5, local9, local7, arg1, 1)) {
					Static236.anInt4751 = local9;
					Static165.anInt3290 = local7;
					return true;
				}
			} else if (arg0 == -1) {
				if (arg2.method1768(arg6, arg8, arg1, local7, 1, arg9, local9, arg5)) {
					Static236.anInt4751 = local9;
					Static165.anInt3290 = local7;
					return true;
				}
			} else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
				if (arg2.method1757(arg0, local9, arg7, arg5, arg9, local7, 1)) {
					Static165.anInt3290 = local7;
					Static236.anInt4751 = local9;
					return true;
				}
			} else if (arg2.method1766(arg5, arg7, local9, arg0, 1, arg9, local7)) {
				Static165.anInt3290 = local7;
				Static236.anInt4751 = local9;
				return true;
			}
			@Pc(254) int local254 = Static329.anIntArrayArray75[local82][local93] + 1;
			if (local82 > 0 && Static135.anIntArrayArray26[local82 - 1][local93] == 0 && (local67[local105 - 1][local88] & 0x42240000) == 0) {
				Static182.anIntArray268[local62] = local7 - 1;
				Static185.anIntArray283[local62] = local9;
				local62 = local62 + 1 & 0xFFF;
				Static135.anIntArrayArray26[local82 - 1][local93] = 2;
				Static329.anIntArrayArray75[local82 - 1][local93] = local254;
			}
			if (local82 < 127 && Static135.anIntArrayArray26[local82 + 1][local93] == 0 && (local67[local105 + 1][local88] & 0x60240000) == 0) {
				Static182.anIntArray268[local62] = local7 + 1;
				Static185.anIntArray283[local62] = local9;
				local62 = local62 + 1 & 0xFFF;
				Static135.anIntArrayArray26[local82 + 1][local93] = 8;
				Static329.anIntArrayArray75[local82 + 1][local93] = local254;
			}
			if (local93 > 0 && Static135.anIntArrayArray26[local82][local93 - 1] == 0 && (local67[local105][local88 - 1] & 0x40A40000) == 0) {
				Static182.anIntArray268[local62] = local7;
				Static185.anIntArray283[local62] = local9 - 1;
				local62 = local62 + 1 & 0xFFF;
				Static135.anIntArrayArray26[local82][local93 - 1] = 1;
				Static329.anIntArrayArray75[local82][local93 - 1] = local254;
			}
			if (local93 < 127 && Static135.anIntArrayArray26[local82][local93 + 1] == 0 && (local67[local105][local88 + 1] & 0x48240000) == 0) {
				Static182.anIntArray268[local62] = local7;
				Static185.anIntArray283[local62] = local9 + 1;
				Static135.anIntArrayArray26[local82][local93 + 1] = 4;
				local62 = local62 + 1 & 0xFFF;
				Static329.anIntArrayArray75[local82][local93 + 1] = local254;
			}
			if (local82 > 0 && local93 > 0 && Static135.anIntArrayArray26[local82 - 1][local93 - 1] == 0 && (local67[local105 - 1][local88 - 1] & 0x43A40000) == 0 && (local67[local105 - 1][local88] & 0x42240000) == 0 && (local67[local105][local88 - 1] & 0x40A40000) == 0) {
				Static182.anIntArray268[local62] = local7 - 1;
				Static185.anIntArray283[local62] = local9 - 1;
				Static135.anIntArrayArray26[local82 - 1][local93 - 1] = 3;
				local62 = local62 + 1 & 0xFFF;
				Static329.anIntArrayArray75[local82 - 1][local93 - 1] = local254;
			}
			if (local82 < 127 && local93 > 0 && Static135.anIntArrayArray26[local82 + 1][local93 - 1] == 0 && (local67[local105 + 1][local88 - 1] & 0x60E40000) == 0 && (local67[local105 + 1][local88] & 0x60240000) == 0 && (local67[local105][local88 - 1] & 0x40A40000) == 0) {
				Static182.anIntArray268[local62] = local7 + 1;
				Static185.anIntArray283[local62] = local9 - 1;
				Static135.anIntArrayArray26[local82 + 1][local93 - 1] = 9;
				local62 = local62 + 1 & 0xFFF;
				Static329.anIntArrayArray75[local82 + 1][local93 - 1] = local254;
			}
			if (local82 > 0 && local93 < 127 && Static135.anIntArrayArray26[local82 - 1][local93 + 1] == 0 && (local67[local105 - 1][local88 + 1] & 0x4E240000) == 0 && (local67[local105 - 1][local88] & 0x42240000) == 0 && (local67[local105][local88 + 1] & 0x48240000) == 0) {
				Static182.anIntArray268[local62] = local7 - 1;
				Static185.anIntArray283[local62] = local9 + 1;
				local62 = local62 + 1 & 0xFFF;
				Static135.anIntArrayArray26[local82 - 1][local93 + 1] = 6;
				Static329.anIntArrayArray75[local82 - 1][local93 + 1] = local254;
			}
			if (local82 < 127 && local93 < 127 && Static135.anIntArrayArray26[local82 + 1][local93 + 1] == 0 && (local67[local105 + 1][local88 + 1] & 0x78240000) == 0 && (local67[local105 + 1][local88] & 0x60240000) == 0 && (local67[local105][local88 + 1] & 0x48240000) == 0) {
				Static182.anIntArray268[local62] = local7 + 1;
				Static185.anIntArray283[local62] = local9 + 1;
				Static135.anIntArrayArray26[local82 + 1][local93 + 1] = 12;
				local62 = local62 + 1 & 0xFFF;
				Static329.anIntArrayArray75[local82 + 1][local93 + 1] = local254;
			}
		}
		Static165.anInt3290 = local7;
		Static236.anInt4751 = local9;
		return false;
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIBIII)V")
	public static void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static280.anInt212 <= arg2 && arg5 <= Static346.anInt6607 && arg0 >= Static240.anInt4829 && Static166.anInt3315 >= arg4) {
			if (arg1 == 1) {
				Static10.method166(arg3, arg2, arg4, arg0, arg5);
			} else {
				Static22.method312(arg2, arg1, arg3, arg5, arg0, arg4);
			}
		} else if (arg1 == 1) {
			Static133.method2066(arg0, arg2, arg3, arg4, arg5);
		} else {
			Static69.method1045(arg3, arg0, arg1, arg2, arg5, arg4);
		}
	}

	@OriginalMember(owner = "client!cd", name = "a", descriptor = "(IZ)Lclient!ph;")
	public static Class11_Sub4_Sub14 method537(@OriginalArg(0) int arg0) {
		@Pc(5) Class26 local5 = Static30.aClass26_3;
		@Pc(14) Class11_Sub4_Sub14 local14;
		synchronized (Static30.aClass26_3) {
			local14 = (Class11_Sub4_Sub14) Static30.aClass26_3.method332((long) arg0);
			if (local14 == null) {
				local14 = new Class11_Sub4_Sub14(arg0);
				Static30.aClass26_3.method330((long) arg0, local14);
			}
		}
		synchronized (local14) {
			return local14.method4233() ? local14 : null;
		}
	}

	@OriginalMember(owner = "client!cd", name = "e", descriptor = "(B)V")
	public static void method539() {
		Static188.aClass137ArrayArray1 = new Class137[Static46.aClass144_19.method3893()][];
		Static192.aBooleanArray20 = new boolean[Static46.aClass144_19.method3893()];
	}
}
