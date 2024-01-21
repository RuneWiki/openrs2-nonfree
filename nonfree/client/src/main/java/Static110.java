import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "Lclient!bg;")
	public static Class11 aClass11_90;

	@OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
	public static int anInt2302;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
	public static int anInt2287 = 1;

	@OriginalMember(owner = "client!nd", name = "g", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1067 = Static32.method683("compass");

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "[I")
	public static int[] anIntArray221 = new int[2048];

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
	public static int anInt2298 = 0;

	@OriginalMember(owner = "client!nd", name = "B", descriptor = "Lclient!lf;")
	public static Class49 aClass49_1068 = Static32.method683(":assist:");

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method1886() {
		aClass49_1068 = null;
		aClass49_1067 = null;
		anIntArray221 = null;
		aClass11_90 = null;
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V")
	public static void method1887() {
		@Pc(14) int local14;
		if (Static112.anInt2316 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static112.anInt2316 > 768) {
					Static102.anIntArray208[local14] = Static153.method2528(Static70.anIntArray170[local14], 1024 - Static112.anInt2316, Static127.anIntArray263[local14]);
				} else if (Static112.anInt2316 > 256) {
					Static102.anIntArray208[local14] = Static127.anIntArray263[local14];
				} else {
					Static102.anIntArray208[local14] = Static153.method2528(Static127.anIntArray263[local14], 256 - Static112.anInt2316, Static70.anIntArray170[local14]);
				}
			}
		} else if (Static85.anInt1806 > 0) {
			for (local14 = 0; local14 < 256; local14++) {
				if (Static85.anInt1806 > 768) {
					Static102.anIntArray208[local14] = Static153.method2528(Static70.anIntArray170[local14], 1024 - Static85.anInt1806, Static150.anIntArray287[local14]);
				} else if (Static85.anInt1806 <= 256) {
					Static102.anIntArray208[local14] = Static153.method2528(Static150.anIntArray287[local14], 256 - Static85.anInt1806, Static70.anIntArray170[local14]);
				} else {
					Static102.anIntArray208[local14] = Static150.anIntArray287[local14];
				}
			}
		} else {
			for (local14 = 0; local14 < 256; local14++) {
				Static102.anIntArray208[local14] = Static70.anIntArray170[local14];
			}
		}
		@Pc(160) int local160 = Static88.aClass2_Sub2_Sub2_Sub3_4.anInt1886 * 9;
		local14 = 0;
		@Pc(164) int local164 = 0;
		@Pc(181) int local181;
		@Pc(191) int local191;
		@Pc(198) int local198;
		@Pc(204) int local204;
		@Pc(208) int local208;
		@Pc(213) int local213;
		for (@Pc(166) int local166 = 1; local166 < 255; local166++) {
			local181 = (256 - local166) * Static170.anIntArray330[local166] / 256 + 22;
			if (local181 < 0) {
				local181 = 0;
			}
			local14 += local181;
			for (local191 = local181; local191 < 128; local191++) {
				local198 = Static34.anIntArray80[local14++];
				local204 = Static88.aClass2_Sub2_Sub2_Sub3_4.anIntArray191[local160++];
				if (local198 == 0) {
					Static71.aClass2_Sub2_Sub2_Sub3_3.anIntArray191[local164++] = local204;
				} else {
					local208 = local198;
					local213 = 256 - local198;
					local198 = Static102.anIntArray208[local198];
					Static71.aClass2_Sub2_Sub2_Sub3_3.anIntArray191[local164++] = ((local198 & 0xFF00) * local208 + local213 * (local204 & 0xFF00) & 0xFF0000) + ((local198 & 0xFF00FF) * local208 + local213 * (local204 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			for (local198 = 0; local198 < local181; local198++) {
				Static71.aClass2_Sub2_Sub2_Sub3_3.anIntArray191[local164++] = Static88.aClass2_Sub2_Sub2_Sub3_4.anIntArray191[local160++];
			}
			local160 += Static88.aClass2_Sub2_Sub2_Sub3_4.anInt1886 - 128;
		}
		Static71.aClass2_Sub2_Sub2_Sub3_3.method1544(0, 9);
		local164 = 0;
		local160 = Static88.aClass2_Sub2_Sub2_Sub3_4.anInt1886 * 9 + 128;
		local14 = 0;
		for (local181 = 1; local181 < 255; local181++) {
			local191 = (256 - local181) * Static170.anIntArray330[local181] / 256 + 22;
			if (local191 < 0) {
				local191 = 0;
			}
			for (local198 = 0; local198 < local191; local198++) {
				@Pc(342) int local342 = local164++;
				local160--;
				Static142.aClass2_Sub2_Sub2_Sub3_6.anIntArray191[local342] = Static88.aClass2_Sub2_Sub2_Sub3_4.anIntArray191[local160];
			}
			for (local204 = local191; local204 < 128; local204++) {
				local160--;
				local213 = Static88.aClass2_Sub2_Sub2_Sub3_4.anIntArray191[local160];
				local208 = Static34.anIntArray80[local14++];
				if (local208 == 0) {
					Static142.aClass2_Sub2_Sub2_Sub3_6.anIntArray191[local164++] = local213;
				} else {
					@Pc(380) int local380 = local208;
					@Pc(385) int local385 = 256 - local208;
					local208 = Static102.anIntArray208[local208];
					Static142.aClass2_Sub2_Sub2_Sub3_6.anIntArray191[local164++] = (local385 * (local213 & 0xFF00FF) + local380 * (local208 & 0xFF00FF) & 0xFF00FF00) + ((local213 & 0xFF00) * local385 + (local208 & 0xFF00) * local380 & 0xFF0000) >> 8;
				}
			}
			local160 += Static88.aClass2_Sub2_Sub2_Sub3_4.anInt1886 + 128;
			local14 += local191;
		}
		Static142.aClass2_Sub2_Sub2_Sub3_6.method1544(637, 9);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!vg;ILclient!lf;)Lclient!lf;")
	public static Class49 method1888(@OriginalArg(0) Class85 arg0, @OriginalArg(2) Class49 arg1) {
		if (arg1.method1666(Static22.aClass49_276) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(15) int local15 = arg1.method1666(Static26.aClass49_329);
			if (local15 == -1) {
				while (true) {
					local15 = arg1.method1666(Static86.aClass49_1596);
					if (local15 == -1) {
						while (true) {
							local15 = arg1.method1666(Static168.aClass49_1646);
							if (local15 == -1) {
								while (true) {
									local15 = arg1.method1666(Static161.aClass49_1582);
									if (local15 == -1) {
										while (true) {
											local15 = arg1.method1666(Static124.aClass49_1234);
											if (local15 == -1) {
												while (true) {
													local15 = arg1.method1666(Static41.aClass49_505);
													if (local15 == -1) {
														return arg1;
													}
													@Pc(243) Class49 local243 = Static154.aClass49_1489;
													if (Static51.aClass16_3 != null) {
														local243 = Static91.method1577(Static51.aClass16_3.anInt751);
														try {
															if (Static51.aClass16_3.anObject1 != null) {
																@Pc(259) byte[] local259 = ((String) Static51.aClass16_3.anObject1).getBytes("ISO-8859-1");
																local243 = Static182.method3026(local259, local259.length, 0);
															}
														} catch (@Pc(268) UnsupportedEncodingException local268) {
														}
													}
													arg1 = Static33.method692(new Class49[] { arg1.method1661(local15, 0), local243, arg1.method1665(local15 + 4) });
												}
											}
											arg1 = Static33.method692(new Class49[] { arg1.method1661(local15, 0), Static6.method103(Static159.method2687(arg0, 4)), arg1.method1665(local15 + 2) });
										}
									}
									arg1 = Static33.method692(new Class49[] { arg1.method1661(local15, 0), Static6.method103(Static159.method2687(arg0, 3)), arg1.method1665(local15 + 2) });
								}
							}
							arg1 = Static33.method692(new Class49[] { arg1.method1661(local15, 0), Static6.method103(Static159.method2687(arg0, 2)), arg1.method1665(local15 + 2) });
						}
					}
					arg1 = Static33.method692(new Class49[] { arg1.method1661(local15, 0), Static6.method103(Static159.method2687(arg0, 1)), arg1.method1665(local15 + 2) });
				}
			}
			arg1 = Static33.method692(new Class49[] { arg1.method1661(local15, 0), Static6.method103(Static159.method2687(arg0, 0)), arg1.method1665(local15 + 2) });
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[Lclient!lb;[BIIIIII)V")
	public static void method1889(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class48[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(10) Class2_Sub13 local10 = new Class2_Sub13(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method2924();
			if (local21 == 0) {
				return;
			}
			@Pc(28) int local28 = 0;
			local12 += local21;
			while (true) {
				@Pc(36) int local36 = local10.method2924();
				if (local36 == 0) {
					break;
				}
				local28 += local36 - 1;
				@Pc(51) int local51 = local28 & 0x3F;
				@Pc(57) int local57 = local28 >> 6 & 0x3F;
				@Pc(61) int local61 = local28 >> 12;
				@Pc(65) int local65 = local10.method2962();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local61 == arg4 && arg7 <= local57 && local57 < arg7 + 8 && local51 >= arg5 && local51 < arg5 + 8) {
					@Pc(112) Class2_Sub2_Sub9 local112 = Static124.method2146(local12);
					@Pc(130) int local130 = arg1 + Static171.method2845(local73, local112.anInt1480, local57 & 0x7, local112.anInt1482, local51 & 0x7, arg0);
					@Pc(147) int local147 = Static41.method797(local112.anInt1480, local73, local51 & 0x7, arg0, local57 & 0x7, local112.anInt1482) + arg6;
					if (local130 > 0 && local147 > 0 && local130 < 103 && local147 < 103) {
						@Pc(163) Class48 local163 = null;
						@Pc(165) int local165 = arg8;
						if ((Static81.aByteArrayArrayArray2[1][local130][local147] & 0x2) == 2) {
							local165 = arg8 - 1;
						}
						if (local165 >= 0) {
							local163 = arg2[local165];
						}
						Static178.method2904(arg8, local12, local73 + arg0 & 0x3, local69, local163, local130, local147);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)I")
	public static int method1890(@OriginalArg(1) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		@Pc(10) int local10 = local0 | local0 >>> 1;
		@Pc(16) int local16 = local10 | local10 >>> 2;
		@Pc(22) int local22 = local16 | local16 >>> 4;
		@Pc(33) int local33 = local22 | local22 >>> 8;
		@Pc(39) int local39 = local33 | local33 >>> 16;
		return local39 + 1;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZLclient!bg;)V")
	public static void method1893(@OriginalArg(1) Class11 arg0) {
		Static134.aClass11_105 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public static void method1894() {
		Static81.method1391();
		Static92.method1584();
		Static43.method822();
		Static23.method429();
		Static41.method793();
		Static156.method2645();
		Static118.method1993();
		Static164.method2765();
		Static61.method1069();
		Static170.method2827();
		Static2.method20();
		Static104.method1766();
		((Class8) Static109.anInterface1_2).method195();
		Static26.aClass74_22.method2347();
		Static57.aClass11_Sub1_12.method2076();
		Static42.aClass11_Sub1_8.method2076();
		Static53.aClass11_Sub1_11.method2076();
		Static120.aClass11_Sub1_27.method2076();
		Static151.aClass11_Sub1_34.method2076();
		Static91.aClass11_Sub1_23.method2076();
		Static154.aClass11_Sub1_35.method2076();
		Static67.aClass11_Sub1_22.method2076();
		Static35.aClass11_Sub1_7.method2076();
		Static86.aClass11_Sub1_37.method2076();
		Static46.aClass11_Sub1_9.method2076();
	}
}
