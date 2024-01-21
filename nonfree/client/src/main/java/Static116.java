import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!me", name = "gb", descriptor = "I")
	public static int anInt2830;

	@OriginalMember(owner = "client!me", name = "kb", descriptor = "I")
	public static int anInt2834 = 0;

	@OriginalMember(owner = "client!me", name = "ob", descriptor = "I")
	public static final int anInt2838 = 7759444;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "([BB)V")
	public static void method2132(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		local8.anInt2306 = arg0.length - 2;
		Static172.anInt3838 = local8.method1753();
		Static153.aByteArrayArray33 = new byte[Static172.anInt3838][];
		Static138.anIntArray384 = new int[Static172.anInt3838];
		Static127.anIntArray364 = new int[Static172.anInt3838];
		Static160.anIntArray328 = new int[Static172.anInt3838];
		Static111.anIntArray308 = new int[Static172.anInt3838];
		local8.anInt2306 = arg0.length - Static172.anInt3838 * 8 - 7;
		Static148.anInt3487 = local8.method1753();
		Static108.anInt2647 = local8.method1753();
		@Pc(65) int local65 = (local8.method1738() & 0xFF) + 1;
		for (@Pc(67) int local67 = 0; local67 < Static172.anInt3838; local67++) {
			Static111.anIntArray308[local67] = local8.method1753();
		}
		for (@Pc(84) int local84 = 0; local84 < Static172.anInt3838; local84++) {
			Static127.anIntArray364[local84] = local8.method1753();
		}
		for (@Pc(101) int local101 = 0; local101 < Static172.anInt3838; local101++) {
			Static138.anIntArray384[local101] = local8.method1753();
		}
		for (@Pc(114) int local114 = 0; local114 < Static172.anInt3838; local114++) {
			Static160.anIntArray328[local114] = local8.method1753();
		}
		local8.anInt2306 = arg0.length - (local65 - 1) * 3 - Static172.anInt3838 * 8 - 7;
		Static61.anIntArray154 = new int[local65];
		for (@Pc(147) int local147 = 1; local147 < local65; local147++) {
			Static61.anIntArray154[local147] = local8.method1713();
			if (Static61.anIntArray154[local147] == 0) {
				Static61.anIntArray154[local147] = 1;
			}
		}
		local8.anInt2306 = 0;
		for (@Pc(174) int local174 = 0; local174 < Static172.anInt3838; local174++) {
			@Pc(179) int local179 = Static138.anIntArray384[local174];
			@Pc(183) int local183 = Static160.anIntArray328[local174];
			@Pc(187) int local187 = local183 * local179;
			@Pc(190) byte[] local190 = new byte[local187];
			Static153.aByteArrayArray33[local174] = local190;
			@Pc(198) int local198 = local8.method1738();
			@Pc(202) int local202;
			if (local198 == 0) {
				for (local202 = 0; local202 < local187; local202++) {
					local190[local202] = local8.method1720();
				}
			} else if (local198 == 1) {
				for (local202 = 0; local202 < local179; local202++) {
					for (@Pc(226) int local226 = 0; local226 < local183; local226++) {
						local190[local226 * local179 + local202] = local8.method1720();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(JIZI)Lclient!oc;")
	public static Class65 method2133(@OriginalArg(0) long arg0) {
		@Pc(26) int local26 = 1;
		for (@Pc(31) long local31 = arg0 / (long) 10; local31 != 0L; local31 /= 10) {
			local26++;
		}
		@Pc(46) int local46 = local26;
		if (arg0 < 0L) {
			local46 = local26 + 1;
		}
		@Pc(58) byte[] local58 = new byte[local46];
		if (arg0 < 0L) {
			local58[0] = 45;
		}
		for (@Pc(77) int local77 = 0; local77 < local26; local77++) {
			@Pc(84) int local84 = (int) (arg0 % (long) 10);
			if (local84 < 0) {
				local84 = -local84;
			}
			if (local84 > 9) {
				local84 += 39;
			}
			arg0 /= 10;
			local58[local46 - local77 - 1] = (byte) (local84 + 48);
		}
		@Pc(120) Class65 local120 = new Class65();
		local120.aByteArray37 = local58;
		local120.anInt3190 = local46;
		return local120;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IIIII)V")
	public static void method2134(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static145.anInt3438 == 0 && !Static138.aBoolean138) {
			Static123.method2348(arg1 - arg3, Static117.aClass65_1665, (short) 42, 0L, Static140.aClass65_1959, arg2 - arg0);
		}
		@Pc(32) long local32 = -1L;
		for (@Pc(34) int local34 = 0; local34 < Static64.anInt1667; local34++) {
			@Pc(40) long local40 = Static120.aLongArray6[local34];
			@Pc(45) int local45 = (int) local40 & 0x7F;
			@Pc(52) int local52 = (int) local40 >> 7 & 0x7F;
			@Pc(59) int local59 = (int) local40 >> 29 & 0x3;
			@Pc(66) int local66 = (int) (local40 >>> 32) & Integer.MAX_VALUE;
			if (local40 != local32) {
				local32 = local40;
				@Pc(122) int local122;
				if (local59 == 2 && Static107.method1976(Static207.anInt4425, local45, local52, local40)) {
					@Pc(89) Class1_Sub2_Sub13 local89 = Static5.method65(local66);
					if (local89.anIntArray227 != null) {
						local89 = local89.method1430();
					}
					if (local89 == null) {
						continue;
					}
					if (Static145.anInt3438 == 1) {
						Static123.method2348(local45, Static109.method2004(new Class65[] { Static27.aClass65_569, Static43.aClass65_699, local89.aClass65_1214 }), (short) 58, local40, Static14.aClass65_253, local52);
					} else if (!Static138.aBoolean138) {
						@Pc(112) Class65[] local112 = local89.aClass65Array27;
						if (Static48.aBoolean53) {
							local112 = Static35.method667(local112);
						}
						if (local112 != null) {
							for (local122 = 4; local122 >= 0; local122--) {
								if (local112[local122] != null) {
									@Pc(130) short local130 = 0;
									if (local122 == 0) {
										local130 = 16;
									}
									if (local122 == 1) {
										local130 = 29;
									}
									if (local122 == 2) {
										local130 = 28;
									}
									if (local122 == 3) {
										local130 = 11;
									}
									if (local122 == 4) {
										local130 = 1006;
									}
									Static123.method2348(local45, Static109.method2004(new Class65[] { Static136.aClass65_1873, local89.aClass65_1214 }), local130, local40, local112[local122], local52);
								}
							}
						}
						Static123.method2348(local45, Static109.method2004(new Class65[] { Static136.aClass65_1873, local89.aClass65_1214 }), (short) 1001, (long) local89.anInt1998, Static205.aClass65_2570, local52);
					} else if ((Static50.anInt1407 & 0x4) == 4) {
						Static123.method2348(local45, Static109.method2004(new Class65[] { Static19.aClass65_481, Static43.aClass65_699, local89.aClass65_1214 }), (short) 3, local40, Static83.aClass65_1223, local52);
					}
				}
				@Pc(315) int local315;
				@Pc(323) Class6_Sub4_Sub2 local323;
				@Pc(374) Class6_Sub4_Sub1 local374;
				if (local59 == 1) {
					@Pc(294) Class6_Sub4_Sub2 local294 = Static106.aClass6_Sub4_Sub2Array1[local66];
					if (local294.aClass1_Sub2_Sub11_1.anInt1595 == 1 && (local294.anInt3934 & 0x7F) == 64 && (local294.anInt3976 & 0x7F) == 64) {
						for (local315 = 0; local315 < Static22.anInt659; local315++) {
							local323 = Static106.aClass6_Sub4_Sub2Array1[Static72.anIntArray197[local315]];
							if (local323 != null && local294 != local323 && local323.aClass1_Sub2_Sub11_1.anInt1595 == 1 && local294.anInt3934 == local323.anInt3934 && local323.anInt3976 == local294.anInt3976) {
								Static192.method3157(Static72.anIntArray197[local315], local45, local52, local323.aClass1_Sub2_Sub11_1);
							}
						}
						for (local122 = 0; local122 < Static44.anInt1123; local122++) {
							local374 = Static158.aClass6_Sub4_Sub1Array1[Static138.anIntArray385[local122]];
							if (local374 != null && local294.anInt3934 == local374.anInt3934 && local294.anInt3976 == local374.anInt3976) {
								Static57.method1045(Static138.anIntArray385[local122], local52, local374, local45);
							}
						}
					}
					Static192.method3157(local66, local45, local52, local294.aClass1_Sub2_Sub11_1);
				}
				if (local59 == 0) {
					@Pc(422) Class6_Sub4_Sub1 local422 = Static158.aClass6_Sub4_Sub1Array1[local66];
					if ((local422.anInt3934 & 0x7F) == 64 && (local422.anInt3976 & 0x7F) == 64) {
						for (local315 = 0; local315 < Static22.anInt659; local315++) {
							local323 = Static106.aClass6_Sub4_Sub2Array1[Static72.anIntArray197[local315]];
							if (local323 != null && local323.aClass1_Sub2_Sub11_1.anInt1595 == 1 && local323.anInt3934 == local422.anInt3934 && local323.anInt3976 == local422.anInt3976) {
								Static192.method3157(Static72.anIntArray197[local315], local45, local52, local323.aClass1_Sub2_Sub11_1);
							}
						}
						for (local122 = 0; local122 < Static44.anInt1123; local122++) {
							local374 = Static158.aClass6_Sub4_Sub1Array1[Static138.anIntArray385[local122]];
							if (local374 != null && local422 != local374 && local374.anInt3934 == local422.anInt3934 && local374.anInt3976 == local422.anInt3976) {
								Static57.method1045(Static138.anIntArray385[local122], local52, local374, local45);
							}
						}
					}
					Static57.method1045(local66, local52, local422, local45);
				}
				if (local59 == 3) {
					@Pc(536) Class91 local536 = Static27.aClass91ArrayArrayArray1[Static207.anInt4425][local45][local52];
					if (local536 != null) {
						for (@Pc(543) Class1_Sub2_Sub18 local543 = (Class1_Sub2_Sub18) local536.method3149(); local543 != null; local543 = (Class1_Sub2_Sub18) local536.method3142()) {
							local122 = local543.aClass6_Sub7_1.anInt3630;
							@Pc(555) Class1_Sub2_Sub2 local555 = Static40.method700(local122);
							if (Static145.anInt3438 == 1) {
								Static123.method2348(local45, Static109.method2004(new Class65[] { Static27.aClass65_569, Static147.aClass65_2004, local555.aClass65_229 }), (short) 37, (long) local122, Static14.aClass65_253, local52);
							} else if (!Static138.aBoolean138) {
								@Pc(609) Class65[] local609 = local555.aClass65Array5;
								if (Static48.aBoolean53) {
									local609 = Static35.method667(local609);
								}
								for (@Pc(617) int local617 = 4; local617 >= 0; local617--) {
									if (local609 != null && local609[local617] != null) {
										@Pc(663) byte local663 = 0;
										if (local617 == 0) {
											local663 = 6;
										}
										if (local617 == 1) {
											local663 = 51;
										}
										if (local617 == 2) {
											local663 = 34;
										}
										if (local617 == 3) {
											local663 = 43;
										}
										if (local617 == 4) {
											local663 = 39;
										}
										Static123.method2348(local45, Static109.method2004(new Class65[] { Static48.aClass65_786, local555.aClass65_229 }), local663, (long) local122, local609[local617], local52);
									} else if (local617 == 2) {
										Static123.method2348(local45, Static109.method2004(new Class65[] { Static48.aClass65_786, local555.aClass65_229 }), (short) 34, (long) local122, Static108.aClass65_1551, local52);
									}
								}
								Static123.method2348(local45, Static109.method2004(new Class65[] { Static48.aClass65_786, local555.aClass65_229 }), (short) 1007, (long) local122, Static205.aClass65_2570, local52);
							} else if ((Static50.anInt1407 & 0x1) == 1) {
								Static123.method2348(local45, Static109.method2004(new Class65[] { Static19.aClass65_481, Static147.aClass65_2004, local555.aClass65_229 }), (short) 35, (long) local122, Static83.aClass65_1223, local52);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLclient!wa;)Lclient!dd;")
	public static Class5_Sub3 method2135(@OriginalArg(1) Class1_Sub14 arg0) {
		return new Class5_Sub3(arg0.method1729(), arg0.method1729(), arg0.method1729(), arg0.method1729(), arg0.method1713(), arg0.method1738());
	}
}
