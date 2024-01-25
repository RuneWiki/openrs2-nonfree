import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!gu", name = "I", descriptor = "I")
	public static int anInt7178;

	@OriginalMember(owner = "client!gu", name = "B", descriptor = "Lclient!mg;")
	public static final Class156 aClass156_5 = new Class156("RC", 1);

	@OriginalMember(owner = "client!gu", name = "J", descriptor = "I")
	public static int anInt7179 = 0;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ILclient!l;Lclient!za;)V")
	public static void method5807(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class117 arg1) {
		if (Static430.aClass1_Sub3_Sub16_2 == null) {
			return;
		}
		if (Static8.anInt126 < 10) {
			if (!Static430.aClass185_64.method4019(Static430.aClass1_Sub3_Sub16_2.aString63)) {
				Static8.anInt126 = Static465.aClass185_117.method4026(Static430.aClass1_Sub3_Sub16_2.aString63) / 10;
				return;
			}
			Static226.method3215();
			Static8.anInt126 = 10;
		}
		if (Static8.anInt126 == 10) {
			Static430.anInt4140 = Static430.aClass1_Sub3_Sub16_2.anInt6328 >> 6 << 6;
			Static430.anInt4146 = Static430.aClass1_Sub3_Sub16_2.anInt6325 >> 6 << 6;
			Static430.anInt4144 = (Static430.aClass1_Sub3_Sub16_2.anInt6324 >> 6 << 6) + 64 - Static430.anInt4140;
			Static430.anInt4137 = (Static430.aClass1_Sub3_Sub16_2.anInt6330 >> 6 << 6) + 64 - Static430.anInt4146;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static430.aClass1_Sub3_Sub16_2.method5108(Static47.anInt676 + (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6430 >> 7), Static94.aClass11_Sub1_Sub3_Sub2_1.aByte90, local74, Static315.anInt5207 + (Static94.aClass11_Sub1_Sub3_Sub2_1.anInt6428 >> 7))) {
				local76 = local74[1] - Static430.anInt4140;
				local78 = local74[2] - Static430.anInt4146;
			}
			if (!Static380.aBoolean539 && local76 >= 0 && local76 < Static430.anInt4144 && local78 >= 0 && Static430.anInt4137 > local78) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local76 += (int) (Math.random() * 10.0D) - 5;
				Static223.anInt5659 = local76;
				Static173.anInt2855 = local78;
			} else if (Static72.anInt1049 == -1 || Static270.anInt1981 == -1) {
				Static430.aClass1_Sub3_Sub16_2.method5109(local74, Static430.aClass1_Sub3_Sub16_2.anInt6323 >> 14 & 0x3FFF, Static430.aClass1_Sub3_Sub16_2.anInt6323 & 0x3FFF);
				Static223.anInt5659 = local74[1] - Static430.anInt4140;
				Static173.anInt2855 = local74[2] - Static430.anInt4146;
			} else {
				Static430.aClass1_Sub3_Sub16_2.method5109(local74, Static72.anInt1049, Static270.anInt1981);
				Static270.anInt1981 = -1;
				Static72.anInt1049 = -1;
				if (local74 != null) {
					Static173.anInt2855 = local74[2] - Static430.anInt4146;
					Static223.anInt5659 = local74[1] - Static430.anInt4140;
				}
				Static380.aBoolean539 = false;
			}
			if (Static430.aClass1_Sub3_Sub16_2.anInt6326 == 37) {
				Static430.aFloat55 = 3.0F;
				Static430.aFloat54 = 3.0F;
			} else if (Static430.aClass1_Sub3_Sub16_2.anInt6326 == 50) {
				Static430.aFloat55 = 4.0F;
				Static430.aFloat54 = 4.0F;
			} else if (Static430.aClass1_Sub3_Sub16_2.anInt6326 == 75) {
				Static430.aFloat55 = 6.0F;
				Static430.aFloat54 = 6.0F;
			} else if (Static430.aClass1_Sub3_Sub16_2.anInt6326 == 100) {
				Static430.aFloat55 = 8.0F;
				Static430.aFloat54 = 8.0F;
			} else if (Static430.aClass1_Sub3_Sub16_2.anInt6326 == 200) {
				Static430.aFloat55 = 16.0F;
				Static430.aFloat54 = 16.0F;
			} else {
				Static430.aFloat55 = 8.0F;
				Static430.aFloat54 = 8.0F;
			}
			Static430.anInt4133 = (int) Static430.aFloat55 >> 1;
			Static430.aByteArrayArrayArray8 = Static459.method5901(Static430.anInt4133);
			Static160.method2120();
			Static430.method3258();
			Static350.aClass14_40 = new Class14();
			Static430.anInt4134 += (int) (Math.random() * 5.0D) - 2;
			if (Static430.anInt4134 < -8) {
				Static430.anInt4134 = -8;
			}
			Static430.anInt4132 += (int) (Math.random() * 5.0D) - 2;
			if (Static430.anInt4134 > 8) {
				Static430.anInt4134 = 8;
			}
			if (Static430.anInt4132 < -16) {
				Static430.anInt4132 = -16;
			}
			if (Static430.anInt4132 > 16) {
				Static430.anInt4132 = 16;
			}
			Static430.method3265(arg0, Static430.anInt4134 >> 2 << 10, Static430.anInt4132 >> 1);
			Static430.aClass36_4.method660(1024, 256);
			Static430.aClass223_3.method4709(256, 256);
			Static430.aClass248_5.method5250(4096);
			Static197.aClass76_1.method1373(256);
			Static8.anInt126 = 20;
		} else if (Static8.anInt126 == 20) {
			Static176.method2567(true);
			Static430.method3261(arg1, Static430.anInt4134, Static430.anInt4132);
			Static8.anInt126 = 60;
			Static176.method2567(true);
			Static105.method1301();
		} else if (Static8.anInt126 == 60) {
			if (Static430.aClass185_64.method4015(Static430.aClass1_Sub3_Sub16_2.aString63 + "_staticelements")) {
				if (!Static430.aClass185_64.method4019(Static430.aClass1_Sub3_Sub16_2.aString63 + "_staticelements")) {
					return;
				}
				Static430.aClass144_2 = Static134.method1700(Static422.aBoolean591, Static430.aClass1_Sub3_Sub16_2.aString63 + "_staticelements", Static430.aClass185_64);
			} else {
				Static430.aClass144_2 = new Class144(0);
			}
			Static430.method3267();
			Static8.anInt126 = 70;
			Static176.method2567(true);
			Static105.method1301();
		} else if (Static8.anInt126 == 70) {
			Static326.aClass263_27 = new Class263(arg1, 11, true, Static91.aCanvas2);
			Static8.anInt126 = 73;
			Static176.method2567(true);
			Static105.method1301();
		} else if (Static8.anInt126 == 73) {
			Static157.aClass263_18 = new Class263(arg1, 12, true, Static91.aCanvas2);
			Static8.anInt126 = 76;
			Static176.method2567(true);
			Static105.method1301();
		} else if (Static8.anInt126 == 76) {
			Static132.aClass263_32 = new Class263(arg1, 14, true, Static91.aCanvas2);
			Static8.anInt126 = 79;
			Static176.method2567(true);
			Static105.method1301();
		} else if (Static8.anInt126 == 79) {
			Static86.aClass263_34 = new Class263(arg1, 17, true, Static91.aCanvas2);
			Static8.anInt126 = 82;
			Static176.method2567(true);
			Static105.method1301();
		} else if (Static8.anInt126 == 82) {
			Static209.aClass263_24 = new Class263(arg1, 19, true, Static91.aCanvas2);
			Static8.anInt126 = 85;
			Static176.method2567(true);
			Static105.method1301();
		} else if (Static8.anInt126 == 85) {
			Static40.aClass263_9 = new Class263(arg1, 22, true, Static91.aCanvas2);
			Static8.anInt126 = 88;
			Static176.method2567(true);
			Static105.method1301();
		} else if (Static8.anInt126 == 88) {
			Static437.aClass263_33 = new Class263(arg1, 26, true, Static91.aCanvas2);
			Static8.anInt126 = 91;
			Static176.method2567(true);
			Static105.method1301();
		} else {
			Static159.aClass263_19 = new Class263(arg1, 30, true, Static91.aCanvas2);
			Static8.anInt126 = 100;
			Static176.method2567(true);
			Static105.method1301();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(IIIIIII)I")
	public static int method5813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg1 & 0x1) == 1) {
			@Pc(17) int local17 = arg4;
			arg4 = arg3;
			arg3 = local17;
		}
		@Pc(25) int local25 = arg5 & 0x3;
		if (local25 == 0) {
			return arg0;
		} else if (local25 == 1) {
			return arg2;
		} else if (local25 == 2) {
			return 7 + 1 - arg0 - arg4;
		} else {
			return 7 + 1 - arg2 - arg3;
		}
	}
}
