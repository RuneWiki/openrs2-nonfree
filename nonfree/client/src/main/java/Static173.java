import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "[Z")
	public static final boolean[] aBooleanArray16 = new boolean[100];

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V")
	public static void method3102() {
		Static339.anInt5691 = 0;
		Static245.anInt4187 = 0;
		Static170.anInt3085 = 0;
		Static66.anInt1270 = 0;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(ILclient!qa;II)V")
	public static void method3104(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static176.anInt3298 == 0 || Static312.anInt5314 == 0) {
			return;
		}
		arg1.b(Static113.anInt6159, Static57.anInt1113, Static176.anInt3298, Static312.anInt5314);
		arg1.w(Static207.anInt3659, Static186.anInt3413, Static176.anInt3298, Static312.anInt5314);
		@Pc(37) Class11 local37 = arg1.method5975();
		local37.IA(Static131.anInt2360, Static49.anInt878, Static433.anInt7250, Static24.anInt2904, Static146.anInt2676, Static304.anInt6522);
		arg1.method6012(local37);
		@Pc(57) int local57;
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(77) int local77;
		@Pc(86) int local86;
		@Pc(95) int local95;
		@Pc(110) int[] local110;
		@Pc(142) int local142;
		@Pc(151) int local151;
		if (Static182.aClass55Array2 != null) {
			@Pc(52) int local52 = -1;
			@Pc(54) int local54 = -1;
			local57 = arg1.na();
			local66 = (arg0 - Static113.anInt6159) * local57 / Static176.anInt3298;
			local74 = (arg2 - Static57.anInt1113) * local57 / Static312.anInt5314;
			local77 = arg1.sa();
			local86 = (arg0 - Static113.anInt6159) * local77 / Static176.anInt3298;
			local95 = (arg2 - Static57.anInt1113) * local77 / Static312.anInt5314;
			local110 = new int[] { local66, local74, local57 };
			local37.M(local110);
			@Pc(128) int[] local128 = new int[] { local86, local95, local77 };
			local37.M(local128);
			@Pc(133) float local133 = 0.0F;
			local142 = local128[0] - local110[0];
			local151 = local128[1] - local110[1];
			@Pc(160) int local160 = local128[2] - local110[2];
			while (local133 < 1.0F) {
				@Pc(173) int local173 = (int) (local133 * (float) local142 + (float) local110[0]);
				@Pc(177) int local177 = local173 >> 7;
				@Pc(188) int local188 = (int) ((float) local160 * local133 + (float) local110[2]);
				@Pc(192) int local192 = local188 >> 7;
				if (local177 > 0 && local192 > 0 && Static373.anInt6324 > local177 && local192 < Static291.anInt5062) {
					@Pc(219) int local219 = Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101;
					if (local219 < 3 && (Static360.aByteArrayArrayArray16[1][local177][local192] & 0x2) != 0) {
						local219++;
					}
					if ((float) Static182.aClass55Array2[local219].R(local173, local188) < (float) local151 * local133 + (float) local110[1]) {
						local52 = (Static203.aClass1_Sub2_Sub6_Sub2_1.method6204() - 1 << 6) + local173 >> 7;
						local54 = local188 + (Static203.aClass1_Sub2_Sub6_Sub2_1.method6204() - 1 << 6) >> 7;
						break;
					}
				}
				local133 = (float) ((double) local133 + 0.01D);
			}
			if (local52 != -1 && local54 != -1) {
				if (Static73.aBoolean88 && (Static385.anInt6504 & 0x40) != 0) {
					@Pc(341) Class82 local341 = Static360.method5048(Static102.anInt1846, Static327.anInt5460);
					if (local341 == null) {
						Static178.method2853();
					} else {
						Static359.method5021(false, 50, local54, true, " ->", -1, Static336.anInt5620, Static320.aString12, 0L, local52);
					}
				} else {
					if (Static427.aClass113_4 == Static154.aClass113_3) {
						Static359.method5021(false, 9, local54, true, "", -1, -1, Static386.aClass174_185.method4208(Static300.anInt5192), 0L, local52);
					}
					Static359.method5021(false, 8, local54, true, "", -1, Static413.anInt6976, Static225.aString47, 0L, local52);
				}
			}
		}
		@Pc(361) Class194 local361 = Static74.aClass194_1;
		for (@Pc(366) Class23_Sub5 local366 = (Class23_Sub5) local361.method4577(); local366 != null; local366 = (Class23_Sub5) local361.method4580()) {
			if ((Static418.aBoolean477 || Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 == local366.anInt5282) && local366.method4354(arg2, arg0, arg1)) {
				@Pc(504) int local504;
				@Pc(516) int local516;
				if (local366.aClass1_1 instanceof Class1_Sub2_Sub6_Sub2) {
					@Pc(394) Class1_Sub2_Sub6_Sub2 local394 = (Class1_Sub2_Sub6_Sub2) local366.aClass1_1;
					local66 = local394.method6204();
					if ((local66 & 0x1) == 0 && (local394.anInt7560 & 0x7F) == 0 && (local394.anInt7557 & 0x7F) == 0 || (local66 & 0x1) == 1 && (local394.anInt7560 & 0x7F) == 64 && (local394.anInt7557 & 0x7F) == 64) {
						local74 = local394.anInt7560 - (local394.method6204() - 1 << 6);
						local77 = local394.anInt7557 - (local394.method6204() - 1 << 6);
						for (local86 = 0; local86 < Static379.anInt6398; local86++) {
							@Pc(474) Class3_Sub40 local474 = (Class3_Sub40) Static63.aClass140_37.method3490((long) Static198.anIntArray225[local86]);
							if (local474 != null) {
								@Pc(479) Class1_Sub2_Sub6_Sub1 local479 = local474.aClass1_Sub2_Sub6_Sub1_2;
								if (Static172.anInt3107 != local479.anInt7632 && local479.aBoolean510) {
									local504 = local479.anInt7560 - (local479.aClass158_1.anInt4454 - 1 << 6);
									local516 = local479.anInt7557 - (local479.aClass158_1.anInt4454 - 1 << 6);
									if (local504 >= local74 && local479.aClass158_1.anInt4454 <= local394.method6204() - (local504 - local74 >> 7) && local516 >= local77 && local479.aClass158_1.anInt4454 <= local394.method6204() - (local516 - local77 >> 7)) {
										Static26.method473(local479, local366.anInt5282 != Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101);
										local479.anInt7632 = Static172.anInt3107;
									}
								}
							}
						}
						local95 = Static271.anInt4534;
						local110 = Static215.anIntArray267;
						for (local504 = 0; local504 < local95; local504++) {
							@Pc(592) Class1_Sub2_Sub6_Sub2 local592 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local110[local504]];
							if (local592 != null && local592.anInt7632 != Static172.anInt3107 && local394 != local592 && local592.aBoolean510) {
								local142 = local592.anInt7560 - (local592.method6204() - 1 << 6);
								local151 = local592.anInt7557 - (local592.method6204() - 1 << 6);
								if (local74 <= local142 && local592.method6204() <= local394.method6204() - (local142 - local74 >> 7) && local151 >= local77 && local592.method6204() <= local394.method6204() - (local151 - local77 >> 7)) {
									Static355.method3688(Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 != local366.anInt5282, local592);
									local592.anInt7632 = Static172.anInt3107;
								}
							}
						}
					}
					if (Static172.anInt3107 == local394.anInt7632) {
						continue;
					}
					Static355.method3688(local366.anInt5282 != Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101, local394);
					local394.anInt7632 = Static172.anInt3107;
				}
				@Pc(839) int local839;
				if (local366.aClass1_1 instanceof Class1_Sub2_Sub6_Sub1) {
					@Pc(724) Class1_Sub2_Sub6_Sub1 local724 = (Class1_Sub2_Sub6_Sub1) local366.aClass1_1;
					if (local724.aClass158_1 != null) {
						if ((local724.aClass158_1.anInt4454 & 0x1) == 0 && (local724.anInt7560 & 0x7F) == 0 && (local724.anInt7557 & 0x7F) == 0 || (local724.aClass158_1.anInt4454 & 0x1) == 1 && (local724.anInt7560 & 0x7F) == 64 && (local724.anInt7557 & 0x7F) == 64) {
							local66 = local724.anInt7560 - (local724.aClass158_1.anInt4454 - 1 << 6);
							local74 = local724.anInt7557 - (local724.aClass158_1.anInt4454 - 1 << 6);
							for (local77 = 0; local77 < Static379.anInt6398; local77++) {
								@Pc(810) Class3_Sub40 local810 = (Class3_Sub40) Static63.aClass140_37.method3490((long) Static198.anIntArray225[local77]);
								if (local810 != null) {
									@Pc(815) Class1_Sub2_Sub6_Sub1 local815 = local810.aClass1_Sub2_Sub6_Sub1_2;
									if (Static172.anInt3107 != local815.anInt7632 && local724 != local815 && local815.aBoolean510) {
										local839 = local815.anInt7560 - (local815.aClass158_1.anInt4454 - 1 << 6);
										local504 = local815.anInt7557 - (local815.aClass158_1.anInt4454 - 1 << 6);
										if (local66 <= local839 && local724.aClass158_1.anInt4454 - (local839 - local66 >> 7) >= local815.aClass158_1.anInt4454 && local74 <= local504 && local815.aClass158_1.anInt4454 <= local724.aClass158_1.anInt4454 - (local504 - local74 >> 7)) {
											Static26.method473(local815, Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 != local366.anInt5282);
											local815.anInt7632 = Static172.anInt3107;
										}
									}
								}
							}
							local86 = Static271.anInt4534;
							@Pc(920) int[] local920 = Static215.anIntArray267;
							for (local839 = 0; local839 < local86; local839++) {
								@Pc(930) Class1_Sub2_Sub6_Sub2 local930 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local920[local839]];
								if (local930 != null && local930.anInt7632 != Static172.anInt3107 && local930.aBoolean510) {
									local516 = local930.anInt7560 - (local930.method6204() - 1 << 6);
									local142 = local930.anInt7557 - (local930.method6204() - 1 << 6);
									if (local66 <= local516 && local930.method6204() <= local724.aClass158_1.anInt4454 - (local516 - local66 >> 7) && local74 <= local142 && local930.method6204() <= local724.aClass158_1.anInt4454 - (local142 - local74 >> 7)) {
										Static355.method3688(Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 != local366.anInt5282, local930);
										local930.anInt7632 = Static172.anInt3107;
									}
								}
							}
						}
						if (local724.anInt7632 == Static172.anInt3107) {
							continue;
						}
						Static26.method473(local724, local366.anInt5282 != Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101);
						local724.anInt7632 = Static172.anInt3107;
					}
				}
				if (local366.aClass1_1 instanceof Class1_Sub5_Sub1) {
					local57 = Static59.anInt1127 + local366.anInt5279;
					local66 = local366.anInt5281 + Static49.anInt873;
					@Pc(1082) Class3_Sub13 local1082 = (Class3_Sub13) Static242.aClass140_26.method3490((long) (local57 | local66 << 14 | local366.anInt5282 << 28));
					if (local1082 != null) {
						for (@Pc(1090) Class3_Sub9 local1090 = (Class3_Sub9) local1082.aClass193_19.method4531(); local1090 != null; local1090 = (Class3_Sub9) local1082.aClass193_19.method4532()) {
							@Pc(1098) Class209 local1098 = Static158.aClass272_1.method6283(local1090.anInt627);
							if (!Static73.aBoolean88) {
								if (local366.anInt5282 == Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101) {
									@Pc(1182) String[] local1182 = local1098.aStringArray36;
									for (local839 = 4; local839 >= 0; local839--) {
										if (local1182 != null && local1182[local839] != null) {
											@Pc(1194) byte local1194 = 0;
											if (local839 == 0) {
												local1194 = 17;
											}
											local516 = Static387.anInt6515;
											if (local839 == 1) {
												local1194 = 11;
											}
											if (local839 == 2) {
												local1194 = 48;
											}
											if (local839 == 3) {
												local1194 = 30;
											}
											if (local839 == local1098.anInt6062) {
												local516 = local1098.anInt6039;
											}
											if (local839 == 4) {
												local1194 = 5;
											}
											if (local1098.anInt6048 == local839) {
												local516 = local1098.anInt6025;
											}
											Static359.method5021(false, local1194, local366.anInt5281, true, "<col=ff9040>" + local1098.lb, -1, local516, local1182[local839], (long) local1090.anInt627, local366.anInt5279);
										}
									}
								}
								Static359.method5021(Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 != local366.anInt5282, 1003, local366.anInt5281, true, "<col=ff9040>" + local1098.lb, -1, Static172.anInt3102, Static73.aClass174_47.method4208(Static300.anInt5192), (long) local1090.anInt627, local366.anInt5279);
							} else if (Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 == local366.anInt5282) {
								@Pc(1116) Class32 local1116 = Static116.anInt2044 == -1 ? null : Static70.aClass15_1.method323(Static116.anInt2044);
								if ((Static385.anInt6504 & 0x1) != 0 && (local1116 == null || local1098.method4987(Static116.anInt2044, local1116.anInt813) != local1116.anInt813)) {
									Static359.method5021(false, 47, local366.anInt5281, true, Static296.aString56 + " -> <col=ff9040>" + local1098.lb, -1, Static336.anInt5620, Static320.aString12, (long) local1090.anInt627, local366.anInt5279);
								}
							}
						}
					}
				}
				if (local366.aClass1_1 instanceof Interface5) {
					@Pc(1335) Interface5 local1335 = (Interface5) local366.aClass1_1;
					@Pc(1342) Class31 local1342 = Static9.aClass149_1.method3573(local1335.method6263());
					if (local1342.anIntArray44 != null) {
						local1342 = local1342.method863(Static119.aClass47_1);
					}
					if (local1342 != null) {
						if (!Static73.aBoolean88) {
							if (Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 == local366.anInt5282) {
								@Pc(1440) String[] local1440 = local1342.aStringArray6;
								if (local1440 != null) {
									for (local77 = 4; local77 >= 0; local77--) {
										if (local1440[local77] != null) {
											@Pc(1452) short local1452 = 0;
											if (local77 == 0) {
												local1452 = 51;
											}
											local95 = Static387.anInt6515;
											if (local77 == 1) {
												local1452 = 12;
											}
											if (local77 == 2) {
												local1452 = 18;
											}
											if (local77 == 3) {
												local1452 = 13;
											}
											if (local77 == 4) {
												local1452 = 1012;
											}
											if (local77 == local1342.anInt802) {
												local95 = local1342.anInt778;
											}
											if (local1342.anInt797 == local77) {
												local95 = local1342.anInt803;
											}
											Static359.method5021(false, local1452, local366.anInt5281, true, "<col=00ffff>" + local1342.aString4, -1, local95, local1440[local77], Static371.method5202(local366.anInt5281, local366.anInt5279, local1335), local366.anInt5279);
										}
									}
								}
							}
							Static359.method5021(Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101 != local366.anInt5282, 1007, local366.anInt5281, true, "<col=00ffff>" + local1342.aString4, -1, Static172.anInt3102, Static73.aClass174_47.method4208(Static300.anInt5192), (long) local1342.anInt791, local366.anInt5279);
						} else if (local366.anInt5282 == Static203.aClass1_Sub2_Sub6_Sub2_1.aByte101) {
							@Pc(1373) Class32 local1373 = Static116.anInt2044 == -1 ? null : Static70.aClass15_1.method323(Static116.anInt2044);
							if ((Static385.anInt6504 & 0x4) != 0 && (local1373 == null || local1342.method868(Static116.anInt2044, local1373.anInt813) != local1373.anInt813)) {
								Static359.method5021(false, 25, local366.anInt5281, true, Static296.aString56 + " -> <col=00ffff>" + local1342.aString4, -1, Static336.anInt5620, Static320.aString12, Static371.method5202(local366.anInt5281, local366.anInt5279, local1335), local366.anInt5279);
							}
						}
					}
				}
			}
		}
	}
}
