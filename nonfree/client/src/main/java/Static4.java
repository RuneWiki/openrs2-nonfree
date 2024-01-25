import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!af", name = "c", descriptor = "J")
	public static long aLong167 = -1L;

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(Lclient!vq;IILclient!s;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4654(@OriginalArg(0) Class47 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class57 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static170.aClass47_5 = arg0;
		Static30.anInt751 = arg1;
		Static264.aClass57_7 = arg3;
		Static308.aBoolean444 = Static170.aClass47_5.method2745() > 0;
		Static61.anInt1578 = arg4 >> 7;
		Static246.anInt5043 = arg6 >> 7;
		Static39.anInt1025 = arg4;
		Static357.anInt6822 = arg6;
		Static23.anInt463 = arg5;
		Static22.anInt442 = Static61.anInt1578 - Static328.anInt6272;
		if (Static22.anInt442 < 0) {
			Static268.anInt5370 = -Static22.anInt442;
			Static22.anInt442 = 0;
		} else {
			Static268.anInt5370 = 0;
		}
		Static342.anInt6527 = Static246.anInt5043 - Static328.anInt6272;
		if (Static342.anInt6527 < 0) {
			Static149.anInt3924 = -Static342.anInt6527;
			Static342.anInt6527 = 0;
		} else {
			Static149.anInt3924 = 0;
		}
		Static17.anInt349 = Static61.anInt1578 + Static328.anInt6272;
		if (Static17.anInt349 > Static198.anInt4128) {
			Static17.anInt349 = Static198.anInt4128;
		}
		Static91.anInt5895 = Static246.anInt5043 + Static328.anInt6272;
		if (Static91.anInt5895 > Static15.anInt1162) {
			Static91.anInt5895 = Static15.anInt1162;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static328.anInt6272 + Static328.anInt6272 + 2; local74++) {
			for (local77 = 0; local77 < Static328.anInt6272 + Static328.anInt6272 + 2; local77++) {
				local84 = Static61.anInt1578 + local74 - Static328.anInt6272;
				local90 = Static246.anInt5043 + local77 - Static328.anInt6272;
				if (local84 >= 0 && local90 >= 0 && local84 < Static198.anInt4128 && local90 < Static15.anInt1162) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static304.aClass60Array3[3].method2264(local84, local90) - 1000;
					@Pc(137) int local137 = Static77.aClass60Array1 == null ? Static304.aClass60Array3[0].method2264(local84, local90) + 128 : Static77.aClass60Array1[0].method2264(local84, local90) + 128;
					Static229.aBooleanArrayArray6[local74][local77] = Static170.aClass47_5.method2684(local104, local117, local108, local104, local137, local108);
				} else {
					Static229.aBooleanArrayArray6[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static328.anInt6272 + Static328.anInt6272 + 1; local77++) {
			for (local84 = 0; local84 < Static328.anInt6272 + Static328.anInt6272 + 1; local84++) {
				Static339.aBooleanArrayArray2[local77][local84] = Static229.aBooleanArrayArray6[local77][local84] || Static229.aBooleanArrayArray6[local77 + 1][local84] || Static229.aBooleanArrayArray6[local77][local84 + 1] || Static229.aBooleanArrayArray6[local77 + 1][local84 + 1];
			}
		}
		Static134.anIntArray269 = arg8;
		Static69.anIntArray100 = arg9;
		Static304.anIntArray467 = arg10;
		Static128.anIntArray264 = arg11;
		Static317.anIntArray479 = arg12;
		Static243.method5094();
		Static349.method5548();
		for (@Pc(253) Class2_Sub2 local253 = (Class2_Sub2) Static151.aClass32_5.method850(); local253 != null; local253 = (Class2_Sub2) Static151.aClass32_5.method846()) {
			local253.method5419();
			Static36.method743(local253);
		}
		if (Static308.aBoolean444) {
			for (local90 = 0; local90 < Static201.anInt4146; local90++) {
				Static25.aClass4_Sub33_Sub1Array1[local90].method4563(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static170.aClass47_5.method2755(0);
			if (Static57.aClass45_1 == null || Static57.aClass45_1 instanceof Class45_Sub2) {
				Static57.aClass45_1 = new Class45_Sub1();
			}
		} else if (Static57.aClass45_1 == null || Static57.aClass45_1 instanceof Class45_Sub1) {
			Static57.aClass45_1 = new Class45_Sub2();
		}
		Static57.aClass45_1.method3938(arg2);
		Static57.aClass45_1.method3950();
		if (Static24.aClass128ArrayArrayArray2 != null) {
			Static58.method1231(true);
			Static57.aClass45_1.method3951(22);
			Static117.method2451(arg2, null, 0, (byte) 0, arg15, arg16);
			Static57.aClass45_1.method3950();
			Static57.aClass45_1.method3951(23);
			Static58.method1231(false);
		}
		Static117.method2451(arg2, arg7, arg13, arg14, arg15, arg16);
		Static57.aClass45_1.method3950();
		Static57.aClass45_1.method3946();
		Static57.aClass45_1.method3950();
		if (arg2 > 1) {
			Static170.aClass47_5.method2744(0);
		}
		Static170.aClass47_5.method2716(0, null);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(II)V")
	public static void method4656(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub4_Sub18 local8 = Static302.method4961(arg0, 16);
		local8.method4902();
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(ZLclient!lf;)V")
	public static void method4657(@OriginalArg(1) Class4_Sub11 arg0) {
		@Pc(9) int local9 = arg0.method3457();
		Static220.aClass144Array2 = new Class144[local9];
		for (@Pc(14) int local14 = 0; local14 < local9; local14++) {
			Static220.aClass144Array2[local14] = new Class144();
			Static220.aClass144Array2[local14].anInt4455 = arg0.method3457();
			Static220.aClass144Array2[local14].aString52 = arg0.method3404();
		}
		Static140.anInt3220 = arg0.method3457();
		Static77.anInt2071 = arg0.method3457();
		Static210.anInt4363 = arg0.method3457();
		Static223.aClass10_Sub1Array2 = new Class10_Sub1[Static77.anInt2071 + 1 - Static140.anInt3220];
		for (@Pc(68) int local68 = 0; local68 < Static210.anInt4363; local68++) {
			@Pc(74) int local74 = arg0.method3457();
			@Pc(82) Class10_Sub1 local82 = Static223.aClass10_Sub1Array2[local74] = new Class10_Sub1();
			local82.anInt265 = arg0.method3440();
			local82.anInt258 = arg0.method3418();
			local82.anInt274 = Static140.anInt3220 + local74;
			local82.aString3 = arg0.method3404();
			local82.aString2 = arg0.method3404();
		}
		Static129.anInt3037 = arg0.method3418();
		Static2.aBoolean7 = true;
	}
}
