import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!im", name = "h", descriptor = "Lclient!qn;")
	public static Class211 aClass211_95;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "[J")
	public static long[] aLongArray11;

	@OriginalMember(owner = "client!im", name = "m", descriptor = "Lclient!hn;")
	public static Class4_Sub16 aClass4_Sub16_3;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "Lclient!in;")
	public static Class125 aClass125_3;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "[J")
	public static final long[] aLongArray10 = new long[100];

	@OriginalMember(owner = "client!im", name = "g", descriptor = "J")
	public static long aLong219 = -1L;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "Z")
	public static boolean aBoolean514 = false;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "[I")
	public static final int[] anIntArray553 = new int[1000];

	@OriginalMember(owner = "client!im", name = "l", descriptor = "Lclient!kg;")
	public static final Class146 aClass146_106 = new Class146(72, 4);

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(III)B")
	public static byte method5833(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 9) {
			return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(B)V")
	public static void method5836() {
		if (Static226.aClass53_1 != null) {
			Static226.aClass53_1.method5625();
		}
		if (Static413.aClass53_2 != null) {
			Static413.aClass53_2.method5625();
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(BII)I")
	public static int method5838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(40) int local40 = Static428.method5727(arg1 + 45365, arg0 + 91923, 4) + (Static428.method5727(arg1 + 10294, arg0 + 37821, 2) + -128 >> 1) + (Static428.method5727(arg1, arg0, 1) - 128 >> 2) - 128;
		local40 = (int) ((double) local40 * 0.3D) + 35;
		if (local40 < 10) {
			local40 = 10;
		} else if (local40 > 60) {
			local40 = 60;
		}
		return local40;
	}

	@OriginalMember(owner = "client!im", name = "b", descriptor = "(III)V")
	public static void method5840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class4_Sub2_Sub17 local16 = Static34.method1709(14, arg0);
		local16.method5529();
		local16.anInt6873 = arg1;
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IIIIIII)V")
	public static void method5841(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		@Pc(12) int local12 = Static438.anInt2796;
		Static210.anInt3661 = 0;
		@Pc(16) int[] local16 = Static78.anIntArray114;
		@Pc(183) int local183;
		@Pc(204) int local204;
		@Pc(258) int local258;
		@Pc(337) int local337;
		@Pc(427) int local427;
		@Pc(867) int local867;
		@Pc(555) int local555;
		for (@Pc(18) int local18 = 0; local18 < local12 + Static148.anInt2692; local18++) {
			@Pc(22) Class78 local22 = null;
			@Pc(34) Class8_Sub3_Sub1 local34;
			if (local18 >= local12) {
				local34 = Static367.aClass8_Sub3_Sub1_Sub2Array1[Static106.anIntArray150[local18 - local12]];
				local22 = ((Class8_Sub3_Sub1_Sub2) local34).aClass78_1;
				if (local22.anIntArray145 != null) {
					local22 = local22.method1547(Static52.aClass81_1);
					if (local22 == null) {
						continue;
					}
				}
			} else {
				local34 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local16[local18]];
			}
			if (local34.anInt7352 >= 0 && (local34.anInt7369 == Static129.anInt2333 || Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99 == local34.aByte99)) {
				Static52.method682(arg0 >> 1, local34, arg1 >> 1, local34.method5898());
				if (Static73.anIntArray111[0] >= 0) {
					if (local34.aString74 != null && (local18 >= local12 || Static294.anInt4824 == 0 || Static294.anInt4824 == 3 || Static294.anInt4824 == 1 && Static411.method5578(((Class8_Sub3_Sub1_Sub1) local34).aString60)) && Static334.anInt5455 > Static210.anInt3661) {
						Static334.anIntArray440[Static210.anInt3661] = Static363.aClass158_11.method3038(local34.aString74) / 2;
						Static334.anIntArray435[Static210.anInt3661] = Static73.anIntArray111[0];
						Static334.anIntArray433[Static210.anInt3661] = Static73.anIntArray111[1];
						Static334.anIntArray438[Static210.anInt3661] = local34.anInt7395;
						Static334.anIntArray436[Static210.anInt3661] = local34.anInt7417;
						Static334.anIntArray439[Static210.anInt3661] = local34.anInt7424;
						Static334.aStringArray37[Static210.anInt3661] = local34.aString74;
						Static210.anInt3661++;
					}
					local183 = Static73.anIntArray111[1] + arg2;
					@Pc(243) Class95[] local243;
					@Pc(250) Class216[] local250;
					@Pc(308) Class95 local308;
					if (local34.aBoolean522 || Static265.anInt4371 >= local34.anInt7415) {
						local183 -= Math.max(Static363.aClass158_11.anInt3838, Static18.aClass95Array1[0].ma());
					} else {
						@Pc(194) byte local194 = 1;
						if (local12 <= local18) {
							local204 = local22.anInt1890;
							if (local204 == -1) {
								local204 = local34.method5892().anInt1019;
							}
						} else {
							@Pc(220) Class8_Sub3_Sub1_Sub1 local220 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local16[local18]];
							local204 = local34.method5892().anInt1019;
							if (local220.aBoolean399) {
								local194 = 2;
							}
						}
						@Pc(232) Class95[] local232 = Static18.aClass95Array1;
						if (local204 != -1) {
							local243 = (Class95[]) Static46.aClass137_7.method2744((long) local204);
							if (local243 == null) {
								local250 = Static465.method4468(Static13.aClass211_11, local204);
								if (local250 != null) {
									local243 = new Class95[local250.length];
									for (local258 = 0; local258 < local250.length; local258++) {
										local243[local258] = Static39.aClass135_1.method5379(local250[local258]);
									}
									Static46.aClass137_7.method2732((long) local204, local243);
								}
							}
							if (local243 != null && local243.length >= 2) {
								local232 = local243;
							}
						}
						if (local194 >= local232.length) {
							local194 = 1;
						}
						@Pc(304) Class95 local304 = local232[0];
						local308 = local232[local194];
						local183 -= Math.max(Static363.aClass158_11.anInt3838, local304.ma());
						local258 = arg3 + Static73.anIntArray111[0] - (local304.la() >> 1);
						local337 = local304.la() * local34.anInt7362 / 255;
						if (local34.anInt7362 > 0 && local337 < 2) {
							local337 = 2;
						}
						local304.method5821(local258, local183);
						Static39.aClass135_1.fa(local258, local183, local258 + local337, local183 - -local304.ma());
						local308.method5821(local258, local183);
						Static39.aClass135_1.OA(arg3, arg2, arg1 + arg3, arg2 - -arg0);
					}
					local183 -= 2;
					if (!local34.aBoolean522) {
						@Pc(408) Class95 local408;
						if (local34.anInt7379 > Static265.anInt4371) {
							local408 = Static69.aClass95Array7[local34.aBoolean520 ? 2 : 0];
							@Pc(417) Class95 local417 = Static69.aClass95Array7[local34.aBoolean520 ? 3 : 1];
							if (local34 instanceof Class8_Sub3_Sub1_Sub2) {
								local427 = local22.anInt1898;
								if (local427 == -1) {
									local427 = local34.method5892().anInt1006;
								}
							} else {
								local427 = local34.method5892().anInt1006;
							}
							if (local427 != -1) {
								local243 = (Class95[]) Static148.aClass137_24.method2744((long) local427);
								if (local243 == null) {
									local250 = Static465.method4468(Static13.aClass211_11, local427);
									if (local250 != null) {
										local243 = new Class95[local250.length];
										for (local258 = 0; local258 < local250.length; local258++) {
											local243[local258] = Static39.aClass135_1.method5379(local250[local258]);
										}
										Static148.aClass137_24.method2732((long) local427, local243);
									}
								}
								if (local243 != null && local243.length == 4) {
									local417 = local243[local34.aBoolean520 ? 3 : 1];
									local408 = local243[local34.aBoolean520 ? 2 : 0];
								}
							}
							@Pc(522) int local522 = local34.anInt7379 - Static265.anInt4371;
							if (local522 > local34.anInt7396) {
								local522 -= local34.anInt7396;
								local258 = local34.anInt7361 == 0 ? 0 : (local34.anInt7356 - local522) / local34.anInt7361 * local34.anInt7361;
								local555 = local258 * local408.la() / local34.anInt7356;
							} else {
								local555 = local408.la();
							}
							local258 = local408.ma();
							local183 -= local258;
							local337 = Static73.anIntArray111[0] + arg3 - (local408.la() >> 1);
							local408.method5821(local337, local183);
							Static39.aClass135_1.fa(local337, local183, local555 + local337, local183 - -local258);
							local417.method5821(local337, local183);
							Static39.aClass135_1.OA(arg3, arg2, arg3 + arg1, arg0 + arg2);
							local183 -= 2;
						}
						if (local12 > local18) {
							@Pc(618) Class8_Sub3_Sub1_Sub1 local618 = (Class8_Sub3_Sub1_Sub1) local34;
							if (local618.anInt5662 != -1) {
								local183 -= 25;
								Static384.aClass95Array14[local618.anInt5662].method5821(Static73.anIntArray111[0] + arg3 - 12, local183);
								local183 -= 2;
							}
							if (local618.anInt5675 != -1) {
								local183 -= 25;
								Static112.aClass95Array5[local618.anInt5675].method5821(arg3 + Static73.anIntArray111[0] - 12, local183);
								local183 -= 2;
							}
						} else if (local22.anInt1897 >= 0 && Static112.aClass95Array5.length > local22.anInt1897) {
							local183 -= 25;
							local408 = Static112.aClass95Array5[local22.anInt1897];
							local408.method5821(arg3 + Static73.anIntArray111[0] - (local408.la() >> 1), local183);
							local183 -= 2;
						}
					}
					@Pc(704) Class133[] local704;
					@Pc(712) Class133 local712;
					if (!(local34 instanceof Class8_Sub3_Sub1_Sub1)) {
						local204 = 0;
						local704 = Static62.aClass133Array1;
						for (local427 = 0; local427 < local704.length; local427++) {
							local712 = local704[local427];
							if (local712 != null && local712.anInt3345 == 1 && Static106.anIntArray150[local18 - local12] == local712.anInt3347) {
								local308 = Static412.aClass95Array15[local712.anInt3343];
								if (local204 < local308.ma()) {
									local204 = local308.ma();
								}
								if (Static265.anInt4371 % 20 < 10) {
									local308.method5821(Static73.anIntArray111[0] + arg3 - 12, -local308.ma() + local183);
								}
							}
						}
						if (local204 > 0) {
						}
					} else if (local18 >= 0) {
						local204 = 0;
						local704 = Static62.aClass133Array1;
						for (local427 = 0; local427 < local704.length; local427++) {
							local712 = local704[local427];
							if (local712 != null && local712.anInt3345 == 10 && local712.anInt3347 == local16[local18]) {
								local308 = Static412.aClass95Array15[local712.anInt3343];
								if (local308.ma() > local204) {
									local204 = local308.ma();
								}
								local308.method5821(Static73.anIntArray111[0] + arg3 - 12, -local308.ma() + local183);
							}
						}
						if (local204 > 0) {
						}
					}
					for (local204 = 0; local204 < 4; local204++) {
						if (Static265.anInt4371 < local34.anIntArray556[local204]) {
							local867 = local34.method5898() / 2;
							Static52.method682(arg0 >> 1, local34, arg1 >> 1, local867);
							if (Static73.anIntArray111[0] > -1) {
								local427 = Static274.aClass95Array9[local34.anIntArray557[local204]].la();
								if (local204 == 1) {
									Static73.anIntArray111[1] -= 20;
								}
								if (local204 == 2) {
									Static73.anIntArray111[1] -= 10;
									Static73.anIntArray111[0] -= local427 - 9;
								}
								if (local204 == 3) {
									Static73.anIntArray111[0] += local427 - 9;
									Static73.anIntArray111[1] -= 10;
								}
								Static274.aClass95Array9[local34.anIntArray557[local204]].method5821(Static73.anIntArray111[0] + arg3 - (local427 >> 1), Static73.anIntArray111[1] + -12 + arg2);
								Static378.aClass123_7.method5788(arg2 + Static73.anIntArray111[1] + 3, arg3 + Static73.anIntArray111[0] + -1, 0, Integer.toString(local34.anIntArray558[local204]), -1);
							}
						}
					}
				}
			}
		}
		@Pc(1013) int local1013;
		for (@Pc(1007) int local1007 = 0; local1007 < Static147.anInt2679; local1007++) {
			local1013 = Static238.anIntArray334[local1007];
			@Pc(1022) Class8_Sub3_Sub1 local1022;
			if (local1013 >= 2048) {
				local1022 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local1013 - 2048];
			} else {
				local1022 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local1013];
			}
			local204 = Static326.anIntArray428[local1007];
			@Pc(1039) Class8_Sub3_Sub1 local1039;
			if (local204 < 2048) {
				local1039 = Static267.aClass8_Sub3_Sub1_Sub1Array1[local204];
			} else {
				local1039 = Static367.aClass8_Sub3_Sub1_Sub2Array1[local204 - 2048];
			}
			Static43.method2900(--local1022.anInt7410, arg2, local1039, arg1, local1022, arg0, arg3);
		}
		local1013 = Static363.aClass158_11.anInt3839 + Static363.aClass158_11.anInt3838 + 2;
		for (local183 = 0; local183 < Static210.anInt3661; local183++) {
			local204 = Static334.anIntArray435[local183];
			local867 = Static334.anIntArray433[local183];
			local427 = Static334.anIntArray440[local183];
			@Pc(1098) boolean local1098 = true;
			while (local1098) {
				local1098 = false;
				for (local555 = 0; local555 < local183; local555++) {
					if (local867 + 2 > Static334.anIntArray433[local555] + -local1013 && Static334.anIntArray433[local555] + 2 > local867 - local1013 && Static334.anIntArray435[local555] + Static334.anIntArray440[local555] > local204 - local427 && local204 + local427 > Static334.anIntArray435[local555] + -Static334.anIntArray440[local555] && local867 > Static334.anIntArray433[local555] - local1013) {
						local867 = Static334.anIntArray433[local555] - local1013;
						local1098 = true;
					}
				}
			}
			Static334.anIntArray433[local183] = local867;
			@Pc(1193) String local1193 = Static334.aStringArray37[local183];
			if (Static220.anInt3783 == 0) {
				local258 = 16776960;
				if (Static334.anIntArray438[local183] < 6) {
					local258 = Static367.anIntArray476[Static334.anIntArray438[local183]];
				}
				if (Static334.anIntArray438[local183] == 6) {
					local258 = Static129.anInt2333 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static334.anIntArray438[local183] == 7) {
					local258 = Static129.anInt2333 % 20 < 10 ? 255 : 65535;
				}
				if (Static334.anIntArray438[local183] == 8) {
					local258 = Static129.anInt2333 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static334.anIntArray438[local183] == 9) {
					local337 = 150 - Static334.anIntArray439[local183];
					if (local337 < 50) {
						local258 = local337 * 1280 + 16711680;
					} else if (local337 < 100) {
						local258 = 16776960 - (local337 - 50) * 327680;
					} else if (local337 < 150) {
						local258 = (local337 - 100) * 5 + 65280;
					}
				}
				if (Static334.anIntArray438[local183] == 10) {
					local337 = 150 - Static334.anIntArray439[local183];
					if (local337 < 50) {
						local258 = local337 * 5 + 16711680;
					} else if (local337 < 100) {
						local258 = 33095935 - local337 * 327680;
					} else if (local337 < 150) {
						local258 = (local337 + -100) * 327680 + 500 + 255 - local337 * 5;
					}
				}
				if (Static334.anIntArray438[local183] == 11) {
					local337 = 150 - Static334.anIntArray439[local183];
					if (local337 < 50) {
						local258 = 16777215 - local337 * 327685;
					} else if (local337 < 100) {
						local258 = local337 * 327685 + 65280 - 16384250;
					} else if (local337 < 150) {
						local258 = 16777215 - (local337 - 100) * 327680;
					}
				}
				local337 = local258 | 0xFF000000;
				if (Static334.anIntArray436[local183] == 0) {
					Static49.aClass123_1.method5788(local867 + arg2, arg3 + local204, -16777216, local1193, local337);
				}
				if (Static334.anIntArray436[local183] == 1) {
					Static49.aClass123_1.method5793(local867 + arg2, local204 + arg3, local1193, Static129.anInt2333, local337);
				}
				if (Static334.anIntArray436[local183] == 2) {
					Static49.aClass123_1.method5797(Static129.anInt2333, arg2 + local867, local337, local1193, local204 + arg3);
				}
				if (Static334.anIntArray436[local183] == 3) {
					Static49.aClass123_1.method5794(local867 + arg2, 150 - Static334.anIntArray439[local183], local337, local204 + arg3, Static129.anInt2333, local1193);
				}
				@Pc(1545) int local1545;
				if (Static334.anIntArray436[local183] == 4) {
					local1545 = (150 - Static334.anIntArray439[local183]) * (Static363.aClass158_11.method3038(local1193) + 100) / 150;
					Static39.aClass135_1.fa(arg3 + local204 - 50, arg2, arg3 + local204 + 50, arg2 - -arg0);
					Static49.aClass123_1.method5784(arg3 + local204 + 50 - local1545, local337, local1193, -16777216, local867 + arg2);
					Static39.aClass135_1.OA(arg3, arg2, arg1 + arg3, arg0 + arg2);
				}
				if (Static334.anIntArray436[local183] == 5) {
					local1545 = 150 - Static334.anIntArray439[local183];
					@Pc(1605) int local1605 = 0;
					if (local1545 < 25) {
						local1605 = local1545 - 25;
					} else if (local1545 > 125) {
						local1605 = local1545 - 125;
					}
					@Pc(1627) int local1627 = Static363.aClass158_11.anInt3839 + Static363.aClass158_11.anInt3838;
					Static39.aClass135_1.fa(arg3, arg2 + local867 - local1627 - 1, arg3 + arg1, local867 + arg2 + 5);
					Static49.aClass123_1.method5788(local867 + arg2 + local1605, local204 + arg3, -16777216, local1193, local337);
					Static39.aClass135_1.OA(arg3, arg2, arg1 + arg3, arg0 + arg2);
				}
			} else {
				Static49.aClass123_1.method5788(local867 + arg2, arg3 - -local204, -16777216, local1193, -256);
			}
		}
	}
}
