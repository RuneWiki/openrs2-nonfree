import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "I")
	public static int anInt1354;

	@OriginalMember(owner = "client!fe", name = "w", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_406 = Static181.method2795("Allocating memory");

	@OriginalMember(owner = "client!fe", name = "y", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_407 = Static181.method2795("");

	@OriginalMember(owner = "client!fe", name = "B", descriptor = "Lclient!qe;")
	public static Class83 aClass83_408 = aClass83_406;

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_409 = Static181.method2795("Invalid username or password)3");

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "Lclient!qe;")
	public static Class83 aClass83_410 = aClass83_409;

	@OriginalMember(owner = "client!fe", name = "I", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_411 = Static181.method2795("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
	public static int anInt1353 = 0;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public static void method1035() {
		Static69.aClass2_Sub3_Sub1_2.method284(74);
		Static69.aClass2_Sub3_Sub1_2.method249(0L);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IB[Lclient!dg;III[BIII)V")
	public static void method1036(@OriginalArg(0) int arg0, @OriginalArg(2) Class22[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(10) Class2_Sub3 local10 = new Class2_Sub3(arg5);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(30) int local30 = local10.method232();
			if (local30 == 0) {
				return;
			}
			local12 += local30;
			@Pc(41) int local41 = 0;
			while (true) {
				@Pc(45) int local45 = local10.method232();
				if (local45 == 0) {
					break;
				}
				local41 += local45 - 1;
				@Pc(57) int local57 = local41 & 0x3F;
				@Pc(63) int local63 = local41 >> 6 & 0x3F;
				@Pc(67) int local67 = local10.method260();
				@Pc(71) int local71 = local67 & 0x3;
				@Pc(75) int local75 = local67 >> 2;
				@Pc(79) int local79 = local41 >> 12;
				if (local79 == arg0 && arg2 <= local63 && local63 < arg2 + 8 && local57 >= arg7 && local57 < arg7 + 8) {
					@Pc(114) Class2_Sub2_Sub20 local114 = Static99.method1689(local12);
					@Pc(131) int local131 = arg4 + Static54.method1043(local63 & 0x7, local114.anInt2665, local71, local114.anInt2670, arg6, local57 & 0x7);
					@Pc(148) int local148 = Static171.method2651(local63 & 0x7, arg6, local114.anInt2665, local57 & 0x7, local71, local114.anInt2670) + arg8;
					if (local131 > 0 && local148 > 0 && local131 < 103 && local148 < 103) {
						@Pc(165) int local165 = arg3;
						if ((Static9.aByteArrayArrayArray7[1][local131][local148] & 0x2) == 2) {
							local165 = arg3 - 1;
						}
						@Pc(179) Class22 local179 = null;
						if (local165 >= 0) {
							local179 = arg1[local165];
						}
						Static96.method1642(arg3, Static158.aBoolean148, arg3, true, local131, local148, local75, local12, arg6 + local71 & 0x3, local179);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(III)V")
	public static void method1037(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static98.anInt2124 < 2 && Static150.anInt3074 == 0 && !Static142.aBoolean141) {
			return;
		}
		@Pc(53) Class83 local53;
		if (Static150.anInt3074 == 1 && Static98.anInt2124 < 2) {
			local53 = Static67.method1268(new Class83[] { Static206.aClass83_1171, Static162.aClass83_1135, Static99.aClass83_646, Static207.aClass83_1182 });
		} else if (Static142.aBoolean141 && Static98.anInt2124 < 2) {
			local53 = Static67.method1268(new Class83[] { Static171.aClass83_1013, Static162.aClass83_1135, Static163.aClass83_962, Static207.aClass83_1182 });
		} else {
			local53 = Static189.method2861(Static98.anInt2124 - 1);
		}
		if (Static98.anInt2124 > 2) {
			local53 = Static67.method1268(new Class83[] { local53, Static194.aClass83_1115, Static129.method2179(Static98.anInt2124 - 2), Static60.aClass83_640 });
		}
		@Pc(126) int local126 = Static62.aClass2_Sub2_Sub5_1.method1095(local53, arg0 + 4, arg1 + 15, Static12.aRandom1, Static80.anInt1787);
		Static124.method1906(Static62.aClass2_Sub2_Sub5_1.method1089(local53) + local126, 15, arg1, arg0 + 4);
	}

	@OriginalMember(owner = "client!fe", name = "e", descriptor = "(B)V")
	public static void method1039() {
		for (@Pc(7) int local7 = 0; local7 < Static177.anInt3619; local7++) {
			@Pc(13) int local13 = Static64.anIntArray130[local7];
			@Pc(17) Class24_Sub4_Sub2 local17 = Static47.aClass24_Sub4_Sub2Array1[local13];
			@Pc(21) int local21 = Static33.aClass2_Sub3_Sub1_1.method260();
			@Pc(29) int local29;
			@Pc(40) int local40;
			if ((local21 & 0x20) != 0) {
				local29 = Static33.aClass2_Sub3_Sub1_1.method269();
				if (local29 == 65535) {
					local29 = -1;
				}
				local40 = Static33.aClass2_Sub3_Sub1_1.method260();
				if (local29 == local17.anInt3336 && local29 != -1) {
					@Pc(116) Class2_Sub2_Sub16 local116 = Static213.method3229(local29);
					@Pc(119) int local119 = local116.anInt2334;
					if (local119 == 1) {
						local17.anInt3313 = 0;
						local17.anInt3297 = local40;
						local17.anInt3305 = 0;
						local17.anInt3326 = 0;
						Static200.method3029(false, local17.anInt3349, local17.anInt3313, local17.anInt3316, local116);
					}
					if (local119 == 2) {
						local17.anInt3326 = 0;
					}
				} else if (local29 == -1 || local17.anInt3336 == -1 || Static213.method3229(local29).anInt2355 >= Static213.method3229(local17.anInt3336).anInt2355) {
					local17.anInt3334 = local17.anInt3330;
					local17.anInt3313 = 0;
					local17.anInt3297 = local40;
					local17.anInt3305 = 0;
					local17.anInt3336 = local29;
					local17.anInt3326 = 0;
					if (local17.anInt3336 != -1) {
						Static200.method3029(false, local17.anInt3349, local17.anInt3313, local17.anInt3316, Static213.method3229(local17.anInt3336));
					}
				}
			}
			if ((local21 & 0x8) != 0) {
				local17.anInt3311 = Static33.aClass2_Sub3_Sub1_1.method254();
				local29 = Static33.aClass2_Sub3_Sub1_1.method257();
				local17.anInt3344 = 0;
				if (local17.anInt3311 == 65535) {
					local17.anInt3311 = -1;
				}
				local17.anInt3296 = local29 >> 16;
				local17.anInt3343 = 0;
				local17.anInt3353 = (local29 & 0xFFFF) + Static13.anInt386;
				if (local17.anInt3353 > Static13.anInt386) {
					local17.anInt3343 = -1;
				}
			}
			if ((local21 & 0x10) != 0) {
				local29 = Static33.aClass2_Sub3_Sub1_1.method260();
				local40 = Static33.aClass2_Sub3_Sub1_1.method240();
				local17.method2525(local29, Static13.anInt386, local40);
				local17.anInt3354 = Static13.anInt386 + 300;
				local17.anInt3352 = Static33.aClass2_Sub3_Sub1_1.method219();
			}
			if ((local21 & 0x40) != 0) {
				local17.anInt3306 = Static33.aClass2_Sub3_Sub1_1.method262();
				local17.anInt3320 = Static33.aClass2_Sub3_Sub1_1.method254();
			}
			if ((local21 & 0x2) != 0) {
				local17.anInt3299 = Static33.aClass2_Sub3_Sub1_1.method269();
				if (local17.anInt3299 == 65535) {
					local17.anInt3299 = -1;
				}
			}
			if ((local21 & 0x80) != 0) {
				local29 = Static33.aClass2_Sub3_Sub1_1.method260();
				local40 = Static33.aClass2_Sub3_Sub1_1.method240();
				local17.method2525(local29, Static13.anInt386, local40);
			}
			if ((local21 & 0x1) != 0) {
				local17.aClass2_Sub2_Sub24_1 = Static133.method2214(Static33.aClass2_Sub3_Sub1_1.method269());
				local17.anInt3324 = local17.aClass2_Sub2_Sub24_1.anInt3196;
				local17.anInt3345 = local17.aClass2_Sub2_Sub24_1.anInt3202;
				local17.anInt3332 = local17.aClass2_Sub2_Sub24_1.anInt3188;
				local17.anInt3289 = local17.aClass2_Sub2_Sub24_1.anInt3195;
				local17.anInt3290 = local17.aClass2_Sub2_Sub24_1.anInt3214;
				local17.anInt3328 = local17.aClass2_Sub2_Sub24_1.anInt3193;
				local17.anInt3292 = local17.aClass2_Sub2_Sub24_1.anInt3219;
				local17.anInt3327 = local17.aClass2_Sub2_Sub24_1.anInt3206;
				local17.anInt3350 = local17.aClass2_Sub2_Sub24_1.anInt3200;
			}
			if ((local21 & 0x4) != 0) {
				local17.aClass83_972 = Static33.aClass2_Sub3_Sub1_1.method259();
				local17.anInt3295 = 100;
			}
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIIIIIII)Z")
	public static boolean method1040(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
			return false;
		} else {
			@Pc(59) int local59 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
			@Pc(75) int local75 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
			@Pc(91) int local91 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
			return local59 * local91 > 0 && local91 * local75 > 0;
		}
	}
}
