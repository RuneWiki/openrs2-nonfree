import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!wc", name = "p", descriptor = "Lclient!pc;")
	public static Class16 aClass16_7;

	@OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
	public static final int[] anIntArray642 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)I")
	public static int method5827(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = arg1 & 0x1 | local7 << 1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIB)V")
	public static void method5828(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub2_Sub6 local13 = Static371.method5808(12, arg0);
		local13.method1778();
		local13.anInt2056 = arg1;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V")
	public static void method5829() {
		if (Static415.aClass39_11 == null) {
			return;
		}
		Static36.aClass141_2.method3358();
		Static266.method5703();
		Static185.method2913();
		Static316.method4484();
		Static118.method2145();
		Static272.method4009();
		if (Static432.aClass171_1 != null) {
			Static432.aClass171_1.method3884();
		}
		Static68.method1381();
		Static67.method1324();
		Static66.method1322();
		Static127.method2242(false);
		Static380.method5143();
		for (@Pc(51) int local51 = 0; local51 < 2048; local51++) {
			@Pc(56) Class31_Sub2_Sub1_Sub1 local56 = Static458.aClass31_Sub2_Sub1_Sub1Array1[local51];
			if (local56 != null) {
				local56.aClass1_Sub28_3 = null;
				for (@Pc(63) int local63 = 0; local63 < local56.aClass105Array3.length; local63++) {
					local56.aClass105Array3[local63] = null;
				}
			}
		}
		for (@Pc(81) int local81 = 0; local81 < Static98.aClass31_Sub2_Sub1_Sub2Array1.length; local81++) {
			@Pc(86) Class31_Sub2_Sub1_Sub2 local86 = Static98.aClass31_Sub2_Sub1_Sub2Array1[local81];
			if (local86 != null) {
				for (@Pc(90) int local90 = 0; local90 < local86.aClass105Array3.length; local90++) {
					local86.aClass105Array3[local90] = null;
				}
			}
		}
		Static115.aClass33_2 = null;
		Static260.aClass33_4 = null;
		Static415.aClass39_11.method4523();
		Static415.aClass39_11 = null;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!pd;IIIIIIIIII)Z")
	public static boolean method5831(@OriginalArg(0) Class188 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(5) int local5 = arg5;
		@Pc(7) int local7 = arg9;
		@Pc(16) int local16 = arg5 - 64;
		Static339.anIntArrayArray56[64][64] = 99;
		@Pc(32) int local32 = arg9 - 64;
		Static204.anIntArrayArray61[64][64] = 0;
		@Pc(40) byte local40 = 0;
		Static286.anIntArray437[0] = arg5;
		@Pc(46) int local46 = 0;
		@Pc(49) int local49 = local40 + 1;
		Static175.anIntArray289[0] = arg9;
		@Pc(54) int[][] local54 = arg0.anIntArrayArray51;
		while (local46 != local49) {
			local5 = Static286.anIntArray437[local46];
			local7 = Static175.anIntArray289[local46];
			local46 = local46 + 1 & 0xFFF;
			@Pc(74) int local74 = local7 - local32;
			@Pc(79) int local79 = local5 - local16;
			@Pc(84) int local84 = local5 - arg0.anInt5211;
			@Pc(90) int local90 = local7 - arg0.anInt5216;
			if (arg3 == -4) {
				if (local5 == arg7 && arg6 == local7) {
					Static82.anInt1809 = local7;
					Static130.anInt2613 = local5;
					return true;
				}
			} else if (arg3 == -3) {
				if (Static205.method3298(local7, 2, arg1, local5, 2, arg4, arg7, arg6)) {
					Static130.anInt2613 = local5;
					Static82.anInt1809 = local7;
					return true;
				}
			} else if (arg3 == -2) {
				if (arg0.method4321(local7, arg4, 2, arg7, arg6, arg1, local5, arg2, 2)) {
					Static130.anInt2613 = local5;
					Static82.anInt1809 = local7;
					return true;
				}
			} else if (arg3 == -1) {
				if (arg0.method4313(local5, arg2, arg4, 2, arg7, arg6, local7, arg1)) {
					Static130.anInt2613 = local5;
					Static82.anInt1809 = local7;
					return true;
				}
			} else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
				if (arg0.method4315(arg8, local5, arg7, 2, arg3, arg6, local7)) {
					Static130.anInt2613 = local5;
					Static82.anInt1809 = local7;
					return true;
				}
			} else if (arg0.method4319(2, local5, local7, arg8, arg7, arg6, arg3)) {
				Static130.anInt2613 = local5;
				Static82.anInt1809 = local7;
				return true;
			}
			@Pc(240) int local240 = Static204.anIntArrayArray61[local79][local74] + 1;
			if (local79 > 0 && Static339.anIntArrayArray56[local79 - 1][local74] == 0 && (local54[local84 - 1][local90] & 0x43A40000) == 0 && (local54[local84 - 1][local90 + 1] & 0x4E240000) == 0) {
				Static286.anIntArray437[local49] = local5 - 1;
				Static175.anIntArray289[local49] = local7;
				Static339.anIntArrayArray56[local79 - 1][local74] = 2;
				local49 = local49 + 1 & 0xFFF;
				Static204.anIntArrayArray61[local79 - 1][local74] = local240;
			}
			if (local79 < 126 && Static339.anIntArrayArray56[local79 + 1][local74] == 0 && (local54[local84 + 2][local90] & 0x60E40000) == 0 && (local54[local84 + 2][local90 + 1] & 0x78240000) == 0) {
				Static286.anIntArray437[local49] = local5 + 1;
				Static175.anIntArray289[local49] = local7;
				Static339.anIntArrayArray56[local79 + 1][local74] = 8;
				local49 = local49 + 1 & 0xFFF;
				Static204.anIntArrayArray61[local79 + 1][local74] = local240;
			}
			if (local74 > 0 && Static339.anIntArrayArray56[local79][local74 - 1] == 0 && (local54[local84][local90 - 1] & 0x43A40000) == 0 && (local54[local84 + 1][local90 - 1] & 0x60E40000) == 0) {
				Static286.anIntArray437[local49] = local5;
				Static175.anIntArray289[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static339.anIntArrayArray56[local79][local74 - 1] = 1;
				Static204.anIntArrayArray61[local79][local74 - 1] = local240;
			}
			if (local74 < 126 && Static339.anIntArrayArray56[local79][local74 + 1] == 0 && (local54[local84][local90 + 2] & 0x4E240000) == 0 && (local54[local84 + 1][local90 + 2] & 0x78240000) == 0) {
				Static286.anIntArray437[local49] = local5;
				Static175.anIntArray289[local49] = local7 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static339.anIntArrayArray56[local79][local74 + 1] = 4;
				Static204.anIntArrayArray61[local79][local74 + 1] = local240;
			}
			if (local79 > 0 && local74 > 0 && Static339.anIntArrayArray56[local79 - 1][local74 - 1] == 0 && (local54[local84 - 1][local90] & 0x4FA40000) == 0 && (local54[local84 - 1][local90 - 1] & 0x43A40000) == 0 && (local54[local84][local90 - 1] & 0x63E40000) == 0) {
				Static286.anIntArray437[local49] = local5 - 1;
				Static175.anIntArray289[local49] = local7 - 1;
				Static339.anIntArrayArray56[local79 - 1][local74 - 1] = 3;
				local49 = local49 + 1 & 0xFFF;
				Static204.anIntArrayArray61[local79 - 1][local74 - 1] = local240;
			}
			if (local79 < 126 && local74 > 0 && Static339.anIntArrayArray56[local79 + 1][local74 - 1] == 0 && (local54[local84 + 1][local90 - 1] & 0x63E40000) == 0 && (local54[local84 + 2][local90 - 1] & 0x60E40000) == 0 && (local54[local84 + 2][local90] & 0x78E40000) == 0) {
				Static286.anIntArray437[local49] = local5 + 1;
				Static175.anIntArray289[local49] = local7 - 1;
				local49 = local49 + 1 & 0xFFF;
				Static339.anIntArrayArray56[local79 + 1][local74 - 1] = 9;
				Static204.anIntArrayArray61[local79 + 1][local74 - 1] = local240;
			}
			if (local79 > 0 && local74 < 126 && Static339.anIntArrayArray56[local79 - 1][local74 + 1] == 0 && (local54[local84 - 1][local90 + 1] & 0x4FA40000) == 0 && (local54[local84 - 1][local90 + 2] & 0x4E240000) == 0 && (local54[local84][local90 + 2] & 0x7E240000) == 0) {
				Static286.anIntArray437[local49] = local5 - 1;
				Static175.anIntArray289[local49] = local7 + 1;
				local49 = local49 + 1 & 0xFFF;
				Static339.anIntArrayArray56[local79 - 1][local74 + 1] = 6;
				Static204.anIntArrayArray61[local79 - 1][local74 + 1] = local240;
			}
			if (local79 < 126 && local74 < 126 && Static339.anIntArrayArray56[local79 + 1][local74 + 1] == 0 && (local54[local84 + 1][local90 + 2] & 0x7E240000) == 0 && (local54[local84 + 2][local90 + 2] & 0x78240000) == 0 && (local54[local84 + 2][local90 + 1] & 0x78E40000) == 0) {
				Static286.anIntArray437[local49] = local5 + 1;
				Static175.anIntArray289[local49] = local7 + 1;
				Static339.anIntArrayArray56[local79 + 1][local74 + 1] = 12;
				local49 = local49 + 1 & 0xFFF;
				Static204.anIntArrayArray61[local79 + 1][local74 + 1] = local240;
			}
		}
		Static82.anInt1809 = local7;
		Static130.anInt2613 = local5;
		return false;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BI)I")
	public static int method5832(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
