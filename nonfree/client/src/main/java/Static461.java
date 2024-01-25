import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
	public static int anInt8356;

	@OriginalMember(owner = "client!sw", name = "y", descriptor = "Lclient!ev;")
	public static Class95 aClass95_1;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V")
	public static void method6916() {
		Static304.anIntArray414 = Static533.method7879(0.4F);
	}

	@OriginalMember(owner = "client!sw", name = "b", descriptor = "(I)V")
	public static void method6919() {
		if (Static208.aClass12_Sub10_Sub1_1.method2046(Static148.anInt6867) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static491.anInt8889 - 4 & 0xFF);
		@Pc(23) int local23 = Static491.anInt8889 % Static37.anInt7512;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static329.anInt6247; local29++) {
				Static245.aByteArrayArrayArray19[local25][local23][local29] = local19;
			}
		}
		if (Static56.anInt1418 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static475.anIntArray644[local29] = -1000000;
			Static138.anIntArray232[local29] = 1000000;
			Static487.anIntArray656[local29] = 0;
			Static224.anIntArray633[local29] = 1000000;
			Static149.anIntArray245[local29] = 0;
		}
		@Pc(92) int local92;
		if (Static242.anInt4993 != 1) {
			local92 = Static443.method6717(Static368.anInt6832, Static6.anInt93, Static56.anInt1418);
			if (local92 - Static62.anInt1472 < 800 && (Static387.aByteArrayArrayArray18[Static56.anInt1418][Static368.anInt6832 >> 7][Static6.anInt93 >> 7] & 0x4) != 0) {
				Static512.method7597(Static120.aClass37ArrayArrayArray1, 1, Static368.anInt6832 >> 7, false, Static6.anInt93 >> 7);
			}
			return;
		}
		if ((Static387.aByteArrayArrayArray18[Static56.anInt1418][Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 >> 7][Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 >> 7] & 0x4) != 0) {
			Static512.method7597(Static120.aClass37ArrayArrayArray1, 0, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 >> 7, false, Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 >> 7);
		}
		if (Static519.anInt9341 >= 2560) {
			return;
		}
		local92 = Static368.anInt6832 >> 7;
		@Pc(170) int local170 = Static6.anInt93 >> 7;
		@Pc(175) int local175 = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9418 >> 7;
		@Pc(180) int local180 = Static440.aClass30_Sub1_Sub1_Sub1_2.anInt9416 >> 7;
		@Pc(191) int local191;
		if (local175 <= local92) {
			local191 = local92 - local175;
		} else {
			local191 = local175 - local92;
		}
		@Pc(210) int local210;
		if (local180 <= local170) {
			local210 = local170 - local180;
		} else {
			local210 = local180 - local170;
		}
		if (local191 == 0 && local210 == 0 || local191 <= -Static37.anInt7512 || local191 >= Static37.anInt7512 || -Static329.anInt6247 >= local210 || local210 >= Static329.anInt6247) {
			Static508.method7541(null, "RC: " + local92 + "," + local170 + " " + local175 + "," + local180 + " " + Static61.anInt1459 + "," + Static203.anInt4534);
			return;
		}
		@Pc(286) int local286;
		@Pc(288) int local288;
		if (local210 < local191) {
			local286 = local210 * 65536 / local191;
			local288 = 32768;
			while (local92 != local175) {
				if (local175 > local92) {
					local92++;
				} else if (local175 < local92) {
					local92--;
				}
				if ((Static387.aByteArrayArrayArray18[Static56.anInt1418][local92][local170] & 0x4) != 0) {
					Static512.method7597(Static120.aClass37ArrayArrayArray1, 1, local92, false, local170);
					break;
				}
				local288 += local286;
				if (local288 >= 65536) {
					if (local170 < local180) {
						local170++;
					} else if (local170 > local180) {
						local170--;
					}
					local288 -= 65536;
					if ((Static387.aByteArrayArrayArray18[Static56.anInt1418][local92][local170] & 0x4) != 0) {
						Static512.method7597(Static120.aClass37ArrayArrayArray1, 1, local92, false, local170);
						break;
					}
				}
			}
			return;
		}
		local286 = local191 * 65536 / local210;
		local288 = 32768;
		while (local180 != local170) {
			if (local170 < local180) {
				local170++;
			} else if (local170 > local180) {
				local170--;
			}
			if ((Static387.aByteArrayArrayArray18[Static56.anInt1418][local92][local170] & 0x4) != 0) {
				Static512.method7597(Static120.aClass37ArrayArrayArray1, 1, local92, false, local170);
				break;
			}
			local288 += local286;
			if (local288 >= 65536) {
				if (local175 > local92) {
					local92++;
				} else if (local175 < local92) {
					local92--;
				}
				local288 -= 65536;
				if ((Static387.aByteArrayArrayArray18[Static56.anInt1418][local92][local170] & 0x4) != 0) {
					Static512.method7597(Static120.aClass37ArrayArrayArray1, 1, local92, false, local170);
					break;
				}
			}
		}
	}
}
