import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static20 {

	@OriginalMember(owner = "client!da", name = "d", descriptor = "Lclient!tb;")
	public static Class64_Sub1 aClass64_Sub1_1;

	@OriginalMember(owner = "client!da", name = "l", descriptor = "Lclient!bb;")
	public static Class8 aClass8_7;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "I")
	public static int anInt479 = 0;

	@OriginalMember(owner = "client!da", name = "b", descriptor = "Lclient!dd;")
	public static Class20 aClass20_2 = new Class20();

	@OriginalMember(owner = "client!da", name = "g", descriptor = "Lclient!ad;")
	private static Class4 aClass4_243 = Static75.method1216(" from your ignore list first");

	@OriginalMember(owner = "client!da", name = "k", descriptor = "Lclient!ad;")
	public static Class4 aClass4_244 = Static75.method1216("headicons_prayer");

	@OriginalMember(owner = "client!da", name = "r", descriptor = "Lclient!ad;")
	private static Class4 aClass4_248 = Static75.method1216("Trade)4compete");

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!ad;")
	public static Class4 aClass4_245 = aClass4_248;

	@OriginalMember(owner = "client!da", name = "o", descriptor = "Lclient!ad;")
	public static Class4 aClass4_246 = Static75.method1216("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <OFF>");

	@OriginalMember(owner = "client!da", name = "p", descriptor = "Lclient!ad;")
	public static Class4 aClass4_247 = aClass4_243;

	@OriginalMember(owner = "client!da", name = "q", descriptor = "I")
	public static int anInt487 = 1;

	@OriginalMember(owner = "client!da", name = "s", descriptor = "Lclient!ad;")
	public static Class4 aClass4_249 = Static75.method1216("0(U");

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
	public static void method288() {
		if (Static98.anInt2368 == 0 && Static101.anInt2512 == 0) {
			Static62.method1082(Static113.aClass4_1604, 47, Static46.aClass4_1536, 0, Static22.anInt496, Static78.anInt420);
		}
		@Pc(23) int local23 = -1;
		for (@Pc(25) int local25 = 0; local25 < Static41.anInt1120; local25++) {
			@Pc(31) int local31 = Static41.anIntArray139[local25];
			@Pc(35) int local35 = local31 & 0x7F;
			@Pc(41) int local41 = local31 >> 29 & 0x3;
			@Pc(47) int local47 = local31 >> 7 & 0x7F;
			@Pc(53) int local53 = local31 >> 14 & 0x7FFF;
			if (local23 != local31) {
				local23 = local31;
				@Pc(143) int local143;
				if (local41 == 2 && Static38.aClass61_30.method1319(Static49.anInt1203, local35, local47, local31) >= 0) {
					@Pc(81) Class3_Sub1_Sub5 local81 = Static38.method1911(local53);
					if (local81.anIntArray215 != null) {
						local81 = local81.method1030();
					}
					if (local81 == null) {
						continue;
					}
					if (Static98.anInt2368 == 1) {
						Static62.method1082(Static60.method1012(new Class4[] { Static48.aClass4_630, Static31.aClass4_453, local81.aClass4_777 }), 54, Static9.aClass4_163, local31, local35, local47);
					} else if (Static101.anInt2512 != 1) {
						@Pc(133) Class4[] local133 = local81.aClass4Array12;
						if (Static15.aBoolean25) {
							local133 = Static82.method1292(local133);
						}
						if (local133 != null) {
							for (local143 = 4; local143 >= 0; local143--) {
								if (local133[local143] != null) {
									@Pc(155) short local155 = 0;
									if (local143 == 0) {
										local155 = 36;
									}
									if (local143 == 1) {
										local155 = 23;
									}
									if (local143 == 2) {
										local155 = 19;
									}
									if (local143 == 3) {
										local155 = 45;
									}
									if (local143 == 4) {
										local155 = 1005;
									}
									Static62.method1082(Static60.method1012(new Class4[] { Static54.aClass4_684, local81.aClass4_777 }), local155, local133[local143], local31, local35, local47);
								}
							}
						}
						Static62.method1082(Static60.method1012(new Class4[] { Static54.aClass4_684, local81.aClass4_777 }), 1006, Static47.aClass4_602, local81.anInt1512 << 14, local35, local47);
					} else if ((Static63.anInt1604 & 0x4) == 4) {
						Static62.method1082(Static60.method1012(new Class4[] { Static34.aClass4_519, Static31.aClass4_453, local81.aClass4_777 }), 53, Static92.aClass4_1188, local31, local35, local47);
					}
				}
				@Pc(297) int local297;
				@Pc(305) Class3_Sub1_Sub1_Sub1_Sub1 local305;
				@Pc(350) Class3_Sub1_Sub1_Sub1_Sub2 local350;
				if (local41 == 1) {
					@Pc(278) Class3_Sub1_Sub1_Sub1_Sub1 local278 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local53];
					if (local278.aClass3_Sub1_Sub17_1.anInt2516 == 1 && (local278.anInt2342 & 0x7F) == 64 && (local278.anInt2348 & 0x7F) == 64) {
						for (local297 = 0; local297 < Static29.anInt905; local297++) {
							local305 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[Static24.anIntArray40[local297]];
							if (local305 != null && local278 != local305 && local305.aClass3_Sub1_Sub17_1.anInt2516 == 1 && local278.anInt2342 == local305.anInt2342 && local305.anInt2348 == local278.anInt2348) {
								Static83.method1296(local47, Static24.anIntArray40[local297], local305.aClass3_Sub1_Sub17_1, local35);
							}
						}
						for (local143 = 0; local143 < Static11.anInt2841; local143++) {
							local350 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static92.anIntArray270[local143]];
							if (local350 != null && local278.anInt2342 == local350.anInt2342 && local278.anInt2348 == local350.anInt2348) {
								Static27.method563(Static92.anIntArray270[local143], local35, local47, local350);
							}
						}
					}
					Static83.method1296(local47, local53, local278.aClass3_Sub1_Sub17_1, local35);
				}
				if (local41 == 0) {
					@Pc(391) Class3_Sub1_Sub1_Sub1_Sub2 local391 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local53];
					if ((local391.anInt2342 & 0x7F) == 64 && (local391.anInt2348 & 0x7F) == 64) {
						for (local297 = 0; local297 < Static29.anInt905; local297++) {
							local305 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[Static24.anIntArray40[local297]];
							if (local305 != null && local305.aClass3_Sub1_Sub17_1.anInt2516 == 1 && local391.anInt2342 == local305.anInt2342 && local391.anInt2348 == local305.anInt2348) {
								Static83.method1296(local47, Static24.anIntArray40[local297], local305.aClass3_Sub1_Sub17_1, local35);
							}
						}
						for (local143 = 0; local143 < Static11.anInt2841; local143++) {
							local350 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[Static92.anIntArray270[local143]];
							if (local350 != null && local391 != local350 && local391.anInt2342 == local350.anInt2342 && local391.anInt2348 == local350.anInt2348) {
								Static27.method563(Static92.anIntArray270[local143], local35, local47, local350);
							}
						}
					}
					Static27.method563(local53, local35, local47, local391);
				}
				if (local41 == 3) {
					@Pc(513) Class20 local513 = Static22.aClass20ArrayArrayArray1[Static49.anInt1203][local35][local47];
					if (local513 != null) {
						for (@Pc(520) Class3_Sub1_Sub1_Sub2 local520 = (Class3_Sub1_Sub1_Sub2) local513.method303(); local520 != null; local520 = (Class3_Sub1_Sub1_Sub2) local513.method312()) {
							@Pc(527) Class3_Sub1_Sub2 local527 = Static3.method1550(local520.anInt197);
							if (Static98.anInt2368 == 1) {
								Static62.method1082(Static60.method1012(new Class4[] { Static48.aClass4_630, Static52.aClass4_675, local527.aClass4_347 }), 62, Static9.aClass4_163, local520.anInt197, local35, local47);
							} else if (Static101.anInt2512 != 1) {
								@Pc(578) Class4[] local578 = local527.aClass4Array4;
								if (Static15.aBoolean25) {
									local578 = Static82.method1292(local578);
								}
								for (@Pc(586) int local586 = 4; local586 >= 0; local586--) {
									if (local578 != null && local578[local586] != null) {
										@Pc(600) byte local600 = 0;
										if (local586 == 0) {
											local600 = 6;
										}
										if (local586 == 1) {
											local600 = 8;
										}
										if (local586 == 2) {
											local600 = 13;
										}
										if (local586 == 3) {
											local600 = 35;
										}
										if (local586 == 4) {
											local600 = 2;
										}
										Static62.method1082(Static60.method1012(new Class4[] { Static101.aClass4_1391, local527.aClass4_347 }), local600, local578[local586], local520.anInt197, local35, local47);
									} else if (local586 == 2) {
										Static62.method1082(Static60.method1012(new Class4[] { Static101.aClass4_1391, local527.aClass4_347 }), 13, Static52.aClass4_676, local520.anInt197, local35, local47);
									}
								}
								Static62.method1082(Static60.method1012(new Class4[] { Static101.aClass4_1391, local527.aClass4_347 }), 1004, Static47.aClass4_602, local520.anInt197, local35, local47);
							} else if ((Static63.anInt1604 & 0x1) == 1) {
								Static62.method1082(Static60.method1012(new Class4[] { Static34.aClass4_519, Static52.aClass4_675, local527.aClass4_347 }), 44, Static92.aClass4_1188, local520.anInt197, local35, local47);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
	public static void method289() {
		for (@Pc(12) int local12 = 0; local12 < Static28.anInt868; local12++) {
			@Pc(18) int local18 = Static12.anIntArray14[local12]--;
			if (Static12.anIntArray14[local12] >= -10) {
				@Pc(89) Class9 local89 = Static101.aClass9Array1[local12];
				if (local89 == null) {
					local89 = Static114.method212(Static96.aClass64_Sub1_15, Static17.anIntArray35[local12]);
					if (local89 == null) {
						continue;
					}
					Static12.anIntArray14[local12] += local89.method213();
					Static101.aClass9Array1[local12] = local89;
				}
				if (Static12.anIntArray14[local12] < 0) {
					@Pc(219) int local219;
					if (Static94.anIntArray282[local12] == 0) {
						local219 = Static49.anInt1209;
					} else {
						@Pc(135) int local135 = (Static94.anIntArray282[local12] & 0xFF) * 128;
						@Pc(143) int local143 = Static94.anIntArray282[local12] >> 8 & 0xFF;
						@Pc(151) int local151 = Static94.anIntArray282[local12] >> 16 & 0xFF;
						@Pc(161) int local161 = local143 * 128 + 64 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2348;
						if (local161 < 0) {
							local161 = -local161;
						}
						@Pc(175) int local175 = local151 * 128 + 64 - Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1.anInt2342;
						if (local175 < 0) {
							local175 = -local175;
						}
						@Pc(190) int local190 = local175 + local161 - 128;
						if (local190 > local135) {
							Static12.anIntArray14[local12] = -100;
							continue;
						}
						if (local190 < 0) {
							local190 = 0;
						}
						local219 = (local135 - local190) * Static93.anInt2442 / local135;
					}
					@Pc(228) Class3_Sub9_Sub1 local228 = local89.method211().method1612(Static68.aClass57_1);
					@Pc(233) Class3_Sub3_Sub1 local233 = Static115.method345(local228, local219);
					local233.method343(Static5.anIntArray11[local12] - 1);
					Static52.aClass3_Sub3_Sub2_1.method1055(local233);
					Static12.anIntArray14[local12] = -100;
				}
			} else {
				Static28.anInt868--;
				for (@Pc(32) int local32 = local12; local32 < Static28.anInt868; local32++) {
					Static17.anIntArray35[local32] = Static17.anIntArray35[local32 + 1];
					Static101.aClass9Array1[local32] = Static101.aClass9Array1[local32 + 1];
					Static5.anIntArray11[local32] = Static5.anIntArray11[local32 + 1];
					Static12.anIntArray14[local32] = Static12.anIntArray14[local32 + 1];
					Static94.anIntArray282[local32] = Static94.anIntArray282[local32 + 1];
				}
				local12--;
			}
		}
		if (Static85.anInt1992 <= 0) {
			return;
		}
		Static85.anInt1992 -= 20;
		if (Static85.anInt1992 < 0) {
			Static85.anInt1992 = 0;
		}
		if (Static85.anInt1992 == 0 && Static90.anInt2816 != 0 && Static103.anInt2538 != -1) {
			Static67.method1108(Static103.anInt2538, Static90.anInt2816, 0, Static94.aClass64_Sub1_18);
			return;
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IBII)V")
	public static void method290(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(19) int local19;
		for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
			for (local19 = 0; local19 < 8; local19++) {
				Static38.anIntArrayArrayArray36[arg2][arg1 + local15][local19 + arg0] = 0;
			}
		}
		if (arg1 > 0) {
			for (local19 = 1; local19 < 8; local19++) {
				Static38.anIntArrayArrayArray36[arg2][arg1][arg0 + local19] = Static38.anIntArrayArrayArray36[arg2][arg1 - 1][arg0 + local19];
			}
		}
		if (arg0 > 0) {
			for (local19 = 1; local19 < 8; local19++) {
				Static38.anIntArrayArrayArray36[arg2][arg1 + local19][arg0] = Static38.anIntArrayArrayArray36[arg2][local19 + arg1][arg0 - 1];
			}
		}
		if (arg1 > 0 && Static38.anIntArrayArrayArray36[arg2][arg1 - 1][arg0] != 0) {
			Static38.anIntArrayArrayArray36[arg2][arg1][arg0] = Static38.anIntArrayArrayArray36[arg2][arg1 - 1][arg0];
		} else if (arg0 > 0 && Static38.anIntArrayArrayArray36[arg2][arg1][arg0 - 1] != 0) {
			Static38.anIntArrayArrayArray36[arg2][arg1][arg0] = Static38.anIntArrayArrayArray36[arg2][arg1][arg0 - 1];
		} else if (arg1 > 0 && arg0 > 0 && Static38.anIntArrayArrayArray36[arg2][arg1 - 1][arg0 - 1] != 0) {
			Static38.anIntArrayArrayArray36[arg2][arg1][arg0] = Static38.anIntArrayArrayArray36[arg2][arg1 - 1][arg0 - 1];
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(II)Lclient!nd;")
	public static Class3_Sub1_Sub8 method291(@OriginalArg(1) int arg0) {
		@Pc(15) Class3_Sub1_Sub8 local15 = (Class3_Sub1_Sub8) Static61.aClass8_20.method195((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static69.aClass64_65.method1625(14, arg0);
		local15 = new Class3_Sub1_Sub8();
		if (local25 != null) {
			local15.method1154(new Class3_Sub4(local25));
		}
		Static61.aClass8_20.method199((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
	public static void method292() {
		aClass4_243 = null;
		aClass4_247 = null;
		aClass4_244 = null;
		aClass4_245 = null;
		aClass4_246 = null;
		aClass64_Sub1_1 = null;
		aClass4_249 = null;
		aClass4_248 = null;
		aClass8_7 = null;
		aClass20_2 = null;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	public static void method293() {
		for (@Pc(15) Class3_Sub1_Sub1_Sub5 local15 = (Class3_Sub1_Sub1_Sub5) Static35.aClass20_4.method308(); local15 != null; local15 = (Class3_Sub1_Sub1_Sub5) Static35.aClass20_4.method309()) {
			if (local15.anInt2659 != Static49.anInt1203 || Static60.anInt1489 > local15.anInt2671) {
				local15.method1930();
			} else if (local15.anInt2675 <= Static60.anInt1489) {
				if (local15.anInt2653 > 0) {
					@Pc(48) Class3_Sub1_Sub1_Sub1_Sub1 local48 = Static90.aClass3_Sub1_Sub1_Sub1_Sub1Array9[local15.anInt2653 - 1];
					if (local48 != null && local48.anInt2342 >= 0 && local48.anInt2342 < 13312 && local48.anInt2348 >= 0 && local48.anInt2348 < 13312) {
						local15.method1807(local48.anInt2342, Static60.anInt1489, Static82.method1293(local48.anInt2342, local15.anInt2659, local48.anInt2348) - local15.anInt2660, local48.anInt2348);
					}
				}
				if (local15.anInt2653 < 0) {
					@Pc(101) int local101 = -local15.anInt2653 - 1;
					@Pc(110) Class3_Sub1_Sub1_Sub1_Sub2 local110;
					if (local101 == Static110.anInt2775) {
						local110 = Static71.aClass3_Sub1_Sub1_Sub1_Sub2_1;
					} else {
						local110 = Static7.aClass3_Sub1_Sub1_Sub1_Sub2Array1[local101];
					}
					if (local110 != null && local110.anInt2342 >= 0 && local110.anInt2342 < 13312 && local110.anInt2348 >= 0 && local110.anInt2348 < 13312) {
						local15.method1807(local110.anInt2342, Static60.anInt1489, Static82.method1293(local110.anInt2342, local15.anInt2659, local110.anInt2348) - local15.anInt2660, local110.anInt2348);
					}
				}
				local15.method1810(Static85.anInt1995);
				Static38.aClass61_30.method1318(Static49.anInt1203, (int) local15.aDouble8, (int) local15.aDouble4, (int) local15.aDouble3, 60, local15, local15.anInt2672, -1, false);
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BILclient!rd;)Lclient!uc;")
	public static Class3_Sub1_Sub4_Sub3 method294(@OriginalArg(1) int arg0, @OriginalArg(2) Class64 arg1) {
		return Static73.method1182(arg0, arg1) ? Static54.method900() : null;
	}
}
