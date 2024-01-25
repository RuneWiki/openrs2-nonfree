import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static472 {

	@OriginalMember(owner = "client!ow", name = "u", descriptor = "Lclient!ct;")
	public static final Class58 aClass58_3 = new Class58();

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IZ[[[Lclient!nt;III)Z")
	public static boolean method6962(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class262[][][] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(28) byte local28 = arg1 ? 1 : (byte) (Static220.anInt4252 & 0xFF);
		if (local28 == Static221.aByteArrayArrayArray15[Static712.anInt11117][arg4][arg0]) {
			return false;
		} else if ((Static6.aByteArrayArrayArray1[Static712.anInt11117][arg4][arg0] & 0x4) == 0) {
			return false;
		} else {
			@Pc(62) byte local62 = 0;
			Static714.anIntArray626[0] = arg4;
			@Pc(68) int local68 = 0;
			@Pc(71) int local71 = local62 + 1;
			Static599.anIntArray543[0] = arg0;
			Static221.aByteArrayArrayArray15[Static712.anInt11117][arg4][arg0] = local28;
			while (local68 != local71) {
				@Pc(89) int local89 = Static714.anIntArray626[local68] & 0xFFFF;
				@Pc(97) int local97 = Static714.anIntArray626[local68] >> 16 & 0xFF;
				@Pc(105) int local105 = Static714.anIntArray626[local68] >> 24 & 0xFF;
				@Pc(111) int local111 = Static599.anIntArray543[local68] & 0xFFFF;
				@Pc(119) int local119 = Static599.anIntArray543[local68] >> 16 & 0xFF;
				local68 = local68 + 1 & 0xFFF;
				@Pc(127) boolean local127 = false;
				if ((Static6.aByteArrayArrayArray1[Static712.anInt11117][local89][local111] & 0x4) == 0) {
					local127 = true;
				}
				@Pc(141) boolean local141 = false;
				@Pc(147) int local147;
				@Pc(197) int local197;
				@Pc(248) int local248;
				if (arg2 != null) {
					label237: for (local147 = Static712.anInt11117 + 1; local147 <= 3; local147++) {
						if (arg2[local147] != null && (Static6.aByteArrayArrayArray1[local147][local89][local111] & 0x8) == 0) {
							@Pc(357) Class19_Sub1_Sub3 local357;
							@Pc(367) int local367;
							@Pc(346) Class262 local346;
							@Pc(352) Class343 local352;
							if (local127 && arg2[local147][local89][local111] != null) {
								if (arg2[local147][local89][local111].aClass19_Sub1_Sub2_2 != null) {
									local197 = Static282.method4267(local97);
									if (local197 == arg2[local147][local89][local111].aClass19_Sub1_Sub2_2.aShort127 || arg2[local147][local89][local111].aClass19_Sub1_Sub2_1 != null && arg2[local147][local89][local111].aClass19_Sub1_Sub2_1.aShort127 == local197) {
										continue;
									}
									if (local105 != 0) {
										local248 = Static282.method4267(local105);
										if (local248 == arg2[local147][local89][local111].aClass19_Sub1_Sub2_2.aShort127 || arg2[local147][local89][local111].aClass19_Sub1_Sub2_1 != null && arg2[local147][local89][local111].aClass19_Sub1_Sub2_1.aShort127 == local248) {
											continue;
										}
									}
									if (local119 != 0) {
										local248 = Static282.method4267(local119);
										if (local248 == arg2[local147][local89][local111].aClass19_Sub1_Sub2_2.aShort127 || arg2[local147][local89][local111].aClass19_Sub1_Sub2_1 != null && arg2[local147][local89][local111].aClass19_Sub1_Sub2_1.aShort127 == local248) {
											continue;
										}
									}
								}
								local346 = arg2[local147][local89][local111];
								if (local346.aClass343_2 != null) {
									for (local352 = local346.aClass343_2; local352 != null; local352 = local352.aClass343_4) {
										local357 = local352.aClass19_Sub1_Sub3_1;
										if (local357 instanceof Interface19) {
											@Pc(363) Interface19 local363 = (Interface19) local357;
											local367 = local363.method9381();
											if (local367 == 21) {
												local367 = 19;
											}
											@Pc(376) int local376 = local363.method9385();
											@Pc(382) int local382 = local376 << 6 | local367;
											if (local97 == local382 || local105 != 0 && local105 == local382 || local119 != 0 && local382 == local119) {
												continue label237;
											}
										}
									}
								}
							}
							local346 = arg2[local147][local89][local111];
							if (local346 != null && local346.aClass343_2 != null) {
								for (local352 = local346.aClass343_2; local352 != null; local352 = local352.aClass343_4) {
									local357 = local352.aClass19_Sub1_Sub3_1;
									if (local357.aShort121 != local357.aShort123 || local357.aShort124 != local357.aShort122) {
										for (@Pc(463) int local463 = local357.aShort121; local463 <= local357.aShort123; local463++) {
											for (local367 = local357.aShort124; local367 <= local357.aShort122; local367++) {
												Static221.aByteArrayArrayArray15[local147][local463][local367] = local28;
											}
										}
									}
								}
							}
							local141 = true;
							Static221.aByteArrayArrayArray15[local147][local89][local111] = local28;
						}
					}
				}
				if (local141) {
					local147 = Static639.aClass313Array2[Static712.anInt11117 + 1].method9095(local111, local89);
					if (Static287.anIntArray305[arg3] < local147) {
						Static287.anIntArray305[arg3] = local147;
					}
					local197 = local89 << 9;
					if (local197 < Static167.anIntArray153[arg3]) {
						Static167.anIntArray153[arg3] = local197;
					} else if (Static228.anIntArray503[arg3] < local197) {
						Static228.anIntArray503[arg3] = local197;
					}
					local248 = local111 << 9;
					if (local248 < Static603.anIntArray546[arg3]) {
						Static603.anIntArray546[arg3] = local248;
					} else if (Static482.anIntArray460[arg3] < local248) {
						Static482.anIntArray460[arg3] = local248;
					}
				}
				if (!local127) {
					if (local89 >= 1 && Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 - 1][local111] != local28) {
						Static714.anIntArray626[local71] = local89 - 1 | 0x120000 | 0xD3000000;
						Static599.anIntArray543[local71] = local111 | 0x130000;
						local71 = local71 + 1 & 0xFFF;
						Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 - 1][local111] = local28;
					}
					@Pc(665) int local665 = ~Static206.anInt11291;
					local111++;
					if (local665 < ~local111) {
						if (local89 - 1 >= 0 && local28 != Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 - 1][local111] && (Static6.aByteArrayArrayArray1[Static712.anInt11117][local89][local111] & 0x4) == 0 && (Static6.aByteArrayArrayArray1[Static712.anInt11117][local89 - 1][local111 - 1] & 0x4) == 0) {
							Static714.anIntArray626[local71] = local89 - 1 | 0x120000 | 0x52000000;
							Static599.anIntArray543[local71] = local111 | 0x130000;
							local71 = local71 + 1 & 0xFFF;
							Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 - 1][local111] = local28;
						}
						if (Static221.aByteArrayArrayArray15[Static712.anInt11117][local89][local111] != local28) {
							Static714.anIntArray626[local71] = local89 | 0x520000 | 0x13000000;
							Static599.anIntArray543[local71] = local111 | 0x530000;
							Static221.aByteArrayArrayArray15[Static712.anInt11117][local89][local111] = local28;
							local71 = local71 + 1 & 0xFFF;
						}
						if (Static362.anInt8653 > local89 + 1 && local28 != Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 + 1][local111] && (Static6.aByteArrayArrayArray1[Static712.anInt11117][local89][local111] & 0x4) == 0 && (Static6.aByteArrayArrayArray1[Static712.anInt11117][local89 + 1][local111 - 1] & 0x4) == 0) {
							Static714.anIntArray626[local71] = local89 + 1 | 0x520000 | 0x92000000;
							Static599.anIntArray543[local71] = local111 | 0x530000;
							Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 + 1][local111] = local28;
							local71 = local71 + 1 & 0xFFF;
						}
					}
					local111--;
					if (Static362.anInt8653 > local89 + 1 && local28 != Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 + 1][local111]) {
						Static714.anIntArray626[local71] = 0x53000000 | 0x920000 | local89 + 1;
						Static599.anIntArray543[local71] = local111 | 0x930000;
						local71 = local71 + 1 & 0xFFF;
						Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 + 1][local111] = local28;
					}
					local111--;
					if (local111 >= 0) {
						if (local89 - 1 >= 0 && Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 - 1][local111] != local28 && (Static6.aByteArrayArrayArray1[Static712.anInt11117][local89][local111] & 0x4) == 0 && (Static6.aByteArrayArrayArray1[Static712.anInt11117][local89 - 1][local111 + 1] & 0x4) == 0) {
							Static714.anIntArray626[local71] = local89 - 1 | 0x12000000 | 0xD20000;
							Static599.anIntArray543[local71] = local111 | 0xD30000;
							local71 = local71 + 1 & 0xFFF;
							Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 - 1][local111] = local28;
						}
						if (Static221.aByteArrayArrayArray15[Static712.anInt11117][local89][local111] != local28) {
							Static714.anIntArray626[local71] = local89 | 0xD20000 | 0x93000000;
							Static599.anIntArray543[local71] = local111 | 0xD30000;
							local71 = local71 + 1 & 0xFFF;
							Static221.aByteArrayArrayArray15[Static712.anInt11117][local89][local111] = local28;
						}
						if (Static362.anInt8653 > local89 + 1 && Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 + 1][local111] != local28 && (Static6.aByteArrayArrayArray1[Static712.anInt11117][local89][local111] & 0x4) == 0 && (Static6.aByteArrayArrayArray1[Static712.anInt11117][local89 + 1][local111 + 1] & 0x4) == 0) {
							Static714.anIntArray626[local71] = local89 + 1 | 0xD2000000 | 0x920000;
							Static599.anIntArray543[local71] = local111 | 0x930000;
							Static221.aByteArrayArrayArray15[Static712.anInt11117][local89 + 1][local111] = local28;
							local71 = local71 + 1 & 0xFFF;
						}
					}
				}
			}
			if (Static287.anIntArray305[arg3] != -1000000) {
				Static287.anIntArray305[arg3] += 40;
				Static167.anIntArray153[arg3] -= 512;
				Static228.anIntArray503[arg3] += 512;
				Static482.anIntArray460[arg3] += 512;
				Static603.anIntArray546[arg3] -= 512;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)V")
	public static void method6963() {
		if (Static25.aClass201_1 == null) {
			return;
		}
		if (Static25.aClass201_1.anInt5729 == 1) {
			Static25.aClass201_1 = null;
			return;
		}
		if (Static25.aClass201_1.anInt5729 == 2) {
			Static8.method112(Static101.aString31, 2, Static170.aClass47_2);
			Static25.aClass201_1 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(III)B")
	public static byte method6964(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 9) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(IZIZIII)V")
	public static void method6966(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 < 512 || arg3 < 512 || arg2 > Static362.anInt8653 * 512 - 1024 || (Static206.anInt11291 - 2) * 512 < arg3) {
			Static335.anIntArray331[0] = Static335.anIntArray331[1] = -1;
			return;
		}
		@Pc(53) int local53 = Static505.method7237(arg0, arg3, arg2) - arg4;
		if (Static178.aBoolean264) {
			Static443.method6437(true);
		} else {
			Static122.aClass181_12.method6354(arg1, 0, 0);
			Static488.aClass67_12.method7642(Static122.aClass181_12);
		}
		if (Static568.aBoolean784) {
			Static488.aClass67_12.HA(arg2, local53, arg3, Static705.anInt11029, Static335.anIntArray331);
		} else {
			Static488.aClass67_12.da(arg2, local53, arg3, Static335.anIntArray331);
		}
		if (Static178.aBoolean264) {
			Static661.method8827();
		} else {
			Static122.aClass181_12.method6354(-arg1, 0, 0);
			Static488.aClass67_12.method7642(Static122.aClass181_12);
		}
	}
}
