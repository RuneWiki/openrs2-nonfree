import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!av", name = "C", descriptor = "I")
	public static int anInt517;

	@OriginalMember(owner = "client!av", name = "V", descriptor = "I")
	public static int anInt531;

	@OriginalMember(owner = "client!av", name = "F", descriptor = "J")
	public static long aLong14 = -1L;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Z")
	public static boolean method537(@OriginalArg(0) int arg0) {
		return arg0 == 1 || arg0 == 3 || arg0 == 5;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZIZ)V")
	public static void method538(@OriginalArg(1) boolean arg0) {
		Static330.anInt5768 = 2;
		Static568.aBoolean763 = arg0;
		Static92.anInt9993 = 22050;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
	public static void method539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static512.aClass126_22 == null) {
			return;
		}
		@Pc(14) int local14 = Static116.anInt1804;
		@Pc(16) int local16 = Static180.anInt3253;
		Static44.method757(arg0, arg1);
		if (Static453.anInt7627 == 0) {
			Static581.anInterface16_1 = null;
			Static581.anInterface16_1 = Static512.aClass126_22.method7029(Static512.aClass126_22.method6995(Static134.anInt2214, Static444.anInt7482), Static512.aClass126_22.method6978(Static134.anInt2214, Static444.anInt7482));
		} else if (Static453.anInt7627 == 1 && (Static311.anInterface16Array1 == null || Static116.anInt1804 != local14 || Static180.anInt3253 != local16)) {
			Static311.anInterface16Array1 = new Interface16[Static180.anInt3253 * Static116.anInt1804];
			for (@Pc(47) int local47 = 0; local47 < Static311.anInterface16Array1.length; local47++) {
				Static311.anInterface16Array1[local47] = Static512.aClass126_22.method7029(Static512.aClass126_22.method6995(Static133.anInt3875, Static549.anInt9105), Static512.aClass126_22.method6978(Static133.anInt3875, Static549.anInt9105));
			}
			Static583.anIntArray754 = new int[Static180.anInt3253 * Static116.anInt1804];
			Static137.anInt2284 = 1;
		}
		Static367.aBoolean541 = true;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!aba;IZLclient!ha;)V")
	public static void method542(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class126 arg2) {
		@Pc(17) int local17;
		if (Static113.anIntArray154 != null && arg0.aByte3 >= arg1) {
			for (local17 = 0; local17 < Static113.anIntArray154.length; local17++) {
				if (Static113.anIntArray154[local17] != -1000000 && (Static113.anIntArray154[local17] >= arg0.anIntArray4[0] || Static113.anIntArray154[local17] >= arg0.anIntArray4[1] || arg0.anIntArray4[2] <= Static113.anIntArray154[local17] || Static113.anIntArray154[local17] >= arg0.anIntArray4[3]) && (arg0.anIntArray5[0] <= Static126.anIntArray168[local17] || Static126.anIntArray168[local17] >= arg0.anIntArray5[1] || Static126.anIntArray168[local17] >= arg0.anIntArray5[2] || arg0.anIntArray5[3] <= Static126.anIntArray168[local17]) && (arg0.anIntArray5[0] >= Static125.anIntArray166[local17] || arg0.anIntArray5[1] >= Static125.anIntArray166[local17] || Static125.anIntArray166[local17] <= arg0.anIntArray5[2] || Static125.anIntArray166[local17] <= arg0.anIntArray5[3]) && (Static192.anIntArray689[local17] >= arg0.anIntArray3[0] || Static192.anIntArray689[local17] >= arg0.anIntArray3[1] || Static192.anIntArray689[local17] >= arg0.anIntArray3[2] || arg0.anIntArray3[3] <= Static192.anIntArray689[local17]) && (Static460.anIntArray619[local17] <= arg0.anIntArray3[0] || arg0.anIntArray3[1] >= Static460.anIntArray619[local17] || arg0.anIntArray3[2] >= Static460.anIntArray619[local17] || arg0.anIntArray3[3] >= Static460.anIntArray619[local17])) {
					return;
				}
			}
		}
		@Pc(265) int local265;
		@Pc(285) int local285;
		@Pc(303) boolean local303;
		@Pc(331) float local331;
		if (arg0.aByte2 == 1) {
			local17 = Static597.anInt9765 + arg0.aShort1 - Static484.anInt8046;
			if (local17 >= 0 && local17 <= Static597.anInt9765 + Static597.anInt9765) {
				local265 = Static597.anInt9765 + arg0.aShort3 - Static263.anInt4379;
				if (local265 < 0) {
					local265 = 0;
				} else if (Static597.anInt9765 + Static597.anInt9765 < local265) {
					return;
				}
				local285 = Static597.anInt9765 + arg0.aShort4 - Static263.anInt4379;
				if (Static597.anInt9765 + Static597.anInt9765 < local285) {
					local285 = Static597.anInt9765 + Static597.anInt9765;
				} else if (local285 < 0) {
					return;
				}
				local303 = false;
				while (local265 <= local285) {
					if (Static601.aBooleanArrayArray17[local17][local265++]) {
						local303 = true;
						break;
					}
				}
				if (local303) {
					local331 = (float) (Static384.anInt6759 - arg0.anIntArray5[0]);
					if (local331 < 0.0F) {
						local331 *= -1.0F;
					}
					if (!(float) Static289.anInt4704 > local331 && (Static493.method7266(0, arg0) && (Static493.method7266(1, arg0) && (Static493.method7266(2, arg0) && Static493.method7266(3, arg0))))) {
						Static195.aClass4Array1[Static510.anInt8556++] = arg0;
					}
				}
			}
		} else if (arg0.aByte2 == 2) {
			local17 = Static597.anInt9765 + arg0.aShort3 - Static263.anInt4379;
			if (local17 >= 0 && Static597.anInt9765 + Static597.anInt9765 >= local17) {
				local265 = arg0.aShort1 + Static597.anInt9765 - Static484.anInt8046;
				if (local265 < 0) {
					local265 = 0;
				} else if (local265 > Static597.anInt9765 + Static597.anInt9765) {
					return;
				}
				local285 = arg0.aShort2 + Static597.anInt9765 - Static484.anInt8046;
				if (local285 > Static597.anInt9765 + Static597.anInt9765) {
					local285 = Static597.anInt9765 + Static597.anInt9765;
				} else if (local285 < 0) {
					return;
				}
				local303 = false;
				while (local285 >= local265) {
					if (Static601.aBooleanArrayArray17[local265++][local17]) {
						local303 = true;
						break;
					}
				}
				if (local303) {
					local331 = (float) (Static551.anInt9128 - arg0.anIntArray3[0]);
					if (local331 < 0.0F) {
						local331 *= -1.0F;
					}
					if (!((float) Static289.anInt4704 > local331) && (Static493.method7266(0, arg0) && (Static493.method7266(1, arg0) && (Static493.method7266(2, arg0) && Static493.method7266(3, arg0))))) {
						Static195.aClass4Array1[Static510.anInt8556++] = arg0;
					}
				}
			}
		} else if (arg0.aByte2 == 16 || arg0.aByte2 == 8) {
			local17 = arg0.aShort1 + Static597.anInt9765 - Static484.anInt8046;
			if (local17 >= 0 && local17 <= Static597.anInt9765 + Static597.anInt9765) {
				local265 = Static597.anInt9765 + arg0.aShort3 - Static263.anInt4379;
				if (local265 >= 0 && local265 <= Static597.anInt9765 + Static597.anInt9765 && Static601.aBooleanArrayArray17[local17][local265]) {
					@Pc(599) float local599 = (float) (Static384.anInt6759 - arg0.anIntArray5[0]);
					if (local599 < 0.0F) {
						local599 *= -1.0F;
					}
					@Pc(616) float local616 = (float) (Static551.anInt9128 - arg0.anIntArray3[0]);
					if (local616 < 0.0F) {
						local616 *= -1.0F;
					}
					if ((!((float) Static289.anInt4704 > local599) || !((float) Static289.anInt4704 > local616)) && (Static493.method7266(0, arg0) && (Static493.method7266(1, arg0) && (Static493.method7266(2, arg0) && Static493.method7266(3, arg0))))) {
						Static195.aClass4Array1[Static510.anInt8556++] = arg0;
					}
				}
			}
		} else if (arg0.aByte2 == 4) {
			@Pc(680) float local680 = (float) (arg0.anIntArray4[0] - Static352.anInt6299);
			if (!(local680 <= (float) Static356.anInt6349)) {
				local265 = arg0.aShort3 + Static597.anInt9765 - Static263.anInt4379;
				if (local265 < 0) {
					local265 = 0;
				} else if (Static597.anInt9765 + Static597.anInt9765 < local265) {
					return;
				}
				local285 = Static597.anInt9765 + arg0.aShort4 - Static263.anInt4379;
				if (Static597.anInt9765 + Static597.anInt9765 < local285) {
					local285 = Static597.anInt9765 + Static597.anInt9765;
				} else if (local285 < 0) {
					return;
				}
				@Pc(741) int local741 = arg0.aShort1 + Static597.anInt9765 - Static484.anInt8046;
				if (local741 < 0) {
					local741 = 0;
				} else if (local741 > Static597.anInt9765 + Static597.anInt9765) {
					return;
				}
				@Pc(766) int local766 = Static597.anInt9765 + arg0.aShort2 - Static484.anInt8046;
				if (local766 > Static597.anInt9765 + Static597.anInt9765) {
					local766 = Static597.anInt9765 + Static597.anInt9765;
				} else if (local766 < 0) {
					return;
				}
				@Pc(787) boolean local787 = false;
				label283: for (@Pc(789) int local789 = local741; local789 <= local766; local789++) {
					for (@Pc(793) int local793 = local265; local793 <= local285; local793++) {
						if (Static601.aBooleanArrayArray17[local789][local793]) {
							local787 = true;
							break label283;
						}
					}
				}
				if (local787 && (Static493.method7266(0, arg0) && (Static493.method7266(1, arg0) && (Static493.method7266(2, arg0) && Static493.method7266(3, arg0))))) {
					Static195.aClass4Array1[Static510.anInt8556++] = arg0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I[I[IZZBII[I[IIIII[III[[[B)V")
	public static void method544(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) boolean arg3, @OriginalArg(5) byte arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(13) int arg11, @OriginalArg(14) int[] arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) byte[][][] arg15) {
		if (Static453.anInt7627 == -1) {
			return;
		}
		@Pc(14) int[] local14 = Static512.aClass126_22.Y();
		@Pc(18) int local18 = local14[0];
		@Pc(22) int local22 = local14[1];
		@Pc(26) int local26 = local14[2];
		@Pc(30) int local30 = local14[3];
		@Pc(32) int local32 = local26;
		@Pc(34) int local34 = local30;
		if (Static453.anInt7627 == 1) {
			local32 = (int) ((double) Static554.anInt9157 * (double) local26 / (double) Static444.anInt7482);
			local34 = (int) ((double) Static554.anInt9157 * (double) local30 / (double) Static444.anInt7482);
		}
		if (!Static367.aBoolean541) {
			if (Static453.anInt7627 == 1) {
				Static132.method1988();
			}
			@Pc(70) int local70 = arg13 - Static85.anInt1402;
			@Pc(75) int local75 = arg9 - Static327.anInt5730;
			@Pc(80) int local80 = arg11 - Static614.anInt10019;
			@Pc(102) int local102 = (int) ((Static514.aDouble29 * (double) local80 + (double) local70 * Static488.aDouble24 + (double) local75 * Static475.aDouble31) * (double) local32 / (double) arg14);
			@Pc(124) int local124 = (int) ((double) local34 * (Static570.aDouble33 * (double) local80 + Static272.aDouble16 * (double) local70 + (double) local75 * Static115.aDouble2) / (double) arg14);
			@Pc(139) double local139 = Static548.aDouble32 * (double) local75 + (double) local70 * Static543.aDouble35 + Static102.aDouble1 * (double) local80;
			@Pc(146) int local146 = local102 + Static503.anInt3942 - Static334.anInt5797;
			@Pc(154) int local154 = Static262.anInt4378 + local124 - Static154.anInt2453;
			@Pc(158) int local158 = anInt517 + local146;
			@Pc(162) int local162 = Static554.anInt9157 + local154;
			if (local146 >= 0 && local154 >= 0 && local158 <= Static134.anInt2214 && local162 <= Static444.anInt7482 || Static453.anInt7627 == 2) {
				Static355.anInt6322 = local154;
				if (Static453.anInt7627 == 2) {
					Static365.aDouble19 = -local139;
				}
				Static463.anInt7854 = local146;
			} else if (local158 > 0 && local162 > 0 && Static134.anInt2214 > local146 && local154 < Static444.anInt7482) {
				@Pc(216) int local216 = local146 - Static503.anInt3942;
				@Pc(221) int local221 = local154 - Static262.anInt4378;
				@Pc(223) int local223 = 0;
				@Pc(225) int local225 = 0;
				@Pc(227) int local227 = 0;
				@Pc(229) int local229 = 0;
				@Pc(231) double local231 = 0.0D;
				if (Static453.anInt7627 == 0) {
					local231 = Static365.aDouble19 + local139;
					local223 = local216;
					local225 = local221;
				} else if (Static453.anInt7627 == 1) {
					local227 = local216 / Static133.anInt3875;
					local229 = local221 / Static549.anInt9105;
					local225 = Static549.anInt9105 * local229;
					local223 = local227 * Static133.anInt3875;
					local231 = (double) (local225 * local221 + local216 * local223) * (Static365.aDouble19 + local139) / (double) (local221 * local221 + local216 * local216);
				}
				local231 = -local231;
				@Pc(294) int local294 = 0;
				@Pc(296) int local296 = 0;
				@Pc(298) int local298 = 0;
				@Pc(300) int local300 = 0;
				@Pc(302) int local302 = 0;
				@Pc(304) int local304 = 0;
				@Pc(311) int local311;
				@Pc(316) int local316;
				@Pc(330) int local330;
				@Pc(318) int local318;
				if (local223 >= 0) {
					local311 = 0;
					local316 = Static134.anInt2214 - local223;
					local318 = local223;
					if (Static453.anInt7627 == 1) {
						local298 = Static116.anInt1804 - local227;
						local302 = local227;
					}
					local330 = local316;
				} else {
					local330 = 0;
					local311 = -local223;
					local316 = Static134.anInt2214 + local223;
					if (Static453.anInt7627 == 1) {
						local302 = -local227;
						local298 = 0;
					}
					local318 = local311;
				}
				@Pc(359) int local359;
				@Pc(363) int local363;
				@Pc(356) int local356;
				@Pc(365) int local365;
				@Pc(383) int local383;
				if (local225 < 0) {
					local356 = 0;
					local359 = -local225;
					local363 = local225 + Static444.anInt7482;
					local365 = local359;
					if (Static453.anInt7627 == 1) {
						local294 = 0;
						local296 = -local229;
						local300 = local296;
						local304 = local229 + Static180.anInt3253;
					}
					local383 = local359;
				} else {
					local363 = Static444.anInt7482 - local225;
					local359 = 0;
					local356 = local363;
					if (Static453.anInt7627 == 1) {
						local294 = Static180.anInt3253 - local229;
						local296 = local229;
						local300 = 0;
						local304 = local294;
					}
					local365 = local225;
					local383 = 0;
				}
				@Pc(416) Class363 local416 = Static185.aClass43_1.aClass363_2;
				@Pc(430) int local430;
				for (@Pc(421) Class14_Sub10 local421 = (Class14_Sub10) local416.method8484(); local421 != null; local421 = (Class14_Sub10) local416.method8478()) {
					@Pc(426) Class14_Sub9[] local426 = local421.aClass14_Sub9Array1;
					@Pc(428) boolean local428 = true;
					for (local430 = 0; local430 < local426.length; local430++) {
						@Pc(436) Class14_Sub9 local436 = local426[local430];
						@Pc(439) int local439 = local436.anInt9898;
						@Pc(442) int local442 = local436.anInt9897;
						@Pc(445) int local445 = local436.anInt9896;
						@Pc(448) int local448 = local436.anInt9894;
						@Pc(455) int local455;
						local436.anInt9896 = local455 = local445 - local223;
						@Pc(463) int local463;
						local436.anInt9898 = local463 = local439 - local223;
						@Pc(471) int local471;
						local436.anInt9894 = local471 = local448 - local225;
						@Pc(475) int local475 = local436.anInt9895;
						@Pc(482) int local482;
						local436.anInt9897 = local482 = local442 - local225;
						if (local428) {
							@Pc(499) int local499 = (local463 < local455 ? local463 : local455) - local475;
							if (local499 <= Static134.anInt2214) {
								@Pc(512) int local512 = (local482 < local471 ? local482 : local471) - local475;
								if (local512 <= Static444.anInt7482) {
									@Pc(528) int local528 = local475 + (local463 >= local455 ? local463 : local455);
									if (local528 >= 0) {
										@Pc(544) int local544 = (local482 < local471 ? local471 : local482) + local475;
										if (local544 >= 0) {
											local428 = false;
										}
									}
								}
							}
						}
					}
					if (local428) {
						local421.method8904();
						Static435.method6488(local421);
					}
				}
				if (Static453.anInt7627 == 0) {
					Static512.aClass126_22.method7013(Static581.anInterface16_1);
				}
				Static512.aClass126_22.F(-local223, -local225);
				Static512.aClass126_22.b(local311, local359, local316, local363, local231);
				Static293.method4314(local231 + Static365.aDouble19);
				Static400.aDouble21 = local231 + Static365.aDouble19;
				if (Static453.anInt7627 == 1) {
					Static218.anInt3743 = local18 - local223 - Static334.anInt5797;
					Static587.anInt9616 = local34;
					Static443.anInt7472 = local32;
					Static394.anInt6874 = local22 - Static154.anInt2453 - local225;
					Static512.aClass126_22.DA(Static218.anInt3743, Static394.anInt6874, Static443.anInt7472, Static587.anInt9616);
				} else {
					Static443.anInt7472 = local32;
					Static394.anInt6874 = local22 + Static262.anInt4378 - Static154.anInt2453 - local225;
					Static218.anInt3743 = Static503.anInt3942 + local18 - local223 - Static334.anInt5797;
					Static587.anInt9616 = local34;
					Static512.aClass126_22.DA(Static218.anInt3743, Static394.anInt6874, Static443.anInt7472, Static587.anInt9616);
				}
				Static276.method7932(Static185.aClass43_1);
				if (local365 > 0) {
					Static512.aClass126_22.KA(0, local356, Static134.anInt2214, local356 + local365);
					Static512.aClass126_22.ya();
					Static512.aClass126_22.GA(Static290.anInt4706);
					Static374.method5828(arg10, arg13, arg9, arg11, arg15, arg1, arg7, arg12, arg2, arg8, arg0, arg4, arg5, arg6, arg3, arg14, 1, false);
				}
				if (local318 > 0) {
					Static512.aClass126_22.KA(local330, local383, local318 + local330, local383 + local363);
					Static512.aClass126_22.ya();
					Static512.aClass126_22.GA(Static290.anInt4706);
					Static374.method5828(arg10, arg13, arg9, arg11, arg15, arg1, arg7, arg12, arg2, arg8, arg0, arg4, arg5, arg6, arg3, arg14, 1, false);
				}
				Static512.aClass126_22.la();
				Static65.method1104();
				if (Static453.anInt7627 == 0) {
					Static512.aClass126_22.method7061();
				}
				Static334.anInt5797 += local223;
				Static154.anInt2453 += local225;
				Static365.aDouble19 += local231;
				Static463.anInt7854 = local102 + Static503.anInt3942 - Static334.anInt5797;
				Static355.anInt6322 = Static262.anInt4378 + local124 - Static154.anInt2453;
				if (Static453.anInt7627 == 1) {
					Static607.anInt9954 += local227;
					Static306.anInt4861 += local229;
					for (@Pc(791) int local791 = 0; local791 < Static180.anInt3253; local791++) {
						@Pc(802) int local802 = Static561.method7890(Static180.anInt3253, local791 + Static306.anInt4861) * Static116.anInt1804;
						for (local430 = 0; local430 < Static116.anInt1804; local430++) {
							@Pc(815) int local815 = local802 + Static561.method7890(Static116.anInt1804, local430 + Static607.anInt9954);
							@Pc(860) boolean local860 = local294 <= local791 && local791 < local296 + local294 || local791 >= local300 && local791 < local304 + local300 && local298 <= local430 && local298 + local302 > local430;
							Static311.anInterface16Array1[local815].method8546(Static133.anInt3875 * local430, local791 * Static549.anInt9105, Static133.anInt3875, Static549.anInt9105, local860);
						}
					}
				}
			} else {
				Static367.aBoolean541 = true;
			}
		}
		if (Static367.aBoolean541) {
			Static327.anInt5730 = arg9;
			Static463.anInt7854 = Static503.anInt3942;
			Static614.anInt10019 = arg11;
			Static355.anInt6322 = Static262.anInt4378;
			Static365.aDouble19 = 0.0D;
			Static154.anInt2453 = 0;
			Static334.anInt5797 = 0;
			Static85.anInt1402 = arg13;
			if (Static453.anInt7627 == 0) {
				Static512.aClass126_22.method7013(Static581.anInterface16_1);
			}
			Static512.aClass126_22.la();
			Static512.aClass126_22.ya();
			Static512.aClass126_22.GA(Static290.anInt4706);
			Static504.aClass117_7.method7254(Static85.anInt1402, Static327.anInt5730, Static614.anInt10019, Static129.anInt6333, Static4.anInt33, Static363.anInt6417);
			Static512.aClass126_22.method7040(Static504.aClass117_7);
			if (Static453.anInt7627 == 1) {
				Static218.anInt3743 = local18;
				Static587.anInt9616 = local34;
				Static394.anInt6874 = local22;
				Static443.anInt7472 = local32;
				Static512.aClass126_22.DA(Static218.anInt3743, Static394.anInt6874, Static443.anInt7472, Static587.anInt9616);
			} else {
				Static587.anInt9616 = local34;
				Static443.anInt7472 = local32;
				Static394.anInt6874 = local22 + Static262.anInt4378;
				Static218.anInt3743 = Static503.anInt3942 + local18;
				Static512.aClass126_22.DA(Static218.anInt3743, Static394.anInt6874, Static443.anInt7472, Static587.anInt9616);
			}
			Static400.aDouble21 = 0.0D;
			Static185.aClass43_1.method869();
			Static276.method7932(Static185.aClass43_1);
			Static374.method5828(arg10, arg13, arg9, arg11, arg15, arg1, arg7, arg12, arg2, arg8, arg0, arg4, arg5, arg6, arg3, arg14, 1, false);
			Static65.method1104();
			Static367.aBoolean541 = false;
			if (Static453.anInt7627 == 0) {
				Static512.aClass126_22.method7061();
			}
			if (Static453.anInt7627 == 1) {
				Static454.method6740();
			}
		}
		if (Static453.anInt7627 == 0) {
			Static581.anInterface16_1.method8545(Static463.anInt7854, Static355.anInt6322, anInt517, Static554.anInt9157, 0, 0);
		}
		Static137.anInt2284++;
		Static293.method4314(Static365.aDouble19);
		Static134.aDouble14 = Static365.aDouble19;
		if (Static453.anInt7627 == 0 || Static453.anInt7627 == 2) {
			if (Static453.anInt7627 == 2) {
				Static512.aClass126_22.GA(Static290.anInt4706);
				Static512.aClass126_22.ya();
			}
			Static649.anInt10498 = local22 + Static262.anInt4378 - Static154.anInt2453 - Static355.anInt6322;
			Static442.anInt7458 = local32;
			Static29.anInt572 = Static503.anInt3942 + local18 - Static334.anInt5797 - Static463.anInt7854;
			Static402.anInt9328 = local34;
			Static512.aClass126_22.DA(Static29.anInt572, Static649.anInt10498, Static442.anInt7458, Static402.anInt9328);
		} else if (Static453.anInt7627 == 1) {
			Static29.anInt572 = local18 - Static334.anInt5797;
			Static649.anInt10498 = local22 - Static154.anInt2453;
			Static442.anInt7458 = local32;
			Static402.anInt9328 = local34;
			Static512.aClass126_22.DA(Static29.anInt572, Static649.anInt10498, Static442.anInt7458, Static402.anInt9328);
			Static512.aClass126_22.KA(Static463.anInt7854, Static355.anInt6322, Static463.anInt7854 + anInt517, Static355.anInt6322 - -Static554.anInt9157);
		}
		Static374.method5828(arg10, arg13, arg9, arg11, arg15, arg1, arg7, arg12, arg2, arg8, arg0, arg4, arg5, arg6, arg3, arg14, Static453.anInt7627 == 2 ? 0 : 2, Static453.anInt7627 == 1);
		Static512.aClass126_22.la();
		Static512.aClass126_22.DA(local18, local22, local26, local30);
	}
}
