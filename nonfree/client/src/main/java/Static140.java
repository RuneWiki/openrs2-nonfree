import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
	public static int anInt3087 = 20;

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
	public static int anInt3093 = 1;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZIII)V")
	public static void method2488(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static277.anInt5482 = arg0;
		Static70.anInt1777 = arg2;
		Static265.anInt5204 = arg4;
		Static229.anInt4619 = arg3;
		Static153.anInt3403 = arg1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "([[FLclient!wl;ZI[[IIBBII[[F[[FIBII)V")
	public static void method2489(@OriginalArg(0) float[][] arg0, @OriginalArg(1) Class2_Sub32 arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[][] arg9, @OriginalArg(11) float[][] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) byte arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(11) int local11 = (arg14 << 8) + 255;
		@Pc(21) int local21 = (arg13 << 8) + 255;
		@Pc(27) int local27 = (arg8 << 8) + 255;
		@Pc(31) int[] local31 = Static12.anIntArrayArray1[arg12];
		@Pc(33) int[] local33 = null;
		@Pc(39) int local39 = (arg7 << 8) + 255;
		@Pc(45) int[] local45 = new int[local31.length >> 1];
		@Pc(47) int local47;
		for (local47 = 0; local47 < local45.length; local47++) {
			local45[local47] = Static218.method3617(null, arg10, false, 0.0F, local11, local31[local47 + local47 + 1], arg9, arg5, local27, arg4, local21, arg6, arg3, local31[local47 + local47], arg1, local39, arg0);
		}
		if (arg2) {
			@Pc(181) int local181;
			if (arg12 == 1) {
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 128, arg9, arg5, local27, arg4, local21, arg6, arg3, 64, arg1, local39, arg0);
				local33 = new int[6];
				local181 = Static218.method3617(null, arg10, true, 0.0F, local11, 64, arg9, arg5, local27, arg4, local21, arg6, arg3, 128, arg1, local39, arg0);
				local33[3] = local47;
				local33[1] = local47;
				local33[2] = local45[2];
				local33[5] = local45[2];
				local33[0] = local181;
				local33[4] = local45[0];
			} else if (arg12 == 2) {
				local33 = new int[6];
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 128, arg9, arg5, local27, arg4, local21, arg6, arg3, 128, arg1, local39, arg0);
				local181 = Static218.method3617(null, arg10, true, 0.0F, local11, 0, arg9, arg5, local27, arg4, local21, arg6, arg3, 64, arg1, local39, arg0);
				local33[3] = local47;
				local33[2] = local47;
				local33[1] = local181;
				local33[0] = local45[0];
				local33[4] = local45[1];
				local33[5] = local45[0];
			} else if (arg12 == 3) {
				local33 = new int[6];
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 128, arg9, arg5, local27, arg4, local21, arg6, arg3, 0, arg1, local39, arg0);
				local181 = Static218.method3617(null, arg10, true, 0.0F, local11, 0, arg9, arg5, local27, arg4, local21, arg6, arg3, 64, arg1, local39, arg0);
				local33[1] = local45[1];
				local33[4] = local181;
				local33[3] = local47;
				local33[0] = local45[2];
				local33[2] = local47;
				local33[5] = local45[2];
			} else if (arg12 == 4) {
				local33 = new int[3];
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 128, arg9, arg5, local27, arg4, local21, arg6, arg3, 0, arg1, local39, arg0);
				local33[1] = local47;
				local33[0] = local45[3];
				local33[2] = local45[0];
			} else if (arg12 == 5) {
				local33 = new int[3];
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 128, arg9, arg5, local27, arg4, local21, arg6, arg3, 128, arg1, local39, arg0);
				local33[1] = local47;
				local33[0] = local45[2];
				local33[2] = local45[3];
			} else if (arg12 == 6) {
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 0, arg9, arg5, local27, arg4, local21, arg6, arg3, 128, arg1, local39, arg0);
				local181 = Static218.method3617(null, arg10, true, 0.0F, local11, 128, arg9, arg5, local27, arg4, local21, arg6, arg3, 128, arg1, local39, arg0);
				local33 = new int[] { local45[3], local47, local181, local181, local45[0], local45[3] };
			} else if (arg12 == 7) {
				local33 = new int[6];
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 128, arg9, arg5, local27, arg4, local21, arg6, arg3, 0, arg1, local39, arg0);
				local181 = Static218.method3617(null, arg10, true, 0.0F, local11, 0, arg9, arg5, local27, arg4, local21, arg6, arg3, 128, arg1, local39, arg0);
				local33[0] = local45[1];
				local33[3] = local47;
				local33[2] = local47;
				local33[4] = local45[2];
				local33[1] = local181;
				local33[5] = local45[1];
			} else if (arg12 == 8) {
				local33 = new int[3];
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 0, arg9, arg5, local27, arg4, local21, arg6, arg3, 0, arg1, local39, arg0);
				local33[1] = local47;
				local33[2] = local45[4];
				local33[0] = local45[3];
			} else if (arg12 == 9) {
				local33 = new int[15];
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 64, arg9, arg5, local27, arg4, local21, arg6, arg3, 128, arg1, local39, arg0);
				local181 = Static218.method3617(null, arg10, true, 0.0F, local11, 32, arg9, arg5, local27, arg4, local21, arg6, arg3, 96, arg1, local39, arg0);
				@Pc(705) int local705 = Static218.method3617(null, arg10, true, 0.0F, local11, 0, arg9, arg5, local27, arg4, local21, arg6, arg3, 64, arg1, local39, arg0);
				local33[6] = local181;
				local33[12] = local181;
				local33[0] = local181;
				local33[1] = local47;
				local33[14] = local705;
				local33[13] = local45[1];
				local33[3] = local181;
				local33[2] = local45[4];
				local33[8] = local45[2];
				local33[5] = local45[3];
				local33[11] = local45[1];
				local33[4] = local45[4];
				local33[9] = local181;
				local33[7] = local45[3];
				local33[10] = local45[2];
			} else if (arg12 == 10) {
				local33 = new int[9];
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 128, arg9, arg5, local27, arg4, local21, arg6, arg3, 0, arg1, local39, arg0);
				local33[0] = local45[2];
				local33[1] = local47;
				local33[7] = local47;
				local33[2] = local45[3];
				local33[8] = local45[0];
				local33[3] = local45[3];
				local33[4] = local47;
				local33[6] = local45[4];
				local33[5] = local45[4];
			} else if (arg12 == 11) {
				local33 = new int[12];
				local47 = Static218.method3617(null, arg10, true, 0.0F, local11, 64, arg9, arg5, local27, arg4, local21, arg6, arg3, 0, arg1, local39, arg0);
				local181 = Static218.method3617(null, arg10, true, 0.0F, local11, 64, arg9, arg5, local27, arg4, local21, arg6, arg3, 128, arg1, local39, arg0);
				local33[11] = local181;
				local33[5] = local47;
				local33[0] = local45[3];
				local33[7] = local181;
				local33[3] = local45[3];
				local33[2] = local45[0];
				local33[9] = local45[2];
				local33[8] = local47;
				local33[6] = local45[2];
				local33[1] = local47;
				local33[4] = local45[2];
				local33[10] = local45[1];
			}
		}
		arg1.method4749(arg11, arg5, arg3, local45, local33, false);
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIB)I")
	public static int method2490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(42) int local42 = Static251.method3955(arg1 - 1, arg0 + -1) + Static251.method3955(arg1 - 1, arg0 - -1) + Static251.method3955(arg1 + 1, arg0 + -1) + Static251.method3955(arg1 + 1, arg0 + 1);
		@Pc(75) int local75 = Static251.method3955(arg1, arg0 - 1) + Static251.method3955(arg1, arg0 + 1) + Static251.method3955(arg1 - 1, arg0) + Static251.method3955(arg1 + 1, arg0);
		@Pc(80) int local80 = Static251.method3955(arg1, arg0);
		return local75 / 8 + local42 / 16 + local80 / 4;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(BII)V")
	public static void method2491(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		if (arg1 != Static281.anInt5558) {
			Static234.anIntArray462 = new int[arg1];
			for (local14 = 0; local14 < arg1; local14++) {
				Static234.anIntArray462[local14] = (local14 << 12) / arg1;
			}
			Static281.anInt5558 = arg1;
			Static226.anInt6054 = arg1 - 1;
			Static28.anInt627 = arg1 * 32;
		}
		if (Static64.anInt1560 == arg0) {
			return;
		}
		if (arg0 == Static281.anInt5558) {
			Static272.anIntArray521 = Static234.anIntArray462;
		} else {
			Static272.anIntArray521 = new int[arg0];
			for (local14 = 0; local14 < arg0; local14++) {
				Static272.anIntArray521[local14] = (local14 << 12) / arg0;
			}
		}
		Static64.anInt1560 = arg0;
		Static107.anInt2459 = arg0 - 1;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I")
	public static int method2492(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2) {
		@Pc(9) int local9 = arg2.length();
		@Pc(11) int local11 = 0;
		@Pc(14) int local14 = arg0.length();
		@Pc(20) int local20 = 0;
		@Pc(22) char local22 = 0;
		@Pc(24) char local24 = 0;
		while (local9 > local11 - local22 || local14 > local20 - local24) {
			if (local9 <= local11 - local22) {
				return -1;
			}
			if (local14 <= local20 - local24) {
				return 1;
			}
			@Pc(65) char local65;
			if (local22 == '\u0000') {
				local65 = arg2.charAt(local11++);
			} else {
				local65 = local22;
			}
			@Pc(79) char local79;
			if (local24 == '\u0000') {
				local79 = arg0.charAt(local20++);
			} else {
				local79 = local24;
			}
			local22 = Static53.method976(local65);
			local24 = Static53.method976(local79);
			local65 = Static100.method1732(local65, arg1);
			local79 = Static100.method1732(local79, arg1);
			if (local65 != local79 && Character.toUpperCase(local65) != Character.toUpperCase(local79)) {
				local65 = Character.toLowerCase(local65);
				local79 = Character.toLowerCase(local79);
				if (local65 != local79) {
					return Static88.method1564(arg1, local65) - Static88.method1564(arg1, local79);
				}
			}
		}
		@Pc(153) int local153 = Math.min(local9, local14);
		@Pc(194) char local194;
		@Pc(155) int local155;
		for (local155 = 0; local155 < local153; local155++) {
			if (arg1 == 2) {
				local11 = local9 - local155 - 1;
				local20 = local14 - local155 - 1;
			} else {
				local20 = local155;
				local11 = local155;
			}
			@Pc(190) char local190 = arg2.charAt(local11);
			local194 = arg0.charAt(local20);
			if (local190 != local194 && Character.toUpperCase(local190) != Character.toUpperCase(local194)) {
				local190 = Character.toLowerCase(local190);
				local194 = Character.toLowerCase(local194);
				if (local190 != local194) {
					return Static88.method1564(arg1, local190) - Static88.method1564(arg1, local194);
				}
			}
		}
		local155 = local9 - local14;
		if (local155 != 0) {
			return local155;
		}
		for (@Pc(244) int local244 = 0; local244 < local153; local244++) {
			local194 = arg2.charAt(local244);
			@Pc(259) char local259 = arg0.charAt(local244);
			if (local194 != local259) {
				return Static88.method1564(arg1, local194) - Static88.method1564(arg1, local259);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)I")
	public static int method2493(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(6) Class2_Sub10 local6 = (Class2_Sub10) Static219.aClass101_18.method2867((long) arg0);
		if (local6 == null) {
			return 0;
		} else if (arg1 >= 0 && arg1 < local6.anIntArray104.length) {
			return local6.anIntArray104[arg1];
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(IB)V")
	public static void method2494() {
		Static296.aClass157_44.method4034(5);
		Static257.aClass157_41.method4034(5);
	}
}
