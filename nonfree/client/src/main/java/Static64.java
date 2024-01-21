import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static64 {

	@OriginalMember(owner = "client!gf", name = "X", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!gf", name = "db", descriptor = "I")
	public static int anInt1510 = -1;

	@OriginalMember(owner = "client!gf", name = "eb", descriptor = "[I")
	public static final int[] anIntArray120 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!gf", name = "fb", descriptor = "Lclient!cf;")
	public static final Class20 aClass20_4 = new Class20();

	@OriginalMember(owner = "client!gf", name = "gb", descriptor = "I")
	public static int anInt1511 = 0;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIIB)I")
	public static int method1027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg1 >> 7;
		@Pc(11) int local11 = arg0 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(35) int local35 = arg2;
		if (arg2 < 3 && (Static146.aByteArrayArrayArray33[1][local7][local11] & 0x2) == 2) {
			local35 = arg2 + 1;
		}
		@Pc(58) int local58 = arg0 & 0x7F;
		@Pc(62) int local62 = arg1 & 0x7F;
		@Pc(89) int local89 = local62 * Static156.anIntArrayArrayArray6[local35][local7 + 1][local11] + Static156.anIntArrayArrayArray6[local35][local7][local11] * (128 - local62) >> 7;
		@Pc(121) int local121 = (128 - local62) * Static156.anIntArrayArrayArray6[local35][local7][local11 + 1] + Static156.anIntArrayArrayArray6[local35][local7 + 1][local11 + 1] * local62 >> 7;
		return local58 * local121 + (128 - local58) * local89 >> 7;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(BII)I")
	public static int method1028(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub25 local18 = (Class1_Sub25) Static71.aClass97_7.method3375((long) arg1);
		if (local18 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local18.anIntArray326.length) {
			return local18.anIntArray326[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(II)V")
	public static void method1030(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(10) int local10 = Static120.aShortArray21[arg0];
		if (local10 >= 2000) {
			local10 -= 2000;
		}
		@Pc(18) int local18 = Static184.anIntArray327[arg0];
		@Pc(22) int local22 = Static119.anIntArray192[arg0];
		@Pc(27) int local27 = (int) Static142.aLongArray8[arg0];
		@Pc(31) long local31 = Static142.aLongArray8[arg0];
		@Pc(38) Class8_Sub3_Sub2 local38;
		if (local10 == 43) {
			local38 = Static177.aClass8_Sub3_Sub2Array1[local27];
			if (local38 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local38.anIntArray312[0], local38.anIntArray309[0]);
				Static96.anInt2010 = 2;
				Static50.anInt3129 = Static140.anInt2804;
				Static127.anInt2648 = Static57.anInt1370;
				Static108.anInt2346 = 0;
				Static38.aClass1_Sub14_Sub1_3.method3067(77);
				Static38.aClass1_Sub14_Sub1_3.method3050(Static14.anInt382);
				Static38.aClass1_Sub14_Sub1_3.method3008(local27);
				Static38.aClass1_Sub14_Sub1_3.method3019(Static114.anInt2462);
			}
		}
		if (local10 == 58 && Static105.method1583(local31, local18, local22)) {
			Static38.aClass1_Sub14_Sub1_3.method3067(215);
			Static38.aClass1_Sub14_Sub1_3.method3020(local22 + Static100.anInt2141);
			Static38.aClass1_Sub14_Sub1_3.method3008(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static38.aClass1_Sub14_Sub1_3.method3008(local18 + Static138.anInt2800);
			Static38.aClass1_Sub14_Sub1_3.method3050(Static153.anInt3185);
			Static38.aClass1_Sub14_Sub1_3.method3020(Static149.anInt3051);
			Static38.aClass1_Sub14_Sub1_3.method3019(Static47.anInt1198);
		}
		@Pc(190) int local190;
		@Pc(172) Class11 local172;
		if (local10 == 38) {
			Static38.aClass1_Sub14_Sub1_3.method3067(217);
			Static38.aClass1_Sub14_Sub1_3.method3032(local18);
			local172 = Static9.method2342(local18);
			if (local172.anIntArrayArray5 != null && local172.anIntArrayArray5[0][0] == 5) {
				local190 = local172.anIntArrayArray5[0][1];
				if (Static84.anIntArray156[local190] != local172.anIntArray28[0]) {
					Static84.anIntArray156[local190] = local172.anIntArray28[0];
					Static183.method2956(local190);
				}
			}
		}
		if (local10 == 1003) {
			Static108.anInt2346 = 0;
			Static96.anInt2010 = 2;
			Static127.anInt2648 = Static57.anInt1370;
			Static50.anInt3129 = Static140.anInt2804;
			Static38.aClass1_Sub14_Sub1_3.method3067(131);
			Static38.aClass1_Sub14_Sub1_3.method3019(local27);
		}
		if (local10 == 10) {
			Static38.aClass1_Sub14_Sub1_3.method3067(195);
			Static38.aClass1_Sub14_Sub1_3.method3008(Static114.anInt2462);
			Static38.aClass1_Sub14_Sub1_3.method3015(Static14.anInt382);
			Static38.aClass1_Sub14_Sub1_3.method3020(local22);
			Static38.aClass1_Sub14_Sub1_3.method3020(local27);
			Static38.aClass1_Sub14_Sub1_3.method3026(local18);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 1002) {
			Static108.anInt2346 = 0;
			Static50.anInt3129 = Static140.anInt2804;
			Static96.anInt2010 = 2;
			Static127.anInt2648 = Static57.anInt1370;
			Static38.aClass1_Sub14_Sub1_3.method3067(51);
			Static38.aClass1_Sub14_Sub1_3.method3011(local27);
		}
		if (local10 == 46 || local10 == 1007) {
			Static26.method480(local27, local22, Static65.aClass92Array9[arg0], local18);
		}
		if (local10 == 1001) {
			local172 = Static9.method2342(local18);
			if (local172 == null || local172.anIntArray24[local22] < 100000) {
				Static38.aClass1_Sub14_Sub1_3.method3067(51);
				Static38.aClass1_Sub14_Sub1_3.method3011(local27);
			} else {
				Static145.method2151(Static208.method787(new Class92[] { Static49.method872(local172.anIntArray24[local22]), Static95.aClass92_897, Static102.method1549(local27).aClass92_1846 }), Static26.aClass92_268, 0);
			}
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 26) {
			Static38.aClass1_Sub14_Sub1_3.method3067(144);
			Static38.aClass1_Sub14_Sub1_3.method3026(local18);
			Static38.aClass1_Sub14_Sub1_3.method3008(local22);
			Static38.aClass1_Sub14_Sub1_3.method3020(local27);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		@Pc(424) Class8_Sub3_Sub1 local424;
		if (local10 == 57) {
			local424 = Static47.aClass8_Sub3_Sub1Array1[local27];
			if (local424 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local424.anIntArray312[0], local424.anIntArray309[0]);
				Static50.anInt3129 = Static140.anInt2804;
				Static108.anInt2346 = 0;
				Static127.anInt2648 = Static57.anInt1370;
				Static96.anInt2010 = 2;
				Static38.aClass1_Sub14_Sub1_3.method3067(0);
				Static38.aClass1_Sub14_Sub1_3.method3008(local27);
				Static38.aClass1_Sub14_Sub1_3.method3050(Static14.anInt382);
				Static38.aClass1_Sub14_Sub1_3.method3011(Static114.anInt2462);
			}
		}
		if (local10 == 48) {
			local38 = Static177.aClass8_Sub3_Sub2Array1[local27];
			if (local38 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local38.anIntArray312[0], local38.anIntArray309[0]);
				Static96.anInt2010 = 2;
				Static50.anInt3129 = Static140.anInt2804;
				Static127.anInt2648 = Static57.anInt1370;
				Static108.anInt2346 = 0;
				Static38.aClass1_Sub14_Sub1_3.method3067(37);
				Static38.aClass1_Sub14_Sub1_3.method3032(Static153.anInt3185);
				Static38.aClass1_Sub14_Sub1_3.method3019(Static149.anInt3051);
				Static38.aClass1_Sub14_Sub1_3.method3019(Static47.anInt1198);
				Static38.aClass1_Sub14_Sub1_3.method3020(local27);
			}
		}
		@Pc(578) boolean local578;
		if (local10 == 1) {
			local578 = Static55.method911(false, 2, 0, 0, 0, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			if (!local578) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			}
			Static127.anInt2648 = Static57.anInt1370;
			Static50.anInt3129 = Static140.anInt2804;
			Static96.anInt2010 = 2;
			Static108.anInt2346 = 0;
			Static38.aClass1_Sub14_Sub1_3.method3067(22);
			Static38.aClass1_Sub14_Sub1_3.method3008(local27);
			Static38.aClass1_Sub14_Sub1_3.method3020(local18 + Static138.anInt2800);
			Static38.aClass1_Sub14_Sub1_3.method3008(local22 + Static100.anInt2141);
		}
		if (local10 == 41) {
			local424 = Static47.aClass8_Sub3_Sub1Array1[local27];
			if (local424 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local424.anIntArray312[0], local424.anIntArray309[0]);
				Static96.anInt2010 = 2;
				Static50.anInt3129 = Static140.anInt2804;
				Static127.anInt2648 = Static57.anInt1370;
				Static108.anInt2346 = 0;
				Static38.aClass1_Sub14_Sub1_3.method3067(120);
				Static38.aClass1_Sub14_Sub1_3.method3019(local27);
			}
		}
		if (local10 == 9) {
			Static105.method1583(local31, local18, local22);
			Static38.aClass1_Sub14_Sub1_3.method3067(6);
			Static38.aClass1_Sub14_Sub1_3.method3020(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static38.aClass1_Sub14_Sub1_3.method3019(local22 + Static100.anInt2141);
			Static38.aClass1_Sub14_Sub1_3.method3020(local18 + Static138.anInt2800);
		}
		if (local10 == 25) {
			local38 = Static177.aClass8_Sub3_Sub2Array1[local27];
			if (local38 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local38.anIntArray312[0], local38.anIntArray309[0]);
				Static108.anInt2346 = 0;
				Static96.anInt2010 = 2;
				Static50.anInt3129 = Static140.anInt2804;
				Static127.anInt2648 = Static57.anInt1370;
				Static38.aClass1_Sub14_Sub1_3.method3067(111);
				Static38.aClass1_Sub14_Sub1_3.method3011(local27);
			}
		}
		if (local10 == 7) {
			local38 = Static177.aClass8_Sub3_Sub2Array1[local27];
			if (local38 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local38.anIntArray312[0], local38.anIntArray309[0]);
				Static127.anInt2648 = Static57.anInt1370;
				Static50.anInt3129 = Static140.anInt2804;
				Static96.anInt2010 = 2;
				Static108.anInt2346 = 0;
				Static38.aClass1_Sub14_Sub1_3.method3067(107);
				Static38.aClass1_Sub14_Sub1_3.method3011(local27);
			}
		}
		if (local10 == 45) {
			local424 = Static47.aClass8_Sub3_Sub1Array1[local27];
			if (local424 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local424.anIntArray312[0], local424.anIntArray309[0]);
				Static127.anInt2648 = Static57.anInt1370;
				Static96.anInt2010 = 2;
				Static108.anInt2346 = 0;
				Static50.anInt3129 = Static140.anInt2804;
				Static38.aClass1_Sub14_Sub1_3.method3067(222);
				Static38.aClass1_Sub14_Sub1_3.method3008(local27);
			}
		}
		if (local10 == 12) {
			Static83.method1270();
		}
		if (local10 == 1006) {
			Static96.anInt2010 = 2;
			Static50.anInt3129 = Static140.anInt2804;
			Static127.anInt2648 = Static57.anInt1370;
			Static108.anInt2346 = 0;
			local38 = Static177.aClass8_Sub3_Sub2Array1[local27];
			if (local38 != null) {
				@Pc(925) Class1_Sub3_Sub13 local925 = local38.aClass1_Sub3_Sub13_1;
				if (local925.anIntArray169 != null) {
					local925 = local925.method1581();
				}
				if (local925 != null) {
					Static38.aClass1_Sub14_Sub1_3.method3067(220);
					Static38.aClass1_Sub14_Sub1_3.method3011(local925.anInt2268);
				}
			}
		}
		if (local10 == 23) {
			local172 = Static173.method2744(local18, local22);
			if (local172 != null) {
				Static197.method3282();
				Static86.method1286(Static140.method2076(Static195.method3194(local172)), local22, local18);
				Static189.anInt4128 = 0;
				Static48.aClass92_516 = Static37.method687(local172);
				if (Static48.aClass92_516 == null) {
					Static48.aClass92_516 = Static76.aClass92_699;
				}
				if (local172.aBoolean28) {
					Static15.aClass92_135 = Static208.method787(new Class92[] { local172.aClass92_102, Static89.aClass92_833 });
					return;
				}
				Static15.aClass92_135 = Static208.method787(new Class92[] { Static32.aClass92_344, local172.aClass92_101, Static89.aClass92_833 });
			}
			return;
		}
		if (local10 == 6) {
			local424 = Static47.aClass8_Sub3_Sub1Array1[local27];
			if (local424 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local424.anIntArray312[0], local424.anIntArray309[0]);
				Static96.anInt2010 = 2;
				Static50.anInt3129 = Static140.anInt2804;
				Static108.anInt2346 = 0;
				Static127.anInt2648 = Static57.anInt1370;
				Static38.aClass1_Sub14_Sub1_3.method3067(158);
				Static38.aClass1_Sub14_Sub1_3.method3020(local27);
			}
		}
		if (local10 == 3) {
			Static38.aClass1_Sub14_Sub1_3.method3067(145);
			Static38.aClass1_Sub14_Sub1_3.method3019(local27);
			Static38.aClass1_Sub14_Sub1_3.method3011(local22);
			Static38.aClass1_Sub14_Sub1_3.method3026(local18);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 18) {
			local424 = Static47.aClass8_Sub3_Sub1Array1[local27];
			if (local424 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local424.anIntArray312[0], local424.anIntArray309[0]);
				Static127.anInt2648 = Static57.anInt1370;
				Static50.anInt3129 = Static140.anInt2804;
				Static108.anInt2346 = 0;
				Static96.anInt2010 = 2;
				Static38.aClass1_Sub14_Sub1_3.method3067(35);
				Static38.aClass1_Sub14_Sub1_3.method3020(local27);
			}
		}
		if (local10 == 37) {
			local578 = Static55.method911(false, 2, 0, 0, 0, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			if (!local578) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			}
			Static127.anInt2648 = Static57.anInt1370;
			Static50.anInt3129 = Static140.anInt2804;
			Static96.anInt2010 = 2;
			Static108.anInt2346 = 0;
			Static38.aClass1_Sub14_Sub1_3.method3067(196);
			Static38.aClass1_Sub14_Sub1_3.method3008(local18 + Static138.anInt2800);
			Static38.aClass1_Sub14_Sub1_3.method3011(Static114.anInt2462);
			Static38.aClass1_Sub14_Sub1_3.method3008(local27);
			Static38.aClass1_Sub14_Sub1_3.method3008(local22 + Static100.anInt2141);
			Static38.aClass1_Sub14_Sub1_3.method3026(Static14.anInt382);
		}
		if (local10 == 21) {
			local38 = Static177.aClass8_Sub3_Sub2Array1[local27];
			if (local38 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local38.anIntArray312[0], local38.anIntArray309[0]);
				Static50.anInt3129 = Static140.anInt2804;
				Static96.anInt2010 = 2;
				Static108.anInt2346 = 0;
				Static127.anInt2648 = Static57.anInt1370;
				Static38.aClass1_Sub14_Sub1_3.method3067(168);
				Static38.aClass1_Sub14_Sub1_3.method3008(local27);
			}
		}
		if (local10 == 39) {
			local424 = Static47.aClass8_Sub3_Sub1Array1[local27];
			if (local424 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local424.anIntArray312[0], local424.anIntArray309[0]);
				Static50.anInt3129 = Static140.anInt2804;
				Static96.anInt2010 = 2;
				Static127.anInt2648 = Static57.anInt1370;
				Static108.anInt2346 = 0;
				Static38.aClass1_Sub14_Sub1_3.method3067(85);
				Static38.aClass1_Sub14_Sub1_3.method3011(local27);
			}
		}
		if (local10 == 29) {
			local424 = Static47.aClass8_Sub3_Sub1Array1[local27];
			if (local424 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local424.anIntArray312[0], local424.anIntArray309[0]);
				Static96.anInt2010 = 2;
				Static50.anInt3129 = Static140.anInt2804;
				Static127.anInt2648 = Static57.anInt1370;
				Static108.anInt2346 = 0;
				Static38.aClass1_Sub14_Sub1_3.method3067(122);
				Static38.aClass1_Sub14_Sub1_3.method3008(local27);
			}
		}
		if (local10 == 20) {
			local578 = Static55.method911(false, 2, 0, 0, 0, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			if (!local578) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			}
			Static108.anInt2346 = 0;
			Static50.anInt3129 = Static140.anInt2804;
			Static96.anInt2010 = 2;
			Static127.anInt2648 = Static57.anInt1370;
			Static38.aClass1_Sub14_Sub1_3.method3067(178);
			Static38.aClass1_Sub14_Sub1_3.method3008(Static149.anInt3051);
			Static38.aClass1_Sub14_Sub1_3.method3020(Static47.anInt1198);
			Static38.aClass1_Sub14_Sub1_3.method3019(local22 + Static100.anInt2141);
			Static38.aClass1_Sub14_Sub1_3.method3008(Static138.anInt2800 + local18);
			Static38.aClass1_Sub14_Sub1_3.method3032(Static153.anInt3185);
			Static38.aClass1_Sub14_Sub1_3.method3011(local27);
		}
		if (local10 == 8 && Static82.aClass11_6 == null) {
			Static206.method3376(local18, local22);
			Static82.aClass11_6 = Static173.method2744(local18, local22);
			Static73.method1118(Static82.aClass11_6);
		}
		if (local10 == 36) {
			Static38.aClass1_Sub14_Sub1_3.method3067(186);
			Static38.aClass1_Sub14_Sub1_3.method3050(Static153.anInt3185);
			Static38.aClass1_Sub14_Sub1_3.method3019(Static47.anInt1198);
			Static38.aClass1_Sub14_Sub1_3.method3026(local18);
			Static38.aClass1_Sub14_Sub1_3.method3020(local27);
			Static38.aClass1_Sub14_Sub1_3.method3019(Static149.anInt3051);
			Static38.aClass1_Sub14_Sub1_3.method3008(local22);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 17 && Static105.method1583(local31, local18, local22)) {
			Static38.aClass1_Sub14_Sub1_3.method3067(208);
			Static38.aClass1_Sub14_Sub1_3.method3019(local22 + Static100.anInt2141);
			Static38.aClass1_Sub14_Sub1_3.method3019((int) (local31 >>> 32) & Integer.MAX_VALUE);
			Static38.aClass1_Sub14_Sub1_3.method3026(Static14.anInt382);
			Static38.aClass1_Sub14_Sub1_3.method3011(local18 + Static138.anInt2800);
			Static38.aClass1_Sub14_Sub1_3.method3019(Static114.anInt2462);
		}
		if (local10 == 2) {
			Static38.aClass1_Sub14_Sub1_3.method3067(167);
			Static38.aClass1_Sub14_Sub1_3.method3020(local27);
			Static38.aClass1_Sub14_Sub1_3.method3011(local22);
			Static38.aClass1_Sub14_Sub1_3.method3032(local18);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 40) {
			Static38.aClass1_Sub14_Sub1_3.method3067(7);
			Static38.aClass1_Sub14_Sub1_3.method3020(local27);
			Static38.aClass1_Sub14_Sub1_3.method3032(local18);
			Static38.aClass1_Sub14_Sub1_3.method3011(local22);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 51) {
			Static105.method1583(local31, local18, local22);
			Static38.aClass1_Sub14_Sub1_3.method3067(36);
			Static38.aClass1_Sub14_Sub1_3.method3020(local18 + Static138.anInt2800);
			Static38.aClass1_Sub14_Sub1_3.method3008(local22 + Static100.anInt2141);
			Static38.aClass1_Sub14_Sub1_3.method3020(Integer.MAX_VALUE & (int) (local31 >>> 32));
		}
		if (local10 == 14) {
			Static38.aClass1_Sub14_Sub1_3.method3067(54);
			Static38.aClass1_Sub14_Sub1_3.method3011(local27);
			Static38.aClass1_Sub14_Sub1_3.method3019(local22);
			Static38.aClass1_Sub14_Sub1_3.method3032(local18);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 28) {
			local578 = Static55.method911(false, 2, 0, 0, 0, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			if (!local578) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			}
			Static96.anInt2010 = 2;
			Static50.anInt3129 = Static140.anInt2804;
			Static127.anInt2648 = Static57.anInt1370;
			Static108.anInt2346 = 0;
			Static38.aClass1_Sub14_Sub1_3.method3067(52);
			Static38.aClass1_Sub14_Sub1_3.method3011(Static138.anInt2800 + local18);
			Static38.aClass1_Sub14_Sub1_3.method3011(Static100.anInt2141 + local22);
			Static38.aClass1_Sub14_Sub1_3.method3019(local27);
		}
		if (local10 == 15) {
			Static38.aClass1_Sub14_Sub1_3.method3067(181);
			Static38.aClass1_Sub14_Sub1_3.method3015(local18);
			Static38.aClass1_Sub14_Sub1_3.method3011(local22);
			Static38.aClass1_Sub14_Sub1_3.method3020(local27);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 44) {
			local424 = Static47.aClass8_Sub3_Sub1Array1[local27];
			if (local424 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local424.anIntArray312[0], local424.anIntArray309[0]);
				Static50.anInt3129 = Static140.anInt2804;
				Static96.anInt2010 = 2;
				Static127.anInt2648 = Static57.anInt1370;
				Static108.anInt2346 = 0;
				Static38.aClass1_Sub14_Sub1_3.method3067(137);
				Static38.aClass1_Sub14_Sub1_3.method3008(local27);
			}
		}
		if (local10 == 49) {
			Static197.method3282();
			local172 = Static9.method2342(local18);
			Static189.anInt4128 = 1;
			Static153.anInt3185 = local18;
			Static47.anInt1198 = local22;
			Static149.anInt3051 = local27;
			Static73.method1118(local172);
			Static186.aClass92_1900 = Static208.method787(new Class92[] { Static98.aClass92_936, Static102.method1549(local27).aClass92_1846, Static89.aClass92_833 });
			if (Static186.aClass92_1900 == null) {
				Static186.aClass92_1900 = Static193.aClass92_1451;
			}
			return;
		}
		if (local10 == 47) {
			local38 = Static177.aClass8_Sub3_Sub2Array1[local27];
			if (local38 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local38.anIntArray312[0], local38.anIntArray309[0]);
				Static50.anInt3129 = Static140.anInt2804;
				Static96.anInt2010 = 2;
				Static127.anInt2648 = Static57.anInt1370;
				Static108.anInt2346 = 0;
				Static38.aClass1_Sub14_Sub1_3.method3067(172);
				Static38.aClass1_Sub14_Sub1_3.method3011(local27);
			}
		}
		if (local10 == 42) {
			Static38.aClass1_Sub14_Sub1_3.method3067(29);
			Static38.aClass1_Sub14_Sub1_3.method3011(local22);
			Static38.aClass1_Sub14_Sub1_3.method3015(local18);
			Static38.aClass1_Sub14_Sub1_3.method3019(local27);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 24) {
			@Pc(2106) boolean local2106 = true;
			local172 = Static9.method2342(local18);
			if (local172.anInt315 > 0) {
				local2106 = Static62.method1003(local172);
			}
			if (local2106) {
				Static38.aClass1_Sub14_Sub1_3.method3067(217);
				Static38.aClass1_Sub14_Sub1_3.method3032(local18);
			}
		}
		if (local10 == 1005) {
			Static105.method1583(local31, local18, local22);
			Static38.aClass1_Sub14_Sub1_3.method3067(204);
			Static38.aClass1_Sub14_Sub1_3.method3011(Static100.anInt2141 + local22);
			Static38.aClass1_Sub14_Sub1_3.method3019(local18 + Static138.anInt2800);
			Static38.aClass1_Sub14_Sub1_3.method3019((int) (local31 >>> 32) & Integer.MAX_VALUE);
		}
		if (local10 == 31) {
			Static38.aClass1_Sub14_Sub1_3.method3067(60);
			Static38.aClass1_Sub14_Sub1_3.method3015(local18);
			Static38.aClass1_Sub14_Sub1_3.method3011(local27);
			Static38.aClass1_Sub14_Sub1_3.method3019(local22);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 5) {
			local424 = Static47.aClass8_Sub3_Sub1Array1[local27];
			if (local424 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local424.anIntArray312[0], local424.anIntArray309[0]);
				Static96.anInt2010 = 2;
				Static127.anInt2648 = Static57.anInt1370;
				Static50.anInt3129 = Static140.anInt2804;
				Static108.anInt2346 = 0;
				Static38.aClass1_Sub14_Sub1_3.method3067(247);
				Static38.aClass1_Sub14_Sub1_3.method3026(Static153.anInt3185);
				Static38.aClass1_Sub14_Sub1_3.method3020(Static149.anInt3051);
				Static38.aClass1_Sub14_Sub1_3.method3020(local27);
				Static38.aClass1_Sub14_Sub1_3.method3019(Static47.anInt1198);
			}
		}
		if (local10 == 32) {
			local578 = Static55.method911(false, 2, 0, 0, 0, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			if (!local578) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			}
			Static50.anInt3129 = Static140.anInt2804;
			Static127.anInt2648 = Static57.anInt1370;
			Static96.anInt2010 = 2;
			Static108.anInt2346 = 0;
			Static38.aClass1_Sub14_Sub1_3.method3067(71);
			Static38.aClass1_Sub14_Sub1_3.method3011(local18 + Static138.anInt2800);
			Static38.aClass1_Sub14_Sub1_3.method3008(local22 + Static100.anInt2141);
			Static38.aClass1_Sub14_Sub1_3.method3011(local27);
		}
		if (local10 == 22) {
			Static38.aClass1_Sub14_Sub1_3.method3067(101);
			Static38.aClass1_Sub14_Sub1_3.method3008(local27);
			Static38.aClass1_Sub14_Sub1_3.method3020(local22);
			Static38.aClass1_Sub14_Sub1_3.method3015(local18);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 16) {
			Static105.method1583(local31, local18, local22);
			Static38.aClass1_Sub14_Sub1_3.method3067(104);
			Static38.aClass1_Sub14_Sub1_3.method3020(Integer.MAX_VALUE & (int) (local31 >>> 32));
			Static38.aClass1_Sub14_Sub1_3.method3019(local22 + Static100.anInt2141);
			Static38.aClass1_Sub14_Sub1_3.method3020(Static138.anInt2800 + local18);
		}
		if (local10 == 11) {
			Static105.method1583(local31, local18, local22);
			Static38.aClass1_Sub14_Sub1_3.method3067(124);
			Static38.aClass1_Sub14_Sub1_3.method3019(local18 + Static138.anInt2800);
			Static38.aClass1_Sub14_Sub1_3.method3019(local22 + Static100.anInt2141);
			Static38.aClass1_Sub14_Sub1_3.method3011(Integer.MAX_VALUE & (int) (local31 >>> 32));
		}
		if (local10 == 34) {
			local578 = Static55.method911(false, 2, 0, 0, 0, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			if (!local578) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			}
			Static108.anInt2346 = 0;
			Static96.anInt2010 = 2;
			Static127.anInt2648 = Static57.anInt1370;
			Static50.anInt3129 = Static140.anInt2804;
			Static38.aClass1_Sub14_Sub1_3.method3067(248);
			Static38.aClass1_Sub14_Sub1_3.method3020(local22 + Static100.anInt2141);
			Static38.aClass1_Sub14_Sub1_3.method3019(local27);
			Static38.aClass1_Sub14_Sub1_3.method3019(local18 + Static138.anInt2800);
		}
		if (local10 == 19) {
			local578 = Static55.method911(false, 2, 0, 0, 0, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			if (!local578) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local18, local22);
			}
			Static127.anInt2648 = Static57.anInt1370;
			Static50.anInt3129 = Static140.anInt2804;
			Static108.anInt2346 = 0;
			Static96.anInt2010 = 2;
			Static38.aClass1_Sub14_Sub1_3.method3067(70);
			Static38.aClass1_Sub14_Sub1_3.method3019(Static100.anInt2141 + local22);
			Static38.aClass1_Sub14_Sub1_3.method3011(local18 + Static138.anInt2800);
			Static38.aClass1_Sub14_Sub1_3.method3020(local27);
		}
		if (local10 == 35) {
			Static38.aClass1_Sub14_Sub1_3.method3067(217);
			Static38.aClass1_Sub14_Sub1_3.method3032(local18);
			local172 = Static9.method2342(local18);
			if (local172.anIntArrayArray5 != null && local172.anIntArrayArray5[0][0] == 5) {
				local190 = local172.anIntArrayArray5[0][1];
				Static84.anIntArray156[local190] = 1 - Static84.anIntArray156[local190];
				Static183.method2956(local190);
			}
		}
		if (local10 == 4) {
			Static164.method2559(Static192.anInt4180, local22, local18);
		}
		if (local10 == 13) {
			Static38.aClass1_Sub14_Sub1_3.method3067(147);
			Static38.aClass1_Sub14_Sub1_3.method3019(local27);
			Static38.aClass1_Sub14_Sub1_3.method3050(local18);
			Static38.aClass1_Sub14_Sub1_3.method3019(local22);
			Static129.anInt2666 = 0;
			Static179.aClass11_19 = Static9.method2342(local18);
			Static121.anInt4508 = local22;
		}
		if (local10 == 30) {
			Static38.aClass1_Sub14_Sub1_3.method3067(32);
			Static38.aClass1_Sub14_Sub1_3.method3008(local22);
			Static38.aClass1_Sub14_Sub1_3.method3032(Static14.anInt382);
			Static38.aClass1_Sub14_Sub1_3.method3050(local18);
			Static38.aClass1_Sub14_Sub1_3.method3011(Static114.anInt2462);
		}
		if (local10 == 33) {
			local424 = Static47.aClass8_Sub3_Sub1Array1[local27];
			if (local424 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local424.anIntArray312[0], local424.anIntArray309[0]);
				Static127.anInt2648 = Static57.anInt1370;
				Static50.anInt3129 = Static140.anInt2804;
				Static108.anInt2346 = 0;
				Static96.anInt2010 = 2;
				Static38.aClass1_Sub14_Sub1_3.method3067(152);
				Static38.aClass1_Sub14_Sub1_3.method3011(local27);
			}
		}
		if (local10 == 50) {
			local38 = Static177.aClass8_Sub3_Sub2Array1[local27];
			if (local38 != null) {
				Static55.method911(false, 2, 0, 1, 1, 0, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], 0, local38.anIntArray312[0], local38.anIntArray309[0]);
				Static50.anInt3129 = Static140.anInt2804;
				Static96.anInt2010 = 2;
				Static108.anInt2346 = 0;
				Static127.anInt2648 = Static57.anInt1370;
				Static38.aClass1_Sub14_Sub1_3.method3067(227);
				Static38.aClass1_Sub14_Sub1_3.method3020(local27);
			}
		}
		if (Static189.anInt4128 != 0) {
			Static189.anInt4128 = 0;
			Static73.method1118(Static9.method2342(Static153.anInt3185));
		}
		if (Static72.aBoolean100) {
			Static197.method3282();
		}
		if (Static179.aClass11_19 != null && Static129.anInt2666 == 0) {
			Static73.method1118(Static179.aClass11_19);
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(IBLclient!ba;)Lclient!vd;")
	public static Class92 method1031(@OriginalArg(0) int arg0, @OriginalArg(2) Class11 arg1) {
		if (!Static14.method255(arg0, Static195.method3194(arg1)) && arg1.anObjectArray25 == null) {
			return null;
		} else if (arg1.aClass92Array2 == null || arg1.aClass92Array2.length <= arg0 || arg1.aClass92Array2[arg0] == null || arg1.aClass92Array2[arg0].method3196().method3233() == 0) {
			return Static151.aBoolean178 ? Static208.method787(new Class92[] { Static199.aClass92_1991, Static49.method872(arg0) }) : null;
		} else {
			return arg1.aClass92Array2[arg0];
		}
	}
}
