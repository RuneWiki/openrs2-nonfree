import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "Z")
	public static boolean aBoolean183 = false;

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1336 = Static64.method1101("Eingabeprozedur geladen)3");

	@OriginalMember(owner = "client!ri", name = "f", descriptor = "Lclient!ia;")
	private static Class51 aClass51_1337 = Static64.method1101("Members object");

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Lclient!ia;")
	public static Class51 aClass51_1338 = aClass51_1337;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIILclient!ij;IJZ)Z")
	public static boolean method3022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class5 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) long arg7, @OriginalArg(8) boolean arg8) {
		if (arg5 == null) {
			return true;
		}
		@Pc(7) int local7 = arg1 - arg4;
		@Pc(11) int local11 = arg2 - arg4;
		@Pc(15) int local15 = arg1 + arg4;
		@Pc(19) int local19 = arg2 + arg4;
		if (arg8) {
			if (arg6 > 640 && arg6 < 1408) {
				local19 += 128;
			}
			if (arg6 > 1152 && arg6 < 1920) {
				local15 += 128;
			}
			if (arg6 > 1664 || arg6 < 384) {
				local11 -= 128;
			}
			if (arg6 > 128 && arg6 < 896) {
				local7 -= 128;
			}
		}
		local7 /= 128;
		local11 /= 128;
		local15 /= 128;
		local19 /= 128;
		return Static14.method277(arg0, local7, local11, local15 + 1 - local7, local19 - local11 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lclient!bd;BLclient!mb;Lclient!mb;)V")
	public static void method3023(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) Class70 arg1, @OriginalArg(3) Class70 arg2) {
		Static51.aClass70_15 = arg1;
		Static120.anInterface1_1 = arg0;
		Static59.aClass70_16 = arg2;
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIII)V")
	public static void method3024(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static71.method1261(Static113.anIntArrayArray10[arg0], arg1 - arg3, arg2, arg1 + arg3);
		@Pc(24) int local24 = 0;
		@Pc(26) int local26 = arg3;
		@Pc(29) int local29 = -arg3;
		@Pc(31) int local31 = -1;
		while (local24 < local26) {
			local24++;
			local31 += 2;
			local29 += local31;
			if (local29 >= 0) {
				local26--;
				@Pc(48) int[] local48 = Static113.anIntArrayArray10[local26 + arg0];
				local29 -= local26 << 1;
				@Pc(61) int[] local61 = Static113.anIntArrayArray10[arg0 - local26];
				@Pc(65) int local65 = local24 + arg1;
				@Pc(70) int local70 = arg1 - local24;
				Static71.method1261(local48, local70, arg2, local65);
				Static71.method1261(local61, local70, arg2, local65);
			}
			@Pc(86) int local86 = local26 + arg1;
			@Pc(91) int local91 = arg1 - local26;
			@Pc(98) int[] local98 = Static113.anIntArrayArray10[arg0 + local24];
			@Pc(104) int[] local104 = Static113.anIntArrayArray10[arg0 - local24];
			Static71.method1261(local98, local91, arg2, local86);
			Static71.method1261(local104, local91, arg2, local86);
		}
	}

	@OriginalMember(owner = "client!ri", name = "b", descriptor = "(IIIII)V")
	public static void method3025(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static127.anInt2862; local7++) {
			if (arg2 < Static187.anIntArray305[local7] + Static33.anIntArray48[local7] && Static33.anIntArray48[local7] < arg2 + arg0 && arg1 < Static164.anIntArray239[local7] + Static62.anIntArray93[local7] && Static62.anIntArray93[local7] < arg1 + arg3) {
				Static22.aBooleanArray8[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V")
	public static void method3026() {
		Static18.method383();
		System.gc();
		Static142.method2482(25);
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIZI)V")
	public static void method3027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4) {
		Static10.anInt217++;
		if (!arg3) {
			Static100.method1674(true);
			Static125.method2775(true);
			Static100.method1674(false);
		}
		Static125.method2775(false);
		if (!arg3) {
			Static184.method3098();
		}
		Static114.method1911();
		@Pc(36) int local36;
		@Pc(68) int local68;
		if (Static70.anInt1624 == 1) {
			local36 = Static20.anInt552;
			if (local36 < Static71.anInt1640 / 256) {
				local36 = Static71.anInt1640 / 256;
			}
			if (Static14.aBooleanArray7[4] && local36 < Static13.anIntArray14[4] + 128) {
				local36 = Static13.anIntArray14[4] + 128;
			}
			local68 = Static36.anInt870 + Static16.anInt379 & 0x7FF;
			Static129.method2243(Static151.anInt3335, Static26.method2454(Static197.anInt2422, Static73.aClass5_Sub1_Sub1_1.anInt3598, Static73.aClass5_Sub1_Sub1_1.anInt3624) - 50, local68, local36, Static161.anInt3485, local36 * 3 + 600, arg2);
		}
		local68 = Static191.anInt4119;
		@Pc(93) int local93 = Static118.anInt2544;
		local36 = Static122.anInt2706;
		@Pc(97) int local97 = Static228.anInt4792;
		@Pc(99) int local99 = Static207.anInt4426;
		@Pc(143) int local143;
		for (@Pc(101) int local101 = 0; local101 < 5; local101++) {
			if (Static14.aBooleanArray7[local101]) {
				local143 = (int) ((double) -Static20.anIntArray39[local101] + (double) (Static20.anIntArray39[local101] * 2 + 1) * Math.random() + Math.sin((double) Static112.anIntArray142[local101] * ((double) Static14.anIntArray17[local101] / 100.0D)) * (double) Static13.anIntArray14[local101]);
				if (local101 == 1) {
					Static191.anInt4119 += local143;
				}
				if (local101 == 4) {
					Static228.anInt4792 += local143;
					if (Static228.anInt4792 < 128) {
						Static228.anInt4792 = 128;
					}
					if (Static228.anInt4792 > 383) {
						Static228.anInt4792 = 383;
					}
				}
				if (local101 == 2) {
					Static118.anInt2544 += local143;
				}
				if (local101 == 3) {
					Static207.anInt4426 = Static207.anInt4426 + local143 & 0x7FF;
				}
				if (local101 == 0) {
					Static122.anInt2706 += local143;
				}
			}
		}
		local143 = 3;
		if (!Static51.aBoolean60 && !Static113.aBoolean99) {
			local143 = Static197.anInt2422;
		}
		@Pc(224) int local224;
		@Pc(233) int local233;
		@Pc(237) int local237;
		if (Static112.method1883() && Static51.aBoolean60 && !Static113.aBoolean99) {
			@Pc(220) byte local220 = (byte) (Static10.anInt217 - 4 & 0xFF);
			local224 = Static10.anInt217 % 104;
			if (Static202.aByteArrayArrayArray13 == null) {
				Static202.aByteArrayArrayArray13 = new byte[4][104][104];
			}
			for (local233 = 0; local233 < 4; local233++) {
				for (local237 = 0; local237 < 104; local237++) {
					Static202.aByteArrayArrayArray13[local233][local224][local237] = local220;
				}
			}
		}
		@Pc(261) boolean local261 = false;
		@Pc(354) int local354;
		@Pc(359) int local359;
		@Pc(371) int local371;
		if (Static112.method1883() && Static51.aBoolean60 && !Static113.aBoolean99 && Static197.anInt2422 != 3) {
			for (local224 = 0; local224 < 2; local224++) {
				Static229.anIntArray377[local224] = -1000000;
				Static168.anIntArray245[local224] = 1000000;
				Static139.anIntArray207[local224] = 0;
				Static186.anIntArray304[local224] = 1000000;
				Static77.anIntArray107[local224] = 0;
			}
			if (Static70.anInt1624 == 1) {
				if ((Static150.aByteArrayArrayArray9[Static197.anInt2422][Static73.aClass5_Sub1_Sub1_1.anInt3624 >> 7][Static73.aClass5_Sub1_Sub1_1.anInt3598 >> 7] & 0x4) != 0) {
					Static226.method3702(Static73.aClass5_Sub1_Sub1_1.anInt3598 >> 7, Static22.aClass1_Sub7ArrayArrayArray1, Static73.aClass5_Sub1_Sub1_1.anInt3624 >> 7, 0);
					local261 = true;
				}
				if (Static228.anInt4792 < 310) {
					local233 = Static122.anInt2706 >> 7;
					local237 = Static118.anInt2544 >> 7;
					local354 = Static73.aClass5_Sub1_Sub1_1.anInt3624 >> 7;
					local359 = Static73.aClass5_Sub1_Sub1_1.anInt3598 >> 7;
					if (local354 <= local233) {
						local371 = local233 - local354;
					} else {
						local371 = local354 - local233;
					}
					@Pc(385) int local385;
					if (local237 < local359) {
						local385 = local359 - local237;
					} else {
						local385 = local237 - local359;
					}
					@Pc(401) int local401;
					@Pc(403) int local403;
					if (local385 >= local371) {
						local401 = local371 * 65536 / local385;
						local403 = 32768;
						while (local237 != local359) {
							if (local359 > local237) {
								local237++;
							} else if (local237 > local359) {
								local237--;
							}
							if ((Static150.aByteArrayArrayArray9[Static197.anInt2422][local233][local237] & 0x4) != 0) {
								local261 = true;
								Static226.method3702(local237, Static22.aClass1_Sub7ArrayArrayArray1, local233, 1);
								break;
							}
							local403 += local401;
							if (local403 >= 65536) {
								local403 -= 65536;
								if (local354 > local233) {
									local233++;
								} else if (local233 > local354) {
									local233--;
								}
								if ((Static150.aByteArrayArrayArray9[Static197.anInt2422][local233][local237] & 0x4) != 0) {
									Static226.method3702(local237, Static22.aClass1_Sub7ArrayArrayArray1, local233, 1);
									local261 = true;
									break;
								}
							}
						}
					} else {
						local401 = local385 * 65536 / local371;
						local403 = 32768;
						while (local233 != local354) {
							if (local233 < local354) {
								local233++;
							} else if (local233 > local354) {
								local233--;
							}
							if ((Static150.aByteArrayArrayArray9[Static197.anInt2422][local233][local237] & 0x4) != 0) {
								Static226.method3702(local237, Static22.aClass1_Sub7ArrayArrayArray1, local233, 1);
								local261 = true;
								break;
							}
							local403 += local401;
							if (local403 >= 65536) {
								if (local237 < local359) {
									local237++;
								} else if (local237 > local359) {
									local237--;
								}
								local403 -= 65536;
								if ((Static150.aByteArrayArrayArray9[Static197.anInt2422][local233][local237] & 0x4) != 0) {
									Static226.method3702(local237, Static22.aClass1_Sub7ArrayArrayArray1, local233, 1);
									local261 = true;
									break;
								}
							}
						}
					}
				}
			} else {
				local233 = Static26.method2454(Static197.anInt2422, Static118.anInt2544, Static122.anInt2706);
				if (local233 - Static191.anInt4119 < 800 && (Static150.aByteArrayArrayArray9[Static197.anInt2422][Static122.anInt2706 >> 7][Static118.anInt2544 >> 7] & 0x4) != 0) {
					local261 = true;
					Static226.method3702(Static118.anInt2544 >> 7, Static22.aClass1_Sub7ArrayArrayArray1, Static122.anInt2706 >> 7, 1);
				}
			}
		}
		Static96.method1612(arg1, arg0, arg4 + arg1, arg2 + arg0);
		Static171.method2965();
		local224 = Static205.anInt4361;
		local233 = Static15.anInt373;
		if (arg1 <= local224 && arg1 + arg4 > local224 && local233 >= arg0 && arg2 + arg0 > local233) {
			Static156.anInt3428 = 0;
			local354 = Static53.anInt1240;
			local237 = Static161.anInt3476;
			Static190.anInt4108 = (local354 - local237) * (Static205.anInt4361 - arg1) / arg4 + local237;
			Static101.aBoolean93 = true;
			local359 = Static192.anInt4156;
			local371 = Static220.anInt4645;
			Static207.anInt4439 = local359 + (Static15.anInt373 - arg0) * (local371 - local359) / arg2;
		} else {
			Static101.aBoolean93 = false;
			Static156.anInt3428 = 0;
		}
		Static208.method3447();
		Static96.method1623(arg1, arg0, arg4, arg2, 0);
		if (local261) {
			Static228.method3748(Static122.anInt2706, Static191.anInt4119, Static118.anInt2544, Static228.anInt4792, Static207.anInt4426, local143, Static202.aByteArrayArrayArray13, Static229.anIntArray377, Static168.anIntArray245, Static139.anIntArray207, Static77.anIntArray107, Static186.anIntArray304, Static197.anInt2422 + 1, (byte) Static10.anInt217, Static73.aClass5_Sub1_Sub1_1.anInt3624 >> 7, Static73.aClass5_Sub1_Sub1_1.anInt3598 >> 7);
		} else {
			Static228.method3748(Static122.anInt2706, Static191.anInt4119, Static118.anInt2544, Static228.anInt4792, Static207.anInt4426, local143, null, null, null, null, null, null, 0, (byte) 0, Static73.aClass5_Sub1_Sub1_1.anInt3624 >> 7, Static73.aClass5_Sub1_Sub1_1.anInt3598 >> 7);
		}
		Static208.method3447();
		Static197.method1849();
		Static208.method3450(arg0, arg4, arg2, arg1);
		Static207.method3439(arg0, arg1, arg4, arg2);
		((Class9) Static171.anInterface3_2).method136(Static48.anInt1156);
		Static224.method3673(arg0, arg4, arg2, arg1);
		Static118.anInt2544 = local93;
		Static207.anInt4426 = local99;
		Static191.anInt4119 = local68;
		Static228.anInt4792 = local97;
		Static122.anInt2706 = local36;
		if (Static19.aBoolean196 && Static9.method130() == 0) {
			Static19.aBoolean196 = false;
		}
		if (Static19.aBoolean196) {
			Static96.method1623(arg1, arg0, arg4, arg2, 0);
			Static211.method3502(Static30.aClass51_737, false);
		}
		if (!arg3 && !Static19.aBoolean196 && !Static156.aBoolean164 && arg1 <= local224 && local224 < arg1 + arg4 && arg0 <= local233 && local233 < arg2 + arg0) {
			Static199.method3293(arg1, arg4, arg0, local224, local233, arg2);
		}
	}
}
