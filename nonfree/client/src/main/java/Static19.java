import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZ)V")
	public static void method538(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[][][] arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int arg10, @OriginalArg(11) byte arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) boolean arg14) {
		Static192.aBoolean328 = Static63.aClass12_5.method6406() > 0;
		Static41.aBoolean88 = true;
		Static251.anInt4676 = arg1 >> Static378.anInt6665;
		Static63.anInt1544 = arg3 >> Static378.anInt6665;
		Static221.anInt4276 = arg1;
		Static41.anInt1080 = arg3;
		Static453.anInt7762 = arg2;
		Static118.anInt2396 = Static251.anInt4676 - Static246.anInt8757;
		if (Static118.anInt2396 < 0) {
			Static85.anInt1949 = -Static118.anInt2396;
			Static118.anInt2396 = 0;
		} else {
			Static85.anInt1949 = 0;
		}
		Static494.anInt8292 = Static63.anInt1544 - Static246.anInt8757;
		if (Static494.anInt8292 < 0) {
			Static530.anInt8768 = -Static494.anInt8292;
			Static494.anInt8292 = 0;
		} else {
			Static530.anInt8768 = 0;
		}
		Static557.anInt9078 = Static251.anInt4676 + Static246.anInt8757;
		if (Static557.anInt9078 > Static446.anInt7725) {
			Static557.anInt9078 = Static446.anInt7725;
		}
		Static84.anInt1946 = Static63.anInt1544 + Static246.anInt8757;
		if (Static84.anInt1946 > Static218.anInt4229) {
			Static84.anInt1946 = Static218.anInt4229;
		}
		@Pc(70) boolean[][] local70 = Static116.aBooleanArrayArray4;
		@Pc(72) boolean[][] local72 = Static89.aBooleanArrayArray3;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(86) int local86;
		@Pc(92) int local92;
		if (Static41.aBoolean88) {
			for (local76 = 0; local76 < Static246.anInt8757 + Static246.anInt8757 + 2; local76++) {
				for (local79 = 0; local79 < Static246.anInt8757 + Static246.anInt8757 + 2; local79++) {
					local86 = Static251.anInt4676 + local76 - Static246.anInt8757;
					local92 = Static63.anInt1544 + local79 - Static246.anInt8757;
					if (local86 >= 0 && local92 >= 0 && local86 < Static446.anInt7725 && local92 < Static218.anInt4229) {
						@Pc(106) int local106 = local86 << Static378.anInt6665;
						@Pc(110) int local110 = local92 << Static378.anInt6665;
						@Pc(127) int local127 = Static158.aClass17Array2[Static158.aClass17Array2.length - 1].method6642(local86, local92) - (0x3E8 << Static378.anInt6665 - 7);
						@Pc(149) int local149 = Static499.aClass17Array3 == null ? Static158.aClass17Array2[0].method6642(local86, local92) + Static47.anInt1239 : Static499.aClass17Array3[0].method6642(local86, local92) + Static47.anInt1239;
						Static89.aBooleanArrayArray3[local76][local79] = Static63.aClass12_5.O(local106, local127, local110, local106, local149, local110);
					} else {
						Static89.aBooleanArrayArray3[local76][local79] = false;
					}
				}
			}
			for (local79 = 0; local79 < Static246.anInt8757 + Static246.anInt8757 + 1; local79++) {
				for (local86 = 0; local86 < Static246.anInt8757 + Static246.anInt8757 + 1; local86++) {
					Static116.aBooleanArrayArray4[local79][local86] = Static89.aBooleanArrayArray3[local79][local86] || Static89.aBooleanArrayArray3[local79 + 1][local86] || Static89.aBooleanArrayArray3[local79][local86 + 1] || Static89.aBooleanArrayArray3[local79 + 1][local86 + 1];
				}
			}
			Static594.anIntArray633 = arg5;
			Static267.anIntArray302 = arg6;
			Static398.anIntArray470 = arg7;
			Static253.anIntArray288 = arg8;
			Static127.anIntArray157 = arg9;
			Static139.method4205(Static63.aClass12_5, arg10);
		} else {
			if (Static184.aBooleanArrayArray9 == null) {
				Static184.aBooleanArrayArray9 = new boolean[Static446.anInt7725 + Static446.anInt7725 + 1][Static218.anInt4229 + Static446.anInt7725 + 1];
				for (local76 = 0; local76 < Static184.aBooleanArrayArray9.length; local76++) {
					for (local79 = 0; local79 < Static184.aBooleanArrayArray9[0].length; local79++) {
						Static184.aBooleanArrayArray9[local76][local79] = true;
					}
				}
			}
			Static89.aBooleanArrayArray3 = Static184.aBooleanArrayArray9;
			Static116.aBooleanArrayArray4 = Static184.aBooleanArrayArray9;
			Static118.anInt2396 = 0;
			Static494.anInt8292 = 0;
			Static557.anInt9078 = Static446.anInt7725;
			Static84.anInt1946 = Static218.anInt4229;
			Static259.anInt4761 = 0;
		}
		Static58.method1380(Static63.aClass12_5);
		for (@Pc(322) Class20_Sub8 local322 = (Class20_Sub8) Static312.aClass349_8.method7653(); local322 != null; local322 = (Class20_Sub8) Static312.aClass349_8.method7660()) {
			local322.method7704();
			Static218.method3614(local322);
		}
		if (Static192.aBoolean328) {
			for (local79 = 0; local79 < Static64.anInt1565; local79++) {
				Static502.aClass237Array1[local79].method5472(arg14, arg0);
			}
		}
		if (Static50.aBoolean95) {
			Static318.anIntArray366 = Static63.aClass12_5.v();
			Static63.aClass12_5.oa(Static231.anIntArray263);
			local79 = (Static231.anIntArray263[2] - Static231.anIntArray263[0]) / Static62.anInt1534;
			for (local86 = 0; local86 < Static62.anInt1534 - 1; local86++) {
				Static364.anIntArray427[local86] = local79 * (local86 + 1) + Static208.anIntArray595[local86];
			}
			for (local92 = 0; local92 < Static89.aClass328Array1.length; local92++) {
				Static89.aClass328Array1[local92].method7291();
			}
		}
		if (Static80.aClass293ArrayArrayArray35 != null) {
			if (Static50.aBoolean95) {
				Static53.method1244(0);
			}
			Static200.method3430(true);
			Static63.aClass12_5.CA(-1, 1583160, 40, 127);
			Static590.method7874(true, arg4, arg10, arg11);
			if (Static50.aBoolean95) {
				Static519.method7099();
			}
			Static63.aClass12_5.L();
			Static200.method3430(false);
		}
		Static590.method7874(false, arg4, arg10, arg11);
		if (Static50.aBoolean95) {
			for (local79 = 0; local79 < Static101.anInt2104; local79++) {
				Static316.aBooleanArrayArrayArray1[local79] = Static471.aBooleanArrayArrayArray2[local79];
			}
			Static53.method1244(0);
			for (local86 = 0; local86 < Static89.aClass328Array1.length; local86++) {
				Static89.aClass328Array1[local86].method7291();
			}
		}
		if (Static50.aBoolean95) {
			Static519.method7099();
			for (local79 = 0; local79 < Static101.anInt2104; local79++) {
				Static471.aBooleanArrayArrayArray2[local79] = Static316.aBooleanArrayArrayArray1[local79];
			}
			if (Static38.anInt1024 == 2) {
				@Pc(505) int local505;
				if (Static104.aLongArray4[0] < Static104.aLongArray4[1]) {
					if (Static364.anIntArray427[0] + Static208.anIntArray595[0] > Static231.anIntArray263[0]) {
						local505 = Static208.anIntArray595[0]++;
					}
				} else if (Static104.aLongArray4[0] > Static104.aLongArray4[1] && Static364.anIntArray427[0] + Static208.anIntArray595[0] < Static231.anIntArray263[2]) {
					local505 = Static208.anIntArray595[0]--;
				}
			}
		}
		if (!Static41.aBoolean88) {
			Static116.aBooleanArrayArray4 = local70;
			Static89.aBooleanArrayArray3 = local72;
		}
		Static28.method2617();
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ZC)Z")
	public static boolean method539(@OriginalArg(1) char arg0) {
		return arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-';
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)I")
	public static int method541() {
		if (Static255.aFrame3 == null) {
			return Static126.aBoolean476 ? 2 : 1;
		} else {
			return 3;
		}
	}
}
