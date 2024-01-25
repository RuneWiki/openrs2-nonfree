import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!ql", name = "p", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
	public static int anInt5639;

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "Lclient!cb;")
	public static Class33 aClass33_1 = new Class33(8);

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!za;Lclient!jk;III)V")
	public static void method4435(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class124 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class104 local10 = arg1.method2782(arg0);
		if (local10 == null) {
			return;
		}
		arg0.ba(arg2, arg3, arg2 + arg1.anInt3376, arg1.anInt3356 + arg3);
		if (Static191.anInt3304 == 2 || Static191.anInt3304 == 5 || Static168.aClass6_31 == null) {
			arg0.ra(-16777216, local10, arg2, arg3);
			return;
		}
		@Pc(79) int local79;
		@Pc(70) int local70;
		@Pc(67) int local67;
		@Pc(76) int local76;
		if (Static333.anInt5693 == 4) {
			local76 = 4096;
			local67 = (int) -Static98.aFloat20 & 0x3FFF;
			local79 = Static436.anInt7317;
			local70 = Static378.anInt2804;
		} else {
			local67 = (int) -Static98.aFloat20 + Static378.anInt2798 & 0x3FFF;
			local70 = Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5514;
			local76 = 4096 - Static435.anInt7311 * 16;
			local79 = Static447.aClass25_Sub5_Sub1_Sub2_4.anInt5518;
		}
		@Pc(105) int local105 = local79 / 32 + 48 - (Static296.anInt5187 + -104) * 2;
		@Pc(123) int local123 = Static206.anInt3607 * 4 + 208 + 48 - Static206.anInt3607 * 2 - local70 / 32;
		Static168.aClass6_31.method5896((float) arg1.anInt3376 / 2.0F + (float) arg2, (float) arg3 + (float) arg1.anInt3356 / 2.0F, (float) local105, (float) local123, local76, local67 << 2, local10, arg2, arg3);
		@Pc(176) int local176;
		@Pc(186) int local186;
		@Pc(197) int local197;
		@Pc(208) int local208;
		for (@Pc(159) Class1_Sub26 local159 = (Class1_Sub26) Static215.aClass227_27.method4967(); local159 != null; local159 = (Class1_Sub26) Static215.aClass227_27.method4973()) {
			@Pc(164) int local164 = local159.anInt3459;
			local176 = (Static72.aClass100_1.anIntArray177[local164] >> 14 & 0x3FFF) - Static199.anInt3480;
			local186 = (Static72.aClass100_1.anIntArray177[local164] & 0x3FFF) - Static164.anInt2731;
			local197 = local176 * 4 + 2 - local79 / 32;
			local208 = local186 * 4 + 2 - local70 / 32;
			Static113.method1801(Static72.aClass100_1.anIntArray176[local164], arg0, arg1, arg3, arg2, local10, local208, local197);
		}
		for (local176 = 0; local176 < Static347.anInt5954; local176++) {
			local186 = Static419.anIntArray471[local176] * 4 + 2 - local79 / 32;
			local197 = Static394.anIntArray439[local176] * 4 + 2 - local70 / 32;
			@Pc(265) Class68 local265 = Static341.aClass75_4.method1616(Static372.anIntArray421[local176]);
			if (local265.anIntArray125 != null) {
				local265 = local265.method1535(Static320.aClass249_2);
				if (local265 == null || local265.anInt1808 == -1) {
					continue;
				}
			}
			Static113.method1801(local265.anInt1808, arg0, arg1, arg3, arg2, local10, local197, local186);
		}
		for (@Pc(302) Class1_Sub2 local302 = (Class1_Sub2) Static425.aClass199_179.method4392(); local302 != null; local302 = (Class1_Sub2) Static425.aClass199_179.method4393()) {
			local197 = (int) (local302.aLong230 >> 28 & 0x3L);
			if (Static247.anInt4472 == local197) {
				local208 = (int) (local302.aLong230 & 0x3FFFL) * 4 + 2 - local79 / 32;
				@Pc(347) int local347 = (int) (local302.aLong230 >> 14 & 0x3FFFL) * 4 + 2 - local70 / 32;
				Static112.method1800(arg2, local10, arg3, local347, arg1, local208, Static417.aClass6Array14[0]);
			}
		}
		@Pc(416) int local416;
		for (local197 = 0; local197 < Static328.anInt5608; local197++) {
			@Pc(375) Class25_Sub5_Sub1_Sub1 local375 = Static87.aClass25_Sub5_Sub1_Sub1Array6[Static31.anIntArray30[local197]];
			if (local375 != null && local375.method2594() && Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94 == local375.aByte94) {
				@Pc(389) Class54 local389 = local375.aClass54_1;
				if (local389 != null && local389.anIntArray67 != null) {
					local389 = local389.method1148(Static320.aClass249_2);
				}
				if (local389 != null && local389.aBoolean152 && local389.aBoolean150) {
					local416 = local375.anInt5518 / 32 - local79 / 32;
					@Pc(426) int local426 = local375.anInt5514 / 32 - local70 / 32;
					if (local389.anInt1342 == -1) {
						Static112.method1800(arg2, local10, arg3, local426, arg1, local416, Static417.aClass6Array14[1]);
					} else {
						Static113.method1801(local389.anInt1342, arg0, arg1, arg3, arg2, local10, local426, local416);
					}
				}
			}
		}
		local208 = Static285.anInt5015;
		@Pc(463) int[] local463 = Static103.anIntArray135;
		@Pc(497) int local497;
		@Pc(507) int local507;
		@Pc(511) int local511;
		for (local416 = 0; local416 < local208; local416++) {
			@Pc(473) Class25_Sub5_Sub1_Sub2 local473 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local463[local416]];
			if (local473 != null && local473.method3442() && Static447.aClass25_Sub5_Sub1_Sub2_4 != local473 && local473.aByte94 == Static447.aClass25_Sub5_Sub1_Sub2_4.aByte94) {
				local497 = local473.anInt5518 / 32 - local79 / 32;
				local507 = local473.anInt5514 / 32 - local70 / 32;
				@Pc(509) boolean local509 = false;
				for (local511 = 0; local511 < Static107.anInt2042; local511++) {
					if (local473.aString51.equals(Static320.aStringArray44[local511]) && Static434.anIntArray492[local511] != 0) {
						local509 = true;
						break;
					}
				}
				@Pc(541) boolean local541 = false;
				for (@Pc(543) int local543 = 0; local543 < Static258.anInt7124; local543++) {
					if (local473.aString51.equals(Static400.aClass16Array1[local543].aString5)) {
						local541 = true;
						break;
					}
				}
				@Pc(567) boolean local567 = false;
				if (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4336 != 0 && local473.anInt4336 != 0 && Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4336 == local473.anInt4336) {
					local567 = true;
				}
				if (local473.aBoolean487) {
					Static112.method1800(arg2, local10, arg3, local507, arg1, local497, Static417.aClass6Array14[6]);
				} else if (local509) {
					Static112.method1800(arg2, local10, arg3, local507, arg1, local497, Static417.aClass6Array14[3]);
				} else if (local541) {
					Static112.method1800(arg2, local10, arg3, local507, arg1, local497, Static417.aClass6Array14[5]);
				} else if (local567) {
					Static112.method1800(arg2, local10, arg3, local507, arg1, local497, Static417.aClass6Array14[4]);
				} else {
					Static112.method1800(arg2, local10, arg3, local507, arg1, local497, Static417.aClass6Array14[2]);
				}
			}
		}
		@Pc(665) Class135[] local665 = Static133.aClass135Array1;
		@Pc(760) int local760;
		for (local497 = 0; local497 < local665.length; local497++) {
			@Pc(673) Class135 local673 = local665[local497];
			if (local673 != null && local673.anInt3824 != 0 && Static236.anInt4213 % 20 < 10) {
				@Pc(731) int local731;
				if (local673.anInt3824 == 1 && local673.anInt3817 >= 0 && local673.anInt3817 < Static87.aClass25_Sub5_Sub1_Sub1Array6.length) {
					@Pc(710) Class25_Sub5_Sub1_Sub1 local710 = Static87.aClass25_Sub5_Sub1_Sub1Array6[local673.anInt3817];
					if (local710 != null) {
						local511 = local710.anInt5518 / 32 - local79 / 32;
						local731 = local710.anInt5514 / 32 - local70 / 32;
						Static147.method5937(360000L, local673.anInt3816, arg3, local10, arg1, arg2, local731, local511);
					}
				}
				if (local673.anInt3824 == 2) {
					local760 = local673.anInt3818 / 32 - local79 / 32;
					local511 = local673.anInt3814 / 32 - local70 / 32;
					@Pc(776) long local776 = (long) (local673.anInt3825 << 5);
					@Pc(780) long local780 = local776 * local776;
					Static147.method5937(local780, local673.anInt3816, arg3, local10, arg1, arg2, local511, local760);
				}
				if (local673.anInt3824 == 10 && local673.anInt3817 >= 0 && local673.anInt3817 < Static28.aClass25_Sub5_Sub1_Sub2Array1.length) {
					@Pc(810) Class25_Sub5_Sub1_Sub2 local810 = Static28.aClass25_Sub5_Sub1_Sub2Array1[local673.anInt3817];
					if (local810 != null) {
						local511 = local810.anInt5518 / 32 - local79 / 32;
						local731 = local810.anInt5514 / 32 - local70 / 32;
						Static147.method5937(360000L, local673.anInt3816, arg3, local10, arg1, arg2, local731, local511);
					}
				}
			}
		}
		if (Static333.anInt5693 == 4) {
			return;
		}
		if (Static11.anInt185 != 0) {
			local507 = Static11.anInt185 * 4 + (Static447.aClass25_Sub5_Sub1_Sub2_4.method3427() - 1) * 2 + 2 - local79 / 32;
			local760 = Static232.anInt4096 * 4 + Static447.aClass25_Sub5_Sub1_Sub2_4.method3427() * 2 + 2 - local70 / 32 - 2;
			Static112.method1800(arg2, local10, arg3, local760, arg1, local507, Static28.aClass6Array1[Static14.aBoolean32 ? 1 : 0]);
		}
		arg0.method5729(3, arg2 + arg1.anInt3376 / 2 - 1, 3, -1, arg3 + arg1.anInt3356 / 2 - 1);
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
	public static void method4436(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2) {
		Static333.anInt5694 = arg0;
		Static337.anInt5743 = 2;
		Static128.method2028(arg1, arg2);
	}
}
