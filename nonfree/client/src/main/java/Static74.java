import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!he", name = "w", descriptor = "[Lclient!hh;")
	public static Class42[] aClass42Array4;

	@OriginalMember(owner = "client!he", name = "y", descriptor = "Lclient!ii;")
	private static Class47 aClass47_6;

	@OriginalMember(owner = "client!he", name = "B", descriptor = "Lclient!nb;")
	public static Class66 aClass66_4;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "Lclient!pb;")
	public static Class71 aClass71_15;

	@OriginalMember(owner = "client!he", name = "v", descriptor = "I")
	public static int anInt1521 = 1;

	@OriginalMember(owner = "client!he", name = "z", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_529 = Static151.method2243("overlay2)3dat");

	@OriginalMember(owner = "client!he", name = "A", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_530 = Static151.method2243("<)4col> x");

	@OriginalMember(owner = "client!he", name = "C", descriptor = "I")
	public static volatile int anInt1523 = 0;

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public static void method1039() {
		if (Static63.aClass12_1 != null) {
			@Pc(7) Class12 local7 = Static63.aClass12_1;
			synchronized (Static63.aClass12_1) {
				Static63.aClass12_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ILclient!ld;I)V")
	public static void method1041(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		@Pc(8) Object[] local8 = arg1.anObjectArray27;
		@Pc(14) int local14 = (Integer) local8[0];
		@Pc(18) Class2_Sub1_Sub16 local18 = Static87.method1233(local14);
		if (local18 == null) {
			return;
		}
		@Pc(23) int local23 = 0;
		Static16.anInt420 = 0;
		@Pc(28) int[] local28 = local18.anIntArray241;
		@Pc(31) int[] local31 = local18.anIntArray242;
		@Pc(33) int local33 = 0;
		@Pc(35) byte local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(51) int local51;
		@Pc(89) int local89;
		try {
			Static136.aClass62Array135 = new Class62[local18.anInt2681];
			Static13.anIntArray29 = new int[local18.anInt2682];
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 0;
			for (local51 = 1; local51 < local8.length; local51++) {
				if (local8[local51] instanceof Integer) {
					local89 = (Integer) local8[local51];
					if (local89 == -2147483647) {
						local89 = arg1.anInt2444;
					}
					if (local89 == -2147483646) {
						local89 = arg1.anInt2446;
					}
					if (local89 == -2147483645) {
						local89 = arg1.aClass47_12 == null ? -1 : arg1.aClass47_12.anInt1886;
					}
					if (local89 == -2147483644) {
						local89 = arg1.anInt2445;
					}
					if (local89 == -2147483643) {
						local89 = arg1.aClass47_12 == null ? -1 : arg1.aClass47_12.anInt1860;
					}
					if (local89 == -2147483642) {
						local89 = arg1.aClass47_11 == null ? -1 : arg1.aClass47_11.anInt1886;
					}
					if (local89 == -2147483641) {
						local89 = arg1.aClass47_11 == null ? -1 : arg1.aClass47_11.anInt1860;
					}
					if (local89 == -2147483640) {
						local89 = arg1.anInt2443;
					}
					if (local89 == -2147483639) {
						local89 = arg1.anInt2442;
					}
					Static13.anIntArray29[local47++] = local89;
				} else if (local8[local51] instanceof Class62) {
					@Pc(68) Class62 local68 = (Class62) local8[local51];
					if (local68.method1870(Static156.aClass62_1188)) {
						local68 = arg1.aClass62_844;
					}
					Static136.aClass62Array135[local49++] = local68;
				}
			}
			local89 = 0;
			label2418: while (true) {
				local89++;
				if (local89 > arg0) {
					throw new RuntimeException("slow");
				}
				local37++;
				@Pc(209) int local209 = local28[local37];
				@Pc(777) int local777;
				@Pc(782) int local782;
				@Pc(630) int local630;
				@Pc(651) int local651;
				@Pc(586) Class62 local586;
				if (local209 < 100) {
					if (local209 == 0) {
						Static175.anIntArray322[local23++] = local31[local37];
						continue;
					}
					@Pc(232) int local232;
					if (local209 == 1) {
						local232 = local31[local37];
						Static175.anIntArray322[local23++] = Static71.anIntArray123[local232];
						continue;
					}
					if (local209 == 2) {
						local232 = local31[local37];
						local23--;
						Static71.anIntArray123[local232] = Static175.anIntArray322[local23];
						continue;
					}
					if (local209 == 3) {
						Static51.aClass62Array29[local33++] = local18.aClass62Array84[local37];
						continue;
					}
					if (local209 == 6) {
						local37 += local31[local37];
						continue;
					}
					if (local209 == 7) {
						local23 -= 2;
						if (Static175.anIntArray322[local23] != Static175.anIntArray322[local23 + 1]) {
							local37 += local31[local37];
						}
						continue;
					}
					if (local209 == 8) {
						local23 -= 2;
						if (Static175.anIntArray322[local23 + 1] == Static175.anIntArray322[local23]) {
							local37 += local31[local37];
						}
						continue;
					}
					if (local209 == 9) {
						local23 -= 2;
						if (Static175.anIntArray322[local23] < Static175.anIntArray322[local23 + 1]) {
							local37 += local31[local37];
						}
						continue;
					}
					if (local209 == 10) {
						local23 -= 2;
						if (Static175.anIntArray322[local23 + 1] < Static175.anIntArray322[local23]) {
							local37 += local31[local37];
						}
						continue;
					}
					if (local209 == 21) {
						if (Static16.anInt420 == 0) {
							return;
						}
						@Pc(399) Class48 local399 = Static30.aClass48Array1[--Static16.anInt420];
						Static13.anIntArray29 = local399.anIntArray196;
						local18 = local399.aClass2_Sub1_Sub16_1;
						Static136.aClass62Array135 = local399.aClass62Array64;
						local28 = local18.anIntArray241;
						local31 = local18.anIntArray242;
						local37 = local399.anInt2046;
						continue;
					}
					if (local209 == 25) {
						local232 = local31[local37];
						Static175.anIntArray322[local23++] = Static88.method1238(local232);
						continue;
					}
					if (local209 == 27) {
						local232 = local31[local37];
						local23--;
						Static25.method445(Static175.anIntArray322[local23], local232);
						continue;
					}
					if (local209 == 31) {
						local23 -= 2;
						if (Static175.anIntArray322[local23 + 1] >= Static175.anIntArray322[local23]) {
							local37 += local31[local37];
						}
						continue;
					}
					if (local209 == 32) {
						local23 -= 2;
						if (Static175.anIntArray322[local23 + 1] <= Static175.anIntArray322[local23]) {
							local37 += local31[local37];
						}
						continue;
					}
					if (local209 == 33) {
						Static175.anIntArray322[local23++] = Static13.anIntArray29[local31[local37]];
						continue;
					}
					@Pc(528) int local528;
					if (local209 == 34) {
						local528 = local31[local37];
						local23--;
						Static13.anIntArray29[local528] = Static175.anIntArray322[local23];
						continue;
					}
					if (local209 == 35) {
						Static51.aClass62Array29[local33++] = Static136.aClass62Array135[local31[local37]];
						continue;
					}
					if (local209 == 36) {
						local528 = local31[local37];
						local33--;
						Static136.aClass62Array135[local528] = Static51.aClass62Array29[local33];
						continue;
					}
					if (local209 == 37) {
						local232 = local31[local37];
						local33 -= local232;
						local586 = Static64.method888(local232, local33, Static51.aClass62Array29);
						Static51.aClass62Array29[local33++] = local586;
						continue;
					}
					if (local209 == 38) {
						local23--;
						continue;
					}
					if (local209 == 39) {
						local33--;
						continue;
					}
					if (local209 == 40) {
						local232 = local31[local37];
						@Pc(620) Class2_Sub1_Sub16 local620 = Static87.method1233(local232);
						@Pc(624) Class62[] local624 = new Class62[local620.anInt2681];
						@Pc(628) int[] local628 = new int[local620.anInt2682];
						for (local630 = 0; local630 < local620.anInt2685; local630++) {
							local628[local630] = Static175.anIntArray322[local630 + local23 - local620.anInt2685];
						}
						for (local651 = 0; local651 < local620.anInt2683; local651++) {
							local624[local651] = Static51.aClass62Array29[local33 + local651 - local620.anInt2683];
						}
						local23 -= local620.anInt2685;
						local33 -= local620.anInt2683;
						@Pc(684) Class48 local684 = new Class48();
						local684.aClass2_Sub1_Sub16_1 = local18;
						local684.aClass62Array64 = Static136.aClass62Array135;
						local684.anInt2046 = local37;
						local684.anIntArray196 = Static13.anIntArray29;
						if (Static30.aClass48Array1.length <= Static16.anInt420) {
							throw new RuntimeException();
						}
						local18 = local620;
						Static30.aClass48Array1[Static16.anInt420++] = local684;
						local28 = local620.anIntArray241;
						local37 = -1;
						Static13.anIntArray29 = local628;
						Static136.aClass62Array135 = local624;
						local31 = local620.anIntArray242;
						continue;
					}
					if (local209 == 42) {
						Static175.anIntArray322[local23++] = Static122.anIntArray244[local31[local37]];
						continue;
					}
					if (local209 == 43) {
						local528 = local31[local37];
						local23--;
						Static122.anIntArray244[local528] = Static175.anIntArray322[local23];
						continue;
					}
					if (local209 == 44) {
						local232 = local31[local37] >> 16;
						local777 = local31[local37] & 0xFFFF;
						local23--;
						local782 = Static175.anIntArray322[local23];
						if (local782 >= 0 && local782 <= 5000) {
							Static207.anIntArray386[local232] = local782;
							@Pc(802) byte local802 = -1;
							if (local777 == 105) {
								local802 = 0;
							}
							local630 = 0;
							while (true) {
								if (local630 >= local782) {
									continue label2418;
								}
								Static14.anIntArrayArray4[local232][local630] = local802;
								local630++;
							}
						}
						throw new RuntimeException();
					}
					if (local209 == 45) {
						local232 = local31[local37];
						local23--;
						local777 = Static175.anIntArray322[local23];
						if (local777 >= 0 && Static207.anIntArray386[local232] > local777) {
							Static175.anIntArray322[local23++] = Static14.anIntArrayArray4[local232][local777];
							continue;
						}
						throw new RuntimeException();
					}
					if (local209 == 46) {
						local232 = local31[local37];
						local23 -= 2;
						local777 = Static175.anIntArray322[local23];
						if (local777 >= 0 && Static207.anIntArray386[local232] > local777) {
							Static14.anIntArrayArray4[local232][local777] = Static175.anIntArray322[local23 + 1];
							continue;
						}
						throw new RuntimeException();
					}
					if (local209 == 47) {
						@Pc(910) Class62 local910 = Static92.aClass62Array65[local31[local37]];
						if (local910 == null) {
							local910 = Static170.aClass62_1281;
						}
						Static51.aClass62Array29[local33++] = local910;
						continue;
					}
					if (local209 == 48) {
						local528 = local31[local37];
						local33--;
						Static92.aClass62Array65[local528] = Static51.aClass62Array29[local33];
						continue;
					}
					if (local209 == 51) {
						@Pc(947) Class58 local947 = local18.aClass58Array1[local31[local37]];
						local23--;
						@Pc(957) Class2_Sub19 local957 = (Class2_Sub19) local947.method1704((long) Static175.anIntArray322[local23]);
						if (local957 != null) {
							local37 += local957.anInt3328;
						}
						continue;
					}
				}
				@Pc(975) boolean local975;
				if (local31[local37] == 1) {
					local975 = true;
				} else {
					local975 = false;
				}
				@Pc(8129) Class47 local8129;
				@Pc(8100) Class47 local8100;
				@Pc(1879) int local1879;
				@Pc(1020) Class47 local1020;
				@Pc(1645) int local1645;
				if (local209 < 300) {
					if (local209 == 100) {
						local23 -= 3;
						local782 = Static175.anIntArray322[local23 + 1];
						local777 = Static175.anIntArray322[local23];
						local1645 = Static175.anIntArray322[local23 + 2];
						if (local782 == 0) {
							throw new RuntimeException();
						}
						local8100 = Static143.method2159(local777);
						if (local8100.aClass47Array1 == null) {
							local8100.aClass47Array1 = new Class47[local1645 + 1];
						}
						if (local1645 >= local8100.aClass47Array1.length) {
							@Pc(8844) Class47[] local8844 = new Class47[local1645 + 1];
							for (local1879 = 0; local1879 < local8100.aClass47Array1.length; local1879++) {
								local8844[local1879] = local8100.aClass47Array1[local1879];
							}
							local8100.aClass47Array1 = local8844;
						}
						if (local1645 > 0 && local8100.aClass47Array1[local1645 - 1] == null) {
							throw new RuntimeException("Gap at:" + (local1645 - 1));
						}
						@Pc(8897) Class47 local8897 = new Class47();
						local8897.anInt1870 = local782;
						local8897.anInt1860 = local1645;
						local8897.anInt1877 = local8897.anInt1886 = local8100.anInt1886;
						local8897.aBoolean95 = true;
						local8100.aClass47Array1[local1645] = local8897;
						if (local975) {
							Static92.aClass47_9 = local8897;
						} else {
							aClass47_6 = local8897;
						}
						Static165.method2410(local8100);
						continue;
					}
					@Pc(8962) Class47 local8962;
					if (local209 == 101) {
						local1020 = local975 ? Static92.aClass47_9 : aClass47_6;
						if (local1020.anInt1860 == -1) {
							if (local975) {
								throw new RuntimeException("Tried to .cc_delete static .active-component!");
							}
							throw new RuntimeException("Tried to cc_delete static active-component!");
						}
						local8962 = Static143.method2159(local1020.anInt1886);
						local8962.aClass47Array1[local1020.anInt1860] = null;
						Static165.method2410(local8962);
						continue;
					}
					if (local209 == 102) {
						local23--;
						local1020 = Static143.method2159(Static175.anIntArray322[local23]);
						local1020.aClass47Array1 = null;
						Static165.method2410(local1020);
						continue;
					}
					if (local209 == 200) {
						local23 -= 2;
						local777 = Static175.anIntArray322[local23];
						local782 = Static175.anIntArray322[local23 + 1];
						local8129 = Static93.method1400(local782, local777);
						if (local8129 != null && local782 != -1) {
							Static175.anIntArray322[local23++] = 1;
							if (local975) {
								Static92.aClass47_9 = local8129;
							} else {
								aClass47_6 = local8129;
							}
							continue;
						}
						Static175.anIntArray322[local23++] = 0;
						continue;
					}
					if (local209 == 201) {
						local23--;
						local777 = Static175.anIntArray322[local23];
						local8962 = Static143.method2159(local777);
						if (local8962 == null) {
							Static175.anIntArray322[local23++] = 0;
						} else {
							Static175.anIntArray322[local23++] = 1;
							if (local975) {
								Static92.aClass47_9 = local8962;
							} else {
								aClass47_6 = local8962;
							}
						}
						continue;
					}
				} else if (local209 < 500) {
					if (local209 == 403) {
						local23 -= 2;
						local777 = Static175.anIntArray322[local23];
						local782 = Static175.anIntArray322[local23 + 1];
						if (local777 >= 7) {
							local777 -= 7;
						}
						Static186.aClass7_Sub2_Sub2_1.aClass28_2.method716(local777, local782);
						continue;
					}
					if (local209 == 404) {
						local23 -= 2;
						local777 = Static175.anIntArray322[local23];
						local782 = Static175.anIntArray322[local23 + 1];
						Static186.aClass7_Sub2_Sub2_1.aClass28_2.method724(local777, local782);
						continue;
					}
					if (local209 == 410) {
						local23--;
						@Pc(8785) boolean local8785 = Static175.anIntArray322[local23] != 0;
						Static186.aClass7_Sub2_Sub2_1.aClass28_2.method725(local8785);
						continue;
					}
				} else if ((local209 < 1000 || local209 >= 1100) && (local209 < 2000 || local209 >= 2100)) {
					@Pc(1350) Class62 local1350;
					if (local209 >= 1100 && local209 < 1200 || !(local209 < 2100 || local209 >= 2200)) {
						if (local209 < 2000) {
							local1020 = local975 ? Static92.aClass47_9 : aClass47_6;
						} else {
							local209 -= 1000;
							local23--;
							local1020 = Static143.method2159(Static175.anIntArray322[local23]);
						}
						if (local209 == 1100) {
							local23 -= 2;
							local1020.anInt1891 = Static175.anIntArray322[local23];
							if (local1020.anInt1891 > local1020.anInt1861 - local1020.anInt1910) {
								local1020.anInt1891 = local1020.anInt1861 - local1020.anInt1910;
							}
							if (local1020.anInt1891 < 0) {
								local1020.anInt1891 = 0;
							}
							local1020.anInt1836 = Static175.anIntArray322[local23 + 1];
							if (local1020.anInt1911 - local1020.anInt1858 < local1020.anInt1836) {
								local1020.anInt1836 = local1020.anInt1911 - local1020.anInt1858;
							}
							if (local1020.anInt1836 < 0) {
								local1020.anInt1836 = 0;
							}
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1101) {
							local23--;
							local1020.anInt1857 = Static175.anIntArray322[local23];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1102) {
							local23--;
							local1020.aBoolean96 = Static175.anIntArray322[local23] == 1;
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1103) {
							local23--;
							local1020.anInt1916 = Static175.anIntArray322[local23];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1104) {
							local23--;
							local1020.anInt1867 = Static175.anIntArray322[local23];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1105) {
							local23--;
							local1020.anInt1890 = Static175.anIntArray322[local23];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1106) {
							local23--;
							local1020.anInt1913 = Static175.anIntArray322[local23];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1107) {
							local23--;
							local1020.aBoolean99 = Static175.anIntArray322[local23] == 1;
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1108) {
							local1020.anInt1855 = 1;
							local23--;
							local1020.anInt1881 = Static175.anIntArray322[local23];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1109) {
							local23 -= 6;
							local1020.anInt1873 = Static175.anIntArray322[local23];
							local1020.anInt1902 = Static175.anIntArray322[local23 + 1];
							local1020.anInt1863 = Static175.anIntArray322[local23 + 2];
							local1020.anInt1859 = Static175.anIntArray322[local23 + 3];
							local1020.anInt1854 = Static175.anIntArray322[local23 + 4];
							local1020.anInt1875 = Static175.anIntArray322[local23 + 5];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1110) {
							local23--;
							local782 = Static175.anIntArray322[local23];
							if (local1020.anInt1842 != local782) {
								local1020.anInt1842 = local782;
								local1020.anInt1869 = 0;
								local1020.anInt1898 = 0;
								Static165.method2410(local1020);
							}
							continue;
						}
						if (local209 == 1111) {
							local23--;
							local1020.aBoolean88 = Static175.anIntArray322[local23] == 1;
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1112) {
							local33--;
							local1350 = Static51.aClass62Array29[local33];
							if (!local1350.method1870(local1020.aClass62_615)) {
								local1020.aClass62_615 = local1350;
								Static165.method2410(local1020);
							}
							continue;
						}
						if (local209 == 1113) {
							local23--;
							local1020.anInt1892 = Static175.anIntArray322[local23];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1114) {
							local23 -= 3;
							local1020.anInt1889 = Static175.anIntArray322[local23];
							local1020.anInt1901 = Static175.anIntArray322[local23 + 1];
							local1020.anInt1840 = Static175.anIntArray322[local23 + 2];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1115) {
							local23--;
							local1020.aBoolean101 = Static175.anIntArray322[local23] == 1;
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1116) {
							local23--;
							local1020.anInt1896 = Static175.anIntArray322[local23];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1117) {
							local23--;
							local1020.anInt1832 = Static175.anIntArray322[local23];
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1118) {
							local23--;
							local1020.aBoolean100 = Static175.anIntArray322[local23] == 1;
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1119) {
							local23--;
							local1020.aBoolean93 = Static175.anIntArray322[local23] == 1;
							Static165.method2410(local1020);
							continue;
						}
						if (local209 == 1120) {
							local23 -= 2;
							local1020.anInt1861 = Static175.anIntArray322[local23];
							local1020.anInt1911 = Static175.anIntArray322[local23 + 1];
							Static165.method2410(local1020);
							if (local1020.anInt1870 == 0) {
								Static208.method3033(local1020);
							}
							continue;
						}
					} else if (local209 >= 1200 && local209 < 1300 || !(local209 < 2200 || local209 >= 2300)) {
						if (local209 >= 2000) {
							local209 -= 1000;
							local23--;
							local1020 = Static143.method2159(Static175.anIntArray322[local23]);
						} else {
							local1020 = local975 ? Static92.aClass47_9 : aClass47_6;
						}
						Static165.method2410(local1020);
						if (local209 == 1200 || local209 == 1205) {
							local23 -= 2;
							local782 = Static175.anIntArray322[local23];
							local1645 = Static175.anIntArray322[local23 + 1];
							if (local782 == -1) {
								local1020.anInt1881 = -1;
								local1020.anInt1855 = 1;
								local1020.anInt1904 = -1;
							} else {
								local1020.anInt1876 = local1645;
								local1020.anInt1904 = local782;
								@Pc(8453) Class2_Sub1_Sub26 local8453 = Static52.method774(local782);
								local1020.anInt1902 = local8453.anInt4539;
								local1020.anInt1854 = local8453.anInt4514;
								if (local209 == 1205) {
									local1020.aBoolean89 = false;
								} else {
									local1020.aBoolean89 = true;
								}
								local1020.anInt1873 = local8453.anInt4515;
								local1020.anInt1875 = local8453.anInt4549;
								local1020.anInt1859 = local8453.anInt4530;
								if (local1020.anInt1909 > 0) {
									local1020.anInt1875 = local1020.anInt1875 * 32 / local1020.anInt1909;
								} else if (local1020.anInt1845 > 0) {
									local1020.anInt1875 = local1020.anInt1875 * 32 / local1020.anInt1845;
								}
								local1020.anInt1863 = local8453.anInt4545;
							}
							continue;
						}
						if (local209 == 1201) {
							local1020.anInt1855 = 2;
							local23--;
							local1020.anInt1881 = Static175.anIntArray322[local23];
							continue;
						}
						if (local209 == 1202) {
							local1020.anInt1855 = 3;
							local1020.anInt1881 = Static186.aClass7_Sub2_Sub2_1.aClass28_2.method719();
							continue;
						}
						if (local209 == 1203) {
							local1020.anInt1855 = 6;
							local23--;
							local1020.anInt1881 = Static175.anIntArray322[local23];
							continue;
						}
						if (local209 == 1204) {
							local1020.anInt1855 = 5;
							local23--;
							local1020.anInt1881 = Static175.anIntArray322[local23];
							continue;
						}
					} else if (local209 >= 1300 && local209 < 1400 || local209 >= 2300 && local209 < 2400) {
						if (local209 < 2000) {
							local1020 = local975 ? Static92.aClass47_9 : aClass47_6;
						} else {
							local23--;
							local1020 = Static143.method2159(Static175.anIntArray322[local23]);
							local209 -= 1000;
						}
						if (local209 == 1300) {
							local23--;
							local782 = Static175.anIntArray322[local23] - 1;
							if (local782 >= 0 && local782 <= 9) {
								local33--;
								local1020.method1239(local782, Static51.aClass62Array29[local33]);
								continue;
							}
							local33--;
							continue;
						}
						if (local209 == 1301) {
							local23 -= 2;
							local1645 = Static175.anIntArray322[local23 + 1];
							local782 = Static175.anIntArray322[local23];
							local1020.aClass47_8 = Static93.method1400(local1645, local782);
							continue;
						}
						if (local209 == 1302) {
							local23--;
							local1020.aBoolean94 = Static175.anIntArray322[local23] == 1;
							continue;
						}
						if (local209 == 1303) {
							local23--;
							local1020.anInt1882 = Static175.anIntArray322[local23];
							continue;
						}
						if (local209 == 1304) {
							local23--;
							local1020.anInt1871 = Static175.anIntArray322[local23];
							continue;
						}
						if (local209 == 1305) {
							local33--;
							local1020.aClass62_614 = Static51.aClass62Array29[local33];
							continue;
						}
						if (local209 == 1306) {
							local33--;
							local1020.aClass62_613 = Static51.aClass62Array29[local33];
							continue;
						}
						if (local209 == 1307) {
							local1020.aClass62Array55 = null;
							continue;
						}
					} else {
						if (local209 >= 1400 && local209 < 1500 || local209 >= 2400 && local209 < 2500) {
							if (local209 < 2000) {
								local1020 = local975 ? Static92.aClass47_9 : aClass47_6;
							} else {
								local23--;
								local1020 = Static143.method2159(Static175.anIntArray322[local23]);
								local209 -= 1000;
							}
							@Pc(1770) int[] local1770 = null;
							local33--;
							local1350 = Static51.aClass62Array29[local33];
							if (local1350.method1878() > 0 && local1350.method1857(local1350.method1878() - 1) == 89) {
								local23--;
								local630 = Static175.anIntArray322[local23];
								if (local630 > 0) {
									local1770 = new int[local630];
									while (local630-- > 0) {
										local23--;
										local1770[local630] = Static175.anIntArray322[local23];
									}
								}
								local1350 = local1350.method1862(0, local1350.method1878() - 1);
							}
							@Pc(1836) Object[] local1836 = new Object[local1350.method1878() + 1];
							for (local651 = local1836.length - 1; local651 >= 1; local651--) {
								if (local1350.method1857(local651 - 1) == 115) {
									local33--;
									local1836[local651] = Static51.aClass62Array29[local33];
								} else {
									local23--;
									local1836[local651] = Integer.valueOf(Static175.anIntArray322[local23]);
								}
							}
							local23--;
							local1879 = Static175.anIntArray322[local23];
							if (local1879 == -1) {
								local1836 = null;
							} else {
								local1836[0] = Integer.valueOf(local1879);
							}
							if (local209 == 1424) {
								local1020.anObjectArray11 = local1836;
							}
							if (local209 == 1411) {
								local1020.anObjectArray24 = local1836;
							}
							if (local209 == 1414) {
								local1020.anIntArray167 = local1770;
								local1020.anObjectArray14 = local1836;
							}
							if (local209 == 1412) {
								local1020.anObjectArray13 = local1836;
							}
							if (local209 == 1416) {
								local1020.anObjectArray26 = local1836;
							}
							if (local209 == 1401) {
								local1020.anObjectArray21 = local1836;
							}
							if (local209 == 1419) {
								local1020.anObjectArray18 = local1836;
							}
							if (local209 == 1409) {
								local1020.anObjectArray17 = local1836;
							}
							local1020.aBoolean97 = true;
							if (local209 == 1415) {
								local1020.anIntArray172 = local1770;
								local1020.anObjectArray23 = local1836;
							}
							if (local209 == 1403) {
								local1020.anObjectArray5 = local1836;
							}
							if (local209 == 1417) {
								local1020.anObjectArray6 = local1836;
							}
							if (local209 == 1423) {
								local1020.anObjectArray12 = local1836;
							}
							if (local209 == 1410) {
								local1020.anObjectArray19 = local1836;
							}
							if (local209 == 1404) {
								local1020.anObjectArray15 = local1836;
							}
							if (local209 == 1405) {
								local1020.anObjectArray4 = local1836;
							}
							if (local209 == 1418) {
								local1020.anObjectArray16 = local1836;
							}
							if (local209 == 1422) {
								local1020.anObjectArray7 = local1836;
							}
							if (local209 == 1420) {
								local1020.anObjectArray25 = local1836;
							}
							if (local209 == 1402) {
								local1020.anObjectArray8 = local1836;
							}
							if (local209 == 1407) {
								local1020.anObjectArray2 = local1836;
								local1020.anIntArray170 = local1770;
							}
							if (local209 == 1425) {
								local1020.anObjectArray3 = local1836;
							}
							if (local209 == 1400) {
								local1020.anObjectArray1 = local1836;
							}
							if (local209 == 1408) {
								local1020.anObjectArray10 = local1836;
							}
							if (local209 == 1406) {
								local1020.anObjectArray9 = local1836;
							}
							if (local209 == 1421) {
								local1020.anObjectArray20 = local1836;
							}
							continue;
						}
						if (local209 < 1600) {
							local1020 = local975 ? Static92.aClass47_9 : aClass47_6;
							if (local209 == 1500) {
								Static175.anIntArray322[local23++] = local1020.anInt1865;
								continue;
							}
							if (local209 == 1501) {
								Static175.anIntArray322[local23++] = local1020.anInt1912;
								continue;
							}
							if (local209 == 1502) {
								Static175.anIntArray322[local23++] = local1020.anInt1910;
								continue;
							}
							if (local209 == 1503) {
								Static175.anIntArray322[local23++] = local1020.anInt1858;
								continue;
							}
							if (local209 == 1504) {
								Static175.anIntArray322[local23++] = local1020.aBoolean102 ? 1 : 0;
								continue;
							}
							if (local209 == 1505) {
								Static175.anIntArray322[local23++] = local1020.anInt1877;
								continue;
							}
						} else if (local209 < 1700) {
							local1020 = local975 ? Static92.aClass47_9 : aClass47_6;
							if (local209 == 1600) {
								Static175.anIntArray322[local23++] = local1020.anInt1891;
								continue;
							}
							if (local209 == 1601) {
								Static175.anIntArray322[local23++] = local1020.anInt1836;
								continue;
							}
							if (local209 == 1602) {
								Static51.aClass62Array29[local33++] = local1020.aClass62_615;
								continue;
							}
							if (local209 == 1603) {
								Static175.anIntArray322[local23++] = local1020.anInt1861;
								continue;
							}
							if (local209 == 1604) {
								Static175.anIntArray322[local23++] = local1020.anInt1911;
								continue;
							}
							if (local209 == 1605) {
								Static175.anIntArray322[local23++] = local1020.anInt1875;
								continue;
							}
							if (local209 == 1606) {
								Static175.anIntArray322[local23++] = local1020.anInt1863;
								continue;
							}
							if (local209 == 1607) {
								Static175.anIntArray322[local23++] = local1020.anInt1854;
								continue;
							}
							if (local209 == 1608) {
								Static175.anIntArray322[local23++] = local1020.anInt1859;
								continue;
							}
							if (local209 == 1609) {
								Static175.anIntArray322[local23++] = local1020.anInt1916;
								continue;
							}
						} else if (local209 < 1800) {
							local1020 = local975 ? Static92.aClass47_9 : aClass47_6;
							if (local209 == 1700) {
								Static175.anIntArray322[local23++] = local1020.anInt1904;
								continue;
							}
							if (local209 == 1701) {
								if (local1020.anInt1904 == -1) {
									Static175.anIntArray322[local23++] = 0;
								} else {
									Static175.anIntArray322[local23++] = local1020.anInt1876;
								}
								continue;
							}
							if (local209 == 1702) {
								Static175.anIntArray322[local23++] = local1020.anInt1860;
								continue;
							}
						} else if (local209 < 1900) {
							local1020 = local975 ? Static92.aClass47_9 : aClass47_6;
							if (local209 == 1800) {
								Static175.anIntArray322[local23++] = Static6.method132(Static155.method2304(local1020));
								continue;
							}
							if (local209 == 1801) {
								local23--;
								local782 = Static175.anIntArray322[local23];
								local782--;
								if (local1020.aClass62Array55 != null && local782 < local1020.aClass62Array55.length && local1020.aClass62Array55[local782] != null) {
									Static51.aClass62Array29[local33++] = local1020.aClass62Array55[local782];
									continue;
								}
								Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								continue;
							}
							if (local209 == 1802) {
								if (local1020.aClass62_614 == null) {
									Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								} else {
									Static51.aClass62Array29[local33++] = local1020.aClass62_614;
								}
								continue;
							}
						} else if (local209 < 2600) {
							local23--;
							local1020 = Static143.method2159(Static175.anIntArray322[local23]);
							if (local209 == 2500) {
								Static175.anIntArray322[local23++] = local1020.anInt1865;
								continue;
							}
							if (local209 == 2501) {
								Static175.anIntArray322[local23++] = local1020.anInt1912;
								continue;
							}
							if (local209 == 2502) {
								Static175.anIntArray322[local23++] = local1020.anInt1910;
								continue;
							}
							if (local209 == 2503) {
								Static175.anIntArray322[local23++] = local1020.anInt1858;
								continue;
							}
							if (local209 == 2504) {
								Static175.anIntArray322[local23++] = local1020.aBoolean102 ? 1 : 0;
								continue;
							}
							if (local209 == 2505) {
								Static175.anIntArray322[local23++] = local1020.anInt1877;
								continue;
							}
						} else if (local209 < 2700) {
							local23--;
							local1020 = Static143.method2159(Static175.anIntArray322[local23]);
							if (local209 == 2600) {
								Static175.anIntArray322[local23++] = local1020.anInt1891;
								continue;
							}
							if (local209 == 2601) {
								Static175.anIntArray322[local23++] = local1020.anInt1836;
								continue;
							}
							if (local209 == 2602) {
								Static51.aClass62Array29[local33++] = local1020.aClass62_615;
								continue;
							}
							if (local209 == 2603) {
								Static175.anIntArray322[local23++] = local1020.anInt1861;
								continue;
							}
							if (local209 == 2604) {
								Static175.anIntArray322[local23++] = local1020.anInt1911;
								continue;
							}
							if (local209 == 2605) {
								Static175.anIntArray322[local23++] = local1020.anInt1875;
								continue;
							}
							if (local209 == 2606) {
								Static175.anIntArray322[local23++] = local1020.anInt1863;
								continue;
							}
							if (local209 == 2607) {
								Static175.anIntArray322[local23++] = local1020.anInt1854;
								continue;
							}
							if (local209 == 2608) {
								Static175.anIntArray322[local23++] = local1020.anInt1859;
								continue;
							}
							if (local209 == 2609) {
								Static175.anIntArray322[local23++] = local1020.anInt1916;
								continue;
							}
						} else if (local209 < 2800) {
							if (local209 == 2700) {
								local23--;
								local1020 = Static143.method2159(Static175.anIntArray322[local23]);
								Static175.anIntArray322[local23++] = local1020.anInt1904;
								continue;
							}
							if (local209 == 2701) {
								local23--;
								local1020 = Static143.method2159(Static175.anIntArray322[local23]);
								if (local1020.anInt1904 == -1) {
									Static175.anIntArray322[local23++] = 0;
								} else {
									Static175.anIntArray322[local23++] = local1020.anInt1876;
								}
								continue;
							}
							if (local209 == 2702) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								@Pc(2612) Class2_Sub7 local2612 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local777);
								if (local2612 == null) {
									Static175.anIntArray322[local23++] = 0;
								} else {
									Static175.anIntArray322[local23++] = 1;
								}
								continue;
							}
							if (local209 == 2703) {
								local23--;
								local1020 = Static143.method2159(Static175.anIntArray322[local23]);
								if (local1020.aClass47Array1 == null) {
									Static175.anIntArray322[local23++] = 0;
									continue;
								}
								local782 = local1020.aClass47Array1.length;
								for (local1645 = 0; local1645 < local1020.aClass47Array1.length; local1645++) {
									if (local1020.aClass47Array1[local1645] == null) {
										local782 = local1645;
										break;
									}
								}
								Static175.anIntArray322[local23++] = local782;
								continue;
							}
							if (local209 == 2704 || local209 == 2705) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								@Pc(2708) Class2_Sub7 local2708 = (Class2_Sub7) Static49.aClass58_7.method1704((long) local777);
								if (local2708 != null && local2708.anInt1410 == local782) {
									Static175.anIntArray322[local23++] = 1;
									continue;
								}
								Static175.anIntArray322[local23++] = 0;
								continue;
							}
						} else if (local209 < 2900) {
							local23--;
							local1020 = Static143.method2159(Static175.anIntArray322[local23]);
							if (local209 == 2800) {
								Static175.anIntArray322[local23++] = Static6.method132(Static155.method2304(local1020));
								continue;
							}
							if (local209 == 2801) {
								local23--;
								local782 = Static175.anIntArray322[local23];
								local782--;
								if (local1020.aClass62Array55 != null && local1020.aClass62Array55.length > local782 && local1020.aClass62Array55[local782] != null) {
									Static51.aClass62Array29[local33++] = local1020.aClass62Array55[local782];
									continue;
								}
								Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								continue;
							}
							if (local209 == 2802) {
								if (local1020.aClass62_614 == null) {
									Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								} else {
									Static51.aClass62Array29[local33++] = local1020.aClass62_614;
								}
								continue;
							}
						} else if (local209 < 3200) {
							if (local209 == 3100) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static154.method2292(local586, 0, Static58.aClass62_395);
								continue;
							}
							if (local209 == 3101) {
								local23 -= 2;
								Static31.method537(Static175.anIntArray322[local23 + 1], Static175.anIntArray322[local23], Static186.aClass7_Sub2_Sub2_1);
								continue;
							}
							if (local209 == 3103) {
								Static179.method2592();
								continue;
							}
							if (local209 == 3104) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local782 = 0;
								if (local586.method1856()) {
									local782 = local586.method1853();
								}
								Static58.aClass2_Sub11_Sub1_2.method1595(197);
								Static58.aClass2_Sub11_Sub1_2.method1544(local782);
								continue;
							}
							if (local209 == 3105) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static58.aClass2_Sub11_Sub1_2.method1595(246);
								Static58.aClass2_Sub11_Sub1_2.method1527(local586.method1843());
								continue;
							}
							if (local209 == 3106) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static58.aClass2_Sub11_Sub1_2.method1595(208);
								Static58.aClass2_Sub11_Sub1_2.method1565(local586.method1878() + 1);
								Static58.aClass2_Sub11_Sub1_2.method1540(local586);
								continue;
							}
							if (local209 == 3107) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local33--;
								local1350 = Static51.aClass62Array29[local33];
								Static197.method2838(local1350, local777);
								continue;
							}
							if (local209 == 3108) {
								local23 -= 3;
								local777 = Static175.anIntArray322[local23];
								local1645 = Static175.anIntArray322[local23 + 2];
								local782 = Static175.anIntArray322[local23 + 1];
								local8100 = Static143.method2159(local1645);
								Static82.method1169(local777, local782, local8100);
								continue;
							}
							if (local209 == 3109) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								local8129 = local975 ? Static92.aClass47_9 : aClass47_6;
								Static82.method1169(local777, local782, local8129);
								continue;
							}
							if (local209 == 3110) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static58.aClass2_Sub11_Sub1_2.method1595(46);
								Static58.aClass2_Sub11_Sub1_2.method1533(local777);
								continue;
							}
						} else if (local209 < 3300) {
							if (local209 == 3200) {
								local23 -= 3;
								Static192.method2745(Static175.anIntArray322[local23], Static175.anIntArray322[local23 + 1], Static175.anIntArray322[local23 + 2]);
								continue;
							}
							if (local209 == 3201) {
								local23--;
								Static114.method1774(Static175.anIntArray322[local23]);
								continue;
							}
							if (local209 == 3202) {
								local23 -= 2;
								Static207.method3013(Static175.anIntArray322[local23 + 1], Static175.anIntArray322[local23]);
								continue;
							}
						} else if (local209 < 3400) {
							if (local209 == 3300) {
								Static175.anIntArray322[local23++] = Static25.anInt581;
								continue;
							}
							if (local209 == 3301) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = Static200.method2926(local782, local777);
								continue;
							}
							if (local209 == 3302) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = Static102.method1624(local777, local782);
								continue;
							}
							if (local209 == 3303) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = Static58.method795(local777, local782);
								continue;
							}
							if (local209 == 3304) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static204.method2972(local777).anInt574;
								continue;
							}
							if (local209 == 3305) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static54.anIntArray88[local777];
								continue;
							}
							if (local209 == 3306) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static184.anIntArray195[local777];
								continue;
							}
							if (local209 == 3307) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static176.anIntArray323[local777];
								continue;
							}
							if (local209 == 3308) {
								local777 = Static126.anInt2806;
								local782 = (Static186.aClass7_Sub2_Sub2_1.anInt3046 >> 7) + Static116.anInt2535;
								local1645 = Static153.anInt3278 + (Static186.aClass7_Sub2_Sub2_1.anInt3085 >> 7);
								Static175.anIntArray322[local23++] = local1645 + (local782 << 14) + (local777 << 28);
								continue;
							}
							if (local209 == 3309) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = local777 >> 14 & 0x3FFF;
								continue;
							}
							if (local209 == 3310) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = local777 >> 28;
								continue;
							}
							if (local209 == 3311) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = local777 & 0x3FFF;
								continue;
							}
							if (local209 == 3312) {
								Static175.anIntArray322[local23++] = Static36.aBoolean36 ? 1 : 0;
								continue;
							}
							if (local209 == 3313) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23] + 32768;
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = Static200.method2926(local782, local777);
								continue;
							}
							if (local209 == 3314) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23] + 32768;
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = Static102.method1624(local777, local782);
								continue;
							}
							if (local209 == 3315) {
								local23 -= 2;
								local782 = Static175.anIntArray322[local23 + 1];
								local777 = Static175.anIntArray322[local23] + 32768;
								Static175.anIntArray322[local23++] = Static58.method795(local777, local782);
								continue;
							}
							if (local209 == 3316) {
								if (Static154.anInt3306 >= 2) {
									Static175.anIntArray322[local23++] = Static154.anInt3306;
								} else {
									Static175.anIntArray322[local23++] = 0;
								}
								continue;
							}
							if (local209 == 3317) {
								Static175.anIntArray322[local23++] = Static124.anInt2732;
								continue;
							}
							if (local209 == 3318) {
								Static175.anIntArray322[local23++] = anInt1521;
								continue;
							}
							if (local209 == 3321) {
								Static175.anIntArray322[local23++] = Static51.anInt1099;
								continue;
							}
							if (local209 == 3322) {
								Static175.anIntArray322[local23++] = Static193.anInt4004;
								continue;
							}
							if (local209 == 3323) {
								if (Static210.anInt4408 >= 5 && Static210.anInt4408 <= 9) {
									Static175.anIntArray322[local23++] = 1;
									continue;
								}
								Static175.anIntArray322[local23++] = 0;
								continue;
							}
							if (local209 == 3324) {
								if (Static210.anInt4408 >= 5 && Static210.anInt4408 <= 9) {
									Static175.anIntArray322[local23++] = Static210.anInt4408;
									continue;
								}
								Static175.anIntArray322[local23++] = 0;
								continue;
							}
							if (local209 == 3325) {
								if (Static139.anInt2935 <= 0) {
									Static175.anIntArray322[local23++] = 0;
								} else {
									Static175.anIntArray322[local23++] = 1;
								}
								continue;
							}
							if (local209 == 3326) {
								Static175.anIntArray322[local23++] = Static186.aClass7_Sub2_Sub2_1.anInt3117;
								continue;
							}
							if (local209 == 3327) {
								Static175.anIntArray322[local23++] = Static186.aClass7_Sub2_Sub2_1.aClass28_2.aBoolean46 ? 1 : 0;
								continue;
							}
						} else if (local209 < 3500) {
							if (local209 == 3400) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								@Pc(7260) Class2_Sub1_Sub8 local7260 = Static186.method2680(local777);
								Static51.aClass62Array29[local33++] = local7260.method746(local782);
								continue;
							}
							if (local209 == 3408) {
								local23 -= 4;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								local1645 = Static175.anIntArray322[local23 + 2];
								local630 = Static175.anIntArray322[local23 + 3];
								@Pc(7300) Class2_Sub1_Sub8 local7300 = Static186.method2680(local1645);
								if (local7300.anInt1069 == local777 && local7300.anInt1074 == local782) {
									if (local782 == 115) {
										Static51.aClass62Array29[local33++] = local7300.method746(local630);
									} else {
										Static175.anIntArray322[local23++] = local7300.method750(local630);
									}
									continue;
								}
								if (local782 == 115) {
									Static51.aClass62Array29[local33++] = Static170.aClass62_1281;
								} else {
									Static175.anIntArray322[local23++] = 0;
								}
								continue;
							}
						} else if (local209 < 3700) {
							if (local209 == 3600) {
								if (Static93.anInt2052 == 0) {
									Static175.anIntArray322[local23++] = -2;
								} else if (Static93.anInt2052 == 1) {
									Static175.anIntArray322[local23++] = -1;
								} else {
									Static175.anIntArray322[local23++] = Static29.anInt714;
								}
								continue;
							}
							if (local209 == 3601) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (Static93.anInt2052 == 2 && Static29.anInt714 > local777) {
									Static51.aClass62Array29[local33++] = Static62.aClass62Array33[local777];
									continue;
								}
								Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								continue;
							}
							if (local209 == 3602) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (Static93.anInt2052 == 2 && local777 < Static29.anInt714) {
									Static175.anIntArray322[local23++] = Static35.anIntArray65[local777];
									continue;
								}
								Static175.anIntArray322[local23++] = 0;
								continue;
							}
							if (local209 == 3603) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (Static93.anInt2052 == 2 && Static29.anInt714 > local777) {
									Static175.anIntArray322[local23++] = Static54.anIntArray87[local777];
									continue;
								}
								Static175.anIntArray322[local23++] = 0;
								continue;
							}
							if (local209 == 3604) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local23--;
								local782 = Static175.anIntArray322[local23];
								Static158.method2345(local782, local586);
								continue;
							}
							if (local209 == 3605) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static52.method773(local586.method1843());
								continue;
							}
							if (local209 == 3606) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static102.method1628(local586.method1843());
								continue;
							}
							if (local209 == 3607) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static61.method854(local586.method1843());
								continue;
							}
							if (local209 == 3608) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static166.method2431(local586.method1843());
								continue;
							}
							if (local209 == 3609) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								if (local586.method1880(Static60.aClass62_420) || local586.method1880(Static169.aClass62_1260)) {
									local586 = local586.method1849(7);
								}
								Static175.anIntArray322[local23++] = Static6.method128(local586) ? 1 : 0;
								continue;
							}
							if (local209 == 3610) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (Static93.anInt2052 == 2 && Static29.anInt714 > local777) {
									Static51.aClass62Array29[local33++] = Static80.aClass62Array46[local777];
									continue;
								}
								Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								continue;
							}
							if (local209 == 3611) {
								if (Static120.aClass62_925 == null) {
									Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								} else {
									Static51.aClass62Array29[local33++] = Static120.aClass62_925.method1876();
								}
								continue;
							}
							if (local209 == 3612) {
								if (Static120.aClass62_925 == null) {
									Static175.anIntArray322[local23++] = 0;
								} else {
									Static175.anIntArray322[local23++] = Static106.anInt2394;
								}
								continue;
							}
							if (local209 == 3613) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (Static120.aClass62_925 != null && Static106.anInt2394 > local777) {
									Static51.aClass62Array29[local33++] = Static123.aClass2_Sub22Array11[local777].aClass62_1333.method1876();
									continue;
								}
								Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								continue;
							}
							if (local209 == 3614) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (Static120.aClass62_925 != null && local777 < Static106.anInt2394) {
									Static175.anIntArray322[local23++] = Static123.aClass2_Sub22Array11[local777].anInt3761;
									continue;
								}
								Static175.anIntArray322[local23++] = 0;
								continue;
							}
							if (local209 == 3615) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (Static120.aClass62_925 != null && Static106.anInt2394 > local777) {
									Static175.anIntArray322[local23++] = Static123.aClass2_Sub22Array11[local777].aByte10;
									continue;
								}
								Static175.anIntArray322[local23++] = 0;
								continue;
							}
							if (local209 == 3616) {
								Static175.anIntArray322[local23++] = Static186.aByte12;
								continue;
							}
							if (local209 == 3617) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static94.method1428(local586);
								continue;
							}
							if (local209 == 3618) {
								Static175.anIntArray322[local23++] = Static164.aByte8;
								continue;
							}
							if (local209 == 3619) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static207.method3011(local586.method1843());
								continue;
							}
							if (local209 == 3620) {
								Static194.method2779();
								continue;
							}
							if (local209 == 3621) {
								if (Static93.anInt2052 == 0) {
									Static175.anIntArray322[local23++] = -1;
								} else {
									Static175.anIntArray322[local23++] = Static125.anInt2769;
								}
								continue;
							}
							if (local209 == 3622) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (Static93.anInt2052 != 0 && local777 < Static125.anInt2769) {
									Static51.aClass62Array29[local33++] = Static149.method2218(Static161.aLongArray10[local777]).method1876();
									continue;
								}
								Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								continue;
							}
							if (local209 == 3623) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								if (local586.method1880(Static60.aClass62_420) || local586.method1880(Static169.aClass62_1260)) {
									local586 = local586.method1849(7);
								}
								Static175.anIntArray322[local23++] = Static146.method2194(local586) ? 1 : 0;
								continue;
							}
							if (local209 == 3624) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (Static123.aClass2_Sub22Array11 != null && Static106.anInt2394 > local777 && Static123.aClass2_Sub22Array11[local777].aClass62_1333.method1858(Static186.aClass7_Sub2_Sub2_1.aClass62_1072)) {
									Static175.anIntArray322[local23++] = 1;
									continue;
								}
								Static175.anIntArray322[local23++] = 0;
								continue;
							}
							if (local209 == 3625) {
								if (Static107.aClass62_818 == null) {
									Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								} else {
									Static51.aClass62Array29[local33++] = Static107.aClass62_818.method1876();
								}
								continue;
							}
							if (local209 == 3626) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (Static120.aClass62_925 != null && Static106.anInt2394 > local777) {
									Static51.aClass62Array29[local33++] = Static123.aClass2_Sub22Array11[local777].aClass62_1332;
									continue;
								}
								Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								continue;
							}
						} else if (local209 < 4000) {
							if (local209 == 3903) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static50.aClass60Array1[local777].method1777();
								continue;
							}
							if (local209 == 3904) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static50.aClass60Array1[local777].anInt2529;
								continue;
							}
							if (local209 == 3905) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static50.aClass60Array1[local777].anInt2521;
								continue;
							}
							if (local209 == 3906) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static50.aClass60Array1[local777].anInt2527;
								continue;
							}
							if (local209 == 3907) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static50.aClass60Array1[local777].anInt2530;
								continue;
							}
							if (local209 == 3908) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static50.aClass60Array1[local777].anInt2526;
								continue;
							}
							if (local209 == 3910) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local782 = Static50.aClass60Array1[local777].method1775();
								Static175.anIntArray322[local23++] = local782 == 0 ? 1 : 0;
								continue;
							}
							if (local209 == 3911) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local782 = Static50.aClass60Array1[local777].method1775();
								Static175.anIntArray322[local23++] = local782 == 2 ? 1 : 0;
								continue;
							}
							if (local209 == 3912) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local782 = Static50.aClass60Array1[local777].method1775();
								Static175.anIntArray322[local23++] = local782 == 5 ? 1 : 0;
								continue;
							}
							if (local209 == 3913) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local782 = Static50.aClass60Array1[local777].method1775();
								Static175.anIntArray322[local23++] = local782 == 1 ? 1 : 0;
								continue;
							}
						} else if (local209 < 4100) {
							if (local209 == 4000) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = local782 + local777;
								continue;
							}
							if (local209 == 4001) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = local777 - local782;
								continue;
							}
							if (local209 == 4002) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = local777 * local782;
								continue;
							}
							if (local209 == 4003) {
								local23 -= 2;
								local782 = Static175.anIntArray322[local23 + 1];
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = local777 / local782;
								continue;
							}
							if (local209 == 4004) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = (int) ((double) local777 * Math.random());
								continue;
							}
							if (local209 == 4005) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = (int) ((double) (local777 + 1) * Math.random());
								continue;
							}
							if (local209 == 4006) {
								local23 -= 5;
								local777 = Static175.anIntArray322[local23];
								local1645 = Static175.anIntArray322[local23 + 2];
								local630 = Static175.anIntArray322[local23 + 3];
								local782 = Static175.anIntArray322[local23 + 1];
								local651 = Static175.anIntArray322[local23 + 4];
								Static175.anIntArray322[local23++] = local777 + (local651 - local1645) * (-local777 + local782) / (local630 - local1645);
								continue;
							}
							@Pc(2969) long local2969;
							@Pc(2962) long local2962;
							if (local209 == 4007) {
								local23 -= 2;
								local2962 = Static175.anIntArray322[local23];
								local2969 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = (int) (local2969 * local2962 / 100L + local2962);
								continue;
							}
							if (local209 == 4008) {
								local23 -= 2;
								local782 = Static175.anIntArray322[local23 + 1];
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = 0x1 << local782 | local777;
								continue;
							}
							if (local209 == 4009) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = local777 & -(0x1 << local782) - 1;
								continue;
							}
							if (local209 == 4010) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = (local777 & 0x1 << local782) == 0 ? 0 : 1;
								continue;
							}
							if (local209 == 4011) {
								local23 -= 2;
								local782 = Static175.anIntArray322[local23 + 1];
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = local777 % local782;
								continue;
							}
							if (local209 == 4012) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								if (local777 == 0) {
									Static175.anIntArray322[local23++] = 0;
								} else {
									Static175.anIntArray322[local23++] = (int) Math.pow((double) local777, (double) local782);
								}
								continue;
							}
							if (local209 == 4013) {
								local23 -= 2;
								local782 = Static175.anIntArray322[local23 + 1];
								local777 = Static175.anIntArray322[local23];
								if (local777 == 0) {
									Static175.anIntArray322[local23++] = 0;
								} else if (local782 == 0) {
									Static175.anIntArray322[local23++] = Integer.MAX_VALUE;
								} else {
									Static175.anIntArray322[local23++] = (int) Math.pow((double) local777, 1.0D / (double) local782);
								}
								continue;
							}
							if (local209 == 4014) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = local782 & local777;
								continue;
							}
							if (local209 == 4015) {
								local23 -= 2;
								local782 = Static175.anIntArray322[local23 + 1];
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = local777 | local782;
								continue;
							}
							if (local209 == 4016) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = local782 <= local777 ? local782 : local777;
								continue;
							}
							if (local209 == 4017) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = local777 > local782 ? local777 : local782;
								continue;
							}
							if (local209 == 4018) {
								local23 -= 3;
								local2969 = Static175.anIntArray322[local23 + 1];
								local2962 = Static175.anIntArray322[local23];
								@Pc(3312) long local3312 = (long) Static175.anIntArray322[local23 + 2];
								Static175.anIntArray322[local23++] = (int) (local2962 * local3312 / local2969);
								continue;
							}
						} else if (local209 < 4200) {
							if (local209 == 4100) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local23--;
								local782 = Static175.anIntArray322[local23];
								Static51.aClass62Array29[local33++] = Static169.method2460(new Class62[] { local586, Static119.method1865(local782) });
								continue;
							}
							if (local209 == 4101) {
								local33 -= 2;
								local586 = Static51.aClass62Array29[local33];
								local1350 = Static51.aClass62Array29[local33 + 1];
								Static51.aClass62Array29[local33++] = Static169.method2460(new Class62[] { local586, local1350 });
								continue;
							}
							if (local209 == 4102) {
								local23--;
								local782 = Static175.anIntArray322[local23];
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static51.aClass62Array29[local33++] = Static169.method2460(new Class62[] { local586, Static83.method1174(local782) });
								continue;
							}
							if (local209 == 4103) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static51.aClass62Array29[local33++] = local586.method1872();
								continue;
							}
							if (local209 == 4104) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								@Pc(5710) long local5710 = ((long) local777 + 11745L) * 86400000L;
								Static132.aCalendar1.setTime(new Date(local5710));
								local630 = Static132.aCalendar1.get(5);
								local651 = Static132.aCalendar1.get(2);
								local1879 = Static132.aCalendar1.get(1);
								Static51.aClass62Array29[local33++] = Static169.method2460(new Class62[] { Static119.method1865(local630), Static18.aClass62_135, Static120.aClass62Array82[local651], Static18.aClass62_135, Static119.method1865(local1879) });
								continue;
							}
							if (local209 == 4105) {
								local33 -= 2;
								local586 = Static51.aClass62Array29[local33];
								local1350 = Static51.aClass62Array29[local33 + 1];
								if (Static186.aClass7_Sub2_Sub2_1.aClass28_2 != null && Static186.aClass7_Sub2_Sub2_1.aClass28_2.aBoolean46) {
									Static51.aClass62Array29[local33++] = local1350;
									continue;
								}
								Static51.aClass62Array29[local33++] = local586;
								continue;
							}
							if (local209 == 4106) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static51.aClass62Array29[local33++] = Static119.method1865(local777);
								continue;
							}
							if (local209 == 4107) {
								local33 -= 2;
								Static175.anIntArray322[local23++] = Static51.aClass62Array29[local33].method1841(Static51.aClass62Array29[local33 + 1]);
								continue;
							}
							@Pc(5876) Class2_Sub1_Sub12_Sub1_Sub1 local5876;
							@Pc(5871) byte[] local5871;
							if (local209 == 4108) {
								local23 -= 2;
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local1645 = Static175.anIntArray322[local23 + 1];
								local782 = Static175.anIntArray322[local23];
								local5871 = Static86.aClass71_Sub1_20.method2130(local1645, 0);
								local5876 = new Class2_Sub1_Sub12_Sub1_Sub1(local5871);
								local5876.method1383(Static78.aClass42Array5, null);
								Static175.anIntArray322[local23++] = local5876.method1365(local586, local782);
								continue;
							}
							if (local209 == 4109) {
								local23 -= 2;
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local782 = Static175.anIntArray322[local23];
								local1645 = Static175.anIntArray322[local23 + 1];
								local5871 = Static86.aClass71_Sub1_20.method2130(local1645, 0);
								local5876 = new Class2_Sub1_Sub12_Sub1_Sub1(local5871);
								local5876.method1383(Static78.aClass42Array5, null);
								Static175.anIntArray322[local23++] = local5876.method1360(local586, local782);
								continue;
							}
							if (local209 == 4110) {
								local33 -= 2;
								local1350 = Static51.aClass62Array29[local33 + 1];
								local586 = Static51.aClass62Array29[local33];
								local23--;
								if (Static175.anIntArray322[local23] == 1) {
									Static51.aClass62Array29[local33++] = local586;
								} else {
									Static51.aClass62Array29[local33++] = local1350;
								}
								continue;
							}
							if (local209 == 4111) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static51.aClass62Array29[local33++] = Static98.method1378(local586);
								continue;
							}
							if (local209 == 4112) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local23--;
								local782 = Static175.anIntArray322[local23];
								if (local782 == -1) {
									throw new RuntimeException("null char");
								}
								Static51.aClass62Array29[local33++] = local586.method1851(local782);
								continue;
							}
							if (local209 == 4113) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static17.method331(local777) ? 1 : 0;
								continue;
							}
							if (local209 == 4114) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static84.method2585(local777) ? 1 : 0;
								continue;
							}
							if (local209 == 4115) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static51.method769(local777) ? 1 : 0;
								continue;
							}
							if (local209 == 4116) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static55.method787(local777) ? 1 : 0;
								continue;
							}
							if (local209 == 4117) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								if (local586 == null) {
									Static175.anIntArray322[local23++] = 0;
								} else {
									Static175.anIntArray322[local23++] = local586.method1878();
								}
								continue;
							}
							if (local209 == 4118) {
								local23 -= 2;
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local1645 = Static175.anIntArray322[local23 + 1];
								local782 = Static175.anIntArray322[local23];
								Static51.aClass62Array29[local33++] = local586.method1862(local782, local1645);
								continue;
							}
							if (local209 == 4119) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local1350 = Static206.method277(local586.method1878());
								@Pc(6184) boolean local6184 = false;
								for (local630 = 0; local586.method1878() > local630; local630++) {
									local651 = local586.method1857(local630);
									if (local651 == 60) {
										local6184 = true;
									} else if (local651 == 62) {
										local6184 = false;
									} else if (!local6184) {
										local1350.method1859(local651);
									}
								}
								local1350.method1852();
								Static51.aClass62Array29[local33++] = local1350;
								continue;
							}
							if (local209 == 4120) {
								local23 -= 2;
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local782 = Static175.anIntArray322[local23];
								local1645 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = local586.method1874(local1645, local782);
								continue;
							}
							if (local209 == 4121) {
								local33 -= 2;
								local1350 = Static51.aClass62Array29[local33 + 1];
								local586 = Static51.aClass62Array29[local33];
								local23--;
								local1645 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = local586.method1866(local1645, local1350);
								continue;
							}
							if (local209 == 4122) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static132.method2032(local777);
								continue;
							}
							if (local209 == 4123) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static30.method533(local777);
								continue;
							}
						} else if (local209 < 4300) {
							if (local209 == 4200) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static51.aClass62Array29[local33++] = Static52.method774(local777).aClass62_1540;
								continue;
							}
							@Pc(5279) Class2_Sub1_Sub26 local5279;
							if (local209 == 4201) {
								local23 -= 2;
								local782 = Static175.anIntArray322[local23 + 1];
								local777 = Static175.anIntArray322[local23];
								local5279 = Static52.method774(local777);
								if (local782 >= 1 && local782 <= 5 && local5279.aClass62Array136[local782 - 1] != null) {
									Static51.aClass62Array29[local33++] = local5279.aClass62Array136[local782 - 1];
									continue;
								}
								Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								continue;
							}
							if (local209 == 4202) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								local5279 = Static52.method774(local777);
								if (local782 >= 1 && local782 <= 5 && local5279.aClass62Array137[local782 - 1] != null) {
									Static51.aClass62Array29[local33++] = local5279.aClass62Array137[local782 - 1];
									continue;
								}
								Static51.aClass62Array29[local33++] = Static58.aClass62_395;
								continue;
							}
							if (local209 == 4203) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static52.method774(local777).anInt4537;
								continue;
							}
							if (local209 == 4204) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static52.method774(local777).anInt4541 == 1 ? 1 : 0;
								continue;
							}
							@Pc(5426) Class2_Sub1_Sub26 local5426;
							if (local209 == 4205) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local5426 = Static52.method774(local777);
								if (local5426.anInt4538 == -1 && local5426.anInt4524 >= 0) {
									Static175.anIntArray322[local23++] = local5426.anInt4524;
									continue;
								}
								Static175.anIntArray322[local23++] = local777;
								continue;
							}
							if (local209 == 4206) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local5426 = Static52.method774(local777);
								if (local5426.anInt4538 >= 0 && local5426.anInt4524 >= 0) {
									Static175.anIntArray322[local23++] = local5426.anInt4524;
									continue;
								}
								Static175.anIntArray322[local23++] = local777;
								continue;
							}
							if (local209 == 4207) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static52.method774(local777).aBoolean194 ? 1 : 0;
								continue;
							}
							if (local209 == 4210) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local23--;
								local782 = Static175.anIntArray322[local23];
								Static32.method566(local782 == 1, local586);
								Static175.anIntArray322[local23++] = Static71.anInt1469;
								continue;
							}
							if (local209 == 4211) {
								if (Static187.aShortArray135 != null && Static71.anInt1469 > Static158.anInt3377) {
									Static175.anIntArray322[local23++] = Static187.aShortArray135[Static158.anInt3377++] & 0xFFFF;
									continue;
								}
								Static175.anIntArray322[local23++] = -1;
								continue;
							}
							if (local209 == 4212) {
								Static158.anInt3377 = 0;
								continue;
							}
						} else if (local209 < 5100) {
							if (local209 == 5000) {
								Static175.anIntArray322[local23++] = Static214.anInt4480;
								continue;
							}
							if (local209 == 5001) {
								local23 -= 3;
								Static214.anInt4480 = Static175.anIntArray322[local23];
								Static13.anInt333 = Static175.anIntArray322[local23 + 1];
								Static146.anInt3137 = Static175.anIntArray322[local23 + 2];
								Static58.aClass2_Sub11_Sub1_2.method1595(210);
								Static58.aClass2_Sub11_Sub1_2.method1565(Static214.anInt4480);
								Static58.aClass2_Sub11_Sub1_2.method1565(Static13.anInt333);
								Static58.aClass2_Sub11_Sub1_2.method1565(Static146.anInt3137);
								continue;
							}
							if (local209 == 5002) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								local23 -= 2;
								local782 = Static175.anIntArray322[local23];
								local1645 = Static175.anIntArray322[local23 + 1];
								Static58.aClass2_Sub11_Sub1_2.method1595(187);
								Static58.aClass2_Sub11_Sub1_2.method1527(local586.method1843());
								Static58.aClass2_Sub11_Sub1_2.method1565(local782 - 1);
								Static58.aClass2_Sub11_Sub1_2.method1565(local1645);
								continue;
							}
							if (local209 == 5003) {
								local1350 = null;
								local23--;
								local777 = Static175.anIntArray322[local23];
								if (local777 < 100) {
									local1350 = Static81.aClass62Array134[local777];
								}
								if (local1350 == null) {
									local1350 = Static58.aClass62_395;
								}
								Static51.aClass62Array29[local33++] = local1350;
								continue;
							}
							if (local209 == 5004) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local782 = -1;
								if (local777 < 100 && Static81.aClass62Array134[local777] != null) {
									local782 = Static2.anIntArray4[local777];
								}
								Static175.anIntArray322[local23++] = local782;
								continue;
							}
							if (local209 == 5005) {
								Static175.anIntArray322[local23++] = Static13.anInt333;
								continue;
							}
							if (local209 == 5008) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								if (local586.method1880(Static174.aClass62_1303)) {
									Static77.method2471(local586);
								} else {
									local1350 = local586.method1872();
									@Pc(3538) byte local3538 = 0;
									@Pc(3540) byte local3540 = 0;
									if (local1350.method1880(Static197.aClass62_1422)) {
										local3538 = 0;
										local586 = local586.method1849(Static197.aClass62_1422.method1878());
									} else if (local1350.method1880(Static168.aClass62_1252)) {
										local586 = local586.method1849(Static168.aClass62_1252.method1878());
										local3538 = 1;
									} else if (local1350.method1880(Static170.aClass62_1275)) {
										local3538 = 2;
										local586 = local586.method1849(Static170.aClass62_1275.method1878());
									} else if (local1350.method1880(Static71.aClass62_493)) {
										local3538 = 3;
										local586 = local586.method1849(Static71.aClass62_493.method1878());
									} else if (local1350.method1880(Static25.aClass62_174)) {
										local586 = local586.method1849(Static25.aClass62_174.method1878());
										local3538 = 4;
									} else if (local1350.method1880(Static143.aClass62_1061)) {
										local586 = local586.method1849(Static143.aClass62_1061.method1878());
										local3538 = 5;
									} else if (local1350.method1880(Static172.aClass62_222)) {
										local586 = local586.method1849(Static172.aClass62_222.method1878());
										local3538 = 6;
									} else if (local1350.method1880(Static153.aClass62_1132)) {
										local3538 = 7;
										local586 = local586.method1849(Static153.aClass62_1132.method1878());
									} else if (local1350.method1880(Static197.aClass62_1418)) {
										local3538 = 8;
										local586 = local586.method1849(Static197.aClass62_1418.method1878());
									} else if (local1350.method1880(Static122.aClass62_954)) {
										local586 = local586.method1849(Static122.aClass62_954.method1878());
										local3538 = 9;
									} else if (local1350.method1880(Static99.aClass62_781)) {
										local3538 = 10;
										local586 = local586.method1849(Static99.aClass62_781.method1878());
									} else if (local1350.method1880(Static25.aClass62_167)) {
										local586 = local586.method1849(Static25.aClass62_167.method1878());
										local3538 = 11;
									} else if (Static134.anInt2873 != 0) {
										if (local1350.method1880(Static197.aClass62_1426)) {
											local586 = local586.method1849(Static197.aClass62_1426.method1878());
											local3538 = 0;
										} else if (local1350.method1880(Static168.aClass62_1254)) {
											local586 = local586.method1849(Static168.aClass62_1254.method1878());
											local3538 = 1;
										} else if (local1350.method1880(Static170.aClass62_1279)) {
											local3538 = 2;
											local586 = local586.method1849(Static170.aClass62_1279.method1878());
										} else if (local1350.method1880(Static71.aClass62_495)) {
											local3538 = 3;
											local586 = local586.method1849(Static71.aClass62_495.method1878());
										} else if (local1350.method1880(Static25.aClass62_173)) {
											local3538 = 4;
											local586 = local586.method1849(Static25.aClass62_173.method1878());
										} else if (local1350.method1880(Static143.aClass62_1059)) {
											local3538 = 5;
											local586 = local586.method1849(Static143.aClass62_1059.method1878());
										} else if (local1350.method1880(Static172.aClass62_218)) {
											local586 = local586.method1849(Static172.aClass62_218.method1878());
											local3538 = 6;
										} else if (local1350.method1880(Static153.aClass62_1129)) {
											local586 = local586.method1849(Static153.aClass62_1129.method1878());
											local3538 = 7;
										} else if (local1350.method1880(Static197.aClass62_1427)) {
											local586 = local586.method1849(Static197.aClass62_1427.method1878());
											local3538 = 8;
										} else if (local1350.method1880(Static122.aClass62_956)) {
											local3538 = 9;
											local586 = local586.method1849(Static122.aClass62_956.method1878());
										} else if (local1350.method1880(Static99.aClass62_782)) {
											local586 = local586.method1849(Static99.aClass62_782.method1878());
											local3538 = 10;
										} else if (local1350.method1880(Static25.aClass62_170)) {
											local586 = local586.method1849(Static25.aClass62_170.method1878());
											local3538 = 11;
										}
									}
									local1350 = local586.method1872();
									if (local1350.method1880(Static118.aClass62_904)) {
										local586 = local586.method1849(Static118.aClass62_904.method1878());
										local3540 = 1;
									} else if (local1350.method1880(Static159.aClass62_1206)) {
										local586 = local586.method1849(Static159.aClass62_1206.method1878());
										local3540 = 2;
									} else if (local1350.method1880(Static96.aClass62_764)) {
										local3540 = 3;
										local586 = local586.method1849(Static96.aClass62_764.method1878());
									} else if (local1350.method1880(Static32.aClass62_246)) {
										local586 = local586.method1849(Static32.aClass62_246.method1878());
										local3540 = 4;
									} else if (local1350.method1880(Static164.aClass62_1234)) {
										local586 = local586.method1849(Static164.aClass62_1234.method1878());
										local3540 = 5;
									} else if (Static134.anInt2873 != 0) {
										if (local1350.method1880(Static118.aClass62_906)) {
											local3540 = 1;
											local586 = local586.method1849(Static118.aClass62_906.method1878());
										} else if (local1350.method1880(Static159.aClass62_1208)) {
											local3540 = 2;
											local586 = local586.method1849(Static159.aClass62_1208.method1878());
										} else if (local1350.method1880(Static96.aClass62_760)) {
											local586 = local586.method1849(Static96.aClass62_760.method1878());
											local3540 = 3;
										} else if (local1350.method1880(Static32.aClass62_249)) {
											local586 = local586.method1849(Static32.aClass62_249.method1878());
											local3540 = 4;
										} else if (local1350.method1880(Static164.aClass62_1233)) {
											local3540 = 5;
											local586 = local586.method1849(Static164.aClass62_1233.method1878());
										}
									}
									Static58.aClass2_Sub11_Sub1_2.method1595(69);
									Static58.aClass2_Sub11_Sub1_2.method1565(0);
									local651 = Static58.aClass2_Sub11_Sub1_2.anInt2235;
									Static58.aClass2_Sub11_Sub1_2.method1565(local3538);
									Static58.aClass2_Sub11_Sub1_2.method1565(local3540);
									Static175.method2552(local586, Static58.aClass2_Sub11_Sub1_2);
									Static58.aClass2_Sub11_Sub1_2.method1549(Static58.aClass2_Sub11_Sub1_2.anInt2235 - local651);
								}
								continue;
							}
							if (local209 == 5009) {
								local33 -= 2;
								local1350 = Static51.aClass62Array29[local33 + 1];
								local586 = Static51.aClass62Array29[local33];
								Static58.aClass2_Sub11_Sub1_2.method1595(219);
								Static58.aClass2_Sub11_Sub1_2.method1565(0);
								local1645 = Static58.aClass2_Sub11_Sub1_2.anInt2235;
								Static58.aClass2_Sub11_Sub1_2.method1527(local586.method1843());
								Static175.method2552(local1350, Static58.aClass2_Sub11_Sub1_2);
								Static58.aClass2_Sub11_Sub1_2.method1549(Static58.aClass2_Sub11_Sub1_2.anInt2235 - local1645);
								continue;
							}
							if (local209 == 5010) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local1350 = null;
								if (local777 < 100) {
									local1350 = Static206.aClass62Array12[local777];
								}
								if (local1350 == null) {
									local1350 = Static58.aClass62_395;
								}
								Static51.aClass62Array29[local33++] = local1350;
								continue;
							}
							if (local209 == 5011) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local1350 = null;
								if (local777 < 100) {
									local1350 = Static104.aClass62Array73[local777];
								}
								if (local1350 == null) {
									local1350 = Static58.aClass62_395;
								}
								Static51.aClass62Array29[local33++] = local1350;
								continue;
							}
							if (local209 == 5012) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local782 = -1;
								if (local777 < 100) {
									local782 = Static39.anIntArray400[local777];
								}
								Static175.anIntArray322[local23++] = local782;
								continue;
							}
							if (local209 == 5015) {
								if (Static186.aClass7_Sub2_Sub2_1 == null || Static186.aClass7_Sub2_Sub2_1.aClass62_1072 == null) {
									local586 = Static137.aClass62_1026;
								} else {
									local586 = Static186.aClass7_Sub2_Sub2_1.aClass62_1072;
								}
								Static51.aClass62Array29[local33++] = local586;
								continue;
							}
							if (local209 == 5016) {
								Static175.anIntArray322[local23++] = Static146.anInt3137;
								continue;
							}
							if (local209 == 5017) {
								Static175.anIntArray322[local23++] = Static197.anInt4089;
								continue;
							}
							if (local209 == 5050) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static51.aClass62Array29[local33++] = Static90.method26(local777).aClass62_860;
								continue;
							}
							@Pc(4343) Class2_Sub1_Sub15 local4343;
							if (local209 == 5051) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local4343 = Static90.method26(local777);
								if (local4343.anIntArray232 == null) {
									Static175.anIntArray322[local23++] = 0;
								} else {
									Static175.anIntArray322[local23++] = local4343.anIntArray232.length;
								}
								continue;
							}
							if (local209 == 5052) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = Static90.method26(local777).anIntArray232[local782];
								continue;
							}
							if (local209 == 5053) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								local4343 = Static90.method26(local777);
								if (local4343.anIntArray231 == null) {
									Static175.anIntArray322[local23++] = 0;
								} else {
									Static175.anIntArray322[local23++] = local4343.anIntArray231.length;
								}
								continue;
							}
							if (local209 == 5054) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = Static90.method26(local777).anIntArray231[local782];
								continue;
							}
							if (local209 == 5055) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static51.aClass62Array29[local33++] = Static106.method1670(local777).method330();
								continue;
							}
							if (local209 == 5056) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								@Pc(4484) Class2_Sub1_Sub3 local4484 = Static106.method1670(local777);
								if (local4484.anIntArray36 == null) {
									Static175.anIntArray322[local23++] = 0;
								} else {
									Static175.anIntArray322[local23++] = local4484.anIntArray36.length;
								}
								continue;
							}
							if (local209 == 5057) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = Static106.method1670(local777).anIntArray36[local782];
								continue;
							}
							if (local209 == 5058) {
								Static123.aClass102_11 = new Class102();
								local23--;
								Static123.aClass102_11.anInt4174 = Static175.anIntArray322[local23];
								Static123.aClass102_11.aClass2_Sub1_Sub3_1 = Static106.method1670(Static123.aClass102_11.anInt4174);
								Static123.aClass102_11.anIntArray374 = new int[Static123.aClass102_11.aClass2_Sub1_Sub3_1.method327()];
								continue;
							}
							if (local209 == 5059) {
								Static58.aClass2_Sub11_Sub1_2.method1595(248);
								Static58.aClass2_Sub11_Sub1_2.method1565(0);
								local777 = Static58.aClass2_Sub11_Sub1_2.anInt2235;
								Static58.aClass2_Sub11_Sub1_2.method1565(0);
								Static58.aClass2_Sub11_Sub1_2.method1533(Static123.aClass102_11.anInt4174);
								Static123.aClass102_11.aClass2_Sub1_Sub3_1.method338(Static123.aClass102_11.anIntArray374, Static58.aClass2_Sub11_Sub1_2);
								Static58.aClass2_Sub11_Sub1_2.method1549(Static58.aClass2_Sub11_Sub1_2.anInt2235 - local777);
								continue;
							}
							if (local209 == 5060) {
								local33--;
								local586 = Static51.aClass62Array29[local33];
								Static58.aClass2_Sub11_Sub1_2.method1595(80);
								Static58.aClass2_Sub11_Sub1_2.method1565(0);
								local782 = Static58.aClass2_Sub11_Sub1_2.anInt2235;
								Static58.aClass2_Sub11_Sub1_2.method1527(local586.method1843());
								Static58.aClass2_Sub11_Sub1_2.method1533(Static123.aClass102_11.anInt4174);
								Static123.aClass102_11.aClass2_Sub1_Sub3_1.method338(Static123.aClass102_11.anIntArray374, Static58.aClass2_Sub11_Sub1_2);
								Static58.aClass2_Sub11_Sub1_2.method1549(Static58.aClass2_Sub11_Sub1_2.anInt2235 - local782);
								continue;
							}
							if (local209 == 5061) {
								Static58.aClass2_Sub11_Sub1_2.method1595(248);
								Static58.aClass2_Sub11_Sub1_2.method1565(0);
								local777 = Static58.aClass2_Sub11_Sub1_2.anInt2235;
								Static58.aClass2_Sub11_Sub1_2.method1565(1);
								Static58.aClass2_Sub11_Sub1_2.method1533(Static123.aClass102_11.anInt4174);
								Static123.aClass102_11.aClass2_Sub1_Sub3_1.method338(Static123.aClass102_11.anIntArray374, Static58.aClass2_Sub11_Sub1_2);
								Static58.aClass2_Sub11_Sub1_2.method1549(Static58.aClass2_Sub11_Sub1_2.anInt2235 - local777);
								continue;
							}
							if (local209 == 5062) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = Static90.method26(local777).anIntArray230[local782];
								continue;
							}
							if (local209 == 5063) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static175.anIntArray322[local23++] = Static90.method26(local777).anIntArray229[local782];
								continue;
							}
							if (local209 == 5064) {
								local23 -= 2;
								local782 = Static175.anIntArray322[local23 + 1];
								local777 = Static175.anIntArray322[local23];
								if (local782 == -1) {
									Static175.anIntArray322[local23++] = -1;
								} else {
									Static175.anIntArray322[local23++] = Static90.method26(local777).method1744(local782);
								}
								continue;
							}
							if (local209 == 5065) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								if (local782 == -1) {
									Static175.anIntArray322[local23++] = -1;
								} else {
									Static175.anIntArray322[local23++] = Static90.method26(local777).method1740(local782);
								}
								continue;
							}
							if (local209 == 5066) {
								local23--;
								local777 = Static175.anIntArray322[local23];
								Static175.anIntArray322[local23++] = Static106.method1670(local777).method327();
								continue;
							}
							if (local209 == 5067) {
								local23 -= 2;
								local782 = Static175.anIntArray322[local23 + 1];
								local777 = Static175.anIntArray322[local23];
								local1645 = Static106.method1670(local777).method339(local782);
								System.out.println("chatphrase_getdynamiccommand=" + local1645);
								Static175.anIntArray322[local23++] = local1645;
								continue;
							}
							if (local209 == 5068) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static123.aClass102_11.anIntArray374[local777] = local782;
								continue;
							}
							if (local209 == 5069) {
								local23 -= 2;
								local777 = Static175.anIntArray322[local23];
								local782 = Static175.anIntArray322[local23 + 1];
								Static123.aClass102_11.anIntArray374[local777] = local782;
								continue;
							}
							if (local209 == 5070) {
								local23 -= 3;
								local782 = Static175.anIntArray322[local23 + 1];
								local777 = Static175.anIntArray322[local23];
								local1645 = Static175.anIntArray322[local23 + 2];
								@Pc(4972) Class2_Sub1_Sub3 local4972 = Static106.method1670(local777);
								if (local4972.method339(local782) != 0) {
									throw new RuntimeException("bad command");
								}
								Static175.anIntArray322[local23++] = local4972.method336(local782, local1645);
								continue;
							}
						} else if (local209 < 5200) {
							if (local209 == 5100) {
								if (Static7.aBooleanArray15[86]) {
									Static175.anIntArray322[local23++] = 1;
								} else {
									Static175.anIntArray322[local23++] = 0;
								}
								continue;
							}
							if (local209 == 5101) {
								if (Static7.aBooleanArray15[82]) {
									Static175.anIntArray322[local23++] = 1;
								} else {
									Static175.anIntArray322[local23++] = 0;
								}
								continue;
							}
							if (local209 == 5102) {
								if (Static7.aBooleanArray15[81]) {
									Static175.anIntArray322[local23++] = 1;
								} else {
									Static175.anIntArray322[local23++] = 0;
								}
								continue;
							}
						} else if (local209 < 5300) {
							if (local209 == 5200) {
								local23--;
								Static211.method3089(Static175.anIntArray322[local23]);
								continue;
							}
							if (local209 == 5201) {
								Static175.anIntArray322[local23++] = Static108.method1686();
								continue;
							}
							if (local209 == 5202) {
								local23--;
								Static104.method1633(Static175.anIntArray322[local23]);
								continue;
							}
							if (local209 == 5203) {
								local33--;
								Static200.method2931(Static51.aClass62Array29[local33]);
								continue;
							}
							if (local209 == 5204) {
								Static51.aClass62Array29[local33 - 1] = Static80.method1135(Static51.aClass62Array29[local33 - 1]);
								continue;
							}
							if (local209 == 5205) {
								local33--;
								Static174.method2534(Static51.aClass62Array29[local33]);
								continue;
							}
						} else if (local209 >= 5400) {
							if (local209 < 5500) {
								if (local209 == 5400) {
									local33 -= 2;
									local586 = Static51.aClass62Array29[local33];
									local1350 = Static51.aClass62Array29[local33 + 1];
									local23--;
									local1645 = Static175.anIntArray322[local23];
									Static58.aClass2_Sub11_Sub1_2.method1595(127);
									Static58.aClass2_Sub11_Sub1_2.method1565(Static157.method2319(local586) + Static157.method2319(local1350) + 1);
									Static58.aClass2_Sub11_Sub1_2.method1540(local586);
									Static58.aClass2_Sub11_Sub1_2.method1540(local1350);
									Static58.aClass2_Sub11_Sub1_2.method1565(local1645);
									continue;
								}
								if (local209 == 5401) {
									local23 -= 2;
									Static2.aShortArray7[Static175.anIntArray322[local23]] = (short) Static101.method1613(Static175.anIntArray322[local23 + 1]);
									continue;
								}
							}
						} else if (local209 == 5304) {
							Static175.anIntArray322[local23++] = 0;
							continue;
						}
					}
				} else {
					if (local209 < 2000) {
						local1020 = local975 ? Static92.aClass47_9 : aClass47_6;
					} else {
						local23--;
						local1020 = Static143.method2159(Static175.anIntArray322[local23]);
						local209 -= 1000;
					}
					if (local209 == 1000) {
						local23 -= 2;
						local1020.aByte4 = 0;
						local1020.anInt1865 = local1020.anInt1864 = Static175.anIntArray322[local23];
						local1020.aByte6 = 0;
						local1020.anInt1912 = local1020.anInt1841 = Static175.anIntArray322[local23 + 1];
						Static165.method2410(local1020);
						continue;
					}
					if (local209 == 1001) {
						local1020.aByte3 = 0;
						local23 -= 2;
						local1020.anInt1910 = local1020.anInt1845 = Static175.anIntArray322[local23];
						local1020.aByte5 = 0;
						local1020.anInt1909 = 0;
						local1020.anInt1858 = local1020.anInt1837 = Static175.anIntArray322[local23 + 1];
						local1020.anInt1846 = 0;
						Static165.method2410(local1020);
						if (local1020.anInt1870 == 0) {
							Static208.method3033(local1020);
						}
						continue;
					}
					if (local209 == 1003) {
						local23--;
						@Pc(8700) boolean local8700 = Static175.anIntArray322[local23] == 1;
						if (local1020.aBoolean102 != local8700) {
							local1020.aBoolean102 = local8700;
							Static165.method2410(local1020);
						}
						continue;
					}
				}
				throw new IllegalStateException();
			}
		} catch (@Pc(9082) Exception local9082) {
			if (local18.aClass62_943 == null) {
				if (Static187.anInt3891 != 0) {
					Static154.method2292(Static68.aClass62_483, 0, Static58.aClass62_395);
				}
				Static84.method2582("CS2 - scr:" + local18.aLong148 + " op:" + local35, local9082);
			} else {
				@Pc(9089) Class62 local9089 = Static206.method277(30);
				local9089.method1871(Static172.aClass62_219).method1871(local18.aClass62_943);
				for (local51 = Static16.anInt420 - 1; local51 >= 0; local51--) {
					local9089.method1871(Static95.aClass62_751).method1871(Static30.aClass48Array1[local51].aClass2_Sub1_Sub16_1.aClass62_943);
				}
				if (local35 == 40) {
					local89 = local31[local37];
					local9089.method1871(Static7.aClass62_847).method1871(Static119.method1865(local89));
				}
				if (Static187.anInt3891 != 0) {
					Static154.method2292(Static169.method2460(new Class62[] { Static31.aClass62_235, local18.aClass62_943 }), 0, Static58.aClass62_395);
				}
				Static84.method2582("CS2 - scr:" + local18.aLong148 + " op:" + local35 + new String(local9089.method1845()), local9082);
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Lclient!tb;IIIIII)V")
	public static void method1042(@OriginalArg(0) Class93 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) int local3 = arg0.anIntArray341.length;
		@Pc(13) int local13;
		@Pc(20) int local20;
		@Pc(27) int local27;
		@Pc(37) int local37;
		for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
			local13 = arg0.anIntArray341[local5] - Static189.anInt3928;
			local20 = arg0.anIntArray349[local5] - Static52.anInt1112;
			local27 = arg0.anIntArray342[local5] - Static172.anInt679;
			local37 = local27 * arg3 + local13 * arg4 >> 16;
			@Pc(47) int local47 = local27 * arg4 - local13 * arg3 >> 16;
			@Pc(59) int local59 = local20 * arg2 - local47 * arg1 >> 16;
			@Pc(69) int local69 = local20 * arg1 + local47 * arg2 >> 16;
			if (local69 < 50) {
				return;
			}
			if (arg0.anIntArray335 != null) {
				Static183.anIntArray338[local5] = local37;
				Static183.anIntArray347[local5] = local59;
				Static183.anIntArray337[local5] = local69;
			}
			Static183.anIntArray345[local5] = Static45.anInt1015 + (local37 << 9) / local69;
			Static183.anIntArray336[local5] = Static45.anInt1014 + (local59 << 9) / local69;
		}
		Static45.anInt1013 = 0;
		local3 = arg0.anIntArray344.length;
		for (local13 = 0; local13 < local3; local13++) {
			local20 = arg0.anIntArray344[local13];
			local27 = arg0.anIntArray339[local13];
			local37 = arg0.anIntArray348[local13];
			@Pc(142) int local142 = Static183.anIntArray345[local20];
			@Pc(146) int local146 = Static183.anIntArray345[local27];
			@Pc(150) int local150 = Static183.anIntArray345[local37];
			@Pc(154) int local154 = Static183.anIntArray336[local20];
			@Pc(158) int local158 = Static183.anIntArray336[local27];
			@Pc(162) int local162 = Static183.anIntArray336[local37];
			if ((local142 - local146) * (local162 - local158) - (local154 - local158) * (local150 - local146) > 0) {
				if (Static139.aBoolean128 && Static193.method2761(Static156.anInt3329 + Static45.anInt1015, Static15.anInt358 + Static45.anInt1014, local154, local158, local162, local142, local146, local150)) {
					Static127.anInt2807 = arg5;
					Static5.anInt170 = arg6;
				}
				Static45.aBoolean44 = false;
				if (local142 < 0 || local146 < 0 || local150 < 0 || local142 > Static45.anInt1016 || local146 > Static45.anInt1016 || local150 > Static45.anInt1016) {
					Static45.aBoolean44 = true;
				}
				if (arg0.anIntArray335 == null || arg0.anIntArray335[local13] == -1) {
					if (arg0.anIntArray340[local13] != 12345678) {
						Static45.method699(local154, local158, local162, local142, local146, local150, arg0.anIntArray340[local13], arg0.anIntArray346[local13], arg0.anIntArray343[local13]);
					}
				} else if (Static164.aBoolean149) {
					@Pc(367) int local367 = Static45.anInterface3_1.method2298(arg0.anIntArray335[local13]);
					Static45.method699(local154, local158, local162, local142, local146, local150, Static130.method2001(local367, arg0.anIntArray340[local13]), Static130.method2001(local367, arg0.anIntArray346[local13]), Static130.method2001(local367, arg0.anIntArray343[local13]));
				} else if (arg0.aBoolean169) {
					Static45.method701(local154, local158, local162, local142, local146, local150, arg0.anIntArray340[local13], arg0.anIntArray346[local13], arg0.anIntArray343[local13], Static183.anIntArray338[0], Static183.anIntArray338[1], Static183.anIntArray338[3], Static183.anIntArray347[0], Static183.anIntArray347[1], Static183.anIntArray347[3], Static183.anIntArray337[0], Static183.anIntArray337[1], Static183.anIntArray337[3], arg0.anIntArray335[local13]);
				} else {
					Static45.method701(local154, local158, local162, local142, local146, local150, arg0.anIntArray340[local13], arg0.anIntArray346[local13], arg0.anIntArray343[local13], Static183.anIntArray338[local20], Static183.anIntArray338[local27], Static183.anIntArray338[local37], Static183.anIntArray347[local20], Static183.anIntArray347[local27], Static183.anIntArray347[local37], Static183.anIntArray337[local20], Static183.anIntArray337[local27], Static183.anIntArray337[local37], arg0.anIntArray335[local13]);
				}
			}
		}
	}
}
