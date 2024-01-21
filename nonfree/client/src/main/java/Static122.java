import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static122 {

	@OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
	public static int anInt2898;

	@OriginalMember(owner = "client!pc", name = "lb", descriptor = "[Lclient!na;")
	public static Class3_Sub2_Sub3_Sub2[] aClass3_Sub2_Sub3_Sub2Array5;

	@OriginalMember(owner = "client!pc", name = "T", descriptor = "Lclient!kb;")
	public static Class46 aClass46_998 = Static65.method1172("Unerwartete Antwort vom Anmelde)2Server)3");

	@OriginalMember(owner = "client!pc", name = "W", descriptor = "Lclient!kb;")
	private static Class46 aClass46_999 = Static65.method1172("slide:");

	@OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
	public static int anInt2902 = 0;

	@OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
	public static int anInt2903 = 0;

	@OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
	public static int anInt2904 = -1;

	@OriginalMember(owner = "client!pc", name = "db", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1000 = aClass46_999;

	@OriginalMember(owner = "client!pc", name = "gb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1001 = aClass46_999;

	@OriginalMember(owner = "client!pc", name = "hb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1002 = Static65.method1172("Lade Wordpack )2 ");

	@OriginalMember(owner = "client!pc", name = "pb", descriptor = "Lclient!kb;")
	public static Class46 aClass46_1003 = Static65.method1172("");

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lclient!h;I)Lclient!h;")
	public static Class33 method2083(@OriginalArg(0) Class33 arg0) {
		@Pc(13) int local13 = Static34.method600(Static157.method2541(arg0));
		if (local13 == 0) {
			return null;
		}
		for (@Pc(20) int local20 = 0; local20 < local13; local20++) {
			arg0 = Static179.method2873(arg0.anInt1479);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
	public static void method2085() {
		while (true) {
			if (Static49.aClass3_Sub4_Sub1_2.method232(Static139.anInt3221) >= 11) {
				@Pc(16) int local16 = Static49.aClass3_Sub4_Sub1_2.method228(11);
				if (local16 != 2047) {
					@Pc(21) boolean local21 = false;
					if (Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local16] == null) {
						local21 = true;
						Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local16] = new Class3_Sub2_Sub1_Sub1_Sub1();
						if (Static114.aClass3_Sub4Array1[local16] != null) {
							Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local16].method572(Static114.aClass3_Sub4Array1[local16]);
						}
					}
					Static127.anIntArray338[Static180.anInt3971++] = local16;
					@Pc(57) Class3_Sub2_Sub1_Sub1_Sub1 local57 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local16];
					local57.anInt1734 = Static20.anInt512;
					@Pc(65) int local65 = Static49.aClass3_Sub4_Sub1_2.method228(5);
					if (local65 > 15) {
						local65 -= 32;
					}
					@Pc(78) int local78 = Static21.anIntArray339[Static49.aClass3_Sub4_Sub1_2.method228(3)];
					if (local21) {
						local57.anInt1732 = local57.anInt1736 = local78;
					}
					@Pc(91) int local91 = Static49.aClass3_Sub4_Sub1_2.method228(1);
					if (local91 == 1) {
						Static14.anIntArray25[Static108.anInt2585++] = local16;
					}
					@Pc(107) int local107 = Static49.aClass3_Sub4_Sub1_2.method228(1);
					@Pc(114) int local114 = Static49.aClass3_Sub4_Sub1_2.method228(5);
					if (local114 > 15) {
						local114 -= 32;
					}
					local57.method1168(local107 == 1, local114 + Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray163[0], local65 + Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1.anIntArray160[0]);
					continue;
				}
			}
			Static49.aClass3_Sub4_Sub1_2.method231();
			return;
		}
	}

	@OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
	public static void method2086() {
		aClass46_999 = null;
		aClass46_1000 = null;
		aClass46_1003 = null;
		aClass46_998 = null;
		aClass3_Sub2_Sub3_Sub2Array5 = null;
		aClass46_1002 = null;
		aClass46_1001 = null;
	}

	@OriginalMember(owner = "client!pc", name = "b", descriptor = "(IIII)I")
	public static int method2087(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg1 & 0x3;
		if (local3 == 0) {
			return arg0;
		} else if (local3 == 1) {
			return arg2;
		} else if (local3 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!pc", name = "c", descriptor = "(Z)V")
	public static void method2088() {
		Static42.anInt1170 = 0;
		Static89.aClass84_1.anInt3779 = 0;
		Static89.aBoolean92 = true;
		Static58.aBoolean58 = true;
		Static32.aLong31 = 0L;
		Static14.method298();
		Static57.anInt1552 = -1;
		Static87.anInt2129 = 0;
		Static135.anInt3150 = 0;
		Static72.anInt1850 = -1;
		Static124.anInt2964 = -1;
		Static133.aClass3_Sub4_Sub1_3.anInt232 = 0;
		Static49.aClass3_Sub4_Sub1_2.anInt232 = 0;
		Static34.anInt955 = 0;
		Static156.anInt3496 = -1;
		Static105.aBoolean103 = false;
		Static42.anInt1174 = 0;
		Static163.anInt3623 = 0;
		Static70.method1205(0);
		for (@Pc(2267) int local2267 = 0; local2267 < 100; local2267++) {
			Static143.aClass46Array19[local2267] = null;
		}
		Static142.anInt3266 = (int) (Math.random() * 80.0D) - 40;
		Static127.anInt3014 = 0;
		Static18.anInt423 = 0;
		Static69.anInt1777 = 0;
		Static174.anInt3804 = 0;
		Static81.anInt2039 = (int) (Math.random() * 120.0D) - 60;
		Static146.anInt3350 = (int) (Math.random() * 100.0D) - 50;
		Static97.anInt1739 = 0;
		Static23.anInt532 = -1;
		Static90.aBoolean94 = false;
		Static180.anInt3971 = 0;
		Static20.anInt514 = (int) (Math.random() * 110.0D) - 55;
		Static29.anInt697 = (int) (Math.random() * 20.0D) - 10 & 0x7FF;
		Static172.anInt3773 = (int) (Math.random() * 30.0D) - 20;
		Static88.anInt2165 = 0;
		Static32.anInt911 = 0;
		for (@Pc(2351) int local2351 = 0; local2351 < 2048; local2351++) {
			Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[local2351] = null;
			Static114.aClass3_Sub4Array1[local2351] = null;
		}
		for (@Pc(2369) int local2369 = 0; local2369 < 32768; local2369++) {
			Static126.aClass3_Sub2_Sub1_Sub1_Sub2Array1[local2369] = null;
		}
		Static92.aClass3_Sub2_Sub1_Sub1_Sub1_1 = Static181.aClass3_Sub2_Sub1_Sub1_Sub1Array1[2047] = new Class3_Sub2_Sub1_Sub1_Sub1();
		Static26.aClass59_3.method1741();
		Static181.aClass59_16.method1741();
		@Pc(2401) int local2401;
		@Pc(2405) int local2405;
		for (@Pc(2397) int local2397 = 0; local2397 < 4; local2397++) {
			for (local2401 = 0; local2401 < 104; local2401++) {
				for (local2405 = 0; local2405 < 104; local2405++) {
					Static148.aClass59ArrayArrayArray2[local2397][local2401][local2405] = null;
				}
			}
		}
		Static1.aClass59_1 = new Class59();
		Static52.anInt1391 = 0;
		Static34.anInt954 = 0;
		for (local2401 = 0; local2401 < Static135.anInt3166; local2401++) {
			@Pc(2449) Class3_Sub2_Sub17 local2449 = Static114.method1918(local2401);
			if (local2449 != null && local2449.anInt3952 == 0) {
				Static173.anIntArray424[local2401] = 0;
				Static41.anIntArray419[local2401] = 0;
			}
		}
		for (local2405 = 0; local2405 < Static90.anIntArray227.length; local2405++) {
			Static90.anIntArray227[local2405] = -1;
		}
		if (Static85.anInt674 != -1) {
			Static156.method2535(Static85.anInt674);
		}
		for (@Pc(2491) Class3_Sub12 local2491 = (Class3_Sub12) Static129.aClass54_10.method1598(); local2491 != null; local2491 = (Class3_Sub12) Static129.aClass54_10.method1609()) {
			Static18.method336(true, local2491);
		}
		Static85.anInt674 = -1;
		Static129.aClass54_10 = new Class54(8);
		Static71.aClass33_7 = null;
		Static87.anInt2129 = 0;
		Static105.aBoolean103 = false;
		Static70.aClass64_2.method2121(new int[5], -1, null, false);
		for (@Pc(2527) int local2527 = 0; local2527 < 8; local2527++) {
			Static130.aClass46Array18[local2527] = null;
			Static179.aBooleanArray21[local2527] = false;
		}
		Static9.method256();
		Static59.aBoolean59 = true;
		for (@Pc(2549) int local2549 = 0; local2549 < 100; local2549++) {
			Static178.aBooleanArray20[local2549] = true;
		}
		Static173.aClass46_1358 = null;
		Static90.anInt2207 = 0;
		Static86.aClass3_Sub17Array1 = null;
		for (@Pc(2567) int local2567 = 0; local2567 < 6; local2567++) {
			Static53.aClass29Array1[local2567] = new Class29();
		}
	}

	@OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILclient!jg;BI)Z")
	public static boolean method2089(@OriginalArg(0) int arg0, @OriginalArg(1) Class44 arg1, @OriginalArg(3) int arg2) {
		@Pc(17) byte[] local17 = arg1.method1624(arg2, arg0);
		if (local17 == null) {
			return false;
		} else {
			Static178.method2858(local17);
			return true;
		}
	}
}
