import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "[I")
	public static int[] anIntArray425;

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
	public static int anInt2494 = 0;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
	public static int anInt2497 = -1;

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
	public static int anInt2501 = 0;

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public static int anInt2502 = -1;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1196 = Static78.method1313(" (X");

	@OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
	public static int anInt2503 = 0;

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1197 = Static78.method1313("Regelversto-8 melden");

	@OriginalMember(owner = "client!sb", name = "p", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
	public static int anInt2505 = 0;

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1198 = Static78.method1313("T");

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
	public static void method1738() {
		Static10.aClass7_1.method1096();
		Static93.aClass1_Sub2_Sub2_Sub4_13.method1953(0, 0);
		Static36.method841();
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(BLclient!q;)V")
	public static void method1739(@OriginalArg(1) Class1_Sub2_Sub3_Sub4 arg0) {
		if (arg0.anInt2815 == 0) {
			return;
		}
		@Pc(31) int local31;
		@Pc(38) int local38;
		if (arg0.anInt2818 != -1 && arg0.anInt2818 < 32768) {
			@Pc(22) Class1_Sub2_Sub3_Sub4_Sub1 local22 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[arg0.anInt2818];
			if (local22 != null) {
				local31 = arg0.anInt2832 - local22.anInt2832;
				local38 = arg0.anInt2827 - local22.anInt2827;
				if (local31 != 0 || local38 != 0) {
					arg0.anInt2809 = (int) (Math.atan2((double) local31, (double) local38) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(69) int local69;
		if (arg0.anInt2818 >= 32768) {
			local69 = arg0.anInt2818 - 32768;
			if (Static45.anInt1178 == local69) {
				local69 = 2047;
			}
			@Pc(82) Class1_Sub2_Sub3_Sub4_Sub2 local82 = Static88.aClass1_Sub2_Sub3_Sub4_Sub2Array1[local69];
			if (local82 != null) {
				local38 = arg0.anInt2832 - local82.anInt2832;
				@Pc(98) int local98 = arg0.anInt2827 - local82.anInt2827;
				if (local38 != 0 || local98 != 0) {
					arg0.anInt2809 = (int) (Math.atan2((double) local38, (double) local98) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2811 != 0 || arg0.anInt2812 != 0) && (arg0.anInt2839 == 0 || arg0.anInt2798 > 0)) {
			local69 = arg0.anInt2832 - (arg0.anInt2811 - Static46.anInt1190 - Static46.anInt1190) * 64;
			local31 = arg0.anInt2827 - (arg0.anInt2812 - Static47.anInt1211 - Static47.anInt1211) * 64;
			if (local69 != 0 || local31 != 0) {
				arg0.anInt2809 = (int) (Math.atan2((double) local69, (double) local31) * 325.949D) & 0x7FF;
			}
			arg0.anInt2811 = 0;
			arg0.anInt2812 = 0;
		}
		local69 = arg0.anInt2809 - arg0.anInt2819 & 0x7FF;
		if (local69 == 0) {
			arg0.anInt2804 = 0;
			return;
		}
		arg0.anInt2804++;
		@Pc(231) boolean local231;
		if (local69 <= 1024) {
			arg0.anInt2819 += arg0.anInt2815;
			local231 = true;
			if (local69 < arg0.anInt2815 || 2048 - arg0.anInt2815 < local69) {
				local231 = false;
				arg0.anInt2819 = arg0.anInt2809;
			}
			if (arg0.anInt2835 == arg0.anInt2795 && (arg0.anInt2804 > 25 || local231)) {
				if (arg0.anInt2785 == -1) {
					arg0.anInt2795 = arg0.anInt2799;
				} else {
					arg0.anInt2795 = arg0.anInt2785;
				}
			}
		} else {
			arg0.anInt2819 -= arg0.anInt2815;
			local231 = true;
			if (local69 < arg0.anInt2815 || 2048 - arg0.anInt2815 < local69) {
				arg0.anInt2819 = arg0.anInt2809;
				local231 = false;
			}
			if (arg0.anInt2795 == arg0.anInt2835 && (arg0.anInt2804 > 25 || local231)) {
				if (arg0.anInt2817 == -1) {
					arg0.anInt2795 = arg0.anInt2799;
				} else {
					arg0.anInt2795 = arg0.anInt2817;
				}
			}
		}
		arg0.anInt2819 &= 0x7FF;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIIII)V")
	public static void method1740(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(13) int local13 = arg2; local13 <= arg2 + arg0; local13++) {
			for (@Pc(17) int local17 = arg3; local17 <= arg1 + arg3; local17++) {
				if (local17 >= 0 && local17 < 104 && local13 >= 0 && local13 < 104) {
					Static28.aByteArrayArrayArray2[0][local17][local13] = 127;
					if (arg3 == local17 && local17 > 0) {
						Static7.anIntArrayArrayArray3[0][local17][local13] = Static7.anIntArrayArrayArray3[0][local17 - 1][local13];
					}
					if (local17 == arg3 + arg1 && local17 < 103) {
						Static7.anIntArrayArrayArray3[0][local17][local13] = Static7.anIntArrayArrayArray3[0][local17 + 1][local13];
					}
					if (local13 == arg2 && local13 > 0) {
						Static7.anIntArrayArrayArray3[0][local17][local13] = Static7.anIntArrayArrayArray3[0][local17][local13 - 1];
					}
					if (local13 == arg0 + arg2 && local13 < 103) {
						Static7.anIntArrayArrayArray3[0][local17][local13] = Static7.anIntArrayArrayArray3[0][local17][local13 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIBZ)V")
	public static void method1741(@OriginalArg(3) boolean arg0) {
		Static10.aBoolean6 = arg0;
		Static127.anInt2944 = 2;
		Static81.anInt1802 = 22050;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method1742() {
		aLongArray5 = null;
		aClass25_1197 = null;
		aClass25_1198 = null;
		anIntArray424 = null;
		anIntArray425 = null;
		aClass25_1196 = null;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method1743() {
		@Pc(7) Class25 local7 = null;
		for (@Pc(9) int local9 = 0; local9 < anInt2503; local9++) {
			if (Static84.aClass25Array14[local9].method796(Static86.aClass25_937) != -1) {
				local7 = Static84.aClass25Array14[local9].method794(Static84.aClass25Array14[local9].method796(Static86.aClass25_937));
				break;
			}
		}
		if (local7 == null) {
			Static27.method601();
			return;
		}
		@Pc(43) int local43 = Static39.anInt1094;
		if (local43 < 0) {
			local43 = 0;
		}
		@Pc(52) int local52 = Static81.anInt1798;
		@Pc(54) int local54 = Static101.anInt2344;
		@Pc(56) int local56 = Static123.anInt2888;
		if (local56 > 190) {
			local56 = 190;
		}
		Static128.method1935(local43, local52, local56, local54, 6116423);
		Static128.method1935(local43 + 1, local52 + 1, local56 - 2, 16, 0);
		Static128.method1938(local43 + 1, local52 + 18, local56 - 2, local54 + -19, 0);
		Static83.aClass1_Sub2_Sub2_Sub3_3.method1180(local7, local43 + 3, local52 + 14, 6116423, -1);
		@Pc(108) int local108 = Static111.anInt2597;
		@Pc(110) int local110 = Static10.anInt264;
		if (Static42.anInt1133 == 0) {
			local110 -= 4;
			local108 -= 4;
		}
		if (Static42.anInt1133 == 1) {
			local110 -= 553;
			local108 -= 205;
		}
		if (Static42.anInt1133 == 2) {
			local108 -= 357;
			local110 -= 17;
		}
		for (@Pc(129) int local129 = 0; local129 < anInt2503; local129++) {
			@Pc(143) int local143 = local52 + (anInt2503 - local129 - 1) * 15 + 31;
			@Pc(145) int local145 = 16777215;
			if (local43 < local110 && local56 + local43 > local110 && local108 > local143 - 13 && local143 + 3 > local108) {
				local145 = 16776960;
			}
			@Pc(169) Class25 local169 = Static84.aClass25Array14[local129];
			if (local169.method776(local7)) {
				local169 = local169.method781(0, local169.method762() - local7.method762());
				if (local169.method776(Static34.aClass25_403)) {
					local169 = local169.method781(0, local169.method762() - Static34.aClass25_403.method762());
				}
			}
			Static83.aClass1_Sub2_Sub2_Sub3_3.method1180(local169, local43 + 3, local143, local145, 0);
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ZI)[B")
	public static synchronized byte[] method1744(@OriginalArg(1) int arg0) {
		@Pc(21) byte[] local21;
		if (arg0 == 100 && Static50.anInt1240 > 0) {
			local21 = Static46.aByteArrayArray2[--Static50.anInt1240];
			Static46.aByteArrayArray2[Static50.anInt1240] = null;
			return local21;
		} else if (arg0 == 5000 && Static122.anInt2927 > 0) {
			local21 = Static52.aByteArrayArray4[--Static122.anInt2927];
			Static52.aByteArrayArray4[Static122.anInt2927] = null;
			return local21;
		} else if (arg0 == 30000 && Static67.anInt1469 > 0) {
			local21 = Static46.aByteArrayArray3[--Static67.anInt1469];
			Static46.aByteArrayArray3[Static67.anInt1469] = null;
			return local21;
		} else {
			return new byte[arg0];
		}
	}
}
