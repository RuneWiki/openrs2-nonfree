import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILclient!qf;IJIIII)Z")
	public static boolean method1204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) long arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		return arg4 == null ? true : Static144.method4032(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(BIZIIIIIIZLclient!ug;I)V")
	public static void method1205(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) boolean arg8, @OriginalArg(10) Class3_Sub26 arg9, @OriginalArg(11) int arg10) {
		@Pc(23) int local23;
		if (arg5 < 0 || arg5 >= 104 || arg2 < 0 || arg2 >= 104) {
			while (true) {
				local23 = arg9.method3915();
				if (local23 == 0) {
					break;
				}
				if (local23 == 1) {
					arg9.method3915();
					break;
				}
				if (local23 <= 49) {
					arg9.method3915();
				}
			}
			return;
		}
		if (!arg8 && !arg1) {
			Static41.aByteArrayArrayArray2[arg7][arg5][arg2] = 0;
		}
		while (true) {
			local23 = arg9.method3915();
			if (local23 == 0) {
				if (arg8) {
					Static256.anIntArrayArrayArray14[0][arg4 + arg5][arg2 + arg3] = Static258.anIntArrayArrayArray15[0][arg4 + arg5][arg2 + arg3];
				} else if (arg7 == 0) {
					Static256.anIntArrayArrayArray14[0][arg5 + arg4][arg2 + arg3] = -Static47.method4896(arg6 + 932731, arg10 + 556238) * 8;
				} else {
					Static256.anIntArrayArrayArray14[arg7][arg4 + arg5][arg3 + arg2] = Static256.anIntArrayArrayArray14[arg7 - 1][arg4 + arg5][arg2 + arg3] - 240;
				}
				break;
			}
			if (local23 == 1) {
				@Pc(164) int local164 = arg9.method3915();
				if (arg8) {
					Static256.anIntArrayArrayArray14[0][arg4 + arg5][arg3 + arg2] = Static258.anIntArrayArrayArray15[0][arg4 + arg5][arg2 + arg3] + local164 * 8;
				} else {
					if (local164 == 1) {
						local164 = 0;
					}
					if (arg7 == 0) {
						Static256.anIntArrayArrayArray14[0][arg4 + arg5][arg3 + arg2] = -local164 * 8;
					} else {
						Static256.anIntArrayArrayArray14[arg7][arg5 + arg4][arg2 + arg3] = Static256.anIntArrayArrayArray14[arg7 - 1][arg4 + arg5][arg3 + arg2] - local164 * 8;
					}
				}
				break;
			}
			if (local23 <= 49) {
				if (arg1) {
					arg9.method3915();
				} else {
					Static86.aByteArrayArrayArray14[arg7][arg5][arg2] = arg9.method3920();
					Static220.aByteArrayArrayArray19[arg7][arg5][arg2] = (byte) ((local23 - 2) / 4);
					Static310.aByteArrayArrayArray20[arg7][arg5][arg2] = (byte) (local23 + arg0 - 2 & 0x3);
				}
			} else if (local23 > 81) {
				if (!arg1) {
					Static5.aByteArrayArrayArray1[arg7][arg5][arg2] = (byte) (local23 - 81);
				}
			} else if (!arg8 && !arg1) {
				Static41.aByteArrayArrayArray2[arg7][arg5][arg2] = (byte) (local23 - 49);
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
	public static void method1207() {
		if (Static275.aString211.toLowerCase().indexOf("microsoft") != -1) {
			Static307.anIntArray621[221] = 43;
			Static307.anIntArray621[222] = 59;
			Static307.anIntArray621[190] = 72;
			Static307.anIntArray621[192] = 58;
			Static307.anIntArray621[223] = 28;
			Static307.anIntArray621[220] = 74;
			Static307.anIntArray621[189] = 26;
			Static307.anIntArray621[191] = 73;
			Static307.anIntArray621[187] = 27;
			Static307.anIntArray621[219] = 42;
			Static307.anIntArray621[188] = 71;
			Static307.anIntArray621[186] = 57;
			return;
		}
		Static307.anIntArray621[92] = 74;
		Static307.anIntArray621[59] = 57;
		Static307.anIntArray621[61] = 27;
		Static307.anIntArray621[91] = 42;
		Static307.anIntArray621[46] = 72;
		Static307.anIntArray621[93] = 43;
		if (Static275.aMethod2 == null) {
			Static307.anIntArray621[222] = 59;
			Static307.anIntArray621[192] = 58;
		} else {
			Static307.anIntArray621[192] = 28;
			Static307.anIntArray621[520] = 59;
			Static307.anIntArray621[222] = 58;
		}
		Static307.anIntArray621[47] = 73;
		Static307.anIntArray621[44] = 71;
		Static307.anIntArray621[45] = 26;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIILclient!qf;JZ)V")
	public static void method1208(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class10 arg4, @OriginalArg(5) long arg5, @OriginalArg(6) boolean arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class13 local6 = new Class13();
		local6.aClass10_1 = arg4;
		local6.anInt346 = arg1 * 128 + 64;
		local6.anInt345 = arg2 * 128 + 64;
		local6.anInt342 = arg3;
		local6.aLong15 = arg5;
		local6.aBoolean32 = arg6;
		if (Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2] == null) {
			Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2] = new Class3_Sub25(arg0, arg1, arg2);
		}
		Static146.aClass3_Sub25ArrayArrayArray7[arg0][arg1][arg2].aClass13_1 = local6;
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
	public static void method1209() {
		Static20.aClass98_3.method2572();
	}
}
