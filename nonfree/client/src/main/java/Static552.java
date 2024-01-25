import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static552 {

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!ufa;I)V")
	public static void method7771(@OriginalArg(0) int arg0, @OriginalArg(1) Class21_Sub1_Sub1_Sub1 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (Static306.anInt6122 < arg1.anInt4242) {
			Static375.method5818(arg1);
		} else if (Static306.anInt6122 > arg1.anInt4212) {
			Static123.method7021(arg1, false);
			local9 = Static203.anInt4167;
			local7 = Static470.anInt8940;
		} else {
			Static438.method6481(arg1);
		}
		if (arg1.anInt10551 < 512 || arg1.anInt10550 < 512 || arg1.anInt10551 >= Static338.anInt6508 * 512 - 512 || arg1.anInt10550 >= (Static390.anInt7654 - 1) * 512) {
			arg1.anInt4212 = 0;
			local9 = 0;
			local7 = -1;
			arg1.anInt4242 = 0;
			arg1.anInt4224 = -1;
			arg1.anInt4233 = -1;
			arg1.anInt4209 = -1;
			arg1.anIntArray205 = null;
			arg1.anInt10551 = arg1.anIntArray206[0] * 512 + arg1.method3339() * 256;
			arg1.anInt10550 = arg1.anIntArray207[0] * 512 + arg1.method3339() * 256;
			arg1.method3329();
		}
		if (Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2 == arg1 && (arg1.anInt10551 < 6144 || arg1.anInt10550 < 6144 || arg1.anInt10551 >= (Static338.anInt6508 - 12) * 512 || (Static390.anInt7654 - 12) * 512 <= arg1.anInt10550)) {
			arg1.anInt4224 = -1;
			arg1.anInt4212 = 0;
			local7 = -1;
			arg1.anInt4233 = -1;
			arg1.anInt4242 = 0;
			local9 = 0;
			arg1.anIntArray205 = null;
			arg1.anInt4209 = -1;
			arg1.anInt10551 = arg1.anIntArray206[0] * 512 + arg1.method3339() * 256;
			arg1.anInt10550 = arg1.anIntArray207[0] * 512 + arg1.method3339() * 256;
			arg1.method3329();
		}
		@Pc(219) int local219 = Static145.method2519(arg1);
		Static10.method716(arg1);
		Static538.method7538(arg1, local9, local219, local7);
		Static282.method4488(local7, arg1);
		Static381.method5905(arg1);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIIIILclient!mf;Lclient!vn;IIIIB)V")
	public static void method7772(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class214 arg5, @OriginalArg(6) Class347 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		Static371.aClass347_9 = arg6;
		Static250.anInt5112 = arg0;
		Static344.anInt6633 = arg4;
		Static555.anInt10137 = arg2;
		Static252.anInt5168 = arg1;
		Static174.aClass103_2 = null;
		Static148.aClass103_1 = null;
		Static402.anInt7836 = arg8;
		Static73.anInt1886 = arg3;
		Static188.anInt3896 = arg7;
		Static208.aClass214_7 = arg5;
		Static267.anInt5382 = arg9;
		Static228.anInt4840 = arg10;
		Static466.aClass103_3 = null;
		Static200.method3275();
		Static170.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZLclient!r;)V")
	public static void method7773(@OriginalArg(0) int arg0, @OriginalArg(2) Class7 arg1) {
		if (!Static358.aBoolean477) {
			Static407.anInt7866 = 0;
			return;
		}
		if (Static480.aBoolean707) {
			Static473.aLong249 = Static518.aClass149_1.method6647();
		}
		Static119.anInt2720 = 0;
		Static217.anInt8618 = 0;
		Static348.anInt6732 = 0;
		@Pc(25) int[] local25 = arg1.v();
		Static144.anInt3100 = (int) ((float) local25[2] / 3.0F);
		Static32.anInt1172 = (int) ((float) local25[3] / 3.0F);
		arg1.method7806(Static156.anIntArray535);
		if (Static161.anInt3354 != (int) ((float) Static156.anIntArray535[0] / 3.0F) || (int) ((float) Static156.anIntArray535[1] / 3.0F) != Static251.anInt5137) {
			Static161.anInt3354 = (int) ((float) Static156.anIntArray535[0] / 3.0F);
			Static251.anInt5137 = (int) ((float) Static156.anIntArray535[1] / 3.0F);
			Static270.anInt5668 = Static161.anInt3354 >> 1;
			Static333.anIntArray353 = new int[Static251.anInt5137 * Static161.anInt3354];
			Static568.anInt10300 = Static251.anInt5137 >> 1;
		}
		Static47.aClass81_1 = arg1.method7781();
		Static407.anInt7866 = 0;
		for (@Pc(102) int local102 = 0; local102 < Static28.anInt1048; local102++) {
			Static262.method4144(arg1, Static560.aClass262Array4[local102], arg0);
		}
		for (@Pc(125) int local125 = 0; local125 < Static123.anInt9178; local125++) {
			Static262.method4144(arg1, Static542.aClass262Array3[local125], arg0);
		}
		for (@Pc(144) int local144 = 0; local144 < Static120.anInt2729; local144++) {
			Static262.method4144(arg1, Static248.aClass262Array2[local144], arg0);
		}
		Static350.anInt7294 = 0;
		if (Static407.anInt7866 > 0) {
			@Pc(171) int local171 = Static333.anIntArray353.length;
			@Pc(178) int local178 = local171 - local171 & 0x7;
			@Pc(180) int local180 = 0;
			while (local180 < local178) {
				Static333.anIntArray353[local180++] = Integer.MAX_VALUE;
				Static333.anIntArray353[local180++] = Integer.MAX_VALUE;
				Static333.anIntArray353[local180++] = Integer.MAX_VALUE;
				Static333.anIntArray353[local180++] = Integer.MAX_VALUE;
				Static333.anIntArray353[local180++] = Integer.MAX_VALUE;
				Static333.anIntArray353[local180++] = Integer.MAX_VALUE;
				Static333.anIntArray353[local180++] = Integer.MAX_VALUE;
				Static333.anIntArray353[local180++] = Integer.MAX_VALUE;
			}
			while (local171 > local180) {
				Static333.anIntArray353[local180++] = Integer.MAX_VALUE;
			}
			Static54.anInt1441 = 1;
			for (@Pc(239) int local239 = 0; local239 < Static407.anInt7866; local239++) {
				@Pc(245) Class262 local245 = Static218.aClass262Array1[local239];
				Static485.method7070(local245.aShortArray94[3], local245.aShortArray92[1], local245.aShortArray92[3], local245.aShortArray93[0], local245.aShortArray92[0], local245.aShortArray94[1], local245.aShortArray94[0], local245.aShortArray93[1], local245.aShortArray93[3]);
				Static485.method7070(local245.aShortArray94[3], local245.aShortArray92[2], local245.aShortArray92[3], local245.aShortArray93[1], local245.aShortArray92[1], local245.aShortArray94[2], local245.aShortArray94[1], local245.aShortArray93[2], local245.aShortArray93[3]);
			}
			Static54.anInt1441 = 2;
		}
		if (Static480.aBoolean707) {
			Static242.aLong285 = Static518.aClass149_1.method6647() - Static473.aLong249;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(JJ)J")
	public static long method7774(@OriginalArg(0) long arg0, @OriginalArg(1) long arg1) {
		return arg0 | arg1;
	}
}
