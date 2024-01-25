import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!fi", name = "K", descriptor = "I")
	public static int anInt2118;

	@OriginalMember(owner = "client!fi", name = "M", descriptor = "Lclient!o;")
	public static Class13 aClass13_9;

	@OriginalMember(owner = "client!fi", name = "N", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!fi", name = "J", descriptor = "Lclient!hi;")
	public static final Class102 aClass102_71 = new Class102(82, 16);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lclient!sv;I)Ljava/lang/String;")
	public static String method1736(@OriginalArg(0) Class2_Sub13 arg0) {
		return Static75.method1116(arg0);
	}

	@OriginalMember(owner = "client!fi", name = "f", descriptor = "(I)V")
	public static void method1738() {
		Static280.method3745(false);
		Static395.anInt6501 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static378.aByteArrayArray51.length; local14++) {
			if (Static128.anIntArray181[local14] != -1 && Static378.aByteArrayArray51[local14] == null) {
				Static378.aByteArrayArray51[local14] = Static309.aClass54_84.method1126(Static128.anIntArray181[local14], 0);
				if (Static378.aByteArrayArray51[local14] == null) {
					local12 = false;
					Static395.anInt6501++;
				}
			}
			if (Static193.anIntArray266[local14] != -1 && Static98.aByteArrayArray12[local14] == null) {
				Static98.aByteArrayArray12[local14] = Static309.aClass54_84.method1106(0, Static193.anIntArray266[local14], Static278.anIntArrayArray33[local14]);
				if (Static98.aByteArrayArray12[local14] == null) {
					local12 = false;
					Static395.anInt6501++;
				}
			}
			if (Static388.anIntArray415[local14] != -1 && Static403.aByteArrayArray56[local14] == null) {
				Static403.aByteArrayArray56[local14] = Static309.aClass54_84.method1126(Static388.anIntArray415[local14], 0);
				if (Static403.aByteArrayArray56[local14] == null) {
					Static395.anInt6501++;
					local12 = false;
				}
			}
			if (Static319.anIntArray478[local14] != -1 && Static142.aByteArrayArray19[local14] == null) {
				Static142.aByteArrayArray19[local14] = Static309.aClass54_84.method1126(Static319.anIntArray478[local14], 0);
				if (Static142.aByteArrayArray19[local14] == null) {
					Static395.anInt6501++;
					local12 = false;
				}
			}
			if (Static27.anIntArray188 != null && Static228.aByteArrayArray31[local14] == null && Static27.anIntArray188[local14] != -1) {
				Static228.aByteArrayArray31[local14] = Static309.aClass54_84.method1106(0, Static27.anIntArray188[local14], Static278.anIntArrayArray33[local14]);
				if (Static228.aByteArrayArray31[local14] == null) {
					Static395.anInt6501++;
					local12 = false;
				}
			}
		}
		if (Static171.aClass67_1 == null) {
			if (Static158.aClass2_Sub5_Sub15_4 == null || !Static280.aClass54_78.method1124(Static158.aClass2_Sub5_Sub15_4.aString163 + "_staticelements")) {
				Static171.aClass67_1 = new Class67(0);
			} else if (Static280.aClass54_78.method1105(Static158.aClass2_Sub5_Sub15_4.aString163 + "_staticelements")) {
				Static171.aClass67_1 = Static321.method4362(Static47.aBoolean73, Static158.aClass2_Sub5_Sub15_4.aString163 + "_staticelements", Static280.aClass54_78);
			} else {
				local12 = false;
				Static395.anInt6501++;
			}
		}
		if (!local12) {
			Static113.anInt2085 = 1;
			return;
		}
		local12 = true;
		Static153.anInt2664 = 0;
		@Pc(269) int local269;
		@Pc(280) int local280;
		for (@Pc(250) int local250 = 0; local250 < Static378.aByteArrayArray51.length; local250++) {
			@Pc(256) byte[] local256 = Static98.aByteArrayArray12[local250];
			if (local256 != null) {
				local269 = (Static225.anIntArray310[local250] >> 8) * 64 - Static275.anInt4506;
				local280 = (Static225.anIntArray310[local250] & 0xFF) * 64 - Static209.anInt3497;
				if (Static276.anInt4560 != 0) {
					local269 = 10;
					local280 = 10;
				}
				local12 &= Static138.method2024(Static166.anInt2852, Static426.anInt6923, local256, local280, local269);
			}
			local256 = Static142.aByteArrayArray19[local250];
			if (local256 != null) {
				local269 = (Static225.anIntArray310[local250] >> 8) * 64 - Static275.anInt4506;
				local280 = (Static225.anIntArray310[local250] & 0xFF) * 64 - Static209.anInt3497;
				if (Static276.anInt4560 != 0) {
					local269 = 10;
					local280 = 10;
				}
				local12 &= Static138.method2024(Static166.anInt2852, Static426.anInt6923, local256, local280, local269);
			}
		}
		if (!local12) {
			Static113.anInt2085 = 2;
			return;
		}
		if (Static113.anInt2085 != 0) {
			Static3.method33(Static244.aClass134_61.method2720(Static331.anInt5597) + "<br>(100%)", Static43.aClass92_1, true);
		}
		Static123.method5625();
		Static190.method2553();
		@Pc(377) boolean local377 = false;
		if (Static82.aClass163_1.method5552() && Static2.aClass148_Sub1_1.aBoolean247) {
			for (local269 = 0; local269 < Static378.aByteArrayArray51.length; local269++) {
				if (Static142.aByteArrayArray19[local269] != null || Static403.aByteArrayArray56[local269] != null) {
					local377 = true;
					break;
				}
			}
		}
		if (Static2.aClass148_Sub1_1.aBoolean248) {
			local269 = Static222.anIntArray504[Static307.anInt5290];
		} else {
			local269 = Static148.anIntArray203[Static307.anInt5290];
		}
		if (Static82.aClass163_1.method5508()) {
			local269++;
		}
		Static146.method2135(Static166.anInt2852, Static426.anInt6923, local269, local377, Static82.aClass163_1.method5553() > 0);
		for (local280 = 0; local280 < 4; local280++) {
			Static361.aClass71Array1[local280].method1621();
		}
		Static263.method2958();
		Static372.method4847(false);
		Static12.method158();
		Static405.aClass157_1 = null;
		Static123.method5625();
		System.gc();
		Static280.method3745(true);
		Static63.method954();
		Static235.anInt3809 = Static2.aClass148_Sub1_1.method3036(Static288.anInt4743);
		Static405.aBoolean468 = Static2.aClass148_Sub1_1.aBoolean247;
		Static18.aBoolean210 = Static177.anInt3052 >= 96;
		Static302.aBoolean346 = Static2.aClass148_Sub1_1.method3040(Static288.anInt4743);
		Static142.aBoolean166 = !Static2.aClass148_Sub1_1.aBoolean253;
		Static452.anInt7252 = Static2.aClass148_Sub1_1.method3047(Static288.anInt4743) ? -1 : Static280.anInt4592;
		Static169.aBoolean177 = Static2.aClass148_Sub1_1.aBoolean260;
		Static212.aBoolean215 = Static288.anInt4743 == 1 || Static2.aClass148_Sub1_1.aBoolean246;
		Static318.aClass118_Sub1_2 = new Class118_Sub1(4, Static166.anInt2852, Static426.anInt6923, false);
		if (Static276.anInt4560 == 0) {
			Static441.method5580(Static378.aByteArrayArray51, Static318.aClass118_Sub1_2);
		} else {
			Static124.method872(Static378.aByteArrayArray51, Static318.aClass118_Sub1_2);
		}
		Static209.method2808(Static426.anInt6923 >> 4, Static166.anInt2852 >> 4);
		Static63.method955();
		if (local377) {
			Static56.method816(true);
			Static150.aClass118_Sub1_1 = new Class118_Sub1(1, Static166.anInt2852, Static426.anInt6923, true);
			if (Static276.anInt4560 == 0) {
				Static441.method5580(Static403.aByteArrayArray56, Static150.aClass118_Sub1_1);
				Static280.method3745(true);
			} else {
				Static124.method872(Static403.aByteArrayArray56, Static150.aClass118_Sub1_1);
				Static280.method3745(true);
			}
			Static150.aClass118_Sub1_1.method4298(Static318.aClass118_Sub1_2.anIntArrayArrayArray11[0]);
			Static150.aClass118_Sub1_1.method4301(null, null, Static82.aClass163_1);
			Static56.method816(false);
		}
		Static318.aClass118_Sub1_2.method4301(local377 ? Static150.aClass118_Sub1_1.anIntArrayArrayArray11 : null, Static361.aClass71Array1, Static82.aClass163_1);
		if (Static276.anInt4560 == 0) {
			Static280.method3745(true);
			Static47.method675(Static98.aByteArrayArray12, Static318.aClass118_Sub1_2);
			if (Static228.aByteArrayArray31 != null) {
				Static185.method2537();
			}
		} else {
			Static280.method3745(true);
			Static290.method3872(Static318.aClass118_Sub1_2, Static98.aByteArrayArray12);
		}
		Static190.method2553();
		Static280.method3745(true);
		Static318.aClass118_Sub1_2.method4307(local377 ? Static109.aClass162Array1[0] : null, Static82.aClass163_1, null);
		Static318.aClass118_Sub1_2.method4318(Static82.aClass163_1);
		Static280.method3745(true);
		if (local377) {
			Static56.method816(true);
			Static280.method3745(true);
			if (Static276.anInt4560 == 0) {
				Static47.method675(Static142.aByteArrayArray19, Static150.aClass118_Sub1_1);
			} else {
				Static290.method3872(Static150.aClass118_Sub1_1, Static142.aByteArrayArray19);
			}
			Static190.method2553();
			Static280.method3745(true);
			Static150.aClass118_Sub1_1.method4307(null, Static82.aClass163_1, Static314.aClass162Array2[0]);
			Static150.aClass118_Sub1_1.method4318(Static82.aClass163_1);
			Static280.method3745(true);
			Static56.method816(false);
		}
		Static366.method4811();
		@Pc(714) int local714 = Static318.aClass118_Sub1_2.anInt5450;
		if (Static61.anInt1129 < local714) {
			local714 = Static61.anInt1129;
		}
		if (Static61.anInt1129 - 1 > local714) {
			local714 = Static61.anInt1129 - 1;
		}
		if (Static2.aClass148_Sub1_1.method3047(Static288.anInt4743)) {
			Static225.method2962(0);
		} else {
			Static225.method2962(local714);
		}
		@Pc(749) int local749;
		@Pc(753) int local753;
		for (@Pc(745) int local745 = 0; local745 < 4; local745++) {
			for (local749 = 0; local749 < Static166.anInt2852; local749++) {
				for (local753 = 0; local753 < Static426.anInt6923; local753++) {
					Static104.method1551(local753, local749, local745);
				}
			}
		}
		Static389.method4967();
		Static123.method5625();
		Static244.method3095();
		Static190.method2553();
		Static38.aBoolean63 = false;
		Static186.method5110();
		if (Static261.aFrame3 != null && Static375.aClass160_3 != null && Static290.anInt4777 == 10) {
			Static29.method451(Static94.aClass102_217);
			Static456.aClass2_Sub13_Sub2_2.method3569(1057001181);
		}
		if (Static276.anInt4560 == 0) {
			local749 = (Static283.anInt4621 - (Static166.anInt2852 >> 4)) / 8;
			local753 = (Static283.anInt4621 + (Static166.anInt2852 >> 4)) / 8;
			@Pc(842) int local842 = (Static429.anInt6931 - (Static426.anInt6923 >> 4)) / 8;
			@Pc(850) int local850 = ((Static426.anInt6923 >> 4) + Static429.anInt6931) / 8;
			for (@Pc(854) int local854 = local749 - 1; local854 <= local753 + 1; local854++) {
				for (@Pc(860) int local860 = local842 - 1; local860 <= local850 + 1; local860++) {
					if (local854 < local749 || local753 < local854 || local860 < local842 || local860 > local850) {
						Static309.aClass54_84.method1130("m" + local854 + "_" + local860);
						Static309.aClass54_84.method1130("l" + local854 + "_" + local860);
					}
				}
			}
		}
		if (Static290.anInt4777 == 3) {
			Static37.method5022(2);
		} else if (Static290.anInt4777 == 7) {
			Static37.method5022(6);
		} else {
			Static37.method5022(9);
			if (Static375.aClass160_3 != null) {
				Static29.method451(Static34.aClass102_24);
			}
		}
		Static25.method362();
		Static123.method5625();
		Static93.method1469();
	}

	@OriginalMember(owner = "client!fi", name = "d", descriptor = "(B)V")
	public static void method1739() {
		Static54.aClass235_1 = new Class235(8);
		Static450.anInt7196 = 0;
		for (@Pc(17) Class21_Sub2 local17 = (Class21_Sub2) Static343.aClass93_6.method2080(); local17 != null; local17 = (Class21_Sub2) Static343.aClass93_6.method2081()) {
			local17.method633();
		}
	}
}
