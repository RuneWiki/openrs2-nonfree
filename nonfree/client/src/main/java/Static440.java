import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!wd", name = "p", descriptor = "[Lclient!cu;")
	public static Class43[] aClass43Array1;

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
	public static int anInt7308 = 1;

	@OriginalMember(owner = "client!wd", name = "h", descriptor = "[C")
	public static final char[] aCharArray6 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!qa;IILclient!ia;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method5525(@OriginalArg(0) Class128 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class40 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static257.aClass128_36 = arg0;
		Static418.anInt6791 = arg1;
		Static144.aClass40_3 = arg3;
		Static350.aBoolean478 = Static257.aClass128_36.method3558() > 0;
		Static85.anInt4657 = arg4 >> Static384.anInt6381;
		Static179.anInt2929 = arg6 >> Static384.anInt6381;
		Static332.anInt5443 = arg4;
		Static410.anInt6678 = arg6;
		Static13.anInt264 = arg5;
		Static330.anInt5396 = Static85.anInt4657 - Static317.anInt5269;
		if (Static330.anInt5396 < 0) {
			Static442.anInt7352 = -Static330.anInt5396;
			Static330.anInt5396 = 0;
		} else {
			Static442.anInt7352 = 0;
		}
		Static402.anInt6522 = Static179.anInt2929 - Static317.anInt5269;
		if (Static402.anInt6522 < 0) {
			Static122.anInt2129 = -Static402.anInt6522;
			Static402.anInt6522 = 0;
		} else {
			Static122.anInt2129 = 0;
		}
		Static275.anInt4346 = Static85.anInt4657 + Static317.anInt5269;
		if (Static275.anInt4346 > Static362.anInt6113) {
			Static275.anInt4346 = Static362.anInt6113;
		}
		Static401.anInt3622 = Static179.anInt2929 + Static317.anInt5269;
		if (Static401.anInt3622 > Static195.anInt3127) {
			Static401.anInt3622 = Static195.anInt3127;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static317.anInt5269 + Static317.anInt5269 + 2; local74++) {
			for (local77 = 0; local77 < Static317.anInt5269 + Static317.anInt5269 + 2; local77++) {
				local84 = Static85.anInt4657 + local74 - Static317.anInt5269;
				local90 = Static179.anInt2929 + local77 - Static317.anInt5269;
				if (local84 >= 0 && local90 >= 0 && local84 < Static362.anInt6113 && local90 < Static195.anInt3127) {
					@Pc(104) int local104 = local84 << Static384.anInt6381;
					@Pc(108) int local108 = local90 << Static384.anInt6381;
					@Pc(124) int local124 = Static240.aClass163Array3[Static240.aClass163Array3.length - 1].I(local84, local90) - (0x3E8 << Static384.anInt6381 - 7);
					@Pc(144) int local144 = Static164.aClass163Array1 == null ? Static240.aClass163Array3[0].I(local84, local90) + Static329.anInt5395 : Static164.aClass163Array1[0].I(local84, local90) + Static329.anInt5395;
					Static82.aBooleanArrayArray1[local74][local77] = Static257.aClass128_36.SA(local104, local124, local108, local104, local144, local108);
				} else {
					Static82.aBooleanArrayArray1[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static317.anInt5269 + Static317.anInt5269 + 1; local77++) {
			for (local84 = 0; local84 < Static317.anInt5269 + Static317.anInt5269 + 1; local84++) {
				Static269.aBooleanArrayArray7[local77][local84] = Static82.aBooleanArrayArray1[local77][local84] || Static82.aBooleanArrayArray1[local77 + 1][local84] || Static82.aBooleanArrayArray1[local77][local84 + 1] || Static82.aBooleanArrayArray1[local77 + 1][local84 + 1];
			}
		}
		Static422.anIntArray458 = arg8;
		Static22.anIntArray25 = arg9;
		Static118.anIntArray96 = arg10;
		Static34.anIntArray41 = arg11;
		Static23.anIntArray26 = arg12;
		Static58.method887();
		Static277.method3519();
		for (@Pc(260) Class13_Sub4 local260 = (Class13_Sub4) Static449.aClass227_8.method4827(); local260 != null; local260 = (Class13_Sub4) Static449.aClass227_8.method4834()) {
			local260.method5413();
			Static385.method4925(local260);
		}
		if (Static350.aBoolean478) {
			for (local90 = 0; local90 < Static73.anInt1403; local90++) {
				Static280.aClass71Array1[local90].method1474(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static257.aClass128_36.method3590(0);
			if (Static63.aClass2_1 == null || Static63.aClass2_1 instanceof Class2_Sub1) {
				Static63.aClass2_1 = new Class2_Sub2();
			}
		} else if (Static63.aClass2_1 == null || Static63.aClass2_1 instanceof Class2_Sub2) {
			Static63.aClass2_1 = new Class2_Sub1();
		}
		Static63.aClass2_1.method2556(arg2);
		Static63.aClass2_1.method2561();
		if (Static55.aClass82ArrayArrayArray1 != null) {
			Static80.method1231(true);
			Static63.aClass2_1.method2551(22);
			Static343.method4359(arg2, null, 0, (byte) 0, arg15, arg16);
			Static63.aClass2_1.method2561();
			Static63.aClass2_1.method2551(23);
			Static80.method1231(false);
		}
		Static343.method4359(arg2, arg7, arg13, arg14, arg15, arg16);
		Static63.aClass2_1.method2561();
		Static63.aClass2_1.method2558();
		Static63.aClass2_1.method2561();
		if (arg2 > 1) {
			Static257.aClass128_36.method3592(0);
		}
		Static257.aClass128_36.method3565(0, null);
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B[BIIIII)Z")
	public static boolean method5526(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg2 % 8;
		@Pc(19) int local19;
		if (local9 == 0) {
			local19 = 0;
		} else {
			local19 = 8 - local9;
		}
		@Pc(32) int local32 = -((arg1 + 8 - 1) / 8);
		@Pc(46) int local46 = -((arg2 + 8 - 1) / 8);
		for (@Pc(48) int local48 = local32; local48 < 0; local48++) {
			for (@Pc(52) int local52 = local46; local52 < 0; local52++) {
				if (arg0[arg4] == 0) {
					return true;
				}
				arg4 += 8;
			}
			arg4 -= local19;
			if (arg0[arg4 - 1] == 0) {
				return true;
			}
			arg4 += arg3;
		}
		return false;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZI)V")
	public static void method5528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(11) int local11 = arg0 << 3;
		if (Static100.anInt1781 == 2) {
			Static376.anInt6292 = 0;
			Static401.anInt3623 = local11;
			Static409.anInt6636 = local3;
		}
		Static278.aFloat52 = local11;
		Static95.aFloat27 = local3;
		Static430.method5421();
		Static390.aBoolean526 = true;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V")
	public static void method5531(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub3_Sub13 local12 = Static397.method4998(12, arg1);
		local12.method3459();
		local12.anInt4301 = arg0;
	}
}
