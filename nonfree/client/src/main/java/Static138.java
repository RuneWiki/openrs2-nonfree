import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!gn", name = "F", descriptor = "Lclient!wk;")
	public static Class268 aClass268_4;

	@OriginalMember(owner = "client!gn", name = "G", descriptor = "Lclient!la;")
	public static Class23 aClass23_2;

	@OriginalMember(owner = "client!gn", name = "I", descriptor = "I")
	public static int anInt2465;

	@OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
	public static int anInt2467 = 0;

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!za;IILclient!c;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method1986(@OriginalArg(0) Class200 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class29 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static293.aClass200_5 = arg0;
		Static81.anInt1473 = arg1;
		Static36.aClass29_1 = arg3;
		Static272.aBoolean285 = Static293.aClass200_5.method5852() > 0;
		Static448.anInt7370 = arg4 >> Static419.anInt6980;
		Static17.anInt369 = arg6 >> Static419.anInt6980;
		Static267.anInt4663 = arg4;
		Static109.anInt1835 = arg6;
		Static379.anInt4380 = arg5;
		Static415.anInt6927 = Static448.anInt7370 - Static70.anInt1271;
		if (Static415.anInt6927 < 0) {
			Static462.anInt7543 = -Static415.anInt6927;
			Static415.anInt6927 = 0;
		} else {
			Static462.anInt7543 = 0;
		}
		Static401.anInt2163 = Static17.anInt369 - Static70.anInt1271;
		if (Static401.anInt2163 < 0) {
			Static203.anInt3353 = -Static401.anInt2163;
			Static401.anInt2163 = 0;
		} else {
			Static203.anInt3353 = 0;
		}
		Static150.anInt2696 = Static448.anInt7370 + Static70.anInt1271;
		if (Static150.anInt2696 > Static439.anInt7318) {
			Static150.anInt2696 = Static439.anInt7318;
		}
		Static182.anInt3095 = Static17.anInt369 + Static70.anInt1271;
		if (Static182.anInt3095 > Static459.anInt4775) {
			Static182.anInt3095 = Static459.anInt4775;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static70.anInt1271 + Static70.anInt1271 + 2; local74++) {
			for (local77 = 0; local77 < Static70.anInt1271 + Static70.anInt1271 + 2; local77++) {
				local84 = Static448.anInt7370 + local74 - Static70.anInt1271;
				local90 = Static17.anInt369 + local77 - Static70.anInt1271;
				if (local84 >= 0 && local90 >= 0 && local84 < Static439.anInt7318 && local90 < Static459.anInt4775) {
					@Pc(104) int local104 = local84 << Static419.anInt6980;
					@Pc(108) int local108 = local90 << Static419.anInt6980;
					@Pc(124) int local124 = Static110.aClass125Array1[Static110.aClass125Array1.length - 1].ua(local84, local90) - (0x3E8 << Static419.anInt6980 - 7);
					@Pc(144) int local144 = Static408.aClass125Array2 == null ? Static110.aClass125Array1[0].ua(local84, local90) + Static92.anInt1592 : Static408.aClass125Array2[0].ua(local84, local90) + Static92.anInt1592;
					Static37.aBooleanArrayArray1[local74][local77] = Static293.aClass200_5.VA(local104, local124, local108, local104, local144, local108);
				} else {
					Static37.aBooleanArrayArray1[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static70.anInt1271 + Static70.anInt1271 + 1; local77++) {
			for (local84 = 0; local84 < Static70.anInt1271 + Static70.anInt1271 + 1; local84++) {
				Static309.aBooleanArrayArray6[local77][local84] = Static37.aBooleanArrayArray1[local77][local84] || Static37.aBooleanArrayArray1[local77 + 1][local84] || Static37.aBooleanArrayArray1[local77][local84 + 1] || Static37.aBooleanArrayArray1[local77 + 1][local84 + 1];
			}
		}
		Static428.anIntArray484 = arg8;
		Static454.anIntArray502 = arg9;
		Static170.anIntArray161 = arg10;
		Static111.anIntArray89 = arg11;
		Static457.anIntArray512 = arg12;
		Static442.method5810();
		Static170.method2357();
		for (@Pc(260) Class88_Sub2 local260 = (Class88_Sub2) Static322.aClass107_10.method2326(); local260 != null; local260 = (Class88_Sub2) Static322.aClass107_10.method2327()) {
			local260.method5917();
			Static434.method5735(local260);
		}
		if (Static272.aBoolean285) {
			for (local90 = 0; local90 < Static70.anInt1276; local90++) {
				Static68.aClass111Array1[local90].method2359(arg1, arg17);
			}
		}
		if (arg2 > 1) {
			Static293.aClass200_5.method5848(0);
			if (Static449.aClass77_1 == null || Static449.aClass77_1 instanceof Class77_Sub2) {
				Static449.aClass77_1 = new Class77_Sub1();
			}
		} else if (Static449.aClass77_1 == null || Static449.aClass77_1 instanceof Class77_Sub1) {
			Static449.aClass77_1 = new Class77_Sub2();
		}
		Static449.aClass77_1.method2860(arg2);
		Static449.aClass77_1.method2849();
		if (Static102.aClass258ArrayArrayArray1 != null) {
			Static423.method5618(true);
			Static449.aClass77_1.method2859(22);
			Static106.method5684(arg2, null, 0, (byte) 0, arg15, arg16);
			Static449.aClass77_1.method2849();
			Static449.aClass77_1.method2859(23);
			Static423.method5618(false);
		}
		Static106.method5684(arg2, arg7, arg13, arg14, arg15, arg16);
		Static449.aClass77_1.method2849();
		Static449.aClass77_1.method2861();
		Static449.aClass77_1.method2849();
		if (arg2 > 1) {
			Static293.aClass200_5.method5838(0);
		}
		Static293.aClass200_5.method5846(0, null);
	}
}
