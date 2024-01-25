import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!hb", name = "L", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_72 = new Class131(70, 7);

	@OriginalMember(owner = "client!hb", name = "S", descriptor = "I")
	public static int anInt2448 = 0;

	@OriginalMember(owner = "client!hb", name = "X", descriptor = "I")
	public static int anInt2452 = 0;

	@OriginalMember(owner = "client!hb", name = "cb", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_73 = new Class131(5, 3);

	@OriginalMember(owner = "client!hb", name = "db", descriptor = "Z")
	public static boolean aBoolean133 = false;

	@OriginalMember(owner = "client!hb", name = "eb", descriptor = "F")
	public static float aFloat36 = 1024.0F;

	@OriginalMember(owner = "client!hb", name = "fb", descriptor = "[[I")
	public static final int[][] anIntArrayArray75 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!ss;BLclient!qa;)V")
	public static void method2159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class219 arg2, @OriginalArg(4) Class109 arg3) {
		@Pc(10) Class62 local10 = arg2.method5127(arg3);
		if (local10 == null) {
			return;
		}
		arg3.pa(arg0, arg1, arg0 + arg2.anInt6398, arg2.anInt6363 + arg1);
		if (Static288.anInt5036 == 2 || Static288.anInt5036 == 5 || Static280.aClass80_12 == null) {
			arg3.j(-16777216, local10, arg0, arg1);
			return;
		}
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(52) int local52;
		@Pc(44) int local44;
		if (Static310.anInt5540 == 4) {
			local42 = Static356.anInt6062;
			local44 = 4096;
			local46 = Static57.anInt1180;
			local52 = (int) -Static274.aFloat78 & 0x3FFF;
		} else {
			local46 = Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7065;
			local44 = 4096 - Static427.anInt7386 * 16;
			local52 = (int) -Static274.aFloat78 + Static182.anInt7140 & 0x3FFF;
			local42 = Static196.aClass26_Sub2_Sub2_Sub1_1.anInt7068;
		}
		@Pc(89) int local89 = local42 / 32 + 48 + 208 - Static135.anInt2314 * 2;
		@Pc(106) int local106 = Static352.anInt6022 * 4 + 48 + 208 - local46 / 32 - Static352.anInt6022 * 2;
		Static280.aClass80_12.method6094((float) arg0 + (float) arg2.anInt6398 / 2.0F, (float) arg2.anInt6363 / 2.0F + (float) arg1, (float) local89, (float) local106, local44, local52 << 2, local10, arg0, arg1);
		@Pc(157) int local157;
		@Pc(167) int local167;
		@Pc(178) int local178;
		@Pc(189) int local189;
		for (@Pc(140) Class1_Sub13 local140 = (Class1_Sub13) Static87.aClass266_13.method6000(); local140 != null; local140 = (Class1_Sub13) Static87.aClass266_13.method5994()) {
			@Pc(145) int local145 = local140.anInt2277;
			local157 = (Static208.aClass222_3.anIntArray544[local145] >> 14 & 0x3FFF) - Static437.anInt7555;
			local167 = (Static208.aClass222_3.anIntArray544[local145] & 0x3FFF) - Static134.anInt5502;
			local178 = local157 * 4 + 2 - local42 / 32;
			local189 = local167 * 4 + 2 - local46 / 32;
			Static105.method1630(local189, local10, local178, arg2, arg1, arg0, arg3, Static208.aClass222_3.anIntArray542[local145]);
		}
		for (local157 = 0; local157 < Static291.anInt5119; local157++) {
			local167 = Static285.anIntArray689[local157] * 4 + 2 - local42 / 32;
			local178 = Static94.anIntArray159[local157] * 4 + 2 - local46 / 32;
			@Pc(247) Class182 local247 = Static71.aClass105_6.method2336(Static195.anIntArray291[local157]);
			if (local247.anIntArray425 != null) {
				local247 = local247.method4388(Static51.aClass79_1);
				if (local247 == null || local247.anInt5455 == -1) {
					continue;
				}
			}
			Static105.method1630(local178, local10, local167, arg2, arg1, arg0, arg3, local247.anInt5455);
		}
		for (@Pc(288) Class1_Sub20 local288 = (Class1_Sub20) Static184.aClass27_23.method555(); local288 != null; local288 = (Class1_Sub20) Static184.aClass27_23.method563()) {
			local178 = (int) (local288.aLong227 >> 28 & 0x3L);
			if (Static322.anInt5636 == local178) {
				local189 = (int) (local288.aLong227 & 0x3FFFL) * 4 + 2 - local42 / 32;
				@Pc(332) int local332 = (int) (local288.aLong227 >> 14 & 0x3FFFL) * 4 + 2 - local46 / 32;
				Static157.method2368(local10, arg1, local189, local332, arg2, Static4.aClass80Array1[0], arg0);
			}
		}
		@Pc(406) int local406;
		for (local178 = 0; local178 < Static288.anInt5039; local178++) {
			@Pc(360) Class26_Sub2_Sub2_Sub2 local360 = Static410.aClass26_Sub2_Sub2_Sub2Array1[Static212.anIntArray28[local178]];
			if (local360 != null && local360.method5543() && local360.aByte95 == Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95) {
				@Pc(378) Class66 local378 = local360.aClass66_1;
				if (local378 != null && local378.anIntArray152 != null) {
					local378 = local378.method1454(Static51.aClass79_1);
				}
				if (local378 != null && local378.aBoolean87 && local378.aBoolean88) {
					local406 = local360.anInt7068 / 32 - local42 / 32;
					@Pc(416) int local416 = local360.anInt7065 / 32 - local46 / 32;
					if (local378.anInt1698 == -1) {
						Static157.method2368(local10, arg1, local406, local416, arg2, Static4.aClass80Array1[1], arg0);
					} else {
						Static105.method1630(local416, local10, local406, arg2, arg1, arg0, arg3, local378.anInt1698);
					}
				}
			}
		}
		local189 = Static187.anInt4913;
		@Pc(453) int[] local453 = Static256.anIntArray370;
		@Pc(487) int local487;
		@Pc(497) int local497;
		@Pc(501) int local501;
		for (local406 = 0; local406 < local189; local406++) {
			@Pc(463) Class26_Sub2_Sub2_Sub1 local463 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local453[local406]];
			if (local463 != null && local463.method5254() && Static196.aClass26_Sub2_Sub2_Sub1_1 != local463 && local463.aByte95 == Static196.aClass26_Sub2_Sub2_Sub1_1.aByte95) {
				local487 = local463.anInt7068 / 32 - local42 / 32;
				local497 = local463.anInt7065 / 32 - local46 / 32;
				@Pc(499) boolean local499 = false;
				for (local501 = 0; local501 < Static193.anInt1026; local501++) {
					if (local463.aString51.equals(Static397.aStringArray53[local501]) && Static409.anIntArray592[local501] != 0) {
						local499 = true;
						break;
					}
				}
				@Pc(531) boolean local531 = false;
				for (@Pc(533) int local533 = 0; local533 < Static214.anInt3899; local533++) {
					if (local463.aString51.equals(Static413.aClass254Array27[local533].aString59)) {
						local531 = true;
						break;
					}
				}
				@Pc(553) boolean local553 = false;
				if (Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6635 != 0 && local463.anInt6635 != 0 && Static196.aClass26_Sub2_Sub2_Sub1_1.anInt6635 == local463.anInt6635) {
					local553 = true;
				}
				if (local463.aBoolean432) {
					Static157.method2368(local10, arg1, local487, local497, arg2, Static4.aClass80Array1[6], arg0);
				} else if (local499) {
					Static157.method2368(local10, arg1, local487, local497, arg2, Static4.aClass80Array1[3], arg0);
				} else if (local531) {
					Static157.method2368(local10, arg1, local487, local497, arg2, Static4.aClass80Array1[5], arg0);
				} else if (local553) {
					Static157.method2368(local10, arg1, local487, local497, arg2, Static4.aClass80Array1[4], arg0);
				} else {
					Static157.method2368(local10, arg1, local487, local497, arg2, Static4.aClass80Array1[2], arg0);
				}
			}
		}
		@Pc(650) Class3[] local650 = Static444.aClass3Array1;
		@Pc(733) int local733;
		for (local487 = 0; local487 < local650.length; local487++) {
			@Pc(658) Class3 local658 = local650[local487];
			if (local658 != null && local658.anInt171 != 0 && Static403.anInt6978 % 20 < 10) {
				@Pc(708) int local708;
				if (local658.anInt171 == 1 && local658.anInt164 >= 0 && local658.anInt164 < Static410.aClass26_Sub2_Sub2_Sub2Array1.length) {
					@Pc(687) Class26_Sub2_Sub2_Sub2 local687 = Static410.aClass26_Sub2_Sub2_Sub2Array1[local658.anInt164];
					if (local687 != null) {
						local501 = local687.anInt7068 / 32 - local42 / 32;
						local708 = local687.anInt7065 / 32 - local46 / 32;
						Static452.method6065(local708, arg2, local10, arg0, local658.anInt165, arg1, 360000L, local501);
					}
				}
				if (local658.anInt171 == 2) {
					local733 = local658.anInt168 / 32 - local42 / 32;
					local501 = local658.anInt172 / 32 - local46 / 32;
					@Pc(749) long local749 = (long) (local658.anInt163 << 5);
					@Pc(753) long local753 = local749 * local749;
					Static452.method6065(local501, arg2, local10, arg0, local658.anInt165, arg1, local753, local733);
				}
				if (local658.anInt171 == 10 && local658.anInt164 >= 0 && local658.anInt164 < Static311.aClass26_Sub2_Sub2_Sub1Array1.length) {
					@Pc(783) Class26_Sub2_Sub2_Sub1 local783 = Static311.aClass26_Sub2_Sub2_Sub1Array1[local658.anInt164];
					if (local783 != null) {
						local501 = local783.anInt7068 / 32 - local42 / 32;
						local708 = local783.anInt7065 / 32 - local46 / 32;
						Static452.method6065(local708, arg2, local10, arg0, local658.anInt165, arg1, 360000L, local501);
					}
				}
			}
		}
		if (Static310.anInt5540 == 4) {
			return;
		}
		if (Static270.anInt4850 != 0) {
			local497 = Static270.anInt4850 * 4 + Static196.aClass26_Sub2_Sub2_Sub1_1.method5535() * 2 + 2 - local42 / 32 - 2;
			local733 = Static3.anInt169 * 4 + Static196.aClass26_Sub2_Sub2_Sub1_1.method5535() * 2 + 2 - local46 / 32 - 2;
			Static157.method2368(local10, arg1, local497, local733, arg2, Static257.aClass80Array11[Static261.aBoolean488 ? 1 : 0], arg0);
		}
		arg3.method4743(arg2.anInt6398 / 2 + arg0 - 1, -1, arg2.anInt6363 / 2 + arg1 - 1, 3, 3);
	}

	@OriginalMember(owner = "client!hb", name = "d", descriptor = "(B)V")
	public static void method2162() {
		if (Static46.anInt865 < 0) {
			Static55.anInt1147 = -1;
			Static21.anInt465 = -1;
			Static46.anInt865 = 0;
		}
		if (Static7.anInt2568 < Static46.anInt865) {
			Static55.anInt1147 = -1;
			Static21.anInt465 = -1;
			Static46.anInt865 = Static7.anInt2568;
		}
		if (Static151.anInt2577 < 0) {
			Static151.anInt2577 = 0;
			Static21.anInt465 = -1;
			Static55.anInt1147 = -1;
		}
		if (Static7.anInt2570 < Static151.anInt2577) {
			Static55.anInt1147 = -1;
			Static21.anInt465 = -1;
			Static151.anInt2577 = Static7.anInt2570;
		}
	}
}
