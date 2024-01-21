import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static62 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "Lclient!ec;")
	public static Class22 aClass22_479 = Static60.method1113(" )2> <col=ffff00>");

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "Lclient!ec;")
	public static Class22 aClass22_480 = Static60.method1113("Fehler bei der Verbindung zum Server)3");

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
	public static int anInt1802 = 0;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "[I")
	public static int[] anIntArray177 = new int[4000];

	@OriginalMember(owner = "client!kf", name = "k", descriptor = "I")
	public static int anInt1808 = 0;

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "Lclient!ec;")
	public static Class22 aClass22_481 = Static60.method1113("<img=1>");

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "Lclient!ec;")
	public static Class22 aClass22_482 = Static60.method1113(")1");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIBI)V")
	public static void method1122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static118.method1386(arg1, arg3, arg0 + arg1, arg2 + arg3);
		Static6.method120();
		Static134.anInt3157++;
		Static13.method219(true);
		Static51.method981(true);
		Static13.method219(false);
		Static51.method981(false);
		Static119.method1862();
		Static84.method1497();
		@Pc(39) int local39;
		@Pc(45) int local45;
		if (!Static19.aBoolean53) {
			local39 = Static111.anInt2766;
			local45 = Static111.anInt2754 + Static9.anInt184 & 0x7FF;
			if (local39 < Static22.anInt2807 / 256) {
				local39 = Static22.anInt2807 / 256;
			}
			if (Static29.aBooleanArray1[4] && local39 < Static103.anIntArray292[4] + 128) {
				local39 = Static103.anIntArray292[4] + 128;
			}
			Static120.method1872(local45, Static69.method1173(Static37.anInt895, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2500, Static16.aClass4_Sub1_Sub3_Sub2_Sub1_1.anInt2462) - 50, local39 * 3 + 600, Static49.anInt1328, local39, Static89.anInt2374);
		}
		if (Static19.aBoolean53) {
			local39 = Static43.method818();
		} else {
			local39 = Static5.method44();
		}
		local45 = Static87.anInt2318;
		@Pc(105) int local105 = Static42.anInt885;
		@Pc(107) int local107 = Static39.anInt957;
		@Pc(109) int local109 = Static60.anInt1788;
		@Pc(111) int local111 = Static96.anInt2480;
		@Pc(160) int local160;
		for (@Pc(118) int local118 = 0; local118 < 5; local118++) {
			if (Static29.aBooleanArray1[local118]) {
				local160 = (int) ((double) -Static95.anIntArray196[local118] + (double) (Static95.anIntArray196[local118] * 2 + 1) * Math.random() + Math.sin((double) Static14.anIntArray41[local118] * ((double) Static122.anIntArray142[local118] / 100.0D)) * (double) Static103.anIntArray292[local118]);
				if (local118 == 4) {
					Static39.anInt957 += local160;
					if (Static39.anInt957 < 128) {
						Static39.anInt957 = 128;
					}
					if (Static39.anInt957 > 383) {
						Static39.anInt957 = 383;
					}
				}
				if (local118 == 3) {
					Static96.anInt2480 = Static96.anInt2480 + local160 & 0x7FF;
				}
				if (local118 == 1) {
					Static60.anInt1788 += local160;
				}
				if (local118 == 2) {
					Static42.anInt885 += local160;
				}
				if (local118 == 0) {
					Static87.anInt2318 += local160;
				}
			}
		}
		local160 = Static72.anInt1914;
		@Pc(222) int local222 = Static117.anInt2876;
		if (local160 >= arg1 && arg0 + arg1 > local160 && local222 >= arg3 && arg3 + arg2 > local222) {
			Static83.anInt2245 = 0;
			Static83.anInt2241 = Static72.anInt1914 - arg1;
			Static83.anInt2242 = Static117.anInt2876 - arg3;
			Static83.aBoolean200 = true;
		} else {
			Static83.aBoolean200 = false;
			Static83.anInt2245 = 0;
		}
		Static104.method1724();
		Static118.method1373(arg1, arg3, arg0, arg2, 0);
		Static104.method1724();
		Static134.aClass77_1.method1971(Static87.anInt2318, Static60.anInt1788, Static42.anInt885, Static39.anInt957, Static96.anInt2480, local39);
		Static104.method1724();
		Static134.aClass77_1.method1939();
		Static48.method902(arg2, arg3, arg1, arg0);
		Static52.method996(arg1, arg3);
		((Class75) Static6.anInterface2_1).method1849(Static46.anInt1293);
		Static14.method278(arg3, arg2, arg1, arg0);
		Static87.anInt2318 = local45;
		Static42.anInt885 = local105;
		Static60.anInt1788 = local109;
		Static39.anInt957 = local107;
		Static96.anInt2480 = local111;
		if (Static73.aBoolean166 && Static30.method511() == 0) {
			Static73.aBoolean166 = false;
		}
		if (Static73.aBoolean166) {
			Static118.method1373(arg1, arg3, arg0, arg2, 0);
			Static12.method165(Static42.aClass22_252, false);
		}
		if (!Static73.aBoolean166 && !Static22.aBoolean250 && local160 >= arg1 && local160 < arg0 + arg1 && arg3 <= local222 && arg3 + arg2 > local222) {
			Static72.method1183(local160, arg3, arg1, local222);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(IILclient!hd;III)V")
	public static void method1123(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub1_Sub5 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(12) Class4_Sub18 local12 = new Class4_Sub18();
		local12.anInt2203 = arg4 * 128;
		local12.anInt2202 = arg1.anInt1282;
		local12.anInt2193 = arg3 * 128;
		local12.anInt2190 = arg1.anInt1279;
		local12.anIntArray222 = arg1.anIntArray135;
		@Pc(37) int local37 = arg1.anInt1256;
		local12.anInt2191 = arg2;
		local12.anInt2195 = arg1.anInt1271 * 128;
		local12.anInt2188 = arg1.anInt1283;
		@Pc(53) int local53 = arg1.anInt1267;
		if (arg0 == 1 || arg0 == 3) {
			local53 = arg1.anInt1256;
			local37 = arg1.anInt1267;
		}
		local12.anInt2189 = (local53 + arg4) * 128;
		local12.anInt2192 = (local37 + arg3) * 128;
		if (arg1.anIntArray137 != null) {
			local12.aClass4_Sub1_Sub5_1 = arg1;
			local12.method1449();
		}
		Static52.aClass82_5.method2028(local12);
		if (local12.anIntArray222 != null) {
			local12.anInt2199 = (int) ((double) (local12.anInt2190 - local12.anInt2188) * Math.random()) + local12.anInt2188;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZI)V")
	public static void method1124(@OriginalArg(1) int arg0) {
		Static116.anInt2871 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public static void method1125() {
		aClass22_482 = null;
		aClass22_480 = null;
		aClass22_479 = null;
		aClass22_481 = null;
		anIntArray177 = null;
	}
}
