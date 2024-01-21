import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!db", name = "r", descriptor = "[S")
	public static short[] aShortArray1;

	@OriginalMember(owner = "client!db", name = "u", descriptor = "I")
	public static int anInt748;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	public static int anInt757;

	@OriginalMember(owner = "client!db", name = "v", descriptor = "Lclient!sd;")
	private static Class73 aClass73_432 = Static122.method531("Cancel");

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!sd;")
	public static Class73 aClass73_430 = aClass73_432;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "Lclient!sd;")
	public static Class73 aClass73_431 = Static122.method531("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public static int anInt749 = 0;

	@OriginalMember(owner = "client!db", name = "y", descriptor = "Lclient!sd;")
	public static Class73 aClass73_433 = Static122.method531("Bitte geben Sie Ihren Benutzenamen ein)3");

	@OriginalMember(owner = "client!db", name = "z", descriptor = "I")
	public static int anInt751 = 0;

	@OriginalMember(owner = "client!db", name = "B", descriptor = "I")
	public static int anInt753 = 0;

	@OriginalMember(owner = "client!db", name = "d", descriptor = "(I)V")
	public static void method564() {
		aClass73_431 = null;
		aClass73_430 = null;
		aShortArray1 = null;
		aClass73_432 = null;
		aClass73_433 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZIIII)V")
	public static void method565(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static4.anInt71 == 0 && !Static159.aBoolean233) {
			Static63.method1125(0, arg2 - arg1, Static42.aClass73_283, Static173.aClass73_2030, 39, arg0 - arg3);
		}
		@Pc(31) int local31 = -1;
		for (@Pc(33) int local33 = 0; local33 < Static114.anInt2430; local33++) {
			@Pc(41) int local41 = Static114.anIntArray250[local33];
			@Pc(45) int local45 = local41 & 0x7F;
			@Pc(51) int local51 = local41 >> 7 & 0x7F;
			@Pc(57) int local57 = local41 >> 29 & 0x3;
			@Pc(63) int local63 = local41 >> 14 & 0x7FFF;
			if (local41 != local31) {
				local31 = local41;
				@Pc(188) int local188;
				if (local57 == 2 && Static119.aClass35_1.method1130(Static147.anInt3309, local45, local51, local41) >= 0) {
					@Pc(84) Class3_Sub1_Sub15 local84 = Static151.method2466(local63);
					if (local84.anIntArray314 != null) {
						local84 = local84.method2191();
					}
					if (local84 == null) {
						continue;
					}
					if (Static4.anInt71 == 1) {
						Static63.method1125(local41, local45, Static63.aClass73_815, Static19.method372(new Class73[] { Static122.aClass73_397, Static87.aClass73_1065, local84.aClass73_1683 }), 25, local51);
					} else if (!Static159.aBoolean233) {
						@Pc(178) Class73[] local178 = local84.aClass73Array20;
						if (Static125.aBoolean192) {
							local178 = Static149.method2458(local178);
						}
						if (local178 != null) {
							for (local188 = 4; local188 >= 0; local188--) {
								if (local178[local188] != null) {
									@Pc(196) short local196 = 0;
									if (local188 == 0) {
										local196 = 17;
									}
									if (local188 == 1) {
										local196 = 42;
									}
									if (local188 == 2) {
										local196 = 28;
									}
									if (local188 == 3) {
										local196 = 57;
									}
									if (local188 == 4) {
										local196 = 1005;
									}
									Static63.method1125(local41, local45, local178[local188], Static19.method372(new Class73[] { Static37.aClass73_532, local84.aClass73_1683 }), local196, local51);
								}
							}
						}
						Static63.method1125(local84.anInt3031 << 14, local45, Static4.aClass73_52, Static19.method372(new Class73[] { Static37.aClass73_532, local84.aClass73_1683 }), 1001, local51);
					} else if ((Static44.anInt1025 & 0x4) == 4) {
						Static63.method1125(local41, local45, Static90.aClass73_1133, Static19.method372(new Class73[] { Static39.aClass73_541, Static87.aClass73_1065, local84.aClass73_1683 }), 49, local51);
					}
				}
				@Pc(306) int local306;
				@Pc(314) Class3_Sub1_Sub4_Sub7_Sub2 local314;
				@Pc(363) Class3_Sub1_Sub4_Sub7_Sub1 local363;
				if (local57 == 1) {
					@Pc(285) Class3_Sub1_Sub4_Sub7_Sub2 local285 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local63];
					if (local285.aClass3_Sub1_Sub10_1.anInt1556 == 1 && (local285.anInt3169 & 0x7F) == 64 && (local285.anInt3159 & 0x7F) == 64) {
						for (local306 = 0; local306 < Static86.anInt1943; local306++) {
							local314 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[Static52.anIntArray132[local306]];
							if (local314 != null && local314 != local285 && local314.aClass3_Sub1_Sub10_1.anInt1556 == 1 && local285.anInt3169 == local314.anInt3169 && local285.anInt3159 == local314.anInt3159) {
								Static102.method1778(local45, local314.aClass3_Sub1_Sub10_1, Static52.anIntArray132[local306], local51);
							}
						}
						for (local188 = 0; local188 < Static6.anInt158; local188++) {
							local363 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[Static47.anIntArray184[local188]];
							if (local363 != null && local285.anInt3169 == local363.anInt3169 && local363.anInt3159 == local285.anInt3159) {
								Static23.method499(local363, local45, local51, Static47.anIntArray184[local188]);
							}
						}
					}
					Static102.method1778(local45, local285.aClass3_Sub1_Sub10_1, local63, local51);
				}
				if (local57 == 0) {
					@Pc(404) Class3_Sub1_Sub4_Sub7_Sub1 local404 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local63];
					if ((local404.anInt3169 & 0x7F) == 64 && (local404.anInt3159 & 0x7F) == 64) {
						for (local306 = 0; local306 < Static86.anInt1943; local306++) {
							local314 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[Static52.anIntArray132[local306]];
							if (local314 != null && local314.aClass3_Sub1_Sub10_1.anInt1556 == 1 && local314.anInt3169 == local404.anInt3169 && local314.anInt3159 == local404.anInt3159) {
								Static102.method1778(local45, local314.aClass3_Sub1_Sub10_1, Static52.anIntArray132[local306], local51);
							}
						}
						for (local188 = 0; local188 < Static6.anInt158; local188++) {
							local363 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[Static47.anIntArray184[local188]];
							if (local363 != null && local363 != local404 && local404.anInt3169 == local363.anInt3169 && local363.anInt3159 == local404.anInt3159) {
								Static23.method499(local363, local45, local51, Static47.anIntArray184[local188]);
							}
						}
					}
					Static23.method499(local404, local45, local51, local63);
				}
				if (local57 == 3) {
					@Pc(520) Class72 local520 = Static99.aClass72ArrayArrayArray1[Static147.anInt3309][local45][local51];
					if (local520 != null) {
						for (@Pc(527) Class3_Sub1_Sub4_Sub2 local527 = (Class3_Sub1_Sub4_Sub2) local520.method2403(); local527 != null; local527 = (Class3_Sub1_Sub4_Sub2) local520.method2398()) {
							@Pc(534) Class3_Sub1_Sub7 local534 = Static3.method42(local527.anInt813);
							if (Static4.anInt71 == 1) {
								Static63.method1125(local527.anInt813, local45, Static63.aClass73_815, Static19.method372(new Class73[] { Static122.aClass73_397, Static141.aClass73_1787, local534.aClass73_680 }), 19, local51);
							} else if (!Static159.aBoolean233) {
								@Pc(548) Class73[] local548 = local534.aClass73Array8;
								if (Static125.aBoolean192) {
									local548 = Static149.method2458(local548);
								}
								for (@Pc(556) int local556 = 4; local556 >= 0; local556--) {
									if (local548 != null && local548[local556] != null) {
										@Pc(570) byte local570 = 0;
										if (local556 == 0) {
											local570 = 37;
										}
										if (local556 == 1) {
											local570 = 20;
										}
										if (local556 == 2) {
											local570 = 8;
										}
										if (local556 == 3) {
											local570 = 5;
										}
										if (local556 == 4) {
											local570 = 12;
										}
										Static63.method1125(local527.anInt813, local45, local548[local556], Static19.method372(new Class73[] { Static32.aClass73_480, local534.aClass73_680 }), local570, local51);
									} else if (local556 == 2) {
										Static63.method1125(local527.anInt813, local45, Static160.aClass73_1903, Static19.method372(new Class73[] { Static32.aClass73_480, local534.aClass73_680 }), 8, local51);
									}
								}
								Static63.method1125(local527.anInt813, local45, Static4.aClass73_52, Static19.method372(new Class73[] { Static32.aClass73_480, local534.aClass73_680 }), 1006, local51);
							} else if ((Static44.anInt1025 & 0x1) == 1) {
								Static63.method1125(local527.anInt813, local45, Static90.aClass73_1133, Static19.method372(new Class73[] { Static39.aClass73_541, Static141.aClass73_1787, local534.aClass73_680 }), 58, local51);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(II)V")
	public static void method566(@OriginalArg(1) int arg0) {
		Static75.anInt1671 += arg0 * 128;
		@Pc(31) int local31;
		if (Static75.anInt1671 > Static37.anIntArray92.length) {
			Static75.anInt1671 -= Static37.anIntArray92.length;
			local31 = (int) (Math.random() * 12.0D);
			Static120.method2093(Static47.aClass3_Sub1_Sub3_Sub3Array19[local31]);
		}
		local31 = 0;
		@Pc(42) int local42 = arg0 * 128;
		@Pc(48) int local48 = (256 - arg0) * 128;
		@Pc(74) int local74;
		for (@Pc(50) int local50 = 0; local50 < local48; local50++) {
			local74 = Static17.anIntArray397[local42 + local31] - Static37.anIntArray92[local31 + Static75.anInt1671 & Static37.anIntArray92.length + -1] * arg0 / 6;
			if (local74 < 0) {
				local74 = 0;
			}
			Static17.anIntArray397[local31++] = local74;
		}
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		for (local74 = 256 - arg0; local74 < 256; local74++) {
			local105 = local74 * 128;
			for (local107 = 0; local107 < 128; local107++) {
				local114 = (int) (Math.random() * 100.0D);
				if (local114 < 50 && local107 > 10 && local107 < 118) {
					Static17.anIntArray397[local105 + local107] = 255;
				} else {
					Static17.anIntArray397[local107 + local105] = 0;
				}
			}
		}
		if (Static137.anInt3103 > 0) {
			Static137.anInt3103 -= arg0 * 4;
		}
		if (Static76.anInt1684 > 0) {
			Static76.anInt1684 -= arg0 * 4;
		}
		if (Static76.anInt1684 == 0 && Static137.anInt3103 == 0) {
			local105 = (int) (Math.random() * (double) (2000 / arg0));
			if (local105 == 0) {
				Static76.anInt1684 = 1024;
			}
			if (local105 == 1) {
				Static137.anInt3103 = 1024;
			}
		}
		for (local105 = 0; local105 < 256 - arg0; local105++) {
			Static172.anIntArray398[local105] = Static172.anIntArray398[local105 + arg0];
		}
		for (local107 = 256 - arg0; local107 < 256; local107++) {
			Static172.anIntArray398[local107] = (int) (Math.sin((double) Static157.anInt3464 / 14.0D) * 16.0D + Math.sin((double) Static157.anInt3464 / 15.0D) * 14.0D + Math.sin((double) Static157.anInt3464 / 16.0D) * 12.0D);
			Static157.anInt3464++;
		}
		local114 = (arg0 + (Static44.anInt1024 & 0x1)) / 2;
		Static56.anInt1324 += arg0;
		if (local114 <= 0) {
			return;
		}
		@Pc(296) int local296;
		@Pc(303) int local303;
		for (@Pc(287) int local287 = 0; local287 < Static56.anInt1324 * 100; local287++) {
			local296 = (int) (Math.random() * 124.0D) + 2;
			local303 = (int) (Math.random() * 128.0D) + 128;
			Static17.anIntArray397[(local303 << 7) + local296] = 192;
		}
		Static56.anInt1324 = 0;
		@Pc(331) int local331;
		@Pc(336) int local336;
		for (local296 = 0; local296 < 256; local296++) {
			local331 = local296 * 128;
			local303 = 0;
			for (local336 = -local114; local336 < 128; local336++) {
				if (local114 + local336 < 128) {
					local303 += Static17.anIntArray397[local331 + local336 + local114];
				}
				if (local336 - local114 - 1 >= 0) {
					local303 -= Static17.anIntArray397[local336 + local331 - local114 - 1];
				}
				if (local336 >= 0) {
					Static2.anIntArray2[local331 + local336] = local303 / (local114 * 2 + 1);
				}
			}
		}
		for (local303 = 0; local303 < 128; local303++) {
			local331 = 0;
			for (local336 = -local114; local336 < 256; local336++) {
				@Pc(411) int local411 = local336 * 128;
				if (local336 + local114 < 256) {
					local331 += Static2.anIntArray2[local114 * 128 + local411 + local303];
				}
				if (local336 - local114 - 1 >= 0) {
					local331 -= Static2.anIntArray2[local411 + local303 - (local114 + 1) * 128];
				}
				if (local336 >= 0) {
					Static17.anIntArray397[local303 + local411] = local331 / (local114 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IZ)V")
	public static void method567(@OriginalArg(1) boolean arg0) {
		Static47.aBoolean115 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(33) int local33;
		@Pc(39) int local39;
		@Pc(43) int local43;
		@Pc(75) int local75;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(149) int local149;
		if (!Static47.aBoolean115) {
			local17 = Static159.aClass3_Sub12_Sub1_4.method1352();
			local21 = Static159.aClass3_Sub12_Sub1_4.method1381();
			local25 = Static159.aClass3_Sub12_Sub1_4.method1347();
			local33 = (Static17.anInt3783 - Static159.aClass3_Sub12_Sub1_4.anInt1793) / 16;
			Static88.anIntArrayArray17 = new int[local33][4];
			for (local39 = 0; local39 < local33; local39++) {
				for (local43 = 0; local43 < 4; local43++) {
					Static88.anIntArrayArray17[local39][local43] = Static159.aClass3_Sub12_Sub1_4.method1349();
				}
			}
			local43 = Static159.aClass3_Sub12_Sub1_4.method1359();
			local75 = Static159.aClass3_Sub12_Sub1_4.method1377();
			Static82.anIntArray187 = new int[local33];
			@Pc(80) boolean local80 = false;
			Static122.anIntArray71 = new int[local33];
			if ((local17 / 8 == 48 || local17 / 8 == 49) && local75 / 8 == 48) {
				local80 = true;
			}
			Static173.aByteArrayArray12 = new byte[local33][];
			Static170.aByteArrayArray11 = new byte[local33][];
			if (local17 / 8 == 48 && local75 / 8 == 148) {
				local80 = true;
			}
			Static151.anIntArray366 = new int[local33];
			local33 = 0;
			for (local133 = (local17 - 6) / 8; local133 <= (local17 + 6) / 8; local133++) {
				for (local141 = (local75 - 6) / 8; local141 <= (local75 + 6) / 8; local141++) {
					local149 = local141 + (local133 << 8);
					if (!local80 || local141 != 49 && local141 != 149 && local141 != 147 && local133 != 50 && (local133 != 49 || local141 != 47)) {
						Static82.anIntArray187[local33] = local149;
						Static151.anIntArray366[local33] = Static125.aClass13_Sub1_15.method359(Static19.method372(new Class73[] { Static31.aClass73_473, Static154.method2485(local133), Static42.aClass73_286, Static154.method2485(local141) }));
						Static122.anIntArray71[local33] = Static125.aClass13_Sub1_15.method359(Static19.method372(new Class73[] { Static87.aClass73_1067, Static154.method2485(local133), Static42.aClass73_286, Static154.method2485(local141) }));
						local33++;
					}
				}
			}
			Static53.method2793(local43, local25, local21, local17, local75);
			return;
		}
		local17 = Static159.aClass3_Sub12_Sub1_4.method1381();
		local21 = Static159.aClass3_Sub12_Sub1_4.method1381();
		local25 = Static159.aClass3_Sub12_Sub1_4.method1377();
		local33 = Static159.aClass3_Sub12_Sub1_4.method1352();
		Static159.aClass3_Sub12_Sub1_4.method1398();
		@Pc(306) int local306;
		for (local39 = 0; local39 < 4; local39++) {
			for (local43 = 0; local43 < 13; local43++) {
				for (local75 = 0; local75 < 13; local75++) {
					local306 = Static159.aClass3_Sub12_Sub1_4.method1403(1);
					if (local306 == 1) {
						Static159.anIntArrayArrayArray8[local39][local43][local75] = Static159.aClass3_Sub12_Sub1_4.method1403(26);
					} else {
						Static159.anIntArrayArrayArray8[local39][local43][local75] = -1;
					}
				}
			}
		}
		Static159.aClass3_Sub12_Sub1_4.method1406();
		local43 = (Static17.anInt3783 - Static159.aClass3_Sub12_Sub1_4.anInt1793) / 16;
		Static88.anIntArrayArray17 = new int[local43][4];
		for (local75 = 0; local75 < local43; local75++) {
			for (local306 = 0; local306 < 4; local306++) {
				Static88.anIntArrayArray17[local75][local306] = Static159.aClass3_Sub12_Sub1_4.method1373();
			}
		}
		local306 = Static159.aClass3_Sub12_Sub1_4.method1378();
		Static82.anIntArray187 = new int[local43];
		Static151.anIntArray366 = new int[local43];
		Static173.aByteArrayArray12 = new byte[local43][];
		Static122.anIntArray71 = new int[local43];
		Static170.aByteArrayArray11 = new byte[local43][];
		local43 = 0;
		for (local133 = 0; local133 < 4; local133++) {
			for (local141 = 0; local141 < 13; local141++) {
				for (local149 = 0; local149 < 13; local149++) {
					@Pc(426) int local426 = Static159.anIntArrayArrayArray8[local133][local141][local149];
					if (local426 != -1) {
						@Pc(435) int local435 = local426 >> 14 & 0x3FF;
						@Pc(441) int local441 = local426 >> 3 & 0x7FF;
						@Pc(451) int local451 = local441 / 8 + (local435 / 8 << 8);
						for (@Pc(453) int local453 = 0; local453 < local43; local453++) {
							if (Static82.anIntArray187[local453] == local451) {
								local451 = -1;
								break;
							}
						}
						if (local451 != -1) {
							Static82.anIntArray187[local43] = local451;
							@Pc(484) int local484 = local451 & 0xFF;
							@Pc(490) int local490 = local451 >> 8 & 0xFF;
							Static151.anIntArray366[local43] = Static125.aClass13_Sub1_15.method359(Static19.method372(new Class73[] { Static31.aClass73_473, Static154.method2485(local490), Static42.aClass73_286, Static154.method2485(local484) }));
							Static122.anIntArray71[local43] = Static125.aClass13_Sub1_15.method359(Static19.method372(new Class73[] { Static87.aClass73_1067, Static154.method2485(local490), Static42.aClass73_286, Static154.method2485(local484) }));
							local43++;
						}
					}
				}
			}
		}
		Static53.method2793(local33, local306, local17, local25, local21);
	}
}
