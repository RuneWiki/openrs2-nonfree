import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!oe;")
	public static Class2_Sub1_Sub2_Sub3_Sub1 aClass2_Sub1_Sub2_Sub3_Sub1_1;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "[Lclient!kd;")
	public static Class2_Sub1_Sub2_Sub1[] aClass2_Sub1_Sub2_Sub1Array19;

	@OriginalMember(owner = "client!da", name = "c", descriptor = "I")
	public static final int anInt429 = 7759444;

	@OriginalMember(owner = "client!da", name = "f", descriptor = "I")
	public static int anInt432 = 0;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!je;")
	private static Class40 aClass40_270 = Static69.method1231("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!da", name = "h", descriptor = "Lclient!je;")
	public static Class40 aClass40_266 = aClass40_270;

	@OriginalMember(owner = "client!da", name = "j", descriptor = "Lclient!je;")
	public static Class40 aClass40_267 = Static69.method1231("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q");

	@OriginalMember(owner = "client!da", name = "k", descriptor = "I")
	public static int anInt435 = 0;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!je;")
	private static Class40 aClass40_268 = Static69.method1231("Your account has been disabled)3");

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!je;")
	public static Class40 aClass40_269 = aClass40_268;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!kc;)V")
	public static void method316(@OriginalArg(1) Class2_Sub13 arg0) {
		if (arg0.anInt1601 == Static127.anInt2943) {
			Static64.aBooleanArray17[arg0.anInt1552] = true;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "([Lclient!ee;ZLclient!hb;)V")
	public static void method317(@OriginalArg(0) Class20[] arg0, @OriginalArg(2) Class30 arg1) {
		@Pc(11) int local11;
		@Pc(15) int local15;
		@Pc(30) int local30;
		for (@Pc(7) int local7 = 0; local7 < 4; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				for (local15 = 0; local15 < 104; local15++) {
					if ((Static66.aByteArrayArrayArray10[local7][local11][local15] & 0x1) == 1) {
						local30 = local7;
						if ((Static66.aByteArrayArrayArray10[1][local11][local15] & 0x2) == 2) {
							local30 = local7 - 1;
						}
						if (local30 >= 0) {
							arg0[local30].method434(local15, local11);
						}
					}
				}
			}
		}
		Static115.anInt2645 += (int) (Math.random() * 5.0D) - 2;
		Static123.anInt2874 += (int) (Math.random() * 5.0D) - 2;
		if (Static123.anInt2874 < -8) {
			Static123.anInt2874 = -8;
		}
		if (Static123.anInt2874 > 8) {
			Static123.anInt2874 = 8;
		}
		if (Static115.anInt2645 < -16) {
			Static115.anInt2645 = -16;
		}
		if (Static115.anInt2645 > 16) {
			Static115.anInt2645 = 16;
		}
		@Pc(127) int local127;
		@Pc(129) int local129;
		@Pc(133) int local133;
		@Pc(156) int local156;
		@Pc(177) int local177;
		@Pc(190) int local190;
		@Pc(196) int local196;
		@Pc(200) int local200;
		@Pc(206) int local206;
		@Pc(273) int local273;
		@Pc(255) int local255;
		@Pc(499) int local499;
		@Pc(540) int local540;
		@Pc(643) int local643;
		@Pc(633) int local633;
		@Pc(658) int local658;
		for (local11 = 0; local11 < 4; local11++) {
			@Pc(117) byte[][] local117 = Static87.aByteArrayArrayArray9[local11];
			local30 = (int) Math.sqrt(5100.0D);
			local127 = local30 * 768 >> 8;
			for (local129 = 1; local129 < 103; local129++) {
				for (local133 = 1; local133 < 103; local133++) {
					local156 = Static118.anIntArrayArrayArray6[local11][local133 + 1][local129] - Static118.anIntArrayArrayArray6[local11][local133 - 1][local129];
					local177 = Static118.anIntArrayArrayArray6[local11][local133][local129 + 1] - Static118.anIntArrayArrayArray6[local11][local133][local129 - 1];
					local190 = (int) Math.sqrt((double) (local177 * local177 + local156 * local156 + 65536));
					local196 = (local156 << 8) / local190;
					local200 = 65536 / local190;
					local206 = (local177 << 8) / local190;
					local255 = (local117[local133][local129 - 1] >> 2) + ((local117[local133 + 1][local129] >> 3) + (local117[local133 - 1][local129] >> 2) + (local117[local133][local129 - -1] >> 3) + (local117[local133][local129] >> 1));
					local273 = (local196 * -50 + local200 * -10 + local206 * -50) / local127 + 96;
					Static64.anIntArrayArray19[local133][local129] = local273 - local255;
				}
			}
			for (local133 = 0; local133 < 104; local133++) {
				Static84.anIntArray245[local133] = 0;
				Static68.anIntArray182[local133] = 0;
				Static40.anIntArray108[local133] = 0;
				Static133.anIntArray377[local133] = 0;
				Static34.anIntArray94[local133] = 0;
			}
			for (local156 = -5; local156 < 109; local156++) {
				for (local177 = 0; local177 < 104; local177++) {
					local190 = local156 + 5;
					@Pc(395) int local395;
					if (local190 >= 0 && local190 < 104) {
						local196 = Static63.aByteArrayArrayArray2[local11][local190][local177] & 0xFF;
						if (local196 > 0) {
							@Pc(359) Class2_Sub1_Sub3 local359 = Static38.method686(local196 - 1);
							Static84.anIntArray245[local177] += local359.anInt275;
							Static68.anIntArray182[local177] += local359.anInt273;
							Static40.anIntArray108[local177] += local359.anInt270;
							Static133.anIntArray377[local177] += local359.anInt269;
							local395 = Static34.anIntArray94[local177]++;
						}
					}
					local196 = local156 - 5;
					if (local196 >= 0 && local196 < 104) {
						local200 = Static63.aByteArrayArrayArray2[local11][local196][local177] & 0xFF;
						if (local200 > 0) {
							@Pc(432) Class2_Sub1_Sub3 local432 = Static38.method686(local200 - 1);
							Static84.anIntArray245[local177] -= local432.anInt275;
							Static68.anIntArray182[local177] -= local432.anInt273;
							Static40.anIntArray108[local177] -= local432.anInt270;
							Static133.anIntArray377[local177] -= local432.anInt269;
							local395 = Static34.anIntArray94[local177]--;
						}
					}
				}
				if (local156 >= 1 && local156 < 103) {
					local190 = 0;
					local196 = 0;
					local200 = 0;
					local206 = 0;
					local273 = 0;
					for (local255 = -5; local255 < 109; local255++) {
						local499 = local255 + 5;
						if (local499 >= 0 && local499 < 104) {
							local273 += Static34.anIntArray94[local499];
							local190 += Static84.anIntArray245[local499];
							local200 += Static40.anIntArray108[local499];
							local206 += Static133.anIntArray377[local499];
							local196 += Static68.anIntArray182[local499];
						}
						local540 = local255 - 5;
						if (local540 >= 0 && local540 < 104) {
							local200 -= Static40.anIntArray108[local540];
							local196 -= Static68.anIntArray182[local540];
							local206 -= Static133.anIntArray377[local540];
							local190 -= Static84.anIntArray245[local540];
							local273 -= Static34.anIntArray94[local540];
						}
						if (local255 >= 1 && local255 < 103 && (!Static34.aBoolean60 || (Static66.aByteArrayArrayArray10[0][local156][local255] & 0x2) != 0 || (Static66.aByteArrayArrayArray10[local11][local156][local255] & 0x10) == 0 && Static116.method1935(local255, local156, local11) == Static1.anInt8)) {
							if (Static1.anInt13 > local11) {
								Static1.anInt13 = local11;
							}
							local633 = Static48.aByteArrayArrayArray8[local11][local156][local255] & 0xFF;
							local643 = Static63.aByteArrayArrayArray2[local11][local156][local255] & 0xFF;
							if (local643 > 0 || local633 > 0) {
								local658 = Static118.anIntArrayArrayArray6[local11][local156][local255];
								@Pc(668) int local668 = Static118.anIntArrayArrayArray6[local11][local156 + 1][local255];
								@Pc(680) int local680 = Static118.anIntArrayArrayArray6[local11][local156 + 1][local255 + 1];
								@Pc(686) int local686 = Static64.anIntArrayArray19[local156][local255];
								@Pc(694) int local694 = Static64.anIntArrayArray19[local156 + 1][local255];
								@Pc(704) int local704 = Static118.anIntArrayArrayArray6[local11][local156][local255 + 1];
								@Pc(714) int local714 = Static64.anIntArrayArray19[local156 + 1][local255 + 1];
								@Pc(716) int local716 = -1;
								@Pc(718) int local718 = -1;
								@Pc(726) int local726 = Static64.anIntArrayArray19[local156][local255 + 1];
								@Pc(734) int local734;
								@Pc(738) int local738;
								if (local643 > 0) {
									local734 = local190 * 256 / local206;
									local738 = local196 / local273;
									@Pc(742) int local742 = local200 / local273;
									local716 = Static18.method371(local738, local742, local734);
									local742 += Static115.anInt2645;
									if (local742 < 0) {
										local742 = 0;
									} else if (local742 > 255) {
										local742 = 255;
									}
									local734 = Static123.anInt2874 + local734 & 0xFF;
									local718 = Static18.method371(local738, local742, local734);
								}
								if (local11 > 0) {
									@Pc(782) boolean local782 = true;
									if (local643 == 0 && Static21.aByteArrayArrayArray5[local11][local156][local255] != 0) {
										local782 = false;
									}
									if (local633 > 0 && !Static57.method1012(local633 - 1).aBoolean210) {
										local782 = false;
									}
									if (local782 && local668 == local658 && local680 == local658 && local658 == local704) {
										Static64.anIntArrayArrayArray5[local11][local156][local255] |= 0x924;
									}
								}
								local734 = 0;
								if (local718 != -1) {
									local734 = Static78.anIntArray224[Static99.method1790(local718, 96)];
								}
								if (local633 == 0) {
									arg1.method782(local11, local156, local255, 0, 0, -1, local658, local668, local680, local704, Static99.method1790(local716, local686), Static99.method1790(local716, local694), Static99.method1790(local716, local714), Static99.method1790(local716, local726), 0, 0, 0, 0, local734, 0);
								} else {
									local738 = Static21.aByteArrayArrayArray5[local11][local156][local255] + 1;
									@Pc(917) byte local917 = Static33.aByteArrayArrayArray11[local11][local156][local255];
									@Pc(923) Class2_Sub1_Sub13 local923 = Static57.method1012(local633 - 1);
									@Pc(926) int local926 = local923.anInt2578;
									@Pc(946) int local946;
									@Pc(976) int local976;
									@Pc(953) int local953;
									@Pc(958) int local958;
									if (local926 >= 0) {
										local946 = -1;
										local976 = Static78.anInterface1_1.method1010(local926);
									} else if (local923.anInt2577 == 16711935) {
										local976 = -2;
										local926 = -1;
										local946 = -2;
									} else {
										local946 = Static18.method371(local923.anInt2570, local923.anInt2576, local923.anInt2574);
										local953 = Static123.anInt2874 + local923.anInt2574 & 0xFF;
										local958 = Static115.anInt2645 + local923.anInt2576;
										if (local958 < 0) {
											local958 = 0;
										} else if (local958 > 255) {
											local958 = 255;
										}
										local976 = Static18.method371(local923.anInt2570, local958, local953);
									}
									local953 = 0;
									if (local976 != -2) {
										local953 = Static78.anIntArray224[Static111.method1865(96, local976)];
									}
									if (local923.anInt2579 != -1) {
										@Pc(1016) int local1016 = local923.anInt2571 + Static115.anInt2645;
										if (local1016 < 0) {
											local1016 = 0;
										} else if (local1016 > 255) {
											local1016 = 255;
										}
										local958 = Static123.anInt2874 + local923.anInt2567 & 0xFF;
										local976 = Static18.method371(local923.anInt2580, local1016, local958);
										local953 = Static78.anIntArray224[Static111.method1865(96, local976)];
									}
									arg1.method782(local11, local156, local255, local738, local917, local926, local658, local668, local680, local704, Static99.method1790(local716, local686), Static99.method1790(local716, local694), Static99.method1790(local716, local714), Static99.method1790(local716, local726), Static111.method1865(local686, local946), Static111.method1865(local694, local946), Static111.method1865(local714, local946), Static111.method1865(local726, local946), local734, local953);
								}
							}
						}
					}
				}
			}
			for (local177 = 1; local177 < 103; local177++) {
				for (local190 = 1; local190 < 103; local190++) {
					arg1.method771(local11, local190, local177, Static116.method1935(local177, local190, local11));
				}
			}
			Static63.aByteArrayArrayArray2[local11] = null;
			Static48.aByteArrayArrayArray8[local11] = null;
			Static21.aByteArrayArrayArray5[local11] = null;
			Static33.aByteArrayArrayArray11[local11] = null;
			Static87.aByteArrayArrayArray9[local11] = null;
		}
		arg1.method784();
		for (local15 = 0; local15 < 104; local15++) {
			for (local30 = 0; local30 < 104; local30++) {
				if ((Static66.aByteArrayArrayArray10[1][local15][local30] & 0x2) == 2) {
					arg1.method741(local15, local30);
				}
			}
		}
		local30 = 1;
		local129 = 4;
		local127 = 2;
		for (local133 = 0; local133 < 4; local133++) {
			if (local133 > 0) {
				local30 <<= 0x3;
				local129 <<= 0x3;
				local127 <<= 0x3;
			}
			for (local156 = 0; local156 <= local133; local156++) {
				for (local177 = 0; local177 <= 104; local177++) {
					for (local190 = 0; local190 <= 104; local190++) {
						if ((Static64.anIntArrayArrayArray5[local156][local190][local177] & local30) != 0) {
							local196 = local177;
							local200 = local177;
							local206 = local156;
							local273 = local156;
							while (local196 > 0 && (Static64.anIntArrayArrayArray5[local156][local190][local196 - 1] & local30) != 0) {
								local196--;
							}
							while (local200 < 104 && (local30 & Static64.anIntArrayArrayArray5[local156][local190][local200 + 1]) != 0) {
								local200++;
							}
							label347: while (local206 > 0) {
								for (local255 = local196; local255 <= local200; local255++) {
									if ((Static64.anIntArrayArrayArray5[local206 - 1][local190][local255] & local30) == 0) {
										break label347;
									}
								}
								local206--;
							}
							label336: while (local133 > local273) {
								for (local255 = local196; local255 <= local200; local255++) {
									if ((local30 & Static64.anIntArrayArrayArray5[local273 + 1][local190][local255]) == 0) {
										break label336;
									}
								}
								local273++;
							}
							local255 = (local273 + 1 - local206) * (local200 + 1 - local196);
							if (local255 >= 8) {
								local540 = Static118.anIntArrayArrayArray6[local273][local190][local196] - 240;
								local643 = Static118.anIntArrayArrayArray6[local206][local190][local196];
								Static42.method758(local133, 1, local190 * 128, local190 * 128, local196 * 128, local200 * 128 + 128, local540, local643);
								for (local633 = local206; local633 <= local273; local633++) {
									for (local658 = local196; local658 <= local200; local658++) {
										Static64.anIntArrayArrayArray5[local633][local190][local658] &= ~local30;
									}
								}
							}
						}
						if ((Static64.anIntArrayArrayArray5[local156][local190][local177] & local127) != 0) {
							local196 = local190;
							local200 = local190;
							local206 = local156;
							while (local200 < 104 && (local127 & Static64.anIntArrayArrayArray5[local156][local200 + 1][local177]) != 0) {
								local200++;
							}
							while (local196 > 0 && (Static64.anIntArrayArrayArray5[local156][local196 - 1][local177] & local127) != 0) {
								local196--;
							}
							local273 = local156;
							label400: while (local206 > 0) {
								for (local255 = local196; local255 <= local200; local255++) {
									if ((local127 & Static64.anIntArrayArrayArray5[local206 - 1][local255][local177]) == 0) {
										break label400;
									}
								}
								local206--;
							}
							label389: while (local273 < local133) {
								for (local255 = local196; local255 <= local200; local255++) {
									if ((Static64.anIntArrayArrayArray5[local273 + 1][local255][local177] & local127) == 0) {
										break label389;
									}
								}
								local273++;
							}
							local255 = (local273 + 1 - local206) * (local200 + 1 - local196);
							if (local255 >= 8) {
								local643 = Static118.anIntArrayArrayArray6[local206][local196][local177];
								local540 = Static118.anIntArrayArrayArray6[local273][local196][local177] - 240;
								Static42.method758(local133, 2, local196 * 128, local200 * 128 + 128, local177 * 128, local177 * 128, local540, local643);
								for (local633 = local206; local633 <= local273; local633++) {
									for (local658 = local196; local658 <= local200; local658++) {
										Static64.anIntArrayArrayArray5[local633][local658][local177] &= ~local127;
									}
								}
							}
						}
						if ((local129 & Static64.anIntArrayArrayArray5[local156][local190][local177]) != 0) {
							local196 = local190;
							local200 = local190;
							local206 = local177;
							for (local273 = local177; local273 < 104 && (local129 & Static64.anIntArrayArrayArray5[local156][local190][local273 + 1]) != 0; local273++) {
							}
							while (local206 > 0 && (local129 & Static64.anIntArrayArrayArray5[local156][local190][local206 - 1]) != 0) {
								local206--;
							}
							label454: while (local196 > 0) {
								for (local255 = local206; local255 <= local273; local255++) {
									if ((local129 & Static64.anIntArrayArrayArray5[local156][local196 - 1][local255]) == 0) {
										break label454;
									}
								}
								local196--;
							}
							label443: while (local200 < 104) {
								for (local255 = local206; local255 <= local273; local255++) {
									if ((Static64.anIntArrayArrayArray5[local156][local200 + 1][local255] & local129) == 0) {
										break label443;
									}
								}
								local200++;
							}
							if ((local200 + 1 - local196) * (local273 + 1 - local206) >= 4) {
								local255 = Static118.anIntArrayArrayArray6[local156][local196][local206];
								Static42.method758(local133, 4, local196 * 128, local200 * 128 + 128, local206 * 128, local273 * 128 + 128, local255, local255);
								for (local499 = local196; local499 <= local200; local499++) {
									for (local540 = local206; local540 <= local273; local540++) {
										Static64.anIntArrayArrayArray5[local156][local499][local540] &= ~local129;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method318() {
		aClass40_269 = null;
		aClass40_268 = null;
		aClass40_267 = null;
		aClass2_Sub1_Sub2_Sub1Array19 = null;
		aClass40_270 = null;
		aClass40_266 = null;
		aClass2_Sub1_Sub2_Sub3_Sub1_1 = null;
	}
}
