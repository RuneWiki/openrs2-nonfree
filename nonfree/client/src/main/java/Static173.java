import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "Lclient!rn;")
	public static Class155 aClass155_66;

	@OriginalMember(owner = "client!mj", name = "h", descriptor = "I")
	public static int anInt3249;

	@OriginalMember(owner = "client!mj", name = "j", descriptor = "I")
	public static int anInt3251;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "[I")
	public static int[] anIntArray396 = new int[2000];

	@OriginalMember(owner = "client!mj", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString116 = "Loaded config";

	@OriginalMember(owner = "client!mj", name = "k", descriptor = "I")
	public static int anInt3252 = 0;

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIII)V")
	public static void method2864(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg0 - arg2;
		@Pc(15) int local15 = arg1 - arg4;
		if (local10 == 0) {
			if (local15 != 0) {
				Static103.method1666(arg3, arg1, arg2, arg4);
			}
		} else if (local15 == 0) {
			Static236.method3993(arg2, arg4, arg0, arg3);
		} else {
			@Pc(52) int local52 = (local15 << 12) / local10;
			@Pc(61) int local61 = arg4 - (local52 * arg2 >> 12);
			@Pc(73) int local73;
			@Pc(75) int local75;
			if (arg0 < Static175.anInt3267) {
				local73 = Static175.anInt3267;
				local75 = local61 + (Static175.anInt3267 * local52 >> 12);
			} else if (arg0 <= Static204.anInt4020) {
				local73 = arg0;
				local75 = arg1;
			} else {
				local75 = local61 + (local52 * Static204.anInt4020 >> 12);
				local73 = Static204.anInt4020;
			}
			@Pc(108) int local108;
			@Pc(117) int local117;
			if (arg2 < Static175.anInt3267) {
				local108 = Static175.anInt3267;
				local117 = (Static175.anInt3267 * local52 >> 12) + local61;
			} else if (arg2 > Static204.anInt4020) {
				local108 = Static204.anInt4020;
				local117 = local61 + (local52 * Static204.anInt4020 >> 12);
			} else {
				local117 = arg4;
				local108 = arg2;
			}
			if (local117 < Static245.anInt6027) {
				local117 = Static245.anInt6027;
				local108 = (Static245.anInt6027 - local61 << 12) / local52;
			} else if (Static111.anInt2039 < local117) {
				local108 = (Static111.anInt2039 - local61 << 12) / local52;
				local117 = Static111.anInt2039;
			}
			if (local75 < Static245.anInt6027) {
				local75 = Static245.anInt6027;
				local73 = (Static245.anInt6027 - local61 << 12) / local52;
			} else if (local75 > Static111.anInt2039) {
				local73 = (Static111.anInt2039 - local61 << 12) / local52;
				local75 = Static111.anInt2039;
			}
			Static167.method2788(local73, local108, local75, local117, arg3);
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIII)Z")
	public static boolean method2866(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static306.method4923(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static217.method3570(local10 + 1, Static256.anIntArrayArrayArray14[arg0][arg1][arg2] + arg3, local14 + 1) && Static217.method3570(local10 + 128 - 1, Static256.anIntArrayArrayArray14[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static217.method3570(local10 + 128 - 1, Static256.anIntArrayArrayArray14[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static217.method3570(local10 + 1, Static256.anIntArrayArrayArray14[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(I)V")
	public static void method2867() {
		@Pc(5) int local5 = Static224.aClass3_Sub4_Sub2_14.method3690(Static267.aString196);
		@Pc(11) int local11;
		@Pc(24) int local24;
		for (local11 = 0; local11 < Static152.anInt2876; local11++) {
			local24 = Static224.aClass3_Sub4_Sub2_14.method3690(Static153.method2577(local11));
			if (local24 > local5) {
				local5 = local24;
			}
		}
		local11 = Static152.anInt2876 * 15 + 21;
		local5 += 8;
		local24 = Static216.anInt4245 - local5 / 2;
		@Pc(57) int local57 = Static79.anInt1910;
		if (Static123.anInt2333 < local57 + local11) {
			local57 = Static123.anInt2333 - local11;
		}
		if (Static253.anInt5224 < local5 + local24) {
			local24 = Static253.anInt5224 - local5;
		}
		if (local57 < 0) {
			local57 = 0;
		}
		if (local24 < 0) {
			local24 = 0;
		}
		if (Static212.anInt4151 == 1) {
			if (Static216.anInt4245 == Static112.anInt5726 && Static83.anInt1550 == Static79.anInt1910) {
				anInt3249 = local24;
				Static205.anInt4054 = (Static34.aBoolean53 ? 26 : 22) + Static152.anInt2876 * 15;
				Static300.anInt5922 = local57;
				Static175.anInt3271 = local5;
				Static118.aBoolean169 = true;
				Static212.anInt4151 = 0;
			}
		} else if (Static293.anInt5844 == Static216.anInt4245 && Static7.anInt169 == Static79.anInt1910) {
			Static175.anInt3271 = local5;
			Static118.aBoolean169 = true;
			Static212.anInt4151 = 0;
			Static300.anInt5922 = local57;
			anInt3249 = local24;
			Static205.anInt4054 = (Static34.aBoolean53 ? 26 : 22) + Static152.anInt2876 * 15;
		} else {
			Static212.anInt4151 = 1;
			Static83.anInt1550 = Static7.anInt169;
			Static112.anInt5726 = Static293.anInt5844;
		}
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(I)V")
	public static void method2868() {
		Static217.aClass98_37.method2572();
	}

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(IBIIIII)V")
	public static void method2869(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static175.anInt3267 <= arg3 && Static204.anInt4020 >= arg4 && arg1 >= Static245.anInt6027 && arg2 <= Static111.anInt2039) {
			if (arg0 == 1) {
				Static238.method4038(arg5, arg2, arg3, arg4, arg1);
			} else {
				Static267.method4416(arg5, arg2, arg3, arg1, arg4, arg0);
			}
		} else if (arg0 == 1) {
			Static297.method1847(arg5, arg3, arg4, arg1, arg2);
		} else {
			Static43.method657(arg2, arg4, arg0, arg3, arg1, arg5);
		}
	}
}
