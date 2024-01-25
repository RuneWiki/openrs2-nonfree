import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!ul", name = "i", descriptor = "Lclient!c;")
	public static Class5 aClass5_28;

	@OriginalMember(owner = "client!ul", name = "n", descriptor = "[Lclient!cd;")
	public static Class8_Sub2_Sub1_Sub1[] aClass8_Sub2_Sub1_Sub1Array2;

	@OriginalMember(owner = "client!ul", name = "p", descriptor = "Lclient!uo;")
	public static Class32 aClass32_14;

	@OriginalMember(owner = "client!ul", name = "e", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_58 = new Class87(16);

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
	public static int anInt6225 = 0;

	@OriginalMember(owner = "client!ul", name = "o", descriptor = "I")
	public static int anInt6232 = 0;

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(B)V")
	public static void method5273() {
		Static348.aClass12ArrayArray1 = new Class12[Static117.aClass216_36.method5647()][];
		Static144.aBooleanArray12 = new boolean[Static117.aClass216_36.method5647()];
	}

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)Z")
	public static boolean method5276(@OriginalArg(1) int arg0) {
		if (arg0 == 3 || arg0 == 9 || arg0 == 51 || arg0 == 17 || arg0 == 1002) {
			return true;
		} else {
			return arg0 == 44 || arg0 == 1011;
		}
	}

	@OriginalMember(owner = "client!ul", name = "c", descriptor = "(B)V")
	public static void method5277() {
		Static2.method64(false);
		Static76.anInt1981 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static345.aByteArrayArray25.length; local14++) {
			if (Static261.anIntArray161[local14] != -1 && Static345.aByteArrayArray25[local14] == null) {
				Static345.aByteArrayArray25[local14] = Static24.aClass216_6.method5648(Static261.anIntArray161[local14], 0);
				if (Static345.aByteArrayArray25[local14] == null) {
					Static76.anInt1981++;
					local12 = false;
				}
			}
			if (Static254.anIntArray445[local14] != -1 && Static305.aByteArrayArray22[local14] == null) {
				Static305.aByteArrayArray22[local14] = Static24.aClass216_6.method5646(Static327.anIntArrayArray61[local14], 0, Static254.anIntArray445[local14]);
				if (Static305.aByteArrayArray22[local14] == null) {
					local12 = false;
					Static76.anInt1981++;
				}
			}
			if (Static325.anIntArray507[local14] != -1 && Static8.aByteArrayArray21[local14] == null) {
				Static8.aByteArrayArray21[local14] = Static24.aClass216_6.method5648(Static325.anIntArray507[local14], 0);
				if (Static8.aByteArrayArray21[local14] == null) {
					local12 = false;
					Static76.anInt1981++;
				}
			}
			if (Static145.anIntArray271[local14] != -1 && Static263.aByteArrayArray16[local14] == null) {
				Static263.aByteArrayArray16[local14] = Static24.aClass216_6.method5648(Static145.anIntArray271[local14], 0);
				if (Static263.aByteArrayArray16[local14] == null) {
					Static76.anInt1981++;
					local12 = false;
				}
			}
			if (Static318.anIntArray500 != null && Static315.aByteArrayArray23[local14] == null && Static318.anIntArray500[local14] != -1) {
				Static315.aByteArrayArray23[local14] = Static24.aClass216_6.method5646(Static327.anIntArrayArray61[local14], 0, Static318.anIntArray500[local14]);
				if (Static315.aByteArrayArray23[local14] == null) {
					local12 = false;
					Static76.anInt1981++;
				}
			}
		}
		if (Static224.aClass207_3 == null) {
			if (Static83.aClass1_Sub4_Sub1_2 == null || !Static312.aClass216_74.method5655(Static83.aClass1_Sub4_Sub1_2.aString2 + "_staticelements")) {
				Static224.aClass207_3 = new Class207(0);
			} else if (Static312.aClass216_74.method5672(Static83.aClass1_Sub4_Sub1_2.aString2 + "_staticelements")) {
				Static224.aClass207_3 = Static36.method871(Static349.aBoolean659, Static83.aClass1_Sub4_Sub1_2.aString2 + "_staticelements", Static312.aClass216_74);
			} else {
				local12 = false;
				Static76.anInt1981++;
			}
		}
		if (!local12) {
			Static6.anInt274 = 1;
			return;
		}
		Static87.anInt2181 = 0;
		local12 = true;
		@Pc(277) int local277;
		@Pc(288) int local288;
		for (@Pc(258) int local258 = 0; local258 < Static345.aByteArrayArray25.length; local258++) {
			@Pc(264) byte[] local264 = Static305.aByteArrayArray22[local258];
			if (local264 != null) {
				local277 = (Static222.anIntArray416[local258] >> 8) * 64 - Static234.anInt4783;
				local288 = (Static222.anIntArray416[local258] & 0xFF) * 64 - Static32.anInt2224;
				if (Static314.aBoolean592) {
					local288 = 10;
					local277 = 10;
				}
				local12 &= Static281.method4888(local264, local288, local277);
			}
			local264 = Static263.aByteArrayArray16[local258];
			if (local264 != null) {
				local277 = (Static222.anIntArray416[local258] >> 8) * 64 - Static234.anInt4783;
				local288 = (Static222.anIntArray416[local258] & 0xFF) * 64 - Static32.anInt2224;
				if (Static314.aBoolean592) {
					local277 = 10;
					local288 = 10;
				}
				local12 &= Static281.method4888(local264, local288, local277);
			}
		}
		if (!local12) {
			Static6.anInt274 = 2;
			return;
		}
		if (Static6.anInt274 != 0) {
			Static176.method3473(Static46.aClass34_34.method1285(Static259.anInt2907) + "<br>(100%)", true, Static212.aClass9_3);
		}
		Static63.method4863();
		Static334.method5421();
		@Pc(390) boolean local390 = false;
		if (Static208.aClass32_11.method2235() && Static304.aBoolean580) {
			for (local277 = 0; local277 < Static345.aByteArrayArray25.length; local277++) {
				if (Static263.aByteArrayArray16[local277] != null || Static8.aByteArrayArray21[local277] != null) {
					local390 = true;
					break;
				}
			}
		}
		if (Static306.aBoolean584) {
			local277 = Static100.anIntArray406[Static256.anInt5309];
		} else {
			local277 = Static55.anIntArray155[Static256.anInt5309];
		}
		if (Static208.aClass32_11.method2144()) {
			local277++;
		}
		Static323.method5270(Static233.anInt5573, Static134.anInt2971, local277, local390, Static208.aClass32_11.method2240() > 0);
		for (local288 = 0; local288 < 4; local288++) {
			Static29.aClass71Array1[local288].method1945();
		}
		Static163.method3261();
		Static237.method4338(false);
		Static122.method2570();
		Static63.method4863();
		System.gc();
		Static2.method64(true);
		Static31.method798(4, false);
		@Pc(488) int[][] local488 = null;
		if (!Static314.aBoolean592) {
			Static6.method250(false);
			Static75.method1718(Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0] >> 3, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0] >> 3);
			Static280.method4877();
			Static72.method1682(4, false, Static208.aClass32_11, null);
			local488 = Static251.anIntArrayArrayArray15[0];
			Static2.method64(true);
			Static326.method2143(false);
			if (Static315.aByteArrayArray23 != null) {
				Static124.method2602();
			}
		}
		if (Static314.aBoolean592) {
			Static193.method3724(false);
			Static75.method1718(Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray438[0] >> 3, Static198.aClass17_Sub1_Sub1_Sub1_3.anIntArray439[0] >> 3);
			Static280.method4877();
			Static72.method1682(4, false, Static208.aClass32_11, null);
			local488 = Static251.anIntArrayArrayArray15[0];
			Static2.method64(true);
			Static70.method1629(false);
		}
		Static334.method5421();
		Static2.method64(true);
		Static314.method5206(Static29.aClass71Array1, 4, Static208.aClass32_11, null, false);
		Static281.method4889(Static208.aClass32_11, 4);
		Static2.method64(true);
		@Pc(591) int local591 = Static211.anInt4537;
		if (local591 > Static242.anInt6745) {
			local591 = Static242.anInt6745;
		}
		if (local591 < Static242.anInt6745 - 1) {
			local591 = Static242.anInt6745 - 1;
		}
		if (Static40.method953()) {
			Static332.method5396(0);
		} else {
			Static332.method5396(local591);
		}
		Static182.method3596();
		if (local390) {
			Static177.method3703(true);
			Static31.method798(1, true);
			if (!Static314.aBoolean592) {
				Static6.method250(true);
				Static72.method1682(1, true, Static208.aClass32_11, local488);
				Static2.method64(true);
				Static326.method2143(true);
				Static281.method4889(Static208.aClass32_11, 1);
			}
			if (Static314.aBoolean592) {
				Static193.method3724(true);
				Static72.method1682(1, true, Static208.aClass32_11, local488);
				Static2.method64(true);
				Static70.method1629(true);
			}
			Static334.method5421();
			Static2.method64(true);
			Static314.method5206(Static29.aClass71Array1, 1, Static208.aClass32_11, Static190.aClass53Array1[0], true);
			Static281.method4889(Static208.aClass32_11, 1);
			Static2.method64(true);
			Static182.method3596();
			Static177.method3703(false);
		}
		@Pc(709) int local709;
		@Pc(713) int local713;
		for (@Pc(705) int local705 = 0; local705 < 4; local705++) {
			for (local709 = 0; local709 < Static233.anInt5573; local709++) {
				for (local713 = 0; local713 < Static134.anInt2971; local713++) {
					Static293.method4938(local705, local709, local713);
				}
			}
		}
		Static31.method796();
		Static63.method4863();
		Static78.method1764();
		Static334.method5421();
		Static4.aBoolean11 = false;
		Static82.method1814();
		if (Static84.aFrame1 != null && Static7.aClass148_1 != null && Static295.anInt5811 == 25) {
			Static342.aClass1_Sub8_Sub1_7.method3229(73);
			Static342.aClass1_Sub8_Sub1_7.method4529(1057001181);
		}
		if (!Static314.aBoolean592) {
			local709 = (Static224.anInt4654 - (Static233.anInt5573 >> 4)) / 8;
			local713 = ((Static233.anInt5573 >> 4) + Static224.anInt4654) / 8;
			@Pc(799) int local799 = (Static124.anInt2811 - (Static134.anInt2971 >> 4)) / 8;
			@Pc(807) int local807 = ((Static134.anInt2971 >> 4) + Static124.anInt2811) / 8;
			for (@Pc(811) int local811 = local709 - 1; local811 <= local713 + 1; local811++) {
				for (@Pc(817) int local817 = local799 - 1; local817 <= local807 + 1; local817++) {
					if (local709 > local811 || local713 < local811 || local799 > local817 || local817 > local807) {
						Static24.aClass216_6.method5650("m" + local811 + "_" + local817);
						Static24.aClass216_6.method5650("l" + local811 + "_" + local817);
					}
				}
			}
		}
		if (Static295.anInt5811 == 28) {
			Static232.method4269(10);
		} else {
			Static232.method4269(30);
			if (Static7.aClass148_1 != null) {
				Static342.aClass1_Sub8_Sub1_7.method3229(174);
			}
		}
		Static86.method1863();
		Static63.method4863();
		Static214.method4111();
	}

	@OriginalMember(owner = "client!ul", name = "d", descriptor = "(B)V")
	public static void method5278() {
		for (@Pc(18) Class1_Sub4_Sub6 local18 = (Class1_Sub4_Sub6) Static294.aClass16_36.method410(); local18 != null; local18 = (Class1_Sub4_Sub6) Static294.aClass16_36.method419()) {
			@Pc(23) Class17_Sub1_Sub2 local23 = local18.aClass17_Sub1_Sub2_1;
			if (Static242.anInt6745 != local23.aByte51 || Static5.anInt208 > local23.anInt3776) {
				local18.method5628();
				local23.method3460();
			} else if (local23.anInt3770 <= Static5.anInt208) {
				if (local23.anInt3763 > 0) {
					@Pc(68) Class17_Sub1_Sub1_Sub2 local68 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local23.anInt3763 - 1];
					if (local68 != null && local68.anInt5109 >= 0 && local68.anInt5109 < Static233.anInt5573 * 128 && local68.anInt5108 >= 0 && local68.anInt5108 < Static134.anInt2971 * 128) {
						local23.method3462(Static5.anInt208, local68.anInt5109, local68.anInt5108, Static94.method2022(local68.anInt5108, local68.anInt5109, local23.aByte51) - local23.anInt3778);
					}
				}
				if (local23.anInt3763 < 0) {
					@Pc(131) int local131 = -local23.anInt3763 - 1;
					@Pc(140) Class17_Sub1_Sub1_Sub1 local140;
					if (local131 == Static16.anInt527) {
						local140 = Static198.aClass17_Sub1_Sub1_Sub1_3;
					} else {
						local140 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local131];
					}
					if (local140 != null && local140.anInt5109 >= 0 && local140.anInt5109 < Static233.anInt5573 * 128 && local140.anInt5108 >= 0 && Static134.anInt2971 * 128 > local140.anInt5108) {
						local23.method3462(Static5.anInt208, local140.anInt5109, local140.anInt5108, Static94.method2022(local140.anInt5108, local140.anInt5109, local23.aByte51) - local23.anInt3778);
					}
				}
				local23.method3461(Static303.anInt2311);
				Static63.method4865(local23, true);
			}
		}
	}
}
