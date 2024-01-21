import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static35 {

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
	public static int anInt1095;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!w;")
	public static Class55_Sub1 aClass55_Sub1_5;

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
	public static int anInt1111;

	@OriginalMember(owner = "client!ha", name = "f", descriptor = "Lclient!gd;")
	public static Class23 aClass23_605 = Static15.method178("");

	@OriginalMember(owner = "client!ha", name = "h", descriptor = "Lclient!gd;")
	public static Class23 aClass23_606 = Static15.method178("welle:");

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
	public static int anInt1096 = 0;

	@OriginalMember(owner = "client!ha", name = "n", descriptor = "Lclient!gd;")
	public static Class23 aClass23_607 = Static15.method178("Benutzen Sie die (WPasswort -=ndern(W Option");

	@OriginalMember(owner = "client!ha", name = "t", descriptor = "I")
	public static int anInt1105 = -1;

	@OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
	public static int anInt1109 = 2;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
	public static int anInt1118 = 0;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
	public static int anInt1121 = 0;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public static void method593() {
		Static37.method746(Static77.anInt2096);
		if (Static87.anInt2866 != -1) {
			Static37.method746(Static87.anInt2866);
		}
		Static70.anInt1829 = 0;
		Static77.aClass34_58.method1138();
		Static73.anIntArray238 = Static93.method1588(Static73.anIntArray238);
		Static24.method1576();
		Static51.method992(503, 0, 765, Static77.anInt2096);
		if (Static87.anInt2866 != -1) {
			Static51.method992(503, 0, 765, Static87.anInt2866);
		}
		if (Static74.aBoolean90) {
			Static61.method1201();
		} else {
			Static95.method1624();
			Static37.method743();
		}
		try {
			@Pc(66) Graphics local66 = Static26.aCanvas1.getGraphics();
			Static77.aClass34_58.method1144(0, local66, 0);
		} catch (@Pc(74) Exception local74) {
			Static26.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public static void method594() {
		aClass23_605 = null;
		aClass55_Sub1_5 = null;
		aClass23_606 = null;
		aClass23_607 = null;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
	public static void method595() {
		Static26.aBoolean54 = true;
		Static48.method986();
		if (Static68.aBoolean27) {
			Static2.aClass1_Sub1_Sub6_Sub2_13.method832(Static104.aClass23_1527, 239, 40, 0);
			Static2.aClass1_Sub1_Sub6_Sub2_13.method832(Static17.method233(new Class23[] { Static104.aClass23_1525, Static18.aClass23_291 }), 239, 60, 128);
		} else if (Static44.anInt1485 == 1) {
			Static2.aClass1_Sub1_Sub6_Sub2_13.method832(Static108.aClass23_1638, 239, 40, 0);
			Static2.aClass1_Sub1_Sub6_Sub2_13.method832(Static17.method233(new Class23[] { Static104.aClass23_1522, Static18.aClass23_291 }), 239, 60, 128);
		} else if (Static44.anInt1485 == 2) {
			Static2.aClass1_Sub1_Sub6_Sub2_13.method832(Static92.aClass23_1711, 239, 40, 0);
			Static2.aClass1_Sub1_Sub6_Sub2_13.method832(Static17.method233(new Class23[] { Static104.aClass23_1522, Static18.aClass23_291 }), 239, 60, 128);
		} else {
			@Pc(115) Class1_Sub1_Sub6_Sub2 local115;
			@Pc(122) int local122;
			@Pc(134) int local134;
			if (Static44.anInt1485 == 3) {
				if (Static104.aClass23_1522 != Static104.aClass23_1524) {
					Static114.method1934(Static104.aClass23_1522);
					Static104.aClass23_1524 = Static104.aClass23_1522;
				}
				local115 = Static112.aClass1_Sub1_Sub6_Sub2_14;
				Static24.method1580(0, 0, 463, 77);
				for (local122 = 0; local122 < Static77.anInt2104; local122++) {
					local134 = local122 * 14 + 18 - Static56.anInt1731;
					if (local134 > 0 && local134 < 110) {
						local115.method832(Static10.aClass23Array5[local122], 239, local134, 0);
					}
				}
				Static24.method1583();
				if (Static77.anInt2104 > 5) {
					Static55.method1070(0, Static56.anInt1731, Static77.anInt2104 * 14 + 7, 77, 463);
				}
				if (Static104.aClass23_1522.method525() == 0) {
					Static2.aClass1_Sub1_Sub6_Sub2_13.method832(Static111.aClass23_1702, 239, 40, 255);
				} else if (Static77.anInt2104 == 0) {
					Static2.aClass1_Sub1_Sub6_Sub2_13.method832(Static88.aClass23_633, 239, 40, 0);
				}
				local115.method832(Static17.method233(new Class23[] { Static104.aClass23_1522, Static18.aClass23_291 }), 239, 90, 0);
				Static24.method1585(0, 77, 479, 0);
			} else if (Static110.aClass23_1695 == null) {
				@Pc(260) boolean local260;
				if (Static92.anInt2913 != -1) {
					local260 = Static51.method992(96, 2, 479, Static92.anInt2913);
					if (!local260) {
						Static102.aBoolean123 = true;
					}
				} else if (Static56.anInt1733 == -1) {
					local115 = Static112.aClass1_Sub1_Sub6_Sub2_14;
					Static24.method1580(0, 0, 463, 77);
					local122 = 0;
					for (local134 = 0; local134 < 100; local134++) {
						if (Static26.aClass23Array8[local134] != null) {
							@Pc(287) int local287 = Static43.anIntArray172[local134];
							@Pc(291) Class23 local291 = Static7.aClass23Array3[local134];
							@Pc(293) byte local293 = 0;
							@Pc(302) int local302 = Static108.anInt2806 + 70 - local122 * 14;
							if (local291 != null && local291.method546(Static8.aClass23_159)) {
								local293 = 1;
								local291 = local291.method510(5);
							}
							if (local291 != null && local291.method546(Static46.aClass23_850)) {
								local291 = local291.method510(5);
								local293 = 2;
							}
							if (local287 == 0) {
								if (local302 > 0 && local302 < 110) {
									local115.method836(Static26.aClass23Array8[local134], 4, local302, 0);
								}
								local122++;
							}
							@Pc(384) int local384;
							if ((local287 == 1 || local287 == 2) && (local287 == 1 || Static2.anInt2292 == 0 || Static2.anInt2292 == 1 && Static57.method1100(local291))) {
								local122++;
								if (local302 > 0 && local302 < 110) {
									local384 = 4;
									if (local293 == 1) {
										Static45.aClass1_Sub1_Sub6_Sub3Array5[0].method1194(4, local302 - 12);
										local384 += 14;
									}
									if (local293 == 2) {
										Static45.aClass1_Sub1_Sub6_Sub3Array5[1].method1194(local384, local302 - 12);
										local384 += 14;
									}
									local115.method836(Static17.method233(new Class23[] { local291, Static34.aClass23_601 }), local384, local302, 0);
									local384 += local115.method850(local291) + 8;
									local115.method836(Static26.aClass23Array8[local134], local384, local302, 255);
								}
							}
							if ((local287 == 3 || local287 == 7) && Static61.anInt1884 == 0 && (local287 == 7 || Static77.anInt2097 == 0 || Static77.anInt2097 == 1 && Static57.method1100(local291))) {
								local122++;
								if (local302 > 0 && local302 < 110) {
									local115.method836(Static83.aClass23_1304, 4, local302, 0);
									local384 = local115.method850(Static83.aClass23_1304) + 4;
									local384 += local115.method833(32);
									if (local293 == 1) {
										Static45.aClass1_Sub1_Sub6_Sub3Array5[0].method1194(local384, local302 - 12);
										local384 += 14;
									}
									if (local293 == 2) {
										Static45.aClass1_Sub1_Sub6_Sub3Array5[1].method1194(local384, local302 - 12);
										local384 += 14;
									}
									local115.method836(Static17.method233(new Class23[] { local291, Static34.aClass23_601 }), local384, local302, 0);
									local384 += local115.method850(local291) + 8;
									local115.method836(Static26.aClass23Array8[local134], local384, local302, 8388608);
								}
							}
							if (local287 == 4 && (Static62.anInt1905 == 0 || Static62.anInt1905 == 1 && Static57.method1100(local291))) {
								if (local302 > 0 && local302 < 110) {
									local115.method836(Static17.method233(new Class23[] { local291, Static10.aClass23_172, Static26.aClass23Array8[local134] }), 4, local302, 8388736);
								}
								local122++;
							}
							if (local287 == 5 && Static61.anInt1884 == 0 && Static77.anInt2097 < 2) {
								local122++;
								if (local302 > 0 && local302 < 110) {
									local115.method836(Static26.aClass23Array8[local134], 4, local302, 8388608);
								}
							}
							if (local287 == 6 && Static61.anInt1884 == 0 && Static77.anInt2097 < 2) {
								local122++;
								if (local302 > 0 && local302 < 110) {
									local115.method836(Static17.method233(new Class23[] { Static92.aClass23_1708, Static10.aClass23_172, local291, Static34.aClass23_601 }), 4, local302, 0);
									local115.method836(Static26.aClass23Array8[local134], local115.method850(Static17.method233(new Class23[] { Static92.aClass23_1708, Static10.aClass23_172, local291 })) + 12, local302, 8388608);
								}
							}
							if (local287 == 8 && (Static62.anInt1905 == 0 || Static62.anInt1905 == 1 && Static57.method1100(local291))) {
								if (local302 > 0 && local302 < 110) {
									local115.method836(Static17.method233(new Class23[] { local291, Static10.aClass23_172, Static26.aClass23Array8[local134] }), 4, local302, 8270336);
								}
								local122++;
							}
						}
					}
					Static24.method1583();
					Static67.anInt1982 = local122 * 14 + 7;
					if (Static67.anInt1982 < 78) {
						Static67.anInt1982 = 78;
					}
					Static55.method1070(0, Static67.anInt1982 - Static108.anInt2806 - 77, Static67.anInt1982, 77, 463);
					@Pc(779) Class23 local779;
					if (Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1 == null || Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass23_1260 == null) {
						local779 = Static76.aClass23_1212;
					} else {
						local779 = Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1.aClass23_1260;
					}
					local115.method836(Static17.method233(new Class23[] { local779, Static34.aClass23_601 }), 4, 90, 0);
					local115.method836(Static17.method233(new Class23[] { Static104.aClass23_1529, Static18.aClass23_291 }), local115.method850(Static17.method233(new Class23[] { local779, Static7.aClass23_143 })) + 6, 90, 255);
					Static24.method1585(0, 77, 479, 0);
				} else {
					local260 = Static51.method992(96, 3, 479, Static56.anInt1733);
					if (!local260) {
						Static102.aBoolean123 = true;
					}
				}
			} else {
				Static2.aClass1_Sub1_Sub6_Sub2_13.method849(Static110.aClass23_1695, 10, 20, 459, 40, 0, false, 1, 1, 0);
				Static2.aClass1_Sub1_Sub6_Sub2_13.method832(Static7.aClass23_135, 239, 80, 128);
			}
		}
		if (Static74.aBoolean90 && Static96.anInt1798 == 2) {
			Static61.method1201();
		}
		Static27.method440();
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	public static void method596() {
		Static87.aClass5_63.method99();
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public static void method597() {
		@Pc(16) int local16;
		if (Static31.anInt961 > 0) {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static31.anInt961 > 768) {
					Static50.anIntArray186[local16] = Static10.method111(Static46.anIntArray183[local16], Static9.anIntArray40[local16], 1024 - Static31.anInt961);
				} else if (Static31.anInt961 > 256) {
					Static50.anIntArray186[local16] = Static9.anIntArray40[local16];
				} else {
					Static50.anIntArray186[local16] = Static10.method111(Static9.anIntArray40[local16], Static46.anIntArray183[local16], 256 - Static31.anInt961);
				}
			}
		} else if (Static21.anInt693 <= 0) {
			for (local16 = 0; local16 < 256; local16++) {
				Static50.anIntArray186[local16] = Static46.anIntArray183[local16];
			}
		} else {
			for (local16 = 0; local16 < 256; local16++) {
				if (Static21.anInt693 > 768) {
					Static50.anIntArray186[local16] = Static10.method111(Static46.anIntArray183[local16], Static97.anIntArray344[local16], 1024 - Static21.anInt693);
				} else if (Static21.anInt693 > 256) {
					Static50.anIntArray186[local16] = Static97.anIntArray344[local16];
				} else {
					Static50.anIntArray186[local16] = Static10.method111(Static97.anIntArray344[local16], Static46.anIntArray183[local16], 256 - Static21.anInt693);
				}
			}
		}
		for (local16 = 0; local16 < 33920; local16++) {
			Static98.aClass34_71.anIntArray210[local16] = Static50.aClass1_Sub1_Sub6_Sub1_5.anIntArray155[local16];
		}
		@Pc(170) int local170 = 0;
		@Pc(172) int local172 = 1152;
		@Pc(186) int local186;
		@Pc(191) int local191;
		@Pc(204) int local204;
		@Pc(211) int local211;
		@Pc(218) int local218;
		@Pc(223) int local223;
		@Pc(228) int local228;
		for (@Pc(174) int local174 = 1; local174 < 255; local174++) {
			local186 = Static42.anIntArray171[local174] * (256 - local174) / 256;
			local191 = local186 + 22;
			if (local191 < 0) {
				local191 = 0;
			}
			local170 += local191;
			for (local204 = local191; local204 < 128; local204++) {
				local211 = Static44.anIntArray176[local170++];
				if (local211 == 0) {
					local172++;
				} else {
					local218 = local211;
					local223 = 256 - local211;
					local228 = Static98.aClass34_71.anIntArray210[local172];
					local211 = Static50.anIntArray186[local211];
					Static98.aClass34_71.anIntArray210[local172++] = (local223 * (local228 & 0xFF00FF) + (local211 & 0xFF00FF) * local218 & 0xFF00FF00) + (local218 * (local211 & 0xFF00) + (local223 * (local228 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			local172 += local191;
		}
		for (local186 = 0; local186 < 33920; local186++) {
			Static2.aClass34_63.anIntArray210[local186] = Static9.aClass1_Sub1_Sub6_Sub1_1.anIntArray155[local186];
		}
		local170 = 0;
		local172 = 1176;
		for (local191 = 1; local191 < 255; local191++) {
			local204 = (256 - local191) * Static42.anIntArray171[local191] / 256;
			local172 += local204;
			local211 = 103 - local204;
			for (local218 = 0; local218 < local211; local218++) {
				local223 = Static44.anIntArray176[local170++];
				if (local223 == 0) {
					local172++;
				} else {
					@Pc(346) int local346 = Static2.aClass34_63.anIntArray210[local172];
					local228 = local223;
					@Pc(353) int local353 = 256 - local223;
					local223 = Static50.anIntArray186[local223];
					Static2.aClass34_63.anIntArray210[local172++] = ((local223 & 0xFF00) * local228 + local353 * (local346 & 0xFF00) & 0xFF0000) + (local353 * (local346 & 0xFF00FF) + local228 * (local223 & 0xFF00FF) & 0xFF00FF00) >> 8;
				}
			}
			local172 += 128 - local204 - local211;
			local170 += 128 - local211;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method598(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static55.aClass61_1);
		arg0.addMouseMotionListener(Static55.aClass61_1);
		arg0.addFocusListener(Static55.aClass61_1);
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)I")
	public static int method599() {
		return Static95.anInt2498++;
	}
}
