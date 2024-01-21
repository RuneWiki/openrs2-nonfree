import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!va", name = "gb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2797 = Static94.method1596("Service unavailable)3");

	@OriginalMember(owner = "client!va", name = "ib", descriptor = "Lclient!a;")
	public static Class1 aClass1_2798 = Static94.method1596("rot:");

	@OriginalMember(owner = "client!va", name = "kb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2799 = Static94.method1596("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

	@OriginalMember(owner = "client!va", name = "lb", descriptor = "Z")
	public static boolean aBoolean154 = false;

	@OriginalMember(owner = "client!va", name = "nb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2800 = Static94.method1596("cross");

	@OriginalMember(owner = "client!va", name = "pb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2801 = Static94.method1596("Musik)2Engine vorbereitet)3");

	@OriginalMember(owner = "client!va", name = "rb", descriptor = "I")
	public static int anInt2663 = 0;

	@OriginalMember(owner = "client!va", name = "tb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2802 = Static94.method1596("Titelbild geladen)3");

	@OriginalMember(owner = "client!va", name = "ub", descriptor = "Lclient!a;")
	public static Class1 aClass1_2803 = Static94.method1596(" hat sich eingeloggt)3");

	@OriginalMember(owner = "client!va", name = "vb", descriptor = "Lclient!a;")
	private static Class1 aClass1_2804 = Static94.method1596("You need a members account to login to this world)3");

	@OriginalMember(owner = "client!va", name = "wb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2805 = aClass1_2804;

	@OriginalMember(owner = "client!va", name = "xb", descriptor = "Lclient!a;")
	public static Class1 aClass1_2806 = aClass1_2797;

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(IIII)Lclient!jd;")
	public static Class2_Sub1_Sub2_Sub4 method1752(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub1_Sub2_Sub4 local14;
		if (arg2 == 0) {
			local14 = (Class2_Sub1_Sub2_Sub4) Static7.aClass11_9.method431((long) arg1);
			if (local14 != null && local14.anInt1671 != arg0 && local14.anInt1671 != -1) {
				local14.method1820();
				local14 = null;
			}
			if (local14 != null) {
				return local14;
			}
		}
		@Pc(38) Class2_Sub1_Sub17 local38 = Static73.method1374(arg1);
		if (local38.anIntArray303 == null) {
			arg0 = -1;
		}
		if (arg0 > 1) {
			@Pc(50) int local50 = -1;
			for (@Pc(52) int local52 = 0; local52 < 10; local52++) {
				if (arg0 >= local38.anIntArray304[local52] && local38.anIntArray304[local52] != 0) {
					local50 = local38.anIntArray303[local52];
				}
			}
			if (local50 != -1) {
				local38 = Static73.method1374(local50);
			}
		}
		@Pc(89) Class2_Sub1_Sub1_Sub5 local89 = local38.method1639(true, 1);
		if (local89 == null) {
			return null;
		}
		@Pc(95) Class2_Sub1_Sub2_Sub4 local95 = null;
		if (local38.anInt2427 != -1) {
			local95 = method1752(10, local38.anInt2432, -1);
			if (local95 == null) {
				return null;
			}
		}
		@Pc(112) int[] local112 = Static92.anIntArray169;
		@Pc(114) int local114 = Static92.anInt1664;
		@Pc(116) int local116 = Static92.anInt1663;
		@Pc(118) int local118 = Static92.anInt1666;
		@Pc(128) int local128 = Static92.anInt1667;
		@Pc(130) int local130 = Static92.anInt1662;
		@Pc(132) int local132 = Static92.anInt1665;
		@Pc(134) int[] local134 = Static24.method701();
		@Pc(136) int local136 = Static24.anInt985;
		@Pc(138) int local138 = Static24.anInt993;
		local14 = new Class2_Sub1_Sub2_Sub4(32, 32);
		Static92.method1133(local14.anIntArray170, 32, 32);
		Static97.anIntArray309 = Static24.method696(Static97.anIntArray309);
		Static92.method1120(0, 0, 32, 32, 0);
		@Pc(161) int local161 = local38.anInt2435;
		if (arg2 == -1) {
			local161 = (int) ((double) local161 * 1.5D);
		}
		if (arg2 > 0) {
			local161 = (int) ((double) local161 * 1.04D);
		}
		Static24.aBoolean42 = false;
		@Pc(190) int local190 = Class2_Sub1_Sub2_Sub3.anIntArray106[local38.anInt2460] * local161 >> 16;
		@Pc(199) int local199 = local161 * Class2_Sub1_Sub2_Sub3.anIntArray107[local38.anInt2460] >> 16;
		local89.method1400();
		local89.method1413(local38.anInt2448, local38.anInt2445, local38.anInt2460, local38.anInt2426, local38.anInt2430 + local89.anInt2698 / 2 + local190, local199 + local38.anInt2430);
		for (@Pc(227) int local227 = 31; local227 >= 0; local227--) {
			for (local199 = 31; local199 >= 0; local199--) {
				if (local14.anIntArray170[local227 + local199 * 32] == 0) {
					if (local227 > 0 && local14.anIntArray170[local199 * 32 + local227 - 1] > 1) {
						local14.anIntArray170[local199 * 32 + local227] = 1;
					} else if (local199 > 0 && local14.anIntArray170[local227 + (local199 - 1) * 32] > 1) {
						local14.anIntArray170[local199 * 32 + local227] = 1;
					} else if (local227 < 31 && local14.anIntArray170[local199 * 32 + local227 + 1] > 1) {
						local14.anIntArray170[local227 + local199 * 32] = 1;
					} else if (local199 < 31 && local14.anIntArray170[(local199 + 1) * 32 + local227] > 1) {
						local14.anIntArray170[local227 + local199 * 32] = 1;
					}
				}
			}
		}
		@Pc(367) int local367;
		if (arg2 > 0) {
			for (local367 = 31; local367 >= 0; local367--) {
				for (local199 = 31; local199 >= 0; local199--) {
					if (local14.anIntArray170[local367 + local199 * 32] == 0) {
						if (local367 > 0 && local14.anIntArray170[local199 * 32 + local367 - 1] == 1) {
							local14.anIntArray170[local367 + local199 * 32] = arg2;
						} else if (local199 > 0 && local14.anIntArray170[local367 + (local199 - 1) * 32] == 1) {
							local14.anIntArray170[local367 + local199 * 32] = arg2;
						} else if (local367 < 31 && local14.anIntArray170[local367 + local199 * 32 + 1] == 1) {
							local14.anIntArray170[local367 + local199 * 32] = arg2;
						} else if (local199 < 31 && local14.anIntArray170[local367 + local199 * 32 + 32] == 1) {
							local14.anIntArray170[local199 * 32 + local367] = arg2;
						}
					}
				}
			}
		} else if (arg2 == 0) {
			for (local367 = 31; local367 >= 0; local367--) {
				for (local199 = 31; local199 >= 0; local199--) {
					if (local14.anIntArray170[local199 * 32 + local367] == 0 && local367 > 0 && local199 > 0 && local14.anIntArray170[local367 + (local199 - 1) * 32 - 1] > 0) {
						local14.anIntArray170[local367 + local199 * 32] = 3153952;
					}
				}
			}
		}
		if (local38.anInt2427 != -1) {
			@Pc(578) int local578 = local95.anInt1671;
			local367 = local95.anInt1673;
			local95.anInt1671 = 32;
			local95.anInt1673 = 32;
			local95.method1140(0, 0);
			local95.anInt1673 = local367;
			local95.anInt1671 = local578;
		}
		if (arg2 == 0) {
			Static7.aClass11_9.method430((long) arg1, local14);
		}
		Static92.method1133(local112, local116, local114);
		Static92.method1119(local118, local130, local128, local132);
		Static24.method696(local134);
		Static24.anInt985 = local136;
		Static24.anInt993 = local138;
		Static24.method690();
		Static24.aBoolean42 = true;
		if (local38.anInt2419 == 1) {
			local14.anInt1673 = 33;
		} else {
			local14.anInt1673 = 32;
		}
		local14.anInt1671 = arg0;
		return local14;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(I)V")
	public static void method1753() {
		aClass1_2805 = null;
		aClass1_2801 = null;
		aClass1_2800 = null;
		aClass1_2803 = null;
		aClass1_2802 = null;
		aClass1_2799 = null;
		aClass1_2797 = null;
		aClass1_2798 = null;
		aClass1_2806 = null;
		aClass1_2804 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!qd;)Lclient!qd;")
	public static Class2_Sub1_Sub14 method1754(@OriginalArg(1) Class2_Sub1_Sub14 arg0) {
		@Pc(14) int local14;
		if (arg0.anInt2194 < 0) {
			local14 = arg0.anInt2174 >> 16;
		} else {
			local14 = arg0.anInt2194 >> 16;
		}
		if (!Static113.method1524(local14)) {
			return null;
		} else if (arg0.anInt2222 >= 0) {
			return Static98.aClass2_Sub1_Sub14ArrayArray1[local14][arg0.anInt2222 & 0xFFFF];
		} else {
			@Pc(62) Class2_Sub1_Sub14 local62 = Static98.aClass2_Sub1_Sub14ArrayArray1[local14][arg0.anInt2222 >> 15 & 0xFFFF];
			return local62.aClass2_Sub1_Sub14Array1[arg0.anInt2222 & 0x7FFF];
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ILclient!e;)V")
	public static void method1755(@OriginalArg(1) Class2_Sub1_Sub2_Sub2 arg0) {
		for (@Pc(7) int local7 = 0; local7 < Static84.anIntArray284.length; local7++) {
			Static84.anIntArray284[local7] = 0;
		}
		@Pc(41) int local41;
		for (@Pc(31) int local31 = 0; local31 < 5000; local31++) {
			local41 = (int) ((double) 256 * 128.0D * Math.random());
			Static84.anIntArray284[local41] = (int) (Math.random() * 256.0D);
		}
		@Pc(58) int local58;
		@Pc(62) int local62;
		@Pc(70) int local70;
		for (local41 = 0; local41 < 20; local41++) {
			for (local58 = 1; local58 < 255; local58++) {
				for (local62 = 1; local62 < 127; local62++) {
					local70 = (local58 << 7) + local62;
					Static102.anIntArray323[local70] = (Static84.anIntArray284[local70 - 128] + Static84.anIntArray284[local70 - 1] + Static84.anIntArray284[local70 - -1] + Static84.anIntArray284[local70 + 128]) / 4;
				}
			}
			@Pc(115) int[] local115 = Static84.anIntArray284;
			Static84.anIntArray284 = Static102.anIntArray323;
			Static102.anIntArray323 = local115;
		}
		if (arg0 == null) {
			return;
		}
		local58 = 0;
		for (local62 = 0; local62 < arg0.anInt957; local62++) {
			for (local70 = 0; local70 < arg0.anInt954; local70++) {
				if (arg0.aByteArray5[local58++] != 0) {
					@Pc(153) int local153 = arg0.anInt958 + local62 + 16;
					@Pc(160) int local160 = arg0.anInt959 + local70 + 16;
					@Pc(166) int local166 = local160 + (local153 << 7);
					Static84.anIntArray284[local166] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BII)V")
	public static void method1756(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class46 local11 = Static15.aClass46ArrayArrayArray1[Static2.anInt287][arg1][arg0];
		if (local11 == null) {
			Static109.aClass3_1.method157(Static2.anInt287, arg1, arg0);
			return;
		}
		@Pc(21) int local21 = -99999999;
		@Pc(23) Class2_Sub1_Sub1_Sub4 local23 = null;
		@Pc(28) Class2_Sub1_Sub1_Sub4 local28;
		for (local28 = (Class2_Sub1_Sub1_Sub4) local11.method1435(); local28 != null; local28 = (Class2_Sub1_Sub1_Sub4) local11.method1442()) {
			@Pc(34) Class2_Sub1_Sub17 local34 = Static73.method1374(local28.anInt1708);
			@Pc(37) int local37 = local34.anInt2446;
			if (local34.anInt2419 == 1) {
				local37 *= local28.anInt1702 + 1;
			}
			if (local37 > local21) {
				local21 = local37;
				local23 = local28;
			}
		}
		if (local23 == null) {
			Static109.aClass3_1.method157(Static2.anInt287, arg1, arg0);
			return;
		}
		@Pc(81) Class2_Sub1_Sub1_Sub4 local81 = null;
		@Pc(83) Class2_Sub1_Sub1_Sub4 local83 = null;
		local11.method1438(local23);
		for (local28 = (Class2_Sub1_Sub1_Sub4) local11.method1435(); local28 != null; local28 = (Class2_Sub1_Sub1_Sub4) local11.method1442()) {
			if (local28.anInt1708 != local23.anInt1708) {
				if (local83 == null) {
					local83 = local28;
				}
				if (local83.anInt1708 != local28.anInt1708 && local81 == null) {
					local81 = local28;
				}
			}
		}
		@Pc(130) int local130 = (arg0 << 7) + arg1 + 1610612736;
		Static109.aClass3_1.method171(Static2.anInt287, arg1, arg0, Static65.method1338(Static2.anInt287, arg1 * 128 + 64, arg0 * 128 + 64), local23, local130, local83, local81);
	}
}
