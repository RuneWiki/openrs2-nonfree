import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!kga", name = "mb", descriptor = "[[[Z")
	public static boolean[][][] aBooleanArrayArrayArray1;

	@OriginalMember(owner = "client!kga", name = "nb", descriptor = "J")
	public static long aLong128;

	@OriginalMember(owner = "client!kga", name = "jb", descriptor = "Lclient!rga;")
	public static final Class286 aClass286_92 = new Class286(55, -1);

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(III)Z")
	public static boolean method4188(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static24.method442(arg1, arg0) || Static282.method4203(arg0, arg1);
	}

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "(III)V")
	public static void method4189(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static6.anInt294 == 1) {
			Static543.method7395(arg1, Static122.aClass2_Sub5_1, arg0);
		} else if (Static6.anInt294 == 2) {
			Static459.method6495(arg0, arg1);
		}
		Static6.anInt294 = 0;
		Static122.aClass2_Sub5_1 = null;
	}

	@OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIZII)V")
	public static void method4190(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && Static584.anInt9529 == arg2 && arg3 == Static274.anInt4959 && (Static426.anInt7278 == Static566.anInt9278 || Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846))) {
			return;
		}
		Static584.anInt9529 = arg2;
		Static426.anInt7278 = Static566.anInt9278;
		Static274.anInt4959 = arg3;
		if (Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846)) {
			Static426.anInt7278 = 0;
		}
		Static121.method1780(arg0);
		Static458.method6493(Static307.aClass100_6, true, Static355.aClass294_8, Static412.aClass29_2, Static290.aClass198_14.method4365(Static52.anInt1264));
		@Pc(60) int local60 = Static35.anInt906;
		Static35.anInt906 = (Static584.anInt9529 - (Static188.anInt3850 >> 4)) * 8;
		@Pc(71) int local71 = Static130.anInt5246;
		Static130.anInt5246 = (Static274.anInt4959 - (Static49.anInt1174 >> 4)) * 8;
		Static342.aClass2_Sub3_Sub3_9 = Static270.method1326(Static584.anInt9529 * 8, Static274.anInt4959 * 8);
		Static382.aClass288_3 = null;
		@Pc(95) int local95 = Static35.anInt906 - local60;
		@Pc(100) int local100 = Static130.anInt5246 - local71;
		@Pc(119) int local119;
		@Pc(121) int local121;
		@Pc(193) int local193;
		@Pc(296) int local296;
		if (arg0 == 11) {
			for (local296 = 0; local296 < Static31.anInt820; local296++) {
				@Pc(302) Class2_Sub32 local302 = Static223.aClass2_Sub32Array1[local296];
				if (local302 != null) {
					@Pc(307) Class6_Sub1_Sub1_Sub1_Sub1 local307 = local302.aClass6_Sub1_Sub1_Sub1_Sub1_1;
					for (local121 = 0; local121 < 10; local121++) {
						local307.anIntArray510[local121] -= local95;
						local307.anIntArray509[local121] -= local100;
					}
					local307.anInt8761 -= local95 * 512;
					local307.anInt8764 -= local100 * 512;
				}
			}
		} else {
			Static416.anInt7186 = 0;
			@Pc(107) boolean local107 = false;
			@Pc(113) int local113 = Static188.anInt3850 * 512 - 512;
			local119 = (Static49.anInt1174 - 1) * 512;
			for (local121 = 0; local121 < Static31.anInt820; local121++) {
				@Pc(127) Class2_Sub32 local127 = Static223.aClass2_Sub32Array1[local121];
				if (local127 != null) {
					@Pc(132) Class6_Sub1_Sub1_Sub1_Sub1 local132 = local127.aClass6_Sub1_Sub1_Sub1_Sub1_1;
					local132.anInt8764 -= local100 * 512;
					local132.anInt8761 -= local95 * 512;
					if (local132.anInt8761 >= 0 && local113 >= local132.anInt8761 && local132.anInt8764 >= 0 && local119 >= local132.anInt8764) {
						@Pc(191) boolean local191 = true;
						for (local193 = 0; local193 < 10; local193++) {
							local132.anIntArray510[local193] -= local95;
							local132.anIntArray509[local193] -= local100;
							if (local132.anIntArray510[local193] < 0 || Static188.anInt3850 <= local132.anIntArray510[local193] || local132.anIntArray509[local193] < 0 || local132.anIntArray509[local193] >= Static49.anInt1174) {
								local191 = false;
							}
						}
						if (local191) {
							Static169.anIntArray198[Static416.anInt7186++] = local132.lb;
						} else {
							local132.method159(null);
							local127.method7966();
							local107 = true;
						}
					} else {
						local132.method159(null);
						local127.method7966();
						local107 = true;
					}
				}
			}
			if (local107) {
				Static31.anInt820 = Static544.aClass162_40.method3524();
				Static544.aClass162_40.method3520(Static223.aClass2_Sub32Array1);
			}
		}
		for (local296 = 0; local296 < 2048; local296++) {
			@Pc(363) Class6_Sub1_Sub1_Sub1_Sub2 local363 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local296];
			if (local363 != null) {
				for (local119 = 0; local119 < 10; local119++) {
					local363.anIntArray510[local119] -= local95;
					local363.anIntArray509[local119] -= local100;
				}
				local363.anInt8764 -= local100 * 512;
				local363.anInt8761 -= local95 * 512;
			}
		}
		@Pc(413) Class246[] local413 = Static134.aClass246Array1;
		for (local119 = 0; local119 < local413.length; local119++) {
			@Pc(421) Class246 local421 = local413[local119];
			if (local421 != null) {
				local421.anInt6844 -= local100 * 512;
				local421.anInt6849 -= local95 * 512;
			}
		}
		for (@Pc(449) Class2_Sub36 local449 = (Class2_Sub36) Static524.aClass8_62.method210(); local449 != null; local449 = (Class2_Sub36) Static524.aClass8_62.method218()) {
			local449.anInt6564 -= local100;
			local449.anInt6574 -= local95;
			if (Static565.anInt9249 != 4 && (local449.anInt6574 < 0 || local449.anInt6564 < 0 || local449.anInt6574 >= Static188.anInt3850 || Static49.anInt1174 <= local449.anInt6564)) {
				local449.method7966();
			}
		}
		if (Static565.anInt9249 != 4) {
			for (@Pc(502) Class2_Sub40 local502 = (Class2_Sub40) Static261.aClass162_35.method3527(); local502 != null; local502 = (Class2_Sub40) Static261.aClass162_35.method3523()) {
				@Pc(510) int local510 = (int) (local502.aLong268 & 0x3FFFL);
				@Pc(515) int local515 = local510 - Static35.anInt906;
				local193 = (int) (local502.aLong268 >> 14 & 0x3FFFL);
				@Pc(528) int local528 = local193 - Static130.anInt5246;
				if (local515 < 0 || local528 < 0 || local515 >= Static188.anInt3850 || Static49.anInt1174 <= local528) {
					local502.method7966();
				}
			}
		}
		if (Static29.anInt761 != 0) {
			Static29.anInt761 -= local95;
			Static526.anInt8657 -= local100;
		}
		Static394.method4078();
		if (arg0 != 11) {
			Static90.anInt1932 -= local95 * 512;
			Static400.anInt6972 -= local95;
			Static330.anInt6084 -= local100;
			Static285.anInt6373 -= local95;
			Static529.anInt9415 -= local100;
			Static7.anInt337 -= local100 * 512;
			if (Math.abs(local95) > Static188.anInt3850 || Math.abs(local100) > Static49.anInt1174) {
				Static6.method168();
			}
		} else if (Static311.anInt5570 == 4) {
			Static553.anInt9056 -= local95 * 512;
			Static264.anInt4870 -= local100 * 512;
			Static156.anInt8481 -= local95 * 512;
			Static433.anInt7318 -= local100 * 512;
		} else {
			Static311.anInt5570 = 1;
			Static94.anInt2006 = -1;
			Static238.anInt4482 = -1;
		}
		Static479.method6780();
		Static361.method6164();
		Static472.aClass8_55.method220();
		Static230.aClass8_24.method220();
		Static181.aClass109_5.method2311();
		Static278.method4194();
	}
}
