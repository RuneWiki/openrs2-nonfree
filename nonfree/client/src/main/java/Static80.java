import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!client", name = "hb", descriptor = "Ljava/lang/Class;")
	public static Class aClass9;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "[I")
	public static final int[] anIntArray76 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!qga;)Z")
	public static boolean method1359(@OriginalArg(0) Class299 arg0) {
		if (Static123.aBoolean140) {
			if (method1360(arg0).anInt453 != 0) {
				return false;
			}
			if (arg0.anInt8610 == 0) {
				return false;
			}
		}
		return arg0.aBoolean604;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!qga;)Lclient!baa;")
	public static Class14_Sub6 method1360(@OriginalArg(0) Class299 arg0) {
		@Pc(13) Class14_Sub6 local13 = (Class14_Sub6) Static574.aClass125_40.method2630(((long) arg0.anInt8526 << 32) + (long) arg0.anInt8590);
		return local13 == null ? arg0.aClass14_Sub6_4 : local13;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!qga;)Lclient!qga;")
	public static Class299 method1363(@OriginalArg(0) Class299 arg0) {
		@Pc(4) int local4 = method1360(arg0).method475();
		if (local4 == 0) {
			return null;
		}
		for (@Pc(11) int local11 = 0; local11 < local4; local11++) {
			arg0 = Static391.method5936(arg0.anInt8527);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
	public static void method1364(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static258.anInt4846;
		@Pc(3) int[] local3 = Static43.anIntArray35;
		@Pc(12) int local12 = Static548.aBoolean640 ? local1 : local1 + Static662.anInt10795;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(24) Class4_Sub3_Sub3_Sub3 local24;
			if (local14 < local1) {
				local24 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local3[local14]];
			} else {
				local24 = ((Class14_Sub44) Static100.aClass125_9.method2630((long) Static253.anIntArray241[local14 - local1])).aClass4_Sub3_Sub3_Sub3_Sub1_2;
			}
			if (local24.aByte146 == arg0) {
				local24.anInt3270 = 0;
				if (local24.anInt3268 < 0) {
					local24.aBoolean238 = false;
				} else {
					@Pc(58) int local58 = local24.method2870(0);
					if ((local58 & 0x1) == 0) {
						if ((local24.anInt11184 & 0x1FF) != 0 || (local24.anInt11178 & 0x1FF) != 0) {
							local24.aBoolean238 = false;
							continue;
						}
					} else if ((local24.anInt11184 & 0x1FF) != 256 || (local24.anInt11178 & 0x1FF) != 256) {
						local24.aBoolean238 = false;
						continue;
					}
					@Pc(108) int local108;
					@Pc(113) int local113;
					@Pc(139) int local139;
					if (local58 == 1) {
						local108 = local24.anInt11184 >> 9;
						local113 = local24.anInt11178 >> 9;
						if (local24.anInt3268 != Static47.anIntArrayArray8[local108][local113]) {
							local24.aBoolean238 = true;
							continue;
						}
						if (Static544.anIntArrayArray57[local108][local113] > 1) {
							local139 = Static544.anIntArrayArray57[local108][local113]--;
							local24.aBoolean238 = true;
							continue;
						}
					} else {
						local108 = (local58 - 1) * 256 + 252;
						local113 = local24.anInt11184 - local108 >> 9;
						@Pc(169) int local169 = local24.anInt11178 - local108 >> 9;
						@Pc(176) int local176 = local24.anInt11184 + local108 >> 9;
						@Pc(183) int local183 = local24.anInt11178 + local108 >> 9;
						if (!Static283.method4755(local113, local169, local176, local183, local24.anInt3268)) {
							for (@Pc(194) int local194 = local113; local194 <= local176; local194++) {
								for (@Pc(197) int local197 = local169; local197 <= local183; local197++) {
									if (local24.anInt3268 == Static47.anIntArrayArray8[local194][local197]) {
										local139 = Static544.anIntArrayArray57[local194][local197]--;
									}
								}
							}
							local24.aBoolean238 = true;
							continue;
						}
					}
					local24.aBoolean238 = false;
					local24.anInt11182 = Static388.method5919(local24.anInt11178, local24.anInt11184, local24.aByte146);
					Static209.method9481(local24, true);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "()V")
	public static void method1366() {
		@Pc(1) int local1 = Static258.anInt4846;
		@Pc(3) int[] local3 = Static43.anIntArray35;
		@Pc(12) int local12 = Static548.aBoolean640 ? local1 : local1 + Static662.anInt10795;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			@Pc(24) Class4_Sub3_Sub3_Sub3 local24;
			if (local14 < local1) {
				local24 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local3[local14]];
			} else {
				local24 = ((Class14_Sub44) Static100.aClass125_9.method2630((long) Static253.anIntArray241[local14 - local1])).aClass4_Sub3_Sub3_Sub3_Sub1_2;
			}
			if (local24.anInt3268 >= 0) {
				@Pc(44) int local44 = local24.method2870(0);
				if ((local44 & 0x1) == 0) {
					if ((local24.anInt11184 & 0x1FF) == 0 && (local24.anInt11178 & 0x1FF) == 0) {
						continue;
					}
				} else if ((local24.anInt11184 & 0x1FF) == 256 && (local24.anInt11178 & 0x1FF) == 256) {
					continue;
				}
				local24.anInt11182 = Static388.method5919(local24.anInt11178, local24.anInt11184, local24.aByte146);
				Static209.method9481(local24, true);
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
	public static void method1367() {
		for (@Pc(1) int local1 = 0; local1 < Static380.anInt6689; local1++) {
			@Pc(6) int[] local6 = Static47.anIntArrayArray8[local1];
			for (@Pc(8) int local8 = 0; local8 < Static542.anInt9214; local8++) {
				local6[local8] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "d", descriptor = "()V")
	public static void method1368() {
		@Pc(1) int local1 = Static258.anInt4846;
		@Pc(3) int[] local3 = Static43.anIntArray35;
		@Pc(8) int local8 = Static181.aClass14_Sub26_9.aClass43_Sub2_1.method996();
		@Pc(30) boolean local30 = local8 == 1 && local1 > 200 || local8 == 0 && local1 > 50;
		@Pc(103) int local103;
		for (@Pc(32) int local32 = 0; local32 < local1; local32++) {
			@Pc(39) Class4_Sub3_Sub3_Sub3_Sub2 local39 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local3[local32]];
			if (!local39.method2889()) {
				local39.anInt3268 = -1;
			} else if (local39.aBoolean245) {
				local39.anInt3268 = -1;
			} else {
				local39.method8782();
				if (local39.aShort108 >= 0 && local39.aShort109 >= 0 && local39.aShort107 < Static380.anInt6689 && local39.aShort110 < Static542.anInt9214) {
					local39.aBoolean243 = local39.aBoolean236 ? local30 : false;
					if (local39 == Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1) {
						local39.anInt3268 = Integer.MAX_VALUE;
					} else {
						local103 = 0;
						if (!local39.aBoolean238) {
							local103++;
						}
						if (local39.anInt3283 > Static530.anInt9105) {
							local103 += 2;
						}
						local103 += 5 - local39.method2870(0) << 2;
						if (local39.aBoolean242 || local39.aBoolean246) {
							local103 += 512;
						} else {
							if (Static56.anInt962 == 0) {
								local103 += 32;
							} else {
								local103 += 128;
							}
							local103 += 256;
						}
						local39.anInt3268 = local103 + 1;
					}
				} else {
					local39.anInt3268 = -1;
				}
			}
		}
		for (@Pc(155) int local155 = 0; local155 < Static662.anInt10795; local155++) {
			@Pc(166) Class4_Sub3_Sub3_Sub3_Sub1 local166 = ((Class14_Sub44) Static100.aClass125_9.method2630((long) Static253.anIntArray241[local155])).aClass4_Sub3_Sub3_Sub3_Sub1_2;
			if (local166.method2569() && local166.aClass362_1.method8637(Static188.aClass238_1)) {
				local166.method8782();
				if (local166.aShort108 >= 0 && local166.aShort109 >= 0 && local166.aShort107 < Static380.anInt6689 && local166.aShort110 < Static542.anInt9214) {
					@Pc(213) int local213 = 0;
					if (!local166.aBoolean238) {
						local213++;
					}
					if (local166.anInt3283 > Static530.anInt9105) {
						local213 += 2;
					}
					local213 += 5 - local166.method2870(0) << 2;
					if (Static56.anInt962 == 0) {
						if (local166.aClass362_1.aBoolean701) {
							local213 += 64;
						} else {
							local213 += 128;
						}
					} else if (Static56.anInt962 == 1) {
						if (local166.aClass362_1.aBoolean701) {
							local213 += 32;
						} else {
							local213 += 64;
						}
					}
					if (local166.aClass362_1.aBoolean699) {
						local213 += 1024;
					} else if (!local166.aClass362_1.aBoolean694) {
						local213 += 256;
					}
					local166.anInt3268 = local213 + 1;
				} else {
					local166.anInt3268 = -1;
				}
			} else {
				local166.anInt3268 = -1;
			}
		}
		for (local103 = 0; local103 < Static8.aClass136Array1.length; local103++) {
			@Pc(292) Class136 local292 = Static8.aClass136Array1[local103];
			if (local292 != null) {
				if (local292.anInt3427 == 1) {
					@Pc(308) Class14_Sub44 local308 = (Class14_Sub44) Static100.aClass125_9.method2630((long) local292.anInt3419);
					if (local308 != null) {
						@Pc(313) Class4_Sub3_Sub3_Sub3_Sub1 local313 = local308.aClass4_Sub3_Sub3_Sub3_Sub1_2;
						if (local313.anInt3268 >= 0) {
							local313.anInt3268 += 2048;
						}
					}
				} else if (local292.anInt3427 == 10) {
					@Pc(333) Class4_Sub3_Sub3_Sub3_Sub2 local333 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local292.anInt3419];
					if (local333 != null && local333 != Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1 && local333.anInt3268 >= 0) {
						local333.anInt3268 += 2048;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "()V")
	public static void method1369() {
		Static107.anInt1847 = 0;
		for (@Pc(3) int local3 = 0; local3 < Static662.anInt10795; local3++) {
			@Pc(14) Class4_Sub3_Sub3_Sub3_Sub1 local14 = ((Class14_Sub44) Static100.aClass125_9.method2630((long) Static253.anIntArray241[local3])).aClass4_Sub3_Sub3_Sub3_Sub1_2;
			if (local14.aBoolean238 && local14.method2869() != -1) {
				@Pc(34) int local34 = (local14.method2870(0) - 1) * 256 + 252;
				@Pc(41) int local41 = local14.anInt11184 - local34 >> 9;
				@Pc(48) int local48 = local14.anInt11178 - local34 >> 9;
				@Pc(55) Class4_Sub3_Sub3_Sub3 local55 = Static140.method2130(local41, local48, local14.aByte146);
				if (local55 != null) {
					@Pc(60) int local60 = local55.anInt3238;
					if (local55 instanceof Class4_Sub3_Sub3_Sub3_Sub1) {
						local60 += 2048;
					}
					if (local55.anInt3270 == 0 && local55.method2869() != -1) {
						Static250.anIntArray239[Static107.anInt1847] = local60;
						Static401.anIntArray356[Static107.anInt1847] = local60;
						Static107.anInt1847++;
						local55.anInt3270++;
					}
					Static250.anIntArray239[Static107.anInt1847] = local60;
					Static401.anIntArray356[Static107.anInt1847] = local14.anInt3238 + 2048;
					Static107.anInt1847++;
					local55.anInt3270++;
				}
			}
		}
		Static130.method2011(Static401.anIntArray356, 0, Static107.anInt1847 - 1, Static250.anIntArray239);
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!qga;IIIIIIIIIII)V")
	public static void method1370(@OriginalArg(0) Class299[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11) {
		label906: for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class299 local6 = arg0[local1];
			if (local6 != null && local6.anInt8527 == arg1) {
				@Pc(19) int local19 = local6.anInt8534 + arg6;
				@Pc(24) int local24 = local6.anInt8603 + arg7;
				@Pc(30) int local30;
				@Pc(32) int local32;
				@Pc(34) int local34;
				@Pc(36) int local36;
				@Pc(42) int local42;
				@Pc(47) int local47;
				if (local6.anInt8610 == 2) {
					local30 = arg2;
					local32 = arg3;
					local34 = arg4;
					local36 = arg5;
				} else {
					local42 = local19 + local6.anInt8573;
					local47 = local24 + local6.anInt8547;
					if (local6.anInt8610 == 9) {
						local42++;
						local47++;
					}
					local30 = local19 > arg2 ? local19 : arg2;
					local32 = local24 > arg3 ? local24 : arg3;
					local34 = local42 < arg4 ? local42 : arg4;
					local36 = local47 < arg5 ? local47 : arg5;
				}
				if (local6.anInt8610 == 0 || local6.aBoolean617 || method1360(local6).anInt453 != 0 || local6 == Static530.aClass299_9 || local6.anInt8542 == Static59.anInt989 || local6.anInt8542 == Static252.anInt4766 || local6.anInt8542 == Static353.anInt10726 || local6.anInt8542 == Static288.anInt5258) {
					if (!method1359(local6)) {
						local42 = 0;
						local47 = 0;
						if (Static656.aBoolean741) {
							local42 = Static532.method7876();
							local47 = Static276.method4674();
						}
						if (local6 == Static649.aClass299_12 && Static117.method1833(Static649.aClass299_12) != null) {
							Static690.aBoolean785 = true;
							Static681.anInt11091 = local19;
							Static575.anInt9532 = local24;
						}
						if (local6.aBoolean606 || local30 < local34 && local32 < local36) {
							if (local6.aBoolean614 && arg10 >= local30 && arg11 >= local32 && arg10 < local34 && arg11 < local36) {
								for (@Pc(220) Class14_Sub10 local220 = (Class14_Sub10) Static97.aClass32_6.method584(); local220 != null; local220 = (Class14_Sub10) Static97.aClass32_6.method577()) {
									if (local220.aBoolean71) {
										local220.method9513();
										local220.aClass299_2.aBoolean613 = false;
									}
								}
								if (Static207.anInt3640 == 0) {
									Static649.aClass299_12 = null;
									Static530.aClass299_9 = null;
								}
								Static563.anInt4937 = 0;
								Static12.aBoolean14 = false;
								Static381.aBoolean482 = false;
								if (!Static455.aBoolean533) {
									Static374.method5795();
								}
							}
							@Pc(303) boolean local303 = local6.anInt8610 == 5 && local6.anInt8568 == 0 && local6.anInt8622 < 0 && local6.anInt8621 == -1 && local6.anInt8582 == -1 && !local6.aBoolean615 && local6.anInt8541 == 0;
							@Pc(305) boolean local305 = false;
							@Pc(397) int local397;
							if (Static656.aClass118_1.method7586() + local42 >= local30 && Static656.aClass118_1.method7590() + local47 >= local32 && Static656.aClass118_1.method7586() + local42 < local34 && Static656.aClass118_1.method7590() + local47 < local36) {
								if (local303) {
									@Pc(348) Class31 local348 = local6.method7439(Static103.aClass144_3);
									if (local348 != null && local348.anInt541 == local6.anInt8573 && local348.anInt542 == local6.anInt8547) {
										@Pc(375) int local375 = Static656.aClass118_1.method7586() + local42 - local19;
										@Pc(383) int local383 = Static656.aClass118_1.method7590() + local47 - local24;
										if (local383 >= 0 && local383 < local348.anIntArray28.length) {
											local397 = local348.anIntArray28[local383];
											if (local375 >= local397 && local375 <= local397 + local348.anIntArray29[local383]) {
												local305 = true;
											}
										}
									} else {
										local305 = true;
									}
								} else {
									local305 = true;
								}
							}
							if (!Static546.aBoolean727 && local305) {
								if (local6.anInt8553 >= 0) {
									Static573.anInt9481 = local6.anInt8553;
								} else if (local6.aBoolean614) {
									Static573.anInt9481 = -1;
								}
							}
							if (!Static455.aBoolean533 && local305) {
								Static435.method6487(arg10 - local19, arg10 - local24, local6);
							}
							@Pc(457) boolean local457 = false;
							if (Static656.aClass118_1.method7587() && local305) {
								local457 = true;
							}
							@Pc(469) boolean local469 = false;
							@Pc(474) Class14_Sub29 local474 = (Class14_Sub29) Static477.aClass32_54.method584();
							@Pc(544) int local544;
							@Pc(550) int local550;
							@Pc(564) int local564;
							@Pc(519) Class31 local519;
							if (local474 != null && local474.method7856() == 0 && local474.method7858() >= local30 && local474.method7859() >= local32 && local474.method7858() < local34 && local474.method7859() < local36) {
								if (local303) {
									local519 = local6.method7439(Static103.aClass144_3);
									if (local519 != null && local519.anInt541 == local6.anInt8573 && local519.anInt542 == local6.anInt8547) {
										local544 = local474.method7858() - local19;
										local550 = local474.method7859() - local24;
										if (local550 >= 0 && local550 < local519.anIntArray28.length) {
											local564 = local519.anIntArray28[local550];
											if (local544 >= local564 && local544 <= local564 + local519.anIntArray29[local550]) {
												local469 = true;
											}
										}
									} else {
										local469 = true;
									}
								} else {
									local469 = true;
								}
							}
							if (local6.aByteArray91 != null && !Static562.method8085()) {
								for (local397 = 0; local397 < local6.aByteArray91.length; local397++) {
									if (Static89.aClass207_3.method5068(local6.aByteArray91[local397])) {
										if (local6.anIntArray440 == null || Static530.anInt9105 >= local6.anIntArray440[local397]) {
											@Pc(629) byte local629 = local6.aByteArray90[local397];
											if (local629 == 0 || ((local629 & 0x8) == 0 || !Static89.aClass207_3.method5068(86) && !Static89.aClass207_3.method5068(82) && !Static89.aClass207_3.method5068(81)) && ((local629 & 0x2) == 0 || Static89.aClass207_3.method5068(86)) && ((local629 & 0x1) == 0 || Static89.aClass207_3.method5068(82)) && ((local629 & 0x4) == 0 || Static89.aClass207_3.method5068(81))) {
												if (local397 < 10) {
													Static77.method1251("", local397 + 1, -1, local6.anInt8526);
												} else if (local397 == 10) {
													Static214.method3269();
													@Pc(721) Class14_Sub6 local721 = method1360(local6);
													Static135.method2054(local6, local721.anInt455, local721.method482());
													Static529.aString102 = Static380.method5856(local6);
													if (Static529.aString102 == null) {
														Static529.aString102 = "Null";
													}
													Static621.aString117 = local6.aString95 + "<col=ffffff>";
												}
												local550 = local6.anIntArray443[local397];
												if (local6.anIntArray440 == null) {
													local6.anIntArray440 = new int[local6.aByteArray91.length];
												}
												if (local550 == 0) {
													local6.anIntArray440[local397] = Integer.MAX_VALUE;
												} else {
													local6.anIntArray440[local397] = Static530.anInt9105 + local550;
												}
											}
										}
									} else if (local6.anIntArray440 != null) {
										local6.anIntArray440[local397] = 0;
									}
								}
							}
							if (local469) {
								Static1.method6045(local6, local42 + local474.method7858() - local19, local47 + local474.method7859() - local24);
							}
							if (Static649.aClass299_12 != null && Static649.aClass299_12 != local6 && local305 && method1360(local6).method474()) {
								Static381.aClass299_6 = local6;
							}
							if (local6 == Static530.aClass299_9) {
								Static30.aBoolean33 = true;
								Static327.anInt5651 = local19;
								Static558.anInt9347 = local24;
							}
							if (local6.aBoolean617 || local6.anInt8542 != 0) {
								@Pc(872) Class14_Sub10 local872;
								if (local305 && Static438.anInt7390 != 0 && local6.anObjectArray26 != null) {
									local872 = new Class14_Sub10();
									local872.aBoolean71 = true;
									local872.aClass299_2 = local6;
									local872.anInt1058 = Static438.anInt7390;
									local872.anObjectArray1 = local6.anObjectArray26;
									Static97.aClass32_6.method582(local872);
								}
								if (Static649.aClass299_12 != null) {
									local469 = false;
									local457 = false;
								} else if (Static455.aBoolean533 || local6.anInt8542 != Static451.anInt7535 && Static563.anInt4937 > 0) {
									local469 = false;
									local457 = false;
									local305 = false;
								}
								if (local6.anInt8542 != 0) {
									if (local6.anInt8542 == Static353.anInt10726 || local6.anInt8542 == Static288.anInt5258) {
										Static76.aClass299_3 = local6;
										if (Static240.aClass366_1 != null) {
											Static240.aClass366_1.method8684(local6.anInt8547, Static103.aClass144_3, Static181.aClass14_Sub26_9.aClass43_Sub10_1.method3094());
										}
										if (local6.anInt8542 == Static353.anInt10726) {
											if (Static455.aBoolean533 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
												continue;
											}
											Static304.method4920(Static103.aClass144_3, arg9, arg8);
											@Pc(986) Class4_Sub7 local986 = (Class4_Sub7) Static423.aClass283_10.method6791();
											while (true) {
												if (local986 == null) {
													continue label906;
												}
												if (arg10 >= local986.anInt8871 && arg10 < local986.anInt8866 && arg11 >= local986.anInt8870 && arg11 < local986.anInt8869) {
													Static374.method5795();
													Static683.method9418(local986.aClass4_Sub3_Sub3_Sub3_1);
												}
												local986 = (Class4_Sub7) Static423.aClass283_10.method6792();
											}
										}
									}
									if (local6.anInt8542 == Static59.anInt989) {
										local519 = local6.method7439(Static103.aClass144_3);
										if (local519 == null || Static553.anInt9258 != 0 && Static553.anInt9258 != 3 || Static455.aBoolean533 || arg10 < local30 || arg11 < local32 || arg10 >= local34 || arg11 >= local36) {
											continue;
										}
										local544 = arg10 - local19;
										local550 = arg11 - local24;
										local564 = local519.anIntArray28[local550];
										if (local544 < local564 || local544 > local564 + local519.anIntArray29[local550]) {
											continue;
										}
										local544 -= local6.anInt8573 / 2;
										local550 -= local6.anInt8547 / 2;
										@Pc(1120) int local1120;
										if (Static304.anInt5410 == 4) {
											local1120 = (int) Static139.aFloat16 & 0x3FFF;
										} else {
											local1120 = (int) Static139.aFloat16 + Static405.anInt7023 & 0x3FFF;
										}
										@Pc(1132) int local1132 = Class141.anIntArray207[local1120];
										@Pc(1136) int local1136 = Class141.anIntArray208[local1120];
										if (Static304.anInt5410 != 4) {
											local1132 = local1132 * (Static195.anInt3404 + 256) >> 8;
											local1136 = local1136 * (Static195.anInt3404 + 256) >> 8;
										}
										@Pc(1165) int local1165 = local550 * local1132 + local544 * local1136 >> 14;
										@Pc(1175) int local1175 = local550 * local1136 - local544 * local1132 >> 14;
										@Pc(1186) int local1186;
										@Pc(1194) int local1194;
										if (Static304.anInt5410 == 4) {
											local1186 = (Static295.anInt5319 >> 9) + (local1165 >> 2);
											local1194 = (Static351.anInt11027 >> 9) - (local1175 >> 2);
										} else {
											@Pc(1203) int local1203 = (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.method2870(0) - 1) * 256;
											local1186 = (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11184 - local1203 >> 9) + (local1165 >> 2);
											local1194 = (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.anInt11178 - local1203 >> 9) - (local1175 >> 2);
										}
										if (Static546.aBoolean727 && (Static655.anInt10731 & 0x40) != 0) {
											@Pc(1238) Class299 local1238 = Static384.method5875(Static613.anInt10111, Static254.anInt4789);
											if (local1238 == null) {
												Static214.method3269();
											} else {
												Static258.method4326(" ->", Static529.aString102, false, Static217.anInt4240, 1L, local1186, true, true, 23, local6.anInt8621, local1194, (long) (local6.anInt8590 << 0 | local6.anInt8526));
											}
											continue;
										}
										if (Static161.aClass80_6 == Static480.aClass80_10) {
											Static258.method4326("", Static21.aClass21_26.method324(Static26.anInt352), false, -1, 1L, local1186, true, true, 44, -1, local1194, 0L);
										}
										Static258.method4326("", Static163.aString33, false, Static41.anInt656, 1L, local1186, true, true, 16, -1, local1194, 0L);
										continue;
									}
									if (local6.anInt8542 == Static451.anInt7535) {
										Static125.aClass299_4 = local6;
										if (local305) {
											Static12.aBoolean14 = true;
										}
										if (local469) {
											local397 = (int) ((double) (local42 + local474.method7858() - local19 - local6.anInt8573 / 2) * 2.0D / (double) Static224.aFloat10);
											local544 = (int) -((double) (local47 + local474.method7859() - local24 - local6.anInt8547 / 2) * 2.0D / (double) Static224.aFloat10);
											local550 = Static97.anInt1683 + local397 + Static224.anInt1291;
											local564 = Static381.anInt6704 + local544 + Static224.anInt1292;
											@Pc(1378) Class14_Sub2_Sub10 local1378 = Static494.method7449();
											if (local1378 == null) {
												continue;
											}
											@Pc(1383) int[] local1383 = new int[3];
											local1378.method4290(local564, local1383, local550);
											if (local1383 != null) {
												if (Static89.aClass207_3.method5068(82) && Static469.anInt11068 > 0) {
													Static489.method7382(local1383[2], local1383[0], local1383[1]);
													continue;
												}
												Static381.aBoolean482 = true;
												Static142.anInt2275 = local1383[0];
												Static65.anInt1018 = local1383[1];
												Static307.anInt5459 = local1383[2];
											}
											Static563.anInt4937 = 1;
											Static294.aBoolean396 = false;
											Static109.anInt1855 = Static656.aClass118_1.method7586();
											Static611.anInt10054 = Static656.aClass118_1.method7590();
											continue;
										}
										if (local457 && Static563.anInt4937 > 0) {
											if (Static563.anInt4937 == 1 && (Static109.anInt1855 != Static656.aClass118_1.method7586() || Static611.anInt10054 != Static656.aClass118_1.method7590())) {
												Static11.anInt173 = Static97.anInt1683;
												Static644.anInt10593 = Static381.anInt6704;
												Static563.anInt4937 = 2;
											}
											if (Static563.anInt4937 == 2) {
												Static294.aBoolean396 = true;
												Static326.method5100(Static11.anInt173 + (int) ((double) (Static109.anInt1855 - Static656.aClass118_1.method7586()) * 2.0D / (double) Static224.aFloat11));
												Static389.method5928(Static644.anInt10593 - (int) ((double) (Static611.anInt10054 - Static656.aClass118_1.method7590()) * 2.0D / (double) Static224.aFloat11));
											}
											continue;
										}
										if (Static563.anInt4937 > 0 && !Static294.aBoolean396) {
											if ((Static237.anInt4576 == 1 || Static407.method2877()) && Static638.anInt10454 > 2) {
												Static103.method1713(Static611.anInt10054, Static109.anInt1855);
											} else if (Static145.method2168()) {
												Static103.method1713(Static611.anInt10054, Static109.anInt1855);
											}
										}
										Static563.anInt4937 = 0;
										continue;
									}
									if (local6.anInt8542 == Static89.anInt10172) {
										if (local457) {
											Static543.method7958(local42 + Static656.aClass118_1.method7586() - local19, local47 + Static656.aClass118_1.method7590() - local24, local6.anInt8573, local6.anInt8547);
										}
										continue;
									}
									if (local6.anInt8542 == Static252.anInt4766) {
										Static507.method7601(local19, local24, local6);
										continue;
									}
								}
								if (!local6.aBoolean603 && local469) {
									local6.aBoolean603 = true;
									if (local6.anObjectArray34 != null) {
										local872 = new Class14_Sub10();
										local872.aBoolean71 = true;
										local872.aClass299_2 = local6;
										local872.anInt1053 = local42 + local474.method7858() - local19;
										local872.anInt1058 = local47 + local474.method7859() - local24;
										local872.anObjectArray1 = local6.anObjectArray34;
										Static97.aClass32_6.method582(local872);
									}
								}
								if (local6.aBoolean603 && local457 && local6.anObjectArray23 != null) {
									local872 = new Class14_Sub10();
									local872.aBoolean71 = true;
									local872.aClass299_2 = local6;
									local872.anInt1053 = local42 + Static656.aClass118_1.method7586() - local19;
									local872.anInt1058 = local47 + Static656.aClass118_1.method7590() - local24;
									local872.anObjectArray1 = local6.anObjectArray23;
									Static97.aClass32_6.method582(local872);
								}
								if (local6.aBoolean603 && !local457) {
									local6.aBoolean603 = false;
									if (local6.anObjectArray28 != null) {
										local872 = new Class14_Sub10();
										local872.aBoolean71 = true;
										local872.aClass299_2 = local6;
										local872.anInt1053 = local42 + Static656.aClass118_1.method7586() - local19;
										local872.anInt1058 = local47 + Static656.aClass118_1.method7590() - local24;
										local872.anObjectArray1 = local6.anObjectArray28;
										Static72.aClass32_1.method582(local872);
									}
								}
								if (local457 && local6.anObjectArray8 != null) {
									local872 = new Class14_Sub10();
									local872.aBoolean71 = true;
									local872.aClass299_2 = local6;
									local872.anInt1053 = local42 + Static656.aClass118_1.method7586() - local19;
									local872.anInt1058 = local47 + Static656.aClass118_1.method7590() - local24;
									local872.anObjectArray1 = local6.anObjectArray8;
									Static97.aClass32_6.method582(local872);
								}
								if (!local6.aBoolean613 && local305) {
									local6.aBoolean613 = true;
									if (local6.anObjectArray33 != null) {
										local872 = new Class14_Sub10();
										local872.aBoolean71 = true;
										local872.aClass299_2 = local6;
										local872.anInt1053 = local42 + Static656.aClass118_1.method7586() - local19;
										local872.anInt1058 = local47 + Static656.aClass118_1.method7590() - local24;
										local872.anObjectArray1 = local6.anObjectArray33;
										Static97.aClass32_6.method582(local872);
									}
								}
								if (local6.aBoolean613 && local305 && local6.anObjectArray9 != null) {
									local872 = new Class14_Sub10();
									local872.aBoolean71 = true;
									local872.aClass299_2 = local6;
									local872.anInt1053 = local42 + Static656.aClass118_1.method7586() - local19;
									local872.anInt1058 = local47 + Static656.aClass118_1.method7590() - local24;
									local872.anObjectArray1 = local6.anObjectArray9;
									Static97.aClass32_6.method582(local872);
								}
								if (local6.aBoolean613 && !local305) {
									local6.aBoolean613 = false;
									if (local6.anObjectArray21 != null) {
										local872 = new Class14_Sub10();
										local872.aBoolean71 = true;
										local872.aClass299_2 = local6;
										local872.anInt1053 = local42 + Static656.aClass118_1.method7586() - local19;
										local872.anInt1058 = local47 + Static656.aClass118_1.method7590() - local24;
										local872.anObjectArray1 = local6.anObjectArray21;
										Static72.aClass32_1.method582(local872);
									}
								}
								if (local6.anObjectArray31 != null) {
									local872 = new Class14_Sub10();
									local872.aClass299_2 = local6;
									local872.anObjectArray1 = local6.anObjectArray31;
									Static401.aClass32_41.method582(local872);
								}
								@Pc(2017) Class14_Sub10 local2017;
								if (local6.anObjectArray27 != null && Static663.anInt10807 > local6.anInt8544) {
									if (local6.anIntArray446 == null || Static663.anInt10807 - local6.anInt8544 > 32) {
										local872 = new Class14_Sub10();
										local872.aClass299_2 = local6;
										local872.anObjectArray1 = local6.anObjectArray27;
										Static97.aClass32_6.method582(local872);
									} else {
										label767: for (local397 = local6.anInt8544; local397 < Static663.anInt10807; local397++) {
											local544 = Static388.anIntArray351[local397 & 0x1F];
											for (local550 = 0; local550 < local6.anIntArray446.length; local550++) {
												if (local6.anIntArray446[local550] == local544) {
													local2017 = new Class14_Sub10();
													local2017.aClass299_2 = local6;
													local2017.anObjectArray1 = local6.anObjectArray27;
													Static97.aClass32_6.method582(local2017);
													break label767;
												}
											}
										}
									}
									local6.anInt8544 = Static663.anInt10807;
								}
								if (local6.anObjectArray10 != null && Static262.anInt4886 > local6.anInt8613) {
									if (local6.anIntArray439 == null || Static262.anInt4886 - local6.anInt8613 > 32) {
										local872 = new Class14_Sub10();
										local872.aClass299_2 = local6;
										local872.anObjectArray1 = local6.anObjectArray10;
										Static97.aClass32_6.method582(local872);
									} else {
										label743: for (local397 = local6.anInt8613; local397 < Static262.anInt4886; local397++) {
											local544 = Static370.anIntArray342[local397 & 0x1F];
											for (local550 = 0; local550 < local6.anIntArray439.length; local550++) {
												if (local6.anIntArray439[local550] == local544) {
													local2017 = new Class14_Sub10();
													local2017.aClass299_2 = local6;
													local2017.anObjectArray1 = local6.anObjectArray10;
													Static97.aClass32_6.method582(local2017);
													break label743;
												}
											}
										}
									}
									local6.anInt8613 = Static262.anInt4886;
								}
								if (local6.anObjectArray30 != null && Static301.anInt5894 > local6.anInt8578) {
									if (local6.anIntArray445 == null || Static301.anInt5894 - local6.anInt8578 > 32) {
										local872 = new Class14_Sub10();
										local872.aClass299_2 = local6;
										local872.anObjectArray1 = local6.anObjectArray30;
										Static97.aClass32_6.method582(local872);
									} else {
										label719: for (local397 = local6.anInt8578; local397 < Static301.anInt5894; local397++) {
											local544 = Static420.anIntArray368[local397 & 0x1F];
											for (local550 = 0; local550 < local6.anIntArray445.length; local550++) {
												if (local6.anIntArray445[local550] == local544) {
													local2017 = new Class14_Sub10();
													local2017.aClass299_2 = local6;
													local2017.anObjectArray1 = local6.anObjectArray30;
													Static97.aClass32_6.method582(local2017);
													break label719;
												}
											}
										}
									}
									local6.anInt8578 = Static301.anInt5894;
								}
								if (local6.anObjectArray32 != null && Static446.anInt7495 > local6.anInt8535) {
									if (local6.anIntArray442 == null || Static446.anInt7495 - local6.anInt8535 > 32) {
										local872 = new Class14_Sub10();
										local872.aClass299_2 = local6;
										local872.anObjectArray1 = local6.anObjectArray32;
										Static97.aClass32_6.method582(local872);
									} else {
										label695: for (local397 = local6.anInt8535; local397 < Static446.anInt7495; local397++) {
											local544 = Static663.anIntArray579[local397 & 0x1F];
											for (local550 = 0; local550 < local6.anIntArray442.length; local550++) {
												if (local6.anIntArray442[local550] == local544) {
													local2017 = new Class14_Sub10();
													local2017.aClass299_2 = local6;
													local2017.anObjectArray1 = local6.anObjectArray32;
													Static97.aClass32_6.method582(local2017);
													break label695;
												}
											}
										}
									}
									local6.anInt8535 = Static446.anInt7495;
								}
								if (local6.anObjectArray6 != null && Static445.anInt7493 > local6.anInt8604) {
									if (local6.anIntArray444 == null || Static445.anInt7493 - local6.anInt8604 > 32) {
										local872 = new Class14_Sub10();
										local872.aClass299_2 = local6;
										local872.anObjectArray1 = local6.anObjectArray6;
										Static97.aClass32_6.method582(local872);
									} else {
										label671: for (local397 = local6.anInt8604; local397 < Static445.anInt7493; local397++) {
											local544 = Static529.anIntArray469[local397 & 0x1F];
											for (local550 = 0; local550 < local6.anIntArray444.length; local550++) {
												if (local6.anIntArray444[local550] == local544) {
													local2017 = new Class14_Sub10();
													local2017.aClass299_2 = local6;
													local2017.anObjectArray1 = local6.anObjectArray6;
													Static97.aClass32_6.method582(local2017);
													break label671;
												}
											}
										}
									}
									local6.anInt8604 = Static445.anInt7493;
								}
								if (local6.anObjectArray7 != null && Static538.anInt9199 > local6.anInt8558) {
									if (local6.anIntArray441 == null || Static538.anInt9199 - local6.anInt8558 > 32) {
										local872 = new Class14_Sub10();
										local872.aClass299_2 = local6;
										local872.anObjectArray1 = local6.anObjectArray7;
										Static97.aClass32_6.method582(local872);
									} else {
										label647: for (local397 = local6.anInt8558; local397 < Static538.anInt9199; local397++) {
											local544 = Static229.anIntArray226[local397 & 0x1F];
											for (local550 = 0; local550 < local6.anIntArray441.length; local550++) {
												if (local6.anIntArray441[local550] == local544) {
													local2017 = new Class14_Sub10();
													local2017.aClass299_2 = local6;
													local2017.anObjectArray1 = local6.anObjectArray7;
													Static97.aClass32_6.method582(local2017);
													break label647;
												}
											}
										}
									}
									local6.anInt8558 = Static538.anInt9199;
								}
								if (Static637.anInt10425 > local6.anInt8591 && local6.anObjectArray5 != null) {
									local872 = new Class14_Sub10();
									local872.aClass299_2 = local6;
									local872.anObjectArray1 = local6.anObjectArray5;
									Static97.aClass32_6.method582(local872);
								}
								if (Static46.anInt767 > local6.anInt8591 && local6.anObjectArray16 != null) {
									local872 = new Class14_Sub10();
									local872.aClass299_2 = local6;
									local872.anObjectArray1 = local6.anObjectArray16;
									Static97.aClass32_6.method582(local872);
								}
								if (Static101.anInt1748 > local6.anInt8591 && local6.anObjectArray2 != null) {
									local872 = new Class14_Sub10();
									local872.aClass299_2 = local6;
									local872.anObjectArray1 = local6.anObjectArray2;
									Static97.aClass32_6.method582(local872);
								}
								if (Static42.anInt4891 > local6.anInt8591 && local6.anObjectArray14 != null) {
									local872 = new Class14_Sub10();
									local872.aClass299_2 = local6;
									local872.anObjectArray1 = local6.anObjectArray14;
									Static97.aClass32_6.method582(local872);
								}
								if (Static676.anInt11214 > local6.anInt8591 && local6.anObjectArray13 != null) {
									local872 = new Class14_Sub10();
									local872.aClass299_2 = local6;
									local872.anObjectArray1 = local6.anObjectArray13;
									Static97.aClass32_6.method582(local872);
								}
								if (Static244.anInt4645 > local6.anInt8591 && local6.lb != null) {
									local872 = new Class14_Sub10();
									local872.aClass299_2 = local6;
									local872.anObjectArray1 = local6.lb;
									Static97.aClass32_6.method582(local872);
								}
								if (Static504.anInt8772 > local6.anInt8591 && local6.anObjectArray19 != null) {
									local872 = new Class14_Sub10();
									local872.aClass299_2 = local6;
									local872.anObjectArray1 = local6.anObjectArray19;
									Static97.aClass32_6.method582(local872);
								}
								local6.anInt8591 = Static154.anInt2379;
								if (local6.anObjectArray11 != null) {
									for (local397 = 0; local397 < Static563.anInt4938; local397++) {
										@Pc(2677) Class14_Sub10 local2677 = new Class14_Sub10();
										local2677.aClass299_2 = local6;
										local2677.anInt1049 = Static340.anInterface17Array1[local397].method647();
										local2677.anInt1057 = Static340.anInterface17Array1[local397].method650();
										local2677.anObjectArray1 = local6.anObjectArray11;
										Static97.aClass32_6.method582(local2677);
									}
								}
								if (Static323.aBoolean404 && local6.anObjectArray3 != null) {
									local872 = new Class14_Sub10();
									local872.aClass299_2 = local6;
									local872.anObjectArray1 = local6.anObjectArray3;
									Static97.aClass32_6.method582(local872);
								}
							}
							if (local6.anInt8610 == 5 && local6.anInt8622 != -1) {
								local6.method7443(Static103.aClass171_1, Static254.aClass142_1).method8684(local6.anInt8547, Static103.aClass144_3, Static181.aClass14_Sub26_9.aClass43_Sub10_1.method3094());
							}
							Static679.method9370(local6);
							if (local6.anInt8610 == 0) {
								method1370(arg0, local6.anInt8526, local30, local32, local34, local36, local19 - local6.anInt8552, local24 - local6.anInt8617, arg8, arg9, arg10, arg11);
								if (local6.aClass299Array2 != null) {
									method1370(local6.aClass299Array2, local6.anInt8526, local30, local32, local34, local36, local19 - local6.anInt8552, local24 - local6.anInt8617, arg8, arg9, arg10, arg11);
								}
								@Pc(2819) Class14_Sub13 local2819 = (Class14_Sub13) Static27.aClass125_3.method2630((long) local6.anInt8526);
								if (local2819 != null) {
									if (Static161.aClass80_6 == Static344.aClass80_7 && local2819.anInt1466 == 0 && !Static455.aBoolean533 && local305 && !Static123.aBoolean140) {
										Static374.method5795();
									}
									Static608.method8584(arg11, arg8, local24, local32, local2819.anInt1465, arg10, local30, local36, arg9, local34, local19);
								}
							}
						}
					}
				} else if (local30 < local34 && local32 < local36) {
					Static679.method9370(local6);
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
	public static void method1372(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static258.anInt4846;
		@Pc(3) int[] local3 = Static43.anIntArray35;
		for (@Pc(5) int local5 = 0; local5 < local1 + Static662.anInt10795; local5++) {
			@Pc(15) Class4_Sub3_Sub3_Sub3 local15;
			if (local5 < local1) {
				local15 = Static269.aClass4_Sub3_Sub3_Sub3_Sub2Array4[local3[local5]];
			} else {
				local15 = ((Class14_Sub44) Static100.aClass125_9.method2630((long) Static253.anIntArray241[local5 - local1])).aClass4_Sub3_Sub3_Sub3_Sub1_2;
			}
			if (local15.aByte146 == arg0 && local15.anInt3268 >= 0) {
				@Pc(41) int local41 = local15.method2870(0);
				if ((local41 & 0x1) == 0) {
					if ((local15.anInt11184 & 0x1FF) != 0 || (local15.anInt11178 & 0x1FF) != 0) {
						continue;
					}
				} else if ((local15.anInt11184 & 0x1FF) != 256 || (local15.anInt11178 & 0x1FF) != 256) {
					continue;
				}
				@Pc(85) int local85;
				@Pc(90) int local90;
				@Pc(127) int local127;
				if (local41 == 1) {
					local85 = local15.anInt11184 >> 9;
					local90 = local15.anInt11178 >> 9;
					if (local15.anInt3268 > Static47.anIntArrayArray8[local85][local90]) {
						Static47.anIntArrayArray8[local85][local90] = local15.anInt3268;
						Static544.anIntArrayArray57[local85][local90] = 1;
					} else if (local15.anInt3268 == Static47.anIntArrayArray8[local85][local90]) {
						local127 = Static544.anIntArrayArray57[local85][local90]++;
					}
				} else {
					local85 = (local41 - 1) * 256 + 60;
					local90 = local15.anInt11184 - local85 >> 9;
					@Pc(154) int local154 = local15.anInt11178 - local85 >> 9;
					@Pc(161) int local161 = local15.anInt11184 + local85 >> 9;
					@Pc(168) int local168 = local15.anInt11178 + local85 >> 9;
					for (@Pc(170) int local170 = local90; local170 <= local161; local170++) {
						for (@Pc(173) int local173 = local154; local173 <= local168; local173++) {
							if (local15.anInt3268 > Static47.anIntArrayArray8[local170][local173]) {
								Static47.anIntArrayArray8[local170][local173] = local15.anInt3268;
								Static544.anIntArrayArray57[local170][local173] = 1;
							} else if (local15.anInt3268 == Static47.anIntArrayArray8[local170][local173]) {
								local127 = Static544.anIntArrayArray57[local170][local173]++;
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!qga;I)V")
	public static void method1373(@OriginalArg(0) Class299 arg0) {
		if (arg0.anInt8542 != Static472.anInt8115) {
			return;
		}
		if (Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString37 == null) {
			arg0.anInt8546 = 0;
			arg0.anInt8559 = 0;
			return;
		}
		arg0.anInt8593 = 150;
		arg0.anInt8598 = (int) (Math.sin((double) Static530.anInt9105 / 40.0D) * 256.0D) & 0x7FF;
		arg0.anInt8546 = Static597.anInt9858;
		arg0.anInt8543 = 5;
		arg0.anInt8559 = Static186.method2742(Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aString37);
		@Pc(60) Class181 local60 = Static294.aClass4_Sub3_Sub3_Sub3_Sub2_1.aClass181_7;
		if (local60 == null) {
			arg0.aClass181_11 = null;
			return;
		}
		if (arg0.aClass181_11 == null) {
			arg0.aClass181_11 = new Class181_Sub1();
		}
		arg0.anInt8567 = local60.method8959();
		arg0.aClass181_11.method8951(local60);
	}
}
