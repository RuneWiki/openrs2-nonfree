import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static325 {

	@OriginalMember(owner = "client!ll", name = "z", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray17;

	@OriginalMember(owner = "client!ll", name = "J", descriptor = "I")
	public static int anInt6089;

	@OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
	public static int anInt6083 = 0;

	@OriginalMember(owner = "client!ll", name = "E", descriptor = "[I")
	public static final int[] anIntArray346 = new int[14];

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lclient!ha;Lclient!d;I)V")
	public static void method5298(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Interface7 arg1) {
		if (Static110.aClass3_Sub4_Sub11_3 == null) {
			return;
		}
		if (Static368.anInt6962 < 10) {
			if (!Static110.aClass196_32.method5106(Static110.aClass3_Sub4_Sub11_3.aString40)) {
				Static368.anInt6962 = Static508.aClass196_106.method5105(Static110.aClass3_Sub4_Sub11_3.aString40) / 10;
				return;
			}
			Static508.method7595();
			Static368.anInt6962 = 10;
		}
		if (Static368.anInt6962 == 10) {
			Static110.anInt3014 = Static110.aClass3_Sub4_Sub11_3.anInt3863 >> 6 << 6;
			Static110.anInt3012 = Static110.aClass3_Sub4_Sub11_3.anInt3861 >> 6 << 6;
			Static110.anInt3019 = (Static110.aClass3_Sub4_Sub11_3.anInt3867 >> 6 << 6) + 64 - Static110.anInt3014;
			Static110.anInt3020 = (Static110.aClass3_Sub4_Sub11_3.anInt3860 >> 6 << 6) + 64 - Static110.anInt3012;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static110.aClass3_Sub4_Sub11_3.method3414(local78, (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8911 >> 9) + Static171.anInt3340, Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.aByte123, Static299.anInt5307 + (Static477.aClass4_Sub1_Sub2_Sub1_Sub2_2.anInt8916 >> 9))) {
				local80 = local78[1] - Static110.anInt3014;
				local82 = local78[2] - Static110.anInt3012;
			}
			if (!Static513.aBoolean632 && local80 >= 0 && Static110.anInt3019 > local80 && local82 >= 0 && local82 < Static110.anInt3020) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static561.anInt9391 = local82;
				Static365.anInt6941 = local80;
			} else if (Static414.anInt7569 == -1 || Static624.anInt10064 == -1) {
				Static110.aClass3_Sub4_Sub11_3.method3413(local78, Static110.aClass3_Sub4_Sub11_3.anInt3862 >> 14 & 0x3FFF, Static110.aClass3_Sub4_Sub11_3.anInt3862 & 0x3FFF);
				Static561.anInt9391 = local78[2] - Static110.anInt3012;
				Static365.anInt6941 = local78[1] - Static110.anInt3014;
			} else {
				Static110.aClass3_Sub4_Sub11_3.method3413(local78, Static414.anInt7569, Static624.anInt10064);
				if (local78 != null) {
					Static365.anInt6941 = local78[1] - Static110.anInt3014;
					Static561.anInt9391 = local78[2] - Static110.anInt3012;
				}
				Static513.aBoolean632 = false;
				Static624.anInt10064 = -1;
				Static414.anInt7569 = -1;
			}
			if (Static110.aClass3_Sub4_Sub11_3.anInt3855 == 37) {
				Static110.aFloat79 = 3.0F;
				Static110.aFloat80 = 3.0F;
			} else if (Static110.aClass3_Sub4_Sub11_3.anInt3855 == 50) {
				Static110.aFloat79 = 4.0F;
				Static110.aFloat80 = 4.0F;
			} else if (Static110.aClass3_Sub4_Sub11_3.anInt3855 == 75) {
				Static110.aFloat79 = 6.0F;
				Static110.aFloat80 = 6.0F;
			} else if (Static110.aClass3_Sub4_Sub11_3.anInt3855 == 100) {
				Static110.aFloat79 = 8.0F;
				Static110.aFloat80 = 8.0F;
			} else if (Static110.aClass3_Sub4_Sub11_3.anInt3855 == 200) {
				Static110.aFloat79 = 16.0F;
				Static110.aFloat80 = 16.0F;
			} else {
				Static110.aFloat79 = 8.0F;
				Static110.aFloat80 = 8.0F;
			}
			Static110.anInt3009 = (int) Static110.aFloat79 >> 1;
			Static110.aByteArrayArrayArray15 = Static327.method5316(Static110.anInt3009);
			Static509.method7605();
			Static110.method2792();
			Static566.aClass223_60 = new Class223();
			Static110.anInt3011 += (int) (Math.random() * 5.0D) - 2;
			if (Static110.anInt3011 < -8) {
				Static110.anInt3011 = -8;
			}
			Static110.anInt3010 += (int) (Math.random() * 5.0D) - 2;
			if (Static110.anInt3011 > 8) {
				Static110.anInt3011 = 8;
			}
			if (Static110.anInt3010 < -16) {
				Static110.anInt3010 = -16;
			}
			if (Static110.anInt3010 > 16) {
				Static110.anInt3010 = 16;
			}
			Static110.method2784(arg1, Static110.anInt3011 >> 2 << 10, Static110.anInt3010 >> 1);
			Static110.aClass335_4.method8128(1024, 256);
			Static110.aClass202_3.method5164(256, 256);
			Static110.aClass302_3.method7467(4096);
			Static169.aClass187_1.method4658(256);
			Static368.anInt6962 = 20;
		} else if (Static368.anInt6962 == 20) {
			Static644.method8773(true);
			Static110.method2793(arg0, Static110.anInt3011, Static110.anInt3010);
			Static368.anInt6962 = 60;
			Static644.method8773(true);
			Static504.method7455();
		} else if (Static368.anInt6962 == 60) {
			if (Static110.aClass196_32.method5107(Static110.aClass3_Sub4_Sub11_3.aString40 + "_staticelements")) {
				if (!Static110.aClass196_32.method5106(Static110.aClass3_Sub4_Sub11_3.aString40 + "_staticelements")) {
					return;
				}
				Static110.aClass156_2 = Static477.method7145(Static475.aBoolean582, Static110.aClass196_32, Static110.aClass3_Sub4_Sub11_3.aString40 + "_staticelements");
			} else {
				Static110.aClass156_2 = new Class156(0);
			}
			Static110.method2801();
			Static368.anInt6962 = 70;
			Static644.method8773(true);
			Static504.method7455();
		} else if (Static368.anInt6962 == 70) {
			Static168.aClass172_4 = new Class172(arg0, 11, true, Static364.aCanvas13);
			Static368.anInt6962 = 73;
			Static644.method8773(true);
			Static504.method7455();
		} else if (Static368.anInt6962 == 73) {
			Static422.aClass172_7 = new Class172(arg0, 12, true, Static364.aCanvas13);
			Static368.anInt6962 = 76;
			Static644.method8773(true);
			Static504.method7455();
		} else if (Static368.anInt6962 == 76) {
			Static357.aClass172_6 = new Class172(arg0, 14, true, Static364.aCanvas13);
			Static368.anInt6962 = 79;
			Static644.method8773(true);
			Static504.method7455();
		} else if (Static368.anInt6962 == 79) {
			Static512.aClass172_11 = new Class172(arg0, 17, true, Static364.aCanvas13);
			Static368.anInt6962 = 82;
			Static644.method8773(true);
			Static504.method7455();
		} else if (Static368.anInt6962 == 82) {
			Static142.aClass172_12 = new Class172(arg0, 19, true, Static364.aCanvas13);
			Static368.anInt6962 = 85;
			Static644.method8773(true);
			Static504.method7455();
		} else if (Static368.anInt6962 == 85) {
			Static424.aClass172_8 = new Class172(arg0, 22, true, Static364.aCanvas13);
			Static368.anInt6962 = 88;
			Static644.method8773(true);
			Static504.method7455();
		} else if (Static368.anInt6962 == 88) {
			Static54.aClass172_1 = new Class172(arg0, 26, true, Static364.aCanvas13);
			Static368.anInt6962 = 91;
			Static644.method8773(true);
			Static504.method7455();
		} else {
			Static289.aClass172_10 = new Class172(arg0, 30, true, Static364.aCanvas13);
			Static368.anInt6962 = 100;
			Static644.method8773(true);
			Static504.method7455();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(BLclient!gt;)V")
	public static void method5300(@OriginalArg(1) Class4_Sub1_Sub2_Sub1_Sub1 arg0) {
		for (@Pc(10) Class3_Sub22 local10 = (Class3_Sub22) Static456.aClass223_48.method5874(); local10 != null; local10 = (Class3_Sub22) Static456.aClass223_48.method5870()) {
			if (local10.aClass4_Sub1_Sub2_Sub1_Sub1_1 == arg0) {
				if (local10.aClass3_Sub7_Sub3_1 != null) {
					Static204.aClass3_Sub7_Sub1_1.method1621(local10.aClass3_Sub7_Sub3_1);
					local10.aClass3_Sub7_Sub3_1 = null;
				}
				local10.method8769();
				return;
			}
		}
	}
}
