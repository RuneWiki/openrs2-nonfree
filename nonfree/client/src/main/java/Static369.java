import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIIZII)V")
	public static void method5015(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg1 - arg4;
		@Pc(14) int local14 = arg3 - arg0;
		if (local14 == 0) {
			if (local9 != 0) {
				Static206.method3258(arg4, arg0, arg1, arg2);
			}
		} else if (local9 == 0) {
			Static207.method3272(arg2, arg0, arg4, arg3);
		} else {
			if (local14 < 0) {
				local14 = -local14;
			}
			if (local9 < 0) {
				local9 = -local9;
			}
			@Pc(64) boolean local64 = local9 > local14;
			@Pc(68) int local68;
			@Pc(70) int local70;
			if (local64) {
				local68 = arg0;
				local70 = arg3;
				arg0 = arg4;
				arg3 = arg1;
				arg4 = local68;
				arg1 = local70;
			}
			if (arg0 > arg3) {
				local68 = arg0;
				arg0 = arg3;
				local70 = arg4;
				arg4 = arg1;
				arg3 = local68;
				arg1 = local70;
			}
			local68 = arg4;
			local70 = arg3 - arg0;
			@Pc(108) int local108 = arg1 - arg4;
			@Pc(113) int local113 = -(local70 >> 1);
			@Pc(120) int local120 = arg1 <= arg4 ? -1 : 1;
			if (local108 < 0) {
				local108 = -local108;
			}
			@Pc(129) int local129;
			if (local64) {
				for (local129 = arg0; local129 <= arg3; local129++) {
					local113 += local108;
					Static280.anIntArrayArray51[local129][local68] = arg2;
					if (local113 > 0) {
						local68 += local120;
						local113 -= local70;
					}
				}
			} else {
				for (local129 = arg0; local129 <= arg3; local129++) {
					Static280.anIntArrayArray51[local68][local129] = arg2;
					local113 += local108;
					if (local113 > 0) {
						local68 += local120;
						local113 -= local70;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IIILclient!em;Lclient!ya;)V")
	public static void method5017(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class68 arg2, @OriginalArg(4) Class49 arg3) {
		@Pc(10) Class73 local10 = arg2.method1751(arg3);
		if (local10 == null) {
			return;
		}
		arg3.OA(arg1, arg0, arg1 + arg2.anInt2188, arg2.anInt2252 + arg0);
		if (Static393.anInt6568 == 2 || Static393.anInt6568 == 5 || Static354.aClass17_46 == null) {
			arg3.ca(-16777216, local10, arg1, arg0);
			return;
		}
		@Pc(60) int local60;
		@Pc(58) int local58;
		@Pc(54) int local54;
		@Pc(56) int local56;
		if (Static159.anInt3195 == 4) {
			local54 = (int) -Static202.aFloat62 & 0x3FFF;
			local56 = 4096;
			local58 = Static186.anInt3613;
			local60 = Static405.anInt6749;
		} else {
			local60 = Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119;
			local58 = Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121;
			local54 = (int) -Static202.aFloat62 + Static166.anInt3321 & 0x3FFF;
			local56 = 4096 - Static261.anInt4889 * 16;
		}
		@Pc(95) int local95 = local60 / 32 + 48 + 208 - Static229.anInt4427 * 2;
		@Pc(112) int local112 = Static379.anInt6422 * 4 + 48 + 208 - local58 / 32 - Static379.anInt6422 * 2;
		Static354.aClass17_46.method5774((float) arg2.anInt2188 / 2.0F + (float) arg1, (float) arg0 + (float) arg2.anInt2252 / 2.0F, (float) local95, (float) local112, local56, local54 << 2, local10, arg1, arg0);
		@Pc(163) int local163;
		@Pc(173) int local173;
		@Pc(184) int local184;
		@Pc(195) int local195;
		for (@Pc(146) Class2_Sub26 local146 = (Class2_Sub26) Static376.aClass14_43.method309(); local146 != null; local146 = (Class2_Sub26) Static376.aClass14_43.method311()) {
			@Pc(151) int local151 = local146.anInt4485;
			local163 = (Static322.aClass153_3.anIntArray367[local151] >> 14 & 0x3FFF) - Static48.anInt962;
			local173 = (Static322.aClass153_3.anIntArray367[local151] & 0x3FFF) - Static324.anInt5624;
			local184 = local163 * 4 + 2 - local60 / 32;
			local195 = local173 * 4 + 2 - local58 / 32;
			Static136.method2318(arg2, Static322.aClass153_3.anIntArray366[local151], local184, arg3, arg1, local10, arg0, local195);
		}
		for (local163 = 0; local163 < Static356.anInt6043; local163++) {
			local173 = Static454.anIntArray636[local163] * 4 + 2 - local60 / 32;
			local184 = Static325.anIntArray465[local163] * 4 + 2 - local58 / 32;
			@Pc(251) Class134 local251 = Static118.aClass165_2.method3799(Static445.anIntArray621[local163]);
			if (local251.anIntArray322 != null) {
				local251 = local251.method2969(Static344.aClass108_1);
				if (local251 == null || local251.anInt3660 == -1) {
					continue;
				}
			}
			Static136.method2318(arg2, local251.anInt3660, local173, arg3, arg1, local10, arg0, local184);
		}
		for (@Pc(287) Class2_Sub14 local287 = (Class2_Sub14) Static132.aClass163_13.method3771(); local287 != null; local287 = (Class2_Sub14) Static132.aClass163_13.method3770()) {
			local184 = (int) (local287.aLong227 >> 28 & 0x3L);
			if (Static85.anInt2110 == local184) {
				local195 = (int) (local287.aLong227 & 0x3FFFL) * 4 + 2 - local60 / 32;
				@Pc(335) int local335 = (int) (local287.aLong227 >> 14 & 0x3FFFL) * 4 + 2 - local58 / 32;
				Static216.method4816(local195, local10, arg1, Static81.aClass17Array2[0], local335, arg0, arg2);
			}
		}
		@Pc(409) int local409;
		for (local184 = 0; local184 < Static62.anInt1371; local184++) {
			@Pc(363) Class3_Sub2_Sub1_Sub1 local363 = Static174.aClass3_Sub2_Sub1_Sub1Array1[Static173.anIntArray307[local184]];
			if (local363 != null && local363.method1429() && local363.aByte89 == Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89) {
				@Pc(381) Class65 local381 = local363.aClass65_1;
				if (local381 != null && local381.anIntArray155 != null) {
					local381 = local381.method1710(Static344.aClass108_1);
				}
				if (local381 != null && local381.aBoolean139 && local381.aBoolean137) {
					local409 = local363.anInt6119 / 32 - local60 / 32;
					@Pc(419) int local419 = local363.anInt6121 / 32 - local58 / 32;
					if (local381.anInt2142 == -1) {
						Static216.method4816(local409, local10, arg1, Static81.aClass17Array2[1], local419, arg0, arg2);
					} else {
						Static136.method2318(arg2, local381.anInt2142, local409, arg3, arg1, local10, arg0, local419);
					}
				}
			}
		}
		local195 = Static337.anInt5822;
		@Pc(460) int[] local460 = Static203.anIntArray384;
		@Pc(498) int local498;
		@Pc(508) int local508;
		@Pc(512) int local512;
		for (local409 = 0; local409 < local195; local409++) {
			@Pc(470) Class3_Sub2_Sub1_Sub2 local470 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local460[local409]];
			if (local470 != null && local470.method4941() && local470 != Static375.aClass3_Sub2_Sub1_Sub2_7 && Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89 == local470.aByte89) {
				local498 = local470.anInt6119 / 32 - local60 / 32;
				local508 = local470.anInt6121 / 32 - local58 / 32;
				@Pc(510) boolean local510 = false;
				for (local512 = 0; local512 < Static46.anInt861; local512++) {
					if (local470.aString56.equals(Static284.aStringArray35[local512]) && Static376.anIntArray544[local512] != 0) {
						local510 = true;
						break;
					}
				}
				@Pc(535) boolean local535 = false;
				for (@Pc(537) int local537 = 0; local537 < Static107.anInt2532; local537++) {
					if (local470.aString56.equals(Static93.aClass81Array1[local537].aString31)) {
						local535 = true;
						break;
					}
				}
				@Pc(561) boolean local561 = false;
				if (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6215 != 0 && local470.anInt6215 != 0 && local470.anInt6215 == Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6215) {
					local561 = true;
				}
				if (local470.aBoolean432) {
					Static216.method4816(local498, local10, arg1, Static81.aClass17Array2[6], local508, arg0, arg2);
				} else if (local510) {
					Static216.method4816(local498, local10, arg1, Static81.aClass17Array2[3], local508, arg0, arg2);
				} else if (local535) {
					Static216.method4816(local498, local10, arg1, Static81.aClass17Array2[5], local508, arg0, arg2);
				} else if (local561) {
					Static216.method4816(local498, local10, arg1, Static81.aClass17Array2[4], local508, arg0, arg2);
				} else {
					Static216.method4816(local498, local10, arg1, Static81.aClass17Array2[2], local508, arg0, arg2);
				}
			}
		}
		@Pc(658) Class237[] local658 = Static20.aClass237Array1;
		@Pc(742) int local742;
		for (local498 = 0; local498 < local658.length; local498++) {
			@Pc(666) Class237 local666 = local658[local498];
			if (local666 != null && local666.anInt6468 != 0 && Static131.anInt2821 % 20 < 10) {
				@Pc(717) int local717;
				if (local666.anInt6468 == 1 && local666.anInt6464 >= 0 && Static174.aClass3_Sub2_Sub1_Sub1Array1.length > local666.anInt6464) {
					@Pc(696) Class3_Sub2_Sub1_Sub1 local696 = Static174.aClass3_Sub2_Sub1_Sub1Array1[local666.anInt6464];
					if (local696 != null) {
						local512 = local696.anInt6119 / 32 - local60 / 32;
						local717 = local696.anInt6121 / 32 - local58 / 32;
						Static284.method4117(arg1, local512, 360000L, arg0, local10, local717, arg2, local666.anInt6470);
					}
				}
				if (local666.anInt6468 == 2) {
					local742 = local666.anInt6459 / 32 - local60 / 32;
					local512 = local666.anInt6458 / 32 - local58 / 32;
					@Pc(758) long local758 = (long) (local666.anInt6465 << 5);
					@Pc(762) long local762 = local758 * local758;
					Static284.method4117(arg1, local742, local762, arg0, local10, local512, arg2, local666.anInt6470);
				}
				if (local666.anInt6468 == 10 && local666.anInt6464 >= 0 && local666.anInt6464 < Static74.aClass3_Sub2_Sub1_Sub2Array1.length) {
					@Pc(790) Class3_Sub2_Sub1_Sub2 local790 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local666.anInt6464];
					if (local790 != null) {
						local512 = local790.anInt6119 / 32 - local60 / 32;
						local717 = local790.anInt6121 / 32 - local58 / 32;
						Static284.method4117(arg1, local512, 360000L, arg0, local10, local717, arg2, local666.anInt6470);
					}
				}
			}
		}
		if (Static159.anInt3195 == 4) {
			return;
		}
		if (Static66.anInt134 != 0) {
			local508 = Static66.anInt134 * 4 + Static375.aClass3_Sub2_Sub1_Sub2_7.method4935() * 2 + 2 - local60 / 32 - 2;
			local742 = Static220.anInt4265 * 4 + (Static375.aClass3_Sub2_Sub1_Sub2_7.method4935() + -1) * 2 + 2 - local58 / 32;
			Static216.method4816(local508, local10, arg1, Static248.aClass17Array10[Static11.aBoolean11 ? 1 : 0], local742, arg0, arg2);
		}
		arg3.method4480(arg1 + arg2.anInt2188 / 2 - 1, 3, -1, arg0 + arg2.anInt2252 / 2 - 1, 3);
		return;
	}
}
