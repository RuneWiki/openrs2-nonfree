import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "Lclient!s;")
	public static Class6_Sub2_Sub9 aClass6_Sub2_Sub9_1;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "I")
	public static int anInt27;

	@OriginalMember(owner = "client!ab", name = "G", descriptor = "[I")
	public static int[] anIntArray5;

	@OriginalMember(owner = "client!ab", name = "I", descriptor = "I")
	public static int anInt28;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "Lclient!rc;")
	private static Class55 aClass55_7 = Static34.method846("Invalid username or password)3");

	@OriginalMember(owner = "client!ab", name = "b", descriptor = "Lclient!rc;")
	private static Class55 aClass55_8 = Static34.method846("Report abuse");

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "Lclient!rc;")
	public static Class55 aClass55_9 = aClass55_7;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "Lclient!rc;")
	public static Class55 aClass55_10 = aClass55_8;

	@OriginalMember(owner = "client!ab", name = "j", descriptor = "Lclient!rc;")
	public static Class55 aClass55_11 = Static34.method846("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "Ljava/lang/Object;")
	public static Object anObject1 = new Object();

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "Lclient!rc;")
	public static Class55 aClass55_12 = Static34.method846("Diese Welt ist voll)3");

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "Lclient!rc;")
	public static Class55 aClass55_13 = Static34.method846("Ihre Nachricht an: ");

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "Lclient!rc;")
	public static Class55 aClass55_14 = Static34.method846("m-Ochte sich mit Ihnen duellieren)3");

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "Lclient!rc;")
	public static Class55 aClass55_15 = Static34.method846("(Udns");

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "Z")
	public static boolean aBoolean1 = false;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V")
	public static void method21() {
		aClass55_11 = null;
		anIntArray5 = null;
		aClass55_12 = null;
		aClass55_13 = null;
		anObject1 = null;
		aClass55_9 = null;
		aClass55_14 = null;
		aClass55_15 = null;
		aClass6_Sub2_Sub9_1 = null;
		aClass55_10 = null;
		aClass55_8 = null;
		aClass55_7 = null;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILclient!jd;)V")
	public static void method22(@OriginalArg(1) Class6_Sub2_Sub3_Sub1 arg0) {
		arg0.anInt2741 = arg0.anInt2756;
		if (arg0.anInt2737 == 0) {
			arg0.anInt2720 = 0;
			return;
		}
		if (arg0.anInt2717 != -1 && arg0.anInt2711 == 0) {
			@Pc(32) Class6_Sub2_Sub13 local32 = Static4.method1608(arg0.anInt2717);
			if (arg0.anInt2740 > 0 && local32.anInt2803 == 0) {
				arg0.anInt2720++;
				return;
			}
			if (arg0.anInt2740 <= 0 && local32.anInt2814 == 0) {
				arg0.anInt2720++;
				return;
			}
		}
		@Pc(67) int local67 = arg0.anInt2710;
		@Pc(70) int local70 = arg0.anInt2744;
		@Pc(85) int local85 = arg0.anInt2708 * 64 + arg0.anIntArray256[arg0.anInt2737 - 1] * 128;
		@Pc(100) int local100 = arg0.anIntArray255[arg0.anInt2737 - 1] * 128 + arg0.anInt2708 * 64;
		if (local85 - local67 > 256 || local85 - local67 < -256 || local100 - local70 > 256 || local100 - local70 < -256) {
			arg0.anInt2710 = local85;
			arg0.anInt2744 = local100;
			return;
		}
		if (local67 >= local85) {
			if (local67 > local85) {
				if (local100 > local70) {
					arg0.anInt2727 = 768;
				} else if (local70 > local100) {
					arg0.anInt2727 = 256;
				} else {
					arg0.anInt2727 = 512;
				}
			} else if (local70 < local100) {
				arg0.anInt2727 = 1024;
			} else if (local70 > local100) {
				arg0.anInt2727 = 0;
			}
		} else if (local100 > local70) {
			arg0.anInt2727 = 1280;
		} else if (local100 < local70) {
			arg0.anInt2727 = 1792;
		} else {
			arg0.anInt2727 = 1536;
		}
		@Pc(215) int local215 = arg0.anInt2727 - arg0.anInt2707 & 0x7FF;
		@Pc(222) int local222 = arg0.anInt2751;
		if (local215 > 1024) {
			local215 -= 2048;
		}
		if (local215 >= -256 && local215 <= 256) {
			local222 = arg0.anInt2747;
		} else if (local215 >= 256 && local215 < 768) {
			local222 = arg0.anInt2736;
		} else if (local215 >= -768 && local215 <= -256) {
			local222 = arg0.anInt2732;
		}
		if (local222 == -1) {
			local222 = arg0.anInt2747;
		}
		@Pc(272) int local272 = 4;
		if (arg0.anInt2707 != arg0.anInt2727 && arg0.anInt2698 == -1 && arg0.anInt2728 != 0) {
			local272 = 2;
		}
		if (arg0.anInt2737 > 2) {
			local272 = 6;
		}
		if (arg0.anInt2737 > 3) {
			local272 = 8;
		}
		arg0.anInt2741 = local222;
		if (arg0.anInt2720 > 0 && arg0.anInt2737 > 1) {
			arg0.anInt2720--;
			local272 = 8;
		}
		if (arg0.aBooleanArray11[arg0.anInt2737 - 1]) {
			local272 <<= 0x1;
		}
		if (local272 >= 8 && arg0.anInt2747 == arg0.anInt2741 && arg0.anInt2697 != -1) {
			arg0.anInt2741 = arg0.anInt2697;
		}
		if (local85 > local67) {
			arg0.anInt2710 += local272;
			if (arg0.anInt2710 > local85) {
				arg0.anInt2710 = local85;
			}
		} else if (local85 < local67) {
			arg0.anInt2710 -= local272;
			if (arg0.anInt2710 < local85) {
				arg0.anInt2710 = local85;
			}
		}
		if (local100 > local70) {
			arg0.anInt2744 += local272;
			if (arg0.anInt2744 > local100) {
				arg0.anInt2744 = local100;
			}
		} else if (local100 < local70) {
			arg0.anInt2744 -= local272;
			if (local100 > arg0.anInt2744) {
				arg0.anInt2744 = local100;
			}
		}
		if (arg0.anInt2710 != local85 || local100 != arg0.anInt2744) {
			return;
		}
		arg0.anInt2737--;
		if (arg0.anInt2740 > 0) {
			arg0.anInt2740--;
			return;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZI)V")
	public static void method27(@OriginalArg(0) boolean arg0) {
		for (@Pc(12) int local12 = 0; local12 < Static111.anInt3173; local12++) {
			@Pc(20) Class6_Sub2_Sub3_Sub1_Sub2 local20 = Static15.aClass6_Sub2_Sub3_Sub1_Sub2Array1[Static19.anIntArray60[local12]];
			@Pc(28) int local28 = (Static19.anIntArray60[local12] << 14) + 536870912;
			if (local20 != null && local20.method1826() && arg0 == local20.aClass6_Sub2_Sub4_1.aBoolean38 && local20.aClass6_Sub2_Sub4_1.method541()) {
				@Pc(55) int local55 = local20.anInt2710 >> 7;
				@Pc(60) int local60 = local20.anInt2744 >> 7;
				if (local55 >= 0 && local55 < 104 && local60 >= 0 && local60 < 104) {
					if (local20.anInt2708 == 1 && (local20.anInt2710 & 0x7F) == 64 && (local20.anInt2744 & 0x7F) == 64) {
						if (Static86.anInt2443 == Static34.anIntArrayArray4[local55][local60]) {
							continue;
						}
						Static34.anIntArrayArray4[local55][local60] = Static86.anInt2443;
					}
					if (!local20.aClass6_Sub2_Sub4_1.aBoolean39) {
						local28 += Integer.MIN_VALUE;
					}
					Static109.aClass34_1.method1037(Static56.anInt1718, local20.anInt2710, local20.anInt2744, Static112.method2073(Static56.anInt1718, local20.anInt2710 + local20.anInt2708 * 64 - 64, local20.anInt2744 - -(local20.anInt2708 * 64) - 64), local20.anInt2708 * 64 + 60 - 64, local20, local20.anInt2707, local28, local20.aBoolean126);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB)Lclient!bb;")
	public static Class6_Sub2_Sub1 method28(@OriginalArg(0) int arg0) {
		@Pc(6) Class6_Sub2_Sub1 local6 = (Class6_Sub2_Sub1) Static33.aClass36_15.method1154((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(20) byte[] local20 = Static28.aClass40_17.method1243(arg0, 1);
		local6 = new Class6_Sub2_Sub1();
		if (local20 != null) {
			local6.method237(arg0, new Class6_Sub1(local20));
		}
		local6.method243();
		Static33.aClass36_15.method1161((long) arg0, local6);
		return local6;
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(I)V")
	public static void method30() {
		Static48.aBoolean71 = true;
		Static90.aBoolean119 = true;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!pb;II)[B")
	public static byte[] method33(@OriginalArg(0) int arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(22) long local22 = (long) (arg2 + arg0 * 37 & 0xFFFF) + (long) (arg0 << 16) + ((long) arg3 << 32);
		if (Static110.aClass36_37 != null) {
			@Pc(36) Class6_Sub2_Sub17 local36 = (Class6_Sub2_Sub17) Static110.aClass36_37.method1154(local22);
			if (local36 != null) {
				return local36.aByteArray24;
			}
		}
		@Pc(47) byte[] local47 = arg1.method1243(arg2, arg0);
		if (local47 == null) {
			return null;
		} else {
			if (Static110.aClass36_37 != null) {
				Static110.aClass36_37.method1161(local22, new Class6_Sub2_Sub17(local47));
			}
			return local47;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(II[Lclient!rc;I)Lclient!rc;")
	public static Class55 method36(@OriginalArg(0) int arg0, @OriginalArg(2) Class55[] arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = 0;
		for (@Pc(9) int local9 = 0; local9 < arg2; local9++) {
			if (arg1[arg0 + local9] == null) {
				arg1[arg0 + local9] = Static29.aClass55_435;
			}
			local7 += arg1[local9 + arg0].anInt2411;
		}
		@Pc(40) byte[] local40 = new byte[local7];
		@Pc(42) int local42 = 0;
		@Pc(57) Class55 local57;
		for (@Pc(49) int local49 = 0; local49 < arg2; local49++) {
			local57 = arg1[arg0 + local49];
			Static120.method1341(local57.aByteArray12, 0, local40, local42, local57.anInt2411);
			local42 += local57.anInt2411;
		}
		local57 = new Class55();
		local57.anInt2411 = local7;
		local57.aByteArray12 = local40;
		return local57;
	}
}
