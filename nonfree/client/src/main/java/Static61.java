import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
	public static int anInt1166;

	@OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
	public static int anInt1170;

	@OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
	public static int anInt1171;

	@OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
	public static int anInt1168 = -1;

	@OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
	public static int anInt1169 = -1;

	@OriginalMember(owner = "client!ee", name = "s", descriptor = "Ljava/lang/String;")
	public static String aString75 = "shake:";

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZILclient!lf;IIZIIIII)V")
	public static void method1109(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub14 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(38) int local38;
		if (arg9 < 0 || arg9 >= 104 || arg7 < 0 || arg7 >= 104) {
			while (true) {
				local38 = arg3.method1378();
				if (local38 == 0) {
					break;
				}
				if (local38 == 1) {
					arg3.method1378();
					break;
				}
				if (local38 <= 49) {
					arg3.method1378();
				}
			}
			return;
		}
		if (!arg1 && !arg6) {
			Static104.aByteArrayArrayArray3[arg10][arg9][arg7] = 0;
		}
		while (true) {
			local38 = arg3.method1378();
			if (local38 == 0) {
				if (arg1) {
					Static24.anIntArrayArrayArray2[0][arg9 + arg5][arg7 + arg0] = Static95.anIntArrayArrayArray5[0][arg9 + arg5][arg0 + arg7];
				} else if (arg10 == 0) {
					Static24.anIntArrayArrayArray2[0][arg9 + arg5][arg0 + arg7] = -Static312.method4786(arg2 + 556238, 932731 - -arg8) * 8;
				} else {
					Static24.anIntArrayArrayArray2[arg10][arg9 + arg5][arg0 + arg7] = Static24.anIntArrayArrayArray2[arg10 - 1][arg9 + arg5][arg0 + arg7] - 240;
				}
				break;
			}
			if (local38 == 1) {
				@Pc(139) int local139 = arg3.method1378();
				if (arg1) {
					Static24.anIntArrayArrayArray2[0][arg5 + arg9][arg0 + arg7] = local139 * 8 + Static95.anIntArrayArrayArray5[0][arg9 + arg5][arg0 + arg7];
				} else {
					if (local139 == 1) {
						local139 = 0;
					}
					if (arg10 == 0) {
						Static24.anIntArrayArrayArray2[0][arg9 + arg5][arg7 + arg0] = -local139 * 8;
					} else {
						Static24.anIntArrayArrayArray2[arg10][arg5 + arg9][arg7 + arg0] = Static24.anIntArrayArrayArray2[arg10 - 1][arg9 + arg5][arg7 + arg0] - local139 * 8;
					}
				}
				break;
			}
			if (local38 <= 49) {
				if (arg6) {
					arg3.method1378();
				} else {
					Static250.aByteArrayArrayArray19[arg10][arg9][arg7] = arg3.method1363();
					Static132.aByteArrayArrayArray12[arg10][arg9][arg7] = (byte) ((local38 - 2) / 4);
					Static91.aByteArrayArrayArray2[arg10][arg9][arg7] = (byte) (local38 + arg4 - 2 & 0x3);
				}
			} else if (local38 <= 81) {
				if (!arg1 && !arg6) {
					Static104.aByteArrayArrayArray3[arg10][arg9][arg7] = (byte) (local38 - 49);
				}
			} else if (!arg6) {
				Static244.aByteArrayArrayArray18[arg10][arg9][arg7] = (byte) (local38 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 == arg6) {
			Static60.method1102(arg0, arg3, arg1, arg6, arg2, arg4);
		} else if (arg4 - arg6 >= Static29.anInt517 && Static11.anInt170 >= arg6 + arg4 && Static98.anInt2007 <= arg3 - arg5 && Static213.anInt4452 >= arg3 + arg5) {
			Static135.method2342(arg1, arg4, arg2, arg3, arg5, arg6, arg0);
		} else {
			Static21.method362(arg3, arg5, arg2, arg4, arg0, arg6, arg1);
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!qm;Lclient!qm;)V")
	public static void method1111(@OriginalArg(1) Class1_Sub2 arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		if (arg0.aClass1_Sub2_74 != null) {
			arg0.method4493();
		}
		arg0.aClass1_Sub2_75 = arg1.aClass1_Sub2_75;
		arg0.aClass1_Sub2_74 = arg1;
		arg0.aClass1_Sub2_74.aClass1_Sub2_75 = arg0;
		arg0.aClass1_Sub2_75.aClass1_Sub2_74 = arg0;
	}
}
