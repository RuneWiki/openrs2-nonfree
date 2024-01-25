import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static476 {

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "Lclient!aj;")
	public static Class15 aClass15_122;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "Lclient!vl;")
	public static final Class371 aClass371_4 = new Class371();

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "Z")
	public static volatile boolean aBoolean599 = true;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Lclient!ml;")
	public static final Class223 aClass223_13 = new Class223("", 19);

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!wc;III)V")
	public static void method6886(@OriginalArg(0) Class28_Sub1_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(11) int[] local11 = new int[4];
		Static684.method5330(local11, 0, local11.length, arg1);
		Static137.method2522(arg0, local11, arg2);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V")
	public static void method6888() {
		Static77.method1438(-1, 255);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z[Ljava/lang/Object;[J)V")
	public static void method6889(@OriginalArg(1) Object[] arg0, @OriginalArg(2) long[] arg1) {
		Static365.method5319(arg0, arg1.length - 1, 0, arg1);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZIBI)V")
	public static void method6890(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static244.aClass83_11.method2368((long) arg1) != null) {
			return;
		}
		if (Static18.aBoolean36) {
			@Pc(24) Class3_Sub40 local24 = new Class3_Sub40(arg1, new Class121_Sub1(4096, Static201.aClass15_58, arg1), arg2, arg0);
			local24.aClass121_Sub1_1.method3614(Static672.aStringArray42[Static609.anInt9834]);
			Static244.aClass83_11.method2377((long) arg1, local24);
		} else {
			Static332.method5029(arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!wea;)V")
	public static void method6891(@OriginalArg(0) Class28_Sub1 arg0) {
		Static671.aClass13_21.H(arg0.anInt10729, arg0.anInt10722 + (arg0.method9296() >> 1), arg0.anInt10731, Static615.anIntArray847);
		arg0.anInt10721 = Static615.anIntArray847[0];
		arg0.anInt10725 = Static615.anIntArray847[1];
		arg0.anInt10726 = Static615.anIntArray847[2];
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIB)V")
	public static void method6892(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static90.aByteArrayArrayArray25 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
	public static void method6893() {
		for (@Pc(11) int local11 = 0; local11 < Static28.anInt551; local11++) {
			@Pc(17) int local17 = Static394.anIntArray548[local11];
			@Pc(25) Class28_Sub1_Sub1_Sub1_Sub2 local25 = ((Class3_Sub3) Static522.aClass83_34.method2368((long) local17)).aClass28_Sub1_Sub1_Sub1_Sub2_1;
			@Pc(29) int local29 = Static210.aClass3_Sub25_Sub1_3.method8632();
			if ((local29 & 0x4) != 0) {
				local29 += Static210.aClass3_Sub25_Sub1_3.method8632() << 8;
			}
			if ((local29 & 0x1000) != 0) {
				local29 += Static210.aClass3_Sub25_Sub1_3.method8632() << 16;
			}
			@Pc(68) int local68;
			@Pc(97) int local97;
			if ((local29 & 0x40) != 0) {
				@Pc(66) int[] local66 = new int[4];
				for (local68 = 0; local68 < 4; local68++) {
					local66[local68] = Static210.aClass3_Sub25_Sub1_3.method8592();
					if (local66[local68] == 65535) {
						local66[local68] = -1;
					}
				}
				local97 = Static210.aClass3_Sub25_Sub1_3.method8646();
				Static232.method3918(local25, local66, local97);
			}
			if ((local29 & 0x20) != 0) {
				if (local25.aClass300_1.method7268()) {
					Static666.method9184(local25);
				}
				local25.method9335(Static580.aClass36_2.method1057(Static210.aClass3_Sub25_Sub1_3.method8644()));
				local25.method9322(local25.aClass300_1.anInt8313);
				local25.anInt10745 = local25.aClass300_1.anInt8314 << 3;
				if (local25.aClass300_1.method7268()) {
					Static581.method7253(local25.anIntArray956[0], local25.anIntArray955[0], local25, (Class277) null, (Class28_Sub1_Sub1_Sub1_Sub1) null, 0, local25.aByte174);
				}
			}
			if ((local29 & 0x8000) != 0) {
				local25.aByte176 = Static210.aClass3_Sub25_Sub1_3.method8643();
				local25.aByte179 = Static210.aClass3_Sub25_Sub1_3.method8621();
				local25.aByte178 = Static210.aClass3_Sub25_Sub1_3.method8621();
				local25.aByte180 = (byte) Static210.aClass3_Sub25_Sub1_3.method8632();
				local25.anInt10805 = Static588.anInt9467 + Static210.aClass3_Sub25_Sub1_3.method8644();
				local25.anInt10757 = Static588.anInt9467 + Static210.aClass3_Sub25_Sub1_3.method8592();
			}
			@Pc(225) int local225;
			@Pc(231) int local231;
			@Pc(208) int local208;
			if ((local29 & 0x40000) != 0) {
				local208 = Static210.aClass3_Sub25_Sub1_3.method8593();
				local68 = Static210.aClass3_Sub25_Sub1_3.method8610();
				if (local208 == 65535) {
					local208 = -1;
				}
				local97 = Static210.aClass3_Sub25_Sub1_3.method8646();
				local225 = local97 & 0x7;
				local231 = local97 >> 3 & 0xF;
				if (local231 == 15) {
					local231 = -1;
				}
				local25.method9311(local68, 2, local208, local231, local225);
			}
			if ((local29 & 0x80000) != 0) {
				local25.aString126 = Static210.aClass3_Sub25_Sub1_3.method8613();
				if ("".equals(local25.aString126) || local25.aString126.equals(local25.aClass300_1.aString101)) {
					local25.aString126 = local25.aClass300_1.aString101;
				}
			}
			if ((local29 & 0x2) != 0) {
				local25.anInt10743 = Static210.aClass3_Sub25_Sub1_3.method8592();
				if (local25.anInt10743 == 65535) {
					local25.anInt10743 = -1;
				}
			}
			@Pc(343) int local343;
			@Pc(373) int local373;
			@Pc(402) int local402;
			@Pc(333) int[] local333;
			@Pc(361) short[] local361;
			@Pc(392) short[] local392;
			@Pc(429) long local429;
			if ((local29 & 0x800) != 0) {
				local208 = local25.aClass300_1.anIntArray694.length;
				local68 = 0;
				if (local25.aClass300_1.aShortArray124 != null) {
					local68 = local25.aClass300_1.aShortArray124.length;
				}
				local97 = 0;
				if (local25.aClass300_1.aShortArray123 != null) {
					local97 = local25.aClass300_1.aShortArray123.length;
				}
				local225 = Static210.aClass3_Sub25_Sub1_3.method8632();
				if ((local225 & 0x1) == 1) {
					local25.aClass11_1 = null;
				} else {
					local333 = null;
					if ((local225 & 0x2) == 2) {
						local333 = new int[local208];
						for (local343 = 0; local343 < local208; local343++) {
							local333[local343] = Static210.aClass3_Sub25_Sub1_3.method8639();
						}
					}
					local361 = null;
					if ((local225 & 0x4) == 4) {
						local361 = new short[local68];
						for (local373 = 0; local373 < local68; local373++) {
							local361[local373] = (short) Static210.aClass3_Sub25_Sub1_3.method8644();
						}
					}
					local392 = null;
					if ((local225 & 0x8) == 8) {
						local392 = new short[local97];
						for (local402 = 0; local402 < local97; local402++) {
							local392[local402] = (short) Static210.aClass3_Sub25_Sub1_3.method8644();
						}
					}
					local429 = (long) local25.anInt10840++ << 32 | (long) local17;
					local25.aClass11_1 = new Class11(local429, local333, local361, local392);
				}
			}
			if ((local29 & 0x80) != 0) {
				local25.anInt10830 = Static210.aClass3_Sub25_Sub1_3.method8639();
				local25.anInt10815 = Static210.aClass3_Sub25_Sub1_3.method8592();
			}
			if ((local29 & 0x100) != 0) {
				local208 = Static210.aClass3_Sub25_Sub1_3.method8639();
				local68 = Static210.aClass3_Sub25_Sub1_3.method8618();
				if (local208 == 65535) {
					local208 = -1;
				}
				local97 = Static210.aClass3_Sub25_Sub1_3.method8646();
				local225 = local97 & 0x7;
				local231 = local97 >> 3 & 0xF;
				if (local231 == 15) {
					local231 = -1;
				}
				local25.method9311(local68, 1, local208, local231, local225);
			}
			@Pc(525) int[] local525;
			@Pc(528) int[] local528;
			if ((local29 & 0x4000) != 0) {
				local208 = Static210.aClass3_Sub25_Sub1_3.method8646();
				local525 = new int[local208];
				local528 = new int[local208];
				for (local225 = 0; local225 < local208; local225++) {
					local231 = Static210.aClass3_Sub25_Sub1_3.method8644();
					if ((local231 & 0xC000) == 49152) {
						local343 = Static210.aClass3_Sub25_Sub1_3.method8593();
						local525[local225] = local231 << 16 | local343;
					} else {
						local525[local225] = local231;
					}
					local528[local225] = Static210.aClass3_Sub25_Sub1_3.method8593();
				}
				local25.method9307(local528, local525);
			}
			if ((local29 & 0x8) != 0) {
				local208 = Static210.aClass3_Sub25_Sub1_3.method8593();
				if (local208 == 65535) {
					local208 = -1;
				}
				local68 = Static210.aClass3_Sub25_Sub1_3.method8618();
				local97 = Static210.aClass3_Sub25_Sub1_3.method8609();
				local225 = local97 & 0x7;
				local231 = local97 >> 3 & 0xF;
				if (local231 == 15) {
					local231 = -1;
				}
				local25.method9311(local68, 0, local208, local231, local225);
			}
			if ((local29 & 0x1) != 0) {
				local208 = Static210.aClass3_Sub25_Sub1_3.method8615();
				if (local208 > 0) {
					for (local68 = 0; local68 < local208; local68++) {
						local225 = -1;
						local231 = -1;
						local97 = Static210.aClass3_Sub25_Sub1_3.method8604();
						local343 = -1;
						if (local97 == 32767) {
							local97 = Static210.aClass3_Sub25_Sub1_3.method8604();
							local231 = Static210.aClass3_Sub25_Sub1_3.method8604();
							local225 = Static210.aClass3_Sub25_Sub1_3.method8604();
							local343 = Static210.aClass3_Sub25_Sub1_3.method8604();
						} else if (local97 == 32766) {
							local97 = -1;
						} else {
							local231 = Static210.aClass3_Sub25_Sub1_3.method8604();
						}
						local373 = Static210.aClass3_Sub25_Sub1_3.method8604();
						local402 = Static210.aClass3_Sub25_Sub1_3.method8632();
						local25.method9310(local373, Static588.anInt9467, local343, local97, local225, local231, local402);
					}
				}
			}
			if ((local29 & 0x2000) != 0) {
				local25.anInt10764 = Static210.aClass3_Sub25_Sub1_3.method8590();
				local25.anInt10784 = Static210.aClass3_Sub25_Sub1_3.method8621();
				local25.anInt10746 = Static210.aClass3_Sub25_Sub1_3.method8590();
				local25.anInt10808 = Static210.aClass3_Sub25_Sub1_3.method8590();
				local25.anInt10780 = Static210.aClass3_Sub25_Sub1_3.method8593() + Static588.anInt9467;
				local25.anInt10755 = Static210.aClass3_Sub25_Sub1_3.method8644() + Static588.anInt9467;
				local25.anInt10776 = Static210.aClass3_Sub25_Sub1_3.method8615();
				local25.anInt10808 += local25.anIntArray955[0];
				local25.anInt10746 += local25.anIntArray956[0];
				local25.anInt10814 = 0;
				local25.anInt10764 += local25.anIntArray956[0];
				local25.anInt10784 += local25.anIntArray955[0];
				local25.anInt10812 = 1;
			}
			if ((local29 & 0x20000) != 0) {
				local208 = local25.aClass300_1.anIntArray695.length;
				local68 = 0;
				if (local25.aClass300_1.aShortArray124 != null) {
					local68 = local25.aClass300_1.aShortArray124.length;
				}
				if (local25.aClass300_1.aShortArray123 != null) {
					local68 = local25.aClass300_1.aShortArray123.length;
				}
				local225 = Static210.aClass3_Sub25_Sub1_3.method8615();
				if ((local225 & 0x1) != 1) {
					local333 = null;
					if ((local225 & 0x2) == 2) {
						local333 = new int[local208];
						for (local343 = 0; local343 < local208; local343++) {
							local333[local343] = Static210.aClass3_Sub25_Sub1_3.method8639();
						}
					}
					local361 = null;
					if ((local225 & 0x4) == 4) {
						local361 = new short[local68];
						for (local373 = 0; local373 < local68; local373++) {
							local361[local373] = (short) Static210.aClass3_Sub25_Sub1_3.method8644();
						}
					}
					local392 = null;
					if ((local225 & 0x8) == 8) {
						local392 = new short[0];
						for (local402 = 0; local402 < 0; local402++) {
							local392[local402] = (short) Static210.aClass3_Sub25_Sub1_3.method8644();
						}
					}
					local429 = (long) local17 | (long) local25.anInt10834++ << 32;
					new Class11(local429, local333, local361, local392);
				}
			}
			if ((local29 & 0x10) != 0) {
				local25.aString125 = Static210.aClass3_Sub25_Sub1_3.method8613();
				local25.anInt10809 = 100;
			}
			if ((local29 & 0x400) != 0) {
				local208 = Static210.aClass3_Sub25_Sub1_3.method8639();
				local25.anInt10790 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local25.anInt10787 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local25.aBoolean821 = (local208 & 0x8000) != 0;
				local25.anInt10785 = local208 & 0x7FFF;
				local25.anInt10797 = local25.anInt10790 + local25.anInt10785 + Static588.anInt9467;
			}
			if ((local29 & 0x10000) != 0) {
				local25.anInt10835 = Static210.aClass3_Sub25_Sub1_3.method8592();
				if (local25.anInt10835 == 65535) {
					local25.anInt10835 = local25.aClass300_1.anInt8310;
				}
			}
			if ((local29 & 0x200) != 0) {
				local208 = Static210.aClass3_Sub25_Sub1_3.method8632();
				local525 = new int[local208];
				local528 = new int[local208];
				@Pc(1039) int[] local1039 = new int[local208];
				for (local231 = 0; local231 < local208; local231++) {
					local343 = Static210.aClass3_Sub25_Sub1_3.method8639();
					if (local343 == 65535) {
						local343 = -1;
					}
					local525[local231] = local343;
					local528[local231] = Static210.aClass3_Sub25_Sub1_3.method8609();
					local1039[local231] = Static210.aClass3_Sub25_Sub1_3.method8644();
				}
				Static66.method1347(local525, local25, local1039, local528);
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BI)V")
	public static void method6894(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub11_Sub4 local17 = Static583.method8201(8, (long) arg0);
		local17.method2194();
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(FIFF)F")
	public static float method6895(@OriginalArg(0) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		return arg0 + arg1 * (arg2 - arg0);
	}
}
