import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "Lclient!mo;")
	public static final Class163 aClass163_13 = new Class163(2, 4);

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "[Lclient!kt;")
	public static final Class143[] aClass143Array1 = new Class143[14];

	@OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
	public static int anInt6245 = 1;

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(BLclient!l;Lclient!za;)V")
	public static void method4934(@OriginalArg(1) Interface8 arg0, @OriginalArg(2) Class200 arg1) {
		if (Static98.aClass5_Sub2_Sub18_4 == null) {
			return;
		}
		if (Static35.anInt4183 < 10) {
			if (!Static98.aClass243_114.method5474(Static98.aClass5_Sub2_Sub18_4.aString75)) {
				Static35.anInt4183 = Static129.aClass243_72.method5453(Static98.aClass5_Sub2_Sub18_4.aString75) / 10;
				return;
			}
			Static149.method2148();
			Static35.anInt4183 = 10;
		}
		if (Static35.anInt4183 == 10) {
			Static98.anInt3332 = Static98.aClass5_Sub2_Sub18_4.anInt7489 >> 6 << 6;
			Static98.anInt3328 = Static98.aClass5_Sub2_Sub18_4.anInt7485 >> 6 << 6;
			Static98.anInt3334 = (Static98.aClass5_Sub2_Sub18_4.anInt7484 >> 6 << 6) + 64 - Static98.anInt3332;
			Static98.anInt3331 = (Static98.aClass5_Sub2_Sub18_4.anInt7483 >> 6 << 6) + 64 - Static98.anInt3328;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static98.aClass5_Sub2_Sub18_4.method6013(Static220.aClass2_Sub1_Sub3_Sub2_1.aByte105, Static226.anInt3768 + (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7502 >> 7), local75, Static31.anInt618 + (Static220.aClass2_Sub1_Sub3_Sub2_1.anInt7500 >> 7))) {
				local79 = local75[2] - Static98.anInt3328;
				local77 = local75[1] - Static98.anInt3332;
			}
			if (!Static108.aBoolean130 && local77 >= 0 && Static98.anInt3334 > local77 && local79 >= 0 && Static98.anInt3331 > local79) {
				local77 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static110.anInt1841 = local79;
				Static282.anInt4369 = local77;
			} else if (Static252.anInt4102 == -1 || Static341.anInt5585 == -1) {
				Static98.aClass5_Sub2_Sub18_4.method6017(local75, Static98.aClass5_Sub2_Sub18_4.anInt7482 >> 14 & 0x3FFF, Static98.aClass5_Sub2_Sub18_4.anInt7482 & 0x3FFF);
				Static110.anInt1841 = local75[2] - Static98.anInt3328;
				Static282.anInt4369 = local75[1] - Static98.anInt3332;
			} else {
				Static98.aClass5_Sub2_Sub18_4.method6017(local75, Static252.anInt4102, Static341.anInt5585);
				if (local75 != null) {
					Static282.anInt4369 = local75[1] - Static98.anInt3332;
					Static110.anInt1841 = local75[2] - Static98.anInt3328;
				}
				Static341.anInt5585 = -1;
				Static252.anInt4102 = -1;
				Static108.aBoolean130 = false;
			}
			if (Static98.aClass5_Sub2_Sub18_4.anInt7490 == 37) {
				Static98.aFloat84 = 3.0F;
				Static98.aFloat83 = 3.0F;
			} else if (Static98.aClass5_Sub2_Sub18_4.anInt7490 == 50) {
				Static98.aFloat84 = 4.0F;
				Static98.aFloat83 = 4.0F;
			} else if (Static98.aClass5_Sub2_Sub18_4.anInt7490 == 75) {
				Static98.aFloat84 = 6.0F;
				Static98.aFloat83 = 6.0F;
			} else if (Static98.aClass5_Sub2_Sub18_4.anInt7490 == 100) {
				Static98.aFloat84 = 8.0F;
				Static98.aFloat83 = 8.0F;
			} else if (Static98.aClass5_Sub2_Sub18_4.anInt7490 == 200) {
				Static98.aFloat84 = 16.0F;
				Static98.aFloat83 = 16.0F;
			} else {
				Static98.aFloat84 = 8.0F;
				Static98.aFloat83 = 8.0F;
			}
			Static98.anInt3324 = (int) Static98.aFloat84 >> 1;
			Static98.aByteArrayArrayArray8 = Static59.method950(Static98.anInt3324);
			Static462.method6054();
			Static98.method2676();
			Static382.aClass177_35 = new Class177();
			Static98.anInt3325 += (int) (Math.random() * 5.0D) - 2;
			if (Static98.anInt3325 < -8) {
				Static98.anInt3325 = -8;
			}
			if (Static98.anInt3325 > 8) {
				Static98.anInt3325 = 8;
			}
			Static98.anInt3323 += (int) (Math.random() * 5.0D) - 2;
			if (Static98.anInt3323 < -16) {
				Static98.anInt3323 = -16;
			}
			if (Static98.anInt3323 > 16) {
				Static98.anInt3323 = 16;
			}
			Static98.method2678(arg0, Static98.anInt3325 >> 2 << 10, Static98.anInt3323 >> 1);
			Static98.aClass28_3.method668(256, 1024);
			Static98.aClass51_3.method1144(256, 256);
			Static98.aClass256_3.method5781(4096);
			Static275.aClass254_1.method5707(256);
			Static35.anInt4183 = 20;
		} else if (Static35.anInt4183 == 20) {
			Static251.method3224(true);
			Static98.method2670(arg1, Static98.anInt3325, Static98.anInt3323);
			Static35.anInt4183 = 60;
			Static251.method3224(true);
			Static262.method3350();
		} else if (Static35.anInt4183 == 60) {
			if (Static98.aClass243_114.method5456(Static98.aClass5_Sub2_Sub18_4.aString75 + "_staticelements")) {
				if (!Static98.aClass243_114.method5474(Static98.aClass5_Sub2_Sub18_4.aString75 + "_staticelements")) {
					return;
				}
				Static98.aClass153_3 = Static122.method1731(Static150.aBoolean175, Static98.aClass5_Sub2_Sub18_4.aString75 + "_staticelements", Static98.aClass243_114);
			} else {
				Static98.aClass153_3 = new Class153(0);
			}
			Static98.method2675();
			Static35.anInt4183 = 70;
			Static251.method3224(true);
			Static262.method3350();
		} else if (Static35.anInt4183 == 70) {
			Static276.aClass269_39 = new Class269(arg1, 11, true, Static246.aCanvas2);
			Static35.anInt4183 = 73;
			Static251.method3224(true);
			Static262.method3350();
		} else if (Static35.anInt4183 == 73) {
			Static119.aClass269_28 = new Class269(arg1, 12, true, Static246.aCanvas2);
			Static35.anInt4183 = 76;
			Static251.method3224(true);
			Static262.method3350();
		} else if (Static35.anInt4183 == 76) {
			Static26.aClass269_8 = new Class269(arg1, 14, true, Static246.aCanvas2);
			Static35.anInt4183 = 79;
			Static251.method3224(true);
			Static262.method3350();
		} else if (Static35.anInt4183 == 79) {
			Static263.aClass269_36 = new Class269(arg1, 17, true, Static246.aCanvas2);
			Static35.anInt4183 = 82;
			Static251.method3224(true);
			Static262.method3350();
		} else if (Static35.anInt4183 == 82) {
			Static260.aClass269_35 = new Class269(arg1, 19, true, Static246.aCanvas2);
			Static35.anInt4183 = 85;
			Static251.method3224(true);
			Static262.method3350();
		} else if (Static35.anInt4183 == 85) {
			Static405.aClass269_50 = new Class269(arg1, 22, true, Static246.aCanvas2);
			Static35.anInt4183 = 88;
			Static251.method3224(true);
			Static262.method3350();
		} else if (Static35.anInt4183 == 88) {
			Static102.aClass269_14 = new Class269(arg1, 26, true, Static246.aCanvas2);
			Static35.anInt4183 = 91;
			Static251.method3224(true);
			Static262.method3350();
		} else {
			Static251.aClass269_32 = new Class269(arg1, 30, true, Static246.aCanvas2);
			Static35.anInt4183 = 100;
			Static251.method3224(true);
			Static262.method3350();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILclient!ii;III)V")
	public static void method4936(@OriginalArg(0) int arg0, @OriginalArg(1) Class114 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class5_Sub31 local10 = (Class5_Sub31) Static207.aClass177_20.method3618(); local10 != null; local10 = (Class5_Sub31) Static207.aClass177_20.method3619()) {
			if (arg0 == local10.anInt4924 && local10.anInt4921 == arg3 << 7 && local10.anInt4918 == arg2 << 7 && arg1.anInt2994 == local10.aClass114_1.anInt2994) {
				if (local10.aClass5_Sub22_Sub2_4 != null) {
					Static119.aClass5_Sub22_Sub3_3.method3636(local10.aClass5_Sub22_Sub2_4);
					local10.aClass5_Sub22_Sub2_4 = null;
				}
				if (local10.aClass5_Sub22_Sub2_3 != null) {
					Static119.aClass5_Sub22_Sub3_3.method3636(local10.aClass5_Sub22_Sub2_3);
					local10.aClass5_Sub22_Sub2_3 = null;
				}
				local10.method6003();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)V")
	public static void method4937(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class5_Sub2_Sub9 local12 = Static72.method1073(14, arg1);
		local12.method3026();
		local12.anInt3818 = arg0;
	}
}
