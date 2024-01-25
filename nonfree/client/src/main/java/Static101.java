import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static101 {

	@OriginalMember(owner = "client!gp", name = "L", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_19 = new Class87(50);

	@OriginalMember(owner = "client!gp", name = "O", descriptor = "I")
	public static int anInt2415 = -1;

	@OriginalMember(owner = "client!gp", name = "T", descriptor = "I")
	public static int anInt2420 = -1;

	@OriginalMember(owner = "client!gp", name = "a", descriptor = "(Lclient!gd;Lclient!uo;B)V")
	public static void method2110(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) Class32 arg1) {
		if (Static79.aClass1_Sub4_Sub1_3 == null) {
			return;
		}
		if (Static243.anInt4977 < 10) {
			if (!Static79.aClass216_65.method5672(Static79.aClass1_Sub4_Sub1_3.aString2)) {
				Static243.anInt4977 = Static312.aClass216_74.method5644(Static79.aClass1_Sub4_Sub1_3.aString2) / 10;
				return;
			}
			Static293.method4936();
			Static243.anInt4977 = 10;
		}
		if (Static243.anInt4977 == 10) {
			Static79.anInt4162 = Static79.aClass1_Sub4_Sub1_3.anInt357 >> 6 << 6;
			Static79.anInt4157 = Static79.aClass1_Sub4_Sub1_3.anInt359 >> 6 << 6;
			Static79.anInt4158 = (Static79.aClass1_Sub4_Sub1_3.anInt354 >> 6 << 6) + 64 - Static79.anInt4162;
			Static79.anInt4165 = (Static79.aClass1_Sub4_Sub1_3.anInt355 >> 6 << 6) - (Static79.anInt4157 - 64);
			@Pc(80) int[] local80 = new int[3];
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = -1;
			if (Static79.aClass1_Sub4_Sub1_3.method318(Static234.anInt4783 + (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5109 >> 7), (Static198.aClass17_Sub1_Sub1_Sub1_3.anInt5108 >> 7) + Static32.anInt2224, local80, Static242.anInt6745)) {
				local84 = local80[2] - Static79.anInt4157;
				local82 = local80[1] - Static79.anInt4162;
			}
			if (!Static1.aBoolean6 && local82 >= 0 && Static79.anInt4158 > local82 && local84 >= 0 && local84 < Static79.anInt4165) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static62.anInt1771 = local82;
				Static169.anInt3636 = local84;
			} else if (anInt2420 == -1 || Static68.anInt1820 == -1) {
				Static79.aClass1_Sub4_Sub1_3.method316(Static79.aClass1_Sub4_Sub1_3.anInt358 >> 14 & 0x3FFF, local80, Static79.aClass1_Sub4_Sub1_3.anInt358 & 0x3FFF);
				Static62.anInt1771 = local80[1] - Static79.anInt4162;
				Static169.anInt3636 = local80[2] - Static79.anInt4157;
			} else {
				Static79.aClass1_Sub4_Sub1_3.method316(anInt2420, local80, Static68.anInt1820);
				Static1.aBoolean6 = false;
				Static68.anInt1820 = -1;
				anInt2420 = -1;
				if (local80 != null) {
					Static169.anInt3636 = local80[2] - Static79.anInt4157;
					Static62.anInt1771 = local80[1] - Static79.anInt4162;
				}
			}
			if (Static79.aClass1_Sub4_Sub1_3.anInt365 == 37) {
				Static79.aFloat49 = 3.0F;
				Static79.aFloat50 = 3.0F;
			} else if (Static79.aClass1_Sub4_Sub1_3.anInt365 == 50) {
				Static79.aFloat49 = 4.0F;
				Static79.aFloat50 = 4.0F;
			} else if (Static79.aClass1_Sub4_Sub1_3.anInt365 == 75) {
				Static79.aFloat49 = 6.0F;
				Static79.aFloat50 = 6.0F;
			} else if (Static79.aClass1_Sub4_Sub1_3.anInt365 == 100) {
				Static79.aFloat49 = 8.0F;
				Static79.aFloat50 = 8.0F;
			} else if (Static79.aClass1_Sub4_Sub1_3.anInt365 == 200) {
				Static79.aFloat49 = 16.0F;
				Static79.aFloat50 = 16.0F;
			} else {
				Static79.aFloat49 = 8.0F;
				Static79.aFloat50 = 8.0F;
			}
			Static79.anInt4154 = (int) Static79.aFloat49 >> 1;
			Static79.aByteArrayArrayArray7 = Static71.method3165(Static79.anInt4154);
			Static246.method4421();
			Static79.method3763();
			Static280.aClass16_32 = new Class16();
			Static79.anInt4156 += (int) (Math.random() * 5.0D) - 2;
			if (Static79.anInt4156 < -8) {
				Static79.anInt4156 = -8;
			}
			if (Static79.anInt4156 > 8) {
				Static79.anInt4156 = 8;
			}
			Static79.anInt4155 += (int) (Math.random() * 5.0D) - 2;
			if (Static79.anInt4155 < -16) {
				Static79.anInt4155 = -16;
			}
			if (Static79.anInt4155 > 16) {
				Static79.anInt4155 = 16;
			}
			Static79.method3759(arg0, Static79.anInt4156 >> 2 << 10, Static79.anInt4155 >> 1);
			Static136.method2777(1024, 256);
			Static125.method2611(256, 256);
			Static195.method3772(4096);
			Static244.method4388(256);
			Static243.anInt4977 = 20;
		} else if (Static243.anInt4977 == 20) {
			Static2.method64(true);
			Static79.method3758(arg1, Static79.anInt4156, Static79.anInt4155);
			Static243.anInt4977 = 60;
			Static2.method64(true);
			Static214.method4111();
		} else if (Static243.anInt4977 == 60) {
			if (Static79.aClass216_65.method5655(Static79.aClass1_Sub4_Sub1_3.aString2 + "_staticelements")) {
				if (!Static79.aClass216_65.method5672(Static79.aClass1_Sub4_Sub1_3.aString2 + "_staticelements")) {
					return;
				}
				Static79.aClass207_2 = Static36.method871(Static349.aBoolean659, Static79.aClass1_Sub4_Sub1_3.aString2 + "_staticelements", Static79.aClass216_65);
			} else {
				Static79.aClass207_2 = new Class207(0);
			}
			Static79.method3767();
			Static243.anInt4977 = 70;
			Static2.method64(true);
			Static214.method4111();
		} else if (Static243.anInt4977 == 70) {
			Static102.aClass106_2 = new Class106(arg1, 11, true, Static349.aCanvas5);
			Static243.anInt4977 = 73;
			Static2.method64(true);
			Static214.method4111();
		} else if (Static243.anInt4977 == 73) {
			Static199.aClass106_5 = new Class106(arg1, 12, true, Static349.aCanvas5);
			Static243.anInt4977 = 76;
			Static2.method64(true);
			Static214.method4111();
		} else if (Static243.anInt4977 == 76) {
			Static351.aClass106_9 = new Class106(arg1, 14, true, Static349.aCanvas5);
			Static243.anInt4977 = 79;
			Static2.method64(true);
			Static214.method4111();
		} else if (Static243.anInt4977 == 79) {
			Static212.aClass106_6 = new Class106(arg1, 17, true, Static349.aCanvas5);
			Static243.anInt4977 = 82;
			Static2.method64(true);
			Static214.method4111();
		} else if (Static243.anInt4977 == 82) {
			Static296.aClass106_7 = new Class106(arg1, 19, true, Static349.aCanvas5);
			Static243.anInt4977 = 85;
			Static2.method64(true);
			Static214.method4111();
		} else if (Static243.anInt4977 == 85) {
			Static322.aClass106_8 = new Class106(arg1, 22, true, Static349.aCanvas5);
			Static243.anInt4977 = 88;
			Static2.method64(true);
			Static214.method4111();
		} else if (Static243.anInt4977 == 88) {
			Static259.aClass106_4 = new Class106(arg1, 26, true, Static349.aCanvas5);
			Static243.anInt4977 = 91;
			Static2.method64(true);
			Static214.method4111();
		} else {
			Static52.aClass106_1 = new Class106(arg1, 30, true, Static349.aCanvas5);
			Static243.anInt4977 = 100;
			Static2.method64(true);
			Static214.method4111();
			System.gc();
		}
	}
}
