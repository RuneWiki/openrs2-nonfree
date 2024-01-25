import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
	public static int anInt6745;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "Lclient!rga;")
	public static final Class290 aClass290_32 = new Class290("game3", 2);

	@OriginalMember(owner = "client!mb", name = "ub", descriptor = "Z")
	public static boolean aBoolean539 = false;

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(B)V")
	public static void method5644() {
		if (Static87.aClass6_Sub33_6.aClass14_Sub15_2.method5352() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static322.anInt6388 - 4 & 0xFF);
		@Pc(25) int local25 = Static322.anInt6388 % Static306.anInt6176;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static108.anInt2930; local31++) {
				Static538.aByteArrayArrayArray18[local27][local25][local31] = local21;
			}
		}
		if (Static86.anInt10575 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static372.anIntArray335[local31] = -1000000;
			Static574.anIntArray522[local31] = 1000000;
			Static502.anIntArray343[local31] = 0;
			Static84.anIntArray85[local31] = 1000000;
			Static515.anIntArray467[local31] = 0;
		}
		@Pc(91) int local91 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10360;
		@Pc(94) int local94 = Static160.aClass9_Sub4_Sub2_Sub1_Sub2_1.anInt10357;
		@Pc(145) int local145;
		if (Static554.anInt9497 != 1 && Static214.anInt4587 == -1) {
			local145 = Static150.method2982(Static86.anInt10575, Static259.anInt6990, Static184.anInt4048);
			if (local145 - Static149.anInt3489 < 3200 && (Static495.aByteArrayArrayArray17[Static86.anInt10575][Static184.anInt4048 >> 9][Static259.anInt6990 >> 9] & 0x4) != 0) {
				Static446.method6806(Static184.anInt4048 >> 9, 1, Static26.aClass186ArrayArrayArray1, Static259.anInt6990 >> 9, false);
				return;
			}
			return;
		}
		if (Static554.anInt9497 != 1) {
			local94 = Static594.anInt10048;
			local91 = Static214.anInt4587;
		}
		if ((Static495.aByteArrayArrayArray17[Static86.anInt10575][local91 >> 9][local94 >> 9] & 0x4) != 0) {
			Static446.method6806(local91 >> 9, 0, Static26.aClass186ArrayArrayArray1, local94 >> 9, false);
		}
		if (Static404.anInt4286 >= 2560) {
			return;
		}
		local145 = Static184.anInt4048 >> 9;
		@Pc(149) int local149 = Static259.anInt6990 >> 9;
		@Pc(153) int local153 = local91 >> 9;
		@Pc(157) int local157 = local94 >> 9;
		@Pc(169) int local169;
		if (local153 > local145) {
			local169 = local153 - local145;
		} else {
			local169 = local145 - local153;
		}
		@Pc(187) int local187;
		if (local149 >= local157) {
			local187 = local149 - local157;
		} else {
			local187 = local157 - local149;
		}
		if ((local169 != 0 || local187 != 0) && local169 > (-Static306.anInt6176) && Static306.anInt6176 > local169 && -Static108.anInt2930 < local187 && local187 < Static108.anInt2930) {
			@Pc(263) int local263;
			@Pc(265) int local265;
			if (local169 > local187) {
				local263 = local187 * 65536 / local169;
				local265 = 32768;
				while (local145 != local153) {
					if (local153 > local145) {
						local145++;
					} else if (local153 < local145) {
						local145--;
					}
					if ((Static495.aByteArrayArrayArray17[Static86.anInt10575][local145][local149] & 0x4) != 0) {
						Static446.method6806(local145, 1, Static26.aClass186ArrayArrayArray1, local149, false);
						return;
					}
					local265 += local263;
					if (local265 >= 65536) {
						if (local157 > local149) {
							local149++;
						} else if (local149 > local157) {
							local149--;
						}
						local265 -= 65536;
						if ((Static495.aByteArrayArrayArray17[Static86.anInt10575][local145][local149] & 0x4) != 0) {
							Static446.method6806(local145, 1, Static26.aClass186ArrayArrayArray1, local149, false);
							return;
						}
					}
				}
				return;
			}
			local263 = local169 * 65536 / local187;
			local265 = 32768;
			while (local157 != local149) {
				if (local157 > local149) {
					local149++;
				} else if (local149 > local157) {
					local149--;
				}
				if ((Static495.aByteArrayArrayArray17[Static86.anInt10575][local145][local149] & 0x4) != 0) {
					Static446.method6806(local145, 1, Static26.aClass186ArrayArrayArray1, local149, false);
					return;
				}
				local265 += local263;
				if (local265 >= 65536) {
					if (local153 > local145) {
						local145++;
					} else if (local145 > local153) {
						local145--;
					}
					local265 -= 65536;
					if ((Static495.aByteArrayArrayArray17[Static86.anInt10575][local145][local149] & 0x4) != 0) {
						Static446.method6806(local145, 1, Static26.aClass186ArrayArrayArray1, local149, false);
						return;
					}
				}
			}
			return;
		}
		Static358.method5809((Throwable) null, "RC: " + local145 + "," + local149 + " " + local153 + "," + local157 + " " + Static477.anInt8412 + "," + Static227.anInt5049);
		return;
	}
}
