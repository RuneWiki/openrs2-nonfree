import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static205 {

	@OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
	public static int anInt3429;

	@OriginalMember(owner = "client!kd", name = "F", descriptor = "[[I")
	public static final int[][] anIntArrayArray19 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!l;Lclient!za;)V")
	public static void method2732(@OriginalArg(1) Interface9 arg0, @OriginalArg(2) Class163 arg1) {
		if (Static282.aClass2_Sub5_Sub15_6 == null) {
			return;
		}
		if (Static178.anInt5442 < 10) {
			if (!Static282.aClass54_59.method1105(Static282.aClass2_Sub5_Sub15_6.aString163)) {
				Static178.anInt5442 = Static280.aClass54_78.method1108(Static282.aClass2_Sub5_Sub15_6.aString163) / 10;
				return;
			}
			Static288.method3843();
			Static178.anInt5442 = 10;
		}
		if (Static178.anInt5442 == 10) {
			Static282.anInt3479 = Static282.aClass2_Sub5_Sub15_6.anInt5815 >> 6 << 6;
			Static282.anInt3477 = Static282.aClass2_Sub5_Sub15_6.anInt5826 >> 6 << 6;
			Static282.anInt3475 = (Static282.aClass2_Sub5_Sub15_6.anInt5821 >> 6 << 6) + (64 - Static282.anInt3477);
			Static282.anInt3468 = (Static282.aClass2_Sub5_Sub15_6.anInt5829 >> 6 << 6) + 64 - Static282.anInt3479;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static282.aClass2_Sub5_Sub15_6.method4575(Static60.aClass3_Sub4_Sub1_Sub2_1.aByte91, (Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6833 >> 7) + Static275.anInt4506, Static209.anInt3497 - -(Static60.aClass3_Sub4_Sub1_Sub2_1.anInt6835 >> 7), local76)) {
				local78 = local76[1] - Static282.anInt3479;
				local80 = local76[2] - Static282.anInt3477;
			}
			if (!Static320.aBoolean409 && local78 >= 0 && Static282.anInt3468 > local78 && local80 >= 0 && local80 < Static282.anInt3475) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static379.anInt6865 = local78;
				Static301.anInt3360 = local80;
			} else if (Static79.anInt1500 == -1 || Static169.anInt2875 == -1) {
				Static282.aClass2_Sub5_Sub15_6.method4573(Static282.aClass2_Sub5_Sub15_6.anInt5827 >> 14 & 0x3FFF, local76, Static282.aClass2_Sub5_Sub15_6.anInt5827 & 0x3FFF);
				Static301.anInt3360 = local76[2] - Static282.anInt3477;
				Static379.anInt6865 = local76[1] - Static282.anInt3479;
			} else {
				Static282.aClass2_Sub5_Sub15_6.method4573(Static79.anInt1500, local76, Static169.anInt2875);
				Static320.aBoolean409 = false;
				if (local76 != null) {
					Static301.anInt3360 = local76[2] - Static282.anInt3477;
					Static379.anInt6865 = local76[1] - Static282.anInt3479;
				}
				Static169.anInt2875 = -1;
				Static79.anInt1500 = -1;
			}
			if (Static282.aClass2_Sub5_Sub15_6.anInt5825 == 37) {
				Static282.aFloat35 = 3.0F;
				Static282.aFloat34 = 3.0F;
			} else if (Static282.aClass2_Sub5_Sub15_6.anInt5825 == 50) {
				Static282.aFloat35 = 4.0F;
				Static282.aFloat34 = 4.0F;
			} else if (Static282.aClass2_Sub5_Sub15_6.anInt5825 == 75) {
				Static282.aFloat35 = 6.0F;
				Static282.aFloat34 = 6.0F;
			} else if (Static282.aClass2_Sub5_Sub15_6.anInt5825 == 100) {
				Static282.aFloat35 = 8.0F;
				Static282.aFloat34 = 8.0F;
			} else if (Static282.aClass2_Sub5_Sub15_6.anInt5825 == 200) {
				Static282.aFloat35 = 16.0F;
				Static282.aFloat34 = 16.0F;
			} else {
				Static282.aFloat35 = 8.0F;
				Static282.aFloat34 = 8.0F;
			}
			Static282.anInt3465 = (int) Static282.aFloat35 >> 1;
			Static282.aByteArrayArrayArray10 = Static214.method2829(Static282.anInt3465);
			Static108.method1681();
			Static282.method2786();
			Static144.aClass156_14 = new Class156();
			Static282.anInt3466 += (int) (Math.random() * 5.0D) - 2;
			if (Static282.anInt3466 < -8) {
				Static282.anInt3466 = -8;
			}
			if (Static282.anInt3466 > 8) {
				Static282.anInt3466 = 8;
			}
			Static282.anInt3467 += (int) (Math.random() * 5.0D) - 2;
			if (Static282.anInt3467 < -16) {
				Static282.anInt3467 = -16;
			}
			if (Static282.anInt3467 > 16) {
				Static282.anInt3467 = 16;
			}
			Static282.method2793(arg0, Static282.anInt3466 >> 2 << 10, Static282.anInt3467 >> 1);
			Static282.aClass120_4.method2511(256, 1024);
			Static282.aClass97_3.method2133(256, 256);
			Static282.aClass190_3.method4221(4096);
			Static291.aClass8_1.method144(256);
			Static178.anInt5442 = 20;
		} else if (Static178.anInt5442 == 20) {
			Static280.method3745(true);
			Static282.method2776(arg1, Static282.anInt3466, Static282.anInt3467);
			Static178.anInt5442 = 60;
			Static280.method3745(true);
			Static93.method1469();
		} else if (Static178.anInt5442 == 60) {
			if (Static282.aClass54_59.method1124(Static282.aClass2_Sub5_Sub15_6.aString163 + "_staticelements")) {
				if (!Static282.aClass54_59.method1105(Static282.aClass2_Sub5_Sub15_6.aString163 + "_staticelements")) {
					return;
				}
				Static282.aClass67_3 = Static321.method4362(Static47.aBoolean73, Static282.aClass2_Sub5_Sub15_6.aString163 + "_staticelements", Static282.aClass54_59);
			} else {
				Static282.aClass67_3 = new Class67(0);
			}
			Static282.method2796();
			Static178.anInt5442 = 70;
			Static280.method3745(true);
			Static93.method1469();
		} else if (Static178.anInt5442 == 70) {
			Static447.aClass260_9 = new Class260(arg1, 11, true, Static286.aCanvas4);
			Static178.anInt5442 = 73;
			Static280.method3745(true);
			Static93.method1469();
		} else if (Static178.anInt5442 == 73) {
			Static424.aClass260_7 = new Class260(arg1, 12, true, Static286.aCanvas4);
			Static178.anInt5442 = 76;
			Static280.method3745(true);
			Static93.method1469();
		} else if (Static178.anInt5442 == 76) {
			Static266.aClass260_4 = new Class260(arg1, 14, true, Static286.aCanvas4);
			Static178.anInt5442 = 79;
			Static280.method3745(true);
			Static93.method1469();
		} else if (Static178.anInt5442 == 79) {
			Static132.aClass260_2 = new Class260(arg1, 17, true, Static286.aCanvas4);
			Static178.anInt5442 = 82;
			Static280.method3745(true);
			Static93.method1469();
		} else if (Static178.anInt5442 == 82) {
			Static64.aClass260_1 = new Class260(arg1, 19, true, Static286.aCanvas4);
			Static178.anInt5442 = 85;
			Static280.method3745(true);
			Static93.method1469();
		} else if (Static178.anInt5442 == 85) {
			Static434.aClass260_8 = new Class260(arg1, 22, true, Static286.aCanvas4);
			Static178.anInt5442 = 88;
			Static280.method3745(true);
			Static93.method1469();
		} else if (Static178.anInt5442 == 88) {
			Static221.aClass260_3 = new Class260(arg1, 26, true, Static286.aCanvas4);
			Static178.anInt5442 = 91;
			Static280.method3745(true);
			Static93.method1469();
		} else {
			Static307.aClass260_5 = new Class260(arg1, 30, true, Static286.aCanvas4);
			Static178.anInt5442 = 100;
			Static280.method3745(true);
			Static93.method1469();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!sv;Z)V")
	public static void method2734(@OriginalArg(0) Class2_Sub13 arg0) {
		if (arg0.aByteArray52.length - arg0.anInt4347 < 1) {
			return;
		}
		@Pc(23) int local23 = arg0.method3580();
		if (local23 < 0 || local23 > 1 || arg0.aByteArray52.length - arg0.anInt4347 < 2) {
			return;
		}
		@Pc(43) int local43 = arg0.method3555();
		if (local43 * 6 > arg0.aByteArray52.length - arg0.anInt4347) {
			return;
		}
		for (@Pc(61) int local61 = 0; local61 < local43; local61++) {
			@Pc(67) int local67 = arg0.method3555();
			@Pc(71) int local71 = arg0.method3574();
			if (Static400.anIntArray551.length > local67 && Static270.aBooleanArray18[local67] && (Static343.aClass23_1.method459(local67).aChar2 != '1' || local71 >= -1 && local71 <= 1)) {
				Static400.anIntArray551[local67] = local71;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILjava/lang/String;)I")
	public static int method2736(@OriginalArg(1) String arg0) {
		return Static276.method3716(10, arg0);
	}
}
