import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static177 {

	@OriginalMember(owner = "client!li", name = "w", descriptor = "[I")
	public static int[] anIntArray430;

	@OriginalMember(owner = "client!li", name = "C", descriptor = "Lclient!b;")
	public static Class16 aClass16_15;

	@OriginalMember(owner = "client!li", name = "E", descriptor = "I")
	public static int anInt3677;

	@OriginalMember(owner = "client!li", name = "q", descriptor = "Ljava/lang/String;")
	public static final String aString149 = "green:";

	@OriginalMember(owner = "client!li", name = "v", descriptor = "I")
	public static int anInt3670 = -1;

	@OriginalMember(owner = "client!li", name = "B", descriptor = "I")
	public static int anInt3675 = 0;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(IIII)V")
	public static void method3479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg0 << 3;
		@Pc(15) int local15 = arg1 << 3;
		if (Static81.anInt1609 == 2) {
			Static54.anInt3491 = 0;
			Static107.anInt2183 = local3;
			Static5.anInt99 = local15;
		}
		Static304.aFloat110 = local15;
		Static233.aFloat86 = local3;
		Static59.method1258();
		Static1.aBoolean13 = true;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZII[[[Lclient!uk;I)Z")
	public static boolean method3480(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class204[][][] arg4) {
		@Pc(14) byte local14 = arg1 ? 1 : (byte) (Static108.anInt2197 & 0xFF);
		if (local14 == Static186.aByteArrayArrayArray8[Static285.anInt5511][arg3][arg0]) {
			return false;
		} else if ((Static183.aByteArrayArrayArray7[Static285.anInt5511][arg3][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(47) byte local47 = 0;
			Static42.anIntArray117[0] = arg3;
			@Pc(53) int local53 = 0;
			@Pc(56) int local56 = local47 + 1;
			Static352.anIntArray809[0] = arg0;
			Static186.aByteArrayArrayArray8[Static285.anInt5511][arg3][arg0] = local14;
			while (local53 != local56) {
				@Pc(74) int local74 = Static42.anIntArray117[local53] & 0xFFFF;
				@Pc(82) int local82 = Static42.anIntArray117[local53] >> 16 & 0xFF;
				@Pc(90) int local90 = Static42.anIntArray117[local53] >> 24 & 0xFF;
				@Pc(96) int local96 = Static352.anIntArray809[local53] & 0xFFFF;
				@Pc(104) int local104 = Static352.anIntArray809[local53] >> 16 & 0xFF;
				local53 = local53 + 1 & 0xFFF;
				@Pc(112) boolean local112 = false;
				if ((Static183.aByteArrayArrayArray7[Static285.anInt5511][local74][local96] & 0x4) == 0) {
					local112 = true;
				}
				@Pc(126) boolean local126 = false;
				@Pc(165) int local165;
				@Pc(208) int local208;
				label231: for (@Pc(130) int local130 = Static285.anInt5511 + 1; local130 <= 3; local130++) {
					if ((Static183.aByteArrayArrayArray7[local130][local74][local96] & 0x8) == 0) {
						@Pc(303) Class5_Sub3 local303;
						@Pc(313) int local313;
						@Pc(292) Class204 local292;
						@Pc(298) Class17 local298;
						if (local112 && arg4[local130][local74][local96] != null) {
							if (arg4[local130][local74][local96].aClass5_Sub1_1 != null) {
								local165 = Static82.method1586(local82);
								if (arg4[local130][local74][local96].aClass5_Sub1_1.anInt5964 == local165 || arg4[local130][local74][local96].aClass5_Sub1_2 != null && local165 == arg4[local130][local74][local96].aClass5_Sub1_2.anInt5964) {
									continue;
								}
								if (local90 != 0) {
									local208 = Static82.method1586(local90);
									if (local208 == arg4[local130][local74][local96].aClass5_Sub1_1.anInt5964 || arg4[local130][local74][local96].aClass5_Sub1_2 != null && arg4[local130][local74][local96].aClass5_Sub1_2.anInt5964 == local208) {
										continue;
									}
								}
								if (local104 != 0) {
									local208 = Static82.method1586(local104);
									if (local208 == arg4[local130][local74][local96].aClass5_Sub1_1.anInt5964 || arg4[local130][local74][local96].aClass5_Sub1_2 != null && arg4[local130][local74][local96].aClass5_Sub1_2.anInt5964 == local208) {
										continue;
									}
								}
							}
							local292 = arg4[local130][local74][local96];
							if (local292.aClass17_3 != null) {
								for (local298 = local292.aClass17_3; local298 != null; local298 = local298.aClass17_1) {
									local303 = local298.aClass5_Sub3_1;
									if (local303 instanceof Interface8) {
										@Pc(309) Interface8 local309 = (Interface8) local303;
										local313 = local309.method5699();
										if (local313 == 21) {
											local313 = 19;
										}
										@Pc(324) int local324 = local309.method5701();
										@Pc(330) int local330 = local313 | local324 << 6;
										if (local82 == local330 || local90 != 0 && local90 == local330 || local104 != 0 && local330 == local104) {
											continue label231;
										}
									}
								}
							}
						}
						local292 = arg4[local130][local74][local96];
						if (local292 != null && local292.aClass17_3 != null) {
							for (local298 = local292.aClass17_3; local298 != null; local298 = local298.aClass17_1) {
								local303 = local298.aClass5_Sub3_1;
								if (local303.aShort78 != local303.aShort75 || local303.aShort76 != local303.aShort77) {
									for (@Pc(407) int local407 = local303.aShort75; local407 <= local303.aShort78; local407++) {
										for (local313 = local303.aShort77; local313 <= local303.aShort76; local313++) {
											Static186.aByteArrayArrayArray8[local130][local407][local313] = local14;
										}
									}
								}
							}
						}
						Static186.aByteArrayArrayArray8[local130][local74][local96] = local14;
						local126 = true;
					}
				}
				if (local126) {
					local165 = Static7.aClass41Array1[Static285.anInt5511 + 1].method5434(local74, local96);
					if (Static37.anIntArray110[arg2] < local165) {
						Static37.anIntArray110[arg2] = local165;
					}
					local208 = local74 << 7;
					@Pc(481) int local481 = local96 << 7;
					if (Static117.anIntArray286[arg2] > local208) {
						Static117.anIntArray286[arg2] = local208;
					} else if (Static210.anIntArray500[arg2] < local208) {
						Static210.anIntArray500[arg2] = local208;
					}
					if (Static82.anIntArray192[arg2] > local481) {
						Static82.anIntArray192[arg2] = local481;
					} else if (Static314.anIntArray759[arg2] < local481) {
						Static314.anIntArray759[arg2] = local481;
					}
				}
				if (!local112) {
					if (local74 >= 1 && local14 != Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 - 1][local96]) {
						Static42.anIntArray117[local56] = local74 - 1 | 0x120000 | 0xD3000000;
						Static352.anIntArray809[local56] = local96 | 0x130000;
						local56 = local56 + 1 & 0xFFF;
						Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 - 1][local96] = local14;
					}
					local96++;
					if (local96 < Static337.anInt6402) {
						if (local74 - 1 >= 0 && Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 - 1][local96] != local14 && (Static183.aByteArrayArrayArray7[Static285.anInt5511][local74][local96] & 0x4) == 0 && (Static183.aByteArrayArrayArray7[Static285.anInt5511][local74 - 1][local96 - 1] & 0x4) == 0) {
							Static42.anIntArray117[local56] = local74 - 1 | 0x120000 | 0x52000000;
							Static352.anIntArray809[local56] = local96 | 0x130000;
							Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 - 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (local14 != Static186.aByteArrayArrayArray8[Static285.anInt5511][local74][local96]) {
							Static42.anIntArray117[local56] = local74 | 0x520000 | 0x13000000;
							Static352.anIntArray809[local56] = local96 | 0x530000;
							local56 = local56 + 1 & 0xFFF;
							Static186.aByteArrayArrayArray8[Static285.anInt5511][local74][local96] = local14;
						}
						if (local74 + 1 < Static48.anInt1107 && Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 + 1][local96] != local14 && (Static183.aByteArrayArrayArray7[Static285.anInt5511][local74][local96] & 0x4) == 0 && (Static183.aByteArrayArrayArray7[Static285.anInt5511][local74 + 1][local96 - 1] & 0x4) == 0) {
							Static42.anIntArray117[local56] = local74 + 1 | 0x520000 | 0x92000000;
							Static352.anIntArray809[local56] = local96 | 0x530000;
							local56 = local56 + 1 & 0xFFF;
							Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 + 1][local96] = local14;
						}
					}
					local96--;
					if (Static48.anInt1107 > local74 + 1 && local14 != Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 + 1][local96]) {
						Static42.anIntArray117[local56] = local74 + 1 | 0x920000 | 0x53000000;
						Static352.anIntArray809[local56] = local96 | 0x930000;
						local56 = local56 + 1 & 0xFFF;
						Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 + 1][local96] = local14;
					}
					local96--;
					if (local96 >= 0) {
						if (local74 - 1 >= 0 && local14 != Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 - 1][local96] && (Static183.aByteArrayArrayArray7[Static285.anInt5511][local74][local96] & 0x4) == 0 && (Static183.aByteArrayArrayArray7[Static285.anInt5511][local74 - 1][local96 + 1] & 0x4) == 0) {
							Static42.anIntArray117[local56] = local74 - 1 | 0xD20000 | 0x12000000;
							Static352.anIntArray809[local56] = local96 | 0xD30000;
							Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 - 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
						if (Static186.aByteArrayArrayArray8[Static285.anInt5511][local74][local96] != local14) {
							Static42.anIntArray117[local56] = local74 | 0xD20000 | 0x93000000;
							Static352.anIntArray809[local56] = local96 | 0xD30000;
							local56 = local56 + 1 & 0xFFF;
							Static186.aByteArrayArrayArray8[Static285.anInt5511][local74][local96] = local14;
						}
						if (Static48.anInt1107 > local74 + 1 && local14 != Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 + 1][local96] && (Static183.aByteArrayArrayArray7[Static285.anInt5511][local74][local96] & 0x4) == 0 && (Static183.aByteArrayArrayArray7[Static285.anInt5511][local74 + 1][local96 + 1] & 0x4) == 0) {
							Static42.anIntArray117[local56] = 0xD2000000 | 0x920000 | local74 + 1;
							Static352.anIntArray809[local56] = local96 | 0x930000;
							Static186.aByteArrayArrayArray8[Static285.anInt5511][local74 + 1][local96] = local14;
							local56 = local56 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static37.anIntArray110[arg2] != -1000000) {
				Static37.anIntArray110[arg2] += 10;
				Static117.anIntArray286[arg2] -= 50;
				Static210.anIntArray500[arg2] += 50;
				Static314.anIntArray759[arg2] += 50;
				Static82.anIntArray192[arg2] -= 50;
			}
			return true;
		}
	}
}
