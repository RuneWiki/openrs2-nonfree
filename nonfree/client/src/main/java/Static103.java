import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!sb", name = "N", descriptor = "[I")
	public static int[] anIntArray321;

	@OriginalMember(owner = "client!sb", name = "S", descriptor = "Lclient!q;")
	public static Class62_Sub1 aClass62_Sub1_15;

	@OriginalMember(owner = "client!sb", name = "X", descriptor = "Lclient!bf;")
	public static Class10 aClass10_4;

	@OriginalMember(owner = "client!sb", name = "L", descriptor = "Lclient!ob;")
	public static Class3_Sub7 aClass3_Sub7_6 = new Class3_Sub7(new byte[5000]);

	@OriginalMember(owner = "client!sb", name = "U", descriptor = "Lclient!na;")
	private static Class53 aClass53_1191 = Static109.method1737("Accept challenge");

	@OriginalMember(owner = "client!sb", name = "M", descriptor = "Lclient!na;")
	public static Class53 aClass53_1188 = aClass53_1191;

	@OriginalMember(owner = "client!sb", name = "O", descriptor = "Lclient!na;")
	public static Class53 aClass53_1189 = Static109.method1737("Die Verbindung konnte");

	@OriginalMember(owner = "client!sb", name = "Q", descriptor = "Lclient!na;")
	public static Class53 aClass53_1190 = Static109.method1737("Okay");

	@OriginalMember(owner = "client!sb", name = "V", descriptor = "Lclient!na;")
	public static Class53 aClass53_1192 = Static109.method1737("null");

	@OriginalMember(owner = "client!sb", name = "cb", descriptor = "Lclient!na;")
	private static Class53 aClass53_1193 = Static109.method1737("Add ignore");

	@OriginalMember(owner = "client!sb", name = "kb", descriptor = "Lclient!na;")
	private static Class53 aClass53_1199 = Static109.method1737("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!sb", name = "db", descriptor = "Lclient!na;")
	public static Class53 aClass53_1194 = aClass53_1199;

	@OriginalMember(owner = "client!sb", name = "eb", descriptor = "Lclient!na;")
	private static Class53 aClass53_1195 = Static109.method1737("The server is being updated)3");

	@OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
	public static int anInt2416 = 0;

	@OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
	public static final int anInt2417 = 0;

	@OriginalMember(owner = "client!sb", name = "hb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1196 = aClass53_1199;

	@OriginalMember(owner = "client!sb", name = "ib", descriptor = "Lclient!na;")
	public static Class53 aClass53_1197 = aClass53_1195;

	@OriginalMember(owner = "client!sb", name = "jb", descriptor = "Lclient!na;")
	private static Class53 aClass53_1198 = Static109.method1737("Loaded input handler");

	@OriginalMember(owner = "client!sb", name = "lb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1200 = aClass53_1193;

	@OriginalMember(owner = "client!sb", name = "mb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1201 = Static109.method1737("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!sb", name = "nb", descriptor = "Lclient!na;")
	public static Class53 aClass53_1202 = aClass53_1198;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)I")
	public static int method1688(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class3_Sub18 local10 = (Class3_Sub18) Static38.aClass77_4.method1805((long) arg1);
		if (local10 == null) {
			return -1;
		} else if (arg0 >= 0 && arg0 < local10.anIntArray374.length) {
			return local10.anIntArray374[arg0];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z[Lclient!na;)Lclient!na;")
	public static Class53 method1689(@OriginalArg(1) Class53[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static90.method1467(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "(I)V")
	public static void method1690() {
		if (Static91.anInt2201 == 0 && !Static117.aBoolean119) {
			Static59.method1075(57, Static96.aClass53_666, Static35.aClass53_476, 0, Static99.anInt2348, Static105.anInt2433);
		}
		@Pc(26) int local26 = -1;
		for (@Pc(34) int local34 = 0; local34 < Static110.anInt2544; local34++) {
			@Pc(40) int local40 = Static110.anIntArray354[local34];
			@Pc(46) int local46 = local40 >> 14 & 0x7FFF;
			@Pc(52) int local52 = local40 >> 29 & 0x3;
			@Pc(58) int local58 = local40 >> 7 & 0x7F;
			@Pc(62) int local62 = local40 & 0x7F;
			if (local26 != local40) {
				local26 = local40;
				@Pc(142) int local142;
				if (local52 == 2 && Static120.aClass39_1.method985(Static72.anInt1813, local62, local58, local40) >= 0) {
					@Pc(81) Class3_Sub1_Sub2 local81 = Static12.method200(local46);
					if (local81.anIntArray24 != null) {
						local81 = local81.method162();
					}
					if (local81 == null) {
						continue;
					}
					if (Static91.anInt2201 == 1) {
						Static59.method1075(41, Static94.aClass53_1084, method1689(new Class53[] { Static5.aClass53_81, Static86.aClass53_948, local81.aClass53_111 }), local40, local62, local58);
					} else if (!Static117.aBoolean119) {
						@Pc(132) Class53[] local132 = local81.aClass53Array3;
						if (Static120.aBoolean126) {
							local132 = Static53.method1447(local132);
						}
						if (local132 != null) {
							for (local142 = 4; local142 >= 0; local142--) {
								if (local132[local142] != null) {
									@Pc(154) short local154 = 0;
									if (local142 == 0) {
										local154 = 31;
									}
									if (local142 == 1) {
										local154 = 50;
									}
									if (local142 == 2) {
										local154 = 35;
									}
									if (local142 == 3) {
										local154 = 37;
									}
									if (local142 == 4) {
										local154 = 1002;
									}
									Static59.method1075(local154, local132[local142], method1689(new Class53[] { Static42.aClass53_539, local81.aClass53_111 }), local40, local62, local58);
								}
							}
						}
						Static59.method1075(1005, Static115.aClass53_1316, method1689(new Class53[] { Static42.aClass53_539, local81.aClass53_111 }), local81.anInt295 << 14, local62, local58);
					} else if ((Static104.anInt2535 & 0x4) == 4) {
						Static59.method1075(49, Static57.aClass53_672, method1689(new Class53[] { Static102.aClass53_1162, Static86.aClass53_948, local81.aClass53_111 }), local40, local62, local58);
					}
				}
				@Pc(300) int local300;
				@Pc(308) Class3_Sub1_Sub4_Sub1_Sub1 local308;
				@Pc(355) Class3_Sub1_Sub4_Sub1_Sub2 local355;
				if (local52 == 1) {
					@Pc(277) Class3_Sub1_Sub4_Sub1_Sub1 local277 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[local46];
					if (local277.aClass3_Sub1_Sub1_1.anInt137 == 1 && (local277.anInt1424 & 0x7F) == 64 && (local277.anInt1427 & 0x7F) == 64) {
						for (local300 = 0; local300 < Static20.anInt693; local300++) {
							local308 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[Static18.anIntArray49[local300]];
							if (local308 != null && local308 != local277 && local308.aClass3_Sub1_Sub1_1.anInt137 == 1 && local277.anInt1424 == local308.anInt1424 && local308.anInt1427 == local277.anInt1427) {
								Static99.method1644(Static18.anIntArray49[local300], local308.aClass3_Sub1_Sub1_1, local58, local62);
							}
						}
						for (local142 = 0; local142 < Static72.anInt1820; local142++) {
							local355 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[Static71.anIntArray228[local142]];
							if (local355 != null && local277.anInt1424 == local355.anInt1424 && local355.anInt1427 == local277.anInt1427) {
								Static118.method1889(Static71.anIntArray228[local142], local355, local62, local58);
							}
						}
					}
					Static99.method1644(local46, local277.aClass3_Sub1_Sub1_1, local58, local62);
				}
				if (local52 == 0) {
					@Pc(396) Class3_Sub1_Sub4_Sub1_Sub2 local396 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[local46];
					if ((local396.anInt1424 & 0x7F) == 64 && (local396.anInt1427 & 0x7F) == 64) {
						for (local300 = 0; local300 < Static20.anInt693; local300++) {
							local308 = Static44.aClass3_Sub1_Sub4_Sub1_Sub1Array1[Static18.anIntArray49[local300]];
							if (local308 != null && local308.aClass3_Sub1_Sub1_1.anInt137 == 1 && local396.anInt1424 == local308.anInt1424 && local308.anInt1427 == local396.anInt1427) {
								Static99.method1644(Static18.anIntArray49[local300], local308.aClass3_Sub1_Sub1_1, local58, local62);
							}
						}
						for (local142 = 0; local142 < Static72.anInt1820; local142++) {
							local355 = Static10.aClass3_Sub1_Sub4_Sub1_Sub2Array1[Static71.anIntArray228[local142]];
							if (local355 != null && local396 != local355 && local355.anInt1424 == local396.anInt1424 && local355.anInt1427 == local396.anInt1427) {
								Static118.method1889(Static71.anIntArray228[local142], local355, local62, local58);
							}
						}
					}
					Static118.method1889(local46, local396, local62, local58);
				}
				if (local52 == 3) {
					@Pc(516) Class11 local516 = Static95.aClass11ArrayArrayArray1[Static72.anInt1813][local62][local58];
					if (local516 != null) {
						for (@Pc(523) Class3_Sub1_Sub4_Sub4 local523 = (Class3_Sub1_Sub4_Sub4) local516.method198(); local523 != null; local523 = (Class3_Sub1_Sub4_Sub4) local516.method196()) {
							@Pc(530) Class3_Sub1_Sub8 local530 = Static2.method38(local523.anInt1298);
							if (Static91.anInt2201 == 1) {
								Static59.method1075(27, Static94.aClass53_1084, method1689(new Class53[] { Static5.aClass53_81, Static111.aClass53_1292, local530.aClass53_706 }), local523.anInt1298, local62, local58);
							} else if (!Static117.aBoolean119) {
								@Pc(613) Class53[] local613 = local530.aClass53Array14;
								if (Static120.aBoolean126) {
									local613 = Static53.method1447(local613);
								}
								for (@Pc(621) int local621 = 4; local621 >= 0; local621--) {
									if (local613 != null && local613[local621] != null) {
										@Pc(667) byte local667 = 0;
										if (local621 == 0) {
											local667 = 54;
										}
										if (local621 == 1) {
											local667 = 30;
										}
										if (local621 == 2) {
											local667 = 20;
										}
										if (local621 == 3) {
											local667 = 40;
										}
										if (local621 == 4) {
											local667 = 47;
										}
										Static59.method1075(local667, local613[local621], method1689(new Class53[] { Static8.aClass53_93, local530.aClass53_706 }), local523.anInt1298, local62, local58);
									} else if (local621 == 2) {
										Static59.method1075(20, Static76.aClass53_850, method1689(new Class53[] { Static8.aClass53_93, local530.aClass53_706 }), local523.anInt1298, local62, local58);
									}
								}
								Static59.method1075(1004, Static115.aClass53_1316, method1689(new Class53[] { Static8.aClass53_93, local530.aClass53_706 }), local523.anInt1298, local62, local58);
							} else if ((Static104.anInt2535 & 0x1) == 1) {
								Static59.method1075(11, Static57.aClass53_672, method1689(new Class53[] { Static102.aClass53_1162, Static111.aClass53_1292, local530.aClass53_706 }), local523.anInt1298, local62, local58);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)V")
	public static void method1692(@OriginalArg(1) int arg0) {
		if (arg0 == Static78.anInt1957) {
			return;
		}
		if (Static78.anInt1957 == 0) {
			Static16.method236();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static60.anInt1560 = 0;
			Static29.anInt1007 = 0;
			Static31.anInt1070 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static65.aClass37_3 != null) {
			Static65.aClass37_3.method948();
			Static65.aClass37_3 = null;
		}
		if (Static78.anInt1957 == 25 || Static78.anInt1957 == 40) {
			Static106.method1711();
			Static84.method1313();
		}
		if (Static78.anInt1957 == 25) {
			Static63.anInt1641 = 1;
			Static38.anInt1146 = 1;
			Static94.anInt2245 = 0;
			Static82.anInt946 = 0;
			Static2.anInt56 = 0;
		}
		if (arg0 == 35) {
			Static97.method1631();
			Static22.method395();
			if (Static90.aClass27_34 == null) {
				Static90.aClass27_34 = Static11.method180(503, 765, Static87.aCanvas1);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static90.aClass27_34 = null;
			Static97.method1631();
			Static22.method389(Static87.aCanvas1, Static58.aClass62_Sub1_9, Static69.aClass62_Sub1_12);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static90.aClass27_34 = null;
			Static22.method395();
			Static80.method1414(Static58.aClass62_Sub1_9, Static87.aCanvas1);
		}
		Static78.anInt1957 = arg0;
		Static123.aBoolean128 = true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[B)V")
	public static void method1693(@OriginalArg(1) byte[] arg0) {
		@Pc(6) Class3_Sub7 local6 = new Class3_Sub7(arg0);
		local6.anInt964 = arg0.length - 2;
		Static87.anInt2101 = local6.method602();
		anIntArray321 = new int[Static87.anInt2101];
		Static32.anIntArray117 = new int[Static87.anInt2101];
		Static53.anIntArray273 = new int[Static87.anInt2101];
		Static7.aByteArrayArray1 = new byte[Static87.anInt2101][];
		Static32.anIntArray116 = new int[Static87.anInt2101];
		local6.anInt964 = arg0.length - Static87.anInt2101 * 8 - 7;
		Static39.anInt1179 = local6.method602();
		Static95.anInt2272 = local6.method602();
		@Pc(62) int local62 = (local6.method647() & 0xFF) + 1;
		for (@Pc(64) int local64 = 0; local64 < Static87.anInt2101; local64++) {
			Static32.anIntArray116[local64] = local6.method602();
		}
		for (@Pc(82) int local82 = 0; local82 < Static87.anInt2101; local82++) {
			Static32.anIntArray117[local82] = local6.method602();
		}
		for (@Pc(100) int local100 = 0; local100 < Static87.anInt2101; local100++) {
			anIntArray321[local100] = local6.method602();
		}
		for (@Pc(114) int local114 = 0; local114 < Static87.anInt2101; local114++) {
			Static53.anIntArray273[local114] = local6.method602();
		}
		local6.anInt964 = arg0.length + 3 - Static87.anInt2101 * 8 - local62 * 3 - 7;
		Static97.anIntArray312 = new int[local62];
		for (@Pc(160) int local160 = 1; local160 < local62; local160++) {
			Static97.anIntArray312[local160] = local6.method639();
			if (Static97.anIntArray312[local160] == 0) {
				Static97.anIntArray312[local160] = 1;
			}
		}
		local6.anInt964 = 0;
		for (@Pc(192) int local192 = 0; local192 < Static87.anInt2101; local192++) {
			@Pc(198) int local198 = anIntArray321[local192];
			@Pc(202) int local202 = Static53.anIntArray273[local192];
			@Pc(206) int local206 = local198 * local202;
			@Pc(209) byte[] local209 = new byte[local206];
			Static7.aByteArrayArray1[local192] = local209;
			@Pc(217) int local217 = local6.method647();
			@Pc(227) int local227;
			if (local217 == 0) {
				for (local227 = 0; local227 < local206; local227++) {
					local209[local227] = local6.method624();
				}
			} else if (local217 == 1) {
				for (local227 = 0; local227 < local198; local227++) {
					for (@Pc(231) int local231 = 0; local231 < local202; local231++) {
						local209[local231 * local198 + local227] = local6.method624();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(Z)V")
	public static void method1694() {
		aClass53_1200 = null;
		aClass53_1195 = null;
		aClass62_Sub1_15 = null;
		aClass53_1190 = null;
		aClass53_1196 = null;
		aClass53_1192 = null;
		aClass53_1198 = null;
		aClass53_1188 = null;
		aClass53_1199 = null;
		anIntArray321 = null;
		aClass10_4 = null;
		aClass53_1194 = null;
		aClass3_Sub7_6 = null;
		aClass53_1197 = null;
		aClass53_1193 = null;
		aClass53_1191 = null;
		aClass53_1202 = null;
		aClass53_1201 = null;
		aClass53_1189 = null;
	}
}
