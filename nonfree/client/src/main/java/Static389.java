import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
	public static int anInt7061 = 0;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIZZI)V")
	public static void method5445(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (!arg2 && arg3 == Static254.anInt4366 && Static289.anInt4852 == arg0 && (Static29.anInt483 == Static1.anInt41 || Static327.aClass230_Sub1_1.method5644(Static146.anInt2664))) {
			return;
		}
		Static289.anInt4852 = arg0;
		Static254.anInt4366 = arg3;
		Static29.anInt483 = Static1.anInt41;
		if (Static327.aClass230_Sub1_1.method5644(Static146.anInt2664)) {
			Static29.anInt483 = 0;
		}
		if (arg1) {
			Static169.method2637(28);
		} else {
			Static169.method2637(25);
		}
		Static210.method3170(true, Static293.aClass96_81.method1935(anInt7061), Static199.aClass4_4);
		@Pc(63) int local63 = Static190.anInt3507;
		Static190.anInt3507 = (Static254.anInt4366 - (Static80.anInt6558 >> 4)) * 8;
		@Pc(78) int local78 = Static331.anInt6034;
		Static331.anInt6034 = (Static289.anInt4852 - (Static104.anInt2048 >> 4)) * 8;
		Static415.aClass1_Sub1_Sub6_3 = Static350.method5187(Static254.anInt4366 * 8, Static289.anInt4852 * 8);
		Static212.aClass84_1 = null;
		@Pc(101) int local101 = Static190.anInt3507 - local63;
		@Pc(106) int local106 = Static331.anInt6034 - local78;
		@Pc(116) int local116;
		@Pc(124) int local124;
		if (arg1) {
			Static47.anInt760 = 0;
			local116 = Static80.anInt6558 * 128 - 128;
			@Pc(122) int local122 = (Static104.anInt2048 - 1) * 128;
			for (local124 = 0; local124 < 32768; local124++) {
				@Pc(130) Class47_Sub1_Sub5_Sub1 local130 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local124];
				if (local130 != null) {
					local130.anInt7060 -= local101 * 128;
					local130.anInt7066 -= local106 * 128;
					if (local130.anInt7060 >= 0 && local116 >= local130.anInt7060 && local130.anInt7066 >= 0 && local122 >= local130.anInt7066) {
						@Pc(186) boolean local186 = true;
						for (@Pc(188) int local188 = 0; local188 < 10; local188++) {
							local130.anIntArray407[local188] -= local101;
							local130.anIntArray408[local188] -= local106;
							if (local130.anIntArray407[local188] < 0 || local130.anIntArray407[local188] >= Static80.anInt6558 || local130.anIntArray408[local188] < 0 || local130.anIntArray408[local188] >= Static104.anInt2048) {
								local186 = false;
							}
						}
						if (local186) {
							Static151.anIntArray211[Static47.anInt760++] = local124;
						} else {
							Static307.aClass47_Sub1_Sub5_Sub1Array1[local124].method3157(null);
							Static307.aClass47_Sub1_Sub5_Sub1Array1[local124] = null;
						}
					} else {
						Static307.aClass47_Sub1_Sub5_Sub1Array1[local124].method3157(null);
						Static307.aClass47_Sub1_Sub5_Sub1Array1[local124] = null;
					}
				}
			}
		} else {
			for (local116 = 0; local116 < 32768; local116++) {
				@Pc(282) Class47_Sub1_Sub5_Sub1 local282 = Static307.aClass47_Sub1_Sub5_Sub1Array1[local116];
				if (local282 != null) {
					for (local124 = 0; local124 < 10; local124++) {
						local282.anIntArray407[local124] -= local101;
						local282.anIntArray408[local124] -= local106;
					}
					local282.anInt7060 -= local101 * 128;
					local282.anInt7066 -= local106 * 128;
				}
			}
		}
		for (local116 = 0; local116 < 2048; local116++) {
			@Pc(336) Class47_Sub1_Sub5_Sub2 local336 = Static362.aClass47_Sub1_Sub5_Sub2Array1[local116];
			if (local336 != null) {
				for (local124 = 0; local124 < 10; local124++) {
					local336.anIntArray407[local124] -= local101;
					local336.anIntArray408[local124] -= local106;
				}
				local336.anInt7066 -= local106 * 128;
				local336.anInt7060 -= local101 * 128;
			}
		}
		@Pc(384) Class262[] local384 = Static416.aClass262Array1;
		for (local124 = 0; local124 < local384.length; local124++) {
			@Pc(392) Class262 local392 = local384[local124];
			if (local392 != null) {
				local392.anInt7697 -= local101 * 128;
				local392.anInt7694 -= local106 * 128;
			}
		}
		Static150.method2410(local101, local106);
		for (@Pc(426) Class1_Sub21 local426 = (Class1_Sub21) Static280.aClass142_29.method3199(); local426 != null; local426 = (Class1_Sub21) Static280.aClass142_29.method3198()) {
			local426.anInt3366 -= local106;
			local426.anInt3367 -= local101;
			if (Static188.anInt3479 != 3 && (local426.anInt3367 < 0 || local426.anInt3366 < 0 || local426.anInt3367 >= Static80.anInt6558 || Static104.anInt2048 <= local426.anInt3366)) {
				local426.method5965();
			}
		}
		if (Static57.anInt866 != 0) {
			Static57.anInt866 -= local101;
			Static326.anInt5983 -= local106;
		}
		Static110.method1733();
		if (arg1) {
			Static322.anInt4035 -= local106;
			Static382.anInt5701 -= local101;
			Static229.anInt3930 -= local101;
			Static302.anInt5030 -= local101 * 128;
			Static4.anInt149 -= local106 * 128;
			Static321.anInt5590 -= local106;
			if (Math.abs(local101) > Static80.anInt6558 || Math.abs(local106) > Static104.anInt2048) {
				Static92.method1453();
			}
		} else if (Static57.anInt883 == 4) {
			Static263.anInt4468 -= local106 * 128;
			Static370.anInt7662 -= local101 * 128;
			Static34.anInt572 -= local101 * 128;
			Static241.anInt4245 -= local106 * 128;
		} else {
			Static57.anInt883 = 1;
		}
		Static195.method3036();
		Static33.method459();
		Static111.aClass142_14.method3206();
		Static152.aClass142_19.method3206();
		Static311.aClass242_8.method5505();
		Static444.method5922();
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIII)V")
	public static void method5448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) Class1_Sub1_Sub1 local8 = Static190.method3007(arg3, 8);
		local8.method32();
		local8.anInt35 = arg2;
		local8.anInt39 = arg1;
		local8.anInt32 = arg0;
	}
}
