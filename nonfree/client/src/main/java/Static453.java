import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static453 {

	@OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
	public static int anInt8515;

	@OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
	public static int anInt8519;

	@OriginalMember(owner = "client!rg", name = "b", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_104 = new Class173(28, 3);

	@OriginalMember(owner = "client!rg", name = "h", descriptor = "Lclient!wo;")
	public static final Class362 aClass362_189 = new Class362(56, -1);

	@OriginalMember(owner = "client!rg", name = "k", descriptor = "[I")
	public static final int[] anIntArray466 = new int[32];

	@OriginalMember(owner = "client!rg", name = "l", descriptor = "[I")
	public static final int[] anIntArray467 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!rg", name = "m", descriptor = "Lclient!jk;")
	public static final Class173 aClass173_105 = new Class173(11, 6);

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)V")
	public static void method6969() {
		Static332.anIntArray305 = Static222.method3621(0.4F);
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLclient!jn;)V")
	public static void method6971(@OriginalArg(1) Class176 arg0) {
		Static501.aClass176_88 = arg0;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIIBII)V")
	public static void method6972(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static413.anInt8212;
		@Pc(9) int[] local9 = Static229.anIntArray201;
		Static402.anInt7661 = 0;
		@Pc(177) int local177;
		@Pc(202) int local202;
		@Pc(257) int local257;
		@Pc(333) int local333;
		@Pc(422) int local422;
		@Pc(861) int local861;
		@Pc(552) int local552;
		for (@Pc(13) int local13 = 0; local13 < Static418.anInt7866 + local7; local13++) {
			@Pc(17) Class283 local17 = null;
			@Pc(37) Class1_Sub4_Sub2_Sub1 local37;
			if (local13 >= local7) {
				local37 = ((Class4_Sub4) Static585.aClass350_41.method8207((long) Static43.anIntArray23[local13 - local7])).aClass1_Sub4_Sub2_Sub1_Sub1_1;
				local17 = ((Class1_Sub4_Sub2_Sub1_Sub1) local37).aClass283_1;
				if (local17.anIntArray453 != null) {
					local17 = local17.method6834(Static45.aClass148_1);
					if (local17 == null) {
						continue;
					}
				}
			} else {
				local37 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local9[local13]];
			}
			if (local37.anInt8374 >= 0 && (local37.anInt8431 == Static203.anInt3850 || local37.aByte126 == Static237.aClass1_Sub4_Sub2_Sub1_Sub2_1.aByte126)) {
				Static407.method6447(arg2 >> 1, arg0 >> 1, local37, local37.method6935());
				if (Static258.anIntArray241[0] >= 0) {
					if (local37.aString76 != null && (local13 >= local7 || Static99.anInt2281 == 0 || Static99.anInt2281 == 3 || Static99.anInt2281 == 1 && Static548.method7959(((Class1_Sub4_Sub2_Sub1_Sub2) local37).aString78)) && Static416.anInt7829 > Static402.anInt7661) {
						Static416.anIntArray409[Static402.anInt7661] = Static314.aClass114_11.method2950(local37.aString76) / 2;
						Static416.anIntArray411[Static402.anInt7661] = Static258.anIntArray241[0];
						Static416.anIntArray407[Static402.anInt7661] = Static258.anIntArray241[1];
						Static416.anIntArray408[Static402.anInt7661] = local37.anInt8362;
						Static416.anIntArray412[Static402.anInt7661] = local37.anInt8430;
						Static416.anIntArray410[Static402.anInt7661] = local37.anInt8399;
						Static416.aStringArray54[Static402.anInt7661] = local37.aString76;
						Static402.anInt7661++;
					}
					local177 = arg1 + Static258.anIntArray241[1];
					@Pc(242) Class78[] local242;
					@Pc(249) Class261[] local249;
					@Pc(305) Class78 local305;
					if (local37.aBoolean590 || local37.anInt8444 <= Static106.anInt2418) {
						local177 -= Math.max(Static314.aClass114_11.anInt3289, Static31.aClass78Array2[0].u());
					} else {
						@Pc(192) byte local192 = 1;
						if (local7 <= local13) {
							local202 = local17.anInt8238;
							if (local202 == -1) {
								local202 = local37.method6921().anInt9134;
							}
						} else {
							@Pc(219) Class1_Sub4_Sub2_Sub1_Sub2 local219 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local9[local13]];
							local202 = local37.method6921().anInt9134;
							if (local219.aBoolean594) {
								local192 = 2;
							}
						}
						@Pc(231) Class78[] local231 = Static31.aClass78Array2;
						if (local202 != -1) {
							local242 = (Class78[]) Static261.aClass223_34.method5388((long) local202);
							if (local242 == null) {
								local249 = Static598.method6315(Static281.aClass176_74, local202);
								if (local249 != null) {
									local242 = new Class78[local249.length];
									for (local257 = 0; local257 < local249.length; local257++) {
										local242[local257] = Static440.aClass44_12.method5018(local249[local257], true);
									}
									Static261.aClass223_34.method5394(local242, (long) local202);
								}
							}
							if (local242 != null && local242.length >= 2) {
								local231 = local242;
							}
						}
						if (local231.length <= local192) {
							local192 = 1;
						}
						@Pc(301) Class78 local301 = local231[0];
						local305 = local231[local192];
						local177 -= Math.max(Static314.aClass114_11.anInt3289, local301.u());
						local257 = arg3 + Static258.anIntArray241[0] - (local301.E() >> 1);
						local333 = local301.E() * local37.anInt8385 / 255;
						if (local37.anInt8385 > 0 && local333 < 2) {
							local333 = 2;
						}
						local301.method8185(local257, local177);
						Static440.aClass44_12.V(local257, local177, local257 + local333, local177 + local301.u());
						local305.method8185(local257, local177);
						Static440.aClass44_12.da(arg3, arg1, arg0 + arg3, arg1 - -arg2);
					}
					local177 -= 2;
					if (!local37.aBoolean590) {
						@Pc(405) Class78 local405;
						if (Static106.anInt2418 < local37.anInt8439) {
							local405 = Static163.aClass78Array9[local37.aBoolean591 ? 2 : 0];
							@Pc(414) Class78 local414 = Static163.aClass78Array9[local37.aBoolean591 ? 3 : 1];
							if (local37 instanceof Class1_Sub4_Sub2_Sub1_Sub1) {
								local422 = local17.anInt8232;
								if (local422 == -1) {
									local422 = local37.method6921().anInt9126;
								}
							} else {
								local422 = local37.method6921().anInt9126;
							}
							if (local422 != -1) {
								local242 = (Class78[]) Static175.aClass223_18.method5388((long) local422);
								if (local242 == null) {
									local249 = Static598.method6315(Static281.aClass176_74, local422);
									if (local249 != null) {
										local242 = new Class78[local249.length];
										for (local257 = 0; local257 < local249.length; local257++) {
											local242[local257] = Static440.aClass44_12.method5018(local249[local257], true);
										}
										Static175.aClass223_18.method5394(local242, (long) local422);
									}
								}
								if (local242 != null && local242.length == 4) {
									local405 = local242[local37.aBoolean591 ? 2 : 0];
									local414 = local242[local37.aBoolean591 ? 3 : 1];
								}
							}
							@Pc(516) int local516 = local37.anInt8439 - Static106.anInt2418;
							if (local37.anInt8410 < local516) {
								local516 -= local37.anInt8410;
								local257 = local37.anInt8443 == 0 ? 0 : (local37.anInt8370 - local516) / local37.anInt8443 * local37.anInt8443;
								local552 = local405.E() * local257 / local37.anInt8370;
							} else {
								local552 = local405.E();
							}
							local257 = local405.u();
							local177 -= local257;
							local333 = Static258.anIntArray241[0] + arg3 - (local405.E() >> 1);
							local405.method8185(local333, local177);
							Static440.aClass44_12.V(local333, local177, local333 + local552, local177 - -local257);
							local414.method8185(local333, local177);
							local177 -= 2;
							Static440.aClass44_12.da(arg3, arg1, arg3 + arg0, arg1 + arg2);
						}
						if (local7 > local13) {
							@Pc(651) Class1_Sub4_Sub2_Sub1_Sub2 local651 = (Class1_Sub4_Sub2_Sub1_Sub2) local37;
							if (local651.anInt8453 != -1) {
								local177 -= 25;
								Static410.aClass78Array17[local651.anInt8453].method8185(arg3 + Static258.anIntArray241[0] - 12, local177);
								local177 -= 2;
							}
							if (local651.anInt8449 != -1) {
								local177 -= 25;
								client.lb[local651.anInt8449].method8185(arg3 + Static258.anIntArray241[0] - 12, local177);
								local177 -= 2;
							}
						} else if (local17.anInt8257 >= 0 && local17.anInt8257 < client.lb.length) {
							local177 -= 25;
							local405 = client.lb[local17.anInt8257];
							local405.method8185(Static258.anIntArray241[0] + arg3 - (local405.E() >> 1), local177);
							local177 -= 2;
						}
					}
					@Pc(703) Class366[] local703;
					@Pc(711) Class366 local711;
					if (!(local37 instanceof Class1_Sub4_Sub2_Sub1_Sub2)) {
						local202 = 0;
						local703 = Static532.aClass366Array1;
						for (local422 = 0; local422 < local703.length; local422++) {
							local711 = local703[local422];
							if (local711 != null && local711.anInt10235 == 1 && Static43.anIntArray23[local13 - local7] == local711.anInt10240) {
								local305 = Static273.aClass78Array16[local711.anInt10237];
								if (local305.u() > local202) {
									local202 = local305.u();
								}
								if (Static106.anInt2418 % 20 < 10) {
									local305.method8185(Static258.anIntArray241[0] + arg3 - 12, -local305.u() + local177);
								}
							}
						}
						if (local202 > 0) {
						}
					} else if (local13 >= 0) {
						local202 = 0;
						local703 = Static532.aClass366Array1;
						for (local422 = 0; local422 < local703.length; local422++) {
							local711 = local703[local422];
							if (local711 != null && local711.anInt10235 == 10 && local711.anInt10240 == local9[local13]) {
								local305 = Static273.aClass78Array16[local711.anInt10237];
								if (local202 < local305.u()) {
									local202 = local305.u();
								}
								local305.method8185(Static258.anIntArray241[0] + arg3 - 12, -local305.u() + local177);
							}
						}
						if (local202 > 0) {
						}
					}
					for (local202 = 0; local202 < 4; local202++) {
						if (Static106.anInt2418 < local37.anIntArray456[local202]) {
							local861 = local37.method6935() / 2;
							Static407.method6447(arg2 >> 1, arg0 >> 1, local37, local861);
							if (Static258.anIntArray241[0] > -1) {
								local422 = Static45.aClass78Array4[local37.anIntArray460[local202]].E();
								if (local202 == 1) {
									Static258.anIntArray241[1] -= 20;
								}
								if (local202 == 2) {
									Static258.anIntArray241[1] -= 10;
									Static258.anIntArray241[0] -= local422 - 9;
								}
								if (local202 == 3) {
									Static258.anIntArray241[1] -= 10;
									Static258.anIntArray241[0] += local422 - 9;
								}
								Static45.aClass78Array4[local37.anIntArray460[local202]].method8185(Static258.anIntArray241[0] + arg3 - (local422 >> 1), arg1 - -Static258.anIntArray241[1] + -12);
								Static454.aClass58_13.method8167(arg3 + Static258.anIntArray241[0] - 1, Static258.anIntArray241[1] + arg1 + 3, Integer.toString(local37.anIntArray457[local202]), -1, 0);
							}
						}
					}
				}
			}
		}
		@Pc(1011) int local1011;
		for (@Pc(1005) int local1005 = 0; local1005 < Static449.anInt8494; local1005++) {
			local1011 = Static306.anIntArray300[local1005];
			@Pc(1024) Class1_Sub4_Sub2_Sub1 local1024;
			if (local1011 >= 2048) {
				local1024 = ((Class4_Sub4) Static585.aClass350_41.method8207((long) (local1011 - 2048))).aClass1_Sub4_Sub2_Sub1_Sub1_1;
			} else {
				local1024 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local1011];
			}
			local202 = Static340.anIntArray338[local1005];
			@Pc(1049) Class1_Sub4_Sub2_Sub1 local1049;
			if (local202 >= 2048) {
				local1049 = ((Class4_Sub4) Static585.aClass350_41.method8207((long) (local202 - 2048))).aClass1_Sub4_Sub2_Sub1_Sub1_1;
			} else {
				local1049 = Static146.aClass1_Sub4_Sub2_Sub1_Sub2Array1[local202];
			}
			Static189.method3307(arg3, arg0, arg1, local1049, --local1024.anInt8367, local1024, arg2);
		}
		local1011 = Static314.aClass114_11.anInt3291 + Static314.aClass114_11.anInt3289 + 2;
		for (local177 = 0; local177 < Static402.anInt7661; local177++) {
			local202 = Static416.anIntArray411[local177];
			local861 = Static416.anIntArray407[local177];
			local422 = Static416.anIntArray409[local177];
			@Pc(1113) boolean local1113 = true;
			while (local1113) {
				local1113 = false;
				for (local552 = 0; local552 < local177; local552++) {
					if (local861 + 2 > Static416.anIntArray407[local552] + -local1011 && Static416.anIntArray407[local552] + 2 > -local1011 + local861 && local202 - local422 < Static416.anIntArray411[local552] - -Static416.anIntArray409[local552] && local202 + local422 > Static416.anIntArray411[local552] + -Static416.anIntArray409[local552] && Static416.anIntArray407[local552] - local1011 < local861) {
						local861 = Static416.anIntArray407[local552] - local1011;
						local1113 = true;
					}
				}
			}
			Static416.anIntArray407[local177] = local861;
			@Pc(1209) String local1209 = Static416.aStringArray54[local177];
			if (Static27.anInt405 == 0) {
				local257 = 16776960;
				if (Static416.anIntArray408[local177] < 6) {
					local257 = Static254.anIntArray239[Static416.anIntArray408[local177]];
				}
				if (Static416.anIntArray408[local177] == 6) {
					local257 = Static203.anInt3850 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static416.anIntArray408[local177] == 7) {
					local257 = Static203.anInt3850 % 20 < 10 ? 255 : 65535;
				}
				if (Static416.anIntArray408[local177] == 8) {
					local257 = Static203.anInt3850 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static416.anIntArray408[local177] == 9) {
					local333 = 150 - Static416.anIntArray410[local177];
					if (local333 < 50) {
						local257 = local333 * 1280 + 16711680;
					} else if (local333 < 100) {
						local257 = 33160960 - local333 * 327680;
					} else if (local333 < 150) {
						local257 = (local333 - 100) * 5 + 65280;
					}
				}
				if (Static416.anIntArray408[local177] == 10) {
					local333 = 150 - Static416.anIntArray410[local177];
					if (local333 < 50) {
						local257 = local333 * 5 + 16711680;
					} else if (local333 < 100) {
						local257 = 16711935 - (local333 - 50) * 327680;
					} else if (local333 < 150) {
						local257 = local333 * 327680 + 500 + 255 - local333 * 5 - 32768000;
					}
				}
				if (Static416.anIntArray408[local177] == 11) {
					local333 = 150 - Static416.anIntArray410[local177];
					if (local333 < 50) {
						local257 = 16777215 - local333 * 327685;
					} else if (local333 < 100) {
						local257 = (local333 - 50) * 327685 + 65280;
					} else if (local333 < 150) {
						local257 = 16777215 - (local333 - 100) * 327680;
					}
				}
				local333 = local257 | 0xFF000000;
				if (Static416.anIntArray412[local177] == 0) {
					Static552.aClass58_14.method8167(local202 + arg3, local861 + arg1, local1209, local333, -16777216);
				}
				if (Static416.anIntArray412[local177] == 1) {
					Static552.aClass58_14.method8173(local1209, Static203.anInt3850, arg3 + local202, local861 + arg1, local333);
				}
				if (Static416.anIntArray412[local177] == 2) {
					Static552.aClass58_14.method8161(Static203.anInt3850, arg1 + local861, local333, local202 + arg3, local1209);
				}
				if (Static416.anIntArray412[local177] == 3) {
					Static552.aClass58_14.method8169(local1209, arg1 + local861, Static203.anInt3850, local202 + arg3, -Static416.anIntArray410[local177] + 150, local333);
				}
				@Pc(1535) int local1535;
				if (Static416.anIntArray412[local177] == 4) {
					local1535 = (150 - Static416.anIntArray410[local177]) * (Static314.aClass114_11.method2950(local1209) + 100) / 150;
					Static440.aClass44_12.V(local202 + arg3 - 50, arg1, local202 + arg3 + 50, arg1 - -arg2);
					Static552.aClass58_14.method8156(-16777216, local333, local1209, arg1 + local861, -local1535 + 50 + local202 + arg3);
					Static440.aClass44_12.da(arg3, arg1, arg0 + arg3, arg2 + arg1);
				}
				if (Static416.anIntArray412[local177] == 5) {
					local1535 = 150 - Static416.anIntArray410[local177];
					@Pc(1594) int local1594 = 0;
					if (local1535 < 25) {
						local1594 = local1535 - 25;
					} else if (local1535 > 125) {
						local1594 = local1535 - 125;
					}
					@Pc(1618) int local1618 = Static314.aClass114_11.anInt3291 + Static314.aClass114_11.anInt3289;
					Static440.aClass44_12.V(arg3, local861 + arg1 - local1618 - 1, arg0 + arg3, local861 + arg1 + 5);
					Static552.aClass58_14.method8167(local202 + arg3, local1594 + local861 + arg1, local1209, local333, -16777216);
					Static440.aClass44_12.da(arg3, arg1, arg3 + arg0, arg2 + arg1);
				}
			} else {
				Static552.aClass58_14.method8167(local202 + arg3, local861 + arg1, local1209, -256, -16777216);
			}
		}
	}
}
