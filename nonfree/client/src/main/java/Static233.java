import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "I")
	public static int anInt4249;

	@OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
	public static int anInt4246 = 0;

	@OriginalMember(owner = "client!ln", name = "m", descriptor = "Lclient!qo;")
	public static final Class196 aClass196_21 = new Class196(8);

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "Z")
	public static boolean aBoolean316 = false;

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!of;)V")
	public static void method3213(@OriginalArg(1) Class4_Sub30_Sub1 arg0) {
		arg0.method3917();
		@Pc(10) int local10 = Static373.anInt6574;
		@Pc(20) Class6_Sub2_Sub1_Sub1 local20 = Static375.aClass6_Sub2_Sub1_Sub1_3 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local10] = new Class6_Sub2_Sub1_Sub1();
		local20.anInt6078 = local10;
		@Pc(28) int local28 = arg0.method3924(30);
		@Pc(33) byte local33 = (byte) (local28 >> 28);
		@Pc(39) int local39 = local28 >> 14 & 0x3FFF;
		@Pc(43) int local43 = local28 & 0x3FFF;
		local20.anIntArray536[0] = local39 - Static381.anInt6688;
		local20.anInt6062 = (local20.anIntArray536[0] << 7) + (local20.method4763() << 6);
		local20.anIntArray537[0] = local43 - Static285.anInt5187;
		local20.anInt6061 = (local20.anIntArray537[0] << 7) + (local20.method4763() << 6);
		Static221.anInt4855 = local20.aByte86 = local33;
		if (Static165.aClass4_Sub30Array1[local10] != null) {
			local20.method716(Static165.aClass4_Sub30Array1[local10]);
		}
		Static58.anInt4352 = 0;
		Static144.anIntArray186[Static58.anInt4352++] = local10;
		Static3.aByteArray2[local10] = 0;
		Static394.anInt6801 = 0;
		for (@Pc(126) int local126 = 1; local126 < 2048; local126++) {
			if (local126 != local10) {
				@Pc(140) int local140 = arg0.method3924(18);
				@Pc(144) int local144 = local140 >> 16;
				@Pc(150) int local150 = local140 >> 8 & 0xFF;
				@Pc(154) int local154 = local140 & 0xFF;
				@Pc(162) Class171 local162 = Static114.aClass171Array1[local126] = new Class171();
				local162.anInt4899 = 0;
				local162.anInt4901 = -1;
				local162.aBoolean346 = false;
				local162.anInt4895 = local154 + (local150 << 14) + (local144 << 28);
				Static341.anIntArray532[Static394.anInt6801++] = local126;
				Static3.aByteArray2[local126] = 0;
			}
		}
		arg0.method3925();
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IIIII[Lclient!jb;BIII)V")
	public static void method3220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class126[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
		for (@Pc(13) int local13 = 0; local13 < arg5.length; local13++) {
			@Pc(19) Class126 local19 = arg5[local13];
			if (local19 != null && (local19.anInt3405 == arg3 || arg3 == -1412584499 && local19 == Static15.aClass126_1)) {
				@Pc(41) int local41;
				if (arg6 == -1) {
					Class6_Sub4.aRectangleArray4[Static180.anInt3352].setBounds(arg8 + local19.anInt3406, local19.anInt3415 - -arg1, local19.anInt3421, local19.anInt3442);
					local41 = Static180.anInt3352++;
				} else {
					local41 = arg6;
				}
				local19.anInt3435 = Static175.anInt3261;
				local19.anInt3440 = local41;
				if (!Static55.method1119(local19)) {
					if (local19.anInt3434 != 0) {
						Static401.method5321(local19);
					}
					@Pc(87) int local87 = local19.anInt3406 + arg8;
					@Pc(92) int local92 = arg1 + local19.anInt3415;
					@Pc(95) int local95 = local19.anInt3422;
					if (Static197.aBoolean436 && (Static55.method1118(local19).anInt5771 != 0 || local19.anInt3426 == 0) && local95 > 127) {
						local95 = 127;
					}
					@Pc(148) int local148;
					@Pc(152) int local152;
					if (local19 == Static15.aClass126_1) {
						if (arg3 != -1412584499 && (local19.anInt3471 == Static149.anInt2832 || local19.anInt3471 == Static442.anInt7386)) {
							Static93.anInt2010 = arg1;
							Static326.aClass126Array2 = arg5;
							Static395.anInt6804 = arg8;
							continue;
						}
						if (Static236.aBoolean323 && Static343.aBoolean424) {
							local148 = Static284.aClass12_1.method4220();
							local152 = Static284.aClass12_1.method4219();
							local152 -= Static383.anInt6698;
							local148 -= Static31.anInt729;
							if (local148 < Static286.anInt5206) {
								local148 = Static286.anInt5206;
							}
							if (local148 + local19.anInt3421 > Static171.aClass126_6.anInt3421 + Static286.anInt5206) {
								local148 = Static171.aClass126_6.anInt3421 + Static286.anInt5206 - local19.anInt3421;
							}
							if (local152 < Static224.anInt4138) {
								local152 = Static224.anInt4138;
							}
							local87 = local148;
							if (local152 + local19.anInt3442 > Static224.anInt4138 + Static171.aClass126_6.anInt3442) {
								local152 = Static224.anInt4138 + Static171.aClass126_6.anInt3442 - local19.anInt3442;
							}
							local92 = local152;
						}
						if (local19.anInt3471 == Static442.anInt7386) {
							local95 = 128;
						}
					}
					@Pc(234) int local234;
					@Pc(236) int local236;
					@Pc(248) int local248;
					@Pc(253) int local253;
					if (local19.anInt3426 == 2) {
						local234 = arg0;
						local236 = arg7;
						local148 = arg2;
						local152 = arg4;
					} else {
						local248 = local87 + local19.anInt3421;
						local253 = local19.anInt3442 + local92;
						local148 = arg2 < local87 ? local87 : arg2;
						local152 = arg4 >= local92 ? arg4 : local92;
						if (local19.anInt3426 == 9) {
							local253++;
							local248++;
						}
						local234 = arg0 <= local248 ? arg0 : local248;
						local236 = local253 < arg7 ? local253 : arg7;
					}
					if (local234 > local148 && local152 < local236) {
						@Pc(556) int local556;
						@Pc(582) int local582;
						@Pc(584) int local584;
						@Pc(506) int local506;
						@Pc(508) int local508;
						if (local19.anInt3434 != 0) {
							if (local19.anInt3434 == Static30.anInt695 || local19.anInt3434 == Static12.anInt385) {
								Static381.method5196(local19.anInt3421, local19.anInt3442, local92, local19.anInt3434 == Static12.anInt385, local87);
								Static26.aBooleanArray2[local41] = true;
								Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
								continue;
							}
							if (Static73.anInt1748 == local19.anInt3434) {
								if (local19.method2671(Static16.aClass30_11) != null) {
									Static10.method281();
									Static280.method3739(local92, local87, local19, Static16.aClass30_11);
									Static203.aBooleanArray11[local41] = true;
									Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
								}
								continue;
							}
							if (local19.anInt3434 == Static187.anInt3600) {
								if (local19.method2671(Static16.aClass30_11) != null) {
									Static19.method438(local19, local92, local87);
									Static203.aBooleanArray11[local41] = true;
									Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
								}
								continue;
							}
							if (local19.anInt3434 == Static150.anInt2842) {
								Static109.method5350(local92, local19.anInt3421, Static222.anInterface10_6, local87, local19.anInt3442, Static16.aClass30_11);
								Static26.aBooleanArray2[local41] = true;
								Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
								continue;
							}
							if (local19.anInt3434 == Static245.anInt4488) {
								Static176.method2583(local92, local19.anInt3442, local19.anInt3421, Static16.aClass30_11, local87);
								Static26.aBooleanArray2[local41] = true;
								Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
								continue;
							}
							if (local19.anInt3434 == Static160.anInt3010) {
								if (!Static107.aBoolean174 && !Static149.aBoolean206) {
									continue;
								}
								local248 = local87 + local19.anInt3421;
								local253 = local92 + 15;
								if (Static107.aBoolean174) {
									Static390.aClass105_7.method5605(local253, local248, "Fps:" + Static379.anInt6645, -256);
									local253 += 15;
									@Pc(496) Runtime local496 = Runtime.getRuntime();
									local506 = (int) ((local496.totalMemory() - local496.freeMemory()) / 1024L);
									local508 = -256;
									if (local506 > 65536) {
										local508 = -65536;
									}
									Static390.aClass105_7.method5605(local253, local248, "Mem:" + local506 + "k", local508);
									local253 += 15;
									Static390.aClass105_7.method5605(local253, local248, "In:" + Static359.anInt6421 + "B/s Out:" + Static240.anInt4394 + "B/s", -256);
									local253 += 15;
									local556 = Static16.aClass30_11.FA() / 1024;
									Static390.aClass105_7.method5605(local253, local248, "Offheap:" + local556 + "k", local556 > 65536 ? -65536 : -256);
									local253 += 15;
									local582 = 0;
									local584 = 0;
									@Pc(586) int local586 = 0;
									for (@Pc(588) int local588 = 0; local588 < 30; local588++) {
										local582 += Static216.aClass193_Sub1Array2[local588].method4437();
										local584 += Static216.aClass193_Sub1Array2[local588].method4430();
										local586 += Static216.aClass193_Sub1Array2[local588].method4429();
									}
									@Pc(626) int local626 = local586 * 100 / local582;
									@Pc(632) int local632 = local584 * 10000 / local582;
									@Pc(652) String local652 = "Cache:" + Static298.method4125(0, 2, true, (long) local632) + "% (" + local626 + "%)";
									Static162.aClass105_6.method5605(local253, local248, local652, -256);
									local253 += 12;
								}
								if (Static375.anInt5262 > 0) {
									Static162.aClass105_6.method5605(local253, local248, "Particles: " + Static415.anInt7048 + " / " + Static375.anInt5262, -256);
								}
								local253 += 12;
								if (Static149.aBoolean206) {
									Static162.aClass105_6.method5605(local253, local248, "Polys: " + Static16.aClass30_11.xa() + " Models: " + Static16.aClass30_11.g(), -256);
									local253 += 12;
									Static162.aClass105_6.method5605(local253, local248, "Ls: " + Static22.anInt6852 + " La: " + Static169.anInt3170 + " NPC: " + Static67.anInt1669 + " Pl: " + Static408.anInt6971, -256);
									local253 += 12;
									Static447.method5738();
								}
								Static26.aBooleanArray2[local41] = true;
								continue;
							}
						}
						if (local19.anInt3426 == 0) {
							if (local19.anInt3434 == Static409.anInt6981 && Static16.aClass30_11.method4666()) {
								Static16.aClass30_11.method4640(local87, local92, local19.anInt3421, local19.anInt3442);
							}
							method3220(local234, local92 - local19.anInt3444, local148, local19.anInt3397, local152, arg5, local41, local236, local87 - local19.anInt3458);
							if (local19.aClass126Array3 != null) {
								method3220(local234, local92 - local19.anInt3444, local148, local19.anInt3397, local152, local19.aClass126Array3, local41, local236, local87 - local19.anInt3458);
							}
							@Pc(817) Class4_Sub4 local817 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local19.anInt3397);
							if (local817 != null) {
								Static231.method3201(local234, local87, local236, local148, local41, local817.anInt573, local92, local152);
							}
							if (Static409.anInt6981 == local19.anInt3434 && Static16.aClass30_11.method4666()) {
								Static16.aClass30_11.method4693();
								Static231.aBoolean315 = true;
							}
							Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
						}
						if (Static86.aBooleanArray24[local41] || Static31.anInt724 > 1) {
							if (local19.anInt3426 == 3) {
								if (local95 == 0) {
									if (local19.aBoolean249) {
										Static16.aClass30_11.NA(local87, local92, local19.anInt3421, local19.anInt3442, local19.anInt3459, 0);
									} else {
										Static16.aClass30_11.method4645(local87, local92, local19.anInt3421, local19.anInt3442, local19.anInt3459, 0);
									}
								} else if (local19.aBoolean249) {
									Static16.aClass30_11.NA(local87, local92, local19.anInt3421, local19.anInt3442, 255 - (local95 & 0xFF) << 24 | local19.anInt3459 & 0xFFFFFF, 1);
								} else {
									Static16.aClass30_11.method4645(local87, local92, local19.anInt3421, local19.anInt3442, 255 - (local95 & 0xFF) << 24 | local19.anInt3459 & 0xFFFFFF, 1);
								}
							} else if (local19.anInt3426 == 4) {
								@Pc(954) Class105 local954 = local19.method2674(Static16.aClass30_11);
								if (local954 != null) {
									local253 = local19.anInt3459;
									@Pc(969) String local969 = local19.aString42;
									if (local19.anInt3395 != -1) {
										@Pc(979) Class127 local979 = Static390.aClass204_2.method4629(local19.anInt3395);
										local969 = local979.aString43;
										if (local969 == null) {
											local969 = "null";
										}
										if ((local979.anInt3573 == 1 || local19.anInt3383 != 1) && local19.anInt3383 != -1) {
											local969 = "<col=ff9040>" + local969 + "</col> x" + Static210.method2994(local19.anInt3383);
										}
									}
									if (local19 == Static454.aClass126_17) {
										local969 = Static50.aClass242_13.method5320(Static139.anInt2670);
										local253 = local19.anInt3459;
									}
									if (Static187.aBoolean268) {
										Static16.aClass30_11.Z(local87, local92, local19.anInt3421 + local87, local19.anInt3442 + local92);
									}
									local954.method5609(local253 | 255 - (local95 & 0xFF) << 24, 0, null, Static352.aClass3Array13, local19.anInt3421, null, local19.anInt3442, local19.anInt3407, local19.anInt3404, local19.aBoolean256 ? 255 - (local95 & 0xFF) << 24 : -1, local87, local19.anInt3424, local19.anInt3462, local92, local969, 0);
									if (Static187.aBoolean268) {
										Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
									}
								} else if (Static23.aBoolean28) {
									Static430.method5524(local19);
								}
							} else {
								@Pc(1157) int local1157;
								if (local19.anInt3426 == 5) {
									if (local19.anInt3464 < 0) {
										@Pc(1135) Class3 local1135;
										if (local19.anInt3395 == -1) {
											local1135 = local19.method2678(Static16.aClass30_11);
										} else {
											@Pc(1117) Class188 local1117 = local19.aBoolean251 ? Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1 : null;
											local1135 = Static390.aClass204_2.method4627(local1117, Static16.aClass30_11, local19.anInt3395, local19.anInt3383, local19.anInt3446 | 0xFF000000, local19.anInt3454, local19.anInt3472);
										}
										if (local1135 != null) {
											local253 = local1135.ja();
											local1157 = local1135.JA();
											local506 = (local19.anInt3459 == 0 ? 16777215 : local19.anInt3459 & 0xFFFFFF) | 255 - (local95 & 0xFF) << 24;
											if (local19.aBoolean254) {
												Static16.aClass30_11.Z(local87, local92, local19.anInt3421 + local87, local92 - -local19.anInt3442);
												if (local19.anInt3423 != 0) {
													local508 = (local253 + local19.anInt3421 - 1) / local253;
													local556 = (local19.anInt3442 + local1157 - 1) / local1157;
													for (local582 = 0; local582 < local508; local582++) {
														for (local584 = 0; local584 < local556; local584++) {
															if (local19.anInt3459 == 0) {
																local1135.method5879((float) (local87 + local582 * local253) + (float) local253 / 2.0F, (float) local1157 / 2.0F + (float) (local92 + local584 * local1157), 4096, local19.anInt3423);
															} else {
																local1135.method5882((float) local253 / 2.0F + (float) (local582 * local253 + local87), (float) local1157 / 2.0F + (float) (local92 - -(local584 * local1157)), 4096, local19.anInt3423, local506);
															}
														}
													}
												} else if (local19.anInt3459 == 0 && local95 == 0) {
													local1135.method5881(local87, local92, local19.anInt3421, local19.anInt3442);
												} else {
													local1135.D(local87, local92, local19.anInt3421, local19.anInt3442, 0, local506, 1);
												}
												Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
											} else if (local19.anInt3459 == 0 && local95 == 0) {
												if (local19.anInt3423 != 0) {
													local1135.method5879((float) local87 + (float) local19.anInt3421 / 2.0F, (float) local92 + (float) local19.anInt3442 / 2.0F, local19.anInt3421 * 4096 / local253, local19.anInt3423);
												} else if (local253 == local19.anInt3421 && local1157 == local19.anInt3442) {
													local1135.method5877(local87, local92);
												} else {
													local1135.method5885(local87, local92, local19.anInt3421, local19.anInt3442);
												}
											} else if (local19.anInt3423 != 0) {
												local1135.method5882((float) local87 + (float) local19.anInt3421 / 2.0F, (float) local19.anInt3442 / 2.0F + (float) local92, local19.anInt3421 * 4096 / local253, local19.anInt3423, local506);
											} else if (local253 == local19.anInt3421 && local19.anInt3442 == local1157) {
												local1135.YA(local87, local92, 0, local506, 1);
											} else {
												local1135.M(local87, local92, local19.anInt3421, local19.anInt3442, 0, local506, 1);
											}
										} else if (Static23.aBoolean28) {
											Static430.method5524(local19);
										}
									} else {
										local19.method2679(Static447.aClass78_1, Static316.aClass88_4).method2797(local19.anInt3470 << 3, local19.anInt3421, local19.anInt3448 << 3, 0, local92, Static16.aClass30_11, local19.anInt3442, 0, local87);
									}
								} else if (local19.anInt3426 == 6) {
									Static326.method2434();
									@Pc(1521) Class7 local1521 = null;
									local253 = 0;
									@Pc(1629) Class233 local1629;
									@Pc(1639) Class188 local1639;
									if (local19.anInt3395 != -1) {
										@Pc(1737) Class127 local1737 = Static390.aClass204_2.method4629(local19.anInt3395);
										if (local1737 != null) {
											local1737 = local1737.method2734(local19.anInt3383);
											local1629 = local19.anInt3468 == -1 ? null : Static269.aClass10_1.method286(local19.anInt3468);
											local1639 = local19.aBoolean251 ? Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1 : null;
											local1521 = local1737.method2738(2048, local1639, 1, Static16.aClass30_11, local1629, local19.anInt3384, local19.anInt3455, local19.anInt3414);
											if (local1521 == null) {
												Static430.method5524(local19);
											} else {
												local253 = -local1521.b() >> 1;
											}
										}
									} else if (local19.anInt3439 == 5) {
										local1157 = local19.anInt3428;
										if (local1157 >= 0 && local1157 < 2048) {
											@Pc(1548) Class6_Sub2_Sub1_Sub1 local1548 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local1157];
											@Pc(1561) Class233 local1561 = local19.anInt3468 == -1 ? null : Static269.aClass10_1.method286(local19.anInt3468);
											if (local1548 != null && (Static373.anInt6574 == local1157 || Static189.method2799(local1548.aString11) == local19.anInt3401)) {
												local1521 = local1548.aClass188_1.method4321(0, Static8.aClass226_1, Static155.aClass149_1, 0, local19.anInt3384, Static116.aClass50_1, 2048, Static16.aClass30_11, local19.anInt3414, -1, Static390.aClass204_2, null, null, Static388.aClass211_1, Static269.aClass10_1, local1561, local19.anInt3455);
											}
										}
									} else if (local19.anInt3439 == 8 || local19.anInt3439 == 9) {
										@Pc(1616) Class4_Sub39 local1616 = Static195.method2229(local19.anInt3428, false);
										local1629 = local19.anInt3468 == -1 ? null : Static269.aClass10_1.method286(local19.anInt3468);
										if (local1616 != null) {
											local1639 = local19.aBoolean251 ? Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1 : null;
											local1521 = local1616.method5241(local1629, local19.anInt3439 == 9, local1639, Static16.aClass30_11, local19.anInt3401, local19.anInt3455, local19.anInt3414, local19.anInt3384);
										}
									} else if (local19.anInt3468 == -1) {
										local1521 = local19.method2680(0, null, 2048, Static269.aClass10_1, -1, Static390.aClass204_2, Static16.aClass30_11, Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1, Static155.aClass149_1, Static388.aClass211_1, Static116.aClass50_1, Static8.aClass226_1, -1);
										if (local1521 == null && Static23.aBoolean28) {
											Static430.method5524(local19);
										}
									} else {
										@Pc(1702) Class233 local1702 = Static269.aClass10_1.method286(local19.anInt3468);
										local1521 = local19.method2680(local19.anInt3384, local1702, 2048, Static269.aClass10_1, local19.anInt3455, Static390.aClass204_2, Static16.aClass30_11, Static375.aClass6_Sub2_Sub1_Sub1_3.aClass188_1, Static155.aClass149_1, Static388.aClass211_1, Static116.aClass50_1, Static8.aClass226_1, local19.anInt3414);
										if (local1521 == null && Static23.aBoolean28) {
											Static430.method5524(local19);
										}
									}
									if (local1521 != null) {
										if (local19.anInt3396 > 0) {
											local1157 = (local19.anInt3421 << 9) / local19.anInt3396;
										} else {
											local1157 = 512;
										}
										if (local19.anInt3381 > 0) {
											local506 = (local19.anInt3442 << 9) / local19.anInt3381;
										} else {
											local506 = 512;
										}
										local508 = (local19.anInt3431 * local1157 >> 9) + local19.anInt3421 / 2 + local87;
										local556 = (local19.anInt3387 * local506 >> 9) + (local92 + (local19.anInt3442 / 2));
										Static248.aClass116_3.HA();
										Static16.aClass30_11.m(Static248.aClass116_3);
										Static16.aClass30_11.GA(local508, local556, local1157, local506);
										Static16.aClass30_11.o((float) (local19.anInt3463 << 0), local19.aBoolean258 ? (float) (local19.anInt3427 << 0) : (float) (local19.anInt3427 << 0) * 1.5F);
										if (arg3 == -1412584499 || Static231.aBoolean315) {
											Static16.aClass30_11.va();
											Static16.aClass30_11.method4700();
											Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
											Static231.aBoolean315 = false;
										}
										if (local19.aBoolean259) {
											Static16.aClass30_11.method4663(false);
										}
										local582 = Class56.anIntArray119[local19.anInt3393 << 3] * (local19.anInt3460 << 0) >> 15;
										local584 = Class56.anIntArray120[local19.anInt3393 << 3] * (local19.anInt3460 << 0) >> 15;
										Static374.aClass116_4.ma(-local19.anInt3420 << 3);
										Static374.aClass116_4.c(local19.anInt3408 << 3);
										Static374.aClass116_4.ZA(local19.anInt3403 << 0, local253 + local582 + (local19.anInt3416 << 0), (local19.anInt3416 << 0) + local584);
										Static374.aClass116_4.na(local19.anInt3393 << 3);
										if (Static187.aBoolean268) {
											Static16.aClass30_11.Z(local87, local92, local19.anInt3421 + local87, local19.anInt3442 + local92);
										}
										if (local19.aBoolean258) {
											local1521.method4086(Static374.aClass116_4, null, local19.anInt3460 << 0);
										} else {
											local1521.method4091(Static374.aClass116_4, null, 1);
										}
										if (Static187.aBoolean268) {
											Static16.aClass30_11.pa(arg2, arg4, arg0, arg7);
										}
										if (local19.aBoolean259) {
											Static16.aClass30_11.method4663(true);
										}
										Static16.aClass30_11.o(0.0F, 0.0F);
									}
								} else if (local19.anInt3426 == 9) {
									if (local19.aBoolean255) {
										local253 = local92 + local19.anInt3442;
										local506 = local92;
										local1157 = local19.anInt3421 + local87;
									} else {
										local506 = local92 + local19.anInt3442;
										local1157 = local19.anInt3421 + local87;
										local253 = local92;
									}
									if (local19.anInt3400 == 1) {
										Static16.aClass30_11.method4689(local87, local253, local1157, local506, local19.anInt3459, 0);
									} else {
										Static16.aClass30_11.method4636(local87, local253, local1157, local506, local19.anInt3459, local19.anInt3400);
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
