import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!client", name = "db", descriptor = "Lclient!oe;")
	public static Class72 aClass72_40;

	@OriginalMember(owner = "client!client", name = "ob", descriptor = "[Lclient!gd;")
	public static Class2_Sub3_Sub8[] aClass2_Sub3_Sub8Array2;

	@OriginalMember(owner = "client!client", name = "X", descriptor = "Lclient!qe;")
	public static Class78 aClass78_119 = Static199.method3560("Mem:");

	@OriginalMember(owner = "client!client", name = "bb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_120 = Static199.method3560(":chalreq:");

	@OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
	public static int anInt666 = 0;

	@OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
	public static int anInt669 = 0;

	@OriginalMember(owner = "client!client", name = "jb", descriptor = "Lclient!qe;")
	public static Class78 aClass78_121 = Static199.method3560("Texturen geladen)3");

	@OriginalMember(owner = "client!client", name = "a", descriptor = "([Lclient!mj;IIIIIII)V")
	public static void method471(@OriginalArg(0) Class64[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(6) Class64 local6 = arg0[local1];
			if (local6 != null && local6.anInt3075 == arg1 && (!local6.aBoolean132 || local6.anInt3051 == 0 || local6.aBoolean130 || method473(local6) != 0 || local6 == Static223.aClass64_14 || local6.anInt3002 == 1338) && (!local6.aBoolean132 || !method472(local6))) {
				@Pc(42) int local42 = local6.anInt3004 + arg6;
				@Pc(47) int local47 = local6.anInt3052 + arg7;
				@Pc(53) int local53;
				@Pc(55) int local55;
				@Pc(57) int local57;
				@Pc(59) int local59;
				if (local6.anInt3051 == 2) {
					local53 = arg2;
					local55 = arg3;
					local57 = arg4;
					local59 = arg5;
				} else {
					@Pc(65) int local65 = local42 + local6.anInt3021;
					@Pc(70) int local70 = local47 + local6.anInt3040;
					if (local6.anInt3051 == 9) {
						local65++;
						local70++;
					}
					local53 = local42 > arg2 ? local42 : arg2;
					local55 = local47 > arg3 ? local47 : arg3;
					local57 = local65 < arg4 ? local65 : arg4;
					local59 = local70 < arg5 ? local70 : arg5;
				}
				if (local6 == Static227.aClass64_17) {
					Static79.aBoolean63 = true;
					Static125.anInt1646 = local42;
					Static75.anInt1622 = local47;
				}
				if (!local6.aBoolean132 || local53 < local57 && local55 < local59) {
					if (local6.anInt3051 == 0) {
						if (!local6.aBoolean132 && method472(local6) && Static132.aClass64_10 != local6) {
							continue;
						}
						if (local6.aBoolean128 && Static44.anInt806 >= local53 && Static81.anInt1744 >= local55 && Static44.anInt806 < local57 && Static81.anInt1744 < local59) {
							for (@Pc(155) Class2_Sub1 local155 = (Class2_Sub1) Static37.aClass44_9.method1359(); local155 != null; local155 = (Class2_Sub1) Static37.aClass44_9.method1356()) {
								if (local155.aBoolean1) {
									local155.method3986();
								}
							}
							if (Static225.anInt4887 == 0) {
								Static227.aClass64_17 = null;
								Static223.aClass64_14 = null;
							}
							Static169.aBoolean170 = false;
						}
					}
					if (local6.aBoolean132) {
						@Pc(194) boolean local194;
						if (Static44.anInt806 >= local53 && Static81.anInt1744 >= local55 && Static44.anInt806 < local57 && Static81.anInt1744 < local59) {
							local194 = true;
						} else {
							local194 = false;
						}
						@Pc(199) boolean local199 = false;
						if (Static78.anInt1709 == 1 && local194) {
							local199 = true;
						}
						@Pc(208) boolean local208 = false;
						if (Static122.anInt1735 == 1 && Static205.anInt740 >= local53 && Static55.anInt981 >= local55 && Static205.anInt740 < local57 && Static55.anInt981 < local59) {
							local208 = true;
						}
						@Pc(232) int local232;
						@Pc(235) int local235;
						@Pc(243) int local243;
						if (Static4.anInt115 > 0 && local6.aByteArray42 != null) {
							for (local232 = 0; local232 < local6.aByteArray42.length; local232++) {
								for (local235 = 0; local235 < Static4.anInt115; local235++) {
									local243 = local6.aByteArray42[local232] & 0xFF;
									if (local243 == Static224.anIntArray788[local235]) {
										Static30.method406(local232 + 1, local6.anInt3044, Static73.aClass78_352, -1);
									}
								}
							}
						}
						if (local208) {
							Static99.method1694(Static205.anInt740 - local42, Static55.anInt981 - local47, local6);
						}
						if (Static227.aClass64_17 != null && Static227.aClass64_17 != local6 && local194 && Static186.method3430(method473(local6))) {
							Static156.aClass64_12 = local6;
						}
						if (local6 == Static223.aClass64_14) {
							Static226.aBoolean213 = true;
							Static4.anInt119 = local42;
							Static202.anInt4530 = local47;
						}
						if (local6.aBoolean130 || local6.anInt3002 != 0) {
							@Pc(318) Class2_Sub1 local318;
							if (local194 && Static148.anInt3392 != 0 && local6.anObjectArray24 != null) {
								local318 = new Class2_Sub1();
								local318.aBoolean1 = true;
								local318.aClass64_1 = local6;
								local318.anInt43 = Static148.anInt3392;
								local318.anObjectArray1 = local6.anObjectArray24;
								Static37.aClass44_9.method1355(local318);
							}
							if (Static227.aClass64_17 != null || Static55.aClass64_4 != null || Static202.aBoolean194 || local6.anInt3002 != 1400 && Static169.aBoolean170) {
								local208 = false;
								local199 = false;
								local194 = false;
							}
							if (local6.anInt3002 != 0) {
								if (local6.anInt3002 == 1337) {
									Static226.aClass64_16 = local6;
									Static70.method2259(local6);
									continue;
								}
								if (local6.anInt3002 == 1338) {
									if (local208) {
										Static213.method1604(Static55.anInt981 - local47, Static205.anInt740 - local42, local6);
									}
									continue;
								}
								if (local6.anInt3002 == 1400) {
									Static118.aClass64_8 = local6;
									if (local208) {
										if (Static121.aBooleanArray133[82] && Static66.anInt1320 > 0) {
											local232 = Static221.anInt4795 + (int) ((double) (Static205.anInt740 - local42 - local6.anInt3021 / 2) * 2.0D / Static174.aDouble11) + Static32.anInt4049;
											local235 = Static45.anInt815 + Static30.anInt547 - (int) ((double) (Static55.anInt981 - local47 - local6.anInt3040 / 2) * 2.0D / Static174.aDouble11) - Static223.anInt4831;
											@Pc(489) Class78 local489 = Static94.method1640(new Class78[] { Static10.aClass78_40, Static19.method268(local232 >> 6), Static198.aClass78_786, Static19.method268(local235 >> 6), Static198.aClass78_786, Static19.method268(local232 & 0x3F), Static198.aClass78_786, Static19.method268(local235 & 0x3F) });
											local489.method3026();
											Static104.method1790(local489);
											Static12.method229();
											continue;
										}
										Static169.aBoolean170 = true;
										Static114.anInt2545 = Static44.anInt806;
										Static148.anInt3382 = Static81.anInt1744;
										Static93.anInt2047 = Static32.anInt4049;
										Static81.anInt1742 = Static223.anInt4831;
										continue;
									}
									if (local199 && Static169.aBoolean170) {
										Static6.method127(Static93.anInt2047 + (int) ((double) (Static114.anInt2545 - Static44.anInt806) * 2.0D / Static165.aDouble10));
										Static176.method3213(Static81.anInt1742 + (int) ((double) (Static148.anInt3382 - Static81.anInt1744) * 2.0D / Static165.aDouble10));
										continue;
									}
									Static169.aBoolean170 = false;
									continue;
								}
								if (local6.anInt3002 == 1401) {
									if (local199) {
										Static170.method3112(local6.anInt3021, Static81.anInt1744 - local47, Static44.anInt806 - local42, local6.anInt3040);
									}
									continue;
								}
								if (local6.anInt3002 == 1402) {
									Static70.method2259(local6);
									continue;
								}
								if (local6.anInt3002 == 1404) {
									Static70.method2259(local6);
									continue;
								}
							}
							if (!local6.aBoolean126 && local208) {
								local6.aBoolean126 = true;
								if (local6.anObjectArray9 != null) {
									local318 = new Class2_Sub1();
									local318.aBoolean1 = true;
									local318.aClass64_1 = local6;
									local318.anInt41 = Static205.anInt740 - local42;
									local318.anInt43 = Static55.anInt981 - local47;
									local318.anObjectArray1 = local6.anObjectArray9;
									Static37.aClass44_9.method1355(local318);
								}
							}
							if (local6.aBoolean126 && local199 && local6.anObjectArray29 != null) {
								local318 = new Class2_Sub1();
								local318.aBoolean1 = true;
								local318.aClass64_1 = local6;
								local318.anInt41 = Static44.anInt806 - local42;
								local318.anInt43 = Static81.anInt1744 - local47;
								local318.anObjectArray1 = local6.anObjectArray29;
								Static37.aClass44_9.method1355(local318);
							}
							if (local6.aBoolean126 && !local199) {
								local6.aBoolean126 = false;
								if (local6.anObjectArray8 != null) {
									local318 = new Class2_Sub1();
									local318.aBoolean1 = true;
									local318.aClass64_1 = local6;
									local318.anInt41 = Static44.anInt806 - local42;
									local318.anInt43 = Static81.anInt1744 - local47;
									local318.anObjectArray1 = local6.anObjectArray8;
									Static150.aClass44_39.method1355(local318);
								}
							}
							if (local199 && local6.anObjectArray31 != null) {
								local318 = new Class2_Sub1();
								local318.aBoolean1 = true;
								local318.aClass64_1 = local6;
								local318.anInt41 = Static44.anInt806 - local42;
								local318.anInt43 = Static81.anInt1744 - local47;
								local318.anObjectArray1 = local6.anObjectArray31;
								Static37.aClass44_9.method1355(local318);
							}
							if (!local6.aBoolean127 && local194) {
								local6.aBoolean127 = true;
								if (local6.anObjectArray10 != null) {
									local318 = new Class2_Sub1();
									local318.aBoolean1 = true;
									local318.aClass64_1 = local6;
									local318.anInt41 = Static44.anInt806 - local42;
									local318.anInt43 = Static81.anInt1744 - local47;
									local318.anObjectArray1 = local6.anObjectArray10;
									Static37.aClass44_9.method1355(local318);
								}
							}
							if (local6.aBoolean127 && local194 && local6.anObjectArray25 != null) {
								local318 = new Class2_Sub1();
								local318.aBoolean1 = true;
								local318.aClass64_1 = local6;
								local318.anInt41 = Static44.anInt806 - local42;
								local318.anInt43 = Static81.anInt1744 - local47;
								local318.anObjectArray1 = local6.anObjectArray25;
								Static37.aClass44_9.method1355(local318);
							}
							if (local6.aBoolean127 && !local194) {
								local6.aBoolean127 = false;
								if (local6.anObjectArray4 != null) {
									local318 = new Class2_Sub1();
									local318.aBoolean1 = true;
									local318.aClass64_1 = local6;
									local318.anInt41 = Static44.anInt806 - local42;
									local318.anInt43 = Static81.anInt1744 - local47;
									local318.anObjectArray1 = local6.anObjectArray4;
									Static150.aClass44_39.method1355(local318);
								}
							}
							if (local6.anObjectArray30 != null) {
								local318 = new Class2_Sub1();
								local318.aClass64_1 = local6;
								local318.anObjectArray1 = local6.anObjectArray30;
								Static23.aClass44_7.method1355(local318);
							}
							@Pc(912) Class2_Sub1 local912;
							if (local6.anObjectArray26 != null && Static126.anInt2866 > local6.anInt3072) {
								if (local6.anIntArray503 == null || Static126.anInt2866 - local6.anInt3072 > 32) {
									local318 = new Class2_Sub1();
									local318.aClass64_1 = local6;
									local318.anObjectArray1 = local6.anObjectArray26;
									Static37.aClass44_9.method1355(local318);
								} else {
									label531: for (local232 = local6.anInt3072; local232 < Static126.anInt2866; local232++) {
										local235 = Static56.anIntArray161[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray503.length; local243++) {
											if (local6.anIntArray503[local243] == local235) {
												local912 = new Class2_Sub1();
												local912.aClass64_1 = local6;
												local912.anObjectArray1 = local6.anObjectArray26;
												Static37.aClass44_9.method1355(local912);
												break label531;
											}
										}
									}
								}
								local6.anInt3072 = Static126.anInt2866;
							}
							if (local6.anObjectArray15 != null && Static223.anInt4832 > local6.anInt3041) {
								if (local6.anIntArray495 == null || Static223.anInt4832 - local6.anInt3041 > 32) {
									local318 = new Class2_Sub1();
									local318.aClass64_1 = local6;
									local318.anObjectArray1 = local6.anObjectArray15;
									Static37.aClass44_9.method1355(local318);
								} else {
									label507: for (local232 = local6.anInt3041; local232 < Static223.anInt4832; local232++) {
										local235 = Static1.anIntArray1[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray495.length; local243++) {
											if (local6.anIntArray495[local243] == local235) {
												local912 = new Class2_Sub1();
												local912.aClass64_1 = local6;
												local912.anObjectArray1 = local6.anObjectArray15;
												Static37.aClass44_9.method1355(local912);
												break label507;
											}
										}
									}
								}
								local6.anInt3041 = Static223.anInt4832;
							}
							if (local6.anObjectArray20 != null && Static151.anInt3458 > local6.anInt3022) {
								if (local6.anIntArray497 == null || Static151.anInt3458 - local6.anInt3022 > 32) {
									local318 = new Class2_Sub1();
									local318.aClass64_1 = local6;
									local318.anObjectArray1 = local6.anObjectArray20;
									Static37.aClass44_9.method1355(local318);
								} else {
									label483: for (local232 = local6.anInt3022; local232 < Static151.anInt3458; local232++) {
										local235 = Static138.anIntArray527[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray497.length; local243++) {
											if (local6.anIntArray497[local243] == local235) {
												local912 = new Class2_Sub1();
												local912.aClass64_1 = local6;
												local912.anObjectArray1 = local6.anObjectArray20;
												Static37.aClass44_9.method1355(local912);
												break label483;
											}
										}
									}
								}
								local6.anInt3022 = Static151.anInt3458;
							}
							if (local6.anObjectArray2 != null && Static116.anInt2732 > local6.anInt3055) {
								if (local6.anIntArray500 == null || Static116.anInt2732 - local6.anInt3055 > 32) {
									local318 = new Class2_Sub1();
									local318.aClass64_1 = local6;
									local318.anObjectArray1 = local6.anObjectArray2;
									Static37.aClass44_9.method1355(local318);
								} else {
									label459: for (local232 = local6.anInt3055; local232 < Static116.anInt2732; local232++) {
										local235 = Static212.anIntArray743[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray500.length; local243++) {
											if (local6.anIntArray500[local243] == local235) {
												local912 = new Class2_Sub1();
												local912.aClass64_1 = local6;
												local912.anObjectArray1 = local6.anObjectArray2;
												Static37.aClass44_9.method1355(local912);
												break label459;
											}
										}
									}
								}
								local6.anInt3055 = Static116.anInt2732;
							}
							if (local6.anObjectArray23 != null && Static165.anInt3815 > local6.anInt3053) {
								if (local6.anIntArray499 == null || Static165.anInt3815 - local6.anInt3053 > 32) {
									local318 = new Class2_Sub1();
									local318.aClass64_1 = local6;
									local318.anObjectArray1 = local6.anObjectArray23;
									Static37.aClass44_9.method1355(local318);
								} else {
									label435: for (local232 = local6.anInt3053; local232 < Static165.anInt3815; local232++) {
										local235 = Static155.anIntArray589[local232 & 0x1F];
										for (local243 = 0; local243 < local6.anIntArray499.length; local243++) {
											if (local6.anIntArray499[local243] == local235) {
												local912 = new Class2_Sub1();
												local912.aClass64_1 = local6;
												local912.anObjectArray1 = local6.anObjectArray23;
												Static37.aClass44_9.method1355(local912);
												break label435;
											}
										}
									}
								}
								local6.anInt3053 = Static165.anInt3815;
							}
							if (Static129.anInt2901 > local6.anInt3043 && local6.anObjectArray17 != null) {
								local318 = new Class2_Sub1();
								local318.aClass64_1 = local6;
								local318.anObjectArray1 = local6.anObjectArray17;
								Static37.aClass44_9.method1355(local318);
							}
							if (Static140.anInt3198 > local6.anInt3043 && local6.anObjectArray7 != null) {
								local318 = new Class2_Sub1();
								local318.aClass64_1 = local6;
								local318.anObjectArray1 = local6.anObjectArray7;
								Static37.aClass44_9.method1355(local318);
							}
							if (Static159.anInt4179 > local6.anInt3043 && local6.anObjectArray5 != null) {
								local318 = new Class2_Sub1();
								local318.aClass64_1 = local6;
								local318.anObjectArray1 = local6.anObjectArray5;
								Static37.aClass44_9.method1355(local318);
							}
							if (Static170.anInt3943 > local6.anInt3043 && local6.anObjectArray28 != null) {
								local318 = new Class2_Sub1();
								local318.aClass64_1 = local6;
								local318.anObjectArray1 = local6.anObjectArray28;
								Static37.aClass44_9.method1355(local318);
							}
							if (Static155.anInt3569 > local6.anInt3043 && local6.anObjectArray12 != null) {
								local318 = new Class2_Sub1();
								local318.aClass64_1 = local6;
								local318.anObjectArray1 = local6.anObjectArray12;
								Static37.aClass44_9.method1355(local318);
							}
							local6.anInt3043 = Static133.anInt3087;
							if (local6.anObjectArray18 != null) {
								for (local232 = 0; local232 < Static4.anInt115; local232++) {
									@Pc(1380) Class2_Sub1 local1380 = new Class2_Sub1();
									local1380.aClass64_1 = local6;
									local1380.anInt45 = Static224.anIntArray788[local232];
									local1380.anInt47 = Static22.anIntArray53[local232];
									local1380.anObjectArray1 = local6.anObjectArray18;
									Static37.aClass44_9.method1355(local1380);
								}
							}
							if (Static117.aBoolean114 && local6.anObjectArray19 != null) {
								local318 = new Class2_Sub1();
								local318.aClass64_1 = local6;
								local318.anObjectArray1 = local6.anObjectArray19;
								Static37.aClass44_9.method1355(local318);
							}
						}
					}
					if (!local6.aBoolean132 && Static227.aClass64_17 == null && Static55.aClass64_4 == null && !Static202.aBoolean194) {
						if ((local6.anInt3069 >= 0 || local6.anInt3031 != 0) && Static44.anInt806 >= local53 && Static81.anInt1744 >= local55 && Static44.anInt806 < local57 && Static81.anInt1744 < local59) {
							if (local6.anInt3069 >= 0) {
								Static132.aClass64_10 = arg0[local6.anInt3069];
							} else {
								Static132.aClass64_10 = local6;
							}
						}
						if (local6.anInt3051 == 8 && Static44.anInt806 >= local53 && Static81.anInt1744 >= local55 && Static44.anInt806 < local57 && Static81.anInt1744 < local59) {
							Static185.aClass64_13 = local6;
						}
						if (local6.anInt3082 > local6.anInt3040) {
							Static186.method3431(local42 + local6.anInt3021, local47, local6.anInt3040, Static81.anInt1744, Static44.anInt806, local6.anInt3082, local6);
						}
					}
					if (local6.anInt3051 == 0) {
						method471(arg0, local6.anInt3044, local53, local55, local57, local59, local42 - local6.anInt3037, local47 - local6.anInt3046);
						if (local6.aClass64Array2 != null) {
							method471(local6.aClass64Array2, local6.anInt3044, local53, local55, local57, local59, local42 - local6.anInt3037, local47 - local6.anInt3046);
						}
						@Pc(1547) Class2_Sub11 local1547 = (Class2_Sub11) Static12.aClass103_4.method3659((long) local6.anInt3044);
						if (local1547 != null) {
							Static179.method3304(local57, local1547.anInt726, local59, local47, local42, local55, local53);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(Lclient!mj;)Z")
	public static boolean method472(@OriginalArg(0) Class64 arg0) {
		if (Static57.aBoolean21) {
			if (method473(arg0) != 0) {
				return false;
			}
			if (arg0.anInt3051 == 0) {
				return false;
			}
		}
		return arg0.aBoolean137;
	}

	@OriginalMember(owner = "client!client", name = "b", descriptor = "(Lclient!mj;)I")
	public static int method473(@OriginalArg(0) Class64 arg0) {
		@Pc(13) Class2_Sub7 local13 = (Class2_Sub7) Static108.aClass103_13.method3659(((long) arg0.anInt3044 << 32) + (long) arg0.anInt2993);
		return local13 == null ? arg0.anInt3000 : local13.anInt534;
	}

	@OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method474(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg8 && arg0 == arg7 && arg6 == arg2 && arg5 == arg4) {
			Static205.method544(arg8, arg0, arg3, arg4, arg2);
			return;
		}
		@Pc(40) int local40 = arg0;
		@Pc(42) int local42 = arg8;
		@Pc(46) int local46 = arg0 * 3;
		@Pc(50) int local50 = arg8 * 3;
		@Pc(54) int local54 = arg1 * 3;
		@Pc(58) int local58 = arg6 * 3;
		@Pc(62) int local62 = arg7 * 3;
		@Pc(66) int local66 = arg5 * 3;
		@Pc(76) int local76 = local62 + arg4 - arg0 - local66;
		@Pc(86) int local86 = local50 + local58 - local54 - local54;
		@Pc(95) int local95 = arg2 + local54 - local58 - arg8;
		@Pc(106) int local106 = local66 + local46 - local62 - local62;
		@Pc(111) int local111 = local54 - local50;
		@Pc(116) int local116 = local62 - local46;
		for (@Pc(118) int local118 = 128; local118 <= 4096; local118 += 128) {
			@Pc(126) int local126 = local118 * local118 >> 12;
			@Pc(132) int local132 = local126 * local118 >> 12;
			@Pc(136) int local136 = local76 * local132;
			@Pc(140) int local140 = local86 * local126;
			@Pc(144) int local144 = local106 * local126;
			@Pc(148) int local148 = local132 * local95;
			@Pc(152) int local152 = local118 * local111;
			@Pc(156) int local156 = local118 * local116;
			@Pc(166) int local166 = arg0 + (local144 + local136 + local156 >> 12);
			@Pc(176) int local176 = (local152 + local140 + local148 >> 12) + arg8;
			Static205.method544(local42, local40, arg3, local166, local176);
			local40 = local166;
			local42 = local176;
		}
	}

	@OriginalMember(owner = "client!client", name = "c", descriptor = "(Lclient!mj;)Lclient!mj;")
	public static Class64 method477(@OriginalArg(0) Class64 arg0) {
		@Pc(4) int local4 = Static227.method3989(method473(arg0));
		if (local4 == 0) {
			return null;
		}
		for (@Pc(10) int local10 = 0; local10 < local4; local10++) {
			arg0 = Static204.method3618(arg0.anInt3075);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}
}
