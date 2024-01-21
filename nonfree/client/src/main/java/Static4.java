import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ad", name = "b", descriptor = "[Lclient!bg;")
	public static Class1_Sub3_Sub1_Sub1[] aClass1_Sub3_Sub1_Sub1Array1;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_40 = Static187.method3089("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
	public static int anInt101 = 0;

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
	public static void method92() {
		if (Static111.aBoolean141 && Static102.anInt2214 != Static192.anInt4180) {
			Static33.method603(Static145.anInt2925, Static183.anInt3928, Static15.aClass8_Sub3_Sub1_1.anIntArray309[0], Static15.aClass8_Sub3_Sub1_1.anIntArray312[0], Static192.anInt4180);
		} else if (Static190.anInt4134 != Static192.anInt4180) {
			Static190.anInt4134 = Static192.anInt4180;
			Static192.method3139(Static192.anInt4180);
		}
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lclient!ge;BI)V")
	public static void method93(@OriginalArg(0) Class8_Sub3 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anInt3613 > Static155.anInt2981) {
			Static139.method2073(arg0);
		} else if (arg0.anInt3593 >= Static155.anInt2981) {
			Static181.method2942(arg0);
		} else {
			Static181.method2943(arg0);
		}
		if (arg0.anInt3600 < 128 || arg0.anInt3606 < 128 || arg0.anInt3600 >= 13184 || arg0.anInt3606 >= 13184) {
			arg0.anInt3606 = arg0.anIntArray312[0] * 128 + arg0.anInt3583 * 64;
			arg0.anInt3575 = -1;
			arg0.anInt3593 = 0;
			arg0.anInt3564 = -1;
			arg0.anInt3600 = arg0.anInt3583 * 64 + arg0.anIntArray309[0] * 128;
			arg0.anInt3613 = 0;
			arg0.method2675();
		}
		if (arg0 == Static15.aClass8_Sub3_Sub1_1 && (arg0.anInt3600 < 1536 || arg0.anInt3606 < 1536 || arg0.anInt3600 >= 11776 || arg0.anInt3606 >= 11776)) {
			arg0.anInt3613 = 0;
			arg0.anInt3575 = -1;
			arg0.anInt3593 = 0;
			arg0.anInt3606 = arg0.anInt3583 * 64 + arg0.anIntArray312[0] * 128;
			arg0.anInt3600 = arg0.anIntArray309[0] * 128 + arg0.anInt3583 * 64;
			arg0.anInt3564 = -1;
			arg0.method2675();
		}
		Static6.method122(arg0);
		Static151.method2296(arg0);
	}

	@OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method94(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = arg5 - arg4;
		@Pc(15) int local15 = arg7 - arg2;
		@Pc(24) int local24 = (arg6 - arg1 << 16) / local10;
		@Pc(33) int local33 = (arg3 - arg0 << 16) / local15;
		if (Static35.anInt988 > arg7) {
			local15++;
		}
		if (Static90.anInt1950 > arg5) {
			local10++;
		}
		@Pc(59) int local59;
		@Pc(53) int local53;
		@Pc(64) int local64;
		@Pc(77) int local77;
		@Pc(107) int local107;
		@Pc(115) int local115;
		for (@Pc(43) int local43 = 0; local43 < local10; local43++) {
			local53 = local24 * (local43 + 1) >> 16;
			local59 = local24 * local43 >> 16;
			local64 = local53 - local59;
			if (local64 > 0) {
				local59 += arg1;
				local77 = local43 + arg4 >> 6;
				@Pc(81) byte[][] local81 = Static158.aByteArrayArrayArray37[local77];
				local53 += arg1;
				@Pc(89) int[][] local89 = Static157.anIntArrayArrayArray7[local77];
				@Pc(93) byte[][] local93 = Static119.aByteArrayArrayArray28[local77];
				@Pc(97) byte[][] local97 = Static64.aByteArrayArrayArray17[local77];
				@Pc(101) byte[][] local101 = Static164.aByteArrayArrayArray40[local77];
				@Pc(105) byte[][] local105 = Static180.aByteArrayArrayArray52[local77];
				for (local107 = 0; local107 < local15; local107++) {
					local115 = local107 * local33 >> 16;
					@Pc(123) int local123 = local33 * (local107 + 1) >> 16;
					@Pc(128) int local128 = local123 - local115;
					if (local128 > 0) {
						local115 += arg0;
						@Pc(144) int local144 = local107 + arg2 >> 6;
						@Pc(151) int local151 = local107 + arg2 & 0x3F;
						local123 += arg0;
						@Pc(162) int local162 = local43 + arg4 & 0x3F;
						@Pc(168) int local168 = local162 + (local151 << 6);
						@Pc(178) int local178;
						@Pc(186) int local186;
						@Pc(192) int local192;
						if (local89[local144] == null) {
							local186 = local43 + arg4 & 0x4;
							local192 = arg2 + local107 & 0x4;
							if (local186 < 2 && local192 > 2 || local186 > 2 && local192 < 2) {
								local178 = 4936552;
							} else {
								local178 = Static77.anIntArray136[Static49.anInt1253 + 1];
							}
						} else {
							local178 = local89[local144][local168];
						}
						local186 = local81[local144] == null ? 0 : Static77.anIntArray136[local81[local144][local168] & 0xFF];
						local192 = local97[local144] == null ? 0 : Static77.anIntArray136[local97[local144][local168] & 0xFF];
						@Pc(293) int local293;
						if (local186 == 0 && local192 == 0) {
							Static46.method3173(local59, local115, local64, local128, local178);
						} else {
							@Pc(289) byte local289;
							if (local186 != 0) {
								if (local186 == -1) {
									local186 = 1;
								}
								local289 = local93[local144] == null ? 0 : local93[local144][local168];
								local293 = local289 & 0xFC;
								if (local293 == 0 || local64 <= 1 || local128 <= 1) {
									Static46.method3173(local59, local115, local64, local128, local186);
								} else {
									Static78.method1184(Static46.anIntArray334, local293 >> 2, local115, local64, local178, local289 & 0x3, true, local128, local59, local186);
								}
							}
							if (local192 != 0) {
								if (local192 == -1) {
									local192 = local178;
								}
								local289 = local101[local144][local168];
								local293 = local289 & 0xFC;
								if (local293 == 0 || local64 <= 1 || local128 <= 1) {
									Static46.method3173(local59, local115, local64, local128, local192);
								}
								Static78.method1184(Static46.anIntArray334, local293 >> 2, local115, local64, 0, local289 & 0x3, local186 == 0, local128, local59, local192);
							}
						}
						if (local105[local144] != null) {
							@Pc(398) int local398 = local105[local144][local168] & 0xFF;
							if (local398 != 0) {
								@Pc(410) int local410;
								if (local128 == 1) {
									local410 = local115;
								} else {
									local410 = local123 - 1;
								}
								@Pc(416) int local416 = 13421772;
								if (local64 == 1) {
									local293 = local59;
								} else {
									local293 = local53 - 1;
								}
								if (local398 >= 5 && local398 <= 8 || local398 >= 13 && local398 <= 16 || local398 >= 21 && local398 <= 24 || local398 == 27 || local398 == 28) {
									local416 = 13369344;
									local398 -= 4;
								}
								if (local398 == 1) {
									Static46.method3158(local59, local115, local128, local416);
								} else if (local398 == 2) {
									Static46.method3162(local59, local115, local64, local416);
								} else if (local398 == 3) {
									Static46.method3158(local293, local115, local128, local416);
								} else if (local398 == 4) {
									Static46.method3162(local59, local410, local64, local416);
								} else if (local398 == 9) {
									Static46.method3158(local59, local115, local128, 16777215);
									Static46.method3162(local59, local115, local64, local416);
								} else if (local398 == 10) {
									Static46.method3158(local293, local115, local128, 16777215);
									Static46.method3162(local59, local115, local64, local416);
								} else if (local398 == 11) {
									Static46.method3158(local293, local115, local128, 16777215);
									Static46.method3162(local59, local410, local64, local416);
								} else if (local398 == 12) {
									Static46.method3158(local59, local115, local128, 16777215);
									Static46.method3162(local59, local410, local64, local416);
								} else if (local398 == 17) {
									Static46.method3162(local59, local115, 1, local416);
								} else if (local398 == 18) {
									Static46.method3162(local293, local115, 1, local416);
								} else if (local398 == 19) {
									Static46.method3162(local293, local410, 1, local416);
								} else if (local398 == 20) {
									Static46.method3162(local59, local410, 1, local416);
								} else {
									@Pc(610) int local610;
									if (local398 == 25) {
										for (local610 = 0; local610 < local128; local610++) {
											Static46.method3162(local610 + local59, local410 + -local610, 1, local416);
										}
									} else if (local398 == 26) {
										for (local610 = 0; local610 < local128; local610++) {
											Static46.method3162(local610 + local59, local115 + local610, 1, local416);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local59 = 0; local59 < local10; local59++) {
			local53 = local59 * local24 >> 16;
			local64 = (local59 + 1) * local24 >> 16;
			local77 = local64 - local53;
			if (local77 > 0) {
				local53 += arg1;
				@Pc(707) byte[][] local707 = Static62.aByteArrayArrayArray15[arg4 + local59 >> 6];
				for (@Pc(709) int local709 = 0; local709 < local15; local709++) {
					@Pc(719) int local719 = (local709 + 1) * local33 >> 16;
					@Pc(725) int local725 = local33 * local709 >> 16;
					@Pc(730) int local730 = local719 - local725;
					if (local730 > 0) {
						local107 = ((local709 + arg2 & 0x3F) << 6) + (local59 + arg4 & 0x3F);
						local725 += arg0;
						@Pc(761) int local761 = arg2 + local709 >> 6;
						if (local707[local761] != null) {
							local115 = local707[local761][local107] & 0xFF;
							if (local115 != 0) {
								if (local115 == 47 || local115 == 53) {
									Static18.aClass1_Sub3_Sub1_Sub5Array1[local115 - 1].method3180(local53, local725, local77 * 2 + 1, local730 * 2 + 1);
								} else {
									Static18.aClass1_Sub3_Sub1_Sub5Array1[local115 - 1].method3180(local53 - local77 / 2, -(local730 / 2) + local725, local77 * 2, local730 * 2);
								}
							}
						}
					}
				}
			}
		}
	}
}
