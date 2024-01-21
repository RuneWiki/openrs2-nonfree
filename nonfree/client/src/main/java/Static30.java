import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!fb", name = "R", descriptor = "J")
	public static long aLong36;

	@OriginalMember(owner = "client!fb", name = "O", descriptor = "Lclient!ae;")
	public static Class5 aClass5_396 = null;

	@OriginalMember(owner = "client!fb", name = "Q", descriptor = "Lclient!ae;")
	private static Class5 aClass5_397 = Static56.method972("Please check your message)2centre for details)3");

	@OriginalMember(owner = "client!fb", name = "T", descriptor = "Z")
	public static boolean aBoolean46 = false;

	@OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
	public static int anInt880 = 0;

	@OriginalMember(owner = "client!fb", name = "W", descriptor = "Lclient!ae;")
	public static Class5 aClass5_398 = aClass5_397;

	@OriginalMember(owner = "client!fb", name = "X", descriptor = "Lclient!ae;")
	public static Class5 aClass5_399 = Static56.method972("rot:");

	@OriginalMember(owner = "client!fb", name = "Y", descriptor = "Lclient!ae;")
	public static Class5 aClass5_400 = Static56.method972(":");

	@OriginalMember(owner = "client!fb", name = "f", descriptor = "(I)V")
	public static void method604() {
		aClass5_400 = null;
		aClass5_396 = null;
		aClass5_399 = null;
		aClass5_398 = null;
		aClass5_397 = null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIBIII)V")
	public static void method605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 == Static67.anInt1780 && arg1 == Static109.anInt2877 && (arg0 == Static83.anInt2037 || !Static74.aBoolean91)) {
			return;
		}
		Static67.anInt1780 = arg4;
		Static109.anInt2877 = arg1;
		Static83.anInt2037 = arg0;
		if (!Static74.aBoolean91) {
			Static83.anInt2037 = 0;
		}
		Static116.method1971(25);
		Static37.method697(false, Static12.aClass5_186, null);
		@Pc(45) int local45 = Static109.anInt2875;
		Static109.anInt2875 = arg4 * 8 - 48;
		@Pc(53) int local53 = Static52.anInt1378;
		@Pc(58) int local58 = Static109.anInt2875 - local45;
		Static52.anInt1378 = arg1 * 8 - 48;
		@Pc(79) int local79 = Static52.anInt1378 - local53;
		for (@Pc(83) int local83 = 0; local83 < 32768; local83++) {
			@Pc(89) Class3_Sub1_Sub1_Sub1_Sub1 local89 = Static42.aClass3_Sub1_Sub1_Sub1_Sub1Array1[local83];
			if (local89 != null) {
				for (@Pc(93) int local93 = 0; local93 < 10; local93++) {
					local89.anIntArray181[local93] -= local58;
					local89.anIntArray177[local93] -= local79;
				}
				local89.anInt1543 -= local79 * 128;
				local89.anInt1567 -= local58 * 128;
			}
		}
		for (@Pc(137) int local137 = 0; local137 < 2048; local137++) {
			@Pc(143) Class3_Sub1_Sub1_Sub1_Sub2 local143 = Static15.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local137];
			if (local143 != null) {
				for (@Pc(147) int local147 = 0; local147 < 10; local147++) {
					local143.anIntArray181[local147] -= local58;
					local143.anIntArray177[local147] -= local79;
				}
				local143.anInt1543 -= local79 * 128;
				local143.anInt1567 -= local58 * 128;
			}
		}
		Static12.anInt480 = arg0;
		@Pc(197) byte local197 = 0;
		@Pc(199) byte local199 = 104;
		@Pc(201) byte local201 = 1;
		Static9.aClass3_Sub1_Sub1_Sub1_Sub2_1.method991(arg3, false, arg2);
		@Pc(209) byte local209 = 0;
		if (local58 < 0) {
			local197 = 103;
			local199 = -1;
			local201 = -1;
		}
		@Pc(222) byte local222 = 104;
		@Pc(224) byte local224 = 1;
		if (local79 < 0) {
			local222 = -1;
			local224 = -1;
			local209 = 103;
		}
		for (@Pc(237) int local237 = local197; local237 != local199; local237 += local201) {
			for (@Pc(241) int local241 = local209; local241 != local222; local241 += local224) {
				@Pc(247) int local247 = local58 + local237;
				@Pc(252) int local252 = local241 + local79;
				for (@Pc(254) int local254 = 0; local254 < 4; local254++) {
					if (local247 >= 0 && local252 >= 0 && local247 < 104 && local252 < 104) {
						Static24.aClass51ArrayArrayArray1[local254][local237][local241] = Static24.aClass51ArrayArrayArray1[local254][local247][local252];
					} else {
						Static24.aClass51ArrayArrayArray1[local254][local237][local241] = null;
					}
				}
			}
		}
		for (@Pc(322) Class3_Sub11 local322 = (Class3_Sub11) Static17.aClass51_3.method1316(); local322 != null; local322 = (Class3_Sub11) Static17.aClass51_3.method1310()) {
			local322.anInt2285 -= local79;
			local322.anInt2278 -= local58;
			if (local322.anInt2278 < 0 || local322.anInt2285 < 0 || local322.anInt2278 >= 104 || local322.anInt2285 >= 104) {
				local322.method1966();
			}
		}
		Static34.anInt966 = 0;
		if (Static46.anInt1284 != 0) {
			Static78.anInt1956 -= local79;
			Static46.anInt1284 -= local58;
		}
		Static78.anInt1959 = -1;
		Static38.aBoolean51 = false;
		Static21.aClass51_6.method1300();
		Static32.aClass51_8.method1300();
	}
}
