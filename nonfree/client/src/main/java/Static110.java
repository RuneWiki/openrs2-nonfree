import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Lclient!laa;")
	public static Class180 aClass180_2;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!qa;")
	public static Class62 aClass62_15;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!iu;")
	public static final Class150 aClass150_60 = new Class150(79, 12);

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IZIII)V")
	public static void method2215(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (!arg1 && Static381.anInt6974 == arg3 && arg2 == Static100.anInt2262 && (Static283.anInt5784 == Static367.anInt6860 || Static300.aClass5_Sub28_Sub1_1.method4118(Static17.anInt459))) {
			return;
		}
		Static100.anInt2262 = arg2;
		Static381.anInt6974 = arg3;
		Static283.anInt5784 = Static367.anInt6860;
		if (Static300.aClass5_Sub28_Sub1_1.method4118(Static17.anInt459)) {
			Static283.anInt5784 = 0;
		}
		Static287.method4831(arg0);
		Static513.method7097(Static6.aClass40_2.method1063(Static194.anInt3737), Static492.aClass13_3, true);
		@Pc(56) int local56 = Static515.anInt3214;
		Static515.anInt3214 = (Static381.anInt6974 - (Static460.anInt7894 >> 4)) * 8;
		@Pc(67) int local67 = Static338.anInt6353;
		Static338.anInt6353 = (Static100.anInt2262 - (Static235.anInt4493 >> 4)) * 8;
		Static276.aClass5_Sub2_Sub5_2 = Static245.method5947(Static381.anInt6974 * 8, Static100.anInt2262 * 8);
		Static259.aClass197_2 = null;
		@Pc(90) int local90 = Static515.anInt3214 - local56;
		@Pc(95) int local95 = Static338.anInt6353 - local67;
		@Pc(114) int local114;
		@Pc(116) int local116;
		@Pc(172) int local172;
		@Pc(281) int local281;
		if (arg0 == 10) {
			for (local281 = 0; local281 < Static310.anInt6066; local281++) {
				@Pc(287) Class5_Sub51 local287 = Static275.aClass5_Sub51Array1[local281];
				if (local287 != null) {
					@Pc(292) Class15_Sub2_Sub1_Sub2 local292 = local287.aClass15_Sub2_Sub1_Sub2_2;
					for (local116 = 0; local116 < 10; local116++) {
						local292.anIntArray306[local116] -= local90;
						local292.anIntArray307[local116] -= local95;
					}
					local292.anInt8492 -= local90 * 128;
					local292.anInt8493 -= local95 * 128;
				}
			}
		} else {
			@Pc(100) boolean local100 = false;
			Static438.anInt7689 = 0;
			@Pc(108) int local108 = Static460.anInt7894 * 128 - 128;
			local114 = (Static235.anInt4493 - 1) * 128;
			for (local116 = 0; local116 < Static310.anInt6066; local116++) {
				@Pc(122) Class5_Sub51 local122 = Static275.aClass5_Sub51Array1[local116];
				if (local122 != null) {
					@Pc(127) Class15_Sub2_Sub1_Sub2 local127 = local122.aClass15_Sub2_Sub1_Sub2_2;
					local127.anInt8492 -= local90 * 128;
					local127.anInt8493 -= local95 * 128;
					if (local127.anInt8492 >= 0 && local108 >= local127.anInt8492 && local127.anInt8493 >= 0 && local127.anInt8493 <= local114) {
						@Pc(170) boolean local170 = true;
						for (local172 = 0; local172 < 10; local172++) {
							local127.anIntArray306[local172] -= local90;
							local127.anIntArray307[local172] -= local95;
							if (local127.anIntArray306[local172] < 0 || Static460.anInt7894 <= local127.anIntArray306[local172] || local127.anIntArray307[local172] < 0 || local127.anIntArray307[local172] >= Static235.anInt4493) {
								local170 = false;
							}
						}
						if (local170) {
							Static547.anIntArray731[Static438.anInt7689++] = local127.anInt4745;
						} else {
							local127.method4045(null);
							local100 = true;
							local122.method7425();
						}
					} else {
						local127.method4045(null);
						local122.method7425();
						local100 = true;
					}
				}
			}
			if (local100) {
				Static310.anInt6066 = Static521.aClass42_42.method1111();
				Static521.aClass42_42.method1113(Static275.aClass5_Sub51Array1);
			}
		}
		for (local281 = 0; local281 < 2048; local281++) {
			@Pc(350) Class15_Sub2_Sub1_Sub1 local350 = Static10.aClass15_Sub2_Sub1_Sub1Array1[local281];
			if (local350 != null) {
				for (local114 = 0; local114 < 10; local114++) {
					local350.anIntArray306[local114] -= local90;
					local350.anIntArray307[local114] -= local95;
				}
				local350.anInt8493 -= local95 * 128;
				local350.anInt8492 -= local90 * 128;
			}
		}
		@Pc(407) Class34[] local407 = Static531.aClass34Array1;
		for (local114 = 0; local114 < local407.length; local114++) {
			@Pc(415) Class34 local415 = local407[local114];
			if (local415 != null) {
				local415.anInt972 -= local95 * 128;
				local415.anInt978 -= local90 * 128;
			}
		}
		for (@Pc(443) Class5_Sub22 local443 = (Class5_Sub22) Static330.aClass99_53.method2526(); local443 != null; local443 = (Class5_Sub22) Static330.aClass99_53.method2519()) {
			local443.anInt3296 -= local95;
			local443.anInt3297 -= local90;
			if (Static56.anInt1176 != 4 && (local443.anInt3297 < 0 || local443.anInt3296 < 0 || local443.anInt3297 >= Static460.anInt7894 || Static235.anInt4493 <= local443.anInt3296)) {
				local443.method7425();
			}
		}
		if (Static56.anInt1176 != 4) {
			for (@Pc(503) Class5_Sub7 local503 = (Class5_Sub7) Static181.aClass42_11.method1103(); local503 != null; local503 = (Class5_Sub7) Static181.aClass42_11.method1105()) {
				@Pc(511) int local511 = (int) (local503.aLong253 & 0x3FFFL);
				@Pc(515) int local515 = local511 - Static515.anInt3214;
				local172 = (int) (local503.aLong253 >> 14 & 0x3FFFL);
				@Pc(528) int local528 = local172 - Static338.anInt6353;
				if (local515 < 0 || local528 < 0 || local515 >= Static460.anInt7894 || local528 >= Static235.anInt4493) {
					local503.method7425();
				}
			}
		}
		if (Static384.anInt7374 != 0) {
			Static384.anInt7374 -= local90;
			Static40.anInt919 -= local95;
		}
		Static207.method3359();
		if (arg0 != 10) {
			Static394.anInt7079 -= local95;
			Static367.anInt6861 -= local90 * 128;
			Static164.anInt3309 -= local90;
			Static484.anInt8947 -= local95;
			Static65.anInt1250 -= local90;
			Static364.anInt6817 -= local95 * 128;
			if (Math.abs(local90) > Static460.anInt7894 || Math.abs(local95) > Static235.anInt4493) {
				Static81.method1438();
			}
		} else if (Static166.anInt3343 == 4) {
			Static433.anInt7633 -= local95 * 128;
			Static387.anInt7017 -= local95 * 128;
			Static409.anInt7303 -= local90 * 128;
			Static66.anInt1272 -= local90 * 128;
		} else {
			Static166.anInt3343 = 1;
		}
		Static272.method4492();
		Static457.method6380();
		Static98.aClass99_17.method2524();
		Static22.aClass99_3.method2524();
		Static413.aClass77_12.method2164();
		Static268.method4441();
	}
}
