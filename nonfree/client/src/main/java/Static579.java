import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static579 {

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "I")
	public static int anInt9323;

	@OriginalMember(owner = "client!tja", name = "e", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_188 = new Class180(18, -1);

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(B)I")
	public static int method8156() {
		@Pc(22) int local22;
		if (Static24.aClass3_Sub22_4.aClass6_Sub11_1.method4145() == 0) {
			for (local22 = 0; local22 < Static434.anInt6889; local22++) {
				if (Static198.anInterface22Array34[local22].method7006() == 's' || Static198.anInterface22Array34[local22].method7006() == 'S') {
					Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub11_1);
					Static657.aBoolean798 = true;
					break;
				}
			}
		}
		@Pc(71) int local71;
		if (Static615.aClass45_23 == Static55.aClass45_1) {
			@Pc(61) Runtime local61 = Runtime.getRuntime();
			local71 = (int) ((local61.totalMemory() - local61.freeMemory()) / 1024L);
			@Pc(76) long local76 = Static524.method7320();
			if (Static459.aLong233 == 0L) {
				Static459.aLong233 = local76;
			}
			if (local71 > 16384 && local76 - Static459.aLong233 < 5000L) {
				if (local76 - Static290.aLong153 > 1000L) {
					System.gc();
					Static290.aLong153 = local76;
				}
				return 0;
			}
		}
		if (Static615.aClass45_23 == Static55.aClass45_2) {
			if (Static180.aClass259_1 == null) {
				Static180.aClass259_1 = new Class259(Static581.aClass341_4, Static197.aClass240_1, Static44.aBigInteger1, Static127.aBigInteger2);
			}
			if (!Static180.aClass259_1.method6239()) {
				return 0;
			}
			Static646.method8976((String) null, 0, true);
			Static122.aBoolean200 = !Static54.method1202();
			Static284.aClass15_77 = Static440.method6267(false, Static122.aBoolean200 ? 34 : 32, 1);
			Static35.aClass15_12 = Static440.method6267(false, 33, 1);
			Static218.aClass15_62 = Static440.method6267(false, 13, 1);
		}
		@Pc(170) boolean local170;
		if (Static55.aClass45_3 == Static615.aClass45_23) {
			local170 = Static35.aClass15_12.method535();
			local71 = Static445.aClass227_Sub1Array2[33].method8080();
			local71 += Static445.aClass227_Sub1Array2[Static122.aBoolean200 ? 34 : 32].method8080();
			local71 += Static445.aClass227_Sub1Array2[13].method8080();
			local71 += local170 ? 100 : Static35.aClass15_12.method525();
			if (local71 != 400) {
				return local71 / 4;
			}
			Static38.anInt904 = Static284.aClass15_77.method534();
			Static294.anInt6320 = Static35.aClass15_12.method534();
			Static52.method1160(Static284.aClass15_77);
			@Pc(233) int local233 = Static24.aClass3_Sub22_4.aClass6_Sub16_1.method4632();
			Static559.aClass44_1 = new Class44(Static55.aClass118_2, Static609.anInt9834, Static35.aClass15_12);
			@Pc(245) int[] local245 = Static559.aClass44_1.method1163(local233);
			if (local245.length == 0) {
				local245 = Static559.aClass44_1.method1163(0);
			}
			@Pc(259) Class161 local259 = new Class161(Static284.aClass15_77, Static218.aClass15_62);
			if (local245.length > 0) {
				Static155.anInterface19Array1 = new Interface19[local245.length];
				for (@Pc(271) int local271 = 0; local271 < Static155.anInterface19Array1.length; local271++) {
					Static155.anInterface19Array1[local271] = new Class53(Static559.aClass44_1.method1162(local245[local271]), local259);
				}
			}
		}
		if (Static55.aClass45_4 == Static615.aClass45_23) {
			Static9.method162(Static218.aClass15_62, Static524.method7318(), Static284.aClass15_77);
		}
		if (Static615.aClass45_23 == Static55.aClass45_5) {
			local22 = Static318.method4864();
			local71 = Static614.method8691();
			if (local22 < local71) {
				return local22 * 100 / local71;
			}
		}
		if (Static55.aClass45_6 == Static615.aClass45_23) {
			if (Static155.anInterface19Array1 != null && Static155.anInterface19Array1.length > 0) {
				if (Static155.anInterface19Array1[0].method2899() < 100) {
					return 0;
				}
				if (Static155.anInterface19Array1.length > 1 && Static559.aClass44_1.method1161() && Static155.anInterface19Array1[1].method2899() < 100) {
					return 0;
				}
			}
			Static64.method1328(Static674.aClass13_22);
			Static342.method5137(Static674.aClass13_22);
			Static553.method7892(1);
		}
		if (Static55.aClass45_7 == Static615.aClass45_23) {
			for (local22 = 0; local22 < 4; local22++) {
				Static1.aClass252Array5[local22] = Static404.method5713(Static158.anInt927, Static515.anInt8292);
			}
		}
		if (Static615.aClass45_23 == Static55.aClass45_8) {
			Static369.aClass15_97 = Static440.method6267(false, 8, 1);
			Static488.aClass15_125 = Static440.method6267(false, 0, 1);
			Static446.aClass15_95 = Static440.method6267(false, 1, 1);
			Static277.aClass15_108 = Static440.method6267(false, 2, 1);
			Static466.aClass15_117 = Static440.method6267(false, 3, 1);
			Static550.aClass15_138 = Static440.method6267(false, 4, 1);
			Static590.aClass15_146 = Static440.method6267(true, 5, 1);
			Static604.aClass15_150 = Static440.method6267(true, 6, 1);
			Static476.aClass15_122 = Static440.method6267(false, 7, 1);
			Static101.aClass15_27 = Static440.method6267(false, 9, 1);
			Static548.aClass15_136 = Static440.method6267(false, 10, 1);
			Static64.aClass15_19 = Static440.method6267(false, 11, 1);
			Static532.aClass15_135 = Static440.method6267(false, 12, 1);
			Static387.aClass15_101 = Static440.method6267(false, 14, 1);
			Static173.aClass15_52 = Static440.method6267(false, 15, 1);
			Static577.aClass15_165 = Static440.method6267(false, 16, 1);
			Static468.aClass15_118 = Static440.method6267(false, 17, 1);
			Static20.aClass15_119 = Static440.method6267(false, 18, 1);
			Static474.aClass15_121 = Static440.method6267(false, 19, 1);
			Static364.aClass15_96 = Static440.method6267(false, 20, 1);
			Static254.aClass15_72 = Static440.method6267(false, 21, 1);
			Static341.aClass15_90 = Static440.method6267(false, 22, 1);
			Static267.aClass15_75 = Static440.method6267(true, 23, 1);
			Static206.aClass15_56 = Static440.method6267(false, 24, 1);
			Static165.aClass15_154 = Static440.method6267(false, 25, 1);
			Static116.aClass15_37 = Static440.method6267(true, 26, 1);
			Static102.aClass15_28 = Static440.method6267(false, 27, 1);
			Static631.aClass15_155 = Static440.method6267(true, 28, 1);
			Static483.aClass15_123 = Static440.method6267(false, 29, 1);
			Static678.aClass15_167 = Static440.method6267(true, 30, 1);
			Static512.aClass15_130 = Static440.method6267(true, 31, 1);
			Static201.aClass15_58 = Static440.method6267(true, 36, 2);
		}
		if (Static615.aClass45_23 == Static55.aClass45_9) {
			local22 = 0;
			for (local71 = 0; local71 < 37; local71++) {
				if (Static445.aClass227_Sub1Array2[local71] != null) {
					local22 += Static445.aClass227_Sub1Array2[local71].method8080() * Static673.anIntArray960[local71] / 100;
				}
			}
			if (local22 != 100) {
				if (Static460.anInt7598 < 0) {
					Static460.anInt7598 = local22;
				}
				return (local22 - Static460.anInt7598) * 100 / (100 - Static460.anInt7598);
			}
			Static644.method8954(Static369.aClass15_97);
			Static9.method162(Static218.aClass15_62, Static524.method7318(), Static369.aClass15_97);
		}
		if (Static55.aClass45_10 == Static615.aClass45_23) {
			if (Static112.anInt5572 == -1) {
				Static112.anInt5572 = Static604.aClass15_150.method514("scape main");
			}
			Static20.method6841();
			Static553.method7892(2);
		}
		if (Static55.aClass45_11 == Static615.aClass45_23) {
			Static210.method7895(Static247.aClass291_1, Static678.aClass15_167);
		}
		if (Static55.aClass45_12 == Static615.aClass45_23) {
			local22 = Static287.method4535();
			if (local22 < 100) {
				return local22;
			}
			Static89.method1668(Static631.aClass15_155.method536(1));
			Static43.method1107(Static631.aClass15_155.method536(3));
			Static449.aClass72_2 = new Class72(Static631.aClass15_155);
		}
		if (Static615.aClass45_23 == Static55.aClass45_13) {
			if (Static366.anInt5930 != -1 && !Static476.aClass15_122.method542(0, Static366.anInt5930)) {
				return 99;
			}
			Static35.anInterface4_3 = new Class187(Static116.aClass15_37, Static101.aClass15_27, Static369.aClass15_97);
			Static467.aClass367_1 = new Class367(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static282.aClass52_1 = new Class52(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108, Static449.aClass72_2);
			Static634.aClass253_2 = new Class253(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108, Static369.aClass15_97);
			Static249.aClass231_1 = new Class231(Static55.aClass118_2, Static609.anInt9834, Static468.aClass15_118);
			Static300.aClass63_4 = new Class63(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static468.aClass306_5 = new Class306(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static138.aClass131_1 = new Class131(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108, Static369.aClass15_97);
			Static635.aClass386_2 = new Class386(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108, Static476.aClass15_122);
			Static396.aClass157_1 = new Class157(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static74.aClass86_1 = new Class86(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static652.aClass267_4 = new Class267(Static55.aClass118_2, Static609.anInt9834, true, Static577.aClass15_165, Static476.aClass15_122);
			Static84.aClass27_1 = new Class27(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108, Static369.aClass15_97);
			Static370.aClass377_4 = new Class377(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108, Static369.aClass15_97);
			Static580.aClass36_2 = new Class36(Static55.aClass118_2, Static609.anInt9834, true, Static20.aClass15_119, Static476.aClass15_122);
			Static170.aClass370_1 = new Class370(Static55.aClass118_2, Static609.anInt9834, true, Static467.aClass367_1, Static474.aClass15_121, Static476.aClass15_122);
			Static617.aClass320_1 = new Class320(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static243.aClass343_3 = new Class343(Static55.aClass118_2, Static609.anInt9834, Static364.aClass15_96, Static488.aClass15_125, Static446.aClass15_95);
			Static559.aClass340_1 = new Class340(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static38.aClass75_1 = new Class75(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static354.aClass236_2 = new Class236(Static55.aClass118_2, Static609.anInt9834, Static254.aClass15_72, Static476.aClass15_122);
			Static155.aClass275_1 = new Class275(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static360.aClass237_1 = new Class237(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static399.aClass32_1 = new Class32(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static264.aClass110_1 = new Class110(Static55.aClass118_2, Static609.anInt9834, Static341.aClass15_90);
			Static411.aClass70_1 = new Class70(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static210.aClass199_2 = new Class199(Static55.aClass118_2, Static609.anInt9834, Static277.aClass15_108);
			Static576.method8131(Static218.aClass15_62, Static369.aClass15_97, Static466.aClass15_117, Static476.aClass15_122);
			Static615.method8692(Static483.aClass15_123);
			Static557.aClass323_1 = new Class323(Static609.anInt9834, Static206.aClass15_56, Static165.aClass15_154);
			Static143.aClass77_1 = new Class77(Static609.anInt9834, Static206.aClass15_56, Static165.aClass15_154, new Class255());
			Static48.method1147();
			Static652.aClass267_4.method6683(Static24.aClass3_Sub22_4.lb.method7116() == 0);
			Static131.aClass66_1 = new Class66();
			Static313.method4793();
			Static315.method4813(Static102.aClass15_28);
			Static314.method2788(Static476.aClass15_122, Static35.anInterface4_3);
			@Pc(1009) Class245 local1009 = new Class245(Static548.aClass15_136.method533("huffman", ""));
			Static536.method7983(local1009);
			try {
				jagmisc.init();
			} catch (@Pc(1016) Throwable local1016) {
			}
			Static210.aClass102_2 = Static58.method1276();
			Static241.aClass3_Sub10_1 = new Class3_Sub10(true, Static247.aClass291_1);
		}
		if (Static55.aClass45_15 == Static615.aClass45_23) {
			local22 = Static394.method5572(Static369.aClass15_97) + Static488.method7051(true);
			local71 = Static673.method9352() + Static614.method8691();
			if (local71 > local22) {
				return local22 * 100 / local71;
			}
		}
		if (Static55.aClass45_16 == Static615.aClass45_23) {
			Static317.method4942(Static267.aClass15_75, Static300.aClass63_4, Static468.aClass306_5, Static652.aClass267_4, Static84.aClass27_1, Static370.aClass377_4, Static131.aClass66_1);
		}
		if (Static55.aClass45_17 == Static615.aClass45_23) {
			Static449.anIntArray636 = new int[Static399.aClass32_1.anInt837];
			Static628.aStringArray37 = new String[Static360.aClass237_1.anInt6307];
			Static487.aBooleanArray38 = new boolean[Static399.aClass32_1.anInt837];
			for (local22 = 0; local22 < Static399.aClass32_1.anInt837; local22++) {
				if (Static399.aClass32_1.method939(local22).anInt5984 == 0) {
					Static487.aBooleanArray38[local22] = true;
					Static277.anInt6587++;
				}
				Static449.anIntArray636[local22] = -1;
			}
			Static179.method3211();
			Static371.anInt5965 = Static466.aClass15_117.method514("loginscreen");
			Static397.anInt6239 = Static466.aClass15_117.method514("lobbyscreen");
			Static590.aClass15_146.method518(false);
			Static604.aClass15_150.method518(true);
			Static369.aClass15_97.method518(true);
			Static218.aClass15_62.method518(true);
			Static548.aClass15_136.method518(true);
			Static466.aClass15_117.method518(true);
			Static277.aClass15_108.anInt425 = 2;
			Static598.aBoolean738 = true;
			Static468.aClass15_118.anInt425 = 2;
			Static577.aClass15_165.anInt425 = 2;
			Static20.aClass15_119.anInt425 = 2;
			Static474.aClass15_121.anInt425 = 2;
			Static364.aClass15_96.anInt425 = 2;
			Static254.aClass15_72.anInt425 = 2;
		}
		if (Static55.aClass45_18 == Static615.aClass45_23) {
			if (!Static27.method666(Static371.anInt5965)) {
				return 0;
			}
			local170 = true;
			for (local71 = 0; local71 < Static489.aClass260ArrayArray3[Static371.anInt5965].length; local71++) {
				@Pc(1202) Class260 local1202 = Static489.aClass260ArrayArray3[Static371.anInt5965][local71];
				if (local1202.anInt7003 == 5 && local1202.anInt6961 != -1 && !Static369.aClass15_97.method542(0, local1202.anInt6961)) {
					local170 = false;
				}
			}
			if (!local170) {
				return 0;
			}
		}
		if (Static55.aClass45_19 == Static615.aClass45_23) {
			Static11.method184(true);
		}
		if (Static55.aClass45_20 == Static615.aClass45_23) {
			Static578.aClass193_1.method4866();
			try {
				Static2.aThread9.join();
			} catch (@Pc(1252) InterruptedException local1252) {
				return 0;
			}
			Static35.aClass15_12 = null;
			Static155.anInterface19Array1 = null;
			Static2.aThread9 = null;
			Static284.aClass15_77 = null;
			Static578.aClass193_1 = null;
			Static559.aClass44_1 = null;
			Static190.method3481();
			Static103.aBoolean150 = Static24.aClass3_Sub22_4.aClass6_Sub11_1.method4145() == 1;
			Static24.aClass3_Sub22_4.method2840(1, Static24.aClass3_Sub22_4.aClass6_Sub11_1);
			if (Static103.aBoolean150) {
				Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
			} else if (Static24.aClass3_Sub22_4.aClass6_Sub21_2.aBoolean606 && Static241.aClass3_Sub10_1.anInt1059 < 512 && Static241.aClass3_Sub10_1.anInt1059 != 0) {
				Static24.aClass3_Sub22_4.method2840(0, Static24.aClass3_Sub22_4.aClass6_Sub21_2);
			}
			Static441.method6272();
			if (Static103.aBoolean150) {
				Static382.method5480(false, 0);
			} else {
				Static382.method5480(false, Static24.aClass3_Sub22_4.aClass6_Sub21_2.method6970());
			}
			Static235.method3936(-1, Static24.aClass3_Sub22_4.aClass6_Sub7_1.method3506(), -1, false);
			Static64.method1328(Static674.aClass13_22);
			Static342.method5137(Static674.aClass13_22);
			Static572.method8072(Static674.aClass13_22, Static369.aClass15_97);
			Static304.method4670(Static52.aClass33Array6);
		}
		return Static243.method7724();
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "(III)I")
	public static int method8157(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return arg1 == 1 || arg1 == 3 ? Static480.anIntArray675[arg0 & 0x3] : Static157.anIntArray269[arg0 & 0x3];
	}

	@OriginalMember(owner = "client!tja", name = "a", descriptor = "([IZ[Ljava/lang/String;)V")
	public static void method8158(@OriginalArg(0) int[] arg0, @OriginalArg(2) String[] arg1) {
		Static253.method7871(0, arg1, arg0, arg1.length - 1);
	}
}
