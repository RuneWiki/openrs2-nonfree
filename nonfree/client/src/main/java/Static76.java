import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!na", name = "b", descriptor = "Lclient!na;")
	private static Class53 aClass53_844 = Static109.method1737(" ");

	@OriginalMember(owner = "client!na", name = "k", descriptor = "Lclient!na;")
	private static Class53 aClass53_845 = Static109.method1737("Add friend");

	@OriginalMember(owner = "client!na", name = "J", descriptor = "Lclient!na;")
	private static Class53 aClass53_849 = Static109.method1737("level)2");

	@OriginalMember(owner = "client!na", name = "z", descriptor = "Lclient!na;")
	public static Class53 aClass53_846 = aClass53_849;

	@OriginalMember(owner = "client!na", name = "A", descriptor = "Z")
	public static boolean aBoolean70 = false;

	@OriginalMember(owner = "client!na", name = "C", descriptor = "Lclient!na;")
	private static Class53 aClass53_847 = Static109.method1737("Loading wordpack )2 ");

	@OriginalMember(owner = "client!na", name = "G", descriptor = "Lclient!na;")
	public static Class53 aClass53_848 = Static109.method1737("swe");

	@OriginalMember(owner = "client!na", name = "L", descriptor = "Lclient!na;")
	private static Class53 aClass53_851 = Static109.method1737("Take");

	@OriginalMember(owner = "client!na", name = "K", descriptor = "Lclient!na;")
	public static Class53 aClass53_850 = aClass53_851;

	@OriginalMember(owner = "client!na", name = "M", descriptor = "I")
	public static int anInt1896 = 0;

	@OriginalMember(owner = "client!na", name = "R", descriptor = "Lclient!na;")
	public static Class53 aClass53_852 = aClass53_847;

	@OriginalMember(owner = "client!na", name = "U", descriptor = "Lclient!na;")
	public static Class53 aClass53_853 = Static109.method1737("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!na", name = "X", descriptor = "Lclient!na;")
	public static Class53 aClass53_854 = aClass53_844;

	@OriginalMember(owner = "client!na", name = "eb", descriptor = "Lclient!na;")
	public static Class53 aClass53_855 = aClass53_845;

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!hb;)V")
	public static void method1260(@OriginalArg(1) Class3_Sub10 arg0) {
		if (arg0.aClass3_Sub2_5 != null) {
			arg0.aClass3_Sub2_5.anInt2451 = 0;
		}
		arg0.aBoolean124 = false;
		for (@Pc(18) Class3_Sub10 local18 = arg0.method1867(); local18 != null; local18 = arg0.method1869()) {
			method1260(local18);
		}
	}

	@OriginalMember(owner = "client!na", name = "b", descriptor = "(B)V")
	public static void method1262() {
		aClass53_847 = null;
		aClass53_849 = null;
		aClass53_848 = null;
		aClass53_853 = null;
		aClass53_852 = null;
		aClass53_846 = null;
		aClass53_845 = null;
		aClass53_854 = null;
		aClass53_844 = null;
		aClass53_855 = null;
		aClass53_851 = null;
		aClass53_850 = null;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(BIIIIII)Z")
	public static boolean method1268(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!Static98.method1633(arg0)) {
			return false;
		}
		Static48.aClass3_Sub1_Sub15Array1 = null;
		@Pc(38) boolean local38 = Static86.method1439(0, 0, Static107.aClass3_Sub1_Sub15ArrayArray1[arg0], arg1, 0, -1, arg3, arg2, 0);
		if (Static48.aClass3_Sub1_Sub15Array1 != null) {
			Static86.method1439(Static106.anInt2444, Static78.anInt1962, Static48.aClass3_Sub1_Sub15Array1, arg1, 0, -1412584499, arg3, arg2, 0);
		}
		return local38;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(Lclient!qe;I)V")
	public static void method1270(@OriginalArg(0) Class3_Sub1_Sub4_Sub1 arg0) {
		arg0.anInt1436 = arg0.anInt1449;
		if (arg0.anInt1418 == 0) {
			arg0.anInt1476 = 0;
			return;
		}
		if (arg0.anInt1442 != -1 && arg0.anInt1460 == 0) {
			@Pc(29) Class3_Sub1_Sub11 local29 = Static97.method1629(arg0.anInt1442);
			if (arg0.anInt1420 > 0 && local29.anInt2253 == 0) {
				arg0.anInt1476++;
				return;
			}
			if (arg0.anInt1420 <= 0 && local29.anInt2258 == 0) {
				arg0.anInt1476++;
				return;
			}
		}
		@Pc(64) int local64 = arg0.anInt1427;
		@Pc(67) int local67 = arg0.anInt1424;
		@Pc(82) int local82 = arg0.anIntArray181[arg0.anInt1418 - 1] * 128 + arg0.anInt1453 * 64;
		@Pc(105) int local105 = arg0.anInt1453 * 64 + arg0.anIntArray185[arg0.anInt1418 - 1] * 128;
		if (local105 - local67 > 256 || local105 - local67 < -256 || local82 - local64 > 256 || local82 - local64 < -256) {
			arg0.anInt1424 = local105;
			arg0.anInt1427 = local82;
			return;
		}
		if (local67 >= local105) {
			if (local67 <= local105) {
				if (local64 < local82) {
					arg0.anInt1430 = 1024;
				} else if (local82 < local64) {
					arg0.anInt1430 = 0;
				}
			} else if (local82 > local64) {
				arg0.anInt1430 = 768;
			} else if (local82 < local64) {
				arg0.anInt1430 = 256;
			} else {
				arg0.anInt1430 = 512;
			}
		} else if (local64 < local82) {
			arg0.anInt1430 = 1280;
		} else if (local82 >= local64) {
			arg0.anInt1430 = 1536;
		} else {
			arg0.anInt1430 = 1792;
		}
		@Pc(225) int local225 = arg0.anInt1430 - arg0.anInt1426 & 0x7FF;
		@Pc(228) int local228 = arg0.anInt1441;
		if (local225 > 1024) {
			local225 -= 2048;
		}
		if (local225 >= -256 && local225 <= 256) {
			local228 = arg0.anInt1437;
		} else if (local225 >= 256 && local225 < 768) {
			local228 = arg0.anInt1414;
		} else if (local225 >= -768 && local225 <= -256) {
			local228 = arg0.anInt1440;
		}
		if (local228 == -1) {
			local228 = arg0.anInt1437;
		}
		arg0.anInt1436 = local228;
		@Pc(280) int local280 = 4;
		@Pc(282) boolean local282 = true;
		if (arg0 instanceof Class3_Sub1_Sub4_Sub1_Sub1) {
			local282 = ((Class3_Sub1_Sub4_Sub1_Sub1) arg0).aClass3_Sub1_Sub1_1.aBoolean4;
		}
		if (local282) {
			if (arg0.anInt1430 != arg0.anInt1426 && arg0.anInt1417 == -1 && arg0.anInt1438 != 0) {
				local280 = 2;
			}
			if (arg0.anInt1418 > 2) {
				local280 = 6;
			}
			if (arg0.anInt1418 > 3) {
				local280 = 8;
			}
			if (arg0.anInt1476 > 0 && arg0.anInt1418 > 1) {
				local280 = 8;
				arg0.anInt1476--;
			}
		} else {
			if (arg0.anInt1418 > 1) {
				local280 = 6;
			}
			if (arg0.anInt1418 > 2) {
				local280 = 8;
			}
			if (arg0.anInt1476 > 0 && arg0.anInt1418 > 1) {
				local280 = 8;
				arg0.anInt1476--;
			}
		}
		if (arg0.aBooleanArray7[arg0.anInt1418 - 1]) {
			local280 <<= 0x1;
		}
		if (local67 < local105) {
			arg0.anInt1424 += local280;
			if (arg0.anInt1424 > local105) {
				arg0.anInt1424 = local105;
			}
		} else if (local67 > local105) {
			arg0.anInt1424 -= local280;
			if (arg0.anInt1424 < local105) {
				arg0.anInt1424 = local105;
			}
		}
		if (local280 >= 8 && arg0.anInt1437 == arg0.anInt1436 && arg0.anInt1463 != -1) {
			arg0.anInt1436 = arg0.anInt1463;
		}
		if (local82 > local64) {
			arg0.anInt1427 += local280;
			if (local82 < arg0.anInt1427) {
				arg0.anInt1427 = local82;
			}
		} else if (local82 < local64) {
			arg0.anInt1427 -= local280;
			if (local82 > arg0.anInt1427) {
				arg0.anInt1427 = local82;
			}
		}
		if (arg0.anInt1424 == local105 && arg0.anInt1427 == local82) {
			if (arg0.anInt1420 > 0) {
				arg0.anInt1420--;
			}
			arg0.anInt1418--;
		}
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIZIILclient!vb;II)V")
	public static void method1279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub1_Sub15 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static69.aBoolean64) {
			Static29.anInt1015 = 32;
		} else {
			Static29.anInt1015 = 0;
		}
		Static69.aBoolean64 = false;
		@Pc(156) int local156;
		if (arg4 >= arg3 && arg3 + 16 > arg4 && arg7 >= arg2 && arg2 + 16 > arg7) {
			if (arg1 == 2 || arg1 == 3) {
				Static52.aBoolean50 = true;
			}
			if (arg1 == 1) {
				Static36.aBoolean40 = true;
			}
			arg5.anInt2724 -= Static43.anInt1236 * 4;
		} else if (arg3 <= arg4 && arg4 < arg3 + 16 && arg7 >= arg6 + arg2 - 16 && arg7 < arg2 + arg6) {
			if (arg1 == 1) {
				Static36.aBoolean40 = true;
			}
			arg5.anInt2724 += Static43.anInt1236 * 4;
			if (arg1 == 2 || arg1 == 3) {
				Static52.aBoolean50 = true;
			}
		} else if (arg3 - Static29.anInt1015 <= arg4 && arg4 < arg3 + Static29.anInt1015 + 16 && arg2 + 16 <= arg7 && arg6 + arg2 - 16 > arg7 && Static43.anInt1236 > 0) {
			if (arg1 == 2 || arg1 == 3) {
				Static52.aBoolean50 = true;
			}
			Static69.aBoolean64 = true;
			if (arg1 == 1) {
				Static36.aBoolean40 = true;
			}
			local156 = arg6 * (arg6 - 32) / arg0;
			if (local156 < 8) {
				local156 = 8;
			}
			@Pc(168) int local168 = arg6 - local156 - 32;
			@Pc(179) int local179 = arg7 - arg2 - local156 / 2 - 16;
			arg5.anInt2724 = local179 * (arg0 - arg6) / local168;
		}
		if (Static43.anInt1234 == 0) {
			return;
		}
		local156 = arg5.anInt2727;
		if (arg1 == -1) {
			local156 = 479;
		}
		if (arg4 < arg3 - local156 || arg2 > arg7 || arg4 >= arg3 + 16 || arg6 + arg2 < arg7) {
			return;
		}
		if (arg1 == 1) {
			Static36.aBoolean40 = true;
		}
		if (arg1 == 2 || arg1 == 3) {
			Static52.aBoolean50 = true;
		}
		arg5.anInt2724 += Static43.anInt1234 * 45;
		return;
	}

	@OriginalMember(owner = "client!na", name = "a", descriptor = "(ILclient!q;Lclient!dd;B)V")
	public static void method1295(@OriginalArg(0) int arg0, @OriginalArg(1) Class62_Sub1 arg1, @OriginalArg(2) Class17 arg2) {
		@Pc(3) byte[] local3 = null;
		@Pc(5) Class11 local5 = Static100.aClass11_11;
		synchronized (Static100.aClass11_11) {
			for (@Pc(12) Class3_Sub9 local12 = (Class3_Sub9) Static100.aClass11_11.method189(); local12 != null; local12 = (Class3_Sub9) Static100.aClass11_11.method187()) {
				if ((long) arg0 == local12.aLong94 && arg2 == local12.aClass17_1 && local12.anInt1119 == 0) {
					local3 = local12.aByteArray18;
					break;
				}
			}
		}
		if (local3 == null) {
			@Pc(68) byte[] local68 = arg2.method393(arg0);
			arg1.method1523(local68, arg0, arg2, true);
		} else {
			arg1.method1523(local3, arg0, arg2, true);
		}
	}
}
