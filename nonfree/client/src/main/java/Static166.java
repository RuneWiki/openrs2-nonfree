import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static166 {

	@OriginalMember(owner = "client!ug", name = "Z", descriptor = "I")
	public static int anInt4087;

	@OriginalMember(owner = "client!ug", name = "cb", descriptor = "[I")
	public static int[] anIntArray554;

	@OriginalMember(owner = "client!ug", name = "db", descriptor = "I")
	public static int anInt4090;

	@OriginalMember(owner = "client!ug", name = "eb", descriptor = "I")
	public static int anInt4091 = -1;

	@OriginalMember(owner = "client!ug", name = "hb", descriptor = "Z")
	public static boolean aBoolean204 = false;

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
	public static void method2875() {
		anIntArray554 = null;
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!vc;)V")
	public static void method2876(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static163.anInt4012 != 1) {
			return;
		}
		if (Static38.anInt1049 >= 280 && Static38.anInt1049 <= 294 && Static165.anInt4054 >= 4 && Static165.anInt4054 <= 18) {
			Static127.method2275(0, 0);
			return;
		}
		if (Static38.anInt1049 >= 295 && Static38.anInt1049 <= 360 && Static165.anInt4054 >= 4 && Static165.anInt4054 <= 18) {
			Static127.method2275(0, 1);
			return;
		}
		if (Static38.anInt1049 >= 390 && Static38.anInt1049 <= 404 && Static165.anInt4054 >= 4 && Static165.anInt4054 <= 18) {
			Static127.method2275(1, 0);
			return;
		}
		if (Static38.anInt1049 >= 405 && Static38.anInt1049 <= 470 && Static165.anInt4054 >= 4 && Static165.anInt4054 <= 18) {
			Static127.method2275(1, 1);
			return;
		}
		if (Static38.anInt1049 >= 500 && Static38.anInt1049 <= 514 && Static165.anInt4054 >= 4 && Static165.anInt4054 <= 18) {
			Static127.method2275(2, 0);
			return;
		}
		if (Static38.anInt1049 >= 515 && Static38.anInt1049 <= 580 && Static165.anInt4054 >= 4 && Static165.anInt4054 <= 18) {
			Static127.method2275(2, 1);
			return;
		}
		if (Static38.anInt1049 >= 610 && Static38.anInt1049 <= 624 && Static165.anInt4054 >= 4 && Static165.anInt4054 <= 18) {
			Static127.method2275(3, 0);
			return;
		}
		if (Static38.anInt1049 >= 625 && Static38.anInt1049 <= 690 && Static165.anInt4054 >= 4 && Static165.anInt4054 <= 18) {
			Static127.method2275(3, 1);
			return;
		}
		if (Static38.anInt1049 >= 708 && Static165.anInt4054 >= 4 && Static38.anInt1049 <= 758 && Static165.anInt4054 <= 20) {
			Static5.aBoolean218 = false;
			Static169.aClass1_Sub1_Sub12_Sub1_7.method1941(0, 0);
			Static161.aClass1_Sub1_Sub12_Sub1_6.method1941(382, 0);
			Static25.aClass1_Sub1_Sub12_Sub4_2.method2746(382 - Static25.aClass1_Sub1_Sub12_Sub4_2.anInt3905 / 2, 18);
			return;
		}
		if (Static81.anInt1405 == -1) {
			return;
		}
		@Pc(266) Class78 local266 = Static98.aClass78Array1[Static81.anInt1405];
		if (local266.aBoolean194 == Static176.aBoolean209) {
			@Pc(290) byte[] local290 = Static149.method2571(new Class23[] { local266.aClass23_1460, Static163.aClass23_1531 }).method653();
			Static27.aString1 = new String(local290, 0, local290.length);
			Static5.aBoolean218 = false;
			if (Static73.anInt2024 != 0) {
				Static73.anInt2024 = 0;
				Static79.anInt2148 = 43594;
				Static48.anInt1280 = 43594;
				Static132.anInt3971 = 443;
			}
			Static86.anInt2304 = local266.anInt3807;
			Static169.aClass1_Sub1_Sub12_Sub1_7.method1941(0, 0);
			Static161.aClass1_Sub1_Sub12_Sub1_6.method1941(382, 0);
			Static25.aClass1_Sub1_Sub12_Sub4_2.method2746(382 - Static25.aClass1_Sub1_Sub12_Sub4_2.anInt3905 / 2, 18);
			return;
		}
		@Pc(391) Class23 local391 = Static149.method2571(new Class23[] { Static47.aClass23_482, local266.aClass23_1460, Static163.aClass23_1531, Static101.aClass23_994, Static109.aClass23_1071, Static27.method498(Static8.aBoolean17 ? 1 : 0), Static178.aClass23_1627, Static27.method498(Static95.anInt2462), Static138.aClass23_1319, Static27.method498(Static51.anInt1460) });
		try {
			arg0.getAppletContext().showDocument(local391.method652(), "_self");
		} catch (@Pc(400) Exception local400) {
		}
	}
}
