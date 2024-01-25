import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "[I")
	public static final int[] anIntArray584 = new int[200];

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_179 = new Class131(59, -1);

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
	public static int anInt7049 = -1;

	@OriginalMember(owner = "client!ul", name = "h", descriptor = "Z")
	public static final boolean aBoolean454 = false;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
	public static void method5499() {
		if (Static389.aClass128_Sub1_1.method2986(Static285.anInt7839) != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static243.anInt4342 - 4 & 0xFF);
		@Pc(25) int local25 = Static243.anInt4342 % Static135.anInt2314;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static352.anInt6022; local31++) {
				Static443.aByteArrayArrayArray17[local27][local25][local31] = local21;
			}
		}
		if (Static152.anInt2600 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static21.anIntArray29[local31] = -1000000;
			Static264.anIntArray383[local31] = 1000000;
			Static199.anIntArray300[local31] = 0;
			Static174.anIntArray267[local31] = 1000000;
			Static335.anIntArray80[local31] = 0;
		}
		@Pc(126) int local126;
		if (Static310.anInt5540 != 1) {
			local126 = Static289.method4078(Static306.anInt5497, Static402.anInt6941, Static152.anInt2600);
			if (local126 - Static254.anInt4567 >= 800 || (Static184.aByteArrayArrayArray3[Static152.anInt2600][Static306.anInt5497 >> 7][Static402.anInt6941 >> 7] & 0x4) == 0) {
				return;
			}
			Static371.method5095(Static402.anInt6941 >> 7, false, 1, Static268.aClass211ArrayArrayArray4, Static306.anInt5497 >> 7);
			return;
		}
		if ((Static184.aByteArrayArrayArray3[Static152.anInt2600][Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 >> 7][Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 >> 7] & 0x4) != 0) {
			Static371.method5095(Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 >> 7, false, 0, Static268.aClass211ArrayArrayArray4, Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 >> 7);
		}
		if (Static239.anInt4284 >= 2560) {
			return;
		}
		local126 = Static306.anInt5497 >> 7;
		@Pc(130) int local130 = Static402.anInt6941 >> 7;
		@Pc(135) int local135 = Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068 >> 7;
		@Pc(140) int local140 = Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065 >> 7;
		@Pc(148) int local148;
		if (local126 >= local135) {
			local148 = local126 - local135;
		} else {
			local148 = local135 - local126;
		}
		@Pc(161) int local161;
		if (local140 > local130) {
			local161 = local140 - local130;
		} else {
			local161 = local130 - local140;
		}
		if ((local148 != 0 || local161 != 0) && -Static135.anInt2314 < local148 && local148 < Static135.anInt2314 && local161 > -Static352.anInt6022 && Static352.anInt6022 > local161) {
			@Pc(233) int local233;
			@Pc(235) int local235;
			if (local161 < local148) {
				local233 = local161 * 65536 / local148;
				local235 = 32768;
				while (local135 != local126) {
					if (local126 < local135) {
						local126++;
					} else if (local126 > local135) {
						local126--;
					}
					if ((Static184.aByteArrayArrayArray3[Static152.anInt2600][local126][local130] & 0x4) != 0) {
						Static371.method5095(local130, false, 1, Static268.aClass211ArrayArrayArray4, local126);
						return;
					}
					local235 += local233;
					if (local235 >= 65536) {
						local235 -= 65536;
						if (local130 < local140) {
							local130++;
						} else if (local130 > local140) {
							local130--;
						}
						if ((Static184.aByteArrayArrayArray3[Static152.anInt2600][local126][local130] & 0x4) != 0) {
							Static371.method5095(local130, false, 1, Static268.aClass211ArrayArrayArray4, local126);
							return;
						}
					}
				}
				return;
			}
			local233 = local148 * 65536 / local161;
			local235 = 32768;
			while (local140 != local130) {
				if (local140 > local130) {
					local130++;
				} else if (local140 < local130) {
					local130--;
				}
				if ((Static184.aByteArrayArrayArray3[Static152.anInt2600][local126][local130] & 0x4) != 0) {
					Static371.method5095(local130, false, 1, Static268.aClass211ArrayArrayArray4, local126);
					return;
				}
				local235 += local233;
				if (local235 >= 65536) {
					if (local126 < local135) {
						local126++;
					} else if (local126 > local135) {
						local126--;
					}
					local235 -= 65536;
					if ((Static184.aByteArrayArrayArray3[Static152.anInt2600][local126][local130] & 0x4) != 0) {
						Static371.method5095(local130, false, 1, Static268.aClass211ArrayArrayArray4, local126);
						return;
					}
				}
			}
			return;
		}
		Static315.method4700(null, "RC: " + local126 + "," + local130 + " " + local135 + "," + local140 + " " + Static437.anInt7555 + "," + Static134.anInt5502);
		return;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(B)V")
	public static void method5500() {
		@Pc(12) int local12 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static135.anInt2314; local14++) {
			for (@Pc(18) int local18 = 0; local18 < Static352.anInt6022; local18++) {
				if (Static371.method5095(local18, true, local12, Static268.aClass211ArrayArrayArray4, local14)) {
					local12++;
				}
				if (local12 >= 512) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(I)V")
	public static void method5501() {
		Static400.anIntArray575 = null;
		Static233.anIntArray339 = null;
		Static148.aBoolean137 = false;
		Static204.anIntArray311 = null;
		Static148.anIntArray244 = null;
		Static445.anIntArray665 = null;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIBI)Lclient!ir;")
	public static Class26_Sub2_Sub2 method5502(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class211 local11 = Static268.aClass211ArrayArrayArray4[arg2][arg1][arg0];
		if (local11 == null) {
			return null;
		}
		@Pc(22) Class26_Sub2_Sub2 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class125 local27 = local11.aClass125_3; local27 != null; local27 = local27.aClass125_1) {
			@Pc(31) Class26_Sub2 local31 = local27.aClass26_Sub2_1;
			if (local31 instanceof Class26_Sub2_Sub2) {
				@Pc(37) Class26_Sub2_Sub2 local37 = (Class26_Sub2_Sub2) local31;
				@Pc(47) int local47 = local37.method5535() * 64 + 60 - 64;
				@Pc(55) int local55 = local37.anInt7068 - local47 >> 7;
				@Pc(63) int local63 = local37.anInt7065 - local47 >> 7;
				@Pc(70) int local70 = local37.anInt7068 + local47 >> 7;
				@Pc(78) int local78 = local37.anInt7065 + local47 >> 7;
				if (arg1 >= local55 && local63 <= arg0 && local70 >= arg1 && local78 >= arg0) {
					@Pc(104) int local104 = (local78 + 1 - arg0) * (-arg1 + (local70 - -1));
					if (local24 < local104) {
						local24 = local104;
						local22 = local37;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)I")
	public static int method5503(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = 0;
		while (arg0 > 0) {
			local12 = local12 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
			arg0--;
		}
		return local12;
	}
}
