import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!ma", name = "x", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!ma", name = "y", descriptor = "Lclient!wa;")
	public static Class23 aClass23_43;

	@OriginalMember(owner = "client!ma", name = "t", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_902 = Static161.method2452("level)2");

	@OriginalMember(owner = "client!ma", name = "q", descriptor = "Lclient!dc;")
	public static Class20 aClass20_900 = aClass20_902;

	@OriginalMember(owner = "client!ma", name = "B", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_904 = Static161.method2452("::noclip");

	@OriginalMember(owner = "client!ma", name = "F", descriptor = "Lclient!dc;")
	public static Class20 aClass20_905 = null;

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V")
	public static void method1859() {
		@Pc(13) byte[][] local13 = Static104.aByteArrayArray7;
		for (@Pc(15) int local15 = 0; local15 < 4; local15++) {
			Static95.method1546();
			for (@Pc(21) int local21 = 0; local21 < 13; local21++) {
				for (@Pc(25) int local25 = 0; local25 < 13; local25++) {
					@Pc(29) boolean local29 = false;
					@Pc(37) int local37 = Static188.anIntArrayArrayArray11[local15][local21][local25];
					if (local37 != -1) {
						@Pc(47) int local47 = local37 >> 24 & 0x3;
						@Pc(60) int local60 = local37 >> 1 & 0x3;
						@Pc(66) int local66 = local37 >> 14 & 0x3FF;
						@Pc(72) int local72 = local37 >> 3 & 0x7FF;
						@Pc(82) int local82 = (local66 / 8 << 8) + local72 / 8;
						for (@Pc(84) int local84 = 0; local84 < Static125.anIntArray290.length; local84++) {
							if (local82 == Static125.anIntArray290[local84] && local13[local84] != null) {
								Static74.method1214((local66 & 0x7) * 8, local15, local60, local13[local84], Static9.aClass76Array1, local21 * 8, local25 * 8, local47, (local72 & 0x7) * 8);
								local29 = true;
								break;
							}
						}
					}
					if (!local29) {
						Static72.method1179(8, local15, 8, local21 * 8, local25 * 8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)V")
	public static void method1860() {
		Static217.aClass100_1.anInt3791 = 0;
		Static7.aBoolean7 = true;
		Static197.aBoolean175 = true;
		Static133.anInt2775 = 0;
		Static17.aLong31 = 0L;
		Static123.method1943();
		Static118.anInt3277 = 0;
		Static87.anInt2704 = -1;
		Static196.anInt3834 = -1;
		Static50.anInt1080 = -1;
		Static43.aClass5_Sub6_Sub1_2.anInt4050 = 0;
		Static50.anInt1085 = -1;
		Static170.anInt3428 = 0;
		Static10.aClass5_Sub6_Sub1_1.anInt4050 = 0;
		Static67.anInt3979 = 0;
		for (@Pc(2676) int local2676 = 0; local2676 < Static218.aClass14Array1.length; local2676++) {
			Static218.aClass14Array1[local2676] = null;
		}
		Static104.aBoolean95 = false;
		Static85.anInt1879 = 0;
		Static15.method267(0);
		for (@Pc(2702) int local2702 = 0; local2702 < 100; local2702++) {
			Static143.aClass20Array24[local2702] = null;
		}
		Static198.anInt3860 = 0;
		Static107.anInt2194 = 0;
		Static79.anInt1777 = (int) (Math.random() * 120.0D) - 60;
		Static211.anInt4102 = 0;
		Static169.anInt3386 = 0;
		Static109.anInt2292 = (int) (Math.random() * 30.0D) - 20;
		Static211.anInt4099 = (int) (Math.random() * 110.0D) - 55;
		Static6.anInt153 = (int) (Math.random() * 80.0D) - 40;
		Static28.aBoolean32 = false;
		Static183.anInt3681 = (int) (Math.random() * 100.0D) - 50;
		Static66.anInt1444 = 0;
		Static83.anInt1850 = 0;
		Static57.anInt1307 = 0;
		Static166.anInt3320 = 0;
		Static118.anInt3279 = -1;
		Static72.anInt1568 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		for (@Pc(2780) int local2780 = 0; local2780 < 2048; local2780++) {
			Static6.aClass1_Sub2_Sub2Array1[local2780] = null;
			Static57.aClass5_Sub6Array1[local2780] = null;
		}
		for (@Pc(2798) int local2798 = 0; local2798 < 32768; local2798++) {
			Static61.aClass1_Sub2_Sub1Array1[local2798] = null;
		}
		Static210.aClass1_Sub2_Sub2_2 = Static6.aClass1_Sub2_Sub2Array1[2047] = new Class1_Sub2_Sub2();
		Static75.aClass91_9.method2682();
		Static166.aClass91_15.method2682();
		@Pc(2828) int local2828;
		@Pc(2832) int local2832;
		for (@Pc(2824) int local2824 = 0; local2824 < 4; local2824++) {
			for (local2828 = 0; local2828 < 104; local2828++) {
				for (local2832 = 0; local2832 < 104; local2832++) {
					Static159.aClass91ArrayArrayArray1[local2824][local2828][local2832] = null;
				}
			}
		}
		Static18.aClass91_3 = new Class91();
		Static91.anInt1957 = 0;
		Static69.anInt1507 = 0;
		for (local2828 = 0; local2828 < Static98.anInt2094; local2828++) {
			@Pc(2872) Class5_Sub2_Sub6 local2872 = Static72.method1177(local2828);
			if (local2872 != null && local2872.anInt490 == 0) {
				Static134.anIntArray304[local2828] = 0;
				Static139.anIntArray309[local2828] = 0;
			}
		}
		for (local2832 = 0; local2832 < Static196.anIntArray405.length; local2832++) {
			Static196.anIntArray405[local2832] = -1;
		}
		if (Static130.anInt2715 != -1) {
			Static93.method2412(Static130.anInt2715);
		}
		for (@Pc(2917) Class5_Sub25 local2917 = (Class5_Sub25) Static75.aClass75_7.method2067(); local2917 != null; local2917 = (Class5_Sub25) Static75.aClass75_7.method2066()) {
			Static114.method500(true, local2917);
		}
		Static130.anInt2715 = -1;
		Static75.aClass75_7 = new Class75(8);
		Static104.aBoolean95 = false;
		Static133.aClass69_12 = null;
		Static85.anInt1879 = 0;
		Static159.aClass56_2.method1697(false, new int[5], -1, null);
		for (@Pc(2953) int local2953 = 0; local2953 < 8; local2953++) {
			Static146.aClass20Array25[local2953] = null;
			Static67.aBooleanArray47[local2953] = false;
		}
		Static185.method2811();
		Static171.aBoolean154 = true;
		for (@Pc(2973) int local2973 = 0; local2973 < 100; local2973++) {
			Static185.aBooleanArray43[local2973] = true;
		}
		Static129.aClass5_Sub19Array1 = null;
		Static118.anInt3271 = 0;
		Static38.aClass20_281 = null;
		for (@Pc(2991) int local2991 = 0; local2991 < 6; local2991++) {
			Static175.aClass92Array1[local2991] = new Class92();
		}
		for (@Pc(3005) int local3005 = 0; local3005 < 25; local3005++) {
			Static41.anIntArray89[local3005] = 0;
			Static218.anIntArray431[local3005] = 0;
			Static101.anIntArray213[local3005] = 0;
		}
		Static38.aClass20_287 = Static188.aClass20_1374;
		Static145.aShortArray39 = Static183.aShortArray57 = Static166.aShortArray46 = Static37.aShortArray21 = new short[256];
		Static216.aBoolean188 = true;
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1861(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg2 < 0 || arg1 >= 103 || arg2 >= 103) {
			return;
		}
		@Pc(34) int local34;
		if (arg0 == 0) {
			@Pc(24) Class86 local24 = Static160.method2439(arg5, arg1, arg2);
			if (local24 != null) {
				local34 = (int) (local24.aLong190 >>> 32) & Integer.MAX_VALUE;
				if (arg4 == 2) {
					local24.aClass1_9 = new Class1_Sub4(local34, 2, arg6 + 4, arg5, arg1, arg2, arg3, false, local24.aClass1_9);
					local24.aClass1_10 = new Class1_Sub4(local34, 2, arg6 + 1 & 0x3, arg5, arg1, arg2, arg3, false, local24.aClass1_10);
				} else {
					local24.aClass1_9 = new Class1_Sub4(local34, arg4, arg6, arg5, arg1, arg2, arg3, false, local24.aClass1_9);
				}
			}
		}
		if (arg0 == 1) {
			@Pc(98) Class29 local98 = Static178.method2701(arg5, arg1, arg2);
			if (local98 != null) {
				local34 = Integer.MAX_VALUE & (int) (local98.aLong61 >>> 32);
				if (arg4 == 4 || arg4 == 5) {
					local98.aClass1_2 = new Class1_Sub4(local34, 4, arg6, arg5, arg1, arg2, arg3, false, local98.aClass1_2);
				} else if (arg4 == 6) {
					local98.aClass1_2 = new Class1_Sub4(local34, 4, arg6 + 4, arg5, arg1, arg2, arg3, false, local98.aClass1_2);
				} else if (arg4 == 7) {
					local98.aClass1_2 = new Class1_Sub4(local34, 4, (arg6 + 2 & 0x3) + 4, arg5, arg1, arg2, arg3, false, local98.aClass1_2);
				} else if (arg4 == 8) {
					local98.aClass1_2 = new Class1_Sub4(local34, 4, arg6 + 4, arg5, arg1, arg2, arg3, false, local98.aClass1_2);
					local98.aClass1_3 = new Class1_Sub4(local34, 4, (arg6 + 2 & 0x3) + 4, arg5, arg1, arg2, arg3, false, local98.aClass1_3);
				}
			}
		}
		if (arg0 == 2) {
			@Pc(236) Class43 local236 = Static103.method1708(arg5, arg1, arg2);
			if (arg4 == 11) {
				arg4 = 10;
			}
			if (local236 != null) {
				local236.aClass1_4 = new Class1_Sub4((int) (local236.aLong102 >>> 32) & Integer.MAX_VALUE, arg4, arg6, arg5, arg1, arg2, arg3, false, local236.aClass1_4);
			}
		}
		if (arg0 == 3) {
			@Pc(274) Class73 local274 = Static127.method1970(arg5, arg1, arg2);
			if (local274 != null) {
				local274.aClass1_8 = new Class1_Sub4(Integer.MAX_VALUE & (int) (local274.aLong154 >>> 32), 22, arg6, arg5, arg1, arg2, arg3, false, local274.aClass1_8);
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZILclient!cg;II)V")
	public static void method1863(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub2_Sub7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(17) Class5_Sub9 local17 = new Class5_Sub9();
		local17.anInt1008 = arg2.anInt540 * 128;
		@Pc(26) int local26 = arg2.anInt517;
		local17.anIntArray93 = arg2.anIntArray38;
		local17.anInt1009 = arg2.anInt520;
		local17.anInt1005 = arg2.anInt510;
		local17.anInt1019 = arg3;
		local17.anInt1011 = arg1 * 128;
		local17.anInt1012 = arg2.anInt535;
		@Pc(53) int local53 = arg2.anInt519;
		local17.anInt1014 = arg0 * 128;
		if (arg4 == 1 || arg4 == 3) {
			local26 = arg2.anInt519;
			local53 = arg2.anInt517;
		}
		local17.anInt1020 = (arg0 + local26) * 128;
		local17.anInt1006 = (local53 + arg1) * 128;
		if (arg2.anIntArray35 != null) {
			local17.aClass5_Sub2_Sub7_1 = arg2;
			local17.method836();
		}
		Static210.aClass91_7.method2686(local17);
		if (local17.anIntArray93 != null) {
			local17.anInt1013 = (int) (Math.random() * (double) (local17.anInt1012 - local17.anInt1009)) + local17.anInt1009;
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(BIIIIII)V")
	public static void method1864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static9.method195(arg5);
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg5;
		@Pc(23) int local23 = -arg5;
		@Pc(25) int local25 = -1;
		@Pc(30) int local30 = arg5 - arg2;
		@Pc(32) int local32 = -1;
		if (local30 < 0) {
			local30 = 0;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(85) int local85;
		if (Static173.anInt3464 <= arg1 && Static174.anInt3493 >= arg1) {
			@Pc(50) int[] local50 = Static9.anIntArrayArray1[arg1];
			local59 = Static171.method2627(Static27.anInt493, arg3 - arg5, Static72.anInt1572);
			local67 = Static171.method2627(Static27.anInt493, arg3 + arg5, Static72.anInt1572);
			local76 = Static171.method2627(Static27.anInt493, arg3 - local30, Static72.anInt1572);
			local85 = Static171.method2627(Static27.anInt493, arg3 + local30, Static72.anInt1572);
			Static27.method409(local76, arg0, local50, local59);
			Static27.method409(local85, arg4, local50, local76);
			Static27.method409(local67, arg0, local50, local85);
		}
		@Pc(106) int local106 = -local30;
		@Pc(108) int local108 = local30;
		while (local20 > local18) {
			local25 += 2;
			local32 += 2;
			local23 += local25;
			local106 += local32;
			if (local106 >= 0 && local108 >= 1) {
				local108--;
				local106 -= local108 << 1;
				Static83.anIntArray179[local108] = local18;
			}
			local18++;
			@Pc(201) int local201;
			@Pc(210) int local210;
			@Pc(221) int[] local221;
			@Pc(156) int local156;
			if (local23 >= 0) {
				local20--;
				local23 -= local20 << 1;
				local156 = arg1 - local20;
				local59 = arg1 + local20;
				if (Static173.anInt3464 <= local59 && local156 <= Static174.anInt3493) {
					if (local20 < local30) {
						local67 = Static83.anIntArray179[local20];
						local76 = Static171.method2627(Static27.anInt493, local18 + arg3, Static72.anInt1572);
						local85 = Static171.method2627(Static27.anInt493, arg3 - local18, Static72.anInt1572);
						local201 = Static171.method2627(Static27.anInt493, local67 + arg3, Static72.anInt1572);
						local210 = Static171.method2627(Static27.anInt493, arg3 - local67, Static72.anInt1572);
						if (local59 <= Static174.anInt3493) {
							local221 = Static9.anIntArrayArray1[local59];
							Static27.method409(local210, arg0, local221, local85);
							Static27.method409(local201, arg4, local221, local210);
							Static27.method409(local76, arg0, local221, local201);
						}
						if (local156 >= Static173.anInt3464) {
							local221 = Static9.anIntArrayArray1[local156];
							Static27.method409(local210, arg0, local221, local85);
							Static27.method409(local201, arg4, local221, local210);
							Static27.method409(local76, arg0, local221, local201);
						}
					} else {
						local67 = Static171.method2627(Static27.anInt493, local18 + arg3, Static72.anInt1572);
						local76 = Static171.method2627(Static27.anInt493, arg3 - local18, Static72.anInt1572);
						if (Static174.anInt3493 >= local59) {
							Static27.method409(local67, arg0, Static9.anIntArrayArray1[local59], local76);
						}
						if (Static173.anInt3464 <= local156) {
							Static27.method409(local67, arg0, Static9.anIntArrayArray1[local156], local76);
						}
					}
				}
			}
			local59 = local18 + arg1;
			local156 = arg1 - local18;
			if (local59 >= Static173.anInt3464 && Static174.anInt3493 >= local156) {
				local67 = local20 + arg3;
				local76 = arg3 - local20;
				if (local67 >= Static27.anInt493 && local76 <= Static72.anInt1572) {
					local67 = Static171.method2627(Static27.anInt493, local67, Static72.anInt1572);
					local76 = Static171.method2627(Static27.anInt493, local76, Static72.anInt1572);
					if (local30 <= local18) {
						if (Static174.anInt3493 >= local59) {
							Static27.method409(local67, arg0, Static9.anIntArrayArray1[local59], local76);
						}
						if (local156 >= Static173.anInt3464) {
							Static27.method409(local67, arg0, Static9.anIntArrayArray1[local156], local76);
						}
					} else {
						local85 = local108 >= local18 ? local108 : Static83.anIntArray179[local18];
						local201 = Static171.method2627(Static27.anInt493, local85 + arg3, Static72.anInt1572);
						local210 = Static171.method2627(Static27.anInt493, arg3 - local85, Static72.anInt1572);
						if (local59 <= Static174.anInt3493) {
							local221 = Static9.anIntArrayArray1[local59];
							Static27.method409(local210, arg0, local221, local76);
							Static27.method409(local201, arg4, local221, local210);
							Static27.method409(local67, arg0, local221, local201);
						}
						if (local156 >= Static173.anInt3464) {
							local221 = Static9.anIntArrayArray1[local156];
							Static27.method409(local210, arg0, local221, local76);
							Static27.method409(local201, arg4, local221, local210);
							Static27.method409(local67, arg0, local221, local201);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "a", descriptor = "(IJ)V")
	public static void method1865(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(14) int local14 = 0; local14 < Static50.anInt1082; local14++) {
			if (Static168.aLongArray39[local14] == arg0) {
				Static50.anInt1082--;
				for (@Pc(36) int local36 = local14; local36 < Static50.anInt1082; local36++) {
					Static168.aLongArray39[local36] = Static168.aLongArray39[local36 + 1];
					Static114.aClass20Array4[local36] = Static114.aClass20Array4[local36 + 1];
				}
				Static148.anInt3054 = Static98.anInt2085;
				Static43.aClass5_Sub6_Sub1_2.method3087(13);
				Static43.aClass5_Sub6_Sub1_2.method3037(arg0);
				break;
			}
		}
	}

	@OriginalMember(owner = "client!ma", name = "e", descriptor = "(I)V")
	public static void method1866() {
		Static14.aClass84_4.method2335();
	}
}
