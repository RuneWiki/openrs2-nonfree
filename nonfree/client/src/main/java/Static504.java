import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static504 {

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(III)Z")
	public static boolean method8343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static308.method4733(arg0, arg1) | (arg1 & 0x70000) != 0 || Static344.method5202(arg0, arg1);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(I)I")
	public static int method8344() {
		@Pc(8) int local8;
		if (Static227.aClass3_Sub15_11.aClass17_Sub15_1.method5148() == 0) {
			for (local8 = 0; local8 < Static29.anInt896; local8++) {
				if (Static48.anInterface18Array1[local8].method5676() == 's' || Static48.anInterface18Array1[local8].method5676() == 'S') {
					Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub15_1, 1);
					Static319.aBoolean462 = true;
					break;
				}
			}
		}
		@Pc(63) int local63;
		if (Static627.aClass370_3 == Static137.aClass370_1) {
			@Pc(54) Runtime local54 = Runtime.getRuntime();
			local63 = (int) ((local54.totalMemory() - local54.freeMemory()) / 1024L);
			@Pc(66) long local66 = Static131.method2268();
			if (Static134.aLong70 == 0L) {
				Static134.aLong70 = local66;
			}
			if (local63 > 16384 && local66 - Static134.aLong70 < 5000L) {
				if (local66 - Static170.aLong88 > 1000L) {
					System.gc();
					Static170.aLong88 = local66;
				}
				return 0;
			}
		}
		if (Static627.aClass370_4 == Static137.aClass370_1) {
			if (Static448.aClass317_1 == null) {
				Static448.aClass317_1 = new Class317(Static600.aClass366_3, Static296.aClass233_6, Static552.aBigInteger6, Static239.aBigInteger2);
			}
			if (!Static448.aClass317_1.method7440()) {
				return 0;
			}
			Static627.method8272(true, 0, (String) null);
			Static519.aBoolean656 = !Static397.method5727();
			Static645.aClass143_142 = Static358.method5377(Static519.aBoolean656 ? 34 : 32, false, 1);
			Static427.aClass143_104 = Static358.method5377(33, false, 1);
			Static41.aClass143_11 = Static358.method5377(13, false, 1);
		}
		@Pc(155) boolean local155;
		if (Static627.aClass370_5 == Static137.aClass370_1) {
			local155 = Static427.aClass143_104.method3114();
			local63 = Static601.aClass89_Sub1Array2[33].method2159();
			local63 += Static601.aClass89_Sub1Array2[Static519.aBoolean656 ? 34 : 32].method2159();
			local63 += Static601.aClass89_Sub1Array2[13].method2159();
			local63 += local155 ? 100 : Static427.aClass143_104.method3115();
			if (local63 != 400) {
				return local63 / 4;
			}
			Static419.anInt7067 = Static645.aClass143_142.method3132();
			Static166.anInt3024 = Static427.aClass143_104.method3132();
			Static173.method2915(Static645.aClass143_142);
			@Pc(216) int local216 = Static227.aClass3_Sub15_11.aClass17_Sub18_1.method5964();
			Static577.aClass235_1 = new Class235(Static102.aClass181_38, Static319.anInt5939, Static427.aClass143_104);
			@Pc(228) int[] local228 = Static577.aClass235_1.method5383(local216);
			if (local228.length == 0) {
				local228 = Static577.aClass235_1.method5383(0);
			}
			@Pc(242) Class156 local242 = new Class156(Static645.aClass143_142, Static41.aClass143_11);
			if (local228.length > 0) {
				Static62.anInterface27Array1 = new Interface27[local228.length];
				for (@Pc(251) int local251 = 0; local251 < Static62.anInterface27Array1.length; local251++) {
					Static62.anInterface27Array1[local251] = new Class343(Static577.aClass235_1.method5382(local228[local251]), local242);
				}
			}
		}
		if (Static137.aClass370_1 == Static627.aClass370_6) {
			Static621.method8227(Static611.method8063(), Static41.aClass143_11, Static645.aClass143_142);
		}
		if (Static627.aClass370_7 == Static137.aClass370_1) {
			local8 = Static178.method2937();
			local63 = Static317.method4993();
			if (local63 > local8) {
				return local8 * 100 / local63;
			}
		}
		if (Static627.aClass370_8 == Static137.aClass370_1) {
			if (Static62.anInterface27Array1 != null && Static62.anInterface27Array1.length > 0) {
				if (Static62.anInterface27Array1[0].method7909() < 100) {
					return 0;
				}
				if (Static62.anInterface27Array1.length > 1 && Static577.aClass235_1.method5379() && Static62.anInterface27Array1[1].method7909() < 100) {
					return 0;
				}
			}
			Static255.method4046(Static582.aClass16_12);
			Static254.method4040(Static582.aClass16_12);
			Static482.method6863(1);
		}
		if (Static627.aClass370_9 == Static137.aClass370_1) {
			for (local8 = 0; local8 < 4; local8++) {
				Static27.aClass198Array1[local8] = Static48.method1277(Static251.anInt4680, Static406.anInt6924);
			}
		}
		if (Static137.aClass370_1 == Static627.aClass370_10) {
			Static235.aClass143_57 = Static358.method5377(8, false, 1);
			Static566.aClass143_72 = Static358.method5377(0, false, 1);
			Static565.aClass143_117 = Static358.method5377(1, false, 1);
			Static346.aClass143_87 = Static358.method5377(2, false, 1);
			Static105.aClass143_24 = Static358.method5377(3, false, 1);
			Static571.aClass143_129 = Static358.method5377(4, false, 1);
			Static673.aClass143_110 = Static358.method5377(5, true, 1);
			Static510.aClass143_118 = Static358.method5377(6, true, 1);
			Static21.aClass143_5 = Static358.method5377(7, false, 1);
			Static285.aClass143_77 = Static358.method5377(9, false, 1);
			Static264.aClass143_62 = Static358.method5377(10, false, 1);
			Static22.aClass143_6 = Static358.method5377(11, false, 1);
			Static560.aClass143_128 = Static358.method5377(12, false, 1);
			Static375.aClass143_92 = Static358.method5377(14, false, 1);
			Static251.aClass143_60 = Static358.method5377(15, false, 1);
			Static423.aClass143_103 = Static358.method5377(16, false, 1);
			Static126.aClass143_32 = Static358.method5377(17, false, 1);
			Static471.aClass143_144 = Static358.method5377(18, false, 1);
			Static160.aClass143_39 = Static358.method5377(19, false, 1);
			Static169.aClass143_42 = Static358.method5377(20, false, 1);
			Static272.aClass143_64 = Static358.method5377(21, false, 1);
			Static167.aClass143_40 = Static358.method5377(22, false, 1);
			Static390.aClass143_97 = Static358.method5377(23, true, 1);
			Static168.aClass143_41 = Static358.method5377(24, false, 1);
			Static409.aClass143_96 = Static358.method5377(25, false, 1);
			Static105.aClass143_25 = Static358.method5377(26, true, 1);
			Static535.aClass143_121 = Static358.method5377(27, false, 1);
			Static176.aClass143_45 = Static358.method5377(28, true, 1);
			Static624.aClass143_133 = Static358.method5377(29, false, 1);
			Static355.aClass143_89 = Static358.method5377(30, true, 1);
			Static10.aClass143_2 = Static358.method5377(31, true, 1);
			Static270.aClass143_63 = Static358.method5377(36, true, 2);
		}
		if (Static137.aClass370_1 == Static627.aClass370_11) {
			local8 = 0;
			for (local63 = 0; local63 < 37; local63++) {
				if (Static601.aClass89_Sub1Array2[local63] != null) {
					local8 += Static601.aClass89_Sub1Array2[local63].method2159() * Static523.anIntArray375[local63] / 100;
				}
			}
			if (local8 != 100) {
				if (Static56.anInt1427 < 0) {
					Static56.anInt1427 = local8;
				}
				return (local8 - Static56.anInt1427) * 100 / (100 - Static56.anInt1427);
			}
			Static338.method5146(Static235.aClass143_57);
			Static621.method8227(Static611.method8063(), Static41.aClass143_11, Static235.aClass143_57);
		}
		if (Static137.aClass370_1 == Static627.aClass370_12) {
			if (Static251.anInt4688 == -1) {
				Static251.anInt4688 = Static510.aClass143_118.method3131("scape main");
			}
			Static399.method4480();
			Static482.method6863(2);
		}
		if (Static137.aClass370_1 == Static627.aClass370_13) {
			Static339.method5152(Static355.aClass143_89, Static499.aClass231_4);
		}
		if (Static627.aClass370_14 == Static137.aClass370_1) {
			local8 = Static262.method4134();
			if (local8 < 100) {
				return local8;
			}
			Static637.method8374(Static176.aClass143_45.method3135(1));
			Static635.method8350(Static176.aClass143_45.method3135(3));
			Static252.aClass217_2 = new Class217(Static176.aClass143_45);
		}
		if (Static627.aClass370_15 == Static137.aClass370_1) {
			if (Static205.anInt3816 != -1 && !Static21.aClass143_5.method3113(Static205.anInt3816, 0)) {
				return 99;
			}
			Static166.anInterface5_5 = new Class227(Static105.aClass143_25, Static285.aClass143_77, Static235.aClass143_57);
			Static145.aClass165_1 = new Class165(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static658.aClass88_2 = new Class88(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87, Static252.aClass217_2);
			Static651.aClass149_2 = new Class149(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87, Static235.aClass143_57);
			Static466.aClass49_1 = new Class49(Static102.aClass181_38, Static319.anInt5939, Static126.aClass143_32);
			Static369.aClass352_5 = new Class352(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static272.aClass32_3 = new Class32(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static29.aClass51_1 = new Class51(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87, Static235.aClass143_57);
			Static605.aClass43_1 = new Class43(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87, Static21.aClass143_5);
			Static483.aClass339_1 = new Class339(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static47.aClass216_1 = new Class216(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static349.aClass374_2 = new Class374(Static102.aClass181_38, Static319.anInt5939, true, Static423.aClass143_103, Static21.aClass143_5);
			Static661.aClass321_4 = new Class321(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87, Static235.aClass143_57);
			Static453.aClass116_2 = new Class116(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87, Static235.aClass143_57);
			Static481.aClass241_2 = new Class241(Static102.aClass181_38, Static319.anInt5939, true, Static471.aClass143_144, Static21.aClass143_5);
			Static237.aClass371_2 = new Class371(Static102.aClass181_38, Static319.anInt5939, true, Static145.aClass165_1, Static160.aClass143_39, Static21.aClass143_5);
			Static30.aClass267_1 = new Class267(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static483.aClass373_2 = new Class373(Static102.aClass181_38, Static319.anInt5939, Static169.aClass143_42, Static566.aClass143_72, Static565.aClass143_117);
			Static377.aClass222_1 = new Class222(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static357.aClass322_4 = new Class322(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static196.aClass315_2 = new Class315(Static102.aClass181_38, Static319.anInt5939, Static272.aClass143_64, Static21.aClass143_5);
			Static415.aClass154_1 = new Class154(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static429.aClass94_1 = new Class94(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static81.aClass278_1 = new Class278(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static442.aClass388_1 = new Class388(Static102.aClass181_38, Static319.anInt5939, Static167.aClass143_40);
			Static281.aClass389_1 = new Class389(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static422.aClass214_1 = new Class214(Static102.aClass181_38, Static319.anInt5939, Static346.aClass143_87);
			Static599.method3046(Static41.aClass143_11, Static105.aClass143_24, Static21.aClass143_5, Static235.aClass143_57);
			Static97.method1925(Static624.aClass143_133);
			Static271.aClass78_1 = new Class78(Static319.anInt5939, Static168.aClass143_41, Static409.aClass143_96);
			Static264.aClass263_2 = new Class263(Static319.anInt5939, Static168.aClass143_41, Static409.aClass143_96, new Class83());
			Static577.method7773();
			Static349.aClass374_2.method8359(Static227.aClass3_Sub15_11.aClass17_Sub19_1.method6025() == 0);
			Static592.aClass47_2 = new Class47();
			Static260.method4105();
			Static89.method1829(Static535.aClass143_121);
			Static652.method8543(Static166.anInterface5_5, Static21.aClass143_5);
			@Pc(963) Class332 local963 = new Class332(Static264.aClass143_62.method3119("huffman", ""));
			Static280.method4443(local963);
			try {
				jagmisc.init();
			} catch (@Pc(970) Throwable local970) {
			}
			Static258.aClass212_1 = Static14.method137();
			Static447.aClass3_Sub34_1 = new Class3_Sub34(true, Static499.aClass231_4);
		}
		if (Static137.aClass370_1 == Static627.aClass370_17) {
			local8 = Static113.method2116(Static235.aClass143_57) + Static663.method8649(true);
			local63 = Static399.method4481() + Static317.method4993();
			if (local63 > local8) {
				return local8 * 100 / local63;
			}
		}
		if (Static137.aClass370_1 == Static627.aClass370_18) {
			Static574.method7071(Static390.aClass143_97, Static369.aClass352_5, Static272.aClass32_3, Static349.aClass374_2, Static661.aClass321_4, Static453.aClass116_2, Static592.aClass47_2);
		}
		if (Static137.aClass370_1 == Static627.aClass370_19) {
			Static440.aBooleanArray22 = new boolean[Static81.aClass278_1.anInt7822];
			Static79.anIntArray121 = new int[Static81.aClass278_1.anInt7822];
			Static657.aStringArray76 = new String[Static429.aClass94_1.anInt2431];
			for (local8 = 0; local8 < Static81.aClass278_1.anInt7822; local8++) {
				if (Static81.aClass278_1.method6562(local8).anInt9771 == 0) {
					Static440.aBooleanArray22[local8] = true;
					Static580.anInt9189++;
				}
				Static79.anIntArray121[local8] = -1;
			}
			Static276.method4389();
			Static177.anInt3331 = Static105.aClass143_24.method3131("loginscreen");
			Static360.anInt6421 = Static105.aClass143_24.method3131("lobbyscreen");
			Static673.aClass143_110.method3112(false);
			Static510.aClass143_118.method3112(true);
			Static235.aClass143_57.method3112(true);
			Static41.aClass143_11.method3112(true);
			Static264.aClass143_62.method3112(true);
			Static105.aClass143_24.method3112(true);
			Static381.aBoolean508 = true;
			Static346.aClass143_87.anInt3570 = 2;
			Static126.aClass143_32.anInt3570 = 2;
			Static423.aClass143_103.anInt3570 = 2;
			Static471.aClass143_144.anInt3570 = 2;
			Static160.aClass143_39.anInt3570 = 2;
			Static169.aClass143_42.anInt3570 = 2;
			Static272.aClass143_64.anInt3570 = 2;
		}
		if (Static627.aClass370_20 == Static137.aClass370_1) {
			if (!Static368.method5461(Static177.anInt3331)) {
				return 0;
			}
			local155 = true;
			for (local63 = 0; local63 < Static562.aClass208ArrayArray3[Static177.anInt3331].length; local63++) {
				@Pc(1156) Class208 local1156 = Static562.aClass208ArrayArray3[Static177.anInt3331][local63];
				if (local1156.anInt5643 == 5 && local1156.anInt5620 != -1 && !Static235.aClass143_57.method3113(local1156.anInt5620, 0)) {
					local155 = false;
				}
			}
			if (!local155) {
				return 0;
			}
		}
		if (Static137.aClass370_1 == Static627.aClass370_21) {
			Static594.method7954(true);
		}
		if (Static137.aClass370_1 == Static627.aClass370_22) {
			Static12.aClass124_1.method2775();
			try {
				Static359.aThread3.join();
			} catch (@Pc(1200) InterruptedException local1200) {
				return 0;
			}
			Static62.anInterface27Array1 = null;
			Static427.aClass143_104 = null;
			Static577.aClass235_1 = null;
			Static359.aThread3 = null;
			Static645.aClass143_142 = null;
			Static12.aClass124_1 = null;
			Static588.method7906();
			Static637.aBoolean724 = Static227.aClass3_Sub15_11.aClass17_Sub15_1.method5148() == 1;
			Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub15_1, 1);
			if (Static637.aBoolean724) {
				Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, 0);
			} else if (Static227.aClass3_Sub15_11.aClass17_Sub20_2.aBoolean583 && Static447.aClass3_Sub34_1.anInt6531 < 512 && Static447.aClass3_Sub34_1.anInt6531 != 0) {
				Static227.aClass3_Sub15_11.method2425(Static227.aClass3_Sub15_11.aClass17_Sub20_2, 0);
			}
			Static57.method6341();
			if (Static637.aBoolean724) {
				Static422.method6016(false, 0);
			} else {
				Static422.method6016(false, Static227.aClass3_Sub15_11.aClass17_Sub20_2.method6402());
			}
			Static211.method8142(-1, Static227.aClass3_Sub15_11.aClass17_Sub9_1.method3400(), -1, false);
			Static255.method4046(Static582.aClass16_12);
			Static254.method4040(Static582.aClass16_12);
			Static436.method6383(Static582.aClass16_12, Static235.aClass143_57);
			Static368.method5459(Static111.aClass102Array25);
		}
		return Static639.method8399();
	}
}
