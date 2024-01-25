import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!ep", name = "m", descriptor = "Lclient!tq;")
	public static Class191 aClass191_50;

	@OriginalMember(owner = "client!ep", name = "E", descriptor = "Lclient!tq;")
	public static Class191 aClass191_51;

	@OriginalMember(owner = "client!ep", name = "F", descriptor = "Lclient!uj;")
	public static Class197 aClass197_1;

	@OriginalMember(owner = "client!ep", name = "G", descriptor = "I")
	public static int anInt1734;

	@OriginalMember(owner = "client!ep", name = "n", descriptor = "Lclient!dg;")
	public static final Class2_Sub10 aClass2_Sub10_2 = new Class2_Sub10(new byte[5000]);

	@OriginalMember(owner = "client!ep", name = "D", descriptor = "[I")
	public static final int[] anIntArray185 = new int[100];

	@OriginalMember(owner = "client!ep", name = "H", descriptor = "[Lclient!di;")
	public static final Class2_Sub11_Sub1[] aClass2_Sub11_Sub1Array1 = new Class2_Sub11_Sub1[14];

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(ILclient!dn;)V")
	public static void method1807(@OriginalArg(1) Class2_Sub13 arg0) {
		if (arg0 == null || Static91.aClass216_22.aClass2_251 == arg0) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt1318;
		@Pc(18) int local18 = arg0.anInt1319;
		@Pc(21) int local21 = arg0.anInt1317;
		@Pc(25) int local25 = (int) arg0.aLong38;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(32) long local32 = arg0.aLong38;
		@Pc(38) int local38;
		@Pc(42) int local42;
		if (Static187.aClass2_Sub16_1 == null) {
			local38 = Static32.anInt590;
			local42 = Static351.anInt5286;
		} else {
			local38 = Static187.aClass2_Sub16_1.method1557();
			local42 = Static187.aClass2_Sub16_1.method1564();
		}
		if (local21 == 1008) {
			Static301.anInt5016 = local42;
			Static79.anInt1737 = local38;
			Static70.anInt1524 = 2;
			Static164.anInt3283 = 0;
			Static74.aClass2_Sub10_Sub1_2.method2049(81);
			Static74.aClass2_Sub10_Sub1_2.method4435(Static342.anInt6864 + local18);
			Static74.aClass2_Sub10_Sub1_2.method4459(local15 + Static138.anInt2879);
			Static74.aClass2_Sub10_Sub1_2.method4452((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static74.aClass2_Sub10_Sub1_2.method4404(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static280.method5071(local15, local18, local32);
		}
		@Pc(113) Class62_Sub1_Sub2_Sub2 local113;
		if (local21 == 9) {
			local113 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local25];
			if (local113 != null) {
				Static164.anInt3283 = 0;
				Static301.anInt5016 = local42;
				Static70.anInt1524 = 2;
				Static79.anInt1737 = local38;
				Static74.aClass2_Sub10_Sub1_2.method2049(172);
				Static74.aClass2_Sub10_Sub1_2.method4410(local25);
				Static74.aClass2_Sub10_Sub1_2.method4453(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local113.method4777(), local113.anIntArray396[0], -2, local113.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local113.method4777());
			}
		}
		if (local21 == 20) {
			local113 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local25];
			if (local113 != null) {
				Static164.anInt3283 = 0;
				Static301.anInt5016 = local42;
				Static79.anInt1737 = local38;
				Static70.anInt1524 = 2;
				Static74.aClass2_Sub10_Sub1_2.method2049(100);
				Static74.aClass2_Sub10_Sub1_2.method4458(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static74.aClass2_Sub10_Sub1_2.method4459(local25);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local113.method4777(), local113.anIntArray396[0], -2, local113.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local113.method4777());
			}
		}
		if (local21 == 1009) {
			Static164.anInt3283 = 0;
			Static70.anInt1524 = 2;
			Static301.anInt5016 = local42;
			Static79.anInt1737 = local38;
			Static74.aClass2_Sub10_Sub1_2.method2049(218);
			Static74.aClass2_Sub10_Sub1_2.method4459(local25);
		}
		if (local21 == 6) {
			Static79.anInt1737 = local38;
			Static164.anInt3283 = 0;
			Static70.anInt1524 = 2;
			Static301.anInt5016 = local42;
			Static74.aClass2_Sub10_Sub1_2.method2049(53);
			Static74.aClass2_Sub10_Sub1_2.method4452(local25);
			Static74.aClass2_Sub10_Sub1_2.method4458(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static74.aClass2_Sub10_Sub1_2.method4410(local18 + Static342.anInt6864);
			Static74.aClass2_Sub10_Sub1_2.method4410(Static138.anInt2879 + local15);
			Static50.method1196(local18, local15);
		}
		if (local21 == 57) {
			Static70.anInt1524 = 2;
			Static164.anInt3283 = 0;
			Static79.anInt1737 = local38;
			Static301.anInt5016 = local42;
			Static74.aClass2_Sub10_Sub1_2.method2049(32);
			Static74.aClass2_Sub10_Sub1_2.method4410(local18 + Static342.anInt6864);
			Static74.aClass2_Sub10_Sub1_2.method4459(local25);
			Static74.aClass2_Sub10_Sub1_2.method4459(Static138.anInt2879 + local15);
			Static74.aClass2_Sub10_Sub1_2.method4404(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static50.method1196(local18, local15);
		}
		if (local21 == 45) {
			if (Static295.anInt5969 > 0 && Static92.aClass97_2.method5672(82) && Static92.aClass97_2.method5672(81)) {
				Static302.method5307(local15 + Static138.anInt2879, Static342.anInt6864 + local18, Static182.anInt3603);
			} else {
				Static301.anInt5016 = local42;
				Static70.anInt1524 = 1;
				Static164.anInt3283 = 0;
				Static79.anInt1737 = local38;
				Static74.aClass2_Sub10_Sub1_2.method2049(156);
				Static74.aClass2_Sub10_Sub1_2.method4410(Static138.anInt2879 + local15);
				Static74.aClass2_Sub10_Sub1_2.method4410(local18 + Static342.anInt6864);
			}
		}
		if (local21 == 19) {
			Static79.anInt1737 = local38;
			Static70.anInt1524 = 2;
			Static164.anInt3283 = 0;
			Static301.anInt5016 = local42;
			Static74.aClass2_Sub10_Sub1_2.method2049(103);
			Static74.aClass2_Sub10_Sub1_2.method4430(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static74.aClass2_Sub10_Sub1_2.method4452(local18 + Static342.anInt6864);
			Static74.aClass2_Sub10_Sub1_2.method4410(Static138.anInt2879 + local15);
			Static74.aClass2_Sub10_Sub1_2.method4459(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static280.method5071(local15, local18, local32);
		}
		@Pc(492) Class62_Sub1_Sub2_Sub1 local492;
		if (local21 == 59) {
			local492 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local25];
			if (local492 != null) {
				Static79.anInt1737 = local38;
				Static70.anInt1524 = 2;
				Static301.anInt5016 = local42;
				Static164.anInt3283 = 0;
				Static74.aClass2_Sub10_Sub1_2.method2049(69);
				Static74.aClass2_Sub10_Sub1_2.method4452(local25);
				Static74.aClass2_Sub10_Sub1_2.method4430(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local492.method4777(), local492.anIntArray396[0], -2, local492.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local492.method4777());
			}
		}
		if (local21 == 1007 || local21 == 1004 || local21 == 1011 || local21 == 1012 || local21 == 1002) {
			Static6.method207(local21, local25, local15);
		}
		if (local21 == 17) {
			@Pc(588) Class146 local588 = Static86.method1928(local18, local15);
			if (local588 != null) {
				Static296.method5236(local588);
			}
		}
		if (local21 == 1001) {
			Static301.anInt5016 = local42;
			Static164.anInt3283 = 0;
			Static79.anInt1737 = local38;
			Static70.anInt1524 = 2;
			Static74.aClass2_Sub10_Sub1_2.method2049(31);
			Static74.aClass2_Sub10_Sub1_2.method4435(local25);
		}
		if (local21 == 15) {
			Static164.anInt3283 = 0;
			Static79.anInt1737 = local38;
			Static301.anInt5016 = local42;
			Static70.anInt1524 = 2;
			Static74.aClass2_Sub10_Sub1_2.method2049(52);
			Static74.aClass2_Sub10_Sub1_2.method4458(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static74.aClass2_Sub10_Sub1_2.method4459(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static74.aClass2_Sub10_Sub1_2.method4410(local18 + Static342.anInt6864);
			Static74.aClass2_Sub10_Sub1_2.method4452(local15 + Static138.anInt2879);
			Static280.method5071(local15, local18, local32);
		}
		if (local21 == 10) {
			local113 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local25];
			if (local113 != null) {
				Static301.anInt5016 = local42;
				Static70.anInt1524 = 2;
				Static79.anInt1737 = local38;
				Static164.anInt3283 = 0;
				Static74.aClass2_Sub10_Sub1_2.method2049(2);
				Static74.aClass2_Sub10_Sub1_2.method4404(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static74.aClass2_Sub10_Sub1_2.method4459(local25);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local113.method4777(), local113.anIntArray396[0], -2, local113.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local113.method4777());
			}
		}
		if (local21 == 2) {
			local113 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local25];
			if (local113 != null) {
				Static70.anInt1524 = 2;
				Static164.anInt3283 = 0;
				Static301.anInt5016 = local42;
				Static79.anInt1737 = local38;
				Static74.aClass2_Sub10_Sub1_2.method2049(169);
				Static74.aClass2_Sub10_Sub1_2.method4410(local25);
				Static74.aClass2_Sub10_Sub1_2.method4458(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local113.method4777(), local113.anIntArray396[0], -2, local113.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local113.method4777());
			}
		}
		if (local21 == 44) {
			local113 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local25];
			if (local113 != null) {
				Static70.anInt1524 = 2;
				Static79.anInt1737 = local38;
				Static301.anInt5016 = local42;
				Static164.anInt3283 = 0;
				Static74.aClass2_Sub10_Sub1_2.method2049(134);
				Static74.aClass2_Sub10_Sub1_2.method4434(Static7.anInt157);
				Static74.aClass2_Sub10_Sub1_2.method4459(Static48.anInt1094);
				Static74.aClass2_Sub10_Sub1_2.method4453(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static74.aClass2_Sub10_Sub1_2.method4435(local25);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local113.method4777(), local113.anIntArray396[0], -2, local113.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local113.method4777());
			}
		}
		if (local21 == 11) {
			Static301.anInt5016 = local42;
			Static79.anInt1737 = local38;
			Static70.anInt1524 = 2;
			Static164.anInt3283 = 0;
			Static74.aClass2_Sub10_Sub1_2.method2049(11);
			Static74.aClass2_Sub10_Sub1_2.method4458(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static74.aClass2_Sub10_Sub1_2.method4452(local15 + Static138.anInt2879);
			Static74.aClass2_Sub10_Sub1_2.method4435(local25);
			Static74.aClass2_Sub10_Sub1_2.method4410(Static342.anInt6864 + local18);
			Static50.method1196(local18, local15);
		}
		if (local21 == 51) {
			local492 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local25];
			if (local492 != null) {
				Static79.anInt1737 = local38;
				Static164.anInt3283 = 0;
				Static301.anInt5016 = local42;
				Static70.anInt1524 = 2;
				Static74.aClass2_Sub10_Sub1_2.method2049(121);
				Static74.aClass2_Sub10_Sub1_2.method4452(local25);
				Static74.aClass2_Sub10_Sub1_2.method4404(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local492.method4777(), local492.anIntArray396[0], -2, local492.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local492.method4777());
			}
		}
		if (local21 == 58) {
			Static164.anInt3283 = 0;
			Static79.anInt1737 = local38;
			Static301.anInt5016 = local42;
			Static70.anInt1524 = 2;
			Static74.aClass2_Sub10_Sub1_2.method2049(51);
			Static74.aClass2_Sub10_Sub1_2.method4452(Static138.anInt2879 + local15);
			Static74.aClass2_Sub10_Sub1_2.method4459(local18 + Static342.anInt6864);
			Static74.aClass2_Sub10_Sub1_2.method4404(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static74.aClass2_Sub10_Sub1_2.method4410(local25);
			Static50.method1196(local18, local15);
		}
		if (local21 == 25) {
			Static164.anInt3283 = 0;
			Static79.anInt1737 = local38;
			Static301.anInt5016 = local42;
			Static70.anInt1524 = 2;
			Static74.aClass2_Sub10_Sub1_2.method2049(192);
			Static74.aClass2_Sub10_Sub1_2.method4450(Static7.anInt157);
			Static74.aClass2_Sub10_Sub1_2.method4452(Static48.anInt1094);
			Static74.aClass2_Sub10_Sub1_2.method4459(local18 + Static342.anInt6864);
			Static74.aClass2_Sub10_Sub1_2.method4430(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static74.aClass2_Sub10_Sub1_2.method4452(local15 + Static138.anInt2879);
			Static74.aClass2_Sub10_Sub1_2.method4410(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static280.method5071(local15, local18, local32);
		}
		if (local21 == 12) {
			Static164.anInt3283 = 0;
			Static70.anInt1524 = 1;
			Static301.anInt5016 = local42;
			Static79.anInt1737 = local38;
			Static74.aClass2_Sub10_Sub1_2.method2049(229);
			Static74.aClass2_Sub10_Sub1_2.method4459(Static342.anInt6864 + local18);
			Static74.aClass2_Sub10_Sub1_2.method4459(local15 + Static138.anInt2879);
			Static74.aClass2_Sub10_Sub1_2.method4435(Static48.anInt1094);
			Static74.aClass2_Sub10_Sub1_2.method4411(Static7.anInt157);
			Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, 1, local18, -4, local15, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], 1);
		}
		if (local21 == 3) {
			Static79.anInt1737 = local38;
			Static164.anInt3283 = 0;
			Static70.anInt1524 = 2;
			Static301.anInt5016 = local42;
			Static74.aClass2_Sub10_Sub1_2.method2049(114);
			Static74.aClass2_Sub10_Sub1_2.method4410(Static138.anInt2879 + local15);
			Static74.aClass2_Sub10_Sub1_2.method4430(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static74.aClass2_Sub10_Sub1_2.method4459((int) (local32 >>> 32) & Integer.MAX_VALUE);
			Static74.aClass2_Sub10_Sub1_2.method4459(Static342.anInt6864 + local18);
			Static280.method5071(local15, local18, local32);
		}
		if (local21 == 48 && Static27.aClass146_16 == null) {
			Static171.method3200(local18, local15);
			Static27.aClass146_16 = Static86.method1928(local18, local15);
			Static152.method2932(Static27.aClass146_16);
		}
		if (local21 == 22) {
			Static79.anInt1737 = local38;
			Static164.anInt3283 = 0;
			Static301.anInt5016 = local42;
			Static70.anInt1524 = 2;
			Static74.aClass2_Sub10_Sub1_2.method2049(135);
			Static74.aClass2_Sub10_Sub1_2.method4410(Static342.anInt6864 + local18);
			Static74.aClass2_Sub10_Sub1_2.method4459(local25);
			Static74.aClass2_Sub10_Sub1_2.method4452(Static138.anInt2879 + local15);
			Static74.aClass2_Sub10_Sub1_2.method4430(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static50.method1196(local18, local15);
		}
		if (local21 == 46) {
			Static164.anInt3283 = 0;
			Static70.anInt1524 = 2;
			Static301.anInt5016 = local42;
			Static79.anInt1737 = local38;
			Static74.aClass2_Sub10_Sub1_2.method2049(132);
			Static74.aClass2_Sub10_Sub1_2.method4452(local18 + Static342.anInt6864);
			Static74.aClass2_Sub10_Sub1_2.method4459(Static48.anInt1094);
			Static74.aClass2_Sub10_Sub1_2.method4457(Static7.anInt157);
			Static74.aClass2_Sub10_Sub1_2.method4410(local25);
			Static74.aClass2_Sub10_Sub1_2.method4452(local15 + Static138.anInt2879);
			Static74.aClass2_Sub10_Sub1_2.method4458(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static50.method1196(local18, local15);
		}
		if (local21 == 18) {
			local492 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local25];
			if (local492 != null) {
				Static79.anInt1737 = local38;
				Static70.anInt1524 = 2;
				Static301.anInt5016 = local42;
				Static164.anInt3283 = 0;
				Static74.aClass2_Sub10_Sub1_2.method2049(193);
				Static74.aClass2_Sub10_Sub1_2.method4459(Static48.anInt1094);
				Static74.aClass2_Sub10_Sub1_2.method4450(Static7.anInt157);
				Static74.aClass2_Sub10_Sub1_2.method4430(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static74.aClass2_Sub10_Sub1_2.method4410(local25);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local492.method4777(), local492.anIntArray396[0], -2, local492.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local492.method4777());
			}
		}
		if (local21 == 21) {
			if (Static295.anInt5969 > 0 && Static92.aClass97_2.method5672(82) && Static92.aClass97_2.method5672(81)) {
				Static302.method5307(Static138.anInt2879 + local15, local18 + Static342.anInt6864, Static182.anInt3603);
			} else {
				Static134.method2691(local15, local25, local18);
				if (local25 == 1) {
					Static74.aClass2_Sub10_Sub1_2.method4430(-1);
					Static74.aClass2_Sub10_Sub1_2.method4430(-1);
					Static74.aClass2_Sub10_Sub1_2.method4452((int) Static92.aFloat28);
					Static74.aClass2_Sub10_Sub1_2.method4430(57);
					Static74.aClass2_Sub10_Sub1_2.method4430(Static256.anInt5068);
					Static74.aClass2_Sub10_Sub1_2.method4430(Static331.anInt3201);
					Static74.aClass2_Sub10_Sub1_2.method4430(89);
					Static74.aClass2_Sub10_Sub1_2.method4452(Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289);
					Static74.aClass2_Sub10_Sub1_2.method4452(Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280);
					Static74.aClass2_Sub10_Sub1_2.method4430(63);
				} else {
					Static70.anInt1524 = 1;
					Static79.anInt1737 = local38;
					Static164.anInt3283 = 0;
					Static301.anInt5016 = local42;
				}
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, 1, local18, -4, local15, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], 1);
			}
		}
		if (local21 == 13) {
			Static164.anInt3283 = 0;
			Static70.anInt1524 = 2;
			Static79.anInt1737 = local38;
			Static301.anInt5016 = local42;
			Static74.aClass2_Sub10_Sub1_2.method2049(141);
			Static74.aClass2_Sub10_Sub1_2.method4430(Static92.aClass97_2.method5672(82) ? 1 : 0);
			Static74.aClass2_Sub10_Sub1_2.method4459(Static138.anInt2879 + local15);
			Static74.aClass2_Sub10_Sub1_2.method4452(Integer.MAX_VALUE & (int) (local32 >>> 32));
			Static74.aClass2_Sub10_Sub1_2.method4410(local18 + Static342.anInt6864);
			Static280.method5071(local15, local18, local32);
		}
		if (local21 == 47) {
			local113 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local25];
			if (local113 != null) {
				Static70.anInt1524 = 2;
				Static79.anInt1737 = local38;
				Static301.anInt5016 = local42;
				Static164.anInt3283 = 0;
				Static74.aClass2_Sub10_Sub1_2.method2049(40);
				Static74.aClass2_Sub10_Sub1_2.method4410(local25);
				Static74.aClass2_Sub10_Sub1_2.method4430(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local113.method4777(), local113.anIntArray396[0], -2, local113.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local113.method4777());
			}
		}
		@Pc(1709) Class62_Sub1_Sub2_Sub1 local1709;
		if (local21 == 4) {
			local1709 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local25];
			if (local1709 != null) {
				Static164.anInt3283 = 0;
				Static301.anInt5016 = local42;
				Static79.anInt1737 = local38;
				Static70.anInt1524 = 2;
				Static74.aClass2_Sub10_Sub1_2.method2049(248);
				Static74.aClass2_Sub10_Sub1_2.method4453(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static74.aClass2_Sub10_Sub1_2.method4459(local25);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local1709.method4777(), local1709.anIntArray396[0], -2, local1709.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local1709.method4777());
			}
		}
		if (local21 == 60) {
			local1709 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local25];
			if (local1709 != null) {
				Static301.anInt5016 = local42;
				Static79.anInt1737 = local38;
				Static70.anInt1524 = 2;
				Static164.anInt3283 = 0;
				Static74.aClass2_Sub10_Sub1_2.method2049(216);
				Static74.aClass2_Sub10_Sub1_2.method4435(local25);
				Static74.aClass2_Sub10_Sub1_2.method4458(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local1709.method4777(), local1709.anIntArray396[0], -2, local1709.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local1709.method4777());
			}
		}
		@Pc(1849) Class62_Sub1_Sub2_Sub2 local1849;
		if (local21 == 50) {
			local1849 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local25];
			if (local1849 != null) {
				Static70.anInt1524 = 2;
				Static301.anInt5016 = local42;
				Static164.anInt3283 = 0;
				Static79.anInt1737 = local38;
				Static74.aClass2_Sub10_Sub1_2.method2049(59);
				Static74.aClass2_Sub10_Sub1_2.method4452(local25);
				Static74.aClass2_Sub10_Sub1_2.method4458(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local1849.method4777(), local1849.anIntArray396[0], -2, local1849.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local1849.method4777());
			}
		}
		if (local21 == 49) {
			local1849 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local25];
			if (local1849 != null) {
				Static79.anInt1737 = local38;
				Static70.anInt1524 = 2;
				Static301.anInt5016 = local42;
				Static164.anInt3283 = 0;
				Static74.aClass2_Sub10_Sub1_2.method2049(160);
				Static74.aClass2_Sub10_Sub1_2.method4459(local25);
				Static74.aClass2_Sub10_Sub1_2.method4453(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local1849.method4777(), local1849.anIntArray396[0], -2, local1849.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local1849.method4777());
			}
		}
		if (local21 == 8) {
			local1709 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local25];
			if (local1709 != null) {
				Static79.anInt1737 = local38;
				Static164.anInt3283 = 0;
				Static301.anInt5016 = local42;
				Static70.anInt1524 = 2;
				Static74.aClass2_Sub10_Sub1_2.method2049(174);
				Static74.aClass2_Sub10_Sub1_2.method4404(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static74.aClass2_Sub10_Sub1_2.method4435(local25);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local1709.method4777(), local1709.anIntArray396[0], -2, local1709.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local1709.method4777());
			}
		}
		if (local21 == 23) {
			@Pc(2057) Class146 local2057 = Static86.method1928(local18, local15);
			if (local2057 != null) {
				Static52.method1198();
				@Pc(2064) Class2_Sub5 local2064 = Static43.method1056(local2057);
				Static40.method943(local2064.method714(), local15, local2057.anInt4481, local2064.anInt475, local18, local2057.anInt4464);
				Static165.aString29 = Static36.method849(local2057);
				Static149.aString25 = local2057.aString40 + "<col=ffffff>";
				if (Static165.aString29 == null) {
					Static165.aString29 = "Null";
				}
			}
			return;
		}
		if (local21 == 5 || local21 == 1006) {
			Static32.method792(local25, local18, arg0.aString12, local15);
		}
		if (local21 == 30) {
			local1849 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local25];
			if (local1849 != null) {
				Static70.anInt1524 = 2;
				Static301.anInt5016 = local42;
				Static79.anInt1737 = local38;
				Static164.anInt3283 = 0;
				Static74.aClass2_Sub10_Sub1_2.method2049(33);
				Static74.aClass2_Sub10_Sub1_2.method4459(local25);
				Static74.aClass2_Sub10_Sub1_2.method4430(Static92.aClass97_2.method5672(82) ? 1 : 0);
				Static73.method3198(0, Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0], true, 0, local1849.method4777(), local1849.anIntArray396[0], -2, local1849.anIntArray397[0], Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0], local1849.method4777());
			}
		}
		if (local21 == 1010) {
			Static70.anInt1524 = 2;
			Static301.anInt5016 = local42;
			Static164.anInt3283 = 0;
			Static79.anInt1737 = local38;
			local1709 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local25];
			if (local1709 != null) {
				@Pc(2200) Class186 local2200 = local1709.aClass186_1;
				if (local2200.anIntArray432 != null) {
					local2200 = local2200.method5206();
				}
				if (local2200 != null) {
					Static74.aClass2_Sub10_Sub1_2.method2049(167);
					Static74.aClass2_Sub10_Sub1_2.method4459(local2200.anInt5943);
				}
			}
		}
		if (Static262.aBoolean479) {
			Static52.method1198();
		}
		if (Static313.aClass146_15 != null && Static282.anInt5706 == 0) {
			Static152.method2932(Static313.aClass146_15);
		}
	}

	@OriginalMember(owner = "client!ep", name = "a", descriptor = "(III)V")
	public static void method1808(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub11_Sub19 local8 = Static306.method5411(7, arg1);
		local8.method5537();
		local8.anInt6362 = arg0;
	}
}
