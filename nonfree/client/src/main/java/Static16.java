import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static16 {

	@OriginalMember(owner = "client!ce", name = "i", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
	public static int anInt489;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "Lclient!qd;")
	public static Class2_Sub1_Sub4_Sub3 aClass2_Sub1_Sub4_Sub3_5;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
	public static int anInt480 = 0;

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "Lclient!wb;")
	private static Class65 aClass65_252 = Static24.method441("Enter name of player to delete from list");

	@OriginalMember(owner = "client!ce", name = "H", descriptor = "Lclient!wb;")
	private static Class65 aClass65_255 = Static24.method441("Loaded textures");

	@OriginalMember(owner = "client!ce", name = "p", descriptor = "Lclient!wb;")
	public static Class65 aClass65_253 = aClass65_255;

	@OriginalMember(owner = "client!ce", name = "u", descriptor = "Lclient!wb;")
	public static Class65 aClass65_254 = aClass65_252;

	@OriginalMember(owner = "client!ce", name = "F", descriptor = "[Lclient!ec;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array5 = new Class2_Sub1_Sub4_Sub2[1000];

	@OriginalMember(owner = "client!ce", name = "G", descriptor = "I")
	public static int anInt497 = 0;

	@OriginalMember(owner = "client!ce", name = "J", descriptor = "Lclient!wb;")
	private static Class65 aClass65_257 = Static24.method441("flash1:");

	@OriginalMember(owner = "client!ce", name = "I", descriptor = "Lclient!wb;")
	public static Class65 aClass65_256 = aClass65_257;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)Lclient!wb;")
	public static Class65 method314(@OriginalArg(1) int arg0) {
		return Static13.method282(new Class65[] { Static93.method1617(arg0 >> 24 & 0xFF), Static50.aClass65_637, Static93.method1617(arg0 >> 16 & 0xFF), Static50.aClass65_637, Static93.method1617(arg0 >> 8 & 0xFF), Static50.aClass65_637, Static93.method1617(arg0 & 0xFF) });
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIZIZIII)Z")
	public static boolean method315(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) boolean arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static85.anIntArrayArray20[local3][local7] = 0;
				Static51.anIntArrayArray13[local3][local7] = 99999999;
			}
		}
		Static85.anIntArrayArray20[arg1][arg9] = 99;
		Static51.anIntArrayArray13[arg1][arg9] = 0;
		local7 = arg1;
		@Pc(51) int local51 = arg9;
		@Pc(53) byte local53 = 0;
		@Pc(55) boolean local55 = false;
		Static32.anIntArray147[0] = arg1;
		@Pc(61) int local61 = 0;
		@Pc(64) int local64 = local53 + 1;
		Static68.anIntArray277[0] = arg9;
		@Pc(69) int local69 = Static32.anIntArray147.length;
		@Pc(74) int[][] local74 = Static84.aClass58Array1[Static62.anInt1879].anIntArrayArray25;
		@Pc(185) int local185;
		while (local61 != local64) {
			local7 = Static32.anIntArray147[local61];
			local51 = Static68.anIntArray277[local61];
			local61 = (local61 + 1) % local69;
			if (arg8 == local7 && arg10 == local51) {
				local55 = true;
				break;
			}
			if (arg6 != 0) {
				if ((arg6 < 5 || arg6 == 10) && Static84.aClass58Array1[Static62.anInt1879].method1730(arg0, local51, arg6 - 1, arg10, local7, arg8)) {
					local55 = true;
					break;
				}
				if (arg6 < 10 && Static84.aClass58Array1[Static62.anInt1879].method1731(arg0, arg10, local51, local7, arg8, arg6 - 1)) {
					local55 = true;
					break;
				}
			}
			if (arg3 != 0 && arg2 != 0 && Static84.aClass58Array1[Static62.anInt1879].method1725(local51, arg4, arg3, local7, arg2, arg8, arg10)) {
				local55 = true;
				break;
			}
			local185 = Static51.anIntArrayArray13[local7][local51] + 1;
			if (local7 > 0 && Static85.anIntArrayArray20[local7 - 1][local51] == 0 && (local74[local7 - 1][local51] & 0x1280108) == 0) {
				Static32.anIntArray147[local64] = local7 - 1;
				Static68.anIntArray277[local64] = local51;
				Static85.anIntArrayArray20[local7 - 1][local51] = 2;
				Static51.anIntArrayArray13[local7 - 1][local51] = local185;
				local64 = (local64 + 1) % local69;
			}
			if (local7 < 103 && Static85.anIntArrayArray20[local7 + 1][local51] == 0 && (local74[local7 + 1][local51] & 0x1280180) == 0) {
				Static32.anIntArray147[local64] = local7 + 1;
				Static68.anIntArray277[local64] = local51;
				local64 = (local64 + 1) % local69;
				Static85.anIntArrayArray20[local7 + 1][local51] = 8;
				Static51.anIntArrayArray13[local7 + 1][local51] = local185;
			}
			if (local51 > 0 && Static85.anIntArrayArray20[local7][local51 - 1] == 0 && (local74[local7][local51 - 1] & 0x1280102) == 0) {
				Static32.anIntArray147[local64] = local7;
				Static68.anIntArray277[local64] = local51 - 1;
				Static85.anIntArrayArray20[local7][local51 - 1] = 1;
				local64 = (local64 + 1) % local69;
				Static51.anIntArrayArray13[local7][local51 - 1] = local185;
			}
			if (local51 < 103 && Static85.anIntArrayArray20[local7][local51 + 1] == 0 && (local74[local7][local51 + 1] & 0x1280120) == 0) {
				Static32.anIntArray147[local64] = local7;
				Static68.anIntArray277[local64] = local51 + 1;
				local64 = (local64 + 1) % local69;
				Static85.anIntArrayArray20[local7][local51 + 1] = 4;
				Static51.anIntArrayArray13[local7][local51 + 1] = local185;
			}
			if (local7 > 0 && local51 > 0 && Static85.anIntArrayArray20[local7 - 1][local51 - 1] == 0 && (local74[local7 - 1][local51 - 1] & 0x128010E) == 0 && (local74[local7 - 1][local51] & 0x1280108) == 0 && (local74[local7][local51 - 1] & 0x1280102) == 0) {
				Static32.anIntArray147[local64] = local7 - 1;
				Static68.anIntArray277[local64] = local51 - 1;
				local64 = (local64 + 1) % local69;
				Static85.anIntArrayArray20[local7 - 1][local51 - 1] = 3;
				Static51.anIntArrayArray13[local7 - 1][local51 - 1] = local185;
			}
			if (local7 < 103 && local51 > 0 && Static85.anIntArrayArray20[local7 + 1][local51 - 1] == 0 && (local74[local7 + 1][local51 - 1] & 0x1280183) == 0 && (local74[local7 + 1][local51] & 0x1280180) == 0 && (local74[local7][local51 - 1] & 0x1280102) == 0) {
				Static32.anIntArray147[local64] = local7 + 1;
				Static68.anIntArray277[local64] = local51 - 1;
				Static85.anIntArrayArray20[local7 + 1][local51 - 1] = 9;
				local64 = (local64 + 1) % local69;
				Static51.anIntArrayArray13[local7 + 1][local51 - 1] = local185;
			}
			if (local7 > 0 && local51 < 103 && Static85.anIntArrayArray20[local7 - 1][local51 + 1] == 0 && (local74[local7 - 1][local51 + 1] & 0x1280138) == 0 && (local74[local7 - 1][local51] & 0x1280108) == 0 && (local74[local7][local51 + 1] & 0x1280120) == 0) {
				Static32.anIntArray147[local64] = local7 - 1;
				Static68.anIntArray277[local64] = local51 + 1;
				Static85.anIntArrayArray20[local7 - 1][local51 + 1] = 6;
				Static51.anIntArrayArray13[local7 - 1][local51 + 1] = local185;
				local64 = (local64 + 1) % local69;
			}
			if (local7 < 103 && local51 < 103 && Static85.anIntArrayArray20[local7 + 1][local51 + 1] == 0 && (local74[local7 + 1][local51 + 1] & 0x12801E0) == 0 && (local74[local7 + 1][local51] & 0x1280180) == 0 && (local74[local7][local51 + 1] & 0x1280120) == 0) {
				Static32.anIntArray147[local64] = local7 + 1;
				Static68.anIntArray277[local64] = local51 + 1;
				local64 = (local64 + 1) % local69;
				Static85.anIntArrayArray20[local7 + 1][local51 + 1] = 12;
				Static51.anIntArrayArray13[local7 + 1][local51 + 1] = local185;
			}
		}
		Static85.anInt2462 = 0;
		@Pc(798) int local798;
		@Pc(805) int local805;
		@Pc(812) int local812;
		if (!local55) {
			if (!arg7) {
				return false;
			}
			local185 = 1000;
			local798 = 100;
			for (local805 = arg8 - 10; local805 <= arg8 + 10; local805++) {
				for (local812 = arg10 - 10; local812 <= arg10 + 10; local812++) {
					if (local805 >= 0 && local812 >= 0 && local805 < 104 && local812 < 104 && Static51.anIntArrayArray13[local805][local812] < 100) {
						@Pc(841) int local841 = 0;
						if (local812 < arg10) {
							local841 = arg10 - local812;
						} else if (arg2 + arg10 - 1 < local812) {
							local841 = local812 + 1 - arg10 - arg2;
						}
						@Pc(877) int local877 = 0;
						if (local805 < arg8) {
							local877 = arg8 - local805;
						} else if (arg8 + arg3 - 1 < local805) {
							local877 = local805 + 1 - arg3 - arg8;
						}
						@Pc(913) int local913 = local841 * local841 + local877 * local877;
						if (local185 > local913 || local185 == local913 && Static51.anIntArrayArray13[local805][local812] < local798) {
							local185 = local913;
							local7 = local805;
							local798 = Static51.anIntArrayArray13[local805][local812];
							local51 = local812;
						}
					}
				}
			}
			if (local185 == 1000) {
				return false;
			}
			if (arg1 == local7 && arg9 == local51) {
				return false;
			}
			Static85.anInt2462 = 1;
		}
		@Pc(983) byte local983 = 0;
		Static32.anIntArray147[0] = local7;
		local61 = local983 + 1;
		Static68.anIntArray277[0] = local51;
		local185 = local798 = Static85.anIntArrayArray20[local7][local51];
		while (local7 != arg1 || local51 != arg9) {
			if (local185 != local798) {
				Static32.anIntArray147[local61] = local7;
				Static68.anIntArray277[local61++] = local51;
				local798 = local185;
			}
			if ((local185 & 0x2) != 0) {
				local7++;
			} else if ((local185 & 0x8) != 0) {
				local7--;
			}
			if ((local185 & 0x1) != 0) {
				local51++;
			} else if ((local185 & 0x4) != 0) {
				local51--;
			}
			local185 = Static85.anIntArrayArray20[local7][local51];
		}
		if (local61 > 0) {
			local69 = local61;
			if (local61 > 25) {
				local69 = 25;
			}
			local61--;
			@Pc(1086) int local1086 = Static32.anIntArray147[local61];
			local805 = Static68.anIntArray277[local61];
			if (arg5 == 0) {
				Static12.aClass2_Sub8_Sub1_8.method1425(62);
				Static12.aClass2_Sub8_Sub1_8.method1375(local69 + local69 + 3);
			}
			if (arg5 == 1) {
				Static12.aClass2_Sub8_Sub1_8.method1425(197);
				Static12.aClass2_Sub8_Sub1_8.method1375(local69 + local69 + 17);
			}
			if (arg5 == 2) {
				Static12.aClass2_Sub8_Sub1_8.method1425(199);
				Static12.aClass2_Sub8_Sub1_8.method1375(local69 + local69 + 3);
			}
			Static12.aClass2_Sub8_Sub1_8.method1375(Static68.aBooleanArray19[82] ? 1 : 0);
			Static12.aClass2_Sub8_Sub1_8.method1392(local805 + Static37.anInt1220);
			Static12.aClass2_Sub8_Sub1_8.method1398(local1086 + Static107.anInt2849);
			Static99.anInt2533 = Static32.anIntArray147[0];
			Static54.anInt1641 = Static68.anIntArray277[0];
			for (local812 = 1; local812 < local69; local812++) {
				local61--;
				Static12.aClass2_Sub8_Sub1_8.method1397(Static32.anIntArray147[local61] - local1086);
				Static12.aClass2_Sub8_Sub1_8.method1397(Static68.anIntArray277[local61] - local805);
			}
			return true;
		} else if (arg5 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V")
	public static void method318() {
		aClass65_255 = null;
		aClass65_253 = null;
		aClass65_254 = null;
		anImage1 = null;
		aClass65_256 = null;
		aClass2_Sub1_Sub4_Sub3_5 = null;
		aClass2_Sub1_Sub4_Sub2Array5 = null;
		aClass65_257 = null;
		aClass65_252 = null;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public static void method319() {
		for (@Pc(10) Class2_Sub1_Sub1_Sub1 local10 = (Class2_Sub1_Sub1_Sub1) Static45.aClass52_7.method1587(); local10 != null; local10 = (Class2_Sub1_Sub1_Sub1) Static45.aClass52_7.method1588()) {
			if (local10.anInt127 != Static62.anInt1879 || local10.anInt110 < Static108.anInt2902) {
				local10.method1794();
			} else if (local10.anInt124 <= Static108.anInt2902) {
				if (local10.anInt126 > 0) {
					@Pc(45) Class2_Sub1_Sub1_Sub2_Sub1 local45 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local10.anInt126 - 1];
					if (local45 != null && local45.anInt1518 >= 0 && local45.anInt1518 < 13312 && local45.anInt1562 >= 0 && local45.anInt1562 < 13312) {
						local10.method59(local45.anInt1518, Static25.method447(local10.anInt127, local45.anInt1562, local45.anInt1518) - local10.anInt108, local45.anInt1562, Static108.anInt2902);
					}
				}
				if (local10.anInt126 < 0) {
					@Pc(98) int local98 = -local10.anInt126 - 1;
					@Pc(109) Class2_Sub1_Sub1_Sub2_Sub2 local109;
					if (local98 == Static47.anInt1379) {
						local109 = Static37.aClass2_Sub1_Sub1_Sub2_Sub2_1;
					} else {
						local109 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local98];
					}
					if (local109 != null && local109.anInt1518 >= 0 && local109.anInt1518 < 13312 && local109.anInt1562 >= 0 && local109.anInt1562 < 13312) {
						local10.method59(local109.anInt1518, Static25.method447(local10.anInt127, local109.anInt1562, local109.anInt1518) - local10.anInt108, local109.anInt1562, Static108.anInt2902);
					}
				}
				local10.method58(Static28.anInt794);
				Static67.aClass18_1.method576(Static62.anInt1879, (int) local10.aDouble8, (int) local10.aDouble3, (int) local10.aDouble2, 60, local10, local10.anInt121, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([BIII)Z")
	public static boolean method320(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) boolean local12 = true;
		@Pc(17) Class2_Sub8 local17 = new Class2_Sub8(arg0);
		@Pc(19) int local19 = -1;
		label67: while (true) {
			@Pc(23) int local23 = local17.method1376();
			if (local23 == 0) {
				return local12;
			}
			local19 += local23;
			@Pc(31) int local31 = 0;
			@Pc(33) boolean local33 = false;
			while (true) {
				@Pc(63) int local63;
				@Pc(93) Class2_Sub1_Sub14 local93;
				do {
					@Pc(68) int local68;
					@Pc(72) int local72;
					do {
						do {
							do {
								do {
									@Pc(39) int local39;
									while (local33) {
										local39 = local17.method1376();
										if (local39 == 0) {
											continue label67;
										}
										local17.method1410();
									}
									local39 = local17.method1376();
									if (local39 == 0) {
										continue label67;
									}
									local31 += local39 - 1;
									@Pc(51) int local51 = local31 & 0x3F;
									@Pc(57) int local57 = local31 >> 6 & 0x3F;
									local63 = local17.method1410() >> 2;
									local68 = local57 + arg1;
									local72 = arg2 + local51;
								} while (local68 <= 0);
							} while (local72 <= 0);
						} while (local68 >= 103);
					} while (local72 >= 103);
					local93 = Static29.method518(local19);
				} while (local63 == 22 && Static4.aBoolean16 && local93.anInt2616 == 0 && !local93.aBoolean143);
				if (!local93.method1608()) {
					Static98.anInt2762++;
					local12 = false;
				}
				local33 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	public static void method322() {
		if (Static80.anInt2291 == 0 && Static37.anInt1224 == 0) {
			Static47.method820(Static85.anInt2459, 0, Static22.aClass65_308, Static8.aClass65_145, 28, anInt480);
		}
		@Pc(29) int local29 = -1;
		for (@Pc(31) int local31 = 0; local31 < Static86.anInt2517; local31++) {
			@Pc(42) int local42 = Static86.anIntArray349[local31];
			@Pc(46) int local46 = local42 & 0x7F;
			@Pc(52) int local52 = local42 >> 7 & 0x7F;
			@Pc(58) int local58 = local42 >> 29 & 0x3;
			@Pc(64) int local64 = local42 >> 14 & 0x7FFF;
			if (local42 != local29) {
				local29 = local42;
				@Pc(126) int local126;
				if (local58 == 2 && Static67.aClass18_1.method620(Static62.anInt1879, local46, local52, local42) >= 0) {
					@Pc(92) Class2_Sub1_Sub14 local92 = Static29.method518(local64);
					if (local92.anIntArray384 != null) {
						local92 = local92.method1612();
					}
					if (local92 == null) {
						continue;
					}
					if (Static80.anInt2291 == 1) {
						Static47.method820(local52, local42, Static22.aClass65_311, Static13.method282(new Class65[] { Static99.aClass65_1144, Static17.aClass65_270, local92.aClass65_1184 }), 13, local46);
					} else if (Static37.anInt1224 != 1) {
						@Pc(112) Class65[] local112 = local92.aClass65Array13;
						if (Static55.aBoolean91) {
							local112 = Static78.method346(local112);
						}
						if (local112 != null) {
							for (local126 = 4; local126 >= 0; local126--) {
								if (local112[local126] != null) {
									@Pc(134) short local134 = 0;
									if (local126 == 0) {
										local134 = 49;
									}
									if (local126 == 1) {
										local134 = 3;
									}
									if (local126 == 2) {
										local134 = 39;
									}
									if (local126 == 3) {
										local134 = 1;
									}
									if (local126 == 4) {
										local134 = 1005;
									}
									Static47.method820(local52, local42, local112[local126], Static13.method282(new Class65[] { Static8.aClass65_143, local92.aClass65_1184 }), local134, local46);
								}
							}
						}
						Static47.method820(local52, local92.anInt2620 << 14, Static85.aClass65_1102, Static13.method282(new Class65[] { Static8.aClass65_143, local92.aClass65_1184 }), 1003, local46);
					} else if ((Static39.anInt1259 & 0x4) == 4) {
						Static47.method820(local52, local42, Static80.aClass65_1042, Static13.method282(new Class65[] { Static29.aClass65_387, Static17.aClass65_270, local92.aClass65_1184 }), 44, local46);
					}
				}
				@Pc(317) int local317;
				@Pc(325) Class2_Sub1_Sub1_Sub2_Sub1 local325;
				@Pc(370) Class2_Sub1_Sub1_Sub2_Sub2 local370;
				if (local58 == 1) {
					@Pc(296) Class2_Sub1_Sub1_Sub2_Sub1 local296 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[local64];
					if (local296.aClass2_Sub1_Sub11_1.anInt2105 == 1 && (local296.anInt1518 & 0x7F) == 64 && (local296.anInt1562 & 0x7F) == 64) {
						for (local317 = 0; local317 < Static51.anInt1482; local317++) {
							local325 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[Static23.anIntArray92[local317]];
							if (local325 != null && local325 != local296 && local325.aClass2_Sub1_Sub11_1.anInt2105 == 1 && local296.anInt1518 == local325.anInt1518 && local296.anInt1562 == local325.anInt1562) {
								Static53.method1145(local52, local46, local325.aClass2_Sub1_Sub11_1, Static23.anIntArray92[local317]);
							}
						}
						for (local126 = 0; local126 < Static54.anInt1640; local126++) {
							local370 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[Static24.anIntArray99[local126]];
							if (local370 != null && local296.anInt1518 == local370.anInt1518 && local296.anInt1562 == local370.anInt1562) {
								Static42.method809(Static24.anIntArray99[local126], local370, local46, local52);
							}
						}
					}
					Static53.method1145(local52, local46, local296.aClass2_Sub1_Sub11_1, local64);
				}
				if (local58 == 0) {
					@Pc(414) Class2_Sub1_Sub1_Sub2_Sub2 local414 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[local64];
					if ((local414.anInt1518 & 0x7F) == 64 && (local414.anInt1562 & 0x7F) == 64) {
						for (local317 = 0; local317 < Static51.anInt1482; local317++) {
							local325 = Static24.aClass2_Sub1_Sub1_Sub2_Sub1Array1[Static23.anIntArray92[local317]];
							if (local325 != null && local325.aClass2_Sub1_Sub11_1.anInt2105 == 1 && local414.anInt1518 == local325.anInt1518 && local325.anInt1562 == local414.anInt1562) {
								Static53.method1145(local52, local46, local325.aClass2_Sub1_Sub11_1, Static23.anIntArray92[local317]);
							}
						}
						for (local126 = 0; local126 < Static54.anInt1640; local126++) {
							local370 = Static89.aClass2_Sub1_Sub1_Sub2_Sub2Array1[Static24.anIntArray99[local126]];
							if (local370 != null && local370 != local414 && local414.anInt1518 == local370.anInt1518 && local414.anInt1562 == local370.anInt1562) {
								Static42.method809(Static24.anIntArray99[local126], local370, local46, local52);
							}
						}
					}
					Static42.method809(local64, local414, local46, local52);
				}
				if (local58 == 3) {
					@Pc(540) Class52 local540 = Static22.aClass52ArrayArrayArray1[Static62.anInt1879][local46][local52];
					if (local540 != null) {
						for (@Pc(547) Class2_Sub1_Sub1_Sub3 local547 = (Class2_Sub1_Sub1_Sub3) local540.method1589(); local547 != null; local547 = (Class2_Sub1_Sub1_Sub3) local540.method1585()) {
							@Pc(554) Class2_Sub1_Sub8 local554 = Static70.method1263(local547.anInt1292);
							if (Static80.anInt2291 == 1) {
								Static47.method820(local52, local547.anInt1292, Static22.aClass65_311, Static13.method282(new Class65[] { Static99.aClass65_1144, Static5.aClass65_111, local554.aClass65_820 }), 23, local46);
							} else if (Static37.anInt1224 != 1) {
								@Pc(569) Class65[] local569 = local554.aClass65Array6;
								if (Static55.aBoolean91) {
									local569 = Static78.method346(local569);
								}
								for (@Pc(577) int local577 = 4; local577 >= 0; local577--) {
									if (local569 != null && local569[local577] != null) {
										@Pc(587) byte local587 = 0;
										if (local577 == 0) {
											local587 = 14;
										}
										if (local577 == 1) {
											local587 = 42;
										}
										if (local577 == 2) {
											local587 = 9;
										}
										if (local577 == 3) {
											local587 = 47;
										}
										if (local577 == 4) {
											local587 = 46;
										}
										Static47.method820(local52, local547.anInt1292, local569[local577], Static13.method282(new Class65[] { Static42.aClass65_597, local554.aClass65_820 }), local587, local46);
									} else if (local577 == 2) {
										Static47.method820(local52, local547.anInt1292, Static98.aClass65_1230, Static13.method282(new Class65[] { Static42.aClass65_597, local554.aClass65_820 }), 9, local46);
									}
								}
								Static47.method820(local52, local547.anInt1292, Static85.aClass65_1102, Static13.method282(new Class65[] { Static42.aClass65_597, local554.aClass65_820 }), 1001, local46);
							} else if ((Static39.anInt1259 & 0x1) == 1) {
								Static47.method820(local52, local547.anInt1292, Static80.aClass65_1042, Static13.method282(new Class65[] { Static29.aClass65_387, Static5.aClass65_111, local554.aClass65_820 }), 25, local46);
							}
						}
					}
				}
			}
		}
	}
}
