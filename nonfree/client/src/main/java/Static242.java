import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static242 {

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray47;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "Lclient!or;")
	public static Class260 aClass260_16 = null;

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIIIII)V")
	public static void method6990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		if (Static7.anInt93 <= arg2 && arg3 <= Static115.anInt2377 && Static374.anInt5986 <= arg5 && Static84.anInt1667 >= arg0) {
			if (arg4 == 1) {
				Static154.method2819(arg5, arg2, arg3, arg1, arg0);
			} else {
				Static368.method5383(arg1, arg2, arg3, arg5, arg4, arg0);
			}
		} else if (arg4 == 1) {
			Static11.method181(arg0, arg2, arg1, arg3, arg5);
		} else {
			Static141.method2605(arg0, arg2, arg4, arg5, arg3, arg1);
		}
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIB)Z")
	public static boolean method6993(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x70000) != 0 | Static60.method1284(arg1, arg0) || Static94.method1709(arg1, arg0);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(Lclient!oba;III)V")
	public static void method6995(@OriginalArg(0) Class3_Sub11_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static78.aClass338_99.aClass3_302) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt6736;
		@Pc(18) int local18 = arg0.anInt6737;
		@Pc(21) int local21 = arg0.anInt6738;
		@Pc(25) int local25 = (int) arg0.aLong211;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong211;
		@Pc(54) Class3_Sub34 local54;
		if (local21 == 17) {
			Static245.anInt4476 = 0;
			Static363.anInt5849 = arg2;
			Static240.anInt4425 = 2;
			Static333.anInt9197 = arg1;
			local54 = Static172.method3123(Static163.aClass375_1, Static349.aClass218_77);
			local54.aClass3_Sub25_Sub1_2.method8596(local18 + Static72.anInt1361);
			local54.aClass3_Sub25_Sub1_2.method8608(Static440.aClass19_1.method2352(82) ? 1 : 0);
			local54.aClass3_Sub25_Sub1_2.method8649(Static287.anInt4910 + local15);
			local54.aClass3_Sub25_Sub1_2.method8597((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static441.method6275(local54);
			Static85.method1623(local15, local34, local18);
		}
		@Pc(125) Class3_Sub34 local125;
		@Pc(106) Class28_Sub1_Sub1_Sub1_Sub1 local106;
		if (local21 == 11) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static363.anInt5849 = arg2;
				Static245.anInt4476 = 0;
				Static333.anInt9197 = arg1;
				Static240.anInt4425 = 2;
				local125 = Static172.method3123(Static163.aClass375_1, Static498.aClass218_151);
				local125.aClass3_Sub25_Sub1_2.method8649(local25);
				local125.aClass3_Sub25_Sub1_2.method8586(Static440.aClass19_1.method2352(82) ? 1 : 0);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		@Pc(198) Class3_Sub34 local198;
		@Pc(176) Class3_Sub3 local176;
		@Pc(191) Class28_Sub1_Sub1_Sub1_Sub2 local191;
		if (local21 == 12) {
			local176 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local25);
			if (local176 != null) {
				Static245.anInt4476 = 0;
				Static363.anInt5849 = arg2;
				Static240.anInt4425 = 2;
				local191 = local176.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				Static333.anInt9197 = arg1;
				local198 = Static172.method3123(Static163.aClass375_1, Static153.aClass218_36);
				local198.aClass3_Sub25_Sub1_2.method8586(Static440.aClass19_1.method2352(82) ? 1 : 0);
				local198.aClass3_Sub25_Sub1_2.method8649(local25);
				Static441.method6275(local198);
				Static471.method6829(0, local191.method9314(), -2, local191.anIntArray955[0], local191.anIntArray956[0], local191.method9314(), 0, true);
			}
		}
		if (local21 == 45) {
			local176 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local25);
			if (local176 != null) {
				local191 = local176.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				Static333.anInt9197 = arg1;
				Static240.anInt4425 = 2;
				Static245.anInt4476 = 0;
				Static363.anInt5849 = arg2;
				local198 = Static172.method3123(Static163.aClass375_1, Static467.aClass218_115);
				local198.aClass3_Sub25_Sub1_2.method8598(Static440.aClass19_1.method2352(82) ? 1 : 0);
				local198.aClass3_Sub25_Sub1_2.method8596(local25);
				Static441.method6275(local198);
				Static471.method6829(0, local191.method9314(), -2, local191.anIntArray955[0], local191.anIntArray956[0], local191.method9314(), 0, true);
			}
		}
		if (local21 == 47) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static333.anInt9197 = arg1;
				Static245.anInt4476 = 0;
				Static363.anInt5849 = arg2;
				Static240.anInt4425 = 2;
				local125 = Static172.method3123(Static163.aClass375_1, Static390.aClass218_157);
				local125.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
				local125.aClass3_Sub25_Sub1_2.method8649(local25);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		if (local21 == 30 || local21 == 1001) {
			Static498.method8887(local15, local18, arg0.aString67, local25);
		}
		@Pc(404) Class260 local404;
		if (local21 == 8) {
			local404 = Static245.method4101(local18, local15);
			if (local404 != null) {
				Static37.method942(local404);
			}
		}
		if (local21 == 53) {
			Static240.anInt4425 = 2;
			Static245.anInt4476 = 0;
			Static333.anInt9197 = arg1;
			Static363.anInt5849 = arg2;
			local54 = Static172.method3123(Static163.aClass375_1, Static203.aClass218_54);
			local54.aClass3_Sub25_Sub1_2.method8586(Static440.aClass19_1.method2352(82) ? 1 : 0);
			local54.aClass3_Sub25_Sub1_2.method8649(local18 + Static72.anInt1361);
			local54.aClass3_Sub25_Sub1_2.method8649(local25);
			local54.aClass3_Sub25_Sub1_2.method8649(Static287.anInt4910 + local15);
			Static441.method6275(local54);
			Static300.method4622(local15, local18);
		}
		if (local21 == 21) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static363.anInt5849 = arg2;
				Static245.anInt4476 = 0;
				Static333.anInt9197 = arg1;
				Static240.anInt4425 = 2;
				local125 = Static172.method3123(Static163.aClass375_1, Static566.aClass218_132);
				local125.aClass3_Sub25_Sub1_2.method8649(local25);
				local125.aClass3_Sub25_Sub1_2.method8586(Static440.aClass19_1.method2352(82) ? 1 : 0);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		if (local21 == 2) {
			Static333.anInt9197 = arg1;
			Static245.anInt4476 = 0;
			Static240.anInt4425 = 1;
			Static363.anInt5849 = arg2;
			local54 = Static172.method3123(Static163.aClass375_1, Static522.aClass218_128);
			local54.aClass3_Sub25_Sub1_2.method8616(local15 + Static287.anInt4910);
			local54.aClass3_Sub25_Sub1_2.method8597(Static658.anInt10730);
			local54.aClass3_Sub25_Sub1_2.method8634(Static531.anInt8767);
			local54.aClass3_Sub25_Sub1_2.method8649(local18 + Static72.anInt1361);
			local54.aClass3_Sub25_Sub1_2.method8597(Static287.anInt4913);
			Static441.method6275(local54);
			Static471.method6829(0, 1, -4, local18, local15, 1, 0, true);
		}
		if (local21 == 1009) {
			Static363.anInt5849 = arg2;
			Static333.anInt9197 = arg1;
			Static240.anInt4425 = 2;
			Static245.anInt4476 = 0;
			local176 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local25);
			if (local176 != null) {
				local191 = local176.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				@Pc(629) Class300 local629 = local191.aClass300_1;
				if (local629.anIntArray696 != null) {
					local629 = local629.method7258(Static131.aClass66_1);
				}
				if (local629 != null) {
					@Pc(648) Class3_Sub34 local648 = Static172.method3123(Static163.aClass375_1, Static604.aClass218_146);
					local648.aClass3_Sub25_Sub1_2.method8649(local629.anInt8333);
					Static441.method6275(local648);
				}
			}
		}
		if (local21 == 1010 || local21 == 1002 || local21 == 1011 || local21 == 1006 || local21 == 1007) {
			Static469.method6802(local15, local25, local21);
		}
		if (local21 == 5) {
			local176 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local25);
			if (local176 != null) {
				Static240.anInt4425 = 2;
				Static363.anInt5849 = arg2;
				Static245.anInt4476 = 0;
				local191 = local176.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				Static333.anInt9197 = arg1;
				local198 = Static172.method3123(Static163.aClass375_1, Static582.aClass218_138);
				local198.aClass3_Sub25_Sub1_2.method8596(Static287.anInt4913);
				local198.aClass3_Sub25_Sub1_2.method8616(Static658.anInt10730);
				local198.aClass3_Sub25_Sub1_2.method8616(local25);
				local198.aClass3_Sub25_Sub1_2.method8588(Static531.anInt8767);
				local198.aClass3_Sub25_Sub1_2.method8598(Static440.aClass19_1.method2352(82) ? 1 : 0);
				Static441.method6275(local198);
				Static471.method6829(0, local191.method9314(), -2, local191.anIntArray955[0], local191.anIntArray956[0], local191.method9314(), 0, true);
			}
		}
		if (local21 == 49) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static363.anInt5849 = arg2;
				Static245.anInt4476 = 0;
				Static240.anInt4425 = 2;
				Static333.anInt9197 = arg1;
				local125 = Static172.method3123(Static163.aClass375_1, Static630.aClass218_150);
				local125.aClass3_Sub25_Sub1_2.method8595(Static531.anInt8767);
				local125.aClass3_Sub25_Sub1_2.method8596(Static287.anInt4913);
				local125.aClass3_Sub25_Sub1_2.method8596(local25);
				local125.aClass3_Sub25_Sub1_2.method8616(Static658.anInt10730);
				local125.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		if (local21 == 10) {
			Static333.anInt9197 = arg1;
			Static245.anInt4476 = 0;
			Static240.anInt4425 = 2;
			Static363.anInt5849 = arg2;
			local54 = Static172.method3123(Static163.aClass375_1, Static364.aClass218_88);
			local54.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
			local54.aClass3_Sub25_Sub1_2.method8616(local25);
			local54.aClass3_Sub25_Sub1_2.method8634(Static531.anInt8767);
			local54.aClass3_Sub25_Sub1_2.method8597(Static287.anInt4910 + local15);
			local54.aClass3_Sub25_Sub1_2.method8596(local18 + Static72.anInt1361);
			local54.aClass3_Sub25_Sub1_2.method8649(Static658.anInt10730);
			local54.aClass3_Sub25_Sub1_2.method8596(Static287.anInt4913);
			Static441.method6275(local54);
			Static300.method4622(local15, local18);
		}
		if (local21 == 57) {
			if (Static24.anInt545 > 0 && Static440.aClass19_1.method2352(82) && Static440.aClass19_1.method2352(81)) {
				Static273.method4434(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174, Static72.anInt1361 + local18, local15 + Static287.anInt4910);
			} else {
				Static363.anInt5849 = arg2;
				Static240.anInt4425 = 1;
				Static245.anInt4476 = 0;
				Static333.anInt9197 = arg1;
				local54 = Static172.method3123(Static163.aClass375_1, Static490.aClass218_124);
				local54.aClass3_Sub25_Sub1_2.method8649(Static72.anInt1361 + local18);
				local54.aClass3_Sub25_Sub1_2.method8597(Static287.anInt4910 + local15);
				Static441.method6275(local54);
			}
		}
		if (local21 == 4) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static333.anInt9197 = arg1;
				Static363.anInt5849 = arg2;
				Static240.anInt4425 = 2;
				Static245.anInt4476 = 0;
				local125 = Static172.method3123(Static163.aClass375_1, Static467.aClass218_114);
				local125.aClass3_Sub25_Sub1_2.method8616(local25);
				local125.aClass3_Sub25_Sub1_2.method8598(Static440.aClass19_1.method2352(82) ? 1 : 0);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		if (local21 == 13) {
			Static240.anInt4425 = 2;
			Static363.anInt5849 = arg2;
			Static333.anInt9197 = arg1;
			Static245.anInt4476 = 0;
			local54 = Static172.method3123(Static163.aClass375_1, Static59.aClass218_16);
			local54.aClass3_Sub25_Sub1_2.method8596(Integer.MAX_VALUE & (int) (local34 >>> 32));
			local54.aClass3_Sub25_Sub1_2.method8596(local15 + Static287.anInt4910);
			local54.aClass3_Sub25_Sub1_2.method8596(Static72.anInt1361 + local18);
			local54.aClass3_Sub25_Sub1_2.method8598(Static440.aClass19_1.method2352(82) ? 1 : 0);
			Static441.method6275(local54);
			Static85.method1623(local15, local34, local18);
		}
		if (local21 == 25) {
			local176 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local25);
			if (local176 != null) {
				Static333.anInt9197 = arg1;
				local191 = local176.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				Static363.anInt5849 = arg2;
				Static245.anInt4476 = 0;
				Static240.anInt4425 = 2;
				local198 = Static172.method3123(Static163.aClass375_1, Static58.aClass218_14);
				local198.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
				local198.aClass3_Sub25_Sub1_2.method8596(local25);
				Static441.method6275(local198);
				Static471.method6829(0, local191.method9314(), -2, local191.anIntArray955[0], local191.anIntArray956[0], local191.method9314(), 0, true);
			}
		}
		if (local21 == 3) {
			Static333.anInt9197 = arg1;
			Static363.anInt5849 = arg2;
			Static240.anInt4425 = 2;
			Static245.anInt4476 = 0;
			local54 = Static172.method3123(Static163.aClass375_1, Static614.aClass218_147);
			local54.aClass3_Sub25_Sub1_2.method8597(local25);
			local54.aClass3_Sub25_Sub1_2.method8608(Static440.aClass19_1.method2352(82) ? 1 : 0);
			local54.aClass3_Sub25_Sub1_2.method8649(Static287.anInt4910 + local15);
			local54.aClass3_Sub25_Sub1_2.method8649(local18 + Static72.anInt1361);
			Static441.method6275(local54);
			Static300.method4622(local15, local18);
		}
		if (local21 == 59) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static363.anInt5849 = arg2;
				Static240.anInt4425 = 2;
				Static245.anInt4476 = 0;
				Static333.anInt9197 = arg1;
				local125 = Static172.method3123(Static163.aClass375_1, Static457.aClass218_110);
				local125.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
				local125.aClass3_Sub25_Sub1_2.method8597(local25);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		if (local21 == 52) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static245.anInt4476 = 0;
				Static240.anInt4425 = 2;
				Static333.anInt9197 = arg1;
				Static363.anInt5849 = arg2;
				local125 = Static172.method3123(Static163.aClass375_1, Static423.aClass218_101);
				local125.aClass3_Sub25_Sub1_2.method8616(local25);
				local125.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		if (local21 == 19 && Static95.aClass260_7 == null) {
			Static604.method8547(local18, local15);
			Static95.aClass260_7 = Static245.method4101(local18, local15);
			Static456.method8151(Static95.aClass260_7);
		}
		if (local21 == 50) {
			local176 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local25);
			if (local176 != null) {
				Static363.anInt5849 = arg2;
				Static245.anInt4476 = 0;
				Static240.anInt4425 = 2;
				Static333.anInt9197 = arg1;
				local191 = local176.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				local198 = Static172.method3123(Static163.aClass375_1, Static470.aClass218_116);
				local198.aClass3_Sub25_Sub1_2.method8616(local25);
				local198.aClass3_Sub25_Sub1_2.method8598(Static440.aClass19_1.method2352(82) ? 1 : 0);
				Static441.method6275(local198);
				Static471.method6829(0, local191.method9314(), -2, local191.anIntArray955[0], local191.anIntArray956[0], local191.method9314(), 0, true);
			}
		}
		if (local21 == 18) {
			local404 = Static245.method4101(local18, local15);
			if (local404 != null) {
				Static632.method8816();
				@Pc(1508) Class3_Sub48 local1508 = Static79.method1526(local404);
				Static231.method3910(local1508.anInt8085, local404, local1508.method7067());
				Static90.aString119 = Static301.method4631(local404);
				Static103.aString17 = local404.aString75 + "<col=ffffff>";
				if (Static90.aString119 == null) {
					Static90.aString119 = "Null";
				}
			}
			return;
		}
		if (local21 == 9) {
			local176 = (Class3_Sub3) Static522.aClass83_34.method2368((long) local25);
			if (local176 != null) {
				Static245.anInt4476 = 0;
				Static363.anInt5849 = arg2;
				local191 = local176.aClass28_Sub1_Sub1_Sub1_Sub2_1;
				Static333.anInt9197 = arg1;
				Static240.anInt4425 = 2;
				local198 = Static172.method3123(Static163.aClass375_1, Static152.aClass218_35);
				local198.aClass3_Sub25_Sub1_2.method8608(Static440.aClass19_1.method2352(82) ? 1 : 0);
				local198.aClass3_Sub25_Sub1_2.method8596(local25);
				Static441.method6275(local198);
				Static471.method6829(0, local191.method9314(), -2, local191.anIntArray955[0], local191.anIntArray956[0], local191.method9314(), 0, true);
			}
		}
		if (local21 == 60) {
			Static240.anInt4425 = 2;
			Static363.anInt5849 = arg2;
			Static333.anInt9197 = arg1;
			Static245.anInt4476 = 0;
			local54 = Static172.method3123(Static163.aClass375_1, Static630.aClass218_150);
			local54.aClass3_Sub25_Sub1_2.method8595(Static531.anInt8767);
			local54.aClass3_Sub25_Sub1_2.method8596(Static287.anInt4913);
			local54.aClass3_Sub25_Sub1_2.method8596(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10762);
			local54.aClass3_Sub25_Sub1_2.method8616(Static658.anInt10730);
			local54.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
			Static441.method6275(local54);
		}
		if (local21 == 51) {
			if (Static24.anInt545 > 0 && Static440.aClass19_1.method2352(82) && Static440.aClass19_1.method2352(81)) {
				Static273.method4434(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174, local18 + Static72.anInt1361, Static287.anInt4910 + local15);
			} else {
				local54 = Static532.method7682(local15, local25, local18);
				if (local25 == 1) {
					local54.aClass3_Sub25_Sub1_2.method8614(-1);
					local54.aClass3_Sub25_Sub1_2.method8614(-1);
					local54.aClass3_Sub25_Sub1_2.method8649((int) Static618.aFloat207);
					local54.aClass3_Sub25_Sub1_2.method8614(57);
					local54.aClass3_Sub25_Sub1_2.method8614(Static490.anInt8101);
					local54.aClass3_Sub25_Sub1_2.method8614(Static663.anInt10571);
					local54.aClass3_Sub25_Sub1_2.method8614(89);
					local54.aClass3_Sub25_Sub1_2.method8649(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729);
					local54.aClass3_Sub25_Sub1_2.method8649(Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731);
					local54.aClass3_Sub25_Sub1_2.method8614(63);
				} else {
					Static363.anInt5849 = arg2;
					Static240.anInt4425 = 1;
					Static333.anInt9197 = arg1;
					Static245.anInt4476 = 0;
				}
				Static441.method6275(local54);
				Static471.method6829(0, 1, -4, local18, local15, 1, 0, true);
			}
		}
		if (local21 == 23) {
			Static363.anInt5849 = arg2;
			Static333.anInt9197 = arg1;
			Static245.anInt4476 = 0;
			Static240.anInt4425 = 2;
			local54 = Static172.method3123(Static163.aClass375_1, Static136.aClass218_32);
			local54.aClass3_Sub25_Sub1_2.method8597(local18 + Static72.anInt1361);
			local54.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
			local54.aClass3_Sub25_Sub1_2.method8597(Static287.anInt4910 + local15);
			local54.aClass3_Sub25_Sub1_2.method8597((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static441.method6275(local54);
			Static85.method1623(local15, local34, local18);
		}
		if (local21 == 48) {
			Static245.anInt4476 = 0;
			Static363.anInt5849 = arg2;
			Static333.anInt9197 = arg1;
			Static240.anInt4425 = 2;
			local54 = Static172.method3123(Static163.aClass375_1, Static171.aClass218_46);
			local54.aClass3_Sub25_Sub1_2.method8649(Static287.anInt4910 + local15);
			local54.aClass3_Sub25_Sub1_2.method8616(local25);
			local54.aClass3_Sub25_Sub1_2.method8596(local18 + Static72.anInt1361);
			local54.aClass3_Sub25_Sub1_2.method8598(Static440.aClass19_1.method2352(82) ? 1 : 0);
			Static441.method6275(local54);
			Static300.method4622(local15, local18);
		}
		if (local21 == 6) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static333.anInt9197 = arg1;
				Static363.anInt5849 = arg2;
				Static245.anInt4476 = 0;
				Static240.anInt4425 = 2;
				local125 = Static172.method3123(Static163.aClass375_1, Static600.aClass218_143);
				local125.aClass3_Sub25_Sub1_2.method8597(local25);
				local125.aClass3_Sub25_Sub1_2.method8608(Static440.aClass19_1.method2352(82) ? 1 : 0);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		if (local21 == 20) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static245.anInt4476 = 0;
				Static333.anInt9197 = arg1;
				Static240.anInt4425 = 2;
				Static363.anInt5849 = arg2;
				local125 = Static172.method3123(Static163.aClass375_1, Static202.aClass218_45);
				local125.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
				local125.aClass3_Sub25_Sub1_2.method8597(local25);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		if (local21 == 44) {
			Static245.anInt4476 = 0;
			Static363.anInt5849 = arg2;
			Static333.anInt9197 = arg1;
			Static240.anInt4425 = 2;
			local54 = Static172.method3123(Static163.aClass375_1, Static649.aClass218_152);
			local54.aClass3_Sub25_Sub1_2.method8596(Static287.anInt4910 + local15);
			local54.aClass3_Sub25_Sub1_2.method8596(local25);
			local54.aClass3_Sub25_Sub1_2.method8597(Static72.anInt1361 + local18);
			local54.aClass3_Sub25_Sub1_2.method8608(Static440.aClass19_1.method2352(82) ? 1 : 0);
			Static441.method6275(local54);
			Static300.method4622(local15, local18);
		}
		if (local21 == 58) {
			Static240.anInt4425 = 2;
			Static333.anInt9197 = arg1;
			Static363.anInt5849 = arg2;
			Static245.anInt4476 = 0;
			local54 = Static172.method3123(Static163.aClass375_1, Static186.aClass218_49);
			local54.aClass3_Sub25_Sub1_2.method8608(Static440.aClass19_1.method2352(82) ? 1 : 0);
			local54.aClass3_Sub25_Sub1_2.method8596((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local54.aClass3_Sub25_Sub1_2.method8649(Static287.anInt4910 + local15);
			local54.aClass3_Sub25_Sub1_2.method8596(Static72.anInt1361 + local18);
			Static441.method6275(local54);
			Static85.method1623(local15, local34, local18);
		}
		if (local21 == 46) {
			Static363.anInt5849 = arg2;
			Static333.anInt9197 = arg1;
			Static245.anInt4476 = 0;
			Static240.anInt4425 = 2;
			local54 = Static172.method3123(Static163.aClass375_1, Static301.aClass218_73);
			local54.aClass3_Sub25_Sub1_2.method8616(Static72.anInt1361 + local18);
			local54.aClass3_Sub25_Sub1_2.method8598(Static440.aClass19_1.method2352(82) ? 1 : 0);
			local54.aClass3_Sub25_Sub1_2.method8616(local25);
			local54.aClass3_Sub25_Sub1_2.method8616(Static287.anInt4910 + local15);
			Static441.method6275(local54);
			Static300.method4622(local15, local18);
		}
		if (local21 == 1008) {
			Static245.anInt4476 = 0;
			Static363.anInt5849 = arg2;
			Static333.anInt9197 = arg1;
			Static240.anInt4425 = 2;
			local54 = Static172.method3123(Static163.aClass375_1, Static421.aClass218_100);
			local54.aClass3_Sub25_Sub1_2.method8649(local25);
			Static441.method6275(local54);
		}
		if (local21 == 1003) {
			Static240.anInt4425 = 2;
			Static245.anInt4476 = 0;
			Static363.anInt5849 = arg2;
			Static333.anInt9197 = arg1;
			local54 = Static172.method3123(Static163.aClass375_1, Static58.aClass218_15);
			local54.aClass3_Sub25_Sub1_2.method8649(local25);
			Static441.method6275(local54);
		}
		if (local21 == 16) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static240.anInt4425 = 2;
				Static363.anInt5849 = arg2;
				Static333.anInt9197 = arg1;
				Static245.anInt4476 = 0;
				local125 = Static172.method3123(Static163.aClass375_1, Static427.aClass218_104);
				local125.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
				local125.aClass3_Sub25_Sub1_2.method8649(local25);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		if (local21 == 22) {
			Static333.anInt9197 = arg1;
			Static240.anInt4425 = 2;
			Static245.anInt4476 = 0;
			Static363.anInt5849 = arg2;
			local54 = Static172.method3123(Static163.aClass375_1, Static357.aClass218_86);
			local54.aClass3_Sub25_Sub1_2.method8597(Static658.anInt10730);
			local54.aClass3_Sub25_Sub1_2.method8586(Static440.aClass19_1.method2352(82) ? 1 : 0);
			local54.aClass3_Sub25_Sub1_2.method8596(local15 + Static287.anInt4910);
			local54.aClass3_Sub25_Sub1_2.method8649(Static287.anInt4913);
			local54.aClass3_Sub25_Sub1_2.method8616((int) (local34 >>> 32) & Integer.MAX_VALUE);
			local54.aClass3_Sub25_Sub1_2.method8597(Static72.anInt1361 + local18);
			local54.aClass3_Sub25_Sub1_2.method8588(Static531.anInt8767);
			Static441.method6275(local54);
			Static85.method1623(local15, local34, local18);
		}
		if (local21 == 15) {
			local106 = Static611.aClass28_Sub1_Sub1_Sub1_Sub1Array1[local25];
			if (local106 != null) {
				Static333.anInt9197 = arg1;
				Static240.anInt4425 = 2;
				Static245.anInt4476 = 0;
				Static363.anInt5849 = arg2;
				local125 = Static172.method3123(Static163.aClass375_1, Static333.aClass218_133);
				local125.aClass3_Sub25_Sub1_2.method8616(local25);
				local125.aClass3_Sub25_Sub1_2.method8586(Static440.aClass19_1.method2352(82) ? 1 : 0);
				Static441.method6275(local125);
				Static471.method6829(0, local106.method9314(), -2, local106.anIntArray955[0], local106.anIntArray956[0], local106.method9314(), 0, true);
			}
		}
		if (local21 == 1012) {
			Static333.anInt9197 = arg1;
			Static363.anInt5849 = arg2;
			Static240.anInt4425 = 2;
			Static245.anInt4476 = 0;
			local54 = Static172.method3123(Static163.aClass375_1, Static463.aClass218_112);
			local54.aClass3_Sub25_Sub1_2.method8614(Static440.aClass19_1.method2352(82) ? 1 : 0);
			local54.aClass3_Sub25_Sub1_2.method8649(local15 + Static287.anInt4910);
			local54.aClass3_Sub25_Sub1_2.method8649(Integer.MAX_VALUE & (int) (local34 >>> 32));
			local54.aClass3_Sub25_Sub1_2.method8597(local18 + Static72.anInt1361);
			Static441.method6275(local54);
			Static85.method1623(local15, local34, local18);
		}
		if (Static624.aBoolean698) {
			Static632.method8816();
		}
		if (Static129.aClass260_8 != null && Static415.anInt6639 == 0) {
			Static456.method8151(Static129.aClass260_8);
		}
	}
}
