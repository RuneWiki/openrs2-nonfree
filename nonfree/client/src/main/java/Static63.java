import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!cw", name = "c", descriptor = "Lclient!id;")
	public static Class120 aClass120_2;

	@OriginalMember(owner = "client!cw", name = "f", descriptor = "[S")
	public static short[] aShortArray96;

	@OriginalMember(owner = "client!cw", name = "h", descriptor = "[I")
	public static int[] anIntArray547;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_168 = new Class25(92, 6);

	@OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
	public static int anInt6767 = -1;

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
	public static void method5433() {
		@Pc(7) int local7 = Static121.anInt2062;
		@Pc(14) int[] local14 = Static311.anIntArray474;
		for (@Pc(16) int local16 = 0; local16 < local7; local16++) {
			@Pc(24) Class11_Sub5_Sub2_Sub1 local24 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local14[local16]];
			if (local24 != null) {
				Static448.method6075(local24.method6215(), local24);
			}
		}
	}

	@OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lclient!za;II)Z")
	public static boolean method5435(@OriginalArg(0) Class75 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = (Static234.anInt3949 - 104) / 2;
		@Pc(17) int local17 = (Static371.anInt6492 - 104) / 2;
		@Pc(19) boolean local19 = true;
		@Pc(29) int local29;
		@Pc(40) int local40;
		for (@Pc(21) int local21 = local11; local21 < local11 + 104; local21++) {
			for (@Pc(25) int local25 = local17; local25 < local17 + 104; local25++) {
				for (local29 = arg1; local29 <= 3; local29++) {
					if (Static246.method3418(local29, arg1, local25, local21)) {
						local40 = local29;
						if (Static369.method5157(local25, local21)) {
							local40 = local29 - 1;
						}
						if (local40 >= 0) {
							local19 &= Static178.method2591(local21, local25, local40);
						}
					}
				}
			}
		}
		if (!local19) {
			return false;
		}
		@Pc(85) int[] local85 = new int[262144];
		for (local29 = 0; local29 < local85.length; local29++) {
			local85[local29] = -16777216;
		}
		Static214.aClass41_10 = arg0.method6006(local85, 512, 512, 512);
		Static236.method3224();
		local40 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10 | 0xFF000000;
		@Pc(152) int local152 = ((int) (Math.random() * 20.0D) + 228 | 0x22B0FF00) << 16;
		@Pc(171) int local171 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 8 | (int) (Math.random() * 8.0D) << 16;
		@Pc(175) boolean[][] local175 = new boolean[Static43.anInt670][Static43.anInt670];
		@Pc(181) int local181;
		@Pc(198) int local198;
		@Pc(202) int local202;
		@Pc(206) int local206;
		@Pc(264) int local264;
		@Pc(271) int local271;
		@Pc(275) int local275;
		@Pc(294) int local294;
		for (@Pc(177) int local177 = local11; local177 < local11 + 104; local177 += Static43.anInt670) {
			for (local181 = local17; local181 < local17 + 104; local181 += Static43.anInt670) {
				arg0.ba(0, 0, Static43.anInt670 * 4, Static43.anInt670 * 4);
				arg0.t(-16777216);
				for (local198 = arg1; local198 <= 3; local198++) {
					for (local202 = 0; local202 < Static43.anInt670; local202++) {
						for (local206 = 0; local206 < Static43.anInt670; local206++) {
							local175[local202][local206] = Static246.method3418(local198, arg1, local181 + local206, local202 + local177);
						}
					}
					Static114.aClass22Array2[local198].method2325(local177, local181, Static43.anInt670 + local177, Static43.anInt670 + local181, local175);
					if (!Static433.aBoolean498) {
						for (local206 = -4; local206 < Static43.anInt670; local206++) {
							for (local264 = -4; local264 < Static43.anInt670; local264++) {
								local271 = local177 + local206;
								local275 = local264 + local181;
								if (local271 >= local11 && local275 >= local17 && Static246.method3418(local198, arg1, local275, local271)) {
									local294 = local198;
									if (Static369.method5157(local275, local271)) {
										local294 = local198 - 1;
									}
									if (local294 >= 0) {
										Static148.method2248(arg0, local206 * 4, local152, local294, local275, local271, local40, (Static43.anInt670 - local264) * 4 - 4);
									}
								}
							}
						}
					}
				}
				if (Static433.aBoolean498) {
					@Pc(339) Class225 local339 = Static89.aClass225Array2[arg1];
					for (local206 = 0; local206 < Static43.anInt670; local206++) {
						for (local264 = 0; local264 < Static43.anInt670; local264++) {
							local271 = local177 + local206;
							local275 = local264 + local181;
							local294 = local339.anIntArrayArray159[local271 - local339.anInt6535][local275 - local339.anInt6523];
							if ((local294 & 0x40240000) != 0) {
								arg0.method5996(4, (Static43.anInt670 - local264) * 4 - 4, -1713569622, local206 * 4, 4);
							} else if ((local294 & 0x800000) != 0) {
								arg0.method6022((Static43.anInt670 - local264) * 4 - 4, -1713569622, local206 * 4, 4);
							} else if ((local294 & 0x2000000) != 0) {
								arg0.method5976(4, local206 * 4 + 3, -1713569622, (Static43.anInt670 - local264) * 4 - 4);
							} else if ((local294 & 0x8000000) != 0) {
								arg0.method6022((Static43.anInt670 - local264) * 4 + 3 - 4, -1713569622, local206 * 4, 4);
							} else if ((local294 & 0x20000000) != 0) {
								arg0.method5976(4, local206 * 4, -1713569622, (Static43.anInt670 - local264) * 4 - 4);
							}
						}
					}
				}
				arg0.P(0, 0, Static43.anInt670 * 4, Static43.anInt670 * 4, local171, 2);
				Static214.aClass41_10.XA((local177 - local11) * 4 + 48, -((local181 + -local17) * 4) + 464 + -(Static43.anInt670 * 4), Static43.anInt670 * 4, Static43.anInt670 * 4, 0, 0);
			}
		}
		arg0.va();
		arg0.t(-16777215);
		Static323.method4576();
		Static37.anInt614 = 0;
		Static459.aClass181_51.method3969();
		if (!Static433.aBoolean498) {
			for (local181 = local11; local181 < local11 + 104; local181++) {
				for (local198 = local17; local198 < local17 + 104; local198++) {
					for (local202 = arg1; arg1 + 1 >= local202 && local202 <= 3; local202++) {
						if (Static246.method3418(local202, arg1, local198, local181)) {
							@Pc(614) Interface6 local614 = (Interface6) Static115.method1883(local202, local181, local198);
							if (local614 == null) {
								local614 = (Interface6) Static345.method4857(local202, local181, local198, jq.class);
							}
							if (local614 == null) {
								local614 = (Interface6) Static45.method700(local202, local181, local198);
							}
							if (local614 == null) {
								local614 = (Interface6) Static130.method2044(local202, local181, local198);
							}
							if (local614 != null) {
								@Pc(655) Class192 local655 = Static249.aClass39_2.method748(local614.method5718());
								if (!local655.aBoolean375 || Static183.aBoolean205) {
									local271 = local655.anInt5448;
									if (local655.anIntArray462 != null) {
										for (local275 = 0; local275 < local655.anIntArray462.length; local275++) {
											if (local655.anIntArray462[local275] != -1) {
												@Pc(684) Class192 local684 = Static249.aClass39_2.method748(local655.anIntArray462[local275]);
												if (local684.anInt5448 >= 0) {
													local271 = local684.anInt5448;
												}
											}
										}
									}
									if (local271 >= 0) {
										@Pc(704) boolean local704 = false;
										if (local271 >= 0) {
											@Pc(714) Class203 local714 = Static54.aClass84_2.method1953(local271);
											if (local714 != null && local714.aBoolean417) {
												local704 = true;
											}
										}
										local294 = local181;
										@Pc(725) int local725 = local198;
										if (local704) {
											@Pc(732) int[][] local732 = Static89.aClass225Array2[local202].anIntArrayArray159;
											@Pc(737) int local737 = Static89.aClass225Array2[local202].anInt6535;
											@Pc(742) int local742 = Static89.aClass225Array2[local202].anInt6523;
											for (@Pc(744) int local744 = 0; local744 < 10; local744++) {
												@Pc(751) int local751 = (int) (Math.random() * 4.0D);
												if (local751 == 0 && local294 > local11 && local294 > local181 - 3 && (local732[local294 - local737 - 1][local725 - local742] & 0x2C0108) == 0) {
													local294--;
												}
												if (local751 == 1 && local11 + 104 - 1 > local294 && local294 < local181 + 3 && (local732[local294 + 1 - local737][local725 - local742] & 0x2C0180) == 0) {
													local294++;
												}
												if (local751 == 2 && local725 > local17 && local725 > local198 - 3 && (local732[local294 - local737][local725 - local742 - 1] & 0x2C0102) == 0) {
													local725--;
												}
												if (local751 == 3 && local17 + 104 - 1 > local725 && local198 + 3 > local725 && (local732[local294 - local737][local725 + 1 - local742] & 0x2C0120) == 0) {
													local725++;
												}
											}
										}
										Static216.anIntArray629[Static37.anInt614] = local655.anInt5422;
										Static238.anIntArray357[Static37.anInt614] = local294;
										Static431.anIntArray597[Static37.anInt614] = local725;
										Static37.anInt614++;
									}
								}
							}
						}
					}
				}
			}
			if (Static115.aClass176_2 != null) {
				Static73.aClass171_16.anInt4582 = 1;
				Static54.aClass84_2.method1952(64, 1024);
				for (local198 = 0; local198 < Static115.aClass176_2.anInt4630; local198++) {
					local202 = Static115.aClass176_2.anIntArray400[local198];
					if (local202 >> 28 == Static127.aClass11_Sub5_Sub2_Sub1_2.aByte101) {
						local206 = (local202 >> 14 & 0x3FFF) - Static386.anInt7205;
						local264 = (local202 & 0x3FFF) - Static153.anInt2798;
						if (local206 >= 0 && Static234.anInt3949 > local206 && local264 >= 0 && Static371.anInt6492 > local264) {
							Static459.aClass181_51.method3973(new Class2_Sub5(local198));
						} else {
							@Pc(1021) Class203 local1021 = Static54.aClass84_2.method1953(Static115.aClass176_2.anIntArray399[local198]);
							if (local1021.anIntArray496 != null && local206 + local1021.anInt5948 >= 0 && local206 + local1021.anInt5956 < Static234.anInt3949 && local1021.anInt5955 + local264 >= 0 && Static371.anInt6492 > local264 + local1021.anInt5967) {
								Static459.aClass181_51.method3973(new Class2_Sub5(local198));
							}
						}
					}
				}
				Static54.aClass84_2.method1952(64, 128);
				Static73.aClass171_16.anInt4582 = 2;
				Static73.aClass171_16.method3667();
			}
		}
		return true;
	}
}
