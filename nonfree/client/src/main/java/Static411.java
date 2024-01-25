import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static411 {

	@OriginalMember(owner = "client!on", name = "f", descriptor = "I")
	public static int anInt7540;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!ud;)Lclient!hl;")
	public static Class8_Sub2_Sub1 method6319(@OriginalArg(1) Class2_Sub34 arg0) {
		@Pc(12) Class8_Sub2 local12 = Static575.method7993(arg0);
		@Pc(16) int local16 = arg0.method6856();
		return new Class8_Sub2_Sub1(local12.aClass174_11, local12.aClass176_10, local12.anInt5338, local12.anInt5331, local12.anInt5334, local12.anInt5330, local12.anInt5340, local12.anInt5337, local12.anInt5341, local12.anInt4422, local12.anInt4429, local12.anInt4432, local12.anInt4430, local12.anInt4423, local12.anInt4426, local16);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIIIIZI)V")
	public static void method6320(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5) {
		if ((arg4 ? Static404.aClass2_Sub13_2.aClass33_Sub1_1.method810() : Static404.aClass2_Sub13_2.aClass33_Sub1_5.method810()) != 0 && arg3 != 0 && Static74.anInt1598 < 50 && arg1 != -1) {
			Static492.aClass208Array1[Static74.anInt1598++] = new Class208((byte) (arg4 ? 3 : 2), arg1, arg3, arg5, arg2, 0, arg0, null);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method6321(@OriginalArg(0) Class87 arg0) {
		Static573.aClass64_15 = Static619.method8432(Static616.anInt10014, true, arg0);
		Static72.aClass114_9 = Static307.method4722(arg0, Static616.anInt10014);
		Static428.aClass64_11 = Static619.method8432(Static304.anInt5617, true, arg0);
		Static305.aClass114_29 = Static307.method4722(arg0, Static304.anInt5617);
		Static4.aClass64_1 = Static619.method8432(Static224.anInt4613, true, arg0);
		Static240.aClass114_19 = Static307.method4722(arg0, Static224.anInt4613);
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IIII[IIII)Z")
	public static boolean method6322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg1 < 0) {
			arg1 = 0;
		}
		if (arg2 > Static64.anInt1374) {
			arg2 = Static64.anInt1374;
		}
		if (arg2 <= arg1) {
			return true;
		}
		@Pc(39) int local39 = arg2 - arg1 >> 2;
		arg4 += arg1 - 1;
		arg5 += arg1 * arg0;
		@Pc(62) int local62;
		@Pc(64) int local64;
		@Pc(77) int local77;
		if (Static299.anInt5571 == 1) {
			Static141.anInt3106 += local39;
			while (true) {
				local39--;
				if (local39 < 0) {
					local39 = arg2 - arg1 & 0x3;
					while (true) {
						local39--;
						if (local39 < 0) {
							return true;
						}
						local62 = ~arg5;
						arg4++;
						if (local62 > ~arg3[arg4]) {
							arg3[arg4] = arg5;
						}
						arg5 += arg0;
					}
				}
				local62 = ~arg5;
				local64 = arg4 + 1;
				if (local62 > ~arg3[local64]) {
					arg3[local64] = arg5;
				}
				local77 = arg5 + arg0;
				local62 = ~local77;
				local64++;
				if (local62 > ~arg3[local64]) {
					arg3[local64] = local77;
				}
				local77 += arg0;
				local64++;
				if (arg3[local64] > local77) {
					arg3[local64] = local77;
				}
				local77 += arg0;
				arg4 = local64 + 1;
				if (local77 < arg3[arg4]) {
					arg3[arg4] = local77;
				}
				arg5 = local77 + arg0;
			}
		} else {
			arg5 -= 38400;
			while (true) {
				local39--;
				if (local39 < 0) {
					local39 = arg2 - arg1 & 0x3;
					while (true) {
						local39--;
						if (local39 < 0) {
							return true;
						}
						arg4++;
						if (arg3[arg4] > arg5) {
							return false;
						}
						arg5 += arg0;
					}
				}
				local62 = ~arg5;
				local64 = arg4 + 1;
				if (local62 > ~arg3[local64]) {
					return false;
				}
				local77 = arg5 + arg0;
				local64++;
				if (arg3[local64] > local77) {
					return false;
				}
				local77 += arg0;
				local64++;
				if (arg3[local64] > local77) {
					return false;
				}
				local77 += arg0;
				arg4 = local64 + 1;
				if (arg3[arg4] > local77) {
					return false;
				}
				arg5 = local77 + arg0;
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ha;Lclient!d;I)V")
	public static void method6323(@OriginalArg(0) Class87 arg0, @OriginalArg(1) Interface6 arg1) {
		if (Static292.aClass2_Sub5_Sub19_3 == null) {
			return;
		}
		if (Static334.anInt6170 < 10) {
			if (!Static292.aClass97_123.method2562(Static292.aClass2_Sub5_Sub19_3.aString77)) {
				Static334.anInt6170 = Static612.aClass97_149.method2552(Static292.aClass2_Sub5_Sub19_3.aString77) / 10;
				return;
			}
			Static401.method6148();
			Static334.anInt6170 = 10;
		}
		if (Static334.anInt6170 == 10) {
			Static292.anInt8380 = Static292.aClass2_Sub5_Sub19_3.anInt8669 >> 6 << 6;
			Static292.anInt8373 = Static292.aClass2_Sub5_Sub19_3.anInt8671 >> 6 << 6;
			Static292.anInt8376 = (Static292.aClass2_Sub5_Sub19_3.anInt8666 >> 6 << 6) + 64 - Static292.anInt8380;
			Static292.anInt8378 = (Static292.aClass2_Sub5_Sub19_3.anInt8668 >> 6 << 6) + 64 - Static292.anInt8373;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static292.aClass2_Sub5_Sub19_3.method7276((Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9925 >> 9) + Static451.anInt7933, Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.aByte124, local76, Static470.anInt8063 + (Static338.aClass11_Sub1_Sub1_Sub2_Sub1_2.anInt9929 >> 9))) {
				local78 = local76[1] - Static292.anInt8373;
				local80 = local76[2] - Static292.anInt8380;
			}
			if (!Static424.aBoolean576 && local78 >= 0 && Static292.anInt8378 > local78 && local80 >= 0 && Static292.anInt8376 > local80) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static416.anInt7592 = local78;
				Static304.anInt5622 = local80;
			} else if (Static362.anInt6542 == -1 || Static180.anInt4001 == -1) {
				Static292.aClass2_Sub5_Sub19_3.method7272(local76, Static292.aClass2_Sub5_Sub19_3.anInt8660 >> 14 & 0x3FFF, Static292.aClass2_Sub5_Sub19_3.anInt8660 & 0x3FFF);
				Static304.anInt5622 = local76[2] - Static292.anInt8380;
				Static416.anInt7592 = local76[1] - Static292.anInt8373;
			} else {
				Static292.aClass2_Sub5_Sub19_3.method7272(local76, Static362.anInt6542, Static180.anInt4001);
				if (local76 != null) {
					Static416.anInt7592 = local76[1] - Static292.anInt8373;
					Static304.anInt5622 = local76[2] - Static292.anInt8380;
				}
				Static424.aBoolean576 = false;
				Static180.anInt4001 = -1;
				Static362.anInt6542 = -1;
			}
			if (Static292.aClass2_Sub5_Sub19_3.anInt8665 == 37) {
				Static292.aFloat211 = 3.0F;
				Static292.aFloat212 = 3.0F;
			} else if (Static292.aClass2_Sub5_Sub19_3.anInt8665 == 50) {
				Static292.aFloat211 = 4.0F;
				Static292.aFloat212 = 4.0F;
			} else if (Static292.aClass2_Sub5_Sub19_3.anInt8665 == 75) {
				Static292.aFloat211 = 6.0F;
				Static292.aFloat212 = 6.0F;
			} else if (Static292.aClass2_Sub5_Sub19_3.anInt8665 == 100) {
				Static292.aFloat211 = 8.0F;
				Static292.aFloat212 = 8.0F;
			} else if (Static292.aClass2_Sub5_Sub19_3.anInt8665 == 200) {
				Static292.aFloat211 = 16.0F;
				Static292.aFloat212 = 16.0F;
			} else {
				Static292.aFloat211 = 8.0F;
				Static292.aFloat212 = 8.0F;
			}
			Static292.anInt8371 = (int) Static292.aFloat211 >> 1;
			Static292.aByteArrayArrayArray11 = Static6.method115(Static292.anInt8371);
			Static466.method3730();
			Static292.method7043();
			Static300.aClass238_33 = new Class238();
			Static292.anInt8372 += (int) (Math.random() * 5.0D) - 2;
			if (Static292.anInt8372 < -8) {
				Static292.anInt8372 = -8;
			}
			if (Static292.anInt8372 > 8) {
				Static292.anInt8372 = 8;
			}
			Static292.anInt8370 += (int) (Math.random() * 5.0D) - 2;
			if (Static292.anInt8370 < -16) {
				Static292.anInt8370 = -16;
			}
			if (Static292.anInt8370 > 16) {
				Static292.anInt8370 = 16;
			}
			Static292.method7044(arg1, Static292.anInt8372 >> 2 << 10, Static292.anInt8370 >> 1);
			Static292.aClass248_4.method6348(256, 1024);
			Static292.aClass139_2.method3441(256, 256);
			Static292.aClass281_2.method6738(4096);
			Static23.aClass296_1.method7025(256);
			Static334.anInt6170 = 20;
		} else if (Static334.anInt6170 == 20) {
			Static311.method4750(true);
			Static292.method7053(arg0, Static292.anInt8372, Static292.anInt8370);
			Static334.anInt6170 = 60;
			Static311.method4750(true);
			Static352.method5456();
		} else if (Static334.anInt6170 == 60) {
			if (Static292.aClass97_123.method2555(Static292.aClass2_Sub5_Sub19_3.aString77 + "_staticelements")) {
				if (!Static292.aClass97_123.method2562(Static292.aClass2_Sub5_Sub19_3.aString77 + "_staticelements")) {
					return;
				}
				Static292.aClass313_3 = Static231.method3866(Static259.aBoolean404, Static292.aClass2_Sub5_Sub19_3.aString77 + "_staticelements", Static292.aClass97_123);
			} else {
				Static292.aClass313_3 = new Class313(0);
			}
			Static292.method7037();
			Static334.anInt6170 = 70;
			Static311.method4750(true);
			Static352.method5456();
		} else if (Static334.anInt6170 == 70) {
			Static248.aClass125_8 = new Class125(arg0, 11, true, Static147.aCanvas5);
			Static334.anInt6170 = 73;
			Static311.method4750(true);
			Static352.method5456();
		} else if (Static334.anInt6170 == 73) {
			Static490.aClass125_11 = new Class125(arg0, 12, true, Static147.aCanvas5);
			Static334.anInt6170 = 76;
			Static311.method4750(true);
			Static352.method5456();
		} else if (Static334.anInt6170 == 76) {
			Static97.aClass125_5 = new Class125(arg0, 14, true, Static147.aCanvas5);
			Static334.anInt6170 = 79;
			Static311.method4750(true);
			Static352.method5456();
		} else if (Static334.anInt6170 == 79) {
			Static514.aClass125_13 = new Class125(arg0, 17, true, Static147.aCanvas5);
			Static334.anInt6170 = 82;
			Static311.method4750(true);
			Static352.method5456();
		} else if (Static334.anInt6170 == 82) {
			Static309.aClass125_9 = new Class125(arg0, 19, true, Static147.aCanvas5);
			Static334.anInt6170 = 85;
			Static311.method4750(true);
			Static352.method5456();
		} else if (Static334.anInt6170 == 85) {
			Static25.aClass125_3 = new Class125(arg0, 22, true, Static147.aCanvas5);
			Static334.anInt6170 = 88;
			Static311.method4750(true);
			Static352.method5456();
		} else if (Static334.anInt6170 == 88) {
			Static370.aClass125_10 = new Class125(arg0, 26, true, Static147.aCanvas5);
			Static334.anInt6170 = 91;
			Static311.method4750(true);
			Static352.method5456();
		} else {
			Static38.aClass125_4 = new Class125(arg0, 30, true, Static147.aCanvas5);
			Static334.anInt6170 = 100;
			Static311.method4750(true);
			Static352.method5456();
			System.gc();
		}
	}
}
