import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "Lclient!pk;")
	public static Class132 aClass132_12;

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "[I")
	public static int[] anIntArray57;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "Lclient!pk;")
	public static Class132 aClass132_13;

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "J")
	public static long aLong29 = 0L;

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Z")
	public static boolean aBoolean50 = true;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "[F")
	public static float[] aFloatArray2 = new float[4];

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V")
	public static void method553() {
		if (Static195.method2233() != 2) {
			return;
		}
		@Pc(22) int local22 = Static207.anInt4304 % 104;
		@Pc(29) byte local29 = (byte) (Static207.anInt4304 - 4 & 0xFF);
		@Pc(31) int local31;
		@Pc(38) int local38;
		for (local31 = 0; local31 < 4; local31++) {
			for (local38 = 0; local38 < 104; local38++) {
				Static123.aByteArrayArrayArray5[local31][local22][local38] = local29;
			}
		}
		if (Static34.anInt770 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static144.anIntArray233[local31] = -1000000;
			Static119.anIntArray194[local31] = 1000000;
			Static255.anIntArray391[local31] = 0;
			Static172.anIntArray260[local31] = 1000000;
			Static41.anIntArray62[local31] = 0;
		}
		if (Static172.anInt3428 != 1) {
			local31 = Static59.method927(Static46.anInt1044, Static185.anInt3689, Static34.anInt770);
			if (local31 - Static170.anInt3411 < 800 && (Static170.aByteArrayArrayArray9[Static34.anInt770][Static46.anInt1044 >> 7][Static185.anInt3689 >> 7] & 0x4) != 0) {
				Static269.method3758(false, 1, Static185.anInt3689 >> 7, Static178.aClass8_Sub27ArrayArrayArray1, Static46.anInt1044 >> 7);
			}
			return;
		}
		if ((Static170.aByteArrayArrayArray9[Static34.anInt770][Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7][Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7] & 0x4) != 0) {
			Static269.method3758(false, 0, Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7, Static178.aClass8_Sub27ArrayArrayArray1, Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7);
		}
		if (Static56.anInt1246 >= 310) {
			return;
		}
		@Pc(182) int local182 = Static21.aClass36_Sub3_Sub1_1.anInt4117 >> 7;
		local31 = Static46.anInt1044 >> 7;
		local38 = Static185.anInt3689 >> 7;
		@Pc(195) int local195 = Static21.aClass36_Sub3_Sub1_1.anInt4118 >> 7;
		@Pc(207) int local207;
		if (local31 >= local182) {
			local207 = local31 - local182;
		} else {
			local207 = local182 - local31;
		}
		@Pc(222) int local222;
		if (local195 > local38) {
			local222 = local195 - local38;
		} else {
			local222 = local38 - local195;
		}
		if (local207 == 0 && local222 == 0 || local207 <= -104 || local207 >= 104 || local222 <= -104 || local222 >= 104) {
			Static88.method1444("RC: " + local31 + "," + local38 + " " + local182 + "," + local195 + " " + Static49.anInt1089 + "," + Static130.anInt2601, null);
			return;
		}
		@Pc(293) int local293;
		@Pc(295) int local295;
		if (local222 >= local207) {
			local293 = local207 * 65536 / local222;
			local295 = 32768;
			while (local38 != local195) {
				if (local195 > local38) {
					local38++;
				} else if (local38 > local195) {
					local38--;
				}
				if ((Static170.aByteArrayArrayArray9[Static34.anInt770][local31][local38] & 0x4) != 0) {
					Static269.method3758(false, 1, local38, Static178.aClass8_Sub27ArrayArrayArray1, local31);
					break;
				}
				local295 += local293;
				if (local295 >= 65536) {
					local295 -= 65536;
					if (local31 < local182) {
						local31++;
					} else if (local31 > local182) {
						local31--;
					}
					if ((Static170.aByteArrayArrayArray9[Static34.anInt770][local31][local38] & 0x4) != 0) {
						Static269.method3758(false, 1, local38, Static178.aClass8_Sub27ArrayArrayArray1, local31);
						break;
					}
				}
			}
			return;
		}
		local293 = local222 * 65536 / local207;
		local295 = 32768;
		while (local31 != local182) {
			if (local31 < local182) {
				local31++;
			} else if (local182 < local31) {
				local31--;
			}
			if ((Static170.aByteArrayArrayArray9[Static34.anInt770][local31][local38] & 0x4) != 0) {
				Static269.method3758(false, 1, local38, Static178.aClass8_Sub27ArrayArrayArray1, local31);
				break;
			}
			local295 += local293;
			if (local295 >= 65536) {
				local295 -= 65536;
				if (local38 < local195) {
					local38++;
				} else if (local195 < local38) {
					local38--;
				}
				if ((Static170.aByteArrayArrayArray9[Static34.anInt770][local31][local38] & 0x4) != 0) {
					Static269.method3758(false, 1, local38, Static178.aClass8_Sub27ArrayArrayArray1, local31);
					break;
				}
			}
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILclient!tk;I)V")
	public static void method554(@OriginalArg(1) int arg0, @OriginalArg(2) Class159 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt5166 == 1) {
			Static28.method477(0, arg1.aString185, arg1.anInt5199, "", -1, 0L, (short) 24);
		}
		@Pc(37) String local37;
		if (arg1.anInt5166 == 2 && !Static215.aBoolean357) {
			local37 = Static91.method1475(arg1);
			if (local37 != null) {
				Static28.method477(-1, local37, arg1.anInt5199, "<col=00ff00>" + arg1.aString183, -1, 0L, (short) 9);
			}
		}
		if (arg1.anInt5166 == 3) {
			Static28.method477(0, Static269.aString174, arg1.anInt5199, "", -1, 0L, (short) 26);
		}
		if (arg1.anInt5166 == 4) {
			Static28.method477(0, arg1.aString185, arg1.anInt5199, "", -1, 0L, (short) 32);
		}
		if (arg1.anInt5166 == 5) {
			Static28.method477(0, arg1.aString185, arg1.anInt5199, "", -1, 0L, (short) 8);
		}
		if (arg1.anInt5166 == 6 && Static272.aClass159_19 == null) {
			Static28.method477(-1, arg1.aString185, arg1.anInt5199, "", -1, 0L, (short) 25);
		}
		@Pc(163) int local163;
		@Pc(161) int local161;
		if (arg1.anInt5197 == 2) {
			local161 = 0;
			for (local163 = 0; local163 < arg1.anInt5156; local163++) {
				for (@Pc(173) int local173 = 0; local173 < arg1.anInt5145; local173++) {
					@Pc(188) int local188 = (arg1.anInt5149 + 32) * local173;
					@Pc(195) int local195 = (arg1.anInt5179 + 32) * local163;
					if (local161 < 20) {
						local188 += arg1.anIntArray398[local161];
						local195 += arg1.anIntArray400[local161];
					}
					if (arg2 >= local188 && local195 <= arg0 && local188 + 32 > arg2 && local195 + 32 > arg0) {
						Static65.anInt5538 = local161;
						Static177.aClass159_8 = arg1;
						if (arg1.anIntArray394[local161] > 0) {
							@Pc(253) Class8_Sub24 local253 = Static42.method668(arg1);
							@Pc(262) Class10 local262 = Static140.method2222(arg1.anIntArray394[local161] - 1);
							if (Static149.anInt3012 == 1 && local253.method3357()) {
								if (arg1.anInt5199 != Static274.anInt5395 || local161 != Static244.anInt4874) {
									Static28.method477(local161, Static255.aString176, arg1.anInt5199, Static141.aString100 + " -> <col=ff9040>" + local262.aString13, -1, (long) local262.anInt118, (short) 29);
								}
							} else if (Static215.aBoolean357 && local253.method3357()) {
								@Pc(321) Class8_Sub1_Sub13 local321 = Static167.anInt3364 == -1 ? null : Static168.method4141(Static167.anInt3364);
								if ((Static234.anInt4722 & 0x10) != 0 && (local321 == null || local262.method84(Static167.anInt3364, local321.anInt4335) != local321.anInt4335)) {
									Static28.method477(local161, Static47.aString39, arg1.anInt5199, Static153.aString105 + " -> <col=ff9040>" + local262.aString13, Static57.anInt1261, (long) local262.anInt118, (short) 14);
								}
							} else {
								@Pc(380) String[] local380 = local262.aStringArray2;
								if (Static31.aBoolean47) {
									local380 = Static52.method840(local380);
								}
								@Pc(393) int local393;
								@Pc(411) byte local411;
								if (local253.method3357()) {
									for (local393 = 4; local393 >= 3; local393--) {
										if (local380 != null && local380[local393] != null) {
											if (local393 == 3) {
												local411 = 37;
											} else {
												local411 = 36;
											}
											Static28.method477(local161, local380[local393], arg1.anInt5199, "<col=ff9040>" + local262.aString13, -1, (long) local262.anInt118, local411);
										}
									}
								}
								if (local253.method3358()) {
									Static28.method477(local161, Static255.aString176, arg1.anInt5199, "<col=ff9040>" + local262.aString13, Static241.anInt4825, (long) local262.anInt118, (short) 1);
								}
								if (local253.method3357() && local380 != null) {
									for (local393 = 2; local393 >= 0; local393--) {
										if (local380[local393] != null) {
											local411 = 0;
											if (local393 == 0) {
												local411 = 35;
											}
											if (local393 == 1) {
												local411 = 15;
											}
											if (local393 == 2) {
												local411 = 2;
											}
											Static28.method477(local161, local380[local393], arg1.anInt5199, "<col=ff9040>" + local262.aString13, -1, (long) local262.anInt118, local411);
										}
									}
								}
								local380 = arg1.aStringArray74;
								if (Static31.aBoolean47) {
									local380 = Static52.method840(local380);
								}
								if (local380 != null) {
									for (local393 = 4; local393 >= 0; local393--) {
										if (local380[local393] != null) {
											local411 = 0;
											if (local393 == 0) {
												local411 = 51;
											}
											if (local393 == 1) {
												local411 = 28;
											}
											if (local393 == 2) {
												local411 = 13;
											}
											if (local393 == 3) {
												local411 = 43;
											}
											if (local393 == 4) {
												local411 = 33;
											}
											Static28.method477(local161, local380[local393], arg1.anInt5199, "<col=ff9040>" + local262.aString13, -1, (long) local262.anInt118, local411);
										}
									}
								}
								Static28.method477(local161, Static187.aString131, arg1.anInt5199, "<col=ff9040>" + local262.aString13, Static60.anInt1302, (long) local262.anInt118, (short) 1006);
							}
						}
					}
					local161++;
				}
			}
		}
		if (!arg1.aBoolean423) {
			return;
		}
		if (!Static215.aBoolean357) {
			for (local161 = 9; local161 >= 5; local161--) {
				@Pc(720) String local720 = Static84.method1373(arg1, local161);
				if (local720 != null) {
					Static28.method477(arg1.anInt5133, local720, arg1.anInt5199, arg1.aString178, Static123.method1972(local161, arg1), (long) (local161 + 1), (short) 1004);
				}
			}
			local37 = Static91.method1475(arg1);
			if (local37 != null) {
				Static28.method477(arg1.anInt5133, local37, arg1.anInt5199, arg1.aString178, -1, 0L, (short) 9);
			}
			for (local163 = 4; local163 >= 0; local163--) {
				@Pc(784) String local784 = Static84.method1373(arg1, local163);
				if (local784 != null) {
					Static28.method477(arg1.anInt5133, local784, arg1.anInt5199, arg1.aString178, Static123.method1972(local163, arg1), (long) (local163 + 1), (short) 42);
				}
			}
			if (Static42.method668(arg1).method3360()) {
				if (arg1.aString184 == null) {
					Static28.method477(arg1.anInt5133, Static203.aString148, arg1.anInt5199, "", -1, 0L, (short) 25);
				} else {
					Static28.method477(arg1.anInt5133, arg1.aString184, arg1.anInt5199, "", -1, 0L, (short) 25);
				}
			}
		} else if (Static42.method668(arg1).method3349() && (Static234.anInt4722 & 0x20) != 0) {
			Static28.method477(arg1.anInt5133, Static47.aString39, arg1.anInt5199, Static153.aString105 + " -> " + arg1.aString178, Static57.anInt1261, 0L, (short) 19);
		}
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V")
	public static void method555() {
		Static210.aClass129_23.method3047();
		Static298.aClass164_2.method3994();
		Static84.aClass164_4.method3994();
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BI)Z")
	public static boolean method556(@OriginalArg(1) int arg0) {
		return (-arg0 & arg0) == arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)Lclient!nn;")
	public static Class13_Sub1 method557() {
		return Static49.anInt1081 < Static51.aClass13_Sub1Array1.length ? Static51.aClass13_Sub1Array1[Static49.anInt1081++] : null;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
	public static void method558() {
		@Pc(11) int local11 = Static111.anInt2293;
		@Pc(13) int local13 = Static215.anInt4426;
		@Pc(15) int local15 = Static17.anInt485;
		@Pc(19) int local19 = Static202.anInt4178 - 3;
		if (Static58.aClass8_Sub1_Sub7_5 == null || Static230.aClass8_Sub1_Sub7_10 == null) {
			if (Static145.aClass132_55.method3166(Static97.anInt2006) && Static145.aClass132_55.method3166(Static50.anInt1117)) {
				Static58.aClass8_Sub1_Sub7_5 = Static235.method3576(Static97.anInt2006, Static145.aClass132_55);
				Static230.aClass8_Sub1_Sub7_10 = Static235.method3576(Static50.anInt1117, Static145.aClass132_55);
				if (Static116.aBoolean188) {
					if (Static58.aClass8_Sub1_Sub7_5 instanceof Class8_Sub1_Sub7_Sub1_Sub1) {
						Static58.aClass8_Sub1_Sub7_5 = new Class8_Sub1_Sub7_Sub2_Sub1((Class8_Sub1_Sub7_Sub1) Static58.aClass8_Sub1_Sub7_5);
					} else {
						Static58.aClass8_Sub1_Sub7_5 = new Class8_Sub1_Sub7_Sub2((Class8_Sub1_Sub7_Sub1) Static58.aClass8_Sub1_Sub7_5);
					}
					if (Static230.aClass8_Sub1_Sub7_10 instanceof Class8_Sub1_Sub7_Sub1_Sub1) {
						Static230.aClass8_Sub1_Sub7_10 = new Class8_Sub1_Sub7_Sub2_Sub1((Class8_Sub1_Sub7_Sub1) Static230.aClass8_Sub1_Sub7_10);
					} else {
						Static230.aClass8_Sub1_Sub7_10 = new Class8_Sub1_Sub7_Sub2((Class8_Sub1_Sub7_Sub1) Static230.aClass8_Sub1_Sub7_10);
					}
				}
			} else if (Static116.aBoolean188) {
				Static126.method2000(local11, local13, local15, 20, Static101.anInt2131, 256 - Static299.anInt5715);
			} else {
				Static103.method1678(local11, local13, local15, 20, Static101.anInt2131, 256 - Static299.anInt5715);
			}
		}
		@Pc(128) int local128;
		@Pc(130) int local130;
		if (Static58.aClass8_Sub1_Sub7_5 != null && Static230.aClass8_Sub1_Sub7_10 != null) {
			local128 = (local15 - Static230.aClass8_Sub1_Sub7_10.anInt3602 * 2) / Static58.aClass8_Sub1_Sub7_5.anInt3602;
			for (local130 = 0; local130 < local128; local130++) {
				Static58.aClass8_Sub1_Sub7_5.method2811(Static230.aClass8_Sub1_Sub7_10.anInt3602 + local11 + Static58.aClass8_Sub1_Sub7_5.anInt3602 * local130, local13);
			}
			Static230.aClass8_Sub1_Sub7_10.method2811(local11, local13);
			Static230.aClass8_Sub1_Sub7_10.method2812(local15 + local11 - Static230.aClass8_Sub1_Sub7_10.anInt3602, local13);
		}
		Static229.aClass8_Sub1_Sub5_3.method2027(Static183.aString127, local11 + 3, local13 - -14, Static200.anInt4050, -1);
		if (Static116.aBoolean188) {
			Static126.method2000(local11, local13 + 20, local15, local19 - 20, Static101.anInt2131, 256 - Static299.anInt5715);
		} else {
			Static103.method1678(local11, local13 + 20, local15, local19 - 20, Static101.anInt2131, 256 - Static299.anInt5715);
		}
		local130 = Static106.anInt2198;
		local128 = Static182.anInt3572;
		@Pc(212) int local212;
		@Pc(234) int local234;
		for (local212 = 0; local212 < Static185.anInt3679; local212++) {
			local234 = local13 + (-local212 + Static185.anInt3679 - 1) * 15 + 13 + 20;
			if (local11 < local128 && local15 + local11 > local128 && local130 > local234 - 13 && local234 + 3 > local130) {
				if (Static116.aBoolean188) {
					Static126.method2000(local11, local234 - 12, local15, 15, Static235.anInt4747, 256 - Static25.anInt660);
				} else {
					Static103.method1678(local11, local234 - 12, local15, 15, Static235.anInt4747, 256 - Static25.anInt660);
				}
			}
		}
		if ((Static211.aClass8_Sub1_Sub7_8 == null || Static175.aClass8_Sub1_Sub7_6 == null || Static46.aClass8_Sub1_Sub7_1 == null) && Static145.aClass132_55.method3166(Static38.anInt848) && Static145.aClass132_55.method3166(Static120.anInt2415) && Static145.aClass132_55.method3166(Static227.anInt4636)) {
			Static211.aClass8_Sub1_Sub7_8 = Static235.method3576(Static38.anInt848, Static145.aClass132_55);
			Static175.aClass8_Sub1_Sub7_6 = Static235.method3576(Static120.anInt2415, Static145.aClass132_55);
			Static46.aClass8_Sub1_Sub7_1 = Static235.method3576(Static227.anInt4636, Static145.aClass132_55);
			if (Static116.aBoolean188) {
				if (Static211.aClass8_Sub1_Sub7_8 instanceof Class8_Sub1_Sub7_Sub1_Sub1) {
					Static211.aClass8_Sub1_Sub7_8 = new Class8_Sub1_Sub7_Sub2_Sub1((Class8_Sub1_Sub7_Sub1) Static211.aClass8_Sub1_Sub7_8);
				} else {
					Static211.aClass8_Sub1_Sub7_8 = new Class8_Sub1_Sub7_Sub2((Class8_Sub1_Sub7_Sub1) Static211.aClass8_Sub1_Sub7_8);
				}
				if (Static175.aClass8_Sub1_Sub7_6 instanceof Class8_Sub1_Sub7_Sub1_Sub1) {
					Static175.aClass8_Sub1_Sub7_6 = new Class8_Sub1_Sub7_Sub2_Sub1((Class8_Sub1_Sub7_Sub1) Static175.aClass8_Sub1_Sub7_6);
				} else {
					Static175.aClass8_Sub1_Sub7_6 = new Class8_Sub1_Sub7_Sub2((Class8_Sub1_Sub7_Sub1) Static175.aClass8_Sub1_Sub7_6);
				}
				if (Static46.aClass8_Sub1_Sub7_1 instanceof Class8_Sub1_Sub7_Sub1_Sub1) {
					Static46.aClass8_Sub1_Sub7_1 = new Class8_Sub1_Sub7_Sub2_Sub1((Class8_Sub1_Sub7_Sub1) Static46.aClass8_Sub1_Sub7_1);
				} else {
					Static46.aClass8_Sub1_Sub7_1 = new Class8_Sub1_Sub7_Sub2((Class8_Sub1_Sub7_Sub1) Static46.aClass8_Sub1_Sub7_1);
				}
			}
		}
		@Pc(445) int local445;
		if (Static211.aClass8_Sub1_Sub7_8 != null && Static175.aClass8_Sub1_Sub7_6 != null && Static46.aClass8_Sub1_Sub7_1 != null) {
			local212 = (local15 - Static46.aClass8_Sub1_Sub7_1.anInt3602 * 2) / Static211.aClass8_Sub1_Sub7_8.anInt3602;
			for (local234 = 0; local234 < local212; local234++) {
				Static211.aClass8_Sub1_Sub7_8.method2811(local234 * Static211.aClass8_Sub1_Sub7_8.anInt3602 + local11 + Static46.aClass8_Sub1_Sub7_1.anInt3602, -Static211.aClass8_Sub1_Sub7_8.anInt3603 + local13 - -local19);
			}
			local234 = (local19 - Static46.aClass8_Sub1_Sub7_1.anInt3603 - 20) / Static175.aClass8_Sub1_Sub7_6.anInt3603;
			for (local445 = 0; local445 < local234; local445++) {
				Static175.aClass8_Sub1_Sub7_6.method2811(local11, local13 + Static175.aClass8_Sub1_Sub7_6.anInt3603 * local445 + 20);
				Static175.aClass8_Sub1_Sub7_6.method2812(local11 + local15 - Static175.aClass8_Sub1_Sub7_6.anInt3602, Static175.aClass8_Sub1_Sub7_6.anInt3603 * local445 + (local13 - -20));
			}
			Static46.aClass8_Sub1_Sub7_1.method2811(local11, local13 + local19 - Static46.aClass8_Sub1_Sub7_1.anInt3603);
			Static46.aClass8_Sub1_Sub7_1.method2812(local15 + local11 - Static46.aClass8_Sub1_Sub7_1.anInt3602, -Static46.aClass8_Sub1_Sub7_1.anInt3603 + local19 + local13);
		}
		for (local212 = 0; local212 < Static185.anInt3679; local212++) {
			local234 = local13 + (-local212 + Static185.anInt3679 - 1) * 15 + 33;
			local445 = Static200.anInt4050;
			if (local128 > local11 && local128 < local15 + local11 && local234 - 13 < local130 && local130 < local234 + 3) {
				local445 = Static299.anInt5729;
			}
			Static229.aClass8_Sub1_Sub5_3.method2027(Static105.method1704(local212), local11 + 3, local234, local445, 0);
		}
		Static128.method2076(Static111.anInt2293, Static215.anInt4426, Static202.anInt4178, Static17.anInt485);
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIZIIIIII)V")
	public static void method559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(10) int arg7, @OriginalArg(11) int arg8) {
		@Pc(10) int local10 = arg7 - arg5;
		@Pc(14) int local14 = arg2 - arg3;
		@Pc(16) int local16 = -1;
		if (Static189.anInt3789 > 0) {
			if (Static3.anInt4882 > 10) {
				local16 = (10 + 10 - Static3.anInt4882) * 5;
			} else {
				local16 = Static3.anInt4882 * 5;
			}
		}
		@Pc(47) int local47 = 983040 / arg1;
		@Pc(51) int local51 = 983040 / arg6;
		for (@Pc(54) int local54 = -local47; local54 < local47 + local10; local54++) {
			@Pc(71) int local71 = local54 * arg1 >> 16;
			@Pc(81) int local81 = (local54 + 1) * arg1 >> 16;
			@Pc(85) int local85 = local81 - local71;
			if (local85 > 0) {
				local71 += arg0;
				@Pc(105) int local105 = arg5 + local54 >> 6;
				if (local105 >= 0 && local105 <= Static257.anIntArrayArrayArray15.length - 1) {
					@Pc(122) int[][] local122 = Static257.anIntArrayArrayArray15[local105];
					for (@Pc(125) int local125 = -local51; local125 < local51 + local14; local125++) {
						@Pc(142) int local142 = local125 * arg6 >> 16;
						@Pc(152) int local152 = arg6 * (local125 + 1) >> 16;
						@Pc(157) int local157 = local152 - local142;
						if (local157 > 0) {
							local142 += arg8;
							@Pc(173) int local173 = arg3 + local125 >> 6;
							if (local173 >= 0 && local173 <= local122.length - 1 && local122[local173] != null) {
								@Pc(207) int local207 = ((arg3 + local125 & 0x3F) << 6) + (arg5 + local54 & 0x3F);
								@Pc(213) int local213 = local122[local173][local207];
								if (local213 != 0) {
									@Pc(224) Class70 local224 = Static235.method3578(local213 - 1);
									if (!Static136.aBooleanArray9[local224.anInt2054]) {
										if (local16 != -1 && Static58.anInt2236 == local224.anInt2054) {
											@Pc(258) Class8_Sub22 local258 = new Class8_Sub22();
											local258.anInt3441 = local71;
											local258.anInt3446 = local224.anInt2054;
											local258.anInt3445 = local142;
											Static52.aClass182_6.method4328(local258);
										} else {
											Static105.aClass8_Sub1_Sub7_Sub1Array2[local224.anInt2054].method2811(local71 - 7, local142 - 7);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (@Pc(285) Class8_Sub22 local285 = (Class8_Sub22) Static52.aClass182_6.method4319(); local285 != null; local285 = (Class8_Sub22) Static52.aClass182_6.method4329()) {
			Static103.method1679(local285.anInt3441, local285.anInt3445, 15, local16);
			Static103.method1679(local285.anInt3441, local285.anInt3445, 13, local16);
			Static103.method1679(local285.anInt3441, local285.anInt3445, 11, local16);
			Static103.method1679(local285.anInt3441, local285.anInt3445, 9, local16);
			Static105.aClass8_Sub1_Sub7_Sub1Array2[local285.anInt3446].method2811(local285.anInt3441 - 7, local285.anInt3445 + -7);
		}
		Static52.aClass182_6.method4317();
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V")
	public static void method560() {
		Static62.aClass61_48.method1378();
	}
}
