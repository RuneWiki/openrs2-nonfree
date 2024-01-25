import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
	public static int anInt5725;

	@OriginalMember(owner = "client!lk", name = "i", descriptor = "J")
	public static long aLong157 = 20000000L;

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "(III)Z")
	public static boolean method4645(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!lk", name = "c", descriptor = "(I)V")
	public static void method4646() {
		if (Static106.anInt2616 != -1) {
			Static92.method1986(false, Static106.anInt2616, -1, -1);
			Static106.anInt2616 = -1;
		}
	}

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "(I)V")
	public static void method4647() {
		if (Static348.aClass3_Sub51_Sub1_5.method7843(Static37.anInt1122) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static335.anInt6052 - 4 & 0xFF);
		@Pc(23) int local23 = Static335.anInt6052 % Static345.anInt6228;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static535.anInt9341; local29++) {
				Static435.aByteArrayArrayArray11[local25][local23][local29] = local19;
			}
		}
		if (Static594.anInt10310 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static375.anIntArray365[local29] = -1000000;
			Static56.anIntArray43[local29] = 1000000;
			Static279.anIntArray244[local29] = 0;
			Static559.anIntArray562[local29] = 1000000;
			Static439.anIntArray462[local29] = 0;
		}
		@Pc(88) int local88 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8476;
		@Pc(91) int local91 = Static254.aClass25_Sub2_Sub2_Sub5_Sub1_1.anInt8482;
		@Pc(142) int local142;
		if (Static188.anInt4080 != 1 && Static357.anInt6345 == -1) {
			local142 = Static78.method3298(Static407.anInt7345, Static594.anInt10310, Static418.anInt7466);
			if (local142 - Static335.anInt6057 < 3200 && (Static428.aByteArrayArrayArray4[Static594.anInt10310][Static407.anInt7345 >> 9][Static418.anInt7466 >> 9] & 0x4) != 0) {
				Static541.method7418(Static189.aClass333ArrayArrayArray1, 1, false, Static407.anInt7345 >> 9, Static418.anInt7466 >> 9);
			}
			return;
		}
		if (Static188.anInt4080 != 1) {
			local91 = Static481.anInt8356;
			local88 = Static357.anInt6345;
		}
		if ((Static428.aByteArrayArrayArray4[Static594.anInt10310][local88 >> 9][local91 >> 9] & 0x4) != 0) {
			Static541.method7418(Static189.aClass333ArrayArrayArray1, 0, false, local88 >> 9, local91 >> 9);
		}
		if (Static568.anInt9808 >= 2560) {
			return;
		}
		local142 = Static407.anInt7345 >> 9;
		@Pc(146) int local146 = Static418.anInt7466 >> 9;
		@Pc(150) int local150 = local88 >> 9;
		@Pc(154) int local154 = local91 >> 9;
		@Pc(166) int local166;
		if (local142 >= local150) {
			local166 = local142 - local150;
		} else {
			local166 = local150 - local142;
		}
		@Pc(185) int local185;
		if (local146 >= local154) {
			local185 = local146 - local154;
		} else {
			local185 = local154 - local146;
		}
		if (local166 == 0 && local185 == 0 || -Static345.anInt6228 >= local166 || local166 >= Static345.anInt6228 || local185 <= -Static535.anInt9341 || Static535.anInt9341 <= local185) {
			Static332.method1390(null, "RC: " + local142 + "," + local146 + " " + local150 + "," + local154 + " " + Static321.anInt5874 + "," + Static137.anInt3293);
			return;
		}
		@Pc(261) int local261;
		@Pc(263) int local263;
		if (local166 <= local185) {
			local261 = local166 * 65536 / local185;
			local263 = 32768;
			while (local154 != local146) {
				if (local154 > local146) {
					local146++;
				} else if (local146 > local154) {
					local146--;
				}
				if ((Static428.aByteArrayArrayArray4[Static594.anInt10310][local142][local146] & 0x4) != 0) {
					Static541.method7418(Static189.aClass333ArrayArrayArray1, 1, false, local142, local146);
					break;
				}
				local263 += local261;
				if (local263 >= 65536) {
					local263 -= 65536;
					if (local142 < local150) {
						local142++;
					} else if (local150 < local142) {
						local142--;
					}
					if ((Static428.aByteArrayArrayArray4[Static594.anInt10310][local142][local146] & 0x4) != 0) {
						Static541.method7418(Static189.aClass333ArrayArrayArray1, 1, false, local142, local146);
						break;
					}
				}
			}
			return;
		}
		local261 = local185 * 65536 / local166;
		local263 = 32768;
		while (local142 != local150) {
			if (local150 > local142) {
				local142++;
			} else if (local142 > local150) {
				local142--;
			}
			if ((Static428.aByteArrayArrayArray4[Static594.anInt10310][local142][local146] & 0x4) != 0) {
				Static541.method7418(Static189.aClass333ArrayArrayArray1, 1, false, local142, local146);
				break;
			}
			local263 += local261;
			if (local263 >= 65536) {
				if (local146 < local154) {
					local146++;
				} else if (local154 < local146) {
					local146--;
				}
				local263 -= 65536;
				if ((Static428.aByteArrayArrayArray4[Static594.anInt10310][local142][local146] & 0x4) != 0) {
					Static541.method7418(Static189.aClass333ArrayArrayArray1, 1, false, local142, local146);
					break;
				}
			}
		}
	}
}
