import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!he", name = "q", descriptor = "Lclient!am;")
	public static Class11 aClass11_52;

	@OriginalMember(owner = "client!he", name = "r", descriptor = "I")
	public static int anInt2468;

	@OriginalMember(owner = "client!he", name = "p", descriptor = "I")
	public static int anInt2467 = -1;

	@OriginalMember(owner = "client!he", name = "t", descriptor = "[I")
	public static final int[] anIntArray237 = new int[14];

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BIILclient!go;Lclient!fd;IIILclient!vm;)V")
	public static void method2079(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class84 arg2, @OriginalArg(4) Class72 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class92 arg7) {
		@Pc(9) Class139 local9 = Static20.method377(arg5);
		if (local9 == null || !local9.aBoolean371 || !local9.method3656()) {
			return;
		}
		@Pc(28) int local28;
		if (local9.anIntArray365 != null) {
			@Pc(26) int[] local26 = new int[local9.anIntArray365.length];
			@Pc(42) int local42;
			for (local28 = 0; local28 < local26.length / 2; local28++) {
				if (Static303.anInt3065 == 4) {
					local42 = (int) Static138.aFloat35 & 0x3FFF;
				} else {
					local42 = Static222.anInt4620 + (int) Static138.aFloat35 & 0x3FFF;
				}
				@Pc(53) int local53 = Class4_Sub4_Sub25.anIntArray384[local42];
				@Pc(57) int local57 = Class4_Sub4_Sub25.anIntArray383[local42];
				if (Static303.anInt3065 != 4) {
					local53 = local53 * 256 / (Static48.anInt1082 + 256);
					local57 = local57 * 256 / (Static48.anInt1082 + 256);
				}
				local26[local28 * 2] = (local53 * (arg4 + local9.anIntArray365[local28 * 2 + 1] * 4) + local57 * (arg6 + local9.anIntArray365[local28 * 2] * 4) >> 15) + (arg0 + (arg3.anInt1829 / 2));
				local26[local28 * 2 + 1] = arg3.anInt1806 / 2 + arg1 - (-((local9.anIntArray365[local28 * 2] * 4 + arg6) * local53) + (arg4 - -(local9.anIntArray365[local28 * 2 + 1] * 4)) * local57 >> 15);
			}
			Static26.method468(arg7, local26, local9.anInt4367, arg3.anIntArray182, arg3.anIntArray184);
			for (local42 = 0; local42 < local26.length / 2 - 1; local42++) {
				arg7.method4487(local26[local42 * 2], local26[local42 * 2 + 1], local26[local42 * 2 + 2], local26[local42 * 2 + 2 + 1], local9.anInt4374, arg2, arg0, arg1);
			}
			arg7.method4487(local26[local26.length - 2], local26[local26.length - 1], local26[0], local26[1], local9.anInt4374, arg2, arg0, arg1);
		}
		@Pc(261) Class60 local261 = null;
		if (local9.anInt4358 != -1) {
			local261 = local9.method3659(false, arg7);
			if (local261 != null) {
				Static2.method4193(arg3, arg4, local261, arg0, arg1, arg2, arg6);
			}
		}
		if (local9.aString156 == null) {
			return;
		}
		local28 = 0;
		if (local261 != null) {
			local28 = local261.method5687();
		}
		@Pc(295) Class78 local295 = Static14.aClass78_1;
		@Pc(297) Class106 local297 = Static259.aClass106_8;
		if (local9.anInt4357 == 1) {
			local297 = Static232.aClass106_5;
			local295 = Static118.aClass78_3;
		}
		if (local9.anInt4357 == 2) {
			local297 = Static242.aClass106_7;
			local295 = Static81.aClass78_2;
		}
		Static290.method4961(arg4, local297, arg0, arg2, arg3, arg1, local9.aString156, local9.anInt4378, local295, arg6, local28);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIILclient!qs;IIIIIB)Z")
	public static boolean method2080(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class174 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(7) int local7 = arg2;
		@Pc(9) int local9 = arg7;
		@Pc(26) int local26 = arg2 - 64;
		@Pc(31) int local31 = arg7 - 64;
		Static36.anIntArrayArray11[64][64] = 99;
		Static218.anIntArrayArray41[64][64] = 0;
		@Pc(45) byte local45 = 0;
		Static304.anIntArray499[0] = arg2;
		@Pc(51) int local51 = 0;
		@Pc(54) int local54 = local45 + 1;
		Static333.anIntArray5[0] = arg7;
		@Pc(59) int[][] local59 = arg4.anIntArrayArray53;
		while (local51 != local54) {
			local7 = Static304.anIntArray499[local51];
			local9 = Static333.anIntArray5[local51];
			@Pc(74) int local74 = local7 - local26;
			@Pc(80) int local80 = local7 - arg4.anInt5481;
			@Pc(85) int local85 = local9 - arg4.anInt5486;
			local51 = local51 + 1 & 0xFFF;
			@Pc(96) int local96 = local9 - local31;
			if (arg5 == -4) {
				if (local7 == arg9 && arg1 == local9) {
					Static330.anInt6452 = local9;
					Static295.anInt5963 = local7;
					return true;
				}
			} else if (arg5 == -3) {
				if (Static265.method4632(arg9, arg1, local7, local9, 1, 1, arg8, arg6)) {
					Static295.anInt5963 = local7;
					Static330.anInt6452 = local9;
					return true;
				}
			} else if (arg5 == -2) {
				if (arg4.method4667(1, arg1, 1, local7, arg6, arg0, arg8, arg9, local9)) {
					Static295.anInt5963 = local7;
					Static330.anInt6452 = local9;
					return true;
				}
			} else if (arg5 == -1) {
				if (arg4.method4653(arg1, arg6, arg9, local9, 1, arg0, local7, arg8)) {
					Static295.anInt5963 = local7;
					Static330.anInt6452 = local9;
					return true;
				}
			} else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
				if (arg4.method4657(1, arg3, local7, arg5, local9, arg9, arg1)) {
					Static295.anInt5963 = local7;
					Static330.anInt6452 = local9;
					return true;
				}
			} else if (arg4.method4658(arg5, arg1, local7, arg9, 1, arg3, local9)) {
				Static330.anInt6452 = local9;
				Static295.anInt5963 = local7;
				return true;
			}
			@Pc(246) int local246 = Static218.anIntArrayArray41[local74][local96] + 1;
			if (local74 > 0 && Static36.anIntArrayArray11[local74 - 1][local96] == 0 && (local59[local80 - 1][local85] & 0x42240000) == 0) {
				Static304.anIntArray499[local54] = local7 - 1;
				Static333.anIntArray5[local54] = local9;
				local54 = local54 + 1 & 0xFFF;
				Static36.anIntArrayArray11[local74 - 1][local96] = 2;
				Static218.anIntArrayArray41[local74 - 1][local96] = local246;
			}
			if (local74 < 127 && Static36.anIntArrayArray11[local74 + 1][local96] == 0 && (local59[local80 + 1][local85] & 0x60240000) == 0) {
				Static304.anIntArray499[local54] = local7 + 1;
				Static333.anIntArray5[local54] = local9;
				local54 = local54 + 1 & 0xFFF;
				Static36.anIntArrayArray11[local74 + 1][local96] = 8;
				Static218.anIntArrayArray41[local74 + 1][local96] = local246;
			}
			if (local96 > 0 && Static36.anIntArrayArray11[local74][local96 - 1] == 0 && (local59[local80][local85 - 1] & 0x40A40000) == 0) {
				Static304.anIntArray499[local54] = local7;
				Static333.anIntArray5[local54] = local9 - 1;
				Static36.anIntArrayArray11[local74][local96 - 1] = 1;
				local54 = local54 + 1 & 0xFFF;
				Static218.anIntArrayArray41[local74][local96 - 1] = local246;
			}
			if (local96 < 127 && Static36.anIntArrayArray11[local74][local96 + 1] == 0 && (local59[local80][local85 + 1] & 0x48240000) == 0) {
				Static304.anIntArray499[local54] = local7;
				Static333.anIntArray5[local54] = local9 + 1;
				Static36.anIntArrayArray11[local74][local96 + 1] = 4;
				local54 = local54 + 1 & 0xFFF;
				Static218.anIntArrayArray41[local74][local96 + 1] = local246;
			}
			if (local74 > 0 && local96 > 0 && Static36.anIntArrayArray11[local74 - 1][local96 - 1] == 0 && (local59[local80 - 1][local85 - 1] & 0x43A40000) == 0 && (local59[local80 - 1][local85] & 0x42240000) == 0 && (local59[local80][local85 - 1] & 0x40A40000) == 0) {
				Static304.anIntArray499[local54] = local7 - 1;
				Static333.anIntArray5[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static36.anIntArrayArray11[local74 - 1][local96 - 1] = 3;
				Static218.anIntArrayArray41[local74 - 1][local96 - 1] = local246;
			}
			if (local74 < 127 && local96 > 0 && Static36.anIntArrayArray11[local74 + 1][local96 - 1] == 0 && (local59[local80 + 1][local85 - 1] & 0x60E40000) == 0 && (local59[local80 + 1][local85] & 0x60240000) == 0 && (local59[local80][local85 - 1] & 0x40A40000) == 0) {
				Static304.anIntArray499[local54] = local7 + 1;
				Static333.anIntArray5[local54] = local9 - 1;
				local54 = local54 + 1 & 0xFFF;
				Static36.anIntArrayArray11[local74 + 1][local96 - 1] = 9;
				Static218.anIntArrayArray41[local74 + 1][local96 - 1] = local246;
			}
			if (local74 > 0 && local96 < 127 && Static36.anIntArrayArray11[local74 - 1][local96 + 1] == 0 && (local59[local80 - 1][local85 + 1] & 0x4E240000) == 0 && (local59[local80 - 1][local85] & 0x42240000) == 0 && (local59[local80][local85 + 1] & 0x48240000) == 0) {
				Static304.anIntArray499[local54] = local7 - 1;
				Static333.anIntArray5[local54] = local9 + 1;
				Static36.anIntArrayArray11[local74 - 1][local96 + 1] = 6;
				local54 = local54 + 1 & 0xFFF;
				Static218.anIntArrayArray41[local74 - 1][local96 + 1] = local246;
			}
			if (local74 < 127 && local96 < 127 && Static36.anIntArrayArray11[local74 + 1][local96 + 1] == 0 && (local59[local80 + 1][local85 + 1] & 0x78240000) == 0 && (local59[local80 + 1][local85] & 0x60240000) == 0 && (local59[local80][local85 + 1] & 0x48240000) == 0) {
				Static304.anIntArray499[local54] = local7 + 1;
				Static333.anIntArray5[local54] = local9 + 1;
				local54 = local54 + 1 & 0xFFF;
				Static36.anIntArrayArray11[local74 + 1][local96 + 1] = 12;
				Static218.anIntArrayArray41[local74 + 1][local96 + 1] = local246;
			}
		}
		Static330.anInt6452 = local9;
		Static295.anInt5963 = local7;
		return false;
	}
}
