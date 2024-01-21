import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "Lclient!ea;")
	public static Class18 aClass18_6;

	@OriginalMember(owner = "client!nf", name = "g", descriptor = "Lclient!ne;")
	public static Class1_Sub1_Sub1_Sub2_Sub1 aClass1_Sub1_Sub1_Sub2_Sub1_4;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "Lclient!u;")
	public static Class76 aClass76_94;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Lclient!u;")
	public static Class76 aClass76_95;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "[S")
	public static short[] aShortArray26 = new short[] { 960, 957, -21568, -21571, 22464 };

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1071 = Static49.method1293("Freie Welt");

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1072 = Static49.method1293("Hidden)2use");

	@OriginalMember(owner = "client!nf", name = "h", descriptor = "Lclient!rf;")
	public static Class70 aClass70_1073 = Static49.method1293("Lade Texturen )2 ");

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V")
	public static void method2400() {
		@Pc(5) int local5 = Static149.anInt3997 * 128 + 64;
		@Pc(15) int local15 = Static16.anInt467 * 128 + 64;
		@Pc(23) int local23 = Static156.method3142(local5, Static56.anInt1784, local15) - Static176.anInt4472;
		if (local23 > Static33.anInt1073) {
			Static33.anInt1073 += Static109.anInt3068 * (local23 - Static33.anInt1073) / 1000 + Static61.anInt1947;
			if (Static33.anInt1073 > local23) {
				Static33.anInt1073 = local23;
			}
		}
		if (Static33.anInt1073 > local23) {
			Static33.anInt1073 -= (Static33.anInt1073 - local23) * Static109.anInt3068 / 1000 + Static61.anInt1947;
			if (Static33.anInt1073 < local23) {
				Static33.anInt1073 = local23;
			}
		}
		if (local15 > Static83.anInt4536) {
			Static83.anInt4536 += (local15 - Static83.anInt4536) * Static109.anInt3068 / 1000 + Static61.anInt1947;
			if (local15 < Static83.anInt4536) {
				Static83.anInt4536 = local15;
			}
		}
		if (local5 > Static79.anInt2448) {
			Static79.anInt2448 += Static109.anInt3068 * (local5 - Static79.anInt2448) / 1000 + Static61.anInt1947;
			if (Static79.anInt2448 > local5) {
				Static79.anInt2448 = local5;
			}
		}
		if (local15 < Static83.anInt4536) {
			Static83.anInt4536 -= Static109.anInt3068 * (Static83.anInt4536 - local15) / 1000 + Static61.anInt1947;
			if (local15 > Static83.anInt4536) {
				Static83.anInt4536 = local15;
			}
		}
		if (local5 < Static79.anInt2448) {
			Static79.anInt2448 -= (Static79.anInt2448 - local5) * Static109.anInt3068 / 1000 + Static61.anInt1947;
			if (local5 > Static79.anInt2448) {
				Static79.anInt2448 = local5;
			}
		}
		local15 = Static161.anInt4211 * 128 + 64;
		local5 = Static179.anInt4503 * 128 + 64;
		local23 = Static156.method3142(local5, Static56.anInt1784, local15) - Static42.anInt1421;
		@Pc(204) int local204 = local23 - Static33.anInt1073;
		@Pc(208) int local208 = local15 - Static83.anInt4536;
		@Pc(212) int local212 = local5 - Static79.anInt2448;
		@Pc(223) int local223 = (int) Math.sqrt((double) (local208 * local208 + local212 * local212));
		@Pc(234) int local234 = (int) (Math.atan2((double) local204, (double) local223) * 325.949D) & 0x7FF;
		if (local234 < 128) {
			local234 = 128;
		}
		if (local234 > 383) {
			local234 = 383;
		}
		@Pc(255) int local255 = (int) (Math.atan2((double) local212, (double) local208) * -325.949D) & 0x7FF;
		@Pc(260) int local260 = local255 - Static60.anInt1934;
		if (local234 > Static42.anInt1424) {
			Static42.anInt1424 += Static126.anInt818 + (local234 - Static42.anInt1424) * Static42.anInt1425 / 1000;
			if (Static42.anInt1424 > local234) {
				Static42.anInt1424 = local234;
			}
		}
		if (local260 > 1024) {
			local260 -= 2048;
		}
		if (local234 < Static42.anInt1424) {
			Static42.anInt1424 -= (Static42.anInt1424 - local234) * Static42.anInt1425 / 1000 + Static126.anInt818;
			if (local234 > Static42.anInt1424) {
				Static42.anInt1424 = local234;
			}
		}
		if (local260 < -1024) {
			local260 += 2048;
		}
		if (local260 > 0) {
			Static60.anInt1934 += Static126.anInt818 + Static42.anInt1425 * local260 / 1000;
			Static60.anInt1934 &= 0x7FF;
		}
		if (local260 < 0) {
			Static60.anInt1934 -= Static126.anInt818 + -local260 * Static42.anInt1425 / 1000;
			Static60.anInt1934 &= 0x7FF;
		}
		@Pc(363) int local363 = local255 - Static60.anInt1934;
		if (local363 > 1024) {
			local363 -= 2048;
		}
		if (local363 < -1024) {
			local363 += 2048;
		}
		if (local363 < 0 && local260 > 0 || local363 > 0 && local260 < 0) {
			Static60.anInt1934 = local255;
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V")
	public static void method2401(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static94.aBoolean108 = true;
		Static148.anInt3884 = arg0;
		Static105.anInt2981 = arg1;
		Static171.anInt4439 = arg2;
		Static90.anInt2640 = -1;
		Static85.anInt2551 = -1;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
	public static void method2402() {
		aClass70_1072 = null;
		aClass70_1073 = null;
		aClass1_Sub1_Sub1_Sub2_Sub1_4 = null;
		aClass76_94 = null;
		aShortArray26 = null;
		aClass18_6 = null;
		aClass76_95 = null;
		aClass70_1071 = null;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V")
	public static void method2403() {
		Static154.aClass4_15 = new Class4();
	}
}
