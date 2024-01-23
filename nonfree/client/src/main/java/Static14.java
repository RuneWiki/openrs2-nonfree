import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static14 {

	@OriginalMember(owner = "client!b", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString16 = "K";

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BZ)V")
	public static void method235(@OriginalArg(1) boolean arg0) {
		Static51.aBoolean84 = arg0;
		@Pc(138) boolean local138;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(45) int local45;
		@Pc(167) int local167;
		@Pc(171) int local171;
		@Pc(175) int local175;
		if (!Static51.aBoolean84) {
			local17 = Static58.aClass1_Sub13_Sub1_1.method1793();
			local21 = Static58.aClass1_Sub13_Sub1_1.method1793();
			local138 = Static38.method663(Static58.aClass1_Sub13_Sub1_1.method1814());
			local25 = (Static149.anInt3579 - Static58.aClass1_Sub13_Sub1_1.anInt2395) / 16;
			Static59.anIntArrayArray13 = new int[local25][4];
			for (local30 = 0; local30 < local25; local30++) {
				for (local34 = 0; local34 < 4; local34++) {
					Static59.anIntArrayArray13[local30][local34] = Static58.aClass1_Sub13_Sub1_1.method1753();
				}
			}
			local34 = Static58.aClass1_Sub13_Sub1_1.method1761();
			local38 = Static58.aClass1_Sub13_Sub1_1.method1761();
			local45 = Static58.aClass1_Sub13_Sub1_1.method1772();
			Static172.aByteArrayArray8 = null;
			Static169.anIntArray298 = new int[local25];
			Static254.aByteArrayArray13 = new byte[local25][];
			Static70.anIntArray145 = new int[local25];
			Static240.aByteArrayArray11 = new byte[local25][];
			Static43.anIntArray96 = null;
			Static143.anIntArray266 = new int[local25];
			Static191.anIntArray322 = new int[local25];
			Static48.anIntArray105 = new int[local25];
			local25 = 0;
			@Pc(428) boolean local428 = false;
			if ((local38 / 8 == 48 || local38 / 8 == 49) && (local17 / 8) == 48) {
				local428 = true;
			}
			if (local38 / 8 == 48 && local17 / 8 == 148) {
				local428 = true;
			}
			for (local167 = (local38 - 6) / 8; local167 <= (local38 + 6) / 8; local167++) {
				for (local171 = (local17 - 6) / 8; local171 <= (local17 + 6) / 8; local171++) {
					local175 = (local167 << 8) + local171;
					if (local428 && (local171 == 49 || local171 == 149 || local171 == 147 || local167 == 50 || local167 == 49 && local171 == 47)) {
						Static169.anIntArray298[local25] = local175;
						Static143.anIntArray266[local25] = -1;
						Static48.anIntArray105[local25] = -1;
						Static191.anIntArray322[local25] = -1;
						Static70.anIntArray145[local25] = -1;
					} else {
						Static169.anIntArray298[local25] = local175;
						Static143.anIntArray266[local25] = Static251.aClass51_80.method1866("m" + local167 + "_" + local171);
						Static48.anIntArray105[local25] = Static251.aClass51_80.method1866("l" + local167 + "_" + local171);
						Static191.anIntArray322[local25] = Static251.aClass51_80.method1866("um" + local167 + "_" + local171);
						Static70.anIntArray145[local25] = Static251.aClass51_80.method1866("ul" + local167 + "_" + local171);
					}
					local25++;
				}
			}
			Static46.method964(local38, local21, local34, local45, local17, local138, false);
			return;
		}
		local17 = Static58.aClass1_Sub13_Sub1_1.method1793();
		local21 = Static58.aClass1_Sub13_Sub1_1.method1761();
		local25 = Static58.aClass1_Sub13_Sub1_1.method1793();
		Static58.aClass1_Sub13_Sub1_1.method1817();
		for (local30 = 0; local30 < 4; local30++) {
			for (local34 = 0; local34 < 13; local34++) {
				for (local38 = 0; local38 < 13; local38++) {
					local45 = Static58.aClass1_Sub13_Sub1_1.method1826(1);
					if (local45 == 1) {
						Static127.anIntArrayArrayArray8[local30][local34][local38] = Static58.aClass1_Sub13_Sub1_1.method1826(26);
					} else {
						Static127.anIntArrayArrayArray8[local30][local34][local38] = -1;
					}
				}
			}
		}
		Static58.aClass1_Sub13_Sub1_1.method1821();
		local34 = (Static149.anInt3579 - Static58.aClass1_Sub13_Sub1_1.anInt2395) / 16;
		Static59.anIntArrayArray13 = new int[local34][4];
		for (local38 = 0; local38 < local34; local38++) {
			for (local45 = 0; local45 < 4; local45++) {
				Static59.anIntArrayArray13[local38][local45] = Static58.aClass1_Sub13_Sub1_1.method1786();
			}
		}
		local45 = Static58.aClass1_Sub13_Sub1_1.method1784();
		@Pc(132) int local132 = Static58.aClass1_Sub13_Sub1_1.method1772();
		local138 = Static38.method663(Static58.aClass1_Sub13_Sub1_1.method1772());
		Static143.anIntArray266 = new int[local34];
		Static172.aByteArrayArray8 = null;
		Static254.aByteArrayArray13 = new byte[local34][];
		Static70.anIntArray145 = new int[local34];
		Static48.anIntArray105 = new int[local34];
		Static191.anIntArray322 = new int[local34];
		Static240.aByteArrayArray11 = new byte[local34][];
		Static169.anIntArray298 = new int[local34];
		Static43.anIntArray96 = null;
		local34 = 0;
		for (local167 = 0; local167 < 4; local167++) {
			for (local171 = 0; local171 < 13; local171++) {
				for (local175 = 0; local175 < 13; local175++) {
					@Pc(185) int local185 = Static127.anIntArrayArrayArray8[local167][local171][local175];
					if (local185 != -1) {
						@Pc(194) int local194 = local185 >> 14 & 0x3FF;
						@Pc(200) int local200 = local185 >> 3 & 0x7FF;
						@Pc(210) int local210 = local200 / 8 + (local194 / 8 << 8);
						for (@Pc(212) int local212 = 0; local212 < local34; local212++) {
							if (local210 == Static169.anIntArray298[local212]) {
								local210 = -1;
								break;
							}
						}
						if (local210 != -1) {
							Static169.anIntArray298[local34] = local210;
							@Pc(238) int local238 = local210 & 0xFF;
							@Pc(244) int local244 = local210 >> 8 & 0xFF;
							Static143.anIntArray266[local34] = Static251.aClass51_80.method1866("m" + local244 + "_" + local238);
							Static48.anIntArray105[local34] = Static251.aClass51_80.method1866("l" + local244 + "_" + local238);
							Static191.anIntArray322[local34] = Static251.aClass51_80.method1866("um" + local244 + "_" + local238);
							Static70.anIntArray145[local34] = Static251.aClass51_80.method1866("ul" + local244 + "_" + local238);
							local34++;
						}
					}
				}
			}
		}
		Static46.method964(local21, local25, local17, local132, local45, local138, false);
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(CII)I")
	public static int method236(@OriginalArg(0) char arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local7 = (arg0 << 4) + 1;
		}
		if (arg0 == 'ñ' && arg1 == 0) {
			local7 = 1762;
		}
		return local7;
	}
}
