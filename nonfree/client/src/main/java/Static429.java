import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static429 {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Lclient!ok;")
	public static Class178 aClass178_135;

	@OriginalMember(owner = "client!vk", name = "b", descriptor = "Lclient!aa;")
	public static final Class2 aClass2_106 = new Class2(36, 7);

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "Z")
	public static boolean aBoolean483 = true;

	@OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
	public static int anInt7167 = 0;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "[[I")
	public static final int[][] anIntArrayArray60 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILclient!ya;)V")
	public static void method5537(@OriginalArg(1) Class51 arg0) {
		if (Static102.anInt2085 < 2 && !Static402.aBoolean412 || Static191.aClass95_9 != null) {
			return;
		}
		@Pc(42) String local42;
		if (Static402.aBoolean412 && Static102.anInt2085 < 2) {
			local42 = Static139.aString32 + Static322.aClass55_114.method1205(Static5.anInt20) + Static73.aString7 + " ->";
		} else if (Static243.aBoolean254 && Static310.aClass130_1.method5069(81) && Static102.anInt2085 > 2) {
			local42 = Static336.method4381((Class7_Sub39) Static237.aClass85_26.aClass7_81.aClass7_261.aClass7_261);
		} else {
			@Pc(73) Class7_Sub39 local73 = (Class7_Sub39) Static237.aClass85_26.aClass7_81.aClass7_261;
			local42 = Static336.method4381(local73);
			@Pc(81) int[] local81 = null;
			if (Static59.method821(local73.anInt5893)) {
				local81 = Static259.aClass206_2.method4320((int) local73.aLong186).anIntArray81;
			} else if (local73.anInt5895 != -1) {
				local81 = Static259.aClass206_2.method4320(local73.anInt5895).anIntArray81;
			} else if (Static300.method4007(local73.anInt5893)) {
				@Pc(159) Class26_Sub2_Sub4_Sub1 local159 = Static171.aClass26_Sub2_Sub4_Sub1Array1[(int) local73.aLong186];
				if (local159 != null) {
					@Pc(164) Class249 local164 = local159.aClass249_1;
					if (local164.anIntArray579 != null) {
						local164 = local164.method5179(Static224.aClass239_7);
					}
					if (local164 != null) {
						local81 = local164.anIntArray582;
					}
				}
			} else if (Static139.method2166(local73.anInt5893)) {
				@Pc(127) Class189 local127;
				if (local73.anInt5893 == 1011) {
					local127 = Static411.aClass142_4.method3148((int) local73.aLong186);
				} else {
					local127 = Static411.aClass142_4.method3148((int) (local73.aLong186 >>> 32 & 0x7FFFFFFFL));
				}
				if (local127.anIntArray448 != null) {
					local127 = local127.method4038(Static224.aClass239_7);
				}
				if (local127 != null) {
					local81 = local127.anIntArray449;
				}
			}
			if (local81 != null) {
				local42 = local42 + Static96.method1690(local81);
			}
		}
		if (Static102.anInt2085 > 2) {
			local42 = local42 + "<col=ffffff> / " + (Static102.anInt2085 - 2) + Static263.aClass55_98.method1205(Static5.anInt20);
		}
		if (Static257.aClass95_10 != null) {
			@Pc(264) Class63 local264 = Static257.aClass95_10.method2156(arg0);
			if (local264 == null) {
				local264 = Static305.aClass63_15;
			}
			local264.method4571(Static257.aClass95_10.anInt2653, Static297.anInt4924, Static254.aRandom1, Static281.anInt7172, Static52.anIntArray78, Static257.aClass95_10.anInt2596, Static257.aClass95_10.anInt2638, Static423.aClass11Array15, Static257.aClass95_10.anInt2595, local42, Static68.anIntArray99, Static257.aClass95_10.anInt2628, Static257.aClass95_10.anInt2597, Static312.anInt5169);
			Static136.method2147(Static52.anIntArray78[3], Static52.anIntArray78[1], Static52.anIntArray78[2], Static52.anIntArray78[0]);
		} else if (Static341.aClass95_13 != null && Static191.aClass137_3 == Static419.aClass137_4) {
			@Pc(245) int local245 = Static305.aClass63_15.method4582(Static312.anInt5169, local42, Static408.anInt6458 + 4, Static68.anIntArray99, Static423.aClass11Array15, Static12.anInt145 + 16, Static254.aRandom1);
			Static136.method2147(16, Static12.anInt145, local245 + Static35.aClass57_13.method1387(local42), Static408.anInt6458 + 4);
			return;
		}
	}
}
