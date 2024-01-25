import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static366 {

	@OriginalMember(owner = "client!mc", name = "l", descriptor = "F")
	public static float aFloat111;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
	public static int anInt6173;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "Ljava/lang/String;")
	public static String aString75 = "";

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(B)Ljava/lang/String;")
	public static String method5546() {
		return Static484.aBoolean623 || Static197.aClass6_Sub2_Sub11_2 == null ? "" : Static197.aClass6_Sub2_Sub11_2.aString54;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
	public static void method5548() {
		if (Static371.anApplet1 == null) {
			return;
		}
		try {
			@Pc(13) String local13 = Static371.anApplet1.getParameter("cookiehost");
			@Pc(21) int local21 = (int) (Static549.method7758() / 86400000L) - 11745;
			@Pc(37) String local37 = "usrdob=" + local21 + "; version=1; path=/; domain=" + local13;
			Static692.method2494("document.cookie=\"" + local37 + "\"", Static371.anApplet1);
		} catch (@Pc(61) Throwable local61) {
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(BI)Lclient!qfa;")
	public static Class6_Sub8 method5549(@OriginalArg(1) int arg0) {
		if (arg0 == 0) {
			return new Class6_Sub8_Sub30();
		} else if (arg0 == 1) {
			return new Class6_Sub8_Sub13();
		} else if (arg0 == 2) {
			return new Class6_Sub8_Sub18();
		} else if (arg0 == 3) {
			return new Class6_Sub8_Sub2();
		} else if (arg0 == 4) {
			return new Class6_Sub8_Sub20();
		} else if (arg0 == 5) {
			return new Class6_Sub8_Sub3();
		} else if (arg0 == 6) {
			return new Class6_Sub8_Sub22();
		} else if (arg0 == 7) {
			return new Class6_Sub8_Sub36();
		} else if (arg0 == 8) {
			return new Class6_Sub8_Sub11();
		} else if (arg0 == 9) {
			return new Class6_Sub8_Sub14();
		} else if (arg0 == 10) {
			return new Class6_Sub8_Sub10();
		} else if (arg0 == 11) {
			return new Class6_Sub8_Sub12();
		} else if (arg0 == 12) {
			return new Class6_Sub8_Sub4();
		} else if (arg0 == 13) {
			return new Class6_Sub8_Sub1();
		} else if (arg0 == 14) {
			return new Class6_Sub8_Sub9();
		} else if (arg0 == 15) {
			return new Class6_Sub8_Sub17();
		} else if (arg0 == 16) {
			return new Class6_Sub8_Sub7();
		} else if (arg0 == 17) {
			return new Class6_Sub8_Sub27();
		} else if (arg0 == 18) {
			return new Class6_Sub8_Sub8_Sub1();
		} else if (arg0 == 19) {
			return new Class6_Sub8_Sub23();
		} else if (arg0 == 20) {
			return new Class6_Sub8_Sub5();
		} else if (arg0 == 21) {
			return new Class6_Sub8_Sub38();
		} else if (arg0 == 22) {
			return new Class6_Sub8_Sub19();
		} else if (arg0 == 23) {
			return new Class6_Sub8_Sub24();
		} else if (arg0 == 24) {
			return new Class6_Sub8_Sub39();
		} else if (arg0 == 25) {
			return new Class6_Sub8_Sub25();
		} else if (arg0 == 26) {
			return new Class6_Sub8_Sub37();
		} else if (arg0 == 27) {
			return new Class6_Sub8_Sub31();
		} else if (arg0 == 28) {
			return new Class6_Sub8_Sub16();
		} else if (arg0 == 29) {
			return new Class6_Sub8_Sub28();
		} else if (arg0 == 30) {
			return new Class6_Sub8_Sub34();
		} else if (arg0 == 31) {
			return new Class6_Sub8_Sub32();
		} else if (arg0 == 32) {
			return new Class6_Sub8_Sub26();
		} else if (arg0 == 33) {
			return new Class6_Sub8_Sub29();
		} else if (arg0 == 34) {
			return new Class6_Sub8_Sub15();
		} else if (arg0 == 35) {
			return new Class6_Sub8_Sub33();
		} else if (arg0 == 36) {
			return new Class6_Sub8_Sub35();
		} else if (arg0 == 37) {
			return new Class6_Sub8_Sub6();
		} else if (arg0 == 38) {
			return new Class6_Sub8_Sub21();
		} else if (arg0 == 39) {
			return new Class6_Sub8_Sub8();
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLclient!d;Lclient!ha;)V")
	public static void method5550(@OriginalArg(1) Interface11 arg0, @OriginalArg(2) Class75 arg1) {
		if (Static627.aClass6_Sub2_Sub9_2 == null) {
			return;
		}
		if (Static98.anInt1457 < 10) {
			if (!Static627.aClass223_88.method5258(Static627.aClass6_Sub2_Sub9_2.aString48)) {
				Static98.anInt1457 = Static482.aClass223_95.method5274(Static627.aClass6_Sub2_Sub9_2.aString48) / 10;
				return;
			}
			Static482.method7184();
			Static98.anInt1457 = 10;
		}
		if (Static98.anInt1457 == 10) {
			Static627.anInt7268 = Static627.aClass6_Sub2_Sub9_2.anInt4767 >> 6 << 6;
			Static627.anInt7264 = Static627.aClass6_Sub2_Sub9_2.anInt4774 >> 6 << 6;
			Static627.anInt7266 = (Static627.aClass6_Sub2_Sub9_2.anInt4782 >> 6 << 6) - (Static627.anInt7264 - 64);
			Static627.anInt7272 = (Static627.aClass6_Sub2_Sub9_2.anInt4770 >> 6 << 6) + 64 - Static627.anInt7268;
			@Pc(79) int[] local79 = new int[3];
			@Pc(81) int local81 = -1;
			@Pc(83) int local83 = -1;
			if (Static627.aClass6_Sub2_Sub9_2.method4379(local79, Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.aByte135, Static50.anInt606 + (Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9048 >> 9), Static404.anInt7039 - -(Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1.anInt9057 >> 9))) {
				local83 = local79[2] - Static627.anInt7268;
				local81 = local79[1] - Static627.anInt7264;
			}
			if (!Static387.aBoolean503 && local81 >= 0 && Static627.anInt7266 > local81 && local83 >= 0 && local83 < Static627.anInt7272) {
				local81 += (int) (Math.random() * 10.0D) - 5;
				local83 += (int) (Math.random() * 10.0D) - 5;
				Static91.anInt1364 = local81;
				Static488.anInt8263 = local83;
			} else if (Static260.anInt8684 == -1 || Static245.anInt4710 == -1) {
				Static627.aClass6_Sub2_Sub9_2.method4378(Static627.aClass6_Sub2_Sub9_2.anInt4776 >> 14 & 0x3FFF, Static627.aClass6_Sub2_Sub9_2.anInt4776 & 0x3FFF, local79);
				Static488.anInt8263 = local79[2] - Static627.anInt7268;
				Static91.anInt1364 = local79[1] - Static627.anInt7264;
			} else {
				Static627.aClass6_Sub2_Sub9_2.method4378(Static260.anInt8684, Static245.anInt4710, local79);
				if (local79 != null) {
					Static91.anInt1364 = local79[1] - Static627.anInt7264;
					Static488.anInt8263 = local79[2] - Static627.anInt7268;
				}
				Static387.aBoolean503 = false;
				Static245.anInt4710 = -1;
				Static260.anInt8684 = -1;
			}
			if (Static627.aClass6_Sub2_Sub9_2.anInt4777 == 37) {
				Static627.aFloat139 = 3.0F;
				Static627.aFloat140 = 3.0F;
			} else if (Static627.aClass6_Sub2_Sub9_2.anInt4777 == 50) {
				Static627.aFloat139 = 4.0F;
				Static627.aFloat140 = 4.0F;
			} else if (Static627.aClass6_Sub2_Sub9_2.anInt4777 == 75) {
				Static627.aFloat139 = 6.0F;
				Static627.aFloat140 = 6.0F;
			} else if (Static627.aClass6_Sub2_Sub9_2.anInt4777 == 100) {
				Static627.aFloat139 = 8.0F;
				Static627.aFloat140 = 8.0F;
			} else if (Static627.aClass6_Sub2_Sub9_2.anInt4777 == 200) {
				Static627.aFloat139 = 16.0F;
				Static627.aFloat140 = 16.0F;
			} else {
				Static627.aFloat139 = 8.0F;
				Static627.aFloat140 = 8.0F;
			}
			Static627.anInt7258 = (int) Static627.aFloat139 >> 1;
			Static627.aByteArrayArrayArray18 = Static609.method8383(Static627.anInt7258);
			Static62.method784();
			Static627.method6482();
			Static527.aClass340_67 = new Class340();
			Static627.anInt7260 += (int) (Math.random() * 5.0D) - 2;
			if (Static627.anInt7260 < -8) {
				Static627.anInt7260 = -8;
			}
			Static627.anInt7259 += (int) (Math.random() * 5.0D) - 2;
			if (Static627.anInt7260 > 8) {
				Static627.anInt7260 = 8;
			}
			if (Static627.anInt7259 < -16) {
				Static627.anInt7259 = -16;
			}
			if (Static627.anInt7259 > 16) {
				Static627.anInt7259 = 16;
			}
			Static627.method6477(arg0, Static627.anInt7260 >> 2 << 10, Static627.anInt7259 >> 1);
			Static627.aClass190_5.method4690(256, 1024);
			Static627.aClass306_4.method7369(256, 256);
			Static627.aClass163_4.method4126(4096);
			Static61.aClass335_1.method7987(256);
			Static98.anInt1457 = 20;
		} else if (Static98.anInt1457 == 20) {
			Static227.method4060(true);
			Static627.method6464(arg1, Static627.anInt7260, Static627.anInt7259);
			Static98.anInt1457 = 60;
			Static227.method4060(true);
			Static19.method235();
		} else if (Static98.anInt1457 == 60) {
			if (Static627.aClass223_88.method5276(Static627.aClass6_Sub2_Sub9_2.aString48 + "_staticelements")) {
				if (!Static627.aClass223_88.method5258(Static627.aClass6_Sub2_Sub9_2.aString48 + "_staticelements")) {
					return;
				}
				Static627.aClass176_3 = Static517.method7489(Static340.aBoolean430, Static627.aClass6_Sub2_Sub9_2.aString48 + "_staticelements", Static627.aClass223_88);
			} else {
				Static627.aClass176_3 = new Class176(0);
			}
			Static627.method6485();
			Static98.anInt1457 = 70;
			Static227.method4060(true);
			Static19.method235();
		} else if (Static98.anInt1457 == 70) {
			Static70.aClass259_2 = new Class259(arg1, 11, true, Static4.aCanvas1);
			Static98.anInt1457 = 73;
			Static227.method4060(true);
			Static19.method235();
		} else if (Static98.anInt1457 == 73) {
			Static471.aClass259_8 = new Class259(arg1, 12, true, Static4.aCanvas1);
			Static98.anInt1457 = 76;
			Static227.method4060(true);
			Static19.method235();
		} else if (Static98.anInt1457 == 76) {
			Static292.aClass259_3 = new Class259(arg1, 14, true, Static4.aCanvas1);
			Static98.anInt1457 = 79;
			Static227.method4060(true);
			Static19.method235();
		} else if (Static98.anInt1457 == 79) {
			Static462.aClass259_7 = new Class259(arg1, 17, true, Static4.aCanvas1);
			Static98.anInt1457 = 82;
			Static227.method4060(true);
			Static19.method235();
		} else if (Static98.anInt1457 == 82) {
			Static393.aClass259_5 = new Class259(arg1, 19, true, Static4.aCanvas1);
			Static98.anInt1457 = 85;
			Static227.method4060(true);
			Static19.method235();
		} else if (Static98.anInt1457 == 85) {
			Static383.aClass259_4 = new Class259(arg1, 22, true, Static4.aCanvas1);
			Static98.anInt1457 = 88;
			Static227.method4060(true);
			Static19.method235();
		} else if (Static98.anInt1457 == 88) {
			Static446.aClass259_6 = new Class259(arg1, 26, true, Static4.aCanvas1);
			Static98.anInt1457 = 91;
			Static227.method4060(true);
			Static19.method235();
		} else {
			Static53.aClass259_1 = new Class259(arg1, 30, true, Static4.aCanvas1);
			Static98.anInt1457 = 100;
			Static227.method4060(true);
			Static19.method235();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V")
	public static void method5551(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class6_Sub2_Sub4 local9 = Static602.method8315((long) arg0, 12);
		local9.method2040();
		local9.anInt2111 = arg1;
	}
}
