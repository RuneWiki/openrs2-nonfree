import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!rg", name = "t", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray19 = new boolean[][] { new boolean[4], { false, true, true, false }, { true, false, true, false }, { true, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, { true, true, false, false }, new boolean[4], { false, true, false, true }, new boolean[4] };

	@OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
	public static int anInt6204 = 0;

	@OriginalMember(owner = "client!rg", name = "G", descriptor = "Lclient!nj;")
	public static final Class181 aClass181_33 = new Class181();

	@OriginalMember(owner = "client!rg", name = "f", descriptor = "(B)V")
	public static void method4944() {
		if (Static434.aClass165_Sub1_1.method3398(Static404.anInt2752) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static383.anInt6623 - 4 & 0xFF);
		@Pc(25) int local25 = Static383.anInt6623 % Static234.anInt3949;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static371.anInt6492; local31++) {
				Static419.aByteArrayArrayArray17[local27][local25][local31] = local21;
			}
		}
		if (Static204.anInt3498 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static202.anIntArray290[local31] = -1000000;
			Static197.anIntArray283[local31] = 1000000;
			Static318.anIntArray479[local31] = 0;
			Static285.anIntArray428[local31] = 1000000;
			Static102.anIntArray109[local31] = 0;
		}
		@Pc(97) int local97;
		if (Static25.anInt7273 != 1) {
			local97 = Static365.method3535(Static204.anInt3498, Static263.anInt4619, Static120.anInt2052);
			if (local97 - Static260.anInt4601 < 800 && (Static326.aByteArrayArrayArray15[Static204.anInt3498][Static263.anInt4619 >> 7][Static120.anInt2052 >> 7] & 0x4) != 0) {
				Static34.method565(Static120.anInt2052 >> 7, Static263.anInt4619 >> 7, 1, Static175.aClass36ArrayArrayArray1, false);
				return;
			}
			return;
		}
		if ((Static326.aByteArrayArrayArray15[Static204.anInt3498][Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 >> 7][Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 >> 7] & 0x4) != 0) {
			Static34.method565(Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 >> 7, Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 >> 7, 0, Static175.aClass36ArrayArrayArray1, false);
		}
		if (Static213.anInt3662 >= 2560) {
			return;
		}
		local97 = Static263.anInt4619 >> 7;
		@Pc(177) int local177 = Static120.anInt2052 >> 7;
		@Pc(182) int local182 = Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626 >> 7;
		@Pc(187) int local187 = Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 >> 7;
		@Pc(195) int local195;
		if (local97 >= local182) {
			local195 = local97 - local182;
		} else {
			local195 = local182 - local97;
		}
		@Pc(214) int local214;
		if (local177 >= local187) {
			local214 = local177 - local187;
		} else {
			local214 = local187 - local177;
		}
		if (local195 == 0 && local214 == 0 || local195 <= -Static234.anInt3949 || Static234.anInt3949 <= local195 || -Static371.anInt6492 >= local214 || Static371.anInt6492 <= local214) {
			Static22.method402(null, "RC: " + local97 + "," + local177 + " " + local182 + "," + local187 + " " + Static386.anInt7205 + "," + Static153.anInt2798);
			return;
		}
		@Pc(285) int local285;
		@Pc(287) int local287;
		if (local214 < local195) {
			local285 = local214 * 65536 / local195;
			local287 = 32768;
			while (local182 != local97) {
				if (local182 > local97) {
					local97++;
				} else if (local182 < local97) {
					local97--;
				}
				if ((Static326.aByteArrayArrayArray15[Static204.anInt3498][local97][local177] & 0x4) != 0) {
					Static34.method565(local177, local97, 1, Static175.aClass36ArrayArrayArray1, false);
					return;
				}
				local287 += local285;
				if (local287 >= 65536) {
					local287 -= 65536;
					if (local187 > local177) {
						local177++;
					} else if (local187 < local177) {
						local177--;
					}
					if ((Static326.aByteArrayArrayArray15[Static204.anInt3498][local97][local177] & 0x4) != 0) {
						Static34.method565(local177, local97, 1, Static175.aClass36ArrayArrayArray1, false);
						return;
					}
				}
			}
			return;
		}
		local285 = local195 * 65536 / local214;
		local287 = 32768;
		while (local177 != local187) {
			if (local187 > local177) {
				local177++;
			} else if (local177 > local187) {
				local177--;
			}
			if ((Static326.aByteArrayArrayArray15[Static204.anInt3498][local97][local177] & 0x4) != 0) {
				Static34.method565(local177, local97, 1, Static175.aClass36ArrayArrayArray1, false);
				return;
			}
			local287 += local285;
			if (local287 >= 65536) {
				local287 -= 65536;
				if (local182 > local97) {
					local97++;
				} else if (local97 > local182) {
					local97--;
				}
				if ((Static326.aByteArrayArrayArray15[Static204.anInt3498][local97][local177] & 0x4) != 0) {
					Static34.method565(local177, local97, 1, Static175.aClass36ArrayArrayArray1, false);
					return;
				}
			}
		}
	}
}
