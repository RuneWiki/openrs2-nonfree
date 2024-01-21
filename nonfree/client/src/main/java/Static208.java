import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!we", name = "m", descriptor = "Lclient!wf;")
	public static Class1_Sub2_Sub24 aClass1_Sub2_Sub24_1;

	@OriginalMember(owner = "client!we", name = "p", descriptor = "Lclient!vc;")
	public static Class98 aClass98_21 = null;

	@OriginalMember(owner = "client!we", name = "q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1306 = Static81.method1507("Verbindung mit Update)2Server)3)3)3");

	@OriginalMember(owner = "client!we", name = "s", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1307 = Static81.method1507("Error loading your profile)3");

	@OriginalMember(owner = "client!we", name = "v", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1308 = aClass24_1307;

	@OriginalMember(owner = "client!we", name = "C", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1309 = Static81.method1507("<col=40ff00>");

	@OriginalMember(owner = "client!we", name = "D", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1310 = Static81.method1507(")4l");

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Lclient!aa;")
	public static Class1_Sub2_Sub1 method3517(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub2_Sub1 local6 = (Class1_Sub2_Sub1) Static133.aClass86_42.method2816((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(24) byte[] local24 = Static53.aClass69_14.method2208(Static132.method2261(arg0), Static196.method3327(arg0));
		local6 = new Class1_Sub2_Sub1();
		if (local24 != null) {
			local6.method81(new Class1_Sub7(local24));
		}
		Static133.aClass86_42.method2821(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!we", name = "b", descriptor = "(II)I")
	public static int method3518(@OriginalArg(1) int arg0) {
		@Pc(8) int local8 = arg0 - 1;
		@Pc(18) int local18 = local8 | local8 >>> 1;
		@Pc(24) int local24 = local18 | local18 >>> 2;
		@Pc(30) int local30 = local24 | local24 >>> 4;
		@Pc(36) int local36 = local30 | local30 >>> 8;
		@Pc(42) int local42 = local36 | local36 >>> 16;
		return local42 + 1;
	}

	@OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
	public static void method3519() {
		if (Static5.aClass24_40 == null) {
			return;
		}
		if (Static135.anInt2989 < 10) {
			if (!Static129.aClass69_Sub1_99.method2196(Static5.aClass24_40)) {
				Static135.anInt2989 = Static129.aClass69_Sub1_99.method2195(Static5.aClass24_40) / 10;
				return;
			}
			Static135.anInt2989 = 10;
		}
		if (Static135.anInt2989 == 10) {
			@Pc(38) Class1_Sub7 local38 = new Class1_Sub7(Static129.aClass69_Sub1_99.method2214(Static115.aClass24_765, Static5.aClass24_40));
			@Pc(42) int local42 = local38.method2765();
			@Pc(46) int local46 = local38.method2765();
			@Pc(50) int local50 = local38.method2765();
			@Pc(54) int local54 = local38.method2765();
			@Pc(58) int local58 = local38.method2765();
			@Pc(62) int local62 = local38.method2765();
			@Pc(68) int local68 = Static168.anInt3732 >> 2 << 10;
			Static28.anIntArray73 = new int[Static148.anInt3290 + 1];
			Static146.anInt3124 = (local50 + 1 - local42) * 64;
			Static178.aDouble11 = 8.0D;
			Static29.aDouble1 = 8.0D;
			Static174.anInt3876 = local42 * 64;
			@Pc(99) int local99 = Static196.anInt4343 + (Static87.aClass5_Sub2_Sub1_1.anInt2501 >> 7) - Static174.anInt3876;
			@Pc(108) int local108 = local99 + (int) (Math.random() * 10.0D) - 5;
			@Pc(112) int local112 = Static92.anInt2144 >> 1;
			Static122.anInt2713 = local46 * 64;
			@Pc(120) int local120 = Static146.anInt3124 >> 6;
			@Pc(130) int local130 = (Static87.aClass5_Sub2_Sub1_1.anInt2448 >> 7) + Static127.anInt2789 - Static122.anInt2713;
			Static189.anInt4212 = (local54 - local46) * 64 + 64;
			@Pc(148) int local148 = local130 + (int) (Math.random() * 10.0D) - 5;
			@Pc(152) int local152 = Static189.anInt4212 >> 6;
			Static65.anIntArrayArrayArray4 = new int[local120][local152][];
			Static72.aByteArrayArrayArray4 = new byte[local120][local152][];
			Static86.anIntArrayArrayArray5 = new int[local120][local152][];
			if (local108 >= 0 && Static146.anInt3124 > local108 && local148 >= 0 && local148 < Static189.anInt4212) {
				Static2.anInt111 = local108;
				Static3.anInt118 = Static189.anInt4212 - local148;
			} else {
				Static3.anInt118 = Static122.anInt2713 + Static189.anInt4212 - local62 * 64;
				Static2.anInt111 = local58 * 64 - Static174.anInt3876;
			}
			Static148.aByteArrayArrayArray10 = new byte[local120][local152][];
			Static199.aByteArrayArrayArray6 = new byte[local120][local152][];
			Static27.aByteArrayArrayArray2 = new byte[local120][local152][];
			Static157.aByteArrayArrayArray11 = new byte[local120][local152][];
			Static202.aByteArrayArrayArray14 = new byte[local120][local152][];
			for (@Pc(226) int local226 = 0; local226 < Static148.anInt3290; local226++) {
				@Pc(231) Class1_Sub2_Sub19 local231 = Static56.method1093(local226);
				if (local231 != null) {
					@Pc(236) int local236 = local231.anInt3365;
					if (local236 >= 0 && !Static182.anInterface2_2.method1319(local236)) {
						local236 = -1;
					}
					@Pc(295) int local295;
					@Pc(257) int local257;
					@Pc(263) int local263;
					@Pc(288) int local288;
					if (local231.anInt3360 >= 0) {
						local257 = local231.anInt3360;
						local263 = local112 + (local257 & 0x7F);
						if (local263 < 0) {
							local263 = 0;
						} else if (local263 > 127) {
							local263 = 127;
						}
						local288 = (local257 & 0x380) + (local257 + local68 & 0xFC00) + local263;
						local295 = Static182.anIntArray354[Static126.method2106(96, local288)];
					} else if (local236 >= 0) {
						local295 = Static182.anIntArray354[Static126.method2106(96, Static182.anInterface2_2.method1320(local236))];
					} else if (local231.anInt3368 == -1) {
						local295 = -1;
					} else {
						local257 = local231.anInt3368;
						local263 = local112 + (local257 & 0x7F);
						if (local263 < 0) {
							local263 = 0;
						} else if (local263 > 127) {
							local263 = 127;
						}
						local288 = local263 + (local257 & 0x380) + (local257 + local68 & 0xFC00);
						local295 = Static182.anIntArray354[Static126.method2106(96, local288)];
					}
					Static28.anIntArray73[local226 + 1] = local295;
				}
			}
			Static135.anInt2989 = 20;
		} else if (Static135.anInt2989 == 20) {
			Static68.method1338(Static129.aClass69_Sub1_99.method2214(Static30.aClass24_199, Static5.aClass24_40));
			Static135.anInt2989 = 30;
			Static49.method901();
		} else if (Static135.anInt2989 == 30) {
			Static198.method3353(Static129.aClass69_Sub1_99.method2214(Static142.aClass24_939, Static5.aClass24_40));
			Static135.anInt2989 = 50;
			Static49.method901();
		} else if (Static135.anInt2989 == 50) {
			Static91.method1652(Static129.aClass69_Sub1_99.method2214(Static151.aClass24_990, Static5.aClass24_40));
			Static135.anInt2989 = 70;
			Static49.method901();
		} else if (Static135.anInt2989 == 70) {
			Static76.method1420(Static129.aClass69_Sub1_99.method2214(Static191.aClass24_1227, Static5.aClass24_40));
			Static135.anInt2989 = 90;
			Static49.method901();
		} else {
			Static57.method1101(Static129.aClass69_Sub1_99.method2214(Static30.aClass24_201, Static5.aClass24_40));
			if (Static135.anInt2989 == 90) {
				Static176.aClass1_Sub2_Sub8_Sub5_41 = new Class1_Sub2_Sub8_Sub5(11, true, Static8.aCanvas1);
				Static112.aClass1_Sub2_Sub8_Sub5_25 = new Class1_Sub2_Sub8_Sub5(12, true, Static8.aCanvas1);
				Static59.aClass1_Sub2_Sub8_Sub5_16 = new Class1_Sub2_Sub8_Sub5(14, true, Static8.aCanvas1);
				Static47.aClass1_Sub2_Sub8_Sub5_11 = new Class1_Sub2_Sub8_Sub5(17, true, Static8.aCanvas1);
				Static66.aClass1_Sub2_Sub8_Sub5_18 = new Class1_Sub2_Sub8_Sub5(19, true, Static8.aCanvas1);
				Static5.aClass1_Sub2_Sub8_Sub5_3 = new Class1_Sub2_Sub8_Sub5(22, true, Static8.aCanvas1);
				Static91.aClass1_Sub2_Sub8_Sub5_21 = new Class1_Sub2_Sub8_Sub5(26, true, Static8.aCanvas1);
				Static184.aClass1_Sub2_Sub8_Sub5_37 = new Class1_Sub2_Sub8_Sub5(30, true, Static8.aCanvas1);
				Static135.anInt2989 = 100;
			}
			Static135.anInt2989 = 100;
			Static49.anInt1247 = -1;
			Static70.anInt3208 = -1;
			Static49.method901();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIII)I")
	public static int method3521(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if ((Static43.aByteArrayArrayArray3[arg1][arg0][arg2] & 0x8) == 0) {
			return arg1 <= 0 || (Static43.aByteArrayArrayArray3[1][arg0][arg2] & 0x2) == 0 ? arg1 : arg1 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIZZBZ)Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 method3522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(7) boolean arg5) {
		@Pc(7) Class1_Sub2_Sub23 local7 = Static168.method2886(arg2);
		if (arg1 > 1 && local7.anIntArray365 != null) {
			@Pc(17) int local17 = -1;
			for (@Pc(19) int local19 = 0; local19 < 10; local19++) {
				if (local7.anIntArray363[local19] <= arg1 && local7.anIntArray363[local19] != 0) {
					local17 = local7.anIntArray365[local19];
				}
			}
			if (local17 != -1) {
				local7 = Static168.method2886(local17);
			}
		}
		@Pc(51) Class5_Sub1_Sub1 local51 = local7.method3251();
		if (local51 == null) {
			return null;
		}
		@Pc(57) Class1_Sub2_Sub8_Sub3 local57 = null;
		if (local7.anInt4221 != -1) {
			local57 = method3522(1, 10, local7.anInt4198, 0, true, false);
			if (local57 == null) {
				return null;
			}
		} else if (local7.anInt4223 != -1) {
			local57 = method3522(arg0, arg1, local7.anInt4205, arg3, false, false);
			if (local57 == null) {
				return null;
			}
		}
		@Pc(98) int[] local98 = Static90.anIntArray406;
		@Pc(101) int[] local101 = new int[4];
		@Pc(103) int local103 = Static90.anInt4601;
		@Pc(105) int local105 = Static90.anInt4605;
		Static90.method3496(local101);
		@Pc(118) Class1_Sub2_Sub8_Sub3 local118 = new Class1_Sub2_Sub8_Sub3(36, 32);
		Static90.method3499(local118.anIntArray246, 36, 32);
		Static90.method3486();
		Static182.method3156();
		Static182.method3139(16, 16);
		Static182.aBoolean193 = false;
		if (local7.anInt4223 != -1) {
			local57.method2347(0, 0);
		}
		@Pc(142) int local142 = local7.anInt4244;
		if (arg4) {
			local142 = (int) ((double) local142 * 1.5D);
		} else if (arg0 == 2) {
			local142 = (int) ((double) local142 * 1.04D);
		}
		@Pc(169) int local169 = Class1_Sub2_Sub8_Sub4.anIntArray350[local7.anInt4231] * local142 >> 16;
		@Pc(178) int local178 = local142 * Class1_Sub2_Sub8_Sub4.anIntArray355[local7.anInt4231] >> 16;
		local51.method167(local7.anInt4207, local7.anInt4243, local7.anInt4231, local7.anInt4216, local169 + local7.anInt4211 - local51.method3163() / 2, local7.anInt4211 + local178);
		if (local7.anInt4223 == -1) {
			if (arg0 >= 1) {
				local118.method2348(1);
			}
			if (arg0 >= 2) {
				local118.method2348(16777215);
			}
			if (arg3 != 0) {
				local118.method2356(arg3);
			}
		}
		Static90.method3499(local118.anIntArray246, 36, 32);
		if (local7.anInt4221 != -1) {
			local57.method2347(0, 0);
		}
		if (arg5 && (local7.anInt4214 == 1 || arg1 != 1) && arg1 != -1) {
			Static98.aClass1_Sub2_Sub8_Sub1_Sub1_4.method1273(Static189.method3248(arg1), 0, 9, 16776960, 1);
		}
		Static90.method3499(local98, local103, local105);
		Static90.method3485(local101);
		Static182.method3156();
		Static182.aBoolean193 = true;
		return local118;
	}
}
