import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "I")
	public static int anInt1010;

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "I")
	public static int anInt1015 = -1;

	@OriginalMember(owner = "client!bs", name = "h", descriptor = "[I")
	public static final int[] anIntArray101 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(BZ[B)V")
	public static void method741(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1) {
		if (Static97.aClass1_Sub3_2 == null) {
			Static97.aClass1_Sub3_2 = new Class1_Sub3(20000);
		}
		Static97.aClass1_Sub3_2.method1181(arg1, arg1.length);
		if (!arg0) {
			return;
		}
		Static312.method4477(Static97.aClass1_Sub3_2.aByteArray14);
		Static279.aClass103_Sub1Array3 = new Class103_Sub1[Static286.anInt5429];
		@Pc(35) int local35 = 0;
		for (@Pc(37) int local37 = Static452.anInt7921; local37 <= Static461.anInt7756; local37++) {
			@Pc(43) Class103_Sub1 local43 = Static439.method5905(local37);
			if (local43 != null) {
				Static279.aClass103_Sub1Array3[local35++] = local43;
			}
		}
		Static44.aBoolean378 = false;
		Static98.aLong65 = Static250.method3737();
		Static97.aClass1_Sub3_2 = null;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)V")
	public static void method742() {
		Static149.aClass91_45.method1999();
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)I")
	public static int method743(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		@Pc(6) int local6 = arg2.length();
		@Pc(9) int local9 = arg0.length();
		@Pc(11) int local11 = 0;
		@Pc(18) int local18 = 0;
		@Pc(20) char local20 = 0;
		@Pc(22) char local22 = 0;
		while (local6 > local11 - local20 || local18 - local22 < local9) {
			if (local6 <= local11 - local20) {
				return -1;
			}
			if (local9 <= local18 - local22) {
				return 1;
			}
			@Pc(58) char local58;
			if (local20 == '\u0000') {
				local58 = arg2.charAt(local11++);
			} else {
				local58 = local20;
			}
			@Pc(73) char local73;
			if (local22 == '\u0000') {
				local73 = arg0.charAt(local18++);
			} else {
				local73 = local22;
			}
			local20 = Static411.method5582(local58);
			local22 = Static411.method5582(local73);
			local58 = Static81.method1501(local58, arg1);
			local73 = Static81.method1501(local73, arg1);
			if (local58 != local73 && Character.toUpperCase(local58) != Character.toUpperCase(local73)) {
				local58 = Character.toLowerCase(local58);
				local73 = Character.toLowerCase(local73);
				if (local73 != local58) {
					return Static149.method2366(local58, arg1) - Static149.method2366(local73, arg1);
				}
			}
		}
		@Pc(143) int local143 = Math.min(local6, local9);
		for (@Pc(145) int local145 = 0; local145 < local143; local145++) {
			if (arg1 == 2) {
				local18 = local9 - local145 - 1;
				local11 = local6 - local145 - 1;
			} else {
				local18 = local145;
				local11 = local145;
			}
			@Pc(173) char local173 = arg2.charAt(local11);
			@Pc(177) char local177 = arg0.charAt(local18);
			if (local173 != local177 && Character.toUpperCase(local173) != Character.toUpperCase(local177)) {
				local173 = Character.toLowerCase(local173);
				local177 = Character.toLowerCase(local177);
				if (local177 != local173) {
					return Static149.method2366(local173, arg1) - Static149.method2366(local177, arg1);
				}
			}
		}
		@Pc(225) int local225 = local6 - local9;
		if (local225 != 0) {
			return local225;
		}
		for (@Pc(234) int local234 = 0; local234 < local143; local234++) {
			@Pc(239) char local239 = arg2.charAt(local234);
			@Pc(243) char local243 = arg0.charAt(local234);
			if (local243 != local239) {
				return Static149.method2366(local239, arg1) - Static149.method2366(local243, arg1);
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!bs", name = "a", descriptor = "(IZIIIII[Lclient!ec;II)V")
	public static void method745(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class68[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
		for (@Pc(13) int local13 = 0; local13 < arg6.length; local13++) {
			@Pc(19) Class68 local19 = arg6[local13];
			if (local19 != null && (local19.anInt2129 == arg2 || arg2 == -1412584499 && local19 == Static404.aClass68_11)) {
				@Pc(42) int local42;
				if (arg0 == -1) {
					Class30_Sub1_Sub1_Sub2.aRectangleArray2[Static316.anInt5918].setBounds(arg8 + local19.anInt2170, local19.anInt2175 - -arg5, local19.anInt2107, local19.anInt2149);
					local42 = Static316.anInt5918++;
				} else {
					local42 = arg0;
				}
				local19.anInt2105 = Static187.anInt3975;
				local19.anInt2161 = local42;
				if (!Static55.method1064(local19)) {
					if (local19.anInt2169 != 0) {
						Static17.method333(local19);
					}
					@Pc(87) int local87 = arg8 + local19.anInt2170;
					@Pc(92) int local92 = arg5 + local19.anInt2175;
					@Pc(95) int local95 = local19.anInt2131;
					if (Static226.aBoolean281 && (Static55.method1059(local19).anInt5243 != 0 || local19.anInt2153 == 0) && local95 > 127) {
						local95 = 127;
					}
					@Pc(150) int local150;
					@Pc(154) int local154;
					if (local19 == Static404.aClass68_11) {
						if (arg2 != -1412584499 && (Static434.anInt7638 == local19.anInt2152 || local19.anInt2152 == Static221.anInt4419)) {
							Static12.anInt164 = arg5;
							Static362.anInt6664 = arg8;
							Static77.aClass68Array1 = arg6;
							continue;
						}
						if (Static256.aBoolean148 && Static57.aBoolean98) {
							local150 = Static336.aClass87_1.method1919();
							local154 = Static336.aClass87_1.method1909();
							local154 -= Static200.anInt4108;
							local150 -= Static238.anInt4690;
							if (local150 < Static122.anInt2689) {
								local150 = Static122.anInt2689;
							}
							if (Static271.anInt5262 > local154) {
								local154 = Static271.anInt5262;
							}
							if (local150 + local19.anInt2107 > Static326.aClass68_14.anInt2107 + Static122.anInt2689) {
								local150 = Static326.aClass68_14.anInt2107 + Static122.anInt2689 - local19.anInt2107;
							}
							if (local154 + local19.anInt2149 > Static326.aClass68_14.anInt2149 + Static271.anInt5262) {
								local154 = Static326.aClass68_14.anInt2149 + Static271.anInt5262 - local19.anInt2149;
							}
							local87 = local150;
							local92 = local154;
						}
						if (Static221.anInt4419 == local19.anInt2152) {
							local95 = 128;
						}
					}
					@Pc(283) int local283;
					@Pc(272) int local272;
					@Pc(230) int local230;
					@Pc(235) int local235;
					if (local19.anInt2153 == 2) {
						local150 = arg1;
						local283 = arg4;
						local154 = arg3;
						local272 = arg7;
					} else {
						local230 = local19.anInt2107 + local87;
						local235 = local92 + local19.anInt2149;
						if (local19.anInt2153 == 9) {
							local230++;
							local235++;
						}
						local154 = arg3 < local92 ? local92 : arg3;
						local150 = arg1 >= local87 ? arg1 : local87;
						local272 = arg7 > local235 ? local235 : arg7;
						local283 = local230 < arg4 ? local230 : arg4;
					}
					if (local283 > local150 && local154 < local272) {
						@Pc(524) int local524;
						@Pc(572) int local572;
						@Pc(596) int local596;
						@Pc(490) int local490;
						@Pc(522) int local522;
						if (local19.anInt2169 != 0) {
							if (Static227.anInt4498 == local19.anInt2169 || local19.anInt2169 == Static210.anInt4289) {
								Static384.method5370(local87, Static210.anInt4289 == local19.anInt2169, local19.anInt2149, local19.anInt2107, local92);
								Static58.aBooleanArray8[local42] = true;
								Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
								continue;
							}
							if (Static258.anInt5004 == local19.anInt2169) {
								if (local19.method1579(Static30.aClass106_3) != null) {
									Static326.method4622();
									Static327.method4637(Static30.aClass106_3, local87, local19, local92);
									Static55.aBooleanArray7[local42] = true;
									Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
								}
								continue;
							}
							if (local19.anInt2169 == Static17.anInt395) {
								if (local19.method1579(Static30.aClass106_3) != null) {
									Static277.method4096(local19, local92, local87);
									Static55.aBooleanArray7[local42] = true;
									Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
								}
								continue;
							}
							if (local19.anInt2169 == Static47.anInt7030) {
								Static403.method5530(local92, Static30.aClass106_3, local87, Static284.anInterface7_4, local19.anInt2107, local19.anInt2149);
								Static58.aBooleanArray8[local42] = true;
								Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
								continue;
							}
							if (Static1.anInt42 == local19.anInt2169) {
								Static115.method1869(local92, Static30.aClass106_3, local19.anInt2107, local87, local19.anInt2149);
								Static58.aBooleanArray8[local42] = true;
								Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
								continue;
							}
							if (Static273.anInt5303 == local19.anInt2169) {
								if (!Static227.aBoolean283 && !Static28.aBoolean25) {
									continue;
								}
								local230 = local87 + local19.anInt2107;
								local235 = local92 + 15;
								if (Static227.aBoolean283) {
									local490 = -256;
									if (Static441.anInt7762 < 20) {
										local490 = -65536;
									}
									Static308.aClass20_5.method5339(local490, "Fps:" + Static441.anInt7762, local230, local235);
									local235 += 15;
									@Pc(512) Runtime local512 = Runtime.getRuntime();
									local522 = (int) ((local512.totalMemory() - local512.freeMemory()) / 1024L);
									local524 = -256;
									if (local522 > 65536) {
										local524 = -65536;
									}
									Static308.aClass20_5.method5339(local524, "Mem:" + local522 + "k", local230, local235);
									local235 += 15;
									Static308.aClass20_5.method5339(-256, "In:" + Static223.anInt4458 + "B/s Out:" + Static137.anInt3044 + "B/s", local230, local235);
									local235 += 15;
									local572 = Static30.aClass106_3.pa() / 1024;
									Static308.aClass20_5.method5339(local572 > 65536 ? -65536 : -256, "Offheap:" + local572 + "k", local230, local235);
									local235 += 15;
									local596 = 0;
									@Pc(598) int local598 = 0;
									@Pc(600) int local600 = 0;
									for (@Pc(602) int local602 = 0; local602 < 30; local602++) {
										local596 += Static304.aClass111_Sub1Array2[local602].method2687();
										local598 += Static304.aClass111_Sub1Array2[local602].method2681();
										local600 += Static304.aClass111_Sub1Array2[local602].method2686();
									}
									@Pc(638) int local638 = local600 * 100 / local596;
									@Pc(644) int local644 = local598 * 10000 / local596;
									@Pc(664) String local664 = "Cache:" + Static319.method1370(2, true, 0, (long) local644) + "% (" + local638 + "%)";
									Static180.aClass20_3.method5339(-256, local664, local230, local235);
									local235 += 12;
								}
								if (Static50.anInt1218 > 0) {
									Static180.aClass20_3.method5339(-256, "Particles: " + Static102.anInt2384 + " / " + Static50.anInt1218, local230, local235);
								}
								local235 += 12;
								if (Static28.aBoolean25) {
									Static180.aClass20_3.method5339(-256, "Polys: " + Static30.aClass106_3.OA() + " Models: " + Static30.aClass106_3.Y(), local230, local235);
									local235 += 12;
									Static180.aClass20_3.method5339(-256, "Ls: " + Static233.anInt4619 + " La: " + Static104.anInt2412 + " NPC: " + Static261.anInt5048 + " Pl: " + Static55.anInt1495, local230, local235);
									local235 += 12;
									Static53.method993();
								}
								Static58.aBooleanArray8[local42] = true;
								continue;
							}
						}
						if (local19.anInt2153 == 0) {
							if (local19.anInt2169 == Static77.anInt1950 && Static30.aClass106_3.method5945()) {
								Static30.aClass106_3.method5921(local87, local92, local19.anInt2107, local19.anInt2149);
							}
							method745(local42, local150, local19.anInt2135, local154, local283, local92 - local19.anInt2125, arg6, local272, local87 - local19.anInt2124);
							if (local19.aClass68Array2 != null) {
								method745(local42, local150, local19.anInt2135, local154, local283, local92 - local19.anInt2125, local19.aClass68Array2, local272, local87 - local19.anInt2124);
							}
							@Pc(828) Class1_Sub39 local828 = (Class1_Sub39) Static177.aClass38_18.method765((long) local19.anInt2135);
							if (local828 != null) {
								Static181.method3042(local150, local42, local272, local828.anInt6172, local92, local87, local154, local283);
							}
							if (local19.anInt2169 == Static77.anInt1950 && Static30.aClass106_3.method5945()) {
								Static30.aClass106_3.method5964();
								Static456.aBoolean105 = true;
							}
							Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
						}
						if (Static69.aBooleanArray10[local42] || Static213.anInt3960 > 1) {
							if (local19.anInt2153 == 3) {
								if (local95 == 0) {
									if (local19.aBoolean132) {
										Static30.aClass106_3.P(local87, local92, local19.anInt2107, local19.anInt2149, local19.anInt2189, 0);
									} else {
										Static30.aClass106_3.method5958(local87, local92, local19.anInt2107, local19.anInt2149, local19.anInt2189, 0);
									}
								} else if (local19.aBoolean132) {
									Static30.aClass106_3.P(local87, local92, local19.anInt2107, local19.anInt2149, 255 - (local95 & 0xFF) << 24 | local19.anInt2189 & 0xFFFFFF, 1);
								} else {
									Static30.aClass106_3.method5958(local87, local92, local19.anInt2107, local19.anInt2149, local19.anInt2189 & 0xFFFFFF | 255 - (local95 & 0xFF) << 24, 1);
								}
							} else if (local19.anInt2153 == 4) {
								@Pc(963) Class20 local963 = local19.method1568(Static30.aClass106_3);
								if (local963 != null) {
									local235 = local19.anInt2189;
									@Pc(978) String local978 = local19.aString23;
									if (local19.anInt2136 != -1) {
										@Pc(989) Class168 local989 = Static43.aClass57_1.method1414(local19.anInt2136);
										local978 = local989.aString37;
										if (local978 == null) {
											local978 = "null";
										}
										if ((local989.anInt4854 == 1 || local19.anInt2106 != 1) && local19.anInt2106 != -1) {
											local978 = "<col=ff9040>" + local978 + "</col> x" + Static320.method4546(local19.anInt2106);
										}
									}
									if (Static18.aClass68_1 == local19) {
										local978 = Static271.aClass158_133.method3594(Static365.anInt6682);
										local235 = local19.anInt2189;
									}
									if (Static291.aBoolean483) {
										Static30.aClass106_3.HA(local87, local92, local19.anInt2107 + local87, local92 + local19.anInt2149);
									}
									local963.method5347(null, local19.anInt2115, local978, local235 | 255 - (local95 & 0xFF) << 24, local19.anInt2173, local19.aBoolean138 ? 255 - (local95 & 0xFF) << 24 : -1, 0, local92, local87, local19.anInt2102, Static184.aClass137Array8, local19.anInt2149, local19.anInt2180, 0, local19.anInt2107, null);
									if (Static291.aBoolean483) {
										Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
									}
								} else if (Static31.aBoolean130) {
									Static446.method6042(local19);
								}
							} else {
								@Pc(1210) int local1210;
								if (local19.anInt2153 == 5) {
									if (local19.anInt2185 >= 0) {
										local19.method1580(Static106.aClass53_1, Static100.aClass42_1).method4275(Static30.aClass106_3, 0, local19.anInt2107, local19.anInt2133 << 3, local19.anInt2149, local87, 0, local92, local19.anInt2168 << 3);
									} else {
										@Pc(1155) Class137 local1155;
										if (local19.anInt2136 == -1) {
											local1155 = local19.method1572(Static30.aClass106_3);
										} else {
											@Pc(1165) Class210 local1165 = local19.aBoolean133 ? Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1 : null;
											local1155 = Static43.aClass57_1.method1416(local19.anInt2141, Static30.aClass106_3, local19.anInt2192 | 0xFF000000, local19.anInt2136, local19.anInt2165, local1165, local19.anInt2106);
										}
										if (local1155 != null) {
											local235 = local1155.RA();
											local490 = local1155.Q();
											local1210 = 255 - (local95 & 0xFF) << 24 | (local19.anInt2189 == 0 ? 16777215 : local19.anInt2189 & 0xFFFFFF);
											if (local19.aBoolean141) {
												Static30.aClass106_3.HA(local87, local92, local87 + local19.anInt2107, local92 - -local19.anInt2149);
												if (local19.anInt2113 != 0) {
													local522 = (local19.anInt2107 + local235 - 1) / local235;
													local524 = (local490 + local19.anInt2149 - 1) / local490;
													for (local572 = 0; local572 < local522; local572++) {
														for (local596 = 0; local596 < local524; local596++) {
															if (local19.anInt2189 == 0) {
																local1155.method5701((float) local235 / 2.0F + (float) (local235 * local572 + local87), (float) local490 / 2.0F + (float) (local92 - -(local596 * local490)), 4096, local19.anInt2113);
															} else {
																local1155.method5705((float) local235 / 2.0F + (float) (local87 + local235 * local572), (float) (local490 * local596 + local92) + (float) local490 / 2.0F, 4096, local19.anInt2113, local1210);
															}
														}
													}
												} else if (local19.anInt2189 == 0 && local95 == 0) {
													local1155.method5707(local87, local92, local19.anInt2107, local19.anInt2149);
												} else {
													local1155.la(local87, local92, local19.anInt2107, local19.anInt2149, 0, local1210, 1);
												}
												Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
											} else if (local19.anInt2189 == 0 && local95 == 0) {
												if (local19.anInt2113 != 0) {
													local1155.method5701((float) local87 + (float) local19.anInt2107 / 2.0F, (float) local92 + (float) local19.anInt2149 / 2.0F, local19.anInt2107 * 4096 / local235, local19.anInt2113);
												} else if (local235 == local19.anInt2107 && local19.anInt2149 == local490) {
													local1155.method5708(local87, local92);
												} else {
													local1155.method5700(local87, local92, local19.anInt2107, local19.anInt2149);
												}
											} else if (local19.anInt2113 != 0) {
												local1155.method5705((float) local19.anInt2107 / 2.0F + (float) local87, (float) local92 + (float) local19.anInt2149 / 2.0F, local19.anInt2107 * 4096 / local235, local19.anInt2113, local1210);
											} else if (local235 == local19.anInt2107 && local490 == local19.anInt2149) {
												local1155.W(local87, local92, 0, local1210, 1);
											} else {
												local1155.ya(local87, local92, local19.anInt2107, local19.anInt2149, 0, local1210, 1);
											}
										} else if (Static31.aBoolean130) {
											Static446.method6042(local19);
										}
									}
								} else if (local19.anInt2153 == 6) {
									Static31.method1543();
									@Pc(1531) Class17 local1531 = null;
									local235 = 0;
									@Pc(1565) Class235 local1565;
									@Pc(1573) Class210 local1573;
									if (local19.anInt2136 != -1) {
										@Pc(1544) Class168 local1544 = Static43.aClass57_1.method1414(local19.anInt2136);
										if (local1544 != null) {
											local1544 = local1544.method3721(local19.anInt2106);
											local1565 = local19.anInt2111 == -1 ? null : Static107.aClass239_1.method5420(local19.anInt2111);
											local1573 = local19.aBoolean133 ? Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1 : null;
											local1531 = local1544.method3717(2048, local19.anInt2151, Static30.aClass106_3, local19.anInt2128, local1565, 1, local1573, local19.anInt2116);
											if (local1531 == null) {
												Static446.method6042(local19);
											} else {
												local235 = -local1531.B() >> 1;
											}
										}
									} else if (local19.anInt2162 == 5) {
										local490 = local19.anInt2176;
										if (local490 >= 0 && local490 < 2048) {
											@Pc(1756) Class30_Sub1_Sub1_Sub2 local1756 = Static135.aClass30_Sub1_Sub1_Sub2Array1[local490];
											@Pc(1768) Class235 local1768 = local19.anInt2111 == -1 ? null : Static107.aClass239_1.method5420(local19.anInt2111);
											if (local1756 != null && (Static32.anInt894 == local490 || Static122.method1982(local1756.aString9) == local19.anInt2127)) {
												local1531 = local1756.aClass210_1.method4724(Static300.aClass44_2, Static366.aClass190_1, -1, 0, local19.anInt2151, Static43.aClass57_1, local19.anInt2128, null, null, local19.anInt2116, 2048, local1768, Static19.aClass143_1, Static30.aClass106_3, Static107.aClass239_1, 0, Static241.aClass258_1);
											}
										}
									} else if (local19.anInt2162 == 8 || local19.anInt2162 == 9) {
										@Pc(1628) Class1_Sub46 local1628 = Static114.method1848(false, local19.anInt2176);
										local1565 = local19.anInt2111 == -1 ? null : Static107.aClass239_1.method5420(local19.anInt2111);
										if (local1628 != null) {
											local1573 = local19.aBoolean133 ? Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1 : null;
											local1531 = local1628.method6184(Static30.aClass106_3, local19.anInt2151, local1565, local19.anInt2128, local19.anInt2127, local1573, local19.anInt2116, local19.anInt2162 == 9);
										}
									} else if (local19.anInt2111 == -1) {
										local1531 = local19.method1581(Static43.aClass57_1, null, Static300.aClass44_2, Static30.aClass106_3, Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1, 0, Static366.aClass190_1, Static107.aClass239_1, Static19.aClass143_1, 2048, Static241.aClass258_1, -1, -1);
										if (local1531 == null && Static31.aBoolean130) {
											Static446.method6042(local19);
										}
									} else {
										@Pc(1684) Class235 local1684 = Static107.aClass239_1.method5420(local19.anInt2111);
										local1531 = local19.method1581(Static43.aClass57_1, local1684, Static300.aClass44_2, Static30.aClass106_3, Static429.aClass30_Sub1_Sub1_Sub2_2.aClass210_1, local19.anInt2128, Static366.aClass190_1, Static107.aClass239_1, Static19.aClass143_1, 2048, Static241.aClass258_1, local19.anInt2116, local19.anInt2151);
										if (local1531 == null && Static31.aBoolean130) {
											Static446.method6042(local19);
										}
									}
									if (local1531 != null) {
										if (local19.anInt2126 <= 0) {
											local490 = 512;
										} else {
											local490 = (local19.anInt2107 << 9) / local19.anInt2126;
										}
										if (local19.anInt2145 > 0) {
											local1210 = (local19.anInt2149 << 9) / local19.anInt2145;
										} else {
											local1210 = 512;
										}
										local522 = local87 + local19.anInt2107 / 2 + (local19.anInt2186 * local490 >> 9);
										local524 = (local19.anInt2191 * local1210 >> 9) + local92 + local19.anInt2149 / 2;
										Static343.aClass40_4.v();
										Static30.aClass106_3.SA(Static343.aClass40_4);
										Static30.aClass106_3.GA(local522, local524, local490, local1210);
										Static30.aClass106_3.da((float) (local19.anInt2172 << 0), local19.aBoolean143 ? (float) (local19.anInt2134 << 0) : (float) (local19.anInt2134 << 0) * 1.5F);
										if (arg2 == -1412584499 || Static456.aBoolean105) {
											Static30.aClass106_3.va();
											Static30.aClass106_3.method5926();
											Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
											Static456.aBoolean105 = false;
										}
										if (local19.aBoolean134) {
											Static30.aClass106_3.method5955(false);
										}
										local572 = Class90_Sub1.anIntArray304[local19.anInt2167 << 3] * (local19.anInt2112 << 0) >> 15;
										local596 = (local19.anInt2112 << 0) * Class90_Sub1.anIntArray303[local19.anInt2167 << 3] >> 15;
										Static97.aClass40_1.A(-local19.anInt2182 << 3);
										Static97.aClass40_1.EA(local19.anInt2120 << 3);
										Static97.aClass40_1.W(local19.anInt2108 << 0, local235 + (local19.anInt2142 << 0) + local572, local596 - -(local19.anInt2142 << 0));
										Static97.aClass40_1.ea(local19.anInt2167 << 3);
										if (Static291.aBoolean483) {
											Static30.aClass106_3.HA(local87, local92, local19.anInt2107 + local87, local92 + local19.anInt2149);
										}
										if (local19.aBoolean143) {
											local1531.method6195(Static97.aClass40_1, null, local19.anInt2112 << 0);
										} else {
											local1531.method6189(Static97.aClass40_1, null, 1);
										}
										if (Static291.aBoolean483) {
											Static30.aClass106_3.ba(arg1, arg3, arg4, arg7);
										}
										if (local19.aBoolean134) {
											Static30.aClass106_3.method5955(true);
										}
										Static30.aClass106_3.da(0.0F, 0.0F);
									}
								} else if (local19.anInt2153 == 9) {
									if (local19.lb) {
										local235 = local92 + local19.anInt2149;
										local1210 = local92;
										local490 = local87 + local19.anInt2107;
									} else {
										local1210 = local19.anInt2149 + local92;
										local235 = local92;
										local490 = local19.anInt2107 + local87;
									}
									if (local19.anInt2178 == 1) {
										Static30.aClass106_3.method5923(local87, local235, local490, local1210, local19.anInt2189, 0);
									} else {
										Static30.aClass106_3.method5948(local87, local235, local490, local1210, local19.anInt2189, local19.anInt2178);
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
