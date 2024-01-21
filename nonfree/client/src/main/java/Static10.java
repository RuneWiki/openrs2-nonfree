import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ai", name = "U", descriptor = "Lclient!tg;")
	private static Class81 aClass81_103 = Static120.method2057("Loading config )2 ");

	@OriginalMember(owner = "client!ai", name = "N", descriptor = "Lclient!tg;")
	public static Class81 aClass81_102 = aClass81_103;

	@OriginalMember(owner = "client!ai", name = "Q", descriptor = "Lclient!nd;")
	public static Class59 aClass59_1 = new Class59(128);

	@OriginalMember(owner = "client!ai", name = "T", descriptor = "I")
	public static int anInt229 = 0;

	@OriginalMember(owner = "client!ai", name = "Y", descriptor = "I")
	public static int anInt233 = 0;

	@OriginalMember(owner = "client!ai", name = "ab", descriptor = "Lclient!tg;")
	public static Class81 aClass81_104 = Static120.method2057("hint_mapedge");

	@OriginalMember(owner = "client!ai", name = "bb", descriptor = "Z")
	public static boolean aBoolean7 = false;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(B)V")
	public static void method179() {
		Static173.method3041(false);
		@Pc(6) boolean local6 = true;
		Static104.anInt2270 = 0;
		for (@Pc(10) int local10 = 0; local10 < Static57.aByteArrayArray3.length; local10++) {
			if (Static62.anIntArray127[local10] != -1 && Static57.aByteArrayArray3[local10] == null) {
				Static57.aByteArrayArray3[local10] = Static17.aClass82_Sub1_6.method2942(0, Static62.anIntArray127[local10]);
				if (Static57.aByteArrayArray3[local10] == null) {
					Static104.anInt2270++;
					local6 = false;
				}
			}
			if (Static102.anIntArray243[local10] != -1 && Static36.aByteArrayArray1[local10] == null) {
				Static36.aByteArrayArray1[local10] = Static17.aClass82_Sub1_6.method2946(Static174.anIntArrayArray39[local10], 0, Static102.anIntArray243[local10]);
				if (Static36.aByteArrayArray1[local10] == null) {
					Static104.anInt2270++;
					local6 = false;
				}
			}
		}
		if (!local6) {
			Static172.anInt3995 = 1;
			return;
		}
		Static108.anInt2415 = 0;
		local6 = true;
		@Pc(116) int local116;
		@Pc(127) int local127;
		for (@Pc(97) int local97 = 0; local97 < Static57.aByteArrayArray3.length; local97++) {
			@Pc(103) byte[] local103 = Static36.aByteArrayArray1[local97];
			if (local103 != null) {
				local116 = (Static92.anIntArray232[local97] >> 8) * 64 - Static51.anInt1219;
				local127 = (Static92.anIntArray232[local97] & 0xFF) * 64 - Static114.anInt2140;
				if (Static37.aBoolean32) {
					local127 = 10;
					local116 = 10;
				}
				local6 &= Static67.method1203(local127, local103, local116);
			}
		}
		if (!local6) {
			Static172.anInt3995 = 2;
			return;
		}
		if (Static172.anInt3995 != 0) {
			Static63.method1116(true, Static127.method2169(new Class81[] { Static71.aClass81_597, Static12.aClass81_1446 }));
		}
		Static81.method1360();
		Static11.method564();
		Static81.method1360();
		Static163.method2852();
		Static81.method1360();
		System.gc();
		for (@Pc(186) int local186 = 0; local186 < 4; local186++) {
			Static141.aClass28Array2[local186].method1044();
		}
		@Pc(209) int local209;
		for (local116 = 0; local116 < 4; local116++) {
			for (local127 = 0; local127 < 104; local127++) {
				for (local209 = 0; local209 < 104; local209++) {
					Static43.aByteArrayArrayArray2[local116][local127][local209] = 0;
				}
			}
		}
		Static81.method1360();
		Static115.method2022();
		local127 = Static57.aByteArrayArray3.length;
		Static3.method73();
		Static173.method3041(true);
		@Pc(265) int local265;
		@Pc(276) int local276;
		@Pc(386) int local386;
		@Pc(330) int local330;
		@Pc(375) int local375;
		if (!Static37.aBoolean32) {
			@Pc(280) byte[] local280;
			for (local209 = 0; local209 < local127; local209++) {
				local265 = (Static92.anIntArray232[local209] >> 8) * 64 - Static51.anInt1219;
				local276 = (Static92.anIntArray232[local209] & 0xFF) * 64 - Static114.anInt2140;
				local280 = Static57.aByteArrayArray3[local209];
				if (local280 != null) {
					Static81.method1360();
					Static127.method2167(Static35.anInt963 * 8 - 48, Static141.aClass28Array2, local280, local265, local276, Static98.anInt2164 * 8 - 48);
				}
			}
			for (local265 = 0; local265 < local127; local265++) {
				local276 = (Static92.anIntArray232[local265] >> 8) * 64 - Static51.anInt1219;
				local330 = (Static92.anIntArray232[local265] & 0xFF) * 64 - Static114.anInt2140;
				@Pc(334) byte[] local334 = Static57.aByteArrayArray3[local265];
				if (local334 == null && Static98.anInt2164 < 800) {
					Static81.method1360();
					Static160.method2791(64, local330, local276, 64);
				}
			}
			Static173.method3041(true);
			for (local276 = 0; local276 < local127; local276++) {
				local280 = Static36.aByteArrayArray1[local276];
				if (local280 != null) {
					local375 = (Static92.anIntArray232[local276] >> 8) * 64 - Static51.anInt1219;
					local386 = (Static92.anIntArray232[local276] & 0xFF) * 64 - Static114.anInt2140;
					Static81.method1360();
					Static50.method894(local375, Static141.aClass28Array2, local280, local386);
				}
			}
		}
		@Pc(441) int local441;
		@Pc(447) int local447;
		if (Static37.aBoolean32) {
			@Pc(453) int local453;
			@Pc(463) int local463;
			@Pc(465) int local465;
			for (local209 = 0; local209 < 4; local209++) {
				Static81.method1360();
				for (local265 = 0; local265 < 13; local265++) {
					for (local276 = 0; local276 < 13; local276++) {
						@Pc(418) boolean local418 = false;
						local375 = Static106.anIntArrayArrayArray3[local209][local265][local276];
						if (local375 != -1) {
							local386 = local375 >> 24 & 0x3;
							local441 = local375 >> 1 & 0x3;
							local447 = local375 >> 14 & 0x3FF;
							local453 = local375 >> 3 & 0x7FF;
							local463 = (local447 / 8 << 8) + local453 / 8;
							for (local465 = 0; local465 < Static92.anIntArray232.length; local465++) {
								if (local463 == Static92.anIntArray232[local465] && Static57.aByteArrayArray3[local465] != null) {
									Static178.method3075((local447 & 0x7) * 8, local276 * 8, local265 * 8, Static57.aByteArrayArray3[local465], Static141.aClass28Array2, local209, local441, local386, (local453 & 0x7) * 8);
									local418 = true;
									break;
								}
							}
						}
						if (!local418) {
							Static121.method2087(local276 * 8, local265 * 8, local209);
						}
					}
				}
			}
			for (local265 = 0; local265 < 13; local265++) {
				for (local276 = 0; local276 < 13; local276++) {
					local330 = Static106.anIntArrayArrayArray3[0][local265][local276];
					if (local330 == -1) {
						Static160.method2791(8, local276 * 8, local265 * 8, 8);
					}
				}
			}
			Static173.method3041(true);
			for (local276 = 0; local276 < 4; local276++) {
				Static81.method1360();
				for (local330 = 0; local330 < 13; local330++) {
					for (local375 = 0; local375 < 13; local375++) {
						local386 = Static106.anIntArrayArrayArray3[local276][local330][local375];
						if (local386 != -1) {
							local447 = local386 >> 1 & 0x3;
							local453 = local386 >> 14 & 0x3FF;
							local441 = local386 >> 24 & 0x3;
							local463 = local386 >> 3 & 0x7FF;
							local465 = (local453 / 8 << 8) + (local463 / 8);
							for (@Pc(656) int local656 = 0; local656 < Static92.anIntArray232.length; local656++) {
								if (local465 == Static92.anIntArray232[local656] && Static36.aByteArrayArray1[local656] != null) {
									Static105.method1728(local441, Static36.aByteArrayArray1[local656], local375 * 8, local447, local330 * 8, (local463 & 0x7) * 8, (local453 & 0x7) * 8, local276, Static141.aClass28Array2);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static173.method3041(true);
		Static11.method564();
		Static81.method1360();
		Static78.method1348(Static141.aClass28Array2);
		Static173.method3041(true);
		local209 = Static54.anInt1304;
		if (Static44.anInt1086 < local209) {
			local209 = Static44.anInt1086;
		}
		if (local209 < Static44.anInt1086 - 1) {
		}
		if (Static50.aBoolean45) {
			Static133.method2260(Static54.anInt1304);
		} else {
			Static133.method2260(0);
		}
		for (local265 = 0; local265 < 104; local265++) {
			for (local276 = 0; local276 < 104; local276++) {
				Static121.method2084(local265, local276);
			}
		}
		Static81.method1360();
		Static178.method3080();
		Static11.method564();
		if (Static40.aFrame1 != null) {
			Static104.aClass1_Sub8_Sub1_2.method366(244);
			Static104.aClass1_Sub8_Sub1_2.method328(1057001181);
		}
		if (!Static37.aBoolean32) {
			local330 = (Static35.anInt963 + 6) / 8;
			local276 = (Static35.anInt963 - 6) / 8;
			local386 = (Static98.anInt2164 + 6) / 8;
			local375 = (Static98.anInt2164 - 6) / 8;
			for (local441 = local276 - 1; local441 <= local330 + 1; local441++) {
				for (local447 = local375 - 1; local447 <= local386 + 1; local447++) {
					if (local276 > local441 || local330 < local441 || local375 > local447 || local447 > local386) {
						Static17.aClass82_Sub1_6.method2948(Static127.method2169(new Class81[] { Static50.aClass81_429, Static149.method2548(local441), Static49.aClass81_418, Static149.method2548(local447) }));
						Static17.aClass82_Sub1_6.method2948(Static127.method2169(new Class81[] { Static93.aClass81_728, Static149.method2548(local441), Static49.aClass81_418, Static149.method2548(local447) }));
					}
				}
			}
		}
		Static142.method2392(30);
		Static81.method1360();
		Static54.method963();
		Static104.aClass1_Sub8_Sub1_2.method366(142);
		Static95.method1593();
	}

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "(III)Z")
	public static boolean method180(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 11) {
			arg1 = 10;
		}
		if (arg1 >= 5 && arg1 <= 8) {
			arg1 = 4;
		}
		@Pc(31) Class1_Sub2_Sub8 local31 = Static14.method220(arg0);
		return local31.method941(arg1);
	}

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)V")
	public static void method182() {
		aClass59_1 = null;
		aClass81_104 = null;
		aClass81_102 = null;
		aClass81_103 = null;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!vb;IB)Lclient!uc;")
	public static Class1_Sub24 method183(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1) {
		@Pc(8) byte[] local8 = arg0.method2952(arg1);
		return local8 == null ? null : new Class1_Sub24(local8);
	}
}
