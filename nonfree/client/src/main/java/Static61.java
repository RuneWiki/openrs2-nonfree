import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ce", name = "k", descriptor = "[I")
	public static int[] anIntArray66;

	@OriginalMember(owner = "client!ce", name = "I", descriptor = "I")
	public static int anInt1040 = -1;

	@OriginalMember(owner = "client!ce", name = "w", descriptor = "Z")
	public static boolean aBoolean83 = false;

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(III)V")
	public static void method1056(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class5_Sub1_Sub18 local9 = Static123.method1827((long) arg1, 7);
		local9.method7441();
		local9.anInt8635 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "(I)V")
	public static void method1058() {
		Static446.aClass36_1.method3803();
		for (@Pc(17) int local17 = 0; local17 < 32; local17++) {
			Static656.aLongArray21[local17] = 0L;
		}
		for (@Pc(31) int local31 = 0; local31 < 32; local31++) {
			Static7.aLongArray2[local31] = 0L;
		}
		Static261.anInt4684 = 0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZLclient!ha;Lclient!d;)V")
	public static void method1060(@OriginalArg(1) Class100 arg0, @OriginalArg(2) Interface7 arg1) {
		if (Static491.aClass5_Sub1_Sub16_2 == null) {
			return;
		}
		if (Static455.anInt7370 < 10) {
			if (!Static491.aClass126_25.method3074(Static491.aClass5_Sub1_Sub16_2.aString88)) {
				Static455.anInt7370 = Static460.aClass126_211.method3087(Static491.aClass5_Sub1_Sub16_2.aString88) / 10;
				return;
			}
			Static606.method8315();
			Static455.anInt7370 = 10;
		}
		if (Static455.anInt7370 == 10) {
			Static491.anInt622 = Static491.aClass5_Sub1_Sub16_2.anInt7437 >> 6 << 6;
			Static491.anInt617 = Static491.aClass5_Sub1_Sub16_2.anInt7439 >> 6 << 6;
			Static491.anInt619 = (Static491.aClass5_Sub1_Sub16_2.anInt7436 >> 6 << 6) + 64 - Static491.anInt617;
			Static491.anInt624 = (Static491.aClass5_Sub1_Sub16_2.anInt7447 >> 6 << 6) + (64 - Static491.anInt622);
			@Pc(79) int[] local79 = new int[3];
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = -1;
			if (Static491.aClass5_Sub1_Sub16_2.method6483(Static315.anInt5380 + (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9805 >> 9), Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aByte139, (Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.anInt9803 >> 9) + Static290.anInt5128, local79)) {
				local83 = local79[2] - Static491.anInt617;
				local81 = local79[1] - Static491.anInt622;
			}
			if (!Static380.aBoolean423 && local81 >= 0 && local81 < Static491.anInt624 && local83 >= 0 && Static491.anInt619 > local83) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local83 += (int) (Math.random() * 10.0D) - 5;
				Static381.anInt6410 = local83;
				Static124.anInt2052 = local81;
			} else if (Static429.anInt7127 == -1 || Static621.anInt3545 == -1) {
				Static491.aClass5_Sub1_Sub16_2.method6482(Static491.aClass5_Sub1_Sub16_2.anInt7442 >> 14 & 0x3FFF, Static491.aClass5_Sub1_Sub16_2.anInt7442 & 0x3FFF, local79);
				Static124.anInt2052 = local79[1] - Static491.anInt622;
				Static381.anInt6410 = local79[2] - Static491.anInt617;
			} else {
				Static491.aClass5_Sub1_Sub16_2.method6482(Static429.anInt7127, Static621.anInt3545, local79);
				if (local79 != null) {
					Static381.anInt6410 = local79[2] - Static491.anInt617;
					Static124.anInt2052 = local79[1] - Static491.anInt622;
				}
				Static380.aBoolean423 = false;
				Static621.anInt3545 = -1;
				Static429.anInt7127 = -1;
			}
			if (Static491.aClass5_Sub1_Sub16_2.anInt7448 == 37) {
				Static491.aFloat23 = 3.0F;
				Static491.aFloat24 = 3.0F;
			} else if (Static491.aClass5_Sub1_Sub16_2.anInt7448 == 50) {
				Static491.aFloat23 = 4.0F;
				Static491.aFloat24 = 4.0F;
			} else if (Static491.aClass5_Sub1_Sub16_2.anInt7448 == 75) {
				Static491.aFloat23 = 6.0F;
				Static491.aFloat24 = 6.0F;
			} else if (Static491.aClass5_Sub1_Sub16_2.anInt7448 == 100) {
				Static491.aFloat23 = 8.0F;
				Static491.aFloat24 = 8.0F;
			} else if (Static491.aClass5_Sub1_Sub16_2.anInt7448 == 200) {
				Static491.aFloat23 = 16.0F;
				Static491.aFloat24 = 16.0F;
			} else {
				Static491.aFloat23 = 8.0F;
				Static491.aFloat24 = 8.0F;
			}
			Static491.anInt616 = (int) Static491.aFloat23 >> 1;
			Static491.aByteArrayArrayArray4 = Static362.method8359(Static491.anInt616, (byte) 127);
			Static127.method1898();
			Static491.method662();
			Static542.aClass20_47 = new Class20();
			Static491.anInt614 += (int) (Math.random() * 5.0D) - 2;
			if (Static491.anInt614 < -8) {
				Static491.anInt614 = -8;
			}
			Static491.anInt615 += (int) (Math.random() * 5.0D) - 2;
			if (Static491.anInt614 > 8) {
				Static491.anInt614 = 8;
			}
			if (Static491.anInt615 < -16) {
				Static491.anInt615 = -16;
			}
			if (Static491.anInt615 > 16) {
				Static491.anInt615 = 16;
			}
			Static491.method661(arg1, Static491.anInt614 >> 2 << 10, Static491.anInt615 >> 1);
			Static491.aClass327_2.method7415(256, 1024);
			Static491.aClass97_2.method1932(256, 256);
			Static491.aClass243_2.method5551(4096);
			Static284.aClass305_1.method6902(256);
			Static455.anInt7370 = 20;
		} else if (Static455.anInt7370 == 20) {
			Static179.method3125(true);
			Static491.method671(arg0, Static491.anInt614, Static491.anInt615);
			Static455.anInt7370 = 60;
			Static179.method3125(true);
			method1058();
		} else if (Static455.anInt7370 == 60) {
			if (Static491.aClass126_25.method3075(Static491.aClass5_Sub1_Sub16_2.aString88 + "_staticelements")) {
				if (!Static491.aClass126_25.method3074(Static491.aClass5_Sub1_Sub16_2.aString88 + "_staticelements")) {
					return;
				}
				Static491.aClass396_2 = Static501.method6965(Static491.aClass126_25, Static504.aBoolean543, Static491.aClass5_Sub1_Sub16_2.aString88 + "_staticelements");
			} else {
				Static491.aClass396_2 = new Class396(0);
			}
			Static491.method654();
			Static455.anInt7370 = 70;
			Static179.method3125(true);
			method1058();
		} else if (Static455.anInt7370 == 70) {
			Static592.aClass371_12 = new Class371(arg0, 11, true, Static357.aCanvas8);
			Static455.anInt7370 = 73;
			Static179.method3125(true);
			method1058();
		} else if (Static455.anInt7370 == 73) {
			Static505.aClass371_10 = new Class371(arg0, 12, true, Static357.aCanvas8);
			Static455.anInt7370 = 76;
			Static179.method3125(true);
			method1058();
		} else if (Static455.anInt7370 == 76) {
			Static512.aClass371_11 = new Class371(arg0, 14, true, Static357.aCanvas8);
			Static455.anInt7370 = 79;
			Static179.method3125(true);
			method1058();
		} else if (Static455.anInt7370 == 79) {
			Static647.aClass371_15 = new Class371(arg0, 17, true, Static357.aCanvas8);
			Static455.anInt7370 = 82;
			Static179.method3125(true);
			method1058();
		} else if (Static455.anInt7370 == 82) {
			Static439.aClass371_9 = new Class371(arg0, 19, true, Static357.aCanvas8);
			Static455.anInt7370 = 85;
			Static179.method3125(true);
			method1058();
		} else if (Static455.anInt7370 == 85) {
			Static286.aClass371_14 = new Class371(arg0, 22, true, Static357.aCanvas8);
			Static455.anInt7370 = 88;
			Static179.method3125(true);
			method1058();
		} else if (Static455.anInt7370 == 88) {
			Static158.aClass371_5 = new Class371(arg0, 26, true, Static357.aCanvas8);
			Static455.anInt7370 = 91;
			Static179.method3125(true);
			method1058();
		} else {
			Static680.aClass371_16 = new Class371(arg0, 30, true, Static357.aCanvas8);
			Static455.anInt7370 = 100;
			Static179.method3125(true);
			method1058();
			System.gc();
		}
	}
}
