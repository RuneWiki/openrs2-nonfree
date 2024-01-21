import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!vd", name = "o", descriptor = "Lclient!fb;")
	public static Class3_Sub2_Sub2 aClass3_Sub2_Sub2_2;

	@OriginalMember(owner = "client!vd", name = "r", descriptor = "I")
	public static int anInt3381;

	@OriginalMember(owner = "client!vd", name = "u", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1400 = Static59.method1195("Loaded gamescreen");

	@OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
	public static int anInt3376 = 0;

	@OriginalMember(owner = "client!vd", name = "n", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1405 = Static59.method1195("scroll:");

	@OriginalMember(owner = "client!vd", name = "e", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1401 = aClass60_1405;

	@OriginalMember(owner = "client!vd", name = "g", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1402 = aClass60_1405;

	@OriginalMember(owner = "client!vd", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1403 = aClass60_1400;

	@OriginalMember(owner = "client!vd", name = "l", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1404 = Static59.method1195("(X");

	@OriginalMember(owner = "client!vd", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1406 = Static59.method1195("und Ihr Passwort ein)3");

	@OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
	public static int anInt3380 = 0;

	@OriginalMember(owner = "client!vd", name = "t", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1407 = Static59.method1195("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V")
	public static void method2253() {
		for (@Pc(6) Class3_Sub6 local6 = (Class3_Sub6) Static53.aClass5_14.method92(); local6 != null; local6 = (Class3_Sub6) Static53.aClass5_14.method90()) {
			if (local6.aClass3_Sub1_Sub17_1 != null) {
				local6.method504();
			}
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)V")
	public static void method2254() {
		aClass60_1402 = null;
		aClass60_1400 = null;
		aClass60_1407 = null;
		aByteArrayArrayArray7 = null;
		aClass60_1404 = null;
		aClass60_1401 = null;
		aClass60_1403 = null;
		aClass60_1406 = null;
		aClass3_Sub2_Sub2_2 = null;
		aClass60_1405 = null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!jb;II)[Lclient!ma;")
	public static Class3_Sub1_Sub2_Sub3[] method2255(@OriginalArg(0) int arg0, @OriginalArg(1) Class25 arg1, @OriginalArg(2) int arg2) {
		return Static55.method1140(arg0, arg2, arg1) ? Static62.method1252() : null;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(IB)V")
	public static void method2256(@OriginalArg(0) int arg0) {
		if (arg0 == -3) {
			Static29.method665(Static62.aClass60_864, Static39.aClass60_530, Static2.aClass60_49);
		} else if (arg0 == -2) {
			Static29.method665(Static39.aClass60_518, Static39.aClass60_539, Static69.aClass60_937);
		} else if (arg0 == -1) {
			Static29.method665(Static39.aClass60_526, Static39.aClass60_549, Static2.aClass60_51);
		} else if (arg0 == 3) {
			Static29.method665(Static39.aClass60_523, Static39.aClass60_538, Static11.aClass60_147);
		} else if (arg0 == 4) {
			Static29.method665(Static41.aClass60_598, Static39.aClass60_553, Static67.aClass60_929);
		} else if (arg0 == 5) {
			Static29.method665(Static32.aClass60_432, Static39.aClass60_545, Static51.aClass60_592);
		} else if (arg0 == 6) {
			Static29.method665(Static58.aClass60_798, Static39.aClass60_558, Static42.aClass60_613);
		} else if (arg0 == 7) {
			Static29.method665(Static58.aClass60_800, Static39.aClass60_557, Static96.aClass60_1189);
		} else if (arg0 == 8) {
			Static29.method665(Static85.aClass60_1132, Static39.aClass60_559, Static20.aClass60_312);
		} else if (arg0 == 9) {
			Static29.method665(Static23.aClass60_1127, Static39.aClass60_532, Static91.aClass60_1149);
		} else if (arg0 == 10) {
			Static29.method665(Static85.aClass60_1133, Static39.aClass60_552, Static12.aClass60_161);
		} else if (arg0 == 11) {
			Static29.method665(Static108.aClass60_1298, Static39.aClass60_562, Static108.aClass60_1289);
		} else if (arg0 == 12) {
			Static29.method665(Static56.aClass60_790, Static39.aClass60_531, Static18.aClass60_292);
		} else if (arg0 == 13) {
			Static29.method665(Static3.aClass60_68, Static39.aClass60_564, Static2.aClass60_61);
		} else if (arg0 == 14) {
			Static29.method665(Static11.aClass60_140, Static39.aClass60_546, Static30.aClass60_398);
		} else if (arg0 == 16) {
			Static29.method665(Static83.aClass60_1103, Static39.aClass60_519, Static95.aClass60_1165);
		} else if (arg0 == 17) {
			Static29.method665(Static102.aClass60_1244, Static39.aClass60_537, Static115.aClass60_1335);
		} else if (arg0 == 18) {
			Static29.method665(Static36.aClass60_471, Static39.aClass60_522, Static111.aClass60_1308);
		} else if (arg0 == 19) {
			Static29.method665(Static43.aClass60_621, Static96.aClass60_1191, Static77.aClass60_1031);
		} else if (arg0 == 20) {
			Static29.method665(Static49.aClass60_690, Static39.aClass60_525, Static2.aClass60_52);
		} else if (arg0 == 22) {
			Static29.method665(Static78.aClass60_1036, Static39.aClass60_547, Static82.aClass60_1097);
		} else if (arg0 == 23) {
			Static29.method665(Static129.aClass60_1445, Static39.aClass60_534, Static30.aClass60_405);
		} else if (arg0 == 24) {
			Static29.method665(Static127.aClass60_1159, Static39.aClass60_540, Static16.aClass60_267);
		} else if (arg0 == 25) {
			Static29.method665(Static50.aClass60_731, Static39.aClass60_527, Static2.aClass60_57);
		} else if (arg0 == 26) {
			Static29.method665(Static34.aClass60_461, Static39.aClass60_556, Static6.aClass60_96);
		} else if (arg0 == 27) {
			Static29.method665(Static39.aClass60_551, Static39.aClass60_533, Static84.aClass60_1115);
		} else {
			Static29.method665(Static124.aClass60_1360, Static39.aClass60_544, Static2.aClass60_58);
		}
		Static50.method1075(10);
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
	public static void method2257(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static34.anInt1185 != 0 && arg1 != -1) {
			Static120.method2180(Static16.aClass25_Sub1_1, 0, Static34.anInt1185, arg1);
			Static31.aBoolean34 = true;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V")
	public static void method2258() {
		Static30.aClass3_Sub2_Sub4_1.method2204();
		Static66.aClass25_21 = null;
		Static104.anInt3014 = 1;
	}
}
