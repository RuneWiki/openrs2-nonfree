import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
	public static int anInt5975;

	@OriginalMember(owner = "client!ku", name = "C", descriptor = "Z")
	public static boolean aBoolean465 = false;

	@OriginalMember(owner = "client!ku", name = "E", descriptor = "Z")
	public static boolean aBoolean466 = false;

	@OriginalMember(owner = "client!ku", name = "R", descriptor = "Z")
	public static boolean aBoolean467 = false;

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)V")
	public static void method5035() {
		if (Static227.aClass3_Sub15_11.aClass17_Sub11_1.method4522() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static156.anInt5851 - 4 & 0xFF);
		@Pc(25) int local25 = Static156.anInt5851 % Static251.anInt4680;
		@Pc(35) int local35;
		for (@Pc(31) int local31 = 0; local31 < 4; local31++) {
			for (local35 = 0; local35 < Static406.anInt6924; local35++) {
				Static588.aByteArrayArrayArray18[local31][local25][local35] = local21;
			}
		}
		if (Static576.anInt9136 == 3) {
			return;
		}
		for (local35 = 0; local35 < 2; local35++) {
			Static112.anIntArray151[local35] = -1000000;
			Static457.anIntArray475[local35] = 1000000;
			Static384.anIntArray26[local35] = 0;
			Static676.anIntArray669[local35] = 1000000;
			Static309.anIntArray373[local35] = 0;
		}
		@Pc(94) int local94 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108;
		@Pc(97) int local97 = Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109;
		@Pc(147) int local147;
		if (Static378.anInt6662 != 1 && Static65.anInt1581 == -1) {
			local147 = Static194.method5133(Static97.anInt2082, Static663.anInt10236, Static576.anInt9136);
			if (local147 - Static265.anInt9363 < 3200 && (Static338.aByteArrayArrayArray13[Static576.anInt9136][Static97.anInt2082 >> 9][Static663.anInt10236 >> 9] & 0x4) != 0) {
				Static32.method1022(Static97.anInt2082 >> 9, 1, Static663.anInt10236 >> 9, false, Static332.aClass247ArrayArrayArray1);
				return;
			}
			return;
		}
		if (Static378.anInt6662 != 1) {
			local94 = Static65.anInt1581;
			local97 = Static18.anInt682;
		}
		if ((Static338.aByteArrayArrayArray13[Static576.anInt9136][local94 >> 9][local97 >> 9] & 0x4) != 0) {
			Static32.method1022(local94 >> 9, 0, local97 >> 9, false, Static332.aClass247ArrayArrayArray1);
		}
		if (Static118.anInt2323 >= 2560) {
			return;
		}
		local147 = Static97.anInt2082 >> 9;
		@Pc(151) int local151 = Static663.anInt10236 >> 9;
		@Pc(155) int local155 = local94 >> 9;
		@Pc(159) int local159 = local97 >> 9;
		@Pc(167) int local167;
		if (local147 < local155) {
			local167 = local155 - local147;
		} else {
			local167 = local147 - local155;
		}
		@Pc(186) int local186;
		if (local159 > local151) {
			local186 = local159 - local151;
		} else {
			local186 = local151 - local159;
		}
		if ((local167 != 0 || local186 != 0) && -Static251.anInt4680 < local167 && local167 < Static251.anInt4680 && local186 > -Static406.anInt6924 && Static406.anInt6924 > local186) {
			@Pc(266) int local266;
			@Pc(268) int local268;
			if (local167 <= local186) {
				local266 = local167 * 65536 / local186;
				local268 = 32768;
				while (local159 != local151) {
					if (local151 < local159) {
						local151++;
					} else if (local151 > local159) {
						local151--;
					}
					if ((Static338.aByteArrayArrayArray13[Static576.anInt9136][local147][local151] & 0x4) != 0) {
						Static32.method1022(local147, 1, local151, false, Static332.aClass247ArrayArrayArray1);
						return;
					}
					local268 += local266;
					if (local268 >= 65536) {
						if (local155 > local147) {
							local147++;
						} else if (local155 < local147) {
							local147--;
						}
						local268 -= 65536;
						if ((Static338.aByteArrayArrayArray13[Static576.anInt9136][local147][local151] & 0x4) != 0) {
							Static32.method1022(local147, 1, local151, false, Static332.aClass247ArrayArrayArray1);
							return;
						}
					}
				}
				return;
			}
			local266 = local186 * 65536 / local167;
			local268 = 32768;
			while (local147 != local155) {
				if (local147 < local155) {
					local147++;
				} else if (local147 > local155) {
					local147--;
				}
				if ((Static338.aByteArrayArrayArray13[Static576.anInt9136][local147][local151] & 0x4) != 0) {
					Static32.method1022(local147, 1, local151, false, Static332.aClass247ArrayArrayArray1);
					return;
				}
				local268 += local266;
				if (local268 >= 65536) {
					local268 -= 65536;
					if (local159 > local151) {
						local151++;
					} else if (local159 < local151) {
						local151--;
					}
					if ((Static338.aByteArrayArrayArray13[Static576.anInt9136][local147][local151] & 0x4) != 0) {
						Static32.method1022(local147, 1, local151, false, Static332.aClass247ArrayArrayArray1);
						return;
					}
				}
			}
			return;
		}
		Static81.method1711("RC: " + local147 + "," + local151 + " " + local155 + "," + local159 + " " + Static417.anInt7047 + "," + Static347.anInt7851, (Throwable) null);
		return;
	}
}
