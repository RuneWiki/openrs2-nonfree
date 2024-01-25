import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static345 {

	@OriginalMember(owner = "client!wf", name = "d", descriptor = "[I")
	public static int[] anIntArray553;

	@OriginalMember(owner = "client!wf", name = "h", descriptor = "Lclient!ra;")
	public static Class170 aClass170_120;

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!ep;")
	public static Class60 aClass60_7;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
	public static int anInt6412 = 0;

	@OriginalMember(owner = "client!wf", name = "b", descriptor = "I")
	public static int anInt6413 = -1;

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "([[BI[[B[B[I[III)I")
	public static int method5682(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[][] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6) {
		@Pc(9) int local9 = arg4[arg6];
		@Pc(24) int local24 = local9 + arg5[arg6];
		@Pc(28) int local28 = arg4[arg1];
		@Pc(35) int local35 = local28 + arg5[arg1];
		@Pc(37) int local37 = local9;
		if (local9 < local28) {
			local37 = local28;
		}
		@Pc(44) int local44 = local24;
		if (local35 < local24) {
			local44 = local35;
		}
		@Pc(59) int local59 = arg3[arg6] & 0xFF;
		if ((arg3[arg1] & 0xFF) < local59) {
			local59 = arg3[arg1] & 0xFF;
		}
		@Pc(80) byte[] local80 = arg0[arg6];
		@Pc(84) byte[] local84 = arg2[arg1];
		@Pc(88) int local88 = local37 - local9;
		@Pc(93) int local93 = local37 - local28;
		for (@Pc(95) int local95 = local37; local95 < local44; local95++) {
			@Pc(108) int local108 = local80[local88++] + local84[local93++];
			if (local59 > local108) {
				local59 = local108;
			}
		}
		return -local59;
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIIIJ)V")
	public static void method5684(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) long arg6) {
		if (!Static188.aBoolean264 && Static27.anInt5324 < 500) {
			@Pc(20) int local20 = arg3 == -1 ? Static156.anInt3126 : arg3;
			@Pc(31) Class5_Sub4 local31 = new Class5_Sub4(arg1, arg2, local20, arg0, arg6, arg4, arg5);
			Static60.aClass211_4.method5609(local31);
			Static27.anInt5324++;
		}
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIIIILclient!dl;IIIIZ[II[I)I")
	public static int method5685(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class49 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) boolean arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int[] arg13) {
		for (@Pc(12) int local12 = 0; local12 < 128; local12++) {
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				Static55.anIntArrayArray6[local12][local16] = 0;
				Static144.anIntArrayArray19[local12][local16] = 99999999;
			}
		}
		@Pc(58) boolean local58;
		if (arg1 == 1) {
			local58 = Static28.method713(arg8, arg4, arg12, arg7, arg5, arg0, arg6, arg9, arg3, arg2);
		} else if (arg1 == 2) {
			local58 = Static140.method2617(arg6, arg12, arg5, arg2, arg7, arg9, arg8, arg3, arg4, arg0);
		} else {
			local58 = Static169.method3212(arg4, arg0, arg2, arg3, arg12, arg7, arg9, arg6, arg1, arg5, arg8);
		}
		@Pc(98) int local98 = arg6 - 64;
		@Pc(102) int local102 = arg12 - 64;
		@Pc(104) int local104 = Static259.anInt3212;
		@Pc(106) int local106 = Static9.anInt309;
		@Pc(112) int local112;
		@Pc(114) int local114;
		@Pc(121) int local121;
		if (!local58) {
			if (!arg10) {
				return -1;
			}
			local112 = Integer.MAX_VALUE;
			local114 = Integer.MAX_VALUE;
			for (local121 = arg7 - 10; local121 <= arg7 + 10; local121++) {
				for (@Pc(127) int local127 = arg9 - 10; local127 <= arg9 + 10; local127++) {
					@Pc(134) int local134 = local121 - local98;
					@Pc(139) int local139 = local127 - local102;
					if (local134 >= 0 && local139 >= 0 && local134 < 128 && local139 < 128 && Static144.anIntArrayArray19[local134][local139] < 100) {
						@Pc(166) int local166 = 0;
						if (arg7 > local121) {
							local166 = arg7 - local121;
						} else if (local121 > arg2 + arg7 - 1) {
							local166 = local121 + 1 - arg2 - arg7;
						}
						@Pc(196) int local196 = 0;
						if (local127 < arg9) {
							local196 = arg9 - local127;
						} else if (arg4 + arg9 - 1 < local127) {
							local196 = local127 + 1 - arg9 - arg4;
						}
						@Pc(238) int local238 = local166 * local166 + local196 * local196;
						if (local112 > local238 || local112 == local238 && local114 > Static144.anIntArrayArray19[local134][local139]) {
							local114 = Static144.anIntArrayArray19[local134][local139];
							local112 = local238;
							local106 = local127;
							local104 = local121;
						}
					}
				}
			}
			if (~local112 == Integer.MIN_VALUE) {
				return -1;
			}
		}
		if (local104 == arg6 && local106 == arg12) {
			return 0;
		}
		@Pc(311) byte local311 = 0;
		Static219.anIntArray309[0] = local104;
		local112 = local311 + 1;
		Static302.anIntArray449[0] = local106;
		@Pc(333) int local333;
		local114 = local333 = Static55.anIntArrayArray6[local104 - local98][local106 - local102];
		while (arg6 != local104 || arg12 != local106) {
			if (local114 != local333) {
				Static219.anIntArray309[local112] = local104;
				local333 = local114;
				Static302.anIntArray449[local112++] = local106;
			}
			if ((local114 & 0x2) != 0) {
				local104++;
			} else if ((local114 & 0x8) != 0) {
				local104--;
			}
			if ((local114 & 0x1) != 0) {
				local106++;
			} else if ((local114 & 0x4) != 0) {
				local106--;
			}
			local114 = Static55.anIntArrayArray6[local104 - local98][local106 - local102];
		}
		local121 = 0;
		while (local112-- > 0) {
			arg11[local121] = Static219.anIntArray309[local112];
			arg13[local121++] = Static302.anIntArray449[local112];
			if (arg11.length <= local121) {
				break;
			}
		}
		return local121;
	}
}
