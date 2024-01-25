import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "Lclient!nq;")
	public static Class144 aClass144_109;

	@OriginalMember(owner = "client!ir", name = "m", descriptor = "I")
	public static int anInt6461 = 16777215;

	@OriginalMember(owner = "client!ir", name = "v", descriptor = "Lclient!bj;")
	public static final Class26 aClass26_59 = new Class26(20);

	@OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
	public static int anInt6476 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(III)Lclient!pk;")
	public static Class67_Sub4 method5506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class106 local7 = Static212.aClass106ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null || local7.aClass67_Sub4_1 == null ? null : local7.aClass67_Sub4_1;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!g;I)V")
	public static void method5514(@OriginalArg(0) Class11_Sub14 arg0) {
		if (arg0 == null || Static119.aClass16_21.aClass11_9 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt1764;
		@Pc(18) int local18 = arg0.anInt1763;
		@Pc(21) int local21 = arg0.anInt1765;
		@Pc(25) int local25 = (int) arg0.aLong67;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(34) long local34 = arg0.aLong67;
		@Pc(40) int local40;
		@Pc(38) int local38;
		if (Static182.aClass11_Sub39_1 == null) {
			local38 = Static37.anInt694;
			local40 = Static83.anInt1515;
		} else {
			local40 = Static182.aClass11_Sub39_1.method5601();
			local38 = Static182.aClass11_Sub39_1.method5598();
		}
		@Pc(57) Class67_Sub3_Sub3_Sub2 local57;
		if (local21 == 46) {
			local57 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local25];
			if (local57 != null) {
				Static240.anInt4835 = local38;
				Static129.anInt2387 = 2;
				Static66.anInt2104 = local40;
				Static89.anInt1600 = 0;
				Static313.aClass11_Sub25_Sub1_5.method2454(195);
				Static313.aClass11_Sub25_Sub1_5.method5210(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static313.aClass11_Sub25_Sub1_5.method5170(local25);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local57.method4368(), local57.anIntArray392[0], 0, local57.anIntArray391[0], 0, local57.method4368(), true);
			}
		}
		if (local21 == 8) {
			local57 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local25];
			if (local57 != null) {
				Static66.anInt2104 = local40;
				Static240.anInt4835 = local38;
				Static89.anInt1600 = 0;
				Static129.anInt2387 = 2;
				Static313.aClass11_Sub25_Sub1_5.method2454(51);
				Static313.aClass11_Sub25_Sub1_5.method5191(local25);
				Static313.aClass11_Sub25_Sub1_5.method5189(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local57.method4368(), local57.anIntArray392[0], 0, local57.anIntArray391[0], 0, local57.method4368(), true);
			}
		}
		if (local21 == 50) {
			Static89.anInt1600 = 0;
			Static129.anInt2387 = 1;
			Static66.anInt2104 = local40;
			Static240.anInt4835 = local38;
			Static313.aClass11_Sub25_Sub1_5.method2454(127);
			Static313.aClass11_Sub25_Sub1_5.method5196(Static169.anInt6312 + local18);
			Static313.aClass11_Sub25_Sub1_5.method5204(local15 + Static182.anInt3662);
			Static313.aClass11_Sub25_Sub1_5.method5204(Static122.anInt2282);
			Static313.aClass11_Sub25_Sub1_5.method5208(Static219.anInt4454);
			Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -4, 1, local18, 0, local15, 0, 1, true);
		}
		if (local21 == 60) {
			Static129.anInt2387 = 2;
			Static66.anInt2104 = local40;
			Static240.anInt4835 = local38;
			Static89.anInt1600 = 0;
			Static313.aClass11_Sub25_Sub1_5.method2454(198);
			Static313.aClass11_Sub25_Sub1_5.method5182(Static219.anInt4454);
			Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static313.aClass11_Sub25_Sub1_5.method5191(local18 + Static169.anInt6312);
			Static313.aClass11_Sub25_Sub1_5.method5204(local25);
			Static313.aClass11_Sub25_Sub1_5.method5191(local15 + Static182.anInt3662);
			Static313.aClass11_Sub25_Sub1_5.method5196(Static122.anInt2282);
			Static340.method4782(local18, local15);
		}
		if (local21 == 51) {
			Static240.anInt4835 = local38;
			Static66.anInt2104 = local40;
			Static89.anInt1600 = 0;
			Static129.anInt2387 = 2;
			Static313.aClass11_Sub25_Sub1_5.method2454(122);
			Static313.aClass11_Sub25_Sub1_5.method5191(local25);
			Static313.aClass11_Sub25_Sub1_5.method5196(local15 + Static182.anInt3662);
			Static313.aClass11_Sub25_Sub1_5.method5191(Static169.anInt6312 + local18);
			Static313.aClass11_Sub25_Sub1_5.method5189(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static340.method4782(local18, local15);
		}
		if (local21 == 49) {
			Static89.anInt1600 = 0;
			Static66.anInt2104 = local40;
			Static129.anInt2387 = 2;
			Static240.anInt4835 = local38;
			Static313.aClass11_Sub25_Sub1_5.method2454(254);
			Static313.aClass11_Sub25_Sub1_5.method5210(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static313.aClass11_Sub25_Sub1_5.method5191(local15 + Static182.anInt3662);
			Static313.aClass11_Sub25_Sub1_5.method5196(Static169.anInt6312 + local18);
			Static313.aClass11_Sub25_Sub1_5.method5191(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static88.method1283(local15, local18, local34);
		}
		if (local21 == 1008 || local21 == 1009 || local21 == 1007 || local21 == 1001 || local21 == 1012) {
			Static120.method1445(local21, local25, local15);
		}
		if (local21 == 5) {
			local57 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local25];
			if (local57 != null) {
				Static66.anInt2104 = local40;
				Static129.anInt2387 = 2;
				Static89.anInt1600 = 0;
				Static240.anInt4835 = local38;
				Static313.aClass11_Sub25_Sub1_5.method2454(204);
				Static313.aClass11_Sub25_Sub1_5.method5196(local25);
				Static313.aClass11_Sub25_Sub1_5.method5210(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local57.method4368(), local57.anIntArray392[0], 0, local57.anIntArray391[0], 0, local57.method4368(), true);
			}
		}
		@Pc(537) Class67_Sub3_Sub3_Sub1 local537;
		if (local21 == 22) {
			local537 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local25];
			if (local537 != null) {
				Static129.anInt2387 = 2;
				Static66.anInt2104 = local40;
				Static89.anInt1600 = 0;
				Static240.anInt4835 = local38;
				Static313.aClass11_Sub25_Sub1_5.method2454(1);
				Static313.aClass11_Sub25_Sub1_5.method5170(Static122.anInt2282);
				Static313.aClass11_Sub25_Sub1_5.method5208(Static219.anInt4454);
				Static313.aClass11_Sub25_Sub1_5.method5191(local25);
				Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local537.method4368(), local537.anIntArray392[0], 0, local537.anIntArray391[0], 0, local537.method4368(), true);
			}
		}
		if (local21 == 47 || local21 == 1002) {
			Static260.method4524(local18, local25, arg0.aString17, local15);
		}
		if (local21 == 1004) {
			Static129.anInt2387 = 2;
			Static89.anInt1600 = 0;
			Static240.anInt4835 = local38;
			Static66.anInt2104 = local40;
			Static313.aClass11_Sub25_Sub1_5.method2454(184);
			Static313.aClass11_Sub25_Sub1_5.method5191(local25);
		}
		if (local21 == 44) {
			Static89.anInt1600 = 0;
			Static240.anInt4835 = local38;
			Static66.anInt2104 = local40;
			Static129.anInt2387 = 2;
			Static313.aClass11_Sub25_Sub1_5.method2454(38);
			Static313.aClass11_Sub25_Sub1_5.method5170(local15 + Static182.anInt3662);
			Static313.aClass11_Sub25_Sub1_5.method5170((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static313.aClass11_Sub25_Sub1_5.method5204(Static169.anInt6312 + local18);
			Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static88.method1283(local15, local18, local34);
		}
		if (local21 == 11) {
			local537 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local25];
			if (local537 != null) {
				Static66.anInt2104 = local40;
				Static89.anInt1600 = 0;
				Static240.anInt4835 = local38;
				Static129.anInt2387 = 2;
				Static313.aClass11_Sub25_Sub1_5.method2454(225);
				Static313.aClass11_Sub25_Sub1_5.method5210(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static313.aClass11_Sub25_Sub1_5.method5170(local25);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local537.method4368(), local537.anIntArray392[0], 0, local537.anIntArray391[0], 0, local537.method4368(), true);
			}
		}
		if (local21 == 57) {
			Static66.anInt2104 = local40;
			Static129.anInt2387 = 2;
			Static240.anInt4835 = local38;
			Static89.anInt1600 = 0;
			Static313.aClass11_Sub25_Sub1_5.method2454(110);
			Static313.aClass11_Sub25_Sub1_5.method5196(Static169.anInt6312 + local18);
			Static313.aClass11_Sub25_Sub1_5.method5196(local15 + Static182.anInt3662);
			Static313.aClass11_Sub25_Sub1_5.method5170(local25);
			Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static340.method4782(local18, local15);
		}
		if (local21 == 15) {
			local537 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local25];
			if (local537 != null) {
				Static89.anInt1600 = 0;
				Static66.anInt2104 = local40;
				Static129.anInt2387 = 2;
				Static240.anInt4835 = local38;
				Static313.aClass11_Sub25_Sub1_5.method2454(125);
				Static313.aClass11_Sub25_Sub1_5.method5191(local25);
				Static313.aClass11_Sub25_Sub1_5.method5186(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local537.method4368(), local537.anIntArray392[0], 0, local537.anIntArray391[0], 0, local537.method4368(), true);
			}
		}
		if (local21 == 25) {
			Static89.anInt1600 = 0;
			Static129.anInt2387 = 2;
			Static66.anInt2104 = local40;
			Static240.anInt4835 = local38;
			Static313.aClass11_Sub25_Sub1_5.method2454(12);
			Static313.aClass11_Sub25_Sub1_5.method5170(local15 + Static182.anInt3662);
			Static313.aClass11_Sub25_Sub1_5.method5204(Static169.anInt6312 + local18);
			Static313.aClass11_Sub25_Sub1_5.method5196(local25);
			Static313.aClass11_Sub25_Sub1_5.method5210(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static340.method4782(local18, local15);
		}
		if (local21 == 18) {
			local57 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local25];
			if (local57 != null) {
				Static129.anInt2387 = 2;
				Static240.anInt4835 = local38;
				Static66.anInt2104 = local40;
				Static89.anInt1600 = 0;
				Static313.aClass11_Sub25_Sub1_5.method2454(162);
				Static313.aClass11_Sub25_Sub1_5.method5191(local25);
				Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local57.method4368(), local57.anIntArray392[0], 0, local57.anIntArray391[0], 0, local57.method4368(), true);
			}
		}
		if (local21 == 1010) {
			Static89.anInt1600 = 0;
			Static240.anInt4835 = local38;
			Static129.anInt2387 = 2;
			Static66.anInt2104 = local40;
			local537 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local25];
			if (local537 != null) {
				@Pc(1064) Class82 local1064 = local537.aClass82_1;
				if (local1064.anIntArray134 != null) {
					local1064 = local1064.method1569();
				}
				if (local1064 != null) {
					Static313.aClass11_Sub25_Sub1_5.method2454(100);
					Static313.aClass11_Sub25_Sub1_5.method5170(local1064.anInt1863);
				}
			}
		}
		if (local21 == 21) {
			local57 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local25];
			if (local57 != null) {
				Static66.anInt2104 = local40;
				Static89.anInt1600 = 0;
				Static129.anInt2387 = 2;
				Static240.anInt4835 = local38;
				Static313.aClass11_Sub25_Sub1_5.method2454(168);
				Static313.aClass11_Sub25_Sub1_5.method5186(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static313.aClass11_Sub25_Sub1_5.method5170(local25);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local57.method4368(), local57.anIntArray392[0], 0, local57.anIntArray391[0], 0, local57.method4368(), true);
			}
		}
		if (local21 == 12) {
			Static89.anInt1600 = 0;
			Static240.anInt4835 = local38;
			Static66.anInt2104 = local40;
			Static129.anInt2387 = 2;
			Static313.aClass11_Sub25_Sub1_5.method2454(63);
			Static313.aClass11_Sub25_Sub1_5.method5191((int) (local34 >>> 32) & Integer.MAX_VALUE);
			Static313.aClass11_Sub25_Sub1_5.method5170(local15 + Static182.anInt3662);
			Static313.aClass11_Sub25_Sub1_5.method5186(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static313.aClass11_Sub25_Sub1_5.method5191(local18 + Static169.anInt6312);
			Static88.method1283(local15, local18, local34);
		}
		if (local21 == 20) {
			local57 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local25];
			if (local57 != null) {
				Static240.anInt4835 = local38;
				Static129.anInt2387 = 2;
				Static89.anInt1600 = 0;
				Static66.anInt2104 = local40;
				Static313.aClass11_Sub25_Sub1_5.method2454(31);
				Static313.aClass11_Sub25_Sub1_5.method5170(local25);
				Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local57.method4368(), local57.anIntArray392[0], 0, local57.anIntArray391[0], 0, local57.method4368(), true);
			}
		}
		if (local21 == 10) {
			Static129.anInt2387 = 2;
			Static66.anInt2104 = local40;
			Static240.anInt4835 = local38;
			Static89.anInt1600 = 0;
			Static313.aClass11_Sub25_Sub1_5.method2454(222);
			Static313.aClass11_Sub25_Sub1_5.method5191(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static313.aClass11_Sub25_Sub1_5.method5204(local18 + Static169.anInt6312);
			Static313.aClass11_Sub25_Sub1_5.method5189(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static313.aClass11_Sub25_Sub1_5.method5191(local15 + Static182.anInt3662);
			Static88.method1283(local15, local18, local34);
		}
		if (local21 == 48) {
			Static66.anInt2104 = local40;
			Static129.anInt2387 = 2;
			Static240.anInt4835 = local38;
			Static89.anInt1600 = 0;
			Static313.aClass11_Sub25_Sub1_5.method2454(187);
			Static313.aClass11_Sub25_Sub1_5.method5170(local25);
			Static313.aClass11_Sub25_Sub1_5.method5186(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static313.aClass11_Sub25_Sub1_5.method5170(local15 + Static182.anInt3662);
			Static313.aClass11_Sub25_Sub1_5.method5191(local18 + Static169.anInt6312);
			Static340.method4782(local18, local15);
		}
		if (local21 == 2 && Static242.aClass137_17 == null) {
			Static157.method2531(local15, local18);
			Static242.aClass137_17 = Static188.method3467(local18, local15);
			Static69.method1039(Static242.aClass137_17);
		}
		if (local21 == 1003) {
			Static89.anInt1600 = 0;
			Static240.anInt4835 = local38;
			Static129.anInt2387 = 2;
			Static66.anInt2104 = local40;
			Static313.aClass11_Sub25_Sub1_5.method2454(172);
			Static313.aClass11_Sub25_Sub1_5.method5191(local25);
		}
		@Pc(1467) Class137 local1467;
		if (local21 == 9) {
			local1467 = Static188.method3467(local18, local15);
			if (local1467 != null) {
				Static129.method1989();
				@Pc(1476) Class11_Sub36 local1476 = Static42.method634(local1467);
				Static110.method3647(local1476.anInt5607, local18, local1467.anInt4043, local1467.anInt4068, local15, local1476.method4727());
				Static110.aString39 = Static201.method5713(local1467);
				Static63.aString10 = local1467.aString38 + "<col=ffffff>";
				if (Static110.aString39 == null) {
					Static110.aString39 = "Null";
				}
			}
			return;
		}
		if (local21 == 30) {
			local57 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local25];
			if (local57 != null) {
				Static129.anInt2387 = 2;
				Static240.anInt4835 = local38;
				Static89.anInt1600 = 0;
				Static66.anInt2104 = local40;
				Static313.aClass11_Sub25_Sub1_5.method2454(77);
				Static313.aClass11_Sub25_Sub1_5.method5170(local25);
				Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local57.method4368(), local57.anIntArray392[0], 0, local57.anIntArray391[0], 0, local57.method4368(), true);
			}
		}
		if (local21 == 4) {
			local537 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local25];
			if (local537 != null) {
				Static129.anInt2387 = 2;
				Static240.anInt4835 = local38;
				Static66.anInt2104 = local40;
				Static89.anInt1600 = 0;
				Static313.aClass11_Sub25_Sub1_5.method2454(32);
				Static313.aClass11_Sub25_Sub1_5.method5196(local25);
				Static313.aClass11_Sub25_Sub1_5.method5186(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local537.method4368(), local537.anIntArray392[0], 0, local537.anIntArray391[0], 0, local537.method4368(), true);
			}
		}
		if (local21 == 6) {
			local1467 = Static188.method3467(local18, local15);
			if (local1467 != null) {
				Static43.method650(local1467);
			}
		}
		if (local21 == 23) {
			if (Static248.anInt4969 > 0 && Static278.aClass143_20.method4857(82) && Static278.aClass143_20.method4857(81)) {
				Static117.method1781(local15 + Static182.anInt3662, Static322.anInt6250, Static169.anInt6312 + local18);
			} else {
				Static350.method5659(local25, local18, local15);
				if (local25 == 1) {
					Static313.aClass11_Sub25_Sub1_5.method5186(-1);
					Static313.aClass11_Sub25_Sub1_5.method5186(-1);
					Static313.aClass11_Sub25_Sub1_5.method5204((int) Static246.aFloat51);
					Static313.aClass11_Sub25_Sub1_5.method5186(57);
					Static313.aClass11_Sub25_Sub1_5.method5186(Static303.anInt4931);
					Static313.aClass11_Sub25_Sub1_5.method5186(Static231.anInt5050);
					Static313.aClass11_Sub25_Sub1_5.method5186(89);
					Static313.aClass11_Sub25_Sub1_5.method5204(Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308);
					Static313.aClass11_Sub25_Sub1_5.method5204(Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310);
					Static313.aClass11_Sub25_Sub1_5.method5186(63);
				} else {
					Static129.anInt2387 = 1;
					Static66.anInt2104 = local40;
					Static89.anInt1600 = 0;
					Static240.anInt4835 = local38;
				}
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -4, 1, local18, 0, local15, 0, 1, true);
			}
		}
		if (local21 == 59) {
			Static129.anInt2387 = 2;
			Static66.anInt2104 = local40;
			Static240.anInt4835 = local38;
			Static89.anInt1600 = 0;
			Static313.aClass11_Sub25_Sub1_5.method2454(65);
			Static313.aClass11_Sub25_Sub1_5.method5170(local25);
			Static313.aClass11_Sub25_Sub1_5.method5204(Static169.anInt6312 + local18);
			Static313.aClass11_Sub25_Sub1_5.method5189(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static313.aClass11_Sub25_Sub1_5.method5204(Static182.anInt3662 + local15);
			Static340.method4782(local18, local15);
		}
		if (local21 == 13) {
			local57 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local25];
			if (local57 != null) {
				Static240.anInt4835 = local38;
				Static66.anInt2104 = local40;
				Static129.anInt2387 = 2;
				Static89.anInt1600 = 0;
				Static313.aClass11_Sub25_Sub1_5.method2454(189);
				Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static313.aClass11_Sub25_Sub1_5.method5196(local25);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local57.method4368(), local57.anIntArray392[0], 0, local57.anIntArray391[0], 0, local57.method4368(), true);
			}
		}
		if (local21 == 3) {
			if (Static248.anInt4969 > 0 && Static278.aClass143_20.method4857(82) && Static278.aClass143_20.method4857(81)) {
				Static117.method1781(local15 + Static182.anInt3662, Static322.anInt6250, Static169.anInt6312 + local18);
			} else {
				Static89.anInt1600 = 0;
				Static129.anInt2387 = 1;
				Static240.anInt4835 = local38;
				Static66.anInt2104 = local40;
				Static313.aClass11_Sub25_Sub1_5.method2454(98);
				Static313.aClass11_Sub25_Sub1_5.method5191(local15 + Static182.anInt3662);
				Static313.aClass11_Sub25_Sub1_5.method5170(Static169.anInt6312 + local18);
			}
		}
		if (local21 == 19) {
			local57 = Static105.aClass67_Sub3_Sub3_Sub2Array1[local25];
			if (local57 != null) {
				Static129.anInt2387 = 2;
				Static66.anInt2104 = local40;
				Static240.anInt4835 = local38;
				Static89.anInt1600 = 0;
				Static313.aClass11_Sub25_Sub1_5.method2454(147);
				Static313.aClass11_Sub25_Sub1_5.method5189(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static313.aClass11_Sub25_Sub1_5.method5208(Static219.anInt4454);
				Static313.aClass11_Sub25_Sub1_5.method5170(Static122.anInt2282);
				Static313.aClass11_Sub25_Sub1_5.method5170(local25);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local57.method4368(), local57.anIntArray392[0], 0, local57.anIntArray391[0], 0, local57.method4368(), true);
			}
		}
		if (local21 == 45) {
			local537 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local25];
			if (local537 != null) {
				Static240.anInt4835 = local38;
				Static129.anInt2387 = 2;
				Static89.anInt1600 = 0;
				Static66.anInt2104 = local40;
				Static313.aClass11_Sub25_Sub1_5.method2454(217);
				Static313.aClass11_Sub25_Sub1_5.method5204(local25);
				Static313.aClass11_Sub25_Sub1_5.method5186(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local537.method4368(), local537.anIntArray392[0], 0, local537.anIntArray391[0], 0, local537.method4368(), true);
			}
		}
		if (local21 == 58) {
			local537 = Static356.aClass67_Sub3_Sub3_Sub1Array1[local25];
			if (local537 != null) {
				Static129.anInt2387 = 2;
				Static66.anInt2104 = local40;
				Static240.anInt4835 = local38;
				Static89.anInt1600 = 0;
				Static313.aClass11_Sub25_Sub1_5.method2454(158);
				Static313.aClass11_Sub25_Sub1_5.method5170(local25);
				Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
				Static81.method1214(Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0], Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0], -2, local537.method4368(), local537.anIntArray392[0], 0, local537.anIntArray391[0], 0, local537.method4368(), true);
			}
		}
		if (local21 == 17) {
			Static66.anInt2104 = local40;
			Static240.anInt4835 = local38;
			Static129.anInt2387 = 2;
			Static89.anInt1600 = 0;
			Static313.aClass11_Sub25_Sub1_5.method2454(37);
			Static313.aClass11_Sub25_Sub1_5.method5196(local15 + Static182.anInt3662);
			Static313.aClass11_Sub25_Sub1_5.method5196(local18 + Static169.anInt6312);
			Static313.aClass11_Sub25_Sub1_5.method5196(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static313.aClass11_Sub25_Sub1_5.method5196(Static122.anInt2282);
			Static313.aClass11_Sub25_Sub1_5.method5208(Static219.anInt4454);
			Static88.method1283(local15, local18, local34);
		}
		if (local21 == 1011) {
			Static89.anInt1600 = 0;
			Static129.anInt2387 = 2;
			Static66.anInt2104 = local40;
			Static240.anInt4835 = local38;
			Static313.aClass11_Sub25_Sub1_5.method2454(191);
			Static313.aClass11_Sub25_Sub1_5.method5204(Static182.anInt3662 + local15);
			Static313.aClass11_Sub25_Sub1_5.method5204(Integer.MAX_VALUE & (int) (local34 >>> 32));
			Static313.aClass11_Sub25_Sub1_5.method5204(Static169.anInt6312 + local18);
			Static313.aClass11_Sub25_Sub1_5.method5214(Static278.aClass143_20.method4857(82) ? 1 : 0);
			Static88.method1283(local15, local18, local34);
		}
		if (Static103.aBoolean118) {
			Static129.method1989();
		}
		if (Static239.aClass137_15 != null && Static39.anInt725 == 0) {
			Static69.method1039(Static239.aClass137_15);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!nq;BI)Lclient!k;")
	public static Class114 method5516(@OriginalArg(0) Class144 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) byte[] local14 = arg0.method3908(arg1);
		return local14 == null ? null : new Class114(local14);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ZZ)V")
	public static void method5520(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (Static270.anInt5491 != -1) {
				Static297.method4915(Static270.anInt5491);
			}
			for (@Pc(15) Class11_Sub41 local15 = (Class11_Sub41) Static197.aClass58_18.method1008(); local15 != null; local15 = (Class11_Sub41) Static197.aClass58_18.method1004()) {
				if (!local15.method5704()) {
					local15 = (Class11_Sub41) Static197.aClass58_18.method1008();
					if (local15 == null) {
						break;
					}
				}
				Static66.method1709(local15, true, false);
			}
			Static270.anInt5491 = -1;
			Static197.aClass58_18 = new Class58(8);
			Static36.method539();
			Static270.anInt5491 = Static153.anInt2899;
			Static219.method3921(false);
			Static239.method4236();
			Static93.method1349(Static270.anInt5491);
		}
		Static120.method1447();
		Static288.anInt5695 = -1;
		Static63.method928(Static294.anInt5815);
		Static156.aClass67_Sub3_Sub3_Sub2_2 = new Class67_Sub3_Sub3_Sub2();
		Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6310 = 6656;
		Static156.aClass67_Sub3_Sub3_Sub2_2.anInt6308 = 6656;
		Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray391[0] = 52;
		Static316.anInt6169 = 0;
		Static190.anInt3870 = 0;
		Static156.aClass67_Sub3_Sub3_Sub2_2.anIntArray392[0] = 52;
		if (Static81.anInt1498 == 2) {
			Static190.anInt3870 = Static25.anInt6259 << 7;
			Static316.anInt6169 = Static145.anInt2656 << 7;
		} else {
			Static193.method3528();
		}
		Static337.method5495();
		if (Static190.anInt3870 == 0 || Static316.anInt6169 == 0) {
			Static284.method4731(10);
		} else {
			Static134.method2076();
			Static284.method4731(28);
		}
	}
}
