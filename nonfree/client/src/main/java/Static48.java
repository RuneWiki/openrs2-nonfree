import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!f", name = "db", descriptor = "Lclient!ab;")
	public static Class3 aClass3_7;

	@OriginalMember(owner = "client!f", name = "X", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_9 = new Class47(64);

	@OriginalMember(owner = "client!f", name = "gb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_515 = Static187.method3089("rect_debug=");

	@OriginalMember(owner = "client!f", name = "hb", descriptor = "Lclient!vd;")
	public static Class92 aClass92_516 = null;

	@OriginalMember(owner = "client!f", name = "ib", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_517 = Static187.method3089(" <col=00ff80>");

	@OriginalMember(owner = "client!f", name = "jb", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_518 = Static187.method3089(" ");

	@OriginalMember(owner = "client!f", name = "kb", descriptor = "[Lclient!oh;")
	public static final Class74[] aClass74Array1 = new Class74[500];

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IIIBIIII)V")
	public static void method860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(3) int local3 = 0;
		@Pc(5) int local5 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg0 - arg3;
		@Pc(20) int local20 = local16 * local16;
		@Pc(24) int local24 = arg6 * arg6;
		@Pc(28) int local28 = arg0 * arg0;
		@Pc(33) int local33 = arg6 - arg3;
		@Pc(37) int local37 = local33 * local33;
		@Pc(41) int local41 = local24 << 1;
		@Pc(45) int local45 = local28 << 1;
		@Pc(49) int local49 = local37 << 1;
		@Pc(53) int local53 = arg6 << 1;
		@Pc(57) int local57 = local20 << 1;
		@Pc(65) int local65 = (1 - local53) * local28 + local41;
		@Pc(74) int local74 = local24 - (local53 - 1) * local45;
		@Pc(78) int local78 = local33 << 1;
		@Pc(88) int local88 = local20 * (1 - local78) + local49;
		@Pc(97) int local97 = local37 - (local78 - 1) * local57;
		@Pc(101) int local101 = local28 << 2;
		@Pc(105) int local105 = local24 << 2;
		@Pc(109) int local109 = local41 * 3;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local20 << 2;
		@Pc(131) int local131 = local45 * (local53 - 3);
		@Pc(137) int local137 = local57 * (local78 - 3);
		@Pc(141) int local141 = local49 * 3;
		@Pc(143) int local143 = local105;
		@Pc(149) int local149 = (arg6 - 1) * local101;
		@Pc(151) int local151 = local113;
		@Pc(174) int local174;
		@Pc(182) int local182;
		@Pc(191) int local191;
		@Pc(199) int local199;
		if (arg2 >= Static118.anInt2521 && Static204.anInt2389 >= arg2) {
			@Pc(165) int[] local165 = Static142.anIntArrayArray25[arg2];
			local174 = Static19.method429(Static102.anInt2207, arg5 - arg0, Static116.anInt2488);
			local182 = Static19.method429(Static102.anInt2207, arg5 + arg0, Static116.anInt2488);
			local191 = Static19.method429(Static102.anInt2207, arg5 - local16, Static116.anInt2488);
			local199 = Static19.method429(Static102.anInt2207, arg5 + local16, Static116.anInt2488);
			Static74.method1123(local174, arg1, local165, local191);
			Static74.method1123(local191, arg4, local165, local199);
			Static74.method1123(local199, arg1, local165, local182);
		}
		@Pc(223) int local223 = local117 * (local33 - 1);
		while (local5 > 0) {
			if (local65 < 0) {
				while (local65 < 0) {
					local65 += local109;
					local3++;
					local109 += local105;
					local74 += local143;
					local143 += local105;
				}
			}
			if (local74 < 0) {
				local3++;
				local74 += local143;
				local143 += local105;
				local65 += local109;
				local109 += local105;
			}
			@Pc(278) boolean local278 = local5 <= local33;
			local74 += -local131;
			local5--;
			local131 -= local101;
			if (local278) {
				if (local88 < 0) {
					while (local88 < 0) {
						local11++;
						local97 += local151;
						local151 += local113;
						local88 += local141;
						local141 += local113;
					}
				}
				if (local97 < 0) {
					local97 += local151;
					local88 += local141;
					local141 += local113;
					local151 += local113;
					local11++;
				}
				local97 += -local137;
				local88 += -local223;
				local223 -= local117;
				local137 -= local117;
			}
			local65 += -local149;
			local149 -= local101;
			local182 = local5 + arg2;
			local174 = arg2 - local5;
			if (Static118.anInt2521 <= local182 && Static204.anInt2389 >= local174) {
				local191 = Static19.method429(Static102.anInt2207, local3 + arg5, Static116.anInt2488);
				local199 = Static19.method429(Static102.anInt2207, arg5 - local3, Static116.anInt2488);
				if (local278) {
					@Pc(411) int local411 = Static19.method429(Static102.anInt2207, local11 + arg5, Static116.anInt2488);
					@Pc(420) int local420 = Static19.method429(Static102.anInt2207, arg5 - local11, Static116.anInt2488);
					@Pc(431) int[] local431;
					if (local174 >= Static118.anInt2521) {
						local431 = Static142.anIntArrayArray25[local174];
						Static74.method1123(local199, arg1, local431, local420);
						Static74.method1123(local420, arg4, local431, local411);
						Static74.method1123(local411, arg1, local431, local191);
					}
					if (local182 <= Static204.anInt2389) {
						local431 = Static142.anIntArrayArray25[local182];
						Static74.method1123(local199, arg1, local431, local420);
						Static74.method1123(local420, arg4, local431, local411);
						Static74.method1123(local411, arg1, local431, local191);
					}
				} else {
					if (local174 >= Static118.anInt2521) {
						Static74.method1123(local199, arg1, Static142.anIntArrayArray25[local174], local191);
					}
					if (local182 <= Static204.anInt2389) {
						Static74.method1123(local199, arg1, Static142.anIntArrayArray25[local182], local191);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ILclient!ab;Lclient!ab;Ljava/awt/Component;)V")
	private static void method861(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class3 arg1, @OriginalArg(3) Component arg2) {
		if (Static200.aBoolean237) {
			return;
		}
		Static46.method3156();
		@Pc(15) byte[] local15 = arg1.method3265(Static17.anInt3467, 0);
		Static175.aClass1_Sub3_Sub1_Sub1_5 = new Class1_Sub3_Sub1_Sub1(local15, arg2);
		Static124.aClass1_Sub3_Sub1_Sub1_3 = Static175.aClass1_Sub3_Sub1_Sub1_5.method350();
		Static42.aClass1_Sub3_Sub1_Sub5_1 = Static60.method994(arg0, Static187.anInt4097);
		Static117.aClass1_Sub3_Sub1_Sub5_2 = Static60.method994(arg0, Static85.anInt1856);
		Static172.aClass1_Sub3_Sub1_Sub5_4 = Static60.method994(arg0, Static155.anInt2985);
		Static194.aClass1_Sub3_Sub1_Sub5Array9 = Static95.method1387(Static195.anInt4229, arg0);
		Static138.aClass1_Sub3_Sub1_Sub5Array6 = Static95.method1387(Static73.anInt1643, arg0);
		Static66.anIntArray121 = new int[256];
		for (@Pc(54) int local54 = 0; local54 < 64; local54++) {
			Static66.anIntArray121[local54] = local54 * 262144;
		}
		for (@Pc(70) int local70 = 0; local70 < 64; local70++) {
			Static66.anIntArray121[local70 + 64] = local70 * 1024 + 16711680;
		}
		for (@Pc(88) int local88 = 0; local88 < 64; local88++) {
			Static66.anIntArray121[local88 + 128] = local88 * 4 + 16776960;
		}
		for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
			Static66.anIntArray121[local108 + 192] = 16777215;
		}
		Static51.anIntArray91 = new int[256];
		for (@Pc(125) int local125 = 0; local125 < 64; local125++) {
			Static51.anIntArray91[local125] = local125 * 1024;
		}
		for (@Pc(139) int local139 = 0; local139 < 64; local139++) {
			Static51.anIntArray91[local139 + 64] = local139 * 4 + 65280;
		}
		for (@Pc(159) int local159 = 0; local159 < 64; local159++) {
			Static51.anIntArray91[local159 + 128] = local159 * 262144 + 65535;
		}
		for (@Pc(177) int local177 = 0; local177 < 64; local177++) {
			Static51.anIntArray91[local177 + 192] = 16777215;
		}
		Static152.anIntArray280 = new int[256];
		for (@Pc(196) int local196 = 0; local196 < 64; local196++) {
			Static152.anIntArray280[local196] = local196 * 4;
		}
		for (@Pc(210) int local210 = 0; local210 < 64; local210++) {
			Static152.anIntArray280[local210 + 64] = local210 * 262144 + 255;
		}
		for (@Pc(228) int local228 = 0; local228 < 64; local228++) {
			Static152.anIntArray280[local228 + 128] = local228 * 1024 + 16711935;
		}
		for (@Pc(248) int local248 = 0; local248 < 64; local248++) {
			Static152.anIntArray280[local248 + 192] = 16777215;
		}
		Static104.anIntArray170 = new int[256];
		Static131.anIntArray211 = new int[32768];
		Static36.anIntArray76 = new int[32768];
		Static164.method2562(null);
		Static88.aClass92_811 = Static88.aClass92_810;
		Static36.aBoolean65 = false;
		Static123.anIntArray197 = new int[32768];
		Static88.aClass92_813 = Static88.aClass92_810;
		Static143.anIntArray252 = new int[32768];
		if (Static22.anInt552 == 0) {
			Static27.aBoolean40 = true;
		} else {
			Static27.aBoolean40 = false;
		}
		Static106.anInt2304 = 0;
		if (Static27.aBoolean40) {
			Static77.method1170();
		} else {
			Static93.method1364(Static32.anInt770, 255, Static166.aClass3_Sub1_23);
		}
		Static138.method2071(false);
		Static200.aBoolean237 = true;
		Static113.method1687();
		Static197.aClass1_Sub3_Sub1_Sub1_7 = new Class1_Sub3_Sub1_Sub1(128, 254);
		Static34.aClass1_Sub3_Sub1_Sub1_2 = new Class1_Sub3_Sub1_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "(II)V")
	public static void method862(@OriginalArg(0) int arg0) {
		if (arg0 == Static31.anInt748) {
			return;
		}
		if (Static31.anInt748 == 0) {
			Static110.method1654();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static97.anInt2039 = 0;
			Static1.anInt56 = 0;
			Static72.anInt1619 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static179.aClass57_4 != null) {
			Static179.aClass57_4.method1672();
			Static179.aClass57_4 = null;
		}
		if (Static31.anInt748 == 25) {
			Static28.anInt645 = 0;
			Static123.anInt2600 = 1;
			Static132.anInt2747 = 0;
			Static29.anInt717 = 0;
			Static49.anInt1254 = 1;
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			method861(Static71.aClass3_Sub1_8, Static109.aClass3_Sub1_17, Static119.aCanvas1);
		} else {
			Static27.method495();
		}
		Static31.anInt748 = arg0;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(ZZI)I")
	public static int method863() {
		return Static170.anInt3546 + Static106.anInt2305;
	}

	@OriginalMember(owner = "client!f", name = "a", descriptor = "(IBIIZZZI)Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1 method864(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) boolean arg5, @OriginalArg(7) int arg6) {
		@Pc(29) long local29 = ((long) arg0 << 40) + ((long) arg6 << 38) + ((long) arg2 << 16) + (long) arg1 + (arg5 ? 137438953472L : 0L);
		@Pc(39) Class1_Sub3_Sub1_Sub1 local39;
		if (!arg4 && !arg3) {
			local39 = (Class1_Sub3_Sub1_Sub1) Static106.aClass47_17.method1281(local29);
			if (local39 != null) {
				return local39;
			}
		}
		@Pc(47) Class1_Sub3_Sub22 local47 = Static102.method1549(arg1);
		if (arg2 > 1 && local47.anIntArray323 != null) {
			@Pc(55) int local55 = -1;
			for (@Pc(57) int local57 = 0; local57 < 10; local57++) {
				if (local47.anIntArray324[local57] <= arg2 && local47.anIntArray324[local57] != 0) {
					local55 = local47.anIntArray323[local57];
				}
			}
			if (local55 != -1) {
				local47 = Static102.method1549(local55);
			}
		}
		@Pc(95) Class8_Sub5_Sub1 local95 = local47.method2930();
		if (local95 == null) {
			return null;
		}
		@Pc(101) Class1_Sub3_Sub1_Sub1 local101 = null;
		if (local47.anInt3870 != -1) {
			local101 = method864(0, local47.anInt3873, 10, false, true, arg5, 1);
			if (local101 == null) {
				return null;
			}
		} else if (local47.anInt3884 != -1) {
			local101 = method864(arg0, local47.anInt3888, arg2, true, false, arg5, arg6);
			if (local101 == null) {
				return null;
			}
		}
		@Pc(143) int[] local143 = Static46.anIntArray334;
		@Pc(150) int local150 = Static46.anInt4199;
		@Pc(152) int local152 = Static46.anInt4198;
		@Pc(155) int[] local155 = new int[4];
		Static46.method3166(local155);
		local39 = new Class1_Sub3_Sub1_Sub1(36, 32);
		Static46.method3164(local39.anIntArray44, 36, 32);
		Static46.method3156();
		Static174.method2841();
		Static174.method2849(16, 16);
		Static174.aBoolean211 = false;
		if (local47.anInt3884 != -1) {
			local101.method358(0, 0);
		}
		@Pc(186) int local186 = local47.anInt3879;
		if (arg4) {
			local186 = (int) ((double) local186 * 1.5D);
		} else if (arg6 == 2) {
			local186 = (int) ((double) local186 * 1.04D);
		}
		@Pc(216) int local216 = local186 * Class1_Sub3_Sub1_Sub4.anIntArray320[local47.anInt3877] >> 16;
		@Pc(225) int local225 = Class1_Sub3_Sub1_Sub4.anIntArray317[local47.anInt3877] * local186 >> 16;
		local95.method2036(local47.anInt3890, local47.anInt3881, local47.anInt3877, local47.anInt3860, local216 + local47.anInt3899 - local95.method2668() / 2, local47.anInt3899 + local225);
		if (local47.anInt3884 == -1) {
			if (arg6 >= 1) {
				local39.method351(1);
			}
			if (arg6 >= 2) {
				local39.method351(16777215);
			}
			if (arg0 != 0) {
				local39.method359(arg0);
			}
		}
		Static46.method3164(local39.anIntArray44, 36, 32);
		if (local47.anInt3870 != -1) {
			local101.method358(0, 0);
		}
		if (!arg4 && (local47.anInt3863 == 1 || arg2 != 1) && arg2 != -1 && arg5) {
			Static22.aClass1_Sub3_Sub1_Sub3_Sub1_1.method2443(Static102.method1548(arg2), 0, 9, 16776960, 1);
		}
		if (!arg4 && !arg3) {
			Static106.aClass47_17.method1273(local29, local39);
		}
		Static46.method3164(local143, local150, local152);
		Static46.method3157(local155);
		Static174.method2841();
		Static174.aBoolean211 = true;
		return local39;
	}
}
