import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!fa", name = "Eb", descriptor = "Lclient!he;")
	public static Class1_Sub1_Sub6_Sub2 aClass1_Sub1_Sub6_Sub2_12;

	@OriginalMember(owner = "client!fa", name = "Pb", descriptor = "[I")
	public static int[] anIntArray261;

	@OriginalMember(owner = "client!fa", name = "Ub", descriptor = "Lclient!ee;")
	public static Class1_Sub1_Sub7 aClass1_Sub1_Sub7_6;

	@OriginalMember(owner = "client!fa", name = "ec", descriptor = "[I")
	public static int[] anIntArray263;

	@OriginalMember(owner = "client!fa", name = "Dc", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!fa", name = "Ib", descriptor = "I")
	public static int anInt2178 = 0;

	@OriginalMember(owner = "client!fa", name = "Qc", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1259 = Static15.method178("Starting game engine)3)3)3");

	@OriginalMember(owner = "client!fa", name = "Ac", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1258 = aClass23_1259;

	@OriginalMember(owner = "client!fa", name = "Sc", descriptor = "I")
	public static int anInt2227 = 0;

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(B)V")
	public static void method1388() {
		Static70.method1145(false);
		@Pc(4) boolean local4 = true;
		Static11.anInt211 = 0;
		for (@Pc(12) int local12 = 0; local12 < Static57.aByteArrayArray4.length; local12++) {
			if (Static21.anIntArray93[local12] != -1 && Static57.aByteArrayArray4[local12] == null) {
				Static57.aByteArrayArray4[local12] = Static65.aClass55_Sub1_12.method1867(0, Static21.anIntArray93[local12]);
				if (Static57.aByteArrayArray4[local12] == null) {
					Static11.anInt211++;
					local4 = false;
				}
			}
			if (Static96.anIntArray205[local12] != -1 && Static75.aByteArrayArray5[local12] == null) {
				Static75.aByteArrayArray5[local12] = Static65.aClass55_Sub1_12.method1881(0, Static100.anIntArrayArray58[local12], Static96.anIntArray205[local12]);
				if (Static75.aByteArrayArray5[local12] == null) {
					Static11.anInt211++;
					local4 = false;
				}
			}
		}
		if (!local4) {
			Static87.anInt2853 = 1;
			return;
		}
		local4 = true;
		Static14.anInt274 = 0;
		@Pc(115) int local115;
		@Pc(126) int local126;
		for (@Pc(97) int local97 = 0; local97 < Static57.aByteArrayArray4.length; local97++) {
			@Pc(102) byte[] local102 = Static75.aByteArrayArray5[local97];
			if (local102 != null) {
				local115 = (Static96.anIntArray206[local97] >> 8) * 64 - Static104.anInt2684;
				local126 = (Static96.anIntArray206[local97] & 0xFF) * 64 - Static107.anInt2745;
				if (Static63.aBoolean96) {
					local126 = 10;
					local115 = 10;
				}
				local4 &= Static21.method348(local126, local115, local102);
			}
		}
		if (!local4) {
			Static87.anInt2853 = 2;
			return;
		}
		if (Static87.anInt2853 != 0) {
			Static83.method1459(true, Static2.aClass23_1293, Static56.aClass23_933);
		}
		Static19.method276();
		Static19.aClass65_1.method1722();
		System.gc();
		for (@Pc(167) int local167 = 0; local167 < 4; local167++) {
			Static45.aClass50Array1[local167].method1359();
		}
		@Pc(189) int local189;
		for (local115 = 0; local115 < 4; local115++) {
			for (local126 = 0; local126 < 104; local126++) {
				for (local189 = 0; local189 < 104; local189++) {
					Static95.aByteArrayArrayArray5[local115][local126][local189] = 0;
				}
			}
		}
		Static2.method1417();
		local126 = Static57.aByteArrayArray4.length;
		Static58.method1854();
		Static70.method1145(true);
		@Pc(259) int local259;
		@Pc(244) int local244;
		@Pc(350) int local350;
		@Pc(306) int local306;
		@Pc(360) int local360;
		if (!Static63.aBoolean96) {
			@Pc(248) byte[] local248;
			for (local189 = 0; local189 < local126; local189++) {
				local244 = (Static96.anIntArray206[local189] & 0xFF) * 64 - Static107.anInt2745;
				local248 = Static57.aByteArrayArray4[local189];
				local259 = (Static96.anIntArray206[local189] >> 8) * 64 - Static104.anInt2684;
				if (local248 != null) {
					Static47.method980((Static104.anInt2681 - 6) * 8, local244, Static45.aClass50Array1, local248, local259, (Static110.anInt2867 - 6) * 8);
				}
			}
			for (local259 = 0; local259 < local126; local259++) {
				local244 = (Static96.anIntArray206[local259] >> 8) * 64 - Static104.anInt2684;
				local306 = (Static96.anIntArray206[local259] & 0xFF) * 64 - Static107.anInt2745;
				@Pc(310) byte[] local310 = Static57.aByteArrayArray4[local259];
				if (local310 == null && Static110.anInt2867 < 800) {
					Static104.method1777(64, 64, local306, local244);
				}
			}
			Static70.method1145(true);
			for (local244 = 0; local244 < local126; local244++) {
				local248 = Static75.aByteArrayArray5[local244];
				if (local248 != null) {
					local350 = (Static96.anIntArray206[local244] & 0xFF) * 64 - Static107.anInt2745;
					local360 = (Static96.anIntArray206[local244] >> 8) * 64 - Static104.anInt2684;
					Static39.method860(Static45.aClass50Array1, Static19.aClass65_1, local248, local360, local350);
				}
			}
		}
		@Pc(412) int local412;
		@Pc(418) int local418;
		if (Static63.aBoolean96) {
			@Pc(424) int local424;
			@Pc(434) int local434;
			@Pc(436) int local436;
			for (local189 = 0; local189 < 4; local189++) {
				for (local259 = 0; local259 < 13; local259++) {
					for (local244 = 0; local244 < 13; local244++) {
						@Pc(388) boolean local388 = false;
						local360 = Static21.anIntArrayArrayArray1[local189][local259][local244];
						if (local360 != -1) {
							local350 = local360 >> 24 & 0x3;
							local412 = local360 >> 1 & 0x3;
							local418 = local360 >> 14 & 0x3FF;
							local424 = local360 >> 3 & 0x7FF;
							local434 = (local418 / 8 << 8) + local424 / 8;
							for (local436 = 0; local436 < Static96.anIntArray206.length; local436++) {
								if (Static96.anIntArray206[local436] == local434 && Static57.aByteArrayArray4[local436] != null) {
									Static39.method859(local189, (local418 & 0x7) * 8, local412, Static57.aByteArrayArray4[local436], Static45.aClass50Array1, (local424 & 0x7) * 8, local259 * 8, local350, local244 * 8);
									local388 = true;
									break;
								}
							}
						}
						if (!local388) {
							Static88.method725(local259 * 8, local189, local244 * 8);
						}
					}
				}
			}
			for (local259 = 0; local259 < 13; local259++) {
				for (local244 = 0; local244 < 13; local244++) {
					local306 = Static21.anIntArrayArrayArray1[0][local259][local244];
					if (local306 == -1) {
						Static104.method1777(8, 8, local244 * 8, local259 * 8);
					}
				}
			}
			Static70.method1145(true);
			for (local244 = 0; local244 < 4; local244++) {
				for (local306 = 0; local306 < 13; local306++) {
					for (local360 = 0; local360 < 13; local360++) {
						local350 = Static21.anIntArrayArrayArray1[local244][local306][local360];
						if (local350 != -1) {
							local412 = local350 >> 24 & 0x3;
							local418 = local350 >> 1 & 0x3;
							local434 = local350 >> 3 & 0x7FF;
							local424 = local350 >> 14 & 0x3FF;
							local436 = (local424 / 8 << 8) + local434 / 8;
							for (@Pc(605) int local605 = 0; local605 < Static96.anIntArray206.length; local605++) {
								if (local436 == Static96.anIntArray206[local605] && Static75.aByteArrayArray5[local605] != null) {
									Static111.method1905(local418, Static45.aClass50Array1, local360 * 8, local244, (local424 & 0x7) * 8, local306 * 8, local412, (local434 & 0x7) * 8, Static75.aByteArrayArray5[local605], Static19.aClass65_1);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static70.method1145(true);
		Static19.method276();
		Static110.method1891(Static45.aClass50Array1, Static19.aClass65_1);
		Static70.method1145(true);
		local189 = Static80.anInt2258;
		if (local189 > Static79.anInt2137) {
			local189 = Static79.anInt2137;
		}
		if (Static79.anInt2137 - 1 > local189) {
		}
		if (Static9.aBoolean7) {
			Static19.aClass65_1.method1718(Static80.anInt2258);
		} else {
			Static19.aClass65_1.method1718(0);
		}
		for (local259 = 0; local259 < 104; local259++) {
			for (local244 = 0; local244 < 104; local244++) {
				Static104.method1776(local244, local259);
			}
		}
		Static108.method1840();
		Static11.aClass5_9.method99();
		if (Static61.aFrame1 != null) {
			Static76.aClass1_Sub5_Sub1_2.method731(78);
			Static76.aClass1_Sub5_Sub1_2.method679(1057001181);
		}
		if (!Static63.aBoolean96) {
			local244 = (Static104.anInt2681 - 6) / 8;
			local306 = (Static104.anInt2681 + 6) / 8;
			local350 = (Static110.anInt2867 + 6) / 8;
			local360 = (Static110.anInt2867 - 6) / 8;
			for (local412 = local244 - 1; local412 <= local306 + 1; local412++) {
				for (local418 = local360 - 1; local418 <= local350 + 1; local418++) {
					if (local244 > local412 || local412 > local306 || local360 > local418 || local350 < local418) {
						Static65.aClass55_Sub1_12.method1884(Static17.method233(new Class23[] { Static33.aClass23_572, Static19.method274(local412), Static68.aClass23_250, Static19.method274(local418) }));
						Static65.aClass55_Sub1_12.method1884(Static17.method233(new Class23[] { Static42.aClass23_767, Static19.method274(local412), Static68.aClass23_250, Static19.method274(local418) }));
					}
				}
			}
		}
		if (Static77.anInt2096 == -1) {
			Static89.method1524(30);
		} else {
			Static89.method1524(35);
		}
		Static96.method1110();
		Static76.aClass1_Sub5_Sub1_2.method731(8);
		Static57.method1098();
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!rb;ILclient!rb;)I")
	public static int method1392(@OriginalArg(0) Class55 arg0, @OriginalArg(2) Class55 arg1) {
		@Pc(10) int local10 = 0;
		if (arg0.method1862(Static76.aClass23_1213, Static109.aClass23_1683)) {
			local10++;
		}
		if (arg1.method1862(Static76.aClass23_1213, Static63.aClass23_1091)) {
			local10++;
		}
		if (arg1.method1862(Static76.aClass23_1213, Static25.aClass23_435)) {
			local10++;
		}
		if (arg1.method1862(Static76.aClass23_1213, Static27.aClass23_473)) {
			local10++;
		}
		if (arg1.method1862(Static76.aClass23_1213, Static31.aClass23_525)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(B)V")
	public static void method1393() {
		if (Static97.aClass11_1 == null) {
			return;
		}
		Static69.method1283();
		if (Static11.anInt219 > 0) {
			Static97.aClass11_1.method1105(256);
			Static11.anInt219 = 0;
		}
		Static97.aClass11_1.method1114();
		Static97.aClass11_1 = null;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!rb;III)[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] method1394(@OriginalArg(0) Class55 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static106.method1796(arg2, arg0, arg1) ? Static102.method1704() : null;
	}

	@OriginalMember(owner = "client!fa", name = "i", descriptor = "(I)V")
	public static void method1395() {
		anIntArray265 = null;
		aClass23_1259 = null;
		anIntArray263 = null;
		aClass1_Sub1_Sub6_Sub2_12 = null;
		aClass1_Sub1_Sub7_6 = null;
		anIntArray261 = null;
		aClass23_1258 = null;
	}
}
