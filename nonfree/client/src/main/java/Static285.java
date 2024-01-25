import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static285 {

	@OriginalMember(owner = "client!so", name = "f", descriptor = "I")
	public static int anInt5730;

	@OriginalMember(owner = "client!so", name = "g", descriptor = "I")
	public static int anInt5731 = -1;

	@OriginalMember(owner = "client!so", name = "i", descriptor = "[I")
	public static final int[] anIntArray557 = new int[8];

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)I")
	public static int method4999(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local12 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local12 == 19 || local12 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!so", name = "b", descriptor = "(IB)V")
	public static void method5000() {
		@Pc(1) Class37 local1 = Static352.aClass37_111;
		synchronized (Static352.aClass37_111) {
			Static352.aClass37_111.method920(5);
		}
		local1 = Static337.aClass37_107;
		synchronized (Static337.aClass37_107) {
			Static337.aClass37_107.method920(5);
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(BLclient!ii;)V")
	public static void method5001(@OriginalArg(1) Class105 arg0) {
		if (Static208.anInt4358 < 0 || Static28.anInt538 < 0 || Static254.anInt5236 == 0 || Static221.anInt4694 == 0) {
			return;
		}
		arg0.method4282(Static320.anInt6361, Static90.anInt1710, Static254.anInt5236, Static221.anInt4694);
		arg0.method4268(Static152.anInt3124, Static208.anInt4363, Static254.anInt5236, Static221.anInt4694);
		@Pc(32) Class31 local32 = arg0.method4267();
		local32.method3183(Static130.anInt4852, Static350.anInt4390, Static187.anInt3910, Static178.anInt3756, Static303.anInt6075, Static332.anInt6446);
		arg0.method4213(local32);
		@Pc(74) int local74;
		@Pc(77) int local77;
		@Pc(85) int local85;
		@Pc(94) int local94;
		@Pc(141) int local141;
		if (Static254.anInt5233 == 0 && Static278.aClass12Array3 != null) {
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			@Pc(57) int local57 = arg0.method4239();
			@Pc(65) int local65 = local57 * (Static208.anInt4358 - Static320.anInt6361) / Static254.anInt5236;
			local74 = local57 * (Static28.anInt538 - Static90.anInt1710) / Static221.anInt4694;
			local77 = arg0.method4297();
			local85 = (Static208.anInt4358 - Static320.anInt6361) * local77 / Static254.anInt5236;
			local94 = (Static28.anInt538 - Static90.anInt1710) * local77 / Static221.anInt4694;
			@Pc(109) int[] local109 = new int[] { local65, local74, local57 };
			local32.method3177(local109);
			@Pc(127) int[] local127 = new int[] { local85, local94, local77 };
			local32.method3177(local127);
			@Pc(132) float local132 = 0.0F;
			local141 = local127[0] - local109[0];
			@Pc(150) int local150 = local127[1] - local109[1];
			@Pc(159) int local159 = local127[2] - local109[2];
			while (local132 < 1.0F) {
				@Pc(172) int local172 = (int) ((float) local141 * local132 + (float) local109[0]);
				@Pc(176) int local176 = local172 >> 7;
				@Pc(187) int local187 = (int) (local132 * (float) local159 + (float) local109[2]);
				@Pc(191) int local191 = local187 >> 7;
				if (local176 > 0 && local191 > 0 && Static43.anInt1151 > local176 && local191 < Static260.anInt5348) {
					@Pc(207) int local207 = Static127.anInt2487;
					if (local207 < 3 && (Static291.aByteArrayArrayArray11[1][local176][local191] & 0x2) != 0) {
						local207++;
					}
					if ((float) Static278.aClass12Array3[local207].method2698(local172, local187) < local132 * (float) local150 + (float) local109[1]) {
						local52 = local172 + Static127.aClass10_Sub1_Sub2_Sub2_1.method3402() * 64 - 64 >> 7;
						local54 = local187 + (Static127.aClass10_Sub1_Sub2_Sub2_1.method3402() - 1) * 64 >> 7;
						break;
					}
				}
				local132 = (float) ((double) local132 + 0.01D);
			}
			if (local52 != -1 && local54 != -1) {
				if (Static265.aBoolean456 && (Static45.anInt1184 & 0x40) != 0) {
					@Pc(329) Class163 local329 = Static46.method931(Static178.anInt3758, Static259.anInt5310);
					if (local329 == null) {
						Static312.method5355();
					} else {
						Static169.method2996(local54, Static224.anInt4728, Static238.aString191, 0L, " ->", 4, local52);
					}
				} else {
					if (Class10_Sub1_Sub1.lb == 1) {
						Static169.method2996(local54, -1, Static340.aString260, 0L, "", 11, local52);
					}
					Static169.method2996(local54, -1, Static289.aString228, 0L, "", 60, local52);
				}
			}
		}
		@Pc(353) Class122 local353 = Static88.aClass122_1;
		for (@Pc(358) Class7_Sub3 local358 = (Class7_Sub3) local353.method2626(); local358 != null; local358 = (Class7_Sub3) local353.method2630()) {
			if (local358.method1192(Static208.anInt4358, Static28.anInt538, arg0) && local358.anInt1439 == Static127.anInt2487) {
				@Pc(554) int local554;
				@Pc(488) int local488;
				@Pc(500) int local500;
				if (local358.aClass10_1 instanceof Class10_Sub1_Sub2_Sub2) {
					@Pc(383) Class10_Sub1_Sub2_Sub2 local383 = (Class10_Sub1_Sub2_Sub2) local358.aClass10_1;
					local74 = local383.method3402();
					if ((local74 & 0x1) == 0 && (local383.anInt6728 & 0x7F) == 0 && (local383.anInt6726 & 0x7F) == 0 || (local74 & 0x1) == 1 && (local383.anInt6728 & 0x7F) == 64 && (local383.anInt6726 & 0x7F) == 64) {
						local77 = local383.anInt6728 + 64 - local383.method3402() * 64;
						local85 = local383.anInt6726 - (local383.method3402() - 1) * 64;
						for (local94 = 0; local94 < Static271.anInt5578; local94++) {
							@Pc(461) Class10_Sub1_Sub2_Sub1 local461 = Static178.aClass10_Sub1_Sub2_Sub1Array1[Static79.anIntArray672[local94]];
							if (local461 != null && Static282.anInt3516 != local461.anInt4016 && local461.aBoolean308) {
								local488 = local461.anInt6728 + 64 - local461.aClass60_1.anInt1504 * 64;
								local500 = local461.anInt6726 - (local461.aClass60_1.anInt1504 - 1) * 64;
								if (local77 <= local488 && local461.aClass60_1.anInt1504 <= local383.method3402() - (local488 - local77 >> 7) && local500 >= local85 && local461.aClass60_1.anInt1504 <= local383.method3402() - (local500 - local85 >> 7)) {
									Static124.method1984(local461);
									local461.anInt4016 = Static282.anInt3516;
								}
							}
						}
						for (local554 = 0; local554 < Static167.anInt3454; local554++) {
							@Pc(562) Class10_Sub1_Sub2_Sub2 local562 = Static202.aClass10_Sub1_Sub2_Sub2Array1[Static212.anIntArray415[local554]];
							if (local562 != null && Static282.anInt3516 != local562.anInt4016 && local562 != local383 && local562.aBoolean308) {
								local500 = local562.anInt6728 - (local562.method3402() - 1) * 64;
								local141 = local562.anInt6726 + 64 - local562.method3402() * 64;
								if (local77 <= local500 && local562.method3402() <= local383.method3402() - (local500 - local77 >> 7) && local85 <= local141 && local562.method3402() <= local383.method3402() - (local141 - local85 >> 7)) {
									Static260.method4680(local562);
									local562.anInt4016 = Static282.anInt3516;
								}
							}
						}
					}
					if (local383.anInt4016 == Static282.anInt3516) {
						continue;
					}
					Static260.method4680(local383);
					local383.anInt4016 = Static282.anInt3516;
				}
				if (local358.aClass10_1 instanceof Class10_Sub1_Sub2_Sub1) {
					@Pc(671) Class10_Sub1_Sub2_Sub1 local671 = (Class10_Sub1_Sub2_Sub1) local358.aClass10_1;
					if (local671.aClass60_1 != null) {
						if ((local671.aClass60_1.anInt1504 & 0x1) == 0 && (local671.anInt6728 & 0x7F) == 0 && (local671.anInt6726 & 0x7F) == 0 || (local671.aClass60_1.anInt1504 & 0x1) == 1 && (local671.anInt6728 & 0x7F) == 64 && (local671.anInt6726 & 0x7F) == 64) {
							local74 = local671.anInt6728 - (local671.aClass60_1.anInt1504 - 1) * 64;
							local77 = local671.anInt6726 + 64 - local671.aClass60_1.anInt1504 * 64;
							for (local85 = 0; local85 < Static271.anInt5578; local85++) {
								@Pc(745) Class10_Sub1_Sub2_Sub1 local745 = Static178.aClass10_Sub1_Sub2_Sub1Array1[Static79.anIntArray672[local85]];
								if (local745 != null && local745.anInt4016 != Static282.anInt3516 && local745 != local671 && local745.aBoolean308) {
									local554 = local745.anInt6728 + 64 - local745.aClass60_1.anInt1504 * 64;
									local488 = local745.anInt6726 + 64 - local745.aClass60_1.anInt1504 * 64;
									if (local74 <= local554 && local745.aClass60_1.anInt1504 <= local671.aClass60_1.anInt1504 - (local554 - local74 >> 7) && local488 >= local77 && local745.aClass60_1.anInt1504 <= local671.aClass60_1.anInt1504 - (local488 - local77 >> 7)) {
										Static124.method1984(local745);
										local745.anInt4016 = Static282.anInt3516;
									}
								}
							}
							for (local94 = 0; local94 < Static167.anInt3454; local94++) {
								@Pc(854) Class10_Sub1_Sub2_Sub2 local854 = Static202.aClass10_Sub1_Sub2_Sub2Array1[Static212.anIntArray415[local94]];
								if (local854 != null && local854.anInt4016 != Static282.anInt3516 && local854.aBoolean308) {
									local488 = local854.anInt6728 + 64 - local854.method3402() * 64;
									local500 = local854.anInt6726 + 64 - local854.method3402() * 64;
									if (local488 >= local74 && local854.method3402() <= local671.aClass60_1.anInt1504 - (local488 - local74 >> 7) && local77 <= local500 && local854.method3402() <= local671.aClass60_1.anInt1504 - (local500 - local77 >> 7)) {
										Static260.method4680(local854);
										local854.anInt4016 = Static282.anInt3516;
									}
								}
							}
						}
						if (Static282.anInt3516 == local671.anInt4016) {
							continue;
						}
						Static124.method1984(local671);
						local671.anInt4016 = Static282.anInt3516;
					}
				}
				if (local358.aClass10_1 instanceof Class10_Sub5_Sub1) {
					@Pc(977) Class1_Sub17 local977 = (Class1_Sub17) Static98.aClass207_12.method5555((long) (local358.anInt1439 << 28 | local358.anInt1442 << 14 | local358.anInt1441));
					if (local977 != null) {
						for (@Pc(985) Class1_Sub16 local985 = (Class1_Sub16) local977.aClass14_8.method303(); local985 != null; local985 = (Class1_Sub16) local977.aClass14_8.method312()) {
							@Pc(992) Class102 local992 = Static348.method5333(local985.anInt1909);
							if (Static254.anInt5233 == 1) {
								Static169.method2996(local358.anInt1442, Static318.anInt6339, Static319.aString120, (long) local985.anInt1909, Static142.aString102 + " -> <col=ff9040>" + local992.aString95, 3, local358.anInt1441);
							} else if (Static265.aBoolean456) {
								@Pc(1037) Class1_Sub2_Sub19 local1037 = Static61.anInt1411 == -1 ? null : Static262.method1693(Static61.anInt1411);
								if ((Static45.anInt1184 & 0x1) != 0 && (local1037 == null || local992.method1996(local1037.anInt6009, Static61.anInt1411) != local1037.anInt6009)) {
									Static169.method2996(local358.anInt1442, Static224.anInt4728, Static238.aString191, (long) local985.anInt1909, Static49.aString203 + " -> <col=ff9040>" + local992.aString95, 45, local358.anInt1441);
								}
							} else {
								@Pc(1087) String[] local1087 = local992.aStringArray24;
								for (local94 = 4; local94 >= 0; local94--) {
									if (local1087 != null && local1087[local94] != null) {
										@Pc(1099) byte local1099 = 0;
										if (local94 == 0) {
											local1099 = 12;
										}
										local488 = Static188.anInt3930;
										if (local94 == 1) {
											local1099 = 48;
										}
										if (local94 == 2) {
											local1099 = 44;
										}
										if (local94 == 3) {
											local1099 = 57;
										}
										if (local992.anInt2394 == local94) {
											local488 = local992.anInt2375;
										}
										if (local94 == 4) {
											local1099 = 59;
										}
										if (local992.anInt2398 == local94) {
											local488 = local992.anInt2423;
										}
										Static169.method2996(local358.anInt1442, local488, local1087[local94], (long) local985.anInt1909, "<col=ff9040>" + local992.aString95, local1099, local358.anInt1441);
									}
								}
								Static169.method2996(local358.anInt1442, Static53.anInt1290, Static99.aString77, (long) local985.anInt1909, "<col=ff9040>" + local992.aString95, 1005, local358.anInt1441);
							}
						}
					}
				}
				if (local358.aClass10_1 instanceof Interface4) {
					@Pc(1225) Interface4 local1225 = (Interface4) local358.aClass10_1;
					@Pc(1231) Class79 local1231 = Static129.method2097(local1225.method5445());
					if (local1231.anIntArray161 != null) {
						local1231 = local1231.method1567();
					}
					if (local1231 != null) {
						if (Static254.anInt5233 == 1) {
							Static169.method2996(local358.anInt1442, Static318.anInt6339, Static319.aString120, Static124.method1997(local358.anInt1442, local1225, local358.anInt1441), Static142.aString102 + " -> <col=00ffff>" + local1231.aString75, 13, local358.anInt1441);
						} else if (Static265.aBoolean456) {
							@Pc(1289) Class1_Sub2_Sub19 local1289 = Static61.anInt1411 == -1 ? null : Static262.method1693(Static61.anInt1411);
							if ((Static45.anInt1184 & 0x4) != 0 && (local1289 == null || local1231.method1563(local1289.anInt6009, Static61.anInt1411) != local1289.anInt6009)) {
								Static169.method2996(local358.anInt1442, Static224.anInt4728, Static238.aString191, Static124.method1997(local358.anInt1442, local1225, local358.anInt1441), Static49.aString203 + " -> <col=00ffff>" + local1231.aString75, 40, local358.anInt1441);
							}
						} else {
							@Pc(1347) String[] local1347 = local1231.aStringArray17;
							if (local1347 != null) {
								for (local85 = 4; local85 >= 0; local85--) {
									if (local1347[local85] != null) {
										@Pc(1359) short local1359 = 0;
										local554 = Static188.anInt3930;
										if (local85 == 0) {
											local1359 = 14;
										}
										if (local85 == 1) {
											local1359 = 49;
										}
										if (local85 == 2) {
											local1359 = 28;
										}
										if (local85 == 3) {
											local1359 = 33;
										}
										if (local85 == 4) {
											local1359 = 1006;
										}
										if (local85 == local1231.anInt1890) {
											local554 = local1231.anInt1858;
										}
										if (local1231.anInt1875 == local85) {
											local554 = local1231.anInt1888;
										}
										Static169.method2996(local358.anInt1442, local554, local1347[local85], Static124.method1997(local358.anInt1442, local1225, local358.anInt1441), "<col=00ffff>" + local1231.aString75, local1359, local358.anInt1441);
									}
								}
							}
							Static169.method2996(local358.anInt1442, Static53.anInt1290, Static99.aString77, (long) local1231.anInt1898, "<col=00ffff>" + local1231.aString75, 1008, local358.anInt1441);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIILclient!ps;III)V")
	public static void method5002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class163 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg4.anInt4934 == 2) {
			@Pc(23) int local23 = 99999;
			@Pc(25) int local25 = 0;
			@Pc(27) int local27 = 0;
			for (@Pc(29) int local29 = 0; local29 < arg4.anInt4933; local29++) {
				for (@Pc(33) int local33 = 0; local33 < arg4.anInt5009; local33++) {
					@Pc(45) int local45 = arg5 + (arg4.anInt4916 + 32) * local33;
					@Pc(55) int local55 = arg1 + local29 * (arg4.anInt4976 + 32);
					if (local27 < 20) {
						local45 += arg4.anIntArray465[local27];
						local55 += arg4.anIntArray455[local27];
					}
					if (arg4.anIntArray461[local27] > 0 && (local45 + 32 > arg0 && local45 < arg2 && arg3 < local55 + 32 && arg6 > local55 || Static43.aClass163_4 == arg4 && local27 == Static35.anInt870)) {
						if (local27 < local23) {
							local23 = local27;
						}
						if (local27 > local25) {
							local25 = local27;
						}
					}
					local27++;
				}
			}
			Static39.method794(local25, local23, Static217.aClass105_5, arg4);
		} else if (arg4.anInt4934 == 5 && arg4.anInt4924 != -1) {
			Static318.method5454(Static217.aClass105_5, arg4);
		}
	}

	@OriginalMember(owner = "client!so", name = "c", descriptor = "(IB)V")
	public static void method5004(@OriginalArg(0) int arg0) {
		@Pc(12) Class1_Sub2_Sub15 local12 = Static17.method307(11, arg0);
		local12.method4782();
	}

	@OriginalMember(owner = "client!so", name = "a", descriptor = "(II)Lclient!rk;")
	public static Class1_Sub2_Sub14 method5005(@OriginalArg(0) int arg0) {
		@Pc(10) Class1_Sub2_Sub14 local10 = (Class1_Sub2_Sub14) Static145.aClass88_6.method1652((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static123.aClass134_117.method3009(arg0, 5);
		local10 = new Class1_Sub2_Sub14();
		if (local20 != null) {
			local10.method4761(new Class1_Sub21(local20));
		}
		Static145.aClass88_6.method1651((long) arg0, local10);
		return local10;
	}
}
