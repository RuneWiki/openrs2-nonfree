import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!te", name = "G", descriptor = "I")
	public static int anInt6325;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIZIII)V")
	public static void method4926(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static124.method879(arg5);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg5 - arg0;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg5;
		@Pc(24) int local24 = -arg5;
		@Pc(26) int local26 = local15;
		@Pc(29) int local29 = -local15;
		@Pc(31) int local31 = -1;
		@Pc(38) int local38 = -1;
		@Pc(42) int[] local42 = Static229.anIntArrayArray26[arg4];
		@Pc(47) int local47 = arg2 - local15;
		Static216.method2862(arg2 - arg5, local47, arg1, local42);
		@Pc(60) int local60 = local15 + arg2;
		Static216.method2862(local47, local60, arg3, local42);
		Static216.method2862(local60, arg2 + arg5, arg1, local42);
		while (local10 < local21) {
			local31 += 2;
			local38 += 2;
			local24 += local31;
			local29 += local38;
			if (local29 >= 0 && local26 >= 1) {
				Static241.anIntArray335[local26] = local10;
				local26--;
				local29 -= local26 << 1;
			}
			local10++;
			@Pc(125) int[] local125;
			@Pc(132) int[] local132;
			@Pc(136) int local136;
			@Pc(141) int local141;
			@Pc(181) int local181;
			@Pc(185) int local185;
			@Pc(190) int local190;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local21 >= local15) {
					local125 = Static229.anIntArrayArray26[arg4 + local21];
					local132 = Static229.anIntArrayArray26[arg4 - local21];
					local136 = local10 + arg2;
					local141 = arg2 - local10;
					Static216.method2862(local141, local136, arg1, local125);
					Static216.method2862(local141, local136, arg1, local132);
				} else {
					local125 = Static229.anIntArrayArray26[arg4 + local21];
					local132 = Static229.anIntArrayArray26[arg4 - local21];
					local136 = Static241.anIntArray335[local21];
					local141 = local10 + arg2;
					local181 = arg2 - local10;
					local185 = local136 + arg2;
					local190 = arg2 - local136;
					Static216.method2862(local181, local190, arg1, local125);
					Static216.method2862(local190, local185, arg3, local125);
					Static216.method2862(local185, local141, arg1, local125);
					Static216.method2862(local181, local190, arg1, local132);
					Static216.method2862(local190, local185, arg3, local132);
					Static216.method2862(local185, local141, arg1, local132);
				}
			}
			local125 = Static229.anIntArrayArray26[local10 + arg4];
			local132 = Static229.anIntArrayArray26[arg4 - local10];
			local136 = arg2 + local21;
			local141 = arg2 - local21;
			if (local10 >= local15) {
				Static216.method2862(local141, local136, arg1, local125);
				Static216.method2862(local141, local136, arg1, local132);
			} else {
				local181 = local26 < local10 ? Static241.anIntArray335[local10] : local26;
				local185 = local181 + arg2;
				local190 = arg2 - local181;
				Static216.method2862(local141, local190, arg1, local125);
				Static216.method2862(local190, local185, arg3, local125);
				Static216.method2862(local185, local136, arg1, local125);
				Static216.method2862(local141, local190, arg1, local132);
				Static216.method2862(local190, local185, arg3, local132);
				Static216.method2862(local185, local136, arg1, local132);
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
	public static void method4928() {
		if (Static293.anInt4810 != 3) {
			Static14.aClass265_1 = Static140.aClass265_3;
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILclient!jm;Z)V")
	public static void method4930(@OriginalArg(1) Class3_Sub4_Sub1_Sub1 arg0, @OriginalArg(2) boolean arg1) {
		if (Static137.anInt6647 >= 400) {
			return;
		}
		@Pc(15) Class245 local15 = arg0.aClass245_1;
		if (local15.anIntArray560 != null) {
			local15 = local15.method5205(Static138.aClass268_1);
			if (local15 == null) {
				return;
			}
		}
		if (!local15.aBoolean476) {
			return;
		}
		@Pc(33) String local33 = local15.aString186;
		if (local15.anInt6713 != 0) {
			@Pc(52) String local52 = Static118.aClass4_1 == Static270.aClass4_3 ? Static345.aClass134_80.method2720(Static331.anInt5597) : Static136.aClass134_48.method2720(Static331.anInt5597);
			local33 = local33 + Static154.method2191(local15.anInt6713, Static60.aClass3_Sub4_Sub1_Sub2_1.anInt5001) + " (" + local52 + local15.anInt6713 + ")";
		}
		if (!Static215.aBoolean217) {
			if (!arg1) {
				@Pc(82) String[] local82 = local15.aStringArray36;
				if (Static29.aBoolean55) {
					local82 = Static16.method200(local82);
				}
				@Pc(92) int local92;
				if (local82 != null) {
					for (local92 = 4; local92 >= 0; local92--) {
						if (local82[local92] != null && (local15.aByte80 == 0 || !local82[local92].equalsIgnoreCase(Static95.aClass134_45.method2720(Static331.anInt5597)))) {
							@Pc(112) byte local112 = 0;
							if (local92 == 0) {
								local112 = 22;
							}
							@Pc(118) int local118 = Static235.anInt3807;
							if (local92 == 1) {
								local112 = 18;
							}
							if (local92 == 2) {
								local112 = 19;
							}
							if (local92 == 3) {
								local112 = 4;
							}
							if (local92 == 4) {
								local112 = 21;
							}
							if (local92 == local15.anInt6698) {
								local118 = local15.anInt6703;
							}
							if (local15.anInt6732 == local92) {
								local118 = local15.anInt6734;
							}
							Static153.method2190(0, local82[local92], true, local82[local92].equalsIgnoreCase(Static95.aClass134_45.method2720(Static331.anInt5597)) ? local15.anInt6724 : local118, "<col=ffff00>" + local33, -1, 0, local112, false, (long) arg0.anInt4915);
						}
					}
				}
				if (local15.aByte80 == 1 && local82 != null) {
					for (local92 = 4; local92 >= 0; local92--) {
						if (local82[local92] != null && local82[local92].equalsIgnoreCase(Static95.aClass134_45.method2720(Static331.anInt5597))) {
							@Pc(224) short local224 = 0;
							if (local15.anInt6713 > Static60.aClass3_Sub4_Sub1_Sub2_1.anInt5001) {
								local224 = 2000;
							}
							@Pc(237) short local237 = 0;
							if (local92 == 0) {
								local237 = 22;
							}
							if (local92 == 1) {
								local237 = 18;
							}
							if (local92 == 2) {
								local237 = 19;
							}
							if (local92 == 3) {
								local237 = 4;
							}
							if (local92 == 4) {
								local237 = 21;
							}
							if (local237 != 0) {
								local237 += local224;
							}
							Static153.method2190(0, local82[local92], true, local15.anInt6724, "<col=ffff00>" + local33, -1, 0, local237, false, (long) arg0.anInt4915);
						}
					}
				}
			}
			Static153.method2190(0, Static138.aClass134_49.method2720(Static331.anInt5597), true, Static63.anInt1184, "<col=ffff00>" + local33, -1, 0, 1001, arg1, (long) arg0.anInt4915);
		} else if (!arg1) {
			@Pc(347) Class200 local347 = Static405.anInt6628 == -1 ? null : Static234.aClass135_1.method2749(Static405.anInt6628);
			if ((Static256.anInt2800 & 0x2) != 0) {
				if (local347 == null || local15.method5200(local347.anInt5511, Static405.anInt6628) != local347.anInt5511) {
					Static153.method2190(0, Static76.aString45, true, Static201.anInt3379, Static408.aString205 + " -> <col=ffff00>" + local33, -1, 0, 9, false, (long) arg0.anInt4915);
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(Lclient!za;Lclient!ti;BLclient!fk;)V")
	public static void method4934(@OriginalArg(0) Class163 arg0, @OriginalArg(1) Class2_Sub40 arg1, @OriginalArg(3) Class78 arg2) {
		@Pc(10) Class13 local10 = arg2.method1753(arg0);
		if (local10 == null) {
			return;
		}
		@Pc(16) int local16 = local10.YA();
		if (local16 < local10.ZA()) {
			local16 = local10.ZA();
		}
		@Pc(32) int local32 = arg1.anInt6351;
		@Pc(35) int local35 = arg1.anInt6355;
		@Pc(37) int local37 = 0;
		@Pc(39) int local39 = 0;
		@Pc(41) int local41 = 0;
		@Pc(55) int local55;
		if (arg2.aString66 != null) {
			local37 = Static251.aClass141_6.method2910(null, null, arg2.aString66, Static428.aStringArray40);
			for (local55 = 0; local55 < local37; local55++) {
				@Pc(61) String local61 = Static428.aStringArray40[local55];
				if (local55 < local37 - 1) {
					local61 = local61.substring(0, local61.length() - 4);
				}
				@Pc(78) int local78 = Static266.aClass260_4.method5482(local61);
				if (local78 > local39) {
					local39 = local78;
				}
			}
			local41 = Static266.aClass260_4.method5479() * local37 + Static266.aClass260_4.method5478() / 2;
		}
		local55 = arg1.anInt6351 + local16 / 2;
		@Pc(116) int local116 = arg1.anInt6355;
		if (Static282.anInt3476 + local16 > local32) {
			local32 = Static282.anInt3476;
			local55 = local16 / 2 + Static282.anInt3476 + local39 / 2 + 10 + 5;
		} else if (local32 > Static282.anInt3470 - local16) {
			local32 = Static282.anInt3470 - local16;
			local55 = Static282.anInt3470 - local39 / 2 - local16 / 2 - 10 - 5;
		}
		if (local16 + Static282.anInt3474 > local35) {
			local116 = local16 / 2 + Static282.anInt3474 + 10;
			local35 = Static282.anInt3474;
		} else if (local35 > Static282.anInt3469 - local16) {
			local116 = Static282.anInt3469 - local16 / 2 - local41 - 10;
			local35 = Static282.anInt3469 - local16;
		}
		@Pc(250) int local250 = (int) (Math.atan2((double) (local32 - arg1.anInt6351), (double) (local35 - arg1.anInt6355)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
		local10.method5672((float) local16 / 2.0F + (float) local32, (float) local16 / 2.0F + (float) local35, 4096, local250);
		@Pc(270) int local270 = -2;
		@Pc(272) int local272 = -2;
		@Pc(274) int local274 = -2;
		@Pc(276) int local276 = -2;
		if (arg2.aString66 != null) {
			local270 = local55 - local39 / 2 - 5;
			local272 = local116;
			local276 = local37 * Static266.aClass260_4.method5479() + local116 + 3;
			local274 = local270 + local39 + 10;
			if (arg2.anInt2139 != 0) {
				arg0.method5545(local276 - local116, arg2.anInt2139, local274 - local270, local116, local270);
			}
			if (arg2.anInt2152 != 0) {
				arg0.method5504(arg2.anInt2152, local274 - local270, local116, local276 - local116, local270);
			}
			for (@Pc(343) int local343 = 0; local343 < local37; local343++) {
				@Pc(349) String local349 = Static428.aStringArray40[local343];
				if (local343 < local37 - 1) {
					local349 = local349.substring(0, local349.length() - 4);
				}
				Static266.aClass260_4.method5483(arg0, local349, local55, local116, arg2.anInt2167);
				local116 += Static266.aClass260_4.method5479();
			}
		}
		if (arg2.anInt2137 == -1 && arg2.aString66 == null) {
			return;
		}
		local16 >>= 0x1;
		@Pc(401) Class2_Sub18 local401 = new Class2_Sub18(arg1);
		local401.anInt2081 = local274;
		local401.anInt2086 = local35 - local16;
		local401.anInt2088 = local276;
		local401.anInt2092 = local16 + local32;
		local401.anInt2093 = local35 + local16;
		local401.anInt2083 = local32 - local16;
		local401.anInt2091 = local270;
		local401.anInt2090 = local272;
		Static144.aClass156_14.method3157(local401);
	}
}
