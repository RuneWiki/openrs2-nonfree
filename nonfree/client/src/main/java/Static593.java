import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static593 {

	@OriginalMember(owner = "client!sq", name = "D", descriptor = "[J")
	public static final long[] aLongArray19 = new long[32];

	@OriginalMember(owner = "client!sq", name = "b", descriptor = "(B)V")
	public static void method8175(@OriginalArg(0) byte arg0) {
		if (Static650.aClass2_Sub30_29.aClass11_Sub27_1.method8752() != 2) {
			return;
		}
		@Pc(20) byte local20 = (byte) (Static68.anInt1174 - 4 & 0xFF);
		@Pc(24) int local24 = Static68.anInt1174 % Static426.anInt6942;
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < 4; local26++) {
			for (local32 = 0; local32 < Static280.anInt6752; local32++) {
				Static481.aByteArrayArrayArray17[local26][local24][local32] = local20;
			}
		}
		if (Static684.anInt10516 == 3) {
			return;
		}
		for (local32 = 0; local32 < 2; local32++) {
			Static693.anIntArray741[local32] = -1000000;
			Static64.anIntArray100[local32] = 1000000;
			Static73.anIntArray109[local32] = 0;
			Static133.anIntArray166[local32] = 1000000;
			Static495.anIntArray566[local32] = 0;
		}
		if (arg0 != 74) {
			method8175((byte) -45);
		}
		@Pc(113) int local113 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10229;
		@Pc(116) int local116 = Static241.aClass4_Sub2_Sub1_Sub2_Sub1_2.anInt10228;
		@Pc(172) int local172;
		if (Static60.anInt1040 != 1 && Static45.anInt602 == -1) {
			local172 = Static324.method4554(Static684.anInt10516, Static430.anInt7002, Static218.anInt3475);
			if (local172 - Static411.anInt6731 < 3200 && (Static392.aByteArrayArrayArray16[Static684.anInt10516][Static430.anInt7002 >> 9][Static218.anInt3475 >> 9] & 0x4) != 0) {
				Static388.method5814(false, Static430.anInt7002 >> 9, Static632.aClass311ArrayArrayArray3, Static218.anInt3475 >> 9, 1);
				return;
			}
			return;
		}
		if (Static60.anInt1040 != 1) {
			local116 = Static253.anInt3964;
			local113 = Static45.anInt602;
		}
		if ((Static392.aByteArrayArrayArray16[Static684.anInt10516][local113 >> 9][local116 >> 9] & 0x4) != 0) {
			Static388.method5814(false, local113 >> 9, Static632.aClass311ArrayArrayArray3, local116 >> 9, 0);
		}
		if (Static583.anInt2354 >= 2560) {
			return;
		}
		local172 = Static430.anInt7002 >> 9;
		@Pc(176) int local176 = Static218.anInt3475 >> 9;
		@Pc(180) int local180 = local113 >> 9;
		@Pc(184) int local184 = local116 >> 9;
		@Pc(195) int local195;
		if (local180 <= local172) {
			local195 = local172 - local180;
		} else {
			local195 = local180 - local172;
		}
		@Pc(210) int local210;
		if (local184 > local176) {
			local210 = local184 - local176;
		} else {
			local210 = local176 - local184;
		}
		if ((local195 != 0 || local210 != 0) && local195 > (-Static426.anInt6942) && Static426.anInt6942 > local195 && local210 > -Static280.anInt6752 && Static280.anInt6752 > local210) {
			@Pc(303) int local303;
			@Pc(305) int local305;
			if (local195 <= local210) {
				local303 = local195 * 65536 / local210;
				local305 = 32768;
				while (local184 != local176) {
					if (local184 > local176) {
						local176++;
					} else if (local176 > local184) {
						local176--;
					}
					if ((Static392.aByteArrayArrayArray16[Static684.anInt10516][local172][local176] & 0x4) != 0) {
						Static388.method5814(false, local172, Static632.aClass311ArrayArrayArray3, local176, 1);
						return;
					}
					local305 += local303;
					if (local305 >= 65536) {
						local305 -= 65536;
						if (local180 > local172) {
							local172++;
						} else if (local180 < local172) {
							local172--;
						}
						if ((Static392.aByteArrayArrayArray16[Static684.anInt10516][local172][local176] & 0x4) != 0) {
							Static388.method5814(false, local172, Static632.aClass311ArrayArrayArray3, local176, 1);
							return;
						}
					}
				}
				return;
			}
			local303 = local210 * 65536 / local195;
			local305 = 32768;
			while (local180 != local172) {
				if (local180 > local172) {
					local172++;
				} else if (local172 > local180) {
					local172--;
				}
				if ((Static392.aByteArrayArrayArray16[Static684.anInt10516][local172][local176] & 0x4) != 0) {
					Static388.method5814(false, local172, Static632.aClass311ArrayArrayArray3, local176, 1);
					return;
				}
				local305 += local303;
				if (local305 >= 65536) {
					if (local176 < local184) {
						local176++;
					} else if (local184 < local176) {
						local176--;
					}
					local305 -= 65536;
					if ((Static392.aByteArrayArrayArray16[Static684.anInt10516][local172][local176] & 0x4) != 0) {
						Static388.method5814(false, local172, Static632.aClass311ArrayArrayArray3, local176, 1);
						return;
					}
				}
			}
			return;
		}
		Static329.method4572("RC: " + local172 + "," + local176 + " " + local180 + "," + local184 + " " + Static243.anInt3820 + "," + Static224.anInt11062, (Throwable) null);
		return;
	}

	@OriginalMember(owner = "client!sq", name = "i", descriptor = "(I)V")
	public static void method8176() {
		@Pc(13) int local13 = 0;
		if (Static650.aClass2_Sub30_29.aClass11_Sub29_1.method9323() == 1) {
			local13 = 55;
		}
		if (Static650.aClass2_Sub30_29.aClass11_Sub4_1.method1189() == 0) {
			local13 |= 0x40;
		}
		Static299.method4193(local13);
		Static148.aClass153_3.method3338(local13);
		Static543.aClass37_2.method600(local13);
		Static192.aClass41_1.method747(local13);
		Static119.aClass209_1.method4565(local13);
		Static711.method9468(local13);
		Static464.method6715(local13);
		Static317.method5758(local13);
		Static506.method7172(local13);
		Static289.method4073();
	}
}
