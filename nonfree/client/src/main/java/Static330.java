import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray2 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!qj", name = "r", descriptor = "[I")
	public static final int[] anIntArray571 = new int[] { 1, 2, 4, 8 };

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lclient!za;IZI)V")
	public static void method4663(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg2 < 0 || Static374.anInt5604 == 0 || Static216.anInt4344 == 0) {
			return;
		}
		arg0.GA(Static275.anInt5312, Static371.anInt6804, Static374.anInt5604, Static216.anInt4344);
		arg0.ba(Static203.anInt4206, Static432.anInt7625, Static374.anInt5604, Static216.anInt4344);
		@Pc(35) Class40 local35 = arg0.method5944();
		local35.YA(Static5.anInt69, Static371.anInt6797, Static310.anInt5823, Static62.anInt1640, Static39.anInt1010, Static214.anInt7133);
		arg0.SA(local35);
		@Pc(55) int local55;
		@Pc(64) int local64;
		@Pc(73) int local73;
		@Pc(76) int local76;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(109) int[] local109;
		@Pc(141) int local141;
		@Pc(150) int local150;
		if (Static262.aClass96Array3 != null) {
			@Pc(50) int local50 = -1;
			@Pc(52) int local52 = -1;
			local55 = arg0.AA();
			local64 = (arg1 - Static275.anInt5312) * local55 / Static374.anInt5604;
			local73 = local55 * (arg2 - Static371.anInt6804) / Static216.anInt4344;
			local76 = arg0.r();
			local85 = local76 * (arg1 - Static275.anInt5312) / Static374.anInt5604;
			local94 = local76 * (arg2 - Static371.anInt6804) / Static216.anInt4344;
			local109 = new int[] { local64, local73, local55 };
			local35.wa(local109);
			@Pc(127) int[] local127 = new int[] { local85, local94, local76 };
			local35.wa(local127);
			@Pc(132) float local132 = 0.0F;
			local141 = local127[0] - local109[0];
			local150 = local127[1] - local109[1];
			@Pc(159) int local159 = local127[2] - local109[2];
			while (local132 < 1.0F) {
				@Pc(172) int local172 = (int) ((float) local109[0] + local132 * (float) local141);
				@Pc(176) int local176 = local172 >> 7;
				@Pc(187) int local187 = (int) ((float) local109[2] + local132 * (float) local159);
				@Pc(191) int local191 = local187 >> 7;
				if (local176 > 0 && local191 > 0 && local176 < Static209.anInt4283 && Static211.anInt4295 > local191) {
					@Pc(204) int local204 = Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102;
					if (local204 < 3 && (Static110.aByteArrayArrayArray20[1][local176][local191] & 0x2) != 0) {
						local204++;
					}
					if ((float) Static262.aClass96Array3[local204].ca(local172, local187) < (float) local150 * local132 + (float) local109[1]) {
						local50 = local172 + (Static429.aClass30_Sub1_Sub1_Sub2_2.method944() - 1 << 6) >> 7;
						local52 = local187 + (Static429.aClass30_Sub1_Sub1_Sub2_2.method944() - 1 << 6) >> 7;
						break;
					}
				}
				local132 = (float) ((double) local132 + 0.01D);
			}
			if (local50 != -1 && local52 != -1) {
				if (Static293.aBoolean300 && (Static439.anInt7742 & 0x40) != 0) {
					@Pc(291) Class68 local291 = Static115.method1866(Static132.anInt2941, Static118.anInt2743);
					if (local291 == null) {
						Static192.method3103();
					} else {
						Static453.method6150(60, true, false, Static263.anInt5067, -1, local52, 0L, local50, Static1.aString1, " ->");
					}
				} else {
					if (Static268.aClass272_4 == Static266.aClass272_3) {
						Static453.method6150(25, true, false, -1, -1, local52, 0L, local50, Static387.aClass158_187.method3594(Static365.anInt6682), "");
					}
					Static453.method6150(23, true, false, Static198.anInt7952, -1, local52, 0L, local50, Static219.aString36, "");
				}
			}
		}
		@Pc(351) Class117 local351 = Static43.aClass117_2;
		for (@Pc(361) Class41_Sub7 local361 = (Class41_Sub7) local351.method2967(); local361 != null; local361 = (Class41_Sub7) local351.method2970()) {
			if ((Static275.aBoolean333 || Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 == local361.anInt6865) && local361.method5221(arg1, arg2, arg0)) {
				@Pc(495) int local495;
				@Pc(507) int local507;
				if (local361.aClass30_1 instanceof Class30_Sub1_Sub1_Sub2) {
					@Pc(389) Class30_Sub1_Sub1_Sub2 local389 = (Class30_Sub1_Sub1_Sub2) local361.aClass30_1;
					local64 = local389.method944();
					if ((local64 & 0x1) == 0 && (local389.anInt7490 & 0x7F) == 0 && (local389.anInt7488 & 0x7F) == 0 || (local64 & 0x1) == 1 && (local389.anInt7490 & 0x7F) == 64 && (local389.anInt7488 & 0x7F) == 64) {
						local73 = local389.anInt7490 - (local389.method944() - 1 << 6);
						local76 = local389.anInt7488 - (local389.method944() - 1 << 6);
						for (local85 = 0; local85 < Static197.anInt4078; local85++) {
							@Pc(469) Class1_Sub27 local469 = (Class1_Sub27) Static24.aClass38_3.method765((long) Static415.anIntArray701[local85]);
							if (local469 != null) {
								@Pc(474) Class30_Sub1_Sub1_Sub1 local474 = local469.aClass30_Sub1_Sub1_Sub1_2;
								if (local474.anInt1263 != Static187.anInt3975 && local474.aBoolean79) {
									local495 = local474.anInt7490 - (local474.aClass11_1.anInt162 - 1 << 6);
									local507 = local474.anInt7488 - (local474.aClass11_1.anInt162 - 1 << 6);
									if (local495 >= local73 && local474.aClass11_1.anInt162 <= local389.method944() - (local495 - local73 >> 7) && local76 <= local507 && local474.aClass11_1.anInt162 <= local389.method944() - (local507 - local76 >> 7)) {
										Static454.method6161(Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 != local361.anInt6865, local474);
										local474.anInt1263 = Static187.anInt3975;
									}
								}
							}
						}
						local94 = Static180.anInt3908;
						local109 = Static274.anIntArray500;
						for (local495 = 0; local495 < local94; local495++) {
							@Pc(591) Class30_Sub1_Sub1_Sub2 local591 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local109[local495]];
							if (local591 != null && local591.anInt1263 != Static187.anInt3975 && local389 != local591 && local591.aBoolean79) {
								local141 = local591.anInt7490 - (local591.method944() - 1 << 6);
								local150 = local591.anInt7488 - (local591.method944() - 1 << 6);
								if (local73 <= local141 && local591.method944() <= local389.method944() - (local141 - local73 >> 7) && local76 <= local150 && local591.method944() <= local389.method944() - (local150 - local76 >> 7)) {
									Static15.method166(local591, Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 != local361.anInt6865);
									local591.anInt1263 = Static187.anInt3975;
								}
							}
						}
					}
					if (local389.anInt1263 == Static187.anInt3975) {
						continue;
					}
					Static15.method166(local389, local361.anInt6865 != Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102);
					local389.anInt1263 = Static187.anInt3975;
				}
				@Pc(844) int local844;
				if (local361.aClass30_1 instanceof Class30_Sub1_Sub1_Sub1) {
					@Pc(728) Class30_Sub1_Sub1_Sub1 local728 = (Class30_Sub1_Sub1_Sub1) local361.aClass30_1;
					if (local728.aClass11_1 != null) {
						if ((local728.aClass11_1.anInt162 & 0x1) == 0 && (local728.anInt7490 & 0x7F) == 0 && (local728.anInt7488 & 0x7F) == 0 || (local728.aClass11_1.anInt162 & 0x1) == 1 && (local728.anInt7490 & 0x7F) == 64 && (local728.anInt7488 & 0x7F) == 64) {
							local64 = local728.anInt7490 - (local728.aClass11_1.anInt162 - 1 << 6);
							local73 = local728.anInt7488 - (local728.aClass11_1.anInt162 - 1 << 6);
							for (local76 = 0; local76 < Static197.anInt4078; local76++) {
								@Pc(811) Class1_Sub27 local811 = (Class1_Sub27) Static24.aClass38_3.method765((long) Static415.anIntArray701[local76]);
								if (local811 != null) {
									@Pc(816) Class30_Sub1_Sub1_Sub1 local816 = local811.aClass30_Sub1_Sub1_Sub1_2;
									if (Static187.anInt3975 != local816.anInt1263 && local816 != local728 && local816.aBoolean79) {
										local844 = local816.anInt7490 - (local816.aClass11_1.anInt162 - 1 << 6);
										local495 = local816.anInt7488 - (local816.aClass11_1.anInt162 - 1 << 6);
										if (local844 >= local64 && local728.aClass11_1.anInt162 - (local844 - local64 >> 7) >= local816.aClass11_1.anInt162 && local73 <= local495 && local728.aClass11_1.anInt162 - (local495 - local73 >> 7) >= local816.aClass11_1.anInt162) {
											Static454.method6161(Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 != local361.anInt6865, local816);
											local816.anInt1263 = Static187.anInt3975;
										}
									}
								}
							}
							local85 = Static180.anInt3908;
							@Pc(929) int[] local929 = Static274.anIntArray500;
							for (local844 = 0; local844 < local85; local844++) {
								@Pc(939) Class30_Sub1_Sub1_Sub2 local939 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local929[local844]];
								if (local939 != null && Static187.anInt3975 != local939.anInt1263 && local939.aBoolean79) {
									local507 = local939.anInt7490 - (local939.method944() - 1 << 6);
									local141 = local939.anInt7488 - (local939.method944() - 1 << 6);
									if (local507 >= local64 && local939.method944() <= local728.aClass11_1.anInt162 - (local507 - local64 >> 7) && local141 >= local73 && local939.method944() <= local728.aClass11_1.anInt162 - (local141 - local73 >> 7)) {
										Static15.method166(local939, local361.anInt6865 != Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102);
										local939.anInt1263 = Static187.anInt3975;
									}
								}
							}
						}
						if (Static187.anInt3975 == local728.anInt1263) {
							continue;
						}
						Static454.method6161(local361.anInt6865 != Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102, local728);
						local728.anInt1263 = Static187.anInt3975;
					}
				}
				if (local361.aClass30_1 instanceof Class30_Sub5_Sub1) {
					local55 = local361.anInt6869 + Static278.anInt5374;
					local64 = Static380.anInt6896 + local361.anInt6867;
					@Pc(1095) Class1_Sub14 local1095 = (Class1_Sub14) Static156.aClass38_16.method765((long) (local55 | local361.anInt6865 << 28 | local64 << 14));
					if (local1095 != null) {
						for (@Pc(1103) Class1_Sub21 local1103 = (Class1_Sub21) local1095.aClass203_9.method4556(); local1103 != null; local1103 = (Class1_Sub21) local1095.aClass203_9.method4544()) {
							@Pc(1111) Class168 local1111 = Static43.aClass57_1.method1414(local1103.anInt3507);
							if (!Static293.aBoolean300) {
								if (local361.anInt6865 == Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102) {
									@Pc(1194) String[] local1194 = local1111.aStringArray33;
									for (local844 = 4; local844 >= 0; local844--) {
										if (local1194 != null && local1194[local844] != null) {
											@Pc(1206) byte local1206 = 0;
											if (local844 == 0) {
												local1206 = 49;
											}
											local507 = Static306.anInt5748;
											if (local844 == 1) {
												local1206 = 19;
											}
											if (local844 == 2) {
												local1206 = 15;
											}
											if (local844 == 3) {
												local1206 = 30;
											}
											if (local844 == local1111.anInt4831) {
												local507 = local1111.anInt4844;
											}
											if (local844 == 4) {
												local1206 = 11;
											}
											if (local1111.anInt4875 == local844) {
												local507 = local1111.anInt4850;
											}
											Static453.method6150(local1206, true, false, local507, -1, local361.anInt6867, (long) local1103.anInt3507, local361.anInt6869, local1194[local844], "<col=ff9040>" + local1111.aString37);
										}
									}
								}
								Static453.method6150(1007, true, Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 != local361.anInt6865, Static321.anInt5962, -1, local361.anInt6867, (long) local1103.anInt3507, local361.anInt6869, Static417.aClass158_200.method3594(Static365.anInt6682), "<col=ff9040>" + local1111.aString37);
							} else if (Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 == local361.anInt6865) {
								@Pc(1132) Class13 local1132 = Static181.anInt3937 == -1 ? null : Static53.aClass32_1.method724(Static181.anInt3937);
								if ((Static439.anInt7742 & 0x1) != 0 && (local1132 == null || local1111.method3725(local1132.anInt200, Static181.anInt3937) != local1132.anInt200)) {
									Static453.method6150(4, true, false, Static263.anInt5067, -1, local361.anInt6867, (long) local1103.anInt3507, local361.anInt6869, Static1.aString1, Static90.aString17 + " -> <col=ff9040>" + local1111.aString37);
								}
							}
						}
					}
				}
				if (local361.aClass30_1 instanceof Interface5) {
					@Pc(1343) Interface5 local1343 = (Interface5) local361.aClass30_1;
					@Pc(1350) Class192 local1350 = Static455.aClass161_4.method3628(local1343.method5730());
					if (local1350.anIntArray532 != null) {
						local1350 = local1350.method4369(Static366.aClass190_1);
					}
					if (local1350 != null) {
						if (!Static293.aBoolean300) {
							if (local361.anInt6865 == Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102) {
								@Pc(1374) String[] local1374 = local1350.aStringArray36;
								if (local1374 != null) {
									for (local76 = 4; local76 >= 0; local76--) {
										if (local1374[local76] != null) {
											@Pc(1386) short local1386 = 0;
											if (local76 == 0) {
												local1386 = 17;
											}
											local94 = Static306.anInt5748;
											if (local76 == 1) {
												local1386 = 20;
											}
											if (local76 == 2) {
												local1386 = 48;
											}
											if (local76 == 3) {
												local1386 = 45;
											}
											if (local76 == local1350.anInt5641) {
												local94 = local1350.anInt5657;
											}
											if (local76 == 4) {
												local1386 = 1002;
											}
											if (local1350.anInt5663 == local76) {
												local94 = local1350.anInt5640;
											}
											Static453.method6150(local1386, true, false, local94, -1, local361.anInt6867, Static229.method3504(local361.anInt6867, local1343, local361.anInt6869), local361.anInt6869, local1374[local76], "<col=00ffff>" + local1350.aString50);
										}
									}
								}
							}
							Static453.method6150(1011, true, Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102 != local361.anInt6865, Static321.anInt5962, -1, local361.anInt6867, (long) local1350.anInt5642, local361.anInt6869, Static417.aClass158_200.method3594(Static365.anInt6682), "<col=00ffff>" + local1350.aString50);
						} else if (local361.anInt6865 == Static429.aClass30_Sub1_Sub1_Sub2_2.aByte102) {
							@Pc(1530) Class13 local1530 = Static181.anInt3937 == -1 ? null : Static53.aClass32_1.method724(Static181.anInt3937);
							if ((Static439.anInt7742 & 0x4) != 0 && (local1530 == null || local1350.method4366(local1530.anInt200, Static181.anInt3937) != local1530.anInt200)) {
								Static453.method6150(22, true, false, Static263.anInt5067, -1, local361.anInt6867, Static229.method3504(local361.anInt6867, local1343, local361.anInt6869), local361.anInt6869, Static1.aString1, Static90.aString17 + " -> <col=00ffff>" + local1350.aString50);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4665(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == arg0) {
			Static161.method2657(arg1, arg2, arg5, arg6, arg4, arg3);
		} else if (arg2 - arg1 >= Static105.anInt2417 && arg1 + arg2 <= Static70.anInt1843 && Static362.anInt6654 <= arg4 - arg0 && Static164.anInt6595 >= arg4 + arg0) {
			Static170.method2729(arg1, arg0, arg2, arg6, arg3, arg5, arg4);
		} else {
			Static98.method1698(arg4, arg3, arg2, arg1, arg5, arg0, arg6);
		}
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
	public static void method4672() {
		Static81.aClass91_25.method1999();
		Static89.aClass91_104.method1999();
		Static96.aClass91_29.method1999();
		Static458.aClass91_103.method1999();
		Static135.aClass91_42.method1999();
	}
}
