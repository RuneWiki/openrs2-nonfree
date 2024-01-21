import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static51 {

	@OriginalMember(owner = "client!ga", name = "ub", descriptor = "Lclient!f;")
	public static Class13 aClass13_10;

	@OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
	public static int anInt1201 = 127;

	@OriginalMember(owner = "client!ga", name = "M", descriptor = "Lclient!sd;")
	public static Class73 aClass73_678 = Static122.method531("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ga", name = "Mb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_683 = Static122.method531("Existing User");

	@OriginalMember(owner = "client!ga", name = "P", descriptor = "Lclient!sd;")
	public static Class73 aClass73_679 = aClass73_683;

	@OriginalMember(owner = "client!ga", name = "mb", descriptor = "Lclient!sd;")
	private static Class73 aClass73_681 = Static122.method531("Too many connections from your address)3");

	@OriginalMember(owner = "client!ga", name = "yb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_682 = Static122.method531("lila:");

	@OriginalMember(owner = "client!ga", name = "zb", descriptor = "I")
	public static int anInt1228 = 0;

	@OriginalMember(owner = "client!ga", name = "Ob", descriptor = "Lclient!sd;")
	public static Class73 aClass73_684 = Static122.method531("null");

	@OriginalMember(owner = "client!ga", name = "Sb", descriptor = "I")
	public static int anInt1243 = 0;

	@OriginalMember(owner = "client!ga", name = "Zb", descriptor = "Lclient!sd;")
	public static Class73 aClass73_685 = aClass73_681;

	@OriginalMember(owner = "client!ga", name = "i", descriptor = "(I)V")
	public static void method937() {
		aClass73_683 = null;
		aClass73_684 = null;
		aClass73_681 = null;
		aClass73_678 = null;
		aClass13_10 = null;
		aClass73_682 = null;
		aClass73_679 = null;
		aClass73_685 = null;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III[Lclient!vd;BIIIII)V")
	public static void method938(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class83[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static15.method2296(arg4, arg0, arg8, arg7);
		Static36.method662();
		for (@Pc(13) int local13 = 0; local13 < arg3.length; local13++) {
			@Pc(19) Class83 local19 = arg3[local13];
			if (local19 != null && (local19.anInt3702 == arg5 || arg5 == -1412584499 && local19 == Static16.aClass83_5)) {
				@Pc(41) int local41;
				if (arg1 == -1) {
					Static72.anIntArray176[Static81.anInt1818] = arg6 + local19.anInt3667;
					Static163.anIntArray325[Static81.anInt1818] = local19.anInt3707 + arg2;
					Static19.anIntArray47[Static81.anInt1818] = local19.anInt3670;
					Static34.anIntArray78[Static81.anInt1818] = local19.anInt3708;
					local41 = Static81.anInt1818++;
				} else {
					local41 = arg1;
				}
				local19.anInt3736 = local41;
				local19.anInt3733 = Static44.anInt1024;
				if (!local19.aBoolean257 || !Static11.method184(local19)) {
					if (local19.anInt3735 > 0) {
						Static141.method2358(local19);
					}
					@Pc(101) int local101 = local19.anInt3707 + arg2;
					@Pc(104) int local104 = local19.anInt3718;
					@Pc(109) int local109 = arg6 + local19.anInt3667;
					@Pc(143) int local143;
					@Pc(137) int local137;
					if (Static16.aClass83_5 == local19) {
						if (arg5 != -1412584499 && !local19.aBoolean256) {
							Static158.anInt3479 = arg6;
							Static61.aClass83Array1 = arg3;
							Static13.anInt312 = arg2;
							continue;
						}
						if (!local19.aBoolean256) {
							local104 = 128;
						}
						if (Static173.aBoolean262 && Static85.aBoolean128) {
							local137 = Static5.anInt107;
							local137 -= Static37.anInt898;
							local143 = Static37.anInt899;
							if (local137 < Static22.anInt590) {
								local137 = Static22.anInt590;
							}
							local143 -= Static32.anInt821;
							if (Static22.anInt590 + Static58.aClass83_8.anInt3708 < local137 - -local19.anInt3708) {
								local137 = Static58.aClass83_8.anInt3708 + Static22.anInt590 - local19.anInt3708;
							}
							local101 = local137;
							if (local143 < Static111.anInt2709) {
								local143 = Static111.anInt2709;
							}
							if (local19.anInt3670 + local143 > Static58.aClass83_8.anInt3670 + Static111.anInt2709) {
								local143 = Static58.aClass83_8.anInt3670 + Static111.anInt2709 - local19.anInt3670;
							}
							local109 = local143;
						}
					}
					@Pc(295) int local295;
					@Pc(277) int local277;
					@Pc(218) int local218;
					@Pc(220) int local220;
					@Pc(231) int local231;
					@Pc(226) int local226;
					if (local19.anInt3722 == 2) {
						local143 = arg4;
						local137 = arg0;
						local295 = arg8;
						local277 = arg7;
					} else if (local19.anInt3722 == 9) {
						local218 = local109;
						local220 = local101;
						local226 = local101 + local19.anInt3708;
						local231 = local109 + local19.anInt3670;
						if (local231 < local109) {
							local218 = local231;
							local231 = local109;
						}
						if (local226 < local101) {
							local220 = local226;
							local226 = local101;
						}
						local231++;
						local226++;
						local137 = arg0 < local220 ? local220 : arg0;
						local277 = arg7 <= local226 ? arg7 : local226;
						local143 = local218 <= arg4 ? arg4 : local218;
						local295 = arg8 > local231 ? local231 : arg8;
					} else {
						local137 = local101 <= arg0 ? arg0 : local101;
						local218 = local109 + local19.anInt3670;
						local143 = arg4 >= local109 ? arg4 : local109;
						local295 = arg8 > local218 ? local218 : arg8;
						local220 = local101 + local19.anInt3708;
						local277 = arg7 > local220 ? local220 : arg7;
					}
					if (!local19.aBoolean257 || local295 > local143 && local137 < local277) {
						if (local19.anInt3735 != 0) {
							if (local19.anInt3735 == 1337) {
								Static131.anInt2984 = local101;
								Static58.anInt1371 = local109;
								Static143.method2381(local109, local101, local19.anInt3670, local19.anInt3708);
								Static15.method2296(arg4, arg0, arg8, arg7);
								continue;
							}
							if (local19.anInt3735 == 1338) {
								Static87.method1532(local101, local41, local109);
								Static15.method2296(arg4, arg0, arg8, arg7);
								continue;
							}
						}
						local218 = Static37.anInt899;
						local220 = Static5.anInt107;
						if (!Static169.aBoolean245 && local143 <= local218 && local137 <= local220 && local218 < local295 && local220 < local277) {
							Static115.method2039(local19, local220 - local101, -local109 + local218);
						}
						if (local19.anInt3722 == 0) {
							if (!local19.aBoolean257 && Static11.method184(local19) && Static142.aClass83_14 != local19) {
								continue;
							}
							if (!local19.aBoolean257) {
								if (local19.anInt3691 - local19.anInt3708 < local19.anInt3689) {
									local19.anInt3689 = local19.anInt3691 - local19.anInt3708;
								}
								if (local19.anInt3689 < 0) {
									local19.anInt3689 = 0;
								}
							}
							method938(local137, local41, local101 - local19.anInt3689, arg3, local143, local19.anInt3676, local109 - local19.anInt3728, local277, local295);
							if (local19.aClass83Array2 != null) {
								method938(local137, local41, local101 - local19.anInt3689, local19.aClass83Array2, local143, local19.anInt3676, local109 - local19.anInt3728, local277, local295);
							}
							@Pc(544) Class3_Sub13 local544 = (Class3_Sub13) Static91.aClass16_9.method554((long) local19.anInt3676);
							if (local544 != null) {
								if (local544.anInt1132 == 0 && local143 <= Static37.anInt899 && local137 <= Static5.anInt107 && local295 > Static37.anInt899 && Static5.anInt107 < local277 && !Static169.aBoolean245 && !Static8.aBoolean16) {
									Static176.anIntArray419[0] = 1003;
									Static11.aClass73Array3[0] = Static28.aClass73_430;
									Static142.anInt3262 = 1;
									Static162.aClass73Array24[0] = Static173.aClass73_2030;
								}
								Static4.method50(local295, local544.anInt1133, local277, local101, local109, local41, local137, local143);
							}
							Static15.method2296(arg4, arg0, arg8, arg7);
							Static36.method662();
						}
						if (Static139.aBooleanArray9[local41] || Static20.anInt540 > 1) {
							if (local19.anInt3722 == 0 && !local19.aBoolean257 && local19.anInt3708 < local19.anInt3691) {
								Static126.method2145(local19.anInt3691, local19.anInt3670 + local109, local19.anInt3708, local101, local19.anInt3689);
							}
							if (local19.anInt3722 != 1) {
								@Pc(655) int local655;
								@Pc(666) int local666;
								@Pc(818) int local818;
								@Pc(711) int local711;
								@Pc(867) int local867;
								@Pc(869) int local869;
								@Pc(899) int local899;
								@Pc(675) int local675;
								@Pc(833) int local833;
								if (local19.anInt3722 == 2) {
									local231 = 0;
									for (local226 = 0; local226 < local19.anInt3708; local226++) {
										for (local655 = 0; local655 < local19.anInt3670; local655++) {
											local666 = local109 + local655 * (local19.anInt3700 + 32);
											local675 = (local19.anInt3714 + 32) * local226 + local101;
											if (local231 < 20) {
												local675 += local19.anIntArray393[local231];
												local666 += local19.anIntArray391[local231];
											}
											if (local19.anIntArray388[local231] > 0) {
												local711 = local19.anIntArray388[local231] - 1;
												if (local666 + 32 > arg4 && arg8 > local666 && arg0 < local675 + 32 && arg7 > local675 || local19 == Static139.aClass83_11 && Static79.anInt1737 == local231) {
													@Pc(766) Class3_Sub1_Sub3_Sub4 local766;
													if (Static4.anInt71 == 1 && local231 == Static148.anInt3335 && Static92.anInt2038 == local19.anInt3676) {
														local766 = Static5.method68(0, local711, 2, false, local19.anIntArray389[local231]);
													} else {
														local766 = Static5.method68(3153952, local711, 1, false, local19.anIntArray389[local231]);
													}
													if (local766 == null) {
														Static60.method1104(local19);
													} else if (local19 == Static139.aClass83_11 && local231 == Static79.anInt1737) {
														local818 = Static5.anInt107 - Static33.anInt825;
														if (local818 < 5 && local818 > -5) {
															local818 = 0;
														}
														local833 = Static37.anInt899 - Static31.anInt817;
														if (local833 < 5 && local833 > -5) {
															local833 = 0;
														}
														if (Static121.anInt2850 < 5) {
															local833 = 0;
															local818 = 0;
														}
														local766.method2337(local833 + local666, local818 + local675, 128);
														if (arg5 != -1) {
															local867 = Static15.anInt3220;
															local869 = Static15.anInt3217;
															@Pc(875) Class83 local875 = arg3[arg5 & 0xFFFF];
															if (local867 > local675 + local818 && local875.anInt3689 > 0) {
																local899 = (local867 - local675 - local818) * Static165.anInt320 / 3;
																if (Static165.anInt320 * 10 < local899) {
																	local899 = Static165.anInt320 * 10;
																}
																if (local875.anInt3689 < local899) {
																	local899 = local875.anInt3689;
																}
																local875.anInt3689 -= local899;
																Static33.anInt825 += local899;
																Static60.method1104(local875);
															}
															if (local675 + local818 + 32 > local869 && local875.anInt3691 - local875.anInt3708 > local875.anInt3689) {
																local899 = Static165.anInt320 * (local818 + local675 + 32 - local869) / 3;
																if (Static165.anInt320 * 10 < local899) {
																	local899 = Static165.anInt320 * 10;
																}
																if (local899 > local875.anInt3691 - local875.anInt3689 - local875.anInt3708) {
																	local899 = local875.anInt3691 - local875.anInt3689 - local875.anInt3708;
																}
																Static33.anInt825 -= local899;
																local875.anInt3689 += local899;
																Static60.method1104(local875);
															}
														}
													} else if (Static20.aClass83_6 == local19 && Static171.anInt3772 == local231) {
														local766.method2337(local666, local675, 128);
													} else {
														local766.method2321(local666, local675);
													}
												}
											} else if (local19.anIntArray387 != null && local231 < 20) {
												@Pc(1027) Class3_Sub1_Sub3_Sub4 local1027 = local19.method2648(local231);
												if (local1027 != null) {
													local1027.method2321(local666, local675);
												} else if (Static157.aBoolean231) {
													Static60.method1104(local19);
												}
											}
											local231++;
										}
									}
								} else if (local19.anInt3722 == 3) {
									if (Static150.method2584(local19)) {
										local231 = local19.anInt3716;
										if (Static142.aClass83_14 == local19 && local19.anInt3690 != 0) {
											local231 = local19.anInt3690;
										}
									} else {
										local231 = local19.anInt3712;
										if (local19 == Static142.aClass83_14 && local19.anInt3719 != 0) {
											local231 = local19.anInt3719;
										}
									}
									if (local104 == 0) {
										if (local19.aBoolean248) {
											Static15.method2297(local109, local101, local19.anInt3670, local19.anInt3708, local231);
										} else {
											Static15.method2303(local109, local101, local19.anInt3670, local19.anInt3708, local231);
										}
									} else if (local19.aBoolean248) {
										Static15.method2302(local109, local101, local19.anInt3670, local19.anInt3708, local231, 256 - (local104 & 0xFF));
									} else {
										Static15.method2300(local109, local101, local19.anInt3670, local19.anInt3708, local231, 256 - (local104 & 0xFF));
									}
								} else {
									@Pc(1173) Class3_Sub1_Sub3_Sub1_Sub1 local1173;
									if (local19.anInt3722 == 4) {
										local1173 = local19.method2650();
										if (local1173 != null) {
											@Pc(1185) Class73 local1185 = local19.aClass73_1986;
											if (Static150.method2584(local19)) {
												local226 = local19.anInt3716;
												if (Static142.aClass83_14 == local19 && local19.anInt3690 != 0) {
													local226 = local19.anInt3690;
												}
												if (local19.aClass73_1989.method2435() > 0) {
													local1185 = local19.aClass73_1989;
												}
											} else {
												local226 = local19.anInt3712;
												if (local19 == Static142.aClass83_14 && local19.anInt3719 != 0) {
													local226 = local19.anInt3719;
												}
											}
											if (local19.aBoolean257 && local19.anInt3682 != -1) {
												@Pc(1241) Class3_Sub1_Sub7 local1241 = Static3.method42(local19.anInt3682);
												local1185 = local1241.aClass73_680;
												if (local1185 == null) {
													local1185 = Static39.aClass73_542;
												}
												if ((local1241.anInt1216 == 1 || local19.anInt3732 != 1) && local19.anInt3732 != -1) {
													local1185 = Static19.method372(new Class73[] { Static32.aClass73_480, local1185, Static163.aClass73_1745, Static107.method1921(local19.anInt3732) });
												}
											}
											if (Static11.aClass83_3 == local19) {
												local1185 = Static160.aClass73_1898;
												local226 = local19.anInt3712;
											}
											if (!local19.aBoolean257) {
												local1185 = Static135.method2235(local19, local1185);
											}
											local1173.method1070(local1185, local109, local101, local19.anInt3670, local19.anInt3708, local226, local19.aBoolean251 ? 0 : -1, local19.anInt3681, local19.anInt3723, local19.anInt3742);
										} else if (Static157.aBoolean231) {
											Static60.method1104(local19);
										}
									} else if (local19.anInt3722 == 5) {
										@Pc(1352) Class3_Sub1_Sub3_Sub4 local1352;
										if (local19.aBoolean257) {
											if (local19.anInt3682 == -1) {
												local1352 = local19.method2654(false);
											} else {
												local1352 = Static5.method68(local19.anInt3699, local19.anInt3682, local19.anInt3709, false, local19.anInt3732);
											}
											if (local1352 != null) {
												local226 = local1352.anInt3224;
												local655 = local1352.anInt3222;
												if (local19.aBoolean254) {
													Static15.method2301(local109, local101, local109 + local19.anInt3670, local101 - -local19.anInt3708);
													local675 = (local655 + local19.anInt3708 - 1) / local655;
													local666 = (local19.anInt3670 + local226 - 1) / local226;
													for (local833 = 0; local833 < local666; local833++) {
														for (local818 = 0; local818 < local675; local818++) {
															if (local19.anInt3715 != 0) {
																local1352.method2318(local109 + local226 * local833 + local226 / 2, local655 / 2 + (local101 - -(local655 * local818)), local19.anInt3715, 4096);
															} else if (local104 == 0) {
																local1352.method2321(local226 * local833 + local109, local818 * local655 + local101);
															} else {
																local1352.method2337(local109 + local226 * local833, local101 - -(local818 * local655), 256 - (local104 & 0xFF));
															}
														}
													}
													Static15.method2296(arg4, arg0, arg8, arg7);
												} else {
													local666 = local19.anInt3670 * 4096 / local226;
													if (local19.anInt3715 != 0) {
														local1352.method2318(local109 + local19.anInt3670 / 2, local19.anInt3708 / 2 + local101, local19.anInt3715, local666);
													} else if (local104 != 0) {
														local1352.method2322(local109, local101, local19.anInt3670, local19.anInt3708, 256 - (local104 & 0xFF));
													} else if (local226 == local19.anInt3670 && local19.anInt3708 == local655) {
														local1352.method2321(local109, local101);
													} else {
														local1352.method2338(local109, local101, local19.anInt3670, local19.anInt3708);
													}
												}
											} else if (Static157.aBoolean231) {
												Static60.method1104(local19);
											}
										} else {
											local1352 = local19.method2654(Static150.method2584(local19));
											if (local1352 != null) {
												local1352.method2321(local109, local101);
											} else if (Static157.aBoolean231) {
												Static60.method1104(local19);
											}
										}
									} else {
										@Pc(1747) Class3_Sub1_Sub7 local1747;
										if (local19.anInt3722 == 6) {
											@Pc(1611) boolean local1611 = Static150.method2584(local19);
											@Pc(1613) Class3_Sub1_Sub4_Sub5 local1613 = null;
											if (local1611) {
												local226 = local19.anInt3724;
											} else {
												local226 = local19.anInt3725;
											}
											local666 = 0;
											if (local19.anInt3682 != -1) {
												local1747 = Static3.method42(local19.anInt3682);
												if (local1747 != null) {
													local1747 = local1747.method934(local19.anInt3732);
													local1613 = local1747.method947(null, 1, 0);
													if (local1613 == null) {
														Static60.method1104(local19);
													} else {
														local1613.method1880();
														local666 = -local1613.aShort32 / 2;
													}
												}
											} else if (local19.anInt3734 == 5) {
												if (local19.anInt3678 == -1) {
													local1613 = Static30.aClass52_1.method1699(-1, null, null, -1);
												} else {
													local675 = local19.anInt3678 & 0x7FF;
													if (local675 == Static61.anInt1455) {
														local675 = 2047;
													}
													@Pc(1698) Class3_Sub1_Sub4_Sub7_Sub1 local1698 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local675];
													@Pc(1708) Class3_Sub1_Sub8 local1708 = local226 == -1 ? null : Static98.method1697(local226);
													if (local1698 != null && (int) local1698.aClass73_1521.method2425() << 11 == (local19.anInt3678 & 0xFFFFF800)) {
														local1613 = local1698.aClass52_2.method1699(local19.anInt3693, local1708, null, 0);
													}
												}
											} else if (local226 == -1) {
												local1613 = local19.method2656(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass52_2, -1, local1611, null);
												if (local1613 == null && Static157.aBoolean231) {
													Static60.method1104(local19);
												}
											} else {
												@Pc(1640) Class3_Sub1_Sub8 local1640 = Static98.method1697(local226);
												local1613 = local19.method2656(Static37.aClass3_Sub1_Sub4_Sub7_Sub1_1.aClass52_2, local19.anInt3693, local1611, local1640);
												if (local1613 == null && Static157.aBoolean231) {
													Static60.method1104(local19);
												}
											}
											if (local1613 != null) {
												Static36.method652(local19.anInt3683 + local109 + local19.anInt3670 / 2, local19.anInt3692 + local101 + local19.anInt3708 / 2);
												local675 = local19.anInt3741 * Class3_Sub1_Sub3_Sub2.anIntArray87[local19.anInt3672] >> 16;
												local833 = Class3_Sub1_Sub3_Sub2.anIntArray88[local19.anInt3672] * local19.anInt3741 >> 16;
												if (!local19.aBoolean257) {
													local1613.method1881(local19.anInt3704, 0, local19.anInt3672, 0, local675, local833);
												} else if (local19.aBoolean255) {
													local1613.method1878(local19.anInt3704, local19.anInt3679, local19.anInt3672, local19.anInt3695, local675 + local666 + local19.anInt3686, local19.anInt3686 + local833, local19.anInt3741);
												} else {
													local1613.method1881(local19.anInt3704, local19.anInt3679, local19.anInt3672, local19.anInt3695, local19.anInt3686 + local666 + local675, local19.anInt3686 + local833);
												}
												Static36.method659();
											}
										} else {
											if (local19.anInt3722 == 7) {
												local1173 = local19.method2650();
												if (local1173 == null) {
													if (Static157.aBoolean231) {
														Static60.method1104(local19);
													}
													continue;
												}
												local226 = 0;
												for (local655 = 0; local655 < local19.anInt3708; local655++) {
													for (local666 = 0; local666 < local19.anInt3670; local666++) {
														if (local19.anIntArray388[local226] > 0) {
															local1747 = Static3.method42(local19.anIntArray388[local226] - 1);
															@Pc(1969) Class73 local1969;
															if (local1747.anInt1216 != 1 && local19.anIntArray389[local226] == 1) {
																local1969 = Static19.method372(new Class73[] { Static32.aClass73_480, local1747.aClass73_680, Static93.aClass73_1182 });
															} else {
																local1969 = Static19.method372(new Class73[] { Static32.aClass73_480, local1747.aClass73_680, Static163.aClass73_1745, Static107.method1921(local19.anIntArray389[local226]) });
															}
															local818 = local109 + (local19.anInt3700 + 115) * local666;
															local711 = local655 * (local19.anInt3714 + 12) + local101;
															if (local19.anInt3681 == 0) {
																local1173.method1069(local1969, local818, local711, local19.anInt3712, local19.aBoolean251 ? 0 : -1);
															} else if (local19.anInt3681 == 1) {
																local1173.method1072(local1969, local818 + local19.anInt3670 / 2, local711, local19.anInt3712, local19.aBoolean251 ? 0 : -1);
															} else {
																local1173.method1073(local1969, local19.anInt3670 + local818 - 1, local711, local19.anInt3712, local19.aBoolean251 ? 0 : -1);
															}
														}
														local226++;
													}
												}
											}
											@Pc(2255) int local2255;
											if (local19.anInt3722 == 8 && Static3.aClass83_1 == local19 && Static144.anInt3457 == Static115.anInt2754) {
												local231 = 0;
												local226 = 0;
												@Pc(2108) Class3_Sub1_Sub3_Sub1_Sub1 local2108 = Static82.aClass3_Sub1_Sub3_Sub1_Sub1_1;
												@Pc(2111) Class73 local2111 = local19.aClass73_1986;
												local2111 = Static135.method2235(local19, local2111);
												@Pc(2129) Class73 local2129;
												while (local2111.method2435() > 0) {
													local833 = local2111.method2429(Static38.aClass73_1742);
													if (local833 == -1) {
														local2129 = local2111;
														local2111 = Static173.aClass73_2030;
													} else {
														local2129 = local2111.method2413(local833, 0);
														local2111 = local2111.method2447(local833 + 4);
													}
													local818 = local2108.method1062(local2129);
													if (local818 > local231) {
														local231 = local818;
													}
													local226 += local2108.anInt1397 + 1;
												}
												local226 += 7;
												local818 = local101 + local19.anInt3708 + 5;
												local231 += 6;
												local833 = local19.anInt3670 + local109 - local231 - 5;
												if (local833 < local109 + 5) {
													local833 = local109 + 5;
												}
												if (local226 + local818 > arg7) {
													local818 = arg7 - local226;
												}
												if (local231 + local833 > arg8) {
													local833 = arg8 - local231;
												}
												Static15.method2297(local833, local818, local231, local226, 16777120);
												Static15.method2303(local833, local818, local231, local226, 0);
												local711 = local2108.anInt1397 + local818 + 2;
												local2111 = local19.aClass73_1986;
												local2111 = Static135.method2235(local19, local2111);
												while (local2111.method2435() > 0) {
													local2255 = local2111.method2429(Static38.aClass73_1742);
													if (local2255 == -1) {
														local2129 = local2111;
														local2111 = Static173.aClass73_2030;
													} else {
														local2129 = local2111.method2413(local2255, 0);
														local2111 = local2111.method2447(local2255 + 4);
													}
													local2108.method1069(local2129, local833 + 3, local711, 0, -1);
													local711 += local2108.anInt1397 + 1;
												}
											}
											if (local19.anInt3722 == 9) {
												if (local19.anInt3706 == 1) {
													Static15.method2298(local109, local101, local19.anInt3670 + local109, local101 - -local19.anInt3708, local19.anInt3712);
												} else {
													local231 = local19.anInt3670 >= 0 ? local19.anInt3670 : -local19.anInt3670;
													local226 = local19.anInt3708 >= 0 ? local19.anInt3708 : -local19.anInt3708;
													local655 = local231;
													if (local226 > local231) {
														local655 = local226;
													}
													if (local655 != 0) {
														local675 = (local19.anInt3708 << 16) / local655;
														local666 = (local19.anInt3670 << 16) / local655;
														if (local666 >= local675) {
															local666 = -local666;
														} else {
															local675 = -local675;
														}
														local818 = local19.anInt3706 * local675 + 1 >> 17;
														local2255 = local19.anInt3706 * local666 + 1 >> 17;
														@Pc(2409) int local2409 = local109 - arg4;
														local711 = local19.anInt3706 * local666 >> 17;
														local867 = local101 - arg0;
														local833 = local675 * local19.anInt3706 >> 17;
														local869 = local833 + local2409;
														local899 = local2409 - local818;
														@Pc(2443) int local2443 = local2409 + local19.anInt3670 - local818;
														@Pc(2451) int local2451 = local19.anInt3708 + local867 - local2255;
														@Pc(2455) int local2455 = local867 - local2255;
														@Pc(2460) int local2460 = local867 + local711;
														@Pc(2468) int local2468 = local867 + local19.anInt3708 + local711;
														@Pc(2476) int local2476 = local19.anInt3670 + local2409 + local833;
														Static36.method654(local869, local899, local2443);
														Static36.method665(local2460, local2455, local2451, local869, local899, local2443, local19.anInt3712);
														Static36.method654(local869, local2443, local2476);
														Static36.method665(local2460, local2451, local2468, local869, local2443, local2476, local19.anInt3712);
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
			}
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!p;)V")
	public static void method941(@OriginalArg(1) Applet_Sub1 arg0) {
		if (Static2.anInt7 != 1) {
			return;
		}
		if (Static61.anInt1463 >= 280 && Static61.anInt1463 <= 294 && anInt1243 >= 4 && anInt1243 <= 18) {
			Static93.method1619(0, 0);
			return;
		}
		if (Static61.anInt1463 >= 295 && Static61.anInt1463 <= 360 && anInt1243 >= 4 && anInt1243 <= 18) {
			Static93.method1619(0, 1);
			return;
		}
		if (Static61.anInt1463 >= 390 && Static61.anInt1463 <= 404 && anInt1243 >= 4 && anInt1243 <= 18) {
			Static93.method1619(1, 0);
			return;
		}
		if (Static61.anInt1463 >= 405 && Static61.anInt1463 <= 470 && anInt1243 >= 4 && anInt1243 <= 18) {
			Static93.method1619(1, 1);
			return;
		}
		if (Static61.anInt1463 >= 500 && Static61.anInt1463 <= 514 && anInt1243 >= 4 && anInt1243 <= 18) {
			Static93.method1619(2, 0);
			return;
		}
		if (Static61.anInt1463 >= 515 && Static61.anInt1463 <= 580 && anInt1243 >= 4 && anInt1243 <= 18) {
			Static93.method1619(2, 1);
			return;
		}
		if (Static61.anInt1463 >= 610 && Static61.anInt1463 <= 624 && anInt1243 >= 4 && anInt1243 <= 18) {
			Static93.method1619(3, 0);
			return;
		}
		if (Static61.anInt1463 >= 625 && Static61.anInt1463 <= 690 && anInt1243 >= 4 && anInt1243 <= 18) {
			Static93.method1619(3, 1);
			return;
		}
		if (Static61.anInt1463 >= 708 && anInt1243 >= 4 && Static61.anInt1463 <= 758 && anInt1243 <= 20) {
			Static105.aBoolean159 = false;
			Static67.aClass3_Sub1_Sub3_Sub4_13.method2317(0, 0);
			Static39.aClass3_Sub1_Sub3_Sub4_9.method2317(382, 0);
			Static39.aClass3_Sub1_Sub3_Sub3_4.method1493(382 - Static39.aClass3_Sub1_Sub3_Sub3_4.anInt1917 / 2, 18);
			return;
		}
		if (Static13.anInt313 == -1) {
			return;
		}
		@Pc(256) Class62 local256 = Static9.aClass62Array1[Static13.anInt313];
		if (local256.aBoolean196 == Static109.aBoolean173) {
			@Pc(284) byte[] local284 = Static19.method372(new Class73[] { local256.aClass73_1658, Static153.aClass73_1856 }).method2416();
			Static65.aString2 = new String(local284, 0, local284.length);
			if (Static90.anInt2026 != 0) {
				Static90.anInt2026 = 0;
				Static105.anInt2370 = 43594;
				Static103.anInt2328 = 43594;
				Static98.anInt2187 = 443;
			}
			Static105.aBoolean159 = false;
			Static94.anInt2078 = local256.anInt2963;
			Static67.aClass3_Sub1_Sub3_Sub4_13.method2317(0, 0);
			Static39.aClass3_Sub1_Sub3_Sub4_9.method2317(382, 0);
			Static39.aClass3_Sub1_Sub3_Sub3_4.method1493(382 - Static39.aClass3_Sub1_Sub3_Sub3_4.anInt1917 / 2, 18);
			return;
		}
		@Pc(385) Class73 local385 = Static19.method372(new Class73[] { Static68.aClass73_847, local256.aClass73_1658, Static153.aClass73_1856, Static173.aClass73_2031, Static105.aClass73_1365, Static154.method2485(Static85.aBoolean127 ? 1 : 0), Static2.aClass73_4, Static154.method2485(Static173.anInt3798), Static48.aClass73_644, Static154.method2485(Static112.anInt2735) });
		try {
			arg0.getAppletContext().showDocument(local385.method2441(), "_self");
		} catch (@Pc(394) Exception local394) {
		}
	}

	@OriginalMember(owner = "client!ga", name = "k", descriptor = "(I)V")
	public static void method946() {
		Static159.aClass7_25.method190();
	}
}
