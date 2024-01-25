import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static507 {

	@OriginalMember(owner = "client!te", name = "d", descriptor = "I")
	public static int anInt8114;

	@OriginalMember(owner = "client!te", name = "l", descriptor = "Lclient!mv;")
	public static Class229 aClass229_120;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "([BIILjava/lang/String;IB)I")
	public static int method6603(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14 = arg3;
		for (@Pc(16) int local16 = 0; local16 < local14; local16++) {
			@Pc(24) char local24 = arg2.charAt(local16);
			if (local24 > '\u0000' && local24 < '\u0080' || !(local24 < ' ' || local24 > 'ÿ')) {
				arg0[local16 + arg1] = (byte) local24;
			} else if (local24 == '€') {
				arg0[arg1 + local16] = -128;
			} else if (local24 == '‚') {
				arg0[local16 + arg1] = -126;
			} else if (local24 == 'ƒ') {
				arg0[local16 + arg1] = -125;
			} else if (local24 == '„') {
				arg0[local16 + arg1] = -124;
			} else if (local24 == '…') {
				arg0[local16 + arg1] = -123;
			} else if (local24 == '†') {
				arg0[local16 + arg1] = -122;
			} else if (local24 == '‡') {
				arg0[arg1 + local16] = -121;
			} else if (local24 == 'ˆ') {
				arg0[local16 + arg1] = -120;
			} else if (local24 == '‰') {
				arg0[arg1 + local16] = -119;
			} else if (local24 == 'Š') {
				arg0[local16 + arg1] = -118;
			} else if (local24 == '‹') {
				arg0[arg1 + local16] = -117;
			} else if (local24 == 'Œ') {
				arg0[arg1 + local16] = -116;
			} else if (local24 == 'Ž') {
				arg0[local16 + arg1] = -114;
			} else if (local24 == '‘') {
				arg0[arg1 + local16] = -111;
			} else if (local24 == '’') {
				arg0[local16 + arg1] = -110;
			} else if (local24 == '“') {
				arg0[arg1 + local16] = -109;
			} else if (local24 == '”') {
				arg0[arg1 + local16] = -108;
			} else if (local24 == '•') {
				arg0[local16 + arg1] = -107;
			} else if (local24 == '–') {
				arg0[arg1 + local16] = -106;
			} else if (local24 == '—') {
				arg0[local16 + arg1] = -105;
			} else if (local24 == '˜') {
				arg0[local16 + arg1] = -104;
			} else if (local24 == '™') {
				arg0[arg1 + local16] = -103;
			} else if (local24 == 'š') {
				arg0[local16 + arg1] = -102;
			} else if (local24 == '›') {
				arg0[local16 + arg1] = -101;
			} else if (local24 == 'œ') {
				arg0[arg1 + local16] = -100;
			} else if (local24 == 'ž') {
				arg0[local16 + arg1] = -98;
			} else if (local24 == 'Ÿ') {
				arg0[arg1 + local16] = -97;
			} else {
				arg0[arg1 + local16] = 63;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(I)V")
	public static void method6604() {
		Static401.aClass309_4.method6245();
		Static380.aClass211_7.method4401();
		Static25.aClass286_1.method5745();
		Static362.aClass290_2.method5802();
		Static76.aClass361_1.method7582();
		Static466.aClass130_2.method2320();
		Static117.aClass18_1.method298();
		Static62.aClass49_1.method1022();
		Static31.aClass145_1.method2548();
		Static572.aClass55_1.method1099();
		Static380.aClass221_3.method4667();
		Static369.aClass212_6.method4409();
		Static8.aClass360_1.method7574();
		Static232.aClass176_1.method3613();
		Static537.aClass191_2.method3975();
		Static403.aClass123_2.method2210();
		Static496.aClass39_1.method801();
		Static304.aClass304_1.method6147();
		Static23.aClass110_1.method2021();
		Static337.aClass26_1.method391();
		Static75.method1207();
		Static394.method5430();
		Static425.method5879();
		Static418.method5618();
		if (Static340.aClass232_14 != Static416.aClass232_7) {
			for (@Pc(78) int local78 = 0; local78 < Static454.aByteArrayArray18.length; local78++) {
				Static454.aByteArrayArray18[local78] = null;
			}
			Static464.anInt7426 = 0;
		}
		Static454.method5910();
		Static253.method3615();
		Static8.method173();
		Static139.method1911();
		Static403.method7445();
		Static566.aClass21_91.method313();
		Static417.aClass162_17.method6843();
		Static102.method1532();
		Static256.method3648();
		Static277.aClass229_68.method4965();
		Static33.aClass229_8.method4965();
		Static248.aClass229_57.method4965();
		Static331.aClass229_80.method4965();
		Static48.aClass229_11.method4965();
		Static372.aClass229_89.method4965();
		Static106.aClass229_32.method4965();
		Static463.aClass229_106.method4965();
		Static241.aClass229_54.method4965();
		Static300.aClass229_70.method4965();
		Static16.aClass229_1.method4965();
		Static403.aClass229_125.method4965();
		Static399.aClass229_93.method4965();
		Static191.aClass229_45.method4965();
		Static391.aClass229_109.method4965();
		Static447.aClass229_105.method4965();
		Static72.aClass229_20.method4965();
		Static378.aClass229_90.method4965();
		Static187.aClass229_121.method4965();
		Static255.aClass229_62.method4965();
		Static309.aClass229_74.method4965();
		Static427.aClass229_97.method4965();
		Static402.aClass229_94.method4965();
		Static237.aClass229_52.method4965();
		Static579.aClass229_128.method4965();
		Static418.aClass229_96.method4965();
		Static572.aClass229_126.method4965();
		Static367.aClass229_88.method4965();
		Static466.aClass229_107.method4965();
		Static340.aClass229_83.method4965();
		Static248.aClass229_58.method4965();
		Static49.aClass229_31.method4965();
		Static531.aClass21_83.method313();
		Static211.aClass21_34.method313();
		Static360.aClass21_56.method313();
		Static465.aClass21_71.method313();
	}

	@OriginalMember(owner = "client!te", name = "d", descriptor = "(I)V")
	public static void method6605() {
		Static299.method4350();
		Static574.method7450();
	}
}
