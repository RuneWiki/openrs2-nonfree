import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Lclient!fn;")
	public static Class103 aClass103_14;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IZI)Z")
	public static boolean method5065(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static171.method2606(arg1, arg0) || Static515.method7050(arg1, arg0);
	}

	@OriginalMember(owner = "client!n", name = "e", descriptor = "(I)Z")
	public static boolean method5067() throws IOException {
		if (Static400.aClass75_3 == null) {
			return false;
		}
		@Pc(78) int local78;
		if (Static315.aClass81_130 == null) {
			if (Static205.aBoolean334) {
				if (!Static400.aClass75_3.method1855(1)) {
					return false;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 1);
				Static322.anInt6018++;
				Static401.anInt6897 = 0;
				Static205.aBoolean334 = false;
			}
			Static480.aClass1_Sub20_Sub1_1.anInt5238 = 0;
			if (Static480.aClass1_Sub20_Sub1_1.method3925()) {
				if (!Static400.aClass75_3.method1855(1)) {
					return false;
				}
				Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 1, 1);
				Static322.anInt6018++;
				Static401.anInt6897 = 0;
			}
			Static205.aBoolean334 = true;
			@Pc(74) Class81[] local74 = Static71.method1515();
			local78 = Static480.aClass1_Sub20_Sub1_1.method3928();
			if (local78 < 0 || local78 >= local74.length) {
				throw new IOException("invo:" + local78 + " ip:" + Static480.aClass1_Sub20_Sub1_1.anInt5238);
			}
			Static315.aClass81_130 = local74[local78];
			Static494.anInt8294 = Static315.aClass81_130.anInt2281;
		}
		if (Static494.anInt8294 == -1) {
			if (!Static400.aClass75_3.method1855(1)) {
				return false;
			}
			Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 1);
			Static322.anInt6018++;
			Static494.anInt8294 = Static480.aClass1_Sub20_Sub1_1.aByteArray52[0] & 0xFF;
			Static401.anInt6897 = 0;
		}
		if (Static494.anInt8294 == -2) {
			if (!Static400.aClass75_3.method1855(2)) {
				return false;
			}
			Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, 2);
			Static480.aClass1_Sub20_Sub1_1.anInt5238 = 0;
			Static494.anInt8294 = Static480.aClass1_Sub20_Sub1_1.method4426();
			Static401.anInt6897 = 0;
			Static322.anInt6018 += 2;
		}
		if (Static494.anInt8294 > 0) {
			if (!Static400.aClass75_3.method1855(Static494.anInt8294)) {
				return false;
			}
			Static480.aClass1_Sub20_Sub1_1.anInt5238 = 0;
			Static400.aClass75_3.method1856(Static480.aClass1_Sub20_Sub1_1.aByteArray52, 0, Static494.anInt8294);
			Static322.anInt6018 += Static494.anInt8294;
			Static401.anInt6897 = 0;
		}
		Static587.aClass81_229 = Static478.aClass81_193;
		Static478.aClass81_193 = Static320.aClass81_135;
		Static320.aClass81_135 = Static315.aClass81_130;
		if (Static152.aClass81_77 == Static315.aClass81_130) {
			Static506.anInt8447 = Static480.aClass1_Sub20_Sub1_1.method4410();
			Static242.aBoolean359 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
			Static315.aClass81_130 = null;
			return true;
		}
		@Pc(233) int local233;
		if (Static179.aClass81_88 == Static315.aClass81_130) {
			local233 = Static480.aClass1_Sub20_Sub1_1.method4408();
			local78 = Static480.aClass1_Sub20_Sub1_1.method4382();
			if (local78 == 255) {
				local78 = -1;
				local233 = -1;
			}
			Static556.method5635(local233, local78);
			Static315.aClass81_130 = null;
			return true;
		}
		@Pc(264) boolean local264;
		if (Static84.aClass81_47 == Static315.aClass81_130) {
			local264 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
			@Pc(269) byte[] local269 = new byte[Static494.anInt8294 - 1];
			Static480.aClass1_Sub20_Sub1_1.method4425(local269, Static494.anInt8294 - 1);
			Static277.method4285(local264, local269);
			Static315.aClass81_130 = null;
			return true;
		}
		@Pc(300) String local300;
		if (Static315.aClass81_130 == Static427.aClass81_176) {
			local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
			local78 = Static480.aClass1_Sub20_Sub1_1.method4424();
			local300 = Static480.aClass1_Sub20_Sub1_1.method4388();
			if (Static412.method5785(local233)) {
				Static409.method5762(local78, local300);
			}
			Static315.aClass81_130 = null;
			return true;
		}
		@Pc(348) String local348;
		@Pc(352) String local352;
		@Pc(338) String local338;
		@Pc(362) int local362;
		if (Static231.aClass81_110 == Static315.aClass81_130) {
			local233 = Static480.aClass1_Sub20_Sub1_1.method4393();
			@Pc(330) boolean local330 = (local233 & 0x1) == 1;
			local300 = Static480.aClass1_Sub20_Sub1_1.method4388();
			local338 = Static480.aClass1_Sub20_Sub1_1.method4388();
			if (local338.equals("")) {
				local338 = local300;
			}
			local348 = Static480.aClass1_Sub20_Sub1_1.method4388();
			local352 = Static480.aClass1_Sub20_Sub1_1.method4388();
			if (local352.equals("")) {
				local352 = local348;
			}
			if (local330) {
				for (local362 = 0; local362 < Static54.anInt1399; local362++) {
					if (Static316.aStringArray25[local362].equals(local352)) {
						Static568.aStringArray40[local362] = local300;
						Static316.aStringArray25[local362] = local338;
						Static279.aStringArray22[local362] = local348;
						Static68.aStringArray6[local362] = local352;
						break;
					}
				}
			} else {
				Static568.aStringArray40[Static54.anInt1399] = local300;
				Static316.aStringArray25[Static54.anInt1399] = local338;
				Static279.aStringArray22[Static54.anInt1399] = local348;
				Static68.aStringArray6[Static54.anInt1399] = local352;
				Static363.aBooleanArray24[Static54.anInt1399] = (local233 & 0x2) == 2;
				Static54.anInt1399++;
			}
			Static315.aClass81_130 = null;
			Static18.anInt603 = Static274.anInt5077;
			return true;
		} else if (Static176.aClass81_86 == Static315.aClass81_130) {
			local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
			if (Static412.method5785(local233)) {
				Static258.method4053();
			}
			Static315.aClass81_130 = null;
			return true;
		} else if (Static315.aClass81_130 == Static517.aClass81_202) {
			Static227.anInt4362 = Static480.aClass1_Sub20_Sub1_1.method4393();
			Static315.aClass81_130 = null;
			Static384.anInt7194 = Static274.anInt5077;
			return true;
		} else {
			@Pc(478) int local478;
			@Pc(496) Class1_Sub16 local496;
			if (Static170.aClass81_80 == Static315.aClass81_130) {
				local233 = Static480.aClass1_Sub20_Sub1_1.method4371();
				local78 = Static480.aClass1_Sub20_Sub1_1.method4424();
				local478 = Static480.aClass1_Sub20_Sub1_1.method4389();
				if (Static412.method5785(local78)) {
					@Pc(489) Class1_Sub16 local489 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local233);
					local496 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local478);
					if (local496 != null) {
						Static546.method7412(local496, local489 == null || local489.anInt2681 != local496.anInt2681, false);
					}
					if (local489 != null) {
						local489.method7878();
						Static68.aClass356_4.method7800((long) local478, local489);
					}
					@Pc(531) Class365 local531 = Static374.method5437(local233);
					if (local531 != null) {
						Static201.method5537(local531);
					}
					local531 = Static374.method5437(local478);
					if (local531 != null) {
						Static201.method5537(local531);
						Static26.method716(local531, true);
					}
					if (Static219.anInt4263 != -1) {
						Static463.method6579(Static219.anInt4263, 1);
					}
				}
				Static315.aClass81_130 = null;
				return true;
			}
			@Pc(567) byte local567;
			if (Static21.aClass81_7 == Static315.aClass81_130) {
				local567 = Static480.aClass1_Sub20_Sub1_1.method4432();
				local78 = Static480.aClass1_Sub20_Sub1_1.method4424();
				Static121.aClass148_1.method3532(local78, local567);
				Static315.aClass81_130 = null;
				return true;
			} else if (Static315.aClass81_130 == Static454.aClass81_184) {
				local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
				local78 = Static480.aClass1_Sub20_Sub1_1.method4371();
				if (Static412.method5785(local233)) {
					@Pc(602) Class1_Sub16 local602 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local78);
					if (local602 != null) {
						Static546.method7412(local602, true, false);
					}
					if (Static211.aClass365_8 != null) {
						Static201.method5537(Static211.aClass365_8);
						Static211.aClass365_8 = null;
					}
				}
				Static315.aClass81_130 = null;
				return true;
			} else {
				@Pc(641) int local641;
				@Pc(649) int local649;
				@Pc(645) int local645;
				if (Static315.aClass81_130 == Static217.aClass81_107) {
					local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
					local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
					local478 = Static480.aClass1_Sub20_Sub1_1.method4393();
					local641 = Static480.aClass1_Sub20_Sub1_1.method4426() << 2;
					local645 = Static480.aClass1_Sub20_Sub1_1.method4393();
					local649 = Static480.aClass1_Sub20_Sub1_1.method4393();
					if (Static412.method5785(local233)) {
						Static595.method7937(local645, local78, local641, local649, local478);
					}
					Static315.aClass81_130 = null;
					return true;
				} else if (Static315.aClass81_130 == Static510.aClass81_220) {
					local233 = Static480.aClass1_Sub20_Sub1_1.method4424();
					if (local233 == 65535) {
						local233 = -1;
					}
					local78 = Static480.aClass1_Sub20_Sub1_1.method4417();
					local478 = Static480.aClass1_Sub20_Sub1_1.method4371();
					if (Static412.method5785(local78)) {
						Static324.method4900(1, -1, local478, local233);
					}
					Static315.aClass81_130 = null;
					return true;
				} else if (Static87.aClass81_51 == Static315.aClass81_130) {
					local233 = Static480.aClass1_Sub20_Sub1_1.method4408();
					local78 = Static480.aClass1_Sub20_Sub1_1.method4424();
					if (Static412.method5785(local78)) {
						Static293.anInt5405 = local233;
					}
					Static315.aClass81_130 = null;
					return true;
				} else if (Static94.aClass81_54 == Static315.aClass81_130) {
					local567 = Static480.aClass1_Sub20_Sub1_1.method4432();
					local78 = Static480.aClass1_Sub20_Sub1_1.method4394();
					local478 = Static480.aClass1_Sub20_Sub1_1.method4417();
					if (Static412.method5785(local478)) {
						Static505.method7001(local78, local567);
					}
					Static315.aClass81_130 = null;
					return true;
				} else {
					@Pc(790) int local790;
					@Pc(764) String local764;
					@Pc(786) long local786;
					@Pc(794) int local794;
					@Pc(776) long local776;
					@Pc(781) long local781;
					if (Static197.aClass81_102 == Static315.aClass81_130) {
						local264 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
						local764 = Static480.aClass1_Sub20_Sub1_1.method4388();
						local300 = local764;
						if (local264) {
							local300 = Static480.aClass1_Sub20_Sub1_1.method4388();
						}
						local776 = Static480.aClass1_Sub20_Sub1_1.method4416();
						local781 = Static480.aClass1_Sub20_Sub1_1.method4426();
						local786 = Static480.aClass1_Sub20_Sub1_1.method4396();
						local790 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local794 = Static480.aClass1_Sub20_Sub1_1.method4426();
						@Pc(800) long local800 = local786 + (local781 << 32);
						@Pc(802) boolean local802 = false;
						@Pc(804) int local804 = 0;
						while (true) {
							if (local804 >= 100) {
								if (local790 <= 1 && Static560.method7545(local300)) {
									local802 = true;
								}
								break;
							}
							if (local800 == Static393.aLongArray14[local804]) {
								local802 = true;
								break;
							}
							local804++;
						}
						if (!local802 && Static53.anInt1363 == 0) {
							Static393.aLongArray14[Static30.anInt872] = local800;
							Static30.anInt872 = (Static30.anInt872 + 1) % 100;
							@Pc(857) String local857 = Static296.aClass362_2.method7873(local794).method818(Static480.aClass1_Sub20_Sub1_1);
							if (local790 == 2) {
								Static337.method5034("<img=1>" + local764, Static67.method1436(local776), 20, local764, local857, 0, "<img=1>" + local300, local794);
							} else if (local790 == 1) {
								Static337.method5034("<img=0>" + local764, Static67.method1436(local776), 20, local764, local857, 0, "<img=0>" + local300, local794);
							} else {
								Static337.method5034(local764, Static67.method1436(local776), 20, local764, local857, 0, local300, local794);
							}
						}
						Static315.aClass81_130 = null;
						return true;
					}
					@Pc(986) Class69 local986;
					@Pc(1011) int local1011;
					@Pc(969) boolean local969;
					@Pc(982) String local982;
					@Pc(940) String local940;
					@Pc(949) boolean local949;
					if (Static508.aClass81_36 == Static315.aClass81_130) {
						local940 = Static480.aClass1_Sub20_Sub1_1.method4388();
						local949 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
						if (local949) {
							local764 = Static480.aClass1_Sub20_Sub1_1.method4388();
						} else {
							local764 = local940;
						}
						local641 = Static480.aClass1_Sub20_Sub1_1.method4426();
						@Pc(967) byte local967 = Static480.aClass1_Sub20_Sub1_1.method4432();
						local969 = false;
						if (local967 == -128) {
							local969 = true;
						}
						if (local969) {
							if (Static280.anInt5146 == 0) {
								Static315.aClass81_130 = null;
								return true;
							}
							for (local362 = 0; local362 < Static280.anInt5146 && (!Static254.aClass69Array1[local362].aString21.equals(local764) || Static254.aClass69Array1[local362].anInt2011 != local641); local362++) {
							}
							if (local362 < Static280.anInt5146) {
								while (local362 < Static280.anInt5146 - 1) {
									Static254.aClass69Array1[local362] = Static254.aClass69Array1[local362 + 1];
									local362++;
								}
								Static280.anInt5146--;
								Static254.aClass69Array1[Static280.anInt5146] = null;
							}
						} else {
							local982 = Static480.aClass1_Sub20_Sub1_1.method4388();
							local986 = new Class69();
							local986.aString20 = local940;
							local986.aString21 = local764;
							local986.aString22 = Static344.method5101(local986.aString21);
							local986.aByte32 = local967;
							local986.anInt2011 = local641;
							local986.aString23 = local982;
							for (local1011 = Static280.anInt5146 - 1; local1011 >= 0; local1011--) {
								local790 = Static254.aClass69Array1[local1011].aString22.compareTo(local986.aString22);
								if (local790 == 0) {
									Static254.aClass69Array1[local1011].anInt2011 = local641;
									Static254.aClass69Array1[local1011].aByte32 = local967;
									Static254.aClass69Array1[local1011].aString23 = local982;
									if (local764.equals(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString49)) {
										Static151.aByte41 = local967;
									}
									Static209.anInt4135 = Static274.anInt5077;
									Static315.aClass81_130 = null;
									return true;
								}
								if (local790 < 0) {
									break;
								}
							}
							if (Static254.aClass69Array1.length <= Static280.anInt5146) {
								Static315.aClass81_130 = null;
								return true;
							}
							for (local790 = Static280.anInt5146 - 1; local790 > local1011; local790--) {
								Static254.aClass69Array1[local790 + 1] = Static254.aClass69Array1[local790];
							}
							if (Static280.anInt5146 == 0) {
								Static254.aClass69Array1 = new Class69[100];
							}
							Static254.aClass69Array1[local1011 + 1] = local986;
							Static280.anInt5146++;
							if (local764.equals(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString49)) {
								Static151.aByte41 = local967;
							}
						}
						Static315.aClass81_130 = null;
						Static209.anInt4135 = Static274.anInt5077;
						return true;
					} else if (Static315.aClass81_130 == Static53.aClass81_34) {
						local233 = Static480.aClass1_Sub20_Sub1_1.method4417();
						local78 = Static480.aClass1_Sub20_Sub1_1.method4394();
						local478 = Static480.aClass1_Sub20_Sub1_1.method4435();
						local641 = Static480.aClass1_Sub20_Sub1_1.method4371();
						if (Static412.method5785(local78)) {
							Static324.method4900(5, local641, local478, local233);
						}
						Static315.aClass81_130 = null;
						return true;
					} else if (Static178.aClass81_87 == Static315.aClass81_130) {
						local233 = Static480.aClass1_Sub20_Sub1_1.method4427();
						local78 = Static480.aClass1_Sub20_Sub1_1.method4371();
						local478 = Static480.aClass1_Sub20_Sub1_1.method4393();
						local338 = "";
						local348 = local338;
						if ((local478 & 0x1) != 0) {
							local338 = Static480.aClass1_Sub20_Sub1_1.method4388();
							if ((local478 & 0x2) == 0) {
								local348 = local338;
							} else {
								local348 = Static480.aClass1_Sub20_Sub1_1.method4388();
							}
						}
						local352 = Static480.aClass1_Sub20_Sub1_1.method4388();
						if (local233 == 99) {
							Static374.method5444(local352);
						} else if (local348.equals("") || !Static560.method7545(local348)) {
							Static114.method1983(local338, local348, local338, local78, local352, local233);
						} else {
							Static315.aClass81_130 = null;
							return true;
						}
						Static315.aClass81_130 = null;
						return true;
					} else if (Static456.aClass81_186 == Static315.aClass81_130) {
						Static433.method6296(Static495.aClass181_13);
						Static315.aClass81_130 = null;
						return true;
					} else if (Static446.aClass81_182 == Static315.aClass81_130) {
						Static433.method6296(Static219.aClass181_6);
						Static315.aClass81_130 = null;
						return true;
					} else {
						@Pc(1721) int local1721;
						@Pc(1472) int local1472;
						@Pc(1989) int local1989;
						@Pc(1681) boolean local1681;
						@Pc(1540) int local1540;
						if (Static482.aClass81_192 == Static315.aClass81_130) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4394();
							local478 = Static480.aClass1_Sub20_Sub1_1.method4398();
							local641 = Static480.aClass1_Sub20_Sub1_1.method4394();
							local645 = Static480.aClass1_Sub20_Sub1_1.method4393();
							local969 = (local645 & 0x80) != 0;
							if (local478 >> 30 == 0) {
								@Pc(1412) Class116 local1412;
								@Pc(1432) Class131 local1432;
								@Pc(1469) Class131 local1469;
								if (local478 >> 29 != 0) {
									local362 = local478 & 0xFFFF;
									@Pc(1374) Class1_Sub39 local1374 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local362);
									if (local1374 != null) {
										if (local641 == 65535) {
											local641 = -1;
										}
										@Pc(1386) Class20_Sub2_Sub4_Sub1_Sub2 local1386 = local1374.aClass20_Sub2_Sub4_Sub1_Sub2_2;
										@Pc(1388) boolean local1388 = true;
										local794 = local969 ? local1386.anInt6452 : local1386.anInt6416;
										if (local641 != -1 && local794 != -1) {
											if (local794 == local641) {
												local1412 = Static592.aClass98_2.method2295(local641);
												if (local1412.aBoolean216 && local1412.anInt3012 != -1) {
													local1469 = Static594.aClass311_2.method7009(local1412.anInt3012);
													local1472 = local1469.anInt3742;
													if (local1472 == 0 || local1472 == 2) {
														local1388 = false;
													} else if (local1472 == 1) {
														local1388 = true;
													}
												}
											} else {
												local1412 = Static592.aClass98_2.method2295(local641);
												@Pc(1417) Class116 local1417 = Static592.aClass98_2.method2295(local794);
												if (local1412.anInt3012 != -1 && local1417.anInt3012 != -1) {
													local1432 = Static594.aClass311_2.method7009(local1412.anInt3012);
													@Pc(1438) Class131 local1438 = Static594.aClass311_2.method7009(local1417.anInt3012);
													if (local1432.anInt3734 < local1438.anInt3734) {
														local1388 = false;
													}
												}
											}
										}
										if (local1388) {
											if (local969) {
												local1386.anInt6393 = local78;
												local1386.anInt6448 = 0;
												local1386.anInt6430 = local645 & 0x7;
												local1386.anInt6451 = 0;
												local1386.lb = Static81.anInt1910 + local233;
												local1386.anInt6452 = local641;
												local1386.anInt6397 = 1;
												if (local1386.lb > Static81.anInt1910) {
													local1386.anInt6451 = -1;
												}
												if (local1386.anInt6452 != -1 && Static81.anInt1910 == local1386.lb) {
													local1540 = Static592.aClass98_2.method2295(local1386.anInt6452).anInt3012;
													if (local1540 != -1) {
														local1469 = Static594.aClass311_2.method7009(local1540);
														if (local1469 != null && local1469.anIntArray202 != null) {
															Static171.method2603(0, local1386.anInt8796, local1469, local1386.anInt8795, local1386.aByte116, false);
														}
													}
												}
											} else {
												local1386.anInt6401 = 0;
												local1386.anInt6432 = 0;
												local1386.anInt6416 = local641;
												local1386.anInt6444 = local78;
												local1386.anInt6402 = 1;
												local1386.anInt6400 = local645 & 0x7;
												local1386.anInt6439 = Static81.anInt1910 + local233;
												if (Static81.anInt1910 < local1386.anInt6439) {
													local1386.anInt6401 = -1;
												}
												if (local1386.anInt6416 != -1 && Static81.anInt1910 == local1386.anInt6439) {
													local1540 = Static592.aClass98_2.method2295(local1386.anInt6416).anInt3012;
													if (local1540 != -1) {
														local1469 = Static594.aClass311_2.method7009(local1540);
														if (local1469 != null && local1469.anIntArray202 != null) {
															Static171.method2603(0, local1386.anInt8796, local1469, local1386.anInt8795, local1386.aByte116, false);
														}
													}
												}
											}
										}
									}
								} else if (local478 >> 28 != 0) {
									local362 = local478 & 0xFFFF;
									@Pc(1664) Class20_Sub2_Sub4_Sub1_Sub1 local1664;
									if (local362 == Static594.anInt9653) {
										local1664 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2;
									} else {
										local1664 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local362];
									}
									if (local1664 != null) {
										if (local641 == 65535) {
											local641 = -1;
										}
										local1681 = true;
										local790 = local969 ? local1664.anInt6452 : local1664.anInt6416;
										@Pc(1718) Class131 local1718;
										if (local641 != -1 && local790 != -1) {
											@Pc(1704) Class116 local1704;
											if (local790 == local641) {
												local1704 = Static592.aClass98_2.method2295(local641);
												if (local1704.aBoolean216 && local1704.anInt3012 != -1) {
													local1718 = Static594.aClass311_2.method7009(local1704.anInt3012);
													local1721 = local1718.anInt3742;
													if (local1721 == 0 || local1721 == 2) {
														local1681 = false;
													} else if (local1721 == 1) {
														local1681 = true;
													}
												}
											} else {
												local1704 = Static592.aClass98_2.method2295(local641);
												local1412 = Static592.aClass98_2.method2295(local790);
												if (local1704.anInt3012 != -1 && local1412.anInt3012 != -1) {
													local1469 = Static594.aClass311_2.method7009(local1704.anInt3012);
													local1432 = Static594.aClass311_2.method7009(local1412.anInt3012);
													if (local1432.anInt3734 > local1469.anInt3734) {
														local1681 = false;
													}
												}
											}
										}
										if (local1681) {
											if (local969) {
												local1664.anInt6452 = local641;
												local1664.anInt6451 = 0;
												local1664.anInt6397 = 1;
												local1664.anInt6393 = local78;
												local1664.anInt6430 = local645 & 0x7;
												local1664.lb = local233 + Static81.anInt1910;
												local1664.anInt6448 = 0;
												if (local1664.anInt6452 == 65535) {
													local1664.anInt6452 = -1;
												}
												if (local1664.lb > Static81.anInt1910) {
													local1664.anInt6451 = -1;
												}
												if (local1664.anInt6452 != -1 && local1664.lb == Static81.anInt1910) {
													local794 = Static592.aClass98_2.method2295(local1664.anInt6452).anInt3012;
													if (local794 != -1) {
														local1718 = Static594.aClass311_2.method7009(local794);
														if (local1718 != null && local1718.anIntArray202 != null) {
															Static171.method2603(0, local1664.anInt8796, local1718, local1664.anInt8795, local1664.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == local1664);
														}
													}
												}
											} else {
												local1664.anInt6402 = 1;
												local1664.anInt6439 = Static81.anInt1910 + local233;
												local1664.anInt6444 = local78;
												local1664.anInt6401 = 0;
												local1664.anInt6416 = local641;
												local1664.anInt6400 = local645 & 0x7;
												local1664.anInt6432 = 0;
												if (local1664.anInt6416 == 65535) {
													local1664.anInt6416 = -1;
												}
												if (Static81.anInt1910 < local1664.anInt6439) {
													local1664.anInt6401 = -1;
												}
												if (local1664.anInt6416 != -1 && local1664.anInt6439 == Static81.anInt1910) {
													local794 = Static592.aClass98_2.method2295(local1664.anInt6416).anInt3012;
													if (local794 != -1) {
														local1718 = Static594.aClass311_2.method7009(local794);
														if (local1718 != null && local1718.anIntArray202 != null) {
															Static171.method2603(0, local1664.anInt8796, local1718, local1664.anInt8795, local1664.aByte116, Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 == local1664);
														}
													}
												}
											}
										}
									}
								}
							} else {
								local362 = local478 >> 28 & 0x3;
								local1989 = (local478 >> 14 & 0x3FFF) - Static376.anInt6631;
								local1011 = (local478 & 0x3FFF) - Static24.anInt674;
								if (local1989 >= 0 && local1011 >= 0 && local1989 < Static500.anInt6888 && Static573.anInt9325 > local1011) {
									local790 = local1989 * 512 + 256;
									local794 = local1011 * 512 + 256;
									local1540 = local362;
									if (local362 < 3 && Static70.method1506(local1011, local1989)) {
										local1540 = local362 + 1;
									}
									@Pc(2062) Class20_Sub2_Sub4_Sub2 local2062 = new Class20_Sub2_Sub4_Sub2(local641, 0, Static81.anInt1910, local362, local1540, local790, Static122.method2103(local362, local790, local794) - local78, local794, local1989, local1989, local1011, local1011, local645 & 0x7);
									Static140.aClass361_34.method7855(new Class1_Sub3_Sub18(local2062));
								}
							}
							Static315.aClass81_130 = null;
							return true;
						} else if (Static423.aClass81_173 == Static315.aClass81_130) {
							Static433.method6296(Static63.aClass181_3);
							Static315.aClass81_130 = null;
							return true;
						} else if (Static586.aClass81_228 == Static315.aClass81_130) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4417();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4389();
							Static121.aClass148_1.method3538(local78, local233);
							Static315.aClass81_130 = null;
							return true;
						} else if (Static315.aClass81_130 == Static143.aClass81_73) {
							local264 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
							local764 = Static480.aClass1_Sub20_Sub1_1.method4388();
							local300 = local764;
							if (local264) {
								local300 = Static480.aClass1_Sub20_Sub1_1.method4388();
							}
							local776 = Static480.aClass1_Sub20_Sub1_1.method4416();
							local781 = Static480.aClass1_Sub20_Sub1_1.method4426();
							local786 = Static480.aClass1_Sub20_Sub1_1.method4396();
							local790 = Static480.aClass1_Sub20_Sub1_1.method4393();
							@Pc(2152) long local2152 = (local781 << 32) + local786;
							@Pc(2154) boolean local2154 = false;
							local1472 = 0;
							while (true) {
								if (local1472 >= 100) {
									if (local790 <= 1) {
										if (Static242.aBoolean359 && !Static35.aBoolean80 || Static329.aBoolean427) {
											local2154 = true;
										} else if (Static560.method7545(local300)) {
											local2154 = true;
										}
									}
									break;
								}
								if (local2152 == Static393.aLongArray14[local1472]) {
									local2154 = true;
									break;
								}
								local1472++;
							}
							if (!local2154 && Static53.anInt1363 == 0) {
								Static393.aLongArray14[Static30.anInt872] = local2152;
								Static30.anInt872 = (Static30.anInt872 + 1) % 100;
								@Pc(2211) String local2211 = Static193.method3394(Static456.method6392(Static480.aClass1_Sub20_Sub1_1));
								if (local790 == 2 || local790 == 3) {
									Static337.method5034("<img=1>" + local764, Static67.method1436(local776), 9, local764, local2211, 0, "<img=1>" + local300, -1);
								} else if (local790 == 1) {
									Static337.method5034("<img=0>" + local764, Static67.method1436(local776), 9, local764, local2211, 0, "<img=0>" + local300, -1);
								} else {
									Static337.method5034(local764, Static67.method1436(local776), 9, local764, local2211, 0, local300, -1);
								}
							}
							Static315.aClass81_130 = null;
							return true;
						} else if (Static179.aClass81_89 == Static315.aClass81_130) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4371();
							Static121.aClass148_1.method3532(local233, local78);
							Static315.aClass81_130 = null;
							return true;
						} else if (Static315.aClass81_130 == Static87.aClass81_50) {
							Static433.method6296(Static464.aClass181_11);
							Static315.aClass81_130 = null;
							return true;
						} else if (Static190.aClass81_97 == Static315.aClass81_130) {
							Static328.method4965(Static480.aClass1_Sub20_Sub1_1, Static494.anInt8294, Static246.aClass114_10);
							Static315.aClass81_130 = null;
							return true;
						} else if (Static315.aClass81_130 == Static366.aClass81_152) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4435();
							local478 = Static480.aClass1_Sub20_Sub1_1.method4424();
							if (local478 == 65535) {
								local478 = -1;
							}
							if (Static412.method5785(local233)) {
								Static324.method4900(2, -1, local78, local478);
							}
							Static315.aClass81_130 = null;
							return true;
						} else if (Static166.aClass81_78 == Static315.aClass81_130) {
							Static433.method6296(Static282.aClass181_7);
							Static315.aClass81_130 = null;
							return true;
						} else if (Static554.aClass81_218 == Static315.aClass81_130) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4394();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4435();
							local478 = Static480.aClass1_Sub20_Sub1_1.method4417();
							if (Static412.method5785(local478)) {
								Static505.method7001(local233, local78);
							}
							Static315.aClass81_130 = null;
							return true;
						} else if (Static86.aClass81_49 == Static315.aClass81_130) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
							local949 = (local78 & 0x1) == 1;
							Static64.method1430(local233, local949);
							local641 = Static480.aClass1_Sub20_Sub1_1.method4426();
							for (local645 = 0; local645 < local641; local645++) {
								local649 = Static480.aClass1_Sub20_Sub1_1.method4424();
								local362 = Static480.aClass1_Sub20_Sub1_1.method4382();
								if (local362 == 255) {
									local362 = Static480.aClass1_Sub20_Sub1_1.method4435();
								}
								Static4.method74(local362, local233, local949, local649 - 1, local645);
							}
							Static443.anIntArray514[Static415.anInt7073++ & 0x1F] = local233;
							Static315.aClass81_130 = null;
							return true;
						} else if (Static206.aClass81_106 == Static315.aClass81_130) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4417();
							if (local233 == 65535) {
								local233 = -1;
							}
							local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
							local478 = Static480.aClass1_Sub20_Sub1_1.method4408();
							Static363.method6685(local78, local233, local478);
							Static315.aClass81_130 = null;
							return true;
						} else if (Static315.aClass81_130 == Static89.aClass81_53) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4383();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4382();
							local478 = Static480.aClass1_Sub20_Sub1_1.method4424();
							if (local478 == 65535) {
								local478 = -1;
							}
							Static464.method6584(local478, local233, local78);
							Static315.aClass81_130 = null;
							return true;
						} else if (Static23.aClass81_149 == Static315.aClass81_130) {
							Static502.anInt8424 = Static480.aClass1_Sub20_Sub1_1.method4393();
							Static518.anInt8570 = Static480.aClass1_Sub20_Sub1_1.method4408();
							Static315.aClass81_130 = null;
							return true;
						} else if (Static315.aClass81_130 == Static229.aClass81_210) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
							if (local233 == 65535) {
								local233 = -1;
							}
							local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
							local478 = Static480.aClass1_Sub20_Sub1_1.method4426();
							local641 = Static480.aClass1_Sub20_Sub1_1.method4393();
							Static291.method4575(local233, local478, local78, local641, false);
							Static315.aClass81_130 = null;
							return true;
						} else if (Static315.aClass81_130 == Static222.aClass81_27) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4393();
							local78 = local233 >> 5;
							local478 = local233 & 0x1F;
							if (local478 == 0) {
								Static276.aClass221Array1[local78] = null;
								Static315.aClass81_130 = null;
								return true;
							}
							@Pc(2626) Class221 local2626 = new Class221();
							local2626.anInt6039 = local478;
							local2626.anInt6041 = Static480.aClass1_Sub20_Sub1_1.method4393();
							if (local2626.anInt6041 >= 0 && Static30.aClass10Array1.length > local2626.anInt6041) {
								if (local2626.anInt6039 == 1 || local2626.anInt6039 == 10) {
									local2626.anInt6044 = Static480.aClass1_Sub20_Sub1_1.method4426();
									Static480.aClass1_Sub20_Sub1_1.anInt5238 += 6;
								} else if (local2626.anInt6039 >= 2 && local2626.anInt6039 <= 6) {
									if (local2626.anInt6039 == 2) {
										local2626.anInt6042 = 256;
										local2626.anInt6035 = 256;
									}
									if (local2626.anInt6039 == 3) {
										local2626.anInt6035 = 0;
										local2626.anInt6042 = 256;
									}
									if (local2626.anInt6039 == 4) {
										local2626.anInt6035 = 512;
										local2626.anInt6042 = 256;
									}
									if (local2626.anInt6039 == 5) {
										local2626.anInt6035 = 256;
										local2626.anInt6042 = 0;
									}
									if (local2626.anInt6039 == 6) {
										local2626.anInt6035 = 256;
										local2626.anInt6042 = 512;
									}
									local2626.anInt6039 = 2;
									local2626.anInt6037 = Static480.aClass1_Sub20_Sub1_1.method4393();
									local2626.anInt6035 += Static480.aClass1_Sub20_Sub1_1.method4426() - Static376.anInt6631 << 9;
									local2626.anInt6042 += Static480.aClass1_Sub20_Sub1_1.method4426() - Static24.anInt674 << 9;
									local2626.anInt6048 = Static480.aClass1_Sub20_Sub1_1.method4393() << 2;
									local2626.anInt6038 = Static480.aClass1_Sub20_Sub1_1.method4426();
								}
								local2626.anInt6043 = Static480.aClass1_Sub20_Sub1_1.method4426();
								if (local2626.anInt6043 == 65535) {
									local2626.anInt6043 = -1;
								}
								Static276.aClass221Array1[local78] = local2626;
							}
							Static315.aClass81_130 = null;
							return true;
						} else if (Static518.aClass81_204 == Static315.aClass81_130) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4398();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4394();
							if (Static412.method5785(local78)) {
								if (local233 == -1) {
									Static282.anInt5182 = -1;
									Static394.anInt6810 = -1;
								} else {
									local478 = local233 >> 14 & 0x3FFF;
									local478 -= Static376.anInt6631;
									local641 = local233 & 0x3FFF;
									local641 -= Static24.anInt674;
									if (local478 < 0) {
										local478 = 0;
									} else if (Static500.anInt6888 <= local478) {
										local478 = Static500.anInt6888;
									}
									Static394.anInt6810 = (local478 << 9) + 256;
									if (local641 < 0) {
										local641 = 0;
									} else if (local641 >= Static573.anInt9325) {
										local641 = Static573.anInt9325;
									}
									Static282.anInt5182 = (local641 << 9) + 256;
								}
							}
							Static315.aClass81_130 = null;
							return true;
						} else if (Static173.aClass81_84 == Static315.aClass81_130) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4424();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4372();
							local478 = Static480.aClass1_Sub20_Sub1_1.method4417();
							if (Static412.method5785(local233)) {
								if (local78 == 2) {
									Static200.method3429();
								}
								Static219.anInt4263 = local478;
								Static40.method5276(local478);
								Static261.method4073(false);
								Static145.method2351(Static219.anInt4263);
								for (local641 = 0; local641 < 100; local641++) {
									Static510.aBooleanArray29[local641] = true;
								}
							}
							Static315.aClass81_130 = null;
							return true;
						} else if (Static483.aClass81_194 == Static315.aClass81_130) {
							local264 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
							local764 = Static480.aClass1_Sub20_Sub1_1.method4388();
							local300 = local764;
							if (local264) {
								local300 = Static480.aClass1_Sub20_Sub1_1.method4388();
							}
							local776 = Static480.aClass1_Sub20_Sub1_1.method4426();
							local781 = Static480.aClass1_Sub20_Sub1_1.method4396();
							local1989 = Static480.aClass1_Sub20_Sub1_1.method4393();
							@Pc(2982) long local2982 = local781 + (local776 << 32);
							@Pc(2984) boolean local2984 = false;
							local1540 = 0;
							while (true) {
								if (local1540 >= 100) {
									if (local1989 <= 1) {
										if (Static242.aBoolean359 && !Static35.aBoolean80 || Static329.aBoolean427) {
											local2984 = true;
										} else if (Static560.method7545(local300)) {
											local2984 = true;
										}
									}
									break;
								}
								if (Static393.aLongArray14[local1540] == local2982) {
									local2984 = true;
									break;
								}
								local1540++;
							}
							if (!local2984 && Static53.anInt1363 == 0) {
								Static393.aLongArray14[Static30.anInt872] = local2982;
								Static30.anInt872 = (Static30.anInt872 + 1) % 100;
								@Pc(3046) String local3046 = Static193.method3394(Static456.method6392(Static480.aClass1_Sub20_Sub1_1));
								if (local1989 == 2) {
									Static337.method5034("<img=1>" + local764, null, 7, local764, local3046, 0, "<img=1>" + local300, -1);
								} else if (local1989 == 1) {
									Static337.method5034("<img=0>" + local764, null, 7, local764, local3046, 0, "<img=0>" + local300, -1);
								} else {
									Static337.method5034(local764, null, 3, local764, local3046, 0, local300, -1);
								}
							}
							Static315.aClass81_130 = null;
							return true;
						} else if (Static441.aClass81_181 == Static315.aClass81_130) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4382();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4398();
							local478 = Static480.aClass1_Sub20_Sub1_1.method4372();
							Static118.anIntArray145[local478] = local78;
							Static128.anIntArray158[local478] = local233;
							Static374.anIntArray442[local478] = 1;
							local641 = Static544.anIntArray601[local478] - 1;
							for (local645 = 0; local645 < local641; local645++) {
								if (local78 >= Class309.anIntArray580[local645]) {
									Static374.anIntArray442[local478] = local645 + 2;
								}
							}
							Static500.anIntArray473[Static221.anInt4275++ & 0x1F] = local478;
							Static315.aClass81_130 = null;
							return true;
						} else if (Static315.aClass81_130 == Static4.aClass81_3) {
							local233 = Static480.aClass1_Sub20_Sub1_1.method4371();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
							local478 = Static480.aClass1_Sub20_Sub1_1.method4417();
							local641 = Static480.aClass1_Sub20_Sub1_1.method4424();
							if (Static412.method5785(local641)) {
								local496 = (Class1_Sub16) Static68.aClass356_4.method7796((long) local233);
								if (local496 != null) {
									Static546.method7412(local496, local478 != local496.anInt2681, false);
								}
								Static578.method7768(false, local78, local233, local478);
							}
							Static315.aClass81_130 = null;
							return true;
						} else if (Static548.aClass81_217 == Static315.aClass81_130) {
							local264 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
							local764 = Static480.aClass1_Sub20_Sub1_1.method4388();
							local300 = local764;
							if (local264) {
								local300 = Static480.aClass1_Sub20_Sub1_1.method4388();
							}
							local776 = Static480.aClass1_Sub20_Sub1_1.method4426();
							local781 = Static480.aClass1_Sub20_Sub1_1.method4396();
							local1989 = Static480.aClass1_Sub20_Sub1_1.method4393();
							local1011 = Static480.aClass1_Sub20_Sub1_1.method4426();
							@Pc(3282) long local3282 = local781 + (local776 << 32);
							@Pc(3284) boolean local3284 = false;
							local1721 = 0;
							while (true) {
								if (local1721 >= 100) {
									if (local1989 <= 1 && Static560.method7545(local300)) {
										local3284 = true;
									}
									break;
								}
								if (local3282 == Static393.aLongArray14[local1721]) {
									local3284 = true;
									break;
								}
								local1721++;
							}
							if (!local3284 && Static53.anInt1363 == 0) {
								Static393.aLongArray14[Static30.anInt872] = local3282;
								Static30.anInt872 = (Static30.anInt872 + 1) % 100;
								@Pc(3335) String local3335 = Static296.aClass362_2.method7873(local1011).method818(Static480.aClass1_Sub20_Sub1_1);
								if (local1989 == 2) {
									Static337.method5034("<img=1>" + local764, null, 18, local764, local3335, 0, "<img=1>" + local300, local1011);
								} else if (local1989 == 1) {
									Static337.method5034("<img=0>" + local764, null, 18, local764, local3335, 0, "<img=0>" + local300, local1011);
								} else {
									Static337.method5034(local764, null, 18, local764, local3335, 0, local300, local1011);
								}
							}
							Static315.aClass81_130 = null;
							return true;
						} else if (Static357.aClass81_145 == Static315.aClass81_130) {
							local940 = Static480.aClass1_Sub20_Sub1_1.method4388();
							local78 = Static480.aClass1_Sub20_Sub1_1.method4426();
							local300 = Static296.aClass362_2.method7873(local78).method818(Static480.aClass1_Sub20_Sub1_1);
							Static337.method5034(local940, null, 19, local940, local300, 0, local940, local78);
							Static315.aClass81_130 = null;
							return true;
						} else {
							@Pc(3479) boolean local3479;
							if (Static170.aClass81_81 == Static315.aClass81_130) {
								local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
								@Pc(3448) Class20_Sub2_Sub4_Sub1_Sub1 local3448;
								if (Static594.anInt9653 == local233) {
									local3448 = Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2;
								} else {
									local3448 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local233];
								}
								if (local3448 == null) {
									Static315.aClass81_130 = null;
									return true;
								}
								local478 = Static480.aClass1_Sub20_Sub1_1.method4426();
								local641 = Static480.aClass1_Sub20_Sub1_1.method4393();
								local3479 = (local478 & 0x8000) != 0;
								if (local3448.aString49 != null && local3448.aClass34_1 != null) {
									local969 = false;
									if (local641 <= 1) {
										if (!local3479 && (Static242.aBoolean359 && !Static35.aBoolean80 || Static329.aBoolean427)) {
											local969 = true;
										} else if (Static560.method7545(local3448.aString49)) {
											local969 = true;
										}
									}
									if (!local969 && Static53.anInt1363 == 0) {
										local1989 = -1;
										if (local3479) {
											local478 &= 0x7FFF;
											@Pc(3525) Class40 local3525 = Static257.method4051(Static480.aClass1_Sub20_Sub1_1);
											local1989 = local3525.anInt1400;
											local982 = local3525.aClass1_Sub3_Sub3_1.method818(Static480.aClass1_Sub20_Sub1_1);
										} else {
											local982 = Static193.method3394(Static456.method6392(Static480.aClass1_Sub20_Sub1_1));
										}
										local3448.aString66 = local982.trim();
										local3448.anInt6463 = 150;
										local3448.anInt6458 = local478 & 0xFF;
										local3448.anInt6414 = local478 >> 8;
										if (local641 == 1 || local641 == 2) {
											local1011 = local3479 ? 17 : 1;
										} else {
											local1011 = local3479 ? 17 : 2;
										}
										if (local641 == 2) {
											Static337.method5034("<img=1>" + local3448.method4153(), null, local1011, local3448.aString50, local982, 0, "<img=1>" + local3448.method4151(), local1989);
										} else if (local641 == 1) {
											Static337.method5034("<img=0>" + local3448.method4153(), null, local1011, local3448.aString50, local982, 0, "<img=0>" + local3448.method4151(), local1989);
										} else {
											Static337.method5034(local3448.method4153(), null, local1011, local3448.aString50, local982, 0, local3448.method4151(), local1989);
										}
									}
								}
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static89.aClass81_52) {
								Static433.method6296(Static568.aClass181_15);
								Static315.aClass81_130 = null;
								return true;
							} else if (Static147.aClass81_76 == Static315.aClass81_130) {
								Static371.aClass290_5 = Static112.method1974(Static480.aClass1_Sub20_Sub1_1.method4393());
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static111.aClass81_62) {
								local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
								local78 = Static480.aClass1_Sub20_Sub1_1.method4372();
								Static121.aClass148_1.method3538(local78, local233);
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static418.aClass81_169) {
								local940 = Static480.aClass1_Sub20_Sub1_1.method4388();
								local78 = Static480.aClass1_Sub20_Sub1_1.method4424();
								local478 = Static480.aClass1_Sub20_Sub1_1.method4424();
								if (Static412.method5785(local478)) {
									Static409.method5762(local78, local940);
								}
								Static315.aClass81_130 = null;
								return true;
							} else if (Static491.aClass81_45 == Static315.aClass81_130) {
								Static252.anInt9487 = Static480.aClass1_Sub20_Sub1_1.method4432() << 3;
								Static212.anInt4155 = Static480.aClass1_Sub20_Sub1_1.method4382();
								Static215.anInt4175 = Static480.aClass1_Sub20_Sub1_1.method4387() << 3;
								for (@Pc(3766) Class1_Sub37 local3766 = (Class1_Sub37) Static186.aClass356_13.method7792(); local3766 != null; local3766 = (Class1_Sub37) Static186.aClass356_13.method7795()) {
									local78 = (int) (local3766.aLong425 >> 28 & 0x3L);
									local478 = (int) (local3766.aLong425 & 0x3FFFL);
									local641 = local478 - Static376.anInt6631;
									local645 = (int) (local3766.aLong425 >> 14 & 0x3FFFL);
									local649 = local645 - Static24.anInt674;
									if (local78 == Static212.anInt4155 && local641 >= Static252.anInt9487 && Static252.anInt9487 + 8 > local641 && Static215.anInt4175 <= local649 && local649 < Static215.anInt4175 + 8) {
										local3766.method7878();
										if (local641 >= 0 && local649 >= 0 && Static500.anInt6888 > local641 && local649 < Static573.anInt9325) {
											Static213.method3552(local641, local649, Static212.anInt4155);
										}
									}
								}
								for (@Pc(3853) Class1_Sub10 local3853 = (Class1_Sub10) Static16.aClass361_15.method7854(); local3853 != null; local3853 = (Class1_Sub10) Static16.aClass361_15.method7853()) {
									if (Static252.anInt9487 <= local3853.anInt2090 && local3853.anInt2090 < Static252.anInt9487 + 8 && Static215.anInt4175 <= local3853.anInt2089 && local3853.anInt2089 < Static215.anInt4175 + 8 && local3853.anInt2083 == Static212.anInt4155) {
										local3853.anInt2091 = 0;
									}
								}
								Static315.aClass81_130 = null;
								return true;
							} else if (Static499.aClass81_199 == Static315.aClass81_130) {
								if (Static219.anInt4263 != -1) {
									Static463.method6579(Static219.anInt4263, 0);
								}
								Static315.aClass81_130 = null;
								return true;
							} else if (Static453.aClass81_183 == Static315.aClass81_130) {
								local264 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
								local764 = Static480.aClass1_Sub20_Sub1_1.method4388();
								local300 = local764;
								if (local264) {
									local300 = Static480.aClass1_Sub20_Sub1_1.method4388();
								}
								local641 = Static480.aClass1_Sub20_Sub1_1.method4393();
								local3479 = false;
								if (local641 <= 1) {
									if (Static242.aBoolean359 && !Static35.aBoolean80 || Static329.aBoolean427) {
										local3479 = true;
									} else if (local641 <= 1 && Static560.method7545(local300)) {
										local3479 = true;
									}
								}
								if (!local3479 && Static53.anInt1363 == 0) {
									local352 = Static193.method3394(Static456.method6392(Static480.aClass1_Sub20_Sub1_1));
									if (local641 == 2) {
										Static337.method5034("<img=1>" + local764, null, 24, local764, local352, 0, "<img=1>" + local300, -1);
									} else if (local641 == 1) {
										Static337.method5034("<img=0>" + local764, null, 24, local764, local352, 0, "<img=0>" + local300, -1);
									} else {
										Static337.method5034(local764, null, 24, local764, local352, 0, local300, -1);
									}
								}
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static102.aClass81_56) {
								local233 = Static480.aClass1_Sub20_Sub1_1.method4417();
								local78 = Static480.aClass1_Sub20_Sub1_1.method4389();
								if (Static412.method5785(local233)) {
									Static324.method4900(3, -1, local78, -1);
								}
								Static315.aClass81_130 = null;
								return true;
							} else if (Static476.aClass81_191 == Static315.aClass81_130) {
								Static433.method6296(Static564.aClass181_14);
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static542.aClass81_212) {
								Static433.method6296(Class17_Sub3.lb);
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static284.aClass81_122) {
								local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
								local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
								local949 = (local78 & 0x1) == 1;
								while (Static494.anInt8294 > Static480.aClass1_Sub20_Sub1_1.anInt5238) {
									local641 = Static480.aClass1_Sub20_Sub1_1.method4427();
									local645 = Static480.aClass1_Sub20_Sub1_1.method4426();
									local649 = 0;
									if (local645 != 0) {
										local649 = Static480.aClass1_Sub20_Sub1_1.method4393();
										if (local649 == 255) {
											local649 = Static480.aClass1_Sub20_Sub1_1.method4371();
										}
									}
									Static4.method74(local649, local233, local949, local645 - 1, local641);
								}
								Static443.anIntArray514[Static415.anInt7073++ & 0x1F] = local233;
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static110.aClass81_61) {
								local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
								local78 = Static480.aClass1_Sub20_Sub1_1.method4426();
								local478 = Static480.aClass1_Sub20_Sub1_1.method4426();
								local641 = Static480.aClass1_Sub20_Sub1_1.method4426();
								if (Static412.method5785(local233) && Static249.aClass365ArrayArray3[local78] != null) {
									for (local645 = local478; local645 < local641; local645++) {
										local649 = Static480.aClass1_Sub20_Sub1_1.method4396();
										if (Static249.aClass365ArrayArray3[local78].length > local645 && Static249.aClass365ArrayArray3[local78][local645] != null) {
											Static249.aClass365ArrayArray3[local78][local645].anInt9639 = local649;
										}
									}
								}
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static227.aClass81_109) {
								Static389.anInt6778 = Static480.aClass1_Sub20_Sub1_1.method4393();
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static59.aClass81_188) {
								local233 = Static480.aClass1_Sub20_Sub1_1.method4393();
								local78 = Static480.aClass1_Sub20_Sub1_1.method4394();
								local949 = (local233 & 0x1) == 1;
								Static513.method7032(local78, local949);
								Static443.anIntArray514[Static415.anInt7073++ & 0x1F] = local78;
								Static315.aClass81_130 = null;
								return true;
							} else if (Static444.aClass81_129 == Static315.aClass81_130) {
								local233 = Static480.aClass1_Sub20_Sub1_1.method4424();
								local78 = Static480.aClass1_Sub20_Sub1_1.method4398();
								local478 = Static480.aClass1_Sub20_Sub1_1.method4393();
								if (Static412.method5785(local233)) {
									Static429.method6009(local78, local478);
								}
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static86.aClass81_48) {
								local233 = Static480.aClass1_Sub20_Sub1_1.method4372();
								local78 = local233 >> 2;
								local478 = local233 & 0x3;
								local641 = Static130.anIntArray520[local78];
								local645 = Static480.aClass1_Sub20_Sub1_1.method4394();
								if (local645 == 65535) {
									local645 = -1;
								}
								local649 = Static480.aClass1_Sub20_Sub1_1.method4398();
								local362 = local649 >> 28 & 0x3;
								local1989 = local649 >> 14 & 0x3FFF;
								local1989 -= Static376.anInt6631;
								local1011 = local649 & 0x3FFF;
								local1011 -= Static24.anInt674;
								Static530.method7225(local1011, local78, local645, local478, local641, local1989, local362);
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static110.aClass81_60) {
								local233 = Static480.aClass1_Sub20_Sub1_1.method4372();
								@Pc(4397) int[] local4397 = new int[4];
								for (local478 = 0; local478 < 4; local478++) {
									local4397[local478] = Static480.aClass1_Sub20_Sub1_1.method4426();
								}
								local641 = Static480.aClass1_Sub20_Sub1_1.method4426();
								@Pc(4422) Class1_Sub39 local4422 = (Class1_Sub39) Static131.aClass356_32.method7796((long) local641);
								if (local4422 != null) {
									Static411.method5771(local4422.aClass20_Sub2_Sub4_Sub1_Sub2_2, local233, local4397);
								}
								Static315.aClass81_130 = null;
								return true;
							} else if (Static282.aClass81_121 == Static315.aClass81_130) {
								Static438.method6325(false);
								Static315.aClass81_130 = null;
								return true;
							} else if (Static315.aClass81_130 == Static144.aClass81_74) {
								Static315.aClass81_130 = null;
								return false;
							} else if (Static315.aClass81_130 == Static63.aClass81_42) {
								Static340.method5070(false);
								Static315.aClass81_130 = null;
								return false;
							} else if (Static171.aClass81_82 == Static315.aClass81_130) {
								Static296.anInt5477 = Static480.aClass1_Sub20_Sub1_1.method4391();
								Static315.aClass81_130 = null;
								Static384.anInt7194 = Static274.anInt5077;
								return true;
							} else {
								@Pc(4523) long local4523;
								@Pc(4538) Class1_Sub28 local4538;
								@Pc(4529) Class1_Sub28 local4529;
								if (Static99.aClass81_55 == Static315.aClass81_130) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4435();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4417();
									if (local78 == 65535) {
										local78 = -1;
									}
									local478 = Static480.aClass1_Sub20_Sub1_1.method4389();
									local641 = Static480.aClass1_Sub20_Sub1_1.method4417();
									local645 = Static480.aClass1_Sub20_Sub1_1.method4417();
									if (local645 == 65535) {
										local645 = -1;
									}
									if (Static412.method5785(local641)) {
										for (local649 = local645; local649 <= local78; local649++) {
											local4523 = (long) local649 + ((long) local233 << 32);
											local4529 = (Class1_Sub28) Static410.aClass356_31.method7796(local4523);
											if (local4529 != null) {
												local4538 = new Class1_Sub28(local478, local4529.anInt5702);
												local4529.method7878();
											} else if (local649 == -1) {
												local4538 = new Class1_Sub28(local478, Static374.method5437(local233).aClass1_Sub28_2.anInt5702);
											} else {
												local4538 = new Class1_Sub28(local478, -1);
											}
											Static410.aClass356_31.method7800(local4523, local4538);
										}
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static323.aClass81_136 == Static315.aClass81_130) {
									Static480.aClass1_Sub20_Sub1_1.anInt5238 += 28;
									if (Static480.aClass1_Sub20_Sub1_1.method4404()) {
										Static519.method7101(Static480.aClass1_Sub20_Sub1_1.anInt5238 - 28, Static480.aClass1_Sub20_Sub1_1);
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static589.aClass81_230 == Static315.aClass81_130) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4371();
									Static105.aClass23_5 = Static246.aClass114_10.method2504(local233);
									Static315.aClass81_130 = null;
									return true;
								} else if (Static315.aClass81_130 == Static518.aClass81_203) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4417();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4389();
									if (Static412.method5785(local233)) {
										Static324.method4900(5, 0, local78, Static594.anInt9653);
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static199.aClass81_103 == Static315.aClass81_130) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
									if (local233 == 65535) {
										local233 = -1;
									}
									local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
									local478 = Static480.aClass1_Sub20_Sub1_1.method4426();
									local641 = Static480.aClass1_Sub20_Sub1_1.method4393();
									Static291.method4575(local233, local478, local78, local641, true);
									Static315.aClass81_130 = null;
									return true;
								} else if (Static188.aClass81_96 == Static315.aClass81_130) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4408();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
									local478 = Static480.aClass1_Sub20_Sub1_1.method4394();
									if (local478 == 65535) {
										local478 = -1;
									}
									local338 = Static480.aClass1_Sub20_Sub1_1.method4388();
									if (local78 >= 1 && local78 <= 8) {
										if (local338.equalsIgnoreCase("null")) {
											local338 = null;
										}
										Static472.aStringArray41[local78 - 1] = local338;
										Static311.anIntArray359[local78 - 1] = local478;
										Static511.aBooleanArray27[local78 - 1] = local233 == 0;
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static279.aClass81_120 == Static315.aClass81_130) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
									if (local233 == 65535) {
										local233 = -1;
									}
									local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
									local478 = Static480.aClass1_Sub20_Sub1_1.method4426();
									local641 = Static480.aClass1_Sub20_Sub1_1.method4393();
									Static364.method5314(local78, local233, local641, local478);
									Static315.aClass81_130 = null;
									return true;
								} else if (Static315.aClass81_130 == Static295.aClass81_126) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4417();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4424();
									if (local78 == 65535) {
										local78 = -1;
									}
									local478 = Static480.aClass1_Sub20_Sub1_1.method4426();
									local641 = Static480.aClass1_Sub20_Sub1_1.method4417();
									if (local641 == 65535) {
										local641 = -1;
									}
									local645 = Static480.aClass1_Sub20_Sub1_1.method4389();
									if (Static412.method5785(local478)) {
										for (local649 = local78; local649 <= local641; local649++) {
											local4523 = ((long) local645 << 32) + (long) local649;
											local4529 = (Class1_Sub28) Static410.aClass356_31.method7796(local4523);
											if (local4529 != null) {
												local4538 = new Class1_Sub28(local4529.anInt5698, local233);
												local4529.method7878();
											} else if (local649 == -1) {
												local4538 = new Class1_Sub28(Static374.method5437(local645).aClass1_Sub28_2.anInt5698, local233);
											} else {
												local4538 = new Class1_Sub28(0, local233);
											}
											Static410.aClass356_31.method7800(local4523, local4538);
										}
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static394.aClass81_160 == Static315.aClass81_130) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4417();
									if (local78 == 65535) {
										local78 = -1;
									}
									local478 = Static480.aClass1_Sub20_Sub1_1.method4435();
									if (Static412.method5785(local233)) {
										Static63.method1409(local478, local78);
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static23.aClass81_148 == Static315.aClass81_130) {
									Static340.method5072(Static480.aClass1_Sub20_Sub1_1.method4388());
									Static315.aClass81_130 = null;
									return true;
								} else if (Static582.aClass81_226 == Static315.aClass81_130) {
									Static552.method7061(Static480.aClass1_Sub20_Sub1_1, Static494.anInt8294);
									Static315.aClass81_130 = null;
									return true;
								} else if (Static137.aClass81_71 == Static315.aClass81_130) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
									if (Static412.method5785(local233)) {
										Static87.method1723();
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static522.aClass81_205 == Static315.aClass81_130) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4424();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4394();
									local478 = Static480.aClass1_Sub20_Sub1_1.method4398();
									if (Static412.method5785(local233)) {
										Static1.method42(local478, local78);
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static577.aClass81_225 == Static315.aClass81_130) {
									Static433.method6296(Static359.aClass181_9);
									Static315.aClass81_130 = null;
									return true;
								} else if (Static404.aClass81_164 == Static315.aClass81_130) {
									local940 = Static480.aClass1_Sub20_Sub1_1.method4388();
									local764 = Static193.method3394(Static456.method6392(Static480.aClass1_Sub20_Sub1_1));
									Static114.method1983(local940, local940, local940, 0, local764, 6);
									Static315.aClass81_130 = null;
									return true;
								} else if (Static199.aClass81_104 == Static315.aClass81_130) {
									for (local233 = 0; local233 < Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6.length; local233++) {
										if (Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local233] != null) {
											Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local233].anIntArray429 = null;
											Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local233].anInt6438 = -1;
										}
									}
									for (local78 = 0; local78 < Static491.anInt1754; local78++) {
										Static471.aClass1_Sub39Array1[local78].aClass20_Sub2_Sub4_Sub1_Sub2_2.anIntArray429 = null;
										Static471.aClass1_Sub39Array1[local78].aClass20_Sub2_Sub4_Sub1_Sub2_2.anInt6438 = -1;
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static315.aClass81_130 == Static391.aClass81_159) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4394();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4435();
									local478 = Static480.aClass1_Sub20_Sub1_1.method4424();
									if (Static412.method5785(local233)) {
										Static554.method7512(local478, local78);
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static315.aClass81_130 == Static456.aClass81_185) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4394();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4424();
									local478 = Static480.aClass1_Sub20_Sub1_1.method4417();
									local641 = Static480.aClass1_Sub20_Sub1_1.method4394();
									local645 = Static480.aClass1_Sub20_Sub1_1.method4398();
									if (Static412.method5785(local78)) {
										Static559.method7540(local645, local233, local641, local478);
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static315.aClass81_130 == Static493.aClass81_198) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4394();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4394();
									local478 = Static480.aClass1_Sub20_Sub1_1.method4426();
									if (Static412.method5785(local478)) {
										Static373.method5434(local78, local233);
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static315.aClass81_130 == Static126.aClass81_156) {
									Static490.method6894();
									Static315.aClass81_130 = null;
									return true;
								} else if (Static331.aClass81_138 == Static315.aClass81_130) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4424();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4394();
									local478 = Static480.aClass1_Sub20_Sub1_1.method4417();
									local641 = Static480.aClass1_Sub20_Sub1_1.method4426();
									local645 = Static480.aClass1_Sub20_Sub1_1.method4371();
									if (Static412.method5785(local641)) {
										Static324.method4900(7, local78, local645, local233 | local478 << 16);
									}
									Static315.aClass81_130 = null;
									return true;
								} else if (Static337.aClass81_141 == Static315.aClass81_130) {
									Static433.method6296(Static37.aClass181_1);
									Static315.aClass81_130 = null;
									return true;
								} else if (Static415.aClass81_167 == Static315.aClass81_130) {
									local233 = Static480.aClass1_Sub20_Sub1_1.method4417();
									local78 = Static480.aClass1_Sub20_Sub1_1.method4424();
									local478 = Static480.aClass1_Sub20_Sub1_1.method4371();
									local641 = Static480.aClass1_Sub20_Sub1_1.method4417();
									if (Static412.method5785(local641)) {
										Static35.method844(local478, (local233 << 16) + local78);
									}
									Static315.aClass81_130 = null;
									return true;
								} else {
									@Pc(5304) boolean local5304;
									if (Static546.aClass81_216 == Static315.aClass81_130) {
										while (Static494.anInt8294 > Static480.aClass1_Sub20_Sub1_1.anInt5238) {
											local264 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
											local764 = Static480.aClass1_Sub20_Sub1_1.method4388();
											local300 = Static480.aClass1_Sub20_Sub1_1.method4388();
											local641 = Static480.aClass1_Sub20_Sub1_1.method4426();
											local645 = Static480.aClass1_Sub20_Sub1_1.method4393();
											local352 = "";
											local5304 = false;
											if (local641 > 0) {
												local352 = Static480.aClass1_Sub20_Sub1_1.method4388();
												local5304 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
											}
											for (local1989 = 0; local1989 < Static184.anInt5417; local1989++) {
												if (local264) {
													if (local300.equals(Static333.aStringArray26[local1989])) {
														Static333.aStringArray26[local1989] = local764;
														local764 = null;
														Static498.aStringArray34[local1989] = local300;
														break;
													}
												} else if (local764.equals(Static333.aStringArray26[local1989])) {
													if (Static476.anIntArray532[local1989] != local641) {
														local1681 = true;
														for (@Pc(5349) Class20_Sub1_Sub2 local5349 = (Class20_Sub1_Sub2) Static447.aClass349_14.method7653(); local5349 != null; local5349 = (Class20_Sub1_Sub2) Static447.aClass349_14.method7660()) {
															if (local5349.aString24.equals(local764)) {
																if (local641 != 0 && local5349.aShort26 == 0) {
																	local5349.method7704();
																	local1681 = false;
																} else if (local641 == 0 && local5349.aShort26 != 0) {
																	local5349.method7704();
																	local1681 = false;
																}
															}
														}
														if (local1681) {
															Static447.aClass349_14.method7655(new Class20_Sub1_Sub2(local764, local641));
														}
														Static476.anIntArray532[local1989] = local641;
													}
													Static498.aStringArray34[local1989] = local300;
													Static38.aStringArray4[local1989] = local352;
													Static298.anIntArray349[local1989] = local645;
													local764 = null;
													Static138.aBooleanArray3[local1989] = local5304;
													break;
												}
											}
											if (local764 != null && Static184.anInt5417 < 200) {
												Static333.aStringArray26[Static184.anInt5417] = local764;
												Static498.aStringArray34[Static184.anInt5417] = local300;
												Static476.anIntArray532[Static184.anInt5417] = local641;
												Static38.aStringArray4[Static184.anInt5417] = local352;
												Static298.anIntArray349[Static184.anInt5417] = local645;
												Static138.aBooleanArray3[Static184.anInt5417] = local5304;
												Static184.anInt5417++;
											}
										}
										Static18.anInt603 = Static274.anInt5077;
										Static454.anInt7768 = 2;
										local78 = Static184.anInt5417;
										while (local78 > 0) {
											local78--;
											local264 = true;
											for (local478 = 0; local478 < local78; local478++) {
												if (Static476.anIntArray532[local478] != Static137.aClass174_1.anInt4666 && Static476.anIntArray532[local478 + 1] == Static137.aClass174_1.anInt4666 || Static476.anIntArray532[local478] == 0 && Static476.anIntArray532[local478 + 1] != 0) {
													local641 = Static476.anIntArray532[local478];
													Static476.anIntArray532[local478] = Static476.anIntArray532[local478 + 1];
													Static476.anIntArray532[local478 + 1] = local641;
													local348 = Static38.aStringArray4[local478];
													Static38.aStringArray4[local478] = Static38.aStringArray4[local478 + 1];
													Static38.aStringArray4[local478 + 1] = local348;
													local352 = Static333.aStringArray26[local478];
													Static333.aStringArray26[local478] = Static333.aStringArray26[local478 + 1];
													Static333.aStringArray26[local478 + 1] = local352;
													local982 = Static498.aStringArray34[local478];
													Static498.aStringArray34[local478] = Static498.aStringArray34[local478 + 1];
													Static498.aStringArray34[local478 + 1] = local982;
													local1989 = Static298.anIntArray349[local478];
													Static298.anIntArray349[local478] = Static298.anIntArray349[local478 + 1];
													Static298.anIntArray349[local478 + 1] = local1989;
													local1681 = Static138.aBooleanArray3[local478];
													Static138.aBooleanArray3[local478] = Static138.aBooleanArray3[local478 + 1];
													Static138.aBooleanArray3[local478 + 1] = local1681;
													local264 = false;
												}
											}
											if (local264) {
												break;
											}
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static114.aClass81_63) {
										local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
										local764 = Static480.aClass1_Sub20_Sub1_1.method4388();
										@Pc(5678) Object[] local5678 = new Object[local764.length() + 1];
										for (local641 = local764.length() - 1; local641 >= 0; local641--) {
											if (local764.charAt(local641) == 's') {
												local5678[local641 + 1] = Static480.aClass1_Sub20_Sub1_1.method4388();
											} else {
												local5678[local641 + 1] = Integer.valueOf(Static480.aClass1_Sub20_Sub1_1.method4371());
											}
										}
										local5678[0] = Integer.valueOf(Static480.aClass1_Sub20_Sub1_1.method4371());
										if (Static412.method5785(local233)) {
											@Pc(5734) Class1_Sub2 local5734 = new Class1_Sub2();
											local5734.anObjectArray1 = local5678;
											Static145.method2353(local5734);
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static265.aClass81_118) {
										local264 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
										local764 = Static480.aClass1_Sub20_Sub1_1.method4388();
										local300 = local764;
										if (local264) {
											local300 = Static480.aClass1_Sub20_Sub1_1.method4388();
										}
										local641 = Static480.aClass1_Sub20_Sub1_1.method4393();
										local645 = Static480.aClass1_Sub20_Sub1_1.method4426();
										local969 = false;
										if (local641 <= 1 && Static560.method7545(local300)) {
											local969 = true;
										}
										if (!local969 && Static53.anInt1363 == 0) {
											local982 = Static296.aClass362_2.method7873(local645).method818(Static480.aClass1_Sub20_Sub1_1);
											if (local641 == 2) {
												Static337.method5034("<img=1>" + local764, null, 25, local764, local982, 0, "<img=1>" + local300, local645);
											} else if (local641 == 1) {
												Static337.method5034("<img=0>" + local764, null, 25, local764, local982, 0, "<img=0>" + local300, local645);
											} else {
												Static337.method5034(local764, null, 25, local764, local982, 0, local300, local645);
											}
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static325.aClass81_227 == Static315.aClass81_130) {
										Static433.method6296(Static465.aClass181_12);
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static116.aClass81_65) {
										Static54.anInt1399 = Static480.aClass1_Sub20_Sub1_1.method4393();
										for (local233 = 0; local233 < Static54.anInt1399; local233++) {
											Static568.aStringArray40[local233] = Static480.aClass1_Sub20_Sub1_1.method4388();
											Static316.aStringArray25[local233] = Static480.aClass1_Sub20_Sub1_1.method4388();
											if (Static316.aStringArray25[local233].equals("")) {
												Static316.aStringArray25[local233] = Static568.aStringArray40[local233];
											}
											Static279.aStringArray22[local233] = Static480.aClass1_Sub20_Sub1_1.method4388();
											Static68.aStringArray6[local233] = Static480.aClass1_Sub20_Sub1_1.method4388();
											if (Static68.aStringArray6[local233].equals("")) {
												Static68.aStringArray6[local233] = Static279.aStringArray22[local233];
											}
											Static363.aBooleanArray24[local233] = false;
										}
										Static315.aClass81_130 = null;
										Static18.anInt603 = Static274.anInt5077;
										return true;
									} else if (Static74.aClass81_46 == Static315.aClass81_130) {
										Static433.method6296(Static146.aClass181_5);
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static230.aClass81_142) {
										local233 = Static480.aClass1_Sub20_Sub1_1.method4389();
										local78 = Static480.aClass1_Sub20_Sub1_1.method4430();
										local478 = Static480.aClass1_Sub20_Sub1_1.method4394();
										local641 = Static480.aClass1_Sub20_Sub1_1.method4430();
										if (Static412.method5785(local478)) {
											Static198.method3418(local641, local233, local78);
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static110.aClass81_59 == Static315.aClass81_130) {
										Static433.method6296(Static134.aClass181_16);
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static431.aClass81_178) {
										local233 = Static480.aClass1_Sub20_Sub1_1.method4393();
										if (Static480.aClass1_Sub20_Sub1_1.method4393() == 0) {
											Static101.aClass51Array1[local233] = new Class51();
										} else {
											Static480.aClass1_Sub20_Sub1_1.anInt5238--;
											Static101.aClass51Array1[local233] = new Class51(Static480.aClass1_Sub20_Sub1_1);
										}
										Static315.aClass81_130 = null;
										Static372.anInt6585 = Static274.anInt5077;
										return true;
									} else if (Static205.aClass81_105 == Static315.aClass81_130) {
										Static209.anInt4135 = Static274.anInt5077;
										if (Static494.anInt8294 == 0) {
											Static382.aString69 = null;
											Static315.aClass81_130 = null;
											Static254.aClass69Array1 = null;
											Static112.aString25 = null;
											Static280.anInt5146 = 0;
											return true;
										}
										Static112.aString25 = Static480.aClass1_Sub20_Sub1_1.method4388();
										local264 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
										if (local264) {
											Static480.aClass1_Sub20_Sub1_1.method4388();
										}
										@Pc(6095) long local6095 = Static480.aClass1_Sub20_Sub1_1.method4416();
										Static382.aString69 = Static541.method7808(local6095);
										Static143.aByte40 = Static480.aClass1_Sub20_Sub1_1.method4432();
										local641 = Static480.aClass1_Sub20_Sub1_1.method4393();
										if (local641 == 255) {
											Static315.aClass81_130 = null;
											return true;
										}
										Static280.anInt5146 = local641;
										@Pc(6121) Class69[] local6121 = new Class69[100];
										for (local649 = 0; local649 < Static280.anInt5146; local649++) {
											local6121[local649] = new Class69();
											local6121[local649].aString20 = Static480.aClass1_Sub20_Sub1_1.method4388();
											local264 = Static480.aClass1_Sub20_Sub1_1.method4393() == 1;
											if (local264) {
												local6121[local649].aString21 = Static480.aClass1_Sub20_Sub1_1.method4388();
											} else {
												local6121[local649].aString21 = local6121[local649].aString20;
											}
											local6121[local649].aString22 = Static344.method5101(local6121[local649].aString21);
											local6121[local649].anInt2011 = Static480.aClass1_Sub20_Sub1_1.method4426();
											local6121[local649].aByte32 = Static480.aClass1_Sub20_Sub1_1.method4432();
											local6121[local649].aString23 = Static480.aClass1_Sub20_Sub1_1.method4388();
											if (local6121[local649].aString21.equals(Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2.aString49)) {
												Static151.aByte41 = local6121[local649].aByte32;
											}
										}
										local1011 = Static280.anInt5146;
										while (local1011 > 0) {
											local5304 = true;
											local1011--;
											for (local790 = 0; local790 < local1011; local790++) {
												if (local6121[local790].aString22.compareTo(local6121[local790 + 1].aString22) > 0) {
													local986 = local6121[local790];
													local6121[local790] = local6121[local790 + 1];
													local6121[local790 + 1] = local986;
													local5304 = false;
												}
											}
											if (local5304) {
												break;
											}
										}
										Static254.aClass69Array1 = local6121;
										Static315.aClass81_130 = null;
										return true;
									} else if (Static172.aClass81_83 == Static315.aClass81_130) {
										local233 = Static480.aClass1_Sub20_Sub1_1.method4398();
										local764 = Static480.aClass1_Sub20_Sub1_1.method4388();
										local478 = Static480.aClass1_Sub20_Sub1_1.method4417();
										if (Static412.method5785(local478)) {
											Static445.method3382(local764, local233);
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static387.aClass81_157) {
										Static215.anInt4175 = Static480.aClass1_Sub20_Sub1_1.method4387() << 3;
										Static212.anInt4155 = Static480.aClass1_Sub20_Sub1_1.method4393();
										Static252.anInt9487 = Static480.aClass1_Sub20_Sub1_1.method4387() << 3;
										while (Static480.aClass1_Sub20_Sub1_1.anInt5238 < Static494.anInt8294) {
											@Pc(6340) Class181 local6340 = Static415.method5821()[Static480.aClass1_Sub20_Sub1_1.method4393()];
											Static433.method6296(local6340);
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static297.aClass81_197) {
										Static559.method7539();
										Static315.aClass81_130 = null;
										return false;
									} else if (Static475.aClass81_190 == Static315.aClass81_130) {
										Static340.method5070(Static578.aBoolean688);
										Static315.aClass81_130 = null;
										return false;
									} else if (Static315.aClass81_130 == Static327.aClass81_137) {
										local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
										local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
										local478 = Static480.aClass1_Sub20_Sub1_1.method4393();
										local641 = Static480.aClass1_Sub20_Sub1_1.method4393();
										local645 = Static480.aClass1_Sub20_Sub1_1.method4393();
										local649 = Static480.aClass1_Sub20_Sub1_1.method4426();
										if (Static412.method5785(local233)) {
											Static326.aBooleanArray16[local78] = true;
											Static242.anIntArray280[local78] = local478;
											Static43.anIntArray44[local78] = local641;
											Static478.anIntArray534[local78] = local645;
											Static435.anIntArray505[local78] = local649;
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static317.aClass81_132 == Static315.aClass81_130) {
										Static121.aClass148_1.method3535();
										Static34.anInt924 += 32;
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static557.aClass81_219) {
										Static433.method6296(Static387.aClass181_10);
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static12.aClass81_6) {
										Static438.method6325(true);
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static502.aClass81_200) {
										local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
										local78 = Static480.aClass1_Sub20_Sub1_1.method4393();
										local478 = Static480.aClass1_Sub20_Sub1_1.method4393();
										local641 = Static480.aClass1_Sub20_Sub1_1.method4426() << 2;
										local645 = Static480.aClass1_Sub20_Sub1_1.method4393();
										local649 = Static480.aClass1_Sub20_Sub1_1.method4393();
										if (Static412.method5785(local233)) {
											Static111.method1971(local645, local641, local78, local649, true, local478);
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static236.aClass81_111 == Static315.aClass81_130) {
										Static454.anInt7768 = 1;
										Static315.aClass81_130 = null;
										Static18.anInt603 = Static274.anInt5077;
										return true;
									} else if (Static403.aClass81_162 == Static315.aClass81_130) {
										local233 = Static480.aClass1_Sub20_Sub1_1.method4391();
										local78 = Static480.aClass1_Sub20_Sub1_1.method4424();
										local478 = Static480.aClass1_Sub20_Sub1_1.method4435();
										if (Static412.method5785(local78)) {
											Static41.method997(local233, local478);
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static50.aClass81_29 == Static315.aClass81_130) {
										if (Static463.method6576(Static177.anInt2101)) {
											Static562.anInt9131 = (int) ((float) Static480.aClass1_Sub20_Sub1_1.method4426() * 2.5F);
										} else {
											Static562.anInt9131 = Static480.aClass1_Sub20_Sub1_1.method4426() * 30;
										}
										Static315.aClass81_130 = null;
										Static384.anInt7194 = Static274.anInt5077;
										return true;
									} else if (Static303.aClass81_231 == Static315.aClass81_130) {
										Static346.method5123();
										Static315.aClass81_130 = null;
										return false;
									} else if (Static390.aClass81_158 == Static315.aClass81_130) {
										local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
										local78 = Static480.aClass1_Sub20_Sub1_1.method4371();
										local478 = Static480.aClass1_Sub20_Sub1_1.method4424();
										if (Static412.method5785(local478)) {
											Static274.method4274(local233, local78);
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static332.aClass81_139 == Static315.aClass81_130) {
										Static212.anInt4155 = Static480.aClass1_Sub20_Sub1_1.method4382();
										Static252.anInt9487 = Static480.aClass1_Sub20_Sub1_1.method4374() << 3;
										Static215.anInt4175 = Static480.aClass1_Sub20_Sub1_1.method4432() << 3;
										Static315.aClass81_130 = null;
										return true;
									} else if (Static315.aClass81_130 == Static567.aClass81_222) {
										Static415.aString77 = Static494.anInt8294 > 2 ? Static480.aClass1_Sub20_Sub1_1.method4388() : Static103.aClass77_28.method1864(Static562.anInt9127);
										Static17.anInt562 = Static494.anInt8294 > 0 ? Static480.aClass1_Sub20_Sub1_1.method4426() : -1;
										if (Static17.anInt562 == 65535) {
											Static17.anInt562 = -1;
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static474.aClass81_21 == Static315.aClass81_130) {
										local233 = Static480.aClass1_Sub20_Sub1_1.method4426();
										if (local233 == 65535) {
											local233 = -1;
										}
										local78 = Static480.aClass1_Sub20_Sub1_1.method4371();
										local478 = Static480.aClass1_Sub20_Sub1_1.method4394();
										local641 = Static480.aClass1_Sub20_Sub1_1.method4371();
										if (Static412.method5785(local478)) {
											Static344.method5098(local78, local641, local233);
											@Pc(6707) Class322 local6707 = Static46.aClass234_1.method5390(local233);
											Static559.method7540(local641, local6707.anInt8619, local6707.anInt8582, local6707.anInt8587);
											Static546.method7410(local6707.anInt8644, local6707.anInt8628, local6707.anInt8594, local641);
										}
										Static315.aClass81_130 = null;
										return true;
									} else if (Static416.aClass81_168 == Static315.aClass81_130) {
										if (Static255.aFrame3 != null) {
											Static68.method1443(Static479.aClass1_Sub7_Sub1_1.anInt3097, false, -1, -1);
										}
										@Pc(6744) byte[] local6744 = new byte[Static494.anInt8294];
										Static480.aClass1_Sub20_Sub1_1.method3930(Static494.anInt8294, local6744);
										local764 = Static440.method6212(local6744, Static494.anInt8294, 0);
										Static314.method4795(true, Static246.aClass114_10, local764, Static375.anInt6609 == 1);
										Static315.aClass81_130 = null;
										return true;
									} else if (Static229.aClass81_211 == Static315.aClass81_130) {
										Static433.method6296(Static44.aClass181_2);
										Static315.aClass81_130 = null;
										return true;
									} else {
										Static259.method4059("T1 - " + (Static315.aClass81_130 == null ? -1 : Static315.aClass81_130.method1970()) + "," + (Static478.aClass81_193 == null ? -1 : Static478.aClass81_193.method1970()) + "," + (Static587.aClass81_229 == null ? -1 : Static587.aClass81_229.method1970()) + " - " + Static494.anInt8294, null);
										Static340.method5070(false);
										return true;
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
