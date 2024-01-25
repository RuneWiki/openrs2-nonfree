import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!bg", name = "c", descriptor = "Lclient!gj;")
	public static Class31 aClass31_13;

	@OriginalMember(owner = "client!bg", name = "l", descriptor = "I")
	public static int anInt455 = 0;

	@OriginalMember(owner = "client!bg", name = "n", descriptor = "Z")
	public static boolean aBoolean59 = true;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V")
	public static void method692() {
		if (Static116.method2494() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static241.anInt4651 - 4 & 0xFF);
		@Pc(23) int local23 = Static241.anInt4651 % Static95.anInt6381;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static237.anInt4532; local29++) {
				Static66.aByteArrayArrayArray3[local25][local23][local29] = local19;
			}
		}
		if (Static182.anInt3603 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static110.anIntArray224[local29] = -1000000;
			Static183.anIntArray295[local29] = 1000000;
			Static209.anIntArray371[local29] = 0;
			Static47.anIntArray90[local29] = 1000000;
			Static183.anIntArray296[local29] = 0;
		}
		@Pc(127) int local127;
		if (Static182.anInt3602 != 1) {
			local127 = Static138.method2745(Static182.anInt3603, Static287.anInt5819, Static290.anInt5837);
			if (local127 - Static163.anInt1495 >= 800 || (Static313.aByteArrayArrayArray12[Static182.anInt3603][Static287.anInt5819 >> 7][Static290.anInt5837 >> 7] & 0x4) == 0) {
				return;
			}
			Static159.method3018(1, Static287.anInt5819 >> 7, false, Static275.aClass8ArrayArrayArray4, Static290.anInt5837 >> 7);
			return;
		}
		if ((Static313.aByteArrayArrayArray12[Static182.anInt3603][Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 >> 7][Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 >> 7] & 0x4) != 0) {
			Static159.method3018(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 >> 7, false, Static275.aClass8ArrayArrayArray4, Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 >> 7);
		}
		if (Static283.anInt5723 >= 2560) {
			return;
		}
		local127 = Static287.anInt5819 >> 7;
		@Pc(131) int local131 = Static290.anInt5837 >> 7;
		@Pc(136) int local136 = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 >> 7;
		@Pc(141) int local141 = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280 >> 7;
		@Pc(148) int local148;
		if (local127 < local136) {
			local148 = local136 - local127;
		} else {
			local148 = local127 - local136;
		}
		@Pc(163) int local163;
		if (local131 >= local141) {
			local163 = local131 - local141;
		} else {
			local163 = local141 - local131;
		}
		if ((local148 != 0 || local163 != 0) && local148 > (-Static95.anInt6381) && local148 < Static95.anInt6381 && local163 > -Static237.anInt4532 && local163 < Static237.anInt4532) {
			@Pc(239) int local239;
			@Pc(241) int local241;
			if (local148 > local163) {
				local239 = local163 * 65536 / local148;
				local241 = 32768;
				while (local136 != local127) {
					if (local136 > local127) {
						local127++;
					} else if (local127 > local136) {
						local127--;
					}
					if ((Static313.aByteArrayArrayArray12[Static182.anInt3603][local127][local131] & 0x4) != 0) {
						Static159.method3018(1, local127, false, Static275.aClass8ArrayArrayArray4, local131);
						return;
					}
					local241 += local239;
					if (local241 >= 65536) {
						local241 -= 65536;
						if (local141 > local131) {
							local131++;
						} else if (local141 < local131) {
							local131--;
						}
						if ((Static313.aByteArrayArrayArray12[Static182.anInt3603][local127][local131] & 0x4) != 0) {
							Static159.method3018(1, local127, false, Static275.aClass8ArrayArrayArray4, local131);
							return;
						}
					}
				}
				return;
			}
			local239 = local148 * 65536 / local163;
			local241 = 32768;
			while (local131 != local141) {
				if (local141 > local131) {
					local131++;
				} else if (local141 < local131) {
					local131--;
				}
				if ((Static313.aByteArrayArrayArray12[Static182.anInt3603][local127][local131] & 0x4) != 0) {
					Static159.method3018(1, local127, false, Static275.aClass8ArrayArrayArray4, local131);
					return;
				}
				local241 += local239;
				if (local241 >= 65536) {
					local241 -= 65536;
					if (local136 > local127) {
						local127++;
					} else if (local127 > local136) {
						local127--;
					}
					if ((Static313.aByteArrayArrayArray12[Static182.anInt3603][local127][local131] & 0x4) != 0) {
						Static159.method3018(1, local127, false, Static275.aClass8ArrayArrayArray4, local131);
						return;
					}
				}
			}
			return;
		}
		Static69.method1566("RC: " + local127 + "," + local131 + " " + local136 + "," + local141 + " " + Static138.anInt2879 + "," + Static342.anInt6864, null);
		return;
	}
}
