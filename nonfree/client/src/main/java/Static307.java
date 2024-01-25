import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static307 {

	@OriginalMember(owner = "client!tf", name = "eb", descriptor = "Lclient!ij;")
	public static Class93 aClass93_118;

	@OriginalMember(owner = "client!tf", name = "fb", descriptor = "[I")
	public static int[] anIntArray587;

	@OriginalMember(owner = "client!tf", name = "hb", descriptor = "I")
	public static int anInt5993 = 0;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ea;IILclient!ve;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method5380(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class66 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static42.aClass55_3 = arg0;
		Static176.anInt3503 = arg1;
		Static24.aClass66_6 = arg3;
		Static115.aBoolean163 = Static42.aClass55_3.method5207() > 0;
		Static66.anInt5817 = arg4 >> 7;
		Static150.anInt2937 = arg6 >> 7;
		Static300.anInt5860 = arg4;
		Static168.anInt3377 = arg6;
		Static35.anInt651 = arg5;
		Static329.anInt6378 = Static66.anInt5817 - Static257.anInt5067;
		if (Static329.anInt6378 < 0) {
			Static310.anInt6638 = -Static329.anInt6378;
			Static329.anInt6378 = 0;
		} else {
			Static310.anInt6638 = 0;
		}
		Static12.anInt3796 = Static150.anInt2937 - Static257.anInt5067;
		if (Static12.anInt3796 < 0) {
			Static241.anInt4869 = -Static12.anInt3796;
			Static12.anInt3796 = 0;
		} else {
			Static241.anInt4869 = 0;
		}
		Static325.anInt6299 = Static66.anInt5817 + Static257.anInt5067;
		if (Static325.anInt6299 > Static350.anInt6715) {
			Static325.anInt6299 = Static350.anInt6715;
		}
		Static142.anInt2744 = Static150.anInt2937 + Static257.anInt5067;
		if (Static142.anInt2744 > Static236.anInt4222) {
			Static142.anInt2744 = Static236.anInt4222;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static257.anInt5067 + Static257.anInt5067 + 2; local74++) {
			for (local77 = 0; local77 < Static257.anInt5067 + Static257.anInt5067 + 2; local77++) {
				local84 = Static66.anInt5817 + local74 - Static257.anInt5067;
				local90 = Static150.anInt2937 + local77 - Static257.anInt5067;
				if (local84 >= 0 && local90 >= 0 && local84 < Static350.anInt6715 && local90 < Static236.anInt4222) {
					@Pc(104) int local104 = local84 << 7;
					@Pc(108) int local108 = local90 << 7;
					@Pc(117) int local117 = Static56.aClass51Array2[3].method1856(local84, local90) - 1000;
					@Pc(137) int local137 = Static219.aClass51Array3 == null ? Static56.aClass51Array2[0].method1856(local84, local90) + 128 : Static219.aClass51Array3[0].method1856(local84, local90) + 128;
					Static206.aBooleanArrayArray5[local74][local77] = Static42.aClass55_3.method5191(local104, local117, local108, local104, local137, local108);
				} else {
					Static206.aBooleanArrayArray5[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static257.anInt5067 + Static257.anInt5067 + 1; local77++) {
			for (local84 = 0; local84 < Static257.anInt5067 + Static257.anInt5067 + 1; local84++) {
				Static172.aBooleanArrayArray6[local77][local84] = Static206.aBooleanArrayArray5[local77][local84] || Static206.aBooleanArrayArray5[local77 + 1][local84] || Static206.aBooleanArrayArray5[local77][local84 + 1] || Static206.aBooleanArrayArray5[local77 + 1][local84 + 1];
			}
		}
		Static264.anIntArray497 = arg8;
		Static43.anIntArray644 = arg9;
		Static291.anIntArray550 = arg10;
		Static348.anIntArray632 = arg11;
		Static2.anIntArray125 = arg12;
		Static247.method4422();
		Static21.method434();
		for (@Pc(253) Class32_Sub4 local253 = (Class32_Sub4) Static70.aClass39_1.method806(); local253 != null; local253 = (Class32_Sub4) Static70.aClass39_1.method808()) {
			local253.method5578();
			Static1.method7(local253);
		}
		if (Static115.aBoolean163) {
			for (local90 = 0; local90 < Static303.anInt5904; local90++) {
				Static182.aClass5_Sub9_Sub1Array2[local90].method630(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static42.aClass55_3.method5257(0);
			if (Static136.aClass91_1 == null || Static136.aClass91_1 instanceof Class91_Sub2) {
				Static136.aClass91_1 = new Class91_Sub1();
			}
		} else if (Static136.aClass91_1 == null || Static136.aClass91_1 instanceof Class91_Sub1) {
			Static136.aClass91_1 = new Class91_Sub2();
		}
		Static136.aClass91_1.method3913(arg2);
		Static136.aClass91_1.method3916();
		if (Static52.aClass174ArrayArrayArray1 != null) {
			Static198.method3495(true);
			Static136.aClass91_1.method3919(22);
			Static272.method4786(arg2, null, 0, (byte) 0, arg15, arg16);
			Static136.aClass91_1.method3916();
			Static136.aClass91_1.method3919(23);
			Static198.method3495(false);
		}
		Static272.method4786(arg2, arg7, arg13, arg14, arg15, arg16);
		Static136.aClass91_1.method3916();
		Static136.aClass91_1.method3912();
		Static136.aClass91_1.method3916();
		if (arg2 > 1) {
			Static42.aClass55_3.method5255(0);
		}
		Static42.aClass55_3.method5172(0, null);
	}
}
