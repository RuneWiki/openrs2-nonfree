import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static410 {

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "I")
	public static int anInt8176;

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "Lclient!ct;")
	public static final Class61 aClass61_6 = new Class61();

	@OriginalMember(owner = "client!pp", name = "j", descriptor = "I")
	public static int anInt8174 = -2;

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
	public static void method6363() {
		if (Static455.aClass4_Sub35_Sub1_1.method7623(Static453.anInt8614) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static70.anInt1864 - 4 & 0xFF);
		@Pc(29) int local29 = Static70.anInt1864 % Static338.anInt6508;
		@Pc(35) int local35;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < Static390.anInt7654; local35++) {
				Static159.aByteArrayArrayArray3[local31][local29][local35] = local19;
			}
		}
		if (Static352.anInt6764 == 3) {
			return;
		}
		for (local35 = 0; local35 < 2; local35++) {
			Static301.anIntArray332[local35] = -1000000;
			Static333.anIntArray354[local35] = 1000000;
			Static425.anIntArray455[local35] = 0;
			Static211.anIntArray211[local35] = 1000000;
			Static15.anIntArray16[local35] = 0;
		}
		@Pc(96) int local96 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10551;
		@Pc(99) int local99 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.anInt10550;
		@Pc(145) int local145;
		if (Static300.anInt6053 != 1 && Static587.anInt10508 == -1) {
			local145 = Static461.method6782(Static114.anInt2613, Static352.anInt6764, Static534.anInt9775);
			if (local145 - Static139.anInt3067 < 3200 && (Static266.aByteArrayArrayArray10[Static352.anInt6764][Static534.anInt9775 >> 9][Static114.anInt2613 >> 9] & 0x4) != 0) {
				Static75.method1597(Static534.anInt9775 >> 9, Static571.aClass182ArrayArrayArray3, 1, Static114.anInt2613 >> 9, false);
				return;
			}
			return;
		}
		if (Static300.anInt6053 != 1) {
			local99 = Static453.anInt8613;
			local96 = Static587.anInt10508;
		}
		if ((Static266.aByteArrayArrayArray10[Static352.anInt6764][local96 >> 9][local99 >> 9] & 0x4) != 0) {
			Static75.method1597(local96 >> 9, Static571.aClass182ArrayArrayArray3, 0, local99 >> 9, false);
		}
		if (Static233.anInt4905 >= 2560) {
			return;
		}
		local145 = Static534.anInt9775 >> 9;
		@Pc(149) int local149 = Static114.anInt2613 >> 9;
		@Pc(153) int local153 = local96 >> 9;
		@Pc(157) int local157 = local99 >> 9;
		@Pc(164) int local164;
		if (local153 <= local145) {
			local164 = local145 - local153;
		} else {
			local164 = local153 - local145;
		}
		@Pc(179) int local179;
		if (local157 > local149) {
			local179 = local157 - local149;
		} else {
			local179 = local149 - local157;
		}
		if ((local164 != 0 || local179 != 0) && (-Static338.anInt6508) < local164 && local164 < Static338.anInt6508 && -Static390.anInt7654 < local179 && Static390.anInt7654 > local179) {
			@Pc(263) int local263;
			@Pc(265) int local265;
			if (local179 < local164) {
				local263 = local179 * 65536 / local164;
				local265 = 32768;
				while (local145 != local153) {
					if (local153 > local145) {
						local145++;
					} else if (local153 < local145) {
						local145--;
					}
					if ((Static266.aByteArrayArrayArray10[Static352.anInt6764][local145][local149] & 0x4) != 0) {
						Static75.method1597(local145, Static571.aClass182ArrayArrayArray3, 1, local149, false);
						return;
					}
					local265 += local263;
					if (local265 >= 65536) {
						if (local157 > local149) {
							local149++;
						} else if (local157 < local149) {
							local149--;
						}
						local265 -= 65536;
						if ((Static266.aByteArrayArrayArray10[Static352.anInt6764][local145][local149] & 0x4) != 0) {
							Static75.method1597(local145, Static571.aClass182ArrayArrayArray3, 1, local149, false);
							return;
						}
					}
				}
				return;
			}
			local263 = local164 * 65536 / local179;
			local265 = 32768;
			while (local149 != local157) {
				if (local149 < local157) {
					local149++;
				} else if (local149 > local157) {
					local149--;
				}
				if ((Static266.aByteArrayArrayArray10[Static352.anInt6764][local145][local149] & 0x4) != 0) {
					Static75.method1597(local145, Static571.aClass182ArrayArrayArray3, 1, local149, false);
					return;
				}
				local265 += local263;
				if (local265 >= 65536) {
					if (local153 > local145) {
						local145++;
					} else if (local145 > local153) {
						local145--;
					}
					local265 -= 65536;
					if ((Static266.aByteArrayArrayArray10[Static352.anInt6764][local145][local149] & 0x4) != 0) {
						Static75.method1597(local145, Static571.aClass182ArrayArrayArray3, 1, local149, false);
						return;
					}
				}
			}
			return;
		}
		Static109.method2014("RC: " + local145 + "," + local149 + " " + local153 + "," + local157 + " " + Static242.anInt10133 + "," + Static157.anInt3323, null);
		return;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(BD)V")
	public static void method6364(@OriginalArg(1) double arg0) {
		if (Static554.aDouble3 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(19) int local19 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static149.anIntArray156[local7] = local19 > 255 ? 255 : local19;
		}
		Static554.aDouble3 = arg0;
	}
}
