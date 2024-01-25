import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!iha", name = "H", descriptor = "Lclient!jb;")
	public static final Class171 aClass171_58 = new Class171(24, -2);

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "(I)V")
	public static void method3803() {
		if (Static336.aClass3_Sub41_18.aClass14_Sub19_2.method5938() != 2) {
			return;
		}
		@Pc(21) byte local21 = (byte) (Static494.anInt7829 - 4 & 0xFF);
		@Pc(25) int local25 = Static494.anInt7829 % Static98.anInt361;
		@Pc(31) int local31;
		for (@Pc(27) int local27 = 0; local27 < 4; local27++) {
			for (local31 = 0; local31 < Static438.anInt7120; local31++) {
				Static366.aByteArrayArrayArray14[local27][local25][local31] = local21;
			}
		}
		if (Static570.anInt9192 == 3) {
			return;
		}
		for (local31 = 0; local31 < 2; local31++) {
			Static419.anIntArray363[local31] = -1000000;
			Static652.anIntArray579[local31] = 1000000;
			Static464.anIntArray403[local31] = 0;
			Static58.anIntArray511[local31] = 1000000;
			Static492.anIntArray42[local31] = 0;
		}
		@Pc(97) int local97 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9614;
		@Pc(100) int local100 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.anInt9619;
		@Pc(113) int local113;
		if (Static451.anInt7263 != 1 && Static351.anInt6038 == -1) {
			local113 = Static662.method8831(Static564.anInt9117, Static370.anInt6266, Static570.anInt9192);
			if (local113 - Static166.anInt3034 < 3200 && (Static315.aByteArrayArrayArray13[Static570.anInt9192][Static370.anInt6266 >> 9][Static564.anInt9117 >> 9] & 0x4) != 0) {
				Static319.method4594(Static564.anInt9117 >> 9, 1, false, Static254.aClass368ArrayArrayArray2, Static370.anInt6266 >> 9);
				return;
			}
			return;
		}
		if (Static451.anInt7263 != 1) {
			local100 = Static468.anInt7425;
			local97 = Static351.anInt6038;
		}
		if ((Static315.aByteArrayArrayArray13[Static570.anInt9192][local97 >> 9][local100 >> 9] & 0x4) != 0) {
			Static319.method4594(local100 >> 9, 0, false, Static254.aClass368ArrayArrayArray2, local97 >> 9);
		}
		if (Static655.anInt10676 >= 2560) {
			return;
		}
		local113 = Static370.anInt6266 >> 9;
		@Pc(198) int local198 = Static564.anInt9117 >> 9;
		@Pc(202) int local202 = local97 >> 9;
		@Pc(206) int local206 = local100 >> 9;
		@Pc(214) int local214;
		if (local202 <= local113) {
			local214 = local113 - local202;
		} else {
			local214 = local202 - local113;
		}
		@Pc(229) int local229;
		if (local198 >= local206) {
			local229 = local198 - local206;
		} else {
			local229 = local206 - local198;
		}
		if (local214 == 0 && local229 == 0 || -Static98.anInt361 >= local214 || Static98.anInt361 <= local214 || local229 <= -Static438.anInt7120 || local229 >= Static438.anInt7120) {
			Static456.method6140("RC: " + local113 + "," + local198 + " " + local202 + "," + local206 + " " + Static534.anInt8358 + "," + Static402.anInt6661, (Throwable) null);
			return;
		}
		@Pc(302) int local302;
		@Pc(304) int local304;
		if (local214 > local229) {
			local302 = local229 * 65536 / local214;
			local304 = 32768;
			while (local202 != local113) {
				if (local202 > local113) {
					local113++;
				} else if (local113 > local202) {
					local113--;
				}
				if ((Static315.aByteArrayArrayArray13[Static570.anInt9192][local113][local198] & 0x4) != 0) {
					Static319.method4594(local198, 1, false, Static254.aClass368ArrayArrayArray2, local113);
					return;
				}
				local304 += local302;
				if (local304 >= 65536) {
					if (local198 < local206) {
						local198++;
					} else if (local198 > local206) {
						local198--;
					}
					local304 -= 65536;
					if ((Static315.aByteArrayArrayArray13[Static570.anInt9192][local113][local198] & 0x4) != 0) {
						Static319.method4594(local198, 1, false, Static254.aClass368ArrayArrayArray2, local113);
						return;
					}
				}
			}
			return;
		}
		local302 = local214 * 65536 / local229;
		local304 = 32768;
		while (local206 != local198) {
			if (local206 > local198) {
				local198++;
			} else if (local198 > local206) {
				local198--;
			}
			if ((Static315.aByteArrayArrayArray13[Static570.anInt9192][local113][local198] & 0x4) != 0) {
				Static319.method4594(local198, 1, false, Static254.aClass368ArrayArrayArray2, local113);
				return;
			}
			local304 += local302;
			if (local304 >= 65536) {
				if (local202 > local113) {
					local113++;
				} else if (local113 > local202) {
					local113--;
				}
				local304 -= 65536;
				if ((Static315.aByteArrayArrayArray13[Static570.anInt9192][local113][local198] & 0x4) != 0) {
					Static319.method4594(local198, 1, false, Static254.aClass368ArrayArrayArray2, local113);
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IILclient!ha;I)V")
	public static void method3804(@OriginalArg(1) int arg0, @OriginalArg(2) Class95 arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || arg2 < 0 || Static596.anInt7098 == 0 || Static253.anInt4467 == 0) {
			return;
		}
		@Pc(31) Class17 local31;
		@Pc(42) int local42;
		@Pc(38) int local38;
		@Pc(50) int local50;
		@Pc(46) int local46;
		@Pc(57) int local57;
		@Pc(64) int local64;
		if (Static498.aBoolean757) {
			Static277.method4054(false);
			local31 = arg1.method7992();
			@Pc(34) int[] local34 = arg1.Y();
			local38 = local34[1];
			local42 = local34[0];
			local46 = local34[3];
			local50 = local34[2];
			local57 = arg0 + Static453.method6126(false);
			local64 = arg2 + Static400.method5534(false);
		} else {
			arg1.DA(Static600.anInt9807, Static317.anInt5305, Static596.anInt7098, Static253.anInt4467);
			local38 = Static317.anInt5305;
			local42 = Static600.anInt9807;
			local50 = Static596.anInt7098;
			local46 = Static253.anInt4467;
			arg1.KA(Static25.anInt621, Static392.anInt6521, Static596.anInt7098, Static253.anInt4467);
			local31 = arg1.method8063();
			local31.method6240(Static287.anInt4853, Static642.anInt10555, Static565.anInt9141, Static224.anInt3860, Static16.anInt10140, Static120.anInt2145);
			local57 = arg0;
			arg1.method8037(local31);
			local64 = arg2;
		}
		if (local50 == 0) {
			local50 = 1;
		}
		if (local46 == 0) {
			local46 = 1;
		}
		Static498.method9017(true);
		@Pc(142) int local142;
		@Pc(166) int local166;
		@Pc(154) int local154;
		@Pc(279) int local279;
		@Pc(287) int local287;
		@Pc(298) int local298;
		@Pc(309) int local309;
		@Pc(134) int local134;
		@Pc(356) int local356;
		if (Static556.aClass35Array2 != null && (!Static47.aBoolean59 || (Static344.anInt5895 & 0x40) != 0)) {
			local134 = -1;
			@Pc(136) int local136 = -1;
			@Pc(139) int local139 = arg1.i();
			local142 = arg1.XA();
			@Pc(155) int local155;
			@Pc(165) int local165;
			if (Static375.aBoolean532) {
				local155 = local154 = Static501.anInt7929 * (local64 - local38) / local46;
				local166 = local165 = (local57 - local42) * Static501.anInt7929 / local50;
			} else {
				local165 = (local57 - local42) * local142 / local50;
				local166 = local139 * (local57 - local42) / local50;
				local155 = local139 * (local64 - local38) / local46;
				local154 = (local64 - local38) * local142 / local46;
			}
			@Pc(218) int[] local218 = new int[] { local166, local155, local139 };
			local31.method6226(local218);
			@Pc(236) int[] local236 = new int[] { local165, local154, local142 };
			local31.method6226(local236);
			@Pc(267) float local267 = Static53.method1020((float) local236[0], 4, (float) local236[2], (float) local218[2], (float) local218[1], (float) local236[1], (float) local218[0]);
			if (local267 > 0.0F) {
				local279 = local236[0] - local218[0];
				local287 = local236[2] - local218[2];
				local298 = (int) ((float) local218[0] + local267 * (float) local279);
				local309 = (int) ((float) local218[2] + local267 * (float) local287);
				local134 = local298 + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866() - 1 << 8) >> 9;
				local136 = local309 + (Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.method7866() - 1 << 8) >> 9;
				@Pc(338) byte local338 = Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132;
				if (local338 < 3 && (Static315.aByteArrayArrayArray13[1][local298 >> 9][local309 >> 9] & 0x2) != 0) {
					local356 = local338 + 1;
				}
			}
			if (local134 != -1 && local136 != -1) {
				if (Static47.aBoolean59 && (Static344.anInt5895 & 0x40) != 0) {
					@Pc(426) Class265 local426 = Static212.method3145(Static376.anInt5867, Static284.anInt4811);
					if (local426 == null) {
						Static252.method3806();
					} else {
						Static390.method5454(-1, true, Static36.aString12, 0L, 3, local136, " ->", (long) (local136 | local134 << 0), true, local134, Static213.anInt3686, false);
					}
				} else {
					if (Static224.aBoolean266) {
						Static390.method5454(-1, true, Static114.aClass84_27.method1729(Static654.anInt10668), 0L, 9, local136, "", (long) (local134 << 0 | local136), true, local134, -1, false);
					}
					Static390.method5454(-1, true, Static344.aString76, 0L, 8, local136, "", (long) (local136 | local134 << 0), true, local134, Static69.anInt9578, false);
				}
			}
		}
		if (Static498.aBoolean757) {
			Static599.method6442();
		}
		for (local134 = 0; (Static498.aBoolean757 ? 2 : 1) > local134; local134++) {
			@Pc(467) boolean local467 = local134 == 0;
			@Pc(473) Class255 local473 = local467 ? Static305.aClass255_2 : Static185.aClass255_1;
			local142 = arg0;
			local166 = arg2;
			if (Static498.aBoolean757) {
				Static277.method4054(local467);
				local142 = arg0 + Static453.method6126(local467);
				local166 = arg2 + Static400.method5534(local467);
			}
			@Pc(497) Class317 local497 = local473.aClass317_7;
			for (@Pc(502) Class34_Sub8 local502 = (Class34_Sub8) local497.method6891(); local502 != null; local502 = (Class34_Sub8) local497.method6894()) {
				if ((Static170.aBoolean228 || local502.aClass34_Sub1_20.aByte132 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132) && local502.method6194(local142, local166, arg1)) {
					@Pc(537) int local537;
					if (local502.aClass34_Sub1_20 instanceof Class34_Sub1_Sub1) {
						local154 = ((Class34_Sub1_Sub1) local502.aClass34_Sub1_20).aShort98;
						local537 = ((Class34_Sub1_Sub1) local502.aClass34_Sub1_20).aShort99;
					} else {
						local154 = local502.aClass34_Sub1_20.anInt9614 >> 9;
						local537 = local502.aClass34_Sub1_20.anInt9619 >> 9;
					}
					@Pc(665) int local665;
					@Pc(676) int local676;
					@Pc(784) int local784;
					@Pc(563) int local563;
					if (local502.aClass34_Sub1_20 instanceof Class34_Sub1_Sub1_Sub2_Sub1) {
						@Pc(559) Class34_Sub1_Sub1_Sub2_Sub1 local559 = (Class34_Sub1_Sub1_Sub2_Sub1) local502.aClass34_Sub1_20;
						local563 = local559.method7866();
						if ((local563 & 0x1) == 0 && (local559.anInt9614 & 0x1FF) == 0 && (local559.anInt9619 & 0x1FF) == 0 || (local563 & 0x1) == 1 && (local559.anInt9614 & 0x1FF) == 256 && (local559.anInt9619 & 0x1FF) == 256) {
							local279 = local559.anInt9614 - (local559.method7866() - 1 << 8);
							local287 = local559.anInt9619 - (local559.method7866() - 1 << 8);
							for (local298 = 0; local298 < Static52.anInt1140; local298++) {
								@Pc(639) Class3_Sub52 local639 = (Class3_Sub52) Static105.aClass333_11.method7489((long) Static603.anIntArray537[local298]);
								if (local639 != null) {
									@Pc(644) Class34_Sub1_Sub1_Sub2_Sub2 local644 = local639.aClass34_Sub1_Sub1_Sub2_Sub2_2;
									if (local644.anInt9686 != Static122.anInt2190 && local644.aBoolean674) {
										local665 = local644.anInt9614 - (local644.aClass261_1.anInt6807 - 1 << 8);
										local676 = local644.anInt9619 - (local644.aClass261_1.anInt6807 - 1 << 8);
										if (local279 <= local665 && local644.aClass261_1.anInt6807 <= local559.method7866() - (local665 - local279 >> 9) && local287 <= local676 && local644.aClass261_1.anInt6807 <= local559.method7866() - (local676 - local287 >> 9)) {
											Static630.method8506(local644, local502.aClass34_Sub1_20.aByte132 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132);
											local644.anInt9686 = Static122.anInt2190;
										}
									}
								}
							}
							local309 = Static439.anInt7133;
							@Pc(744) int[] local744 = Static294.anIntArray593;
							for (local665 = 0; local665 < local309; local665++) {
								@Pc(754) Class34_Sub1_Sub1_Sub2_Sub1 local754 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local744[local665]];
								if (local754 != null && local754.anInt9686 != Static122.anInt2190 && local754 != local559 && local754.aBoolean674) {
									local784 = local754.anInt9614 - (local754.method7866() - 1 << 8);
									@Pc(798) int local798 = local754.anInt9619 - (local754.method7866() - 1 << 8);
									if (local279 <= local784 && local754.method7866() <= local559.method7866() - (local784 - local279 >> 9) && local798 >= local287 && local754.method7866() <= local559.method7866() - (local798 - local287 >> 9)) {
										Static503.method6582(local754, local502.aClass34_Sub1_20.aByte132 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132);
										local754.anInt9686 = Static122.anInt2190;
									}
								}
							}
						}
						if (local559.anInt9686 == Static122.anInt2190) {
							continue;
						}
						Static503.method6582(local559, local502.aClass34_Sub1_20.aByte132 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132);
						local559.anInt9686 = Static122.anInt2190;
					}
					if (local502.aClass34_Sub1_20 instanceof Class34_Sub1_Sub1_Sub2_Sub2) {
						@Pc(898) Class34_Sub1_Sub1_Sub2_Sub2 local898 = (Class34_Sub1_Sub1_Sub2_Sub2) local502.aClass34_Sub1_20;
						if (local898.aClass261_1 != null) {
							if ((local898.aClass261_1.anInt6807 & 0x1) == 0 && (local898.anInt9614 & 0x1FF) == 0 && (local898.anInt9619 & 0x1FF) == 0 || (local898.aClass261_1.anInt6807 & 0x1) == 1 && (local898.anInt9614 & 0x1FF) == 256 && (local898.anInt9619 & 0x1FF) == 256) {
								local563 = local898.anInt9614 - (local898.aClass261_1.anInt6807 - 1 << 8);
								local279 = local898.anInt9619 - (local898.aClass261_1.anInt6807 - 1 << 8);
								for (local287 = 0; local287 < Static52.anInt1140; local287++) {
									@Pc(982) Class3_Sub52 local982 = (Class3_Sub52) Static105.aClass333_11.method7489((long) Static603.anIntArray537[local287]);
									if (local982 != null) {
										@Pc(987) Class34_Sub1_Sub1_Sub2_Sub2 local987 = local982.aClass34_Sub1_Sub1_Sub2_Sub2_2;
										if (local987.anInt9686 != Static122.anInt2190 && local898 != local987 && local987.aBoolean674) {
											local356 = local987.anInt9614 - (local987.aClass261_1.anInt6807 - 1 << 8);
											local665 = local987.anInt9619 - (local987.aClass261_1.anInt6807 - 1 << 8);
											if (local356 >= local563 && local987.aClass261_1.anInt6807 <= local898.aClass261_1.anInt6807 - (local356 - local563 >> 9) && local279 <= local665 && local898.aClass261_1.anInt6807 - (local665 - local279 >> 9) >= local987.aClass261_1.anInt6807) {
												Static630.method8506(local987, local502.aClass34_Sub1_20.aByte132 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132);
												local987.anInt9686 = Static122.anInt2190;
											}
										}
									}
								}
								local298 = Static439.anInt7133;
								@Pc(1093) int[] local1093 = Static294.anIntArray593;
								for (local356 = 0; local356 < local298; local356++) {
									@Pc(1103) Class34_Sub1_Sub1_Sub2_Sub1 local1103 = Static506.aClass34_Sub1_Sub1_Sub2_Sub1Array1[local1093[local356]];
									if (local1103 != null && local1103.anInt9686 != Static122.anInt2190 && local1103.aBoolean674) {
										local676 = local1103.anInt9614 - (local1103.method7866() - 1 << 8);
										local784 = local1103.anInt9619 - (local1103.method7866() - 1 << 8);
										if (local563 <= local676 && local1103.method7866() <= local898.aClass261_1.anInt6807 - (local676 - local563 >> 9) && local279 <= local784 && local1103.method7866() <= local898.aClass261_1.anInt6807 - (local784 - local279 >> 9)) {
											Static503.method6582(local1103, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 != local502.aClass34_Sub1_20.aByte132);
											local1103.anInt9686 = Static122.anInt2190;
										}
									}
								}
							}
							if (Static122.anInt2190 == local898.anInt9686) {
								continue;
							}
							Static630.method8506(local898, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 != local502.aClass34_Sub1_20.aByte132);
							local898.anInt9686 = Static122.anInt2190;
						}
					}
					if (local502.aClass34_Sub1_20 instanceof Class34_Sub1_Sub4_Sub1) {
						@Pc(1247) int local1247 = local154 + Static534.anInt8358;
						local563 = local537 + Static402.anInt6661;
						@Pc(1270) Class3_Sub20 local1270 = (Class3_Sub20) Static462.aClass333_29.method7489((long) (local502.aClass34_Sub1_20.aByte132 << 28 | local563 << 14 | local1247));
						if (local1270 != null) {
							local287 = 0;
							for (@Pc(1280) Class3_Sub48 local1280 = (Class3_Sub48) local1270.aClass302_17.method6602(); local1280 != null; local1280 = (Class3_Sub48) local1270.aClass302_17.method6609()) {
								@Pc(1288) Class15 local1288 = Static117.aClass197_2.method4518(local1280.anInt9328);
								if (Static47.aBoolean59 && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 == local502.aClass34_Sub1_20.aByte132) {
									@Pc(1311) Class281 local1311 = Static341.anInt5871 == -1 ? null : Static389.aClass335_2.method7504(Static341.anInt5871);
									if ((Static344.anInt5895 & 0x1) != 0 && (local1311 == null || local1288.method461(local1311.anInt7362, Static341.anInt5871) != local1311.anInt7362)) {
										Static390.method5454(-1, true, Static36.aString12, (long) local1280.anInt9328, 49, local537, Static225.aString51 + " -> <col=ff9040>" + local1288.aString6, (long) local287, false, local154, Static213.anInt3686, false);
									}
								}
								if (local502.aClass34_Sub1_20.aByte132 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132) {
									@Pc(1366) String[] local1366 = local1288.aStringArray5;
									for (local665 = 4; local665 >= 0; local665--) {
										if (local1366 != null && local1366[local665] != null) {
											@Pc(1378) byte local1378 = 0;
											local784 = Static677.anInt10939;
											if (local665 == 0) {
												local1378 = 11;
											}
											if (local665 == 1) {
												local1378 = 51;
											}
											if (local665 == 2) {
												local1378 = 18;
											}
											if (local665 == 3) {
												local1378 = 23;
											}
											if (local665 == 4) {
												local1378 = 12;
											}
											if (local665 == local1288.anInt424) {
												local784 = local1288.anInt473;
											}
											if (local665 == local1288.anInt419) {
												local784 = local1288.anInt456;
											}
											Static390.method5454(-1, true, local1366[local665], (long) local1280.anInt9328, local1378, local537, "<col=ff9040>" + local1288.aString6, (long) local287, false, local154, local784, false);
										}
									}
								}
								Static390.method5454(-1, true, Static114.aClass84_22.method1729(Static654.anInt10668), (long) local1280.anInt9328, 1003, local537, "<col=ff9040>" + local1288.aString6, (long) local287, false, local154, Static271.anInt4679, Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 != local502.aClass34_Sub1_20.aByte132);
								local287++;
							}
						}
					}
					if (local502.aClass34_Sub1_20 instanceof Interface17) {
						@Pc(1532) Interface17 local1532 = (Interface17) local502.aClass34_Sub1_20;
						@Pc(1539) Class216 local1539 = Static466.aClass340_6.method7665(local1532.method6661());
						if (local1539.anIntArray325 != null) {
							local1539 = local1539.method5043(Static210.aClass262_1);
						}
						if (local1539 != null) {
							if (Static47.aBoolean59 && Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132 == local502.aClass34_Sub1_20.aByte132) {
								@Pc(1567) Class281 local1567 = Static341.anInt5871 == -1 ? null : Static389.aClass335_2.method7504(Static341.anInt5871);
								if ((Static344.anInt5895 & 0x4) != 0 && (local1567 == null || local1539.method5038(local1567.anInt7362, Static341.anInt5871) != local1567.anInt7362)) {
									Static390.method5454(-1, true, Static36.aString12, Static421.method5797(local154, local1532, local537), 4, local537, Static225.aString51 + " -> <col=00ffff>" + local1539.aString77, (long) local1532.hashCode(), false, local154, Static213.anInt3686, false);
								}
							}
							if (local502.aClass34_Sub1_20.aByte132 == Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132) {
								@Pc(1635) String[] local1635 = local1539.aStringArray41;
								if (local1635 != null) {
									for (local287 = 4; local287 >= 0; local287--) {
										if (local1635[local287] != null) {
											@Pc(1647) short local1647 = 0;
											if (local287 == 0) {
												local1647 = 25;
											}
											local309 = Static677.anInt10939;
											if (local287 == 1) {
												local1647 = 53;
											}
											if (local287 == 2) {
												local1647 = 6;
											}
											if (local287 == 3) {
												local1647 = 60;
											}
											if (local287 == 4) {
												local1647 = 1008;
											}
											if (local287 == local1539.anInt5948) {
												local309 = local1539.anInt5944;
											}
											if (local287 == local1539.anInt5992) {
												local309 = local1539.anInt5995;
											}
											Static390.method5454(-1, true, local1635[local287], Static421.method5797(local154, local1532, local537), local1647, local537, "<col=00ffff>" + local1539.aString77, (long) local1532.hashCode(), false, local154, local309, false);
										}
									}
								}
								Static390.method5454(-1, true, Static114.aClass84_22.method1729(Static654.anInt10668), (long) local1539.anInt5946, 1012, local537, "<col=00ffff>" + local1539.aString77, (long) local1532.hashCode(), false, local154, Static271.anInt4679, local502.aClass34_Sub1_20.aByte132 != Static204.aClass34_Sub1_Sub1_Sub2_Sub1_1.aByte132);
							}
						}
					}
				}
			}
			if (Static498.aBoolean757) {
				Static599.method6442();
			}
		}
		Static498.method9017(false);
	}
}
