import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static451 {

	@OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
	public static int anInt7905;

	@OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIZ[[[Lclient!rg;B)Z")
	public static boolean method6569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) Class255[][][] arg4) {
		@Pc(14) byte local14 = arg3 ? 1 : (byte) (Static45.anInt915 & 0xFF);
		if (local14 == Static406.aByteArrayArrayArray15[Static501.anInt8491][arg0][arg2]) {
			return false;
		} else if ((Static530.aByteArrayArrayArray17[Static501.anInt8491][arg0][arg2] & 0x4) == 0) {
			return false;
		} else {
			@Pc(47) byte local47 = 0;
			@Pc(49) int local49 = 0;
			Static288.anIntArray546[0] = arg0;
			@Pc(56) int local56 = local47 + 1;
			Static446.anIntArray722[0] = arg2;
			Static406.aByteArrayArrayArray15[Static501.anInt8491][arg0][arg2] = local14;
			while (local49 != local56) {
				@Pc(74) int local74 = Static288.anIntArray546[local49] & 0xFFFF;
				@Pc(82) int local82 = Static288.anIntArray546[local49] >> 16 & 0xFF;
				@Pc(90) int local90 = Static288.anIntArray546[local49] >> 24 & 0xFF;
				@Pc(96) int local96 = Static446.anIntArray722[local49] & 0xFFFF;
				@Pc(104) int local104 = Static446.anIntArray722[local49] >> 16 & 0xFF;
				local49 = local49 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static530.aByteArrayArrayArray17[Static501.anInt8491][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(168) int local168;
				@Pc(218) int local218;
				label231: for (@Pc(130) int local130 = Static501.anInt8491 + 1; local130 <= 3; local130++) {
					if ((Static530.aByteArrayArrayArray17[local130][local74][local96] & 0x8) == 0) {
						@Pc(321) Class49_Sub2 local321;
						@Pc(331) int local331;
						@Pc(310) Class255 local310;
						@Pc(316) Class63 local316;
						if (local112 && arg4[local130][local74][local96] != null) {
							if (arg4[local130][local74][local96].aClass49_Sub1_3 != null) {
								local168 = Static162.method2508(local82);
								if (local168 == arg4[local130][local74][local96].aClass49_Sub1_3.anInt8034 || arg4[local130][local74][local96].aClass49_Sub1_2 != null && arg4[local130][local74][local96].aClass49_Sub1_2.anInt8034 == local168) {
									continue;
								}
								if (local90 != 0) {
									local218 = Static162.method2508(local90);
									if (local218 == arg4[local130][local74][local96].aClass49_Sub1_3.anInt8034 || arg4[local130][local74][local96].aClass49_Sub1_2 != null && local218 == arg4[local130][local74][local96].aClass49_Sub1_2.anInt8034) {
										continue;
									}
								}
								if (local104 != 0) {
									local218 = Static162.method2508(local104);
									if (arg4[local130][local74][local96].aClass49_Sub1_3.anInt8034 == local218 || arg4[local130][local74][local96].aClass49_Sub1_2 != null && local218 == arg4[local130][local74][local96].aClass49_Sub1_2.anInt8034) {
										continue;
									}
								}
							}
							local310 = arg4[local130][local74][local96];
							if (local310.aClass63_3 != null) {
								for (local316 = local310.aClass63_3; local316 != null; local316 = local316.aClass63_1) {
									local321 = local316.aClass49_Sub2_1;
									if (local321 instanceof Interface18) {
										@Pc(327) Interface18 local327 = (Interface18) local321;
										local331 = local327.method7465();
										@Pc(335) int local335 = local327.method7469();
										if (local331 == 21) {
											local331 = 19;
										}
										@Pc(348) int local348 = local335 << 6 | local331;
										if (local82 == local348 || local90 != 0 && local348 == local90 || local104 != 0 && local348 == local104) {
											continue label231;
										}
									}
								}
							}
						}
						local310 = arg4[local130][local74][local96];
						if (local310 != null && local310.aClass63_3 != null) {
							for (local316 = local310.aClass63_3; local316 != null; local316 = local316.aClass63_1) {
								local321 = local316.aClass49_Sub2_1;
								if (local321.aShort115 != local321.aShort117 || local321.aShort116 != local321.aShort118) {
									for (@Pc(417) int local417 = local321.aShort117; local417 <= local321.aShort115; local417++) {
										for (local331 = local321.aShort116; local331 <= local321.aShort118; local331++) {
											Static406.aByteArrayArrayArray15[local130][local417][local331] = local14;
										}
									}
								}
							}
						}
						Static406.aByteArrayArrayArray15[local130][local74][local96] = local14;
						local126 = true;
					}
				}
				if (local126) {
					local168 = Static544.aClass205Array3[Static501.anInt8491 + 1].ba(local74, local96);
					if (local168 > Static220.anIntArray429[arg1]) {
						Static220.anIntArray429[arg1] = local168;
					}
					local218 = local74 << 9;
					if (local218 < Static238.anIntArray611[arg1]) {
						Static238.anIntArray611[arg1] = local218;
					} else if (local218 > client.lb[arg1]) {
						client.lb[arg1] = local218;
					}
					@Pc(527) int local527 = local96 << 9;
					if (Static383.anIntArray578[arg1] > local527) {
						Static383.anIntArray578[arg1] = local527;
					} else if (Static306.anIntArray564[arg1] < local527) {
						Static306.anIntArray564[arg1] = local527;
					}
				}
				if (!local112) {
					if (local74 >= 1 && Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 - 1][local96] != local14) {
						Static288.anIntArray546[local56] = local74 - 1 | 0xD3000000 | 0x120000;
						Static446.anIntArray722[local56] = local96 | 0x130000;
						Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 - 1][local96] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local96++;
					if (local96 < Static482.anInt7990) {
						if (local74 - 1 >= 0 && local14 != Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 - 1][local96] && (Static530.aByteArrayArrayArray17[Static501.anInt8491][local74][local96] & 0x4) == 0 && (Static530.aByteArrayArrayArray17[Static501.anInt8491][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static288.anIntArray546[local56] = local74 - 1 | 0x120000 | 0x52000000;
							Static446.anIntArray722[local56] = local96 | 0x130000;
							Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 - 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local14 != Static406.aByteArrayArrayArray15[Static501.anInt8491][local74][local96]) {
							Static288.anIntArray546[local56] = local74 | 0x520000 | 0x13000000;
							Static446.anIntArray722[local56] = local96 | 0x530000;
							Static406.aByteArrayArrayArray15[Static501.anInt8491][local74][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local74 + 1 < Static459.anInt7799 && local14 != Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 + 1][local96] && (Static530.aByteArrayArrayArray17[Static501.anInt8491][local74][local96] & 0x4) == 0 && (Static530.aByteArrayArrayArray17[Static501.anInt8491][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static288.anIntArray546[local56] = local74 + 1 | 0x520000 | 0x92000000;
							Static446.anIntArray722[local56] = local96 | 0x530000;
							Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 + 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
					}
					local96--;
					if (local74 + 1 < Static459.anInt7799 && Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 + 1][local96] != local14) {
						Static288.anIntArray546[local56] = local74 + 1 | 0x920000 | 0x53000000;
						Static446.anIntArray722[local56] = local96 | 0x930000;
						Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 + 1][local96] = local14;
						local56 = local56 + 1 & 0xFFF;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && local14 != Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 - 1][local96] && (Static530.aByteArrayArrayArray17[Static501.anInt8491][local74][local96] & 0x4) == 0 && (Static530.aByteArrayArrayArray17[Static501.anInt8491][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static288.anIntArray546[local56] = local74 - 1 | 0xD20000 | 0x12000000;
							Static446.anIntArray722[local56] = local96 | 0xD30000;
							Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 - 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (Static406.aByteArrayArrayArray15[Static501.anInt8491][local74][local96] != local14) {
							Static288.anIntArray546[local56] = local74 | 0xD20000 | 0x93000000;
							Static446.anIntArray722[local56] = local96 | 0xD30000;
							Static406.aByteArrayArrayArray15[Static501.anInt8491][local74][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local74 + 1 < Static459.anInt7799 && Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 + 1][local96] != local14 && (Static530.aByteArrayArrayArray17[Static501.anInt8491][local74][local96] & 0x4) == 0 && (Static530.aByteArrayArrayArray17[Static501.anInt8491][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static288.anIntArray546[local56] = local74 + 1 | 0x920000 | 0xD2000000;
							Static446.anIntArray722[local56] = local96 | 0x930000;
							local56 = local56 + 1 & 0xFFF;
							Static406.aByteArrayArrayArray15[Static501.anInt8491][local74 + 1][local96] = local14;
						}
					}
				}
			}
			if (Static220.anIntArray429[arg1] != -1000000) {
				Static220.anIntArray429[arg1] += 10;
				Static238.anIntArray611[arg1] -= 50;
				client.lb[arg1] += 50;
				Static306.anIntArray564[arg1] += 50;
				Static383.anIntArray578[arg1] -= 50;
			}
			return true;
		}
	}
}
