import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[Lclient!hd;")
	public static Class1_Sub1_Sub6_Sub1[] aClass1_Sub1_Sub6_Sub1Array4;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!mb;")
	public static Class1_Sub1_Sub6_Sub3 aClass1_Sub1_Sub6_Sub3_18;

	@OriginalMember(owner = "client!ne", name = "r", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1136 = Static15.method178("Please try using a different world)3");

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1129 = aClass23_1136;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "[B")
	public static byte[] aByteArray12 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

	@OriginalMember(owner = "client!ne", name = "g", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1130 = Static15.method178("(U(Y");

	@OriginalMember(owner = "client!ne", name = "h", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1131 = aClass23_1136;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1132 = Static15.method178("Anmelde)2Zeitlimit -Uberschritten)3");

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "J")
	public static long aLong51 = 0L;

	@OriginalMember(owner = "client!ne", name = "k", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1133 = Static15.method178("scrollen:");

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1134 = Static15.method178("Verbindung konnte nicht hergestellt werden)3");

	@OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
	public static int anInt1982 = 78;

	@OriginalMember(owner = "client!ne", name = "n", descriptor = "Z")
	public static boolean aBoolean99 = false;

	@OriginalMember(owner = "client!ne", name = "o", descriptor = "Z")
	public static boolean aBoolean100 = true;

	@OriginalMember(owner = "client!ne", name = "q", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1135 = aClass23_1136;

	@OriginalMember(owner = "client!ne", name = "s", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1137 = aClass23_1136;

	@OriginalMember(owner = "client!ne", name = "t", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1138 = aClass23_1136;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1139 = aClass23_1136;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!fa;I)V")
	public static void method1264(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg1) {
		if (arg1.anInt2196 < 128 || arg1.anInt2232 < 128 || arg1.anInt2196 >= 13184 || arg1.anInt2232 >= 13184) {
			arg1.anInt2222 = -1;
			arg1.anInt2221 = 0;
			arg1.anInt2213 = -1;
			arg1.anInt2218 = 0;
			arg1.anInt2196 = arg1.anInt2197 * 64 + arg1.anIntArray264[0] * 128;
			arg1.anInt2232 = arg1.anIntArray266[0] * 128 + arg1.anInt2197 * 64;
			arg1.method1390();
		}
		if (arg1 == Static14.aClass1_Sub1_Sub2_Sub1_Sub2_1 && (arg1.anInt2196 < 1536 || arg1.anInt2232 < 1536 || arg1.anInt2196 >= 11776 || arg1.anInt2232 >= 11776)) {
			arg1.anInt2222 = -1;
			arg1.anInt2221 = 0;
			arg1.anInt2213 = -1;
			arg1.anInt2218 = 0;
			arg1.anInt2196 = arg1.anInt2197 * 64 + arg1.anIntArray264[0] * 128;
			arg1.anInt2232 = arg1.anIntArray266[0] * 128 + arg1.anInt2197 * 64;
			arg1.method1390();
		}
		if (arg1.anInt2221 > Static7.anInt176) {
			Static73.method1312(arg1);
		} else if (arg1.anInt2218 >= Static7.anInt176) {
			method1268(arg1);
		} else {
			Static80.method1397(arg1);
		}
		Static43.method912(arg1);
		Static21.method350(arg1);
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)V")
	public static void method1265() {
		aClass1_Sub1_Sub6_Sub1Array4 = null;
		aClass1_Sub1_Sub6_Sub3_18 = null;
		aClass23_1138 = null;
		aClass23_1136 = null;
		aClass23_1131 = null;
		aClass23_1135 = null;
		aClass23_1139 = null;
		aClass23_1133 = null;
		aByteArray12 = null;
		aClass23_1130 = null;
		aClass23_1137 = null;
		aClass23_1134 = null;
		aClass23_1132 = null;
		aClass23_1129 = null;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BIII)V")
	public static void method1266(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 128 || arg2 < 128 || arg0 > 13056 || arg2 > 13056) {
			Static13.anInt234 = -1;
			Static20.anInt687 = -1;
			return;
		}
		@Pc(31) int local31 = Static48.method987(arg2, arg0, Static79.anInt2137) - arg1;
		@Pc(35) int local35 = arg2 - Static21.anInt702;
		@Pc(39) int local39 = local31 - Static96.anInt1793;
		@Pc(43) int local43 = Static81.anIntArray300[Static44.anInt1488];
		@Pc(47) int local47 = arg0 - Static54.anInt1684;
		@Pc(51) int local51 = Static81.anIntArray300[Static107.anInt2775];
		@Pc(55) int local55 = Static81.anIntArray292[Static107.anInt2775];
		@Pc(65) int local65 = local47 * local55 + local51 * local35 >> 16;
		@Pc(69) int local69 = Static81.anIntArray292[Static44.anInt1488];
		@Pc(80) int local80 = local55 * local35 - local47 * local51 >> 16;
		@Pc(82) int local82 = local65;
		@Pc(93) int local93 = local39 * local69 - local80 * local43 >> 16;
		@Pc(104) int local104 = local39 * local43 + local80 * local69 >> 16;
		if (local104 < 50) {
			Static13.anInt234 = -1;
			Static20.anInt687 = -1;
		} else {
			Static20.anInt687 = (local93 << 9) / local104 + 167;
			Static13.anInt234 = (local82 << 9) / local104 + 256;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)Z")
	public static boolean method1267(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(ILclient!fa;)V")
	private static void method1268(@OriginalArg(1) Class1_Sub1_Sub2_Sub1 arg0) {
		if (Static7.anInt176 == arg0.anInt2218 || arg0.anInt2213 == -1 || arg0.anInt2205 != 0 || arg0.anInt2215 + 1 > Static18.method249(arg0.anInt2213).anIntArray143[arg0.anInt2201]) {
			@Pc(40) int local40 = arg0.anInt2218 - arg0.anInt2221;
			@Pc(45) int local45 = Static7.anInt176 - arg0.anInt2221;
			@Pc(55) int local55 = arg0.anInt2197 * 64 + arg0.anInt2191 * 128;
			@Pc(65) int local65 = arg0.anInt2209 * 128 + arg0.anInt2197 * 64;
			@Pc(76) int local76 = arg0.anInt2229 * 128 + arg0.anInt2197 * 64;
			@Pc(86) int local86 = arg0.anInt2197 * 64 + arg0.anInt2182 * 128;
			arg0.anInt2232 = (local45 * local76 + local86 * (local40 - local45)) / local40;
			arg0.anInt2196 = (local45 * local65 + (local40 - local45) * local55) / local40;
		}
		if (arg0.anInt2202 == 0) {
			arg0.anInt2187 = 1024;
		}
		if (arg0.anInt2202 == 1) {
			arg0.anInt2187 = 1536;
		}
		arg0.anInt2175 = 0;
		if (arg0.anInt2202 == 2) {
			arg0.anInt2187 = 0;
		}
		if (arg0.anInt2202 == 3) {
			arg0.anInt2187 = 512;
		}
		arg0.anInt2223 = arg0.anInt2187;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BI)[B")
	public static synchronized byte[] method1269(@OriginalArg(1) int arg0) {
		@Pc(23) byte[] local23;
		if (arg0 == 100 && Static109.anInt2834 > 0) {
			local23 = Static112.aByteArrayArray10[--Static109.anInt2834];
			Static112.aByteArrayArray10[Static109.anInt2834] = null;
			return local23;
		} else if (arg0 == 5000 && Static49.anInt1435 > 0) {
			local23 = Static11.aByteArrayArray1[--Static49.anInt1435];
			Static11.aByteArrayArray1[Static49.anInt1435] = null;
			return local23;
		} else if (arg0 == 30000 && Static58.anInt2818 > 0) {
			local23 = Static56.aByteArrayArray3[--Static58.anInt2818];
			Static56.aByteArrayArray3[Static58.anInt2818] = null;
			return local23;
		} else {
			return new byte[arg0];
		}
	}
}
