import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static73 {

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "[[I")
	public static int[][] anIntArrayArray13;

	@OriginalMember(owner = "client!oe", name = "s", descriptor = "Lclient!e;")
	public static Class2_Sub1_Sub2_Sub2 aClass2_Sub1_Sub2_Sub2_19;

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!a;")
	private static Class1 aClass1_2047 = Static94.method1596("Please remove ");

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "Lclient!a;")
	public static Class1 aClass1_2046 = aClass1_2047;

	@OriginalMember(owner = "client!oe", name = "f", descriptor = "Lclient!a;")
	public static Class1 aClass1_2048 = Static94.method1596("System)2Update in: ");

	@OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
	public static int anInt1981 = 0;

	@OriginalMember(owner = "client!oe", name = "j", descriptor = "Lclient!a;")
	public static Class1 aClass1_2049 = aClass1_2047;

	@OriginalMember(owner = "client!oe", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray6 = new byte[250][];

	@OriginalMember(owner = "client!oe", name = "l", descriptor = "I")
	public static int anInt1984 = 256;

	@OriginalMember(owner = "client!oe", name = "m", descriptor = "Lclient!a;")
	public static Class1 aClass1_2050 = Static94.method1596("(U");

	@OriginalMember(owner = "client!oe", name = "n", descriptor = "I")
	public static int anInt1985 = 0;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "Lclient!a;")
	public static Class1 aClass1_2051 = Static94.method1596("null");

	@OriginalMember(owner = "client!oe", name = "t", descriptor = "I")
	public static int anInt1989 = -1;

	@OriginalMember(owner = "client!oe", name = "u", descriptor = "I")
	public static int anInt1990 = 0;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IILclient!a;Lclient!a;)V")
	public static void method1372(@OriginalArg(1) int arg0, @OriginalArg(2) Class1 arg1, @OriginalArg(3) Class1 arg2) {
		if (Static72.anInt1978 == -1) {
			Static87.aBoolean137 = true;
		}
		if (arg0 == 0 && Static81.anInt2140 != -1) {
			Static103.anInt2617 = 0;
			Static55.aClass1_665 = arg1;
		}
		for (@Pc(22) int local22 = 99; local22 > 0; local22--) {
			Static111.anIntArray351[local22] = Static111.anIntArray351[local22 - 1];
			Static107.aClass1Array28[local22] = Static107.aClass1Array28[local22 - 1];
			Static67.aClass1Array29[local22] = Static67.aClass1Array29[local22 - 1];
		}
		Static111.anIntArray351[0] = arg0;
		Static107.aClass1Array28[0] = arg2;
		Static67.aClass1Array29[0] = arg1;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public static void method1373() {
		aClass1_2048 = null;
		aClass2_Sub1_Sub2_Sub2_19 = null;
		aClass1_2047 = null;
		aByteArrayArray6 = null;
		aClass1_2050 = null;
		aClass1_2046 = null;
		aClass1_2049 = null;
		anIntArrayArray13 = null;
		aClass1_2051 = null;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(II)Lclient!ta;")
	public static Class2_Sub1_Sub17 method1374(@OriginalArg(0) int arg0) {
		@Pc(10) Class2_Sub1_Sub17 local10 = (Class2_Sub1_Sub17) Static34.aClass11_12.method431((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static47.aClass8_17.method1684(arg0, 10);
		local10 = new Class2_Sub1_Sub17();
		local10.anInt2467 = arg0;
		if (local20 != null) {
			local10.method1637(new Class2_Sub3(local20));
		}
		local10.method1627();
		if (local10.anInt2427 != -1) {
			local10.method1638(method1374(local10.anInt2427), method1374(local10.anInt2432));
		}
		if (!Static79.aBoolean117 && local10.aBoolean144) {
			local10.aClass1Array22 = null;
			local10.anInt2441 = 0;
			local10.aClass1Array23 = null;
			local10.aClass1_2571 = Static51.aClass1_1749;
		}
		Static34.aClass11_12.method430((long) arg0, local10);
		return local10;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILclient!nb;)V")
	public static void method1375(@OriginalArg(1) Class2_Sub1_Sub1_Sub1 arg0) {
		arg0.anInt2708 = arg0.anInt2747;
		if (arg0.anInt2734 == 0) {
			arg0.anInt2705 = 0;
			return;
		}
		if (arg0.anInt2759 != -1 && arg0.anInt2744 == 0) {
			@Pc(32) Class2_Sub1_Sub9 local32 = Static4.method192(arg0.anInt2759);
			if (arg0.anInt2720 > 0 && local32.anInt1430 == 0) {
				arg0.anInt2705++;
				return;
			}
			if (arg0.anInt2720 <= 0 && local32.anInt1432 == 0) {
				arg0.anInt2705++;
				return;
			}
		}
		@Pc(67) int local67 = arg0.anInt2724;
		@Pc(83) int local83 = arg0.anIntArray341[arg0.anInt2734 - 1] * 128 + arg0.anInt2722 * 64;
		@Pc(86) int local86 = arg0.anInt2717;
		@Pc(101) int local101 = arg0.anInt2722 * 64 + arg0.anIntArray343[arg0.anInt2734 - 1] * 128;
		if (local83 - local67 > 256 || local83 - local67 < -256 || local101 - local86 > 256 || local101 - local86 < -256) {
			arg0.anInt2724 = local83;
			arg0.anInt2717 = local101;
			return;
		}
		if (local67 < local83) {
			if (local86 < local101) {
				arg0.anInt2711 = 1280;
			} else if (local101 < local86) {
				arg0.anInt2711 = 1792;
			} else {
				arg0.anInt2711 = 1536;
			}
		} else if (local67 <= local83) {
			if (local101 > local86) {
				arg0.anInt2711 = 1024;
			} else if (local101 < local86) {
				arg0.anInt2711 = 0;
			}
		} else if (local86 < local101) {
			arg0.anInt2711 = 768;
		} else if (local101 < local86) {
			arg0.anInt2711 = 256;
		} else {
			arg0.anInt2711 = 512;
		}
		@Pc(223) int local223 = arg0.anInt2710;
		@Pc(225) int local225 = 4;
		if (arg0.anInt2711 != arg0.anInt2741 && arg0.anInt2756 == -1 && arg0.anInt2737 != 0) {
			local225 = 2;
		}
		if (arg0.anInt2734 > 2) {
			local225 = 6;
		}
		if (arg0.anInt2734 > 3) {
			local225 = 8;
		}
		@Pc(261) int local261 = arg0.anInt2711 - arg0.anInt2741 & 0x7FF;
		if (local261 > 1024) {
			local261 -= 2048;
		}
		if (local261 >= -256 && local261 <= 256) {
			local223 = arg0.anInt2752;
		} else if (local261 >= 256 && local261 < 768) {
			local223 = arg0.anInt2753;
		} else if (local261 >= -768 && local261 <= -256) {
			local223 = arg0.anInt2706;
		}
		if (local223 == -1) {
			local223 = arg0.anInt2752;
		}
		arg0.anInt2708 = local223;
		if (arg0.anInt2705 > 0 && arg0.anInt2734 > 1) {
			arg0.anInt2705--;
			local225 = 8;
		}
		if (arg0.aBooleanArray19[arg0.anInt2734 - 1]) {
			local225 <<= 0x1;
		}
		if (local86 < local101) {
			arg0.anInt2717 += local225;
			if (arg0.anInt2717 > local101) {
				arg0.anInt2717 = local101;
			}
		} else if (local86 > local101) {
			arg0.anInt2717 -= local225;
			if (arg0.anInt2717 < local101) {
				arg0.anInt2717 = local101;
			}
		}
		if (local225 >= 8 && arg0.anInt2752 == arg0.anInt2708 && arg0.anInt2713 != -1) {
			arg0.anInt2708 = arg0.anInt2713;
		}
		if (local67 < local83) {
			arg0.anInt2724 += local225;
			if (local83 < arg0.anInt2724) {
				arg0.anInt2724 = local83;
			}
		} else if (local83 < local67) {
			arg0.anInt2724 -= local225;
			if (local83 > arg0.anInt2724) {
				arg0.anInt2724 = local83;
			}
		}
		if (arg0.anInt2724 == local83 && local101 == arg0.anInt2717) {
			if (arg0.anInt2720 > 0) {
				arg0.anInt2720--;
			}
			arg0.anInt2734--;
		}
	}
}
