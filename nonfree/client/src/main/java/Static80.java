import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
	public static int anInt2176;

	@OriginalMember(owner = "client!oc", name = "C", descriptor = "[I")
	public static int[] anIntArray355 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!oc", name = "K", descriptor = "I")
	public static int anInt2175 = 0;

	@OriginalMember(owner = "client!oc", name = "M", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1159 = Static106.method1849("Nehmen");

	@OriginalMember(owner = "client!oc", name = "P", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1160 = Static106.method1849("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!oc", name = "S", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1161 = Static106.method1849("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!oc", name = "T", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1162 = Static106.method1849("Unerwartete Antwort vom Anmelde)2Server");

	@OriginalMember(owner = "client!oc", name = "W", descriptor = "Lclient!sc;")
	public static Class66 aClass66_1163 = Static106.method1849("Der Server wird gerade aktualisiert)3");

	@OriginalMember(owner = "client!oc", name = "Y", descriptor = "[I")
	public static int[] anIntArray359 = new int[32];

	@OriginalMember(owner = "client!oc", name = "Z", descriptor = "[Lclient!b;")
	public static Class1_Sub1_Sub2_Sub1[] aClass1_Sub1_Sub2_Sub1Array46 = new Class1_Sub1_Sub2_Sub1[1000];

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZJ)V")
	public static void method1487(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static126.anInt2886 >= 100) {
			Static103.method1791(0, Static13.aClass66_284, Static101.aClass66_1393);
			return;
		}
		@Pc(27) Class66 local27 = Static106.method1850(arg0).method1820();
		for (@Pc(29) int local29 = 0; local29 < Static126.anInt2886; local29++) {
			if (Static41.aLongArray4[local29] == arg0) {
				Static103.method1791(0, Static13.aClass66_284, Static41.method897(new Class66[] { local27, Static42.aClass66_708 }));
				return;
			}
		}
		for (@Pc(69) int local69 = 0; local69 < Static27.anInt730; local69++) {
			if (Static43.aLongArray5[local69] == arg0) {
				Static103.method1791(0, Static13.aClass66_284, Static41.method897(new Class66[] { Static100.aClass66_1389, local27, Static134.aClass66_1758 }));
				return;
			}
		}
		if (local27.method1824(Static126.aClass1_Sub1_Sub1_Sub5_Sub2_1.aClass66_707)) {
			Static103.method1791(0, Static13.aClass66_284, Static17.aClass66_339);
			return;
		}
		Static41.aLongArray4[Static126.anInt2886] = arg0;
		Static123.aClass66Array22[Static126.anInt2886++] = Static106.method1850(arg0);
		Static60.anInt1850 = Static112.anInt2674;
		Static127.aClass1_Sub12_Sub1_2.method1227(172);
		Static127.aClass1_Sub12_Sub1_2.method1195(arg0);
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(IBII)I")
	public static int method1488(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if ((Static87.aByteArrayArrayArray15[arg0][arg1][arg2] & 0x8) == 0) {
			return arg0 <= 0 || (Static87.aByteArrayArrayArray15[1][arg1][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!oc", name = "c", descriptor = "(B)V")
	public static void method1489() {
		aClass66_1159 = null;
		anIntArray359 = null;
		aClass66_1162 = null;
		aClass66_1160 = null;
		aClass66_1161 = null;
		aClass1_Sub1_Sub2_Sub1Array46 = null;
		anIntArray355 = null;
		aClass66_1163 = null;
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lclient!sf;III)Z")
	public static boolean method1490(@OriginalArg(0) Class5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) byte[] local14 = arg0.method107(arg2, arg1);
		if (local14 == null) {
			return false;
		} else {
			Static121.method1987(local14);
			return true;
		}
	}

	@OriginalMember(owner = "client!oc", name = "a", descriptor = "(ILclient!sa;)V")
	public static void method1491(@OriginalArg(1) Class64 arg0) {
		Static122.aClass64_1 = arg0;
	}
}
