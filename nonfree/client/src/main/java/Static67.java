import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!g", name = "k", descriptor = "[Lclient!qg;")
	public static Class79_Sub1[] aClass79_Sub1Array3;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!oe;")
	public static Class72 aClass72_60;

	@OriginalMember(owner = "client!g", name = "j", descriptor = "Lclient!l;")
	public static Class2_Sub23_Sub1 aClass2_Sub23_Sub1_2 = new Class2_Sub23_Sub1(5000);

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!qe;")
	public static Class78 aClass78_177 = Static199.method3560("lila:");

	@OriginalMember(owner = "client!g", name = "m", descriptor = "J")
	public static long aLong35 = 0L;

	@OriginalMember(owner = "client!g", name = "p", descriptor = "I")
	public static int anInt929 = 0;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Lclient!nh;")
	public static Class2_Sub23 aClass2_Sub23_3 = new Class2_Sub23(new byte[5000]);

	@OriginalMember(owner = "client!g", name = "t", descriptor = "I")
	public static int anInt931 = 0;

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(Lclient!gg;B)V")
	public static void method664(@OriginalArg(0) Class5_Sub2_Sub1 arg0) {
		for (@Pc(14) Class2_Sub14 local14 = (Class2_Sub14) Static49.aClass44_11.method1359(); local14 != null; local14 = (Class2_Sub14) Static49.aClass44_11.method1356()) {
			if (local14.aClass5_Sub2_Sub1_1 == arg0) {
				if (local14.aClass2_Sub21_Sub4_2 != null) {
					Static23.aClass2_Sub21_Sub3_1.method3390(local14.aClass2_Sub21_Sub4_2);
					local14.aClass2_Sub21_Sub4_2 = null;
				}
				local14.method3986();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(JI)V")
	public static void method666(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static72.anInt4686 >= 100) {
			Static95.method1663(Static73.aClass78_352, Static189.aClass78_750, 0);
			return;
		}
		@Pc(32) Class78 local32 = Static103.method1785(arg0).method3048();
		for (@Pc(34) int local34 = 0; local34 < Static72.anInt4686; local34++) {
			if (Static100.aLongArray6[local34] == arg0) {
				Static95.method1663(Static73.aClass78_352, Static94.method1640(new Class78[] { local32, Static132.aClass78_591 }), 0);
				return;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static140.anInt3196; local68++) {
			if (arg0 == Static200.aLongArray12[local68]) {
				Static95.method1663(Static73.aClass78_352, Static94.method1640(new Class78[] { Static64.aClass78_306, local32, Static21.aClass78_76 }), 0);
				return;
			}
		}
		if (local32.method3043(Static31.aClass5_Sub2_Sub2_1.aClass78_423)) {
			Static95.method1663(Static73.aClass78_352, Static159.aClass78_721, 0);
			return;
		}
		Static100.aLongArray6[Static72.anInt4686] = arg0;
		Static15.aClass78Array1[Static72.anInt4686++] = Static103.method1785(arg0);
		Static140.anInt3198 = Static133.anInt3087;
		Static161.aClass2_Sub23_Sub1_5.method2155(253);
		Static161.aClass2_Sub23_Sub1_5.method2103(arg0);
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IILclient!mj;II)V")
	public static void method667(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(4) int arg3) {
		Static41.method565();
		Static217.method3759(arg1, arg0, arg2.anInt3021 + arg1, arg0 + arg2.anInt3040);
		if (Static152.anInt3520 == 2 || Static152.anInt3520 == 5 || Static107.aClass2_Sub3_Sub8_5 == null) {
			Static217.method3769(arg1, arg0, arg2.anIntArray491, arg2.anIntArray494);
		} else {
			@Pc(33) int local33 = Static140.anInt3197 + Static90.anInt2013 & 0x7FF;
			@Pc(41) int local41 = 464 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
			@Pc(48) int local48 = Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32 + 48;
			((Class2_Sub3_Sub8_Sub1) Static107.aClass2_Sub3_Sub8_5).method2275(arg1, arg0, arg2.anInt3021, arg2.anInt3040, local48, local41, local33, Static62.anInt1225 + 256, arg2.anIntArray491, arg2.anIntArray494);
			@Pc(98) int local98;
			@Pc(85) int local85;
			for (@Pc(69) int local69 = 0; local69 < anInt929; local69++) {
				local85 = Static162.anIntArray625[local69] * 4 + 2 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
				local98 = Static223.anIntArray783[local69] * 4 + 2 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
				@Pc(106) Class2_Sub3_Sub17 local106 = Static121.method3984(Static114.anIntArray435[local69]);
				if (local106.anIntArray413 != null) {
					local106 = local106.method1867();
					if (local106 == null || local106.anInt2391 == -1) {
						continue;
					}
				}
				Static199.method3561(arg0, arg2, local98, local85, arg1, Static36.aClass2_Sub3_Sub8Array2[local106.anInt2391]);
			}
			@Pc(170) int local170;
			for (local98 = 0; local98 < 104; local98++) {
				for (local85 = 0; local85 < 104; local85++) {
					@Pc(156) Class44 local156 = Static1.aClass44ArrayArrayArray1[Static137.anInt3136][local98][local85];
					if (local156 != null) {
						local170 = local85 * 4 + 2 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
						@Pc(182) int local182 = local98 * 4 + 2 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
						Static199.method3561(arg0, arg2, local182, local170, arg1, Static176.aClass2_Sub3_Sub8Array11[0]);
					}
				}
			}
			@Pc(263) int local263;
			for (local85 = 0; local85 < Static50.anInt908; local85++) {
				@Pc(214) Class5_Sub2_Sub1 local214 = Static95.aClass5_Sub2_Sub1Array1[Static79.anIntArray286[local85]];
				if (local214 != null && local214.method1479()) {
					@Pc(225) Class2_Sub3_Sub9 local225 = local214.aClass2_Sub3_Sub9_1;
					if (local225 != null && local225.anIntArray230 != null) {
						local225 = local225.method1059();
					}
					if (local225 != null && local225.aBoolean45 && local225.aBoolean44) {
						local170 = local214.anInt1849 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
						local263 = local214.anInt1827 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
						Static199.method3561(arg0, arg2, local170, local263, arg1, Static176.aClass2_Sub3_Sub8Array11[1]);
					}
				}
			}
			for (@Pc(283) int local283 = 0; local283 < Static180.anInt4193; local283++) {
				@Pc(291) Class5_Sub2_Sub2 local291 = Static213.aClass5_Sub2_Sub2Array3[Static16.anIntArray792[local283]];
				if (local291 != null && local291.method1479()) {
					local263 = local291.anInt1827 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
					local170 = local291.anInt1849 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
					@Pc(321) boolean local321 = false;
					@Pc(328) long local328 = local291.aClass78_423.method3016();
					for (@Pc(330) int local330 = 0; local330 < Static140.anInt3196; local330++) {
						if (local328 == Static200.aLongArray12[local330] && Static87.anIntArray347[local330] != 0) {
							local321 = true;
							break;
						}
					}
					@Pc(359) boolean local359 = false;
					if (Static31.aClass5_Sub2_Sub2_1.anInt1884 != 0 && local291.anInt1884 != 0 && local291.anInt1884 == Static31.aClass5_Sub2_Sub2_1.anInt1884) {
						local359 = true;
					}
					if (local321) {
						Static199.method3561(arg0, arg2, local170, local263, arg1, Static176.aClass2_Sub3_Sub8Array11[3]);
					} else if (local359) {
						Static199.method3561(arg0, arg2, local170, local263, arg1, Static176.aClass2_Sub3_Sub8Array11[4]);
					} else {
						Static199.method3561(arg0, arg2, local170, local263, arg1, Static176.aClass2_Sub3_Sub8Array11[2]);
					}
				}
			}
			@Pc(426) Class19[] local426 = Static216.aClass19Array1;
			@Pc(530) int local530;
			for (local170 = 0; local170 < local426.length; local170++) {
				@Pc(434) Class19 local434 = local426[local170];
				if (local434 != null && local434.anInt504 != 0 && Static123.anInt2808 % 20 < 10) {
					@Pc(476) int local476;
					@Pc(487) int local487;
					if (local434.anInt504 == 1 && local434.anInt496 >= 0 && local434.anInt496 < Static95.aClass5_Sub2_Sub1Array1.length) {
						@Pc(463) Class5_Sub2_Sub1 local463 = Static95.aClass5_Sub2_Sub1Array1[local434.anInt496];
						if (local463 != null) {
							local476 = local463.anInt1827 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
							local487 = local463.anInt1849 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
							Static58.method748(arg2, local487, local476, arg0, local434.anInt495, arg1);
						}
					}
					if (local434.anInt504 == 2) {
						local487 = (local434.anInt498 - Static57.anInt628) * 4 + 2 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
						local530 = (local434.anInt500 - Static28.anInt497) * 4 + 2 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
						Static58.method748(arg2, local530, local487, arg0, local434.anInt495, arg1);
					}
					if (local434.anInt504 == 10 && local434.anInt496 >= 0 && Static213.aClass5_Sub2_Sub2Array3.length > local434.anInt496) {
						@Pc(565) Class5_Sub2_Sub2 local565 = Static213.aClass5_Sub2_Sub2Array3[local434.anInt496];
						if (local565 != null) {
							local487 = local565.anInt1849 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
							local476 = local565.anInt1827 / 32 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
							Static58.method748(arg2, local487, local476, arg0, local434.anInt495, arg1);
						}
					}
				}
			}
			if (Static8.anInt268 != 0) {
				local530 = Static66.anInt1316 * 4 + 2 - Static31.aClass5_Sub2_Sub2_1.anInt1827 / 32;
				local263 = Static8.anInt268 * 4 + 2 - Static31.aClass5_Sub2_Sub2_1.anInt1849 / 32;
				Static199.method3561(arg0, arg2, local263, local530, arg1, Static70.aClass2_Sub3_Sub8_6);
			}
			Static217.method3761(arg2.anInt3021 / 2 + arg1 - 1, arg2.anInt3040 / 2 + (arg0 - 1), 3, 3, 16777215);
		}
		Static84.aBooleanArray57[arg3] = true;
	}
}
