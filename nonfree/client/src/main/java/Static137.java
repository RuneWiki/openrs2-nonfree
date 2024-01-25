import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static137 {

	@OriginalMember(owner = "client!ek", name = "w", descriptor = "Ljava/lang/Object;")
	public static Object anObject4;

	@OriginalMember(owner = "client!ek", name = "y", descriptor = "Lclient!mea;")
	public static Class230 aClass230_1;

	@OriginalMember(owner = "client!ek", name = "A", descriptor = "Lclient!rfa;")
	public static Class299 aClass299_1;

	@OriginalMember(owner = "client!ek", name = "C", descriptor = "Z")
	public static boolean aBoolean207 = true;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V")
	public static void method2191() {
		Static221.method6307(false);
		Static536.anInt9243 = 0;
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < Static513.aByteArrayArray41.length; local14++) {
			if (Static66.anIntArray112[local14] != -1 && Static513.aByteArrayArray41[local14] == null) {
				Static513.aByteArrayArray41[local14] = Static227.aClass386_126.method9196(0, Static66.anIntArray112[local14]);
				if (Static513.aByteArrayArray41[local14] == null) {
					local12 = false;
					Static536.anInt9243++;
				}
			}
			if (Static521.anIntArray667[local14] != -1 && Static78.aByteArrayArray13[local14] == null) {
				Static78.aByteArrayArray13[local14] = Static227.aClass386_126.method9212(Static521.anIntArray667[local14], 0, Static659.anIntArrayArray61[local14]);
				if (Static78.aByteArrayArray13[local14] == null) {
					Static536.anInt9243++;
					local12 = false;
				}
			}
			if (Static166.anIntArray272[local14] != -1 && Static78.aByteArrayArray14[local14] == null) {
				Static78.aByteArrayArray14[local14] = Static227.aClass386_126.method9196(0, Static166.anIntArray272[local14]);
				if (Static78.aByteArrayArray14[local14] == null) {
					Static536.anInt9243++;
					local12 = false;
				}
			}
			if (Static662.anIntArray817[local14] != -1 && Static582.aByteArrayArray49[local14] == null) {
				Static582.aByteArrayArray49[local14] = Static227.aClass386_126.method9196(0, Static662.anIntArray817[local14]);
				if (Static582.aByteArrayArray49[local14] == null) {
					local12 = false;
					Static536.anInt9243++;
				}
			}
			if (Static384.anIntArray516 != null && Static71.aByteArrayArray11[local14] == null && Static384.anIntArray516[local14] != -1) {
				Static71.aByteArrayArray11[local14] = Static227.aClass386_126.method9212(Static384.anIntArray516[local14], 0, Static659.anIntArrayArray61[local14]);
				if (Static71.aByteArrayArray11[local14] == null) {
					local12 = false;
					Static536.anInt9243++;
				}
			}
		}
		if (Static628.aClass294_3 == null) {
			if (Static109.aClass14_Sub3_Sub16_1 == null || !Static298.aClass386_71.method9209(Static109.aClass14_Sub3_Sub16_1.aString92 + "_staticelements")) {
				Static628.aClass294_3 = new Class294(0);
			} else if (Static298.aClass386_71.method9194(Static109.aClass14_Sub3_Sub16_1.aString92 + "_staticelements")) {
				Static628.aClass294_3 = Static262.method3787(Static298.aClass386_71, Static109.aClass14_Sub3_Sub16_1.aString92 + "_staticelements", Static377.aBoolean495);
			} else {
				local12 = false;
				Static536.anInt9243++;
			}
		}
		if (!local12) {
			Static101.anInt2153 = 1;
			return;
		}
		Static55.anInt1383 = 0;
		local12 = true;
		@Pc(271) int local271;
		@Pc(281) int local281;
		for (@Pc(252) int local252 = 0; local252 < Static513.aByteArrayArray41.length; local252++) {
			@Pc(258) byte[] local258 = Static78.aByteArrayArray13[local252];
			if (local258 != null) {
				local271 = (Static332.anIntArray455[local252] >> 8) * 64 - Static329.anInt6225;
				local281 = (Static332.anIntArray455[local252] & 0xFF) * 64 - Static202.anInt3755;
				if (Static74.anInt1617 != 0) {
					local281 = 10;
					local271 = 10;
				}
				local12 &= Static144.method2295(local271, local281, local258, Static445.anInt6140, Static26.anInt462);
			}
			local258 = Static582.aByteArrayArray49[local252];
			if (local258 != null) {
				local271 = (Static332.anIntArray455[local252] >> 8) * 64 - Static329.anInt6225;
				local281 = (Static332.anIntArray455[local252] & 0xFF) * 64 - Static202.anInt3755;
				if (Static74.anInt1617 != 0) {
					local271 = 10;
					local281 = 10;
				}
				local12 &= Static144.method2295(local271, local281, local258, Static445.anInt6140, Static26.anInt462);
			}
		}
		if (!local12) {
			Static101.anInt2153 = 2;
			return;
		}
		if (Static101.anInt2153 != 0) {
			Static88.method8992(Static242.aClass38_5, true, Static677.aClass137_47, Static514.aClass303_14.method7473(Static232.anInt4258) + "<br>(100%)", Static586.aClass158_12);
		}
		Static299.method4404();
		Static242.method3619();
		Static135.method2159();
		@Pc(388) boolean local388 = false;
		if (Static677.aClass137_47.method7883() && Static56.aClass14_Sub22_5.aClass21_Sub8_1.method2132() == 2) {
			for (local271 = 0; local271 < Static513.aByteArrayArray41.length; local271++) {
				if (Static582.aByteArrayArray49[local271] != null || Static78.aByteArrayArray14[local271] != null) {
					local388 = true;
					break;
				}
			}
		}
		if (Static56.aClass14_Sub22_5.aClass21_Sub17_1.method5452() == 1) {
			local271 = Static141.anIntArray133[Static169.anInt3333];
		} else {
			local271 = Static429.anIntArray351[Static169.anInt3333];
		}
		if (Static677.aClass137_47.method7924()) {
			local271++;
		}
		Static447.method8525(Static677.aClass137_47, Static490.anInt8758, Static26.anInt462, Static445.anInt6140, local271, local388, Static677.aClass137_47.method7937() > 0);
		Static29.method658(Static465.anInt8178);
		if (Static465.anInt8178 == 0) {
			Static263.method3850((Class38) null);
		} else {
			Static263.method3850(Static294.aClass38_9);
		}
		for (local281 = 0; local281 < 4; local281++) {
			Static226.aClass226Array3[local281].method5368();
		}
		Static144.method2296();
		Static330.method5182(false);
		Static451.method6547();
		Static378.aClass153_1 = null;
		Static481.aBoolean620 = false;
		Static299.method4404();
		System.gc();
		Static221.method6307(true);
		Static228.method3478();
		Static385.anInt7058 = Static56.aClass14_Sub22_5.aClass21_Sub1_1.method459();
		Static162.aBoolean758 = Static189.anInt3553 >= 96;
		Static196.aBoolean276 = Static56.aClass14_Sub22_5.aClass21_Sub8_1.method2132() == 2;
		Static70.aBoolean121 = Static56.aClass14_Sub22_5.aClass21_Sub18_1.method5561() == 1;
		Static360.anInt6730 = Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() == 1 ? -1 : Static673.anInt11161;
		Static519.aBoolean634 = Static56.aClass14_Sub22_5.aClass21_Sub22_1.method7709() == 1;
		Static635.aBoolean732 = Static56.aClass14_Sub22_5.aClass21_Sub28_1.method9104() == 1;
		Static143.aClass49_Sub1_1 = new Class49_Sub1(4, Static26.anInt462, Static445.anInt6140, false);
		if (Static74.anInt1617 == 0) {
			Static32.method7754(Static513.aByteArrayArray41, Static143.aClass49_Sub1_1);
		} else {
			Static78.method1472(Static143.aClass49_Sub1_1, Static513.aByteArrayArray41);
		}
		Static133.method2138(Static445.anInt6140 >> 4, Static26.anInt462 >> 4);
		Static529.method7862();
		if (local388) {
			Static357.method5408(true);
			Static236.aClass49_Sub1_2 = new Class49_Sub1(1, Static26.anInt462, Static445.anInt6140, true);
			if (Static74.anInt1617 == 0) {
				Static32.method7754(Static78.aByteArrayArray14, Static236.aClass49_Sub1_2);
				Static221.method6307(true);
			} else {
				Static78.method1472(Static236.aClass49_Sub1_2, Static78.aByteArrayArray14);
				Static221.method6307(true);
			}
			Static236.aClass49_Sub1_2.method7505(Static143.aClass49_Sub1_1.anIntArrayArrayArray19[0]);
			Static236.aClass49_Sub1_2.method7510(Static677.aClass137_47, (int[][][]) null, (Class226[]) null);
			Static357.method5408(false);
		}
		Static143.aClass49_Sub1_1.method7510(Static677.aClass137_47, local388 ? Static236.aClass49_Sub1_2.anIntArrayArrayArray19 : null, Static226.aClass226Array3);
		if (Static74.anInt1617 == 0) {
			Static221.method6307(true);
			Static62.method7513(Static143.aClass49_Sub1_1, Static78.aByteArrayArray13);
			if (Static71.aByteArrayArray11 != null) {
				Static572.method8202();
			}
		} else {
			Static221.method6307(true);
			Static151.method2384(Static78.aByteArrayArray13, Static143.aClass49_Sub1_1);
		}
		Static242.method3619();
		if (Static189.anInt3553 < 96) {
			Static543.method7678();
		}
		Static221.method6307(true);
		Static143.aClass49_Sub1_1.method7512(Static677.aClass137_47, (Class51) null, local388 ? Static473.aClass51Array2[0] : null);
		Static143.aClass49_Sub1_1.method7525(Static677.aClass137_47, false);
		Static221.method6307(true);
		if (local388) {
			Static357.method5408(true);
			Static221.method6307(true);
			if (Static74.anInt1617 == 0) {
				Static62.method7513(Static236.aClass49_Sub1_2, Static582.aByteArrayArray49);
			} else {
				Static151.method2384(Static582.aByteArrayArray49, Static236.aClass49_Sub1_2);
			}
			Static242.method3619();
			Static221.method6307(true);
			Static236.aClass49_Sub1_2.method7512(Static677.aClass137_47, Static343.aClass51Array1[0], (Class51) null);
			Static236.aClass49_Sub1_2.method7525(Static677.aClass137_47, true);
			Static221.method6307(true);
			Static357.method5408(false);
		}
		Static561.method8113();
		@Pc(795) int local795 = Static143.aClass49_Sub1_1.anInt9098;
		if (Static586.anInt10060 < local795) {
			local795 = Static586.anInt10060;
		}
		if (Static586.anInt10060 - 1 > local795) {
			local795 = Static586.anInt10060 - 1;
		}
		if (Static56.aClass14_Sub22_5.aClass21_Sub13_2.method4396() == 0) {
			Static444.method6499(local795);
		} else {
			Static444.method6499(0);
		}
		@Pc(833) int local833;
		@Pc(837) int local837;
		for (@Pc(829) int local829 = 0; local829 < 4; local829++) {
			for (local833 = 0; local833 < Static26.anInt462; local833++) {
				for (local837 = 0; local837 < Static445.anInt6140; local837++) {
					Static236.method3563(local833, local829, local837);
				}
			}
		}
		Static514.method7474();
		Static299.method4404();
		Static309.method1666();
		Static242.method3619();
		Static277.method4032();
		@Pc(888) Class14_Sub19 local888;
		if (Static339.aFrame2 != null && Static258.aClass97_2 != null && Static430.anInt7691 == 11) {
			local888 = Static286.method4081(Static205.aClass394_1, Static595.aClass100_128);
			local888.aClass14_Sub29_Sub1_1.method5861(1057001181);
			Static576.method8234(local888);
		}
		if (Static74.anInt1617 == 0) {
			local833 = (Static100.anInt2131 - (Static26.anInt462 >> 4)) / 8;
			local837 = (Static100.anInt2131 + (Static26.anInt462 >> 4)) / 8;
			@Pc(926) int local926 = (Static403.anInt7392 - (Static445.anInt6140 >> 4)) / 8;
			@Pc(934) int local934 = ((Static445.anInt6140 >> 4) + Static403.anInt7392) / 8;
			for (@Pc(938) int local938 = local833 - 1; local938 <= local837 + 1; local938++) {
				for (@Pc(944) int local944 = local926 - 1; local944 <= local934 + 1; local944++) {
					if (local938 < local833 || local938 > local837 || local926 > local944 || local944 > local934) {
						Static227.aClass386_126.method9203("m" + local938 + "_" + local944);
						Static227.aClass386_126.method9203("l" + local938 + "_" + local944);
					}
				}
			}
		}
		if (Static430.anInt7691 == 4) {
			Static67.method1345(3);
		} else if (Static430.anInt7691 == 8) {
			Static67.method1345(7);
		} else {
			Static67.method1345(10);
			if (Static258.aClass97_2 != null) {
				local888 = Static286.method4081(Static205.aClass394_1, Static526.aClass100_112);
				Static576.method8234(local888);
			}
		}
		Static223.method3456();
		Static299.method4404();
		Static38.method849();
		Static17.aBoolean15 = true;
		if (Static478.aBoolean579) {
			Static466.method6830("Took: " + (Static521.method7499() - Static421.aLong210) + "ms");
			Static478.aBoolean579 = false;
		}
	}
}
