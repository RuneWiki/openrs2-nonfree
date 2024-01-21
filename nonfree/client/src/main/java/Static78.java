import java.awt.Color;
import java.awt.image.ImageObserver;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!kc;")
	public static Class11 aClass11_17;

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "[I")
	public static int[] anIntArray320;

	@OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
	public static int anInt2284;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	public static int anInt2278 = 0;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
	public static int anInt2283 = 0;

	@OriginalMember(owner = "client!pb", name = "i", descriptor = "Lclient!lc;")
	public static Class31 aClass31_789 = Static56.method1206(" with @cya@");

	@OriginalMember(owner = "client!pb", name = "j", descriptor = "Lclient!lc;")
	public static Class31 aClass31_790 = Static56.method1206("backtop1");

	@OriginalMember(owner = "client!pb", name = "k", descriptor = "[I")
	public static int[] anIntArray321 = new int[50];

	@OriginalMember(owner = "client!pb", name = "n", descriptor = "[I")
	public static int[] anIntArray322 = new int[2048];

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "[[[Lclient!nb;")
	public static Class36[][][] aClass36ArrayArrayArray1 = new Class36[4][104][104];

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Color;Lclient!lc;II)V")
	public static void method1428(@OriginalArg(0) Color arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(3) int arg2) {
		if (Static49.aBoolean143) {
			Static49.aBoolean143 = false;
			Static18.aGraphics1.setColor(Color.black);
			Static18.aGraphics1.fillRect(0, 0, Static76.anInt2255, Static95.anInt2571);
		}
		if (arg0 == null) {
			arg0 = new Color(140, 17, 17);
		}
		if (Static42.anImage4 == null) {
			Static42.anImage4 = Static70.method1381().createImage(304, 34);
		}
		if (Static105.aGraphics2 == null) {
			Static105.aGraphics2 = Static42.anImage4.getGraphics();
		}
		Static105.aGraphics2.setColor(arg0);
		Static105.aGraphics2.drawRect(0, 0, 303, 33);
		Static105.aGraphics2.fillRect(2, 2, arg2 * 3, 30);
		Static105.aGraphics2.setColor(Color.black);
		Static105.aGraphics2.drawRect(1, 1, 301, 31);
		Static105.aGraphics2.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
		Static105.aGraphics2.setFont(Static28.aFont1);
		Static105.aGraphics2.setColor(Color.white);
		arg1.method1203((304 - arg1.method1214(Static80.aFontMetrics2)) / 2, Static105.aGraphics2);
		Static18.aGraphics1.drawImage(Static42.anImage4, Static76.anInt2255 / 2 - 152, Static95.anInt2571 / 2 + -18, null);
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public static void method1429() {
		anIntArray320 = null;
		anIntArray321 = null;
		aClass31_789 = null;
		aClass11_17 = null;
		aClass36ArrayArrayArray1 = null;
		anIntArray322 = null;
		aClass31_790 = null;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLclient!kc;)I")
	public static int method1430(@OriginalArg(1) Class11 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method330(Static105.aClass31_949, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static25.aClass31_364, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static74.aClass31_778, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static68.aClass31_769, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static23.aClass31_323, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static28.aClass31_385, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static24.aClass31_345, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static47.aClass31_611, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static33.aClass31_443, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static40.aClass31_713, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(aClass31_790, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static80.aClass31_309, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static54.aClass31_640, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static61.aClass31_737, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static56.aClass31_668, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static12.aClass31_171, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static39.aClass31_536, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static102.aClass31_213, Static69.aClass31_771)) {
			local5++;
		}
		if (arg0.method330(Static100.aClass31_937, Static69.aClass31_771)) {
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
	public static void method1431() {
		if (Static40.anInt2035 > 0) {
			Static40.anInt2035--;
		}
		if (Static19.anInt851 > 1) {
			Static19.anInt851--;
		}
		if (Static45.aBoolean85) {
			Static45.aBoolean85 = false;
			Static101.method1731();
			return;
		}
		for (@Pc(27) int local27 = 0; local27 < 100 && Static67.method1354(); local27++) {
		}
		if (Static103.anInt2775 != 30 && Static103.anInt2775 != 35) {
			return;
		}
		@Pc(64) int local64;
		if (Static42.aBoolean84 && Static103.anInt2775 == 30) {
			Static49.anInt2693 = 0;
			Static68.anInt2205 = 0;
			while (Static67.method1360()) {
			}
			for (local64 = 0; local64 < Static103.aBooleanArray57.length; local64++) {
				Static103.aBooleanArray57[local64] = false;
			}
		}
		Static45.method1064(Static20.aClass2_Sub6_Sub1_11);
		@Pc(86) Object local86 = Static14.aClass48_1.anObject3;
		@Pc(118) int local118;
		@Pc(107) int local107;
		@Pc(120) int local120;
		@Pc(135) int local135;
		synchronized (Static14.aClass48_1.anObject3) {
			if (!Static17.aBoolean51) {
				Static14.aClass48_1.anInt2310 = 0;
			} else if (Static49.anInt2693 != 0 || Static14.aClass48_1.anInt2310 >= 40) {
				Static20.aClass2_Sub6_Sub1_11.method684(94);
				local107 = 0;
				Static20.aClass2_Sub6_Sub1_11.method637(0);
				local118 = Static20.aClass2_Sub6_Sub1_11.anInt952;
				@Pc(156) int local156;
				for (local120 = 0; Static14.aClass48_1.anInt2310 > local120 && Static20.aClass2_Sub6_Sub1_11.anInt952 - local118 < 240; local120++) {
					local107++;
					local135 = Static14.aClass48_1.anIntArray327[local120];
					if (local135 < 0) {
						local135 = 0;
					} else if (local135 > 764) {
						local135 = 764;
					}
					local156 = Static14.aClass48_1.anIntArray328[local120];
					if (local156 < 0) {
						local156 = 0;
					} else if (local156 > 502) {
						local156 = 502;
					}
					@Pc(175) int local175 = local135 + local156 * 765;
					if (Static14.aClass48_1.anIntArray328[local120] == -1 && Static14.aClass48_1.anIntArray327[local120] == -1) {
						local156 = -1;
						local135 = -1;
						local175 = 524287;
					}
					if (local135 != Static51.anInt1774 || Static101.anInt2755 != local156) {
						@Pc(220) int local220 = local135 - Static51.anInt1774;
						@Pc(225) int local225 = local156 - Static101.anInt2755;
						Static51.anInt1774 = local135;
						Static101.anInt2755 = local156;
						if (Static11.anInt510 < 8 && local220 >= -32 && local220 <= 31 && local225 >= -32 && local225 <= 31) {
							local220 += 32;
							local225 += 32;
							Static20.aClass2_Sub6_Sub1_11.method648((Static11.anInt510 << 12) + (local220 << 6) + local225);
							Static11.anInt510 = 0;
						} else if (Static11.anInt510 < 8) {
							Static20.aClass2_Sub6_Sub1_11.method677((Static11.anInt510 << 19) + local175 + 8388608);
							Static11.anInt510 = 0;
						} else {
							Static20.aClass2_Sub6_Sub1_11.method666(local175 + (Static11.anInt510 << 19) - 1073741824);
							Static11.anInt510 = 0;
						}
					} else if (Static11.anInt510 < 2047) {
						Static11.anInt510++;
					}
				}
				Static20.aClass2_Sub6_Sub1_11.method659(Static20.aClass2_Sub6_Sub1_11.anInt952 - local118);
				if (Static14.aClass48_1.anInt2310 <= local107) {
					Static14.aClass48_1.anInt2310 = 0;
				} else {
					Static14.aClass48_1.anInt2310 -= local107;
					for (local156 = 0; local156 < Static14.aClass48_1.anInt2310; local156++) {
						Static14.aClass48_1.anIntArray327[local156] = Static14.aClass48_1.anIntArray327[local156 + local107];
						Static14.aClass48_1.anIntArray328[local156] = Static14.aClass48_1.anIntArray328[local107 + local156];
					}
				}
			}
		}
		if (Static49.anInt2693 != 0) {
			local107 = Static105.anInt2783;
			@Pc(392) long local392 = (Static66.aLong58 - Static24.aLong31) / 50L;
			Static24.aLong31 = Static66.aLong58;
			local118 = Static15.anInt649;
			if (local107 < 0) {
				local107 = 0;
			} else if (local107 > 764) {
				local107 = 764;
			}
			if (local392 > 4095L) {
				local392 = 4095L;
			}
			if (local118 < 0) {
				local118 = 0;
			} else if (local118 > 502) {
				local118 = 502;
			}
			@Pc(428) byte local428 = 0;
			local120 = local118 * 765 + local107;
			local135 = (int) local392;
			if (Static49.anInt2693 == 2) {
				local428 = 1;
			}
			Static20.aClass2_Sub6_Sub1_11.method684(55);
			Static20.aClass2_Sub6_Sub1_11.method630((local135 << 20) + (local428 << 19) + local120);
		}
		if (Static14.anInt628 > 0) {
			Static14.anInt628--;
		}
		if (Static103.aBooleanArray57[96] || Static103.aBooleanArray57[97] || Static103.aBooleanArray57[98] || Static103.aBooleanArray57[99]) {
			Static47.aBoolean89 = true;
		}
		if (Static47.aBoolean89 && Static14.anInt628 <= 0) {
			Static47.aBoolean89 = false;
			Static14.anInt628 = 20;
			Static20.aClass2_Sub6_Sub1_11.method684(2);
			Static20.aClass2_Sub6_Sub1_11.method651(Static12.anInt542);
			Static20.aClass2_Sub6_Sub1_11.method638(Static101.anInt2751);
		}
		if (Static34.aBoolean72 && !Static17.aBoolean52) {
			Static17.aBoolean52 = true;
			Static20.aClass2_Sub6_Sub1_11.method684(99);
			Static20.aClass2_Sub6_Sub1_11.method637(1);
		}
		if (!Static34.aBoolean72 && Static17.aBoolean52) {
			Static17.aBoolean52 = false;
			Static20.aClass2_Sub6_Sub1_11.method684(99);
			Static20.aClass2_Sub6_Sub1_11.method637(0);
		}
		Static79.method1439();
		if (Static103.anInt2775 != 30 && Static103.anInt2775 != 35) {
			return;
		}
		Static72.method860();
		Static16.method513();
		Static13.anInt571++;
		if (Static13.anInt571 > 750) {
			Static101.method1731();
			return;
		}
		Static13.method380();
		Static85.method1565();
		Static87.method1485();
		if (Static17.anInt796 != 0) {
			Static12.anInt526 += 20;
			if (Static12.anInt526 >= 400) {
				Static17.anInt796 = 0;
			}
		}
		Static56.anInt1911++;
		if (Static79.anInt2299 != 0) {
			Static96.anInt2606++;
			if (Static96.anInt2606 >= 15) {
				if (Static79.anInt2299 == 2) {
					Static92.aBoolean81 = true;
				}
				if (Static79.anInt2299 == 3) {
					Static27.aBoolean65 = true;
				}
				Static79.anInt2299 = 0;
			}
		}
		if (Static46.anInt1615 != 0) {
			if (Static85.anInt2508 > Static21.anInt1000 + 5 || Static21.anInt1000 - 5 > Static85.anInt2508 || Static61.anInt2102 > Static79.anInt2291 + 5 || Static61.anInt2102 < Static79.anInt2291 - 5) {
				Static23.aBoolean59 = true;
			}
			Static11.anInt515++;
			if (Static68.anInt2205 == 0) {
				if (Static46.anInt1615 == 2) {
					Static92.aBoolean81 = true;
				}
				if (Static46.anInt1615 == 3) {
					Static27.aBoolean65 = true;
				}
				Static46.anInt1615 = 0;
				if (Static23.aBoolean59 && Static11.anInt515 >= 5) {
					Static9.anInt319 = -1;
					Static48.method1113();
					if (Static9.anInt319 == Static67.anInt2202 && Static59.anInt2040 != Static42.anInt1583) {
						@Pc(741) Class2_Sub1_Sub2 local741 = Static7.method187(Static67.anInt2202);
						@Pc(747) byte local747 = 0;
						if (Static57.anInt2685 == 1 && local741.anInt278 == 206) {
							local747 = 1;
						}
						if (local741.anIntArray40[Static42.anInt1583] <= 0) {
							local747 = 0;
						}
						if (local741.aBoolean23) {
							local107 = Static42.anInt1583;
							local118 = Static59.anInt2040;
							local741.anIntArray40[local107] = local741.anIntArray40[local118];
							local741.anIntArray43[local107] = local741.anIntArray43[local118];
							local741.anIntArray40[local118] = -1;
							local741.anIntArray43[local118] = 0;
						} else if (local747 == 1) {
							local118 = Static59.anInt2040;
							local107 = Static42.anInt1583;
							while (local118 != local107) {
								if (local118 > local107) {
									local741.method180(local118 - 1, local118);
									local118--;
								} else if (local118 < local107) {
									local741.method180(local118 + 1, local118);
									local118++;
								}
							}
						} else {
							local741.method180(Static42.anInt1583, Static59.anInt2040);
						}
						Static20.aClass2_Sub6_Sub1_11.method684(125);
						Static20.aClass2_Sub6_Sub1_11.method638(Static59.anInt2040);
						Static20.aClass2_Sub6_Sub1_11.method658(Static42.anInt1583);
						Static20.aClass2_Sub6_Sub1_11.method630(Static67.anInt2202);
						Static20.aClass2_Sub6_Sub1_11.method649(local747);
					}
				} else if ((Static14.anInt637 == 1 || Static51.method1134(Static59.anInt2044 - 1)) && Static59.anInt2044 > 2) {
					Static93.method1579();
				} else if (Static59.anInt2044 > 0) {
					Static59.method1281(Static59.anInt2044 - 1);
				}
				Static49.anInt2693 = 0;
				Static96.anInt2606 = 10;
			}
		}
		@Pc(881) int local881;
		if (Static107.anInt2823 != -1) {
			local64 = Static107.anInt2823;
			local881 = Static107.anInt2812;
			@Pc(903) boolean local903 = Static72.method865(0, 0, true, 0, 0, 0, Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray285[0], Static37.aClass2_Sub1_Sub4_Sub6_Sub1_1.anIntArray281[0], local881, 0, local64);
			Static107.anInt2823 = -1;
			if (local903) {
				Static44.anInt1596 = Static15.anInt649;
				Static12.anInt526 = 0;
				Static17.anInt796 = 1;
				Static70.anInt2224 = Static105.anInt2783;
			}
		}
		if (Static49.anInt2693 == 1 && Static5.aClass31_72 != null) {
			Static5.aClass31_72 = null;
			Static27.aBoolean65 = true;
			Static49.anInt2693 = 0;
		}
		Static76.method1412();
		if (Static16.anInt773 == -1) {
			Static68.method1374();
			Static92.method1043();
			Static4.method100();
		}
		if (Static68.anInt2205 == 1 || Static49.anInt2693 == 1) {
			Static40.anInt2032++;
		}
		if (Static75.anInt2244 == -1 && Static103.anInt2764 == -1 && Static17.anInt792 == -1) {
			if (Static28.anInt1168 > 0) {
				Static28.anInt1168--;
			}
		} else if (Static28.anInt1168 < 100) {
			Static28.anInt1168++;
			if (Static28.anInt1168 == 100) {
				if (Static75.anInt2244 != -1) {
					Static27.aBoolean65 = true;
				}
				if (Static103.anInt2764 != -1) {
					Static92.aBoolean81 = true;
				}
			}
		}
		Static30.method840();
		if (Static95.aBoolean133) {
			Static19.method555();
		}
		for (local64 = 0; local64 < 5; local64++) {
			@Pc(1011) int local1011 = Static85.anIntArray356[local64]++;
		}
		Static23.method699();
		local881 = Static86.method1482();
		local118 = Static31.method854();
		if (local881 > 4500 && local118 > 4500) {
			Static40.anInt2035 = 250;
			Static11.method357(4000);
			Static20.aClass2_Sub6_Sub1_11.method684(247);
		}
		Static102.anInt695++;
		Static41.anInt1573++;
		if (Static41.anInt1573 > 500) {
			Static41.anInt1573 = 0;
			local107 = (int) (Math.random() * 8.0D);
			if ((local107 & 0x4) == 4) {
				Static16.anInt761 += Static24.anInt1065;
			}
			if ((local107 & 0x2) == 2) {
				Static50.anInt504 += Static43.anInt1589;
			}
			if ((local107 & 0x1) == 1) {
				Static44.anInt1590 += Static101.anInt2760;
			}
		}
		if (Static44.anInt1590 < -50) {
			Static101.anInt2760 = 2;
		}
		if (Static16.anInt761 < -40) {
			Static24.anInt1065 = 1;
		}
		if (Static44.anInt1590 > 50) {
			Static101.anInt2760 = -2;
		}
		if (Static102.anInt695 > 500) {
			Static102.anInt695 = 0;
			local107 = (int) (Math.random() * 8.0D);
			if ((local107 & 0x2) == 2) {
				Static57.anInt2681 += Static90.anInt2423;
			}
			if ((local107 & 0x1) == 1) {
				Static106.anInt2795 += Static18.anInt800;
			}
		}
		if (Static106.anInt2795 < -60) {
			Static18.anInt800 = 2;
		}
		if (Static50.anInt504 < -55) {
			Static43.anInt1589 = 2;
		}
		if (Static106.anInt2795 > 60) {
			Static18.anInt800 = -2;
		}
		if (Static57.anInt2681 < -20) {
			Static90.anInt2423 = 1;
		}
		Static15.anInt644++;
		if (Static50.anInt504 > 55) {
			Static43.anInt1589 = -2;
		}
		if (Static16.anInt761 > 40) {
			Static24.anInt1065 = -1;
		}
		if (Static57.anInt2681 > 10) {
			Static90.anInt2423 = -1;
		}
		if (Static15.anInt644 > 50) {
			Static20.aClass2_Sub6_Sub1_11.method684(217);
		}
		try {
			if (Static89.aClass35_4 != null && Static20.aClass2_Sub6_Sub1_11.anInt952 > 0) {
				Static89.aClass35_4.method1347(Static20.aClass2_Sub6_Sub1_11.anInt952, Static20.aClass2_Sub6_Sub1_11.aByteArray11);
				Static20.aClass2_Sub6_Sub1_11.anInt952 = 0;
				Static15.anInt644 = 0;
			}
		} catch (@Pc(1221) IOException local1221) {
			Static101.method1731();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[B")
	public static synchronized byte[] method1432(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static20.anInt1971 > 0) {
			local21 = Static42.aByteArrayArray8[--Static20.anInt1971];
			Static42.aByteArrayArray8[Static20.anInt1971] = null;
			return local21;
		} else if (arg0 == 5000 && Static62.anInt2112 > 0) {
			local21 = Static14.aByteArrayArray4[--Static62.anInt2112];
			Static14.aByteArrayArray4[Static62.anInt2112] = null;
			return local21;
		} else if (arg0 == 30000 && Static69.anInt2220 > 0) {
			local21 = Static27.aByteArrayArray6[--Static69.anInt2220];
			Static27.aByteArrayArray6[Static69.anInt2220] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}
}
