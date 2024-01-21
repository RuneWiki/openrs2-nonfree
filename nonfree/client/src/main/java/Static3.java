import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ad", name = "G", descriptor = "Lclient!pb;")
	public static Class31 aClass31_1;

	@OriginalMember(owner = "client!ad", name = "J", descriptor = "I")
	public static int anInt117;

	@OriginalMember(owner = "client!ad", name = "K", descriptor = "I")
	public static int anInt118;

	@OriginalMember(owner = "client!ad", name = "L", descriptor = "Lclient!j;")
	public static Class1_Sub1_Sub1_Sub3 aClass1_Sub1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!ad", name = "M", descriptor = "Lclient!mc;")
	private static Class42 aClass42_83 = Static23.method501("Unable to find ");

	@OriginalMember(owner = "client!ad", name = "v", descriptor = "Lclient!mc;")
	public static Class42 aClass42_79 = aClass42_83;

	@OriginalMember(owner = "client!ad", name = "x", descriptor = "I")
	public static int anInt113 = 0;

	@OriginalMember(owner = "client!ad", name = "z", descriptor = "[I")
	public static int[] anIntArray16 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!ad", name = "R", descriptor = "Lclient!mc;")
	private static Class42 aClass42_85 = Static23.method501(" ");

	@OriginalMember(owner = "client!ad", name = "E", descriptor = "Lclient!mc;")
	public static Class42 aClass42_81 = aClass42_85;

	@OriginalMember(owner = "client!ad", name = "H", descriptor = "Lclient!mc;")
	public static Class42 aClass42_82 = Static23.method501("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!ad", name = "N", descriptor = "I")
	public static int anInt119 = 0;

	@OriginalMember(owner = "client!ad", name = "P", descriptor = "I")
	public static int anInt120 = 0;

	@OriginalMember(owner = "client!ad", name = "Q", descriptor = "Lclient!mc;")
	private static Class42 aClass42_84 = Static23.method501("Loaded update list");

	@OriginalMember(owner = "client!ad", name = "S", descriptor = "Lclient!mc;")
	public static Class42 aClass42_86 = aClass42_84;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(JI)V")
	public static void method98(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static8.anInt239 >= 100 && Static24.anInt717 != 1 || Static8.anInt239 >= 200) {
			Static24.method509(Static11.aClass42_195, 0, Static82.aClass42_1167);
			return;
		}
		@Pc(35) Class42 local35 = Static64.method1096(arg0).method1058();
		for (@Pc(37) int local37 = 0; local37 < Static8.anInt239; local37++) {
			if (Static87.aLongArray5[local37] == arg0) {
				Static24.method509(Static11.aClass42_195, 0, Static57.method1822(new Class42[] { local35, Static101.aClass42_1397 }));
				return;
			}
		}
		for (@Pc(70) int local70 = 0; local70 < Static1.anInt1; local70++) {
			if (arg0 == Static37.aLongArray2[local70]) {
				Static24.method509(Static11.aClass42_195, 0, Static57.method1822(new Class42[] { Static81.aClass42_1138, local35, Static5.aClass42_93 }));
				return;
			}
		}
		if (local35.method1041(Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.aClass42_1396)) {
			return;
		}
		Static8.aClass42Array3[Static8.anInt239] = local35;
		Static87.aLongArray5[Static8.anInt239] = arg0;
		Static109.anIntArray408[Static8.anInt239] = 0;
		Static89.aBoolean132 = true;
		Static8.anInt239++;
		Static98.aClass1_Sub8_Sub1_3.method1236(165);
		Static98.aClass1_Sub8_Sub1_3.method1193(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(BILclient!ba;IIIIILclient!ed;)V")
	public static void method99(@OriginalArg(1) int arg0, @OriginalArg(2) Class6 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class20 arg7) {
		if (Static75.aBoolean85 && (Static61.aByteArrayArrayArray7[0][arg3][arg2] & 0x2) == 0) {
			if ((Static61.aByteArrayArrayArray7[arg5][arg3][arg2] & 0x10) != 0) {
				return;
			}
			if (Static33.method577(arg5, arg3, arg2) != Static21.anInt663) {
				return;
			}
		}
		if (arg5 < Static75.anInt1419) {
			Static75.anInt1419 = arg5;
		}
		@Pc(53) int local53 = Static10.anIntArrayArrayArray1[arg5][arg3][arg2];
		@Pc(65) int local65 = Static10.anIntArrayArrayArray1[arg5][arg3 + 1][arg2 + 1];
		@Pc(75) int local75 = Static10.anIntArrayArrayArray1[arg5][arg3][arg2 + 1];
		@Pc(85) int local85 = Static10.anIntArrayArrayArray1[arg5][arg3 + 1][arg2];
		@Pc(95) int local95 = local75 + local85 + local53 + local65 >> 2;
		@Pc(99) Class1_Sub1_Sub9 local99 = Static42.method1755(arg6);
		@Pc(111) int local111 = (arg6 << 14) + arg3 + (arg2 << 7) + 1073741824;
		if (local99.anInt1272 == 0) {
			local111 += Integer.MIN_VALUE;
		}
		@Pc(127) int local127 = (arg4 << 6) + arg0;
		if (local99.anInt1250 == 1) {
			local127 += 256;
		}
		if (local99.method885()) {
			Static54.method990(arg3, arg5, arg4, local99, arg2);
		}
		@Pc(174) Class1_Sub1_Sub8 local174;
		if (arg0 != 22) {
			@Pc(268) int local268;
			if (arg0 == 10 || arg0 == 11) {
				if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
					local174 = local99.method881(local75, local85, local65, local53, arg4, 10);
				} else {
					local174 = new Class1_Sub1_Sub8_Sub6(arg6, 10, arg4, local53, local85, local65, local75, local99.anInt1252, true);
				}
				if (local174 != null) {
					@Pc(271) int local271;
					if (arg4 == 1 || arg4 == 3) {
						local268 = local99.anInt1276;
						local271 = local99.anInt1279;
					} else {
						local268 = local99.anInt1279;
						local271 = local99.anInt1276;
					}
					@Pc(281) int local281 = 0;
					if (arg0 == 11) {
						local281 += 256;
					}
					if (arg7.method472(arg5, arg3, arg2, local95, local268, local271, local174, local281, local111, local127) && local99.aBoolean74) {
						@Pc(309) Class1_Sub1_Sub8_Sub3 local309;
						if (local174 instanceof Class1_Sub1_Sub8_Sub3) {
							local309 = (Class1_Sub1_Sub8_Sub3) local174;
						} else {
							local309 = local99.method881(local75, local85, local65, local53, arg4, 10);
						}
						if (local309 != null) {
							for (@Pc(325) int local325 = 0; local325 <= local268; local325++) {
								for (@Pc(329) int local329 = 0; local329 <= local271; local329++) {
									@Pc(336) int local336 = local309.method1391() / 4;
									if (local336 > 30) {
										local336 = 30;
									}
									if (local336 > Static52.aByteArrayArrayArray6[arg5][arg3 + local325][local329 + arg2]) {
										Static52.aByteArrayArrayArray6[arg5][local325 + arg3][local329 + arg2] = (byte) local336;
									}
								}
							}
						}
					}
				}
				if (local99.aBoolean75 && arg1 != null) {
					arg1.method112(arg2, arg3, local99.anInt1279, local99.aBoolean71, arg4, local99.anInt1276);
				}
			} else if (arg0 >= 12) {
				if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
					local174 = local99.method881(local75, local85, local65, local53, arg4, arg0);
				} else {
					local174 = new Class1_Sub1_Sub8_Sub6(arg6, arg0, arg4, local53, local85, local65, local75, local99.anInt1252, true);
				}
				arg7.method472(arg5, arg3, arg2, local95, 1, 1, local174, 0, local111, local127);
				if (arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg5 > 0) {
					Static52.anIntArrayArrayArray7[arg5][arg3][arg2] |= 0x924;
				}
				if (local99.aBoolean75 && arg1 != null) {
					arg1.method112(arg2, arg3, local99.anInt1279, local99.aBoolean71, arg4, local99.anInt1276);
				}
			} else if (arg0 == 0) {
				if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
					local174 = local99.method881(local75, local85, local65, local53, arg4, 0);
				} else {
					local174 = new Class1_Sub1_Sub8_Sub6(arg6, 0, arg4, local53, local85, local65, local75, local99.anInt1252, true);
				}
				arg7.method497(arg5, arg3, arg2, local95, local174, null, anIntArray16[arg4], 0, local111, local127);
				if (arg4 == 0) {
					if (local99.aBoolean74) {
						Static52.aByteArrayArrayArray6[arg5][arg3][arg2] = 50;
						Static52.aByteArrayArrayArray6[arg5][arg3][arg2 + 1] = 50;
					}
					if (local99.aBoolean72) {
						Static52.anIntArrayArrayArray7[arg5][arg3][arg2] |= 0x249;
					}
				} else if (arg4 == 1) {
					if (local99.aBoolean74) {
						Static52.aByteArrayArrayArray6[arg5][arg3][arg2 + 1] = 50;
						Static52.aByteArrayArrayArray6[arg5][arg3 + 1][arg2 + 1] = 50;
					}
					if (local99.aBoolean72) {
						Static52.anIntArrayArrayArray7[arg5][arg3][arg2 + 1] |= 0x492;
					}
				} else if (arg4 == 2) {
					if (local99.aBoolean74) {
						Static52.aByteArrayArrayArray6[arg5][arg3 + 1][arg2] = 50;
						Static52.aByteArrayArrayArray6[arg5][arg3 + 1][arg2 + 1] = 50;
					}
					if (local99.aBoolean72) {
						Static52.anIntArrayArrayArray7[arg5][arg3 + 1][arg2] |= 0x249;
					}
				} else if (arg4 == 3) {
					if (local99.aBoolean74) {
						Static52.aByteArrayArrayArray6[arg5][arg3][arg2] = 50;
						Static52.aByteArrayArrayArray6[arg5][arg3 + 1][arg2] = 50;
					}
					if (local99.aBoolean72) {
						Static52.anIntArrayArrayArray7[arg5][arg3][arg2] |= 0x492;
					}
				}
				if (local99.aBoolean75 && arg1 != null) {
					arg1.method124(arg4, arg0, arg3, local99.aBoolean71, arg2);
				}
				if (local99.anInt1264 != 16) {
					arg7.method454(arg5, arg3, arg2, local99.anInt1264);
				}
			} else if (arg0 == 1) {
				if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
					local174 = local99.method881(local75, local85, local65, local53, arg4, 1);
				} else {
					local174 = new Class1_Sub1_Sub8_Sub6(arg6, 1, arg4, local53, local85, local65, local75, local99.anInt1252, true);
				}
				arg7.method497(arg5, arg3, arg2, local95, local174, null, Static28.anIntArray94[arg4], 0, local111, local127);
				if (local99.aBoolean74) {
					if (arg4 == 0) {
						Static52.aByteArrayArrayArray6[arg5][arg3][arg2 + 1] = 50;
					} else if (arg4 == 1) {
						Static52.aByteArrayArrayArray6[arg5][arg3 + 1][arg2 + 1] = 50;
					} else if (arg4 == 2) {
						Static52.aByteArrayArrayArray6[arg5][arg3 + 1][arg2] = 50;
					} else if (arg4 == 3) {
						Static52.aByteArrayArrayArray6[arg5][arg3][arg2] = 50;
					}
				}
				if (local99.aBoolean75 && arg1 != null) {
					arg1.method124(arg4, arg0, arg3, local99.aBoolean71, arg2);
				}
			} else {
				@Pc(920) int local920;
				@Pc(949) Class1_Sub1_Sub8 local949;
				if (arg0 == 2) {
					local920 = arg4 + 1 & 0x3;
					@Pc(939) Class1_Sub1_Sub8 local939;
					if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
						local939 = local99.method881(local75, local85, local65, local53, arg4 + 4, 2);
						local949 = local99.method881(local75, local85, local65, local53, local920, 2);
					} else {
						local939 = new Class1_Sub1_Sub8_Sub6(arg6, 2, arg4 + 4, local53, local85, local65, local75, local99.anInt1252, true);
						local949 = new Class1_Sub1_Sub8_Sub6(arg6, 2, local920, local53, local85, local65, local75, local99.anInt1252, true);
					}
					arg7.method497(arg5, arg3, arg2, local95, local939, local949, anIntArray16[arg4], anIntArray16[local920], local111, local127);
					if (local99.aBoolean72) {
						if (arg4 == 0) {
							Static52.anIntArrayArrayArray7[arg5][arg3][arg2] |= 0x249;
							Static52.anIntArrayArrayArray7[arg5][arg3][arg2 + 1] |= 0x492;
						} else if (arg4 == 1) {
							Static52.anIntArrayArrayArray7[arg5][arg3][arg2 + 1] |= 0x492;
							Static52.anIntArrayArrayArray7[arg5][arg3 + 1][arg2] |= 0x249;
						} else if (arg4 == 2) {
							Static52.anIntArrayArrayArray7[arg5][arg3 + 1][arg2] |= 0x249;
							Static52.anIntArrayArrayArray7[arg5][arg3][arg2] |= 0x492;
						} else if (arg4 == 3) {
							Static52.anIntArrayArrayArray7[arg5][arg3][arg2] |= 0x492;
							Static52.anIntArrayArrayArray7[arg5][arg3][arg2] |= 0x249;
						}
					}
					if (local99.aBoolean75 && arg1 != null) {
						arg1.method124(arg4, arg0, arg3, local99.aBoolean71, arg2);
					}
					if (local99.anInt1264 != 16) {
						arg7.method454(arg5, arg3, arg2, local99.anInt1264);
					}
				} else if (arg0 == 3) {
					if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
						local174 = local99.method881(local75, local85, local65, local53, arg4, 3);
					} else {
						local174 = new Class1_Sub1_Sub8_Sub6(arg6, 3, arg4, local53, local85, local65, local75, local99.anInt1252, true);
					}
					arg7.method497(arg5, arg3, arg2, local95, local174, null, Static28.anIntArray94[arg4], 0, local111, local127);
					if (local99.aBoolean74) {
						if (arg4 == 0) {
							Static52.aByteArrayArrayArray6[arg5][arg3][arg2 + 1] = 50;
						} else if (arg4 == 1) {
							Static52.aByteArrayArrayArray6[arg5][arg3 + 1][arg2 + 1] = 50;
						} else if (arg4 == 2) {
							Static52.aByteArrayArrayArray6[arg5][arg3 + 1][arg2] = 50;
						} else if (arg4 == 3) {
							Static52.aByteArrayArrayArray6[arg5][arg3][arg2] = 50;
						}
					}
					if (local99.aBoolean75 && arg1 != null) {
						arg1.method124(arg4, arg0, arg3, local99.aBoolean71, arg2);
					}
				} else if (arg0 == 9) {
					if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
						local174 = local99.method881(local75, local85, local65, local53, arg4, arg0);
					} else {
						local174 = new Class1_Sub1_Sub8_Sub6(arg6, arg0, arg4, local53, local85, local65, local75, local99.anInt1252, true);
					}
					arg7.method472(arg5, arg3, arg2, local95, 1, 1, local174, 0, local111, local127);
					if (local99.aBoolean75 && arg1 != null) {
						arg1.method112(arg2, arg3, local99.anInt1279, local99.aBoolean71, arg4, local99.anInt1276);
					}
				} else {
					if (local99.aBoolean73) {
						if (arg4 == 1) {
							local920 = local75;
							local75 = local65;
							local65 = local85;
							local85 = local53;
							local53 = local920;
						} else if (arg4 == 2) {
							local920 = local75;
							local75 = local85;
							local85 = local920;
							local920 = local65;
							local65 = local53;
							local53 = local920;
						} else if (arg4 == 3) {
							local920 = local75;
							local75 = local53;
							local53 = local85;
							local85 = local65;
							local65 = local920;
						}
					}
					if (arg0 == 4) {
						if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
							local174 = local99.method881(local75, local85, local65, local53, 0, 4);
						} else {
							local174 = new Class1_Sub1_Sub8_Sub6(arg6, 4, 0, local53, local85, local65, local75, local99.anInt1252, true);
						}
						arg7.method482(arg5, arg3, arg2, local95, local174, anIntArray16[arg4], arg4 * 512, 0, 0, local111, local127);
					} else if (arg0 == 5) {
						local920 = 16;
						local268 = arg7.method474(arg5, arg3, arg2);
						if (local268 > 0) {
							local920 = Static42.method1755(local268 >> 14 & 0x7FFF).anInt1264;
						}
						if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
							local949 = local99.method881(local75, local85, local65, local53, 0, 4);
						} else {
							local949 = new Class1_Sub1_Sub8_Sub6(arg6, 4, 0, local53, local85, local65, local75, local99.anInt1252, true);
						}
						arg7.method482(arg5, arg3, arg2, local95, local949, anIntArray16[arg4], arg4 * 512, Static52.anIntArray208[arg4] * local920, Static97.anIntArray373[arg4] * local920, local111, local127);
					} else if (arg0 == 6) {
						if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
							local174 = local99.method881(local75, local85, local65, local53, 0, 4);
						} else {
							local174 = new Class1_Sub1_Sub8_Sub6(arg6, 4, 0, local53, local85, local65, local75, local99.anInt1252, true);
						}
						arg7.method482(arg5, arg3, arg2, local95, local174, 256, arg4, 0, 0, local111, local127);
					} else if (arg0 == 7) {
						if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
							local174 = local99.method881(local75, local85, local65, local53, 0, 4);
						} else {
							local174 = new Class1_Sub1_Sub8_Sub6(arg6, 4, 0, local53, local85, local65, local75, local99.anInt1252, true);
						}
						arg7.method482(arg5, arg3, arg2, local95, local174, 512, arg4, 0, 0, local111, local127);
					} else if (arg0 == 8) {
						if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
							local174 = local99.method881(local75, local85, local65, local53, 0, 4);
						} else {
							local174 = new Class1_Sub1_Sub8_Sub6(arg6, 4, 0, local53, local85, local65, local75, local99.anInt1252, true);
						}
						arg7.method482(arg5, arg3, arg2, local95, local174, 768, arg4, 0, 0, local111, local127);
					}
				}
			}
		} else if (!Static75.aBoolean85 || local99.anInt1272 != 0 || local99.aBoolean76) {
			if (local99.anInt1252 == -1 && local99.anIntArray190 == null) {
				local174 = local99.method881(local75, local85, local65, local53, arg4, 22);
			} else {
				local174 = new Class1_Sub1_Sub8_Sub6(arg6, 22, arg4, local53, local85, local65, local75, local99.anInt1252, true);
			}
			arg7.method496(arg5, arg3, arg2, local95, local174, local111, local127);
			if (local99.aBoolean75 && local99.anInt1272 == 1 && arg1 != null) {
				arg1.method117(arg2, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(I)V")
	public static void method100() {
		Static24.method508();
		if (Static17.anInt592 == 1) {
			Static42.aClass1_Sub1_Sub1_Sub1Array44[Static56.anInt1426 / 100].method82(Static88.anInt2319 - 8 - 4, Static103.anInt2676 - 4 + -8);
		}
		if (Static17.anInt592 == 2) {
			Static42.aClass1_Sub1_Sub1_Sub1Array44[Static56.anInt1426 / 100 + 4].method82(Static88.anInt2319 - 8 - 4, -8 + -4 + Static103.anInt2676);
		}
		if (Static29.anInt824 != -1) {
			Static48.method861(Static29.anInt824);
			Static106.method1848(-1, Static29.anInt824, 0, 4, 0, 0, 334, 512);
		}
		if (Static108.anInt2743 != -1) {
			Static48.method861(Static108.anInt2743);
			Static106.method1848(-1, Static108.anInt2743, 0, 0, 0, 0, 334, 512);
		}
		Static91.method1661();
		if (!Static10.aBoolean13) {
			Static42.method1764();
			Static63.method1080();
		} else if (Static73.anInt1891 == 0) {
			Static97.method1699();
		}
		if (Static60.anInt1444 == 1) {
			Static53.aClass1_Sub1_Sub1_Sub1_14.method82(472, 296);
		}
		@Pc(167) int local167;
		if (Static2.aBoolean5) {
			@Pc(121) byte local121 = 20;
			@Pc(123) int local123 = 16776960;
			if (Static50.anInt1725 < 30 && Static75.aBoolean85) {
				local123 = 16711680;
			}
			if (Static50.anInt1725 < 20 && !Static75.aBoolean85) {
				local123 = 16711680;
			}
			Static95.aClass1_Sub1_Sub1_Sub3_3.method823(Static57.method1822(new Class42[] { Static57.aClass42_1416, Static38.method642(Static50.anInt1725) }), 20, local123);
			@Pc(164) Runtime local164 = Runtime.getRuntime();
			local123 = 16776960;
			local167 = local121 + 15;
			@Pc(177) int local177 = (int) ((local164.totalMemory() - local164.freeMemory()) / 1024L);
			if (local177 > 32768 && Static75.aBoolean85) {
				local123 = 16711680;
			}
			if (local177 > 65536 && !Static75.aBoolean85) {
				local123 = 16711680;
			}
			Static95.aClass1_Sub1_Sub1_Sub3_3.method823(Static57.method1822(new Class42[] { Static20.aClass42_366, Static38.method642(local177), Static11.aClass42_203 }), 35, local123);
			local167 += 15;
			if (Static16.aBoolean26) {
				Static95.aClass1_Sub1_Sub1_Sub3_3.method823(Static19.aClass42_352, 50, 16711680);
				Static16.aBoolean26 = false;
				local167 += 15;
			}
			if (Static67.aBoolean95) {
				Static95.aClass1_Sub1_Sub1_Sub3_3.method823(Static18.aClass42_324, local167, 16711680);
				Static67.aBoolean95 = false;
				local167 += 15;
			}
			if (Static48.aBoolean68) {
				Static95.aClass1_Sub1_Sub1_Sub3_3.method823(Static61.aClass42_795, local167, 16711680);
				local167 += 15;
				Static48.aBoolean68 = false;
			}
		}
		if (Static25.anInt732 == 0) {
			return;
		}
		@Pc(261) int local261 = Static25.anInt732 / 50;
		local167 = local261 / 60;
		@Pc(269) int local269 = local261 % 60;
		if (local269 >= 10) {
			Static95.aClass1_Sub1_Sub1_Sub3_3.method818(Static57.method1822(new Class42[] { Static74.aClass42_992, Static38.method642(local167), Static53.aClass42_1438, Static38.method642(local269) }), 4, 329, 16776960);
		} else {
			Static95.aClass1_Sub1_Sub1_Sub3_3.method818(Static57.method1822(new Class42[] { Static74.aClass42_992, Static38.method642(local167), Static108.aClass42_1455, Static38.method642(local269) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "(Z)V")
	public static void method101() {
		aClass42_81 = null;
		aClass42_82 = null;
		aClass42_79 = null;
		aClass42_84 = null;
		aClass42_86 = null;
		aClass42_85 = null;
		aClass42_83 = null;
		anIntArray16 = null;
		aClass31_1 = null;
		aClass1_Sub1_Sub1_Sub3_1 = null;
	}
}
