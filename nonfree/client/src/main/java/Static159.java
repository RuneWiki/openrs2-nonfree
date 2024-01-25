import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!hq", name = "z", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_55 = new Class237(90, 6);

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "([IZ[ILclient!uo;[I)V")
	public static void method2400(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class26_Sub2_Sub2_Sub2 arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg0.length; local3++) {
			@Pc(9) int local9 = arg0[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg3[local3];
			@Pc(19) int local19 = 0;
			while (local13 != 0 && arg2.aClass137Array3.length > local19) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg2.aClass137Array3[local19] = null;
					} else {
						@Pc(33) Class191 local33 = Static191.aClass28_1.method567(local9);
						@Pc(36) int local36 = local33.anInt5751;
						@Pc(41) Class137 local41 = arg2.aClass137Array3[local19];
						if (local41 != null) {
							if (local41.anInt3849 == local9) {
								if (local36 == 0) {
									local41 = arg2.aClass137Array3[local19] = null;
								} else if (local36 == 1) {
									local41.anInt3854 = 0;
									local41.anInt3856 = 1;
									local41.anInt3858 = 0;
									local41.anInt3850 = local17;
									local41.anInt3855 = 0;
									Static228.method3411(arg2.anInt7065, false, arg2.anInt7068, local33, 0, arg2.aByte95);
								} else if (local36 == 2) {
									local41.anInt3855 = 0;
								}
							} else if (local33.anInt5740 >= Static191.aClass28_1.method567(local41.anInt3849).anInt5740) {
								local41 = arg2.aClass137Array3[local19] = null;
							}
						}
						if (local41 == null) {
							local41 = arg2.aClass137Array3[local19] = new Class137();
							local41.anInt3849 = local9;
							local41.anInt3854 = 0;
							local41.anInt3855 = 0;
							local41.anInt3856 = 1;
							local41.anInt3850 = local17;
							local41.anInt3858 = 0;
							Static228.method3411(arg2.anInt7065, false, arg2.anInt7068, local33, 0, arg2.aByte95);
						}
					}
				}
				local19++;
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!qa;)V")
	public static void method2401(@OriginalArg(1) Class109 arg0) {
		@Pc(7) int local7 = Static309.anInt2246;
		@Pc(9) int local9 = Static24.anInt543;
		@Pc(11) int local11 = Static49.anInt5921;
		@Pc(15) int local15 = Static125.anInt2237 - 3;
		if (Static227.aClass80_10 == null || Static29.aClass80_2 == null) {
			if (Static384.aClass250_76.method5668(Static379.anInt6493) && Static384.aClass250_76.method5668(Static112.anInt2016)) {
				Static227.aClass80_10 = arg0.method4684(Static459.method3755(Static384.aClass250_76, Static379.anInt6493, 0));
				@Pc(44) Class159 local44 = Static459.method3755(Static384.aClass250_76, Static112.anInt2016, 0);
				Static29.aClass80_2 = arg0.method4684(local44);
				local44.method3742();
				Static3.aClass80_1 = arg0.method4684(local44);
			} else {
				arg0.NA(local7, local9, local11, 20, Static299.anInt5302 | 255 - Static363.anInt6198 << 24, 1);
			}
		}
		@Pc(89) int local89;
		@Pc(87) int local87;
		if (Static227.aClass80_10 != null && Static29.aClass80_2 != null) {
			local87 = (local11 - Static29.aClass80_2.UA() * 2) / Static227.aClass80_10.UA();
			for (local89 = 0; local89 < local87; local89++) {
				Static227.aClass80_10.method6099(local7 + Static29.aClass80_2.UA() + Static227.aClass80_10.UA() * local89, local9);
			}
			Static29.aClass80_2.method6099(local7, local9);
			Static3.aClass80_1.method6099(local11 + local7 - Static3.aClass80_1.UA(), local9);
		}
		Static139.aClass129_1.method5825(Static141.aClass84_35.method1678(Static167.anInt3118), Static163.anInt3042 | 0xFF000000, local7 + 3, -1, local9 + 14);
		arg0.NA(local7, local9 + 20, local11, local15 - 20, Static299.anInt5302 | -Static363.anInt6198 + 255 << 24, 1);
		local87 = Static16.aClass228_1.method5485();
		local89 = Static16.aClass228_1.method5486();
		@Pc(174) int local174 = 0;
		@Pc(197) int local197;
		for (@Pc(179) Class1_Sub8 local179 = (Class1_Sub8) Static8.aClass266_2.method6000(); local179 != null; local179 = (Class1_Sub8) Static8.aClass266_2.method5994()) {
			local197 = local9 + (-local174 + (Static82.anInt1627 - 1)) * 16 + 13 + 20;
			local174++;
			if (local87 > local7 && local87 < local11 + local7 && local89 > local197 - 13 && local197 + 4 > local89 && local179.aBoolean96) {
				arg0.NA(local7, local197 - 12, local11, 16, 255 - Static179.anInt3225 << 24 | Static290.anInt5115, 1);
			}
		}
		if ((Static427.aClass80_20 == null || Static378.aClass80_18 == null || Static110.aClass80_6 == null) && Static384.aClass250_76.method5668(Static387.anInt6753) && Static384.aClass250_76.method5668(Static216.anInt3925) && Static384.aClass250_76.method5668(Static88.anInt1720)) {
			@Pc(273) Class159 local273 = Static459.method3755(Static384.aClass250_76, Static216.anInt3925, 0);
			Static378.aClass80_18 = arg0.method4684(local273);
			local273.method3742();
			Static211.aClass80_9 = arg0.method4684(local273);
			Static427.aClass80_20 = arg0.method4684(Static459.method3755(Static384.aClass250_76, Static387.anInt6753, 0));
			@Pc(298) Class159 local298 = Static459.method3755(Static384.aClass250_76, Static88.anInt1720, 0);
			Static110.aClass80_6 = arg0.method4684(local298);
			local298.method3742();
			Static320.aClass80_13 = arg0.method4684(local298);
		}
		local174 = 0;
		@Pc(368) int local368;
		@Pc(331) int local331;
		if (Static427.aClass80_20 != null && Static378.aClass80_18 != null && Static110.aClass80_6 != null) {
			local197 = (local11 - Static110.aClass80_6.UA() * 2) / Static427.aClass80_20.UA();
			for (local331 = 0; local331 < local197; local331++) {
				Static427.aClass80_20.method6099(local7 + Static110.aClass80_6.UA() + Static427.aClass80_20.UA() * local331, local15 + local9 + -Static427.aClass80_20.qa());
			}
			local368 = (local15 - Static110.aClass80_6.qa() - 20) / Static378.aClass80_18.qa();
			for (@Pc(370) int local370 = 0; local370 < local368; local370++) {
				Static378.aClass80_18.method6099(local7, Static378.aClass80_18.qa() * local370 + local9 + 20);
				Static211.aClass80_9.method6099(local7 + local11 - Static211.aClass80_9.UA(), local370 * Static378.aClass80_18.qa() + local9 + 20);
			}
			Static110.aClass80_6.method6099(local7, local9 + local15 - Static110.aClass80_6.qa());
			Static320.aClass80_13.method6099(local11 + local7 - Static110.aClass80_6.UA(), local9 + local15 - Static110.aClass80_6.qa());
		}
		for (@Pc(434) Class1_Sub8 local434 = (Class1_Sub8) Static8.aClass266_2.method6000(); local434 != null; local434 = (Class1_Sub8) Static8.aClass266_2.method5994()) {
			local331 = (Static82.anInt1627 - local174 - 1) * 16 + local9 + 33;
			local368 = Static163.anInt3042 | 0xFF000000;
			if (local7 < local87 && local7 + local11 > local87 && local89 > local331 - 13 && local89 < local331 + 4 && local434.aBoolean96) {
				local368 = Static356.anInt6060 | 0xFF000000;
			}
			@Pc(496) int[] local496 = null;
			if (Static396.method5372(local434.anInt1758)) {
				local496 = Static196.aClass139_1.method3228((int) local434.aLong50).anIntArray684;
			} else if (local434.anInt1757 != -1) {
				local496 = Static196.aClass139_1.method3228(local434.anInt1757).anIntArray684;
			} else if (Static302.method4317(local434.anInt1758)) {
				@Pc(525) Class26_Sub2_Sub2_Sub2 local525 = Static410.aClass26_Sub2_Sub2_Sub2Array1[(int) local434.aLong50];
				if (local525 != null) {
					@Pc(530) Class66 local530 = local525.aClass66_1;
					if (local530.anIntArray152 != null) {
						local530 = local530.method1454(Static51.aClass79_1);
					}
					if (local530 != null) {
						local496 = local530.anIntArray151;
					}
				}
			} else if (Static202.method3066(local434.anInt1758)) {
				@Pc(568) Class182 local568;
				if (local434.anInt1758 == 1003) {
					local568 = Static71.aClass105_6.method2336((int) local434.aLong50);
				} else {
					local568 = Static71.aClass105_6.method2336((int) (local434.aLong50 >>> 32 & 0x7FFFFFFFL));
				}
				if (local568.anIntArray425 != null) {
					local568 = local568.method4388(Static51.aClass79_1);
				}
				if (local568 != null) {
					local496 = local568.anIntArray430;
				}
			}
			@Pc(603) String local603 = Static125.method1868(local434);
			if (local496 != null) {
				local603 = local603 + Static31.method549(local496);
			}
			Static139.aClass129_1.method5826(Static63.anIntArray87, local331, local603, Static364.aClass80Array17, local7 + 3, local368);
			if (local434.aBoolean95) {
				Static123.aClass80_5.method6099(Static167.aClass101_3.method1963(local603) + local7 + 5, local331 + -12);
			}
			local174++;
		}
		Static406.method5495(Static49.anInt5921, Static125.anInt2237, Static24.anInt543, Static309.anInt2246);
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IZ)I")
	public static int method2403(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local10 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			local10 += 8;
			arg0 >>>= 0x8;
		}
		if (arg0 >= 16) {
			local10 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local10 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local10++;
		}
		return arg0 + local10;
	}
}
