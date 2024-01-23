import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
	public static int anInt4892;

	@OriginalMember(owner = "client!rk", name = "b", descriptor = "Z")
	public static boolean aBoolean341 = true;

	@OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
	public static int anInt4885 = 0;

	@OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
	public static int anInt4889 = 0;

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLclient!ug;)V")
	public static void method4074(@OriginalArg(1) Class3_Sub26 arg0) {
		@Pc(7) int local7 = Static228.anInt1433 >> 2 << 10;
		@Pc(11) byte[][] local11 = new byte[Static228.anInt1434][Static228.anInt1432];
		@Pc(15) int local15 = Static228.anInt1436 >> 1;
		@Pc(25) int local25;
		@Pc(94) int local94;
		@Pc(107) int local107;
		while (arg0.anInt4615 < arg0.aByteArray64.length) {
			@Pc(23) boolean local23 = false;
			local25 = 0;
			@Pc(27) int local27 = 0;
			if (arg0.method3915() == 1) {
				local23 = true;
				local25 = arg0.method3915();
				local27 = arg0.method3915();
			}
			@Pc(49) int local49 = arg0.method3915();
			@Pc(53) int local53 = arg0.method3915();
			@Pc(59) int local59 = local49 * 64 - Static228.anInt1431;
			@Pc(70) int local70 = Static228.anInt1435 + Static228.anInt1432 - local53 * 64 - 1;
			if (local59 >= 0 && local70 - 63 >= 0 && Static228.anInt1434 > local59 + 63 && Static228.anInt1432 > local70) {
				for (local94 = 0; local94 < 64; local94++) {
					@Pc(105) byte[] local105 = local11[local94 + local59];
					for (local107 = 0; local107 < 64; local107++) {
						if (!local23 || local25 * 8 <= local94 && local94 < local25 * 8 + 8 && local27 * 8 <= local107 && local107 < local27 * 8 + 8) {
							local105[local70 - local107] = arg0.method3920();
						}
					}
				}
			} else if (local23) {
				arg0.anInt4615 += 64;
			} else {
				arg0.anInt4615 += 4096;
			}
		}
		@Pc(185) int local185 = Static228.anInt1434;
		local25 = Static228.anInt1432;
		@Pc(190) int[] local190 = new int[local25];
		@Pc(193) int[] local193 = new int[local25];
		@Pc(196) int[] local196 = new int[local25];
		@Pc(199) int[] local199 = new int[local25];
		@Pc(202) int[] local202 = new int[local25];
		for (local94 = -5; local94 < local185; local94++) {
			if ((local94 & 0x1FF) == 0) {
				Static227.method2500(true);
			}
			@Pc(252) int local252;
			@Pc(318) int local318;
			for (@Pc(229) int local229 = 0; local229 < local25; local229++) {
				local107 = local94 + 5;
				@Pc(300) int local300;
				if (local185 > local107) {
					local252 = local11[local107][local229] & 0xFF;
					if (local252 > 0) {
						@Pc(264) Class72 local264 = Static257.method4338(local252 - 1);
						local199[local229] += local264.anInt2003;
						local193[local229] += local264.anInt2002;
						local190[local229] += local264.anInt2009;
						local202[local229] += local264.anInt2001;
						local300 = local196[local229]++;
					}
				}
				local252 = local94 - 5;
				if (local252 >= 0) {
					local318 = local11[local252][local229] & 0xFF;
					if (local318 > 0) {
						@Pc(329) Class72 local329 = Static257.method4338(local318 - 1);
						local199[local229] -= local329.anInt2003;
						local193[local229] -= local329.anInt2002;
						local190[local229] -= local329.anInt2009;
						local202[local229] -= local329.anInt2001;
						local300 = local196[local229]--;
					}
				}
			}
			if (local94 >= 0) {
				@Pc(382) int[][] local382 = Static228.anIntArrayArrayArray4[local94 >> 6];
				local107 = 0;
				local252 = 0;
				local318 = 0;
				@Pc(390) int local390 = 0;
				@Pc(392) int local392 = 0;
				for (@Pc(394) int local394 = -5; local394 < local25; local394++) {
					@Pc(401) int local401 = local394 - 5;
					@Pc(405) int local405 = local394 + 5;
					if (local405 < local25) {
						local392 += local196[local405];
						local390 += local202[local405];
						local252 += local193[local405];
						local318 += local190[local405];
						local107 += local199[local405];
					}
					if (local401 >= 0) {
						local318 -= local190[local401];
						local390 -= local202[local401];
						local252 -= local193[local401];
						local392 -= local196[local401];
						local107 -= local199[local401];
					}
					if (local394 >= 0 && local392 > 0) {
						@Pc(495) int[] local495 = local382[local394 >> 6];
						@Pc(516) int local516 = local390 == 0 ? 0 : Static198.method3272(local318 / local392, local252 / local392, local107 * 256 / local390);
						if (local11[local94][local394] != 0) {
							if (local495 == null) {
								local495 = local382[local394 >> 6] = new int[4096];
							}
							@Pc(542) int local542 = local15 + (local516 & 0x7F);
							if (local542 < 0) {
								local542 = 0;
							} else if (local542 > 127) {
								local542 = 127;
							}
							@Pc(568) int local568 = local542 + (local516 & 0x380) + (local516 + local7 & 0xFC00);
							local495[((local394 & 0x3F) << 6) + (local94 & 0x3F)] = Static16.anIntArray25[Static130.method2210(96, local568)];
						} else if (local495 != null) {
							local495[((local394 & 0x3F) << 6) + (local94 & 0x3F)] = 0;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(BI)I")
	public static int method4083(@OriginalArg(1) int arg0) {
		@Pc(14) double local14 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local14;
		if (local23 < local14) {
			local32 = local23;
		}
		if (local32 > local30) {
			local32 = local30;
		}
		@Pc(47) double local47 = 0.0D;
		@Pc(49) double local49 = 0.0D;
		@Pc(51) double local51 = local14;
		if (local14 < local23) {
			local51 = local23;
		}
		if (local51 < local30) {
			local51 = local30;
		}
		@Pc(71) double local71 = (local51 + local32) / 2.0D;
		@Pc(76) int local76 = (int) (local71 * 256.0D);
		if (local51 != local32) {
			if (local71 < 0.5D) {
				local49 = (local51 - local32) / (local51 + local32);
			}
			if (local14 == local51) {
				local47 = (local23 - local30) / (local51 - local32);
			} else if (local51 == local23) {
				local47 = (local30 - local14) / (local51 - local32) + 2.0D;
			} else if (local30 == local51) {
				local47 = (local14 - local23) / (local51 - local32) + 4.0D;
			}
			if (local71 >= 0.5D) {
				local49 = (local51 - local32) / (2.0D - local32 - local51);
			}
		}
		if (local76 < 0) {
			local76 = 0;
		} else if (local76 > 255) {
			local76 = 255;
		}
		@Pc(181) int local181 = (int) (local49 * 256.0D);
		local47 /= 6.0D;
		if (local181 < 0) {
			local181 = 0;
		} else if (local181 > 255) {
			local181 = 255;
		}
		@Pc(205) int local205 = (int) (local47 * 256.0D);
		if (local76 > 243) {
			local181 >>= 0x4;
		} else if (local76 > 217) {
			local181 >>= 0x3;
		} else if (local76 > 192) {
			local181 >>= 0x2;
		} else if (local76 > 179) {
			local181 >>= 0x1;
		}
		return (local76 >> 1) + (local205 >> 2 << 10) + (local181 >> 5 << 7);
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZIIIII)V")
	public static void method4088(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static289.anInt5783++;
		if (Static136.aClass10_Sub5_Sub1_1 != null && Static136.aClass10_Sub5_Sub1_1.anInt5073 - (Static136.aClass10_Sub5_Sub1_1.method4186() - 1) * 64 >> 7 == Static81.anInt1533 && Static136.aClass10_Sub5_Sub1_1.anInt5016 + 64 - Static136.aClass10_Sub5_Sub1_1.method4186() * 64 >> 7 == Static247.anInt4992) {
			Static81.anInt1533 = 0;
			Static6.aBoolean11 = false;
		}
		Static176.method2888();
		if (!arg0) {
			Static26.method423();
		}
		Static170.method2812();
		if (Static283.aBoolean393) {
			Static124.method2081(true, arg1, arg2, arg4, arg3);
			arg2 = Static92.anInt1683;
			arg3 = Static246.anInt4989;
			arg1 = Static250.anInt5158;
			arg4 = Static62.anInt1157;
		}
		Static71.anInt1297 = arg2;
		Static71.anInt1295 = arg3;
		@Pc(84) int local84;
		@Pc(105) int local105;
		if (Static25.anInt467 == 1) {
			local84 = (int) Static179.aFloat48;
			if (local84 < Static152.anInt2874 / 256) {
				local84 = Static152.anInt2874 / 256;
			}
			local105 = (int) Static84.aFloat21 + Static221.anInt4331 & 0x7FF;
			if (Static312.aBooleanArray136[4] && local84 < Static111.anIntArray215[4] + 128) {
				local84 = Static111.anIntArray215[4] + 128;
			}
			Static273.method4495(Static308.anInt6040, local84 * 3 + 600, local84, Static2.anInt22, Static122.method2036(Static136.aClass10_Sub5_Sub1_1.anInt5016, Static136.aClass10_Sub5_Sub1_1.anInt5073, Static99.anInt1826) - 50, local105, arg1);
		} else if (Static25.anInt467 == 4) {
			local105 = (int) Static84.aFloat21 & 0x7FF;
			local84 = (int) Static179.aFloat48;
			if (local84 < Static152.anInt2874 / 256) {
				local84 = Static152.anInt2874 / 256;
			}
			if (Static312.aBooleanArray136[4] && Static111.anIntArray215[4] + 128 > local84) {
				local84 = Static111.anIntArray215[4] + 128;
			}
			Static273.method4495(Static308.anInt6040, local84 * 3 + 600, local84, Static2.anInt22, Static122.method2036(Static306.anInt6010, Static224.anInt6078, Static99.anInt1826) - 50, local105, arg1);
		} else if (Static25.anInt467 == 5) {
			Static32.method499(arg1);
		}
		local84 = Static230.anInt4492;
		local105 = Static224.anInt6075;
		@Pc(225) int local225 = Static79.anInt1912;
		@Pc(227) int local227 = Static173.anInt3251;
		@Pc(229) int local229 = Static113.anInt2103;
		@Pc(231) int local231;
		@Pc(273) int local273;
		for (local231 = 0; local231 < 5; local231++) {
			if (Static312.aBooleanArray136[local231]) {
				local273 = (int) ((double) (Static183.anIntArray422[local231] * 2 + 1) * Math.random() - (double) Static183.anIntArray422[local231] + Math.sin((double) Static90.anIntArray161[local231] / 100.0D * (double) Static220.anIntArray544[local231]) * (double) Static111.anIntArray215[local231]);
				if (local231 == 4) {
					Static79.anInt1912 += local273;
					if (Static79.anInt1912 < 128) {
						Static79.anInt1912 = 128;
					}
					if (Static79.anInt1912 > 383) {
						Static79.anInt1912 = 383;
					}
				}
				if (local231 == 1) {
					Static224.anInt6075 += local273;
				}
				if (local231 == 0) {
					Static230.anInt4492 += local273;
				}
				if (local231 == 3) {
					Static113.anInt2103 = Static113.anInt2103 + local273 & 0x7FF;
				}
				if (local231 == 2) {
					Static173.anInt3251 += local273;
				}
			}
		}
		Static83.method1268();
		@Pc(437) int local437;
		if (Static283.aBoolean393) {
			Static234.method3975(arg2, arg3, arg2 + arg4, arg1 + arg3);
			@Pc(400) float local400 = (float) Static113.anInt2103 * 0.17578125F;
			@Pc(405) float local405 = (float) Static79.anInt1912 * 0.17578125F;
			if (Static25.anInt467 == 3) {
				local400 = Static103.aFloat32 * 360.0F / 6.2831855F;
				local405 = Static170.aFloat46 * 360.0F / 6.2831855F;
			}
			if (Static10.anInt190 == 10) {
				local437 = Static153.method2579(Static251.anInt5174, Static140.anInt2709, Static230.anInt4492 >> 10, Static173.anInt3251 >> 10);
			} else {
				local437 = Static153.method2579(Static251.anInt5174, Static140.anInt2709, Static136.aClass10_Sub5_Sub1_1.anIntArray537[0] >> 3, Static136.aClass10_Sub5_Sub1_1.anIntArray535[0] >> 3);
			}
			if (Static238.anInt4825 < 0) {
				Static283.method4643(local437);
			} else {
				Static283.method4646();
				@Pc(475) Class167 local475 = Static176.method2889(Static238.anInt4825, Static248.anInt5000, Static25.anInt465, Static310.anInt6101);
				local475.method4354(Static90.anInt1670, arg2, arg3, arg4, arg1, Static79.anInt1912, Static113.anInt2103, local437);
			}
			Static283.method4642(arg2, arg3, arg4, arg1, arg4 / 2 + arg2, arg1 / 2 + arg3, local405, local400, Static75.anInt1415, Static75.anInt1415);
			Static156.method2598(false);
			Static283.method4662();
			Static283.method4657(true);
			Static283.method4665(true);
		} else {
			Static143.method2449(arg2, arg3, arg4 + arg2, arg1 + arg3);
			Static16.method272();
			if (Static238.anInt4825 >= 0) {
				@Pc(366) Class167 local366 = Static176.method2889(Static238.anInt4825, Static248.anInt5000, Static25.anInt465, Static310.anInt6101);
				local366.method4353(Static90.anInt1670, arg2, arg3, arg4, arg1, Static79.anInt1912, Static113.anInt2103);
			} else {
				Static143.method2462(arg2, arg3, arg4, arg1, 0);
			}
		}
		if (Static118.aBoolean169 || arg2 > Static216.anInt4245 || Static216.anInt4245 >= arg2 + arg4 || arg3 > Static79.anInt1910 || Static79.anInt1910 >= arg1 + arg3) {
			Static217.aBoolean302 = false;
			Static141.aBoolean201 = true;
			Static120.anInt2259 = 0;
		} else {
			local231 = Static152.anInt2870;
			local273 = Static136.anInt2620;
			Static177.anInt3290 = (local273 - local231) * (Static216.anInt4245 - arg2) / arg4 + local231;
			Static217.aBoolean302 = true;
			Static120.anInt2259 = 0;
			local437 = Static183.anInt3645;
			Static141.aBoolean201 = true;
			@Pc(562) int local562 = Static181.anInt3567;
			Static186.anInt3681 = (local562 - local437) * (-arg3 + Static79.anInt1910) / arg1 + local437;
		}
		Static174.method2872();
		@Pc(597) byte local597 = Static284.method4678() == 2 ? (byte) Static289.anInt5783 : 1;
		if (Static283.aBoolean393) {
			Static142.method2411(Static124.anInt2371, !Static315.aBoolean435);
			Static82.method1266(Static79.anInt1912, Static224.anInt6075, Static230.anInt4492, Static113.anInt2103, Static173.anInt3251);
			Static283.anInt5687 = Static124.anInt2371;
			Static131.method2211(Static230.anInt4492, Static224.anInt6075, Static173.anInt3251, Static79.anInt1912, Static113.anInt2103, Static126.aByteArrayArrayArray15, Static174.anIntArray398, Static100.anIntArray184, Static286.anIntArray569, Static64.anIntArray110, Static11.anIntArray541, Static99.anInt1826 + 1, local597, Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7, Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7);
			Static28.aBoolean42 = true;
			Static142.method2402();
			Static82.method1266(0, 0, 0, 0, 0);
			Static174.method2872();
			Static223.method3638(Static75.anInt1415, arg3, Static75.anInt1415, arg2, arg4, arg1);
			Static195.method3234(Static75.anInt1415, arg1, arg3, arg4, Static75.anInt1415, arg2);
			Static277.method4534();
		} else {
			Static131.method2211(Static230.anInt4492, Static224.anInt6075, Static173.anInt3251, Static79.anInt1912, Static113.anInt2103, Static126.aByteArrayArrayArray15, Static174.anIntArray398, Static100.anIntArray184, Static286.anIntArray569, Static64.anIntArray110, Static11.anIntArray541, Static99.anInt1826 + 1, local597, Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7, Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7);
			Static174.method2872();
			Static277.method4534();
			Static223.method3638(256, arg3, 256, arg2, arg4, arg1);
			Static195.method3234(256, arg1, arg3, arg4, 256, arg2);
		}
		((Class91_Sub1) Static16.anInterface4_1).method2917(Static140.anInt2709);
		Static59.method966(arg3, arg1, arg2, arg4);
		Static224.anInt6075 = local105;
		Static113.anInt2103 = local229;
		Static173.anInt3251 = local227;
		Static230.anInt4492 = local84;
		Static79.anInt1912 = local225;
		if (Static47.aBoolean424 && Static161.aClass177_1.method4540() == 0) {
			Static47.aBoolean424 = false;
		}
		if (Static47.aBoolean424) {
			if (Static283.aBoolean393) {
				Static234.method3973(arg2, arg3, arg4, arg1, 0);
			} else {
				Static143.method2462(arg2, arg3, arg4, arg1, 0);
			}
			Static212.method3485(Static167.aString113, false);
		}
		if (!arg0 && !Static47.aBoolean424 && !Static118.aBoolean169 && arg2 <= Static216.anInt4245 && Static216.anInt4245 < arg2 + arg4 && arg3 <= Static79.anInt1910 && Static79.anInt1910 < arg3 + arg1) {
			Static96.method1437(arg3, Static79.anInt1910, arg2, arg4, arg1, Static216.anInt4245);
		}
	}

	@OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)V")
	public static void method4090(@OriginalArg(1) int arg0) {
		if (!Static245.method4932(arg0)) {
			return;
		}
		@Pc(14) Class151[] local14 = Static96.aClass151ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(24) Class151 local24 = local14[local16];
			if (local24 != null) {
				local24.anInt4765 = 0;
				local24.anInt4736 = 0;
				local24.anInt4768 = 1;
			}
		}
	}
}
