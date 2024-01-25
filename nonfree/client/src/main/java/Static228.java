import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static228 {

	@OriginalMember(owner = "client!iga", name = "q", descriptor = "J")
	public static long aLong102;

	@OriginalMember(owner = "client!iga", name = "t", descriptor = "[Lclient!su;")
	public static Class318[] aClass318Array1;

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(III)Z")
	public static boolean method2765(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x22) != 0;
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(IILclient!mv;IIZ)V")
	public static void method2769(@OriginalArg(1) int arg0, @OriginalArg(2) Class229 arg1, @OriginalArg(4) int arg2) {
		Static23.method328(arg2, arg1, arg0, 0L);
	}

	@OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZIIIIII)V")
	public static void method2770(@OriginalArg(1) int arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static84.anInt9548;
		@Pc(9) int[] local9 = Static520.anIntArray555;
		Static176.anInt2654 = 0;
		@Pc(170) int local170;
		@Pc(211) int local211;
		@Pc(257) int local257;
		@Pc(329) int local329;
		@Pc(408) int local408;
		@Pc(861) int local861;
		@Pc(515) int local515;
		for (@Pc(13) int local13 = 0; local13 < Static365.anInt6148 + local7; local13++) {
			@Pc(17) Class295 local17 = null;
			@Pc(26) Class12_Sub2_Sub1_Sub4 local26;
			if (local7 > local13) {
				local26 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local9[local13]];
			} else {
				local26 = ((Class2_Sub5) Static436.aClass90_26.method1685((long) Static461.anIntArray562[local13 - local7])).aClass12_Sub2_Sub1_Sub4_Sub2_1;
				local17 = ((Class12_Sub2_Sub1_Sub4_Sub2) local26).aClass295_1;
				if (local17.anIntArray493 != null) {
					local17 = local17.method5942(Static426.aClass160_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local26.anInt8399 >= 0 && (Static388.anInt6397 == local26.anInt8413 || local26.aByte128 == Static332.aClass12_Sub2_Sub1_Sub4_Sub1_30.aByte128)) {
				Static347.method5023(arg2 >> 1, local26, arg3 >> 1, local26.method6778());
				if (Static494.anIntArray527[0] >= 0) {
					if (local26.aString126 != null && (local13 >= local7 || Static190.anInt2789 == 0 || Static190.anInt2789 == 3 || Static190.anInt2789 == 1 && Static502.method6526(((Class12_Sub2_Sub1_Sub4_Sub1) local26).aString75)) && Static176.anInt2654 < Static499.anInt7960) {
						Static499.anIntArray537[Static176.anInt2654] = Static537.aClass112_11.method2078(local26.aString126) / 2;
						Static499.anIntArray532[Static176.anInt2654] = Static494.anIntArray527[0];
						Static499.anIntArray536[Static176.anInt2654] = Static494.anIntArray527[1];
						Static499.anIntArray533[Static176.anInt2654] = local26.anInt8417;
						Static499.anIntArray531[Static176.anInt2654] = local26.anInt8411;
						Static499.anIntArray534[Static176.anInt2654] = local26.anInt8391;
						Static499.aStringArray39[Static176.anInt2654] = local26.aString126;
						Static176.anInt2654++;
					}
					local170 = Static494.anIntArray527[1] + arg1;
					@Pc(242) Class38[] local242;
					@Pc(249) Class344[] local249;
					@Pc(301) Class38 local301;
					if (local26.aBoolean709 || Static532.anInt8757 >= local26.anInt8354) {
						local170 -= Math.max(Static537.aClass112_11.anInt2421, Static400.aClass38Array23[0].u());
					} else {
						@Pc(197) byte local197 = 1;
						if (local13 < local7) {
							@Pc(206) Class12_Sub2_Sub1_Sub4_Sub1 local206 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local9[local13]];
							local211 = local26.method6767().anInt1330;
							if (local206.aBoolean462) {
								local197 = 2;
							}
						} else {
							local211 = local17.anInt7342;
							if (local211 == -1) {
								local211 = local26.method6767().anInt1330;
							}
						}
						@Pc(232) Class38[] local232 = Static400.aClass38Array23;
						if (local211 != -1) {
							local242 = (Class38[]) Static531.aClass21_83.method324((long) local211);
							if (local242 == null) {
								local249 = Static603.method7121(Static241.aClass229_54, local211);
								if (local249 != null) {
									local242 = new Class38[local249.length];
									for (local257 = 0; local257 < local249.length; local257++) {
										local242[local257] = Static417.aClass162_17.method6845(local249[local257], true);
									}
									Static531.aClass21_83.method317(local242, (long) local211);
								}
							}
							if (local242 != null && local242.length >= 2) {
								local232 = local242;
							}
						}
						if (local197 >= local232.length) {
							local197 = 1;
						}
						@Pc(297) Class38 local297 = local232[0];
						local301 = local232[local197];
						local170 -= Math.max(Static537.aClass112_11.anInt2421, local297.u());
						local257 = arg0 + Static494.anIntArray527[0] - (local297.E() >> 1);
						local329 = local297.E() * local26.anInt8348 / 255;
						if (local26.anInt8348 > 0 && local329 < 2) {
							local329 = 2;
						}
						local297.method7463(local257, local170);
						Static417.aClass162_17.V(local257, local170, local257 + local329, local170 - -local297.u());
						local301.method7463(local257, local170);
						Static417.aClass162_17.da(arg0, arg1, arg3 + arg0, arg2 + arg1);
					}
					local170 -= 2;
					if (!local26.aBoolean709) {
						@Pc(391) Class38 local391;
						if (local26.anInt8356 > Static532.anInt8757) {
							local391 = Static85.aClass38Array6[local26.aBoolean708 ? 2 : 0];
							@Pc(400) Class38 local400 = Static85.aClass38Array6[local26.aBoolean708 ? 3 : 1];
							if (local26 instanceof Class12_Sub2_Sub1_Sub4_Sub2) {
								local408 = local17.anInt7356;
								if (local408 == -1) {
									local408 = local26.method6767().anInt1313;
								}
							} else {
								local408 = local26.method6767().anInt1313;
							}
							if (local408 != -1) {
								local242 = (Class38[]) Static211.aClass21_34.method324((long) local408);
								if (local242 == null) {
									local249 = Static603.method7121(Static241.aClass229_54, local408);
									if (local249 != null) {
										local242 = new Class38[local249.length];
										for (local257 = 0; local257 < local249.length; local257++) {
											local242[local257] = Static417.aClass162_17.method6845(local249[local257], true);
										}
										Static211.aClass21_34.method317(local242, (long) local408);
									}
								}
								if (local242 != null && local242.length == 4) {
									local391 = local242[local26.aBoolean708 ? 2 : 0];
									local400 = local242[local26.aBoolean708 ? 3 : 1];
								}
							}
							@Pc(508) int local508 = local26.anInt8356 - Static532.anInt8757;
							if (local26.anInt8375 >= local508) {
								local515 = local391.E();
							} else {
								local508 -= local26.anInt8375;
								local257 = local26.anInt8373 == 0 ? 0 : local26.anInt8373 * ((local26.anInt8403 - local508) / local26.anInt8373);
								local515 = local257 * local391.E() / local26.anInt8403;
							}
							local257 = local391.u();
							local170 -= local257;
							local329 = Static494.anIntArray527[0] + arg0 - (local391.E() >> 1);
							local391.method7463(local329, local170);
							Static417.aClass162_17.V(local329, local170, local515 + local329, local257 + local170);
							local400.method7463(local329, local170);
							Static417.aClass162_17.da(arg0, arg1, arg0 + arg3, arg2 + arg1);
							local170 -= 2;
						}
						if (local13 < local7) {
							@Pc(639) Class12_Sub2_Sub1_Sub4_Sub1 local639 = (Class12_Sub2_Sub1_Sub4_Sub1) local26;
							if (local639.anInt5828 != -1) {
								local170 -= 25;
								Static580.aClass38Array28[local639.anInt5828].method7463(Static494.anIntArray527[0] + arg0 - 12, local170);
								local170 -= 2;
							}
							if (local639.anInt5823 != -1) {
								local170 -= 25;
								Static556.aClass38Array27[local639.anInt5823].method7463(Static494.anIntArray527[0] + arg0 - 12, local170);
								local170 -= 2;
							}
						} else if (local17.anInt7336 >= 0 && Static556.aClass38Array27.length > local17.anInt7336) {
							local170 -= 25;
							local391 = Static556.aClass38Array27[local17.anInt7336];
							local391.method7463(arg0 + Static494.anIntArray527[0] - (local391.E() >> 1), local170);
							local170 -= 2;
						}
					}
					@Pc(690) Class80[] local690;
					@Pc(698) Class80 local698;
					if (!(local26 instanceof Class12_Sub2_Sub1_Sub4_Sub1)) {
						local211 = 0;
						local690 = Static271.aClass80Array1;
						for (local408 = 0; local408 < local690.length; local408++) {
							local698 = local690[local408];
							if (local698 != null && local698.anInt1806 == 1 && local698.anInt1798 == Static461.anIntArray562[local13 - local7]) {
								local301 = Static317.aClass38Array17[local698.anInt1801];
								if (local301.u() > local211) {
									local211 = local301.u();
								}
								if (Static532.anInt8757 % 20 < 10) {
									local301.method7463(arg0 + Static494.anIntArray527[0] - 12, local170 - local301.u());
								}
							}
						}
						if (local211 > 0) {
						}
					} else if (local13 >= 0) {
						local211 = 0;
						local690 = Static271.aClass80Array1;
						for (local408 = 0; local408 < local690.length; local408++) {
							local698 = local690[local408];
							if (local698 != null && local698.anInt1806 == 10 && local698.anInt1798 == local9[local13]) {
								local301 = Static317.aClass38Array17[local698.anInt1801];
								if (local301.u() > local211) {
									local211 = local301.u();
								}
								local301.method7463(arg0 + Static494.anIntArray527[0] - 12, -local301.u() + local170);
							}
						}
						if (local211 > 0) {
						}
					}
					for (local211 = 0; local211 < 4; local211++) {
						if (Static532.anInt8757 < local26.anIntArray561[local211]) {
							local861 = local26.method6778() / 2;
							Static347.method5023(arg2 >> 1, local26, arg3 >> 1, local861);
							if (Static494.anIntArray527[0] > -1) {
								local408 = Static482.aClass38Array24[local26.anIntArray563[local211]].E();
								if (local211 == 1) {
									Static494.anIntArray527[1] -= 20;
								}
								if (local211 == 2) {
									Static494.anIntArray527[1] -= 10;
									Static494.anIntArray527[0] -= local408 - 9;
								}
								if (local211 == 3) {
									Static494.anIntArray527[1] -= 10;
									Static494.anIntArray527[0] += local408 - 9;
								}
								Static482.aClass38Array24[local26.anIntArray563[local211]].method7463(arg0 + Static494.anIntArray527[0] - (local408 >> 1), arg1 + (Static494.anIntArray527[1] - 12));
								Static71.aClass37_11.method7724(-1, 0, Integer.toString(local26.anIntArray564[local211]), Static494.anIntArray527[1] + arg1 + 3, arg0 + -1 + Static494.anIntArray527[0]);
							}
						}
					}
				}
			}
		}
		@Pc(1003) int local1003;
		for (@Pc(997) int local997 = 0; local997 < Static79.anInt7818; local997++) {
			local1003 = Static136.anIntArray183[local997];
			@Pc(1016) Class12_Sub2_Sub1_Sub4 local1016;
			if (local1003 >= 2048) {
				local1016 = ((Class2_Sub5) Static436.aClass90_26.method1685((long) (local1003 - 2048))).aClass12_Sub2_Sub1_Sub4_Sub2_1;
			} else {
				local1016 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local1003];
			}
			local211 = Static128.anIntArray178[local997];
			@Pc(1035) Class12_Sub2_Sub1_Sub4 local1035;
			if (local211 < 2048) {
				local1035 = Static520.aClass12_Sub2_Sub1_Sub4_Sub1Array1[local211];
			} else {
				local1035 = ((Class2_Sub5) Static436.aClass90_26.method1685((long) (local211 - 2048))).aClass12_Sub2_Sub1_Sub4_Sub2_1;
			}
			Static58.method1014(local1016, --local1016.anInt8377, arg1, local1035, arg3, arg0, arg2);
		}
		local1003 = Static537.aClass112_11.anInt2430 + Static537.aClass112_11.anInt2421 + 2;
		for (local170 = 0; local170 < Static176.anInt2654; local170++) {
			local211 = Static499.anIntArray532[local170];
			local861 = Static499.anIntArray536[local170];
			local408 = Static499.anIntArray537[local170];
			@Pc(1099) boolean local1099 = true;
			while (local1099) {
				local1099 = false;
				for (local515 = 0; local515 < local170; local515++) {
					if (Static499.anIntArray536[local515] - local1003 < local861 + 2 && Static499.anIntArray536[local515] + 2 > -local1003 + local861 && local211 - local408 < Static499.anIntArray537[local515] + Static499.anIntArray532[local515] && Static499.anIntArray532[local515] - Static499.anIntArray537[local515] < local408 + local211 && local861 > Static499.anIntArray536[local515] - local1003) {
						local861 = Static499.anIntArray536[local515] - local1003;
						local1099 = true;
					}
				}
			}
			Static499.anIntArray536[local170] = local861;
			@Pc(1198) String local1198 = Static499.aStringArray39[local170];
			if (Static276.anInt4780 == 0) {
				local257 = 16776960;
				if (Static499.anIntArray533[local170] < 6) {
					local257 = Static23.anIntArray49[Static499.anIntArray533[local170]];
				}
				if (Static499.anIntArray533[local170] == 6) {
					local257 = Static388.anInt6397 % 20 < 10 ? 16711680 : 16776960;
				}
				if (Static499.anIntArray533[local170] == 7) {
					local257 = Static388.anInt6397 % 20 >= 10 ? 65535 : 255;
				}
				if (Static499.anIntArray533[local170] == 8) {
					local257 = Static388.anInt6397 % 20 < 10 ? 45056 : 8454016;
				}
				if (Static499.anIntArray533[local170] == 9) {
					local329 = 150 - Static499.anIntArray534[local170];
					if (local329 < 50) {
						local257 = local329 * 1280 + 16711680;
					} else if (local329 < 100) {
						local257 = 33160960 - local329 * 327680;
					} else if (local329 < 150) {
						local257 = (local329 - 100) * 5 + 65280;
					}
				}
				if (Static499.anIntArray533[local170] == 10) {
					local329 = 150 - Static499.anIntArray534[local170];
					if (local329 < 50) {
						local257 = local329 * 5 + 16711680;
					} else if (local329 < 100) {
						local257 = 16711935 - (local329 - 50) * 327680;
					} else if (local329 < 150) {
						local257 = (local329 - 100) * 327680 + 255 - (local329 - 100) * 5;
					}
				}
				if (Static499.anIntArray533[local170] == 11) {
					local329 = 150 - Static499.anIntArray534[local170];
					if (local329 < 50) {
						local257 = 16777215 - local329 * 327685;
					} else if (local329 < 100) {
						local257 = (local329 - 50) * 327685 + 65280;
					} else if (local329 < 150) {
						local257 = 32768000 + 16777215 - local329 * 327680;
					}
				}
				local329 = local257 | 0xFF000000;
				if (Static499.anIntArray531[local170] == 0) {
					Static81.aClass37_16.method7724(local329, -16777216, local1198, local861 + arg1, arg0 + local211);
				}
				if (Static499.anIntArray531[local170] == 1) {
					Static81.aClass37_16.method7721(Static388.anInt6397, local329, local861 + arg1, arg0 - -local211, local1198);
				}
				if (Static499.anIntArray531[local170] == 2) {
					Static81.aClass37_16.method7718(local329, local1198, arg1 + local861, arg0 - -local211, Static388.anInt6397);
				}
				if (Static499.anIntArray531[local170] == 3) {
					Static81.aClass37_16.method7715(local211 + arg0, Static388.anInt6397, arg1 + local861, local329, 150 - Static499.anIntArray534[local170], local1198);
				}
				@Pc(1529) int local1529;
				if (Static499.anIntArray531[local170] == 4) {
					local1529 = (150 - Static499.anIntArray534[local170]) * (Static537.aClass112_11.method2078(local1198) + 100) / 150;
					Static417.aClass162_17.V(arg0 + local211 - 50, arg1, arg0 + local211 + 50, arg1 - -arg2);
					Static81.aClass37_16.method7723(local211 + arg0 + 50 - local1529, local1198, local329, arg1 + local861, -16777216);
					Static417.aClass162_17.da(arg0, arg1, arg3 + arg0, arg2 + arg1);
				}
				if (Static499.anIntArray531[local170] == 5) {
					local1529 = 150 - Static499.anIntArray534[local170];
					@Pc(1589) int local1589 = 0;
					if (local1529 < 25) {
						local1589 = local1529 - 25;
					} else if (local1529 > 125) {
						local1589 = local1529 - 125;
					}
					@Pc(1615) int local1615 = Static537.aClass112_11.anInt2421 + Static537.aClass112_11.anInt2430;
					Static417.aClass162_17.V(arg0, arg1 + local861 - local1615 - 1, arg3 + arg0, local861 + arg1 + 5);
					Static81.aClass37_16.method7724(local329, -16777216, local1198, local1589 + arg1 + local861, local211 + arg0);
					Static417.aClass162_17.da(arg0, arg1, arg3 + arg0, arg2 + arg1);
				}
			} else {
				Static81.aClass37_16.method7724(-256, -16777216, local1198, local861 + arg1, local211 + arg0);
			}
		}
	}
}
