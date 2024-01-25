import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
	public static int anInt3413 = -1;

	@OriginalMember(owner = "client!jc", name = "m", descriptor = "Lclient!of;")
	public static final Class174 aClass174_102 = new Class174("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

	@OriginalMember(owner = "client!jc", name = "q", descriptor = "[I")
	public static final int[] anIntArray213 = new int[14];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ub;Z)V")
	public static void method2925(@OriginalArg(0) Class1_Sub2_Sub6_Sub1 arg0) {
		for (@Pc(15) Class3_Sub29 local15 = (Class3_Sub29) Static163.aClass193_68.method4519(); local15 != null; local15 = (Class3_Sub29) Static163.aClass193_68.method4525()) {
			if (arg0 == local15.aClass1_Sub2_Sub6_Sub1_1) {
				if (local15.aClass3_Sub1_Sub3_2 != null) {
					Static440.aClass3_Sub1_Sub2_2.method5098(local15.aClass3_Sub1_Sub3_2);
					local15.aClass3_Sub1_Sub3_2 = null;
				}
				local15.method6288();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
	public static void method2926() {
		Static412.method5682(false);
		Static266.anInt4438 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static127.aByteArrayArray11.length; local14++) {
			if (Static95.anIntArray81[local14] != -1 && Static127.aByteArrayArray11[local14] == null) {
				Static127.aByteArrayArray11[local14] = Static92.aClass250_31.method5806(Static95.anIntArray81[local14], 0);
				if (Static127.aByteArrayArray11[local14] == null) {
					local12 = false;
					Static266.anInt4438++;
				}
			}
			if (Static417.anIntArray447[local14] != -1 && Static152.aByteArrayArray33[local14] == null) {
				Static152.aByteArrayArray33[local14] = Static92.aClass250_31.method5821(Static60.anIntArrayArray8[local14], Static417.anIntArray447[local14], 0);
				if (Static152.aByteArrayArray33[local14] == null) {
					Static266.anInt4438++;
					local12 = false;
				}
			}
			if (Static165.anIntArray116[local14] != -1 && Static457.aByteArrayArray34[local14] == null) {
				Static457.aByteArrayArray34[local14] = Static92.aClass250_31.method5806(Static165.anIntArray116[local14], 0);
				if (Static457.aByteArrayArray34[local14] == null) {
					Static266.anInt4438++;
					local12 = false;
				}
			}
			if (Static73.anIntArray70[local14] != -1 && Static194.aByteArrayArray14[local14] == null) {
				Static194.aByteArrayArray14[local14] = Static92.aClass250_31.method5806(Static73.anIntArray70[local14], 0);
				if (Static194.aByteArrayArray14[local14] == null) {
					Static266.anInt4438++;
					local12 = false;
				}
			}
			if (Static192.anIntArray217 != null && Static298.aByteArrayArray20[local14] == null && Static192.anIntArray217[local14] != -1) {
				Static298.aByteArrayArray20[local14] = Static92.aClass250_31.method5821(Static60.anIntArrayArray8[local14], Static192.anIntArray217[local14], 0);
				if (Static298.aByteArrayArray20[local14] == null) {
					Static266.anInt4438++;
					local12 = false;
				}
			}
		}
		if (Static329.aClass118_3 == null) {
			if (Static162.aClass3_Sub3_Sub13_3 == null || !Static171.aClass250_49.method5811(Static162.aClass3_Sub3_Sub13_3.aString44 + "_staticelements")) {
				Static329.aClass118_3 = new Class118(0);
			} else if (Static171.aClass250_49.method5810(Static162.aClass3_Sub3_Sub13_3.aString44 + "_staticelements")) {
				Static329.aClass118_3 = Static32.method582(Static171.aClass250_49, Static182.aBoolean253, Static162.aClass3_Sub3_Sub13_3.aString44 + "_staticelements");
			} else {
				Static266.anInt4438++;
				local12 = false;
			}
		}
		if (!local12) {
			Static188.anInt3447 = 1;
			return;
		}
		local12 = true;
		Static430.anInt7238 = 0;
		@Pc(275) int local275;
		@Pc(285) int local285;
		for (@Pc(256) int local256 = 0; local256 < Static127.aByteArrayArray11.length; local256++) {
			@Pc(262) byte[] local262 = Static152.aByteArrayArray33[local256];
			if (local262 != null) {
				local275 = (Static127.anIntArray115[local256] >> 8) * 64 - Static59.anInt1127;
				local285 = (Static127.anIntArray115[local256] & 0xFF) * 64 - Static49.anInt873;
				if (Static337.anInt5635 != 0) {
					local275 = 10;
					local285 = 10;
				}
				local12 &= Static452.method6152(local285, Static291.anInt5062, local275, local262, Static373.anInt6324);
			}
			local262 = Static194.aByteArrayArray14[local256];
			if (local262 != null) {
				local275 = (Static127.anIntArray115[local256] >> 8) * 64 - Static59.anInt1127;
				local285 = (Static127.anIntArray115[local256] & 0xFF) * 64 - Static49.anInt873;
				if (Static337.anInt5635 != 0) {
					local275 = 10;
					local285 = 10;
				}
				local12 &= Static452.method6152(local285, Static291.anInt5062, local275, local262, Static373.anInt6324);
			}
		}
		if (!local12) {
			Static188.anInt3447 = 2;
			return;
		}
		if (Static188.anInt3447 != 0) {
			Static275.method3805(Static163.aClass174_199.method4208(Static300.anInt5192) + "<br>(100%)", true, Static244.aClass18_1);
		}
		Static44.method856();
		Static342.method4772();
		@Pc(386) boolean local386 = false;
		if (Static413.aClass167_11.method5962() && Static39.aClass79_Sub1_1.aBoolean156) {
			for (local275 = 0; local275 < Static127.aByteArrayArray11.length; local275++) {
				if (Static194.aByteArrayArray14[local275] != null || Static457.aByteArrayArray34[local275] != null) {
					local386 = true;
					break;
				}
			}
		}
		if (Static39.aClass79_Sub1_1.aBoolean159) {
			local275 = Static107.anIntArray93[Static93.anInt1702];
		} else {
			local275 = Static440.anIntArray490[Static93.anInt1702];
		}
		if (Static413.aClass167_11.method6028()) {
			local275++;
		}
		Static87.method1537(Static373.anInt6324, Static291.anInt5062, local275, local386, Static413.aClass167_11.method5986() > 0);
		for (local285 = 0; local285 < 4; local285++) {
			Static250.aClass128Array1[local285].method3177();
		}
		Static329.method4566();
		Static273.method3790(false);
		Static163.method5701();
		Static460.aClass64_1 = null;
		Static44.method856();
		System.gc();
		Static412.method5682(true);
		Static437.method5912();
		Static84.anInt6074 = Static39.aClass79_Sub1_1.method1942(Static402.anInt6656);
		Static122.aBoolean165 = Static39.aClass79_Sub1_1.aBoolean156;
		Static182.aBoolean254 = Static61.anInt1155 >= 96;
		Static192.aBoolean268 = Static39.aClass79_Sub1_1.method1939(Static402.anInt6656);
		Static291.aBoolean370 = !Static39.aClass79_Sub1_1.aBoolean154;
		Static417.anInt7005 = Static39.aClass79_Sub1_1.method1948(Static402.anInt6656) ? -1 : Static436.anInt7298;
		Static376.aBoolean430 = Static402.anInt6656 == 1 || Static39.aClass79_Sub1_1.aBoolean149;
		Static303.aBoolean380 = Static39.aClass79_Sub1_1.aBoolean161;
		Static36.aClass22_Sub1_2 = new Class22_Sub1(4, Static373.anInt6324, Static291.anInt5062, false);
		if (Static337.anInt5635 == 0) {
			Static131.method2036(Static127.aByteArrayArray11, Static36.aClass22_Sub1_2);
		} else {
			Static155.method2397(Static36.aClass22_Sub1_2, Static127.aByteArrayArray11);
		}
		Static100.method1682(Static291.anInt5062 >> 4, Static373.anInt6324 >> 4);
		Static52.method983();
		if (local386) {
			Static234.method3420(true);
			Static12.aClass22_Sub1_1 = new Class22_Sub1(1, Static373.anInt6324, Static291.anInt5062, true);
			if (Static337.anInt5635 == 0) {
				Static131.method2036(Static457.aByteArrayArray34, Static12.aClass22_Sub1_1);
				Static412.method5682(true);
			} else {
				Static155.method2397(Static12.aClass22_Sub1_1, Static457.aByteArrayArray34);
				Static412.method5682(true);
			}
			Static12.aClass22_Sub1_1.method4777(Static36.aClass22_Sub1_2.anIntArrayArrayArray11[0]);
			Static12.aClass22_Sub1_1.method4783(Static413.aClass167_11, null, null);
			Static234.method3420(false);
		}
		Static36.aClass22_Sub1_2.method4783(Static413.aClass167_11, Static250.aClass128Array1, local386 ? Static12.aClass22_Sub1_1.anIntArrayArrayArray11 : null);
		if (Static337.anInt5635 == 0) {
			Static412.method5682(true);
			Static76.method1398(Static36.aClass22_Sub1_2, Static152.aByteArrayArray33);
			if (Static298.aByteArrayArray20 != null) {
				Static11.method196();
			}
		} else {
			Static412.method5682(true);
			Static33.method586(Static152.aByteArrayArray33, Static36.aClass22_Sub1_2);
		}
		Static342.method4772();
		Static412.method5682(true);
		Static36.aClass22_Sub1_2.method4781(local386 ? Static349.aClass55Array3[0] : null, null, Static413.aClass167_11);
		Static36.aClass22_Sub1_2.method4801(Static413.aClass167_11);
		Static412.method5682(true);
		if (local386) {
			Static234.method3420(true);
			Static412.method5682(true);
			if (Static337.anInt5635 == 0) {
				Static76.method1398(Static12.aClass22_Sub1_1, Static194.aByteArrayArray14);
			} else {
				Static33.method586(Static194.aByteArrayArray14, Static12.aClass22_Sub1_1);
			}
			Static342.method4772();
			Static412.method5682(true);
			Static12.aClass22_Sub1_1.method4781(null, Static182.aClass55Array2[0], Static413.aClass167_11);
			Static12.aClass22_Sub1_1.method4801(Static413.aClass167_11);
			Static412.method5682(true);
			Static234.method3420(false);
		}
		Static333.method4603();
		@Pc(715) int local715 = Static36.aClass22_Sub1_2.anInt5780;
		if (local715 > Static276.anInt4606) {
			local715 = Static276.anInt4606;
		}
		if (local715 < Static276.anInt4606 - 1) {
			local715 = Static276.anInt4606 - 1;
		}
		if (Static39.aClass79_Sub1_1.method1948(Static402.anInt6656)) {
			Static461.method6270(0);
		} else {
			Static461.method6270(local715);
		}
		@Pc(750) int local750;
		@Pc(754) int local754;
		for (@Pc(746) int local746 = 0; local746 < 4; local746++) {
			for (local750 = 0; local750 < Static373.anInt6324; local750++) {
				for (local754 = 0; local754 < Static291.anInt5062; local754++) {
					Static158.method2487(local746, local750, local754);
				}
			}
		}
		Static53.method998();
		Static44.method856();
		Static121.method1945();
		Static342.method4772();
		Static229.aBoolean281 = false;
		Static331.method6001();
		if (Static456.aFrame2 != null && Static328.aClass116_1 != null && Static345.anInt5823 == 10) {
			Static307.method4633(Static73.aClass163_44);
			Static243.aClass3_Sub25_Sub1_7.method4082(1057001181);
		}
		if (Static337.anInt5635 == 0) {
			local750 = (Static37.anInt629 - (Static373.anInt6324 >> 4)) / 8;
			local754 = ((Static373.anInt6324 >> 4) + Static37.anInt629) / 8;
			@Pc(844) int local844 = (Static149.anInt2745 - (Static291.anInt5062 >> 4)) / 8;
			@Pc(853) int local853 = (Static149.anInt2745 + (Static291.anInt5062 >> 4)) / 8;
			for (@Pc(857) int local857 = local750 - 1; local857 <= local754 + 1; local857++) {
				for (@Pc(863) int local863 = local844 - 1; local863 <= local853 + 1; local863++) {
					if (local750 > local857 || local754 < local857 || local844 > local863 || local863 > local853) {
						Static92.aClass250_31.method5799("m" + local857 + "_" + local863);
						Static92.aClass250_31.method5799("l" + local857 + "_" + local863);
					}
				}
			}
		}
		if (Static345.anInt5823 == 3) {
			Static393.method5432(2);
		} else if (Static345.anInt5823 == 7) {
			Static393.method5432(6);
		} else {
			Static393.method5432(9);
			if (Static328.aClass116_1 != null) {
				Static307.method4633(Static218.aClass163_193);
			}
		}
		Static440.method5941();
		Static44.method856();
		Static152.method6186();
	}
}
