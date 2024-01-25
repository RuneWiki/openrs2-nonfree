import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!be", name = "h", descriptor = "I")
	public static int anInt564;

	@OriginalMember(owner = "client!be", name = "f", descriptor = "Lclient!ok;")
	public static final Class180 aClass180_1 = new Class180(3, 5);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!qa;Lclient!m;)V")
	public static void method368(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Interface8 arg1) {
		if (Static169.aClass2_Sub2_Sub11_3 == null) {
			return;
		}
		if (Static430.anInt7475 < 10) {
			if (!Static169.aClass188_46.method4277(Static169.aClass2_Sub2_Sub11_3.aString35)) {
				Static430.anInt7475 = Static309.aClass188_82.method4276(Static169.aClass2_Sub2_Sub11_3.aString35) / 10;
				return;
			}
			Static131.method1914();
			Static430.anInt7475 = 10;
		}
		if (Static430.anInt7475 == 10) {
			Static169.anInt3161 = Static169.aClass2_Sub2_Sub11_3.anInt4045 >> 6 << 6;
			Static169.anInt3159 = Static169.aClass2_Sub2_Sub11_3.anInt4042 >> 6 << 6;
			Static169.anInt3160 = (Static169.aClass2_Sub2_Sub11_3.anInt4041 >> 6 << 6) + 64 - Static169.anInt3159;
			Static169.anInt3168 = (Static169.aClass2_Sub2_Sub11_3.anInt4048 >> 6 << 6) - (Static169.anInt3161 - 64);
			@Pc(81) int[] local81 = new int[3];
			@Pc(83) int local83 = -1;
			@Pc(85) int local85 = -1;
			if (Static169.aClass2_Sub2_Sub11_3.method3239(Static379.anInt6721 + (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111 >> 7), Static173.anInt3340 + (Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117 >> 7), Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92, local81)) {
				local83 = local81[1] - Static169.anInt3161;
				local85 = local81[2] - Static169.anInt3159;
			}
			if (!Static389.aBoolean582 && local83 >= 0 && local83 < Static169.anInt3168 && local85 >= 0 && Static169.anInt3160 > local85) {
				local85 += (int) (Math.random() * 10.0D) - 5;
				local83 += (int) (Math.random() * 10.0D) - 5;
				Static393.anInt6878 = local85;
				Static67.anInt1777 = local83;
			} else if (Static421.anInt7367 == -1 || Static166.anInt3216 == -1) {
				Static169.aClass2_Sub2_Sub11_3.method3241(local81, Static169.aClass2_Sub2_Sub11_3.anInt4044 & 0x3FFF, Static169.aClass2_Sub2_Sub11_3.anInt4044 >> 14 & 0x3FFF);
				Static393.anInt6878 = local81[2] - Static169.anInt3159;
				Static67.anInt1777 = local81[1] - Static169.anInt3161;
			} else {
				Static169.aClass2_Sub2_Sub11_3.method3241(local81, Static166.anInt3216, Static421.anInt7367);
				if (local81 != null) {
					Static67.anInt1777 = local81[1] - Static169.anInt3161;
					Static393.anInt6878 = local81[2] - Static169.anInt3159;
				}
				Static166.anInt3216 = -1;
				Static421.anInt7367 = -1;
				Static389.aBoolean582 = false;
			}
			if (Static169.aClass2_Sub2_Sub11_3.anInt4039 == 37) {
				Static169.aFloat99 = 3.0F;
				Static169.aFloat100 = 3.0F;
			} else if (Static169.aClass2_Sub2_Sub11_3.anInt4039 == 50) {
				Static169.aFloat99 = 4.0F;
				Static169.aFloat100 = 4.0F;
			} else if (Static169.aClass2_Sub2_Sub11_3.anInt4039 == 75) {
				Static169.aFloat99 = 6.0F;
				Static169.aFloat100 = 6.0F;
			} else if (Static169.aClass2_Sub2_Sub11_3.anInt4039 == 100) {
				Static169.aFloat99 = 8.0F;
				Static169.aFloat100 = 8.0F;
			} else if (Static169.aClass2_Sub2_Sub11_3.anInt4039 == 200) {
				Static169.aFloat99 = 16.0F;
				Static169.aFloat100 = 16.0F;
			} else {
				Static169.aFloat99 = 8.0F;
				Static169.aFloat100 = 8.0F;
			}
			Static169.anInt3157 = (int) Static169.aFloat99 >> 1;
			Static169.aByteArrayArrayArray14 = Static242.method3659(Static169.anInt3157);
			Static39.method728();
			Static169.method2550();
			Static128.aClass265_20 = new Class265();
			Static169.anInt3158 += (int) (Math.random() * 5.0D) - 2;
			if (Static169.anInt3158 < -8) {
				Static169.anInt3158 = -8;
			}
			if (Static169.anInt3158 > 8) {
				Static169.anInt3158 = 8;
			}
			Static169.anInt3156 += (int) (Math.random() * 5.0D) - 2;
			if (Static169.anInt3156 < -16) {
				Static169.anInt3156 = -16;
			}
			if (Static169.anInt3156 > 16) {
				Static169.anInt3156 = 16;
			}
			Static169.method2549(arg1, Static169.anInt3158 >> 2 << 10, Static169.anInt3156 >> 1);
			Static169.aClass173_3.method4017(1024, 256);
			Static169.aClass221_3.method5016(256, 256);
			Static169.aClass150_2.method3509(4096);
			Static363.aClass165_1.method3915(256);
			Static430.anInt7475 = 20;
		} else if (Static430.anInt7475 == 20) {
			Static371.method5228(true);
			Static169.method2548(arg0, Static169.anInt3158, Static169.anInt3156);
			Static430.anInt7475 = 60;
			Static371.method5228(true);
			Static236.method3588();
		} else if (Static430.anInt7475 == 60) {
			if (Static169.aClass188_46.method4295(Static169.aClass2_Sub2_Sub11_3.aString35 + "_staticelements")) {
				if (!Static169.aClass188_46.method4277(Static169.aClass2_Sub2_Sub11_3.aString35 + "_staticelements")) {
					return;
				}
				Static169.aClass201_2 = Static293.method4560(Static169.aClass2_Sub2_Sub11_3.aString35 + "_staticelements", Static169.aClass188_46, Static67.aBoolean153);
			} else {
				Static169.aClass201_2 = new Class201(0);
			}
			Static169.method2553();
			Static430.anInt7475 = 70;
			Static371.method5228(true);
			Static236.method3588();
		} else if (Static430.anInt7475 == 70) {
			Static322.aClass49_24 = new Class49(arg0, 11, true, Static118.aCanvas3);
			Static430.anInt7475 = 73;
			Static371.method5228(true);
			Static236.method3588();
		} else if (Static430.anInt7475 == 73) {
			Static150.aClass49_13 = new Class49(arg0, 12, true, Static118.aCanvas3);
			Static430.anInt7475 = 76;
			Static371.method5228(true);
			Static236.method3588();
		} else if (Static430.anInt7475 == 76) {
			Static397.aClass49_28 = new Class49(arg0, 14, true, Static118.aCanvas3);
			Static430.anInt7475 = 79;
			Static371.method5228(true);
			Static236.method3588();
		} else if (Static430.anInt7475 == 79) {
			Static100.aClass49_31 = new Class49(arg0, 17, true, Static118.aCanvas3);
			Static430.anInt7475 = 82;
			Static371.method5228(true);
			Static236.method3588();
		} else if (Static430.anInt7475 == 82) {
			Static59.aClass49_7 = new Class49(arg0, 19, true, Static118.aCanvas3);
			Static430.anInt7475 = 85;
			Static371.method5228(true);
			Static236.method3588();
		} else if (Static430.anInt7475 == 85) {
			Static374.aClass49_27 = new Class49(arg0, 22, true, Static118.aCanvas3);
			Static430.anInt7475 = 88;
			Static371.method5228(true);
			Static236.method3588();
		} else if (Static430.anInt7475 == 88) {
			Static23.aClass49_4 = new Class49(arg0, 26, true, Static118.aCanvas3);
			Static430.anInt7475 = 91;
			Static371.method5228(true);
			Static236.method3588();
		} else {
			Static38.aClass49_6 = new Class49(arg0, 30, true, Static118.aCanvas3);
			Static430.anInt7475 = 100;
			Static371.method5228(true);
			Static236.method3588();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(ILclient!md;)V")
	public static void method369(@OriginalArg(1) Class2_Sub20 arg0) {
		for (@Pc(10) int local10 = 0; local10 < Static114.anInt2337; local10++) {
			@Pc(16) int local16 = arg0.method3698();
			@Pc(20) int local20 = arg0.method3711();
			if (local20 == 65535) {
				local20 = -1;
			}
			if (Static323.aClass23_Sub1Array1[local16] != null) {
				Static323.aClass23_Sub1Array1[local16].anInt3267 = local20;
			}
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(IIII)I")
	public static int method370(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 > 243) {
			arg2 >>= 0x4;
		} else if (arg1 > 217) {
			arg2 >>= 0x3;
		} else if (arg1 > 192) {
			arg2 >>= 0x2;
		} else if (arg1 > 179) {
			arg2 >>= 0x1;
		}
		return (arg2 >> 5 << 7) + ((arg0 & 0xFF) >> 2 << 10) + (arg1 >> 1);
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BLclient!md;)Ljava/lang/String;")
	public static String method371(@OriginalArg(1) Class2_Sub20 arg0) {
		return Static161.method2565(arg0);
	}

	@OriginalMember(owner = "client!be", name = "b", descriptor = "(I)I")
	public static int method372() {
		return 6;
	}
}
