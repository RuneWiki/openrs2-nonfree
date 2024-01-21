import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!vc", name = "H", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1490 = Static75.method1216("System update in: ");

	@OriginalMember(owner = "client!vc", name = "K", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1491 = aClass4_1490;

	@OriginalMember(owner = "client!vc", name = "N", descriptor = "I")
	public static int anInt2692 = 0;

	@OriginalMember(owner = "client!vc", name = "O", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1492 = Static75.method1216("T");

	@OriginalMember(owner = "client!vc", name = "fb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1494 = Static75.method1216("wave:");

	@OriginalMember(owner = "client!vc", name = "W", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1493 = aClass4_1494;

	@OriginalMember(owner = "client!vc", name = "pb", descriptor = "Lclient!bb;")
	public static Class8 aClass8_31 = new Class8(64);

	@OriginalMember(owner = "client!vc", name = "qb", descriptor = "[I")
	public static int[] anIntArray331 = new int[500];

	@OriginalMember(owner = "client!vc", name = "zb", descriptor = "Lclient!ad;")
	private static Class4 aClass4_1498 = Static75.method1216("Loading ignore list");

	@OriginalMember(owner = "client!vc", name = "rb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1495 = aClass4_1498;

	@OriginalMember(owner = "client!vc", name = "sb", descriptor = "I")
	public static int anInt2705 = -1;

	@OriginalMember(owner = "client!vc", name = "tb", descriptor = "I")
	public static volatile int anInt2706 = 0;

	@OriginalMember(owner = "client!vc", name = "ub", descriptor = "Z")
	public static boolean aBoolean238 = false;

	@OriginalMember(owner = "client!vc", name = "vb", descriptor = "I")
	public static int anInt2707 = 0;

	@OriginalMember(owner = "client!vc", name = "wb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1496 = Static75.method1216("@yel@*V");

	@OriginalMember(owner = "client!vc", name = "xb", descriptor = "Lclient!ad;")
	public static Class4 aClass4_1497 = Static75.method1216("logo");

	@OriginalMember(owner = "client!vc", name = "yb", descriptor = "[Lclient!ad;")
	public static Class4[] aClass4Array21 = new Class4[5];

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(Z)V")
	public static void method1820() {
		@Pc(9) int local9 = Static18.anInt459 * 128 + 64;
		@Pc(15) int local15 = Static77.anInt1840 * 128 + 64;
		@Pc(24) int local24 = Static82.method1293(local9, Static49.anInt1203, local15) - Static73.anInt1753;
		if (local15 > Static9.anInt314) {
			Static9.anInt314 += Static49.anInt1214 + (local15 - Static9.anInt314) * Static32.anInt964 / 1000;
			if (Static9.anInt314 > local15) {
				Static9.anInt314 = local15;
			}
		}
		if (Static9.anInt314 > local15) {
			Static9.anInt314 -= Static49.anInt1214 + (Static9.anInt314 - local15) * Static32.anInt964 / 1000;
			if (Static9.anInt314 < local15) {
				Static9.anInt314 = local15;
			}
		}
		if (local9 > Static113.anInt2853) {
			Static113.anInt2853 += Static49.anInt1214 + (local9 - Static113.anInt2853) * Static32.anInt964 / 1000;
			if (local9 < Static113.anInt2853) {
				Static113.anInt2853 = local9;
			}
		}
		if (Static113.anInt2853 > local9) {
			Static113.anInt2853 -= Static32.anInt964 * (Static113.anInt2853 - local9) / 1000 + Static49.anInt1214;
			if (local9 > Static113.anInt2853) {
				Static113.anInt2853 = local9;
			}
		}
		if (Static61.anInt1536 < local24) {
			Static61.anInt1536 += Static49.anInt1214 + (local24 - Static61.anInt1536) * Static32.anInt964 / 1000;
			if (local24 < Static61.anInt1536) {
				Static61.anInt1536 = local24;
			}
		}
		local9 = Static19.anInt473 * 128 + 64;
		if (Static61.anInt1536 > local24) {
			Static61.anInt1536 -= (Static61.anInt1536 - local24) * Static32.anInt964 / 1000 + Static49.anInt1214;
			if (local24 > Static61.anInt1536) {
				Static61.anInt1536 = local24;
			}
		}
		local15 = Static85.anInt1994 * 128 + 64;
		local24 = Static82.method1293(local9, Static49.anInt1203, local15) - Static82.anInt1910;
		@Pc(212) int local212 = local24 - Static61.anInt1536;
		@Pc(217) int local217 = local15 - Static9.anInt314;
		@Pc(222) int local222 = local9 - Static113.anInt2853;
		@Pc(234) int local234 = (int) Math.sqrt((double) (local222 * local222 + local217 * local217));
		@Pc(245) int local245 = (int) (Math.atan2((double) local212, (double) local234) * 325.949D) & 0x7FF;
		@Pc(256) int local256 = (int) (-325.949D * Math.atan2((double) local222, (double) local217)) & 0x7FF;
		@Pc(261) int local261 = local256 - Static47.anInt1186;
		if (local261 > 1024) {
			local261 -= 2048;
		}
		if (local261 < -1024) {
			local261 += 2048;
		}
		if (local245 < 128) {
			local245 = 128;
		}
		if (local245 > 383) {
			local245 = 383;
		}
		if (local261 > 0) {
			Static47.anInt1186 += Static3.anInt2321 + local261 * Static21.anInt492 / 1000;
			Static47.anInt1186 &= 0x7FF;
		}
		if (local261 < 0) {
			Static47.anInt1186 -= Static3.anInt2321 + Static21.anInt492 * -local261 / 1000;
			Static47.anInt1186 &= 0x7FF;
		}
		if (local245 > Static106.anInt2666) {
			Static106.anInt2666 += Static3.anInt2321 + Static21.anInt492 * (local245 - Static106.anInt2666) / 1000;
			if (local245 < Static106.anInt2666) {
				Static106.anInt2666 = local245;
			}
		}
		@Pc(353) int local353 = local256 - Static47.anInt1186;
		if (local353 > 1024) {
			local353 -= 2048;
		}
		if (local353 < -1024) {
			local353 += 2048;
		}
		if (local245 < Static106.anInt2666) {
			Static106.anInt2666 -= Static3.anInt2321 + (Static106.anInt2666 - local245) * Static21.anInt492 / 1000;
			if (Static106.anInt2666 < local245) {
				Static106.anInt2666 = local245;
			}
		}
		if (local353 < 0 && local261 > 0 || local353 > 0 && local261 < 0) {
			Static47.anInt1186 = local256;
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BLclient!rd;Lclient!ad;Lclient!ad;)[Lclient!ub;")
	public static Class3_Sub1_Sub4_Sub2[] method1821(@OriginalArg(1) Class64 arg0, @OriginalArg(2) Class4 arg1, @OriginalArg(3) Class4 arg2) {
		@Pc(8) int local8 = arg0.method1638(arg2);
		@Pc(14) int local14 = arg0.method1626(local8, arg1);
		return Static100.method1646(arg0, local8, local14);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(BIIZIIIIIIII)Z")
	public static boolean method1822(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(7) int local7;
		for (@Pc(3) int local3 = 0; local3 < 104; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				Static44.anIntArrayArray13[local3][local7] = 0;
				Static58.anIntArrayArray17[local3][local7] = 99999999;
			}
		}
		Static44.anIntArrayArray13[arg8][arg3] = 99;
		Static58.anIntArrayArray17[arg8][arg3] = 0;
		local7 = arg8;
		@Pc(51) int local51 = arg3;
		@Pc(53) int local53 = 0;
		@Pc(55) boolean local55 = false;
		@Pc(57) byte local57 = 0;
		Static75.anIntArray238[0] = arg8;
		@Pc(64) int local64 = local57 + 1;
		Static3.anIntArray288[0] = arg3;
		@Pc(69) int local69 = Static75.anIntArray238.length;
		@Pc(74) int[][] local74 = Static12.aClass40Array1[Static49.anInt1203].anIntArrayArray16;
		@Pc(190) int local190;
		while (local53 != local64) {
			local7 = Static75.anIntArray238[local53];
			local51 = Static3.anIntArray288[local53];
			local53 = (local53 + 1) % local69;
			if (arg7 == local7 && arg0 == local51) {
				local55 = true;
				break;
			}
			if (arg5 != 0) {
				if ((arg5 < 5 || arg5 == 10) && Static12.aClass40Array1[Static49.anInt1203].method886(arg5 - 1, arg6, local51, local7, arg0, arg7)) {
					local55 = true;
					break;
				}
				if (arg5 < 10 && Static12.aClass40Array1[Static49.anInt1203].method885(arg7, local7, local51, arg6, arg5 - 1, arg0)) {
					local55 = true;
					break;
				}
			}
			if (arg10 != 0 && arg9 != 0 && Static12.aClass40Array1[Static49.anInt1203].method880(arg7, local51, arg10, arg0, arg4, arg9, local7)) {
				local55 = true;
				break;
			}
			local190 = Static58.anIntArrayArray17[local7][local51] + 1;
			if (local7 > 0 && Static44.anIntArrayArray13[local7 - 1][local51] == 0 && (local74[local7 - 1][local51] & 0x1280108) == 0) {
				Static75.anIntArray238[local64] = local7 - 1;
				Static3.anIntArray288[local64] = local51;
				local64 = (local64 + 1) % local69;
				Static44.anIntArrayArray13[local7 - 1][local51] = 2;
				Static58.anIntArrayArray17[local7 - 1][local51] = local190;
			}
			if (local7 < 103 && Static44.anIntArrayArray13[local7 + 1][local51] == 0 && (local74[local7 + 1][local51] & 0x1280180) == 0) {
				Static75.anIntArray238[local64] = local7 + 1;
				Static3.anIntArray288[local64] = local51;
				Static44.anIntArrayArray13[local7 + 1][local51] = 8;
				Static58.anIntArrayArray17[local7 + 1][local51] = local190;
				local64 = (local64 + 1) % local69;
			}
			if (local51 > 0 && Static44.anIntArrayArray13[local7][local51 - 1] == 0 && (local74[local7][local51 - 1] & 0x1280102) == 0) {
				Static75.anIntArray238[local64] = local7;
				Static3.anIntArray288[local64] = local51 - 1;
				Static44.anIntArrayArray13[local7][local51 - 1] = 1;
				local64 = (local64 + 1) % local69;
				Static58.anIntArrayArray17[local7][local51 - 1] = local190;
			}
			if (local51 < 103 && Static44.anIntArrayArray13[local7][local51 + 1] == 0 && (local74[local7][local51 + 1] & 0x1280120) == 0) {
				Static75.anIntArray238[local64] = local7;
				Static3.anIntArray288[local64] = local51 + 1;
				Static44.anIntArrayArray13[local7][local51 + 1] = 4;
				local64 = (local64 + 1) % local69;
				Static58.anIntArrayArray17[local7][local51 + 1] = local190;
			}
			if (local7 > 0 && local51 > 0 && Static44.anIntArrayArray13[local7 - 1][local51 - 1] == 0 && (local74[local7 - 1][local51 - 1] & 0x128010E) == 0 && (local74[local7 - 1][local51] & 0x1280108) == 0 && (local74[local7][local51 - 1] & 0x1280102) == 0) {
				Static75.anIntArray238[local64] = local7 - 1;
				Static3.anIntArray288[local64] = local51 - 1;
				Static44.anIntArrayArray13[local7 - 1][local51 - 1] = 3;
				Static58.anIntArrayArray17[local7 - 1][local51 - 1] = local190;
				local64 = (local64 + 1) % local69;
			}
			if (local7 < 103 && local51 > 0 && Static44.anIntArrayArray13[local7 + 1][local51 - 1] == 0 && (local74[local7 + 1][local51 - 1] & 0x1280183) == 0 && (local74[local7 + 1][local51] & 0x1280180) == 0 && (local74[local7][local51 - 1] & 0x1280102) == 0) {
				Static75.anIntArray238[local64] = local7 + 1;
				Static3.anIntArray288[local64] = local51 - 1;
				local64 = (local64 + 1) % local69;
				Static44.anIntArrayArray13[local7 + 1][local51 - 1] = 9;
				Static58.anIntArrayArray17[local7 + 1][local51 - 1] = local190;
			}
			if (local7 > 0 && local51 < 103 && Static44.anIntArrayArray13[local7 - 1][local51 + 1] == 0 && (local74[local7 - 1][local51 + 1] & 0x1280138) == 0 && (local74[local7 - 1][local51] & 0x1280108) == 0 && (local74[local7][local51 + 1] & 0x1280120) == 0) {
				Static75.anIntArray238[local64] = local7 - 1;
				Static3.anIntArray288[local64] = local51 + 1;
				Static44.anIntArrayArray13[local7 - 1][local51 + 1] = 6;
				Static58.anIntArrayArray17[local7 - 1][local51 + 1] = local190;
				local64 = (local64 + 1) % local69;
			}
			if (local7 < 103 && local51 < 103 && Static44.anIntArrayArray13[local7 + 1][local51 + 1] == 0 && (local74[local7 + 1][local51 + 1] & 0x12801E0) == 0 && (local74[local7 + 1][local51] & 0x1280180) == 0 && (local74[local7][local51 + 1] & 0x1280120) == 0) {
				Static75.anIntArray238[local64] = local7 + 1;
				Static3.anIntArray288[local64] = local51 + 1;
				local64 = (local64 + 1) % local69;
				Static44.anIntArrayArray13[local7 + 1][local51 + 1] = 12;
				Static58.anIntArrayArray17[local7 + 1][local51 + 1] = local190;
			}
		}
		Static94.anInt2210 = 0;
		@Pc(804) int local804;
		@Pc(811) int local811;
		@Pc(817) int local817;
		if (!local55) {
			if (!arg2) {
				return false;
			}
			local190 = 1000;
			local804 = 100;
			for (local811 = arg7 - 10; local811 <= arg7 + 10; local811++) {
				for (local817 = arg0 - 10; local817 <= arg0 + 10; local817++) {
					if (local811 >= 0 && local817 >= 0 && local811 < 104 && local817 < 104 && Static58.anIntArrayArray17[local811][local817] < 100) {
						@Pc(845) int local845 = 0;
						@Pc(847) int local847 = 0;
						if (local811 < arg7) {
							local847 = arg7 - local811;
						} else if (local811 > arg7 + arg10 - 1) {
							local847 = local811 + 1 - arg7 - arg10;
						}
						if (local817 < arg0) {
							local845 = arg0 - local817;
						} else if (arg0 + arg9 - 1 < local817) {
							local845 = local817 + 1 - arg0 - arg9;
						}
						@Pc(911) int local911 = local847 * local847 + local845 * local845;
						if (local190 > local911 || local911 == local190 && Static58.anIntArrayArray17[local811][local817] < local804) {
							local7 = local811;
							local804 = Static58.anIntArrayArray17[local811][local817];
							local190 = local911;
							local51 = local817;
						}
					}
				}
			}
			if (local190 == 1000) {
				return false;
			}
			if (local7 == arg8 && local51 == arg3) {
				return false;
			}
			Static94.anInt2210 = 1;
		}
		@Pc(985) byte local985 = 0;
		Static75.anIntArray238[0] = local7;
		local53 = local985 + 1;
		Static3.anIntArray288[0] = local51;
		local190 = local804 = Static44.anIntArrayArray13[local7][local51];
		while (local7 != arg8 || arg3 != local51) {
			if (local804 != local190) {
				Static75.anIntArray238[local53] = local7;
				Static3.anIntArray288[local53++] = local51;
				local804 = local190;
			}
			if ((local190 & 0x1) != 0) {
				local51++;
			} else if ((local190 & 0x4) != 0) {
				local51--;
			}
			if ((local190 & 0x2) != 0) {
				local7++;
			} else if ((local190 & 0x8) != 0) {
				local7--;
			}
			local190 = Static44.anIntArrayArray13[local7][local51];
		}
		if (local53 > 0) {
			local69 = local53--;
			@Pc(1085) int local1085 = Static75.anIntArray238[local53];
			if (local69 > 25) {
				local69 = 25;
			}
			local811 = Static3.anIntArray288[local53];
			if (arg1 == 0) {
				Static5.aClass3_Sub4_Sub1_1.method464(133);
				Static5.aClass3_Sub4_Sub1_1.method423(local69 + local69 + 3);
			}
			if (arg1 == 1) {
				Static5.aClass3_Sub4_Sub1_1.method464(52);
				Static5.aClass3_Sub4_Sub1_1.method423(local69 + local69 + 17);
			}
			if (arg1 == 2) {
				Static5.aClass3_Sub4_Sub1_1.method464(249);
				Static5.aClass3_Sub4_Sub1_1.method423(local69 + local69 + 3);
			}
			Static5.aClass3_Sub4_Sub1_1.method455(Static93.anInt2429 + local811);
			Static31.anInt954 = Static75.anIntArray238[0];
			Static103.anInt2539 = Static3.anIntArray288[0];
			for (local817 = 1; local817 < local69; local817++) {
				local53--;
				Static5.aClass3_Sub4_Sub1_1.method426(Static75.anIntArray238[local53] - local1085);
				Static5.aClass3_Sub4_Sub1_1.method426(Static3.anIntArray288[local53] - local811);
			}
			Static5.aClass3_Sub4_Sub1_1.method455(local1085 + Static43.anInt1144);
			Static5.aClass3_Sub4_Sub1_1.method435(Static39.aBooleanArray8[82] ? 1 : 0);
			return true;
		} else if (arg1 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!vc", name = "b", descriptor = "(B)V")
	public static void method1823() {
		aClass4_1493 = null;
		aClass4_1491 = null;
		aClass4_1497 = null;
		aClass4_1495 = null;
		aClass4Array21 = null;
		aClass4_1490 = null;
		aClass8_31 = null;
		aClass4_1494 = null;
		anIntArray331 = null;
		aClass4_1496 = null;
		aClass4_1498 = null;
		aClass4_1492 = null;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!rd;)V")
	public static void method1824(@OriginalArg(1) Class64 arg0) {
		Static36.aClass64_30 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!rd;I)V")
	public static void method1825(@OriginalArg(0) Class64 arg0) {
		Static90.aClass64_81 = arg0;
		Static27.anInt829 = Static90.aClass64_81.method1637(16);
	}
}
