import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static139 {

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "Lclient!rk;")
	public static Class180 aClass180_36;

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array8;

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "I")
	public static int anInt3024 = 0;

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IIIIIII)V")
	public static void method2809(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		Static162.anInt2274 = 0;
		@Pc(170) int local170;
		@Pc(213) int local213;
		@Pc(377) int local377;
		@Pc(487) int local487;
		@Pc(262) int local262;
		@Pc(606) int local606;
		@Pc(428) int local428;
		for (@Pc(7) int local7 = -1; local7 < Static11.anInt3203 + Static223.anInt4466; local7++) {
			@Pc(10) Class174 local10 = null;
			@Pc(28) Class22_Sub2_Sub1 local28;
			if (local7 < 0) {
				local28 = Static252.aClass22_Sub2_Sub1_Sub1_4;
			} else if (local7 >= Static223.anInt4466) {
				local28 = Static69.aClass22_Sub2_Sub1_Sub2Array1[Static257.anIntArray649[local7 - Static223.anInt4466]];
				local10 = ((Class22_Sub2_Sub1_Sub2) local28).aClass174_1;
				if (local10.anIntArray670 != null) {
					local10 = local10.method4438();
					if (local10 == null) {
						continue;
					}
				}
			} else {
				local28 = Static157.aClass22_Sub2_Sub1_Sub1Array1[Static314.anIntArray758[local7]];
			}
			if (local28.anInt5083 >= 0) {
				Static156.method3002(arg1 >> 1, local28, arg2 >> 1, local28.method4407());
				if (Static157.anIntArray430[0] >= 0) {
					if (local28.aString325 != null && (local7 >= Static223.anInt4466 || Static326.anInt6196 == 0 || Static326.anInt6196 == 3 || Static326.anInt6196 == 1 && Static94.method1902(((Class22_Sub2_Sub1_Sub1) local28).aString78)) && Static24.anInt475 > Static162.anInt2274) {
						Static24.anIntArray51[Static162.anInt2274] = Static175.aClass208_3.method5385(local28.aString325) / 2;
						Static24.anIntArray56[Static162.anInt2274] = Static157.anIntArray430[0];
						Static24.anIntArray55[Static162.anInt2274] = Static157.anIntArray430[1];
						Static24.anIntArray54[Static162.anInt2274] = local28.anInt5077;
						Static24.anIntArray53[Static162.anInt2274] = local28.anInt5128;
						Static24.anIntArray52[Static162.anInt2274] = local28.anInt5125;
						Static24.aStringArray4[Static162.anInt2274] = local28.aString325;
						Static162.anInt2274++;
					}
					@Pc(157) Class52 local157 = Static245.aClass52Array13[0];
					local170 = Static157.anIntArray430[1] + arg0 - Math.max(Static175.aClass208_3.anInt6381, local157.method4134());
					@Pc(181) Class52 local181;
					@Pc(274) int local274;
					if (!local28.aBoolean377 && local28.anInt5094 > Static212.anInt4234) {
						local181 = Static245.aClass52Array13[1];
						if (local28 instanceof Class22_Sub2_Sub1_Sub2) {
							@Pc(187) Class22_Sub2_Sub1_Sub2 local187 = (Class22_Sub2_Sub1_Sub2) local28;
							@Pc(196) Class52[] local196 = (Class52[]) Static54.aClass103_14.method2682((long) local187.aClass174_1.anInt5215);
							if (local196 == null) {
								@Pc(205) Class56[] local205 = Static358.method1303(Static312.aClass180_89, local187.aClass174_1.anInt5215);
								if (local205 != null) {
									local196 = new Class52[local205.length];
									for (local213 = 0; local213 < local205.length; local213++) {
										local196[local213] = Static128.aClass89_3.method5411(local205[local213]);
									}
									Static54.aClass103_14.method2687(local196, (long) local187.aClass174_1.anInt5215);
								}
							}
							if (local196 != null && local196.length == 2) {
								local157 = local196[0];
								local181 = local196[1];
							}
						}
						local262 = arg3 + Static157.anIntArray430[0] - (local157.method4124() >> 1);
						local157.method4123(local262, local170);
						local274 = local157.method4124() * local28.anInt5109 / 255;
						Static128.aClass89_3.method5453(local262, local170, local274 + local262, local170 - -local157.method4134());
						local181.method4123(local262, local170);
						Static128.aClass89_3.method5431(arg3, arg0, arg3 + arg1, arg2 + arg0);
					}
					local170 -= 2;
					if (!local28.aBoolean377) {
						if (Static212.anInt4234 < local28.anInt5112) {
							local181 = Static130.aClass52Array7[local28.aBoolean375 ? 2 : 0];
							@Pc(326) Class52 local326 = Static130.aClass52Array7[local28.aBoolean375 ? 3 : 1];
							if (local28 instanceof Class22_Sub2_Sub1_Sub2) {
								local274 = local10.anInt5209;
								if (local274 == -1) {
									local274 = local28.method4417().anInt2361;
								}
							} else {
								local274 = local28.method4417().anInt2361;
							}
							if (local274 != -1) {
								@Pc(362) Class52[] local362 = (Class52[]) Static263.aClass103_53.method2682((long) local274);
								if (local362 == null) {
									@Pc(369) Class56[] local369 = Static358.method1303(Static312.aClass180_89, local274);
									if (local369 != null) {
										local362 = new Class52[local369.length];
										for (local377 = 0; local377 < local369.length; local377++) {
											local362[local377] = Static128.aClass89_3.method5411(local369[local377]);
										}
										Static263.aClass103_53.method2687(local362, (long) local274);
									}
								}
								if (local362 != null && local362.length == 4) {
									local326 = local362[local28.aBoolean375 ? 3 : 1];
									local181 = local362[local28.aBoolean375 ? 2 : 0];
								}
							}
							local428 = local28.anInt5112 - Static212.anInt4234;
							if (local428 > local28.anInt5102) {
								local428 -= local28.anInt5102;
								local377 = local28.anInt5089 == 0 ? 0 : (local28.anInt5108 - local428) / local28.anInt5089 * local28.anInt5089;
								local213 = local377 * local181.method4124() / local28.anInt5108;
							} else {
								local213 = local181.method4124();
							}
							local377 = local181.method4134();
							local170 -= local377;
							local487 = Static157.anIntArray430[0] + arg3 - (local181.method4124() >> 1);
							local181.method4123(local487, local170);
							Static128.aClass89_3.method5453(local487, local170, local487 + local213, local170 - -local377);
							local326.method4123(local487, local170);
							Static128.aClass89_3.method5431(arg3, arg0, arg3 + arg1, arg2 + arg0);
							local170 -= 2;
						}
						if (Static223.anInt4466 > local7) {
							@Pc(523) Class22_Sub2_Sub1_Sub1 local523 = (Class22_Sub2_Sub1_Sub1) local28;
							if (local523.anInt1019 != -1) {
								local170 -= 25;
								Static86.aClass52Array5[local523.anInt1019].method4123(arg3 + Static157.anIntArray430[0] - 12, local170);
								local170 -= 2;
							}
							if (local523.anInt1001 != -1) {
								local170 -= 25;
								aClass52Array8[local523.anInt1001].method4123(arg3 + Static157.anIntArray430[0] - 12, local170);
								local170 -= 2;
							}
						} else if (local10.anInt5182 >= 0 && local10.anInt5182 < aClass52Array8.length) {
							local170 -= 25;
							local181 = aClass52Array8[local10.anInt5182];
							local181.method4123(arg3 + Static157.anIntArray430[0] - (local181.method4124() >> 1), local170);
							local170 -= 2;
						}
					}
					@Pc(608) Class50[] local608;
					@Pc(615) Class50 local615;
					@Pc(632) Class52 local632;
					if (!(local28 instanceof Class22_Sub2_Sub1_Sub1)) {
						local606 = 0;
						local608 = Static174.aClass50Array1;
						for (local274 = 0; local274 < local608.length; local274++) {
							local615 = local608[local274];
							if (local615 != null && local615.anInt1480 == 1 && local615.anInt1473 == Static257.anIntArray649[local7 - Static223.anInt4466]) {
								local632 = Static14.aClass52Array2[local615.anInt1485];
								if (local606 < local632.method4134()) {
									local606 = local632.method4134();
								}
								if (Static212.anInt4234 % 20 < 10) {
									local632.method4123(arg3 + Static157.anIntArray430[0] - 12, local170 + -local632.method4134());
								}
							}
						}
						if (local606 > 0) {
						}
					} else if (local7 >= 0) {
						local606 = 0;
						local608 = Static174.aClass50Array1;
						for (local274 = 0; local274 < local608.length; local274++) {
							local615 = local608[local274];
							if (local615 != null && local615.anInt1480 == 10 && Static314.anIntArray758[local7] == local615.anInt1473) {
								local632 = Static14.aClass52Array2[local615.anInt1485];
								if (local606 < local632.method4134()) {
									local606 = local632.method4134();
								}
								local632.method4123(Static157.anIntArray430[0] + arg3 - 12, -local632.method4134() + local170);
							}
						}
						if (local606 > 0) {
						}
					}
					for (local606 = 0; local606 < 4; local606++) {
						if (Static212.anInt4234 < local28.anIntArray664[local606]) {
							local262 = local28.method4407() / 2;
							Static156.method3002(arg1 >> 1, local28, arg2 >> 1, local262);
							if (Static157.anIntArray430[0] > -1) {
								if (local606 == 1) {
									Static157.anIntArray430[1] -= 20;
								}
								if (local606 == 2) {
									Static157.anIntArray430[0] -= 15;
									Static157.anIntArray430[1] -= 10;
								}
								if (local606 == 3) {
									Static157.anIntArray430[1] -= 10;
									Static157.anIntArray430[0] += 15;
								}
								Static143.aClass52Array11[local28.anIntArray663[local606]].method4123(arg3 + Static157.anIntArray430[0] - 12, Static157.anIntArray430[1] + -12 + arg0);
								Static36.aClass94_9.method5687(0, Integer.toString(local28.lb[local606]), -1, Static157.anIntArray430[1] + arg0 + 3, arg3 + -1 + Static157.anIntArray430[0]);
							}
						}
					}
				}
			}
		}
		@Pc(894) int local894;
		for (@Pc(889) int local889 = 0; local889 < Static320.anInt6128; local889++) {
			local894 = Static197.anIntArray539[local889];
			@Pc(903) Class22_Sub2_Sub1 local903;
			if (local894 < 2048) {
				local903 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local894];
			} else {
				local903 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local894 - 2048];
			}
			local170 = Static175.anIntArray491[local889];
			@Pc(925) Class22_Sub2_Sub1 local925;
			if (local170 >= 2048) {
				local925 = Static69.aClass22_Sub2_Sub1_Sub2Array1[local170 - 2048];
			} else {
				local925 = Static157.aClass22_Sub2_Sub1_Sub1Array1[local170];
			}
			Static184.method3383(local903, arg1, local925, --local903.anInt5097, arg2, arg3, arg0);
		}
		local894 = Static175.aClass208_3.anInt6371 + Static175.aClass208_3.anInt6381 + 2;
		for (@Pc(970) int local970 = 0; local970 < Static162.anInt2274; local970++) {
			local170 = Static24.anIntArray56[local970];
			local606 = Static24.anIntArray55[local970];
			local262 = Static24.anIntArray51[local970];
			@Pc(985) boolean local985 = true;
			while (local985) {
				local985 = false;
				for (local428 = 0; local428 < local970; local428++) {
					if (local606 + 2 > -local894 + Static24.anIntArray55[local428] && local606 - local894 < Static24.anIntArray55[local428] + 2 && local170 - local262 < Static24.anIntArray51[local428] + Static24.anIntArray56[local428] && Static24.anIntArray56[local428] - Static24.anIntArray51[local428] < local170 - -local262 && local606 > Static24.anIntArray55[local428] - local894) {
						local985 = true;
						local606 = Static24.anIntArray55[local428] - local894;
					}
				}
			}
			Static24.anIntArray55[local970] = local606;
			@Pc(1077) String local1077 = Static24.aStringArray4[local970];
			if (Static233.anInt4646 == 0) {
				local213 = 16776960;
				if (Static24.anIntArray54[local970] < 6) {
					local213 = Static195.anIntArray535[Static24.anIntArray54[local970]];
				}
				if (Static24.anIntArray54[local970] == 6) {
					local213 = Static233.anInt4634 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static24.anIntArray54[local970] == 7) {
					local213 = Static233.anInt4634 % 20 >= 10 ? 65535 : 255;
				}
				if (Static24.anIntArray54[local970] == 8) {
					local213 = Static233.anInt4634 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static24.anIntArray54[local970] == 9) {
					local377 = 150 - Static24.anIntArray52[local970];
					if (local377 < 50) {
						local213 = local377 * 1280 + 16711680;
					} else if (local377 < 100) {
						local213 = 16776960 - (local377 - 50) * 327680;
					} else if (local377 < 150) {
						local213 = (local377 - 100) * 5 + 65280;
					}
				}
				if (Static24.anIntArray54[local970] == 10) {
					local377 = 150 - Static24.anIntArray52[local970];
					if (local377 < 50) {
						local213 = local377 * 5 + 16711680;
					} else if (local377 < 100) {
						local213 = 16711935 + 16384000 - local377 * 327680;
					} else if (local377 < 150) {
						local213 = (local377 + -100) * 327680 + 255 - (local377 - 100) * 5;
					}
				}
				if (Static24.anIntArray54[local970] == 11) {
					local377 = 150 - Static24.anIntArray52[local970];
					if (local377 < 50) {
						local213 = 16777215 - local377 * 327685;
					} else if (local377 < 100) {
						local213 = (local377 - 50) * 327685 + 65280;
					} else if (local377 < 150) {
						local213 = 16777215 - (local377 - 100) * 327680;
					}
				}
				local377 = local213 | 0xFF000000;
				if (Static24.anIntArray53[local970] == 0) {
					Static149.aClass94_19.method5687(0, local1077, local377, arg0 + local606, arg3 - -local170);
				}
				if (Static24.anIntArray53[local970] == 1) {
					Static149.aClass94_19.method5690(arg0 + local606, arg3 + local170, local1077, local377, Static233.anInt4634);
				}
				if (Static24.anIntArray53[local970] == 2) {
					Static149.aClass94_19.method5695(local170 + arg3, local1077, arg0 + local606, Static233.anInt4634, local377);
				}
				if (Static24.anIntArray53[local970] == 3) {
					Static149.aClass94_19.method5682(arg0 + local606, arg3 - -local170, local377, Static233.anInt4634, local1077, 150 - Static24.anIntArray52[local970]);
				}
				if (Static24.anIntArray53[local970] == 4) {
					local487 = (150 - Static24.anIntArray52[local970]) * (Static175.aClass208_3.method5385(local1077) + 100) / 150;
					Static128.aClass89_3.method5453(arg3 + local170 - 50, arg0, local170 + arg3 + 50, arg0 - -arg2);
					Static149.aClass94_19.method5692(local170 + arg3 + 50 - local487, local377, local1077, local606 + arg0, 0);
					Static128.aClass89_3.method5431(arg3, arg0, arg3 + arg1, arg2 + arg0);
				}
				if (Static24.anIntArray53[local970] == 5) {
					local487 = 150 - Static24.anIntArray52[local970];
					@Pc(1462) int local1462 = 0;
					if (local487 < 25) {
						local1462 = local487 - 25;
					} else if (local487 > 125) {
						local1462 = local487 - 125;
					}
					@Pc(1483) int local1483 = Static175.aClass208_3.anInt6371 + Static175.aClass208_3.anInt6381;
					Static128.aClass89_3.method5453(arg3, local606 + arg0 - local1483 - 1, arg3 - -arg1, arg0 + local606 + 5);
					Static149.aClass94_19.method5687(0, local1077, local377, local1462 + arg0 + local606, local170 + arg3);
					Static128.aClass89_3.method5431(arg3, arg0, arg3 + arg1, arg2 + arg0);
				}
			} else {
				Static149.aClass94_19.method5687(0, local1077, -256, local606 + arg0, local170 + arg3);
			}
		}
	}
}
