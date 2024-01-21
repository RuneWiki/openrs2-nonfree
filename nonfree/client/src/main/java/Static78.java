import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static78 {

	@OriginalMember(owner = "client!nd", name = "j", descriptor = "[I")
	public static int[] anIntArray205;

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
	public static int anInt2051;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
	public static int anInt2045 = 0;

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "Lclient!ec;")
	public static Class22 aClass22_567 = Static60.method1113("Art");

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "Lclient!ec;")
	private static Class22 aClass22_568 = Static60.method1113(" from your friend list first");

	@OriginalMember(owner = "client!nd", name = "u", descriptor = "Lclient!ec;")
	private static Class22 aClass22_573 = Static60.method1113("red:");

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "Lclient!ec;")
	public static Class22 aClass22_569 = aClass22_573;

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "Z")
	public static final boolean aBoolean179 = false;

	@OriginalMember(owner = "client!nd", name = "k", descriptor = "Lclient!ja;")
	public static Class33 aClass33_26 = new Class33(64);

	@OriginalMember(owner = "client!nd", name = "m", descriptor = "Lclient!ec;")
	public static Class22 aClass22_570 = Static60.method1113("Bitte warten Sie)3)3)3");

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Lclient!ec;")
	public static Class22 aClass22_571 = aClass22_573;

	@OriginalMember(owner = "client!nd", name = "s", descriptor = "Lclient!ec;")
	public static Class22 aClass22_572 = aClass22_568;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Lclient!ec;")
	public static Class22 aClass22_574 = Static60.method1113("<col=ffff00>");

	@OriginalMember(owner = "client!nd", name = "x", descriptor = "Lclient!ec;")
	public static Class22 aClass22_575 = Static60.method1113(":assistreq:");

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BILclient!ea;I)[Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2[] method1297(@OriginalArg(1) int arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) int arg2) {
		return Static24.method397(arg2, arg1, arg0) ? Static1.method1() : null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)V")
	public static void method1298(@OriginalArg(1) boolean arg0) {
		if (Static4.aClass6_1 == null) {
			return;
		}
		try {
			@Pc(11) Class4_Sub11 local11 = new Class4_Sub11(4);
			local11.method701(arg0 ? 2 : 3);
			local11.method737(0);
			Static4.aClass6_1.method133(local11.aByteArray9, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				Static4.aClass6_1.method136();
			} catch (@Pc(37) Exception local37) {
			}
			Static4.aClass6_1 = null;
			Static50.anInt1407++;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Lclient!hb;")
	public static Class4_Sub1_Sub2_Sub3 method1299() {
		@Pc(7) Class4_Sub1_Sub2_Sub3 local7 = new Class4_Sub1_Sub2_Sub3();
		local7.anIntArray132 = Static27.anIntArray75;
		local7.anInt1209 = Static57.anIntArray171[0];
		local7.aByteArray11 = Static124.aByteArrayArray9[0];
		local7.anInt1207 = Static106.anInt2687;
		local7.anInt1208 = Static129.anInt3064;
		local7.anInt1210 = Static30.anIntArray77[0];
		local7.anInt1205 = Static61.anIntArray175[0];
		local7.anInt1206 = Static105.anIntArray297[0];
		Static57.method1094();
		return local7;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IB)Z")
	public static boolean method1300(@OriginalArg(0) int arg0) {
		return (arg0 >> 21 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!ec;B)V")
	public static void method1302(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1) {
		Static38.aClass4_Sub11_Sub1_1.method752(205);
		Static38.aClass4_Sub11_Sub1_1.method734(arg0);
		Static38.aClass4_Sub11_Sub1_1.method699(arg1.method468());
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	public static void method1303() {
		Static28.aFont1 = null;
		Static93.aFontMetrics1 = null;
		Static84.anImage4 = null;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
	public static void method1304() {
		Static133.aClass4_Sub11_Sub1_3.method747();
		@Pc(11) int local11 = Static133.aClass4_Sub11_Sub1_3.method748(8);
		@Pc(24) int local24;
		if (local11 < Static84.anInt2255) {
			for (local24 = local11; local24 < Static84.anInt2255; local24++) {
				Static23.anIntArray60[Static84.anInt2252++] = Static13.anIntArray33[local24];
			}
		}
		if (Static84.anInt2255 < local11) {
			throw new RuntimeException("gnpov1");
		}
		Static84.anInt2255 = 0;
		for (local24 = 0; local24 < local11; local24++) {
			@Pc(67) int local67 = Static13.anIntArray33[local24];
			@Pc(71) Class4_Sub1_Sub3_Sub2_Sub2 local71 = Static12.aClass4_Sub1_Sub3_Sub2_Sub2Array1[local67];
			@Pc(76) int local76 = Static133.aClass4_Sub11_Sub1_3.method748(1);
			if (local76 == 0) {
				Static13.anIntArray33[Static84.anInt2255++] = local67;
				local71.anInt2475 = Static117.anInt2877;
			} else {
				@Pc(96) int local96 = Static133.aClass4_Sub11_Sub1_3.method748(2);
				if (local96 == 0) {
					Static13.anIntArray33[Static84.anInt2255++] = local67;
					local71.anInt2475 = Static117.anInt2877;
					Static51.anIntArray146[Static50.anInt1405++] = local67;
				} else {
					@Pc(140) int local140;
					@Pc(150) int local150;
					if (local96 == 1) {
						Static13.anIntArray33[Static84.anInt2255++] = local67;
						local71.anInt2475 = Static117.anInt2877;
						local140 = Static133.aClass4_Sub11_Sub1_3.method748(3);
						local71.method1608(local140, false);
						local150 = Static133.aClass4_Sub11_Sub1_3.method748(1);
						if (local150 == 1) {
							Static51.anIntArray146[Static50.anInt1405++] = local67;
						}
					} else if (local96 == 2) {
						Static13.anIntArray33[Static84.anInt2255++] = local67;
						local71.anInt2475 = Static117.anInt2877;
						local140 = Static133.aClass4_Sub11_Sub1_3.method748(3);
						local71.method1608(local140, true);
						local150 = Static133.aClass4_Sub11_Sub1_3.method748(3);
						local71.method1608(local150, true);
						@Pc(206) int local206 = Static133.aClass4_Sub11_Sub1_3.method748(1);
						if (local206 == 1) {
							Static51.anIntArray146[Static50.anInt1405++] = local67;
						}
					} else if (local96 == 3) {
						Static23.anIntArray60[Static84.anInt2252++] = local67;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZIIIIIIIIIII)Z")
	public static boolean method1305(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11;
		for (@Pc(7) int local7 = 0; local7 < 104; local7++) {
			for (local11 = 0; local11 < 104; local11++) {
				Static82.anIntArrayArray20[local7][local11] = 0;
				Static45.anIntArrayArray11[local7][local11] = 99999999;
			}
		}
		Static82.anIntArrayArray20[arg6][arg2] = 99;
		Static45.anIntArrayArray11[arg6][arg2] = 0;
		local11 = arg6;
		@Pc(53) int local53 = arg2;
		@Pc(55) int local55 = 0;
		@Pc(57) byte local57 = 0;
		Static56.anIntArray158[0] = arg6;
		@Pc(63) boolean local63 = false;
		@Pc(66) int local66 = local57 + 1;
		Static62.anIntArray177[0] = arg2;
		@Pc(71) int local71 = Static56.anIntArray158.length;
		@Pc(76) int[][] local76 = Static87.aClass60Array1[Static37.anInt895].anIntArrayArray27;
		@Pc(194) int local194;
		while (local66 != local55) {
			local53 = Static62.anIntArray177[local55];
			local11 = Static56.anIntArray158[local55];
			local55 = (local55 + 1) % local71;
			if (arg5 == local11 && arg8 == local53) {
				local63 = true;
				break;
			}
			if (arg3 != 0) {
				if ((arg3 < 5 || arg3 == 10) && Static87.aClass60Array1[Static37.anInt895].method1665(arg1, arg8, local53, arg5, arg3 - 1, local11)) {
					local63 = true;
					break;
				}
				if (arg3 < 10 && Static87.aClass60Array1[Static37.anInt895].method1650(arg5, arg3 - 1, arg1, local11, local53, arg8)) {
					local63 = true;
					break;
				}
			}
			if (arg9 != 0 && arg4 != 0 && Static87.aClass60Array1[Static37.anInt895].method1654(local53, arg9, arg4, local11, arg8, arg5, arg7)) {
				local63 = true;
				break;
			}
			local194 = Static45.anIntArrayArray11[local11][local53] + 1;
			if (local11 > 0 && Static82.anIntArrayArray20[local11 - 1][local53] == 0 && (local76[local11 - 1][local53] & 0x12C0108) == 0) {
				Static56.anIntArray158[local66] = local11 - 1;
				Static62.anIntArray177[local66] = local53;
				local66 = (local66 + 1) % local71;
				Static82.anIntArrayArray20[local11 - 1][local53] = 2;
				Static45.anIntArrayArray11[local11 - 1][local53] = local194;
			}
			if (local11 < 103 && Static82.anIntArrayArray20[local11 + 1][local53] == 0 && (local76[local11 + 1][local53] & 0x12C0180) == 0) {
				Static56.anIntArray158[local66] = local11 + 1;
				Static62.anIntArray177[local66] = local53;
				local66 = (local66 + 1) % local71;
				Static82.anIntArrayArray20[local11 + 1][local53] = 8;
				Static45.anIntArrayArray11[local11 + 1][local53] = local194;
			}
			if (local53 > 0 && Static82.anIntArrayArray20[local11][local53 - 1] == 0 && (local76[local11][local53 - 1] & 0x12C0102) == 0) {
				Static56.anIntArray158[local66] = local11;
				Static62.anIntArray177[local66] = local53 - 1;
				Static82.anIntArrayArray20[local11][local53 - 1] = 1;
				Static45.anIntArrayArray11[local11][local53 - 1] = local194;
				local66 = (local66 + 1) % local71;
			}
			if (local53 < 103 && Static82.anIntArrayArray20[local11][local53 + 1] == 0 && (local76[local11][local53 + 1] & 0x12C0120) == 0) {
				Static56.anIntArray158[local66] = local11;
				Static62.anIntArray177[local66] = local53 + 1;
				local66 = (local66 + 1) % local71;
				Static82.anIntArrayArray20[local11][local53 + 1] = 4;
				Static45.anIntArrayArray11[local11][local53 + 1] = local194;
			}
			if (local11 > 0 && local53 > 0 && Static82.anIntArrayArray20[local11 - 1][local53 - 1] == 0 && (local76[local11 - 1][local53 - 1] & 0x12C010E) == 0 && (local76[local11 - 1][local53] & 0x12C0108) == 0 && (local76[local11][local53 - 1] & 0x12C0102) == 0) {
				Static56.anIntArray158[local66] = local11 - 1;
				Static62.anIntArray177[local66] = local53 - 1;
				Static82.anIntArrayArray20[local11 - 1][local53 - 1] = 3;
				local66 = (local66 + 1) % local71;
				Static45.anIntArrayArray11[local11 - 1][local53 - 1] = local194;
			}
			if (local11 < 103 && local53 > 0 && Static82.anIntArrayArray20[local11 + 1][local53 - 1] == 0 && (local76[local11 + 1][local53 - 1] & 0x12C0183) == 0 && (local76[local11 + 1][local53] & 0x12C0180) == 0 && (local76[local11][local53 - 1] & 0x12C0102) == 0) {
				Static56.anIntArray158[local66] = local11 + 1;
				Static62.anIntArray177[local66] = local53 - 1;
				Static82.anIntArrayArray20[local11 + 1][local53 - 1] = 9;
				Static45.anIntArrayArray11[local11 + 1][local53 - 1] = local194;
				local66 = (local66 + 1) % local71;
			}
			if (local11 > 0 && local53 < 103 && Static82.anIntArrayArray20[local11 - 1][local53 + 1] == 0 && (local76[local11 - 1][local53 + 1] & 0x12C0138) == 0 && (local76[local11 - 1][local53] & 0x12C0108) == 0 && (local76[local11][local53 + 1] & 0x12C0120) == 0) {
				Static56.anIntArray158[local66] = local11 - 1;
				Static62.anIntArray177[local66] = local53 + 1;
				local66 = (local66 + 1) % local71;
				Static82.anIntArrayArray20[local11 - 1][local53 + 1] = 6;
				Static45.anIntArrayArray11[local11 - 1][local53 + 1] = local194;
			}
			if (local11 < 103 && local53 < 103 && Static82.anIntArrayArray20[local11 + 1][local53 + 1] == 0 && (local76[local11 + 1][local53 + 1] & 0x12C01E0) == 0 && (local76[local11 + 1][local53] & 0x12C0180) == 0 && (local76[local11][local53 + 1] & 0x12C0120) == 0) {
				Static56.anIntArray158[local66] = local11 + 1;
				Static62.anIntArray177[local66] = local53 + 1;
				Static82.anIntArrayArray20[local11 + 1][local53 + 1] = 12;
				local66 = (local66 + 1) % local71;
				Static45.anIntArrayArray11[local11 + 1][local53 + 1] = local194;
			}
		}
		Static49.anInt1334 = 0;
		@Pc(792) int local792;
		@Pc(799) int local799;
		@Pc(806) int local806;
		if (!local63) {
			if (!arg0) {
				return false;
			}
			local194 = 1000;
			local792 = 100;
			for (local799 = arg5 - 10; local799 <= arg5 + 10; local799++) {
				for (local806 = arg8 - 10; local806 <= arg8 + 10; local806++) {
					if (local799 >= 0 && local806 >= 0 && local799 < 104 && local806 < 104 && Static45.anIntArrayArray11[local799][local806] < 100) {
						@Pc(837) int local837 = 0;
						if (local806 < arg8) {
							local837 = arg8 - local806;
						} else if (local806 > arg4 + arg8 - 1) {
							local837 = local806 + 1 - arg8 - arg4;
						}
						@Pc(864) int local864 = 0;
						if (local799 < arg5) {
							local864 = arg5 - local799;
						} else if (local799 > arg5 + arg9 - 1) {
							local864 = local799 + 1 - arg9 - arg5;
						}
						@Pc(904) int local904 = local837 * local837 + local864 * local864;
						if (local194 > local904 || local904 == local194 && local792 > Static45.anIntArrayArray11[local799][local806]) {
							local11 = local799;
							local53 = local806;
							local194 = local904;
							local792 = Static45.anIntArrayArray11[local799][local806];
						}
					}
				}
			}
			if (local194 == 1000) {
				return false;
			}
			if (local11 == arg6 && local53 == arg2) {
				return false;
			}
			Static49.anInt1334 = 1;
		}
		@Pc(984) byte local984 = 0;
		Static56.anIntArray158[0] = local11;
		local55 = local984 + 1;
		Static62.anIntArray177[0] = local53;
		local194 = local792 = Static82.anIntArrayArray20[local11][local53];
		while (local11 != arg6 || local53 != arg2) {
			if (local792 != local194) {
				local792 = local194;
				Static56.anIntArray158[local55] = local11;
				Static62.anIntArray177[local55++] = local53;
			}
			if ((local194 & 0x2) != 0) {
				local11++;
			} else if ((local194 & 0x8) != 0) {
				local11--;
			}
			if ((local194 & 0x1) != 0) {
				local53++;
			} else if ((local194 & 0x4) != 0) {
				local53--;
			}
			local194 = Static82.anIntArrayArray20[local11][local53];
		}
		if (local55 > 0) {
			local71 = local55--;
			local799 = Static62.anIntArray177[local55];
			@Pc(1078) int local1078 = Static56.anIntArray158[local55];
			if (local71 > 25) {
				local71 = 25;
			}
			if (arg10 == 0) {
				Static38.aClass4_Sub11_Sub1_1.method752(184);
				Static38.aClass4_Sub11_Sub1_1.method701(local71 + local71 + 3);
			}
			if (arg10 == 1) {
				Static38.aClass4_Sub11_Sub1_1.method752(24);
				Static38.aClass4_Sub11_Sub1_1.method701(local71 + local71 + 17);
			}
			if (arg10 == 2) {
				Static38.aClass4_Sub11_Sub1_1.method752(110);
				Static38.aClass4_Sub11_Sub1_1.method701(local71 + local71 + 3);
			}
			Static38.aClass4_Sub11_Sub1_1.method691(local1078 + Static59.anInt1769);
			Static39.anInt971 = Static56.anIntArray158[0];
			Static27.anInt620 = Static62.anIntArray177[0];
			for (local806 = 1; local806 < local71; local806++) {
				local55--;
				Static38.aClass4_Sub11_Sub1_1.method720(Static56.anIntArray158[local55] - local1078);
				Static38.aClass4_Sub11_Sub1_1.method693(Static62.anIntArray177[local55] - local799);
			}
			Static38.aClass4_Sub11_Sub1_1.method720(Static89.aBooleanArray18[82] ? 1 : 0);
			Static38.aClass4_Sub11_Sub1_1.method700(local799 + Static98.anInt2584);
			return true;
		} else if (arg10 == 1) {
			return false;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	public static void method1306() {
		anIntArray205 = null;
		aClass22_575 = null;
		aClass33_26 = null;
		aClass22_568 = null;
		aClass22_574 = null;
		aClass22_567 = null;
		aClass22_569 = null;
		aClass22_572 = null;
		aClass22_573 = null;
		aClass22_570 = null;
		aClass22_571 = null;
	}
}
