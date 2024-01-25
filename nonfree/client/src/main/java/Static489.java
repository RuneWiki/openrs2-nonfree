import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static489 {

	@OriginalMember(owner = "client!qt", name = "k", descriptor = "Z")
	public static boolean aBoolean607 = false;

	@OriginalMember(owner = "client!qt", name = "q", descriptor = "Z")
	public static boolean aBoolean608 = false;

	@OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
	public static int anInt8413 = -2;

	@OriginalMember(owner = "client!qt", name = "c", descriptor = "(I)V")
	public static void method7159() {
		if (Static655.aClass5_Sub36_29.aClass2_Sub21_1.method7492() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static219.anInt3472 - 4 & 0xFF);
		@Pc(23) int local23 = Static219.anInt3472 % Static124.anInt2150;
		@Pc(28) int local28;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local28 = 0; local28 < Static64.anInt1015; local28++) {
				Static664.aByteArrayArrayArray18[local25][local23][local28] = local19;
			}
		}
		if (Static458.anInt7955 == 3) {
			return;
		}
		for (local28 = 0; local28 < 2; local28++) {
			Static48.anIntArray53[local28] = -1000000;
			Static553.anIntArray494[local28] = 1000000;
			Static571.anIntArray514[local28] = 0;
			Static655.anIntArray597[local28] = 1000000;
			Static196.anIntArray177[local28] = 0;
		}
		@Pc(81) int local81 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366;
		@Pc(84) int local84 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367;
		@Pc(98) int local98;
		if (Static133.anInt2254 != 1 && Static297.anInt571 == -1) {
			local98 = Static161.method1246(Static458.anInt7955, Static105.anInt1868, Static570.anInt9347);
			if (local98 - Static546.anInt8938 < 3200 && (Static317.aByteArrayArrayArray13[Static458.anInt7955][Static570.anInt9347 >> 9][Static105.anInt1868 >> 9] & 0x4) != 0) {
				Static406.method5941(1, Static105.anInt1868 >> 9, false, Static129.aClass313ArrayArrayArray7, Static570.anInt9347 >> 9);
				return;
			}
			return;
		}
		if (Static133.anInt2254 != 1) {
			local81 = Static297.anInt571;
			local84 = Static67.anInt1033;
		}
		if ((Static317.aByteArrayArrayArray13[Static458.anInt7955][local81 >> 9][local84 >> 9] & 0x4) != 0) {
			Static406.method5941(0, local84 >> 9, false, Static129.aClass313ArrayArrayArray7, local81 >> 9);
		}
		if (Static498.anInt8495 >= 2560) {
			return;
		}
		local98 = Static570.anInt9347 >> 9;
		@Pc(187) int local187 = Static105.anInt1868 >> 9;
		@Pc(191) int local191 = local81 >> 9;
		@Pc(195) int local195 = local84 >> 9;
		@Pc(206) int local206;
		if (local98 >= local191) {
			local206 = local98 - local191;
		} else {
			local206 = local191 - local98;
		}
		@Pc(224) int local224;
		if (local195 <= local187) {
			local224 = local187 - local195;
		} else {
			local224 = local195 - local187;
		}
		if (local206 == 0 && local224 == 0 || -Static124.anInt2150 >= local206 || Static124.anInt2150 <= local206 || local224 <= -Static64.anInt1015 || Static64.anInt1015 <= local224) {
			Static17.method268("RC: " + local98 + "," + local187 + " " + local191 + "," + local195 + " " + Static454.anInt7910 + "," + Static48.anInt750, (Throwable) null);
			return;
		}
		@Pc(295) int local295;
		@Pc(297) int local297;
		if (local206 > local224) {
			local295 = local224 * 65536 / local206;
			local297 = 32768;
			while (local191 != local98) {
				if (local98 < local191) {
					local98++;
				} else if (local191 < local98) {
					local98--;
				}
				if ((Static317.aByteArrayArrayArray13[Static458.anInt7955][local98][local187] & 0x4) != 0) {
					Static406.method5941(1, local187, false, Static129.aClass313ArrayArrayArray7, local98);
					return;
				}
				local297 += local295;
				if (local297 >= 65536) {
					local297 -= 65536;
					if (local187 < local195) {
						local187++;
					} else if (local195 < local187) {
						local187--;
					}
					if ((Static317.aByteArrayArrayArray13[Static458.anInt7955][local98][local187] & 0x4) != 0) {
						Static406.method5941(1, local187, false, Static129.aClass313ArrayArrayArray7, local98);
						return;
					}
				}
			}
			return;
		}
		local295 = local206 * 65536 / local224;
		local297 = 32768;
		while (local187 != local195) {
			if (local187 < local195) {
				local187++;
			} else if (local187 > local195) {
				local187--;
			}
			if ((Static317.aByteArrayArrayArray13[Static458.anInt7955][local98][local187] & 0x4) != 0) {
				Static406.method5941(1, local187, false, Static129.aClass313ArrayArrayArray7, local98);
				return;
			}
			local297 += local295;
			if (local297 >= 65536) {
				if (local98 < local191) {
					local98++;
				} else if (local98 > local191) {
					local98--;
				}
				local297 -= 65536;
				if ((Static317.aByteArrayArrayArray13[Static458.anInt7955][local98][local187] & 0x4) != 0) {
					Static406.method5941(1, local187, false, Static129.aClass313ArrayArrayArray7, local98);
					return;
				}
			}
		}
	}
}
