import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!va", name = "s", descriptor = "Lclient!rg;")
	public static Class3_Sub2_Sub13 aClass3_Sub2_Sub13_1;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!nb;")
	public static Class57 aClass57_29 = new Class57(100);

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!kb;")
	private static Class46 aClass46_1350 = Static65.method1172("Loading title screen )2 ");

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1349 = aClass46_1350;

	@OriginalMember(owner = "client!va", name = "r", descriptor = "I")
	public static int anInt3767 = -1;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
	public static void method2712() {
		Static85.anIntArray48 = new int[151];
		Static23.anIntArray38 = new int[33];
		Static180.anIntArray442 = new int[33];
		Static121.anIntArray328 = new int[151];
		@Pc(28) int local28;
		@Pc(26) int local26;
		@Pc(30) int local30;
		for (@Pc(22) int local22 = 0; local22 < 33; local22++) {
			local26 = 0;
			local28 = 999;
			for (local30 = 0; local30 < 34; local30++) {
				if (Static54.aClass3_Sub2_Sub3_Sub2_2.aByteArray20[local30 + local22 * Static54.aClass3_Sub2_Sub3_Sub2_2.anInt2494] == 0) {
					if (local28 == 999) {
						local28 = local30;
					}
				} else if (local28 != 999) {
					local26 = local30;
					break;
				}
			}
			Static180.anIntArray442[local22] = local28;
			Static23.anIntArray38[local22] = local26 - local28;
		}
		for (local28 = 5; local28 < 156; local28++) {
			local26 = 999;
			local30 = 0;
			for (@Pc(96) int local96 = 25; local96 < 172; local96++) {
				if (Static54.aClass3_Sub2_Sub3_Sub2_2.aByteArray20[Static54.aClass3_Sub2_Sub3_Sub2_2.anInt2494 * local28 + local96] == 0 && (local96 > 34 || local28 > 34)) {
					if (local26 == 999) {
						local26 = local96;
					}
				} else if (local26 != 999) {
					local30 = local96;
					break;
				}
			}
			Static85.anIntArray48[local28 - 5] = local26 - 25;
			Static121.anIntArray328[local28 - 5] = local30 - local26;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IB)V")
	public static void method2713(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static57.method1063(arg0)) {
			return;
		}
		@Pc(20) Class33[] local20 = Static26.aClass33ArrayArray1[arg0];
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(28) Class33 local28 = local20[local22];
			if (local28.anObjectArray23 != null) {
				@Pc(35) Class3_Sub14 local35 = new Class3_Sub14();
				local35.anObjectArray28 = local28.anObjectArray23;
				local35.aClass33_10 = local28;
				Static96.method1594(2000000, local35);
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!mc;I)V")
	public static void method2714(@OriginalArg(0) Class3_Sub2_Sub1_Sub1 arg0) {
		arg0.anInt1719 = arg0.anInt1683;
		if (arg0.anInt1724 == 0) {
			arg0.anInt1709 = 0;
			return;
		}
		if (arg0.anInt1738 != -1 && arg0.anInt1726 == 0) {
			@Pc(31) Class3_Sub2_Sub2 local31 = Static35.method628(arg0.anInt1738);
			if (arg0.anInt1715 > 0 && local31.anInt946 == 0) {
				arg0.anInt1709++;
				return;
			}
			if (arg0.anInt1715 <= 0 && local31.anInt950 == 0) {
				arg0.anInt1709++;
				return;
			}
		}
		@Pc(68) int local68 = arg0.anInt1700;
		@Pc(71) int local71 = arg0.anInt1711;
		@Pc(86) int local86 = arg0.anInt1712 * 64 + arg0.anIntArray160[arg0.anInt1724 - 1] * 128;
		@Pc(101) int local101 = arg0.anInt1712 * 64 + arg0.anIntArray163[arg0.anInt1724 - 1] * 128;
		if (local86 - local68 > 256 || local86 - local68 < -256 || local101 - local71 > 256 || local101 - local71 < -256) {
			arg0.anInt1700 = local86;
			arg0.anInt1711 = local101;
			return;
		}
		if (local68 >= local86) {
			if (local68 <= local86) {
				if (local101 > local71) {
					arg0.anInt1732 = 1024;
				} else if (local101 < local71) {
					arg0.anInt1732 = 0;
				}
			} else if (local101 > local71) {
				arg0.anInt1732 = 768;
			} else if (local71 > local101) {
				arg0.anInt1732 = 256;
			} else {
				arg0.anInt1732 = 512;
			}
		} else if (local71 < local101) {
			arg0.anInt1732 = 1280;
		} else if (local71 > local101) {
			arg0.anInt1732 = 1792;
		} else {
			arg0.anInt1732 = 1536;
		}
		@Pc(214) int local214 = arg0.anInt1732 - arg0.anInt1736 & 0x7FF;
		@Pc(216) boolean local216 = true;
		@Pc(218) int local218 = 4;
		@Pc(221) int local221 = arg0.anInt1737;
		if (local214 > 1024) {
			local214 -= 2048;
		}
		if (local214 >= -256 && local214 <= 256) {
			local221 = arg0.anInt1713;
		} else if (local214 >= 256 && local214 < 768) {
			local221 = arg0.anInt1710;
		} else if (local214 >= -768 && local214 <= -256) {
			local221 = arg0.anInt1697;
		}
		if (local221 == -1) {
			local221 = arg0.anInt1713;
		}
		arg0.anInt1719 = local221;
		if (arg0 instanceof Class3_Sub2_Sub1_Sub1_Sub2) {
			local216 = ((Class3_Sub2_Sub1_Sub1_Sub2) arg0).aClass3_Sub2_Sub16_1.aBoolean162;
		}
		if (local216) {
			if (arg0.anInt1736 != arg0.anInt1732 && arg0.anInt1723 == -1 && arg0.anInt1682 != 0) {
				local218 = 2;
			}
			if (arg0.anInt1724 > 2) {
				local218 = 6;
			}
			if (arg0.anInt1724 > 3) {
				local218 = 8;
			}
			if (arg0.anInt1709 > 0 && arg0.anInt1724 > 1) {
				local218 = 8;
				arg0.anInt1709--;
			}
		} else {
			if (arg0.anInt1724 > 1) {
				local218 = 6;
			}
			if (arg0.anInt1724 > 2) {
				local218 = 8;
			}
			if (arg0.anInt1709 > 0 && arg0.anInt1724 > 1) {
				local218 = 8;
				arg0.anInt1709--;
			}
		}
		if (arg0.aBooleanArray8[arg0.anInt1724 - 1]) {
			local218 <<= 0x1;
		}
		if (local101 > local71) {
			arg0.anInt1711 += local218;
			if (local101 < arg0.anInt1711) {
				arg0.anInt1711 = local101;
			}
		} else if (local71 > local101) {
			arg0.anInt1711 -= local218;
			if (local101 > arg0.anInt1711) {
				arg0.anInt1711 = local101;
			}
		}
		if (local218 >= 8 && arg0.anInt1713 == arg0.anInt1719 && arg0.anInt1688 != -1) {
			arg0.anInt1719 = arg0.anInt1688;
		}
		if (local86 > local68) {
			arg0.anInt1700 += local218;
			if (arg0.anInt1700 > local86) {
				arg0.anInt1700 = local86;
			}
		} else if (local86 < local68) {
			arg0.anInt1700 -= local218;
			if (local86 > arg0.anInt1700) {
				arg0.anInt1700 = local86;
			}
		}
		if (local86 != arg0.anInt1700 || arg0.anInt1711 != local101) {
			return;
		}
		arg0.anInt1724--;
		if (arg0.anInt1715 > 0) {
			arg0.anInt1715--;
			return;
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method2715() {
		aClass46_1349 = null;
		aClass3_Sub2_Sub13_1 = null;
		aClass46_1350 = null;
		aClass57_29 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(II)Z")
	public static boolean method2716(@OriginalArg(1) int arg0) {
		return (arg0 >> 28 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!va", name = "b", descriptor = "(II)Lclient!o;")
	public static Class3_Sub2_Sub10 method2717(@OriginalArg(1) int arg0) {
		@Pc(10) Class3_Sub2_Sub10 local10 = (Class3_Sub2_Sub10) Static22.aClass57_5.method1719((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static46.aClass44_6.method1624(8, arg0);
		local10 = new Class3_Sub2_Sub10();
		if (local20 != null) {
			local10.method1825(new Class3_Sub4(local20));
		}
		Static22.aClass57_5.method1717(local10, (long) arg0);
		return local10;
	}
}
