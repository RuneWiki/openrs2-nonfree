import java.io.IOException;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "Lclient!ne;")
	public static Class53 aClass53_1;

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "Lclient!dd;")
	public static Class14 aClass14_8;

	@OriginalMember(owner = "client!ec", name = "s", descriptor = "Lclient!dd;")
	public static Class14 aClass14_9;

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "Lclient!ic;")
	public static Class34 aClass34_448 = Static56.method816("und haben es deaktiviert)3 Klicken Sie auf der");

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "Lclient!ic;")
	public static Class34 aClass34_449 = Static56.method816("Hidden)2use");

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "Lclient!ic;")
	public static Class34 aClass34_450 = Static56.method816("da dieser Computer gegen unsere ");

	@OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
	public static int anInt844 = -1;

	@OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
	public static int anInt846 = 0;

	@OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
	public static int anInt848 = 0;

	@OriginalMember(owner = "client!ec", name = "t", descriptor = "Lclient!ic;")
	public static Class34 aClass34_451 = Static56.method816("(Y");

	@OriginalMember(owner = "client!ec", name = "w", descriptor = "I")
	public static int anInt852 = 0;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIIIIII[Lclient!wf;)V")
	public static void method523(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class8_Sub24[] arg7) {
		for (@Pc(7) int local7 = 0; local7 < arg7.length; local7++) {
			@Pc(13) Class8_Sub24 local13 = arg7[local7];
			if (local13 != null && (!local13.aBoolean117 || local13.anInt3145 == 0 || local13.aBoolean112 || Static99.method1445(local13) != 0 || Static15.aClass8_Sub24_3 == local13) && arg3 == local13.anInt3166 && (!local13.aBoolean117 || !Static5.method38(local13))) {
				@Pc(54) int local54 = arg6 + local13.anInt3093;
				@Pc(59) int local59 = local13.anInt3107 + arg4;
				if (Static93.aClass8_Sub24_7 == local13) {
					Static68.anInt1676 = local54;
					Static42.anInt1025 = local59;
					Static58.aBoolean60 = true;
				}
				@Pc(76) int local76;
				@Pc(82) int local82;
				@Pc(80) int local80;
				@Pc(78) int local78;
				@Pc(99) int local99;
				if (local13.anInt3145 == 2) {
					local76 = arg2;
					local78 = arg5;
					local80 = arg0;
					local82 = arg1;
				} else {
					@Pc(92) int local92;
					@Pc(94) int local94;
					if (local13.anInt3145 == 9) {
						local92 = local54;
						local94 = local59;
						local99 = local59 + local13.anInt3111;
						@Pc(104) int local104 = local13.anInt3154 + local54;
						if (local54 > local104) {
							local92 = local104;
							local104 = local54;
						}
						if (local99 < local59) {
							local94 = local99;
							local99 = local59;
						}
						local104++;
						local99++;
						local78 = local99 < arg5 ? local99 : arg5;
						local76 = local92 <= arg2 ? arg2 : local92;
						local82 = local94 > arg1 ? local94 : arg1;
						local80 = local104 < arg0 ? local104 : arg0;
					} else {
						local82 = local59 > arg1 ? local59 : arg1;
						local92 = local54 + local13.anInt3154;
						local76 = local54 > arg2 ? local54 : arg2;
						local94 = local13.anInt3111 + local59;
						local80 = arg0 <= local92 ? arg0 : local92;
						local78 = arg5 <= local94 ? arg5 : local94;
					}
				}
				if (!local13.aBoolean117 || local80 > local76 && local78 > local82) {
					if (local13.anInt3143 == 1337) {
						Static40.method608(local13);
					} else if (local13.anInt3143 == 1338) {
						Static105.method1476(local54, local59);
					} else {
						if (local13.anInt3145 == 0) {
							if (!local13.aBoolean117 && Static5.method38(local13) && Static15.aClass8_Sub24_4 != local13) {
								continue;
							}
							method523(local80, local82, local76, local13.anInt3124, local59 - local13.anInt3103, local78, local54 - local13.anInt3115, arg7);
							if (local13.aClass8_Sub24Array2 != null) {
								method523(local80, local82, local76, local13.anInt3124, local59 - local13.anInt3103, local78, local54 - local13.anInt3115, local13.aClass8_Sub24Array2);
							}
							@Pc(302) Class8_Sub7 local302 = (Class8_Sub7) Static31.aClass7_3.method45((long) local13.anInt3124);
							if (local302 != null) {
								Static25.method455(local59, local54, local78, local80, local302.anInt954, local82, local76);
							}
						}
						if (local13.aBoolean117) {
							@Pc(345) boolean local345;
							if (Static14.anInt366 >= local76 && Static121.anInt2909 >= local82 && local80 > Static14.anInt366 && local78 > Static121.anInt2909) {
								local345 = true;
							} else {
								local345 = false;
							}
							@Pc(351) boolean local351 = false;
							@Pc(353) boolean local353 = false;
							if (Static134.anInt3170 == 1 && local345) {
								local353 = true;
							}
							if (Static39.anInt964 == 1 && local76 <= Static3.anInt51 && local82 <= Static74.anInt1781 && Static3.anInt51 < local80 && Static74.anInt1781 < local78) {
								local351 = true;
							}
							if (local351) {
								Static132.method1838(local13, Static74.anInt1781 - local59, -local54 + Static3.anInt51);
							}
							if (Static93.aClass8_Sub24_7 != null && Static93.aClass8_Sub24_7 != local13 && local345 && Static107.method1512(Static99.method1445(local13))) {
								Static107.aClass8_Sub24_9 = local13;
							}
							if (Static15.aClass8_Sub24_3 == local13) {
								Static109.anInt2498 = local54;
								Static52.anInt1351 = local59;
								Static24.aBoolean71 = true;
							}
							if (local13.aBoolean112) {
								@Pc(447) Class8_Sub19 local447;
								if (local345 && Static129.anInt3044 != 0 && local13.anObjectArray19 != null) {
									local447 = new Class8_Sub19();
									local447.aClass8_Sub24_13 = local13;
									local447.anInt2650 = Static129.anInt3044;
									local447.anObjectArray3 = local13.anObjectArray19;
									Static128.aClass49_15.method1114(local447);
								}
								if (Static93.aClass8_Sub24_7 != null || Static115.aClass8_Sub24_10 != null || Static90.aBoolean14) {
									local345 = false;
									local351 = false;
									local353 = false;
								}
								if (!local13.aBoolean115 && local351) {
									local13.aBoolean115 = true;
									if (local13.anObjectArray5 != null) {
										local447 = new Class8_Sub19();
										local447.anInt2644 = Static3.anInt51 - local54;
										local447.anObjectArray3 = local13.anObjectArray5;
										local447.aClass8_Sub24_13 = local13;
										local447.anInt2650 = Static74.anInt1781 - local59;
										Static128.aClass49_15.method1114(local447);
									}
								}
								if (local13.aBoolean115 && local353 && local13.anObjectArray17 != null) {
									local447 = new Class8_Sub19();
									local447.anObjectArray3 = local13.anObjectArray17;
									local447.anInt2650 = Static121.anInt2909 - local59;
									local447.aClass8_Sub24_13 = local13;
									local447.anInt2644 = Static14.anInt366 - local54;
									Static128.aClass49_15.method1114(local447);
								}
								if (local13.aBoolean115 && !local353) {
									local13.aBoolean115 = false;
									if (local13.anObjectArray15 != null) {
										local447 = new Class8_Sub19();
										local447.anObjectArray3 = local13.anObjectArray15;
										local447.aClass8_Sub24_13 = local13;
										local447.anInt2644 = Static14.anInt366 - local54;
										local447.anInt2650 = Static121.anInt2909 - local59;
										Static44.aClass49_5.method1114(local447);
									}
								}
								if (local353 && local13.anObjectArray21 != null) {
									local447 = new Class8_Sub19();
									local447.anInt2650 = Static121.anInt2909 - local59;
									local447.aClass8_Sub24_13 = local13;
									local447.anInt2644 = Static14.anInt366 - local54;
									local447.anObjectArray3 = local13.anObjectArray21;
									Static128.aClass49_15.method1114(local447);
								}
								if (!local13.aBoolean116 && local345) {
									local13.aBoolean116 = true;
									if (local13.anObjectArray28 != null) {
										local447 = new Class8_Sub19();
										local447.aClass8_Sub24_13 = local13;
										local447.anInt2644 = Static14.anInt366 - local54;
										local447.anInt2650 = Static121.anInt2909 - local59;
										local447.anObjectArray3 = local13.anObjectArray28;
										Static128.aClass49_15.method1114(local447);
									}
								}
								if (local13.aBoolean116 && local345 && local13.anObjectArray4 != null) {
									local447 = new Class8_Sub19();
									local447.anInt2644 = Static14.anInt366 - local54;
									local447.aClass8_Sub24_13 = local13;
									local447.anInt2650 = Static121.anInt2909 - local59;
									local447.anObjectArray3 = local13.anObjectArray4;
									Static128.aClass49_15.method1114(local447);
								}
								if (local13.aBoolean116 && !local345) {
									local13.aBoolean116 = false;
									if (local13.anObjectArray16 != null) {
										local447 = new Class8_Sub19();
										local447.anInt2650 = Static121.anInt2909 - local59;
										local447.aClass8_Sub24_13 = local13;
										local447.anObjectArray3 = local13.anObjectArray16;
										local447.anInt2644 = Static14.anInt366 - local54;
										Static44.aClass49_5.method1114(local447);
									}
								}
								if (local13.anObjectArray12 != null) {
									local447 = new Class8_Sub19();
									local447.aClass8_Sub24_13 = local13;
									local447.anObjectArray3 = local13.anObjectArray12;
									Static50.aClass49_6.method1114(local447);
								}
								@Pc(789) int local789;
								@Pc(791) int local791;
								@Pc(803) Class8_Sub19 local803;
								if (local13.anObjectArray9 != null && local13.anInt3117 < Static128.anInt3023) {
									if (local13.anIntArray411 == null || Static128.anInt3023 - local13.anInt3117 > 32) {
										local447 = new Class8_Sub19();
										local447.aClass8_Sub24_13 = local13;
										local447.anObjectArray3 = local13.anObjectArray9;
										Static128.aClass49_15.method1114(local447);
									} else {
										label368: for (local99 = local13.anInt3117; local99 < Static128.anInt3023; local99++) {
											local789 = Static79.anIntArray242[local99 & 0x1F];
											for (local791 = 0; local791 < local13.anIntArray411.length; local791++) {
												if (local13.anIntArray411[local791] == local789) {
													local803 = new Class8_Sub19();
													local803.aClass8_Sub24_13 = local13;
													local803.anObjectArray3 = local13.anObjectArray9;
													Static128.aClass49_15.method1114(local803);
													break label368;
												}
											}
										}
									}
									local13.anInt3117 = Static128.anInt3023;
								}
								if (local13.anObjectArray20 != null && local13.anInt3156 < Static79.anInt1877) {
									if (local13.anIntArray413 == null || Static79.anInt1877 - local13.anInt3156 > 32) {
										local447 = new Class8_Sub19();
										local447.aClass8_Sub24_13 = local13;
										local447.anObjectArray3 = local13.anObjectArray20;
										Static128.aClass49_15.method1114(local447);
									} else {
										label348: for (local99 = local13.anInt3156; local99 < Static79.anInt1877; local99++) {
											local789 = Static107.anIntArray335[local99 & 0x1F];
											for (local791 = 0; local791 < local13.anIntArray413.length; local791++) {
												if (local789 == local13.anIntArray413[local791]) {
													local803 = new Class8_Sub19();
													local803.aClass8_Sub24_13 = local13;
													local803.anObjectArray3 = local13.anObjectArray20;
													Static128.aClass49_15.method1114(local803);
													break label348;
												}
											}
										}
									}
									local13.anInt3156 = Static79.anInt1877;
								}
								if (local13.anObjectArray11 != null && local13.anInt3153 < Static39.anInt963) {
									if (local13.anIntArray417 == null || Static39.anInt963 - local13.anInt3153 > 32) {
										local447 = new Class8_Sub19();
										local447.anObjectArray3 = local13.anObjectArray11;
										local447.aClass8_Sub24_13 = local13;
										Static128.aClass49_15.method1114(local447);
									} else {
										label328: for (local99 = local13.anInt3153; local99 < Static39.anInt963; local99++) {
											local789 = Static78.anIntArray239[local99 & 0x1F];
											for (local791 = 0; local791 < local13.anIntArray417.length; local791++) {
												if (local789 == local13.anIntArray417[local791]) {
													local803 = new Class8_Sub19();
													local803.anObjectArray3 = local13.anObjectArray11;
													local803.aClass8_Sub24_13 = local13;
													Static128.aClass49_15.method1114(local803);
													break label328;
												}
											}
										}
									}
									local13.anInt3153 = Static39.anInt963;
								}
								if (local13.anInt3104 < Static52.anInt1357 && local13.anObjectArray24 != null) {
									local447 = new Class8_Sub19();
									local447.aClass8_Sub24_13 = local13;
									local447.anObjectArray3 = local13.anObjectArray24;
									Static128.aClass49_15.method1114(local447);
								}
								if (Static108.anInt2491 > local13.anInt3104 && local13.anObjectArray18 != null) {
									local447 = new Class8_Sub19();
									local447.anObjectArray3 = local13.anObjectArray18;
									local447.aClass8_Sub24_13 = local13;
									Static128.aClass49_15.method1114(local447);
								}
								if (Static29.anInt831 > local13.anInt3104 && local13.anObjectArray22 != null) {
									local447 = new Class8_Sub19();
									local447.anObjectArray3 = local13.anObjectArray22;
									local447.aClass8_Sub24_13 = local13;
									Static128.aClass49_15.method1114(local447);
								}
								if (local13.anInt3104 < Static116.anInt2612 && local13.anObjectArray8 != null) {
									local447 = new Class8_Sub19();
									local447.anObjectArray3 = local13.anObjectArray8;
									local447.aClass8_Sub24_13 = local13;
									Static128.aClass49_15.method1114(local447);
								}
								local13.anInt3104 = Static86.anInt2177;
								if (local13.anObjectArray13 != null) {
									for (local99 = 0; local99 < Static102.anInt3086; local99++) {
										@Pc(1131) Class8_Sub19 local1131 = new Class8_Sub19();
										local1131.aClass8_Sub24_13 = local13;
										local1131.anInt2649 = Static33.anIntArray114[local99];
										local1131.anInt2652 = Static38.anIntArray130[local99];
										local1131.anObjectArray3 = local13.anObjectArray13;
										Static128.aClass49_15.method1114(local1131);
									}
								}
							}
						}
						if (!local13.aBoolean117) {
							if (Static93.aClass8_Sub24_7 != null || Static115.aClass8_Sub24_10 != null || Static90.aBoolean14) {
								return;
							}
							if ((local13.anInt3134 >= 0 || local13.anInt3171 != 0) && Static14.anInt366 >= local76 && Static121.anInt2909 >= local82 && local80 > Static14.anInt366 && Static121.anInt2909 < local78) {
								if (local13.anInt3134 < 0) {
									Static15.aClass8_Sub24_4 = local13;
								} else {
									Static15.aClass8_Sub24_4 = arg7[local13.anInt3134];
								}
							}
							if (local13.anInt3145 == 8 && Static14.anInt366 >= local76 && Static121.anInt2909 >= local82 && Static14.anInt366 < local80 && local78 > Static121.anInt2909) {
								Static123.aClass8_Sub24_14 = local13;
							}
							if (local13.anInt3151 > local13.anInt3111) {
								Static44.method667(local13.anInt3151, local13.anInt3111, Static121.anInt2909, local13, local59, Static14.anInt366, local54 + local13.anInt3154);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III[Lclient!ic;)Lclient!ic;")
	public static Class34 method524(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class34[] arg2) {
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < arg1; local15++) {
			if (arg2[arg0 + local15] == null) {
				arg2[local15 + arg0] = Static44.aClass34_568;
			}
			local13 += arg2[local15 + arg0].anInt1418;
		}
		@Pc(44) byte[] local44 = new byte[local13];
		@Pc(46) int local46 = 0;
		@Pc(55) Class34 local55;
		for (@Pc(48) int local48 = 0; local48 < arg1; local48++) {
			local55 = arg2[local48 + arg0];
			Static140.method1345(local55.aByteArray20, 0, local44, local46, local55.anInt1418);
			local46 += local55.anInt1418;
		}
		local55 = new Class34();
		local55.aByteArray20 = local44;
		local55.anInt1418 = local13;
		return local55;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!wf;BLclient!ic;)Lclient!ic;")
	public static Class34 method525(@OriginalArg(0) Class8_Sub24 arg0, @OriginalArg(2) Class34 arg1) {
		if (arg1.method818(Static27.aClass34_384) == -1) {
			return arg1;
		}
		while (true) {
			@Pc(25) int local25 = arg1.method818(Static40.aClass34_523);
			if (local25 == -1) {
				while (true) {
					local25 = arg1.method818(Static16.aClass34_225);
					if (local25 == -1) {
						while (true) {
							local25 = arg1.method818(Static36.aClass34_497);
							if (local25 == -1) {
								while (true) {
									local25 = arg1.method818(Static50.aClass34_661);
									if (local25 == -1) {
										while (true) {
											local25 = arg1.method818(Static102.aClass34_1431);
											if (local25 == -1) {
												while (true) {
													local25 = arg1.method818(Static127.aClass34_1380);
													if (local25 == -1) {
														return arg1;
													}
													@Pc(240) Class34 local240 = Static36.aClass34_504;
													if (Static60.aClass10_6 != null) {
														local240 = Static87.method1305(Static60.aClass10_6.anInt297);
														try {
															if (Static60.aClass10_6.anObject1 != null) {
																@Pc(256) byte[] local256 = ((String) Static60.aClass10_6.anObject1).getBytes("ISO-8859-1");
																local240 = Static87.method1304(local256.length, 0, local256);
															}
														} catch (@Pc(265) UnsupportedEncodingException local265) {
														}
													}
													arg1 = Static44.method669(new Class34[] { arg1.method810(local25, 0), local240, arg1.method835(local25 + 4) });
												}
											}
											arg1 = Static44.method669(new Class34[] { arg1.method810(local25, 0), Static113.method1617(Static102.method2014(arg0, 4)), arg1.method835(local25 + 2) });
										}
									}
									arg1 = Static44.method669(new Class34[] { arg1.method810(local25, 0), Static113.method1617(Static102.method2014(arg0, 3)), arg1.method835(local25 + 2) });
								}
							}
							arg1 = Static44.method669(new Class34[] { arg1.method810(local25, 0), Static113.method1617(Static102.method2014(arg0, 2)), arg1.method835(local25 + 2) });
						}
					}
					arg1 = Static44.method669(new Class34[] { arg1.method810(local25, 0), Static113.method1617(Static102.method2014(arg0, 1)), arg1.method835(local25 + 2) });
				}
			}
			arg1 = Static44.method669(new Class34[] { arg1.method810(local25, 0), Static113.method1617(Static102.method2014(arg0, 0)), arg1.method835(local25 + 2) });
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V")
	public static void method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(3) int local3 = arg2; local3 <= arg1 + arg2; local3++) {
			for (@Pc(7) int local7 = arg3; local7 <= arg0 + arg3; local7++) {
				if (local7 >= 0 && local7 < 104 && local3 >= 0 && local3 < 104) {
					Static107.aByteArrayArrayArray6[0][local7][local3] = 127;
					if (arg3 == local7 && local7 > 0) {
						Static24.anIntArrayArrayArray4[0][local7][local3] = Static24.anIntArrayArrayArray4[0][local7 - 1][local3];
					}
					if (arg3 + arg0 == local7 && local7 < 103) {
						Static24.anIntArrayArrayArray4[0][local7][local3] = Static24.anIntArrayArrayArray4[0][local7 + 1][local3];
					}
					if (arg2 == local3 && local3 > 0) {
						Static24.anIntArrayArrayArray4[0][local7][local3] = Static24.anIntArrayArrayArray4[0][local7][local3 - 1];
					}
					if (local3 == arg1 + arg2 && local3 < 103) {
						Static24.anIntArrayArrayArray4[0][local7][local3] = Static24.anIntArrayArrayArray4[0][local7][local3 + 1];
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Z")
	public static boolean method527() {
		if (Static93.aClass25_4 == null) {
			return false;
		}
		@Pc(763) int local763;
		try {
			@Pc(13) int local13 = Static93.aClass25_4.method585();
			if (local13 == 0) {
				return false;
			}
			if (anInt852 == -1) {
				local13--;
				Static93.aClass25_4.method589(0, 1, Static10.aClass8_Sub20_Sub1_1.aByteArray44);
				Static10.aClass8_Sub20_Sub1_1.anInt2853 = 0;
				anInt852 = Static10.aClass8_Sub20_Sub1_1.method1909();
				Static32.anInt872 = Static76.anIntArray232[anInt852];
			}
			if (Static32.anInt872 == -1) {
				if (local13 <= 0) {
					return false;
				}
				local13--;
				Static93.aClass25_4.method589(0, 1, Static10.aClass8_Sub20_Sub1_1.aByteArray44);
				Static32.anInt872 = Static10.aClass8_Sub20_Sub1_1.aByteArray44[0] & 0xFF;
			}
			if (Static32.anInt872 == -2) {
				if (local13 <= 1) {
					return false;
				}
				local13 -= 2;
				Static93.aClass25_4.method589(0, 2, Static10.aClass8_Sub20_Sub1_1.aByteArray44);
				Static10.aClass8_Sub20_Sub1_1.anInt2853 = 0;
				Static32.anInt872 = Static10.aClass8_Sub20_Sub1_1.method1839();
			}
			if (Static32.anInt872 > local13) {
				return false;
			}
			Static10.aClass8_Sub20_Sub1_1.anInt2853 = 0;
			Static93.aClass25_4.method589(0, Static32.anInt872, Static10.aClass8_Sub20_Sub1_1.aByteArray44);
			Static28.anInt797 = Static75.anInt1804;
			Static75.anInt1804 = Static50.anInt1320;
			Static128.anInt3020 = 0;
			Static50.anInt1320 = anInt852;
			@Pc(150) long local150;
			@Pc(152) int local152;
			@Pc(146) Class34 local146;
			@Pc(128) Class34 local128;
			@Pc(135) boolean local135;
			if (anInt852 == 19) {
				local128 = Static10.aClass8_Sub20_Sub1_1.method1892();
				if (local128.method840(Static118.aClass34_1236)) {
					local135 = false;
					local146 = local128.method810(local128.method818(Static68.aClass34_777), 0);
					local150 = local146.method830();
					for (local152 = 0; local152 < Static69.anInt1679; local152++) {
						if (Static5.aLongArray2[local152] == local150) {
							local135 = true;
							break;
						}
					}
					if (!local135 && Static10.anInt226 == 0) {
						Static108.method1530(Static49.aClass34_653, local146, 4);
					}
				} else if (local128.method840(Static31.aClass34_456)) {
					local146 = local128.method810(local128.method818(Static68.aClass34_777), 0);
					local135 = false;
					local150 = local146.method830();
					for (local152 = 0; local152 < Static69.anInt1679; local152++) {
						if (Static5.aLongArray2[local152] == local150) {
							local135 = true;
							break;
						}
					}
					if (!local135 && Static10.anInt226 == 0) {
						Static108.method1530(Static69.aClass34_787, local146, 8);
					}
				} else if (local128.method840(Static58.aClass34_723)) {
					local146 = local128.method810(local128.method818(Static68.aClass34_777), 0);
					local135 = false;
					local150 = local146.method830();
					for (local152 = 0; local152 < Static69.anInt1679; local152++) {
						if (Static5.aLongArray2[local152] == local150) {
							local135 = true;
							break;
						}
					}
					if (!local135 && Static10.anInt226 == 0) {
						@Pc(267) Class34 local267 = local128.method810(local128.method820() - 9, local128.method818(Static68.aClass34_777) - -1);
						Static108.method1530(local267, local146, 8);
					}
				} else if (local128.method840(Static82.aClass34_896)) {
					local146 = local128.method810(local128.method818(Static68.aClass34_777), 0);
					local150 = local146.method830();
					local135 = false;
					for (local152 = 0; local152 < Static69.anInt1679; local152++) {
						if (Static5.aLongArray2[local152] == local150) {
							local135 = true;
							break;
						}
					}
					if (!local135 && Static10.anInt226 == 0) {
						Static108.method1530(Static36.aClass34_504, local146, 10);
					}
				} else if (local128.method840(Static121.aClass34_1334)) {
					local146 = local128.method810(local128.method818(Static121.aClass34_1334), 0);
					Static108.method1530(local146, Static36.aClass34_504, 11);
				} else if (local128.method840(Static120.aClass34_1326)) {
					local146 = local128.method810(local128.method818(Static120.aClass34_1326), 0);
					if (Static10.anInt226 == 0) {
						Static108.method1530(local146, Static36.aClass34_504, 12);
					}
				} else if (local128.method840(Static4.aClass34_27)) {
					local146 = local128.method810(local128.method818(Static4.aClass34_27), 0);
					if (Static10.anInt226 == 0) {
						Static108.method1530(local146, Static36.aClass34_504, 13);
					}
				} else {
					Static108.method1530(local128, Static36.aClass34_504, 0);
				}
				anInt852 = -1;
				return true;
			}
			@Pc(592) int local592;
			@Pc(479) long local479;
			@Pc(483) int local483;
			@Pc(603) int local603;
			if (anInt852 == 113) {
				local135 = false;
				local479 = Static10.aClass8_Sub20_Sub1_1.method1864();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1839();
				@Pc(487) byte local487 = Static10.aClass8_Sub20_Sub1_1.method1847();
				if ((local479 & Long.MIN_VALUE) != 0L) {
					local135 = true;
				}
				if (local135) {
					if (Static41.anInt990 == 0) {
						anInt852 = -1;
						return true;
					}
					local479 &= Long.MAX_VALUE;
					for (local152 = 0; local152 < Static41.anInt990 && (Static24.aClass8_Sub17Array2[local152].aLong102 != local479 || Static24.aClass8_Sub17Array2[local152].anInt2224 != local483); local152++) {
					}
					if (Static41.anInt990 > local152) {
						while (local152 < Static41.anInt990 - 1) {
							Static24.aClass8_Sub17Array2[local152] = Static24.aClass8_Sub17Array2[local152 + 1];
							local152++;
						}
						Static41.anInt990--;
						Static24.aClass8_Sub17Array2[Static41.anInt990] = null;
					}
				} else {
					@Pc(571) Class8_Sub17 local571 = new Class8_Sub17();
					local571.aLong102 = local479;
					local571.aClass34_1035 = Static83.method1229(local571.aLong102);
					local571.anInt2224 = local483;
					local571.aByte5 = local487;
					for (local592 = Static41.anInt990 - 1; local592 >= 0; local592--) {
						local603 = Static24.aClass8_Sub17Array2[local592].aClass34_1035.method833(local571.aClass34_1035);
						if (local603 == 0) {
							Static24.aClass8_Sub17Array2[local592].anInt2224 = local483;
							Static24.aClass8_Sub17Array2[local592].aByte5 = local487;
							anInt852 = -1;
							Static29.anInt831 = Static86.anInt2177;
							if (Static86.aLong73 == local479) {
								Static113.aByte6 = local487;
							}
							return true;
						}
						if (local603 < 0) {
							break;
						}
					}
					if (Static41.anInt990 >= Static24.aClass8_Sub17Array2.length) {
						anInt852 = -1;
						return true;
					}
					for (local603 = Static41.anInt990 - 1; local603 > local592; local603--) {
						Static24.aClass8_Sub17Array2[local603 + 1] = Static24.aClass8_Sub17Array2[local603];
					}
					if (Static41.anInt990 == 0) {
						Static24.aClass8_Sub17Array2 = new Class8_Sub17[100];
					}
					Static24.aClass8_Sub17Array2[local592 + 1] = local571;
					if (Static86.aLong73 == local479) {
						Static113.aByte6 = local487;
					}
					Static41.anInt990++;
				}
				anInt852 = -1;
				Static29.anInt831 = Static86.anInt2177;
				return true;
			}
			if (anInt852 == 218) {
				Static17.anInt434 = Static10.aClass8_Sub20_Sub1_1.method1872();
				anInt852 = -1;
				return true;
			}
			@Pc(712) int local712;
			if (anInt852 == 36) {
				for (local712 = 0; local712 < Static78.anIntArray238.length; local712++) {
					if (Static78.anIntArray238[local712] != Static62.anIntArray194[local712]) {
						Static78.anIntArray238[local712] = Static62.anIntArray194[local712];
						Static15.method237(local712);
						Static79.anIntArray242[Static128.anInt3023++ & 0x1F] = local712;
					}
				}
				anInt852 = -1;
				return true;
			}
			@Pc(784) int local784;
			@Pc(804) int local804;
			@Pc(849) Class8_Sub7 local849;
			@Pc(897) int local897;
			@Pc(907) long local907;
			if (anInt852 == 252) {
				local712 = Static32.anInt872 + Static10.aClass8_Sub20_Sub1_1.anInt2853;
				local763 = Static10.aClass8_Sub20_Sub1_1.method1839();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1839();
				if (Static107.anInt2463 != local763) {
					Static107.anInt2463 = local763;
					Static127.method1980(Static107.anInt2463);
					Static91.method1323(Static107.anInt2463);
					for (local784 = 0; local784 < 100; local784++) {
						Static23.aBooleanArray2[local784] = true;
					}
				}
				while (local483-- > 0) {
					local784 = Static10.aClass8_Sub20_Sub1_1.method1853();
					local804 = Static10.aClass8_Sub20_Sub1_1.method1839();
					local152 = Static10.aClass8_Sub20_Sub1_1.method1872();
					@Pc(815) Class8_Sub7 local815 = (Class8_Sub7) Static31.aClass7_3.method45((long) local784);
					if (local815 != null && local804 != local815.anInt954) {
						Static45.method680(true, local815);
						local815 = null;
					}
					if (local815 == null) {
						local815 = Static49.method745(local152, local804, local784);
					}
					local815.aBoolean45 = true;
				}
				for (local849 = (Class8_Sub7) Static31.aClass7_3.method47(); local849 != null; local849 = (Class8_Sub7) Static31.aClass7_3.method46()) {
					if (local849.aBoolean45) {
						local849.aBoolean45 = false;
					} else {
						Static45.method680(true, local849);
					}
				}
				Static39.aClass7_6 = new Class7(512);
				while (local712 > Static10.aClass8_Sub20_Sub1_1.anInt2853) {
					local804 = Static10.aClass8_Sub20_Sub1_1.method1853();
					local152 = Static10.aClass8_Sub20_Sub1_1.method1839();
					local592 = Static10.aClass8_Sub20_Sub1_1.method1839();
					local603 = Static10.aClass8_Sub20_Sub1_1.method1853();
					for (local897 = local152; local897 <= local592; local897++) {
						local907 = ((long) local804 << 32) + (long) local897;
						Static39.aClass7_6.method48(new Class8_Sub5(local603), local907);
					}
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 27) {
				Static79.method1138();
				Static10.anInt230 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static116.anInt2612 = Static86.anInt2177;
				anInt852 = -1;
				return true;
			}
			@Pc(963) Class8_Sub24 local963;
			if (anInt852 == 173) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1861();
				local963 = Static113.method1614(local712);
				for (local483 = 0; local483 < local963.anIntArray414.length; local483++) {
					local963.anIntArray414[local483] = -1;
					local963.anIntArray414[local483] = 0;
				}
				Static40.method608(local963);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 33) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1853();
				local963 = Static113.method1614(local712);
				local963.anInt3116 = 3;
				local963.anInt3133 = Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.aClass52_1.method1205();
				Static40.method608(local963);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 3) {
				Static106.method1505(Static32.anInt872, Static93.aClass40_3, Static10.aClass8_Sub20_Sub1_1);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 56) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1851();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1877();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1848();
				Static42.anInt1024 = local763 >> 1;
				Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.method1226((local763 & 0x1) == 1, local483, local712);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 130) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1872();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1872();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1872();
				local784 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static83.aBooleanArray14[local712] = true;
				Static111.anIntArray401[local712] = local763;
				Static74.anIntArray227[local712] = local483;
				Static54.anIntArray170[local712] = local784;
				Static13.anIntArray48[local712] = 0;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 153) {
				Static79.method1138();
				local712 = Static10.aClass8_Sub20_Sub1_1.method1851();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1845();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1877();
				Static84.anIntArray270[local712] = local763;
				Static92.anIntArray306[local712] = local483;
				Static117.anIntArray362[local712] = 1;
				for (local784 = 0; local784 < 98; local784++) {
					if (Class28.anIntArray145[local784] <= local763) {
						Static117.anIntArray362[local712] = local784 + 2;
					}
				}
				Static78.anIntArray239[Static39.anInt963++ & 0x1F] = local712;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 138) {
				Static32.anInt873 = Static10.aClass8_Sub20_Sub1_1.method1851();
				Static73.anInt1773 = Static10.aClass8_Sub20_Sub1_1.method1848();
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 45) {
				Static70.anInt1700 = Static10.aClass8_Sub20_Sub1_1.method1872();
				anInt852 = -1;
				Static108.anInt2491 = Static86.anInt2177;
				return true;
			}
			@Pc(1245) Class8_Sub24 local1245;
			if (anInt852 == 136) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1861();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1878();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1858();
				local1245 = Static113.method1614(local712);
				local1245.anInt3159 = (local483 << 16) + local763;
				anInt852 = -1;
				return true;
			}
			@Pc(1318) int local1318;
			@Pc(1276) long local1276;
			if (anInt852 == 65) {
				local479 = Static10.aClass8_Sub20_Sub1_1.method1864();
				Static10.aClass8_Sub20_Sub1_1.method1847();
				local150 = Static10.aClass8_Sub20_Sub1_1.method1864();
				local1276 = Static10.aClass8_Sub20_Sub1_1.method1839();
				@Pc(1281) long local1281 = (long) Static10.aClass8_Sub20_Sub1_1.method1885();
				local897 = Static10.aClass8_Sub20_Sub1_1.method1872();
				@Pc(1287) boolean local1287 = false;
				local907 = (local1276 << 32) + local1281;
				for (@Pc(1295) int local1295 = 0; local1295 < 100; local1295++) {
					if (Static118.aLongArray6[local1295] == local907) {
						local1287 = true;
						break;
					}
				}
				if (local897 <= 1) {
					for (local1318 = 0; local1318 < Static69.anInt1679; local1318++) {
						if (Static5.aLongArray2[local1318] == local479) {
							local1287 = true;
							break;
						}
					}
				}
				if (!local1287 && Static10.anInt226 == 0) {
					Static118.aLongArray6[Static95.anInt2247] = local907;
					Static95.anInt2247 = (Static95.anInt2247 + 1) % 100;
					@Pc(1359) Class34 local1359 = Static131.method1757(Static36.method572(Static10.aClass8_Sub20_Sub1_1).method822());
					if (local897 == 2 || local897 == 3) {
						Static52.method772(Static83.method1229(local150).method842(), 9, Static44.method669(new Class34[] { Static8.aClass34_105, Static83.method1229(local479).method842() }), local1359);
					} else if (local897 == 1) {
						Static52.method772(Static83.method1229(local150).method842(), 9, Static44.method669(new Class34[] { Static101.aClass34_1107, Static83.method1229(local479).method842() }), local1359);
					} else {
						Static52.method772(Static83.method1229(local150).method842(), 9, Static83.method1229(local479).method842(), local1359);
					}
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 97) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1889();
				if (local712 == 65535) {
					local712 = -1;
				}
				local763 = Static10.aClass8_Sub20_Sub1_1.method1861();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1852();
				local1245 = Static113.method1614(local483);
				@Pc(1495) Class8_Sub1_Sub13 local1495;
				if (local1245.aBoolean117) {
					local1245.anInt3131 = local712;
					local1245.anInt3146 = local763;
					local1495 = Static7.method49(local712);
					local1245.anInt3160 = local1495.anInt1766;
					local1245.anInt3129 = local1495.anInt1757;
					local1245.anInt3098 = local1495.anInt1767;
					local1245.anInt3101 = local1495.anInt1733;
					local1245.anInt3148 = local1495.anInt1758;
					local1245.anInt3095 = local1495.anInt1727;
					if (local1245.anInt3154 > 0) {
						local1245.anInt3095 = local1245.anInt3095 * 32 / local1245.anInt3154;
					}
					Static40.method608(local1245);
				} else if (local712 == -1) {
					local1245.anInt3116 = 0;
					anInt852 = -1;
					return true;
				} else {
					local1495 = Static7.method49(local712);
					local1245.anInt3116 = 4;
					local1245.anInt3095 = local1495.anInt1727 * 100 / local763;
					local1245.anInt3101 = local1495.anInt1733;
					local1245.anInt3133 = local712;
					local1245.anInt3160 = local1495.anInt1766;
					Static40.method608(local1245);
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 77) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1878();
				@Pc(1594) byte local1594 = Static10.aClass8_Sub20_Sub1_1.method1855();
				Static62.anIntArray194[local712] = local1594;
				if (Static78.anIntArray238[local712] != local1594) {
					Static78.anIntArray238[local712] = local1594;
					Static15.method237(local712);
				}
				Static79.anIntArray242[Static128.anInt3023++ & 0x1F] = local712;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 110) {
				local479 = Static10.aClass8_Sub20_Sub1_1.method1864();
				@Pc(1640) Class34 local1640 = Static131.method1757(Static36.method572(Static10.aClass8_Sub20_Sub1_1).method822());
				Static108.method1530(local1640, Static83.method1229(local479).method842(), 6);
				anInt852 = -1;
				return true;
			}
			@Pc(1674) Class8_Sub24 local1674;
			if (anInt852 == 159) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1878();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1853();
				local1674 = Static113.method1614(local763);
				if (local1674.anInt3116 != 2 || local1674.anInt3133 != local712) {
					local1674.anInt3133 = local712;
					local1674.anInt3116 = 2;
					Static40.method608(local1674);
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 61) {
				Static69.anInt1679 = Static32.anInt872 / 8;
				for (local712 = 0; local712 < Static69.anInt1679; local712++) {
					Static5.aLongArray2[local712] = Static10.aClass8_Sub20_Sub1_1.method1864();
					Static80.aClass34Array15[local712] = Static83.method1229(Static5.aLongArray2[local712]);
				}
				Static108.anInt2491 = Static86.anInt2177;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 60) {
				Static10.method111();
				anInt852 = -1;
				return false;
			}
			if (anInt852 == 132) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1853();
				@Pc(1761) Class8_Sub7 local1761 = (Class8_Sub7) Static31.aClass7_3.method45((long) local712);
				if (local1761 != null) {
					Static45.method680(true, local1761);
				}
				if (Static126.aClass8_Sub24_8 != null) {
					Static40.method608(Static126.aClass8_Sub24_8);
					Static126.aClass8_Sub24_8 = null;
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 160) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1858();
				if (local712 == 65535) {
					local712 = -1;
				}
				local763 = Static10.aClass8_Sub20_Sub1_1.method1853();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1852();
				local784 = Static10.aClass8_Sub20_Sub1_1.method1839();
				if (local784 == 65535) {
					local784 = -1;
				}
				for (local804 = local712; local804 <= local784; local804++) {
					@Pc(1821) long local1821 = ((long) local483 << 32) + (long) local804;
					@Pc(1828) Class8 local1828 = Static39.aClass7_6.method45(local1821);
					if (local1828 != null) {
						local1828.method2013();
					}
					Static39.aClass7_6.method48(new Class8_Sub5(local763), local1821);
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 204) {
				Static62.method941(true);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 125) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1839();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1853();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1848();
				local849 = (Class8_Sub7) Static31.aClass7_3.method45((long) local763);
				if (local849 != null) {
					Static45.method680(local712 != local849.anInt954, local849);
				}
				Static49.method745(local483, local712, local763);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 152) {
				Static62.method941(false);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 148) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1889();
				if (local712 == 65535) {
					local712 = -1;
				}
				Static32.method537(local712);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 83) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1878();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1868();
				if (local712 == 65535) {
					local712 = -1;
				}
				Static120.method1898(local712, local763);
				anInt852 = -1;
				return true;
			}
			@Pc(2007) int local2007;
			if (anInt852 == 119) {
				local479 = Static10.aClass8_Sub20_Sub1_1.method1864();
				local150 = Static10.aClass8_Sub20_Sub1_1.method1839();
				local1276 = Static10.aClass8_Sub20_Sub1_1.method1885();
				local592 = Static10.aClass8_Sub20_Sub1_1.method1872();
				@Pc(2003) long local2003 = (local150 << 32) + local1276;
				@Pc(2005) boolean local2005 = false;
				for (local2007 = 0; local2007 < 100; local2007++) {
					if (Static118.aLongArray6[local2007] == local2003) {
						local2005 = true;
						break;
					}
				}
				if (local592 <= 1) {
					for (@Pc(2028) int local2028 = 0; local2028 < Static69.anInt1679; local2028++) {
						if (Static5.aLongArray2[local2028] == local479) {
							local2005 = true;
							break;
						}
					}
				}
				if (!local2005 && Static10.anInt226 == 0) {
					Static118.aLongArray6[Static95.anInt2247] = local2003;
					Static95.anInt2247 = (Static95.anInt2247 + 1) % 100;
					@Pc(2065) Class34 local2065 = Static131.method1757(Static36.method572(Static10.aClass8_Sub20_Sub1_1).method822());
					if (local592 == 2 || local592 == 3) {
						Static108.method1530(local2065, Static44.method669(new Class34[] { Static8.aClass34_105, Static83.method1229(local479).method842() }), 7);
					} else if (local592 == 1) {
						Static108.method1530(local2065, Static44.method669(new Class34[] { Static101.aClass34_1107, Static83.method1229(local479).method842() }), 7);
					} else {
						Static108.method1530(local2065, Static83.method1229(local479).method842(), 3);
					}
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 251) {
				Static32.anInt873 = Static10.aClass8_Sub20_Sub1_1.method1851();
				Static73.anInt1773 = Static10.aClass8_Sub20_Sub1_1.method1851();
				while (Static32.anInt872 > Static10.aClass8_Sub20_Sub1_1.anInt2853) {
					anInt852 = Static10.aClass8_Sub20_Sub1_1.method1872();
					Static17.method265();
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 165) {
				local128 = Static10.aClass8_Sub20_Sub1_1.method1892();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1872();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1848();
				if (local483 >= 1 && local483 <= 8) {
					if (local128.method806(Static97.aClass34_1056)) {
						local128 = null;
					}
					Static20.aClass34Array8[local483 - 1] = local128;
					Static40.aBooleanArray5[local483 - 1] = local763 == 0;
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 30) {
				if (Static107.anInt2463 != -1) {
					Static22.method1598(Static107.anInt2463, 0);
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 240) {
				Static104.anInt2385 = Static10.aClass8_Sub20_Sub1_1.method1858() * 30;
				Static116.anInt2612 = Static86.anInt2177;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 163) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1889();
				Static1.method5(local712);
				Static107.anIntArray335[Static79.anInt1877++ & 0x1F] = local712 & 0x7FFF;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 236) {
				Static74.method1088(Static10.aClass8_Sub20_Sub1_1);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 146) {
				Static38.method583();
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 31) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1863();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1894();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1845();
				local1245 = Static113.method1614(local483);
				local804 = local712 + local1245.anInt3108;
				local152 = local1245.anInt3099 + local763;
				if (local804 != local1245.anInt3093 || local152 != local1245.anInt3107) {
					local1245.anInt3107 = local152;
					local1245.anInt3093 = local804;
					Static40.method608(local1245);
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 235) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1853();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1839();
				if (local712 >= 0) {
					local1674 = Static113.method1614(local712);
				} else {
					local1674 = null;
				}
				if (local1674 != null) {
					for (local784 = 0; local784 < local1674.anIntArray414.length; local784++) {
						local1674.anIntArray414[local784] = 0;
						local1674.anIntArray410[local784] = 0;
					}
				}
				if (local712 < -70000) {
					local763 += 32768;
				}
				Static124.method1967(local763);
				local784 = Static10.aClass8_Sub20_Sub1_1.method1839();
				for (local804 = 0; local804 < local784; local804++) {
					local152 = Static10.aClass8_Sub20_Sub1_1.method1877();
					if (local152 == 255) {
						local152 = Static10.aClass8_Sub20_Sub1_1.method1861();
					}
					local592 = Static10.aClass8_Sub20_Sub1_1.method1889();
					if (local1674 != null && local1674.anIntArray414.length > local804) {
						local1674.anIntArray414[local804] = local592;
						local1674.anIntArray410[local804] = local152;
					}
					Static103.method1473(local804, local592 - 1, local152, local763);
				}
				if (local1674 != null) {
					Static40.method608(local1674);
				}
				Static79.method1138();
				Static107.anIntArray335[Static79.anInt1877++ & 0x1F] = local763 & 0x7FFF;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 16) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1853();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1839();
				if (local712 < 0) {
					local1674 = null;
				} else {
					local1674 = Static113.method1614(local712);
				}
				if (local712 < -70000) {
					local763 += 32768;
				}
				while (Static10.aClass8_Sub20_Sub1_1.anInt2853 < Static32.anInt872) {
					local784 = Static10.aClass8_Sub20_Sub1_1.method1849();
					local152 = 0;
					local804 = Static10.aClass8_Sub20_Sub1_1.method1839();
					if (local804 != 0) {
						local152 = Static10.aClass8_Sub20_Sub1_1.method1872();
						if (local152 == 255) {
							local152 = Static10.aClass8_Sub20_Sub1_1.method1853();
						}
					}
					if (local1674 != null && local784 >= 0 && local1674.anIntArray414.length > local784) {
						local1674.anIntArray414[local784] = local804;
						local1674.anIntArray410[local784] = local152;
					}
					Static103.method1473(local784, local804 - 1, local152, local763);
				}
				if (local1674 != null) {
					Static40.method608(local1674);
				}
				Static79.method1138();
				Static107.anIntArray335[Static79.anInt1877++ & 0x1F] = local763 & 0x7FFF;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 223 || anInt852 == 53 || anInt852 == 179 || anInt852 == 177 || anInt852 == 168 || anInt852 == 40 || anInt852 == 174 || anInt852 == 137 || anInt852 == 96 || anInt852 == 147 || anInt852 == 201) {
				Static17.method265();
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 79) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1852();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1895();
				local1674 = Static113.method1614(local712);
				if (local1674.anInt3144 != local763 || local763 == -1) {
					local1674.anInt3158 = 0;
					local1674.anInt3144 = local763;
					local1674.anInt3147 = 0;
					Static40.method608(local1674);
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 188) {
				Static1.anInt24 = Static10.aClass8_Sub20_Sub1_1.method1872();
				if (Static1.anInt24 == 1) {
					Static87.anInt2184 = Static10.aClass8_Sub20_Sub1_1.method1839();
				}
				if (Static1.anInt24 >= 2 && Static1.anInt24 <= 6) {
					if (Static1.anInt24 == 2) {
						Static91.anInt2198 = 64;
						Static28.anInt803 = 64;
					}
					if (Static1.anInt24 == 3) {
						Static91.anInt2198 = 64;
						Static28.anInt803 = 0;
					}
					if (Static1.anInt24 == 4) {
						Static28.anInt803 = 128;
						Static91.anInt2198 = 64;
					}
					if (Static1.anInt24 == 5) {
						Static91.anInt2198 = 0;
						Static28.anInt803 = 64;
					}
					if (Static1.anInt24 == 6) {
						Static91.anInt2198 = 128;
						Static28.anInt803 = 64;
					}
					Static1.anInt24 = 2;
					Static67.anInt1664 = Static10.aClass8_Sub20_Sub1_1.method1839();
					Static133.anInt3059 = Static10.aClass8_Sub20_Sub1_1.method1839();
					Static73.anInt1779 = Static10.aClass8_Sub20_Sub1_1.method1872();
				}
				if (Static1.anInt24 == 10) {
					Static134.anInt3168 = Static10.aClass8_Sub20_Sub1_1.method1839();
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 51) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1889();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1845();
				Static62.anIntArray194[local712] = local763;
				if (local763 != Static78.anIntArray238[local712]) {
					Static78.anIntArray238[local712] = local763;
					Static15.method237(local712);
				}
				Static79.anIntArray242[Static128.anInt3023++ & 0x1F] = local712;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 183) {
				local128 = Static10.aClass8_Sub20_Sub1_1.method1892();
				@Pc(2858) Object[] local2858 = new Object[local128.method820() + 1];
				for (local483 = local128.method820() - 1; local483 >= 0; local483--) {
					if (local128.method808(local483) == 115) {
						local2858[local483 + 1] = Static10.aClass8_Sub20_Sub1_1.method1892();
					} else {
						local2858[local483 + 1] = Integer.valueOf(Static10.aClass8_Sub20_Sub1_1.method1853());
					}
				}
				local2858[0] = Integer.valueOf(Static10.aClass8_Sub20_Sub1_1.method1853());
				@Pc(2914) Class8_Sub19 local2914 = new Class8_Sub19();
				local2914.anObjectArray3 = local2858;
				Static106.method1497(local2914);
				anInt852 = -1;
				return true;
			}
			@Pc(3110) int local3110;
			if (anInt852 == 74) {
				local479 = Static10.aClass8_Sub20_Sub1_1.method1864();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1839();
				local784 = Static10.aClass8_Sub20_Sub1_1.method1872();
				@Pc(2949) Class34 local2949 = Static83.method1229(local479).method842();
				for (local152 = 0; local152 < Static62.anInt1593; local152++) {
					if (local479 == Static77.aLongArray3[local152]) {
						if (local483 != Static83.anIntArray266[local152]) {
							Static83.anIntArray266[local152] = local483;
							if (local483 > 0) {
								Static108.method1530(Static44.method669(new Class34[] { local2949, Static47.aClass34_641 }), Static36.aClass34_504, 5);
							}
							if (local483 == 0) {
								Static108.method1530(Static44.method669(new Class34[] { local2949, Static99.aClass34_1094 }), Static36.aClass34_504, 5);
							}
						}
						local2949 = null;
						Static21.anIntArray70[local152] = local784;
						break;
					}
				}
				if (local2949 != null && Static62.anInt1593 < 200) {
					Static77.aLongArray3[Static62.anInt1593] = local479;
					Static93.aClass34Array16[Static62.anInt1593] = local2949;
					Static83.anIntArray266[Static62.anInt1593] = local483;
					Static21.anIntArray70[Static62.anInt1593] = local784;
					Static62.anInt1593++;
				}
				local603 = Static62.anInt1593;
				Static108.anInt2491 = Static86.anInt2177;
				while (local603 > 0) {
					local603--;
					@Pc(3072) boolean local3072 = true;
					for (local897 = 0; local897 < local603; local897++) {
						if (Static83.anIntArray266[local897] != Static9.anInt189 && Static83.anIntArray266[local897 + 1] == Static9.anInt189 || Static83.anIntArray266[local897] == 0 && Static83.anIntArray266[local897 + 1] != 0) {
							local3072 = false;
							local3110 = Static83.anIntArray266[local897];
							Static83.anIntArray266[local897] = Static83.anIntArray266[local897 + 1];
							Static83.anIntArray266[local897 + 1] = local3110;
							@Pc(3128) Class34 local3128 = Static93.aClass34Array16[local897];
							Static93.aClass34Array16[local897] = Static93.aClass34Array16[local897 + 1];
							Static93.aClass34Array16[local897 + 1] = local3128;
							@Pc(3146) long local3146 = Static77.aLongArray3[local897];
							Static77.aLongArray3[local897] = Static77.aLongArray3[local897 + 1];
							Static77.aLongArray3[local897 + 1] = local3146;
							local1318 = Static21.anIntArray70[local897];
							Static21.anIntArray70[local897] = Static21.anIntArray70[local897 + 1];
							Static21.anIntArray70[local897 + 1] = local1318;
						}
					}
					if (local3072) {
						break;
					}
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 195) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1845();
				local146 = Static10.aClass8_Sub20_Sub1_1.method1892();
				local1674 = Static113.method1614(local712);
				if (!local146.method804(local1674.aClass34_1437)) {
					local1674.aClass34_1437 = local146;
					Static40.method608(local1674);
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 69) {
				Static112.anInt2506 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static117.anInt2632 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static41.anInt991 = Static10.aClass8_Sub20_Sub1_1.method1872();
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 145) {
				Static32.anInt873 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static73.anInt1773 = Static10.aClass8_Sub20_Sub1_1.method1851();
				for (local712 = Static73.anInt1773; local712 < Static73.anInt1773 + 8; local712++) {
					for (local763 = Static32.anInt873; local763 < Static32.anInt873 + 8; local763++) {
						if (Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local712][local763] != null) {
							Static21.aClass49ArrayArrayArray1[Static42.anInt1024][local712][local763] = null;
							Static66.method1958(local712, local763);
						}
					}
				}
				for (@Pc(3300) Class8_Sub18 local3300 = (Class8_Sub18) Static20.aClass49_2.method1107(); local3300 != null; local3300 = (Class8_Sub18) Static20.aClass49_2.method1109()) {
					if (local3300.anInt2367 >= Static73.anInt1773 && Static73.anInt1773 + 8 > local3300.anInt2367 && Static32.anInt873 <= local3300.anInt2377 && local3300.anInt2377 < Static32.anInt873 + 8 && local3300.anInt2373 == Static42.anInt1024) {
						local3300.anInt2369 = 0;
					}
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 225) {
				Static112.aBoolean100 = true;
				Static62.anInt1596 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static105.anInt2396 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static116.anInt2615 = Static10.aClass8_Sub20_Sub1_1.method1839();
				Static102.anInt3088 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static15.anInt376 = Static10.aClass8_Sub20_Sub1_1.method1872();
				if (Static15.anInt376 >= 100) {
					Static48.anInt2951 = Static62.anInt1596 * 128 + 64;
					Static13.anInt345 = Static105.anInt2396 * 128 + 64;
					Static113.anInt2579 = Static123.method1945(Static13.anInt345, Static42.anInt1024, Static48.anInt2951) - Static116.anInt2615;
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 116) {
				for (local712 = 0; local712 < Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1.length; local712++) {
					if (Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local712] != null) {
						Static84.aClass8_Sub1_Sub1_Sub4_Sub1Array1[local712].anInt2009 = -1;
					}
				}
				for (local763 = 0; local763 < Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1.length; local763++) {
					if (Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local763] != null) {
						Static45.aClass8_Sub1_Sub1_Sub4_Sub2Array1[local763].anInt2009 = -1;
					}
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 209) {
				Static112.aBoolean100 = true;
				Static95.anInt2242 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static108.anInt2490 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static48.anInt2952 = Static10.aClass8_Sub20_Sub1_1.method1839();
				Static92.anInt2204 = Static10.aClass8_Sub20_Sub1_1.method1872();
				Static128.anInt3016 = Static10.aClass8_Sub20_Sub1_1.method1872();
				if (Static128.anInt3016 >= 100) {
					local712 = Static95.anInt2242 * 128 + 64;
					local763 = Static108.anInt2490 * 128 + 64;
					local483 = Static123.method1945(local763, Static42.anInt1024, local712) - Static48.anInt2952;
					local804 = local483 - Static113.anInt2579;
					local784 = local712 - Static48.anInt2951;
					local152 = local763 - Static13.anInt345;
					local592 = (int) Math.sqrt((double) (local152 * local152 + local784 * local784));
					Static24.anInt1900 = (int) (Math.atan2((double) local804, (double) local592) * 325.949D) & 0x7FF;
					Static19.anInt593 = (int) (Math.atan2((double) local784, (double) local152) * -325.949D) & 0x7FF;
					if (Static24.anInt1900 < 128) {
						Static24.anInt1900 = 128;
					}
					if (Static24.anInt1900 > 383) {
						Static24.anInt1900 = 383;
					}
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 55) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1839();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1872();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1839();
				Static8.method93(local763, local712, local483);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 143) {
				Static112.aBoolean100 = false;
				for (local712 = 0; local712 < 5; local712++) {
					Static83.aBooleanArray14[local712] = false;
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 111) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1845();
				Static60.aClass10_6 = Static93.aClass40_3.method944(local712);
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 215) {
				Static81.anInt1951 = 0;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 76) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1852();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1878();
				local784 = local763 >> 5 & 0x1F;
				local483 = local763 >> 10 & 0x1F;
				local804 = local763 & 0x1F;
				local152 = (local483 << 19) - (-(local784 << 11) - (local804 << 3));
				@Pc(3683) Class8_Sub24 local3683 = Static113.method1614(local712);
				if (local3683.anInt3110 != local152) {
					local3683.anInt3110 = local152;
					Static40.method608(local3683);
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 198) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1889();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1858();
				local483 = Static10.aClass8_Sub20_Sub1_1.method1889();
				local784 = Static10.aClass8_Sub20_Sub1_1.method1845();
				@Pc(3724) Class8_Sub24 local3724 = Static113.method1614(local784);
				if (local763 != local3724.anInt3101 || local3724.anInt3160 != local483 || local3724.anInt3095 != local712) {
					local3724.anInt3160 = local483;
					local3724.anInt3101 = local763;
					local3724.anInt3095 = local712;
					Static40.method608(local3724);
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 4) {
				@Pc(3770) boolean local3770 = Static10.aClass8_Sub20_Sub1_1.method1848() == 1;
				local763 = Static10.aClass8_Sub20_Sub1_1.method1861();
				local1674 = Static113.method1614(local763);
				if (local3770 != local1674.aBoolean119) {
					local1674.aBoolean119 = local3770;
					Static40.method608(local1674);
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 232) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1858();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1845();
				local1674 = Static113.method1614(local763);
				if (local1674 != null && local1674.anInt3145 == 0) {
					if (local712 > local1674.anInt3151 - local1674.anInt3111) {
						local712 = local1674.anInt3151 - local1674.anInt3111;
					}
					if (local712 < 0) {
						local712 = 0;
					}
					if (local1674.anInt3103 != local712) {
						local1674.anInt3103 = local712;
						Static40.method608(local1674);
					}
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 190) {
				Static29.anInt831 = Static86.anInt2177;
				local479 = Static10.aClass8_Sub20_Sub1_1.method1864();
				if (local479 == 0L) {
					anInt852 = -1;
					Static5.aClass34_35 = null;
					Static24.aClass8_Sub17Array2 = null;
					Static41.anInt990 = 0;
					Static34.aClass34_488 = null;
					return true;
				}
				local150 = Static10.aClass8_Sub20_Sub1_1.method1864();
				Static34.aClass34_488 = Static83.method1229(local150);
				Static5.aClass34_35 = Static83.method1229(local479);
				Static115.aByte7 = Static10.aClass8_Sub20_Sub1_1.method1847();
				local804 = Static10.aClass8_Sub20_Sub1_1.method1872();
				if (local804 == 255) {
					anInt852 = -1;
					return true;
				}
				@Pc(3921) Class8_Sub17[] local3921 = new Class8_Sub17[100];
				Static41.anInt990 = local804;
				for (local592 = 0; local592 < Static41.anInt990; local592++) {
					local3921[local592] = new Class8_Sub17();
					local3921[local592].aLong102 = Static10.aClass8_Sub20_Sub1_1.method1864();
					local3921[local592].aClass34_1035 = Static83.method1229(local3921[local592].aLong102);
					local3921[local592].anInt2224 = Static10.aClass8_Sub20_Sub1_1.method1839();
					local3921[local592].aByte5 = Static10.aClass8_Sub20_Sub1_1.method1847();
					if (local3921[local592].aLong102 == Static86.aLong73) {
						Static113.aByte6 = local3921[local592].aByte5;
					}
				}
				local3110 = Static41.anInt990;
				while (local3110 > 0) {
					@Pc(3988) boolean local3988 = true;
					local3110--;
					for (local2007 = 0; local2007 < local3110; local2007++) {
						if (local3921[local2007].aClass34_1035.method833(local3921[local2007 + 1].aClass34_1035) > 0) {
							local3988 = false;
							@Pc(4012) Class8_Sub17 local4012 = local3921[local2007];
							local3921[local2007] = local3921[local2007 + 1];
							local3921[local2007 + 1] = local4012;
						}
					}
					if (local3988) {
						break;
					}
				}
				anInt852 = -1;
				Static24.aClass8_Sub17Array2 = local3921;
				return true;
			}
			if (anInt852 == 25) {
				for (local712 = 0; local712 < Static31.anInt864; local712++) {
					@Pc(4053) Class8_Sub1_Sub14 local4053 = Static60.method932(local712);
					if (local4053 != null && local4053.anInt1956 == 0) {
						Static62.anIntArray194[local712] = 0;
						Static78.anIntArray238[local712] = 0;
					}
				}
				Static79.method1138();
				Static128.anInt3023 += 32;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 80) {
				Static79.method1138();
				Static108.anInt2487 = Static10.aClass8_Sub20_Sub1_1.method1856();
				Static116.anInt2612 = Static86.anInt2177;
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 194) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1889();
				Static107.anInt2463 = local712;
				Static127.method1980(local712);
				Static91.method1323(Static107.anInt2463);
				for (local763 = 0; local763 < 100; local763++) {
					Static23.aBooleanArray2[local763] = true;
				}
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 117) {
				Static45.method678();
				anInt852 = -1;
				return true;
			}
			if (anInt852 == 226) {
				local712 = Static10.aClass8_Sub20_Sub1_1.method1878();
				local763 = Static10.aClass8_Sub20_Sub1_1.method1861();
				local1674 = Static113.method1614(local763);
				if (local1674.anInt3116 != 1 || local1674.anInt3133 != local712) {
					local1674.anInt3133 = local712;
					local1674.anInt3116 = 1;
					Static40.method608(local1674);
				}
				anInt852 = -1;
				return true;
			}
			Static79.method1133(null, "T1 - " + anInt852 + "," + Static75.anInt1804 + "," + Static28.anInt797 + " - " + Static32.anInt872);
			Static10.method111();
		} catch (@Pc(4203) IOException local4203) {
			Static100.method1457();
		} catch (@Pc(4207) Exception local4207) {
			@Pc(4248) String local4248 = "T2 - " + anInt852 + "," + Static75.anInt1804 + "," + Static28.anInt797 + " - " + Static32.anInt872 + "," + (Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray262[0] + Static82.anInt1959) + "," + (Static64.anInt2062 + Static134.aClass8_Sub1_Sub1_Sub4_Sub1_1.anIntArray260[0]) + " - ";
			for (local763 = 0; Static32.anInt872 > local763 && local763 < 50; local763++) {
				local4248 = local4248 + Static10.aClass8_Sub20_Sub1_1.aByteArray44[local763] + ",";
			}
			Static79.method1133(local4207, local4248);
			Static10.method111();
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
	public static void method528() {
		aClass14_9 = null;
		aClass53_1 = null;
		aClass14_8 = null;
		aClass34_449 = null;
		aClass34_451 = null;
		aClass34_448 = null;
		aClass34_450 = null;
	}
}
