import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static326 {

	@OriginalMember(owner = "client!lj", name = "dc", descriptor = "[B")
	public static byte[] aByteArray45;

	@OriginalMember(owner = "client!lj", name = "nb", descriptor = "[B")
	public static final byte[] aByteArray43 = new byte[520];

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(IIII)Lclient!kn;")
	public static Class14_Sub1_Sub1_Sub3 method5062(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) Class156 local11 = Static535.aClass156ArrayArrayArray2[arg0][arg2][arg1];
		if (local11 == null) {
			return null;
		}
		@Pc(22) Class14_Sub1_Sub1_Sub3 local22 = null;
		@Pc(24) int local24 = -1;
		for (@Pc(27) Class66 local27 = local11.aClass66_2; local27 != null; local27 = local27.aClass66_1) {
			@Pc(31) Class14_Sub1_Sub1 local31 = local27.aClass14_Sub1_Sub1_1;
			if (local31 instanceof Class14_Sub1_Sub1_Sub3) {
				@Pc(37) Class14_Sub1_Sub1_Sub3 local37 = (Class14_Sub1_Sub1_Sub3) local31;
				@Pc(47) int local47 = (local37.method2509() - 1) * 256 + 252;
				@Pc(54) int local54 = local37.anInt9317 - local47 >> 9;
				@Pc(62) int local62 = local37.anInt9315 - local47 >> 9;
				@Pc(70) int local70 = local37.anInt9317 + local47 >> 9;
				@Pc(77) int local77 = local47 + local37.anInt9315 >> 9;
				if (arg2 >= local54 && local62 <= arg1 && local70 >= arg2 && local77 >= arg1) {
					@Pc(107) int local107 = (local77 + 1 - arg1) * (local70 - (-1 - -arg2));
					if (local107 > local24) {
						local22 = local37;
						local24 = local107;
					}
				}
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)Z")
	public static boolean method5072(@OriginalArg(1) int arg0) {
		return arg0 == 4 || arg0 == 8 || arg0 == 11;
	}

	@OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
	public static void method5074() {
		Static400.aClass384_100.anInt10469 = 1;
		Static258.method3974();
		Static292.aBoolean386 = true;
		Static342.aBoolean492 = true;
		Static429.method6450();
		for (@Pc(8180) int local8180 = 0; local8180 < Static568.aClass16Array1.length; local8180++) {
			Static568.aClass16Array1[local8180] = null;
		}
		Static202.aBoolean295 = false;
		Static83.method7211();
		Static541.anInt8999 = (int) (Math.random() * 100.0D) - 50;
		Static402.anInt9327 = (int) (Math.random() * 120.0D) - 60;
		Static145.anInt6904 = (int) (Math.random() * 80.0D) - 40;
		Static314.anInt6318 = (int) (Math.random() * 110.0D) - 55;
		Static425.anInt7212 = (int) (Math.random() * 30.0D) - 20;
		Static112.aFloat22 = (float) ((int) (Math.random() * 160.0D) - 80 & 0x3FFF);
		Static325.method5031();
		for (@Pc(8249) int local8249 = 0; local8249 < 2048; local8249++) {
			Static377.aClass14_Sub1_Sub1_Sub3_Sub1Array1[local8249] = null;
		}
		Static108.anInt1716 = 0;
		Static58.anInt926 = 0;
		Static51.aClass81_11.method1602();
		Static471.aClass306_45.method7315();
		Static334.aClass306_29.method7315();
		Static41.aClass363_1.method8482();
		Static402.aClass81_65.method1602();
		Static404.aClass306_36 = new Class306();
		Static498.aClass306_55 = new Class306();
		Static564.aClass304_1.method7290();
		Static555.method6329();
		Static2.anInt7 = 0;
		Static193.anInt3440 = 0;
		Static178.anInt3172 = 0;
		Static576.anInt9475 = 0;
		Static87.anInt1434 = 0;
		Static477.anInt7975 = 0;
		Static315.anInt5510 = 0;
		Static512.anInt9960 = 0;
		Static148.anInt4148 = 0;
		Static636.anInt10317 = 0;
		for (@Pc(8313) int local8313 = 0; local8313 < Static605.anIntArray802.length; local8313++) {
			if (!Static361.aBooleanArray42[local8313]) {
				Static605.anIntArray802[local8313] = -1;
			}
		}
		if (Static302.anInt4813 != -1) {
			Static194.method3066(Static302.anInt4813);
		}
		for (@Pc(8343) Class5_Sub15 local8343 = (Class5_Sub15) Static183.aClass81_27.method1608(); local8343 != null; local8343 = (Class5_Sub15) Static183.aClass81_27.method1610()) {
			if (!local8343.method8913()) {
				local8343 = (Class5_Sub15) Static183.aClass81_27.method1608();
				if (local8343 == null) {
					break;
				}
			}
			Static177.method2689(false, true, local8343);
		}
		Static302.anInt4813 = -1;
		Static183.aClass81_27 = new Class81(8);
		Static292.method4308();
		Static381.aClass357_7 = null;
		for (@Pc(8382) int local8382 = 0; local8382 < 8; local8382++) {
			Static195.aStringArray14[local8382] = null;
			Static94.aBooleanArray59[local8382] = false;
			Static259.anIntArray173[local8382] = -1;
		}
		Static338.method5184();
		Static503.aBoolean326 = true;
		for (@Pc(8408) int local8408 = 0; local8408 < 100; local8408++) {
			Static609.aBooleanArray58[local8408] = true;
		}
		for (@Pc(8420) int local8420 = 0; local8420 < 6; local8420++) {
			Static328.aClass205Array1[local8420] = new Class205();
		}
		for (@Pc(8434) int local8434 = 0; local8434 < 25; local8434++) {
			Static242.anIntArray346[local8434] = 0;
			Static221.anIntArray312[local8434] = 0;
			Static20.anIntArray33[local8434] = 0;
		}
		Static571.method8044();
		Static349.aBoolean501 = true;
		Static283.aShortArray60 = Static256.aShortArray131 = Static188.aShortArray191 = Static322.aShortArray63 = new short[256];
		Static490.aString118 = Static76.aClass58_27.method1237(Static321.anInt5554);
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub8_2, Static627.aClass5_Sub46_31.aClass11_Sub8_1.method2214());
		Static627.aClass5_Sub46_31.method8192(Static627.aClass5_Sub46_31.aClass11_Sub10_1, Static627.aClass5_Sub46_31.aClass11_Sub10_2.method2643());
		Static115.anInt1789 = 0;
		Static300.method4350();
		Static172.method2651();
		Static400.aClass384_100.anInt10469 = 2;
		Static357.aLong178 = 0L;
		Static214.aClass5_Sub44_1 = null;
	}

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "(I)[Lclient!uk;")
	public static Class346[] method5076() {
		return new Class346[] { Static363.aClass346_4, Static317.aClass346_3, Static601.aClass346_7, Static383.aClass346_5, Static28.aClass346_1, Static435.aClass346_6 };
	}
}
