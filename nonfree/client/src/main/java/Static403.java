import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static403 {

	@OriginalMember(owner = "client!tu", name = "e", descriptor = "Lclient!tn;")
	public static final Class242 aClass242_108 = new Class242(75, 8);

	@OriginalMember(owner = "client!tu", name = "j", descriptor = "I")
	public static int anInt6355 = -1;

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(FIIFLclient!sm;FFFIII)[B")
	public static byte[] method5123(@OriginalArg(0) float arg0, @OriginalArg(3) float arg1, @OriginalArg(4) Class10 arg2, @OriginalArg(5) float arg3, @OriginalArg(6) float arg4, @OriginalArg(7) float arg5) {
		@Pc(10) byte[] local10 = new byte[262144];
		Static167.method2201(arg2, arg1, arg4, local10, arg3, arg0, 0, arg5);
		return local10;
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
	public static void method5125() {
		if (!Static290.aBoolean449) {
			return;
		}
		@Pc(16) Class107 local16 = Static220.method3163(anInt6355, Static276.anInt4734);
		if (local16 != null && local16.anObjectArray19 != null) {
			@Pc(25) Class1_Sub11 local25 = new Class1_Sub11();
			local25.anObjectArray2 = local16.anObjectArray19;
			local25.aClass107_2 = local16;
			Static198.method2834(local25);
		}
		Static2.anInt29 = -1;
		Static290.aBoolean449 = false;
		Static211.anInt5191 = -1;
		if (local16 != null) {
			Static260.method3633(local16);
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(ZIII[[[Lclient!rb;B)Z")
	public static boolean method5127(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class216[][][] arg4) {
		@Pc(14) byte local14 = arg0 ? 1 : (byte) (Static330.anInt5429 & 0xFF);
		if (local14 == Static380.aByteArrayArrayArray17[Static390.anInt6272][arg3][arg1]) {
			return false;
		} else if ((Static278.aByteArrayArrayArray16[Static390.anInt6272][arg3][arg1] & 0x4) == 0) {
			return false;
		} else {
			@Pc(43) byte local43 = 0;
			@Pc(45) int local45 = 0;
			Static454.anIntArray538[0] = arg3;
			@Pc(57) int local57 = local43 + 1;
			Static185.anIntArray258[0] = arg1;
			Static380.aByteArrayArrayArray17[Static390.anInt6272][arg3][arg1] = local14;
			while (local57 != local45) {
				@Pc(75) int local75 = Static454.anIntArray538[local45] & 0xFFFF;
				@Pc(83) int local83 = Static454.anIntArray538[local45] >> 16 & 0xFF;
				@Pc(91) int local91 = Static454.anIntArray538[local45] >> 24 & 0xFF;
				@Pc(97) int local97 = Static185.anIntArray258[local45] & 0xFFFF;
				@Pc(105) int local105 = Static185.anIntArray258[local45] >> 16 & 0xFF;
				local45 = local45 + 1 & 0xFFF;
				@Pc(113) boolean local113 = false;
				if ((Static278.aByteArrayArrayArray16[Static390.anInt6272][local75][local97] & 0x4) == 0) {
					local113 = true;
				}
				@Pc(127) boolean local127 = false;
				@Pc(166) int local166;
				@Pc(209) int local209;
				label231: for (@Pc(131) int local131 = Static390.anInt6272 + 1; local131 <= 3; local131++) {
					if ((Static278.aByteArrayArrayArray16[local131][local75][local97] & 0x8) == 0) {
						@Pc(300) Class11_Sub1 local300;
						@Pc(310) int local310;
						@Pc(289) Class216 local289;
						@Pc(295) Class259 local295;
						if (local113 && arg4[local131][local75][local97] != null) {
							if (arg4[local131][local75][local97].aClass11_Sub3_3 != null) {
								local166 = Static274.method3734(local83);
								if (arg4[local131][local75][local97].aClass11_Sub3_3.anInt4000 == local166 || arg4[local131][local75][local97].aClass11_Sub3_2 != null && local166 == arg4[local131][local75][local97].aClass11_Sub3_2.anInt4000) {
									continue;
								}
								if (local91 != 0) {
									local209 = Static274.method3734(local91);
									if (arg4[local131][local75][local97].aClass11_Sub3_3.anInt4000 == local209 || arg4[local131][local75][local97].aClass11_Sub3_2 != null && local209 == arg4[local131][local75][local97].aClass11_Sub3_2.anInt4000) {
										continue;
									}
								}
								if (local105 != 0) {
									local209 = Static274.method3734(local105);
									if (local209 == arg4[local131][local75][local97].aClass11_Sub3_3.anInt4000 || arg4[local131][local75][local97].aClass11_Sub3_2 != null && local209 == arg4[local131][local75][local97].aClass11_Sub3_2.anInt4000) {
										continue;
									}
								}
							}
							local289 = arg4[local131][local75][local97];
							if (local289.aClass259_1 != null) {
								for (local295 = local289.aClass259_1; local295 != null; local295 = local295.aClass259_4) {
									local300 = local295.aClass11_Sub1_2;
									if (local300 instanceof Interface7) {
										@Pc(306) Interface7 local306 = (Interface7) local300;
										local310 = local306.method4897();
										if (local310 == 21) {
											local310 = 19;
										}
										@Pc(319) int local319 = local306.method4899();
										@Pc(325) int local325 = local319 << 6 | local310;
										if (local325 == local83 || local91 != 0 && local91 == local325 || local105 != 0 && local105 == local325) {
											continue label231;
										}
									}
								}
							}
						}
						local289 = arg4[local131][local75][local97];
						if (local289 != null && local289.aClass259_1 != null) {
							for (local295 = local289.aClass259_1; local295 != null; local295 = local295.aClass259_4) {
								local300 = local295.aClass11_Sub1_2;
								if (local300.aShort100 != local300.aShort103 || local300.aShort101 != local300.aShort102) {
									for (@Pc(386) int local386 = local300.aShort103; local386 <= local300.aShort100; local386++) {
										for (local310 = local300.aShort101; local310 <= local300.aShort102; local310++) {
											Static380.aByteArrayArrayArray17[local131][local386][local310] = local14;
										}
									}
								}
							}
						}
						local127 = true;
						Static380.aByteArrayArrayArray17[local131][local75][local97] = local14;
					}
				}
				if (local127) {
					local166 = Static452.aClass139Array3[Static390.anInt6272 + 1].ua(local75, local97);
					if (Static214.anIntArray283[arg2] < local166) {
						Static214.anIntArray283[arg2] = local166;
					}
					local209 = local75 << 7;
					if (local209 < Static340.anIntArray401[arg2]) {
						Static340.anIntArray401[arg2] = local209;
					} else if (local209 > Static290.anIntArray368[arg2]) {
						Static290.anIntArray368[arg2] = local209;
					}
					@Pc(500) int local500 = local97 << 7;
					if (local500 < Static372.anIntArray452[arg2]) {
						Static372.anIntArray452[arg2] = local500;
					} else if (Static263.anIntArray345[arg2] < local500) {
						Static263.anIntArray345[arg2] = local500;
					}
				}
				if (!local113) {
					if (local75 >= 1 && local14 != Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 - 1][local97]) {
						Static454.anIntArray538[local57] = local75 - 1 | 0x120000 | 0xD3000000;
						Static185.anIntArray258[local57] = local97 | 0x130000;
						local57 = local57 + 1 & 0xFFF;
						Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 - 1][local97] = local14;
					}
					@Pc(585) int local585 = ~Static293.anInt4886;
					local97++;
					if (local585 < ~local97) {
						if (local75 - 1 >= 0 && local14 != Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 - 1][local97] && (Static278.aByteArrayArrayArray16[Static390.anInt6272][local75][local97] & 0x4) == 0 && (Static278.aByteArrayArrayArray16[Static390.anInt6272][local75 - 1][local97 - 1] & 0x4) == 0) {
							Static454.anIntArray538[local57] = local75 - 1 | 0x120000 | 0x52000000;
							Static185.anIntArray258[local57] = local97 | 0x130000;
							local57 = local57 + 1 & 0xFFF;
							Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 - 1][local97] = local14;
						}
						if (Static380.aByteArrayArrayArray17[Static390.anInt6272][local75][local97] != local14) {
							Static454.anIntArray538[local57] = local75 | 0x520000 | 0x13000000;
							Static185.anIntArray258[local57] = local97 | 0x530000;
							Static380.aByteArrayArrayArray17[Static390.anInt6272][local75][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (local75 + 1 < Static147.anInt2300 && local14 != Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 + 1][local97] && (Static278.aByteArrayArrayArray16[Static390.anInt6272][local75][local97] & 0x4) == 0 && (Static278.aByteArrayArrayArray16[Static390.anInt6272][local75 + 1][local97 - 1] & 0x4) == 0) {
							Static454.anIntArray538[local57] = local75 + 1 | 0x520000 | 0x92000000;
							Static185.anIntArray258[local57] = local97 | 0x530000;
							local57 = local57 + 1 & 0xFFF;
							Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 + 1][local97] = local14;
						}
					}
					local97--;
					if (local75 + 1 < Static147.anInt2300 && Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 + 1][local97] != local14) {
						Static454.anIntArray538[local57] = local75 + 1 | 0x920000 | 0x53000000;
						Static185.anIntArray258[local57] = local97 | 0x930000;
						local57 = local57 + 1 & 0xFFF;
						Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 + 1][local97] = local14;
					}
					local97--;
					if (local97 >= 0) {
						if (local75 - 1 >= 0 && local14 != Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 - 1][local97] && (Static278.aByteArrayArrayArray16[Static390.anInt6272][local75][local97] & 0x4) == 0 && (Static278.aByteArrayArrayArray16[Static390.anInt6272][local75 - 1][local97 + 1] & 0x4) == 0) {
							Static454.anIntArray538[local57] = local75 - 1 | 0xD20000 | 0x12000000;
							Static185.anIntArray258[local57] = local97 | 0xD30000;
							Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 - 1][local97] = local14;
							local57 = local57 + 1 & 0xFFF;
						}
						if (Static380.aByteArrayArrayArray17[Static390.anInt6272][local75][local97] != local14) {
							Static454.anIntArray538[local57] = local75 | 0xD20000 | 0x93000000;
							Static185.anIntArray258[local57] = local97 | 0xD30000;
							local57 = local57 + 1 & 0xFFF;
							Static380.aByteArrayArrayArray17[Static390.anInt6272][local75][local97] = local14;
						}
						if (Static147.anInt2300 > local75 + 1 && local14 != Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 + 1][local97] && (Static278.aByteArrayArrayArray16[Static390.anInt6272][local75][local97] & 0x4) == 0 && (Static278.aByteArrayArrayArray16[Static390.anInt6272][local75 + 1][local97 + 1] & 0x4) == 0) {
							Static454.anIntArray538[local57] = local75 + 1 | 0xD2000000 | 0x920000;
							Static185.anIntArray258[local57] = local97 | 0x930000;
							local57 = local57 + 1 & 0xFFF;
							Static380.aByteArrayArrayArray17[Static390.anInt6272][local75 + 1][local97] = local14;
						}
					}
				}
			}
			if (Static214.anIntArray283[arg2] != -1000000) {
				Static214.anIntArray283[arg2] += 10;
				Static340.anIntArray401[arg2] -= 50;
				Static290.anIntArray368[arg2] += 50;
				Static263.anIntArray345[arg2] += 50;
				Static372.anIntArray452[arg2] -= 50;
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!tu", name = "a", descriptor = "(B)V")
	public static void method5129() {
		if (Static224.aBoolean370) {
			return;
		}
		if (Static126.aClass19_Sub1_1.aBoolean382) {
			Static336.aFloat72 = (int) Static336.aFloat72 + 47 & 0xFFFFFFF0;
		} else {
			Static286.aFloat68 += (12.0F - Static286.aFloat68) / 2.0F;
		}
		Static224.aBoolean370 = true;
		Static413.aBoolean582 = true;
	}
}
