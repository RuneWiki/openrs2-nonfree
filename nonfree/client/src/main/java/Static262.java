import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static262 {

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "[Lclient!bb;")
	public static Class28[] aClass28Array1;

	@OriginalMember(owner = "client!ji", name = "l", descriptor = "[Lclient!dr;")
	public static Interface6[] anInterface6Array1;

	@OriginalMember(owner = "client!ji", name = "h", descriptor = "I")
	public static int anInt5205 = 0;

	@OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
	public static int anInt5209 = 0;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)Z")
	public static boolean method4656(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return false;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(ILclient!ha;I)Z")
	public static boolean method4657(@OriginalArg(1) Class100 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static442.anInt7975 - 104) / 2;
		@Pc(17) int local17 = (Static284.anInt7916 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static510.method7565(arg1, local25, local29, local21)) {
						local40 = local29;
						if (Static492.method7384(local21, local25)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static307.method5200(local40, local21, local25);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(86) int[] local86 = new int[262144];
		for (local29 = 0; local29 < local86.length; local29++) {
			local86[local29] = -16777216;
		}
		Static161.aClass32_6 = arg0.method8847(512, 512, local86, 512);
		Static189.method3368();
		local40 = (int) (Math.random() * 20.0D) + ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + (((int) (Math.random() * 20.0D) - 10) + 238 << 8) + 238 - 10 | 0xFF000000;
		@Pc(166) int local166 = ((int) (Math.random() * 20.0D) + 238 - 10 | 0x32AEFF00) << 16;
		@Pc(185) int local185 = (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D);
		@Pc(195) boolean[][] local195 = new boolean[Static89.anInt6695 + 3][Static89.anInt6695 + 2 + 1];
		@Pc(201) int local201;
		@Pc(205) int local205;
		@Pc(207) int local207;
		@Pc(209) int local209;
		@Pc(215) int local215;
		@Pc(225) int local225;
		@Pc(233) int local233;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(322) int local322;
		@Pc(329) int local329;
		@Pc(333) int local333;
		@Pc(352) int local352;
		for (@Pc(197) int local197 = local11; local197 < local11 + 104; local197 += Static89.anInt6695) {
			for (local201 = local17; local201 < local17 + 104; local201 += Static89.anInt6695) {
				local205 = 0;
				local207 = 0;
				local209 = local197;
				if (local197 > 0) {
					local205 += 4;
					local209 = local197 - 1;
				}
				local215 = local201;
				if (local201 > 0) {
					local215 = local201 - 1;
				}
				local225 = local197 + Static89.anInt6695;
				if (local225 < 104) {
					local225++;
				}
				local233 = Static89.anInt6695 + local201;
				if (local233 < 104) {
					local233++;
					local207 += 4;
				}
				arg0.KA(0, 0, local205 + Static89.anInt6695 * 4, Static89.anInt6695 * 4 + local207);
				arg0.GA(-16777216);
				@Pc(268) int local268;
				for (local260 = arg1; local260 <= 3; local260++) {
					for (local264 = 0; local264 <= Static89.anInt6695; local264++) {
						for (local268 = 0; local268 <= Static89.anInt6695; local268++) {
							local195[local264][local268] = Static510.method7565(arg1, local215 + local268, local260, local264 + local209);
						}
					}
					Static228.aClass199Array2[local260].method8529(local209, local215, local225, local233, local195);
					if (!Static165.aBoolean248) {
						for (local268 = -4; local268 < Static89.anInt6695; local268++) {
							for (local322 = -4; local322 < Static89.anInt6695; local322++) {
								local329 = local197 + local268;
								local333 = local322 + local201;
								if (local11 <= local329 && local333 >= local17 && Static510.method7565(arg1, local333, local260, local329)) {
									local352 = local260;
									if (Static492.method7384(local329, local333)) {
										local352 = local260 - 1;
									}
									if (local352 >= 0) {
										Static29.method527(local268 * 4 + local205, arg0, local352, local166, local207 + (Static89.anInt6695 + -local322) * 4 - 4, local40, local329, local333);
									}
								}
							}
						}
					}
				}
				if (Static165.aBoolean248) {
					@Pc(410) Class319 local410 = Static619.aClass319Array1[arg1];
					for (local268 = 0; local268 < Static89.anInt6695; local268++) {
						for (local322 = 0; local322 < Static89.anInt6695; local322++) {
							local329 = local268 + local197;
							local333 = local322 + local201;
							local352 = local410.anIntArrayArray52[local329 - local410.anInt9338][local333 - local410.anInt9322];
							if ((local352 & 0x40240000) != 0) {
								arg0.method8815(local205 + local268 * 4, -1713569622, 4, local207 + (Static89.anInt6695 - local322) * 4 - 4, 4);
							} else if ((local352 & 0x800000) != 0) {
								arg0.method8790((Static89.anInt6695 - local322) * 4 + local207 - 4, 4, -1713569622, local268 * 4 + local205);
							} else if ((local352 & 0x2000000) != 0) {
								arg0.method8782(-1713569622, 4, (Static89.anInt6695 - local322) * 4 + local207 - 4, local268 * 4 + 3 + local205);
							} else if ((local352 & 0x8000000) != 0) {
								arg0.method8790(local207 + (Static89.anInt6695 - local322) * 4 + 3 - 4, 4, -1713569622, local205 + local268 * 4);
							} else if ((local352 & 0x20000000) != 0) {
								arg0.method8782(-1713569622, 4, local207 + (Static89.anInt6695 - local322) * 4 - 4, local268 * 4 + local205);
							}
						}
					}
				}
				arg0.aa(local205, local207, Static89.anInt6695 * 4, Static89.anInt6695 * 4, local185, 2);
				Static161.aClass32_6.method5091((local197 - local11) * 4 + 48, -((-local17 + local201) * 4) + 464 - Static89.anInt6695 * 4, Static89.anInt6695 * 4, Static89.anInt6695 * 4, local205, local207);
			}
		}
		arg0.la();
		arg0.GA(-16777215);
		Static643.method8977();
		Static193.anInt3934 = 0;
		Static603.aClass8_64.method154();
		if (!Static165.aBoolean248) {
			for (local201 = local11; local201 < local11 + 104; local201++) {
				for (local205 = local17; local205 < local17 + 104; local205++) {
					for (local207 = arg1; arg1 + 1 >= local207 && local207 <= 3; local207++) {
						if (Static510.method7565(arg1, local205, local207, local201)) {
							@Pc(710) Interface12 local710 = (Interface12) Static158.method2999(local207, local201, local205);
							if (local710 == null) {
								local710 = (Interface12) Static366.method5797(local207, local201, local205, jn.class);
							}
							if (local710 == null) {
								local710 = (Interface12) Static245.method5549(local207, local201, local205);
							}
							if (local710 == null) {
								local710 = (Interface12) Static578.method5708(local207, local201, local205);
							}
							if (local710 != null) {
								@Pc(751) Class312 local751 = Static283.aClass210_2.method5629(local710.method9026());
								if (!local751.aBoolean625 || Static265.aBoolean260) {
									local225 = local751.anInt9211;
									if (local751.anIntArray565 != null) {
										for (local233 = 0; local233 < local751.anIntArray565.length; local233++) {
											if (local751.anIntArray565[local233] != -1) {
												@Pc(780) Class312 local780 = Static283.aClass210_2.method5629(local751.anIntArray565[local233]);
												if (local780.anInt9211 >= 0) {
													local225 = local780.anInt9211;
												}
											}
										}
									}
									if (local225 >= 0) {
										@Pc(802) boolean local802 = false;
										if (local225 >= 0) {
											@Pc(812) Class105 local812 = Static184.aClass337_2.method8119(local225);
											if (local812 != null && local812.aBoolean243) {
												local802 = true;
											}
										}
										local260 = local201;
										local264 = local205;
										if (local802) {
											@Pc(830) int[][] local830 = Static619.aClass319Array1[local207].anIntArrayArray52;
											local322 = Static619.aClass319Array1[local207].anInt9338;
											local329 = Static619.aClass319Array1[local207].anInt9322;
											for (local333 = 0; local333 < 10; local333++) {
												local352 = (int) (Math.random() * 4.0D);
												if (local352 == 0 && local11 < local260 && local201 - 3 < local260 && (local830[local260 - local322 - 1][local264 - local329] & 0x2C0108) == 0) {
													local260--;
												}
												if (local352 == 1 && local11 + 104 - 1 > local260 && local201 + 3 > local260 && (local830[local260 + 1 - local322][local264 - local329] & 0x2C0180) == 0) {
													local260++;
												}
												if (local352 == 2 && local264 > local17 && local205 - 3 < local264 && (local830[local260 - local322][local264 - local329 - 1] & 0x2C0102) == 0) {
													local264--;
												}
												if (local352 == 3 && local17 + 104 - 1 > local264 && local205 + 3 > local264 && (local830[local260 - local322][local264 + 1 - local329] & 0x2C0120) == 0) {
													local264++;
												}
											}
										}
										Static419.anIntArray464[Static193.anInt3934] = local751.anInt9241;
										Static522.anIntArray558[Static193.anInt3934] = local260;
										Static107.anIntArray146[Static193.anInt3934] = local264;
										Static193.anInt3934++;
									}
								}
							}
						}
					}
				}
			}
			if (Static273.aClass356_1 != null) {
				Static648.aClass353_138.anInt9949 = 1;
				Static184.aClass337_2.method8118(1024, 64);
				for (local205 = 0; local205 < Static273.aClass356_1.anInt10029; local205++) {
					local207 = Static273.aClass356_1.anIntArray608[local205];
					if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 == local207 >> 28) {
						local209 = (local207 >> 14 & 0x3FFF) - Static606.anInt8651;
						local215 = (local207 & 0x3FFF) - Static195.anInt3961;
						if (local209 >= 0 && Static442.anInt7975 > local209 && local215 >= 0 && local215 < Static284.anInt7916) {
							Static603.aClass8_64.method157(new Class6_Sub48(local205));
						} else {
							@Pc(1111) Class105 local1111 = Static184.aClass337_2.method8119(Static273.aClass356_1.anIntArray607[local205]);
							if (local1111.anIntArray205 != null && local1111.anInt3388 + local209 >= 0 && Static442.anInt7975 > local209 + local1111.anInt3396 && local215 + local1111.anInt3414 >= 0 && Static284.anInt7916 > local215 + local1111.anInt3395) {
								Static603.aClass8_64.method157(new Class6_Sub48(local205));
							}
						}
					}
				}
				Static184.aClass337_2.method8118(128, 64);
				Static648.aClass353_138.anInt9949 = 2;
				Static648.aClass353_138.method8417();
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/io/File;II)[B")
	public static byte[] method4658(@OriginalArg(0) File arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(14) byte[] local14 = new byte[arg1];
			Static343.method5558(arg0, local14, arg1);
			return local14;
		} catch (@Pc(22) IOException local22) {
			return null;
		}
	}
}
