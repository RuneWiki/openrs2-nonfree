import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static305 {

	@OriginalMember(owner = "client!lea", name = "fb", descriptor = "F")
	public static float aFloat112;

	@OriginalMember(owner = "client!lea", name = "a", descriptor = "(Lclient!so;B)V")
	public static void method5026(@OriginalArg(0) Class314 arg0) {
		@Pc(12) int local12;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(47) int local47;
		if (arg0 == Static593.aClass314_14) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8545();
			local16 = Static442.aClass8_Sub8_Sub2_2.method8527();
			local22 = (local16 & 0x7) + Static100.anInt2668;
			local27 = local22 + Static594.anInt10160;
			local35 = Static2.anInt5169 + (local16 >> 4 & 0x7);
			local39 = local35 + Static628.anInt10493;
			local43 = Static442.aClass8_Sub8_Sub2_2.method8541();
			local47 = Static442.aClass8_Sub8_Sub2_2.method8541();
			if (local47 != Static616.anInt10362) {
				@Pc(75) boolean local75 = local35 >= 0 && local22 >= 0 && local35 < Static372.anInt7082 && local22 < Static218.anInt5023;
				if (local75 || Static69.method6418(Static336.anInt6621)) {
					Static206.method7634(local27, new Class8_Sub11(local43, local12), Static245.anInt10229, local39);
					if (local75) {
						Static510.method7349(local22, Static245.anInt10229, local35);
					}
				}
			}
			return;
		}
		@Pc(165) int local165;
		@Pc(169) int local169;
		@Pc(173) int local173;
		@Pc(177) int local177;
		@Pc(181) int local181;
		@Pc(198) int local198;
		if (arg0 == Static564.aClass314_13) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local16 = (local12 >> 4 & 0xF) + Static2.anInt5169 * 2;
			local22 = Static100.anInt2668 * 2 + (local12 & 0xF);
			local27 = Static442.aClass8_Sub8_Sub2_2.method8525();
			@Pc(137) boolean local137 = (local27 & 0x1) != 0;
			@Pc(145) boolean local145 = (local27 & 0x2) != 0;
			local43 = local145 ? local27 >> 2 : -1;
			local47 = Static442.aClass8_Sub8_Sub2_2.method8550() + local16;
			local165 = Static442.aClass8_Sub8_Sub2_2.method8550() + local22;
			local169 = Static442.aClass8_Sub8_Sub2_2.method8568();
			local173 = Static442.aClass8_Sub8_Sub2_2.method8568();
			local177 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local181 = Static442.aClass8_Sub8_Sub2_2.method8525();
			if (local145) {
				local181 = (byte) local181;
			} else {
				local181 *= 4;
			}
			local198 = Static442.aClass8_Sub8_Sub2_2.method8525() * 4;
			@Pc(202) int local202 = Static442.aClass8_Sub8_Sub2_2.method8578();
			@Pc(206) int local206 = Static442.aClass8_Sub8_Sub2_2.method8578();
			@Pc(210) int local210 = Static442.aClass8_Sub8_Sub2_2.method8525();
			if (local210 == 255) {
				local210 = -1;
			}
			@Pc(219) int local219 = Static442.aClass8_Sub8_Sub2_2.method8578();
			if (local16 >= 0 && local22 >= 0 && Static372.anInt7082 * 2 > local16 && Static372.anInt7082 * 2 > local22 && local47 >= 0 && local165 >= 0 && Static218.anInt5023 * 2 > local47 && local165 < Static218.anInt5023 * 2 && local177 != 65535) {
				local181 <<= 0x2;
				local16 = local16 * 256;
				local219 <<= 0x2;
				local165 = local165 * 256;
				local198 <<= 0x2;
				local47 *= 256;
				local22 = local22 * 256;
				if (local169 != 0 && local43 != -1) {
					@Pc(301) Class15_Sub1_Sub2_Sub2 local301 = null;
					@Pc(307) int local307;
					if (local169 >= 0) {
						local307 = local169 - 1;
						@Pc(314) Class8_Sub50 local314 = (Class8_Sub50) Static278.aClass253_20.method6594((long) local307);
						if (local314 != null) {
							local301 = local314.aClass15_Sub1_Sub2_Sub2_Sub2_2;
						}
					} else {
						local307 = -local169 - 1;
						if (local307 == Static616.anInt10362) {
							local301 = Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2;
						} else {
							local301 = Static29.aClass15_Sub1_Sub2_Sub2_Sub1Array1[local307];
						}
					}
					if (local301 != null) {
						@Pc(341) Class102 local341 = local301.method6686();
						if (local341.anIntArrayArray16 != null && local341.anIntArrayArray16[local43] != null) {
							local181 -= local341.anIntArrayArray16[local43][1];
						}
						if (local341.anIntArrayArray17 != null && local341.anIntArrayArray17[local43] != null) {
							local181 -= local341.anIntArrayArray17[local43][1];
						}
					}
				}
				@Pc(399) Class15_Sub1_Sub2_Sub5 local399 = new Class15_Sub1_Sub2_Sub5(local177, Static245.anInt10229, Static245.anInt10229, local16, local22, local181, local202 + Static435.anInt8192, Static435.anInt8192 + local206, local210, local219, local169, local173, local198, local137, local43);
				local399.method7562(local47, local202 + Static435.anInt8192, local165, Static177.method3098(local165, local47, Static245.anInt10229) - local198);
				Static199.aClass43_27.method1424(new Class8_Sub5_Sub9(local399));
			}
		} else if (arg0 == Static292.aClass314_10) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local16 = (local12 & 0x7) + Static100.anInt2668;
			local22 = local16 + Static594.anInt10160;
			local27 = Static2.anInt5169 + (local12 >> 4 & 0x7);
			local35 = local27 + Static628.anInt10493;
			local39 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local43 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local47 = Static442.aClass8_Sub8_Sub2_2.method8578();
			if (Static567.aClass253_38 != null) {
				@Pc(483) Class8_Sub26 local483 = (Class8_Sub26) Static567.aClass253_38.method6594((long) (local22 << 14 | Static245.anInt10229 << 28 | local35));
				if (local483 != null) {
					for (@Pc(491) Class8_Sub11 local491 = (Class8_Sub11) local483.aClass43_25.method1422(); local491 != null; local491 = (Class8_Sub11) local483.aClass43_25.method1426()) {
						if (local491.anInt2018 == (local39 & 0x7FFF) && local491.anInt2019 == local43) {
							local491.method8640();
							local491.anInt2019 = local47;
							Static206.method7634(local22, local491, Static245.anInt10229, local35);
							break;
						}
					}
					if (local27 >= 0 && local16 >= 0 && Static372.anInt7082 > local27 && Static218.anInt5023 > local16) {
						Static510.method7349(local16, Static245.anInt10229, local27);
					}
				}
			}
		} else if (Static168.aClass314_8 == arg0) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8527();
			local16 = (local12 >> 4 & 0x7) + Static2.anInt5169;
			local22 = (local12 & 0x7) + Static100.anInt2668;
			local27 = Static442.aClass8_Sub8_Sub2_2.method8552();
			local35 = local27 >> 2;
			local39 = local27 & 0x3;
			local43 = Static469.anIntArray459[local35];
			if (Static69.method6418(Static336.anInt6621) || local16 >= 0 && local22 >= 0 && Static372.anInt7082 > local16 && local22 < Static218.anInt5023) {
				Static607.method6380(local43, local16, Static245.anInt10229, local35, -1, local22, local39);
			}
		} else if (arg0 == Static105.aClass314_5) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local16 = Static442.aClass8_Sub8_Sub2_2.method8525();
			Static437.aClass199_3.method5342(local12).method8171(local16);
		} else if (arg0 == Static427.aClass314_11) {
			Static442.aClass8_Sub8_Sub2_2.method8525();
			local12 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local16 = (local12 >> 4 & 0x7) + Static2.anInt5169;
			local22 = (local12 & 0x7) + Static100.anInt2668;
			local27 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local35 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local39 = Static442.aClass8_Sub8_Sub2_2.method8560();
			@Pc(676) String local676 = Static442.aClass8_Sub8_Sub2_2.method8570();
			Static186.method3533(local27, local39, Static245.anInt10229, local22, local35, local16, local676);
		} else if (arg0 == Static88.aClass314_4) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local16 = Static2.anInt5169 + (local12 >> 4 & 0x7);
			local22 = Static100.anInt2668 + (local12 & 0x7);
			local27 = Static442.aClass8_Sub8_Sub2_2.method8578();
			if (local27 == 65535) {
				local27 = -1;
			}
			local35 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local39 = local35 >> 4 & 0xF;
			local43 = local35 & 0x7;
			local47 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local165 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local169 = Static442.aClass8_Sub8_Sub2_2.method8578();
			if (local16 >= 0 && local22 >= 0 && Static372.anInt7082 > local16 && Static218.anInt5023 > local22) {
				local173 = local39 + 1;
				if (local16 - local173 <= Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0] && local173 + local16 >= Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0] && local22 - local173 <= Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0] && local173 + local22 >= Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0]) {
					Static531.method7497(local165, local169, (local22 << 8) + (local16 << 16) + (Static245.anInt10229 << 24) + local39, local27, local47, local43);
				}
			}
		} else if (arg0 == Static121.aClass314_6) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8576();
			if (local12 == 65535) {
				local12 = -1;
			}
			local16 = Static442.aClass8_Sub8_Sub2_2.method8527();
			local22 = local16 >> 2;
			local27 = local16 & 0x3;
			local35 = Static469.anIntArray459[local22];
			local39 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local43 = Static2.anInt5169 + (local39 >> 4 & 0x7);
			local47 = (local39 & 0x7) + Static100.anInt2668;
			Static237.method4360(local12, local43, Static245.anInt10229, local22, local35, local27, local47);
		} else if (Static52.aClass314_1 == arg0) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local16 = Static2.anInt5169 + (local12 >> 4 & 0x7);
			local22 = (local12 & 0x7) + Static100.anInt2668;
			local27 = Static442.aClass8_Sub8_Sub2_2.method8578();
			if (local27 == 65535) {
				local27 = -1;
			}
			local35 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local39 = local35 >> 4 & 0xF;
			local43 = local35 & 0x7;
			local47 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local165 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local169 = Static442.aClass8_Sub8_Sub2_2.method8578();
			if (local16 >= 0 && local22 >= 0 && local16 < Static372.anInt7082 && local22 < Static218.anInt5023) {
				local173 = local39 + 1;
				if (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0] >= local16 - local173 && Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray435[0] <= local173 + local16 && local22 - local173 <= Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0] && Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anIntArray436[0] <= local173 + local22) {
					Static368.method5740(local27, local43, local47, local39 + (local22 << 8) + (Static245.anInt10229 << 24) + (local16 << 16), local165, local169);
				}
			}
		} else if (Static521.aClass314_12 == arg0) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8545();
			local16 = Static442.aClass8_Sub8_Sub2_2.method8528();
			local22 = Static100.anInt2668 + (local16 & 0x7);
			local27 = Static594.anInt10160 + local22;
			local35 = Static2.anInt5169 + (local16 >> 4 & 0x7);
			local39 = local35 + Static628.anInt10493;
			local43 = Static442.aClass8_Sub8_Sub2_2.method8578();
			@Pc(1090) boolean local1090 = local35 >= 0 && local22 >= 0 && local35 < Static372.anInt7082 && Static218.anInt5023 > local22;
			if (local1090 || Static69.method6418(Static336.anInt6621)) {
				Static206.method7634(local27, new Class8_Sub11(local12, local43), Static245.anInt10229, local39);
				if (local1090) {
					Static510.method7349(local22, Static245.anInt10229, local35);
				}
			}
		} else if (arg0 == Static135.aClass314_7) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local16 = Static2.anInt5169 + (local12 >> 4 & 0x7);
			local22 = Static100.anInt2668 + (local12 & 0x7);
			local27 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local35 = Static442.aClass8_Sub8_Sub2_2.method8525();
			local39 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local43 = Static442.aClass8_Sub8_Sub2_2.method8525();
			if (local16 >= 0 && local22 >= 0 && local16 < Static372.anInt7082 && local22 < Static218.anInt5023) {
				local47 = local16 * 512 + 256;
				local165 = local22 * 512 + 256;
				local169 = Static245.anInt10229;
				if (local169 < 3 && Static61.method1675(local22, local16)) {
					local169++;
				}
				@Pc(1216) Class15_Sub1_Sub2_Sub1 local1216 = new Class15_Sub1_Sub2_Sub1(local27, local39, Static435.anInt8192, Static245.anInt10229, local169, local47, Static177.method3098(local165, local47, Static245.anInt10229) - local35, local165, local16, local16, local22, local22, local43);
				Static272.aClass43_30.method1424(new Class8_Sub5_Sub19(local1216));
			}
		} else if (arg0 == Static277.aClass314_9) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8545();
			local16 = Static442.aClass8_Sub8_Sub2_2.method8552();
			local22 = Static2.anInt5169 + (local16 >> 4 & 0x7);
			local27 = Static100.anInt2668 + (local16 & 0x7);
			local35 = Static442.aClass8_Sub8_Sub2_2.method8528();
			local39 = local35 >> 2;
			local43 = local35 & 0x3;
			local47 = Static469.anIntArray459[local39];
			if (Static69.method6418(Static336.anInt6621) || local22 >= 0 && local27 >= 0 && local22 < Static372.anInt7082 && Static218.anInt5023 > local27) {
				Static607.method6380(local47, local22, Static245.anInt10229, local39, local12, local27, local43);
			}
		} else if (Static86.aClass314_3 == arg0) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8525();
			@Pc(1314) boolean local1314 = (local12 & 0x80) != 0;
			local22 = (local12 >> 3 & 0x7) + Static2.anInt5169;
			local27 = (local12 & 0x7) + Static100.anInt2668;
			local35 = local22 + Static442.aClass8_Sub8_Sub2_2.method8550();
			local39 = local27 + Static442.aClass8_Sub8_Sub2_2.method8550();
			local43 = Static442.aClass8_Sub8_Sub2_2.method8568();
			local47 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local165 = Static442.aClass8_Sub8_Sub2_2.method8525() * 4;
			local169 = Static442.aClass8_Sub8_Sub2_2.method8525() * 4;
			local173 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local177 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local181 = Static442.aClass8_Sub8_Sub2_2.method8525();
			if (local181 == 255) {
				local181 = -1;
			}
			local198 = Static442.aClass8_Sub8_Sub2_2.method8578();
			if (local22 >= 0 && local27 >= 0 && local22 < Static372.anInt7082 && Static218.anInt5023 > local27 && local35 >= 0 && local39 >= 0 && local35 < Static372.anInt7082 && local39 < Static218.anInt5023 && local47 != 65535) {
				local35 = local35 * 512 + 256;
				local22 = local22 * 512 + 256;
				local39 = local39 * 512 + 256;
				local198 <<= 0x2;
				local165 <<= 0x2;
				local27 = local27 * 512 + 256;
				local169 <<= 0x2;
				@Pc(1484) Class15_Sub1_Sub2_Sub5 local1484 = new Class15_Sub1_Sub2_Sub5(local47, Static245.anInt10229, Static245.anInt10229, local22, local27, local165, Static435.anInt8192 + local173, Static435.anInt8192 + local177, local181, local198, 0, local43, local169, local1314, -1);
				local1484.method7562(local35, Static435.anInt8192 + local173, local39, Static177.method3098(local39, local35, Static245.anInt10229) - local169);
				Static199.aClass43_27.method1424(new Class8_Sub5_Sub9(local1484));
			}
		} else if (arg0 == Static65.aClass314_2) {
			local12 = Static442.aClass8_Sub8_Sub2_2.method8578();
			local16 = Static442.aClass8_Sub8_Sub2_2.method8528();
			local22 = (local16 & 0x7) + Static100.anInt2668;
			local27 = Static594.anInt10160 + local22;
			local35 = (local16 >> 4 & 0x7) + Static2.anInt5169;
			local39 = local35 + Static628.anInt10493;
			@Pc(1556) Class8_Sub26 local1556 = (Class8_Sub26) Static567.aClass253_38.method6594((long) (local27 << 14 | Static245.anInt10229 << 28 | local39));
			if (local1556 != null) {
				for (@Pc(1564) Class8_Sub11 local1564 = (Class8_Sub11) local1556.aClass43_25.method1422(); local1564 != null; local1564 = (Class8_Sub11) local1556.aClass43_25.method1426()) {
					if ((local12 & 0x7FFF) == local1564.anInt2018) {
						local1564.method8640();
						break;
					}
				}
				if (local1556.aClass43_25.method1420()) {
					local1556.method8640();
				}
				if (local35 >= 0 && local22 >= 0 && Static372.anInt7082 > local35 && local22 < Static218.anInt5023) {
					Static510.method7349(local22, Static245.anInt10229, local35);
				}
			}
		} else {
			Static596.method8231("T3 - " + arg0, null);
			Static232.method4294(false);
		}
	}
}
