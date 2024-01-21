import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!t", name = "Yb", descriptor = "I")
	public static int anInt2842;

	@OriginalMember(owner = "client!t", name = "ac", descriptor = "[I")
	public static int[] anIntArray359;

	@OriginalMember(owner = "client!t", name = "hc", descriptor = "[Lclient!n;")
	public static Class51[] aClass51Array1;

	@OriginalMember(owner = "client!t", name = "Hb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1058 = Static2.method59("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!t", name = "Ib", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1059 = Static2.method59("leuchten1:");

	@OriginalMember(owner = "client!t", name = "Kb", descriptor = "I")
	public static int anInt2836 = 0;

	@OriginalMember(owner = "client!t", name = "Mb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1060 = aClass80_1058;

	@OriginalMember(owner = "client!t", name = "Ob", descriptor = "I")
	public static int anInt2839 = 1;

	@OriginalMember(owner = "client!t", name = "Qb", descriptor = "I")
	public static int anInt2840 = 0;

	@OriginalMember(owner = "client!t", name = "kc", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1067 = Static2.method59("as it was used to break our rules)3");

	@OriginalMember(owner = "client!t", name = "Rb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1061 = aClass80_1067;

	@OriginalMember(owner = "client!t", name = "Sb", descriptor = "Lclient!wd;")
	private static Class80 aClass80_1062 = Static2.method59("Moderator option: Mute player for 48 hours: <ON>");

	@OriginalMember(owner = "client!t", name = "Tb", descriptor = "[[B")
	public static byte[][] aByteArrayArray8 = new byte[250][];

	@OriginalMember(owner = "client!t", name = "Ub", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1063 = Static2.method59("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <AUS>");

	@OriginalMember(owner = "client!t", name = "Vb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1064 = aClass80_1062;

	@OriginalMember(owner = "client!t", name = "Wb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1065 = Static2.method59("overlay_multiway");

	@OriginalMember(owner = "client!t", name = "bc", descriptor = "Lclient!wd;")
	public static Class80 aClass80_1066 = Static2.method59(":chalreq:");

	@OriginalMember(owner = "client!t", name = "s", descriptor = "(I)V")
	public static void method1800() {
		@Pc(28) int local28;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(74) int local74;
		@Pc(84) int local84;
		@Pc(106) int local106;
		@Pc(123) int local123;
		@Pc(14) int local14;
		@Pc(22) int local22;
		@Pc(94) int local94;
		if (Static10.anInt298 == 10) {
			local14 = Static100.aClass2_Sub17_Sub1_1.method1780();
			local22 = (local14 >> 4 & 0x7) + Static23.anInt886;
			local28 = Static11.anInt304 + (local14 & 0x7);
			local32 = Static100.aClass2_Sub17_Sub1_1.method1790();
			local36 = Static100.aClass2_Sub17_Sub1_1.method1780();
			local40 = local36 >> 2;
			local44 = local36 & 0x3;
			local48 = Static37.anIntArray152[local40];
			if (local22 >= 0 && local28 >= 0 && local22 < 103 && local28 < 103) {
				local74 = Static100.anIntArrayArrayArray5[Static16.anInt444][local22][local28];
				local84 = Static100.anIntArrayArrayArray5[Static16.anInt444][local22 + 1][local28];
				local94 = Static100.anIntArrayArrayArray5[Static16.anInt444][local22][local28 + 1];
				local106 = Static100.anIntArrayArrayArray5[Static16.anInt444][local22 + 1][local28 + 1];
				if (local48 == 0) {
					@Pc(114) Class52 local114 = Static93.aClass64_1.method1607(Static16.anInt444, local22, local28);
					if (local114 != null) {
						local123 = local114.anInt2024 >> 14 & 0x7FFF;
						if (local40 == 2) {
							local114.aClass2_Sub1_Sub1_7 = new Class2_Sub1_Sub1_Sub7(local123, 2, local44 + 4, local74, local84, local106, local94, local32, false, local114.aClass2_Sub1_Sub1_7);
							local114.aClass2_Sub1_Sub1_8 = new Class2_Sub1_Sub1_Sub7(local123, 2, local44 + 1 & 0x3, local74, local84, local106, local94, local32, false, local114.aClass2_Sub1_Sub1_8);
						} else {
							local114.aClass2_Sub1_Sub1_7 = new Class2_Sub1_Sub1_Sub7(local123, local40, local44, local74, local84, local106, local94, local32, false, local114.aClass2_Sub1_Sub1_7);
						}
					}
				}
				if (local48 == 1) {
					@Pc(191) Class7 local191 = Static93.aClass64_1.method1634(Static16.anInt444, local22, local28);
					if (local191 != null) {
						local191.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1_Sub7(local191.anInt301 >> 14 & 0x7FFF, 4, 0, local74, local84, local106, local94, local32, false, local191.aClass2_Sub1_Sub1_1);
					}
				}
				if (local48 == 2) {
					if (local40 == 11) {
						local40 = 10;
					}
					@Pc(232) Class16 local232 = Static93.aClass64_1.method1614(Static16.anInt444, local22, local28);
					if (local232 != null) {
						local232.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub7(local232.anInt1058 >> 14 & 0x7FFF, local40, local44, local74, local84, local106, local94, local32, false, local232.aClass2_Sub1_Sub1_5);
					}
				}
				if (local48 == 3) {
					@Pc(264) Class34 local264 = Static93.aClass64_1.method1655(Static16.anInt444, local22, local28);
					if (local264 != null) {
						local264.aClass2_Sub1_Sub1_6 = new Class2_Sub1_Sub1_Sub7(local264.anInt1547 >> 14 & 0x7FFF, 22, local44, local74, local84, local106, local94, local32, false, local264.aClass2_Sub1_Sub1_6);
					}
				}
			}
		} else if (Static10.anInt298 == 142) {
			local14 = Static100.aClass2_Sub17_Sub1_1.method1780();
			local28 = (local14 & 0x7) + Static11.anInt304;
			local22 = (local14 >> 4 & 0x7) + Static23.anInt886;
			local32 = Static100.aClass2_Sub17_Sub1_1.method1767() + local22;
			local36 = local28 + Static100.aClass2_Sub17_Sub1_1.method1767();
			local40 = Static100.aClass2_Sub17_Sub1_1.method1784();
			local44 = Static100.aClass2_Sub17_Sub1_1.method1783();
			local48 = Static100.aClass2_Sub17_Sub1_1.method1780() * 4;
			local74 = Static100.aClass2_Sub17_Sub1_1.method1780() * 4;
			local84 = Static100.aClass2_Sub17_Sub1_1.method1783();
			local106 = Static100.aClass2_Sub17_Sub1_1.method1783();
			local94 = Static100.aClass2_Sub17_Sub1_1.method1780();
			@Pc(363) int local363 = Static100.aClass2_Sub17_Sub1_1.method1780();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && local32 >= 0 && local36 >= 0 && local32 < 104 && local36 < 104 && local44 != 65535) {
				local22 = local22 * 128 + 64;
				local36 = local36 * 128 + 64;
				local28 = local28 * 128 + 64;
				local32 = local32 * 128 + 64;
				@Pc(444) Class2_Sub1_Sub1_Sub3 local444 = new Class2_Sub1_Sub1_Sub3(local44, Static16.anInt444, local22, local28, Static24.method513(local22, Static16.anInt444, local28) - local48, local84 + Static10.anInt300, Static10.anInt300 + local106, local94, local363, local40, local74);
				local444.method245(local32, local36, Static24.method513(local32, Static16.anInt444, local36) - local74, Static10.anInt300 + local84);
				Static93.aClass58_12.method1294(local444);
			}
		} else if (Static10.anInt298 == 236) {
			local14 = Static100.aClass2_Sub17_Sub1_1.method1780();
			local22 = (local14 >> 4 & 0x7) + Static23.anInt886;
			local28 = Static11.anInt304 + (local14 & 0x7);
			local32 = Static100.aClass2_Sub17_Sub1_1.method1770();
			local40 = local32 & 0x3;
			local36 = local32 >> 2;
			local44 = Static37.anIntArray152[local36];
			local48 = Static100.aClass2_Sub17_Sub1_1.method1783();
			if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
				Static77.method1202(-1, local28, local22, Static16.anInt444, local44, local48, 0, local40, local36);
			}
		} else if (Static10.anInt298 == 127) {
			local14 = Static100.aClass2_Sub17_Sub1_1.method1770();
			local22 = local14 >> 2;
			local28 = local14 & 0x3;
			local32 = Static37.anIntArray152[local22];
			local36 = Static100.aClass2_Sub17_Sub1_1.method1770();
			local44 = (local36 & 0x7) + Static11.anInt304;
			local40 = Static23.anInt886 + (local36 >> 4 & 0x7);
			if (local40 >= 0 && local44 >= 0 && local40 < 104 && local44 < 104) {
				Static77.method1202(-1, local44, local40, Static16.anInt444, local32, -1, 0, local28, local22);
			}
		} else {
			@Pc(646) Class2_Sub1_Sub1_Sub5 local646;
			if (Static10.anInt298 == 60) {
				local14 = Static100.aClass2_Sub17_Sub1_1.method1783();
				local22 = Static100.aClass2_Sub17_Sub1_1.method1780();
				local28 = Static23.anInt886 + (local22 >> 4 & 0x7);
				local32 = Static11.anInt304 + (local22 & 0x7);
				local36 = Static100.aClass2_Sub17_Sub1_1.method1790();
				if (local28 >= 0 && local32 >= 0 && local28 < 104 && local32 < 104) {
					local646 = new Class2_Sub1_Sub1_Sub5();
					local646.anInt961 = local36;
					local646.anInt960 = local14;
					if (Static45.aClass58ArrayArrayArray3[Static16.anInt444][local28][local32] == null) {
						Static45.aClass58ArrayArrayArray3[Static16.anInt444][local28][local32] = new Class58();
					}
					Static45.aClass58ArrayArrayArray3[Static16.anInt444][local28][local32].method1294(local646);
					Static86.method1284(local28, local32);
				}
			} else {
				if (Static10.anInt298 == 43) {
					@Pc(694) byte local694 = Static100.aClass2_Sub17_Sub1_1.method1777();
					@Pc(698) byte local698 = Static100.aClass2_Sub17_Sub1_1.method1759();
					local28 = Static100.aClass2_Sub17_Sub1_1.method1780();
					local32 = local28 >> 2;
					local36 = local28 & 0x3;
					local40 = Static37.anIntArray152[local32];
					local44 = Static100.aClass2_Sub17_Sub1_1.method1756();
					local48 = Static100.aClass2_Sub17_Sub1_1.method1751();
					local74 = (local48 >> 4 & 0x7) + Static23.anInt886;
					local84 = (local48 & 0x7) + Static11.anInt304;
					local106 = Static100.aClass2_Sub17_Sub1_1.method1756();
					@Pc(744) byte local744 = Static100.aClass2_Sub17_Sub1_1.method1777();
					@Pc(748) byte local748 = Static100.aClass2_Sub17_Sub1_1.method1758();
					local123 = Static100.aClass2_Sub17_Sub1_1.method1756();
					@Pc(756) int local756 = Static100.aClass2_Sub17_Sub1_1.method1779();
					@Pc(767) Class2_Sub1_Sub1_Sub4_Sub2 local767;
					if (Static28.anInt2311 == local44) {
						local767 = Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1;
					} else {
						local767 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local44];
					}
					if (local767 != null) {
						@Pc(777) Class2_Sub1_Sub10 local777 = Static18.method404(local756);
						@Pc(787) int local787 = Static100.anIntArrayArrayArray5[Static16.anInt444][local74 + 1][local84];
						@Pc(799) int local799 = Static100.anIntArrayArrayArray5[Static16.anInt444][local74 + 1][local84 + 1];
						@Pc(807) int local807 = Static100.anIntArrayArrayArray5[Static16.anInt444][local74][local84];
						@Pc(817) int local817 = Static100.anIntArrayArrayArray5[Static16.anInt444][local74][local84 + 1];
						@Pc(829) Class2_Sub1_Sub1_Sub2 local829 = local777.method959(local36, local807, local817, local32, local787, local799);
						if (local829 != null) {
							Static77.method1202(local123 + 1, local84, local74, Static16.anInt444, local40, -1, local106 + 1, 0, 0);
							local767.aClass2_Sub1_Sub1_Sub2_3 = local829;
							@Pc(858) byte local858;
							if (local748 < local698) {
								local858 = local698;
								local698 = local748;
								local748 = local858;
							}
							local767.anInt2391 = local106 + Static10.anInt300;
							local767.anInt2393 = local123 + Static10.anInt300;
							@Pc(876) int local876 = local777.anInt1634;
							if (local744 > local694) {
								local858 = local744;
								local744 = local694;
								local694 = local858;
							}
							@Pc(892) int local892 = local777.anInt1630;
							if (local36 == 1 || local36 == 3) {
								local876 = local777.anInt1630;
								local892 = local777.anInt1634;
							}
							local767.anInt2385 = local84 * 128 + local892 * 64;
							local767.anInt2405 = local876 * 64 + local74 * 128;
							local767.anInt2408 = Static24.method513(local767.anInt2405, Static16.anInt444, local767.anInt2385);
							local767.anInt2400 = local74 + local748;
							local767.anInt2388 = local74 + local698;
							local767.anInt2407 = local84 + local744;
							local767.anInt2390 = local84 + local694;
						}
					}
				}
				if (Static10.anInt298 == 116) {
					local14 = Static100.aClass2_Sub17_Sub1_1.method1780();
					local22 = Static23.anInt886 + (local14 >> 4 & 0x7);
					local28 = (local14 & 0x7) + Static11.anInt304;
					local32 = Static100.aClass2_Sub17_Sub1_1.method1790();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
						@Pc(1007) Class58 local1007 = Static45.aClass58ArrayArrayArray3[Static16.anInt444][local22][local28];
						if (local1007 != null) {
							for (local646 = (Class2_Sub1_Sub1_Sub5) local1007.method1285(); local646 != null; local646 = (Class2_Sub1_Sub1_Sub5) local1007.method1281()) {
								if (local646.anInt960 == (local32 & 0x7FFF)) {
									local646.method1961();
									break;
								}
							}
							if (local1007.method1285() == null) {
								Static45.aClass58ArrayArrayArray3[Static16.anInt444][local22][local28] = null;
							}
							Static86.method1284(local22, local28);
						}
					}
				} else if (Static10.anInt298 == 148) {
					local14 = Static100.aClass2_Sub17_Sub1_1.method1780();
					local22 = (local14 >> 4 & 0x7) + Static23.anInt886;
					local28 = (local14 & 0x7) + Static11.anInt304;
					local32 = Static100.aClass2_Sub17_Sub1_1.method1783();
					local36 = Static100.aClass2_Sub17_Sub1_1.method1783();
					local40 = Static100.aClass2_Sub17_Sub1_1.method1783();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
						@Pc(1110) Class58 local1110 = Static45.aClass58ArrayArrayArray3[Static16.anInt444][local22][local28];
						if (local1110 != null) {
							for (@Pc(1117) Class2_Sub1_Sub1_Sub5 local1117 = (Class2_Sub1_Sub1_Sub5) local1110.method1285(); local1117 != null; local1117 = (Class2_Sub1_Sub1_Sub5) local1110.method1281()) {
								if (local1117.anInt960 == (local32 & 0x7FFF) && local1117.anInt961 == local36) {
									local1117.anInt961 = local40;
									break;
								}
							}
							Static86.method1284(local22, local28);
						}
					}
				} else if (Static10.anInt298 == 196) {
					local14 = Static100.aClass2_Sub17_Sub1_1.method1780();
					local22 = Static23.anInt886 + (local14 >> 4 & 0x7);
					local28 = Static11.anInt304 + (local14 & 0x7);
					local32 = Static100.aClass2_Sub17_Sub1_1.method1783();
					local36 = Static100.aClass2_Sub17_Sub1_1.method1780();
					local40 = Static100.aClass2_Sub17_Sub1_1.method1783();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
						local28 = local28 * 128 + 64;
						local22 = local22 * 128 + 64;
						@Pc(1232) Class2_Sub1_Sub1_Sub1 local1232 = new Class2_Sub1_Sub1_Sub1(local32, Static16.anInt444, local22, local28, Static24.method513(local22, Static16.anInt444, local28) - local36, local40, Static10.anInt300);
						Static33.aClass58_3.method1294(local1232);
					}
				} else if (Static10.anInt298 == 100) {
					local14 = Static100.aClass2_Sub17_Sub1_1.method1770();
					local28 = (local14 & 0x7) + Static11.anInt304;
					local22 = Static23.anInt886 + (local14 >> 4 & 0x7);
					local32 = Static100.aClass2_Sub17_Sub1_1.method1790();
					local36 = Static100.aClass2_Sub17_Sub1_1.method1756();
					local40 = Static100.aClass2_Sub17_Sub1_1.method1779();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104 && Static28.anInt2311 != local32) {
						@Pc(1301) Class2_Sub1_Sub1_Sub5 local1301 = new Class2_Sub1_Sub1_Sub5();
						local1301.anInt961 = local36;
						local1301.anInt960 = local40;
						if (Static45.aClass58ArrayArrayArray3[Static16.anInt444][local22][local28] == null) {
							Static45.aClass58ArrayArrayArray3[Static16.anInt444][local22][local28] = new Class58();
						}
						Static45.aClass58ArrayArrayArray3[Static16.anInt444][local22][local28].method1294(local1301);
						Static86.method1284(local22, local28);
					}
				} else if (Static10.anInt298 == 126) {
					local14 = Static100.aClass2_Sub17_Sub1_1.method1780();
					local22 = (local14 >> 4 & 0x7) + Static23.anInt886;
					local28 = (local14 & 0x7) + Static11.anInt304;
					local32 = Static100.aClass2_Sub17_Sub1_1.method1783();
					local36 = Static100.aClass2_Sub17_Sub1_1.method1780();
					local44 = local36 & 0x7;
					local40 = local36 >> 4 & 0xF;
					local48 = Static100.aClass2_Sub17_Sub1_1.method1780();
					if (local22 >= 0 && local28 >= 0 && local22 < 104 && local28 < 104) {
						local74 = local40 + 1;
						if (local22 - local74 <= Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0] && Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0] <= local74 + local22 && Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0] >= local28 - local74 && Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0] <= local74 + local28 && Static22.anInt963 != 0 && local44 > 0 && Static16.anInt443 < 50) {
							Static110.anIntArray379[Static16.anInt443] = local32;
							Static5.anIntArray13[Static16.anInt443] = local44;
							Static49.anIntArray191[Static16.anInt443] = local48;
							Static82.aClass25Array56[Static16.anInt443] = null;
							Static23.anIntArray101[Static16.anInt443] = (local28 << 8) + (local22 << 16) + local40;
							Static16.anInt443++;
							return;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "(ZI)V")
	public static void method1802(@OriginalArg(0) boolean arg0) {
		Static2.aBoolean9 = arg0;
		@Pc(21) int local21;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(37) int local37;
		@Pc(43) int local43;
		@Pc(47) int local47;
		@Pc(77) int local77;
		@Pc(133) int local133;
		@Pc(141) int local141;
		@Pc(149) int local149;
		if (!Static2.aBoolean9) {
			local21 = Static100.aClass2_Sub17_Sub1_1.method1756();
			local25 = Static100.aClass2_Sub17_Sub1_1.method1779();
			local29 = Static100.aClass2_Sub17_Sub1_1.method1790();
			local37 = (Static65.anInt1843 - Static100.aClass2_Sub17_Sub1_1.anInt2799) / 16;
			Static23.anIntArrayArray11 = new int[local37][4];
			for (local43 = 0; local43 < local37; local43++) {
				for (local47 = 0; local47 < 4; local47++) {
					Static23.anIntArrayArray11[local43][local47] = Static100.aClass2_Sub17_Sub1_1.method1766();
				}
			}
			local47 = Static100.aClass2_Sub17_Sub1_1.method1779();
			local77 = Static100.aClass2_Sub17_Sub1_1.method1751();
			Static103.anIntArray351 = new int[local37];
			Static8.aByteArrayArray1 = new byte[local37][];
			Static68.anIntArray235 = new int[local37];
			Static114.anIntArray383 = new int[local37];
			Static91.aByteArrayArray7 = new byte[local37][];
			local37 = 0;
			@Pc(96) boolean local96 = false;
			if ((local21 / 8 == 48 || local21 / 8 == 49) && local29 / 8 == 48) {
				local96 = true;
			}
			if (local21 / 8 == 48 && local29 / 8 == 148) {
				local96 = true;
			}
			for (local133 = (local21 - 6) / 8; local133 <= (local21 + 6) / 8; local133++) {
				for (local141 = (local29 - 6) / 8; local141 <= (local29 + 6) / 8; local141++) {
					local149 = (local133 << 8) + local141;
					if (!local96 || local141 != 49 && local141 != 149 && local141 != 147 && local133 != 50 && (local133 != 49 || local141 != 47)) {
						Static103.anIntArray351[local37] = local149;
						Static114.anIntArray383[local37] = Static8.aClass11_Sub1_2.method378(Static93.method1444(new Class80[] { Static35.aClass80_390, Static28.method1422(local133), Static104.aClass80_1027, Static28.method1422(local141) }));
						Static68.anIntArray235[local37] = Static8.aClass11_Sub1_2.method378(Static93.method1444(new Class80[] { Static88.aClass80_852, Static28.method1422(local133), Static104.aClass80_1027, Static28.method1422(local141) }));
						local37++;
					}
				}
			}
			Static92.method1398(local77, local47, local21, local25, local29);
			return;
		}
		local21 = Static100.aClass2_Sub17_Sub1_1.method1751();
		local25 = Static100.aClass2_Sub17_Sub1_1.method1790();
		local29 = Static100.aClass2_Sub17_Sub1_1.method1756();
		Static100.aClass2_Sub17_Sub1_1.method1810();
		for (local37 = 0; local37 < 4; local37++) {
			for (local43 = 0; local43 < 13; local43++) {
				for (local47 = 0; local47 < 13; local47++) {
					local77 = Static100.aClass2_Sub17_Sub1_1.method1801(1);
					if (local77 == 1) {
						Static37.anIntArrayArrayArray1[local37][local43][local47] = Static100.aClass2_Sub17_Sub1_1.method1801(26);
					} else {
						Static37.anIntArrayArrayArray1[local37][local43][local47] = -1;
					}
				}
			}
		}
		Static100.aClass2_Sub17_Sub1_1.method1806();
		local43 = (Static65.anInt1843 - Static100.aClass2_Sub17_Sub1_1.anInt2799) / 16;
		Static23.anIntArrayArray11 = new int[local43][4];
		for (local47 = 0; local47 < local43; local47++) {
			for (local77 = 0; local77 < 4; local77++) {
				Static23.anIntArrayArray11[local47][local77] = Static100.aClass2_Sub17_Sub1_1.method1788();
			}
		}
		local77 = Static100.aClass2_Sub17_Sub1_1.method1756();
		@Pc(389) int local389 = Static100.aClass2_Sub17_Sub1_1.method1783();
		Static114.anIntArray383 = new int[local43];
		Static91.aByteArrayArray7 = new byte[local43][];
		Static103.anIntArray351 = new int[local43];
		Static68.anIntArray235 = new int[local43];
		Static8.aByteArrayArray1 = new byte[local43][];
		local43 = 0;
		for (local133 = 0; local133 < 4; local133++) {
			for (local141 = 0; local141 < 13; local141++) {
				for (local149 = 0; local149 < 13; local149++) {
					@Pc(426) int local426 = Static37.anIntArrayArrayArray1[local133][local141][local149];
					if (local426 != -1) {
						@Pc(436) int local436 = local426 >> 3 & 0x7FF;
						@Pc(442) int local442 = local426 >> 14 & 0x3FF;
						@Pc(452) int local452 = (local442 / 8 << 8) + local436 / 8;
						for (@Pc(454) int local454 = 0; local454 < local43; local454++) {
							if (Static103.anIntArray351[local454] == local452) {
								local452 = -1;
								break;
							}
						}
						if (local452 != -1) {
							@Pc(482) int local482 = local452 >> 8 & 0xFF;
							Static103.anIntArray351[local43] = local452;
							@Pc(490) int local490 = local452 & 0xFF;
							Static114.anIntArray383[local43] = Static8.aClass11_Sub1_2.method378(Static93.method1444(new Class80[] { Static35.aClass80_390, Static28.method1422(local482), Static104.aClass80_1027, Static28.method1422(local490) }));
							Static68.anIntArray235[local43] = Static8.aClass11_Sub1_2.method378(Static93.method1444(new Class80[] { Static88.aClass80_852, Static28.method1422(local482), Static104.aClass80_1027, Static28.method1422(local490) }));
							local43++;
						}
					}
				}
			}
		}
		Static92.method1398(local21, local389, local29, local77, local25);
	}

	@OriginalMember(owner = "client!t", name = "t", descriptor = "(I)V")
	public static void method1803() {
		aClass80_1062 = null;
		aClass80_1065 = null;
		aClass80_1066 = null;
		aClass80_1063 = null;
		anIntArray359 = null;
		aClass51Array1 = null;
		aClass80_1059 = null;
		aByteArrayArray8 = null;
		aClass80_1060 = null;
		aClass80_1064 = null;
		aClass80_1058 = null;
		aClass80_1061 = null;
		aClass80_1067 = null;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(IB)Lclient!wd;")
	public static Class80 method1804() {
		@Pc(7) Class80 local7 = new Class80();
		local7.aByteArray40 = new byte[100];
		local7.anInt3200 = 0;
		return local7;
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "(ZI)Lclient!pc;")
	public static Class2_Sub1_Sub12 method1805(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub1_Sub12 local10 = (Class2_Sub1_Sub12) Static10.aClass32_8.method887((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static62.aClass11_28.method383(arg0, 13);
		local10 = new Class2_Sub1_Sub12();
		local10.anInt2207 = arg0;
		if (local20 != null) {
			local10.method1342(new Class2_Sub17(local20));
		}
		Static10.aClass32_8.method880(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1808(@OriginalArg(1) Component arg0) {
		arg0.addMouseListener(Static71.aClass45_1);
		arg0.addMouseMotionListener(Static71.aClass45_1);
		arg0.addFocusListener(Static71.aClass45_1);
	}
}
