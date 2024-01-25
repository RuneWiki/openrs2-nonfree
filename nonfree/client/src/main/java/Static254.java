import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static254 {

	@OriginalMember(owner = "client!r", name = "b", descriptor = "[Z")
	public static boolean[] aBooleanArray21;

	@OriginalMember(owner = "client!r", name = "h", descriptor = "I")
	public static int anInt5236;

	@OriginalMember(owner = "client!r", name = "i", descriptor = "I")
	public static int anInt5237;

	@OriginalMember(owner = "client!r", name = "j", descriptor = "I")
	public static int anInt5238;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "Ljava/lang/String;")
	public static final String aString201 = "yellow:";

	@OriginalMember(owner = "client!r", name = "d", descriptor = "I")
	public static int anInt5233 = 0;

	@OriginalMember(owner = "client!r", name = "e", descriptor = "[[B")
	public static final byte[][] aByteArrayArray16 = new byte[1000][];

	@OriginalMember(owner = "client!r", name = "f", descriptor = "I")
	public static int anInt5234 = 0;

	@OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Lclient!nj;")
	public static Class1_Sub21 method4544() {
		@Pc(8) Class1_Sub21 local8 = new Class1_Sub21(37);
		local8.method5718(14);
		local8.method5718(Static182.anInt3805);
		local8.method5718(Static278.aBoolean473 ? 1 : 0);
		local8.method5718(Static211.aBoolean353 ? 1 : 0);
		local8.method5718(Static341.aBoolean543 ? 1 : 0);
		local8.method5718(Static42.aBoolean75 ? 1 : 0);
		local8.method5718(0);
		local8.method5718(Static266.aBoolean458 ? 1 : 0);
		local8.method5718(Static329.aBoolean533 ? 1 : 0);
		local8.method5718(Static221.aBoolean375 ? 1 : 0);
		local8.method5718(Static256.anInt5260);
		local8.method5718(Static50.aBoolean83 ? 1 : 0);
		local8.method5718(Static347.aBoolean550 ? 1 : 0);
		local8.method5718(Static168.aBoolean267 ? 1 : 0);
		local8.method5718(Static13.anInt213);
		local8.method5718(Static138.aBoolean522 ? 1 : 0);
		local8.method5718(Static119.anInt2298);
		local8.method5718(Static4.anInt39);
		local8.method5718(Static142.anInt2788);
		local8.method5698(Static147.anInt3045);
		local8.method5698(Static18.anInt358);
		local8.method5718(Static268.method4820());
		local8.method5702(Static10.anInt181);
		local8.method5718(Static25.anInt449);
		local8.method5718(Static5.aBoolean10 ? 1 : 0);
		local8.method5718(Static317.aBoolean521 ? 1 : 0);
		local8.method5718(Static313.anInt6232);
		local8.method5718(Static311.aBoolean510 ? 1 : 0);
		local8.method5718(Static8.aBoolean13 ? 1 : 0);
		local8.method5718(Static182.anInt3809);
		local8.method5718(Static5.aBoolean9 ? 1 : 0);
		local8.method5718(Static248.anInt26);
		return local8;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII)V")
	public static void method4545(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		Static291.aByteArrayArrayArray11 = new byte[4][arg1][arg0];
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(IIII[Lclient!ps;IIIII)V")
	public static void method4546(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class163[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
		for (@Pc(18) int local18 = 0; local18 < arg3.length; local18++) {
			@Pc(24) Class163 local24 = arg3[local18];
			if (local24 != null && (local24.anInt4918 == arg8 || arg8 == -1412584499 && Static157.aClass163_11 == local24)) {
				@Pc(44) int local44;
				if (arg2 == -1) {
					Class1_Sub5_Sub21.aRectangleArray4[Static344.anInt6649].setBounds(arg1 + local24.anInt5012, local24.anInt4993 - -arg4, local24.anInt4991, local24.anInt4935);
					local44 = Static344.anInt6649++;
				} else {
					local44 = arg2;
				}
				local24.anInt4982 = local44;
				local24.anInt4978 = Static282.anInt3516;
				if (!local24.aBoolean411 || !Static40.method859(local24)) {
					if (local24.anInt4926 > 0) {
						Static325.method2374(local24);
					}
					@Pc(95) int local95 = arg1 + local24.anInt5012;
					@Pc(100) int local100 = arg4 + local24.anInt4993;
					@Pc(103) int local103 = local24.anInt4952;
					if (Static173.aBoolean279 && (Static40.method857(local24).anInt1311 != 0 || local24.anInt4934 == 0) && local103 > 127) {
						local103 = 127;
					}
					@Pc(143) int local143;
					@Pc(145) int local145;
					if (local24 == Static157.aClass163_11) {
						if (arg8 != -1412584499 && !local24.aBoolean414) {
							Static44.anInt1169 = arg1;
							Static121.anInt4225 = arg4;
							Static223.aClass163Array2 = arg3;
							continue;
						}
						if (Static14.aBoolean20 && Static144.aBoolean232) {
							local143 = Static208.anInt4358;
							local145 = Static28.anInt538;
							local143 -= Static144.anInt3020;
							local145 -= Static171.anInt3616;
							if (Static10.anInt164 > local143) {
								local143 = Static10.anInt164;
							}
							if (Static10.anInt164 + Static177.aClass163_12.anInt4991 < local24.anInt4991 + local143) {
								local143 = Static177.aClass163_12.anInt4991 + Static10.anInt164 - local24.anInt4991;
							}
							if (Static47.anInt1203 > local145) {
								local145 = Static47.anInt1203;
							}
							if (local24.anInt4935 + local145 > Static177.aClass163_12.anInt4935 + Static47.anInt1203) {
								local145 = Static177.aClass163_12.anInt4935 + Static47.anInt1203 - local24.anInt4935;
							}
							local95 = local143;
							local100 = local145;
						}
						if (!local24.aBoolean414) {
							local103 = 128;
						}
					}
					@Pc(229) int local229;
					@Pc(225) int local225;
					@Pc(236) int local236;
					@Pc(241) int local241;
					if (local24.anInt4934 == 2) {
						local145 = arg0;
						local225 = arg7;
						local143 = arg5;
						local229 = arg6;
					} else {
						local236 = local95 + local24.anInt4991;
						local241 = local24.anInt4935 + local100;
						local143 = local95 > arg5 ? local95 : arg5;
						local145 = arg0 < local100 ? local100 : arg0;
						if (local24.anInt4934 == 9) {
							local236++;
							local241++;
						}
						local225 = arg7 > local241 ? local241 : arg7;
						local229 = local236 >= arg6 ? arg6 : local236;
					}
					if (!local24.aBoolean411 || local229 > local143 && local145 < local225) {
						@Pc(498) int local498;
						@Pc(553) int local553;
						@Pc(555) int local555;
						@Pc(557) int local557;
						@Pc(559) int local559;
						@Pc(603) int local603;
						@Pc(529) int local529;
						@Pc(500) int local500;
						if (local24.anInt4926 != 0) {
							if (local24.anInt4926 == 1337 || local24.anInt4926 == 1403) {
								Static109.method1760(local24.anInt4991, local24.anInt4935, local95, local24.anInt4926 == 1403, local100);
								Static19.aBooleanArray1[local44] = true;
								Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
								continue;
							}
							if (local24.anInt4926 == 1338) {
								if (local24.method4337(Static217.aClass105_5) != null) {
									Static310.method5336();
									Static185.method3260(local95, Static217.aClass105_5, local24, local100);
									Static78.aBooleanArray7[local44] = true;
									Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
								}
								continue;
							}
							if (local24.anInt4926 == 1339) {
								if (local24.method4337(Static217.aClass105_5) != null) {
									Static303.method5265(local95, local100, local24);
									Static78.aBooleanArray7[local44] = true;
									Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
								}
								continue;
							}
							if (local24.anInt4926 == 1400) {
								Static29.method493(local24.anInt4935, Static217.aClass105_5, local24.anInt4991, Static71.anInterface2_1, local100, local95);
								Static19.aBooleanArray1[local44] = true;
								Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
								continue;
							}
							if (local24.anInt4926 == 1401) {
								Static72.method1265(local95, local24.anInt4991, Static217.aClass105_5, local24.anInt4935, local100);
								Static19.aBooleanArray1[local44] = true;
								Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
								continue;
							}
							if (local24.anInt4926 == 1405) {
								if (!Static248.aBoolean4 && !Static313.aBoolean515) {
									continue;
								}
								local236 = local95 + local24.anInt4991;
								local241 = local100 + 15;
								if (Static248.aBoolean4) {
									Static233.aClass29_2.method3740("Fps:" + Static79.anInt6704, local236, -256, local241);
									local241 += 15;
									@Pc(488) Runtime local488 = Runtime.getRuntime();
									local498 = (int) ((local488.totalMemory() - local488.freeMemory()) / 1024L);
									local500 = -256;
									if (local498 > 65536) {
										local500 = -65536;
									}
									Static233.aClass29_2.method3740("Mem:" + local498 + "k", local236, local500, local241);
									local241 += 15;
									local529 = Static217.aClass105_5.method4288() / 1024;
									Static233.aClass29_2.method3740("Offheap:" + local529 + "k", local236, local529 > 65536 ? -65536 : -256, local241);
									local241 += 15;
									local553 = 0;
									local555 = 0;
									local557 = 0;
									for (local559 = 0; local559 < 29; local559++) {
										local553 += Static60.aClass113_Sub1Array1[local559].method4972();
										local555 += Static60.aClass113_Sub1Array1[local559].method4975();
										local557 += Static60.aClass113_Sub1Array1[local559].method4979();
									}
									@Pc(597) int local597 = local557 * 100 / local553;
									local603 = local555 * 10000 / local553;
									@Pc(623) String local623 = "Cache:" + Static245.method822(0, true, 2, (long) local603) + "% (" + local597 + "%)";
									Static294.aClass29_4.method3740(local623, local236, -256, local241);
									local241 += 12;
								}
								if (Static189.anInt6108 > 0) {
									Static294.aClass29_4.method3740("Particles: " + Static214.anInt4557 + " / " + Static189.anInt6108, local236, -256, local241);
								}
								local241 += 12;
								if (Static313.aBoolean515) {
									Static294.aClass29_4.method3740("Polys: " + Static217.aClass105_5.method4291() + " Models: " + Static217.aClass105_5.method4266(), local236, -256, local241);
									local241 += 12;
									Static294.aClass29_4.method3740("Ls: " + Static34.anInt652 + " La: " + Static79.anInt6694 + " NPC: " + Static294.anInt5918 + " Pl: " + Static190.anInt3971, local236, -256, local241);
									local241 += 12;
									Static193.method3428();
								}
								Static19.aBooleanArray1[local44] = true;
								continue;
							}
						}
						if (local24.anInt4934 == 0) {
							if (!local24.aBoolean411 && Static40.method859(local24) && Static139.aClass163_10 != local24) {
								continue;
							}
							if (!local24.aBoolean411) {
								if (local24.anInt4990 - local24.anInt4935 < local24.anInt4985) {
									local24.anInt4985 = local24.anInt4990 - local24.anInt4935;
								}
								if (local24.anInt4985 < 0) {
									local24.anInt4985 = 0;
								}
							}
							if (local24.anInt4926 == 1407 && Static217.aClass105_5.method4296()) {
								Static217.aClass105_5.method4217(local95, local100, local24.anInt4991, local24.anInt4935);
							}
							method4546(local145, local95 - local24.anInt4971, local44, arg3, local100 - local24.anInt4985, local143, local229, local225, local24.anInt4947);
							if (local24.aClass163Array3 != null) {
								method4546(local145, local95 - local24.anInt4971, local44, local24.aClass163Array3, local100 - local24.anInt4985, local143, local229, local225, local24.anInt4947);
							}
							@Pc(818) Class1_Sub26 local818 = (Class1_Sub26) Static298.aClass207_35.method5555((long) local24.anInt4947);
							if (local818 != null) {
								Static226.method4889(local44, local229, local145, local143, local100, local818.anInt3825, local95, local225);
							}
							if (local24.anInt4926 == 1407 && Static217.aClass105_5.method4296()) {
								Static217.aClass105_5.method4229();
								Static282.aBoolean269 = true;
							}
							Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
						}
						if (Static75.aBooleanArray6[local44] || Static235.anInt6130 > 1) {
							if (local24.anInt4934 == 0 && !local24.aBoolean411 && local24.anInt4990 > local24.anInt4935) {
								Static307.method5322(local24.anInt4935, local24.anInt4991 + local95, local24.anInt4985, local100, local24.anInt4990);
							}
							if (local24.anInt4934 != 1) {
								@Pc(899) int local899;
								if (local24.anInt4934 == 2) {
									local236 = 0;
									for (local241 = 0; local241 < local24.anInt4933; local241++) {
										for (local899 = 0; local899 < local24.anInt5009; local899++) {
											local498 = local95 + local899 * (local24.anInt4916 + 32);
											local500 = local100 + local241 * (local24.anInt4976 + 32);
											if (local236 < 20) {
												local498 += local24.anIntArray465[local236];
												local500 += local24.anIntArray455[local236];
											}
											if (local24.anIntArray461[local236] > 0) {
												local555 = local24.anIntArray461[local236] - 1;
												if (arg5 < local498 + 32 && arg6 > local498 && local500 + 32 > arg0 && local500 < arg7 || local24 == Static43.aClass163_4 && Static35.anInt870 == local236) {
													@Pc(1040) Class8 local1040;
													if (anInt5233 == 1 && local236 == Static151.anInt3083 && local24.anInt4947 == Static223.anInt1490) {
														local1040 = Static269.method4846(local555, local24.anIntArray460[local236], Static217.aClass105_5, 0, null, 2, local24.anInt4919);
													} else {
														local1040 = Static269.method4846(local555, local24.anIntArray460[local236], Static217.aClass105_5, -13623264, null, 1, local24.anInt4919);
													}
													if (local1040 == null) {
														Static340.method5639(local24);
													} else if (local24 == Static43.aClass163_4 && Static35.anInt870 == local236) {
														local529 = Static208.anInt4358 - Static69.anInt1476;
														local553 = Static28.anInt538 - Static351.anInt4024;
														if (local529 < 5 && local529 > -5) {
															local529 = 0;
														}
														if (local553 < 5 && local553 > -5) {
															local553 = 0;
														}
														if (Static63.anInt2653 < 5) {
															local529 = 0;
															local553 = 0;
														}
														local1040.method4394(local498 + local529, local553 + local500, 0, -2013265920);
														if (arg8 != -1) {
															@Pc(1149) Class163 local1149 = arg3[arg8 & 0xFFFF];
															@Pc(1152) int[] local1152 = new int[4];
															Static217.aClass105_5.method4292(local1152);
															local603 = local1152[1];
															@Pc(1163) int local1163 = local1152[3];
															@Pc(1190) int local1190;
															if (local603 > local500 + local553 && local1149.anInt4985 > 0) {
																local1190 = Static41.anInt1126 * (local603 - local553 - local500) / 3;
																if (local1190 > Static41.anInt1126 * 10) {
																	local1190 = Static41.anInt1126 * 10;
																}
																if (local1190 > local1149.anInt4985) {
																	local1190 = local1149.anInt4985;
																}
																Static351.anInt4024 += local1190;
																local1149.anInt4985 -= local1190;
																Static340.method5639(local1149);
															}
															if (local1163 < local553 + local500 + 32 && local1149.anInt4990 - local1149.anInt4935 > local1149.anInt4985) {
																local1190 = (local553 + local500 + 32 - local1163) * Static41.anInt1126 / 3;
																if (local1190 > Static41.anInt1126 * 10) {
																	local1190 = Static41.anInt1126 * 10;
																}
																if (local1149.anInt4990 - local1149.anInt4985 - local1149.anInt4935 < local1190) {
																	local1190 = local1149.anInt4990 - local1149.anInt4935 - local1149.anInt4985;
																}
																local1149.anInt4985 += local1190;
																Static351.anInt4024 -= local1190;
																Static340.method5639(local1149);
															}
														}
													} else if (local24 == Static90.aClass163_6 && local236 == Static351.anInt4014) {
														local1040.method4394(local498, local500, 0, -2013265920);
													} else {
														local1040.method4393(local498, local500);
													}
												}
											} else if (local24.anIntArray467 != null && local236 < 20) {
												@Pc(960) Class8 local960 = local24.method4347(local236, Static217.aClass105_5);
												if (local960 != null) {
													local960.method4393(local498, local500);
												} else if (Static170.aBoolean273) {
													Static340.method5639(local24);
												}
											}
											local236++;
										}
									}
								} else if (local24.anInt4934 == 3) {
									if (Static302.method5239(local24)) {
										local236 = local24.anInt4961;
										if (Static139.aClass163_10 == local24 && local24.anInt4917 != 0) {
											local236 = local24.anInt4917;
										}
									} else {
										local236 = local24.anInt4948;
										if (local24 == Static139.aClass163_10 && local24.anInt4963 != 0) {
											local236 = local24.anInt4963;
										}
									}
									if (local103 == 0) {
										if (local24.aBoolean409) {
											Static217.aClass105_5.method4249(local95, local100, local24.anInt4991, local24.anInt4935, local236, 0);
										} else {
											Static217.aClass105_5.method4275(local95, local100, local24.anInt4991, local24.anInt4935, local236, 0);
										}
									} else if (local24.aBoolean409) {
										Static217.aClass105_5.method4249(local95, local100, local24.anInt4991, local24.anInt4935, local236 & 0xFFFFFF | 255 - (local103 & 0xFF) << 24, 1);
									} else {
										Static217.aClass105_5.method4275(local95, local100, local24.anInt4991, local24.anInt4935, 255 - (local103 & 0xFF) << 24 | local236 & 0xFFFFFF, 1);
									}
								} else {
									@Pc(1447) Class29 local1447;
									if (local24.anInt4934 == 4) {
										local1447 = local24.method4342(Static217.aClass105_5);
										if (local1447 != null) {
											@Pc(1459) String local1459 = local24.aString193;
											if (Static302.method5239(local24)) {
												local241 = local24.anInt4961;
												if (Static139.aClass163_10 == local24 && local24.anInt4917 != 0) {
													local241 = local24.anInt4917;
												}
												if (local24.aString192.length() > 0) {
													local1459 = local24.aString192;
												}
											} else {
												local241 = local24.anInt4948;
												if (local24 == Static139.aClass163_10 && local24.anInt4963 != 0) {
													local241 = local24.anInt4963;
												}
											}
											if (local24.aBoolean411 && local24.anInt4924 != -1) {
												@Pc(1512) Class102 local1512 = Static348.method5333(local24.anInt4924);
												local1459 = local1512.aString95;
												if (local1459 == null) {
													local1459 = "null";
												}
												if ((local1512.anInt2399 == 1 || local24.anInt5006 != 1) && local24.anInt5006 != -1) {
													local1459 = "<col=ff9040>" + local1459 + "</col> x" + Static92.method1445(local24.anInt5006);
												}
											}
											if (local24 == Static50.aClass163_5) {
												local1459 = Static121.aString159;
												local241 = local24.anInt4948;
											}
											if (!local24.aBoolean411) {
												local1459 = Static301.method5229(local24, local1459);
											}
											if (Static207.aBoolean341) {
												Static217.aClass105_5.method4265(local95, local100, local24.anInt4991 + local95, local100 - -local24.anInt4935);
											}
											local1447.method3741(0, local100, local1459, null, local241 | 0xFF000000, 0, local24.aBoolean398 ? -16777216 : -1, Static19.aClass8Array1, local95, local24.anInt4991, null, local24.anInt4989, local24.anInt4935, local24.anInt4942, local24.anInt5001);
											if (Static207.aBoolean341) {
												Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
											}
										} else if (Static170.aBoolean273) {
											Static340.method5639(local24);
										}
									} else if (local24.anInt4934 == 5) {
										@Pc(1636) Class8 local1636;
										if (!local24.aBoolean411) {
											local1636 = local24.method4335(Static217.aClass105_5, Static302.method5239(local24));
											if (local1636 != null) {
												local1636.method4393(local95, local100);
											} else if (Static170.aBoolean273) {
												Static340.method5639(local24);
											}
										} else if (local24.anInt4962 >= 0) {
											local24.method4333().method5374(0, local24.anInt5011 << 3, 0, local24.anInt4991, Static217.aClass105_5, local24.anInt4995 << 3, local24.anInt4935, local100, local95);
										} else {
											if (local24.anInt4924 == -1) {
												local1636 = local24.method4335(Static217.aClass105_5, false);
											} else {
												@Pc(1698) Class136 local1698 = local24.aBoolean408 ? Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1 : null;
												local1636 = Static269.method4846(local24.anInt4924, local24.anInt5006, Static217.aClass105_5, local24.anInt4968 | 0xFF000000, local1698, local24.anInt4967, local24.anInt4919);
											}
											if (local1636 != null) {
												local241 = local1636.method4381();
												local899 = local1636.method4395();
												if (local24.aBoolean406) {
													Static217.aClass105_5.method4265(local95, local100, local95 + local24.anInt4991, local100 - -local24.anInt4935);
													if (local24.anInt4938 != 0) {
														local498 = (local241 + local24.anInt4991 - 1) / local241;
														local500 = (local24.anInt4935 + local899 - 1) / local899;
														for (local529 = 0; local529 < local498; local529++) {
															for (local553 = 0; local553 < local500; local553++) {
																local1636.method4379((float) local241 / 2.0F + (float) (local95 + local529 * local241), (float) (local553 * local899 + local100) + (float) local899 / 2.0F, 4096, local24.anInt4938);
															}
														}
													} else if (local103 == 0) {
														local1636.method4396(local95, local100, local24.anInt4991, local24.anInt4935, 0, 0);
													} else {
														local1636.method4396(local95, local100, local24.anInt4991, local24.anInt4935, 1, 255 - (local103 & 0xFF) << 24 | 0xFFFFFF);
													}
													Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
												} else if (local103 != 0) {
													local498 = 255 - (local103 & 0xFF) << 24 | 0xFFFFFF;
													if (local24.anInt4938 != 0) {
														local1636.method4389((float) local95 + (float) local24.anInt4991 / 2.0F, (float) local24.anInt4935 / 2.0F + (float) local100, local24.anInt4991 * 4096 / local241, local24.anInt4938, local498);
													} else if (local24.anInt4991 == local241 && local24.anInt4935 == local899) {
														local1636.method4394(local95, local100, 1, local498);
													} else {
														local1636.method4391(local95, local100, local24.anInt4991, local24.anInt4935, 1, local498, 1);
													}
												} else if (local24.anInt4938 != 0) {
													local1636.method4379((float) local95 + (float) local24.anInt4991 / 2.0F, (float) local24.anInt4935 / 2.0F + (float) local100, local24.anInt4991 * 4096 / local241, local24.anInt4938);
												} else if (local241 == local24.anInt4991 && local899 == local24.anInt4935) {
													local1636.method4393(local95, local100);
												} else {
													local1636.method4390(local95, local100, local24.anInt4991, local24.anInt4935);
												}
											} else if (Static170.aBoolean273) {
												Static340.method5639(local24);
											}
										}
									} else {
										@Pc(2035) Class102 local2035;
										if (local24.anInt4934 == 6) {
											@Pc(2009) boolean local2009 = Static302.method5239(local24);
											if (local2009) {
												local241 = local24.anInt4932;
											} else {
												local241 = local24.anInt4920;
											}
											Static142.method2379();
											@Pc(2023) Class40 local2023 = null;
											local498 = 0;
											@Pc(2060) Class136 local2060;
											@Pc(2052) Class177 local2052;
											if (local24.anInt4924 != -1) {
												local2035 = Static348.method5333(local24.anInt4924);
												if (local2035 != null) {
													local2035 = local2035.method1998(local24.anInt5006);
													local2052 = local241 == -1 ? null : Static354.method5863(local241);
													local2060 = local24.aBoolean408 ? Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1 : null;
													local2023 = local2035.method1987(local24.anInt4922, local24.anInt4965, 1024, 1, local2060, Static217.aClass105_5, local2052, local24.anInt4950);
													if (local2023 == null) {
														Static340.method5639(local24);
													} else {
														local498 = -local2023.method4572() / 2;
													}
												}
											} else if (local24.anInt4975 == 5) {
												if (local24.anInt4979 == -1) {
													local2023 = Static347.aClass136_2.method3145(Static217.aClass105_5, 0, null, -1, 1024, null, 0, null, -1, -1, -1);
												} else {
													local500 = local24.anInt4979;
													@Pc(2124) Class10_Sub1_Sub2_Sub2 local2124;
													if (local500 == Static301.anInt6030) {
														local2124 = Static127.aClass10_Sub1_Sub2_Sub2_1;
													} else {
														local2124 = Static202.aClass10_Sub1_Sub2_Sub2Array1[local500];
													}
													@Pc(2139) Class177 local2139 = local241 == -1 ? null : Static354.method5863(local241);
													if (local2124 != null && (local500 == 2047 || Static166.method2924(local2124.aString152) == local24.anInt4940)) {
														local2023 = local2124.aClass136_1.method3145(Static217.aClass105_5, 0, null, local24.anInt4965, 1024, null, local24.anInt4922, local2139, -1, 0, local24.anInt4950);
													}
												}
											} else if (local24.anInt4975 == 8 || local24.anInt4975 == 9) {
												@Pc(2245) Class1_Sub1 local2245 = Static130.method4250(local24.anInt4979);
												local2052 = local241 == -1 ? null : Static354.method5863(local241);
												if (local2245 != null) {
													local2060 = local24.aBoolean408 ? Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1 : null;
													local2023 = local2245.method15(local24.anInt4975 == 9, local2052, local24.anInt4922, local24.anInt4950, local24.anInt4940, Static217.aClass105_5, local2060, local24.anInt4965);
												}
											} else if (local241 == -1) {
												local2023 = local24.method4334(-1, Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1, 1024, local2009, -1, Static217.aClass105_5, 0, null);
												if (local2023 == null && Static170.aBoolean273) {
													Static340.method5639(local24);
												}
											} else {
												@Pc(2195) Class177 local2195 = Static354.method5863(local241);
												local2023 = local24.method4334(local24.anInt4950, Static127.aClass10_Sub1_Sub2_Sub2_1.aClass136_1, 1024, local2009, local24.anInt4965, Static217.aClass105_5, local24.anInt4922, local2195);
												if (local2023 == null && Static170.aBoolean273) {
													Static340.method5639(local24);
												}
											}
											if (local2023 != null) {
												if (local24.anInt4921 > 0) {
													local500 = (local24.anInt4991 << 9) / local24.anInt4921;
												} else {
													local500 = 512;
												}
												if (local24.anInt4994 > 0) {
													local529 = (local24.anInt4935 << 9) / local24.anInt4994;
												} else {
													local529 = 512;
												}
												local553 = local95 + local24.anInt4991 / 2 + (local500 * local24.anInt4951 >> 9);
												local555 = (local24.anInt4958 * local529 >> 9) + local100 + local24.anInt4935 / 2;
												Static56.aClass31_1.method3182();
												Static217.aClass105_5.method4213(Static56.aClass31_1);
												local557 = Class1_Sub5_Sub15.anIntArray335[local24.anInt4931 << 3] * local24.anInt4929 >> 15;
												local559 = local24.anInt4929 * Class1_Sub5_Sub15.anIntArray333[local24.anInt4931 << 3] >> 15;
												Static217.aClass105_5.method4282(local553, local555, local500, local529);
												Static217.aClass105_5.method4207((float) local24.aShort76, local24.aBoolean396 ? (float) local24.aShort77 : (float) local24.aShort77 * 1.5F);
												if (Static282.aBoolean269) {
													Static217.aClass105_5.method4233();
													Static217.aClass105_5.method4246();
													Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
													Static282.aBoolean269 = false;
												}
												if (local24.aBoolean403) {
													Static217.aClass105_5.method4269(false);
												}
												if (local24.aBoolean411) {
													Static127.aClass31_3.method3186(-local24.anInt4945 << 3);
													Static127.aClass31_3.method3173(local24.anInt5000 << 3);
													Static127.aClass31_3.method3184(local24.anInt4966, local557 + local498 + local24.anInt4960, local24.anInt4960 + local559);
												} else {
													Static127.aClass31_3.method3179(local24.anInt5000 << 3);
													Static127.aClass31_3.method3184(0, local557, local559);
												}
												Static127.aClass31_3.method3178(local24.anInt4931 << 3);
												if (Static207.aBoolean341) {
													Static217.aClass105_5.method4265(local95, local100, local24.anInt4991 + local95, local100 + local24.anInt4935);
												}
												if (local24.aBoolean396) {
													local2023.method4592(Static127.aClass31_3, null, local24.anInt4929);
												} else {
													local2023.method4587(Static127.aClass31_3, null, 1);
												}
												if (Static207.aBoolean341) {
													Static217.aClass105_5.method4268(arg5, arg0, arg6, arg7);
												}
												if (local24.aBoolean403) {
													Static217.aClass105_5.method4269(true);
												}
											}
										} else {
											if (local24.anInt4934 == 7) {
												local1447 = local24.method4342(Static217.aClass105_5);
												if (local1447 == null) {
													if (Static170.aBoolean273) {
														Static340.method5639(local24);
													}
													continue;
												}
												local241 = 0;
												for (local899 = 0; local899 < local24.anInt4933; local899++) {
													for (local498 = 0; local498 < local24.anInt5009; local498++) {
														if (local24.anIntArray461[local241] > 0) {
															local2035 = Static348.method5333(local24.anIntArray461[local241] - 1);
															@Pc(2599) String local2599;
															if (local2035.anInt2399 != 1 && local24.anIntArray460[local241] == 1) {
																local2599 = "<col=ff9040>" + local2035.aString95 + "</col>";
															} else {
																local2599 = "<col=ff9040>" + local2035.aString95 + "</col> x" + Static92.method1445(local24.anIntArray460[local241]);
															}
															local553 = local498 * (local24.anInt4916 + 115) + local95;
															local555 = (local24.anInt4976 + 12) * local899 + local100;
															if (local24.anInt5001 == 0) {
																local1447.method3754(local24.anInt4948 | 0xFF000000, local553, local555, null, local2599, Static19.aClass8Array1, local24.aBoolean398 ? -16777216 : -1);
															} else if (local24.anInt5001 == 1) {
																local1447.method3745(local2599, local553 + 57, null, local24.anInt4948 | 0xFF000000, local555, Static19.aClass8Array1, local24.aBoolean398 ? -16777216 : -1);
															} else {
																local1447.method3747(local553 + 115 - 1, local555, Static19.aClass8Array1, local24.anInt4948 | 0xFF000000, null, local24.aBoolean398 ? -16777216 : -1, local2599);
															}
														}
														local241++;
													}
												}
											}
											if (local24.anInt4934 == 8 && local24 == Static10.aClass163_1 && Static306.anInt6117 == Static319.anInt3291) {
												local236 = 0;
												local241 = 0;
												@Pc(2743) Class29 local2743 = Static233.aClass29_2;
												@Pc(2746) String local2746 = local24.aString193;
												local2746 = Static301.method5229(local24, local2746);
												@Pc(2765) String local2765;
												while (local2746.length() > 0) {
													local529 = local2746.indexOf("<br>");
													if (local529 == -1) {
														local2765 = local2746;
														local2746 = "";
													} else {
														local2765 = local2746.substring(0, local529);
														local2746 = local2746.substring(local529 + 4);
													}
													local553 = Static20.aClass34_1.method796(local2765);
													if (local553 > local236) {
														local236 = local553;
													}
													local241 += Static20.aClass34_1.anInt1008 + 1;
												}
												local241 += 7;
												local236 += 6;
												local529 = local95 + local24.anInt4991 - local236 - 5;
												local553 = local24.anInt4935 + local100 + 5;
												if (local529 < local95 + 5) {
													local529 = local95 + 5;
												}
												if (arg7 < local553 + local241) {
													local553 = arg7 - local241;
												}
												if (local236 + local529 > arg6) {
													local529 = arg6 - local236;
												}
												Static217.aClass105_5.method4249(local529, local553, local236, local241, -96, 0);
												Static217.aClass105_5.method4275(local529, local553, local236, local241, -16777216, 0);
												local2746 = local24.aString193;
												local555 = local553 + Static20.aClass34_1.anInt1008 + 2;
												local2746 = Static301.method5229(local24, local2746);
												while (local2746.length() > 0) {
													local557 = local2746.indexOf("<br>");
													if (local557 == -1) {
														local2765 = local2746;
														local2746 = "";
													} else {
														local2765 = local2746.substring(0, local557);
														local2746 = local2746.substring(local557 + 4);
													}
													local2743.method3742(local555, -1, -16777216, local2765, local529 + 3);
													local555 += Static20.aClass34_1.anInt1008 + 1;
												}
											}
											if (local24.anInt4934 == 9) {
												if (local24.aBoolean407) {
													local498 = local100;
													local241 = local24.anInt4935 + local100;
													local899 = local24.anInt4991 + local95;
												} else {
													local241 = local100;
													local498 = local24.anInt4935 + local100;
													local899 = local95 + local24.anInt4991;
												}
												if (local24.anInt4983 == 1) {
													Static217.aClass105_5.method4283(local95, local241, local899, local498, local24.anInt4948, 0);
												} else {
													Static217.aClass105_5.method4305(local95, local241, local899, local498, local24.anInt4948, local24.anInt4983);
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

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLclient!lm;)V")
	public static void method4547(@OriginalArg(1) Class134 arg0) {
		Static229.aClass134_108 = arg0;
	}
}
