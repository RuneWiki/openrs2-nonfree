import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!kb", name = "bb", descriptor = "J")
	public static long aLong94;

	@OriginalMember(owner = "client!kb", name = "cb", descriptor = "Lclient!ab;")
	public static Class3 aClass3_1;

	@OriginalMember(owner = "client!kb", name = "eb", descriptor = "Lclient!lf;")
	public static Class7 aClass7_9;

	@OriginalMember(owner = "client!kb", name = "lb", descriptor = "[I")
	public static int[] anIntArray266;

	@OriginalMember(owner = "client!kb", name = "N", descriptor = "[I")
	public static int[] anIntArray264 = new int[] { 1, 0, -1, 0 };

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "Lclient!fc;")
	private static Class25 aClass25_614 = Static78.method1313("You are standing in a members)2only area)3");

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "Lclient!fc;")
	public static Class25 aClass25_611 = aClass25_614;

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "Lclient!fc;")
	public static Class25 aClass25_612 = Static78.method1313("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

	@OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
	public static int anInt1383 = 0;

	@OriginalMember(owner = "client!kb", name = "V", descriptor = "Lclient!fc;")
	private static Class25 aClass25_613 = Static78.method1313("The server is being updated)3");

	@OriginalMember(owner = "client!kb", name = "X", descriptor = "[I")
	public static int[] anIntArray265 = new int[5];

	@OriginalMember(owner = "client!kb", name = "Y", descriptor = "Lclient!fc;")
	public static Class25 aClass25_615 = Static78.method1313("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!kb", name = "fb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_616 = Static78.method1313("m");

	@OriginalMember(owner = "client!kb", name = "gb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_617 = Static78.method1313("redstone3");

	@OriginalMember(owner = "client!kb", name = "ib", descriptor = "Lclient!fc;")
	public static Class25 aClass25_618 = aClass25_613;

	@OriginalMember(owner = "client!kb", name = "jb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_619 = Static78.method1313("Sprites geladen)3");

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public static void method1083(@OriginalArg(0) int arg0) {
		Static2.anInt37 += arg0 * 128;
		@Pc(31) int local31;
		if (Static2.anInt37 > Static80.anIntArray323.length) {
			Static2.anInt37 -= Static80.anIntArray323.length;
			local31 = (int) (Math.random() * 12.0D);
			Static127.method2042(Static52.aClass1_Sub2_Sub2_Sub4Array3[local31]);
		}
		@Pc(40) int local40 = arg0 * 128;
		local31 = 0;
		@Pc(49) int local49 = (256 - arg0) * 128;
		@Pc(74) int local74;
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			local74 = Static53.anIntArray430[local31 + local40] - Static80.anIntArray323[Static80.anIntArray323.length - 1 & local31 + Static2.anInt37] * arg0 / 6;
			if (local74 < 0) {
				local74 = 0;
			}
			Static53.anIntArray430[local31++] = local74;
		}
		@Pc(101) int local101;
		@Pc(103) int local103;
		@Pc(110) int local110;
		for (local74 = 256 - arg0; local74 < 256; local74++) {
			local101 = local74 * 128;
			for (local103 = 0; local103 < 128; local103++) {
				local110 = (int) (Math.random() * 100.0D);
				if (local110 < 50 && local103 > 10 && local103 < 118) {
					Static53.anIntArray430[local101 + local103] = 255;
				} else {
					Static53.anIntArray430[local103 + local101] = 0;
				}
			}
		}
		if (Static111.anInt2596 > 0) {
			Static111.anInt2596 -= arg0 * 4;
		}
		if (Static3.anInt64 > 0) {
			Static3.anInt64 -= arg0 * 4;
		}
		if (Static3.anInt64 == 0 && Static111.anInt2596 == 0) {
			local101 = (int) ((double) (2000 / arg0) * Math.random());
			if (local101 == 1) {
				Static111.anInt2596 = 1024;
			}
			if (local101 == 0) {
				Static3.anInt64 = 1024;
			}
		}
		for (local101 = 0; local101 < 256 - arg0; local101++) {
			Static35.anIntArray180[local101] = Static35.anIntArray180[local101 + arg0];
		}
		for (local103 = 256 - arg0; local103 < 256; local103++) {
			Static35.anIntArray180[local103] = (int) (Math.sin((double) Static68.anInt1476 / 14.0D) * 16.0D + Math.sin((double) Static68.anInt1476 / 15.0D) * 14.0D + Math.sin((double) Static68.anInt1476 / 16.0D) * 12.0D);
			Static68.anInt1476++;
		}
		Static88.anInt1986 += arg0;
		local110 = (arg0 + (Static60.anInt1366 & 0x1)) / 2;
		if (local110 <= 0) {
			return;
		}
		@Pc(307) int local307;
		@Pc(300) int local300;
		for (@Pc(291) int local291 = 0; local291 < Static88.anInt1986 * 100; local291++) {
			local300 = (int) (Math.random() * 128.0D) + 128;
			local307 = (int) (Math.random() * 124.0D) + 2;
			Static53.anIntArray430[local307 + (local300 << 7)] = 192;
		}
		Static88.anInt1986 = 0;
		@Pc(336) int local336;
		@Pc(341) int local341;
		for (local307 = 0; local307 < 256; local307++) {
			local336 = local307 * 128;
			local300 = 0;
			for (local341 = -local110; local341 < 128; local341++) {
				if (local110 + local341 < 128) {
					local300 += Static53.anIntArray430[local110 + local336 + local341];
				}
				if (local341 - local110 - 1 >= 0) {
					local300 -= Static53.anIntArray430[local341 + local336 - local110 - 1];
				}
				if (local341 >= 0) {
					Static122.anIntArray497[local341 + local336] = local300 / (local110 * 2 + 1);
				}
			}
		}
		for (local300 = 0; local300 < 128; local300++) {
			local336 = 0;
			for (local341 = -local110; local341 < 256; local341++) {
				@Pc(425) int local425 = local341 * 128;
				if (local341 + local110 < 256) {
					local336 += Static122.anIntArray497[local110 * 128 + local425 + local300];
				}
				if (local341 - local110 - 1 >= 0) {
					local336 -= Static122.anIntArray497[local425 + local300 - (local110 + 1) * 128];
				}
				if (local341 >= 0) {
					Static53.anIntArray430[local425 + local300] = local336 / (local110 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(Z)V")
	public static void method1084() {
		@Pc(12) int local12 = -1;
		if (Static80.anInt1774 == 0 && !Static84.aBoolean83) {
			Static80.method1365(Static10.anInt264, 21, 0, Static111.anInt2597, Static92.aClass25_985, Static33.aClass25_386);
		}
		for (@Pc(30) int local30 = 0; local30 < Static20.anInt575; local30++) {
			@Pc(36) int local36 = Static20.anIntArray133[local30];
			@Pc(40) int local40 = local36 & 0x7F;
			@Pc(46) int local46 = local36 >> 7 & 0x7F;
			@Pc(52) int local52 = local36 >> 29 & 0x3;
			@Pc(58) int local58 = local36 >> 14 & 0x7FFF;
			if (local36 != local12) {
				local12 = local36;
				@Pc(179) int local179;
				if (local52 == 2 && Static118.aClass4_1.method57(Static21.anInt596, local40, local46, local36) >= 0) {
					@Pc(81) Class1_Sub2_Sub6 local81 = Static78.method1315(local58);
					if (local81.anIntArray171 != null) {
						local81 = local81.method707();
					}
					if (local81 == null) {
						continue;
					}
					if (Static80.anInt1774 == 1) {
						Static80.method1365(local40, 24, local36, local46, Static116.method1859(new Class25[] { Static65.aClass25_670, Static106.aClass25_1171, local81.aClass25_359 }), Static42.aClass25_475);
					} else if (!Static84.aBoolean83) {
						@Pc(169) Class25[] local169 = local81.aClass25Array4;
						if (Static107.aBoolean112) {
							local169 = Static86.method1430(local169);
						}
						if (local169 != null) {
							for (local179 = 4; local179 >= 0; local179--) {
								if (local169[local179] != null) {
									@Pc(191) short local191 = 0;
									if (local179 == 0) {
										local191 = 17;
									}
									if (local179 == 1) {
										local191 = 43;
									}
									if (local179 == 2) {
										local191 = 1;
									}
									if (local179 == 3) {
										local191 = 52;
									}
									if (local179 == 4) {
										local191 = 1002;
									}
									Static80.method1365(local40, local191, local36, local46, Static116.method1859(new Class25[] { Static120.aClass25_1380, local81.aClass25_359 }), local169[local179]);
								}
							}
						}
						Static80.method1365(local40, 1001, local81.anInt858 << 14, local46, Static116.method1859(new Class25[] { Static120.aClass25_1380, local81.aClass25_359 }), Static37.aClass25_433);
					} else if ((Static94.anInt2162 & 0x4) == 4) {
						Static80.method1365(local40, 31, local36, local46, Static116.method1859(new Class25[] { Static89.aClass25_236, Static106.aClass25_1171, local81.aClass25_359 }), Static83.aClass25_888);
					}
				}
				@Pc(299) int local299;
				@Pc(307) Class1_Sub2_Sub3_Sub4_Sub1 local307;
				@Pc(350) Class1_Sub2_Sub3_Sub4_Sub2 local350;
				if (local52 == 1) {
					@Pc(274) Class1_Sub2_Sub3_Sub4_Sub1 local274 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local58];
					if (local274.aClass1_Sub2_Sub13_1.anInt1863 == 1 && (local274.anInt2832 & 0x7F) == 64 && (local274.anInt2827 & 0x7F) == 64) {
						for (local299 = 0; local299 < Static13.anInt383; local299++) {
							local307 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[Static106.anIntArray423[local299]];
							if (local307 != null && local307 != local274 && local307.aClass1_Sub2_Sub13_1.anInt1863 == 1 && local307.anInt2832 == local274.anInt2832 && local274.anInt2827 == local307.anInt2827) {
								Static38.method878(local40, local46, local307.aClass1_Sub2_Sub13_1, Static106.anIntArray423[local299]);
							}
						}
						for (local179 = 0; local179 < Static96.anInt2797; local179++) {
							local350 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[Static28.anIntArray150[local179]];
							if (local350 != null && local350.anInt2832 == local274.anInt2832 && local350.anInt2827 == local274.anInt2827) {
								Static83.method1405(local350, local46, local40, Static28.anIntArray150[local179]);
							}
						}
					}
					Static38.method878(local40, local46, local274.aClass1_Sub2_Sub13_1, local58);
				}
				if (local52 == 0) {
					@Pc(398) Class1_Sub2_Sub3_Sub4_Sub2 local398 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local58];
					if ((local398.anInt2832 & 0x7F) == 64 && (local398.anInt2827 & 0x7F) == 64) {
						for (local299 = 0; local299 < Static13.anInt383; local299++) {
							local307 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[Static106.anIntArray423[local299]];
							if (local307 != null && local307.aClass1_Sub2_Sub13_1.anInt1863 == 1 && local307.anInt2832 == local398.anInt2832 && local398.anInt2827 == local307.anInt2827) {
								Static38.method878(local40, local46, local307.aClass1_Sub2_Sub13_1, Static106.anIntArray423[local299]);
							}
						}
						for (local179 = 0; local179 < Static96.anInt2797; local179++) {
							local350 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[Static28.anIntArray150[local179]];
							if (local350 != null && local350 != local398 && local350.anInt2832 == local398.anInt2832 && local398.anInt2827 == local350.anInt2827) {
								Static83.method1405(local350, local46, local40, Static28.anIntArray150[local179]);
							}
						}
					}
					Static83.method1405(local398, local46, local40, local58);
				}
				if (local52 == 3) {
					@Pc(518) Class2 local518 = Static7.aClass2ArrayArrayArray1[Static21.anInt596][local40][local46];
					if (local518 != null) {
						for (@Pc(525) Class1_Sub2_Sub3_Sub3 local525 = (Class1_Sub2_Sub3_Sub3) local518.method29(); local525 != null; local525 = (Class1_Sub2_Sub3_Sub3) local518.method28()) {
							@Pc(532) Class1_Sub2_Sub16 local532 = Static33.method736(local525.anInt1448);
							if (Static80.anInt1774 == 1) {
								Static80.method1365(local40, 16, local525.anInt1448, local46, Static116.method1859(new Class25[] { Static65.aClass25_670, Static48.aClass25_507, local532.aClass25_1018 }), Static42.aClass25_475);
							} else if (!Static84.aBoolean83) {
								@Pc(544) Class25[] local544 = local532.aClass25Array18;
								if (Static107.aBoolean112) {
									local544 = Static86.method1430(local544);
								}
								for (@Pc(552) int local552 = 4; local552 >= 0; local552--) {
									if (local544 != null && local544[local552] != null) {
										@Pc(596) byte local596 = 0;
										if (local552 == 0) {
											local596 = 27;
										}
										if (local552 == 1) {
											local596 = 29;
										}
										if (local552 == 2) {
											local596 = 39;
										}
										if (local552 == 3) {
											local596 = 11;
										}
										if (local552 == 4) {
											local596 = 34;
										}
										Static80.method1365(local40, local596, local525.anInt1448, local46, Static116.method1859(new Class25[] { Static86.aClass25_937, local532.aClass25_1018 }), local544[local552]);
									} else if (local552 == 2) {
										Static80.method1365(local40, 39, local525.anInt1448, local46, Static116.method1859(new Class25[] { Static86.aClass25_937, local532.aClass25_1018 }), Static22.aClass25_343);
									}
								}
								Static80.method1365(local40, 1005, local525.anInt1448, local46, Static116.method1859(new Class25[] { Static86.aClass25_937, local532.aClass25_1018 }), Static37.aClass25_433);
							} else if ((Static94.anInt2162 & 0x1) == 1) {
								Static80.method1365(local40, 36, local525.anInt1448, local46, Static116.method1859(new Class25[] { Static89.aClass25_236, Static48.aClass25_507, local532.aClass25_1018 }), Static83.aClass25_888);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)I")
	public static int method1085(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static116.aByteArrayArrayArray7[arg2][arg0][arg1] & 0x8) == 0) {
			return arg2 <= 0 || (Static116.aByteArrayArrayArray7[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!oc;Lclient!oc;ILclient!oc;)V")
	public static void method1086(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Class56 arg1, @OriginalArg(3) Class56 arg2) {
		Static95.aClass56_67 = arg1;
		Static112.aClass56_82 = arg2;
		Static18.aClass56_17 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(Z)V")
	public static void method1087() {
		aClass25_619 = null;
		aClass25_618 = null;
		aClass7_9 = null;
		anIntArray265 = null;
		anIntArray264 = null;
		aClass25_612 = null;
		anIntArray266 = null;
		aClass3_1 = null;
		aClass25_616 = null;
		aClass25_613 = null;
		aClass25_615 = null;
		aClass25_611 = null;
		aClass25_614 = null;
		aClass25_617 = null;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(B)V")
	public static void method1090() {
		if (Static113.aString5.toLowerCase().indexOf("microsoft") != -1) {
			Static74.anIntArray295[220] = 74;
			Static74.anIntArray295[187] = 27;
			Static74.anIntArray295[190] = 72;
			Static74.anIntArray295[186] = 57;
			Static74.anIntArray295[189] = 26;
			Static74.anIntArray295[223] = 28;
			Static74.anIntArray295[221] = 43;
			Static74.anIntArray295[192] = 58;
			Static74.anIntArray295[222] = 59;
			Static74.anIntArray295[188] = 71;
			Static74.anIntArray295[219] = 42;
			Static74.anIntArray295[191] = 73;
			return;
		}
		Static74.anIntArray295[59] = 57;
		Static74.anIntArray295[92] = 74;
		Static74.anIntArray295[47] = 73;
		Static74.anIntArray295[45] = 26;
		Static74.anIntArray295[61] = 27;
		Static74.anIntArray295[91] = 42;
		Static74.anIntArray295[44] = 71;
		Static74.anIntArray295[46] = 72;
		if (Static113.aMethod1 == null) {
			Static74.anIntArray295[222] = 59;
			Static74.anIntArray295[192] = 58;
		} else {
			Static74.anIntArray295[520] = 59;
			Static74.anIntArray295[192] = 28;
			Static74.anIntArray295[222] = 58;
		}
		Static74.anIntArray295[93] = 43;
	}
}
