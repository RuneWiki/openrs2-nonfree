import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "[I")
	public static int[] anIntArray314 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

	@OriginalMember(owner = "client!qb", name = "O", descriptor = "Z")
	public static boolean aBoolean205 = true;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method3170(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static94.anInt4252 * 128) {
			arg0 = Static94.anInt4252 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static239.anInt5153 * 128) {
			arg2 = Static239.anInt5153 * 128 - 1;
		}
		Static144.anInt3491 = Class132.anIntArray440[arg3];
		Static80.anInt2170 = Class132.anIntArray439[arg3];
		Static66.anInt1840 = Class132.anIntArray440[arg4];
		Static236.anInt5123 = Class132.anIntArray439[arg4];
		Static68.anInt1403 = arg0;
		Static24.anInt815 = arg1;
		Static112.anInt2954 = arg2;
		Static153.anInt3688 = arg0 / 128;
		Static148.anInt446 = arg2 / 128;
		Static46.anInt1375 = Static153.anInt3688 - Static187.anInt4201;
		if (Static46.anInt1375 < 0) {
			Static46.anInt1375 = 0;
		}
		Static35.anInt973 = Static148.anInt446 - Static187.anInt4201;
		if (Static35.anInt973 < 0) {
			Static35.anInt973 = 0;
		}
		Static131.anInt1077 = Static153.anInt3688 + Static187.anInt4201;
		if (Static131.anInt1077 > Static94.anInt4252) {
			Static131.anInt1077 = Static94.anInt4252;
		}
		Static167.anInt3901 = Static148.anInt446 + Static187.anInt4201;
		if (Static167.anInt3901 > Static239.anInt5153) {
			Static167.anInt3901 = Static239.anInt5153;
		}
		@Pc(102) int local102;
		@Pc(113) int local113;
		for (@Pc(99) int local99 = 0; local99 < Static187.anInt4201 + Static187.anInt4201 + 2; local99++) {
			for (local102 = 0; local102 < Static187.anInt4201 + Static187.anInt4201 + 2; local102++) {
				local113 = (local99 - Static187.anInt4201 << 7) - (Static68.anInt1403 & 0x7F);
				@Pc(123) int local123 = (local102 - Static187.anInt4201 << 7) - (Static112.anInt2954 & 0x7F);
				@Pc(129) int local129 = Static153.anInt3688 + local99 - Static187.anInt4201;
				@Pc(135) int local135 = Static148.anInt446 + local102 - Static187.anInt4201;
				if (local129 >= 0 && local135 >= 0 && local129 < Static94.anInt4252 && local135 < Static239.anInt5153) {
					@Pc(159) int local159;
					if (Static32.anIntArrayArrayArray5 == null) {
						local159 = Static4.anIntArrayArrayArray1[0][local129][local135] + 128 - Static24.anInt815;
					} else {
						local159 = Static32.anIntArrayArrayArray5[0][local129][local135] + 128 - Static24.anInt815;
					}
					@Pc(184) int local184 = Static4.anIntArrayArrayArray1[3][local129][local135] - Static24.anInt815 - 1000;
					Static210.aBooleanArrayArray2[local99][local102] = Static174.method2987(local113, local184, local159, local123);
				} else {
					Static210.aBooleanArrayArray2[local99][local102] = false;
				}
			}
		}
		for (local102 = 0; local102 < Static187.anInt4201 + Static187.anInt4201 + 1; local102++) {
			for (local113 = 0; local113 < Static187.anInt4201 + Static187.anInt4201 + 1; local113++) {
				Static77.aBooleanArrayArray1[local102][local113] = Static210.aBooleanArrayArray2[local102][local113] || Static210.aBooleanArrayArray2[local102 + 1][local113] || Static210.aBooleanArrayArray2[local102][local113 + 1] || Static210.aBooleanArrayArray2[local102 + 1][local113 + 1];
			}
		}
		Static96.anIntArray197 = arg6;
		Static142.anIntArray259 = arg7;
		Static182.anIntArray309 = arg8;
		Static265.anIntArray469 = arg9;
		Static222.anIntArray428 = arg10;
		Static115.method2300();
		if (Static150.aClass1_Sub16ArrayArrayArray5 != null) {
			Static125.method2397(true);
			Static222.method3676(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			Static125.method2397(false);
		}
		Static222.method3676(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([IZ)[I")
	public static int[] method3171(@OriginalArg(0) int[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) int[] local16 = new int[arg0.length];
			Static274.method2690(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIBLclient!mi;II)V")
	public static void method3172(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) Class9_Sub1 arg2, @OriginalArg(5) int arg3) {
		Static151.method2723(arg2.anInt427, arg0, arg2.anInt479, arg1, arg3);
	}
}
