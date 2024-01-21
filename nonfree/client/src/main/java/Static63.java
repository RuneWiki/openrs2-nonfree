import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static63 {

	@OriginalMember(owner = "client!ge", name = "u", descriptor = "Lclient!w;")
	public static Class96 aClass96_39;

	@OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
	public static int anInt3568;

	@OriginalMember(owner = "client!ge", name = "z", descriptor = "Lclient!ab;")
	public static Class3 aClass3_34;

	@OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
	public static int anInt3562 = 0;

	@OriginalMember(owner = "client!ge", name = "p", descriptor = "[I")
	public static final int[] anIntArray307 = new int[50];

	@OriginalMember(owner = "client!ge", name = "K", descriptor = "I")
	public static int anInt3580 = 0;

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIBI)V")
	public static void method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		Static39.anInt1070 = 0;
		@Pc(153) int local153;
		@Pc(75) int local75;
		@Pc(263) int local263;
		for (@Pc(5) int local5 = -1; local5 < Static153.anInt3186 + Static35.anInt992; local5++) {
			@Pc(24) Class8_Sub3 local24;
			if (local5 == -1) {
				local24 = Static15.aClass8_Sub3_Sub1_1;
			} else if (local5 < Static35.anInt992) {
				local24 = Static47.aClass8_Sub3_Sub1Array1[Static111.anIntArray181[local5]];
			} else {
				local24 = Static177.aClass8_Sub3_Sub2Array1[Static103.anIntArray167[local5 - Static35.anInt992]];
			}
			if (local24 != null && local24.method2681()) {
				@Pc(55) Class1_Sub3_Sub13 local55;
				if (local24 instanceof Class8_Sub3_Sub2) {
					local55 = ((Class8_Sub3_Sub2) local24).aClass1_Sub3_Sub13_1;
					if (local55.anIntArray169 != null) {
						local55 = local55.method1581();
					}
					if (local55 == null) {
						continue;
					}
				}
				if (local5 >= Static35.anInt992) {
					local55 = ((Class8_Sub3_Sub2) local24).aClass1_Sub3_Sub13_1;
					if (local55.anIntArray169 != null) {
						local55 = local55.method1581();
					}
					if (local55.anInt2272 >= 0 && Static25.aClass1_Sub3_Sub1_Sub1Array5.length > local55.anInt2272) {
						Static19.method433(local24, local24.method2682() + 15);
						if (Static23.anInt563 > -1) {
							Static25.aClass1_Sub3_Sub1_Sub1Array5[local55.anInt2272].method358(Static23.anInt563 + arg1 - 12, arg2 + -30 - -Static9.anInt3178);
						}
					}
					@Pc(261) Class55[] local261 = Static117.aClass55Array1;
					for (local263 = 0; local263 < local261.length; local263++) {
						@Pc(269) Class55 local269 = local261[local263];
						if (local269 != null && local269.anInt2276 == 1 && Static103.anIntArray167[local5 - Static35.anInt992] == local269.anInt2281 && Static155.anInt2981 % 20 < 10) {
							Static19.method433(local24, local24.method2682() + 15);
							if (Static23.anInt563 > -1) {
								Static82.aClass1_Sub3_Sub1_Sub1Array13[local269.anInt2275].method358(Static23.anInt563 + arg1 - 12, Static9.anInt3178 + -28 + arg2);
							}
						}
					}
				} else {
					local75 = 30;
					@Pc(78) Class8_Sub3_Sub1 local78 = (Class8_Sub3_Sub1) local24;
					if (local78.anInt972 != -1 || local78.anInt993 != -1) {
						Static19.method433(local24, local24.method2682() + 15);
						if (Static23.anInt563 > -1) {
							if (local78.anInt972 != -1) {
								Static138.aClass1_Sub3_Sub1_Sub1Array17[local78.anInt972].method358(Static23.anInt563 + arg1 - 12, arg2 - -Static9.anInt3178 + -30);
								local75 += 25;
							}
							if (local78.anInt993 != -1) {
								Static25.aClass1_Sub3_Sub1_Sub1Array5[local78.anInt993].method358(Static23.anInt563 + arg1 - 12, -local75 + Static9.anInt3178 + arg2);
								local75 += 25;
							}
						}
					}
					if (local5 >= 0) {
						@Pc(151) Class55[] local151 = Static117.aClass55Array1;
						for (local153 = 0; local153 < local151.length; local153++) {
							@Pc(159) Class55 local159 = local151[local153];
							if (local159 != null && local159.anInt2276 == 10 && Static111.anIntArray181[local5] == local159.anInt2281) {
								Static19.method433(local24, local24.method2682() + 15);
								if (Static23.anInt563 > -1) {
									Static82.aClass1_Sub3_Sub1_Sub1Array13[local159.anInt2275].method358(arg1 + Static23.anInt563 - 12, -local75 + Static9.anInt3178 + arg2);
								}
							}
						}
					}
				}
				if (local24.aClass92_1718 != null && (local5 >= Static35.anInt992 || Static169.anInt3511 == 0 || Static169.anInt3511 == 3 || Static169.anInt3511 == 1 && Static201.method3333(((Class8_Sub3_Sub1) local24).aClass92_374))) {
					Static19.method433(local24, local24.method2682());
					if (Static23.anInt563 > -1 && Static194.anInt4212 > Static39.anInt1070) {
						Static194.anIntArray338[Static39.anInt1070] = Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2462(local24.aClass92_1718) / 2;
						Static194.anIntArray337[Static39.anInt1070] = Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.anInt3279;
						Static194.anIntArray339[Static39.anInt1070] = Static23.anInt563;
						Static194.anIntArray336[Static39.anInt1070] = Static9.anInt3178;
						Static194.anIntArray340[Static39.anInt1070] = local24.anInt3573;
						Static194.anIntArray341[Static39.anInt1070] = local24.anInt3618;
						Static194.anIntArray342[Static39.anInt1070] = local24.anInt3621;
						Static194.aClass92Array30[Static39.anInt1070] = local24.aClass92_1718;
						Static39.anInt1070++;
					}
				}
				if (local24.anInt3599 > Static155.anInt2981) {
					Static19.method433(local24, local24.method2682() + 15);
					if (Static23.anInt563 > -1) {
						Static46.method3173(arg1 + Static23.anInt563 - 15, arg2 + (Static9.anInt3178 - 3), local24.anInt3612, 5, 65280);
						Static46.method3173(local24.anInt3612 + arg1 + Static23.anInt563 - 15, arg2 + Static9.anInt3178 + -3, 30 - local24.anInt3612, 5, 16711680);
					}
				}
				for (local75 = 0; local75 < 4; local75++) {
					if (local24.anIntArray308[local75] > Static155.anInt2981) {
						Static19.method433(local24, local24.method2682() / 2);
						if (Static23.anInt563 > -1) {
							if (local75 == 1) {
								Static9.anInt3178 -= 20;
							}
							if (local75 == 2) {
								Static23.anInt563 -= 15;
								Static9.anInt3178 -= 10;
							}
							if (local75 == 3) {
								Static23.anInt563 += 15;
								Static9.anInt3178 -= 10;
							}
							Static160.aClass1_Sub3_Sub1_Sub1Array19[local24.anIntArray310[local75]].method358(arg1 + Static23.anInt563 - 12, arg2 + -12 - -Static9.anInt3178);
							Static201.aClass1_Sub3_Sub1_Sub3_Sub1_5.method2451(Static49.method872(local24.anIntArray311[local75]), arg1 + Static23.anInt563 - 1, Static9.anInt3178 + (arg2 - -3), 16777215, 0);
						}
					}
				}
			}
		}
		for (@Pc(581) int local581 = 0; local581 < Static39.anInt1070; local581++) {
			local75 = Static194.anIntArray339[local581];
			local263 = Static194.anIntArray338[local581];
			@Pc(595) int local595 = Static194.anIntArray336[local581];
			@Pc(597) boolean local597 = true;
			local153 = Static194.anIntArray337[local581];
			while (local597) {
				local597 = false;
				for (@Pc(607) int local607 = 0; local607 < local581; local607++) {
					if (local595 + 2 > -Static194.anIntArray337[local607] + Static194.anIntArray336[local607] && Static194.anIntArray336[local607] + 2 > -local153 + local595 && Static194.anIntArray338[local607] + Static194.anIntArray339[local607] > -local263 + local75 && Static194.anIntArray339[local607] - Static194.anIntArray338[local607] < local263 + local75 && Static194.anIntArray336[local607] - Static194.anIntArray337[local607] < local595) {
						local597 = true;
						local595 = Static194.anIntArray336[local607] - Static194.anIntArray337[local607];
					}
				}
			}
			Static23.anInt563 = Static194.anIntArray339[local581];
			Static9.anInt3178 = Static194.anIntArray336[local581] = local595;
			@Pc(716) Class92 local716 = Static194.aClass92Array30[local581];
			if (Static117.anInt2497 == 0) {
				@Pc(723) int local723 = 16776960;
				if (Static194.anIntArray340[local581] < 6) {
					local723 = Static161.anIntArray295[Static194.anIntArray340[local581]];
				}
				if (Static194.anIntArray340[local581] == 6) {
					local723 = Static202.anInt4411 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static194.anIntArray340[local581] == 7) {
					local723 = Static202.anInt4411 % 20 >= 10 ? 65535 : 255;
				}
				if (Static194.anIntArray340[local581] == 8) {
					local723 = Static202.anInt4411 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(798) int local798;
				if (Static194.anIntArray340[local581] == 9) {
					local798 = 150 - Static194.anIntArray342[local581];
					if (local798 < 50) {
						local723 = local798 * 1280 + 16711680;
					} else if (local798 < 100) {
						local723 = 16776960 + 16384000 - local798 * 327680;
					} else if (local798 < 150) {
						local723 = (local798 - 100) * 5 + 65280;
					}
				}
				if (Static194.anIntArray340[local581] == 10) {
					local798 = 150 - Static194.anIntArray342[local581];
					if (local798 < 50) {
						local723 = local798 * 5 + 16711680;
					} else if (local798 < 100) {
						local723 = 33095935 - local798 * 327680;
					} else if (local798 < 150) {
						local723 = (local798 - 100) * 327680 + 500 + 255 - local798 * 5;
					}
				}
				if (Static194.anIntArray340[local581] == 11) {
					local798 = 150 - Static194.anIntArray342[local581];
					if (local798 < 50) {
						local723 = 16777215 - local798 * 327685;
					} else if (local798 < 100) {
						local723 = (local798 - 50) * 327685 + 65280;
					} else if (local798 < 150) {
						local723 = 49545215 - local798 * 327680;
					}
				}
				if (Static194.anIntArray341[local581] == 0) {
					Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2451(local716, arg1 + Static23.anInt563, Static9.anInt3178 + arg2, local723, 0);
				}
				if (Static194.anIntArray341[local581] == 1) {
					Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2446(local716, arg1 + Static23.anInt563, Static9.anInt3178 + arg2, local723, Static202.anInt4411);
				}
				if (Static194.anIntArray341[local581] == 2) {
					Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2453(local716, Static23.anInt563 + arg1, Static9.anInt3178 + arg2, local723, Static202.anInt4411);
				}
				if (Static194.anIntArray341[local581] == 3) {
					Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2460(local716, Static23.anInt563 + arg1, arg2 - -Static9.anInt3178, local723, Static202.anInt4411, 150 - Static194.anIntArray342[local581]);
				}
				if (Static194.anIntArray341[local581] == 4) {
					local798 = (150 - Static194.anIntArray342[local581]) * (Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2462(local716) + 100) / 150;
					Static46.method3155(arg1 + Static23.anInt563 - 50, arg2, Static23.anInt563 + arg1 + 50, arg3 + arg2);
					Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2443(local716, Static23.anInt563 + arg1 + 50 - local798, arg2 + Static9.anInt3178, local723, 0);
					Static46.method3170(arg1, arg2, arg1 + arg0, arg3 + arg2);
				}
				if (Static194.anIntArray341[local581] == 5) {
					local798 = 150 - Static194.anIntArray342[local581];
					Static46.method3155(arg1, Static9.anInt3178 + arg2 - Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.anInt3279 - 1, arg1 + arg0, arg2 + Static9.anInt3178 + 5);
					@Pc(1120) int local1120 = 0;
					if (local798 < 25) {
						local1120 = local798 - 25;
					} else if (local798 > 125) {
						local1120 = local798 - 125;
					}
					Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2451(local716, Static23.anInt563 + arg1, arg2 + Static9.anInt3178 - -local1120, local723, 0);
					Static46.method3170(arg1, arg2, arg0 + arg1, arg2 + arg3);
				}
			} else {
				Static127.aClass1_Sub3_Sub1_Sub3_Sub1_3.method2451(local716, arg1 + Static23.anInt563, arg2 + Static9.anInt3178, 16776960, 0);
			}
		}
	}

	@OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V")
	public static void method2680() {
		Static124.aClass47_19.method1276();
		Static106.aClass77_6.method2260();
		Static133.aClass77_8.method2260();
	}
}
