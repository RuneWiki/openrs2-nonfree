import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "p", descriptor = "Lclient!pd;")
	public static Class20 aClass20_1;

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
	public static int anInt12 = -1;

	@OriginalMember(owner = "client!aa", name = "b", descriptor = "Lclient!ja;")
	public static Class39 aClass39_7 = Static28.method504(" steht bereits auf Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "Lclient!he;")
	public static Class4_Sub5 aClass4_Sub5_1 = null;

	@OriginalMember(owner = "client!aa", name = "g", descriptor = "Lclient!ja;")
	public static Class39 aClass39_8 = Static28.method504("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
	public static int anInt16 = 0;

	@OriginalMember(owner = "client!aa", name = "i", descriptor = "Lclient!ja;")
	public static Class39 aClass39_9 = Static28.method504("Geben Sie Ihren Benutzernamen");

	@OriginalMember(owner = "client!aa", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_10 = Static28.method504("Weiter");

	@OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
	public static int anInt17 = 0;

	@OriginalMember(owner = "client!aa", name = "l", descriptor = "Lclient!ja;")
	public static Class39 aClass39_11 = Static28.method504("<col=00ffff>");

	@OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
	public static int anInt18 = 0;

	@OriginalMember(owner = "client!aa", name = "n", descriptor = "Lclient!ja;")
	public static Class39 aClass39_12 = Static28.method504("zur-Uck auf die RuneScape)2Webseite gehen");

	@OriginalMember(owner = "client!aa", name = "o", descriptor = "I")
	public static int anInt19 = 0;

	@OriginalMember(owner = "client!aa", name = "q", descriptor = "[I")
	public static int[] anIntArray3 = new int[128];

	@OriginalMember(owner = "client!aa", name = "r", descriptor = "Lclient!ja;")
	public static Class39 aClass39_13 = Static28.method504("Fehler beim Laden Ihres Spielcharakters)3");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(Lclient!ja;Lclient!ja;Lclient!ja;I)V")
	public static void method7(@OriginalArg(0) Class39 arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) Class39 arg2) {
		Static6.aClass39_184 = arg1;
		Static6.aClass39_182 = arg0;
		Static6.aClass39_185 = arg2;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
	public static void method8() {
		aClass39_12 = null;
		aClass39_13 = null;
		aClass39_7 = null;
		aClass20_1 = null;
		aClass39_10 = null;
		anIntArray3 = null;
		aClass39_11 = null;
		aClass4_Sub5_1 = null;
		aClass39_8 = null;
		aClass39_9 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI)V")
	public static void method9(@OriginalArg(0) boolean arg0) {
		Static22.aBoolean26 = arg0;
		@Pc(18) int local18;
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(42) int local42;
		@Pc(127) int local127;
		@Pc(150) int local150;
		@Pc(154) int local154;
		@Pc(158) int local158;
		if (!Static22.aBoolean26) {
			local18 = Static35.aClass4_Sub16_Sub1_1.method1472();
			local22 = Static35.aClass4_Sub16_Sub1_1.method1453();
			local27 = Static35.aClass4_Sub16_Sub1_1.method1490();
			local31 = (Static97.anInt2446 - Static35.aClass4_Sub16_Sub1_1.anInt2019) / 16;
			Static111.anIntArrayArray22 = new int[local31][4];
			for (local35 = 0; local35 < local31; local35++) {
				for (local42 = 0; local42 < 4; local42++) {
					Static111.anIntArrayArray22[local35][local42] = Static35.aClass4_Sub16_Sub1_1.method1469();
				}
			}
			local42 = Static35.aClass4_Sub16_Sub1_1.method1490();
			local127 = Static35.aClass4_Sub16_Sub1_1.method1490();
			Static20.anIntArray58 = new int[local31];
			@Pc(380) boolean local380 = false;
			Static30.aByteArrayArray4 = new byte[local31][];
			Static125.anIntArray359 = new int[local31];
			if ((local27 / 8 == 48 || local27 / 8 == 49) && (local42 / 8) == 48) {
				local380 = true;
			}
			Static74.anIntArray195 = new int[local31];
			Static22.aByteArrayArray3 = new byte[local31][];
			if (local27 / 8 == 48 && local42 / 8 == 148) {
				local380 = true;
			}
			local31 = 0;
			for (local150 = (local27 - 6) / 8; local150 <= (local27 + 6) / 8; local150++) {
				for (local154 = (local42 - 6) / 8; local154 <= (local42 + 6) / 8; local154++) {
					local158 = local154 + (local150 << 8);
					if (!local380 || local154 != 49 && local154 != 149 && local154 != 147 && local150 != 50 && (local150 != 49 || local154 != 47)) {
						Static74.anIntArray195[local31] = local158;
						Static125.anIntArray359[local31] = Static16.aClass20_Sub1_2.method484(Static62.method1123(new Class39[] { Static94.aClass39_1143, Static29.method510(local150), Static113.aClass39_1484, Static29.method510(local154) }));
						Static20.anIntArray58[local31] = Static16.aClass20_Sub1_2.method484(Static62.method1123(new Class39[] { Static49.aClass39_731, Static29.method510(local150), Static113.aClass39_1484, Static29.method510(local154) }));
						local31++;
					}
				}
			}
			Static33.method553(local127, local18, local42, local22, local27);
			return;
		}
		local18 = Static35.aClass4_Sub16_Sub1_1.method1438();
		local22 = Static35.aClass4_Sub16_Sub1_1.method1453();
		Static35.aClass4_Sub16_Sub1_1.method1494();
		for (local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < 13; local31++) {
				for (local35 = 0; local35 < 13; local35++) {
					local42 = Static35.aClass4_Sub16_Sub1_1.method1500(1);
					if (local42 == 1) {
						Static36.anIntArrayArrayArray5[local27][local31][local35] = Static35.aClass4_Sub16_Sub1_1.method1500(26);
					} else {
						Static36.anIntArrayArrayArray5[local27][local31][local35] = -1;
					}
				}
			}
		}
		Static35.aClass4_Sub16_Sub1_1.method1491();
		local31 = (Static97.anInt2446 - Static35.aClass4_Sub16_Sub1_1.anInt2019) / 16;
		Static111.anIntArrayArray22 = new int[local31][4];
		for (local35 = 0; local35 < local31; local35++) {
			for (local42 = 0; local42 < 4; local42++) {
				Static111.anIntArrayArray22[local35][local42] = Static35.aClass4_Sub16_Sub1_1.method1469();
			}
		}
		local42 = Static35.aClass4_Sub16_Sub1_1.method1453();
		local127 = Static35.aClass4_Sub16_Sub1_1.method1490();
		@Pc(131) int local131 = Static35.aClass4_Sub16_Sub1_1.method1490();
		Static74.anIntArray195 = new int[local31];
		Static30.aByteArrayArray4 = new byte[local31][];
		Static20.anIntArray58 = new int[local31];
		Static22.aByteArrayArray3 = new byte[local31][];
		Static125.anIntArray359 = new int[local31];
		local31 = 0;
		for (local150 = 0; local150 < 4; local150++) {
			for (local154 = 0; local154 < 13; local154++) {
				for (local158 = 0; local158 < 13; local158++) {
					@Pc(168) int local168 = Static36.anIntArrayArrayArray5[local150][local154][local158];
					if (local168 != -1) {
						@Pc(178) int local178 = local168 >> 14 & 0x3FF;
						@Pc(184) int local184 = local168 >> 3 & 0x7FF;
						@Pc(194) int local194 = local184 / 8 + (local178 / 8 << 8);
						for (@Pc(196) int local196 = 0; local196 < local31; local196++) {
							if (local194 == Static74.anIntArray195[local196]) {
								local194 = -1;
								break;
							}
						}
						if (local194 != -1) {
							Static74.anIntArray195[local31] = local194;
							@Pc(232) int local232 = local194 >> 8 & 0xFF;
							@Pc(236) int local236 = local194 & 0xFF;
							Static125.anIntArray359[local31] = Static16.aClass20_Sub1_2.method484(Static62.method1123(new Class39[] { Static94.aClass39_1143, Static29.method510(local232), Static113.aClass39_1484, Static29.method510(local236) }));
							Static20.anIntArray58[local31] = Static16.aClass20_Sub1_2.method484(Static62.method1123(new Class39[] { Static49.aClass39_731, Static29.method510(local232), Static113.aClass39_1484, Static29.method510(local236) }));
							local31++;
						}
					}
				}
			}
		}
		Static33.method553(local42, local18, local131, local127, local22);
	}
}
