import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static461 {

	@OriginalMember(owner = "client!td", name = "a", descriptor = "Lclient!hb;")
	public static final Class117 aClass117_19 = new Class117(12, 7);

	@OriginalMember(owner = "client!td", name = "b", descriptor = "Z")
	public static boolean aBoolean587 = false;

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIIIII[Lclient!qf;)V")
	public static void method6875(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class245[] arg8) {
		Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
		for (@Pc(18) int local18 = 0; local18 < arg8.length; local18++) {
			@Pc(24) Class245 local24 = arg8[local18];
			if (local24 != null && (arg2 == local24.anInt7238 || arg2 == -1412584499 && Static166.aClass245_12 == local24)) {
				@Pc(43) int local43;
				if (arg0 == -1) {
					Class102.aRectangleArray1[Static489.anInt8712].setBounds(local24.anInt7260 + arg7, local24.anInt7295 - -arg1, local24.anInt7249, local24.anInt7229);
					local43 = Static489.anInt8712++;
				} else {
					local43 = arg0;
				}
				local24.anInt7253 = local43;
				local24.anInt7278 = Static223.anInt4829;
				if (!Static63.method1297(local24)) {
					if (local24.anInt7273 != 0) {
						Static400.method6095(local24);
					}
					@Pc(91) int local91 = arg7 + local24.anInt7260;
					@Pc(96) int local96 = arg1 + local24.anInt7295;
					@Pc(99) int local99 = local24.anInt7284;
					if (Static362.aBoolean430 && (Static63.method1295(local24).anInt1859 != 0 || local24.anInt7223 == 0) && local99 > 127) {
						local99 = 127;
					}
					@Pc(150) int local150;
					@Pc(154) int local154;
					if (local24 == Static166.aClass245_12) {
						if (arg2 != -1412584499 && (Static541.anInt9361 == local24.anInt7240 || Static301.anInt5963 == local24.anInt7240)) {
							Static36.aClass245Array1 = arg8;
							Static265.anInt5513 = arg1;
							Static447.anInt8186 = arg7;
							continue;
						}
						if (Static468.aBoolean618 && Static509.aBoolean661) {
							local150 = Static35.aClass54_1.method4074();
							local154 = Static35.aClass54_1.method4071();
							local150 -= Static21.anInt706;
							local154 -= Static392.anInt7212;
							if (Static495.anInt5639 > local150) {
								local150 = Static495.anInt5639;
							}
							if (Static282.anInt5795 > local154) {
								local154 = Static282.anInt5795;
							}
							if (Static143.aClass245_6.anInt7249 + Static495.anInt5639 < local24.anInt7249 + local150) {
								local150 = Static143.aClass245_6.anInt7249 + Static495.anInt5639 - local24.anInt7249;
							}
							local91 = local150;
							if (local24.anInt7229 + local154 > Static143.aClass245_6.anInt7229 + Static282.anInt5795) {
								local154 = Static282.anInt5795 + Static143.aClass245_6.anInt7229 - local24.anInt7229;
							}
							local96 = local154;
						}
						if (local24.anInt7240 == Static301.anInt5963) {
							local99 = 128;
						}
					}
					@Pc(280) int local280;
					@Pc(269) int local269;
					@Pc(230) int local230;
					@Pc(236) int local236;
					if (local24.anInt7223 == 2) {
						local150 = arg3;
						local154 = arg4;
						local269 = arg6;
						local280 = arg5;
					} else {
						local230 = local91 + local24.anInt7249;
						local236 = local96 + local24.anInt7229;
						local154 = arg4 >= local96 ? arg4 : local96;
						local150 = local91 <= arg3 ? arg3 : local91;
						if (local24.anInt7223 == 9) {
							local236++;
							local230++;
						}
						local269 = arg6 <= local236 ? arg6 : local236;
						local280 = arg5 <= local230 ? arg5 : local230;
					}
					if (local150 < local280 && local154 < local269) {
						@Pc(533) int local533;
						@Pc(548) int local548;
						@Pc(641) int local641;
						@Pc(500) int local500;
						@Pc(531) int local531;
						if (local24.anInt7273 != 0) {
							if (Static135.anInt2757 == local24.anInt7273 || local24.anInt7273 == Static436.anInt7979) {
								Static209.method3852(local24.anInt7249, local96, Static436.anInt7979 == local24.anInt7273, local24.anInt7229, local91);
								Static125.aBooleanArray12[local43] = true;
								Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
								continue;
							}
							if (local24.anInt7273 == Static25.anInt757) {
								if (local24.method6006(Static121.aClass5_7) != null) {
									Static442.method6680();
									Static294.method4930(local91, local24, Static121.aClass5_7, local96);
									Static302.aBooleanArray29[local43] = true;
									Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
								}
								continue;
							}
							if (Static269.anInt5574 == local24.anInt7273) {
								if (local24.method6006(Static121.aClass5_7) != null) {
									Static163.method7661(local24, local96, local91);
									Static302.aBooleanArray29[local43] = true;
									Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
								}
								continue;
							}
							if (Static97.anInt2025 == local24.anInt7273) {
								Static344.method5473(local24.anInt7229, local24.anInt7249, Static121.aClass5_7, Static202.anInterface4_10, local91, local96);
								Static125.aBooleanArray12[local43] = true;
								Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
								continue;
							}
							if (local24.anInt7273 == Static89.anInt1941) {
								Static282.method4839(local24.anInt7229, local96, Static121.aClass5_7, local24.anInt7249, local91);
								Static125.aBooleanArray12[local43] = true;
								Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
								continue;
							}
							if (local24.anInt7273 == Static485.anInt8694) {
								if (!Static120.aBoolean193 && !Static481.aBoolean638) {
									continue;
								}
								local230 = local24.anInt7249 + local91;
								local236 = local96 + 15;
								if (Static120.aBoolean193) {
									local500 = -256;
									if (Static111.anInt8371 < 20) {
										local500 = -65536;
									}
									Static164.aClass59_1.method7277(local500, local230, "Fps:" + Static111.anInt8371, local236);
									local236 += 15;
									@Pc(522) Runtime local522 = Runtime.getRuntime();
									local531 = (int) ((local522.totalMemory() - local522.freeMemory()) / 1024L);
									local533 = -256;
									if (local531 > 65536) {
										local533 = -65536;
										if (Static99.aBoolean428) {
											Static155.method2661();
											for (local548 = 0; local548 < 10; local548++) {
												System.gc();
											}
											local531 = (int) ((local522.totalMemory() - local522.freeMemory()) / 1024L);
											if (local531 > 65536) {
												Static356.method5583("WARNING: Memory usage over 64MB! Please inform whoever is responsible for the content/area you are using/in.");
											}
										}
									}
									Static164.aClass59_1.method7277(local533, local230, "Mem:" + local531 + "k", local236);
									local236 += 15;
									Static164.aClass59_1.method7277(-256, local230, "In:" + Static195.anInt4428 + "B/s Out:" + Static296.anInt5932 + "B/s", local236);
									local236 += 15;
									local548 = Static121.aClass5_7.v() / 1024;
									Static164.aClass59_1.method7277(local548 <= 65536 ? -256 : -65536, local230, "Offheap:" + local548 + "k", local236);
									local236 += 15;
									local641 = 0;
									@Pc(643) int local643 = 0;
									@Pc(645) int local645 = 0;
									for (@Pc(647) int local647 = 0; local647 < 32; local647++) {
										local641 += Static400.aClass113_Sub1Array2[local647].method5718();
										local643 += Static400.aClass113_Sub1Array2[local647].method5721();
										local645 += Static400.aClass113_Sub1Array2[local647].method5720();
									}
									@Pc(685) int local685 = local645 * 100 / local641;
									@Pc(691) int local691 = local643 * 10000 / local641;
									@Pc(711) String local711 = "Cache:" + Static264.method4645(true, (long) local691, 0, 2) + "% (" + local685 + "%)";
									Static364.aClass59_3.method7277(-256, local230, local711, local236);
									local236 += 12;
								}
								if (Static243.anInt5018 > 0) {
									Static364.aClass59_3.method7277(-256, local230, "Particles: " + Static393.anInt7214 + " / " + Static243.anInt5018, local236);
								}
								local236 += 12;
								if (Static481.aBoolean638) {
									Static364.aClass59_3.method7277(-256, local230, "Polys: " + Static121.aClass5_7.SA() + " Models: " + Static121.aClass5_7.aa(), local236);
									local236 += 12;
									Static364.aClass59_3.method7277(-256, local230, "Ls: " + Static422.anInt8666 + " La: " + Static319.anInt6148 + " NPC: " + Static401.anInt7421 + " Pl: " + Static79.anInt1678, local236);
									local236 += 12;
									Static544.method7772();
								}
								Static125.aBooleanArray12[local43] = true;
								continue;
							}
						}
						if (local24.anInt7223 == 0) {
							if (local24.anInt7273 == Static119.anInt2568 && Static121.aClass5_7.method7441()) {
								Static121.aClass5_7.method7433(local91, local96, local24.anInt7249, local24.anInt7229);
							}
							method6875(local43, local96 - local24.anInt7309, local24.anInt7256, local150, local154, local280, local269, local91 - local24.anInt7268, arg8);
							if (local24.aClass245Array2 != null) {
								method6875(local43, local96 - local24.anInt7309, local24.anInt7256, local150, local154, local280, local269, local91 - local24.anInt7268, local24.aClass245Array2);
							}
							@Pc(872) Class3_Sub29 local872 = (Class3_Sub29) Static156.aClass267_14.method6644((long) local24.anInt7256);
							if (local872 != null) {
								Static214.method3929(local269, local150, local872.anInt5522, local91, local280, local43, local154, local96);
							}
							if (Static119.anInt2568 == local24.anInt7273 && Static121.aClass5_7.method7441()) {
								Static121.aClass5_7.method7453();
								Static199.aBoolean327 = true;
							}
							Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
						}
						if (Static280.aBooleanArray28[local43] || Static336.anInt6343 > 1) {
							if (local24.anInt7223 == 3) {
								if (local99 == 0) {
									if (local24.aBoolean506) {
										Static121.aClass5_7.C(local91, local96, local24.anInt7249, local24.anInt7229, local24.anInt7281, 0);
									} else {
										Static121.aClass5_7.method7484(local91, local96, local24.anInt7249, local24.anInt7229, local24.anInt7281, 0);
									}
								} else if (local24.aBoolean506) {
									Static121.aClass5_7.C(local91, local96, local24.anInt7249, local24.anInt7229, local24.anInt7281 & 0xFFFFFF | 255 - (local99 & 0xFF) << 24, 1);
								} else {
									Static121.aClass5_7.method7484(local91, local96, local24.anInt7249, local24.anInt7229, local24.anInt7281 & 0xFFFFFF | 255 - (local99 & 0xFF) << 24, 1);
								}
							} else if (local24.anInt7223 == 4) {
								@Pc(1007) Class59 local1007 = local24.method6015(Static121.aClass5_7);
								if (local1007 != null) {
									local236 = local24.anInt7281;
									@Pc(1022) String local1022 = local24.aString54;
									if (local24.anInt7271 != -1) {
										@Pc(1032) Class27 local1032 = Static99.aClass96_7.method2508(local24.anInt7271);
										local1022 = local1032.aString8;
										if (local1022 == null) {
											local1022 = "null";
										}
										if ((local1032.anInt832 == 1 || local24.anInt7285 != 1) && local24.anInt7285 != -1) {
											local1022 = "<col=ff9040>" + local1022 + "</col> x" + Static170.method3251(local24.anInt7285);
										}
									}
									if (Static140.aClass245_4 == local24) {
										local1022 = Static325.aClass67_99.method1934(Static193.anInt7803);
										local236 = local24.anInt7281;
									}
									if (Static473.aBoolean580) {
										Static121.aClass5_7.Q(local91, local96, local24.anInt7249 + local91, local24.anInt7229 + local96);
									}
									local1007.method7280(null, local236 | 255 - (local99 & 0xFF) << 24, 0, local24.anInt7222, local24.anInt7259, local24.aBoolean500 ? 255 - (local99 & 0xFF) << 24 : -1, local24.anInt7246, local24.anInt7229, local24.anInt7296, null, local91, Static122.aClass119Array8, local24.anInt7249, local1022, local96, 0);
									if (Static473.aBoolean580) {
										Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
									}
								} else if (Static215.aBoolean337) {
									Static31.method809(local24);
								}
							} else {
								@Pc(1255) int local1255;
								if (local24.anInt7223 == 5) {
									if (local24.anInt7242 >= 0) {
										local24.method6014(Static443.aClass72_1, Static144.aClass274_1).method4793(local24.anInt7249, local91, local96, local24.anInt7305 << 3, local24.anInt7312 << 3, local24.anInt7229, 0, Static121.aClass5_7, 0);
									} else {
										@Pc(1218) Class119 local1218;
										if (local24.anInt7271 == -1) {
											local1218 = local24.method6003(Static121.aClass5_7);
										} else {
											@Pc(1200) Class312 local1200 = local24.aBoolean497 ? Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1 : null;
											local1218 = Static99.aClass96_7.method2506(local1200, local24.anInt7285, local24.anInt7255, local24.anInt7235, local24.anInt7269 | 0xFF000000, local24.anInt7271, Static121.aClass5_7);
										}
										if (local1218 != null) {
											local236 = local1218.AA();
											local500 = local1218.a();
											local1255 = 255 - (local99 & 0xFF) << 24 | (local24.anInt7281 == 0 ? 16777215 : local24.anInt7281 & 0xFFFFFF);
											if (local24.aBoolean503) {
												Static121.aClass5_7.Q(local91, local96, local91 + local24.anInt7249, local96 - -local24.anInt7229);
												if (local24.anInt7261 != 0) {
													local531 = (local24.anInt7249 + local236 - 1) / local236;
													local533 = (local24.anInt7229 + local500 - 1) / local500;
													for (local548 = 0; local548 < local531; local548++) {
														for (local641 = 0; local641 < local533; local641++) {
															if (local24.anInt7281 == 0) {
																local1218.method6675((float) local236 / 2.0F + (float) (local236 * local548 + local91), (float) local500 / 2.0F + (float) (local500 * local641 + local96), 4096, local24.anInt7261);
															} else {
																local1218.method6674((float) (local91 + local236 * local548) + (float) local236 / 2.0F, (float) (local96 - -(local500 * local641)) + (float) local500 / 2.0F, 4096, local24.anInt7261, local1255);
															}
														}
													}
												} else if (local24.anInt7281 == 0 && local99 == 0) {
													local1218.method6673(local91, local96, local24.anInt7249, local24.anInt7229);
												} else {
													local1218.ba(local91, local96, local24.anInt7249, local24.anInt7229, 0, local1255, 1);
												}
												Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
											} else if (local24.anInt7281 == 0 && local99 == 0) {
												if (local24.anInt7261 != 0) {
													local1218.method6675((float) local24.anInt7249 / 2.0F + (float) local91, (float) local96 + (float) local24.anInt7229 / 2.0F, local24.anInt7249 * 4096 / local236, local24.anInt7261);
												} else if (local24.anInt7249 == local236 && local500 == local24.anInt7229) {
													local1218.method6678(local91, local96);
												} else {
													local1218.method6670(local91, local96, local24.anInt7249, local24.anInt7229);
												}
											} else if (local24.anInt7261 != 0) {
												local1218.method6674((float) local24.anInt7249 / 2.0F + (float) local91, (float) local96 + (float) local24.anInt7229 / 2.0F, local24.anInt7249 * 4096 / local236, local24.anInt7261, local1255);
											} else if (local24.anInt7249 == local236 && local500 == local24.anInt7229) {
												local1218.I(local91, local96, 0, local1255, 1);
											} else {
												local1218.KA(local91, local96, local24.anInt7249, local24.anInt7229, 0, local1255, 1);
											}
										} else if (Static215.aBoolean337) {
											Static31.method809(local24);
										}
									}
								} else if (local24.anInt7223 == 6) {
									Static172.method3278();
									@Pc(1573) Class2 local1573 = null;
									local236 = 0;
									@Pc(1684) Class122 local1684;
									@Pc(1694) Class312 local1694;
									if (local24.anInt7271 != -1) {
										@Pc(1802) Class27 local1802 = Static99.aClass96_7.method2508(local24.anInt7271);
										if (local1802 != null) {
											local1802 = local1802.method813(local24.anInt7285);
											local1684 = local24.anInt7245 == -1 ? null : Static46.aClass247_1.method6029(local24.anInt7245);
											local1694 = local24.aBoolean497 ? Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1 : null;
											local1573 = local1802.method829(local1694, local1684, Static121.aClass5_7, 1, 2048, local24.anInt7250, local24.anInt7233, local24.anInt7291);
											if (local1573 == null) {
												Static31.method809(local24);
											} else {
												local236 = -local1573.DA() >> 1;
											}
										}
									} else if (local24.anInt7254 == 5) {
										local500 = local24.anInt7244;
										if (local500 >= 0 && local500 < 2048) {
											@Pc(1732) Class6_Sub1_Sub2_Sub1 local1732 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local500];
											@Pc(1745) Class122 local1745 = local24.anInt7245 == -1 ? null : Static46.aClass247_1.method6029(local24.anInt7245);
											if (local1732 != null && (local500 == Static342.anInt6448 || Static239.method4180(local1732.aString27) == local24.anInt7299)) {
												local1573 = local1732.aClass312_1.method7535(Static99.aClass96_7, null, local1745, null, Static546.aClass132_1, Static345.aClass154_1, 0, 2048, Static121.aClass5_7, Static46.aClass247_1, Static127.aClass215_1, -1, local24.anInt7233, local24.anInt7250, Static299.aClass69_2, 0, local24.anInt7291);
											}
										}
									} else if (local24.anInt7254 == 8 || local24.anInt7254 == 9) {
										@Pc(1671) Class3_Sub5 local1671 = Static480.method7117(false, local24.anInt7244);
										local1684 = local24.anInt7245 == -1 ? null : Static46.aClass247_1.method6029(local24.anInt7245);
										if (local1671 != null) {
											local1694 = local24.aBoolean497 ? Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1 : null;
											local1573 = local1671.method698(local1694, local1684, local24.anInt7233, local24.anInt7299, Static121.aClass5_7, local24.anInt7250, local24.anInt7291, local24.anInt7254 == 9);
										}
									} else if (local24.anInt7245 == -1) {
										local1573 = local24.method6012(Static121.aClass5_7, Static299.aClass69_2, Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1, Static99.aClass96_7, 0, -1, Static127.aClass215_1, null, Static546.aClass132_1, -1, 2048, Static46.aClass247_1, Static345.aClass154_1);
										if (local1573 == null && Static215.aBoolean337) {
											Static31.method809(local24);
										}
									} else {
										@Pc(1604) Class122 local1604 = Static46.aClass247_1.method6029(local24.anInt7245);
										local1573 = local24.method6012(Static121.aClass5_7, Static299.aClass69_2, Static111.aClass6_Sub1_Sub2_Sub1_3.aClass312_1, Static99.aClass96_7, local24.anInt7291, local24.anInt7233, Static127.aClass215_1, local1604, Static546.aClass132_1, local24.anInt7250, 2048, Static46.aClass247_1, Static345.aClass154_1);
										if (local1573 == null && Static215.aBoolean337) {
											Static31.method809(local24);
										}
									}
									if (local1573 != null) {
										if (local24.anInt7307 <= 0) {
											local500 = 512;
										} else {
											local500 = (local24.anInt7249 << 9) / local24.anInt7307;
										}
										if (local24.anInt7230 > 0) {
											local1255 = (local24.anInt7229 << 9) / local24.anInt7230;
										} else {
											local1255 = 512;
										}
										local531 = local24.anInt7249 / 2 + local91 + (local500 * local24.anInt7232 >> 9);
										local533 = local24.anInt7229 / 2 + local96 + (local1255 * local24.anInt7314 >> 9);
										Static181.aClass205_5.Y();
										Static121.aClass5_7.method7469(Static181.aClass205_5);
										Static121.aClass5_7.m(local531, local533, local500, local1255);
										Static121.aClass5_7.ka((float) (local24.anInt7234 << 2), local24.aBoolean508 ? (float) (local24.anInt7231 << 2) : (float) (local24.anInt7231 << 2) * 1.5F);
										if (arg2 == -1412584499 || Static199.aBoolean327) {
											Static121.aClass5_7.F();
											Static121.aClass5_7.method7444();
											Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
											Static199.aBoolean327 = false;
										}
										if (local24.aBoolean499) {
											Static121.aClass5_7.method7412(false);
										}
										local548 = (local24.anInt7247 << 2) * Class5.anIntArray761[local24.anInt7282 << 3] >> 14;
										local641 = (local24.anInt7247 << 2) * Class5.anIntArray760[local24.anInt7282 << 3] >> 14;
										Static131.aClass205_3.ra(-local24.anInt7290 << 3);
										Static131.aClass205_3.P(local24.anInt7258 << 3);
										Static131.aClass205_3.G(local24.anInt7270 << 2, local548 + (local24.anInt7308 << 2) + local236, (local24.anInt7308 << 2) + local641);
										Static131.aClass205_3.S(local24.anInt7282 << 3);
										local24.method6002(Static223.anInt4829, Static131.aClass205_3, Static121.aClass5_7, local1573);
										if (Static473.aBoolean580) {
											Static121.aClass5_7.Q(local91, local96, local24.anInt7249 + local91, local24.anInt7229 + local96);
										}
										if (local24.aBoolean508) {
											local1573.method5772(Static131.aClass205_3, null, local24.anInt7247 << 2);
										} else if (local24.aClass4_Sub4_5 == null) {
											local1573.method5774(Static131.aClass205_3, null, 1);
										} else {
											Static121.aClass5_7.method7464(local1573, local24.aClass4_Sub4_5.method4596(), Static131.aClass205_3, null, 1);
										}
										if (Static473.aBoolean580) {
											Static121.aClass5_7.ca(arg3, arg4, arg5, arg6);
										}
										if (local24.aBoolean499) {
											Static121.aClass5_7.method7412(true);
										}
										Static121.aClass5_7.ka(0.0F, 0.0F);
									}
								} else if (local24.anInt7223 == 9) {
									if (local24.aBoolean495) {
										local1255 = local96;
										local500 = local24.anInt7249 + local91;
										local236 = local24.anInt7229 + local96;
									} else {
										local500 = local91 + local24.anInt7249;
										local1255 = local24.anInt7229 + local96;
										local236 = local96;
									}
									if (local24.anInt7272 == 1) {
										Static121.aClass5_7.method7419(local91, local236, local500, local1255, local24.anInt7281, 0);
									} else {
										Static121.aClass5_7.method7458(local91, local236, local500, local1255, local24.anInt7281, local24.anInt7272);
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
