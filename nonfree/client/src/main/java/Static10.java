import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!bc", name = "ib", descriptor = "Lclient!cb;")
	public static Class10 aClass10_1;

	@OriginalMember(owner = "client!bc", name = "sb", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray1;

	@OriginalMember(owner = "client!bc", name = "Q", descriptor = "Lclient!wd;")
	public static Class80 aClass80_133 = Static2.method59(" weitere Optionen");

	@OriginalMember(owner = "client!bc", name = "U", descriptor = "Lclient!wd;")
	public static Class80 aClass80_134 = Static2.method59("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "Lclient!i;")
	public static Class32 aClass32_8 = new Class32(64);

	@OriginalMember(owner = "client!bc", name = "W", descriptor = "[Z")
	public static boolean[] aBooleanArray2 = new boolean[112];

	@OriginalMember(owner = "client!bc", name = "ab", descriptor = "Lclient!wd;")
	private static Class80 aClass80_136 = Static2.method59("Hide");

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "Lclient!wd;")
	public static Class80 aClass80_135 = aClass80_136;

	@OriginalMember(owner = "client!bc", name = "hb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_137 = Static2.method59("Mem:");

	@OriginalMember(owner = "client!bc", name = "ob", descriptor = "I")
	public static int anInt298 = 0;

	@OriginalMember(owner = "client!bc", name = "qb", descriptor = "[Lclient!wd;")
	public static Class80[] aClass80Array2 = new Class80[20];

	@OriginalMember(owner = "client!bc", name = "rb", descriptor = "I")
	public static int anInt300 = 0;

	@OriginalMember(owner = "client!bc", name = "tb", descriptor = "[I")
	public static int[] anIntArray28 = new int[5];

	@OriginalMember(owner = "client!bc", name = "ub", descriptor = "Lclient!wd;")
	public static Class80 aClass80_138 = Static2.method59("Art");

	@OriginalMember(owner = "client!bc", name = "vb", descriptor = "Lclient!wd;")
	public static Class80 aClass80_139 = Static2.method59("redstone2");

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(Z)V")
	public static void method166() {
		aClass80_136 = null;
		aClass80_137 = null;
		aClass80_134 = null;
		aClass10_1 = null;
		aClass80_135 = null;
		aClass80_133 = null;
		aByteArrayArrayArray1 = null;
		aClass80_138 = null;
		aClass80Array2 = null;
		aClass80_139 = null;
		anIntArray28 = null;
		aBooleanArray2 = null;
		aClass32_8 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)V")
	public static void method167(@OriginalArg(0) int arg0) {
		if (Static114.anInt2934 == arg0) {
			return;
		}
		if (Static114.anInt2934 == 0) {
			Static39.method373();
		}
		if (arg0 == 20 || arg0 == 40) {
			Static6.anInt168 = 0;
			Static74.anInt1962 = 0;
			Static83.anInt2044 = 0;
		}
		if (arg0 != 20 && arg0 != 40 && Static118.aClass10_4 != null) {
			Static118.aClass10_4.method255();
			Static118.aClass10_4 = null;
		}
		if (Static114.anInt2934 == 25 || Static114.anInt2934 == 40) {
			Static20.method487();
			Static99.method1900();
		}
		if (Static114.anInt2934 == 25) {
			Static74.anInt1963 = 1;
			Static23.anInt893 = 1;
			Static9.anInt258 = 0;
			Static121.anInt3086 = 0;
			Static105.anInt2367 = 0;
		}
		if (arg0 == 35) {
			Static103.method1667();
			Static102.method1661();
			if (Static38.aClass22_7 == null) {
				Static38.aClass22_7 = Static70.method1128(Static119.aCanvas2, 503, 765);
			}
		}
		if (arg0 == 5 || arg0 == 10 || arg0 == 20) {
			Static38.aClass22_7 = null;
			Static103.method1667();
			Static60.method1048(Static57.aClass11_Sub1_11, Static119.aCanvas2, Static40.aClass11_Sub1_10);
		}
		if (arg0 == 25 || arg0 == 30 || arg0 == 40) {
			Static38.aClass22_7 = null;
			Static102.method1661();
			Static39.method371(Static119.aCanvas2, Static57.aClass11_Sub1_11);
		}
		Static114.anInt2934 = arg0;
		Static82.aBoolean236 = true;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	public static void method168(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			return;
		}
		@Pc(12) int local12 = Static77.anIntArray262[arg0];
		@Pc(16) int local16 = Static96.anIntArray325[arg0];
		@Pc(20) int local20 = Static57.anIntArray218[arg0];
		if (local20 >= 2000) {
			local20 -= 2000;
		}
		@Pc(33) int local33 = Static8.anIntArray19[arg0];
		if (Static42.anInt1258 != 0 && local20 != 1005) {
			Static42.anInt1258 = 0;
			Static37.aBoolean77 = true;
		}
		if (local20 == 5 && Static29.method564(local16, local33, local12)) {
			Static120.aClass2_Sub17_Sub1_3.method1799(75);
			Static120.aClass2_Sub17_Sub1_3.method1745(Static39.anInt707);
			Static120.aClass2_Sub17_Sub1_3.method1776(local33 >> 14 & 0x7FFF);
			Static120.aClass2_Sub17_Sub1_3.method1776(Static44.anInt1348);
			Static120.aClass2_Sub17_Sub1_3.method1774(Static32.anInt1107);
			Static120.aClass2_Sub17_Sub1_3.method1774(Static57.anInt1736 + local12);
			Static120.aClass2_Sub17_Sub1_3.method1785(local16 + Static66.anInt1860);
		}
		if (local20 == 19) {
			Static29.method564(local16, local33, local12);
			Static120.aClass2_Sub17_Sub1_3.method1799(88);
			Static120.aClass2_Sub17_Sub1_3.method1776(local16 + Static66.anInt1860);
			Static120.aClass2_Sub17_Sub1_3.method1774(local12 + Static57.anInt1736);
			Static120.aClass2_Sub17_Sub1_3.method1776(local33 >> 14 & 0x7FFF);
		}
		if (local20 == 48) {
			Static17.method322();
			Static39.anInt707 = local16;
			Static70.aBoolean131 = true;
			Static44.anInt1348 = local12;
			Static107.anInt2862 = 1;
			Static32.anInt1107 = local33;
			Static67.aClass80_712 = Static93.method1444(new Class80[] { Static50.aClass80_551, Static4.method95(local33).aClass80_271, Static3.aClass80_38 });
			if (Static67.aClass80_712 == null) {
				Static67.aClass80_712 = Static44.aClass80_507;
			}
			return;
		}
		if (local20 == 31) {
			Static120.aClass2_Sub17_Sub1_3.method1799(77);
			Static120.aClass2_Sub17_Sub1_3.method1774(local33);
			Static120.aClass2_Sub17_Sub1_3.method1757(local12);
			Static120.aClass2_Sub17_Sub1_3.method1745(local16);
			Static86.anInt2112 = local12;
			Static38.anInt1220 = local16;
			Static86.anInt2114 = 2;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			Static73.anInt1933 = 0;
			if (Static57.anInt1737 == local16 >> 16) {
				Static86.anInt2114 = 3;
			}
		}
		@Pc(239) Class2_Sub1_Sub1_Sub4_Sub1 local239;
		if (local20 == 44) {
			local239 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local33];
			if (local239 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local239.anIntArray309[0], local239.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static76.anInt1968 = 2;
				Static65.anInt1848 = 0;
				Static3.anInt123 = Static13.anInt365;
				Static55.anInt1316 = Static108.anInt2880;
				Static120.aClass2_Sub17_Sub1_3.method1799(54);
				Static120.aClass2_Sub17_Sub1_3.method1774(local33);
			}
		}
		if (local20 == 10) {
			Static120.aClass2_Sub17_Sub1_3.method1799(231);
			Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			Static120.aClass2_Sub17_Sub1_3.method1765(local16);
			Static120.aClass2_Sub17_Sub1_3.method1785(local12);
			Static86.anInt2114 = 2;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			Static38.anInt1220 = local16;
			Static73.anInt1933 = 0;
			if (local16 >> 16 == Static57.anInt1737) {
				Static86.anInt2114 = 3;
			}
			Static86.anInt2112 = local12;
		}
		if (local20 == 39) {
			Static105.method1435(local33, local16, local12);
		}
		if (local20 == 50) {
			local239 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local33];
			if (local239 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local239.anIntArray309[0], local239.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static3.anInt123 = Static13.anInt365;
				Static76.anInt1968 = 2;
				Static55.anInt1316 = Static108.anInt2880;
				Static65.anInt1848 = 0;
				Static120.aClass2_Sub17_Sub1_3.method1799(47);
				Static120.aClass2_Sub17_Sub1_3.method1776(local33);
			}
		}
		@Pc(430) boolean local430;
		if (local20 == 30) {
			local430 = Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 0, 0, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			if (!local430) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			}
			Static55.anInt1316 = Static108.anInt2880;
			Static3.anInt123 = Static13.anInt365;
			Static65.anInt1848 = 0;
			Static76.anInt1968 = 2;
			Static120.aClass2_Sub17_Sub1_3.method1799(70);
			Static120.aClass2_Sub17_Sub1_3.method1774(local16 + Static66.anInt1860);
			Static120.aClass2_Sub17_Sub1_3.method1776(local33);
			Static120.aClass2_Sub17_Sub1_3.method1757(Static57.anInt1736 + local12);
		}
		@Pc(491) Class2_Sub1_Sub1_Sub4_Sub2 local491;
		if (local20 == 36) {
			local491 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local33];
			if (local491 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local491.anIntArray309[0], local491.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static76.anInt1968 = 2;
				Static3.anInt123 = Static13.anInt365;
				Static65.anInt1848 = 0;
				Static55.anInt1316 = Static108.anInt2880;
				Static120.aClass2_Sub17_Sub1_3.method1799(142);
				Static120.aClass2_Sub17_Sub1_3.method1757(local33);
			}
		}
		if (local20 == 6) {
			Static120.aClass2_Sub17_Sub1_3.method1799(190);
			Static120.aClass2_Sub17_Sub1_3.method1757(local33);
			Static120.aClass2_Sub17_Sub1_3.method1776(local12);
			Static120.aClass2_Sub17_Sub1_3.method1765(local16);
			Static73.anInt1933 = 0;
			Static38.anInt1220 = local16;
			Static86.anInt2114 = 2;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			if (Static57.anInt1737 == local16 >> 16) {
				Static86.anInt2114 = 3;
			}
			Static86.anInt2112 = local12;
		}
		if (local20 == 28) {
			local239 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local33];
			if (local239 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local239.anIntArray309[0], local239.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static55.anInt1316 = Static108.anInt2880;
				Static3.anInt123 = Static13.anInt365;
				Static65.anInt1848 = 0;
				Static76.anInt1968 = 2;
				Static120.aClass2_Sub17_Sub1_3.method1799(74);
				Static120.aClass2_Sub17_Sub1_3.method1785(local33);
				Static120.aClass2_Sub17_Sub1_3.method1785(Static74.anInt1950);
				Static120.aClass2_Sub17_Sub1_3.method1798(Static43.anInt1292);
			}
		}
		@Pc(690) int local690;
		@Pc(672) Class2_Sub1_Sub17 local672;
		if (local20 == 16) {
			Static120.aClass2_Sub17_Sub1_3.method1799(208);
			Static120.aClass2_Sub17_Sub1_3.method1765(local16);
			local672 = Static123.method1976(local16);
			if (local672.anIntArrayArray30 != null && local672.anIntArrayArray30[0][0] == 5) {
				local690 = local672.anIntArrayArray30[0][1];
				if (Static15.anIntArray66[local690] != local672.anIntArray395[0]) {
					Static15.anIntArray66[local690] = local672.anIntArray395[0];
					Static90.method1345(local690);
					Static70.aBoolean131 = true;
				}
			}
		}
		if (local20 == 17) {
			Static120.aClass2_Sub17_Sub1_3.method1799(237);
			Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			Static120.aClass2_Sub17_Sub1_3.method1793(local16);
			Static120.aClass2_Sub17_Sub1_3.method1774(local12);
			Static86.anInt2114 = 2;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			if (Static57.anInt1737 == local16 >> 16) {
				Static86.anInt2114 = 3;
			}
			Static86.anInt2112 = local12;
			Static73.anInt1933 = 0;
			Static38.anInt1220 = local16;
		}
		if (local20 == 47) {
			Static120.aClass2_Sub17_Sub1_3.method1799(72);
			Static120.aClass2_Sub17_Sub1_3.method1757(Static74.anInt1950);
			Static120.aClass2_Sub17_Sub1_3.method1793(Static43.anInt1292);
			Static120.aClass2_Sub17_Sub1_3.method1757(local12);
			Static120.aClass2_Sub17_Sub1_3.method1765(local16);
		}
		@Pc(819) long local819;
		@Pc(821) int local821;
		@Pc(799) Class80 local799;
		if (local20 == 33) {
			local799 = Static2.aClass80Array1[arg0];
			local690 = local799.method2025(Static3.aClass80_38);
			if (local690 != -1) {
				local819 = local799.method2021(local690 + 5).method2026().method2023();
				local821 = -1;
				for (@Pc(823) int local823 = 0; local823 < Static45.anInt2090; local823++) {
					if (Static3.aLongArray1[local823] == local819) {
						local821 = local823;
						break;
					}
				}
				if (local821 != -1 && Static29.anIntArray125[local821] > 0) {
					Static53.aBoolean109 = true;
					Static42.anInt1258 = 0;
					Static61.anInt1794 = 3;
					Static37.aBoolean77 = true;
					Static40.aClass80_454 = Static40.aClass80_446;
					Static6.aLong8 = Static3.aLongArray1[local821];
					Static40.aClass80_450 = Static93.method1444(new Class80[] { Static57.aClass80_619, Static123.aClass80Array20[local821] });
				}
			}
		}
		if (local20 == 9) {
			local491 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local33];
			if (local491 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local491.anIntArray309[0], local491.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static65.anInt1848 = 0;
				Static76.anInt1968 = 2;
				Static3.anInt123 = Static13.anInt365;
				Static55.anInt1316 = Static108.anInt2880;
				Static120.aClass2_Sub17_Sub1_3.method1799(192);
				Static120.aClass2_Sub17_Sub1_3.method1774(Static32.anInt1107);
				Static120.aClass2_Sub17_Sub1_3.method1774(local33);
				Static120.aClass2_Sub17_Sub1_3.method1785(Static44.anInt1348);
				Static120.aClass2_Sub17_Sub1_3.method1798(Static39.anInt707);
			}
		}
		if (local20 == 2) {
			local430 = Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 0, 0, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			if (!local430) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			}
			Static3.anInt123 = Static13.anInt365;
			Static76.anInt1968 = 2;
			Static65.anInt1848 = 0;
			Static55.anInt1316 = Static108.anInt2880;
			Static120.aClass2_Sub17_Sub1_3.method1799(203);
			Static120.aClass2_Sub17_Sub1_3.method1785(local16 + Static66.anInt1860);
			Static120.aClass2_Sub17_Sub1_3.method1774(local12 + Static57.anInt1736);
			Static120.aClass2_Sub17_Sub1_3.method1776(local33);
		}
		if (local20 == 54) {
			Static120.aClass2_Sub17_Sub1_3.method1799(61);
			Static120.aClass2_Sub17_Sub1_3.method1793(local16);
			Static120.aClass2_Sub17_Sub1_3.method1774(local12);
			Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			Static73.anInt1933 = 0;
			Static86.anInt2112 = local12;
			Static38.anInt1220 = local16;
			Static86.anInt2114 = 2;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			if (Static57.anInt1737 == local16 >> 16) {
				Static86.anInt2114 = 3;
			}
		}
		if (local20 == 43 && Static29.method564(local16, local33, local12)) {
			Static120.aClass2_Sub17_Sub1_3.method1799(43);
			Static120.aClass2_Sub17_Sub1_3.method1785(Static74.anInt1950);
			Static120.aClass2_Sub17_Sub1_3.method1785(local12 + Static57.anInt1736);
			Static120.aClass2_Sub17_Sub1_3.method1774(local33 >> 14 & 0x7FFF);
			Static120.aClass2_Sub17_Sub1_3.method1776(local16 + Static66.anInt1860);
			Static120.aClass2_Sub17_Sub1_3.method1798(Static43.anInt1292);
		}
		if (local20 == 1003) {
			Static29.method564(local16, local33, local12);
			Static120.aClass2_Sub17_Sub1_3.method1799(165);
			Static120.aClass2_Sub17_Sub1_3.method1776(Static57.anInt1736 + local12);
			Static120.aClass2_Sub17_Sub1_3.method1757(local33 >> 14 & 0x7FFF);
			Static120.aClass2_Sub17_Sub1_3.method1785(local16 + Static66.anInt1860);
		}
		if (local20 == 55) {
			if (Static122.aBoolean241) {
				Static93.aClass64_1.method1648(Static16.anInt444, local12 - 4, local16 - 4);
			} else {
				Static93.aClass64_1.method1648(Static16.anInt444, Static13.anInt365 - 4, Static108.anInt2880 - 4);
			}
		}
		if (local20 == 58) {
			local491 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local33];
			if (local491 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local491.anIntArray309[0], local491.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static76.anInt1968 = 2;
				Static3.anInt123 = Static13.anInt365;
				Static65.anInt1848 = 0;
				Static55.anInt1316 = Static108.anInt2880;
				Static120.aClass2_Sub17_Sub1_3.method1799(42);
				Static120.aClass2_Sub17_Sub1_3.method1757(local33);
			}
		}
		if (local20 == 25) {
			local239 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local33];
			if (local239 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local239.anIntArray309[0], local239.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static3.anInt123 = Static13.anInt365;
				Static76.anInt1968 = 2;
				Static65.anInt1848 = 0;
				Static55.anInt1316 = Static108.anInt2880;
				Static120.aClass2_Sub17_Sub1_3.method1799(210);
				Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			}
		}
		if (local20 == 12) {
			local430 = Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 0, 0, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			if (!local430) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			}
			Static76.anInt1968 = 2;
			Static55.anInt1316 = Static108.anInt2880;
			Static65.anInt1848 = 0;
			Static3.anInt123 = Static13.anInt365;
			Static120.aClass2_Sub17_Sub1_3.method1799(241);
			Static120.aClass2_Sub17_Sub1_3.method1776(local12 + Static57.anInt1736);
			Static120.aClass2_Sub17_Sub1_3.method1776(local33);
			Static120.aClass2_Sub17_Sub1_3.method1774(local16 + Static66.anInt1860);
		}
		if (local20 == 27) {
			local239 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local33];
			if (local239 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local239.anIntArray309[0], local239.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static76.anInt1968 = 2;
				Static3.anInt123 = Static13.anInt365;
				Static65.anInt1848 = 0;
				Static55.anInt1316 = Static108.anInt2880;
				Static120.aClass2_Sub17_Sub1_3.method1799(222);
				Static120.aClass2_Sub17_Sub1_3.method1776(local33);
			}
		}
		if (local20 == 37) {
			local491 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local33];
			if (local491 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local491.anIntArray309[0], local491.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static3.anInt123 = Static13.anInt365;
				Static65.anInt1848 = 0;
				Static55.anInt1316 = Static108.anInt2880;
				Static76.anInt1968 = 2;
				Static120.aClass2_Sub17_Sub1_3.method1799(82);
				Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			}
		}
		if (local20 == 7) {
			Static120.aClass2_Sub17_Sub1_3.method1799(130);
			Static120.aClass2_Sub17_Sub1_3.method1793(local16);
			Static120.aClass2_Sub17_Sub1_3.method1774(local12);
			Static120.aClass2_Sub17_Sub1_3.method1757(local33);
			Static86.anInt2114 = 2;
			Static73.anInt1933 = 0;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			if (local16 >> 16 == Static57.anInt1737) {
				Static86.anInt2114 = 3;
			}
			Static86.anInt2112 = local12;
			Static38.anInt1220 = local16;
		}
		if (local20 == 38) {
			local672 = Static61.method1057(local12, local16);
			if (local672 != null) {
				Static17.method322();
				Static50.method882(local12, Static61.method1053(Static102.method1660(local672)), local16);
				Static70.aBoolean131 = true;
				Static107.anInt2862 = 0;
				Static68.aClass80_721 = Static87.method1402(local672);
				if (Static68.aClass80_721 == null) {
					Static68.aClass80_721 = Static90.aClass80_869;
				}
				if (local672.aBoolean232) {
					Static59.aClass80_631 = Static93.method1444(new Class80[] { local672.aClass80_1164, Static3.aClass80_38 });
				} else {
					Static59.aClass80_631 = Static93.method1444(new Class80[] { Static84.aClass80_824, local672.aClass80_1162, Static3.aClass80_38 });
				}
				if (Static50.anInt1524 == 16 && !local672.aBoolean232) {
					Static70.aBoolean131 = true;
					Static23.anInt875 = 3;
					Static57.aBoolean119 = true;
				}
			}
			return;
		}
		if (local20 == 8) {
			local430 = Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 0, 0, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			if (!local430) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			}
			Static65.anInt1848 = 0;
			Static3.anInt123 = Static13.anInt365;
			Static55.anInt1316 = Static108.anInt2880;
			Static76.anInt1968 = 2;
			Static120.aClass2_Sub17_Sub1_3.method1799(146);
			Static120.aClass2_Sub17_Sub1_3.method1774(local16 + Static66.anInt1860);
			Static120.aClass2_Sub17_Sub1_3.method1757(local33);
			Static120.aClass2_Sub17_Sub1_3.method1776(local12 + Static57.anInt1736);
		}
		if (local20 == 41) {
			local430 = Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 0, 0, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			if (!local430) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			}
			Static65.anInt1848 = 0;
			Static3.anInt123 = Static13.anInt365;
			Static76.anInt1968 = 2;
			Static55.anInt1316 = Static108.anInt2880;
			Static120.aClass2_Sub17_Sub1_3.method1799(124);
			Static120.aClass2_Sub17_Sub1_3.method1785(local16 + Static66.anInt1860);
			Static120.aClass2_Sub17_Sub1_3.method1774(Static57.anInt1736 + local12);
			Static120.aClass2_Sub17_Sub1_3.method1785(local33);
		}
		if (local20 == 20) {
			Static120.aClass2_Sub17_Sub1_3.method1799(208);
			Static120.aClass2_Sub17_Sub1_3.method1765(local16);
			local672 = Static123.method1976(local16);
			if (local672.anIntArrayArray30 != null && local672.anIntArrayArray30[0][0] == 5) {
				local690 = local672.anIntArrayArray30[0][1];
				Static15.anIntArray66[local690] = 1 - Static15.anIntArray66[local690];
				Static90.method1345(local690);
				Static70.aBoolean131 = true;
			}
		}
		if (local20 == 21 || local20 == 3 || local20 == 53 || local20 == 32) {
			local799 = Static2.aClass80Array1[arg0];
			local690 = local799.method2025(Static3.aClass80_38);
			if (local690 != -1) {
				local819 = local799.method2021(local690 + 5).method2026().method2023();
				if (local20 == 21) {
					Static48.method874(local819);
				}
				if (local20 == 3) {
					Static1.method4(local819);
				}
				if (local20 == 53) {
					Static65.method1097(local819);
				}
				if (local20 == 32) {
					Static103.method1664(local819);
				}
			}
		}
		if (local20 == 1002) {
			local672 = Static123.method1976(local16);
			if (local672 == null || local672.anIntArray396[local12] < 100000) {
				Static120.aClass2_Sub17_Sub1_3.method1799(152);
				Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			} else {
				Static3.method65(0, Static93.method1444(new Class80[] { Static28.method1422(local672.anIntArray396[local12]), Static104.aClass80_1034, Static4.method95(local33).aClass80_271 }), Static40.aClass80_446);
			}
			Static86.anInt2112 = local12;
			Static73.anInt1933 = 0;
			Static86.anInt2114 = 2;
			Static38.anInt1220 = local16;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			if (Static57.anInt1737 == local16 >> 16) {
				Static86.anInt2114 = 3;
			}
		}
		if (local20 == 34) {
			local491 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local33];
			if (local491 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local491.anIntArray309[0], local491.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static55.anInt1316 = Static108.anInt2880;
				Static3.anInt123 = Static13.anInt365;
				Static76.anInt1968 = 2;
				Static65.anInt1848 = 0;
				Static120.aClass2_Sub17_Sub1_3.method1799(91);
				Static120.aClass2_Sub17_Sub1_3.method1776(local33);
			}
		}
		if (local20 == 18 || local20 == 45) {
			local799 = Static2.aClass80Array1[arg0];
			local690 = local799.method2025(Static3.aClass80_38);
			if (local690 != -1) {
				local799 = local799.method2021(local690 + 5).method2026();
				@Pc(2073) Class80 local2073 = local799.method2004().method2000();
				@Pc(2075) boolean local2075 = false;
				for (local821 = 0; local821 < Static92.anInt2273; local821++) {
					@Pc(2085) Class2_Sub1_Sub1_Sub4_Sub2 local2085 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[Static53.anIntArray208[local821]];
					if (local2085 != null && local2085.aClass80_924 != null && local2085.aClass80_924.method2006(local2073)) {
						Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local2085.anIntArray309[0], local2085.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
						local2075 = true;
						if (local20 == 18) {
							Static120.aClass2_Sub17_Sub1_3.method1799(91);
							Static120.aClass2_Sub17_Sub1_3.method1776(Static53.anIntArray208[local821]);
						}
						if (local20 == 45) {
							Static120.aClass2_Sub17_Sub1_3.method1799(82);
							Static120.aClass2_Sub17_Sub1_3.method1785(Static53.anIntArray208[local821]);
						}
						break;
					}
				}
				if (!local2075) {
					Static3.method65(0, Static93.method1444(new Class80[] { Static95.aClass80_942, local2073 }), Static40.aClass80_446);
				}
			}
		}
		if (local20 == 14) {
			local239 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local33];
			if (local239 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local239.anIntArray309[0], local239.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static76.anInt1968 = 2;
				Static3.anInt123 = Static13.anInt365;
				Static65.anInt1848 = 0;
				Static55.anInt1316 = Static108.anInt2880;
				Static120.aClass2_Sub17_Sub1_3.method1799(132);
				Static120.aClass2_Sub17_Sub1_3.method1776(Static32.anInt1107);
				Static120.aClass2_Sub17_Sub1_3.method1785(local33);
				Static120.aClass2_Sub17_Sub1_3.method1776(Static44.anInt1348);
				Static120.aClass2_Sub17_Sub1_3.method1745(Static39.anInt707);
			}
		}
		if (local20 == 46) {
			local672 = Static123.method1976(local16);
			@Pc(2262) boolean local2262 = true;
			if (local672.anInt3030 > 0) {
				local2262 = Static50.method886(local672);
			}
			if (local2262) {
				Static120.aClass2_Sub17_Sub1_3.method1799(208);
				Static120.aClass2_Sub17_Sub1_3.method1765(local16);
			}
		}
		if (local20 == 52 && Static124.anInt3134 == -1) {
			Static43.method706(local16, local12);
			Static124.anInt3134 = local16;
			Static44.anInt1361 = local12;
		}
		if (local20 == 4) {
			Static59.method1042(Static28.anInt2316);
			Static28.anInt2316 = -1;
			Static37.aBoolean77 = true;
		}
		if (local20 == 56) {
			Static120.aClass2_Sub17_Sub1_3.method1799(139);
			Static120.aClass2_Sub17_Sub1_3.method1765(local16);
			Static120.aClass2_Sub17_Sub1_3.method1776(local33);
			Static120.aClass2_Sub17_Sub1_3.method1757(local12);
			Static38.anInt1220 = local16;
			Static86.anInt2114 = 2;
			if (local16 >> 16 == Static90.anInt2214) {
				Static86.anInt2114 = 1;
			}
			if (local16 >> 16 == Static57.anInt1737) {
				Static86.anInt2114 = 3;
			}
			Static86.anInt2112 = local12;
			Static73.anInt1933 = 0;
		}
		if (local20 == 40) {
			Static29.method564(local16, local33, local12);
			Static120.aClass2_Sub17_Sub1_3.method1799(32);
			Static120.aClass2_Sub17_Sub1_3.method1757(Static57.anInt1736 + local12);
			Static120.aClass2_Sub17_Sub1_3.method1785(local33 >> 14 & 0x7FFF);
			Static120.aClass2_Sub17_Sub1_3.method1776(local16 + Static66.anInt1860);
		}
		if (local20 == 49) {
			local491 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local33];
			if (local491 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local491.anIntArray309[0], local491.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static76.anInt1968 = 2;
				Static65.anInt1848 = 0;
				Static3.anInt123 = Static13.anInt365;
				Static55.anInt1316 = Static108.anInt2880;
				Static120.aClass2_Sub17_Sub1_3.method1799(228);
				Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			}
		}
		if (local20 == 1) {
			local239 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local33];
			if (local239 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local239.anIntArray309[0], local239.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static3.anInt123 = Static13.anInt365;
				Static55.anInt1316 = Static108.anInt2880;
				Static65.anInt1848 = 0;
				Static76.anInt1968 = 2;
				Static120.aClass2_Sub17_Sub1_3.method1799(216);
				Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			}
		}
		if (local20 == 35) {
			local430 = Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 0, 0, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			if (!local430) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			}
			Static65.anInt1848 = 0;
			Static76.anInt1968 = 2;
			Static55.anInt1316 = Static108.anInt2880;
			Static3.anInt123 = Static13.anInt365;
			Static120.aClass2_Sub17_Sub1_3.method1799(28);
			Static120.aClass2_Sub17_Sub1_3.method1785(Static32.anInt1107);
			Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			Static120.aClass2_Sub17_Sub1_3.method1798(Static39.anInt707);
			Static120.aClass2_Sub17_Sub1_3.method1774(local16 + Static66.anInt1860);
			Static120.aClass2_Sub17_Sub1_3.method1785(Static44.anInt1348);
			Static120.aClass2_Sub17_Sub1_3.method1774(Static57.anInt1736 + local12);
		}
		if (local20 == 42) {
			Static61.method1062();
		}
		if (local20 == 15) {
			Static120.aClass2_Sub17_Sub1_3.method1799(181);
			Static120.aClass2_Sub17_Sub1_3.method1774(local12);
			Static120.aClass2_Sub17_Sub1_3.method1774(local33);
			Static120.aClass2_Sub17_Sub1_3.method1765(local16);
			Static73.anInt1933 = 0;
			Static86.anInt2114 = 2;
			Static86.anInt2112 = local12;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			if (Static57.anInt1737 == local16 >> 16) {
				Static86.anInt2114 = 3;
			}
			Static38.anInt1220 = local16;
		}
		if (local20 == 29) {
			Static120.aClass2_Sub17_Sub1_3.method1799(126);
			Static120.aClass2_Sub17_Sub1_3.method1774(local33);
			Static120.aClass2_Sub17_Sub1_3.method1798(local16);
			Static120.aClass2_Sub17_Sub1_3.method1785(local12);
			Static38.anInt1220 = local16;
			Static86.anInt2112 = local12;
			Static73.anInt1933 = 0;
			Static86.anInt2114 = 2;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			if (local16 >> 16 == Static57.anInt1737) {
				Static86.anInt2114 = 3;
			}
		}
		if (local20 == 24) {
			Static29.method564(local16, local33, local12);
			Static120.aClass2_Sub17_Sub1_3.method1799(92);
			Static120.aClass2_Sub17_Sub1_3.method1774(local33 >> 14 & 0x7FFF);
			Static120.aClass2_Sub17_Sub1_3.method1774(Static57.anInt1736 + local12);
			Static120.aClass2_Sub17_Sub1_3.method1785(local16 + Static66.anInt1860);
		}
		if (local20 == 1001) {
			Static76.anInt1968 = 2;
			Static3.anInt123 = Static13.anInt365;
			Static55.anInt1316 = Static108.anInt2880;
			Static65.anInt1848 = 0;
			local239 = Static35.aClass2_Sub1_Sub1_Sub4_Sub1Array1[local33];
			if (local239 != null) {
				@Pc(2761) Class2_Sub1_Sub13 local2761 = local239.aClass2_Sub1_Sub13_1;
				if (local2761.anIntArray331 != null) {
					local2761 = local2761.method1582();
				}
				if (local2761 != null) {
					Static120.aClass2_Sub17_Sub1_3.method1799(167);
					Static120.aClass2_Sub17_Sub1_3.method1776(local2761.anInt2570);
				}
			}
		}
		if (local20 == 22) {
			Static120.aClass2_Sub17_Sub1_3.method1799(56);
			Static120.aClass2_Sub17_Sub1_3.method1774(Static74.anInt1950);
			Static120.aClass2_Sub17_Sub1_3.method1745(Static43.anInt1292);
			Static120.aClass2_Sub17_Sub1_3.method1765(local16);
			Static120.aClass2_Sub17_Sub1_3.method1785(local12);
			Static120.aClass2_Sub17_Sub1_3.method1774(local33);
			Static38.anInt1220 = local16;
			Static73.anInt1933 = 0;
			Static86.anInt2112 = local12;
			Static86.anInt2114 = 2;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			if (local16 >> 16 == Static57.anInt1737) {
				Static86.anInt2114 = 3;
			}
		}
		if (local20 == 23) {
			local799 = Static2.aClass80Array1[arg0];
			local690 = local799.method2025(Static3.aClass80_38);
			if (local690 != -1) {
				if (Static90.anInt2214 == -1) {
					Static61.method1062();
					if (Static111.anInt2998 != -1) {
						Static40.aClass80_456 = local799.method2021(local690 + 5).method2026();
						Static110.anInt2906 = Static90.anInt2214 = Static111.anInt2998;
						Static18.aBoolean49 = false;
					}
				} else {
					Static3.method65(0, Static124.aClass80_1198, Static40.aClass80_446);
					if (Static96.aClass80_963 != null) {
						Static3.method65(0, Static96.aClass80_963, Static40.aClass80_446);
					}
				}
			}
		}
		if (local20 == 13) {
			local430 = Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 0, 0, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			if (!local430) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local16, local12, false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
			}
			Static65.anInt1848 = 0;
			Static76.anInt1968 = 2;
			Static55.anInt1316 = Static108.anInt2880;
			Static3.anInt123 = Static13.anInt365;
			Static120.aClass2_Sub17_Sub1_3.method1799(26);
			Static120.aClass2_Sub17_Sub1_3.method1757(local16 + Static66.anInt1860);
			Static120.aClass2_Sub17_Sub1_3.method1774(local12 + Static57.anInt1736);
			Static120.aClass2_Sub17_Sub1_3.method1798(Static43.anInt1292);
			Static120.aClass2_Sub17_Sub1_3.method1776(local33);
			Static120.aClass2_Sub17_Sub1_3.method1776(Static74.anInt1950);
		}
		if (local20 == 11) {
			Static29.method564(local16, local33, local12);
			Static120.aClass2_Sub17_Sub1_3.method1799(66);
			Static120.aClass2_Sub17_Sub1_3.method1757(Static66.anInt1860 + local16);
			Static120.aClass2_Sub17_Sub1_3.method1776(Static57.anInt1736 + local12);
			Static120.aClass2_Sub17_Sub1_3.method1776(local33 >> 14 & 0x7FFF);
		}
		if (local20 == 51) {
			Static120.aClass2_Sub17_Sub1_3.method1799(195);
			Static120.aClass2_Sub17_Sub1_3.method1757(local12);
			Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			Static120.aClass2_Sub17_Sub1_3.method1798(local16);
			Static86.anInt2114 = 2;
			Static73.anInt1933 = 0;
			Static86.anInt2112 = local12;
			Static38.anInt1220 = local16;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			if (Static57.anInt1737 == local16 >> 16) {
				Static86.anInt2114 = 3;
			}
		}
		if (local20 == 1006) {
			Static76.anInt1968 = 2;
			Static3.anInt123 = Static13.anInt365;
			Static55.anInt1316 = Static108.anInt2880;
			Static65.anInt1848 = 0;
			Static120.aClass2_Sub17_Sub1_3.method1799(152);
			Static120.aClass2_Sub17_Sub1_3.method1785(local33);
		}
		if (local20 == 1004) {
			Static76.anInt1968 = 2;
			Static55.anInt1316 = Static108.anInt2880;
			Static3.anInt123 = Static13.anInt365;
			Static65.anInt1848 = 0;
			Static120.aClass2_Sub17_Sub1_3.method1799(246);
			Static120.aClass2_Sub17_Sub1_3.method1785(local33 >> 14 & 0x7FFF);
		}
		if (local20 == 57) {
			Static120.aClass2_Sub17_Sub1_3.method1799(128);
			Static120.aClass2_Sub17_Sub1_3.method1774(Static32.anInt1107);
			Static120.aClass2_Sub17_Sub1_3.method1774(local12);
			Static120.aClass2_Sub17_Sub1_3.method1785(local33);
			Static120.aClass2_Sub17_Sub1_3.method1745(Static39.anInt707);
			Static120.aClass2_Sub17_Sub1_3.method1798(local16);
			Static120.aClass2_Sub17_Sub1_3.method1757(Static44.anInt1348);
			Static86.anInt2114 = 2;
			Static38.anInt1220 = local16;
			Static86.anInt2112 = local12;
			if (Static90.anInt2214 == local16 >> 16) {
				Static86.anInt2114 = 1;
			}
			Static73.anInt1933 = 0;
			if (Static57.anInt1737 == local16 >> 16) {
				Static86.anInt2114 = 3;
			}
		}
		if (local20 == 26) {
			local491 = Static114.aClass2_Sub1_Sub1_Sub4_Sub2Array1[local33];
			if (local491 != null) {
				Static16.method258(Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray309[0], 0, 2, 0, 0, 1, 1, local491.anIntArray309[0], local491.anIntArray312[0], false, Static42.aClass2_Sub1_Sub1_Sub4_Sub2_1.anIntArray312[0]);
				Static65.anInt1848 = 0;
				Static55.anInt1316 = Static108.anInt2880;
				Static76.anInt1968 = 2;
				Static3.anInt123 = Static13.anInt365;
				Static120.aClass2_Sub17_Sub1_3.method1799(103);
				Static120.aClass2_Sub17_Sub1_3.method1785(Static74.anInt1950);
				Static120.aClass2_Sub17_Sub1_3.method1774(local33);
				Static120.aClass2_Sub17_Sub1_3.method1765(Static43.anInt1292);
			}
		}
		if (Static107.anInt2862 != 0) {
			Static107.anInt2862 = 0;
			Static70.aBoolean131 = true;
		}
		if (Static76.aBoolean141) {
			Static17.method322();
			Static70.aBoolean131 = true;
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public static void method173() {
		Static100.aClass22_18.method1068();
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "(BI)V")
	public static void method174(@OriginalArg(1) int arg0) {
		for (@Pc(15) Class2_Sub11 local15 = (Class2_Sub11) Static2.aClass41_1.method1061(); local15 != null; local15 = (Class2_Sub11) Static2.aClass41_1.method1058()) {
			if ((long) arg0 == (local15.aLong91 >> 48 & 0xFFFFL)) {
				local15.method1961();
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I[Lclient!n;[II[II)V")
	public static void method177(@OriginalArg(0) int arg0, @OriginalArg(1) Class51[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg3 <= arg0) {
			return;
		}
		@Pc(20) int local20 = arg0 - 1;
		@Pc(24) int local24 = arg3 + 1;
		@Pc(30) int local30 = (arg3 + arg0) / 2;
		@Pc(34) Class51 local34 = arg1[local30];
		arg1[local30] = arg1[arg0];
		arg1[arg0] = local34;
		while (local20 < local24) {
			@Pc(48) boolean local48 = true;
			@Pc(51) int local51;
			@Pc(65) int local65;
			@Pc(68) int local68;
			do {
				local24--;
				for (local51 = 0; local51 < 4; local51++) {
					if (arg2[local51] == 2) {
						local65 = arg1[local24].anInt1970;
						local68 = local34.anInt1970;
					} else if (arg2[local51] == 1) {
						local65 = arg1[local24].anInt1967;
						local68 = local34.anInt1967;
						if (local68 == -1 && arg4[local51] == 1) {
							local68 = 2001;
						}
						if (local65 == -1 && arg4[local51] == 1) {
							local65 = 2001;
						}
					} else if (arg2[local51] == 3) {
						local68 = local34.aBoolean140 ? 1 : 0;
						local65 = arg1[local24].aBoolean140 ? 1 : 0;
					} else {
						local65 = arg1[local24].anInt1965;
						local68 = local34.anInt1965;
					}
					if (local68 != local65) {
						if ((arg4[local51] != 1 || local65 <= local68) && (arg4[local51] != 0 || local68 <= local65)) {
							local48 = false;
						}
						break;
					}
					if (local51 == 3) {
						local48 = false;
					}
				}
			} while (local48);
			local48 = true;
			do {
				local20++;
				for (local51 = 0; local51 < 4; local51++) {
					if (arg2[local51] == 2) {
						local68 = local34.anInt1970;
						local65 = arg1[local20].anInt1970;
					} else if (arg2[local51] == 1) {
						local65 = arg1[local20].anInt1967;
						local68 = local34.anInt1967;
						if (local65 == -1 && arg4[local51] == 1) {
							local65 = 2001;
						}
						if (local68 == -1 && arg4[local51] == 1) {
							local68 = 2001;
						}
					} else if (arg2[local51] == 3) {
						local68 = local34.aBoolean140 ? 1 : 0;
						local65 = arg1[local20].aBoolean140 ? 1 : 0;
					} else {
						local68 = local34.anInt1965;
						local65 = arg1[local20].anInt1965;
					}
					if (local65 != local68) {
						if ((arg4[local51] != 1 || local68 <= local65) && (arg4[local51] != 0 || local65 <= local68)) {
							local48 = false;
						}
						break;
					}
					if (local51 == 3) {
						local48 = false;
					}
				}
			} while (local48);
			if (local24 > local20) {
				@Pc(326) Class51 local326 = arg1[local20];
				arg1[local20] = arg1[local24];
				arg1[local24] = local326;
			}
		}
		method177(arg0, arg1, arg2, local24, arg4);
		method177(local24 + 1, arg1, arg2, arg3, arg4);
	}
}
