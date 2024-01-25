import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!oh", name = "W", descriptor = "I")
	public static int anInt4619;

	@OriginalMember(owner = "client!oh", name = "vb", descriptor = "Lclient!ij;")
	public static Class93 aClass93_87;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "[I")
	public static final int[] anIntArray419 = new int[100];

	@OriginalMember(owner = "client!oh", name = "Z", descriptor = "Lclient!jm;")
	public static final Class103 aClass103_111 = new Class103();

	@OriginalMember(owner = "client!oh", name = "tb", descriptor = "I")
	public static int anInt4634 = 0;

	@OriginalMember(owner = "client!oh", name = "ub", descriptor = "J")
	public static long aLong161 = -1L;

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZIZI)Lclient!ij;")
	public static Class93 method4129(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(10) Class140 local10 = null;
		if (Static87.aClass129_2 != null) {
			local10 = new Class140(arg1, Static87.aClass129_2, Static237.aClass129Array1[arg1], 1000000);
		}
		Static157.aClass82_Sub1Array1[arg1] = Static78.aClass138_1.method3849(local10, Static350.aClass140_4, arg1);
		if (arg0) {
			Static157.aClass82_Sub1Array1[arg1].method1932();
		}
		return new Class93(Static157.aClass82_Sub1Array1[arg1], arg2, 1);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)V")
	public static void method4132(@OriginalArg(1) int arg0) {
		if (arg0 < 0 || arg0 > 2) {
			arg0 = 0;
		}
		Static74.anInt1431 = arg0;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!wk;Lclient!qg;Lclient!ea;BI)Z")
	public static boolean method4133(@OriginalArg(1) Class215 arg0, @OriginalArg(2) Class5_Sub32 arg1, @OriginalArg(3) Class55 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(9) int local9 = Integer.MIN_VALUE;
		@Pc(11) int local11 = Integer.MAX_VALUE;
		@Pc(13) int local13 = Integer.MIN_VALUE;
		if (arg0.anIntArray638 != null) {
			local13 = Static290.anInt2774 - (Static290.anInt2774 - Static290.anInt2773) * (-Static290.anInt2769 + (arg0.anInt6763 - -arg1.anInt5143)) / (Static290.anInt2770 - Static290.anInt2769);
			local9 = Static290.anInt2767 + (arg0.anInt6752 + arg1.anInt5145 - Static290.anInt2771) * (-Static290.anInt2767 + Static290.anInt2768) / (Static290.anInt2775 - Static290.anInt2771);
			local7 = Static290.anInt2767 + (arg0.anInt6755 + arg1.anInt5145 - Static290.anInt2771) * (Static290.anInt2768 - Static290.anInt2767) / (Static290.anInt2775 - Static290.anInt2771);
			local11 = Static290.anInt2774 - (Static290.anInt2774 - Static290.anInt2773) * (arg1.anInt5143 + arg0.anInt6753 + -Static290.anInt2769) / (Static290.anInt2770 - Static290.anInt2769);
		}
		@Pc(105) Class95 local105 = null;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		@Pc(118) int local118 = 0;
		if (arg0.anInt6749 != -1) {
			if (arg1.aBoolean430 && arg0.anInt6767 != -1) {
				local105 = arg0.method5992(true, arg2);
			} else {
				local105 = arg0.method5992(false, arg2);
			}
			if (local105 != null) {
				local112 = arg1.anInt5144 - (local105.method5507() + 1 >> 1);
				local114 = arg1.anInt5144 + (local105.method5507() + 1 >> 1);
				if (local112 < local7) {
					local7 = local112;
				}
				if (local114 > local9) {
					local9 = local114;
				}
				local116 = arg1.anInt5149 - (local105.method5494() + 1 >> 1);
				if (local11 > local116) {
					local11 = local116;
				}
				local118 = arg1.anInt5149 + (local105.method5494() + 1 >> 1);
				if (local118 > local13) {
					local13 = local118;
				}
			}
		}
		@Pc(222) Class71 local222 = null;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(234) int local234 = 0;
		@Pc(236) int local236 = 0;
		@Pc(286) int local286;
		@Pc(313) int local313;
		if (arg0.aString66 != null) {
			local222 = Static32.method561(arg0.anInt6781);
			if (local222 != null) {
				local224 = Static185.aClass36_6.method644(null, Static314.aStringArray62, arg0.aString66, null);
				local226 = arg1.anInt5149;
				if (local105 == null) {
					local226 -= local222.method1622() * local224 / 2;
				} else {
					local226 -= (local105.method5494() >> 1) + (local224 * local222.method1627());
				}
				for (local286 = 0; local286 < local224; local286++) {
					@Pc(292) String local292 = Static314.aStringArray62[local286];
					if (local286 < local224 - 1) {
						local292 = local292.substring(0, local292.length() - 4);
					}
					local313 = local222.method1623(local292);
					if (local313 > local228) {
						local228 = local313;
					}
				}
				local230 = arg1.anInt5144 - local228 / 2;
				if (local7 > local230) {
					local7 = local230;
				}
				local232 = arg1.anInt5144 + local228 / 2;
				local234 = local226;
				if (local9 < local232) {
					local9 = local232;
				}
				if (local234 < local11) {
					local11 = local234;
				}
				local236 = local222.method1627() * local224 + local226;
				if (local236 > local13) {
					local13 = local236;
				}
			}
		}
		if (local9 < Static290.anInt2767 || Static290.anInt2768 < local7 || local13 < Static290.anInt2773 || Static290.anInt2774 < local11) {
			return true;
		}
		@Pc(423) int local423;
		if (arg0.anIntArray638 != null) {
			@Pc(421) int[] local421 = new int[arg0.anIntArray638.length];
			for (local423 = 0; local423 < local421.length / 2; local423++) {
				local313 = arg1.anInt5145 + arg0.anIntArray638[local423 * 2];
				@Pc(448) int local448 = arg0.anIntArray638[local423 * 2 + 1] + arg1.anInt5143;
				local421[local423 * 2] = (Static290.anInt2768 - Static290.anInt2767) * (local313 + -Static290.anInt2771) / (Static290.anInt2775 - Static290.anInt2771) + Static290.anInt2767;
				local421[local423 * 2 + 1] = Static290.anInt2774 - (Static290.anInt2774 - Static290.anInt2773) * (local448 - Static290.anInt2769) / (Static290.anInt2770 - Static290.anInt2769);
			}
			Static71.method1319(arg2, local421, arg0.anInt6762);
			for (local313 = 0; local313 < local421.length / 2 - 1; local313++) {
				arg2.method5208(arg0.anInt6770, local421[local313 * 2 + 1], local421[(local313 + 1) * 2 + 1], local421[local313 * 2], local421[local313 * 2 + 2]);
			}
			arg2.method5208(arg0.anInt6770, local421[local421.length - 1], local421[1], local421[local421.length - 2], local421[0]);
		}
		if (local105 != null) {
			if (Static191.anInt3783 > 0 && (Static320.anInt6195 != -1 && Static320.anInt6195 == arg1.anInt5146 || Static73.anInt1412 != -1 && arg0.anInt6774 == Static73.anInt1412)) {
				if (anInt4619 > 50) {
					local286 = (100 - anInt4619) * 2;
				} else {
					local286 = anInt4619 * 2;
				}
				local423 = local286 << 24 | 0xFFFF00;
				arg2.method5169(local105.method5503() / 2 + 7, local423, arg1.anInt5149, arg1.anInt5144);
				arg2.method5169(local105.method5503() / 2 + 5, local423, arg1.anInt5149, arg1.anInt5144);
				arg2.method5169(local105.method5503() / 2 + 3, local423, arg1.anInt5149, arg1.anInt5144);
				arg2.method5169(local105.method5503() / 2 + 1, local423, arg1.anInt5149, arg1.anInt5144);
				arg2.method5169(local105.method5503() / 2, local423, arg1.anInt5149, arg1.anInt5144);
			}
			local105.method5491(arg1.anInt5144 - (local105.method5507() >> 1), arg1.anInt5149 + -(local105.method5494() >> 1));
		}
		if (arg0.aString66 != null && local222 != null) {
			Static178.method3192(arg2, local222, local224, arg1, local228, local226, arg0);
		}
		if (arg0.anInt6749 != -1 || arg0.aString66 != null) {
			@Pc(740) Class5_Sub34 local740 = new Class5_Sub34(arg1);
			local740.anInt5210 = local118;
			local740.anInt5211 = local234;
			local740.anInt5209 = local232;
			local740.anInt5217 = local116;
			local740.anInt5214 = local230;
			local740.anInt5218 = local114;
			local740.anInt5219 = local112;
			local740.anInt5207 = local236;
			Static239.aClass103_116.method2745(local740);
		}
		return false;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)Lclient!so;")
	public static Class4_Sub2 method4134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static178.aClass174ArrayArrayArray3[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class4_Sub2 local14 = local7.aClass4_Sub2_1;
			local7.aClass4_Sub2_1 = null;
			return local14;
		}
	}
}
