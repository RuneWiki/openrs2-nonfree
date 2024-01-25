import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static530 {

	@OriginalMember(owner = "client!sr", name = "E", descriptor = "F")
	public static float aFloat192;

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!jm;ZII)V")
	public static void method7339(@OriginalArg(0) Class2_Sub2_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == null || arg0 == Static115.aClass109_11.aClass2_78) {
			return;
		}
		@Pc(15) int local15 = arg0.anInt4366;
		@Pc(18) int local18 = arg0.anInt4367;
		@Pc(21) int local21 = arg0.anInt4369;
		@Pc(25) int local25 = (int) arg0.aLong122;
		@Pc(28) long local28 = arg0.aLong122;
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(46) Class2_Sub43 local46;
		@Pc(61) Class13_Sub1_Sub1_Sub1_Sub1 local61;
		@Pc(68) Class2_Sub40 local68;
		if (local21 == 51) {
			local46 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local25);
			if (local46 != null) {
				Static28.anInt666 = 2;
				Static587.anInt9568 = 0;
				Static46.anInt970 = arg1;
				local61 = local46.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				Static597.anInt9683 = arg2;
				local68 = Static464.method6285(Static251.aClass131_1, Static176.aClass179_47);
				local68.aClass2_Sub22_Sub2_2.method8495(local25);
				local68.aClass2_Sub22_Sub2_2.method8515(Static16.aClass167_1.method3544(82) ? 1 : 0);
				Static528.method7295(local68);
				Static563.method7723(0, local61.method3950(), local61.anIntArray306[0], local61.method3950(), 0, true, local61.anIntArray307[0], -2);
			}
		}
		if (local21 == 10 || local21 == 1002) {
			Static139.method2125(local15, arg0.aString43, local25, local18);
		}
		@Pc(136) Class261 local136;
		if (local21 == 9) {
			local136 = Static98.method1508(local18, local15);
			if (local136 != null) {
				Static596.method8085(local136);
			}
		}
		@Pc(161) Class2_Sub40 local161;
		if (local21 == 57) {
			Static46.anInt970 = arg1;
			Static597.anInt9683 = arg2;
			Static28.anInt666 = 2;
			Static587.anInt9568 = 0;
			local161 = Static464.method6285(Static251.aClass131_1, Static532.aClass179_113);
			local161.aClass2_Sub22_Sub2_2.method8495(Static132.anInt2246 + local15);
			local161.aClass2_Sub22_Sub2_2.method8507((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local161.aClass2_Sub22_Sub2_2.method8537(Static16.aClass167_1.method3544(82) ? 1 : 0);
			local161.aClass2_Sub22_Sub2_2.method8495(local18 + Static123.anInt2176);
			Static528.method7295(local161);
			Static117.method1726(local15, local18, local28);
		}
		if (local21 == 59) {
			local46 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local25);
			if (local46 != null) {
				Static597.anInt9683 = arg2;
				Static587.anInt9568 = 0;
				Static28.anInt666 = 2;
				Static46.anInt970 = arg1;
				local61 = local46.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				local68 = Static464.method6285(Static251.aClass131_1, Static274.aClass179_59);
				local68.aClass2_Sub22_Sub2_2.method8541(Static16.aClass167_1.method3544(82) ? 1 : 0);
				local68.aClass2_Sub22_Sub2_2.method8528(local25);
				Static528.method7295(local68);
				Static563.method7723(0, local61.method3950(), local61.anIntArray306[0], local61.method3950(), 0, true, local61.anIntArray307[0], -2);
			}
		}
		if (local21 == 13) {
			Static597.anInt9683 = arg2;
			Static28.anInt666 = 2;
			Static46.anInt970 = arg1;
			Static587.anInt9568 = 0;
			local161 = Static464.method6285(Static251.aClass131_1, Static587.aClass179_125);
			local161.aClass2_Sub22_Sub2_2.method8528(Static132.anInt2246 + local15);
			local161.aClass2_Sub22_Sub2_2.method8507(local18 + Static123.anInt2176);
			local161.aClass2_Sub22_Sub2_2.method8500(local25);
			local161.aClass2_Sub22_Sub2_2.method8501(Static16.aClass167_1.method3544(82) ? 1 : 0);
			Static528.method7295(local161);
			Static253.method3517(local18, local15);
		}
		if (local21 == 46) {
			Static587.anInt9568 = 0;
			Static46.anInt970 = arg1;
			Static597.anInt9683 = arg2;
			Static28.anInt666 = 2;
			local161 = Static464.method6285(Static251.aClass131_1, Static449.aClass179_97);
			local161.aClass2_Sub22_Sub2_2.method8500(Integer.MAX_VALUE & (int) (local28 >>> 32));
			local161.aClass2_Sub22_Sub2_2.method8507(local18 + Static123.anInt2176);
			local161.aClass2_Sub22_Sub2_2.method8507(Static132.anInt2246 + local15);
			local161.aClass2_Sub22_Sub2_2.method8501(Static16.aClass167_1.method3544(82) ? 1 : 0);
			Static528.method7295(local161);
			Static117.method1726(local15, local18, local28);
		}
		@Pc(436) Class2_Sub40 local436;
		@Pc(417) Class13_Sub1_Sub1_Sub1_Sub2 local417;
		if (local21 == 60) {
			local417 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local417 != null) {
				Static46.anInt970 = arg1;
				Static597.anInt9683 = arg2;
				Static28.anInt666 = 2;
				Static587.anInt9568 = 0;
				local436 = Static464.method6285(Static251.aClass131_1, Static155.aClass179_37);
				local436.aClass2_Sub22_Sub2_2.method8537(Static16.aClass167_1.method3544(82) ? 1 : 0);
				local436.aClass2_Sub22_Sub2_2.method8507(local25);
				Static528.method7295(local436);
				Static563.method7723(0, local417.method3950(), local417.anIntArray306[0], local417.method3950(), 0, true, local417.anIntArray307[0], -2);
			}
		}
		if (local21 == 50) {
			local417 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local417 != null) {
				Static587.anInt9568 = 0;
				Static46.anInt970 = arg1;
				Static597.anInt9683 = arg2;
				Static28.anInt666 = 2;
				local436 = Static464.method6285(Static251.aClass131_1, Static586.aClass179_124);
				local436.aClass2_Sub22_Sub2_2.method8507(local25);
				local436.aClass2_Sub22_Sub2_2.method8537(Static16.aClass167_1.method3544(82) ? 1 : 0);
				Static528.method7295(local436);
				Static563.method7723(0, local417.method3950(), local417.anIntArray306[0], local417.method3950(), 0, true, local417.anIntArray307[0], -2);
			}
		}
		if (local21 == 22) {
			local417 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local417 != null) {
				Static46.anInt970 = arg1;
				Static587.anInt9568 = 0;
				Static28.anInt666 = 2;
				Static597.anInt9683 = arg2;
				local436 = Static464.method6285(Static251.aClass131_1, Static108.aClass179_25);
				local436.aClass2_Sub22_Sub2_2.method8515(Static16.aClass167_1.method3544(82) ? 1 : 0);
				local436.aClass2_Sub22_Sub2_2.method8528(local25);
				Static528.method7295(local436);
				Static563.method7723(0, local417.method3950(), local417.anIntArray306[0], local417.method3950(), 0, true, local417.anIntArray307[0], -2);
			}
		}
		if (local21 == 8) {
			local417 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local417 != null) {
				Static28.anInt666 = 2;
				Static46.anInt970 = arg1;
				Static587.anInt9568 = 0;
				Static597.anInt9683 = arg2;
				local436 = Static464.method6285(Static251.aClass131_1, Static268.aClass179_57);
				local436.aClass2_Sub22_Sub2_2.method8507(local25);
				local436.aClass2_Sub22_Sub2_2.method8501(Static16.aClass167_1.method3544(82) ? 1 : 0);
				Static528.method7295(local436);
				Static563.method7723(0, local417.method3950(), local417.anIntArray306[0], local417.method3950(), 0, true, local417.anIntArray307[0], -2);
			}
		}
		if (local21 == 12) {
			if (Static165.anInt5949 > 0 && Static16.aClass167_1.method3544(82) && Static16.aClass167_1.method3544(81)) {
				Static499.method6900(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, local15 + Static132.anInt2246, local18 + Static123.anInt2176);
			} else {
				local161 = Static467.method6314(local25, local15, local18);
				if (local25 == 1) {
					local161.aClass2_Sub22_Sub2_2.method8537(-1);
					local161.aClass2_Sub22_Sub2_2.method8537(-1);
					local161.aClass2_Sub22_Sub2_2.method8500((int) Static440.aFloat144);
					local161.aClass2_Sub22_Sub2_2.method8537(57);
					local161.aClass2_Sub22_Sub2_2.method8537(Static99.anInt7118);
					local161.aClass2_Sub22_Sub2_2.method8537(Static407.anInt9051);
					local161.aClass2_Sub22_Sub2_2.method8537(89);
					local161.aClass2_Sub22_Sub2_2.method8500(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10090);
					local161.aClass2_Sub22_Sub2_2.method8500(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt10089);
					local161.aClass2_Sub22_Sub2_2.method8537(63);
				} else {
					Static46.anInt970 = arg1;
					Static587.anInt9568 = 0;
					Static597.anInt9683 = arg2;
					Static28.anInt666 = 1;
				}
				Static528.method7295(local161);
				Static563.method7723(0, 1, local18, 1, 0, true, local15, -4);
			}
		}
		if (local21 == 16) {
			local46 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local25);
			if (local46 != null) {
				Static597.anInt9683 = arg2;
				Static587.anInt9568 = 0;
				Static28.anInt666 = 2;
				local61 = local46.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				Static46.anInt970 = arg1;
				local68 = Static464.method6285(Static251.aClass131_1, Static80.aClass179_16);
				local68.aClass2_Sub22_Sub2_2.method8507(local25);
				local68.aClass2_Sub22_Sub2_2.method8541(Static16.aClass167_1.method3544(82) ? 1 : 0);
				Static528.method7295(local68);
				Static563.method7723(0, local61.method3950(), local61.anIntArray306[0], local61.method3950(), 0, true, local61.anIntArray307[0], -2);
			}
		}
		if (local21 == 6) {
			Static28.anInt666 = 2;
			Static587.anInt9568 = 0;
			Static46.anInt970 = arg1;
			Static597.anInt9683 = arg2;
			local161 = Static464.method6285(Static251.aClass131_1, Static611.aClass179_127);
			local161.aClass2_Sub22_Sub2_2.method8500(local15 + Static132.anInt2246);
			local161.aClass2_Sub22_Sub2_2.method8528((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local161.aClass2_Sub22_Sub2_2.method8515(Static16.aClass167_1.method3544(82) ? 1 : 0);
			local161.aClass2_Sub22_Sub2_2.method8507(Static620.anInt9955);
			local161.aClass2_Sub22_Sub2_2.method8500(local18 + Static123.anInt2176);
			local161.aClass2_Sub22_Sub2_2.method8507(Static558.anInt9109);
			local161.aClass2_Sub22_Sub2_2.method8490(Static301.anInt4926);
			Static528.method7295(local161);
			Static117.method1726(local15, local18, local28);
		}
		if (local21 == 30) {
			Static46.anInt970 = arg1;
			Static587.anInt9568 = 0;
			Static597.anInt9683 = arg2;
			Static28.anInt666 = 2;
			local161 = Static464.method6285(Static251.aClass131_1, Static75.aClass179_15);
			local161.aClass2_Sub22_Sub2_2.method8537(Static16.aClass167_1.method3544(82) ? 1 : 0);
			local161.aClass2_Sub22_Sub2_2.method8495(local18 + Static123.anInt2176);
			local161.aClass2_Sub22_Sub2_2.method8507(Static132.anInt2246 + local15);
			local161.aClass2_Sub22_Sub2_2.method8495(local25);
			Static528.method7295(local161);
			Static253.method3517(local18, local15);
		}
		if (local21 == 18) {
			local417 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local417 != null) {
				Static46.anInt970 = arg1;
				Static597.anInt9683 = arg2;
				Static28.anInt666 = 2;
				Static587.anInt9568 = 0;
				local436 = Static464.method6285(Static251.aClass131_1, Static200.aClass179_50);
				local436.aClass2_Sub22_Sub2_2.method8537(Static16.aClass167_1.method3544(82) ? 1 : 0);
				local436.aClass2_Sub22_Sub2_2.method8528(local25);
				Static528.method7295(local436);
				Static563.method7723(0, local417.method3950(), local417.anIntArray306[0], local417.method3950(), 0, true, local417.anIntArray307[0], -2);
			}
		}
		if (local21 == 1004) {
			Static28.anInt666 = 2;
			Static597.anInt9683 = arg2;
			Static46.anInt970 = arg1;
			Static587.anInt9568 = 0;
			local161 = Static464.method6285(Static251.aClass131_1, Static130.aClass179_29);
			local161.aClass2_Sub22_Sub2_2.method8500(local25);
			Static528.method7295(local161);
		}
		if (local21 == 25) {
			Static46.anInt970 = arg1;
			Static28.anInt666 = 2;
			Static597.anInt9683 = arg2;
			Static587.anInt9568 = 0;
			local161 = Static464.method6285(Static251.aClass131_1, Static317.aClass179_64);
			local161.aClass2_Sub22_Sub2_2.method8500(local25);
			local161.aClass2_Sub22_Sub2_2.method8507(local18 + Static123.anInt2176);
			local161.aClass2_Sub22_Sub2_2.method8515(Static16.aClass167_1.method3544(82) ? 1 : 0);
			local161.aClass2_Sub22_Sub2_2.method8507(Static132.anInt2246 + local15);
			Static528.method7295(local161);
			Static253.method3517(local18, local15);
		}
		if (local21 == 19) {
			local46 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local25);
			if (local46 != null) {
				Static46.anInt970 = arg1;
				local61 = local46.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				Static597.anInt9683 = arg2;
				Static28.anInt666 = 2;
				Static587.anInt9568 = 0;
				local68 = Static464.method6285(Static251.aClass131_1, Static217.aClass179_51);
				local68.aClass2_Sub22_Sub2_2.method8528(local25);
				local68.aClass2_Sub22_Sub2_2.method8515(Static16.aClass167_1.method3544(82) ? 1 : 0);
				Static528.method7295(local68);
				Static563.method7723(0, local61.method3950(), local61.anIntArray306[0], local61.method3950(), 0, true, local61.anIntArray307[0], -2);
			}
		}
		if (local21 == 2) {
			Static597.anInt9683 = arg2;
			Static46.anInt970 = arg1;
			Static28.anInt666 = 2;
			Static587.anInt9568 = 0;
			local161 = Static464.method6285(Static251.aClass131_1, Static10.aClass179_1);
			local161.aClass2_Sub22_Sub2_2.method8515(Static16.aClass167_1.method3544(82) ? 1 : 0);
			local161.aClass2_Sub22_Sub2_2.method8500(Static132.anInt2246 + local15);
			local161.aClass2_Sub22_Sub2_2.method8500(Static123.anInt2176 + local18);
			local161.aClass2_Sub22_Sub2_2.method8495(local25);
			Static528.method7295(local161);
			Static253.method3517(local18, local15);
		}
		if (local21 == 1001) {
			Static28.anInt666 = 2;
			Static46.anInt970 = arg1;
			Static597.anInt9683 = arg2;
			Static587.anInt9568 = 0;
			local161 = Static464.method6285(Static251.aClass131_1, Static195.aClass179_49);
			local161.aClass2_Sub22_Sub2_2.method8500(local25);
			Static528.method7295(local161);
		}
		if (local21 == 1011) {
			Static46.anInt970 = arg1;
			Static28.anInt666 = 2;
			Static597.anInt9683 = arg2;
			Static587.anInt9568 = 0;
			local46 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local25);
			if (local46 != null) {
				local61 = local46.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				@Pc(1381) Class150 local1381 = local61.aClass150_1;
				if (local1381.anIntArray262 != null) {
					local1381 = local1381.method3196(Static431.aClass205_1);
				}
				if (local1381 != null) {
					@Pc(1400) Class2_Sub40 local1400 = Static464.method6285(Static251.aClass131_1, Static284.aClass179_60);
					local1400.aClass2_Sub22_Sub2_2.method8500(local1381.anInt3816);
					Static528.method7295(local1400);
				}
			}
		}
		if (local21 == 45) {
			Static46.anInt970 = arg1;
			Static587.anInt9568 = 0;
			Static28.anInt666 = 2;
			Static597.anInt9683 = arg2;
			local161 = Static464.method6285(Static251.aClass131_1, Static56.aClass179_68);
			local161.aClass2_Sub22_Sub2_2.method8528(local15 + Static132.anInt2246);
			local161.aClass2_Sub22_Sub2_2.method8515(Static16.aClass167_1.method3544(82) ? 1 : 0);
			local161.aClass2_Sub22_Sub2_2.method8528((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local161.aClass2_Sub22_Sub2_2.method8507(local18 + Static123.anInt2176);
			Static528.method7295(local161);
			Static117.method1726(local15, local18, local28);
		}
		if (local21 == 48) {
			if (Static165.anInt5949 > 0 && Static16.aClass167_1.method3544(82) && Static16.aClass167_1.method3544(81)) {
				Static499.method6900(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127, local15 + Static132.anInt2246, local18 + Static123.anInt2176);
			} else {
				Static46.anInt970 = arg1;
				Static597.anInt9683 = arg2;
				Static587.anInt9568 = 0;
				Static28.anInt666 = 1;
				local161 = Static464.method6285(Static251.aClass131_1, Static565.aClass179_116);
				local161.aClass2_Sub22_Sub2_2.method8500(local15 + Static132.anInt2246);
				local161.aClass2_Sub22_Sub2_2.method8500(Static123.anInt2176 + local18);
				Static528.method7295(local161);
			}
		}
		if (local21 == 1007 || local21 == 1012 || local21 == 1006 || local21 == 1003 || local21 == 1010) {
			Static591.method8031(local15, local25, local21);
		}
		if (local21 == 21) {
			local417 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local417 != null) {
				Static28.anInt666 = 2;
				Static597.anInt9683 = arg2;
				Static587.anInt9568 = 0;
				Static46.anInt970 = arg1;
				local436 = Static464.method6285(Static251.aClass131_1, Static262.aClass179_72);
				local436.aClass2_Sub22_Sub2_2.method8515(Static16.aClass167_1.method3544(82) ? 1 : 0);
				local436.aClass2_Sub22_Sub2_2.method8500(local25);
				Static528.method7295(local436);
				Static563.method7723(0, local417.method3950(), local417.anIntArray306[0], local417.method3950(), 0, true, local417.anIntArray307[0], -2);
			}
		}
		if (local21 == 3) {
			Static597.anInt9683 = arg2;
			Static46.anInt970 = arg1;
			Static28.anInt666 = 2;
			Static587.anInt9568 = 0;
			local161 = Static464.method6285(Static251.aClass131_1, Static432.aClass179_96);
			local161.aClass2_Sub22_Sub2_2.method8541(Static16.aClass167_1.method3544(82) ? 1 : 0);
			local161.aClass2_Sub22_Sub2_2.method8528(local25);
			local161.aClass2_Sub22_Sub2_2.method8507(Static123.anInt2176 + local18);
			local161.aClass2_Sub22_Sub2_2.method8528(Static132.anInt2246 + local15);
			Static528.method7295(local161);
			Static253.method3517(local18, local15);
		}
		if (local21 == 11) {
			local46 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local25);
			if (local46 != null) {
				Static587.anInt9568 = 0;
				local61 = local46.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				Static597.anInt9683 = arg2;
				Static46.anInt970 = arg1;
				Static28.anInt666 = 2;
				local68 = Static464.method6285(Static251.aClass131_1, Static564.aClass179_115);
				local68.aClass2_Sub22_Sub2_2.method8541(Static16.aClass167_1.method3544(82) ? 1 : 0);
				local68.aClass2_Sub22_Sub2_2.method8528(local25);
				Static528.method7295(local68);
				Static563.method7723(0, local61.method3950(), local61.anIntArray306[0], local61.method3950(), 0, true, local61.anIntArray307[0], -2);
			}
		}
		if (local21 == 44) {
			Static46.anInt970 = arg1;
			Static587.anInt9568 = 0;
			Static28.anInt666 = 2;
			Static597.anInt9683 = arg2;
			local161 = Static464.method6285(Static251.aClass131_1, Static499.aClass179_106);
			local161.aClass2_Sub22_Sub2_2.method8537(Static16.aClass167_1.method3544(82) ? 1 : 0);
			local161.aClass2_Sub22_Sub2_2.method8528((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local161.aClass2_Sub22_Sub2_2.method8507(Static132.anInt2246 + local15);
			local161.aClass2_Sub22_Sub2_2.method8507(Static123.anInt2176 + local18);
			Static528.method7295(local161);
			Static117.method1726(local15, local18, local28);
		}
		if (local21 == 15 && Static11.aClass261_1 == null) {
			Static190.method2760(local18, local15);
			Static11.aClass261_1 = Static98.method1508(local18, local15);
			Static624.method8351(Static11.aClass261_1);
		}
		if (local21 == 49) {
			Static28.anInt666 = 2;
			Static46.anInt970 = arg1;
			Static597.anInt9683 = arg2;
			Static587.anInt9568 = 0;
			local161 = Static464.method6285(Static251.aClass131_1, Static163.aClass179_41);
			local161.aClass2_Sub22_Sub2_2.method8490(Static301.anInt4926);
			local161.aClass2_Sub22_Sub2_2.method8495(Static620.anInt9955);
			local161.aClass2_Sub22_Sub2_2.method8501(Static16.aClass167_1.method3544(82) ? 1 : 0);
			local161.aClass2_Sub22_Sub2_2.method8495(Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.anInt4582);
			local161.aClass2_Sub22_Sub2_2.method8495(Static558.anInt9109);
			Static528.method7295(local161);
		}
		if (local21 == 23) {
			local417 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local417 != null) {
				Static587.anInt9568 = 0;
				Static597.anInt9683 = arg2;
				Static28.anInt666 = 2;
				Static46.anInt970 = arg1;
				local436 = Static464.method6285(Static251.aClass131_1, Static30.aClass179_9);
				local436.aClass2_Sub22_Sub2_2.method8528(local25);
				local436.aClass2_Sub22_Sub2_2.method8541(Static16.aClass167_1.method3544(82) ? 1 : 0);
				Static528.method7295(local436);
				Static563.method7723(0, local417.method3950(), local417.anIntArray306[0], local417.method3950(), 0, true, local417.anIntArray307[0], -2);
			}
		}
		if (local21 == 1008) {
			Static46.anInt970 = arg1;
			Static587.anInt9568 = 0;
			Static28.anInt666 = 2;
			Static597.anInt9683 = arg2;
			local161 = Static464.method6285(Static251.aClass131_1, Static198.aClass179_107);
			local161.aClass2_Sub22_Sub2_2.method8500(Static123.anInt2176 + local18);
			local161.aClass2_Sub22_Sub2_2.method8528((int) (local28 >>> 32) & Integer.MAX_VALUE);
			local161.aClass2_Sub22_Sub2_2.method8507(Static132.anInt2246 + local15);
			local161.aClass2_Sub22_Sub2_2.method8537(Static16.aClass167_1.method3544(82) ? 1 : 0);
			Static528.method7295(local161);
			Static117.method1726(local15, local18, local28);
		}
		if (local21 == 5) {
			local136 = Static98.method1508(local18, local15);
			if (local136 != null) {
				Static618.method8289();
				@Pc(2060) Class2_Sub41 local2060 = Static76.method1071(local136);
				Static404.method5471(local2060.method6880(), local136, local2060.anInt8112);
				Static577.aString105 = Static91.method1438(local136);
				Static90.aString16 = local136.aString90 + "<col=ffffff>";
				if (Static577.aString105 == null) {
					Static577.aString105 = "Null";
				}
			}
			return;
		}
		if (local21 == 47) {
			Static587.anInt9568 = 0;
			Static46.anInt970 = arg1;
			Static28.anInt666 = 2;
			Static597.anInt9683 = arg2;
			local161 = Static464.method6285(Static251.aClass131_1, Static430.aClass179_108);
			local161.aClass2_Sub22_Sub2_2.method8537(Static16.aClass167_1.method3544(82) ? 1 : 0);
			local161.aClass2_Sub22_Sub2_2.method8495(Static132.anInt2246 + local15);
			local161.aClass2_Sub22_Sub2_2.method8500(Static620.anInt9955);
			local161.aClass2_Sub22_Sub2_2.method8495(Static558.anInt9109);
			local161.aClass2_Sub22_Sub2_2.method8528(local25);
			local161.aClass2_Sub22_Sub2_2.method8495(Static123.anInt2176 + local18);
			local161.aClass2_Sub22_Sub2_2.method8524(Static301.anInt4926);
			Static528.method7295(local161);
			Static253.method3517(local18, local15);
		}
		if (local21 == 4) {
			Static587.anInt9568 = 0;
			Static28.anInt666 = 1;
			Static46.anInt970 = arg1;
			Static597.anInt9683 = arg2;
			local161 = Static464.method6285(Static251.aClass131_1, Static476.aClass179_100);
			local161.aClass2_Sub22_Sub2_2.method8507(Static558.anInt9109);
			local161.aClass2_Sub22_Sub2_2.method8500(local18 + Static123.anInt2176);
			local161.aClass2_Sub22_Sub2_2.method8507(local15 + Static132.anInt2246);
			local161.aClass2_Sub22_Sub2_2.method8552(Static301.anInt4926);
			local161.aClass2_Sub22_Sub2_2.method8528(Static620.anInt9955);
			Static528.method7295(local161);
			Static563.method7723(0, 1, local18, 1, 0, true, local15, -4);
		}
		if (local21 == 20) {
			local46 = (Class2_Sub43) Static440.aClass118_41.method2595((long) local25);
			if (local46 != null) {
				Static597.anInt9683 = arg2;
				local61 = local46.aClass13_Sub1_Sub1_Sub1_Sub1_2;
				Static28.anInt666 = 2;
				Static46.anInt970 = arg1;
				Static587.anInt9568 = 0;
				local68 = Static464.method6285(Static251.aClass131_1, Static140.aClass179_34);
				local68.aClass2_Sub22_Sub2_2.method8528(Static558.anInt9109);
				local68.aClass2_Sub22_Sub2_2.method8495(local25);
				local68.aClass2_Sub22_Sub2_2.method8501(Static16.aClass167_1.method3544(82) ? 1 : 0);
				local68.aClass2_Sub22_Sub2_2.method8505(Static301.anInt4926);
				local68.aClass2_Sub22_Sub2_2.method8507(Static620.anInt9955);
				Static528.method7295(local68);
				Static563.method7723(0, local61.method3950(), local61.anIntArray306[0], local61.method3950(), 0, true, local61.anIntArray307[0], -2);
			}
		}
		if (local21 == 58) {
			local417 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local417 != null) {
				Static46.anInt970 = arg1;
				Static597.anInt9683 = arg2;
				Static28.anInt666 = 2;
				Static587.anInt9568 = 0;
				local436 = Static464.method6285(Static251.aClass131_1, Static431.aClass179_95);
				local436.aClass2_Sub22_Sub2_2.method8507(local25);
				local436.aClass2_Sub22_Sub2_2.method8541(Static16.aClass167_1.method3544(82) ? 1 : 0);
				Static528.method7295(local436);
				Static563.method7723(0, local417.method3950(), local417.anIntArray306[0], local417.method3950(), 0, true, local417.anIntArray307[0], -2);
			}
		}
		if (local21 == 17) {
			local417 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local25];
			if (local417 != null) {
				Static587.anInt9568 = 0;
				Static46.anInt970 = arg1;
				Static597.anInt9683 = arg2;
				Static28.anInt666 = 2;
				local436 = Static464.method6285(Static251.aClass131_1, Static163.aClass179_41);
				local436.aClass2_Sub22_Sub2_2.method8490(Static301.anInt4926);
				local436.aClass2_Sub22_Sub2_2.method8495(Static620.anInt9955);
				local436.aClass2_Sub22_Sub2_2.method8501(Static16.aClass167_1.method3544(82) ? 1 : 0);
				local436.aClass2_Sub22_Sub2_2.method8495(local25);
				local436.aClass2_Sub22_Sub2_2.method8495(Static558.anInt9109);
				Static528.method7295(local436);
				Static563.method7723(0, local417.method3950(), local417.anIntArray306[0], local417.method3950(), 0, true, local417.anIntArray307[0], -2);
			}
		}
		if (Static8.aBoolean11) {
			Static618.method8289();
		}
		if (Static338.aClass261_6 != null && Static254.anInt4048 == 0) {
			Static624.method8351(Static338.aClass261_6);
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ZIIIIFII)[I")
	public static int[] method7340(@OriginalArg(5) float arg0) {
		@Pc(6) int[] local6 = new int[2048];
		@Pc(10) Class2_Sub6_Sub27 local10 = new Class2_Sub6_Sub27();
		local10.anInt8031 = 4;
		local10.anInt8025 = (int) (arg0 * 4096.0F);
		local10.aBoolean601 = true;
		local10.anInt8029 = 35;
		local10.anInt8023 = 8;
		local10.anInt8034 = 8;
		local10.method8462();
		Static110.method1644(2048, 1);
		local10.method6811(0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!sr", name = "g", descriptor = "(B)V")
	public static void method7341() {
		if (Static402.anInt6305 < 0) {
			return;
		}
		@Pc(9) long local9 = Static476.method6413();
		Static402.anInt6305 = (int) ((long) Static402.anInt6305 + Static42.aLong161 - local9);
		if (Static402.anInt6305 <= 0) {
			Static471.aFloat150 = Static206.aClass350_1.aFloat207;
			Static386.aClass12_2 = Static206.aClass350_1.aClass12_3;
			Static258.aFloat70 = Static206.aClass350_1.aFloat208;
			Static402.anInt6305 = -1;
			Static137.aFloat24 = Static206.aClass350_1.aFloat209;
			Class13_Sub1_Sub1_Sub4.lb = Static206.aClass350_1.anInt9408;
			Static519.anInt8614 = Static206.aClass350_1.anInt9397;
			Static134.aFloat23 = Static206.aClass350_1.aFloat212;
			Static410.aFloat117 = Static206.aClass350_1.aFloat210;
			Static332.aFloat97 = Static206.aClass350_1.aFloat211;
			Static115.anInt2102 = Static206.aClass350_1.anInt9399;
		} else {
			@Pc(63) int local63 = (Static402.anInt6305 << 8) / Static329.anInt5227;
			@Pc(68) int local68 = 255 - local63;
			@Pc(73) float local73 = (float) local63 / 255.0F;
			@Pc(77) float local77 = 1.0F - local73;
			Class13_Sub1_Sub1_Sub4.lb = (local68 * (Static206.aClass350_1.anInt9408 & 0xFF00) + (Static32.anInt717 & 0xFF00) * local63 & 0xFF0000) + ((Static206.aClass350_1.anInt9408 & 0xFF00FF) * local68 + local63 * (Static32.anInt717 & 0xFF00FF) & 0xFF00FF00) >>> 8;
			Static471.aFloat150 = (Static206.aClass350_1.aFloat207 - Static20.aFloat7) * local77 + Static20.aFloat7;
			Static410.aFloat117 = (Static206.aClass350_1.aFloat210 - Static267.aFloat71) * local77 + Static267.aFloat71;
			Static332.aFloat97 = (Static206.aClass350_1.aFloat211 - Static474.aFloat152) * local77 + Static474.aFloat152;
			Static258.aFloat70 = aFloat192 + local77 * (Static206.aClass350_1.aFloat208 - aFloat192);
			Static519.anInt8614 = ((Static206.aClass350_1.anInt9397 & 0xFF00FF) * local68 + (Static507.anInt8390 & 0xFF00FF) * local63 & 0xFF00FF00) + ((Static206.aClass350_1.anInt9397 & 0xFF00) * local68 + (Static507.anInt8390 & 0xFF00) * local63 & 0xFF0000) >>> 8;
			Static134.aFloat23 = (Static206.aClass350_1.aFloat212 - Static87.aFloat17) * local77 + Static87.aFloat17;
			Static115.anInt2102 = local68 * Static206.aClass350_1.anInt9399 + Static308.anInt4977 * local63 >> 8;
			Static137.aFloat24 = local77 * (Static206.aClass350_1.aFloat209 - Static392.aFloat116) + Static392.aFloat116;
			if (Static324.aClass12_1 != Static206.aClass350_1.aClass12_3) {
				Static386.aClass12_2 = Static566.aClass95_14.method6974(Static324.aClass12_1, Static206.aClass350_1.aClass12_3, local77, Static386.aClass12_2);
			}
		}
		Static42.aLong161 = local9;
	}
}
