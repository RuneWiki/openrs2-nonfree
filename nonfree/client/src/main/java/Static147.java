import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!et", name = "e", descriptor = "[I")
	public static int[] anIntArray259;

	@OriginalMember(owner = "client!et", name = "d", descriptor = "Lclient!jw;")
	public static final Class180 aClass180_61 = new Class180(93, 6);

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(IZLclient!or;I)V")
	public static void method2737(@OriginalArg(0) int arg0, @OriginalArg(2) Class260 arg1, @OriginalArg(3) int arg2) {
		@Pc(13) Class1 local13 = arg1.method6245(Static674.aClass13_22);
		if (local13 == null) {
			return;
		}
		Static674.aClass13_22.KA(arg0, arg2, arg0 + arg1.anInt6963, arg2 + arg1.anInt6971);
		if (Static184.anInt3729 >= 3) {
			Static674.aClass13_22.A(-16777216, local13, arg0, arg2);
		} else {
			Static98.aClass33_3.method7649((float) arg0 + (float) arg1.anInt6963 / 2.0F, (float) arg2 + (float) arg1.anInt6971 / 2.0F, ((int) -Static618.aFloat207 & 0x3FFF) << 2, local13, arg0, arg2);
		}
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(I)I")
	public static int method2738() {
		return Static76.anInt1404 == 1 ? Static485.anInt8031 : 0;
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(Lclient!d;Lclient!ha;B)V")
	public static void method2739(@OriginalArg(0) Interface4 arg0, @OriginalArg(1) Class13 arg1) {
		if (Static317.aClass3_Sub11_Sub21_2 == null) {
			return;
		}
		if (Static677.anInt10890 < 10) {
			if (!Static317.aClass15_86.method532(Static317.aClass3_Sub11_Sub21_2.aString128)) {
				Static677.anInt10890 = Static267.aClass15_75.method538(Static317.aClass3_Sub11_Sub21_2.aString128) / 10;
				return;
			}
			Static445.method6531();
			Static677.anInt10890 = 10;
		}
		if (Static677.anInt10890 == 10) {
			Static317.anInt5403 = Static317.aClass3_Sub11_Sub21_2.anInt10869 >> 6 << 6;
			Static317.anInt5409 = Static317.aClass3_Sub11_Sub21_2.anInt10852 >> 6 << 6;
			Static317.anInt5405 = (Static317.aClass3_Sub11_Sub21_2.anInt10867 >> 6 << 6) + 64 - Static317.anInt5403;
			Static317.anInt5410 = (Static317.aClass3_Sub11_Sub21_2.anInt10864 >> 6 << 6) + 64 - Static317.anInt5409;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static317.aClass3_Sub11_Sub21_2.method9351(Static72.anInt1361 + (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10731 >> 9), Static287.anInt4910 + (Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.anInt10729 >> 9), local78, Static546.aClass28_Sub1_Sub1_Sub1_Sub1_2.aByte174)) {
				local82 = local78[2] - Static317.anInt5403;
				local80 = local78[1] - Static317.anInt5409;
			}
			if (!Static469.aBoolean573 && local80 >= 0 && Static317.anInt5410 > local80 && local82 >= 0 && Static317.anInt5405 > local82) {
				local80 += (int) (Math.random() * 10.0D) - 5;
				local82 += (int) (Math.random() * 10.0D) - 5;
				Static361.anInt5827 = local80;
				Static90.anInt10121 = local82;
			} else if (Static322.anInt5377 == -1 || Static68.anInt1314 == -1) {
				Static317.aClass3_Sub11_Sub21_2.method9350(Static317.aClass3_Sub11_Sub21_2.anInt10861 & 0x3FFF, Static317.aClass3_Sub11_Sub21_2.anInt10861 >> 14 & 0x3FFF, local78);
				Static361.anInt5827 = local78[1] - Static317.anInt5409;
				Static90.anInt10121 = local78[2] - Static317.anInt5403;
			} else {
				Static317.aClass3_Sub11_Sub21_2.method9350(Static68.anInt1314, Static322.anInt5377, local78);
				if (local78 != null) {
					Static90.anInt10121 = local78[2] - Static317.anInt5403;
					Static361.anInt5827 = local78[1] - Static317.anInt5409;
				}
				Static469.aBoolean573 = false;
				Static68.anInt1314 = -1;
				Static322.anInt5377 = -1;
			}
			if (Static317.aClass3_Sub11_Sub21_2.anInt10870 == 37) {
				Static317.aFloat114 = 3.0F;
				Static317.aFloat113 = 3.0F;
			} else if (Static317.aClass3_Sub11_Sub21_2.anInt10870 == 50) {
				Static317.aFloat114 = 4.0F;
				Static317.aFloat113 = 4.0F;
			} else if (Static317.aClass3_Sub11_Sub21_2.anInt10870 == 75) {
				Static317.aFloat114 = 6.0F;
				Static317.aFloat113 = 6.0F;
			} else if (Static317.aClass3_Sub11_Sub21_2.anInt10870 == 100) {
				Static317.aFloat114 = 8.0F;
				Static317.aFloat113 = 8.0F;
			} else if (Static317.aClass3_Sub11_Sub21_2.anInt10870 == 200) {
				Static317.aFloat114 = 16.0F;
				Static317.aFloat113 = 16.0F;
			} else {
				Static317.aFloat114 = 8.0F;
				Static317.aFloat113 = 8.0F;
			}
			Static317.anInt5399 = (int) Static317.aFloat114 >> 1;
			Static317.aByteArrayArrayArray20 = Static366.method5374(Static317.anInt5399);
			Static496.method7118();
			Static317.method4943();
			Static93.aClass338_238 = new Class338();
			Static317.anInt5398 += (int) (Math.random() * 5.0D) - 2;
			if (Static317.anInt5398 < -8) {
				Static317.anInt5398 = -8;
			}
			if (Static317.anInt5398 > 8) {
				Static317.anInt5398 = 8;
			}
			Static317.anInt5397 += (int) (Math.random() * 5.0D) - 2;
			if (Static317.anInt5397 < -16) {
				Static317.anInt5397 = -16;
			}
			if (Static317.anInt5397 > 16) {
				Static317.anInt5397 = 16;
			}
			Static317.method4959(arg0, Static317.anInt5398 >> 2 << 10, Static317.anInt5397 >> 1);
			Static317.aClass27_3.method695(1024, 256);
			Static317.aClass377_3.method9044(256, 256);
			Static317.aClass267_2.method6685(4096);
			Static264.aClass110_1.method3161(256);
			Static677.anInt10890 = 20;
		} else if (Static677.anInt10890 == 20) {
			Static520.method7300(true);
			Static317.method4957(arg1, Static317.anInt5398, Static317.anInt5397);
			Static677.anInt10890 = 60;
			Static520.method7300(true);
			Static225.method3836();
		} else if (Static677.anInt10890 == 60) {
			if (Static317.aClass15_86.method520(Static317.aClass3_Sub11_Sub21_2.aString128 + "_staticelements")) {
				if (!Static317.aClass15_86.method532(Static317.aClass3_Sub11_Sub21_2.aString128 + "_staticelements")) {
					return;
				}
				Static317.aClass130_4 = Static574.method8104(Static317.aClass3_Sub11_Sub21_2.aString128 + "_staticelements", Static317.aClass15_86, Static128.aBoolean206);
			} else {
				Static317.aClass130_4 = new Class130(0);
			}
			Static317.method4945();
			Static677.anInt10890 = 70;
			Static520.method7300(true);
			Static225.method3836();
		} else if (Static677.anInt10890 == 70) {
			Static258.aClass256_5 = new Class256(arg1, 11, true, Static126.aCanvas6);
			Static677.anInt10890 = 73;
			Static520.method7300(true);
			Static225.method3836();
		} else if (Static677.anInt10890 == 73) {
			Static357.aClass256_6 = new Class256(arg1, 12, true, Static126.aCanvas6);
			Static677.anInt10890 = 76;
			Static520.method7300(true);
			Static225.method3836();
		} else if (Static677.anInt10890 == 76) {
			Static182.aClass256_4 = new Class256(arg1, 14, true, Static126.aCanvas6);
			Static677.anInt10890 = 79;
			Static520.method7300(true);
			Static225.method3836();
		} else if (Static677.anInt10890 == 79) {
			Static91.aClass256_3 = new Class256(arg1, 17, true, Static126.aCanvas6);
			Static677.anInt10890 = 82;
			Static520.method7300(true);
			Static225.method3836();
		} else if (Static677.anInt10890 == 82) {
			Static75.aClass256_1 = new Class256(arg1, 19, true, Static126.aCanvas6);
			Static677.anInt10890 = 85;
			Static520.method7300(true);
			Static225.method3836();
		} else if (Static677.anInt10890 == 85) {
			Static385.aClass256_7 = new Class256(arg1, 22, true, Static126.aCanvas6);
			Static677.anInt10890 = 88;
			Static520.method7300(true);
			Static225.method3836();
		} else if (Static677.anInt10890 == 88) {
			Static614.aClass256_9 = new Class256(arg1, 26, true, Static126.aCanvas6);
			Static677.anInt10890 = 91;
			Static520.method7300(true);
			Static225.method3836();
		} else {
			Static80.aClass256_8 = new Class256(arg1, 30, true, Static126.aCanvas6);
			Static677.anInt10890 = 100;
			Static520.method7300(true);
			Static225.method3836();
			System.gc();
		}
	}
}
