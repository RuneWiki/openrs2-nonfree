import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!od", name = "S", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray84;

	@OriginalMember(owner = "client!od", name = "Z", descriptor = "Lclient!sd;")
	public static Class60 aClass60_26;

	@OriginalMember(owner = "client!od", name = "R", descriptor = "[I")
	public static final int[] anIntArray372 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

	@OriginalMember(owner = "client!od", name = "T", descriptor = "I")
	public static int anInt3260 = 1;

	@OriginalMember(owner = "client!od", name = "V", descriptor = "I")
	public static int anInt3262 = 0;

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "Lclient!v;")
	public static final Class91 aClass91_13 = new Class91();

	@OriginalMember(owner = "client!od", name = "ab", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1815 = Static118.method2249("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1816 = Static118.method2249("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ba;)V")
	public static void method2502(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static96.anInt2403 != 1) {
			return;
		}
		if (Static2.anInt67 >= 280 && Static2.anInt67 <= 294 && Static182.anInt4065 >= 4 && Static182.anInt4065 <= 18) {
			Static183.method2977(0, 0);
			return;
		}
		if (Static2.anInt67 >= 295 && Static2.anInt67 <= 360 && Static182.anInt4065 >= 4 && Static182.anInt4065 <= 18) {
			Static183.method2977(1, 0);
			return;
		}
		if (Static2.anInt67 >= 390 && Static2.anInt67 <= 404 && Static182.anInt4065 >= 4 && Static182.anInt4065 <= 18) {
			Static183.method2977(0, 1);
			return;
		}
		if (Static2.anInt67 >= 405 && Static2.anInt67 <= 470 && Static182.anInt4065 >= 4 && Static182.anInt4065 <= 18) {
			Static183.method2977(1, 1);
			return;
		}
		if (Static2.anInt67 >= 500 && Static2.anInt67 <= 514 && Static182.anInt4065 >= 4 && Static182.anInt4065 <= 18) {
			Static183.method2977(0, 2);
			return;
		}
		if (Static2.anInt67 >= 515 && Static2.anInt67 <= 580 && Static182.anInt4065 >= 4 && Static182.anInt4065 <= 18) {
			Static183.method2977(1, 2);
			return;
		}
		if (Static2.anInt67 >= 610 && Static2.anInt67 <= 624 && Static182.anInt4065 >= 4 && Static182.anInt4065 <= 18) {
			Static183.method2977(0, 3);
			return;
		}
		if (Static2.anInt67 >= 625 && Static2.anInt67 <= 690 && Static182.anInt4065 >= 4 && Static182.anInt4065 <= 18) {
			Static183.method2977(1, 3);
			return;
		}
		if (Static2.anInt67 >= 700 && Static182.anInt4065 >= 4 && Static2.anInt67 <= 758 && Static182.anInt4065 <= 20) {
			Static206.aBoolean184 = false;
			Static120.method2274();
			return;
		}
		if (Static180.anInt3905 == -1) {
			return;
		}
		@Pc(247) Class3 local247 = Static195.aClass3Array1[Static180.anInt3905];
		if (Static15.aBoolean19 == local247.aBoolean4) {
			@Pc(271) byte[] local271 = Static109.method2004(new Class65[] { local247.aClass65_57, Static159.aClass65_2154 }).method2452();
			Static167.aString5 = new String(local271, 0, local271.length);
			Static13.anInt910 = local247.anInt93;
			if (Static99.anInt2495 != 0) {
				Static33.anInt969 = 43594;
				Static180.anInt3910 = 43594;
				Static177.anInt3987 = 443;
				Static99.anInt2495 = 0;
			}
			Static206.aBoolean184 = false;
			Static120.method2274();
			return;
		}
		@Pc(358) Class65 local358 = Static109.method2004(new Class65[] { Static57.aClass65_945, local247.aClass65_57, Static105.aClass65_1535, Static118.method2250(Static107.anInt2630), Static38.aClass65_663, Static118.method2250(Static13.aBoolean36 ? 1 : 0), Static167.aClass65_2242, Static118.method2250(Static138.anInt3396), Static181.aClass65_2428, Static118.method2250(Static77.anInt1908) });
		try {
			arg0.getAppletContext().showDocument(local358.method2458(), "_self");
		} catch (@Pc(367) Exception local367) {
		}
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
	public static void method2504() {
		if (Static16.aClass45_1 != null) {
			@Pc(7) Class45 local7 = Static16.aClass45_1;
			synchronized (Static16.aClass45_1) {
				Static16.aClass45_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IB)I")
	public static int method2505(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local5 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local5 += 4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local5++;
			arg0 >>>= 0x1;
		}
		return local5 + arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!oc;I)Z")
	public static boolean method2506(@OriginalArg(0) Class65 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static29.anInt859; local16++) {
			if (arg0.method2489(Static149.aClass65Array47[local16])) {
				return true;
			}
		}
		return false;
	}
}
