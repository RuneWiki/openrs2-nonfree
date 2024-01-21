import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!jc", name = "X", descriptor = "Lclient!b;")
	public static Class6 aClass6_2;

	@OriginalMember(owner = "client!jc", name = "L", descriptor = "Lclient!ec;")
	private static Class22 aClass22_385 = Static60.method1113("Too many incorrect logins from your address)3");

	@OriginalMember(owner = "client!jc", name = "N", descriptor = "I")
	public static int anInt1520 = 2;

	@OriginalMember(owner = "client!jc", name = "R", descriptor = "Lclient!ec;")
	public static Class22 aClass22_386 = Static60.method1113("sl_flags");

	@OriginalMember(owner = "client!jc", name = "hb", descriptor = "Lclient!ec;")
	private static Class22 aClass22_392 = Static60.method1113("Username: ");

	@OriginalMember(owner = "client!jc", name = "S", descriptor = "Lclient!ec;")
	public static Class22 aClass22_387 = aClass22_392;

	@OriginalMember(owner = "client!jc", name = "U", descriptor = "Lclient!ec;")
	public static Class22 aClass22_388 = Static60.method1113("<)4col>");

	@OriginalMember(owner = "client!jc", name = "V", descriptor = "[Lclient!re;")
	public static Class65[] aClass65Array1 = new Class65[50];

	@OriginalMember(owner = "client!jc", name = "Y", descriptor = "Lclient!ec;")
	public static Class22 aClass22_389 = Static60.method1113("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!jc", name = "ab", descriptor = "Lclient!ec;")
	public static Class22 aClass22_390 = aClass22_385;

	@OriginalMember(owner = "client!jc", name = "gb", descriptor = "Lclient!ec;")
	public static Class22 aClass22_391 = Static60.method1113(":trade:");

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "(I)V")
	public static void method1018() {
		aClass22_389 = null;
		aClass22_392 = null;
		aClass65Array1 = null;
		aClass22_388 = null;
		aClass22_391 = null;
		aClass22_387 = null;
		aClass22_386 = null;
		aClass6_2 = null;
		aClass22_385 = null;
		aClass22_390 = null;
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([Lclient!qf;ILclient!vd;)V")
	public static void method1021(@OriginalArg(0) Class60[] arg0, @OriginalArg(2) Class77 arg1) {
		@Pc(7) int local7;
		@Pc(11) int local11;
		@Pc(28) int local28;
		for (@Pc(3) int local3 = 0; local3 < 4; local3++) {
			for (local7 = 0; local7 < 104; local7++) {
				for (local11 = 0; local11 < 104; local11++) {
					if ((Static3.aByteArrayArrayArray1[local3][local7][local11] & 0x1) == 1) {
						local28 = local3;
						if ((Static3.aByteArrayArrayArray1[1][local7][local11] & 0x2) == 2) {
							local28 = local3 - 1;
						}
						if (local28 >= 0) {
							arg0[local28].method1652(local7, local11);
						}
					}
				}
			}
		}
		Static96.anInt2512 += (int) (Math.random() * 5.0D) - 2;
		Static46.anInt1290 += (int) (Math.random() * 5.0D) - 2;
		if (Static96.anInt2512 < -16) {
			Static96.anInt2512 = -16;
		}
		if (Static46.anInt1290 < -8) {
			Static46.anInt1290 = -8;
		}
		if (Static46.anInt1290 > 8) {
			Static46.anInt1290 = 8;
		}
		if (Static96.anInt2512 > 16) {
			Static96.anInt2512 = 16;
		}
		@Pc(130) int local130;
		@Pc(132) int local132;
		@Pc(136) int local136;
		@Pc(179) int local179;
		@Pc(159) int local159;
		@Pc(192) int local192;
		@Pc(198) int local198;
		@Pc(253) int local253;
		@Pc(259) int local259;
		@Pc(277) int local277;
		@Pc(249) int local249;
		@Pc(509) int local509;
		@Pc(550) int local550;
		@Pc(653) int local653;
		@Pc(663) int local663;
		@Pc(678) int local678;
		for (local7 = 0; local7 < 4; local7++) {
			@Pc(120) byte[][] local120 = Static71.aByteArrayArrayArray3[local7];
			local28 = (int) Math.sqrt(5100.0D);
			local130 = local28 * 768 >> 8;
			for (local132 = 1; local132 < 103; local132++) {
				for (local136 = 1; local136 < 103; local136++) {
					local159 = Static57.anIntArrayArrayArray4[local7][local136][local132 + 1] - Static57.anIntArrayArrayArray4[local7][local136][local132 - 1];
					local179 = Static57.anIntArrayArrayArray4[local7][local136 + 1][local132] - Static57.anIntArrayArrayArray4[local7][local136 - 1][local132];
					local192 = (int) Math.sqrt((double) (local179 * local179 + local159 * local159 + 65536));
					local198 = (local179 << 8) / local192;
					local249 = (local120[local136][local132 + 1] >> 3) + ((local120[local136 - 1][local132] >> 2) - (-(local120[local136 + 1][local132] >> 3) - (local120[local136][local132 - 1] >> 2) - (local120[local136][local132] >> 1)));
					local253 = 65536 / local192;
					local259 = (local159 << 8) / local192;
					local277 = (local253 * -10 + local198 * -50 + local259 * -50) / local130 + 96;
					Static27.anIntArrayArray3[local136][local132] = local277 - local249;
				}
			}
			for (local136 = 0; local136 < 104; local136++) {
				Static32.anIntArray92[local136] = 0;
				Static56.anIntArray157[local136] = 0;
				Static88.anIntArray270[local136] = 0;
				Static29.anIntArray76[local136] = 0;
				Static120.anIntArray314[local136] = 0;
			}
			for (local179 = -5; local179 < 109; local179++) {
				for (local159 = 0; local159 < 104; local159++) {
					local192 = local179 + 5;
					@Pc(405) int local405;
					if (local192 >= 0 && local192 < 104) {
						local198 = Static97.aByteArrayArrayArray5[local7][local192][local159] & 0xFF;
						if (local198 > 0) {
							@Pc(369) Class4_Sub1_Sub4 local369 = Static129.method1981(local198 - 1);
							Static32.anIntArray92[local159] += local369.anInt718;
							Static56.anIntArray157[local159] += local369.anInt711;
							Static88.anIntArray270[local159] += local369.anInt709;
							Static29.anIntArray76[local159] += local369.anInt719;
							local405 = Static120.anIntArray314[local159]++;
						}
					}
					local198 = local179 - 5;
					if (local198 >= 0 && local198 < 104) {
						local253 = Static97.aByteArrayArrayArray5[local7][local198][local159] & 0xFF;
						if (local253 > 0) {
							@Pc(440) Class4_Sub1_Sub4 local440 = Static129.method1981(local253 - 1);
							Static32.anIntArray92[local159] -= local440.anInt718;
							Static56.anIntArray157[local159] -= local440.anInt711;
							Static88.anIntArray270[local159] -= local440.anInt709;
							Static29.anIntArray76[local159] -= local440.anInt719;
							local405 = Static120.anIntArray314[local159]--;
						}
					}
				}
				if (local179 >= 1 && local179 < 103) {
					local192 = 0;
					local198 = 0;
					local253 = 0;
					local259 = 0;
					local277 = 0;
					for (local249 = -5; local249 < 109; local249++) {
						local509 = local249 + 5;
						if (local509 >= 0 && local509 < 104) {
							local259 += Static29.anIntArray76[local509];
							local198 += Static56.anIntArray157[local509];
							local277 += Static120.anIntArray314[local509];
							local192 += Static32.anIntArray92[local509];
							local253 += Static88.anIntArray270[local509];
						}
						local550 = local249 - 5;
						if (local550 >= 0 && local550 < 104) {
							local192 -= Static32.anIntArray92[local550];
							local259 -= Static29.anIntArray76[local550];
							local198 -= Static56.anIntArray157[local550];
							local253 -= Static88.anIntArray270[local550];
							local277 -= Static120.anIntArray314[local550];
						}
						if (local249 >= 1 && local249 < 103 && (!Static130.aBoolean279 || (Static3.aByteArrayArrayArray1[0][local179][local249] & 0x2) != 0 || (Static3.aByteArrayArrayArray1[local7][local179][local249] & 0x10) == 0 && Static30.method505(local7, local249, local179) == Static96.anInt2497)) {
							if (Static128.anInt3046 > local7) {
								Static128.anInt3046 = local7;
							}
							local653 = Static97.aByteArrayArrayArray5[local7][local179][local249] & 0xFF;
							local663 = Static92.aByteArrayArrayArray4[local7][local179][local249] & 0xFF;
							if (local653 > 0 || local663 > 0) {
								local678 = Static57.anIntArrayArrayArray4[local7][local179][local249];
								@Pc(688) int local688 = Static57.anIntArrayArrayArray4[local7][local179 + 1][local249];
								@Pc(700) int local700 = Static57.anIntArrayArrayArray4[local7][local179 + 1][local249 + 1];
								@Pc(710) int local710 = Static57.anIntArrayArrayArray4[local7][local179][local249 + 1];
								@Pc(716) int local716 = Static27.anIntArrayArray3[local179][local249];
								@Pc(726) int local726 = Static27.anIntArrayArray3[local179 + 1][local249 + 1];
								@Pc(734) int local734 = Static27.anIntArrayArray3[local179 + 1][local249];
								@Pc(736) int local736 = -1;
								@Pc(738) int local738 = -1;
								@Pc(746) int local746 = Static27.anIntArrayArray3[local179][local249 + 1];
								@Pc(762) int local762;
								@Pc(752) int local752;
								if (local653 > 0) {
									local752 = local198 / local277;
									@Pc(756) int local756 = local253 / local277;
									local762 = local192 * 256 / local259;
									local736 = Static82.method1451(local762, local756, local752);
									local756 += Static96.anInt2512;
									if (local756 < 0) {
										local756 = 0;
									} else if (local756 > 255) {
										local756 = 255;
									}
									local762 = Static46.anInt1290 + local762 & 0xFF;
									local738 = Static82.method1451(local762, local756, local752);
								}
								if (local7 > 0) {
									@Pc(807) boolean local807 = true;
									if (local653 == 0 && Static112.aByteArrayArrayArray7[local7][local179][local249] != 0) {
										local807 = false;
									}
									if (local663 > 0 && !Static43.method822(local663 - 1).aBoolean127) {
										local807 = false;
									}
									if (local807 && local678 == local688 && local700 == local678 && local710 == local678) {
										Static85.anIntArrayArrayArray5[local7][local179][local249] |= 0x924;
									}
								}
								local762 = 0;
								if (local738 != -1) {
									local762 = Static6.anIntArray13[Static104.method1727(96, local738)];
								}
								if (local663 == 0) {
									arg1.method1948(local7, local179, local249, 0, 0, -1, local678, local688, local700, local710, Static104.method1727(local716, local736), Static104.method1727(local734, local736), Static104.method1727(local726, local736), Static104.method1727(local746, local736), 0, 0, 0, 0, local762, 0);
								} else {
									local752 = Static112.aByteArrayArrayArray7[local7][local179][local249] + 1;
									@Pc(929) byte local929 = Static112.aByteArrayArrayArray6[local7][local179][local249];
									@Pc(935) Class4_Sub1_Sub6 local935 = Static43.method822(local663 - 1);
									@Pc(938) int local938 = local935.anInt1343;
									@Pc(955) int local955;
									@Pc(953) int local953;
									@Pc(975) int local975;
									@Pc(980) int local980;
									if (local938 >= 0) {
										local955 = -1;
										local953 = Static6.anInterface2_1.method1844(local938);
									} else if (local935.anInt1327 == 16711935) {
										local938 = -1;
										local953 = -2;
										local955 = -2;
									} else {
										local955 = Static82.method1451(local935.anInt1339, local935.anInt1337, local935.anInt1340);
										local975 = Static46.anInt1290 + local935.anInt1339 & 0xFF;
										local980 = Static96.anInt2512 + local935.anInt1337;
										if (local980 < 0) {
											local980 = 0;
										} else if (local980 > 255) {
											local980 = 255;
										}
										local953 = Static82.method1451(local975, local980, local935.anInt1340);
									}
									local975 = 0;
									if (local953 != -2) {
										local975 = Static6.anIntArray13[Static48.method901(local953, 96)];
									}
									if (local935.anInt1324 != -1) {
										local980 = local935.anInt1342 + Static46.anInt1290 & 0xFF;
										@Pc(1043) int local1043 = local935.anInt1331 + Static96.anInt2512;
										if (local1043 < 0) {
											local1043 = 0;
										} else if (local1043 > 255) {
											local1043 = 255;
										}
										local953 = Static82.method1451(local980, local1043, local935.anInt1326);
										local975 = Static6.anIntArray13[Static48.method901(local953, 96)];
									}
									arg1.method1948(local7, local179, local249, local752, local929, local938, local678, local688, local700, local710, Static104.method1727(local716, local736), Static104.method1727(local734, local736), Static104.method1727(local726, local736), Static104.method1727(local746, local736), Static48.method901(local955, local716), Static48.method901(local955, local734), Static48.method901(local955, local726), Static48.method901(local955, local746), local762, local975);
								}
							}
						}
					}
				}
			}
			for (local159 = 1; local159 < 103; local159++) {
				for (local192 = 1; local192 < 103; local192++) {
					arg1.method1926(local7, local192, local159, Static30.method505(local7, local159, local192));
				}
			}
			Static97.aByteArrayArrayArray5[local7] = null;
			Static92.aByteArrayArrayArray4[local7] = null;
			Static112.aByteArrayArrayArray7[local7] = null;
			Static112.aByteArrayArrayArray6[local7] = null;
			Static71.aByteArrayArrayArray3[local7] = null;
		}
		arg1.method1944();
		for (local11 = 0; local11 < 104; local11++) {
			for (local28 = 0; local28 < 104; local28++) {
				if ((Static3.aByteArrayArrayArray1[1][local11][local28] & 0x2) == 2) {
					arg1.method1961(local11, local28);
				}
			}
		}
		local28 = 1;
		local130 = 2;
		local132 = 4;
		for (local136 = 0; local136 < 4; local136++) {
			if (local136 > 0) {
				local132 <<= 0x3;
				local130 <<= 0x3;
				local28 <<= 0x3;
			}
			for (local179 = 0; local179 <= local136; local179++) {
				for (local159 = 0; local159 <= 104; local159++) {
					for (local192 = 0; local192 <= 104; local192++) {
						if ((Static85.anIntArrayArrayArray5[local179][local192][local159] & local28) != 0) {
							for (local198 = local159; local198 > 0 && (local28 & Static85.anIntArrayArrayArray5[local179][local192][local198 - 1]) != 0; local198--) {
							}
							for (local253 = local159; local253 < 104 && (local28 & Static85.anIntArrayArrayArray5[local179][local192][local253 + 1]) != 0; local253++) {
							}
							local277 = local179;
							label347: for (local259 = local179; local259 > 0; local259--) {
								for (local249 = local198; local249 <= local253; local249++) {
									if ((Static85.anIntArrayArrayArray5[local259 - 1][local192][local249] & local28) == 0) {
										break label347;
									}
								}
							}
							label336: while (local277 < local136) {
								for (local249 = local198; local249 <= local253; local249++) {
									if ((Static85.anIntArrayArrayArray5[local277 + 1][local192][local249] & local28) == 0) {
										break label336;
									}
								}
								local277++;
							}
							local249 = (local277 + 1 - local259) * (local253 + 1 - local198);
							if (local249 >= 8) {
								local550 = Static57.anIntArrayArrayArray4[local277][local192][local198] - 240;
								local653 = Static57.anIntArrayArrayArray4[local259][local192][local198];
								Static127.method1949(local136, 1, local192 * 128, local192 * 128, local198 * 128, local253 * 128 + 128, local550, local653);
								for (local663 = local259; local663 <= local277; local663++) {
									for (local678 = local198; local678 <= local253; local678++) {
										Static85.anIntArrayArrayArray5[local663][local192][local678] &= ~local28;
									}
								}
							}
						}
						if ((local130 & Static85.anIntArrayArrayArray5[local179][local192][local159]) != 0) {
							local198 = local192;
							local253 = local192;
							while (local198 > 0 && (Static85.anIntArrayArrayArray5[local179][local198 - 1][local159] & local130) != 0) {
								local198--;
							}
							local259 = local179;
							while (local253 < 104 && (local130 & Static85.anIntArrayArrayArray5[local179][local253 + 1][local159]) != 0) {
								local253++;
							}
							local277 = local179;
							label402: while (local259 > 0) {
								for (local249 = local198; local249 <= local253; local249++) {
									if ((Static85.anIntArrayArrayArray5[local259 - 1][local249][local159] & local130) == 0) {
										break label402;
									}
								}
								local259--;
							}
							label391: while (local277 < local136) {
								for (local249 = local198; local249 <= local253; local249++) {
									if ((Static85.anIntArrayArrayArray5[local277 + 1][local249][local159] & local130) == 0) {
										break label391;
									}
								}
								local277++;
							}
							local249 = (local253 + 1 - local198) * (local277 + 1 - local259);
							if (local249 >= 8) {
								local550 = Static57.anIntArrayArrayArray4[local277][local198][local159] - 240;
								local653 = Static57.anIntArrayArrayArray4[local259][local198][local159];
								Static127.method1949(local136, 2, local198 * 128, local253 * 128 + 128, local159 * 128, local159 * 128, local550, local653);
								for (local663 = local259; local663 <= local277; local663++) {
									for (local678 = local198; local678 <= local253; local678++) {
										Static85.anIntArrayArrayArray5[local663][local678][local159] &= ~local130;
									}
								}
							}
						}
						if ((Static85.anIntArrayArrayArray5[local179][local192][local159] & local132) != 0) {
							local198 = local192;
							for (local277 = local159; local277 < 104 && (local132 & Static85.anIntArrayArrayArray5[local179][local192][local277 + 1]) != 0; local277++) {
							}
							local259 = local159;
							local253 = local192;
							while (local259 > 0 && (Static85.anIntArrayArrayArray5[local179][local192][local259 - 1] & local132) != 0) {
								local259--;
							}
							label457: while (local198 > 0) {
								for (local249 = local259; local249 <= local277; local249++) {
									if ((local132 & Static85.anIntArrayArrayArray5[local179][local198 - 1][local249]) == 0) {
										break label457;
									}
								}
								local198--;
							}
							label446: while (local253 < 104) {
								for (local249 = local259; local249 <= local277; local249++) {
									if ((local132 & Static85.anIntArrayArrayArray5[local179][local253 + 1][local249]) == 0) {
										break label446;
									}
								}
								local253++;
							}
							if ((local277 + 1 - local259) * (local253 + 1 - local198) >= 4) {
								local249 = Static57.anIntArrayArrayArray4[local179][local198][local259];
								Static127.method1949(local136, 4, local198 * 128, local253 * 128 + 128, local259 * 128, local277 * 128 + 128, local249, local249);
								for (local509 = local198; local509 <= local253; local509++) {
									for (local550 = local259; local550 <= local277; local550++) {
										Static85.anIntArrayArrayArray5[local179][local509][local550] &= ~local132;
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "h", descriptor = "(I)V")
	public static void method1025() {
		if (Static4.anInt77 > 0) {
			Static75.method1271();
		} else {
			Static46.method888(40);
			Static66.aClass6_3 = Static120.aClass6_4;
			Static120.aClass6_4 = null;
		}
	}
}
