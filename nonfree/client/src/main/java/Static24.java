import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "[Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4[] aClass1_Sub1_Sub4_Sub4Array4;

	@OriginalMember(owner = "client!dc", name = "U", descriptor = "Lclient!pb;")
	public static Class1_Sub1_Sub4_Sub4 aClass1_Sub1_Sub4_Sub4_1;

	@OriginalMember(owner = "client!dc", name = "T", descriptor = "Lclient!kd;")
	private static Class39 aClass39_410 = Static108.method1915("Loading game screen )2 ");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "Lclient!kd;")
	public static Class39 aClass39_404 = aClass39_410;

	@OriginalMember(owner = "client!dc", name = "K", descriptor = "Lclient!kd;")
	private static Class39 aClass39_407 = Static108.method1915("Accept trade");

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "Lclient!kd;")
	public static Class39 aClass39_405 = aClass39_407;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
	public static int anInt816 = 0;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "Lclient!kd;")
	public static Class39 aClass39_406 = Static108.method1915("oberen Rand der Webseite ausw-=hlen)3");

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "Z")
	public static boolean aBoolean67 = false;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	public static int anInt828 = 0;

	@OriginalMember(owner = "client!dc", name = "R", descriptor = "Lclient!kd;")
	public static Class39 aClass39_408 = Static108.method1915("Konfig geladen)3");

	@OriginalMember(owner = "client!dc", name = "S", descriptor = "Lclient!kd;")
	public static Class39 aClass39_409 = Static108.method1915("Keine Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(III)I")
	public static int method452(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class1_Sub2 local12 = (Class1_Sub2) Static62.aClass70_11.method1961((long) arg0);
		if (local12 == null) {
			return 0;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(23) int local23 = 0;
			for (@Pc(25) int local25 = 0; local25 < local12.anIntArray22.length; local25++) {
				if (local12.anIntArray20[local25] == arg1) {
					local23 += local12.anIntArray22[local25];
				}
			}
			return local23;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZLclient!q;)V")
	public static void method453(@OriginalArg(1) Class62 arg0) {
		Static121.aClass62_33 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)V")
	public static void method454(@OriginalArg(1) int arg0) {
		Static10.method268();
		@Pc(8) int local8 = Static46.method1934(arg0).anInt1309;
		if (local8 == 0) {
			return;
		}
		@Pc(22) int local22 = Static44.anIntArray175[arg0];
		if (local8 == 1) {
			if (local22 == 1) {
				Static27.method560(0.9D);
				((Class47) Static27.anInterface1_1).method1292(0.9D);
			}
			if (local22 == 2) {
				Static27.method560(0.8D);
				((Class47) Static27.anInterface1_1).method1292(0.8D);
			}
			if (local22 == 3) {
				Static27.method560(0.7D);
				((Class47) Static27.anInterface1_1).method1292(0.7D);
			}
			if (local22 == 4) {
				Static27.method560(0.6D);
				((Class47) Static27.anInterface1_1).method1292(0.6D);
			}
			Static19.method362();
			Static119.aBoolean234 = true;
		}
		if (local8 == 3) {
			@Pc(80) short local80 = 0;
			if (local22 == 0) {
				local80 = 255;
			}
			if (local22 == 1) {
				local80 = 192;
			}
			if (local22 == 2) {
				local80 = 128;
			}
			if (local22 == 3) {
				local80 = 64;
			}
			if (local22 == 4) {
				local80 = 0;
			}
			if (Static90.anInt2125 != local80) {
				if (Static90.anInt2125 == 0 && Static95.anInt2869 != -1) {
					Static37.method669(0, Static95.anInt2869, local80, Static77.aClass62_Sub1_53);
					Static10.aBoolean46 = false;
				} else if (local80 == 0) {
					Static89.method1475();
					Static10.aBoolean46 = false;
				} else {
					Static49.method855(local80);
				}
				Static90.anInt2125 = local80;
			}
		}
		if (local8 == 10) {
			if (local22 == 0) {
				Static86.anInt2059 = 127;
			}
			if (local22 == 1) {
				Static86.anInt2059 = 96;
			}
			if (local22 == 2) {
				Static86.anInt2059 = 64;
			}
			if (local22 == 3) {
				Static86.anInt2059 = 32;
			}
			if (local22 == 4) {
				Static86.anInt2059 = 0;
			}
		}
		if (local8 == 5) {
			Static98.anInt2389 = local22;
		}
		if (local8 == 6) {
			Static121.anInt2968 = local22;
		}
		if (local8 == 8) {
			Static71.anInt1792 = local22;
			Static113.aBoolean226 = true;
		}
		if (local8 == 4) {
			if (local22 == 0) {
				Static34.anInt1064 = 127;
			}
			if (local22 == 1) {
				Static34.anInt1064 = 96;
			}
			if (local22 == 2) {
				Static34.anInt1064 = 64;
			}
			if (local22 == 3) {
				Static34.anInt1064 = 32;
			}
			if (local22 == 4) {
				Static34.anInt1064 = 0;
			}
		}
		if (local8 == 9) {
			Static21.anInt737 = local22;
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZB[B)Ljava/lang/Object;")
	public static Object method455(@OriginalArg(2) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static126.aBoolean249) {
			try {
				@Pc(23) Class36 local23 = (Class36) Class.forName("Class36_Sub1").getDeclaredConstructor().newInstance();
				local23.method2033(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static126.aBoolean249 = true;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public static void method456() {
		aClass39_406 = null;
		aClass1_Sub1_Sub4_Sub4Array4 = null;
		aClass39_405 = null;
		aClass39_408 = null;
		aClass39_404 = null;
		aClass1_Sub1_Sub4_Sub4_1 = null;
		aClass39_407 = null;
		aClass39_409 = null;
		aClass39_410 = null;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V")
	public static void method457() {
		Static70.aClass33_26.method1034();
	}
}
