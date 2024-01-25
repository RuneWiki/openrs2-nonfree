import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static359 {

	@OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
	public static int anInt6114;

	@OriginalMember(owner = "client!sb", name = "t", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray48;

	@OriginalMember(owner = "client!sb", name = "e", descriptor = "Lclient!tk;")
	public static final Class225 aClass225_22 = new Class225(8, 0, 4, 1);

	@OriginalMember(owner = "client!sb", name = "o", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_154 = new Class131(15, 3);

	@OriginalMember(owner = "client!sb", name = "r", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_155 = new Class131(14, 7);

	@OriginalMember(owner = "client!sb", name = "s", descriptor = "[I")
	public static final int[] anIntArray492 = new int[] { 1, -1, -1, 1 };

	@OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
	public static int anInt6125 = 0;

	@OriginalMember(owner = "client!sb", name = "v", descriptor = "Lclient!of;")
	public static final Class176 aClass176_8 = new Class176("WTQA", 2);

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)Z")
	public static boolean method4943(@OriginalArg(1) int arg0) {
		Static303.anInt5383 = arg0 + 1 & 0xFFFF;
		Static9.aBoolean1 = true;
		return true;
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lclient!vh;B)V")
	public static void method4944(@OriginalArg(0) Class250 arg0) {
		Static451.anInt7783 = arg0.method5652("p11_full");
		Static40.anInt742 = arg0.method5652("p12_full");
		Static242.anInt4338 = arg0.method5652("b12_full");
		Static400.anInt6934 = arg0.method5652("hitmarks");
		Static112.anInt2017 = arg0.method5652("hitbar_default");
		Static235.anInt4215 = arg0.method5652("timerbar_default");
		Static132.anInt2278 = arg0.method5652("headicons_pk");
		Static438.anInt7563 = arg0.method5652("headicons_prayer");
		Static315.anInt5855 = arg0.method5652("hint_headicons");
		Static325.anInt5704 = arg0.method5652("hint_mapmarkers");
		Static69.anInt1410 = arg0.method5652("mapflag");
		Static175.anInt3194 = arg0.method5652("cross");
		Static169.anInt3146 = arg0.method5652("mapdots");
		Static163.anInt3041 = arg0.method5652("scrollbar");
		Static258.anInt7178 = arg0.method5652("name_icons");
		Static293.anInt5145 = arg0.method5652("floorshadows");
		Static305.anInt5425 = arg0.method5652("compass");
		Static334.anInt5824 = arg0.method5652("otherlevel");
		Static161.anInt2764 = arg0.method5652("hint_mapedge");
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILclient!el;)V")
	public static void method4945(@OriginalArg(1) Class71 arg0) {
		Static25.aClass71_1 = arg0;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(I)V")
	public static void method4946() {
		if (!Static102.method1567()) {
			return;
		}
		if (Static35.aStringArray21 == null) {
			Static78.method1354();
		}
		Static415.anInt7240 = 0;
		Static106.aBoolean110 = true;
		try {
			Static251.aClipboard1 = Static185.aClient1.getToolkit().getSystemClipboard();
		} catch (@Pc(24) Exception local24) {
		}
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)V")
	public static void method4948(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = Static167.aClass101_3.method1963(Static141.aClass84_35.method1678(Static167.anInt3118));
		@Pc(31) int local31;
		for (@Pc(25) Class1_Sub8 local25 = (Class1_Sub8) Static8.aClass266_2.method6000(); local25 != null; local25 = (Class1_Sub8) Static8.aClass266_2.method5994()) {
			local31 = Static129.method1885(local25);
			if (local31 > local15) {
				local15 = local31;
			}
		}
		local15 += 8;
		local31 = Static82.anInt1627 * 16 + 21;
		@Pc(61) int local61 = arg0 - local15 / 2;
		if (local61 + local15 > Static207.anInt3842) {
			local61 = Static207.anInt3842 - local15;
		}
		if (local61 < 0) {
			local61 = 0;
		}
		@Pc(81) int local81 = arg1;
		if (local31 + arg1 > Static255.anInt4574) {
			local81 = Static255.anInt4574 - local31;
		}
		Static309.anInt2246 = local61;
		if (local81 < 0) {
			local81 = 0;
		}
		Static125.anInt2237 = (Static45.aBoolean35 ? 26 : 22) + Static82.anInt1627 * 16;
		Static49.anInt5921 = local15;
		Static24.anInt543 = local81;
		Static108.aBoolean111 = true;
	}

	@OriginalMember(owner = "client!sb", name = "b", descriptor = "(III)Lclient!fq;")
	public static Class26_Sub1 method4949(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass26_Sub1_3;
	}
}
