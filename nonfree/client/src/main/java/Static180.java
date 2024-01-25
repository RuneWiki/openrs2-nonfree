import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!ll", name = "bb", descriptor = "Lclient!di;")
	public static Class38 aClass38_5;

	@OriginalMember(owner = "client!ll", name = "eb", descriptor = "Lclient!kq;")
	public static Class110 aClass110_6;

	@OriginalMember(owner = "client!ll", name = "M", descriptor = "I")
	public static int anInt3754 = 0;

	@OriginalMember(owner = "client!ll", name = "ab", descriptor = "[I")
	public static final int[] anIntArray440 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

	@OriginalMember(owner = "client!ll", name = "db", descriptor = "I")
	public static int anInt3759 = 0;

	@OriginalMember(owner = "client!ll", name = "f", descriptor = "(B)V")
	public static void method3539() {
		for (@Pc(3) int local3 = 0; local3 < Static46.anInt1004; local3++) {
			@Pc(9) int local9 = Static148.anIntArray636[local3]--;
			if (Static148.anIntArray636[local3] >= -10) {
				@Pc(84) Class81 local84 = Static103.aClass81Array1[local3];
				if (local84 == null) {
					local84 = Static359.method2199(Static301.aClass165_92, Static252.anIntArray630[local3], 0);
					if (local84 == null) {
						continue;
					}
					Static148.anIntArray636[local3] += local84.method2201();
					Static103.aClass81Array1[local3] = local84;
				}
				if (Static148.anIntArray636[local3] < 0) {
					@Pc(218) int local218;
					if (Static134.anIntArray313[local3] == 0) {
						local218 = Static131.anIntArray308[local3] * Static115.anInt2304 >> 8;
					} else {
						@Pc(131) int local131 = (Static134.anIntArray313[local3] & 0xFF) * 128;
						@Pc(139) int local139 = Static134.anIntArray313[local3] >> 16 & 0xFF;
						@Pc(149) int local149 = local139 * 128 + 64 - Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5050;
						if (local149 < 0) {
							local149 = -local149;
						}
						@Pc(162) int local162 = Static134.anIntArray313[local3] >> 8 & 0xFF;
						@Pc(172) int local172 = local162 * 128 + 64 - Static130.aClass5_Sub3_Sub3_Sub1_1.anInt5047;
						if (local172 < 0) {
							local172 = -local172;
						}
						@Pc(183) int local183 = local172 + local149 - 128;
						if (local183 > local131) {
							Static148.anIntArray636[local3] = -100;
							continue;
						}
						if (local183 < 0) {
							local183 = 0;
						}
						local218 = (local131 - local183) * Static8.anInt201 * Static131.anIntArray308[local3] / local131 >> 8;
					}
					if (local218 > 0) {
						@Pc(235) Class1_Sub12_Sub1 local235 = local84.method2202().method1480(Static49.aClass213_1);
						@Pc(240) Class1_Sub6_Sub3 local240 = Static357.method1498(local235, local218);
						local240.method1526(Static23.anIntArray78[local3] - 1);
						Static170.aClass1_Sub6_Sub4_2.method1670(local240);
					}
					Static148.anIntArray636[local3] = -100;
				}
			} else {
				Static46.anInt1004--;
				for (@Pc(23) int local23 = local3; local23 < Static46.anInt1004; local23++) {
					Static252.anIntArray630[local23] = Static252.anIntArray630[local23 + 1];
					Static103.aClass81Array1[local23] = Static103.aClass81Array1[local23 + 1];
					Static23.anIntArray78[local23] = Static23.anIntArray78[local23 + 1];
					Static148.anIntArray636[local23] = Static148.anIntArray636[local23 + 1];
					Static134.anIntArray313[local23] = Static134.anIntArray313[local23 + 1];
					Static131.anIntArray308[local23] = Static131.anIntArray308[local23 + 1];
				}
				local3--;
			}
		}
		if (Static275.aBoolean463 && !Static268.method4682()) {
			if (Static211.anInt4208 != 0 && Static43.anInt2906 != -1) {
				Static299.method5095(Static242.aClass165_74, Static43.anInt2906, Static211.anInt4208);
			}
			Static275.aBoolean463 = false;
		} else if (Static211.anInt4208 != 0 && Static43.anInt2906 != -1 && !Static268.method4682()) {
			Static248.aClass1_Sub7_Sub1_2.method728(92);
			Static248.aClass1_Sub7_Sub1_2.method3098(Static43.anInt2906);
			Static43.anInt2906 = -1;
		}
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method3540(@OriginalArg(1) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(12) String local12 = Static34.method902(arg0);
		if (local12 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < Static290.anInt5612; local21++) {
			@Pc(31) String local31 = Static34.method902(Static257.aStringArray33[local21]);
			if (local31 != null && local31.equals(local12)) {
				Static290.anInt5612--;
				for (@Pc(43) int local43 = local21; local43 < Static290.anInt5612; local43++) {
					Static257.aStringArray33[local43] = Static257.aStringArray33[local43 + 1];
					Static294.aStringArray40[local43] = Static294.aStringArray40[local43 + 1];
					Static205.anIntArray493[local43] = Static205.anIntArray493[local43 + 1];
					Static68.aStringArray7[local43] = Static68.aStringArray7[local43 + 1];
					Static264.anIntArray684[local43] = Static264.anIntArray684[local43 + 1];
					Static333.aBooleanArray26[local43] = Static333.aBooleanArray26[local43 + 1];
				}
				Static152.anInt3055 = Static119.anInt2038;
				Static248.aClass1_Sub7_Sub1_2.method728(239);
				Static248.aClass1_Sub7_Sub1_2.method3108(Static203.method3794(arg0));
				Static248.aClass1_Sub7_Sub1_2.method3124(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ll", name = "b", descriptor = "(III)I")
	public static int method3541(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = arg1 >>> 31;
		return (local12 + arg1) / arg0 - local12;
	}

	@OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIIZZ)V")
	public static void method3543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4) {
		Static222.anInt4391 = arg0;
		Static74.anInt3404 = arg1;
		Static346.anInt6451 = arg2;
		Static269.aClass204ArrayArrayArray3 = new Class204[4][Static222.anInt4391][Static74.anInt3404];
		Static288.aClass41Array5 = new Class41[4];
		if (arg3) {
			Static198.aClass204ArrayArrayArray2 = new Class204[1][Static222.anInt4391][Static74.anInt3404];
			Static23.anIntArrayArray1 = new int[Static222.anInt4391][Static74.anInt3404];
			Static236.aClass41Array4 = new Class41[1];
		} else {
			Static198.aClass204ArrayArrayArray2 = null;
			Static23.anIntArrayArray1 = null;
			Static236.aClass41Array4 = null;
		}
		if (arg4) {
			Static116.anIntArrayArrayArray7 = new int[4][arg0][arg1];
			Static327.aClass1_Sub31_Sub1Array3 = new Class1_Sub31_Sub1[255];
			Static30.aBooleanArray3 = new boolean[255];
			Static160.anInt3182 = 0;
		} else {
			Static116.anIntArrayArrayArray7 = null;
			Static327.aClass1_Sub31_Sub1Array3 = null;
			Static30.aBooleanArray3 = null;
			Static160.anInt3182 = 0;
		}
		Static47.method1089(false);
		Static263.aClass210Array2 = new Class210[500];
		Static93.anInt1792 = 0;
		Static69.aClass210Array1 = new Class210[500];
		Static35.anInt880 = 0;
		Static335.anIntArrayArrayArray13 = new int[4][Static222.anInt4391 + 1][Static74.anInt3404 + 1];
		Static184.aClass5_Sub3Array3 = new Class5_Sub3[5000];
		Static10.anInt234 = 0;
		Static57.aBooleanArrayArray7 = new boolean[Static346.anInt6451 + Static346.anInt6451 + 1][Static346.anInt6451 + Static346.anInt6451 + 1];
		Static134.aBooleanArrayArray13 = new boolean[Static346.anInt6451 + Static346.anInt6451 + 2][Static346.anInt6451 + Static346.anInt6451 + 2];
		Static202.aClass28_1 = null;
	}

	@OriginalMember(owner = "client!ll", name = "c", descriptor = "(II)V")
	public static void method3544(@OriginalArg(0) int arg0) {
		Static66.anInt1398 = arg0;
		@Pc(7) Class140 local7 = Static95.aClass140_53;
		synchronized (Static95.aClass140_53) {
			Static95.aClass140_53.method3819();
		}
	}
}
