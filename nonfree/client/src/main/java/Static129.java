import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static129 {

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "Lclient!xa;")
	public static Class119 aClass119_11;

	@OriginalMember(owner = "client!fca", name = "u", descriptor = "I")
	public static int anInt2692;

	@OriginalMember(owner = "client!fca", name = "k", descriptor = "Lclient!kca;")
	public static final Class158 aClass158_33 = new Class158(19, 8);

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILclient!oa;Lclient!e;)V")
	public static void method2263(@OriginalArg(1) Class5 arg0, @OriginalArg(2) Interface4 arg1) {
		if (Static55.aClass3_Sub10_Sub5_2 == null) {
			return;
		}
		if (Static133.anInt2744 < 10) {
			if (!Static55.aClass161_20.method4246(Static55.aClass3_Sub10_Sub5_2.aString18)) {
				Static133.anInt2744 = Static4.aClass161_114.method4267(Static55.aClass3_Sub10_Sub5_2.aString18) / 10;
				return;
			}
			Static288.method4874();
			Static133.anInt2744 = 10;
		}
		if (Static133.anInt2744 == 10) {
			Static55.anInt1978 = Static55.aClass3_Sub10_Sub5_2.anInt1890 >> 6 << 6;
			Static55.anInt1974 = Static55.aClass3_Sub10_Sub5_2.anInt1889 >> 6 << 6;
			Static55.anInt1982 = (Static55.aClass3_Sub10_Sub5_2.anInt1880 >> 6 << 6) + 64 - Static55.anInt1974;
			Static55.anInt1972 = (Static55.aClass3_Sub10_Sub5_2.anInt1884 >> 6 << 6) + 64 - Static55.anInt1978;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static55.aClass3_Sub10_Sub5_2.method1776((Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8813 >> 9) + Static150.anInt3027, Static111.aClass6_Sub1_Sub2_Sub1_3.aByte100, (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt8811 >> 9) + Static223.anInt4827, local76)) {
				local80 = local76[2] - Static55.anInt1974;
				local78 = local76[1] - Static55.anInt1978;
			}
			if (!Static356.aBoolean426 && local78 >= 0 && Static55.anInt1972 > local78 && local80 >= 0 && local80 < Static55.anInt1982) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				anInt2692 = local80;
				Static256.anInt5191 = local78;
			} else if (Static340.anInt6417 == -1 || Static338.anInt6411 == -1) {
				Static55.aClass3_Sub10_Sub5_2.method1772(Static55.aClass3_Sub10_Sub5_2.anInt1883 & 0x3FFF, local76, Static55.aClass3_Sub10_Sub5_2.anInt1883 >> 14 & 0x3FFF);
				Static256.anInt5191 = local76[1] - Static55.anInt1978;
				anInt2692 = local76[2] - Static55.anInt1974;
			} else {
				Static55.aClass3_Sub10_Sub5_2.method1772(Static338.anInt6411, local76, Static340.anInt6417);
				if (local76 != null) {
					anInt2692 = local76[2] - Static55.anInt1974;
					Static256.anInt5191 = local76[1] - Static55.anInt1978;
				}
				Static338.anInt6411 = -1;
				Static340.anInt6417 = -1;
				Static356.aBoolean426 = false;
			}
			if (Static55.aClass3_Sub10_Sub5_2.anInt1893 == 37) {
				Static55.aFloat69 = 3.0F;
				Static55.aFloat68 = 3.0F;
			} else if (Static55.aClass3_Sub10_Sub5_2.anInt1893 == 50) {
				Static55.aFloat69 = 4.0F;
				Static55.aFloat68 = 4.0F;
			} else if (Static55.aClass3_Sub10_Sub5_2.anInt1893 == 75) {
				Static55.aFloat69 = 6.0F;
				Static55.aFloat68 = 6.0F;
			} else if (Static55.aClass3_Sub10_Sub5_2.anInt1893 == 100) {
				Static55.aFloat69 = 8.0F;
				Static55.aFloat68 = 8.0F;
			} else if (Static55.aClass3_Sub10_Sub5_2.anInt1893 == 200) {
				Static55.aFloat69 = 16.0F;
				Static55.aFloat68 = 16.0F;
			} else {
				Static55.aFloat69 = 8.0F;
				Static55.aFloat68 = 8.0F;
			}
			Static55.anInt1969 = (int) Static55.aFloat69 >> 1;
			Static55.aByteArrayArrayArray3 = Static524.method7520(Static55.anInt1969);
			Static374.method5885();
			Static55.method1831();
			Static325.aClass71_47 = new Class71();
			Static55.anInt1971 += (int) (Math.random() * 5.0D) - 2;
			if (Static55.anInt1971 < -8) {
				Static55.anInt1971 = -8;
			}
			if (Static55.anInt1971 > 8) {
				Static55.anInt1971 = 8;
			}
			Static55.anInt1970 += (int) (Math.random() * 5.0D) - 2;
			if (Static55.anInt1970 < -16) {
				Static55.anInt1970 = -16;
			}
			if (Static55.anInt1970 > 16) {
				Static55.anInt1970 = 16;
			}
			Static55.method1848(arg1, Static55.anInt1971 >> 2 << 10, Static55.anInt1970 >> 1);
			Static55.aClass135_2.method3800(1024, 256);
			Static55.aClass198_5.method5096(256, 256);
			Static55.aClass298_2.method7188(4096);
			Static231.aClass280_1.method6919(256);
			Static133.anInt2744 = 20;
		} else if (Static133.anInt2744 == 20) {
			Static300.method6522(true);
			Static55.method1840(arg0, Static55.anInt1971, Static55.anInt1970);
			Static133.anInt2744 = 60;
			Static300.method6522(true);
			Static221.method4024();
		} else if (Static133.anInt2744 == 60) {
			if (Static55.aClass161_20.method4251(Static55.aClass3_Sub10_Sub5_2.aString18 + "_staticelements")) {
				if (!Static55.aClass161_20.method4246(Static55.aClass3_Sub10_Sub5_2.aString18 + "_staticelements")) {
					return;
				}
				Static55.aClass82_2 = Static332.method5276(Static55.aClass3_Sub10_Sub5_2.aString18 + "_staticelements", Static55.aClass161_20, Static56.aBoolean91);
			} else {
				Static55.aClass82_2 = new Class82(0);
			}
			Static55.method1842();
			Static133.anInt2744 = 70;
			Static300.method6522(true);
			Static221.method4024();
		} else if (Static133.anInt2744 == 70) {
			Static131.aClass106_3 = new Class106(arg0, 11, true, Static549.aCanvas15);
			Static133.anInt2744 = 73;
			Static300.method6522(true);
			Static221.method4024();
		} else if (Static133.anInt2744 == 73) {
			Static131.aClass106_2 = new Class106(arg0, 12, true, Static549.aCanvas15);
			Static133.anInt2744 = 76;
			Static300.method6522(true);
			Static221.method4024();
		} else if (Static133.anInt2744 == 76) {
			Static509.aClass106_9 = new Class106(arg0, 14, true, Static549.aCanvas15);
			Static133.anInt2744 = 79;
			Static300.method6522(true);
			Static221.method4024();
		} else if (Static133.anInt2744 == 79) {
			Static446.aClass106_7 = new Class106(arg0, 17, true, Static549.aCanvas15);
			Static133.anInt2744 = 82;
			Static300.method6522(true);
			Static221.method4024();
		} else if (Static133.anInt2744 == 82) {
			Static98.aClass106_1 = new Class106(arg0, 19, true, Static549.aCanvas15);
			Static133.anInt2744 = 85;
			Static300.method6522(true);
			Static221.method4024();
		} else if (Static133.anInt2744 == 85) {
			Static480.aClass106_8 = new Class106(arg0, 22, true, Static549.aCanvas15);
			Static133.anInt2744 = 88;
			Static300.method6522(true);
			Static221.method4024();
		} else if (Static133.anInt2744 == 88) {
			Static499.aClass106_5 = new Class106(arg0, 26, true, Static549.aCanvas15);
			Static133.anInt2744 = 91;
			Static300.method6522(true);
			Static221.method4024();
		} else {
			Static192.aClass106_6 = new Class106(arg0, 30, true, Static549.aCanvas15);
			Static133.anInt2744 = 100;
			Static300.method6522(true);
			Static221.method4024();
			System.gc();
		}
	}
}
