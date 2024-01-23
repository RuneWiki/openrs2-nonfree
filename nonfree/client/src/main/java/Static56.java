import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "Lclient!vb;")
	public static Class7_Sub1 aClass7_Sub1_9;

	@OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
	public static int anInt1481;

	@OriginalMember(owner = "client!fe", name = "l", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "J")
	public static long aLong44 = 0L;

	@OriginalMember(owner = "client!fe", name = "f", descriptor = "Lclient!kh;")
	private static Class60 aClass60_451 = Static200.method3116("Loading )2 please wait)3");

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "Lclient!kh;")
	public static Class60 aClass60_449 = aClass60_451;

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "Lclient!kh;")
	private static Class60 aClass60_450 = Static200.method3116("This computers address has been blocked");

	@OriginalMember(owner = "client!fe", name = "g", descriptor = "Lclient!kh;")
	public static Class60 aClass60_452 = Static200.method3116("null");

	@OriginalMember(owner = "client!fe", name = "j", descriptor = "Z")
	public static boolean aBoolean74 = false;

	@OriginalMember(owner = "client!fe", name = "k", descriptor = "I")
	public static int anInt1482 = 0;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "I")
	public static int anInt1484 = 0;

	@OriginalMember(owner = "client!fe", name = "q", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!fe", name = "r", descriptor = "I")
	public static int anInt1486 = 0;

	@OriginalMember(owner = "client!fe", name = "t", descriptor = "Lclient!kh;")
	public static Class60 aClass60_453 = aClass60_450;

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!ba;IIIIIIIZ)V")
	public static void method1060(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		@Pc(6) int local6;
		@Pc(7) int local7 = local6 = (arg6 << 7) - Static201.anInt4280;
		@Pc(14) int local14;
		@Pc(15) int local15 = local14 = (arg7 << 7) - Static155.anInt3455;
		@Pc(20) int local20;
		@Pc(21) int local21 = local20 = local7 + 128;
		@Pc(26) int local26;
		@Pc(27) int local27 = local26 = local15 + 128;
		@Pc(37) int local37 = Static138.anIntArrayArrayArray17[arg1][arg6][arg7] - Static105.anInt2387;
		@Pc(49) int local49 = Static138.anIntArrayArrayArray17[arg1][arg6 + 1][arg7] - Static105.anInt2387;
		@Pc(63) int local63 = Static138.anIntArrayArrayArray17[arg1][arg6 + 1][arg7 + 1] - Static105.anInt2387;
		@Pc(75) int local75 = Static138.anIntArrayArrayArray17[arg1][arg6][arg7 + 1] - Static105.anInt2387;
		@Pc(85) int local85 = local15 * arg4 + local7 * arg5 >> 16;
		@Pc(95) int local95 = local15 * arg5 - local7 * arg4 >> 16;
		@Pc(97) int local97 = local85;
		@Pc(107) int local107 = local37 * arg3 - local95 * arg2 >> 16;
		@Pc(117) int local117 = local37 * arg2 + local95 * arg3 >> 16;
		@Pc(119) int local119 = local107;
		if (local117 < 50) {
			return;
		}
		local85 = local14 * arg4 + local21 * arg5 >> 16;
		@Pc(143) int local143 = local14 * arg5 - local21 * arg4 >> 16;
		local21 = local85;
		local85 = local49 * arg3 - local143 * arg2 >> 16;
		@Pc(165) int local165 = local49 * arg2 + local143 * arg3 >> 16;
		local49 = local85;
		if (local165 < 50) {
			return;
		}
		local85 = local27 * arg4 + local20 * arg5 >> 16;
		local27 = local27 * arg5 - local20 * arg4 >> 16;
		@Pc(193) int local193 = local85;
		local85 = local63 * arg3 - local27 * arg2 >> 16;
		local27 = local63 * arg2 + local27 * arg3 >> 16;
		local63 = local85;
		if (local27 < 50) {
			return;
		}
		local85 = local26 * arg4 + local6 * arg5 >> 16;
		@Pc(239) int local239 = local26 * arg5 - local6 * arg4 >> 16;
		@Pc(241) int local241 = local85;
		local85 = local75 * arg3 - local239 * arg2 >> 16;
		@Pc(261) int local261 = local75 * arg2 + local239 * arg3 >> 16;
		if (local261 < 50) {
			return;
		}
		@Pc(275) int local275 = Static81.anInt1940 + (local97 << 9) / local117;
		@Pc(283) int local283 = Static81.anInt1941 + (local119 << 9) / local117;
		@Pc(291) int local291 = Static81.anInt1940 + (local21 << 9) / local165;
		@Pc(299) int local299 = Static81.anInt1941 + (local49 << 9) / local165;
		@Pc(307) int local307 = Static81.anInt1940 + (local193 << 9) / local27;
		@Pc(315) int local315 = Static81.anInt1941 + (local63 << 9) / local27;
		@Pc(323) int local323 = Static81.anInt1940 + (local241 << 9) / local261;
		@Pc(331) int local331 = Static81.anInt1941 + (local85 << 9) / local261;
		Static81.anInt1939 = 0;
		@Pc(473) int local473;
		if ((local307 - local323) * (local299 - local331) - (local315 - local331) * (local291 - local323) > 0) {
			if (Static71.aBoolean92 && Static100.method1742(Static24.anInt573 + Static81.anInt1940, Static86.anInt1997 + Static81.anInt1941, local315, local331, local299, local307, local323, local291)) {
				Static2.anInt67 = arg6;
				Static194.anInt4139 = arg7;
			}
			if (!arg8) {
				Static81.aBoolean103 = false;
				if (local307 < 0 || local323 < 0 || local291 < 0 || local307 > Static81.anInt1937 || local323 > Static81.anInt1937 || local291 > Static81.anInt1937) {
					Static81.aBoolean103 = true;
				}
				if (arg0.anInt351 == -1) {
					if (arg0.anInt347 != 12345678) {
						Static81.method1447(local315, local331, local299, local307, local323, local291, arg0.anInt347, arg0.anInt345, arg0.anInt348);
					}
				} else if (Static23.aBoolean144) {
					local473 = Static81.anInterface1_1.method1250(arg0.anInt351);
					Static81.method1447(local315, local331, local299, local307, local323, local291, Static140.method2405(local473, arg0.anInt347), Static140.method2405(local473, arg0.anInt345), Static140.method2405(local473, arg0.anInt348));
				} else if (arg0.aBoolean28) {
					Static81.method1443(local315, local331, local299, local307, local323, local291, arg0.anInt347, arg0.anInt345, arg0.anInt348, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt351);
				} else {
					Static81.method1443(local315, local331, local299, local307, local323, local291, arg0.anInt347, arg0.anInt345, arg0.anInt348, local193, local241, local21, local63, local85, local49, local27, local261, local165, arg0.anInt351);
				}
			}
		}
		if ((local275 - local291) * (local331 - local299) - (local283 - local299) * (local323 - local291) <= 0) {
			return;
		}
		if (Static71.aBoolean92 && Static100.method1742(Static24.anInt573 + Static81.anInt1940, Static86.anInt1997 + Static81.anInt1941, local283, local299, local331, local275, local291, local323)) {
			Static2.anInt67 = arg6;
			Static194.anInt4139 = arg7;
		}
		if (arg8) {
			return;
		}
		Static81.aBoolean103 = false;
		if (local275 < 0 || local291 < 0 || local323 < 0 || local275 > Static81.anInt1937 || local291 > Static81.anInt1937 || local323 > Static81.anInt1937) {
			Static81.aBoolean103 = true;
		}
		if (arg0.anInt351 != -1) {
			if (!Static23.aBoolean144) {
				Static81.method1443(local283, local299, local331, local275, local291, local323, arg0.anInt343, arg0.anInt348, arg0.anInt345, local97, local21, local241, local119, local49, local85, local117, local165, local261, arg0.anInt351);
				return;
			}
			local473 = Static81.anInterface1_1.method1250(arg0.anInt351);
			Static81.method1447(local283, local299, local331, local275, local291, local323, Static140.method2405(local473, arg0.anInt343), Static140.method2405(local473, arg0.anInt348), Static140.method2405(local473, arg0.anInt345));
		} else if (arg0.anInt343 != 12345678) {
			Static81.method1447(local283, local299, local331, local275, local291, local323, arg0.anInt343, arg0.anInt348, arg0.anInt345);
			return;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IJLclient!kh;ISILclient!kh;)V")
	public static void method1061(@OriginalArg(1) long arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) short arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class60 arg5) {
		if (Static162.aBoolean261 || Static91.anInt2134 >= 500) {
			return;
		}
		Static23.aClass60Array17[Static91.anInt2134] = arg1;
		Static52.aClass60Array8[Static91.anInt2134] = arg5;
		Static171.aShortArray50[Static91.anInt2134] = arg3;
		Static77.aLongArray4[Static91.anInt2134] = arg0;
		Static203.anIntArray563[Static91.anInt2134] = arg4;
		Static38.anIntArray129[Static91.anInt2134] = arg2;
		Static91.anInt2134++;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I")
	public static int method1064(@OriginalArg(0) KeyEvent arg0) {
		@Pc(6) int local6 = arg0.getKeyChar();
		if (local6 == 8364) {
			return 128;
		} else {
			if (local6 <= 0 || local6 >= 256) {
				local6 = -1;
			}
			return local6;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILclient!ai;Lclient!ai;)V")
	public static void method1065(@OriginalArg(1) Class7 arg0, @OriginalArg(2) Class7 arg1) {
		Static30.aClass7_8 = arg1;
		Static159.aClass7_33 = arg0;
	}
}
