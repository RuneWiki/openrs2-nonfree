import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!vc", name = "f", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9;

	@OriginalMember(owner = "client!vc", name = "m", descriptor = "I")
	public static int anInt2875;

	@OriginalMember(owner = "client!vc", name = "n", descriptor = "Lclient!ta;")
	public static Class14 aClass14_37;

	@OriginalMember(owner = "client!vc", name = "v", descriptor = "Lclient!je;")
	public static Class3_Sub1 aClass3_Sub1_14;

	@OriginalMember(owner = "client!vc", name = "y", descriptor = "[Lclient!nd;")
	public static Class2_Sub1_Sub1_Sub3[] aClass2_Sub1_Sub1_Sub3Array37;

	@OriginalMember(owner = "client!vc", name = "D", descriptor = "Lclient!pc;")
	public static Class51 aClass51_5;

	@OriginalMember(owner = "client!vc", name = "j", descriptor = "Lclient!kc;")
	private static Class36 aClass36_1409 = Static14.method2017("Please wait)3)3)3");

	@OriginalMember(owner = "client!vc", name = "e", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1408 = aClass36_1409;

	@OriginalMember(owner = "client!vc", name = "l", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1410 = aClass36_1409;

	@OriginalMember(owner = "client!vc", name = "o", descriptor = "I")
	public static int anInt2876 = 0;

	@OriginalMember(owner = "client!vc", name = "p", descriptor = "[I")
	public static int[] anIntArray344 = new int[50];

	@OriginalMember(owner = "client!vc", name = "t", descriptor = "I")
	public static int anInt2879 = 0;

	@OriginalMember(owner = "client!vc", name = "B", descriptor = "I")
	public static int anInt2883 = 0;

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "Lclient!kc;")
	public static Class36 aClass36_1411 = Static14.method2017("b12_full");

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
	public static int anInt2890 = 0;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(B)V")
	public static void method2000() {
		Static110.aBoolean133 = true;
		Static77.method1468();
		@Pc(26) boolean local26;
		if (Static94.anInt2471 != -1) {
			local26 = Static81.method1494(261, 190, 1, Static94.anInt2471);
			if (!local26) {
				Static100.aBoolean118 = true;
			}
		} else if (Static101.anIntArray323[Static109.anInt2825] != -1) {
			local26 = Static81.method1494(261, 190, 1, Static101.anIntArray323[Static109.anInt2825]);
			if (!local26) {
				Static100.aBoolean118 = true;
			}
		}
		if (Static73.aBoolean82 && Static24.anInt620 == 1) {
			if (Static101.anInt2660 == 1) {
				Static20.method373();
			} else {
				Static95.method1789();
			}
		}
		Static85.method1556();
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBIILclient!ed;III)V")
	public static void method2002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub1_Sub6 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static16.aBoolean7) {
			Static69.anInt1754 = 32;
		} else {
			Static69.anInt1754 = 0;
		}
		Static16.aBoolean7 = false;
		@Pc(150) int local150;
		if (arg2 <= arg1 && arg2 + 16 > arg1 && arg7 <= arg0 && arg7 + 16 > arg0) {
			if (arg3 == 1) {
				Static100.aBoolean118 = true;
			}
			arg4.anInt716 -= Static19.anInt2917 * 4;
			if (arg3 == 2 || arg3 == 3) {
				Static115.aBoolean77 = true;
			}
		} else if (arg2 <= arg1 && arg1 < arg2 + 16 && arg0 >= arg7 + arg5 - 16 && arg0 < arg5 + arg7) {
			if (arg3 == 1) {
				Static100.aBoolean118 = true;
			}
			arg4.anInt716 += Static19.anInt2917 * 4;
			if (arg3 == 2 || arg3 == 3) {
				Static115.aBoolean77 = true;
			}
		} else if (arg2 - Static69.anInt1754 <= arg1 && arg2 + Static69.anInt1754 + 16 > arg1 && arg0 >= arg7 + 16 && arg0 < arg7 + arg5 - 16 && Static19.anInt2917 > 0) {
			if (arg3 == 1) {
				Static100.aBoolean118 = true;
			}
			if (arg3 == 2 || arg3 == 3) {
				Static115.aBoolean77 = true;
			}
			Static16.aBoolean7 = true;
			local150 = (arg5 - 32) * arg5 / arg6;
			if (local150 < 8) {
				local150 = 8;
			}
			@Pc(169) int local169 = arg0 - local150 / 2 - arg7 - 16;
			@Pc(176) int local176 = arg5 - local150 - 32;
			arg4.anInt716 = local169 * (arg6 - arg5) / local176;
		}
		if (anInt2879 == 0) {
			return;
		}
		local150 = arg4.anInt677;
		if (arg3 == -1) {
			local150 = 479;
		}
		if (arg1 < arg2 - local150 || arg0 < arg7 || arg2 + 16 <= arg1 || arg5 + arg7 < arg0) {
			return;
		}
		arg4.anInt716 += anInt2879 * 45;
		if (arg3 == 2 || arg3 == 3) {
			Static115.aBoolean77 = true;
		}
		if (arg3 == 1) {
			Static100.aBoolean118 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
	public static void method2003() {
		@Pc(10) int local10 = Static92.aClass2_Sub12_Sub1_3.method1418(8);
		@Pc(19) int local19;
		if (local10 < Static65.anInt1689) {
			for (local19 = local10; local19 < Static65.anInt1689; local19++) {
				Static47.anIntArray169[Static27.anInt747++] = Static99.anIntArray243[local19];
			}
		}
		if (Static65.anInt1689 < local10) {
			throw new RuntimeException("gppov1");
		}
		Static65.anInt1689 = 0;
		for (local19 = 0; local19 < local10; local19++) {
			@Pc(62) int local62 = Static99.anIntArray243[local19];
			@Pc(66) Class2_Sub1_Sub4_Sub2_Sub2 local66 = Static34.aClass2_Sub1_Sub4_Sub2_Sub2Array1[local62];
			@Pc(71) int local71 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
			if (local71 == 0) {
				Static99.anIntArray243[Static65.anInt1689++] = local62;
				local66.anInt2169 = Static113.anInt2952;
			} else {
				@Pc(91) int local91 = Static92.aClass2_Sub12_Sub1_3.method1418(2);
				if (local91 == 0) {
					Static99.anIntArray243[Static65.anInt1689++] = local62;
					local66.anInt2169 = Static113.anInt2952;
					Static115.anIntArray225[Static55.anInt2714++] = local62;
				} else {
					@Pc(135) int local135;
					@Pc(145) int local145;
					if (local91 == 1) {
						Static99.anIntArray243[Static65.anInt1689++] = local62;
						local66.anInt2169 = Static113.anInt2952;
						local135 = Static92.aClass2_Sub12_Sub1_3.method1418(3);
						local66.method1552(local135, false);
						local145 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
						if (local145 == 1) {
							Static115.anIntArray225[Static55.anInt2714++] = local62;
						}
					} else if (local91 == 2) {
						Static99.anIntArray243[Static65.anInt1689++] = local62;
						local66.anInt2169 = Static113.anInt2952;
						local135 = Static92.aClass2_Sub12_Sub1_3.method1418(3);
						local66.method1552(local135, true);
						local145 = Static92.aClass2_Sub12_Sub1_3.method1418(3);
						local66.method1552(local145, true);
						@Pc(199) int local199 = Static92.aClass2_Sub12_Sub1_3.method1418(1);
						if (local199 == 1) {
							Static115.anIntArray225[Static55.anInt2714++] = local62;
						}
					} else if (local91 == 3) {
						Static47.anIntArray169[Static27.anInt747++] = local62;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIIB)V")
	public static void method2004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			Static42.aClass2_Sub12_Sub1_1.method1422(245);
			Static42.aClass2_Sub12_Sub1_1.method1394(arg2);
			Static42.aClass2_Sub12_Sub1_1.method1373(arg1);
		}
		if (arg0 == 2) {
			Static42.aClass2_Sub12_Sub1_1.method1422(30);
			Static42.aClass2_Sub12_Sub1_1.method1394(arg2);
			Static42.aClass2_Sub12_Sub1_1.method1373(arg1);
		}
		if (arg0 == 3) {
			Static42.aClass2_Sub12_Sub1_1.method1422(244);
			Static42.aClass2_Sub12_Sub1_1.method1394(arg2);
			Static42.aClass2_Sub12_Sub1_1.method1373(arg1);
		}
		if (arg0 == 4) {
			Static42.aClass2_Sub12_Sub1_1.method1422(164);
			Static42.aClass2_Sub12_Sub1_1.method1394(arg2);
			Static42.aClass2_Sub12_Sub1_1.method1373(arg1);
		}
		if (arg0 == 5) {
			Static42.aClass2_Sub12_Sub1_1.method1422(57);
			Static42.aClass2_Sub12_Sub1_1.method1394(arg2);
			Static42.aClass2_Sub12_Sub1_1.method1373(arg1);
		}
		if (arg0 == 6) {
			Static42.aClass2_Sub12_Sub1_1.method1422(174);
			Static42.aClass2_Sub12_Sub1_1.method1394(arg2);
			Static42.aClass2_Sub12_Sub1_1.method1373(arg1);
		}
		if (arg0 == 7) {
			Static42.aClass2_Sub12_Sub1_1.method1422(28);
			Static42.aClass2_Sub12_Sub1_1.method1394(arg2);
			Static42.aClass2_Sub12_Sub1_1.method1373(arg1);
		}
		if (arg0 == 8) {
			Static42.aClass2_Sub12_Sub1_1.method1422(171);
			Static42.aClass2_Sub12_Sub1_1.method1394(arg2);
			Static42.aClass2_Sub12_Sub1_1.method1373(arg1);
		}
		if (arg0 == 9) {
			Static42.aClass2_Sub12_Sub1_1.method1422(33);
			Static42.aClass2_Sub12_Sub1_1.method1394(arg2);
			Static42.aClass2_Sub12_Sub1_1.method1373(arg1);
		}
		if (arg0 == 10) {
			Static42.aClass2_Sub12_Sub1_1.method1422(36);
			Static42.aClass2_Sub12_Sub1_1.method1394(arg2);
			Static42.aClass2_Sub12_Sub1_1.method1373(arg1);
		}
		@Pc(206) Class2_Sub1_Sub6 local206 = Static76.method1462(arg1, arg2);
		if (local206 != null && local206.anObjectArray7 != null) {
			Static92.method1684(local206, local206.anObjectArray7, 0, arg0, 0, null);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(I)V")
	public static void method2006() {
		aClass36_1410 = null;
		aClass3_Sub1_14 = null;
		aByteArrayArrayArray9 = null;
		aClass36_1411 = null;
		aClass14_37 = null;
		anIntArray344 = null;
		aClass2_Sub1_Sub1_Sub3Array37 = null;
		aClass51_5 = null;
		aClass36_1408 = null;
		aClass36_1409 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIBIIII)I")
	public static int method2009(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg5 & 0x1) == 1) {
			@Pc(6) int local6 = arg2;
			arg2 = arg1;
			arg1 = local6;
		}
		@Pc(19) int local19 = arg4 & 0x3;
		if (local19 == 0) {
			return arg0;
		} else if (local19 == 1) {
			return arg3;
		} else if (local19 == 2) {
			return 1 + 7 - arg2 - arg0;
		} else {
			return 7 + 1 - arg3 - arg1;
		}
	}
}
