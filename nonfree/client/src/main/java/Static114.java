import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!ue", name = "h", descriptor = "Lclient!gd;")
	public static Class27 aClass27_41;

	@OriginalMember(owner = "client!ue", name = "i", descriptor = "Lclient!j;")
	public static Class4 aClass4_1;

	@OriginalMember(owner = "client!ue", name = "b", descriptor = "Lclient!na;")
	public static Class53 aClass53_1302 = Static109.method1737(" steht bereits auf Ihrer Freunde)2Liste(Q");

	@OriginalMember(owner = "client!ue", name = "c", descriptor = "Lclient!na;")
	public static Class53 aClass53_1303 = Static109.method1737("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!ue", name = "d", descriptor = "Lclient!na;")
	public static Class53 aClass53_1304 = Static109.method1737("M");

	@OriginalMember(owner = "client!ue", name = "e", descriptor = "Lclient!na;")
	public static Class53 aClass53_1305 = Static109.method1737("mapback");

	@OriginalMember(owner = "client!ue", name = "g", descriptor = "Lclient!na;")
	public static Class53 aClass53_1306 = Static109.method1737("@or1@");

	@OriginalMember(owner = "client!ue", name = "j", descriptor = "I")
	public static int anInt2611 = 0;

	@OriginalMember(owner = "client!ue", name = "k", descriptor = "Lclient!na;")
	public static Class53 aClass53_1307 = null;

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(I[Lclient!vb;IIIIIIIB)V")
	public static void method1811(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub15[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class3_Sub1_Sub15 local9 = arg1[local3];
			if (local9 != null && (local9.anInt2707 == 0 || local9.aBoolean117) && local9 != null && local9.anInt2704 == arg4 && !Static75.method1250(local9)) {
				@Pc(44) int local44 = local9.anInt2677 + arg2 - arg6;
				@Pc(51) int local51 = arg2 >= local44 ? arg2 : local44;
				@Pc(59) int local59 = local9.anInt2708 + arg3 - arg5;
				@Pc(70) int local70 = local59 > arg3 ? local59 : arg3;
				@Pc(75) int local75 = local9.anInt2703 + local59;
				@Pc(80) int local80 = local9.anInt2727 + local44;
				@Pc(91) int local91 = local80 < arg0 ? local80 : arg0;
				@Pc(102) int local102 = arg7 <= local75 ? arg7 : local75;
				if (local9.anInt2707 == 0) {
					method1811(local91, arg1, local51, local70, local9.anInt2686, local9.anInt2724 + local70 - local59, local9.anInt2691 + local51 + -local44, local102, arg8);
					if (local9.aClass3_Sub1_Sub15Array2 != null) {
						method1811(local91, local9.aClass3_Sub1_Sub15Array2, local51, local70, local9.anInt2686, local70 + local9.anInt2724 - local59, local9.anInt2691 + local51 + -local44, local102, arg8);
					}
				}
				if (local9.aBoolean117) {
					@Pc(182) boolean local182;
					if (Static99.anInt2348 >= local51 && Static105.anInt2433 >= local70 && Static99.anInt2348 < local91 && Static105.anInt2433 < local102) {
						local182 = true;
					} else {
						local182 = false;
					}
					@Pc(188) boolean local188 = false;
					if (Static73.anInt1832 == 1 && Static56.anInt1504 >= local51 && local70 <= Static54.anInt2854 && local91 > Static56.anInt1504 && Static54.anInt2854 < local102) {
						local188 = true;
					}
					@Pc(211) boolean local211 = false;
					if (Static53.anInt2087 == 1 && local182) {
						local211 = true;
					}
					if (local188 && Static75.aClass3_Sub1_Sub15_4 == null && (arg8 & 0x200) != 0 && !Static94.aBoolean93 && Static16.method237(local9) != null) {
						Static32.anInt1081 = 0;
						Static85.aBoolean78 = false;
						Static75.aClass3_Sub1_Sub15_4 = local9;
						Static121.anInt2824 = Static99.anInt2348;
						Static50.anInt2788 = Static105.anInt2433;
					}
					if (Static75.aClass3_Sub1_Sub15_4 != null || Static94.aBoolean93) {
						local188 = false;
						local182 = false;
						local211 = false;
					}
					if (!local9.aBoolean115 && local188 && (arg8 & 0x1) != 0) {
						local9.aBoolean115 = true;
						if (local9.anObjectArray19 != null) {
							Static12.method188(0, Static54.anInt2854 - local59, local9, Static56.anInt1504 - local44, null, local9.anObjectArray19);
						}
					}
					if (local9.aBoolean115 && local211 && (arg8 & 0x4) != 0 && local9.anObjectArray12 != null) {
						Static12.method188(0, Static105.anInt2433 - local59, local9, Static99.anInt2348 - local44, null, local9.anObjectArray12);
					}
					if (local9.aBoolean115 && !local211 && (arg8 & 0x2) != 0) {
						local9.aBoolean115 = false;
						if (local9.anObjectArray4 != null) {
							Static12.method188(0, Static105.anInt2433 - local59, local9, Static99.anInt2348 - local44, null, local9.anObjectArray4);
						}
					}
					if (local211 && (arg8 & 0x8) != 0 && local9.anObjectArray3 != null) {
						Static12.method188(0, Static105.anInt2433 - local59, local9, Static99.anInt2348 - local44, null, local9.anObjectArray3);
					}
					if (!local9.aBoolean123 && local182 && (arg8 & 0x10) != 0) {
						local9.aBoolean123 = true;
						if (local9.anObjectArray21 != null) {
							Static12.method188(0, Static105.anInt2433 - local59, local9, Static99.anInt2348 - local44, null, local9.anObjectArray21);
						}
					}
					if (local9.aBoolean123 && local182 && (arg8 & 0x40) != 0 && local9.anObjectArray15 != null) {
						Static12.method188(0, Static105.anInt2433 - local59, local9, Static99.anInt2348 - local44, null, local9.anObjectArray15);
					}
					if (local9.aBoolean123 && !local182 && (arg8 & 0x20) != 0) {
						local9.aBoolean123 = false;
						if (local9.anObjectArray10 != null) {
							Static12.method188(0, Static105.anInt2433 - local59, local9, Static99.anInt2348 - local44, null, local9.anObjectArray10);
						}
					}
					if (local9.anObjectArray20 != null && (arg8 & 0x80) != 0) {
						Static12.method188(0, 0, local9, 0, null, local9.anObjectArray20);
					}
					if (local182 && Static99.anInt2346 != 0 && local9.anObjectArray16 != null && (arg8 & 0x400) != 0) {
						Static12.method188(0, Static99.anInt2346, local9, 0, null, local9.anObjectArray16);
					}
					if ((arg8 & 0x100) != 0) {
						if (Static44.anInt1240 > local9.anInt2726 && local9.anObjectArray9 != null) {
							Static12.method188(0, 0, local9, 0, null, local9.anObjectArray9);
						}
						if (Static103.anInt2416 > local9.anInt2726 && local9.anObjectArray5 != null) {
							Static12.method188(0, 0, local9, 0, null, local9.anObjectArray5);
						}
						if (Static80.anInt2033 > local9.anInt2726 && local9.anObjectArray17 != null) {
							Static12.method188(0, 0, local9, 0, null, local9.anObjectArray17);
						}
						local9.anInt2726 = Static27.anInt843;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(B)V")
	public static void method1812() {
		aClass53_1302 = null;
		aClass53_1307 = null;
		aClass4_1 = null;
		aClass53_1306 = null;
		aClass53_1303 = null;
		aClass53_1304 = null;
		aClass27_41 = null;
		aClass53_1305 = null;
	}

	@OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIZ)V")
	public static void method1813(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 1) {
			Static115.aClass3_Sub7_Sub1_3.method662(156);
			Static115.aClass3_Sub7_Sub1_3.method642(arg1);
			Static115.aClass3_Sub7_Sub1_3.method622(arg2);
		}
		if (arg0 == 2) {
			Static115.aClass3_Sub7_Sub1_3.method662(157);
			Static115.aClass3_Sub7_Sub1_3.method642(arg1);
			Static115.aClass3_Sub7_Sub1_3.method622(arg2);
		}
		if (arg0 == 3) {
			Static115.aClass3_Sub7_Sub1_3.method662(100);
			Static115.aClass3_Sub7_Sub1_3.method642(arg1);
			Static115.aClass3_Sub7_Sub1_3.method622(arg2);
		}
		if (arg0 == 4) {
			Static115.aClass3_Sub7_Sub1_3.method662(61);
			Static115.aClass3_Sub7_Sub1_3.method642(arg1);
			Static115.aClass3_Sub7_Sub1_3.method622(arg2);
		}
		if (arg0 == 5) {
			Static115.aClass3_Sub7_Sub1_3.method662(34);
			Static115.aClass3_Sub7_Sub1_3.method642(arg1);
			Static115.aClass3_Sub7_Sub1_3.method622(arg2);
		}
		if (arg0 == 6) {
			Static115.aClass3_Sub7_Sub1_3.method662(106);
			Static115.aClass3_Sub7_Sub1_3.method642(arg1);
			Static115.aClass3_Sub7_Sub1_3.method622(arg2);
		}
		if (arg0 == 7) {
			Static115.aClass3_Sub7_Sub1_3.method662(218);
			Static115.aClass3_Sub7_Sub1_3.method642(arg1);
			Static115.aClass3_Sub7_Sub1_3.method622(arg2);
		}
		if (arg0 == 8) {
			Static115.aClass3_Sub7_Sub1_3.method662(1);
			Static115.aClass3_Sub7_Sub1_3.method642(arg1);
			Static115.aClass3_Sub7_Sub1_3.method622(arg2);
		}
		if (arg0 == 9) {
			Static115.aClass3_Sub7_Sub1_3.method662(249);
			Static115.aClass3_Sub7_Sub1_3.method642(arg1);
			Static115.aClass3_Sub7_Sub1_3.method622(arg2);
		}
		if (arg0 == 10) {
			Static115.aClass3_Sub7_Sub1_3.method662(242);
			Static115.aClass3_Sub7_Sub1_3.method642(arg1);
			Static115.aClass3_Sub7_Sub1_3.method622(arg2);
		}
		@Pc(222) Class3_Sub1_Sub15 local222 = Static38.method782(arg2, arg1);
		if (local222 != null && local222.anObjectArray11 != null) {
			Static12.method188(arg0, 0, local222, 0, null, local222.anObjectArray11);
		}
	}
}
