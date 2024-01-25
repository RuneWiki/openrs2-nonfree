import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!jh", name = "i", descriptor = "[Lclient!ida;")
	public static Class159[] aClass159Array1;

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIF[BFFLclient!mm;FFBII)V")
	public static void method4067(@OriginalArg(2) int arg0, @OriginalArg(3) float arg1, @OriginalArg(4) byte[] arg2, @OriginalArg(5) float arg3, @OriginalArg(6) float arg4, @OriginalArg(7) Class209 arg5, @OriginalArg(8) float arg6, @OriginalArg(9) float arg7) {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			Static471.method6276(arg0, arg3, local15, arg2, arg1, arg6, arg4, arg7, arg5);
			arg0 += 16384;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
	public static void method4069(@OriginalArg(0) int arg0) {
		if (arg0 == Static221.anInt3831) {
			return;
		}
		if (arg0 == 13) {
			if (Static464.aString94 == null) {
				Static253.method3815(Static399.anInt6574, Static525.aString100, Static330.aString71);
			} else {
				Static186.method2904(Static399.anInt6574);
			}
		}
		if (arg0 != 13 && Static673.aClass26_2 != null) {
			Static673.aClass26_2.method746();
			Static673.aClass26_2 = null;
		}
		if (arg0 == 3) {
			Static24.method561(Static104.anInt2019 != Static187.anInt3418);
		}
		if (arg0 == 7) {
			Static172.method2747(Static335.anInt5741 != Static187.anInt3418);
		}
		if (arg0 == 5) {
			if (Static464.aString94 == null) {
				Static396.method5509(Static525.aString100, Static330.aString71);
			} else {
				Static484.method6389();
			}
		} else if (arg0 == 6) {
			if (Static464.aString94 == null) {
				Static253.method3815(Static399.anInt6574, Static525.aString100, Static330.aString71);
			} else {
				Static186.method2904(Static399.anInt6574);
			}
		} else if (arg0 == 9) {
			if (Static464.aString94 == null) {
				Static253.method3815(Static399.anInt6574, Static525.aString100, Static330.aString71);
			} else {
				Static186.method2904(Static399.anInt6574);
			}
		} else if (arg0 == 12) {
			if (Static464.aString94 == null) {
				Static396.method5509(Static525.aString100, Static330.aString71);
			} else {
				Static484.method6389();
			}
		}
		if (Static408.method5609(Static221.anInt3831)) {
			Static532.aClass362_114.anInt10235 = 2;
			Static195.aClass362_41.anInt10235 = 2;
			Static666.aClass362_154.anInt10235 = 2;
			Static354.aClass362_73.anInt10235 = 2;
			Static117.aClass362_22.anInt10235 = 2;
			Static216.aClass362_46.anInt10235 = 2;
			Static617.aClass362_78.anInt10235 = 2;
		}
		if (Static408.method5609(arg0)) {
			Static642.anInt10564 = 0;
			Static643.anInt10568 = 1;
			Static193.anInt3514 = 1;
			Static483.anInt7695 = 0;
			Static358.anInt6109 = 0;
			Static345.method5025(true);
			Static532.aClass362_114.anInt10235 = 1;
			Static195.aClass362_41.anInt10235 = 1;
			Static666.aClass362_154.anInt10235 = 1;
			Static354.aClass362_73.anInt10235 = 1;
			Static117.aClass362_22.anInt10235 = 1;
			Static216.aClass362_46.anInt10235 = 1;
			Static617.aClass362_78.anInt10235 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static288.method4154();
		}
		@Pc(229) boolean local229 = arg0 == 2 || Static413.method5629(arg0) || Static592.method7807(arg0);
		@Pc(246) boolean local246 = Static221.anInt3831 == 2 || Static413.method5629(Static221.anInt3831) || Static592.method7807(Static221.anInt3831);
		if (local246 != local229) {
			if (local229) {
				Static189.anInt3426 = Static339.anInt5830;
				if (Static336.aClass3_Sub41_18.aClass14_Sub9_5.method2998() == 0) {
					Static643.method8653();
				} else {
					Static679.method9039(Static214.aClass362_141, Static339.anInt5830, Static336.aClass3_Sub41_18.aClass14_Sub9_5.method2998());
					Static115.method1733();
				}
				Static512.aClass113_3.method2604(false);
			} else {
				Static643.method8653();
				Static512.aClass113_3.method2604(true);
			}
		}
		if (Static408.method5609(arg0) || arg0 == 13) {
			Static119.aClass95_4.method8019();
		}
		Static221.anInt3831 = arg0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZIIII)V")
	public static void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg2 < 1) {
			arg2 = 1;
		}
		@Pc(40) int local40 = arg2 - 334;
		if (local40 < 0) {
			local40 = 0;
		} else if (local40 > 100) {
			local40 = 100;
		}
		@Pc(62) int local62 = local40 * (Static486.aShort71 - Static469.aShort65) / 100 + Static469.aShort65;
		if (local62 < Static382.aShort55) {
			local62 = Static382.aShort55;
		} else if (Static241.aShort44 < local62) {
			local62 = Static241.aShort44;
		}
		@Pc(92) int local92 = local62 * arg2 * 512 / (arg4 * 334);
		@Pc(122) int local122;
		@Pc(128) int local128;
		@Pc(97) short local97;
		if (Static343.aShort51 > local92) {
			local97 = Static343.aShort51;
			local62 = arg4 * local97 * 334 / (arg2 * 512);
			if (local62 > Static241.aShort44) {
				local62 = Static241.aShort44;
				local122 = local62 * 512 * arg2 / (local97 * 334);
				local128 = (arg4 - local122) / 2;
				if (arg1) {
					Static119.aClass95_4.la();
					Static119.aClass95_4.method8054(arg2, arg0, local128, arg3, -16777216);
					Static119.aClass95_4.method8054(arg2, arg0, local128, arg4 + arg3 - local128, -16777216);
				}
				arg3 += local128;
				arg4 -= local128 * 2;
			}
		} else if (Static464.aShort64 < local92) {
			local97 = Static464.aShort64;
			local62 = arg4 * local97 * 334 / (arg2 * 512);
			if (local62 < Static382.aShort55) {
				local62 = Static382.aShort55;
				local122 = local97 * arg4 * 334 / (local62 * 512);
				local128 = (arg2 - local122) / 2;
				if (arg1) {
					Static119.aClass95_4.la();
					Static119.aClass95_4.method8054(local128, arg0, arg4, arg3, -16777216);
					Static119.aClass95_4.method8054(local128, arg2 + arg0 - local128, arg4, arg3, -16777216);
				}
				arg2 -= local128 * 2;
				arg0 += local128;
			}
		}
		Static274.anInt4695 = arg0;
		Static502.anInt7942 = local62 * arg2 / 334;
		Static635.anInt10497 = (short) arg2;
		Static397.anInt9628 = (short) arg4;
		Static270.anInt4660 = arg3;
	}
}
