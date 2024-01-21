import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ve", name = "k", descriptor = "Lclient!vb;")
	public static Class11_Sub1 aClass11_Sub1_106;

	@OriginalMember(owner = "client!ve", name = "l", descriptor = "Lclient!sd;")
	public static Class2 aClass2_24;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1297 = Static56.method972("Press (Wrecover a locked account(W on front page)3");

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1298 = Static56.method972("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ve", name = "y", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1307 = Static56.method972("");

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1299 = aClass5_1307;

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1300 = aClass5_1307;

	@OriginalMember(owner = "client!ve", name = "h", descriptor = "[I")
	public static int[] anIntArray373 = new int[2000];

	@OriginalMember(owner = "client!ve", name = "i", descriptor = "I")
	public static int anInt2891 = 0;

	@OriginalMember(owner = "client!ve", name = "j", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1301 = aClass5_1307;

	@OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
	public static int anInt2892 = 1;

	@OriginalMember(owner = "client!ve", name = "n", descriptor = "I")
	public static int anInt2893 = 0;

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1302 = aClass5_1307;

	@OriginalMember(owner = "client!ve", name = "s", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1303 = aClass5_1307;

	@OriginalMember(owner = "client!ve", name = "u", descriptor = "Lclient!ae;")
	private static Class5 aClass5_1304 = Static56.method972("Malformed login packet)3");

	@OriginalMember(owner = "client!ve", name = "v", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1305 = aClass5_1297;

	@OriginalMember(owner = "client!ve", name = "w", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1306 = aClass5_1307;

	@OriginalMember(owner = "client!ve", name = "z", descriptor = "Lclient!ae;")
	public static Class5 aClass5_1308 = aClass5_1304;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public static void method1912() {
		Static19.aClass9_8.method283();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!ed;IZ)Z")
	public static boolean method1913(@OriginalArg(1) Class23 arg0, @OriginalArg(3) boolean arg1) {
		return Static7.method195(arg0, arg1);
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
	public static void method1914() {
		aClass5_1307 = null;
		anIntArray373 = null;
		aClass11_Sub1_106 = null;
		aClass5_1299 = null;
		aClass5_1304 = null;
		aClass5_1301 = null;
		aClass5_1300 = null;
		aClass5_1306 = null;
		aClass5_1303 = null;
		aClass5_1297 = null;
		aClass5_1305 = null;
		aClass2_24 = null;
		aClass5_1298 = null;
		aClass5_1308 = null;
		aClass5_1302 = null;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public static void method1915() {
		Static2.aClass9_1.method283();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
	public static void method1916() {
		try {
			@Pc(10) Graphics local10 = Static62.aCanvas1.getGraphics();
			Static115.aClass2_27.method1322(local10, 550, 4);
		} catch (@Pc(18) Exception local18) {
			Static62.aCanvas1.repaint();
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!mc;)V")
	public static void method1917(@OriginalArg(1) Class3_Sub1_Sub1_Sub1 arg0) {
		arg0.anInt1568 = arg0.anInt1579;
		if (arg0.anInt1574 == 0) {
			arg0.anInt1542 = 0;
			return;
		}
		if (arg0.anInt1536 != -1 && arg0.anInt1570 == 0) {
			@Pc(28) Class3_Sub1_Sub11 local28 = Static31.method778(arg0.anInt1536);
			if (arg0.anInt1519 > 0 && local28.anInt1933 == 0) {
				arg0.anInt1542++;
				return;
			}
			if (arg0.anInt1519 <= 0 && local28.anInt1931 == 0) {
				arg0.anInt1542++;
				return;
			}
		}
		@Pc(60) int local60 = arg0.anInt1567;
		@Pc(63) int local63 = arg0.anInt1543;
		@Pc(78) int local78 = arg0.anIntArray177[arg0.anInt1574 - 1] * 128 + arg0.anInt1562 * 64;
		@Pc(94) int local94 = arg0.anIntArray181[arg0.anInt1574 - 1] * 128 + arg0.anInt1562 * 64;
		if (local94 - local60 > 256 || local94 - local60 < -256 || local78 - local63 > 256 || local78 - local63 < -256) {
			arg0.anInt1543 = local78;
			arg0.anInt1567 = local94;
			return;
		}
		if (local94 > local60) {
			if (local63 < local78) {
				arg0.anInt1560 = 1280;
			} else if (local63 > local78) {
				arg0.anInt1560 = 1792;
			} else {
				arg0.anInt1560 = 1536;
			}
		} else if (local60 <= local94) {
			if (local78 > local63) {
				arg0.anInt1560 = 1024;
			} else if (local78 < local63) {
				arg0.anInt1560 = 0;
			}
		} else if (local78 > local63) {
			arg0.anInt1560 = 768;
		} else if (local63 > local78) {
			arg0.anInt1560 = 256;
		} else {
			arg0.anInt1560 = 512;
		}
		@Pc(217) int local217 = arg0.anInt1560 - arg0.anInt1517 & 0x7FF;
		@Pc(220) int local220 = arg0.anInt1529;
		@Pc(222) int local222 = 4;
		if (arg0.anInt1560 != arg0.anInt1517 && arg0.anInt1525 == -1 && arg0.anInt1516 != 0) {
			local222 = 2;
		}
		if (local217 > 1024) {
			local217 -= 2048;
		}
		if (local217 >= -256 && local217 <= 256) {
			local220 = arg0.anInt1531;
		} else if (local217 >= 256 && local217 < 768) {
			local220 = arg0.anInt1550;
		} else if (local217 >= -768 && local217 <= -256) {
			local220 = arg0.anInt1521;
		}
		if (arg0.anInt1574 > 2) {
			local222 = 6;
		}
		if (local220 == -1) {
			local220 = arg0.anInt1531;
		}
		arg0.anInt1568 = local220;
		if (arg0.anInt1574 > 3) {
			local222 = 8;
		}
		if (arg0.anInt1542 > 0 && arg0.anInt1574 > 1) {
			local222 = 8;
			arg0.anInt1542--;
		}
		if (arg0.aBooleanArray14[arg0.anInt1574 - 1]) {
			local222 <<= 0x1;
		}
		if (local63 < local78) {
			arg0.anInt1543 += local222;
			if (local78 < arg0.anInt1543) {
				arg0.anInt1543 = local78;
			}
		} else if (local63 > local78) {
			arg0.anInt1543 -= local222;
			if (arg0.anInt1543 < local78) {
				arg0.anInt1543 = local78;
			}
		}
		if (local222 >= 8 && arg0.anInt1568 == arg0.anInt1531 && arg0.anInt1559 != -1) {
			arg0.anInt1568 = arg0.anInt1559;
		}
		if (local94 > local60) {
			arg0.anInt1567 += local222;
			if (arg0.anInt1567 > local94) {
				arg0.anInt1567 = local94;
			}
		} else if (local60 > local94) {
			arg0.anInt1567 -= local222;
			if (local94 > arg0.anInt1567) {
				arg0.anInt1567 = local94;
			}
		}
		if (arg0.anInt1567 != local94 || local78 != arg0.anInt1543) {
			return;
		}
		arg0.anInt1574--;
		if (arg0.anInt1519 > 0) {
			arg0.anInt1519--;
			return;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!qe;)V")
	public static void method1918(@OriginalArg(1) Class3_Sub11 arg0) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		if (arg0.anInt2279 == 0) {
			local7 = Static73.aClass42_1.method1035(arg0.anInt2275, arg0.anInt2278, arg0.anInt2285);
		}
		@Pc(29) int local29 = 0;
		@Pc(31) int local31 = 0;
		if (arg0.anInt2279 == 1) {
			local7 = Static73.aClass42_1.method1019(arg0.anInt2275, arg0.anInt2278, arg0.anInt2285);
		}
		if (arg0.anInt2279 == 2) {
			local7 = Static73.aClass42_1.method1040(arg0.anInt2275, arg0.anInt2278, arg0.anInt2285);
		}
		if (arg0.anInt2279 == 3) {
			local7 = Static73.aClass42_1.method1060(arg0.anInt2275, arg0.anInt2278, arg0.anInt2285);
		}
		if (local7 != 0) {
			@Pc(91) int local91 = Static73.aClass42_1.method1015(arg0.anInt2275, arg0.anInt2278, arg0.anInt2285, local7);
			local31 = local91 >> 6 & 0x3;
			local5 = local7 >> 14 & 0x7FFF;
			local29 = local91 & 0x1F;
		}
		arg0.anInt2272 = local29;
		arg0.anInt2281 = local5;
		arg0.anInt2271 = local31;
	}
}
