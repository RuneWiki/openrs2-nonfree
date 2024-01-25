import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!hv", name = "q", descriptor = "I")
	public static int anInt4277;

	@OriginalMember(owner = "client!hv", name = "D", descriptor = "[Lclient!g;")
	public static Class96_Sub1[] aClass96_Sub1Array1;

	@OriginalMember(owner = "client!hv", name = "j", descriptor = "(I)V")
	public static void method3763() {
		Static398.aClass5_13.method7504(Static420.aClass39_10);
		Static398.aClass5_13.DA(Static612.anInt9919, Static231.anInt4363, Static116.anInt2540, Static190.anInt3597);
	}

	@OriginalMember(owner = "client!hv", name = "k", descriptor = "(I)V")
	public static void method3764() {
		if (Static262.aClass3_Sub27_12.aClass21_Sub27_1.method8338() != 2) {
			return;
		}
		@Pc(26) byte local26 = (byte) (Static45.anInt1320 - 4 & 0xFF);
		@Pc(30) int local30 = Static45.anInt1320 % Static634.anInt10129;
		@Pc(36) int local36;
		for (@Pc(32) int local32 = 0; local32 < 4; local32++) {
			for (local36 = 0; local36 < Static638.anInt10172; local36++) {
				Static3.aByteArrayArrayArray1[local32][local30][local36] = local26;
			}
		}
		if (Static549.anInt9262 == 3) {
			return;
		}
		for (local36 = 0; local36 < 2; local36++) {
			Static332.anIntArray382[local36] = -1000000;
			Static441.anIntArray484[local36] = 1000000;
			Static576.anIntArray604[local36] = 0;
			Static444.anIntArray555[local36] = 1000000;
			Static429.anIntArray474[local36] = 0;
		}
		@Pc(99) int local99 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916;
		@Pc(102) int local102 = Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911;
		@Pc(153) int local153;
		if (Static305.anInt5422 != 1 && Static530.anInt9071 == -1) {
			local153 = Static192.method3263(Static20.anInt824, Static611.anInt9892, Static549.anInt9262);
			if (local153 - Static557.anInt9304 < 3200 && (Static513.aByteArrayArrayArray18[Static549.anInt9262][Static611.anInt9892 >> 9][Static20.anInt824 >> 9] & 0x4) != 0) {
				Static553.method7993(Static330.aClass77ArrayArrayArray2, Static611.anInt9892 >> 9, false, Static20.anInt824 >> 9, 1);
				return;
			}
			return;
		}
		if (Static305.anInt5422 != 1) {
			local102 = Static331.anInt6175;
			local99 = Static530.anInt9071;
		}
		if ((Static513.aByteArrayArrayArray18[Static549.anInt9262][local99 >> 9][local102 >> 9] & 0x4) != 0) {
			Static553.method7993(Static330.aClass77ArrayArrayArray2, local99 >> 9, false, local102 >> 9, 0);
		}
		if (Static393.anInt7268 >= 2560) {
			return;
		}
		local153 = Static611.anInt9892 >> 9;
		@Pc(157) int local157 = Static20.anInt824 >> 9;
		@Pc(161) int local161 = local99 >> 9;
		@Pc(165) int local165 = local102 >> 9;
		@Pc(173) int local173;
		if (local153 < local161) {
			local173 = local161 - local153;
		} else {
			local173 = local153 - local161;
		}
		@Pc(187) int local187;
		if (local165 <= local157) {
			local187 = local157 - local165;
		} else {
			local187 = local165 - local157;
		}
		if ((local173 != 0 || local187 != 0) && local173 > -Static634.anInt10129 && local173 < Static634.anInt10129 && local187 > -Static638.anInt10172 && local187 < Static638.anInt10172) {
			@Pc(256) int local256;
			@Pc(258) int local258;
			if (local187 >= local173) {
				local256 = local173 * 65536 / local187;
				local258 = 32768;
				while (local157 != local165) {
					if (local157 < local165) {
						local157++;
					} else if (local157 > local165) {
						local157--;
					}
					if ((Static513.aByteArrayArrayArray18[Static549.anInt9262][local153][local157] & 0x4) != 0) {
						Static553.method7993(Static330.aClass77ArrayArrayArray2, local153, false, local157, 1);
						return;
					}
					local258 += local256;
					if (local258 >= 65536) {
						if (local153 < local161) {
							local153++;
						} else if (local153 > local161) {
							local153--;
						}
						local258 -= 65536;
						if ((Static513.aByteArrayArrayArray18[Static549.anInt9262][local153][local157] & 0x4) != 0) {
							Static553.method7993(Static330.aClass77ArrayArrayArray2, local153, false, local157, 1);
							return;
						}
					}
				}
				return;
			}
			local256 = local187 * 65536 / local173;
			local258 = 32768;
			while (local153 != local161) {
				if (local153 < local161) {
					local153++;
				} else if (local153 > local161) {
					local153--;
				}
				if ((Static513.aByteArrayArrayArray18[Static549.anInt9262][local153][local157] & 0x4) != 0) {
					Static553.method7993(Static330.aClass77ArrayArrayArray2, local153, false, local157, 1);
					return;
				}
				local258 += local256;
				if (local258 >= 65536) {
					if (local165 > local157) {
						local157++;
					} else if (local165 < local157) {
						local157--;
					}
					local258 -= 65536;
					if ((Static513.aByteArrayArrayArray18[Static549.anInt9262][local153][local157] & 0x4) != 0) {
						Static553.method7993(Static330.aClass77ArrayArrayArray2, local153, false, local157, 1);
						return;
					}
				}
			}
			return;
		}
		Static335.method5467("RC: " + local153 + "," + local157 + " " + local161 + "," + local165 + " " + Static299.anInt5307 + "," + Static171.anInt3340, null);
		return;
	}
}
