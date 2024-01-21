import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static114 {

	@OriginalMember(owner = "client!td", name = "E", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1282 = Static78.method1313("Startseite auf (WSpielkonto wiederherstellen(W)3");

	@OriginalMember(owner = "client!td", name = "H", descriptor = "I")
	public static int anInt2636 = 0;

	@OriginalMember(owner = "client!td", name = "K", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1283 = Static78.method1313("<col=ffb000>");

	@OriginalMember(owner = "client!td", name = "N", descriptor = "I")
	public static volatile int anInt2640 = 0;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "I")
	public static volatile int anInt2644 = 0;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!fc;Lclient!fc;Lclient!fc;I)V")
	public static void method1829(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) Class25 arg2) {
		Static81.aClass25_863 = arg1;
		Static81.aClass25_866 = arg2;
		Static81.aClass25_867 = arg0;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(I)V")
	public static void method1830() {
		aClass25_1283 = null;
		aClass25_1282 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IB)Lclient!cc;")
	public static Class1_Sub2_Sub4 method1831(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub2_Sub4 local17 = (Class1_Sub2_Sub4) Static66.aClass63_9.method1517((long) arg0);
		if (local17 != null) {
			return local17;
		}
		@Pc(27) byte[] local27 = Static110.aClass56_77.method1269(1, arg0);
		local17 = new Class1_Sub2_Sub4();
		if (local27 != null) {
			local17.method377(new Class1_Sub5(local27), arg0);
		}
		local17.method384();
		Static66.aClass63_9.method1520(local17, (long) arg0);
		return local17;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(III)I")
	public static int method1832(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			arg0--;
			local7 = local7 << 1 | arg1 & 0x1;
			arg1 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(B)V")
	public static void method1833() {
		for (@Pc(15) int local15 = 0; local15 < Static59.anInt1356; local15++) {
			@Pc(21) int local21 = Static85.anIntArray336[local15];
			@Pc(25) Class1_Sub2_Sub3_Sub4_Sub1 local25 = Static103.aClass1_Sub2_Sub3_Sub4_Sub1Array32[local21];
			@Pc(29) int local29 = Static35.aClass1_Sub5_Sub1_1.method672();
			if ((local29 & 0x40) != 0) {
				local25.aClass1_Sub2_Sub13_1 = Static129.method2045(Static35.aClass1_Sub5_Sub1_1.method651());
				local25.anInt2825 = local25.aClass1_Sub2_Sub13_1.anInt1847;
				local25.anInt2785 = local25.aClass1_Sub2_Sub13_1.anInt1853;
				local25.anInt2799 = local25.aClass1_Sub2_Sub13_1.anInt1860;
				local25.anInt2834 = local25.aClass1_Sub2_Sub13_1.anInt1863;
				local25.anInt2835 = local25.aClass1_Sub2_Sub13_1.anInt1840;
				local25.anInt2788 = local25.aClass1_Sub2_Sub13_1.anInt1865;
				local25.anInt2817 = local25.aClass1_Sub2_Sub13_1.anInt1842;
				local25.anInt2833 = local25.aClass1_Sub2_Sub13_1.anInt1868;
				local25.anInt2815 = local25.aClass1_Sub2_Sub13_1.anInt1849;
			}
			@Pc(104) int local104;
			if ((local29 & 0x8) != 0) {
				local25.anInt2813 = Static35.aClass1_Sub5_Sub1_1.method642();
				local104 = Static35.aClass1_Sub5_Sub1_1.method663();
				local25.anInt2787 = 0;
				local25.anInt2792 = 0;
				if (local25.anInt2813 == 65535) {
					local25.anInt2813 = -1;
				}
				local25.anInt2805 = (local104 & 0xFFFF) + Static60.anInt1366;
				if (Static60.anInt1366 < local25.anInt2805) {
					local25.anInt2792 = -1;
				}
				local25.anInt2821 = local104 >> 16;
			}
			if ((local29 & 0x20) != 0) {
				local25.aClass25_1379 = Static35.aClass1_Sub5_Sub1_1.method654();
				local25.anInt2783 = 100;
			}
			@Pc(172) int local172;
			if ((local29 & 0x1) != 0) {
				local104 = Static35.aClass1_Sub5_Sub1_1.method670();
				if (local104 == 65535) {
					local104 = -1;
				}
				local172 = Static35.aClass1_Sub5_Sub1_1.method630();
				if (local104 == local25.anInt2810 && local104 != -1) {
					@Pc(227) int local227 = Static34.method755(local104).anInt2338;
					if (local227 == 1) {
						local25.anInt2790 = 0;
						local25.anInt2808 = 0;
						local25.anInt2807 = 0;
						local25.anInt2829 = local172;
					}
					if (local227 == 2) {
						local25.anInt2790 = 0;
					}
				} else if (local104 == -1 || local25.anInt2810 == -1 || Static34.method755(local104).anInt2356 >= Static34.method755(local25.anInt2810).anInt2356) {
					local25.anInt2807 = 0;
					local25.anInt2806 = local25.anInt2839;
					local25.anInt2810 = local104;
					local25.anInt2808 = 0;
					local25.anInt2790 = 0;
					local25.anInt2829 = local172;
				}
			}
			if ((local29 & 0x10) != 0) {
				local25.anInt2818 = Static35.aClass1_Sub5_Sub1_1.method677();
				if (local25.anInt2818 == 65535) {
					local25.anInt2818 = -1;
				}
			}
			if ((local29 & 0x80) != 0) {
				local104 = Static35.aClass1_Sub5_Sub1_1.method671();
				local172 = Static35.aClass1_Sub5_Sub1_1.method672();
				local25.method1978(Static60.anInt1366, local172, local104);
				local25.anInt2801 = Static60.anInt1366 + 300;
				local25.anInt2786 = Static35.aClass1_Sub5_Sub1_1.method671();
				local25.anInt2784 = Static35.aClass1_Sub5_Sub1_1.method672();
			}
			if ((local29 & 0x4) != 0) {
				local104 = Static35.aClass1_Sub5_Sub1_1.method648();
				local172 = Static35.aClass1_Sub5_Sub1_1.method671();
				local25.method1978(Static60.anInt1366, local172, local104);
				local25.anInt2801 = Static60.anInt1366 + 300;
				local25.anInt2786 = Static35.aClass1_Sub5_Sub1_1.method672();
				local25.anInt2784 = Static35.aClass1_Sub5_Sub1_1.method671();
			}
			if ((local29 & 0x2) != 0) {
				local25.anInt2811 = Static35.aClass1_Sub5_Sub1_1.method677();
				local25.anInt2812 = Static35.aClass1_Sub5_Sub1_1.method651();
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIBI)Z")
	public static boolean method1836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(7) int local7 = arg2 >> 14 & 0x7FFF;
		@Pc(19) int local19 = Static118.aClass4_1.method57(Static21.anInt596, arg0, arg1, arg2);
		if (local19 == -1) {
			return false;
		}
		@Pc(33) int local33 = local19 & 0x1F;
		@Pc(39) int local39 = local19 >> 6 & 0x3;
		if (local33 == 10 || local33 == 11 || local33 == 22) {
			@Pc(56) Class1_Sub2_Sub6 local56 = Static78.method1315(local7);
			@Pc(72) int local72;
			@Pc(69) int local69;
			if (local39 == 0 || local39 == 2) {
				local69 = local56.anInt857;
				local72 = local56.anInt845;
			} else {
				local72 = local56.anInt857;
				local69 = local56.anInt845;
			}
			@Pc(83) int local83 = local56.anInt854;
			if (local39 != 0) {
				local83 = (local83 << local39 & 0xF) + (local83 >> 4 - local39);
			}
			Static81.method1376(true, 0, 2, local69, local83, arg1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], 0, local72, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], arg0);
		} else {
			Static81.method1376(true, local39, 2, 0, 0, arg1, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray485[0], local33 + 1, 0, Static82.aClass1_Sub2_Sub3_Sub4_Sub2_1.anIntArray484[0], arg0);
		}
		Static65.anInt1451 = Static23.anInt675;
		Static10.anInt270 = Static30.anInt815;
		Static9.anInt249 = 0;
		Static108.anInt2494 = 2;
		return true;
	}
}
