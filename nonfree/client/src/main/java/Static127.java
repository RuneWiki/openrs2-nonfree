import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!vf", name = "ob", descriptor = "I")
	public static int anInt2944;

	@OriginalMember(owner = "client!vf", name = "rb", descriptor = "[[B")
	public static byte[][] aByteArrayArray9;

	@OriginalMember(owner = "client!vf", name = "tb", descriptor = "[[B")
	public static byte[][] aByteArrayArray10;

	@OriginalMember(owner = "client!vf", name = "gb", descriptor = "Lclient!jf;")
	public static Class41 aClass41_2 = new Class41();

	@OriginalMember(owner = "client!vf", name = "hb", descriptor = "[Lclient!db;")
	public static Class2_Sub1_Sub1_Sub3_Sub1[] aClass2_Sub1_Sub1_Sub3_Sub1Array1 = new Class2_Sub1_Sub1_Sub3_Sub1[32768];

	@OriginalMember(owner = "client!vf", name = "ib", descriptor = "I")
	public static int anInt2941 = 0;

	@OriginalMember(owner = "client!vf", name = "kb", descriptor = "I")
	public static int anInt2943 = -2;

	@OriginalMember(owner = "client!vf", name = "lb", descriptor = "Lclient!ob;")
	public static Class55 aClass55_88 = new Class55(200);

	@OriginalMember(owner = "client!vf", name = "mb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1594 = Static69.method1231("leuchten2:");

	@OriginalMember(owner = "client!vf", name = "nb", descriptor = "[Lclient!je;")
	public static Class40[] aClass40Array24 = new Class40[100];

	@OriginalMember(owner = "client!vf", name = "pb", descriptor = "Lclient!ac;")
	public static Class3 aClass3_17 = new Class3();

	@OriginalMember(owner = "client!vf", name = "qb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1595 = Static69.method1231("mapfunction");

	@OriginalMember(owner = "client!vf", name = "sb", descriptor = "I")
	public static int anInt2945 = 0;

	@OriginalMember(owner = "client!vf", name = "ub", descriptor = "Z")
	public static volatile boolean aBoolean242 = false;

	@OriginalMember(owner = "client!vf", name = "vb", descriptor = "Lclient!je;")
	public static Class40 aClass40_1596 = Static69.method1231("::noclip");

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
	public static void method2106() {
		while (true) {
			if (Static7.aClass2_Sub9_Sub1_1.method674(Static130.anInt3009) >= 27) {
				@Pc(18) int local18 = Static7.aClass2_Sub9_Sub1_1.method671(15);
				if (local18 != 32767) {
					@Pc(23) boolean local23 = false;
					if (aClass2_Sub1_Sub1_Sub3_Sub1Array1[local18] == null) {
						aClass2_Sub1_Sub1_Sub3_Sub1Array1[local18] = new Class2_Sub1_Sub1_Sub3_Sub1();
						local23 = true;
					}
					@Pc(39) Class2_Sub1_Sub1_Sub3_Sub1 local39 = aClass2_Sub1_Sub1_Sub3_Sub1Array1[local18];
					Static37.anIntArray97[Static102.anInt2484++] = local18;
					local39.anInt1808 = Static28.anInt704;
					@Pc(55) int local55 = Static7.aClass2_Sub9_Sub1_1.method671(5);
					@Pc(60) int local60 = Static7.aClass2_Sub9_Sub1_1.method671(1);
					if (local55 > 15) {
						local55 -= 32;
					}
					local39.aClass2_Sub1_Sub11_1 = Static87.method896(Static7.aClass2_Sub9_Sub1_1.method671(14));
					@Pc(79) int local79 = Static7.aClass2_Sub9_Sub1_1.method671(5);
					@Pc(84) int local84 = Static7.aClass2_Sub9_Sub1_1.method671(1);
					if (local79 > 15) {
						local79 -= 32;
					}
					if (local84 == 1) {
						Static73.anIntArray202[Static58.anInt1521++] = local18;
					}
					@Pc(110) int local110 = Static45.anIntArray129[Static7.aClass2_Sub9_Sub1_1.method671(3)];
					local39.anInt1786 = local39.aClass2_Sub1_Sub11_1.anInt2347;
					local39.anInt1813 = local39.aClass2_Sub1_Sub11_1.anInt2362;
					local39.anInt1796 = local39.aClass2_Sub1_Sub11_1.anInt2355;
					local39.anInt1812 = local39.aClass2_Sub1_Sub11_1.anInt2337;
					local39.anInt1822 = local39.aClass2_Sub1_Sub11_1.anInt2336;
					local39.anInt1789 = local39.aClass2_Sub1_Sub11_1.anInt2343;
					local39.anInt1777 = local39.aClass2_Sub1_Sub11_1.anInt2353;
					if (local23) {
						local39.anInt1801 = local39.anInt1818 = local110;
					}
					if (local39.anInt1796 == 0) {
						local39.anInt1818 = 0;
					}
					local39.anInt1771 = local39.aClass2_Sub1_Sub11_1.anInt2354;
					local39.anInt1823 = local39.aClass2_Sub1_Sub11_1.anInt2330;
					local39.method1176(local60 == 1, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray180[0] + local55, Static30.aClass2_Sub1_Sub1_Sub3_Sub2_1.anIntArray177[0] - -local79);
					continue;
				}
			}
			Static7.aClass2_Sub9_Sub1_1.method675();
			return;
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
	public static void method2108() {
		@Pc(9) int local9 = Static3.anInt114 * 128 + 64;
		@Pc(15) int local15 = Static116.anInt2704 * 128 + 64;
		@Pc(23) int local23 = Static93.method1730(local9, Static105.anInt2531, local15) - Static24.anInt3056;
		if (local15 > anInt2944) {
			anInt2944 += Static66.anInt1737 * (local15 - anInt2944) / 1000 + Static120.anInt2826;
			if (local15 < anInt2944) {
				anInt2944 = local15;
			}
		}
		if (Static83.anInt2155 < local9) {
			Static83.anInt2155 += Static120.anInt2826 + Static66.anInt1737 * (local9 - Static83.anInt2155) / 1000;
			if (local9 < Static83.anInt2155) {
				Static83.anInt2155 = local9;
			}
		}
		if (Static83.anInt2155 > local9) {
			Static83.anInt2155 -= Static66.anInt1737 * (Static83.anInt2155 - local9) / 1000 + Static120.anInt2826;
			if (local9 > Static83.anInt2155) {
				Static83.anInt2155 = local9;
			}
		}
		if (local15 < anInt2944) {
			anInt2944 -= Static120.anInt2826 + (anInt2944 - local15) * Static66.anInt1737 / 1000;
			if (local15 > anInt2944) {
				anInt2944 = local15;
			}
		}
		local15 = Static11.anInt234 * 128 + 64;
		if (local23 > Static2.anInt101) {
			Static2.anInt101 += Static66.anInt1737 * (local23 - Static2.anInt101) / 1000 + Static120.anInt2826;
			if (Static2.anInt101 > local23) {
				Static2.anInt101 = local23;
			}
		}
		local9 = Static84.anInt2250 * 128 + 64;
		if (local23 < Static2.anInt101) {
			Static2.anInt101 -= Static120.anInt2826 + Static66.anInt1737 * (Static2.anInt101 - local23) / 1000;
			if (local23 > Static2.anInt101) {
				Static2.anInt101 = local23;
			}
		}
		local23 = Static93.method1730(local9, Static105.anInt2531, local15) - Static125.anInt2892;
		@Pc(203) int local203 = local15 - anInt2944;
		@Pc(208) int local208 = local9 - Static83.anInt2155;
		@Pc(213) int local213 = local23 - Static2.anInt101;
		@Pc(224) int local224 = (int) Math.sqrt((double) (local203 * local203 + local208 * local208));
		@Pc(235) int local235 = (int) (Math.atan2((double) local213, (double) local224) * 325.949D) & 0x7FF;
		if (local235 < 128) {
			local235 = 128;
		}
		if (local235 > 383) {
			local235 = 383;
		}
		@Pc(256) int local256 = (int) (Math.atan2((double) local208, (double) local203) * -325.949D) & 0x7FF;
		if (local235 > Static38.anInt1005) {
			Static38.anInt1005 += Static29.anInt726 + Static62.anInt1691 * (local235 - Static38.anInt1005) / 1000;
			if (local235 < Static38.anInt1005) {
				Static38.anInt1005 = local235;
			}
		}
		if (Static38.anInt1005 > local235) {
			Static38.anInt1005 -= Static29.anInt726 + Static62.anInt1691 * (Static38.anInt1005 - local235) / 1000;
			if (Static38.anInt1005 < local235) {
				Static38.anInt1005 = local235;
			}
		}
		@Pc(321) int local321 = local256 - Static67.anInt1832;
		if (local321 > 1024) {
			local321 -= 2048;
		}
		if (local321 < -1024) {
			local321 += 2048;
		}
		if (local321 > 0) {
			Static67.anInt1832 += local321 * Static62.anInt1691 / 1000 + Static29.anInt726;
			Static67.anInt1832 &= 0x7FF;
		}
		if (local321 < 0) {
			Static67.anInt1832 -= Static29.anInt726 + -local321 * Static62.anInt1691 / 1000;
			Static67.anInt1832 &= 0x7FF;
		}
		@Pc(370) int local370 = local256 - Static67.anInt1832;
		if (local370 > 1024) {
			local370 -= 2048;
		}
		if (local370 < -1024) {
			local370 += 2048;
		}
		if (local370 < 0 && local321 > 0 || local370 > 0 && local321 < 0) {
			Static67.anInt1832 = local256;
		}
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)V")
	public static void method2109() {
		aClass40_1596 = null;
		aClass40_1594 = null;
		aClass3_17 = null;
		aByteArrayArray9 = null;
		aClass40Array24 = null;
		aClass41_2 = null;
		aClass55_88 = null;
		aByteArrayArray10 = null;
		aClass40_1595 = null;
		aClass2_Sub1_Sub1_Sub3_Sub1Array1 = null;
	}
}
