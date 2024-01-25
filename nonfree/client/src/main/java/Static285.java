import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
	public static int anInt5782;

	@OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
	public static int anInt5783;

	@OriginalMember(owner = "client!sg", name = "u", descriptor = "F")
	public static float aFloat75;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Lclient!on;")
	public static Class146 aClass146_14 = null;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "Z")
	public static boolean aBoolean515 = true;

	@OriginalMember(owner = "client!sg", name = "r", descriptor = "[Lclient!ne;")
	public static final Class134[] aClass134Array1 = new Class134[50];

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IBI[B)I")
	public static int method5105(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(9) int local9 = arg1; local9 < arg0; local9++) {
			local7 = Class2_Sub15.anIntArray146[(local7 ^ arg2[local9]) & 0xFF] ^ local7 >>> 8;
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(JI)V")
	public static void method5106(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5289 + Static97.anInt6854;
		@Pc(16) int local16 = Static79.anInt1747 + Static41.aClass62_Sub1_Sub2_Sub2_2.anInt5280;
		if (Static321.anInt6465 - local11 < -500 || Static321.anInt6465 - local11 > 500 || Static97.anInt6858 - local16 < -500 || Static97.anInt6858 - local16 > 500) {
			Static97.anInt6858 = local16;
			Static321.anInt6465 = local11;
		}
		@Pc(65) int local65;
		if (local11 != Static321.anInt6465) {
			@Pc(57) int local57 = local11 - Static321.anInt6465;
			local65 = (int) (arg0 * (long) local57 / 320L);
			if (local57 <= 0) {
				if (local65 == 0) {
					local65 = -1;
				} else if (local65 < local57) {
					local65 = local57;
				}
			} else if (local65 == 0) {
				local65 = 1;
			} else if (local57 < local65) {
				local65 = local57;
			}
			Static321.anInt6465 += local65;
		}
		if (local16 != Static97.anInt6858) {
			local65 = local16 - Static97.anInt6858;
			@Pc(126) int local126 = (int) ((long) local65 * arg0 / 320L);
			if (local65 <= 0) {
				if (local126 == 0) {
					local126 = -1;
				} else if (local65 > local126) {
					local126 = local65;
				}
			} else if (local126 == 0) {
				local126 = 1;
			} else if (local65 < local126) {
				local126 = local65;
			}
			Static97.anInt6858 += local126;
		}
		if (!Static234.aBoolean412) {
			Static92.aFloat28 += Static148.aFloat41 * (float) arg0 / 6.0F;
			Static331.aFloat43 += Static100.aFloat37 * (float) arg0 / 6.0F;
		}
		Static349.method5958();
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!gr;Z)V")
	public static void method5107(@OriginalArg(0) Class2_Sub20 arg0) {
		if (Static275.aClass8ArrayArrayArray4 == null) {
			return;
		}
		@Pc(8) Interface9 local8 = null;
		if (arg0.anInt2462 == 0) {
			local8 = (Interface9) Static230.method4018(arg0.anInt2461, arg0.anInt2464, arg0.anInt2468);
		}
		if (arg0.anInt2462 == 1) {
			local8 = (Interface9) Static226.method3034(arg0.anInt2461, arg0.anInt2464, arg0.anInt2468);
		}
		if (arg0.anInt2462 == 2) {
			local8 = (Interface9) Static280.method5066(arg0.anInt2461, arg0.anInt2464, arg0.anInt2468, vl.class);
		}
		if (arg0.anInt2462 == 3) {
			local8 = (Interface9) Static104.method4927(arg0.anInt2461, arg0.anInt2464, arg0.anInt2468);
		}
		if (local8 == null) {
			arg0.anInt2472 = 0;
			arg0.anInt2460 = 0;
			arg0.anInt2458 = -1;
		} else {
			arg0.anInt2458 = local8.method5583();
			arg0.anInt2472 = local8.method5581();
			arg0.anInt2460 = local8.method5580();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILclient!bj;IZLclient!bj;)I")
	public static int method5110(@OriginalArg(1) Class20_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) Class20_Sub1 arg3) {
		@Pc(14) int local14;
		@Pc(17) int local17;
		if (arg1 == 1) {
			local14 = arg0.anInt497;
			local17 = arg3.anInt497;
			if (!arg2) {
				if (local17 == -1) {
					local17 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local14 - local17;
		} else if (arg1 == 2) {
			return Static146.method2859(arg0.method733().aString34, arg3.method733().aString34, Static21.anInt455);
		} else if (arg1 == 3) {
			if (arg0.aString9.equals("-")) {
				if (arg3.aString9.equals("-")) {
					return 0;
				} else if (arg2) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString9.equals("-")) {
				return arg2 ? 1 : -1;
			} else {
				return Static146.method2859(arg0.aString9, arg3.aString9, Static21.anInt455);
			}
		} else if (arg1 == 4) {
			if (arg0.method729()) {
				return arg3.method729() ? 0 : 1;
			} else if (arg3.method729()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 5) {
			if (arg0.method724()) {
				return arg3.method724() ? 0 : 1;
			} else if (arg3.method724()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 6) {
			if (arg0.method725()) {
				return arg3.method725() ? 0 : 1;
			} else if (arg3.method725()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 7) {
			if (arg0.method726()) {
				return arg3.method726() ? 0 : 1;
			} else if (arg3.method726()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg1 == 8) {
			local14 = arg0.anInt506;
			local17 = arg3.anInt506;
			if (arg2) {
				if (local14 == 1000) {
					local14 = -1;
				}
				if (local17 == 1000) {
					local17 = -1;
				}
			} else {
				if (local14 == -1) {
					local14 = 1000;
				}
				if (local17 == -1) {
					local17 = 1000;
				}
			}
			return local14 - local17;
		} else {
			return arg0.anInt500 - arg3.anInt500;
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Z)V")
	public static void method5111() {
		@Pc(12) int local12;
		@Pc(23) int local23;
		@Pc(31) int local31;
		@Pc(37) int local37;
		@Pc(44) int local44;
		@Pc(58) int local58;
		@Pc(64) int local64;
		@Pc(68) int local68;
		@Pc(72) int local72;
		@Pc(76) int local76;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(80) int local80;
		@Pc(170) Class62_Sub1_Sub3 local170;
		if (Static48.anInt1097 == 181) {
			local12 = Static269.aClass2_Sub10_Sub1_3.method4421();
			local23 = Static179.anInt3567 * 2 + (local12 >> 4 & 0xF);
			local31 = Static193.anInt3777 * 2 + (local12 & 0xF);
			local37 = Static269.aClass2_Sub10_Sub1_3.method4436() + local23;
			local44 = local31 + Static269.aClass2_Sub10_Sub1_3.method4436();
			local48 = Static269.aClass2_Sub10_Sub1_3.method4460();
			local52 = Static269.aClass2_Sub10_Sub1_3.method4464();
			local58 = Static269.aClass2_Sub10_Sub1_3.method4421() * 4;
			local64 = Static269.aClass2_Sub10_Sub1_3.method4421() * 4;
			local68 = Static269.aClass2_Sub10_Sub1_3.method4464();
			local72 = Static269.aClass2_Sub10_Sub1_3.method4464();
			local76 = Static269.aClass2_Sub10_Sub1_3.method4421();
			local80 = Static269.aClass2_Sub10_Sub1_3.method4421();
			if (local76 == 255) {
				local76 = -1;
			}
			if (local23 >= 0 && local31 >= 0 && local23 < Static95.anInt6381 * 2 && local31 < Static95.anInt6381 * 2 && local37 >= 0 && local44 >= 0 && Static237.anInt4532 * 2 > local37 && local44 < Static237.anInt4532 * 2 && local52 != 65535) {
				local23 = local23 * 64;
				local31 = local31 * 64;
				local44 *= 64;
				local37 = local37 * 64;
				local170 = new Class62_Sub1_Sub3(local52, Static182.anInt3603, local23, local31, Static138.method2745(Static182.anInt3603, local23, local31) - local58, local68 - -Static212.anInt4090, local72 + Static212.anInt4090, local76, local80, local48, local64);
				local170.method2614(Static138.method2745(Static182.anInt3603, local37, local44) - local64, Static212.anInt4090 + local68, local44, local37);
				Static260.aClass216_40.method5995(new Class2_Sub11_Sub11(local170));
			}
		} else if (Static48.anInt1097 == 38) {
			local12 = Static269.aClass2_Sub10_Sub1_3.method4437();
			local23 = Static269.aClass2_Sub10_Sub1_3.method4421();
			local31 = Static179.anInt3567 + (local23 >> 4 & 0x7);
			local37 = Static193.anInt3777 + (local23 & 0x7);
			local44 = Static269.aClass2_Sub10_Sub1_3.method4403();
			local48 = local44 >> 2;
			local52 = local44 & 0x3;
			local58 = Static166.anIntArray283[local48];
			if (local31 >= 0 && local37 >= 0 && local31 < Static95.anInt6381 && Static237.anInt4532 > local37) {
				Static37.method861(local37, local48, local31, local52, -1, Static182.anInt3603, local58, 0, local12);
			}
		} else if (Static48.anInt1097 == 102) {
			local12 = Static269.aClass2_Sub10_Sub1_3.method4413();
			if (local12 == 65535) {
				local12 = -1;
			}
			local23 = Static269.aClass2_Sub10_Sub1_3.method4403();
			local31 = (local23 >> 4 & 0x7) + Static179.anInt3567;
			local37 = Static193.anInt3777 + (local23 & 0x7);
			local44 = Static269.aClass2_Sub10_Sub1_3.method4403();
			local48 = local44 >> 2;
			local52 = local44 & 0x3;
			local58 = Static166.anIntArray283[local48];
			Static234.method4055(local52, local12, local31, local37, local58, Static182.anInt3603, local48);
		} else if (Static48.anInt1097 == 199) {
			local12 = Static269.aClass2_Sub10_Sub1_3.method4432();
			local23 = Static269.aClass2_Sub10_Sub1_3.method4403();
			local31 = Static179.anInt3567 + (local23 >> 4 & 0x7);
			local37 = Static193.anInt3777 + (local23 & 0x7);
			local44 = Static269.aClass2_Sub10_Sub1_3.method4437();
			local48 = Static269.aClass2_Sub10_Sub1_3.method4413();
			if (local31 >= 0 && local37 >= 0 && Static95.anInt6381 > local31 && local37 < Static237.anInt4532 && Static40.anInt797 != local12) {
				Static278.method5044(new Class2_Sub4(local48, local44), Static182.anInt3603, local37, local31);
				Static304.method5349(local31, local37, Static182.anInt3603);
			}
		} else if (Static48.anInt1097 == 203) {
			local12 = Static269.aClass2_Sub10_Sub1_3.method4421();
			local23 = (local12 >> 4 & 0x7) + Static179.anInt3567;
			local31 = Static193.anInt3777 + (local12 & 0x7);
			local37 = local23 + Static269.aClass2_Sub10_Sub1_3.method4436();
			local44 = Static269.aClass2_Sub10_Sub1_3.method4436() + local31;
			local48 = Static269.aClass2_Sub10_Sub1_3.method4460();
			local52 = Static269.aClass2_Sub10_Sub1_3.method4464();
			local58 = Static269.aClass2_Sub10_Sub1_3.method4421() * 4;
			local64 = Static269.aClass2_Sub10_Sub1_3.method4421() * 4;
			local68 = Static269.aClass2_Sub10_Sub1_3.method4464();
			local72 = Static269.aClass2_Sub10_Sub1_3.method4464();
			local76 = Static269.aClass2_Sub10_Sub1_3.method4421();
			if (local76 == 255) {
				local76 = -1;
			}
			local80 = Static269.aClass2_Sub10_Sub1_3.method4421();
			if (local23 >= 0 && local31 >= 0 && local23 < Static95.anInt6381 && local31 < Static237.anInt4532 && local37 >= 0 && local44 >= 0 && local37 < Static95.anInt6381 && local44 < Static237.anInt4532 && local52 != 65535) {
				local44 = local44 * 128 + 64;
				local37 = local37 * 128 + 64;
				local31 = local31 * 128 + 64;
				local23 = local23 * 128 + 64;
				local170 = new Class62_Sub1_Sub3(local52, Static182.anInt3603, local23, local31, Static138.method2745(Static182.anInt3603, local23, local31) - local58, Static212.anInt4090 + local68, local72 + Static212.anInt4090, local76, local80, local48, local64);
				local170.method2614(Static138.method2745(Static182.anInt3603, local37, local44) - local64, local68 + Static212.anInt4090, local44, local37);
				Static260.aClass216_40.method5995(new Class2_Sub11_Sub11(local170));
			}
		} else if (Static48.anInt1097 == 15) {
			local12 = Static269.aClass2_Sub10_Sub1_3.method4421();
			local23 = (local12 >> 4 & 0x7) + Static179.anInt3567;
			local31 = (local12 & 0x7) + Static193.anInt3777;
			local37 = Static269.aClass2_Sub10_Sub1_3.method4464();
			if (local37 == 65535) {
				local37 = -1;
			}
			local44 = Static269.aClass2_Sub10_Sub1_3.method4421();
			local48 = local44 >> 4 & 0xF;
			local52 = local44 & 0x7;
			local58 = Static269.aClass2_Sub10_Sub1_3.method4421();
			local64 = Static269.aClass2_Sub10_Sub1_3.method4421();
			if (local23 >= 0 && local31 >= 0 && Static95.anInt6381 > local23 && local31 < Static237.anInt4532) {
				local68 = local48 + 1;
				if (local23 - local68 <= Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0] && Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray397[0] <= local68 + local23 && local31 - local68 <= Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0] && Static41.aClass62_Sub1_Sub2_Sub2_2.anIntArray396[0] <= local68 + local31 && Static303.anInt6082 != 0 && local52 > 0 && Static99.anInt2257 < 50 && local37 != -1) {
					Static135.anIntArray240[Static99.anInt2257] = local37;
					Static99.anIntArray216[Static99.anInt2257] = local52;
					Static71.anIntArray160[Static99.anInt2257] = local58;
					aClass134Array1[Static99.anInt2257] = null;
					Static333.anIntArray497[Static99.anInt2257] = (local31 << 8) + (local23 << 16) + local48;
					Static163.anIntArray156[Static99.anInt2257] = local64;
					Static99.anInt2257++;
				}
			}
		} else {
			if (Static48.anInt1097 == 143) {
				local12 = Static269.aClass2_Sub10_Sub1_3.method4414();
				local23 = Static179.anInt3567 + (local12 >> 4 & 0x7);
				local31 = Static193.anInt3777 + (local12 & 0x7);
				local37 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local44 = Static269.aClass2_Sub10_Sub1_3.method4464();
				@Pc(799) byte local799 = Static269.aClass2_Sub10_Sub1_3.method4420();
				@Pc(803) byte local803 = Static269.aClass2_Sub10_Sub1_3.method4436();
				local58 = Static269.aClass2_Sub10_Sub1_3.method4437();
				local64 = Static269.aClass2_Sub10_Sub1_3.method4421();
				local68 = local64 >> 2;
				local72 = local64 & 0x3;
				local76 = Static269.aClass2_Sub10_Sub1_3.method4425();
				@Pc(827) byte local827 = Static269.aClass2_Sub10_Sub1_3.method4420();
				@Pc(831) byte local831 = Static269.aClass2_Sub10_Sub1_3.method4420();
				if (!Static147.aClass4_2.method4297()) {
					Static348.method5953(local831, local44, local827, local31, local37, local68, local23, local799, local58, local76, local803, local72);
				}
			}
			if (Static48.anInt1097 == 126) {
				local12 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local23 = Static269.aClass2_Sub10_Sub1_3.method4421();
				Static234.method4051(local12).method2948(local23);
			} else if (Static48.anInt1097 == 83) {
				Static269.aClass2_Sub10_Sub1_3.method4421();
				local12 = Static269.aClass2_Sub10_Sub1_3.method4421();
				local23 = Static179.anInt3567 + (local12 >> 4 & 0x7);
				local31 = Static193.anInt3777 + (local12 & 0x7);
				local37 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local44 = Static269.aClass2_Sub10_Sub1_3.method4421();
				local48 = Static269.aClass2_Sub10_Sub1_3.method4463();
				@Pc(912) String local912 = Static269.aClass2_Sub10_Sub1_3.method4409();
				Static189.method5117(local37, local912, local48, local44, local31, local23);
			} else if (Static48.anInt1097 == 81) {
				local12 = Static269.aClass2_Sub10_Sub1_3.method4403();
				local23 = (local12 >> 4 & 0x7) + Static179.anInt3567;
				local31 = Static193.anInt3777 + (local12 & 0x7);
				local37 = Static269.aClass2_Sub10_Sub1_3.method4464();
				if (local23 >= 0 && local31 >= 0 && local23 < Static95.anInt6381 && local31 < Static237.anInt4532) {
					@Pc(975) Class2_Sub1 local975 = (Class2_Sub1) Static136.aClass199_12.method5751((long) (local23 | local31 << 14 | Static182.anInt3603 << 28));
					if (local975 != null) {
						for (@Pc(983) Class2_Sub4 local983 = (Class2_Sub4) local975.aClass216_1.method5992(); local983 != null; local983 = (Class2_Sub4) local975.aClass216_1.method6000()) {
							if ((local37 & 0x7FFF) == local983.anInt379) {
								local983.method5945();
								break;
							}
						}
						if (local975.aClass216_1.method5990()) {
							local975.method5945();
						}
						Static304.method5349(local23, local31, Static182.anInt3603);
					}
				}
			} else if (Static48.anInt1097 == 13) {
				local12 = Static269.aClass2_Sub10_Sub1_3.method4421();
				local23 = (local12 >> 4 & 0x7) + Static179.anInt3567;
				local31 = Static193.anInt3777 + (local12 & 0x7);
				local37 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local44 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local48 = Static269.aClass2_Sub10_Sub1_3.method4464();
				if (Static136.aClass199_12 != null && local23 >= 0 && local31 >= 0 && Static95.anInt6381 > local23 && Static237.anInt4532 > local31) {
					@Pc(1084) Class2_Sub1 local1084 = (Class2_Sub1) Static136.aClass199_12.method5751((long) (local31 << 14 | Static182.anInt3603 << 28 | local23));
					if (local1084 != null) {
						for (@Pc(1092) Class2_Sub4 local1092 = (Class2_Sub4) local1084.aClass216_1.method5992(); local1092 != null; local1092 = (Class2_Sub4) local1084.aClass216_1.method6000()) {
							if (local1092.anInt379 == (local37 & 0x7FFF) && local1092.anInt380 == local44) {
								local1092.method5945();
								local1092.anInt380 = local48;
								Static278.method5044(local1092, Static182.anInt3603, local31, local23);
								break;
							}
						}
						Static304.method5349(local23, local31, Static182.anInt3603);
					}
				}
			} else if (Static48.anInt1097 == 31) {
				local12 = Static269.aClass2_Sub10_Sub1_3.method4421();
				local23 = Static179.anInt3567 * 2 + (local12 >> 4 & 0xF);
				local31 = Static193.anInt3777 * 2 + (local12 & 0xF);
				local37 = local23 + Static269.aClass2_Sub10_Sub1_3.method4436();
				local44 = local31 + Static269.aClass2_Sub10_Sub1_3.method4436();
				local48 = Static269.aClass2_Sub10_Sub1_3.method4460();
				local52 = Static269.aClass2_Sub10_Sub1_3.method4460();
				local58 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local64 = Static269.aClass2_Sub10_Sub1_3.method4436();
				local68 = Static269.aClass2_Sub10_Sub1_3.method4421() * 4;
				local72 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local76 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local80 = Static269.aClass2_Sub10_Sub1_3.method4421();
				@Pc(1220) int local1220 = Static269.aClass2_Sub10_Sub1_3.method4421();
				if (local80 == 255) {
					local80 = -1;
				}
				if (local23 >= 0 && local31 >= 0 && local23 < Static95.anInt6381 * 2 && local31 < Static95.anInt6381 * 2 && local37 >= 0 && local44 >= 0 && local37 < Static237.anInt4532 * 2 && local44 < Static237.anInt4532 * 2 && local58 != 65535) {
					local37 *= 64;
					local23 *= 64;
					local44 = local44 * 64;
					local31 = local31 * 64;
					if (local48 != 0) {
						@Pc(1309) int local1309;
						@Pc(1316) Class62_Sub1_Sub2 local1316;
						@Pc(1299) int local1299;
						@Pc(1303) int local1303;
						if (local48 < 0) {
							local1299 = -local48 - 1;
							local1303 = local1299 & 0x7FF;
							local1309 = local1299 >> 11 & 0xF;
							if (Static40.anInt797 == local1303) {
								local1316 = Static41.aClass62_Sub1_Sub2_Sub2_2;
							} else {
								local1316 = Static129.aClass62_Sub1_Sub2_Sub2Array1[local1303];
							}
						} else {
							local1299 = local48 - 1;
							local1309 = local1299 >> 11 & 0xF;
							local1303 = local1299 & 0x7FF;
							local1316 = Static37.aClass62_Sub1_Sub2_Sub1Array1[local1303];
						}
						if (local1316 != null) {
							@Pc(1346) Class180 local1346 = local1316.method4775();
							if (local1346.anIntArrayArray149 != null && local1346.anIntArrayArray149[local1309] != null) {
								local1303 = local1346.anIntArrayArray149[local1309][0];
								@Pc(1368) int local1368 = local1346.anIntArrayArray149[local1309][2];
								@Pc(1373) int local1373 = local1316.aClass110_7.method3167();
								@Pc(1377) int local1377 = Class24.anIntArray35[local1373];
								@Pc(1381) int local1381 = Class24.anIntArray36[local1373];
								@Pc(1391) int local1391 = local1368 * local1377 + local1303 * local1381 >> 15;
								@Pc(1402) int local1402 = local1381 * local1368 - local1303 * local1377 >> 15;
								local64 -= local1346.anIntArrayArray149[local1309][1];
								local31 += local1402;
								local23 += local1391;
							}
						}
					}
					@Pc(1447) Class62_Sub1_Sub3 local1447 = new Class62_Sub1_Sub3(local58, Static182.anInt3603, local23, local31, Static138.method2745(Static182.anInt3603, local23, local31) - local64, local72 - -Static212.anInt4090, local76 + Static212.anInt4090, local80, local1220, local52, local68);
					local1447.method2614(Static138.method2745(Static182.anInt3603, local37, local44) - local68, Static212.anInt4090 + local72, local44, local37);
					Static260.aClass216_40.method5995(new Class2_Sub11_Sub11(local1447));
				}
			} else if (Static48.anInt1097 == 246) {
				local12 = Static269.aClass2_Sub10_Sub1_3.method4437();
				local23 = Static269.aClass2_Sub10_Sub1_3.method4413();
				local31 = Static269.aClass2_Sub10_Sub1_3.method4414();
				local37 = (local31 >> 4 & 0x7) + Static179.anInt3567;
				local44 = Static193.anInt3777 + (local31 & 0x7);
				if (local37 >= 0 && local44 >= 0 && local37 < Static95.anInt6381 && local44 < Static237.anInt4532) {
					Static278.method5044(new Class2_Sub4(local12, local23), Static182.anInt3603, local44, local37);
					Static304.method5349(local37, local44, Static182.anInt3603);
				}
			} else if (Static48.anInt1097 == 82) {
				local12 = Static269.aClass2_Sub10_Sub1_3.method4403();
				local23 = local12 >> 2;
				local31 = local12 & 0x3;
				local37 = Static166.anIntArray283[local23];
				local44 = Static269.aClass2_Sub10_Sub1_3.method4414();
				local48 = Static179.anInt3567 + (local44 >> 4 & 0x7);
				local52 = (local44 & 0x7) + Static193.anInt3777;
				if (local48 >= 0 && local52 >= 0 && local48 < Static95.anInt6381 && local52 < Static237.anInt4532) {
					Static37.method861(local52, local23, local48, local31, -1, Static182.anInt3603, local37, 0, -1);
				}
			} else if (Static48.anInt1097 == 155) {
				local12 = Static269.aClass2_Sub10_Sub1_3.method4421();
				local23 = (local12 >> 4 & 0x7) + Static179.anInt3567;
				local31 = Static193.anInt3777 + (local12 & 0x7);
				local37 = Static269.aClass2_Sub10_Sub1_3.method4464();
				local44 = Static269.aClass2_Sub10_Sub1_3.method4421();
				local48 = Static269.aClass2_Sub10_Sub1_3.method4464();
				if (local23 >= 0 && local31 >= 0 && Static95.anInt6381 > local23 && Static237.anInt4532 > local31) {
					local52 = local23 * 128 + 64;
					local58 = local31 * 128 + 64;
					@Pc(1713) Class62_Sub1_Sub4 local1713 = new Class62_Sub1_Sub4(local37, local48, Static212.anInt4090, Static182.anInt3603, local52, Static138.method2745(Static182.anInt3603, local52, local58) - local44, local58, local23, local23, local31, local31);
					Static347.aClass216_36.method5995(new Class2_Sub11_Sub13(local1713));
				}
			}
		}
	}
}
