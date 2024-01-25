import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hb", name = "c", descriptor = "I")
	public static int anInt4621;

	@OriginalMember(owner = "client!hb", name = "b", descriptor = "Z")
	public static boolean aBoolean392 = false;

	@OriginalMember(owner = "client!hb", name = "f", descriptor = "Z")
	public static boolean aBoolean393 = false;

	@OriginalMember(owner = "client!hb", name = "i", descriptor = "Ljava/lang/String;")
	public static String aString45 = "";

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IIIBI)V")
	public static void method3930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) int local9 = Static447.anInt8127;
		if (local9 == 0) {
			return;
		}
		if (local9 == 1) {
			Static83.anInt6976 = arg1;
			Static447.anInt8127 = 2;
			Static199.anInt4632 = arg3;
			Static570.anInt9679 = arg2;
			Static182.anInt4317 = arg0;
		} else if (local9 == 2) {
			if (Static570.anInt9679 > arg2) {
				Static570.anInt9679 = arg2;
			}
			if (Static199.anInt4632 < arg3) {
				Static199.anInt4632 = arg3;
			}
			if (arg0 < Static182.anInt4317) {
				Static182.anInt4317 = arg0;
			}
			if (Static83.anInt6976 < arg1) {
				Static83.anInt6976 = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBILclient!ha;)V")
	public static void method3931(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2) {
		if (arg1 < 0 || arg0 < 0 || Static339.anInt6715 == 0 || Static115.anInt9241 == 0) {
			return;
		}
		@Pc(45) Class47 local45;
		@Pc(36) int local36;
		@Pc(32) int local32;
		@Pc(34) int local34;
		@Pc(30) int local30;
		@Pc(58) int local58;
		@Pc(60) int local60;
		if (Static349.aBoolean590) {
			Static182.method3695(false);
			local45 = arg2.method6200();
			@Pc(71) int[] local71 = arg2.Y();
			local34 = local71[2];
			local36 = local71[0];
			local30 = local71[3];
			local32 = local71[1];
			local58 = Static359.method7957(false) + arg1;
			local60 = Static117.method2789(false) + arg0;
		} else {
			arg2.DA(Static329.anInt6592, Static559.anInt9548, Static339.anInt6715, Static115.anInt9241);
			local30 = Static115.anInt9241;
			local32 = Static559.anInt9548;
			local34 = Static339.anInt6715;
			local36 = Static329.anInt6592;
			arg2.KA(Static245.anInt5496, Static64.anInt9908, Static339.anInt6715, Static115.anInt9241);
			local45 = arg2.method6223();
			local45.method7860(Static138.anInt3526, Static622.anInt9510, Static528.anInt4820, Static258.anInt5690, Static263.anInt5756, Static267.anInt5781);
			arg2.method6233(local45);
			local58 = arg1;
			local60 = arg0;
		}
		Static648.method8676(true);
		if (local34 == 0) {
			local34 = 1;
		}
		if (local30 == 0) {
			local30 = 1;
		}
		@Pc(134) int local134;
		@Pc(158) int local158;
		@Pc(146) int local146;
		@Pc(272) int local272;
		@Pc(280) int local280;
		@Pc(291) int local291;
		@Pc(302) int local302;
		@Pc(126) int local126;
		@Pc(351) int local351;
		if (Static445.aClass274Array1 != null && (!Static82.aBoolean192 || (Static607.anInt10027 & 0x40) != 0)) {
			local126 = -1;
			@Pc(128) int local128 = -1;
			@Pc(131) int local131 = arg2.i();
			local134 = arg2.XA();
			@Pc(147) int local147;
			@Pc(157) int local157;
			if (Static216.aBoolean440) {
				local147 = local146 = (local60 - local32) * Static467.anInt8440 / local30;
				local158 = local157 = (local58 - local36) * Static467.anInt8440 / local34;
			} else {
				local146 = local134 * (local60 - local32) / local30;
				local157 = local134 * (local58 - local36) / local34;
				local147 = (local60 - local32) * local131 / local30;
				local158 = local131 * (local58 - local36) / local34;
			}
			@Pc(210) int[] local210 = new int[] { local158, local147, local131 };
			@Pc(225) int[] local225 = new int[] { local157, local146, local134 };
			local45.method7874(local210);
			local45.method7874(local225);
			@Pc(259) float local259 = Static576.method8019((float) local210[2], (float) local225[1], (float) local210[1], (float) local210[0], (float) local225[2], (float) local225[0], 4);
			if (local259 > 0.0F) {
				local272 = local225[0] - local210[0];
				local280 = local225[2] - local210[2];
				local291 = (int) ((float) local210[0] + (float) local272 * local259);
				local302 = (int) (local259 * (float) local280 + (float) local210[2]);
				local126 = local291 + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5308() - 1 << 8) >> 9;
				local128 = local302 + (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.method5308() - 1 << 8) >> 9;
				@Pc(330) byte local330 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128;
				if (local330 < 3 && (Static244.aByteArrayArrayArray10[1][local291 >> 9][local302 >> 9] & 0x2) != 0) {
					local351 = local330 + 1;
				}
			}
			if (local126 != -1 && local128 != -1) {
				if (Static82.aBoolean192 && (Static607.anInt10027 & 0x40) != 0) {
					@Pc(369) Class108 local369 = Static526.method6818(Static33.anInt612, Static461.anInt8388);
					if (local369 == null) {
						Static32.method596();
					} else {
						Static512.method7408(10, " ->", -1, true, (long) (local126 << 0 | local128), Static330.aString71, 0L, false, local126, local128, true, Static287.anInt5894);
					}
				} else {
					if (Static93.aBoolean203) {
						Static512.method7408(49, "", -1, true, (long) (local128 | local126 << 0), Static287.aClass176_27.method4986(Static380.anInt7247), 0L, false, local126, local128, true, -1);
					}
					Static512.method7408(48, "", -1, true, (long) (local128 | local126 << 0), Static536.aString103, 0L, false, local126, local128, true, Static639.anInt10498);
				}
			}
		}
		if (Static349.aBoolean590) {
			Static287.method4988();
		}
		for (local126 = 0; (Static349.aBoolean590 ? 2 : 1) > local126; local126++) {
			@Pc(459) boolean local459 = local126 == 0;
			@Pc(465) Class70 local465 = local459 ? Static625.aClass70_2 : Static250.aClass70_1;
			local134 = arg1;
			local158 = arg0;
			if (Static349.aBoolean590) {
				Static182.method3695(local459);
				local134 = arg1 + Static359.method7957(local459);
				local158 = arg0 + Static117.method2789(local459);
			}
			@Pc(491) Class375 local491 = local465.aClass375_3;
			for (@Pc(496) Class2_Sub6 local496 = (Class2_Sub6) local491.method8638(); local496 != null; local496 = (Class2_Sub6) local491.method8635()) {
				if ((Static320.aBoolean554 || local496.aClass2_Sub3_9.aByte128 == Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128) && local496.method4385(local134, local158, arg2)) {
					@Pc(527) int local527;
					if (local496.aClass2_Sub3_9 instanceof Class2_Sub3_Sub1) {
						local146 = ((Class2_Sub3_Sub1) local496.aClass2_Sub3_9).aShort121;
						local527 = ((Class2_Sub3_Sub1) local496.aClass2_Sub3_9).aShort124;
					} else {
						local527 = local496.aClass2_Sub3_9.anInt10424 >> 9;
						local146 = local496.aClass2_Sub3_9.anInt10428 >> 9;
					}
					@Pc(658) int local658;
					@Pc(670) int local670;
					@Pc(780) int local780;
					@Pc(557) int local557;
					if (local496.aClass2_Sub3_9 instanceof Class2_Sub3_Sub1_Sub2_Sub2) {
						@Pc(553) Class2_Sub3_Sub1_Sub2_Sub2 local553 = (Class2_Sub3_Sub1_Sub2_Sub2) local496.aClass2_Sub3_9;
						local557 = local553.method5308();
						if ((local557 & 0x1) == 0 && (local553.anInt10428 & 0x1FF) == 0 && (local553.anInt10424 & 0x1FF) == 0 || (local557 & 0x1) == 1 && (local553.anInt10428 & 0x1FF) == 256 && (local553.anInt10424 & 0x1FF) == 256) {
							local272 = local553.anInt10428 - (local553.method5308() - 1 << 8);
							local280 = local553.anInt10424 - (local553.method5308() - 1 << 8);
							for (local291 = 0; local291 < Static377.anInt7132; local291++) {
								@Pc(628) Class3_Sub49 local628 = (Class3_Sub49) Static60.aClass307_6.method7424((long) Static176.anIntArray229[local291]);
								if (local628 != null) {
									@Pc(633) Class2_Sub3_Sub1_Sub2_Sub1 local633 = local628.aClass2_Sub3_Sub1_Sub2_Sub1_2;
									if (Static251.anInt5580 != local633.anInt6333 && local633.aBoolean533) {
										local658 = local633.anInt10428 - (local633.aClass22_1.anInt404 - 1 << 8);
										local670 = local633.anInt10424 - (local633.aClass22_1.anInt404 - 1 << 8);
										if (local658 >= local272 && local633.aClass22_1.anInt404 <= local553.method5308() - (local658 - local272 >> 9) && local280 <= local670 && local633.aClass22_1.anInt404 <= local553.method5308() - (local670 - local280 >> 9)) {
											Static90.method2283(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 != local496.aClass2_Sub3_9.aByte128, local633);
											local633.anInt6333 = Static251.anInt5580;
										}
									}
								}
							}
							local302 = Static385.anInt10557;
							@Pc(744) int[] local744 = Static493.anIntArray555;
							for (local658 = 0; local658 < local302; local658++) {
								@Pc(754) Class2_Sub3_Sub1_Sub2_Sub2 local754 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local744[local658]];
								if (local754 != null && Static251.anInt5580 != local754.anInt6333 && local553 != local754 && local754.aBoolean533) {
									local780 = local754.anInt10428 - (local754.method5308() - 1 << 8);
									@Pc(791) int local791 = local754.anInt10424 - (local754.method5308() - 1 << 8);
									if (local272 <= local780 && local754.method5308() <= local553.method5308() - (local780 - local272 >> 9) && local280 <= local791 && local754.method5308() <= local553.method5308() - (local791 - local280 >> 9)) {
										Static190.method3797(local754, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 != local496.aClass2_Sub3_9.aByte128);
										local754.anInt6333 = Static251.anInt5580;
									}
								}
							}
						}
						if (local553.anInt6333 == Static251.anInt5580) {
							continue;
						}
						Static190.method3797(local553, local496.aClass2_Sub3_9.aByte128 != Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128);
						local553.anInt6333 = Static251.anInt5580;
					}
					if (local496.aClass2_Sub3_9 instanceof Class2_Sub3_Sub1_Sub2_Sub1) {
						@Pc(892) Class2_Sub3_Sub1_Sub2_Sub1 local892 = (Class2_Sub3_Sub1_Sub2_Sub1) local496.aClass2_Sub3_9;
						if (local892.aClass22_1 != null) {
							if ((local892.aClass22_1.anInt404 & 0x1) == 0 && (local892.anInt10428 & 0x1FF) == 0 && (local892.anInt10424 & 0x1FF) == 0 || (local892.aClass22_1.anInt404 & 0x1) == 1 && (local892.anInt10428 & 0x1FF) == 256 && (local892.anInt10424 & 0x1FF) == 256) {
								local557 = local892.anInt10428 - (local892.aClass22_1.anInt404 - 1 << 8);
								local272 = local892.anInt10424 - (local892.aClass22_1.anInt404 - 1 << 8);
								for (local280 = 0; local280 < Static377.anInt7132; local280++) {
									@Pc(972) Class3_Sub49 local972 = (Class3_Sub49) Static60.aClass307_6.method7424((long) Static176.anIntArray229[local280]);
									if (local972 != null) {
										@Pc(977) Class2_Sub3_Sub1_Sub2_Sub1 local977 = local972.aClass2_Sub3_Sub1_Sub2_Sub1_2;
										if (Static251.anInt5580 != local977.anInt6333 && local977 != local892 && local977.aBoolean533) {
											local351 = local977.anInt10428 - (local977.aClass22_1.anInt404 - 1 << 8);
											local658 = local977.anInt10424 - (local977.aClass22_1.anInt404 - 1 << 8);
											if (local557 <= local351 && local892.aClass22_1.anInt404 - (local351 - local557 >> 9) >= local977.aClass22_1.anInt404 && local658 >= local272 && local892.aClass22_1.anInt404 - (local658 - local272 >> 9) >= local977.aClass22_1.anInt404) {
												Static90.method2283(local496.aClass2_Sub3_9.aByte128 != Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128, local977);
												local977.anInt6333 = Static251.anInt5580;
											}
										}
									}
								}
								local291 = Static385.anInt10557;
								@Pc(1086) int[] local1086 = Static493.anIntArray555;
								for (local351 = 0; local351 < local291; local351++) {
									@Pc(1096) Class2_Sub3_Sub1_Sub2_Sub2 local1096 = Static393.aClass2_Sub3_Sub1_Sub2_Sub2Array2[local1086[local351]];
									if (local1096 != null && Static251.anInt5580 != local1096.anInt6333 && local1096.aBoolean533) {
										local670 = local1096.anInt10428 - (local1096.method5308() - 1 << 8);
										local780 = local1096.anInt10424 - (local1096.method5308() - 1 << 8);
										if (local557 <= local670 && local1096.method5308() <= local892.aClass22_1.anInt404 - (local670 - local557 >> 9) && local272 <= local780 && local1096.method5308() <= local892.aClass22_1.anInt404 - (local780 - local272 >> 9)) {
											Static190.method3797(local1096, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 != local496.aClass2_Sub3_9.aByte128);
											local1096.anInt6333 = Static251.anInt5580;
										}
									}
								}
							}
							if (Static251.anInt5580 == local892.anInt6333) {
								continue;
							}
							Static90.method2283(Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 != local496.aClass2_Sub3_9.aByte128, local892);
							local892.anInt6333 = Static251.anInt5580;
						}
					}
					if (local496.aClass2_Sub3_9 instanceof Class2_Sub3_Sub4_Sub1) {
						@Pc(1235) int local1235 = Static446.anInt8090 + local146;
						local557 = local527 + Static124.anInt3150;
						@Pc(1256) Class3_Sub46 local1256 = (Class3_Sub46) Static644.aClass307_55.method7424((long) (local1235 | local557 << 14 | local496.aClass2_Sub3_9.aByte128 << 28));
						if (local1256 != null) {
							local280 = 0;
							for (@Pc(1266) Class3_Sub32 local1266 = (Class3_Sub32) local1256.aClass276_56.method6915(); local1266 != null; local1266 = (Class3_Sub32) local1256.aClass276_56.method6916()) {
								@Pc(1274) Class237 local1274 = Static367.aClass281_1.method6975(local1266.anInt7689);
								if (Static82.aBoolean192 && local496.aClass2_Sub3_9.aByte128 == Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128) {
									@Pc(1298) Class140 local1298 = Static159.anInt3866 == -1 ? null : Static513.aClass49_2.method1857(Static159.anInt3866);
									if ((Static607.anInt10027 & 0x1) != 0 && (local1298 == null || local1274.method6074(Static159.anInt3866, local1298.anInt5140) != local1298.anInt5140)) {
										Static512.method7408(25, Static275.aString60 + " -> <col=ff9040>" + local1274.aString84, -1, true, (long) local280, Static330.aString71, (long) local1266.anInt7689, false, local146, local527, false, Static287.anInt5894);
									}
								}
								if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 == local496.aClass2_Sub3_9.aByte128) {
									@Pc(1360) String[] local1360 = local1274.aStringArray30;
									for (local658 = 4; local658 >= 0; local658--) {
										if (local1360 != null && local1360[local658] != null) {
											@Pc(1372) byte local1372 = 0;
											if (local658 == 0) {
												local1372 = 4;
											}
											local780 = Static83.anInt6965;
											if (local658 == 1) {
												local1372 = 9;
											}
											if (local658 == 2) {
												local1372 = 23;
											}
											if (local658 == 3) {
												local1372 = 19;
											}
											if (local658 == local1274.anInt7296) {
												local780 = local1274.anInt7276;
											}
											if (local658 == 4) {
												local1372 = 12;
											}
											if (local1274.anInt7324 == local658) {
												local780 = local1274.anInt7304;
											}
											Static512.method7408(local1372, "<col=ff9040>" + local1274.aString84, -1, true, (long) local280, local1360[local658], (long) local1266.anInt7689, false, local146, local527, false, local780);
										}
									}
								}
								Static512.method7408(1010, "<col=ff9040>" + local1274.aString84, -1, true, (long) local280, Static287.aClass176_22.method4986(Static380.anInt7247), (long) local1266.anInt7689, Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 != local496.aClass2_Sub3_9.aByte128, local146, local527, false, Static96.anInt2551);
								local280++;
							}
						}
					}
					if (local496.aClass2_Sub3_9 instanceof Interface18) {
						@Pc(1505) Interface18 local1505 = (Interface18) local496.aClass2_Sub3_9;
						@Pc(1512) Class272 local1512 = Static541.aClass349_4.method8123(local1505.method8587());
						if (local1512.anIntArray523 != null) {
							local1512 = local1512.method6856(Static514.aClass166_1);
						}
						if (local1512 != null) {
							if (Static82.aBoolean192 && Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 == local496.aClass2_Sub3_9.aByte128) {
								@Pc(1547) Class140 local1547 = Static159.anInt3866 == -1 ? null : Static513.aClass49_2.method1857(Static159.anInt3866);
								if ((Static607.anInt10027 & 0x4) != 0 && (local1547 == null || local1512.method6859(local1547.anInt5140, Static159.anInt3866) != local1547.anInt5140)) {
									Static512.method7408(5, Static275.aString60 + " -> <col=00ffff>" + local1512.aString93, -1, true, (long) local1505.hashCode(), Static330.aString71, Static562.method7911(local146, local1505, local527), false, local146, local527, false, Static287.anInt5894);
								}
							}
							if (Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128 == local496.aClass2_Sub3_9.aByte128) {
								@Pc(1612) String[] local1612 = local1512.aStringArray33;
								if (local1612 != null) {
									for (local280 = 4; local280 >= 0; local280--) {
										if (local1612[local280] != null) {
											@Pc(1624) short local1624 = 0;
											local302 = Static83.anInt6965;
											if (local280 == 0) {
												local1624 = 51;
											}
											if (local280 == 1) {
												local1624 = 44;
											}
											if (local280 == 2) {
												local1624 = 3;
											}
											if (local280 == 3) {
												local1624 = 50;
											}
											if (local1512.anInt8261 == local280) {
												local302 = local1512.anInt8246;
											}
											if (local280 == 4) {
												local1624 = 1003;
											}
											if (local280 == local1512.anInt8256) {
												local302 = local1512.anInt8292;
											}
											Static512.method7408(local1624, "<col=00ffff>" + local1512.aString93, -1, true, (long) local1505.hashCode(), local1612[local280], Static562.method7911(local146, local1505, local527), false, local146, local527, false, local302);
										}
									}
								}
								Static512.method7408(1002, "<col=00ffff>" + local1512.aString93, -1, true, (long) local1505.hashCode(), Static287.aClass176_22.method4986(Static380.anInt7247), (long) local1512.anInt8290, local496.aClass2_Sub3_9.aByte128 != Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.aByte128, local146, local527, false, Static96.anInt2551);
							}
						}
					}
				}
			}
			if (Static349.aBoolean590) {
				Static287.method4988();
			}
		}
		Static648.method8676(false);
	}
}
