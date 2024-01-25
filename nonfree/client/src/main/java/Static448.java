import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static448 {

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
	public static int anInt7802;

	@OriginalMember(owner = "client!wp", name = "E", descriptor = "[Z")
	public static boolean[] aBooleanArray54;

	@OriginalMember(owner = "client!wp", name = "B", descriptor = "[I")
	public static final int[] anIntArray512 = new int[] { 32, 39, 44, 47 };

	@OriginalMember(owner = "client!wp", name = "T", descriptor = "[F")
	public static final float[] aFloatArray34 = new float[4];

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(IC)C")
	public static char method6047(@OriginalArg(1) char arg0) {
		if (arg0 == 'Æ') {
			return 'E';
		} else if (arg0 == 'æ') {
			return 'e';
		} else if (arg0 == 'ß') {
			return 's';
		} else if (arg0 == 'Œ') {
			return 'E';
		} else {
			return (char) (arg0 == 'œ' ? 'e' : '\u0000');
		}
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(III)I")
	public static int method6049(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static64.anIntArray88[arg1 & 0x3] : Static282.anIntArray344[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!qa;IILclient!ia;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method6057(@OriginalArg(0) Class26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class102 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static444.aClass26_11 = arg0;
		Static339.anInt5986 = arg1;
		Static181.aClass102_3 = arg3;
		Static193.aBoolean313 = Static444.aClass26_11.method2281() > 0;
		Static249.anInt4746 = arg4 >> Static250.anInt4056;
		Static404.anInt7034 = arg6 >> Static250.anInt4056;
		Static305.anInt1349 = arg4;
		Static49.anInt1358 = arg6;
		Static304.anInt5395 = arg5;
		Static165.anInt6202 = Static249.anInt4746 - Static178.anInt3432;
		if (Static165.anInt6202 < 0) {
			Static355.anInt6284 = -Static165.anInt6202;
			Static165.anInt6202 = 0;
		} else {
			Static355.anInt6284 = 0;
		}
		Static12.anInt315 = Static404.anInt7034 - Static178.anInt3432;
		if (Static12.anInt315 < 0) {
			Static8.anInt260 = -Static12.anInt315;
			Static12.anInt315 = 0;
		} else {
			Static8.anInt260 = 0;
		}
		Static8.anInt266 = Static249.anInt4746 + Static178.anInt3432;
		if (Static8.anInt266 > Static86.anInt2009) {
			Static8.anInt266 = Static86.anInt2009;
		}
		Static257.anInt4830 = Static404.anInt7034 + Static178.anInt3432;
		if (Static257.anInt4830 > Static360.anInt6340) {
			Static257.anInt4830 = Static360.anInt6340;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static178.anInt3432 + Static178.anInt3432 + 2; local74++) {
			for (local77 = 0; local77 < Static178.anInt3432 + Static178.anInt3432 + 2; local77++) {
				local84 = Static249.anInt4746 + local74 - Static178.anInt3432;
				local90 = Static404.anInt7034 + local77 - Static178.anInt3432;
				if (local84 >= 0 && local90 >= 0 && local84 < Static86.anInt2009 && local90 < Static360.anInt6340) {
					@Pc(104) int local104 = local84 << Static250.anInt4056;
					@Pc(108) int local108 = local90 << Static250.anInt4056;
					@Pc(124) int local124 = Static72.aClass106Array4[Static72.aClass106Array4.length - 1].I(local84, local90) - (0x3E8 << Static250.anInt4056 - 7);
					@Pc(144) int local144 = Static77.aClass106Array12 == null ? Static72.aClass106Array4[0].I(local84, local90) + Static284.anInt5177 : Static77.aClass106Array12[0].I(local84, local90) + Static284.anInt5177;
					Static24.aBooleanArrayArray1[local74][local77] = Static444.aClass26_11.SA(local104, local124, local108, local104, local144, local108);
				} else {
					Static24.aBooleanArrayArray1[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static178.anInt3432 + Static178.anInt3432 + 1; local77++) {
			for (local84 = 0; local84 < Static178.anInt3432 + Static178.anInt3432 + 1; local84++) {
				Static348.aBooleanArrayArray7[local77][local84] = Static24.aBooleanArrayArray1[local77][local84] || Static24.aBooleanArrayArray1[local77 + 1][local84] || Static24.aBooleanArrayArray1[local77][local84 + 1] || Static24.aBooleanArrayArray1[local77 + 1][local84 + 1];
			}
		}
		Static412.anIntArray482 = arg8;
		Static60.anIntArray81 = arg9;
		Static349.anIntArray413 = arg10;
		Static395.anIntArray458 = arg11;
		Static347.anIntArray411 = arg12;
		Static373.method905();
		Static172.method2658();
		for (@Pc(260) Class38_Sub3 local260 = (Class38_Sub3) Static346.aClass184_6.method4212(); local260 != null; local260 = (Class38_Sub3) Static346.aClass184_6.method4215()) {
			local260.method5069();
			Static38.method717(local260);
		}
		if (Static193.aBoolean313) {
			for (local90 = 0; local90 < Static149.anInt2847; local90++) {
				Static77.aClass168Array9[local90].method3941(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static444.aClass26_11.method2235(0);
			if (Static151.aClass125_1 == null || Static151.aClass125_1 instanceof Class125_Sub2) {
				Static151.aClass125_1 = new Class125_Sub1();
			}
		} else if (Static151.aClass125_1 == null || Static151.aClass125_1 instanceof Class125_Sub1) {
			Static151.aClass125_1 = new Class125_Sub2();
		}
		Static151.aClass125_1.method2951(arg2);
		Static151.aClass125_1.method2955();
		if (Static3.aClass113ArrayArrayArray1 != null) {
			Static215.method3334(true);
			Static151.aClass125_1.method2948(22);
			Static28.method385(arg2, null, 0, (byte) 0, arg15, arg16);
			Static151.aClass125_1.method2955();
			Static151.aClass125_1.method2948(23);
			Static215.method3334(false);
		}
		Static28.method385(arg2, arg7, arg13, arg14, arg15, arg16);
		Static151.aClass125_1.method2955();
		Static151.aClass125_1.method2947();
		Static151.aClass125_1.method2955();
		if (arg2 > 1) {
			Static444.aClass26_11.method2256(0);
		}
		Static444.aClass26_11.method2265(0, null);
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ILclient!cu;)V")
	public static void method6059(@OriginalArg(1) Class44 arg0) {
		Static98.aClass2_Sub20_Sub1_1.method2498(arg0.method1215());
	}

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(ZZLjava/lang/String;Lclient!js;B)V")
	public static void method6065(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) Class131 arg3) {
		if (!arg0) {
			Static359.method3803(arg3, 3, arg2);
			return;
		}
		@Pc(26) String local26;
		if (Static197.aString29.startsWith("win") && Static197.anInt3816 != 3) {
			local26 = null;
			if (arg3.anApplet1 != null) {
				local26 = arg3.anApplet1.getParameter("haveie6");
			}
			if (local26 == null || !local26.equals("1")) {
				@Pc(46) Class128 local46 = Static359.method3803(arg3, 0, arg2);
				Static20.aString1 = arg2;
				Static176.aClass131_3 = arg3;
				Static173.aClass128_2 = local46;
				return;
			}
		}
		if (Static197.aString29.startsWith("mac")) {
			local26 = null;
			if (arg3.anApplet1 != null) {
				local26 = arg3.anApplet1.getParameter("havefirefox");
			}
			if (local26 != null && local26.equals("1") && arg1) {
				Static359.method3803(arg3, 1, arg2);
				return;
			}
		}
		Static359.method3803(arg3, 2, arg2);
	}
}
