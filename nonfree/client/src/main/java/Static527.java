import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static527 {

	@OriginalMember(owner = "client!vw", name = "Gb", descriptor = "I")
	public static int anInt9214;

	@OriginalMember(owner = "client!vw", name = "T", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_68 = new Class125(20);

	@OriginalMember(owner = "client!vw", name = "Hb", descriptor = "[Lclient!eba;")
	public static Class68_Sub1[] aClass68_Sub1Array2 = new Class68_Sub1[0];

	@OriginalMember(owner = "client!vw", name = "Lb", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_148 = new Class67("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!vw", name = "Mb", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_123 = new Class158(80, 3);

	@OriginalMember(owner = "client!vw", name = "k", descriptor = "(B)V")
	public static void method7614() {
		if (Static7.aClass3_Sub15_Sub1_1.method6964(Static382.anInt7091) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static127.anInt2665 - 4 & 0xFF);
		@Pc(25) int local25 = Static127.anInt2665 % Static118.anInt2527;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static549.anInt9482; local31++) {
				Static58.aByteArrayArrayArray2[local27][local25][local31] = local21;
			}
		}
		if (Static420.anInt7829 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static42.anIntArray135[local31] = -1000000;
			Static526.anIntArray769[local31] = 1000000;
			Static188.anIntArray401[local31] = 0;
			Static227.anIntArray437[local31] = 1000000;
			Static142.anIntArray281[local31] = 0;
		}
		@Pc(103) int local103;
		if (Static305.anInt5998 != 1) {
			local103 = Static58.method1166(Static329.anInt6297, Static311.anInt6050, Static420.anInt7829);
			if (local103 - Static347.anInt6620 < 3200 && (Static232.aByteArrayArrayArray18[Static420.anInt7829][Static311.anInt6050 >> 9][Static329.anInt6297 >> 9] & 0x4) != 0) {
				Static519.method7385(1, false, Static311.anInt6050 >> 9, Static279.aClass290ArrayArrayArray7, Static329.anInt6297 >> 9);
				return;
			}
			return;
		}
		if ((Static232.aByteArrayArrayArray18[Static420.anInt7829][Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 >> 9][Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 >> 9] & 0x4) != 0) {
			Static519.method7385(0, false, Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 >> 9, Static279.aClass290ArrayArrayArray7, Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 >> 9);
		}
		if (Static27.anInt778 >= 2560) {
			return;
		}
		local103 = Static311.anInt6050 >> 9;
		@Pc(182) int local182 = Static329.anInt6297 >> 9;
		@Pc(187) int local187 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 >> 9;
		@Pc(192) int local192 = Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 >> 9;
		@Pc(199) int local199;
		if (local187 <= local103) {
			local199 = local103 - local187;
		} else {
			local199 = local187 - local103;
		}
		@Pc(218) int local218;
		if (local192 > local182) {
			local218 = local192 - local182;
		} else {
			local218 = local182 - local192;
		}
		if (local199 == 0 && local218 == 0 || -Static118.anInt2527 >= local199 || Static118.anInt2527 <= local199 || -Static549.anInt9482 >= local218 || Static549.anInt9482 <= local218) {
			Static2.method220(null, "RC: " + local103 + "," + local182 + " " + local187 + "," + local192 + " " + Static223.anInt4827 + "," + Static150.anInt3027);
			return;
		}
		@Pc(294) int local294;
		@Pc(296) int local296;
		if (local199 > local218) {
			local294 = local218 * 65536 / local199;
			local296 = 32768;
			while (local103 != local187) {
				if (local187 > local103) {
					local103++;
				} else if (local187 < local103) {
					local103--;
				}
				if ((Static232.aByteArrayArrayArray18[Static420.anInt7829][local103][local182] & 0x4) != 0) {
					Static519.method7385(1, false, local103, Static279.aClass290ArrayArrayArray7, local182);
					return;
				}
				local296 += local294;
				if (local296 >= 65536) {
					if (local192 > local182) {
						local182++;
					} else if (local182 > local192) {
						local182--;
					}
					local296 -= 65536;
					if ((Static232.aByteArrayArrayArray18[Static420.anInt7829][local103][local182] & 0x4) != 0) {
						Static519.method7385(1, false, local103, Static279.aClass290ArrayArrayArray7, local182);
						return;
					}
				}
			}
			return;
		}
		local294 = local199 * 65536 / local218;
		local296 = 32768;
		while (local182 != local192) {
			if (local182 < local192) {
				local182++;
			} else if (local182 > local192) {
				local182--;
			}
			if ((Static232.aByteArrayArrayArray18[Static420.anInt7829][local103][local182] & 0x4) != 0) {
				Static519.method7385(1, false, local103, Static279.aClass290ArrayArrayArray7, local182);
				return;
			}
			local296 += local294;
			if (local296 >= 65536) {
				if (local103 < local187) {
					local103++;
				} else if (local187 < local103) {
					local103--;
				}
				local296 -= 65536;
				if ((Static232.aByteArrayArrayArray18[Static420.anInt7829][local103][local182] & 0x4) != 0) {
					Static519.method7385(1, false, local103, Static279.aClass290ArrayArrayArray7, local182);
					return;
				}
			}
		}
	}
}
