import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "([BIFFIFIFLclient!gl;IIIF)V")
	public static void method684(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(5) float arg4, @OriginalArg(7) float arg5, @OriginalArg(8) Class66 arg6, @OriginalArg(12) float arg7) {
		for (@Pc(3) int local3 = 0; local3 < 16; local3++) {
			Static254.method4159(arg3, arg4, arg1, arg7, arg5, arg6, arg2, arg0, local3);
			arg1 += 16384;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!qa;Lclient!l;B)V")
	public static void method698(@OriginalArg(0) Class30 arg0, @OriginalArg(1) Interface4 arg1) {
		if (Static425.aClass4_Sub1_Sub18_3 == null) {
			return;
		}
		if (Static165.anInt3267 < 10) {
			if (!Static425.aClass38_34.method1048(Static425.aClass4_Sub1_Sub18_3.aString64)) {
				Static165.anInt3267 = Static438.aClass38_91.method1033(Static425.aClass4_Sub1_Sub18_3.aString64) / 10;
				return;
			}
			Static149.method2766();
			Static165.anInt3267 = 10;
		}
		if (Static165.anInt3267 == 10) {
			Static425.anInt3657 = Static425.aClass4_Sub1_Sub18_3.anInt6954 >> 6 << 6;
			Static425.anInt3658 = Static425.aClass4_Sub1_Sub18_3.anInt6945 >> 6 << 6;
			Static425.anInt3659 = (Static425.aClass4_Sub1_Sub18_3.anInt6942 >> 6 << 6) + 64 - Static425.anInt3657;
			Static425.anInt3667 = (Static425.aClass4_Sub1_Sub18_3.anInt6949 >> 6 << 6) + 64 - Static425.anInt3658;
			@Pc(83) int[] local83 = new int[3];
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = -1;
			if (Static425.aClass4_Sub1_Sub18_3.method5560(Static52.aClass11_Sub5_Sub2_Sub1_2.aByte100, (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7515 >> 7) + Static72.anInt1776, local83, Static426.anInt7325 + (Static52.aClass11_Sub5_Sub2_Sub1_2.anInt7514 >> 7))) {
				local87 = local83[2] - Static425.anInt3658;
				local85 = local83[1] - Static425.anInt3657;
			}
			if (!Static93.aBoolean147 && local85 >= 0 && Static425.anInt3659 > local85 && local87 >= 0 && local87 < Static425.anInt3667) {
				local87 += (int) (Math.random() * 10.0D) - 5;
				local85 += (int) (Math.random() * 10.0D) - 5;
				Static241.anInt4715 = local87;
				Static97.anInt2096 = local85;
			} else if (Static254.anInt4914 == -1 || Static290.anInt5374 == -1) {
				Static425.aClass4_Sub1_Sub18_3.method5562(Static425.aClass4_Sub1_Sub18_3.anInt6946 >> 14 & 0x3FFF, local83, Static425.aClass4_Sub1_Sub18_3.anInt6946 & 0x3FFF);
				Static97.anInt2096 = local83[1] - Static425.anInt3657;
				Static241.anInt4715 = local83[2] - Static425.anInt3658;
			} else {
				Static425.aClass4_Sub1_Sub18_3.method5562(Static254.anInt4914, local83, Static290.anInt5374);
				Static290.anInt5374 = -1;
				Static254.anInt4914 = -1;
				Static93.aBoolean147 = false;
				if (local83 != null) {
					Static97.anInt2096 = local83[1] - Static425.anInt3657;
					Static241.anInt4715 = local83[2] - Static425.anInt3658;
				}
			}
			if (Static425.aClass4_Sub1_Sub18_3.anInt6944 == 37) {
				Static425.aFloat64 = 3.0F;
				Static425.aFloat65 = 3.0F;
			} else if (Static425.aClass4_Sub1_Sub18_3.anInt6944 == 50) {
				Static425.aFloat64 = 4.0F;
				Static425.aFloat65 = 4.0F;
			} else if (Static425.aClass4_Sub1_Sub18_3.anInt6944 == 75) {
				Static425.aFloat64 = 6.0F;
				Static425.aFloat65 = 6.0F;
			} else if (Static425.aClass4_Sub1_Sub18_3.anInt6944 == 100) {
				Static425.aFloat64 = 8.0F;
				Static425.aFloat65 = 8.0F;
			} else if (Static425.aClass4_Sub1_Sub18_3.anInt6944 == 200) {
				Static425.aFloat64 = 16.0F;
				Static425.aFloat65 = 16.0F;
			} else {
				Static425.aFloat64 = 8.0F;
				Static425.aFloat65 = 8.0F;
			}
			Static425.anInt3653 = (int) Static425.aFloat64 >> 1;
			Static425.aByteArrayArrayArray2 = Static182.method3324(Static425.anInt3653);
			Static142.method2614();
			Static425.method3279();
			Static345.aClass91_41 = new Class91();
			Static425.anInt3655 += (int) (Math.random() * 5.0D) - 2;
			if (Static425.anInt3655 < -8) {
				Static425.anInt3655 = -8;
			}
			if (Static425.anInt3655 > 8) {
				Static425.anInt3655 = 8;
			}
			Static425.anInt3654 += (int) (Math.random() * 5.0D) - 2;
			if (Static425.anInt3654 < -16) {
				Static425.anInt3654 = -16;
			}
			if (Static425.anInt3654 > 16) {
				Static425.anInt3654 = 16;
			}
			Static425.method3286(arg1, Static425.anInt3655 >> 2 << 10, Static425.anInt3654 >> 1);
			Static425.aClass116_3.method3301(256, 1024);
			Static425.aClass8_3.method66(256, 256);
			Static425.aClass228_3.method5201(4096);
			Static166.aClass86_3.method2417(256);
			Static165.anInt3267 = 20;
		} else if (Static165.anInt3267 == 20) {
			Static247.method4077(true);
			Static425.method3269(arg0, Static425.anInt3655, Static425.anInt3654);
			Static165.anInt3267 = 60;
			Static247.method4077(true);
			Static32.method454();
		} else if (Static165.anInt3267 == 60) {
			if (Static425.aClass38_34.method1014(Static425.aClass4_Sub1_Sub18_3.aString64 + "_staticelements")) {
				if (!Static425.aClass38_34.method1048(Static425.aClass4_Sub1_Sub18_3.aString64 + "_staticelements")) {
					return;
				}
				Static425.aClass189_2 = Static124.method2330(Static425.aClass4_Sub1_Sub18_3.aString64 + "_staticelements", Static425.aClass38_34, Static289.aBoolean384);
			} else {
				Static425.aClass189_2 = new Class189(0);
			}
			Static425.method3272();
			Static165.anInt3267 = 70;
			Static247.method4077(true);
			Static32.method454();
		} else if (Static165.anInt3267 == 70) {
			Static259.aClass122_4 = new Class122(arg0, 11, true, Static409.aCanvas7);
			Static165.anInt3267 = 73;
			Static247.method4077(true);
			Static32.method454();
		} else if (Static165.anInt3267 == 73) {
			Static291.aClass122_6 = new Class122(arg0, 12, true, Static409.aCanvas7);
			Static165.anInt3267 = 76;
			Static247.method4077(true);
			Static32.method454();
		} else if (Static165.anInt3267 == 76) {
			Static171.aClass122_2 = new Class122(arg0, 14, true, Static409.aCanvas7);
			Static165.anInt3267 = 79;
			Static247.method4077(true);
			Static32.method454();
		} else if (Static165.anInt3267 == 79) {
			Static381.aClass122_7 = new Class122(arg0, 17, true, Static409.aCanvas7);
			Static165.anInt3267 = 82;
			Static247.method4077(true);
			Static32.method454();
		} else if (Static165.anInt3267 == 82) {
			Static262.aClass122_5 = new Class122(arg0, 19, true, Static409.aCanvas7);
			Static165.anInt3267 = 85;
			Static247.method4077(true);
			Static32.method454();
		} else if (Static165.anInt3267 == 85) {
			Static10.aClass122_1 = new Class122(arg0, 22, true, Static409.aCanvas7);
			Static165.anInt3267 = 88;
			Static247.method4077(true);
			Static32.method454();
		} else if (Static165.anInt3267 == 88) {
			Static416.aClass122_8 = new Class122(arg0, 26, true, Static409.aCanvas7);
			Static165.anInt3267 = 91;
			Static247.method4077(true);
			Static32.method454();
		} else {
			Static237.aClass122_3 = new Class122(arg0, 30, true, Static409.aCanvas7);
			Static165.anInt3267 = 100;
			Static247.method4077(true);
			Static32.method454();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(B)V")
	public static void method701() {
		@Pc(9) int[] local9 = new int[Static139.aClass193_1.anInt5591];
		@Pc(11) int local11 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static139.aClass193_1.anInt5591; local17++) {
			@Pc(24) Class274 local24 = Static139.aClass193_1.method4650(local17);
			if (local24.anInt7895 >= 0 || local24.anInt7907 >= 0) {
				local9[local11++] = local17;
			}
		}
		Static216.anIntArray472 = new int[local11];
		for (@Pc(52) int local52 = 0; local52 < local11; local52++) {
			Static216.anIntArray472[local52] = local9[local52];
		}
	}

	@OriginalMember(owner = "client!bt", name = "b", descriptor = "(III)V")
	public static void method722(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static245.anInt4781 = arg0 - Static425.anInt3657;
		Static113.anInt2426 = arg1 - Static425.anInt3658;
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Ljava/lang/String;IZ)Z")
	public static boolean method743(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (Static419.anInt7272 != 3) {
			Static302.aClass9_6 = new Class9();
			Static302.aClass9_6.anInt84 = arg1;
			Static302.aClass9_6.aString1 = arg0;
			if (Static297.aClass219_2 != Static42.aClass219_1) {
				Static302.aClass9_6.anInt79 = Static302.aClass9_6.anInt84 + 40000;
				Static302.aClass9_6.anInt80 = Static302.aClass9_6.anInt84 + 50000;
			}
			return true;
		}
		@Pc(35) String local35 = "";
		if (Static42.aClass219_1 != Static297.aClass219_2) {
			local35 = ":" + (arg1 + 7000);
		}
		@Pc(55) String local55 = "";
		if (Static230.aString35 != null) {
			local55 = "/p=" + Static230.aString35;
		}
		@Pc(103) String local103 = "http://" + arg0 + local35 + "/l=" + Static168.anInt3290 + "/a=" + Static399.anInt7070 + local55 + "/j" + (Static409.aBoolean530 ? "1" : "0") + ",o" + (Static27.aBoolean24 ? "1" : "0") + ",a2";
		try {
			Static179.aClient1.getAppletContext().showDocument(new URL(local103), "_self");
			return true;
		} catch (@Pc(113) Exception local113) {
			return false;
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(Lclient!nt;IIIII)V")
	public static void method758(@OriginalArg(0) Class177 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		arg0.anInt5190 = 0;
		for (@Pc(4) int local4 = 0; local4 < 4; local4++) {
			if (arg0.aClass4_Sub17Array3[local4] != null) {
				arg0.anInt5190++;
			}
		}
		label51: for (@Pc(22) int local22 = 0; local22 < arg0.anInt5190; local22++) {
			@Pc(31) long local31 = Static170.aLongArrayArrayArray1[arg1][arg2][arg3];
			@Pc(41) Class153 local41;
			while (local31 != 0L) {
				local41 = client.lb[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass4_Sub17_2 == arg0.aClass4_Sub17Array3[local22]) {
					continue label51;
				}
			}
			local31 = Static170.aLongArrayArrayArray1[arg1][arg4][arg5];
			while (local31 != 0L) {
				local41 = client.lb[(int) ((local31 & 0xFFFFL) - 1L)];
				local31 >>>= 0x10;
				if (local41.aClass4_Sub17_2 == arg0.aClass4_Sub17Array3[local22]) {
					continue label51;
				}
			}
			for (@Pc(93) int local93 = local22; local93 < arg0.anInt5190 - 1; local93++) {
				arg0.aClass4_Sub17Array3[local93] = arg0.aClass4_Sub17Array3[local93 + 1];
			}
			arg0.anInt5190--;
		}
	}
}
