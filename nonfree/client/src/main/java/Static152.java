import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!tf", name = "Y", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1262 = Static170.method3101("Hierhin gehen");

	@OriginalMember(owner = "client!tf", name = "eb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1263 = Static170.method3101(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!tf", name = "ib", descriptor = "Lclient!eh;")
	private static Class28 aClass28_1265 = Static170.method3101("Please remove ");

	@OriginalMember(owner = "client!tf", name = "gb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1264 = aClass28_1265;

	@OriginalMember(owner = "client!tf", name = "nb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1266 = aClass28_1265;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!hd;IILclient!qf;)V")
	public static void method2877(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class68 arg2) {
		@Pc(7) Class3_Sub11 local7 = new Class3_Sub11();
		local7.anInt2132 = arg0.method1545();
		local7.anInt2127 = arg0.method1540();
		local7.aClass61Array2 = new Class61[local7.anInt2132];
		local7.aByteArrayArrayArray17 = new byte[local7.anInt2132][][];
		local7.anIntArray352 = new int[local7.anInt2132];
		local7.aClass61Array1 = new Class61[local7.anInt2132];
		local7.anIntArray350 = new int[local7.anInt2132];
		local7.anIntArray351 = new int[local7.anInt2132];
		for (@Pc(49) int local49 = 0; local49 < local7.anInt2132; local49++) {
			try {
				@Pc(54) int local54 = arg0.method1545();
				@Pc(73) String local73;
				@Pc(82) String local82;
				@Pc(84) int local84;
				if (local54 == 0 || local54 == 1 || local54 == 2) {
					local73 = new String(arg0.method1516().method935());
					local82 = new String(arg0.method1516().method935());
					local84 = 0;
					if (local54 == 1) {
						local84 = arg0.method1540();
					}
					local7.anIntArray350[local49] = local54;
					local7.anIntArray352[local49] = local84;
					local7.aClass61Array2[local49] = arg2.method2523(Static19.method580(local73), local82);
				} else if (local54 == 3 || local54 == 4) {
					local73 = new String(arg0.method1516().method935());
					local82 = new String(arg0.method1516().method935());
					local84 = arg0.method1545();
					@Pc(150) String[] local150 = new String[local84];
					for (@Pc(152) int local152 = 0; local152 < local84; local152++) {
						local150[local152] = new String(arg0.method1516().method935());
					}
					@Pc(177) byte[][] local177 = new byte[local84][];
					@Pc(189) int local189;
					if (local54 == 3) {
						for (@Pc(184) int local184 = 0; local184 < local84; local184++) {
							local189 = arg0.method1540();
							local177[local184] = new byte[local189];
							arg0.method1506(local189, local177[local184]);
						}
					}
					@Pc(213) Class[] local213 = new Class[local84];
					local7.anIntArray350[local49] = local54;
					for (local189 = 0; local189 < local84; local189++) {
						local213[local189] = Static19.method580(local150[local189]);
					}
					local7.aClass61Array1[local49] = arg2.method2531(local213, local82, Static19.method580(local73));
					local7.aByteArrayArrayArray17[local49] = local177;
				}
			} catch (@Pc(252) ClassNotFoundException local252) {
				local7.anIntArray351[local49] = -1;
			} catch (@Pc(259) SecurityException local259) {
				local7.anIntArray351[local49] = -2;
			} catch (@Pc(266) NullPointerException local266) {
				local7.anIntArray351[local49] = -3;
			} catch (@Pc(273) Exception local273) {
				local7.anIntArray351[local49] = -4;
			} catch (@Pc(280) Throwable local280) {
				local7.anIntArray351[local49] = -5;
			}
		}
		Static42.aClass23_7.method850(local7);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([BB)[B")
	public static byte[] method2879(@OriginalArg(0) byte[] arg0) {
		@Pc(14) int local14 = arg0.length;
		@Pc(17) byte[] local17 = new byte[local14];
		Static188.method2240(arg0, 0, local17, 0, local14);
		return local17;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIILclient!ah;ZII)V")
	public static void method2880(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class7 arg2, @OriginalArg(5) int arg3) {
		Static164.anInt3981 = arg3;
		Static75.aClass7_32 = arg2;
		Static2.anInt83 = arg0;
		Static128.anInt3266 = 2;
		Static16.anInt492 = arg1;
		Static75.aBoolean117 = false;
		Static8.anInt1209 = 1;
	}

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
	public static void method2881() {
		aClass28_1266 = null;
		aClass28_1262 = null;
		aClass28_1265 = null;
		aClass28_1264 = null;
		aClass28_1263 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZLclient!eh;)V")
	public static void method2882(@OriginalArg(0) int arg0, @OriginalArg(2) Class28 arg1) {
		@Pc(9) Class28 local9 = arg1.method920().method912();
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < Static112.anInt2872; local18++) {
			@Pc(25) Class3_Sub2_Sub1_Sub2_Sub1 local25 = Static34.aClass3_Sub2_Sub1_Sub2_Sub1Array1[Static126.anIntArray557[local18]];
			if (local25 != null && local25.aClass28_296 != null && local25.aClass28_296.method936(local9)) {
				Static179.method3196(0, Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0], 1, 1, false, local25.anIntArray311[0], Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], 0, 2, local25.anIntArray314[0], 0);
				if (arg0 == 1) {
					Static51.aClass3_Sub8_Sub1_2.method1559(2);
					Static51.aClass3_Sub8_Sub1_2.method1503(Static126.anIntArray557[local18]);
				} else if (arg0 == 4) {
					Static51.aClass3_Sub8_Sub1_2.method1559(74);
					Static51.aClass3_Sub8_Sub1_2.method1531(Static126.anIntArray557[local18]);
				} else if (arg0 == 6) {
					Static51.aClass3_Sub8_Sub1_2.method1559(171);
					Static51.aClass3_Sub8_Sub1_2.method1524(Static126.anIntArray557[local18]);
				} else if (arg0 == 7) {
					Static51.aClass3_Sub8_Sub1_2.method1559(163);
					Static51.aClass3_Sub8_Sub1_2.method1514(Static126.anIntArray557[local18]);
				}
				local16 = true;
				break;
			}
		}
		if (!local16) {
			Static51.method1192(Static156.aClass28_1306, 0, Static4.method96(new Class28[] { Static31.aClass28_322, local9 }));
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!gf;II)V")
	public static void method2883(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) int arg2) {
		if (arg1.anInt1501 == 1) {
			Static70.method1646(arg1.aClass28_451, arg1.anInt1471, 0, Static156.aClass28_1306, (short) 3, 0L);
		}
		if (arg1.anInt1501 == 2 && !Static67.aBoolean109) {
			@Pc(35) Class28 local35 = Static173.method3139(arg1);
			if (local35 != null) {
				Static70.method1646(local35, arg1.anInt1471, -1, Static4.method96(new Class28[] { Static168.aClass28_1427, arg1.aClass28_456 }), (short) 34, 0L);
			}
		}
		if (arg1.anInt1501 == 3) {
			Static70.method1646(Static51.aClass28_443, arg1.anInt1471, 0, Static156.aClass28_1306, (short) 58, 0L);
		}
		if (arg1.anInt1501 == 4) {
			Static70.method1646(arg1.aClass28_451, arg1.anInt1471, 0, Static156.aClass28_1306, (short) 29, 0L);
		}
		if (arg1.anInt1501 == 5) {
			Static70.method1646(arg1.aClass28_451, arg1.anInt1471, 0, Static156.aClass28_1306, (short) 24, 0L);
		}
		if (arg1.anInt1501 == 6 && Static175.aClass33_15 == null) {
			Static70.method1646(arg1.aClass28_451, arg1.anInt1471, -1, Static156.aClass28_1306, (short) 44, 0L);
		}
		@Pc(153) int local153;
		@Pc(158) int local158;
		if (arg1.anInt1522 == 2) {
			local153 = 0;
			for (@Pc(155) int local155 = 0; local155 < arg1.anInt1515; local155++) {
				for (local158 = 0; local158 < arg1.anInt1457; local158++) {
					@Pc(166) int local166 = local158 * (arg1.anInt1483 + 32);
					@Pc(173) int local173 = local155 * (arg1.anInt1489 + 32);
					if (local153 < 20) {
						local173 += arg1.anIntArray259[local153];
						local166 += arg1.anIntArray260[local153];
					}
					if (arg0 >= local166 && arg2 >= local173 && local166 + 32 > arg0 && arg2 < local173 + 32) {
						Static15.aClass33_5 = arg1;
						Static148.anInt1804 = local153;
						if (arg1.anIntArray261[local153] > 0) {
							@Pc(241) Class3_Sub2_Sub10 local241 = Static76.method1736(arg1.anIntArray261[local153] - 1);
							if (Static95.anInt2636 == 1 && Static107.method2180(Static4.method97(arg1))) {
								if (Static167.anInt4077 != arg1.anInt1471 || Static161.anInt3932 != local153) {
									Static70.method1646(Static85.aClass28_786, arg1.anInt1471, local153, Static4.method96(new Class28[] { Static154.aClass28_1288, Static7.aClass28_84, local241.aClass28_566 }), (short) 23, (long) local241.anInt1869);
								}
							} else if (!Static67.aBoolean109 || !Static107.method2180(Static4.method97(arg1))) {
								@Pc(298) Class28[] local298 = local241.aClass28Array11;
								if (Static52.aBoolean79) {
									local298 = Static168.method3099(local298);
								}
								@Pc(316) int local316;
								@Pc(363) byte local363;
								if (Static107.method2180(Static4.method97(arg1))) {
									for (local316 = 4; local316 >= 3; local316--) {
										if (local298 != null && local298[local316] != null) {
											if (local316 == 3) {
												local363 = 2;
											} else {
												local363 = 47;
											}
											Static70.method1646(local298[local316], arg1.anInt1471, local153, Static4.method96(new Class28[] { Static29.aClass28_304, local241.aClass28_566 }), local363, (long) local241.anInt1869);
										} else if (local316 == 4) {
											Static70.method1646(Static139.aClass28_1236, arg1.anInt1471, local153, Static4.method96(new Class28[] { Static29.aClass28_304, local241.aClass28_566 }), (short) 47, (long) local241.anInt1869);
										}
									}
								}
								if (Static171.method3106(Static4.method97(arg1))) {
									Static70.method1646(Static85.aClass28_786, arg1.anInt1471, local153, Static4.method96(new Class28[] { Static29.aClass28_304, local241.aClass28_566 }), (short) 7, (long) local241.anInt1869);
								}
								if (Static107.method2180(Static4.method97(arg1)) && local298 != null) {
									for (local316 = 2; local316 >= 0; local316--) {
										if (local298[local316] != null) {
											local363 = 0;
											if (local316 == 0) {
												local363 = 57;
											}
											if (local316 == 1) {
												local363 = 12;
											}
											if (local316 == 2) {
												local363 = 1;
											}
											Static70.method1646(local298[local316], arg1.anInt1471, local153, Static4.method96(new Class28[] { Static29.aClass28_304, local241.aClass28_566 }), local363, (long) local241.anInt1869);
										}
									}
								}
								local298 = arg1.aClass28Array7;
								if (Static52.aBoolean79) {
									local298 = Static168.method3099(local298);
								}
								if (local298 != null) {
									for (local316 = 4; local316 >= 0; local316--) {
										if (local298[local316] != null) {
											local363 = 0;
											if (local316 == 0) {
												local363 = 5;
											}
											if (local316 == 1) {
												local363 = 21;
											}
											if (local316 == 2) {
												local363 = 19;
											}
											if (local316 == 3) {
												local363 = 33;
											}
											if (local316 == 4) {
												local363 = 22;
											}
											Static70.method1646(local298[local316], arg1.anInt1471, local153, Static4.method96(new Class28[] { Static29.aClass28_304, local241.aClass28_566 }), local363, (long) local241.anInt1869);
										}
									}
								}
								Static70.method1646(Static110.aClass28_916, arg1.anInt1471, local153, Static4.method96(new Class28[] { Static29.aClass28_304, local241.aClass28_566 }), (short) 1007, (long) local241.anInt1869);
							} else if ((Static171.anInt4101 & 0x10) == 16) {
								Static70.method1646(Static30.aClass28_313, arg1.anInt1471, local153, Static4.method96(new Class28[] { Static101.aClass28_843, Static7.aClass28_84, local241.aClass28_566 }), (short) 13, (long) local241.anInt1869);
							}
						}
					}
					local153++;
				}
			}
		}
		if (!arg1.aBoolean90) {
			return;
		}
		if (!Static67.aBoolean109) {
			@Pc(669) Class28 local669;
			for (local153 = 9; local153 >= 5; local153--) {
				local669 = Static52.method1200(arg1, local153);
				if (local669 != null) {
					Static70.method1646(local669, arg1.anInt1471, arg1.anInt1496, arg1.aClass28_450, (short) 1001, (long) (local153 + 1));
				}
			}
			local669 = Static173.method3139(arg1);
			if (local669 != null) {
				Static70.method1646(local669, arg1.anInt1471, arg1.anInt1496, arg1.aClass28_450, (short) 34, 0L);
			}
			for (local158 = 4; local158 >= 0; local158--) {
				@Pc(724) Class28 local724 = Static52.method1200(arg1, local158);
				if (local724 != null) {
					Static70.method1646(local724, arg1.anInt1471, arg1.anInt1496, arg1.aClass28_450, (short) 37, (long) (local158 + 1));
				}
			}
			if (Static87.method1993(Static4.method97(arg1))) {
				Static70.method1646(Static38.aClass28_358, arg1.anInt1471, arg1.anInt1496, Static156.aClass28_1306, (short) 44, 0L);
				return;
			}
			return;
		}
		if (Static168.method3098(Static4.method97(arg1)) && (Static171.anInt4101 & 0x20) == 32) {
			Static70.method1646(Static30.aClass28_313, arg1.anInt1471, arg1.anInt1496, Static4.method96(new Class28[] { Static101.aClass28_843, Static128.aClass28_1072, arg1.aClass28_450 }), (short) 32, 0L);
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "(IB)I")
	public static int method2884(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}
}
