import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static435 {

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "I")
	public static int anInt8191 = 0;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
	public static int anInt8192 = 0;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIII)V")
	public static void method6731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = Static132.method2911(Static444.anInt8258, arg3, Static188.anInt4410);
		@Pc(17) int local17 = Static132.method2911(Static444.anInt8258, arg1, Static188.anInt4410);
		@Pc(23) int local23 = Static132.method2911(Static251.anInt9634, arg2, Static366.anInt6946);
		@Pc(33) int local33 = Static132.method2911(Static251.anInt9634, arg0, Static366.anInt6946);
		for (@Pc(35) int local35 = local11; local35 <= local17; local35++) {
			Static36.method1264(Static632.anIntArrayArray65[local35], local23, arg4, local33);
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!jb;IIII)Z")
	public static boolean method6732(@OriginalArg(0) Class15_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!Static307.aBoolean442 || !Static350.aBoolean469) {
			return false;
		} else if (Static359.anInt6889 < 100) {
			return false;
		} else if (Static109.method2472(arg2, arg1, arg3)) {
			@Pc(31) int local31 = arg2 << Static172.anInt4156;
			@Pc(35) int local35 = arg1 << Static172.anInt4156;
			@Pc(45) int local45 = Static34.aClass86Array5[arg3].method8086(arg1, arg2) - 1;
			@Pc(51) int local51 = arg0.method8326() + local45;
			if (arg0.aShort61 == 1) {
				if (!Static97.method2223(local51, local31, local31, local51, Static572.anInt9827 + local35, local35, local45, local35, local31)) {
					return false;
				} else if (Static97.method2223(local51, local31, local31, local45, Static572.anInt9827 + local35, local35 + Static572.anInt9827, local45, local35, local31)) {
					Static299.anInt5988++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort61 == 2) {
				if (!Static97.method2223(local51, Static572.anInt9827 + local31, local31, local51, Static572.anInt9827 + local35, local35 + Static572.anInt9827, local45, Static572.anInt9827 + local35, local31)) {
					return false;
				} else if (Static97.method2223(local45, Static572.anInt9827 + local31, local31, local51, local35 + Static572.anInt9827, Static572.anInt9827 + local35, local45, Static572.anInt9827 + local35, local31 - -Static572.anInt9827)) {
					Static299.anInt5988++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort61 == 4) {
				if (!Static97.method2223(local51, local31 + Static572.anInt9827, Static572.anInt9827 + local31, local51, Static572.anInt9827 + local35, local35, local45, local35, local31 + Static572.anInt9827)) {
					return false;
				} else if (Static97.method2223(local51, local31 + Static572.anInt9827, Static572.anInt9827 + local31, local45, Static572.anInt9827 + local35, Static572.anInt9827 + local35, local45, local35, local31 + Static572.anInt9827)) {
					Static299.anInt5988++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort61 == 8) {
				if (!Static97.method2223(local51, local31 + Static572.anInt9827, local31, local51, local35, local35, local45, local35, local31)) {
					return false;
				} else if (Static97.method2223(local45, Static572.anInt9827 + local31, local31, local51, local35, local35, local45, local35, Static572.anInt9827 + local31)) {
					Static299.anInt5988++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort61 == 16) {
				if (Static591.method8163(local51, Static180.anInt4229, Static180.anInt4229 + local35, local31, local45, Static180.anInt4229)) {
					Static299.anInt5988++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort61 == 32) {
				if (Static591.method8163(local51, Static180.anInt4229, local35 + Static180.anInt4229, Static180.anInt4229 + local31, local45, Static180.anInt4229)) {
					Static299.anInt5988++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort61 == 64) {
				if (Static591.method8163(local51, Static180.anInt4229, local35, Static180.anInt4229 + local31, local45, Static180.anInt4229)) {
					Static299.anInt5988++;
					return true;
				} else {
					return false;
				}
			} else if (arg0.aShort61 != 128) {
				return true;
			} else if (Static591.method8163(local51, Static180.anInt4229, local35, local31, local45, Static180.anInt4229)) {
				Static299.anInt5988++;
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIIIIILclient!caa;IIII)Z")
	public static boolean method6733(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class48 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = arg9;
		@Pc(9) int local9 = arg0;
		@Pc(18) int local18 = arg9 - 64;
		@Pc(23) int local23 = arg0 - 64;
		Static342.anIntArrayArray37[64][64] = 99;
		Static84.anIntArrayArray5[64][64] = 0;
		@Pc(37) byte local37 = 0;
		Static452.anIntArray445[0] = arg9;
		@Pc(48) int local48 = 0;
		@Pc(51) int local51 = local37 + 1;
		Static579.anIntArray580[0] = arg0;
		@Pc(56) int[][] local56 = arg5.anIntArrayArray3;
		while (local51 != local48) {
			local7 = Static452.anIntArray445[local48];
			local9 = Static579.anIntArray580[local48];
			local48 = local48 + 1 & 0xFFF;
			@Pc(77) int local77 = local7 - local18;
			@Pc(82) int local82 = local9 - local23;
			@Pc(88) int local88 = local7 - arg5.anInt1884;
			@Pc(94) int local94 = local9 - arg5.anInt1886;
			if (arg8 == -4) {
				if (local7 == arg3 && arg7 == local9) {
					Static249.anInt5513 = local7;
					Static277.anInt5778 = local9;
					return true;
				}
			} else if (arg8 == -3) {
				if (Static318.method3985(local9, 2, 2, arg1, arg3, arg7, local7, arg4)) {
					Static249.anInt5513 = local7;
					Static277.anInt5778 = local9;
					return true;
				}
			} else if (arg8 == -2) {
				if (arg5.method1634(arg7, local7, arg1, local9, arg3, arg4, arg2, 2, 2)) {
					Static249.anInt5513 = local7;
					Static277.anInt5778 = local9;
					return true;
				}
			} else if (arg8 == -1) {
				if (arg5.method1632(arg7, local7, arg4, arg3, local9, 2, arg1, arg2)) {
					Static277.anInt5778 = local9;
					Static249.anInt5513 = local7;
					return true;
				}
			} else if (arg8 == 0 || arg8 == 1 || arg8 == 2 || arg8 == 3 || arg8 == 9) {
				if (arg5.method1646(local9, arg3, arg7, local7, arg6, arg8, 2)) {
					Static277.anInt5778 = local9;
					Static249.anInt5513 = local7;
					return true;
				}
			} else if (arg5.method1644(arg8, local9, 2, arg6, local7, arg7, arg3)) {
				Static277.anInt5778 = local9;
				Static249.anInt5513 = local7;
				return true;
			}
			@Pc(246) int local246 = Static84.anIntArrayArray5[local77][local82] + 1;
			if (local77 > 0 && Static342.anIntArrayArray37[local77 - 1][local82] == 0 && (local56[local88 - 1][local94] & 0x43A40000) == 0 && (local56[local88 - 1][local94 + 1] & 0x4E240000) == 0) {
				Static452.anIntArray445[local51] = local7 - 1;
				Static579.anIntArray580[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static342.anIntArrayArray37[local77 - 1][local82] = 2;
				Static84.anIntArrayArray5[local77 - 1][local82] = local246;
			}
			if (local77 < 126 && Static342.anIntArrayArray37[local77 + 1][local82] == 0 && (local56[local88 + 2][local94] & 0x60E40000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78240000) == 0) {
				Static452.anIntArray445[local51] = local7 + 1;
				Static579.anIntArray580[local51] = local9;
				local51 = local51 + 1 & 0xFFF;
				Static342.anIntArrayArray37[local77 + 1][local82] = 8;
				Static84.anIntArrayArray5[local77 + 1][local82] = local246;
			}
			if (local82 > 0 && Static342.anIntArrayArray37[local77][local82 - 1] == 0 && (local56[local88][local94 - 1] & 0x43A40000) == 0 && (local56[local88 + 1][local94 - 1] & 0x60E40000) == 0) {
				Static452.anIntArray445[local51] = local7;
				Static579.anIntArray580[local51] = local9 - 1;
				Static342.anIntArrayArray37[local77][local82 - 1] = 1;
				local51 = local51 + 1 & 0xFFF;
				Static84.anIntArrayArray5[local77][local82 - 1] = local246;
			}
			if (local82 < 126 && Static342.anIntArrayArray37[local77][local82 + 1] == 0 && (local56[local88][local94 + 2] & 0x4E240000) == 0 && (local56[local88 + 1][local94 + 2] & 0x78240000) == 0) {
				Static452.anIntArray445[local51] = local7;
				Static579.anIntArray580[local51] = local9 + 1;
				local51 = local51 + 1 & 0xFFF;
				Static342.anIntArrayArray37[local77][local82 + 1] = 4;
				Static84.anIntArrayArray5[local77][local82 + 1] = local246;
			}
			if (local77 > 0 && local82 > 0 && Static342.anIntArrayArray37[local77 - 1][local82 - 1] == 0 && (local56[local88 - 1][local94] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 - 1] & 0x43A40000) == 0 && (local56[local88][local94 - 1] & 0x63E40000) == 0) {
				Static452.anIntArray445[local51] = local7 - 1;
				Static579.anIntArray580[local51] = local9 - 1;
				Static342.anIntArrayArray37[local77 - 1][local82 - 1] = 3;
				local51 = local51 + 1 & 0xFFF;
				Static84.anIntArrayArray5[local77 - 1][local82 - 1] = local246;
			}
			if (local77 < 126 && local82 > 0 && Static342.anIntArrayArray37[local77 + 1][local82 - 1] == 0 && (local56[local88 + 1][local94 - 1] & 0x63E40000) == 0 && (local56[local88 + 2][local94 - 1] & 0x60E40000) == 0 && (local56[local88 + 2][local94] & 0x78E40000) == 0) {
				Static452.anIntArray445[local51] = local7 + 1;
				Static579.anIntArray580[local51] = local9 - 1;
				local51 = local51 + 1 & 0xFFF;
				Static342.anIntArrayArray37[local77 + 1][local82 - 1] = 9;
				Static84.anIntArrayArray5[local77 + 1][local82 - 1] = local246;
			}
			if (local77 > 0 && local82 < 126 && Static342.anIntArrayArray37[local77 - 1][local82 + 1] == 0 && (local56[local88 - 1][local94 + 1] & 0x4FA40000) == 0 && (local56[local88 - 1][local94 + 2] & 0x4E240000) == 0 && (local56[local88][local94 + 2] & 0x7E240000) == 0) {
				Static452.anIntArray445[local51] = local7 - 1;
				Static579.anIntArray580[local51] = local9 + 1;
				Static342.anIntArrayArray37[local77 - 1][local82 + 1] = 6;
				local51 = local51 + 1 & 0xFFF;
				Static84.anIntArrayArray5[local77 - 1][local82 + 1] = local246;
			}
			if (local77 < 126 && local82 < 126 && Static342.anIntArrayArray37[local77 + 1][local82 + 1] == 0 && (local56[local88 + 1][local94 + 2] & 0x7E240000) == 0 && (local56[local88 + 2][local94 + 2] & 0x78240000) == 0 && (local56[local88 + 2][local94 + 1] & 0x78E40000) == 0) {
				Static452.anIntArray445[local51] = local7 + 1;
				Static579.anIntArray580[local51] = local9 + 1;
				Static342.anIntArrayArray37[local77 + 1][local82 + 1] = 12;
				local51 = local51 + 1 & 0xFFF;
				Static84.anIntArrayArray5[local77 + 1][local82 + 1] = local246;
			}
		}
		Static277.anInt5778 = local9;
		Static249.anInt5513 = local7;
		return false;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIILclient!rc;Lclient!m;Lclient!ha;Lclient!aia;II)V")
	public static void method6734(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class285 arg2, @OriginalArg(4) Class8_Sub35 arg3, @OriginalArg(5) Class16 arg4, @OriginalArg(6) Class17 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(14) int local14 = arg6 - arg1 / 2 - 5;
		@Pc(18) int local18 = arg7 + 2;
		if (arg5.anInt807 != 0) {
			arg4.method6114(arg5.anInt807, local14, arg7 + arg0 * arg2.method7062() + 1 - local18, local18, arg1 + 10);
		}
		if (arg5.anInt795 != 0) {
			arg4.method6086(local14, local18, arg5.anInt795, arg2.method7062() * arg0 + arg7 + 1 - local18, arg1 + 10);
		}
		@Pc(75) int local75 = arg5.anInt804;
		if (arg3.aBoolean455 && arg5.anInt797 != -1) {
			local75 = arg5.anInt797;
		}
		for (@Pc(88) int local88 = 0; local88 < arg0; local88++) {
			@Pc(94) String local94 = Static196.aStringArray10[local88];
			if (arg0 - 1 > local88) {
				local94 = local94.substring(0, local94.length() - 4);
			}
			arg2.method7061(arg4, local94, arg6, arg7, local75);
			arg7 += arg2.method7062();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIII)V")
	public static void method6735(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class56 local7 = Static405.aClass56ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class15_Sub1_Sub5 local13 = local7.aClass15_Sub1_Sub5_1;
		@Pc(16) Class15_Sub1_Sub5 local16 = local7.aClass15_Sub1_Sub5_2;
		if (local13 != null) {
			local13.aShort120 = (short) (local13.aShort120 * arg3 / (0x10 << Static172.anInt4156 - 7));
			local13.aShort119 = (short) (local13.aShort119 * arg3 / (0x10 << Static172.anInt4156 - 7));
		}
		if (local16 != null) {
			local16.aShort120 = (short) (local16.aShort120 * arg3 / (0x10 << Static172.anInt4156 - 7));
			local16.aShort119 = (short) (local16.aShort119 * arg3 / (0x10 << Static172.anInt4156 - 7));
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IIILclient!d;Ljava/awt/Canvas;)Lclient!ha;")
	public static Class16 method6736(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) Canvas arg3) {
		return new Class16_Sub2(arg3, arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([JBII[I)V")
	public static void method6737(@OriginalArg(0) long[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg1) / 2;
		@Pc(16) int local16 = arg1;
		@Pc(20) long local20 = arg0[local14];
		arg0[local14] = arg0[arg2];
		arg0[arg2] = local20;
		@Pc(34) int local34 = arg3[local14];
		arg3[local14] = arg3[arg2];
		arg3[arg2] = local34;
		@Pc(52) int local52 = local20 == Long.MAX_VALUE ? 0 : 1;
		for (@Pc(54) int local54 = arg1; local54 < arg2; local54++) {
			if (arg0[local54] < local20 + (long) (local52 & local54)) {
				@Pc(72) long local72 = arg0[local54];
				arg0[local54] = arg0[local16];
				arg0[local16] = local72;
				@Pc(86) int local86 = arg3[local54];
				arg3[local54] = arg3[local16];
				arg3[local16++] = local86;
			}
		}
		arg0[arg2] = arg0[local16];
		arg0[local16] = local20;
		arg3[arg2] = arg3[local16];
		arg3[local16] = local34;
		method6737(arg0, arg1, local16 - 1, arg3);
		method6737(arg0, local16 + 1, arg2, arg3);
	}
}
