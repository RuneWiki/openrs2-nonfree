import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!fd", name = "f", descriptor = "I")
	public static int anInt909;

	@OriginalMember(owner = "client!fd", name = "h", descriptor = "[Lclient!ic;")
	public static Class4_Sub2_Sub3_Sub1[] aClass4_Sub2_Sub3_Sub1Array4;

	@OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
	public static int anInt911;

	@OriginalMember(owner = "client!fd", name = "p", descriptor = "Lclient!qd;")
	public static Class4_Sub2_Sub1_Sub1_Sub1 aClass4_Sub2_Sub1_Sub1_Sub1_1;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4 aClass4_Sub2_Sub3_Sub4_3;

	@OriginalMember(owner = "client!fd", name = "e", descriptor = "Ljava/lang/Object;")
	public static Object anObject3 = new Object();

	@OriginalMember(owner = "client!fd", name = "g", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray5 = new int[4][13][13];

	@OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
	public static int anInt910 = 0;

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!ja;")
	private static Class39 aClass39_468 = Static28.method504(" is already on your ignore list");

	@OriginalMember(owner = "client!fd", name = "j", descriptor = "Lclient!ja;")
	public static Class39 aClass39_462 = aClass39_468;

	@OriginalMember(owner = "client!fd", name = "k", descriptor = "Lclient!ja;")
	public static Class39 aClass39_463 = Static28.method504("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!fd", name = "m", descriptor = "Lclient!ja;")
	public static Class39 aClass39_464 = Static28.method504("Okay");

	@OriginalMember(owner = "client!fd", name = "n", descriptor = "Lclient!ja;")
	private static Class39 aClass39_465 = Static28.method504("Loaded sprites");

	@OriginalMember(owner = "client!fd", name = "o", descriptor = "Lclient!ja;")
	public static Class39 aClass39_466 = Static28.method504("<col=80ff00>");

	@OriginalMember(owner = "client!fd", name = "q", descriptor = "Lclient!ja;")
	public static Class39 aClass39_467 = aClass39_465;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)[Lclient!q;")
	public static Class4_Sub2_Sub3_Sub4[] method594() {
		@Pc(6) Class4_Sub2_Sub3_Sub4[] local6 = new Class4_Sub2_Sub3_Sub4[Static50.anInt1308];
		for (@Pc(8) int local8 = 0; local8 < Static50.anInt1308; local8++) {
			@Pc(17) Class4_Sub2_Sub3_Sub4 local17 = local6[local8] = new Class4_Sub2_Sub3_Sub4();
			local17.anInt2264 = Static9.anInt291;
			local17.anInt2263 = Static15.anInt375;
			local17.anInt2265 = Static51.anIntArray277[local8];
			local17.anInt2262 = Static121.anIntArray320[local8];
			local17.anInt2267 = Static21.anIntArray61[local8];
			local17.anInt2266 = Static16.anIntArray49[local8];
			local17.anIntArray248 = Static114.anIntArray308;
			local17.aByteArray25 = Static70.aByteArrayArray6[local8];
		}
		Static120.method2049();
		return local6;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(IBIII)V")
	public static void method595(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(8) int local8 = 0; local8 < Static87.anInt2227; local8++) {
			if (Static11.anIntArray38[local8] + Static108.anIntArray301[local8] > arg1 && arg1 + arg2 > Static11.anIntArray38[local8] && arg0 < Static30.anIntArray89[local8] + Static94.anIntArray252[local8] && Static30.anIntArray89[local8] < arg0 + arg3) {
				Static113.aBooleanArray16[local8] = true;
			}
		}
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)Lclient!ge;")
	public static Class4_Sub2_Sub7 method596(@OriginalArg(1) int arg0) {
		@Pc(8) Class4_Sub2_Sub7 local8 = (Class4_Sub2_Sub7) Static29.aClass12_20.method235((long) arg0);
		if (local8 != null) {
			return local8;
		}
		@Pc(22) byte[] local22 = Static62.aClass20_Sub1_10.method474(arg0, 0);
		if (local22 == null) {
			return null;
		}
		local8 = new Class4_Sub2_Sub7();
		@Pc(35) Class4_Sub16 local35 = new Class4_Sub16(local22);
		local35.anInt2019 = local35.aByteArray22.length - 12;
		@Pc(44) int local44 = 0;
		@Pc(48) int local48 = local35.method1486();
		local8.anInt1058 = local35.method1490();
		local8.anInt1056 = local35.method1490();
		local8.anInt1057 = local35.method1490();
		local8.anInt1063 = local35.method1490();
		local35.anInt2019 = 0;
		local8.aClass39_604 = local35.method1466();
		local8.anIntArray117 = new int[local48];
		local8.anIntArray116 = new int[local48];
		local8.aClass39Array7 = new Class39[local48];
		while (local35.aByteArray22.length - 12 > local35.anInt2019) {
			@Pc(101) int local101 = local35.method1490();
			if (local101 == 3) {
				local8.aClass39Array7[local44] = local35.method1464();
			} else if (local101 >= 100 || local101 == 21 || local101 == 38 || local101 == 39) {
				local8.anIntArray116[local44] = local35.method1474();
			} else {
				local8.anIntArray116[local44] = local35.method1486();
			}
			local8.anIntArray117[local44++] = local101;
		}
		Static29.aClass12_20.method234(local8, (long) arg0);
		return local8;
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lclient!pd;I)V")
	public static void method597(@OriginalArg(0) Class20 arg0) {
		Static29.aClass20_18 = arg0;
		Static84.anInt2100 = Static29.aClass20_18.method471(16);
	}

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
	public static void method598() {
		aClass4_Sub2_Sub3_Sub1Array4 = null;
		aClass39_466 = null;
		aClass39_467 = null;
		aClass39_463 = null;
		aClass4_Sub2_Sub1_Sub1_Sub1_1 = null;
		aClass4_Sub2_Sub3_Sub4_3 = null;
		aClass39_464 = null;
		aClass39_468 = null;
		aClass39_465 = null;
		aClass39_462 = null;
		anIntArrayArrayArray5 = null;
		anObject3 = null;
	}
}
