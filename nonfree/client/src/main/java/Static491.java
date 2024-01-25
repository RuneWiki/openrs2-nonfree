import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "[Lclient!et;")
	public static Class91[] aClass91Array1;

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "[Z")
	public static final boolean[] aBooleanArray37 = new boolean[8];

	@OriginalMember(owner = "client!ui", name = "p", descriptor = "[[I")
	public static final int[][] anIntArrayArray112 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!n;ILclient!qa;)V")
	public static void method7538(@OriginalArg(0) Interface13 arg0, @OriginalArg(2) Class4 arg1) {
		if (Static335.aClass1_Sub2_Sub12_3 == null) {
			return;
		}
		if (Static224.anInt4343 < 10) {
			if (!Static335.aClass69_51.method1908(Static335.aClass1_Sub2_Sub12_3.aString153)) {
				Static224.anInt4343 = Static11.aClass69_6.method1907(Static335.aClass1_Sub2_Sub12_3.aString153) / 10;
				return;
			}
			Static137.method2601();
			Static224.anInt4343 = 10;
		}
		if (Static224.anInt4343 == 10) {
			Static335.anInt4941 = Static335.aClass1_Sub2_Sub12_3.anInt6310 >> 6 << 6;
			Static335.anInt4935 = Static335.aClass1_Sub2_Sub12_3.anInt6314 >> 6 << 6;
			Static335.anInt4943 = (Static335.aClass1_Sub2_Sub12_3.anInt6311 >> 6 << 6) + 64 - Static335.anInt4941;
			Static335.anInt4938 = (Static335.aClass1_Sub2_Sub12_3.anInt6312 >> 6 << 6) + 64 - Static335.anInt4935;
			@Pc(83) int[] local83 = new int[3];
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = -1;
			if (Static335.aClass1_Sub2_Sub12_3.method5741(local83, Static538.anInt9485 + (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8954 >> 7), (Static107.aClass20_Sub1_Sub1_Sub1_1.anInt8949 >> 7) + Static282.anInt5380, Static107.aClass20_Sub1_Sub1_Sub1_1.aByte108)) {
				local85 = local83[1] - Static335.anInt4941;
				local87 = local83[2] - Static335.anInt4935;
			}
			if (!Static500.aBoolean661 && local85 >= 0 && Static335.anInt4943 > local85 && local87 >= 0 && local87 < Static335.anInt4938) {
				local85 += (int) (Math.random() * 10.0D) - 5;
				local87 += (int) (Math.random() * 10.0D) - 5;
				Static32.anInt1050 = local87;
				Static64.anInt1610 = local85;
			} else if (Static446.anInt7823 == -1 || Static427.anInt7434 == -1) {
				Static335.aClass1_Sub2_Sub12_3.method5739(local83, Static335.aClass1_Sub2_Sub12_3.anInt6308 & 0x3FFF, Static335.aClass1_Sub2_Sub12_3.anInt6308 >> 14 & 0x3FFF);
				Static64.anInt1610 = local83[1] - Static335.anInt4941;
				Static32.anInt1050 = local83[2] - Static335.anInt4935;
			} else {
				Static335.aClass1_Sub2_Sub12_3.method5739(local83, Static427.anInt7434, Static446.anInt7823);
				Static500.aBoolean661 = false;
				Static427.anInt7434 = -1;
				Static446.anInt7823 = -1;
				if (local83 != null) {
					Static64.anInt1610 = local83[1] - Static335.anInt4941;
					Static32.anInt1050 = local83[2] - Static335.anInt4935;
				}
			}
			if (Static335.aClass1_Sub2_Sub12_3.anInt6319 == 37) {
				Static335.aFloat103 = 3.0F;
				Static335.aFloat104 = 3.0F;
			} else if (Static335.aClass1_Sub2_Sub12_3.anInt6319 == 50) {
				Static335.aFloat103 = 4.0F;
				Static335.aFloat104 = 4.0F;
			} else if (Static335.aClass1_Sub2_Sub12_3.anInt6319 == 75) {
				Static335.aFloat103 = 6.0F;
				Static335.aFloat104 = 6.0F;
			} else if (Static335.aClass1_Sub2_Sub12_3.anInt6319 == 100) {
				Static335.aFloat103 = 8.0F;
				Static335.aFloat104 = 8.0F;
			} else if (Static335.aClass1_Sub2_Sub12_3.anInt6319 == 200) {
				Static335.aFloat103 = 16.0F;
				Static335.aFloat104 = 16.0F;
			} else {
				Static335.aFloat103 = 8.0F;
				Static335.aFloat104 = 8.0F;
			}
			Static335.anInt4933 = (int) Static335.aFloat103 >> 1;
			Static335.aByteArrayArrayArray10 = Static338.method3565(Static335.anInt4933);
			Static222.method4035();
			Static335.method4578();
			Static18.aClass295_4 = new Class295();
			Static335.anInt4932 += (int) (Math.random() * 5.0D) - 2;
			if (Static335.anInt4932 < -8) {
				Static335.anInt4932 = -8;
			}
			if (Static335.anInt4932 > 8) {
				Static335.anInt4932 = 8;
			}
			Static335.anInt4931 += (int) (Math.random() * 5.0D) - 2;
			if (Static335.anInt4931 < -16) {
				Static335.anInt4931 = -16;
			}
			if (Static335.anInt4931 > 16) {
				Static335.anInt4931 = 16;
			}
			Static335.method4574(arg0, Static335.anInt4932 >> 2 << 10, Static335.anInt4931 >> 1);
			Static335.aClass32_4.method1130(1024, 256);
			Static335.aClass160_3.method4296(256, 256);
			Static335.aClass18_3.method600(4096);
			Static363.aClass118_1.method2941(256);
			Static224.anInt4343 = 20;
		} else if (Static224.anInt4343 == 20) {
			Static99.method2036(true);
			Static335.method4565(arg1, Static335.anInt4932, Static335.anInt4931);
			Static224.anInt4343 = 60;
			Static99.method2036(true);
			Static175.method3240();
		} else if (Static224.anInt4343 == 60) {
			if (Static335.aClass69_51.method1883(Static335.aClass1_Sub2_Sub12_3.aString153 + "_staticelements")) {
				if (!Static335.aClass69_51.method1908(Static335.aClass1_Sub2_Sub12_3.aString153 + "_staticelements")) {
					return;
				}
				Static335.aClass214_2 = Static451.method6970(Static335.aClass69_51, Static335.aClass1_Sub2_Sub12_3.aString153 + "_staticelements", Static343.aBoolean696);
			} else {
				Static335.aClass214_2 = new Class214(0);
			}
			Static335.method4564();
			Static224.anInt4343 = 70;
			Static99.method2036(true);
			Static175.method3240();
		} else if (Static224.anInt4343 == 70) {
			Static70.aClass66_1 = new Class66(arg1, 11, true, Static312.aCanvas12);
			Static224.anInt4343 = 73;
			Static99.method2036(true);
			Static175.method3240();
		} else if (Static224.anInt4343 == 73) {
			Static405.aClass66_8 = new Class66(arg1, 12, true, Static312.aCanvas12);
			Static224.anInt4343 = 76;
			Static99.method2036(true);
			Static175.method3240();
		} else if (Static224.anInt4343 == 76) {
			Static214.aClass66_6 = new Class66(arg1, 14, true, Static312.aCanvas12);
			Static224.anInt4343 = 79;
			Static99.method2036(true);
			Static175.method3240();
		} else if (Static224.anInt4343 == 79) {
			Static269.aClass66_7 = new Class66(arg1, 17, true, Static312.aCanvas12);
			Static224.anInt4343 = 82;
			Static99.method2036(true);
			Static175.method3240();
		} else if (Static224.anInt4343 == 82) {
			Static89.aClass66_2 = new Class66(arg1, 19, true, Static312.aCanvas12);
			Static224.anInt4343 = 85;
			Static99.method2036(true);
			Static175.method3240();
		} else if (Static224.anInt4343 == 85) {
			Static155.aClass66_4 = new Class66(arg1, 22, true, Static312.aCanvas12);
			Static224.anInt4343 = 88;
			Static99.method2036(true);
			Static175.method3240();
		} else if (Static224.anInt4343 == 88) {
			Static93.aClass66_3 = new Class66(arg1, 26, true, Static312.aCanvas12);
			Static224.anInt4343 = 91;
			Static99.method2036(true);
			Static175.method3240();
		} else {
			Static161.aClass66_5 = new Class66(arg1, 30, true, Static312.aCanvas12);
			Static224.anInt4343 = 100;
			Static99.method2036(true);
			Static175.method3240();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
	public static void method7539() {
		@Pc(1) Class277 local1 = Static332.aClass277_47;
		synchronized (Static332.aClass277_47) {
			Static332.aClass277_47.method7018(5);
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILclient!et;)Lclient!et;")
	public static Class91 method7542(@OriginalArg(1) Class91 arg0) {
		@Pc(11) Class91 local11 = Static63.method1576(arg0);
		if (local11 == null) {
			local11 = arg0.aClass91_4;
		}
		return local11;
	}
}
