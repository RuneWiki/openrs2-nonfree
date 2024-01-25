import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static673 {

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "[Lclient!fs;")
	public static Class134[] aClass134Array16;

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!nda;)Z")
	public static boolean method9268(@OriginalArg(1) Interface16 arg0) {
		@Pc(18) Class55 local18 = Static536.aClass392_2.method9293(0, arg0.method8089());
		if (local18.anInt937 == -1) {
			return true;
		} else {
			@Pc(31) Class289 local31 = Static645.aClass256_4.method5935(local18.anInt937);
			return local31.anInt8034 == -1 ? true : local31.method6918();
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
	public static void method9271() {
		if (Static637.aClass5_Sub20_31.aClass24_Sub17_2.method6235() != 2) {
			return;
		}
		@Pc(22) byte local22 = (byte) (Static287.anInt5060 - 4 & 0xFF);
		@Pc(26) int local26 = Static287.anInt5060 % Static544.anInt9261;
		for (@Pc(28) int local28 = 0; local28 < 4; local28++) {
			for (@Pc(32) int local32 = 0; local32 < Static282.anInt4887; local32++) {
				Static240.aByteArrayArrayArray15[local28][local26][local32] = local22;
			}
		}
		if (Static240.anInt3974 == 3) {
			return;
		}
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			Static163.anIntArray143[local72] = -1000000;
			Static596.anIntArray553[local72] = 1000000;
			Static75.anIntArray55[local72] = 0;
			Static203.anIntArray193[local72] = 1000000;
			Static246.anIntArray241[local72] = 0;
		}
		@Pc(103) int local103 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10355;
		@Pc(106) int local106 = Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt10363;
		@Pc(124) int local124;
		if (Static79.anInt1216 != 1 && Static651.anInt10529 == -1) {
			local124 = Static380.method5559(Static532.anInt9189, Static240.anInt3974, Static489.anInt8202, 0);
			if (local124 - Static132.anInt2186 < 3200 && (Static220.aByteArrayArrayArray14[Static240.anInt3974][Static532.anInt9189 >> 9][Static489.anInt8202 >> 9] & 0x4) != 0) {
				Static200.method2869(Static260.aClass174ArrayArrayArray2, Static489.anInt8202 >> 9, false, 1, Static532.anInt9189 >> 9);
				return;
			}
			return;
		}
		if (Static79.anInt1216 != 1) {
			local106 = Static272.anInt4763;
			local103 = Static651.anInt10529;
		}
		if ((Static220.aByteArrayArrayArray14[Static240.anInt3974][local103 >> 9][local106 >> 9] & 0x4) != 0) {
			Static200.method2869(Static260.aClass174ArrayArrayArray2, local106 >> 9, false, 0, local103 >> 9);
		}
		if (Static649.anInt5976 >= 2560) {
			return;
		}
		local124 = Static532.anInt9189 >> 9;
		@Pc(211) int local211 = Static489.anInt8202 >> 9;
		@Pc(215) int local215 = local103 >> 9;
		@Pc(219) int local219 = local106 >> 9;
		@Pc(230) int local230;
		if (local124 >= local215) {
			local230 = local124 - local215;
		} else {
			local230 = local215 - local124;
		}
		@Pc(248) int local248;
		if (local219 <= local211) {
			local248 = local211 - local219;
		} else {
			local248 = local219 - local211;
		}
		if (local230 == 0 && local248 == 0 || local230 <= -Static544.anInt9261 || Static544.anInt9261 <= local230 || local248 <= -Static282.anInt4887 || local248 >= Static282.anInt4887) {
			Static405.method5934("RC: " + local124 + "," + local211 + " " + local215 + "," + local219 + " " + Static622.anInt10188 + "," + Static668.anInt10683, (Throwable) null);
			return;
		}
		@Pc(341) int local341;
		@Pc(343) int local343;
		if (local230 <= local248) {
			local341 = local230 * 65536 / local248;
			local343 = 32768;
			while (local219 != local211) {
				if (local219 > local211) {
					local211++;
				} else if (local219 < local211) {
					local211--;
				}
				if ((Static220.aByteArrayArrayArray14[Static240.anInt3974][local124][local211] & 0x4) != 0) {
					Static200.method2869(Static260.aClass174ArrayArrayArray2, local211, false, 1, local124);
					return;
				}
				local343 += local341;
				if (local343 >= 65536) {
					local343 -= 65536;
					if (local124 < local215) {
						local124++;
					} else if (local215 < local124) {
						local124--;
					}
					if ((Static220.aByteArrayArrayArray14[Static240.anInt3974][local124][local211] & 0x4) != 0) {
						Static200.method2869(Static260.aClass174ArrayArrayArray2, local211, false, 1, local124);
						return;
					}
				}
			}
			return;
		}
		local341 = local248 * 65536 / local230;
		local343 = 32768;
		while (local215 != local124) {
			if (local215 > local124) {
				local124++;
			} else if (local124 > local215) {
				local124--;
			}
			if ((Static220.aByteArrayArrayArray14[Static240.anInt3974][local124][local211] & 0x4) != 0) {
				Static200.method2869(Static260.aClass174ArrayArrayArray2, local211, false, 1, local124);
				return;
			}
			local343 += local341;
			if (local343 >= 65536) {
				local343 -= 65536;
				if (local211 < local219) {
					local211++;
				} else if (local211 > local219) {
					local211--;
				}
				if ((Static220.aByteArrayArrayArray14[Static240.anInt3974][local124][local211] & 0x4) != 0) {
					Static200.method2869(Static260.aClass174ArrayArrayArray2, local211, false, 1, local124);
					return;
				}
			}
		}
	}
}
