import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static551 {

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "[[[S")
	public static short[][][] aShortArrayArrayArray4;

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V")
	public static void method7647() {
		Static506.method7238(Static208.aClass65_7, (long) Static26.anInt350);
		if (Static84.anInt2018 != -1) {
			Static368.method5563(Static84.anInt2018);
		}
		for (@Pc(19) int local19 = 0; local19 < Static168.anInt3361; local19++) {
			if (Static57.aBooleanArray2[local19]) {
				Static208.aBooleanArray18[local19] = true;
			}
			Static19.aBooleanArray1[local19] = Static57.aBooleanArray2[local19];
			Static57.aBooleanArray2[local19] = false;
		}
		Static145.anInt2974 = Static26.anInt350;
		if (Static84.anInt2018 != -1) {
			Static168.anInt3361 = 0;
			Static324.method8034();
		}
		Static208.aClass65_7.la();
		Static653.method8764(Static208.aClass65_7);
		@Pc(65) int local65 = Static574.method7929();
		if (local65 == -1) {
			local65 = Static105.anInt2256;
		}
		if (local65 == -1) {
			local65 = Static314.anInt5964;
		}
		Static180.method2994(local65);
		Static290.anInt5659 = 0;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ha;Lclient!d;B)V")
	public static void method7648(@OriginalArg(0) Class65 arg0, @OriginalArg(1) Interface4 arg1) {
		if (Static330.aClass5_Sub3_Sub16_2 == null) {
			return;
		}
		if (Static500.anInt8324 < 10) {
			if (!Static330.aClass390_8.method8916(Static330.aClass5_Sub3_Sub16_2.aString80)) {
				Static500.anInt8324 = Static543.aClass390_106.method8926(Static330.aClass5_Sub3_Sub16_2.aString80) / 10;
				return;
			}
			Static251.method3865();
			Static500.anInt8324 = 10;
		}
		if (Static500.anInt8324 == 10) {
			Static330.anInt764 = Static330.aClass5_Sub3_Sub16_2.anInt8378 >> 6 << 6;
			Static330.anInt759 = Static330.aClass5_Sub3_Sub16_2.anInt8385 >> 6 << 6;
			Static330.anInt756 = (Static330.aClass5_Sub3_Sub16_2.anInt8374 >> 6 << 6) + 64 - Static330.anInt759;
			Static330.anInt763 = (Static330.aClass5_Sub3_Sub16_2.anInt8372 >> 6 << 6) + 64 - Static330.anInt764;
			@Pc(72) int[] local72 = new int[3];
			@Pc(74) int local74 = -1;
			@Pc(76) int local76 = -1;
			if (Static330.aClass5_Sub3_Sub16_2.method7166(Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.aByte145, (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10784 >> 9) + Static201.anInt3839, Static153.anInt3147 + (Static382.aClass28_Sub1_Sub4_Sub2_Sub2_1.anInt10781 >> 9), local72)) {
				local74 = local72[1] - Static330.anInt764;
				local76 = local72[2] - Static330.anInt759;
			}
			if (!Static169.aBoolean275 && local74 >= 0 && Static330.anInt763 > local74 && local76 >= 0 && Static330.anInt756 > local76) {
				local76 += (int) (Math.random() * 10.0D) - 5;
				local74 += (int) (Math.random() * 10.0D) - 5;
				Static193.anInt3730 = local74;
				Static241.anInt4462 = local76;
			} else if (Static66.anInt6448 == -1 || Static144.anInt2921 == -1) {
				Static330.aClass5_Sub3_Sub16_2.method7164(Static330.aClass5_Sub3_Sub16_2.anInt8384 >> 14 & 0x3FFF, local72, Static330.aClass5_Sub3_Sub16_2.anInt8384 & 0x3FFF);
				Static241.anInt4462 = local72[2] - Static330.anInt759;
				Static193.anInt3730 = local72[1] - Static330.anInt764;
			} else {
				Static330.aClass5_Sub3_Sub16_2.method7164(Static66.anInt6448, local72, Static144.anInt2921);
				Static169.aBoolean275 = false;
				Static144.anInt2921 = -1;
				Static66.anInt6448 = -1;
				if (local72 != null) {
					Static193.anInt3730 = local72[1] - Static330.anInt764;
					Static241.anInt4462 = local72[2] - Static330.anInt759;
				}
			}
			if (Static330.aClass5_Sub3_Sub16_2.anInt8377 == 37) {
				Static330.aFloat8 = 3.0F;
				Static330.aFloat9 = 3.0F;
			} else if (Static330.aClass5_Sub3_Sub16_2.anInt8377 == 50) {
				Static330.aFloat8 = 4.0F;
				Static330.aFloat9 = 4.0F;
			} else if (Static330.aClass5_Sub3_Sub16_2.anInt8377 == 75) {
				Static330.aFloat8 = 6.0F;
				Static330.aFloat9 = 6.0F;
			} else if (Static330.aClass5_Sub3_Sub16_2.anInt8377 == 100) {
				Static330.aFloat8 = 8.0F;
				Static330.aFloat9 = 8.0F;
			} else if (Static330.aClass5_Sub3_Sub16_2.anInt8377 == 200) {
				Static330.aFloat8 = 16.0F;
				Static330.aFloat9 = 16.0F;
			} else {
				Static330.aFloat8 = 8.0F;
				Static330.aFloat9 = 8.0F;
			}
			Static330.anInt751 = (int) Static330.aFloat8 >> 1;
			Static330.aByteArrayArrayArray3 = Static320.method9050(Static330.anInt751);
			Static126.method2284();
			Static330.method694();
			Static38.aClass114_4 = new Class114();
			Static330.anInt753 += (int) (Math.random() * 5.0D) - 2;
			if (Static330.anInt753 < -8) {
				Static330.anInt753 = -8;
			}
			if (Static330.anInt753 > 8) {
				Static330.anInt753 = 8;
			}
			Static330.anInt752 += (int) (Math.random() * 5.0D) - 2;
			if (Static330.anInt752 < -16) {
				Static330.anInt752 = -16;
			}
			if (Static330.anInt752 > 16) {
				Static330.anInt752 = 16;
			}
			Static330.method683(arg1, Static330.anInt753 >> 2 << 10, Static330.anInt752 >> 1);
			Static330.aClass93_3.method2279(1024, 256);
			Static330.aClass365_2.method8480(256, 256);
			Static330.aClass315_2.method7506(4096);
			Static545.aClass171_1.method4157(256);
			Static500.anInt8324 = 20;
		} else if (Static500.anInt8324 == 20) {
			Static632.method8528(true);
			Static330.method692(arg0, Static330.anInt753, Static330.anInt752);
			Static500.anInt8324 = 60;
			Static632.method8528(true);
			Static495.method7089();
		} else if (Static500.anInt8324 == 60) {
			if (Static330.aClass390_8.method8935(Static330.aClass5_Sub3_Sub16_2.aString80 + "_staticelements")) {
				if (!Static330.aClass390_8.method8916(Static330.aClass5_Sub3_Sub16_2.aString80 + "_staticelements")) {
					return;
				}
				Static330.aClass116_2 = Static53.method706(Static330.aClass390_8, Static530.aBoolean743, Static330.aClass5_Sub3_Sub16_2.aString80 + "_staticelements");
			} else {
				Static330.aClass116_2 = new Class116(0);
			}
			Static330.method674();
			Static500.anInt8324 = 70;
			Static632.method8528(true);
			Static495.method7089();
		} else if (Static500.anInt8324 == 70) {
			Static32.aClass127_2 = new Class127(arg0, 11, true, Static141.aCanvas7);
			Static500.anInt8324 = 73;
			Static632.method8528(true);
			Static495.method7089();
		} else if (Static500.anInt8324 == 73) {
			Static255.aClass127_4 = new Class127(arg0, 12, true, Static141.aCanvas7);
			Static500.anInt8324 = 76;
			Static632.method8528(true);
			Static495.method7089();
		} else if (Static500.anInt8324 == 76) {
			Static603.aClass127_10 = new Class127(arg0, 14, true, Static141.aCanvas7);
			Static500.anInt8324 = 79;
			Static632.method8528(true);
			Static495.method7089();
		} else if (Static500.anInt8324 == 79) {
			Static614.aClass127_12 = new Class127(arg0, 17, true, Static141.aCanvas7);
			Static500.anInt8324 = 82;
			Static632.method8528(true);
			Static495.method7089();
		} else if (Static500.anInt8324 == 82) {
			Static418.aClass127_7 = new Class127(arg0, 19, true, Static141.aCanvas7);
			Static500.anInt8324 = 85;
			Static632.method8528(true);
			Static495.method7089();
		} else if (Static500.anInt8324 == 85) {
			Static449.aClass127_8 = new Class127(arg0, 22, true, Static141.aCanvas7);
			Static500.anInt8324 = 88;
			Static632.method8528(true);
			Static495.method7089();
		} else if (Static500.anInt8324 == 88) {
			Static1.aClass127_11 = new Class127(arg0, 26, true, Static141.aCanvas7);
			Static500.anInt8324 = 91;
			Static632.method8528(true);
			Static495.method7089();
		} else {
			Static593.aClass127_9 = new Class127(arg0, 30, true, Static141.aCanvas7);
			Static500.anInt8324 = 100;
			Static632.method8528(true);
			Static495.method7089();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IIIII)V")
	public static void method7649(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static168.anInt3361; local7++) {
			@Pc(13) Rectangle local13 = Class12_Sub8.aRectangleArray1[local7];
			if (local13.x + local13.width > arg3 && arg1 + arg3 > local13.x && local13.y + local13.height > arg0 && local13.y < arg0 + arg2) {
				Static208.aBooleanArray18[local7] = true;
			}
		}
		Static520.method7366(arg3, arg0 + arg2, arg0, arg1 + arg3);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Z)V")
	public static void method7650() {
		Static290.anInt5662 = -1;
		Static359.aClass50_26 = null;
	}
}
