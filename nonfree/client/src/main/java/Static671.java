import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static671 {

	@OriginalMember(owner = "client!wea", name = "e", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_278 = new Class160(76, -1);

	@OriginalMember(owner = "client!wea", name = "d", descriptor = "[Lclient!nca;")
	public static final Class245[] aClass245Array1 = new Class245[2048];

	@OriginalMember(owner = "client!wea", name = "a", descriptor = "(I)V")
	public static void method9289() {
		if (Static181.aClass14_Sub26_9.aClass43_Sub7_1.method2650() != 2) {
			return;
		}
		@Pc(27) byte local27 = (byte) (Static688.anInt11168 - 4 & 0xFF);
		@Pc(31) int local31 = Static688.anInt11168 % Static380.anInt6689;
		@Pc(39) int local39;
		for (@Pc(33) int local33 = 0; local33 < 4; local33++) {
			for (local39 = 0; local39 < Static542.anInt9214; local39++) {
				Static436.aByteArrayArrayArray11[local33][local31][local39] = local27;
			}
		}
		if (Static391.anInt6811 == 3) {
			return;
		}
		for (local39 = 0; local39 < 2; local39++) {
			Static275.anIntArray283[local39] = -1000000;
			Static503.anIntArray454[local39] = 1000000;
			Static384.anIntArray349[local39] = 0;
			Static143.anIntArray144[local39] = 1000000;
			Static547.anIntArray230[local39] = 0;
		}
		@Pc(113) int local113 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184;
		@Pc(116) int local116 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178;
		@Pc(175) int local175;
		if (Static304.anInt5410 != 1 && Static507.anInt8817 == -1) {
			local175 = Static388.method5919(Static229.anInt4393, Static70.anInt1085, Static391.anInt6811);
			if (local175 - Static153.anInt2372 < 3200 && (Static446.aByteArrayArrayArray12[Static391.anInt6811][Static70.anInt1085 >> 9][Static229.anInt4393 >> 9] & 0x4) != 0) {
				Static15.method271(Static63.aClass89ArrayArrayArray1, false, Static229.anInt4393 >> 9, Static70.anInt1085 >> 9, 1);
				return;
			}
			return;
		}
		if (Static304.anInt5410 != 1) {
			local116 = Static124.anInt2024;
			local113 = Static507.anInt8817;
		}
		if ((Static446.aByteArrayArrayArray12[Static391.anInt6811][local113 >> 9][local116 >> 9] & 0x4) != 0) {
			Static15.method271(Static63.aClass89ArrayArrayArray1, false, local116 >> 9, local113 >> 9, 0);
		}
		if (Static126.anInt9524 >= 2560) {
			return;
		}
		local175 = Static70.anInt1085 >> 9;
		@Pc(179) int local179 = Static229.anInt4393 >> 9;
		@Pc(183) int local183 = local113 >> 9;
		@Pc(187) int local187 = local116 >> 9;
		@Pc(195) int local195;
		if (local175 < local183) {
			local195 = local183 - local175;
		} else {
			local195 = local175 - local183;
		}
		@Pc(214) int local214;
		if (local187 > local179) {
			local214 = local187 - local179;
		} else {
			local214 = local179 - local187;
		}
		if ((local195 != 0 || local214 != 0) && local195 > -Static380.anInt6689 && local195 < Static380.anInt6689 && local214 > -Static542.anInt9214 && Static542.anInt9214 > local214) {
			@Pc(303) int local303;
			@Pc(305) int local305;
			if (local214 >= local195) {
				local303 = local195 * 65536 / local214;
				local305 = 32768;
				while (local187 != local179) {
					if (local187 > local179) {
						local179++;
					} else if (local179 > local187) {
						local179--;
					}
					if ((Static446.aByteArrayArrayArray12[Static391.anInt6811][local175][local179] & 0x4) != 0) {
						Static15.method271(Static63.aClass89ArrayArrayArray1, false, local179, local175, 1);
						return;
					}
					local305 += local303;
					if (local305 >= 65536) {
						local305 -= 65536;
						if (local183 > local175) {
							local175++;
						} else if (local183 < local175) {
							local175--;
						}
						if ((Static446.aByteArrayArrayArray12[Static391.anInt6811][local175][local179] & 0x4) != 0) {
							Static15.method271(Static63.aClass89ArrayArrayArray1, false, local179, local175, 1);
							return;
						}
					}
				}
				return;
			}
			local303 = local214 * 65536 / local195;
			local305 = 32768;
			while (local175 != local183) {
				if (local175 < local183) {
					local175++;
				} else if (local175 > local183) {
					local175--;
				}
				if ((Static446.aByteArrayArrayArray12[Static391.anInt6811][local175][local179] & 0x4) != 0) {
					Static15.method271(Static63.aClass89ArrayArrayArray1, false, local179, local175, 1);
					return;
				}
				local305 += local303;
				if (local305 >= 65536) {
					if (local187 > local179) {
						local179++;
					} else if (local179 > local187) {
						local179--;
					}
					local305 -= 65536;
					if ((Static446.aByteArrayArrayArray12[Static391.anInt6811][local175][local179] & 0x4) != 0) {
						Static15.method271(Static63.aClass89ArrayArrayArray1, false, local179, local175, 1);
						return;
					}
				}
			}
			return;
		}
		Static629.method8829("RC: " + local175 + "," + local179 + " " + local183 + "," + local187 + " " + Static36.anInt617 + "," + Static550.anInt9242, (Throwable) null);
		return;
	}
}
