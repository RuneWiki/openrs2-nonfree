import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!ba", name = "mb", descriptor = "I")
	public static int anInt303;

	@OriginalMember(owner = "client!ba", name = "O", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_93 = Static81.method1507("<img=1>");

	@OriginalMember(owner = "client!ba", name = "X", descriptor = "Lclient!s;")
	public static final Class87 aClass87_6 = new Class87();

	@OriginalMember(owner = "client!ba", name = "jb", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_95 = Static81.method1507("Ok");

	@OriginalMember(owner = "client!ba", name = "ib", descriptor = "Lclient!dj;")
	public static Class24 aClass24_94 = aClass24_95;

	@OriginalMember(owner = "client!ba", name = "nb", descriptor = "I")
	public static int anInt304 = 0;

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V")
	public static void method295() {
		@Pc(9) int local9 = Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1269(Static195.aClass24_1249);
		@Pc(24) int local24;
		for (@Pc(16) int local16 = 0; local16 < Static156.anInt3437; local16++) {
			local24 = Static131.aClass1_Sub2_Sub8_Sub1_Sub1_5.method1269(Static123.method2077(local16));
			if (local9 < local24) {
				local9 = local24;
			}
		}
		Static53.aBoolean73 = true;
		Static7.anInt173 = Static156.anInt3437 * 15 + 22;
		local24 = Static156.anInt3437 * 15 + 21;
		@Pc(53) int local53 = Static92.anInt2141;
		if (local53 + local24 > Static147.anInt3283) {
			local53 = Static147.anInt3283 - local24;
		}
		local9 += 8;
		@Pc(75) int local75 = Static157.anInt3462 - local9 / 2;
		if (local53 < 0) {
			local53 = 0;
		}
		if (Static116.anInt2589 < local9 + local75) {
			local75 = Static116.anInt2589 - local9;
		}
		Static109.anInt2509 = local9;
		if (local75 < 0) {
			local75 = 0;
		}
		Static110.anInt2525 = local53;
		Static10.anInt1519 = local75;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!fj;I)Lclient!dj;")
	public static Class24 method296(@OriginalArg(0) Class1_Sub7 arg0) {
		return Static83.method1544(arg0);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(BLclient!dj;)V")
	public static void method297(@OriginalArg(1) Class24 arg0) {
		@Pc(3) Class1_Sub6 local3 = Static111.method1911(arg0);
		if (local3 == null) {
			return;
		}
		Static70.anInt3208 = local3.anInt879 - Static174.anInt3876;
		@Pc(26) int local26 = Static70.anInt3208 + (int) ((double) Static44.aClass98_5.anInt4400 / Static178.aDouble11);
		@Pc(36) int local36 = Static70.anInt3208 - (int) ((double) Static44.aClass98_5.anInt4400 / Static178.aDouble11);
		Static49.anInt1247 = Static189.anInt4212 + Static122.anInt2713 - local3.anInt873;
		if (local36 < 0) {
			Static70.anInt3208 = (int) ((double) Static44.aClass98_5.anInt4400 / Static178.aDouble11);
		}
		if (Static146.anInt3124 < local26) {
			Static70.anInt3208 = Static146.anInt3124 - (int) ((double) Static44.aClass98_5.anInt4400 / Static178.aDouble11);
		}
		@Pc(79) int local79 = Static49.anInt1247 - (int) ((double) Static44.aClass98_5.anInt4403 / Static178.aDouble11);
		@Pc(89) int local89 = Static49.anInt1247 + (int) ((double) Static44.aClass98_5.anInt4403 / Static178.aDouble11);
		if (local79 < 0) {
			Static49.anInt1247 = (int) ((double) Static44.aClass98_5.anInt4403 / Static178.aDouble11);
		}
		if (local89 > Static189.anInt4212) {
			Static49.anInt1247 = Static189.anInt4212 - (int) ((double) Static44.aClass98_5.anInt4403 / Static178.aDouble11);
		}
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(ILclient!ca;IZ)V")
	public static void method300(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub1 arg1, @OriginalArg(2) int arg2) {
		@Pc(12) int local12;
		@Pc(23) int local23;
		if ((arg0 & 0x4) != 0) {
			local12 = Static192.aClass1_Sub7_Sub1_31.method2752();
			if (local12 == 65535) {
				local12 = -1;
			}
			local23 = Static192.aClass1_Sub7_Sub1_31.method2771();
			Static157.method2662(arg1, local23, local12);
		}
		if ((arg0 & 0x2) != 0) {
			arg1.anInt2500 = Static192.aClass1_Sub7_Sub1_31.method2765();
			if (arg1.anInt2500 == 65535) {
				arg1.anInt2500 = -1;
			}
		}
		if ((arg0 & 0x80) != 0) {
			local12 = Static192.aClass1_Sub7_Sub1_31.method2771();
			local23 = Static192.aClass1_Sub7_Sub1_31.method2769();
			arg1.method1888(local23, Static42.anInt1100, local12);
			arg1.anInt2475 = Static42.anInt1100 + 300;
			arg1.anInt2457 = Static192.aClass1_Sub7_Sub1_31.method2771();
		}
		if ((arg0 & 0x40) != 0) {
			arg1.anInt2462 = Static192.aClass1_Sub7_Sub1_31.method2765();
			arg1.anInt2487 = Static192.aClass1_Sub7_Sub1_31.method2752();
		}
		if ((arg0 & 0x100) != 0) {
			local12 = Static192.aClass1_Sub7_Sub1_31.method2771();
			local23 = Static192.aClass1_Sub7_Sub1_31.method2769();
			arg1.method1888(local23, Static42.anInt1100, local12);
		}
		if ((arg0 & 0x200) != 0) {
			arg1.anInt2458 = Static192.aClass1_Sub7_Sub1_31.method2765();
			local12 = Static192.aClass1_Sub7_Sub1_31.method2764();
			arg1.anInt2473 = Static42.anInt1100 + (local12 & 0xFFFF);
			if (arg1.anInt2458 == 65535) {
				arg1.anInt2458 = -1;
			}
			arg1.anInt2461 = local12 >> 16;
			arg1.anInt2471 = 0;
			if (arg1.anInt2473 > Static42.anInt1100) {
				arg1.anInt2471 = -1;
			}
			arg1.anInt2488 = 0;
		}
		if ((arg0 & 0x1) != 0) {
			local12 = Static192.aClass1_Sub7_Sub1_31.method2777();
			@Pc(178) byte[] local178 = new byte[local12];
			@Pc(183) Class1_Sub7 local183 = new Class1_Sub7(local178);
			Static192.aClass1_Sub7_Sub1_31.method2772(local178, local12);
			Static114.aClass1_Sub7Array1[arg2] = local183;
			arg1.method476(local183);
		}
		if ((arg0 & 0x10) != 0) {
			local12 = Static192.aClass1_Sub7_Sub1_31.method2752();
			local23 = Static192.aClass1_Sub7_Sub1_31.method2777();
			@Pc(216) int local216 = Static192.aClass1_Sub7_Sub1_31.method2769();
			@Pc(219) int local219 = Static192.aClass1_Sub7_Sub1_31.anInt3592;
			if (arg1.aClass24_173 != null && arg1.aClass21_1 != null) {
				@Pc(230) long local230 = arg1.aClass24_173.method747();
				@Pc(232) boolean local232 = false;
				if (local23 <= 1) {
					for (@Pc(239) int local239 = 0; local239 < Static34.anInt921; local239++) {
						if (Static135.aLongArray25[local239] == local230) {
							local232 = true;
							break;
						}
					}
				}
				if (!local232 && Static204.anInt4555 == 0) {
					Static192.aClass1_Sub7_6.anInt3592 = 0;
					Static192.aClass1_Sub7_Sub1_31.method2785(Static192.aClass1_Sub7_6.aByteArray38, local216);
					Static192.aClass1_Sub7_6.anInt3592 = 0;
					@Pc(277) int local277 = -1;
					@Pc(285) boolean local285 = (local12 & 0x8000) != 0;
					@Pc(304) Class24 local304;
					if (local285) {
						local12 &= 0x7FFF;
						@Pc(295) Class72 local295 = Static59.method1106(Static192.aClass1_Sub7_6);
						local277 = local295.anInt2944;
						local304 = local295.aClass1_Sub2_Sub9_1.method1039(Static192.aClass1_Sub7_6);
					} else {
						local304 = Static51.method1264(method296(Static192.aClass1_Sub7_6).method763());
					}
					arg1.aClass24_736 = local304.method780();
					arg1.anInt2477 = local12 & 0xFF;
					arg1.anInt2479 = local12 >> 8;
					arg1.anInt2483 = 150;
					if (local23 == 2) {
						Static166.method2829(null, Static63.method1281(new Class24[] { Static72.aClass24_531, arg1.aClass24_173 }), local285 ? 17 : 1, local304, local277);
					} else if (local23 == 1) {
						Static166.method2829(null, Static63.method1281(new Class24[] { Static150.aClass24_989, arg1.aClass24_173 }), local285 ? 17 : 1, local304, local277);
					} else {
						Static166.method2829(null, arg1.aClass24_173, local285 ? 17 : 2, local304, local277);
					}
				}
			}
			Static192.aClass1_Sub7_Sub1_31.anInt3592 = local219 + local216;
		}
		if ((arg0 & 0x8) != 0) {
			arg1.aClass24_736 = Static192.aClass1_Sub7_Sub1_31.method2761();
			if (arg1.aClass24_736.method743(0) == 126) {
				arg1.aClass24_736 = arg1.aClass24_736.method773(1);
				Static200.method3377(arg1.aClass24_736, 2, arg1.aClass24_173);
			} else if (Static87.aClass5_Sub2_Sub1_1 == arg1) {
				Static200.method3377(arg1.aClass24_736, 2, arg1.aClass24_173);
			}
			arg1.anInt2483 = 150;
			arg1.anInt2477 = 0;
			arg1.anInt2479 = 0;
		}
		if ((arg0 & 0x400) == 0) {
			return;
		}
		arg1.anInt2469 = Static192.aClass1_Sub7_Sub1_31.method2777();
		arg1.anInt2482 = Static192.aClass1_Sub7_Sub1_31.method2777();
		arg1.anInt2467 = Static192.aClass1_Sub7_Sub1_31.method2799();
		arg1.anInt2468 = Static192.aClass1_Sub7_Sub1_31.method2777();
		arg1.anInt2451 = Static192.aClass1_Sub7_Sub1_31.method2794() + Static42.anInt1100;
		arg1.anInt2452 = Static192.aClass1_Sub7_Sub1_31.method2794() + Static42.anInt1100;
		arg1.anInt2460 = Static192.aClass1_Sub7_Sub1_31.method2769();
		arg1.anInt2456 = 0;
		arg1.anInt2447 = 1;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(I[B[Lclient!ue;IIIIIBI)V")
	public static void method302(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class93[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8) {
		@Pc(15) Class1_Sub7 local15 = new Class1_Sub7(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method2795();
			if (local21 == 0) {
				return;
			}
			@Pc(28) int local28 = 0;
			local17 += local21;
			while (true) {
				@Pc(36) int local36 = local15.method2795();
				if (local36 == 0) {
					break;
				}
				local28 += local36 - 1;
				@Pc(51) int local51 = local28 & 0x3F;
				@Pc(57) int local57 = local28 >> 6 & 0x3F;
				@Pc(61) int local61 = local28 >> 12;
				@Pc(65) int local65 = local15.method2771();
				@Pc(69) int local69 = local65 & 0x3;
				@Pc(73) int local73 = local65 >> 2;
				if (local61 == arg3 && arg7 <= local57 && arg7 + 8 > local57 && local51 >= arg5 && local51 < arg5 + 8) {
					@Pc(100) Class1_Sub2_Sub5 local100 = Static37.method702(local17);
					@Pc(117) int local117 = arg4 + Static46.method845(local69, arg6, local57 & 0x7, local100.anInt958, local100.anInt976, local51 & 0x7);
					@Pc(134) int local134 = Static190.method3266(local100.anInt976, arg6, local69, local57 & 0x7, local100.anInt958, local51 & 0x7) + arg0;
					if (local117 > 0 && local134 > 0 && local117 < 103 && local134 < 103) {
						@Pc(146) Class93 local146 = null;
						@Pc(148) int local148 = arg8;
						if ((Static43.aByteArrayArrayArray3[1][local117][local134] & 0x2) == 2) {
							local148 = arg8 - 1;
						}
						if (local148 >= 0) {
							local146 = arg2[local148];
						}
						Static48.method881(Static30.aBoolean35, local117, local146, local73, local17, true, local134, local69 + arg6 & 0x3, arg8, arg8);
					}
				}
			}
		}
	}
}
