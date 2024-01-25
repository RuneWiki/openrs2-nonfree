import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cm", name = "d", descriptor = "J")
	public static final long aLong46 = (long) (Math.random() * 9.999999999E9D);

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(ILclient!n;Lclient!qa;)V")
	public static void method1762(@OriginalArg(1) Interface8 arg0, @OriginalArg(2) Class9 arg1) {
		if (Static451.aClass1_Sub1_Sub12_2 == null) {
			return;
		}
		if (Static52.anInt1508 < 10) {
			if (!Static451.aClass160_36.method4219(Static451.aClass1_Sub1_Sub12_2.aString45)) {
				Static52.anInt1508 = Static115.aClass160_24.method4194(Static451.aClass1_Sub1_Sub12_2.aString45) / 10;
				return;
			}
			Static215.method3859();
			Static52.anInt1508 = 10;
		}
		if (Static52.anInt1508 == 10) {
			Static451.anInt3558 = Static451.aClass1_Sub1_Sub12_2.anInt5574 >> 6 << 6;
			Static451.anInt3553 = Static451.aClass1_Sub1_Sub12_2.anInt5575 >> 6 << 6;
			Static451.anInt3551 = (Static451.aClass1_Sub1_Sub12_2.anInt5570 >> 6 << 6) + 64 - Static451.anInt3558;
			Static451.anInt3555 = (Static451.aClass1_Sub1_Sub12_2.anInt5577 >> 6 << 6) + 64 - Static451.anInt3553;
			@Pc(73) int[] local73 = new int[3];
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = -1;
			if (Static451.aClass1_Sub1_Sub12_2.method4790(Static16.aClass47_Sub2_Sub3_Sub2_1.aByte94, (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 >> 7) + Static324.anInt6132, local73, (Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 >> 7) + Static517.anInt8716)) {
				local75 = local73[1] - Static451.anInt3553;
				local77 = local73[2] - Static451.anInt3558;
			}
			if (!Static74.aBoolean152 && local75 >= 0 && local75 < Static451.anInt3555 && local77 >= 0 && local77 < Static451.anInt3551) {
				local75 += (int) (Math.random() * 10.0D) - 5;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static211.anInt4386 = local75;
				Static181.anInt3889 = local77;
			} else if (Static64.anInt1865 == -1 || Static101.anInt2454 == -1) {
				Static451.aClass1_Sub1_Sub12_2.method4787(Static451.aClass1_Sub1_Sub12_2.anInt5569 >> 14 & 0x3FFF, local73, Static451.aClass1_Sub1_Sub12_2.anInt5569 & 0x3FFF);
				Static211.anInt4386 = local73[1] - Static451.anInt3553;
				Static181.anInt3889 = local73[2] - Static451.anInt3558;
			} else {
				Static451.aClass1_Sub1_Sub12_2.method4787(Static64.anInt1865, local73, Static101.anInt2454);
				if (local73 != null) {
					Static181.anInt3889 = local73[2] - Static451.anInt3558;
					Static211.anInt4386 = local73[1] - Static451.anInt3553;
				}
				Static101.anInt2454 = -1;
				Static64.anInt1865 = -1;
				Static74.aBoolean152 = false;
			}
			if (Static451.aClass1_Sub1_Sub12_2.anInt5578 == 37) {
				Static451.aFloat84 = 3.0F;
				Static451.aFloat85 = 3.0F;
			} else if (Static451.aClass1_Sub1_Sub12_2.anInt5578 == 50) {
				Static451.aFloat84 = 4.0F;
				Static451.aFloat85 = 4.0F;
			} else if (Static451.aClass1_Sub1_Sub12_2.anInt5578 == 75) {
				Static451.aFloat84 = 6.0F;
				Static451.aFloat85 = 6.0F;
			} else if (Static451.aClass1_Sub1_Sub12_2.anInt5578 == 100) {
				Static451.aFloat84 = 8.0F;
				Static451.aFloat85 = 8.0F;
			} else if (Static451.aClass1_Sub1_Sub12_2.anInt5578 == 200) {
				Static451.aFloat84 = 16.0F;
				Static451.aFloat85 = 16.0F;
			} else {
				Static451.aFloat84 = 8.0F;
				Static451.aFloat85 = 8.0F;
			}
			Static451.anInt3548 = (int) Static451.aFloat84 >> 1;
			Static451.aByteArrayArrayArray3 = Static15.method802(Static451.anInt3548);
			Static2.method4834();
			Static451.method3229();
			Static263.aClass38_39 = new Class38();
			Static451.anInt3550 += (int) (Math.random() * 5.0D) - 2;
			if (Static451.anInt3550 < -8) {
				Static451.anInt3550 = -8;
			}
			Static451.anInt3549 += (int) (Math.random() * 5.0D) - 2;
			if (Static451.anInt3550 > 8) {
				Static451.anInt3550 = 8;
			}
			if (Static451.anInt3549 < -16) {
				Static451.anInt3549 = -16;
			}
			if (Static451.anInt3549 > 16) {
				Static451.anInt3549 = 16;
			}
			Static451.method3215(arg0, Static451.anInt3550 >> 2 << 10, Static451.anInt3549 >> 1);
			Static451.aClass250_3.method6147(256, 1024);
			Static451.aClass165_2.method4292(256, 256);
			Static451.aClass194_4.method5082(4096);
			Static483.aClass187_1.method4859(256);
			Static52.anInt1508 = 20;
		} else if (Static52.anInt1508 == 20) {
			Static135.method2905(true);
			Static451.method3226(arg1, Static451.anInt3550, Static451.anInt3549);
			Static52.anInt1508 = 60;
			Static135.method2905(true);
			Static58.method1891();
		} else if (Static52.anInt1508 == 60) {
			if (Static451.aClass160_36.method4202(Static451.aClass1_Sub1_Sub12_2.aString45 + "_staticelements")) {
				if (!Static451.aClass160_36.method4219(Static451.aClass1_Sub1_Sub12_2.aString45 + "_staticelements")) {
					return;
				}
				Static451.aClass179_2 = Static355.method1723(Static451.aClass160_36, Static163.aBoolean222, Static451.aClass1_Sub1_Sub12_2.aString45 + "_staticelements");
			} else {
				Static451.aClass179_2 = new Class179(0);
			}
			Static451.method3230();
			Static52.anInt1508 = 70;
			Static135.method2905(true);
			Static58.method1891();
		} else if (Static52.anInt1508 == 70) {
			Static72.aClass210_1 = new Class210(arg1, 11, true, Static78.aCanvas7);
			Static52.anInt1508 = 73;
			Static135.method2905(true);
			Static58.method1891();
		} else if (Static52.anInt1508 == 73) {
			Static129.aClass210_2 = new Class210(arg1, 12, true, Static78.aCanvas7);
			Static52.anInt1508 = 76;
			Static135.method2905(true);
			Static58.method1891();
		} else if (Static52.anInt1508 == 76) {
			Static534.aClass210_7 = new Class210(arg1, 14, true, Static78.aCanvas7);
			Static52.anInt1508 = 79;
			Static135.method2905(true);
			Static58.method1891();
		} else if (Static52.anInt1508 == 79) {
			Static541.aClass210_8 = new Class210(arg1, 17, true, Static78.aCanvas7);
			Static52.anInt1508 = 82;
			Static135.method2905(true);
			Static58.method1891();
		} else if (Static52.anInt1508 == 82) {
			Static354.aClass210_5 = new Class210(arg1, 19, true, Static78.aCanvas7);
			Static52.anInt1508 = 85;
			Static135.method2905(true);
			Static58.method1891();
		} else if (Static52.anInt1508 == 85) {
			Static530.aClass210_6 = new Class210(arg1, 22, true, Static78.aCanvas7);
			Static52.anInt1508 = 88;
			Static135.method2905(true);
			Static58.method1891();
		} else if (Static52.anInt1508 == 88) {
			Static300.aClass210_4 = new Class210(arg1, 26, true, Static78.aCanvas7);
			Static52.anInt1508 = 91;
			Static135.method2905(true);
			Static58.method1891();
		} else {
			Static209.aClass210_3 = new Class210(arg1, 30, true, Static78.aCanvas7);
			Static52.anInt1508 = 100;
			Static135.method2905(true);
			Static58.method1891();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!cm", name = "a", descriptor = "(IZIII)V")
	public static void method1764(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static397.aLong182 = 0L;
		@Pc(8) int local8 = Static155.method3122();
		if (arg1 == 3 || local8 == 3) {
			arg0 = true;
		}
		if (!Static478.aClass9_10.method7620()) {
			arg0 = true;
		}
		Static215.method3853(arg0, arg1, arg3, local8, arg2);
	}
}
