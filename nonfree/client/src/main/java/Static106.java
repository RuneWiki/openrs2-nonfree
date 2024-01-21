import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!rc", name = "Gc", descriptor = "I")
	public static int anInt2477;

	@OriginalMember(owner = "client!rc", name = "Kc", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_15;

	@OriginalMember(owner = "client!rc", name = "Nc", descriptor = "Lclient!ue;")
	public static Class1_Sub2_Sub2_Sub4 aClass1_Sub2_Sub2_Sub4_16;

	@OriginalMember(owner = "client!rc", name = "Qc", descriptor = "I")
	public static int anInt2480;

	@OriginalMember(owner = "client!rc", name = "yc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1170 = Static78.method1313("Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

	@OriginalMember(owner = "client!rc", name = "Bc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1171 = Static78.method1313(" )2> <col=00ffff>");

	@OriginalMember(owner = "client!rc", name = "Hc", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1173 = Static78.method1313("Account locked as we suspect it has been stolen)3");

	@OriginalMember(owner = "client!rc", name = "Fc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1172 = aClass25_1173;

	@OriginalMember(owner = "client!rc", name = "Oc", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1176 = Static78.method1313("wave:");

	@OriginalMember(owner = "client!rc", name = "Ic", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1174 = aClass25_1176;

	@OriginalMember(owner = "client!rc", name = "Mc", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1175 = Static78.method1313("FULL");

	@OriginalMember(owner = "client!rc", name = "Pc", descriptor = "I")
	public static int anInt2479 = 0;

	@OriginalMember(owner = "client!rc", name = "Rc", descriptor = "I")
	public static int anInt2481 = 0;

	@OriginalMember(owner = "client!rc", name = "Uc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1177 = aClass25_1176;

	@OriginalMember(owner = "client!rc", name = "Vc", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1178 = aClass25_1175;

	@OriginalMember(owner = "client!rc", name = "Wc", descriptor = "[I")
	public static int[] anIntArray423 = new int[32768];

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IILclient!oc;I)[Lclient!b;")
	public static Class1_Sub2_Sub2_Sub1[] method1719(@OriginalArg(0) int arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) int arg2) {
		return Static109.method1749(arg2, arg0, arg1) ? Static47.method976() : null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(Lclient!oc;Ljava/awt/Component;Lclient!oc;B)V")
	public static void method1720(@OriginalArg(0) Class56 arg0, @OriginalArg(1) Component arg1, @OriginalArg(2) Class56 arg2) {
		if (Static120.aBoolean128) {
			return;
		}
		Static88.aClass7_14 = Static3.method37(503, 765, arg1);
		Static88.aClass7_14.method1096();
		Static128.method1943();
		@Pc(24) byte[] local24 = arg0.method1288(Static14.aClass25_209, Static81.aClass25_858);
		Static57.aClass1_Sub2_Sub2_Sub1_13 = new Class1_Sub2_Sub2_Sub1(local24, arg1);
		Static98.aClass1_Sub2_Sub2_Sub1_16 = Static57.aClass1_Sub2_Sub2_Sub1_13.method193();
		Static76.aClass1_Sub2_Sub2_Sub4_12 = Static26.method594(Static81.aClass25_858, Static62.aClass25_624, arg2);
		Static109.aClass1_Sub2_Sub2_Sub4_17 = Static26.method594(Static81.aClass25_858, Static101.aClass25_1116, arg2);
		Static74.aClass1_Sub2_Sub2_Sub4_9 = Static26.method594(Static81.aClass25_858, Static96.aClass25_1378, arg2);
		Static52.aClass1_Sub2_Sub2_Sub4Array3 = Static122.method2021(arg2, Static50.aClass25_518, Static81.aClass25_858);
		Static127.aClass1_Sub2_Sub2_Sub4Array10 = Static122.method2021(arg2, Static34.aClass25_400, Static81.aClass25_858);
		Static127.anIntArray499 = new int[256];
		for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
			Static127.anIntArray499[local68] = local68 * 262144;
		}
		for (@Pc(82) int local82 = 0; local82 < 64; local82++) {
			Static127.anIntArray499[local82 + 64] = local82 * 1024 + 16711680;
		}
		for (@Pc(108) int local108 = 0; local108 < 64; local108++) {
			Static127.anIntArray499[local108 + 128] = local108 * 4 + 16776960;
		}
		for (@Pc(128) int local128 = 0; local128 < 64; local128++) {
			Static127.anIntArray499[local128 + 192] = 16777215;
		}
		Static124.anIntArray494 = new int[256];
		for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
			Static124.anIntArray494[local147] = local147 * 1024;
		}
		for (@Pc(163) int local163 = 0; local163 < 64; local163++) {
			Static124.anIntArray494[local163 + 64] = local163 * 4 + 65280;
		}
		for (@Pc(183) int local183 = 0; local183 < 64; local183++) {
			Static124.anIntArray494[local183 + 128] = local183 * 262144 + 65535;
		}
		for (@Pc(203) int local203 = 0; local203 < 64; local203++) {
			Static124.anIntArray494[local203 + 192] = 16777215;
		}
		Static101.anIntArray411 = new int[256];
		for (@Pc(222) int local222 = 0; local222 < 64; local222++) {
			Static101.anIntArray411[local222] = local222 * 4;
		}
		for (@Pc(236) int local236 = 0; local236 < 64; local236++) {
			Static101.anIntArray411[local236 + 64] = local236 * 262144 + 255;
		}
		for (@Pc(254) int local254 = 0; local254 < 64; local254++) {
			Static101.anIntArray411[local254 + 128] = local254 * 1024 + 16711935;
		}
		for (@Pc(275) int local275 = 0; local275 < 64; local275++) {
			Static101.anIntArray411[local275 + 192] = 16777215;
		}
		Static84.anIntArray335 = new int[32768];
		Static80.anIntArray323 = new int[32768];
		Static80.anIntArray322 = new int[256];
		Static127.method2042(null);
		Static93.aBoolean103 = false;
		Static49.anInt1229 = 0;
		Static81.aClass25_862 = Static81.aClass25_858;
		if (Static33.anInt909 == 0) {
			Static42.aBoolean46 = true;
		} else {
			Static42.aBoolean46 = false;
		}
		Static53.anIntArray430 = new int[32768];
		Static122.anIntArray497 = new int[32768];
		Static81.aClass25_857 = Static81.aClass25_858;
		if (Static42.aBoolean46) {
			Static71.method1147();
		} else {
			Static2.method34(Static49.aClass56_Sub1_10, Static115.aClass25_1295, Static81.aClass25_858);
		}
		Static27.method603(false);
		Static120.aBoolean128 = true;
		Static60.aBoolean54 = true;
		Static57.aClass1_Sub2_Sub2_Sub1_13.method207(0, 0);
		Static98.aClass1_Sub2_Sub2_Sub1_16.method207(382, 0);
		Static76.aClass1_Sub2_Sub2_Sub4_12.method1953(382 - Static76.aClass1_Sub2_Sub2_Sub4_12.anInt2756 / 2, 18);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!b;IB)V")
	public static void method1721(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub2_Sub1 arg1, @OriginalArg(2) int arg2) {
		if (arg1 == null) {
			return;
		}
		@Pc(14) int local14 = arg0 * arg0 + arg2 * arg2;
		@Pc(20) int local20 = Static54.anInt1298 + Static23.anInt673 & 0x7FF;
		if (local14 > 6400) {
			return;
		}
		@Pc(28) int local28 = Class1_Sub2_Sub2_Sub2.anIntArray189[local20];
		@Pc(36) int local36 = local28 * 256 / (Static129.anInt2953 + 256);
		@Pc(40) int local40 = Class1_Sub2_Sub2_Sub2.anIntArray185[local20];
		@Pc(48) int local48 = local40 * 256 / (Static129.anInt2953 + 256);
		@Pc(58) int local58 = arg2 * local48 + arg0 * local36 >> 16;
		@Pc(77) int local77 = arg0 * local48 - arg2 * local36 >> 16;
		if (local14 <= 2500) {
			arg1.method204(local58 + 4 + 94 - arg1.anInt213 / 2, -(arg1.anInt211 / 2) + -4 + -local77 + 83);
		} else {
			arg1.method196(Static3.aClass1_Sub2_Sub2_Sub4_1, local58 + 4 + 94 - arg1.anInt213 / 2, -(arg1.anInt211 / 2) + -4 + -local77 + 83);
		}
	}

	@OriginalMember(owner = "client!rc", name = "g", descriptor = "(B)V")
	public static void method1722() {
		if (Static90.aClass57_2 != null) {
			Static90.aClass57_2.method2015();
		}
		if (Static18.aClass57_1 != null) {
			Static18.aClass57_1.method2015();
		}
	}

	@OriginalMember(owner = "client!rc", name = "c", descriptor = "(Z)V")
	public static void method1723() {
		aClass25_1173 = null;
		aClass25_1178 = null;
		anIntArray423 = null;
		aClass1_Sub2_Sub2_Sub4_16 = null;
		aClass1_Sub2_Sub2_Sub4_15 = null;
		aClass25_1171 = null;
		aClass25_1174 = null;
		aClass25_1177 = null;
		aClass25_1175 = null;
		aClass25_1176 = null;
		aClass25_1172 = null;
		aClass25_1170 = null;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(ILclient!ob;)Z")
	public static boolean method1724(@OriginalArg(1) Class1_Sub2_Sub14 arg0) {
		@Pc(8) int local8 = arg0.anInt1934;
		if (local8 >= 1 && local8 <= 200 || !(local8 < 701 || local8 > 900)) {
			if (local8 >= 801) {
				local8 -= 701;
			} else if (local8 >= 701) {
				local8 -= 601;
			} else if (local8 < 101) {
				local8--;
			} else {
				local8 -= 101;
			}
			Static80.method1365(0, 3, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, Static118.aClass25Array22[local8] }), Static49.aClass25_513);
			Static80.method1365(0, 48, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, Static118.aClass25Array22[local8] }), Static2.aClass25_34);
			return true;
		} else if (local8 >= 401 && local8 <= 500) {
			Static80.method1365(0, 2, 0, 0, Static116.method1859(new Class25[] { Static50.aClass25_516, arg0.aClass25_941 }), Static49.aClass25_513);
			return true;
		} else {
			return false;
		}
	}
}
