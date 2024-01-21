import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!n", name = "j", descriptor = "[Lclient!ia;")
	public static Class5_Sub1_Sub10_Sub1[] aClass5_Sub1_Sub10_Sub1Array8;

	@OriginalMember(owner = "client!n", name = "n", descriptor = "[I")
	public static int[] anIntArray225;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "I")
	public static int anInt1834 = -1;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!vc;")
	private static Class71 aClass71_888 = Static38.method736("No response from server)3");

	@OriginalMember(owner = "client!n", name = "i", descriptor = "Lclient!vc;")
	private static Class71 aClass71_889 = Static38.method736("Examine");

	@OriginalMember(owner = "client!n", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_890 = Static38.method736("");

	@OriginalMember(owner = "client!n", name = "y", descriptor = "Lclient!vc;")
	private static Class71 aClass71_895 = Static38.method736("Your profile will be transferred in:");

	@OriginalMember(owner = "client!n", name = "m", descriptor = "Lclient!vc;")
	public static Class71 aClass71_891 = aClass71_895;

	@OriginalMember(owner = "client!n", name = "o", descriptor = "Lclient!vc;")
	public static Class71 aClass71_892 = Static38.method736("Cabbage");

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	public static int anInt1838 = -1;

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Lclient!vc;")
	public static Class71 aClass71_893 = aClass71_889;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "Lclient!vc;")
	public static Class71 aClass71_894 = aClass71_888;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Z")
	public static volatile boolean aBoolean87 = true;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([BILclient!cf;B)V")
	public static void method1208(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class14 arg2) {
		@Pc(9) Class5_Sub10 local9 = new Class5_Sub10();
		local9.aClass14_3 = arg2;
		local9.aLong118 = arg1;
		local9.aByteArray21 = arg0;
		local9.anInt1988 = 0;
		@Pc(28) Class52 local28 = Static89.aClass52_11;
		synchronized (Static89.aClass52_11) {
			Static89.aClass52_11.method1362(local9);
		}
		Static5.method149();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!la;I)V")
	public static void method1209(@OriginalArg(0) Class5_Sub1_Sub1_Sub3 arg0) {
		arg0.anInt2470 = arg0.anInt2487;
		if (arg0.anInt2440 == 0) {
			arg0.anInt2454 = 0;
			return;
		}
		if (arg0.anInt2458 != -1 && arg0.anInt2471 == 0) {
			@Pc(32) Class5_Sub1_Sub18 local32 = Static57.method1017(arg0.anInt2458);
			if (arg0.anInt2435 > 0 && local32.anInt2953 == 0) {
				arg0.anInt2454++;
				return;
			}
			if (arg0.anInt2435 <= 0 && local32.anInt2957 == 0) {
				arg0.anInt2454++;
				return;
			}
		}
		@Pc(64) int local64 = arg0.anInt2474;
		@Pc(67) int local67 = arg0.anInt2452;
		@Pc(82) int local82 = arg0.anInt2475 * 64 + arg0.anIntArray261[arg0.anInt2440 - 1] * 128;
		@Pc(97) int local97 = arg0.anInt2475 * 64 + arg0.anIntArray264[arg0.anInt2440 - 1] * 128;
		if (local97 - local64 > 256 || local97 - local64 < -256 || local82 - local67 > 256 || local82 - local67 < -256) {
			arg0.anInt2474 = local97;
			arg0.anInt2452 = local82;
			return;
		}
		if (local64 < local97) {
			if (local82 > local67) {
				arg0.anInt2441 = 1280;
			} else if (local82 < local67) {
				arg0.anInt2441 = 1792;
			} else {
				arg0.anInt2441 = 1536;
			}
		} else if (local64 > local97) {
			if (local82 > local67) {
				arg0.anInt2441 = 768;
			} else if (local82 >= local67) {
				arg0.anInt2441 = 512;
			} else {
				arg0.anInt2441 = 256;
			}
		} else if (local82 > local67) {
			arg0.anInt2441 = 1024;
		} else if (local82 < local67) {
			arg0.anInt2441 = 0;
		}
		@Pc(206) int local206 = arg0.anInt2485;
		@Pc(214) int local214 = arg0.anInt2441 - arg0.anInt2456 & 0x7FF;
		@Pc(224) boolean local224 = true;
		if (local214 > 1024) {
			local214 -= 2048;
		}
		if (local214 >= -256 && local214 <= 256) {
			local206 = arg0.anInt2453;
		} else if (local214 >= 256 && local214 < 768) {
			local206 = arg0.anInt2439;
		} else if (local214 >= -768 && local214 <= -256) {
			local206 = arg0.anInt2479;
		}
		if (local206 == -1) {
			local206 = arg0.anInt2453;
		}
		arg0.anInt2470 = local206;
		@Pc(274) int local274 = 4;
		if (arg0 instanceof Class5_Sub1_Sub1_Sub3_Sub1) {
			local224 = ((Class5_Sub1_Sub1_Sub3_Sub1) arg0).aClass5_Sub1_Sub16_1.aBoolean125;
		}
		if (local224) {
			if (arg0.anInt2456 != arg0.anInt2441 && arg0.anInt2436 == -1 && arg0.anInt2443 != 0) {
				local274 = 2;
			}
			if (arg0.anInt2440 > 2) {
				local274 = 6;
			}
			if (arg0.anInt2440 > 3) {
				local274 = 8;
			}
			if (arg0.anInt2454 > 0 && arg0.anInt2440 > 1) {
				local274 = 8;
				arg0.anInt2454--;
			}
		} else {
			if (arg0.anInt2440 > 1) {
				local274 = 6;
			}
			if (arg0.anInt2440 > 2) {
				local274 = 8;
			}
			if (arg0.anInt2454 > 0 && arg0.anInt2440 > 1) {
				local274 = 8;
				arg0.anInt2454--;
			}
		}
		if (arg0.aBooleanArray15[arg0.anInt2440 - 1]) {
			local274 <<= 0x1;
		}
		if (local274 >= 8 && arg0.anInt2470 == arg0.anInt2453 && arg0.anInt2434 != -1) {
			arg0.anInt2470 = arg0.anInt2434;
		}
		if (local97 > local64) {
			arg0.anInt2474 += local274;
			if (local97 < arg0.anInt2474) {
				arg0.anInt2474 = local97;
			}
		} else if (local97 < local64) {
			arg0.anInt2474 -= local274;
			if (local97 > arg0.anInt2474) {
				arg0.anInt2474 = local97;
			}
		}
		if (local82 > local67) {
			arg0.anInt2452 += local274;
			if (local82 < arg0.anInt2452) {
				arg0.anInt2452 = local82;
			}
		} else if (local67 > local82) {
			arg0.anInt2452 -= local274;
			if (local82 > arg0.anInt2452) {
				arg0.anInt2452 = local82;
			}
		}
		if (local97 == arg0.anInt2474 && local82 == arg0.anInt2452) {
			if (arg0.anInt2435 > 0) {
				arg0.anInt2435--;
			}
			arg0.anInt2440--;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	public static void method1211(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && Static76.anInt1881 == 0) {
			Static10.method207();
		} else if (arg0 != -1 && Static97.anInt2322 != arg0 && Static7.anInt273 != 0 && Static76.anInt1881 == 0) {
			Static10.method209(Static19.aClass24_Sub1_6, Static7.anInt273, arg0, 0);
		}
		Static97.anInt2322 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!we;BLclient!we;)V")
	public static void method1212(@OriginalArg(0) Class5_Sub1_Sub10_Sub4 arg0, @OriginalArg(2) Class5_Sub1_Sub10_Sub4 arg1) {
		Static89.aClass7_64.method699();
		if (Static90.anInt3001 == 0 || Static90.anInt3001 == 5) {
			arg0.method2048(Static99.aClass71_1154, 180, 54, 16777215);
			Static52.method2027(28, 62, 304, 34, 9179409);
			Static52.method2027(29, 63, 302, 32, 0);
			Static52.method2024(30, 64, Static56.anInt1452 * 3, 30, 9179409);
			Static52.method2024(Static56.anInt1452 * 3 + 30, 64, 300 - Static56.anInt1452 * 3, 30, 0);
			arg0.method2048(Static98.aClass71_944, 180, 85, 16777215);
		}
		@Pc(86) byte local86;
		@Pc(98) int local98;
		if (Static90.anInt3001 == 20) {
			local86 = 40;
			Static48.aClass5_Sub1_Sub10_Sub1_12.method921(0, 0);
			arg0.method2040(Static98.aClass71_945, 180, 40, 16776960, true);
			local98 = local86 + 15;
			arg0.method2040(Static98.aClass71_949, 180, 55, 16776960, true);
			@Pc(106) int local106 = local98 + 15;
			arg0.method2040(Static98.aClass71_948, 180, 70, 16776960, true);
			@Pc(114) int local114 = local106 + 15;
			@Pc(115) int local115 = local114 + 10;
			arg0.method2049(Static74.method677(new Class71[] { Static85.aClass71_1018, Static98.aClass71_943 }), 90, 95, 16777215, true);
			@Pc(134) int local134 = local115 + 15;
			arg0.method2049(Static74.method677(new Class71[] { Static92.aClass71_1084, Static98.aClass71_946.method1787() }), 92, 110, 16777215, true);
			@Pc(155) int local155 = local134 + 15;
		}
		if (Static90.anInt3001 == 10) {
			Static48.aClass5_Sub1_Sub10_Sub1_12.method921(0, 0);
			if (Static7.anInt269 == 0) {
				local86 = 80;
				arg0.method2040(Static28.aClass71_443, 180, 80, 16776960, true);
				local98 = local86 + 30;
				Static49.aClass5_Sub1_Sub10_Sub1_14.method921(27, 100);
				arg0.method2036(Static83.aClass71_1000, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static49.aClass5_Sub1_Sub10_Sub1_14.method921(187, 100);
				arg0.method2036(Static111.aClass71_544, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (Static7.anInt269 == 2) {
				local86 = 40;
				arg0.method2040(Static98.aClass71_945, 180, 40, 16776960, true);
				local98 = local86 + 15;
				arg0.method2040(Static98.aClass71_949, 180, 55, 16776960, true);
				local98 += 15;
				arg0.method2040(Static98.aClass71_948, 180, 70, 16776960, true);
				local98 += 15;
				local98 += 10;
				arg0.method2049(Static74.method677(new Class71[] { Static85.aClass71_1018, Static98.aClass71_943, Static95.anInt2285 % 40 < 20 & Static106.anInt2520 == 0 ? Static42.aClass71_608 : Static98.aClass71_947 }), 90, 95, 16777215, true);
				local98 += 15;
				arg0.method2049(Static74.method677(new Class71[] { Static92.aClass71_1084, Static98.aClass71_946.method1787(), Static106.anInt2520 == 1 & Static95.anInt2285 % 40 < 20 ? Static42.aClass71_608 : Static98.aClass71_947 }), 92, 110, 16777215, true);
				local98 += 15;
				Static49.aClass5_Sub1_Sub10_Sub1_14.method921(27, 130);
				arg0.method2040(Static115.aClass71_1305, 100, 155, 16777215, true);
				Static49.aClass5_Sub1_Sub10_Sub1_14.method921(187, 130);
				arg0.method2040(Static41.aClass71_597, 260, 155, 16777215, true);
			} else if (Static7.anInt269 == 3) {
				arg0.method2040(Static103.aClass71_1206, 180, 40, 16776960, true);
				local86 = 65;
				arg0.method2040(Static41.aClass71_602, 180, 65, 16777215, true);
				local98 = local86 + 15;
				arg0.method2040(Static112.aClass71_1294, 180, 80, 16777215, true);
				local98 += 15;
				arg0.method2040(Static9.aClass71_217, 180, 95, 16777215, true);
				local98 += 15;
				arg0.method2040(Static117.aClass71_1366, 180, 110, 16777215, true);
				local98 += 15;
				Static49.aClass5_Sub1_Sub10_Sub1_14.method921(107, 130);
				arg0.method2040(Static41.aClass71_597, 180, 155, 16777215, true);
			}
		}
		Static68.method1139();
		try {
			@Pc(462) Graphics local462 = Static105.aCanvas1.getGraphics();
			Static89.aClass7_64.method697(202, local462, 171);
			Static6.aClass7_10.method697(0, local462, 0);
			Static82.aClass7_61.method697(637, local462, 0);
			if (aBoolean87) {
				aBoolean87 = false;
				Static26.aClass7_44.method697(128, local462, 0);
				Static62.aClass7_50.method697(202, local462, 371);
				Static114.aClass7_81.method697(0, local462, 265);
				Static1.aClass7_1.method697(562, local462, 265);
				Static25.aClass7_27.method697(128, local462, 171);
				Static24.aClass7_26.method697(562, local462, 171);
			}
		} catch (@Pc(526) Exception local526) {
			Static105.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public static void method1213() {
		aClass5_Sub1_Sub10_Sub1Array8 = null;
		aClass71_895 = null;
		aClass71_894 = null;
		anIntArray225 = null;
		aClass71_890 = null;
		aClass71_889 = null;
		aClass71_893 = null;
		aClass71_892 = null;
		aClass71_888 = null;
		aClass71_891 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(ILclient!eb;)V")
	public static synchronized void method1214(@OriginalArg(1) Class5_Sub2 arg0) {
		Static119.aClass5_Sub2_4 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([II)V")
	public static synchronized void method1215(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = arg1;
		if (Static102.aBoolean104) {
			local1 = arg1 << 1;
		}
		@Pc(9) int local9 = 0;
		local1 -= 7;
		while (local9 < local1) {
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
		}
		local1 += 7;
		while (local9 < local1) {
			arg0[local9++] = 0;
		}
		Static34.anInt963 -= arg1;
		if (Static119.aClass5_Sub2_4 != null && Static34.anInt963 <= 0) {
			Static34.anInt963 += Static72.anInt1825 >> 4;
			Static86.method1979(Static119.aClass5_Sub2_4);
			Static88.method1401(Static119.aClass5_Sub2_4, Static119.aClass5_Sub2_4.method1116());
			@Pc(88) int local88 = 0;
			@Pc(90) int local90 = 255;
			@Pc(92) int local92 = 7;
			@Pc(99) int local99;
			label110: while (local90 != 0) {
				@Pc(104) int local104;
				if (local92 < 0) {
					local99 = local92 & 0x3;
					local104 = -(local92 >> 2);
				} else {
					local99 = local92;
					local104 = 0;
				}
				for (@Pc(115) int local115 = local90 >>> local99 & 0x11111111; local115 != 0; local115 >>>= 0x4) {
					if ((local115 & 0x1) != 0) {
						local90 &= ~(0x1 << local99);
						@Pc(131) Class5_Sub2 local131 = null;
						@Pc(135) Class5_Sub2 local135 = Static109.aClass5_Sub2Array2[local99];
						label104: while (true) {
							while (true) {
								if (local135 == null) {
									break label104;
								}
								@Pc(139) Class5_Sub15 local139 = local135.aClass5_Sub15_3;
								if (local139 == null || local139.anInt2840 <= local104) {
									local135.aBoolean70 = true;
									@Pc(163) int local163 = local135.method1112();
									local88 += local163;
									if (local139 != null) {
										local139.anInt2840 += local163;
									}
									if (local88 >= Static24.anInt733) {
										break label110;
									}
									@Pc(181) Class5_Sub2 local181 = local135.method1115();
									if (local181 != null) {
										@Pc(186) int local186 = local135.anInt1630;
										while (local181 != null) {
											Static88.method1401(local181, local186 * local181.method1116() >> 8);
											local181 = local135.method1114();
										}
									}
									@Pc(204) Class5_Sub2 local204 = local135.aClass5_Sub2_3;
									local135.aClass5_Sub2_3 = null;
									if (local131 == null) {
										Static109.aClass5_Sub2Array2[local99] = local204;
									} else {
										local131.aClass5_Sub2_3 = local204;
									}
									if (local204 == null) {
										Static89.aClass5_Sub2Array1[local99] = local131;
									}
									local135 = local204;
								} else {
									local90 |= 0x1 << local99;
									local131 = local135;
									local135 = local135.aClass5_Sub2_3;
								}
							}
						}
					}
					local99 += 4;
					local104++;
				}
				local92--;
			}
			for (local99 = 0; local99 < 8; local99++) {
				@Pc(244) Class5_Sub2 local244 = Static109.aClass5_Sub2Array2[local99];
				Static109.aClass5_Sub2Array2[local99] = Static89.aClass5_Sub2Array1[local99] = null;
				while (local244 != null) {
					@Pc(256) Class5_Sub2 local256 = local244.aClass5_Sub2_3;
					local244.aClass5_Sub2_3 = null;
					local244 = local256;
				}
			}
		}
		if (Static34.anInt963 < 0) {
			Static34.anInt963 = 0;
		}
		if (Static119.aClass5_Sub2_4 != null) {
			Static119.aClass5_Sub2_4.method1113(arg0, 0, arg1);
		}
		Static14.method412(arg1);
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
	public static void method1216(@OriginalArg(1) int arg0) {
		if (Static119.aClass11_1 == null) {
			return;
		}
		if (Static40.anInt717 != 0) {
			if (Static9.aByteArray1 == null) {
				return;
			}
			Static102.anInt2389 = arg0;
		} else if (Static118.anInt2916 >= 0) {
			Static118.anInt2916 = arg0;
			Static119.aClass11_1.method1278(arg0, 0);
			return;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V")
	public static synchronized void method1217() {
		Static34.anInt963 -= 256;
		if (Static34.anInt963 < 0) {
			Static34.anInt963 = 0;
		}
		if (Static119.aClass5_Sub2_4 != null) {
			Static119.aClass5_Sub2_4.method1117(256);
		}
		Static14.method412(256);
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!me;I)Lclient!me;")
	public static Class5_Sub1_Sub11 method1218(@OriginalArg(0) Class5_Sub1_Sub11 arg0) {
		@Pc(3) Class5_Sub1_Sub11 local3 = Static94.method1566(arg0);
		if (local3 == null) {
			local3 = arg0.aClass5_Sub1_Sub11_3;
		}
		return local3;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)V")
	public static void method1219(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			Static61.aClass5_Sub11_Sub1_8.method1553(226);
			Static61.aClass5_Sub11_Sub1_8.method1525(arg0);
			Static61.aClass5_Sub11_Sub1_8.method1501(arg1);
		}
		if (arg2 == 2) {
			Static61.aClass5_Sub11_Sub1_8.method1553(219);
			Static61.aClass5_Sub11_Sub1_8.method1525(arg0);
			Static61.aClass5_Sub11_Sub1_8.method1501(arg1);
		}
		if (arg2 == 3) {
			Static61.aClass5_Sub11_Sub1_8.method1553(71);
			Static61.aClass5_Sub11_Sub1_8.method1525(arg0);
			Static61.aClass5_Sub11_Sub1_8.method1501(arg1);
		}
		if (arg2 == 4) {
			Static61.aClass5_Sub11_Sub1_8.method1553(156);
			Static61.aClass5_Sub11_Sub1_8.method1525(arg0);
			Static61.aClass5_Sub11_Sub1_8.method1501(arg1);
		}
		if (arg2 == 5) {
			Static61.aClass5_Sub11_Sub1_8.method1553(192);
			Static61.aClass5_Sub11_Sub1_8.method1525(arg0);
			Static61.aClass5_Sub11_Sub1_8.method1501(arg1);
		}
		if (arg2 == 6) {
			Static61.aClass5_Sub11_Sub1_8.method1553(163);
			Static61.aClass5_Sub11_Sub1_8.method1525(arg0);
			Static61.aClass5_Sub11_Sub1_8.method1501(arg1);
		}
		if (arg2 == 7) {
			Static61.aClass5_Sub11_Sub1_8.method1553(213);
			Static61.aClass5_Sub11_Sub1_8.method1525(arg0);
			Static61.aClass5_Sub11_Sub1_8.method1501(arg1);
		}
		if (arg2 == 8) {
			Static61.aClass5_Sub11_Sub1_8.method1553(190);
			Static61.aClass5_Sub11_Sub1_8.method1525(arg0);
			Static61.aClass5_Sub11_Sub1_8.method1501(arg1);
		}
		if (arg2 == 9) {
			Static61.aClass5_Sub11_Sub1_8.method1553(137);
			Static61.aClass5_Sub11_Sub1_8.method1525(arg0);
			Static61.aClass5_Sub11_Sub1_8.method1501(arg1);
		}
		if (arg2 == 10) {
			Static61.aClass5_Sub11_Sub1_8.method1553(200);
			Static61.aClass5_Sub11_Sub1_8.method1525(arg0);
			Static61.aClass5_Sub11_Sub1_8.method1501(arg1);
		}
		@Pc(224) Class5_Sub1_Sub11 local224 = Static23.method550(arg1, arg0);
		if (local224 != null && local224.anObjectArray7 != null) {
			Static53.method972(0, null, local224.anObjectArray7, arg2, 0, local224);
		}
	}
}
