import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!co", name = "H", descriptor = "I")
	public static int anInt976;

	@OriginalMember(owner = "client!co", name = "ab", descriptor = "I")
	public static int anInt987;

	@OriginalMember(owner = "client!co", name = "y", descriptor = "Z")
	public static boolean aBoolean82 = false;

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(III)I")
	public static int method828(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg0 == 1 || arg0 == 3 ? Static395.anIntArray523[arg1 & 0x3] : Static279.anIntArray570[arg1 & 0x3];
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Z)V")
	public static void method830() {
		@Pc(1) Class151 local1 = Static34.aClass151_21;
		synchronized (Static34.aClass151_21) {
			Static34.aClass151_21.method3298();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V")
	public static void method834() {
		if (Static327.aClass230_Sub1_1.method5647(Static146.anInt2664) != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static177.anInt3327 - 4 & 0xFF);
		@Pc(23) int local23 = Static177.anInt3327 % Static80.anInt6558;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static104.anInt2048; local29++) {
				Static183.aByteArrayArrayArray7[local25][local23][local29] = local19;
			}
		}
		if (Static1.anInt41 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static162.anIntArray219[local29] = -1000000;
			Static194.anIntArray571[local29] = 1000000;
			Static148.anIntArray547[local29] = 0;
			Static213.anIntArray299[local29] = 1000000;
			Static347.anIntArray461[local29] = 0;
		}
		@Pc(132) int local132;
		if (Static57.anInt883 != 1) {
			local132 = Static405.method5510(Static4.anInt149, Static302.anInt5030, Static1.anInt41);
			if (local132 - Static264.anInt4481 >= 800 || (Static228.aByteArrayArrayArray8[Static1.anInt41][Static302.anInt5030 >> 7][Static4.anInt149 >> 7] & 0x4) == 0) {
				return;
			}
			Static160.method5109(Static131.aClass137ArrayArrayArray2, Static4.anInt149 >> 7, Static302.anInt5030 >> 7, false, 1);
			return;
		}
		if ((Static228.aByteArrayArrayArray8[Static1.anInt41][Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 >> 7][Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 >> 7] & 0x4) != 0) {
			Static160.method5109(Static131.aClass137ArrayArrayArray2, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 >> 7, Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 >> 7, false, 0);
		}
		if (Static401.anInt7130 >= 2560) {
			return;
		}
		local132 = Static302.anInt5030 >> 7;
		@Pc(136) int local136 = Static4.anInt149 >> 7;
		@Pc(141) int local141 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7060 >> 7;
		@Pc(146) int local146 = Static255.aClass47_Sub1_Sub5_Sub2_2.anInt7066 >> 7;
		@Pc(157) int local157;
		if (local141 > local132) {
			local157 = local141 - local132;
		} else {
			local157 = local132 - local141;
		}
		@Pc(176) int local176;
		if (local136 < local146) {
			local176 = local146 - local136;
		} else {
			local176 = local136 - local146;
		}
		if ((local157 != 0 || local176 != 0) && (-Static80.anInt6558) < local157 && local157 < Static80.anInt6558 && -Static104.anInt2048 < local176 && Static104.anInt2048 > local176) {
			@Pc(247) int local247;
			@Pc(249) int local249;
			if (local176 < local157) {
				local247 = local176 * 65536 / local157;
				local249 = 32768;
				while (local141 != local132) {
					if (local141 > local132) {
						local132++;
					} else if (local132 > local141) {
						local132--;
					}
					if ((Static228.aByteArrayArrayArray8[Static1.anInt41][local132][local136] & 0x4) != 0) {
						Static160.method5109(Static131.aClass137ArrayArrayArray2, local136, local132, false, 1);
						return;
					}
					local249 += local247;
					if (local249 >= 65536) {
						local249 -= 65536;
						if (local146 > local136) {
							local136++;
						} else if (local136 > local146) {
							local136--;
						}
						if ((Static228.aByteArrayArrayArray8[Static1.anInt41][local132][local136] & 0x4) != 0) {
							Static160.method5109(Static131.aClass137ArrayArrayArray2, local136, local132, false, 1);
							return;
						}
					}
				}
				return;
			}
			local247 = local157 * 65536 / local176;
			local249 = 32768;
			while (local136 != local146) {
				if (local136 < local146) {
					local136++;
				} else if (local146 < local136) {
					local136--;
				}
				if ((Static228.aByteArrayArrayArray8[Static1.anInt41][local132][local136] & 0x4) != 0) {
					Static160.method5109(Static131.aClass137ArrayArrayArray2, local136, local132, false, 1);
					return;
				}
				local249 += local247;
				if (local249 >= 65536) {
					local249 -= 65536;
					if (local141 > local132) {
						local132++;
					} else if (local132 > local141) {
						local132--;
					}
					if ((Static228.aByteArrayArrayArray8[Static1.anInt41][local132][local136] & 0x4) != 0) {
						Static160.method5109(Static131.aClass137ArrayArrayArray2, local136, local132, false, 1);
						return;
					}
				}
			}
			return;
		}
		Static101.method1630("RC: " + local132 + "," + local136 + " " + local141 + "," + local146 + " " + Static190.anInt3507 + "," + Static331.anInt6034, null);
		return;
	}
}
