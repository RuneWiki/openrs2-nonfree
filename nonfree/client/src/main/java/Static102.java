import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
	public static int anInt2656;

	@OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lclient!pc;")
	public static Class12 aClass12_78;

	@OriginalMember(owner = "client!ud", name = "cb", descriptor = "Lclient!td;")
	public static Class54 aClass54_32;

	@OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
	public static int anInt2657 = 0;

	@OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
	public static int anInt2658 = 10;

	@OriginalMember(owner = "client!ud", name = "hb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1290 = Static87.method1648("New User");

	@OriginalMember(owner = "client!ud", name = "W", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1286 = aClass27_1290;

	@OriginalMember(owner = "client!ud", name = "X", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1287 = Static87.method1648("Loaded update list");

	@OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
	public static int anInt2660 = -1;

	@OriginalMember(owner = "client!ud", name = "bb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1288 = Static87.method1648("nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ud", name = "eb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1289 = Static87.method1648("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
	public static int anInt2662 = 0;

	@OriginalMember(owner = "client!ud", name = "gb", descriptor = "[[I")
	public static int[][] anIntArrayArray70 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

	@OriginalMember(owner = "client!ud", name = "jb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1291 = Static87.method1648("(U3");

	@OriginalMember(owner = "client!ud", name = "lb", descriptor = "Lclient!hb;")
	private static Class27 aClass27_1292 = Static87.method1648("Loaded wordpack");

	@OriginalMember(owner = "client!ud", name = "mb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1293 = Static87.method1648("invback");

	@OriginalMember(owner = "client!ud", name = "ob", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1294 = Static87.method1648("-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

	@OriginalMember(owner = "client!ud", name = "qb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1295 = aClass27_1292;

	@OriginalMember(owner = "client!ud", name = "rb", descriptor = "Lclient!hb;")
	public static Class27 aClass27_1296 = aClass27_1287;

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIII)V")
	public static void method1832(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (!Static70.aBoolean94) {
			arg1 = 0;
		}
		if (Static13.anInt762 == arg0 && Static106.anInt831 == arg3 && arg1 == Static13.anInt767) {
			return;
		}
		Static13.anInt762 = arg0;
		Static106.anInt831 = arg3;
		Static13.anInt767 = arg1;
		Static109.method1459(25);
		Static35.method687(Static33.aClass27_396, false, null);
		@Pc(45) int local45 = Static89.anInt2464;
		Static89.anInt2464 = (arg0 - 6) * 8;
		@Pc(56) int local56 = Static89.anInt2464 - local45;
		@Pc(58) int local58 = Static101.anInt2631;
		Static101.anInt2631 = arg3 * 8 - 48;
		@Pc(71) int local71 = Static101.anInt2631 - local58;
		for (@Pc(75) int local75 = 0; local75 < 32768; local75++) {
			@Pc(81) Class3_Sub3_Sub1_Sub4_Sub1 local81 = Static97.aClass3_Sub3_Sub1_Sub4_Sub1Array2[local75];
			if (local81 != null) {
				for (@Pc(85) int local85 = 0; local85 < 10; local85++) {
					local81.anIntArray359[local85] -= local56;
					local81.anIntArray357[local85] -= local71;
				}
				local81.anInt2408 -= local56 * 128;
				local81.anInt2399 -= local71 * 128;
			}
		}
		for (@Pc(129) int local129 = 0; local129 < 2048; local129++) {
			@Pc(135) Class3_Sub3_Sub1_Sub4_Sub2 local135 = Static71.aClass3_Sub3_Sub1_Sub4_Sub2Array1[local129];
			if (local135 != null) {
				for (@Pc(139) int local139 = 0; local139 < 10; local139++) {
					local135.anIntArray359[local139] -= local56;
					local135.anIntArray357[local139] -= local71;
				}
				local135.anInt2408 -= local56 * 128;
				local135.anInt2399 -= local71 * 128;
			}
		}
		Static68.anInt1747 = arg1;
		Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.method1677(false, arg2, arg4);
		@Pc(193) byte local193 = 0;
		@Pc(195) byte local195 = 104;
		@Pc(197) byte local197 = 1;
		@Pc(199) byte local199 = 0;
		if (local56 < 0) {
			local193 = 103;
			local195 = -1;
			local197 = -1;
		}
		@Pc(212) byte local212 = 104;
		@Pc(214) byte local214 = 1;
		if (local71 < 0) {
			local199 = 103;
			local214 = -1;
			local212 = -1;
		}
		for (@Pc(225) int local225 = local193; local225 != local195; local225 += local197) {
			for (@Pc(229) int local229 = local199; local229 != local212; local229 += local214) {
				@Pc(235) int local235 = local71 + local229;
				@Pc(239) int local239 = local56 + local225;
				for (@Pc(241) int local241 = 0; local241 < 4; local241++) {
					if (local239 >= 0 && local235 >= 0 && local239 < 104 && local235 < 104) {
						Static71.aClass28ArrayArrayArray1[local241][local225][local229] = Static71.aClass28ArrayArrayArray1[local241][local239][local235];
					} else {
						Static71.aClass28ArrayArrayArray1[local241][local225][local229] = null;
					}
				}
			}
		}
		for (@Pc(305) Class3_Sub13 local305 = (Class3_Sub13) Static82.aClass28_10.method884(); local305 != null; local305 = (Class3_Sub13) Static82.aClass28_10.method875()) {
			local305.anInt2716 -= local71;
			local305.anInt2725 -= local56;
			if (local305.anInt2725 < 0 || local305.anInt2716 < 0 || local305.anInt2725 >= 104 || local305.anInt2716 >= 104) {
				local305.method1883();
			}
		}
		Static37.anInt887 = 0;
		Static87.anInt2341 = -1;
		Static30.aBoolean45 = false;
		if (Static77.anInt2150 != 0) {
			Static97.anInt2290 -= local71;
			Static77.anInt2150 -= local56;
		}
		Static19.aClass28_5.method891();
		Static39.aClass28_8.method891();
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method1834(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static50.aClass35_1);
		arg0.addMouseMotionListener(Static50.aClass35_1);
	}

	@OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V")
	public static void method1835() {
		aClass27_1289 = null;
		aClass27_1287 = null;
		aClass27_1286 = null;
		anIntArrayArray70 = null;
		aClass27_1294 = null;
		aClass54_32 = null;
		aClass12_78 = null;
		aClass27_1293 = null;
		aClass27_1292 = null;
		aClass27_1290 = null;
		aClass27_1288 = null;
		aClass27_1296 = null;
		aClass27_1295 = null;
		aClass27_1291 = null;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!ja;I)V")
	public static void method1836(@OriginalArg(0) Class3_Sub3_Sub1_Sub4 arg0) {
		arg0.aBoolean118 = false;
		@Pc(13) Class3_Sub3_Sub14 local13;
		if (arg0.anInt2390 != -1) {
			local13 = Static16.method298(arg0.anInt2390);
			arg0.anInt2417++;
			if (local13.anIntArray382.length > arg0.anInt2376 && local13.anIntArray383[arg0.anInt2376] < arg0.anInt2417) {
				arg0.anInt2376++;
				arg0.anInt2417 = 1;
			}
			if (local13.anIntArray382.length <= arg0.anInt2376) {
				arg0.anInt2417 = 0;
				arg0.anInt2376 = 0;
			}
		}
		if (arg0.anInt2385 != -1 && Static2.anInt38 >= arg0.anInt2391) {
			if (arg0.anInt2404 < 0) {
				arg0.anInt2404 = 0;
			}
			@Pc(94) int local94 = Static84.method1557(arg0.anInt2385).anInt2485;
			if (local94 == -1) {
				arg0.anInt2385 = -1;
			} else {
				@Pc(106) Class3_Sub3_Sub14 local106 = Static16.method298(local94);
				arg0.anInt2389++;
				if (local106.anIntArray382.length > arg0.anInt2404 && arg0.anInt2389 > local106.anIntArray383[arg0.anInt2404]) {
					arg0.anInt2389 = 1;
					arg0.anInt2404++;
				}
				if (arg0.anInt2404 >= local106.anIntArray382.length && (arg0.anInt2404 < 0 || arg0.anInt2404 >= local106.anIntArray382.length)) {
					arg0.anInt2385 = -1;
				}
			}
		}
		if (arg0.anInt2430 != -1 && arg0.anInt2388 <= 1) {
			local13 = Static16.method298(arg0.anInt2430);
			if (local13.anInt2616 == 1 && arg0.anInt2420 > 0 && Static2.anInt38 >= arg0.anInt2424 && Static2.anInt38 > arg0.anInt2402) {
				arg0.anInt2388 = 1;
				return;
			}
		}
		if (arg0.anInt2430 != -1 && arg0.anInt2388 == 0) {
			local13 = Static16.method298(arg0.anInt2430);
			arg0.anInt2425++;
			if (arg0.anInt2397 < local13.anIntArray382.length && arg0.anInt2425 > local13.anIntArray383[arg0.anInt2397]) {
				arg0.anInt2425 = 1;
				arg0.anInt2397++;
			}
			if (arg0.anInt2397 >= local13.anIntArray382.length) {
				arg0.anInt2414++;
				if (arg0.anInt2414 >= local13.anInt2611) {
					arg0.anInt2430 = -1;
				}
				arg0.anInt2397 -= local13.anInt2609;
				if (arg0.anInt2397 < 0 || arg0.anInt2397 >= local13.anIntArray382.length) {
					arg0.anInt2430 = -1;
				}
			}
			arg0.aBoolean118 = local13.aBoolean126;
		}
		if (arg0.anInt2388 > 0) {
			arg0.anInt2388--;
		}
	}

	@OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V")
	public static void method1837() {
		Static7.anInt182 = 0;
		@Pc(17) int local17 = (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2408 >> 7) + Static89.anInt2464;
		@Pc(24) int local24 = (Static62.aClass3_Sub3_Sub1_Sub4_Sub2_1.anInt2399 >> 7) + Static101.anInt2631;
		if (local17 >= 3053 && local17 <= 3156 && local24 >= 3056 && local24 <= 3136) {
			Static7.anInt182 = 1;
		}
		if (local17 >= 3072 && local17 <= 3118 && local24 >= 9492 && local24 <= 9535) {
			Static7.anInt182 = 1;
		}
		if (Static7.anInt182 == 1 && local17 >= 3139 && local17 <= 3199 && local24 >= 3008 && local24 <= 3062) {
			Static7.anInt182 = 0;
		}
	}
}
