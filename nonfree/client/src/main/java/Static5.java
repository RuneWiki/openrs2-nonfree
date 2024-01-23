import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static5 {

	@OriginalMember(owner = "client!ad", name = "l", descriptor = "Lclient!ee;")
	public static Class27 aClass27_1;

	@OriginalMember(owner = "client!ad", name = "q", descriptor = "Lclient!oh;")
	public static Class1_Sub1_Sub10 aClass1_Sub1_Sub10_1;

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "Lclient!hh;")
	public static Class50 aClass50_35 = Static186.method3527("Weiter");

	@OriginalMember(owner = "client!ad", name = "i", descriptor = "Lclient!rh;")
	public static Class78_Sub1 aClass78_Sub1_1 = null;

	@OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
	public static int anInt101 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
	public static void method74() {
		Static31.aClass84_12.method2577(5);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILclient!th;)V")
	public static void method76(@OriginalArg(1) Applet_Sub1 arg0) {
		Static23.method334();
		if (Static140.aClass73_1 != null) {
			return;
		}
		if (!Static164.aBoolean142) {
			Static157.method2602();
		} else if (Static2.anInt59 == 1) {
			@Pc(28) int local28 = Static80.anInt1585 / 5;
			@Pc(34) int local34 = Static104.anInt2081 + local28 + 140;
			if (local34 <= Static70.anInt1323 && local34 + 14 >= Static70.anInt1323 && Static163.anInt3374 >= Static151.anInt3153 + 4 && Static163.anInt3374 <= Static151.anInt3153 + 18) {
				Static183.method3006(0, 0);
				return;
			}
			if (local34 + 15 <= Static70.anInt1323 && Static70.anInt1323 <= local34 + 80 && Static151.anInt3153 + 4 <= Static163.anInt3374 && Static151.anInt3153 + 18 >= Static163.anInt3374) {
				Static183.method3006(1, 0);
				return;
			}
			@Pc(100) int local100 = Static104.anInt2081 + local28 + 250;
			if (Static70.anInt1323 >= local100 && local100 + 14 >= Static70.anInt1323 && Static151.anInt3153 + 4 <= Static163.anInt3374 && Static163.anInt3374 <= Static151.anInt3153 + 18) {
				Static183.method3006(0, 1);
				return;
			}
			if (local100 + 15 <= Static70.anInt1323 && Static70.anInt1323 <= local100 + 80 && Static163.anInt3374 >= Static151.anInt3153 + 4 && Static163.anInt3374 <= Static151.anInt3153 + 18) {
				Static183.method3006(1, 1);
				return;
			}
			@Pc(178) int local178 = local28 + Static104.anInt2081 + 360;
			if (Static70.anInt1323 >= local178 && Static70.anInt1323 <= local178 + 14 && Static151.anInt3153 + 4 <= Static163.anInt3374 && Static163.anInt3374 <= Static151.anInt3153 + 18) {
				Static183.method3006(0, 2);
				return;
			}
			if (local178 + 15 <= Static70.anInt1323 && Static70.anInt1323 <= local178 + 80 && Static151.anInt3153 + 4 <= Static163.anInt3374 && Static151.anInt3153 + 18 >= Static163.anInt3374) {
				Static183.method3006(1, 2);
				return;
			}
			@Pc(241) int local241 = Static104.anInt2081 + local28 + 470;
			if (local241 <= Static70.anInt1323 && Static70.anInt1323 <= local241 + 14 && Static163.anInt3374 >= Static151.anInt3153 + 4 && Static151.anInt3153 + 18 >= Static163.anInt3374) {
				Static183.method3006(0, 3);
				return;
			}
			if (Static70.anInt1323 >= local241 + 15 && Static70.anInt1323 <= local241 + 80 && Static163.anInt3374 >= Static151.anInt3153 + 4 && Static151.anInt3153 + 18 >= Static163.anInt3374) {
				Static183.method3006(1, 3);
				return;
			}
			if (Static107.anInt2133 != -1) {
				@Pc(309) Class106 local309 = Static53.aClass106Array1[Static107.anInt2133];
				if (local309.aBoolean184 == Static224.aBoolean3) {
					@Pc(329) byte[] local329 = Static17.method257(new Class50[] { local309.aClass50_1262, Static9.aClass50_86 }).method1230();
					Static20.aString1 = new String(local329, 0, local329.length);
					Static59.anInt1179 = local309.anInt3934;
					if (Static46.anInt954 != 0) {
						Static8.anInt192 = Static59.anInt1179 + 40000;
						Static8.anInt188 = Static59.anInt1179 + 50000;
						Static14.anInt261 = Static8.anInt192;
					}
					if (Static143.aClass93_85 != null) {
						Static143.aClass93_85.aBoolean165 = true;
						Static66.method999(Static143.aClass93_85);
					}
					return;
				}
				@Pc(363) Class50 local363 = Static119.aClass50_813;
				if (Static46.anInt954 != 0) {
					local363 = Static17.method257(new Class50[] { Static216.aClass50_1345, Static160.method2684(local309.anInt3934 + 7000) });
				}
				@Pc(458) Class50 local458 = Static17.method257(new Class50[] { Static98.aClass50_648, local309.aClass50_1262, Static9.aClass50_86, local363, Static217.aClass50_1348, Static160.method2684(Static195.anInt3972), Static104.aClass50_676, Static160.method2684(Static107.anInt2137), Static133.aClass50_929, Static160.method2684(0), Static198.aClass50_1291, Static160.method2684(Static201.anInt4058), Static54.aClass50_384, Static160.method2684(Static112.anInt2225) });
				try {
					arg0.getAppletContext().showDocument(local458.method1212(), "_self");
					return;
				} catch (@Pc(467) Exception local467) {
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!pa;I)V")
	public static void method77(@OriginalArg(0) Class86 arg0) {
		Static213.aClass86_78 = arg0;
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIB)I")
	public static int method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16 = 65536 - Class120.anIntArray492[arg1 * 1024 / arg2] >> 1;
		return (arg3 * local16 >> 16) + (arg0 * (65536 - local16) >> 16);
	}

	@OriginalMember(owner = "client!ad", name = "c", descriptor = "(B)Lclient!hh;")
	public static Class50 method80() {
		@Pc(5) Class50 local5 = Static181.aClass50_1223;
		if (Static46.anInt954 != 0) {
			local5 = Static27.aClass50_203;
		}
		return Static17.method257(new Class50[] { Static38.aClass50_301, local5, Static16.aClass50_128, Static160.method2684(Static195.anInt3972), Static95.aClass50_613, Static160.method2684(Static107.anInt2137), Static129.aClass50_893 });
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IILclient!sh;)V")
	public static void method84(@OriginalArg(1) int arg0, @OriginalArg(2) Class20_Sub3 arg1) {
		if (Static107.anInt2132 < arg1.anInt3028) {
			Static226.method3432(arg1);
		} else if (arg1.anInt3030 >= Static107.anInt2132) {
			Static121.method1935(arg1);
		} else {
			Static33.method486(arg1);
		}
		if (arg1.anInt3022 < 128 || arg1.anInt3008 < 128 || arg1.anInt3022 >= 13184 || arg1.anInt3008 >= 13184) {
			arg1.anInt3022 = arg1.anInt3034 * 64 + arg1.anIntArray311[0] * 128;
			arg1.anInt3008 = arg1.anIntArray313[0] * 128 + arg1.anInt3034 * 64;
			arg1.anInt3058 = -1;
			arg1.anInt3028 = 0;
			arg1.anInt3060 = -1;
			arg1.anInt3030 = 0;
			arg1.method2468();
		}
		if (arg1 == Static230.aClass20_Sub3_Sub1_3 && (arg1.anInt3022 < 1536 || arg1.anInt3008 < 1536 || arg1.anInt3022 >= 11776 || arg1.anInt3008 >= 11776)) {
			arg1.anInt3022 = arg1.anIntArray311[0] * 128 + arg1.anInt3034 * 64;
			arg1.anInt3008 = arg1.anIntArray313[0] * 128 + arg1.anInt3034 * 64;
			arg1.anInt3028 = 0;
			arg1.anInt3058 = -1;
			arg1.anInt3030 = 0;
			arg1.anInt3060 = -1;
			arg1.method2468();
		}
		Static121.method1934(arg1);
		Static198.method3181(arg1);
	}
}
