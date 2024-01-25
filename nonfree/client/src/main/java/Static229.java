import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
	public static int anInt4581;

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "[I")
	public static int[] anIntArray350;

	@OriginalMember(owner = "client!ol", name = "e", descriptor = "[[S")
	public static short[][] aShortArrayArray12;

	@OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
	public static int anInt4584 = 0;

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[[[B")
	public static byte[][][] method4046(@OriginalArg(1) int arg0) {
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
		@Pc(65) int local65;
		for (local26 = arg0 - 1; local26 >= 0; local26--) {
			for (local65 = 0; local65 < arg0; local65++) {
				if (local65 <= local26) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(105) int local105;
		for (local65 = 0; local65 < arg0; local65++) {
			for (local105 = 0; local105 < arg0; local105++) {
				if (local105 >= local65) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(152) int local152;
		for (local105 = arg0 - 1; local105 >= 0; local105--) {
			for (local152 = 0; local152 < arg0; local152++) {
				if (local105 <= local152) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[0][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(197) int local197;
		for (local152 = arg0 - 1; local152 >= 0; local152--) {
			for (local197 = 0; local197 < arg0; local197++) {
				if (local197 <= local152 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(242) int local242;
		for (local197 = 0; local197 < arg0; local197++) {
			for (local242 = 0; local242 < arg0; local242++) {
				if (local20 >= 0 && local20 < local18.length) {
					if (local197 << 1 <= local242) {
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
		@Pc(300) int local300;
		for (local242 = 0; local242 < arg0; local242++) {
			for (local300 = arg0 - 1; local300 >= 0; local300--) {
				if (local242 >> 1 >= local300) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(349) int local349;
		for (local300 = arg0 - 1; local300 >= 0; local300--) {
			for (local349 = arg0 - 1; local349 >= 0; local349--) {
				if (local300 << 1 <= local349) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[1][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(397) int local397;
		for (local349 = arg0 - 1; local349 >= 0; local349--) {
			for (local397 = arg0 - 1; local397 >= 0; local397--) {
				if (local349 >> 1 >= local397) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(439) int local439;
		for (local397 = arg0 - 1; local397 >= 0; local397--) {
			for (local439 = 0; local439 < arg0; local439++) {
				if (local397 << 1 <= local439) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[2][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(484) int local484;
		for (local439 = 0; local439 < arg0; local439++) {
			for (local484 = 0; local484 < arg0; local484++) {
				if (local484 <= local439 >> 1) {
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
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
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(615) int local615;
		for (local573 = 0; local573 < arg0; local573++) {
			for (local615 = 0; local615 < arg0; local615++) {
				if (local573 << 1 >= local615) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(664) int local664;
		for (local615 = 0; local615 < arg0; local615++) {
			for (local664 = arg0 - 1; local664 >= 0; local664--) {
				if (local615 >> 1 <= local664) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(709) int local709;
		for (local664 = arg0 - 1; local664 >= 0; local664--) {
			for (local709 = arg0 - 1; local709 >= 0; local709--) {
				if (local709 <= local664 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[3][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(757) int local757;
		for (local709 = arg0 - 1; local709 >= 0; local709--) {
			for (local757 = arg0 - 1; local757 >= 0; local757--) {
				if (local757 >= local709 >> 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][0] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(796) int local796;
		for (local757 = arg0 - 1; local757 >= 0; local757--) {
			for (local796 = 0; local796 < arg0; local796++) {
				if (local796 <= local757 << 1) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(837) int local837;
		for (local796 = 0; local796 < arg0; local796++) {
			for (local837 = 0; local837 < arg0; local837++) {
				if (local796 >> 1 <= local837) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(882) int local882;
		for (local837 = 0; local837 < arg0; local837++) {
			for (local882 = arg0 - 1; local882 >= 0; local882--) {
				if (local837 << 1 >= local882) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[4][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(931) int local931;
		for (local882 = 0; local882 < arg0; local882++) {
			for (local931 = 0; local931 < arg0; local931++) {
				if (arg0 / 2 >= local931) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(978) int local978;
		for (local931 = 0; local931 < arg0; local931++) {
			for (local978 = 0; local978 < arg0; local978++) {
				if (arg0 / 2 >= local931) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][1] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1017) int local1017;
		for (local978 = 0; local978 < arg0; local978++) {
			for (local1017 = 0; local1017 < arg0; local1017++) {
				if (local1017 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][2] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1064) int local1064;
		for (local1017 = 0; local1017 < arg0; local1017++) {
			for (local1064 = 0; local1064 < arg0; local1064++) {
				if (local1017 >= arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[5][3] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1111) int local1111;
		for (local1064 = 0; local1064 < arg0; local1064++) {
			for (local1111 = 0; local1111 < arg0; local1111++) {
				if (local1064 - arg0 / 2 >= local1111) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1162) int local1162;
		for (local1111 = arg0 - 1; local1111 >= 0; local1111--) {
			for (local1162 = 0; local1162 < arg0; local1162++) {
				if (local1111 - arg0 / 2 >= local1162) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1209) int local1209;
		for (local1162 = arg0 - 1; local1162 >= 0; local1162--) {
			for (local1209 = arg0 - 1; local1209 >= 0; local1209--) {
				if (local1162 - arg0 / 2 >= local1209) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1251) int local1251;
		for (local1209 = 0; local1209 < arg0; local1209++) {
			for (local1251 = arg0 - 1; local1251 >= 0; local1251--) {
				if (local1251 <= local1209 - arg0 / 2) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[6][3] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1295) int local1295;
		for (local1251 = 0; local1251 < arg0; local1251++) {
			for (local1295 = 0; local1295 < arg0; local1295++) {
				if (local1251 - arg0 / 2 <= local1295) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][0] = local18;
		local20 = 0;
		local18 = new byte[arg0 * arg0];
		@Pc(1339) int local1339;
		for (local1295 = arg0 - 1; local1295 >= 0; local1295--) {
			for (local1339 = 0; local1339 < arg0; local1339++) {
				if (local1295 - arg0 / 2 <= local1339) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][1] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		@Pc(1388) int local1388;
		for (local1339 = arg0 - 1; local1339 >= 0; local1339--) {
			for (local1388 = arg0 - 1; local1388 >= 0; local1388--) {
				if (local1339 - arg0 / 2 <= local1388) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][2] = local18;
		local18 = new byte[arg0 * arg0];
		local20 = 0;
		for (local1388 = 0; local1388 < arg0; local1388++) {
			for (@Pc(1437) int local1437 = arg0 - 1; local1437 >= 0; local1437--) {
				if (local1388 - arg0 / 2 <= local1437) {
					local18[local20] = -1;
				}
				local20++;
			}
		}
		local9[7][3] = local18;
		return local9;
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIIIIII)V")
	public static void method4048(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static223.method3985(arg2);
		@Pc(14) int local14 = 0;
		@Pc(19) int local19 = arg2 - arg5;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(25) int local25 = arg2;
		@Pc(28) int local28 = -arg2;
		@Pc(30) int local30 = local19;
		@Pc(33) int local33 = -local19;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(64) int local64;
		@Pc(72) int local72;
		@Pc(81) int local81;
		@Pc(90) int local90;
		if (Static240.anInt4829 <= arg1 && arg1 <= Static166.anInt3315) {
			@Pc(55) int[] local55 = Static73.anIntArrayArray6[arg1];
			local64 = Static61.method917(Static280.anInt212, arg0 - arg2, Static346.anInt6607);
			local72 = Static61.method917(Static280.anInt212, arg2 + arg0, Static346.anInt6607);
			local81 = Static61.method917(Static280.anInt212, arg0 - local19, Static346.anInt6607);
			local90 = Static61.method917(Static280.anInt212, arg0 + local19, Static346.anInt6607);
			Static224.method5303(local55, local81, arg3, local64);
			Static224.method5303(local55, local90, arg4, local81);
			Static224.method5303(local55, local72, arg3, local90);
		}
		while (local25 > local14) {
			local35 += 2;
			local37 += 2;
			local28 += local35;
			local33 += local37;
			if (local33 >= 0 && local30 >= 1) {
				local30--;
				local33 -= local30 << 1;
				Static164.anIntArray206[local30] = local14;
			}
			local14++;
			@Pc(203) int local203;
			@Pc(212) int local212;
			@Pc(223) int[] local223;
			@Pc(156) int local156;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				local156 = arg1 - local25;
				local64 = local25 + arg1;
				if (local64 >= Static240.anInt4829 && Static166.anInt3315 >= local156) {
					if (local19 > local25) {
						local72 = Static164.anIntArray206[local25];
						local81 = Static61.method917(Static280.anInt212, arg0 + local14, Static346.anInt6607);
						local90 = Static61.method917(Static280.anInt212, arg0 - local14, Static346.anInt6607);
						local203 = Static61.method917(Static280.anInt212, local72 + arg0, Static346.anInt6607);
						local212 = Static61.method917(Static280.anInt212, arg0 - local72, Static346.anInt6607);
						if (Static166.anInt3315 >= local64) {
							local223 = Static73.anIntArrayArray6[local64];
							Static224.method5303(local223, local212, arg3, local90);
							Static224.method5303(local223, local203, arg4, local212);
							Static224.method5303(local223, local81, arg3, local203);
						}
						if (local156 >= Static240.anInt4829) {
							local223 = Static73.anIntArrayArray6[local156];
							Static224.method5303(local223, local212, arg3, local90);
							Static224.method5303(local223, local203, arg4, local212);
							Static224.method5303(local223, local81, arg3, local203);
						}
					} else {
						local72 = Static61.method917(Static280.anInt212, arg0 + local14, Static346.anInt6607);
						local81 = Static61.method917(Static280.anInt212, arg0 - local14, Static346.anInt6607);
						if (Static166.anInt3315 >= local64) {
							Static224.method5303(Static73.anIntArrayArray6[local64], local72, arg3, local81);
						}
						if (local156 >= Static240.anInt4829) {
							Static224.method5303(Static73.anIntArrayArray6[local156], local72, arg3, local81);
						}
					}
				}
			}
			local156 = arg1 - local14;
			local64 = local14 + arg1;
			if (local64 >= Static240.anInt4829 && local156 <= Static166.anInt3315) {
				local72 = local25 + arg0;
				local81 = arg0 - local25;
				if (local72 >= Static280.anInt212 && local81 <= Static346.anInt6607) {
					local72 = Static61.method917(Static280.anInt212, local72, Static346.anInt6607);
					local81 = Static61.method917(Static280.anInt212, local81, Static346.anInt6607);
					if (local19 <= local14) {
						if (local64 <= Static166.anInt3315) {
							Static224.method5303(Static73.anIntArrayArray6[local64], local72, arg3, local81);
						}
						if (local156 >= Static240.anInt4829) {
							Static224.method5303(Static73.anIntArrayArray6[local156], local72, arg3, local81);
						}
					} else {
						local90 = local30 < local14 ? Static164.anIntArray206[local14] : local30;
						local203 = Static61.method917(Static280.anInt212, arg0 + local90, Static346.anInt6607);
						local212 = Static61.method917(Static280.anInt212, arg0 - local90, Static346.anInt6607);
						if (local64 <= Static166.anInt3315) {
							local223 = Static73.anIntArrayArray6[local64];
							Static224.method5303(local223, local212, arg3, local81);
							Static224.method5303(local223, local203, arg4, local212);
							Static224.method5303(local223, local72, arg3, local203);
						}
						if (Static240.anInt4829 <= local156) {
							local223 = Static73.anIntArrayArray6[local156];
							Static224.method5303(local223, local212, arg3, local81);
							Static224.method5303(local223, local203, arg4, local212);
							Static224.method5303(local223, local72, arg3, local203);
						}
					}
				}
			}
		}
	}
}
