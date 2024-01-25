import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!ti", name = "s", descriptor = "I")
	public static int anInt8080;

	@OriginalMember(owner = "client!ti", name = "t", descriptor = "Lclient!fu;")
	public static Class106 aClass106_7;

	@OriginalMember(owner = "client!ti", name = "j", descriptor = "[I")
	public static final int[] anIntArray620 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

	@OriginalMember(owner = "client!ti", name = "p", descriptor = "Lclient!sl;")
	public static final Class310 aClass310_33 = new Class310(64);

	@OriginalMember(owner = "client!ti", name = "r", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[5];

	@OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lclient!r;Lclient!fa;I)V")
	public static void method6811(@OriginalArg(0) Class43 arg0, @OriginalArg(1) Interface8 arg1) {
		if (Static284.aClass3_Sub3_Sub3_3 == null) {
			return;
		}
		if (Static277.anInt5091 < 10) {
			if (!Static284.aClass246_230.method5669(Static284.aClass3_Sub3_Sub3_3.aString8)) {
				Static277.anInt5091 = Static494.aClass246_232.method5664(Static284.aClass3_Sub3_Sub3_3.aString8) / 10;
				return;
			}
			Static71.method1658();
			Static277.anInt5091 = 10;
		}
		if (Static277.anInt5091 == 10) {
			Static284.anInt7865 = Static284.aClass3_Sub3_Sub3_3.anInt238 >> 6 << 6;
			Static284.anInt7863 = Static284.aClass3_Sub3_Sub3_3.anInt230 >> 6 << 6;
			Static284.anInt7855 = (Static284.aClass3_Sub3_Sub3_3.anInt235 >> 6 << 6) + 64 - Static284.anInt7865;
			Static284.anInt7858 = (Static284.aClass3_Sub3_Sub3_3.anInt237 >> 6 << 6) + 64 - Static284.anInt7863;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static284.aClass3_Sub3_Sub3_3.method249(Static529.anInt8344 + (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8975 >> 9), (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.anInt8980 >> 9) + Static463.anInt7588, local74, Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2.aByte126)) {
				local78 = local74[2] - Static284.anInt7865;
				local76 = local74[1] - Static284.anInt7863;
			}
			if (!Static489.aBoolean616 && local76 >= 0 && local76 < Static284.anInt7858 && local78 >= 0 && local78 < Static284.anInt7855) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local76 += (int) (Math.random() * 10.0D) - 5;
				Static319.anInt5778 = local76;
				Static236.anInt4460 = local78;
			} else if (Static321.anInt5794 == -1 || Static583.anInt9305 == -1) {
				Static284.aClass3_Sub3_Sub3_3.method247(Static284.aClass3_Sub3_Sub3_3.anInt231 >> 14 & 0x3FFF, Static284.aClass3_Sub3_Sub3_3.anInt231 & 0x3FFF, local74);
				Static236.anInt4460 = local74[2] - Static284.anInt7865;
				Static319.anInt5778 = local74[1] - Static284.anInt7863;
			} else {
				Static284.aClass3_Sub3_Sub3_3.method247(Static321.anInt5794, Static583.anInt9305, local74);
				Static583.anInt9305 = -1;
				Static321.anInt5794 = -1;
				if (local74 != null) {
					Static319.anInt5778 = local74[1] - Static284.anInt7863;
					Static236.anInt4460 = local74[2] - Static284.anInt7865;
				}
				Static489.aBoolean616 = false;
			}
			if (Static284.aClass3_Sub3_Sub3_3.anInt233 == 37) {
				Static284.aFloat160 = 3.0F;
				Static284.aFloat161 = 3.0F;
			} else if (Static284.aClass3_Sub3_Sub3_3.anInt233 == 50) {
				Static284.aFloat160 = 4.0F;
				Static284.aFloat161 = 4.0F;
			} else if (Static284.aClass3_Sub3_Sub3_3.anInt233 == 75) {
				Static284.aFloat160 = 6.0F;
				Static284.aFloat161 = 6.0F;
			} else if (Static284.aClass3_Sub3_Sub3_3.anInt233 == 100) {
				Static284.aFloat160 = 8.0F;
				Static284.aFloat161 = 8.0F;
			} else if (Static284.aClass3_Sub3_Sub3_3.anInt233 == 200) {
				Static284.aFloat160 = 16.0F;
				Static284.aFloat161 = 16.0F;
			} else {
				Static284.aFloat160 = 8.0F;
				Static284.aFloat161 = 8.0F;
			}
			Static284.anInt7854 = (int) Static284.aFloat160 >> 1;
			Static284.aByteArrayArrayArray17 = Static308.method4826(Static284.anInt7854);
			Static132.method2577();
			Static284.method6643();
			Static552.aClass130_63 = new Class130();
			Static284.anInt7853 += (int) (Math.random() * 5.0D) - 2;
			if (Static284.anInt7853 < -8) {
				Static284.anInt7853 = -8;
			}
			Static284.anInt7852 += (int) (Math.random() * 5.0D) - 2;
			if (Static284.anInt7853 > 8) {
				Static284.anInt7853 = 8;
			}
			if (Static284.anInt7852 < -16) {
				Static284.anInt7852 = -16;
			}
			if (Static284.anInt7852 > 16) {
				Static284.anInt7852 = 16;
			}
			Static284.method6634(arg1, Static284.anInt7853 >> 2 << 10, Static284.anInt7852 >> 1);
			Static284.aClass168_4.method4063(256, 1024);
			Static284.aClass348_4.method7401(256, 256);
			Static284.aClass69_4.method2179(4096);
			Static165.aClass212_1.method5092(256);
			Static277.anInt5091 = 20;
		} else if (Static277.anInt5091 == 20) {
			Static355.method5325(true);
			Static284.method6631(arg0, Static284.anInt7853, Static284.anInt7852);
			Static277.anInt5091 = 60;
			Static355.method5325(true);
			Static488.method6648();
		} else if (Static277.anInt5091 == 60) {
			if (Static284.aClass246_230.method5663(Static284.aClass3_Sub3_Sub3_3.aString8 + "_staticelements")) {
				if (!Static284.aClass246_230.method5669(Static284.aClass3_Sub3_Sub3_3.aString8 + "_staticelements")) {
					return;
				}
				Static284.aClass149_3 = Static197.method3571(Static284.aClass3_Sub3_Sub3_3.aString8 + "_staticelements", Static284.aClass246_230, Static137.aBoolean250);
			} else {
				Static284.aClass149_3 = new Class149(0);
			}
			Static284.method6624();
			Static277.anInt5091 = 70;
			Static355.method5325(true);
			Static488.method6648();
		} else if (Static277.anInt5091 == 70) {
			Static108.aClass106_1 = new Class106(arg0, 11, true, Static347.aCanvas9);
			Static277.anInt5091 = 73;
			Static355.method5325(true);
			Static488.method6648();
		} else if (Static277.anInt5091 == 73) {
			Static217.aClass106_3 = new Class106(arg0, 12, true, Static347.aCanvas9);
			Static277.anInt5091 = 76;
			Static355.method5325(true);
			Static488.method6648();
		} else if (Static277.anInt5091 == 76) {
			Static152.aClass106_2 = new Class106(arg0, 14, true, Static347.aCanvas9);
			Static277.anInt5091 = 79;
			Static355.method5325(true);
			Static488.method6648();
		} else if (Static277.anInt5091 == 79) {
			Static287.aClass106_4 = new Class106(arg0, 17, true, Static347.aCanvas9);
			Static277.anInt5091 = 82;
			Static355.method5325(true);
			Static488.method6648();
		} else if (Static277.anInt5091 == 82) {
			Static455.aClass106_6 = new Class106(arg0, 19, true, Static347.aCanvas9);
			Static277.anInt5091 = 85;
			Static355.method5325(true);
			Static488.method6648();
		} else if (Static277.anInt5091 == 85) {
			Static426.aClass106_5 = new Class106(arg0, 22, true, Static347.aCanvas9);
			Static277.anInt5091 = 88;
			Static355.method5325(true);
			Static488.method6648();
		} else if (Static277.anInt5091 == 88) {
			Static525.aClass106_8 = new Class106(arg0, 26, true, Static347.aCanvas9);
			Static277.anInt5091 = 91;
			Static355.method5325(true);
			Static488.method6648();
		} else {
			aClass106_7 = new Class106(arg0, 30, true, Static347.aCanvas9);
			Static277.anInt5091 = 100;
			Static355.method5325(true);
			Static488.method6648();
			System.gc();
		}
	}
}
