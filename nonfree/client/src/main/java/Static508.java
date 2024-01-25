import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static508 {

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "Ljava/lang/Object;")
	public static Object anObject21;

	@OriginalMember(owner = "client!vca", name = "d", descriptor = "Lclient!os;")
	public static final Class223 aClass223_7 = new Class223();

	@OriginalMember(owner = "client!vca", name = "g", descriptor = "[I")
	public static final int[] anIntArray750 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!vca", name = "h", descriptor = "I")
	public static int anInt8865 = -1;

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(IILclient!oa;ILclient!lm;Lclient!lq;)Z")
	public static boolean method7282(@OriginalArg(2) Class5 arg0, @OriginalArg(4) Class179 arg1, @OriginalArg(5) Class3_Sub31 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg1.anIntArray509 != null) {
			local16 = Static55.anInt1973 - (Static55.anInt1973 - Static55.anInt1976) * (arg2.anInt5806 + arg1.anInt5734 - Static55.anInt1979) / (Static55.anInt1983 - Static55.anInt1979);
			local7 = Static55.anInt1981 + (Static55.anInt1980 - Static55.anInt1981) * (arg2.anInt5808 + arg1.anInt5718 - Static55.anInt1975) / (Static55.anInt1977 - Static55.anInt1975);
			local9 = Static55.anInt1981 + (Static55.anInt1980 - Static55.anInt1981) * (arg2.anInt5808 + arg1.anInt5732 - Static55.anInt1975) / (Static55.anInt1977 - Static55.anInt1975);
			local18 = Static55.anInt1973 - (Static55.anInt1973 - Static55.anInt1976) * (-Static55.anInt1979 + (arg1.anInt5727 - -arg2.anInt5806)) / (Static55.anInt1983 - Static55.anInt1979);
		}
		@Pc(108) Class119 local108 = null;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		if (arg1.anInt5730 != -1) {
			if (arg2.aBoolean374 && arg1.anInt5724 != -1) {
				local108 = arg1.method4798(true, arg0);
			} else {
				local108 = arg1.method4798(false, arg0);
			}
			if (local108 != null) {
				local110 = arg2.anInt5805 - (local108.AA() + 1 >> 1);
				local112 = arg2.anInt5805 + (local108.AA() + 1 >> 1);
				if (local7 > local110) {
					local7 = local110;
				}
				local114 = arg2.anInt5807 - (local108.a() + 1 >> 1);
				if (local9 < local112) {
					local9 = local112;
				}
				local116 = arg2.anInt5807 + (local108.a() + 1 >> 1);
				if (local114 < local16) {
					local16 = local114;
				}
				if (local116 > local18) {
					local18 = local116;
				}
			}
		}
		@Pc(214) Class106 local214 = null;
		@Pc(216) int local216 = 0;
		@Pc(218) int local218 = 0;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(278) int local278;
		@Pc(301) int local301;
		if (arg1.aString41 != null) {
			local214 = Static149.method2553(arg1.anInt5726);
			if (local214 != null) {
				local216 = Static23.aClass53_15.method1385(arg1.aString41, null, null, Static137.aStringArray18);
				local218 = arg2.anInt5807;
				if (local108 == null) {
					local218 -= local214.method3103() * local216 / 2;
				} else {
					local218 -= (local108.a() >> 1) + (local214.method3105() * local216);
				}
				for (local278 = 0; local278 < local216; local278++) {
					@Pc(284) String local284 = Static137.aStringArray18[local278];
					if (local216 - 1 > local278) {
						local284 = local284.substring(0, local284.length() - 4);
					}
					local301 = local214.method3106(local284);
					if (local220 < local301) {
						local220 = local301;
					}
				}
				local222 = arg2.anInt5805 - local220 / 2;
				local224 = local220 / 2 + arg2.anInt5805;
				if (local222 < local7) {
					local7 = local222;
				}
				local226 = local218;
				if (local9 < local224) {
					local9 = local224;
				}
				if (local226 < local16) {
					local16 = local226;
				}
				local228 = local214.method3105() * local216 + local218;
				if (local18 < local228) {
					local18 = local228;
				}
			}
		}
		if (Static55.anInt1981 > local9 || local7 > Static55.anInt1980 || Static55.anInt1976 > local18 || local16 > Static55.anInt1973) {
			return true;
		}
		@Pc(415) int local415;
		if (arg1.anIntArray509 != null) {
			@Pc(413) int[] local413 = new int[arg1.anIntArray509.length];
			for (local415 = 0; local415 < local413.length / 2; local415++) {
				local301 = arg1.anIntArray509[local415 * 2] + arg2.anInt5808;
				@Pc(441) int local441 = arg1.anIntArray509[local415 * 2 + 1] + arg2.anInt5806;
				local413[local415 * 2] = (Static55.anInt1980 - Static55.anInt1981) * (-Static55.anInt1975 + local301) / (Static55.anInt1977 - Static55.anInt1975) + Static55.anInt1981;
				local413[local415 * 2 + 1] = Static55.anInt1973 - (local441 - Static55.anInt1979) * (Static55.anInt1973 + -Static55.anInt1976) / (Static55.anInt1983 - Static55.anInt1979);
			}
			Static540.method7705(arg0, local413, arg1.anInt5714);
			for (local301 = 0; local301 < local413.length / 2 - 1; local301++) {
				arg0.method7416(local413[local301 * 2 + 1 + 2], local413[local301 * 2], local413[local301 * 2 + 1], local413[local301 * 2 + 2], arg1.anInt5725);
			}
			arg0.method7416(local413[1], local413[local413.length - 2], local413[local413.length - 1], local413[0], arg1.anInt5725);
		}
		if (local108 != null) {
			if (Static307.anInt4841 > 0 && (Static469.anInt8466 != -1 && Static469.anInt8466 == arg2.anInt5809 || Static213.anInt4694 != -1 && arg1.anInt5728 == Static213.anInt4694)) {
				if (Static106.anInt2360 <= 50) {
					local278 = Static106.anInt2360 * 2;
				} else {
					local278 = (100 - Static106.anInt2360) * 2;
				}
				local415 = local278 << 24 | 0xFFFF00;
				arg0.method7411(local415, local108.QA() / 2 + 7, arg2.anInt5805, arg2.anInt5807);
				arg0.method7411(local415, local108.QA() / 2 + 5, arg2.anInt5805, arg2.anInt5807);
				arg0.method7411(local415, local108.QA() / 2 + 3, arg2.anInt5805, arg2.anInt5807);
				arg0.method7411(local415, local108.QA() / 2 + 1, arg2.anInt5805, arg2.anInt5807);
				arg0.method7411(local415, local108.QA() / 2, arg2.anInt5805, arg2.anInt5807);
			}
			local108.method6678(arg2.anInt5805 - (local108.AA() >> 1), arg2.anInt5807 - (local108.a() >> 1));
		}
		if (arg1.aString41 != null && local214 != null) {
			Static11.method645(arg0, local220, arg2, local218, local214, local216, arg1);
		}
		if (arg1.anInt5730 != -1 || arg1.aString41 != null) {
			@Pc(729) Class3_Sub50 local729 = new Class3_Sub50(arg2);
			local729.anInt9371 = local226;
			local729.anInt9376 = local112;
			local729.anInt9374 = local228;
			local729.anInt9367 = local224;
			local729.anInt9372 = local114;
			local729.anInt9375 = local222;
			local729.anInt9369 = local110;
			local729.anInt9370 = local116;
			Static325.aClass71_47.method2076(local729);
		}
		return false;
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(III[BII[BZI)V")
	public static void method7283(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = -(arg2 >> 2);
		@Pc(15) int local15 = -(arg2 & 0x3);
		for (@Pc(18) int local18 = -arg4; local18 < 0; local18++) {
			@Pc(26) int local26;
			for (@Pc(22) int local22 = local10; local22 < 0; local22++) {
				local26 = arg7++;
				arg6[local26] = (byte) (arg6[local26] - arg3[arg1++]);
				@Pc(39) int local39 = arg7++;
				arg6[local39] = (byte) (arg6[local39] - arg3[arg1++]);
				@Pc(52) int local52 = arg7++;
				arg6[local52] = (byte) (arg6[local52] - arg3[arg1++]);
				@Pc(65) int local65 = arg7++;
				arg6[local65] = (byte) (arg6[local65] - arg3[arg1++]);
			}
			for (@Pc(84) int local84 = local15; local84 < 0; local84++) {
				local26 = arg7++;
				arg6[local26] = (byte) (arg6[local26] - arg3[arg1++]);
			}
			arg1 += arg5;
			arg7 += arg0;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(Z[B)[B")
	public static byte[] method7284(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub27 local8 = new Class3_Sub27(arg0);
		@Pc(12) int local12 = local8.method7548();
		@Pc(21) int local21 = local8.method7549();
		if (local21 < 0 || Static167.anInt3860 != 0 && local21 > Static167.anInt3860) {
			throw new RuntimeException();
		} else if (local12 == 0) {
			@Pc(98) byte[] local98 = new byte[local21];
			local8.method7571(local98, local21);
			return local98;
		} else {
			@Pc(44) int local44 = local8.method7549();
			if (local44 < 0 || Static167.anInt3860 != 0 && Static167.anInt3860 < local44) {
				throw new RuntimeException();
			}
			@Pc(68) byte[] local68 = new byte[local44];
			if (local12 == 1) {
				Static175.method3332(local68, local44, arg0, local21);
			} else {
				@Pc(73) Class261 local73 = Static182.aClass261_1;
				synchronized (Static182.aClass261_1) {
					Static182.aClass261_1.method6528(local8, local68);
				}
			}
			return local68;
		}
	}

	@OriginalMember(owner = "client!vca", name = "a", descriptor = "(I)V")
	public static void method7286() {
		@Pc(12) byte[] local12;
		if (Static479.anObject20 == null) {
			@Pc(5) Class12_Sub1_Sub2 local5 = new Class12_Sub1_Sub2();
			local12 = local5.method6187();
			Static479.anObject20 = Static11.method646(local12);
		}
		if (Static169.anObject7 == null) {
			@Pc(27) Class12_Sub2_Sub1 local27 = new Class12_Sub2_Sub1();
			local12 = local27.method1628();
			Static169.anObject7 = Static11.method646(local12);
		}
	}
}
