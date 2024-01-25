import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
	public static int anInt7898;

	@OriginalMember(owner = "client!ph", name = "E", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!ph", name = "I", descriptor = "J")
	public static long aLong241;

	@OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
	public static int anInt7902 = 0;

	@OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILclient!dba;)V")
	public static void method6710(@OriginalArg(1) Class74 arg0) {
		@Pc(18) int local18;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(36) int local36;
		@Pc(40) int local40;
		@Pc(44) int local44;
		if (Static233.aClass74_9 == arg0) {
			Static386.aClass5_Sub15_Sub2_2.method3642();
			local18 = Static386.aClass5_Sub15_Sub2_2.method3642();
			local26 = (local18 >> 4 & 0x7) + Static290.anInt10003;
			local32 = (local18 & 0x7) + Static447.anInt7822;
			local36 = Static386.aClass5_Sub15_Sub2_2.method3698();
			local40 = Static386.aClass5_Sub15_Sub2_2.method3642();
			local44 = Static386.aClass5_Sub15_Sub2_2.method3633();
			@Pc(48) String local48 = Static386.aClass5_Sub15_Sub2_2.method3661();
			Static32.method426(local44, local40, local26, Static596.anInt9715, local32, local48, local36);
			return;
		}
		@Pc(98) int local98;
		@Pc(104) int local104;
		if (Static600.aClass74_18 == arg0) {
			local18 = Static386.aClass5_Sub15_Sub2_2.method3646();
			local26 = (local18 >> 4 & 0x7) + Static290.anInt10003;
			local32 = Static447.anInt7822 + (local18 & 0x7);
			local36 = Static386.aClass5_Sub15_Sub2_2.method3655();
			local40 = local36 >> 2;
			local44 = local36 & 0x3;
			local98 = Static512.anIntArray472[local40];
			local104 = Static386.aClass5_Sub15_Sub2_2.method3662();
			if (Static79.method1207(Static566.anInt9293) || local26 >= 0 && local32 >= 0 && Static124.anInt2150 > local26 && Static64.anInt1015 > local32) {
				Static478.method7028(local26, local104, local44, Static596.anInt9715, local98, local32, local40);
			}
		} else if (Static12.aClass74_21 == arg0) {
			local18 = Static386.aClass5_Sub15_Sub2_2.method3683();
			if (local18 == 65535) {
				local18 = -1;
			}
			local26 = Static386.aClass5_Sub15_Sub2_2.method3667();
			local32 = local26 >> 2;
			local36 = local26 & 0x3;
			local40 = Static512.anIntArray472[local32];
			local44 = Static386.aClass5_Sub15_Sub2_2.method3646();
			local98 = Static290.anInt10003 + (local44 >> 4 & 0x7);
			local104 = (local44 & 0x7) + Static447.anInt7822;
			Static632.method8411(local104, local36, local18, local98, local40, Static596.anInt9715, local32);
		} else if (Static463.aClass74_16 == arg0) {
			local18 = Static386.aClass5_Sub15_Sub2_2.method3698();
			local26 = Static386.aClass5_Sub15_Sub2_2.method3642();
			Static400.aClass140_4.method2839(local18).method1762(local26);
		} else {
			@Pc(276) int local276;
			@Pc(297) int local297;
			@Pc(272) int local272;
			if (Static637.aClass74_20 == arg0) {
				local18 = Static386.aClass5_Sub15_Sub2_2.method3642();
				local26 = Static290.anInt10003 + (local18 >> 4 & 0x7);
				local32 = (local18 & 0x7) + Static447.anInt7822;
				local36 = Static386.aClass5_Sub15_Sub2_2.method3698();
				if (local36 == 65535) {
					local36 = -1;
				}
				local40 = Static386.aClass5_Sub15_Sub2_2.method3642();
				local44 = local40 >> 4 & 0xF;
				local98 = local40 & 0x7;
				local104 = Static386.aClass5_Sub15_Sub2_2.method3642();
				local272 = Static386.aClass5_Sub15_Sub2_2.method3642();
				local276 = Static386.aClass5_Sub15_Sub2_2.method3698();
				if (local26 >= 0 && local32 >= 0 && Static124.anInt2150 > local26 && Static64.anInt1015 > local32) {
					local297 = local44 + 1;
					if (Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0] >= local26 - local297 && local297 + local26 >= Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0] && local32 - local297 <= Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0] && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0] <= local32 + local297) {
						Static80.method1223(local276, local36, local104, local44 + (Static596.anInt9715 << 24) + (local26 << 16) + (local32 << 8), local98, local272);
					}
				}
			} else if (arg0 == Static125.aClass74_5) {
				local18 = Static386.aClass5_Sub15_Sub2_2.method3646();
				local26 = Static447.anInt7822 + (local18 & 0x7);
				local32 = Static48.anInt750 + local26;
				local36 = Static290.anInt10003 + (local18 >> 4 & 0x7);
				local40 = local36 + Static454.anInt7910;
				local44 = Static386.aClass5_Sub15_Sub2_2.method3637();
				@Pc(412) Class5_Sub24 local412 = (Class5_Sub24) Static109.aClass335_12.method7766((long) (local40 | Static596.anInt9715 << 28 | local32 << 14));
				if (local412 != null) {
					for (@Pc(420) Class5_Sub29 local420 = (Class5_Sub29) local412.aClass124_30.method2572(); local420 != null; local420 = (Class5_Sub29) local412.aClass124_30.method2569()) {
						if ((local44 & 0x7FFF) == local420.anInt3940) {
							local420.method8829();
							break;
						}
					}
					if (local412.aClass124_30.method2577()) {
						local412.method8829();
					}
					if (local36 >= 0 && local26 >= 0 && local36 < Static124.anInt2150 && local26 < Static64.anInt1015) {
						Static57.method857(local36, local26, Static596.anInt9715);
					}
				}
			} else {
				@Pc(554) int local554;
				@Pc(574) int local574;
				@Pc(578) int local578;
				@Pc(582) int local582;
				@Pc(558) int local558;
				if (arg0 == Static149.aClass74_7) {
					local18 = Static386.aClass5_Sub15_Sub2_2.method3642();
					local26 = (local18 >> 4 & 0xF) + Static290.anInt10003 * 2;
					local32 = (local18 & 0xF) + Static447.anInt7822 * 2;
					local36 = Static386.aClass5_Sub15_Sub2_2.method3642();
					@Pc(513) boolean local513 = (local36 & 0x1) != 0;
					@Pc(521) boolean local521 = (local36 & 0x2) != 0;
					local98 = local521 ? local36 >> 2 : -1;
					local104 = local26 + Static386.aClass5_Sub15_Sub2_2.method3677();
					local272 = local32 + Static386.aClass5_Sub15_Sub2_2.method3677();
					local276 = Static386.aClass5_Sub15_Sub2_2.method3638();
					local297 = Static386.aClass5_Sub15_Sub2_2.method3638();
					local554 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local558 = Static386.aClass5_Sub15_Sub2_2.method3642();
					if (local521) {
						local558 = (byte) local558;
					} else {
						local558 *= 4;
					}
					local574 = Static386.aClass5_Sub15_Sub2_2.method3642() * 4;
					local578 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local582 = Static386.aClass5_Sub15_Sub2_2.method3698();
					@Pc(588) int local588 = Static386.aClass5_Sub15_Sub2_2.method3642();
					if (local588 == 255) {
						local588 = -1;
					}
					@Pc(597) int local597 = Static386.aClass5_Sub15_Sub2_2.method3698();
					if (local26 >= 0 && local32 >= 0 && Static124.anInt2150 * 2 > local26 && Static124.anInt2150 * 2 > local32 && local104 >= 0 && local272 >= 0 && local104 < Static64.anInt1015 * 2 && Static64.anInt1015 * 2 > local272 && local554 != 65535) {
						local104 = local104 * 256;
						local32 *= 256;
						local272 *= 256;
						local574 <<= 0x2;
						local597 <<= 0x2;
						local558 <<= 0x2;
						local26 *= 256;
						if (local276 != 0 && local98 != -1) {
							@Pc(686) Class41_Sub1_Sub1_Sub3 local686 = null;
							@Pc(695) int local695;
							if (local276 >= 0) {
								local695 = local276 - 1;
								@Pc(702) Class5_Sub34 local702 = (Class5_Sub34) Static223.aClass335_19.method7766((long) local695);
								if (local702 != null) {
									local686 = local702.aClass41_Sub1_Sub1_Sub3_Sub1_1;
								}
							} else {
								local695 = -local276 - 1;
								if (Static177.anInt2910 == local695) {
									local686 = Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1;
								} else {
									local686 = Static389.aClass41_Sub1_Sub1_Sub3_Sub2Array2[local695];
								}
							}
							if (local686 != null) {
								@Pc(731) Class201 local731 = local686.method7933();
								if (local731.anIntArrayArray44 != null && local731.anIntArrayArray44[local98] != null) {
									local558 -= local731.anIntArrayArray44[local98][1];
								}
								if (local731.anIntArrayArray43 != null && local731.anIntArrayArray43[local98] != null) {
									local558 -= local731.anIntArrayArray43[local98][1];
								}
							}
						}
						@Pc(788) Class41_Sub1_Sub1_Sub5 local788 = new Class41_Sub1_Sub1_Sub5(local554, Static596.anInt9715, Static596.anInt9715, local26, local32, local558, Static421.anInt7434 + local578, Static421.anInt7434 + local582, local588, local597, local276, local297, local574, local513, local98);
						local788.method7765(local104, local578 + Static421.anInt7434, local272, Static161.method1246(Static596.anInt9715, local272, local104) - local574);
						Static97.aClass124_11.method2574(new Class5_Sub2_Sub16(local788));
					}
				} else if (Static202.aClass74_8 == arg0) {
					local18 = Static386.aClass5_Sub15_Sub2_2.method3655();
					local26 = local18 >> 2;
					local32 = local18 & 0x3;
					local36 = Static512.anIntArray472[local26];
					local40 = Static386.aClass5_Sub15_Sub2_2.method3655();
					local44 = Static290.anInt10003 + (local40 >> 4 & 0x7);
					local98 = Static447.anInt7822 + (local40 & 0x7);
					if (Static79.method1207(Static566.anInt9293) || local44 >= 0 && local98 >= 0 && Static124.anInt2150 > local44 && Static64.anInt1015 > local98) {
						Static478.method7028(local44, -1, local32, Static596.anInt9715, local36, local98, local26);
					}
				} else if (arg0 == Static248.aClass74_10) {
					local18 = Static386.aClass5_Sub15_Sub2_2.method3642();
					local26 = Static290.anInt10003 + (local18 >> 4 & 0x7);
					local32 = (local18 & 0x7) + Static447.anInt7822;
					local36 = Static386.aClass5_Sub15_Sub2_2.method3698();
					if (local36 == 65535) {
						local36 = -1;
					}
					local40 = Static386.aClass5_Sub15_Sub2_2.method3642();
					local44 = local40 >> 4 & 0xF;
					local98 = local40 & 0x7;
					local104 = Static386.aClass5_Sub15_Sub2_2.method3642();
					local272 = Static386.aClass5_Sub15_Sub2_2.method3642();
					local276 = Static386.aClass5_Sub15_Sub2_2.method3698();
					if (local26 >= 0 && local32 >= 0 && local26 < Static124.anInt2150 && local32 < Static64.anInt1015) {
						local297 = local44 + 1;
						if (local26 - local297 <= Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0] && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray528[0] <= local297 + local26 && Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0] >= local32 - local297 && local297 + local32 >= Static131.aClass41_Sub1_Sub1_Sub3_Sub2_1.anIntArray527[0]) {
							Static598.method8098(local272, local98, local44 + (local32 << 8) + (Static596.anInt9715 << 24) + (local26 << 16), local36, local104, local276);
						}
					}
				} else if (arg0 == Static674.aClass74_4) {
					local18 = Static386.aClass5_Sub15_Sub2_2.method3637();
					local26 = Static386.aClass5_Sub15_Sub2_2.method3637();
					local32 = Static386.aClass5_Sub15_Sub2_2.method3667();
					local36 = (local32 & 0x7) + Static447.anInt7822;
					local40 = Static48.anInt750 + local36;
					local44 = (local32 >> 4 & 0x7) + Static290.anInt10003;
					local98 = local44 + Static454.anInt7910;
					@Pc(1091) boolean local1091 = local44 >= 0 && local36 >= 0 && Static124.anInt2150 > local44 && local36 < Static64.anInt1015;
					if (local1091 || Static79.method1207(Static566.anInt9293)) {
						Static55.method837(local98, local40, Static596.anInt9715, new Class5_Sub29(local18, local26));
						if (local1091) {
							Static57.method857(local44, local36, Static596.anInt9715);
						}
					}
				} else if (arg0 == Static549.aClass74_17) {
					local18 = Static386.aClass5_Sub15_Sub2_2.method3642();
					@Pc(1133) boolean local1133 = (local18 & 0x80) != 0;
					local32 = (local18 >> 3 & 0x7) + Static290.anInt10003;
					local36 = (local18 & 0x7) + Static447.anInt7822;
					local40 = local32 + Static386.aClass5_Sub15_Sub2_2.method3677();
					local44 = local36 + Static386.aClass5_Sub15_Sub2_2.method3677();
					local98 = Static386.aClass5_Sub15_Sub2_2.method3638();
					local104 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local272 = Static386.aClass5_Sub15_Sub2_2.method3642() * 4;
					local276 = Static386.aClass5_Sub15_Sub2_2.method3642() * 4;
					local297 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local554 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local558 = Static386.aClass5_Sub15_Sub2_2.method3642();
					if (local558 == 255) {
						local558 = -1;
					}
					local574 = Static386.aClass5_Sub15_Sub2_2.method3698();
					if (local32 >= 0 && local36 >= 0 && Static124.anInt2150 > local32 && local36 < Static64.anInt1015 && local40 >= 0 && local44 >= 0 && Static124.anInt2150 > local40 && local44 < Static64.anInt1015 && local104 != 65535) {
						local276 <<= 0x2;
						local44 = local44 * 512 + 256;
						local574 <<= 0x2;
						local40 = local40 * 512 + 256;
						local32 = local32 * 512 + 256;
						local272 <<= 0x2;
						local36 = local36 * 512 + 256;
						@Pc(1305) Class41_Sub1_Sub1_Sub5 local1305 = new Class41_Sub1_Sub1_Sub5(local104, Static596.anInt9715, Static596.anInt9715, local32, local36, local272, Static421.anInt7434 + local297, local554 - -Static421.anInt7434, local558, local574, 0, local98, local276, local1133, -1);
						local1305.method7765(local40, local297 + Static421.anInt7434, local44, Static161.method1246(Static596.anInt9715, local44, local40) - local276);
						Static97.aClass124_11.method2574(new Class5_Sub2_Sub16(local1305));
					}
				} else if (arg0 == Static625.aClass74_19) {
					local18 = Static386.aClass5_Sub15_Sub2_2.method3642();
					local26 = (local18 >> 4 & 0x7) + Static290.anInt10003;
					local32 = Static447.anInt7822 + (local18 & 0x7);
					local36 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local40 = Static386.aClass5_Sub15_Sub2_2.method3642();
					local44 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local98 = Static386.aClass5_Sub15_Sub2_2.method3642();
					if (local26 >= 0 && local32 >= 0 && Static124.anInt2150 > local26 && local32 < Static64.anInt1015) {
						local104 = local26 * 512 + 256;
						local272 = local32 * 512 + 256;
						local276 = Static596.anInt9715;
						if (local276 < 3 && Static488.method7149(local26, local32)) {
							local276++;
						}
						@Pc(1436) Class41_Sub1_Sub1_Sub2 local1436 = new Class41_Sub1_Sub1_Sub2(local36, local44, Static421.anInt7434, Static596.anInt9715, local276, local104, Static161.method1246(Static596.anInt9715, local272, local104) - local40, local272, local26, local26, local32, local32, local98);
						Static614.aClass124_99.method2574(new Class5_Sub2_Sub11(local1436));
					}
				} else if (arg0 == Static412.aClass74_13) {
					local18 = Static386.aClass5_Sub15_Sub2_2.method3642();
					local26 = (local18 & 0x7) + Static447.anInt7822;
					local32 = Static48.anInt750 + local26;
					local36 = (local18 >> 4 & 0x7) + Static290.anInt10003;
					local40 = Static454.anInt7910 + local36;
					local44 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local98 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local104 = Static386.aClass5_Sub15_Sub2_2.method3698();
					if (Static109.aClass335_12 != null) {
						@Pc(1502) Class5_Sub24 local1502 = (Class5_Sub24) Static109.aClass335_12.method7766((long) (local40 | Static596.anInt9715 << 28 | local32 << 14));
						if (local1502 != null) {
							for (@Pc(1510) Class5_Sub29 local1510 = (Class5_Sub29) local1502.aClass124_30.method2572(); local1510 != null; local1510 = (Class5_Sub29) local1502.aClass124_30.method2569()) {
								if ((local44 & 0x7FFF) == local1510.anInt3940 && local1510.anInt3941 == local98) {
									local1510.method8829();
									local1510.anInt3941 = local104;
									Static55.method837(local40, local32, Static596.anInt9715, local1510);
									break;
								}
							}
							if (local36 >= 0 && local26 >= 0 && local36 < Static124.anInt2150 && local26 < Static64.anInt1015) {
								Static57.method857(local36, local26, Static596.anInt9715);
							}
						}
					}
				} else if (arg0 == Static447.aClass74_14) {
					local18 = Static386.aClass5_Sub15_Sub2_2.method3662();
					@Pc(1583) Class81 local1583 = Static400.aClass140_4.method2839(local18);
					local32 = Static386.aClass5_Sub15_Sub2_2.method3667();
					local36 = Static290.anInt10003 + (local32 >> 4 & 0x7);
					local40 = Static447.anInt7822 + (local32 & 0x7);
					local44 = Static386.aClass5_Sub15_Sub2_2.method3655();
					local98 = local44 >> 2;
					local104 = Static512.anIntArray472[local98];
					if (local98 == 11) {
						local98 = 10;
					}
					local272 = Static386.aClass5_Sub15_Sub2_2.method3642();
					local276 = 0;
					if (local1583.aByteArray9 != null) {
						local297 = -1;
						for (local554 = 0; local554 < local1583.aByteArray9.length; local554++) {
							if (local98 == local1583.aByteArray9[local554]) {
								local297 = local554;
								break;
							}
						}
						local276 = local1583.anIntArrayArray11[local297].length;
					}
					local297 = 0;
					if (local1583.aShortArray12 != null) {
						local297 = local1583.aShortArray12.length;
					}
					local554 = 0;
					if (local1583.aShortArray11 != null) {
						local554 = local1583.aShortArray11.length;
					}
					if ((local272 & 0x1) == 1) {
						Static570.method7811((Class272) null, Static596.anInt9715, local104, local40, local36);
					} else {
						@Pc(1688) int[] local1688 = null;
						if ((local272 & 0x2) == 2) {
							local1688 = new int[local276];
							for (local574 = 0; local574 < local276; local574++) {
								local1688[local574] = Static386.aClass5_Sub15_Sub2_2.method3698();
							}
						}
						@Pc(1711) short[] local1711 = null;
						if ((local272 & 0x4) == 4) {
							local1711 = new short[local297];
							for (local578 = 0; local578 < local297; local578++) {
								local1711[local578] = (short) Static386.aClass5_Sub15_Sub2_2.method3698();
							}
						}
						@Pc(1737) short[] local1737 = null;
						if ((local272 & 0x8) == 8) {
							local1737 = new short[local554];
							for (local582 = 0; local582 < local554; local582++) {
								local1737[local582] = (short) Static386.aClass5_Sub15_Sub2_2.method3698();
							}
						}
						Static570.method7811(new Class272((long) Static496.aLong261++, local1688, local1711, local1737), Static596.anInt9715, local104, local40, local36);
					}
				} else if (arg0 == Static455.aClass74_15) {
					local18 = Static386.aClass5_Sub15_Sub2_2.method3642();
					local26 = (local18 & 0x7) + Static447.anInt7822;
					local32 = Static48.anInt750 + local26;
					local36 = Static290.anInt10003 + (local18 >> 4 & 0x7);
					local40 = Static454.anInt7910 + local36;
					local44 = Static386.aClass5_Sub15_Sub2_2.method3683();
					local98 = Static386.aClass5_Sub15_Sub2_2.method3698();
					local104 = Static386.aClass5_Sub15_Sub2_2.method3637();
					if (local98 != Static177.anInt2910) {
						@Pc(1849) boolean local1849 = local36 >= 0 && local26 >= 0 && Static124.anInt2150 > local36 && Static64.anInt1015 > local26;
						if (local1849 || Static79.method1207(Static566.anInt9293)) {
							Static55.method837(local40, local32, Static596.anInt9715, new Class5_Sub29(local44, local104));
							if (local1849) {
								Static57.method857(local36, local26, Static596.anInt9715);
							}
						}
					}
				} else {
					Static17.method268("T3 - " + arg0, (Throwable) null);
					Static162.method6698(false);
				}
			}
		}
	}
}
