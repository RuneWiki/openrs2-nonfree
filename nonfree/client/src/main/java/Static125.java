import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!eba", name = "p", descriptor = "[I")
	public static final int[] anIntArray133 = new int[4];

	@OriginalMember(owner = "client!eba", name = "s", descriptor = "[I")
	public static final int[] anIntArray134 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(ZII)V")
	public static void method1867(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg1, 7);
		local9.method8832();
		local9.anInt10754 = arg0;
	}

	@OriginalMember(owner = "client!eba", name = "a", descriptor = "(Lclient!ha;ILclient!d;)V")
	public static void method1868(@OriginalArg(0) Class95 arg0, @OriginalArg(2) Interface2 arg1) {
		if (Static671.aClass3_Sub5_Sub4_3 == null) {
			return;
		}
		if (Static306.anInt5140 < 10) {
			if (!Static671.aClass362_135.method8339(Static671.aClass3_Sub5_Sub4_3.aString21)) {
				Static306.anInt5140 = Static305.aClass362_61.method8352(Static671.aClass3_Sub5_Sub4_3.aString21) / 10;
				return;
			}
			Static86.method1368();
			Static306.anInt5140 = 10;
		}
		if (Static306.anInt5140 == 10) {
			Static671.anInt9358 = Static671.aClass3_Sub5_Sub4_3.anInt1305 >> 6 << 6;
			Static671.anInt9357 = Static671.aClass3_Sub5_Sub4_3.anInt1312 >> 6 << 6;
			Static671.anInt9360 = (Static671.aClass3_Sub5_Sub4_3.anInt1309 >> 6 << 6) + 64 - Static671.anInt9358;
			Static671.anInt9356 = (Static671.aClass3_Sub5_Sub4_3.anInt1318 >> 6 << 6) + 64 - Static671.anInt9357;
			@Pc(81) int[] local81 = new int[3];
			@Pc(83) int local83 = -1;
			@Pc(85) int local85 = -1;
			if (Static671.aClass3_Sub5_Sub4_3.method1153((Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619 >> 9) + Static402.anInt6661, (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614 >> 9) + Static534.anInt8358, local81, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132)) {
				local83 = local81[1] - Static671.anInt9357;
				local85 = local81[2] - Static671.anInt9358;
			}
			if (!Static468.aBoolean529 && local83 >= 0 && local83 < Static671.anInt9356 && local85 >= 0 && local85 < Static671.anInt9360) {
				local83 += (int) (Math.random() * 10.0D) - 5;
				local85 += (int) (Math.random() * 10.0D) - 5;
				Static81.anInt10273 = local83;
				Static594.anInt9606 = local85;
			} else if (Static388.anInt6479 == -1 || Static622.anInt10289 == -1) {
				Static671.aClass3_Sub5_Sub4_3.method1146(Static671.aClass3_Sub5_Sub4_3.anInt1301 >> 14 & 0x3FFF, Static671.aClass3_Sub5_Sub4_3.anInt1301 & 0x3FFF, local81);
				Static81.anInt10273 = local81[1] - Static671.anInt9357;
				Static594.anInt9606 = local81[2] - Static671.anInt9358;
			} else {
				Static671.aClass3_Sub5_Sub4_3.method1146(Static388.anInt6479, Static622.anInt10289, local81);
				Static468.aBoolean529 = false;
				if (local81 != null) {
					Static594.anInt9606 = local81[2] - Static671.anInt9358;
					Static81.anInt10273 = local81[1] - Static671.anInt9357;
				}
				Static622.anInt10289 = -1;
				Static388.anInt6479 = -1;
			}
			if (Static671.aClass3_Sub5_Sub4_3.anInt1310 == 37) {
				Static671.aFloat183 = 3.0F;
				Static671.aFloat182 = 3.0F;
			} else if (Static671.aClass3_Sub5_Sub4_3.anInt1310 == 50) {
				Static671.aFloat183 = 4.0F;
				Static671.aFloat182 = 4.0F;
			} else if (Static671.aClass3_Sub5_Sub4_3.anInt1310 == 75) {
				Static671.aFloat183 = 6.0F;
				Static671.aFloat182 = 6.0F;
			} else if (Static671.aClass3_Sub5_Sub4_3.anInt1310 == 100) {
				Static671.aFloat183 = 8.0F;
				Static671.aFloat182 = 8.0F;
			} else if (Static671.aClass3_Sub5_Sub4_3.anInt1310 == 200) {
				Static671.aFloat183 = 16.0F;
				Static671.aFloat182 = 16.0F;
			} else {
				Static671.aFloat183 = 8.0F;
				Static671.aFloat182 = 8.0F;
			}
			Static671.anInt9350 = (int) Static671.aFloat183 >> 1;
			Static671.aByteArrayArrayArray17 = Static566.method7447(Static671.anInt9350);
			Static2.method25();
			Static671.method7618();
			Static310.aClass302_27 = new Class302();
			Static671.anInt9348 += (int) (Math.random() * 5.0D) - 2;
			if (Static671.anInt9348 < -8) {
				Static671.anInt9348 = -8;
			}
			Static671.anInt9349 += (int) (Math.random() * 5.0D) - 2;
			if (Static671.anInt9348 > 8) {
				Static671.anInt9348 = 8;
			}
			if (Static671.anInt9349 < -16) {
				Static671.anInt9349 = -16;
			}
			if (Static671.anInt9349 > 16) {
				Static671.anInt9349 = 16;
			}
			Static671.method7621(arg1, Static671.anInt9348 >> 2 << 10, Static671.anInt9349 >> 1);
			Static671.aClass378_4.method8701(256, 1024);
			Static671.aClass208_13.method4948(256, 256);
			Static671.aClass340_5.method7666(4096);
			Static400.aClass36_1.method1017(256);
			Static306.anInt5140 = 20;
		} else if (Static306.anInt5140 == 20) {
			Static207.method7394(true);
			Static671.method7616(arg0, Static671.anInt9348, Static671.anInt9349);
			Static306.anInt5140 = 60;
			Static207.method7394(true);
			Static613.method8315();
		} else if (Static306.anInt5140 == 60) {
			if (Static671.aClass362_135.method8361(Static671.aClass3_Sub5_Sub4_3.aString21 + "_staticelements")) {
				if (!Static671.aClass362_135.method8339(Static671.aClass3_Sub5_Sub4_3.aString21 + "_staticelements")) {
					return;
				}
				Static671.aClass392_3 = Static576.method7566(Static20.aBoolean23, Static671.aClass362_135, Static671.aClass3_Sub5_Sub4_3.aString21 + "_staticelements");
			} else {
				Static671.aClass392_3 = new Class392(0);
			}
			Static671.method7625();
			Static306.anInt5140 = 70;
			Static207.method7394(true);
			Static613.method8315();
		} else if (Static306.anInt5140 == 70) {
			Static26.aClass97_1 = new Class97(arg0, 11, true, Static330.aCanvas5);
			Static306.anInt5140 = 73;
			Static207.method7394(true);
			Static613.method8315();
		} else if (Static306.anInt5140 == 73) {
			Static290.aClass97_3 = new Class97(arg0, 12, true, Static330.aCanvas5);
			Static306.anInt5140 = 76;
			Static207.method7394(true);
			Static613.method8315();
		} else if (Static306.anInt5140 == 76) {
			Static635.aClass97_7 = new Class97(arg0, 14, true, Static330.aCanvas5);
			Static306.anInt5140 = 79;
			Static207.method7394(true);
			Static613.method8315();
		} else if (Static306.anInt5140 == 79) {
			Static142.aClass97_2 = new Class97(arg0, 17, true, Static330.aCanvas5);
			Static306.anInt5140 = 82;
			Static207.method7394(true);
			Static613.method8315();
		} else if (Static306.anInt5140 == 82) {
			Static465.aClass97_5 = new Class97(arg0, 19, true, Static330.aCanvas5);
			Static306.anInt5140 = 85;
			Static207.method7394(true);
			Static613.method8315();
		} else if (Static306.anInt5140 == 85) {
			Static515.aClass97_6 = new Class97(arg0, 22, true, Static330.aCanvas5);
			Static306.anInt5140 = 88;
			Static207.method7394(true);
			Static613.method8315();
		} else if (Static306.anInt5140 == 88) {
			Static405.aClass97_4 = new Class97(arg0, 26, true, Static330.aCanvas5);
			Static306.anInt5140 = 91;
			Static207.method7394(true);
			Static613.method8315();
		} else {
			Static654.aClass97_8 = new Class97(arg0, 30, true, Static330.aCanvas5);
			Static306.anInt5140 = 100;
			Static207.method7394(true);
			Static613.method8315();
			System.gc();
		}
	}
}
