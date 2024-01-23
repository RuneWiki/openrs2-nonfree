import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!di", name = "V", descriptor = "I")
	public static int anInt1059;

	@OriginalMember(owner = "client!di", name = "bb", descriptor = "Lclient!nb;")
	public static Class15 aClass15_10;

	@OriginalMember(owner = "client!di", name = "eb", descriptor = "[Lclient!lj;")
	public static Class60[] aClass60Array13;

	@OriginalMember(owner = "client!di", name = "gb", descriptor = "I")
	public static int anInt1065;

	@OriginalMember(owner = "client!di", name = "R", descriptor = "I")
	public static int anInt1055 = -1;

	@OriginalMember(owner = "client!di", name = "Z", descriptor = "Lclient!i;")
	public static Class41 aClass41_343 = Static184.method2923(":trade:");

	@OriginalMember(owner = "client!di", name = "ab", descriptor = "Lclient!be;")
	public static Class11 aClass11_1 = new Class11();

	@OriginalMember(owner = "client!di", name = "cb", descriptor = "Lclient!i;")
	public static Class41 aClass41_344 = Static184.method2923("oder ung-Ultiges Passwort)3");

	@OriginalMember(owner = "client!di", name = "hb", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)V")
	public static void method821(@OriginalArg(1) int arg0) {
		if (arg0 == 37) {
			Static135.aDouble10 = 3.0D;
		} else if (arg0 == 50) {
			Static135.aDouble10 = 4.0D;
		} else if (arg0 == 75) {
			Static135.aDouble10 = 6.0D;
		} else {
			Static135.aDouble10 = 8.0D;
		}
		Static32.anInt850 = -1;
		Static32.anInt850 = -1;
	}

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(ZB)V")
	public static void method822(@OriginalArg(0) boolean arg0) {
		Static122.aBoolean160 = arg0;
		@Pc(25) int local25;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(75) int local75;
		@Pc(79) int local79;
		@Pc(135) int local135;
		@Pc(143) int local143;
		@Pc(151) int local151;
		if (!Static122.aBoolean160) {
			local25 = (Static202.anInt1733 - Static204.aClass2_Sub3_Sub1_3.anInt239) / 16;
			Static16.anIntArrayArray4 = new int[local25][4];
			for (local31 = 0; local31 < local25; local31++) {
				for (local35 = 0; local35 < 4; local35++) {
					Static16.anIntArrayArray4[local31][local35] = Static204.aClass2_Sub3_Sub1_3.method161();
				}
			}
			local35 = Static204.aClass2_Sub3_Sub1_3.method211();
			@Pc(63) boolean local63 = false;
			local67 = Static204.aClass2_Sub3_Sub1_3.method164();
			local71 = Static204.aClass2_Sub3_Sub1_3.method163();
			local75 = Static204.aClass2_Sub3_Sub1_3.method214();
			local79 = Static204.aClass2_Sub3_Sub1_3.method163();
			Static113.anIntArray299 = new int[local25];
			Static131.anIntArray320 = new int[local25];
			Static41.aByteArrayArray5 = new byte[local25][];
			Static25.anIntArray493 = new int[local25];
			Static150.aByteArrayArray9 = new byte[local25][];
			local25 = 0;
			if ((local71 / 8 == 48 || local71 / 8 == 49) && (local35 / 8) == 48) {
				local63 = true;
			}
			if (local71 / 8 == 48 && local35 / 8 == 148) {
				local63 = true;
			}
			for (local135 = (local71 - 6) / 8; local135 <= (local71 + 6) / 8; local135++) {
				for (local143 = (local35 - 6) / 8; local143 <= (local35 + 6) / 8; local143++) {
					local151 = (local135 << 8) + local143;
					if (local63 && (local143 == 49 || local143 == 149 || local143 == 147 || local135 == 50 || local135 == 49 && local143 == 47)) {
						Static131.anIntArray320[local25] = local151;
						Static25.anIntArray493[local25] = -1;
						Static113.anIntArray299[local25] = -1;
					} else {
						Static131.anIntArray320[local25] = local151;
						Static25.anIntArray493[local25] = Static25.aClass15_Sub1_137.method414(Static149.method2324(new Class41[] { Static188.aClass41_1144, Static152.method2471(local135), Static46.aClass41_1094, Static152.method2471(local143) }));
						Static113.anIntArray299[local25] = Static25.aClass15_Sub1_137.method414(Static149.method2324(new Class41[] { Static93.aClass41_674, Static152.method2471(local135), Static46.aClass41_1094, Static152.method2471(local143) }));
					}
					local25++;
				}
			}
			Static106.method1815(local75, local79, local71, local35, local67);
			return;
		}
		local25 = Static204.aClass2_Sub3_Sub1_3.method209();
		local31 = Static204.aClass2_Sub3_Sub1_3.method205();
		local35 = Static204.aClass2_Sub3_Sub1_3.method164();
		Static204.aClass2_Sub3_Sub1_3.method225();
		for (local67 = 0; local67 < 4; local67++) {
			for (local71 = 0; local71 < 13; local71++) {
				for (local75 = 0; local75 < 13; local75++) {
					local79 = Static204.aClass2_Sub3_Sub1_3.method219(1);
					if (local79 == 1) {
						Static97.anIntArrayArrayArray13[local67][local71][local75] = Static204.aClass2_Sub3_Sub1_3.method219(26);
					} else {
						Static97.anIntArrayArrayArray13[local67][local71][local75] = -1;
					}
				}
			}
		}
		Static204.aClass2_Sub3_Sub1_3.method226();
		local71 = (Static202.anInt1733 - Static204.aClass2_Sub3_Sub1_3.anInt239) / 16;
		Static16.anIntArrayArray4 = new int[local71][4];
		for (local75 = 0; local75 < local71; local75++) {
			for (local79 = 0; local79 < 4; local79++) {
				Static16.anIntArrayArray4[local75][local79] = Static204.aClass2_Sub3_Sub1_3.method185();
			}
		}
		local79 = Static204.aClass2_Sub3_Sub1_3.method205();
		@Pc(409) int local409 = Static204.aClass2_Sub3_Sub1_3.method163();
		Static25.anIntArray493 = new int[local71];
		Static113.anIntArray299 = new int[local71];
		Static150.aByteArrayArray9 = new byte[local71][];
		Static131.anIntArray320 = new int[local71];
		Static41.aByteArrayArray5 = new byte[local71][];
		local71 = 0;
		for (local135 = 0; local135 < 4; local135++) {
			for (local143 = 0; local143 < 13; local143++) {
				for (local151 = 0; local151 < 13; local151++) {
					@Pc(446) int local446 = Static97.anIntArrayArrayArray13[local135][local143][local151];
					if (local446 != -1) {
						@Pc(456) int local456 = local446 >> 3 & 0x7FF;
						@Pc(462) int local462 = local446 >> 14 & 0x3FF;
						@Pc(472) int local472 = local456 / 8 + (local462 / 8 << 8);
						for (@Pc(474) int local474 = 0; local474 < local71; local474++) {
							if (local472 == Static131.anIntArray320[local474]) {
								local472 = -1;
								break;
							}
						}
						if (local472 != -1) {
							Static131.anIntArray320[local71] = local472;
							@Pc(510) int local510 = local472 >> 8 & 0xFF;
							@Pc(514) int local514 = local472 & 0xFF;
							Static25.anIntArray493[local71] = Static25.aClass15_Sub1_137.method414(Static149.method2324(new Class41[] { Static188.aClass41_1144, Static152.method2471(local510), Static46.aClass41_1094, Static152.method2471(local514) }));
							Static113.anIntArray299[local71] = Static25.aClass15_Sub1_137.method414(Static149.method2324(new Class41[] { Static93.aClass41_674, Static152.method2471(local510), Static46.aClass41_1094, Static152.method2471(local514) }));
							local71++;
						}
					}
				}
			}
		}
		Static106.method1815(local25, local35, local31, local409, local79);
	}

	@OriginalMember(owner = "client!di", name = "c", descriptor = "(B)Z")
	public static boolean method823() {
		@Pc(5) Class29 local5 = Static149.aClass29_1;
		synchronized (Static149.aClass29_1) {
			if (Static179.anInt4147 == Static44.anInt1330) {
				return false;
			} else {
				Static122.anInt2920 = Static156.anIntArray387[Static179.anInt4147];
				Static194.anInt4772 = Static92.anIntArray229[Static179.anInt4147];
				Static179.anInt4147 = Static179.anInt4147 + 1 & 0x7F;
				return true;
			}
		}
	}
}
