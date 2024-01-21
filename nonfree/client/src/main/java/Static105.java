import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "[I")
	public static int[] anIntArray324;

	@OriginalMember(owner = "client!rf", name = "u", descriptor = "[I")
	public static int[] anIntArray325;

	@OriginalMember(owner = "client!rf", name = "D", descriptor = "Lclient!e;")
	public static Class1_Sub1_Sub2_Sub2 aClass1_Sub1_Sub2_Sub2_13;

	@OriginalMember(owner = "client!rf", name = "l", descriptor = "Lclient!id;")
	private static Class34 aClass34_1296 = Static9.method266("Drop");

	@OriginalMember(owner = "client!rf", name = "c", descriptor = "Lclient!id;")
	public static Class34 aClass34_1295 = aClass34_1296;

	@OriginalMember(owner = "client!rf", name = "j", descriptor = "Ljava/util/zip/CRC32;")
	public static CRC32 aCRC32_4 = new CRC32();

	@OriginalMember(owner = "client!rf", name = "s", descriptor = "Lclient!id;")
	private static Class34 aClass34_1298 = Static9.method266("Login limit exceeded)3");

	@OriginalMember(owner = "client!rf", name = "p", descriptor = "Lclient!id;")
	public static Class34 aClass34_1297 = aClass34_1298;

	@OriginalMember(owner = "client!rf", name = "y", descriptor = "Lclient!id;")
	private static Class34 aClass34_1300 = Static9.method266("Please enter your password)3");

	@OriginalMember(owner = "client!rf", name = "w", descriptor = "Lclient!id;")
	public static Class34 aClass34_1299 = aClass34_1300;

	@OriginalMember(owner = "client!rf", name = "x", descriptor = "I")
	public static int anInt2601 = 0;

	@OriginalMember(owner = "client!rf", name = "z", descriptor = "Lclient!fd;")
	public static Class1_Sub9 aClass1_Sub9_13 = null;

	@OriginalMember(owner = "client!rf", name = "A", descriptor = "Lclient!id;")
	public static Class34 aClass34_1301 = Static9.method266(")4slr)3ws?order=LPWM");

	@OriginalMember(owner = "client!rf", name = "B", descriptor = "Lclient!qd;")
	public static Class63 aClass63_20 = new Class63(64);

	@OriginalMember(owner = "client!rf", name = "C", descriptor = "Z")
	public static boolean aBoolean140 = false;

	@OriginalMember(owner = "client!rf", name = "E", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray9 = new byte[4][104][104];

	@OriginalMember(owner = "client!rf", name = "G", descriptor = "Lclient!id;")
	private static Class34 aClass34_1303 = Static9.method266("Members only world");

	@OriginalMember(owner = "client!rf", name = "F", descriptor = "Lclient!id;")
	public static Class34 aClass34_1302 = aClass34_1303;

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIII)V")
	public static void method1719(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static111.method1753(arg3, arg0, arg3 + arg1, arg2 + arg0);
		Static108.method1775();
		Static22.anInt778++;
		Static50.method914(true);
		Static116.method1863(true);
		Static50.method914(false);
		Static116.method1863(false);
		Static86.method1462();
		Static62.method1063();
		@Pc(39) int local39;
		@Pc(59) int local59;
		if (!Static95.aBoolean129) {
			local39 = Static43.anInt1241;
			if (Static30.anInt913 / 256 > local39) {
				local39 = Static30.anInt913 / 256;
			}
			local59 = Static132.anInt3154 + Static26.anInt848 & 0x7FF;
			if (Static102.aBooleanArray17[4] && Static116.anIntArray350[4] + 128 > local39) {
				local39 = Static116.anIntArray350[4] + 128;
			}
			Static47.method875(local59, local39 * 3 + 600, local39, Static8.anInt444, Static45.method1845(Static42.anInt1208, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1405, Static94.aClass1_Sub1_Sub1_Sub1_Sub1_1.anInt1428) - 50, Static41.anInt1170);
		}
		if (Static95.aBoolean129) {
			local39 = Static30.method561();
		} else {
			local39 = Static126.method1982();
		}
		local59 = Static119.anInt2839;
		@Pc(114) int local114 = Static88.anInt2285;
		@Pc(116) int local116 = Static109.anInt3091;
		@Pc(118) int local118 = Static58.anInt1617;
		@Pc(120) int local120 = Static66.anInt1754;
		@Pc(163) int local163;
		for (@Pc(122) int local122 = 0; local122 < 5; local122++) {
			if (Static102.aBooleanArray17[local122]) {
				local163 = (int) ((double) (Static3.anIntArray21[local122] * 2 + 1) * Math.random() - (double) Static3.anIntArray21[local122] + Math.sin((double) Static110.anIntArray318[local122] * ((double) Static128.anIntArray370[local122] / 100.0D)) * (double) Static116.anIntArray350[local122]);
				if (local122 == 4) {
					Static58.anInt1617 += local163;
					if (Static58.anInt1617 < 128) {
						Static58.anInt1617 = 128;
					}
					if (Static58.anInt1617 > 383) {
						Static58.anInt1617 = 383;
					}
				}
				if (local122 == 3) {
					Static66.anInt1754 = local163 + Static66.anInt1754 & 0x7FF;
				}
				if (local122 == 1) {
					Static88.anInt2285 += local163;
				}
				if (local122 == 2) {
					Static109.anInt3091 += local163;
				}
				if (local122 == 0) {
					Static119.anInt2839 += local163;
				}
			}
		}
		local163 = Static39.anInt1143;
		@Pc(227) int local227 = Static19.anInt658;
		if (arg3 <= local163 && local163 < arg3 + arg1 && local227 >= arg0 && local227 < arg2 + arg0) {
			Static63.anInt1717 = 0;
			Static63.anInt1713 = Static39.anInt1143 - arg3;
			Static63.aBoolean93 = true;
			Static63.anInt1715 = Static19.anInt658 - arg0;
		} else {
			Static63.anInt1717 = 0;
			Static63.aBoolean93 = false;
		}
		Static118.method1873();
		Static111.method1747(arg3, arg0, arg1, arg2, 0);
		Static118.method1873();
		Static39.aClass44_1.method1160(Static119.anInt2839, Static88.anInt2285, Static109.anInt3091, Static58.anInt1617, Static66.anInt1754, local39);
		Static118.method1873();
		Static39.aClass44_1.method1175();
		Static5.method211(arg3, arg1, arg0, arg2);
		Static17.method386(arg0, arg3);
		((Class74) Static108.anInterface2_1).method1877(Static67.anInt1767);
		Static117.method432(arg3, arg1, arg0, arg2);
		Static88.anInt2285 = local114;
		Static119.anInt2839 = local59;
		Static66.anInt1754 = local120;
		Static58.anInt1617 = local118;
		Static109.anInt3091 = local116;
		if (Static81.aBoolean114 && Static16.method378() == 0) {
			Static81.aBoolean114 = false;
		}
		if (Static81.aBoolean114) {
			Static111.method1747(arg3, arg0, arg1, arg2, 0);
			Static72.method1267(false, Static17.aClass34_347);
		}
		if (!Static81.aBoolean114 && !Static115.aBoolean158 && arg3 <= local163 && local163 < arg3 + arg1 && arg0 <= local227 && local227 < arg2 + arg0) {
			Static44.method746(local163, arg3, arg0, local227);
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
	public static void method1720() {
		Static21.aClass1_Sub19_Sub1_1.anInt3111 = 0;
		Static2.anInt273 = -1;
		Static115.aBoolean158 = false;
		Static71.anInt1879 = -1;
		Static38.anInt1129 = 0;
		Static42.anInt1195 = 0;
		Static44.anInt1248 = 0;
		Static87.anInt2260 = -1;
		Static40.anInt1147 = 0;
		Static71.anInt1876 = 0;
		Static51.aClass1_Sub19_Sub1_4.anInt3111 = 0;
		Static81.anInt2134 = 0;
		Static32.anInt1445 = -1;
		for (@Pc(39) int local39 = 0; local39 < Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1.length; local39++) {
			if (Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local39] != null) {
				Static72.aClass1_Sub1_Sub1_Sub1_Sub1Array1[local39].anInt1389 = -1;
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1.length; local61++) {
			if (Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local61] != null) {
				Static4.aClass1_Sub1_Sub1_Sub1_Sub2Array1[local61].anInt1389 = -1;
			}
		}
		Static60.method1037();
		Static41.method695(30);
		for (@Pc(88) int local88 = 0; local88 < 100; local88++) {
			Static12.aBooleanArray3[local88] = true;
		}
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)Lclient!af;")
	public static Class1_Sub1_Sub3 method1721(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub3 local6 = (Class1_Sub1_Sub3) Static88.aClass63_15.method1663((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(28) byte[] local28 = Static47.aClass35_11.method1573(14, arg0);
		local6 = new Class1_Sub1_Sub3();
		if (local28 != null) {
			local6.method213(new Class1_Sub19(local28));
		}
		Static88.aClass63_15.method1659(local6, (long) arg0);
		return local6;
	}

	@OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)V")
	public static void method1722() {
		anIntArray324 = null;
		aClass34_1299 = null;
		aClass34_1296 = null;
		aByteArrayArrayArray9 = null;
		anIntArray325 = null;
		aClass34_1300 = null;
		aCRC32_4 = null;
		aClass34_1298 = null;
		aClass34_1297 = null;
		aClass34_1295 = null;
		aClass63_20 = null;
		aClass1_Sub9_13 = null;
		aClass34_1302 = null;
		aClass34_1301 = null;
		aClass34_1303 = null;
		aClass1_Sub1_Sub2_Sub2_13 = null;
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(III)Z")
	public static boolean method1723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == 11) {
			arg0 = 10;
		}
		@Pc(12) Class1_Sub1_Sub16 local12 = Static28.method2008(arg1);
		if (arg0 >= 5 && arg0 <= 8) {
			arg0 = 4;
		}
		return local12.method1959(arg0);
	}

	@OriginalMember(owner = "client!rf", name = "a", descriptor = "(ILclient!ef;)V")
	public static void method1724(@OriginalArg(1) Class1_Sub1_Sub1_Sub1 arg0) {
		arg0.aBoolean80 = false;
		@Pc(14) Class1_Sub1_Sub6 local14;
		if (arg0.anInt1446 != -1) {
			local14 = Static40.method687(arg0.anInt1446);
			if (local14 == null || local14.anIntArray123 == null) {
				arg0.anInt1446 = -1;
			} else {
				arg0.anInt1429++;
				if (arg0.anInt1401 < local14.anIntArray123.length && arg0.anInt1429 > local14.anIntArray120[arg0.anInt1401]) {
					arg0.anInt1401++;
					arg0.anInt1429 = 1;
					Static67.method1130(arg0.anInt1401, arg0.anInt1405, local14, arg0.anInt1428);
				}
				if (local14.anIntArray123.length <= arg0.anInt1401) {
					arg0.anInt1429 = 0;
					arg0.anInt1401 = 0;
					Static67.method1130(arg0.anInt1401, arg0.anInt1405, local14, arg0.anInt1428);
				}
			}
		}
		if (arg0.anInt1414 != -1 && arg0.anInt1420 <= Static73.anInt1947) {
			if (arg0.anInt1424 < 0) {
				arg0.anInt1424 = 0;
			}
			@Pc(121) int local121 = Static11.method279(arg0.anInt1414).anInt2581;
			if (local121 == -1) {
				arg0.anInt1414 = -1;
			} else {
				@Pc(129) Class1_Sub1_Sub6 local129 = Static40.method687(local121);
				if (local129 == null || local129.anIntArray123 == null) {
					arg0.anInt1414 = -1;
				} else {
					arg0.anInt1433++;
					if (local129.anIntArray123.length > arg0.anInt1424 && local129.anIntArray120[arg0.anInt1424] < arg0.anInt1433) {
						arg0.anInt1424++;
						arg0.anInt1433 = 1;
						Static67.method1130(arg0.anInt1424, arg0.anInt1405, local129, arg0.anInt1428);
					}
					if (arg0.anInt1424 >= local129.anIntArray123.length && (arg0.anInt1424 < 0 || local129.anIntArray123.length <= arg0.anInt1424)) {
						arg0.anInt1414 = -1;
					}
				}
			}
		}
		if (arg0.anInt1388 != -1 && arg0.anInt1416 <= 1) {
			local14 = Static40.method687(arg0.anInt1388);
			if (local14.anInt1196 == 1 && arg0.anInt1418 > 0 && Static73.anInt1947 >= arg0.anInt1425 && arg0.anInt1419 < Static73.anInt1947) {
				arg0.anInt1416 = 1;
				return;
			}
		}
		if (arg0.anInt1388 != -1 && arg0.anInt1416 == 0) {
			local14 = Static40.method687(arg0.anInt1388);
			if (local14 == null || local14.anIntArray123 == null) {
				arg0.anInt1388 = -1;
			} else {
				arg0.anInt1393++;
				if (arg0.anInt1431 < local14.anIntArray123.length && arg0.anInt1393 > local14.anIntArray120[arg0.anInt1431]) {
					arg0.anInt1431++;
					arg0.anInt1393 = 1;
					Static67.method1130(arg0.anInt1431, arg0.anInt1405, local14, arg0.anInt1428);
				}
				if (arg0.anInt1431 >= local14.anIntArray123.length) {
					arg0.anInt1427++;
					arg0.anInt1431 -= local14.anInt1201;
					if (local14.anInt1198 <= arg0.anInt1427) {
						arg0.anInt1388 = -1;
					} else if (arg0.anInt1431 >= 0 && local14.anIntArray123.length > arg0.anInt1431) {
						Static67.method1130(arg0.anInt1431, arg0.anInt1405, local14, arg0.anInt1428);
					} else {
						arg0.anInt1388 = -1;
					}
				}
				arg0.aBoolean80 = local14.aBoolean69;
			}
		}
		if (arg0.anInt1416 > 0) {
			arg0.anInt1416--;
		}
	}
}
