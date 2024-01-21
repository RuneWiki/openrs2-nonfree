import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
	public static int anInt1112;

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "Lclient!qg;")
	public static Class83 aClass83_1;

	@OriginalMember(owner = "client!fb", name = "g", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_359 = Static151.method2243("Loaded input handler");

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "Lclient!mb;")
	public static Class62 aClass62_358 = aClass62_359;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V")
	public static void method771(@OriginalArg(1) int arg0) {
		if (arg0 == -3) {
			Static43.method676(Static154.aClass62_1149, Static53.aClass62_371, Static157.aClass62_1195);
		} else if (arg0 == -2) {
			Static43.method676(Static154.aClass62_1157, Static19.aClass62_137, Static154.aClass62_1143);
		} else if (arg0 == -1) {
			Static43.method676(Static154.aClass62_1164, Static53.aClass62_372, Static170.aClass62_1280);
		} else if (arg0 == 3) {
			Static43.method676(Static154.aClass62_1167, Static120.aClass62_926, Static154.aClass62_1147);
		} else if (arg0 == 4) {
			Static43.method676(Static154.aClass62_1153, Static83.aClass62_580, Static27.aClass62_187);
		} else if (arg0 == 5) {
			Static43.method676(Static154.aClass62_1151, Static42.aClass62_1486, Static178.aClass62_1321);
		} else if (arg0 == 6) {
			Static43.method676(Static154.aClass62_1174, Static87.aClass62_607, Static89.aClass62_623);
		} else if (arg0 == 7) {
			Static43.method676(Static154.aClass62_1144, Static113.aClass62_861, Static123.aClass62_1533);
		} else if (arg0 == 8) {
			Static43.method676(Static154.aClass62_1173, Static153.aClass62_1134, Static31.aClass62_230);
		} else if (arg0 == 9) {
			Static43.method676(Static154.aClass62_1171, Static205.aClass62_1479, Static169.aClass62_1262);
		} else if (arg0 == 10) {
			Static43.method676(Static154.aClass62_1154, Static43.aClass62_313, Static31.aClass62_234);
		} else if (arg0 == 11) {
			Static43.method676(Static154.aClass62_1177, Static154.aClass62_1160, Static111.aClass62_834);
		} else if (arg0 == 12) {
			Static43.method676(Static154.aClass62_1141, Static121.aClass62_942, Static7.aClass62_852);
		} else if (arg0 == 13) {
			Static43.method676(Static154.aClass62_1145, Static53.aClass62_361, Static187.aClass62_1364);
		} else if (arg0 == 14) {
			Static43.method676(Static154.aClass62_1152, Static171.aClass62_1294, Static93.aClass62_731);
		} else if (arg0 == 16) {
			Static43.method676(Static154.aClass62_1139, Static204.aClass62_1469, Static32.aClass62_245);
		} else if (arg0 == 17) {
			Static43.method676(Static154.aClass62_1148, Static60.aClass62_417, Static153.aClass62_1130);
		} else if (arg0 == 18) {
			Static43.method676(Static154.aClass62_1172, Static20.aClass62_144, Static12.aClass62_93);
		} else if (arg0 == 19) {
			Static43.method676(Static113.aClass62_865, Static113.aClass62_863, Static162.aClass62_1217);
		} else if (arg0 == 20) {
			Static43.method676(Static154.aClass62_1170, Static53.aClass62_381, Static13.aClass62_97);
		} else if (arg0 == 22) {
			Static43.method676(Static154.aClass62_1175, Static130.aClass62_994, Static175.aClass62_1308);
		} else if (arg0 == 23) {
			Static43.method676(Static154.aClass62_1150, Static171.aClass62_1297, Static131.aClass62_526);
		} else if (arg0 == 24) {
			Static43.method676(Static154.aClass62_1158, Static115.aClass62_877, Static216.aClass62_1547);
		} else if (arg0 == 25) {
			Static43.method676(Static154.aClass62_1169, Static53.aClass62_363, Static115.aClass62_883);
		} else if (arg0 == 26) {
			Static43.method676(Static154.aClass62_1155, Static7.aClass62_848, Static97.aClass62_776);
		} else if (arg0 == 27) {
			Static43.method676(Static154.aClass62_1146, Static53.aClass62_374, Static154.aClass62_1142);
		} else {
			Static43.method676(Static154.aClass62_1161, Static53.aClass62_376, Static178.aClass62_1322);
		}
		Static2.method55(10);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IJ)V")
	public static void method773(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static29.anInt714 >= 100 && Static139.anInt2935 != 1 || Static29.anInt714 >= 200) {
			Static154.method2292(Static121.aClass62_940, 0, Static69.aClass62_484);
			return;
		}
		@Pc(33) Class62 local33 = Static149.method2218(arg0).method1876();
		for (@Pc(35) int local35 = 0; local35 < Static29.anInt714; local35++) {
			if (Static124.aLongArray7[local35] == arg0) {
				Static154.method2292(Static169.method2460(new Class62[] { local33, Static128.aClass62_39 }), 0, Static69.aClass62_484);
				return;
			}
		}
		for (@Pc(68) int local68 = 0; local68 < Static125.anInt2769; local68++) {
			if (Static161.aLongArray10[local68] == arg0) {
				Static154.method2292(Static169.method2460(new Class62[] { Static59.aClass62_405, local33, Static108.aClass62_828 }), 0, Static69.aClass62_484);
				return;
			}
		}
		if (local33.method1870(Static186.aClass7_Sub2_Sub2_1.aClass62_1072)) {
			Static154.method2292(Static33.aClass62_252, 0, Static69.aClass62_484);
			return;
		}
		Static62.aClass62Array33[Static29.anInt714] = local33;
		Static124.aLongArray7[Static29.anInt714] = arg0;
		Static35.anIntArray65[Static29.anInt714] = 0;
		Static80.aClass62Array46[Static29.anInt714] = Static69.aClass62_484;
		Static54.anIntArray87[Static29.anInt714] = 0;
		Static104.anInt2337 = Static11.anInt305;
		Static29.anInt714++;
		Static58.aClass2_Sub11_Sub1_2.method1595(129);
		Static58.aClass2_Sub11_Sub1_2.method1527(arg0);
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)Lclient!wi;")
	public static Class2_Sub1_Sub26 method774(@OriginalArg(1) int arg0) {
		@Pc(8) Class2_Sub1_Sub26 local8 = (Class2_Sub1_Sub26) Static180.aClass53_23.method1648((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(28) byte[] local28 = Static58.aClass71_12.method2130(Static175.method2547(arg0), Static97.method1593(arg0));
		local8 = new Class2_Sub1_Sub26();
		local8.anInt4521 = arg0;
		if (local28 != null) {
			local8.method3202(new Class2_Sub11(local28));
		}
		local8.method3198();
		if (local8.anInt4538 != -1) {
			local8.method3190(method774(local8.anInt4524), method774(local8.anInt4538));
		}
		if (local8.anInt4542 != -1) {
			local8.method3196(method774(local8.anInt4557), method774(local8.anInt4542));
		}
		if (!Static69.aBoolean61 && local8.aBoolean194) {
			local8.aClass62Array137 = null;
			local8.aClass62Array136 = null;
			local8.aClass62_1540 = Static119.aClass62_913;
			local8.aBoolean193 = false;
			local8.anInt4513 = 0;
		}
		Static180.aClass53_23.method1645((long) arg0, local8);
		return local8;
	}
}
