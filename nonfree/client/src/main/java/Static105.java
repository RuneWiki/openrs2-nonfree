import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!sa", name = "h", descriptor = "Lclient!nc;")
	public static Class47 aClass47_4;

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_16;

	@OriginalMember(owner = "client!sa", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1277 = Static59.method1195("Enter amount:");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1269 = aClass60_1277;

	@OriginalMember(owner = "client!sa", name = "x", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1282 = Static59.method1195("glow3:");

	@OriginalMember(owner = "client!sa", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1270 = aClass60_1282;

	@OriginalMember(owner = "client!sa", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1271 = Static59.method1195("Einloggen");

	@OriginalMember(owner = "client!sa", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1272 = aClass60_1282;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1279 = Static59.method1195("");

	@OriginalMember(owner = "client!sa", name = "f", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1273 = aClass60_1279;

	@OriginalMember(owner = "client!sa", name = "g", descriptor = "[Lclient!ue;")
	public static Class3_Sub1_Sub1_Sub7[] aClass3_Sub1_Sub1_Sub7Array1 = new Class3_Sub1_Sub1_Sub7[4];

	@OriginalMember(owner = "client!sa", name = "i", descriptor = "[Z")
	public static boolean[] aBooleanArray63 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!sa", name = "s", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1280 = Static59.method1195("Please wait )2 attempting to reestablish");

	@OriginalMember(owner = "client!sa", name = "j", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1274 = aClass60_1280;

	@OriginalMember(owner = "client!sa", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1275 = aClass60_1279;

	@OriginalMember(owner = "client!sa", name = "m", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1276 = aClass60_1279;

	@OriginalMember(owner = "client!sa", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1278 = aClass60_1279;

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "J")
	public static long aLong98 = 0L;

	@OriginalMember(owner = "client!sa", name = "t", descriptor = "I")
	public static int anInt3025 = 0;

	@OriginalMember(owner = "client!sa", name = "v", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1281 = aClass60_1279;

	@OriginalMember(owner = "client!sa", name = "w", descriptor = "I")
	public static int anInt3027 = 0;

	@OriginalMember(owner = "client!sa", name = "z", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1283 = Static59.method1195("Menge eingeben:");

	@OriginalMember(owner = "client!sa", name = "B", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1284 = aClass60_1279;

	@OriginalMember(owner = "client!sa", name = "C", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1285 = Static59.method1195("p12_full");

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(JI)V")
	public static void method2022(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static107.anInt3035 >= 100) {
			Static76.method1565(0, Static70.aClass60_951, Static120.aClass60_1369);
			return;
		}
		@Pc(25) Class60 local25 = Static97.method1821(arg0).method1866();
		for (@Pc(27) int local27 = 0; local27 < Static107.anInt3035; local27++) {
			if (Static113.aLongArray5[local27] == arg0) {
				Static76.method1565(0, Static60.method1211(new Class60[] { local25, Static98.aClass60_1209 }), Static120.aClass60_1369);
				return;
			}
		}
		for (@Pc(62) int local62 = 0; local62 < Static61.anInt1946; local62++) {
			if (arg0 == Static83.aLongArray4[local62]) {
				Static76.method1565(0, Static60.method1211(new Class60[] { Static64.aClass60_892, local25, Static53.aClass60_771 }), Static120.aClass60_1369);
				return;
			}
		}
		if (!local25.method1839(Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.aClass60_245)) {
			Static113.aLongArray5[Static107.anInt3035++] = arg0;
			Static118.aBoolean115 = true;
			Static81.aClass3_Sub12_Sub1_2.method1980(39);
			Static81.aClass3_Sub12_Sub1_2.method1972(arg0);
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
	public static void method2023() {
		aClass60_1277 = null;
		aClass60_1283 = null;
		aClass60_1275 = null;
		aClass60_1282 = null;
		aClass60_1272 = null;
		aClass60_1269 = null;
		aBooleanArray63 = null;
		aClass60_1278 = null;
		aClass60_1284 = null;
		aClass3_Sub1_Sub1_Sub7Array1 = null;
		aClass3_Sub1_Sub2_Sub4_16 = null;
		aClass47_4 = null;
		aClass60_1279 = null;
		aClass60_1273 = null;
		aClass60_1271 = null;
		aClass60_1280 = null;
		aClass60_1285 = null;
		aClass60_1270 = null;
		aClass60_1276 = null;
		aClass60_1281 = null;
		aClass60_1274 = null;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BI)Lclient!id;")
	public static Class3_Sub1_Sub9 method2024(@OriginalArg(1) int arg0) {
		@Pc(12) Class3_Sub1_Sub9 local12 = (Class3_Sub1_Sub9) Static91.aClass17_45.method643((long) arg0);
		if (local12 != null) {
			return local12;
		}
		@Pc(29) byte[] local29 = Static55.aClass25_13.method931(arg0, 13);
		local12 = new Class3_Sub1_Sub9();
		local12.anInt1586 = arg0;
		if (local29 != null) {
			local12.method1053(new Class3_Sub12(local29));
		}
		Static91.aClass17_45.method644((long) arg0, local12);
		return local12;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
	public static void method2025() {
		Static126.aClass17_55.method646();
	}
}
