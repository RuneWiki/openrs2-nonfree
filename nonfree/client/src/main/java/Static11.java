import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ak", name = "B", descriptor = "Ljava/awt/datatransfer/Clipboard;")
	public static Clipboard aClipboard1;

	@OriginalMember(owner = "client!ak", name = "C", descriptor = "[Lclient!wn;")
	public static Class95[] aClass95Array2;

	@OriginalMember(owner = "client!ak", name = "D", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray2;

	@OriginalMember(owner = "client!ak", name = "v", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_9 = new Class85("scroll:", "scrollen:", "déroulement:", "rolagem:");

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_10 = new Class85("white:", "", "", "");

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
	public static int anInt218 = 1;

	@OriginalMember(owner = "client!ak", name = "E", descriptor = "Lclient!ka;")
	public static final Class109 aClass109_4 = new Class109(4);

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)B")
	public static byte method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
	public static void method190() {
		Static274.method4824(false);
		Static237.anInt4724 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static245.aByteArrayArray15.length; local14++) {
			if (Static270.anIntArray508[local14] != -1 && Static245.aByteArrayArray15[local14] == null) {
				Static245.aByteArrayArray15[local14] = Static351.aClass93_134.method2410(0, Static270.anIntArray508[local14]);
				if (Static245.aByteArrayArray15[local14] == null) {
					local12 = false;
					Static237.anInt4724++;
				}
			}
			if (Static209.anIntArray397[local14] != -1 && Static252.aByteArrayArray16[local14] == null) {
				Static252.aByteArrayArray16[local14] = Static351.aClass93_134.method2413(Static209.anIntArray397[local14], Static182.anIntArrayArray67[local14], 0);
				if (Static252.aByteArrayArray16[local14] == null) {
					local12 = false;
					Static237.anInt4724++;
				}
			}
			if (Static315.anIntArray593[local14] != -1 && Static318.aByteArrayArray20[local14] == null) {
				Static318.aByteArrayArray20[local14] = Static351.aClass93_134.method2410(0, Static315.anIntArray593[local14]);
				if (Static318.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static237.anInt4724++;
				}
			}
			if (Static251.anIntArray485[local14] != -1 && Static75.aByteArrayArray6[local14] == null) {
				Static75.aByteArrayArray6[local14] = Static351.aClass93_134.method2410(0, Static251.anIntArray485[local14]);
				if (Static75.aByteArrayArray6[local14] == null) {
					local12 = false;
					Static237.anInt4724++;
				}
			}
			if (Static78.anIntArray121 != null && Static150.aByteArrayArray12[local14] == null && Static78.anIntArray121[local14] != -1) {
				Static150.aByteArrayArray12[local14] = Static351.aClass93_134.method2413(Static78.anIntArray121[local14], Static182.anIntArrayArray67[local14], 0);
				if (Static150.aByteArrayArray12[local14] == null) {
					local12 = false;
					Static237.anInt4724++;
				}
			}
		}
		if (Static353.aClass64_3 == null) {
			if (Static233.aClass5_Sub1_Sub6_3 == null || !Static48.aClass93_15.method2391(Static233.aClass5_Sub1_Sub6_3.aString12 + "_staticelements")) {
				Static353.aClass64_3 = new Class64(0);
			} else if (Static48.aClass93_15.method2405(Static233.aClass5_Sub1_Sub6_3.aString12 + "_staticelements")) {
				Static353.aClass64_3 = Static277.method4846(Static48.aClass93_15, Static233.aClass5_Sub1_Sub6_3.aString12 + "_staticelements", Static331.aBoolean537);
			} else {
				Static237.anInt4724++;
				local12 = false;
			}
		}
		if (!local12) {
			Static267.anInt5275 = 1;
			return;
		}
		local12 = true;
		Static75.anInt1444 = 0;
		@Pc(265) int local265;
		@Pc(275) int local275;
		for (@Pc(246) int local246 = 0; local246 < Static245.aByteArrayArray15.length; local246++) {
			@Pc(252) byte[] local252 = Static252.aByteArrayArray16[local246];
			if (local252 != null) {
				local265 = (Static198.anIntArray387[local246] >> 8) * 64 - Static172.anInt4394;
				local275 = (Static198.anIntArray387[local246] & 0xFF) * 64 - Static12.anInt3797;
				if (Static339.aBoolean571) {
					local265 = 10;
					local275 = 10;
				}
				local12 &= Static78.method1420(local265, local252, local275);
			}
			local252 = Static75.aByteArrayArray6[local246];
			if (local252 != null) {
				local265 = (Static198.anIntArray387[local246] >> 8) * 64 - Static172.anInt4394;
				local275 = (Static198.anIntArray387[local246] & 0xFF) * 64 - Static12.anInt3797;
				if (Static339.aBoolean571) {
					local265 = 10;
					local275 = 10;
				}
				local12 &= Static78.method1420(local265, local252, local275);
			}
		}
		if (!local12) {
			Static267.anInt5275 = 2;
			return;
		}
		if (Static267.anInt5275 != 0) {
			Static86.method1557(true, Static204.aClass18_3, Static321.aClass85_134.method2020(Static41.anInt726) + "<br>(100%)");
		}
		Static315.method5535();
		Static166.method3025();
		@Pc(368) boolean local368 = false;
		if (Static236.aClass55_9.method5190() && Static248.aBoolean414) {
			for (local265 = 0; local265 < Static245.aByteArrayArray15.length; local265++) {
				if (Static75.aByteArrayArray6[local265] != null || Static318.aByteArrayArray20[local265] != null) {
					local368 = true;
					break;
				}
			}
		}
		if (Static34.aBoolean42) {
			local265 = Static151.anIntArray295[Static29.anInt592];
		} else {
			local265 = Static357.anIntArray647[Static29.anInt592];
		}
		if (Static236.aClass55_9.method5187()) {
			local265++;
		}
		Static232.method4188(Static22.anInt481, Static269.anInt5281, local265, local368, Static236.aClass55_9.method5207() > 0);
		for (local275 = 0; local275 < 4; local275++) {
			Static152.aClass24Array3[local275].method494();
		}
		Static52.method835();
		Static8.method168(false);
		Static195.method3462();
		Static315.method5535();
		System.gc();
		Static274.method4824(true);
		Static226.method4087(4, false);
		@Pc(457) int[][] local457 = null;
		if (!Static339.aBoolean571) {
			Static24.method5484(false);
			Static69.method1310(Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0] >> 3, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0] >> 3);
			Static86.method1560();
			method191(4, Static236.aClass55_9, false, null);
			local457 = Static217.anIntArrayArrayArray8[0];
			Static274.method4824(true);
			Static16.method302(false);
			if (Static150.aByteArrayArray12 != null) {
				Static133.method2381();
			}
		}
		if (Static339.aBoolean571) {
			Static72.method1325(false);
			Static69.method1310(Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray523[0] >> 3, Static192.aClass4_Sub5_Sub2_Sub1_2.anIntArray522[0] >> 3);
			Static86.method1560();
			method191(4, Static236.aClass55_9, false, null);
			local457 = Static217.anIntArrayArrayArray8[0];
			Static274.method4824(true);
			Static196.method3477(false);
		}
		Static166.method3025();
		Static274.method4824(true);
		Static203.method4479(4, Static152.aClass24Array3, Static236.aClass55_9, null, false);
		Static197.method3480(4, Static236.aClass55_9);
		Static274.method4824(true);
		@Pc(560) int local560 = Static339.anInt6583;
		if (Static239.anInt4811 < local560) {
			local560 = Static239.anInt4811;
		}
		if (Static239.anInt4811 - 1 > local560) {
			local560 = Static239.anInt4811 - 1;
		}
		if (Static288.method5007()) {
			Static344.method5893(0);
		} else {
			Static344.method5893(local560);
		}
		Static271.method4755();
		if (local368) {
			Static198.method3495(true);
			Static226.method4087(1, true);
			if (!Static339.aBoolean571) {
				Static24.method5484(true);
				method191(1, Static236.aClass55_9, true, local457);
				Static274.method4824(true);
				Static16.method302(true);
				Static197.method3480(1, Static236.aClass55_9);
			}
			if (Static339.aBoolean571) {
				Static72.method1325(true);
				method191(1, Static236.aClass55_9, true, local457);
				Static274.method4824(true);
				Static196.method3477(true);
			}
			Static166.method3025();
			Static274.method4824(true);
			Static203.method4479(1, Static152.aClass24Array3, Static236.aClass55_9, Static56.aClass51Array2[0], true);
			Static197.method3480(1, Static236.aClass55_9);
			Static274.method4824(true);
			Static271.method4755();
			Static198.method3495(false);
		}
		@Pc(670) int local670;
		@Pc(674) int local674;
		for (@Pc(666) int local666 = 0; local666 < 4; local666++) {
			for (local670 = 0; local670 < Static22.anInt481; local670++) {
				for (local674 = 0; local674 < Static269.anInt5281; local674++) {
					Static109.method1938(local674, local666, local670);
				}
			}
		}
		Static344.method5892();
		Static315.method5535();
		Static14.method276();
		Static166.method3025();
		Static27.aBoolean37 = false;
		Static48.method801();
		if (Static60.aFrame3 != null && Static155.aClass41_18 != null && Static278.anInt5495 == 25) {
			Static125.aClass5_Sub12_Sub2_3.method5125(175);
			Static125.aClass5_Sub12_Sub2_3.method5070(1057001181);
		}
		if (!Static339.aBoolean571) {
			local670 = (Static53.anInt990 - (Static22.anInt481 >> 4)) / 8;
			local674 = (Static53.anInt990 + (Static22.anInt481 >> 4)) / 8;
			@Pc(753) int local753 = (Static111.anInt2079 - (Static269.anInt5281 >> 4)) / 8;
			@Pc(761) int local761 = ((Static269.anInt5281 >> 4) + Static111.anInt2079) / 8;
			for (@Pc(765) int local765 = local670 - 1; local765 <= local674 + 1; local765++) {
				for (@Pc(771) int local771 = local753 - 1; local771 <= local761 + 1; local771++) {
					if (local765 < local670 || local674 < local765 || local753 > local771 || local771 > local761) {
						Static351.aClass93_134.method2407("m" + local765 + "_" + local771);
						Static351.aClass93_134.method2407("l" + local765 + "_" + local771);
					}
				}
			}
		}
		if (Static278.anInt5495 == 28) {
			Static50.method822(10);
		} else {
			Static50.method822(30);
			if (Static155.aClass41_18 != null) {
				Static125.aClass5_Sub12_Sub2_3.method5125(29);
			}
		}
		Static121.method2137();
		Static315.method5535();
		Static163.method2870();
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILclient!ea;BZ[[I)V")
	private static void method191(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int[][] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0; local3++) {
			@Pc(15) int[][] local15;
			@Pc(17) int local17;
			@Pc(21) int local21;
			if (arg3 == null) {
				local15 = null;
			} else {
				local15 = new int[Static22.anInt481 + 1][Static269.anInt5281 + 1];
				for (local17 = 0; local17 <= Static269.anInt5281; local17++) {
					for (local21 = 0; local21 <= Static22.anInt481; local21++) {
						local15[local21][local17] = Static217.anIntArrayArrayArray8[local3][local21][local17] - arg3[local21][local17];
					}
				}
			}
			local17 = 0;
			local21 = 0;
			if (!arg2) {
				if (Static280.aBoolean452) {
					local17 = 2;
				}
				if (Static248.aBoolean414) {
					local21 = 8;
				}
				if (Static95.anInt1828 != 0) {
					local17 |= 0x1;
					if (local3 == 0 || Static345.anInt6645 >= 96) {
						local21 |= 0x10;
					}
				}
			}
			if (Static280.aBoolean452) {
				local21 |= 0x7;
			}
			@Pc(111) Class51 local111 = arg1.method5155(Static22.anInt481, Static269.anInt5281, Static217.anIntArrayArrayArray8[local3], local15, local17, local21);
			Static32.method556(local3, local111);
		}
	}
}
