import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static82 {

	@OriginalMember(owner = "client!oc", name = "G", descriptor = "Lclient!c;")
	public static Class10 aClass10_22;

	@OriginalMember(owner = "client!oc", name = "N", descriptor = "[[Lclient!sa;")
	public static Class4_Sub14[][] aClass4_Sub14ArrayArray1;

	@OriginalMember(owner = "client!oc", name = "Q", descriptor = "Lclient!od;")
	public static Class60 aClass60_811 = Static41.method597("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "Lclient!od;")
	public static Class60 aClass60_812 = Static41.method597("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!oc", name = "V", descriptor = "Lclient!od;")
	public static Class60 aClass60_813 = Static41.method597("(Udns");

	@OriginalMember(owner = "client!oc", name = "ab", descriptor = "[I")
	public static int[] anIntArray226 = new int[500];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!od;Lclient!c;Lclient!od;I)[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] method1299(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(2) Class60 arg2) {
		@Pc(4) int local4 = arg1.method1770(arg0);
		@Pc(23) int local23 = arg1.method1785(arg2, local4);
		return Static97.method1575(arg1, local23, local4);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IB)Z")
	public static boolean method1300(@OriginalArg(0) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
	public static void method1301() {
		aClass60_811 = null;
		anIntArray226 = null;
		aClass4_Sub14ArrayArray1 = null;
		aClass60_812 = null;
		aClass10_22 = null;
		aClass60_813 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBI)V")
	public static void method1302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static29.anInt897 != 0 && Static29.anInt897 != 3 || Static97.anInt2284 != 1) {
			return;
		}
		@Pc(27) int local27 = Static122.anInt2791 - arg1 - 25;
		@Pc(33) int local33 = Static63.anInt1591 - arg0 - 5;
		if (local27 < 0 || local33 < 0 || local27 >= 146 || local33 >= 151) {
			return;
		}
		local27 -= 73;
		local33 -= 75;
		@Pc(58) int local58 = Static79.anInt1896 + Static62.anInt1585 & 0x7FF;
		@Pc(62) int local62 = Class4_Sub3_Sub6_Sub4.anIntArray301[local58];
		@Pc(70) int local70 = local62 * (Static116.anInt2717 + 256) >> 8;
		@Pc(74) int local74 = Class4_Sub3_Sub6_Sub4.anIntArray304[local58];
		@Pc(82) int local82 = local74 * (Static116.anInt2717 + 256) >> 8;
		@Pc(92) int local92 = local82 * local27 + local70 * local33 >> 11;
		@Pc(100) int local100 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440 + local92 >> 7;
		@Pc(111) int local111 = local33 * local82 - local27 * local70 >> 11;
		@Pc(118) int local118 = Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407 - local111 >> 7;
		@Pc(138) boolean local138 = Static36.method564(local118, 0, 0, 0, true, Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray137[0], Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anIntArray135[0], 0, 0, local100, 1);
		if (!local138) {
			return;
		}
		Static14.aClass4_Sub9_Sub1_1.method819(local27);
		Static14.aClass4_Sub9_Sub1_1.method819(local33);
		Static14.aClass4_Sub9_Sub1_1.method786(Static79.anInt1896);
		Static14.aClass4_Sub9_Sub1_1.method819(57);
		Static14.aClass4_Sub9_Sub1_1.method819(Static62.anInt1585);
		Static14.aClass4_Sub9_Sub1_1.method819(Static116.anInt2717);
		Static14.aClass4_Sub9_Sub1_1.method819(89);
		Static14.aClass4_Sub9_Sub1_1.method786(Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1440);
		Static14.aClass4_Sub9_Sub1_1.method786(Static65.aClass4_Sub3_Sub1_Sub2_Sub1_1.anInt1407);
		Static14.aClass4_Sub9_Sub1_1.method819(Static21.anInt749);
		Static14.aClass4_Sub9_Sub1_1.method819(63);
		return;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IILclient!od;)V")
	public static void method1303(@OriginalArg(1) int arg0, @OriginalArg(2) Class60 arg1) {
		Static14.aClass4_Sub9_Sub1_1.method826(191);
		Static14.aClass4_Sub9_Sub1_1.method767(arg0);
		Static14.aClass4_Sub9_Sub1_1.method792(arg1.method1325());
	}

	@OriginalMember(owner = "client!oc", name = "f", descriptor = "(I)V")
	public static void method1304() {
		if (!Static66.aBoolean58) {
			return;
		}
		Static74.aClass4_Sub3_Sub6_Sub2Array8 = null;
		Static80.anIntArray222 = null;
		Static77.anIntArray212 = null;
		Static49.anIntArray123 = null;
		Static107.aClass4_Sub3_Sub6_Sub2Array9 = null;
		Static9.aClass4_Sub3_Sub6_Sub2Array1 = null;
		Static75.anIntArray127 = null;
		Static84.anIntArray229 = null;
		Static109.aClass4_Sub3_Sub6_Sub2_5 = null;
		Static86.aClass4_Sub3_Sub6_Sub2_3 = null;
		Static97.aClass4_Sub3_Sub6_Sub3_4 = null;
		Static71.aClass4_Sub3_Sub6_Sub2Array7 = null;
		Static97.aClass4_Sub3_Sub6_Sub2_4 = null;
		Static51.aClass4_Sub3_Sub6_Sub3Array7 = null;
		Static4.aClass4_Sub3_Sub6_Sub2_1 = null;
		Static131.aClass4_Sub3_Sub6_Sub3_6 = null;
		Static12.anIntArray328 = null;
		Static107.aClass4_Sub3_Sub6_Sub2Array10 = null;
		Static53.anIntArray146 = null;
		Static110.anIntArray331 = null;
		Static30.method480();
		Static14.method285(true);
		Static66.aBoolean58 = false;
	}

	@OriginalMember(owner = "client!oc", name = "g", descriptor = "(I)V")
	public static void method1305() {
		try {
			if (Static105.aClass52_1 == null) {
				Static105.aClass52_1 = new Class52(Static105.aClass81_4, Static12.method1761(new Class60[] { Static24.aClass60_269, Static23.aClass60_251, Static121.aClass60_1083 }).method1313());
			} else {
				@Pc(44) byte[] local44 = Static105.aClass52_1.method1232();
				if (local44 != null) {
					@Pc(51) Class4_Sub9 local51 = new Class4_Sub9(local44);
					Static133.anInt2968 = local51.method816();
					Static77.aClass22Array1 = new Class22[Static133.anInt2968];
					for (@Pc(60) int local60 = 0; local60 < Static133.anInt2968; local60++) {
						@Pc(70) Class22 local70 = Static77.aClass22Array1[local60] = new Class22();
						@Pc(74) int local74 = local51.method816();
						local70.anInt915 = local74 & 0x7FFF;
						local70.aBoolean37 = (local74 & 0x8000) != 0;
						local70.aClass60_317 = local51.method776();
						local70.anInt916 = local51.method774();
						local70.anInt911 = local60;
						local70.anInt914 = Static16.method310(local70.aClass60_317);
					}
					Static110.method1822(0, Static77.aClass22Array1, Static63.anIntArray179, Static77.aClass22Array1.length - 1, Static3.anIntArray4);
					Static47.aBoolean42 = true;
					Static105.aClass52_1 = null;
				}
			}
		} catch (@Pc(134) Exception local134) {
			local134.printStackTrace();
			Static105.aClass52_1 = null;
		}
	}

	@OriginalMember(owner = "client!oc", name = "h", descriptor = "(I)V")
	public static void method1306() {
		try {
			if (Static96.anInt2272 == 0) {
				if (Static72.aClass37_6 != null) {
					Static72.aClass37_6.method877();
					Static72.aClass37_6 = null;
				}
				Static66.aBoolean59 = false;
				Static39.anInt1051 = 0;
				Static96.anInt2272 = 1;
				Static118.aClass43_8 = null;
			}
			if (Static96.anInt2272 == 1) {
				if (Static118.aClass43_8 == null) {
					Static118.aClass43_8 = Static105.aClass81_4.method1939(Static80.anInt1907, Static63.aString2);
				}
				if (Static118.aClass43_8.anInt1565 == 2) {
					throw new IOException();
				}
				if (Static118.aClass43_8.anInt1565 == 1) {
					Static72.aClass37_6 = new Class37((Socket) Static118.aClass43_8.anObject2, Static105.aClass81_4);
					Static118.aClass43_8 = null;
					Static96.anInt2272 = 2;
				}
			}
			if (Static96.anInt2272 == 2) {
				@Pc(75) long local75 = Static21.aLong24 = Static68.aClass60_670.method1325();
				@Pc(82) int local82 = (int) (local75 >> 16 & 0x1FL);
				Static14.aClass4_Sub9_Sub1_1.anInt1312 = 0;
				Static14.aClass4_Sub9_Sub1_1.method819(14);
				Static14.aClass4_Sub9_Sub1_1.method819(local82);
				Static72.aClass37_6.method875(2, Static14.aClass4_Sub9_Sub1_1.aByteArray6);
				Static96.anInt2272 = 3;
				Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
			}
			@Pc(122) int local122;
			if (Static96.anInt2272 == 3) {
				if (Static85.aClass11_3 != null) {
					Static85.aClass11_3.method1842();
				}
				if (Static113.aClass11_2 != null) {
					Static113.aClass11_2.method1842();
				}
				local122 = Static72.aClass37_6.method870();
				if (Static85.aClass11_3 != null) {
					Static85.aClass11_3.method1842();
				}
				if (Static113.aClass11_2 != null) {
					Static113.aClass11_2.method1842();
				}
				if (local122 != 0) {
					Static41.method595(local122);
					return;
				}
				Static96.anInt2272 = 4;
				Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
			}
			if (Static96.anInt2272 == 4) {
				if (Static96.aClass4_Sub9_Sub1_2.anInt1312 < 8) {
					local122 = Static72.aClass37_6.method876();
					if (8 - Static96.aClass4_Sub9_Sub1_2.anInt1312 < local122) {
						local122 = 8 - Static96.aClass4_Sub9_Sub1_2.anInt1312;
					}
					if (local122 > 0) {
						Static72.aClass37_6.method873(local122, Static96.aClass4_Sub9_Sub1_2.anInt1312, Static96.aClass4_Sub9_Sub1_2.aByteArray6);
						Static96.aClass4_Sub9_Sub1_2.anInt1312 += local122;
					}
				}
				if (Static96.aClass4_Sub9_Sub1_2.anInt1312 == 8) {
					Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
					Static129.aLong44 = Static96.aClass4_Sub9_Sub1_2.method783();
					Static96.anInt2272 = 5;
				}
			}
			if (Static96.anInt2272 == 5) {
				@Pc(207) int[] local207 = new int[4];
				Static14.aClass4_Sub9_Sub1_1.anInt1312 = 0;
				local207[2] = (int) (Static129.aLong44 >> 32);
				local207[1] = (int) (Math.random() * 9.9999999E7D);
				local207[3] = (int) Static129.aLong44;
				local207[0] = (int) (Math.random() * 9.9999999E7D);
				Static14.aClass4_Sub9_Sub1_1.method819(10);
				Static14.aClass4_Sub9_Sub1_1.method808(local207[0]);
				Static14.aClass4_Sub9_Sub1_1.method808(local207[1]);
				Static14.aClass4_Sub9_Sub1_1.method808(local207[2]);
				Static14.aClass4_Sub9_Sub1_1.method808(local207[3]);
				Static14.aClass4_Sub9_Sub1_1.method805(Static68.aClass60_670.method1325());
				Static14.aClass4_Sub9_Sub1_1.method788(Static68.aClass60_665);
				Static14.aClass4_Sub9_Sub1_1.method779(Static28.aBigInteger3, Static72.aBigInteger2);
				Static115.aClass4_Sub9_Sub1_3.anInt1312 = 0;
				if (Static120.anInt2757 == 40) {
					Static115.aClass4_Sub9_Sub1_3.method819(18);
				} else {
					Static115.aClass4_Sub9_Sub1_3.method819(16);
				}
				Static115.aClass4_Sub9_Sub1_3.method819(Static14.aClass4_Sub9_Sub1_1.anInt1312 + 93);
				Static115.aClass4_Sub9_Sub1_3.method808(465);
				Static115.aClass4_Sub9_Sub1_3.method819(Static8.aBoolean3 ? 1 : 0);
				Static45.method628(Static115.aClass4_Sub9_Sub1_3);
				Static115.aClass4_Sub9_Sub1_3.method808(Static42.aClass10_Sub1_7.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static24.aClass10_Sub1_5.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static69.aClass10_Sub1_12.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static125.aClass10_Sub1_20.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static116.aClass10_Sub1_19.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static127.aClass10_Sub1_8.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static10.aClass10_Sub1_3.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static28.aClass10_Sub1_15.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static16.aClass10_Sub1_4.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static48.aClass10_Sub1_9.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static68.aClass10_Sub1_11.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static79.aClass10_Sub1_14.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static106.aClass10_Sub1_16.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static128.aClass10_Sub1_21.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static108.aClass10_Sub1_18.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method808(Static107.aClass10_Sub1_17.anInt2562);
				Static115.aClass4_Sub9_Sub1_3.method824(Static14.aClass4_Sub9_Sub1_1.aByteArray6, Static14.aClass4_Sub9_Sub1_1.anInt1312);
				Static72.aClass37_6.method875(Static115.aClass4_Sub9_Sub1_3.anInt1312, Static115.aClass4_Sub9_Sub1_3.aByteArray6);
				Static14.aClass4_Sub9_Sub1_1.method827(local207);
				for (@Pc(423) int local423 = 0; local423 < 4; local423++) {
					local207[local423] += 50;
				}
				Static96.aClass4_Sub9_Sub1_2.method827(local207);
				Static96.anInt2272 = 6;
			}
			if (Static96.anInt2272 == 6 && Static72.aClass37_6.method876() > 0) {
				local122 = Static72.aClass37_6.method870();
				if (local122 == 21 && Static120.anInt2757 == 20) {
					Static96.anInt2272 = 7;
				} else if (local122 == 2) {
					Static96.anInt2272 = 9;
				} else if (local122 == 15 && Static120.anInt2757 == 40) {
					Static33.method506();
					return;
				} else if (local122 == 23 && Static12.anInt2558 < 1) {
					Static96.anInt2272 = 0;
					Static12.anInt2558++;
				} else {
					Static41.method595(local122);
					return;
				}
			}
			if (Static96.anInt2272 == 7 && Static72.aClass37_6.method876() > 0) {
				Static51.anInt1357 = Static72.aClass37_6.method870() * 60 + 180;
				Static96.anInt2272 = 8;
			}
			if (Static96.anInt2272 == 8) {
				Static39.anInt1051 = 0;
				Static47.method649(Static36.aClass60_363, Static12.method1761(new Class60[] { Static65.method1051(Static51.anInt1357 / 60), Static68.aClass60_687 }), Static63.aClass60_609);
				if (--Static51.anInt1357 <= 0) {
					Static96.anInt2272 = 0;
				}
			} else {
				if (Static96.anInt2272 == 9 && Static72.aClass37_6.method876() >= 8) {
					Static117.anInt2726 = Static72.aClass37_6.method870();
					Static125.aBoolean122 = Static72.aClass37_6.method870() == 1;
					Static94.anInt2216 = Static72.aClass37_6.method870();
					Static94.anInt2216 <<= 0x8;
					Static94.anInt2216 += Static72.aClass37_6.method870();
					Static20.anInt703 = Static72.aClass37_6.method870();
					Static72.aClass37_6.method873(1, 0, Static96.aClass4_Sub9_Sub1_2.aByteArray6);
					Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
					Static40.anInt1058 = Static96.aClass4_Sub9_Sub1_2.method831();
					Static72.aClass37_6.method873(2, 0, Static96.aClass4_Sub9_Sub1_2.aByteArray6);
					Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
					Static7.anInt79 = Static96.aClass4_Sub9_Sub1_2.method816();
					Static96.anInt2272 = 10;
				}
				if (Static96.anInt2272 != 10) {
					Static39.anInt1051++;
					if (Static39.anInt1051 > 2000) {
						if (Static12.anInt2558 < 1) {
							if (Static80.anInt1907 == Static23.anInt803) {
								Static80.anInt1907 = Static51.anInt1355;
							} else {
								Static80.anInt1907 = Static23.anInt803;
							}
							Static12.anInt2558++;
							Static96.anInt2272 = 0;
						} else {
							Static41.method595(-3);
						}
					}
				} else if (Static72.aClass37_6.method876() >= Static7.anInt79) {
					Static96.aClass4_Sub9_Sub1_2.anInt1312 = 0;
					Static72.aClass37_6.method873(Static7.anInt79, 0, Static96.aClass4_Sub9_Sub1_2.aByteArray6);
					Static4.method49();
					Static121.anInt2776 = -1;
					Static43.method620(false);
					Static40.anInt1058 = -1;
				}
			}
		} catch (@Pc(718) IOException local718) {
			if (Static12.anInt2558 < 1) {
				Static96.anInt2272 = 0;
				if (Static23.anInt803 == Static80.anInt1907) {
					Static80.anInt1907 = Static51.anInt1355;
				} else {
					Static80.anInt1907 = Static23.anInt803;
				}
				Static12.anInt2558++;
			} else {
				Static41.method595(-2);
			}
		}
	}
}
