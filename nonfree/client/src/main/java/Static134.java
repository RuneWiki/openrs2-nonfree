import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!ra", name = "lb", descriptor = "Lclient!ah;")
	public static Class7 aClass7_55;

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lclient!qc;")
	public static Class3_Sub19 aClass3_Sub19_1 = new Class3_Sub19(0, 0);

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1121 = Static170.method3101("null");

	@OriginalMember(owner = "client!ra", name = "jb", descriptor = "I")
	public static volatile int anInt3415 = 0;

	@OriginalMember(owner = "client!ra", name = "kb", descriptor = "Lclient!eh;")
	public static Class28 aClass28_1122 = Static170.method3101("Verbinde mit Server)3)3)3");

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(B)V")
	public static void method2616() {
		aClass3_Sub19_1 = null;
		aClass7_55 = null;
		aClass28_1121 = null;
		aClass28_1122 = null;
	}

	@OriginalMember(owner = "client!ra", name = "c", descriptor = "(Z)V")
	public static void method2617() {
		@Pc(9) int local9 = Static66.anInt2057 * 128 + 64;
		@Pc(15) int local15 = Static169.anInt658 * 128 + 64;
		@Pc(24) int local24 = Static33.method848(local9, Static171.anInt4109, local15) - Static71.anInt2140;
		if (Static28.anInt900 < local9) {
			Static28.anInt900 += (local9 - Static28.anInt900) * Static44.anInt3934 / 1000 + Static121.anInt3122;
			if (local9 < Static28.anInt900) {
				Static28.anInt900 = local9;
			}
		}
		if (Static28.anInt900 > local9) {
			Static28.anInt900 -= (Static28.anInt900 - local9) * Static44.anInt3934 / 1000 + Static121.anInt3122;
			if (Static28.anInt900 < local9) {
				Static28.anInt900 = local9;
			}
		}
		if (Static85.anInt2512 < local15) {
			Static85.anInt2512 += Static121.anInt3122 + (local15 - Static85.anInt2512) * Static44.anInt3934 / 1000;
			if (local15 < Static85.anInt2512) {
				Static85.anInt2512 = local15;
			}
		}
		if (local15 < Static85.anInt2512) {
			Static85.anInt2512 -= Static121.anInt3122 + Static44.anInt3934 * (Static85.anInt2512 - local15) / 1000;
			if (local15 > Static85.anInt2512) {
				Static85.anInt2512 = local15;
			}
		}
		if (Static163.anInt3970 < local24) {
			Static163.anInt3970 += Static121.anInt3122 + Static44.anInt3934 * (local24 - Static163.anInt3970) / 1000;
			if (Static163.anInt3970 > local24) {
				Static163.anInt3970 = local24;
			}
		}
		local9 = Static142.anInt3629 * 128 + 64;
		if (local24 < Static163.anInt3970) {
			Static163.anInt3970 -= (Static163.anInt3970 - local24) * Static44.anInt3934 / 1000 + Static121.anInt3122;
			if (local24 > Static163.anInt3970) {
				Static163.anInt3970 = local24;
			}
		}
		local15 = Static84.anInt2466 * 128 + 64;
		local24 = Static33.method848(local9, Static171.anInt4109, local15) - Static38.anInt1086;
		@Pc(204) int local204 = local24 - Static163.anInt3970;
		@Pc(209) int local209 = local9 - Static28.anInt900;
		@Pc(214) int local214 = local15 - Static85.anInt2512;
		@Pc(225) int local225 = (int) Math.sqrt((double) (local214 * local214 + local209 * local209));
		@Pc(236) int local236 = (int) (Math.atan2((double) local204, (double) local225) * 325.949D) & 0x7FF;
		@Pc(251) int local251 = (int) (Math.atan2((double) local209, (double) local214) * -325.949D) & 0x7FF;
		@Pc(255) int local255 = local251 - Static44.anInt3941;
		if (local236 < 128) {
			local236 = 128;
		}
		if (local255 > 1024) {
			local255 -= 2048;
		}
		if (local255 < -1024) {
			local255 += 2048;
		}
		if (local255 > 0) {
			Static44.anInt3941 += Static158.anInt616 + local255 * Static50.anInt1434 / 1000;
			Static44.anInt3941 &= 0x7FF;
		}
		if (local255 < 0) {
			Static44.anInt3941 -= -local255 * Static50.anInt1434 / 1000 + Static158.anInt616;
			Static44.anInt3941 &= 0x7FF;
		}
		if (local236 > 383) {
			local236 = 383;
		}
		if (Static169.anInt683 < local236) {
			Static169.anInt683 += (local236 - Static169.anInt683) * Static50.anInt1434 / 1000 + Static158.anInt616;
			if (local236 < Static169.anInt683) {
				Static169.anInt683 = local236;
			}
		}
		if (local236 < Static169.anInt683) {
			Static169.anInt683 -= Static158.anInt616 + Static50.anInt1434 * (Static169.anInt683 - local236) / 1000;
			if (local236 > Static169.anInt683) {
				Static169.anInt683 = local236;
			}
		}
		@Pc(372) int local372 = local251 - Static44.anInt3941;
		if (local372 > 1024) {
			local372 -= 2048;
		}
		if (local372 < -1024) {
			local372 += 2048;
		}
		if (local372 < 0 && local255 > 0 || local372 > 0 && local255 < 0) {
			Static44.anInt3941 = local251;
		}
	}

	@OriginalMember(owner = "client!ra", name = "f", descriptor = "(I)V")
	public static void method2618() {
		Static71.aFont1 = null;
		Static136.aFontMetrics1 = null;
		Static24.anImage1 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BLclient!db;III)V")
	public static void method2619(@OriginalArg(1) Class3_Sub2_Sub1_Sub2_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1 == arg0 || Static82.anInt2400 >= 400) {
			return;
		}
		@Pc(48) Class28 local48;
		if (arg0.anInt888 == 0) {
			local48 = Static4.method96(new Class28[] { arg0.aClass28_296, Static101.method2115(Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt877, arg0.anInt877), Static113.aClass28_938, Static132.aClass28_1098, Static146.method2793(arg0.anInt877), Static163.aClass28_1379 });
		} else {
			local48 = Static4.method96(new Class28[] { arg0.aClass28_296, Static113.aClass28_938, Static2.aClass28_23, Static146.method2793(arg0.anInt888), Static163.aClass28_1379 });
		}
		@Pc(123) int local123;
		if (Static95.anInt2636 == 1) {
			Static70.method1646(Static85.aClass28_786, arg1, arg3, Static4.method96(new Class28[] { Static154.aClass28_1288, Static153.aClass28_1274, local48 }), (short) 43, (long) arg2);
		} else if (!Static67.aBoolean109) {
			for (local123 = 7; local123 >= 0; local123--) {
				if (Static140.aClass28Array21[local123] != null) {
					@Pc(130) short local130 = 0;
					if (Static140.aClass28Array21[local123].method936(Static19.aClass28_212)) {
						if (arg0.anInt877 > Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt877) {
							local130 = 2000;
						}
						if (Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt880 != 0 && arg0.anInt880 != 0) {
							if (arg0.anInt880 == Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anInt880) {
								local130 = 2000;
							} else {
								local130 = 0;
							}
						}
					} else if (Static98.aBooleanArray14[local123]) {
						local130 = 2000;
					}
					@Pc(187) short local187 = Static72.aShortArray24[local123];
					@Pc(192) short local192 = (short) (local187 + local130);
					Static70.method1646(Static140.aClass28Array21[local123], arg1, arg3, Static4.method96(new Class28[] { Static65.aClass28_593, local48 }), local192, (long) arg2);
				}
			}
		} else if ((Static171.anInt4101 & 0x8) == 8) {
			Static70.method1646(Static30.aClass28_313, arg1, arg3, Static4.method96(new Class28[] { Static101.aClass28_843, Static153.aClass28_1274, local48 }), (short) 35, (long) arg2);
		}
		for (local123 = 0; local123 < Static82.anInt2400; local123++) {
			if (Static21.aShortArray8[local123] == 14) {
				Static69.aClass28Array12[local123] = Static4.method96(new Class28[] { Static65.aClass28_593, local48 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "(I)V")
	public static void method2620() {
		while (true) {
			if (Static18.aClass3_Sub8_Sub1_1.method1556(Static11.anInt410) >= 27) {
				@Pc(12) int local12 = Static18.aClass3_Sub8_Sub1_1.method1557(15);
				if (local12 != 32767) {
					@Pc(17) boolean local17 = false;
					if (Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local12] == null) {
						local17 = true;
						Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local12] = new Class3_Sub2_Sub1_Sub2_Sub2();
					}
					@Pc(33) Class3_Sub2_Sub1_Sub2_Sub2 local33 = Static115.aClass3_Sub2_Sub1_Sub2_Sub2Array1[local12];
					Static117.anIntArray523[Static69.anInt2115++] = local12;
					local33.anInt1830 = Static14.anInt481;
					local33.aClass3_Sub2_Sub7_1 = Static170.method3103(Static18.aClass3_Sub8_Sub1_1.method1557(14));
					@Pc(57) int local57 = Static18.aClass3_Sub8_Sub1_1.method1557(5);
					@Pc(62) int local62 = Static18.aClass3_Sub8_Sub1_1.method1557(5);
					if (local62 > 15) {
						local62 -= 32;
					}
					@Pc(75) int local75 = Static50.anIntArray253[Static18.aClass3_Sub8_Sub1_1.method1557(3)];
					if (local57 > 15) {
						local57 -= 32;
					}
					if (local17) {
						local33.anInt1793 = local33.anInt1795 = local75;
					}
					@Pc(96) int local96 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
					if (local96 == 1) {
						Static171.anIntArray684[Static81.anInt2370++] = local12;
					}
					@Pc(114) int local114 = Static18.aClass3_Sub8_Sub1_1.method1557(1);
					local33.anInt1835 = local33.aClass3_Sub2_Sub7_1.anInt1310;
					local33.anInt1831 = local33.aClass3_Sub2_Sub7_1.anInt1332;
					local33.anInt1823 = local33.aClass3_Sub2_Sub7_1.anInt1324;
					local33.anInt1839 = local33.aClass3_Sub2_Sub7_1.anInt1309;
					local33.anInt1791 = local33.aClass3_Sub2_Sub7_1.anInt1335;
					local33.anInt1821 = local33.aClass3_Sub2_Sub7_1.anInt1329;
					local33.anInt1786 = local33.aClass3_Sub2_Sub7_1.anInt1333;
					local33.anInt1816 = local33.aClass3_Sub2_Sub7_1.anInt1311;
					if (local33.anInt1816 == 0) {
						local33.anInt1795 = 0;
					}
					local33.anInt1787 = local33.aClass3_Sub2_Sub7_1.anInt1338;
					local33.method1431(local62 + Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray314[0], local114 == 1, local57 + Static107.aClass3_Sub2_Sub1_Sub2_Sub1_1.anIntArray311[0]);
					continue;
				}
			}
			Static18.aClass3_Sub8_Sub1_1.method1563();
			return;
		}
	}
}
