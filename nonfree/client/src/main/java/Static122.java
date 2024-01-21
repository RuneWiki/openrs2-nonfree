import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!uf", name = "D", descriptor = "[Lclient!k;")
	public static Class2_Sub1_Sub4_Sub2[] aClass2_Sub1_Sub4_Sub2Array10;

	@OriginalMember(owner = "client!uf", name = "w", descriptor = "Lclient!pe;")
	private static Class65 aClass65_1139 = Static119.method1462("flash2:");

	@OriginalMember(owner = "client!uf", name = "x", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1140 = Static119.method1462("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!uf", name = "y", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1141 = Static119.method1462("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!uf", name = "z", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1142 = Static119.method1462("<col=ff7000>");

	@OriginalMember(owner = "client!uf", name = "A", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1143 = Static119.method1462("RuneScape wurde aktualisiert(Q");

	@OriginalMember(owner = "client!uf", name = "B", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1144 = aClass65_1139;

	@OriginalMember(owner = "client!uf", name = "C", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1145 = aClass65_1139;

	@OriginalMember(owner = "client!uf", name = "H", descriptor = "I")
	public static int anInt2624 = 0;

	@OriginalMember(owner = "client!uf", name = "J", descriptor = "Lclient!pe;")
	public static Class65 aClass65_1146 = Static119.method1462("::gc");

	@OriginalMember(owner = "client!uf", name = "c", descriptor = "(B)V")
	public static void method1882() {
		Static66.aClass2_Sub4_Sub1_2.method954();
		@Pc(11) int local11 = Static66.aClass2_Sub4_Sub1_2.method953(1);
		if (local11 == 0) {
			return;
		}
		@Pc(24) int local24 = Static66.aClass2_Sub4_Sub1_2.method953(2);
		if (local24 == 0) {
			Static68.anIntArray376[Static33.anInt761++] = 2047;
			return;
		}
		@Pc(45) int local45;
		@Pc(55) int local55;
		if (local24 == 1) {
			local45 = Static66.aClass2_Sub4_Sub1_2.method953(3);
			Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.method1470(false, local45);
			local55 = Static66.aClass2_Sub4_Sub1_2.method953(1);
			if (local55 == 1) {
				Static68.anIntArray376[Static33.anInt761++] = 2047;
			}
			return;
		}
		@Pc(95) int local95;
		if (local24 == 2) {
			local45 = Static66.aClass2_Sub4_Sub1_2.method953(3);
			Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.method1470(true, local45);
			local55 = Static66.aClass2_Sub4_Sub1_2.method953(3);
			Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.method1470(true, local55);
			local95 = Static66.aClass2_Sub4_Sub1_2.method953(1);
			if (local95 == 1) {
				Static68.anIntArray376[Static33.anInt761++] = 2047;
			}
		} else if (local24 == 3) {
			local45 = Static66.aClass2_Sub4_Sub1_2.method953(7);
			local55 = Static66.aClass2_Sub4_Sub1_2.method953(7);
			Static59.anInt1479 = Static66.aClass2_Sub4_Sub1_2.method953(2);
			local95 = Static66.aClass2_Sub4_Sub1_2.method953(1);
			@Pc(137) int local137 = Static66.aClass2_Sub4_Sub1_2.method953(1);
			if (local137 == 1) {
				Static68.anIntArray376[Static33.anInt761++] = 2047;
			}
			Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.method1468(local95 == 1, local45, local55);
		}
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "(IILclient!wa;)Lclient!pe;")
	public static Class65 method1883(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (!Static63.method1134(arg0, Static114.method1834(arg1)) && arg1.anObjectArray22 == null) {
			return null;
		} else if (arg1.aClass65Array79 == null || arg0 >= arg1.aClass65Array79.length || arg1.aClass65Array79[arg0] == null || arg1.aClass65Array79[arg0].method1474().method1502() == 0) {
			return Static12.aBoolean14 ? Static35.method647(new Class65[] { Static68.aClass65_1239, Static120.method1871(arg0) }) : null;
		} else {
			return arg1.aClass65Array79[arg0];
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(III)I")
	public static int method1884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static6.method131(arg1 + 91923, 4, arg0 + 45365) + (Static6.method131(arg1 + 37821, 2, arg0 - -10294) - 128 >> 1) + (Static6.method131(arg1, 1, arg0) + -128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!uf", name = "d", descriptor = "(B)V")
	public static void method1885() {
		@Pc(16) int local16;
		@Pc(31) int local31;
		@Pc(35) int local35;
		@Pc(39) int local39;
		@Pc(12) int local12;
		@Pc(24) int local24;
		if (Static15.anInt365 == 10) {
			local12 = Static66.aClass2_Sub4_Sub1_2.method902();
			local16 = Static66.aClass2_Sub4_Sub1_2.method899();
			local24 = Static11.anInt1317 + (local16 >> 4 & 0x7);
			local31 = Static15.anInt371 + (local16 & 0x7);
			local35 = Static66.aClass2_Sub4_Sub1_2.method902();
			local39 = Static66.aClass2_Sub4_Sub1_2.method896();
			if (local24 >= 0 && local31 >= 0 && local24 < 104 && local31 < 104 && local12 != Static93.anInt2098) {
				@Pc(64) Class2_Sub1_Sub1_Sub6 local64 = new Class2_Sub1_Sub1_Sub6();
				local64.anInt2468 = local35;
				local64.anInt2464 = local39;
				if (Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local24][local31] == null) {
					Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local24][local31] = new Class13();
				}
				Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local24][local31].method263(local64);
				Static54.method961(local24, local31);
			}
			return;
		}
		@Pc(144) int local144;
		@Pc(148) int local148;
		@Pc(152) int local152;
		@Pc(156) int local156;
		@Pc(160) int local160;
		if (Static15.anInt365 == 68) {
			@Pc(112) byte local112 = Static66.aClass2_Sub4_Sub1_2.method928();
			local16 = Static66.aClass2_Sub4_Sub1_2.method902();
			@Pc(120) byte local120 = Static66.aClass2_Sub4_Sub1_2.method922();
			local31 = Static66.aClass2_Sub4_Sub1_2.method902();
			local35 = Static66.aClass2_Sub4_Sub1_2.method896();
			local39 = Static66.aClass2_Sub4_Sub1_2.method919();
			@Pc(136) byte local136 = Static66.aClass2_Sub4_Sub1_2.method928();
			@Pc(140) byte local140 = Static66.aClass2_Sub4_Sub1_2.method922();
			local144 = Static66.aClass2_Sub4_Sub1_2.method923();
			local148 = local144 >> 2;
			local152 = local144 & 0x3;
			local156 = Static4.anIntArray156[local148];
			local160 = Static66.aClass2_Sub4_Sub1_2.method933();
			@Pc(168) int local168 = (local160 >> 4 & 0x7) + Static11.anInt1317;
			@Pc(174) int local174 = Static15.anInt371 + (local160 & 0x7);
			@Pc(179) Class2_Sub1_Sub1_Sub4_Sub1 local179;
			if (local35 == Static93.anInt2098) {
				local179 = Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1;
			} else {
				local179 = Static86.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local35];
			}
			if (local179 != null) {
				@Pc(191) Class2_Sub1_Sub15 local191 = Static73.method1248(local39);
				@Pc(200) int local200;
				@Pc(203) int local203;
				if (local152 == 1 || local152 == 3) {
					local200 = local191.anInt2689;
					local203 = local191.anInt2671;
				} else {
					local203 = local191.anInt2689;
					local200 = local191.anInt2671;
				}
				@Pc(215) int[][] local215 = Static67.anIntArrayArrayArray8[Static59.anInt1479];
				@Pc(224) int local224 = local174 + (local203 + 1 >> 1);
				@Pc(233) int local233 = local168 + (local200 + 1 >> 1);
				@Pc(239) int local239 = (local203 >> 1) + local174;
				@Pc(245) int local245 = (local200 >> 1) + local168;
				@Pc(253) int local253 = (local200 << 6) + (local168 << 7);
				@Pc(281) int local281 = local215[local245][local239] + local215[local233][local239] + local215[local245][local224] + local215[local233][local224] >> 2;
				@Pc(289) int local289 = (local174 << 7) + (local203 << 6);
				@Pc(299) Class2_Sub1_Sub1_Sub7 local299 = local191.method1916(local289, local152, local253, local215, local281, local148);
				if (local299 != null) {
					@Pc(306) byte local306;
					if (local140 < local120) {
						local306 = local120;
						local120 = local140;
						local140 = local306;
					}
					if (local136 < local112) {
						local306 = local112;
						local112 = local136;
						local136 = local306;
					}
					Static61.method1101(0, local16 + 1, local168, local156, local31 + 1, -1, local174, Static59.anInt1479, 0);
					local179.anInt1021 = local168 + local120;
					local179.anInt1034 = local200 * 64 + local168 * 128;
					local179.anInt1032 = local136 + local174;
					local179.anInt1015 = local112 + local174;
					local179.anInt1029 = Static10.anInt2951 + local16;
					local179.anInt1017 = local203 * 64 + local174 * 128;
					local179.anInt1033 = local140 + local168;
					local179.aClass2_Sub1_Sub1_Sub7_1 = local299;
					local179.anInt1023 = local31 + Static10.anInt2951;
					local179.anInt1025 = local281;
				}
			}
		}
		@Pc(425) int local425;
		if (Static15.anInt365 == 140) {
			local12 = Static66.aClass2_Sub4_Sub1_2.method933();
			local16 = (local12 >> 4 & 0x7) + Static11.anInt1317;
			local24 = (local12 & 0x7) + Static15.anInt371;
			local31 = Static66.aClass2_Sub4_Sub1_2.method923();
			local35 = local31 >> 2;
			local39 = local31 & 0x3;
			local425 = Static4.anIntArray156[local35];
			if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104) {
				Static61.method1101(local39, -1, local16, local425, 0, -1, local24, Static59.anInt1479, local35);
			}
			return;
		}
		@Pc(499) int local499;
		if (Static15.anInt365 == 66) {
			local12 = Static66.aClass2_Sub4_Sub1_2.method933();
			local16 = (local12 >> 4 & 0x7) + Static11.anInt1317;
			local24 = (local12 & 0x7) + Static15.anInt371;
			local31 = Static66.aClass2_Sub4_Sub1_2.method922() + local16;
			local35 = Static66.aClass2_Sub4_Sub1_2.method922() + local24;
			local39 = Static66.aClass2_Sub4_Sub1_2.method905();
			local425 = Static66.aClass2_Sub4_Sub1_2.method896();
			local499 = Static66.aClass2_Sub4_Sub1_2.method933() * 4;
			local144 = Static66.aClass2_Sub4_Sub1_2.method933() * 4;
			local148 = Static66.aClass2_Sub4_Sub1_2.method896();
			local152 = Static66.aClass2_Sub4_Sub1_2.method896();
			local156 = Static66.aClass2_Sub4_Sub1_2.method933();
			local160 = Static66.aClass2_Sub4_Sub1_2.method933();
			if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104 && local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104 && local425 != 65535) {
				local31 = local31 * 128 + 64;
				local16 = local16 * 128 + 64;
				local24 = local24 * 128 + 64;
				local35 = local35 * 128 + 64;
				@Pc(612) Class2_Sub1_Sub1_Sub5 local612 = new Class2_Sub1_Sub1_Sub5(local425, Static59.anInt1479, local16, local24, Static106.method1718(local24, local16, Static59.anInt1479) - local499, local148 - -Static10.anInt2951, local152 + Static10.anInt2951, local156, local160, local39, local144);
				local612.method1591(Static10.anInt2951 + local148, local35, Static106.method1718(local35, local31, Static59.anInt1479) - local144, local31);
				Static124.aClass13_18.method263(local612);
			}
			return;
		}
		@Pc(690) Class2_Sub1_Sub1_Sub6 local690;
		if (Static15.anInt365 == 75) {
			local12 = Static66.aClass2_Sub4_Sub1_2.method911();
			local16 = (local12 >> 4 & 0x7) + Static11.anInt1317;
			local24 = (local12 & 0x7) + Static15.anInt371;
			local31 = Static66.aClass2_Sub4_Sub1_2.method927();
			if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104) {
				@Pc(683) Class13 local683 = Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local16][local24];
				if (local683 != null) {
					for (local690 = (Class2_Sub1_Sub1_Sub6) local683.method270(); local690 != null; local690 = (Class2_Sub1_Sub1_Sub6) local683.method273()) {
						if (local690.anInt2468 == (local31 & 0x7FFF)) {
							local690.method2053();
							break;
						}
					}
					if (local683.method270() == null) {
						Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local16][local24] = null;
					}
					Static54.method961(local16, local24);
				}
			}
		} else if (Static15.anInt365 == 22) {
			local12 = Static66.aClass2_Sub4_Sub1_2.method919();
			local16 = Static66.aClass2_Sub4_Sub1_2.method919();
			local24 = Static66.aClass2_Sub4_Sub1_2.method933();
			local35 = Static15.anInt371 + (local24 & 0x7);
			local31 = (local24 >> 4 & 0x7) + Static11.anInt1317;
			if (local31 >= 0 && local35 >= 0 && local31 < 104 && local35 < 104) {
				local690 = new Class2_Sub1_Sub1_Sub6();
				local690.anInt2468 = local12;
				local690.anInt2464 = local16;
				if (Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local31][local35] == null) {
					Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local31][local35] = new Class13();
				}
				Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local31][local35].method263(local690);
				Static54.method961(local31, local35);
			}
		} else if (Static15.anInt365 == 129) {
			local12 = Static66.aClass2_Sub4_Sub1_2.method933();
			local16 = Static11.anInt1317 + (local12 >> 4 & 0x7);
			local24 = Static15.anInt371 + (local12 & 0x7);
			local31 = Static66.aClass2_Sub4_Sub1_2.method896();
			local35 = Static66.aClass2_Sub4_Sub1_2.method896();
			local39 = Static66.aClass2_Sub4_Sub1_2.method896();
			if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104) {
				@Pc(875) Class13 local875 = Static76.aClass13ArrayArrayArray1[Static59.anInt1479][local16][local24];
				if (local875 != null) {
					for (@Pc(882) Class2_Sub1_Sub1_Sub6 local882 = (Class2_Sub1_Sub1_Sub6) local875.method270(); local882 != null; local882 = (Class2_Sub1_Sub1_Sub6) local875.method273()) {
						if ((local31 & 0x7FFF) == local882.anInt2468 && local35 == local882.anInt2464) {
							local882.anInt2464 = local39;
							break;
						}
					}
					Static54.method961(local16, local24);
				}
			}
		} else {
			if (Static15.anInt365 == 149) {
				local12 = Static66.aClass2_Sub4_Sub1_2.method933();
				local24 = (local12 & 0x7) + Static15.anInt371;
				local16 = Static11.anInt1317 + (local12 >> 4 & 0x7);
				local31 = Static66.aClass2_Sub4_Sub1_2.method896();
				local35 = Static66.aClass2_Sub4_Sub1_2.method933();
				local39 = local35 >> 4 & 0xF;
				local425 = local35 & 0x7;
				local499 = Static66.aClass2_Sub4_Sub1_2.method933();
				if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104) {
					local144 = local39 + 1;
					if (local16 - local144 <= Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0] && local16 + local144 >= Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray263[0] && Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0] >= local24 - local144 && Static114.aClass2_Sub1_Sub1_Sub4_Sub1_1.anIntArray264[0] <= local24 + local144 && Static7.anInt221 != 0 && local425 > 0 && Static50.anInt1215 < 50) {
						Static128.anIntArray360[Static50.anInt1215] = local31;
						Static34.anIntArray99[Static50.anInt1215] = local425;
						Static110.anIntArray327[Static50.anInt1215] = local499;
						Static130.aClass44Array1[Static50.anInt1215] = null;
						Static115.anIntArray336[Static50.anInt1215] = (local16 << 16) + (local24 << 8) + local39;
						Static50.anInt1215++;
					}
				}
			}
			if (Static15.anInt365 == 24) {
				local12 = Static66.aClass2_Sub4_Sub1_2.method933();
				local24 = local12 & 0x3;
				local16 = local12 >> 2;
				local31 = Static4.anIntArray156[local16];
				local35 = Static66.aClass2_Sub4_Sub1_2.method899();
				local425 = Static15.anInt371 + (local35 & 0x7);
				local39 = (local35 >> 4 & 0x7) + Static11.anInt1317;
				local499 = Static66.aClass2_Sub4_Sub1_2.method896();
				if (local39 >= 0 && local425 >= 0 && local39 < 104 && local425 < 104) {
					Static61.method1101(local24, -1, local39, local31, 0, local499, local425, Static59.anInt1479, local16);
				}
			} else if (Static15.anInt365 == 107) {
				local12 = Static66.aClass2_Sub4_Sub1_2.method933();
				local24 = Static15.anInt371 + (local12 & 0x7);
				local16 = Static11.anInt1317 + (local12 >> 4 & 0x7);
				local31 = Static66.aClass2_Sub4_Sub1_2.method896();
				local35 = Static66.aClass2_Sub4_Sub1_2.method933();
				local39 = Static66.aClass2_Sub4_Sub1_2.method896();
				if (local16 >= 0 && local24 >= 0 && local16 < 104 && local24 < 104) {
					local16 = local16 * 128 + 64;
					local24 = local24 * 128 + 64;
					@Pc(1218) Class2_Sub1_Sub1_Sub3 local1218 = new Class2_Sub1_Sub1_Sub3(local31, Static59.anInt1479, local16, local24, Static106.method1718(local24, local16, Static59.anInt1479) - local35, local39, Static10.anInt2951);
					Static67.aClass13_10.method263(local1218);
				}
			} else if (Static15.anInt365 == 67) {
				local16 = Static66.aClass2_Sub4_Sub1_2.method902();
				local24 = Static66.aClass2_Sub4_Sub1_2.method933();
				local35 = local24 & 0x3;
				local31 = local24 >> 2;
				local39 = Static4.anIntArray156[local31];
				local425 = Static66.aClass2_Sub4_Sub1_2.method933();
				local499 = Static11.anInt1317 + (local425 >> 4 & 0x7);
				local144 = Static15.anInt371 + (local425 & 0x7);
				if (local499 >= 0 && local144 >= 0 && local499 < 103 && local144 < 103) {
					if (local39 == 0) {
						@Pc(1300) Class66 local1300 = Static124.aClass49_1.method1198(Static59.anInt1479, local499, local144);
						if (local1300 != null) {
							local152 = local1300.anInt2035 >> 14 & 0x7FFF;
							if (local31 == 2) {
								local1300.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub1(local152, 2, local35 + 4, Static59.anInt1479, local499, local144, local16, false, local1300.aClass2_Sub1_Sub1_5);
								local1300.aClass2_Sub1_Sub1_6 = new Class2_Sub1_Sub1_Sub1(local152, 2, local35 + 1 & 0x3, Static59.anInt1479, local499, local144, local16, false, local1300.aClass2_Sub1_Sub1_6);
							} else {
								local1300.aClass2_Sub1_Sub1_5 = new Class2_Sub1_Sub1_Sub1(local152, local31, local35, Static59.anInt1479, local499, local144, local16, false, local1300.aClass2_Sub1_Sub1_5);
							}
						}
					}
					if (local39 == 1) {
						@Pc(1378) Class81 local1378 = Static124.aClass49_1.method1174(Static59.anInt1479, local499, local144);
						if (local1378 != null) {
							local152 = local1378.anInt2706 >> 14 & 0x7FFF;
							if (local31 == 4 || local31 == 5) {
								local1378.aClass2_Sub1_Sub1_9 = new Class2_Sub1_Sub1_Sub1(local152, 4, local35, Static59.anInt1479, local499, local144, local16, false, local1378.aClass2_Sub1_Sub1_9);
							} else if (local31 == 6) {
								local1378.aClass2_Sub1_Sub1_9 = new Class2_Sub1_Sub1_Sub1(local152, 4, local35 + 4, Static59.anInt1479, local499, local144, local16, false, local1378.aClass2_Sub1_Sub1_9);
							} else if (local31 == 7) {
								local1378.aClass2_Sub1_Sub1_9 = new Class2_Sub1_Sub1_Sub1(local152, 4, (local35 + 2 & 0x3) + 4, Static59.anInt1479, local499, local144, local16, false, local1378.aClass2_Sub1_Sub1_9);
							} else if (local31 == 8) {
								local1378.aClass2_Sub1_Sub1_9 = new Class2_Sub1_Sub1_Sub1(local152, 4, local35 + 4, Static59.anInt1479, local499, local144, local16, false, local1378.aClass2_Sub1_Sub1_9);
								local1378.aClass2_Sub1_Sub1_8 = new Class2_Sub1_Sub1_Sub1(local152, 4, (local35 + 2 & 0x3) + 4, Static59.anInt1479, local499, local144, local16, false, local1378.aClass2_Sub1_Sub1_8);
							}
						}
					}
					if (local39 == 2) {
						if (local31 == 11) {
							local31 = 10;
						}
						@Pc(1523) Class12 local1523 = Static124.aClass49_1.method1153(Static59.anInt1479, local499, local144);
						if (local1523 != null) {
							local1523.aClass2_Sub1_Sub1_1 = new Class2_Sub1_Sub1_Sub1(local1523.anInt370 >> 14 & 0x7FFF, local31, local35, Static59.anInt1479, local499, local144, local16, false, local1523.aClass2_Sub1_Sub1_1);
						}
					}
					if (local39 == 3) {
						@Pc(1556) Class68 local1556 = Static124.aClass49_1.method1200(Static59.anInt1479, local499, local144);
						if (local1556 != null) {
							local1556.aClass2_Sub1_Sub1_7 = new Class2_Sub1_Sub1_Sub1(local1556.anInt2155 >> 14 & 0x7FFF, 22, local35, Static59.anInt1479, local499, local144, local16, false, local1556.aClass2_Sub1_Sub1_7);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
	public static void method1886() {
		aClass2_Sub1_Sub4_Sub2Array10 = null;
		aClass65_1143 = null;
		aClass65_1140 = null;
		aClass65_1141 = null;
		aClass65_1144 = null;
		aClass65_1146 = null;
		aClass65_1145 = null;
		aClass65_1139 = null;
		aClass65_1142 = null;
	}
}
