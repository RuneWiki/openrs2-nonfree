import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static295 {

	@OriginalMember(owner = "client!ld", name = "pb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray19 = new String[5];

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([Lclient!rb;II)V")
	public static void method4383(@OriginalArg(0) Class41_Sub2[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 >= arg2) {
			return;
		}
		@Pc(8) int local8 = (arg1 + arg2) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) Class41_Sub2 local14 = arg0[local8];
		arg0[local8] = arg0[arg2];
		arg0[arg2] = local14;
		@Pc(27) int local27 = local14.anInt9439;
		for (@Pc(29) int local29 = arg1; local29 < arg2; local29++) {
			if (arg0[local29].anInt9439 > local27 + (local29 & 0x1)) {
				@Pc(44) Class41_Sub2 local44 = arg0[local29];
				arg0[local29] = arg0[local10];
				arg0[local10++] = local44;
			}
		}
		arg0[arg2] = arg0[local10];
		arg0[local10] = local14;
		method4383(arg0, arg1, local10 - 1);
		method4383(arg0, local10 + 1, arg2);
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!r;ILclient!fa;)V")
	public static void method4385(@OriginalArg(0) Class45 arg0, @OriginalArg(2) Interface3 arg1) {
		if (Static44.aClass3_Sub7_Sub17_3 == null) {
			return;
		}
		if (Static454.anInt7639 < 10) {
			if (!Static44.aClass322_154.method6818(Static44.aClass3_Sub7_Sub17_3.aString76)) {
				Static454.anInt7639 = Static69.aClass322_27.method6828(Static44.aClass3_Sub7_Sub17_3.aString76) / 10;
				return;
			}
			Static135.method2644();
			Static454.anInt7639 = 10;
		}
		if (Static454.anInt7639 == 10) {
			Static44.anInt9263 = Static44.aClass3_Sub7_Sub17_3.anInt8075 >> 6 << 6;
			Static44.anInt9258 = Static44.aClass3_Sub7_Sub17_3.anInt8081 >> 6 << 6;
			Static44.anInt9269 = (Static44.aClass3_Sub7_Sub17_3.anInt8085 >> 6 << 6) + 64 - Static44.anInt9263;
			Static44.anInt9261 = (Static44.aClass3_Sub7_Sub17_3.anInt8080 >> 6 << 6) + 64 - Static44.anInt9258;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static44.aClass3_Sub7_Sub17_3.method6705((Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444 >> 9) + Static335.anInt5608, (Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 >> 9) + Static246.anInt4344, local78, Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.aByte117)) {
				local82 = local78[2] - Static44.anInt9263;
				local80 = local78[1] - Static44.anInt9258;
			}
			if (!Static182.aBoolean271 && local80 >= 0 && Static44.anInt9261 > local80 && local82 >= 0 && local82 < Static44.anInt9269) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static334.anInt5600 = local82;
				Static56.anInt1176 = local80;
			} else if (Static386.anInt6814 == -1 || Static586.anInt2133 == -1) {
				Static44.aClass3_Sub7_Sub17_3.method6707(Static44.aClass3_Sub7_Sub17_3.anInt8076 & 0x3FFF, local78, Static44.aClass3_Sub7_Sub17_3.anInt8076 >> 14 & 0x3FFF);
				Static56.anInt1176 = local78[1] - Static44.anInt9258;
				Static334.anInt5600 = local78[2] - Static44.anInt9263;
			} else {
				Static44.aClass3_Sub7_Sub17_3.method6707(Static586.anInt2133, local78, Static386.anInt6814);
				if (local78 != null) {
					Static334.anInt5600 = local78[2] - Static44.anInt9263;
					Static56.anInt1176 = local78[1] - Static44.anInt9258;
				}
				Static182.aBoolean271 = false;
				Static586.anInt2133 = -1;
				Static386.anInt6814 = -1;
			}
			if (Static44.aClass3_Sub7_Sub17_3.anInt8077 == 37) {
				Static44.aFloat204 = 3.0F;
				Static44.aFloat203 = 3.0F;
			} else if (Static44.aClass3_Sub7_Sub17_3.anInt8077 == 50) {
				Static44.aFloat204 = 4.0F;
				Static44.aFloat203 = 4.0F;
			} else if (Static44.aClass3_Sub7_Sub17_3.anInt8077 == 75) {
				Static44.aFloat204 = 6.0F;
				Static44.aFloat203 = 6.0F;
			} else if (Static44.aClass3_Sub7_Sub17_3.anInt8077 == 100) {
				Static44.aFloat204 = 8.0F;
				Static44.aFloat203 = 8.0F;
			} else if (Static44.aClass3_Sub7_Sub17_3.anInt8077 == 200) {
				Static44.aFloat204 = 16.0F;
				Static44.aFloat203 = 16.0F;
			} else {
				Static44.aFloat204 = 8.0F;
				Static44.aFloat203 = 8.0F;
			}
			Static44.anInt9255 = (int) Static44.aFloat204 >> 1;
			Static44.aByteArrayArrayArray18 = Static395.method5771(Static44.anInt9255);
			Static109.method1915();
			Static44.method7647();
			Static565.aClass112_71 = new Class112();
			Static44.anInt9257 += (int) (Math.random() * 5.0D) - 2;
			if (Static44.anInt9257 < -8) {
				Static44.anInt9257 = -8;
			}
			if (Static44.anInt9257 > 8) {
				Static44.anInt9257 = 8;
			}
			Static44.anInt9256 += (int) (Math.random() * 5.0D) - 2;
			if (Static44.anInt9256 < -16) {
				Static44.anInt9256 = -16;
			}
			if (Static44.anInt9256 > 16) {
				Static44.anInt9256 = 16;
			}
			Static44.method7668(arg1, Static44.anInt9257 >> 2 << 10, Static44.anInt9256 >> 1);
			Static44.aClass102_4.method2924(1024, 256);
			Static44.aClass87_4.method2541(256, 256);
			Static44.aClass212_4.method4798(4096);
			Static284.aClass207_1.method4718(256);
			Static454.anInt7639 = 20;
		} else if (Static454.anInt7639 == 20) {
			Static214.method3435(true);
			Static44.method7663(arg0, Static44.anInt9257, Static44.anInt9256);
			Static454.anInt7639 = 60;
			Static214.method3435(true);
			Static395.method5770();
		} else if (Static454.anInt7639 == 60) {
			if (Static44.aClass322_154.method6832(Static44.aClass3_Sub7_Sub17_3.aString76 + "_staticelements")) {
				if (!Static44.aClass322_154.method6818(Static44.aClass3_Sub7_Sub17_3.aString76 + "_staticelements")) {
					return;
				}
				Static44.aClass355_3 = Static591.method7906(Static44.aClass322_154, Static44.aClass3_Sub7_Sub17_3.aString76 + "_staticelements", Static191.aBoolean273);
			} else {
				Static44.aClass355_3 = new Class355(0);
			}
			Static44.method7650();
			Static454.anInt7639 = 70;
			Static214.method3435(true);
			Static395.method5770();
		} else if (Static454.anInt7639 == 70) {
			Static26.aClass96_1 = new Class96(arg0, 11, true, Static387.aCanvas9);
			Static454.anInt7639 = 73;
			Static214.method3435(true);
			Static395.method5770();
		} else if (Static454.anInt7639 == 73) {
			Static584.aClass96_8 = new Class96(arg0, 12, true, Static387.aCanvas9);
			Static454.anInt7639 = 76;
			Static214.method3435(true);
			Static395.method5770();
		} else if (Static454.anInt7639 == 76) {
			Static449.aClass96_6 = new Class96(arg0, 14, true, Static387.aCanvas9);
			Static454.anInt7639 = 79;
			Static214.method3435(true);
			Static395.method5770();
		} else if (Static454.anInt7639 == 79) {
			Static147.aClass96_2 = new Class96(arg0, 17, true, Static387.aCanvas9);
			Static454.anInt7639 = 82;
			Static214.method3435(true);
			Static395.method5770();
		} else if (Static454.anInt7639 == 82) {
			Static319.aClass96_5 = new Class96(arg0, 19, true, Static387.aCanvas9);
			Static454.anInt7639 = 85;
			Static214.method3435(true);
			Static395.method5770();
		} else if (Static454.anInt7639 == 85) {
			Static181.aClass96_3 = new Class96(arg0, 22, true, Static387.aCanvas9);
			Static454.anInt7639 = 88;
			Static214.method3435(true);
			Static395.method5770();
		} else if (Static454.anInt7639 == 88) {
			Static510.aClass96_7 = new Class96(arg0, 26, true, Static387.aCanvas9);
			Static454.anInt7639 = 91;
			Static214.method3435(true);
			Static395.method5770();
		} else {
			Static316.aClass96_4 = new Class96(arg0, 30, true, Static387.aCanvas9);
			Static454.anInt7639 = 100;
			Static214.method3435(true);
			Static395.method5770();
			System.gc();
		}
	}
}
