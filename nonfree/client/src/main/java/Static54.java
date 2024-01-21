import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jd", name = "t", descriptor = "Lclient!gd;")
	public static Class27 aClass27_48;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "Lclient!nb;")
	public static Class3_Sub1_Sub5_Sub4 aClass3_Sub1_Sub5_Sub4_37;

	@OriginalMember(owner = "client!jd", name = "r", descriptor = "I")
	public static int anInt2848 = 127;

	@OriginalMember(owner = "client!jd", name = "s", descriptor = "Lclient!na;")
	public static Class53 aClass53_1421 = Static109.method1737(" weitere Optionen");

	@OriginalMember(owner = "client!jd", name = "v", descriptor = "Lclient!na;")
	public static Class53 aClass53_1422 = Static109.method1737(")1");

	@OriginalMember(owner = "client!jd", name = "B", descriptor = "I")
	public static int anInt2853 = 2;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "Lclient!na;")
	public static Class53 aClass53_1423 = Static109.method1737("null");

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
	public static int anInt2854 = 0;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "Lclient!na;")
	public static Class53 aClass53_1424 = Static109.method1737("@whi@ )4 ");

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "[I")
	public static int[] anIntArray413 = new int[500];

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "I")
	public static int anInt2856 = -1;

	@OriginalMember(owner = "client!jd", name = "I", descriptor = "[B")
	public static byte[] aByteArray69 = new byte[520];

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(II)Lclient!na;")
	public static Class53 method1951(@OriginalArg(1) int arg0) {
		if (arg0 < 100000) {
			return Static108.method1725(arg0);
		} else if (arg0 < 10000000) {
			return Static103.method1689(new Class53[] { Static108.method1725(arg0 / 1000), Static20.aClass53_260 });
		} else {
			return Static103.method1689(new Class53[] { Static108.method1725(arg0 / 1000000), Static71.aClass53_797 });
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)Lclient!ff;")
	public static Class3_Sub1_Sub5_Sub2 method1952() {
		@Pc(17) Class3_Sub1_Sub5_Sub2 local17 = new Class3_Sub1_Sub5_Sub2(Static32.anIntArray117, Static103.anIntArray321, Static53.anIntArray273, Static97.anIntArray312, Static7.aByteArrayArray1);
		Static68.method1179();
		return local17;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
	public static void method1953(@OriginalArg(1) int arg0) {
		Static116.method1832();
		@Pc(12) int local12 = Static23.method404(arg0).anInt2860;
		if (local12 == 0) {
			return;
		}
		@Pc(24) int local24 = Static13.anIntArray31[arg0];
		if (local12 == 1) {
			if (local24 == 1) {
				Static24.method472(0.9D);
				((Class19) Static24.anInterface2_1).method497(0.9D);
			}
			if (local24 == 2) {
				Static24.method472(0.8D);
				((Class19) Static24.anInterface2_1).method497(0.8D);
			}
			if (local24 == 3) {
				Static24.method472(0.7D);
				((Class19) Static24.anInterface2_1).method497(0.7D);
			}
			if (local24 == 4) {
				Static24.method472(0.6D);
				((Class19) Static24.anInterface2_1).method497(0.6D);
			}
			Static12.method194();
			Static123.aBoolean128 = true;
		}
		if (local12 == 3) {
			@Pc(80) short local80 = 0;
			if (local24 == 0) {
				local80 = 255;
			}
			if (local24 == 1) {
				local80 = 192;
			}
			if (local24 == 2) {
				local80 = 128;
			}
			if (local24 == 3) {
				local80 = 64;
			}
			if (local24 == 4) {
				local80 = 0;
			}
			if (Static96.anInt1448 != local80) {
				if (Static96.anInt1448 == 0 && Static27.anInt856 != -1) {
					Static100.method1655(0, Static109.aClass62_Sub1_17, local80, Static27.anInt856);
					Static58.aBoolean56 = false;
				} else if (local80 == 0) {
					Static86.method1440();
					Static58.aBoolean56 = false;
				} else {
					Static121.method1939(local80);
				}
				Static96.anInt1448 = local80;
			}
		}
		if (local12 == 10) {
			if (local24 == 0) {
				Static56.anInt1508 = 127;
			}
			if (local24 == 1) {
				Static56.anInt1508 = 96;
			}
			if (local24 == 2) {
				Static56.anInt1508 = 64;
			}
			if (local24 == 3) {
				Static56.anInt1508 = 32;
			}
			if (local24 == 4) {
				Static56.anInt1508 = 0;
			}
		}
		if (local12 == 9) {
			Static118.anInt2752 = local24;
		}
		if (local12 == 4) {
			if (local24 == 0) {
				anInt2848 = 127;
			}
			if (local24 == 1) {
				anInt2848 = 96;
			}
			if (local24 == 2) {
				anInt2848 = 64;
			}
			if (local24 == 3) {
				anInt2848 = 32;
			}
			if (local24 == 4) {
				anInt2848 = 0;
			}
		}
		if (local12 == 8) {
			Static52.aBoolean50 = true;
			Static91.anInt2195 = local24;
		}
		if (local12 == 6) {
			Static107.anInt2468 = local24;
		}
		if (local12 == 5) {
			Static126.anInt2183 = local24;
		}
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V")
	public static void method1954() {
		Static95.method1571();
		Static79.method1381();
		Static85.method1431();
		Static117.method1853();
		Static108.method1726();
		Static18.method294();
		Static77.method1357();
		Static77.method1354();
		Static99.method1643();
		Static49.method939();
		Static40.method823();
		Static65.method1130();
		((Class19) Static24.anInterface2_1).method494();
		Static9.aClass75_6.method1724();
		Static98.aClass62_Sub1_13.method1519();
		Static108.aClass62_Sub1_16.method1519();
		Static16.aClass62_Sub1_4.method1519();
		Static125.aClass62_Sub1_18.method1519();
		Static7.aClass62_Sub1_2.method1519();
		Static109.aClass62_Sub1_17.method1519();
		Static9.aClass62_Sub1_3.method1519();
		Static58.aClass62_Sub1_9.method1519();
		Static7.aClass62_Sub1_1.method1519();
		Static69.aClass62_Sub1_12.method1519();
		Static66.aClass62_Sub1_10.method1519();
		Static103.aClass62_Sub1_15.method1519();
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public static void method1955() {
		aClass53_1421 = null;
		aClass27_48 = null;
		aByteArray69 = null;
		aClass53_1423 = null;
		aClass3_Sub1_Sub5_Sub4_37 = null;
		aClass53_1424 = null;
		anIntArray413 = null;
		aClass53_1422 = null;
	}
}
