import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Z")
	public static boolean aBoolean58;

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "Lclient!qf;")
	public static Class60 aClass60_822 = Static59.method1195("Chat panel redrawn");

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "J")
	public static volatile long aLong63 = 0L;

	@OriginalMember(owner = "client!kd", name = "h", descriptor = "Lclient!qf;")
	public static Class60 aClass60_823 = Static59.method1195("Sie befinden sich in einem Mitglieder)2Gebiet(Q");

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "[I")
	public static int[] anIntArray206 = new int[100];

	@OriginalMember(owner = "client!kd", name = "l", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray4 = new byte[4][104][104];

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Lclient!qf;")
	private static Class60 aClass60_824 = Static59.method1195("Members only world");

	@OriginalMember(owner = "client!kd", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_825 = aClass60_824;

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/Class;")
	public static Class method1204(@OriginalArg(0) String arg0) throws ClassNotFoundException {
		if (arg0.equals("B")) {
			return Byte.TYPE;
		} else if (arg0.equals("I")) {
			return Integer.TYPE;
		} else if (arg0.equals("S")) {
			return Short.TYPE;
		} else if (arg0.equals("J")) {
			return Long.TYPE;
		} else if (arg0.equals("Z")) {
			return Boolean.TYPE;
		} else if (arg0.equals("F")) {
			return Float.TYPE;
		} else if (arg0.equals("D")) {
			return Double.TYPE;
		} else if (arg0.equals("C")) {
			return Character.TYPE;
		} else {
			return Class.forName(arg0);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
	public static void method1205() {
		while (true) {
			if (Static79.aClass3_Sub12_Sub1_1.method1976(Static58.anInt1794) >= 27) {
				@Pc(16) int local16 = Static79.aClass3_Sub12_Sub1_1.method1982(15);
				if (local16 != 32767) {
					@Pc(23) boolean local23 = false;
					if (Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local16] == null) {
						local23 = true;
						Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local16] = new Class3_Sub1_Sub1_Sub3_Sub2();
					}
					@Pc(39) Class3_Sub1_Sub1_Sub3_Sub2 local39 = Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local16];
					Static128.anIntArray390[Static20.anInt829++] = local16;
					local39.anInt1531 = Static34.anInt1183;
					@Pc(55) int local55 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
					if (local55 == 1) {
						Static46.anIntArray170[Static74.anInt2399++] = local16;
					}
					@Pc(75) int local75 = Static79.aClass3_Sub12_Sub1_1.method1982(5);
					@Pc(80) int local80 = Static79.aClass3_Sub12_Sub1_1.method1982(1);
					if (local75 > 15) {
						local75 -= 32;
					}
					@Pc(89) int local89 = Static79.aClass3_Sub12_Sub1_1.method1982(5);
					local39.aClass3_Sub1_Sub16_1 = Static81.method1638(Static79.aClass3_Sub12_Sub1_1.method1982(13));
					@Pc(106) int local106 = Static26.anIntArray122[Static79.aClass3_Sub12_Sub1_1.method1982(3)];
					local39.anInt1492 = local39.aClass3_Sub1_Sub16_1.anInt3159;
					local39.anInt1490 = local39.aClass3_Sub1_Sub16_1.anInt3145;
					if (local89 > 15) {
						local89 -= 32;
					}
					local39.anInt1505 = local39.aClass3_Sub1_Sub16_1.anInt3165;
					if (local23) {
						local39.anInt1525 = local106;
					}
					local39.anInt1484 = local39.aClass3_Sub1_Sub16_1.anInt3155;
					local39.anInt1539 = local39.aClass3_Sub1_Sub16_1.anInt3162;
					local39.anInt1503 = local39.aClass3_Sub1_Sub16_1.anInt3150;
					local39.anInt1532 = local39.aClass3_Sub1_Sub16_1.anInt3167;
					local39.anInt1511 = local39.aClass3_Sub1_Sub16_1.anInt3166;
					if (local39.anInt1503 == 0) {
						local39.anInt1525 = 0;
					}
					local39.anInt1520 = local39.aClass3_Sub1_Sub16_1.anInt3170;
					local39.method1015(local80 == 1, local75 + Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray181[0], local89 + Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1.anIntArray184[0]);
					continue;
				}
			}
			Static79.aClass3_Sub12_Sub1_1.method1975();
			return;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method1206() {
		Static32.anIntArray133 = null;
		Static15.anIntArray74 = null;
		Static2.aByteArrayArray3 = null;
		Static97.anIntArray302 = null;
		Static123.anIntArray378 = null;
		Static33.anIntArray138 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILclient!qf;)V")
	public static void method1207(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1) {
		Static81.aClass3_Sub12_Sub1_2.method1980(3);
		Static81.aClass3_Sub12_Sub1_2.method1927(arg1.method1863());
		Static81.aClass3_Sub12_Sub1_2.method1937(arg0);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)V")
	public static void method1208() {
		aClass60_823 = null;
		aClass60_825 = null;
		aClass60_824 = null;
		anIntArray206 = null;
		aClass60_822 = null;
		aByteArrayArrayArray4 = null;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public static void method1209() {
		Static21.aClass79_1.anInt3385 = 0;
		Static112.aBoolean108 = true;
		Static29.anInt1001 = 0;
		Static129.aLong108 = 0L;
		Static12.aBoolean14 = true;
		Static13.method356();
		Static22.anInt872 = 0;
		Static111.anInt3098 = 0;
		Static21.anInt867 = -1;
		Static67.aBoolean69 = false;
		Static115.anInt3204 = -1;
		Static31.anInt1105 = 0;
		Static81.aClass3_Sub12_Sub1_2.anInt2886 = 0;
		Static67.anInt2121 = -1;
		Static11.anInt345 = 0;
		Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
		Static32.anInt1114 = 0;
		Static13.anInt404 = -1;
		Static15.method432(0);
		for (@Pc(1972) int local1972 = 0; local1972 < 100; local1972++) {
			Static126.aClass60Array23[local1972] = null;
		}
		Static64.anInt2045 = 0;
		Static73.anInt2349 = 0;
		Static19.anInt3409 = (int) (Math.random() * 80.0D) - 40;
		Static53.anInt1744 = 0;
		Static31.anInt1107 = 0;
		Static107.anInt3040 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static58.anInt1802 = 0;
		Static55.anInt1762 = -1;
		Static43.anInt1424 = (int) (Math.random() * 30.0D) - 20;
		Static125.anInt3376 = (int) (Math.random() * 110.0D) - 55;
		Static20.anInt829 = 0;
		Static39.anInt1294 = (int) (Math.random() * 120.0D) - 60;
		Static72.aBoolean85 = false;
		Static128.anInt3458 = (int) (Math.random() * 100.0D) - 50;
		Static77.anInt2428 = 0;
		for (@Pc(2051) int local2051 = 0; local2051 < 2048; local2051++) {
			Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local2051] = null;
			Static2.aClass3_Sub12Array1[local2051] = null;
		}
		for (@Pc(2069) int local2069 = 0; local2069 < 32768; local2069++) {
			Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local2069] = null;
		}
		Static120.aClass3_Sub1_Sub1_Sub3_Sub1_1 = Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[2047] = new Class3_Sub1_Sub1_Sub3_Sub1();
		Static112.aClass5_21.method91();
		Static108.aClass5_20.method91();
		@Pc(2099) int local2099;
		@Pc(2103) int local2103;
		for (@Pc(2095) int local2095 = 0; local2095 < 4; local2095++) {
			for (local2099 = 0; local2099 < 104; local2099++) {
				for (local2103 = 0; local2103 < 104; local2103++) {
					Static34.aClass5ArrayArrayArray1[local2095][local2099][local2103] = null;
				}
			}
		}
		Static80.aClass5_18 = new Class5();
		Static51.anInt1366 = 0;
		Static61.anInt1946 = 0;
		for (local2099 = 0; local2099 < Static48.anInt1549; local2099++) {
			@Pc(2145) Class3_Sub1_Sub13 local2145 = Static97.method1824(local2099);
			if (local2145 != null && local2145.anInt2406 == 0) {
				Static70.anIntArray223[local2099] = 0;
				Static18.anIntArray80[local2099] = 0;
			}
		}
		for (local2103 = 0; local2103 < Static118.anIntArray343.length; local2103++) {
			Static118.anIntArray343[local2103] = -1;
		}
		for (@Pc(2181) int local2181 = 0; local2181 < Static22.anIntArray87.length; local2181++) {
			if (Static22.anIntArray87[local2181] != -1) {
				Static119.method2149(Static22.anIntArray87[local2181]);
				Static22.anIntArray87[local2181] = -1;
			}
		}
		Static119.method2149(Static129.anInt3460);
		Static129.anInt3460 = -1;
		Static119.method2149(Static78.anInt2429);
		Static78.anInt2429 = -1;
		Static119.method2149(Static79.anInt2467);
		Static79.anInt2467 = -1;
		Static119.method2149(Static114.anInt3185);
		Static114.anInt3185 = -1;
		Static119.method2149(Static57.anInt3397);
		Static57.anInt3397 = -1;
		Static119.method2149(Static119.anInt3242);
		Static119.anInt3242 = -1;
		Static119.method2149(Static46.anInt1446);
		Static96.anInt2745 = -1;
		Static3.anInt124 = 0;
		Static32.anInt1115 = -1;
		Static127.aClass60_1156 = null;
		Static51.anInt1340 = 3;
		Static103.anInt2994 = 0;
		Static56.aBoolean56 = false;
		Static46.anInt1446 = -1;
		Static67.aBoolean69 = false;
		Static65.aClass50_2.method1635(false, new int[5], null, -1);
		for (@Pc(2263) int local2263 = 0; local2263 < 5; local2263++) {
			Static12.aClass60Array1[local2263] = null;
			Static130.aBooleanArray72[local2263] = false;
		}
		Static78.method1574();
		Static96.aBoolean101 = true;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V")
	public static void method1210(@OriginalArg(0) int arg0) {
		@Pc(12) Class3_Sub13 local12 = (Class3_Sub13) Static16.aClass82_1.method2305((long) arg0);
		if (local12 != null) {
			for (@Pc(17) int local17 = 0; local17 < local12.anIntArray214.length; local17++) {
				local12.anIntArray214[local17] = -1;
				local12.anIntArray213[local17] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B[Lclient!qf;)Lclient!qf;")
	public static Class60 method1211(@OriginalArg(1) Class60[] arg0) {
		if (arg0.length < 2) {
			throw new IllegalArgumentException();
		}
		return Static95.method1787(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILclient!mc;)V")
	public static void method1212(@OriginalArg(1) Class3_Sub2 arg0) {
		arg0.aBoolean119 = false;
		if (arg0.aClass3_Sub9_5 != null) {
			arg0.aClass3_Sub9_5.anInt1101 = 0;
		}
		for (@Pc(14) Class3_Sub2 local14 = arg0.method2166(); local14 != null; local14 = arg0.method2167()) {
			method1212(local14);
		}
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)Z")
	public static boolean method1213() {
		try {
			if (Static104.anInt3014 == 2) {
				if (Static61.aClass3_Sub14_1 == null) {
					Static61.aClass3_Sub14_1 = Static134.method1476(Static66.aClass25_21, Static72.anInt2244, Static93.anInt2670);
					if (Static61.aClass3_Sub14_1 == null) {
						return false;
					}
				}
				if (Static80.aClass28_1 == null) {
					Static80.aClass28_1 = new Class28(Static118.aClass25_32, Static85.aClass25_26);
				}
				if (Static30.aClass3_Sub2_Sub4_1.method2171(Static80.aClass28_1, Static61.aClass3_Sub14_1, Static101.aClass25_30)) {
					Static30.aClass3_Sub2_Sub4_1.method2200();
					Static30.aClass3_Sub2_Sub4_1.method2188(Static104.anInt3013);
					Static30.aClass3_Sub2_Sub4_1.method2177(Static61.aClass3_Sub14_1, Static35.aBoolean36);
					Static66.aClass25_21 = null;
					Static80.aClass28_1 = null;
					Static61.aClass3_Sub14_1 = null;
					Static104.anInt3014 = 0;
					return true;
				}
			}
		} catch (@Pc(61) Exception local61) {
			local61.printStackTrace();
			Static30.aClass3_Sub2_Sub4_1.method2204();
			Static66.aClass25_21 = null;
			Static61.aClass3_Sub14_1 = null;
			Static80.aClass28_1 = null;
			Static104.anInt3014 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)V")
	public static void method1214() {
		Static115.anInt3204 = -1;
		Static22.anInt872 = 0;
		Static11.anInt345 = 0;
		Static64.anInt2045 = 0;
		Static67.anInt2121 = -1;
		Static81.aClass3_Sub12_Sub1_2.anInt2886 = 0;
		Static31.anInt1105 = 0;
		Static67.aBoolean69 = false;
		Static13.anInt404 = -1;
		Static79.aClass3_Sub12_Sub1_1.anInt2886 = 0;
		Static58.anInt1794 = 0;
		Static77.anInt2428 = 0;
		Static21.anInt867 = -1;
		for (@Pc(35) int local35 = 0; local35 < Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3.length; local35++) {
			if (Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local35] != null) {
				Static127.aClass3_Sub1_Sub1_Sub3_Sub1Array3[local35].anInt1523 = -1;
			}
		}
		for (@Pc(65) int local65 = 0; local65 < Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1.length; local65++) {
			if (Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local65] != null) {
				Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local65].anInt1523 = -1;
			}
		}
		Static78.method1574();
		Static50.method1075(30);
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lclient!la;IZ)Lclient!qf;")
	public static Class60 method1215(@OriginalArg(0) Class3_Sub12 arg0) {
		try {
			@Pc(7) Class60 local7 = new Class60();
			local7.anInt2817 = arg0.method1948();
			if (local7.anInt2817 > 32767) {
				local7.anInt2817 = 32767;
			}
			local7.aByteArray73 = new byte[local7.anInt2817];
			arg0.anInt2886 += Static73.aClass21_1.method731(arg0.aByteArray77, arg0.anInt2886, local7.anInt2817, 0, local7.aByteArray73);
			return local7;
		} catch (@Pc(53) Exception local53) {
			return Static26.aClass60_378;
		}
	}
}
