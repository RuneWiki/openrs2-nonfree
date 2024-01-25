import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fia", name = "m", descriptor = "Lclient!gj;")
	public static Class143 aClass143_40;

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "[I")
	public static final int[] anIntArray199 = new int[14];

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(Lclient!d;BLclient!ha;)V")
	public static void method2778(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) Class16 arg1) {
		if (Static574.aClass3_Sub6_Sub13_3 == null) {
			return;
		}
		if (Static678.anInt10338 < 10) {
			if (!Static574.aClass143_116.method3118(Static574.aClass3_Sub6_Sub13_3.aString66)) {
				Static678.anInt10338 = Static390.aClass143_97.method3121(Static574.aClass3_Sub6_Sub13_3.aString66) / 10;
				return;
			}
			Static220.method3440();
			Static678.anInt10338 = 10;
		}
		if (Static678.anInt10338 == 10) {
			Static574.anInt8366 = Static574.aClass3_Sub6_Sub13_3.anInt5162 >> 6 << 6;
			Static574.anInt8361 = Static574.aClass3_Sub6_Sub13_3.anInt5176 >> 6 << 6;
			Static574.anInt8360 = (Static574.aClass3_Sub6_Sub13_3.anInt5172 >> 6 << 6) + 64 - Static574.anInt8361;
			Static574.anInt8364 = (Static574.aClass3_Sub6_Sub13_3.anInt5169 >> 6 << 6) + 64 - Static574.anInt8366;
			@Pc(80) int[] local80 = new int[3];
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = -1;
			if (Static574.aClass3_Sub6_Sub13_3.method4388(Static347.anInt7851 + (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10109 >> 9), (Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.anInt10108 >> 9) + Static417.anInt7047, Static515.aClass23_Sub2_Sub1_Sub2_Sub1_2.aByte142, local80)) {
				local82 = local80[1] - Static574.anInt8361;
				local84 = local80[2] - Static574.anInt8366;
			}
			if (!Static6.aBoolean11 && local82 >= 0 && Static574.anInt8360 > local82 && local84 >= 0 && local84 < Static574.anInt8364) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				local84 += (int) (Math.random() * 10.0D) - 5;
				Static462.anInt7931 = local84;
				Static176.anInt3320 = local82;
			} else if (Static91.anInt8801 == -1 || Static329.anInt1860 == -1) {
				Static574.aClass3_Sub6_Sub13_3.method4385(local80, Static574.aClass3_Sub6_Sub13_3.anInt5167 >> 14 & 0x3FFF, Static574.aClass3_Sub6_Sub13_3.anInt5167 & 0x3FFF);
				Static462.anInt7931 = local80[2] - Static574.anInt8366;
				Static176.anInt3320 = local80[1] - Static574.anInt8361;
			} else {
				Static574.aClass3_Sub6_Sub13_3.method4385(local80, Static91.anInt8801, Static329.anInt1860);
				if (local80 != null) {
					Static176.anInt3320 = local80[1] - Static574.anInt8361;
					Static462.anInt7931 = local80[2] - Static574.anInt8366;
				}
				Static329.anInt1860 = -1;
				Static91.anInt8801 = -1;
				Static6.aBoolean11 = false;
			}
			if (Static574.aClass3_Sub6_Sub13_3.anInt5166 == 37) {
				Static574.aFloat183 = 3.0F;
				Static574.aFloat182 = 3.0F;
			} else if (Static574.aClass3_Sub6_Sub13_3.anInt5166 == 50) {
				Static574.aFloat183 = 4.0F;
				Static574.aFloat182 = 4.0F;
			} else if (Static574.aClass3_Sub6_Sub13_3.anInt5166 == 75) {
				Static574.aFloat183 = 6.0F;
				Static574.aFloat182 = 6.0F;
			} else if (Static574.aClass3_Sub6_Sub13_3.anInt5166 == 100) {
				Static574.aFloat183 = 8.0F;
				Static574.aFloat182 = 8.0F;
			} else if (Static574.aClass3_Sub6_Sub13_3.anInt5166 == 200) {
				Static574.aFloat183 = 16.0F;
				Static574.aFloat182 = 16.0F;
			} else {
				Static574.aFloat183 = 8.0F;
				Static574.aFloat182 = 8.0F;
			}
			Static574.anInt8353 = (int) Static574.aFloat183 >> 1;
			Static574.aByteArrayArrayArray17 = Static274.method4352(Static574.anInt8353);
			Static109.method2090();
			Static574.method7088();
			Static553.aClass193_57 = new Class193();
			Static574.anInt8355 += (int) (Math.random() * 5.0D) - 2;
			if (Static574.anInt8355 < -8) {
				Static574.anInt8355 = -8;
			}
			Static574.anInt8354 += (int) (Math.random() * 5.0D) - 2;
			if (Static574.anInt8355 > 8) {
				Static574.anInt8355 = 8;
			}
			if (Static574.anInt8354 < -16) {
				Static574.anInt8354 = -16;
			}
			if (Static574.anInt8354 > 16) {
				Static574.anInt8354 = 16;
			}
			Static574.method7084(arg0, Static574.anInt8355 >> 2 << 10, Static574.anInt8354 >> 1);
			Static574.aClass321_3.method7482(1024, 256);
			Static574.aClass116_4.method2723(256, 256);
			Static574.aClass374_4.method8353(4096);
			Static442.aClass388_1.method8668(256);
			Static678.anInt10338 = 20;
		} else if (Static678.anInt10338 == 20) {
			Static591.method7939(true);
			Static574.method7073(arg1, Static574.anInt8355, Static574.anInt8354);
			Static678.anInt10338 = 60;
			Static591.method7939(true);
			Static368.method5462();
		} else if (Static678.anInt10338 == 60) {
			if (Static574.aClass143_116.method3138(Static574.aClass3_Sub6_Sub13_3.aString66 + "_staticelements")) {
				if (!Static574.aClass143_116.method3118(Static574.aClass3_Sub6_Sub13_3.aString66 + "_staticelements")) {
					return;
				}
				Static574.aClass121_3 = Static645.method8452(Static574.aClass143_116, Static574.aClass3_Sub6_Sub13_3.aString66 + "_staticelements", Static375.aBoolean505);
			} else {
				Static574.aClass121_3 = new Class121(0);
			}
			Static574.method7080();
			Static678.anInt10338 = 70;
			Static591.method7939(true);
			Static368.method5462();
		} else if (Static678.anInt10338 == 70) {
			Static644.aClass281_10 = new Class281(arg1, 11, true, Static469.aCanvas11);
			Static678.anInt10338 = 73;
			Static591.method7939(true);
			Static368.method5462();
		} else if (Static678.anInt10338 == 73) {
			Static219.aClass281_8 = new Class281(arg1, 12, true, Static469.aCanvas11);
			Static678.anInt10338 = 76;
			Static591.method7939(true);
			Static368.method5462();
		} else if (Static678.anInt10338 == 76) {
			Static374.aClass281_6 = new Class281(arg1, 14, true, Static469.aCanvas11);
			Static678.anInt10338 = 79;
			Static591.method7939(true);
			Static368.method5462();
		} else if (Static678.anInt10338 == 79) {
			Static140.aClass281_1 = new Class281(arg1, 17, true, Static469.aCanvas11);
			Static678.anInt10338 = 82;
			Static591.method7939(true);
			Static368.method5462();
		} else if (Static678.anInt10338 == 82) {
			Static146.aClass281_2 = new Class281(arg1, 19, true, Static469.aCanvas11);
			Static678.anInt10338 = 85;
			Static591.method7939(true);
			Static368.method5462();
		} else if (Static678.anInt10338 == 85) {
			Static280.aClass281_5 = new Class281(arg1, 22, true, Static469.aCanvas11);
			Static678.anInt10338 = 88;
			Static591.method7939(true);
			Static368.method5462();
		} else if (Static678.anInt10338 == 88) {
			Static575.aClass281_9 = new Class281(arg1, 26, true, Static469.aCanvas11);
			Static678.anInt10338 = 91;
			Static591.method7939(true);
			Static368.method5462();
		} else {
			Static195.aClass281_3 = new Class281(arg1, 30, true, Static469.aCanvas11);
			Static678.anInt10338 = 100;
			Static591.method7939(true);
			Static368.method5462();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!fia", name = "c", descriptor = "(B)V")
	public static void method2781() {
		Static210.anIntArray261 = Static627.method8271(0.4F);
	}
}
