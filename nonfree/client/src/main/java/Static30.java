import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bn", name = "d", descriptor = "Lclient!rd;")
	public static final Class211 aClass211_1 = Static292.method4207();

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "Z")
	public static boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIBI)V")
	public static void method535(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (Static12.aClass79_Sub1_1.anInt4920 != 0 && arg3 != 0 && Static66.anInt133 < 50 && arg1 != -1) {
			Static62.aClass218Array1[Static66.anInt133++] = new Class218((byte) 2, arg1, arg3, arg0, arg2, 0);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIII)Z")
	public static boolean method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Interface6 local9 = (Interface6) Static215.method3376(arg1, arg0, arg2);
		@Pc(11) boolean local11 = true;
		if (local9 != null) {
			local11 = Static238.method3679(local9) & true;
		}
		local9 = (Interface6) Static455.method4456(arg1, arg0, arg2, jn.class);
		if (local9 != null) {
			local11 &= Static238.method3679(local9);
		}
		local9 = (Interface6) Static139.method2376(arg1, arg0, arg2);
		if (local9 != null) {
			local11 &= Static238.method3679(local9);
		}
		return local11;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!ya;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method537(@OriginalArg(0) Class49 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class35 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static332.aClass49_10 = arg0;
		Static354.anInt6012 = arg1;
		Static284.aClass35_5 = arg3;
		Static58.aBoolean79 = Static332.aClass49_10.method4433() > 0;
		Static312.anInt5514 = arg4 >> Static307.anInt5425;
		Static402.anInt6690 = arg6 >> Static307.anInt5425;
		Static123.anInt2736 = arg4;
		Static201.anInt3541 = arg6;
		Static125.anInt2740 = arg5;
		Static154.anInt3163 = Static312.anInt5514 - Static182.anInt3568;
		if (Static154.anInt3163 < 0) {
			Static181.anInt3544 = -Static154.anInt3163;
			Static154.anInt3163 = 0;
		} else {
			Static181.anInt3544 = 0;
		}
		Static316.anInt5472 = Static402.anInt6690 - Static182.anInt3568;
		if (Static316.anInt5472 < 0) {
			Static286.anInt5139 = -Static316.anInt5472;
			Static316.anInt5472 = 0;
		} else {
			Static286.anInt5139 = 0;
		}
		Static234.anInt4528 = Static312.anInt5514 + Static182.anInt3568;
		if (Static234.anInt4528 > Static42.anInt4340) {
			Static234.anInt4528 = Static42.anInt4340;
		}
		Static248.anInt4698 = Static402.anInt6690 + Static182.anInt3568;
		if (Static248.anInt4698 > Static386.anInt6463) {
			Static248.anInt4698 = Static386.anInt6463;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static182.anInt3568 + Static182.anInt3568 + 2; local74++) {
			for (local77 = 0; local77 < Static182.anInt3568 + Static182.anInt3568 + 2; local77++) {
				local84 = Static312.anInt5514 + local74 - Static182.anInt3568;
				local90 = Static402.anInt6690 + local77 - Static182.anInt3568;
				if (local84 >= 0 && local90 >= 0 && local84 < Static42.anInt4340 && local90 < Static386.anInt6463) {
					@Pc(104) int local104 = local84 << Static307.anInt5425;
					@Pc(108) int local108 = local90 << Static307.anInt5425;
					@Pc(124) int local124 = Static263.aClass64Array2[Static263.aClass64Array2.length - 1].l(local84, local90) - (0x3E8 << Static307.anInt5425 - 7);
					@Pc(144) int local144 = Static440.aClass64Array3 == null ? Static263.aClass64Array2[0].l(local84, local90) + Static8.anInt242 : Static440.aClass64Array3[0].l(local84, local90) + Static8.anInt242;
					Static223.aBooleanArrayArray19[local74][local77] = Static332.aClass49_10.JA(local104, local124, local108, local104, local144, local108);
				} else {
					Static223.aBooleanArrayArray19[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static182.anInt3568 + Static182.anInt3568 + 1; local77++) {
			for (local84 = 0; local84 < Static182.anInt3568 + Static182.anInt3568 + 1; local84++) {
				Static281.aBooleanArrayArray41[local77][local84] = Static223.aBooleanArrayArray19[local77][local84] || Static223.aBooleanArrayArray19[local77 + 1][local84] || Static223.aBooleanArrayArray19[local77][local84 + 1] || Static223.aBooleanArrayArray19[local77 + 1][local84 + 1];
			}
		}
		Static156.anIntArray283 = arg8;
		Static181.anIntArray311 = arg9;
		Static396.anIntArray557 = arg10;
		Static305.anIntArray440 = arg11;
		Static195.anIntArray330 = arg12;
		Static207.method3270();
		Static243.method3736();
		for (@Pc(260) Class8_Sub5 local260 = (Class8_Sub5) Static222.aClass112_8.method2553(); local260 != null; local260 = (Class8_Sub5) Static222.aClass112_8.method2550()) {
			local260.method5780();
			Static261.method3938(local260);
		}
		if (Static58.aBoolean79) {
			for (local90 = 0; local90 < Static48.anInt963; local90++) {
				Static140.aClass170Array1[local90].method3900(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static332.aClass49_10.method4481(0);
			if (Static260.aClass37_1 == null || Static260.aClass37_1 instanceof Class37_Sub1) {
				Static260.aClass37_1 = new Class37_Sub2();
			}
		} else if (Static260.aClass37_1 == null || Static260.aClass37_1 instanceof Class37_Sub2) {
			Static260.aClass37_1 = new Class37_Sub1();
		}
		Static260.aClass37_1.method5282(arg2);
		Static260.aClass37_1.method5288();
		if (Static79.aClass106ArrayArrayArray1 != null) {
			Static423.method5843(true);
			Static260.aClass37_1.method5283(22);
			Static109.method3957(arg2, null, 0, (byte) 0, arg15, arg16);
			Static260.aClass37_1.method5288();
			Static260.aClass37_1.method5283(23);
			Static423.method5843(false);
		}
		Static109.method3957(arg2, arg7, arg13, arg14, arg15, arg16);
		Static260.aClass37_1.method5288();
		Static260.aClass37_1.method5286();
		Static260.aClass37_1.method5288();
		if (arg2 > 1) {
			Static332.aClass49_10.method4407(0);
		}
		Static332.aClass49_10.method4428(0, null);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IBI)Z")
	public static boolean method538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
