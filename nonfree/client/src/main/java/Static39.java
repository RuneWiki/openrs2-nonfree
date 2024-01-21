import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public static int anInt957;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "Lclient!h;")
	public static Class4_Sub1_Sub2_Sub2 aClass4_Sub1_Sub2_Sub2_5;

	@OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
	public static int anInt974;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!ja;")
	public static Class33 aClass33_15 = new Class33(20);

	@OriginalMember(owner = "client!gb", name = "t", descriptor = "I")
	public static int anInt971 = 0;

	@OriginalMember(owner = "client!gb", name = "v", descriptor = "I")
	public static int anInt973 = 0;

	@OriginalMember(owner = "client!gb", name = "w", descriptor = "[Z")
	public static boolean[] aBooleanArray4 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false };

	@OriginalMember(owner = "client!gb", name = "x", descriptor = "Lclient!ec;")
	public static Class22 aClass22_271 = Static60.method1113("<col=ff7000>");

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "[I")
	public static int[] anIntArray112 = new int[] { 0, 0, -2, 0, -2, 6, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 5, 2, 0, 0, 0, 0, 3, -2, 0, 0, -2, 0, 8, 2, 0, -2, -2, 0, 0, 3, 11, 0, 0, 0, 0, -2, 0, 0, 0, 6, 0, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 3, -2, 0, 6, -1, 0, 0, 0, 0, 15, 0, 0, 0, 0, 0, 0, -2, 0, 0, 10, 0, -1, 0, 0, 0, 0, 5, 0, 0, 0, 7, 0, 4, -2, 0, 2, 0, 1, 7, 5, 0, 0, 2, 0, 0, 0, 24, 6, 0, 1, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 2, 7, 0, 0, 0, 6, 0, 0, 0, 0, 4, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 12, 0, 0, 14, 0, 0, 0, 0, -2, 0, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0, 1, 0, 0, 0, 3, 0, 0, 0, 0, 0, 2, 6, 6, 6, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -2, 0, 0, 0, 0, 0, 0, -2, 6, 0, 0, 0, 0, 4, -1, 8, 0, 0, 0, 0, 6, 0, 0, 4, 0, 0, 0, 0, 0, 0, 4, 0 };

	@OriginalMember(owner = "client!gb", name = "C", descriptor = "Lclient!ec;")
	private static Class22 aClass22_274 = Static60.method1113("glow1:");

	@OriginalMember(owner = "client!gb", name = "A", descriptor = "Lclient!ec;")
	public static Class22 aClass22_272 = aClass22_274;

	@OriginalMember(owner = "client!gb", name = "B", descriptor = "Lclient!ec;")
	public static Class22 aClass22_273 = aClass22_274;

	@OriginalMember(owner = "client!gb", name = "D", descriptor = "Lclient!wd;")
	public static Class82 aClass82_4 = new Class82();

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "Lclient!ec;")
	public static Class22 aClass22_275 = Static60.method1113("lila:");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V")
	public static void method622(@OriginalArg(1) int arg0) {
		@Pc(15) Class4_Sub19 local15 = (Class4_Sub19) Static30.aClass81_4.method2010((long) arg0);
		if (local15 != null) {
			local15.method1999();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIIII)V")
	public static void method623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) Class4_Sub18 local10 = (Class4_Sub18) Static52.aClass82_5.method2025(); local10 != null; local10 = (Class4_Sub18) Static52.aClass82_5.method2023()) {
			if (local10.anInt2202 != -1 || local10.anIntArray222 != null) {
				@Pc(22) int local22 = 0;
				if (arg1 > local10.anInt2192) {
					local22 = arg1 - local10.anInt2192;
				} else if (arg1 < local10.anInt2193) {
					local22 = local10.anInt2193 - arg1;
				}
				if (local10.anInt2189 < arg0) {
					local22 += arg0 - local10.anInt2189;
				} else if (local10.anInt2203 > arg0) {
					local22 += local10.anInt2203 - arg0;
				}
				if (local10.anInt2195 < local22 - 64 || Static95.anInt1927 == 0 || arg3 != local10.anInt2191) {
					if (local10.aClass4_Sub4_Sub3_2 != null) {
						Static32.aClass4_Sub4_Sub4_1.method1642(local10.aClass4_Sub4_Sub3_2);
						local10.aClass4_Sub4_Sub3_2 = null;
					}
					if (local10.aClass4_Sub4_Sub3_3 != null) {
						Static32.aClass4_Sub4_Sub4_1.method1642(local10.aClass4_Sub4_Sub3_3);
						local10.aClass4_Sub4_Sub3_3 = null;
					}
				} else {
					local22 -= 64;
					if (local22 < 0) {
						local22 = 0;
					}
					@Pc(142) int local142 = (local10.anInt2195 - local22) * Static95.anInt1927 / local10.anInt2195;
					if (local10.aClass4_Sub4_Sub3_2 != null) {
						local10.aClass4_Sub4_Sub3_2.method1238(local142);
					} else if (local10.anInt2202 >= 0) {
						@Pc(160) Class65 local160 = Static141.method1716(Static1.aClass20_Sub1_1, local10.anInt2202, 0);
						if (local160 != null) {
							@Pc(167) Class4_Sub13_Sub1 local167 = local160.method1715().method935(Static108.aClass23_1);
							@Pc(172) Class4_Sub4_Sub3 local172 = Static140.method1234(local167, local142);
							local172.method1232(-1);
							Static32.aClass4_Sub4_Sub4_1.method1647(local172);
							local10.aClass4_Sub4_Sub3_2 = local172;
						}
					}
					if (local10.aClass4_Sub4_Sub3_3 != null) {
						local10.aClass4_Sub4_Sub3_3.method1238(local142);
						if (!local10.aClass4_Sub4_Sub3_3.method2002()) {
							local10.aClass4_Sub4_Sub3_3 = null;
						}
					} else if (local10.anIntArray222 != null && (local10.anInt2199 -= arg2) <= 0) {
						@Pc(203) int local203 = (int) (Math.random() * (double) local10.anIntArray222.length);
						@Pc(211) Class65 local211 = Static141.method1716(Static1.aClass20_Sub1_1, local10.anIntArray222[local203], 0);
						if (local211 != null) {
							@Pc(218) Class4_Sub13_Sub1 local218 = local211.method1715().method935(Static108.aClass23_1);
							@Pc(223) Class4_Sub4_Sub3 local223 = Static140.method1234(local218, local142);
							local223.method1232(0);
							Static32.aClass4_Sub4_Sub4_1.method1647(local223);
							local10.anInt2199 = (int) (Math.random() * (double) (local10.anInt2190 - local10.anInt2188)) + local10.anInt2188;
							local10.aClass4_Sub4_Sub3_3 = local223;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
	public static Class method624(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public static void method625() {
		anIntArray112 = null;
		aClass22_273 = null;
		aClass22_275 = null;
		aClass4_Sub1_Sub2_Sub2_5 = null;
		aClass22_272 = null;
		aClass82_4 = null;
		aClass22_274 = null;
		aClass22_271 = null;
		aBooleanArray4 = null;
		aClass33_15 = null;
	}
}
