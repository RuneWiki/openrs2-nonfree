import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
	public static int anInt6380;

	@OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
	public static void method5071() {
		Static383.method5263(Static125.aClass93_11);
		Static383.anInt6622++;
		if (Static144.aBoolean168 && Static227.aBoolean255) {
			@Pc(28) int local28 = Static196.aClass126_1.method5366();
			@Pc(32) int local32 = Static196.aClass126_1.method5364();
			local32 -= Static321.anInt5761;
			local28 -= Static86.anInt1457;
			if (local28 < Static146.anInt2670) {
				local28 = Static146.anInt2670;
			}
			if (local28 + Static125.aClass93_11.anInt2436 > Static146.anInt2670 + Static148.aClass93_8.anInt2436) {
				local28 = Static148.aClass93_8.anInt2436 + Static146.anInt2670 - Static125.aClass93_11.anInt2436;
			}
			if (local32 < Static20.anInt410) {
				local32 = Static20.anInt410;
			}
			if (Static20.anInt410 + Static148.aClass93_8.anInt2495 < Static125.aClass93_11.anInt2495 + local32) {
				local32 = Static20.anInt410 + Static148.aClass93_8.anInt2495 - Static125.aClass93_11.anInt2495;
			}
			@Pc(113) int local113 = Static148.aClass93_8.anInt2451 + local28 - Static146.anInt2670;
			@Pc(122) int local122 = local32 + Static148.aClass93_8.anInt2435 - Static20.anInt410;
			@Pc(137) Class2_Sub18 local137;
			if (Static196.aClass126_1.method5362()) {
				if (Static125.aClass93_11.anInt2452 < Static383.anInt6622) {
					@Pc(211) int local211 = local28 - Static48.anInt784;
					@Pc(216) int local216 = local32 - Static108.anInt1832;
					if (Static125.aClass93_11.anInt2453 < local211 || -Static125.aClass93_11.anInt2453 > local211 || Static125.aClass93_11.anInt2453 < local216 || local216 < -Static125.aClass93_11.anInt2453) {
						Static191.aBoolean214 = true;
					}
				}
				if (Static125.aClass93_11.anObjectArray14 != null && Static191.aBoolean214) {
					local137 = new Class2_Sub18();
					local137.anObjectArray33 = Static125.aClass93_11.anObjectArray14;
					local137.aClass93_10 = Static125.aClass93_11;
					local137.anInt3061 = local122;
					local137.anInt3059 = local113;
					Static76.method1143(local137);
				}
			} else {
				if (Static191.aBoolean214) {
					Static465.method5985();
					if (Static125.aClass93_11.anObjectArray22 != null) {
						local137 = new Class2_Sub18();
						local137.anObjectArray33 = Static125.aClass93_11.anObjectArray22;
						local137.anInt3061 = local122;
						local137.aClass93_9 = Static240.aClass93_14;
						local137.aClass93_10 = Static125.aClass93_11;
						local137.anInt3059 = local113;
						Static76.method1143(local137);
					}
					if (Static240.aClass93_14 != null && Static53.method866(Static125.aClass93_11) != null) {
						Static304.method4353(Static125.aClass93_11, Static240.aClass93_14);
					}
				} else if ((Static157.anInt2846 == 1 || Static195.method2783()) && Static377.anInt6585 > 2) {
					Static203.method2866(Static321.anInt5761 + Static108.anInt1832, Static48.anInt784 + Static86.anInt1457);
				} else if (Static207.method2917()) {
					Static203.method2866(Static108.anInt1832 + Static321.anInt5761, Static48.anInt784 + Static86.anInt1457);
				}
				Static125.aClass93_11 = null;
			}
		} else if (Static383.anInt6622 > 1) {
			Static125.aClass93_11 = null;
		}
	}

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(ZZ)V")
	public static void method5072(@OriginalArg(1) boolean arg0) {
		if (Static339.aClass66_2 != null) {
			Static339.aClass66_2.method1388();
			Static339.aClass66_2 = null;
		}
		Static129.anInt2192 = 0;
		Static262.method3688();
		Static433.method5875();
		for (@Pc(19) int local19 = 0; local19 < 4; local19++) {
			Static89.aClass225Array2[local19].method5185();
		}
		Static428.method5826(false);
		System.gc();
		Static30.method513();
		Static235.aBoolean262 = false;
		Static323.anInt5772 = -1;
		Static214.method3027(true);
		Static163.anInt2919 = 0;
		Static409.anInt701 = 0;
		Static23.anInt7087 = 0;
		Static269.anInt2101 = 0;
		Static386.anInt7205 = 0;
		Static153.anInt2798 = 0;
		for (@Pc(58) int local58 = 0; local58 < Static223.aClass166Array1.length; local58++) {
			Static223.aClass166Array1[local58] = null;
		}
		Static437.method5909();
		for (@Pc(77) int local77 = 0; local77 < 2048; local77++) {
			Static435.aClass11_Sub5_Sub2_Sub1Array1[local77] = null;
		}
		Static458.anInt7721 = 0;
		Static400.aClass220_41.method5105();
		Static30.anInt548 = 0;
		Static293.aClass220_27.method5105();
		Static410.method5652();
		Static51.anInt840 = 0;
		Static63.aClass120_2.method2534();
		Static108.method1795();
		Static270.method3829();
		Static264.aClass2_Sub44_1 = null;
		Static461.aLong399 = 0L;
		if (arg0) {
			Static274.method3920(11);
			return;
		}
		Static274.method3920(2);
		try {
			Static471.method4356(Static138.aClass194_2.anApplet1, "loggedout");
		} catch (@Pc(127) Throwable local127) {
		}
	}
}
