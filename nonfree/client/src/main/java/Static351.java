import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "[[I")
	public static int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "[Lclient!ac;")
	public static final Class1_Sub3[] aClass1_Sub3Array1 = new Class1_Sub3[2048];

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!ls;)I")
	public static int method5243(@OriginalArg(1) Class11_Sub1_Sub1_Sub3 arg0) {
		if (arg0.anInt7565 == 0) {
			return 0;
		}
		@Pc(61) int local61;
		@Pc(54) int local54;
		if (arg0.anInt7528 != -1) {
			@Pc(14) Class11_Sub1_Sub1_Sub3 local14 = null;
			if (arg0.anInt7528 < 32768) {
				@Pc(26) Class1_Sub33 local26 = (Class1_Sub33) Static372.aClass91_30.method2271((long) arg0.anInt7528);
				if (local26 != null) {
					local14 = local26.aClass11_Sub1_Sub1_Sub3_Sub2_2;
				}
			} else if (arg0.anInt7528 >= 32768) {
				local14 = Static99.aClass11_Sub1_Sub1_Sub3_Sub1Array1[arg0.anInt7528 - 32768];
			}
			if (local14 != null) {
				local54 = arg0.anInt8902 - local14.anInt8902;
				local61 = arg0.anInt8906 - local14.anInt8906;
				if (local54 != 0 || local61 != 0) {
					arg0.method6065((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
			}
		}
		if (arg0 instanceof Class11_Sub1_Sub1_Sub3_Sub1) {
			@Pc(90) Class11_Sub1_Sub1_Sub3_Sub1 local90 = (Class11_Sub1_Sub1_Sub3_Sub1) arg0;
			if (local90.anInt3594 != -1 && (local90.anInt7604 == 0 || local90.anInt7605 > 0)) {
				local90.method6065(local90.anInt3594);
				local90.anInt3594 = -1;
			}
		} else if (arg0 instanceof Class11_Sub1_Sub1_Sub3_Sub2) {
			@Pc(123) Class11_Sub1_Sub1_Sub3_Sub2 local123 = (Class11_Sub1_Sub1_Sub3_Sub2) arg0;
			if (local123.anInt7611 != -1 && (local123.anInt7604 == 0 || local123.anInt7605 > 0)) {
				local54 = local123.anInt8902 - (local123.anInt7611 - Static539.anInt9045 - Static539.anInt9045) * 256;
				local61 = local123.anInt8906 - (local123.anInt7619 - Static311.anInt5708 - Static311.anInt5708) * 256;
				if (local54 != 0 || local61 != 0) {
					local123.method6065((int) (Math.atan2((double) local54, (double) local61) * 2607.5945876176133D) & 0x3FFF);
				}
				local123.anInt7611 = -1;
			}
		}
		return arg0.method6064();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z")
	public static boolean method5244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BI)[[[B")
	public static byte[][][] method5245(@OriginalArg(1) int arg0) {
		@Pc(9) byte[][][] local9 = new byte[8][4][];
		@Pc(18) byte[] local18 = new byte[arg0 * arg0];
		@Pc(20) int local20 = 0;
		@Pc(26) int local26;
		for (@Pc(22) int local22 = 0; local22 < arg0; local22++) {
			for (local26 = 0; local26 < arg0; local26++) {
				if (local26 <= local22) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(73) int local73;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local73 = 0; local73 < arg0; local73++) {
				if (local73 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(116) int local116;
		for (local73 = 0; local73 < arg0; local73++) {
			for (local116 = 0; local116 < arg0; local116++) {
				if (local73 <= local116) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(159) int local159;
		for (local116 = arg0 - 1; local116 >= 0; local116--) {
			for (local159 = 0; local159 < arg0; local159++) {
				if (local159 >= local116) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(204) int local204;
		for (local159 = arg0 - 1; local159 >= 0; local159--) {
			for (local204 = 0; local204 < arg0; local204++) {
				if (local204 <= local159 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(249) int local249;
		for (local204 = 0; local204 < arg0; local204++) {
			for (local249 = 0; local249 < arg0; local249++) {
				if (local20 >= 0 && local18.length > local20) {
					if (local249 >= local204 << 1) {
						local18[local20] = -1;
					}
					local20++;
				} else {
					local20++;
				}
			}
		}
		local9[1][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(307) int local307;
		for (local249 = 0; local249 < arg0; local249++) {
			for (local307 = arg0 - 1; local307 >= 0; local307--) {
				if (local249 >> 1 >= local307) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(352) int local352;
		for (local307 = arg0 - 1; local307 >= 0; local307--) {
			for (local352 = arg0 - 1; local352 >= 0; local352--) {
				if (local307 << 1 <= local352) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(399) int local399;
		for (local352 = arg0 - 1; local352 >= 0; local352--) {
			for (local399 = arg0 - 1; local399 >= 0; local399--) {
				if (local352 >> 1 >= local399) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(442) int local442;
		for (local399 = arg0 - 1; local399 >= 0; local399--) {
			for (local442 = 0; local442 < arg0; local442++) {
				if (local399 << 1 <= local442) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(484) int local484;
		for (local442 = 0; local442 < arg0; local442++) {
			for (local484 = 0; local484 < arg0; local484++) {
				if (local484 <= local442 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(533) int local533;
		for (local484 = 0; local484 < arg0; local484++) {
			for (local533 = arg0 - 1; local533 >= 0; local533--) {
				if (local533 >= local484 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(573) int local573;
		for (local533 = arg0 - 1; local533 >= 0; local533--) {
			for (local573 = 0; local573 < arg0; local573++) {
				if (local533 >> 1 <= local573) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(615) int local615;
		for (local573 = 0; local573 < arg0; local573++) {
			for (local615 = 0; local615 < arg0; local615++) {
				if (local615 <= local573 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(664) int local664;
		for (local615 = 0; local615 < arg0; local615++) {
			for (local664 = arg0 - 1; local664 >= 0; local664--) {
				if (local664 >= local615 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(717) int local717;
		for (local664 = arg0 - 1; local664 >= 0; local664--) {
			for (local717 = arg0 - 1; local717 >= 0; local717--) {
				if (local717 <= local664 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(765) int local765;
		for (local717 = arg0 - 1; local717 >= 0; local717--) {
			for (local765 = arg0 - 1; local765 >= 0; local765--) {
				if (local717 >> 1 <= local765) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(808) int local808;
		for (local765 = arg0 - 1; local765 >= 0; local765--) {
			for (local808 = 0; local808 < arg0; local808++) {
				if (local808 <= local765 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(849) int local849;
		for (local808 = 0; local808 < arg0; local808++) {
			for (local849 = 0; local849 < arg0; local849++) {
				if (local808 >> 1 <= local849) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(898) int local898;
		for (local849 = 0; local849 < arg0; local849++) {
			for (local898 = arg0 - 1; local898 >= 0; local898--) {
				if (local898 <= local849 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(943) int local943;
		for (local898 = 0; local898 < arg0; local898++) {
			for (local943 = 0; local943 < arg0; local943++) {
				if (local943 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(990) int local990;
		for (local943 = 0; local943 < arg0; local943++) {
			for (local990 = 0; local990 < arg0; local990++) {
				if (local943 <= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1033) int local1033;
		for (local990 = 0; local990 < arg0; local990++) {
			for (local1033 = 0; local1033 < arg0; local1033++) {
				if (arg0 / 2 <= local1033) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1080) int local1080;
		for (local1033 = 0; local1033 < arg0; local1033++) {
			for (local1080 = 0; local1080 < arg0; local1080++) {
				if (arg0 / 2 <= local1033) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1127) int local1127;
		for (local1080 = 0; local1080 < arg0; local1080++) {
			for (local1127 = 0; local1127 < arg0; local1127++) {
				if (local1080 - arg0 / 2 >= local1127) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1171) int local1171;
		for (local1127 = arg0 - 1; local1127 >= 0; local1127--) {
			for (local1171 = 0; local1171 < arg0; local1171++) {
				if (local1127 - arg0 / 2 >= local1171) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1220) int local1220;
		for (local1171 = arg0 - 1; local1171 >= 0; local1171--) {
			for (local1220 = arg0 - 1; local1220 >= 0; local1220--) {
				if (local1171 - arg0 / 2 >= local1220) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1262) int local1262;
		for (local1220 = 0; local1220 < arg0; local1220++) {
			for (local1262 = arg0 - 1; local1262 >= 0; local1262--) {
				if (local1220 - arg0 / 2 >= local1262) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1310) int local1310;
		for (local1262 = 0; local1262 < arg0; local1262++) {
			for (local1310 = 0; local1310 < arg0; local1310++) {
				if (local1310 >= local1262 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1362) int local1362;
		for (local1310 = arg0 - 1; local1310 >= 0; local1310--) {
			for (local1362 = 0; local1362 < arg0; local1362++) {
				if (local1362 >= local1310 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1418) int local1418;
		for (local1362 = arg0 - 1; local1362 >= 0; local1362--) {
			for (local1418 = arg0 - 1; local1418 >= 0; local1418--) {
				if (local1362 - arg0 / 2 <= local1418) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		for (local1418 = 0; local1418 < arg0; local1418++) {
			for (@Pc(1475) int local1475 = arg0 - 1; local1475 >= 0; local1475--) {
				if (local1475 >= local1418 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public static void method5247() {
		@Pc(14) byte[] local14;
		if (Static398.anObject17 == null) {
			@Pc(5) Class6_Sub2_Sub2 local5 = new Class6_Sub2_Sub2();
			local14 = local5.method6644();
			Static398.anObject17 = Static161.method2652(local14);
		}
		if (Static465.anObject21 == null) {
			@Pc(34) Class6_Sub1_Sub1 local34 = new Class6_Sub1_Sub1();
			local14 = local34.method749();
			Static465.anObject21 = Static161.method2652(local14);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
	public static String method5248(@OriginalArg(0) String arg0) {
		@Pc(14) String local14 = Static387.method5586(Static309.method4632(arg0));
		if (local14 == null) {
			local14 = "";
		}
		return local14;
	}
}
