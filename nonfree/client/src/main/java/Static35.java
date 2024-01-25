import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "[Lclient!hc;")
	public static Class125[] aClass125Array1;

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_16 = new Class268(62, 10);

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public static void method612() {
		if (Static348.aClass6_Sub22_19.aClass15_Sub10_2.method2360() != 2) {
			return;
		}
		@Pc(25) byte local25 = (byte) (Static167.anInt3480 - 4 & 0xFF);
		@Pc(29) int local29 = Static167.anInt3480 % Static442.anInt7975;
		@Pc(35) int local35;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < Static284.anInt7916; local35++) {
				Static312.aByteArrayArrayArray17[local31][local29][local35] = local25;
			}
		}
		if (Static175.anInt3636 == 3) {
			return;
		}
		for (local35 = 0; local35 < 2; local35++) {
			Static502.anIntArray539[local35] = -1000000;
			Static540.anIntArray572[local35] = 1000000;
			Static360.anIntArray415[local35] = 0;
			Static112.anIntArray154[local35] = 1000000;
			Static335.anIntArray379[local35] = 0;
		}
		@Pc(96) int local96 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725;
		@Pc(99) int local99 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729;
		@Pc(114) int local114;
		if (Static334.anInt6354 != 1 && Static160.anInt3352 == -1) {
			local114 = Static138.method2248(Static580.anInt9662, Static175.anInt3636, Static524.anInt9123);
			if (local114 - Static428.anInt7788 < 3200 && (Static197.aByteArrayArrayArray24[Static175.anInt3636][Static580.anInt9662 >> 9][Static524.anInt9123 >> 9] & 0x4) != 0) {
				Static131.method2131(false, Static272.aClass97ArrayArrayArray3, Static524.anInt9123 >> 9, Static580.anInt9662 >> 9, 1);
				return;
			}
			return;
		}
		if (Static334.anInt6354 != 1) {
			local99 = Static624.anInt10280;
			local96 = Static160.anInt3352;
		}
		if ((Static197.aByteArrayArrayArray24[Static175.anInt3636][local96 >> 9][local99 >> 9] & 0x4) != 0) {
			Static131.method2131(false, Static272.aClass97ArrayArrayArray3, local99 >> 9, local96 >> 9, 0);
		}
		if (Static263.anInt5239 >= 2560) {
			return;
		}
		local114 = Static580.anInt9662 >> 9;
		@Pc(195) int local195 = Static524.anInt9123 >> 9;
		@Pc(199) int local199 = local96 >> 9;
		@Pc(203) int local203 = local99 >> 9;
		@Pc(215) int local215;
		if (local114 < local199) {
			local215 = local199 - local114;
		} else {
			local215 = local114 - local199;
		}
		@Pc(230) int local230;
		if (local203 > local195) {
			local230 = local203 - local195;
		} else {
			local230 = local195 - local203;
		}
		if (local215 == 0 && local230 == 0 || local215 <= -Static442.anInt7975 || local215 >= Static442.anInt7975 || -Static284.anInt7916 >= local230 || local230 >= Static284.anInt7916) {
			Static619.method8645((Throwable) null, "RC: " + local114 + "," + local195 + " " + local199 + "," + local203 + " " + Static606.anInt8651 + "," + Static195.anInt3961);
			return;
		}
		@Pc(309) int local309;
		@Pc(311) int local311;
		if (local215 <= local230) {
			local309 = local215 * 65536 / local230;
			local311 = 32768;
			while (local203 != local195) {
				if (local195 < local203) {
					local195++;
				} else if (local203 < local195) {
					local195--;
				}
				if ((Static197.aByteArrayArrayArray24[Static175.anInt3636][local114][local195] & 0x4) != 0) {
					Static131.method2131(false, Static272.aClass97ArrayArrayArray3, local195, local114, 1);
					return;
				}
				local311 += local309;
				if (local311 >= 65536) {
					if (local199 > local114) {
						local114++;
					} else if (local199 < local114) {
						local114--;
					}
					local311 -= 65536;
					if ((Static197.aByteArrayArrayArray24[Static175.anInt3636][local114][local195] & 0x4) != 0) {
						Static131.method2131(false, Static272.aClass97ArrayArrayArray3, local195, local114, 1);
						return;
					}
				}
			}
			return;
		}
		local309 = local230 * 65536 / local215;
		local311 = 32768;
		while (local114 != local199) {
			if (local199 > local114) {
				local114++;
			} else if (local114 > local199) {
				local114--;
			}
			if ((Static197.aByteArrayArrayArray24[Static175.anInt3636][local114][local195] & 0x4) != 0) {
				Static131.method2131(false, Static272.aClass97ArrayArrayArray3, local195, local114, 1);
				return;
			}
			local311 += local309;
			if (local311 >= 65536) {
				local311 -= 65536;
				if (local195 < local203) {
					local195++;
				} else if (local195 > local203) {
					local195--;
				}
				if ((Static197.aByteArrayArrayArray24[Static175.anInt3636][local114][local195] & 0x4) != 0) {
					Static131.method2131(false, Static272.aClass97ArrayArrayArray3, local195, local114, 1);
					return;
				}
			}
		}
	}
}
