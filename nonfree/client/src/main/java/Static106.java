import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Lclient!ja;")
	public static Class33 aClass33_33;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1443 = Static23.method501("Error loading your profile)3");

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1444 = Static23.method501("und die Schaltfl-=che (WSpielkonto erstellen(W am");

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1445 = aClass42_1443;

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!mc;")
	private static Class42 aClass42_1446 = Static23.method501("glow1:");

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1447 = aClass42_1446;

	@OriginalMember(owner = "client!wa", name = "g", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1448 = Static23.method501("Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
	public static int anInt2737 = 0;

	@OriginalMember(owner = "client!wa", name = "l", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1449 = Static23.method501("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!wa", name = "n", descriptor = "Lclient!mc;")
	public static Class42 aClass42_1450 = Static23.method501("lila:");

	@OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
	public static final int anInt2740 = 0;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BII[B)I")
	public static int method1844(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(7) int local7 = arg0; local7 < arg1; local7++) {
			local1 = local1 >>> 8 ^ Class1_Sub1_Sub11.anIntArray247[(arg2[local7] ^ local1) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(BIILclient!j;I)V")
	public static void method1845(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub1_Sub3 arg2, @OriginalArg(4) int arg3) {
		Static28.aClass31_14.method996();
		Static72.aClass1_Sub1_Sub1_Sub4_19.method1147(0, 0);
		arg2.method819(Static8.aClass42_133, 55, 28, 16777215, true);
		if (arg0 == 0) {
			arg2.method819(Static61.aClass42_792, 55, 41, 65280, true);
		}
		if (arg0 == 1) {
			arg2.method819(Static10.aClass42_183, 55, 41, 16776960, true);
		}
		if (arg0 == 2) {
			arg2.method819(Static1.aClass42_12, 55, 41, 16711680, true);
		}
		if (arg0 == 3) {
			arg2.method819(Static10.aClass42_186, 55, 41, 65535, true);
		}
		arg2.method819(Static18.aClass42_321, 184, 28, 16777215, true);
		if (arg1 == 0) {
			arg2.method819(Static61.aClass42_792, 184, 41, 65280, true);
		}
		if (arg1 == 1) {
			arg2.method819(Static10.aClass42_183, 184, 41, 16776960, true);
		}
		if (arg1 == 2) {
			arg2.method819(Static1.aClass42_12, 184, 41, 16711680, true);
		}
		arg2.method819(Static58.aClass42_778, 324, 28, 16777215, true);
		if (arg3 == 0) {
			arg2.method819(Static61.aClass42_792, 324, 41, 65280, true);
		}
		if (arg3 == 1) {
			arg2.method819(Static10.aClass42_183, 324, 41, 16776960, true);
		}
		if (arg3 == 2) {
			arg2.method819(Static1.aClass42_12, 324, 41, 16711680, true);
		}
		arg2.method819(Static42.aClass42_1384, 458, 33, 16777215, true);
		try {
			@Pc(160) Graphics local160 = Static89.aCanvas1.getGraphics();
			Static28.aClass31_14.method993(0, local160, 453);
		} catch (@Pc(168) Exception local168) {
			Static89.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ja;I)V")
	public static void method1846(@OriginalArg(0) Class33 arg0) {
		Static49.aClass33_14 = arg0;
		Static16.anInt567 = Static49.aClass33_14.method1299(16);
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method1847() {
		aClass33_33 = null;
		aClass42_1443 = null;
		aClass42_1446 = null;
		aClass42_1449 = null;
		aClass42_1448 = null;
		aClass42_1450 = null;
		aClass42_1444 = null;
		aClass42_1447 = null;
		aClass42_1445 = null;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIBIIIII)Z")
	public static boolean method1848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (!Static107.method1831(arg1)) {
			return false;
		}
		Static55.method1130(arg2, arg5, arg7, arg6);
		@Pc(18) boolean local18 = true;
		@Pc(22) Class1_Sub1_Sub12[] local22 = Static61.aClass1_Sub1_Sub12ArrayArray1[arg1];
		for (@Pc(29) int local29 = 0; local29 < local22.length; local29++) {
			@Pc(35) Class1_Sub1_Sub12 local35 = local22[local29];
			if (local35 != null && arg0 == local35.anInt2191) {
				if (local35.anInt2160 > 0) {
					Static101.method1772(local35);
				}
				@Pc(61) int local61 = arg5 + local35.anInt2161 - arg4;
				@Pc(66) int local66 = arg2 + local35.anInt2172;
				if (local35.anInt2177 == 0) {
					if (local35.aBoolean122 && !Static59.method1428(arg3, local29)) {
						continue;
					}
					if (local35.anInt2192 - local35.anInt2183 < local35.anInt2152) {
						local35.anInt2152 = local35.anInt2192 - local35.anInt2183;
					}
					if (local35.anInt2152 < 0) {
						local35.anInt2152 = 0;
					}
					local18 &= method1848(local29, arg1, local66, arg3, local35.anInt2152, local61, local61 + local35.anInt2183, local66 - -local35.anInt2185);
					Static55.method1130(arg2, arg5, arg7, arg6);
					if (local35.anInt2192 > local35.anInt2183) {
						Static17.method423(local35.anInt2152, local35.anInt2192, local66 + local35.anInt2185, local35.anInt2183, local61);
					}
				}
				if (local35.anInt2177 != 1) {
					@Pc(170) int local170;
					@Pc(174) int local174;
					@Pc(186) int local186;
					@Pc(224) int local224;
					@Pc(233) int local233;
					@Pc(260) int local260;
					@Pc(168) int local168;
					@Pc(226) int local226;
					if (local35.anInt2177 == 2) {
						local168 = 0;
						for (local170 = 0; local170 < local35.anInt2183; local170++) {
							for (local174 = 0; local174 < local35.anInt2185; local174++) {
								local186 = local66 + (local35.anInt2153 + 32) * local174;
								@Pc(195) int local195 = local61 + (local35.anInt2174 + 32) * local170;
								if (local168 < 20) {
									local186 += local35.anIntArray334[local168];
									local195 += local35.anIntArray331[local168];
								}
								if (local35.anIntArray332[local168] > 0) {
									local224 = 0;
									local226 = 0;
									local233 = local35.anIntArray332[local168] - 1;
									if (Static55.anInt1617 - 32 < local186 && Static55.anInt1620 > local186 && Static55.anInt1618 - 32 < local195 && local195 < Static55.anInt1619 || Static30.anInt828 != 0 && local168 == Static109.anInt2754) {
										local260 = 0;
										if (Static35.anInt874 == 1 && local168 == Static81.anInt2124 && Static99.anInt2515 == local29 + (arg1 << 16)) {
											local260 = 16777215;
										}
										@Pc(294) Class1_Sub1_Sub1_Sub1 local294 = Static36.method620(local35.anIntArray330[local168], local260, local233);
										if (local294 == null) {
											local18 = false;
										} else {
											if (Static30.anInt828 != 0 && Static109.anInt2754 == local168 && (arg1 << 16) + local29 == Static25.anInt729) {
												local224 = Static38.anInt948 - Static5.anInt138;
												local226 = Static73.anInt1884 - Static13.anInt459;
												if (local224 < 5 && local224 > -5) {
													local224 = 0;
												}
												if (local226 < 5 && local226 > -5) {
													local226 = 0;
												}
												if (Static91.anInt2401 < 5) {
													local224 = 0;
													local226 = 0;
												}
												local294.method83(local186 + local226, local224 + local195);
												if (arg0 != -1) {
													@Pc(367) Class1_Sub1_Sub12 local367 = local22[arg0];
													@Pc(386) int local386;
													if (local224 + local195 < Static55.anInt1618 && local367.anInt2152 > 0) {
														local386 = Static59.anInt1992 * (Static55.anInt1618 - local195 - local224) / 3;
														if (local386 > Static59.anInt1992 * 10) {
															local386 = Static59.anInt1992 * 10;
														}
														if (local386 > local367.anInt2152) {
															local386 = local367.anInt2152;
														}
														local367.anInt2152 -= local386;
														Static5.anInt138 += local386;
													}
													if (local195 + local224 + 32 > Static55.anInt1619 && local367.anInt2152 < local367.anInt2192 - local367.anInt2183) {
														local386 = Static59.anInt1992 * (local195 + local224 + 32 - Static55.anInt1619) / 3;
														if (local386 > Static59.anInt1992 * 10) {
															local386 = Static59.anInt1992 * 10;
														}
														if (local386 > local367.anInt2192 - local367.anInt2183 - local367.anInt2152) {
															local386 = local367.anInt2192 - local367.anInt2152 - local367.anInt2183;
														}
														local367.anInt2152 += local386;
														Static5.anInt138 -= local386;
													}
												}
											} else if (Static37.anInt921 != 0 && Static63.anInt1525 == local168 && Static27.anInt778 == local29 + (arg1 << 16)) {
												local294.method83(local186, local195);
											} else {
												local294.method82(local186, local195);
											}
											if (local294.anInt89 == 33 || local35.anIntArray330[local168] != 1) {
												@Pc(536) int local536 = local35.anIntArray330[local168];
												Static37.aClass1_Sub1_Sub1_Sub3_2.method818(Static89.method1646(local536), local226 + local186 + 1, local195 + 10 + local224, 0);
												Static37.aClass1_Sub1_Sub1_Sub3_2.method818(Static89.method1646(local536), local226 + local186, local195 - -9 - -local224, 16776960);
											}
										}
									}
								} else if (local35.anIntArray328 != null && local168 < 20) {
									@Pc(580) Class1_Sub1_Sub1_Sub1 local580 = local35.method1505(local168);
									if (local580 != null) {
										local580.method82(local186, local195);
									} else if (Static39.aBoolean17) {
										local18 = false;
									}
								}
								local168++;
							}
						}
					} else if (local35.anInt2177 == 3) {
						if (Static23.method505(local35)) {
							local168 = local35.anInt2167;
							if (Static59.method1428(arg3, local29) && local35.anInt2187 != 0) {
								local168 = local35.anInt2187;
							}
						} else {
							local168 = local35.anInt2148;
							if (Static59.method1428(arg3, local29) && local35.anInt2181 != 0) {
								local168 = local35.anInt2181;
							}
						}
						if (local35.anInt2149 == 0) {
							if (local35.aBoolean124) {
								Static55.method1129(local66, local61, local35.anInt2185, local35.anInt2183, local168);
							} else {
								Static55.method1138(local66, local61, local35.anInt2185, local35.anInt2183, local168);
							}
						} else if (local35.aBoolean124) {
							Static55.method1131(local66, local61, local35.anInt2185, local35.anInt2183, local168, 256 - (local35.anInt2149 & 0xFF));
						} else {
							Static55.method1137(local66, local61, local35.anInt2185, local35.anInt2183, local168, 256 - (local35.anInt2149 & 0xFF));
						}
					} else {
						@Pc(724) Class1_Sub1_Sub1_Sub3 local724;
						if (local35.anInt2177 == 4) {
							local724 = local35.method1502();
							if (local724 != null) {
								@Pc(735) Class42 local735 = local35.aClass42_1166;
								if (Static23.method505(local35)) {
									local170 = local35.anInt2167;
									if (Static59.method1428(arg3, local29) && local35.anInt2187 != 0) {
										local170 = local35.anInt2187;
									}
									if (local35.aClass42_1168.method1027() > 0) {
										local735 = local35.aClass42_1168;
									}
								} else {
									local170 = local35.anInt2148;
									if (Static59.method1428(arg3, local29) && local35.anInt2181 != 0) {
										local170 = local35.anInt2181;
									}
								}
								if (local35.anInt2156 == 6 && Static62.aBoolean87) {
									local735 = Static77.aClass42_1039;
									local170 = local35.anInt2148;
								}
								if (Static55.anInt1622 == 479) {
									if (local170 == 16776960) {
										local170 = 255;
									}
									if (local170 == 49152) {
										local170 = 16777215;
									}
								}
								local735 = Static109.method1853(local35, local735);
								local724.method803(local735, local66, local61, local35.anInt2185, local35.anInt2183, local170, local35.aBoolean118, local35.anInt2166, local35.anInt2150, local35.anInt2178);
							} else if (Static39.aBoolean17) {
								local18 = false;
							}
						} else if (local35.anInt2177 == 5) {
							@Pc(846) Class1_Sub1_Sub1_Sub1 local846 = local35.method1503(Static23.method505(local35));
							if (local846 != null) {
								local846.method82(local66, local61);
							} else if (Static39.aBoolean17) {
								local18 = false;
							}
						} else if (local35.anInt2177 == 6) {
							Static41.method690(local66 + local35.anInt2185 / 2, local35.anInt2183 / 2 + local61);
							local168 = Class1_Sub1_Sub1_Sub2.anIntArray144[local35.anInt2162] * local35.anInt2190 >> 16;
							local170 = local35.anInt2190 * Class1_Sub1_Sub1_Sub2.anIntArray143[local35.anInt2162] >> 16;
							@Pc(903) boolean local903 = Static23.method505(local35);
							if (local903) {
								local186 = local35.anInt2182;
							} else {
								local186 = local35.anInt2154;
							}
							@Pc(925) Class1_Sub1_Sub8_Sub3 local925;
							if (local35.anInt2163 == 5) {
								local925 = Static98.aClass29_1.method632(-1, -1, null, null);
							} else if (local186 == -1) {
								local925 = local35.method1508(-1, local903, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.aClass29_2, null);
								if (local925 == null && Static39.aBoolean17) {
									local18 = false;
								}
							} else {
								@Pc(952) Class1_Sub1_Sub14 local952 = Static30.method574(local186);
								local925 = local35.method1508(local35.anInt2157, local903, Static43.aClass1_Sub1_Sub8_Sub1_Sub2_1.aClass29_2, local952);
								if (local925 == null && Static39.aBoolean17) {
									local18 = false;
								}
							}
							if (local925 != null) {
								local925.method1379(local35.anInt2186, 0, local35.anInt2162, 0, local168, local170);
							}
							Static41.method684();
						} else {
							if (local35.anInt2177 == 7) {
								local724 = local35.method1502();
								if (local724 == null) {
									if (Static39.aBoolean17) {
										local18 = false;
									}
									continue;
								}
								local170 = 0;
								for (local174 = 0; local174 < local35.anInt2183; local174++) {
									for (local186 = 0; local186 < local35.anInt2185; local186++) {
										if (local35.anIntArray332[local170] > 0) {
											@Pc(1024) Class1_Sub1_Sub2 local1024 = Static36.method617(local35.anIntArray332[local170] - 1);
											@Pc(1027) Class42 local1027 = local1024.aClass42_120;
											if (local1027 == null) {
												local1027 = Static53.aClass42_1430;
											}
											if (local1024.aBoolean8 || local35.anIntArray330[local170] != 1) {
												local1027 = Static57.method1822(new Class42[] { local1027, Static48.aClass42_672, Static13.method322(local35.anIntArray330[local170]) });
											}
											local224 = (local35.anInt2153 + 115) * local186 + local66;
											local233 = (local35.anInt2174 + 12) * local174 + local61;
											if (local35.anInt2166 == 0) {
												local724.method807(local1027, local224, local233, local35.anInt2148, local35.aBoolean118);
											} else if (local35.anInt2166 == 1) {
												local724.method819(local1027, local224 + local35.anInt2185 / 2, local233, local35.anInt2148, local35.aBoolean118);
											} else {
												local724.method821(local1027, local224 + local35.anInt2185 - 1, local233, local35.anInt2148, local35.aBoolean118);
											}
										}
										local170++;
									}
								}
							}
							if (local35.anInt2177 == 8 && Static101.method1774(arg3, local29) && Static69.anInt1756 == Static57.anInt2699) {
								local170 = 0;
								local168 = 0;
								@Pc(1177) Class1_Sub1_Sub1_Sub3 local1177 = Static95.aClass1_Sub1_Sub1_Sub3_3;
								@Pc(1180) Class42 local1180 = local35.aClass42_1166;
								local1180 = Static109.method1853(local35, local1180);
								@Pc(1197) Class42 local1197;
								while (local1180.method1027() > 0) {
									local226 = local1180.method1050(Static67.aClass42_868);
									if (local226 == -1) {
										local1197 = local1180;
										local1180 = Static11.aClass42_195;
									} else {
										local1197 = local1180.method1053(0, local226);
										local1180 = local1180.method1051(local226 + 2);
									}
									local224 = local1177.method816(local1197);
									if (local224 > local168) {
										local168 = local224;
									}
									local170 += local1177.anInt1169 + 1;
								}
								local170 += 7;
								local168 += 6;
								local226 = local35.anInt2185 + local66 - local168 - 5;
								local224 = local35.anInt2183 + local61 + 5;
								if (local170 + local224 > arg6) {
									local224 = arg6 - local170;
								}
								if (local226 < local66 + 5) {
									local226 = local66 + 5;
								}
								if (local168 + local226 > arg7) {
									local226 = arg7 - local168;
								}
								Static55.method1129(local226, local224, local168, local170, 16777120);
								Static55.method1138(local226, local224, local168, local170, 0);
								local1180 = local35.aClass42_1166;
								local233 = local224 + local1177.anInt1169 + 2;
								local1180 = Static109.method1853(local35, local1180);
								while (local1180.method1027() > 0) {
									local260 = local1180.method1050(Static67.aClass42_868);
									if (local260 == -1) {
										local1197 = local1180;
										local1180 = Static11.aClass42_195;
									} else {
										local1197 = local1180.method1053(0, local260);
										local1180 = local1180.method1051(local260 + 2);
									}
									local1177.method807(local1197, local226 + 3, local233, 0, false);
									local233 += local1177.anInt1169 + 1;
								}
							}
						}
					}
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lclient!ja;III)[Lclient!nc;")
	public static Class1_Sub1_Sub1_Sub4[] method1849(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		return Static67.method1153(arg2, arg0, arg1) ? Static105.method1843() : null;
	}
}
