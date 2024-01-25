import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static531 {

	@OriginalMember(owner = "client!qp", name = "f", descriptor = "[I")
	public static final int[] anIntArray488 = new int[8];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
	public static void method7495(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14, @OriginalArg(16) int arg15, @OriginalArg(17) int arg16, @OriginalArg(18) boolean arg17) {
		Static183.aBoolean267 = true;
		Static668.aBoolean281 = Static626.aClass67_16.method7634() > 0;
		Static608.aBoolean715 = true;
		Static296.anInt3655 = arg1 >> Static394.anInt7067;
		Static450.anInt7928 = arg3 >> Static394.anInt7067;
		Static148.anInt2796 = arg1;
		Static355.anInt6022 = arg3;
		Static628.anInt10147 = arg2;
		Static431.anInt7577 = Static296.anInt3655 - Static726.anInt11312;
		if (Static431.anInt7577 < 0) {
			Static362.anInt8651 = -Static431.anInt7577;
			Static431.anInt7577 = 0;
		} else {
			Static362.anInt8651 = 0;
		}
		Static712.anInt11116 = Static450.anInt7928 - Static726.anInt11312;
		if (Static712.anInt11116 < 0) {
			Static697.anInt10943 = -Static712.anInt11116;
			Static712.anInt11116 = 0;
		} else {
			Static697.anInt10943 = 0;
		}
		Static477.anInt8336 = Static296.anInt3655 + Static726.anInt11312;
		if (Static477.anInt8336 > Static509.anInt8656) {
			Static477.anInt8336 = Static509.anInt8656;
		}
		Static532.anInt8977 = Static450.anInt7928 + Static726.anInt11312;
		if (Static532.anInt8977 > Static164.anInt3059) {
			Static532.anInt8977 = Static164.anInt3059;
		}
		@Pc(79) boolean[][] local79 = Static624.aBooleanArrayArray7;
		@Pc(81) boolean[][] local81 = Static39.aBooleanArrayArray1;
		@Pc(85) int local85;
		@Pc(88) int local88;
		@Pc(90) int local90;
		if (Static608.aBoolean715) {
			for (local85 = 0; local85 < Static726.anInt11312 + Static726.anInt11312 + 2; local85++) {
				local88 = 0;
				local90 = 0;
				for (@Pc(92) int local92 = 0; local92 < Static726.anInt11312 + Static726.anInt11312 + 2; local92++) {
					if (local92 > 1) {
						Static698.anIntArray610[local92 - 2] = local88;
					}
					local88 = local90;
					@Pc(112) int local112 = Static296.anInt3655 + local85 - Static726.anInt11312;
					@Pc(118) int local118 = Static450.anInt7928 + local92 - Static726.anInt11312;
					@Pc(138) int local138;
					if (local112 >= 0 && local118 >= 0 && local112 < Static509.anInt8656 && local118 < Static164.anInt3059) {
						local138 = local112 << Static394.anInt7067;
						@Pc(142) int local142 = local118 << Static394.anInt7067;
						@Pc(159) int local159 = Static167.aClass313Array1[Static167.aClass313Array1.length - 1].method9095(local118, local112) - (0x3E8 << Static394.anInt7067 - 7);
						@Pc(188) int local188 = (Static711.aClass313Array3 == null ? Static167.aClass313Array1[0].method9095(local118, local112) + Static495.anInt8508 : Static711.aClass313Array3[0].method9095(local118, local112) + Static495.anInt8508) + (0x3E8 << Static394.anInt7067 - 7);
						local90 = arg15 >= 0 ? Static626.aClass67_16.r(local138, local159, local142, local138, local188, local142, arg15) : Static626.aClass67_16.JA(local138, local159, local142, local138, local188, local142);
						Static39.aBooleanArrayArray1[local85][local92] = local90 == 0;
					} else {
						local90 = -1;
						Static39.aBooleanArrayArray1[local85][local92] = false;
					}
					if (local85 > 0 && local92 > 0) {
						local138 = Static698.anIntArray610[local92 - 1] & Static698.anIntArray610[local92] & local88 & local90;
						Static624.aBooleanArrayArray7[local85 - 1][local92 - 1] = local138 == 0;
					}
				}
				Static698.anIntArray610[Static726.anInt11312 + Static726.anInt11312] = local88;
				Static698.anIntArray610[Static726.anInt11312 + Static726.anInt11312 + 1] = local90;
			}
			if (arg15 >= 0) {
				Static183.aBoolean267 = false;
			} else {
				Static406.anIntArray390 = arg5;
				Static407.anIntArray392 = arg6;
				Static404.anIntArray389 = arg7;
				Static395.anIntArray383 = arg8;
				Static512.anIntArray476 = arg9;
				Static201.method3005(arg10, Static626.aClass67_16);
			}
		} else {
			if (Static431.aBooleanArrayArray4 == null) {
				Static431.aBooleanArrayArray4 = new boolean[Static509.anInt8656 + Static509.anInt8656 + 1][Static164.anInt3059 + Static509.anInt8656 + 1];
			}
			for (local85 = 0; local85 < Static431.aBooleanArrayArray4.length; local85++) {
				for (local88 = 0; local88 < Static431.aBooleanArrayArray4[0].length; local88++) {
					Static431.aBooleanArrayArray4[local85][local88] = true;
				}
			}
			Static39.aBooleanArrayArray1 = Static431.aBooleanArrayArray4;
			Static624.aBooleanArrayArray7 = Static431.aBooleanArrayArray4;
			Static431.anInt7577 = 0;
			Static712.anInt11116 = 0;
			Static477.anInt8336 = Static509.anInt8656;
			Static532.anInt8977 = Static164.anInt3059;
			Static183.aBoolean267 = false;
		}
		Static78.method1016(Static626.aClass67_16);
		if (!Static424.aClass88_1.aBoolean210) {
			@Pc(387) Class66 local387 = Static424.aClass88_1.aClass66_1;
			for (@Pc(392) Class19_Sub8 local392 = (Class19_Sub8) local387.method1381(); local392 != null; local392 = (Class19_Sub8) local387.method1380()) {
				local392.method9359();
				Static235.method3665(local392);
			}
		}
		if (Static668.aBoolean281) {
			for (local85 = 0; local85 < Static254.anInt4739; local85++) {
				Static458.aClass246Array1[local85].method6053(arg0, arg14);
			}
		}
		if (Static67.aBoolean81) {
			Static180.anIntArray163 = Static626.aClass67_16.Y();
			Static626.aClass67_16.K(Static464.anIntArray438);
			local85 = (Static464.anIntArray438[2] - Static464.anIntArray438[0]) / Static76.anInt1153;
			for (local88 = 0; local88 < Static76.anInt1153 - 1; local88++) {
				Static41.anIntArray46[local88] = local85 * (local88 + 1) + Static532.anIntArray489[local88];
			}
			for (local90 = 0; local90 < Static150.aClass240Array1.length; local90++) {
				Static150.aClass240Array1[local90].method5946();
			}
		}
		if (Static712.aClass262ArrayArrayArray3 != null) {
			if (Static67.aBoolean81) {
				Static223.method3524(0);
			}
			Static665.method8868(true);
			Static626.aClass67_16.ra(-1, 1583160, 40, 127);
			Static661.method8825(true, arg4, arg10, arg11, arg15, arg16, arg17);
			if (Static67.aBoolean81) {
				Static376.method5428();
			}
			Static626.aClass67_16.pa();
			Static665.method8868(false);
		}
		Static661.method8825(false, arg4, arg10, arg11, arg15, arg16, arg17);
		if (Static67.aBoolean81) {
			for (local85 = 0; local85 < Static241.anInt4521; local85++) {
				Static153.aBooleanArrayArrayArray2[local85] = Static71.aBooleanArrayArrayArray1[local85];
			}
			Static223.method3524(0);
			for (local88 = 0; local88 < Static150.aClass240Array1.length; local88++) {
				Static150.aClass240Array1[local88].method5946();
			}
		}
		if (Static67.aBoolean81) {
			Static376.method5428();
			for (local85 = 0; local85 < Static241.anInt4521; local85++) {
				Static71.aBooleanArrayArrayArray1[local85] = Static153.aBooleanArrayArrayArray2[local85];
			}
			if (Static459.anInt2357 == 2) {
				@Pc(601) int local601;
				if (Static534.aLongArray23[0] < Static534.aLongArray23[1]) {
					if (Static41.anIntArray46[0] + Static532.anIntArray489[0] > Static464.anIntArray438[0]) {
						local601 = Static532.anIntArray489[0]++;
					}
				} else if (Static534.aLongArray23[0] > Static534.aLongArray23[1] && Static41.anIntArray46[0] + Static532.anIntArray489[0] < Static464.anIntArray438[2]) {
					local601 = Static532.anIntArray489[0]--;
				}
			}
		}
		if (!Static608.aBoolean715) {
			Static624.aBooleanArrayArray7 = local79;
			Static39.aBooleanArrayArray1 = local81;
		}
		Static98.method1302();
	}

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(II)Z")
	public static boolean method7499(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
