import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "[Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4[] aClass2_Sub1_Sub2_Sub4Array1;

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
	public static int anInt376;

	@OriginalMember(owner = "client!ac", name = "Y", descriptor = "Lclient!wc;")
	public static Class4 aClass4_8;

	@OriginalMember(owner = "client!ac", name = "I", descriptor = "Lclient!a;")
	public static Class1 aClass1_283 = Static94.method1596("Name eingeben:");

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "[I")
	public static int[] anIntArray41 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "Lclient!a;")
	private static Class1 aClass1_285 = Static94.method1596("Login server offline)3");

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "Lclient!a;")
	public static Class1 aClass1_284 = aClass1_285;

	@OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
	public static int anInt377 = 2;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public static void method189() {
		aClass4_8 = null;
		aClass2_Sub1_Sub2_Sub4Array1 = null;
		aClass1_284 = null;
		aClass1_283 = null;
		aClass1_285 = null;
		Class4_Sub1.anIntArray40 = null;
		anIntArray41 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!aa;BII)V")
	public static void method191(@OriginalArg(0) Class2_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(21) int local21;
		@Pc(25) int local25;
		if ((arg1 & 0x100) != 0) {
			local21 = Static13.aClass2_Sub3_Sub1_1.method803();
			local25 = Static13.aClass2_Sub3_Sub1_1.method799();
			arg0.method1784(local25, Static69.anInt2806, local21);
			arg0.anInt2757 = Static69.anInt2806 + 300;
			arg0.anInt2751 = Static13.aClass2_Sub3_Sub1_1.method803();
			arg0.anInt2727 = Static13.aClass2_Sub3_Sub1_1.method799();
		}
		if ((arg1 & 0x10) != 0) {
			arg0.anInt2765 = Static13.aClass2_Sub3_Sub1_1.method792();
			arg0.anInt2726 = Static13.aClass2_Sub3_Sub1_1.method813();
		}
		if ((arg1 & 0x1) != 0) {
			local21 = Static13.aClass2_Sub3_Sub1_1.method813();
			if (local21 == 65535) {
				local21 = -1;
			}
			local25 = Static13.aClass2_Sub3_Sub1_1.method794();
			Static37.method932(local21, local25, arg0);
		}
		if ((arg1 & 0x4) != 0) {
			arg0.anInt2756 = Static13.aClass2_Sub3_Sub1_1.method784();
			if (arg0.anInt2756 == 65535) {
				arg0.anInt2756 = -1;
			}
		}
		if ((arg1 & 0x40) != 0) {
			local21 = Static13.aClass2_Sub3_Sub1_1.method791();
			local25 = Static13.aClass2_Sub3_Sub1_1.method799();
			arg0.method1784(local25, Static69.anInt2806, local21);
			arg0.anInt2757 = Static69.anInt2806 + 300;
			arg0.anInt2751 = Static13.aClass2_Sub3_Sub1_1.method799();
			arg0.anInt2727 = Static13.aClass2_Sub3_Sub1_1.method799();
		}
		if ((arg1 & 0x400) != 0) {
			arg0.anInt2746 = Static13.aClass2_Sub3_Sub1_1.method803();
			arg0.anInt2712 = Static13.aClass2_Sub3_Sub1_1.method803();
			arg0.anInt2725 = Static13.aClass2_Sub3_Sub1_1.method791();
			arg0.anInt2748 = Static13.aClass2_Sub3_Sub1_1.method791();
			arg0.anInt2736 = Static13.aClass2_Sub3_Sub1_1.method784() + Static69.anInt2806;
			arg0.anInt2732 = Static13.aClass2_Sub3_Sub1_1.method827() + Static69.anInt2806;
			arg0.anInt2704 = Static13.aClass2_Sub3_Sub1_1.method799();
			arg0.method1789();
		}
		if ((arg1 & 0x8) != 0) {
			local21 = Static13.aClass2_Sub3_Sub1_1.method792();
			local25 = Static13.aClass2_Sub3_Sub1_1.method799();
			@Pc(206) int local206 = Static13.aClass2_Sub3_Sub1_1.method794();
			@Pc(209) int local209 = Static13.aClass2_Sub3_Sub1_1.anInt1168;
			if (arg0.aClass1_264 != null && arg0.aClass33_1 != null) {
				@Pc(220) long local220 = arg0.aClass1_264.method9();
				@Pc(222) boolean local222 = false;
				if (local25 <= 1) {
					for (@Pc(227) int local227 = 0; local227 < Static71.anInt1968; local227++) {
						if (Static88.aLongArray5[local227] == local220) {
							local222 = true;
							break;
						}
					}
				}
				if (!local222 && Static6.anInt407 == 0) {
					Static98.aClass2_Sub3_5.anInt1168 = 0;
					Static13.aClass2_Sub3_Sub1_1.method785(Static98.aClass2_Sub3_5.aByteArray7, local206);
					Static98.aClass2_Sub3_5.anInt1168 = 0;
					@Pc(270) Class1 local270 = Static89.method1568(Static98.aClass2_Sub3_5).method4();
					arg0.aClass1_2863 = local270.method40();
					arg0.anInt2709 = 150;
					arg0.anInt2745 = local21 & 0xFF;
					arg0.anInt2728 = local21 >> 8;
					if (local25 == 2 || local25 == 3) {
						Static73.method1372(1, local270, Static97.method1655(new Class1[] { Static83.aClass1_2344, arg0.aClass1_264 }));
					} else if (local25 == 1) {
						Static73.method1372(1, local270, Static97.method1655(new Class1[] { Static85.aClass1_2374, arg0.aClass1_264 }));
					} else {
						Static73.method1372(2, local270, arg0.aClass1_264);
					}
				}
			}
			Static13.aClass2_Sub3_Sub1_1.anInt1168 = local206 + local209;
		}
		if ((arg1 & 0x20) != 0) {
			local21 = Static13.aClass2_Sub3_Sub1_1.method791();
			@Pc(363) byte[] local363 = new byte[local21];
			@Pc(368) Class2_Sub3 local368 = new Class2_Sub3(local363);
			Static13.aClass2_Sub3_Sub1_1.method820(local363, local21);
			Static40.aClass2_Sub3Array5[arg2] = local368;
			arg0.method119(local368);
		}
		if ((arg1 & 0x200) != 0) {
			arg0.anInt2718 = Static13.aClass2_Sub3_Sub1_1.method813();
			local21 = Static13.aClass2_Sub3_Sub1_1.method793();
			arg0.anInt2750 = 0;
			arg0.anInt2719 = Static69.anInt2806 + (local21 & 0xFFFF);
			if (arg0.anInt2718 == 65535) {
				arg0.anInt2718 = -1;
			}
			arg0.anInt2758 = 0;
			arg0.anInt2735 = local21 >> 16;
			if (arg0.anInt2719 > Static69.anInt2806) {
				arg0.anInt2758 = -1;
			}
		}
		if ((arg1 & 0x80) == 0) {
			return;
		}
		arg0.aClass1_2863 = Static13.aClass2_Sub3_Sub1_1.method787();
		if (arg0.aClass1_2863.method6(0) == 126) {
			arg0.aClass1_2863 = arg0.aClass1_2863.method1(1);
			Static73.method1372(2, arg0.aClass1_2863, arg0.aClass1_264);
		} else if (arg0 == Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1) {
			Static73.method1372(2, arg0.aClass1_2863, arg0.aClass1_264);
		}
		arg0.anInt2709 = 150;
		arg0.anInt2728 = 0;
		arg0.anInt2745 = 0;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)Lclient!he;")
	public static Class2_Sub1_Sub9 method192(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub9 local10 = (Class2_Sub1_Sub9) Static41.aClass11_13.method431((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(25) byte[] local25 = Static42.aClass8_15.method1684(arg0, 12);
		local10 = new Class2_Sub1_Sub9();
		if (local25 != null) {
			local10.method981(new Class2_Sub3(local25));
		}
		local10.method978();
		Static41.aClass11_13.method430((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!qd;)Z")
	public static boolean method193(@OriginalArg(1) Class2_Sub1_Sub14 arg0) {
		@Pc(13) int local13 = arg0.anInt2169;
		if (local13 >= 1 && local13 <= 200 || !(local13 < 701 || local13 > 900)) {
			if (local13 >= 801) {
				local13 -= 701;
			} else if (local13 >= 701) {
				local13 -= 601;
			} else if (local13 < 101) {
				local13--;
			} else {
				local13 -= 101;
			}
			Static29.method758(0, Static111.aClass1_2899, 0, 0, 13, Static97.method1655(new Class1[] { Static47.aClass1_1511, Static100.aClass1Array25[local13] }));
			Static29.method758(0, Static94.aClass1_2468, 0, 0, 18, Static97.method1655(new Class1[] { Static47.aClass1_1511, Static100.aClass1Array25[local13] }));
			return true;
		} else if (local13 >= 401 && local13 <= 500) {
			Static29.method758(0, Static111.aClass1_2899, 0, 0, 35, Static97.method1655(new Class1[] { Static47.aClass1_1511, arg0.aClass1_2333 }));
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!a;Lclient!ba;)I")
	public static int method194(@OriginalArg(1) Class1 arg0, @OriginalArg(2) Class2_Sub3 arg1) {
		@Pc(11) int local11 = arg1.anInt1168;
		arg1.method832(arg0.anInt23);
		arg1.anInt1168 += Static79.aClass67_1.method1803(0, arg1.anInt1168, arg0.anInt23, arg0.aByteArray1, arg1.aByteArray7);
		return arg1.anInt1168 - local11;
	}
}
