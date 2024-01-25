import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hda", name = "h", descriptor = "I")
	public static int anInt3598 = 0;

	@OriginalMember(owner = "client!hda", name = "i", descriptor = "[[I")
	public static final int[][] anIntArrayArray17 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IZ)V")
	public static void method3173(@OriginalArg(1) boolean arg0) {
		if (Static1.aString102.length() == 0) {
			return;
		}
		Static177.method2690("--> " + Static1.aString102);
		Static444.method6596(false, arg0, Static1.aString102);
		Static237.anInt4012 = 0;
		Static1.aString102 = "";
		Static214.anInt3694 = 0;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(II)V")
	public static void method3175(@OriginalArg(1) int arg0) {
		Static70.anInt9228 = arg0;
		@Pc(7) Class293 local7 = Static214.aClass293_26;
		synchronized (Static214.aClass293_26) {
			Static214.aClass293_26.method6930();
		}
		local7 = Static15.aClass293_5;
		synchronized (Static15.aClass293_5) {
			Static15.aClass293_5.method6930();
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lclient!ha;II)V")
	public static void method3176(@OriginalArg(0) Class126 arg0, @OriginalArg(1) int arg1) {
		if (!Static592.aBoolean843 || !Static157.aBoolean242) {
			Static510.anInt8556 = 0;
			return;
		}
		if (Static613.aBoolean814) {
			Static229.aLong123 = Static18.aClass179_1.method7485();
		}
		Static148.anInt4147 = 0;
		Static115.anInt1792 = 0;
		Static434.anInt7350 = 0;
		@Pc(27) int[] local27 = arg0.Y();
		Static376.anInt6613 = (int) ((float) local27[2] / 3.0F);
		Static254.anInt4286 = (int) ((float) local27[3] / 3.0F);
		arg0.method7060(Static221.anIntArray311);
		if (Static536.anInt8903 != (int) ((float) Static221.anIntArray311[0] / 3.0F) || Static106.anInt1658 != (int) ((float) Static221.anIntArray311[1] / 3.0F)) {
			Static536.anInt8903 = (int) ((float) Static221.anIntArray311[0] / 3.0F);
			Static106.anInt1658 = (int) ((float) Static221.anIntArray311[1] / 3.0F);
			Static378.anInt6647 = Static536.anInt8903 >> 1;
			Static174.anIntArray272 = new int[Static106.anInt1658 * Static536.anInt8903];
			Static153.anInt2441 = Static106.anInt1658 >> 1;
		}
		Static630.aClass117_10 = arg0.method7037();
		Static510.anInt8556 = 0;
		for (@Pc(100) int local100 = 0; local100 < Static541.anInt8998; local100++) {
			Static27.method542(Static218.aClass4Array2[local100], arg1, arg0);
		}
		for (@Pc(115) int local115 = 0; local115 < Static278.anInt4554; local115++) {
			Static27.method542(Static311.aClass4Array4[local115], arg1, arg0);
		}
		for (@Pc(130) int local130 = 0; local130 < Static156.anInt2751; local130++) {
			Static27.method542(Static232.aClass4Array3[local130], arg1, arg0);
		}
		Static525.anInt8753 = 0;
		if (Static510.anInt8556 > 0) {
			@Pc(153) int local153 = Static174.anIntArray272.length;
			@Pc(160) int local160 = local153 - local153 & 0x7;
			@Pc(162) int local162 = 0;
			while (local162 < local160) {
				Static174.anIntArray272[local162++] = Integer.MAX_VALUE;
				Static174.anIntArray272[local162++] = Integer.MAX_VALUE;
				Static174.anIntArray272[local162++] = Integer.MAX_VALUE;
				Static174.anIntArray272[local162++] = Integer.MAX_VALUE;
				Static174.anIntArray272[local162++] = Integer.MAX_VALUE;
				Static174.anIntArray272[local162++] = Integer.MAX_VALUE;
				Static174.anIntArray272[local162++] = Integer.MAX_VALUE;
				Static174.anIntArray272[local162++] = Integer.MAX_VALUE;
			}
			while (local162 < local153) {
				Static174.anIntArray272[local162++] = Integer.MAX_VALUE;
			}
			Static303.anInt4820 = 1;
			for (@Pc(221) int local221 = 0; local221 < Static510.anInt8556; local221++) {
				@Pc(227) Class4 local227 = Static195.aClass4Array1[local221];
				Static91.method1414(local227.aShortArray2[1], local227.aShortArray3[1], local227.aShortArray1[0], local227.aShortArray3[0], local227.aShortArray3[3], local227.aShortArray1[3], local227.aShortArray1[1], local227.aShortArray2[0], local227.aShortArray2[3]);
				Static91.method1414(local227.aShortArray2[2], local227.aShortArray3[2], local227.aShortArray1[1], local227.aShortArray3[1], local227.aShortArray3[3], local227.aShortArray1[3], local227.aShortArray1[2], local227.aShortArray2[1], local227.aShortArray2[3]);
			}
			Static303.anInt4820 = 2;
		}
		if (Static613.aBoolean814) {
			Static538.aLong236 = Static18.aClass179_1.method7485() - Static229.aLong123;
		}
	}
}
