import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!p", name = "U", descriptor = "Lclient!a;")
	public static Class1 aClass1_1;

	@OriginalMember(owner = "client!p", name = "hb", descriptor = "I")
	public static int anInt2059;

	@OriginalMember(owner = "client!p", name = "Q", descriptor = "Lclient!v;")
	public static Class62 aClass62_903 = Static45.method753(" @whi@(X");

	@OriginalMember(owner = "client!p", name = "Y", descriptor = "Ljava/lang/Object;")
	public static Object anObject2 = new Object();

	@OriginalMember(owner = "client!p", name = "ab", descriptor = "Lclient!v;")
	public static Class62 aClass62_904 = Static45.method753("(Udns");

	@OriginalMember(owner = "client!p", name = "db", descriptor = "[Lclient!vb;")
	public static Class3_Sub1_Sub1_Sub4[] aClass3_Sub1_Sub1_Sub4Array42 = new Class3_Sub1_Sub1_Sub4[1000];

	@OriginalMember(owner = "client!p", name = "lb", descriptor = "Lclient!v;")
	public static Class62 aClass62_905 = Static45.method753("Benutzername: ");

	@OriginalMember(owner = "client!p", name = "mb", descriptor = "Z")
	public static final boolean aBoolean119 = false;

	@OriginalMember(owner = "client!p", name = "nb", descriptor = "Z")
	public static boolean aBoolean120 = false;

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(IJ)V")
	public static void method1242(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static24.anInt762; local22++) {
			if (arg0 == Static49.aLongArray15[local22]) {
				Static24.anInt762--;
				Static52.aBoolean64 = true;
				for (@Pc(42) int local42 = local22; local42 < Static24.anInt762; local42++) {
					Static64.aClass62Array10[local42] = Static64.aClass62Array10[local42 + 1];
					Static58.anIntArray167[local42] = Static58.anIntArray167[local42 + 1];
					Static49.aLongArray15[local42] = Static49.aLongArray15[local42 + 1];
				}
				Static63.aClass3_Sub8_Sub1_6.method1824(123);
				Static63.aClass3_Sub8_Sub1_6.method1763(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1243(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(Static104.aClass18_1);
		arg0.removeMouseMotionListener(Static104.aClass18_1);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!v;ILclient!v;Lclient!mb;)[Lclient!vb;")
	private static Class3_Sub1_Sub1_Sub4[] method1244(@OriginalArg(0) Class62 arg0, @OriginalArg(2) Class62 arg1, @OriginalArg(3) Class42 arg2) {
		@Pc(8) int local8 = arg2.method1521(arg0);
		@Pc(16) int local16 = arg2.method1498(arg1, local8);
		return Static63.method1518(local8, local16, arg2);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!fe;IIIIIIII)V")
	public static void method1246(@OriginalArg(0) Class3_Sub1_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static4.aBoolean9) {
			Static68.anInt1896 = 32;
		} else {
			Static68.anInt1896 = 0;
		}
		Static4.aBoolean9 = false;
		if (arg1 >= arg2 && arg2 + 16 > arg1 && arg4 >= arg5 && arg4 < arg5 + 16) {
			arg0.anInt882 -= Static80.anInt2161 * 4;
			if (arg3 == 1) {
				Static52.aBoolean64 = true;
			}
			if (arg3 == 2 || arg3 == 3) {
				Static86.aBoolean137 = true;
			}
		} else if (arg1 >= arg2 && arg2 + 16 > arg1 && arg5 + arg7 - 16 <= arg4 && arg4 < arg5 + arg7) {
			arg0.anInt882 += Static80.anInt2161 * 4;
			if (arg3 == 1) {
				Static52.aBoolean64 = true;
			}
			if (arg3 == 2 || arg3 == 3) {
				Static86.aBoolean137 = true;
			}
		} else if (arg2 - Static68.anInt1896 <= arg1 && Static68.anInt1896 + arg2 + 16 > arg1 && arg4 >= arg5 + 16 && arg7 + arg5 - 16 > arg4 && Static80.anInt2161 > 0) {
			if (arg3 == 1) {
				Static52.aBoolean64 = true;
			}
			Static4.aBoolean9 = true;
			if (arg3 == 2 || arg3 == 3) {
				Static86.aBoolean137 = true;
			}
			@Pc(183) int local183 = arg7 * (arg7 - 32) / arg6;
			if (local183 < 8) {
				local183 = 8;
			}
			@Pc(196) int local196 = arg7 - local183 - 32;
			@Pc(208) int local208 = arg4 - arg5 - local183 / 2 - 16;
			arg0.anInt882 = (arg6 - arg7) * local208 / local196;
		}
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	public static void method1247() {
		Static51.method1436(0, false, null);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!a;IIII[Lclient!cc;BII[B)V")
	public static void method1248(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class11[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(6) Class3_Sub8 local6 = new Class3_Sub8(arg9);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local6.method1769();
			if (local21 == 0) {
				return;
			}
			@Pc(28) int local28 = 0;
			local17 += local21;
			while (true) {
				@Pc(36) int local36 = local6.method1769();
				if (local36 == 0) {
					break;
				}
				local28 += local36 - 1;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 & 0x3F;
				@Pc(58) int local58 = local6.method1803();
				@Pc(62) int local62 = local58 & 0x3;
				@Pc(66) int local66 = local28 >> 12;
				@Pc(70) int local70 = local58 >> 2;
				if (local66 == arg5 && local50 >= arg2 && local50 < arg2 + 8 && local54 >= arg4 && arg4 + 8 > local54) {
					@Pc(109) Class3_Sub1_Sub9 local109 = Static10.method1322(local17);
					@Pc(126) int local126 = Static90.method1536(arg0, local54 & 0x7, local62, local109.anInt1068, local109.anInt1061, local50 & 0x7) + arg8;
					@Pc(143) int local143 = Static28.method575(local109.anInt1068, local109.anInt1061, local50 & 0x7, local62, local54 & 0x7, arg0) + arg3;
					if (local126 > 0 && local143 > 0 && local126 < 103 && local143 < 103) {
						@Pc(165) int local165 = arg7;
						if ((Static44.aByteArrayArrayArray6[1][local126][local143] & 0x2) == 2) {
							local165 = arg7 - 1;
						}
						@Pc(181) Class11 local181 = null;
						if (local165 >= 0) {
							local181 = arg6[local165];
						}
						Static29.method580(local62 + arg0 & 0x3, local143, arg7, local181, local17, local126, arg1, local70);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)V")
	public static void method1249() {
		aClass62_905 = null;
		aClass1_1 = null;
		anObject2 = null;
		aClass62_904 = null;
		aClass62_903 = null;
		aClass3_Sub1_Sub1_Sub4Array42 = null;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(B[Lclient!v;)[Lclient!v;")
	public static Class62[] method1250(@OriginalArg(1) Class62[] arg0) {
		@Pc(8) Class62[] local8 = new Class62[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = Static49.method782(new Class62[] { Static99.method1662(local10), Static100.aClass62_1114 });
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = Static49.method782(new Class62[] { local8[local10], arg0[local10] });
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V")
	public static void method1251() {
		@Pc(17) int local17;
		if (Static17.anInt2850 == 0) {
			aClass1_1 = new Class1(4, 104, 104, Static79.anIntArrayArrayArray4);
			for (local17 = 0; local17 < 4; local17++) {
				Static32.aClass11Array1[local17] = new Class11(104, 104);
			}
			Static99.aClass3_Sub1_Sub1_Sub4_5 = new Class3_Sub1_Sub1_Sub4(512, 512);
			Static17.anInt2850 = 20;
			Static74.aClass62_876 = Static62.aClass62_748;
			Static94.anInt2490 = 5;
			return;
		}
		@Pc(56) int local56;
		@Pc(66) int local66;
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (Static17.anInt2850 == 20) {
			@Pc(54) int[] local54 = new int[9];
			for (local56 = 0; local56 < 9; local56++) {
				local66 = local56 * 32 + 15 + 128;
				local72 = local66 * 3 + 600;
				local76 = Class3_Sub1_Sub1_Sub2.anIntArray186[local66];
				local54[local56] = local72 * local76 >> 16;
			}
			Static1.method43(local54);
			Static17.anInt2850 = 30;
			Static94.anInt2490 = 10;
			Static74.aClass62_876 = Static27.aClass62_350;
		} else if (Static17.anInt2850 == 30) {
			Static17.aClass42_Sub1_63 = Static55.method913(true, false, 0, true);
			Static91.aClass42_Sub1_54 = Static55.method913(true, false, 1, true);
			Static44.aClass42_Sub1_26 = Static55.method913(false, true, 2, true);
			Static53.aClass42_Sub1_30 = Static55.method913(true, false, 3, true);
			Static19.aClass42_Sub1_62 = Static55.method913(true, false, 4, true);
			Static49.aClass42_Sub1_28 = Static55.method913(true, true, 5, true);
			Static79.aClass42_Sub1_46 = Static55.method913(true, true, 6, false);
			Static22.aClass42_Sub1_17 = Static55.method913(true, false, 7, true);
			Static12.aClass42_Sub1_10 = Static55.method913(true, false, 8, true);
			Static14.aClass42_Sub1_11 = Static55.method913(true, false, 9, true);
			Static59.aClass42_Sub1_35 = Static55.method913(true, false, 10, true);
			Static27.aClass42_Sub1_18 = Static55.method913(true, false, 11, true);
			Static74.aClass62_876 = Static62.aClass62_746;
			Static17.anInt2850 = 40;
			Static94.anInt2490 = 20;
		} else if (Static17.anInt2850 == 40) {
			local17 = Static17.aClass42_Sub1_63.method1523() * 5 / 100;
			local17 += Static91.aClass42_Sub1_54.method1523() * 5 / 100;
			local17 += Static44.aClass42_Sub1_26.method1523() * 5 / 100;
			local17 += Static53.aClass42_Sub1_30.method1523() * 5 / 100;
			local17 += Static19.aClass42_Sub1_62.method1523() * 5 / 100;
			local17 += Static49.aClass42_Sub1_28.method1523() * 5 / 100;
			local17 += Static79.aClass42_Sub1_46.method1523() * 5 / 100;
			local17 += Static22.aClass42_Sub1_17.method1523() * 45 / 100;
			local17 += Static12.aClass42_Sub1_10.method1523() * 5 / 100;
			local17 += Static14.aClass42_Sub1_11.method1523() * 5 / 100;
			local17 += Static59.aClass42_Sub1_35.method1523() * 5 / 100;
			local17 += Static27.aClass42_Sub1_18.method1523() * 5 / 100;
			if (local17 == 100) {
				Static74.aClass62_876 = Static74.aClass62_866;
				Static17.anInt2850 = 45;
				Static94.anInt2490 = 30;
			} else {
				if (local17 != 0) {
					Static74.aClass62_876 = Static49.method782(new Class62[] { Static15.aClass62_226, Static99.method1662(local17), Static36.aClass62_475 });
				}
				Static94.anInt2490 = 30;
			}
		} else if (Static17.anInt2850 == 45) {
			Static41.method711(!Static92.aBoolean151, Static2.aClass35_1);
			Static53.aClass3_Sub4_Sub2_1 = Static6.method168(Static2.aClass35_1, Static44.aCanvas1);
			Static104.aClass12_1 = new Class12(22050, Static14.anInt545);
			Static74.aClass62_876 = Static13.aClass62_180;
			Static94.anInt2490 = 35;
			Static17.anInt2850 = 50;
		} else if (Static17.anInt2850 == 50) {
			local17 = 0;
			if (Static71.aClass3_Sub1_Sub1_Sub3_8 == null) {
				Static71.aClass3_Sub1_Sub1_Sub3_8 = Static31.method610(Static30.aClass62_411, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static50.aClass3_Sub1_Sub1_Sub3_12 == null) {
				Static50.aClass3_Sub1_Sub1_Sub3_12 = Static31.method610(Static20.aClass62_288, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static86.aClass3_Sub1_Sub1_Sub3_11 == null) {
				Static86.aClass3_Sub1_Sub1_Sub3_11 = Static31.method610(Static32.aClass62_441, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static25.aClass3_Sub1_Sub1_Sub3_3 == null) {
				Static25.aClass3_Sub1_Sub1_Sub3_3 = Static31.method610(Static13.aClass62_171, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (local17 < 4) {
				Static74.aClass62_876 = Static49.method782(new Class62[] { Static99.aClass62_1211, Static99.method1662(local17 * 100 / 4), Static36.aClass62_475 });
				Static94.anInt2490 = 40;
			} else {
				Static94.anInt2490 = 40;
				Static100.aClass3_Sub1_Sub1_Sub3Array5 = new Class3_Sub1_Sub1_Sub3[] { Static71.aClass3_Sub1_Sub1_Sub3_8, Static50.aClass3_Sub1_Sub1_Sub3_12, Static86.aClass3_Sub1_Sub1_Sub3_11, Static25.aClass3_Sub1_Sub1_Sub3_3 };
				Static17.anInt2850 = 60;
				Static74.aClass62_876 = Static83.aClass62_198;
			}
		} else if (Static17.anInt2850 == 60) {
			local17 = Static14.method367(Static12.aClass42_Sub1_10, Static59.aClass42_Sub1_35);
			local56 = Static18.method466();
			if (local17 < local56) {
				Static74.aClass62_876 = Static49.method782(new Class62[] { Static41.aClass62_532, Static99.method1662(local17 * 100 / local56), Static36.aClass62_475 });
				Static94.anInt2490 = 50;
			} else {
				Static94.anInt2490 = 50;
				Static74.aClass62_876 = Static27.aClass62_349;
				Static65.method1089(5);
				Static17.anInt2850 = 70;
			}
		} else if (Static17.anInt2850 == 70) {
			if (Static44.aClass42_Sub1_26.method1503()) {
				Static36.method665(Static44.aClass42_Sub1_26);
				Static63.method1500(Static44.aClass42_Sub1_26);
				Static33.method655(Static44.aClass42_Sub1_26, Static22.aClass42_Sub1_17);
				Static69.method1159(Static44.aClass42_Sub1_26, Static22.aClass42_Sub1_17, Static92.aBoolean151);
				Static38.method677(Static44.aClass42_Sub1_26, Static22.aClass42_Sub1_17);
				Static98.method1653(Static59.aBoolean87, Static44.aClass42_Sub1_26, Static22.aClass42_Sub1_17);
				Static95.method1617(Static17.aClass42_Sub1_63, Static44.aClass42_Sub1_26, Static91.aClass42_Sub1_54);
				Static95.method1619(Static22.aClass42_Sub1_17, Static44.aClass42_Sub1_26);
				Static106.method1849(Static44.aClass42_Sub1_26);
				Static20.method469(Static44.aClass42_Sub1_26);
				Static19.method1859(Static22.aClass42_Sub1_17, Static53.aClass42_Sub1_30, Static12.aClass42_Sub1_10);
				Static17.anInt2850 = 80;
				Static74.aClass62_876 = Static63.aClass62_1067;
				Static94.anInt2490 = 60;
			} else {
				Static74.aClass62_876 = Static49.method782(new Class62[] { Static30.aClass62_410, Static99.method1662(Static44.aClass42_Sub1_26.method1529()), Static36.aClass62_475 });
				Static94.anInt2490 = 60;
			}
		} else if (Static17.anInt2850 == 80) {
			local17 = 0;
			if (Static56.aClass3_Sub1_Sub1_Sub4_1 == null) {
				Static56.aClass3_Sub1_Sub1_Sub4_1 = Static54.method1800(Static41.aClass62_513, Static12.aClass42_Sub1_10, Static23.aClass62_315);
			} else {
				local17++;
			}
			if (Static104.aClass3_Sub1_Sub1_Sub4_6 == null) {
				Static104.aClass3_Sub1_Sub1_Sub4_6 = Static54.method1800(Static41.aClass62_513, Static12.aClass42_Sub1_10, Static52.aClass62_493);
			} else {
				local17++;
			}
			if (Static99.aClass3_Sub1_Sub1_Sub1Array5 == null) {
				Static99.aClass3_Sub1_Sub1_Sub1Array5 = Static61.method1031(Static19.aClass62_1287, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static61.aClass3_Sub1_Sub1_Sub4Array35 == null) {
				Static61.aClass3_Sub1_Sub1_Sub4Array35 = method1244(Static109.aClass62_1336, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static51.aClass3_Sub1_Sub1_Sub4Array49 == null) {
				Static51.aClass3_Sub1_Sub1_Sub4Array49 = method1244(Static69.aClass62_825, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static19.aClass3_Sub1_Sub1_Sub4Array58 == null) {
				Static19.aClass3_Sub1_Sub1_Sub4Array58 = method1244(Static24.aClass62_320, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static39.aClass3_Sub1_Sub1_Sub4Array25 == null) {
				Static39.aClass3_Sub1_Sub1_Sub4Array25 = method1244(Static63.aClass62_1077, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static49.aClass3_Sub1_Sub1_Sub4Array28 == null) {
				Static49.aClass3_Sub1_Sub1_Sub4Array28 = method1244(Static2.aClass62_17, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static58.aClass3_Sub1_Sub1_Sub4_2 == null) {
				Static58.aClass3_Sub1_Sub1_Sub4_2 = Static54.method1800(Static41.aClass62_513, Static12.aClass42_Sub1_10, Static49.aClass62_582);
			} else {
				local17++;
			}
			if (Static52.aClass3_Sub1_Sub1_Sub4Array24 == null) {
				Static52.aClass3_Sub1_Sub1_Sub4Array24 = method1244(Static79.aClass62_934, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static36.aClass3_Sub1_Sub1_Sub4Array23 == null) {
				Static36.aClass3_Sub1_Sub1_Sub4Array23 = method1244(Static106.aClass62_1282, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static27.aClass3_Sub1_Sub1_Sub4Array16 == null) {
				Static27.aClass3_Sub1_Sub1_Sub4Array16 = method1244(Static71.aClass62_854, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static80.aClass3_Sub1_Sub1_Sub1Array4 == null) {
				Static80.aClass3_Sub1_Sub1_Sub1Array4 = Static61.method1031(Static83.aClass62_199, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (Static69.aClass3_Sub1_Sub1_Sub1Array3 == null) {
				Static69.aClass3_Sub1_Sub1_Sub1Array3 = Static61.method1031(Static9.aClass62_813, Static41.aClass62_513, Static12.aClass42_Sub1_10);
			} else {
				local17++;
			}
			if (local17 < 14) {
				Static74.aClass62_876 = Static49.method782(new Class62[] { Static20.aClass62_292, Static99.method1662(local17 * 100 / 14), Static36.aClass62_475 });
				Static94.anInt2490 = 70;
			} else {
				local56 = (int) (Math.random() * 21.0D) - 10;
				Static104.aClass3_Sub1_Sub1_Sub4_6.method1747();
				local76 = (int) (Math.random() * 41.0D) - 20;
				local72 = (int) (Math.random() * 21.0D) - 10;
				local66 = (int) (Math.random() * 21.0D) - 10;
				for (@Pc(875) int local875 = 0; local875 < Static61.aClass3_Sub1_Sub1_Sub4Array35.length; local875++) {
					Static61.aClass3_Sub1_Sub1_Sub4Array35[local875].method1741(local76 + local56, local66 + local76, local76 + local72);
				}
				Static99.aClass3_Sub1_Sub1_Sub1Array5[0].method140(local76 + local56, local76 + local66, local76 + local72);
				Static17.anInt2850 = 85;
				Static74.aClass62_876 = Static104.aClass62_1254;
				Static94.anInt2490 = 70;
			}
		} else if (Static17.anInt2850 == 85) {
			local17 = Static17.method1874(Static12.aClass42_Sub1_10);
			local56 = Static35.method664();
			if (local56 > local17) {
				Static74.aClass62_876 = Static49.method782(new Class62[] { Static62.aClass62_742, Static99.method1662(local17 * 100 / local56), Static36.aClass62_475 });
				Static94.anInt2490 = 80;
			} else {
				Static74.aClass62_876 = Static6.aClass62_86;
				Static94.anInt2490 = 80;
				Static17.anInt2850 = 90;
			}
		} else if (Static17.anInt2850 == 90) {
			if (Static14.aClass42_Sub1_11.method1503()) {
				@Pc(1013) Class15 local1013 = new Class15(Static14.aClass42_Sub1_11, Static12.aClass42_Sub1_10, 20, 0.8D, Static92.aBoolean151 ? 64 : 128);
				Static66.method1129(local1013);
				Static66.method1126(0.8D);
				Static17.anInt2850 = 110;
				Static74.aClass62_876 = Static9.aClass62_811;
				Static94.anInt2490 = 90;
			} else {
				Static74.aClass62_876 = Static49.method782(new Class62[] { Static34.aClass62_467, Static99.method1662(Static14.aClass42_Sub1_11.method1529()), Static36.aClass62_475 });
				Static94.anInt2490 = 90;
			}
		} else if (Static17.anInt2850 == 110) {
			Static89.aClass37_1 = new Class37();
			Static2.aClass35_1.method770(10, Static89.aClass37_1);
			Static94.anInt2490 = 94;
			Static17.anInt2850 = 120;
			Static74.aClass62_876 = Static22.aClass62_307;
		} else if (Static17.anInt2850 == 120) {
			if (Static59.aClass42_Sub1_35.method1517(Static41.aClass62_513, Static13.aClass62_172)) {
				@Pc(1086) Class30 local1086 = new Class30(Static59.aClass42_Sub1_35.method1506(Static41.aClass62_513, Static13.aClass62_172));
				Static90.method1538(local1086);
				Static94.anInt2490 = 96;
				Static74.aClass62_876 = Static68.aClass62_821;
				Static17.anInt2850 = 130;
			} else {
				Static74.aClass62_876 = Static49.method782(new Class62[] { Static99.aClass62_1209, Static53.aClass62_614 });
				Static94.anInt2490 = 96;
			}
		} else if (Static17.anInt2850 == 130) {
			if (Static53.aClass42_Sub1_30.method1503()) {
				Static74.aClass62_876 = Static41.aClass62_531;
				Static17.anInt2850 = 140;
				Static94.anInt2490 = 100;
			} else {
				Static74.aClass62_876 = Static49.method782(new Class62[] { Static8.aClass62_120, Static99.method1662(Static53.aClass42_Sub1_30.method1529()), Static36.aClass62_475 });
				Static94.anInt2490 = 100;
			}
		} else if (Static17.anInt2850 == 140) {
			Static65.method1089(10);
		}
	}
}
