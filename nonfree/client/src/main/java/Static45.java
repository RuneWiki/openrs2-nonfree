import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!ec", name = "sb", descriptor = "I")
	public static int anInt1165;

	@OriginalMember(owner = "client!ec", name = "tb", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_45;

	@OriginalMember(owner = "client!ec", name = "ub", descriptor = "Lclient!ha;")
	public static Class34 aClass34_4;

	@OriginalMember(owner = "client!ec", name = "kb", descriptor = "Lclient!k;")
	public static final Class1_Sub14_Sub1 aClass1_Sub14_Sub1_8 = new Class1_Sub14_Sub1(5000);

	@OriginalMember(owner = "client!ec", name = "pb", descriptor = "[Z")
	public static final boolean[] aBooleanArray7 = new boolean[100];

	@OriginalMember(owner = "client!ec", name = "rb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_725 = Static118.method2249("k");

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(BI)I")
	public static int method755(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(B)V")
	public static void method756() {
		if (Static202.aClass23_3 != null) {
			Static202.aClass23_3.method731();
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)Lclient!gi;")
	public static Class1_Sub2_Sub12 method757(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub12 local6 = (Class1_Sub2_Sub12) Static34.aClass87_17.method3062((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static52.aClass60_10.method2340(arg0, 4);
		local6 = new Class1_Sub2_Sub12();
		if (local20 != null) {
			local6.method1158(arg0, new Class1_Sub14(local20));
		}
		Static34.aClass87_17.method3068(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(II)V")
	public static void method758(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static100.aBooleanArray13[arg0]) {
			return;
		}
		Static61.aClass60_13.method2322(arg0);
		if (Static99.aClass97ArrayArray1[arg0] == null) {
			return;
		}
		@Pc(24) boolean local24 = true;
		for (@Pc(26) int local26 = 0; local26 < Static99.aClass97ArrayArray1[arg0].length; local26++) {
			if (Static99.aClass97ArrayArray1[arg0][local26] != null) {
				if (Static99.aClass97ArrayArray1[arg0][local26].anInt4329 == 2) {
					local24 = false;
				} else {
					Static99.aClass97ArrayArray1[arg0][local26] = null;
				}
			}
		}
		if (local24) {
			Static99.aClass97ArrayArray1[arg0] = null;
		}
		Static100.aBooleanArray13[arg0] = false;
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(B)V")
	public static void method759() {
		Static111.method2032(false);
		Static182.anInt4064 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static98.aByteArrayArray24.length; local14++) {
			if (Static193.anIntArray476[local14] != -1 && Static98.aByteArrayArray24[local14] == null) {
				Static98.aByteArrayArray24[local14] = Static121.aClass60_Sub1_115.method2340(0, Static193.anIntArray476[local14]);
				if (Static98.aByteArrayArray24[local14] == null) {
					Static182.anInt4064++;
					local12 = false;
				}
			}
			if (Static87.anIntArray241[local14] != -1 && Static148.aByteArrayArray32[local14] == null) {
				Static148.aByteArrayArray32[local14] = Static121.aClass60_Sub1_115.method2345(Static87.anIntArray241[local14], Static160.anIntArrayArray22[local14], 0);
				if (Static148.aByteArrayArray32[local14] == null) {
					Static182.anInt4064++;
					local12 = false;
				}
			}
		}
		if (!local12) {
			Static80.anInt1965 = 1;
			return;
		}
		local12 = true;
		Static79.anInt1933 = 0;
		@Pc(132) int local132;
		@Pc(122) int local122;
		for (@Pc(103) int local103 = 0; local103 < Static98.aByteArrayArray24.length; local103++) {
			@Pc(109) byte[] local109 = Static148.aByteArrayArray32[local103];
			if (local109 != null) {
				local122 = (Static93.anIntArray266[local103] & 0xFF) * 64 - Static58.anInt1543;
				local132 = (Static93.anIntArray266[local103] >> 8) * 64 - Static205.anInt4337;
				if (Static138.aBoolean137) {
					local132 = 10;
					local122 = 10;
				}
				local12 &= Static40.method694(local109, local132, local122);
			}
		}
		if (!local12) {
			Static80.anInt1965 = 2;
			return;
		}
		if (Static80.anInt1965 != 0) {
			Static168.method2339(Static109.method2004(new Class65[] { Static166.aClass65_2238, Static210.aClass65_2609 }), true);
		}
		Static16.method298();
		Static58.method1050();
		Static16.method298();
		Static197.method3215();
		Static16.method298();
		System.gc();
		for (@Pc(185) int local185 = 0; local185 < 4; local185++) {
			Static83.aClass57Array1[local185].method2262();
		}
		@Pc(206) int local206;
		for (local132 = 0; local132 < 4; local132++) {
			for (local122 = 0; local122 < 104; local122++) {
				for (local206 = 0; local206 < 104; local206++) {
					Static106.aByteArrayArrayArray67[local132][local122][local206] = 0;
				}
			}
		}
		Static16.method298();
		Static178.method3021();
		local122 = Static98.aByteArrayArray24.length;
		Static87.method1469();
		Static111.method2032(true);
		@Pc(267) int local267;
		@Pc(278) int local278;
		@Pc(382) int local382;
		@Pc(328) int local328;
		@Pc(372) int local372;
		if (!Static138.aBoolean137) {
			@Pc(256) byte[] local256;
			for (local206 = 0; local206 < local122; local206++) {
				local256 = Static98.aByteArrayArray24[local206];
				local267 = (Static93.anIntArray266[local206] >> 8) * 64 - Static205.anInt4337;
				local278 = (Static93.anIntArray266[local206] & 0xFF) * 64 - Static58.anInt1543;
				if (local256 != null) {
					Static16.method298();
					Static121.method2278(local278, local267, Static83.aClass57Array1, (Static148.anInt3494 - 6) * 8, (Static206.anInt4395 - 6) * 8, local256);
				}
			}
			for (local267 = 0; local267 < local122; local267++) {
				local278 = (Static93.anIntArray266[local267] >> 8) * 64 - Static205.anInt4337;
				local328 = (Static93.anIntArray266[local267] & 0xFF) * 64 - Static58.anInt1543;
				@Pc(332) byte[] local332 = Static98.aByteArrayArray24[local267];
				if (local332 == null && Static206.anInt4395 < 800) {
					Static16.method298();
					Static112.method2066(64, local278, 64, local328);
				}
			}
			Static111.method2032(true);
			for (local278 = 0; local278 < local122; local278++) {
				local256 = Static148.aByteArrayArray32[local278];
				if (local256 != null) {
					local372 = (Static93.anIntArray266[local278] >> 8) * 64 - Static205.anInt4337;
					local382 = (Static93.anIntArray266[local278] & 0xFF) * 64 - Static58.anInt1543;
					Static16.method298();
					Static149.method2658(local382, Static83.aClass57Array1, local372, local256);
				}
			}
		}
		@Pc(436) int local436;
		@Pc(448) int local448;
		if (Static138.aBoolean137) {
			@Pc(442) int local442;
			@Pc(458) int local458;
			@Pc(460) int local460;
			for (local206 = 0; local206 < 4; local206++) {
				Static16.method298();
				for (local267 = 0; local267 < 13; local267++) {
					for (local278 = 0; local278 < 13; local278++) {
						local372 = Static184.anIntArrayArrayArray7[local206][local267][local278];
						@Pc(420) boolean local420 = false;
						if (local372 != -1) {
							local382 = local372 >> 24 & 0x3;
							local436 = local372 >> 1 & 0x3;
							local442 = local372 >> 3 & 0x7FF;
							local448 = local372 >> 14 & 0x3FF;
							local458 = local442 / 8 + (local448 / 8 << 8);
							for (local460 = 0; local460 < Static93.anIntArray266.length; local460++) {
								if (Static93.anIntArray266[local460] == local458 && Static98.aByteArrayArray24[local460] != null) {
									Static144.method2771(local278 * 8, Static83.aClass57Array1, (local448 & 0x7) * 8, Static98.aByteArrayArray24[local460], (local442 & 0x7) * 8, local206, local382, local436, local267 * 8);
									local420 = true;
									break;
								}
							}
						}
						if (!local420) {
							Static137.method2585(local206, local278 * 8, local267 * 8);
						}
					}
				}
			}
			for (local267 = 0; local267 < 13; local267++) {
				for (local278 = 0; local278 < 13; local278++) {
					local328 = Static184.anIntArrayArrayArray7[0][local267][local278];
					if (local328 == -1) {
						Static112.method2066(8, local267 * 8, 8, local278 * 8);
					}
				}
			}
			Static111.method2032(true);
			for (local278 = 0; local278 < 4; local278++) {
				Static16.method298();
				for (local328 = 0; local328 < 13; local328++) {
					for (local372 = 0; local372 < 13; local372++) {
						local382 = Static184.anIntArrayArrayArray7[local278][local328][local372];
						if (local382 != -1) {
							local436 = local382 >> 24 & 0x3;
							local448 = local382 >> 1 & 0x3;
							local458 = local382 >> 3 & 0x7FF;
							local442 = local382 >> 14 & 0x3FF;
							local460 = local458 / 8 + (local442 / 8 << 8);
							for (@Pc(642) int local642 = 0; local642 < Static93.anIntArray266.length; local642++) {
								if (local460 == Static93.anIntArray266[local642] && Static148.aByteArrayArray32[local642] != null) {
									Static113.method2100(Static148.aByteArrayArray32[local642], local436, (local442 & 0x7) * 8, (local458 & 0x7) * 8, local278, local328 * 8, local372 * 8, Static83.aClass57Array1, local448);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static111.method2032(true);
		Static58.method1050();
		Static16.method298();
		Static7.method128(Static83.aClass57Array1);
		Static111.method2032(true);
		local206 = Static49.anInt1297;
		if (local206 > Static207.anInt4425) {
			local206 = Static207.anInt4425;
		}
		if (Static207.anInt4425 - 1 > local206) {
		}
		if (Static13.aBoolean36) {
			method760(Static49.anInt1297);
		} else {
			method760(0);
		}
		for (local267 = 0; local267 < 104; local267++) {
			for (local278 = 0; local278 < 104; local278++) {
				Static146.method2644(local267, local278);
			}
		}
		Static16.method298();
		Static82.method1438();
		Static58.method1050();
		if (Static165.aFrame1 != null) {
			aClass1_Sub14_Sub1_8.method1761(9);
			aClass1_Sub14_Sub1_8.method1724(1057001181);
		}
		if (!Static138.aBoolean137) {
			local278 = (Static148.anInt3494 - 6) / 8;
			local328 = (Static148.anInt3494 + 6) / 8;
			local372 = (Static206.anInt4395 - 6) / 8;
			local382 = (Static206.anInt4395 + 6) / 8;
			for (local436 = local278 - 1; local436 <= local328 + 1; local436++) {
				for (local448 = local372 - 1; local448 <= local382 + 1; local448++) {
					if (local278 > local436 || local436 > local328 || local372 > local448 || local382 < local448) {
						Static121.aClass60_Sub1_115.method2326(Static109.method2004(new Class65[] { Static59.aClass65_956, Static118.method2250(local436), Static137.aClass65_1885, Static118.method2250(local448) }));
						Static121.aClass60_Sub1_115.method2326(Static109.method2004(new Class65[] { Static60.aClass65_960, Static118.method2250(local436), Static137.aClass65_1885, Static118.method2250(local448) }));
					}
				}
			}
		}
		Static118.method2247(30);
		Static16.method298();
		Static200.method3239();
		aClass1_Sub14_Sub1_8.method1761(235);
		Static5.method67();
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
	private static void method760(@OriginalArg(0) int arg0) {
		Static185.anInt4103 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static201.anInt3978; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static198.anInt4264; local6++) {
				if (Static83.aClass1_Sub7ArrayArrayArray1[arg0][local3][local6] == null) {
					Static83.aClass1_Sub7ArrayArrayArray1[arg0][local3][local6] = new Class1_Sub7(arg0, local3, local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)Z")
	public static boolean method761(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
