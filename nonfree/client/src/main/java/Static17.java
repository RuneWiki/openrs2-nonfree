import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!as", name = "u", descriptor = "Lclient!la;")
	public static Class137 aClass137_5;

	@OriginalMember(owner = "client!as", name = "g", descriptor = "[I")
	public static final int[] anIntArray310 = new int[8];

	@OriginalMember(owner = "client!as", name = "z", descriptor = "F")
	public static float aFloat56 = 1.0F;

	@OriginalMember(owner = "client!as", name = "Q", descriptor = "[I")
	public static final int[] anIntArray311 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!za;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method3335(@OriginalArg(0) Class117 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static335.aClass117_6 = arg0;
		Static271.anInt4847 = arg1;
		Static378.aClass34_7 = arg3;
		Static358.aBoolean574 = Static335.aClass117_6.method5710() > 0;
		Static166.anInt2722 = arg4 >> Static41.anInt612;
		Static44.anInt638 = arg6 >> Static41.anInt612;
		Static188.anInt3434 = arg4;
		Static197.anInt3614 = arg6;
		Static24.anInt353 = arg5;
		Static61.anInt7290 = Static166.anInt2722 - Static99.anInt1331;
		if (Static61.anInt7290 < 0) {
			Static81.anInt1126 = -Static61.anInt7290;
			Static61.anInt7290 = 0;
		} else {
			Static81.anInt1126 = 0;
		}
		Static260.anInt4567 = Static44.anInt638 - Static99.anInt1331;
		if (Static260.anInt4567 < 0) {
			Static14.anInt248 = -Static260.anInt4567;
			Static260.anInt4567 = 0;
		} else {
			Static14.anInt248 = 0;
		}
		Static9.anInt163 = Static166.anInt2722 + Static99.anInt1331;
		if (Static9.anInt163 > Static174.anInt2873) {
			Static9.anInt163 = Static174.anInt2873;
		}
		Static267.anInt4664 = Static44.anInt638 + Static99.anInt1331;
		if (Static267.anInt4664 > Static325.anInt5351) {
			Static267.anInt4664 = Static325.anInt5351;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static99.anInt1331 + Static99.anInt1331 + 2; local74++) {
			for (local77 = 0; local77 < Static99.anInt1331 + Static99.anInt1331 + 2; local77++) {
				local84 = Static166.anInt2722 + local74 - Static99.anInt1331;
				local90 = Static44.anInt638 + local77 - Static99.anInt1331;
				if (local84 >= 0 && local90 >= 0 && local84 < Static174.anInt2873 && local90 < Static325.anInt5351) {
					@Pc(104) int local104 = local84 << Static41.anInt612;
					@Pc(108) int local108 = local90 << Static41.anInt612;
					@Pc(124) int local124 = Static157.aClass139Array1[Static157.aClass139Array1.length - 1].ua(local84, local90) - (0x3E8 << Static41.anInt612 - 7);
					@Pc(144) int local144 = Static397.aClass139Array2 == null ? Static157.aClass139Array1[0].ua(local84, local90) + Static383.anInt6136 : Static397.aClass139Array2[0].ua(local84, local90) + Static383.anInt6136;
					Static81.aBooleanArrayArray2[local74][local77] = Static335.aClass117_6.VA(local104, local124, local108, local104, local144, local108);
				} else {
					Static81.aBooleanArrayArray2[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static99.anInt1331 + Static99.anInt1331 + 1; local77++) {
			for (local84 = 0; local84 < Static99.anInt1331 + Static99.anInt1331 + 1; local84++) {
				Static84.aBooleanArrayArray3[local77][local84] = Static81.aBooleanArrayArray2[local77][local84] || Static81.aBooleanArrayArray2[local77 + 1][local84] || Static81.aBooleanArrayArray2[local77][local84 + 1] || Static81.aBooleanArrayArray2[local77 + 1][local84 + 1];
			}
		}
		Static336.anIntArray399 = arg8;
		Static247.anIntArray326 = arg9;
		Static115.anIntArray156 = arg10;
		Static47.anIntArray102 = arg11;
		Static4.anIntArray3 = arg12;
		Static443.method5527();
		Static30.method425();
		for (@Pc(260) Class111_Sub3 local260 = (Class111_Sub3) Static181.aClass63_2.method1019(); local260 != null; local260 = (Class111_Sub3) Static181.aClass63_2.method1022()) {
			local260.method5886();
			Static83.method1014(local260);
		}
		if (Static358.aBoolean574) {
			for (local90 = 0; local90 < Static395.anInt6364; local90++) {
				Static203.aClass93Array1[local90].method1707(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static335.aClass117_6.method5684(0);
			if (Static352.aClass12_1 == null || Static352.aClass12_1 instanceof Class12_Sub1) {
				Static352.aClass12_1 = new Class12_Sub2();
			}
		} else if (Static352.aClass12_1 == null || Static352.aClass12_1 instanceof Class12_Sub2) {
			Static352.aClass12_1 = new Class12_Sub1();
		}
		Static352.aClass12_1.method4092(arg2);
		Static352.aClass12_1.method4085();
		if (Static165.aClass216ArrayArrayArray2 != null) {
			Static56.method806(true);
			Static352.aClass12_1.method4090(22);
			Static96.method1140(arg2, null, 0, (byte) 0, arg15, arg16);
			Static352.aClass12_1.method4085();
			Static352.aClass12_1.method4090(23);
			Static56.method806(false);
		}
		Static96.method1140(arg2, arg7, arg13, arg14, arg15, arg16);
		Static352.aClass12_1.method4085();
		Static352.aClass12_1.method4082();
		Static352.aClass12_1.method4085();
		if (arg2 > 1) {
			Static335.aClass117_6.method5722(0);
		}
		Static335.aClass117_6.method5693(0, null);
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(I)Lclient!tj;")
	public static Class239_Sub1 method3336() {
		return Static89.anInt1208 < Static13.aClass239_Sub1Array1.length ? Static13.aClass239_Sub1Array1[Static89.anInt1208++] : null;
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Lclient!oi;BLclient!oi;Lclient!oi;Lclient!oi;)V")
	public static void method3340(@OriginalArg(0) Class185 arg0, @OriginalArg(2) Class185 arg1, @OriginalArg(3) Class185 arg2, @OriginalArg(4) Class185 arg3) {
		Static50.aClass185_14 = arg1;
		Static57.aClass185_17 = arg2;
		Static207.aClass185_59 = arg3;
		Static164.aClass185_110 = arg0;
		Static45.aClass107ArrayArray1 = new Class107[Static164.aClass185_110.method4010()][];
		Static411.aBooleanArray144 = new boolean[Static164.aClass185_110.method4010()];
	}

	@OriginalMember(owner = "client!as", name = "b", descriptor = "(I)V")
	public static void method3341() {
		for (@Pc(3) int local3 = 0; local3 < Static137.anInt2142; local3++) {
			@Pc(9) int local9 = Static135.anIntArray183[local3];
			@Pc(18) Class1_Sub44 local18 = (Class1_Sub44) Static46.aClass208_33.method4405((long) local9);
			if (local18 != null) {
				@Pc(23) Class11_Sub1_Sub3_Sub1 local23 = local18.aClass11_Sub1_Sub3_Sub1_2;
				Static279.method3753(local23.aClass272_1.anInt7346, local23);
			}
		}
	}
}
