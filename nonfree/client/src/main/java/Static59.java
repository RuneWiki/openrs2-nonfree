import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!ee", name = "T", descriptor = "Lclient!wc;")
	public static Class1_Sub3_Sub24 aClass1_Sub3_Sub24_1;

	@OriginalMember(owner = "client!ee", name = "R", descriptor = "Ljava/lang/String;")
	public static String aString76 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "(I)V")
	public static void method1077() {
		if (Static251.anInt5521 == 0) {
			return;
		}
		try {
			if (++Static264.anInt5301 > 2000) {
				if (Static5.aClass104_5 != null) {
					Static5.aClass104_5.method2571();
					Static5.aClass104_5 = null;
				}
				if (Static119.anInt2584 >= 1) {
					Static251.anInt5521 = 0;
					Static252.anInt5113 = -5;
					return;
				}
				Static251.anInt5521 = 1;
				Static119.anInt2584++;
				Static264.anInt5301 = 0;
				if (Static265.anInt5307 == Static188.anInt4156) {
					Static188.anInt4156 = Static277.anInt5551;
				} else {
					Static188.anInt4156 = Static265.anInt5307;
				}
			}
			if (Static251.anInt5521 == 1) {
				Static315.aClass47_8 = Static142.aClass112_2.method2889(Static44.aString59, Static188.anInt4156);
				Static251.anInt5521 = 2;
			}
			@Pc(123) int local123;
			if (Static251.anInt5521 == 2) {
				if (Static315.aClass47_8.anInt1417 == 2) {
					throw new IOException();
				}
				if (Static315.aClass47_8.anInt1417 != 1) {
					return;
				}
				Static5.aClass104_5 = new Class104((Socket) Static315.aClass47_8.anObject2, Static142.aClass112_2);
				Static315.aClass47_8 = null;
				Static5.aClass104_5.method2579(Static2.aClass1_Sub14_Sub1_1.aByteArray55, Static2.aClass1_Sub14_Sub1_1.anInt3000);
				if (Static114.aClass15_1 != null) {
					Static114.aClass15_1.method1249();
				}
				if (Static157.aClass15_2 != null) {
					Static157.aClass15_2.method1249();
				}
				local123 = Static5.aClass104_5.method2573();
				if (Static114.aClass15_1 != null) {
					Static114.aClass15_1.method1249();
				}
				if (Static157.aClass15_2 != null) {
					Static157.aClass15_2.method1249();
				}
				if (local123 != 21) {
					Static251.anInt5521 = 0;
					Static252.anInt5113 = local123;
					Static5.aClass104_5.method2571();
					Static5.aClass104_5 = null;
					return;
				}
				Static251.anInt5521 = 3;
			}
			if (Static251.anInt5521 == 3) {
				if (Static5.aClass104_5.method2581() < 1) {
					return;
				}
				Static147.aStringArray30 = new String[Static5.aClass104_5.method2573()];
				Static251.anInt5521 = 4;
			}
			if (Static251.anInt5521 == 4) {
				if (Static5.aClass104_5.method2581() < Static147.aStringArray30.length * 8) {
					return;
				}
				Static140.aClass1_Sub14_Sub1_2.anInt3000 = 0;
				Static5.aClass104_5.method2574(Static140.aClass1_Sub14_Sub1_2.aByteArray55, 0, Static147.aStringArray30.length * 8);
				for (local123 = 0; local123 < Static147.aStringArray30.length; local123++) {
					Static147.aStringArray30[local123] = Static205.method3266(Static140.aClass1_Sub14_Sub1_2.method2213());
				}
				Static252.anInt5113 = 21;
				Static251.anInt5521 = 0;
				Static5.aClass104_5.method2571();
				Static5.aClass104_5 = null;
				return;
			}
		} catch (@Pc(237) IOException local237) {
			if (Static5.aClass104_5 != null) {
				Static5.aClass104_5.method2571();
				Static5.aClass104_5 = null;
			}
			if (Static119.anInt2584 < 1) {
				if (Static265.anInt5307 == Static188.anInt4156) {
					Static188.anInt4156 = Static277.anInt5551;
				} else {
					Static188.anInt4156 = Static265.anInt5307;
				}
				Static119.anInt2584++;
				Static264.anInt5301 = 0;
				Static251.anInt5521 = 1;
			} else {
				Static252.anInt5113 = -4;
				Static251.anInt5521 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IIII)V")
	public static void method1078(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) Class1_Sub2 local7 = Static7.aClass1_Sub2ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class106 local13 = local7.aClass106_1;
		if (local13 != null) {
			local13.anInt3751 = local13.anInt3751 * arg3 / 16;
			local13.anInt3757 = local13.anInt3757 * arg3 / 16;
		}
	}

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "(I)V")
	public static void method1080() {
		if (Static268.aClass1_Sub3_Sub15_2 == null) {
			return;
		}
		if (Static147.anInt3288 < 10) {
			if (!Static268.aClass168_90.method4061(Static268.aClass1_Sub3_Sub15_2.aString267)) {
				Static147.anInt3288 = Static280.aClass168_191.method4066(Static268.aClass1_Sub3_Sub15_2.aString267) / 10;
				return;
			}
			Static217.method3459();
			Static147.anInt3288 = 10;
		}
		if (Static147.anInt3288 == 10) {
			Static268.anInt2655 = Static268.aClass1_Sub3_Sub15_2.anInt3984 >> 6 << 6;
			Static268.anInt2656 = Static268.aClass1_Sub3_Sub15_2.anInt3975 >> 6 << 6;
			Static268.anInt2657 = (Static268.aClass1_Sub3_Sub15_2.anInt3967 >> 6 << 6) + 64 - Static268.anInt2655;
			Static268.anInt2659 = (Static268.aClass1_Sub3_Sub15_2.anInt3981 >> 6 << 6) + 64 - Static268.anInt2656;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static268.aClass1_Sub3_Sub15_2.method2926(Static217.anInt4673 + (Static56.aClass2_Sub4_Sub2_1.anInt2794 >> 7), local78, Static159.anInt3527 + (Static56.aClass2_Sub4_Sub2_1.anInt2846 >> 7), Static185.anInt4085)) {
				local80 = local78[1] - Static268.anInt2655;
				local82 = Static268.anInt2659 + Static268.anInt2656 - local78[2] - 1;
			}
			if (!Static135.aBoolean190 && local80 >= 0 && Static268.anInt2657 > local80 && local82 >= 0 && local82 < Static268.anInt2659) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static299.anInt5944 = local82;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static109.anInt2414 = local80;
			} else if (Static210.anInt4563 == -1 || Static80.anInt1844 == -1) {
				Static268.aClass1_Sub3_Sub15_2.method2928(local78, Static268.aClass1_Sub3_Sub15_2.anInt3969 >> 14 & 0x3FFF, Static268.aClass1_Sub3_Sub15_2.anInt3969 & 0x3FFF);
				Static109.anInt2414 = local78[1] - Static268.anInt2655;
				Static299.anInt5944 = Static268.anInt2659 + Static268.anInt2656 - local78[2] - 1;
			} else {
				Static268.aClass1_Sub3_Sub15_2.method2928(local78, Static210.anInt4563, Static80.anInt1844);
				Static135.aBoolean190 = false;
				if (local78 != null) {
					Static109.anInt2414 = local78[1] - Static268.anInt2655;
					Static299.anInt5944 = Static268.anInt2659 + Static268.anInt2656 - local78[2] - 1;
				}
				Static80.anInt1844 = -1;
				Static210.anInt4563 = -1;
			}
			if (Static268.aClass1_Sub3_Sub15_2.anInt3985 == 37) {
				Static268.aFloat34 = 3.0F;
				Static268.aFloat35 = 3.0F;
			} else if (Static268.aClass1_Sub3_Sub15_2.anInt3985 == 50) {
				Static268.aFloat34 = 4.0F;
				Static268.aFloat35 = 4.0F;
			} else if (Static268.aClass1_Sub3_Sub15_2.anInt3985 == 75) {
				Static268.aFloat34 = 6.0F;
				Static268.aFloat35 = 6.0F;
			} else if (Static268.aClass1_Sub3_Sub15_2.anInt3985 == 100) {
				Static268.aFloat34 = 8.0F;
				Static268.aFloat35 = 8.0F;
			} else if (Static268.aClass1_Sub3_Sub15_2.anInt3985 == 200) {
				Static268.aFloat34 = 16.0F;
				Static268.aFloat35 = 16.0F;
			} else {
				Static268.aFloat34 = 8.0F;
				Static268.aFloat35 = 8.0F;
			}
			Static278.method4757();
			@Pc(306) int local306 = Static268.anInt2659 >> 6;
			@Pc(310) int local310 = Static268.anInt2657 >> 6;
			Static268.aByteArrayArrayArray11 = new byte[local310][local306][];
			Static268.anIntArrayArrayArray6 = new int[local310][local306][];
			Static268.aByteArrayArrayArray13 = new byte[local310][local306][];
			Static268.anIntArrayArrayArray5 = new int[local310][local306][];
			Static268.aByteArrayArrayArray12 = new byte[local310][local306][];
			Static268.aByteArrayArrayArray9 = new byte[local310][local306][];
			Static268.aByteArrayArrayArray10 = new byte[local310][local306][];
			Static268.anIntArray269 = new int[Static266.anInt5320 + 1];
			Static315.aClass26_62 = new Class26();
			Static121.aClass72_1 = new Class72();
			@Pc(355) int local355 = Static185.anInt4090 >> 1;
			@Pc(361) int local361 = Static209.anInt4543 >> 2 << 10;
			Static268.method1997(local361, local355);
			Static72.method1267(256, 1024);
			Static159.method2556(256, 256);
			Static5.method2415(256);
			Static147.anInt3288 = 20;
		} else if (Static147.anInt3288 == 20) {
			Static248.method3839(new Class1_Sub14(Static268.aClass168_90.method4053(Static268.aClass1_Sub3_Sub15_2.aString267, "underlay")));
			Static147.anInt3288 = 30;
			Static215.method3449(true);
			Static214.method3430();
		} else if (Static147.anInt3288 == 30) {
			Static268.method1993(new Class1_Sub14(Static268.aClass168_90.method4053(Static268.aClass1_Sub3_Sub15_2.aString267, "overlay")));
			Static147.anInt3288 = 40;
			Static214.method3430();
		} else if (Static147.anInt3288 == 40) {
			Static268.method1995(new Class1_Sub14(Static268.aClass168_90.method4053(Static268.aClass1_Sub3_Sub15_2.aString267, "overlay2")));
			Static147.anInt3288 = 50;
			Static214.method3430();
		} else if (Static147.anInt3288 == 50) {
			Static268.method2010(new Class1_Sub14(Static268.aClass168_90.method4053(Static268.aClass1_Sub3_Sub15_2.aString267, "loc")), Static160.aBoolean229);
			Static147.anInt3288 = 60;
			Static215.method3449(true);
			Static214.method3430();
		} else if (Static147.anInt3288 == 60) {
			if (Static268.aClass168_90.method4045(Static268.aClass1_Sub3_Sub15_2.aString267 + "_labels")) {
				if (!Static268.aClass168_90.method4061(Static268.aClass1_Sub3_Sub15_2.aString267 + "_labels")) {
					return;
				}
				Static268.aClass174_2 = Static267.method4026(Static268.aClass1_Sub3_Sub15_2.aString267 + "_labels", Static268.aClass168_90, Static160.aBoolean229);
			} else {
				Static268.aClass174_2 = new Class174(0);
			}
			Static268.method2005();
			Static147.anInt3288 = 70;
			Static214.method3430();
		} else if (Static147.anInt3288 == 70) {
			Static121.aClass27_11 = new Class27(11, true, Static108.aCanvas1);
			Static147.anInt3288 = 73;
			Static215.method3449(true);
			Static214.method3430();
		} else if (Static147.anInt3288 == 73) {
			Static197.aClass27_26 = new Class27(12, true, Static108.aCanvas1);
			Static147.anInt3288 = 76;
			Static215.method3449(true);
			Static214.method3430();
		} else if (Static147.anInt3288 == 76) {
			Static176.aClass27_22 = new Class27(14, true, Static108.aCanvas1);
			Static147.anInt3288 = 79;
			Static215.method3449(true);
			Static214.method3430();
		} else if (Static147.anInt3288 == 79) {
			Static168.aClass27_20 = new Class27(17, true, Static108.aCanvas1);
			Static147.anInt3288 = 82;
			Static215.method3449(true);
			Static214.method3430();
		} else if (Static147.anInt3288 == 82) {
			Static145.aClass27_42 = new Class27(19, true, Static108.aCanvas1);
			Static147.anInt3288 = 85;
			Static215.method3449(true);
			Static214.method3430();
		} else if (Static147.anInt3288 == 85) {
			Static209.aClass27_30 = new Class27(22, true, Static108.aCanvas1);
			Static147.anInt3288 = 88;
			Static215.method3449(true);
			Static214.method3430();
		} else if (Static147.anInt3288 == 88) {
			Static176.aClass27_23 = new Class27(26, true, Static108.aCanvas1);
			Static147.anInt3288 = 91;
			Static215.method3449(true);
			Static214.method3430();
		} else {
			Static252.aClass27_35 = new Class27(30, true, Static108.aCanvas1);
			Static147.anInt3288 = 100;
			Static215.method3449(true);
			Static214.method3430();
			System.gc();
		}
	}
}
