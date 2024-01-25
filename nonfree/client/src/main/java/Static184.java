import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static184 {

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "Lclient!cq;")
	public static Class8 aClass8_17;

	@OriginalMember(owner = "client!mj", name = "m", descriptor = "[I")
	public static int[] anIntArray361;

	@OriginalMember(owner = "client!mj", name = "n", descriptor = "Lclient!lm;")
	public static Class134 aClass134_87;

	@OriginalMember(owner = "client!mj", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString140 = "Checking for updates - ";

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "(I)V")
	public static void method3250() {
		if (Static346.method5792() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static2.anInt30 - 4 & 0xFF);
		@Pc(25) int local25 = Static2.anInt30 % Static43.anInt1151;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static260.anInt5348; local31++) {
				Static263.aByteArrayArrayArray9[local27][local25][local31] = local21;
			}
		}
		if (Static127.anInt2487 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static25.anIntArray25[local31] = -1000000;
			Static207.anIntArray398[local31] = 1000000;
			Static67.anIntArray105[local31] = 0;
			Static142.anIntArray277[local31] = 1000000;
			Static111.anIntArray187[local31] = 0;
		}
		@Pc(129) int local129;
		if (Static246.anInt5156 != 1) {
			local129 = Static352.method5834(Static177.anInt3734, Static4.anInt41, Static127.anInt2487);
			if (local129 - Static117.anInt2244 >= 800 || (Static291.aByteArrayArrayArray11[Static127.anInt2487][Static4.anInt41 >> 7][Static177.anInt3734 >> 7] & 0x4) == 0) {
				return;
			}
			Static321.method5490(Static347.aClass83ArrayArrayArray3, Static4.anInt41 >> 7, 1, Static177.anInt3734 >> 7, false);
			return;
		}
		if ((Static291.aByteArrayArrayArray11[Static127.anInt2487][Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 >> 7][Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 >> 7] & 0x4) != 0) {
			Static321.method5490(Static347.aClass83ArrayArrayArray3, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 >> 7, 0, Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 >> 7, false);
		}
		if (Static338.anInt6530 >= 2560) {
			return;
		}
		local129 = Static4.anInt41 >> 7;
		@Pc(133) int local133 = Static177.anInt3734 >> 7;
		@Pc(138) int local138 = Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6728 >> 7;
		@Pc(143) int local143 = Static127.aClass10_Sub1_Sub2_Sub2_1.anInt6726 >> 7;
		@Pc(155) int local155;
		if (local129 < local138) {
			local155 = local138 - local129;
		} else {
			local155 = local129 - local138;
		}
		@Pc(172) int local172;
		if (local143 > local133) {
			local172 = local143 - local133;
		} else {
			local172 = local133 - local143;
		}
		if ((local155 != 0 || local172 != 0) && -Static43.anInt1151 < local155 && Static43.anInt1151 > local155 && local172 > -Static260.anInt5348 && Static260.anInt5348 > local172) {
			@Pc(253) int local253;
			@Pc(255) int local255;
			if (local172 >= local155) {
				local253 = local155 * 65536 / local172;
				local255 = 32768;
				while (local143 != local133) {
					if (local143 > local133) {
						local133++;
					} else if (local143 < local133) {
						local133--;
					}
					if ((Static291.aByteArrayArrayArray11[Static127.anInt2487][local129][local133] & 0x4) != 0) {
						Static321.method5490(Static347.aClass83ArrayArrayArray3, local129, 1, local133, false);
						return;
					}
					local255 += local253;
					if (local255 >= 65536) {
						if (local138 > local129) {
							local129++;
						} else if (local129 > local138) {
							local129--;
						}
						local255 -= 65536;
						if ((Static291.aByteArrayArrayArray11[Static127.anInt2487][local129][local133] & 0x4) != 0) {
							Static321.method5490(Static347.aClass83ArrayArrayArray3, local129, 1, local133, false);
							return;
						}
					}
				}
				return;
			}
			local253 = local172 * 65536 / local155;
			local255 = 32768;
			while (local129 != local138) {
				if (local138 > local129) {
					local129++;
				} else if (local138 < local129) {
					local129--;
				}
				if ((Static291.aByteArrayArrayArray11[Static127.anInt2487][local129][local133] & 0x4) != 0) {
					Static321.method5490(Static347.aClass83ArrayArrayArray3, local129, 1, local133, false);
					return;
				}
				local255 += local253;
				if (local255 >= 65536) {
					local255 -= 65536;
					if (local133 < local143) {
						local133++;
					} else if (local143 < local133) {
						local133--;
					}
					if ((Static291.aByteArrayArrayArray11[Static127.anInt2487][local129][local133] & 0x4) != 0) {
						Static321.method5490(Static347.aClass83ArrayArrayArray3, local129, 1, local133, false);
						return;
					}
				}
			}
			return;
		}
		Static268.method4816("RC: " + local129 + "," + local133 + " " + local138 + "," + local143 + " " + Static92.anInt1755 + "," + Static98.anInt1911, null);
		return;
	}
}
