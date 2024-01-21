import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
	public static int anInt2788;

	@OriginalMember(owner = "client!ua", name = "o", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_21;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!ge;")
	public static Class21 aClass21_33 = new Class21(64);

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
	public static int anInt2786 = 1;

	@OriginalMember(owner = "client!ua", name = "e", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1248 = Static24.method441("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1249 = Static24.method441("title)3jpg");

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1250 = Static24.method441("@or1@");

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "Lclient!wb;")
	private static Class65 aClass65_1251 = Static24.method441("Connecting to friendserver");

	@OriginalMember(owner = "client!ua", name = "l", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1252 = aClass65_1251;

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
	public static int anInt2792 = 0;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Lclient!wb;")
	public static Class65 aClass65_1253 = Static24.method441(" (X");

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "I")
	public static int anInt2793 = 0;

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
	public static int anInt2794 = 0;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!wc;Lclient!wc;)V")
	public static void method1715(@OriginalArg(1) Class2_Sub1_Sub4_Sub4 arg0, @OriginalArg(2) Class2_Sub1_Sub4_Sub4 arg1) {
		Static96.aClass15_67.method1098();
		if (Static35.anInt1181 == 0 || Static35.anInt1181 == 5) {
			arg0.method1838(Static7.aClass65_140, 180, 54, 16777215);
			Static43.method1806(28, 62, 304, 34, 9179409);
			Static43.method1806(29, 63, 302, 32, 0);
			Static43.method1815(30, 64, Static36.anInt1219 * 3, 30, 9179409);
			Static43.method1815(Static36.anInt1219 * 3 + 30, 64, 300 - Static36.anInt1219 * 3, 30, 0);
			arg0.method1838(Static105.aClass65_1284, 180, 85, 16777215);
		}
		@Pc(83) byte local83;
		@Pc(95) int local95;
		if (Static35.anInt1181 == 20) {
			local83 = 40;
			Static24.aClass2_Sub1_Sub4_Sub3_10.method1479(0, 0);
			arg0.method1832(Static105.aClass65_1290, 180, 40, 16776960, true);
			local95 = local83 + 15;
			arg0.method1832(Static105.aClass65_1292, 180, 55, 16776960, true);
			@Pc(103) int local103 = local95 + 15;
			arg0.method1832(Static105.aClass65_1287, 180, 70, 16776960, true);
			@Pc(111) int local111 = local103 + 15;
			@Pc(112) int local112 = local111 + 10;
			arg0.method1826(Static13.method282(new Class65[] { Static15.aClass65_246, Static105.aClass65_1293 }), 90, 95, 16777215, true);
			@Pc(131) int local131 = local112 + 15;
			arg0.method1826(Static13.method282(new Class65[] { Static42.aClass65_599, Static105.aClass65_1286.method1782() }), 92, 110, 16777215, true);
			@Pc(154) int local154 = local131 + 15;
		}
		if (Static35.anInt1181 == 10) {
			Static24.aClass2_Sub1_Sub4_Sub3_10.method1479(0, 0);
			if (anInt2794 == 0) {
				local83 = 80;
				arg0.method1832(Static55.aClass65_749, 180, 80, 16776960, true);
				local95 = local83 + 30;
				Static1.aClass2_Sub1_Sub4_Sub3_1.method1479(27, 100);
				arg0.method1825(Static40.aClass65_561, 27, 100, 144, 40, 16777215, true, 1, 1, 0);
				Static1.aClass2_Sub1_Sub4_Sub3_1.method1479(187, 100);
				arg0.method1825(Static47.aClass65_614, 187, 100, 144, 40, 16777215, true, 1, 1, 0);
			} else if (anInt2794 == 2) {
				local83 = 40;
				arg0.method1832(Static105.aClass65_1290, 180, 40, 16776960, true);
				local95 = local83 + 15;
				arg0.method1832(Static105.aClass65_1292, 180, 55, 16776960, true);
				local95 += 15;
				arg0.method1832(Static105.aClass65_1287, 180, 70, 16776960, true);
				local95 += 15;
				local95 += 10;
				arg0.method1826(Static13.method282(new Class65[] { Static15.aClass65_246, Static105.aClass65_1293, Static108.anInt2902 % 40 < 20 & Static65.anInt1947 == 0 ? Static46.aClass65_611 : Static105.aClass65_1291 }), 90, 95, 16777215, true);
				local95 += 15;
				arg0.method1826(Static13.method282(new Class65[] { Static42.aClass65_599, Static105.aClass65_1286.method1782(), Static65.anInt1947 == 1 & Static108.anInt2902 % 40 < 20 ? Static46.aClass65_611 : Static105.aClass65_1291 }), 92, 110, 16777215, true);
				Static1.aClass2_Sub1_Sub4_Sub3_1.method1479(27, 130);
				arg0.method1832(Static28.aClass65_374, 100, 155, 16777215, true);
				local95 += 15;
				Static1.aClass2_Sub1_Sub4_Sub3_1.method1479(187, 130);
				arg0.method1832(Static17.aClass65_273, 260, 155, 16777215, true);
			} else if (anInt2794 == 3) {
				local83 = 65;
				arg0.method1832(Static99.aClass65_1148, 180, 40, 16776960, true);
				arg0.method1832(Static56.aClass65_765, 180, 65, 16777215, true);
				local95 = local83 + 15;
				arg0.method1832(Static59.aClass65_819, 180, 80, 16777215, true);
				local95 += 15;
				arg0.method1832(Static62.aClass65_848, 180, 95, 16777215, true);
				local95 += 15;
				arg0.method1832(Static90.aClass65_632, 180, 110, 16777215, true);
				Static1.aClass2_Sub1_Sub4_Sub3_1.method1479(107, 130);
				local95 += 15;
				arg0.method1832(Static17.aClass65_273, 180, 155, 16777215, true);
			}
		}
		Static25.method451();
		try {
			@Pc(473) Graphics local473 = Static70.aCanvas1.getGraphics();
			Static96.aClass15_67.method1104(171, local473, 202);
			Static59.aClass15_43.method1104(0, local473, 0);
			Static50.aClass15_35.method1104(0, local473, 637);
			if (Static38.aBoolean74) {
				Static38.aBoolean74 = false;
				Static108.aClass15_70.method1104(0, local473, 128);
				Static45.aClass15_33.method1104(371, local473, 202);
				Static92.aClass15_62.method1104(265, local473, 0);
				Static85.aClass15_58.method1104(265, local473, 562);
				Static93.aClass15_64.method1104(171, local473, 128);
				Static38.aClass15_29.method1104(171, local473, 562);
			}
		} catch (@Pc(539) Exception local539) {
			Static70.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method1716() {
		Static92.aBoolean135 = true;
		Static34.method703();
		if (Static85.aBoolean125) {
			Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(Static8.aClass65_158, 239, 40, 0);
			Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(Static13.method282(new Class65[] { Static8.aClass65_148, Static12.aClass65_218 }), 239, 60, 128);
		} else if (Static55.anInt1673 == 1) {
			Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(Static40.aClass65_558, 239, 40, 0);
			Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(Static13.method282(new Class65[] { Static8.aClass65_144, Static12.aClass65_218 }), 239, 60, 128);
		} else if (Static55.anInt1673 == 2) {
			Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(Static62.aClass65_844, 239, 40, 0);
			Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(Static13.method282(new Class65[] { Static8.aClass65_144, Static12.aClass65_218 }), 239, 60, 128);
		} else {
			@Pc(59) Class2_Sub1_Sub4_Sub4 local59;
			@Pc(66) int local66;
			@Pc(77) int local77;
			if (Static55.anInt1673 == 3) {
				if (Static8.aClass65_144 != Static8.aClass65_153) {
					Static104.method1739(Static8.aClass65_144);
					Static8.aClass65_153 = Static8.aClass65_144;
				}
				local59 = Static110.aClass2_Sub1_Sub4_Sub4_3;
				Static43.method1807(0, 0, 463, 77);
				for (local66 = 0; local66 < Static82.anInt2368; local66++) {
					local77 = local66 * 14 + 18 - Static15.anInt477;
					if (local77 > 0 && local77 < 110) {
						local59.method1838(Static79.aClass65Array11[local66], 239, local77, 0);
					}
				}
				Static43.method1812();
				if (Static82.anInt2368 > 5) {
					Static32.method630(463, Static82.anInt2368 * 14 + 7, 77, 0, Static15.anInt477);
				}
				if (Static8.aClass65_144.method1760() == 0) {
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(Static74.aClass65_708, 239, 40, 255);
				} else if (Static82.anInt2368 == 0) {
					Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(Static57.aClass65_775, 239, 40, 0);
				}
				local59.method1838(Static13.method282(new Class65[] { Static8.aClass65_144, Static12.aClass65_218 }), 239, 90, 0);
				Static43.method1813(0, 77, 479, 0);
			} else if (Static93.aClass65_1182 == null) {
				@Pc(175) boolean local175;
				if (Static21.anInt2494 != -1) {
					local175 = Static76.method1305(0, 0, -1, 2, Static21.anInt2494, 0, 479, 96);
					if (!local175) {
						Static107.aBoolean156 = true;
					}
				} else if (Static5.anInt237 == -1) {
					local66 = 0;
					local59 = Static110.aClass2_Sub1_Sub4_Sub4_3;
					Static43.method1807(0, 0, 463, 77);
					for (local77 = 0; local77 < 100; local77++) {
						if (Static34.aClass65Array5[local77] != null) {
							@Pc(206) int local206 = Static61.anIntArray249[local77];
							@Pc(215) int local215 = Static95.anInt1974 + 70 - local66 * 14;
							@Pc(219) Class65 local219 = Static78.aClass65Array4[local77];
							@Pc(221) byte local221 = 0;
							if (local219 != null && local219.method1783(Static69.aClass65_954)) {
								local219 = local219.method1779(5);
								local221 = 1;
							}
							if (local219 != null && local219.method1783(Static6.aClass65_117)) {
								local219 = local219.method1779(5);
								local221 = 2;
							}
							if (local206 == 0) {
								if (local215 > 0 && local215 < 110) {
									local59.method1828(Static34.aClass65Array5[local77], 4, local215, 0);
								}
								local66++;
							}
							@Pc(308) int local308;
							if ((local206 == 1 || local206 == 2) && (local206 == 1 || Static103.anInt2811 == 0 || Static103.anInt2811 == 1 && Static4.method102(local219))) {
								if (local215 > 0 && local215 < 110) {
									local308 = 4;
									if (local221 == 1) {
										Static46.aClass2_Sub1_Sub4_Sub3Array5[0].method1479(4, local215 - 12);
										local308 += 14;
									}
									if (local221 == 2) {
										Static46.aClass2_Sub1_Sub4_Sub3Array5[1].method1479(local308, local215 - 12);
										local308 += 14;
									}
									local59.method1828(Static13.method282(new Class65[] { local219, Static13.aClass65_239 }), local308, local215, 0);
									local308 += local59.method1839(local219) + 8;
									local59.method1828(Static34.aClass65Array5[local77], local308, local215, 255);
								}
								local66++;
							}
							if ((local206 == 3 || local206 == 7) && Static47.anInt1390 == 0 && (local206 == 7 || Static42.anInt1350 == 0 || Static42.anInt1350 == 1 && Static4.method102(local219))) {
								if (local215 > 0 && local215 < 110) {
									local59.method1828(Static85.aClass65_1106, 4, local215, 0);
									local308 = local59.method1839(Static85.aClass65_1106) + 4;
									local308 += local59.method1829(32);
									if (local221 == 1) {
										Static46.aClass2_Sub1_Sub4_Sub3Array5[0].method1479(local308, local215 - 12);
										local308 += 14;
									}
									if (local221 == 2) {
										Static46.aClass2_Sub1_Sub4_Sub3Array5[1].method1479(local308, local215 - 12);
										local308 += 14;
									}
									local59.method1828(Static13.method282(new Class65[] { local219, Static13.aClass65_239 }), local308, local215, 0);
									local308 += local59.method1839(local219) + 8;
									local59.method1828(Static34.aClass65Array5[local77], local308, local215, 8388608);
								}
								local66++;
							}
							if (local206 == 4 && (Static85.anInt2454 == 0 || Static85.anInt2454 == 1 && Static4.method102(local219))) {
								local66++;
								if (local215 > 0 && local215 < 110) {
									local59.method1828(Static13.method282(new Class65[] { local219, Static22.aClass65_305, Static34.aClass65Array5[local77] }), 4, local215, 8388736);
								}
							}
							if (local206 == 5 && Static47.anInt1390 == 0 && Static42.anInt1350 < 2) {
								local66++;
								if (local215 > 0 && local215 < 110) {
									local59.method1828(Static34.aClass65Array5[local77], 4, local215, 8388608);
								}
							}
							if (local206 == 6 && Static47.anInt1390 == 0 && Static42.anInt1350 < 2) {
								if (local215 > 0 && local215 < 110) {
									local59.method1828(Static13.method282(new Class65[] { Static12.aClass65_222, Static22.aClass65_305, local219, Static13.aClass65_239 }), 4, local215, 0);
									local59.method1828(Static34.aClass65Array5[local77], local59.method1839(Static13.method282(new Class65[] { Static12.aClass65_222, Static22.aClass65_305, local219 })) + 12, local215, 8388608);
								}
								local66++;
							}
							if (local206 == 8 && (Static85.anInt2454 == 0 || Static85.anInt2454 == 1 && Static4.method102(local219))) {
								if (local215 > 0 && local215 < 110) {
									local59.method1828(Static13.method282(new Class65[] { local219, Static22.aClass65_305, Static34.aClass65Array5[local77] }), 4, local215, 8270336);
								}
								local66++;
							}
						}
					}
					Static43.method1812();
					Static27.anInt776 = local66 * 14 + 7;
					if (Static27.anInt776 < 78) {
						Static27.anInt776 = 78;
					}
					Static32.method630(463, Static27.anInt776, 77, 0, Static27.anInt776 - Static95.anInt1974 - 77);
					@Pc(711) Class65 local711;
					if (Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1 == null || Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.aClass65_726 == null) {
						local711 = Static105.aClass65_1293;
					} else {
						local711 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1.aClass65_726;
					}
					local59.method1828(Static13.method282(new Class65[] { local711, Static13.aClass65_239 }), 4, 90, 0);
					local59.method1828(Static13.method282(new Class65[] { Static8.aClass65_147, Static12.aClass65_218 }), local59.method1839(Static13.method282(new Class65[] { local711, Static17.aClass65_274 })) + 6, 90, 255);
					Static43.method1813(0, 77, 479, 0);
				} else {
					local175 = Static76.method1305(0, 0, -1, 3, Static5.anInt237, 0, 479, 96);
					if (!local175) {
						Static107.aBoolean156 = true;
					}
				}
			} else {
				Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(Static93.aClass65_1182, 239, 40, 0);
				Static38.aClass2_Sub1_Sub4_Sub4_1.method1838(Static5.aClass65_108, 239, 60, 128);
			}
		}
		if (Static51.aBoolean83 && Static99.anInt2540 == 2) {
			Static7.method153();
		}
		Static81.method1799();
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1717() {
		aClass21_33 = null;
		aClass65_1250 = null;
		aClass65_1251 = null;
		aByteArrayArray9 = null;
		aClass65_1253 = null;
		aClass65_1248 = null;
		aClass65_1249 = null;
		aClass2_Sub1_Sub4_Sub3_21 = null;
		aClass65_1252 = null;
	}
}
