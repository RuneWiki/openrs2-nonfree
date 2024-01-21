import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!dd", name = "ub", descriptor = "Lclient!he;")
	public static Class11 aClass11_21;

	@OriginalMember(owner = "client!dd", name = "Ab", descriptor = "I")
	public static int anInt699;

	@OriginalMember(owner = "client!dd", name = "eb", descriptor = "Lclient!va;")
	public static Class61 aClass61_257 = Static88.method1421("mod_icons");

	@OriginalMember(owner = "client!dd", name = "gb", descriptor = "Lclient!ea;")
	public static Class16 aClass16_1 = new Class16();

	@OriginalMember(owner = "client!dd", name = "hb", descriptor = "I")
	public static int anInt688 = 0;

	@OriginalMember(owner = "client!dd", name = "nb", descriptor = "Lclient!va;")
	private static Class61 aClass61_258 = Static88.method1421("Enter object name");

	@OriginalMember(owner = "client!dd", name = "ob", descriptor = "I")
	public static int anInt694 = 0;

	@OriginalMember(owner = "client!dd", name = "rb", descriptor = "Lclient!va;")
	private static Class61 aClass61_259 = Static88.method1421("button near the top of that page)3");

	@OriginalMember(owner = "client!dd", name = "tb", descriptor = "Lclient!va;")
	public static Class61 aClass61_260 = aClass61_258;

	@OriginalMember(owner = "client!dd", name = "vb", descriptor = "Lclient!va;")
	public static Class61 aClass61_261 = aClass61_259;

	@OriginalMember(owner = "client!dd", name = "xb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4 = new byte[4][104][104];

	@OriginalMember(owner = "client!dd", name = "yb", descriptor = "Lclient!tc;")
	public static Class10_Sub10 aClass10_Sub10_2 = new Class10_Sub10(8);

	@OriginalMember(owner = "client!dd", name = "zb", descriptor = "Lclient!va;")
	public static Class61 aClass61_262 = Static88.method1421("::fpson");

	@OriginalMember(owner = "client!dd", name = "c", descriptor = "(Z)V")
	public static void method442() {
		@Pc(5) Class16 local5 = aClass16_1;
		synchronized (aClass16_1) {
			Static88.anInt2315 = Static54.anInt1473;
			Static28.anInt889 = Static66.anInt1756;
			Static17.anInt597 = Static64.anInt1733;
			Static19.anInt630 = Static66.anInt1759;
			Static12.anInt333 = Static55.anInt1486;
			Static67.anInt1776 = Static19.anInt627;
			Static9.aLong13 = Static8.aLong12;
			Static66.anInt1759 = 0;
		}
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(B)V")
	public static void method443() {
		Static13.anInt394 = 0;
		@Pc(157) int local157;
		for (@Pc(17) int local17 = -1; local17 < Static34.anInt1005 + Static10.anInt305; local17++) {
			@Pc(25) Class10_Sub1_Sub5_Sub2 local25;
			if (local17 == -1) {
				local25 = Static52.aClass10_Sub1_Sub5_Sub2_Sub2_1;
			} else if (local17 >= Static10.anInt305) {
				local25 = Static6.aClass10_Sub1_Sub5_Sub2_Sub1Array1[Static1.anIntArray3[local17 - Static10.anInt305]];
			} else {
				local25 = Static105.aClass10_Sub1_Sub5_Sub2_Sub2Array1[Static58.anIntArray170[local17]];
			}
			if (local25 != null && local25.method927()) {
				@Pc(62) Class10_Sub1_Sub3 local62;
				if (local25 instanceof Class10_Sub1_Sub5_Sub2_Sub1) {
					local62 = ((Class10_Sub1_Sub5_Sub2_Sub1) local25).aClass10_Sub1_Sub3_1;
					if (local62.anIntArray48 != null) {
						local62 = local62.method278();
					}
					if (local62 == null) {
						continue;
					}
				}
				if (local17 >= Static10.anInt305) {
					local62 = ((Class10_Sub1_Sub5_Sub2_Sub1) local25).aClass10_Sub1_Sub3_1;
					if (local62.anInt379 >= 0 && Static15.aClass10_Sub1_Sub1_Sub1Array2.length > local62.anInt379) {
						Static38.method634(local25, local25.anInt1679 + 15);
						if (Static39.anInt280 > -1) {
							Static15.aClass10_Sub1_Sub1_Sub1Array2[local62.anInt379].method142(Static39.anInt280 - 12, Static32.anInt947 + -30);
						}
					}
					if (Static78.anInt2122 == 1 && Static1.anIntArray3[local17 - Static10.anInt305] == Static88.anInt2318 && Static95.anInt2442 % 20 < 10) {
						Static38.method634(local25, local25.anInt1679 + 15);
						if (Static39.anInt280 > -1) {
							Static78.aClass10_Sub1_Sub1_Sub1Array9[0].method142(Static39.anInt280 - 12, Static32.anInt947 + -28);
						}
					}
				} else {
					local157 = 30;
					@Pc(160) Class10_Sub1_Sub5_Sub2_Sub2 local160 = (Class10_Sub1_Sub5_Sub2_Sub2) local25;
					if (local160.anInt1704 != -1 || local160.anInt1690 != -1) {
						Static38.method634(local25, local25.anInt1679 + 15);
						if (Static39.anInt280 > -1) {
							if (local160.anInt1704 != -1) {
								Static1.aClass10_Sub1_Sub1_Sub1Array1[local160.anInt1704].method142(Static39.anInt280 - 12, Static32.anInt947 + -30);
								local157 += 25;
							}
							if (local160.anInt1690 != -1) {
								Static15.aClass10_Sub1_Sub1_Sub1Array2[local160.anInt1690].method142(Static39.anInt280 - 12, -local157 + Static32.anInt947);
								local157 += 25;
							}
						}
					}
					if (local17 >= 0 && Static78.anInt2122 == 10 && Static58.anIntArray170[local17] == Static49.anInt1391) {
						Static38.method634(local25, local25.anInt1679 + 15);
						if (Static39.anInt280 > -1) {
							Static78.aClass10_Sub1_Sub1_Sub1Array9[1].method142(Static39.anInt280 - 12, -local157 + Static32.anInt947);
						}
					}
				}
				if (local25.aClass61_695 != null && (local17 >= Static10.anInt305 || Static53.anInt1449 == 0 || Static53.anInt1449 == 3 || Static53.anInt1449 == 1 && Static94.method1495(((Class10_Sub1_Sub5_Sub2_Sub2) local25).aClass61_699))) {
					Static38.method634(local25, local25.anInt1679);
					if (Static39.anInt280 > -1 && Static13.anInt394 < Static57.anInt1514) {
						Static57.anIntArray162[Static13.anInt394] = Static50.aClass10_Sub1_Sub1_Sub4_3.method1549(local25.aClass61_695) / 2;
						Static57.anIntArray167[Static13.anInt394] = Static50.aClass10_Sub1_Sub1_Sub4_3.anInt2476;
						Static57.anIntArray168[Static13.anInt394] = Static39.anInt280;
						Static57.anIntArray164[Static13.anInt394] = Static32.anInt947;
						Static57.anIntArray163[Static13.anInt394] = local25.anInt1667;
						Static57.anIntArray166[Static13.anInt394] = local25.anInt1684;
						Static57.anIntArray165[Static13.anInt394] = local25.anInt1663;
						Static57.aClass61Array10[Static13.anInt394] = local25.aClass61_695;
						Static13.anInt394++;
					}
				}
				if (Static95.anInt2442 < local25.anInt1643) {
					Static38.method634(local25, local25.anInt1679 + 15);
					if (Static39.anInt280 > -1) {
						local157 = local25.anInt1669 * 30 / local25.anInt1660;
						if (local157 > 30) {
							local157 = 30;
						}
						Static45.method1531(Static39.anInt280 - 15, Static32.anInt947 + -3, local157, 5, 65280);
						Static45.method1531(Static39.anInt280 + local157 - 15, Static32.anInt947 + -3, 30 - local157, 5, 16711680);
					}
				}
				for (local157 = 0; local157 < 4; local157++) {
					if (Static95.anInt2442 < local25.anIntArray191[local157]) {
						Static38.method634(local25, local25.anInt1679 / 2);
						if (Static39.anInt280 > -1) {
							if (local157 == 1) {
								Static32.anInt947 -= 20;
							}
							if (local157 == 2) {
								Static32.anInt947 -= 10;
								Static39.anInt280 -= 15;
							}
							if (local157 == 3) {
								Static32.anInt947 -= 10;
								Static39.anInt280 += 15;
							}
							Static34.aClass10_Sub1_Sub1_Sub1Array4[local25.anIntArray190[local157]].method142(Static39.anInt280 - 12, Static32.anInt947 + -12);
							Static8.aClass10_Sub1_Sub1_Sub4_1.method1544(Static29.method529(local25.anIntArray188[local157]), Static39.anInt280, Static32.anInt947 + 4, 0);
							Static8.aClass10_Sub1_Sub1_Sub4_1.method1544(Static29.method529(local25.anIntArray188[local157]), Static39.anInt280 - 1, Static32.anInt947 - -3, 16777215);
						}
					}
				}
			}
		}
		for (@Pc(492) int local492 = 0; local492 < Static13.anInt394; local492++) {
			@Pc(498) int local498 = Static57.anIntArray164[local492];
			@Pc(502) int local502 = Static57.anIntArray162[local492];
			local157 = Static57.anIntArray168[local492];
			@Pc(510) int local510 = Static57.anIntArray167[local492];
			@Pc(512) boolean local512 = true;
			while (local512) {
				local512 = false;
				for (@Pc(518) int local518 = 0; local518 < local492; local518++) {
					if (Static57.anIntArray164[local518] - Static57.anIntArray167[local518] < local498 + 2 && local498 - local510 < Static57.anIntArray164[local518] + 2 && local157 - local502 < Static57.anIntArray168[local518] + Static57.anIntArray162[local518] && local502 + local157 > -Static57.anIntArray162[local518] + Static57.anIntArray168[local518] && Static57.anIntArray164[local518] - Static57.anIntArray167[local518] < local498) {
						local512 = true;
						local498 = Static57.anIntArray164[local518] - Static57.anIntArray167[local518];
					}
				}
			}
			Static39.anInt280 = Static57.anIntArray168[local492];
			Static32.anInt947 = Static57.anIntArray164[local492] = local498;
			@Pc(618) Class61 local618 = Static57.aClass61Array10[local492];
			if (Static76.anInt2026 == 0) {
				@Pc(622) int local622 = 16776960;
				if (Static57.anIntArray163[local492] < 6) {
					local622 = Static52.anIntArray157[Static57.anIntArray163[local492]];
				}
				if (Static57.anIntArray163[local492] == 6) {
					local622 = Static101.anInt2558 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static57.anIntArray163[local492] == 7) {
					local622 = Static101.anInt2558 % 20 < 10 ? 255 : 65535;
				}
				if (Static57.anIntArray163[local492] == 8) {
					local622 = Static101.anInt2558 % 20 >= 10 ? 8454016 : 45056;
				}
				@Pc(693) int local693;
				if (Static57.anIntArray163[local492] == 9) {
					local693 = 150 - Static57.anIntArray165[local492];
					if (local693 < 50) {
						local622 = local693 * 1280 + 16711680;
					} else if (local693 < 100) {
						local622 = 16776960 - (local693 - 50) * 327680;
					} else if (local693 < 150) {
						local622 = (local693 - 100) * 5 + 65280;
					}
				}
				if (Static57.anIntArray163[local492] == 10) {
					local693 = 150 - Static57.anIntArray165[local492];
					if (local693 < 50) {
						local622 = local693 * 5 + 16711680;
					} else if (local693 < 100) {
						local622 = 16711935 - (local693 - 50) * 327680;
					} else if (local693 < 150) {
						local622 = local693 * 327680 + 255 + 500 - local693 * 5 - 32768000;
					}
				}
				if (Static57.anIntArray163[local492] == 11) {
					local693 = 150 - Static57.anIntArray165[local492];
					if (local693 < 50) {
						local622 = 16777215 - local693 * 327685;
					} else if (local693 < 100) {
						local622 = (local693 - 50) * 327685 + 65280;
					} else if (local693 < 150) {
						local622 = 16777215 + 32768000 - local693 * 327680;
					}
				}
				if (Static57.anIntArray166[local492] == 0) {
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(local618, Static39.anInt280, Static32.anInt947 + 1, 0);
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(local618, Static39.anInt280, Static32.anInt947, local622);
				}
				if (Static57.anIntArray166[local492] == 1) {
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1550(local618, Static39.anInt280, Static32.anInt947 + 1, 0, Static101.anInt2558);
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1550(local618, Static39.anInt280, Static32.anInt947, local622, Static101.anInt2558);
				}
				if (Static57.anIntArray166[local492] == 2) {
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1537(local618, Static39.anInt280, Static32.anInt947 + 1, 0, Static101.anInt2558);
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1537(local618, Static39.anInt280, Static32.anInt947, local622, Static101.anInt2558);
				}
				if (Static57.anIntArray166[local492] == 3) {
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1540(local618, Static39.anInt280, Static32.anInt947 + 1, 0, Static101.anInt2558, 150 - Static57.anIntArray165[local492]);
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1540(local618, Static39.anInt280, Static32.anInt947, local622, Static101.anInt2558, 150 - Static57.anIntArray165[local492]);
				}
				@Pc(965) int local965;
				if (Static57.anIntArray166[local492] == 4) {
					local693 = Static50.aClass10_Sub1_Sub1_Sub4_3.method1549(local618);
					local965 = (local693 + 100) * (150 - Static57.anIntArray165[local492]) / 150;
					Static45.method1530(Static39.anInt280 - 50, 0, Static39.anInt280 + 50, 334);
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1548(local618, Static39.anInt280 + 50 - local965, Static32.anInt947 - -1, 0);
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1548(local618, Static39.anInt280 + 50 - local965, Static32.anInt947, local622);
					Static45.method1532();
				}
				if (Static57.anIntArray166[local492] == 5) {
					local693 = 150 - Static57.anIntArray165[local492];
					Static45.method1530(0, Static32.anInt947 - Static50.aClass10_Sub1_Sub1_Sub4_3.anInt2476 - 1, 512, Static32.anInt947 + 5);
					local965 = 0;
					if (local693 < 25) {
						local965 = local693 - 25;
					} else if (local693 > 125) {
						local965 = local693 - 125;
					}
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(local618, Static39.anInt280, local965 + Static32.anInt947 + 1, 0);
					Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(local618, Static39.anInt280, local965 + Static32.anInt947, local622);
					Static45.method1532();
				}
			} else {
				Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(local618, Static39.anInt280, Static32.anInt947 + 1, 0);
				Static50.aClass10_Sub1_Sub1_Sub4_3.method1544(local618, Static39.anInt280, Static32.anInt947, 16776960);
			}
		}
	}

	@OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V")
	public static void method444() {
		Static28.anIntArray94 = null;
		Static82.anIntArray246 = null;
		Static33.aByteArrayArrayArray6 = null;
		Static22.anIntArray77 = null;
		Static95.anIntArray319 = null;
		Static40.aByteArrayArrayArray7 = null;
		Static95.aByteArrayArrayArray9 = null;
		Static18.aByteArrayArrayArray3 = null;
		Static27.aByteArrayArrayArray5 = null;
		Static11.anIntArrayArray5 = null;
		Static65.anIntArray193 = null;
		Static51.anIntArrayArrayArray3 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILclient!he;Lclient!he;)V")
	public static void method445(@OriginalArg(1) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static105.aClass11_63 = arg1;
		Static57.aClass11_39 = arg0;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!he;BZLclient!he;)V")
	public static void method446(@OriginalArg(0) Class11 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class11 arg2) {
		Static11.aClass11_11 = arg0;
		Static80.aBoolean96 = arg1;
		Static107.aClass11_59 = arg2;
	}

	@OriginalMember(owner = "client!dd", name = "f", descriptor = "(I)V")
	public static void method447() {
		aClass61_260 = null;
		aClass61_261 = null;
		aClass61_259 = null;
		aClass61_258 = null;
		aByteArrayArrayArray4 = null;
		aClass61_257 = null;
		aClass10_Sub10_2 = null;
		aClass61_262 = null;
		aClass11_21 = null;
		aClass16_1 = null;
	}
}
