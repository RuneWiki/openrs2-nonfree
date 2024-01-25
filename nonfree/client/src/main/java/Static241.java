import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static241 {

	@OriginalMember(owner = "client!ja", name = "h", descriptor = "Lclient!mv;")
	public static Class229 aClass229_54;

	@OriginalMember(owner = "client!ja", name = "c", descriptor = "[Lclient!ofa;")
	public static final Class2_Sub2_Sub15[] aClass2_Sub2_Sub15Array1 = new Class2_Sub2_Sub15[14];

	@OriginalMember(owner = "client!ja", name = "f", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_65 = new Class349(10, -1);

	@OriginalMember(owner = "client!ja", name = "m", descriptor = "I")
	public static int anInt3998 = -1;

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIB)I")
	public static int method3436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) double local10 = Math.log((double) arg1) / Math.log(2.0D);
		@Pc(22) double local22 = Math.log((double) arg0) / Math.log(2.0D);
		@Pc(30) double local30 = Math.random() * (local10 - local22) + local22;
		return (int) (Math.pow(2.0D, local30) + 0.5D);
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIIII)V")
	public static void method3438(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static257.aClass2_Sub35_Sub1_1.anInt7505 != 0 && arg4 != 0 && Static276.anInt4784 < 50 && arg5 != -1) {
			Static537.aClass67Array1[Static276.anInt4784++] = new Class67((byte) 1, arg5, arg4, arg3, arg0, arg1, arg2, null);
		}
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(ILclient!hh;ILclient!hi;ZLclient!r;)Z")
	public static boolean method3439(@OriginalArg(1) Class142 arg0, @OriginalArg(3) Class2_Sub20 arg1, @OriginalArg(5) Class162 arg2) {
		@Pc(7) int local7 = Integer.MAX_VALUE;
		@Pc(14) int local14 = Integer.MIN_VALUE;
		@Pc(16) int local16 = Integer.MAX_VALUE;
		@Pc(18) int local18 = Integer.MIN_VALUE;
		if (arg0.anIntArray244 != null) {
			local18 = Static476.anInt7579 - (Static476.anInt7579 - Static476.anInt7585) * (-Static476.anInt7578 + arg0.anInt2958 - -arg1.anInt2973) / (Static476.anInt7575 - Static476.anInt7578);
			local14 = Static476.anInt7580 + (arg0.anInt2934 + arg1.anInt2971 - Static476.anInt7582) * (Static476.anInt7581 - Static476.anInt7580) / (Static476.anInt7577 - Static476.anInt7582);
			local16 = Static476.anInt7579 - (arg1.anInt2973 + arg0.anInt2944 - Static476.anInt7578) * (Static476.anInt7579 - Static476.anInt7585) / (Static476.anInt7575 - Static476.anInt7578);
			local7 = (Static476.anInt7581 - Static476.anInt7580) * (arg0.anInt2957 + arg1.anInt2971 - Static476.anInt7582) / (Static476.anInt7577 - Static476.anInt7582) + Static476.anInt7580;
		}
		@Pc(108) Class38 local108 = null;
		@Pc(110) int local110 = 0;
		@Pc(112) int local112 = 0;
		@Pc(114) int local114 = 0;
		@Pc(116) int local116 = 0;
		if (arg0.anInt2961 != -1) {
			if (arg1.aBoolean213 && arg0.anInt2946 != -1) {
				local108 = arg0.method2523(true, arg2);
			} else {
				local108 = arg0.method2523(false, arg2);
			}
			if (local108 != null) {
				local110 = arg1.anInt2968 - (local108.A() + 1 >> 1);
				if (local7 > local110) {
					local7 = local110;
				}
				local112 = arg1.anInt2968 + (local108.A() + 1 >> 1);
				local114 = arg1.anInt2974 - (local108.ca() + 1 >> 1);
				if (local112 > local14) {
					local14 = local112;
				}
				local116 = arg1.anInt2974 + (local108.ca() + 1 >> 1);
				if (local114 < local16) {
					local16 = local114;
				}
				if (local18 < local116) {
					local18 = local116;
				}
			}
		}
		@Pc(218) Class200 local218 = null;
		@Pc(220) int local220 = 0;
		@Pc(222) int local222 = 0;
		@Pc(224) int local224 = 0;
		@Pc(226) int local226 = 0;
		@Pc(228) int local228 = 0;
		@Pc(230) int local230 = 0;
		@Pc(232) int local232 = 0;
		@Pc(286) int local286;
		@Pc(313) int local313;
		if (arg0.aString42 != null) {
			local218 = Static452.method5888(arg0.anInt2955);
			if (local218 != null) {
				local220 = Static125.aClass112_5.method2082(null, Static494.aStringArray37, null, arg0.aString42);
				local222 = arg1.anInt2974;
				if (local108 == null) {
					local222 -= local220 * local218.method4085() / 2;
				} else {
					local222 -= (local108.ca() >> 1) + (local220 * local218.method4087());
				}
				for (local286 = 0; local286 < local220; local286++) {
					@Pc(292) String local292 = Static494.aStringArray37[local286];
					if (local286 < local220 - 1) {
						local292 = local292.substring(0, local292.length() - 4);
					}
					local313 = local218.method4083(local292);
					if (local224 < local313) {
						local224 = local313;
					}
				}
				local226 = arg1.anInt2968 - local224 / 2;
				if (local226 < local7) {
					local7 = local226;
				}
				local228 = arg1.anInt2968 + local224 / 2;
				local230 = local222;
				if (local14 < local228) {
					local14 = local228;
				}
				local232 = local222 + local218.method4087() * local220;
				if (local16 > local230) {
					local16 = local230;
				}
				if (local18 < local232) {
					local18 = local232;
				}
			}
		}
		if (Static476.anInt7580 > local14 || local7 > Static476.anInt7581 || local18 < Static476.anInt7585 || local16 > Static476.anInt7579) {
			return true;
		}
		@Pc(418) int local418;
		if (arg0.anIntArray244 != null) {
			@Pc(416) int[] local416 = new int[arg0.anIntArray244.length];
			for (local418 = 0; local418 < local416.length / 2; local418++) {
				local313 = arg0.anIntArray244[local418 * 2] + arg1.anInt2971;
				@Pc(444) int local444 = arg0.anIntArray244[local418 * 2 + 1] + arg1.anInt2973;
				local416[local418 * 2] = Static476.anInt7580 + (local313 - Static476.anInt7582) * (-Static476.anInt7580 + Static476.anInt7581) / (Static476.anInt7577 - Static476.anInt7582);
				local416[local418 * 2 + 1] = Static476.anInt7579 - (local444 - Static476.anInt7578) * (-Static476.anInt7585 + Static476.anInt7579) / (Static476.anInt7575 - Static476.anInt7578);
			}
			Static54.method941(arg2, local416, arg0.anInt2951);
			for (local313 = 0; local313 < local416.length / 2 - 1; local313++) {
				arg2.method6849(local416[local313 * 2], local416[local313 * 2 + 3], local416[local313 * 2 + 1], local416[local313 * 2 + 2], arg0.anInt2952);
			}
			arg2.method6849(local416[local416.length - 2], local416[1], local416[local416.length - 1], local416[0], arg0.anInt2952);
		}
		if (local108 != null) {
			if (Static150.anInt2432 > 0 && (Static63.anInt1135 != -1 && arg1.anInt2970 == Static63.anInt1135 || Static340.anInt5890 != -1 && Static340.anInt5890 == arg0.anInt2962)) {
				if (Static82.anInt1424 > 50) {
					local286 = 200 - Static82.anInt1424 * 2;
				} else {
					local286 = Static82.anInt1424 * 2;
				}
				local418 = local286 << 24 | 0xFFFF00;
				arg2.method6859(arg1.anInt2974, local108.E() / 2 + 7, arg1.anInt2968, local418);
				arg2.method6859(arg1.anInt2974, local108.E() / 2 + 5, arg1.anInt2968, local418);
				arg2.method6859(arg1.anInt2974, local108.E() / 2 + 3, arg1.anInt2968, local418);
				arg2.method6859(arg1.anInt2974, local108.E() / 2 + 1, arg1.anInt2968, local418);
				arg2.method6859(arg1.anInt2974, local108.E() / 2, arg1.anInt2968, local418);
			}
			local108.method7463(arg1.anInt2968 - (local108.A() >> 1), arg1.anInt2974 - (local108.ca() >> 1));
		}
		if (arg0.aString42 != null && local218 != null) {
			Static173.method2267(local220, arg2, local222, local224, arg1, local218, arg0);
		}
		if (arg0.anInt2961 != -1 || arg0.aString42 != null) {
			@Pc(734) Class2_Sub38 local734 = new Class2_Sub38(arg1);
			local734.anInt6771 = local114;
			local734.anInt6775 = local110;
			local734.anInt6768 = local112;
			local734.anInt6773 = local228;
			local734.anInt6778 = local232;
			local734.anInt6776 = local230;
			local734.anInt6779 = local226;
			local734.anInt6774 = local116;
			Static177.aClass70_9.method1269(local734);
		}
		return false;
	}

	@OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIIIIIII)V")
	public static void method3442(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg1 - arg2;
		@Pc(20) int local20 = arg6 - arg2;
		@Pc(24) int local24 = arg1 * arg1;
		@Pc(28) int local28 = arg6 * arg6;
		@Pc(32) int local32 = local15 * local15;
		@Pc(36) int local36 = local20 * local20;
		@Pc(40) int local40 = local28 << 1;
		@Pc(44) int local44 = local24 << 1;
		@Pc(48) int local48 = local36 << 1;
		@Pc(52) int local52 = local32 << 1;
		@Pc(56) int local56 = arg6 << 1;
		@Pc(60) int local60 = local20 << 1;
		@Pc(68) int local68 = local40 + local24 * (1 - local56);
		@Pc(77) int local77 = local28 - (local56 - 1) * local44;
		@Pc(87) int local87 = (1 - local60) * local32 + local48;
		@Pc(99) int local99 = local36 - local52 * (local60 - 1);
		@Pc(103) int local103 = local24 << 2;
		@Pc(107) int local107 = local28 << 2;
		@Pc(111) int local111 = local32 << 2;
		@Pc(115) int local115 = local36 << 2;
		@Pc(119) int local119 = local40 * 3;
		@Pc(125) int local125 = (local56 - 3) * local44;
		@Pc(129) int local129 = local48 * 3;
		@Pc(135) int local135 = local52 * (local60 - 3);
		@Pc(137) int local137 = local107;
		@Pc(143) int local143 = local103 * (arg6 - 1);
		@Pc(145) int local145 = local115;
		@Pc(151) int local151 = (local20 - 1) * local111;
		@Pc(177) int local177;
		@Pc(185) int local185;
		@Pc(193) int local193;
		@Pc(201) int local201;
		if (arg5 >= Static275.anInt4756 && Static48.anInt898 >= arg5) {
			@Pc(169) int[] local169 = Static238.anIntArrayArray36[arg5];
			local177 = Static290.method4092(Static89.anInt1576, arg4 - arg1, Static130.anInt2131);
			local185 = Static290.method4092(Static89.anInt1576, arg1 + arg4, Static130.anInt2131);
			local193 = Static290.method4092(Static89.anInt1576, arg4 - local15, Static130.anInt2131);
			local201 = Static290.method4092(Static89.anInt1576, arg4 + local15, Static130.anInt2131);
			Static437.method5735(local177, local169, local193, arg0);
			Static437.method5735(local193, local169, local201, arg3);
			Static437.method5735(local201, local169, local185, arg0);
		}
		while (local9 > 0) {
			@Pc(228) boolean local228 = local20 >= local9;
			if (local68 < 0) {
				while (local68 < 0) {
					local68 += local119;
					local77 += local137;
					local137 += local107;
					local7++;
					local119 += local107;
				}
			}
			if (local228) {
				if (local87 < 0) {
					while (local87 < 0) {
						local99 += local145;
						local87 += local129;
						local145 += local115;
						local129 += local115;
						local11++;
					}
				}
				if (local99 < 0) {
					local87 += local129;
					local99 += local145;
					local129 += local115;
					local11++;
					local145 += local115;
				}
				local87 += -local151;
				local99 += -local135;
				local135 -= local111;
				local151 -= local111;
			}
			if (local77 < 0) {
				local77 += local137;
				local68 += local119;
				local137 += local107;
				local119 += local107;
				local7++;
			}
			local68 += -local143;
			local77 += -local125;
			local9--;
			local125 -= local103;
			local143 -= local103;
			local177 = arg5 - local9;
			local185 = arg5 + local9;
			if (local185 >= Static275.anInt4756 && local177 <= Static48.anInt898) {
				local193 = Static290.method4092(Static89.anInt1576, local7 + arg4, Static130.anInt2131);
				local201 = Static290.method4092(Static89.anInt1576, arg4 - local7, Static130.anInt2131);
				if (local228) {
					@Pc(438) int local438 = Static290.method4092(Static89.anInt1576, local11 + arg4, Static130.anInt2131);
					@Pc(447) int local447 = Static290.method4092(Static89.anInt1576, arg4 - local11, Static130.anInt2131);
					@Pc(458) int[] local458;
					if (local177 >= Static275.anInt4756) {
						local458 = Static238.anIntArrayArray36[local177];
						Static437.method5735(local201, local458, local447, arg0);
						Static437.method5735(local447, local458, local438, arg3);
						Static437.method5735(local438, local458, local193, arg0);
					}
					if (local185 <= Static48.anInt898) {
						local458 = Static238.anIntArrayArray36[local185];
						Static437.method5735(local201, local458, local447, arg0);
						Static437.method5735(local447, local458, local438, arg3);
						Static437.method5735(local438, local458, local193, arg0);
					}
				} else {
					if (local177 >= Static275.anInt4756) {
						Static437.method5735(local201, Static238.anIntArrayArray36[local177], local193, arg0);
					}
					if (local185 <= Static48.anInt898) {
						Static437.method5735(local201, Static238.anIntArrayArray36[local185], local193, arg0);
					}
				}
			}
		}
	}
}
