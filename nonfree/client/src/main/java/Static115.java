import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!tf", name = "kb", descriptor = "[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] aClass4_Sub4_Sub5_Sub4Array12;

	@OriginalMember(owner = "client!tf", name = "db", descriptor = "Lclient!v;")
	private static Class76 aClass76_1179 = Static134.method2017("Loaded input handler");

	@OriginalMember(owner = "client!tf", name = "ab", descriptor = "Lclient!v;")
	public static Class76 aClass76_1178 = aClass76_1179;

	@OriginalMember(owner = "client!tf", name = "mb", descriptor = "Lclient!ua;")
	public static Class72 aClass72_26 = new Class72(500);

	@OriginalMember(owner = "client!tf", name = "nb", descriptor = "Z")
	public static boolean aBoolean145 = false;

	@OriginalMember(owner = "client!tf", name = "ob", descriptor = "I")
	public static int anInt2500 = 0;

	@OriginalMember(owner = "client!tf", name = "pb", descriptor = "Lclient!v;")
	private static Class76 aClass76_1180 = Static134.method2017("<br>(X100(U(Y");

	@OriginalMember(owner = "client!tf", name = "qb", descriptor = "Lclient!v;")
	public static Class76 aClass76_1181 = Static134.method2017("Freie Welt");

	@OriginalMember(owner = "client!tf", name = "rb", descriptor = "Lclient!v;")
	public static Class76 aClass76_1182 = Static134.method2017("http:)4)4www)3runescape)3com");

	@OriginalMember(owner = "client!tf", name = "sb", descriptor = "Lclient!v;")
	public static Class76 aClass76_1183 = Static134.method2017("(U1");

	@OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V")
	public static void method1741() {
		Static35.method622(false);
		@Pc(12) boolean local12 = true;
		Static84.anInt2030 = 0;
		for (@Pc(16) int local16 = 0; local16 < Static41.aByteArrayArray4.length; local16++) {
			if (Static94.anIntArray308[local16] != -1 && Static41.aByteArrayArray4[local16] == null) {
				Static41.aByteArrayArray4[local16] = Static7.aClass17_Sub1_3.method290(Static94.anIntArray308[local16], 0);
				if (Static41.aByteArrayArray4[local16] == null) {
					Static84.anInt2030++;
					local12 = false;
				}
			}
			if (Static106.anIntArray328[local16] != -1 && Static34.aByteArrayArray2[local16] == null) {
				Static34.aByteArrayArray2[local16] = Static7.aClass17_Sub1_3.method292(0, Static106.anIntArray328[local16], Static47.anIntArrayArray12[local16]);
				if (Static34.aByteArrayArray2[local16] == null) {
					Static84.anInt2030++;
					local12 = false;
				}
			}
		}
		if (!local12) {
			Static122.anInt2653 = 1;
			return;
		}
		local12 = true;
		Static134.anInt2840 = 0;
		@Pc(121) int local121;
		@Pc(132) int local132;
		for (@Pc(102) int local102 = 0; local102 < Static41.aByteArrayArray4.length; local102++) {
			@Pc(108) byte[] local108 = Static34.aByteArrayArray2[local102];
			if (local108 != null) {
				local121 = (Static96.anIntArray314[local102] >> 8) * 64 - Static51.anInt2080;
				local132 = (Static96.anIntArray314[local102] & 0xFF) * 64 - Static64.anInt1649;
				if (Static88.aBoolean128) {
					local121 = 10;
					local132 = 10;
				}
				local12 &= Static64.method1100(local132, local108, local121);
			}
		}
		if (!local12) {
			Static122.anInt2653 = 2;
			return;
		}
		if (Static122.anInt2653 != 0) {
			Static9.method113(true, Static59.method1017(new Class76[] { Static127.aClass76_1288, aClass76_1180 }));
		}
		Static20.method310();
		Static12.method152();
		Static20.method310();
		Static54.aClass81_10.method1978();
		Static20.method310();
		System.gc();
		for (@Pc(186) int local186 = 0; local186 < 4; local186++) {
			Static52.aClass50Array1[local186].method1380();
		}
		@Pc(207) int local207;
		for (local121 = 0; local121 < 4; local121++) {
			for (local132 = 0; local132 < 104; local132++) {
				for (local207 = 0; local207 < 104; local207++) {
					Static62.aByteArrayArrayArray4[local121][local132][local207] = 0;
				}
			}
		}
		Static20.method310();
		Static128.method1929();
		local132 = Static41.aByteArrayArray4.length;
		Static17.method229();
		Static35.method622(true);
		@Pc(260) int local260;
		@Pc(270) int local270;
		@Pc(379) int local379;
		@Pc(332) int local332;
		@Pc(390) int local390;
		if (!Static88.aBoolean128) {
			@Pc(274) byte[] local274;
			for (local207 = 0; local207 < local132; local207++) {
				local260 = (Static96.anIntArray314[local207] >> 8) * 64 - Static51.anInt2080;
				local270 = (Static96.anIntArray314[local207] & 0xFF) * 64 - Static64.anInt1649;
				local274 = Static41.aByteArrayArray4[local207];
				if (local274 != null) {
					Static20.method310();
					Static126.method1910(Static52.aClass50Array1, (Static72.anInt1877 - 6) * 8, Static122.anInt2656 * 8 - 48, local270, local274, local260);
				}
			}
			for (local260 = 0; local260 < local132; local260++) {
				local270 = (Static96.anIntArray314[local260] >> 8) * 64 - Static51.anInt2080;
				@Pc(321) byte[] local321 = Static41.aByteArrayArray4[local260];
				local332 = (Static96.anIntArray314[local260] & 0xFF) * 64 - Static64.anInt1649;
				if (local321 == null && Static122.anInt2656 < 800) {
					Static20.method310();
					Static13.method166(local270, 64, 64, local332);
				}
			}
			Static35.method622(true);
			for (local270 = 0; local270 < local132; local270++) {
				local274 = Static34.aByteArrayArray2[local270];
				if (local274 != null) {
					local379 = (Static96.anIntArray314[local270] & 0xFF) * 64 - Static64.anInt1649;
					local390 = (Static96.anIntArray314[local270] >> 8) * 64 - Static51.anInt2080;
					Static20.method310();
					Static23.method348(Static54.aClass81_10, local274, Static52.aClass50Array1, local390, local379);
				}
			}
		}
		@Pc(447) int local447;
		@Pc(441) int local441;
		if (Static88.aBoolean128) {
			@Pc(453) int local453;
			@Pc(469) int local469;
			@Pc(471) int local471;
			for (local207 = 0; local207 < 4; local207++) {
				Static20.method310();
				for (local260 = 0; local260 < 13; local260++) {
					for (local270 = 0; local270 < 13; local270++) {
						local390 = Static48.anIntArrayArrayArray2[local207][local260][local270];
						@Pc(431) boolean local431 = false;
						if (local390 != -1) {
							local441 = local390 >> 14 & 0x3FF;
							local447 = local390 >> 1 & 0x3;
							local453 = local390 >> 3 & 0x7FF;
							local379 = local390 >> 24 & 0x3;
							local469 = (local441 / 8 << 8) + local453 / 8;
							for (local471 = 0; local471 < Static96.anIntArray314.length; local471++) {
								if (local469 == Static96.anIntArray314[local471] && Static41.aByteArrayArray4[local471] != null) {
									Static85.method1437(local270 * 8, local447, (local441 & 0x7) * 8, local207, Static41.aByteArrayArray4[local471], (local453 & 0x7) * 8, local379, local260 * 8, Static52.aClass50Array1);
									local431 = true;
									break;
								}
							}
						}
						if (!local431) {
							Static23.method347(local260 * 8, local207, local270 * 8);
						}
					}
				}
			}
			for (local260 = 0; local260 < 13; local260++) {
				for (local270 = 0; local270 < 13; local270++) {
					local332 = Static48.anIntArrayArrayArray2[0][local260][local270];
					if (local332 == -1) {
						Static13.method166(local260 * 8, 8, 8, local270 * 8);
					}
				}
			}
			Static35.method622(true);
			for (local270 = 0; local270 < 4; local270++) {
				Static20.method310();
				for (local332 = 0; local332 < 13; local332++) {
					for (local390 = 0; local390 < 13; local390++) {
						local379 = Static48.anIntArrayArrayArray2[local270][local332][local390];
						if (local379 != -1) {
							local447 = local379 >> 24 & 0x3;
							local469 = local379 >> 3 & 0x7FF;
							local441 = local379 >> 1 & 0x3;
							local453 = local379 >> 14 & 0x3FF;
							local471 = (local453 / 8 << 8) + local469 / 8;
							for (@Pc(655) int local655 = 0; local655 < Static96.anIntArray314.length; local655++) {
								if (Static96.anIntArray314[local655] == local471 && Static34.aByteArrayArray2[local655] != null) {
									Static57.method1009((local453 & 0x7) * 8, local441, local270, Static52.aClass50Array1, local390 * 8, Static54.aClass81_10, local447, local332 * 8, Static34.aByteArrayArray2[local655], (local469 & 0x7) * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static35.method622(true);
		Static12.method152();
		Static20.method310();
		Static21.method327(Static52.aClass50Array1, Static54.aClass81_10);
		Static35.method622(true);
		local207 = Static132.anInt2824;
		if (Static124.anInt2712 < local207) {
			local207 = Static124.anInt2712;
		}
		if (local207 < Static124.anInt2712 - 1) {
		}
		if (Static76.aBoolean119) {
			Static54.aClass81_10.method1962(Static132.anInt2824);
		} else {
			Static54.aClass81_10.method1962(0);
		}
		for (local260 = 0; local260 < 104; local260++) {
			for (local270 = 0; local270 < 104; local270++) {
				Static98.method1570(local260, local270);
			}
		}
		Static20.method310();
		Static5.method69();
		aClass72_26.method1786();
		if (Static17.aFrame1 != null) {
			Static69.aClass4_Sub10_Sub1_2.method611(143);
			Static69.aClass4_Sub10_Sub1_2.method597(1057001181);
		}
		if (!Static88.aBoolean128) {
			local270 = (Static72.anInt1877 - 6) / 8;
			local379 = (Static122.anInt2656 + 6) / 8;
			local332 = (Static72.anInt1877 + 6) / 8;
			local390 = (Static122.anInt2656 - 6) / 8;
			for (local447 = local270 - 1; local447 <= local332 + 1; local447++) {
				for (local441 = local390 - 1; local441 <= local379 + 1; local441++) {
					if (local447 < local270 || local447 > local332 || local441 < local390 || local441 > local379) {
						Static7.aClass17_Sub1_3.method286(Static59.method1017(new Class76[] { Static125.aClass76_1281, Static63.method1092(local447), Static132.aClass76_1320, Static63.method1092(local441) }));
						Static7.aClass17_Sub1_3.method286(Static59.method1017(new Class76[] { Static120.aClass76_1222, Static63.method1092(local447), Static132.aClass76_1320, Static63.method1092(local441) }));
					}
				}
			}
		}
		Static73.method1363(30);
		Static20.method310();
		Static29.method384();
		Static69.aClass4_Sub10_Sub1_2.method611(176);
		Static13.method164();
	}

	@OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V")
	public static void method1742() {
		aClass72_26 = null;
		aClass76_1180 = null;
		aClass76_1181 = null;
		aClass76_1182 = null;
		aClass76_1183 = null;
		aClass76_1178 = null;
		aClass76_1179 = null;
		aClass4_Sub4_Sub5_Sub4Array12 = null;
	}
}
