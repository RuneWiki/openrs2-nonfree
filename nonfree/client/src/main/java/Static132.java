import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static132 {

	@OriginalMember(owner = "client!jl", name = "m", descriptor = "Lclient!nm;")
	public static Class119 aClass119_51;

	@OriginalMember(owner = "client!jl", name = "r", descriptor = "I")
	public static int anInt2607;

	@OriginalMember(owner = "client!jl", name = "s", descriptor = "[Lclient!fo;")
	public static Class57_Sub1[] aClass57_Sub1Array2;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "I")
	public static int anInt2608;

	@OriginalMember(owner = "client!jl", name = "F", descriptor = "Lclient!qe;")
	public static Class141 aClass141_1;

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "[I")
	public static int[] anIntArray202;

	@OriginalMember(owner = "client!jl", name = "l", descriptor = "I")
	public static int anInt2603 = 0;

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString88 = null;

	@OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
	public static int anInt2613 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public static void method2305() {
		for (@Pc(3) int local3 = 0; local3 < Static173.anInt3382; local3++) {
			@Pc(10) int local10 = Static167.anIntArray68[local3]--;
			if (Static167.anIntArray68[local3] >= -10) {
				@Pc(92) Class101 local92 = Static21.aClass101Array1[local3];
				if (local92 == null) {
					local92 = Static321.method2528(Static125.aClass119_46, Static274.anIntArray560[local3], 0);
					if (local92 == null) {
						continue;
					}
					Static167.anIntArray68[local3] += local92.method2526();
					Static21.aClass101Array1[local3] = local92;
				}
				if (Static167.anIntArray68[local3] < 0) {
					@Pc(232) int local232;
					if (Static306.anIntArray603[local3] == 0) {
						local232 = Static253.anInt4650 * Static184.anIntArray378[local3] >> 8;
					} else {
						@Pc(138) int local138 = (Static306.anIntArray603[local3] & 0xFF) * 128;
						@Pc(146) int local146 = Static306.anIntArray603[local3] >> 16 & 0xFF;
						@Pc(155) int local155 = local146 * 128 + 64 - Static138.aClass11_Sub4_Sub1_3.anInt3865;
						if (local155 < 0) {
							local155 = -local155;
						}
						@Pc(172) int local172 = Static306.anIntArray603[local3] >> 8 & 0xFF;
						@Pc(182) int local182 = local172 * 128 + 64 - Static138.aClass11_Sub4_Sub1_3.anInt3856;
						if (local182 < 0) {
							local182 = -local182;
						}
						@Pc(197) int local197 = local182 + local155 - 128;
						if (local197 > local138) {
							Static167.anIntArray68[local3] = -100;
							continue;
						}
						if (local197 < 0) {
							local197 = 0;
						}
						local232 = (local138 - local197) * Static167.anInt638 * Static184.anIntArray378[local3] / local138 >> 8;
					}
					if (local232 > 0) {
						@Pc(251) Class1_Sub23_Sub1 local251 = local92.method2529().method3466(Static250.aClass55_1);
						@Pc(256) Class1_Sub7_Sub1 local256 = Static316.method817(local251, local232);
						local256.method825(Static231.anIntArray486[local3] - 1);
						Static173.aClass1_Sub7_Sub3_1.method3615(local256);
					}
					Static167.anIntArray68[local3] = -100;
				}
			} else {
				Static173.anInt3382--;
				for (@Pc(27) int local27 = local3; local27 < Static173.anInt3382; local27++) {
					Static274.anIntArray560[local27] = Static274.anIntArray560[local27 + 1];
					Static21.aClass101Array1[local27] = Static21.aClass101Array1[local27 + 1];
					Static231.anIntArray486[local27] = Static231.anIntArray486[local27 + 1];
					Static167.anIntArray68[local27] = Static167.anIntArray68[local27 + 1];
					Static306.anIntArray603[local27] = Static306.anIntArray603[local27 + 1];
					Static184.anIntArray378[local27] = Static184.anIntArray378[local27 + 1];
				}
				local3--;
			}
		}
		if (Static197.aBoolean347 && !Static105.method1993()) {
			if (Static172.anInt3363 != 0 && Static226.anInt4236 != -1) {
				Static130.method2283(Static197.aClass119_68, Static172.anInt3363, Static226.anInt4236);
			}
			Static197.aBoolean347 = false;
		} else if (Static172.anInt3363 != 0 && Static226.anInt4236 != -1 && !Static105.method1993()) {
			Static116.aClass1_Sub13_Sub1_48.method1887(55);
			Static116.aClass1_Sub13_Sub1_48.method1851(Static226.anInt4236);
			Static226.anInt4236 = -1;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!nm;)V")
	public static void method2306(@OriginalArg(1) Class119 arg0) {
		Static116.aClass1_Sub5_Sub6Array2 = Static182.method3107(arg0, Static141.anInt2764);
		Static25.aClass1_Sub5_Sub6Array12 = Static182.method3107(arg0, Static44.anInt1028);
		Static203.aClass1_Sub5_Sub6Array9 = Static182.method3107(arg0, Static129.anInt2557);
		Static154.aClass1_Sub5_Sub6Array7 = Static182.method3107(arg0, Static143.anInt2792);
		Static288.aClass1_Sub5_Sub6Array14 = Static182.method3107(arg0, Static158.anInt3616);
		Static189.aClass1_Sub5_Sub6Array11 = Static182.method3107(arg0, Static164.anInt3279);
		Static153.aClass1_Sub5_Sub6_3 = Static104.method1983(arg0, Static125.anInt2514);
		Static273.aClass1_Sub5_Sub6Array13 = Static238.method3353(Static267.anInt4947, arg0);
		Static128.aClass1_Sub5_Sub6Array3 = Static238.method3353(Static194.anInt3875, arg0);
		Static252.aClass57Array4 = Static108.method2022(Static47.anInt1068, arg0);
		Static277.aClass57Array5 = Static108.method2022(Static241.anInt4476, arg0);
		Static170.aClass1_Sub5_Sub9_4.method2863(Static277.aClass57Array5, null);
		Static238.aClass1_Sub5_Sub9_5.method2863(Static277.aClass57Array5, null);
		Static19.aClass1_Sub5_Sub9_1.method2863(Static277.aClass57Array5, null);
		if (Static71.aBoolean165) {
			Static15.aClass57_Sub1Array1 = Static294.method948(Static148.anInt3025, arg0);
			for (@Pc(102) int local102 = 0; local102 < Static15.aClass57_Sub1Array1.length; local102++) {
				Static15.aClass57_Sub1Array1[local102].method1662();
			}
		}
		@Pc(123) Class1_Sub5_Sub6_Sub1 local123 = Static240.method3828(0, Static310.anInt5538, arg0);
		local123.method1272();
		if (Static71.aBoolean165) {
			Static302.aClass1_Sub5_Sub6_11 = new Class1_Sub5_Sub6_Sub2(local123);
		} else {
			Static302.aClass1_Sub5_Sub6_11 = local123;
		}
		@Pc(142) Class1_Sub5_Sub6_Sub1[] local142 = Static307.method4581(arg0, Static16.anInt334);
		@Pc(144) int local144;
		for (local144 = 0; local144 < local142.length; local144++) {
			local142[local144].method1272();
		}
		if (Static71.aBoolean165) {
			Static304.aClass1_Sub5_Sub6Array15 = new Class1_Sub5_Sub6[local142.length];
			for (local144 = 0; local144 < local142.length; local144++) {
				Static304.aClass1_Sub5_Sub6Array15[local144] = new Class1_Sub5_Sub6_Sub2(local142[local144]);
			}
		} else {
			Static304.aClass1_Sub5_Sub6Array15 = local142;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method2308(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static69.method1333(Static282.method4276(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLjava/lang/String;)[B")
	public static byte[] method2309(@OriginalArg(1) String arg0) {
		@Pc(14) int local14 = arg0.length();
		@Pc(17) byte[] local17 = new byte[local14];
		for (@Pc(19) int local19 = 0; local19 < local14; local19++) {
			@Pc(26) char local26 = arg0.charAt(local19);
			if (local26 > '\u0000' && local26 < '\u0080' || !(local26 < ' ' || local26 > 'ÿ')) {
				local17[local19] = (byte) local26;
			} else if (local26 == '€') {
				local17[local19] = -128;
			} else if (local26 == '‚') {
				local17[local19] = -126;
			} else if (local26 == 'ƒ') {
				local17[local19] = -125;
			} else if (local26 == '„') {
				local17[local19] = -124;
			} else if (local26 == '…') {
				local17[local19] = -123;
			} else if (local26 == '†') {
				local17[local19] = -122;
			} else if (local26 == '‡') {
				local17[local19] = -121;
			} else if (local26 == 'ˆ') {
				local17[local19] = -120;
			} else if (local26 == '‰') {
				local17[local19] = -119;
			} else if (local26 == 'Š') {
				local17[local19] = -118;
			} else if (local26 == '‹') {
				local17[local19] = -117;
			} else if (local26 == 'Œ') {
				local17[local19] = -116;
			} else if (local26 == 'Ž') {
				local17[local19] = -114;
			} else if (local26 == '‘') {
				local17[local19] = -111;
			} else if (local26 == '’') {
				local17[local19] = -110;
			} else if (local26 == '“') {
				local17[local19] = -109;
			} else if (local26 == '”') {
				local17[local19] = -108;
			} else if (local26 == '•') {
				local17[local19] = -107;
			} else if (local26 == '–') {
				local17[local19] = -106;
			} else if (local26 == '—') {
				local17[local19] = -105;
			} else if (local26 == '˜') {
				local17[local19] = -104;
			} else if (local26 == '™') {
				local17[local19] = -103;
			} else if (local26 == 'š') {
				local17[local19] = -102;
			} else if (local26 == '›') {
				local17[local19] = -101;
			} else if (local26 == 'œ') {
				local17[local19] = -100;
			} else if (local26 == 'ž') {
				local17[local19] = -98;
			} else if (local26 == 'Ÿ') {
				local17[local19] = -97;
			} else {
				local17[local19] = 63;
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Lclient!bm;")
	public static Class17 method2310(@OriginalArg(1) int arg0) {
		@Pc(10) Class17 local10 = (Class17) Static34.aClass175_7.method4295((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static22.aClass119_7.method3235(arg0, 3);
		local10 = new Class17();
		if (local20 != null) {
			local10.method517(new Class1_Sub13(local20));
		}
		Static34.aClass175_7.method4285(local10, (long) arg0);
		return local10;
	}
}
