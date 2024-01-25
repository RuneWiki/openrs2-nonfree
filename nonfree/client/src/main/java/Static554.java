import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static554 {

	@OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
	public static int anInt3891;

	@OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
	public static int anInt3882 = 0;

	@OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
	public static int anInt3890 = 0;

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!ha;Z)V")
	public static void method3434(@OriginalArg(0) Class143 arg0) {
		if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149 != Static32.anInt444 && (Static129.aClass313ArrayArrayArray7 != null && Static258.method6481(Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149, arg0))) {
			Static32.anInt444 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!nba;I)Ljava/lang/String;")
	public static String method3435(@OriginalArg(0) Class5_Sub2_Sub13 arg0) {
		if (arg0.aString67 == null || arg0.aString67.length() == 0) {
			return arg0.aString66 == null || arg0.aString66.length() <= 0 ? arg0.aString68 : arg0.aString68 + Static49.aClass42_32.method730(Static259.anInt4113) + arg0.aString66;
		} else if (arg0.aString66 == null || arg0.aString66.length() <= 0) {
			return arg0.aString68 + Static49.aClass42_32.method730(Static259.anInt4113) + arg0.aString67;
		} else {
			return arg0.aString68 + Static49.aClass42_32.method730(Static259.anInt4113) + arg0.aString66 + Static49.aClass42_32.method730(Static259.anInt4113) + arg0.aString67;
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(Lclient!ha;Lclient!d;B)V")
	public static void method3437(@OriginalArg(0) Class143 arg0, @OriginalArg(1) Interface3 arg1) {
		if (Static407.aClass5_Sub2_Sub18_2 == null) {
			return;
		}
		if (Static8.anInt166 < 10) {
			if (!Static407.aClass50_108.method922(Static407.aClass5_Sub2_Sub18_2.aString75)) {
				Static8.anInt166 = Static418.aClass50_119.method914(Static407.aClass5_Sub2_Sub18_2.aString75) / 10;
				return;
			}
			Static493.method7183();
			Static8.anInt166 = 10;
		}
		if (Static8.anInt166 == 10) {
			Static407.anInt6543 = Static407.aClass5_Sub2_Sub18_2.anInt7670 >> 6 << 6;
			Static407.anInt6539 = Static407.aClass5_Sub2_Sub18_2.anInt7671 >> 6 << 6;
			Static407.anInt6536 = (Static407.aClass5_Sub2_Sub18_2.anInt7678 >> 6 << 6) + 64 - Static407.anInt6539;
			Static407.anInt6541 = (Static407.aClass5_Sub2_Sub18_2.anInt7669 >> 6 << 6) + 64 - Static407.anInt6543;
			@Pc(73) int[] local73 = new int[3];
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = -1;
			if (Static407.aClass5_Sub2_Sub18_2.method6514((Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10367 >> 9) + Static48.anInt750, Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.aByte149, local73, Static454.anInt7910 + (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anInt10366 >> 9))) {
				local75 = local73[1] - Static407.anInt6543;
				local77 = local73[2] - Static407.anInt6539;
			}
			if (!Static501.aBoolean615 && local75 >= 0 && Static407.anInt6541 > local75 && local77 >= 0 && Static407.anInt6536 > local77) {
				local77 += (int) (Math.random() * 10.0D) - 5;
				local75 += (int) (Math.random() * 10.0D) - 5;
				Static255.anInt4085 = local75;
				Static361.anInt6318 = local77;
			} else if (Static1.anInt6922 == -1 || Static165.anInt2746 == -1) {
				Static407.aClass5_Sub2_Sub18_2.method6516(Static407.aClass5_Sub2_Sub18_2.anInt7675 & 0x3FFF, Static407.aClass5_Sub2_Sub18_2.anInt7675 >> 14 & 0x3FFF, local73);
				Static361.anInt6318 = local73[2] - Static407.anInt6539;
				Static255.anInt4085 = local73[1] - Static407.anInt6543;
			} else {
				Static407.aClass5_Sub2_Sub18_2.method6516(Static165.anInt2746, Static1.anInt6922, local73);
				Static165.anInt2746 = -1;
				Static1.anInt6922 = -1;
				Static501.aBoolean615 = false;
				if (local73 != null) {
					Static255.anInt4085 = local73[1] - Static407.anInt6543;
					Static361.anInt6318 = local73[2] - Static407.anInt6539;
				}
			}
			if (Static407.aClass5_Sub2_Sub18_2.anInt7672 == 37) {
				Static407.aFloat125 = 3.0F;
				Static407.aFloat126 = 3.0F;
			} else if (Static407.aClass5_Sub2_Sub18_2.anInt7672 == 50) {
				Static407.aFloat125 = 4.0F;
				Static407.aFloat126 = 4.0F;
			} else if (Static407.aClass5_Sub2_Sub18_2.anInt7672 == 75) {
				Static407.aFloat125 = 6.0F;
				Static407.aFloat126 = 6.0F;
			} else if (Static407.aClass5_Sub2_Sub18_2.anInt7672 == 100) {
				Static407.aFloat125 = 8.0F;
				Static407.aFloat126 = 8.0F;
			} else if (Static407.aClass5_Sub2_Sub18_2.anInt7672 == 200) {
				Static407.aFloat125 = 16.0F;
				Static407.aFloat126 = 16.0F;
			} else {
				Static407.aFloat125 = 8.0F;
				Static407.aFloat126 = 8.0F;
			}
			Static407.anInt6534 = (int) Static407.aFloat125 >> 1;
			Static407.aByteArrayArrayArray15 = Static570.method7818(Static407.anInt6534);
			Static383.method5626();
			Static407.method5508();
			Static653.aClass124_104 = new Class124();
			Static407.anInt6533 += (int) (Math.random() * 5.0D) - 2;
			if (Static407.anInt6533 < -8) {
				Static407.anInt6533 = -8;
			}
			if (Static407.anInt6533 > 8) {
				Static407.anInt6533 = 8;
			}
			Static407.anInt6532 += (int) (Math.random() * 5.0D) - 2;
			if (Static407.anInt6532 < -16) {
				Static407.anInt6532 = -16;
			}
			if (Static407.anInt6532 > 16) {
				Static407.anInt6532 = 16;
			}
			Static407.method5499(arg1, Static407.anInt6533 >> 2 << 10, Static407.anInt6532 >> 1);
			Static407.aClass218_3.method5157(1024, 256);
			Static407.aClass161_3.method3449(256, 256);
			Static407.aClass140_3.method2846(4096);
			Static480.aClass298_2.method7197(256);
			Static8.anInt166 = 20;
		} else if (Static8.anInt166 == 20) {
			Static440.method6585(true);
			Static407.method5515(arg0, Static407.anInt6533, Static407.anInt6532);
			Static8.anInt166 = 60;
			Static440.method6585(true);
			Static661.method8631();
		} else if (Static8.anInt166 == 60) {
			if (Static407.aClass50_108.method899(Static407.aClass5_Sub2_Sub18_2.aString75 + "_staticelements")) {
				if (!Static407.aClass50_108.method922(Static407.aClass5_Sub2_Sub18_2.aString75 + "_staticelements")) {
					return;
				}
				Static407.aClass79_2 = Static546.method7534(Static581.aBoolean701, Static407.aClass5_Sub2_Sub18_2.aString75 + "_staticelements", Static407.aClass50_108);
			} else {
				Static407.aClass79_2 = new Class79(0);
			}
			Static407.method5503();
			Static8.anInt166 = 70;
			Static440.method6585(true);
			Static661.method8631();
		} else if (Static8.anInt166 == 70) {
			Static435.aClass170_40 = new Class170(arg0, 11, true, Static105.aCanvas2);
			Static8.anInt166 = 73;
			Static440.method6585(true);
			Static661.method8631();
		} else if (Static8.anInt166 == 73) {
			Static238.aClass170_22 = new Class170(arg0, 12, true, Static105.aCanvas2);
			Static8.anInt166 = 76;
			Static440.method6585(true);
			Static661.method8631();
		} else if (Static8.anInt166 == 76) {
			Static120.aClass170_10 = new Class170(arg0, 14, true, Static105.aCanvas2);
			Static8.anInt166 = 79;
			Static440.method6585(true);
			Static661.method8631();
		} else if (Static8.anInt166 == 79) {
			Static486.aClass170_45 = new Class170(arg0, 17, true, Static105.aCanvas2);
			Static8.anInt166 = 82;
			Static440.method6585(true);
			Static661.method8631();
		} else if (Static8.anInt166 == 82) {
			Static511.aClass170_51 = new Class170(arg0, 19, true, Static105.aCanvas2);
			Static8.anInt166 = 85;
			Static440.method6585(true);
			Static661.method8631();
		} else if (Static8.anInt166 == 85) {
			Static189.aClass170_19 = new Class170(arg0, 22, true, Static105.aCanvas2);
			Static8.anInt166 = 88;
			Static440.method6585(true);
			Static661.method8631();
		} else if (Static8.anInt166 == 88) {
			Static524.aClass170_39 = new Class170(arg0, 26, true, Static105.aCanvas2);
			Static8.anInt166 = 91;
			Static440.method6585(true);
			Static661.method8631();
		} else {
			Static180.aClass170_18 = new Class170(arg0, 30, true, Static105.aCanvas2);
			Static8.anInt166 = 100;
			Static440.method6585(true);
			Static661.method8631();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!sw", name = "a", descriptor = "(II[BLclient!og;)Lclient!hga;")
	public static Class152 method3440(@OriginalArg(2) byte[] arg0, @OriginalArg(3) Class143_Sub1_Sub2 arg1) {
		if (arg0 == null) {
			return null;
		}
		@Pc(9) int local9 = OpenGL.glGenProgramARB();
		OpenGL.glBindProgramARB(34336, local9);
		OpenGL.glProgramRawARB(34336, 34933, arg0);
		OpenGL.glGetIntegerv(34379, Static539.anIntArray482, 0);
		if (Static539.anIntArray482[0] == -1) {
			OpenGL.glBindProgramARB(34336, 0);
			return new Class152(arg1, 34336, local9);
		} else {
			OpenGL.glBindProgramARB(34336, 0);
			return null;
		}
	}
}
