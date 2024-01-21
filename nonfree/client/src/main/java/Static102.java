import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static102 {

	@OriginalMember(owner = "client!qf", name = "l", descriptor = "I")
	public static int anInt2365;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1117 = Static78.method1313("Titelbild geladen)3");

	@OriginalMember(owner = "client!qf", name = "c", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1118 = Static78.method1313(":tradereq:");

	@OriginalMember(owner = "client!qf", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1119 = Static78.method1313("Wen m-Ochten Sie hinzuf-Ugen?");

	@OriginalMember(owner = "client!qf", name = "f", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1120 = Static78.method1313("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!qf", name = "h", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1121 = Static78.method1313("Duell akzeptieren");

	@OriginalMember(owner = "client!qf", name = "j", descriptor = "[I")
	public static int[] anIntArray413 = new int[500];

	@OriginalMember(owner = "client!qf", name = "k", descriptor = "[Lclient!od;")
	public static Class62[] aClass62Array1 = new Class62[4];

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "Lclient!fc;")
	private static Class25 aClass25_1123 = Static78.method1313("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!qf", name = "n", descriptor = "Lclient!fc;")
	public static Class25 aClass25_1122 = aClass25_1123;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)V")
	public static void method1682() {
		Class68.anIntArray412 = null;
		aClass62Array1 = null;
		aClass25_1119 = null;
		aClass25_1120 = null;
		aClass25_1121 = null;
		anIntArray413 = null;
		aClass25_1117 = null;
		aClass25_1122 = null;
		aClass25_1123 = null;
		aClass25_1118 = null;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(B)V")
	public static void method1683() {
		while (true) {
			@Pc(10) Class2 local10 = Static7.aClass2_2;
			@Pc(17) Class1_Sub15 local17;
			synchronized (Static7.aClass2_2) {
				local17 = (Class1_Sub15) Static26.aClass2_4.method20();
			}
			if (local17 == null) {
				return;
			}
			local17.aClass56_Sub1_14.method1297((int) local17.aLong184, local17.aByteArray22, local17.aClass70_3, false);
		}
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!oc;Lclient!oc;ZLclient!ma;)V")
	public static void method1684(@OriginalArg(1) Class56 arg0, @OriginalArg(2) Class56 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class1_Sub2_Sub2_Sub3 arg3) {
		Static34.aClass56_31 = arg1;
		Static37.aBoolean44 = arg2;
		Static99.aClass56_71 = arg0;
		Static56.anInt1324 = Static99.aClass56_71.method1279(10);
		Static88.aClass1_Sub2_Sub2_Sub3_4 = arg3;
	}

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(B)V")
	public static void method1685() {
		Static118.method1906();
		if (Static108.anInt2494 == 1) {
			Static60.aClass1_Sub2_Sub2_Sub1Array5[Static9.anInt249 / 100].method204(Static10.anInt270 - 8 - 4, Static65.anInt1451 + -4 - 8);
		}
		if (Static108.anInt2494 == 2) {
			Static60.aClass1_Sub2_Sub2_Sub1Array5[Static9.anInt249 / 100 + 4].method204(Static10.anInt270 - 12, Static65.anInt1451 + -4 + -8);
		}
		if (Static2.anInt29 != -1) {
			Static24.method571(Static2.anInt29);
			Static25.method589(Static2.anInt29, 334, 4, 512);
		}
		if (Static108.anInt2497 != -1) {
			Static24.method571(Static108.anInt2497);
			Static25.method589(Static108.anInt2497, 334, 0, 512);
		}
		Static90.method1515();
		if (!Static82.aBoolean77) {
			Static110.method1776();
			Static15.method360();
		} else if (Static42.anInt1133 == 0) {
			Static27.method601();
		}
		if (Static50.anInt1233 == 1) {
			Static90.aClass1_Sub2_Sub2_Sub1_9.method204(472, 296);
		}
		@Pc(145) int local145;
		if (Static87.aBoolean63) {
			@Pc(112) byte local112 = 20;
			Static42.aClass1_Sub2_Sub2_Sub3_1.method1184(Static116.method1859(new Class25[] { Static109.aClass25_1209, Static74.method1214(Static107.anInt2487) }), 507, 20, 16776960, -1);
			@Pc(134) Runtime local134 = Runtime.getRuntime();
			@Pc(144) int local144 = (int) ((local134.totalMemory() - local134.freeMemory()) / 1024L);
			local145 = local112 + 15;
			@Pc(147) int local147 = 16776960;
			if (local144 > 32768 && Static63.aBoolean55) {
				local147 = 16711680;
			}
			if (local144 > 65536 && !Static63.aBoolean55) {
				local147 = 16711680;
			}
			Static42.aClass1_Sub2_Sub2_Sub3_1.method1184(Static116.method1859(new Class25[] { Static126.aClass25_1417, Static74.method1214(local144), Static9.aClass25_134 }), 507, 35, local147, -1);
			local145 += 15;
			if (Static124.aBoolean129) {
				Static42.aClass1_Sub2_Sub2_Sub3_1.method1184(Static22.aClass25_346, 507, 50, 16711680, -1);
				Static124.aBoolean129 = false;
				local145 += 15;
			}
			if (Static96.aBoolean125) {
				Static42.aClass1_Sub2_Sub2_Sub3_1.method1184(Static111.aClass25_1257, 507, local145, 16711680, -1);
				local145 += 15;
				Static96.aBoolean125 = false;
			}
			if (Static55.aBoolean52) {
				Static42.aClass1_Sub2_Sub2_Sub3_1.method1184(Static13.aClass25_199, 507, local145, 16711680, -1);
				Static55.aBoolean52 = false;
				local145 += 15;
			}
		}
		if (Static105.anInt2386 == 0) {
			return;
		}
		@Pc(233) int local233 = Static105.anInt2386 / 50;
		local145 = local233 / 60;
		@Pc(241) int local241 = local233 % 60;
		if (local241 >= 10) {
			Static42.aClass1_Sub2_Sub2_Sub3_1.method1180(Static116.method1859(new Class25[] { Static28.aClass25_335, Static74.method1214(local145), Static6.aClass25_55, Static74.method1214(local241) }), 4, 329, 16776960, -1);
		} else {
			Static42.aClass1_Sub2_Sub2_Sub3_1.method1180(Static116.method1859(new Class25[] { Static28.aClass25_335, Static74.method1214(local145), Static112.aClass25_1270, Static74.method1214(local241) }), 4, 329, 16776960, -1);
		}
	}
}
