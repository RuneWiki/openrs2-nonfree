import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
	public static int anInt1642;

	@OriginalMember(owner = "client!eg", name = "y", descriptor = "[Lclient!ae;")
	public static Class4[] aClass4Array3;

	@OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
	public static int anInt1650;

	@OriginalMember(owner = "client!eg", name = "x", descriptor = "Lclient!vq;")
	public static final Class217 aClass217_59 = new Class217(94, 8);

	@OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
	public static int anInt1645 = 0;

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIIIIIIIIIIIBI)V")
	public static void method1599(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(13) int arg12) {
		@Pc(15) Class11_Sub2_Sub6 local15;
		@Pc(11) int local11;
		if (arg7 >= 0) {
			local11 = arg7 - 1;
			local15 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local11];
		} else {
			local11 = -arg7 - 1;
			if (Static352.anInt1802 == local11) {
				local15 = Static191.aClass11_Sub2_Sub6_Sub1_4;
			} else {
				local15 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local11];
			}
		}
		if (local15 == null) {
			return;
		}
		@Pc(44) Class71 local44 = Static219.method4081(arg3);
		@Pc(57) int local57;
		@Pc(60) int local60;
		if (arg0 == 1 || arg0 == 3) {
			local57 = local44.anInt2376;
			local60 = local44.anInt2411;
		} else {
			local60 = local44.anInt2376;
			local57 = local44.anInt2411;
		}
		@Pc(75) int local75 = arg8 + (local57 >> 1);
		@Pc(83) int local83 = (local57 + 1 >> 1) + arg8;
		@Pc(89) int local89 = (local60 >> 1) + arg10;
		@Pc(97) int local97 = (local60 + 1 >> 1) + arg10;
		@Pc(101) Class36 local101 = Static258.aClass36Array2[arg2];
		@Pc(126) int local126 = local101.method4431(local75, local89) + local101.method4431(local83, local89) + local101.method4431(local75, local97) + local101.method4431(local83, local97) >> 2;
		@Pc(134) Class1_Sub41 local134 = new Class1_Sub41();
		local134.anInt6215 = arg5;
		local134.anInt6214 = arg11 + Static51.anInt1301;
		local134.anInt6226 = Static51.anInt1301 + arg4;
		local134.anInt6233 = arg10;
		local134.anInt6232 = arg0;
		local134.anInt6223 = arg3;
		local134.anInt6227 = arg8;
		local134.anInt6231 = local15.aByte79;
		@Pc(173) int local173;
		if (arg1 > arg6) {
			local173 = arg1;
			arg1 = arg6;
			arg6 = local173;
		}
		if (arg12 > arg9) {
			local173 = arg12;
			arg12 = arg9;
			arg9 = local173;
		}
		local134.anInt6217 = arg8 + arg6;
		local134.anInt6228 = arg1 + arg8;
		local134.anInt6210 = local60 * 64 + local134.anInt6233 * 128;
		local134.anInt6211 = local126;
		local134.anInt6230 = local134.anInt6227 * 128 + local57 * 64;
		local134.anInt6216 = arg9 + arg10;
		local134.anInt6221 = arg12 + arg10;
		Static117.aClass42_14.method1549(local134);
		local15.aClass1_Sub41_3 = local134;
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lclient!at;I)Lclient!ch;")
	public static Class25_Sub1 method1600(@OriginalArg(0) Class1_Sub7 arg0) {
		return new Class25_Sub1(arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2141(), arg0.method2119(), arg0.method2119(), arg0.method2132());
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZIIIII)V")
	public static void method1601(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(5) int local5 = arg3; local5 <= arg0; local5++) {
			Static367.method6081(arg2, arg1, Static43.anIntArrayArray57[local5], arg4);
		}
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method1603(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!eg", name = "a", descriptor = "(IIZIZIBLclient!at;IIII)V")
	public static void method1604(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class1_Sub7 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		if (arg5 == 1) {
			arg9 = 1;
		} else if (arg5 == 2) {
			arg1 = 1;
			arg9 = 1;
		} else if (arg5 == 3) {
			arg1 = 1;
		}
		@Pc(54) int local54;
		if (arg8 < 0 || Static311.anInt5653 <= arg8 || arg0 < 0 || arg0 >= Static189.anInt3820) {
			while (true) {
				local54 = arg6.method2132();
				if (local54 == 0) {
					return;
				}
				if (local54 == 1) {
					arg6.method2132();
					return;
				}
				if (local54 <= 49) {
					arg6.method2132();
				}
			}
			return;
		}
		if (!arg4 && !arg2) {
			Static264.aByteArrayArrayArray7[arg10][arg8][arg0] = 0;
		}
		while (true) {
			local54 = arg6.method2132();
			if (local54 == 0) {
				if (arg4) {
					Static102.anIntArrayArrayArray134[0][arg8 + arg1][arg9 + arg0] = Static50.aClass36Array3[0].method4431(arg8 + arg1, arg9 + arg0);
					return;
				} else if (arg10 == 0) {
					Static102.anIntArrayArrayArray134[0][arg1 + arg8][arg9 + arg0] = -Static330.method5567(arg3 + 556238, arg7 + 932731) * 8;
					return;
				} else {
					Static102.anIntArrayArrayArray134[arg10][arg8 + arg1][arg0 + arg9] = Static102.anIntArrayArrayArray134[arg10 - 1][arg1 + arg8][arg0 + arg9] - 240;
					return;
				}
			}
			if (local54 == 1) {
				@Pc(186) int local186 = arg6.method2132();
				if (arg4) {
					Static102.anIntArrayArrayArray134[0][arg8 + arg1][arg9 + arg0] = local186 * 8 + Static50.aClass36Array3[0].method4431(arg1 + arg8, arg9 + arg0);
					return;
				}
				if (local186 == 1) {
					local186 = 0;
				}
				if (arg10 == 0) {
					Static102.anIntArrayArrayArray134[0][arg8 + arg1][arg9 + arg0] = -local186 * 8;
					return;
				}
				Static102.anIntArrayArrayArray134[arg10][arg1 + arg8][arg9 + arg0] = Static102.anIntArrayArrayArray134[arg10 - 1][arg1 + arg8][arg9 + arg0] - local186 * 8;
				return;
			}
			if (local54 <= 49) {
				if (arg2) {
					arg6.method2132();
				} else {
					Static341.aByteArrayArrayArray11[arg10][arg8][arg0] = arg6.method2122();
					Static35.aByteArrayArrayArray1[arg10][arg8][arg0] = (byte) ((local54 - 2) / 4);
					Static192.aByteArrayArrayArray5[arg10][arg8][arg0] = (byte) (local54 + arg5 - 2 & 0x3);
				}
			} else if (local54 <= 81) {
				if (!arg4 && !arg2) {
					Static264.aByteArrayArrayArray7[arg10][arg8][arg0] = (byte) (local54 - 49);
				}
			} else if (!arg2) {
				Static310.aByteArrayArrayArray8[arg10][arg8][arg0] = (byte) (local54 - 81);
			}
		}
	}
}
