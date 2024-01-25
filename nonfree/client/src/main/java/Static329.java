import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "I")
	public static int anInt6334;

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_140 = new Class362(28, 6);

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)V")
	public static void method5382() {
		Static560.aClass225Array2 = null;
		Static425.method6641(-1, Static375.anInt7256, Static554.anInt9828, 0, 0, 0, Static332.anInt6370, 0);
		if (Static560.aClass225Array2 != null) {
			Static116.method2479(Static554.anInt9828, Static177.anInt9183, Static167.aClass225_16.anInt6524, Static375.anInt7256, Static560.aClass225Array2, 0, Static177.anInt9179, -1412584499, 0);
			Static560.aClass225Array2 = null;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)V")
	public static void method5383() {
		if (Static214.aClass4_Sub19_Sub1_1.method2794(Static495.anInt9000) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static203.anInt3850 - 4 & 0xFF);
		@Pc(28) int local28 = Static203.anInt3850 % Static428.anInt8046;
		@Pc(34) int local34;
		for (@Pc(30) int local30 = 0; local30 < 4; local30++) {
			for (local34 = 0; local34 < Static119.anInt2717; local34++) {
				Static483.aByteArrayArrayArray18[local30][local28][local34] = local19;
			}
		}
		if (Static13.anInt231 == 3) {
			return;
		}
		for (local34 = 0; local34 < 2; local34++) {
			Static207.anIntArray189[local34] = -1000000;
			Static87.anIntArray85[local34] = 1000000;
			Static50.anIntArray28[local34] = 0;
			Static434.anIntArray425[local34] = 1000000;
			Static126.anIntArray130[local34] = 0;
		}
		@Pc(93) int local93 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9934;
		@Pc(96) int local96 = Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.anInt9935;
		@Pc(111) int local111;
		if (Static166.anInt3419 != 1 && Static326.anInt6302 == -1) {
			local111 = Static501.method5641(Static24.anInt387, Static13.anInt231, Static110.anInt2624);
			if (local111 - Static209.anInt3913 < 3200 && (Static262.aByteArrayArrayArray16[Static13.anInt231][Static24.anInt387 >> 9][Static110.anInt2624 >> 9] & 0x4) != 0) {
				Static203.method3443(Static110.anInt2624 >> 9, Static60.aClass53ArrayArrayArray1, false, Static24.anInt387 >> 9, 1);
				return;
			}
			return;
		}
		if (Static166.anInt3419 != 1) {
			local93 = Static326.anInt6302;
			local96 = Static214.anInt3969;
		}
		if ((Static262.aByteArrayArrayArray16[Static13.anInt231][local93 >> 9][local96 >> 9] & 0x4) != 0) {
			Static203.method3443(local96 >> 9, Static60.aClass53ArrayArrayArray1, false, local93 >> 9, 0);
		}
		if (Static232.anInt4203 >= 2560) {
			return;
		}
		local111 = Static24.anInt387 >> 9;
		@Pc(198) int local198 = Static110.anInt2624 >> 9;
		@Pc(202) int local202 = local93 >> 9;
		@Pc(206) int local206 = local96 >> 9;
		@Pc(214) int local214;
		if (local202 > local111) {
			local214 = local202 - local111;
		} else {
			local214 = local111 - local202;
		}
		@Pc(228) int local228;
		if (local198 >= local206) {
			local228 = local198 - local206;
		} else {
			local228 = local206 - local198;
		}
		if (local214 == 0 && local228 == 0 || local214 <= -Static428.anInt8046 || Static428.anInt8046 <= local214 || local228 <= -Static119.anInt2717 || Static119.anInt2717 <= local228) {
			Static205.method3450("RC: " + local111 + "," + local198 + " " + local202 + "," + local206 + " " + Static552.anInt9805 + "," + Static254.anInt4667, null);
			return;
		}
		@Pc(311) int local311;
		@Pc(313) int local313;
		if (local228 < local214) {
			local311 = local228 * 65536 / local214;
			local313 = 32768;
			while (local111 != local202) {
				if (local111 < local202) {
					local111++;
				} else if (local202 < local111) {
					local111--;
				}
				if ((Static262.aByteArrayArrayArray16[Static13.anInt231][local111][local198] & 0x4) != 0) {
					Static203.method3443(local198, Static60.aClass53ArrayArrayArray1, false, local111, 1);
					return;
				}
				local313 += local311;
				if (local313 >= 65536) {
					if (local206 > local198) {
						local198++;
					} else if (local206 < local198) {
						local198--;
					}
					local313 -= 65536;
					if ((Static262.aByteArrayArrayArray16[Static13.anInt231][local111][local198] & 0x4) != 0) {
						Static203.method3443(local198, Static60.aClass53ArrayArrayArray1, false, local111, 1);
						return;
					}
				}
			}
			return;
		}
		local311 = local214 * 65536 / local228;
		local313 = 32768;
		while (local198 != local206) {
			if (local206 > local198) {
				local198++;
			} else if (local198 > local206) {
				local198--;
			}
			if ((Static262.aByteArrayArrayArray16[Static13.anInt231][local111][local198] & 0x4) != 0) {
				Static203.method3443(local198, Static60.aClass53ArrayArrayArray1, false, local111, 1);
				return;
			}
			local313 += local311;
			if (local313 >= 65536) {
				local313 -= 65536;
				if (local202 > local111) {
					local111++;
				} else if (local202 < local111) {
					local111--;
				}
				if ((Static262.aByteArrayArrayArray16[Static13.anInt231][local111][local198] & 0x4) != 0) {
					Static203.method3443(local198, Static60.aClass53ArrayArrayArray1, false, local111, 1);
					return;
				}
			}
		}
	}
}
