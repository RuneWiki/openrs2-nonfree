import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static141 {

	@OriginalMember(owner = "client!eu", name = "r", descriptor = "D")
	public static double aDouble17;

	@OriginalMember(owner = "client!eu", name = "K", descriptor = "Lclient!wu;")
	public static Class380 aClass380_39;

	@OriginalMember(owner = "client!eu", name = "D", descriptor = "Lclient!ju;")
	public static final Class179 aClass179_35 = new Class179(54, -1);

	@OriginalMember(owner = "client!eu", name = "E", descriptor = "I")
	public static int anInt2605 = -1;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)V")
	public static void method2159() {
		if (Static234.aClass2_Sub5_48.aClass6_Sub18_2.method5409() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static482.anInt7692 - 4 & 0xFF);
		@Pc(25) int local25 = Static482.anInt7692 % Static228.anInt3704;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static162.anInt2911; local31++) {
				Static148.aByteArrayArrayArray4[local27][local25][local31] = local21;
			}
		}
		if (Static91.anInt1705 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static410.anIntArray471[local31] = -1000000;
			Static100.anIntArray132[local31] = 1000000;
			Static179.anIntArray228[local31] = 0;
			Static560.anIntArray627[local31] = 1000000;
			Static236.anIntArray267[local31] = 0;
		}
		@Pc(93) int local93 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090;
		@Pc(96) int local96 = Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089;
		@Pc(148) int local148;
		if (Static445.anInt7122 != 1 && Static8.anInt107 == -1) {
			local148 = Static504.method6917(Static250.anInt4000, Static91.anInt1705, Static644.anInt10376);
			if (local148 - Static220.anInt3605 < 3200 && (Static27.aByteArrayArrayArray1[Static91.anInt1705][Static250.anInt4000 >> 9][Static644.anInt10376 >> 9] & 0x4) != 0) {
				Static134.method1840(false, 1, Static28.aClass53ArrayArrayArray1, Static250.anInt4000 >> 9, Static644.anInt10376 >> 9);
				return;
			}
			return;
		}
		if (Static445.anInt7122 != 1) {
			local96 = Static12.anInt159;
			local93 = Static8.anInt107;
		}
		if ((Static27.aByteArrayArrayArray1[Static91.anInt1705][local93 >> 9][local96 >> 9] & 0x4) != 0) {
			Static134.method1840(false, 0, Static28.aClass53ArrayArrayArray1, local93 >> 9, local96 >> 9);
		}
		if (Static440.anInt7072 >= 2560) {
			return;
		}
		local148 = Static250.anInt4000 >> 9;
		@Pc(152) int local152 = Static644.anInt10376 >> 9;
		@Pc(156) int local156 = local93 >> 9;
		@Pc(160) int local160 = local96 >> 9;
		@Pc(172) int local172;
		if (local148 < local156) {
			local172 = local156 - local148;
		} else {
			local172 = local148 - local156;
		}
		@Pc(187) int local187;
		if (local160 <= local152) {
			local187 = local152 - local160;
		} else {
			local187 = local160 - local152;
		}
		if ((local172 != 0 || local187 != 0) && -Static228.anInt3704 < local172 && Static228.anInt3704 > local172 && local187 > -Static162.anInt2911 && local187 < Static162.anInt2911) {
			@Pc(258) int local258;
			@Pc(260) int local260;
			if (local187 < local172) {
				local258 = local187 * 65536 / local172;
				local260 = 32768;
				while (local148 != local156) {
					if (local148 < local156) {
						local148++;
					} else if (local156 < local148) {
						local148--;
					}
					if ((Static27.aByteArrayArrayArray1[Static91.anInt1705][local148][local152] & 0x4) != 0) {
						Static134.method1840(false, 1, Static28.aClass53ArrayArrayArray1, local148, local152);
						return;
					}
					local260 += local258;
					if (local260 >= 65536) {
						local260 -= 65536;
						if (local152 < local160) {
							local152++;
						} else if (local152 > local160) {
							local152--;
						}
						if ((Static27.aByteArrayArrayArray1[Static91.anInt1705][local148][local152] & 0x4) != 0) {
							Static134.method1840(false, 1, Static28.aClass53ArrayArrayArray1, local148, local152);
							return;
						}
					}
				}
				return;
			}
			local258 = local172 * 65536 / local187;
			local260 = 32768;
			while (local160 != local152) {
				if (local160 > local152) {
					local152++;
				} else if (local160 < local152) {
					local152--;
				}
				if ((Static27.aByteArrayArrayArray1[Static91.anInt1705][local148][local152] & 0x4) != 0) {
					Static134.method1840(false, 1, Static28.aClass53ArrayArrayArray1, local148, local152);
					return;
				}
				local260 += local258;
				if (local260 >= 65536) {
					local260 -= 65536;
					if (local156 > local148) {
						local148++;
					} else if (local148 > local156) {
						local148--;
					}
					if ((Static27.aByteArrayArrayArray1[Static91.anInt1705][local148][local152] & 0x4) != 0) {
						Static134.method1840(false, 1, Static28.aClass53ArrayArrayArray1, local148, local152);
						return;
					}
				}
			}
			return;
		}
		Static163.method2447(null, "RC: " + local148 + "," + local152 + " " + local156 + "," + local160 + " " + Static132.anInt2246 + "," + Static123.anInt2176);
		return;
	}
}
