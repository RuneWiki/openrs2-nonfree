import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
	public static int anInt3883;

	@OriginalMember(owner = "client!hga", name = "n", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_80 = new Class73(75, 12);

	@OriginalMember(owner = "client!hga", name = "p", descriptor = "Z")
	public static boolean aBoolean266 = true;

	@OriginalMember(owner = "client!hga", name = "q", descriptor = "Lclient!hm;")
	public static final Class136 aClass136_46 = new Class136(3000000, 200);

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V")
	public static void method3405() {
		if (Static140.aClass6_Sub48_Sub1_1.method7391(Static560.anInt9242) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static534.anInt8855 - 4 & 0xFF);
		@Pc(25) int local25 = Static534.anInt8855 % Static473.anInt8075;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static165.anInt6749; local31++) {
				Static273.aByteArrayArrayArray19[local27][local25][local31] = local21;
			}
		}
		if (Static97.anInt1863 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static238.anIntArray561[local31] = -1000000;
			Static319.anIntArray434[local31] = 1000000;
			Static42.anIntArray47[local31] = 0;
			Static357.anIntArray471[local31] = 1000000;
			Static206.anIntArray263[local31] = 0;
		}
		@Pc(134) int local134;
		if (Static346.anInt6215 != 1) {
			local134 = Static160.method2951(Static322.anInt5904, Static371.anInt6572, Static97.anInt1863);
			if (local134 - Static111.anInt2160 >= 3200 || (Static154.aByteArrayArrayArray4[Static97.anInt1863][Static371.anInt6572 >> 9][Static322.anInt5904 >> 9] & 0x4) == 0) {
				return;
			}
			Static70.method3540(Static270.aClass276ArrayArrayArray2, false, 1, Static371.anInt6572 >> 9, Static322.anInt5904 >> 9);
			return;
		}
		if ((Static154.aByteArrayArrayArray4[Static97.anInt1863][Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 >> 9][Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 >> 9] & 0x4) != 0) {
			Static70.method3540(Static270.aClass276ArrayArrayArray2, false, 0, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 >> 9, Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 >> 9);
		}
		if (Static67.anInt1407 >= 2560) {
			return;
		}
		local134 = Static371.anInt6572 >> 9;
		@Pc(138) int local138 = Static322.anInt5904 >> 9;
		@Pc(143) int local143 = Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9542 >> 9;
		@Pc(148) int local148 = Static328.aClass4_Sub1_Sub1_Sub2_2.anInt9540 >> 9;
		@Pc(155) int local155;
		if (local143 > local134) {
			local155 = local143 - local134;
		} else {
			local155 = local134 - local143;
		}
		@Pc(170) int local170;
		if (local148 > local138) {
			local170 = local148 - local138;
		} else {
			local170 = local138 - local148;
		}
		if ((local155 != 0 || local170 != 0) && local155 > (-Static473.anInt8075) && Static473.anInt8075 > local155 && -Static165.anInt6749 < local170 && Static165.anInt6749 > local170) {
			@Pc(245) int local245;
			@Pc(247) int local247;
			if (local155 > local170) {
				local245 = local170 * 65536 / local155;
				local247 = 32768;
				while (local134 != local143) {
					if (local134 < local143) {
						local134++;
					} else if (local143 < local134) {
						local134--;
					}
					if ((Static154.aByteArrayArrayArray4[Static97.anInt1863][local134][local138] & 0x4) != 0) {
						Static70.method3540(Static270.aClass276ArrayArrayArray2, false, 1, local134, local138);
						return;
					}
					local247 += local245;
					if (local247 >= 65536) {
						if (local138 < local148) {
							local138++;
						} else if (local148 < local138) {
							local138--;
						}
						local247 -= 65536;
						if ((Static154.aByteArrayArrayArray4[Static97.anInt1863][local134][local138] & 0x4) != 0) {
							Static70.method3540(Static270.aClass276ArrayArrayArray2, false, 1, local134, local138);
							return;
						}
					}
				}
				return;
			}
			local245 = local155 * 65536 / local170;
			local247 = 32768;
			while (local138 != local148) {
				if (local148 > local138) {
					local138++;
				} else if (local148 < local138) {
					local138--;
				}
				if ((Static154.aByteArrayArrayArray4[Static97.anInt1863][local134][local138] & 0x4) != 0) {
					Static70.method3540(Static270.aClass276ArrayArrayArray2, false, 1, local134, local138);
					return;
				}
				local247 += local245;
				if (local247 >= 65536) {
					local247 -= 65536;
					if (local134 < local143) {
						local134++;
					} else if (local134 > local143) {
						local134--;
					}
					if ((Static154.aByteArrayArrayArray4[Static97.anInt1863][local134][local138] & 0x4) != 0) {
						Static70.method3540(Static270.aClass276ArrayArrayArray2, false, 1, local134, local138);
						return;
					}
				}
			}
			return;
		}
		Static256.method4328("RC: " + local134 + "," + local138 + " " + local143 + "," + local148 + " " + Static39.anInt4952 + "," + Static138.anInt3088, null);
		return;
	}
}
