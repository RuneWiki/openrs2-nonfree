import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static140 {

	@OriginalMember(owner = "client!go", name = "g", descriptor = "Lclient!ri;")
	public static final Class214 aClass214_88 = new Class214(15, -1);

	@OriginalMember(owner = "client!go", name = "h", descriptor = "[I")
	public static final int[] anIntArray113 = new int[5];

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	public static void method1857() {
		if (Static336.aClass106_Sub1_1.method4430(Static410.anInt6680) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static116.anInt5420 - 4 & 0xFF);
		@Pc(25) int local25 = Static116.anInt5420 % Static425.anInt6922;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static251.anInt4072; local31++) {
				Static417.aByteArrayArrayArray3[local27][local25][local31] = local21;
			}
		}
		if (Static138.anInt3548 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static355.anIntArray347[local31] = -1000000;
			Static331.anIntArray328[local31] = 1000000;
			Static425.anIntArray461[local31] = 0;
			Static127.anIntArray104[local31] = 1000000;
			Static367.anIntArray377[local31] = 0;
		}
		@Pc(94) int local94;
		if (Static100.anInt1781 != 1) {
			local94 = Static183.method4175(Static8.anInt7337, Static278.anInt4391, Static138.anInt3548);
			if (local94 - Static5.anInt113 < 800 && (Static357.aByteArrayArrayArray11[Static138.anInt3548][Static278.anInt4391 >> 7][Static8.anInt7337 >> 7] & 0x4) != 0) {
				Static345.method4398(1, Static278.anInt4391 >> 7, Static159.aClass82ArrayArrayArray2, false, Static8.anInt7337 >> 7);
				return;
			}
			return;
		}
		if ((Static357.aByteArrayArrayArray11[Static138.anInt3548][Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 >> 7][Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 >> 7] & 0x4) != 0) {
			Static345.method4398(0, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 >> 7, Static159.aClass82ArrayArrayArray2, false, Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 >> 7);
		}
		if (Static401.anInt3623 >= 2560) {
			return;
		}
		local94 = Static278.anInt4391 >> 7;
		@Pc(172) int local172 = Static8.anInt7337 >> 7;
		@Pc(177) int local177 = Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6613 >> 7;
		@Pc(182) int local182 = Static239.aClass20_Sub3_Sub3_Sub1_1.anInt6616 >> 7;
		@Pc(190) int local190;
		if (local94 < local177) {
			local190 = local177 - local94;
		} else {
			local190 = local94 - local177;
		}
		@Pc(209) int local209;
		if (local182 <= local172) {
			local209 = local172 - local182;
		} else {
			local209 = local182 - local172;
		}
		if (local190 == 0 && local209 == 0 || local190 <= -Static425.anInt6922 || local190 >= Static425.anInt6922 || -Static251.anInt4072 >= local209 || Static251.anInt4072 <= local209) {
			Static211.method2815(null, "RC: " + local94 + "," + local172 + " " + local177 + "," + local182 + " " + Static101.anInt6646 + "," + Static278.anInt4392);
			return;
		}
		@Pc(284) int local284;
		@Pc(286) int local286;
		if (local190 > local209) {
			local284 = local209 * 65536 / local190;
			local286 = 32768;
			while (local177 != local94) {
				if (local94 < local177) {
					local94++;
				} else if (local94 > local177) {
					local94--;
				}
				if ((Static357.aByteArrayArrayArray11[Static138.anInt3548][local94][local172] & 0x4) != 0) {
					Static345.method4398(1, local94, Static159.aClass82ArrayArrayArray2, false, local172);
					return;
				}
				local286 += local284;
				if (local286 >= 65536) {
					local286 -= 65536;
					if (local172 < local182) {
						local172++;
					} else if (local172 > local182) {
						local172--;
					}
					if ((Static357.aByteArrayArrayArray11[Static138.anInt3548][local94][local172] & 0x4) != 0) {
						Static345.method4398(1, local94, Static159.aClass82ArrayArrayArray2, false, local172);
						return;
					}
				}
			}
			return;
		}
		local284 = local190 * 65536 / local209;
		local286 = 32768;
		while (local182 != local172) {
			if (local172 < local182) {
				local172++;
			} else if (local182 < local172) {
				local172--;
			}
			if ((Static357.aByteArrayArrayArray11[Static138.anInt3548][local94][local172] & 0x4) != 0) {
				Static345.method4398(1, local94, Static159.aClass82ArrayArrayArray2, false, local172);
				return;
			}
			local286 += local284;
			if (local286 >= 65536) {
				local286 -= 65536;
				if (local94 < local177) {
					local94++;
				} else if (local177 < local94) {
					local94--;
				}
				if ((Static357.aByteArrayArrayArray11[Static138.anInt3548][local94][local172] & 0x4) != 0) {
					Static345.method4398(1, local94, Static159.aClass82ArrayArrayArray2, false, local172);
					return;
				}
			}
		}
	}
}
