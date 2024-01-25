import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dp", name = "w", descriptor = "I")
	public static int anInt2048;

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(IBI)Lclient!jw;")
	public static Class169 method1848(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class169 local7 = new Class169();
		local7.anInt4642 = arg0 + 1 + 5;
		local7.anInt4628 = arg1 + 5 + 1;
		local7.anInt4643 = -1;
		local7.anInt4631 = -1;
		local7.anIntArrayArray105 = new int[local7.anInt4642][local7.anInt4628];
		local7.method4038();
		return local7;
	}

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
	public static void method1849() {
		if (Static405.aClass3_Sub3_Sub1_1.method6311(Static60.anInt1312) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static81.anInt1761 - 4 & 0xFF);
		@Pc(25) int local25 = Static81.anInt1761 % Static54.anInt1038;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static140.anInt3026; local31++) {
				Static45.aByteArrayArrayArray8[local27][local25][local31] = local21;
			}
		}
		if (Static117.anInt2694 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static5.anIntArray7[local31] = -1000000;
			Static543.anIntArray570[local31] = 1000000;
			Static280.anIntArray259[local31] = 0;
			Static519.anIntArray540[local31] = 1000000;
			Static160.anIntArray158[local31] = 0;
		}
		@Pc(92) int local92 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444;
		@Pc(95) int local95 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442;
		@Pc(145) int local145;
		if (Static379.anInt6482 != 1 && Static18.anInt314 == -1) {
			local145 = Static475.method6537(Static350.anInt6080, Static117.anInt2694, Static226.anInt3984);
			if (local145 - Static461.anInt7704 < 3200 && (Static503.aByteArrayArrayArray11[Static117.anInt2694][Static226.anInt3984 >> 9][Static350.anInt6080 >> 9] & 0x4) != 0) {
				Static338.method4800(Static309.aClass299ArrayArrayArray3, 1, false, Static350.anInt6080 >> 9, Static226.anInt3984 >> 9);
				return;
			}
			return;
		}
		if (Static379.anInt6482 != 1) {
			local95 = Static391.anInt6856;
			local92 = Static18.anInt314;
		}
		if ((Static503.aByteArrayArrayArray11[Static117.anInt2694][local92 >> 9][local95 >> 9] & 0x4) != 0) {
			Static338.method4800(Static309.aClass299ArrayArrayArray3, 0, false, local95 >> 9, local92 >> 9);
		}
		if (Static494.anInt8029 >= 2560) {
			return;
		}
		local145 = Static226.anInt3984 >> 9;
		@Pc(149) int local149 = Static350.anInt6080 >> 9;
		@Pc(153) int local153 = local92 >> 9;
		@Pc(157) int local157 = local95 >> 9;
		@Pc(168) int local168;
		if (local153 > local145) {
			local168 = local153 - local145;
		} else {
			local168 = local145 - local153;
		}
		@Pc(183) int local183;
		if (local149 >= local157) {
			local183 = local149 - local157;
		} else {
			local183 = local157 - local149;
		}
		if ((local168 != 0 || local183 != 0) && local168 > -Static54.anInt1038 && local168 < Static54.anInt1038 && -Static140.anInt3026 < local183 && local183 < Static140.anInt3026) {
			@Pc(261) int local261;
			@Pc(263) int local263;
			if (local183 < local168) {
				local261 = local183 * 65536 / local168;
				local263 = 32768;
				while (local153 != local145) {
					if (local153 > local145) {
						local145++;
					} else if (local153 < local145) {
						local145--;
					}
					if ((Static503.aByteArrayArrayArray11[Static117.anInt2694][local145][local149] & 0x4) != 0) {
						Static338.method4800(Static309.aClass299ArrayArrayArray3, 1, false, local149, local145);
						return;
					}
					local263 += local261;
					if (local263 >= 65536) {
						local263 -= 65536;
						if (local149 < local157) {
							local149++;
						} else if (local157 < local149) {
							local149--;
						}
						if ((Static503.aByteArrayArrayArray11[Static117.anInt2694][local145][local149] & 0x4) != 0) {
							Static338.method4800(Static309.aClass299ArrayArrayArray3, 1, false, local149, local145);
							return;
						}
					}
				}
				return;
			}
			local261 = local168 * 65536 / local183;
			local263 = 32768;
			while (local149 != local157) {
				if (local149 < local157) {
					local149++;
				} else if (local157 < local149) {
					local149--;
				}
				if ((Static503.aByteArrayArrayArray11[Static117.anInt2694][local145][local149] & 0x4) != 0) {
					Static338.method4800(Static309.aClass299ArrayArrayArray3, 1, false, local149, local145);
					return;
				}
				local263 += local261;
				if (local263 >= 65536) {
					if (local153 > local145) {
						local145++;
					} else if (local145 > local153) {
						local145--;
					}
					local263 -= 65536;
					if ((Static503.aByteArrayArrayArray11[Static117.anInt2694][local145][local149] & 0x4) != 0) {
						Static338.method4800(Static309.aClass299ArrayArrayArray3, 1, false, local149, local145);
						return;
					}
				}
			}
			return;
		}
		Static172.method7826(null, "RC: " + local145 + "," + local149 + " " + local153 + "," + local157 + " " + Static335.anInt5608 + "," + Static246.anInt4344);
		return;
	}
}
