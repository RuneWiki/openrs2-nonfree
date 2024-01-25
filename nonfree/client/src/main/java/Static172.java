import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static172 {

	@OriginalMember(owner = "client!il", name = "a", descriptor = "Lclient!qg;")
	public static Class87 aClass87_11;

	@OriginalMember(owner = "client!il", name = "g", descriptor = "[I")
	public static int[] anIntArray217;

	@OriginalMember(owner = "client!il", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!il", name = "c", descriptor = "Lclient!tq;")
	public static final Class238 aClass238_16 = new Class238(14, 3);

	@OriginalMember(owner = "client!il", name = "h", descriptor = "I")
	public static int anInt3437 = 0;

	@OriginalMember(owner = "client!il", name = "n", descriptor = "Lclient!fe;")
	public static final Class74 aClass74_18 = new Class74(512);

	@OriginalMember(owner = "client!il", name = "o", descriptor = "I")
	public static int anInt3442 = 0;

	@OriginalMember(owner = "client!il", name = "p", descriptor = "[C")
	public static final char[] aCharArray2 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
	public static void method2856() {
		if (Static293.aBoolean13) {
			return;
		}
		if (Static291.aClass28_Sub1_1.aBoolean85) {
			Static265.aFloat51 = (int) Static265.aFloat51 - 65 & 0xFFFFFF80;
		} else {
			Static29.aFloat4 += (-Static29.aFloat4 - 24.0F) / 2.0F;
		}
		Static293.aBoolean13 = true;
		Static65.aBoolean151 = true;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method2858(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(8) int arg5, @OriginalArg(9) int arg6) {
		@Pc(7) Class6_Sub23 local7 = null;
		for (@Pc(12) Class6_Sub23 local12 = (Class6_Sub23) Static428.aClass244_45.method5976(); local12 != null; local12 = (Class6_Sub23) Static428.aClass244_45.method5964()) {
			if (arg6 == local12.anInt4211 && local12.anInt4218 == arg3 && arg0 == local12.anInt4215 && arg1 == local12.anInt4219) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class6_Sub23();
			local7.anInt4215 = arg0;
			local7.anInt4219 = arg1;
			local7.anInt4218 = arg3;
			local7.anInt4211 = arg6;
			if (arg3 >= 0 && arg0 >= 0 && arg3 < Static181.anInt3574 && arg0 < Static117.anInt2450) {
				Static184.method2977(local7);
			}
			Static428.aClass244_45.method5966(local7);
		}
		local7.anInt4208 = -1;
		local7.anInt4214 = arg5;
		local7.anInt4210 = arg2;
		local7.anInt4216 = arg4;
		local7.anInt4209 = 0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!md;IB)V")
	public static void method2859(@OriginalArg(0) Class6_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(20) boolean local20 = arg0.method3803(1) == 1;
		if (local20) {
			Static71.anIntArray110[Static438.anInt7768++] = arg1;
		}
		@Pc(35) int local35 = arg0.method3803(2);
		@Pc(39) Class3_Sub2_Sub1_Sub2 local39 = Static374.aClass3_Sub2_Sub1_Sub2Array1[arg1];
		if (local35 != 0) {
			@Pc(151) int local151;
			@Pc(156) int local156;
			@Pc(161) int local161;
			if (local35 == 1) {
				local151 = arg0.method3803(3);
				local156 = local39.anIntArray458[0];
				local161 = local39.anIntArray459[0];
				if (local151 == 0) {
					local156--;
					local161--;
				} else if (local151 == 1) {
					local161--;
				} else if (local151 == 2) {
					local156++;
					local161--;
				} else if (local151 == 3) {
					local156--;
				} else if (local151 == 4) {
					local156++;
				} else if (local151 == 5) {
					local161++;
					local156--;
				} else if (local151 == 6) {
					local161++;
				} else if (local151 == 7) {
					local156++;
					local161++;
				}
				if (local20) {
					local39.aBoolean423 = true;
					local39.anInt6645 = local156;
					local39.anInt6640 = local161;
				} else {
					local39.method5535(Static340.aByteArray74[arg1], local156, local161);
				}
			} else if (local35 == 2) {
				local151 = arg0.method3803(4);
				local156 = local39.anIntArray458[0];
				local161 = local39.anIntArray459[0];
				if (local151 == 0) {
					local156 -= 2;
					local161 -= 2;
				} else if (local151 == 1) {
					local161 -= 2;
					local156--;
				} else if (local151 == 2) {
					local161 -= 2;
				} else if (local151 == 3) {
					local161 -= 2;
					local156++;
				} else if (local151 == 4) {
					local161 -= 2;
					local156 += 2;
				} else if (local151 == 5) {
					local156 -= 2;
					local161--;
				} else if (local151 == 6) {
					local156 += 2;
					local161--;
				} else if (local151 == 7) {
					local156 -= 2;
				} else if (local151 == 8) {
					local156 += 2;
				} else if (local151 == 9) {
					local161++;
					local156 -= 2;
				} else if (local151 == 10) {
					local156 += 2;
					local161++;
				} else if (local151 == 11) {
					local161 += 2;
					local156 -= 2;
				} else if (local151 == 12) {
					local156--;
					local161 += 2;
				} else if (local151 == 13) {
					local161 += 2;
				} else if (local151 == 14) {
					local156++;
					local161 += 2;
				} else if (local151 == 15) {
					local156 += 2;
					local161 += 2;
				}
				if (local20) {
					local39.anInt6645 = local156;
					local39.anInt6640 = local161;
					local39.aBoolean423 = true;
				} else {
					local39.method5535(Static340.aByteArray74[arg1], local156, local161);
				}
			} else {
				local151 = arg0.method3803(1);
				@Pc(421) int local421;
				@Pc(431) int local431;
				@Pc(442) int local442;
				@Pc(449) int local449;
				if (local151 == 0) {
					local156 = arg0.method3803(12);
					local161 = local156 >> 10;
					local421 = local156 >> 5 & 0x1F;
					if (local421 > 15) {
						local421 -= 32;
					}
					local431 = local156 & 0x1F;
					if (local431 > 15) {
						local431 -= 32;
					}
					local442 = local39.anIntArray458[0] + local421;
					local449 = local431 + local39.anIntArray459[0];
					if (local20) {
						local39.aBoolean423 = true;
						local39.anInt6645 = local442;
						local39.anInt6640 = local449;
					} else {
						local39.method5535(Static340.aByteArray74[arg1], local442, local449);
					}
					local39.aByte103 = (byte) (local161 + local39.aByte103 & 0x3);
					if (Static4.anInt7923 == arg1) {
						Static388.anInt6870 = local39.aByte103;
					}
				} else {
					local156 = arg0.method3803(30);
					local161 = local156 >> 28;
					local421 = local156 >> 14 & 0x3FFF;
					local431 = local156 & 0x3FFF;
					local442 = (local421 + Static2.anInt6396 + local39.anIntArray458[0] & 0x3FFF) - Static2.anInt6396;
					local449 = (local431 + Static348.anInt6273 + local39.anIntArray459[0] & 0x3FFF) - Static348.anInt6273;
					if (local20) {
						local39.anInt6645 = local442;
						local39.anInt6640 = local449;
						local39.aBoolean423 = true;
					} else {
						local39.method5535(Static340.aByteArray74[arg1], local442, local449);
					}
					local39.aByte103 = (byte) (local161 + local39.aByte103 & 0x3);
					if (arg1 == Static4.anInt7923) {
						Static388.anInt6870 = local39.aByte103;
					}
				}
			}
		} else if (local20) {
			local39.aBoolean423 = false;
		} else if (Static4.anInt7923 == arg1) {
			throw new RuntimeException("s:lr");
		} else {
			@Pc(67) Class216 local67 = Static373.aClass216Array1[arg1] = new Class216();
			local67.anInt6270 = (Static2.anInt6396 + local39.anIntArray458[0] >> 6 << 14) + (local39.aByte103 << 28) + (Static348.anInt6273 + local39.anIntArray459[0] >> 6);
			if (local39.anInt6626 == -1) {
				local67.anInt6269 = local39.aClass214_7.method4965();
			} else {
				local67.anInt6269 = local39.anInt6626;
			}
			local67.aBoolean400 = local39.aBoolean422;
			local67.anInt6266 = local39.anInt6569;
			if (local39.anInt6639 > 0) {
				Static69.method1415(local39);
			}
			Static374.aClass3_Sub2_Sub1_Sub2Array1[arg1] = null;
			if (arg0.method3803(1) != 0) {
				Static380.method5653(arg0, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V")
	public static void method2860() {
		Static437.method6328(Static240.aClass239_8);
		Static414.anInt7039++;
		if (Static14.aBoolean19 && Static335.aBoolean364) {
			@Pc(31) int local31 = Static186.aClass50_1.method1436();
			@Pc(35) int local35 = Static186.aClass50_1.method1446();
			local35 -= Static263.anInt4753;
			local31 -= Static428.anInt7618;
			if (Static312.anInt5429 > local31) {
				local31 = Static312.anInt5429;
			}
			if (Static97.aClass239_3.anInt6898 + Static312.anInt5429 < Static240.aClass239_8.anInt6898 + local31) {
				local31 = Static97.aClass239_3.anInt6898 + Static312.anInt5429 - Static240.aClass239_8.anInt6898;
			}
			if (local35 < Static97.anInt2205) {
				local35 = Static97.anInt2205;
			}
			if (Static97.aClass239_3.anInt6899 + Static97.anInt2205 < Static240.aClass239_8.anInt6899 + local35) {
				local35 = Static97.anInt2205 + Static97.aClass239_3.anInt6899 - Static240.aClass239_8.anInt6899;
			}
			@Pc(101) int local101 = Static97.aClass239_3.anInt6931 + local31 - Static312.anInt5429;
			@Pc(109) int local109 = Static97.aClass239_3.anInt6887 + local35 - Static97.anInt2205;
			@Pc(124) Class6_Sub42 local124;
			if (Static186.aClass50_1.method1448()) {
				if (Static414.anInt7039 > Static240.aClass239_8.anInt6917) {
					@Pc(198) int local198 = local31 - Static329.anInt5687;
					@Pc(203) int local203 = local35 - Static272.anInt4879;
					if (Static240.aClass239_8.anInt6948 < local198 || -Static240.aClass239_8.anInt6948 > local198 || local203 > Static240.aClass239_8.anInt6948 || local203 < -Static240.aClass239_8.anInt6948) {
						Static145.aBoolean189 = true;
					}
				}
				if (Static240.aClass239_8.anObjectArray26 != null && Static145.aBoolean189) {
					local124 = new Class6_Sub42();
					local124.anInt7474 = local109;
					local124.aClass239_13 = Static240.aClass239_8;
					local124.anObjectArray36 = Static240.aClass239_8.anObjectArray26;
					local124.anInt7471 = local101;
					Static166.method2744(local124);
				}
			} else {
				if (Static145.aBoolean189) {
					Static54.method1224();
					if (Static240.aClass239_8.anObjectArray34 != null) {
						local124 = new Class6_Sub42();
						local124.anObjectArray36 = Static240.aClass239_8.anObjectArray34;
						local124.anInt7471 = local101;
						local124.aClass239_13 = Static240.aClass239_8;
						local124.anInt7474 = local109;
						local124.aClass239_14 = Static158.aClass239_5;
						Static166.method2744(local124);
					}
					if (Static158.aClass239_5 != null && Static50.method1142(Static240.aClass239_8) != null) {
						Static193.method3054(Static240.aClass239_8, Static158.aClass239_5);
					}
				} else if ((Static14.anInt440 == 1 || Static141.method1131()) && Static151.anInt3129 > 2) {
					Static437.method6337(Static263.anInt4753 + Static272.anInt4879, Static428.anInt7618 - -Static329.anInt5687);
				} else if (Static72.method1459()) {
					Static437.method6337(Static263.anInt4753 + Static272.anInt4879, Static428.anInt7618 - -Static329.anInt5687);
				}
				Static240.aClass239_8 = null;
			}
		} else if (Static414.anInt7039 > 1) {
			Static240.aClass239_8 = null;
		}
	}
}
