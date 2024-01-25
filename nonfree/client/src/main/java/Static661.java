import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static661 {

	@OriginalMember(owner = "client!uv", name = "b", descriptor = "Lclient!hfa;")
	public static final Class152 aClass152_8 = new Class152(5, 1);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "Lclient!via;")
	public static final Class386 aClass386_10 = new Class386("LIVE", "", "", 0);

	@OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method9038(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static11.aBoolean26 = true;
		Static400.aBoolean558 = Static689.aClass145_16.method9694() > 0;
		Static575.aBoolean776 = true;
		Static20.anInt267 = arg1 >> Static260.anInt4053;
		Static503.anInt2766 = arg3 >> Static260.anInt4053;
		Static600.anInt9334 = arg1;
		Static384.anInt6087 = arg3;
		Static705.anInt10795 = arg2;
		Static51.anInt855 = Static20.anInt267 - Static128.anInt2136;
		if (Static51.anInt855 < 0) {
			Static682.anInt11015 = -Static51.anInt855;
			Static51.anInt855 = 0;
		} else {
			Static682.anInt11015 = 0;
		}
		Static459.anInt7474 = Static503.anInt2766 - Static128.anInt2136;
		if (Static459.anInt7474 < 0) {
			Static50.anInt823 = -Static459.anInt7474;
			Static459.anInt7474 = 0;
		} else {
			Static50.anInt823 = 0;
		}
		Static384.anInt6091 = Static20.anInt267 + Static128.anInt2136;
		if (Static384.anInt6091 > Static372.anInt5930) {
			Static384.anInt6091 = Static372.anInt5930;
		}
		Static160.anInt2706 = Static503.anInt2766 + Static128.anInt2136;
		if (Static160.anInt2706 > Static545.anInt8590) {
			Static160.anInt2706 = Static545.anInt8590;
		}
		@Pc(79) boolean[][] local79 = Static208.aBooleanArrayArray6;
		@Pc(81) boolean[][] local81 = Static605.aBooleanArrayArray10;
		@Pc(85) int local85;
		@Pc(88) int local88;
		@Pc(90) int local90;
		if (Static575.aBoolean776) {
			for (local85 = 0; local85 < Static128.anInt2136 + Static128.anInt2136 + 2; local85++) {
				local88 = 0;
				local90 = 0;
				for (@Pc(92) int local92 = 0; local92 < Static128.anInt2136 + Static128.anInt2136 + 2; local92++) {
					if (local92 > 1) {
						Static234.anIntArray288[local92 - 2] = local88;
					}
					local88 = local90;
					@Pc(112) int local112 = Static20.anInt267 + local85 - Static128.anInt2136;
					@Pc(118) int local118 = Static503.anInt2766 + local92 - Static128.anInt2136;
					@Pc(138) int local138;
					if (local112 >= 0 && local118 >= 0 && local112 < Static372.anInt5930 && local118 < Static545.anInt8590) {
						local138 = local112 << Static260.anInt4053;
						@Pc(142) int local142 = local118 << Static260.anInt4053;
						@Pc(159) int local159 = Static126.aClass133Array1[Static126.aClass133Array1.length - 1].method8217(local112, local118) - (0x3E8 << Static260.anInt4053 - 7);
						@Pc(188) int local188 = (Static685.aClass133Array5 == null ? Static126.aClass133Array1[0].method8217(local112, local118) + Static60.anInt1042 : Static685.aClass133Array5[0].method8217(local112, local118) + Static60.anInt1042) + (0x3E8 << Static260.anInt4053 - 7);
						local90 = arg15 >= 0 ? Static689.aClass145_16.r(local138, local159, local142, local138, local188, local142, arg15) : Static689.aClass145_16.JA(local138, local159, local142, local138, local188, local142);
						Static605.aBooleanArrayArray10[local85][local92] = local90 == 0;
					} else {
						local90 = -1;
						Static605.aBooleanArrayArray10[local85][local92] = false;
					}
					if (local85 > 0 && local92 > 0) {
						local138 = Static234.anIntArray288[local92 - 1] & Static234.anIntArray288[local92] & local88 & local90;
						Static208.aBooleanArrayArray6[local85 - 1][local92 - 1] = local138 == 0;
					}
				}
				Static234.anIntArray288[Static128.anInt2136 + Static128.anInt2136] = local88;
				Static234.anIntArray288[Static128.anInt2136 + Static128.anInt2136 + 1] = local90;
			}
			if (arg15 >= 0) {
				Static11.aBoolean26 = false;
			} else {
				Static153.anIntArray371 = arg5;
				Static389.anIntArray448 = arg6;
				Static624.anIntArray693 = arg7;
				Static524.anIntArray594 = arg8;
				Static236.anIntArray290 = arg9;
				Static184.method2660(Static689.aClass145_16, arg10);
			}
		} else {
			if (Static207.aBooleanArrayArray1 == null) {
				Static207.aBooleanArrayArray1 = new boolean[Static372.anInt5930 + Static372.anInt5930 + 1][Static545.anInt8590 + Static372.anInt5930 + 1];
			}
			for (local85 = 0; local85 < Static207.aBooleanArrayArray1.length; local85++) {
				for (local88 = 0; local88 < Static207.aBooleanArrayArray1[0].length; local88++) {
					Static207.aBooleanArrayArray1[local85][local88] = true;
				}
			}
			Static605.aBooleanArrayArray10 = Static207.aBooleanArrayArray1;
			Static208.aBooleanArrayArray6 = Static207.aBooleanArrayArray1;
			Static51.anInt855 = 0;
			Static459.anInt7474 = 0;
			Static384.anInt6091 = Static372.anInt5930;
			Static160.anInt2706 = Static545.anInt8590;
			Static11.aBoolean26 = false;
		}
		Static379.method5480(Static689.aClass145_16);
		if (!Static655.aClass52_3.aBoolean139) {
			@Pc(387) Class320 local387 = Static655.aClass52_3.aClass320_1;
			for (@Pc(392) Class4_Sub8 local392 = (Class4_Sub8) local387.method7605(); local392 != null; local392 = (Class4_Sub8) local387.method7608()) {
				local392.method9416();
				Static525.method7392(local392);
			}
		}
		if (Static400.aBoolean558) {
			for (local85 = 0; local85 < Static488.anInt7862; local85++) {
				Static292.aClass248Array1[local85].method6005(arg14, arg0);
			}
		}
		if (Static4.aBoolean8) {
			Static407.anIntArray469 = Static689.aClass145_16.Y();
			Static689.aClass145_16.K(Static290.anIntArray355);
			local85 = (Static290.anIntArray355[2] - Static290.anIntArray355[0]) / Static268.anInt4160;
			for (local88 = 0; local88 < Static268.anInt4160 - 1; local88++) {
				Static314.anIntArray345[local88] = local85 * (local88 + 1) + Static708.anIntArray750[local88];
			}
			for (local90 = 0; local90 < Static403.aClass23Array1.length; local90++) {
				Static403.aClass23Array1[local90].method375();
			}
		}
		if (Static564.aClass311ArrayArrayArray1 != null) {
			if (Static4.aBoolean8) {
				Static373.method5319(0);
			}
			Static463.method6693(true);
			Static689.aClass145_16.ra(-1, 1583160, 40, 127);
			Static319.method4449(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static4.aBoolean8) {
				Static17.method245();
			}
			Static689.aClass145_16.pa();
			Static463.method6693(false);
		}
		Static319.method4449(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static4.aBoolean8) {
			for (local85 = 0; local85 < Static97.anInt1761; local85++) {
				Static277.aBooleanArrayArrayArray2[local85] = Static9.aBooleanArrayArrayArray1[local85];
			}
			Static373.method5319(0);
			for (local88 = 0; local88 < Static403.aClass23Array1.length; local88++) {
				Static403.aClass23Array1[local88].method375();
			}
		}
		if (Static4.aBoolean8) {
			Static17.method245();
			for (local85 = 0; local85 < Static97.anInt1761; local85++) {
				Static9.aBooleanArrayArrayArray1[local85] = Static277.aBooleanArrayArrayArray2[local85];
			}
			if (Static445.anInt7219 == 2) {
				@Pc(601) int local601;
				if (Static205.aLongArray3[0] < Static205.aLongArray3[1]) {
					if (Static314.anIntArray345[0] + Static708.anIntArray750[0] > Static290.anIntArray355[0]) {
						local601 = Static708.anIntArray750[0]++;
					}
				} else if (Static205.aLongArray3[0] > Static205.aLongArray3[1] && Static314.anIntArray345[0] + Static708.anIntArray750[0] < Static290.anIntArray355[2]) {
					local601 = Static708.anIntArray750[0]--;
				}
			}
		}
		if (!Static575.aBoolean776) {
			Static208.aBooleanArrayArray6 = local79;
			Static605.aBooleanArrayArray10 = local81;
		}
		Static479.method6880();
	}
}
