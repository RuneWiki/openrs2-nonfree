import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!h", name = "b", descriptor = "Lclient!sc;")
	private static Class107 aClass107_493 = Static231.method3737("Loaded sprites");

	@OriginalMember(owner = "client!h", name = "e", descriptor = "Lclient!sc;")
	private static Class107 aClass107_494 = Static231.method3737("glow1:");

	@OriginalMember(owner = "client!h", name = "h", descriptor = "I")
	public static int anInt1703 = 0;

	@OriginalMember(owner = "client!h", name = "i", descriptor = "[I")
	public static int[] anIntArray161 = new int[100];

	@OriginalMember(owner = "client!h", name = "j", descriptor = "Lclient!sc;")
	public static Class107 aClass107_495 = aClass107_494;

	@OriginalMember(owner = "client!h", name = "o", descriptor = "[Lclient!ki;")
	public static Class68[] aClass68Array1 = new Class68[4];

	@OriginalMember(owner = "client!h", name = "p", descriptor = "Lclient!sc;")
	public static Class107 aClass107_496 = aClass107_493;

	@OriginalMember(owner = "client!h", name = "s", descriptor = "Lclient!sc;")
	public static Class107 aClass107_497 = aClass107_494;

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(ZIIIIII)V")
	public static void method1340(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static130.anInt2832 = arg5;
		Static122.anInt2672 = arg2;
		Static159.anInt3503 = arg1;
		Static105.anInt2299 = arg3;
		Static179.anInt3924 = arg4;
		if (arg0 && Static130.anInt2832 >= 100) {
			Static22.anInt435 = Static122.anInt2672 * 128 + 64;
			Static29.anInt577 = Static105.anInt2299 * 128 + 64;
			Static69.anInt1578 = Static130.method2174(Static191.anInt4237, Static29.anInt577, Static22.anInt435) - Static179.anInt3924;
		}
		Static61.anInt1480 = 2;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I)Lclient!pg;")
	public static Class64 method1341() {
		@Pc(32) Class64_Sub1 local32 = new Class64_Sub1(Static155.anInt432, Static182.anInt4094, Static56.anIntArray124[0], Static223.anIntArray373[0], Static141.anIntArray266[0], Static172.anIntArray329[0], Static158.aByteArrayArray7[0], Static169.anIntArray324);
		Static158.method2564();
		return local32;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIBIZI)V")
	public static void method1342(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		if (arg3 == Static123.anInt2686 && Static220.anInt4826 == arg0 && (arg2 == Static166.anInt4347 || Static155.method412())) {
			return;
		}
		Static166.anInt4347 = arg2;
		Static220.anInt4826 = arg0;
		Static123.anInt2686 = arg3;
		if (Static155.method412()) {
			Static166.anInt4347 = 0;
		}
		Static52.method1046(25);
		Static172.method2741(true, Static26.aClass107_179);
		@Pc(61) int local61 = Static36.anInt764;
		@Pc(63) int local63 = Static152.anInt3377;
		Static36.anInt764 = arg3 * 8 - 48;
		Static152.anInt3377 = arg0 * 8 - 48;
		Static97.aClass1_Sub2_Sub6_16 = Static32.method602(Static123.anInt2686 * 8, Static220.anInt4826 * 8);
		@Pc(89) int local89 = Static152.anInt3377 - local63;
		@Pc(96) int local96 = Static36.anInt764 - local61;
		@Pc(199) int local199;
		@Pc(209) int local209;
		for (local199 = 0; local199 < 32768; local199++) {
			@Pc(205) Class5_Sub5_Sub2 local205 = Static33.aClass5_Sub5_Sub2Array1[local199];
			if (local205 != null) {
				for (local209 = 0; local209 < 10; local209++) {
					local205.anIntArray260[local209] -= local96;
					local205.anIntArray256[local209] -= local89;
				}
				local205.anInt3021 -= local96 * 128;
				local205.anInt3044 -= local89 * 128;
			}
		}
		for (local199 = 0; local199 < 2048; local199++) {
			@Pc(259) Class5_Sub5_Sub1 local259 = Static198.aClass5_Sub5_Sub1Array1[local199];
			if (local259 != null) {
				for (local209 = 0; local209 < 10; local209++) {
					local259.anIntArray260[local209] -= local96;
					local259.anIntArray256[local209] -= local89;
				}
				local259.anInt3044 -= local89 * 128;
				local259.anInt3021 -= local96 * 128;
			}
		}
		Static191.anInt4237 = arg2;
		Static204.aClass5_Sub5_Sub1_2.method2311(arg4, false, arg1);
		@Pc(317) byte local317 = 104;
		@Pc(319) byte local319 = 0;
		@Pc(321) byte local321 = 0;
		@Pc(323) byte local323 = 104;
		@Pc(325) byte local325 = 1;
		if (local89 < 0) {
			local325 = -1;
			local323 = -1;
			local321 = 103;
		}
		@Pc(335) byte local335 = 1;
		if (local96 < 0) {
			local335 = -1;
			local319 = 103;
			local317 = -1;
		}
		for (@Pc(345) int local345 = local319; local345 != local317; local345 += local335) {
			for (@Pc(349) int local349 = local321; local349 != local323; local349 += local325) {
				@Pc(355) int local355 = local96 + local345;
				@Pc(359) int local359 = local89 + local349;
				for (@Pc(361) int local361 = 0; local361 < 4; local361++) {
					if (local355 >= 0 && local359 >= 0 && local355 < 104 && local359 < 104) {
						Static195.aClass120ArrayArrayArray2[local361][local345][local349] = Static195.aClass120ArrayArrayArray2[local361][local355][local359];
					} else {
						Static195.aClass120ArrayArrayArray2[local361][local345][local349] = null;
					}
				}
			}
		}
		for (@Pc(424) Class1_Sub24 local424 = (Class1_Sub24) Static86.aClass120_10.method3564(); local424 != null; local424 = (Class1_Sub24) Static86.aClass120_10.method3561()) {
			local424.anInt3735 -= local96;
			local424.anInt3739 -= local89;
			if (local424.anInt3735 < 0 || local424.anInt3739 < 0 || local424.anInt3735 >= 104 || local424.anInt3739 >= 104) {
				local424.method3735();
			}
		}
		if (Static184.anInt4144 != 0) {
			Static95.anInt2072 -= local89;
			Static184.anInt4144 -= local96;
		}
		Static61.anInt1480 = 1;
		Static204.anInt2501 = 0;
		Static18.anInt383 = -1;
		Static106.aClass120_12.method3560();
		Static13.aClass120_2.method3560();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIB)V")
	public static void method1343(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static217.anInt4746 == 1) {
			Static201.aClass1_Sub2_Sub2Array10[Static228.anInt4955 / 100].method189(Static163.anInt3549 - 8, Static118.anInt2619 + -8);
		}
		if (Static217.anInt4746 == 2) {
			Static201.aClass1_Sub2_Sub2Array10[Static228.anInt4955 / 100 + 4].method189(Static163.anInt3549 - 8, Static118.anInt2619 - 8);
		}
		Static230.method3730();
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIII)V")
	public static void method1344(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static107.anInt2345 < 100) {
			Static203.method187();
		}
		Static205.method3251(arg1, arg3, arg1 + arg0, arg2 + arg3);
		@Pc(29) int local29;
		@Pc(42) int local42;
		if (Static107.anInt2345 < 100) {
			local29 = arg1 + arg0 / 2;
			local42 = arg3 + arg2 / 2 - 20 - 18;
			Static205.method3250(arg1, arg3, arg0, arg2, 0);
			Static205.method3249(local29 - 152, local42, 304, 34, 9179409);
			Static205.method3249(local29 - 151, local42 + 1, 302, 32, 0);
			Static205.method3250(local29 - 150, local42 + 2, Static107.anInt2345 * 3, 30, 9179409);
			Static205.method3250(local29 + Static107.anInt2345 * 3 - 150, local42 + 2, 300 - Static107.anInt2345 * 3, 30, 0);
			Static175.aClass1_Sub2_Sub15_3.method3327(Static177.aClass107_1047, local29, local42 + 20, 16777215, -1);
			return;
		}
		@Pc(117) int local117 = Static10.anInt284 - (int) ((float) arg0 / Static4.aFloat10);
		Static153.anInt3387 = (int) ((float) (arg2 * 2) / Static4.aFloat10);
		Static23.anInt441 = Static10.anInt284 - (int) ((float) arg0 / Static4.aFloat10);
		Static125.anInt2702 = Static114.anInt2509 - (int) ((float) arg2 / Static4.aFloat10);
		local42 = Static10.anInt284 + (int) ((float) arg0 / Static4.aFloat10);
		local29 = Static114.anInt2509 - (int) ((float) arg2 / Static4.aFloat10);
		Static92.anInt1983 = (int) ((float) (arg0 * 2) / Static4.aFloat10);
		@Pc(181) int local181 = (int) ((float) arg2 / Static4.aFloat10) + Static114.anInt2509;
		Static110.method1917(arg1, local117, local181, arg2 + arg3, local29, arg1 + arg0, local42, arg3);
		Static95.method1613(local181, local29, arg3 + arg2, local42, arg3, local117, arg0 + arg1, arg1);
		Static7.method240(local42, local29, arg3, arg1 + arg0, arg2 + arg3, local117, arg1, local181);
		if (Static92.anInt1986 > 0) {
			Static92.anInt1986--;
		}
		if (!Static25.aBoolean39) {
			return;
		}
		@Pc(242) int local242 = arg0 + arg1 - 5;
		@Pc(249) int local249 = arg3 + arg2 - 8;
		Static23.aClass1_Sub2_Sub15_1.method3330(Static149.method2437(new Class107[] { Static123.aClass107_729, Static115.method2001(Static124.anInt2696) }), local242, local249, 16776960, -1);
		@Pc(271) Runtime local271 = Runtime.getRuntime();
		@Pc(273) int local273 = 16776960;
		@Pc(274) int local274 = local249 - 15;
		@Pc(284) int local284 = (int) ((local271.totalMemory() - local271.freeMemory()) / 1024L);
		if (local284 > 65536) {
			local273 = 16711680;
		}
		Static23.aClass1_Sub2_Sub15_1.method3330(Static149.method2437(new Class107[] { Static169.aClass107_997, Static115.method2001(local284), Static87.aClass107_546 }), local242, local274, local273, -1);
		local249 = local274 - 15;
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!jb;BLclient!jb;)V")
	public static void method1345(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		Static19.aClass28_8 = arg0;
		Static43.aClass28_19 = arg1;
	}
}
