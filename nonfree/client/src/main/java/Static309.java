import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!wg", name = "J", descriptor = "[S")
	public static short[] aShortArray124;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "Lclient!fh;")
	public static Class58 aClass58_103;

	@OriginalMember(owner = "client!wg", name = "E", descriptor = "I")
	public static int anInt6001 = 2;

	@OriginalMember(owner = "client!wg", name = "V", descriptor = "I")
	public static int anInt6012 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIILjava/lang/String;)V")
	public static void method4789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) String arg3) {
		@Pc(4) Class189 local4 = Static152.method2432(arg0, arg1);
		if (local4 == null) {
			return;
		}
		if (local4.anObjectArray18 != null) {
			@Pc(22) Class4_Sub13 local22 = new Class4_Sub13();
			local22.anInt2494 = arg2;
			local22.aClass189_7 = local4;
			local22.aString143 = arg3;
			local22.anObjectArray2 = local4.anObjectArray18;
			Static135.method2020(local22);
		}
		@Pc(40) boolean local40 = true;
		if (local4.anInt5908 > 0) {
			local40 = Static291.method4439(local4);
		}
		if (!local40 || !Static41.method687(local4).method3279(arg2 - 1)) {
			return;
		}
		if (arg2 == 1) {
			Static110.aClass4_Sub10_Sub1_1.method4687(94);
			Static110.aClass4_Sub10_Sub1_1.method4654(arg0);
			Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		}
		if (arg2 == 2) {
			Static110.aClass4_Sub10_Sub1_1.method4687(201);
			Static110.aClass4_Sub10_Sub1_1.method4654(arg0);
			Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		}
		if (arg2 == 3) {
			Static110.aClass4_Sub10_Sub1_1.method4687(30);
			Static110.aClass4_Sub10_Sub1_1.method4654(arg0);
			Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		}
		if (arg2 == 4) {
			Static110.aClass4_Sub10_Sub1_1.method4687(61);
			Static110.aClass4_Sub10_Sub1_1.method4654(arg0);
			Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		}
		if (arg2 == 5) {
			Static110.aClass4_Sub10_Sub1_1.method4687(66);
			Static110.aClass4_Sub10_Sub1_1.method4654(arg0);
			Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		}
		if (arg2 == 6) {
			Static110.aClass4_Sub10_Sub1_1.method4687(7);
			Static110.aClass4_Sub10_Sub1_1.method4654(arg0);
			Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		}
		if (arg2 == 7) {
			Static110.aClass4_Sub10_Sub1_1.method4687(108);
			Static110.aClass4_Sub10_Sub1_1.method4654(arg0);
			Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		}
		if (arg2 == 8) {
			Static110.aClass4_Sub10_Sub1_1.method4687(255);
			Static110.aClass4_Sub10_Sub1_1.method4654(arg0);
			Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		}
		if (arg2 == 9) {
			Static110.aClass4_Sub10_Sub1_1.method4687(97);
			Static110.aClass4_Sub10_Sub1_1.method4654(arg0);
			Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		}
		if (arg2 == 10) {
			Static110.aClass4_Sub10_Sub1_1.method4687(10);
			Static110.aClass4_Sub10_Sub1_1.method4654(arg0);
			Static110.aClass4_Sub10_Sub1_1.method4668(arg1);
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BILclient!fh;Lclient!fh;Z)Lclient!te;")
	public static Class4_Sub3_Sub19 method4793(@OriginalArg(1) int arg0, @OriginalArg(2) Class58 arg1, @OriginalArg(3) Class58 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg1.method1363(arg0);
		for (@Pc(14) int local14 = 0; local14 < local12.length; local14++) {
			@Pc(30) byte[] local30 = arg1.method1350(local12[local14], arg0);
			if (local30 == null) {
				local7 = false;
			} else {
				@Pc(52) int local52 = (local30[0] & 0xFF) << 8 | local30[1] & 0xFF;
				@Pc(60) byte[] local60 = arg2.method1350(0, local52);
				if (local60 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class4_Sub3_Sub19(arg1, arg2, arg0, false);
		} catch (@Pc(97) Exception local97) {
			return null;
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([[FII[[I[[F[[ILclient!ih;IIZF[[FIIIIII)I")
	public static int method4794(@OriginalArg(0) float[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) int[][] arg5, @OriginalArg(6) Class4_Sub12 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(10) float arg10, @OriginalArg(11) float[][] arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16) {
		@Pc(16) int local16;
		if (arg12 == 1) {
			local16 = arg13;
			arg13 = arg1;
			arg1 = 128 - local16;
		} else if (arg12 == 2) {
			arg1 = 128 - arg1;
			arg13 = 128 - arg13;
		} else if (arg12 == 3) {
			local16 = arg13;
			arg13 = 128 - arg1;
			arg1 = local16;
		}
		@Pc(99) float local99;
		@Pc(89) float local89;
		@Pc(111) int local111;
		@Pc(109) float local109;
		if (arg13 == 0 && arg1 == 0) {
			local111 = arg16;
			local99 = arg4[arg8][arg2];
			local109 = arg0[arg8][arg2];
			local89 = arg11[arg8][arg2];
		} else if (arg13 == 128 && arg1 == 0) {
			local109 = arg0[arg8 + 1][arg2];
			local99 = arg4[arg8 + 1][arg2];
			local111 = arg7;
			local89 = arg11[arg8 + 1][arg2];
		} else if (arg13 == 128 && arg1 == 128) {
			local89 = arg11[arg8 + 1][arg2 + 1];
			local99 = arg4[arg8 + 1][arg2 + 1];
			local109 = arg0[arg8 + 1][arg2 + 1];
			local111 = arg15;
		} else if (arg13 == 0 && arg1 == 128) {
			local89 = arg11[arg8][arg2 + 1];
			local111 = arg14;
			local109 = arg0[arg8][arg2 + 1];
			local99 = arg4[arg8][arg2 + 1];
		} else {
			local99 = arg4[arg8][arg2];
			local89 = arg11[arg8][arg2];
			local109 = arg0[arg8][arg2];
			@Pc(141) float local141 = (float) arg13 / 128.0F;
			@Pc(146) float local146 = (float) arg1 / 128.0F;
			@Pc(160) float local160 = local99 + local141 * (arg4[arg8 + 1][arg2] - local99);
			@Pc(174) float local174 = local89 + local141 * (arg11[arg8 + 1][arg2] - local89);
			@Pc(189) float local189 = local109 + (arg0[arg8 + 1][arg2] - local109) * local141;
			@Pc(197) float local197 = arg0[arg8][arg2 + 1];
			@Pc(205) float local205 = arg4[arg8][arg2 + 1];
			@Pc(213) float local213 = arg11[arg8][arg2 + 1];
			@Pc(229) float local229 = local197 + (arg0[arg8 + 1][arg2 + 1] - local197) * local141;
			local109 = local189 + local146 * (local229 - local189);
			@Pc(254) float local254 = local213 + local141 * (arg11[arg8 + 1][arg2 + 1] - local213);
			@Pc(270) float local270 = local205 + local141 * (arg4[arg8 + 1][arg2 + 1] - local205);
			local89 = local174 + (local254 - local174) * local146;
			local99 = local160 + local146 * (local270 - local160);
			@Pc(293) int local293 = Static127.method1953(arg16, arg7, arg13);
			@Pc(299) int local299 = Static127.method1953(arg14, arg15, arg13);
			local111 = Static127.method1953(local293, local299, arg1);
		}
		@Pc(390) int local390 = (arg2 << 7) + arg1;
		@Pc(396) int local396 = arg13 + (arg8 << 7);
		@Pc(404) int local404 = Static13.method206(arg13, arg8, arg1, arg3, arg2);
		return arg6.method1872(local396, local404, local390, local109, local99, local89, arg9 ? local111 & 0xFFFFFF00 : local111, arg5 == null ? 0.0F : (float) (local404 - Static13.method206(arg13, arg8, arg1, arg5, arg2)) / arg10);
	}
}
