import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static2 {

	@OriginalMember(owner = "client!aa", name = "eb", descriptor = "Lclient!rb;")
	public static Class55 aClass55_36;

	@OriginalMember(owner = "client!aa", name = "ob", descriptor = "Lclient!he;")
	public static Class1_Sub1_Sub6_Sub2 aClass1_Sub1_Sub6_Sub2_13;

	@OriginalMember(owner = "client!aa", name = "vb", descriptor = "I")
	public static int anInt2293;

	@OriginalMember(owner = "client!aa", name = "wb", descriptor = "Lclient!oc;")
	public static Class34 aClass34_63;

	@OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
	public static int anInt2279 = -1;

	@OriginalMember(owner = "client!aa", name = "hb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1288 = Static15.method178("Try again in 60 secs)3)3)3");

	@OriginalMember(owner = "client!aa", name = "ab", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1286 = aClass23_1288;

	@OriginalMember(owner = "client!aa", name = "gb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1287 = Static15.method178("Spiel)2Engine wird gestartet)3)3)3");

	@OriginalMember(owner = "client!aa", name = "pb", descriptor = "I")
	public static int anInt2290 = 0;

	@OriginalMember(owner = "client!aa", name = "qb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1289 = Static15.method178("Die Verbindung konnte");

	@OriginalMember(owner = "client!aa", name = "rb", descriptor = "Lclient!ba;")
	public static Class5 aClass5_49 = new Class5(100);

	@OriginalMember(owner = "client!aa", name = "sb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1290 = Static15.method178("blinken1:");

	@OriginalMember(owner = "client!aa", name = "tb", descriptor = "I")
	public static int anInt2291 = 0;

	@OriginalMember(owner = "client!aa", name = "ub", descriptor = "I")
	public static int anInt2292 = 0;

	@OriginalMember(owner = "client!aa", name = "xb", descriptor = "Lclient!gd;")
	private static Class23 aClass23_1291 = Static15.method178("Your account has been disabled)3");

	@OriginalMember(owner = "client!aa", name = "yb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1292 = aClass23_1291;

	@OriginalMember(owner = "client!aa", name = "zb", descriptor = "Lclient!gd;")
	public static Class23 aClass23_1293 = Static15.method178("(X100(U(Y");

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)V")
	public static void method1414(@OriginalArg(1) int arg0) {
		if (!Static77.method1346(arg0)) {
			return;
		}
		@Pc(14) Class1_Sub1_Sub7[] local14 = Static105.aClass1_Sub1_Sub7ArrayArray1[arg0];
		for (@Pc(25) int local25 = 0; local25 < local14.length; local25++) {
			@Pc(30) Class1_Sub1_Sub7 local30 = local14[local25];
			if (local30 != null) {
				local30.anInt825 = 0;
				local30.anInt841 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)V")
	public static void method1416() {
		Static31.aClass5_26.method99();
	}

	@OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
	public static void method1417() {
		Static108.aByteArrayArrayArray7 = new byte[4][104][104];
		Static98.anIntArray345 = new int[104];
		Static89.anIntArray320 = new int[104];
		Static21.aByteArrayArrayArray2 = new byte[4][104][104];
		Static20.aByteArrayArrayArray1 = new byte[4][105][105];
		Static109.aByteArrayArrayArray8 = new byte[4][104][104];
		Static45.anIntArrayArrayArray4 = new int[4][105][105];
		Static8.anIntArray37 = new int[104];
		Static10.anIntArray41 = new int[104];
		Static61.aByteArrayArrayArray3 = new byte[4][104][104];
		Static51.anIntArrayArray33 = new int[105][105];
		Static28.anIntArray265 = new int[104];
		Static80.anInt2258 = 99;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(BIIII)V")
	public static void method1419(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(12) Class1_Sub12 local12 = (Class1_Sub12) Static114.aClass45_10.method1299(); local12 != null; local12 = (Class1_Sub12) Static114.aClass45_10.method1288()) {
			if (local12.anInt2345 != -1 || local12.anIntArray314 != null) {
				@Pc(22) int local22 = 0;
				if (arg0 > local12.anInt2349) {
					local22 = arg0 - local12.anInt2349;
				} else if (arg0 < local12.anInt2339) {
					local22 = local12.anInt2339 - arg0;
				}
				if (arg3 > local12.anInt2341) {
					local22 += arg3 - local12.anInt2341;
				} else if (local12.anInt2348 > arg3) {
					local22 += local12.anInt2348 - arg3;
				}
				if (local22 - 64 > local12.anInt2346 || Static104.anInt2679 == 0 || local12.anInt2350 != arg2) {
					if (local12.aClass1_Sub4_Sub2_2 != null) {
						Static15.aClass1_Sub4_Sub1_1.method370(local12.aClass1_Sub4_Sub2_2);
						local12.aClass1_Sub4_Sub2_2 = null;
					}
					if (local12.aClass1_Sub4_Sub2_1 != null) {
						Static15.aClass1_Sub4_Sub1_1.method370(local12.aClass1_Sub4_Sub2_1);
						local12.aClass1_Sub4_Sub2_1 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(146) int local146 = (local12.anInt2346 - local22) * Static104.anInt2679 / local12.anInt2346;
					if (local12.aClass1_Sub4_Sub2_2 != null) {
						local12.aClass1_Sub4_Sub2_2.method937(local146);
					} else if (local12.anInt2345 >= 0) {
						@Pc(166) Class39 local166 = Static122.method1233(Static33.aClass55_Sub1_4, local12.anInt2345);
						if (local166 != null) {
							@Pc(173) Class1_Sub9_Sub1 local173 = local166.method1232().method1670(Static73.aClass26_1);
							@Pc(178) Class1_Sub4_Sub2 local178 = Static120.method938(local173, local146);
							local178.method932(-1);
							Static15.aClass1_Sub4_Sub1_1.method371(local178);
							local12.aClass1_Sub4_Sub2_2 = local178;
						}
					}
					if (local12.aClass1_Sub4_Sub2_1 != null) {
						local12.aClass1_Sub4_Sub2_1.method937(local146);
						if (!local12.aClass1_Sub4_Sub2_1.method934()) {
							local12.aClass1_Sub4_Sub2_1 = null;
						}
					} else if (local12.anIntArray314 != null && (local12.anInt2342 -= arg1) <= 0) {
						@Pc(209) int local209 = (int) (Math.random() * (double) local12.anIntArray314.length);
						@Pc(217) Class39 local217 = Static122.method1233(Static33.aClass55_Sub1_4, local12.anIntArray314[local209]);
						if (local217 != null) {
							@Pc(224) Class1_Sub9_Sub1 local224 = local217.method1232().method1670(Static73.aClass26_1);
							@Pc(229) Class1_Sub4_Sub2 local229 = Static120.method938(local224, local146);
							local229.method932(0);
							Static15.aClass1_Sub4_Sub1_1.method371(local229);
							local12.aClass1_Sub4_Sub2_1 = local229;
							local12.anInt2342 = local12.anInt2335 + (int) ((double) (local12.anInt2337 - local12.anInt2335) * Math.random());
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!aa", name = "f", descriptor = "(I)V")
	public static void method1420() {
		aClass23_1286 = null;
		aClass23_1290 = null;
		aClass23_1288 = null;
		aClass1_Sub1_Sub6_Sub2_13 = null;
		aClass23_1289 = null;
		aClass55_36 = null;
		Class1_Sub1_Sub2.anIntArray272 = null;
		aClass23_1291 = null;
		aClass23_1292 = null;
		aClass23_1293 = null;
		aClass23_1287 = null;
		aClass5_49 = null;
		aClass34_63 = null;
	}

	@OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)Lclient!me;")
	public static Class1_Sub1_Sub10 method1421(@OriginalArg(1) int arg0) {
		@Pc(6) Class1_Sub1_Sub10 local6 = (Class1_Sub1_Sub10) Static44.aClass5_37.method98((long) arg0);
		if (local6 != null) {
			return local6;
		}
		@Pc(25) byte[] local25 = Static70.aClass55_27.method1867(arg0, 5);
		local6 = new Class1_Sub1_Sub10();
		if (local25 != null) {
			local6.method1228(new Class1_Sub5(local25));
		}
		Static44.aClass5_37.method97(local6, (long) arg0);
		return local6;
	}
}
