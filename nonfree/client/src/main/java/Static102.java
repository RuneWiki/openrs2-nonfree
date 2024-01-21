import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!mh", name = "O", descriptor = "Lclient!jg;")
	public static Class44 aClass44_19;

	@OriginalMember(owner = "client!mh", name = "M", descriptor = "Lclient!kb;")
	public static Class46 aClass46_817 = Static65.method1172("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!mh", name = "S", descriptor = "Lclient!kb;")
	public static Class46 aClass46_818 = Static65.method1172("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!mh", name = "U", descriptor = "[B")
	public static byte[] aByteArray19 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!mh", name = "X", descriptor = "Lclient!kf;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!mh", name = "Z", descriptor = "J")
	public static long aLong82 = 0L;

	@OriginalMember(owner = "client!mh", name = "gb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_819 = Static65.method1172("Titelbild geladen)3");

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(II)Lclient!kb;")
	public static Class46 method1675(@OriginalArg(0) int arg0) {
		return Static178.method2860(new Class46[] { Static57.method1068(arg0 >> 24 & 0xFF), Static141.aClass46_1126, Static57.method1068(arg0 >> 16 & 0xFF), Static141.aClass46_1126, Static57.method1068(arg0 >> 8 & 0xFF), Static141.aClass46_1126, Static57.method1068(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!mh", name = "d", descriptor = "(I)V")
	public static void method1676() {
		aByteArray19 = null;
		aClass46_819 = null;
		aClass44_19 = null;
		aClass46_817 = null;
		aClass46_818 = null;
	}

	@OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lclient!h;IB)I")
	public static int method1677(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArrayArray12 == null || arg1 >= arg0.anIntArrayArray12.length) {
			return -2;
		}
		try {
			@Pc(17) int local17 = 0;
			@Pc(27) int local27 = 0;
			@Pc(32) int[] local32 = arg0.anIntArrayArray12[arg1];
			@Pc(34) byte local34 = 0;
			while (true) {
				@Pc(36) byte local36 = 0;
				@Pc(41) int local41 = local32[local27++];
				@Pc(43) int local43 = 0;
				if (local41 == 0) {
					return local17;
				}
				if (local41 == 15) {
					local36 = 1;
				}
				if (local41 == 1) {
					local43 = Static159.anIntArray403[local32[local27++]];
				}
				if (local41 == 16) {
					local36 = 2;
				}
				if (local41 == 2) {
					local43 = Static12.anIntArray440[local32[local27++]];
				}
				if (local41 == 3) {
					local43 = Static163.anIntArray409[local32[local27++]];
				}
				@Pc(101) int local101;
				@Pc(112) Class33 local112;
				@Pc(117) int local117;
				@Pc(129) int local129;
				if (local41 == 4) {
					local101 = local32[local27++] << 16;
					@Pc(108) int local108 = local101 + local32[local27++];
					local112 = Static179.method2873(local108);
					local117 = local32[local27++];
					if (local117 != -1 && (!Static146.method2432(local117).aBoolean138 || Static52.aBoolean41)) {
						for (local129 = 0; local129 < local112.anIntArray142.length; local129++) {
							if (local112.anIntArray142[local129] == local117 + 1) {
								local43 += local112.anIntArray138[local129];
							}
						}
					}
				}
				if (local41 == 5) {
					local43 = Static41.anIntArray419[local32[local27++]];
				}
				if (local41 == 6) {
					local43 = Class34.anIntArray156[Static12.anIntArray440[local32[local27++]] - 1];
				}
				if (local41 == 17) {
					local36 = 3;
				}
				if (local41 == 7) {
					local43 = Static41.anIntArray419[local32[local27++]] * 100 / 46875;
				}
				if (local41 == 8) {
					local43 = Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt889;
				}
				if (local41 == 9) {
					for (local101 = 0; local101 < 25; local101++) {
						if (Static128.aBooleanArray17[local101]) {
							local43 += Static12.anIntArray440[local101];
						}
					}
				}
				if (local41 == 10) {
					local101 = local32[local27++] << 16;
					local101 += local32[local27++];
					local112 = Static179.method2873(local101);
					local117 = local32[local27++];
					if (local117 != -1 && (!Static146.method2432(local117).aBoolean138 || Static52.aBoolean41)) {
						for (local129 = 0; local129 < local112.anIntArray142.length; local129++) {
							if (local112.anIntArray142[local129] == local117 + 1) {
								local43 = 999999999;
								break;
							}
						}
					}
				}
				if (local41 == 11) {
					local43 = Static16.anInt413;
				}
				if (local41 == 12) {
					local43 = Static26.anInt600;
				}
				if (local41 == 13) {
					local101 = Static41.anIntArray419[local32[local27++]];
					@Pc(324) int local324 = local32[local27++];
					local43 = (0x1 << local324 & local101) == 0 ? 0 : 1;
				}
				if (local41 == 14) {
					local101 = local32[local27++];
					local43 = Static20.method401(local101);
				}
				if (local41 == 18) {
					local43 = (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1700 >> 7) + Static42.anInt1173;
				}
				if (local41 == 19) {
					local43 = (Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anInt1711 >> 7) + Static58.anInt1578;
				}
				if (local41 == 20) {
					local43 = local32[local27++];
				}
				if (local36 == 0) {
					if (local34 == 0) {
						local17 += local43;
					}
					if (local34 == 1) {
						local17 -= local43;
					}
					if (local34 == 2 && local43 != 0) {
						local17 /= local43;
					}
					if (local34 == 3) {
						local17 *= local43;
					}
					local34 = 0;
				} else {
					local34 = local36;
				}
			}
		} catch (@Pc(427) Exception local427) {
			return -1;
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIII)I")
	public static int method1678(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 / arg2;
		@Pc(18) int local18 = arg1 / arg2;
		@Pc(24) int local24 = arg2 - 1 & arg1;
		@Pc(30) int local30 = arg2 - 1 & arg0;
		@Pc(35) int local35 = Static172.method2726(local7, local18);
		@Pc(42) int local42 = Static172.method2726(local7 + 1, local18);
		@Pc(49) int local49 = Static172.method2726(local7, local18 + 1);
		@Pc(58) int local58 = Static172.method2726(local7 + 1, local18 + 1);
		@Pc(65) int local65 = Static58.method1094(local42, arg2, local35, local30);
		@Pc(74) int local74 = Static58.method1094(local58, arg2, local49, local30);
		return Static58.method1094(local74, arg2, local65, local24);
	}

	@OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V")
	public static void method1679(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static46.anIntArray122[arg0];
		@Pc(17) int local17 = Static134.anIntArray352[arg0];
		@Pc(21) int local21 = Static157.anIntArray402[arg0];
		@Pc(25) int local25 = Static97.anIntArray164[arg0];
		if (local17 >= 2000) {
			local17 -= 2000;
		}
		if (local17 == 50) {
			Static133.aClass3_Sub4_Sub1_3.method233(180);
			Static133.aClass3_Sub4_Sub1_3.method183(local13);
			Static133.aClass3_Sub4_Sub1_3.method215(local25);
			Static133.aClass3_Sub4_Sub1_3.method198(Static167.anInt740);
			Static133.aClass3_Sub4_Sub1_3.method198(local21);
			Static133.aClass3_Sub4_Sub1_3.method219(Static130.anInt3069);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 48) {
			Static133.aClass3_Sub4_Sub1_3.method233(188);
			Static133.aClass3_Sub4_Sub1_3.method224(Static130.anInt3069);
			Static133.aClass3_Sub4_Sub1_3.method198(Static167.anInt740);
			Static133.aClass3_Sub4_Sub1_3.method181(local13);
			Static133.aClass3_Sub4_Sub1_3.method215(local25);
		}
		if (local17 == 13 && Static71.aClass33_7 == null) {
			Static27.method445(local13, local25);
			Static71.aClass33_7 = Static98.method1607(local13, local25);
			Static142.method2373(Static71.aClass33_7);
		}
		@Pc(135) Class3_Sub2_Sub1_Sub1_Sub1 local135;
		if (local17 == 25) {
			local135 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local21];
			if (local135 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local135.anIntArray163[0], 0, 1, 0, local135.anIntArray160[0]);
				Static23.anInt542 = 0;
				Static4.anInt3715 = Static48.anInt1329;
				Static13.anInt356 = Static77.anInt1923;
				Static182.anInt4022 = 2;
				Static133.aClass3_Sub4_Sub1_3.method233(111);
				Static133.aClass3_Sub4_Sub1_3.method183(local21);
			}
		}
		if (local17 == 42) {
			Static133.aClass3_Sub4_Sub1_3.method233(64);
			Static133.aClass3_Sub4_Sub1_3.method183(local21);
			Static133.aClass3_Sub4_Sub1_3.method219(local25);
			Static133.aClass3_Sub4_Sub1_3.method198(local13);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 15) {
			Static108.method1771(local25, local21, local13);
			Static133.aClass3_Sub4_Sub1_3.method233(165);
			Static133.aClass3_Sub4_Sub1_3.method183(local25 + Static58.anInt1578);
			Static133.aClass3_Sub4_Sub1_3.method198(local21 >> 14 & 0x7FFF);
			Static133.aClass3_Sub4_Sub1_3.method198(local13 + Static42.anInt1173);
		}
		@Pc(265) Class3_Sub2_Sub1_Sub1_Sub2 local265;
		if (local17 == 35) {
			local265 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local21];
			if (local265 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local265.anIntArray163[0], 0, 1, 0, local265.anIntArray160[0]);
				Static182.anInt4022 = 2;
				Static13.anInt356 = Static77.anInt1923;
				Static23.anInt542 = 0;
				Static4.anInt3715 = Static48.anInt1329;
				Static133.aClass3_Sub4_Sub1_3.method233(171);
				Static133.aClass3_Sub4_Sub1_3.method183(local21);
			}
		}
		@Pc(350) int local350;
		@Pc(332) Class33 local332;
		if (local17 == 30) {
			Static133.aClass3_Sub4_Sub1_3.method233(221);
			Static133.aClass3_Sub4_Sub1_3.method188(local25);
			local332 = Static179.method2873(local25);
			if (local332.anIntArrayArray12 != null && local332.anIntArrayArray12[0][0] == 5) {
				local350 = local332.anIntArrayArray12[0][1];
				Static41.anIntArray419[local350] = 1 - Static41.anIntArray419[local350];
				Static124.method2124(local350);
			}
		}
		if (local17 == 45) {
			Static108.method1771(local25, local21, local13);
			Static133.aClass3_Sub4_Sub1_3.method233(151);
			Static133.aClass3_Sub4_Sub1_3.method198(local13 + Static42.anInt1173);
			Static133.aClass3_Sub4_Sub1_3.method183(local25 + Static58.anInt1578);
			Static133.aClass3_Sub4_Sub1_3.method183(local21 >> 14 & 0x7FFF);
		}
		if (local17 == 57) {
			local332 = Static98.method1607(local13, local25);
			if (local332 != null) {
				Static24.method416();
				Static179.method2879(local13, local25, Static140.method221(Static157.method2541(local332)));
				Static127.anInt3014 = 0;
				Static182.aClass46_1452 = Static26.method436(local332);
				if (Static182.aClass46_1452 == null) {
					Static182.aClass46_1452 = Static31.aClass46_235;
				}
				if (!local332.aBoolean50) {
					Static106.aClass46_837 = Static178.method2860(new Class46[] { Static48.aClass46_436, local332.aClass46_480, Static92.aClass46_763 });
					return;
				}
				Static106.aClass46_837 = Static178.method2860(new Class46[] { local332.aClass46_482, Static92.aClass46_763 });
			}
			return;
		}
		if (local17 == 21 && Static108.method1771(local25, local21, local13)) {
			Static133.aClass3_Sub4_Sub1_3.method233(174);
			Static133.aClass3_Sub4_Sub1_3.method170(local21 >> 14 & 0x7FFF);
			Static133.aClass3_Sub4_Sub1_3.method198(Static167.anInt740);
			Static133.aClass3_Sub4_Sub1_3.method183(local25 + Static58.anInt1578);
			Static133.aClass3_Sub4_Sub1_3.method181(local13 + Static42.anInt1173);
			Static133.aClass3_Sub4_Sub1_3.method188(Static130.anInt3069);
		}
		if (local17 == 29) {
			Static133.aClass3_Sub4_Sub1_3.method233(84);
			Static133.aClass3_Sub4_Sub1_3.method198(local21);
			Static133.aClass3_Sub4_Sub1_3.method224(local25);
			Static133.aClass3_Sub4_Sub1_3.method183(local13);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 12) {
			Static16.method323();
		}
		@Pc(595) boolean local595;
		if (local17 == 9) {
			local595 = Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 0, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 0, 0, local13);
			if (!local595) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 1, 0, local13);
			}
			Static23.anInt542 = 0;
			Static4.anInt3715 = Static48.anInt1329;
			Static182.anInt4022 = 2;
			Static13.anInt356 = Static77.anInt1923;
			Static133.aClass3_Sub4_Sub1_3.method233(230);
			Static133.aClass3_Sub4_Sub1_3.method181(local21);
			Static133.aClass3_Sub4_Sub1_3.method170(Static42.anInt1173 + local13);
			Static133.aClass3_Sub4_Sub1_3.method170(Static58.anInt1578 + local25);
		}
		if (local17 == 14) {
			local265 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local21];
			if (local265 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local265.anIntArray163[0], 0, 1, 0, local265.anIntArray160[0]);
				Static4.anInt3715 = Static48.anInt1329;
				Static182.anInt4022 = 2;
				Static13.anInt356 = Static77.anInt1923;
				Static23.anInt542 = 0;
				Static133.aClass3_Sub4_Sub1_3.method233(162);
				Static133.aClass3_Sub4_Sub1_3.method198(local21);
			}
		}
		if (local17 == 11) {
			Static108.method1771(local25, local21, local13);
			Static133.aClass3_Sub4_Sub1_3.method233(19);
			Static133.aClass3_Sub4_Sub1_3.method183(Static58.anInt1578 + local25);
			Static133.aClass3_Sub4_Sub1_3.method181(local21 >> 14 & 0x7FFF);
			Static133.aClass3_Sub4_Sub1_3.method181(local13 + Static42.anInt1173);
		}
		if (local17 == 1005) {
			local332 = Static179.method2873(local25);
			if (local332 == null || local332.anIntArray138[local13] < 100000) {
				Static133.aClass3_Sub4_Sub1_3.method233(182);
				Static133.aClass3_Sub4_Sub1_3.method183(local21);
			} else {
				Static168.method2686(0, Static38.aClass46_298, Static178.method2860(new Class46[] { Static57.method1068(local332.anIntArray138[local13]), Static116.aClass46_955, Static146.method2432(local21).aClass46_1163 }));
			}
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 3) {
			local595 = Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 0, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 0, 0, local13);
			if (!local595) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 1, 0, local13);
			}
			Static13.anInt356 = Static77.anInt1923;
			Static182.anInt4022 = 2;
			Static4.anInt3715 = Static48.anInt1329;
			Static23.anInt542 = 0;
			Static133.aClass3_Sub4_Sub1_3.method233(213);
			Static133.aClass3_Sub4_Sub1_3.method181(Static58.anInt1578 + local25);
			Static133.aClass3_Sub4_Sub1_3.method170(local21);
			Static133.aClass3_Sub4_Sub1_3.method183(Static42.anInt1173 + local13);
		}
		if (local17 == 16) {
			local265 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local21];
			if (local265 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local265.anIntArray163[0], 0, 1, 0, local265.anIntArray160[0]);
				Static23.anInt542 = 0;
				Static13.anInt356 = Static77.anInt1923;
				Static182.anInt4022 = 2;
				Static4.anInt3715 = Static48.anInt1329;
				Static133.aClass3_Sub4_Sub1_3.method233(245);
				Static133.aClass3_Sub4_Sub1_3.method183(local21);
			}
		}
		if (local17 == 51) {
			local595 = Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 0, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 0, 0, local13);
			if (!local595) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 1, 0, local13);
			}
			Static182.anInt4022 = 2;
			Static13.anInt356 = Static77.anInt1923;
			Static4.anInt3715 = Static48.anInt1329;
			Static23.anInt542 = 0;
			Static133.aClass3_Sub4_Sub1_3.method233(32);
			Static133.aClass3_Sub4_Sub1_3.method181(Static81.anInt2054);
			Static133.aClass3_Sub4_Sub1_3.method188(Static124.anInt2959);
			Static133.aClass3_Sub4_Sub1_3.method183(Static130.anInt3066);
			Static133.aClass3_Sub4_Sub1_3.method183(local25 + Static58.anInt1578);
			Static133.aClass3_Sub4_Sub1_3.method183(local13 + Static42.anInt1173);
			Static133.aClass3_Sub4_Sub1_3.method181(local21);
		}
		if (local17 == 36) {
			Static133.aClass3_Sub4_Sub1_3.method233(135);
			Static133.aClass3_Sub4_Sub1_3.method215(local25);
			Static133.aClass3_Sub4_Sub1_3.method170(local21);
			Static133.aClass3_Sub4_Sub1_3.method170(local13);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 40) {
			Static133.aClass3_Sub4_Sub1_3.method233(228);
			Static133.aClass3_Sub4_Sub1_3.method170(local21);
			Static133.aClass3_Sub4_Sub1_3.method219(local25);
			Static133.aClass3_Sub4_Sub1_3.method183(local13);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 38) {
			local135 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local21];
			if (local135 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local135.anIntArray163[0], 0, 1, 0, local135.anIntArray160[0]);
				Static4.anInt3715 = Static48.anInt1329;
				Static23.anInt542 = 0;
				Static13.anInt356 = Static77.anInt1923;
				Static182.anInt4022 = 2;
				Static133.aClass3_Sub4_Sub1_3.method233(115);
				Static133.aClass3_Sub4_Sub1_3.method170(local21);
			}
		}
		if (local17 == 43) {
			Static108.method1771(local25, local21, local13);
			Static133.aClass3_Sub4_Sub1_3.method233(149);
			Static133.aClass3_Sub4_Sub1_3.method183(local21 >> 14 & 0x7FFF);
			Static133.aClass3_Sub4_Sub1_3.method198(local25 + Static58.anInt1578);
			Static133.aClass3_Sub4_Sub1_3.method183(Static42.anInt1173 + local13);
		}
		if (local17 == 1007) {
			Static4.anInt3715 = Static48.anInt1329;
			Static13.anInt356 = Static77.anInt1923;
			Static23.anInt542 = 0;
			Static182.anInt4022 = 2;
			Static133.aClass3_Sub4_Sub1_3.method233(40);
			Static133.aClass3_Sub4_Sub1_3.method198(local21 >> 14 & 0x7FFF);
		}
		if (local17 == 28) {
			local595 = Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 0, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 0, 0, local13);
			if (!local595) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 1, 0, local13);
			}
			Static23.anInt542 = 0;
			Static13.anInt356 = Static77.anInt1923;
			Static182.anInt4022 = 2;
			Static4.anInt3715 = Static48.anInt1329;
			Static133.aClass3_Sub4_Sub1_3.method233(75);
			Static133.aClass3_Sub4_Sub1_3.method224(Static130.anInt3069);
			Static133.aClass3_Sub4_Sub1_3.method183(local25 + Static58.anInt1578);
			Static133.aClass3_Sub4_Sub1_3.method198(Static167.anInt740);
			Static133.aClass3_Sub4_Sub1_3.method181(local13 + Static42.anInt1173);
			Static133.aClass3_Sub4_Sub1_3.method198(local21);
		}
		if (local17 == 39) {
			local135 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local21];
			if (local135 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local135.anIntArray163[0], 0, 1, 0, local135.anIntArray160[0]);
				Static13.anInt356 = Static77.anInt1923;
				Static182.anInt4022 = 2;
				Static4.anInt3715 = Static48.anInt1329;
				Static23.anInt542 = 0;
				Static133.aClass3_Sub4_Sub1_3.method233(9);
				Static133.aClass3_Sub4_Sub1_3.method183(local21);
			}
		}
		if (local17 == 18) {
			local135 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local21];
			if (local135 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local135.anIntArray163[0], 0, 1, 0, local135.anIntArray160[0]);
				Static23.anInt542 = 0;
				Static182.anInt4022 = 2;
				Static13.anInt356 = Static77.anInt1923;
				Static4.anInt3715 = Static48.anInt1329;
				Static133.aClass3_Sub4_Sub1_3.method233(204);
				Static133.aClass3_Sub4_Sub1_3.method198(local21);
			}
		}
		if (local17 == 41) {
			Static133.aClass3_Sub4_Sub1_3.method233(227);
			Static133.aClass3_Sub4_Sub1_3.method224(local25);
			Static133.aClass3_Sub4_Sub1_3.method170(local21);
			Static133.aClass3_Sub4_Sub1_3.method198(local13);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 37 && Static108.method1771(local25, local21, local13)) {
			Static133.aClass3_Sub4_Sub1_3.method233(13);
			Static133.aClass3_Sub4_Sub1_3.method188(Static124.anInt2959);
			Static133.aClass3_Sub4_Sub1_3.method183(local21 >> 14 & 0x7FFF);
			Static133.aClass3_Sub4_Sub1_3.method170(Static130.anInt3066);
			Static133.aClass3_Sub4_Sub1_3.method170(local13 + Static42.anInt1173);
			Static133.aClass3_Sub4_Sub1_3.method198(Static81.anInt2054);
			Static133.aClass3_Sub4_Sub1_3.method170(local25 + Static58.anInt1578);
		}
		if (local17 == 1004) {
			Static4.anInt3715 = Static48.anInt1329;
			Static182.anInt4022 = 2;
			Static23.anInt542 = 0;
			Static13.anInt356 = Static77.anInt1923;
			Static133.aClass3_Sub4_Sub1_3.method233(182);
			Static133.aClass3_Sub4_Sub1_3.method183(local21);
		}
		if (local17 == 1002) {
			Static108.method1771(local25, local21, local13);
			Static133.aClass3_Sub4_Sub1_3.method233(97);
			Static133.aClass3_Sub4_Sub1_3.method198(Static58.anInt1578 + local25);
			Static133.aClass3_Sub4_Sub1_3.method170(Static42.anInt1173 + local13);
			Static133.aClass3_Sub4_Sub1_3.method181(local21 >> 14 & 0x7FFF);
		}
		if (local17 == 6) {
			Static24.method416();
			local332 = Static179.method2873(local25);
			Static130.anInt3066 = local13;
			Static124.anInt2959 = local25;
			Static81.anInt2054 = local21;
			Static127.anInt3014 = 1;
			Static142.method2373(local332);
			Static94.aClass46_772 = Static178.method2860(new Class46[] { Static54.aClass46_475, Static146.method2432(local21).aClass46_1163, Static92.aClass46_763 });
			if (Static94.aClass46_772 == null) {
				Static94.aClass46_772 = Static63.aClass46_566;
			}
			return;
		}
		if (local17 == 5) {
			local595 = Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 0, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 0, 0, local13);
			if (!local595) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 1, 0, local13);
			}
			Static13.anInt356 = Static77.anInt1923;
			Static182.anInt4022 = 2;
			Static23.anInt542 = 0;
			Static4.anInt3715 = Static48.anInt1329;
			Static133.aClass3_Sub4_Sub1_3.method233(234);
			Static133.aClass3_Sub4_Sub1_3.method198(Static58.anInt1578 + local25);
			Static133.aClass3_Sub4_Sub1_3.method183(local13 + Static42.anInt1173);
			Static133.aClass3_Sub4_Sub1_3.method183(local21);
		}
		if (local17 == 26) {
			Static133.aClass3_Sub4_Sub1_3.method233(93);
			Static133.aClass3_Sub4_Sub1_3.method181(local13);
			Static133.aClass3_Sub4_Sub1_3.method198(local21);
			Static133.aClass3_Sub4_Sub1_3.method188(local25);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 19) {
			Static133.aClass3_Sub4_Sub1_3.method233(221);
			Static133.aClass3_Sub4_Sub1_3.method188(local25);
			local332 = Static179.method2873(local25);
			if (local332.anIntArrayArray12 != null && local332.anIntArrayArray12[0][0] == 5) {
				local350 = local332.anIntArrayArray12[0][1];
				if (local332.anIntArray143[0] != Static41.anIntArray419[local350]) {
					Static41.anIntArray419[local350] = local332.anIntArray143[0];
					Static124.method2124(local350);
				}
			}
		}
		if (local17 == 2) {
			Static133.aClass3_Sub4_Sub1_3.method233(33);
			Static133.aClass3_Sub4_Sub1_3.method215(local25);
			Static133.aClass3_Sub4_Sub1_3.method170(local21);
			Static133.aClass3_Sub4_Sub1_3.method183(local13);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 58) {
			local332 = Static179.method2873(local25);
			@Pc(1847) boolean local1847 = true;
			if (local332.anInt1432 > 0) {
				local1847 = Static36.method649(local332);
			}
			if (local1847) {
				Static133.aClass3_Sub4_Sub1_3.method233(221);
				Static133.aClass3_Sub4_Sub1_3.method188(local25);
			}
		}
		if (local17 == 1) {
			Static133.aClass3_Sub4_Sub1_3.method233(196);
			Static133.aClass3_Sub4_Sub1_3.method198(local13);
			Static133.aClass3_Sub4_Sub1_3.method170(local21);
			Static133.aClass3_Sub4_Sub1_3.method188(local25);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 8) {
			local135 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local21];
			if (local135 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local135.anIntArray163[0], 0, 1, 0, local135.anIntArray160[0]);
				Static4.anInt3715 = Static48.anInt1329;
				Static23.anInt542 = 0;
				Static13.anInt356 = Static77.anInt1923;
				Static182.anInt4022 = 2;
				Static133.aClass3_Sub4_Sub1_3.method233(67);
				Static133.aClass3_Sub4_Sub1_3.method181(local21);
			}
		}
		if (local17 == 20) {
			local135 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local21];
			if (local135 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local135.anIntArray163[0], 0, 1, 0, local135.anIntArray160[0]);
				Static4.anInt3715 = Static48.anInt1329;
				Static13.anInt356 = Static77.anInt1923;
				Static23.anInt542 = 0;
				Static182.anInt4022 = 2;
				Static133.aClass3_Sub4_Sub1_3.method233(175);
				Static133.aClass3_Sub4_Sub1_3.method183(local21);
			}
		}
		if (local17 == 32) {
			local595 = Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 0, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 0, 0, local13);
			if (!local595) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 1, 0, local13);
			}
			Static23.anInt542 = 0;
			Static13.anInt356 = Static77.anInt1923;
			Static4.anInt3715 = Static48.anInt1329;
			Static182.anInt4022 = 2;
			Static133.aClass3_Sub4_Sub1_3.method233(237);
			Static133.aClass3_Sub4_Sub1_3.method170(local13 + Static42.anInt1173);
			Static133.aClass3_Sub4_Sub1_3.method198(local21);
			Static133.aClass3_Sub4_Sub1_3.method170(Static58.anInt1578 + local25);
		}
		if (local17 == 10) {
			local265 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local21];
			if (local265 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local265.anIntArray163[0], 0, 1, 0, local265.anIntArray160[0]);
				Static182.anInt4022 = 2;
				Static4.anInt3715 = Static48.anInt1329;
				Static23.anInt542 = 0;
				Static13.anInt356 = Static77.anInt1923;
				Static133.aClass3_Sub4_Sub1_3.method233(160);
				Static133.aClass3_Sub4_Sub1_3.method183(local21);
			}
		}
		if (local17 == 1001) {
			Static4.anInt3715 = Static48.anInt1329;
			Static182.anInt4022 = 2;
			Static13.anInt356 = Static77.anInt1923;
			Static23.anInt542 = 0;
			local265 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local21];
			if (local265 != null) {
				@Pc(2173) Class3_Sub2_Sub16 local2173 = local265.aClass3_Sub2_Sub16_1;
				if (local2173.anIntArray428 != null) {
					local2173 = local2173.method2747();
				}
				if (local2173 != null) {
					Static133.aClass3_Sub4_Sub1_3.method233(48);
					Static133.aClass3_Sub4_Sub1_3.method181(local2173.anInt3816);
				}
			}
		}
		if (local17 == 44) {
			local265 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local21];
			if (local265 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local265.anIntArray163[0], 0, 1, 0, local265.anIntArray160[0]);
				Static182.anInt4022 = 2;
				Static4.anInt3715 = Static48.anInt1329;
				Static23.anInt542 = 0;
				Static13.anInt356 = Static77.anInt1923;
				Static133.aClass3_Sub4_Sub1_3.method233(26);
				Static133.aClass3_Sub4_Sub1_3.method198(Static130.anInt3066);
				Static133.aClass3_Sub4_Sub1_3.method183(Static81.anInt2054);
				Static133.aClass3_Sub4_Sub1_3.method215(Static124.anInt2959);
				Static133.aClass3_Sub4_Sub1_3.method183(local21);
			}
		}
		if (local17 == 47) {
			local265 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local21];
			if (local265 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local265.anIntArray163[0], 0, 1, 0, local265.anIntArray160[0]);
				Static4.anInt3715 = Static48.anInt1329;
				Static23.anInt542 = 0;
				Static182.anInt4022 = 2;
				Static13.anInt356 = Static77.anInt1923;
				Static133.aClass3_Sub4_Sub1_3.method233(140);
				Static133.aClass3_Sub4_Sub1_3.method183(local21);
				Static133.aClass3_Sub4_Sub1_3.method219(Static130.anInt3069);
				Static133.aClass3_Sub4_Sub1_3.method183(Static167.anInt740);
			}
		}
		if (local17 == 24) {
			local595 = Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 0, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 0, 0, local13);
			if (!local595) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local25, 0, 1, 0, local13);
			}
			Static182.anInt4022 = 2;
			Static13.anInt356 = Static77.anInt1923;
			Static23.anInt542 = 0;
			Static4.anInt3715 = Static48.anInt1329;
			Static133.aClass3_Sub4_Sub1_3.method233(154);
			Static133.aClass3_Sub4_Sub1_3.method170(Static58.anInt1578 + local25);
			Static133.aClass3_Sub4_Sub1_3.method181(local21);
			Static133.aClass3_Sub4_Sub1_3.method181(Static42.anInt1173 + local13);
		}
		if (local17 == 22 || local17 == 1006) {
			Static13.method288(local25, Static32.aClass46Array5[arg0], local13, local21);
		}
		if (local17 == 33) {
			local135 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local21];
			if (local135 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local135.anIntArray163[0], 0, 1, 0, local135.anIntArray160[0]);
				Static13.anInt356 = Static77.anInt1923;
				Static23.anInt542 = 0;
				Static4.anInt3715 = Static48.anInt1329;
				Static182.anInt4022 = 2;
				Static133.aClass3_Sub4_Sub1_3.method233(159);
				Static133.aClass3_Sub4_Sub1_3.method198(local21);
			}
		}
		if (local17 == 17) {
			Static154.aClass62_1.method2011(Static99.anInt2422, local13, local25);
		}
		if (local17 == 23) {
			local265 = Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local21];
			if (local265 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local265.anIntArray163[0], 0, 1, 0, local265.anIntArray160[0]);
				Static4.anInt3715 = Static48.anInt1329;
				Static13.anInt356 = Static77.anInt1923;
				Static23.anInt542 = 0;
				Static182.anInt4022 = 2;
				Static133.aClass3_Sub4_Sub1_3.method233(42);
				Static133.aClass3_Sub4_Sub1_3.method183(local21);
			}
		}
		if (local17 == 31) {
			local135 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local21];
			if (local135 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local135.anIntArray163[0], 0, 1, 0, local135.anIntArray160[0]);
				Static23.anInt542 = 0;
				Static4.anInt3715 = Static48.anInt1329;
				Static182.anInt4022 = 2;
				Static13.anInt356 = Static77.anInt1923;
				Static133.aClass3_Sub4_Sub1_3.method233(90);
				Static133.aClass3_Sub4_Sub1_3.method198(Static167.anInt740);
				Static133.aClass3_Sub4_Sub1_3.method215(Static130.anInt3069);
				Static133.aClass3_Sub4_Sub1_3.method170(local21);
			}
		}
		if (local17 == 49) {
			local135 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local21];
			if (local135 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local135.anIntArray163[0], 0, 1, 0, local135.anIntArray160[0]);
				Static23.anInt542 = 0;
				Static182.anInt4022 = 2;
				Static4.anInt3715 = Static48.anInt1329;
				Static13.anInt356 = Static77.anInt1923;
				Static133.aClass3_Sub4_Sub1_3.method233(99);
				Static133.aClass3_Sub4_Sub1_3.method183(Static130.anInt3066);
				Static133.aClass3_Sub4_Sub1_3.method181(local21);
				Static133.aClass3_Sub4_Sub1_3.method188(Static124.anInt2959);
				Static133.aClass3_Sub4_Sub1_3.method183(Static81.anInt2054);
			}
		}
		if (local17 == 46) {
			Static133.aClass3_Sub4_Sub1_3.method233(249);
			Static133.aClass3_Sub4_Sub1_3.method198(Static130.anInt3066);
			Static133.aClass3_Sub4_Sub1_3.method181(Static81.anInt2054);
			Static133.aClass3_Sub4_Sub1_3.method181(local13);
			Static133.aClass3_Sub4_Sub1_3.method219(Static124.anInt2959);
			Static133.aClass3_Sub4_Sub1_3.method224(local25);
			Static133.aClass3_Sub4_Sub1_3.method198(local21);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 34) {
			local135 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local21];
			if (local135 != null) {
				Static6.method100(0, false, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0], 1, 2, Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local135.anIntArray163[0], 0, 1, 0, local135.anIntArray160[0]);
				Static13.anInt356 = Static77.anInt1923;
				Static182.anInt4022 = 2;
				Static23.anInt542 = 0;
				Static4.anInt3715 = Static48.anInt1329;
				Static133.aClass3_Sub4_Sub1_3.method233(0);
				Static133.aClass3_Sub4_Sub1_3.method170(local21);
			}
		}
		if (local17 == 4) {
			Static133.aClass3_Sub4_Sub1_3.method233(144);
			Static133.aClass3_Sub4_Sub1_3.method181(local21);
			Static133.aClass3_Sub4_Sub1_3.method219(local25);
			Static133.aClass3_Sub4_Sub1_3.method198(local13);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (local17 == 7) {
			Static133.aClass3_Sub4_Sub1_3.method233(199);
			Static133.aClass3_Sub4_Sub1_3.method215(local25);
			Static133.aClass3_Sub4_Sub1_3.method170(local21);
			Static133.aClass3_Sub4_Sub1_3.method170(local13);
			Static99.anInt2410 = 0;
			Static93.aClass33_11 = Static179.method2873(local25);
			Static178.anInt3923 = local13;
		}
		if (Static127.anInt3014 != 0) {
			Static127.anInt3014 = 0;
			Static142.method2373(Static179.method2873(Static124.anInt2959));
		}
		if (Static90.aBoolean94) {
			Static24.method416();
		}
		if (Static93.aClass33_11 != null && Static99.anInt2410 == 0) {
			Static142.method2373(Static93.aClass33_11);
		}
	}

	@OriginalMember(owner = "client!mh", name = "b", descriptor = "(IB)V")
	public static void method1680() {
		Static88.aClass44_15 = null;
		Static54.anInt1417 = -1;
		Static130.anInt3073 = 2;
		Static77.anInt1924 = 0;
		Static22.anInt527 = 1;
		Static167.anInt739 = -1;
		Static146.aBoolean140 = false;
	}
}
