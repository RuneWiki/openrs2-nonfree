import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!no", name = "b", descriptor = "Z")
	public static boolean aBoolean479 = false;

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IJ)V")
	public static void method5135(@OriginalArg(1) long arg0) {
		try {
			Thread.sleep(arg0);
		} catch (@Pc(9) InterruptedException local9) {
		}
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IB)V")
	public static void method5136(@OriginalArg(0) int arg0) {
		@Pc(13) Class2_Sub2_Sub18 local13 = Static508.method6607(arg0, 3);
		local13.method6229();
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method5137(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (arg6 < 1 || arg0 < 1 || arg6 > Static281.anInt4822 - 2 || Static29.anInt491 - 2 < arg0) {
			return;
		}
		@Pc(27) int local27 = arg7;
		if (arg7 < 3 && Static562.method7350(arg6, arg0)) {
			local27 = arg7 + 1;
		}
		if (!Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318) && !Static470.method6060(arg0, Static487.anInt7738, arg6, local27)) {
			return;
		}
		if (Static469.aClass228ArrayArrayArray6 == null) {
			return;
		}
		Static370.aClass50_Sub1_1.method1059(arg6, Static87.aClass362Array3[arg7], Static417.aClass162_17, arg7, arg5, arg0);
		if (arg4 < 0) {
			return;
		}
		@Pc(70) boolean local70 = Static257.aClass2_Sub35_Sub1_1.aBoolean630;
		Static257.aClass2_Sub35_Sub1_1.aBoolean630 = true;
		Static370.aClass50_Sub1_1.method1064(Static417.aClass162_17, arg7, arg6, arg1, local27, arg3, arg0, Static87.aClass362Array3[arg7], arg4, arg2);
		Static257.aClass2_Sub35_Sub1_1.aBoolean630 = local70;
		return;
	}

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
	public static void method5138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		Static107.aBoolean120 = Static337.aClass162_13.method6851() > 0;
		Static571.aBoolean773 = true;
		Static258.anInt4281 = arg1 >> Static562.anInt9207;
		Static505.anInt8016 = arg3 >> Static562.anInt9207;
		Static297.anInt4992 = arg1;
		Static316.anInt5329 = arg3;
		Static581.anInt9417 = arg2;
		Static149.anInt2384 = Static258.anInt4281 - Static351.anInt6012;
		if (Static149.anInt2384 < 0) {
			Static279.anInt4791 = -Static149.anInt2384;
			Static149.anInt2384 = 0;
		} else {
			Static279.anInt4791 = 0;
		}
		Static284.anInt4831 = Static505.anInt8016 - Static351.anInt6012;
		if (Static284.anInt4831 < 0) {
			Static330.anInt155 = -Static284.anInt4831;
			Static284.anInt4831 = 0;
		} else {
			Static330.anInt155 = 0;
		}
		Static493.anInt7808 = Static258.anInt4281 + Static351.anInt6012;
		if (Static493.anInt7808 > Static83.anInt1434) {
			Static493.anInt7808 = Static83.anInt1434;
		}
		Static482.anInt7702 = Static505.anInt8016 + Static351.anInt6012;
		if (Static482.anInt7702 > Static405.anInt6657) {
			Static482.anInt7702 = Static405.anInt6657;
		}
		@Pc(70) boolean[][] local70 = Static590.aBooleanArrayArray10;
		@Pc(72) boolean[][] local72 = Static184.aBooleanArrayArray5;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (Static571.aBoolean773) {
			for (local76 = 0; local76 < Static351.anInt6012 + Static351.anInt6012 + 2; local76++) {
				for (local79 = 0; local79 < Static351.anInt6012 + Static351.anInt6012 + 2; local79++) {
					local86 = Static258.anInt4281 + local76 - Static351.anInt6012;
					local92 = Static505.anInt8016 + local79 - Static351.anInt6012;
					if (local86 >= 0 && local92 >= 0 && local86 < Static83.anInt1434 && local92 < Static405.anInt6657) {
						@Pc(106) int local106 = local86 << Static562.anInt9207;
						@Pc(110) int local110 = local92 << Static562.anInt9207;
						@Pc(127) int local127 = Static261.aClass151Array2[Static261.aClass151Array2.length - 1].method7676(local92, local86) - (0x3E8 << Static562.anInt9207 - 7);
						@Pc(149) int local149 = Static320.aClass151Array3 == null ? Static261.aClass151Array2[0].method7676(local92, local86) + Static481.anInt7681 : Static320.aClass151Array3[0].method7676(local92, local86) + Static481.anInt7681;
						Static184.aBooleanArrayArray5[local76][local79] = Static337.aClass162_13.O(local106, local127, local110, local106, local149, local110);
					} else {
						Static184.aBooleanArrayArray5[local76][local79] = false;
					}
				}
			}
			for (local79 = 0; local79 < Static351.anInt6012 + Static351.anInt6012 + 1; local79++) {
				for (local86 = 0; local86 < Static351.anInt6012 + Static351.anInt6012 + 1; local86++) {
					Static590.aBooleanArrayArray10[local79][local86] = Static184.aBooleanArrayArray5[local79][local86] || Static184.aBooleanArrayArray5[local79 + 1][local86] || Static184.aBooleanArrayArray5[local79][local86 + 1] || Static184.aBooleanArrayArray5[local79 + 1][local86 + 1];
				}
			}
			Static442.anIntArray480 = arg5;
			Static253.anIntArray305 = arg6;
			Static184.anIntArray228 = arg7;
			Static497.anIntArray530 = arg8;
			Static340.anIntArray398 = arg9;
			Static437.method5736(arg10, Static337.aClass162_13);
		} else {
			if (Static146.aBooleanArrayArray4 == null) {
				Static146.aBooleanArrayArray4 = new boolean[Static83.anInt1434 + Static83.anInt1434 + 1][Static405.anInt6657 + Static83.anInt1434 + 1];
				for (local76 = 0; local76 < Static146.aBooleanArrayArray4.length; local76++) {
					for (local79 = 0; local79 < Static146.aBooleanArrayArray4[0].length; local79++) {
						Static146.aBooleanArrayArray4[local76][local79] = true;
					}
				}
			}
			Static184.aBooleanArrayArray5 = Static146.aBooleanArrayArray4;
			Static590.aBooleanArrayArray10 = Static146.aBooleanArrayArray4;
			Static149.anInt2384 = 0;
			Static284.anInt4831 = 0;
			Static493.anInt7808 = Static83.anInt1434;
			Static482.anInt7702 = Static405.anInt6657;
			Static475.anInt5125 = 0;
		}
		Static332.method7658(Static337.aClass162_13);
		for (@Pc(322) Class12_Sub3 local322 = (Class12_Sub3) Static224.aClass220_4.method4661(); local322 != null; local322 = (Class12_Sub3) Static224.aClass220_4.method4660()) {
			local322.method7630();
			Static58.method1012(local322);
		}
		if (Static107.aBoolean120) {
			for (local79 = 0; local79 < Static312.anInt5136; local79++) {
				Static375.aClass141Array1[local79].method2504(arg14, arg0);
			}
		}
		if (Static492.aBoolean660) {
			Static550.anIntArray432 = Static337.aClass162_13.v();
			Static337.aClass162_13.oa(Static321.anIntArray369);
			local79 = (Static321.anIntArray369[2] - Static321.anIntArray369[0]) / Static259.anInt4285;
			for (local86 = 0; local86 < Static259.anInt4285 - 1; local86++) {
				Static435.anIntArray474[local86] = local79 * (local86 + 1) + Static305.anIntArray353[local86];
			}
			for (local92 = 0; local92 < Static49.aClass128Array2.length; local92++) {
				Static49.aClass128Array2[local92].method2305();
			}
		}
		if (Static526.aClass228ArrayArrayArray7 != null) {
			if (Static492.aBoolean660) {
				Static329.method4758(0);
			}
			Static128.method1758(true);
			Static337.aClass162_13.CA(-1, 1583160, 40, 127);
			Static205.method2549(true, arg4, arg10, arg11);
			if (Static492.aBoolean660) {
				Static145.method2000();
			}
			Static337.aClass162_13.L();
			Static128.method1758(false);
		}
		Static205.method2549(false, arg4, arg10, arg11);
		if (Static492.aBoolean660) {
			for (local79 = 0; local79 < Static450.anInt7223; local79++) {
				Static528.aBooleanArrayArrayArray2[local79] = Static362.aBooleanArrayArrayArray1[local79];
			}
			Static329.method4758(0);
			for (local86 = 0; local86 < Static49.aClass128Array2.length; local86++) {
				Static49.aClass128Array2[local86].method2305();
			}
		}
		if (Static492.aBoolean660) {
			Static145.method2000();
			for (local79 = 0; local79 < Static450.anInt7223; local79++) {
				Static362.aBooleanArrayArrayArray1[local79] = Static528.aBooleanArrayArrayArray2[local79];
			}
			if (Static448.anInt1236 == 2) {
				@Pc(505) int local505;
				if (Static454.aLongArray14[0] < Static454.aLongArray14[1]) {
					if (Static435.anIntArray474[0] + Static305.anIntArray353[0] > Static321.anIntArray369[0]) {
						local505 = Static305.anIntArray353[0]++;
					}
				} else if (Static454.aLongArray14[0] > Static454.aLongArray14[1] && Static435.anIntArray474[0] + Static305.anIntArray353[0] < Static321.anIntArray369[2]) {
					local505 = Static305.anIntArray353[0]--;
				}
			}
		}
		if (!Static571.aBoolean773) {
			Static590.aBooleanArrayArray10 = local70;
			Static184.aBooleanArrayArray5 = local72;
		}
		Static135.method6634();
	}
}
