import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!i", name = "y", descriptor = "Lclient!rc;")
	public static final Class205 aClass205_63 = new Class205(96, 4);

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILclient!dc;)Z")
	public static boolean method2644(@OriginalArg(1) Interface2 arg0) {
		@Pc(15) Class172 local15 = Static221.aClass118_6.method2858(arg0.method5651());
		if (local15.anInt4116 == -1) {
			return true;
		} else {
			@Pc(27) Class199 local27 = Static304.aClass206_122.method4414(local15.anInt4116);
			return local27.anInt4767 == -1 ? true : local27.method4211();
		}
	}

	@OriginalMember(owner = "client!i", name = "d", descriptor = "(I)Ljava/lang/String;")
	public static String method2645() {
		@Pc(7) String local7 = "www";
		if (Static258.aClass117_10 == Static141.aClass117_7) {
			local7 = "www-wtrc";
		} else if (Static47.aClass117_2 == Static141.aClass117_7) {
			local7 = "www-wtqa";
		} else if (Static141.aClass117_7 == Static392.aClass117_15) {
			local7 = "www-wtwip";
		}
		@Pc(33) String local33 = "";
		if (Static9.aString6 != null) {
			local33 = "/p=" + Static9.aString6;
		}
		return "http://" + local7 + "." + Static275.aClass150_3.aString43 + ".com/l=" + Static107.anInt2498 + "/a=" + Static16.anInt383 + local33 + "/";
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method2646(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(16) int local16 = 0;
		@Pc(19) int local19 = arg0.length();
		while (local16 < local19 && Static228.method3716(arg0.charAt(local16))) {
			local16++;
		}
		while (local19 > local16 && Static228.method3716(arg0.charAt(local19 - 1))) {
			local19--;
		}
		@Pc(50) int local50 = local19 - local16;
		if (local50 < 1 || local50 > 12) {
			return null;
		}
		@Pc(67) StringBuffer local67 = new StringBuffer(local50);
		for (@Pc(69) int local69 = local16; local69 < local19; local69++) {
			@Pc(75) char local75 = arg0.charAt(local69);
			if (Static21.method351(local75)) {
				@Pc(83) char local83 = Static9.method193(local75);
				if (local83 != '\u0000') {
					local67.append(local83);
				}
			}
		}
		if (local67.length() == 0) {
			return null;
		} else {
			return local67.toString();
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public static void method2647() {
		Static181.method5370(false);
		Static339.anInt5782 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static243.aByteArrayArray13.length; local14++) {
			if (Static50.anIntArray212[local14] != -1 && Static243.aByteArrayArray13[local14] == null) {
				Static243.aByteArrayArray13[local14] = Static200.aClass171_51.method3745(Static50.anIntArray212[local14], 0);
				if (Static243.aByteArrayArray13[local14] == null) {
					local12 = false;
					Static339.anInt5782++;
				}
			}
			if (Static249.anIntArray1342[local14] != -1 && Static59.aByteArrayArray2[local14] == null) {
				Static59.aByteArrayArray2[local14] = Static200.aClass171_51.method3764(Static265.anIntArrayArray35[local14], 0, Static249.anIntArray1342[local14]);
				if (Static59.aByteArrayArray2[local14] == null) {
					local12 = false;
					Static339.anInt5782++;
				}
			}
			if (Static3.anIntArray44[local14] != -1 && Static371.aByteArrayArray20[local14] == null) {
				Static371.aByteArrayArray20[local14] = Static200.aClass171_51.method3745(Static3.anIntArray44[local14], 0);
				if (Static371.aByteArrayArray20[local14] == null) {
					Static339.anInt5782++;
					local12 = false;
				}
			}
			if (Static200.anIntArray733[local14] != -1 && Static45.aByteArrayArray1[local14] == null) {
				Static45.aByteArrayArray1[local14] = Static200.aClass171_51.method3745(Static200.anIntArray733[local14], 0);
				if (Static45.aByteArrayArray1[local14] == null) {
					Static339.anInt5782++;
					local12 = false;
				}
			}
			if (Static267.anIntArray894 != null && Static389.aByteArrayArray22[local14] == null && Static267.anIntArray894[local14] != -1) {
				Static389.aByteArrayArray22[local14] = Static200.aClass171_51.method3764(Static265.anIntArrayArray35[local14], 0, Static267.anIntArray894[local14]);
				if (Static389.aByteArrayArray22[local14] == null) {
					Static339.anInt5782++;
					local12 = false;
				}
			}
		}
		if (Static47.aClass209_1 == null) {
			if (Static48.aClass2_Sub10_Sub8_1 == null || !Static67.aClass171_25.method3751(Static48.aClass2_Sub10_Sub8_1.aString19 + "_staticelements")) {
				Static47.aClass209_1 = new Class209(0);
			} else if (Static67.aClass171_25.method3752(Static48.aClass2_Sub10_Sub8_1.aString19 + "_staticelements")) {
				Static47.aClass209_1 = Static1.method5647(Static48.aClass2_Sub10_Sub8_1.aString19 + "_staticelements", Static67.aClass171_25, Static269.aBoolean348);
			} else {
				local12 = false;
				Static339.anInt5782++;
			}
		}
		if (!local12) {
			Static20.anInt5422 = 1;
			return;
		}
		local12 = true;
		Static162.anInt3139 = 0;
		@Pc(271) int local271;
		@Pc(282) int local282;
		for (@Pc(253) int local253 = 0; local253 < Static243.aByteArrayArray13.length; local253++) {
			@Pc(259) byte[] local259 = Static59.aByteArrayArray2[local253];
			if (local259 != null) {
				local271 = (Static68.anIntArray284[local253] >> 8) * 64 - Static28.anInt606;
				local282 = (Static68.anIntArray284[local253] & 0xFF) * 64 - Static319.anInt5425;
				if (Static385.aBoolean468) {
					local271 = 10;
					local282 = 10;
				}
				local12 &= Static6.method151(local259, Static246.anInt4374, local282, local271, Static185.anInt3485);
			}
			local259 = Static45.aByteArrayArray1[local253];
			if (local259 != null) {
				local271 = (Static68.anIntArray284[local253] >> 8) * 64 - Static28.anInt606;
				local282 = (Static68.anIntArray284[local253] & 0xFF) * 64 - Static319.anInt5425;
				if (Static385.aBoolean468) {
					local271 = 10;
					local282 = 10;
				}
				local12 &= Static6.method151(local259, Static246.anInt4374, local282, local271, Static185.anInt3485);
			}
		}
		if (!local12) {
			Static20.anInt5422 = 2;
			return;
		}
		if (Static20.anInt5422 != 0) {
			Static108.method4606(Static319.aClass9_3, true, Static55.aClass32_21.method701(Static107.anInt2498) + "<br>(100%)");
		}
		Static271.method4164();
		Static206.method3485();
		@Pc(380) boolean local380 = false;
		if (Static111.aClass63_3.method2012() && Static385.aBoolean467) {
			for (local271 = 0; local271 < Static243.aByteArrayArray13.length; local271++) {
				if (Static45.aByteArrayArray1[local271] != null || Static371.aByteArrayArray20[local271] != null) {
					local380 = true;
					break;
				}
			}
		}
		if (Static58.aBoolean89) {
			local271 = Static27.anIntArray122[Static389.anInt6614];
		} else {
			local271 = Static76.anIntArray336[Static389.anInt6614];
		}
		if (Static111.aClass63_3.method1979()) {
			local271++;
		}
		Static360.method5258(Static246.anInt4374, Static185.anInt3485, local271, local380, Static111.aClass63_3.method1990() > 0);
		for (local282 = 0; local282 < 4; local282++) {
			Static58.aClass188Array1[local282].method4043();
		}
		Static72.method4068();
		Static176.method3100(false);
		Static295.method4430();
		Static271.method4164();
		System.gc();
		Static181.method5370(true);
		Static74.method1196();
		Static92.aBoolean130 = Static253.anInt4468 >= 96;
		Static196.aBoolean308 = Static212.aBoolean293;
		Static267.aBoolean347 = !Static187.aBoolean270;
		Static174.anInt3334 = Static202.anInt3721;
		Static380.aBoolean463 = Static385.aBoolean467;
		Static41.anInt832 = Static231.method3740() ? -1 : Static130.anInt2658;
		Static92.aBoolean131 = Static62.anInt1261 == 1 || Static358.aBoolean142;
		Static372.aClass56_Sub1_2 = new Class56_Sub1(4, Static246.anInt4374, Static185.anInt3485, false);
		if (!Static385.aBoolean468) {
			Static307.method4500(Static372.aClass56_Sub1_2, Static243.aByteArrayArray13);
		}
		if (Static385.aBoolean468) {
			Static294.method4425(Static372.aClass56_Sub1_2, Static243.aByteArrayArray13);
		}
		Static181.method5352(Static246.anInt4374 >> 4, Static185.anInt3485 >> 4);
		Static359.method5248();
		if (local380) {
			Static184.method3175(true);
			Static253.aClass56_Sub1_1 = new Class56_Sub1(1, Static246.anInt4374, Static185.anInt3485, true);
			if (!Static385.aBoolean468) {
				Static307.method4500(Static253.aClass56_Sub1_1, Static371.aByteArrayArray20);
				Static181.method5370(true);
			}
			if (Static385.aBoolean468) {
				Static294.method4425(Static253.aClass56_Sub1_1, Static371.aByteArrayArray20);
				Static181.method5370(true);
			}
			Static253.aClass56_Sub1_1.method4058(Static372.aClass56_Sub1_2.anIntArrayArrayArray12[0]);
			Static253.aClass56_Sub1_1.method4071(null, Static111.aClass63_3, null);
			Static184.method3175(false);
		}
		Static372.aClass56_Sub1_2.method4071(Static58.aClass188Array1, Static111.aClass63_3, local380 ? Static253.aClass56_Sub1_1.anIntArrayArrayArray12 : null);
		if (!Static385.aBoolean468) {
			Static181.method5370(true);
			Static357.method4126(Static59.aByteArrayArray2, Static372.aClass56_Sub1_2);
			if (Static389.aByteArrayArray22 != null) {
				Static88.method1656();
			}
		}
		if (Static385.aBoolean468) {
			Static181.method5370(true);
			Static201.method3375(Static59.aByteArrayArray2, Static372.aClass56_Sub1_2);
		}
		Static206.method3485();
		Static181.method5370(true);
		Static372.aClass56_Sub1_2.method4072(null, local380 ? Static94.aClass107Array2[0] : null, Static111.aClass63_3);
		Static372.aClass56_Sub1_2.method4078(Static111.aClass63_3);
		Static181.method5370(true);
		if (local380) {
			Static184.method3175(true);
			Static181.method5370(true);
			if (!Static385.aBoolean468) {
				Static357.method4126(Static45.aByteArrayArray1, Static253.aClass56_Sub1_1);
			}
			if (Static385.aBoolean468) {
				Static201.method3375(Static45.aByteArrayArray1, Static253.aClass56_Sub1_1);
			}
			Static206.method3485();
			Static181.method5370(true);
			Static253.aClass56_Sub1_1.method4072(Static90.aClass107Array1[0], null, Static111.aClass63_3);
			Static253.aClass56_Sub1_1.method4078(Static111.aClass63_3);
			Static181.method5370(true);
			Static184.method3175(false);
		}
		Static318.method4774();
		@Pc(687) int local687 = Static372.aClass56_Sub1_2.anInt4603;
		if (Static382.anInt6523 < local687) {
			local687 = Static382.anInt6523;
		}
		if (local687 < Static382.anInt6523 - 1) {
			local687 = Static382.anInt6523 - 1;
		}
		if (Static231.method3740()) {
			Static264.method4083(0);
		} else {
			Static264.method4083(local687);
		}
		@Pc(716) int local716;
		@Pc(720) int local720;
		for (@Pc(712) int local712 = 0; local712 < 4; local712++) {
			for (local716 = 0; local716 < Static246.anInt4374; local716++) {
				for (local720 = 0; local720 < Static185.anInt3485; local720++) {
					Static76.method1207(local716, local712, local720);
				}
			}
		}
		Static392.method5539();
		Static271.method4164();
		Static367.method5425();
		Static206.method3485();
		Static155.aBoolean228 = false;
		Static62.method1040();
		if (Static8.aFrame1 != null && Static88.aClass221_1 != null && Static391.anInt6627 == 25) {
			Static216.method3597(Static162.aClass11_53);
			Static372.aClass2_Sub16_Sub2_4.method5355(1057001181);
		}
		if (!Static385.aBoolean468) {
			local716 = (Static94.anInt1924 - (Static246.anInt4374 >> 4)) / 8;
			local720 = ((Static246.anInt4374 >> 4) + Static94.anInt1924) / 8;
			@Pc(804) int local804 = (Static82.anInt1485 - (Static185.anInt3485 >> 4)) / 8;
			@Pc(812) int local812 = (Static82.anInt1485 + (Static185.anInt3485 >> 4)) / 8;
			for (@Pc(816) int local816 = local716 - 1; local816 <= local720 + 1; local816++) {
				for (@Pc(822) int local822 = local804 - 1; local822 <= local812 + 1; local822++) {
					if (local816 < local716 || local720 < local816 || local804 > local822 || local812 < local822) {
						Static200.aClass171_51.method3758("m" + local816 + "_" + local822);
						Static200.aClass171_51.method3758("l" + local816 + "_" + local822);
					}
				}
			}
		}
		if (Static391.anInt6627 == 28) {
			Static104.method2180(10);
		} else {
			Static104.method2180(30);
			if (Static88.aClass221_1 != null) {
				Static216.method3597(Static311.aClass11_80);
			}
		}
		Static310.method4551();
		Static271.method4164();
		Static41.method708();
	}
}
