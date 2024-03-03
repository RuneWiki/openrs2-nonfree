import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!wm;III)V", line = 92)
	public static void method5575(@OriginalArg(0) Class19 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg1 < 0 || Static71.anInt1735 == 0 || Static144.anInt2789 == 0) {
			return;
		}
		arg0.method2823(Static292.anInt5918, Static15.anInt366, Static71.anInt1735, Static144.anInt2789);
		arg0.method2897(Class194.anInt5486, Class50.anInt1547, Static71.anInt1735, Static144.anInt2789);
		@Pc(39) Class14 local39 = arg0.method2899();
		local39.method3931(Static248.anInt4956, Static366.anInt7213, Static356.anInt7128, Static87.anInt1944, Static35.anInt924, Static90.anInt2049);
		arg0.method2898(local39);
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(88) int local88;
		@Pc(97) int local97;
		@Pc(112) int[] local112;
		@Pc(144) int local144;
		@Pc(152) int local152;
		if (Static307.aClass6Array3 != null) {
			@Pc(54) int local54 = -1;
			@Pc(56) int local56 = -1;
			@Pc(59) int local59 = arg0.method2816();
			local67 = (arg2 - Static292.anInt5918) * local59 / Static71.anInt1735;
			local76 = local59 * (arg1 - Static15.anInt366) / Static144.anInt2789;
			local79 = arg0.method2877();
			local88 = local79 * (arg2 - Static292.anInt5918) / Static71.anInt1735;
			local97 = (arg1 - Static15.anInt366) * local79 / Static144.anInt2789;
			local112 = new int[] { local67, local76, local59 };
			local39.method3936(local112);
			@Pc(130) int[] local130 = new int[] { local88, local97, local79 };
			local39.method3936(local130);
			@Pc(135) float local135 = 0.0F;
			local144 = local130[0] - local112[0];
			local152 = local130[1] - local112[1];
			@Pc(161) int local161 = local130[2] - local112[2];
			while (local135 < 1.0F) {
				@Pc(174) int local174 = (int) ((float) local144 * local135 + (float) local112[0]);
				@Pc(178) int local178 = local174 >> 7;
				@Pc(189) int local189 = (int) ((float) local112[2] + (float) local161 * local135);
				@Pc(193) int local193 = local189 >> 7;
				if (local178 > 0 && local193 > 0 && Class241.anInt7020 > local178 && local193 < OutputStream_Sub1.anInt4442) {
					@Pc(206) int local206 = Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78;
					if (local206 < 3 && (Static334.aByteArrayArrayArray16[1][local178][local193] & 0x2) != 0) {
						local206++;
					}
					if ((float) Static307.aClass6Array3[local206].method5729(local174, local189) < (float) local152 * local135 + (float) local112[1]) {
						local54 = local174 + (Static17.aClass11_Sub5_Sub2_Sub1_3.method4329() - 1) * 64 >> 7;
						local56 = local189 + (Static17.aClass11_Sub5_Sub2_Sub1_3.method4329() - 1) * 64 >> 7;
						break;
					}
				}
				local135 = (float) ((double) local135 + 0.01D);
			}
			if (local54 != -1 && local56 != -1) {
				if (Class2_Sub2_Sub10_Sub2.aBoolean419 && (Static108.anInt3833 & 0x40) != 0) {
					@Pc(293) Class161 local293 = Static193.method3706(Static314.anInt6305, InputStream_Sub1.anInt3788);
					if (local293 == null) {
						Static193.method3700();
					} else {
						Static1.method3(-1, true, local56, false, Class67.aString18, local54, 51, " ->", Static38.anInt1043, 0L);
					}
				} else {
					if (Class2_Sub3_Sub12.aClass50_1 == Class226.aClass50_4) {
						Static1.method3(-1, true, local56, false, Class2_Sub41.aClass79_147.method2269(Class197.anInt5569), local54, 59, "", -1, 0L);
					}
					Static1.method3(-1, true, local56, false, Static307.aString62, local54, 22, "", -1, 0L);
				}
			}
		}
		@Pc(349) Class36 local349 = Class2_Sub4.aClass36_6;
		for (@Pc(354) Class12_Sub4 local354 = (Class12_Sub4) local349.method1417(); local354 != null; local354 = (Class12_Sub4) local349.method1422()) {
			if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local354.anInt4068 && local354.method4026(arg1, arg2, arg0)) {
				@Pc(473) int local473;
				if (local354.aClass11_1 instanceof Class11_Sub5_Sub2_Sub1) {
					@Pc(380) Class11_Sub5_Sub2_Sub1 local380 = (Class11_Sub5_Sub2_Sub1) local354.aClass11_1;
					local67 = local380.method4329();
					if ((local67 & 0x1) == 0 && (local380.anInt6768 & 0x7F) == 0 && (local380.anInt6770 & 0x7F) == 0 || (local67 & 0x1) == 1 && (local380.anInt6768 & 0x7F) == 64 && (local380.anInt6770 & 0x7F) == 64) {
						local76 = local380.anInt6768 + 64 - local380.method4329() * 64;
						local79 = local380.anInt6770 + 64 - local380.method4329() * 64;
						@Pc(485) int local485;
						for (local88 = 0; local88 < Class117.anInt3183; local88++) {
							@Pc(451) Class11_Sub5_Sub2_Sub2 local451 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[Class149.anIntArray230[local88]];
							if (local451 != null && local451.anInt4623 != Class83.anInt2345 && local451.aBoolean320) {
								local473 = local451.anInt6768 - (local451.aClass71_1.anInt2038 - 1) * 64;
								local485 = local451.anInt6770 - (local451.aClass71_1.anInt2038 - 1) * 64;
								if (local76 <= local473 && local451.aClass71_1.anInt2038 <= local380.method4329() - (local473 - local76 >> 7) && local485 >= local79 && local451.aClass71_1.anInt2038 <= local380.method4329() - (local485 - local79 >> 7)) {
									Static224.method4192(local451, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 != local354.anInt4068);
									local451.anInt4623 = Class83.anInt2345;
								}
							}
						}
						local97 = Class28.anInt751;
						local112 = Class64.anIntArray121;
						for (local485 = 0; local485 < local97; local485++) {
							@Pc(564) Class11_Sub5_Sub2_Sub1 local564 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local112[local485]];
							if (local564 != null && Class83.anInt2345 != local564.anInt4623 && local380 != local564 && local564.aBoolean320) {
								local144 = local564.anInt6768 + 64 - local564.method4329() * 64;
								local152 = local564.anInt6770 - (local564.method4329() - 1) * 64;
								if (local144 >= local76 && local564.method4329() <= local380.method4329() - (local144 - local76 >> 7) && local152 >= local79 && local564.method4329() <= local380.method4329() - (local152 - local79 >> 7)) {
									Static172.method3398(Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 != local354.anInt4068, local564);
									local564.anInt4623 = Class83.anInt2345;
								}
							}
						}
					}
					if (local380.anInt4623 == Class83.anInt2345) {
						continue;
					}
					Static172.method3398(local354.anInt4068 != Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78, local380);
					local380.anInt4623 = Class83.anInt2345;
				}
				if (local354.aClass11_1 instanceof Class11_Sub5_Sub2_Sub2) {
					@Pc(692) Class11_Sub5_Sub2_Sub2 local692 = (Class11_Sub5_Sub2_Sub2) local354.aClass11_1;
					if (local692.aClass71_1 != null) {
						if ((local692.aClass71_1.anInt2038 & 0x1) == 0 && (local692.anInt6768 & 0x7F) == 0 && (local692.anInt6770 & 0x7F) == 0 || (local692.aClass71_1.anInt2038 & 0x1) == 1 && (local692.anInt6768 & 0x7F) == 64 && (local692.anInt6770 & 0x7F) == 64) {
							local67 = local692.anInt6768 - (local692.aClass71_1.anInt2038 - 1) * 64;
							local76 = local692.anInt6770 - (local692.aClass71_1.anInt2038 - 1) * 64;
							for (local79 = 0; local79 < Class117.anInt3183; local79++) {
								@Pc(768) Class11_Sub5_Sub2_Sub2 local768 = Class2_Sub40.aClass11_Sub5_Sub2_Sub2Array1[Class149.anIntArray230[local79]];
								if (local768 != null && local768.anInt4623 != Class83.anInt2345 && local692 != local768 && local768.aBoolean320) {
									local97 = local768.anInt6768 - (local768.aClass71_1.anInt2038 - 1) * 64;
									local473 = local768.anInt6770 + 64 - local768.aClass71_1.anInt2038 * 64;
									if (local67 <= local97 && local692.aClass71_1.anInt2038 - (local97 - local67 >> 7) >= local768.aClass71_1.anInt2038 && local76 <= local473 && local768.aClass71_1.anInt2038 <= local692.aClass71_1.anInt2038 - (local473 - local76 >> 7)) {
										Static224.method4192(local768, Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 != local354.anInt4068);
										local768.anInt4623 = Class83.anInt2345;
									}
								}
							}
							local88 = Class28.anInt751;
							@Pc(882) int[] local882 = Class64.anIntArray121;
							for (local473 = 0; local473 < local88; local473++) {
								@Pc(892) Class11_Sub5_Sub2_Sub1 local892 = Class9.aClass11_Sub5_Sub2_Sub1Array1[local882[local473]];
								if (local892 != null && local892.anInt4623 != Class83.anInt2345 && local892.aBoolean320) {
									@Pc(919) int local919 = local892.anInt6768 - (local892.method4329() - 1) * 64;
									local144 = local892.anInt6770 - (local892.method4329() - 1) * 64;
									if (local919 >= local67 && local892.method4329() <= local692.aClass71_1.anInt2038 - (local919 - local67 >> 7) && local144 >= local76 && local892.method4329() <= local692.aClass71_1.anInt2038 - (local144 - local76 >> 7)) {
										Static172.method3398(Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 != local354.anInt4068, local892);
										local892.anInt4623 = Class83.anInt2345;
									}
								}
							}
						}
						if (local692.anInt4623 == Class83.anInt2345) {
							continue;
						}
						Static224.method4192(local692, local354.anInt4068 != Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78);
						local692.anInt4623 = Class83.anInt2345;
					}
				}
				if (local354.aClass11_1 instanceof Class11_Sub4_Sub1) {
					@Pc(1038) Class2_Sub32 local1038 = (Class2_Sub32) Class87.aClass4_49.method90((long) (local354.anInt4071 | local354.anInt4068 << 28 | local354.anInt4070 << 14));
					if (local1038 != null) {
						for (@Pc(1046) Class2_Sub8 local1046 = (Class2_Sub8) local1038.aClass135_34.method3549(); local1046 != null; local1046 = (Class2_Sub8) local1038.aClass135_34.method3548()) {
							@Pc(1054) Class188 local1054 = Static290.aClass107_2.method2761(local1046.anInt1715);
							if (!Class2_Sub2_Sub10_Sub2.aBoolean419) {
								if (local354.anInt4068 == Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) {
									@Pc(1134) String[] local1134 = local1054.aStringArray50;
									for (local88 = 4; local88 >= 0; local88--) {
										if (local1134 != null && local1134[local88] != null) {
											@Pc(1146) byte local1146 = 0;
											if (local88 == 0) {
												local1146 = 15;
											}
											local473 = Class67.anInt1908;
											if (local88 == 1) {
												local1146 = 46;
											}
											if (local88 == 2) {
												local1146 = 58;
											}
											if (local88 == 3) {
												local1146 = 6;
											}
											if (local88 == 4) {
												local1146 = 21;
											}
											if (local1054.anInt5206 == local88) {
												local473 = local1054.anInt5228;
											}
											if (local1054.anInt5208 == local88) {
												local473 = local1054.anInt5215;
											}
											Static1.method3(-1, true, local354.anInt4070, false, local1134[local88], local354.anInt4071, local1146, "<col=ff9040>" + local1054.aString55, local473, (long) local1046.anInt1715);
										}
									}
								}
								Static1.method3(-1, true, local354.anInt4070, local354.anInt4068 != Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78, Class2_Sub3_Sub36.aClass79_143.method2269(Class197.anInt5569), local354.anInt4071, 1009, "<col=ff9040>" + local1054.aString55, Class2_Sub3_Sub13.anInt2520, (long) local1046.anInt1715);
							} else if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local354.anInt4068) {
								@Pc(1071) Class240 local1071 = Static161.anInt3294 == -1 ? null : Static338.aClass18_2.method565(Static161.anInt3294);
								if ((Static108.anInt3833 & 0x1) != 0 && (local1071 == null || local1054.method4773(local1071.anInt7010, Static161.anInt3294) != local1071.anInt7010)) {
									Static1.method3(-1, true, local354.anInt4070, false, Class67.aString18, local354.anInt4071, 13, Class173_Sub4.aString68 + " -> <col=ff9040>" + local1054.aString55, Static38.anInt1043, (long) local1046.anInt1715);
								}
							}
						}
					}
				}
				if (local354.aClass11_1 instanceof Interface6) {
					@Pc(1288) Interface6 local1288 = (Interface6) local354.aClass11_1;
					@Pc(1297) Class41 local1297 = Static334.aClass202_4.method5164(local1288.method6086());
					if (local1297.anIntArray94 != null) {
						local1297 = local1297.method1535(Static199.aClass226_1);
					}
					if (local1297 != null) {
						if (!Class2_Sub2_Sub10_Sub2.aBoolean419) {
							if (Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78 == local354.anInt4068) {
								@Pc(1393) String[] local1393 = local1297.aStringArray10;
								if (local1393 != null) {
									for (local79 = 4; local79 >= 0; local79--) {
										if (local1393[local79] != null) {
											@Pc(1405) short local1405 = 0;
											if (local79 == 0) {
												local1405 = 50;
											}
											local97 = Class67.anInt1908;
											if (local79 == 1) {
												local1405 = 20;
											}
											if (local79 == 2) {
												local1405 = 12;
											}
											if (local79 == 3) {
												local1405 = 17;
											}
											if (local79 == local1297.anInt1343) {
												local97 = local1297.anInt1311;
											}
											if (local79 == 4) {
												local1405 = 1004;
											}
											if (local79 == local1297.anInt1340) {
												local97 = local1297.anInt1312;
											}
											Static1.method3(-1, true, local354.anInt4070, false, local1393[local79], local354.anInt4071, local1405, "<col=00ffff>" + local1297.aString12, local97, Static287.method5285(local354.anInt4070, local354.anInt4071, local1288));
										}
									}
								}
							}
							Static1.method3(-1, true, local354.anInt4070, local354.anInt4068 != Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78, Class2_Sub3_Sub36.aClass79_143.method2269(Class197.anInt5569), local354.anInt4071, 1010, "<col=00ffff>" + local1297.aString12, Class2_Sub3_Sub13.anInt2520, (long) local1297.anInt1349);
						} else if (local354.anInt4068 == Static17.aClass11_Sub5_Sub2_Sub1_3.aByte78) {
							@Pc(1324) Class240 local1324 = Static161.anInt3294 == -1 ? null : Static338.aClass18_2.method565(Static161.anInt3294);
							if ((Static108.anInt3833 & 0x4) != 0 && (local1324 == null || local1297.method1534(local1324.anInt7010, Static161.anInt3294) != local1324.anInt7010)) {
								Static1.method3(-1, true, local354.anInt4070, false, Class67.aString18, local354.anInt4071, 57, Class173_Sub4.aString68 + " -> <col=00ffff>" + local1297.aString12, Static38.anInt1043, Static287.method5285(local354.anInt4070, local354.anInt4071, local1288));
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIIII)V", line = 584)
	public static void method5577(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg3;
		@Pc(14) int local14 = arg0 - arg1;
		if (local14 == 0) {
			if (local10 != 0) {
				Static338.method6091(arg2, arg3, arg4, arg1);
			}
		} else if (local10 == 0) {
			Static223.method4182(arg3, arg4, arg0, arg1);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(64) boolean local64 = local10 > local14;
			@Pc(68) int local68;
			@Pc(70) int local70;
			if (local64) {
				local68 = arg1;
				local70 = arg0;
				arg1 = arg3;
				arg3 = local68;
				arg0 = arg2;
				arg2 = local70;
			}
			if (arg1 > arg0) {
				local68 = arg1;
				arg1 = arg0;
				local70 = arg3;
				arg0 = local68;
				arg3 = arg2;
				arg2 = local70;
			}
			local68 = arg3;
			local70 = arg0 - arg1;
			@Pc(104) int local104 = arg2 - arg3;
			@Pc(109) int local109 = -(local70 >> 1);
			if (local104 < 0) {
				local104 = -local104;
			}
			@Pc(129) int local129 = arg2 <= arg3 ? -1 : 1;
			@Pc(133) int local133;
			if (local64) {
				for (local133 = arg1; local133 <= arg0; local133++) {
					local109 += local104;
					Static332.anIntArrayArray58[local133][local68] = arg4;
					if (local109 > 0) {
						local68 += local129;
						local109 -= local70;
					}
				}
			} else {
				for (local133 = arg1; local133 <= arg0; local133++) {
					local109 += local104;
					Static332.anIntArrayArray58[local68][local133] = arg4;
					if (local109 > 0) {
						local109 -= local70;
						local68 += local129;
					}
				}
			}
		}
	}
}
