import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
	public static int anInt3379;

	@OriginalMember(owner = "client!jv", name = "e", descriptor = "I")
	public static int anInt3382;

	@OriginalMember(owner = "client!jv", name = "b", descriptor = "Lclient!ew;")
	public static final Class72 aClass72_21 = new Class72(64);

	@OriginalMember(owner = "client!jv", name = "h", descriptor = "I")
	public static int anInt3383 = -1;

	@OriginalMember(owner = "client!jv", name = "i", descriptor = "[Lclient!wh;")
	public static final Class2_Sub5_Sub18[] aClass2_Sub5_Sub18Array2 = new Class2_Sub5_Sub18[14];

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(Lclient!za;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method2691(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static307.aClass163_7 = arg0;
		Static132.anInt2386 = arg1;
		Static40.aClass31_1 = arg3;
		Static348.aBoolean433 = Static307.aClass163_7.method5553() > 0;
		Static352.anInt5986 = arg4 >> Static460.anInt7074;
		Static411.anInt6740 = arg6 >> Static460.anInt7074;
		Static375.anInt6251 = arg4;
		Static422.anInt6875 = arg6;
		Static445.anInt7139 = arg5;
		Static267.anInt4409 = Static352.anInt5986 - Static453.anInt7270;
		if (Static267.anInt4409 < 0) {
			Static298.anInt168 = -Static267.anInt4409;
			Static267.anInt4409 = 0;
		} else {
			Static298.anInt168 = 0;
		}
		Static92.anInt1788 = Static411.anInt6740 - Static453.anInt7270;
		if (Static92.anInt1788 < 0) {
			Static45.anInt813 = -Static92.anInt1788;
			Static92.anInt1788 = 0;
		} else {
			Static45.anInt813 = 0;
		}
		Static232.anInt3747 = Static352.anInt5986 + Static453.anInt7270;
		if (Static232.anInt3747 > Static169.anInt2876) {
			Static232.anInt3747 = Static169.anInt2876;
		}
		Static231.anInt3738 = Static411.anInt6740 + Static453.anInt7270;
		if (Static231.anInt3738 > Static316.anInt5459) {
			Static231.anInt3738 = Static316.anInt5459;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static453.anInt7270 + Static453.anInt7270 + 2; local74++) {
			for (local77 = 0; local77 < Static453.anInt7270 + Static453.anInt7270 + 2; local77++) {
				local84 = Static352.anInt5986 + local74 - Static453.anInt7270;
				local90 = Static411.anInt6740 + local77 - Static453.anInt7270;
				if (local84 >= 0 && local90 >= 0 && local84 < Static169.anInt2876 && local90 < Static316.anInt5459) {
					@Pc(104) int local104 = local84 << Static460.anInt7074;
					@Pc(108) int local108 = local90 << Static460.anInt7074;
					@Pc(124) int local124 = Static314.aClass162Array2[Static314.aClass162Array2.length - 1].ua(local84, local90) - (0x3E8 << Static460.anInt7074 - 7);
					@Pc(144) int local144 = Static109.aClass162Array1 == null ? Static314.aClass162Array2[0].ua(local84, local90) + Static67.anInt1221 : Static109.aClass162Array1[0].ua(local84, local90) + Static67.anInt1221;
					Static19.aBooleanArrayArray1[local74][local77] = Static307.aClass163_7.VA(local104, local124, local108, local104, local144, local108);
				} else {
					Static19.aBooleanArrayArray1[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static453.anInt7270 + Static453.anInt7270 + 1; local77++) {
			for (local84 = 0; local84 < Static453.anInt7270 + Static453.anInt7270 + 1; local84++) {
				Static356.aBooleanArrayArray6[local77][local84] = Static19.aBooleanArrayArray1[local77][local84] || Static19.aBooleanArrayArray1[local77 + 1][local84] || Static19.aBooleanArrayArray1[local77][local84 + 1] || Static19.aBooleanArrayArray1[local77 + 1][local84 + 1];
			}
		}
		Static400.anIntArray550 = arg8;
		Static330.anIntArray483 = arg9;
		Static130.anIntArray183 = arg10;
		Static103.anIntArray142 = arg11;
		Static408.anIntArray645 = arg12;
		Static433.method5452();
		Static354.method4725();
		for (@Pc(260) Class21_Sub6 local260 = (Class21_Sub6) Static212.aClass93_3.method2080(); local260 != null; local260 = (Class21_Sub6) Static212.aClass93_3.method2081()) {
			local260.method5593();
			Static31.method463(local260);
		}
		if (Static348.aBoolean433) {
			for (local90 = 0; local90 < Static312.anInt5377; local90++) {
				Static210.aClass250Array1[local90].method5250(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static307.aClass163_7.method5496(0);
			if (Static460.aClass45_4 == null || Static460.aClass45_4 instanceof Class45_Sub1) {
				Static460.aClass45_4 = new Class45_Sub2();
			}
		} else if (Static460.aClass45_4 == null || Static460.aClass45_4 instanceof Class45_Sub2) {
			Static460.aClass45_4 = new Class45_Sub1();
		}
		Static460.aClass45_4.method5056(arg2);
		Static460.aClass45_4.method5059();
		if (Static65.aClass270ArrayArrayArray1 != null) {
			Static56.method816(true);
			Static460.aClass45_4.method5054(22);
			Static129.method1932(arg2, null, 0, (byte) 0, arg15, arg16);
			Static460.aClass45_4.method5059();
			Static460.aClass45_4.method5054(23);
			Static56.method816(false);
		}
		Static129.method1932(arg2, arg7, arg13, arg14, arg15, arg16);
		Static460.aClass45_4.method5059();
		Static460.aClass45_4.method5057();
		Static460.aClass45_4.method5059();
		if (arg2 > 1) {
			Static307.aClass163_7.method5547(0);
		}
		Static307.aClass163_7.method5536(0, null);
	}
}
