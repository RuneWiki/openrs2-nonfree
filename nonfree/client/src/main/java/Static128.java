import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!na", name = "I", descriptor = "Lclient!ai;")
	public static Class7 aClass7_24;

	@OriginalMember(owner = "client!na", name = "J", descriptor = "Lclient!ch;")
	public static Class1_Sub1_Sub6 aClass1_Sub1_Sub6_3;

	@OriginalMember(owner = "client!na", name = "K", descriptor = "[I")
	public static int[] anIntArray362;

	@OriginalMember(owner = "client!na", name = "R", descriptor = "I")
	public static int anInt2812;

	@OriginalMember(owner = "client!na", name = "S", descriptor = "I")
	public static int anInt2813;

	@OriginalMember(owner = "client!na", name = "L", descriptor = "Lclient!kh;")
	public static Class60 aClass60_963 = Static200.method3116("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!na", name = "cb", descriptor = "Lclient!kh;")
	private static Class60 aClass60_968 = Static200.method3116("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!na", name = "M", descriptor = "Lclient!kh;")
	public static Class60 aClass60_964 = aClass60_968;

	@OriginalMember(owner = "client!na", name = "Z", descriptor = "Lclient!kh;")
	private static Class60 aClass60_967 = Static200.method3116("green:");

	@OriginalMember(owner = "client!na", name = "O", descriptor = "Lclient!kh;")
	public static Class60 aClass60_965 = aClass60_967;

	@OriginalMember(owner = "client!na", name = "P", descriptor = "I")
	public static int anInt2810 = 0;

	@OriginalMember(owner = "client!na", name = "Q", descriptor = "I")
	public static int anInt2811 = 0;

	@OriginalMember(owner = "client!na", name = "X", descriptor = "Lclient!kh;")
	public static Class60 aClass60_966 = aClass60_967;

	@OriginalMember(owner = "client!na", name = "Y", descriptor = "[[[Lclient!db;")
	public static Class19[][][] aClass19ArrayArrayArray1 = new Class19[4][104][104];

	@OriginalMember(owner = "client!na", name = "ab", descriptor = "Z")
	public static boolean aBoolean157 = false;

	@OriginalMember(owner = "client!na", name = "e", descriptor = "(B)V")
	public static void method2140() {
		if (!Static162.aBoolean261) {
			Static23.aClass60Array17[0] = Static185.aClass60_1341;
			Static91.anInt2134 = 1;
			Static171.aShortArray50[0] = 1004;
			Static52.aClass60Array8[0] = Static149.aClass60_1155;
		}
		if (Static83.anInt1958 != -1) {
			Static153.method2603(Static83.anInt1958);
		}
		for (@Pc(32) int local32 = 0; local32 < Static124.anInt2763; local32++) {
			if (Static153.aBooleanArray19[local32]) {
				Static47.aBooleanArray4[local32] = true;
			}
			Static15.aBooleanArray1[local32] = Static153.aBooleanArray19[local32];
			Static153.aBooleanArray19[local32] = false;
		}
		Static36.anInt3884 = -1;
		Static88.anInt2046 = Static42.anInt910;
		Static214.aClass6_16 = null;
		Static30.anInt719 = -1;
		if (Static83.anInt1958 != -1) {
			Static124.anInt2763 = 0;
			Static202.method3135(0, Static88.anInt2058, Static112.anInt2563, 0, 0, 0, Static83.anInt1958, -1);
		}
		Static76.method1364();
		Static63.method1148();
		if (Static162.aBoolean261) {
			Static49.method959();
		} else if (Static30.anInt719 != -1) {
			Static219.method3523(Static36.anInt3884, Static30.anInt719);
		}
		if (Static84.anInt1466 == 3) {
			for (@Pc(103) int local103 = 0; local103 < Static124.anInt2763; local103++) {
				if (Static15.aBooleanArray1[local103]) {
					Static76.method1368(Static6.anIntArray20[local103], Static34.anIntArray123[local103], Static1.anIntArray9[local103], Static91.anIntArray252[local103], 16711935, 128);
				} else if (Static47.aBooleanArray4[local103]) {
					Static76.method1368(Static6.anIntArray20[local103], Static34.anIntArray123[local103], Static1.anIntArray9[local103], Static91.anIntArray252[local103], 16711680, 128);
				}
			}
		}
		Static9.method3248(Static84.aClass9_Sub4_Sub1_2.anInt3903, Static180.anInt3841, Static26.anInt594, Static84.aClass9_Sub4_Sub1_2.anInt3925);
		Static26.anInt594 = 0;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IILclient!kh;)V")
	public static void method2141(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1) {
		Static96.aClass1_Sub9_Sub1_3.method953(40);
		Static96.aClass1_Sub9_Sub1_3.method913(arg1.method1829());
		Static96.aClass1_Sub9_Sub1_3.method899(arg0);
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIIIIII)V")
	public static void method2143(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = arg1;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg0;
		@Pc(20) int local20 = arg5 * arg5;
		@Pc(25) int local25 = arg1 - arg0;
		@Pc(29) int local29 = local25 * local25;
		@Pc(33) int local33 = local20 << 1;
		@Pc(37) int local37 = arg1 * arg1;
		@Pc(41) int local41 = local16 * local16;
		@Pc(45) int local45 = local37 << 1;
		@Pc(54) int local54 = local29 << 1;
		@Pc(58) int local58 = local41 << 1;
		@Pc(62) int local62 = arg1 << 1;
		@Pc(66) int local66 = local25 << 1;
		@Pc(76) int local76 = local20 * (1 - local62) + local45;
		@Pc(84) int local84 = local37 - local33 * (local62 - 1);
		@Pc(93) int local93 = local54 + local41 * (1 - local66);
		@Pc(97) int local97 = local37 << 2;
		@Pc(101) int local101 = local41 << 2;
		@Pc(105) int local105 = local29 << 2;
		@Pc(109) int local109 = local45 * 3;
		@Pc(113) int local113 = local20 << 2;
		@Pc(121) int local121 = local29 - local58 * (local66 - 1);
		@Pc(127) int local127 = local58 * (local66 - 3);
		@Pc(131) int local131 = local54 * 3;
		@Pc(133) int local133 = local97;
		@Pc(139) int local139 = (local62 - 3) * local33;
		@Pc(145) int local145 = (local25 - 1) * local101;
		@Pc(151) int local151 = local113 * (arg1 - 1);
		@Pc(153) int local153 = local105;
		@Pc(157) int[] local157 = Static148.anIntArrayArray78[arg2];
		Static104.method1768(arg3 - arg5, arg3 - local16, arg4, local157);
		Static104.method1768(arg3 - local16, local16 + arg3, arg6, local157);
		Static104.method1768(arg3 + local16, arg5 + arg3, arg4, local157);
		while (local7 > 0) {
			if (local76 < 0) {
				while (local76 < 0) {
					local9++;
					local76 += local109;
					local84 += local133;
					local133 += local97;
					local109 += local97;
				}
			}
			if (local84 < 0) {
				local84 += local133;
				local133 += local97;
				local9++;
				local76 += local109;
				local109 += local97;
			}
			local76 += -local151;
			local84 += -local139;
			local151 -= local113;
			local139 -= local113;
			@Pc(258) int local258 = arg3 + local9;
			@Pc(269) boolean local269 = local25 >= local7;
			if (local269) {
				if (local93 < 0) {
					while (local93 < 0) {
						local121 += local153;
						local11++;
						local93 += local131;
						local153 += local105;
						local131 += local105;
					}
				}
				if (local121 < 0) {
					local11++;
					local93 += local131;
					local121 += local153;
					local131 += local105;
					local153 += local105;
				}
				local121 += -local127;
				local93 += -local145;
				local145 -= local101;
				local127 -= local101;
			}
			local7--;
			@Pc(342) int local342 = arg3 - local9;
			@Pc(347) int local347 = arg2 - local7;
			@Pc(351) int local351 = local7 + arg2;
			if (local269) {
				@Pc(376) int local376 = arg3 + local11;
				@Pc(381) int local381 = arg3 - local11;
				Static104.method1768(local342, local381, arg4, Static148.anIntArrayArray78[local347]);
				Static104.method1768(local381, local376, arg6, Static148.anIntArrayArray78[local347]);
				Static104.method1768(local376, local258, arg4, Static148.anIntArrayArray78[local347]);
				Static104.method1768(local342, local381, arg4, Static148.anIntArrayArray78[local351]);
				Static104.method1768(local381, local376, arg6, Static148.anIntArrayArray78[local351]);
				Static104.method1768(local376, local258, arg4, Static148.anIntArrayArray78[local351]);
			} else {
				Static104.method1768(local342, local258, arg4, Static148.anIntArrayArray78[local347]);
				Static104.method1768(local342, local258, arg4, Static148.anIntArrayArray78[local351]);
			}
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIBIII)V")
	public static void method2144(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(13) int local13 = Static107.method1863(Static141.anInt3163, arg3, Static200.anInt4273);
		@Pc(19) int local19 = Static107.method1863(Static141.anInt3163, arg1, Static200.anInt4273);
		@Pc(25) int local25 = Static107.method1863(Static214.anInt4572, arg2, Static130.anInt2847);
		@Pc(31) int local31 = Static107.method1863(Static214.anInt4572, arg5, Static130.anInt2847);
		@Pc(39) int local39 = Static107.method1863(Static141.anInt3163, arg4 + arg3, Static200.anInt4273);
		@Pc(47) int local47 = Static107.method1863(Static141.anInt3163, arg1 - arg4, Static200.anInt4273);
		for (@Pc(49) int local49 = local13; local49 < local39; local49++) {
			Static104.method1768(local25, local31, arg0, Static148.anIntArrayArray78[local49]);
		}
		for (@Pc(65) int local65 = local19; local65 > local47; local65--) {
			Static104.method1768(local25, local31, arg0, Static148.anIntArrayArray78[local65]);
		}
		@Pc(99) int local99 = Static107.method1863(Static214.anInt4572, arg2 + arg4, Static130.anInt2847);
		@Pc(107) int local107 = Static107.method1863(Static214.anInt4572, arg5 - arg4, Static130.anInt2847);
		for (@Pc(109) int local109 = local39; local109 <= local47; local109++) {
			@Pc(115) int[] local115 = Static148.anIntArrayArray78[local109];
			Static104.method1768(local25, local99, arg0, local115);
			Static104.method1768(local107, local31, arg0, local115);
		}
	}
}
