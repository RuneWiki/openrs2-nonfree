import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
	public static int anInt2948;

	@OriginalMember(owner = "client!tb", name = "z", descriptor = "Lclient!ef;")
	public static Class16 aClass16_136;

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "[I")
	public static int[] anIntArray351;

	@OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
	public static int[] anIntArray350 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
	public static int anInt2935 = 0;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
	public static int anInt2946 = 0;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!he;")
	private static Class26 aClass26_1598 = Static6.method100("Too many connections from your address)3");

	@OriginalMember(owner = "client!tb", name = "t", descriptor = "Lclient!sf;")
	public static Class66 aClass66_26 = new Class66(30);

	@OriginalMember(owner = "client!tb", name = "w", descriptor = "Lclient!he;")
	public static Class26 aClass26_1599 = aClass26_1598;

	@OriginalMember(owner = "client!tb", name = "B", descriptor = "Lclient!he;")
	public static Class26 aClass26_1600 = Static6.method100("::errortest");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZB)V")
	public static void method2002(@OriginalArg(0) boolean arg0) {
		Static114.aBoolean166 = arg0;
		@Pc(15) int local15;
		@Pc(23) int local23;
		@Pc(29) int local29;
		@Pc(33) int local33;
		@Pc(65) int local65;
		@Pc(69) int local69;
		@Pc(106) int local106;
		@Pc(129) int local129;
		@Pc(137) int local137;
		@Pc(145) int local145;
		if (!Static114.aBoolean166) {
			local15 = Static33.aClass3_Sub11_Sub1_2.method988();
			local23 = (Static104.anInt2841 - Static33.aClass3_Sub11_Sub1_2.anInt1562) / 16;
			Static38.anIntArrayArray12 = new int[local23][4];
			for (local29 = 0; local29 < local23; local29++) {
				for (local33 = 0; local33 < 4; local33++) {
					Static38.anIntArrayArray12[local29][local33] = Static33.aClass3_Sub11_Sub1_2.method1006();
				}
			}
			local33 = Static33.aClass3_Sub11_Sub1_2.method978();
			local65 = Static33.aClass3_Sub11_Sub1_2.method974();
			local69 = Static33.aClass3_Sub11_Sub1_2.method981();
			@Pc(71) boolean local71 = false;
			if ((local33 / 8 == 48 || local33 / 8 == 49) && local15 / 8 == 48) {
				local71 = true;
			}
			if (local33 / 8 == 48 && local15 / 8 == 148) {
				local71 = true;
			}
			local106 = Static33.aClass3_Sub11_Sub1_2.method974();
			Static33.aByteArrayArray7 = new byte[local23][];
			Static75.anIntArray205 = new int[local23];
			Static133.aByteArrayArray3 = new byte[local23][];
			Static91.anIntArray301 = new int[local23];
			Static101.anIntArray334 = new int[local23];
			local23 = 0;
			for (local129 = (local33 - 6) / 8; local129 <= (local33 + 6) / 8; local129++) {
				for (local137 = (local15 - 6) / 8; local137 <= (local15 + 6) / 8; local137++) {
					local145 = local137 + (local129 << 8);
					if (!local71 || local137 != 49 && local137 != 149 && local137 != 147 && local129 != 50 && (local129 != 49 || local137 != 47)) {
						Static75.anIntArray205[local23] = local145;
						Static91.anIntArray301[local23] = Static42.aClass16_Sub1_6.method574(Static119.method2136(new Class26[] { Static31.aClass26_1482, Static122.method2170(local129), Static2.aClass26_5, Static122.method2170(local137) }));
						Static101.anIntArray334[local23] = Static42.aClass16_Sub1_6.method574(Static119.method2136(new Class26[] { Static23.aClass26_727, Static122.method2170(local129), Static2.aClass26_5, Static122.method2170(local137) }));
						local23++;
					}
				}
			}
			Static75.method1350(local33, local65, local69, local106, local15);
			return;
		}
		local15 = Static33.aClass3_Sub11_Sub1_2.method1000();
		local23 = Static33.aClass3_Sub11_Sub1_2.method1005();
		local29 = Static33.aClass3_Sub11_Sub1_2.method1000();
		local33 = Static33.aClass3_Sub11_Sub1_2.method1000();
		local65 = Static33.aClass3_Sub11_Sub1_2.method988();
		Static33.aClass3_Sub11_Sub1_2.method1036();
		@Pc(298) int local298;
		for (local69 = 0; local69 < 4; local69++) {
			for (local106 = 0; local106 < 13; local106++) {
				for (local298 = 0; local298 < 13; local298++) {
					local129 = Static33.aClass3_Sub11_Sub1_2.method1031(1);
					if (local129 == 1) {
						Static130.anIntArrayArrayArray7[local69][local106][local298] = Static33.aClass3_Sub11_Sub1_2.method1031(26);
					} else {
						Static130.anIntArrayArrayArray7[local69][local106][local298] = -1;
					}
				}
			}
		}
		Static33.aClass3_Sub11_Sub1_2.method1039();
		local106 = (Static104.anInt2841 - Static33.aClass3_Sub11_Sub1_2.anInt1562) / 16;
		Static38.anIntArrayArray12 = new int[local106][4];
		for (local298 = 0; local298 < local106; local298++) {
			for (local129 = 0; local129 < 4; local129++) {
				Static38.anIntArrayArray12[local298][local129] = Static33.aClass3_Sub11_Sub1_2.method984();
			}
		}
		Static75.anIntArray205 = new int[local106];
		Static133.aByteArrayArray3 = new byte[local106][];
		Static91.anIntArray301 = new int[local106];
		Static33.aByteArrayArray7 = new byte[local106][];
		Static101.anIntArray334 = new int[local106];
		local106 = 0;
		for (local129 = 0; local129 < 4; local129++) {
			for (local137 = 0; local137 < 13; local137++) {
				for (local145 = 0; local145 < 13; local145++) {
					@Pc(427) int local427 = Static130.anIntArrayArrayArray7[local129][local137][local145];
					if (local427 != -1) {
						@Pc(436) int local436 = local427 >> 14 & 0x3FF;
						@Pc(442) int local442 = local427 >> 3 & 0x7FF;
						@Pc(453) int local453 = (local436 / 8 << 8) + (local442 / 8);
						for (@Pc(455) int local455 = 0; local455 < local106; local455++) {
							if (Static75.anIntArray205[local455] == local453) {
								local453 = -1;
								break;
							}
						}
						if (local453 != -1) {
							@Pc(481) int local481 = local453 & 0xFF;
							@Pc(487) int local487 = local453 >> 8 & 0xFF;
							Static75.anIntArray205[local106] = local453;
							Static91.anIntArray301[local106] = Static42.aClass16_Sub1_6.method574(Static119.method2136(new Class26[] { Static31.aClass26_1482, Static122.method2170(local487), Static2.aClass26_5, Static122.method2170(local481) }));
							Static101.anIntArray334[local106] = Static42.aClass16_Sub1_6.method574(Static119.method2136(new Class26[] { Static23.aClass26_727, Static122.method2170(local487), Static2.aClass26_5, Static122.method2170(local481) }));
							local106++;
						}
					}
				}
			}
		}
		Static75.method1350(local29, local65, local23, local33, local15);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIIII)V")
	public static void method2003(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static15.anInt403; local3++) {
			if (Static125.anIntArray386[local3] + Static39.anIntArray134[local3] > arg0 && arg1 + arg0 > Static39.anIntArray134[local3] && arg3 < Static66.anIntArray296[local3] + Static31.anIntArray328[local3] && arg3 + arg2 > Static66.anIntArray296[local3]) {
				Static28.aBooleanArray9[local3] = true;
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!nc;I)V")
	public static void method2004(@OriginalArg(0) Class3_Sub14 arg0) {
		if (Static33.anInt1078 == arg0.anInt2191) {
			Static72.aBooleanArray19[arg0.anInt2166] = true;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIB[B)Z")
	public static boolean method2005(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(14) int local14 = -1;
		@Pc(19) Class3_Sub11 local19 = new Class3_Sub11(arg2);
		label68: while (true) {
			@Pc(23) int local23 = local19.method979();
			if (local23 == 0) {
				return local12;
			}
			local14 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(62) int local62;
				@Pc(93) Class3_Sub1_Sub1 local93;
				do {
					@Pc(72) int local72;
					@Pc(77) int local77;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local19.method979();
										if (local39 == 0) {
											continue label68;
										}
										local19.method981();
									}
									local39 = local19.method979();
									if (local39 == 0) {
										continue label68;
									}
									local31 += local39 - 1;
									@Pc(54) int local54 = local31 & 0x3F;
									local62 = local19.method981() >> 2;
									@Pc(68) int local68 = local31 >> 6 & 0x3F;
									local72 = local68 + arg1;
									local77 = local54 + arg0;
								} while (local72 <= 0);
							} while (local77 <= 0);
						} while (local72 >= 103);
					} while (local77 >= 103);
					local93 = Static4.method68(local14);
				} while (local62 == 22 && Static98.aBoolean151 && local93.anInt87 == 0 && local93.anInt93 != 1 && !local93.aBoolean10);
				local33 = true;
				if (!local93.method53()) {
					Static125.anInt3207++;
					local12 = false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZI)I")
	public static int method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(16) int local16 = arg1 >> 7;
		if (local7 < 0 || local16 < 0 || local7 > 103 || local16 > 103) {
			return 0;
		}
		@Pc(35) int local35 = arg2;
		if (arg2 < 3 && (Static74.aByteArrayArrayArray5[1][local7][local16] & 0x2) == 2) {
			local35 = arg2 + 1;
		}
		@Pc(54) int local54 = arg1 & 0x7F;
		@Pc(58) int local58 = arg0 & 0x7F;
		@Pc(85) int local85 = (128 - local58) * Static117.anIntArrayArrayArray6[local35][local7][local16] + local58 * Static117.anIntArrayArrayArray6[local35][local7 + 1][local16] >> 7;
		@Pc(117) int local117 = (128 - local58) * Static117.anIntArrayArrayArray6[local35][local7][local16 + 1] + Static117.anIntArrayArrayArray6[local35][local7 + 1][local16 + 1] * local58 >> 7;
		return local54 * local117 + local85 * (128 - local54) >> 7;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V")
	public static void method2007() {
		aClass16_136 = null;
		aClass26_1600 = null;
		anIntArray350 = null;
		aClass66_26 = null;
		anIntArray351 = null;
		aClass26_1598 = null;
		aClass26_1599 = null;
	}
}
