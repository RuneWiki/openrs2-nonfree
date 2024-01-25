import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(I)V")
	public static void method2051() {
		if (Static124.aClass4_Sub20_4.aClass8_Sub16_1.method6388() != 2) {
			return;
		}
		@Pc(23) byte local23 = (byte) (Static472.anInt7502 - 4 & 0xFF);
		@Pc(27) int local27 = Static472.anInt7502 % Static224.anInt3557;
		@Pc(37) int local37;
		for (@Pc(33) int local33 = 0; local33 < 4; local33++) {
			for (local37 = 0; local37 < Static267.anInt4309; local37++) {
				Static558.aByteArrayArrayArray18[local33][local27][local37] = local23;
			}
		}
		if (Static296.anInt4684 == 3) {
			return;
		}
		for (local37 = 0; local37 < 2; local37++) {
			Static27.anIntArray52[local37] = -1000000;
			Static533.anIntArray564[local37] = 1000000;
			Static248.anIntArray296[local37] = 0;
			Static481.anIntArray515[local37] = 1000000;
			Static289.anIntArray351[local37] = 0;
		}
		@Pc(96) int local96 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9925;
		@Pc(99) int local99 = Static554.aClass3_Sub1_Sub2_Sub2_Sub1_4.anInt9917;
		@Pc(112) int local112;
		if (Static259.anInt4200 != 1 && Static77.anInt1632 == -1) {
			local112 = Static674.method8951(Static296.anInt4684, Static652.anInt10283, Static611.anInt9382);
			if (local112 - Static618.anInt9710 < 3200 && (Static47.aByteArrayArrayArray3[Static296.anInt4684][Static611.anInt9382 >> 9][Static652.anInt10283 >> 9] & 0x4) != 0) {
				Static541.method7236(false, Static652.anInt10283 >> 9, Static611.anInt9382 >> 9, Static267.aClass73ArrayArrayArray2, 1);
				return;
			}
			return;
		}
		if (Static259.anInt4200 != 1) {
			local96 = Static77.anInt1632;
			local99 = Static286.anInt4563;
		}
		if ((Static47.aByteArrayArrayArray3[Static296.anInt4684][local96 >> 9][local99 >> 9] & 0x4) != 0) {
			Static541.method7236(false, local99 >> 9, local96 >> 9, Static267.aClass73ArrayArrayArray2, 0);
		}
		if (Static383.anInt9871 >= 2560) {
			return;
		}
		local112 = Static611.anInt9382 >> 9;
		@Pc(195) int local195 = Static652.anInt10283 >> 9;
		@Pc(199) int local199 = local96 >> 9;
		@Pc(203) int local203 = local99 >> 9;
		@Pc(210) int local210;
		if (local112 < local199) {
			local210 = local199 - local112;
		} else {
			local210 = local112 - local199;
		}
		@Pc(225) int local225;
		if (local203 > local195) {
			local225 = local203 - local195;
		} else {
			local225 = local195 - local203;
		}
		if (local210 == 0 && local225 == 0 || -Static224.anInt3557 >= local210 || local210 >= Static224.anInt3557 || local225 <= -Static267.anInt4309 || local225 >= Static267.anInt4309) {
			Static357.method4765((Throwable) null, "RC: " + local112 + "," + local195 + " " + local199 + "," + local203 + " " + Static445.anInt6949 + "," + Static321.anInt5000);
			return;
		}
		@Pc(308) int local308;
		@Pc(310) int local310;
		if (local210 > local225) {
			local308 = local225 * 65536 / local210;
			local310 = 32768;
			while (local199 != local112) {
				if (local112 < local199) {
					local112++;
				} else if (local199 < local112) {
					local112--;
				}
				if ((Static47.aByteArrayArrayArray3[Static296.anInt4684][local112][local195] & 0x4) != 0) {
					Static541.method7236(false, local195, local112, Static267.aClass73ArrayArrayArray2, 1);
					return;
				}
				local310 += local308;
				if (local310 >= 65536) {
					local310 -= 65536;
					if (local195 < local203) {
						local195++;
					} else if (local195 > local203) {
						local195--;
					}
					if ((Static47.aByteArrayArrayArray3[Static296.anInt4684][local112][local195] & 0x4) != 0) {
						Static541.method7236(false, local195, local112, Static267.aClass73ArrayArrayArray2, 1);
						return;
					}
				}
			}
			return;
		}
		local308 = local210 * 65536 / local225;
		local310 = 32768;
		while (local195 != local203) {
			if (local195 < local203) {
				local195++;
			} else if (local195 > local203) {
				local195--;
			}
			if ((Static47.aByteArrayArrayArray3[Static296.anInt4684][local112][local195] & 0x4) != 0) {
				Static541.method7236(false, local195, local112, Static267.aClass73ArrayArrayArray2, 1);
				return;
			}
			local310 += local308;
			if (local310 >= 65536) {
				local310 -= 65536;
				if (local112 < local199) {
					local112++;
				} else if (local112 > local199) {
					local112--;
				}
				if ((Static47.aByteArrayArrayArray3[Static296.anInt4684][local112][local195] & 0x4) != 0) {
					Static541.method7236(false, local195, local112, Static267.aClass73ArrayArrayArray2, 1);
					return;
				}
			}
		}
	}
}
