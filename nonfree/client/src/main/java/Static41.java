import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!cm", name = "w", descriptor = "Lclient!lm;")
	public static Class134 aClass134_20;

	@OriginalMember(owner = "client!cm", name = "B", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!cm", name = "G", descriptor = "I")
	public static int anInt1122;

	@OriginalMember(owner = "client!cm", name = "K", descriptor = "Lclient!lm;")
	public static Class134 aClass134_21;

	@OriginalMember(owner = "client!cm", name = "Z", descriptor = "F")
	public static float aFloat3;

	@OriginalMember(owner = "client!cm", name = "y", descriptor = "[I")
	public static final int[] anIntArray62 = new int[50];

	@OriginalMember(owner = "client!cm", name = "D", descriptor = "Ljava/lang/String;")
	public static final String aString39 = "slide:";

	@OriginalMember(owner = "client!cm", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString40 = "Attack";

	@OriginalMember(owner = "client!cm", name = "M", descriptor = "I")
	public static int anInt1126 = 0;

	@OriginalMember(owner = "client!cm", name = "S", descriptor = "I")
	public static int anInt1130 = 0;

	@OriginalMember(owner = "client!cm", name = "T", descriptor = "I")
	public static int anInt1131 = 0;

	@OriginalMember(owner = "client!cm", name = "V", descriptor = "I")
	public static int anInt1132 = 0;

	@OriginalMember(owner = "client!cm", name = "b", descriptor = "(III)I")
	public static int method873(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >>> 24;
		@Pc(17) int local17 = 255 - local7;
		@Pc(35) int local35 = (local7 * (arg1 & 0xFF00) & 0xFF0000 | local7 * (arg1 & 0xFF00FF) & 0xFF00FF00) >>> 8;
		return local35 + ((local17 * (arg0 & 0xFF00FF) & 0xFF00FF00 | local17 * (arg0 & 0xFF00) & 0xFF0000) >>> 8);
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(Lclient!k;Lclient!lm;Lclient!lm;Z)V")
	public static void method876(@OriginalArg(0) Interface6 arg0, @OriginalArg(1) Class134 arg1, @OriginalArg(2) Class134 arg2) {
		Static143.anInterface6_1 = arg0;
		Static62.aClass134_148 = arg1;
		Static44.aClass134_24 = arg2;
		if (Static44.aClass134_24 != null) {
			anInt1130 = Static44.aClass134_24.method3020(1);
		}
		if (Static62.aClass134_148 != null) {
			Static85.anInt1642 = Static62.aClass134_148.method3020(1);
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZIIIIIIIIZLclient!nj;)V")
	public static void method881(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) Class1_Sub21 arg10) {
		if (arg0 == 1) {
			arg4 = 1;
		} else if (arg0 == 2) {
			arg4 = 1;
			arg6 = 1;
		} else if (arg0 == 3) {
			arg6 = 1;
		}
		@Pc(45) int local45;
		if (arg2 < 0 || Static43.anInt1151 <= arg2 || arg3 < 0 || arg3 >= Static260.anInt5348) {
			while (true) {
				local45 = arg10.method5720();
				if (local45 == 0) {
					break;
				}
				if (local45 == 1) {
					arg10.method5720();
					break;
				}
				if (local45 <= 49) {
					arg10.method5720();
				}
			}
			return;
		}
		if (!arg9 && !arg1) {
			Static291.aByteArrayArrayArray11[arg8][arg2][arg3] = 0;
		}
		while (true) {
			local45 = arg10.method5720();
			if (local45 == 0) {
				if (arg9) {
					Static276.anIntArrayArrayArray12[0][arg6 + arg2][arg3 + arg4] = Static278.aClass12Array3[0].method2704(arg2 + arg6, arg4 + arg3);
				} else if (arg8 == 0) {
					Static276.anIntArrayArrayArray12[0][arg2 + arg6][arg3 + arg4] = -Static97.method1560(arg5 + 932731, arg7 + 556238) * 8;
				} else {
					Static276.anIntArrayArrayArray12[arg8][arg2 + arg6][arg4 + arg3] = Static276.anIntArrayArrayArray12[arg8 - 1][arg6 + arg2][arg4 + arg3] - 240;
				}
				break;
			}
			if (local45 == 1) {
				@Pc(175) int local175 = arg10.method5720();
				if (arg9) {
					Static276.anIntArrayArrayArray12[0][arg2 + arg6][arg3 + arg4] = Static278.aClass12Array3[0].method2704(arg6 + arg2, arg4 + arg3) + local175 * 8;
				} else {
					if (local175 == 1) {
						local175 = 0;
					}
					if (arg8 == 0) {
						Static276.anIntArrayArrayArray12[0][arg6 + arg2][arg4 + arg3] = -local175 * 8;
					} else {
						Static276.anIntArrayArrayArray12[arg8][arg6 + arg2][arg3 + arg4] = Static276.anIntArrayArrayArray12[arg8 - 1][arg2 + arg6][arg4 + arg3] - local175 * 8;
					}
				}
				break;
			}
			if (local45 <= 49) {
				if (arg1) {
					arg10.method5720();
				} else {
					Static334.aByteArrayArrayArray12[arg8][arg2][arg3] = arg10.method5721();
					Static228.aByteArrayArrayArray7[arg8][arg2][arg3] = (byte) ((local45 - 2) / 4);
					Static100.aByteArrayArrayArray4[arg8][arg2][arg3] = (byte) (local45 + arg0 - 2 & 0x3);
				}
			} else if (local45 <= 81) {
				if (!arg9 && !arg1) {
					Static291.aByteArrayArrayArray11[arg8][arg2][arg3] = (byte) (local45 - 49);
				}
			} else if (!arg1) {
				Static47.aByteArrayArrayArray1[arg8][arg2][arg3] = (byte) (local45 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IB)Z")
	public static boolean method885(@OriginalArg(0) int arg0) {
		if (arg0 == 14 || arg0 == 49 || arg0 == 28 || arg0 == 33 || arg0 == 1006) {
			return true;
		} else {
			return arg0 == 13 || arg0 == 40 || arg0 == 1008;
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IIIIZILjava/lang/String;)V")
	public static void method887(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) String arg5) {
		@Pc(7) Class7_Sub1 local7 = new Class7_Sub1();
		local7.anInt214 = arg4;
		local7.aString9 = arg5;
		local7.anInt217 = arg3 + Static282.anInt3516;
		local7.anInt210 = arg0;
		local7.anInt215 = arg1;
		local7.anInt216 = arg2;
		Static172.aClass122_6.method2624(local7);
	}
}
