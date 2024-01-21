import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static15 {

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
	public static int anInt410;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!lf;")
	public static Class7 aClass7_4;

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_210 = Static78.method1313("Art");

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "Lclient!fc;")
	private static Class25 aClass25_211 = Static78.method1313("Please try again)3");

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "Lclient!fc;")
	private static Class25 aClass25_212 = Static78.method1313("Bad session id)3");

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!fc;")
	private static Class25 aClass25_213 = Static78.method1313(" has logged out)3");

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!fc;")
	public static Class25 aClass25_214 = aClass25_211;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_215 = aClass25_213;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!fc;")
	public static Class25 aClass25_216 = aClass25_212;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "[I")
	public static int[] anIntArray79 = new int[25];

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)Lclient!id;")
	public static Class1_Sub2_Sub10 method358(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub2_Sub10 local17 = (Class1_Sub2_Sub10) Static42.aClass63_6.method1517((long) arg0);
		if (local17 != null) {
			return local17;
		}
		local17 = Static54.method1021(Static112.aClass56_82, Static95.aClass56_67, arg0);
		if (local17 != null) {
			Static42.aClass63_6.method1520(local17, (long) arg0);
		}
		return local17;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
	public static void method359() {
		anIntArray79 = null;
		aClass25_215 = null;
		aClass25_212 = null;
		aClass7_4 = null;
		aClass25_214 = null;
		aClass25_210 = null;
		aClass25_213 = null;
		aClass25_211 = null;
		aClass25_216 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(B)V")
	public static void method360() {
		if (Static108.anInt2503 < 2 && Static80.anInt1774 == 0 && !Static84.aBoolean83) {
			return;
		}
		@Pc(52) Class25 local52;
		if (Static80.anInt1774 == 1 && Static108.anInt2503 < 2) {
			local52 = Static116.method1859(new Class25[] { Static42.aClass25_475, Static34.aClass25_403, Static65.aClass25_670, Static115.aClass25_1288 });
		} else if (Static84.aBoolean83 && Static108.anInt2503 < 2) {
			local52 = Static116.method1859(new Class25[] { Static83.aClass25_888, Static34.aClass25_403, Static89.aClass25_236, Static115.aClass25_1288 });
		} else {
			local52 = Static84.aClass25Array14[Static108.anInt2503 - 1];
		}
		if (Static108.anInt2503 > 2) {
			local52 = Static116.method1859(new Class25[] { local52, Static39.aClass25_458, Static74.method1214(Static108.anInt2503 - 2), Static7.aClass25_85 });
		}
		Static83.aClass1_Sub2_Sub2_Sub3_3.method1192(local52, Static60.anInt1366 / 1000);
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(B)V")
	public static void method361() {
		Static35.aClass1_Sub5_Sub1_1.method685();
		@Pc(11) int local11 = Static35.aClass1_Sub5_Sub1_1.method691(1);
		if (local11 == 0) {
			return;
		}
		@Pc(30) int local30 = Static35.aClass1_Sub5_Sub1_1.method691(2);
		if (local30 == 0) {
			Static85.anIntArray336[Static59.anInt1356++] = 2047;
			return;
		}
		@Pc(52) int local52;
		@Pc(62) int local62;
		if (local30 == 1) {
			local52 = Static35.aClass1_Sub5_Sub1_1.method691(3);
			Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.method1971(false, local52);
			local62 = Static35.aClass1_Sub5_Sub1_1.method691(1);
			if (local62 == 1) {
				Static85.anIntArray336[Static59.anInt1356++] = 2047;
			}
			return;
		}
		@Pc(104) int local104;
		if (local30 == 2) {
			local52 = Static35.aClass1_Sub5_Sub1_1.method691(3);
			Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.method1971(true, local52);
			local62 = Static35.aClass1_Sub5_Sub1_1.method691(3);
			Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.method1971(true, local62);
			local104 = Static35.aClass1_Sub5_Sub1_1.method691(1);
			if (local104 == 1) {
				Static85.anIntArray336[Static59.anInt1356++] = 2047;
			}
		} else if (local30 == 3) {
			local52 = Static35.aClass1_Sub5_Sub1_1.method691(1);
			if (local52 == 1) {
				Static85.anIntArray336[Static59.anInt1356++] = 2047;
			}
			Static21.anInt596 = Static35.aClass1_Sub5_Sub1_1.method691(2);
			local62 = Static35.aClass1_Sub5_Sub1_1.method691(7);
			local104 = Static35.aClass1_Sub5_Sub1_1.method691(1);
			@Pc(155) int local155 = Static35.aClass1_Sub5_Sub1_1.method691(7);
			Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.method1973(local62, local104 == 1, local155);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILclient!fc;)V")
	public static void method362(@OriginalArg(1) Class25 arg0) {
		if (arg0 == null || arg0.method762() == 0) {
			Static69.anInt1481 = 0;
			return;
		}
		@Pc(21) Class25 local21 = arg0;
		@Pc(24) Class25[] local24 = new Class25[100];
		@Pc(26) int local26 = 0;
		while (true) {
			@Pc(31) int local31 = local21.method801();
			if (local31 == -1) {
				local21 = local21.method773();
				if (local21.method762() > 0) {
					local24[local26++] = local21.method777();
				}
				Static69.anInt1481 = 0;
				label46: for (local31 = 0; local31 < Static56.anInt1324; local31++) {
					@Pc(92) Class1_Sub2_Sub16 local92 = Static33.method736(local31);
					if (local92.anInt2147 == -1 && local92.aClass25_1018 != null) {
						@Pc(104) Class25 local104 = local92.aClass25_1018.method777();
						for (@Pc(106) int local106 = 0; local106 < local26; local106++) {
							if (local104.method796(local24[local106]) == -1) {
								continue label46;
							}
						}
						Static89.aClass25Array2[Static69.anInt1481] = local104;
						Static30.anIntArray163[Static69.anInt1481] = local31;
						Static69.anInt1481++;
						if (Static69.anInt1481 >= Static89.aClass25Array2.length) {
							return;
						}
					}
				}
				return;
			}
			@Pc(62) Class25 local62 = local21.method781(0, local31).method773();
			if (local62.method762() > 0) {
				local24[local26++] = local62.method777();
			}
			local21 = local21.method794(local31 + 1);
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg5 < 1 || arg6 < 1 || arg5 > 102 || arg6 > 102) {
			return;
		}
		if (Static63.aBoolean55 && arg0 != Static21.anInt596) {
			return;
		}
		@Pc(33) int local33 = 0;
		if (arg1 == 0) {
			local33 = Static118.aClass4_1.method62(arg0, arg5, arg6);
		}
		if (arg1 == 1) {
			local33 = Static118.aClass4_1.method64(arg0, arg5, arg6);
		}
		if (arg1 == 2) {
			local33 = Static118.aClass4_1.method60(arg0, arg5, arg6);
		}
		if (arg1 == 3) {
			local33 = Static118.aClass4_1.method90(arg0, arg5, arg6);
		}
		@Pc(93) int local93;
		if (local33 != 0) {
			@Pc(86) int local86 = local33 >> 14 & 0x7FFF;
			local93 = Static118.aClass4_1.method57(arg0, arg5, arg6, local33);
			@Pc(97) int local97 = local93 & 0x1F;
			@Pc(103) int local103 = local93 >> 6 & 0x3;
			@Pc(117) Class1_Sub2_Sub6 local117;
			if (arg1 == 0) {
				Static118.aClass4_1.method73(arg0, arg5, arg6);
				local117 = Static78.method1315(local86);
				if (local117.anInt871 != 0) {
					Static102.aClass62Array1[arg0].method1446(arg5, local97, local117.aBoolean34, arg6, local103);
				}
			}
			if (arg1 == 1) {
				Static118.aClass4_1.method81(arg0, arg5, arg6);
			}
			if (arg1 == 2) {
				Static118.aClass4_1.method75(arg0, arg5, arg6);
				local117 = Static78.method1315(local86);
				if (arg5 + local117.anInt845 > 103 || arg6 + local117.anInt845 > 103 || arg5 + local117.anInt857 > 103 || arg6 + local117.anInt857 > 103) {
					return;
				}
				if (local117.anInt871 != 0) {
					Static102.aClass62Array1[arg0].method1454(local117.anInt845, local117.aBoolean34, local117.anInt857, arg6, arg5, local103);
				}
			}
			if (arg1 == 3) {
				Static118.aClass4_1.method58(arg0, arg5, arg6);
				local117 = Static78.method1315(local86);
				if (local117.anInt871 == 1) {
					Static102.aClass62Array1[arg0].method1449(arg6, arg5);
				}
			}
		}
		if (arg2 < 0) {
			return;
		}
		local93 = arg0;
		if (arg0 < 3 && (Static116.aByteArrayArrayArray7[1][arg5][arg6] & 0x2) == 2) {
			local93 = arg0 + 1;
		}
		Static84.method1411(arg5, arg3, Static118.aClass4_1, arg0, arg4, arg6, local93, arg2, Static102.aClass62Array1[arg0]);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lclient!ma;BLclient!ma;)V")
	public static void method364(@OriginalArg(0) Class1_Sub2_Sub2_Sub3 arg0, @OriginalArg(2) Class1_Sub2_Sub2_Sub3 arg1) {
		if (Static93.aBoolean103) {
			Static76.method1233(arg1, arg0);
			return;
		}
		if (Static48.anInt1227 == 0 || Static48.anInt1227 == 5) {
			arg0.method1200(Static31.aClass25_362, 382, 225, 16777215, -1);
			Static128.method1938(230, 233, 304, 34, 9179409);
			Static128.method1938(231, 234, 302, 32, 0);
			Static128.method1935(232, 235, Static109.anInt2512 * 3, 30, 9179409);
			Static128.method1935(Static109.anInt2512 * 3 + 232, 235, 300 - Static109.anInt2512 * 3, 30, 0);
			arg0.method1200(Static81.aClass25_861, 382, 256, 16777215, -1);
		}
		@Pc(95) short local95;
		@Pc(119) int local119;
		if (Static48.anInt1227 == 20) {
			local95 = 211;
			Static109.aClass1_Sub2_Sub2_Sub4_17.method1953(382 - Static109.aClass1_Sub2_Sub2_Sub4_17.anInt2756 / 2, -(Static109.aClass1_Sub2_Sub2_Sub4_17.anInt2758 / 2) + 271);
			arg0.method1200(Static81.aClass25_863, 382, 211, 16776960, 0);
			local119 = local95 + 15;
			arg0.method1200(Static81.aClass25_866, 382, 226, 16776960, 0);
			@Pc(127) int local127 = local119 + 15;
			arg0.method1200(Static81.aClass25_867, 382, 241, 16776960, 0);
			@Pc(135) int local135 = local127 + 15;
			@Pc(136) int local136 = local135 + 10;
			arg0.method1180(Static116.method1859(new Class25[] { Static122.aClass25_1412, Static72.method1188(Static81.aClass25_862) }), 272, 266, 16777215, 0);
			@Pc(156) int local156 = local136 + 15;
			arg0.method1180(Static116.method1859(new Class25[] { Static83.aClass25_892, Static81.aClass25_857.method793() }), 274, 281, 16777215, 0);
			@Pc(177) int local177 = local156 + 15;
		}
		if (Static48.anInt1227 == 10) {
			Static109.aClass1_Sub2_Sub2_Sub4_17.method1953(202, 171);
			if (Static49.anInt1229 == 0) {
				local95 = 251;
				arg0.method1200(Static107.aClass25_1185, 382, 251, 16776960, 0);
				local119 = local95 + 30;
				Static74.aClass1_Sub2_Sub2_Sub4_9.method1953(229, 271);
				arg0.method1179(Static116.aClass25_1303, 229, 271, 144, 40, 16777215, 0, 1, 1, 0);
				Static74.aClass1_Sub2_Sub2_Sub4_9.method1953(389, 271);
				arg0.method1179(Static109.aClass25_1200, 389, 271, 144, 40, 16777215, 0, 1, 1, 0);
			} else if (Static49.anInt1229 == 2) {
				local95 = 211;
				arg0.method1200(Static81.aClass25_863, 382, 211, 16776960, 0);
				local119 = local95 + 15;
				arg0.method1200(Static81.aClass25_866, 382, 226, 16776960, 0);
				local119 += 15;
				arg0.method1200(Static81.aClass25_867, 382, 241, 16776960, 0);
				local119 += 15;
				local119 += 10;
				arg0.method1180(Static116.method1859(new Class25[] { Static122.aClass25_1412, Static72.method1188(Static81.aClass25_862), Static106.anInt2481 == 0 & Static60.anInt1366 % 40 < 20 ? Static16.aClass25_229 : Static81.aClass25_858 }), 272, 266, 16777215, 0);
				local119 += 15;
				arg0.method1180(Static116.method1859(new Class25[] { Static83.aClass25_892, Static81.aClass25_857.method793(), Static106.anInt2481 == 1 & Static60.anInt1366 % 40 < 20 ? Static16.aClass25_229 : Static81.aClass25_858 }), 274, 281, 16777215, 0);
				local119 += 15;
				Static74.aClass1_Sub2_Sub2_Sub4_9.method1953(229, 301);
				arg0.method1200(Static52.aClass25_537, 302, 326, 16777215, 0);
				Static74.aClass1_Sub2_Sub2_Sub4_9.method1953(389, 301);
				arg0.method1200(Static38.aClass25_453, 462, 326, 16777215, 0);
			} else if (Static49.anInt1229 == 3) {
				local95 = 236;
				arg0.method1200(Static110.aClass25_1234, 382, 211, 16776960, 0);
				arg0.method1200(Static81.aClass25_868, 382, 236, 16777215, 0);
				local119 = local95 + 15;
				arg0.method1200(Static112.aClass25_1275, 382, 251, 16777215, 0);
				local119 += 15;
				arg0.method1200(Static111.aClass25_1249, 382, 266, 16777215, 0);
				local119 += 15;
				arg0.method1200(Static124.aClass25_1407, 382, 281, 16777215, 0);
				local119 += 15;
				Static74.aClass1_Sub2_Sub2_Sub4_9.method1953(309, 301);
				arg0.method1200(Static38.aClass25_453, 382, 326, 16777215, 0);
			}
		}
		if (Static37.anInt1050 > 0) {
			Static61.method1083(Static37.anInt1050);
			Static37.anInt1050 = 0;
		}
		Static3.method39();
		Static127.aClass1_Sub2_Sub2_Sub4Array10[Static42.aBoolean46 ? 1 : 0].method1953(725, 463);
		if (Static48.anInt1227 > 5 && Static81.anInt1800 != 2 && Static34.anInt947 == 0) {
			if (Static24.aClass1_Sub2_Sub2_Sub4_4 == null) {
				Static24.aClass1_Sub2_Sub2_Sub4_4 = Static26.method594(Static81.aClass25_858, Static24.aClass25_301, Static110.aClass56_Sub1_17);
			} else {
				Static24.aClass1_Sub2_Sub2_Sub4_4.method1953(5, 463);
				arg0.method1200(Static116.method1859(new Class25[] { Static88.aClass25_945, Static59.aClass25_586, Static74.method1214(Static48.anInt1226) }), 55, 478, 16777215, 0);
				if (Static61.aClass3_1 == null) {
					arg1.method1200(Static14.aClass25_205, 55, 492, 16777215, 0);
				} else {
					arg1.method1200(Static93.aClass25_996, 55, 492, 16777215, 0);
				}
			}
		}
		try {
			@Pc(620) Graphics local620 = Static119.aCanvas1.getGraphics();
			Static88.aClass7_14.method1095(local620, 0, 0);
		} catch (@Pc(628) Exception local628) {
			Static119.aCanvas1.repaint();
		}
	}
}
