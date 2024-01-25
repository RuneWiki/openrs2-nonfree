import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static258 {

	@OriginalMember(owner = "client!ija", name = "e", descriptor = "J")
	public static long aLong155;

	@OriginalMember(owner = "client!ija", name = "h", descriptor = "Lclient!cb;")
	public static final Class51 aClass51_7 = new Class51();

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "([[[Lclient!naa;ZIIII)Z")
	public static boolean method4504(@OriginalArg(0) Class243[][][] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) byte local15 = arg1 ? 1 : (byte) (Static227.anInt4418 & 0xFF);
		if (Static333.aByteArrayArrayArray15[Static504.anInt8428][arg3][arg4] == local15) {
			return false;
		} else if ((Static272.aByteArrayArrayArray2[Static504.anInt8428][arg3][arg4] & 0x4) == 0) {
			return false;
		} else {
			@Pc(57) byte local57 = 0;
			@Pc(59) int local59 = 0;
			Static273.anIntArray277[0] = arg3;
			@Pc(66) int local66 = local57 + 1;
			Static616.anIntArray639[0] = arg4;
			Static333.aByteArrayArrayArray15[Static504.anInt8428][arg3][arg4] = local15;
			while (local66 != local59) {
				@Pc(84) int local84 = Static273.anIntArray277[local59] & 0xFFFF;
				@Pc(92) int local92 = Static273.anIntArray277[local59] >> 16 & 0xFF;
				@Pc(100) int local100 = Static273.anIntArray277[local59] >> 24 & 0xFF;
				@Pc(106) int local106 = Static616.anIntArray639[local59] & 0xFFFF;
				@Pc(114) int local114 = Static616.anIntArray639[local59] >> 16 & 0xFF;
				local59 = local59 + 1 & 0xFFF;
				@Pc(122) boolean local122 = false;
				if ((Static272.aByteArrayArrayArray2[Static504.anInt8428][local84][local106] & 0x4) == 0) {
					local122 = true;
				}
				@Pc(136) boolean local136 = false;
				@Pc(142) int local142;
				@Pc(192) int local192;
				@Pc(246) int local246;
				if (arg0 != null) {
					label237: for (local142 = Static504.anInt8428 + 1; local142 <= 3; local142++) {
						if (arg0[local142] != null && (Static272.aByteArrayArrayArray2[local142][local84][local106] & 0x8) == 0) {
							@Pc(359) Class60_Sub1_Sub1 local359;
							@Pc(369) int local369;
							@Pc(348) Class243 local348;
							@Pc(354) Class123 local354;
							if (local122 && arg0[local142][local84][local106] != null) {
								if (arg0[local142][local84][local106].aClass60_Sub1_Sub3_1 != null) {
									local192 = Static277.method4644(local92);
									if (local192 == arg0[local142][local84][local106].aClass60_Sub1_Sub3_1.aShort115 || arg0[local142][local84][local106].aClass60_Sub1_Sub3_2 != null && arg0[local142][local84][local106].aClass60_Sub1_Sub3_2.aShort115 == local192) {
										continue;
									}
									if (local100 != 0) {
										local246 = Static277.method4644(local100);
										if (arg0[local142][local84][local106].aClass60_Sub1_Sub3_1.aShort115 == local246 || arg0[local142][local84][local106].aClass60_Sub1_Sub3_2 != null && local246 == arg0[local142][local84][local106].aClass60_Sub1_Sub3_2.aShort115) {
											continue;
										}
									}
									if (local114 != 0) {
										local246 = Static277.method4644(local114);
										if (arg0[local142][local84][local106].aClass60_Sub1_Sub3_1.aShort115 == local246 || arg0[local142][local84][local106].aClass60_Sub1_Sub3_2 != null && local246 == arg0[local142][local84][local106].aClass60_Sub1_Sub3_2.aShort115) {
											continue;
										}
									}
								}
								local348 = arg0[local142][local84][local106];
								if (local348.aClass123_5 != null) {
									for (local354 = local348.aClass123_5; local354 != null; local354 = local354.aClass123_1) {
										local359 = local354.aClass60_Sub1_Sub1_1;
										if (local359 instanceof Interface23) {
											@Pc(365) Interface23 local365 = (Interface23) local359;
											local369 = local365.method7929(89);
											if (local369 == 21) {
												local369 = 19;
											}
											@Pc(378) int local378 = local365.method7932();
											@Pc(384) int local384 = local369 | local378 << 6;
											if (local92 == local384 || local100 != 0 && local384 == local100 || local114 != 0 && local384 == local114) {
												continue label237;
											}
										}
									}
								}
							}
							local348 = arg0[local142][local84][local106];
							if (local348 != null && local348.aClass123_5 != null) {
								for (local354 = local348.aClass123_5; local354 != null; local354 = local354.aClass123_1) {
									local359 = local354.aClass60_Sub1_Sub1_1;
									if (local359.aShort101 != local359.aShort100 || local359.aShort102 != local359.aShort99) {
										for (@Pc(464) int local464 = local359.aShort100; local464 <= local359.aShort101; local464++) {
											for (local369 = local359.aShort102; local369 <= local359.aShort99; local369++) {
												Static333.aByteArrayArrayArray15[local142][local464][local369] = local15;
											}
										}
									}
								}
							}
							Static333.aByteArrayArrayArray15[local142][local84][local106] = local15;
							local136 = true;
						}
					}
				}
				if (local136) {
					local142 = Static555.aClass96Array3[Static504.anInt8428 + 1].method8080(local84, local106);
					if (Static451.anIntArray492[arg2] < local142) {
						Static451.anIntArray492[arg2] = local142;
					}
					local192 = local84 << 9;
					if (local192 < Static39.anIntArray39[arg2]) {
						Static39.anIntArray39[arg2] = local192;
					} else if (local192 > Static568.anIntArray660[arg2]) {
						Static568.anIntArray660[arg2] = local192;
					}
					local246 = local106 << 9;
					if (local246 < Static236.anIntArray235[arg2]) {
						Static236.anIntArray235[arg2] = local246;
					} else if (local246 > Static224.anIntArray222[arg2]) {
						Static224.anIntArray222[arg2] = local246;
					}
				}
				if (!local122) {
					if (local84 >= 1 && local15 != Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 - 1][local106]) {
						Static273.anIntArray277[local66] = 0xD3000000 | 0x120000 | local84 - 1;
						Static616.anIntArray639[local66] = local106 | 0x130000;
						Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 - 1][local106] = local15;
						local66 = local66 + 1 & 0xFFF;
					}
					@Pc(664) int local664 = ~Static327.anInt5650;
					local106++;
					if (local664 < ~local106) {
						if (local84 - 1 >= 0 && Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 - 1][local106] != local15 && (Static272.aByteArrayArrayArray2[Static504.anInt8428][local84][local106] & 0x4) == 0 && (Static272.aByteArrayArrayArray2[Static504.anInt8428][local84 - 1][local106 - 1] & 0x4) == 0) {
							Static273.anIntArray277[local66] = local84 - 1 | 0x120000 | 0x52000000;
							Static616.anIntArray639[local66] = local106 | 0x130000;
							Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 - 1][local106] = local15;
							local66 = local66 + 1 & 0xFFF;
						}
						if (local15 != Static333.aByteArrayArrayArray15[Static504.anInt8428][local84][local106]) {
							Static273.anIntArray277[local66] = local84 | 0x520000 | 0x13000000;
							Static616.anIntArray639[local66] = local106 | 0x530000;
							local66 = local66 + 1 & 0xFFF;
							Static333.aByteArrayArrayArray15[Static504.anInt8428][local84][local106] = local15;
						}
						if (Static29.anInt380 > local84 + 1 && local15 != Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 + 1][local106] && (Static272.aByteArrayArrayArray2[Static504.anInt8428][local84][local106] & 0x4) == 0 && (Static272.aByteArrayArrayArray2[Static504.anInt8428][local84 + 1][local106 - 1] & 0x4) == 0) {
							Static273.anIntArray277[local66] = local84 + 1 | 0x520000 | 0x92000000;
							Static616.anIntArray639[local66] = local106 | 0x530000;
							local66 = local66 + 1 & 0xFFF;
							Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 + 1][local106] = local15;
						}
					}
					local106--;
					if (Static29.anInt380 > local84 + 1 && local15 != Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 + 1][local106]) {
						Static273.anIntArray277[local66] = local84 + 1 | 0x920000 | 0x53000000;
						Static616.anIntArray639[local66] = local106 | 0x930000;
						local66 = local66 + 1 & 0xFFF;
						Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 + 1][local106] = local15;
					}
					local106--;
					if (local106 >= 0) {
						if (local84 - 1 >= 0 && local15 != Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 - 1][local106] && (Static272.aByteArrayArrayArray2[Static504.anInt8428][local84][local106] & 0x4) == 0 && (Static272.aByteArrayArrayArray2[Static504.anInt8428][local84 - 1][local106 + 1] & 0x4) == 0) {
							Static273.anIntArray277[local66] = local84 - 1 | 0x12000000 | 0xD20000;
							Static616.anIntArray639[local66] = local106 | 0xD30000;
							local66 = local66 + 1 & 0xFFF;
							Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 - 1][local106] = local15;
						}
						if (local15 != Static333.aByteArrayArrayArray15[Static504.anInt8428][local84][local106]) {
							Static273.anIntArray277[local66] = local84 | 0xD20000 | 0x93000000;
							Static616.anIntArray639[local66] = local106 | 0xD30000;
							local66 = local66 + 1 & 0xFFF;
							Static333.aByteArrayArrayArray15[Static504.anInt8428][local84][local106] = local15;
						}
						if (Static29.anInt380 > local84 + 1 && Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 + 1][local106] != local15 && (Static272.aByteArrayArrayArray2[Static504.anInt8428][local84][local106] & 0x4) == 0 && (Static272.aByteArrayArrayArray2[Static504.anInt8428][local84 + 1][local106 + 1] & 0x4) == 0) {
							Static273.anIntArray277[local66] = 0xD2000000 | 0x920000 | local84 + 1;
							Static616.anIntArray639[local66] = local106 | 0x930000;
							local66 = local66 + 1 & 0xFFF;
							Static333.aByteArrayArrayArray15[Static504.anInt8428][local84 + 1][local106] = local15;
						}
					}
				}
			}
			if (Static451.anIntArray492[arg2] != -1000000) {
				Static451.anIntArray492[arg2] += 40;
				Static39.anIntArray39[arg2] -= 512;
				Static568.anIntArray660[arg2] += 512;
				Static224.anIntArray222[arg2] += 512;
				Static236.anIntArray235[arg2] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ija", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4505(@OriginalArg(0) Class75 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static93.aBoolean113) {
			local7 = Static24.method290();
			local9 = Static488.method7227();
		}
		arg0.KA(local7, local9, Static535.anInt4128 + local7, local9 + 350);
		arg0.aa(local7, local9, Static535.anInt4128, 350, Static360.anInt6079 << 24 | 0x332277, 1);
		Static494.method3707(local9, local7, local9 + 350, local7 - -Static535.anInt4128);
		@Pc(61) int local61 = 350 / Static207.anInt4156;
		@Pc(70) int local70;
		if (Static573.anInt9177 > 0) {
			local70 = 346 - Static207.anInt4156 - 4;
			@Pc(80) int local80 = local61 * local70 / (Static573.anInt9177 + local61 - 1);
			@Pc(82) int local82 = 4;
			if (Static573.anInt9177 > 1) {
				local82 = (local70 - local80) * (-Static577.anInt9220 + (Static573.anInt9177 - 1)) / (Static573.anInt9177 - 1) + 4;
			}
			arg0.aa(Static535.anInt4128 + local7 - 16, local9 + local82, 12, local80, Static360.anInt6079 << 24 | 0x332277, 2);
			for (@Pc(123) int local123 = Static577.anInt9220; local123 < Static577.anInt9220 + local61 && local123 < Static573.anInt9177; local123++) {
				@Pc(132) String[] local132 = Static26.method332('\b', Static177.aStringArray14[local123]);
				@Pc(141) int local141 = (Static535.anInt4128 - 16 - 8) / local132.length;
				for (@Pc(143) int local143 = 0; local143 < local132.length; local143++) {
					@Pc(152) int local152 = local143 * local141 + 8;
					arg0.KA(local7 + local152, local9, local141 + local152 + local7 - 8, local9 + 350);
					Static180.aClass67_5.method8294(local9 + 350 - Static660.anInt10201 - Static507.aClass53_16.anInt811 - (local123 - Static577.anInt9220) * Static207.anInt4156 - 2, Static316.method5658(local132[local143]), -16777216, local7 + local152, -1);
				}
			}
		}
		Static23.aClass67_1.method8285("Build: 658", Static535.anInt4128 + local7 - 25, -1, local9 + 350 - 20, -16777216);
		arg0.KA(local7, local9, local7 + Static535.anInt4128, local9 - -350);
		arg0.method6661(local9 + 350 - Static660.anInt10201, Static535.anInt4128, local7, -1);
		Static205.aClass67_6.method8294(local9 + 350 - Static228.aClass53_7.anInt811 - 1, "--> " + Static316.method5658(Static623.aString118), -16777216, local7 + 10, -1);
		if (!Static285.aBoolean390) {
			return;
		}
		local70 = -1;
		if (Static141.anInt8737 % 30 > 15) {
			local70 = 16777215;
		}
		arg0.method6691(local9 + 350 - Static228.aClass53_7.anInt811 - 11, 12, Static228.aClass53_7.method824("--> " + Static316.method5658(Static623.aString118).substring(0, Static315.anInt5467)) + local7 + 10, local70);
	}
}
