import java.awt.Canvas;
import java.awt.Graphics;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static142 {

	@OriginalMember(owner = "client!p", name = "o", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_22;

	@OriginalMember(owner = "client!p", name = "p", descriptor = "[Lclient!gg;")
	public static Class29_Sub1[] aClass29_Sub1Array2;

	@OriginalMember(owner = "client!p", name = "q", descriptor = "Lclient!ra;")
	public static Class2_Sub3 aClass2_Sub3_2;

	@OriginalMember(owner = "client!p", name = "s", descriptor = "I")
	public static int anInt2989;

	@OriginalMember(owner = "client!p", name = "v", descriptor = "Lclient!bb;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!p", name = "j", descriptor = "Lclient!sg;")
	public static final Class91 aClass91_11 = new Class91(50);

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Z")
	public static boolean aBoolean141 = false;

	@OriginalMember(owner = "client!p", name = "l", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_876 = Static181.method2795("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!p", name = "r", descriptor = "[I")
	public static final int[] anIntArray295 = new int[1000];

	@OriginalMember(owner = "client!p", name = "t", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_877 = Static181.method2795("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!p", name = "u", descriptor = "I")
	public static int anInt2990 = 0;

	@OriginalMember(owner = "client!p", name = "w", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_878 = Static181.method2795("Speicher wird zugewiesen)3");

	@OriginalMember(owner = "client!p", name = "x", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_879 = Static181.method2795("<col=80ff00>");

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(II)I")
	public static int method2280(@OriginalArg(1) int arg0) {
		@Pc(10) double local10 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
		@Pc(23) double local23 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
		@Pc(30) double local30 = (double) (arg0 & 0xFF) / 256.0D;
		@Pc(32) double local32 = local10;
		if (local23 > local10) {
			local32 = local23;
		}
		if (local30 > local32) {
			local32 = local30;
		}
		@Pc(46) double local46 = local10;
		if (local10 > local23) {
			local46 = local23;
		}
		if (local30 < local46) {
			local46 = local30;
		}
		@Pc(60) double local60 = 0.0D;
		@Pc(62) double local62 = 0.0D;
		@Pc(68) double local68 = (local46 + local32) / 2.0D;
		if (local32 != local46) {
			if (local32 == local10) {
				local60 = (local23 - local30) / (-local46 + local32);
			} else if (local32 == local23) {
				local60 = (local30 - local10) / (-local46 + local32) + 2.0D;
			} else if (local30 == local32) {
				local60 = (local10 - local23) / (local32 - local46) + 4.0D;
			}
			if (local68 < 0.5D) {
				local62 = (local32 - local46) / (local46 + local32);
			}
			if (local68 >= 0.5D) {
				local62 = (local32 - local46) / (2.0D - local32 - local46);
			}
		}
		@Pc(156) int local156 = (int) (local68 * 256.0D);
		local60 /= 6.0D;
		@Pc(165) int local165 = (int) (local62 * 256.0D);
		if (local165 < 0) {
			local165 = 0;
		} else if (local165 > 255) {
			local165 = 255;
		}
		@Pc(186) int local186 = (int) (local60 * 256.0D);
		if (local156 < 0) {
			local156 = 0;
		} else if (local156 > 255) {
			local156 = 255;
		}
		if (local156 > 243) {
			local165 >>= 0x4;
		} else if (local156 > 217) {
			local165 >>= 0x3;
		} else if (local156 > 192) {
			local165 >>= 0x2;
		} else if (local156 > 179) {
			local165 >>= 0x1;
		}
		return (local156 >> 1) + (local186 >> 2 << 10) + (local165 >> 5 << 7);
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZLclient!qe;)V")
	public static void method2281(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class83 arg1) {
		@Pc(18) int local18 = Static167.aClass2_Sub2_Sub5_3.method1094(arg1, 250);
		@Pc(25) int local25 = Static167.aClass2_Sub2_Sub5_3.method1078(arg1, 250) * 13;
		Static126.method2138(6, 6, local18 + 8, local25 + 4 + 4, 0);
		Static126.method2120(6, 6, local18 + 4 + 4, local25 + 4 + 4, 16777215);
		Static167.aClass2_Sub2_Sub5_3.method1099(arg1, 10, 10, local18, local25, 16777215, -1, 1, 1, 0);
		Static124.method1906(local18 + 8, local25 - -4 + 4, 6, 6);
		if (!arg0) {
			Static108.method1870(local18, 10, local25, 10);
			return;
		}
		@Pc(103) Canvas local103 = Static69.aCanvas1;
		try {
			@Pc(106) Graphics local106 = local103.getGraphics();
			Static191.aClass34_1.method2585(local106);
		} catch (@Pc(114) Exception local114) {
			local103.repaint();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IJII)Z")
	public static boolean method2282(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(3) int arg2) {
		@Pc(17) int local17 = (int) arg1 >> 20 & 0x3;
		@Pc(24) int local24 = (int) arg1 >> 14 & 0x1F;
		@Pc(31) int local31 = Integer.MAX_VALUE & (int) (arg1 >>> 32);
		if (local24 == 10 || local24 == 11 || local24 == 22) {
			@Pc(74) Class2_Sub2_Sub20 local74 = Static99.method1689(local31);
			@Pc(84) int local84;
			@Pc(87) int local87;
			if (local17 == 0 || local17 == 2) {
				local84 = local74.anInt2670;
				local87 = local74.anInt2665;
			} else {
				local84 = local74.anInt2665;
				local87 = local74.anInt2670;
			}
			@Pc(98) int local98 = local74.anInt2660;
			if (local17 != 0) {
				local98 = (local98 << local17 & 0xF) + (local98 >> 4 - local17);
			}
			Static166.method2576(2, arg0, 0, arg2, true, local98, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], local84, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], local87);
		} else {
			Static166.method2576(2, arg0, local17, arg2, true, 0, Static54.aClass24_Sub4_Sub1_1.anIntArray316[0], 0, local24 + 1, Static54.aClass24_Sub4_Sub1_1.anIntArray319[0], 0);
		}
		Static33.anInt870 = Static153.anInt3298;
		Static85.anInt1874 = Static59.anInt1446;
		Static37.anInt961 = 2;
		Static46.anInt1093 = 0;
		return true;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IIII[II[BIII)V")
	public static void method2283(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(6) int local6 = -(arg4 >> 2);
		@Pc(15) int local15 = -(arg4 & 0x3);
		for (@Pc(18) int local18 = -arg7; local18 < 0; local18++) {
			for (@Pc(22) int local22 = local6; local22 < 0; local22++) {
				if (arg5[arg6++] == 0) {
					arg8++;
				} else {
					arg3[arg8++] = arg2;
				}
				if (arg5[arg6++] == 0) {
					arg8++;
				} else {
					arg3[arg8++] = arg2;
				}
				if (arg5[arg6++] == 0) {
					arg8++;
				} else {
					arg3[arg8++] = arg2;
				}
				if (arg5[arg6++] == 0) {
					arg8++;
				} else {
					arg3[arg8++] = arg2;
				}
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				if (arg5[arg6++] == 0) {
					arg8++;
				} else {
					arg3[arg8++] = arg2;
				}
			}
			arg8 += arg0;
			arg6 += arg1;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!qe;ZLclient!ae;)Lclient!qe;")
	public static Class83 method2284(@OriginalArg(0) Class83 arg0, @OriginalArg(2) Class5 arg1) {
		if (arg0.method2388(Static214.aClass83_1218) == -1) {
			return arg0;
		}
		while (true) {
			@Pc(17) int local17 = arg0.method2388(Static26.aClass83_148);
			if (local17 == -1) {
				while (true) {
					local17 = arg0.method2388(Static163.aClass83_964);
					if (local17 == -1) {
						while (true) {
							local17 = arg0.method2388(Static215.aClass83_1221);
							if (local17 == -1) {
								while (true) {
									local17 = arg0.method2388(Static201.aClass83_1150);
									if (local17 == -1) {
										while (true) {
											local17 = arg0.method2388(Static190.aClass83_1099);
											if (local17 == -1) {
												while (true) {
													local17 = arg0.method2388(Static132.aClass83_849);
													if (local17 == -1) {
														return arg0;
													}
													@Pc(229) Class83 local229 = Static182.aClass83_1067;
													if (Static128.aClass15_8 != null) {
														local229 = Static40.method799(Static128.aClass15_8.anInt623);
														try {
															if (Static128.aClass15_8.anObject1 != null) {
																@Pc(245) byte[] local245 = ((String) Static128.aClass15_8.anObject1).getBytes("ISO-8859-1");
																local229 = Static16.method1831(local245.length, local245, 0);
															}
														} catch (@Pc(254) UnsupportedEncodingException local254) {
														}
													}
													arg0 = Static67.method1268(new Class83[] { arg0.method2416(local17, 0), local229, arg0.method2422(local17 + 4) });
												}
											}
											arg0 = Static67.method1268(new Class83[] { arg0.method2416(local17, 0), Static194.method2912(Static200.method3028(arg1, 4)), arg0.method2422(local17 + 2) });
										}
									}
									arg0 = Static67.method1268(new Class83[] { arg0.method2416(local17, 0), Static194.method2912(Static200.method3028(arg1, 3)), arg0.method2422(local17 + 2) });
								}
							}
							arg0 = Static67.method1268(new Class83[] { arg0.method2416(local17, 0), Static194.method2912(Static200.method3028(arg1, 2)), arg0.method2422(local17 + 2) });
						}
					}
					arg0 = Static67.method1268(new Class83[] { arg0.method2416(local17, 0), Static194.method2912(Static200.method3028(arg1, 1)), arg0.method2422(local17 + 2) });
				}
			}
			arg0 = Static67.method1268(new Class83[] { arg0.method2416(local17, 0), Static194.method2912(Static200.method3028(arg1, 0)), arg0.method2422(local17 + 2) });
		}
	}
}
