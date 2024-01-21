import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!h", name = "u", descriptor = "Lclient!kh;")
	public static Class52_Sub1 aClass52_Sub1_10;

	@OriginalMember(owner = "client!h", name = "q", descriptor = "Ljava/util/Random;")
	public static final Random aRandom1 = new Random();

	@OriginalMember(owner = "client!h", name = "r", descriptor = "Lclient!b;")
	public static Class6 aClass6_40 = null;

	@OriginalMember(owner = "client!h", name = "v", descriptor = "I")
	public static int anInt1428 = 10;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!ih;I)V")
	public static void method1037(@OriginalArg(1) Class3_Sub4_Sub1 arg0) {
		while (true) {
			@Pc(14) Class3_Sub25 local14 = (Class3_Sub25) Static17.aClass10_13.method267();
			if (local14 == null) {
				return;
			}
			@Pc(19) boolean local19 = false;
			for (@Pc(21) int local21 = 0; local21 < local14.anInt3926; local21++) {
				if (local14.aClass29Array2[local21] != null) {
					if (local14.aClass29Array2[local21].anInt973 == 2) {
						local14.anIntArray334[local21] = -5;
					}
					if (local14.aClass29Array2[local21].anInt973 == 0) {
						local19 = true;
					}
				}
				if (local14.aClass29Array1[local21] != null) {
					if (local14.aClass29Array1[local21].anInt973 == 2) {
						local14.anIntArray334[local21] = -6;
					}
					if (local14.aClass29Array1[local21].anInt973 == 0) {
						local19 = true;
					}
				}
			}
			if (local19) {
				return;
			}
			arg0.method1298(30);
			arg0.method1239(0);
			@Pc(103) int local103 = arg0.anInt1758;
			arg0.method1285(local14.anInt3932);
			for (@Pc(110) int local110 = 0; local110 < local14.anInt3926; local110++) {
				if (local14.anIntArray334[local110] == 0) {
					try {
						@Pc(134) int local134 = local14.anIntArray332[local110];
						@Pc(151) Field local151;
						@Pc(154) int local154;
						if (local134 == 0) {
							local151 = (Field) local14.aClass29Array2[local110].anObject2;
							local154 = local151.getInt(null);
							arg0.method1239(0);
							arg0.method1285(local154);
						} else if (local134 == 1) {
							local151 = (Field) local14.aClass29Array2[local110].anObject2;
							local151.setInt(null, local14.anIntArray333[local110]);
							arg0.method1239(0);
						} else if (local134 == 2) {
							local151 = (Field) local14.aClass29Array2[local110].anObject2;
							local154 = local151.getModifiers();
							arg0.method1239(0);
							arg0.method1285(local154);
						}
						@Pc(220) Method local220;
						if (local134 == 3) {
							@Pc(238) byte[][] local238 = local14.aByteArrayArrayArray16[local110];
							local220 = (Method) local14.aClass29Array1[local110].anObject2;
							@Pc(249) Object[] local249 = new Object[local238.length];
							for (@Pc(251) int local251 = 0; local251 < local238.length; local251++) {
								@Pc(263) ObjectInputStream local263 = new ObjectInputStream(new ByteArrayInputStream(local238[local251]));
								local249[local251] = local263.readObject();
							}
							@Pc(282) Object local282 = local220.invoke(null, local249);
							if (local282 == null) {
								arg0.method1239(0);
							} else if (local282 instanceof Number) {
								arg0.method1239(1);
								arg0.method1250(((Number) local282).longValue());
							} else if (local282 instanceof Class70) {
								arg0.method1239(2);
								arg0.method1274((Class70) local282);
							} else {
								arg0.method1239(4);
							}
						} else if (local134 == 4) {
							local220 = (Method) local14.aClass29Array1[local110].anObject2;
							local154 = local220.getModifiers();
							arg0.method1239(0);
							arg0.method1285(local154);
						}
					} catch (@Pc(327) ClassNotFoundException local327) {
						arg0.method1239(-10);
					} catch (@Pc(333) InvalidClassException local333) {
						arg0.method1239(-11);
					} catch (@Pc(339) StreamCorruptedException local339) {
						arg0.method1239(-12);
					} catch (@Pc(345) OptionalDataException local345) {
						arg0.method1239(-13);
					} catch (@Pc(351) IllegalAccessException local351) {
						arg0.method1239(-14);
					} catch (@Pc(357) IllegalArgumentException local357) {
						arg0.method1239(-15);
					} catch (@Pc(363) InvocationTargetException local363) {
						arg0.method1239(-16);
					} catch (@Pc(369) SecurityException local369) {
						arg0.method1239(-17);
					} catch (@Pc(375) IOException local375) {
						arg0.method1239(-18);
					} catch (@Pc(381) NullPointerException local381) {
						arg0.method1239(-19);
					} catch (@Pc(387) Exception local387) {
						arg0.method1239(-20);
					} catch (@Pc(393) Throwable local393) {
						arg0.method1239(-21);
					}
				} else {
					arg0.method1239(local14.anIntArray334[local110]);
				}
			}
			arg0.method1259(local103);
			arg0.method1265(arg0.anInt1758 - local103);
			local14.method3320();
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
	public static void method1039() {
		Static212.aClass70_2125 = Static185.aClass70_1811;
		Static186.aClass70_1845 = Static61.aClass70_594;
		Static130.aClass70_1221 = Static180.aClass70_1751;
		Static84.aClass70_856 = Static126.aClass70_1190;
		Static96.aClass70_992 = Static167.aClass70_1626;
		Static147.aClass70_1424 = Static66.aClass70_652;
		Static187.aClass70_1846 = Static121.aClass70_1178;
		Static150.aClass70_1453 = Static211.aClass70_2100;
		Static150.aClass70_1446 = Static67.aClass70_1535;
		Static209.aClass70_2086 = Static169.aClass70_1636;
		Static84.aClass70_834 = Static135.aClass70_1285;
		Static84.aClass70_827 = Static175.aClass70_1706;
		Static84.aClass70_857 = Static126.aClass70_1190;
		Static150.aClass70_1456 = Static211.aClass70_2100;
		Static27.aClass70_275 = Static36.aClass70_397;
		Static84.aClass70_835 = Static126.aClass70_1190;
		Static84.aClass70_854 = Static9.aClass70_119;
		Static84.aClass70_855 = Static126.aClass70_1190;
		Static106.aClass70_1071 = Static25.aClass70_252;
		Static92.aClass70_958 = Static124.aClass70_1891;
		Static204.aClass70_2072 = Static121.aClass70_1180;
		Static84.aClass70_830 = Static126.aClass70_1190;
		Static47.aClass70_474 = Static109.aClass70_1084;
		Static12.aClass70_132 = Static102.aClass70_1029;
		Static133.aClass70_1245 = Static120.aClass70_1150;
		Static70.aClass70_668 = Static108.aClass70_1091;
		Static212.aClass70_2124 = Static199.aClass70_2000;
		Static208.aClass70_1243 = Static209.aClass70_2088;
		Static75.aClass70_709 = Static34.aClass70_347;
		Static132.aClass70_1231 = Static62.aClass70_600;
		Static84.aClass70_867 = Static126.aClass70_1190;
		Static115.aClass70_1126 = Static127.aClass70_1191;
		Static76.aClass70_734 = Static126.aClass70_1190;
		Static211.aClass70_2099 = Static114.aClass70_1119;
		Static84.aClass70_853 = Static126.aClass70_1190;
		Static163.aClass70_1590 = Static62.aClass70_598;
		Static33.aClass70_318 = Static38.aClass70_409;
		Static84.aClass70_846 = Static42.aClass70_432;
		Static139.aClass70_2052 = Static190.aClass70_1885;
		Static204.aClass70_2071 = Static136.aClass70_1288;
		Static152.aClass70_1488 = Static186.aClass70_1842;
		Static157.aClass70_1575 = Static14.aClass70_137;
		Static109.aClass70_1085 = Static19.aClass70_171;
		Static84.aClass70_828 = Static175.aClass70_1706;
		Static14.aClass70_142 = Static205.aClass70_2078;
		Static47.aClass70_476 = Static123.aClass70_1188;
		Static21.aClass70_197 = Static19.aClass70_174;
		Static183.aClass70_1371 = Static82.aClass70_800;
		Static55.aClass70_565 = Static92.aClass70_959;
		Static84.aClass70_868 = Static43.aClass70_457;
		Static84.aClass70_843 = Static126.aClass70_1190;
		Static6.aClass70_87 = Static132.aClass70_1227;
		Static150.aClass70_1448 = Static85.aClass70_890;
		Static99.aClass70_1000 = Static196.aClass70_1932;
		Static133.aClass70_1248 = Static188.aClass70_1849;
		Static70.aClass70_662 = Static51.aClass70_502;
		Static110.aClass70_1095 = Static82.aClass70_802;
		Static82.aClass70_808 = Static167.aClass70_1624;
		Static176.aClass70_1728 = Static76.aClass70_736;
		Static208.aClass70_1240 = Static32.aClass70_314;
		Static15.aClass70_156 = Static99.aClass70_998;
		Static84.aClass70_864 = Static208.aClass70_1236;
		Static14.aClass70_141 = Static139.aClass70_2051;
		Static71.aClass70_672 = Static108.aClass70_1089;
		Static106.aClass70_1069 = Static10.aClass70_129;
		Static85.aClass70_896 = Static182.aClass70_1786;
		Static92.aClass70_953 = Static129.aClass70_1217;
		Static123.aClass70_1184 = Static112.aClass70_1105;
		Static193.aClass70_1913 = Static88.aClass70_902;
		Static127.aClass70_1192 = Static200.aClass70_2022;
		Static84.aClass70_839 = Static126.aClass70_1190;
		Static147.aClass70_1426 = Static12.aClass70_133;
		Static79.aClass70_789 = Static22.aClass70_224;
		Static39.aClass70_421 = Static176.aClass70_1733;
		Static84.aClass70_838 = Static33.aClass70_316;
		Static84.aClass70_844 = Static163.aClass70_1594;
		Static76.aClass70_732 = Static16.aClass70_164;
		Static86.aClass70_900 = Static98.aClass70_995;
		Static178.aClass70_1749 = Static54.aClass70_557;
		Static155.aClass70_1527 = Static33.aClass70_316;
		Static84.aClass70_859 = Static126.aClass70_1190;
		Static155.aClass70_1525 = Static33.aClass70_316;
		Static88.aClass70_906 = Static79.aClass70_792;
		Static196.aClass70_1931 = Static205.aClass70_2077;
		Static84.aClass70_833 = Static126.aClass70_1190;
		Static43.aClass70_455 = Static58.aClass70_582;
		Static21.aClass70_199 = Static81.aClass70_799;
		Static203.aClass70_2062 = Static179.aClass70_610;
		Static163.aClass70_1593 = Static45.aClass70_471;
		Static209.aClass70_2091 = Static169.aClass70_1636;
		Static48.aClass70_2112 = Static40.aClass70_423;
		Static143.aClass70_1354 = Static55.aClass70_564;
		Static4.aClass70_60 = Static207.aClass70_2083;
		Static31.aClass70_311 = Static148.aClass70_1430;
		Static185.aClass70_1808 = Static107.aClass70_1578;
		Static77.aClass70_747 = Static29.aClass70_304;
		Static33.aClass70_322 = Static75.aClass70_710;
		Static91.aClass70_924 = Static32.aClass70_315;
		Static205.aClass70_2075 = Static106.aClass70_1070;
		Static83.aClass70_819 = Static130.aClass70_1224;
		Static84.aClass70_840 = Static126.aClass70_1190;
		Static142.aClass70_1329 = Static129.aClass70_1218;
		Static84.aClass70_858 = Static114.aClass70_1118;
		Static154.aClass70_1522 = Static86.aClass70_897;
		Static66.aClass70_649 = Static93.aClass70_962;
		Static147.aClass70_1425 = Static161.aClass70_1586;
		Static155.aClass70_1528 = Static33.aClass70_316;
		Static108.aClass70_1092 = Static195.aClass70_1916;
		Static88.aClass70_907 = Class80.aClass70_1580;
		Static13.aClass70_135 = Static141.aClass70_1328;
		Static84.aClass70_863 = Static126.aClass70_1190;
		Static3.aClass70_18 = Static36.aClass70_395;
		Static16.aClass70_166 = Static199.aClass70_1999;
		Static19.aClass70_170 = Static91.aClass70_923;
		Static207.aClass70_2084 = Static35.aClass70_361;
		Static84.aClass70_832 = Static126.aClass70_1190;
		Static121.aClass70_1176 = Static80.aClass70_793;
		Static84.aClass70_852 = Static85.aClass70_889;
		Static121.aClass70_1175 = Static80.aClass70_793;
		Static192.aClass70_1907 = Static36.aClass70_398;
		Static33.aClass70_323 = Static14.aClass70_143;
		Static84.aClass70_842 = Static126.aClass70_1190;
		Static38.aClass70_408 = Static6.aClass70_86;
		Static84.aClass70_866 = Static126.aClass70_1190;
		Static150.aClass70_1455 = Static48.aClass70_2121;
		Static108.aClass70_1093 = Static88.aClass70_909;
		Static84.aClass70_848 = Static126.aClass70_1190;
		Static134.aClass70_1271 = Static191.aClass70_1893;
		Static84.aClass70_841 = Static82.aClass70_805;
		Static10.aClass70_126 = Static120.aClass70_1151;
		Static183.aClass70_1369 = Static2.aClass70_6;
		Static69.aClass70_656 = Static63.aClass70_612;
		Static199.aClass70_1996 = Static136.aClass70_1290;
		Static121.aClass70_1174 = Static197.aClass70_1966;
		Static19.aClass70_176 = Static48.aClass70_2120;
		Static41.aClass70_428 = Static42.aClass70_430;
		Static92.aClass70_956 = Static209.aClass70_2089;
		Static115.aClass70_1122 = Static106.aClass70_1072;
		Static123.aClass70_1187 = Static112.aClass70_1105;
		Static103.aClass70_1036 = Static139.aClass70_2050;
		Static14.aClass70_138 = Static139.aClass70_2051;
		Static84.aClass70_837 = Static126.aClass70_1190;
		Static188.aClass70_1851 = Static27.aClass70_266;
		Static57.aClass70_577 = Static17.aClass70_169;
		Static62.aClass70_597 = Static139.aClass70_2049;
		Static42.aClass70_431 = Static33.aClass70_321;
		Static157.aClass70_1573 = Static195.aClass70_1915;
		Static155.aClass70_1529 = Static57.aClass70_580;
		Static54.aClass70_559 = Static33.aClass70_317;
		Static183.aClass70_1370 = Static82.aClass70_807;
		Static167.aClass70_1625 = Static85.aClass70_892;
		Static27.aClass70_264 = Static70.aClass70_665;
		Static115.aClass70_1125 = Static84.aClass70_826;
		Static83.aClass70_818 = Static176.aClass70_1727;
		Static176.aClass70_1731 = Static152.aClass70_1487;
		Static199.aClass70_2001 = Static151.aClass70_1466;
		Static198.aClass70_1988 = Static205.aClass70_2074;
		Static148.aClass70_1429 = Static90.aClass70_917;
		Static210.aClass70_2094 = Static66.aClass70_648;
		Static84.aClass70_851 = Static16.aClass70_157;
		Static155.aClass70_1534 = Static14.aClass70_144;
		Static120.aClass70_1147 = Static16.aClass70_158;
		Static84.aClass70_860 = Static85.aClass70_889;
		Static65.aClass70_634 = Static145.aClass70_1395;
		Static189.aClass70_1874 = Static170.aClass70_548;
		Static37.aClass70_1549 = Static38.aClass70_410;
		Static132.aClass70_1228 = Static192.aClass70_1906;
		Static204.aClass70_2069 = Static134.aClass70_1272;
		Static65.aClass70_638 = Static141.aClass70_1325;
		Static85.aClass70_894 = Static208.aClass70_1237;
		Static118.aClass70_1142 = Static16.aClass70_159;
		Static176.aClass70_1732 = Static50.aClass70_498;
		Static84.aClass70_845 = Static126.aClass70_1190;
		Static143.aClass70_1355 = Static163.aClass70_1592;
		Static134.aClass70_1273 = Static195.aClass70_1917;
		Static7.aClass70_88 = Static208.aClass70_1234;
		Static51.aClass70_501 = Static147.aClass70_1423;
		Static105.aClass70_1042 = Static103.aClass70_1037;
		Static90.aClass70_918 = Static2.aClass70_5;
		Static107.aClass70_1579 = Static154.aClass70_1523;
		Static163.aClass70_1596 = Static145.aClass70_1394;
		Static40.aClass70_425 = Static208.aClass70_1241;
		Static66.aClass70_650 = Static92.aClass70_960;
		Static191.aClass70_1895 = Static51.aClass70_500;
		Static84.aClass70_831 = Static87.aClass70_2103;
		Static84.aClass70_861 = Static126.aClass70_1190;
		Static114.aClass70_1116 = Static24.aClass70_916;
		Static155.aClass70_1533 = Static130.aClass70_1222;
		Static70.aClass70_663 = Static121.aClass70_1177;
		Static67.aClass70_1538 = Static138.aClass70_1304;
		Static155.aClass70_1526 = Static14.aClass70_144;
		Static27.aClass70_270 = Static191.aClass70_1896;
		Static16.aClass70_162 = Static181.aClass70_1772;
		Static84.aClass70_836 = Static126.aClass70_1190;
		Static106.aClass70_1073 = Static10.aClass70_129;
		Static86.aClass70_901 = Static24.aClass70_914;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ILclient!ke;)V")
	public static void method1040(@OriginalArg(1) Class52 arg0) {
		Static86.aClass52_19 = arg0;
	}
}
