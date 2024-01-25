import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
	public static int anInt7988;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method6568(@OriginalArg(0) String arg0) {
		if (!Static25.aBoolean32 || (Static242.anInt4524 & 0x18) == 0) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) int local16 = Static376.anInt6647;
		@Pc(18) int[] local18 = Static557.anIntArray665;
		for (@Pc(20) int local20 = 0; local20 < local16; local20++) {
			@Pc(28) Class6_Sub1_Sub1_Sub1_Sub2 local28 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local18[local20]];
			if (local28.aString67 != null && local28.aString67.equalsIgnoreCase(arg0) && (local28 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2 && (Static242.anInt4524 & 0x10) != 0 || local28 != null && (Static242.anInt4524 & 0x8) != 0)) {
				@Pc(61) Class2_Sub42 local61 = Static249.method3910(Static562.aClass286_163, Static400.aClass145_2);
				local61.aClass2_Sub15_Sub2_2.method4333(0);
				local61.aClass2_Sub15_Sub2_2.method4330(Static428.anInt7337);
				local61.aClass2_Sub15_Sub2_2.method4316(Static514.anInt406);
				local61.aClass2_Sub15_Sub2_2.method4330(Static510.anInt8520);
				local61.aClass2_Sub15_Sub2_2.method4330(local18[local20]);
				Static531.method7296(local61);
				local14 = true;
				Static295.method7121(0, -2, local28.method6165(), 0, true, local28.anIntArray510[0], local28.anIntArray509[0], local28.method6165());
				break;
			}
		}
		if (!local14) {
			Static52.method905(Static290.aClass198_23.method4365(Static52.anInt1264) + arg0);
		}
		if (Static25.aBoolean32) {
			Static566.method7699();
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIFIIIFIFI[F)V")
	public static void method6569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float[] arg11) {
		@Pc(5) int local5 = arg6 - arg10;
		@Pc(17) int local17 = arg5 - arg8;
		@Pc(25) int local25 = arg2 - arg1;
		@Pc(46) float local46 = (float) local17 * arg11[0] + (float) local5 * arg11[1] + arg11[2] * (float) local25;
		@Pc(67) float local67 = arg11[4] * (float) local5 + arg11[3] * (float) local17 + arg11[5] * (float) local25;
		@Pc(88) float local88 = (float) local5 * arg11[7] + (float) local17 * arg11[6] + (float) local25 * arg11[8];
		@Pc(110) float local110;
		@Pc(117) float local117;
		if (arg0 == 0) {
			local117 = arg4 + 0.5F - local88;
			local110 = local46 + arg9 + 0.5F;
		} else if (arg0 == 1) {
			local110 = local46 + arg9 + 0.5F;
			local117 = arg4 + local88 + 0.5F;
		} else if (arg0 == 2) {
			local110 = arg9 + 0.5F - local46;
			local117 = arg7 + 0.5F - local67;
		} else if (arg0 == 3) {
			local117 = arg7 + 0.5F - local67;
			local110 = local46 + arg9 + 0.5F;
		} else if (arg0 == 4) {
			local110 = local88 + arg4 + 0.5F;
			local117 = arg7 + 0.5F - local67;
		} else {
			local110 = arg4 + 0.5F - local88;
			local117 = arg7 + 0.5F - local67;
		}
		@Pc(205) float local205;
		if (arg3 == 1) {
			local205 = local110;
			local110 = -local117;
			local117 = local205;
		} else if (arg3 == 2) {
			local110 = -local110;
			local117 = -local117;
		} else if (arg3 == 3) {
			local205 = local110;
			local110 = local117;
			local117 = -local205;
		}
		Static351.aFloat194 = local117;
		Static85.aFloat51 = local110;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
	public static void method6570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		Static222.aBoolean341 = Static356.aClass100_8.method6185() > 0;
		Static206.aBoolean325 = true;
		Static350.anInt6287 = arg1 >> Static134.anInt2822;
		Static148.anInt3061 = arg3 >> Static134.anInt2822;
		Static96.anInt2029 = arg1;
		Static497.anInt8373 = arg3;
		Static551.anInt8936 = arg2;
		Static151.anInt3037 = Static350.anInt6287 - Static74.anInt1648;
		if (Static151.anInt3037 < 0) {
			Static253.anInt4696 = -Static151.anInt3037;
			Static151.anInt3037 = 0;
		} else {
			Static253.anInt4696 = 0;
		}
		Static99.anInt2048 = Static148.anInt3061 - Static74.anInt1648;
		if (Static99.anInt2048 < 0) {
			Static565.anInt9254 = -Static99.anInt2048;
			Static99.anInt2048 = 0;
		} else {
			Static565.anInt9254 = 0;
		}
		Static152.anInt3053 = Static350.anInt6287 + Static74.anInt1648;
		if (Static152.anInt3053 > Static496.anInt8369) {
			Static152.anInt3053 = Static496.anInt8369;
		}
		Static193.anInt3882 = Static148.anInt3061 + Static74.anInt1648;
		if (Static193.anInt3882 > Static357.anInt6390) {
			Static193.anInt3882 = Static357.anInt6390;
		}
		@Pc(70) boolean[][] local70 = Static557.aBooleanArrayArray9;
		@Pc(72) boolean[][] local72 = Static282.aBooleanArrayArray4;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (Static206.aBoolean325) {
			for (local76 = 0; local76 < Static74.anInt1648 + Static74.anInt1648 + 2; local76++) {
				for (local79 = 0; local79 < Static74.anInt1648 + Static74.anInt1648 + 2; local79++) {
					local86 = Static350.anInt6287 + local76 - Static74.anInt1648;
					local92 = Static148.anInt3061 + local79 - Static74.anInt1648;
					if (local86 >= 0 && local92 >= 0 && local86 < Static496.anInt8369 && local92 < Static357.anInt6390) {
						@Pc(106) int local106 = local86 << Static134.anInt2822;
						@Pc(110) int local110 = local92 << Static134.anInt2822;
						@Pc(127) int local127 = Static569.aClass67Array8[Static569.aClass67Array8.length - 1].method6707(local92, local86) - (0x3E8 << Static134.anInt2822 - 7);
						@Pc(149) int local149 = Static592.aClass67Array4 == null ? Static569.aClass67Array8[0].method6707(local92, local86) + Static33.anInt857 : Static592.aClass67Array4[0].method6707(local92, local86) + Static33.anInt857;
						Static282.aBooleanArrayArray4[local76][local79] = Static356.aClass100_8.O(local106, local127, local110, local106, local149, local110);
					} else {
						Static282.aBooleanArrayArray4[local76][local79] = false;
					}
				}
			}
			for (local79 = 0; local79 < Static74.anInt1648 + Static74.anInt1648 + 1; local79++) {
				for (local86 = 0; local86 < Static74.anInt1648 + Static74.anInt1648 + 1; local86++) {
					Static557.aBooleanArrayArray9[local79][local86] = Static282.aBooleanArrayArray4[local79][local86] || Static282.aBooleanArrayArray4[local79 + 1][local86] || Static282.aBooleanArrayArray4[local79][local86 + 1] || Static282.aBooleanArrayArray4[local79 + 1][local86 + 1];
				}
			}
			Static392.anIntArray476 = arg5;
			Static456.anIntArray521 = arg6;
			Static254.anIntArray317 = arg7;
			Static510.anIntArray606 = arg8;
			Static336.anIntArray427 = arg9;
			Static319.method4946(arg10, Static356.aClass100_8);
		} else {
			if (Static343.aBooleanArrayArray5 == null) {
				Static343.aBooleanArrayArray5 = new boolean[Static496.anInt8369 + Static496.anInt8369 + 1][Static357.anInt6390 + Static496.anInt8369 + 1];
				for (local76 = 0; local76 < Static343.aBooleanArrayArray5.length; local76++) {
					for (local79 = 0; local79 < Static343.aBooleanArrayArray5[0].length; local79++) {
						Static343.aBooleanArrayArray5[local76][local79] = true;
					}
				}
			}
			Static282.aBooleanArrayArray4 = Static343.aBooleanArrayArray5;
			Static557.aBooleanArrayArray9 = Static343.aBooleanArrayArray5;
			Static151.anInt3037 = 0;
			Static99.anInt2048 = 0;
			Static152.anInt3053 = Static496.anInt8369;
			Static193.anInt3882 = Static357.anInt6390;
			Static35.anInt907 = 0;
		}
		Static444.method6385(Static356.aClass100_8);
		for (@Pc(322) Class6_Sub5 local322 = (Class6_Sub5) Static380.aClass109_7.method2314(); local322 != null; local322 = (Class6_Sub5) Static380.aClass109_7.method2312()) {
			local322.method7989();
			Static122.method1783(local322);
		}
		if (Static222.aBoolean341) {
			for (local79 = 0; local79 < Static441.anInt7764; local79++) {
				Static237.aClass265Array2[local79].method6115(arg0, arg14);
			}
		}
		if (Static293.aBoolean419) {
			Static120.anIntArray156 = Static356.aClass100_8.v();
			Static356.aClass100_8.oa(Static191.anIntArray225);
			local79 = (Static191.anIntArray225[2] - Static191.anIntArray225[0]) / Static285.anInt6371;
			for (local86 = 0; local86 < Static285.anInt6371 - 1; local86++) {
				Static509.anIntArray604[local86] = local79 * (local86 + 1) + Static148.anIntArray183[local86];
			}
			for (local92 = 0; local92 < Static563.aClass356Array1.length; local92++) {
				Static563.aClass356Array1[local92].method7821();
			}
		}
		if (Static142.aClass346ArrayArrayArray1 != null) {
			if (Static293.aBoolean419) {
				Static333.method5099(0);
			}
			Static225.method3525(true);
			Static356.aClass100_8.CA(-1, 1583160, 40, 127);
			Static491.method4639(true, arg4, arg10, arg11);
			if (Static293.aBoolean419) {
				Static434.method4020();
			}
			Static356.aClass100_8.L();
			Static225.method3525(false);
		}
		Static491.method4639(false, arg4, arg10, arg11);
		if (Static293.aBoolean419) {
			for (local79 = 0; local79 < Static89.anInt8689; local79++) {
				Static277.aBooleanArrayArrayArray1[local79] = Static430.aBooleanArrayArrayArray2[local79];
			}
			Static333.method5099(0);
			for (local86 = 0; local86 < Static563.aClass356Array1.length; local86++) {
				Static563.aClass356Array1[local86].method7821();
			}
		}
		if (Static293.aBoolean419) {
			Static434.method4020();
			for (local79 = 0; local79 < Static89.anInt8689; local79++) {
				Static430.aBooleanArrayArrayArray2[local79] = Static277.aBooleanArrayArrayArray1[local79];
			}
			if (Static427.anInt7297 == 2) {
				@Pc(505) int local505;
				if (Static251.aLongArray7[0] < Static251.aLongArray7[1]) {
					if (Static509.anIntArray604[0] + Static148.anIntArray183[0] > Static191.anIntArray225[0]) {
						local505 = Static148.anIntArray183[0]++;
					}
				} else if (Static251.aLongArray7[0] > Static251.aLongArray7[1] && Static509.anIntArray604[0] + Static148.anIntArray183[0] < Static191.anIntArray225[2]) {
					local505 = Static148.anIntArray183[0]--;
				}
			}
		}
		if (!Static206.aBoolean325) {
			Static557.aBooleanArrayArray9 = local70;
			Static282.aBooleanArrayArray4 = local72;
		}
		Static531.method7294();
	}
}
