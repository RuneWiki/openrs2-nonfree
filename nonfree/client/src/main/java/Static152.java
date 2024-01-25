import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static152 {

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	public static int anInt2791 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IZZII)V")
	public static void method2408(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static204.method3515(arg2)) {
			Static265.method4403(-1, arg1, arg3, Static396.aClass156ArrayArray1[arg2], arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public static void method2409() {
		Static262.method4376();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!qa;ILclient!n;)V")
	public static void method2410(@OriginalArg(0) Class122 arg0, @OriginalArg(2) Interface8 arg1) {
		if (Static118.aClass1_Sub1_Sub5_2 == null) {
			return;
		}
		if (Static385.anInt6975 < 10) {
			if (!Static118.aClass171_19.method4357(Static118.aClass1_Sub1_Sub5_2.aString34)) {
				Static385.anInt6975 = Static154.aClass171_59.method4329(Static118.aClass1_Sub1_Sub5_2.aString34) / 10;
				return;
			}
			Static382.method5850();
			Static385.anInt6975 = 10;
		}
		if (Static385.anInt6975 == 10) {
			Static118.anInt813 = Static118.aClass1_Sub1_Sub5_2.anInt3148 >> 6 << 6;
			Static118.anInt815 = Static118.aClass1_Sub1_Sub5_2.anInt3152 >> 6 << 6;
			Static118.anInt818 = (Static118.aClass1_Sub1_Sub5_2.anInt3144 >> 6 << 6) + 64 - Static118.anInt815;
			Static118.anInt816 = (Static118.aClass1_Sub1_Sub5_2.anInt3156 >> 6 << 6) + 64 - Static118.anInt813;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static118.aClass1_Sub1_Sub5_2.method2667((Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7141 >> 9) + Static534.anInt9007, local76, (Static63.aClass49_Sub2_Sub2_Sub1_1.anInt7137 >> 9) + Static470.anInt7897, Static63.aClass49_Sub2_Sub2_Sub1_1.aByte98)) {
				local78 = local76[1] - Static118.anInt815;
				local80 = local76[2] - Static118.anInt813;
			}
			if (!Static113.aBoolean142 && local78 >= 0 && local78 < Static118.anInt818 && local80 >= 0 && Static118.anInt816 > local80) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static103.anInt2070 = local78;
				Static214.anInt2191 = local80;
			} else if (Static506.anInt8563 == -1 || Static282.anInt7768 == -1) {
				Static118.aClass1_Sub1_Sub5_2.method2666(local76, Static118.aClass1_Sub1_Sub5_2.anInt3155 >> 14 & 0x3FFF, Static118.aClass1_Sub1_Sub5_2.anInt3155 & 0x3FFF);
				Static103.anInt2070 = local76[1] - Static118.anInt815;
				Static214.anInt2191 = local76[2] - Static118.anInt813;
			} else {
				Static118.aClass1_Sub1_Sub5_2.method2666(local76, Static506.anInt8563, Static282.anInt7768);
				Static282.anInt7768 = -1;
				Static506.anInt8563 = -1;
				if (local76 != null) {
					Static214.anInt2191 = local76[2] - Static118.anInt813;
					Static103.anInt2070 = local76[1] - Static118.anInt815;
				}
				Static113.aBoolean142 = false;
			}
			if (Static118.aClass1_Sub1_Sub5_2.anInt3146 == 37) {
				Static118.aFloat10 = 3.0F;
				Static118.aFloat11 = 3.0F;
			} else if (Static118.aClass1_Sub1_Sub5_2.anInt3146 == 50) {
				Static118.aFloat10 = 4.0F;
				Static118.aFloat11 = 4.0F;
			} else if (Static118.aClass1_Sub1_Sub5_2.anInt3146 == 75) {
				Static118.aFloat10 = 6.0F;
				Static118.aFloat11 = 6.0F;
			} else if (Static118.aClass1_Sub1_Sub5_2.anInt3146 == 100) {
				Static118.aFloat10 = 8.0F;
				Static118.aFloat11 = 8.0F;
			} else if (Static118.aClass1_Sub1_Sub5_2.anInt3146 == 200) {
				Static118.aFloat10 = 16.0F;
				Static118.aFloat11 = 16.0F;
			} else {
				Static118.aFloat10 = 8.0F;
				Static118.aFloat11 = 8.0F;
			}
			Static118.anInt810 = (int) Static118.aFloat10 >> 1;
			Static118.aByteArrayArrayArray2 = Static325.method5035(Static118.anInt810);
			Static64.method1152();
			Static118.method836();
			Static442.aClass37_83 = new Class37();
			Static118.anInt809 += (int) (Math.random() * 5.0D) - 2;
			if (Static118.anInt809 < -8) {
				Static118.anInt809 = -8;
			}
			if (Static118.anInt809 > 8) {
				Static118.anInt809 = 8;
			}
			Static118.anInt808 += (int) (Math.random() * 5.0D) - 2;
			if (Static118.anInt808 < -16) {
				Static118.anInt808 = -16;
			}
			if (Static118.anInt808 > 16) {
				Static118.anInt808 = 16;
			}
			Static118.method828(arg1, Static118.anInt809 >> 2 << 10, Static118.anInt808 >> 1);
			Static118.aClass272_2.method6378(256, 1024);
			Static118.aClass257_3.method6138(256, 256);
			Static118.aClass96_2.method2273(4096);
			Static37.aClass247_1.method5891(256);
			Static385.anInt6975 = 20;
		} else if (Static385.anInt6975 == 20) {
			Static462.method6525(true);
			Static118.method823(arg0, Static118.anInt809, Static118.anInt808);
			Static385.anInt6975 = 60;
			Static462.method6525(true);
			Static156.method2461();
		} else if (Static385.anInt6975 == 60) {
			if (Static118.aClass171_19.method4350(Static118.aClass1_Sub1_Sub5_2.aString34 + "_staticelements")) {
				if (!Static118.aClass171_19.method4357(Static118.aClass1_Sub1_Sub5_2.aString34 + "_staticelements")) {
					return;
				}
				Static118.aClass53_2 = Static230.method1103(Static83.aBoolean102, Static118.aClass171_19, Static118.aClass1_Sub1_Sub5_2.aString34 + "_staticelements");
			} else {
				Static118.aClass53_2 = new Class53(0);
			}
			Static118.method837();
			Static385.anInt6975 = 70;
			Static462.method6525(true);
			Static156.method2461();
		} else if (Static385.anInt6975 == 70) {
			Static333.aClass226_10 = new Class226(arg0, 11, true, Static105.aCanvas3);
			Static385.anInt6975 = 73;
			Static462.method6525(true);
			Static156.method2461();
		} else if (Static385.anInt6975 == 73) {
			Static470.aClass226_8 = new Class226(arg0, 12, true, Static105.aCanvas3);
			Static385.anInt6975 = 76;
			Static462.method6525(true);
			Static156.method2461();
		} else if (Static385.anInt6975 == 76) {
			Static97.aClass226_3 = new Class226(arg0, 14, true, Static105.aCanvas3);
			Static385.anInt6975 = 79;
			Static462.method6525(true);
			Static156.method2461();
		} else if (Static385.anInt6975 == 79) {
			Static268.aClass226_7 = new Class226(arg0, 17, true, Static105.aCanvas3);
			Static385.anInt6975 = 82;
			Static462.method6525(true);
			Static156.method2461();
		} else if (Static385.anInt6975 == 82) {
			Static24.aClass226_1 = new Class226(arg0, 19, true, Static105.aCanvas3);
			Static385.anInt6975 = 85;
			Static462.method6525(true);
			Static156.method2461();
		} else if (Static385.anInt6975 == 85) {
			Static210.aClass226_6 = new Class226(arg0, 22, true, Static105.aCanvas3);
			Static385.anInt6975 = 88;
			Static462.method6525(true);
			Static156.method2461();
		} else if (Static385.anInt6975 == 88) {
			Static89.aClass226_2 = new Class226(arg0, 26, true, Static105.aCanvas3);
			Static385.anInt6975 = 91;
			Static462.method6525(true);
			Static156.method2461();
		} else {
			Static534.aClass226_9 = new Class226(arg0, 30, true, Static105.aCanvas3);
			Static385.anInt6975 = 100;
			Static462.method6525(true);
			Static156.method2461();
			System.gc();
		}
	}
}
