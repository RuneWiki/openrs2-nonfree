import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public static int anInt555;

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "[I")
	public static int[] anIntArray62 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lclient!lj;ILclient!si;IIII)V")
	public static void method519(@OriginalArg(0) Class1_Sub5_Sub6 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class157 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 == null) {
			return;
		}
		@Pc(22) int local22 = Static69.anInt1492 + (int) Static148.aFloat64 & 0x7FF;
		@Pc(34) int local34 = Math.max(arg2.anInt4680 / 2, arg2.anInt4689 / 2) + 10;
		@Pc(43) int local43 = arg5 * arg5 + arg3 * arg3;
		if (local34 * local34 < local43) {
			return;
		}
		@Pc(57) int local57 = Class87.anIntArray177[local22];
		@Pc(61) int local61 = Class87.anIntArray173[local22];
		@Pc(69) int local69 = local57 * 256 / (Static289.anInt5250 + 256);
		@Pc(77) int local77 = local61 * 256 / (Static289.anInt5250 + 256);
		@Pc(87) int local87 = arg3 * local69 - local77 * arg5 >> 16;
		@Pc(97) int local97 = arg5 * local69 + local77 * arg3 >> 16;
		if (Static71.aBoolean165) {
			((Class1_Sub5_Sub6_Sub2) arg0).method3208(local97 + arg4 + arg2.anInt4680 / 2 - arg0.anInt3620 / 2, -(arg0.anInt3626 / 2) + -local87 + arg1 - -(arg2.anInt4689 / 2), (Class1_Sub5_Sub6_Sub2) arg2.method3973(false));
		} else {
			((Class1_Sub5_Sub6_Sub1) arg0).method1282(local97 + arg2.anInt4680 / 2 + arg4 - arg0.anInt3620 / 2, arg1 + arg2.anInt4689 / 2 + (-local87 - arg0.anInt3626 / 2), arg2.anIntArray533, arg2.anIntArray539);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IIIIII)V")
	public static void method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg4 - arg0;
		@Pc(15) int local15 = arg2 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static128.method2261(arg1, arg0, arg3, arg4);
			}
		} else if (local10 == 0) {
			Static314.method4673(arg0, arg2, arg3, arg1);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(69) boolean local69 = local10 > local15;
			@Pc(77) int local77;
			@Pc(73) int local73;
			if (local69) {
				local73 = arg2;
				arg2 = arg4;
				local77 = arg3;
				arg3 = arg0;
				arg0 = local77;
				arg4 = local73;
			}
			if (arg3 > arg2) {
				local77 = arg3;
				arg3 = arg2;
				arg2 = local77;
				local73 = arg0;
				arg0 = arg4;
				arg4 = local73;
			}
			local77 = arg0;
			local73 = arg2 - arg3;
			@Pc(109) int local109 = arg4 - arg0;
			if (local109 < 0) {
				local109 = -local109;
			}
			@Pc(122) int local122 = arg4 <= arg0 ? -1 : 1;
			@Pc(127) int local127 = -(local73 >> 1);
			@Pc(131) int local131;
			if (local69) {
				for (local131 = arg3; local131 <= arg2; local131++) {
					local127 += local109;
					Static40.anIntArrayArray6[local131][local77] = arg1;
					if (local127 > 0) {
						local127 -= local73;
						local77 += local122;
					}
				}
			} else {
				for (local131 = arg3; local131 <= arg2; local131++) {
					local127 += local109;
					Static40.anIntArrayArray6[local77][local131] = arg1;
					if (local127 > 0) {
						local127 -= local73;
						local77 += local122;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)V")
	public static void method521() {
		while (true) {
			@Pc(14) Class1_Sub9 local14 = (Class1_Sub9) Static171.aClass96_16.method2339();
			if (local14 == null) {
				return;
			}
			@Pc(37) Class11_Sub4 local37;
			@Pc(30) int local30;
			if (local14.anInt1226 < 0) {
				local30 = -local14.anInt1226 - 1;
				if (Static68.anInt1471 == local30) {
					local37 = Static138.aClass11_Sub4_Sub1_3;
				} else {
					local37 = Static14.aClass11_Sub4_Sub1Array1[local30];
				}
			} else {
				local30 = local14.anInt1226 - 1;
				local37 = Static138.aClass11_Sub4_Sub2Array2[local30];
			}
			if (local37 != null) {
				@Pc(60) Class150 local60 = Static160.method2744(local14.anInt1221);
				if (Static132.anInt2608 >= 3) {
				}
				@Pc(74) int local74;
				@Pc(77) int local77;
				if (local14.anInt1222 == 1 || local14.anInt1222 == 3) {
					local74 = local60.anInt4562;
					local77 = local60.anInt4532;
				} else {
					local77 = local60.anInt4562;
					local74 = local60.anInt4532;
				}
				@Pc(92) int local92 = (local74 >> 1) + local14.anInt1228;
				@Pc(102) int local102 = local14.anInt1228 + (local74 + 1 >> 1);
				@Pc(110) int local110 = local14.anInt1230 + (local77 >> 1);
				@Pc(114) int[][] local114 = Static280.anIntArrayArrayArray13[Static132.anInt2608];
				@Pc(123) int local123 = local14.anInt1230 + (local77 + 1 >> 1);
				@Pc(149) int local149 = local114[local102][local123] + local114[local92][local123] + local114[local102][local110] + local114[local92][local110] >> 2;
				@Pc(151) Class11 local151 = null;
				@Pc(156) int local156 = Static81.anIntArray138[local14.anInt1219];
				if (local156 == 0) {
					@Pc(218) Class39 local218 = Static22.method447(Static132.anInt2608, local14.anInt1228, local14.anInt1230);
					if (local218 != null) {
						local151 = local218.aClass11_4;
					}
				} else if (local156 == 1) {
					@Pc(204) Class18 local204 = Static269.method4148(Static132.anInt2608, local14.anInt1228, local14.anInt1230);
					if (local204 != null) {
						local151 = local204.aClass11_1;
					}
				} else if (local156 == 2) {
					@Pc(172) Class45 local172 = Static235.method3788(Static132.anInt2608, local14.anInt1228, local14.anInt1230);
					if (local172 != null) {
						local151 = local172.aClass11_5;
					}
				} else if (local156 == 3) {
					@Pc(190) Class124 local190 = Static38.method659(Static132.anInt2608, local14.anInt1228, local14.anInt1230);
					if (local190 != null) {
						local151 = local190.aClass11_10;
					}
				}
				if (local151 != null) {
					Static222.method3590(local14.anInt1230, 0, 0, -1, local14.anInt1229 + 1, local156, local14.anInt1231 + 1, local14.anInt1228, Static132.anInt2608);
					local37.anInt3866 = local149;
					local37.anInt3815 = local74 * 64 + local14.anInt1228 * 128;
					local37.anInt3796 = local77 * 64 + local14.anInt1230 * 128;
					@Pc(272) int local272 = local14.anInt1232;
					local37.anObject5 = local151;
					local37.anInt3785 = Static167.anInt637 + local14.anInt1231;
					local37.anInt3841 = Static167.anInt637 + local14.anInt1229;
					@Pc(290) int local290 = local14.anInt1233;
					@Pc(293) int local293 = local14.anInt1225;
					@Pc(302) int local302;
					if (local290 < local272) {
						local302 = local272;
						local272 = local290;
						local290 = local302;
					}
					local37.anInt3823 = local14.anInt1228 + local272;
					@Pc(316) int local316 = local14.anInt1223;
					if (local316 < local293) {
						local302 = local293;
						local293 = local316;
						local316 = local302;
					}
					local37.anInt3862 = local14.anInt1228 + local290;
					local37.anInt3845 = local14.anInt1230 + local316;
					local37.anInt3811 = local14.anInt1230 + local293;
				}
			}
		}
	}
}
