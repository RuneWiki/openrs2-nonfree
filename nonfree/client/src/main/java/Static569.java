import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "I")
	public static int anInt10209;

	@OriginalMember(owner = "client!ug", name = "H", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_102 = new Class94(83, -1);

	@OriginalMember(owner = "client!ug", name = "I", descriptor = "I")
	public static int anInt10211 = -1;

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "()V")
	public static void method8504() {
		for (@Pc(1) int local1 = 0; local1 < Static319.anInt6492; local1++) {
			@Pc(6) Class3_Sub1_Sub3 local6 = Static20.aClass3_Sub1_Sub3Array1[local1];
			Static633.method9183(local6, true);
			Static20.aClass3_Sub1_Sub3Array1[local1] = null;
		}
		Static319.anInt6492 = 0;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(I)V")
	public static void method8506() {
		if (Static74.aClass2_Sub13_5.lb.method6912() != 2) {
			return;
		}
		@Pc(19) byte local19 = (byte) (Static438.anInt8137 - 4 & 0xFF);
		@Pc(23) int local23 = Static438.anInt8137 % Static47.anInt1794;
		@Pc(29) int local29;
		for (@Pc(25) int local25 = 0; local25 < 4; local25++) {
			for (local29 = 0; local29 < Static209.anInt4742; local29++) {
				Static612.aByteArrayArrayArray18[local25][local23][local29] = local19;
			}
		}
		if (Static12.anInt172 == 3) {
			return;
		}
		for (local29 = 0; local29 < 2; local29++) {
			Static93.anIntArray130[local29] = -1000000;
			Static408.anIntArray496[local29] = 1000000;
			Static472.anIntArray564[local29] = 0;
			Static279.anIntArray498[local29] = 1000000;
			Static265.anIntArray323[local29] = 0;
		}
		@Pc(84) int local84 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303;
		@Pc(87) int local87 = Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310;
		@Pc(141) int local141;
		if (Static496.anInt9165 != 1 && Static194.anInt4508 == -1) {
			local141 = Static590.method8716(Static135.anInt3347, Static12.anInt172, Static621.anInt10870);
			if (local141 - Static639.anInt11034 < 3200 && (Static476.aByteArrayArrayArray5[Static12.anInt172][Static135.anInt3347 >> 9][Static621.anInt10870 >> 9] & 0x4) != 0) {
				Static47.method1689(Static621.anInt10870 >> 9, Static395.aClass100ArrayArrayArray3, Static135.anInt3347 >> 9, 1, false);
				return;
			}
			return;
		}
		if (Static496.anInt9165 != 1) {
			local87 = Static442.anInt8212;
			local84 = Static194.anInt4508;
		}
		if ((Static476.aByteArrayArrayArray5[Static12.anInt172][local84 >> 9][local87 >> 9] & 0x4) != 0) {
			Static47.method1689(local87 >> 9, Static395.aClass100ArrayArrayArray3, local84 >> 9, 0, false);
		}
		if (Static266.anInt5673 >= 2560) {
			return;
		}
		local141 = Static135.anInt3347 >> 9;
		@Pc(145) int local145 = Static621.anInt10870 >> 9;
		@Pc(149) int local149 = local84 >> 9;
		@Pc(153) int local153 = local87 >> 9;
		@Pc(161) int local161;
		if (local149 > local141) {
			local161 = local149 - local141;
		} else {
			local161 = local141 - local149;
		}
		@Pc(176) int local176;
		if (local153 <= local145) {
			local176 = local145 - local153;
		} else {
			local176 = local153 - local145;
		}
		if ((local161 != 0 || local176 != 0) && -Static47.anInt1794 < local161 && local161 < Static47.anInt1794 && -Static209.anInt4742 < local176 && Static209.anInt4742 > local176) {
			@Pc(256) int local256;
			@Pc(258) int local258;
			if (local176 >= local161) {
				local256 = local161 * 65536 / local176;
				local258 = 32768;
				while (local153 != local145) {
					if (local153 > local145) {
						local145++;
					} else if (local145 > local153) {
						local145--;
					}
					if ((Static476.aByteArrayArrayArray5[Static12.anInt172][local141][local145] & 0x4) != 0) {
						Static47.method1689(local145, Static395.aClass100ArrayArrayArray3, local141, 1, false);
						return;
					}
					local258 += local256;
					if (local258 >= 65536) {
						if (local141 < local149) {
							local141++;
						} else if (local149 < local141) {
							local141--;
						}
						local258 -= 65536;
						if ((Static476.aByteArrayArrayArray5[Static12.anInt172][local141][local145] & 0x4) != 0) {
							Static47.method1689(local145, Static395.aClass100ArrayArrayArray3, local141, 1, false);
							return;
						}
					}
				}
				return;
			}
			local256 = local176 * 65536 / local161;
			local258 = 32768;
			while (local141 != local149) {
				if (local141 < local149) {
					local141++;
				} else if (local141 > local149) {
					local141--;
				}
				if ((Static476.aByteArrayArrayArray5[Static12.anInt172][local141][local145] & 0x4) != 0) {
					Static47.method1689(local145, Static395.aClass100ArrayArrayArray3, local141, 1, false);
					return;
				}
				local258 += local256;
				if (local258 >= 65536) {
					if (local153 > local145) {
						local145++;
					} else if (local153 < local145) {
						local145--;
					}
					local258 -= 65536;
					if ((Static476.aByteArrayArrayArray5[Static12.anInt172][local141][local145] & 0x4) != 0) {
						Static47.method1689(local145, Static395.aClass100ArrayArrayArray3, local141, 1, false);
						return;
					}
				}
			}
			return;
		}
		Static408.method6625("RC: " + local141 + "," + local145 + " " + local149 + "," + local153 + " " + Static84.anInt2565 + "," + Static32.anInt723, null);
		return;
	}
}
