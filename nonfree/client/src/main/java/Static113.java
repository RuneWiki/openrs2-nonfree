import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!va", name = "l", descriptor = "[Lclient!he;")
	public static Class1_Sub1_Sub5_Sub2[] aClass1_Sub1_Sub5_Sub2Array6;

	@OriginalMember(owner = "client!va", name = "q", descriptor = "I")
	public static int anInt1816;

	@OriginalMember(owner = "client!va", name = "d", descriptor = "Lclient!dd;")
	public static Class19 aClass19_66 = new Class19(30);

	@OriginalMember(owner = "client!va", name = "e", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1108 = Static69.method1153("(Y ");

	@OriginalMember(owner = "client!va", name = "g", descriptor = "I")
	public static int anInt1815 = 0;

	@OriginalMember(owner = "client!va", name = "h", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1109 = Static69.method1153("Add ignore");

	@OriginalMember(owner = "client!va", name = "i", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1110 = Static69.method1153("Die Adresse dieses Computers wurde gesperrt)1");

	@OriginalMember(owner = "client!va", name = "j", descriptor = "Z")
	public static boolean aBoolean111 = false;

	@OriginalMember(owner = "client!va", name = "k", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1111 = Static69.method1153("You have only just left another world)3");

	@OriginalMember(owner = "client!va", name = "n", descriptor = "Lclient!rd;")
	private static Class64 aClass64_1113 = Static69.method1153("Accept challenge");

	@OriginalMember(owner = "client!va", name = "m", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1112 = aClass64_1113;

	@OriginalMember(owner = "client!va", name = "o", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1114 = aClass64_1109;

	@OriginalMember(owner = "client!va", name = "p", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1115 = Static69.method1153("@whi@ )4 ");

	@OriginalMember(owner = "client!va", name = "r", descriptor = "Lclient!rd;")
	public static Class64 aClass64_1116 = aClass64_1111;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BI)V")
	public static void method1304(@OriginalArg(1) int arg0) {
		if (!Static109.method1872()) {
			return;
		}
		if (Static28.aBoolean147) {
			Static11.anInt424 = arg0;
		} else {
			Static40.method690(arg0);
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(I)V")
	public static void method1305() {
		aClass64_1115 = null;
		aClass64_1116 = null;
		aClass64_1114 = null;
		aClass64_1108 = null;
		aClass64_1110 = null;
		aClass64_1109 = null;
		aClass1_Sub1_Sub5_Sub2Array6 = null;
		aClass64_1111 = null;
		aClass64_1113 = null;
		aClass64_1112 = null;
		aClass19_66 = null;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(IIILclient!td;I)V")
	public static void method1306(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub1_Sub2_Sub1_Sub2 arg2, @OriginalArg(4) int arg3) {
		if (arg2 == Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1 || Static48.anInt2603 >= 400) {
			return;
		}
		@Pc(51) Class64 local51;
		if (arg2.anInt2421 == 0) {
			local51 = Static82.method1383(new Class64[] { arg2.aClass64_1543, Static21.method417(Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2429, arg2.anInt2429), Static62.aClass64_912, Static87.aClass64_1267, Static12.method1395(arg2.anInt2429), Static69.aClass64_972 });
		} else {
			local51 = Static82.method1383(new Class64[] { arg2.aClass64_1543, Static62.aClass64_912, Static108.aClass64_1622, Static12.method1395(arg2.anInt2421), Static69.aClass64_972 });
		}
		@Pc(165) int local165;
		if (Static121.anInt2872 == 1) {
			Static2.method63(arg1, Static82.method1383(new Class64[] { Static13.aClass64_304, Static91.aClass64_1285, local51 }), arg0, 14, Static95.aClass64_1380, arg3);
		} else if (!Static103.aBoolean143) {
			for (local165 = 4; local165 >= 0; local165--) {
				if (Static94.aClass64Array15[local165] != null) {
					@Pc(173) short local173 = 0;
					if (Static94.aClass64Array15[local165].method1501(Static13.aClass64_307)) {
						if (arg2.anInt2429 > Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2429) {
							local173 = 2000;
						}
						if (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2414 != 0 && arg2.anInt2414 != 0) {
							if (Static5.aClass1_Sub1_Sub2_Sub1_Sub2_1.anInt2414 == arg2.anInt2414) {
								local173 = 2000;
							} else {
								local173 = 0;
							}
						}
					} else if (Static102.aBooleanArray10[local165]) {
						local173 = 2000;
					}
					@Pc(218) int local218 = 0;
					if (local165 == 0) {
						local218 = local173 + 43;
					}
					if (local165 == 1) {
						local218 = local173 + 26;
					}
					if (local165 == 2) {
						local218 = local173 + 11;
					}
					if (local165 == 3) {
						local218 = local173 + 34;
					}
					if (local165 == 4) {
						local218 = local173 + 12;
					}
					Static2.method63(arg1, Static82.method1383(new Class64[] { Static106.aClass64_1610, local51 }), arg0, local218, Static94.aClass64Array15[local165], arg3);
				}
			}
		} else if ((Static18.anInt582 & 0x8) == 8) {
			Static2.method63(arg1, Static82.method1383(new Class64[] { Static27.aClass64_579, Static91.aClass64_1285, local51 }), arg0, 16, Static98.aClass64_1399, arg3);
		}
		for (local165 = 0; local165 < Static48.anInt2603; local165++) {
			if (Static95.anIntArray315[local165] == 19) {
				Static101.aClass64Array16[local165] = Static82.method1383(new Class64[] { Static87.aClass64_1263, Static52.aClass64_1821, Static106.aClass64_1610, local51 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!mc;II)V")
	public static void method1308(@OriginalArg(0) Class1_Sub2 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >> 5;
		@Pc(11) Class1_Sub2 local11 = Static110.aClass1_Sub2Array3[local3];
		if (local11 == null) {
			Static85.aClass1_Sub2Array4[local3] = arg0;
		} else {
			local11.aClass1_Sub2_3 = arg0;
		}
		Static110.aClass1_Sub2Array3[local3] = arg0;
		arg0.anInt2117 = arg1;
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(BLclient!pb;)I")
	public static int method1311(@OriginalArg(1) Class41 arg0) {
		@Pc(5) int local5 = 0;
		if (arg0.method1075(Static64.aClass64_922, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static52.aClass64_1824, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static60.aClass64_858, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static18.aClass64_349, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static21.aClass64_383, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static121.aClass64_1846, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static26.aClass64_471, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static116.aClass64_1777, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static70.aClass64_989, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static84.aClass64_1224, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static104.aClass64_1537, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static81.aClass64_886, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static67.aClass64_958, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static54.aClass64_1316, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static100.aClass64_1420, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static14.aClass64_311, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static119.aClass64_1835, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static87.aClass64_1268, Static28.aClass64_1529)) {
			local5++;
		}
		if (arg0.method1075(Static65.aClass64_925, Static28.aClass64_1529)) {
			local5++;
		}
		return local5;
	}
}
