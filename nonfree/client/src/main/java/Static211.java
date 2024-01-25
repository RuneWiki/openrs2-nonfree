import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static211 {

	@OriginalMember(owner = "client!hba", name = "H", descriptor = "D")
	public static double aDouble12;

	@OriginalMember(owner = "client!hba", name = "N", descriptor = "Lclient!av;")
	public static final Class27 aClass27_6 = new Class27(10, 3);

	@OriginalMember(owner = "client!hba", name = "U", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_104 = new Class160(61, 7);

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!ha;IIBLclient!qga;)V")
	public static void method3240(@OriginalArg(0) Class144 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class299 arg3) {
		@Pc(10) Class31 local10 = arg3.method7439(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(30) Class1 local30 = local10.aClass1_1;
		arg0.KA(arg2, arg1, arg3.anInt8573 + arg2, arg3.anInt8547 + arg1);
		if (Static553.anInt9258 == 2 || Static553.anInt9258 == 5 || Static37.aClass45_1 == null) {
			arg0.A(-16777216, local30, arg2, arg1);
			return;
		}
		@Pc(65) int local65;
		@Pc(75) int local75;
		@Pc(73) int local73;
		@Pc(67) int local67;
		if (Static304.anInt5410 == 4) {
			local65 = Static295.anInt5319;
			local67 = 4096;
			local73 = (int) -Static139.aFloat16 & 0x3FFF;
			local75 = Static351.anInt11027;
		} else {
			local65 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184;
			local67 = 4096 - Static195.anInt3404 * 16;
			local73 = Static405.anInt7023 + (int) -Static139.aFloat16 & 0x3FFF;
			local75 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178;
		}
		@Pc(109) int local109 = local65 / 128 + 208 + 48 - Static380.anInt6689 * 2;
		@Pc(127) int local127 = Static542.anInt9214 * 4 + 208 + 48 - Static542.anInt9214 * 2 - local75 / 128;
		Static37.aClass45_1.method7495((float) arg2 + (float) arg3.anInt8573 / 2.0F, (float) arg1 + (float) arg3.anInt8547 / 2.0F, (float) local109, (float) local127, local67, local73 << 2, local30, arg2, arg1);
		@Pc(180) int local180;
		@Pc(190) int local190;
		@Pc(201) int local201;
		@Pc(211) int local211;
		for (@Pc(161) Class14_Sub30 local161 = (Class14_Sub30) Static457.aClass32_43.method584(); local161 != null; local161 = (Class14_Sub30) Static457.aClass32_43.method577()) {
			@Pc(168) int local168 = local161.anInt6793;
			local180 = (Static131.aClass309_3.anIntArray464[local168] >> 14 & 0x3FFF) - Static36.anInt617;
			local190 = (Static131.aClass309_3.anIntArray464[local168] & 0x3FFF) - Static550.anInt9242;
			local201 = local180 * 4 + 2 - local65 / 128;
			local211 = local190 * 4 + 2 - local75 / 128;
			Static164.method2367(local201, Static131.aClass309_3.anIntArray463[local168], local211, arg1, local30, arg2, arg3, arg0);
		}
		for (local180 = 0; local180 < Static553.anInt9259; local180++) {
			local190 = Static264.anIntArray248[local180] * 4 + 2 - local65 / 128;
			local201 = Static252.anIntArray240[local180] * 4 + 2 - local75 / 128;
			@Pc(273) Class128 local273 = Static212.aClass249_4.method6119(Static75.anIntArray71[local180]);
			if (local273.anIntArray179 != null) {
				local273 = local273.method2685(Static188.aClass238_1);
				if (local273 == null || local273.anInt2980 == -1) {
					continue;
				}
			}
			Static164.method2367(local190, local273.anInt2980, local201, arg1, local30, arg2, arg3, arg0);
		}
		@Pc(363) int local363;
		@Pc(374) int local374;
		for (@Pc(315) Class14_Sub25 local315 = (Class14_Sub25) Static282.aClass125_17.method2633(); local315 != null; local315 = (Class14_Sub25) Static282.aClass125_17.method2627()) {
			local201 = (int) (local315.aLong324 >> 28 & 0x3L);
			if (Static494.anInt8618 == local201) {
				local211 = (int) (local315.aLong324 & 0x3FFFL) - Static36.anInt617;
				@Pc(352) int local352 = (int) (local315.aLong324 >> 14 & 0x3FFFL) - Static550.anInt9242;
				local363 = local211 * 4 + 2 - local65 / 128;
				local374 = local352 * 4 + 2 - local75 / 128;
				Static23.method336(arg1, local374, arg3, local30, local363, Static262.aClass45Array15[0], arg2);
			}
		}
		@Pc(473) int local473;
		for (local201 = 0; local201 < Static662.anInt10795; local201++) {
			@Pc(407) Class14_Sub44 local407 = (Class14_Sub44) Static100.aClass125_9.method2630((long) Static253.anIntArray241[local201]);
			if (local407 != null) {
				@Pc(412) Class4_Sub3_Sub3_Sub3_Sub1 local412 = local407.aClass4_Sub3_Sub3_Sub3_Sub1_2;
				if (local412.method2569() && local412.aByte146 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146) {
					@Pc(430) Class362 local430 = local412.aClass362_1;
					if (local430 != null && local430.lb != null) {
						local430 = local430.method8641(Static188.aClass238_1);
					}
					if (local430 != null && local430.aBoolean700 && local430.aBoolean698) {
						local374 = local412.anInt11184 / 128 - local65 / 128;
						local473 = local412.anInt11178 / 128 - local75 / 128;
						if (local430.anInt10091 == -1) {
							Static23.method336(arg1, local473, arg3, local30, local374, Static262.aClass45Array15[1], arg2);
						} else {
							Static164.method2367(local374, local430.anInt10091, local473, arg1, local30, arg2, arg3, arg0);
						}
					}
				}
			}
		}
		local211 = Static258.anInt4846;
		@Pc(518) int[] local518 = Static43.anIntArray35;
		@Pc(572) int local572;
		@Pc(576) int local576;
		@Pc(605) int local605;
		for (local363 = 0; local363 < local211; local363++) {
			@Pc(528) Class4_Sub3_Sub3_Sub3_Sub2 local528 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local518[local363]];
			if (local528 != null && local528.method2889() && !local528.aBoolean245 && local528 != Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 && local528.aByte146 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aByte146) {
				local473 = local528.anInt11184 / 128 - local65 / 128;
				local572 = local528.anInt11178 / 128 - local75 / 128;
				@Pc(574) boolean local574 = false;
				for (local576 = 0; local576 < Static261.anInt4885; local576++) {
					if (local528.aString37.equals(Static265.aStringArray23[local576]) && Static591.anIntArray508[local576] != 0) {
						local574 = true;
						break;
					}
				}
				@Pc(603) boolean local603 = false;
				for (local605 = 0; local605 < Static67.anInt1036; local605++) {
					if (local528.aString37.equals(Static293.aClass165Array1[local605].aString53)) {
						local603 = true;
						break;
					}
				}
				@Pc(635) boolean local635 = false;
				if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3302 != 0 && local528.anInt3302 != 0 && Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt3302 == local528.anInt3302) {
					local635 = true;
				}
				if (local528.aBoolean242) {
					Static23.method336(arg1, local572, arg3, local30, local473, Static262.aClass45Array15[6], arg2);
				} else if (local635) {
					Static23.method336(arg1, local572, arg3, local30, local473, Static262.aClass45Array15[4], arg2);
				} else if (local528.aBoolean246) {
					Static23.method336(arg1, local572, arg3, local30, local473, Static262.aClass45Array15[7], arg2);
				} else if (local574) {
					Static23.method336(arg1, local572, arg3, local30, local473, Static262.aClass45Array15[3], arg2);
				} else if (local603) {
					Static23.method336(arg1, local572, arg3, local30, local473, Static262.aClass45Array15[5], arg2);
				} else {
					Static23.method336(arg1, local572, arg3, local30, local473, Static262.aClass45Array15[2], arg2);
				}
			}
		}
		@Pc(777) Class136[] local777 = Static8.aClass136Array1;
		@Pc(864) int local864;
		for (local473 = 0; local473 < local777.length; local473++) {
			@Pc(785) Class136 local785 = local777[local473];
			if (local785 != null && local785.anInt3427 != 0 && Static530.anInt9105 % 20 < 10) {
				@Pc(830) int local830;
				if (local785.anInt3427 == 1) {
					@Pc(815) Class14_Sub44 local815 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local785.anInt3419);
					if (local815 != null) {
						@Pc(820) Class4_Sub3_Sub3_Sub3_Sub1 local820 = local815.aClass4_Sub3_Sub3_Sub3_Sub1_2;
						local830 = local820.anInt11184 / 128 - local65 / 128;
						local605 = local820.anInt11178 / 128 - local75 / 128;
						Static606.method8534(360000L, arg2, local605, local785.anInt3429, arg3, local830, arg1, local30);
					}
				}
				if (local785.anInt3427 == 2) {
					local864 = local785.anInt3425 / 128 - local65 / 128;
					local576 = local785.anInt3420 / 128 - local75 / 128;
					@Pc(879) long local879 = (long) (local785.anInt3423 << 7);
					@Pc(883) long local883 = local879 * local879;
					Static606.method8534(local883, arg2, local576, local785.anInt3429, arg3, local864, arg1, local30);
				}
				if (local785.anInt3427 == 10 && local785.anInt3419 >= 0 && Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4.length > local785.anInt3419) {
					@Pc(920) Class4_Sub3_Sub3_Sub3_Sub2 local920 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local785.anInt3419];
					if (local920 != null) {
						local576 = local920.anInt11184 / 128 - local65 / 128;
						local830 = local920.anInt11178 / 128 - local75 / 128;
						Static606.method8534(360000L, arg2, local830, local785.anInt3429, arg3, local576, arg1, local30);
					}
				}
			}
		}
		if (Static304.anInt5410 == 4) {
			return;
		}
		if (Static60.anInt998 != 0) {
			local572 = Static60.anInt998 * 4 + Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2870(0) * 2 + 2 - local65 / 128 - 2;
			local864 = Static605.anInt7003 * 4 + Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2870(0) * 2 + 2 - local75 / 128 - 2;
			Static23.method336(arg1, local864, arg3, local30, local572, Static139.aClass45Array10[Static483.aBoolean590 ? 1 : 0], arg2);
		}
		if (!Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aBoolean245) {
			arg0.method6887(arg1 + arg3.anInt8547 / 2 - 1, -1, 3, 3, arg2 + arg3.anInt8573 / 2 - 1);
			return;
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IIIIIII)V")
	public static void method3241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static181.aClass14_Sub26_9.aClass43_Sub11_3.method3829() != 0 && arg4 != 0 && Static208.anInt7849 < 50 && arg1 != -1) {
			Static314.aClass106Array1[Static208.anInt7849++] = new Class106((byte) 1, arg1, arg4, arg2, arg3, arg5, arg0, (Class4_Sub3) null);
		}
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!taa;IIIIB)V")
	public static void method3242(@OriginalArg(0) Class14_Sub42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg0.anInt9545 == -1 && arg0.anIntArray497 == null) {
			return;
		}
		@Pc(19) int local19 = 0;
		@Pc(29) int local29 = arg0.anInt9543 * Static181.aClass14_Sub26_9.aClass43_Sub11_5.method3829() >> 8;
		if (arg0.anInt9534 < arg4) {
			local19 = arg4 - arg0.anInt9534;
		} else if (arg0.anInt9546 > arg4) {
			local19 = arg0.anInt9546 - arg4;
		}
		if (arg3 > arg0.anInt9536) {
			local19 += arg3 - arg0.anInt9536;
		} else if (arg3 < arg0.anInt9535) {
			local19 += arg0.anInt9535 - arg3;
		}
		if (arg0.anInt9542 == 0 || arg0.anInt9542 < local19 - 256 || Static181.aClass14_Sub26_9.aClass43_Sub11_5.method3829() == 0 || arg0.anInt9541 != arg1) {
			if (arg0.aClass14_Sub1_Sub1_4 != null) {
				Static196.aClass14_Sub1_Sub2_1.method1810(arg0.aClass14_Sub1_Sub1_4);
				arg0.aClass14_Sub53_3 = null;
				arg0.aClass14_Sub1_Sub1_4 = null;
				arg0.aClass14_Sub19_Sub1_3 = null;
			}
			if (arg0.aClass14_Sub1_Sub1_3 != null) {
				Static196.aClass14_Sub1_Sub2_1.method1810(arg0.aClass14_Sub1_Sub1_3);
				arg0.aClass14_Sub19_Sub1_4 = null;
				arg0.aClass14_Sub1_Sub1_3 = null;
				arg0.aClass14_Sub53_2 = null;
			}
			return;
		}
		local19 -= 256;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(179) int local179 = arg0.anInt9542 - arg0.anInt9550;
		if (local179 < 0) {
			local179 = arg0.anInt9542;
		}
		@Pc(189) int local189 = local29;
		@Pc(195) int local195 = local19 - arg0.anInt9550;
		if (local195 > 0 && local179 > 0) {
			local189 = local29 * (local179 - local195) / local179;
		}
		Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2870(0);
		@Pc(215) int local215 = 8192;
		@Pc(226) int local226 = (arg0.anInt9546 + arg0.anInt9534) / 2 - arg4;
		@Pc(237) int local237 = (arg0.anInt9535 + arg0.anInt9536) / 2 - arg3;
		@Pc(263) int local263;
		@Pc(275) int local275;
		if (local226 != 0 || local237 != 0) {
			local263 = -Static669.anInt10940 - (int) (Math.atan2((double) local226, (double) local237) * 2607.5945876176133D) - 4096 & 0x3FFF;
			if (local263 > 8192) {
				local263 = 16384 - local263;
			}
			if (local19 <= 0) {
				local275 = 8192;
			} else if (local19 >= 4096) {
				local275 = 16384;
			} else {
				local275 = local19 * 8192 / 4096 + 8192;
			}
			local215 = (16384 - local275 >> 1) + local275 * local263 / 8192;
		}
		@Pc(435) Class14_Sub1_Sub1 local435;
		if (arg0.aClass14_Sub1_Sub1_4 != null) {
			arg0.aClass14_Sub1_Sub1_4.method167(local189);
			arg0.aClass14_Sub1_Sub1_4.method162(local215);
		} else if (arg0.anInt9545 >= 0) {
			local263 = arg0.anInt9531 == 256 && arg0.anInt9547 == 256 ? 256 : Static121.method1921(arg0.anInt9531, arg0.anInt9547);
			if (arg0.aBoolean659) {
				if (arg0.aClass14_Sub53_3 == null) {
					arg0.aClass14_Sub53_3 = Static659.method9191(Static237.aClass310_52, arg0.anInt9545);
				}
				if (arg0.aClass14_Sub53_3 != null) {
					if (arg0.aClass14_Sub19_Sub1_3 == null) {
						arg0.aClass14_Sub19_Sub1_3 = arg0.aClass14_Sub53_3.method9197(new int[] { 22050 });
					}
					if (arg0.aClass14_Sub19_Sub1_3 != null) {
						local435 = Static692.method188(arg0.aClass14_Sub19_Sub1_3, local263, local189 << 6, local215);
						local435.method152(-1);
						Static196.aClass14_Sub1_Sub2_1.method1805(local435);
						arg0.aClass14_Sub1_Sub1_4 = local435;
					}
				}
			} else {
				@Pc(363) Class15 local363 = Static693.method239(Static620.aClass310_121, arg0.anInt9545, 0);
				if (local363 != null) {
					@Pc(370) Class14_Sub19_Sub1 local370 = local363.method242().method6790(Static291.aClass250_3);
					@Pc(378) Class14_Sub1_Sub1 local378 = Static692.method188(local370, local263, local189 << 6, local215);
					local378.method152(-1);
					Static196.aClass14_Sub1_Sub2_1.method1805(local378);
					arg0.aClass14_Sub1_Sub1_4 = local378;
				}
			}
		}
		if (arg0.aClass14_Sub1_Sub1_3 != null) {
			arg0.aClass14_Sub1_Sub1_3.method167(local189);
			arg0.aClass14_Sub1_Sub1_3.method162(local215);
			if (!arg0.aClass14_Sub1_Sub1_3.method9512()) {
				arg0.aClass14_Sub19_Sub1_4 = null;
				arg0.aClass14_Sub53_2 = null;
				arg0.aClass14_Sub1_Sub1_3 = null;
			}
		} else if (arg0.anIntArray497 != null && (arg0.anInt9538 -= arg2) <= 0) {
			local263 = arg0.anInt9531 == 256 && arg0.anInt9547 == 256 ? 256 : arg0.anInt9547 + (int) ((double) (arg0.anInt9531 - arg0.anInt9547) * Math.random());
			if (!arg0.aBoolean660) {
				local275 = (int) ((double) arg0.anIntArray497.length * Math.random());
				@Pc(536) Class15 local536 = Static693.method239(Static620.aClass310_121, arg0.anIntArray497[local275], 0);
				if (local536 != null) {
					@Pc(543) Class14_Sub19_Sub1 local543 = local536.method242().method6790(Static291.aClass250_3);
					@Pc(551) Class14_Sub1_Sub1 local551 = Static692.method188(local543, local263, local189 << 6, local215);
					local551.method152(0);
					Static196.aClass14_Sub1_Sub2_1.method1805(local551);
					arg0.aClass14_Sub1_Sub1_3 = local551;
					arg0.anInt9538 = arg0.anInt9539 + (int) ((double) (arg0.anInt9537 - arg0.anInt9539) * Math.random());
					return;
				}
				return;
			}
			if (arg0.aClass14_Sub53_2 == null) {
				local275 = (int) ((double) arg0.anIntArray497.length * Math.random());
				arg0.aClass14_Sub53_2 = Static659.method9191(Static237.aClass310_52, arg0.anIntArray497[local275]);
			}
			if (arg0.aClass14_Sub53_2 != null) {
				if (arg0.aClass14_Sub19_Sub1_4 == null) {
					arg0.aClass14_Sub19_Sub1_4 = arg0.aClass14_Sub53_2.method9197(new int[] { 22050 });
				}
				if (arg0.aClass14_Sub19_Sub1_4 != null) {
					local435 = Static692.method188(arg0.aClass14_Sub19_Sub1_4, local263, local189 << 6, local215);
					local435.method152(0);
					Static196.aClass14_Sub1_Sub2_1.method1805(local435);
					arg0.anInt9538 = (int) ((double) (arg0.anInt9537 - arg0.anInt9539) * Math.random()) + arg0.anInt9539;
					arg0.aClass14_Sub1_Sub1_3 = local435;
					return;
				}
			}
		}
	}
}
