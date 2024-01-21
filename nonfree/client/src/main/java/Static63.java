import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "Lclient!af;")
	private static Class5 aClass5_879 = Static45.method1937("Loaded input handler");

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "Lclient!af;")
	public static Class5 aClass5_872 = aClass5_879;

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
	public static int anInt1755 = 0;

	@OriginalMember(owner = "client!kc", name = "f", descriptor = "Lclient!af;")
	private static Class5 aClass5_873 = Static45.method1937("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "Lclient!af;")
	public static Class5 aClass5_874 = Static45.method1937("blinken3:");

	@OriginalMember(owner = "client!kc", name = "l", descriptor = "[Lclient!af;")
	public static Class5[] aClass5Array13 = new Class5[5];

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Lclient!af;")
	public static Class5 aClass5_875 = aClass5_873;

	@OriginalMember(owner = "client!kc", name = "q", descriptor = "Lclient!af;")
	private static Class5 aClass5_876 = Static45.method1937("go back to the main RuneScape webpage");

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "Lclient!af;")
	public static Class5 aClass5_877 = Static45.method1937("Wordpack geladen)3");

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "Z")
	public static boolean aBoolean60 = false;

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Lclient!af;")
	public static Class5 aClass5_878 = Static45.method1937("Registrierter Benutzer");

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "Lclient!af;")
	private static Class5 aClass5_880 = Static45.method1937("Free world");

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "Lclient!af;")
	public static Class5 aClass5_881 = aClass5_876;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "Lclient!af;")
	public static Class5 aClass5_882 = aClass5_880;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public static void method1290() {
		@Pc(14) int local14;
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		if (Static104.anInt2540 == 86) {
			local14 = Static79.aClass1_Sub20_Sub1_2.method2091();
			local18 = Static79.aClass1_Sub20_Sub1_2.method2053();
			local26 = (local18 >> 4 & 0x7) + Static93.anInt2337;
			local32 = Static121.anInt3119 + (local18 & 0x7);
			local36 = Static79.aClass1_Sub20_Sub1_2.method2087();
			local40 = Static79.aClass1_Sub20_Sub1_2.method2091();
			if (local26 >= 0 && local32 >= 0 && local26 < 104 && local32 < 104 && local14 != Static84.anInt2149) {
				@Pc(69) Class1_Sub3_Sub4_Sub3 local69 = new Class1_Sub3_Sub4_Sub3();
				local69.anInt641 = local36;
				local69.anInt643 = local40;
				if (Static8.aClass53ArrayArrayArray1[Static7.anInt213][local26][local32] == null) {
					Static8.aClass53ArrayArrayArray1[Static7.anInt213][local26][local32] = new Class53();
				}
				Static8.aClass53ArrayArrayArray1[Static7.anInt213][local26][local32].method1449(local69);
				Static7.method222(local26, local32);
			}
			return;
		}
		@Pc(147) int local147;
		if (Static104.anInt2540 == 88) {
			local14 = Static79.aClass1_Sub20_Sub1_2.method2106();
			local18 = (local14 >> 4 & 0x7) + Static93.anInt2337;
			local26 = (local14 & 0x7) + Static121.anInt3119;
			local32 = Static79.aClass1_Sub20_Sub1_2.method2053();
			local40 = local32 & 0x3;
			local36 = local32 >> 2;
			local147 = Static92.anIntArray353[local36];
			if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104) {
				Static48.method841(local40, local36, Static7.anInt213, local26, local147, 0, local18, -1, -1);
			}
			return;
		}
		@Pc(230) Class1_Sub3_Sub4_Sub3 local230;
		if (Static104.anInt2540 == 10) {
			local14 = Static79.aClass1_Sub20_Sub1_2.method2070();
			local18 = (local14 >> 4 & 0x7) + Static93.anInt2337;
			local26 = Static121.anInt3119 + (local14 & 0x7);
			local32 = Static79.aClass1_Sub20_Sub1_2.method2100();
			if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104) {
				@Pc(223) Class53 local223 = Static8.aClass53ArrayArrayArray1[Static7.anInt213][local18][local26];
				if (local223 != null) {
					for (local230 = (Class1_Sub3_Sub4_Sub3) local223.method1442(); local230 != null; local230 = (Class1_Sub3_Sub4_Sub3) local223.method1450()) {
						if ((local32 & 0x7FFF) == local230.anInt643) {
							local230.method2220();
							break;
						}
					}
					if (local223.method1442() == null) {
						Static8.aClass53ArrayArrayArray1[Static7.anInt213][local18][local26] = null;
					}
					Static7.method222(local18, local26);
				}
			}
			return;
		}
		@Pc(314) int local314;
		@Pc(335) int local335;
		@Pc(357) int local357;
		@Pc(367) int local367;
		@Pc(387) int local387;
		@Pc(345) int local345;
		if (Static104.anInt2540 == 209) {
			local14 = Static79.aClass1_Sub20_Sub1_2.method2084();
			local26 = (local14 & 0x7) + Static121.anInt3119;
			local18 = Static93.anInt2337 + (local14 >> 4 & 0x7);
			local32 = Static79.aClass1_Sub20_Sub1_2.method2084();
			local36 = local32 >> 2;
			local147 = Static92.anIntArray353[local36];
			local40 = local32 & 0x3;
			local314 = Static79.aClass1_Sub20_Sub1_2.method2091();
			if (local18 >= 0 && local26 >= 0 && local18 < 103 && local26 < 103) {
				local335 = Static95.anIntArrayArrayArray2[Static7.anInt213][local18][local26];
				local345 = Static95.anIntArrayArrayArray2[Static7.anInt213][local18 + 1][local26];
				local357 = Static95.anIntArrayArrayArray2[Static7.anInt213][local18 + 1][local26 + 1];
				local367 = Static95.anIntArrayArrayArray2[Static7.anInt213][local18][local26 + 1];
				if (local147 == 0) {
					@Pc(378) Class63 local378 = Static44.aClass68_1.method1857(Static7.anInt213, local18, local26);
					if (local378 != null) {
						local387 = local378.anInt2448 >> 14 & 0x7FFF;
						if (local36 == 2) {
							local378.aClass1_Sub3_Sub4_6 = new Class1_Sub3_Sub4_Sub5(local387, 2, local40 + 4, local335, local345, local357, local367, local314, false, local378.aClass1_Sub3_Sub4_6);
							local378.aClass1_Sub3_Sub4_7 = new Class1_Sub3_Sub4_Sub5(local387, 2, local40 + 1 & 0x3, local335, local345, local357, local367, local314, false, local378.aClass1_Sub3_Sub4_7);
						} else {
							local378.aClass1_Sub3_Sub4_6 = new Class1_Sub3_Sub4_Sub5(local387, local36, local40, local335, local345, local357, local367, local314, false, local378.aClass1_Sub3_Sub4_6);
						}
					}
				}
				if (local147 == 1) {
					@Pc(460) Class26 local460 = Static44.aClass68_1.method1877(Static7.anInt213, local18, local26);
					if (local460 != null) {
						local460.aClass1_Sub3_Sub4_2 = new Class1_Sub3_Sub4_Sub5(local460.anInt1055 >> 14 & 0x7FFF, 4, 0, local335, local345, local357, local367, local314, false, local460.aClass1_Sub3_Sub4_2);
					}
				}
				if (local147 == 2) {
					if (local36 == 11) {
						local36 = 10;
					}
					@Pc(499) Class71 local499 = Static44.aClass68_1.method1872(Static7.anInt213, local18, local26);
					if (local499 != null) {
						local499.aClass1_Sub3_Sub4_8 = new Class1_Sub3_Sub4_Sub5(local499.anInt2681 >> 14 & 0x7FFF, local36, local40, local335, local345, local357, local367, local314, false, local499.aClass1_Sub3_Sub4_8);
					}
				}
				if (local147 == 3) {
					@Pc(531) Class22 local531 = Static44.aClass68_1.method1833(Static7.anInt213, local18, local26);
					if (local531 != null) {
						local531.aClass1_Sub3_Sub4_1 = new Class1_Sub3_Sub4_Sub5(local531.anInt957 >> 14 & 0x7FFF, 22, local40, local335, local345, local357, local367, local314, false, local531.aClass1_Sub3_Sub4_1);
					}
				}
			}
		} else if (Static104.anInt2540 == 42) {
			local14 = Static79.aClass1_Sub20_Sub1_2.method2069();
			local18 = Static79.aClass1_Sub20_Sub1_2.method2053();
			local26 = (local18 >> 4 & 0x7) + Static93.anInt2337;
			local32 = (local18 & 0x7) + Static121.anInt3119;
			local36 = Static79.aClass1_Sub20_Sub1_2.method2084();
			local40 = local36 >> 2;
			local147 = local36 & 0x3;
			local314 = Static92.anIntArray353[local40];
			if (local26 >= 0 && local32 >= 0 && local26 < 104 && local32 < 104) {
				Static48.method841(local147, local40, Static7.anInt213, local32, local314, 0, local26, local14, -1);
			}
		} else if (Static104.anInt2540 == 16) {
			local14 = Static79.aClass1_Sub20_Sub1_2.method2053();
			local18 = Static93.anInt2337 + (local14 >> 4 & 0x7);
			local26 = (local14 & 0x7) + Static121.anInt3119;
			local32 = Static79.aClass1_Sub20_Sub1_2.method2087();
			local36 = Static79.aClass1_Sub20_Sub1_2.method2069();
			if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104) {
				local230 = new Class1_Sub3_Sub4_Sub3();
				local230.anInt643 = local32;
				local230.anInt641 = local36;
				if (Static8.aClass53ArrayArrayArray1[Static7.anInt213][local18][local26] == null) {
					Static8.aClass53ArrayArrayArray1[Static7.anInt213][local18][local26] = new Class53();
				}
				Static8.aClass53ArrayArrayArray1[Static7.anInt213][local18][local26].method1449(local230);
				Static7.method222(local18, local26);
			}
		} else {
			@Pc(791) int local791;
			if (Static104.anInt2540 == 245) {
				local14 = Static79.aClass1_Sub20_Sub1_2.method2053();
				local18 = (local14 >> 4 & 0x7) + Static93.anInt2337;
				local26 = Static121.anInt3119 + (local14 & 0x7);
				local32 = local18 + Static79.aClass1_Sub20_Sub1_2.method2099();
				local36 = Static79.aClass1_Sub20_Sub1_2.method2099() + local26;
				local40 = Static79.aClass1_Sub20_Sub1_2.method2079();
				local147 = Static79.aClass1_Sub20_Sub1_2.method2087();
				local314 = Static79.aClass1_Sub20_Sub1_2.method2053() * 4;
				local335 = Static79.aClass1_Sub20_Sub1_2.method2053() * 4;
				local345 = Static79.aClass1_Sub20_Sub1_2.method2087();
				local357 = Static79.aClass1_Sub20_Sub1_2.method2087();
				local367 = Static79.aClass1_Sub20_Sub1_2.method2053();
				local791 = Static79.aClass1_Sub20_Sub1_2.method2053();
				if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local147 != 65535) {
					local32 = local32 * 128 + 64;
					local18 = local18 * 128 + 64;
					local26 = local26 * 128 + 64;
					@Pc(870) Class1_Sub3_Sub4_Sub6 local870 = new Class1_Sub3_Sub4_Sub6(local147, Static7.anInt213, local18, local26, Static102.method1746(local26, Static7.anInt213, local18) - local314, local345 + Static131.anInt3270, local357 + Static131.anInt3270, local367, local791, local40, local335);
					local36 = local36 * 128 + 64;
					local870.method894(local36, local32, Static131.anInt3270 + local345, -local335 + Static102.method1746(local36, Static7.anInt213, local32));
					Static26.aClass53_6.method1449(local870);
				}
			} else {
				if (Static104.anInt2540 == 162) {
					local14 = Static79.aClass1_Sub20_Sub1_2.method2053();
					local18 = Static93.anInt2337 + (local14 >> 4 & 0x7);
					local26 = (local14 & 0x7) + Static121.anInt3119;
					local32 = Static79.aClass1_Sub20_Sub1_2.method2087();
					local36 = Static79.aClass1_Sub20_Sub1_2.method2053();
					local40 = local36 >> 4 & 0xF;
					local147 = local36 & 0x7;
					local314 = Static79.aClass1_Sub20_Sub1_2.method2053();
					if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104) {
						local335 = local40 + 1;
						if (Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0] >= local18 - local335 && Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray443[0] <= local18 + local335 && Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0] >= local26 - local335 && local335 + local26 >= Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.anIntArray446[0] && Static27.anInt844 != 0 && local147 > 0 && Static39.anInt1036 < 50) {
							Static115.anIntArray431[Static39.anInt1036] = local32;
							Static76.anIntArray297[Static39.anInt1036] = local147;
							Static24.anIntArray87[Static39.anInt1036] = local314;
							Static83.aClass37Array1[Static39.anInt1036] = null;
							Static37.anIntArray165[Static39.anInt1036] = (local18 << 16) + (local26 << 8) + local40;
							Static39.anInt1036++;
						}
					}
				}
				if (Static104.anInt2540 == 52) {
					local14 = Static79.aClass1_Sub20_Sub1_2.method2053();
					local18 = (local14 >> 4 & 0x7) + Static93.anInt2337;
					local26 = (local14 & 0x7) + Static121.anInt3119;
					local32 = Static79.aClass1_Sub20_Sub1_2.method2087();
					local36 = Static79.aClass1_Sub20_Sub1_2.method2087();
					local40 = Static79.aClass1_Sub20_Sub1_2.method2087();
					if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104) {
						@Pc(1099) Class53 local1099 = Static8.aClass53ArrayArrayArray1[Static7.anInt213][local18][local26];
						if (local1099 != null) {
							for (@Pc(1106) Class1_Sub3_Sub4_Sub3 local1106 = (Class1_Sub3_Sub4_Sub3) local1099.method1442(); local1106 != null; local1106 = (Class1_Sub3_Sub4_Sub3) local1099.method1450()) {
								if ((local32 & 0x7FFF) == local1106.anInt643 && local36 == local1106.anInt641) {
									local1106.anInt641 = local40;
									break;
								}
							}
							Static7.method222(local18, local26);
						}
					}
				} else {
					if (Static104.anInt2540 == 148) {
						@Pc(1146) byte local1146 = Static79.aClass1_Sub20_Sub1_2.method2089();
						@Pc(1150) byte local1150 = Static79.aClass1_Sub20_Sub1_2.method2102();
						@Pc(1154) byte local1154 = Static79.aClass1_Sub20_Sub1_2.method2102();
						local32 = Static79.aClass1_Sub20_Sub1_2.method2091();
						local36 = Static79.aClass1_Sub20_Sub1_2.method2087();
						local40 = Static79.aClass1_Sub20_Sub1_2.method2106();
						local314 = local40 & 0x3;
						local147 = local40 >> 2;
						local335 = Static92.anIntArray353[local147];
						@Pc(1182) byte local1182 = Static79.aClass1_Sub20_Sub1_2.method2099();
						local357 = Static79.aClass1_Sub20_Sub1_2.method2087();
						local367 = Static79.aClass1_Sub20_Sub1_2.method2091();
						local791 = Static79.aClass1_Sub20_Sub1_2.method2070();
						local387 = (local791 >> 4 & 0x7) + Static93.anInt2337;
						@Pc(1208) int local1208 = Static121.anInt3119 + (local791 & 0x7);
						@Pc(1215) Class1_Sub3_Sub4_Sub2_Sub1 local1215;
						if (Static84.anInt2149 == local32) {
							local1215 = Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1;
						} else {
							local1215 = Static17.aClass1_Sub3_Sub4_Sub2_Sub1Array1[local32];
						}
						if (local1215 != null) {
							@Pc(1225) Class1_Sub3_Sub10 local1225 = Static131.method2263(local357);
							@Pc(1233) int local1233 = Static95.anIntArrayArrayArray2[Static7.anInt213][local387][local1208];
							@Pc(1243) int local1243 = Static95.anIntArrayArrayArray2[Static7.anInt213][local387 + 1][local1208];
							@Pc(1255) int local1255 = Static95.anIntArrayArrayArray2[Static7.anInt213][local387 + 1][local1208 + 1];
							@Pc(1265) int local1265 = Static95.anIntArrayArrayArray2[Static7.anInt213][local387][local1208 + 1];
							@Pc(1275) Class1_Sub3_Sub4_Sub4 local1275 = local1225.method1265(local314, local1265, local1243, local1255, local147, local1233);
							if (local1275 != null) {
								Static48.method841(0, 0, Static7.anInt213, local1208, local335, local367 + 1, local387, -1, local36 + 1);
								local1215.anInt1991 = local36 + Static131.anInt3270;
								local1215.aClass1_Sub3_Sub4_Sub4_3 = local1275;
								local1215.anInt1990 = local367 + Static131.anInt3270;
								@Pc(1309) int local1309 = local1225.anInt1696;
								@Pc(1312) int local1312 = local1225.anInt1693;
								@Pc(1317) byte local1317;
								if (local1154 > local1182) {
									local1317 = local1154;
									local1154 = local1182;
									local1182 = local1317;
								}
								if (local314 == 1 || local314 == 3) {
									local1312 = local1225.anInt1696;
									local1309 = local1225.anInt1693;
								}
								local1215.anInt2010 = local1208 * 128 + local1312 * 64;
								local1215.anInt2009 = local387 * 128 + local1309 * 64;
								local1215.anInt2007 = Static102.method1746(local1215.anInt2010, Static7.anInt213, local1215.anInt2009);
								local1215.anInt1992 = local387 + local1182;
								local1215.anInt2004 = local1154 + local387;
								if (local1150 < local1146) {
									local1317 = local1146;
									local1146 = local1150;
									local1150 = local1317;
								}
								local1215.anInt2011 = local1208 + local1150;
								local1215.anInt1988 = local1208 + local1146;
							}
						}
					}
					if (Static104.anInt2540 == 120) {
						local14 = Static79.aClass1_Sub20_Sub1_2.method2053();
						local26 = Static121.anInt3119 + (local14 & 0x7);
						local18 = Static93.anInt2337 + (local14 >> 4 & 0x7);
						local32 = Static79.aClass1_Sub20_Sub1_2.method2087();
						local36 = Static79.aClass1_Sub20_Sub1_2.method2053();
						local40 = Static79.aClass1_Sub20_Sub1_2.method2087();
						if (local18 >= 0 && local26 >= 0 && local18 < 104 && local26 < 104) {
							local26 = local26 * 128 + 64;
							local18 = local18 * 128 + 64;
							@Pc(1474) Class1_Sub3_Sub4_Sub7 local1474 = new Class1_Sub3_Sub4_Sub7(local32, Static7.anInt213, local18, local26, Static102.method1746(local26, Static7.anInt213, local18) - local36, local40, Static131.anInt3270);
							Static45.aClass53_15.method1449(local1474);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(JZ)V")
	public static void method1295(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static20.anInt658 >= 100 && Static13.anInt339 != 1 || Static20.anInt658 >= 200) {
			Static50.method893(Static50.aClass5_642, 0, Static49.aClass5_612);
			return;
		}
		@Pc(35) Class5 local35 = Static76.method1314(arg0).method219();
		for (@Pc(37) int local37 = 0; local37 < Static20.anInt658; local37++) {
			if (Static86.aLongArray3[local37] == arg0) {
				Static50.method893(Static100.method1696(new Class5[] { local35, Static20.aClass5_322 }), 0, Static49.aClass5_612);
				return;
			}
		}
		for (@Pc(76) int local76 = 0; local76 < Static92.anInt2321; local76++) {
			if (Static38.aLongArray1[local76] == arg0) {
				Static50.method893(Static100.method1696(new Class5[] { Static48.aClass5_584, local35, Static109.aClass5_1261 }), 0, Static49.aClass5_612);
				return;
			}
		}
		if (local35.method199(Static20.aClass1_Sub3_Sub4_Sub2_Sub1_1.aClass5_985)) {
			Static50.method893(Static41.aClass5_501, 0, Static49.aClass5_612);
			return;
		}
		Static9.aClass5Array2[Static20.anInt658] = local35;
		Static86.aLongArray3[Static20.anInt658] = arg0;
		Static117.anIntArray458[Static20.anInt658] = 0;
		Static54.anIntArray214[Static20.anInt658] = 0;
		Static83.anInt2119 = Static60.anInt1441;
		Static20.anInt658++;
		Static44.aClass1_Sub20_Sub1_1.method2108(54);
		Static44.aClass1_Sub20_Sub1_1.method2078(arg0);
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public static void method1300() {
		aClass5_873 = null;
		aClass5_882 = null;
		aClass5_877 = null;
		aClass5_879 = null;
		aClass5_875 = null;
		aClass5_878 = null;
		aClass5_872 = null;
		aClass5_880 = null;
		aClass5Array13 = null;
		aClass5_874 = null;
		aClass5_881 = null;
		aClass5_876 = null;
	}
}
