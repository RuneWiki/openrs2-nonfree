import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static61 {

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Lclient!ph;")
	public static Class138 aClass138_14;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "Lclient!p;")
	public static Class133 aClass133_2;

	@OriginalMember(owner = "client!ek", name = "k", descriptor = "I")
	public static int anInt1208;

	@OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
	public static int anInt1209;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "F")
	public static float aFloat11;

	@OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
	public static int anInt1210;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
	public static int anInt1211;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Z")
	public static boolean aBoolean100 = false;

	@OriginalMember(owner = "client!ek", name = "g", descriptor = "I")
	public static int anInt1206 = 0;

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public static void method1024() {
		for (@Pc(15) Class1_Sub1_Sub13 local15 = (Class1_Sub1_Sub13) Static27.aClass24_1.method460(); local15 != null; local15 = (Class1_Sub1_Sub13) Static27.aClass24_1.method464()) {
			@Pc(21) Class22_Sub6 local21 = local15.aClass22_Sub6_1;
			if (Static295.anInt5586 != local21.anInt2671 || Static37.anInt757 > local21.anInt2653) {
				local15.method4616();
			} else if (local21.anInt2663 <= Static37.anInt757) {
				if (local21.anInt2661 > 0) {
					@Pc(52) Class22_Sub3_Sub1 local52 = Static265.aClass22_Sub3_Sub1Array1[local21.anInt2661 - 1];
					if (local52 != null && local52.anInt4601 >= 0 && local52.anInt4601 < 13312 && local52.anInt4623 >= 0 && local52.anInt4623 < 13312) {
						local21.method2156(Static104.method1648(local21.anInt2671, local52.anInt4601, local52.anInt4623) - local21.anInt2667, Static37.anInt757, local52.anInt4601, local52.anInt4623);
					}
				}
				if (local21.anInt2661 < 0) {
					@Pc(105) int local105 = -local21.anInt2661 - 1;
					@Pc(114) Class22_Sub3_Sub2 local114;
					if (Static117.anInt2308 == local105) {
						local114 = Static229.aClass22_Sub3_Sub2_2;
					} else {
						local114 = Static195.aClass22_Sub3_Sub2Array1[local105];
					}
					if (local114 != null && local114.anInt4601 >= 0 && local114.anInt4601 < 13312 && local114.anInt4623 >= 0 && local114.anInt4623 < 13312) {
						local21.method2156(Static104.method1648(local21.anInt2671, local114.anInt4601, local114.anInt4623) - local21.anInt2667, Static37.anInt757, local114.anInt4601, local114.anInt4623);
					}
				}
				local21.method2154(Static147.anInt2946);
				Static230.method3623(Static295.anInt5586, (int) local21.aDouble7, (int) local21.aDouble1, (int) local21.aDouble4, 60, local21, local21.anInt2666, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(IBLclient!qm;I)V")
	public static void method1025(@OriginalArg(0) int arg0, @OriginalArg(2) Class22_Sub3_Sub2 arg1, @OriginalArg(3) int arg2) {
		if ((arg0 & 0x8) != 0) {
			arg1.aString150 = Static237.aClass1_Sub14_Sub1_7.method2605();
			if (arg1.aString150.charAt(0) == '~') {
				arg1.aString150 = arg1.aString150.substring(1);
				Static232.method2984(arg1.method3667(false), arg1.method3667(true), 2, 0, arg1.aString150);
			} else if (Static229.aClass22_Sub3_Sub2_2 == arg1) {
				Static232.method2984(arg1.method3667(false), arg1.method3667(true), 2, 0, arg1.aString150);
			}
			arg1.anInt4577 = 0;
			arg1.anInt4583 = 0;
			arg1.anInt4636 = 150;
		}
		@Pc(84) int local84;
		@Pc(97) int local97;
		@Pc(172) int local172;
		if ((arg0 & 0x200) != 0) {
			local84 = Static237.aClass1_Sub14_Sub1_7.method2593();
			@Pc(86) boolean local86 = true;
			if (local84 == 65535) {
				local84 = -1;
			}
			local97 = Static237.aClass1_Sub14_Sub1_7.method2635();
			if (local84 != -1 && arg1.anInt4562 != -1 && Static313.method4648(Static239.method3759(local84).anInt2712).anInt5114 < Static313.method4648(Static239.method3759(arg1.anInt4562).anInt2712).anInt5114) {
				local86 = false;
			}
			if (local86) {
				arg1.anInt4607 = 1;
				arg1.anInt4575 = Static37.anInt757 + (local97 & 0xFFFF);
				arg1.anInt4562 = local84;
				arg1.anInt4596 = 0;
				arg1.anInt4619 = 0;
				if (Static37.anInt757 < arg1.anInt4575) {
					arg1.anInt4619 = -1;
				}
				arg1.anInt4569 = local97 >> 16;
				if (arg1.anInt4562 != -1 && arg1.anInt4575 == Static37.anInt757) {
					local172 = Static239.method3759(arg1.anInt4562).anInt2712;
					if (local172 != -1) {
						@Pc(180) Class167 local180 = Static313.method4648(local172);
						if (local180 != null && local180.anIntArray461 != null) {
							Static212.method3338(arg1.anInt4601, arg1 == Static229.aClass22_Sub3_Sub2_2, 0, local180, arg1.anInt4623);
						}
					}
				}
			}
		}
		if ((arg0 & 0x100) != 0) {
			arg1.anInt4629 = Static237.aClass1_Sub14_Sub1_7.method2595();
			arg1.anInt4565 = Static237.aClass1_Sub14_Sub1_7.method2596();
			arg1.anInt4631 = Static237.aClass1_Sub14_Sub1_7.method2596();
			arg1.anInt4563 = Static237.aClass1_Sub14_Sub1_7.method2596();
			arg1.anInt4600 = Static237.aClass1_Sub14_Sub1_7.method2638() + Static37.anInt757;
			arg1.anInt4586 = Static237.aClass1_Sub14_Sub1_7.method2614() + Static37.anInt757;
			arg1.anInt4621 = Static237.aClass1_Sub14_Sub1_7.method2595();
			arg1.anInt4589 = 0;
			arg1.anInt4580 = 1;
		}
		if ((arg0 & 0x800) != 0) {
			local84 = Static237.aClass1_Sub14_Sub1_7.method2646();
			@Pc(268) int[] local268 = new int[local84];
			@Pc(271) int[] local271 = new int[local84];
			@Pc(274) int[] local274 = new int[local84];
			for (@Pc(276) int local276 = 0; local276 < local84; local276++) {
				@Pc(283) int local283 = Static237.aClass1_Sub14_Sub1_7.method2614();
				if (local283 == 65535) {
					local283 = -1;
				}
				local271[local276] = local283;
				local268[local276] = Static237.aClass1_Sub14_Sub1_7.method2596();
				local274[local276] = Static237.aClass1_Sub14_Sub1_7.method2638();
			}
			Static129.method2027(arg1, local274, local268, local271);
		}
		if ((arg0 & 0x2) != 0) {
			local84 = Static237.aClass1_Sub14_Sub1_7.method2626();
			local97 = Static237.aClass1_Sub14_Sub1_7.method2646();
			@Pc(334) int local334 = Static237.aClass1_Sub14_Sub1_7.method2646();
			local172 = Static237.aClass1_Sub14_Sub1_7.anInt3290;
			@Pc(346) boolean local346 = (local84 & 0x8000) != 0;
			if (arg1.aString153 != null && arg1.aClass119_2 != null) {
				@Pc(355) boolean local355 = false;
				if (local97 <= 1) {
					if (!local346 && (Static310.aBoolean108 && !Static241.aBoolean346 || Static206.aBoolean280)) {
						local355 = true;
					} else if (Static15.method209(arg1.aString153)) {
						local355 = true;
					}
				}
				if (!local355 && Static310.anInt1326 == 0) {
					@Pc(387) int local387 = -1;
					Static261.aClass1_Sub14_10.anInt3290 = 0;
					Static237.aClass1_Sub14_Sub1_7.method2645(Static261.aClass1_Sub14_10.aByteArray34, local334);
					Static261.aClass1_Sub14_10.anInt3290 = 0;
					@Pc(409) String local409;
					if (local346) {
						local84 &= 0x7FFF;
						@Pc(419) Class160 local419 = Static138.method2210(Static261.aClass1_Sub14_10);
						local387 = local419.anInt4975;
						local409 = local419.aClass1_Sub1_Sub20_1.method3808(Static261.aClass1_Sub14_10);
					} else {
						local409 = Static139.method4431(Static298.method4460(Static212.method3330(Static261.aClass1_Sub14_10)));
					}
					arg1.aString150 = local409.trim();
					arg1.anInt4583 = local84 >> 8;
					arg1.anInt4636 = 150;
					arg1.anInt4577 = local84 & 0xFF;
					@Pc(459) int local459;
					if (local97 == 1 || local97 == 2) {
						local459 = local346 ? 17 : 1;
					} else {
						local459 = local346 ? 17 : 2;
					}
					if (local97 == 2) {
						Static26.method479(null, local409, "<img=1>" + arg1.method3667(true), local387, 0, local459, "<img=1>" + arg1.method3667(false));
					} else if (local97 == 1) {
						Static26.method479(null, local409, "<img=0>" + arg1.method3667(true), local387, 0, local459, "<img=0>" + arg1.method3667(false));
					} else {
						Static26.method479(null, local409, arg1.method3667(true), local387, 0, local459, arg1.method3667(false));
					}
				}
			}
			Static237.aClass1_Sub14_Sub1_7.anInt3290 = local334 + local172;
		}
		if ((arg0 & 0x4) != 0) {
			local84 = Static237.aClass1_Sub14_Sub1_7.method2626();
			local97 = Static237.aClass1_Sub14_Sub1_7.method2595();
			if (local84 == 65535) {
				local84 = -1;
			}
			Static203.method3251(local97, local84, arg1);
		}
		if ((arg0 & 0x1) != 0) {
			local84 = Static237.aClass1_Sub14_Sub1_7.method2648();
			local97 = Static237.aClass1_Sub14_Sub1_7.method2595();
			arg1.method3648(Static37.anInt757, local97, local84);
			arg1.anInt4594 = Static37.anInt757 + 300;
			arg1.anInt4647 = Static237.aClass1_Sub14_Sub1_7.method2646();
		}
		if ((arg0 & 0x400) != 0) {
			local84 = Static237.aClass1_Sub14_Sub1_7.method2648();
			local97 = Static237.aClass1_Sub14_Sub1_7.method2646();
			arg1.method3648(Static37.anInt757, local97, local84);
		}
		if ((arg0 & 0x20) != 0) {
			arg1.anInt4617 = Static237.aClass1_Sub14_Sub1_7.method2638();
			arg1.anInt4624 = Static237.aClass1_Sub14_Sub1_7.method2638();
		}
		if ((arg0 & 0x40) != 0) {
			local84 = Static237.aClass1_Sub14_Sub1_7.method2595();
			@Pc(661) byte[] local661 = new byte[local84];
			@Pc(666) Class1_Sub14 local666 = new Class1_Sub14(local661);
			Static237.aClass1_Sub14_Sub1_7.method2585(local84, local661);
			Static280.aClass1_Sub14Array1[arg2] = local666;
			arg1.method3668(local666, arg2);
		}
		if ((arg0 & 0x80) != 0) {
			arg1.anInt4638 = Static237.aClass1_Sub14_Sub1_7.method2638();
			if (arg1.anInt4638 == 65535) {
				arg1.anInt4638 = -1;
			}
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)I")
	public static int method1027(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 * arg0 >> 12) * arg0 >> 12;
		@Pc(24) int local24 = arg0 * 6 - 61440;
		@Pc(32) int local32 = (arg0 * local24 >> 12) + 40960;
		return local18 * local32 >> 12;
	}
}
