import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static136 {

	@OriginalMember(owner = "client!ra", name = "n", descriptor = "Lclient!se;")
	public static Class2_Sub9_Sub3 aClass2_Sub9_Sub3_1;

	@OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
	public static int anInt3295 = 0;

	@OriginalMember(owner = "client!ra", name = "j", descriptor = "[Lclient!sg;")
	public static Class77[] aClass77Array20 = new Class77[500];

	@OriginalMember(owner = "client!ra", name = "p", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1187 = Static146.method2172(" more options");

	@OriginalMember(owner = "client!ra", name = "o", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1186 = aClass77_1187;

	@OriginalMember(owner = "client!ra", name = "q", descriptor = "I")
	public static int anInt3301 = 0;

	@OriginalMember(owner = "client!ra", name = "s", descriptor = "I")
	public static int anInt3303 = 0;

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "([Lclient!ug;I[IIZ[I)V")
	public static void method2284(@OriginalArg(0) Class84[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(18) int local18 = arg3 + 1;
		@Pc(24) int local24 = (arg1 + arg3) / 2;
		@Pc(28) int local28 = arg1 - 1;
		@Pc(32) Class84 local32 = arg0[local24];
		arg0[local24] = arg0[arg1];
		arg0[arg1] = local32;
		while (local28 < local18) {
			@Pc(45) boolean local45 = true;
			@Pc(48) int local48;
			@Pc(68) int local68;
			@Pc(83) int local83;
			do {
				local18--;
				for (local48 = 0; local48 < 4; local48++) {
					if (arg4[local48] == 2) {
						local68 = arg0[local18].anInt4018;
						local83 = local32.anInt4018;
					} else if (arg4[local48] == 1) {
						local68 = arg0[local18].anInt4015;
						if (local68 == -1 && arg2[local48] == 1) {
							local68 = 2001;
						}
						local83 = local32.anInt4015;
						if (local83 == -1 && arg2[local48] == 1) {
							local83 = 2001;
						}
					} else if (arg4[local48] == 3) {
						local68 = arg0[local18].aBoolean166 ? 1 : 0;
						local83 = local32.aBoolean166 ? 1 : 0;
					} else {
						local68 = arg0[local18].anInt4020;
						local83 = local32.anInt4020;
					}
					if (local83 != local68) {
						if ((arg2[local48] != 1 || local83 >= local68) && (arg2[local48] != 0 || local83 <= local68)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			local45 = true;
			do {
				local28++;
				for (local48 = 0; local48 < 4; local48++) {
					if (arg4[local48] == 2) {
						local68 = arg0[local28].anInt4018;
						local83 = local32.anInt4018;
					} else if (arg4[local48] == 1) {
						local68 = arg0[local28].anInt4015;
						if (local68 == -1 && arg2[local48] == 1) {
							local68 = 2001;
						}
						local83 = local32.anInt4015;
						if (local83 == -1 && arg2[local48] == 1) {
							local83 = 2001;
						}
					} else if (arg4[local48] == 3) {
						local68 = arg0[local28].aBoolean166 ? 1 : 0;
						local83 = local32.aBoolean166 ? 1 : 0;
					} else {
						local68 = arg0[local28].anInt4020;
						local83 = local32.anInt4020;
					}
					if (local83 != local68) {
						if ((arg2[local48] != 1 || local68 >= local83) && (arg2[local48] != 0 || local68 <= local83)) {
							local45 = false;
						}
						break;
					}
					if (local48 == 3) {
						local45 = false;
					}
				}
			} while (local45);
			if (local18 > local28) {
				@Pc(318) Class84 local318 = arg0[local28];
				arg0[local28] = arg0[local18];
				arg0[local18] = local318;
			}
		}
		method2284(arg0, arg1, arg2, local18, arg4);
		method2284(arg0, local18 + 1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
	public static void method2285() {
		Static124.aClass2_Sub18_Sub1_3.method2398(51);
		for (@Pc(23) Class2_Sub10 local23 = (Class2_Sub10) Static177.aClass74_12.method2430(); local23 != null; local23 = (Class2_Sub10) Static177.aClass74_12.method2435()) {
			if (local23.anInt1899 == 0) {
				Static14.method325(true, local23);
			}
		}
		if (Static49.aClass66_6 != null) {
			Static57.method2994(Static49.aClass66_6);
			Static49.aClass66_6 = null;
		}
	}

	@OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)V")
	public static void method2286() {
		aClass77_1186 = null;
		aClass2_Sub9_Sub3_1 = null;
		aClass77_1187 = null;
		aClass77Array20 = null;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(IILclient!vg;II)V")
	public static void method2287(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2_Sub1_Sub6_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 == Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11 || Static18.anInt618 >= 400) {
			return;
		}
		@Pc(52) Class77 local52;
		if (arg1.anInt4330 == 0) {
			local52 = Static146.method2168(new Class77[] { arg1.aClass77_1482, Static112.method1994(Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4342, arg1.anInt4342), Static98.aClass77_963, Static98.aClass77_965, Static2.method61(arg1.anInt4342), Static122.aClass77_221 });
		} else {
			local52 = Static146.method2168(new Class77[] { arg1.aClass77_1482, Static98.aClass77_963, Static18.aClass77_270, Static2.method61(arg1.anInt4330), Static122.aClass77_221 });
		}
		@Pc(150) int local150;
		if (Static124.anInt3041 == 1) {
			Static147.method2486(Static146.method2168(new Class77[] { Static15.aClass77_233, Static86.aClass77_881, local52 }), arg0, arg2, Static64.aClass77_714, 8, arg3);
		} else if (!Static16.aBoolean25) {
			for (local150 = 7; local150 >= 0; local150--) {
				if (Static38.aClass77Array8[local150] != null) {
					@Pc(163) short local163 = 0;
					if (Static38.aClass77Array8[local150].method2508(Static98.aClass77_957)) {
						if (arg1.anInt4342 > Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4342) {
							local163 = 2000;
						}
						if (Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4327 != 0 && arg1.anInt4327 != 0) {
							if (arg1.anInt4327 == Static4.aClass2_Sub2_Sub1_Sub6_Sub1_11.anInt4327) {
								local163 = 2000;
							} else {
								local163 = 0;
							}
						}
					} else if (Static26.aBooleanArray1[local150]) {
						local163 = 2000;
					}
					@Pc(222) int local222 = local163 + Static77.anIntArray340[local150];
					Static147.method2486(Static146.method2168(new Class77[] { Static145.aClass77_1255, local52 }), arg0, arg2, Static38.aClass77Array8[local150], local222, arg3);
				}
			}
		} else if ((Static11.anInt307 & 0x8) == 8) {
			Static147.method2486(Static146.method2168(new Class77[] { Static19.aClass77_275, Static86.aClass77_881, local52 }), arg0, arg2, Static120.aClass77_405, 20, arg3);
		}
		for (local150 = 0; local150 < Static18.anInt618; local150++) {
			if (Static131.anIntArray616[local150] == 40) {
				aClass77Array20[local150] = Static146.method2168(new Class77[] { Static145.aClass77_1255, local52 });
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(BI)Lclient!ib;")
	public static Class2_Sub2_Sub10 method2288(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub2_Sub10 local11 = (Class2_Sub2_Sub10) Static180.aClass82_65.method2699((long) arg0);
		if (local11 != null) {
			return local11;
		}
		@Pc(25) byte[] local25 = Static79.aClass43_21.method2205(arg0, 14);
		local11 = new Class2_Sub2_Sub10();
		if (local25 != null) {
			local11.method1328(new Class2_Sub18(local25));
		}
		Static180.aClass82_65.method2701((long) arg0, local11);
		return local11;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II[Lclient!sg;I)Lclient!sg;")
	public static Class77 method2289(@OriginalArg(1) int arg0, @OriginalArg(2) Class77[] arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		for (@Pc(7) int local7 = 0; local7 < arg2; local7++) {
			if (arg1[arg0 + local7] == null) {
				arg1[arg0 + local7] = Static94.aClass77_925;
			}
			local5 += arg1[local7 + arg0].anInt3606;
		}
		@Pc(41) byte[] local41 = new byte[local5];
		@Pc(43) int local43 = 0;
		@Pc(52) Class77 local52;
		for (@Pc(45) int local45 = 0; local45 < arg2; local45++) {
			local52 = arg1[local45 + arg0];
			Static186.method1561(local52.aByteArray46, 0, local41, local43, local52.anInt3606);
			local43 += local52.anInt3606;
		}
		local52 = new Class77();
		local52.aByteArray46 = local41;
		local52.anInt3606 = local5;
		return local52;
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)[Lclient!gd;")
	public static Class2_Sub2_Sub3_Sub3[] method2290() {
		@Pc(11) Class2_Sub2_Sub3_Sub3[] local11 = new Class2_Sub2_Sub3_Sub3[Static124.anInt3039];
		for (@Pc(13) int local13 = 0; local13 < Static124.anInt3039; local13++) {
			@Pc(18) Class2_Sub2_Sub3_Sub3 local18 = new Class2_Sub2_Sub3_Sub3();
			local18.anInt1450 = Static15.anInt483;
			local18.anInt1452 = Static138.anInt3346;
			local18.anInt1448 = Static160.anIntArray642[local13];
			local18.anInt1453 = Static37.anIntArray175[local13];
			local18.anInt1451 = Static178.anIntArray637[local13];
			local18.anInt1449 = Static2.anIntArray15[local13];
			local18.anIntArray229 = Static173.anIntArray623;
			local18.aByteArray24 = Static170.aByteArrayArray10[local13];
			local11[local13] = local18;
		}
		Static59.method1102();
		return local11;
	}
}
