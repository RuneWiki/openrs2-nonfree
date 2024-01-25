import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static204 {

	@OriginalMember(owner = "client!hda", name = "j", descriptor = "Lclient!jf;")
	public static final Class168 aClass168_6 = new Class168(3, 7);

	@OriginalMember(owner = "client!hda", name = "q", descriptor = "Z")
	public static volatile boolean aBoolean247 = true;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IIIZIII)V")
	public static void method2870(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		@Pc(7) int local7 = Static580.anInt9430;
		@Pc(9) int[] local9 = Static6.anIntArray9;
		Static543.anInt8918 = 0;
		@Pc(179) int local179;
		@Pc(204) int local204;
		@Pc(259) int local259;
		@Pc(338) int local338;
		@Pc(341) int local341;
		@Pc(439) int local439;
		@Pc(542) int local542;
		@Pc(1039) int local1039;
		for (@Pc(13) int local13 = 0; local13 < local7 + Static639.anInt10306; local13++) {
			@Pc(17) Class150 local17 = null;
			@Pc(30) Class13_Sub1_Sub1_Sub1 local30;
			if (local7 > local13) {
				local30 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local9[local13]];
			} else {
				local30 = ((Class2_Sub43) Static440.aClass118_41.method2595((long) Static147.anIntArray182[local13 - local7])).aClass13_Sub1_Sub1_Sub1_Sub1_2;
				local17 = ((Class13_Sub1_Sub1_Sub1_Sub1) local30).aClass150_1;
				if (local17.anIntArray262 != null) {
					local17 = local17.method3196(Static431.aClass205_1);
					if (local17 == null) {
						continue;
					}
				}
			}
			if (local30.anInt4614 >= 0 && (Static482.anInt7692 == local30.anInt4604 || Static327.aClass13_Sub1_Sub1_Sub1_Sub2_1.aByte127 == local30.aByte127)) {
				Static502.method2509(local30, arg3 >> 1, local30.method3961(), arg2 >> 1);
				if (Static526.anIntArray588[0] >= 0) {
					if (local30.aString48 != null && (local13 >= local7 || Static633.anInt10152 == 0 || Static633.anInt10152 == 3 || Static633.anInt10152 == 1 && Static526.method7282(((Class13_Sub1_Sub1_Sub1_Sub2) local30).aString50)) && Static543.anInt8918 < Static80.anInt1419) {
						Static80.anIntArray113[Static543.anInt8918] = Static228.aClass256_7.method5534(local30.aString48) / 2;
						Static80.anIntArray116[Static543.anInt8918] = Static526.anIntArray588[0];
						Static80.anIntArray112[Static543.anInt8918] = Static526.anIntArray588[1];
						Static80.anIntArray115[Static543.anInt8918] = local30.anInt4583;
						Static80.anIntArray114[Static543.anInt8918] = local30.anInt4587;
						Static80.anIntArray117[Static543.anInt8918] = local30.anInt4576;
						Static80.aStringArray7[Static543.anInt8918] = local30.aString48;
						Static543.anInt8918++;
					}
					local179 = arg1 + Static526.anIntArray588[1];
					@Pc(244) Class61[] local244;
					@Pc(251) Class329[] local251;
					@Pc(309) Class61 local309;
					if (local30.aBoolean317 || Static262.anInt5597 >= local30.anInt4579) {
						local179 -= Math.max(Static228.aClass256_7.anInt6414, Static364.aClass61Array10[0].method6447());
					} else {
						@Pc(194) byte local194 = 1;
						if (local13 >= local7) {
							local204 = local17.anInt3787;
							if (local204 == -1) {
								local204 = local30.method3964().anInt8953;
							}
						} else {
							@Pc(221) Class13_Sub1_Sub1_Sub1_Sub2 local221 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local9[local13]];
							local204 = local30.method3964().anInt8953;
							if (local221.aBoolean323) {
								local194 = 2;
							}
						}
						@Pc(233) Class61[] local233 = Static364.aClass61Array10;
						if (local204 != -1) {
							local244 = (Class61[]) Static352.aClass32_57.method630((long) local204);
							if (local244 == null) {
								local251 = Static655.method7413(Static79.aClass380_22, local204);
								if (local251 != null) {
									local244 = new Class61[local251.length];
									for (local259 = 0; local259 < local251.length; local259++) {
										local244[local259] = Static192.aClass95_4.method6980(local251[local259], true);
									}
									Static352.aClass32_57.method629(local244, (long) local204);
								}
							}
							if (local244 != null && local244.length >= 2) {
								local233 = local244;
							}
						}
						if (local194 >= local233.length) {
							local194 = 1;
						}
						@Pc(305) Class61 local305 = local233[0];
						local309 = local233[local194];
						local179 -= Math.max(Static228.aClass256_7.anInt6414, local305.method6447());
						local259 = arg0 + Static526.anIntArray588[0] - (local305.method6445() >> 1);
						local338 = local305.method6445() * local30.anInt4568 / 255;
						local341 = local305.method6447();
						if (local30.anInt4568 > 0 && local338 < 2) {
							local338 = 2;
						}
						local305.method6431(local259, local179);
						Static192.aClass95_4.T(local259, local179, local338 + local259, local341 + local179);
						local309.method6431(local259, local179);
						Static192.aClass95_4.KA(arg0, arg1, arg0 + arg2, arg3 + arg1);
						Static170.method7976(local305.method6446() + local259, local341 + local179, local259, local179);
					}
					local179 -= 2;
					if (!local30.aBoolean317) {
						@Pc(420) Class61 local420;
						@Pc(429) Class61 local429;
						if (local30.anInt4607 > Static262.anInt5597) {
							local420 = Static22.aClass61Array2[local30.aBoolean318 ? 2 : 0];
							local429 = Static22.aClass61Array2[local30.aBoolean318 ? 3 : 1];
							if (local30 instanceof Class13_Sub1_Sub1_Sub1_Sub1) {
								local439 = local17.anInt3783;
								if (local439 == -1) {
									local439 = local30.method3964().anInt8954;
								}
							} else {
								local439 = local30.method3964().anInt8954;
							}
							if (local439 != -1) {
								local244 = (Class61[]) Static247.aClass32_43.method630((long) local439);
								if (local244 == null) {
									local251 = Static655.method7413(Static79.aClass380_22, local439);
									if (local251 != null) {
										local244 = new Class61[local251.length];
										for (local259 = 0; local259 < local251.length; local259++) {
											local244[local259] = Static192.aClass95_4.method6980(local251[local259], true);
										}
										Static247.aClass32_43.method629(local244, (long) local439);
									}
								}
								if (local244 != null && local244.length == 4) {
									local429 = local244[local30.aBoolean318 ? 3 : 1];
									local420 = local244[local30.aBoolean318 ? 2 : 0];
								}
							}
							@Pc(531) int local531 = local30.anInt4607 - Static262.anInt5597;
							if (local30.anInt4599 >= local531) {
								local542 = local420.method6445();
							} else {
								local531 -= local30.anInt4599;
								local259 = local30.anInt4578 == 0 ? 0 : (local30.anInt4631 - local531) / local30.anInt4578 * local30.anInt4578;
								local542 = local420.method6445() * local259 / local30.anInt4631;
							}
							local259 = local420.method6447();
							local179 -= local259;
							local338 = arg0 + Static526.anIntArray588[0] - (local420.method6445() >> 1);
							local420.method6431(local338, local179);
							Static192.aClass95_4.T(local338, local179, local338 + local542, local179 - -local259);
							local429.method6431(local338, local179);
							Static192.aClass95_4.KA(arg0, arg1, arg0 + arg2, arg3 + arg1);
							Static170.method7976(local420.method6446() + local338, local259 + local179, local338, local179);
							local179 -= 2;
						}
						if (local7 > local13) {
							@Pc(710) Class13_Sub1_Sub1_Sub1_Sub2 local710 = (Class13_Sub1_Sub1_Sub1_Sub2) local30;
							if (local710.anInt4663 != -1) {
								local179 -= 25;
								local429 = Static4.aClass61Array1[local710.anInt4663];
								local429.method6431(Static526.anIntArray588[0] + arg0 - 12, local179);
								Static170.method7976(Static526.anIntArray588[0] + arg0 + local429.method6446() - 12, local179 + local429.method6438(), arg0 + Static526.anIntArray588[0] - 12, local179);
								local179 -= 2;
							}
							if (local710.anInt4646 != -1) {
								local179 -= 25;
								local429 = Static535.aClass61Array13[local710.anInt4646];
								local429.method6431(Static526.anIntArray588[0] + arg0 - 12, local179);
								Static170.method7976(arg0 + Static526.anIntArray588[0] + local429.method6446() - 12, local179 + local429.method6438(), Static526.anIntArray588[0] + arg0 - 12, local179);
								local179 -= 2;
							}
						} else if (local17.anInt3774 >= 0 && local17.anInt3774 < Static535.aClass61Array13.length) {
							local179 -= 25;
							local420 = Static535.aClass61Array13[local17.anInt3774];
							local420.method6431(Static526.anIntArray588[0] + arg0 - (local420.method6445() >> 1), local179);
							Static170.method7976(Static526.anIntArray588[0] + arg0 - (local420.method6445() >> 1) + local420.method6446(), local179 - -local420.method6438(), arg0 + Static526.anIntArray588[0] - (local420.method6445() >> 1), local179);
							local179 -= 2;
						}
					}
					@Pc(816) Class372[] local816;
					@Pc(824) Class372 local824;
					if (!(local30 instanceof Class13_Sub1_Sub1_Sub1_Sub2)) {
						local204 = 0;
						local816 = Static341.aClass372Array1;
						for (local439 = 0; local439 < local816.length; local439++) {
							local824 = local816[local439];
							if (local824 != null && local824.anInt9971 == 1 && Static147.anIntArray182[local13 - local7] == local824.anInt9978) {
								local309 = Static564.aClass61Array14[local824.anInt9970];
								if (local309.method6447() > local204) {
									local204 = local309.method6447();
								}
								if (Static262.anInt5597 % 20 < 10) {
									local309.method6431(Static526.anIntArray588[0] + arg0 - 12, local179 - local309.method6447());
									Static170.method7976(arg0 + Static526.anIntArray588[0] + local309.method6446() - 12, local179 + -local309.method6447() + local309.method6438(), arg0 + Static526.anIntArray588[0] - 12, -local309.method6447() + local179);
								}
							}
						}
						if (local204 > 0) {
						}
					} else if (local13 >= 0) {
						local204 = 0;
						local816 = Static341.aClass372Array1;
						for (local439 = 0; local439 < local816.length; local439++) {
							local824 = local816[local439];
							if (local824 != null && local824.anInt9971 == 10 && local824.anInt9978 == local9[local13]) {
								local309 = Static564.aClass61Array14[local824.anInt9970];
								if (local204 < local309.method6447()) {
									local204 = local309.method6447();
								}
								local309.method6431(Static526.anIntArray588[0] + arg0 - 12, -local309.method6447() + local179);
								Static170.method7976(arg0 + Static526.anIntArray588[0] + local309.method6446() - 12, -local309.method6447() + (local179 - -local309.method6438()), Static526.anIntArray588[0] + arg0 - 12, -local309.method6447() + local179);
							}
						}
						if (local204 > 0) {
						}
					}
					for (local204 = 0; local204 < 4; local204++) {
						if (local30.anIntArray305[local204] > Static262.anInt5597) {
							local1039 = local30.method3961() / 2;
							Static502.method2509(local30, arg3 >> 1, local1039, arg2 >> 1);
							if (Static526.anIntArray588[0] > -1) {
								local439 = Static179.aClass61Array8[local30.anIntArray303[local204]].method6445();
								if (local204 == 1) {
									Static526.anIntArray588[1] -= 20;
								}
								if (local204 == 2) {
									Static526.anIntArray588[1] -= 10;
									Static526.anIntArray588[0] -= local439 - 9;
								}
								if (local204 == 3) {
									Static526.anIntArray588[1] -= 10;
									Static526.anIntArray588[0] += local439 - 9;
								}
								Static179.aClass61Array8[local30.anIntArray303[local204]].method6431(arg0 + Static526.anIntArray588[0] - (local439 >> 1), Static526.anIntArray588[1] + -12 + arg1);
								Static139.aClass62_7.method5691(Static526.anIntArray588[0] + arg0 - 1, -1, Integer.toString(local30.anIntArray304[local204]), 0, arg1 + Static526.anIntArray588[1] + 3);
							}
						}
					}
				}
			}
		}
		@Pc(1182) int local1182;
		for (@Pc(1176) int local1176 = 0; local1176 < Static453.anInt7266; local1176++) {
			local1182 = Static145.anIntArray177[local1176];
			@Pc(1191) Class13_Sub1_Sub1_Sub1 local1191;
			if (local1182 < 2048) {
				local1191 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local1182];
			} else {
				local1191 = ((Class2_Sub43) Static440.aClass118_41.method2595((long) (local1182 - 2048))).aClass13_Sub1_Sub1_Sub1_Sub1_2;
			}
			local204 = Static642.anIntArray695[local1176];
			@Pc(1220) Class13_Sub1_Sub1_Sub1 local1220;
			if (local204 >= 2048) {
				local1220 = ((Class2_Sub43) Static440.aClass118_41.method2595((long) (local204 - 2048))).aClass13_Sub1_Sub1_Sub1_Sub1_2;
			} else {
				local1220 = Static628.aClass13_Sub1_Sub1_Sub1_Sub2Array1[local204];
			}
			Static283.method6300(local1220, --local1191.anInt4620, arg2, local1191, arg0, arg3, arg1);
		}
		local1182 = Static228.aClass256_7.anInt6414 + Static228.aClass256_7.anInt6420 + 2;
		for (local179 = 0; local179 < Static543.anInt8918; local179++) {
			local204 = Static80.anIntArray116[local179];
			local1039 = Static80.anIntArray112[local179];
			local439 = Static80.anIntArray113[local179];
			@Pc(1286) boolean local1286 = true;
			while (local1286) {
				local1286 = false;
				for (local542 = 0; local542 < local179; local542++) {
					if (Static80.anIntArray112[local542] - local1182 < local1039 + 2 && Static80.anIntArray112[local542] + 2 > -local1182 + local1039 && local204 - local439 < Static80.anIntArray113[local542] + Static80.anIntArray116[local542] && local204 + local439 > Static80.anIntArray116[local542] - Static80.anIntArray113[local542] && Static80.anIntArray112[local542] - local1182 < local1039) {
						local1039 = Static80.anIntArray112[local542] - local1182;
						local1286 = true;
					}
				}
			}
			Static80.anIntArray112[local179] = local1039;
			@Pc(1384) String local1384 = Static80.aStringArray7[local179];
			local259 = Static228.aClass256_7.method5534(local1384);
			local338 = arg0 + local204;
			local341 = arg1 + local1039 - Static228.aClass256_7.anInt6414;
			@Pc(1406) int local1406 = local259 + local338;
			@Pc(1413) int local1413 = Static228.aClass256_7.anInt6420 + local1039 + arg1;
			if (Static61.anInt1163 == 0) {
				@Pc(1417) int local1417 = 16776960;
				if (Static80.anIntArray115[local179] < 6) {
					local1417 = Static630.anIntArray686[Static80.anIntArray115[local179]];
				}
				if (Static80.anIntArray115[local179] == 6) {
					local1417 = Static482.anInt7692 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static80.anIntArray115[local179] == 7) {
					local1417 = Static482.anInt7692 % 20 >= 10 ? 65535 : 255;
				}
				if (Static80.anIntArray115[local179] == 8) {
					local1417 = Static482.anInt7692 % 20 < 10 ? 45056 : 8454016;
				}
				@Pc(1492) int local1492;
				if (Static80.anIntArray115[local179] == 9) {
					local1492 = 150 - Static80.anIntArray117[local179];
					if (local1492 < 50) {
						local1417 = local1492 * 1280 + 16711680;
					} else if (local1492 < 100) {
						local1417 = 16776960 + 16384000 - local1492 * 327680;
					} else if (local1492 < 150) {
						local1417 = (local1492 - 100) * 5 + 65280;
					}
				}
				if (Static80.anIntArray115[local179] == 10) {
					local1492 = 150 - Static80.anIntArray117[local179];
					if (local1492 < 50) {
						local1417 = local1492 * 5 + 16711680;
					} else if (local1492 < 100) {
						local1417 = 16384000 + 16711935 - local1492 * 327680;
					} else if (local1492 < 150) {
						local1417 = (local1492 - 100) * 327680 + 255 - (local1492 + -100) * 5;
					}
				}
				if (Static80.anIntArray115[local179] == 11) {
					local1492 = 150 - Static80.anIntArray117[local179];
					if (local1492 < 50) {
						local1417 = 16777215 - local1492 * 327685;
					} else if (local1492 < 100) {
						local1417 = (local1492 - 50) * 327685 + 65280;
					} else if (local1492 < 150) {
						local1417 = 49545215 - local1492 * 327680;
					}
				}
				local1492 = local1417 | 0xFF000000;
				if (Static80.anIntArray114[local179] == 0) {
					local1406 -= local259 >> 1;
					Static194.aClass62_22.method5691(arg0 + local204, local1492, local1384, -16777216, arg1 + local1039);
					local338 -= local259 >> 1;
				}
				if (Static80.anIntArray114[local179] == 1) {
					local1413 += 5;
					local341 -= 5;
					local338 -= local259 >> 1;
					local1406 -= local259 >> 1;
					Static194.aClass62_22.method5681(local1384, arg1 + local1039, Static482.anInt7692, local204 + arg0, local1492);
				}
				if (Static80.anIntArray114[local179] == 2) {
					local338 -= (local259 >> 1) + 5;
					local1406 -= (local259 >> 1) - 5;
					local341 -= 5;
					local1413 += 5;
					Static194.aClass62_22.method5689(Static482.anInt7692, arg0 + local204, local1384, local1492, arg1 + local1039);
				}
				if (Static80.anIntArray114[local179] == 3) {
					local1406 -= local259 >> 1;
					Static194.aClass62_22.method5682(150 - Static80.anIntArray117[local179], local1039 + arg1, Static482.anInt7692, local1492, local204 + arg0, local1384);
					local341 -= 7;
					local338 -= local259 >> 1;
					local1413 += 7;
				}
				@Pc(1808) int local1808;
				if (Static80.anIntArray114[local179] == 4) {
					local1808 = (150 - Static80.anIntArray117[local179]) * (Static228.aClass256_7.method5534(local1384) + 100) / 150;
					Static192.aClass95_4.T(arg0 + local204 - 50, arg1, arg0 + local204 + 50, arg3 + arg1);
					Static194.aClass62_22.method5684(local204 + arg0 + 50 - local1808, local1384, arg1 + local1039, local1492, -16777216);
					local1406 += 50 - local1808;
					local338 += 50 - local1808;
					Static192.aClass95_4.KA(arg0, arg1, arg2 + arg0, arg3 + arg1);
				}
				if (Static80.anIntArray114[local179] == 5) {
					local1808 = 150 - Static80.anIntArray117[local179];
					@Pc(1878) int local1878 = 0;
					if (local1808 < 25) {
						local1878 = local1808 - 25;
					} else if (local1808 > 125) {
						local1878 = local1808 - 125;
					}
					@Pc(1902) int local1902 = Static228.aClass256_7.anInt6420 + Static228.aClass256_7.anInt6414;
					Static192.aClass95_4.T(arg0, local1039 + arg1 - local1902 - 1, arg2 + arg0, local1039 + arg1 + 5);
					local341 += local1878;
					local338 -= local259 >> 1;
					Static194.aClass62_22.method5691(local204 + arg0, local1492, local1384, -16777216, local1878 + arg1 + local1039);
					local1406 -= local259 >> 1;
					local1413 += local1878;
					Static192.aClass95_4.KA(arg0, arg1, arg0 + arg2, arg1 + arg3);
				}
			} else {
				local1406 -= local259 >> 1;
				local338 -= local259 >> 1;
				Static194.aClass62_22.method5691(local204 + arg0, -256, local1384, -16777216, local1039 + arg1);
			}
			Static170.method7976(local1406 + 1, local1413 + 1, local338, local341);
		}
	}

	@OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)V")
	public static void method2871() {
		for (@Pc(15) int local15 = 0; local15 < 5; local15++) {
			Static85.aBooleanArray124[local15] = false;
		}
		Static12.anInt159 = -1;
		Static8.anInt107 = -1;
		Static308.anInt4982 = 0;
		Static533.anInt8753 = 0;
		Static133.anInt2248 = -1;
		Static445.anInt7122 = 1;
		Static239.anInt3904 = -1;
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IBIII)V")
	public static void method2872(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) int local10 = Static112.anInt2056;
		if (local10 == 0) {
			return;
		}
		if (local10 == 1) {
			Static22.anInt552 = arg0;
			Static71.anInt1260 = arg2;
			Static491.anInt8079 = arg3;
			Static112.anInt2056 = 2;
			Static638.anInt7975 = arg1;
		} else if (local10 == 2) {
			if (arg1 > Static638.anInt7975) {
				Static638.anInt7975 = arg1;
			}
			if (Static71.anInt1260 > arg2) {
				Static71.anInt1260 = arg2;
			}
			if (Static491.anInt8079 > arg3) {
				Static491.anInt8079 = arg3;
			}
			if (Static22.anInt552 < arg0) {
				Static22.anInt552 = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(BII)I")
	public static int method2873(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) int local19;
		if (arg1 < arg0) {
			local19 = arg1;
			arg1 = arg0;
			arg0 = local19;
		}
		while (arg0 != 0) {
			local19 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local19;
		}
		return arg1;
	}
}
