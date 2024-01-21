import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!tb", name = "kb", descriptor = "D")
	public static double aDouble11;

	@OriginalMember(owner = "client!tb", name = "qb", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!tb", name = "V", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_1148 = Static81.method1507("We suspect someone knows your password)3");

	@OriginalMember(owner = "client!tb", name = "eb", descriptor = "I")
	public static int anInt3955 = 0;

	@OriginalMember(owner = "client!tb", name = "mb", descriptor = "Lclient!dj;")
	public static Class24 aClass24_1149 = aClass24_1148;

	@OriginalMember(owner = "client!tb", name = "pb", descriptor = "[I")
	public static final int[] anIntArray339 = new int[100];

	@OriginalMember(owner = "client!tb", name = "vb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1150 = Static81.method1507("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

	@OriginalMember(owner = "client!tb", name = "xb", descriptor = "Z")
	public static boolean aBoolean185 = false;

	@OriginalMember(owner = "client!tb", name = "Ab", descriptor = "I")
	public static int anInt3964 = 0;

	@OriginalMember(owner = "client!tb", name = "Fb", descriptor = "I")
	public static int anInt3968 = 0;

	@OriginalMember(owner = "client!tb", name = "Lb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1152 = Static81.method1507("Ihr Charakter)2Profil wird in:");

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIII)Z")
	public static boolean method3042(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (!Static85.method2618(arg0, arg1, arg2)) {
			return false;
		}
		@Pc(10) int local10 = arg1 << 7;
		@Pc(14) int local14 = arg2 << 7;
		@Pc(24) int local24 = Static181.anIntArrayArrayArray10[arg0][arg1][arg2] - 1;
		@Pc(28) int local28 = local24 - 120;
		@Pc(32) int local32 = local24 - 230;
		@Pc(36) int local36 = local24 - 238;
		if (arg3 < 16) {
			if (arg3 == 1) {
				if (local10 > Static167.anInt3703) {
					if (!Static52.method1042(local10, local24, local14)) {
						return false;
					}
					if (!Static52.method1042(local10, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static52.method1042(local10, local28, local14)) {
						return false;
					}
					if (!Static52.method1042(local10, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static52.method1042(local10, local32, local14)) {
					return false;
				}
				if (!Static52.method1042(local10, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 2) {
				if (local14 < Static176.anInt4669) {
					if (!Static52.method1042(local10, local24, local14 + 128)) {
						return false;
					}
					if (!Static52.method1042(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static52.method1042(local10, local28, local14 + 128)) {
						return false;
					}
					if (!Static52.method1042(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static52.method1042(local10, local32, local14 + 128)) {
					return false;
				}
				if (!Static52.method1042(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 4) {
				if (local10 < Static167.anInt3703) {
					if (!Static52.method1042(local10 + 128, local24, local14)) {
						return false;
					}
					if (!Static52.method1042(local10 + 128, local24, local14 + 128)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static52.method1042(local10 + 128, local28, local14)) {
						return false;
					}
					if (!Static52.method1042(local10 + 128, local28, local14 + 128)) {
						return false;
					}
				}
				if (!Static52.method1042(local10 + 128, local32, local14)) {
					return false;
				}
				if (!Static52.method1042(local10 + 128, local32, local14 + 128)) {
					return false;
				}
				return true;
			}
			if (arg3 == 8) {
				if (local14 > Static176.anInt4669) {
					if (!Static52.method1042(local10, local24, local14)) {
						return false;
					}
					if (!Static52.method1042(local10 + 128, local24, local14)) {
						return false;
					}
				}
				if (arg0 > 0) {
					if (!Static52.method1042(local10, local28, local14)) {
						return false;
					}
					if (!Static52.method1042(local10 + 128, local28, local14)) {
						return false;
					}
				}
				if (!Static52.method1042(local10, local32, local14)) {
					return false;
				}
				if (!Static52.method1042(local10 + 128, local32, local14)) {
					return false;
				}
				return true;
			}
		}
		if (!Static52.method1042(local10 + 64, local36, local14 + 64)) {
			return false;
		} else if (arg3 == 16) {
			return Static52.method1042(local10, local32, local14 + 128);
		} else if (arg3 == 32) {
			return Static52.method1042(local10 + 128, local32, local14 + 128);
		} else if (arg3 == 64) {
			return Static52.method1042(local10 + 128, local32, local14);
		} else if (arg3 == 128) {
			return Static52.method1042(local10, local32, local14);
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIBIIII)V")
	public static void method3043(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(17) int local17;
		@Pc(47) int local47;
		if (Static36.anInt973 == 0 && !aBoolean185) {
			@Pc(9) int local9 = Static55.anInt1374;
			@Pc(11) int local11 = Static140.anInt3139;
			local17 = Static105.anInt2371;
			@Pc(32) int local32 = (arg5 - arg3) * (local11 - local9) / arg2 + local9;
			@Pc(34) int local34 = Static172.anInt3846;
			local47 = (local34 - local17) * (arg1 - arg0) / arg4 + local17;
			Static104.method1811(0L, Static107.aClass24_725, (short) 38, local32, Static85.aClass24_1000, local47);
		}
		@Pc(57) long local57 = -1L;
		for (local17 = 0; local17 < Static168.anInt3728; local17++) {
			@Pc(69) long local69 = Static176.aLongArray40[local17];
			local47 = (int) local69 & 0x7F;
			@Pc(81) int local81 = (int) local69 >> 7 & 0x7F;
			@Pc(88) int local88 = (int) local69 >> 29 & 0x3;
			@Pc(95) int local95 = Integer.MAX_VALUE & (int) (local69 >>> 32);
			if (local69 != local57) {
				local57 = local69;
				@Pc(189) int local189;
				if (local88 == 2 && Static70.method2489(Static170.anInt3799, local47, local81, local69)) {
					@Pc(118) Class1_Sub2_Sub5 local118 = Static37.method702(local95);
					if (local118.anIntArray85 != null) {
						local118 = local118.method695();
					}
					if (local118 == null) {
						continue;
					}
					if (Static36.anInt973 == 1) {
						Static104.method1811(local69, Static163.aClass24_1053, (short) 14, local47, Static63.method1281(new Class24[] { Static129.aClass24_858, Static15.aClass24_106, local118.aClass24_232 }), local81);
					} else if (!aBoolean185) {
						@Pc(179) Class24[] local179 = local118.aClass24Array6;
						if (Static115.aBoolean118) {
							local179 = Static21.method475(local179);
						}
						if (local179 != null) {
							for (local189 = 4; local189 >= 0; local189--) {
								if (local179[local189] != null) {
									@Pc(200) short local200 = 0;
									if (local189 == 0) {
										local200 = 58;
									}
									if (local189 == 1) {
										local200 = 18;
									}
									if (local189 == 2) {
										local200 = 31;
									}
									if (local189 == 3) {
										local200 = 19;
									}
									if (local189 == 4) {
										local200 = 1006;
									}
									Static104.method1811(local69, local179[local189], local200, local47, Static63.method1281(new Class24[] { Static54.aClass24_1112, local118.aClass24_232 }), local81);
								}
							}
						}
						Static104.method1811((long) local118.anInt980, Static38.aClass24_245, (short) 1007, local47, Static63.method1281(new Class24[] { Static54.aClass24_1112, local118.aClass24_232 }), local81);
					} else if ((Static4.anInt4608 & 0x4) == 4) {
						Static104.method1811(local69, Static102.aClass24_681, (short) 26, local47, Static63.method1281(new Class24[] { Static177.aClass24_1140, Static15.aClass24_106, local118.aClass24_232 }), local81);
					}
				}
				@Pc(340) int local340;
				@Pc(347) Class5_Sub2_Sub2 local347;
				@Pc(395) Class5_Sub2_Sub1 local395;
				if (local88 == 1) {
					@Pc(317) Class5_Sub2_Sub2 local317 = Static148.aClass5_Sub2_Sub2Array1[local95];
					if (local317.aClass1_Sub2_Sub21_1.anInt3966 == 1 && (local317.anInt2501 & 0x7F) == 64 && (local317.anInt2448 & 0x7F) == 64) {
						for (local340 = 0; local340 < Static138.anInt3107; local340++) {
							local347 = Static148.aClass5_Sub2_Sub2Array1[Static138.anIntArray254[local340]];
							if (local347 != null && local347 != local317 && local347.aClass1_Sub2_Sub21_1.anInt3966 == 1 && local347.anInt2501 == local317.anInt2501 && local347.anInt2448 == local317.anInt2448) {
								Static44.method823(local81, local47, local347.aClass1_Sub2_Sub21_1, Static138.anIntArray254[local340]);
							}
						}
						for (local189 = 0; local189 < Static82.anInt1956; local189++) {
							local395 = Static110.aClass5_Sub2_Sub1Array1[Static41.anIntArray115[local189]];
							if (local395 != null && local317.anInt2501 == local395.anInt2501 && local317.anInt2448 == local395.anInt2448) {
								Static189.method3258(local395, local47, Static41.anIntArray115[local189], local81);
							}
						}
					}
					Static44.method823(local81, local47, local317.aClass1_Sub2_Sub21_1, local95);
				}
				if (local88 == 0) {
					@Pc(443) Class5_Sub2_Sub1 local443 = Static110.aClass5_Sub2_Sub1Array1[local95];
					if ((local443.anInt2501 & 0x7F) == 64 && (local443.anInt2448 & 0x7F) == 64) {
						for (local340 = 0; local340 < Static138.anInt3107; local340++) {
							local347 = Static148.aClass5_Sub2_Sub2Array1[Static138.anIntArray254[local340]];
							if (local347 != null && local347.aClass1_Sub2_Sub21_1.anInt3966 == 1 && local443.anInt2501 == local347.anInt2501 && local443.anInt2448 == local347.anInt2448) {
								Static44.method823(local81, local47, local347.aClass1_Sub2_Sub21_1, Static138.anIntArray254[local340]);
							}
						}
						for (local189 = 0; local189 < Static82.anInt1956; local189++) {
							local395 = Static110.aClass5_Sub2_Sub1Array1[Static41.anIntArray115[local189]];
							if (local395 != null && local395 != local443 && local443.anInt2501 == local395.anInt2501 && local443.anInt2448 == local395.anInt2448) {
								Static189.method3258(local395, local47, Static41.anIntArray115[local189], local81);
							}
						}
					}
					Static189.method3258(local443, local47, local95, local81);
				}
				if (local88 == 3) {
					@Pc(559) Class87 local559 = Static31.aClass87ArrayArrayArray1[Static170.anInt3799][local47][local81];
					if (local559 != null) {
						for (@Pc(566) Class1_Sub2_Sub16 local566 = (Class1_Sub2_Sub16) local559.method2828(); local566 != null; local566 = (Class1_Sub2_Sub16) local559.method2832()) {
							local189 = local566.aClass5_Sub7_1.anInt4089;
							@Pc(577) Class1_Sub2_Sub23 local577 = Static168.method2886(local189);
							if (Static36.anInt973 == 1) {
								Static104.method1811((long) local189, Static163.aClass24_1053, (short) 5, local47, Static63.method1281(new Class24[] { Static129.aClass24_858, Static85.aClass24_997, local577.aClass24_1214 }), local81);
							} else if (!aBoolean185) {
								@Pc(587) Class24[] local587 = local577.aClass24Array25;
								if (Static115.aBoolean118) {
									local587 = Static21.method475(local587);
								}
								for (@Pc(599) int local599 = 4; local599 >= 0; local599--) {
									if (local587 != null && local587[local599] != null) {
										@Pc(612) byte local612 = 0;
										if (local599 == 0) {
											local612 = 37;
										}
										if (local599 == 1) {
											local612 = 30;
										}
										if (local599 == 2) {
											local612 = 20;
										}
										if (local599 == 3) {
											local612 = 22;
										}
										if (local599 == 4) {
											local612 = 16;
										}
										Static104.method1811((long) local189, local587[local599], local612, local47, Static63.method1281(new Class24[] { Static71.aClass24_526, local577.aClass24_1214 }), local81);
									} else if (local599 == 2) {
										Static104.method1811((long) local189, Static155.aClass24_874, (short) 20, local47, Static63.method1281(new Class24[] { Static71.aClass24_526, local577.aClass24_1214 }), local81);
									}
								}
								Static104.method1811((long) local189, Static38.aClass24_245, (short) 1005, local47, Static63.method1281(new Class24[] { Static71.aClass24_526, local577.aClass24_1214 }), local81);
							} else if ((Static4.anInt4608 & 0x1) == 1) {
								Static104.method1811((long) local189, Static102.aClass24_681, (short) 17, local47, Static63.method1281(new Class24[] { Static177.aClass24_1140, Static85.aClass24_997, local577.aClass24_1214 }), local81);
							}
						}
					}
				}
			}
		}
	}
}
