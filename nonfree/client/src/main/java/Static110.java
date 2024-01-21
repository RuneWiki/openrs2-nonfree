import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static110 {

	@OriginalMember(owner = "client!lb", name = "u", descriptor = "Lclient!ve;")
	public static Class69 aClass69_24;

	@OriginalMember(owner = "client!lb", name = "x", descriptor = "Lclient!ve;")
	public static Class69 aClass69_25;

	@OriginalMember(owner = "client!lb", name = "y", descriptor = "Lclient!ve;")
	public static Class69 aClass69_26;

	@OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
	public static int anInt2525;

	@OriginalMember(owner = "client!lb", name = "r", descriptor = "Lclient!ri;")
	public static final Class86 aClass86_39 = new Class86(64);

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "[Lclient!dj;")
	public static final Class24[] aClass24Array17 = new Class24[200];

	@OriginalMember(owner = "client!lb", name = "E", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_746 = Static81.method1507("Enter your username (V password)3");

	@OriginalMember(owner = "client!lb", name = "w", descriptor = "Lclient!dj;")
	public static Class24 aClass24_745 = aClass24_746;

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "[Lclient!ca;")
	public static final Class5_Sub2_Sub1[] aClass5_Sub2_Sub1Array1 = new Class5_Sub2_Sub1[2048];

	@OriginalMember(owner = "client!lb", name = "F", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_747 = Static81.method1507("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!lb", name = "G", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_748 = Static81.method1507("Schlie-8en");

	@OriginalMember(owner = "client!lb", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[104][104];

	@OriginalMember(owner = "client!lb", name = "I", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_749 = Static81.method1507("(U0a )2 non)2existant gosub script)2num: ");

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Z")
	public static boolean method1903(@OriginalArg(0) int arg0) {
		if (Static137.aBooleanArray14[arg0]) {
			return true;
		} else if (Static133.aClass69_31.method2210(arg0)) {
			@Pc(23) int local23 = Static133.aClass69_31.method2216(arg0);
			if (local23 == 0) {
				Static137.aBooleanArray14[arg0] = true;
				return true;
			}
			if (Static4.aClass98ArrayArray3[arg0] == null) {
				Static4.aClass98ArrayArray3[arg0] = new Class98[local23];
			}
			for (@Pc(47) int local47 = 0; local47 < local23; local47++) {
				if (Static4.aClass98ArrayArray3[arg0][local47] == null) {
					@Pc(60) byte[] local60 = Static133.aClass69_31.method2208(arg0, local47);
					if (local60 != null) {
						Static4.aClass98ArrayArray3[arg0][local47] = new Class98();
						Static4.aClass98ArrayArray3[arg0][local47].anInt4357 = (arg0 << 16) + local47;
						if (local60[0] == -1) {
							Static4.aClass98ArrayArray3[arg0][local47].method3341(new Class1_Sub7(local60));
						} else {
							Static4.aClass98ArrayArray3[arg0][local47].method3334(new Class1_Sub7(local60));
						}
					}
				}
			}
			Static137.aBooleanArray14[arg0] = true;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIILclient!fj;I)V")
	public static void method1904(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class1_Sub7 arg5, @OriginalArg(7) int arg6) {
		@Pc(20) int local20;
		if (arg2 < 0 || arg2 >= 104 || arg3 < 0 || arg3 >= 104) {
			while (true) {
				local20 = arg5.method2771();
				if (local20 == 0) {
					break;
				}
				if (local20 == 1) {
					arg5.method2771();
					break;
				}
				if (local20 <= 49) {
					arg5.method2771();
				}
			}
			return;
		}
		Static43.aByteArrayArrayArray3[arg6][arg2][arg3] = 0;
		while (true) {
			local20 = arg5.method2771();
			if (local20 == 0) {
				if (arg6 == 0) {
					Static186.anIntArrayArrayArray2[0][arg2][arg3] = -Static187.method3220(arg3 + arg4 + 556238, arg0 + arg2 + 932731) * 8;
				} else {
					Static186.anIntArrayArrayArray2[arg6][arg2][arg3] = Static186.anIntArrayArrayArray2[arg6 - 1][arg2][arg3] - 240;
				}
				break;
			}
			if (local20 == 1) {
				@Pc(116) int local116 = arg5.method2771();
				if (local116 == 1) {
					local116 = 0;
				}
				if (arg6 == 0) {
					Static186.anIntArrayArrayArray2[0][arg2][arg3] = -local116 * 8;
				} else {
					Static186.anIntArrayArrayArray2[arg6][arg2][arg3] = Static186.anIntArrayArrayArray2[arg6 - 1][arg2][arg3] - local116 * 8;
				}
				break;
			}
			if (local20 <= 49) {
				Static177.aByteArrayArrayArray12[arg6][arg2][arg3] = arg5.method2770();
				Static144.aByteArrayArrayArray8[arg6][arg2][arg3] = (byte) ((local20 - 2) / 4);
				Static195.aByteArrayArrayArray13[arg6][arg2][arg3] = (byte) (arg1 + local20 - 2 & 0x3);
			} else if (local20 <= 81) {
				Static43.aByteArrayArrayArray3[arg6][arg2][arg3] = (byte) (local20 - 49);
			} else {
				Static27.aByteArrayArrayArray1[arg6][arg2][arg3] = (byte) (local20 - 81);
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[Lclient!vc;IIIIIII)V")
	public static void method1905(@OriginalArg(0) int arg0, @OriginalArg(1) Class98[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		for (@Pc(3) int local3 = 0; local3 < arg1.length; local3++) {
			@Pc(9) Class98 local9 = arg1[local3];
			if (local9 != null && (!local9.aBoolean211 || local9.anInt4373 == 0 || local9.aBoolean213 || Static105.method1831(local9) != 0 || local9 == Static56.aClass98_8 || local9.anInt4351 == 1338) && local9.anInt4424 == arg2 && (!local9.aBoolean211 || !Static49.method906(local9))) {
				@Pc(54) int local54 = local9.anInt4356 + arg0;
				@Pc(59) int local59 = local9.anInt4358 + arg4;
				if (local9 == Static208.aClass98_21) {
					Static179.aBoolean186 = true;
					Static69.anInt1687 = local59;
					Static63.anInt1609 = local54;
				}
				@Pc(82) int local82;
				@Pc(76) int local76;
				@Pc(80) int local80;
				@Pc(78) int local78;
				if (local9.anInt4373 == 2) {
					local76 = arg6;
					local78 = arg7;
					local80 = arg3;
					local82 = arg5;
				} else {
					local82 = local54 > arg5 ? local54 : arg5;
					@Pc(100) int local100 = local9.anInt4400 + local54;
					local76 = arg6 < local59 ? local59 : arg6;
					@Pc(116) int local116 = local9.anInt4403 + local59;
					if (local9.anInt4373 == 9) {
						local100++;
						local116++;
					}
					local80 = arg3 <= local100 ? arg3 : local100;
					local78 = local116 >= arg7 ? arg7 : local116;
				}
				if (!local9.aBoolean211 || local80 > local82 && local76 < local78) {
					if (local9.anInt4373 == 0) {
						if (!local9.aBoolean211 && Static49.method906(local9) && local9 != Static200.aClass98_20) {
							continue;
						}
						if (local9.aBoolean208 && local82 <= Static24.anInt661 && Static7.anInt174 >= local76 && Static24.anInt661 < local80 && local78 > Static7.anInt174) {
							for (@Pc(213) Class1_Sub16 local213 = (Class1_Sub16) Static165.aClass87_24.method2827(); local213 != null; local213 = (Class1_Sub16) Static165.aClass87_24.method2830()) {
								if (local213.aBoolean125) {
									local213.method3563();
								}
							}
							for (@Pc(233) Class1_Sub16 local233 = (Class1_Sub16) Static49.aClass87_9.method2827(); local233 != null; local233 = (Class1_Sub16) Static49.aClass87_9.method2830()) {
								if (local233.aBoolean125) {
									local233.method3563();
								}
							}
							Static107.aBoolean115 = false;
							if (Static181.anInt4037 == 0) {
								Static56.aClass98_8 = null;
								Static208.aClass98_21 = null;
							}
						}
					}
					if (local9.aBoolean211) {
						@Pc(281) boolean local281;
						if (local82 <= Static24.anInt661 && Static7.anInt174 >= local76 && local80 > Static24.anInt661 && Static7.anInt174 < local78) {
							local281 = true;
						} else {
							local281 = false;
						}
						@Pc(287) boolean local287 = false;
						@Pc(289) boolean local289 = false;
						if (Static170.anInt3792 == 1 && local82 <= Static157.anInt3462 && Static92.anInt2141 >= local76 && local80 > Static157.anInt3462 && local78 > Static92.anInt2141) {
							local289 = true;
						}
						if (Static188.anInt4176 == 1 && local281) {
							local287 = true;
						}
						if (local289) {
							Static160.method3566(Static157.anInt3462 - local54, -local59 + Static92.anInt2141, local9);
						}
						if (Static208.aClass98_21 != null && local9 != Static208.aClass98_21 && local281 && Static114.method1974(Static105.method1831(local9))) {
							Static181.aClass98_15 = local9;
						}
						if (Static56.aClass98_8 == local9) {
							Static188.anInt4179 = local54;
							Static149.aBoolean154 = true;
							Static63.anInt1594 = local59;
						}
						if (local9.aBoolean213 || local9.anInt4351 != 0) {
							@Pc(383) Class1_Sub16 local383;
							if (local281 && Static188.anInt4177 != 0 && local9.anObjectArray5 != null) {
								local383 = new Class1_Sub16();
								local383.aClass98_13 = local9;
								local383.anInt2760 = Static188.anInt4177;
								local383.aBoolean125 = true;
								local383.anObjectArray1 = local9.anObjectArray5;
								Static165.aClass87_24.method2823(local383);
							}
							if (Static208.aClass98_21 != null || Static194.aClass98_17 != null || Static53.aBoolean73 || local9.anInt4351 != 1400 && Static107.aBoolean115) {
								local281 = false;
								local287 = false;
								local289 = false;
							}
							if (local9.anInt4351 == 1337) {
								Static199.method2199(local9);
								continue;
							}
							if (local9.anInt4351 == 1338) {
								if (local289) {
									Static101.method1739(local9, Static157.anInt3462 - local54, Static92.anInt2141 - local59);
								}
								continue;
							}
							@Pc(511) int local511;
							@Pc(486) int local486;
							if (local9.anInt4351 == 1400) {
								Static44.aClass98_5 = local9;
								if (local289) {
									if (Static116.aBooleanArray11[82] && Static27.anInt728 > 0) {
										local486 = Static174.anInt3876 + (int) ((double) (Static157.anInt3462 - local54 - local9.anInt4400 / 2) * 2.0D / Static178.aDouble11) + Static2.anInt111;
										local511 = Static122.anInt2713 + Static189.anInt4212 - Static3.anInt118 - (int) ((double) (-local59 + (Static92.anInt2141 - local9.anInt4403 / 2)) * 2.0D / Static178.aDouble11);
										@Pc(564) Class24 local564 = Static63.method1281(new Class24[] { Static46.aClass24_291, Static175.method3020(local486 >> 6), Static180.aClass24_1163, Static175.method3020(local511 >> 6), Static180.aClass24_1163, Static175.method3020(local486 & 0x3F), Static180.aClass24_1163, Static175.method3020(local511 & 0x3F) });
										local564.method776();
										Static183.method3169(local564);
										Static148.method2539();
										continue;
									}
									Static159.anInt3546 = Static3.anInt118;
									Static190.anInt4266 = Static7.anInt174;
									Static119.anInt2660 = Static2.anInt111;
									Static188.anInt4178 = Static24.anInt661;
									Static107.aBoolean115 = true;
									continue;
								}
								if (local287 && Static107.aBoolean115) {
									Static148.method2543(Static119.anInt2660 + (int) ((double) (Static188.anInt4178 - Static24.anInt661) * 2.0D / Static29.aDouble1));
									Static200.method3375((int) ((double) (Static190.anInt4266 - Static7.anInt174) * 2.0D / Static29.aDouble1) + Static159.anInt3546);
									continue;
								}
								Static107.aBoolean115 = false;
								continue;
							}
							if (local9.anInt4351 == 1401) {
								if (local287) {
									Static54.method2988(local9.anInt4400, Static7.anInt174 - local59, local9.anInt4403, Static24.anInt661 - local54);
								}
								continue;
							}
							if (!local9.aBoolean204 && local289) {
								local9.aBoolean204 = true;
								if (local9.anObjectArray24 != null) {
									local383 = new Class1_Sub16();
									local383.anObjectArray1 = local9.anObjectArray24;
									local383.aClass98_13 = local9;
									local383.anInt2762 = Static157.anInt3462 - local54;
									local383.anInt2760 = Static92.anInt2141 - local59;
									local383.aBoolean125 = true;
									Static165.aClass87_24.method2823(local383);
								}
							}
							if (local9.aBoolean204 && local287 && local9.anObjectArray27 != null) {
								local383 = new Class1_Sub16();
								local383.anInt2762 = Static24.anInt661 - local54;
								local383.anObjectArray1 = local9.anObjectArray27;
								local383.anInt2760 = Static7.anInt174 - local59;
								local383.aBoolean125 = true;
								local383.aClass98_13 = local9;
								Static165.aClass87_24.method2823(local383);
							}
							if (local9.aBoolean204 && !local287) {
								local9.aBoolean204 = false;
								if (local9.anObjectArray25 != null) {
									local383 = new Class1_Sub16();
									local383.aClass98_13 = local9;
									local383.anObjectArray1 = local9.anObjectArray25;
									local383.anInt2762 = Static24.anInt661 - local54;
									local383.aBoolean125 = true;
									local383.anInt2760 = Static7.anInt174 - local59;
									Static49.aClass87_9.method2823(local383);
								}
							}
							if (local287 && local9.anObjectArray6 != null) {
								local383 = new Class1_Sub16();
								local383.aBoolean125 = true;
								local383.aClass98_13 = local9;
								local383.anInt2760 = Static7.anInt174 - local59;
								local383.anObjectArray1 = local9.anObjectArray6;
								local383.anInt2762 = Static24.anInt661 - local54;
								Static165.aClass87_24.method2823(local383);
							}
							if (!local9.aBoolean215 && local281) {
								local9.aBoolean215 = true;
								if (local9.anObjectArray22 != null) {
									local383 = new Class1_Sub16();
									local383.anInt2762 = Static24.anInt661 - local54;
									local383.aBoolean125 = true;
									local383.anInt2760 = Static7.anInt174 - local59;
									local383.anObjectArray1 = local9.anObjectArray22;
									local383.aClass98_13 = local9;
									Static165.aClass87_24.method2823(local383);
								}
							}
							if (local9.aBoolean215 && local281 && local9.anObjectArray16 != null) {
								local383 = new Class1_Sub16();
								local383.aBoolean125 = true;
								local383.anInt2760 = Static7.anInt174 - local59;
								local383.anObjectArray1 = local9.anObjectArray16;
								local383.anInt2762 = Static24.anInt661 - local54;
								local383.aClass98_13 = local9;
								Static165.aClass87_24.method2823(local383);
							}
							if (local9.aBoolean215 && !local281) {
								local9.aBoolean215 = false;
								if (local9.anObjectArray14 != null) {
									local383 = new Class1_Sub16();
									local383.aBoolean125 = true;
									local383.aClass98_13 = local9;
									local383.anObjectArray1 = local9.anObjectArray14;
									local383.anInt2762 = Static24.anInt661 - local54;
									local383.anInt2760 = Static7.anInt174 - local59;
									Static49.aClass87_9.method2823(local383);
								}
							}
							if (local9.anObjectArray13 != null) {
								local383 = new Class1_Sub16();
								local383.anObjectArray1 = local9.anObjectArray13;
								local383.aClass98_13 = local9;
								Static91.aClass87_15.method2823(local383);
							}
							@Pc(992) int local992;
							@Pc(1004) Class1_Sub16 local1004;
							if (local9.anObjectArray4 != null && local9.anInt4406 < Static72.anInt1722) {
								if (local9.anIntArray392 == null || Static72.anInt1722 - local9.anInt4406 > 32) {
									local383 = new Class1_Sub16();
									local383.aClass98_13 = local9;
									local383.anObjectArray1 = local9.anObjectArray4;
									Static165.aClass87_24.method2823(local383);
								} else {
									label424: for (local486 = local9.anInt4406; local486 < Static72.anInt1722; local486++) {
										local511 = Static183.anIntArray357[local486 & 0x1F];
										for (local992 = 0; local992 < local9.anIntArray392.length; local992++) {
											if (local511 == local9.anIntArray392[local992]) {
												local1004 = new Class1_Sub16();
												local1004.aClass98_13 = local9;
												local1004.anObjectArray1 = local9.anObjectArray4;
												Static165.aClass87_24.method2823(local1004);
												break label424;
											}
										}
									}
								}
								local9.anInt4406 = Static72.anInt1722;
							}
							if (local9.anObjectArray21 != null && local9.anInt4352 < Static12.anInt304) {
								if (local9.anIntArray385 == null || Static12.anInt304 - local9.anInt4352 > 32) {
									local383 = new Class1_Sub16();
									local383.anObjectArray1 = local9.anObjectArray21;
									local383.aClass98_13 = local9;
									Static165.aClass87_24.method2823(local383);
								} else {
									label400: for (local486 = local9.anInt4352; local486 < Static12.anInt304; local486++) {
										local511 = Static56.anIntArray121[local486 & 0x1F];
										for (local992 = 0; local992 < local9.anIntArray385.length; local992++) {
											if (local511 == local9.anIntArray385[local992]) {
												local1004 = new Class1_Sub16();
												local1004.aClass98_13 = local9;
												local1004.anObjectArray1 = local9.anObjectArray21;
												Static165.aClass87_24.method2823(local1004);
												break label400;
											}
										}
									}
								}
								local9.anInt4352 = Static12.anInt304;
							}
							if (local9.anObjectArray15 != null && Static210.anInt4650 > local9.anInt4372) {
								if (local9.anIntArray394 == null || Static210.anInt4650 - local9.anInt4372 > 32) {
									local383 = new Class1_Sub16();
									local383.aClass98_13 = local9;
									local383.anObjectArray1 = local9.anObjectArray15;
									Static165.aClass87_24.method2823(local383);
								} else {
									label376: for (local486 = local9.anInt4372; local486 < Static210.anInt4650; local486++) {
										local511 = Static143.anIntArray269[local486 & 0x1F];
										for (local992 = 0; local992 < local9.anIntArray394.length; local992++) {
											if (local511 == local9.anIntArray394[local992]) {
												local1004 = new Class1_Sub16();
												local1004.anObjectArray1 = local9.anObjectArray15;
												local1004.aClass98_13 = local9;
												Static165.aClass87_24.method2823(local1004);
												break label376;
											}
										}
									}
								}
								local9.anInt4372 = Static210.anInt4650;
							}
							if (Static34.anInt922 > local9.anInt4393 && local9.anObjectArray10 != null) {
								local383 = new Class1_Sub16();
								local383.anObjectArray1 = local9.anObjectArray10;
								local383.aClass98_13 = local9;
								Static165.aClass87_24.method2823(local383);
							}
							if (Static127.anInt2781 > local9.anInt4393 && local9.anObjectArray9 != null) {
								local383 = new Class1_Sub16();
								local383.aClass98_13 = local9;
								local383.anObjectArray1 = local9.anObjectArray9;
								Static165.aClass87_24.method2823(local383);
							}
							if (Static54.anInt3867 > local9.anInt4393 && local9.anObjectArray28 != null) {
								local383 = new Class1_Sub16();
								local383.anObjectArray1 = local9.anObjectArray28;
								local383.aClass98_13 = local9;
								Static165.aClass87_24.method2823(local383);
							}
							if (Static137.anInt3101 > local9.anInt4393 && local9.anObjectArray20 != null) {
								local383 = new Class1_Sub16();
								local383.aClass98_13 = local9;
								local383.anObjectArray1 = local9.anObjectArray20;
								Static165.aClass87_24.method2823(local383);
							}
							if (local9.anInt4393 < Static165.anInt3678 && local9.anObjectArray29 != null) {
								local383 = new Class1_Sub16();
								local383.aClass98_13 = local9;
								local383.anObjectArray1 = local9.anObjectArray29;
								Static165.aClass87_24.method2823(local383);
							}
							local9.anInt4393 = Static60.anInt3643;
							if (local9.anObjectArray26 != null) {
								for (local486 = 0; local486 < Static161.anInt3572; local486++) {
									@Pc(1348) Class1_Sub16 local1348 = new Class1_Sub16();
									local1348.aClass98_13 = local9;
									local1348.anInt2765 = Static156.anIntArray296[local486];
									local1348.anInt2767 = Static37.anIntArray88[local486];
									local1348.anObjectArray1 = local9.anObjectArray26;
									Static165.aClass87_24.method2823(local1348);
								}
							}
						}
					}
					if (!local9.aBoolean211 && Static208.aClass98_21 == null && Static194.aClass98_17 == null && !Static53.aBoolean73) {
						if ((local9.anInt4382 >= 0 || local9.anInt4396 != 0) && local82 <= Static24.anInt661 && Static7.anInt174 >= local76 && local80 > Static24.anInt661 && Static7.anInt174 < local78) {
							if (local9.anInt4382 < 0) {
								Static200.aClass98_20 = local9;
							} else {
								Static200.aClass98_20 = arg1[local9.anInt4382];
							}
						}
						if (local9.anInt4373 == 8 && local82 <= Static24.anInt661 && local76 <= Static7.anInt174 && Static24.anInt661 < local80 && local78 > Static7.anInt174) {
							Static44.aClass98_6 = local9;
						}
						if (local9.anInt4347 > local9.anInt4403) {
							Static62.method1201(local9.anInt4403, local9.anInt4400 + local54, Static7.anInt174, local9, Static24.anInt661, local9.anInt4347, local59);
						}
					}
					if (local9.anInt4373 == 0) {
						method1905(local54 - local9.anInt4401, arg1, local9.anInt4357, local80, local59 - local9.anInt4348, local82, local76, local78);
						if (local9.aClass98Array3 != null) {
							method1905(local54 - local9.anInt4401, local9.aClass98Array3, local9.anInt4357, local80, local59 - local9.anInt4348, local82, local76, local78);
						}
						@Pc(1529) Class1_Sub11 local1529 = (Class1_Sub11) Static115.aClass57_25.method1872((long) local9.anInt4357);
						if (local1529 != null) {
							Static96.method1704(local82, local54, local1529.anInt2169, local78, local59, local80, local76);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBIII)V")
	public static void method1906(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(10) int local10 = 0; local10 < Static26.anInt679; local10++) {
			if (Static114.anIntArray203[local10] + Static150.anIntArray283[local10] > arg3 && arg0 + arg3 > Static150.anIntArray283[local10] && arg2 < Static138.anIntArray253[local10] + Static145.anIntArray274[local10] && Static145.anIntArray274[local10] < arg2 + arg1) {
				Static163.aBooleanArray17[local10] = true;
			}
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIII)V")
	public static void method1907(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg2) {
			Static39.method731(Static98.anIntArrayArray16[arg0], arg2, arg1, arg3);
		} else {
			Static39.method731(Static98.anIntArrayArray16[arg0], arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public static void method1908() {
		Static153.anIntArray291 = null;
		Static35.anIntArray360 = null;
		Static80.anIntArray164 = null;
		Static53.aByteArrayArray5 = null;
		Static148.anIntArray279 = null;
		Static85.anIntArray288 = null;
	}
}
