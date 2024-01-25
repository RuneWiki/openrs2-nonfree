import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static247 {

	@OriginalMember(owner = "client!pj", name = "Y", descriptor = "I")
	public static int anInt4953;

	@OriginalMember(owner = "client!pj", name = "S", descriptor = "I")
	public static int anInt4947 = 0;

	@OriginalMember(owner = "client!pj", name = "V", descriptor = "I")
	public static int anInt4950 = 0;

	@OriginalMember(owner = "client!pj", name = "g", descriptor = "(I)V")
	public static void method4418() {
		Static125.aClass5_Sub12_Sub2_3.method5125(239);
		Static125.aClass5_Sub12_Sub2_3.method5089(0);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method4419(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(I[SI[Ljava/lang/String;I)V")
	public static void method4421(@OriginalArg(1) short[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		@Pc(8) int local8 = (arg3 + arg1) / 2;
		@Pc(10) int local10 = arg1;
		@Pc(14) String local14 = arg2[local8];
		arg2[local8] = arg2[arg3];
		arg2[arg3] = local14;
		@Pc(28) short local28 = arg0[local8];
		arg0[local8] = arg0[arg3];
		arg0[arg3] = local28;
		for (@Pc(40) int local40 = arg1; local40 < arg3; local40++) {
			if (local14 == null || arg2[local40] != null && arg2[local40].compareTo(local14) < (local40 & 0x1)) {
				@Pc(60) String local60 = arg2[local40];
				arg2[local40] = arg2[local10];
				arg2[local10] = local60;
				@Pc(74) short local74 = arg0[local40];
				arg0[local40] = arg0[local10];
				arg0[local10++] = local74;
			}
		}
		arg2[arg3] = arg2[local10];
		arg2[local10] = local14;
		arg0[arg3] = arg0[local10];
		arg0[local10] = local28;
		method4421(arg0, arg1, arg2, local10 - 1);
		method4421(arg0, local10 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "()V")
	public static void method4422() {
		Static238.anInt4783 = 0;
		label187: for (@Pc(3) int local3 = 0; local3 < Static130.anInt5552; local3++) {
			@Pc(8) Class197 local8 = Static324.aClass197Array2[local3];
			@Pc(12) int local12;
			if (Static264.anIntArray497 != null) {
				for (local12 = 0; local12 < Static264.anIntArray497.length; local12++) {
					if (Static264.anIntArray497[local12] != -1000000 && (local8.anInt6277 <= Static264.anIntArray497[local12] || local8.anInt6280 <= Static264.anIntArray497[local12]) && (local8.anInt6292 <= Static291.anIntArray550[local12] || local8.anInt6290 <= Static291.anIntArray550[local12]) && (local8.anInt6292 >= Static43.anIntArray644[local12] || local8.anInt6290 >= Static43.anIntArray644[local12]) && (local8.anInt6289 <= Static348.anIntArray632[local12] || local8.anInt6283 <= Static348.anIntArray632[local12]) && (local8.anInt6289 >= Static2.anIntArray125[local12] || local8.anInt6283 >= Static2.anIntArray125[local12])) {
						continue label187;
					}
				}
			}
			@Pc(110) int local110;
			@Pc(121) int local121;
			@Pc(153) int local153;
			@Pc(132) boolean local132;
			if (local8.anInt6296 == 1) {
				local12 = local8.anInt6300 + Static257.anInt5067 - Static66.anInt5817;
				if (local12 >= 0 && local12 <= Static257.anInt5067 + Static257.anInt5067) {
					local110 = local8.anInt6284 + Static257.anInt5067 - Static150.anInt2937;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6286 + Static257.anInt5067 - Static150.anInt2937;
					if (local121 > Static257.anInt5067 + Static257.anInt5067) {
						local121 = Static257.anInt5067 + Static257.anInt5067;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static172.aBooleanArrayArray6[local12][local110++]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static300.anInt5860 - local8.anInt6292;
						if (local153 > 32) {
							local8.anInt6294 = 1;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt6294 = 2;
							local153 = -local153;
						}
						local8.anInt6287 = (local8.anInt6289 - Static168.anInt3377 << 8) / local153;
						local8.anInt6288 = (local8.anInt6283 - Static168.anInt3377 << 8) / local153;
						local8.anInt6279 = (local8.anInt6277 - Static35.anInt651 << 8) / local153;
						local8.anInt6282 = (local8.anInt6280 - Static35.anInt651 << 8) / local153;
						Static149.aClass197Array1[Static238.anInt4783++] = local8;
					}
				}
			} else if (local8.anInt6296 == 2) {
				local12 = local8.anInt6284 + Static257.anInt5067 - Static150.anInt2937;
				if (local12 >= 0 && local12 <= Static257.anInt5067 + Static257.anInt5067) {
					local110 = local8.anInt6300 + Static257.anInt5067 - Static66.anInt5817;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6281 + Static257.anInt5067 - Static66.anInt5817;
					if (local121 > Static257.anInt5067 + Static257.anInt5067) {
						local121 = Static257.anInt5067 + Static257.anInt5067;
					}
					local132 = false;
					while (local110 <= local121) {
						if (Static172.aBooleanArrayArray6[local110++][local12]) {
							local132 = true;
							break;
						}
					}
					if (local132) {
						local153 = Static168.anInt3377 - local8.anInt6289;
						if (local153 > 32) {
							local8.anInt6294 = 3;
						} else {
							if (local153 >= -32) {
								continue;
							}
							local8.anInt6294 = 4;
							local153 = -local153;
						}
						local8.anInt6285 = (local8.anInt6292 - Static300.anInt5860 << 8) / local153;
						local8.anInt6297 = (local8.anInt6290 - Static300.anInt5860 << 8) / local153;
						local8.anInt6279 = (local8.anInt6277 - Static35.anInt651 << 8) / local153;
						local8.anInt6282 = (local8.anInt6280 - Static35.anInt651 << 8) / local153;
						Static149.aClass197Array1[Static238.anInt4783++] = local8;
					}
				}
			} else if (local8.anInt6296 == 4) {
				local12 = local8.anInt6277 - Static35.anInt651;
				if (local12 > 128) {
					local110 = local8.anInt6284 + Static257.anInt5067 - Static150.anInt2937;
					if (local110 < 0) {
						local110 = 0;
					}
					local121 = local8.anInt6286 + Static257.anInt5067 - Static150.anInt2937;
					if (local121 > Static257.anInt5067 + Static257.anInt5067) {
						local121 = Static257.anInt5067 + Static257.anInt5067;
					}
					if (local110 <= local121) {
						@Pc(403) int local403 = local8.anInt6300 + Static257.anInt5067 - Static66.anInt5817;
						if (local403 < 0) {
							local403 = 0;
						}
						local153 = local8.anInt6281 + Static257.anInt5067 - Static66.anInt5817;
						if (local153 > Static257.anInt5067 + Static257.anInt5067) {
							local153 = Static257.anInt5067 + Static257.anInt5067;
						}
						@Pc(425) boolean local425 = false;
						label159: for (@Pc(427) int local427 = local403; local427 <= local153; local427++) {
							for (@Pc(430) int local430 = local110; local430 <= local121; local430++) {
								if (Static172.aBooleanArrayArray6[local427][local430]) {
									local425 = true;
									break label159;
								}
							}
						}
						if (local425) {
							local8.anInt6294 = 5;
							local8.anInt6285 = (local8.anInt6292 - Static300.anInt5860 << 8) / local12;
							local8.anInt6297 = (local8.anInt6290 - Static300.anInt5860 << 8) / local12;
							local8.anInt6287 = (local8.anInt6289 - Static168.anInt3377 << 8) / local12;
							local8.anInt6288 = (local8.anInt6283 - Static168.anInt3377 << 8) / local12;
							Static149.aClass197Array1[Static238.anInt4783++] = local8;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIIIII)V")
	public static void method4423(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		Static109.anInt2061 = 0;
		@Pc(168) int local168;
		@Pc(211) int local211;
		@Pc(374) int local374;
		@Pc(487) int local487;
		@Pc(260) int local260;
		@Pc(272) int local272;
		@Pc(598) int local598;
		for (@Pc(9) int local9 = -1; local9 < Static133.anInt2579 + Static22.anInt472; local9++) {
			@Pc(13) Class106 local13 = null;
			@Pc(17) Class4_Sub5_Sub2 local17;
			if (local9 < 0) {
				local17 = Static192.aClass4_Sub5_Sub2_Sub1_2;
			} else if (local9 >= Static22.anInt472) {
				local17 = Static280.aClass4_Sub5_Sub2_Sub2Array1[Static95.anIntArray160[local9 - Static22.anInt472]];
				local13 = ((Class4_Sub5_Sub2_Sub2) local17).aClass106_1;
				if (local13.anIntArray326 != null) {
					local13 = local13.method2829();
					if (local13 == null) {
						continue;
					}
				}
			} else {
				local17 = Static62.aClass4_Sub5_Sub2_Sub1Array1[Static88.anIntArray137[local9]];
			}
			if (local17.anInt5406 >= 0) {
				Static77.method1407(arg3 >> 1, local17.method4803(), arg1 >> 1, local17);
				if (Static123.anIntArray224[0] >= 0) {
					if (local17.aString53 != null && (Static22.anInt472 <= local9 || anInt4950 == 0 || anInt4950 == 3 || anInt4950 == 1 && Static354.method6025(((Class4_Sub5_Sub2_Sub1) local17).aString40)) && Static109.anInt2061 < Static3.anInt6629) {
						Static3.anIntArray620[Static109.anInt2061] = Static268.aClass36_8.method640(local17.aString53) / 2;
						Static3.anIntArray624[Static109.anInt2061] = Static123.anIntArray224[0];
						Static3.anIntArray619[Static109.anInt2061] = Static123.anIntArray224[1];
						Static3.anIntArray623[Static109.anInt2061] = local17.anInt5355;
						Static3.anIntArray622[Static109.anInt2061] = local17.anInt5394;
						Static3.anIntArray621[Static109.anInt2061] = local17.anInt5368;
						Static3.aStringArray66[Static109.anInt2061] = local17.aString53;
						Static109.anInt2061++;
					}
					@Pc(155) Class95 local155 = Static254.aClass95Array13[0];
					local168 = Static123.anIntArray224[1] + arg2 - Math.max(Static268.aClass36_8.anInt728, local155.method5506());
					@Pc(179) Class95 local179;
					if (!local17.aBoolean447 && local17.anInt5359 > Static283.anInt5563) {
						local179 = Static254.aClass95Array13[1];
						if (local17 instanceof Class4_Sub5_Sub2_Sub2) {
							@Pc(185) Class4_Sub5_Sub2_Sub2 local185 = (Class4_Sub5_Sub2_Sub2) local17;
							@Pc(194) Class95[] local194 = (Class95[]) Static150.aClass109_35.method2857((long) local185.aClass106_1.anInt3141);
							if (local194 == null) {
								@Pc(203) Class100[] local203 = Static363.method2681(Static244.aClass93_93, local185.aClass106_1.anInt3141);
								if (local203 != null) {
									local194 = new Class95[local203.length];
									for (local211 = 0; local211 < local203.length; local211++) {
										local194[local211] = Static236.aClass55_9.method5229(local203[local211]);
									}
									Static150.aClass109_35.method2855((long) local185.aClass106_1.anInt3141, local194);
								}
							}
							if (local194 != null && local194.length == 2) {
								local155 = local194[0];
								local179 = local194[1];
							}
						}
						local260 = Static123.anIntArray224[0] + arg0 - (local155.method5503() >> 1);
						local155.method5491(local260, local168);
						local272 = local155.method5503() * local17.anInt5376 / 255;
						Static236.aClass55_9.method5162(local260, local168, local272 + local260, local168 - -local155.method5506());
						local179.method5491(local260, local168);
						Static236.aClass55_9.method5258(arg0, arg2, arg0 + arg3, arg1 + arg2);
					}
					local168 -= 2;
					if (!local17.aBoolean447) {
						if (Static283.anInt5563 < local17.anInt5393) {
							local179 = Static318.aClass95Array17[local17.aBoolean448 ? 2 : 0];
							@Pc(324) Class95 local324 = Static318.aClass95Array17[local17.aBoolean448 ? 3 : 1];
							if (local17 instanceof Class4_Sub5_Sub2_Sub2) {
								local272 = local13.anInt3153;
								if (local272 == -1) {
									local272 = local17.method4805().anInt2278;
								}
							} else {
								local272 = local17.method4805().anInt2278;
							}
							if (local272 != -1) {
								@Pc(359) Class95[] local359 = (Class95[]) Static35.aClass109_9.method2857((long) local272);
								if (local359 == null) {
									@Pc(366) Class100[] local366 = Static363.method2681(Static244.aClass93_93, local272);
									if (local366 != null) {
										local359 = new Class95[local366.length];
										for (local374 = 0; local374 < local366.length; local374++) {
											local359[local374] = Static236.aClass55_9.method5229(local366[local374]);
										}
										Static35.aClass109_9.method2855((long) local272, local359);
									}
								}
								if (local359 != null && local359.length == 4) {
									local324 = local359[local17.aBoolean448 ? 3 : 1];
									local179 = local359[local17.aBoolean448 ? 2 : 0];
								}
							}
							@Pc(426) int local426 = local17.anInt5393 - Static283.anInt5563;
							if (local426 <= local17.anInt5375) {
								local211 = local179.method5503();
							} else {
								local426 -= local17.anInt5375;
								local374 = local17.anInt5352 == 0 ? 0 : local17.anInt5352 * ((local17.anInt5379 - local426) / local17.anInt5352);
								local211 = local179.method5503() * local374 / local17.anInt5379;
							}
							local374 = local179.method5506();
							local168 -= local374;
							local487 = arg0 + Static123.anIntArray224[0] - (local179.method5503() >> 1);
							local179.method5491(local487, local168);
							Static236.aClass55_9.method5162(local487, local168, local211 + local487, local374 + local168);
							local324.method5491(local487, local168);
							local168 -= 2;
							Static236.aClass55_9.method5258(arg0, arg2, arg0 + arg3, arg1 + arg2);
						}
						if (local9 < Static22.anInt472) {
							@Pc(522) Class4_Sub5_Sub2_Sub1 local522 = (Class4_Sub5_Sub2_Sub1) local17;
							if (local522.anInt4571 != -1) {
								local168 -= 25;
								Static124.aClass95Array8[local522.anInt4571].method5491(arg0 + Static123.anIntArray224[0] - 12, local168);
								local168 -= 2;
							}
							if (local522.anInt4567 != -1) {
								local168 -= 25;
								Static144.aClass95Array10[local522.anInt4567].method5491(arg0 + Static123.anIntArray224[0] - 12, local168);
								local168 -= 2;
							}
						} else if (local13.anInt3151 >= 0 && local13.anInt3151 < Static144.aClass95Array10.length) {
							local179 = Static144.aClass95Array10[local13.anInt3151];
							local168 -= 25;
							local179.method5491(arg0 + Static123.anIntArray224[0] - (local179.method5503() >> 1), local168);
							local168 -= 2;
						}
					}
					@Pc(600) Class131[] local600;
					@Pc(608) Class131 local608;
					@Pc(632) Class95 local632;
					if (!(local17 instanceof Class4_Sub5_Sub2_Sub1)) {
						local598 = 0;
						local600 = Static149.aClass131Array1;
						for (local272 = 0; local272 < local600.length; local272++) {
							local608 = local600[local272];
							if (local608 != null && local608.anInt3892 == 1 && local608.anInt3886 == Static95.anIntArray160[local9 - Static22.anInt472]) {
								local632 = Static50.aClass95Array5[local608.anInt3889];
								if (local598 < local632.method5506()) {
									local598 = local632.method5506();
								}
								if (Static283.anInt5563 % 20 < 10) {
									local632.method5491(Static123.anIntArray224[0] + arg0 - 12, -local632.method5506() + local168);
								}
							}
						}
						if (local598 > 0) {
						}
					} else if (local9 >= 0) {
						local598 = 0;
						local600 = Static149.aClass131Array1;
						for (local272 = 0; local272 < local600.length; local272++) {
							local608 = local600[local272];
							if (local608 != null && local608.anInt3892 == 10 && Static88.anIntArray137[local9] == local608.anInt3886) {
								local632 = Static50.aClass95Array5[local608.anInt3889];
								if (local632.method5506() > local598) {
									local598 = local632.method5506();
								}
								local632.method5491(arg0 + Static123.anIntArray224[0] - 12, local168 - local632.method5506());
							}
						}
						if (local598 > 0) {
						}
					}
					for (local598 = 0; local598 < 4; local598++) {
						if (local17.anIntArray519[local598] > Static283.anInt5563) {
							local260 = local17.method4803() / 2;
							Static77.method1407(arg3 >> 1, local260, arg1 >> 1, local17);
							if (Static123.anIntArray224[0] > -1) {
								if (local598 == 1) {
									Static123.anIntArray224[1] -= 20;
								}
								if (local598 == 2) {
									Static123.anIntArray224[1] -= 10;
									Static123.anIntArray224[0] -= 15;
								}
								if (local598 == 3) {
									Static123.anIntArray224[1] -= 10;
									Static123.anIntArray224[0] += 15;
								}
								Static11.aClass95Array2[local17.anIntArray521[local598]].method5491(arg0 + Static123.anIntArray224[0] - 12, arg2 - -Static123.anIntArray224[1] - 12);
								Static355.aClass18_4.method4172(0, Integer.toString(local17.anIntArray517[local598]), -1, arg0 + Static123.anIntArray224[0] - 1, Static123.anIntArray224[1] + 3 + arg2);
							}
						}
					}
				}
			}
		}
		@Pc(920) int local920;
		for (@Pc(914) int local914 = 0; local914 < Static42.anInt735; local914++) {
			local920 = Static53.anIntArray91[local914];
			@Pc(931) Class4_Sub5_Sub2 local931;
			if (local920 >= 2048) {
				local931 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local920 - 2048];
			} else {
				local931 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local920];
			}
			local598 = Static178.anIntArray358[local914];
			@Pc(952) Class4_Sub5_Sub2 local952;
			if (local598 >= 2048) {
				local952 = Static280.aClass4_Sub5_Sub2_Sub2Array1[local598 - 2048];
			} else {
				local952 = Static62.aClass4_Sub5_Sub2_Sub1Array1[local598];
			}
			Static131.method2336(arg0, local952, --local931.anInt5363, arg1, local931, arg3, arg2);
		}
		local920 = Static268.aClass36_8.anInt737 + Static268.aClass36_8.anInt728 + 2;
		for (local168 = 0; local168 < Static109.anInt2061; local168++) {
			local598 = Static3.anIntArray624[local168];
			local260 = Static3.anIntArray619[local168];
			local272 = Static3.anIntArray620[local168];
			@Pc(1005) boolean local1005 = true;
			while (local1005) {
				local1005 = false;
				for (local211 = 0; local211 < local168; local211++) {
					if (Static3.anIntArray619[local211] - local920 < local260 + 2 && Static3.anIntArray619[local211] + 2 > -local920 + local260 && Static3.anIntArray620[local211] + Static3.anIntArray624[local211] > local598 + -local272 && local598 + local272 > Static3.anIntArray624[local211] - Static3.anIntArray620[local211] && Static3.anIntArray619[local211] - local920 < local260) {
						local1005 = true;
						local260 = Static3.anIntArray619[local211] - local920;
					}
				}
			}
			Static3.anIntArray619[local168] = local260;
			@Pc(1094) String local1094 = Static3.aStringArray66[local168];
			if (Static275.anInt5464 == 0) {
				local374 = 16776960;
				if (Static3.anIntArray623[local168] < 6) {
					local374 = Static293.anIntArray552[Static3.anIntArray623[local168]];
				}
				if (Static3.anIntArray623[local168] == 6) {
					local374 = Static116.anInt2145 % 20 >= 10 ? 16776960 : 16711680;
				}
				if (Static3.anIntArray623[local168] == 7) {
					local374 = Static116.anInt2145 % 20 < 10 ? 255 : 65535;
				}
				if (Static3.anIntArray623[local168] == 8) {
					local374 = Static116.anInt2145 % 20 >= 10 ? 8454016 : 45056;
				}
				if (Static3.anIntArray623[local168] == 9) {
					local487 = 150 - Static3.anIntArray621[local168];
					if (local487 < 50) {
						local374 = local487 * 1280 + 16711680;
					} else if (local487 < 100) {
						local374 = 33160960 - local487 * 327680;
					} else if (local487 < 150) {
						local374 = (local487 - 100) * 5 + 65280;
					}
				}
				if (Static3.anIntArray623[local168] == 10) {
					local487 = 150 - Static3.anIntArray621[local168];
					if (local487 < 50) {
						local374 = local487 * 5 + 16711680;
					} else if (local487 < 100) {
						local374 = 16711935 - (local487 - 50) * 327680;
					} else if (local487 < 150) {
						local374 = local487 * 327680 - (local487 - 100) * 5 - 32767745;
					}
				}
				if (Static3.anIntArray623[local168] == 11) {
					local487 = 150 - Static3.anIntArray621[local168];
					if (local487 < 50) {
						local374 = 16777215 - local487 * 327685;
					} else if (local487 < 100) {
						local374 = local487 * 327685 + 65280 - 16384250;
					} else if (local487 < 150) {
						local374 = 16777215 - (local487 - 100) * 327680;
					}
				}
				local487 = local374 | 0xFF000000;
				if (Static3.anIntArray622[local168] == 0) {
					Static77.aClass18_1.method4172(-16777216, local1094, local487, local598 + arg0, local260 + arg2);
				}
				if (Static3.anIntArray622[local168] == 1) {
					Static77.aClass18_1.method4182(arg2 + local260, local1094, local487, Static116.anInt2145, arg0 + local598);
				}
				if (Static3.anIntArray622[local168] == 2) {
					Static77.aClass18_1.method4175(arg0 + local598, Static116.anInt2145, local487, local260 + arg2, local1094);
				}
				if (Static3.anIntArray622[local168] == 3) {
					Static77.aClass18_1.method4186(local487, arg2 + local260, local1094, Static116.anInt2145, local598 + arg0, -Static3.anIntArray621[local168] + 150);
				}
				@Pc(1432) int local1432;
				if (Static3.anIntArray622[local168] == 4) {
					local1432 = (150 - Static3.anIntArray621[local168]) * (Static268.aClass36_8.method640(local1094) + 100) / 150;
					Static236.aClass55_9.method5162(arg0 + local598 - 50, arg2, arg0 + local598 + 50, arg2 + arg1);
					Static77.aClass18_1.method4174(local598 + arg0 + 50 - local1432, local487, local260 + arg2, -16777216, local1094);
					Static236.aClass55_9.method5258(arg0, arg2, arg0 + arg3, arg1 + arg2);
				}
				if (Static3.anIntArray622[local168] == 5) {
					local1432 = 150 - Static3.anIntArray621[local168];
					@Pc(1491) int local1491 = 0;
					if (local1432 < 25) {
						local1491 = local1432 - 25;
					} else if (local1432 > 125) {
						local1491 = local1432 - 125;
					}
					@Pc(1515) int local1515 = Static268.aClass36_8.anInt737 + Static268.aClass36_8.anInt728;
					Static236.aClass55_9.method5162(arg0, arg2 + local260 - local1515 - 1, arg0 + arg3, local260 + arg2 + 5);
					Static77.aClass18_1.method4172(-16777216, local1094, local487, local598 + arg0, arg2 + local260 - -local1491);
					Static236.aClass55_9.method5258(arg0, arg2, arg3 + arg0, arg1 + arg2);
				}
			} else {
				Static77.aClass18_1.method4172(-16777216, local1094, -256, arg0 + local598, local260 + arg2);
			}
		}
	}
}
