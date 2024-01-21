import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
	public static int anInt2060;

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1216 = Static107.method1838("(U5");

	@OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
	public static volatile int anInt2057 = 0;

	@OriginalMember(owner = "client!jb", name = "i", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1217 = Static107.method1838("scroll:");

	@OriginalMember(owner = "client!jb", name = "j", descriptor = "Lclient!qd;")
	public static Class65 aClass65_6 = new Class65();

	@OriginalMember(owner = "client!jb", name = "w", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1223 = Static107.method1838("red:");

	@OriginalMember(owner = "client!jb", name = "k", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1218 = aClass28_1223;

	@OriginalMember(owner = "client!jb", name = "l", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1219 = Static107.method1838("Bitte entfernen Sie ");

	@OriginalMember(owner = "client!jb", name = "n", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1220 = aClass28_1217;

	@OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
	public static int anInt2059 = 0;

	@OriginalMember(owner = "client!jb", name = "r", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1221 = aClass28_1217;

	@OriginalMember(owner = "client!jb", name = "t", descriptor = "[Lclient!gg;")
	public static Class28[] aClass28Array29 = new Class28[500];

	@OriginalMember(owner = "client!jb", name = "v", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1222 = aClass28_1223;

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method1437() {
		aClass28_1220 = null;
		aClass65_6 = null;
		aClass28Array29 = null;
		aClass28_1217 = null;
		aClass28_1223 = null;
		aClass28_1218 = null;
		aClass28_1221 = null;
		aClass28_1219 = null;
		aClass28_1216 = null;
		aClass28_1222 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
	public static void method1440() {
		@Pc(19) int local19;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(28) int local28;
		@Pc(64) Class2_Sub4_Sub1_Sub6 local64;
		if (Static113.anInt2734 == 232) {
			local19 = Static151.aClass2_Sub2_Sub1_3.method1667();
			local28 = Static118.anInt4004 + (local19 >> 4 & 0x7);
			local34 = (local19 & 0x7) + Static18.anInt3716;
			local38 = Static151.aClass2_Sub2_Sub1_3.method1674();
			local42 = Static151.aClass2_Sub2_Sub1_3.method1665();
			if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104) {
				local64 = new Class2_Sub4_Sub1_Sub6();
				local64.anInt2595 = local38;
				local64.anInt2590 = local42;
				if (Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local28][local34] == null) {
					Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local28][local34] = new Class65();
				}
				Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local28][local34].method2116(local64);
				Static52.method966(local34, local28);
			}
			return;
		}
		@Pc(126) int local126;
		@Pc(134) int local134;
		@Pc(138) int local138;
		@Pc(146) int local146;
		@Pc(152) int local152;
		if (Static113.anInt2734 == 124) {
			local19 = Static151.aClass2_Sub2_Sub1_3.method1674();
			@Pc(114) byte local114 = Static151.aClass2_Sub2_Sub1_3.method1651();
			local34 = Static151.aClass2_Sub2_Sub1_3.method1680();
			local38 = Static151.aClass2_Sub2_Sub1_3.method1667();
			local126 = local38 & 0x3;
			local42 = local38 >> 2;
			local134 = Static77.anIntArray190[local42];
			local138 = Static151.aClass2_Sub2_Sub1_3.method1703();
			local146 = (local138 >> 4 & 0x7) + Static118.anInt4004;
			local152 = (local138 & 0x7) + Static18.anInt3716;
			@Pc(156) byte local156 = Static151.aClass2_Sub2_Sub1_3.method1651();
			@Pc(160) byte local160 = Static151.aClass2_Sub2_Sub1_3.method1707();
			@Pc(164) byte local164 = Static151.aClass2_Sub2_Sub1_3.method1673();
			@Pc(168) int local168 = Static151.aClass2_Sub2_Sub1_3.method1665();
			@Pc(172) int local172 = Static151.aClass2_Sub2_Sub1_3.method1670();
			@Pc(183) Class2_Sub4_Sub1_Sub1_Sub2 local183;
			if (Static50.anInt1313 == local172) {
				local183 = Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2;
			} else {
				local183 = Static34.aClass2_Sub4_Sub1_Sub1_Sub2Array1[local172];
			}
			if (local183 != null) {
				@Pc(193) Class2_Sub4_Sub6 local193 = Static151.method2339(local19);
				@Pc(204) int local204;
				@Pc(207) int local207;
				if (local126 == 1 || local126 == 3) {
					local204 = local193.anInt1037;
					local207 = local193.anInt1050;
				} else {
					local207 = local193.anInt1037;
					local204 = local193.anInt1050;
				}
				@Pc(223) int local223 = (local204 + 1 >> 1) + local146;
				@Pc(232) int local232 = local152 + (local207 + 1 >> 1);
				@Pc(240) int local240 = (local146 << 7) + (local204 << 6);
				@Pc(247) int local247 = local152 + (local207 >> 1);
				@Pc(255) int local255 = (local207 << 6) + (local152 << 7);
				@Pc(261) int local261 = (local204 >> 1) + local146;
				@Pc(265) int[][] local265 = Static78.anIntArrayArrayArray6[Static103.anInt2568];
				@Pc(291) int local291 = local265[local223][local232] + local265[local261][local232] + local265[local261][local247] + local265[local223][local247] >> 2;
				@Pc(301) Class2_Sub4_Sub1_Sub3 local301 = local193.method716(local255, local265, local42, local126, local240, local291);
				if (local301 != null) {
					@Pc(308) byte local308;
					if (local156 > local160) {
						local308 = local156;
						local156 = local160;
						local160 = local308;
					}
					if (local114 > local164) {
						local308 = local114;
						local114 = local164;
						local164 = local308;
					}
					Static157.method2410(0, local134, local146, local168 + 1, Static103.anInt2568, local152, -1, 0, local34 + 1);
					local183.anInt1656 = local34 + Static156.anInt3491;
					local183.anInt1676 = local291;
					local183.aClass2_Sub4_Sub1_Sub3_1 = local301;
					local183.anInt1662 = Static156.anInt3491 + local168;
					local183.anInt1674 = local204 * 64 + local146 * 128;
					local183.anInt1661 = local146 + local160;
					local183.anInt1672 = local152 + local164;
					local183.anInt1675 = local114 + local152;
					local183.anInt1655 = local207 * 64 + local152 * 128;
					local183.anInt1664 = local146 + local156;
				}
			}
		}
		if (Static113.anInt2734 == 102) {
			local19 = Static151.aClass2_Sub2_Sub1_3.method1668();
			local28 = local19 >> 2;
			local34 = local19 & 0x3;
			local38 = Static77.anIntArray190[local28];
			local42 = Static151.aClass2_Sub2_Sub1_3.method1670();
			local126 = Static151.aClass2_Sub2_Sub1_3.method1667();
			local134 = Static118.anInt4004 + (local126 >> 4 & 0x7);
			local138 = (local126 & 0x7) + Static18.anInt3716;
			if (local134 >= 0 && local138 >= 0 && local134 < 103 && local138 < 103) {
				if (local38 == 0) {
					@Pc(462) Class52 local462 = Static166.method2583(Static103.anInt2568, local134, local138);
					if (local462 != null) {
						local152 = (int) (local462.aLong93 >>> 32) & Integer.MAX_VALUE;
						if (local28 == 2) {
							local462.aClass2_Sub4_Sub1_6 = new Class2_Sub4_Sub1_Sub4(local152, 2, local34 + 4, Static103.anInt2568, local134, local138, local42, false, local462.aClass2_Sub4_Sub1_6);
							local462.aClass2_Sub4_Sub1_5 = new Class2_Sub4_Sub1_Sub4(local152, 2, local34 + 1 & 0x3, Static103.anInt2568, local134, local138, local42, false, local462.aClass2_Sub4_Sub1_5);
						} else {
							local462.aClass2_Sub4_Sub1_6 = new Class2_Sub4_Sub1_Sub4(local152, local28, local34, Static103.anInt2568, local134, local138, local42, false, local462.aClass2_Sub4_Sub1_6);
						}
					}
				}
				if (local38 == 1) {
					@Pc(539) Class49 local539 = Static90.method1617(Static103.anInt2568, local134, local138);
					if (local539 != null) {
						local152 = (int) (local539.aLong89 >>> 32) & Integer.MAX_VALUE;
						if (local28 == 4 || local28 == 5) {
							local539.aClass2_Sub4_Sub1_4 = new Class2_Sub4_Sub1_Sub4(local152, 4, local34, Static103.anInt2568, local134, local138, local42, false, local539.aClass2_Sub4_Sub1_4);
						} else if (local28 == 6) {
							local539.aClass2_Sub4_Sub1_4 = new Class2_Sub4_Sub1_Sub4(local152, 4, local34 + 4, Static103.anInt2568, local134, local138, local42, false, local539.aClass2_Sub4_Sub1_4);
						} else if (local28 == 7) {
							local539.aClass2_Sub4_Sub1_4 = new Class2_Sub4_Sub1_Sub4(local152, 4, (local34 + 2 & 0x3) + 4, Static103.anInt2568, local134, local138, local42, false, local539.aClass2_Sub4_Sub1_4);
						} else if (local28 == 8) {
							local539.aClass2_Sub4_Sub1_4 = new Class2_Sub4_Sub1_Sub4(local152, 4, local34 + 4, Static103.anInt2568, local134, local138, local42, false, local539.aClass2_Sub4_Sub1_4);
							local539.aClass2_Sub4_Sub1_3 = new Class2_Sub4_Sub1_Sub4(local152, 4, (local34 + 2 & 0x3) + 4, Static103.anInt2568, local134, local138, local42, false, local539.aClass2_Sub4_Sub1_3);
						}
					}
				}
				if (local38 == 2) {
					if (local28 == 11) {
						local28 = 10;
					}
					@Pc(682) Class43 local682 = Static110.method1876(Static103.anInt2568, local134, local138);
					if (local682 != null) {
						local682.aClass2_Sub4_Sub1_2 = new Class2_Sub4_Sub1_Sub4((int) (local682.aLong83 >>> 32) & Integer.MAX_VALUE, local28, local34, Static103.anInt2568, local134, local138, local42, false, local682.aClass2_Sub4_Sub1_2);
					}
				}
				if (local38 == 3) {
					@Pc(713) Class19 local713 = Static24.method481(Static103.anInt2568, local134, local138);
					if (local713 != null) {
						local713.aClass2_Sub4_Sub1_1 = new Class2_Sub4_Sub1_Sub4(Integer.MAX_VALUE & (int) (local713.aLong36 >>> 32), 22, local34, Static103.anInt2568, local134, local138, local42, false, local713.aClass2_Sub4_Sub1_1);
					}
				}
			}
		} else if (Static113.anInt2734 == 229) {
			local19 = Static151.aClass2_Sub2_Sub1_3.method1668();
			local28 = (local19 >> 4 & 0x7) + Static118.anInt4004;
			local34 = Static18.anInt3716 + (local19 & 0x7);
			local38 = Static151.aClass2_Sub2_Sub1_3.method1670();
			local42 = Static151.aClass2_Sub2_Sub1_3.method1665();
			local126 = Static151.aClass2_Sub2_Sub1_3.method1670();
			if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104 && local126 != Static50.anInt1313) {
				@Pc(789) Class2_Sub4_Sub1_Sub6 local789 = new Class2_Sub4_Sub1_Sub6();
				local789.anInt2595 = local38;
				local789.anInt2590 = local42;
				if (Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local28][local34] == null) {
					Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local28][local34] = new Class65();
				}
				Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local28][local34].method2116(local789);
				Static52.method966(local34, local28);
			}
		} else if (Static113.anInt2734 == 120) {
			local19 = Static151.aClass2_Sub2_Sub1_3.method1698();
			local34 = (local19 & 0x7) + Static18.anInt3716;
			local28 = Static118.anInt4004 + (local19 >> 4 & 0x7);
			local38 = Static151.aClass2_Sub2_Sub1_3.method1680();
			local42 = Static151.aClass2_Sub2_Sub1_3.method1698();
			local126 = Static151.aClass2_Sub2_Sub1_3.method1680();
			if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104) {
				local28 = local28 * 128 + 64;
				local34 = local34 * 128 + 64;
				@Pc(908) Class2_Sub4_Sub1_Sub2 local908 = new Class2_Sub4_Sub1_Sub2(local38, Static103.anInt2568, local28, local34, Static103.method1808(Static103.anInt2568, local28, local34) - local42, local126, Static156.anInt3491);
				Static38.aClass65_3.method2116(local908);
			}
		} else {
			if (Static113.anInt2734 == 163) {
				local19 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local28 = Static118.anInt4004 + (local19 >> 4 & 0x7);
				local34 = Static18.anInt3716 + (local19 & 0x7);
				local38 = Static151.aClass2_Sub2_Sub1_3.method1680();
				local42 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local126 = local42 >> 4 & 0xF;
				local134 = local42 & 0x7;
				local138 = Static151.aClass2_Sub2_Sub1_3.method1698();
				if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104) {
					local146 = local126 + 1;
					if (Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0] >= local28 - local146 && Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray139[0] <= local146 + local28 && local34 - local146 <= Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0] && local146 + local34 >= Static3.aClass2_Sub4_Sub1_Sub1_Sub2_2.anIntArray142[0] && Static101.anInt443 != 0 && local134 > 0 && Static145.anInt3283 < 50) {
						Static44.anIntArray103[Static145.anInt3283] = local38;
						Static21.anIntArray51[Static145.anInt3283] = local134;
						Static10.anIntArray38[Static145.anInt3283] = local138;
						Static115.aClass38Array1[Static145.anInt3283] = null;
						Static124.anIntArray269[Static145.anInt3283] = (local28 << 16) + (local34 << 8) + local126;
						Static145.anInt3283++;
					}
				}
			}
			if (Static113.anInt2734 == 105) {
				local19 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local28 = (local19 >> 4 & 0x7) + Static118.anInt4004;
				local34 = (local19 & 0x7) + Static18.anInt3716;
				local38 = Static151.aClass2_Sub2_Sub1_3.method1670();
				if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104) {
					@Pc(1118) Class65 local1118 = Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local28][local34];
					if (local1118 != null) {
						for (local64 = (Class2_Sub4_Sub1_Sub6) local1118.method2115(); local64 != null; local64 = (Class2_Sub4_Sub1_Sub6) local1118.method2117()) {
							if (local64.anInt2595 == (local38 & 0x7FFF)) {
								local64.method2888();
								break;
							}
						}
						if (local1118.method2115() == null) {
							Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local28][local34] = null;
						}
						Static52.method966(local34, local28);
					}
				}
			} else if (Static113.anInt2734 == 28) {
				local19 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local28 = (local19 >> 4 & 0x7) + Static118.anInt4004;
				local34 = (local19 & 0x7) + Static18.anInt3716;
				local38 = Static151.aClass2_Sub2_Sub1_3.method1680();
				local42 = Static151.aClass2_Sub2_Sub1_3.method1680();
				local126 = Static151.aClass2_Sub2_Sub1_3.method1680();
				if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104) {
					@Pc(1227) Class65 local1227 = Static147.aClass65ArrayArrayArray1[Static103.anInt2568][local28][local34];
					if (local1227 != null) {
						for (@Pc(1234) Class2_Sub4_Sub1_Sub6 local1234 = (Class2_Sub4_Sub1_Sub6) local1227.method2115(); local1234 != null; local1234 = (Class2_Sub4_Sub1_Sub6) local1227.method2117()) {
							if (local1234.anInt2595 == (local38 & 0x7FFF) && local1234.anInt2590 == local42) {
								local1234.anInt2590 = local126;
								break;
							}
						}
						Static52.method966(local34, local28);
					}
				}
			} else if (Static113.anInt2734 == 26) {
				local19 = Static151.aClass2_Sub2_Sub1_3.method1703();
				local28 = local19 >> 2;
				local38 = Static77.anIntArray190[local28];
				local34 = local19 & 0x3;
				local42 = Static151.aClass2_Sub2_Sub1_3.method1670();
				local126 = Static151.aClass2_Sub2_Sub1_3.method1668();
				local138 = Static18.anInt3716 + (local126 & 0x7);
				local134 = Static118.anInt4004 + (local126 >> 4 & 0x7);
				if (local134 >= 0 && local138 >= 0 && local134 < 104 && local138 < 104) {
					Static157.method2410(local28, local38, local134, 0, Static103.anInt2568, local138, local42, local34, -1);
				}
			} else if (Static113.anInt2734 == 37) {
				local19 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local28 = (local19 >> 4 & 0x7) + Static118.anInt4004;
				local34 = Static18.anInt3716 + (local19 & 0x7);
				local38 = local28 + Static151.aClass2_Sub2_Sub1_3.method1707();
				local42 = local34 + Static151.aClass2_Sub2_Sub1_3.method1707();
				local126 = Static151.aClass2_Sub2_Sub1_3.method1659();
				local134 = Static151.aClass2_Sub2_Sub1_3.method1680();
				local138 = Static151.aClass2_Sub2_Sub1_3.method1698() * 4;
				local146 = Static151.aClass2_Sub2_Sub1_3.method1698() * 4;
				local152 = Static151.aClass2_Sub2_Sub1_3.method1680();
				@Pc(1411) int local1411 = Static151.aClass2_Sub2_Sub1_3.method1680();
				@Pc(1415) int local1415 = Static151.aClass2_Sub2_Sub1_3.method1698();
				@Pc(1419) int local1419 = Static151.aClass2_Sub2_Sub1_3.method1698();
				if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104 && local38 >= 0 && local42 >= 0 && local38 < 104 && local42 < 104 && local134 != 65535) {
					local42 = local42 * 128 + 64;
					local34 = local34 * 128 + 64;
					local28 = local28 * 128 + 64;
					@Pc(1502) Class2_Sub4_Sub1_Sub7 local1502 = new Class2_Sub4_Sub1_Sub7(local134, Static103.anInt2568, local28, local34, Static103.method1808(Static103.anInt2568, local28, local34) - local138, Static156.anInt3491 + local152, Static156.anInt3491 + local1411, local1415, local1419, local126, local146);
					local38 = local38 * 128 + 64;
					local1502.method2868(Static103.method1808(Static103.anInt2568, local38, local42) - local146, local42, local38, Static156.anInt3491 + local152);
					Static100.aClass65_9.method2116(local1502);
				}
			} else if (Static113.anInt2734 == 165) {
				local19 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local28 = (local19 >> 4 & 0x7) + Static118.anInt4004;
				local34 = Static18.anInt3716 + (local19 & 0x7);
				local38 = Static151.aClass2_Sub2_Sub1_3.method1698();
				local42 = local38 >> 2;
				local126 = local38 & 0x3;
				local134 = Static77.anIntArray190[local42];
				if (local28 >= 0 && local34 >= 0 && local28 < 104 && local34 < 104) {
					Static157.method2410(local42, local134, local28, 0, Static103.anInt2568, local34, -1, local126, -1);
				}
			}
		}
	}
}
