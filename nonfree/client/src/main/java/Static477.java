import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static477 {

	@OriginalMember(owner = "client!rba", name = "A", descriptor = "I")
	public static int anInt8929;

	@OriginalMember(owner = "client!rba", name = "s", descriptor = "Lclient!ej;")
	public static final Class94 aClass94_90 = new Class94(68, 2);

	@OriginalMember(owner = "client!rba", name = "z", descriptor = "I")
	public static int anInt8928 = 0;

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(IILclient!ha;IIZII)V")
	public static void method7478(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class20 arg2, @OriginalArg(3) int arg3, @OriginalArg(6) int arg4) {
		arg2.method7278(arg0, arg3, arg1, arg4, -10660793);
		arg2.method7278(arg0 - 2, arg3 + 1, arg1 + 1, 16, -16777216);
		arg2.method7271(arg0 - 2, arg1 + 18, -16777216, arg3 + 1, arg4 + -19);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!in;Lclient!ma;Lclient!in;ZLclient!cba;Lclient!in;)Z")
	public static boolean method7479(@OriginalArg(0) Class157 arg0, @OriginalArg(1) Class2_Sub8_Sub3 arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(4) Class33 arg3, @OriginalArg(5) Class157 arg4) {
		Static455.aClass33_22 = arg3;
		Static341.aClass2_Sub8_Sub3_4 = arg1;
		Static242.aClass157_120 = arg0;
		Static302.aClass157_149 = arg4;
		Static10.aClass157_5 = arg2;
		Static537.anIntArray638 = new int[16];
		for (@Pc(25) int local25 = 0; local25 < 16; local25++) {
			Static537.anIntArray638[local25] = 255;
		}
		return true;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!d;Lclient!ha;I)V")
	public static void method7481(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class20 arg1) {
		if (Static303.aClass2_Sub6_Sub4_2 == null) {
			return;
		}
		if (Static124.anInt11089 < 10) {
			if (!Static303.aClass157_4.method4567(Static303.aClass2_Sub6_Sub4_2.aString22)) {
				Static124.anInt11089 = Static474.aClass157_237.method4551(Static303.aClass2_Sub6_Sub4_2.aString22) / 10;
				return;
			}
			Static128.method3008();
			Static124.anInt11089 = 10;
		}
		if (Static124.anInt11089 == 10) {
			Static303.anInt110 = Static303.aClass2_Sub6_Sub4_2.anInt2723 >> 6 << 6;
			Static303.anInt108 = Static303.aClass2_Sub6_Sub4_2.anInt2722 >> 6 << 6;
			Static303.anInt106 = (Static303.aClass2_Sub6_Sub4_2.anInt2716 >> 6 << 6) + 64 - Static303.anInt110;
			Static303.anInt111 = (Static303.aClass2_Sub6_Sub4_2.anInt2710 >> 6 << 6) + 64 - Static303.anInt108;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static303.aClass2_Sub6_Sub4_2.method2556(local74, Static84.anInt2565 + (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10303 >> 9), (Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.anInt10310 >> 9) + Static32.anInt723, Static380.aClass3_Sub1_Sub3_Sub3_Sub2_2.aByte132)) {
				local76 = local74[1] - Static303.anInt110;
				local78 = local74[2] - Static303.anInt108;
			}
			if (!Static323.aBoolean492 && local76 >= 0 && Static303.anInt106 > local76 && local78 >= 0 && Static303.anInt111 > local78) {
				local76 += (int) (Math.random() * 10.0D) - 5;
				local78 += (int) (Math.random() * 10.0D) - 5;
				Static491.anInt9082 = local76;
				Static536.anInt9677 = local78;
			} else if (Static340.anInt6864 == -1 || Static114.anInt3043 == -1) {
				Static303.aClass2_Sub6_Sub4_2.method2562(local74, Static303.aClass2_Sub6_Sub4_2.anInt2720 & 0x3FFF, Static303.aClass2_Sub6_Sub4_2.anInt2720 >> 14 & 0x3FFF);
				Static536.anInt9677 = local74[2] - Static303.anInt108;
				Static491.anInt9082 = local74[1] - Static303.anInt110;
			} else {
				Static303.aClass2_Sub6_Sub4_2.method2562(local74, Static114.anInt3043, Static340.anInt6864);
				Static114.anInt3043 = -1;
				Static340.anInt6864 = -1;
				if (local74 != null) {
					Static491.anInt9082 = local74[1] - Static303.anInt110;
					Static536.anInt9677 = local74[2] - Static303.anInt108;
				}
				Static323.aBoolean492 = false;
			}
			if (Static303.aClass2_Sub6_Sub4_2.anInt2713 == 37) {
				Static303.aFloat5 = 3.0F;
				Static303.aFloat6 = 3.0F;
			} else if (Static303.aClass2_Sub6_Sub4_2.anInt2713 == 50) {
				Static303.aFloat5 = 4.0F;
				Static303.aFloat6 = 4.0F;
			} else if (Static303.aClass2_Sub6_Sub4_2.anInt2713 == 75) {
				Static303.aFloat5 = 6.0F;
				Static303.aFloat6 = 6.0F;
			} else if (Static303.aClass2_Sub6_Sub4_2.anInt2713 == 100) {
				Static303.aFloat5 = 8.0F;
				Static303.aFloat6 = 8.0F;
			} else if (Static303.aClass2_Sub6_Sub4_2.anInt2713 == 200) {
				Static303.aFloat5 = 16.0F;
				Static303.aFloat6 = 16.0F;
			} else {
				Static303.aFloat5 = 8.0F;
				Static303.aFloat6 = 8.0F;
			}
			Static303.anInt104 = (int) Static303.aFloat5 >> 1;
			Static303.aByteArrayArrayArray2 = Static88.method2462(Static303.anInt104);
			Static245.method4529();
			Static303.method157();
			Static612.aClass341_69 = new Class341();
			Static303.anInt102 += (int) (Math.random() * 5.0D) - 2;
			if (Static303.anInt102 < -8) {
				Static303.anInt102 = -8;
			}
			if (Static303.anInt102 > 8) {
				Static303.anInt102 = 8;
			}
			Static303.anInt103 += (int) (Math.random() * 5.0D) - 2;
			if (Static303.anInt103 < -16) {
				Static303.anInt103 = -16;
			}
			if (Static303.anInt103 > 16) {
				Static303.anInt103 = 16;
			}
			Static303.method161(arg0, Static303.anInt102 >> 2 << 10, Static303.anInt103 >> 1);
			Static303.aClass248_2.method6579(256, 1024);
			Static303.aClass237_2.method6471(256, 256);
			Static303.aClass342_2.method8543(4096);
			Static517.aClass284_1.method7409(256);
			Static124.anInt11089 = 20;
		} else if (Static124.anInt11089 == 20) {
			Static612.method8946(true);
			Static303.method153(arg1, Static303.anInt102, Static303.anInt103);
			Static124.anInt11089 = 60;
			Static612.method8946(true);
			Static335.method5742();
		} else if (Static124.anInt11089 == 60) {
			if (Static303.aClass157_4.method4554(Static303.aClass2_Sub6_Sub4_2.aString22 + "_staticelements")) {
				if (!Static303.aClass157_4.method4567(Static303.aClass2_Sub6_Sub4_2.aString22 + "_staticelements")) {
					return;
				}
				Static303.aClass333_2 = Static641.method9217(Static303.aClass157_4, Static303.aClass2_Sub6_Sub4_2.aString22 + "_staticelements", Static378.aBoolean238);
			} else {
				Static303.aClass333_2 = new Class333(0);
			}
			Static303.method158();
			Static124.anInt11089 = 70;
			Static612.method8946(true);
			Static335.method5742();
		} else if (Static124.anInt11089 == 70) {
			Static372.aClass66_7 = new Class66(arg1, 11, true, Static639.aCanvas10);
			Static124.anInt11089 = 73;
			Static612.method8946(true);
			Static335.method5742();
		} else if (Static124.anInt11089 == 73) {
			Static557.aClass66_10 = new Class66(arg1, 12, true, Static639.aCanvas10);
			Static124.anInt11089 = 76;
			Static612.method8946(true);
			Static335.method5742();
		} else if (Static124.anInt11089 == 76) {
			Static238.aClass66_5 = new Class66(arg1, 14, true, Static639.aCanvas10);
			Static124.anInt11089 = 79;
			Static612.method8946(true);
			Static335.method5742();
		} else if (Static124.anInt11089 == 79) {
			Static50.aClass66_3 = new Class66(arg1, 17, true, Static639.aCanvas10);
			Static124.anInt11089 = 82;
			Static612.method8946(true);
			Static335.method5742();
		} else if (Static124.anInt11089 == 82) {
			Static439.aClass66_8 = new Class66(arg1, 19, true, Static639.aCanvas10);
			Static124.anInt11089 = 85;
			Static612.method8946(true);
			Static335.method5742();
		} else if (Static124.anInt11089 == 85) {
			Static603.aClass66_6 = new Class66(arg1, 22, true, Static639.aCanvas10);
			Static124.anInt11089 = 88;
			Static612.method8946(true);
			Static335.method5742();
		} else if (Static124.anInt11089 == 88) {
			Static138.aClass66_4 = new Class66(arg1, 26, true, Static639.aCanvas10);
			Static124.anInt11089 = 91;
			Static612.method8946(true);
			Static335.method5742();
		} else {
			Static529.aClass66_9 = new Class66(arg1, 30, true, Static639.aCanvas10);
			Static124.anInt11089 = 100;
			Static612.method8946(true);
			Static335.method5742();
			System.gc();
		}
	}
}
