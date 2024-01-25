import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static192 {

	@OriginalMember(owner = "client!hb", name = "p", descriptor = "Lclient!rfa;")
	public static Class291 aClass291_1;

	@OriginalMember(owner = "client!hb", name = "q", descriptor = "I")
	public static int anInt4507;

	@OriginalMember(owner = "client!hb", name = "j", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_47 = new Class71(45, 2);

	@OriginalMember(owner = "client!hb", name = "m", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray9 = new String[100];

	@OriginalMember(owner = "client!hb", name = "o", descriptor = "[I")
	public static int[] anIntArray246 = new int[1];

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z[[[BIBIIZ)V")
	public static void method3626(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static42.anInt1523 = 0;
		Static132.anInt3519 = 0;
		Static609.anInt9847++;
		@Pc(21) Class15_Sub1 local21;
		if ((arg5 & 0x2) == 0) {
			for (local21 = Static234.aClass15_Sub1Array3[local5]; local21 != null; local21 = local21.aClass15_Sub1_23) {
				if (!Static566.method7879(local21, arg0, arg1, arg2, arg3)) {
					Static100.method2279(local21);
					if (local21.anInt10304 != -1) {
						Static76.aClass15_Sub1Array2[Static42.anInt1523++] = local21;
					}
				}
			}
		}
		@Pc(137) int local137;
		if ((arg5 & 0x1) == 0) {
			for (local21 = Static351.aClass15_Sub1Array4[local5]; local21 != null; local21 = local21.aClass15_Sub1_23) {
				if (!Static566.method7879(local21, arg0, arg1, arg2, arg3)) {
					Static100.method2279(local21);
					if (local21.anInt10304 != -1) {
						Static453.aClass15_Sub1Array5[Static132.anInt3519++] = local21;
					}
				}
			}
			for (@Pc(87) Class15_Sub1 local87 = Static16.aClass15_Sub1Array1[local5]; local87 != null; local87 = local87.aClass15_Sub1_23) {
				if (!Static566.method7879(local87, arg0, arg1, arg2, arg3)) {
					if (local87.method8328()) {
						Static100.method2279(local87);
						if (local87.anInt10304 != -1) {
							Static453.aClass15_Sub1Array5[Static132.anInt3519++] = local87;
						}
					} else {
						Static100.method2279(local87);
						if (local87.anInt10304 != -1) {
							Static76.aClass15_Sub1Array2[Static42.anInt1523++] = local87;
						}
					}
				}
			}
			if (!arg0) {
				for (local137 = 0; local137 < Static1.anInt10286; local137++) {
					if (!Static566.method7879(Static322.aClass15_Sub1_Sub2Array1[local137], arg0, arg1, arg2, arg3)) {
						Static100.method2279(Static322.aClass15_Sub1_Sub2Array1[local137]);
						if (Static322.aClass15_Sub1_Sub2Array1[local137].anInt10304 != -1) {
							if (Static322.aClass15_Sub1_Sub2Array1[local137].method8328()) {
								Static453.aClass15_Sub1Array5[Static132.anInt3519++] = Static322.aClass15_Sub1_Sub2Array1[local137];
							} else {
								Static76.aClass15_Sub1Array2[Static42.anInt1523++] = Static322.aClass15_Sub1_Sub2Array1[local137];
							}
						}
					}
				}
			}
		}
		@Pc(198) int local198;
		if (Static42.anInt1523 > 0) {
			Static450.method6851(Static76.aClass15_Sub1Array2, 0, Static42.anInt1523 - 1);
			for (local198 = 0; local198 < Static42.anInt1523; local198++) {
				Static107.method2391(Static76.aClass15_Sub1Array2[local198], arg6);
			}
		}
		if (Static172.aBoolean300) {
			Static269.aClass16_11.method6052(0, null);
		}
		if ((arg5 & 0x2) == 0) {
			for (local198 = Static535.anInt9214; local198 < anInt4507; local198++) {
				@Pc(271) boolean[][] local271;
				@Pc(281) int local281;
				@Pc(288) int local288;
				@Pc(290) int local290;
				@Pc(230) int local230;
				if (local198 < arg2 || arg1 == null) {
					local230 = Static100.aBooleanArrayArray3.length;
					if (Static444.anInt8261 + Static100.aBooleanArrayArray3.length > Static489.anInt8688) {
						local230 -= Static444.anInt8261 + Static100.aBooleanArrayArray3.length - Static489.anInt8688;
					}
					local137 = Static100.aBooleanArrayArray3[0].length;
					if (Static614.anInt6685 + Static100.aBooleanArrayArray3[0].length > Static596.anInt10195) {
						local137 -= Static614.anInt6685 + Static100.aBooleanArrayArray3[0].length - Static596.anInt10195;
					}
					local271 = Static565.aBooleanArrayArray8;
					if (Static545.aBoolean663) {
						if (Static403.aBoolean556) {
							local271 = Static320.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static283.anInt5875; local281 < local230; local281++) {
							local288 = local281 + Static444.anInt8261 - Static283.anInt5875;
							for (local290 = Static221.anInt5059; local290 < local137; local290++) {
								if (Static100.aBooleanArrayArray3[local281][local290] && !Static109.method2472(local288, local290 + Static614.anInt6685 - Static221.anInt5059, local198)) {
									local271[local281][local290] = true;
								} else {
									local271[local281][local290] = false;
								}
							}
						}
					}
					if (Static403.aBoolean556) {
						if (arg4 >= 0) {
							Static34.aClass86Array5[local198].method8085(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static34.aClass86Array5[local198].method8082(0, 0, 0, null, false, arg5);
						}
						for (local281 = 0; local281 < Static151.anInt3713; local281++) {
							Static49.aClass243Array1[local281].method6455(new Class15_Sub4(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static34.aClass86Array5[local198].method8085(Static603.anInt10257, Static470.anInt8495, Static183.anInt4307, Static565.aBooleanArrayArray8, true, arg4, arg5);
					} else {
						Static34.aClass86Array5[local198].method8082(Static603.anInt10257, Static470.anInt8495, Static183.anInt4307, Static565.aBooleanArrayArray8, true, arg5);
					}
				} else {
					local230 = Static100.aBooleanArrayArray3.length;
					if (Static444.anInt8261 + Static100.aBooleanArrayArray3.length > Static489.anInt8688) {
						local230 -= Static444.anInt8261 + Static100.aBooleanArrayArray3.length - Static489.anInt8688;
					}
					local137 = Static100.aBooleanArrayArray3[0].length;
					if (Static614.anInt6685 + Static100.aBooleanArrayArray3[0].length > Static596.anInt10195) {
						local137 -= Static614.anInt6685 + Static100.aBooleanArrayArray3[0].length - Static596.anInt10195;
					}
					local271 = Static565.aBooleanArrayArray8;
					if (Static545.aBoolean663) {
						if (Static403.aBoolean556) {
							local271 = Static320.aBooleanArrayArrayArray2[local198];
						}
						for (local281 = Static283.anInt5875; local281 < local230; local281++) {
							local288 = local281 + Static444.anInt8261 - Static283.anInt5875;
							for (local290 = Static221.anInt5059; local290 < local137; local290++) {
								local271[local281][local290] = false;
								if (Static100.aBooleanArrayArray3[local281][local290]) {
									@Pc(309) int local309 = local290 + Static614.anInt6685 - Static221.anInt5059;
									for (@Pc(311) int local311 = local198; local311 >= 0; local311--) {
										if (Static405.aClass56ArrayArrayArray2[local311][local288][local309] != null && Static405.aClass56ArrayArrayArray2[local311][local288][local309].aByte22 == local198) {
											if ((local311 < arg2 || arg1[local311][local288][local309] != arg3) && !Static109.method2472(local288, local309, local198)) {
												local271[local281][local290] = true;
												break;
											}
											local271[local281][local290] = false;
											break;
										}
									}
								}
							}
						}
					}
					if (Static403.aBoolean556) {
						if (arg4 >= 0) {
							Static34.aClass86Array5[local198].method8085(0, 0, 0, null, false, arg4, arg5);
						} else {
							Static34.aClass86Array5[local198].method8082(0, 0, 0, null, false, arg5);
						}
						for (local281 = 0; local281 < Static151.anInt3713; local281++) {
							Static49.aClass243Array1[local281].method6455(new Class15_Sub4(local198 + 1));
						}
					} else if (arg4 >= 0) {
						Static34.aClass86Array5[local198].method8085(Static603.anInt10257, Static470.anInt8495, Static183.anInt4307, Static565.aBooleanArrayArray8, false, arg4, arg5);
					} else {
						Static34.aClass86Array5[local198].method8082(Static603.anInt10257, Static470.anInt8495, Static183.anInt4307, Static565.aBooleanArrayArray8, false, arg5);
					}
				}
			}
		}
		if (Static132.anInt3519 > 0) {
			Static332.method5394(Static453.aClass15_Sub1Array5, 0, Static132.anInt3519 - 1);
			for (local198 = 0; local198 < Static132.anInt3519; local198++) {
				Static107.method2391(Static453.aClass15_Sub1Array5[local198], arg6);
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(BLclient!d;Lclient!ha;)V")
	public static void method3628(@OriginalArg(1) Interface2 arg0, @OriginalArg(2) Class16 arg1) {
		if (Static110.aClass8_Sub5_Sub4_3 == null) {
			return;
		}
		if (Static489.anInt8687 < 10) {
			if (!Static110.aClass237_106.method6299(Static110.aClass8_Sub5_Sub4_3.aString26)) {
				Static489.anInt8687 = Static50.aClass237_15.method6309(Static110.aClass8_Sub5_Sub4_3.aString26) / 10;
				return;
			}
			Static326.method5359();
			Static489.anInt8687 = 10;
		}
		if (Static489.anInt8687 == 10) {
			Static110.anInt7703 = Static110.aClass8_Sub5_Sub4_3.anInt2508 >> 6 << 6;
			Static110.anInt7708 = Static110.aClass8_Sub5_Sub4_3.anInt2514 >> 6 << 6;
			Static110.anInt7702 = (Static110.aClass8_Sub5_Sub4_3.anInt2506 >> 6 << 6) + 64 - Static110.anInt7708;
			Static110.anInt7701 = (Static110.aClass8_Sub5_Sub4_3.anInt2515 >> 6 << 6) + 64 - Static110.anInt7703;
			@Pc(81) int[] local81 = new int[3];
			@Pc(83) int local83 = -1;
			@Pc(85) int local85 = -1;
			if (Static110.aClass8_Sub5_Sub4_3.method2131(Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.aByte124, Static628.anInt10493 + (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301 >> 9), Static594.anInt10160 + (Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298 >> 9), local81)) {
				local85 = local81[2] - Static110.anInt7703;
				local83 = local81[1] - Static110.anInt7708;
			}
			if (!Static610.aBoolean739 && local83 >= 0 && Static110.anInt7702 > local83 && local85 >= 0 && Static110.anInt7701 > local85) {
				local83 += (int) (Math.random() * 10.0D) - 5;
				local85 += (int) (Math.random() * 10.0D) - 5;
				Static561.anInt9691 = local85;
				Static227.anInt5187 = local83;
			} else if (Static538.anInt9295 == -1 || Static129.anInt3455 == -1) {
				Static110.aClass8_Sub5_Sub4_3.method2130(Static110.aClass8_Sub5_Sub4_3.anInt2505 & 0x3FFF, Static110.aClass8_Sub5_Sub4_3.anInt2505 >> 14 & 0x3FFF, local81);
				Static561.anInt9691 = local81[2] - Static110.anInt7703;
				Static227.anInt5187 = local81[1] - Static110.anInt7708;
			} else {
				Static110.aClass8_Sub5_Sub4_3.method2130(Static129.anInt3455, Static538.anInt9295, local81);
				Static129.anInt3455 = -1;
				Static538.anInt9295 = -1;
				Static610.aBoolean739 = false;
				if (local81 != null) {
					Static561.anInt9691 = local81[2] - Static110.anInt7703;
					Static227.anInt5187 = local81[1] - Static110.anInt7708;
				}
			}
			if (Static110.aClass8_Sub5_Sub4_3.anInt2503 == 37) {
				Static110.aFloat176 = 3.0F;
				Static110.aFloat177 = 3.0F;
			} else if (Static110.aClass8_Sub5_Sub4_3.anInt2503 == 50) {
				Static110.aFloat176 = 4.0F;
				Static110.aFloat177 = 4.0F;
			} else if (Static110.aClass8_Sub5_Sub4_3.anInt2503 == 75) {
				Static110.aFloat176 = 6.0F;
				Static110.aFloat177 = 6.0F;
			} else if (Static110.aClass8_Sub5_Sub4_3.anInt2503 == 100) {
				Static110.aFloat176 = 8.0F;
				Static110.aFloat177 = 8.0F;
			} else if (Static110.aClass8_Sub5_Sub4_3.anInt2503 == 200) {
				Static110.aFloat176 = 16.0F;
				Static110.aFloat177 = 16.0F;
			} else {
				Static110.aFloat176 = 8.0F;
				Static110.aFloat177 = 8.0F;
			}
			Static110.anInt7699 = (int) Static110.aFloat176 >> 1;
			Static110.aByteArrayArrayArray21 = Static550.method8312(Static110.anInt7699);
			Static119.method2632();
			Static110.method6385();
			Static52.aClass43_15 = new Class43();
			Static110.anInt7698 += (int) (Math.random() * 5.0D) - 2;
			if (Static110.anInt7698 < -8) {
				Static110.anInt7698 = -8;
			}
			if (Static110.anInt7698 > 8) {
				Static110.anInt7698 = 8;
			}
			Static110.anInt7700 += (int) (Math.random() * 5.0D) - 2;
			if (Static110.anInt7700 < -16) {
				Static110.anInt7700 = -16;
			}
			if (Static110.anInt7700 > 16) {
				Static110.anInt7700 = 16;
			}
			Static110.method6391(arg0, Static110.anInt7698 >> 2 << 10, Static110.anInt7700 >> 1);
			Static110.aClass12_3.method138(256, 1024);
			Static110.aClass67_4.method2159(256, 256);
			Static110.aClass199_2.method5347(4096);
			Static418.aClass293_1.method7165(256);
			Static489.anInt8687 = 20;
		} else if (Static489.anInt8687 == 20) {
			Static542.method7654(true);
			Static110.method6403(arg1, Static110.anInt7698, Static110.anInt7700);
			Static489.anInt8687 = 60;
			Static542.method7654(true);
			Static200.method3717();
		} else if (Static489.anInt8687 == 60) {
			if (Static110.aClass237_106.method6302(Static110.aClass8_Sub5_Sub4_3.aString26 + "_staticelements")) {
				if (!Static110.aClass237_106.method6299(Static110.aClass8_Sub5_Sub4_3.aString26 + "_staticelements")) {
					return;
				}
				Static110.aClass14_3 = Static249.method4528(Static110.aClass237_106, Static110.aClass8_Sub5_Sub4_3.aString26 + "_staticelements", Static565.aBoolean307);
			} else {
				Static110.aClass14_3 = new Class14(0);
			}
			Static110.method6384();
			Static489.anInt8687 = 70;
			Static542.method7654(true);
			Static200.method3717();
		} else if (Static489.anInt8687 == 70) {
			Static307.aClass285_7 = new Class285(arg1, 11, true, Static549.aCanvas13);
			Static489.anInt8687 = 73;
			Static542.method7654(true);
			Static200.method3717();
		} else if (Static489.anInt8687 == 73) {
			Static78.aClass285_4 = new Class285(arg1, 12, true, Static549.aCanvas13);
			Static489.anInt8687 = 76;
			Static542.method7654(true);
			Static200.method3717();
		} else if (Static489.anInt8687 == 76) {
			Static123.aClass285_6 = new Class285(arg1, 14, true, Static549.aCanvas13);
			Static489.anInt8687 = 79;
			Static542.method7654(true);
			Static200.method3717();
		} else if (Static489.anInt8687 == 79) {
			Static356.aClass285_10 = new Class285(arg1, 17, true, Static549.aCanvas13);
			Static489.anInt8687 = 82;
			Static542.method7654(true);
			Static200.method3717();
		} else if (Static489.anInt8687 == 82) {
			Static148.aClass285_9 = new Class285(arg1, 19, true, Static549.aCanvas13);
			Static489.anInt8687 = 85;
			Static542.method7654(true);
			Static200.method3717();
		} else if (Static489.anInt8687 == 85) {
			Static63.aClass285_3 = new Class285(arg1, 22, true, Static549.aCanvas13);
			Static489.anInt8687 = 88;
			Static542.method7654(true);
			Static200.method3717();
		} else if (Static489.anInt8687 == 88) {
			Static312.aClass285_8 = new Class285(arg1, 26, true, Static549.aCanvas13);
			Static489.anInt8687 = 91;
			Static542.method7654(true);
			Static200.method3717();
		} else {
			Static82.aClass285_5 = new Class285(arg1, 30, true, Static549.aCanvas13);
			Static489.anInt8687 = 100;
			Static542.method7654(true);
			Static200.method3717();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(JZIZJZILjava/lang/String;IIZILjava/lang/String;)V")
	public static void method3629(@OriginalArg(0) long arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) long arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) String arg11) {
		if (!Static211.aBoolean370 && Static548.anInt9471 < 500) {
			@Pc(19) int local19 = arg10 == -1 ? Static341.anInt6662 : arg10;
			@Pc(40) Class8_Sub5_Sub7 local40 = new Class8_Sub5_Sub7(arg6, arg11, local19, arg5, arg2, arg4, arg8, arg7, arg9, arg3, arg0, arg1);
			Static577.method8063(local40);
		}
	}
}
