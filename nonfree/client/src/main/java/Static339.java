import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!vo", name = "C", descriptor = "Lclient!ao;")
	public static Class14 aClass14_2;

	@OriginalMember(owner = "client!vo", name = "K", descriptor = "Lclient!or;")
	public static Class158 aClass158_1;

	@OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
	public static int anInt6444 = 0;

	@OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
	public static int anInt6445 = 0;

	@OriginalMember(owner = "client!vo", name = "E", descriptor = "Z")
	public static boolean aBoolean467 = false;

	@OriginalMember(owner = "client!vo", name = "H", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[8];

	@OriginalMember(owner = "client!vo", name = "L", descriptor = "Ljava/lang/String;")
	public static String aString425 = "Cancel";

	@OriginalMember(owner = "client!vo", name = "N", descriptor = "I")
	public static int anInt6449 = 0;

	@OriginalMember(owner = "client!vo", name = "Q", descriptor = "[Z")
	public static final boolean[] aBooleanArray30 = new boolean[100];

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(ILclient!pe;I)Z")
	public static boolean method5511(@OriginalArg(0) int arg0, @OriginalArg(1) Class89 arg1) {
		@Pc(11) int local11 = (Static15.anInt287 - 104) / 2;
		@Pc(17) int local17 = (Static325.anInt6173 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg0; local29 <= 3; local29++) {
					if (Static215.method3801(local21, local25, local29, arg0)) {
						local40 = local29;
						if (Static150.method1571(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static268.method4483(local21, local40, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(88) int[] local88 = new int[262144];
		for (local29 = 0; local29 < local88.length; local29++) {
			local88[local29] = -16777216;
		}
		Static27.aClass52_1 = arg1.method5409(local88, 512, 512, 512);
		Static74.method1488();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) + 228 << 16) - (-((int) (Math.random() * 20.0D)) - 228)) | 0xFF000000;
		@Pc(158) int local158 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x20CFFF00) << 16;
		@Pc(177) int local177 = (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D);
		@Pc(181) boolean[][] local181 = new boolean[Static350.anInt6606][Static350.anInt6606];
		@Pc(187) int local187;
		@Pc(204) int local204;
		@Pc(208) int local208;
		@Pc(212) int local212;
		@Pc(267) int local267;
		@Pc(273) int local273;
		@Pc(277) int local277;
		@Pc(296) int local296;
		for (@Pc(183) int local183 = local11; local183 < local11 + 104; local183 += Static350.anInt6606) {
			for (local187 = local17; local187 < local17 + 104; local187 += Static350.anInt6606) {
				arg1.method5431(0, 0, Static350.anInt6606 * 4, Static350.anInt6606 * 4);
				arg1.method5405(-16777216);
				for (local204 = arg0; local204 <= 3; local204++) {
					for (local208 = 0; local208 < Static350.anInt6606; local208++) {
						for (local212 = 0; local212 < Static350.anInt6606; local212++) {
							local181[local208][local212] = Static215.method3801(local183 + local208, local212 + local187, local204, arg0);
						}
					}
					Static136.aClass8Array3[local204].method4171(local183, local187, local183 + Static350.anInt6606, local187 + Static350.anInt6606, local181);
					if (!Static275.aBoolean405) {
						for (local212 = -4; local212 < Static350.anInt6606; local212++) {
							for (local267 = -4; local267 < Static350.anInt6606; local267++) {
								local273 = local183 + local212;
								local277 = local267 + local187;
								if (local11 <= local273 && local17 <= local277 && Static215.method3801(local273, local277, local204, arg0)) {
									local296 = local204;
									if (Static150.method1571(local277, local273)) {
										local296 = local204 - 1;
									}
									if (local296 >= 0) {
										Static289.method1943(local296, local40, local212 * 4, arg1, local158, (Static350.anInt6606 - local267) * 4 - 4, local273, local277);
									}
								}
							}
						}
					}
				}
				if (Static275.aBoolean405) {
					@Pc(351) Class149 local351 = Static327.aClass149Array1[arg0];
					for (local212 = 0; local212 < Static350.anInt6606; local212++) {
						for (local267 = 0; local267 < Static350.anInt6606; local267++) {
							local273 = local212 + local183;
							local277 = local187 + local267;
							local296 = local351.anIntArrayArray36[local273 - local351.anInt4488][local277 - local351.anInt4484];
							if ((local296 & 0x40240000) != 0) {
								arg1.method5477((Static350.anInt6606 - local267) * 4 - 4, local212 * 4, 4, 4, -1713569622);
							} else if ((local296 & 0x800000) != 0) {
								arg1.method5448(local212 * 4, 4, (Static350.anInt6606 - local267) * 4 - 4, -1713569622);
							} else if ((local296 & 0x2000000) != 0) {
								arg1.method5415(-1713569622, local212 * 4 + 3, 4, (Static350.anInt6606 - local267) * 4 - 4);
							} else if ((local296 & 0x8000000) != 0) {
								arg1.method5448(local212 * 4, 4, (Static350.anInt6606 - local267) * 4 + 3 - 4, -1713569622);
							} else if ((local296 & 0x20000000) != 0) {
								arg1.method5415(-1713569622, local212 * 4, 4, (Static350.anInt6606 - local267) * 4 - 4);
							}
						}
					}
				}
				arg1.method5439(0, 0, Static350.anInt6606 * 4, Static350.anInt6606 * 4, local177, 2);
				Static27.aClass52_1.method4137((local183 - local11) * 4 + 48, -((local187 - local17) * 4) - Static350.anInt6606 * 4 + 464, Static350.anInt6606 * 4, Static350.anInt6606 * 4);
			}
		}
		arg1.method5425();
		arg1.method5405(-16777215);
		Static183.method3347();
		Static329.anInt6216 = 0;
		Static154.aClass74_20.method1803();
		if (!Static275.aBoolean405) {
			for (local187 = local11; local187 < local11 + 104; local187++) {
				for (local204 = local17; local204 < local17 + 104; local204++) {
					for (local208 = arg0; arg0 + 1 >= local208 && local208 <= 3; local208++) {
						if (Static215.method3801(local187, local204, local208, arg0)) {
							@Pc(619) Interface1 local619 = (Interface1) Static44.method981(local208, local187, local204);
							if (local619 == null) {
								local619 = (Interface1) Static252.method5177(local208, local187, local204, gd.class);
							}
							if (local619 == null) {
								local619 = (Interface1) Static48.method4691(local208, local187, local204);
							}
							if (local619 == null) {
								local619 = (Interface1) Static96.method1983(local208, local187, local204);
							}
							if (local619 != null) {
								@Pc(659) Class122 local659 = Static245.method4227(local619.method5362());
								if (!local659.aBoolean273 || Static204.aBoolean315) {
									local273 = local659.anInt3567;
									if (local659.anIntArray481 != null) {
										for (local277 = 0; local277 < local659.anIntArray481.length; local277++) {
											if (local659.anIntArray481[local277] != -1) {
												@Pc(688) Class122 local688 = Static245.method4227(local659.anIntArray481[local277]);
												if (local688.anInt3567 >= 0) {
													local273 = local688.anInt3567;
												}
											}
										}
									}
									if (local273 >= 0) {
										@Pc(707) boolean local707 = false;
										if (local273 >= 0) {
											@Pc(716) Class155 local716 = Static84.method1785(local273);
											if (local716 != null && local716.aBoolean344) {
												local707 = true;
											}
										}
										local296 = local187;
										@Pc(727) int local727 = local204;
										if (local707) {
											@Pc(734) int[][] local734 = Static327.aClass149Array1[local208].anIntArrayArray36;
											@Pc(739) int local739 = Static327.aClass149Array1[local208].anInt4488;
											@Pc(744) int local744 = Static327.aClass149Array1[local208].anInt4484;
											for (@Pc(746) int local746 = 0; local746 < 10; local746++) {
												@Pc(753) int local753 = (int) (Math.random() * 4.0D);
												if (local753 == 0 && local296 > local11 && local296 > local187 - 3 && (local734[local296 - local739 - 1][local727 - local744] & 0x2C0108) == 0) {
													local296--;
												}
												if (local753 == 1 && local296 < local11 + 104 - 1 && local187 + 3 > local296 && (local734[local296 + 1 - local739][local727 - local744] & 0x2C0180) == 0) {
													local296++;
												}
												if (local753 == 2 && local17 < local727 && local204 - 3 < local727 && (local734[local296 - local739][local727 - local744 - 1] & 0x2C0102) == 0) {
													local727--;
												}
												if (local753 == 3 && local17 + 104 - 1 > local727 && local727 < local204 + 3 && (local734[local296 - local739][local727 + 1 - local744] & 0x2C0120) == 0) {
													local727++;
												}
											}
										}
										Static259.anIntArray656[Static329.anInt6216] = local659.anInt3534;
										Static338.anIntArray815[Static329.anInt6216] = local296;
										Static149.anIntArray422[Static329.anInt6216] = local727;
										Static329.anInt6216++;
									}
								}
							}
						}
					}
				}
			}
			if (Static275.aClass134_3 != null) {
				Static282.aClass180_75.anInt5411 = 1;
				Static66.method1337(1024, 64);
				for (local204 = 0; local204 < Static275.aClass134_3.anInt3827; local204++) {
					local208 = Static275.aClass134_3.anIntArray523[local204];
					if (local208 >> 28 == Static168.anInt3508) {
						local212 = (local208 >> 14 & 0x3FFF) - Static350.anInt6609;
						local267 = (local208 & 0x3FFF) - Static237.anInt4696;
						if (local212 >= 0 && local212 < Static15.anInt287 && local267 >= 0 && local267 < Static325.anInt6173) {
							Static154.aClass74_20.method1802(new Class7_Sub10(local204));
						} else {
							@Pc(1024) Class155 local1024 = Static84.method1785(Static275.aClass134_3.anIntArray522[local204]);
							if (local1024.anIntArray625 != null && local212 + local1024.anInt4690 >= 0 && Static15.anInt287 > local212 + local1024.anInt4676 && local267 + local1024.anInt4684 >= 0 && local267 + local1024.anInt4667 < Static325.anInt6173) {
								Static154.aClass74_20.method1802(new Class7_Sub10(local204));
							}
						}
					}
				}
				Static66.method1337(128, 64);
				Static282.aClass180_75.anInt5411 = 2;
				Static282.aClass180_75.method4558();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(I[[I)V")
	public static void method5513(@OriginalArg(1) int[][] arg0) {
		Static323.anIntArrayArray55 = arg0;
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "([Ljava/lang/Object;[II)V")
	public static void method5514(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int[] arg1) {
		Static93.method1898(arg1, arg1.length - 1, arg0, 0);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIII)I")
	public static int method5515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) int local12 = arg3 & 0xF;
		@Pc(19) int local19 = local12 >= 8 ? arg0 : arg2;
		@Pc(34) int local34 = local12 < 4 ? arg0 : local12 == 12 || local12 == 14 ? arg2 : arg1;
		return ((local12 & 0x2) == 0 ? local34 : -local34) + ((local12 & 0x1) == 0 ? local19 : -local19);
	}

	@OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lclient!qo;IILclient!cc;Lclient!kk;III)V")
	public static void method5516(@OriginalArg(0) Class22_Sub2_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class22_Sub2_Sub1_Sub1 arg3, @OriginalArg(4) Class122 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class7_Sub26 local7 = new Class7_Sub26();
		local7.anInt3942 = arg1 * 128;
		local7.anInt3945 = arg5 * 128;
		local7.anInt3934 = arg2;
		if (arg4 != null) {
			local7.aClass122_1 = arg4;
			@Pc(144) int local144 = arg4.anInt3562;
			@Pc(147) int local147 = arg4.anInt3527;
			if (arg6 == 1 || arg6 == 3) {
				local147 = arg4.anInt3562;
				local144 = arg4.anInt3527;
			}
			local7.anInt3938 = (arg1 + local144) * 128;
			local7.anInt3949 = (local147 + arg5) * 128;
			local7.anInt3939 = arg4.anInt3533;
			local7.anInt3943 = arg4.anInt3538;
			local7.anInt3936 = arg4.anInt3555;
			local7.anInt3948 = arg4.anInt3537;
			local7.anIntArray547 = arg4.anIntArray475;
			local7.anInt3940 = arg4.anInt3531 * 128;
			if (arg4.anIntArray481 != null) {
				local7.aBoolean310 = true;
				local7.method3578();
			}
			if (local7.anIntArray547 != null) {
				local7.anInt3941 = local7.anInt3943 + (int) ((double) (local7.anInt3948 - local7.anInt3943) * Math.random());
			}
			Static75.aClass74_7.method1802(local7);
		} else if (arg0 != null) {
			local7.aClass22_Sub2_Sub1_Sub2_1 = arg0;
			@Pc(85) Class174 local85 = arg0.aClass174_1;
			if (local85.anIntArray670 != null) {
				local7.aBoolean310 = true;
				local85 = local85.method4438();
			}
			if (local85 != null) {
				local7.anInt3938 = (local85.anInt5191 + arg1) * 128;
				local7.anInt3949 = (arg5 + local85.anInt5191) * 128;
				local7.anInt3939 = Static289.method1940(arg0);
				local7.anInt3936 = local85.anInt5181;
				local7.anInt3940 = local85.anInt5207 * 128;
			}
			Static45.aClass74_4.method1802(local7);
		} else if (arg3 != null) {
			local7.aClass22_Sub2_Sub1_Sub1_3 = arg3;
			local7.anInt3938 = (arg3.method4421() + arg1) * 128;
			local7.anInt3949 = (arg3.method4421() + arg5) * 128;
			local7.anInt3939 = Static184.method3384(arg3);
			local7.anInt3936 = arg3.anInt1002;
			local7.anInt3940 = arg3.anInt1004 * 128;
			Static141.aClass10_24.method161((long) arg3.anInt5115, local7);
			return;
		}
	}
}
