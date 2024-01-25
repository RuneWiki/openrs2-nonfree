import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static43 {

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "[Lclient!lf;")
	public static Class90[] aClass90Array8;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard3;

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray24 = new String[100];

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
	public static int anInt2906 = -1;

	@OriginalMember(owner = "client!ci", name = "f", descriptor = "[I")
	public static final int[] anIntArray338 = new int[5];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IILclient!ie;IIIIIIBI)Z")
	public static boolean method2801(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class91 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		@Pc(12) int local12 = arg8;
		@Pc(14) int local14 = arg7;
		@Pc(22) int local22 = arg8 - 64;
		Static259.anIntArrayArray52[64][64] = 99;
		@Pc(33) int local33 = arg7 - 64;
		Static162.anIntArrayArray29[64][64] = 0;
		@Pc(41) byte local41 = 0;
		Static10.anIntArray30[0] = arg8;
		@Pc(47) int local47 = 0;
		@Pc(50) int local50 = local41 + 1;
		Static54.anIntArray415[0] = arg7;
		@Pc(55) int[][] local55 = arg2.anIntArrayArray27;
		while (local50 != local47) {
			local14 = Static54.anIntArray415[local47];
			local12 = Static10.anIntArray30[local47];
			@Pc(69) int local69 = local14 - local33;
			local47 = local47 + 1 & 0xFFF;
			@Pc(80) int local80 = local12 - local22;
			@Pc(86) int local86 = local12 - arg2.anInt2692;
			@Pc(92) int local92 = local14 - arg2.anInt2685;
			if (arg1 == -4) {
				if (local12 == arg9 && arg6 == local14) {
					Static4.anInt86 = local12;
					Static115.anInt2302 = local14;
					return true;
				}
			} else if (arg1 == -3) {
				if (Static69.method1393(arg0, local12, arg6, 2, arg4, arg9, local14, 2)) {
					Static4.anInt86 = local12;
					Static115.anInt2302 = local14;
					return true;
				}
			} else if (arg1 == -2) {
				if (arg2.method2596(local12, arg9, 2, arg4, local14, 2, arg3, arg0, arg6)) {
					Static115.anInt2302 = local14;
					Static4.anInt86 = local12;
					return true;
				}
			} else if (arg1 == -1) {
				if (arg2.method2595(local12, arg4, local14, arg0, arg3, 2, arg9, arg6)) {
					Static4.anInt86 = local12;
					Static115.anInt2302 = local14;
					return true;
				}
			} else if (arg1 == 0 || arg1 == 1 || arg1 == 2 || arg1 == 3 || arg1 == 9) {
				if (arg2.method2607(local14, arg1, arg6, local12, arg5, 2, arg9)) {
					Static4.anInt86 = local12;
					Static115.anInt2302 = local14;
					return true;
				}
			} else if (arg2.method2604(2, local14, arg1, arg9, arg6, arg5, local12)) {
				Static4.anInt86 = local12;
				Static115.anInt2302 = local14;
				return true;
			}
			@Pc(249) int local249 = Static162.anIntArrayArray29[local80][local69] + 1;
			if (local80 > 0 && Static259.anIntArrayArray52[local80 - 1][local69] == 0 && (local55[local86 - 1][local92] & 0x43A40000) == 0 && (local55[local86 - 1][local92 + 1] & 0x4E240000) == 0) {
				Static10.anIntArray30[local50] = local12 - 1;
				Static54.anIntArray415[local50] = local14;
				local50 = local50 + 1 & 0xFFF;
				Static259.anIntArrayArray52[local80 - 1][local69] = 2;
				Static162.anIntArrayArray29[local80 - 1][local69] = local249;
			}
			if (local80 < 126 && Static259.anIntArrayArray52[local80 + 1][local69] == 0 && (local55[local86 + 2][local92] & 0x60E40000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78240000) == 0) {
				Static10.anIntArray30[local50] = local12 + 1;
				Static54.anIntArray415[local50] = local14;
				local50 = local50 + 1 & 0xFFF;
				Static259.anIntArrayArray52[local80 + 1][local69] = 8;
				Static162.anIntArrayArray29[local80 + 1][local69] = local249;
			}
			if (local69 > 0 && Static259.anIntArrayArray52[local80][local69 - 1] == 0 && (local55[local86][local92 - 1] & 0x43A40000) == 0 && (local55[local86 + 1][local92 - 1] & 0x60E40000) == 0) {
				Static10.anIntArray30[local50] = local12;
				Static54.anIntArray415[local50] = local14 - 1;
				Static259.anIntArrayArray52[local80][local69 - 1] = 1;
				local50 = local50 + 1 & 0xFFF;
				Static162.anIntArrayArray29[local80][local69 - 1] = local249;
			}
			if (local69 < 126 && Static259.anIntArrayArray52[local80][local69 + 1] == 0 && (local55[local86][local92 + 2] & 0x4E240000) == 0 && (local55[local86 + 1][local92 + 2] & 0x78240000) == 0) {
				Static10.anIntArray30[local50] = local12;
				Static54.anIntArray415[local50] = local14 + 1;
				Static259.anIntArrayArray52[local80][local69 + 1] = 4;
				local50 = local50 + 1 & 0xFFF;
				Static162.anIntArrayArray29[local80][local69 + 1] = local249;
			}
			if (local80 > 0 && local69 > 0 && Static259.anIntArrayArray52[local80 - 1][local69 - 1] == 0 && (local55[local86 - 1][local92] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 - 1] & 0x43A40000) == 0 && (local55[local86][local92 - 1] & 0x63E40000) == 0) {
				Static10.anIntArray30[local50] = local12 - 1;
				Static54.anIntArray415[local50] = local14 - 1;
				Static259.anIntArrayArray52[local80 - 1][local69 - 1] = 3;
				local50 = local50 + 1 & 0xFFF;
				Static162.anIntArrayArray29[local80 - 1][local69 - 1] = local249;
			}
			if (local80 < 126 && local69 > 0 && Static259.anIntArrayArray52[local80 + 1][local69 - 1] == 0 && (local55[local86 + 1][local92 - 1] & 0x63E40000) == 0 && (local55[local86 + 2][local92 - 1] & 0x60E40000) == 0 && (local55[local86 + 2][local92] & 0x78E40000) == 0) {
				Static10.anIntArray30[local50] = local12 + 1;
				Static54.anIntArray415[local50] = local14 - 1;
				Static259.anIntArrayArray52[local80 + 1][local69 - 1] = 9;
				local50 = local50 + 1 & 0xFFF;
				Static162.anIntArrayArray29[local80 + 1][local69 - 1] = local249;
			}
			if (local80 > 0 && local69 < 126 && Static259.anIntArrayArray52[local80 - 1][local69 + 1] == 0 && (local55[local86 - 1][local92 + 1] & 0x4FA40000) == 0 && (local55[local86 - 1][local92 + 2] & 0x4E240000) == 0 && (local55[local86][local92 + 2] & 0x7E240000) == 0) {
				Static10.anIntArray30[local50] = local12 - 1;
				Static54.anIntArray415[local50] = local14 + 1;
				local50 = local50 + 1 & 0xFFF;
				Static259.anIntArrayArray52[local80 - 1][local69 + 1] = 6;
				Static162.anIntArrayArray29[local80 - 1][local69 + 1] = local249;
			}
			if (local80 < 126 && local69 < 126 && Static259.anIntArrayArray52[local80 + 1][local69 + 1] == 0 && (local55[local86 + 1][local92 + 2] & 0x7E240000) == 0 && (local55[local86 + 2][local92 + 2] & 0x78240000) == 0 && (local55[local86 + 2][local92 + 1] & 0x78E40000) == 0) {
				Static10.anIntArray30[local50] = local12 + 1;
				Static54.anIntArray415[local50] = local14 + 1;
				Static259.anIntArrayArray52[local80 + 1][local69 + 1] = 12;
				local50 = local50 + 1 & 0xFFF;
				Static162.anIntArrayArray29[local80 + 1][local69 + 1] = local249;
			}
		}
		Static115.anInt2302 = local14;
		Static4.anInt86 = local12;
		return false;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIZIII)V")
	public static void method2804(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = arg3; local3 < arg2 + arg3; local3++) {
			for (local7 = arg0; local7 < arg0 + arg1; local7++) {
				if (local7 >= 0 && local7 < Static48.anInt1107 && local3 >= 0 && local3 < Static337.anInt6402) {
					Static213.anIntArrayArrayArray10[arg4][local7][local3] = arg4 > 0 ? Static213.anIntArrayArrayArray10[arg4 - 1][local7][local3] - 240 : 0;
				}
			}
		}
		if (arg0 > 0 && arg0 < Static48.anInt1107) {
			for (local7 = arg3 + 1; local7 < arg3 + arg2; local7++) {
				if (local7 >= 0 && local7 < Static337.anInt6402) {
					Static213.anIntArrayArrayArray10[arg4][arg0][local7] = Static213.anIntArrayArrayArray10[arg4][arg0 - 1][local7];
				}
			}
		}
		if (arg3 > 0 && arg3 < Static337.anInt6402) {
			for (local7 = arg0 + 1; local7 < arg0 + arg1; local7++) {
				if (local7 >= 0 && local7 < Static48.anInt1107) {
					Static213.anIntArrayArrayArray10[arg4][local7][arg3] = Static213.anIntArrayArrayArray10[arg4][local7][arg3 - 1];
				}
			}
		}
		if (arg0 < 0 || arg3 < 0 || Static48.anInt1107 <= arg0 || Static337.anInt6402 <= arg3) {
			return;
		}
		if (arg4 == 0) {
			if (arg0 > 0 && Static213.anIntArrayArrayArray10[arg4][arg0 - 1][arg3] != 0) {
				Static213.anIntArrayArrayArray10[arg4][arg0][arg3] = Static213.anIntArrayArrayArray10[arg4][arg0 - 1][arg3];
			} else if (arg3 > 0 && Static213.anIntArrayArrayArray10[arg4][arg0][arg3 - 1] != 0) {
				Static213.anIntArrayArrayArray10[arg4][arg0][arg3] = Static213.anIntArrayArrayArray10[arg4][arg0][arg3 - 1];
			} else if (arg0 > 0 && arg3 > 0 && Static213.anIntArrayArrayArray10[arg4][arg0 - 1][arg3 - 1] != 0) {
				Static213.anIntArrayArrayArray10[arg4][arg0][arg3] = Static213.anIntArrayArrayArray10[arg4][arg0 - 1][arg3 - 1];
			}
		} else if (arg0 > 0 && Static213.anIntArrayArrayArray10[arg4 - 1][arg0 - 1][arg3] != Static213.anIntArrayArrayArray10[arg4][arg0 - 1][arg3]) {
			Static213.anIntArrayArrayArray10[arg4][arg0][arg3] = Static213.anIntArrayArrayArray10[arg4][arg0 - 1][arg3];
		} else if (arg3 > 0 && Static213.anIntArrayArrayArray10[arg4][arg0][arg3 - 1] != Static213.anIntArrayArrayArray10[arg4 - 1][arg0][arg3 - 1]) {
			Static213.anIntArrayArrayArray10[arg4][arg0][arg3] = Static213.anIntArrayArrayArray10[arg4][arg0][arg3 - 1];
		} else if (arg0 > 0 && arg3 > 0 && Static213.anIntArrayArrayArray10[arg4][arg0 - 1][arg3 - 1] != Static213.anIntArrayArrayArray10[arg4 - 1][arg0 - 1][arg3 - 1]) {
			Static213.anIntArrayArrayArray10[arg4][arg0][arg3] = Static213.anIntArrayArrayArray10[arg4][arg0 - 1][arg3 - 1];
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IJ)Ljava/lang/String;")
	public static String method2806(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(27) int local27 = 0;
			for (@Pc(29) long local29 = arg0; local29 != 0L; local29 /= 37L) {
				local27++;
			}
			@Pc(45) StringBuffer local45 = new StringBuffer(local27);
			while (arg0 != 0L) {
				@Pc(49) long local49 = arg0;
				arg0 /= 37L;
				local45.append(Static258.aCharArray4[(int) (local49 - arg0 * 37L)]);
			}
			return local45.reverse().toString();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IZ)V")
	public static void method2808(@OriginalArg(0) int arg0) {
		@Pc(13) Class1_Sub1_Sub2 local13 = Static42.method1000(7, arg0);
		local13.method167();
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "([III[[B[[B[I[BI)I")
	public static int method2811(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[][] arg2, @OriginalArg(4) byte[][] arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg0[arg6];
		@Pc(16) int local16 = local9 + arg4[arg6];
		@Pc(20) int local20 = arg0[arg1];
		@Pc(34) int local34 = arg4[arg1] + local20;
		@Pc(36) int local36 = local9;
		if (local9 < local20) {
			local36 = local20;
		}
		@Pc(43) int local43 = local16;
		if (local16 > local34) {
			local43 = local34;
		}
		@Pc(54) int local54 = arg5[arg6] & 0xFF;
		if ((arg5[arg1] & 0xFF) < local54) {
			local54 = arg5[arg1] & 0xFF;
		}
		@Pc(71) byte[] local71 = arg3[arg6];
		@Pc(75) byte[] local75 = arg2[arg1];
		@Pc(80) int local80 = local36 - local9;
		@Pc(85) int local85 = local36 - local20;
		for (@Pc(87) int local87 = local36; local87 < local43; local87++) {
			@Pc(100) int local100 = local71[local80++] + local75[local85++];
			if (local54 > local100) {
				local54 = local100;
			}
		}
		return -local54;
	}
}
