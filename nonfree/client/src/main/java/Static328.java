import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!td", name = "g", descriptor = "Lclient!al;")
	public static Class11 aClass11_3;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!us;")
	public static final Class234 aClass234_111 = new Class234(47, 5);

	@OriginalMember(owner = "client!td", name = "e", descriptor = "Lclient!dk;")
	public static final Class57 aClass57_82 = new Class57("cyan:", "blaugrün:", "cyan:", "cyan:");

	@OriginalMember(owner = "client!td", name = "f", descriptor = "[I")
	public static final int[] anIntArray606 = new int[32];

	@OriginalMember(owner = "client!td", name = "h", descriptor = "I")
	public static int anInt5561 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
	public static void method5017() {
		Static158.method2445(false);
		Static135.anInt2589 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static185.aByteArrayArray9.length; local14++) {
			if (Static91.anIntArray351[local14] != -1 && Static185.aByteArrayArray9[local14] == null) {
				Static185.aByteArrayArray9[local14] = Static179.aClass20_44.method253(0, Static91.anIntArray351[local14]);
				if (Static185.aByteArrayArray9[local14] == null) {
					local12 = false;
					Static135.anInt2589++;
				}
			}
			if (Static44.anIntArray80[local14] != -1 && Static361.aByteArrayArray22[local14] == null) {
				Static361.aByteArrayArray22[local14] = Static179.aClass20_44.method250(0, Static44.anIntArray80[local14], Static191.anIntArrayArray36[local14]);
				if (Static361.aByteArrayArray22[local14] == null) {
					Static135.anInt2589++;
					local12 = false;
				}
			}
			if (Static146.anIntArray291[local14] != -1 && Static49.aByteArrayArray20[local14] == null) {
				Static49.aByteArrayArray20[local14] = Static179.aClass20_44.method253(0, Static146.anIntArray291[local14]);
				if (Static49.aByteArrayArray20[local14] == null) {
					local12 = false;
					Static135.anInt2589++;
				}
			}
			if (Static220.anIntArray422[local14] != -1 && Static56.aByteArrayArray5[local14] == null) {
				Static56.aByteArrayArray5[local14] = Static179.aClass20_44.method253(0, Static220.anIntArray422[local14]);
				if (Static56.aByteArrayArray5[local14] == null) {
					Static135.anInt2589++;
					local12 = false;
				}
			}
			if (Static219.anIntArray421 != null && Static282.aByteArrayArray18[local14] == null && Static219.anIntArray421[local14] != -1) {
				Static282.aByteArrayArray18[local14] = Static179.aClass20_44.method250(0, Static219.anIntArray421[local14], Static191.anIntArrayArray36[local14]);
				if (Static282.aByteArrayArray18[local14] == null) {
					Static135.anInt2589++;
					local12 = false;
				}
			}
		}
		if (Static384.aClass169_3 == null) {
			if (Static281.aClass3_Sub7_Sub16_3 == null || !Static270.aClass20_92.method246(Static281.aClass3_Sub7_Sub16_3.aString66 + "_staticelements")) {
				Static384.aClass169_3 = new Class169(0);
			} else if (Static270.aClass20_92.method249(Static281.aClass3_Sub7_Sub16_3.aString66 + "_staticelements")) {
				Static384.aClass169_3 = Static102.method1693(Static241.aBoolean330, Static270.aClass20_92, Static281.aClass3_Sub7_Sub16_3.aString66 + "_staticelements");
			} else {
				local12 = false;
				Static135.anInt2589++;
			}
		}
		if (!local12) {
			Static241.anInt4239 = 1;
			return;
		}
		local12 = true;
		Static55.anInt1126 = 0;
		@Pc(270) int local270;
		@Pc(281) int local281;
		for (@Pc(251) int local251 = 0; local251 < Static185.aByteArrayArray9.length; local251++) {
			@Pc(257) byte[] local257 = Static361.aByteArrayArray22[local251];
			if (local257 != null) {
				local270 = (Static136.anIntArray273[local251] >> 8) * 64 - Static21.anInt265;
				local281 = (Static136.anIntArray273[local251] & 0xFF) * 64 - Static103.anInt2044;
				if (Static99.aBoolean149) {
					local281 = 10;
					local270 = 10;
				}
				local12 &= Static234.method3884(local281, local270, local257, Static44.anInt787, Static12.anInt161);
			}
			local257 = Static56.aByteArrayArray5[local251];
			if (local257 != null) {
				local270 = (Static136.anIntArray273[local251] >> 8) * 64 - Static21.anInt265;
				local281 = (Static136.anIntArray273[local251] & 0xFF) * 64 - Static103.anInt2044;
				if (Static99.aBoolean149) {
					local281 = 10;
					local270 = 10;
				}
				local12 &= Static234.method3884(local281, local270, local257, Static44.anInt787, Static12.anInt161);
			}
		}
		if (!local12) {
			Static241.anInt4239 = 2;
			return;
		}
		if (Static241.anInt4239 != 0) {
			Static289.method4519(Static140.aClass150_3, Static28.aClass57_13.method1122(Static66.anInt1307) + "<br>(100%)", true);
		}
		Static381.method5665();
		Static73.method1286();
		@Pc(377) boolean local377 = false;
		if (Static347.aClass155_9.method4938() && Static164.aClass154_Sub1_1.aBoolean471) {
			for (local270 = 0; local270 < Static185.aByteArrayArray9.length; local270++) {
				if (Static56.aByteArrayArray5[local270] != null || Static49.aByteArrayArray20[local270] != null) {
					local377 = true;
					break;
				}
			}
		}
		if (Static164.aClass154_Sub1_1.aBoolean459) {
			local270 = Static190.anIntArray380[Static22.anInt294];
		} else {
			local270 = Static12.anIntArray20[Static22.anInt294];
		}
		if (Static347.aClass155_9.method4928()) {
			local270++;
		}
		Static116.method1867(Static12.anInt161, Static44.anInt787, local270, local377, Static347.aClass155_9.method4943() > 0);
		for (local281 = 0; local281 < 4; local281++) {
			Static160.aClass67Array3[local281].method1324();
		}
		Static137.method1428();
		Static319.method4847(false);
		Static282.method4482();
		Static381.method5665();
		System.gc();
		Static158.method2445(true);
		Static91.method2645();
		Static73.aBoolean126 = Static368.anInt6173 >= 96;
		Static79.aBoolean130 = !Static164.aClass154_Sub1_1.aBoolean464;
		Static330.aBoolean433 = Static164.aClass154_Sub1_1.aBoolean471;
		Static290.aBoolean399 = Static164.aClass154_Sub1_1.aBoolean463;
		Static262.anInt1204 = Static164.aClass154_Sub1_1.anInt6057;
		Static46.anInt956 = Static164.aClass154_Sub1_1.method5400(Static2.anInt68) ? -1 : Static24.anInt332;
		Static41.aBoolean41 = Static2.anInt68 == 1 || Static164.aClass154_Sub1_1.aBoolean460;
		Static198.aClass117_Sub1_3 = new Class117_Sub1(4, Static12.anInt161, Static44.anInt787, false);
		if (!Static99.aBoolean149) {
			Static370.method5529(Static198.aClass117_Sub1_3, Static185.aByteArrayArray9);
		}
		if (Static99.aBoolean149) {
			Static72.method1215(Static185.aByteArrayArray9, Static198.aClass117_Sub1_3);
		}
		Static177.method2721(Static44.anInt787 >> 4, Static12.anInt161 >> 4);
		Static197.method3103();
		if (local377) {
			Static126.method2021(true);
			Static271.aClass117_Sub1_4 = new Class117_Sub1(1, Static12.anInt161, Static44.anInt787, true);
			if (!Static99.aBoolean149) {
				Static370.method5529(Static271.aClass117_Sub1_4, Static49.aByteArrayArray20);
				Static158.method2445(true);
			}
			if (Static99.aBoolean149) {
				Static72.method1215(Static49.aByteArrayArray20, Static271.aClass117_Sub1_4);
				Static158.method2445(true);
			}
			Static271.aClass117_Sub1_4.method2435(Static198.aClass117_Sub1_3.anIntArrayArrayArray13[0]);
			Static271.aClass117_Sub1_4.method2431(Static347.aClass155_9, null, null);
			Static126.method2021(false);
		}
		Static198.aClass117_Sub1_3.method2431(Static347.aClass155_9, Static160.aClass67Array3, local377 ? Static271.aClass117_Sub1_4.anIntArrayArrayArray13 : null);
		if (!Static99.aBoolean149) {
			Static158.method2445(true);
			Static50.method937(Static198.aClass117_Sub1_3, Static361.aByteArrayArray22);
			if (Static282.aByteArrayArray18 != null) {
				Static357.method5343();
			}
		}
		if (Static99.aBoolean149) {
			Static158.method2445(true);
			Static104.method1721(Static361.aByteArrayArray22, Static198.aClass117_Sub1_3);
		}
		Static73.method1286();
		Static158.method2445(true);
		Static198.aClass117_Sub1_3.method2427(Static347.aClass155_9, local377 ? Static25.aClass7Array1[0] : null, null);
		Static198.aClass117_Sub1_3.method2447(Static347.aClass155_9);
		Static158.method2445(true);
		if (local377) {
			Static126.method2021(true);
			Static158.method2445(true);
			if (!Static99.aBoolean149) {
				Static50.method937(Static271.aClass117_Sub1_4, Static56.aByteArrayArray5);
			}
			if (Static99.aBoolean149) {
				Static104.method1721(Static56.aByteArrayArray5, Static271.aClass117_Sub1_4);
			}
			Static73.method1286();
			Static158.method2445(true);
			Static271.aClass117_Sub1_4.method2427(Static347.aClass155_9, null, Static89.aClass7Array4[0]);
			Static271.aClass117_Sub1_4.method2447(Static347.aClass155_9);
			Static158.method2445(true);
			Static126.method2021(false);
		}
		Static135.method2133();
		@Pc(692) int local692 = Static198.aClass117_Sub1_3.anInt2851;
		if (local692 > Static363.anInt6170) {
			local692 = Static363.anInt6170;
		}
		if (Static363.anInt6170 - 1 > local692) {
			local692 = Static363.anInt6170 - 1;
		}
		if (Static164.aClass154_Sub1_1.method5400(Static2.anInt68)) {
			Static71.method1187(0);
		} else {
			Static71.method1187(local692);
		}
		@Pc(727) int local727;
		@Pc(731) int local731;
		for (@Pc(723) int local723 = 0; local723 < 4; local723++) {
			for (local727 = 0; local727 < Static12.anInt161; local727++) {
				for (local731 = 0; local731 < Static44.anInt787; local731++) {
					Static192.method3056(local727, local723, local731);
				}
			}
		}
		Static326.method5013();
		Static381.method5665();
		Static133.method2097();
		Static73.method1286();
		Static30.aBoolean22 = false;
		Static282.method4478();
		if (Static34.aFrame1 != null && Static12.aClass145_2 != null && Static348.anInt4439 == 25) {
			Static229.method3783(Static234.aClass244_58);
			Static23.aClass3_Sub5_Sub1_1.method2782(1057001181);
		}
		if (!Static99.aBoolean149) {
			local727 = (Static1.anInt10 - (Static12.anInt161 >> 4)) / 8;
			local731 = (Static1.anInt10 + (Static12.anInt161 >> 4)) / 8;
			@Pc(812) int local812 = (Static336.anInt2336 - (Static44.anInt787 >> 4)) / 8;
			@Pc(820) int local820 = ((Static44.anInt787 >> 4) + Static336.anInt2336) / 8;
			for (@Pc(824) int local824 = local727 - 1; local824 <= local731 + 1; local824++) {
				for (@Pc(830) int local830 = local812 - 1; local830 <= local820 + 1; local830++) {
					if (local824 < local727 || local824 > local731 || local812 > local830 || local820 < local830) {
						Static179.aClass20_44.method245("m" + local824 + "_" + local830);
						Static179.aClass20_44.method245("l" + local824 + "_" + local830);
					}
				}
			}
		}
		if (Static348.anInt4439 == 28) {
			Static310.method4763(10);
		} else {
			Static310.method4763(30);
			if (Static12.aClass145_2 != null) {
				Static229.method3783(Static75.aClass244_21);
			}
		}
		Static376.method5590();
		Static381.method5665();
		Static194.method3071();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(II)I")
	public static int method5019(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static231.aByteArrayArray14 == null ? 0 : Static231.aByteArrayArray14[arg0][arg1] & 0xFF;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Lclient!bd;")
	public static Class23_Sub1 method5020() {
		Static147.anInt2723 = 0;
		return Static325.method4997();
	}
}
