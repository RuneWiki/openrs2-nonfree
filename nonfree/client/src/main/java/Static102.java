import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
	public static int anInt6997;

	@OriginalMember(owner = "client!gk", name = "k", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray134;

	@OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
	public static int anInt7003;

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "Lclient!bt;")
	public static final Class21 aClass21_181 = new Class21(256);

	@OriginalMember(owner = "client!gk", name = "l", descriptor = "Lclient!bn;")
	private static final Class18 aClass18_229 = new Class18(30, 3);

	@OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
	public static int anInt7002 = 0;

	@OriginalMember(owner = "client!gk", name = "n", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_238 = new Class106(" ", ": ", " ", " ");

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)V")
	public static void method6043() {
		for (@Pc(9) int local9 = 0; local9 < Static247.aClass54ArrayArray1.length; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static247.aClass54ArrayArray1[local9].length; local13++) {
				Static247.aClass54ArrayArray1[local9][local13] = Static346.aClass54_1;
			}
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ia;I)V")
	public static void method6044(@OriginalArg(0) Class1_Sub22 arg0) {
		if (arg0 == null || Static317.aClass42_43.aClass1_73 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt2828;
		@Pc(18) int local18 = arg0.anInt2821;
		@Pc(21) int local21 = arg0.anInt2822;
		@Pc(25) int local25 = (int) arg0.aLong104;
		@Pc(34) long local34 = arg0.aLong104;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(46) int local46;
		@Pc(50) int local50;
		if (Static189.aClass1_Sub8_1 == null) {
			local46 = Static331.anInt6243;
			local50 = Static320.anInt4363;
		} else {
			local46 = Static189.aClass1_Sub8_1.method593();
			local50 = Static189.aClass1_Sub8_1.method596();
		}
		if (local21 == 13 || local21 == 1004) {
			Static144.method2858(local25, local18, local15, arg0.aString22);
		}
		if (local21 == 59) {
			Static132.anInt2873 = local46;
			Static146.anInt6825 = 2;
			Static87.anInt1925 = 0;
			Static175.anInt3671 = local50;
			Static280.method5009(Static368.aClass18_232);
			Static339.aClass1_Sub7_Sub2_4.method2158(Static166.anInt3467);
			Static339.aClass1_Sub7_Sub2_4.method2142(local25);
			Static339.aClass1_Sub7_Sub2_4.method2142(Static299.anInt4036 + local18);
			Static339.aClass1_Sub7_Sub2_4.method2101(Static9.anInt239);
			Static339.aClass1_Sub7_Sub2_4.method2121(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2101(Static50.anInt1271 + local15);
			Static339.aClass1_Sub7_Sub2_4.method2144(Static325.anInt5187);
			Static25.method1281(local15, local18);
		}
		if (local21 == 49) {
			if (Static110.anInt2477 > 0 && Static271.aClass60_2.method1863(82) && Static271.aClass60_2.method1863(81)) {
				Static344.method4474(local15 + Static50.anInt1271, Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, local18 + Static299.anInt4036);
			} else {
				Static87.anInt1925 = 0;
				Static146.anInt6825 = 1;
				Static132.anInt2873 = local46;
				Static175.anInt3671 = local50;
				Static280.method5009(Static22.aClass18_225);
				Static339.aClass1_Sub7_Sub2_4.method2101(local18 + Static299.anInt4036);
				Static339.aClass1_Sub7_Sub2_4.method2142(local15 + Static50.anInt1271);
			}
		}
		@Pc(202) Class11_Sub2_Sub6_Sub2 local202;
		if (local21 == 22) {
			local202 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local25];
			if (local202 != null) {
				Static146.anInt6825 = 2;
				Static87.anInt1925 = 0;
				Static175.anInt3671 = local50;
				Static132.anInt2873 = local46;
				Static280.method5009(aClass18_229);
				Static339.aClass1_Sub7_Sub2_4.method2142(local25);
				Static339.aClass1_Sub7_Sub2_4.method2162(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static366.method6070(0, local202.anIntArray504[0], -2, local202.method5894(), true, local202.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local202.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 1008 || local21 == 1003 || local21 == 1009 || local21 == 1007 || local21 == 1012) {
			Static195.method3637(local15, local21, local25);
		}
		if (local21 == 19) {
			Static175.anInt3671 = local50;
			Static132.anInt2873 = local46;
			Static146.anInt6825 = 2;
			Static87.anInt1925 = 0;
			Static280.method5009(Static84.aClass18_67);
			Static339.aClass1_Sub7_Sub2_4.method2162(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2138(local18 + Static299.anInt4036);
			Static339.aClass1_Sub7_Sub2_4.method2144(local25);
			Static339.aClass1_Sub7_Sub2_4.method2138(local15 + Static50.anInt1271);
			Static25.method1281(local15, local18);
		}
		if (local21 == 58) {
			Static146.anInt6825 = 2;
			Static87.anInt1925 = 0;
			Static132.anInt2873 = local46;
			Static175.anInt3671 = local50;
			Static280.method5009(Static36.aClass18_35);
			Static339.aClass1_Sub7_Sub2_4.method2101(Static50.anInt1271 + local15);
			Static339.aClass1_Sub7_Sub2_4.method2162(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2144(local25);
			Static339.aClass1_Sub7_Sub2_4.method2101(Static299.anInt4036 + local18);
			Static25.method1281(local15, local18);
		}
		@Pc(401) Class11_Sub2_Sub6_Sub1 local401;
		if (local21 == 44) {
			local401 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local25];
			if (local401 != null) {
				Static146.anInt6825 = 2;
				Static87.anInt1925 = 0;
				Static175.anInt3671 = local50;
				Static132.anInt2873 = local46;
				Static280.method5009(Static354.aClass18_223);
				Static339.aClass1_Sub7_Sub2_4.method2150(Static166.anInt3467);
				Static339.aClass1_Sub7_Sub2_4.method2102(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static339.aClass1_Sub7_Sub2_4.method2144(Static9.anInt239);
				Static339.aClass1_Sub7_Sub2_4.method2138(local25);
				Static339.aClass1_Sub7_Sub2_4.method2101(Static325.anInt5187);
				Static366.method6070(0, local401.anIntArray504[0], -2, local401.method5894(), true, local401.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local401.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 9) {
			local401 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local25];
			if (local401 != null) {
				Static132.anInt2873 = local46;
				Static175.anInt3671 = local50;
				Static87.anInt1925 = 0;
				Static146.anInt6825 = 2;
				Static280.method5009(Static8.aClass18_9);
				Static339.aClass1_Sub7_Sub2_4.method2121(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static339.aClass1_Sub7_Sub2_4.method2101(local25);
				Static366.method6070(0, local401.anIntArray504[0], -2, local401.method5894(), true, local401.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local401.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 12) {
			local202 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local25];
			if (local202 != null) {
				Static175.anInt3671 = local50;
				Static146.anInt6825 = 2;
				Static132.anInt2873 = local46;
				Static87.anInt1925 = 0;
				Static280.method5009(Static91.aClass18_231);
				Static339.aClass1_Sub7_Sub2_4.method2144(Static9.anInt239);
				Static339.aClass1_Sub7_Sub2_4.method2142(Static325.anInt5187);
				Static339.aClass1_Sub7_Sub2_4.method2142(local25);
				Static339.aClass1_Sub7_Sub2_4.method2115(Static166.anInt3467);
				Static339.aClass1_Sub7_Sub2_4.method2121(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static366.method6070(0, local202.anIntArray504[0], -2, local202.method5894(), true, local202.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local202.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 10) {
			local401 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local25];
			if (local401 != null) {
				Static132.anInt2873 = local46;
				Static146.anInt6825 = 2;
				Static87.anInt1925 = 0;
				Static175.anInt3671 = local50;
				Static280.method5009(Static339.aClass18_201);
				Static339.aClass1_Sub7_Sub2_4.method2162(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static339.aClass1_Sub7_Sub2_4.method2142(local25);
				Static366.method6070(0, local401.anIntArray504[0], -2, local401.method5894(), true, local401.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local401.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 45) {
			Static146.anInt6825 = 1;
			Static87.anInt1925 = 0;
			Static132.anInt2873 = local46;
			Static175.anInt3671 = local50;
			Static280.method5009(Static194.aClass18_125);
			Static339.aClass1_Sub7_Sub2_4.method2101(Static9.anInt239);
			Static339.aClass1_Sub7_Sub2_4.method2142(Static325.anInt5187);
			Static339.aClass1_Sub7_Sub2_4.method2158(Static166.anInt3467);
			Static339.aClass1_Sub7_Sub2_4.method2142(Static299.anInt4036 + local18);
			Static339.aClass1_Sub7_Sub2_4.method2138(local15 + Static50.anInt1271);
			Static366.method6070(0, local18, -4, 1, true, local15, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], 1, 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
		}
		@Pc(762) Class112 local762;
		if (local21 == 57) {
			local762 = Static147.method2868(local18, local15);
			if (local762 != null) {
				Static89.method1874();
				@Pc(769) Class1_Sub42 local769 = Static44.method1079(local762);
				Static223.method4136(local769.method5745(), local18, local762.anInt3436, local762.anInt3388, local15, local769.anInt6537);
				Static365.aString65 = Static334.method5882(local762);
				Static196.aString39 = local762.aString25 + "<col=ffffff>";
				if (Static365.aString65 == null) {
					Static365.aString65 = "Null";
				}
			}
			return;
		}
		if (local21 == 5) {
			Static87.anInt1925 = 0;
			Static175.anInt3671 = local50;
			Static146.anInt6825 = 2;
			Static132.anInt2873 = local46;
			Static280.method5009(Static273.aClass18_179);
			Static339.aClass1_Sub7_Sub2_4.method2157(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2142(Static299.anInt4036 + local18);
			Static339.aClass1_Sub7_Sub2_4.method2138(local15 + Static50.anInt1271);
			Static339.aClass1_Sub7_Sub2_4.method2101(local25);
			Static25.method1281(local15, local18);
		}
		if (local21 == 1001) {
			Static87.anInt1925 = 0;
			Static146.anInt6825 = 2;
			Static175.anInt3671 = local50;
			Static132.anInt2873 = local46;
			Static280.method5009(Class11_Sub2_Sub4.lb);
			Static339.aClass1_Sub7_Sub2_4.method2157(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2142(Static299.anInt4036 + local18);
			Static339.aClass1_Sub7_Sub2_4.method2101((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static339.aClass1_Sub7_Sub2_4.method2138(Static50.anInt1271 + local15);
			Static131.method2687(local15, local18, local34);
		}
		if (local21 == 4) {
			local202 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local25];
			if (local202 != null) {
				Static175.anInt3671 = local50;
				Static87.anInt1925 = 0;
				Static146.anInt6825 = 2;
				Static132.anInt2873 = local46;
				Static280.method5009(Static90.aClass18_72);
				Static339.aClass1_Sub7_Sub2_4.method2142(local25);
				Static339.aClass1_Sub7_Sub2_4.method2162(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static366.method6070(0, local202.anIntArray504[0], -2, local202.method5894(), true, local202.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local202.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 20) {
			local401 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local25];
			if (local401 != null) {
				Static132.anInt2873 = local46;
				Static146.anInt6825 = 2;
				Static87.anInt1925 = 0;
				Static175.anInt3671 = local50;
				Static280.method5009(Static352.aClass18_63);
				Static339.aClass1_Sub7_Sub2_4.method2101(local25);
				Static339.aClass1_Sub7_Sub2_4.method2157(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static366.method6070(0, local401.anIntArray504[0], -2, local401.method5894(), true, local401.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local401.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 23) {
			local202 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local25];
			if (local202 != null) {
				Static146.anInt6825 = 2;
				Static87.anInt1925 = 0;
				Static175.anInt3671 = local50;
				Static132.anInt2873 = local46;
				Static280.method5009(Static248.aClass18_171);
				Static339.aClass1_Sub7_Sub2_4.method2138(local25);
				Static339.aClass1_Sub7_Sub2_4.method2102(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static366.method6070(0, local202.anIntArray504[0], -2, local202.method5894(), true, local202.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local202.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 50 && Static323.aClass112_13 == null) {
			Static268.method4838(local15, local18);
			Static323.aClass112_13 = Static147.method2868(local18, local15);
			Static133.method2725(Static323.aClass112_13);
		}
		if (local21 == 30) {
			Static87.anInt1925 = 0;
			Static175.anInt3671 = local50;
			Static146.anInt6825 = 2;
			Static132.anInt2873 = local46;
			Static280.method5009(Static202.aClass18_131);
			Static339.aClass1_Sub7_Sub2_4.method2102(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2142(Static50.anInt1271 + local15);
			Static339.aClass1_Sub7_Sub2_4.method2101(local18 + Static299.anInt4036);
			Static339.aClass1_Sub7_Sub2_4.method2144(local25);
			Static25.method1281(local15, local18);
		}
		if (local21 == 8) {
			local401 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local25];
			if (local401 != null) {
				Static175.anInt3671 = local50;
				Static87.anInt1925 = 0;
				Static132.anInt2873 = local46;
				Static146.anInt6825 = 2;
				Static280.method5009(Static213.aClass18_145);
				Static339.aClass1_Sub7_Sub2_4.method2157(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static339.aClass1_Sub7_Sub2_4.method2101(local25);
				Static366.method6070(0, local401.anIntArray504[0], -2, local401.method5894(), true, local401.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local401.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 47) {
			local202 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local25];
			if (local202 != null) {
				Static175.anInt3671 = local50;
				Static146.anInt6825 = 2;
				Static132.anInt2873 = local46;
				Static87.anInt1925 = 0;
				Static280.method5009(Static275.aClass18_181);
				Static339.aClass1_Sub7_Sub2_4.method2142(local25);
				Static339.aClass1_Sub7_Sub2_4.method2121(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static366.method6070(0, local202.anIntArray504[0], -2, local202.method5894(), true, local202.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local202.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 17) {
			Static87.anInt1925 = 0;
			Static175.anInt3671 = local50;
			Static132.anInt2873 = local46;
			Static146.anInt6825 = 2;
			Static280.method5009(Static291.aClass18_192);
			Static339.aClass1_Sub7_Sub2_4.method2142(local18 + Static299.anInt4036);
			Static339.aClass1_Sub7_Sub2_4.method2102(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2138(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static339.aClass1_Sub7_Sub2_4.method2142(Static50.anInt1271 + local15);
			Static131.method2687(local15, local18, local34);
		}
		if (local21 == 3) {
			Static132.anInt2873 = local46;
			Static175.anInt3671 = local50;
			Static146.anInt6825 = 2;
			Static87.anInt1925 = 0;
			Static280.method5009(Static352.aClass18_65);
			Static339.aClass1_Sub7_Sub2_4.method2102(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2101(Static299.anInt4036 + local18);
			Static339.aClass1_Sub7_Sub2_4.method2101(local15 + Static50.anInt1271);
			Static339.aClass1_Sub7_Sub2_4.method2101(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static131.method2687(local15, local18, local34);
		}
		if (local21 == 2) {
			local762 = Static147.method2868(local18, local15);
			if (local762 != null) {
				Static294.method5143(local762);
			}
		}
		if (local21 == 1010) {
			Static87.anInt1925 = 0;
			Static132.anInt2873 = local46;
			Static146.anInt6825 = 2;
			Static175.anInt3671 = local50;
			Static280.method5009(Static31.aClass18_31);
			Static339.aClass1_Sub7_Sub2_4.method2144(local25);
		}
		if (local21 == 46) {
			Static175.anInt3671 = local50;
			Static146.anInt6825 = 2;
			Static87.anInt1925 = 0;
			Static132.anInt2873 = local46;
			Static280.method5009(Static259.aClass18_174);
			Static339.aClass1_Sub7_Sub2_4.method2144(local25);
			Static339.aClass1_Sub7_Sub2_4.method2121(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2101(Static50.anInt1271 + local15);
			Static339.aClass1_Sub7_Sub2_4.method2142(Static299.anInt4036 + local18);
			Static25.method1281(local15, local18);
		}
		if (local21 == 51) {
			local401 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local25];
			if (local401 != null) {
				Static146.anInt6825 = 2;
				Static175.anInt3671 = local50;
				Static132.anInt2873 = local46;
				Static87.anInt1925 = 0;
				Static280.method5009(Static239.aClass18_164);
				Static339.aClass1_Sub7_Sub2_4.method2144(local25);
				Static339.aClass1_Sub7_Sub2_4.method2162(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static366.method6070(0, local401.anIntArray504[0], -2, local401.method5894(), true, local401.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local401.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 21) {
			Static132.anInt2873 = local46;
			Static87.anInt1925 = 0;
			Static175.anInt3671 = local50;
			Static146.anInt6825 = 2;
			Static280.method5009(Static288.aClass18_188);
			Static339.aClass1_Sub7_Sub2_4.method2142((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static339.aClass1_Sub7_Sub2_4.method2138(Static299.anInt4036 + local18);
			Static339.aClass1_Sub7_Sub2_4.method2144(Static50.anInt1271 + local15);
			Static339.aClass1_Sub7_Sub2_4.method2157(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static131.method2687(local15, local18, local34);
		}
		if (local21 == 60) {
			local202 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local25];
			if (local202 != null) {
				Static132.anInt2873 = local46;
				Static175.anInt3671 = local50;
				Static146.anInt6825 = 2;
				Static87.anInt1925 = 0;
				Static280.method5009(Static234.aClass18_160);
				Static339.aClass1_Sub7_Sub2_4.method2138(local25);
				Static339.aClass1_Sub7_Sub2_4.method2102(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static366.method6070(0, local202.anIntArray504[0], -2, local202.method5894(), true, local202.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local202.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 1006) {
			Static132.anInt2873 = local46;
			Static175.anInt3671 = local50;
			Static87.anInt1925 = 0;
			Static146.anInt6825 = 2;
			Static280.method5009(Static126.aClass18_92);
			Static339.aClass1_Sub7_Sub2_4.method2144(local25);
		}
		if (local21 == 1002) {
			Static87.anInt1925 = 0;
			Static146.anInt6825 = 2;
			Static132.anInt2873 = local46;
			Static175.anInt3671 = local50;
			local202 = Static231.aClass11_Sub2_Sub6_Sub2Array1[local25];
			if (local202 != null) {
				@Pc(1758) Class208 local1758 = local202.aClass208_1;
				if (local1758.anIntArray480 != null) {
					local1758 = local1758.method5539();
				}
				if (local1758 != null) {
					Static280.method5009(Static218.aClass18_148);
					Static339.aClass1_Sub7_Sub2_4.method2144(local1758.anInt6184);
				}
			}
		}
		if (local21 == 48) {
			Static87.anInt1925 = 0;
			Static146.anInt6825 = 2;
			Static175.anInt3671 = local50;
			Static132.anInt2873 = local46;
			Static280.method5009(Static353.aClass18_220);
			Static339.aClass1_Sub7_Sub2_4.method2150(Static166.anInt3467);
			Static339.aClass1_Sub7_Sub2_4.method2101(Static9.anInt239);
			Static339.aClass1_Sub7_Sub2_4.method2144(local18 + Static299.anInt4036);
			Static339.aClass1_Sub7_Sub2_4.method2101(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static339.aClass1_Sub7_Sub2_4.method2121(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2101(Static325.anInt5187);
			Static339.aClass1_Sub7_Sub2_4.method2144(Static50.anInt1271 + local15);
			Static131.method2687(local15, local18, local34);
		}
		if (local21 == 11) {
			Static175.anInt3671 = local50;
			Static146.anInt6825 = 2;
			Static132.anInt2873 = local46;
			Static87.anInt1925 = 0;
			Static280.method5009(Static222.aClass18_152);
			Static339.aClass1_Sub7_Sub2_4.method2138(local15 + Static50.anInt1271);
			Static339.aClass1_Sub7_Sub2_4.method2121(Static271.aClass60_2.method1863(82) ? 1 : 0);
			Static339.aClass1_Sub7_Sub2_4.method2142(local18 + Static299.anInt4036);
			Static339.aClass1_Sub7_Sub2_4.method2142((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static131.method2687(local15, local18, local34);
		}
		if (local21 == 18) {
			if (Static110.anInt2477 > 0 && Static271.aClass60_2.method1863(82) && Static271.aClass60_2.method1863(81)) {
				Static344.method4474(Static50.anInt1271 + local15, Static191.aClass11_Sub2_Sub6_Sub1_4.aByte79, local18 + Static299.anInt4036);
			} else {
				Static97.method2091(local25, local15, local18);
				if (local25 == 1) {
					Static339.aClass1_Sub7_Sub2_4.method2121(-1);
					Static339.aClass1_Sub7_Sub2_4.method2121(-1);
					Static339.aClass1_Sub7_Sub2_4.method2144((int) Static357.aFloat76);
					Static339.aClass1_Sub7_Sub2_4.method2121(57);
					Static339.aClass1_Sub7_Sub2_4.method2121(Static163.anInt3359);
					Static339.aClass1_Sub7_Sub2_4.method2121(Static293.anInt4951);
					Static339.aClass1_Sub7_Sub2_4.method2121(89);
					Static339.aClass1_Sub7_Sub2_4.method2144(Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6729);
					Static339.aClass1_Sub7_Sub2_4.method2144(Static191.aClass11_Sub2_Sub6_Sub1_4.anInt6726);
					Static339.aClass1_Sub7_Sub2_4.method2121(63);
				} else {
					Static132.anInt2873 = local46;
					Static175.anInt3671 = local50;
					Static87.anInt1925 = 0;
					Static146.anInt6825 = 1;
				}
				Static366.method6070(0, local18, -4, 1, true, local15, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], 1, 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 6) {
			local401 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local25];
			if (local401 != null) {
				Static87.anInt1925 = 0;
				Static175.anInt3671 = local50;
				Static146.anInt6825 = 2;
				Static132.anInt2873 = local46;
				Static280.method5009(Static210.aClass18_140);
				Static339.aClass1_Sub7_Sub2_4.method2144(local25);
				Static339.aClass1_Sub7_Sub2_4.method2121(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static366.method6070(0, local401.anIntArray504[0], -2, local401.method5894(), true, local401.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local401.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 15) {
			local401 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local25];
			if (local401 != null) {
				Static87.anInt1925 = 0;
				Static146.anInt6825 = 2;
				Static175.anInt3671 = local50;
				Static132.anInt2873 = local46;
				Static280.method5009(Static354.aClass18_224);
				Static339.aClass1_Sub7_Sub2_4.method2101(local25);
				Static339.aClass1_Sub7_Sub2_4.method2102(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static366.method6070(0, local401.anIntArray504[0], -2, local401.method5894(), true, local401.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local401.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (local21 == 25) {
			local401 = Static275.aClass11_Sub2_Sub6_Sub1Array1[local25];
			if (local401 != null) {
				Static87.anInt1925 = 0;
				Static132.anInt2873 = local46;
				Static146.anInt6825 = 2;
				Static175.anInt3671 = local50;
				Static280.method5009(Static223.aClass18_153);
				Static339.aClass1_Sub7_Sub2_4.method2157(Static271.aClass60_2.method1863(82) ? 1 : 0);
				Static339.aClass1_Sub7_Sub2_4.method2101(local25);
				Static366.method6070(0, local401.anIntArray504[0], -2, local401.method5894(), true, local401.anIntArray505[0], Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray505[0], local401.method5894(), 0, Static191.aClass11_Sub2_Sub6_Sub1_4.anIntArray504[0]);
			}
		}
		if (Static77.aBoolean119) {
			Static89.method1874();
		}
		if (Static12.aClass112_1 != null && Static288.anInt5578 == 0) {
			Static133.method2725(Static12.aClass112_1);
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!ct;)V")
	public static void method6046(@OriginalArg(1) Class30 arg0) {
		Static337.aClass30_99 = arg0;
	}
}
