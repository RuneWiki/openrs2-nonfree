import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static135 {

	@OriginalMember(owner = "client!pg", name = "Z", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1193 = Static49.method1293("Konfig geladen)3");

	@OriginalMember(owner = "client!pg", name = "hb", descriptor = "[I")
	public static int[] anIntArray336 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!pg", name = "jb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1194 = Static49.method1293("Registrierter Benutzer");

	@OriginalMember(owner = "client!pg", name = "nb", descriptor = "[Lclient!rf;")
	public static Class70[] aClass70Array18 = new Class70[1000];

	@OriginalMember(owner = "client!pg", name = "pb", descriptor = "Lclient!fc;")
	public static Class25 aClass25_20 = new Class25(64);

	@OriginalMember(owner = "client!pg", name = "sb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1195 = Static49.method1293("Please contact customer support)3");

	@OriginalMember(owner = "client!pg", name = "ub", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1196 = aClass70_1195;

	@OriginalMember(owner = "client!pg", name = "wb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1197 = Static49.method1293(" zuerst von Ihrer Ignorieren)2Liste(Q");

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!rf;Lclient!u;Lclient!rf;B)[Lclient!pf;")
	public static Class1_Sub1_Sub1_Sub3[] method2643(@OriginalArg(0) Class70 arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class70 arg2) {
		@Pc(19) int local19 = arg1.method3309(arg0);
		@Pc(25) int local25 = arg1.method3312(arg2, local19);
		return Static75.method1681(local25, arg1, local19);
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IB)V")
	public static void method2644(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub16 local12 = (Class1_Sub16) Static61.aClass30_8.method1467((long) arg0);
		if (local12 != null) {
			for (@Pc(21) int local21 = 0; local21 < local12.anIntArray250.length; local21++) {
				local12.anIntArray250[local21] = -1;
				local12.anIntArray251[local21] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "f", descriptor = "(I)V")
	public static void method2645() {
		aClass70Array18 = null;
		aClass70_1195 = null;
		aClass25_20 = null;
		aClass70_1196 = null;
		anIntArray336 = null;
		aClass70_1194 = null;
		aClass70_1193 = null;
		aClass70_1197 = null;
	}

	@OriginalMember(owner = "client!pg", name = "g", descriptor = "(I)V")
	public static void method2648() {
		Static31.method793(false);
		Static96.anInt2795 = 0;
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < Static148.aByteArrayArray9.length; local16++) {
			if (Static68.anIntArray204[local16] != -1 && Static148.aByteArrayArray9[local16] == null) {
				Static148.aByteArrayArray9[local16] = Static67.aClass76_Sub1_6.method3316(0, Static68.anIntArray204[local16]);
				if (Static148.aByteArrayArray9[local16] == null) {
					Static96.anInt2795++;
					local14 = false;
				}
			}
			if (Static38.anIntArray124[local16] != -1 && Static148.aByteArrayArray8[local16] == null) {
				Static148.aByteArrayArray8[local16] = Static67.aClass76_Sub1_6.method3322(0, Static56.anIntArrayArray18[local16], Static38.anIntArray124[local16]);
				if (Static148.aByteArrayArray8[local16] == null) {
					local14 = false;
					Static96.anInt2795++;
				}
			}
		}
		if (!local14) {
			Static115.anInt3157 = 1;
			return;
		}
		Static131.anInt3437 = 0;
		local14 = true;
		@Pc(119) int local119;
		@Pc(130) int local130;
		for (@Pc(100) int local100 = 0; local100 < Static148.aByteArrayArray9.length; local100++) {
			@Pc(106) byte[] local106 = Static148.aByteArrayArray8[local100];
			if (local106 != null) {
				local119 = (Static24.anIntArray41[local100] >> 8) * 64 - Static154.anInt4068;
				local130 = (Static24.anIntArray41[local100] & 0xFF) * 64 - Static64.anInt987;
				if (Static164.aBoolean160) {
					local130 = 10;
					local119 = 10;
				}
				local14 &= Static126.method629(local119, local106, local130);
			}
		}
		if (!local14) {
			Static115.anInt3157 = 2;
			return;
		}
		if (Static115.anInt3157 != 0) {
			Static44.method1098(true, Static160.method3210(new Class70[] { Static88.aClass70_862, Static8.aClass70_95 }));
		}
		Static30.method785();
		Static106.method2215();
		Static30.method785();
		Static6.method237();
		Static30.method785();
		System.gc();
		for (@Pc(183) int local183 = 0; local183 < 4; local183++) {
			Static96.aClass59Array1[local183].method2471();
		}
		@Pc(211) int local211;
		for (local119 = 0; local119 < 4; local119++) {
			for (local130 = 0; local130 < 104; local130++) {
				for (local211 = 0; local211 < 104; local211++) {
					Static20.aByteArrayArrayArray1[local119][local130][local211] = 0;
				}
			}
		}
		Static30.method785();
		Static47.method1287();
		local130 = Static148.aByteArrayArray9.length;
		Static141.method2761();
		Static31.method793(true);
		@Pc(264) int local264;
		@Pc(275) int local275;
		@Pc(390) int local390;
		@Pc(332) int local332;
		@Pc(379) int local379;
		if (!Static164.aBoolean160) {
			@Pc(279) byte[] local279;
			for (local211 = 0; local211 < local130; local211++) {
				local264 = (Static24.anIntArray41[local211] >> 8) * 64 - Static154.anInt4068;
				local275 = (Static24.anIntArray41[local211] & 0xFF) * 64 - Static64.anInt987;
				local279 = Static148.aByteArrayArray9[local211];
				if (local279 != null) {
					Static30.method785();
					Static133.method2569((Static108.anInt3053 - 6) * 8, Static96.aClass59Array1, (Static22.anInt597 - 6) * 8, local264, local279, local275);
				}
			}
			for (local264 = 0; local264 < local130; local264++) {
				local275 = (Static24.anIntArray41[local264] >> 8) * 64 - Static154.anInt4068;
				@Pc(322) byte[] local322 = Static148.aByteArrayArray9[local264];
				local332 = (Static24.anIntArray41[local264] & 0xFF) * 64 - Static64.anInt987;
				if (local322 == null && Static22.anInt597 < 800) {
					Static30.method785();
					Static22.method472(64, local275, local332, 64);
				}
			}
			Static31.method793(true);
			for (local275 = 0; local275 < local130; local275++) {
				local279 = Static148.aByteArrayArray8[local275];
				if (local279 != null) {
					local379 = (Static24.anIntArray41[local275] >> 8) * 64 - Static154.anInt4068;
					local390 = (Static24.anIntArray41[local275] & 0xFF) * 64 - Static64.anInt987;
					Static30.method785();
					Static94.method2040(local390, local379, local279, Static96.aClass59Array1);
				}
			}
		}
		@Pc(447) int local447;
		@Pc(453) int local453;
		if (Static164.aBoolean160) {
			@Pc(459) int local459;
			@Pc(470) int local470;
			@Pc(472) int local472;
			for (local211 = 0; local211 < 4; local211++) {
				Static30.method785();
				for (local264 = 0; local264 < 13; local264++) {
					for (local275 = 0; local275 < 13; local275++) {
						local379 = Static15.anIntArrayArrayArray1[local211][local264][local275];
						@Pc(432) boolean local432 = false;
						if (local379 != -1) {
							local390 = local379 >> 24 & 0x3;
							local447 = local379 >> 1 & 0x3;
							local453 = local379 >> 14 & 0x3FF;
							local459 = local379 >> 3 & 0x7FF;
							local470 = (local453 / 8 << 8) + (local459 / 8);
							for (local472 = 0; local472 < Static24.anIntArray41.length; local472++) {
								if (local470 == Static24.anIntArray41[local472] && Static148.aByteArrayArray9[local472] != null) {
									local432 = true;
									Static154.method3105(Static96.aClass59Array1, (local453 & 0x7) * 8, local211, (local459 & 0x7) * 8, local264 * 8, Static148.aByteArrayArray9[local472], local390, local275 * 8, local447);
									break;
								}
							}
						}
						if (!local432) {
							Static60.method1461(local275 * 8, local211, local264 * 8);
						}
					}
				}
			}
			for (local264 = 0; local264 < 13; local264++) {
				for (local275 = 0; local275 < 13; local275++) {
					local332 = Static15.anIntArrayArrayArray1[0][local264][local275];
					if (local332 == -1) {
						Static22.method472(8, local264 * 8, local275 * 8, 8);
					}
				}
			}
			Static31.method793(true);
			for (local275 = 0; local275 < 4; local275++) {
				Static30.method785();
				for (local332 = 0; local332 < 13; local332++) {
					for (local379 = 0; local379 < 13; local379++) {
						local390 = Static15.anIntArrayArrayArray1[local275][local332][local379];
						if (local390 != -1) {
							local447 = local390 >> 24 & 0x3;
							local453 = local390 >> 1 & 0x3;
							local459 = local390 >> 14 & 0x3FF;
							local470 = local390 >> 3 & 0x7FF;
							local472 = local470 / 8 + (local459 / 8 << 8);
							for (@Pc(657) int local657 = 0; local657 < Static24.anIntArray41.length; local657++) {
								if (local472 == Static24.anIntArray41[local657] && Static148.aByteArrayArray8[local657] != null) {
									Static98.method2115((local470 & 0x7) * 8, local379 * 8, local275, Static96.aClass59Array1, local332 * 8, (local459 & 0x7) * 8, local447, Static148.aByteArrayArray8[local657], local453);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static31.method793(true);
		Static106.method2215();
		Static30.method785();
		Static167.method3338(Static96.aClass59Array1);
		Static31.method793(true);
		local211 = Static122.anInt3337;
		if (local211 > Static56.anInt1784) {
			local211 = Static56.anInt1784;
		}
		if (Static56.anInt1784 - 1 > local211) {
		}
		if (Static79.aBoolean91) {
			Static24.method519(Static122.anInt3337);
		} else {
			Static24.method519(0);
		}
		for (local264 = 0; local264 < 104; local264++) {
			for (local275 = 0; local275 < 104; local275++) {
				Static81.method1834(local275, local264);
			}
		}
		Static30.method785();
		Static64.method766();
		Static106.method2215();
		if (Static131.aFrame1 != null) {
			Static131.aClass1_Sub9_Sub1_3.method1283(83);
			Static131.aClass1_Sub9_Sub1_3.method1259(1057001181);
		}
		if (!Static164.aBoolean160) {
			local275 = (Static108.anInt3053 - 6) / 8;
			local332 = (Static108.anInt3053 + 6) / 8;
			local379 = (Static22.anInt597 - 6) / 8;
			local390 = (Static22.anInt597 + 6) / 8;
			for (local447 = local275 - 1; local447 <= local332 + 1; local447++) {
				for (local453 = local379 - 1; local453 <= local390 + 1; local453++) {
					if (local447 < local275 || local447 > local332 || local379 > local453 || local390 < local453) {
						Static67.aClass76_Sub1_6.method3320(Static160.method3210(new Class70[] { Static38.aClass70_429, Static34.method873(local447), Static107.aClass70_981, Static34.method873(local453) }));
						Static67.aClass76_Sub1_6.method3320(Static160.method3210(new Class70[] { Static69.aClass70_664, Static34.method873(local447), Static107.aClass70_981, Static34.method873(local453) }));
					}
				}
			}
		}
		Static77.method1751(30);
		Static30.method785();
		Static52.method1331();
		Static131.aClass1_Sub9_Sub1_3.method1283(97);
		Static94.method2039();
	}
}
