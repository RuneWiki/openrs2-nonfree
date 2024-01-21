import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!hh", name = "Y", descriptor = "Lclient!u;")
	public static Class76 aClass76_62;

	@OriginalMember(owner = "client!hh", name = "ib", descriptor = "[Lclient!rh;")
	public static Class1_Sub1_Sub1_Sub4[] aClass1_Sub1_Sub1_Sub4Array3;

	@OriginalMember(owner = "client!hh", name = "eb", descriptor = "[I")
	public static int[] anIntArray211 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!hh", name = "hb", descriptor = "I")
	public static int anInt2223 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lclient!ig;I)V")
	public static void method1640(@OriginalArg(0) Class39 arg0) {
		@Pc(2) int local2 = arg0.anInt2381;
		if (local2 == 324) {
			if (Static136.anInt3557 == -1) {
				Static140.anInt3676 = arg0.anInt2349;
				Static136.anInt3557 = arg0.anInt2330;
			}
			if (Static101.aClass49_2.aBoolean123) {
				arg0.anInt2330 = Static136.anInt3557;
			} else {
				arg0.anInt2330 = Static140.anInt3676;
			}
		} else if (local2 == 325) {
			if (Static136.anInt3557 == -1) {
				Static136.anInt3557 = arg0.anInt2330;
				Static140.anInt3676 = arg0.anInt2349;
			}
			if (Static101.aClass49_2.aBoolean123) {
				arg0.anInt2330 = Static140.anInt3676;
			} else {
				arg0.anInt2330 = Static136.anInt3557;
			}
		} else if (local2 == 327) {
			arg0.anInt2336 = 150;
			arg0.anInt2334 = (int) (Math.sin((double) Static47.anInt1654 / 40.0D) * 256.0D) & 0x7FF;
			arg0.anInt2358 = -1;
			arg0.anInt2370 = 5;
		} else if (local2 == 328) {
			if (Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass70_408 == null) {
				arg0.anInt2358 = 0;
			} else {
				arg0.anInt2336 = 150;
				arg0.anInt2334 = (int) (Math.sin((double) Static47.anInt1654 / 40.0D) * 256.0D) & 0x7FF;
				arg0.anInt2370 = 5;
				arg0.anInt2358 = ((int) Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.aClass70_408.method2925() << 11) + 2047;
				arg0.anInt2357 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2009;
				arg0.anInt2378 = Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anInt2020;
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(BILclient!rf;ZLclient!u;Lclient!rf;)V")
	public static void method1641(@OriginalArg(2) Class70 arg0, @OriginalArg(4) Class76 arg1, @OriginalArg(5) Class70 arg2) {
		@Pc(13) int local13 = arg1.method3309(arg0);
		@Pc(19) int local19 = arg1.method3312(arg2, local13);
		Static34.method876(255, arg1, local19, local13);
	}

	@OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)V")
	public static void method1642(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(13) int local13 = Static170.anIntArray420[arg0];
		@Pc(17) int local17 = Static80.anIntArray241[arg0];
		@Pc(21) int local21 = Static20.aShortArray7[arg0];
		if (local21 >= 2000) {
			local21 -= 2000;
		}
		@Pc(29) long local29 = Static166.aLongArray9[arg0];
		@Pc(34) int local34 = (int) Static166.aLongArray9[arg0];
		@Pc(41) Class1_Sub1_Sub4_Sub2_Sub2 local41;
		if (local21 == 46) {
			local41 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local34];
			if (local41 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local41.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local41.anIntArray199[0], 0, 1, false);
				Static115.anInt3162 = 2;
				Static107.anInt3036 = Static170.anInt4392;
				Static100.anInt2853 = 0;
				Static126.anInt822 = Static15.anInt450;
				Static131.aClass1_Sub9_Sub1_3.method1283(54);
				Static131.aClass1_Sub9_Sub1_3.method1236(local34);
			}
		}
		if (local21 == 25) {
			Static131.aClass1_Sub9_Sub1_3.method1283(174);
			Static131.aClass1_Sub9_Sub1_3.method1251(local13);
			Static131.aClass1_Sub9_Sub1_3.method1254(Static123.anInt3344);
			Static131.aClass1_Sub9_Sub1_3.method1259(Static168.anInt2253);
			Static131.aClass1_Sub9_Sub1_3.method1264(local17);
			Static131.aClass1_Sub9_Sub1_3.method1236(local34);
			Static131.aClass1_Sub9_Sub1_3.method1251(Static8.anInt286);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 24) {
			Static133.method2573(local13, local17, local29);
			Static131.aClass1_Sub9_Sub1_3.method1283(60);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static154.anInt4068 + local13);
			Static131.aClass1_Sub9_Sub1_3.method1236((int) (local29 >>> 32) & Integer.MAX_VALUE);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static64.anInt987 + local17);
		}
		if (local21 == 5) {
			Static117.method2401(Static56.anInt1784, local13, local17);
		}
		if (local21 == 33) {
			Static133.method2573(local13, local17, local29);
			Static131.aClass1_Sub9_Sub1_3.method1283(8);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static154.anInt4068 + local13);
			Static131.aClass1_Sub9_Sub1_3.method1245((int) (local29 >>> 32) & Integer.MAX_VALUE);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static64.anInt987 + local17);
		}
		if (local21 == 44) {
			Static131.aClass1_Sub9_Sub1_3.method1283(172);
			Static131.aClass1_Sub9_Sub1_3.method1236(local34);
			Static131.aClass1_Sub9_Sub1_3.method1231(local17);
			Static131.aClass1_Sub9_Sub1_3.method1254(local13);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		@Pc(281) boolean local281;
		if (local21 == 4) {
			local281 = Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 0, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 0, false);
			if (!local281) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 1, false);
			}
			Static115.anInt3162 = 2;
			Static107.anInt3036 = Static170.anInt4392;
			Static126.anInt822 = Static15.anInt450;
			Static100.anInt2853 = 0;
			Static131.aClass1_Sub9_Sub1_3.method1283(141);
			Static131.aClass1_Sub9_Sub1_3.method1245(local34);
			Static131.aClass1_Sub9_Sub1_3.method1251(local13 + Static154.anInt4068);
			Static131.aClass1_Sub9_Sub1_3.method1254(local17 + Static64.anInt987);
		}
		if (local21 == 30) {
			Static131.aClass1_Sub9_Sub1_3.method1283(79);
			Static131.aClass1_Sub9_Sub1_3.method1236(local13);
			Static131.aClass1_Sub9_Sub1_3.method1251(local34);
			Static131.aClass1_Sub9_Sub1_3.method1264(local17);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 16) {
			local281 = Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 0, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 0, false);
			if (!local281) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 1, false);
			}
			Static100.anInt2853 = 0;
			Static126.anInt822 = Static15.anInt450;
			Static115.anInt3162 = 2;
			Static107.anInt3036 = Static170.anInt4392;
			Static131.aClass1_Sub9_Sub1_3.method1283(19);
			Static131.aClass1_Sub9_Sub1_3.method1251(local17 + Static64.anInt987);
			Static131.aClass1_Sub9_Sub1_3.method1254(local13 + Static154.anInt4068);
			Static131.aClass1_Sub9_Sub1_3.method1254(local34);
		}
		@Pc(453) Class1_Sub1_Sub4_Sub2_Sub1 local453;
		if (local21 == 29) {
			local453 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34];
			if (local453 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local453.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local453.anIntArray199[0], 0, 1, false);
				Static100.anInt2853 = 0;
				Static107.anInt3036 = Static170.anInt4392;
				Static115.anInt3162 = 2;
				Static126.anInt822 = Static15.anInt450;
				Static131.aClass1_Sub9_Sub1_3.method1283(20);
				Static131.aClass1_Sub9_Sub1_3.method1245(local34);
			}
		}
		@Pc(510) Class39 local510;
		if (local21 == 1001) {
			local510 = Static128.method3227(local17);
			if (local510 == null || local510.anIntArray231[local13] < 100000) {
				Static131.aClass1_Sub9_Sub1_3.method1283(139);
				Static131.aClass1_Sub9_Sub1_3.method1251(local34);
			} else {
				Static41.method1036(Static160.method3210(new Class70[] { Static34.method873(local510.anIntArray231[local13]), Static140.aClass70_1243, Static90.method1963(local34).aClass70_49 }), Static35.aClass70_632, 0);
			}
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 10) {
			Static131.aClass1_Sub9_Sub1_3.method1283(41);
			Static131.aClass1_Sub9_Sub1_3.method1259(local17);
			Static131.aClass1_Sub9_Sub1_3.method1251(local13);
			Static131.aClass1_Sub9_Sub1_3.method1236(local34);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 19) {
			local41 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local34];
			if (local41 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local41.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local41.anIntArray199[0], 0, 1, false);
				Static126.anInt822 = Static15.anInt450;
				Static107.anInt3036 = Static170.anInt4392;
				Static115.anInt3162 = 2;
				Static100.anInt2853 = 0;
				Static131.aClass1_Sub9_Sub1_3.method1283(100);
				Static131.aClass1_Sub9_Sub1_3.method1245(Static110.anInt3092);
				Static131.aClass1_Sub9_Sub1_3.method1259(Static161.anInt4210);
				Static131.aClass1_Sub9_Sub1_3.method1245(local34);
			}
		}
		if (local21 == 43) {
			local453 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34];
			if (local453 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local453.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local453.anIntArray199[0], 0, 1, false);
				Static126.anInt822 = Static15.anInt450;
				Static100.anInt2853 = 0;
				Static115.anInt3162 = 2;
				Static107.anInt3036 = Static170.anInt4392;
				Static131.aClass1_Sub9_Sub1_3.method1283(144);
				Static131.aClass1_Sub9_Sub1_3.method1276(Static168.anInt2253);
				Static131.aClass1_Sub9_Sub1_3.method1251(Static123.anInt3344);
				Static131.aClass1_Sub9_Sub1_3.method1236(local34);
				Static131.aClass1_Sub9_Sub1_3.method1254(Static8.anInt286);
			}
		}
		if (local21 == 15) {
			local41 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local34];
			if (local41 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local41.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local41.anIntArray199[0], 0, 1, false);
				Static100.anInt2853 = 0;
				Static126.anInt822 = Static15.anInt450;
				Static107.anInt3036 = Static170.anInt4392;
				Static115.anInt3162 = 2;
				Static131.aClass1_Sub9_Sub1_3.method1283(201);
				Static131.aClass1_Sub9_Sub1_3.method1251(local34);
			}
		}
		if (local21 == 34) {
			Static133.method2573(local13, local17, local29);
			Static131.aClass1_Sub9_Sub1_3.method1283(39);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static154.anInt4068 + local13);
			Static131.aClass1_Sub9_Sub1_3.method1254((int) (local29 >>> 32) & Integer.MAX_VALUE);
			Static131.aClass1_Sub9_Sub1_3.method1236(Static64.anInt987 + local17);
		}
		if (local21 == 39) {
			Static131.aClass1_Sub9_Sub1_3.method1283(63);
			Static131.aClass1_Sub9_Sub1_3.method1245(local34);
			Static131.aClass1_Sub9_Sub1_3.method1259(local17);
			Static131.aClass1_Sub9_Sub1_3.method1245(local13);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 23) {
			local453 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34];
			if (local453 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local453.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local453.anIntArray199[0], 0, 1, false);
				Static126.anInt822 = Static15.anInt450;
				Static107.anInt3036 = Static170.anInt4392;
				Static100.anInt2853 = 0;
				Static115.anInt3162 = 2;
				Static131.aClass1_Sub9_Sub1_3.method1283(210);
				Static131.aClass1_Sub9_Sub1_3.method1245(local34);
			}
		}
		if (local21 == 35) {
			local453 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34];
			if (local453 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local453.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local453.anIntArray199[0], 0, 1, false);
				Static107.anInt3036 = Static170.anInt4392;
				Static126.anInt822 = Static15.anInt450;
				Static100.anInt2853 = 0;
				Static115.anInt3162 = 2;
				Static131.aClass1_Sub9_Sub1_3.method1283(80);
				Static131.aClass1_Sub9_Sub1_3.method1236(local34);
			}
		}
		if (local21 == 28) {
			local453 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34];
			if (local453 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local453.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local453.anIntArray199[0], 0, 1, false);
				Static115.anInt3162 = 2;
				Static126.anInt822 = Static15.anInt450;
				Static107.anInt3036 = Static170.anInt4392;
				Static100.anInt2853 = 0;
				Static131.aClass1_Sub9_Sub1_3.method1283(180);
				Static131.aClass1_Sub9_Sub1_3.method1236(local34);
			}
		}
		if (local21 == 40) {
			local453 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34];
			if (local453 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local453.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local453.anIntArray199[0], 0, 1, false);
				Static115.anInt3162 = 2;
				Static100.anInt2853 = 0;
				Static126.anInt822 = Static15.anInt450;
				Static107.anInt3036 = Static170.anInt4392;
				Static131.aClass1_Sub9_Sub1_3.method1283(163);
				Static131.aClass1_Sub9_Sub1_3.method1251(local34);
			}
		}
		if (local21 == 1007) {
			Static133.method2573(local13, local17, local29);
			Static131.aClass1_Sub9_Sub1_3.method1283(5);
			Static131.aClass1_Sub9_Sub1_3.method1245(Integer.MAX_VALUE & (int) (local29 >>> 32));
			Static131.aClass1_Sub9_Sub1_3.method1251(Static64.anInt987 + local17);
			Static131.aClass1_Sub9_Sub1_3.method1236(local13 + Static154.anInt4068);
		}
		if (local21 == 22) {
			Static131.aClass1_Sub9_Sub1_3.method1283(228);
			Static131.aClass1_Sub9_Sub1_3.method1236(local13);
			Static131.aClass1_Sub9_Sub1_3.method1276(local17);
			Static131.aClass1_Sub9_Sub1_3.method1251(local34);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 42) {
			Static131.aClass1_Sub9_Sub1_3.method1283(93);
			Static131.aClass1_Sub9_Sub1_3.method1276(local17);
			Static131.aClass1_Sub9_Sub1_3.method1245(local13);
			Static131.aClass1_Sub9_Sub1_3.method1251(local34);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 47 || local21 == 1003) {
			Static47.method1282(local17, Static174.aClass70Array23[arg0], local34, local13);
		}
		if (local21 == 38) {
			local281 = Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 0, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 0, false);
			if (!local281) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 1, false);
			}
			Static115.anInt3162 = 2;
			Static107.anInt3036 = Static170.anInt4392;
			Static126.anInt822 = Static15.anInt450;
			Static100.anInt2853 = 0;
			Static131.aClass1_Sub9_Sub1_3.method1283(105);
			Static131.aClass1_Sub9_Sub1_3.method1245(local34);
			Static131.aClass1_Sub9_Sub1_3.method1251(local13 + Static154.anInt4068);
			Static131.aClass1_Sub9_Sub1_3.method1251(Static64.anInt987 + local17);
		}
		if (local21 == 1006) {
			Static115.anInt3162 = 2;
			Static107.anInt3036 = Static170.anInt4392;
			Static100.anInt2853 = 0;
			Static126.anInt822 = Static15.anInt450;
			local41 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local34];
			if (local41 != null) {
				@Pc(1301) Class1_Sub1_Sub13 local1301 = local41.aClass1_Sub1_Sub13_1;
				if (local1301.anIntArray318 != null) {
					local1301 = local1301.method2427();
				}
				if (local1301 != null) {
					Static131.aClass1_Sub9_Sub1_3.method1283(98);
					Static131.aClass1_Sub9_Sub1_3.method1245(local1301.anInt3243);
				}
			}
		}
		if (local21 == 58) {
			local281 = Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 0, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 0, false);
			if (!local281) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 1, false);
			}
			Static115.anInt3162 = 2;
			Static126.anInt822 = Static15.anInt450;
			Static107.anInt3036 = Static170.anInt4392;
			Static100.anInt2853 = 0;
			Static131.aClass1_Sub9_Sub1_3.method1283(88);
			Static131.aClass1_Sub9_Sub1_3.method1254(Static64.anInt987 + local17);
			Static131.aClass1_Sub9_Sub1_3.method1254(local34);
			Static131.aClass1_Sub9_Sub1_3.method1236(local13 + Static154.anInt4068);
		}
		if (local21 == 3) {
			local453 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34];
			if (local453 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local453.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local453.anIntArray199[0], 0, 1, false);
				Static126.anInt822 = Static15.anInt450;
				Static100.anInt2853 = 0;
				Static107.anInt3036 = Static170.anInt4392;
				Static115.anInt3162 = 2;
				Static131.aClass1_Sub9_Sub1_3.method1283(124);
				Static131.aClass1_Sub9_Sub1_3.method1254(local34);
			}
		}
		if (local21 == 11 && Static81.aClass39_25 == null) {
			Static67.method1549(local17, local13);
			Static81.aClass39_25 = Static44.method1103(local17, local13);
			Static171.method3407(Static81.aClass39_25);
		}
		if (local21 == 2) {
			local510 = Static44.method1103(local17, local13);
			if (local510 != null) {
				Static26.method552();
				Static53.method1336(Static81.method1836(Static20.method439(local510)), local13, local17);
				Static58.anInt1876 = 0;
				Static161.aClass70_1436 = Static83.method3496(local510);
				if (Static161.aClass70_1436 == null) {
					Static161.aClass70_1436 = Static179.aClass70_1560;
				}
				if (!local510.aBoolean89) {
					Static5.aClass70_59 = Static160.method3210(new Class70[] { Static181.aClass70_1568, local510.aClass70_776, Static151.aClass70_1361 });
					return;
				}
				Static5.aClass70_59 = Static160.method3210(new Class70[] { local510.aClass70_774, Static151.aClass70_1361 });
			}
			return;
		}
		if (local21 == 17) {
			local41 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local34];
			if (local41 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local41.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local41.anIntArray199[0], 0, 1, false);
				Static115.anInt3162 = 2;
				Static107.anInt3036 = Static170.anInt4392;
				Static126.anInt822 = Static15.anInt450;
				Static100.anInt2853 = 0;
				Static131.aClass1_Sub9_Sub1_3.method1283(61);
				Static131.aClass1_Sub9_Sub1_3.method1251(local34);
			}
		}
		if (local21 == 1005) {
			Static115.anInt3162 = 2;
			Static100.anInt2853 = 0;
			Static126.anInt822 = Static15.anInt450;
			Static107.anInt3036 = Static170.anInt4392;
			Static131.aClass1_Sub9_Sub1_3.method1283(139);
			Static131.aClass1_Sub9_Sub1_3.method1251(local34);
		}
		if (local21 == 7) {
			@Pc(1629) boolean local1629 = true;
			local510 = Static128.method3227(local17);
			if (local510.anInt2381 > 0) {
				local1629 = Static90.method1967(local510);
			}
			if (local1629) {
				Static131.aClass1_Sub9_Sub1_3.method1283(47);
				Static131.aClass1_Sub9_Sub1_3.method1259(local17);
			}
		}
		if (local21 == 57) {
			local281 = Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 0, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 0, false);
			if (!local281) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 1, false);
			}
			Static100.anInt2853 = 0;
			Static107.anInt3036 = Static170.anInt4392;
			Static126.anInt822 = Static15.anInt450;
			Static115.anInt3162 = 2;
			Static131.aClass1_Sub9_Sub1_3.method1283(1);
			Static131.aClass1_Sub9_Sub1_3.method1251(local13 + Static154.anInt4068);
			Static131.aClass1_Sub9_Sub1_3.method1264(Static161.anInt4210);
			Static131.aClass1_Sub9_Sub1_3.method1251(local34);
			Static131.aClass1_Sub9_Sub1_3.method1251(Static64.anInt987 + local17);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static110.anInt3092);
		}
		if (local21 == 51) {
			Static131.aClass1_Sub9_Sub1_3.method1283(22);
			Static131.aClass1_Sub9_Sub1_3.method1254(local34);
			Static131.aClass1_Sub9_Sub1_3.method1276(local17);
			Static131.aClass1_Sub9_Sub1_3.method1251(local13);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 48) {
			local453 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34];
			if (local453 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local453.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local453.anIntArray199[0], 0, 1, false);
				Static115.anInt3162 = 2;
				Static100.anInt2853 = 0;
				Static107.anInt3036 = Static170.anInt4392;
				Static126.anInt822 = Static15.anInt450;
				Static131.aClass1_Sub9_Sub1_3.method1283(152);
				Static131.aClass1_Sub9_Sub1_3.method1251(local34);
			}
		}
		if (local21 == 50) {
			local41 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local34];
			if (local41 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local41.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local41.anIntArray199[0], 0, 1, false);
				Static100.anInt2853 = 0;
				Static107.anInt3036 = Static170.anInt4392;
				Static115.anInt3162 = 2;
				Static126.anInt822 = Static15.anInt450;
				Static131.aClass1_Sub9_Sub1_3.method1283(72);
				Static131.aClass1_Sub9_Sub1_3.method1254(local34);
			}
		}
		if (local21 == 1002) {
			Static100.anInt2853 = 0;
			Static126.anInt822 = Static15.anInt450;
			Static115.anInt3162 = 2;
			Static107.anInt3036 = Static170.anInt4392;
			Static131.aClass1_Sub9_Sub1_3.method1283(0);
			Static131.aClass1_Sub9_Sub1_3.method1236(local34);
		}
		if (local21 == 41 && Static133.method2573(local13, local17, local29)) {
			Static131.aClass1_Sub9_Sub1_3.method1283(245);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static64.anInt987 + local17);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static8.anInt286);
			Static131.aClass1_Sub9_Sub1_3.method1251(Integer.MAX_VALUE & (int) (local29 >>> 32));
			Static131.aClass1_Sub9_Sub1_3.method1236(Static154.anInt4068 + local13);
			Static131.aClass1_Sub9_Sub1_3.method1276(Static168.anInt2253);
			Static131.aClass1_Sub9_Sub1_3.method1254(Static123.anInt3344);
		}
		if (local21 == 20) {
			local41 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local34];
			if (local41 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local41.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local41.anIntArray199[0], 0, 1, false);
				Static126.anInt822 = Static15.anInt450;
				Static100.anInt2853 = 0;
				Static115.anInt3162 = 2;
				Static107.anInt3036 = Static170.anInt4392;
				Static131.aClass1_Sub9_Sub1_3.method1283(198);
				Static131.aClass1_Sub9_Sub1_3.method1251(Static8.anInt286);
				Static131.aClass1_Sub9_Sub1_3.method1236(local34);
				Static131.aClass1_Sub9_Sub1_3.method1254(Static123.anInt3344);
				Static131.aClass1_Sub9_Sub1_3.method1276(Static168.anInt2253);
			}
		}
		if (local21 == 9) {
			local41 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local34];
			if (local41 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local41.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local41.anIntArray199[0], 0, 1, false);
				Static100.anInt2853 = 0;
				Static126.anInt822 = Static15.anInt450;
				Static115.anInt3162 = 2;
				Static107.anInt3036 = Static170.anInt4392;
				Static131.aClass1_Sub9_Sub1_3.method1283(247);
				Static131.aClass1_Sub9_Sub1_3.method1245(local34);
			}
		}
		if (local21 == 1) {
			Static131.aClass1_Sub9_Sub1_3.method1283(27);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static110.anInt3092);
			Static131.aClass1_Sub9_Sub1_3.method1245(local13);
			Static131.aClass1_Sub9_Sub1_3.method1231(Static161.anInt4210);
			Static131.aClass1_Sub9_Sub1_3.method1264(local17);
		}
		if (local21 == 18) {
			Static90.method1964();
		}
		if (local21 == 49) {
			Static133.method2573(local13, local17, local29);
			Static131.aClass1_Sub9_Sub1_3.method1283(197);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static64.anInt987 + local17);
			Static131.aClass1_Sub9_Sub1_3.method1236((int) (local29 >>> 32) & Integer.MAX_VALUE);
			Static131.aClass1_Sub9_Sub1_3.method1254(Static154.anInt4068 + local13);
		}
		@Pc(2195) int local2195;
		if (local21 == 12) {
			Static131.aClass1_Sub9_Sub1_3.method1283(47);
			Static131.aClass1_Sub9_Sub1_3.method1259(local17);
			local510 = Static128.method3227(local17);
			if (local510.anIntArrayArray21 != null && local510.anIntArrayArray21[0][0] == 5) {
				local2195 = local510.anIntArrayArray21[0][1];
				if (Static133.anIntArray330[local2195] != local510.anIntArray236[0]) {
					Static133.anIntArray330[local2195] = local510.anIntArray236[0];
					Static102.method2151(local2195);
				}
			}
		}
		if (local21 == 6) {
			local281 = Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 0, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 0, false);
			if (!local281) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 1, false);
			}
			Static115.anInt3162 = 2;
			Static100.anInt2853 = 0;
			Static126.anInt822 = Static15.anInt450;
			Static107.anInt3036 = Static170.anInt4392;
			Static131.aClass1_Sub9_Sub1_3.method1283(9);
			Static131.aClass1_Sub9_Sub1_3.method1254(Static8.anInt286);
			Static131.aClass1_Sub9_Sub1_3.method1245(local13 + Static154.anInt4068);
			Static131.aClass1_Sub9_Sub1_3.method1251(Static123.anInt3344);
			Static131.aClass1_Sub9_Sub1_3.method1251(local34);
			Static131.aClass1_Sub9_Sub1_3.method1259(Static168.anInt2253);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static64.anInt987 + local17);
		}
		if (local21 == 8) {
			Static131.aClass1_Sub9_Sub1_3.method1283(47);
			Static131.aClass1_Sub9_Sub1_3.method1259(local17);
			local510 = Static128.method3227(local17);
			if (local510.anIntArrayArray21 != null && local510.anIntArrayArray21[0][0] == 5) {
				local2195 = local510.anIntArrayArray21[0][1];
				Static133.anIntArray330[local2195] = 1 - Static133.anIntArray330[local2195];
				Static102.method2151(local2195);
			}
		}
		if (local21 == 37) {
			Static131.aClass1_Sub9_Sub1_3.method1283(193);
			Static131.aClass1_Sub9_Sub1_3.method1251(Static110.anInt3092);
			Static131.aClass1_Sub9_Sub1_3.method1236(local34);
			Static131.aClass1_Sub9_Sub1_3.method1254(local13);
			Static131.aClass1_Sub9_Sub1_3.method1264(local17);
			Static131.aClass1_Sub9_Sub1_3.method1276(Static161.anInt4210);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 32) {
			Static26.method552();
			local510 = Static128.method3227(local17);
			Static168.anInt2253 = local17;
			Static123.anInt3344 = local34;
			Static8.anInt286 = local13;
			Static58.anInt1876 = 1;
			Static171.method3407(local510);
			Static111.aClass70_1012 = Static160.method3210(new Class70[] { Static169.aClass70_1465, Static90.method1963(local34).aClass70_49, Static151.aClass70_1361 });
			if (Static111.aClass70_1012 == null) {
				Static111.aClass70_1012 = Static80.aClass70_816;
			}
			return;
		}
		if (local21 == 13) {
			Static131.aClass1_Sub9_Sub1_3.method1283(24);
			Static131.aClass1_Sub9_Sub1_3.method1251(local13);
			Static131.aClass1_Sub9_Sub1_3.method1254(local34);
			Static131.aClass1_Sub9_Sub1_3.method1231(local17);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 31) {
			Static131.aClass1_Sub9_Sub1_3.method1283(92);
			Static131.aClass1_Sub9_Sub1_3.method1245(local34);
			Static131.aClass1_Sub9_Sub1_3.method1231(local17);
			Static131.aClass1_Sub9_Sub1_3.method1251(local13);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 36 && Static133.method2573(local13, local17, local29)) {
			Static131.aClass1_Sub9_Sub1_3.method1283(129);
			Static131.aClass1_Sub9_Sub1_3.method1259(Static161.anInt4210);
			Static131.aClass1_Sub9_Sub1_3.method1251(local13 + Static154.anInt4068);
			Static131.aClass1_Sub9_Sub1_3.method1254(Static64.anInt987 + local17);
			Static131.aClass1_Sub9_Sub1_3.method1245(Static110.anInt3092);
			Static131.aClass1_Sub9_Sub1_3.method1236(Integer.MAX_VALUE & (int) (local29 >>> 32));
		}
		if (local21 == 45) {
			local453 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34];
			if (local453 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local453.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local453.anIntArray199[0], 0, 1, false);
				Static107.anInt3036 = Static170.anInt4392;
				Static115.anInt3162 = 2;
				Static126.anInt822 = Static15.anInt450;
				Static100.anInt2853 = 0;
				Static131.aClass1_Sub9_Sub1_3.method1283(119);
				Static131.aClass1_Sub9_Sub1_3.method1264(Static161.anInt4210);
				Static131.aClass1_Sub9_Sub1_3.method1236(local34);
				Static131.aClass1_Sub9_Sub1_3.method1245(Static110.anInt3092);
			}
		}
		if (local21 == 26) {
			local281 = Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 0, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 0, false);
			if (!local281) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local13, 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local17, 0, 1, false);
			}
			Static100.anInt2853 = 0;
			Static115.anInt3162 = 2;
			Static107.anInt3036 = Static170.anInt4392;
			Static126.anInt822 = Static15.anInt450;
			Static131.aClass1_Sub9_Sub1_3.method1283(202);
			Static131.aClass1_Sub9_Sub1_3.method1251(Static64.anInt987 + local17);
			Static131.aClass1_Sub9_Sub1_3.method1254(local34);
			Static131.aClass1_Sub9_Sub1_3.method1236(local13 + Static154.anInt4068);
		}
		if (local21 == 21) {
			Static131.aClass1_Sub9_Sub1_3.method1283(78);
			Static131.aClass1_Sub9_Sub1_3.method1236(local34);
			Static131.aClass1_Sub9_Sub1_3.method1259(local17);
			Static131.aClass1_Sub9_Sub1_3.method1236(local13);
			Static4.anInt192 = 0;
			Static118.aClass39_33 = Static128.method3227(local17);
			Static70.anInt2170 = local13;
		}
		if (local21 == 14) {
			@Pc(2744) Class1_Sub1_Sub4_Sub2_Sub1 local2744 = Static113.aClass1_Sub1_Sub4_Sub2_Sub1Array1[local34];
			if (local2744 != null) {
				Static14.method371(Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local2744.anIntArray197[0], 0, 2, 0, 1, Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local2744.anIntArray199[0], 0, 1, false);
				Static115.anInt3162 = 2;
				Static100.anInt2853 = 0;
				Static107.anInt3036 = Static170.anInt4392;
				Static126.anInt822 = Static15.anInt450;
				Static131.aClass1_Sub9_Sub1_3.method1283(150);
				Static131.aClass1_Sub9_Sub1_3.method1245(local34);
			}
		}
		if (Static58.anInt1876 != 0) {
			Static58.anInt1876 = 0;
			Static171.method3407(Static128.method3227(Static168.anInt2253));
		}
		if (Static167.aBoolean170) {
			Static26.method552();
		}
		if (Static118.aClass39_33 != null && Static4.anInt192 == 0) {
			Static171.method3407(Static118.aClass39_33);
		}
	}

	@OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)V")
	public static void method1643() {
		anIntArray211 = null;
		aClass1_Sub1_Sub1_Sub4Array3 = null;
		aClass76_62 = null;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ljava/awt/Component;Lclient!u;Lclient!u;I)V")
	public static void method1644(@OriginalArg(0) Component arg0, @OriginalArg(1) Class76 arg1, @OriginalArg(2) Class76 arg2) {
		if (Static25.aBoolean28) {
			return;
		}
		Static155.method3008();
		@Pc(15) byte[] local15 = arg1.method3321(Static179.aClass70_1562, Static107.aClass70_982);
		Static54.aClass1_Sub1_Sub1_Sub4_6 = new Class1_Sub1_Sub1_Sub4(local15, arg0);
		Static168.aClass1_Sub1_Sub1_Sub4_8 = Static54.aClass1_Sub1_Sub1_Sub4_6.method3035();
		Static66.aClass1_Sub1_Sub1_Sub3_1 = Static14.method372(arg2, Static179.aClass70_1562, Static30.aClass70_326);
		Static116.aClass1_Sub1_Sub1_Sub3_4 = Static14.method372(arg2, Static179.aClass70_1562, Static26.aClass70_247);
		Static100.aClass1_Sub1_Sub1_Sub3_3 = Static14.method372(arg2, Static179.aClass70_1562, Static173.aClass70_1538);
		Static51.aClass1_Sub1_Sub1_Sub3Array4 = Static135.method2643(Static133.aClass70_1168, arg2, Static179.aClass70_1562);
		Static151.aClass1_Sub1_Sub1_Sub3Array10 = Static135.method2643(Static116.aClass70_1037, arg2, Static179.aClass70_1562);
		Static182.anIntArray433 = new int[256];
		for (@Pc(61) int local61 = 0; local61 < 64; local61++) {
			Static182.anIntArray433[local61] = local61 * 262144;
		}
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			Static182.anIntArray433[local75 + 64] = local75 * 1024 + 16711680;
		}
		for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
			Static182.anIntArray433[local95 + 128] = local95 * 4 + 16776960;
		}
		for (@Pc(115) int local115 = 0; local115 < 64; local115++) {
			Static182.anIntArray433[local115 + 192] = 16777215;
		}
		Static137.anIntArray345 = new int[256];
		for (@Pc(134) int local134 = 0; local134 < 64; local134++) {
			Static137.anIntArray345[local134] = local134 * 1024;
		}
		for (@Pc(148) int local148 = 0; local148 < 64; local148++) {
			Static137.anIntArray345[local148 + 64] = local148 * 4 + 65280;
		}
		for (@Pc(169) int local169 = 0; local169 < 64; local169++) {
			Static137.anIntArray345[local169 + 128] = local169 * 262144 + 65535;
		}
		for (@Pc(189) int local189 = 0; local189 < 64; local189++) {
			Static137.anIntArray345[local189 + 192] = 16777215;
		}
		Static101.anIntArray271 = new int[256];
		for (@Pc(208) int local208 = 0; local208 < 64; local208++) {
			Static101.anIntArray271[local208] = local208 * 4;
		}
		for (@Pc(222) int local222 = 0; local222 < 64; local222++) {
			Static101.anIntArray271[local222 + 64] = local222 * 262144 + 255;
		}
		for (@Pc(240) int local240 = 0; local240 < 64; local240++) {
			Static101.anIntArray271[local240 + 128] = local240 * 1024 + 16711935;
		}
		for (@Pc(259) int local259 = 0; local259 < 64; local259++) {
			Static101.anIntArray271[local259 + 192] = 16777215;
		}
		Static44.anIntArray149 = new int[256];
		Static12.anIntArray27 = new int[32768];
		Static57.anIntArray187 = new int[32768];
		Static61.method1471(null);
		Static179.aClass70_1563 = Static179.aClass70_1562;
		Static34.anInt1109 = 0;
		Static179.aClass70_1564 = Static179.aClass70_1562;
		Static89.aBoolean102 = false;
		if (Static134.anInt3479 == 0) {
			Static148.aBoolean145 = true;
		} else {
			Static148.aBoolean145 = false;
		}
		Static41.anIntArray132 = new int[32768];
		Static24.anIntArray40 = new int[32768];
		if (Static148.aBoolean145) {
			Static8.method246();
		} else {
			Static38.method978(Static158.aClass70_1395, Static179.aClass70_1562, Static124.aClass76_Sub1_12);
		}
		Static89.method1932(false);
		Static25.aBoolean28 = true;
		Static54.aClass1_Sub1_Sub1_Sub4_6.method3031(0, 0);
		Static168.aClass1_Sub1_Sub1_Sub4_8.method3031(382, 0);
		Static66.aClass1_Sub1_Sub1_Sub3_1.method2618(382 - Static66.aClass1_Sub1_Sub1_Sub3_1.anInt3504 / 2, 18);
		Static5.aClass1_Sub1_Sub1_Sub4_1 = new Class1_Sub1_Sub1_Sub4(128, 254);
		Static37.aClass1_Sub1_Sub1_Sub4_4 = new Class1_Sub1_Sub1_Sub4(128, 254);
	}
}
