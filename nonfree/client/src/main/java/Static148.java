import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!pi", name = "g", descriptor = "[I")
	public static int[] anIntArray279;

	@OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
	public static int anInt3288;

	@OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
	public static int anInt3290;

	@OriginalMember(owner = "client!pi", name = "x", descriptor = "I")
	public static int anInt3297;

	@OriginalMember(owner = "client!pi", name = "P", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!pi", name = "R", descriptor = "Lclient!jj;")
	public static Class53 aClass53_4;

	@OriginalMember(owner = "client!pi", name = "T", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!pi", name = "A", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_972 = Static81.method1507(":duelfriend:");

	@OriginalMember(owner = "client!pi", name = "H", descriptor = "[Lclient!la;")
	public static final Class5_Sub2_Sub2[] aClass5_Sub2_Sub2Array1 = new Class5_Sub2_Sub2[32768];

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(II)V")
	public static void method2538(@OriginalArg(1) int arg0) {
		Static163.method2736();
		Static102.method1756();
		@Pc(18) int local18 = Static50.method908(arg0).anInt237;
		if (local18 == 0) {
			return;
		}
		@Pc(28) int local28 = Static122.anIntArray213[arg0];
		if (local18 == 1) {
			Static163.anInt3581 = local28;
			if (Static163.anInt3581 == 1) {
				Static182.method3143(0.9F);
			}
			if (Static163.anInt3581 == 2) {
				Static182.method3143(0.8F);
			}
			if (Static163.anInt3581 == 3) {
				Static182.method3143(0.7F);
			}
			if (Static163.anInt3581 == 4) {
				Static182.method3143(0.6F);
			}
			Static84.method1554();
		}
		if (local18 == 3) {
			@Pc(72) short local72 = 0;
			if (local28 == 0) {
				local72 = 255;
			}
			if (local28 == 1) {
				local72 = 192;
			}
			if (local28 == 2) {
				local72 = 128;
			}
			if (local28 == 3) {
				local72 = 64;
			}
			if (local28 == 4) {
				local72 = 0;
			}
			if (Static79.anInt1892 != local72) {
				if (Static79.anInt1892 == 0 && Static66.anInt1656 != -1) {
					Static155.method2245(local72, Static66.anInt1656, Static186.aClass69_Sub1_26);
					Static173.aBoolean177 = false;
				} else if (local72 == 0) {
					Static144.method2512();
					Static173.aBoolean177 = false;
				} else {
					Static134.method2285(local72);
				}
				Static79.anInt1892 = local72;
			}
		}
		if (local18 == 6) {
			Static10.anInt1517 = local28;
		}
		if (local18 == 10) {
			if (local28 == 0) {
				Static200.anInt4473 = 127;
			}
			if (local28 == 1) {
				Static200.anInt4473 = 96;
			}
			if (local28 == 2) {
				Static200.anInt4473 = 64;
			}
			if (local28 == 3) {
				Static200.anInt4473 = 32;
			}
			if (local28 == 4) {
				Static200.anInt4473 = 0;
			}
		}
		if (local18 == 5) {
			Static181.anInt4036 = local28;
		}
		if (local18 == 4) {
			if (local28 == 0) {
				Static194.anInt4325 = 127;
			}
			if (local28 == 1) {
				Static194.anInt4325 = 96;
			}
			if (local28 == 2) {
				Static194.anInt4325 = 64;
			}
			if (local28 == 3) {
				Static194.anInt4325 = 32;
			}
			if (local28 == 4) {
				Static194.anInt4325 = 0;
			}
		}
		if (local18 == 9) {
			Static144.anInt3253 = local28;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
	public static void method2539() {
		Static176.aClass1_Sub7_Sub1_34.method2808(235);
		for (@Pc(16) Class1_Sub11 local16 = (Class1_Sub11) Static115.aClass57_25.method1876(); local16 != null; local16 = (Class1_Sub11) Static115.aClass57_25.method1873()) {
			if (local16.anInt2168 == 0) {
				Static66.method1316(local16, true);
			}
		}
		if (Static10.aClass98_10 != null) {
			Static199.method2199(Static10.aClass98_10);
			Static10.aClass98_10 = null;
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(ZLclient!ve;II)Lclient!od;")
	public static Class1_Sub2_Sub8_Sub3 method2540(@OriginalArg(1) Class69 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return Static149.method2564(arg1, arg2, arg0) ? Static122.method2070() : null;
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)V")
	public static void method2541() {
		Static24.anInt663 = 0;
		Static160.anInt4675 = 0;
		Static112.method1890();
		Static17.method392();
		Static47.method854();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static160.anInt4675; local19++) {
			local25 = Static57.anIntArray125[local19];
			if (aClass5_Sub2_Sub2Array1[local25].anInt2489 != Static42.anInt1100) {
				aClass5_Sub2_Sub2Array1[local25].aClass1_Sub2_Sub21_1 = null;
				aClass5_Sub2_Sub2Array1[local25] = null;
			}
		}
		if (Static192.aClass1_Sub7_Sub1_31.anInt3592 != Static80.anInt1916) {
			throw new RuntimeException("gnp1 pos:" + Static192.aClass1_Sub7_Sub1_31.anInt3592 + " psize:" + Static80.anInt1916);
		}
		for (local25 = 0; local25 < Static138.anInt3107; local25++) {
			if (aClass5_Sub2_Sub2Array1[Static138.anIntArray254[local25]] == null) {
				throw new RuntimeException("gnp2 pos:" + local25 + " size:" + Static138.anInt3107);
			}
		}
	}

	@OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)V")
	public static void method2543(@OriginalArg(0) int arg0) {
		Static70.anInt3208 = -1;
		Static2.anInt111 = arg0;
		Static49.anInt1247 = -1;
		Static137.method2410();
	}
}
