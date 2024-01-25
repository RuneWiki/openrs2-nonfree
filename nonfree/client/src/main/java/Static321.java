import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!maa", name = "e", descriptor = "Lclient!vfa;")
	public static Class347 aClass347_2;

	@OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
	public static int anInt5973;

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILclient!r;BI)V")
	public static void method4969(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static350.anInt6290 == 0 || Static222.anInt4180 == 0) {
			return;
		}
		arg1.la(Static545.anInt8879, Static274.anInt4965, Static350.anInt6290, Static222.anInt4180);
		arg1.da(Static533.anInt9218, Static99.anInt2049, Static350.anInt6290, Static222.anInt4180);
		@Pc(38) Class68 local38 = arg1.method6258();
		local38.na(Static386.anInt6800, Static177.anInt3716, Static89.anInt8690, Static551.anInt8941, Static171.anInt9265, Static350.anInt6285);
		arg1.method6217(local38);
		@Pc(58) int local58;
		@Pc(67) int local67;
		@Pc(76) int local76;
		@Pc(79) int local79;
		@Pc(87) int local87;
		@Pc(95) int local95;
		@Pc(128) int[] local128;
		@Pc(142) int local142;
		@Pc(150) int local150;
		@Pc(159) int local159;
		@Pc(172) int local172;
		if (Static569.aClass67Array8 != null) {
			@Pc(53) int local53 = -1;
			@Pc(55) int local55 = -1;
			local58 = arg1.BA();
			local67 = (arg0 - Static545.anInt8879) * local58 / Static350.anInt6290;
			local76 = local58 * (arg2 - Static274.anInt4965) / Static222.anInt4180;
			local79 = arg1.U();
			local87 = local79 * (arg0 - Static545.anInt8879) / Static350.anInt6290;
			local95 = (arg2 - Static274.anInt4965) * local79 / Static222.anInt4180;
			@Pc(110) int[] local110 = new int[] { local67, local76, local58 };
			local38.YA(local110);
			local128 = new int[] { local87, local95, local79 };
			local38.YA(local128);
			@Pc(133) float local133 = 0.0F;
			local142 = local128[0] - local110[0];
			local150 = local128[1] - local110[1];
			local159 = local128[2] - local110[2];
			while (local133 < 1.0F) {
				local172 = (int) ((float) local110[0] + local133 * (float) local142);
				@Pc(176) int local176 = local172 >> 9;
				@Pc(187) int local187 = (int) ((float) local159 * local133 + (float) local110[2]);
				@Pc(191) int local191 = local187 >> 9;
				if (local176 > 0 && local191 > 0 && Static188.anInt3850 > local176 && Static49.anInt1174 > local191) {
					@Pc(210) int local210 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112;
					if (local210 < 3 && (Static521.aByteArrayArrayArray45[1][local176][local191] & 0x2) != 0) {
						local210++;
					}
					if ((float) Static569.aClass67Array8[local210].method6711(local187, local172) < local133 * (float) local150 + (float) local110[1]) {
						local53 = local172 + (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6165() - 1 << 8) >> 9;
						local55 = (Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.method6165() - 1 << 8) + local187 >> 9;
						break;
					}
				}
				local133 = (float) ((double) local133 + 0.01D);
			}
			if (local53 != -1 && local55 != -1) {
				if (Static25.aBoolean32 && (Static242.anInt4524 & 0x40) != 0) {
					@Pc(341) Class196 local341 = Static217.method3485(Static514.anInt406, Static428.anInt7337);
					if (local341 == null) {
						Static566.method7699();
					} else {
						Static304.method4554(local53, false, local55, -1, true, Static540.anInt8826, 0L, " ->", 30, Static271.aString38);
					}
				} else {
					if (Static328.aClass284_2 == Static404.aClass284_3) {
						Static304.method4554(local53, false, local55, -1, true, -1, 0L, "", 21, Static290.aClass198_29.method4365(Static52.anInt1264));
					}
					Static304.method4554(local53, false, local55, -1, true, Static233.anInt4344, 0L, "", 10, Static320.aString49);
				}
			}
		}
		@Pc(369) Class109 local369 = Static380.aClass109_7;
		for (@Pc(374) Class6_Sub5 local374 = (Class6_Sub5) local369.method2314(); local374 != null; local374 = (Class6_Sub5) local369.method2312()) {
			if ((Static158.aBoolean255 || Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 == local374.aClass6_Sub1_1.aByte112) && local374.method5655(arg1, arg2, arg0)) {
				if (local374.aClass6_Sub1_1 instanceof Class6_Sub1_Sub1) {
					local58 = ((Class6_Sub1_Sub1) local374.aClass6_Sub1_1).aShort85;
					local67 = ((Class6_Sub1_Sub1) local374.aClass6_Sub1_1).aShort83;
				} else {
					local67 = local374.aClass6_Sub1_1.anInt8764 >> 9;
					local58 = local374.aClass6_Sub1_1.anInt8761 >> 9;
				}
				@Pc(503) int local503;
				@Pc(623) int local623;
				if (local374.aClass6_Sub1_1 instanceof Class6_Sub1_Sub1_Sub1_Sub2) {
					@Pc(437) Class6_Sub1_Sub1_Sub1_Sub2 local437 = (Class6_Sub1_Sub1_Sub1_Sub2) local374.aClass6_Sub1_1;
					local79 = local437.method6165();
					if ((local79 & 0x1) == 0 && (local437.anInt8761 & 0x1FF) == 0 && (local437.anInt8764 & 0x1FF) == 0 || (local79 & 0x1) == 1 && (local437.anInt8761 & 0x1FF) == 256 && (local437.anInt8764 & 0x1FF) == 256) {
						local87 = local437.anInt8761 - (local437.method6165() - 1 << 8);
						local95 = local437.anInt8764 - (local437.method6165() - 1 << 8);
						for (local503 = 0; local503 < Static416.anInt7186; local503++) {
							@Pc(514) Class2_Sub32 local514 = (Class2_Sub32) Static544.aClass162_40.method3519((long) Static169.anIntArray198[local503]);
							if (local514 != null) {
								@Pc(519) Class6_Sub1_Sub1_Sub1_Sub1 local519 = local514.aClass6_Sub1_Sub1_Sub1_Sub1_1;
								if (local519.anInt7366 != Static412.anInt575 && local519.aBoolean570) {
									local142 = local519.anInt8761 - (local519.aClass86_1.anInt2152 - 1 << 8);
									local150 = local519.anInt8764 - (local519.aClass86_1.anInt2152 - 1 << 8);
									if (local142 >= local87 && local519.aClass86_1.anInt2152 <= local437.method6165() - (local142 - local87 >> 9) && local150 >= local95 && local519.aClass86_1.anInt2152 <= local437.method6165() - (local150 - local95 >> 9)) {
										Static114.method1697(local519, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 != local374.aClass6_Sub1_1.aByte112);
										local519.anInt7366 = Static412.anInt575;
									}
								}
							}
						}
						local623 = Static376.anInt6647;
						@Pc(625) int[] local625 = Static557.anIntArray665;
						for (local142 = 0; local142 < local623; local142++) {
							@Pc(635) Class6_Sub1_Sub1_Sub1_Sub2 local635 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local625[local142]];
							if (local635 != null && Static412.anInt575 != local635.anInt7366 && local635 != local437 && local635.aBoolean570) {
								local159 = local635.anInt8761 - (local635.method6165() - 1 << 8);
								local172 = local635.anInt8764 - (local635.method6165() - 1 << 8);
								if (local159 >= local87 && local635.method6165() <= local437.method6165() - (local159 - local87 >> 9) && local172 >= local95 && local635.method6165() <= local437.method6165() - (local172 - local95 >> 9)) {
									Static53.method920(local374.aClass6_Sub1_1.aByte112 != Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112, local635);
									local635.anInt7366 = Static412.anInt575;
								}
							}
						}
					}
					if (Static412.anInt575 == local437.anInt7366) {
						continue;
					}
					Static53.method920(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 != local374.aClass6_Sub1_1.aByte112, local437);
					local437.anInt7366 = Static412.anInt575;
				}
				@Pc(887) int local887;
				if (local374.aClass6_Sub1_1 instanceof Class6_Sub1_Sub1_Sub1_Sub1) {
					@Pc(778) Class6_Sub1_Sub1_Sub1_Sub1 local778 = (Class6_Sub1_Sub1_Sub1_Sub1) local374.aClass6_Sub1_1;
					if (local778.aClass86_1 != null) {
						if ((local778.aClass86_1.anInt2152 & 0x1) == 0 && (local778.anInt8761 & 0x1FF) == 0 && (local778.anInt8764 & 0x1FF) == 0 || (local778.aClass86_1.anInt2152 & 0x1) == 1 && (local778.anInt8761 & 0x1FF) == 256 && (local778.anInt8764 & 0x1FF) == 256) {
							local79 = local778.anInt8761 - (local778.aClass86_1.anInt2152 - 1 << 8);
							local87 = local778.anInt8764 - (local778.aClass86_1.anInt2152 - 1 << 8);
							for (local95 = 0; local95 < Static416.anInt7186; local95++) {
								@Pc(858) Class2_Sub32 local858 = (Class2_Sub32) Static544.aClass162_40.method3519((long) Static169.anIntArray198[local95]);
								if (local858 != null) {
									@Pc(863) Class6_Sub1_Sub1_Sub1_Sub1 local863 = local858.aClass6_Sub1_Sub1_Sub1_Sub1_1;
									if (Static412.anInt575 != local863.anInt7366 && local863 != local778 && local863.aBoolean570) {
										local887 = local863.anInt8761 - (local863.aClass86_1.anInt2152 - 1 << 8);
										local142 = local863.anInt8764 - (local863.aClass86_1.anInt2152 - 1 << 8);
										if (local79 <= local887 && local778.aClass86_1.anInt2152 - (local887 - local79 >> 9) >= local863.aClass86_1.anInt2152 && local87 <= local142 && local863.aClass86_1.anInt2152 <= local778.aClass86_1.anInt2152 - (local142 - local87 >> 9)) {
											Static114.method1697(local863, local374.aClass6_Sub1_1.aByte112 != Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112);
											local863.anInt7366 = Static412.anInt575;
										}
									}
								}
							}
							local503 = Static376.anInt6647;
							local128 = Static557.anIntArray665;
							for (local887 = 0; local887 < local503; local887++) {
								@Pc(984) Class6_Sub1_Sub1_Sub1_Sub2 local984 = Static136.aClass6_Sub1_Sub1_Sub1_Sub2Array1[local128[local887]];
								if (local984 != null && local984.anInt7366 != Static412.anInt575 && local984.aBoolean570) {
									local150 = local984.anInt8761 - (local984.method6165() - 1 << 8);
									local159 = local984.anInt8764 - (local984.method6165() - 1 << 8);
									if (local79 <= local150 && local984.method6165() <= local778.aClass86_1.anInt2152 - (local150 - local79 >> 9) && local159 >= local87 && local984.method6165() <= local778.aClass86_1.anInt2152 - (local159 - local87 >> 9)) {
										Static53.method920(Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 != local374.aClass6_Sub1_1.aByte112, local984);
										local984.anInt7366 = Static412.anInt575;
									}
								}
							}
						}
						if (Static412.anInt575 == local778.anInt7366) {
							continue;
						}
						Static114.method1697(local778, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 != local374.aClass6_Sub1_1.aByte112);
						local778.anInt7366 = Static412.anInt575;
					}
				}
				if (local374.aClass6_Sub1_1 instanceof Class6_Sub1_Sub4_Sub1) {
					local76 = Static35.anInt906 + local58;
					local79 = local67 + Static130.anInt5246;
					@Pc(1138) Class2_Sub40 local1138 = (Class2_Sub40) Static261.aClass162_35.method3519((long) (local76 | local79 << 14 | local374.aClass6_Sub1_1.aByte112 << 28));
					if (local1138 != null) {
						for (@Pc(1146) Class2_Sub18 local1146 = (Class2_Sub18) local1138.aClass8_57.method221(); local1146 != null; local1146 = (Class2_Sub18) local1138.aClass8_57.method216()) {
							@Pc(1154) Class339 local1154 = Static296.aClass218_1.method5067(local1146.anInt3007);
							if (Static25.aBoolean32 && Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 == local374.aClass6_Sub1_1.aByte112) {
								@Pc(1173) Class352 local1173 = Static371.anInt6556 == -1 ? null : Static241.aClass82_1.method1498(Static371.anInt6556);
								if ((Static242.anInt4524 & 0x1) != 0 && (local1173 == null || local1154.method7471(Static371.anInt6556, local1173.anInt9310) != local1173.anInt9310)) {
									Static304.method4554(local58, false, local67, -1, true, Static540.anInt8826, (long) local1146.anInt3007, Static12.aString4 + " -> <col=ff9040>" + local1154.aString97, 48, Static271.aString38);
								}
							}
							if (local374.aClass6_Sub1_1.aByte112 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112) {
								@Pc(1232) String[] local1232 = local1154.aStringArray169;
								for (local887 = 4; local887 >= 0; local887--) {
									if (local1232 != null && local1232[local887] != null) {
										@Pc(1244) byte local1244 = 0;
										local150 = Static261.anInt8058;
										if (local887 == 0) {
											local1244 = 25;
										}
										if (local887 == 1) {
											local1244 = 11;
										}
										if (local887 == 2) {
											local1244 = 6;
										}
										if (local887 == 3) {
											local1244 = 46;
										}
										if (local887 == 4) {
											local1244 = 16;
										}
										if (local887 == local1154.anInt9003) {
											local150 = local1154.anInt8943;
										}
										if (local1154.anInt8987 == local887) {
											local150 = local1154.anInt8983;
										}
										Static304.method4554(local58, false, local67, -1, true, local150, (long) local1146.anInt3007, "<col=ff9040>" + local1154.aString97, local1244, local1232[local887]);
									}
								}
							}
							Static304.method4554(local58, local374.aClass6_Sub1_1.aByte112 != Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112, local67, -1, true, Static338.anInt6209, (long) local1146.anInt3007, "<col=ff9040>" + local1154.aString97, 1004, Static290.aClass198_24.method4365(Static52.anInt1264));
						}
					}
				}
				if (local374.aClass6_Sub1_1 instanceof Interface24) {
					@Pc(1379) Interface24 local1379 = (Interface24) local374.aClass6_Sub1_1;
					@Pc(1386) Class32 local1386 = Static541.aClass97_4.method1794(local1379.method7337());
					if (local1386.anIntArray50 != null) {
						local1386 = local1386.method552(Static70.aClass78_1);
					}
					if (local1386 != null) {
						if (Static25.aBoolean32 && local374.aClass6_Sub1_1.aByte112 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112) {
							@Pc(1417) Class352 local1417 = Static371.anInt6556 == -1 ? null : Static241.aClass82_1.method1498(Static371.anInt6556);
							if ((Static242.anInt4524 & 0x4) != 0 && (local1417 == null || local1386.method548(Static371.anInt6556, local1417.anInt9310) != local1417.anInt9310)) {
								Static304.method4554(local58, false, local67, -1, true, Static540.anInt8826, Static319.method4948(local67, local58, local1379), Static12.aString4 + " -> <col=00ffff>" + local1386.aString5, 19, Static271.aString38);
							}
						}
						if (local374.aClass6_Sub1_1.aByte112 == Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112) {
							@Pc(1480) String[] local1480 = local1386.aStringArray10;
							if (local1480 != null) {
								for (local95 = 4; local95 >= 0; local95--) {
									if (local1480[local95] != null) {
										@Pc(1492) short local1492 = 0;
										if (local95 == 0) {
											local1492 = 22;
										}
										local623 = Static261.anInt8058;
										if (local95 == 1) {
											local1492 = 47;
										}
										if (local95 == 2) {
											local1492 = 18;
										}
										if (local95 == 3) {
											local1492 = 51;
										}
										if (local95 == local1386.anInt819) {
											local623 = local1386.anInt787;
										}
										if (local95 == 4) {
											local1492 = 1009;
										}
										if (local95 == local1386.anInt791) {
											local623 = local1386.anInt769;
										}
										Static304.method4554(local58, false, local67, -1, true, local623, Static319.method4948(local67, local58, local1379), "<col=00ffff>" + local1386.aString5, local1492, local1480[local95]);
									}
								}
							}
						}
						Static304.method4554(local58, Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.aByte112 != local374.aClass6_Sub1_1.aByte112, local67, -1, true, Static338.anInt6209, (long) local1386.anInt773, "<col=00ffff>" + local1386.aString5, 1008, Static290.aClass198_24.method4365(Static52.anInt1264));
					}
				}
			}
		}
	}
}
