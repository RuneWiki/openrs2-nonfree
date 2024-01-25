import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
	public static int anInt7671;

	@OriginalMember(owner = "client!qo", name = "t", descriptor = "[[B")
	public static byte[][] aByteArrayArray25;

	@OriginalMember(owner = "client!qo", name = "v", descriptor = "Lclient!ao;")
	public static Class17 aClass17_35;

	@OriginalMember(owner = "client!qo", name = "k", descriptor = "Lclient!ej;")
	public static final Class88 aClass88_220 = new Class88("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIII)Z")
	public static boolean method6375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static214.method3975(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << Static193.anInt4311;
		@Pc(14) int local14 = arg2 << Static193.anInt4311;
		@Pc(23) int local23 = Static51.aClass215Array6[arg0].ba(arg1, arg2) - 1;
		@Pc(31) int local31 = local23 - (0x78 << Static193.anInt4311 - 7);
		@Pc(39) int local39 = local23 - (0xE6 << Static193.anInt4311 - 7);
		@Pc(47) int local47 = local23 - (0xEE << Static193.anInt4311 - 7);
		if (arg3 == 1) {
			if (local10 > Static432.anInt7994) {
				if (!Static502.method7462(local10, local23, local14)) {
					return false;
				}
				if (!Static502.method7462(local10, local23, local14 + Static225.anInt4810)) {
					return false;
				}
				if (!Static502.method7462(local10, local23, local14 + Static316.anInt6040)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static502.method7462(local10, local31, local14)) {
					return false;
				}
				if (!Static502.method7462(local10, local31, local14 + Static225.anInt4810)) {
					return false;
				}
				if (!Static502.method7462(local10, local31, local14 + Static316.anInt6040)) {
					return false;
				}
			}
			if (!Static502.method7462(local10, local39, local14)) {
				return false;
			} else if (Static502.method7462(local10, local39, local14 + Static225.anInt4810)) {
				return Static502.method7462(local10, local39, local14 + Static316.anInt6040);
			} else {
				return false;
			}
		} else if (arg3 == 2) {
			if (local14 < Static87.anInt2071) {
				if (!Static502.method7462(local10, local23, local14 + Static316.anInt6040)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static225.anInt4810, local23, local14 + Static316.anInt6040)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static316.anInt6040, local23, local14 + Static316.anInt6040)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static502.method7462(local10, local31, local14 + Static316.anInt6040)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static225.anInt4810, local31, local14 + Static316.anInt6040)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static316.anInt6040, local31, local14 + Static316.anInt6040)) {
					return false;
				}
			}
			if (!Static502.method7462(local10, local39, local14 + Static316.anInt6040)) {
				return false;
			} else if (Static502.method7462(local10 + Static225.anInt4810, local39, local14 + Static316.anInt6040)) {
				return Static502.method7462(local10 + Static316.anInt6040, local39, local14 + Static316.anInt6040);
			} else {
				return false;
			}
		} else if (arg3 == 4) {
			if (local10 < Static432.anInt7994) {
				if (!Static502.method7462(local10 + Static316.anInt6040, local23, local14)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static316.anInt6040, local23, local14 + Static225.anInt4810)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static316.anInt6040, local23, local14 + Static316.anInt6040)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static502.method7462(local10 + Static316.anInt6040, local31, local14)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static316.anInt6040, local31, local14 + Static225.anInt4810)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static316.anInt6040, local31, local14 + Static316.anInt6040)) {
					return false;
				}
			}
			if (!Static502.method7462(local10 + Static316.anInt6040, local39, local14)) {
				return false;
			} else if (Static502.method7462(local10 + Static316.anInt6040, local39, local14 + Static225.anInt4810)) {
				return Static502.method7462(local10 + Static316.anInt6040, local39, local14 + Static316.anInt6040);
			} else {
				return false;
			}
		} else if (arg3 == 8) {
			if (local14 > Static87.anInt2071) {
				if (!Static502.method7462(local10, local23, local14)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static225.anInt4810, local23, local14)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static316.anInt6040, local23, local14)) {
					return false;
				}
			}
			if (arg0 > 0) {
				if (!Static502.method7462(local10, local31, local14)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static225.anInt4810, local31, local14)) {
					return false;
				}
				if (!Static502.method7462(local10 + Static316.anInt6040, local31, local14)) {
					return false;
				}
			}
			if (!Static502.method7462(local10, local39, local14)) {
				return false;
			} else if (Static502.method7462(local10 + Static225.anInt4810, local39, local14)) {
				return Static502.method7462(local10 + Static316.anInt6040, local39, local14);
			} else {
				return false;
			}
		} else if (!Static502.method7462(local10 + Static225.anInt4810, local47, local14 + Static225.anInt4810)) {
			return false;
		} else if (arg3 == 16) {
			return Static502.method7462(local10, local39, local14 + Static316.anInt6040);
		} else if (arg3 == 32) {
			return Static502.method7462(local10 + Static316.anInt6040, local39, local14 + Static316.anInt6040);
		} else if (arg3 == 64) {
			return Static502.method7462(local10 + Static316.anInt6040, local39, local14);
		} else if (arg3 == 128) {
			return Static502.method7462(local10, local39, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(B)V")
	public static void method6376() {
		for (@Pc(14) Class12_Sub26 local14 = (Class12_Sub26) Static505.aClass73_73.method2005(); local14 != null; local14 = (Class12_Sub26) Static505.aClass73_73.method2009()) {
			if (Static120.aClass37ArrayArrayArray1 == null) {
				local14.method7967();
			} else {
				@Pc(32) int local32;
				@Pc(45) Class30_Sub2 local45;
				@Pc(58) Class30_Sub2_Sub2 local58;
				@Pc(95) Class30_Sub1 local95;
				@Pc(137) Class30_Sub3 local137;
				@Pc(172) Class30_Sub4 local172;
				@Pc(150) Class30_Sub3_Sub2 local150;
				@Pc(185) Class30_Sub4_Sub1 local185;
				if (local14.anInt4801 <= Static409.anInt7683) {
					local32 = Static58.anIntArray137[local14.anInt4785];
					if (local32 == 0) {
						local45 = Static324.method5105(local14.anInt4790, local14.anInt4795, local14.anInt4803);
						if (local45 instanceof Class30_Sub2_Sub2) {
							Static347.method5470(local14.anInt4790, local14.anInt4795, local14.anInt4803);
							local58 = (Class30_Sub2_Sub2) local45;
							if (local58.aClass30_Sub2_3 != null) {
								Static327.method5156(local14.anInt4790, local14.anInt4795, local14.anInt4803, local58.aClass30_Sub2_3, null);
							}
						}
					} else if (local32 == 1) {
						local172 = Static533.method7882(local14.anInt4790, local14.anInt4795, local14.anInt4803);
						if (local172 instanceof Class30_Sub4_Sub1) {
							Static200.method3788(local14.anInt4790, local14.anInt4795, local14.anInt4803);
							local185 = (Class30_Sub4_Sub1) local172;
							if (local185.aClass30_Sub4_3 != null) {
								Static163.method3348(local14.anInt4790, local14.anInt4795, local14.anInt4803, local185.aClass30_Sub4_3, null);
							}
						}
					} else if (local32 == 2) {
						local95 = Static531.method7866(local14.anInt4790, local14.anInt4795, local14.anInt4803, wf.class);
						if (local95 instanceof Class30_Sub1_Sub2) {
							Static82.method1831(local14.anInt4790, local14.anInt4795, local14.anInt4803, wf.class);
							@Pc(116) Class30_Sub1_Sub2 local116 = (Class30_Sub1_Sub2) local95;
							if (local116.aClass30_Sub1_1 != null) {
								Static135.method2775(local116.aClass30_Sub1_1, false);
							}
						}
					} else if (local32 == 3) {
						local137 = Static160.method3298(local14.anInt4790, local14.anInt4795, local14.anInt4803);
						if (local137 instanceof Class30_Sub3_Sub2) {
							Static225.method4070(local14.anInt4790, local14.anInt4795, local14.anInt4803);
							local150 = (Class30_Sub3_Sub2) local137;
							if (local150.aClass30_Sub3_2 != null) {
								Static111.method2306(local14.anInt4790, local14.anInt4795, local14.anInt4803, local150.aClass30_Sub3_2);
							}
						}
					}
					local14.method7967();
				} else if (local14.anInt4794 == Static409.anInt7683) {
					local32 = Static58.anIntArray137[local14.anInt4785];
					if (local32 == 0) {
						local45 = Static324.method5105(local14.anInt4790, local14.anInt4795, local14.anInt4803);
						if (local45 instanceof Class30_Sub2_Sub2) {
							local14.method7967();
						} else if (Static422.method6540(local14.anInt4790, local14.anInt4795, local14.anInt4803) == null) {
							local58 = new Class30_Sub2_Sub2(local14.anInt4785, local14.anInt4786, local14.anInt4802, local14.anInt4799, local14.anInt4796, local45);
							Static327.method5156(local14.anInt4790, local14.anInt4795, local14.anInt4803, local58, null);
						} else {
							local14.method7967();
						}
					} else if (local32 == 1) {
						local172 = Static533.method7882(local14.anInt4790, local14.anInt4795, local14.anInt4803);
						if (local172 instanceof Class30_Sub4_Sub1) {
							local14.method7967();
						} else if (Static170.method3419(local14.anInt4790, local14.anInt4795, local14.anInt4803) == null) {
							local185 = new Class30_Sub4_Sub1(local14.anInt4785, local14.anInt4786, local14.anInt4802, local14.anInt4799, local14.anInt4796, local172);
							Static163.method3348(local14.anInt4790, local14.anInt4795, local14.anInt4803, local185, null);
						} else {
							local14.method7967();
						}
					} else if (local32 == 2) {
						local95 = Static531.method7866(local14.anInt4790, local14.anInt4795, local14.anInt4803, wf.class);
						if (local95 instanceof Class30_Sub1_Sub2) {
							local14.method7967();
						} else {
							Static82.method1831(local14.anInt4790, local14.anInt4795, local14.anInt4803, wf.class);
							@Pc(369) Class279 local369 = Static49.aClass155_2.method4063(local14.anInt4784);
							@Pc(382) int local382;
							@Pc(385) int local385;
							if (local14.anInt4786 == 1 || local14.anInt4786 == 3) {
								local385 = local369.anInt8293;
								local382 = local369.anInt8303;
							} else {
								local382 = local369.anInt8293;
								local385 = local369.anInt8303;
							}
							@Pc(427) Class30_Sub1_Sub2 local427 = new Class30_Sub1_Sub2(local14.anInt4785, local14.anInt4786, local14.anInt4790, local14.anInt4802, local14.anInt4799, local14.anInt4796, local14.anInt4795, local382 + local14.anInt4795 - 1, local14.anInt4803, local14.anInt4803 + local385 - 1, local95);
							Static135.method2775(local427, false);
						}
					} else if (local32 == 3) {
						local137 = Static160.method3298(local14.anInt4790, local14.anInt4795, local14.anInt4803);
						if (local137 instanceof Class30_Sub3_Sub2) {
							local14.method7967();
						} else {
							local150 = new Class30_Sub3_Sub2(local14.anInt4802, local14.anInt4799, local14.anInt4796, local137);
							Static111.method2306(local14.anInt4790, local14.anInt4795, local14.anInt4803, local150);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(Z)V")
	public static void method6377() {
		if (Static145.anInt3193 == 6) {
			Static145.anInt3193 = 7;
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(BI)V")
	public static void method6382() {
		Static203.aClass125_24.method3447(50);
		Static432.aClass125_59.method3447(50);
		Static495.aClass125_63.method3447(50);
		Static145.aClass125_16.method3447(50);
		Static394.aClass125_53.method3447(50);
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILclient!daa;)Lclient!sba;")
	public static Class270 method6384(@OriginalArg(1) Class12_Sub8 arg0) {
		@Pc(12) Class270 local12 = new Class270();
		local12.anInt8103 = arg0.method5199();
		local12.aClass12_Sub4_Sub17_1 = Static186.aClass122_1.method3365(local12.anInt8103);
		return local12;
	}
}
