import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!vf", name = "h", descriptor = "Lclient!lm;")
	public static Class134 aClass134_10;

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "[I")
	public static final int[] anIntArray31 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
	public static int anInt484 = 0;

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
	public static int anInt486 = 0;

	@OriginalMember(owner = "client!vf", name = "g", descriptor = "J")
	public static long aLong15 = 0L;

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZI)I")
	public static int method438(@OriginalArg(1) int arg0) {
		if (Static81.aClass202_3 != null) {
			Static81.aClass202_3.method5477();
			Static81.aClass202_3 = null;
		}
		Static253.anInt5228++;
		if (Static253.anInt5228 > 4) {
			Static253.anInt5228 = 0;
			Static232.anInt4831 = 0;
			return arg0;
		}
		if (Static233.anInt4834 == Static57.anInt1356) {
			Static233.anInt4834 = Static325.anInt2760;
		} else {
			Static233.anInt4834 = Static57.anInt1356;
		}
		Static232.anInt4831 = 0;
		return -1;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
	public static void method440() {
		@Pc(6) Class37 local6 = Static19.aClass37_9;
		synchronized (Static19.aClass37_9) {
			Static19.aClass37_9.method914();
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z[Lclient!ba;ILclient!ck;Lclient!ii;I)V")
	public static void method441(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class17[] arg1, @OriginalArg(3) Class12 arg2, @OriginalArg(4) Class105 arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9;
		@Pc(13) int local13;
		@Pc(30) int local30;
		if (!arg0) {
			for (@Pc(5) int local5 = 0; local5 < 4; local5++) {
				for (local9 = 0; local9 < Static43.anInt1151; local9++) {
					for (local13 = 0; local13 < Static260.anInt5348; local13++) {
						if ((Static291.aByteArrayArrayArray11[local5][local9][local13] & 0x1) != 0) {
							local30 = local5;
							if ((Static291.aByteArrayArrayArray11[1][local9][local13] & 0x2) != 0) {
								local30 = local5 - 1;
							}
							if (local30 >= 0) {
								arg1[local30].method342(local13, local9);
							}
						}
					}
				}
			}
		}
		@Pc(72) int[][] local72 = new int[Static43.anInt1151][Static260.anInt5348];
		for (local9 = 0; local9 < arg4; local9++) {
			for (local13 = 0; local13 < Static260.anInt5348; local13++) {
				Static192.anIntArray381[local13] = 0;
				Static44.anIntArray69[local13] = 0;
				Static283.anIntArray555[local13] = 0;
				Static44.anIntArray68[local13] = 0;
				Static48.anIntArray72[local13] = 0;
			}
			for (local30 = -5; local30 < Static43.anInt1151; local30++) {
				@Pc(125) int local125;
				@Pc(142) int local142;
				@Pc(211) int local211;
				for (@Pc(119) int local119 = 0; local119 < Static260.anInt5348; local119++) {
					local125 = local30 + 5;
					@Pc(189) int local189;
					if (local125 < Static43.anInt1151) {
						local142 = Static47.aByteArrayArrayArray1[local9][local125][local119] & 0xFF;
						if (local142 > 0) {
							@Pc(153) Class107 local153 = Static1.method14(local142 - 1);
							Static192.anIntArray381[local119] += local153.anInt2595;
							Static44.anIntArray69[local119] += local153.anInt2597;
							Static283.anIntArray555[local119] += local153.anInt2606;
							Static44.anIntArray68[local119] += local153.anInt2600;
							local189 = Static48.anIntArray72[local119]++;
						}
					}
					local142 = local30 - 5;
					if (local142 >= 0) {
						local211 = Static47.aByteArrayArrayArray1[local9][local142][local119] & 0xFF;
						if (local211 > 0) {
							@Pc(219) Class107 local219 = Static1.method14(local211 - 1);
							Static192.anIntArray381[local119] -= local219.anInt2595;
							Static44.anIntArray69[local119] -= local219.anInt2597;
							Static283.anIntArray555[local119] -= local219.anInt2606;
							Static44.anIntArray68[local119] -= local219.anInt2600;
							local189 = Static48.anIntArray72[local119]--;
						}
					}
				}
				if (local30 >= 0) {
					local125 = 0;
					local142 = 0;
					local211 = 0;
					@Pc(272) int local272 = 0;
					@Pc(274) int local274 = 0;
					for (@Pc(276) int local276 = -5; local276 < Static260.anInt5348; local276++) {
						@Pc(282) int local282 = local276 + 5;
						if (Static260.anInt5348 > local282) {
							local142 += Static44.anIntArray69[local282];
							local274 += Static48.anIntArray72[local282];
							local272 += Static44.anIntArray68[local282];
							local211 += Static283.anIntArray555[local282];
							local125 += Static192.anIntArray381[local282];
						}
						@Pc(323) int local323 = local276 - 5;
						if (local323 >= 0) {
							local125 -= Static192.anIntArray381[local323];
							local142 -= Static44.anIntArray69[local323];
							local274 -= Static48.anIntArray72[local323];
							local272 -= Static44.anIntArray68[local323];
							local211 -= Static283.anIntArray555[local323];
						}
						if (local276 >= 0 && local272 > 0 && local274 > 0) {
							local72[local30][local276] = Static24.method406(local125 * 256 / local272, local142 / local274, local211 / local274);
						}
					}
				}
			}
			Static69.method1227(Static263.aClass12Array2[local9], Static260.anInt5348, Static100.aByteArrayArrayArray4[local9], arg2, Static228.aByteArrayArrayArray7[local9], arg0, Static43.anInt1151, arg3, local72, Static334.aByteArrayArrayArray12[local9], local9, Static47.aByteArrayArrayArray1[local9]);
			Static47.aByteArrayArrayArray1[local9] = null;
			Static334.aByteArrayArrayArray12[local9] = null;
			Static228.aByteArrayArrayArray7[local9] = null;
			Static100.aByteArrayArrayArray4[local9] = null;
		}
		if (!arg0) {
			if (Static50.aBoolean83) {
				Static116.method1839();
			}
			if (Static256.anInt5260 != 0) {
				Static182.method3231();
			}
		}
		for (local13 = 0; local13 < arg4; local13++) {
			Static263.aClass12Array2[local13].method2701();
		}
	}
}
