import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
	public static int anInt2102;

	@OriginalMember(owner = "client!ea", name = "f", descriptor = "Lclient!md;")
	public static Class217 aClass217_1;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "Lclient!fha;")
	public static final Class109 aClass109_11 = new Class109();

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
	public static int anInt2101 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BIII[II[I[[[B[IZZ[IIIIIZ[I)V")
	public static void method1714(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(10) boolean arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14, @OriginalArg(17) int[] arg15) {
		if (Static491.anInt8078 == -1) {
			return;
		}
		@Pc(13) int[] local13 = Static361.aClass95_9.Y();
		@Pc(17) int local17 = local13[0];
		@Pc(21) int local21 = local13[1];
		@Pc(25) int local25 = local13[2];
		@Pc(29) int local29 = local13[3];
		@Pc(31) int local31 = local25;
		@Pc(33) int local33 = local29;
		if (Static491.anInt8078 == 1) {
			local31 = (int) ((double) Static482.anInt7691 * (double) local25 / (double) Static158.anInt2827);
			local33 = (int) ((double) local29 * (double) Static482.anInt7691 / (double) Static158.anInt2827);
		}
		if (!Static116.aBoolean155) {
			if (Static491.anInt8078 == 1) {
				Static98.method1509();
			}
			@Pc(69) int local69 = arg5 - Static59.anInt1155;
			@Pc(73) int local73 = arg2 - Static98.anInt1848;
			@Pc(78) int local78 = arg11 - Static310.anInt5000;
			@Pc(100) int local100 = (int) ((double) local31 * ((double) local73 * Static190.aDouble20 + Static645.aDouble52 * (double) local69 + Static225.aDouble22 * (double) local78) / (double) arg3);
			@Pc(122) int local122 = (int) (((double) local69 * Static17.aDouble5 + Static643.aDouble54 * (double) local73 + (double) local78 * Static416.aDouble38) * (double) local33 / (double) arg3);
			@Pc(137) double local137 = Static384.aDouble33 * (double) local69 + Static191.aDouble21 * (double) local73 + (double) local78 * Static388.aDouble36;
			@Pc(144) int local144 = local100 + Static251.anInt4017 - Static126.anInt2202;
			@Pc(152) int local152 = Static54.anInt256 + local122 - Static473.anInt7597;
			@Pc(157) int local157 = local144 + Static325.anInt5186;
			@Pc(162) int local162 = local152 + Static482.anInt7691;
			if (local144 >= 0 && local152 >= 0 && Static61.anInt1162 >= local157 && local162 <= Static158.anInt2827 || Static491.anInt8078 == 2) {
				Static290.anInt4733 = local152;
				Static589.anInt9580 = local144;
				if (Static491.anInt8078 == 2) {
					Static251.aDouble25 = -local137;
				}
			} else if (local157 > 0 && local162 > 0 && Static61.anInt1162 > local144 && Static158.anInt2827 > local152) {
				@Pc(225) int local225 = local144 - Static251.anInt4017;
				@Pc(230) int local230 = local152 - Static54.anInt256;
				@Pc(232) int local232 = 0;
				@Pc(234) int local234 = 0;
				@Pc(236) int local236 = 0;
				@Pc(238) int local238 = 0;
				@Pc(240) double local240 = 0.0D;
				if (Static491.anInt8078 == 0) {
					local234 = local230;
					local232 = local225;
					local240 = Static251.aDouble25 + local137;
				} else if (Static491.anInt8078 == 1) {
					local238 = local230 / Static598.anInt9689;
					local236 = local225 / Static281.anInt4510;
					local232 = local236 * Static281.anInt4510;
					local234 = Static598.anInt9689 * local238;
					local240 = (double) (local232 * local225 + local230 * local234) * (Static251.aDouble25 + local137) / (double) (local225 * local225 + local230 * local230);
				}
				local240 = -local240;
				@Pc(301) int local301 = 0;
				@Pc(303) int local303 = 0;
				@Pc(305) int local305 = 0;
				@Pc(307) int local307 = 0;
				@Pc(309) int local309 = 0;
				@Pc(311) int local311 = 0;
				@Pc(316) int local316;
				@Pc(322) int local322;
				@Pc(318) int local318;
				@Pc(332) int local332;
				if (local232 < 0) {
					local316 = -local232;
					local318 = 0;
					local322 = local232 + Static61.anInt1162;
					if (Static491.anInt8078 == 1) {
						local309 = -local236;
						local305 = 0;
					}
					local332 = local316;
				} else {
					local322 = Static61.anInt1162 - local232;
					local316 = 0;
					if (Static491.anInt8078 == 1) {
						local305 = Static176.anInt3100 - local236;
						local309 = local236;
					}
					local332 = local232;
					local318 = local322;
				}
				@Pc(362) int local362;
				@Pc(367) int local367;
				@Pc(389) int local389;
				@Pc(369) int local369;
				@Pc(371) int local371;
				if (local234 >= 0) {
					local362 = 0;
					local367 = Static158.anInt2827 - local234;
					local369 = local234;
					local371 = 0;
					if (Static491.anInt8078 == 1) {
						local307 = 0;
						local301 = Static174.anInt3080 - local238;
						local303 = local238;
						local311 = local301;
					}
					local389 = local367;
				} else {
					local389 = 0;
					local367 = local234 + Static158.anInt2827;
					local362 = -local234;
					local369 = local362;
					if (Static491.anInt8078 == 1) {
						local301 = 0;
						local303 = -local238;
						local311 = local238 + Static174.anInt3080;
						local307 = local303;
					}
					local371 = local362;
				}
				@Pc(423) Class171 local423 = Static3.aClass94_7.aClass171_3;
				@Pc(437) int local437;
				for (@Pc(428) Class13_Sub6 local428 = (Class13_Sub6) local423.method3745(); local428 != null; local428 = (Class13_Sub6) local423.method3744()) {
					@Pc(433) Class13_Sub2[] local433 = local428.aClass13_Sub2Array1;
					@Pc(435) boolean local435 = true;
					for (local437 = 0; local437 < local433.length; local437++) {
						@Pc(443) Class13_Sub2 local443 = local433[local437];
						@Pc(446) int local446 = local443.anInt603;
						@Pc(449) int local449 = local443.anInt604;
						@Pc(452) int local452 = local443.anInt605;
						@Pc(455) int local455 = local443.anInt607;
						@Pc(462) int local462;
						local443.anInt605 = local462 = local452 - local232;
						@Pc(470) int local470;
						local443.anInt603 = local470 = local446 - local232;
						@Pc(478) int local478;
						local443.anInt604 = local478 = local449 - local234;
						@Pc(482) int local482 = local443.anInt606;
						@Pc(489) int local489;
						local443.anInt607 = local489 = local455 - local234;
						if (local435) {
							@Pc(501) int local501 = (local470 < local462 ? local470 : local462) - local482;
							if (Static61.anInt1162 >= local501) {
								@Pc(518) int local518 = (local489 > local478 ? local478 : local489) - local482;
								if (Static158.anInt2827 >= local518) {
									@Pc(534) int local534 = local482 + (local470 < local462 ? local462 : local470);
									if (local534 >= 0) {
										@Pc(549) int local549 = local482 + (local478 < local489 ? local489 : local478);
										if (local549 >= 0) {
											local435 = false;
										}
									}
								}
							}
						}
					}
					if (local435) {
						local428.method8394();
						Static448.method6100(local428);
					}
				}
				if (Static491.anInt8078 == 0) {
					Static361.aClass95_9.method7010(Static151.anInterface4_1);
				}
				Static361.aClass95_9.F(-local232, -local234);
				Static361.aClass95_9.b(local316, local362, local322, local367, local240);
				Static242.method3404(Static251.aDouble25 + local240);
				Static462.aDouble40 = local240 + Static251.aDouble25;
				if (Static491.anInt8078 == 1) {
					Static38.anInt772 = local21 - local234 - Static473.anInt7597;
					Static280.anInt4506 = local31;
					Static515.anInt8575 = local33;
					Static136.anInt9996 = local17 - local232 - Static126.anInt2202;
					Static361.aClass95_9.DA(Static136.anInt9996, Static38.anInt772, Static280.anInt4506, Static515.anInt8575);
				} else {
					Static136.anInt9996 = local17 + Static251.anInt4017 - Static126.anInt2202 - local232;
					Static38.anInt772 = Static54.anInt256 + local21 - local234 - Static473.anInt7597;
					Static515.anInt8575 = local33;
					Static280.anInt4506 = local31;
					Static361.aClass95_9.DA(Static136.anInt9996, Static38.anInt772, Static280.anInt4506, Static515.anInt8575);
				}
				Static496.method6875(Static3.aClass94_7);
				if (local369 > 0) {
					Static361.aClass95_9.KA(0, local389, Static61.anInt1162, local389 + local369);
					Static361.aClass95_9.ya();
					Static361.aClass95_9.GA(Static36.anInt769);
					Static362.method4887(arg13, arg5, arg2, arg11, arg7, arg6, arg8, arg15, arg4, arg10, arg14, arg0, arg1, arg12, arg9, arg3, 1, false);
				}
				if (local332 > 0) {
					Static361.aClass95_9.KA(local318, local371, local318 + local332, local367 + local371);
					Static361.aClass95_9.ya();
					Static361.aClass95_9.GA(Static36.anInt769);
					Static362.method4887(arg13, arg5, arg2, arg11, arg7, arg6, arg8, arg15, arg4, arg10, arg14, arg0, arg1, arg12, arg9, arg3, 1, false);
				}
				Static361.aClass95_9.la();
				Static519.method7256();
				if (Static491.anInt8078 == 0) {
					Static361.aClass95_9.method7000();
				}
				Static473.anInt7597 += local234;
				Static126.anInt2202 += local232;
				Static251.aDouble25 += local240;
				Static589.anInt9580 = local100 + Static251.anInt4017 - Static126.anInt2202;
				Static290.anInt4733 = local122 + Static54.anInt256 - Static473.anInt7597;
				if (Static491.anInt8078 == 1) {
					Static233.anInt3794 += local238;
					Static472.anInt7535 += local236;
					for (@Pc(790) int local790 = 0; local790 < Static174.anInt3080; local790++) {
						@Pc(802) int local802 = Static236.method3208(local790 + Static233.anInt3794, Static174.anInt3080) * Static176.anInt3100;
						for (local437 = 0; local437 < Static176.anInt3100; local437++) {
							@Pc(816) int local816 = local802 + Static236.method3208(local437 + Static472.anInt7535, Static176.anInt3100);
							@Pc(856) boolean local856 = local790 >= local301 && local301 + local303 > local790 || local790 >= local307 && local790 < local307 + local311 && local437 >= local305 && local309 + local305 > local437;
							Static319.anInterface4Array1[local816].method8301(Static281.anInt4510 * local437, local790 * Static598.anInt9689, Static281.anInt4510, Static598.anInt9689, local856);
						}
					}
				}
			} else {
				Static116.aBoolean155 = true;
			}
		}
		if (Static116.aBoolean155) {
			Static126.anInt2202 = 0;
			Static59.anInt1155 = arg5;
			Static473.anInt7597 = 0;
			Static310.anInt5000 = arg11;
			Static98.anInt1848 = arg2;
			Static251.aDouble25 = 0.0D;
			Static589.anInt9580 = Static251.anInt4017;
			Static290.anInt4733 = Static54.anInt256;
			if (Static491.anInt8078 == 0) {
				Static361.aClass95_9.method7010(Static151.anInterface4_1);
			}
			Static361.aClass95_9.la();
			Static361.aClass95_9.ya();
			Static361.aClass95_9.GA(Static36.anInt769);
			Static372.aClass177_5.method7881(Static59.anInt1155, Static98.anInt1848, Static310.anInt5000, Static631.anInt9607, Static322.anInt5121, Static257.anInt4066);
			Static361.aClass95_9.method6941(Static372.aClass177_5);
			if (Static491.anInt8078 == 1) {
				Static515.anInt8575 = local33;
				Static280.anInt4506 = local31;
				Static136.anInt9996 = local17;
				Static38.anInt772 = local21;
				Static361.aClass95_9.DA(Static136.anInt9996, Static38.anInt772, Static280.anInt4506, Static515.anInt8575);
			} else {
				Static38.anInt772 = local21 + Static54.anInt256;
				Static280.anInt4506 = local31;
				Static136.anInt9996 = local17 + Static251.anInt4017;
				Static515.anInt8575 = local33;
				Static361.aClass95_9.DA(Static136.anInt9996, Static38.anInt772, Static280.anInt4506, Static515.anInt8575);
			}
			Static462.aDouble40 = 0.0D;
			Static3.aClass94_7.method1859();
			Static496.method6875(Static3.aClass94_7);
			Static362.method4887(arg13, arg5, arg2, arg11, arg7, arg6, arg8, arg15, arg4, arg10, arg14, arg0, arg1, arg12, arg9, arg3, 1, false);
			Static519.method7256();
			Static116.aBoolean155 = false;
			if (Static491.anInt8078 == 0) {
				Static361.aClass95_9.method7000();
			}
			if (Static491.anInt8078 == 1) {
				Static502.method2510();
			}
		}
		if (Static491.anInt8078 == 0) {
			Static151.anInterface4_1.method8302(Static589.anInt9580, Static290.anInt4733, Static325.anInt5186, Static482.anInt7691, 0, 0);
		}
		Static613.anInt9883++;
		Static242.method3404(Static251.aDouble25);
		Static141.aDouble17 = Static251.aDouble25;
		if (Static491.anInt8078 == 0 || Static491.anInt8078 == 2) {
			if (Static491.anInt8078 == 2) {
				Static361.aClass95_9.GA(Static36.anInt769);
				Static361.aClass95_9.ya();
			}
			Static560.anInt9129 = local21 + Static54.anInt256 - Static290.anInt4733 - Static473.anInt7597;
			Static177.anInt8963 = local33;
			Static237.anInt3889 = Static251.anInt4017 + local17 - Static589.anInt9580 - Static126.anInt2202;
			Static143.anInt2618 = local31;
			Static361.aClass95_9.DA(Static237.anInt3889, Static560.anInt9129, Static143.anInt2618, Static177.anInt8963);
		} else if (Static491.anInt8078 == 1) {
			Static560.anInt9129 = local21 - Static473.anInt7597;
			Static143.anInt2618 = local31;
			Static177.anInt8963 = local33;
			Static237.anInt3889 = local17 - Static126.anInt2202;
			Static361.aClass95_9.DA(Static237.anInt3889, Static560.anInt9129, Static143.anInt2618, Static177.anInt8963);
			Static361.aClass95_9.KA(Static589.anInt9580, Static290.anInt4733, Static589.anInt9580 + Static325.anInt5186, Static482.anInt7691 + Static290.anInt4733);
		}
		Static362.method4887(arg13, arg5, arg2, arg11, arg7, arg6, arg8, arg15, arg4, arg10, arg14, arg0, arg1, arg12, arg9, arg3, Static491.anInt8078 == 2 ? 0 : 2, Static491.anInt8078 == 1);
		Static361.aClass95_9.la();
		Static361.aClass95_9.DA(local17, local21, local25, local29);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BC)C")
	public static char method1715(@OriginalArg(1) char arg0) {
		if (arg0 == ' ' || arg0 == ' ' || arg0 == '_' || arg0 == '-') {
			return '_';
		} else if (arg0 == '[' || arg0 == ']' || arg0 == '#') {
			return arg0;
		} else if (arg0 == 'à' || arg0 == 'á' || arg0 == 'â' || arg0 == 'ä' || arg0 == 'ã' || arg0 == 'À' || arg0 == 'Á' || arg0 == 'Â' || arg0 == 'Ä' || arg0 == 'Ã') {
			return 'a';
		} else if (arg0 == 'è' || arg0 == 'é' || arg0 == 'ê' || arg0 == 'ë' || arg0 == 'È' || arg0 == 'É' || arg0 == 'Ê' || arg0 == 'Ë') {
			return 'e';
		} else if (arg0 == 'í' || arg0 == 'î' || arg0 == 'ï' || arg0 == 'Í' || arg0 == 'Î' || arg0 == 'Ï') {
			return 'i';
		} else if (arg0 == 'ò' || arg0 == 'ó' || arg0 == 'ô' || arg0 == 'ö' || arg0 == 'õ' || arg0 == 'Ò' || arg0 == 'Ó' || arg0 == 'Ô' || arg0 == 'Ö' || arg0 == 'Õ') {
			return 'o';
		} else if (arg0 == 'ù' || arg0 == 'ú' || arg0 == 'û' || arg0 == 'ü' || arg0 == 'Ù' || arg0 == 'Ú' || arg0 == 'Û' || arg0 == 'Ü') {
			return 'u';
		} else if (arg0 == 'ç' || arg0 == 'Ç') {
			return 'c';
		} else if (arg0 == 'ÿ' || arg0 == 'Ÿ') {
			return 'y';
		} else if (arg0 == 'ñ' || arg0 == 'Ñ') {
			return 'n';
		} else if (arg0 == 'ß') {
			return 'b';
		} else {
			return Character.toLowerCase(arg0);
		}
	}
}
