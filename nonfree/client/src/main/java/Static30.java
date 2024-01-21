import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!g", name = "g", descriptor = "Lclient!le;")
	public static Class14 aClass14_1;

	@OriginalMember(owner = "client!g", name = "i", descriptor = "I")
	public static int anInt830;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "Lclient!mc;")
	public static Class42 aClass42_446 = Static23.method501("Wen m-Ochten Sie von der Liste entfernen?");

	@OriginalMember(owner = "client!g", name = "e", descriptor = "I")
	public static int anInt828 = 0;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!mc;")
	private static Class42 aClass42_447 = Static23.method501("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!g", name = "l", descriptor = "I")
	public static int anInt833 = 0;

	@OriginalMember(owner = "client!g", name = "m", descriptor = "[Lclient!na;")
	public static Class44[] aClass44Array1 = new Class44[12];

	@OriginalMember(owner = "client!g", name = "n", descriptor = "I")
	public static int anInt834 = 0;

	@OriginalMember(owner = "client!g", name = "o", descriptor = "Lclient!mc;")
	public static Class42 aClass42_448 = aClass42_447;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) Class1_Sub3 local15 = (Class1_Sub3) Static33.aClass22_7.method515();
		@Pc(17) Class1_Sub3 local17 = null;
		while (local15 != null) {
			if (arg5 == local15.anInt589 && local15.anInt596 == arg0 && local15.anInt583 == arg3 && local15.anInt594 == arg2) {
				local17 = local15;
				break;
			}
			local15 = (Class1_Sub3) Static33.aClass22_7.method519();
		}
		if (local17 == null) {
			local17 = new Class1_Sub3();
			local17.anInt594 = arg2;
			local17.anInt589 = arg5;
			local17.anInt583 = arg3;
			local17.anInt596 = arg0;
			Static42.method1754(local17);
			Static33.aClass22_7.method512(local17);
		}
		local17.anInt591 = arg4;
		local17.anInt582 = arg6;
		local17.anInt585 = arg1;
		local17.anInt586 = arg8;
		local17.anInt595 = arg7;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIII)V")
	public static void method570(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(11) int local11 = Static88.aClass20_1.method474(arg1, arg2, arg3);
		@Pc(28) int local28;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(40) int local40;
		@Pc(56) int local56;
		@Pc(65) int local65;
		if (local11 != 0) {
			local28 = Static88.aClass20_1.method460(arg1, arg2, arg3, local11);
			local34 = local28 >> 6 & 0x3;
			local38 = local28 & 0x1F;
			local40 = arg4;
			if (local11 > 0) {
				local40 = arg0;
			}
			local56 = (103 - arg3) * 2048 + arg2 * 4 + 24624;
			@Pc(59) int[] local59 = Static89.aClass1_Sub1_Sub1_Sub1_12.anIntArray12;
			local65 = local11 >> 14 & 0x7FFF;
			@Pc(71) Class1_Sub1_Sub9 local71 = Static42.method1755(local65);
			if (local71.anInt1282 == -1) {
				if (local38 == 0 || local38 == 2) {
					if (local34 == 0) {
						local59[local56] = local40;
						local59[local56 + 512] = local40;
						local59[local56 + 1024] = local40;
						local59[local56 + 1536] = local40;
					} else if (local34 == 1) {
						local59[local56] = local40;
						local59[local56 + 1] = local40;
						local59[local56 + 2] = local40;
						local59[local56 + 3] = local40;
					} else if (local34 == 2) {
						local59[local56 + 3] = local40;
						local59[local56 + 512 + 3] = local40;
						local59[local56 + 1027] = local40;
						local59[local56 + 3 + 1536] = local40;
					} else if (local34 == 3) {
						local59[local56 + 1536] = local40;
						local59[local56 + 1537] = local40;
						local59[local56 + 1538] = local40;
						local59[local56 + 1536 + 3] = local40;
					}
				}
				if (local38 == 3) {
					if (local34 == 0) {
						local59[local56] = local40;
					} else if (local34 == 1) {
						local59[local56 + 3] = local40;
					} else if (local34 == 2) {
						local59[local56 + 1536 + 3] = local40;
					} else if (local34 == 3) {
						local59[local56 + 1536] = local40;
					}
				}
				if (local38 == 2) {
					if (local34 == 3) {
						local59[local56] = local40;
						local59[local56 + 512] = local40;
						local59[local56 + 1024] = local40;
						local59[local56 + 1536] = local40;
					} else if (local34 == 0) {
						local59[local56] = local40;
						local59[local56 + 1] = local40;
						local59[local56 + 2] = local40;
						local59[local56 + 3] = local40;
					} else if (local34 == 1) {
						local59[local56 + 3] = local40;
						local59[local56 + 3 + 512] = local40;
						local59[local56 + 1024 + 3] = local40;
						local59[local56 + 1539] = local40;
					} else if (local34 == 2) {
						local59[local56 + 1536] = local40;
						local59[local56 + 1 + 1536] = local40;
						local59[local56 + 1538] = local40;
						local59[local56 + 1536 + 3] = local40;
					}
				}
			} else {
				@Pc(80) Class1_Sub1_Sub1_Sub4 local80 = Static81.aClass1_Sub1_Sub1_Sub4Array5[local71.anInt1282];
				if (local80 != null) {
					@Pc(93) int local93 = (local71.anInt1279 * 4 - local80.anInt1627) / 2;
					@Pc(104) int local104 = (local71.anInt1276 * 4 - local80.anInt1628) / 2;
					local80.method1147(arg2 * 4 + local93 + 48, local104 + (-local71.anInt1276 + -arg3 + 104) * 4 + 48);
				}
			}
		}
		local11 = Static88.aClass20_1.method467(arg1, arg2, arg3);
		if (local11 != 0) {
			local28 = Static88.aClass20_1.method460(arg1, arg2, arg3, local11);
			local38 = local28 & 0x1F;
			local40 = local11 >> 14 & 0x7FFF;
			@Pc(459) Class1_Sub1_Sub9 local459 = Static42.method1755(local40);
			local34 = local28 >> 6 & 0x3;
			@Pc(492) int local492;
			if (local459.anInt1282 != -1) {
				@Pc(568) Class1_Sub1_Sub1_Sub4 local568 = Static81.aClass1_Sub1_Sub1_Sub4Array5[local459.anInt1282];
				if (local568 != null) {
					local492 = (local459.anInt1276 * 4 - local568.anInt1628) / 2;
					local65 = (local459.anInt1279 * 4 - local568.anInt1627) / 2;
					local568.method1147(arg2 * 4 + local65 + 48, (-arg3 + 104 - local459.anInt1276) * 4 + (48 - -local492));
				}
			} else if (local38 == 9) {
				local56 = 15658734;
				if (local11 > 0) {
					local56 = 15597568;
				}
				local492 = arg2 * 4 + (-arg3 + 103) * 2048 + 24624;
				@Pc(495) int[] local495 = Static89.aClass1_Sub1_Sub1_Sub1_12.anIntArray12;
				if (local34 == 0 || local34 == 2) {
					local495[local492 + 1536] = local56;
					local495[local492 + 1025] = local56;
					local495[local492 + 2 + 512] = local56;
					local495[local492 + 3] = local56;
				} else {
					local495[local492] = local56;
					local495[local492 + 1 + 512] = local56;
					local495[local492 + 2 + 1024] = local56;
					local495[local492 + 1536 + 3] = local56;
				}
			}
		}
		local11 = Static88.aClass20_1.method481(arg1, arg2, arg3);
		if (local11 == 0) {
			return;
		}
		local28 = local11 >> 14 & 0x7FFF;
		@Pc(633) Class1_Sub1_Sub9 local633 = Static42.method1755(local28);
		if (local633.anInt1282 == -1) {
			return;
		}
		@Pc(642) Class1_Sub1_Sub1_Sub4 local642 = Static81.aClass1_Sub1_Sub1_Sub4Array5[local633.anInt1282];
		if (local642 != null) {
			local40 = (local633.anInt1279 * 4 - local642.anInt1627) / 2;
			@Pc(665) int local665 = (local633.anInt1276 * 4 - local642.anInt1628) / 2;
			local642.method1147(local40 + arg2 * 4 + 48, local665 + (-arg3 + 104 - local633.anInt1276) * 4 + 48);
			return;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method571() {
		aClass42_448 = null;
		aClass14_1 = null;
		aClass44Array1 = null;
		aClass42_446 = null;
		aClass42_447 = null;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IIIIIII)I")
	public static int method572(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(10) int local10 = arg3;
			arg3 = arg4;
			arg4 = local10;
		}
		@Pc(23) int local23 = arg2 & 0x3;
		if (local23 == 0) {
			return arg5;
		} else if (local23 == 1) {
			return arg0;
		} else if (local23 == 2) {
			return 1 + 7 - arg3 - arg5;
		} else {
			return 1 + 7 - arg4 - arg0;
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(B)Z")
	public static boolean method573() {
		if (Static58.aClass47_17 == null) {
			return false;
		}
		@Pc(224) int local224;
		try {
			@Pc(13) int local13 = Static58.aClass47_17.method1335();
			if (local13 == 0) {
				return false;
			}
			if (Static88.anInt2328 == -1) {
				local13--;
				Static58.aClass47_17.method1342(0, Static80.aClass1_Sub8_Sub1_2.aByteArray24, 1);
				Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
				Static88.anInt2328 = Static80.aClass1_Sub8_Sub1_2.method1243();
				Static20.anInt644 = Static56.anIntArray214[Static88.anInt2328];
			}
			if (Static20.anInt644 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static58.aClass47_17.method1342(0, Static80.aClass1_Sub8_Sub1_2.aByteArray24, 1);
				Static20.anInt644 = Static80.aClass1_Sub8_Sub1_2.aByteArray24[0] & 0xFF;
			}
			if (Static20.anInt644 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static58.aClass47_17.method1342(0, Static80.aClass1_Sub8_Sub1_2.aByteArray24, 2);
				Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
				Static20.anInt644 = Static80.aClass1_Sub8_Sub1_2.method1199();
			}
			if (Static20.anInt644 > local13) {
				return false;
			}
			Static80.aClass1_Sub8_Sub1_2.anInt1692 = 0;
			Static58.aClass47_17.method1342(0, Static80.aClass1_Sub8_Sub1_2.aByteArray24, Static20.anInt644);
			Static6.anInt140 = 0;
			Static97.anInt2472 = Static51.anInt1383;
			Static51.anInt1383 = Static35.anInt871;
			Static35.anInt871 = Static88.anInt2328;
			@Pc(121) int local121;
			if (Static88.anInt2328 == 129) {
				for (local121 = 0; local121 < Static51.anIntArray200.length; local121++) {
					if (Static43.anIntArray166[local121] != Static51.anIntArray200[local121]) {
						Static51.anIntArray200[local121] = Static43.anIntArray166[local121];
						Static107.method1829(local121);
						Static89.aBoolean132 = true;
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 87) {
				Static99.anInt2518 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static89.aBoolean132 = true;
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 123) {
				if (Static108.anInt2748 == 12) {
					Static89.aBoolean132 = true;
				}
				Static51.anInt1378 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static88.anInt2328 = -1;
				return true;
			}
			@Pc(192) long local192;
			@Pc(198) Class42 local198;
			if (Static88.anInt2328 == 26) {
				local192 = Static80.aClass1_Sub8_Sub1_2.method1224();
				local198 = Static31.method1558(Static80.aClass1_Sub8_Sub1_2).method1031();
				Static24.method509(Static64.method1096(local192).method1058(), 6, local198);
				Static88.anInt2328 = -1;
				return true;
			}
			@Pc(228) Class1_Sub1_Sub12 local228;
			if (Static88.anInt2328 == 3) {
				local121 = Static80.aClass1_Sub8_Sub1_2.method1182();
				local224 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local228 = Static33.method578(local121);
				local228.anInt2163 = 2;
				local228.anInt2169 = local224;
				Static88.anInt2328 = -1;
				return true;
			}
			@Pc(251) int local251;
			@Pc(249) Class1_Sub1_Sub12 local249;
			if (Static88.anInt2328 == 248) {
				local121 = Static80.aClass1_Sub8_Sub1_2.method1210();
				local249 = Static33.method578(local121);
				for (local251 = 0; local251 < local249.anIntArray332.length; local251++) {
					local249.anIntArray332[local251] = -1;
					local249.anIntArray332[local251] = 0;
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 82) {
				Static25.anInt732 = Static80.aClass1_Sub8_Sub1_2.method1216() * 30;
				Static88.anInt2328 = -1;
				return true;
			}
			@Pc(311) Class1_Sub1_Sub12 local311;
			if (Static88.anInt2328 == 16) {
				local121 = Static80.aClass1_Sub8_Sub1_2.method1182();
				local224 = Static80.aClass1_Sub8_Sub1_2.method1226();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1205();
				local311 = Static33.method578(local121);
				local311.anInt2172 = local311.anInt2171 + local224;
				Static88.anInt2328 = -1;
				local311.anInt2161 = local311.anInt2158 + local251;
				return true;
			}
			if (Static88.anInt2328 == 120) {
				local121 = Static80.aClass1_Sub8_Sub1_2.method1210();
				Static84.aClass59_4 = Static64.aClass60_3.method1805(local121);
				Static88.anInt2328 = -1;
				return true;
			}
			@Pc(375) int local375;
			@Pc(371) int local371;
			if (Static88.anInt2328 == 214) {
				Static89.aBoolean132 = true;
				local121 = Static80.aClass1_Sub8_Sub1_2.method1188();
				local249 = Static33.method578(local121);
				while (Static80.aClass1_Sub8_Sub1_2.anInt1692 < Static20.anInt644) {
					local251 = Static80.aClass1_Sub8_Sub1_2.method1190();
					local371 = Static80.aClass1_Sub8_Sub1_2.method1199();
					local375 = Static80.aClass1_Sub8_Sub1_2.method1186();
					if (local375 == 255) {
						local375 = Static80.aClass1_Sub8_Sub1_2.method1188();
					}
					if (local251 >= 0 && local251 < local249.anIntArray332.length) {
						local249.anIntArray332[local251] = local371;
						local249.anIntArray330[local251] = local375;
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 81) {
				Static54.anInt1407 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static6.anInt161 = Static80.aClass1_Sub8_Sub1_2.method1220();
				while (Static80.aClass1_Sub8_Sub1_2.anInt1692 < Static20.anInt644) {
					Static88.anInt2328 = Static80.aClass1_Sub8_Sub1_2.method1186();
					Static71.method1284();
				}
				Static88.anInt2328 = -1;
				return true;
			}
			@Pc(474) int local474;
			if (Static88.anInt2328 == 127) {
				local192 = Static80.aClass1_Sub8_Sub1_2.method1224();
				@Pc(459) long local459 = (long) Static80.aClass1_Sub8_Sub1_2.method1199();
				@Pc(464) long local464 = (long) Static80.aClass1_Sub8_Sub1_2.method1202();
				@Pc(470) long local470 = local464 + (local459 << 32);
				local474 = Static80.aClass1_Sub8_Sub1_2.method1186();
				@Pc(476) boolean local476 = false;
				for (@Pc(478) int local478 = 0; local478 < 100; local478++) {
					if (Static104.aLongArray7[local478] == local470) {
						local476 = true;
						break;
					}
				}
				if (local474 <= 1) {
					for (@Pc(505) int local505 = 0; local505 < Static1.anInt1; local505++) {
						if (local192 == Static37.aLongArray2[local505]) {
							local476 = true;
							break;
						}
					}
				}
				if (!local476 && Static19.anInt638 == 0) {
					Static104.aLongArray7[Static56.anInt1422] = local470;
					Static56.anInt1422 = (Static56.anInt1422 + 1) % 100;
					@Pc(548) Class42 local548 = Static31.method1558(Static80.aClass1_Sub8_Sub1_2).method1031();
					if (local474 == 2 || local474 == 3) {
						Static24.method509(Static57.method1822(new Class42[] { Static17.aClass42_318, Static64.method1096(local192).method1058() }), 7, local548);
					} else if (local474 == 1) {
						Static24.method509(Static57.method1822(new Class42[] { Static49.aClass42_696, Static64.method1096(local192).method1058() }), 7, local548);
					} else {
						Static24.method509(Static64.method1096(local192).method1058(), 3, local548);
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			@Pc(629) Class42 local629;
			if (Static88.anInt2328 == 240) {
				local121 = Static80.aClass1_Sub8_Sub1_2.method1210();
				local629 = Static80.aClass1_Sub8_Sub1_2.method1201();
				local228 = Static33.method578(local121);
				local228.aClass42_1166 = local629;
				if (Static10.anIntArray33[Static108.anInt2748] == local121 >> 16) {
					Static89.aBoolean132 = true;
				}
				Static88.anInt2328 = -1;
				return true;
			}
			@Pc(708) int local708;
			if (Static88.anInt2328 == 86) {
				Static107.aBoolean147 = true;
				Static43.anInt1127 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static17.anInt598 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static109.anInt2755 = Static80.aClass1_Sub8_Sub1_2.method1199();
				Static11.anInt346 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static59.anInt2001 = Static80.aClass1_Sub8_Sub1_2.method1186();
				if (Static59.anInt2001 >= 100) {
					local121 = Static43.anInt1127 * 128 + 64;
					local224 = Static17.anInt598 * 128 + 64;
					local251 = Static104.method1821(local224, Static82.anInt2165, local121) - Static109.anInt2755;
					local371 = local121 - Static68.anInt1671;
					local708 = local224 - Static37.anInt917;
					local375 = local251 - Static8.anInt243;
					local474 = (int) Math.sqrt((double) (local371 * local371 + local708 * local708));
					anInt830 = (int) (Math.atan2((double) local375, (double) local474) * 325.949D) & 0x7FF;
					Static92.anInt2431 = (int) (Math.atan2((double) local371, (double) local708) * -325.949D) & 0x7FF;
					if (anInt830 < 128) {
						anInt830 = 128;
					}
					if (anInt830 > 383) {
						anInt830 = 383;
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 121) {
				Static108.anInt2748 = Static80.aClass1_Sub8_Sub1_2.method1211();
				Static88.anInt2328 = -1;
				Static23.aBoolean33 = true;
				Static89.aBoolean132 = true;
				return true;
			}
			if (Static88.anInt2328 == 36) {
				Static59.anInt1999 = Static80.aClass1_Sub8_Sub1_2.method1186();
				anInt834 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static63.anInt1526 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static88.anInt2328 = -1;
				Static28.aBoolean41 = true;
				Static45.aBoolean100 = true;
				return true;
			}
			@Pc(837) Class1_Sub1_Sub12 local837;
			if (Static88.anInt2328 == 122) {
				local121 = Static80.aClass1_Sub8_Sub1_2.method1208();
				local375 = local121 & 0x1F;
				local371 = local121 >> 5 & 0x1F;
				local251 = local121 >> 10 & 0x1F;
				local224 = Static80.aClass1_Sub8_Sub1_2.method1188();
				local837 = Static33.method578(local224);
				local837.anInt2148 = (local375 << 3) + (local371 << 11) + (local251 << 19);
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 84) {
				local121 = Static80.aClass1_Sub8_Sub1_2.method1199();
				if (local121 == 65535) {
					local121 = -1;
				}
				local224 = Static80.aClass1_Sub8_Sub1_2.method1186();
				if (local121 != Static10.anIntArray33[local224]) {
					Static59.method1418(Static10.anIntArray33[local224]);
					Static10.anIntArray33[local224] = local121;
				}
				Static23.aBoolean33 = true;
				Static88.anInt2328 = -1;
				Static89.aBoolean132 = true;
				return true;
			}
			if (Static88.anInt2328 == 12) {
				Static36.anInt903 = Static80.aClass1_Sub8_Sub1_2.method1207();
				if (Static108.anInt2748 == Static36.anInt903) {
					Static89.aBoolean132 = true;
					if (Static36.anInt903 == 3) {
						Static108.anInt2748 = 1;
					} else {
						Static108.anInt2748 = 3;
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 197) {
				Static89.aBoolean132 = true;
				local224 = Static80.aClass1_Sub8_Sub1_2.method1207();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1211();
				local371 = Static80.aClass1_Sub8_Sub1_2.method1188();
				Static64.anIntArray225[local224] = local371;
				Static73.anIntArray264[local224] = local251;
				Static108.anIntArray405[local224] = 1;
				for (local375 = 0; local375 < 98; local375++) {
					if (Class37.anIntArray207[local375] <= local371) {
						Static108.anIntArray405[local224] = local375 + 2;
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 206) {
				Static82.aBoolean117 = false;
				Static106.anInt2737 = 2;
				Static11.aClass42_191 = Static11.aClass42_195;
				Static88.anInt2328 = -1;
				Static28.aBoolean41 = true;
				return true;
			}
			@Pc(1025) Class1_Sub1_Sub12 local1025;
			if (Static88.anInt2328 == 192) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1208();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1188();
				local371 = Static80.aClass1_Sub8_Sub1_2.method1208();
				local1025 = Static33.method578(local251);
				if (local371 == 65535) {
					local1025.anInt2163 = 0;
					Static88.anInt2328 = -1;
					return true;
				}
				@Pc(1041) Class1_Sub1_Sub2 local1041 = Static36.method617(local371);
				local1025.anInt2162 = local1041.anInt209;
				local1025.anInt2190 = local1041.anInt196 * 100 / local224;
				local1025.anInt2186 = local1041.anInt222;
				local1025.anInt2163 = 4;
				local1025.anInt2169 = local371;
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 224) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local371 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local375 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static33.aBooleanArray7[local224] = true;
				Static45.anIntArray262[local224] = local251;
				Static49.anIntArray192[local224] = local371;
				Static35.anIntArray119[local224] = local375;
				Static53.anIntArray403[local224] = 0;
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 225) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1186();
				local371 = Static80.aClass1_Sub8_Sub1_2.method1199();
				if (Static62.anInt1488 != 0 && local251 != 0 && Static65.anInt1577 < 50) {
					Static81.anIntArray324[Static65.anInt1577] = local224;
					Static60.anIntArray218[Static65.anInt1577] = local251;
					Static29.anIntArray97[Static65.anInt1577] = local371;
					Static90.aClass3Array1[Static65.anInt1577] = null;
					Static48.anIntArray185[Static65.anInt1577] = 0;
					Static65.anInt1577++;
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 53) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1199();
				Static61.method1016(local224);
				if (Static29.anInt819 != -1) {
					Static59.method1418(Static29.anInt819);
					Static29.anInt819 = -1;
					Static23.aBoolean33 = true;
					Static89.aBoolean132 = true;
				}
				if (Static43.anInt1144 != -1) {
					Static59.method1418(Static43.anInt1144);
					Static43.anInt1144 = -1;
					Static12.method278(30);
				}
				if (Static57.anInt2701 != -1) {
					Static59.method1418(Static57.anInt2701);
					Static57.anInt2701 = -1;
				}
				if (Static108.anInt2743 != -1) {
					Static59.method1418(Static108.anInt2743);
					Static108.anInt2743 = -1;
				}
				if (local224 != Static108.anInt2745) {
					Static59.method1418(Static108.anInt2745);
					Static108.anInt2745 = local224;
				}
				Static88.anInt2328 = -1;
				Static28.aBoolean41 = true;
				Static62.aBoolean87 = false;
				return true;
			}
			if (Static88.anInt2328 == 150) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1216();
				if (Static108.anInt2745 != -1) {
					Static59.method1418(Static108.anInt2745);
					Static28.aBoolean41 = true;
					Static108.anInt2745 = -1;
				}
				if (Static43.anInt1144 != -1) {
					Static59.method1418(Static43.anInt1144);
					Static43.anInt1144 = -1;
					Static12.method278(30);
				}
				if (Static57.anInt2701 != -1) {
					Static59.method1418(Static57.anInt2701);
					Static57.anInt2701 = -1;
				}
				if (Static108.anInt2743 != local251) {
					Static59.method1418(Static108.anInt2743);
					Static108.anInt2743 = local251;
				}
				if (Static29.anInt819 != local224) {
					Static59.method1418(Static29.anInt819);
					Static29.anInt819 = local224;
				}
				if (Static106.anInt2737 != 0) {
					Static106.anInt2737 = 0;
					Static28.aBoolean41 = true;
				}
				Static62.aBoolean87 = false;
				Static88.anInt2328 = -1;
				Static23.aBoolean33 = true;
				Static89.aBoolean132 = true;
				return true;
			}
			if (Static88.anInt2328 == 75) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1213();
				if (local224 != Static45.anInt1850) {
					Static59.method1418(Static45.anInt1850);
					Static45.anInt1850 = local224;
				}
				Static28.aBoolean41 = true;
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 54 || Static88.anInt2328 == 59 || Static88.anInt2328 == 216 || Static88.anInt2328 == 160 || Static88.anInt2328 == 165 || Static88.anInt2328 == 102 || Static88.anInt2328 == 92 || Static88.anInt2328 == 77 || Static88.anInt2328 == 106 || Static88.anInt2328 == 27 || Static88.anInt2328 == 203) {
				Static71.method1284();
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 114) {
				local629 = Static80.aClass1_Sub8_Sub1_2.method1201();
				@Pc(1421) long local1421;
				@Pc(1423) boolean local1423;
				if (local629.method1032(Static15.aClass42_306)) {
					local198 = local629.method1053(0, local629.method1050(Static53.aClass42_1438));
					local1421 = local198.method1049();
					local1423 = false;
					for (local474 = 0; local474 < Static1.anInt1; local474++) {
						if (Static37.aLongArray2[local474] == local1421) {
							local1423 = true;
							break;
						}
					}
					if (!local1423 && Static19.anInt638 == 0) {
						Static24.method509(local198, 4, Static83.aClass42_1188);
					}
				} else if (local629.method1032(Static19.aClass42_353)) {
					local198 = local629.method1053(0, local629.method1050(Static53.aClass42_1438));
					local1421 = local198.method1049();
					local1423 = false;
					for (local474 = 0; local474 < Static1.anInt1; local474++) {
						if (local1421 == Static37.aLongArray2[local474]) {
							local1423 = true;
							break;
						}
					}
					if (!local1423 && Static19.anInt638 == 0) {
						Static24.method509(local198, 8, Static35.aClass42_478);
					}
				} else if (local629.method1032(Static108.aClass42_1452)) {
					local198 = local629.method1053(0, local629.method1050(Static53.aClass42_1438));
					local1421 = local198.method1049();
					local1423 = false;
					for (local474 = 0; local474 < Static1.anInt1; local474++) {
						if (local1421 == Static37.aLongArray2[local474]) {
							local1423 = true;
							break;
						}
					}
					if (!local1423 && Static19.anInt638 == 0) {
						@Pc(1527) Class42 local1527 = local629.method1053(local629.method1050(Static53.aClass42_1438) + 1, local629.method1027() + -9);
						Static24.method509(local198, 8, local1527);
					}
				} else {
					Static24.method509(Static11.aClass42_195, 0, local629);
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 210) {
				for (local224 = 0; local224 < Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1.length; local224++) {
					if (Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local224] != null) {
						Static33.aClass1_Sub1_Sub8_Sub1_Sub2Array1[local224].anInt2601 = -1;
					}
				}
				for (local251 = 0; local251 < Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1.length; local251++) {
					if (Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local251] != null) {
						Static8.aClass1_Sub1_Sub8_Sub1_Sub1Array1[local251].anInt2601 = -1;
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 186) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1206();
				Static61.method1016(local224);
				if (Static108.anInt2745 != -1) {
					Static59.method1418(Static108.anInt2745);
					Static28.aBoolean41 = true;
					Static108.anInt2745 = -1;
				}
				if (Static43.anInt1144 != -1) {
					Static59.method1418(Static43.anInt1144);
					Static43.anInt1144 = -1;
					Static12.method278(30);
				}
				if (Static57.anInt2701 != -1) {
					Static59.method1418(Static57.anInt2701);
					Static57.anInt2701 = -1;
				}
				if (Static108.anInt2743 != -1) {
					Static59.method1418(Static108.anInt2743);
					Static108.anInt2743 = -1;
				}
				if (Static29.anInt819 != local224) {
					Static59.method1418(Static29.anInt819);
					Static29.anInt819 = local224;
				}
				Static89.aBoolean132 = true;
				if (Static106.anInt2737 != 0) {
					Static106.anInt2737 = 0;
					Static28.aBoolean41 = true;
				}
				Static88.anInt2328 = -1;
				Static62.aBoolean87 = false;
				Static23.aBoolean33 = true;
				return true;
			}
			if (Static88.anInt2328 == 208) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1206();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1206();
				local371 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local375 = Static80.aClass1_Sub8_Sub1_2.method1203();
				local837 = Static33.method578(local375);
				local837.anInt2186 = local224;
				local837.anInt2162 = local371;
				Static88.anInt2328 = -1;
				local837.anInt2190 = local251;
				return true;
			}
			if (Static88.anInt2328 == 35) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1220();
				local198 = Static80.aClass1_Sub8_Sub1_2.method1201();
				local371 = Static80.aClass1_Sub8_Sub1_2.method1186();
				if (local371 >= 1 && local371 <= 5) {
					if (local198.method1040(Static53.aClass42_1430)) {
						local198 = null;
					}
					Static56.aClass42Array9[local371 - 1] = local198;
					Static62.aBooleanArray9[local371 - 1] = local224 == 0;
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 243) {
				Static6.anInt161 = Static80.aClass1_Sub8_Sub1_2.method1207();
				Static54.anInt1407 = Static80.aClass1_Sub8_Sub1_2.method1211();
				for (local224 = Static6.anInt161; local224 < Static6.anInt161 + 8; local224++) {
					for (local251 = Static54.anInt1407; local251 < Static54.anInt1407 + 8; local251++) {
						if (Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local224][local251] != null) {
							Static93.aClass22ArrayArrayArray1[Static82.anInt2165][local224][local251] = null;
							Static90.method1658(local251, local224);
						}
					}
				}
				for (@Pc(1878) Class1_Sub3 local1878 = (Class1_Sub3) Static33.aClass22_7.method515(); local1878 != null; local1878 = (Class1_Sub3) Static33.aClass22_7.method519()) {
					if (Static6.anInt161 <= local1878.anInt596 && Static6.anInt161 + 8 > local1878.anInt596 && Static54.anInt1407 <= local1878.anInt583 && Static54.anInt1407 + 8 > local1878.anInt583 && Static82.anInt2165 == local1878.anInt589) {
						local1878.anInt595 = 0;
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 155) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1182();
				local228 = Static33.method578(local224);
				local228.anInt2163 = 3;
				local228.anInt2169 = Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.aClass29_2.method624();
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 187) {
				Static84.anInt2244 = Static80.aClass1_Sub8_Sub1_2.method1186();
				if (Static84.anInt2244 == 1) {
					Static6.anInt156 = Static80.aClass1_Sub8_Sub1_2.method1199();
				}
				if (Static84.anInt2244 >= 2 && Static84.anInt2244 <= 6) {
					if (Static84.anInt2244 == 2) {
						Static18.anInt605 = 64;
						Static49.anInt1245 = 64;
					}
					if (Static84.anInt2244 == 3) {
						Static49.anInt1245 = 64;
						Static18.anInt605 = 0;
					}
					if (Static84.anInt2244 == 4) {
						Static49.anInt1245 = 64;
						Static18.anInt605 = 128;
					}
					if (Static84.anInt2244 == 5) {
						Static18.anInt605 = 64;
						Static49.anInt1245 = 0;
					}
					if (Static84.anInt2244 == 6) {
						Static18.anInt605 = 64;
						Static49.anInt1245 = 128;
					}
					Static84.anInt2244 = 2;
					Static103.anInt2678 = Static80.aClass1_Sub8_Sub1_2.method1199();
					Static3.anInt120 = Static80.aClass1_Sub8_Sub1_2.method1199();
					Static61.anInt1458 = Static80.aClass1_Sub8_Sub1_2.method1186();
				}
				if (Static84.anInt2244 == 10) {
					Static68.anInt1672 = Static80.aClass1_Sub8_Sub1_2.method1199();
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 97) {
				Static60.anInt1444 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 177) {
				if (Static108.anInt2748 == 12) {
					Static89.aBoolean132 = true;
				}
				Static48.anInt1217 = Static80.aClass1_Sub8_Sub1_2.method1226();
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 148) {
				Static69.method1241();
				Static88.anInt2328 = -1;
				return false;
			}
			if (Static88.anInt2328 == 65) {
				Static25.anInt735 = Static80.aClass1_Sub8_Sub1_2.method1206();
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 198) {
				Static61.anInt1459 = 0;
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 57) {
				if (Static29.anInt819 != -1) {
					Static59.method1418(Static29.anInt819);
					Static89.aBoolean132 = true;
					Static29.anInt819 = -1;
					Static23.aBoolean33 = true;
				}
				if (Static108.anInt2745 != -1) {
					Static59.method1418(Static108.anInt2745);
					Static108.anInt2745 = -1;
					Static28.aBoolean41 = true;
				}
				if (Static43.anInt1144 != -1) {
					Static59.method1418(Static43.anInt1144);
					Static43.anInt1144 = -1;
					Static12.method278(30);
				}
				if (Static57.anInt2701 != -1) {
					Static59.method1418(Static57.anInt2701);
					Static57.anInt2701 = -1;
				}
				if (Static108.anInt2743 != -1) {
					Static59.method1418(Static108.anInt2743);
					Static108.anInt2743 = -1;
				}
				Static88.anInt2328 = -1;
				if (Static106.anInt2737 != 0) {
					Static106.anInt2737 = 0;
					Static28.aBoolean41 = true;
				}
				Static62.aBoolean87 = false;
				return true;
			}
			if (Static88.anInt2328 == 0) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1188();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1216();
				local311 = Static33.method578(local224);
				if (local311 != null && local311.anInt2177 == 0) {
					if (local251 < 0) {
						local251 = 0;
					}
					if (local251 > local311.anInt2192 - local311.anInt2183) {
						local251 = local311.anInt2192 - local311.anInt2183;
					}
					local311.anInt2152 = local251;
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 202) {
				Static11.aClass42_191 = Static11.aClass42_195;
				Static28.aBoolean41 = true;
				Static88.anInt2328 = -1;
				Static106.anInt2737 = 1;
				Static82.aBoolean117 = false;
				return true;
			}
			if (Static88.anInt2328 == 136) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1205();
				if (local224 >= 0) {
					Static61.method1016(local224);
				}
				if (local224 != Static29.anInt824) {
					Static59.method1418(Static29.anInt824);
					Static29.anInt824 = local224;
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 29) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1206();
				if (local224 == 65535) {
					local224 = -1;
				}
				if (local224 == -1 && Static58.anInt1434 == 0) {
					Static97.method1703();
				} else if (local224 != -1 && local224 != Static108.anInt2750 && Static20.anInt655 != 0 && Static58.anInt1434 == 0) {
					Static97.method1709(local224, Static7.aClass33_Sub1_2, Static20.anInt655, 0);
				}
				Static88.anInt2328 = -1;
				Static108.anInt2750 = local224;
				return true;
			}
			if (Static88.anInt2328 == 41) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1202();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1199();
				if (local251 == 65535) {
					local251 = -1;
				}
				if (Static20.anInt655 != 0 && local251 != -1) {
					Static97.method1706(local251, 1, Static83.aClass33_Sub1_16, Static20.anInt655);
					Static58.anInt1434 = local224;
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 142) {
				for (local224 = 0; local224 < Static16.anInt567; local224++) {
					@Pc(2383) Class1_Sub1_Sub16 local2383 = Static57.method1824(local224);
					if (local2383 != null && local2383.anInt2514 == 0) {
						Static43.anIntArray166[local224] = 0;
						Static51.anIntArray200[local224] = 0;
					}
				}
				Static89.aBoolean132 = true;
				Static88.anInt2328 = -1;
				if (Static45.anInt1850 != -1) {
					Static28.aBoolean41 = true;
				}
				return true;
			}
			if (Static88.anInt2328 == 215) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1182();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1208();
				local311 = Static33.method578(local224);
				local311.anInt2163 = 1;
				local311.anInt2169 = local251;
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 183) {
				Static23.method506(Static80.aClass1_Sub8_Sub1_2, Static64.aClass60_3, Static20.anInt644);
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 153) {
				Static54.anInt1407 = Static80.aClass1_Sub8_Sub1_2.method1220();
				Static6.anInt161 = Static80.aClass1_Sub8_Sub1_2.method1211();
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 31) {
				Static81.method1488(false);
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 247) {
				@Pc(2483) long local2483 = Static80.aClass1_Sub8_Sub1_2.method1224();
				local371 = Static80.aClass1_Sub8_Sub1_2.method1199();
				@Pc(2493) Class42 local2493 = Static64.method1096(local2483).method1058();
				for (local708 = 0; local708 < Static8.anInt239; local708++) {
					if (Static87.aLongArray5[local708] == local2483) {
						if (local371 != Static109.anIntArray408[local708]) {
							Static109.anIntArray408[local708] = local371;
							Static89.aBoolean132 = true;
							if (local371 > 0) {
								Static24.method509(Static11.aClass42_195, 5, Static57.method1822(new Class42[] { local2493, Static48.aClass42_670 }));
							}
							if (local371 == 0) {
								Static24.method509(Static11.aClass42_195, 5, Static57.method1822(new Class42[] { local2493, Static63.aClass42_808 }));
							}
						}
						local2493 = null;
						break;
					}
				}
				if (local2493 != null && Static8.anInt239 < 200) {
					Static87.aLongArray5[Static8.anInt239] = local2483;
					Static8.aClass42Array3[Static8.anInt239] = local2493;
					Static109.anIntArray408[Static8.anInt239] = local371;
					Static89.aBoolean132 = true;
					Static8.anInt239++;
				}
				@Pc(2598) boolean local2598 = false;
				while (!local2598) {
					local2598 = true;
					for (@Pc(2604) int local2604 = 0; local2604 < Static8.anInt239 - 1; local2604++) {
						if (Static109.anIntArray408[local2604] != Static48.anInt1226 && Static48.anInt1226 == Static109.anIntArray408[local2604 + 1] || Static109.anIntArray408[local2604] == 0 && Static109.anIntArray408[local2604 + 1] != 0) {
							@Pc(2639) int local2639 = Static109.anIntArray408[local2604];
							local2598 = false;
							Static109.anIntArray408[local2604] = Static109.anIntArray408[local2604 + 1];
							Static109.anIntArray408[local2604 + 1] = local2639;
							@Pc(2659) Class42 local2659 = Static8.aClass42Array3[local2604];
							Static8.aClass42Array3[local2604] = Static8.aClass42Array3[local2604 + 1];
							Static8.aClass42Array3[local2604 + 1] = local2659;
							@Pc(2677) long local2677 = Static87.aLongArray5[local2604];
							Static87.aLongArray5[local2604] = Static87.aLongArray5[local2604 + 1];
							Static87.aLongArray5[local2604 + 1] = local2677;
							Static89.aBoolean132 = true;
						}
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 211) {
				Static107.aBoolean147 = false;
				for (local224 = 0; local224 < 5; local224++) {
					Static33.aBooleanArray7[local224] = false;
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 229) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1208();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1210();
				local371 = Static80.aClass1_Sub8_Sub1_2.method1199();
				local1025 = Static33.method578(local251);
				local1025.anInt2184 = local224 + (local371 << 16);
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 94) {
				Static1.anInt1 = Static20.anInt644 / 8;
				for (local224 = 0; local224 < Static1.anInt1; local224++) {
					Static37.aLongArray2[local224] = Static80.aClass1_Sub8_Sub1_2.method1224();
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 38) {
				Static79.anInt2016 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 188) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1208();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1208();
				Static61.method1016(local224);
				if (local251 != -1) {
					Static61.method1016(local251);
				}
				if (Static108.anInt2743 != -1) {
					Static59.method1418(Static108.anInt2743);
					Static108.anInt2743 = -1;
				}
				if (Static29.anInt819 != -1) {
					Static59.method1418(Static29.anInt819);
					Static29.anInt819 = -1;
				}
				if (Static108.anInt2745 != -1) {
					Static59.method1418(Static108.anInt2745);
					Static108.anInt2745 = -1;
				}
				if (local224 != Static43.anInt1144) {
					Static59.method1418(Static43.anInt1144);
					Static43.anInt1144 = local224;
					Static12.method278(35);
				}
				if (Static57.anInt2701 != local224) {
					Static59.method1418(Static57.anInt2701);
					Static57.anInt2701 = local251;
				}
				Static88.anInt2328 = -1;
				Static62.aBoolean87 = false;
				Static106.anInt2737 = 0;
				return true;
			}
			if (Static88.anInt2328 == 159) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1210();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1199();
				Static43.anIntArray166[local251] = local224;
				if (local224 != Static51.anIntArray200[local251]) {
					Static51.anIntArray200[local251] = local224;
					Static107.method1829(local251);
					Static89.aBoolean132 = true;
					if (Static45.anInt1850 != -1) {
						Static28.aBoolean41 = true;
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 241) {
				Static89.aBoolean132 = true;
				local224 = Static80.aClass1_Sub8_Sub1_2.method1188();
				local228 = Static33.method578(local224);
				local371 = Static80.aClass1_Sub8_Sub1_2.method1199();
				for (local375 = 0; local375 < local371; local375++) {
					local708 = Static80.aClass1_Sub8_Sub1_2.method1220();
					if (local708 == 255) {
						local708 = Static80.aClass1_Sub8_Sub1_2.method1203();
					}
					local228.anIntArray332[local375] = Static80.aClass1_Sub8_Sub1_2.method1206();
					local228.anIntArray330[local375] = local708;
				}
				for (local708 = local371; local708 < local228.anIntArray332.length; local708++) {
					local228.anIntArray332[local708] = 0;
					local228.anIntArray330[local708] = 0;
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 194) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1206();
				@Pc(3001) byte local3001 = Static80.aClass1_Sub8_Sub1_2.method1219();
				Static43.anIntArray166[local224] = local3001;
				if (Static51.anIntArray200[local224] != local3001) {
					Static51.anIntArray200[local224] = local3001;
					Static107.method1829(local224);
					Static89.aBoolean132 = true;
					if (Static45.anInt1850 != -1) {
						Static28.aBoolean41 = true;
					}
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 101) {
				Static81.method1488(true);
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 2) {
				Static107.aBoolean147 = true;
				Static57.anInt2698 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static56.anInt1424 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static58.anInt1436 = Static80.aClass1_Sub8_Sub1_2.method1199();
				Static25.anInt734 = Static80.aClass1_Sub8_Sub1_2.method1186();
				Static50.anInt1739 = Static80.aClass1_Sub8_Sub1_2.method1186();
				if (Static50.anInt1739 >= 100) {
					Static68.anInt1671 = Static57.anInt2698 * 128 + 64;
					Static37.anInt917 = Static56.anInt1424 * 128 + 64;
					Static8.anInt243 = Static104.method1821(Static37.anInt917, Static82.anInt2165, Static68.anInt1671) - Static58.anInt1436;
				}
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 109) {
				Static68.method1173();
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 130) {
				@Pc(3113) boolean local3113 = Static80.aClass1_Sub8_Sub1_2.method1186() == 1;
				local251 = Static80.aClass1_Sub8_Sub1_2.method1188();
				local311 = Static33.method578(local251);
				Static88.anInt2328 = -1;
				local311.aBoolean122 = local3113;
				return true;
			}
			if (Static88.anInt2328 == 231) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1203();
				local251 = Static80.aClass1_Sub8_Sub1_2.method1213();
				local311 = Static33.method578(local224);
				Static88.anInt2328 = -1;
				if (local251 != local311.anInt2154 || local251 == -1) {
					local311.anInt2157 = 0;
					local311.anInt2154 = local251;
					local311.anInt2147 = 0;
				}
				return true;
			}
			if (Static88.anInt2328 == 9) {
				Static83.method1515();
				Static88.anInt2328 = -1;
				return true;
			}
			if (Static88.anInt2328 == 68) {
				local224 = Static80.aClass1_Sub8_Sub1_2.method1206();
				Static61.method1016(local224);
				if (Static29.anInt819 != -1) {
					Static59.method1418(Static29.anInt819);
					Static89.aBoolean132 = true;
					Static23.aBoolean33 = true;
					Static29.anInt819 = -1;
				}
				if (Static108.anInt2745 != -1) {
					Static59.method1418(Static108.anInt2745);
					Static108.anInt2745 = -1;
					Static28.aBoolean41 = true;
				}
				if (Static43.anInt1144 != -1) {
					Static59.method1418(Static43.anInt1144);
					Static43.anInt1144 = -1;
					Static12.method278(30);
				}
				if (Static57.anInt2701 != -1) {
					Static59.method1418(Static57.anInt2701);
					Static57.anInt2701 = -1;
				}
				if (Static108.anInt2743 != local224) {
					Static59.method1418(Static108.anInt2743);
					Static108.anInt2743 = local224;
				}
				Static62.aBoolean87 = false;
				Static88.anInt2328 = -1;
				if (Static106.anInt2737 != 0) {
					Static28.aBoolean41 = true;
					Static106.anInt2737 = 0;
				}
				return true;
			}
			Static95.method1687("T1 - " + Static88.anInt2328 + "," + Static51.anInt1383 + "," + Static97.anInt2472 + " - " + Static20.anInt644, null);
			Static69.method1241();
		} catch (@Pc(3281) IOException local3281) {
			Static101.method1777();
		} catch (@Pc(3285) Exception local3285) {
			@Pc(3327) String local3327 = "T2 - " + Static88.anInt2328 + "," + Static51.anInt1383 + "," + Static97.anInt2472 + " - " + Static20.anInt644 + "," + (Static51.anInt1373 + Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray395[0]) + "," + (Static45.anInt1843 + Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.anIntArray393[0]) + " - ";
			for (local224 = 0; Static20.anInt644 > local224 && local224 < 50; local224++) {
				local3327 = local3327 + Static80.aClass1_Sub8_Sub1_2.aByteArray24[local224] + ",";
			}
			Static95.method1687(local3327, local3285);
			Static69.method1241();
		}
		return true;
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)Lclient!s;")
	public static Class1_Sub1_Sub14 method574(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub1_Sub14 local10 = (Class1_Sub1_Sub14) Static67.aClass37_19.method982((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(32) byte[] local32 = Static89.aClass33_26.method1305(arg0, 12);
		local10 = new Class1_Sub1_Sub14();
		if (local32 != null) {
			local10.method1621(new Class1_Sub8(local32));
		}
		local10.method1612();
		Static67.aClass37_19.method981((long) arg0, local10);
		return local10;
	}
}
