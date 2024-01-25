import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
	public static int anInt3381;

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array91;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "Lclient!ug;")
	public static final Class243 aClass243_20 = new Class243();

	@OriginalMember(owner = "client!ic", name = "e", descriptor = "Lclient!iv;")
	public static final Class119 aClass119_71 = new Class119(8, 0);

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
	public static void method2718() {
		if (Static374.aClass20_Sub1_1.method1810(Static105.anInt2382) != 2) {
			return;
		}
		@Pc(24) byte local24 = (byte) (Static52.anInt1374 - 4 & 0xFF);
		@Pc(28) int local28 = Static52.anInt1374 % Static40.anInt1089;
		@Pc(34) int local34;
		for (@Pc(30) int local30 = 0; local30 < 4; local30++) {
			for (local34 = 0; local34 < Static44.anInt7276; local34++) {
				Static229.aByteArrayArrayArray16[local30][local28][local34] = local24;
			}
		}
		if (Static6.anInt93 == 3) {
			return;
		}
		for (local34 = 0; local34 < 2; local34++) {
			Static107.anIntArray141[local34] = -1000000;
			Static91.anIntArray128[local34] = 1000000;
			Static163.anIntArray403[local34] = 0;
			Static221.anIntArray277[local34] = 1000000;
			Static433.anIntArray513[local34] = 0;
		}
		@Pc(126) int local126;
		if (Static161.anInt3316 != 1) {
			local126 = Static231.method3482(Static6.anInt93, Static276.anInt5105, Static265.anInt5008);
			if (local126 - Static439.anInt7400 >= 800 || (Static9.aByteArrayArrayArray1[Static6.anInt93][Static276.anInt5105 >> 7][Static265.anInt5008 >> 7] & 0x4) == 0) {
				return;
			}
			Static228.method3432(Static276.anInt5105 >> 7, Static265.anInt5008 >> 7, 1, false, Static263.aClass118ArrayArrayArray2);
			return;
		}
		if ((Static9.aByteArrayArrayArray1[Static6.anInt93][Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 >> 7][Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 >> 7] & 0x4) != 0) {
			Static228.method3432(Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 >> 7, Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 >> 7, 0, false, Static263.aClass118ArrayArrayArray2);
		}
		if (Static298.anInt5734 >= 2560) {
			return;
		}
		local126 = Static276.anInt5105 >> 7;
		@Pc(130) int local130 = Static265.anInt5008 >> 7;
		@Pc(135) int local135 = Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4318 >> 7;
		@Pc(140) int local140 = Static379.aClass7_Sub2_Sub3_Sub2_2.anInt4321 >> 7;
		@Pc(148) int local148;
		if (local126 < local135) {
			local148 = local135 - local126;
		} else {
			local148 = local126 - local135;
		}
		@Pc(167) int local167;
		if (local140 <= local130) {
			local167 = local130 - local140;
		} else {
			local167 = local140 - local130;
		}
		if ((local148 != 0 || local167 != 0) && local148 > (-Static40.anInt1089) && Static40.anInt1089 > local148 && -Static44.anInt7276 < local167 && Static44.anInt7276 > local167) {
			@Pc(252) int local252;
			@Pc(254) int local254;
			if (local148 > local167) {
				local252 = local167 * 65536 / local148;
				local254 = 32768;
				while (local135 != local126) {
					if (local126 < local135) {
						local126++;
					} else if (local126 > local135) {
						local126--;
					}
					if ((Static9.aByteArrayArrayArray1[Static6.anInt93][local126][local130] & 0x4) != 0) {
						Static228.method3432(local126, local130, 1, false, Static263.aClass118ArrayArrayArray2);
						return;
					}
					local254 += local252;
					if (local254 >= 65536) {
						local254 -= 65536;
						if (local130 < local140) {
							local130++;
						} else if (local130 > local140) {
							local130--;
						}
						if ((Static9.aByteArrayArrayArray1[Static6.anInt93][local126][local130] & 0x4) != 0) {
							Static228.method3432(local126, local130, 1, false, Static263.aClass118ArrayArrayArray2);
							return;
						}
					}
				}
				return;
			}
			local252 = local148 * 65536 / local167;
			local254 = 32768;
			while (local130 != local140) {
				if (local140 > local130) {
					local130++;
				} else if (local140 < local130) {
					local130--;
				}
				if ((Static9.aByteArrayArrayArray1[Static6.anInt93][local126][local130] & 0x4) != 0) {
					Static228.method3432(local126, local130, 1, false, Static263.aClass118ArrayArrayArray2);
					return;
				}
				local254 += local252;
				if (local254 >= 65536) {
					local254 -= 65536;
					if (local126 < local135) {
						local126++;
					} else if (local135 < local126) {
						local126--;
					}
					if ((Static9.aByteArrayArrayArray1[Static6.anInt93][local126][local130] & 0x4) != 0) {
						Static228.method3432(local126, local130, 1, false, Static263.aClass118ArrayArrayArray2);
						return;
					}
				}
			}
			return;
		}
		Static324.method5974(null, "RC: " + local126 + "," + local130 + " " + local135 + "," + local140 + " " + Static223.anInt7618 + "," + Static57.anInt5085);
		return;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)Z")
	public static boolean method2719(@OriginalArg(0) int arg0) {
		return arg0 == 0 || arg0 == 1 || arg0 == 2;
	}
}
