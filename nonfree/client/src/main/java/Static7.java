import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static7 {

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "Lclient!p;")
	public static Class133 aClass133_1;

	@OriginalMember(owner = "client!ag", name = "w", descriptor = "[I")
	public static int[] anIntArray13;

	@OriginalMember(owner = "client!ag", name = "f", descriptor = "[I")
	public static int[] anIntArray12 = new int[1024];

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "I")
	public static int anInt134 = 99;

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(II)V")
	public static void method100() {
		Static313.aClass169_165.method4020(50);
		Static164.aClass169_94.method4020(50);
		Static75.aClass169_53.method4020(50);
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IILclient!qf;II)V")
	public static void method106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class146 arg2, @OriginalArg(3) int arg3) {
		Static82.method1238();
		if (Static291.aBoolean404) {
			Static133.method2180(arg3, arg0, arg2.anInt4345 + arg3, arg0 + arg2.anInt4371);
		} else {
			Static41.method739(arg3, arg0, arg2.anInt4345 + arg3, arg0 - -arg2.anInt4371);
		}
		if (Static128.anInt2551 != 2 && Static128.anInt2551 != 5 && Static104.aClass1_Sub1_Sub3_2 != null) {
			@Pc(54) int local54;
			@Pc(59) int local59;
			@Pc(61) int local61;
			@Pc(63) int local63;
			if (Static101.anInt1895 == 4) {
				local54 = Static258.anInt5019;
				local59 = (int) Static2.aFloat1 & 0x7FF;
				local61 = 256;
				local63 = Static97.anInt1806;
			} else {
				local54 = Static229.aClass22_Sub3_Sub2_2.anInt4623;
				local59 = (int) Static2.aFloat1 + Static39.anInt794 & 0x7FF;
				local63 = Static229.aClass22_Sub3_Sub2_2.anInt4601;
				local61 = Static54.anInt1055 + 256;
			}
			@Pc(89) int local89 = 464 - local54 / 32;
			@Pc(96) int local96 = local63 / 32 + 48;
			if (Static291.aBoolean404) {
				((Class1_Sub1_Sub3_Sub1) Static104.aClass1_Sub1_Sub3_2).method4644(arg3, arg0, arg2.anInt4345, arg2.anInt4371, local96, local89, local59, local61, (Class1_Sub1_Sub3_Sub1) arg2.method3519(false));
			} else {
				((Class1_Sub1_Sub3_Sub2) Static104.aClass1_Sub1_Sub3_2).method3481(arg3, arg0, arg2.anInt4345, arg2.anInt4371, local96, local89, local59, local61, arg2.anIntArray362, arg2.anIntArray363);
			}
			@Pc(175) int local175;
			@Pc(185) int local185;
			@Pc(210) int local210;
			@Pc(220) int local220;
			if (Static27.aClass172_1 != null) {
				for (@Pc(141) int local141 = 0; local141 < Static27.aClass172_1.anInt5300; local141++) {
					if (Static27.aClass172_1.aClass1_Sub1_Sub10Array1[local141] != null && Static27.aClass172_1.anIntArray489[local141] >> 28 == Static295.anInt5586) {
						local175 = (Static27.aClass172_1.anIntArray489[local141] >> 14 & 0x3FFF) - Static290.anInt5497;
						local185 = (Static27.aClass172_1.anIntArray489[local141] & 0x3FFF) - Static118.anInt2409;
						if (local175 >= 0 && local175 < 104 && local185 >= 0 && local185 < 104) {
							local210 = local175 * 4 + 2 - local63 / 32;
							local220 = local185 * 4 + 2 - local54 / 32;
							Static287.method4259(arg3, Static27.aClass172_1.aClass1_Sub1_Sub10Array1[local141].anInt1638, arg0, local210, local220, arg2);
						}
					}
				}
			}
			for (local175 = 0; local175 < Static120.anInt2419; local175++) {
				local185 = Static98.anIntArray148[local175] * 4 + 2 - local63 / 32;
				local210 = Static207.anIntArray333[local175] * 4 + 2 - local54 / 32;
				@Pc(279) Class43 local279 = Static189.method3080(Static267.anIntArray465[local175]);
				if (local279.anIntArray97 != null) {
					local279 = local279.method1009();
					if (local279 == null || local279.anInt1168 == -1) {
						continue;
					}
				}
				Static287.method4259(arg3, local279.anInt1168, arg0, local185, local210, arg2);
			}
			@Pc(354) int local354;
			for (local175 = 0; local175 < 104; local175++) {
				for (local185 = 0; local185 < 104; local185++) {
					@Pc(329) Class24 local329 = Static68.aClass24ArrayArrayArray1[Static295.anInt5586][local175][local185];
					if (local329 != null) {
						local220 = local175 * 4 + 2 - local63 / 32;
						local354 = local185 * 4 + 2 - local54 / 32;
						Static287.method4260(arg2, arg0, local354, arg3, Static276.aClass1_Sub1_Sub3Array12[0], local220);
					}
				}
			}
			for (local175 = 0; local175 < Static105.anInt2015; local175++) {
				@Pc(385) Class22_Sub3_Sub1 local385 = Static265.aClass22_Sub3_Sub1Array1[anIntArray12[local175]];
				if (local385 != null && local385.method3655()) {
					@Pc(395) Class112 local395 = local385.aClass112_1;
					if (local395 != null && local395.anIntArray283 != null) {
						local395 = local395.method2817();
					}
					if (local395 != null && local395.aBoolean245 && local395.aBoolean247) {
						local220 = local385.anInt4601 / 32 - local63 / 32;
						local354 = local385.anInt4623 / 32 - local54 / 32;
						if (local395.anInt3520 == -1) {
							Static287.method4260(arg2, arg0, local354, arg3, Static276.aClass1_Sub1_Sub3Array12[1], local220);
						} else {
							Static287.method4259(arg3, local395.anInt3520, arg0, local220, local354, arg2);
						}
					}
				}
			}
			@Pc(507) int local507;
			for (local175 = 0; local175 < Static222.anInt4329; local175++) {
				@Pc(476) Class22_Sub3_Sub2 local476 = Static195.aClass22_Sub3_Sub2Array1[Static46.anIntArray79[local175]];
				if (local476 != null && local476.method3655()) {
					local210 = local476.anInt4601 / 32 - local63 / 32;
					@Pc(495) boolean local495 = false;
					local220 = local476.anInt4623 / 32 - local54 / 32;
					for (local507 = 0; local507 < Static175.anInt3635; local507++) {
						if (local476.aString153.equals(Static279.aStringArray44[local507]) && Static112.anIntArray187[local507] != 0) {
							local495 = true;
							break;
						}
					}
					@Pc(536) boolean local536 = false;
					for (@Pc(538) int local538 = 0; local538 < Static183.anInt3703; local538++) {
						if (local476.aString153.equals(Static208.aClass31Array1[local538].aString20)) {
							local536 = true;
							break;
						}
					}
					@Pc(563) boolean local563 = false;
					if (Static229.aClass22_Sub3_Sub2_2.anInt4652 != 0 && local476.anInt4652 != 0 && Static229.aClass22_Sub3_Sub2_2.anInt4652 == local476.anInt4652) {
						local563 = true;
					}
					if (local495) {
						Static287.method4260(arg2, arg0, local220, arg3, Static276.aClass1_Sub1_Sub3Array12[3], local210);
					} else if (local536) {
						Static287.method4260(arg2, arg0, local220, arg3, Static276.aClass1_Sub1_Sub3Array12[5], local210);
					} else if (local563) {
						Static287.method4260(arg2, arg0, local220, arg3, Static276.aClass1_Sub1_Sub3Array12[4], local210);
					} else {
						Static287.method4260(arg2, arg0, local220, arg3, Static276.aClass1_Sub1_Sub3Array12[2], local210);
					}
				}
			}
			local185 = 0;
			@Pc(643) Class68[] local643 = Static257.aClass68Array1;
			while (local185 < local643.length) {
				@Pc(655) Class68 local655 = local643[local185];
				if (local655 != null && local655.anInt1791 != 0 && Static37.anInt757 % 20 < 10) {
					if (local655.anInt1791 == 1 && local655.anInt1785 >= 0 && Static265.aClass22_Sub3_Sub1Array1.length > local655.anInt1785) {
						@Pc(692) Class22_Sub3_Sub1 local692 = Static265.aClass22_Sub3_Sub1Array1[local655.anInt1785];
						if (local692 != null) {
							local354 = local692.anInt4601 / 32 - local63 / 32;
							local507 = local692.anInt4623 / 32 - local54 / 32;
							Static30.method534(arg3, arg2, 360000, arg0, local507, local655.anInt1794, local354);
						}
					}
					if (local655.anInt1791 == 2) {
						local354 = (local655.anInt1795 - Static118.anInt2409) * 4 + 2 - local54 / 32;
						local220 = (local655.anInt1786 + -Static290.anInt5497) * 4 + 2 - local63 / 32;
						local507 = local655.anInt1790 * 4;
						local507 *= local507;
						Static30.method534(arg3, arg2, local507, arg0, local354, local655.anInt1794, local220);
					}
					if (local655.anInt1791 == 10 && local655.anInt1785 >= 0 && Static195.aClass22_Sub3_Sub2Array1.length > local655.anInt1785) {
						@Pc(799) Class22_Sub3_Sub2 local799 = Static195.aClass22_Sub3_Sub2Array1[local655.anInt1785];
						if (local799 != null) {
							local354 = local799.anInt4601 / 32 - local63 / 32;
							local507 = local799.anInt4623 / 32 - local54 / 32;
							Static30.method534(arg3, arg2, 360000, arg0, local507, local655.anInt1794, local354);
						}
					}
				}
				local185++;
			}
			if (Static101.anInt1895 != 4) {
				if (Static62.anInt1244 != 0) {
					local175 = Static62.anInt1244 * 4 + (Static229.aClass22_Sub3_Sub2_2.method3660() + -1) * 2 + 2 - local63 / 32;
					local185 = Static127.anInt2540 * 4 + (Static229.aClass22_Sub3_Sub2_2.method3660() - 1) * 2 + 2 - local54 / 32;
					Static287.method4260(arg2, arg0, local185, arg3, Static309.aClass1_Sub1_Sub3Array18[Static263.aBoolean357 ? 1 : 0], local175);
				}
				if (Static291.aBoolean404) {
					Static133.method2176(arg3 + arg2.anInt4345 / 2 - 1, arg2.anInt4371 / 2 + -1 + arg0, 3, 3, 16777215);
				} else {
					Static41.method730(arg2.anInt4345 / 2 + arg3 - 1, arg0 + -1 + arg2.anInt4371 / 2, 3, 3, 16777215);
				}
			}
		} else if (Static291.aBoolean404) {
			@Pc(960) Class1_Sub1_Sub3 local960 = arg2.method3519(false);
			if (local960 != null) {
				local960.method4628(arg3, arg0);
			}
		} else {
			Static41.method737(arg3, arg0, arg2.anIntArray362, arg2.anIntArray363);
		}
		Static307.aBooleanArray65[arg1] = true;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!nj;B)V")
	public static void method109(@OriginalArg(0) Class1_Sub19 arg0) {
		@Pc(5) long local5 = 0L;
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = -1;
		if (arg0.anInt3717 == 0) {
			local5 = Static27.method481(arg0.anInt3722, arg0.anInt3719, arg0.anInt3725);
		}
		if (arg0.anInt3717 == 1) {
			local5 = Static207.method3285(arg0.anInt3722, arg0.anInt3719, arg0.anInt3725);
		}
		if (arg0.anInt3717 == 2) {
			local5 = Static278.method4120(arg0.anInt3722, arg0.anInt3719, arg0.anInt3725);
		}
		if (arg0.anInt3717 == 3) {
			local5 = Static67.method1135(arg0.anInt3722, arg0.anInt3719, arg0.anInt3725);
		}
		@Pc(64) int local64 = 0;
		if (local5 != 0L) {
			local64 = (int) local5 >> 20 & 0x3;
			local9 = Integer.MAX_VALUE & (int) (local5 >>> 32);
			local7 = (int) local5 >> 14 & 0x1F;
		}
		arg0.anInt3724 = local64;
		arg0.anInt3718 = local7;
		arg0.anInt3721 = local9;
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ID)V")
	public static void method110(@OriginalArg(1) double arg0) {
		if (Static141.aDouble9 == arg0) {
			return;
		}
		for (@Pc(7) int local7 = 0; local7 < 256; local7++) {
			@Pc(22) int local22 = (int) (Math.pow((double) local7 / 255.0D, arg0) * 255.0D);
			Static267.anIntArray464[local7] = local22 > 255 ? 255 : local22;
		}
		Static141.aDouble9 = arg0;
	}
}
