import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!ue", name = "bb", descriptor = "Z")
	public static boolean aBoolean168;

	@OriginalMember(owner = "client!ue", name = "sb", descriptor = "[I")
	public static int[] anIntArray417;

	@OriginalMember(owner = "client!ue", name = "Y", descriptor = "I")
	public static int anInt4342 = -1;

	@OriginalMember(owner = "client!ue", name = "db", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1462 = Static49.method1293("<col=ffff00>*V");

	@OriginalMember(owner = "client!ue", name = "mb", descriptor = "Z")
	public static boolean aBoolean170 = false;

	@OriginalMember(owner = "client!ue", name = "ob", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1463 = Static49.method1293(" )2>");

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(III)Lclient!hc;")
	public static Class34 method3334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass34_1;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "([Lclient!oa;I)V")
	public static void method3338(@OriginalArg(0) Class59[] arg0) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static20.aByteArrayArrayArray1[local7][local11][local15] & 0x1) == 1) {
						@Pc(30) int local30 = local7;
						if ((Static20.aByteArrayArrayArray1[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method2468(local11, local15);
						}
					}
				}
			}
		}
		Static108.anInt3060 += (int) (Math.random() * 5.0D) - 2;
		@Pc(81) int[][] local81 = new int[104][104];
		if (Static108.anInt3060 < -16) {
			Static108.anInt3060 = -16;
		}
		if (Static108.anInt3060 > 16) {
			Static108.anInt3060 = 16;
		}
		@Pc(97) int[][] local97 = new int[104][104];
		Static24.anInt659 += (int) (Math.random() * 5.0D) - 2;
		local15 = Static108.anInt3060 >> 1;
		if (Static24.anInt659 < -8) {
			Static24.anInt659 = -8;
		}
		if (Static24.anInt659 > 8) {
			Static24.anInt659 = 8;
		}
		local11 = Static24.anInt659 >> 2 << 10;
		@Pc(144) int local144;
		@Pc(152) int local152;
		@Pc(156) int local156;
		@Pc(246) int local246;
		@Pc(201) int local201;
		@Pc(180) int local180;
		@Pc(214) int local214;
		@Pc(224) int local224;
		@Pc(218) int local218;
		@Pc(230) int local230;
		@Pc(295) int local295;
		@Pc(508) int local508;
		@Pc(547) int local547;
		@Pc(806) int local806;
		@Pc(822) int local822;
		for (@Pc(130) int local130 = 0; local130 < 4; local130++) {
			@Pc(140) byte[][] local140 = Static65.aByteArrayArrayArray5[local130];
			local144 = (int) Math.sqrt(5100.0D);
			@Pc(150) int local150 = local144 * 768 >> 8;
			for (local152 = 1; local152 < 103; local152++) {
				for (local156 = 1; local156 < 103; local156++) {
					local180 = Static142.anIntArrayArrayArray8[local130][local156][local152 + 1] - Static142.anIntArrayArrayArray8[local130][local156][local152 - 1];
					local201 = Static142.anIntArrayArrayArray8[local130][local156 + 1][local152] - Static142.anIntArrayArrayArray8[local130][local156 - 1][local152];
					local214 = (int) Math.sqrt((double) (local180 * local180 + local201 * local201 + 65536));
					local218 = 65536 / local214;
					local224 = (local201 << 8) / local214;
					local230 = (local180 << 8) / local214;
					local246 = (local230 * -50 + local218 * -10 + local224 * -50) / local150 + 96;
					local295 = (local140[local156][local152] >> 1) + (local140[local156][local152 + 1] >> 3) + (local140[local156][local152 + -1] >> 2) + (local140[local156 + -1][local152] >> 2) + (local140[local156 + 1][local152] >> 3);
					local97[local156][local152] = local246 - local295;
				}
			}
			for (local156 = 0; local156 < 104; local156++) {
				Static49.anIntArray169[local156] = 0;
				Static134.anIntArray331[local156] = 0;
				Static35.anIntArray198[local156] = 0;
				Static96.anIntArray259[local156] = 0;
				Static37.anIntArray122[local156] = 0;
			}
			for (local246 = -5; local246 < 104; local246++) {
				for (local201 = 0; local201 < 104; local201++) {
					local180 = local246 + 5;
					@Pc(413) int local413;
					if (local180 < 104) {
						local214 = Static95.aByteArrayArrayArray6[local130][local180][local201] & 0xFF;
						if (local214 > 0) {
							@Pc(377) Class1_Sub1_Sub8 local377 = Static124.method2528(local214 - 1);
							Static49.anIntArray169[local201] += local377.anInt2075;
							Static134.anIntArray331[local201] += local377.anInt2078;
							Static35.anIntArray198[local201] += local377.anInt2076;
							Static96.anIntArray259[local201] += local377.anInt2080;
							local413 = Static37.anIntArray122[local201]++;
						}
					}
					local214 = local246 - 5;
					if (local214 >= 0) {
						local224 = Static95.aByteArrayArrayArray6[local130][local214][local201] & 0xFF;
						if (local224 > 0) {
							@Pc(440) Class1_Sub1_Sub8 local440 = Static124.method2528(local224 - 1);
							Static49.anIntArray169[local201] -= local440.anInt2075;
							Static134.anIntArray331[local201] -= local440.anInt2078;
							Static35.anIntArray198[local201] -= local440.anInt2076;
							Static96.anIntArray259[local201] -= local440.anInt2080;
							local413 = Static37.anIntArray122[local201]--;
						}
					}
				}
				if (local246 >= 0) {
					local180 = 0;
					local214 = 0;
					local224 = 0;
					local218 = 0;
					local230 = 0;
					for (local295 = -5; local295 < 104; local295++) {
						local508 = local295 + 5;
						if (local508 < 104) {
							local214 += Static134.anIntArray331[local508];
							local230 += Static37.anIntArray122[local508];
							local180 += Static49.anIntArray169[local508];
							local224 += Static35.anIntArray198[local508];
							local218 += Static96.anIntArray259[local508];
						}
						local547 = local295 - 5;
						if (local547 >= 0) {
							local230 -= Static37.anIntArray122[local547];
							local224 -= Static35.anIntArray198[local547];
							local180 -= Static49.anIntArray169[local547];
							local214 -= Static134.anIntArray331[local547];
							local218 -= Static96.anIntArray259[local547];
						}
						if (local295 >= 0 && local230 > 0) {
							local81[local246][local295] = Static174.method3424(local180 * 256 / local218, local214 / local230, local224 / local230);
						}
					}
				}
			}
			for (local201 = 1; local201 < 103; local201++) {
				for (local180 = 1; local180 < 103; local180++) {
					if (!Static79.aBoolean91 || (Static20.aByteArrayArrayArray1[0][local201][local180] & 0x2) != 0 || (Static20.aByteArrayArrayArray1[local130][local201][local180] & 0x10) == 0 && Static144.method2838(local201, local130, local180) == Static164.anInt4265) {
						if (Static122.anInt3337 > local130) {
							Static122.anInt3337 = local130;
						}
						local214 = Static95.aByteArrayArrayArray6[local130][local201][local180] & 0xFF;
						local224 = Static25.aByteArrayArrayArray2[local130][local201][local180] & 0xFF;
						if (local214 > 0 || local224 > 0) {
							local218 = Static142.anIntArrayArrayArray8[local130][local201][local180];
							local508 = Static142.anIntArrayArrayArray8[local130][local201][local180 + 1];
							local230 = Static142.anIntArrayArrayArray8[local130][local201 + 1][local180];
							local295 = Static142.anIntArrayArrayArray8[local130][local201 + 1][local180 + 1];
							if (local130 > 0) {
								@Pc(738) boolean local738 = true;
								if (local214 == 0 && Static41.aByteArrayArrayArray3[local130][local201][local180] != 0) {
									local738 = false;
								}
								if (local224 > 0 && !Static31.method789(local224 - 1).aBoolean14) {
									local738 = false;
								}
								if (local738 && local230 == local218 && local295 == local218 && local508 == local218) {
									Static39.anIntArrayArrayArray3[local130][local201][local180] |= 0x924;
								}
							}
							@Pc(849) int local849;
							if (local214 <= 0) {
								local806 = 0;
								local547 = -1;
							} else {
								local547 = local81[local201][local180];
								local822 = (local547 & 0x7F) + local15;
								if (local822 < 0) {
									local822 = 0;
								} else if (local822 > 127) {
									local822 = 127;
								}
								local849 = (local547 & 0x380) + ((local11 + local547 & 0xFC00) + local822);
								local806 = Static1.anIntArray9[Static142.method2803(96, local849)];
							}
							local849 = local97[local201 + 1][local180];
							@Pc(874) int local874 = local97[local201 + 1][local180 + 1];
							local822 = local97[local201][local180];
							@Pc(888) int local888 = local97[local201][local180 + 1];
							if (local224 == 0) {
								Static9.method278(local130, local201, local180, 0, 0, -1, local218, local230, local295, local508, Static142.method2803(local822, local547), Static142.method2803(local849, local547), Static142.method2803(local874, local547), Static142.method2803(local888, local547), 0, 0, 0, 0, local806, 0);
							} else {
								@Pc(900) int local900 = Static41.aByteArrayArrayArray3[local130][local201][local180] + 1;
								@Pc(908) byte local908 = Static60.aByteArrayArrayArray4[local130][local201][local180];
								@Pc(914) Class1_Sub1_Sub3 local914 = Static31.method789(local224 - 1);
								@Pc(917) int local917 = local914.anInt344;
								if (local917 >= 0 && !Static1.anInterface2_1.method3420(local917)) {
									local917 = -1;
								}
								@Pc(940) int local940;
								@Pc(938) int local938;
								@Pc(955) int local955;
								@Pc(982) int local982;
								if (local917 >= 0) {
									local938 = Static1.anIntArray9[Static118.method2407(96, Static1.anInterface2_1.method3416(local917))];
									local940 = -1;
								} else if (local914.anInt350 == -1) {
									local938 = 0;
									local940 = -2;
								} else {
									local940 = local914.anInt350;
									local955 = local15 + (local940 & 0x7F);
									if (local955 < 0) {
										local955 = 0;
									} else if (local955 > 127) {
										local955 = 127;
									}
									local982 = (local11 + local940 & 0xFC00) + ((local940 & 0x380) + local955);
									local938 = Static1.anIntArray9[Static118.method2407(96, local982)];
								}
								if (local914.anInt346 >= 0) {
									local955 = local914.anInt346;
									local982 = (local955 & 0x7F) + local15;
									if (local982 < 0) {
										local982 = 0;
									} else if (local982 > 127) {
										local982 = 127;
									}
									@Pc(1036) int local1036 = (local955 + local11 & 0xFC00) - (-(local955 & 0x380) - local982);
									local938 = Static1.anIntArray9[Static118.method2407(96, local1036)];
								}
								Static9.method278(local130, local201, local180, local900, local908, local917, local218, local230, local295, local508, Static142.method2803(local822, local547), Static142.method2803(local849, local547), Static142.method2803(local874, local547), Static142.method2803(local888, local547), Static118.method2407(local822, local940), Static118.method2407(local849, local940), Static118.method2407(local874, local940), Static118.method2407(local888, local940), local806, local938);
							}
						}
					}
				}
			}
			for (local180 = 1; local180 < 103; local180++) {
				for (local214 = 1; local214 < 103; local214++) {
					Static99.method3504(local130, local214, local180, Static144.method2838(local214, local130, local180));
				}
			}
			Static95.aByteArrayArrayArray6[local130] = null;
			Static25.aByteArrayArrayArray2[local130] = null;
			Static41.aByteArrayArrayArray3[local130] = null;
			Static60.aByteArrayArrayArray4[local130] = null;
			Static65.aByteArrayArrayArray5[local130] = null;
		}
		Static162.method3315();
		@Pc(1196) int local1196;
		for (@Pc(1192) int local1192 = 0; local1192 < 104; local1192++) {
			for (local1196 = 0; local1196 < 104; local1196++) {
				if ((Static20.aByteArrayArrayArray1[1][local1192][local1196] & 0x2) == 2) {
					Static50.method1297(local1192, local1196);
				}
			}
		}
		local1196 = 1;
		@Pc(1228) int local1228 = 2;
		local144 = 4;
		for (local152 = 0; local152 < 4; local152++) {
			if (local152 > 0) {
				local1228 <<= 0x3;
				local144 <<= 0x3;
				local1196 <<= 0x3;
			}
			for (local156 = 0; local156 <= local152; local156++) {
				for (local246 = 0; local246 <= 104; local246++) {
					for (local201 = 0; local201 <= 104; local201++) {
						if ((Static39.anIntArrayArrayArray3[local156][local201][local246] & local1196) != 0) {
							local180 = local246;
							for (local214 = local246; local214 < 104 && (local1196 & Static39.anIntArrayArrayArray3[local156][local201][local214 + 1]) != 0; local214++) {
							}
							while (local180 > 0 && (Static39.anIntArrayArrayArray3[local156][local201][local180 - 1] & local1196) != 0) {
								local180--;
							}
							label351: for (local224 = local156; local224 > 0; local224--) {
								for (local230 = local180; local230 <= local214; local230++) {
									if ((Static39.anIntArrayArrayArray3[local224 - 1][local201][local230] & local1196) == 0) {
										break label351;
									}
								}
							}
							label339: for (local218 = local156; local218 < local152; local218++) {
								for (local230 = local180; local230 <= local214; local230++) {
									if ((local1196 & Static39.anIntArrayArrayArray3[local218 + 1][local201][local230]) == 0) {
										break label339;
									}
								}
							}
							local230 = (local214 + 1 - local180) * ((local218 - local224) + 1);
							if (local230 >= 8) {
								local508 = Static142.anIntArrayArrayArray8[local218][local201][local180] - 240;
								local547 = Static142.anIntArrayArrayArray8[local224][local201][local180];
								Static36.method920(local152, 1, local201 * 128, local201 * 128, local180 * 128, local214 * 128 + 128, local508, local547);
								for (local806 = local224; local806 <= local218; local806++) {
									for (local822 = local180; local822 <= local214; local822++) {
										Static39.anIntArrayArrayArray3[local806][local201][local822] &= ~local1196;
									}
								}
							}
						}
						if ((local1228 & Static39.anIntArrayArrayArray3[local156][local201][local246]) != 0) {
							local180 = local201;
							local224 = local156;
							for (local214 = local201; local214 < 104 && (Static39.anIntArrayArrayArray3[local156][local214 + 1][local246] & local1228) != 0; local214++) {
							}
							while (local180 > 0 && (local1228 & Static39.anIntArrayArrayArray3[local156][local180 - 1][local246]) != 0) {
								local180--;
							}
							label406: while (local224 > 0) {
								for (local230 = local180; local230 <= local214; local230++) {
									if ((local1228 & Static39.anIntArrayArrayArray3[local224 - 1][local230][local246]) == 0) {
										break label406;
									}
								}
								local224--;
							}
							label394: for (local218 = local156; local218 < local152; local218++) {
								for (local230 = local180; local230 <= local214; local230++) {
									if ((Static39.anIntArrayArrayArray3[local218 + 1][local230][local246] & local1228) == 0) {
										break label394;
									}
								}
							}
							local230 = (local218 + 1 - local224) * (local214 + 1 - local180);
							if (local230 >= 8) {
								local508 = Static142.anIntArrayArrayArray8[local218][local180][local246] - 240;
								local547 = Static142.anIntArrayArrayArray8[local224][local180][local246];
								Static36.method920(local152, 2, local180 * 128, local214 * 128 + 128, local246 * 128, local246 * 128, local508, local547);
								for (local806 = local224; local806 <= local218; local806++) {
									for (local822 = local180; local822 <= local214; local822++) {
										Static39.anIntArrayArrayArray3[local806][local822][local246] &= ~local1228;
									}
								}
							}
						}
						if ((local144 & Static39.anIntArrayArrayArray3[local156][local201][local246]) != 0) {
							local214 = local201;
							local180 = local201;
							for (local224 = local246; local224 > 0 && (Static39.anIntArrayArrayArray3[local156][local201][local224 - 1] & local144) != 0; local224--) {
							}
							for (local218 = local246; local218 < 104 && (local144 & Static39.anIntArrayArrayArray3[local156][local201][local218 + 1]) != 0; local218++) {
							}
							label459: while (local180 > 0) {
								for (local230 = local224; local230 <= local218; local230++) {
									if ((Static39.anIntArrayArrayArray3[local156][local180 - 1][local230] & local144) == 0) {
										break label459;
									}
								}
								local180--;
							}
							label448: while (local214 < 104) {
								for (local230 = local224; local230 <= local218; local230++) {
									if ((Static39.anIntArrayArrayArray3[local156][local214 + 1][local230] & local144) == 0) {
										break label448;
									}
								}
								local214++;
							}
							if ((local218 + 1 - local224) * ((local214 + 1) - local180) >= 4) {
								local230 = Static142.anIntArrayArrayArray8[local156][local180][local224];
								Static36.method920(local152, 4, local180 * 128, local214 * 128 + 128, local224 * 128, local218 * 128 + 128, local230, local230);
								for (local295 = local180; local295 <= local214; local295++) {
									for (local508 = local224; local508 <= local218; local508++) {
										Static39.anIntArrayArrayArray3[local156][local295][local508] &= ~local144;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "(I)V")
	public static void method3340() {
		for (@Pc(10) Class1_Sub11 local10 = (Class1_Sub11) Static14.aClass4_1.method174(); local10 != null; local10 = (Class1_Sub11) Static14.aClass4_1.method181()) {
			if (local10.anInt1932 > 0) {
				local10.anInt1932--;
			}
			if (local10.anInt1932 != 0) {
				if (local10.anInt1939 > 0) {
					local10.anInt1939--;
				}
				if (local10.anInt1939 == 0 && local10.anInt1936 >= 1 && local10.anInt1924 >= 1 && local10.anInt1936 <= 102 && local10.anInt1924 <= 102 && (local10.anInt1928 < 0 || Static133.method2570(local10.anInt1931, local10.anInt1928))) {
					Static61.method1472(local10.anInt1924, local10.anInt1927, local10.anInt1936, local10.anInt1941, local10.anInt1931, local10.anInt1935, local10.anInt1928);
					local10.anInt1939 = -1;
					if (local10.anInt1929 == local10.anInt1928 && local10.anInt1929 == -1) {
						local10.method3499();
					} else if (local10.anInt1929 == local10.anInt1928 && local10.anInt1923 == local10.anInt1941 && local10.anInt1931 == local10.anInt1940) {
						local10.method3499();
					}
				}
			} else if (local10.anInt1929 < 0 || Static133.method2570(local10.anInt1940, local10.anInt1929)) {
				Static61.method1472(local10.anInt1924, local10.anInt1927, local10.anInt1936, local10.anInt1923, local10.anInt1940, local10.anInt1935, local10.anInt1929);
				local10.method3499();
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "(Z)V")
	public static void method3342() {
		aClass70_1463 = null;
		aClass70_1462 = null;
		anIntArray417 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIZIII)V")
	public static void method3343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (Static108.anInt3053 == arg4 && arg1 == Static22.anInt597 && (Static164.anInt4265 == arg0 || !Static79.aBoolean91)) {
			return;
		}
		Static108.anInt3053 = arg4;
		Static22.anInt597 = arg1;
		Static164.anInt4265 = arg0;
		if (!Static79.aBoolean91) {
			Static164.anInt4265 = 0;
		}
		Static77.method1751(25);
		Static44.method1098(true, Static88.aClass70_862);
		@Pc(40) int local40 = Static154.anInt4068;
		@Pc(42) int local42 = Static64.anInt987;
		Static64.anInt987 = arg1 * 8 - 48;
		@Pc(52) int local52 = Static64.anInt987 - local42;
		Static154.anInt4068 = (arg4 - 6) * 8;
		@Pc(64) int local64 = Static154.anInt4068 - local40;
		for (@Pc(68) int local68 = 0; local68 < 32768; local68++) {
			@Pc(74) Class1_Sub1_Sub4_Sub2_Sub2 local74 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local68];
			if (local74 != null) {
				for (@Pc(78) int local78 = 0; local78 < 10; local78++) {
					local74.anIntArray197[local78] -= local64;
					local74.anIntArray199[local78] -= local52;
				}
				local74.anInt2001 -= local52 * 128;
				local74.anInt2030 -= local64 * 128;
			}
		}
		for (@Pc(124) int local124 = 0; local124 < 2048; local124++) {
			@Pc(130) Class1_Sub1_Sub4_Sub2_Sub1 local130 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local124];
			if (local130 != null) {
				for (@Pc(134) int local134 = 0; local134 < 10; local134++) {
					local130.anIntArray197[local134] -= local64;
					local130.anIntArray199[local134] -= local52;
				}
				local130.anInt2001 -= local52 * 128;
				local130.anInt2030 -= local64 * 128;
			}
		}
		Static56.anInt1784 = arg0;
		Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.method1514(arg2, arg3, false);
		@Pc(190) byte local190 = 0;
		@Pc(192) byte local192 = 1;
		@Pc(194) byte local194 = 104;
		@Pc(196) byte local196 = 0;
		@Pc(198) byte local198 = 104;
		@Pc(200) byte local200 = 1;
		if (local64 < 0) {
			local192 = -1;
			local190 = 103;
			local194 = -1;
		}
		if (local52 < 0) {
			local196 = 103;
			local200 = -1;
			local198 = -1;
		}
		for (@Pc(218) int local218 = local190; local218 != local194; local218 += local192) {
			for (@Pc(222) int local222 = local196; local222 != local198; local222 += local200) {
				@Pc(229) int local229 = local218 + local64;
				@Pc(233) int local233 = local52 + local222;
				for (@Pc(235) int local235 = 0; local235 < 4; local235++) {
					if (local229 >= 0 && local233 >= 0 && local229 < 104 && local233 < 104) {
						Static64.aClass4ArrayArrayArray2[local235][local218][local222] = Static64.aClass4ArrayArrayArray2[local235][local229][local233];
					} else {
						Static64.aClass4ArrayArrayArray2[local235][local218][local222] = null;
					}
				}
			}
		}
		for (@Pc(301) Class1_Sub11 local301 = (Class1_Sub11) Static14.aClass4_1.method174(); local301 != null; local301 = (Class1_Sub11) Static14.aClass4_1.method181()) {
			local301.anInt1924 -= local52;
			local301.anInt1936 -= local64;
			if (local301.anInt1936 < 0 || local301.anInt1924 < 0 || local301.anInt1936 >= 104 || local301.anInt1924 >= 104) {
				local301.method3499();
			}
		}
		if (Static105.anInt2980 != 0) {
			Static144.anInt3806 -= local52;
			Static105.anInt2980 -= local64;
		}
		Static88.anInt2601 = 0;
		Static169.anInt4358 = -1;
		Static176.aBoolean176 = false;
		Static72.aClass4_8.method182();
		Static144.aClass4_14.method182();
	}
}
