import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	public static int anInt22;

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Ljava/math/BigInteger;")
	public static final BigInteger aBigInteger1 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_14 = Static161.method2452("Close");

	@OriginalMember(owner = "client!ab", name = "f", descriptor = "Lclient!dc;")
	public static Class20 aClass20_9 = aClass20_14;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public static int anInt20 = 0;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_10 = Static161.method2452("M");

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!dc;")
	public static Class20 aClass20_11 = aClass20_10;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_12 = Static161.method2452("Bitte geben Sie Ihr Passwort ein)3");

	@OriginalMember(owner = "client!ab", name = "k", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_13 = Static161.method2452(":duelfriend:");

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public static int anInt21 = 0;

	@OriginalMember(owner = "client!ab", name = "q", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_17 = Static161.method2452("Bad session id)3");

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Lclient!dc;")
	public static Class20 aClass20_15 = aClass20_17;

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "Lclient!dc;")
	public static Class20 aClass20_16 = aClass20_10;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIZLclient!mf;I)V")
	public static void method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class69 arg2, @OriginalArg(4) int arg3) {
		Static95.method1546();
		Static42.method812(arg3, arg0, arg2.anInt2541 + arg3, arg2.anInt2471 + arg0);
		if (Static211.anInt4102 == 2 || Static211.anInt4102 == 5) {
			Static42.method818(arg3, arg0, arg2.anIntArray280, arg2.anIntArray282);
		} else {
			@Pc(38) int local38 = Static72.anInt1568 + Static79.anInt1777 & 0x7FF;
			@Pc(46) int local46 = 464 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
			@Pc(53) int local53 = Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32 + 48;
			((Class5_Sub2_Sub10_Sub1) Static104.aClass5_Sub2_Sub10_4).method2431(arg3, arg0, arg2.anInt2541, arg2.anInt2471, local53, local46, local38, Static109.anInt2292 + 256, arg2.anIntArray280, arg2.anIntArray282);
			@Pc(91) int local91;
			@Pc(105) int local105;
			for (@Pc(75) int local75 = 0; local75 < Static205.anInt4067; local75++) {
				local91 = Static207.anIntArray422[local75] * 4 + 2 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
				local105 = Static134.anIntArray303[local75] * 4 + 2 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
				@Pc(111) Class5_Sub2_Sub7 local111 = Static63.method1046(Static80.anIntArray176[local75]);
				if (local111.anIntArray35 != null) {
					local111 = local111.method431();
					if (local111 == null || local111.anInt516 == -1) {
						continue;
					}
				}
				Static12.method228(arg2, arg0, local105, local91, Static98.aClass5_Sub2_Sub10Array8[local111.anInt516], arg3);
			}
			@Pc(175) int local175;
			for (local91 = 0; local91 < 104; local91++) {
				for (local105 = 0; local105 < 104; local105++) {
					@Pc(161) Class91 local161 = Static159.aClass91ArrayArrayArray1[Static111.anInt2327][local91][local105];
					if (local161 != null) {
						local175 = local105 * 4 + 2 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
						@Pc(187) int local187 = local91 * 4 + 2 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
						Static12.method228(arg2, arg0, local175, local187, Static31.aClass5_Sub2_Sub10Array4[0], arg3);
					}
				}
			}
			@Pc(252) int local252;
			for (local105 = 0; local105 < Static83.anInt1850; local105++) {
				@Pc(215) Class1_Sub2_Sub1 local215 = Static61.aClass1_Sub2_Sub1Array1[Static80.anIntArray175[local105]];
				if (local215 != null && local215.method1741()) {
					@Pc(224) Class5_Sub2_Sub20 local224 = local215.aClass5_Sub2_Sub20_1;
					if (local224 != null && local224.anIntArray373 != null) {
						local224 = local224.method2717();
					}
					if (local224 != null && local224.aBoolean163 && local224.aBoolean165) {
						local252 = local215.anInt2234 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
						local175 = local215.anInt2241 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
						Static12.method228(arg2, arg0, local252, local175, Static31.aClass5_Sub2_Sub10Array4[1], arg3);
					}
				}
			}
			for (@Pc(282) int local282 = 0; local282 < Static66.anInt1444; local282++) {
				@Pc(290) Class1_Sub2_Sub2 local290 = Static6.aClass1_Sub2_Sub2Array1[Static7.anIntArray13[local282]];
				if (local290 != null && local290.method1741()) {
					local175 = local290.anInt2241 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
					@Pc(309) boolean local309 = false;
					local252 = local290.anInt2234 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
					@Pc(325) long local325 = local290.aClass20_848.method595();
					for (@Pc(327) int local327 = 0; local327 < Static91.anInt1957; local327++) {
						if (local325 == Static129.aLongArray29[local327] && Static142.anIntArray315[local327] != 0) {
							local309 = true;
							break;
						}
					}
					@Pc(352) boolean local352 = false;
					if (Static210.aClass1_Sub2_Sub2_2.anInt2284 != 0 && local290.anInt2284 != 0 && local290.anInt2284 == Static210.aClass1_Sub2_Sub2_2.anInt2284) {
						local352 = true;
					}
					if (local309) {
						Static12.method228(arg2, arg0, local252, local175, Static31.aClass5_Sub2_Sub10Array4[3], arg3);
					} else if (local352) {
						Static12.method228(arg2, arg0, local252, local175, Static31.aClass5_Sub2_Sub10Array4[4], arg3);
					} else {
						Static12.method228(arg2, arg0, local252, local175, Static31.aClass5_Sub2_Sub10Array4[2], arg3);
					}
				}
			}
			@Pc(417) Class14[] local417 = Static218.aClass14Array1;
			@Pc(517) int local517;
			for (local175 = 0; local175 < local417.length; local175++) {
				@Pc(425) Class14 local425 = local417[local175];
				if (local425 != null && local425.anInt394 != 0 && Static177.anInt3533 % 20 < 10) {
					@Pc(477) int local477;
					@Pc(488) int local488;
					if (local425.anInt394 == 1 && local425.anInt399 >= 0 && Static61.aClass1_Sub2_Sub1Array1.length > local425.anInt399) {
						@Pc(464) Class1_Sub2_Sub1 local464 = Static61.aClass1_Sub2_Sub1Array1[local425.anInt399];
						if (local464 != null) {
							local477 = local464.anInt2234 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
							local488 = local464.anInt2241 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
							Static60.method1018(arg2, arg0, local477, local488, arg3, local425.anInt396);
						}
					}
					if (local425.anInt394 == 2) {
						local517 = (local425.anInt401 - Static86.anInt1895) * 4 + 2 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
						local488 = (-Static110.anInt2295 + local425.anInt402) * 4 + 2 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
						Static60.method1018(arg2, arg0, local488, local517, arg3, local425.anInt396);
					}
					if (local425.anInt394 == 10 && local425.anInt399 >= 0 && Static6.aClass1_Sub2_Sub2Array1.length > local425.anInt399) {
						@Pc(566) Class1_Sub2_Sub2 local566 = Static6.aClass1_Sub2_Sub2Array1[local425.anInt399];
						if (local566 != null) {
							local477 = local566.anInt2234 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
							local488 = local566.anInt2241 / 32 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
							Static60.method1018(arg2, arg0, local477, local488, arg3, local425.anInt396);
						}
					}
				}
			}
			if (Static166.anInt3320 != 0) {
				local252 = Static166.anInt3320 * 4 + 2 - Static210.aClass1_Sub2_Sub2_2.anInt2241 / 32;
				local517 = Static169.anInt3386 * 4 + 2 - Static210.aClass1_Sub2_Sub2_2.anInt2234 / 32;
				Static12.method228(arg2, arg0, local517, local252, Static201.aClass5_Sub2_Sub10_3, arg3);
			}
			Static42.method824(arg2.anInt2541 / 2 + arg3 - 1, arg0 + (arg2.anInt2471 / 2 - 1), 3, 3, 16777215);
		}
		Static75.aBooleanArray17[arg1] = true;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!ce;ILclient!bi;)V")
	public static void method45(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub6 arg1, @OriginalArg(3) Class12 arg2) {
		@Pc(17) Class5_Sub27 local17 = new Class5_Sub27();
		local17.anInt4224 = arg1.method3062();
		local17.anInt4222 = arg1.method3073();
		local17.aClass65Array1 = new Class65[local17.anInt4224];
		local17.aByteArrayArrayArray16 = new byte[local17.anInt4224][][];
		local17.anIntArray429 = new int[local17.anInt4224];
		local17.aClass65Array2 = new Class65[local17.anInt4224];
		local17.anIntArray432 = new int[local17.anInt4224];
		local17.anIntArray430 = new int[local17.anInt4224];
		for (@Pc(59) int local59 = 0; local59 < local17.anInt4224; local59++) {
			try {
				@Pc(65) int local65 = arg1.method3062();
				@Pc(95) String local95;
				@Pc(104) String local104;
				@Pc(108) int local108;
				if (local65 == 0 || local65 == 1 || local65 == 2) {
					local95 = new String(arg1.method3027().method558());
					local108 = 0;
					local104 = new String(arg1.method3027().method558());
					if (local65 == 1) {
						local108 = arg1.method3073();
					}
					local17.anIntArray432[local59] = local65;
					local17.anIntArray429[local59] = local108;
					local17.aClass65Array2[local59] = arg2.method300(Static214.method3154(local95), local104);
				} else if (local65 == 3 || local65 == 4) {
					local95 = new String(arg1.method3027().method558());
					local104 = new String(arg1.method3027().method558());
					local108 = arg1.method3062();
					@Pc(111) String[] local111 = new String[local108];
					for (@Pc(113) int local113 = 0; local113 < local108; local113++) {
						local111[local113] = new String(arg1.method3027().method558());
					}
					@Pc(133) byte[][] local133 = new byte[local108][];
					@Pc(144) int local144;
					if (local65 == 3) {
						for (@Pc(138) int local138 = 0; local138 < local108; local138++) {
							local144 = arg1.method3073();
							local133[local138] = new byte[local144];
							arg1.method3051(local144, local133[local138]);
						}
					}
					local17.anIntArray432[local59] = local65;
					@Pc(169) Class[] local169 = new Class[local108];
					for (local144 = 0; local144 < local108; local144++) {
						local169[local144] = Static214.method3154(local111[local144]);
					}
					local17.aClass65Array1[local59] = arg2.method299(local104, local169, Static214.method3154(local95));
					local17.aByteArrayArrayArray16[local59] = local133;
				}
			} catch (@Pc(260) ClassNotFoundException local260) {
				local17.anIntArray430[local59] = -1;
			} catch (@Pc(267) SecurityException local267) {
				local17.anIntArray430[local59] = -2;
			} catch (@Pc(274) NullPointerException local274) {
				local17.anIntArray430[local59] = -3;
			} catch (@Pc(281) Exception local281) {
				local17.anIntArray430[local59] = -4;
			} catch (@Pc(288) Throwable local288) {
				local17.anIntArray430[local59] = -5;
			}
		}
		Static143.aClass91_13.method2686(local17);
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!dc;I)V")
	public static void method46(@OriginalArg(0) Class20 arg0) {
		if (Static8.aClass12_1.anApplet1 == null) {
			return;
		}
		try {
			@Pc(15) Class20 local15 = Static148.aClass20_1154.method583(Static8.aClass12_1.anApplet1);
			@Pc(23) Class20 local23 = Static165.aClass20_844.method583(Static8.aClass12_1.anApplet1);
			@Pc(48) Class20 local48 = Static70.method1166(new Class20[] { local15, Static37.aClass20_469, arg0, Static178.aClass20_1307, local23 });
			if (arg0.method582() == 0) {
				local48 = Static70.method1166(new Class20[] { local48, Static194.aClass20_1423 });
			} else {
				local48 = Static70.method1166(new Class20[] { local48, Static71.aClass20_525, Static111.method1770(Static188.method2822() + 94608000000L), Static13.aClass20_1461, Static153.method2327(94608000L) });
			}
			Static70.method1166(new Class20[] { Static130.aClass20_987, local48, Static12.aClass20_129 }).method554(Static8.aClass12_1.anApplet1);
		} catch (@Pc(124) Throwable local124) {
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IJ)V")
	public static void method47(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static50.anInt1082 >= 100) {
			Static189.method2824(0, Static29.aClass20_221, Static215.aClass20_1545);
			return;
		}
		@Pc(29) Class20 local29 = Static160.method2438(arg0).method565();
		for (@Pc(31) int local31 = 0; local31 < Static50.anInt1082; local31++) {
			if (arg0 == Static168.aLongArray39[local31]) {
				Static189.method2824(0, Static70.method1166(new Class20[] { local29, Static154.aClass20_1169 }), Static215.aClass20_1545);
				return;
			}
		}
		for (@Pc(66) int local66 = 0; local66 < Static91.anInt1957; local66++) {
			if (arg0 == Static129.aLongArray29[local66]) {
				Static189.method2824(0, Static70.method1166(new Class20[] { Static134.aClass20_1017, local29, Static106.aClass20_815 }), Static215.aClass20_1545);
				return;
			}
		}
		if (local29.method594(Static210.aClass1_Sub2_Sub2_2.aClass20_848)) {
			Static189.method2824(0, Static91.aClass20_722, Static215.aClass20_1545);
			return;
		}
		Static168.aLongArray39[Static50.anInt1082] = arg0;
		Static114.aClass20Array4[Static50.anInt1082++] = Static160.method2438(arg0);
		Static148.anInt3054 = Static98.anInt2085;
		Static43.aClass5_Sub6_Sub1_2.method3087(137);
		Static43.aClass5_Sub6_Sub1_2.method3037(arg0);
	}
}
