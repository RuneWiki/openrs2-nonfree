import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static248 {

	@OriginalMember(owner = "client!iu", name = "e", descriptor = "Z")
	public static boolean aBoolean348 = false;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(B)V")
	public static void method4288() {
		Static530.anInt8592 = 0;
		for (@Pc(9) int local9 = 0; local9 < 2048; local9++) {
			Static594.aClass6_Sub40Array1[local9] = null;
			Static114.aByteArray40[local9] = 1;
			Static592.aClass260Array1[local9] = null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!ha;ILclient!sca;II)V")
	public static void method4289(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class302 arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class1 local10 = arg2.method7554(arg0);
		if (local10 == null) {
			return;
		}
		arg0.KA(arg3, arg1, arg3 + arg2.anInt8801, arg1 - -arg2.anInt8814);
		if (Static273.anInt5414 == 2 || Static273.anInt5414 == 5 || Static161.aClass32_6 == null) {
			arg0.A(-16777216, local10, arg3, arg1);
			return;
		}
		@Pc(68) int local68;
		@Pc(57) int local57;
		@Pc(65) int local65;
		@Pc(54) int local54;
		if (Static334.anInt6354 == 4) {
			local68 = Static614.anInt10099;
			local65 = (int) -Static284.aFloat164 & 0x3FFF;
			local57 = Static559.anInt9491;
			local54 = 4096;
		} else {
			local54 = 4096 - Static620.anInt10702 * 16;
			local57 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10729;
			local65 = Static298.anInt6417 + (int) -Static284.aFloat164 & 0x3FFF;
			local68 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt10725;
		}
		@Pc(96) int local96 = local68 / 128 + 48 - (Static442.anInt7975 - 104) * 2;
		@Pc(115) int local115 = Static284.anInt7916 * 4 + 48 - (Static284.anInt7916 - 104) * 2 - local57 / 128;
		Static161.aClass32_6.method5081((float) arg3 + (float) arg2.anInt8801 / 2.0F, (float) arg2.anInt8814 / 2.0F + (float) arg1, (float) local96, (float) local115, local54, local65 << 2, local10, arg3, arg1);
		@Pc(166) int local166;
		@Pc(175) int local175;
		@Pc(186) int local186;
		@Pc(197) int local197;
		for (@Pc(149) Class6_Sub48 local149 = (Class6_Sub48) Static603.aClass8_64.method149(); local149 != null; local149 = (Class6_Sub48) Static603.aClass8_64.method155()) {
			@Pc(154) int local154 = local149.anInt9611;
			local166 = (Static273.aClass356_1.anIntArray608[local154] >> 14 & 0x3FFF) - Static606.anInt8651;
			local175 = (Static273.aClass356_1.anIntArray608[local154] & 0x3FFF) - Static195.anInt3961;
			local186 = local166 * 4 + 2 - local68 / 128;
			local197 = local175 * 4 + 2 - local57 / 128;
			Static504.method8533(Static273.aClass356_1.anIntArray607[local154], arg2, arg0, local197, arg3, local186, local10, arg1);
		}
		for (local166 = 0; local166 < Static193.anInt3934; local166++) {
			local175 = Static522.anIntArray558[local166] * 4 + 2 - local68 / 128;
			local186 = Static107.anIntArray146[local166] * 4 + 2 - local57 / 128;
			@Pc(254) Class312 local254 = Static283.aClass210_2.method5629(Static419.anIntArray464[local166]);
			if (local254.anIntArray565 != null) {
				local254 = local254.method7866(Static279.aClass294_1);
				if (local254 == null || local254.anInt9211 == -1) {
					continue;
				}
			}
			Static504.method8533(local254.anInt9211, arg2, arg0, local186, arg3, local175, local10, arg1);
		}
		@Pc(338) int local338;
		@Pc(349) int local349;
		for (@Pc(295) Class6_Sub41 local295 = (Class6_Sub41) Static333.aClass128_46.method3556(); local295 != null; local295 = (Class6_Sub41) Static333.aClass128_46.method3555()) {
			local186 = (int) (local295.aLong278 >> 28 & 0x3L);
			if (Static281.anInt5609 == local186) {
				local197 = (int) (local295.aLong278 & 0x3FFFL) - Static606.anInt8651;
				@Pc(327) int local327 = (int) (local295.aLong278 >> 14 & 0x3FFFL) - Static195.anInt3961;
				local338 = local197 * 4 + 2 - local68 / 128;
				local349 = local327 * 4 + 2 - local57 / 128;
				Static512.method7605(local10, local349, arg1, arg2, Static564.aClass32Array21[0], arg3, local338);
			}
		}
		@Pc(435) int local435;
		for (local186 = 0; local186 < Static252.anInt5066; local186++) {
			@Pc(380) Class6_Sub46 local380 = (Class6_Sub46) Static347.aClass128_23.method3560((long) Static483.anIntArray525[local186]);
			if (local380 != null) {
				@Pc(385) Class20_Sub2_Sub2_Sub1_Sub2 local385 = local380.aClass20_Sub2_Sub2_Sub1_Sub2_1;
				if (local385.method4929() && local385.aByte131 == Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131) {
					@Pc(397) Class247 local397 = local385.aClass247_1;
					if (local397 != null && local397.anIntArray467 != null) {
						local397 = local397.method6613(Static279.aClass294_1);
					}
					if (local397 != null && local397.aBoolean510 && local397.aBoolean512) {
						local349 = local385.anInt10725 / 128 - local68 / 128;
						local435 = local385.anInt10729 / 128 - local57 / 128;
						if (local397.anInt7672 == -1) {
							Static512.method7605(local10, local435, arg1, arg2, Static564.aClass32Array21[1], arg3, local349);
						} else {
							Static504.method8533(local397.anInt7672, arg2, arg0, local435, arg3, local349, local10, arg1);
						}
					}
				}
			}
		}
		local197 = Static530.anInt8592;
		@Pc(471) int[] local471 = Static551.anIntArray576;
		@Pc(517) int local517;
		@Pc(521) int local521;
		@Pc(550) int local550;
		for (local338 = 0; local338 < local197; local338++) {
			@Pc(481) Class20_Sub2_Sub2_Sub1_Sub1 local481 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local471[local338]];
			if (local481 != null && local481.method1029() && !local481.aBoolean77 && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1 != local481 && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 == local481.aByte131) {
				local435 = local481.anInt10725 / 128 - local68 / 128;
				local517 = local481.anInt10729 / 128 - local57 / 128;
				@Pc(519) boolean local519 = false;
				for (local521 = 0; local521 < Static60.anInt1289; local521++) {
					if (local481.aString12.equals(Static123.aStringArray27[local521]) && Static253.anIntArray289[local521] != 0) {
						local519 = true;
						break;
					}
				}
				@Pc(548) boolean local548 = false;
				for (local550 = 0; local550 < Static301.anInt5871; local550++) {
					if (local481.aString12.equals(Static635.aClass17Array3[local550].aString4)) {
						local548 = true;
						break;
					}
				}
				@Pc(570) boolean local570 = false;
				if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1218 != 0 && local481.anInt1218 != 0 && Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.anInt1218 == local481.anInt1218) {
					local570 = true;
				}
				if (local481.aBoolean74) {
					Static512.method7605(local10, local517, arg1, arg2, Static564.aClass32Array21[6], arg3, local435);
				} else if (local519) {
					Static512.method7605(local10, local517, arg1, arg2, Static564.aClass32Array21[3], arg3, local435);
				} else if (local548) {
					Static512.method7605(local10, local517, arg1, arg2, Static564.aClass32Array21[5], arg3, local435);
				} else if (local570) {
					Static512.method7605(local10, local517, arg1, arg2, Static564.aClass32Array21[4], arg3, local435);
				} else {
					Static512.method7605(local10, local517, arg1, arg2, Static564.aClass32Array21[2], arg3, local435);
				}
			}
		}
		@Pc(667) Class19[] local667 = Static325.aClass19Array1;
		@Pc(749) int local749;
		for (local435 = 0; local435 < local667.length; local435++) {
			@Pc(675) Class19 local675 = local667[local435];
			if (local675 != null && local675.anInt332 != 0 && Static113.anInt2243 % 20 < 10) {
				@Pc(714) int local714;
				if (local675.anInt332 == 1) {
					@Pc(699) Class6_Sub46 local699 = (Class6_Sub46) Static347.aClass128_23.method3560((long) local675.anInt331);
					if (local699 != null) {
						@Pc(704) Class20_Sub2_Sub2_Sub1_Sub2 local704 = local699.aClass20_Sub2_Sub2_Sub1_Sub2_1;
						local714 = local704.anInt10725 / 128 - local68 / 128;
						local550 = local704.anInt10729 / 128 - local57 / 128;
						Static592.method8331(arg3, local550, local10, arg2, local714, 360000L, arg1, local675.anInt334);
					}
				}
				if (local675.anInt332 == 2) {
					local749 = local675.anInt333 / 128 - local68 / 128;
					local521 = local675.anInt339 / 128 - local57 / 128;
					@Pc(764) long local764 = (long) (local675.anInt340 << 7);
					@Pc(768) long local768 = local764 * local764;
					Static592.method8331(arg3, local521, local10, arg2, local749, local768, arg1, local675.anInt334);
				}
				if (local675.anInt332 == 10 && local675.anInt331 >= 0 && local675.anInt331 < Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1.length) {
					@Pc(800) Class20_Sub2_Sub2_Sub1_Sub1 local800 = Static18.aClass20_Sub2_Sub2_Sub1_Sub1Array1[local675.anInt331];
					if (local800 != null) {
						local521 = local800.anInt10725 / 128 - local68 / 128;
						local714 = local800.anInt10729 / 128 - local57 / 128;
						Static592.method8331(arg3, local714, local10, arg2, local521, 360000L, arg1, local675.anInt334);
					}
				}
			}
		}
		if (Static334.anInt6354 == 4) {
			return;
		}
		if (Static106.anInt2100 != 0) {
			local517 = Static106.anInt2100 * 4 + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913() * 2 + 2 - local68 / 128 - 2;
			local749 = Static51.anInt935 * 4 + Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.method4913() * 2 + 2 - local57 / 128 - 2;
			Static512.method7605(local10, local749, arg1, arg2, Static246.aClass32Array12[Static362.aBoolean439 ? 1 : 0], arg3, local517);
		}
		if (!Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aBoolean77) {
			arg0.method8815(arg2.anInt8801 / 2 + arg3 - 1, -1, 3, arg2.anInt8814 / 2 + arg1 - 1, 3);
			return;
		}
	}
}
