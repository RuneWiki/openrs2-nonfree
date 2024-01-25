import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static392 {

	@OriginalMember(owner = "client!oo", name = "b", descriptor = "I")
	public static int anInt6492 = 0;

	@OriginalMember(owner = "client!oo", name = "c", descriptor = "J")
	public static long aLong175 = -1L;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lclient!r;IIIIIIZZ)V")
	public static void method5402(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static337.aClass162_13 = arg0;
		Static448.anInt1236 = arg1;
		Static492.aBoolean660 = Static448.anInt1236 > 1 && Static337.aClass162_13.method6841();
		Static562.anInt9207 = 9;
		Static481.anInt7681 = 0x1 << Static562.anInt9207;
		Static437.anInt7021 = Static481.anInt7681 >> 1;
		Math.sqrt((double) (Static437.anInt7021 * Static437.anInt7021 + Static437.anInt7021 * Static437.anInt7021));
		Static450.anInt7223 = 4;
		Static83.anInt1434 = arg2;
		Static405.anInt6657 = arg3;
		Static351.anInt6012 = arg4;
		Static539.aClass139_1 = Static6.method118();
		Static586.method7590();
		Static185.aClass228ArrayArrayArray4 = new Class228[4][Static83.anInt1434][Static405.anInt6657];
		Static261.aClass151Array2 = new Class151[4];
		if (arg5) {
			Static434.anIntArrayArray48 = new int[Static83.anInt1434][Static405.anInt6657];
			Static576.aByteArrayArray24 = new byte[Static83.anInt1434][Static405.anInt6657];
			Static94.aShortArrayArray7 = new short[Static83.anInt1434][Static405.anInt6657];
			Static526.aClass228ArrayArrayArray7 = new Class228[1][Static83.anInt1434][Static405.anInt6657];
			Static320.aClass151Array3 = new Class151[1];
		} else {
			Static434.anIntArrayArray48 = null;
			Static576.aByteArrayArray24 = null;
			Static94.aShortArrayArray7 = null;
			Static526.aClass228ArrayArrayArray7 = null;
			Static320.aClass151Array3 = null;
		}
		if (arg6) {
			Static94.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static375.aClass141Array1 = new Class141[65535];
			Static463.aBooleanArray25 = new boolean[65535];
			Static312.anInt5136 = 0;
		} else {
			Static94.aLongArrayArrayArray1 = null;
			Static375.aClass141Array1 = null;
			Static463.aBooleanArray25 = null;
			Static312.anInt5136 = 0;
		}
		Static128.method1758(false);
		Static146.aClass12_Sub2ArrayArray1 = new Class12_Sub2[2][];
		Static146.aClass12_Sub2ArrayArray1[0] = new Class12_Sub2[Static537.anIntArray578[0]];
		Static146.aClass12_Sub2ArrayArray1[1] = new Class12_Sub2[Static537.anIntArray578[1]];
		Static313.anIntArray359 = new int[2];
		Static310.aClass12_Sub2ArrayArray2 = new Class12_Sub2[2][];
		Static310.aClass12_Sub2ArrayArray2[0] = new Class12_Sub2[Static73.anIntArray129[0]];
		Static310.aClass12_Sub2ArrayArray2[1] = new Class12_Sub2[Static73.anIntArray129[1]];
		Static503.anIntArray540 = new int[2];
		Static585.aClass12_Sub2ArrayArray3 = new Class12_Sub2[2][];
		Static585.aClass12_Sub2ArrayArray3[0] = new Class12_Sub2[Static69.anIntArray352[0]];
		Static585.aClass12_Sub2ArrayArray3[1] = new Class12_Sub2[Static69.anIntArray352[1]];
		Static535.anIntArray577 = new int[2];
		Static488.aClass12_Sub2Array2 = new Class12_Sub2[10000];
		Static159.anInt2496 = 0;
		Static242.aClass12_Sub2Array1 = new Class12_Sub2[5000];
		Static537.anInt8833 = 0;
		Static256.aClass12_Sub2_Sub1Array1 = new Class12_Sub2_Sub1[5000];
		Static153.anInt2452 = 0;
		Static590.aBooleanArrayArray10 = new boolean[Static351.anInt6012 + Static351.anInt6012 + 1][Static351.anInt6012 + Static351.anInt6012 + 1];
		Static184.aBooleanArrayArray5 = new boolean[Static351.anInt6012 + Static351.anInt6012 + 2][Static351.anInt6012 + Static351.anInt6012 + 2];
		if (Static492.aBoolean660) {
			Static362.aBooleanArrayArrayArray1 = new boolean[4][Static351.anInt6012 + Static351.anInt6012 + 1][Static351.anInt6012 + Static351.anInt6012 + 1];
			Static528.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static49.aClass128Array2 != null) {
				Static460.method5969();
			}
			Static49.aClass128Array2 = new Class128[Static448.anInt1236];
			Static337.aClass162_13.method6823(Static49.aClass128Array2.length + 1);
			Static337.aClass162_13.method6850(0);
			for (@Pc(247) int local247 = 0; local247 < Static49.aClass128Array2.length; local247++) {
				Static49.aClass128Array2[local247] = new Class128(local247 + 1, Static337.aClass162_13);
				(new Thread(Static49.aClass128Array2[local247], "wr" + local247)).start();
			}
			@Pc(282) byte local282;
			if (Static448.anInt1236 == 2) {
				local282 = 4;
				Static259.anInt4285 = 2;
			} else if (Static448.anInt1236 == 3) {
				local282 = 6;
				Static259.anInt4285 = 3;
			} else {
				local282 = 8;
				Static259.anInt4285 = 4;
			}
			Static228.aClass318Array1 = new Class318[local282];
			for (@Pc(302) int local302 = 0; local302 < local282; local302++) {
				Static228.aClass318Array1[local302] = new Class318(Static376.aStringArrayArray1[Static448.anInt1236 - 2][local302]);
			}
		} else {
			Static259.anInt4285 = 1;
		}
		Static435.anIntArray474 = new int[Static259.anInt4285 - 1];
		Static305.anIntArray353 = new int[Static259.anInt4285 - 1];
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method5403(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < local8; local17++) {
			@Pc(23) char local23 = arg0.charAt(local17);
			if (local23 <= '\u007f') {
				local15++;
			} else if (local23 > '\u07ff') {
				local15 += 3;
			} else {
				local15 += 2;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V")
	public static void method5404(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub2_Sub8 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class151 local8 = Static261.aClass151Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static405.anInt6657; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static83.anInt1434; local15++) {
						local1 = local8.v(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static562.anInt9207;
							@Pc(32) int local32 = local12 << Static562.anInt9207;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class151 local41 = Static261.aClass151Array2[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7676(local12, local15) - local41.method7676(local12, local15);
									@Pc(71) int local71 = local8.method7676(local12, local15 + 1) - local41.method7676(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7676(local12 + 1, local15 + 1) - local41.method7676(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7676(local12 + 1, local15) - local41.method7676(local12 + 1, local15);
									local41.E(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
