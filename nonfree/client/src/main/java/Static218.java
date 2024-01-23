import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static218 {

	@OriginalMember(owner = "client!pj", name = "d", descriptor = "F")
	public static float aFloat44;

	@OriginalMember(owner = "client!pj", name = "j", descriptor = "Lclient!ek;")
	public static Class42 aClass42_68;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "[I")
	public static int[] anIntArray444 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!pj", name = "e", descriptor = "Z")
	public static volatile boolean aBoolean298 = true;

	@OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
	public static int anInt4450 = 0;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
	public static int anInt4451 = 0;

	@OriginalMember(owner = "client!pj", name = "i", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIII)V")
	public static void method3616(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static166.anInt3675 || Static148.anInt3245 > arg1) {
			return;
		}
		@Pc(27) boolean local27;
		if (arg2 < Static53.anInt1319) {
			local27 = false;
			arg2 = Static53.anInt1319;
		} else if (arg2 <= Static81.anInt1915) {
			local27 = true;
		} else {
			arg2 = Static81.anInt1915;
			local27 = false;
		}
		@Pc(50) boolean local50;
		if (arg0 < Static53.anInt1319) {
			arg0 = Static53.anInt1319;
			local50 = false;
		} else if (arg0 > Static81.anInt1915) {
			local50 = false;
			arg0 = Static81.anInt1915;
		} else {
			local50 = true;
		}
		if (arg4 >= Static148.anInt3245) {
			Static25.method486(Static275.anIntArrayArray37[arg4++], arg2, arg0, arg3);
		} else {
			arg4 = Static148.anInt3245;
		}
		if (arg1 > Static166.anInt3675) {
			arg1 = Static166.anInt3675;
		} else {
			Static25.method486(Static275.anIntArrayArray37[arg1--], arg2, arg0, arg3);
		}
		@Pc(109) int local109;
		if (local27 && local50) {
			for (local109 = arg4; local109 <= arg1; local109++) {
				@Pc(120) int[] local120 = Static275.anIntArrayArray37[local109];
				local120[arg2] = local120[arg0] = arg3;
			}
		} else if (local27) {
			for (local109 = arg4; local109 <= arg1; local109++) {
				Static275.anIntArrayArray37[local109][arg2] = arg3;
			}
		} else if (local50) {
			for (local109 = arg4; local109 <= arg1; local109++) {
				Static275.anIntArrayArray37[local109][arg0] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "([[I[[FZFII[[FIBI[[IIIIILclient!wl;I[[F)I")
	public static int method3617(@OriginalArg(0) int[][] arg0, @OriginalArg(1) float[][] arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) float[][] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[][] arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) Class2_Sub32 arg14, @OriginalArg(16) int arg15, @OriginalArg(17) float[][] arg16) {
		@Pc(8) int local8;
		if (arg11 == 1) {
			local8 = arg13;
			arg13 = arg5;
			arg5 = 128 - local8;
		} else if (arg11 == 2) {
			arg5 = 128 - arg5;
			arg13 = 128 - arg13;
		} else if (arg11 == 3) {
			local8 = arg13;
			arg13 = 128 - arg5;
			arg5 = local8;
		}
		@Pc(73) float local73;
		@Pc(67) float local67;
		@Pc(61) int local61;
		@Pc(79) float local79;
		if (arg13 == 0 && arg5 == 0) {
			local61 = arg4;
			local67 = arg6[arg7][arg12];
			local73 = arg1[arg7][arg12];
			local79 = arg16[arg7][arg12];
		} else if (arg13 == 128 && arg5 == 0) {
			local79 = arg16[arg7 + 1][arg12];
			local61 = arg10;
			local67 = arg6[arg7 + 1][arg12];
			local73 = arg1[arg7 + 1][arg12];
		} else if (arg13 == 128 && arg5 == 128) {
			local79 = arg16[arg7 + 1][arg12 + 1];
			local67 = arg6[arg7 + 1][arg12 + 1];
			local73 = arg1[arg7 + 1][arg12 + 1];
			local61 = arg8;
		} else if (arg13 == 0 && arg5 == 128) {
			local79 = arg16[arg7][arg12 + 1];
			local73 = arg1[arg7][arg12 + 1];
			local67 = arg6[arg7][arg12 + 1];
			local61 = arg15;
		} else {
			local67 = arg6[arg7][arg12];
			local79 = arg16[arg7][arg12];
			local73 = arg1[arg7][arg12];
			@Pc(157) float local157 = (float) arg13 / 128.0F;
			@Pc(172) float local172 = local73 + local157 * (arg1[arg7 + 1][arg12] - local73);
			@Pc(187) float local187 = local79 + local157 * (arg16[arg7 + 1][arg12] - local79);
			@Pc(201) float local201 = local67 + (arg6[arg7 + 1][arg12] - local67) * local157;
			@Pc(206) float local206 = (float) arg5 / 128.0F;
			@Pc(214) float local214 = arg6[arg7][arg12 + 1];
			@Pc(222) float local222 = arg16[arg7][arg12 + 1];
			@Pc(230) float local230 = arg1[arg7][arg12 + 1];
			@Pc(246) float local246 = local214 + (arg6[arg7 + 1][arg12 + 1] - local214) * local157;
			local67 = local201 + local206 * (local246 - local201);
			@Pc(271) float local271 = local230 + local157 * (arg1[arg7 + 1][arg12 + 1] - local230);
			local73 = local172 + local206 * (local271 - local172);
			@Pc(296) float local296 = local222 + local157 * (arg16[arg7 + 1][arg12 + 1] - local222);
			local79 = local187 + local206 * (local296 - local187);
			@Pc(310) int local310 = Static155.method2846(arg4, arg13, arg10);
			@Pc(316) int local316 = Static155.method2846(arg15, arg13, arg8);
			local61 = Static155.method2846(local310, arg5, local316);
		}
		@Pc(395) int local395 = (arg7 << 7) + arg13;
		@Pc(403) int local403 = Static128.method2318(arg7, arg13, arg12, arg9, arg5);
		@Pc(409) int local409 = (arg12 << 7) + arg5;
		return arg14.method4752(local395, local403, local409, local79, local73, local67, arg2 ? local61 & 0xFFFFFF00 : local61, arg0 == null ? 0.0F : (float) (local403 - Static128.method2318(arg7, arg13, arg12, arg0, arg5)) / arg3);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIZZILclient!oe;IIIIII)V")
	public static void method3618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class2_Sub16 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(21) int local21;
		if (arg0 < 0 || arg0 >= 104 || arg1 < 0 || arg1 >= 104) {
			while (true) {
				local21 = arg5.method2146();
				if (local21 == 0) {
					break;
				}
				if (local21 == 1) {
					arg5.method2146();
					break;
				}
				if (local21 <= 49) {
					arg5.method2146();
				}
			}
			return;
		}
		if (!arg3 && !arg2) {
			Static13.aByteArrayArrayArray2[arg4][arg0][arg1] = 0;
		}
		while (true) {
			local21 = arg5.method2146();
			if (local21 == 0) {
				if (arg3) {
					Static9.anIntArrayArrayArray7[0][arg6 + arg0][arg1 + arg7] = Static300.anIntArrayArrayArray15[0][arg6 + arg0][arg7 + arg1];
				} else if (arg4 == 0) {
					Static9.anIntArrayArrayArray7[0][arg6 + arg0][arg1 + arg7] = -Static296.method4529(arg10 + 556238, arg8 + 932731) * 8;
				} else {
					Static9.anIntArrayArrayArray7[arg4][arg0 + arg6][arg7 + arg1] = Static9.anIntArrayArrayArray7[arg4 - 1][arg6 + arg0][arg7 + arg1] - 240;
				}
				break;
			}
			if (local21 == 1) {
				@Pc(162) int local162 = arg5.method2146();
				if (arg3) {
					Static9.anIntArrayArrayArray7[0][arg6 + arg0][arg7 + arg1] = local162 * 8 + Static300.anIntArrayArrayArray15[0][arg0 + arg6][arg1 + arg7];
				} else {
					if (local162 == 1) {
						local162 = 0;
					}
					if (arg4 == 0) {
						Static9.anIntArrayArrayArray7[0][arg6 + arg0][arg7 + arg1] = -local162 * 8;
					} else {
						Static9.anIntArrayArrayArray7[arg4][arg6 + arg0][arg7 + arg1] = Static9.anIntArrayArrayArray7[arg4 - 1][arg0 + arg6][arg1 + arg7] - local162 * 8;
					}
				}
				break;
			}
			if (local21 <= 49) {
				if (arg2) {
					arg5.method2146();
				} else {
					Static83.aByteArrayArrayArray6[arg4][arg0][arg1] = arg5.method2170();
					Static14.aByteArrayArrayArray3[arg4][arg0][arg1] = (byte) ((local21 - 2) / 4);
					Static121.aByteArrayArrayArray7[arg4][arg0][arg1] = (byte) (local21 + arg9 - 2 & 0x3);
				}
			} else if (local21 > 81) {
				if (!arg2) {
					Static10.aByteArrayArrayArray1[arg4][arg0][arg1] = (byte) (local21 - 81);
				}
			} else if (!arg3 && !arg2) {
				Static13.aByteArrayArrayArray2[arg4][arg0][arg1] = (byte) (local21 - 49);
			}
		}
	}
}
