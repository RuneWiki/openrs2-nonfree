import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!bca", name = "v", descriptor = "Lclient!jl;")
	public static Class161 aClass161_1;

	@OriginalMember(owner = "client!bca", name = "x", descriptor = "Lclient!pq;")
	public static Class251 aClass251_7;

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(II)V")
	public static void method417(@OriginalArg(1) int arg0) {
		@Pc(1) Class6_Sub1_Sub12 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class60 local8 = Static34.aClass60Array10[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static164.anInt2881; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static80.anInt1391; local15++) {
						local1 = local8.c(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static188.anInt3275;
							@Pc(32) int local32 = local12 << Static188.anInt3275;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class60 local41 = Static34.aClass60Array10[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.JA(local15, local12) - local41.JA(local15, local12);
									@Pc(67) int local67 = local8.JA(local15 + 1, local12) - local41.JA(local15 + 1, local12);
									@Pc(85) int local85 = local8.JA(local15 + 1, local12 + 1) - local41.JA(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.JA(local15, local12 + 1) - local41.JA(local15, local12 + 1);
									local41.aa(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lclient!oa;IILclient!q;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method418(@OriginalArg(0) Class121 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class34 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static432.aClass121_14 = arg0;
		Static512.anInt8659 = arg1;
		Static565.aClass34_11 = arg3;
		Static164.aBoolean192 = Static432.aClass121_14.method7085() > 0;
		Static325.anInt5850 = arg4 >> Static188.anInt3275;
		Static486.anInt8128 = arg6 >> Static188.anInt3275;
		Static135.anInt2375 = arg4;
		Static163.anInt2862 = arg6;
		Static382.anInt6590 = arg5;
		Static264.anInt4353 = Static325.anInt5850 - Static387.anInt6907;
		if (Static264.anInt4353 < 0) {
			Static4.anInt86 = -Static264.anInt4353;
			Static264.anInt4353 = 0;
		} else {
			Static4.anInt86 = 0;
		}
		Static69.anInt1154 = Static486.anInt8128 - Static387.anInt6907;
		if (Static69.anInt1154 < 0) {
			Static108.anInt2008 = -Static69.anInt1154;
			Static69.anInt1154 = 0;
		} else {
			Static108.anInt2008 = 0;
		}
		Static312.anInt8640 = Static325.anInt5850 + Static387.anInt6907;
		if (Static312.anInt8640 > Static80.anInt1391) {
			Static312.anInt8640 = Static80.anInt1391;
		}
		Static317.anInt5746 = Static486.anInt8128 + Static387.anInt6907;
		if (Static317.anInt5746 > Static164.anInt2881) {
			Static317.anInt5746 = Static164.anInt2881;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static387.anInt6907 + Static387.anInt6907 + 2; local74++) {
			for (local77 = 0; local77 < Static387.anInt6907 + Static387.anInt6907 + 2; local77++) {
				local84 = Static325.anInt5850 + local74 - Static387.anInt6907;
				local90 = Static486.anInt8128 + local77 - Static387.anInt6907;
				if (local84 >= 0 && local90 >= 0 && local84 < Static80.anInt1391 && local90 < Static164.anInt2881) {
					@Pc(104) int local104 = local84 << Static188.anInt3275;
					@Pc(108) int local108 = local90 << Static188.anInt3275;
					@Pc(124) int local124 = Static34.aClass60Array10[Static34.aClass60Array10.length - 1].JA(local84, local90) - (0x3E8 << Static188.anInt3275 - 7);
					@Pc(144) int local144 = Static127.aClass60Array7 == null ? Static34.aClass60Array10[0].JA(local84, local90) + Static57.anInt953 : Static127.aClass60Array7[0].JA(local84, local90) + Static57.anInt953;
					Static286.aBooleanArrayArray5[local74][local77] = Static432.aClass121_14.FA(local104, local124, local108, local104, local144, local108);
				} else {
					Static286.aBooleanArrayArray5[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static387.anInt6907 + Static387.anInt6907 + 1; local77++) {
			for (local84 = 0; local84 < Static387.anInt6907 + Static387.anInt6907 + 1; local84++) {
				Static6.aBooleanArrayArray3[local77][local84] = Static286.aBooleanArrayArray5[local77][local84] || Static286.aBooleanArrayArray5[local77 + 1][local84] || Static286.aBooleanArrayArray5[local77][local84 + 1] || Static286.aBooleanArrayArray5[local77 + 1][local84 + 1];
			}
		}
		Static237.anIntArray424 = arg8;
		Static287.anIntArray731 = arg9;
		Static194.anIntArray388 = arg10;
		Static512.anIntArray664 = arg11;
		Static409.anIntArray254 = arg12;
		Static519.method7320();
		Static32.method462(Static432.aClass121_14);
		for (@Pc(261) Class102_Sub2 local261 = (Class102_Sub2) Static78.aClass249_1.method5817(); local261 != null; local261 = (Class102_Sub2) Static78.aClass249_1.method5815()) {
			local261.method7587();
			Static290.method4085(local261);
		}
		if (Static164.aBoolean192) {
			for (local90 = 0; local90 < Static164.anInt2888; local90++) {
				Static149.aClass178Array1[local90].method3837(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static432.aClass121_14.method7089(0);
			if (Static325.aClass158_1 == null || Static325.aClass158_1 instanceof Class158_Sub1) {
				Static325.aClass158_1 = new Class158_Sub2();
			}
		} else if (Static325.aClass158_1 == null || Static325.aClass158_1 instanceof Class158_Sub2) {
			Static325.aClass158_1 = new Class158_Sub1();
		}
		Static325.aClass158_1.method5359(arg2);
		Static325.aClass158_1.method5352();
		if (Static177.aClass9ArrayArrayArray2 != null) {
			Static137.method2053(true);
			Static325.aClass158_1.method5351(22);
			Static278.method5539(arg2, null, 0, (byte) 0, arg15, arg16);
			Static325.aClass158_1.method5352();
			Static325.aClass158_1.method5351(23);
			Static137.method2053(false);
		}
		Static278.method5539(arg2, arg7, arg13, arg14, arg15, arg16);
		Static325.aClass158_1.method5352();
		Static325.aClass158_1.method5357();
		Static325.aClass158_1.method5352();
		if (arg2 > 1) {
			Static432.aClass121_14.method7105(0);
		}
		Static432.aClass121_14.method7158(0, null);
	}
}
