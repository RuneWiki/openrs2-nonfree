import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!qb", name = "Ab", descriptor = "Lclient!dh;")
	public static Class1_Sub1_Sub5 aClass1_Sub1_Sub5_1;

	@OriginalMember(owner = "client!qb", name = "Bb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray1;

	@OriginalMember(owner = "client!qb", name = "W", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1236 = Static49.method1293("Benutzen Sie bitte eine andere Welt)3");

	@OriginalMember(owner = "client!qb", name = "pb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_1238 = Static49.method1293("Connection timed out)3");

	@OriginalMember(owner = "client!qb", name = "mb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1237 = aClass70_1238;

	@OriginalMember(owner = "client!qb", name = "qb", descriptor = "Lclient!ge;")
	public static Class30 aClass30_13 = new Class30(4096);

	@OriginalMember(owner = "client!qb", name = "ub", descriptor = "I")
	public static int anInt3674 = 0;

	@OriginalMember(owner = "client!qb", name = "vb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1239 = Static49.method1293("null");

	@OriginalMember(owner = "client!qb", name = "wb", descriptor = "I")
	public static int anInt3675 = 0;

	@OriginalMember(owner = "client!qb", name = "xb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1240 = Static49.method1293("Spieler");

	@OriginalMember(owner = "client!qb", name = "yb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1241 = Static49.method1293(" (X");

	@OriginalMember(owner = "client!qb", name = "zb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1242 = Static49.method1293(":");

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(I)V")
	public static void method2726() {
		while (true) {
			if (Static98.aClass1_Sub9_Sub1_2.method1289(Static69.anInt2127) >= 27) {
				@Pc(16) int local16 = Static98.aClass1_Sub9_Sub1_2.method1288(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local16] == null) {
						Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local16] = new Class1_Sub1_Sub4_Sub2_Sub2();
						local23 = true;
					}
					@Pc(39) Class1_Sub1_Sub4_Sub2_Sub2 local39 = Static165.aClass1_Sub1_Sub4_Sub2_Sub2Array1[local16];
					Static152.anIntArray208[Static86.anInt2582++] = local16;
					local39.anInt2026 = Static47.anInt1654;
					@Pc(55) int local55 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
					if (local55 == 1) {
						Static48.anIntArray167[Static161.anInt4212++] = local16;
					}
					@Pc(71) int local71 = Static98.aClass1_Sub9_Sub1_2.method1288(5);
					local39.aClass1_Sub1_Sub13_1 = Static41.method1031(Static98.aClass1_Sub9_Sub1_2.method1288(14));
					@Pc(88) int local88 = Static54.anIntArray177[Static98.aClass1_Sub9_Sub1_2.method1288(3)];
					if (local23) {
						local39.anInt2047 = local39.anInt2040 = local88;
					}
					@Pc(103) int local103 = Static98.aClass1_Sub9_Sub1_2.method1288(1);
					if (local71 > 15) {
						local71 -= 32;
					}
					@Pc(112) int local112 = Static98.aClass1_Sub9_Sub1_2.method1288(5);
					local39.anInt2003 = local39.aClass1_Sub1_Sub13_1.anInt3239;
					local39.anInt2034 = local39.aClass1_Sub1_Sub13_1.anInt3237;
					local39.anInt2032 = local39.aClass1_Sub1_Sub13_1.anInt3247;
					local39.anInt2031 = local39.aClass1_Sub1_Sub13_1.anInt3253;
					if (local39.anInt2031 == 0) {
						local39.anInt2040 = 0;
					}
					local39.anInt2022 = local39.aClass1_Sub1_Sub13_1.anInt3248;
					local39.anInt2038 = local39.aClass1_Sub1_Sub13_1.anInt3235;
					local39.anInt2043 = local39.aClass1_Sub1_Sub13_1.anInt3244;
					if (local112 > 15) {
						local112 -= 32;
					}
					local39.anInt2004 = local39.aClass1_Sub1_Sub13_1.anInt3234;
					local39.anInt2024 = local39.aClass1_Sub1_Sub13_1.anInt3241;
					local39.method1514(local112 + Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray199[0], local71 + Static52.aClass1_Sub1_Sub4_Sub2_Sub1_1.anIntArray197[0], local103 == 1);
					continue;
				}
			}
			Static98.aClass1_Sub9_Sub1_2.method1291();
			return;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BIIIIIIII)V")
	public static void method2728(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static106.method2213(arg7)) {
			Static124.aClass39Array2 = null;
			Static66.method1540(arg1, arg0, arg3, Static77.aClass39ArrayArray1[arg7], arg5, arg2, arg6, arg4, -1);
			if (Static124.aClass39Array2 != null) {
				Static66.method1540(arg1, arg0, arg3, Static124.aClass39Array2, Static85.anInt2549, Static95.anInt2754, arg6, arg4, -1412584499);
				Static124.aClass39Array2 = null;
			}
		} else if (arg6 == -1) {
			for (@Pc(20) int local20 = 0; local20 < 100; local20++) {
				Static161.aBooleanArray18[local20] = true;
			}
		} else {
			Static161.aBooleanArray18[arg6] = true;
		}
	}

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "(B)V")
	public static void method2730() {
		aClass70_1240 = null;
		aClass70_1237 = null;
		aClass70_1238 = null;
		aBooleanArrayArray1 = null;
		aClass70_1236 = null;
		aClass70_1242 = null;
		aClass70_1239 = null;
		aClass70_1241 = null;
		aClass1_Sub1_Sub5_1 = null;
		aClass30_13 = null;
	}

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "(B)V")
	public static void method2731() {
		@Pc(5) Object local5 = Static39.anObject1;
		synchronized (Static39.anObject1) {
			if (Static98.anInt2845 != 0) {
				Static98.anInt2845 = 1;
				try {
					Static39.anObject1.wait();
				} catch (@Pc(15) InterruptedException local15) {
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "([BB)[B")
	public static byte[] method2732(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static188.method2304(arg0, 0, local9, 0, local6);
		return local9;
	}
}
