import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!cc", name = "l", descriptor = "I")
	public static int anInt962 = 0;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILclient!r;)V")
	public static void method857(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class134 arg2) {
		if (arg0 < 0 || arg1 < 0 || Static432.anInt7582 == 0 || Static342.anInt5722 == 0) {
			return;
		}
		arg2.la(Static356.anInt5939, Static3.anInt53, Static432.anInt7582, Static342.anInt5722);
		arg2.da(Static202.anInt4030, Static302.anInt5240, Static432.anInt7582, Static342.anInt5722);
		@Pc(46) Class113 local46 = arg2.method6924();
		local46.na(Static26.anInt359, Static127.anInt2533, Static516.anInt8762, Static421.anInt7309, Static514.anInt8718, Static484.anInt8157);
		arg2.method6919(local46);
		@Pc(66) int local66;
		@Pc(74) int local74;
		@Pc(82) int local82;
		@Pc(85) int local85;
		@Pc(93) int local93;
		@Pc(102) int local102;
		@Pc(135) int[] local135;
		@Pc(149) int local149;
		@Pc(158) int local158;
		@Pc(167) int local167;
		@Pc(180) int local180;
		if (Static216.aClass47Array2 != null) {
			@Pc(61) int local61 = -1;
			@Pc(63) int local63 = -1;
			local66 = arg2.BA();
			local74 = (arg0 - Static356.anInt5939) * local66 / Static432.anInt7582;
			local82 = (arg1 - Static3.anInt53) * local66 / Static342.anInt5722;
			local85 = arg2.U();
			local93 = local85 * (arg0 - Static356.anInt5939) / Static432.anInt7582;
			local102 = (arg1 - Static3.anInt53) * local85 / Static342.anInt5722;
			@Pc(117) int[] local117 = new int[] { local74, local82, local66 };
			local46.YA(local117);
			local135 = new int[] { local93, local102, local85 };
			local46.YA(local135);
			@Pc(140) float local140 = 0.0F;
			local149 = local135[0] - local117[0];
			local158 = local135[1] - local117[1];
			local167 = local135[2] - local117[2];
			while (local140 < 1.0F) {
				local180 = (int) ((float) local117[0] + local140 * (float) local149);
				@Pc(184) int local184 = local180 >> 9;
				@Pc(195) int local195 = (int) (local140 * (float) local167 + (float) local117[2]);
				@Pc(199) int local199 = local195 >> 9;
				if (local184 > 0 && local199 > 0 && local184 < Static71.anInt1410 && Static471.anInt8012 > local199) {
					@Pc(223) int local223 = Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123;
					if (local223 < 3 && (Static455.aByteArrayArrayArray17[1][local184][local199] & 0x2) != 0) {
						local223++;
					}
					if ((float) Static216.aClass47Array2[local223].method7550(local180, local195) < (float) local117[1] + (float) local158 * local140) {
						local61 = (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.method5434() - 1 << 8) + local180 >> 9;
						local63 = local195 + (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.method5434() - 1 << 8) >> 9;
						break;
					}
				}
				local140 = (float) ((double) local140 + 0.01D);
			}
			if (local61 != -1 && local63 != -1) {
				if (Static573.aBoolean740 && (Static258.anInt4645 & 0x40) != 0) {
					@Pc(315) Class341 local315 = Static49.method751(Static48.anInt840, Static84.anInt8888);
					if (local315 == null) {
						Static50.method827();
					} else {
						Static140.method7612(local61, " ->", local63, true, 10, -1, false, Static534.anInt8944, 0L, Static302.aString46);
					}
				} else {
					if (Static586.aClass195_4 == Static246.aClass195_2) {
						Static140.method7612(local61, "", local63, true, 2, -1, false, -1, 0L, Static568.aClass351_31.method7651(Static307.anInt5279));
					}
					Static140.method7612(local61, "", local63, true, 48, -1, false, Static185.anInt3263, 0L, Static498.aString86);
				}
			}
		}
		@Pc(377) Class209 local377 = Static544.aClass209_9;
		for (@Pc(382) Class8_Sub5 local382 = (Class8_Sub5) local377.method4194(); local382 != null; local382 = (Class8_Sub5) local377.method4191()) {
			if ((Static73.aBoolean60 || Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 == local382.aClass8_Sub3_1.aByte123) && local382.method3932(arg0, arg2, arg1)) {
				if (local382.aClass8_Sub3_1 instanceof Class8_Sub3_Sub3) {
					local66 = ((Class8_Sub3_Sub3) local382.aClass8_Sub3_1).aShort132;
					local74 = ((Class8_Sub3_Sub3) local382.aClass8_Sub3_1).aShort131;
				} else {
					local66 = local382.aClass8_Sub3_1.anInt9365 >> 9;
					local74 = local382.aClass8_Sub3_1.anInt9370 >> 9;
				}
				@Pc(501) int local501;
				@Pc(614) int local614;
				if (local382.aClass8_Sub3_1 instanceof Class8_Sub3_Sub3_Sub1_Sub1) {
					@Pc(439) Class8_Sub3_Sub3_Sub1_Sub1 local439 = (Class8_Sub3_Sub3_Sub1_Sub1) local382.aClass8_Sub3_1;
					local85 = local439.method5434();
					if ((local85 & 0x1) == 0 && (local439.anInt9365 & 0x1FF) == 0 && (local439.anInt9370 & 0x1FF) == 0 || (local85 & 0x1) == 1 && (local439.anInt9365 & 0x1FF) == 256 && (local439.anInt9370 & 0x1FF) == 256) {
						local93 = local439.anInt9365 - (local439.method5434() - 1 << 8);
						local102 = local439.anInt9370 - (local439.method5434() - 1 << 8);
						for (local501 = 0; local501 < Static39.anInt609; local501++) {
							@Pc(512) Class1_Sub42 local512 = (Class1_Sub42) Static84.aClass187_40.method3797((long) Static17.anIntArray24[local501]);
							if (local512 != null) {
								@Pc(517) Class8_Sub3_Sub3_Sub1_Sub2 local517 = local512.aClass8_Sub3_Sub3_Sub1_Sub2_2;
								if (local517.anInt6840 != Static301.anInt5197 && local517.aBoolean551) {
									local149 = local517.anInt9365 - (local517.aClass20_1.anInt350 - 1 << 8);
									local158 = local517.anInt9370 - (local517.aClass20_1.anInt350 - 1 << 8);
									if (local93 <= local149 && local517.aClass20_1.anInt350 <= local439.method5434() - (local149 - local93 >> 9) && local102 <= local158 && local517.aClass20_1.anInt350 <= local439.method5434() - (local158 - local102 >> 9)) {
										Static331.method4533(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 != local382.aClass8_Sub3_1.aByte123, local517);
										local517.anInt6840 = Static301.anInt5197;
									}
								}
							}
						}
						local614 = Static220.anInt4237;
						@Pc(616) int[] local616 = Static572.anIntArray717;
						for (local149 = 0; local149 < local614; local149++) {
							@Pc(626) Class8_Sub3_Sub3_Sub1_Sub1 local626 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local616[local149]];
							if (local626 != null && local626.anInt6840 != Static301.anInt5197 && local626 != local439 && local626.aBoolean551) {
								local167 = local626.anInt9365 - (local626.method5434() - 1 << 8);
								local180 = local626.anInt9370 - (local626.method5434() - 1 << 8);
								if (local167 >= local93 && local626.method5434() <= local439.method5434() - (local167 - local93 >> 9) && local180 >= local102 && local626.method5434() <= local439.method5434() - (local180 - local102 >> 9)) {
									Static185.method2597(local382.aClass8_Sub3_1.aByte123 != Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, local626);
									local626.anInt6840 = Static301.anInt5197;
								}
							}
						}
					}
					if (Static301.anInt5197 == local439.anInt6840) {
						continue;
					}
					Static185.method2597(local382.aClass8_Sub3_1.aByte123 != Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, local439);
					local439.anInt6840 = Static301.anInt5197;
				}
				@Pc(871) int local871;
				if (local382.aClass8_Sub3_1 instanceof Class8_Sub3_Sub3_Sub1_Sub2) {
					@Pc(758) Class8_Sub3_Sub3_Sub1_Sub2 local758 = (Class8_Sub3_Sub3_Sub1_Sub2) local382.aClass8_Sub3_1;
					if (local758.aClass20_1 != null) {
						if ((local758.aClass20_1.anInt350 & 0x1) == 0 && (local758.anInt9365 & 0x1FF) == 0 && (local758.anInt9370 & 0x1FF) == 0 || (local758.aClass20_1.anInt350 & 0x1) == 1 && (local758.anInt9365 & 0x1FF) == 256 && (local758.anInt9370 & 0x1FF) == 256) {
							local85 = local758.anInt9365 - (local758.aClass20_1.anInt350 - 1 << 8);
							local93 = local758.anInt9370 - (local758.aClass20_1.anInt350 - 1 << 8);
							for (local102 = 0; local102 < Static39.anInt609; local102++) {
								@Pc(838) Class1_Sub42 local838 = (Class1_Sub42) Static84.aClass187_40.method3797((long) Static17.anIntArray24[local102]);
								if (local838 != null) {
									@Pc(843) Class8_Sub3_Sub3_Sub1_Sub2 local843 = local838.aClass8_Sub3_Sub3_Sub1_Sub2_2;
									if (Static301.anInt5197 != local843.anInt6840 && local758 != local843 && local843.aBoolean551) {
										local871 = local843.anInt9365 - (local843.aClass20_1.anInt350 - 1 << 8);
										local149 = local843.anInt9370 - (local843.aClass20_1.anInt350 - 1 << 8);
										if (local85 <= local871 && local758.aClass20_1.anInt350 - (local871 - local85 >> 9) >= local843.aClass20_1.anInt350 && local149 >= local93 && local843.aClass20_1.anInt350 <= local758.aClass20_1.anInt350 - (local149 - local93 >> 9)) {
											Static331.method4533(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 != local382.aClass8_Sub3_1.aByte123, local843);
											local843.anInt6840 = Static301.anInt5197;
										}
									}
								}
							}
							local501 = Static220.anInt4237;
							local135 = Static572.anIntArray717;
							for (local871 = 0; local871 < local501; local871++) {
								@Pc(964) Class8_Sub3_Sub3_Sub1_Sub1 local964 = Static576.aClass8_Sub3_Sub3_Sub1_Sub1Array1[local135[local871]];
								if (local964 != null && Static301.anInt5197 != local964.anInt6840 && local964.aBoolean551) {
									local158 = local964.anInt9365 - (local964.method5434() - 1 << 8);
									local167 = local964.anInt9370 - (local964.method5434() - 1 << 8);
									if (local158 >= local85 && local964.method5434() <= local758.aClass20_1.anInt350 - (local158 - local85 >> 9) && local93 <= local167 && local964.method5434() <= local758.aClass20_1.anInt350 - (local167 - local93 >> 9)) {
										Static185.method2597(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 != local382.aClass8_Sub3_1.aByte123, local964);
										local964.anInt6840 = Static301.anInt5197;
									}
								}
							}
						}
						if (Static301.anInt5197 == local758.anInt6840) {
							continue;
						}
						Static331.method4533(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 != local382.aClass8_Sub3_1.aByte123, local758);
						local758.anInt6840 = Static301.anInt5197;
					}
				}
				if (local382.aClass8_Sub3_1 instanceof Class8_Sub3_Sub5_Sub1) {
					local82 = local66 + Static541.anInt9058;
					local85 = local74 + Static116.anInt2289;
					@Pc(1130) Class1_Sub28 local1130 = (Class1_Sub28) Static19.aClass187_3.method3797((long) (local82 | local382.aClass8_Sub3_1.aByte123 << 28 | local85 << 14));
					if (local1130 != null) {
						for (@Pc(1140) Class1_Sub40 local1140 = (Class1_Sub40) local1130.aClass353_28.method7676(); local1140 != null; local1140 = (Class1_Sub40) local1130.aClass353_28.method7681()) {
							@Pc(1148) Class245 local1148 = Static175.aClass114_4.method2217(local1140.anInt7304);
							if (Static573.aBoolean740 && Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 == local382.aClass8_Sub3_1.aByte123) {
								@Pc(1171) Class120 local1171 = Static189.anInt3543 == -1 ? null : Static459.aClass38_2.method713(Static189.anInt3543);
								if ((Static258.anInt4645 & 0x1) != 0 && (local1171 == null || local1148.method5000(Static189.anInt3543, local1171.anInt2965) != local1171.anInt2965)) {
									Static140.method7612(local66, Static593.aString101 + " -> <col=ff9040>" + local1148.aString62, local74, true, 3, -1, false, Static534.anInt8944, (long) local1140.anInt7304, Static302.aString46);
								}
							}
							if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 == local382.aClass8_Sub3_1.aByte123) {
								@Pc(1226) String[] local1226 = local1148.aStringArray27;
								for (local871 = 4; local871 >= 0; local871--) {
									if (local1226 != null && local1226[local871] != null) {
										@Pc(1238) byte local1238 = 0;
										if (local871 == 0) {
											local1238 = 18;
										}
										local158 = Static374.anInt6269;
										if (local871 == 1) {
											local1238 = 20;
										}
										if (local871 == 2) {
											local1238 = 12;
										}
										if (local871 == 3) {
											local1238 = 17;
										}
										if (local871 == local1148.anInt6219) {
											local158 = local1148.anInt6186;
										}
										if (local871 == 4) {
											local1238 = 8;
										}
										if (local871 == local1148.anInt6185) {
											local158 = local1148.anInt6210;
										}
										Static140.method7612(local66, "<col=ff9040>" + local1148.aString62, local74, true, local1238, -1, false, local158, (long) local1140.anInt7304, local1226[local871]);
									}
								}
							}
							Static140.method7612(local66, "<col=ff9040>" + local1148.aString62, local74, true, 1006, -1, local382.aClass8_Sub3_1.aByte123 != Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, Static398.anInt7011, (long) local1140.anInt7304, Static568.aClass351_26.method7651(Static307.anInt5279));
						}
					}
				}
				if (local382.aClass8_Sub3_1 instanceof Interface19) {
					@Pc(1374) Interface19 local1374 = (Interface19) local382.aClass8_Sub3_1;
					@Pc(1381) Class95 local1381 = Static518.aClass96_4.method1925(local1374.method7640());
					if (local1381.anIntArray208 != null) {
						local1381 = local1381.method1922(Static430.aClass321_1);
					}
					if (local1381 != null) {
						if (Static573.aBoolean740 && local382.aClass8_Sub3_1.aByte123 == Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123) {
							@Pc(1410) Class120 local1410 = Static189.anInt3543 == -1 ? null : Static459.aClass38_2.method713(Static189.anInt3543);
							if ((Static258.anInt4645 & 0x4) != 0 && (local1410 == null || local1381.method1914(local1410.anInt2965, Static189.anInt3543) != local1410.anInt2965)) {
								Static140.method7612(local66, Static593.aString101 + " -> <col=00ffff>" + local1381.aString18, local74, true, 6, -1, false, Static534.anInt8944, Static477.method6494(local74, local1374, local66), Static302.aString46);
							}
						}
						if (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123 == local382.aClass8_Sub3_1.aByte123) {
							@Pc(1474) String[] local1474 = local1381.aStringArray14;
							if (local1474 != null) {
								for (local102 = 4; local102 >= 0; local102--) {
									if (local1474[local102] != null) {
										@Pc(1486) short local1486 = 0;
										if (local102 == 0) {
											local1486 = 4;
										}
										local614 = Static374.anInt6269;
										if (local102 == 1) {
											local1486 = 46;
										}
										if (local102 == 2) {
											local1486 = 11;
										}
										if (local102 == 3) {
											local1486 = 16;
										}
										if (local102 == 4) {
											local1486 = 1009;
										}
										if (local1381.anInt2425 == local102) {
											local614 = local1381.anInt2402;
										}
										if (local1381.anInt2414 == local102) {
											local614 = local1381.anInt2385;
										}
										Static140.method7612(local66, "<col=00ffff>" + local1381.aString18, local74, true, local1486, -1, false, local614, Static477.method6494(local74, local1374, local66), local1474[local102]);
									}
								}
							}
						}
						Static140.method7612(local66, "<col=00ffff>" + local1381.aString18, local74, true, 1001, -1, local382.aClass8_Sub3_1.aByte123 != Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, Static398.anInt7011, (long) local1381.lb, Static568.aClass351_26.method7651(Static307.anInt5279));
					}
				}
			}
		}
	}
}
