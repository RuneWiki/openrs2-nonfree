import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cc")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	public int anInt1385 = 99;

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(IIIZ)V")
	public Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static267.aClass37_3, Static543.aClass59_3);
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIII)Lclient!nf;")
	public Interface17 method1217(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Interface17 local10 = null;
		if (arg2 == 0) {
			local10 = (Interface17) Static454.method6134(arg3, arg0, arg1);
		}
		if (arg2 == 1) {
			local10 = (Interface17) Static47.method830(arg3, arg0, arg1);
		}
		if (arg2 == 2) {
			local10 = (Interface17) Static180.method2823(arg3, arg0, arg1, nf.class);
		}
		if (arg2 == 3) {
			local10 = (Interface17) Static609.method8264(arg3, arg0, arg1);
		}
		return local10;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIBLclient!eq;ILclient!ha;I)V")
	public void method1218(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class110 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) int arg5) {
		@Pc(16) Interface17 local16 = this.method1217(arg1, arg0, arg3, arg5);
		if (local16 == null) {
			return;
		}
		@Pc(25) Class216 local25 = Static466.aClass340_6.method7665(local16.method6661());
		@Pc(29) int local29 = local16.method6662();
		@Pc(33) int local33 = local16.method6659();
		if (local25.method5042()) {
			Static179.method7837(arg0, arg5, arg1, local25);
		}
		if (local16.method6657()) {
			local16.method6660(arg4);
		}
		if (arg3 != 0) {
			if (arg3 == 1) {
				Static99.method1637(arg5, arg1, arg0);
			} else if (arg3 == 2) {
				Static343.method4997(arg5, arg1, arg0, nf.class);
				if (local25.anInt5972 != 0 && super.anInt1373 > local25.anInt5947 + arg1 && super.anInt1379 > local25.anInt5947 + arg0 && super.anInt1373 > local25.anInt5949 + arg1 && super.anInt1379 > local25.anInt5949 + arg0) {
					arg2.method2361(local25.anInt5949, arg0, local25.anInt5947, !local25.aBoolean412, arg1, local33, local25.aBoolean401);
				}
				if (local29 == 9) {
					if ((local33 & 0x1) != 0) {
						Static179.method7843(16, arg5, arg1, arg0);
						return;
					}
					Static179.method7843(8, arg5, arg1, arg0);
					return;
				}
				return;
			} else if (arg3 == 3) {
				Static118.method7915(arg5, arg1, arg0);
				if (local25.anInt5972 == 1) {
					arg2.method2376(arg0, arg1);
					return;
				}
			}
			return;
		}
		Static629.method8502(arg5, arg1, arg0);
		if (local25.anInt5972 != 0) {
			arg2.method2373(arg1, arg0, !local25.aBoolean412, local25.aBoolean401, local29, local33);
		}
		if (local25.anInt5945 != 1) {
			return;
		}
		if (local33 == 0) {
			Static179.method7843(1, arg5, arg1, arg0);
			return;
		}
		if (local33 == 1) {
			Static179.method7843(2, arg5, arg1, arg0 + 1);
			return;
		}
		if (local33 == 2) {
			Static179.method7843(1, arg5, arg1 + 1, arg0);
		} else if (local33 == 3) {
			Static179.method7843(2, arg5, arg1, arg0);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIILclient!ha;Lclient!dt;[I)V")
	public void method1220(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class95 arg2, @OriginalArg(4) Class3_Sub4 arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean98) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class382 local13 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			@Pc(46) int local46;
			@Pc(107) int local107;
			@Pc(111) int local111;
			@Pc(53) int local53;
			@Pc(98) int local98;
			label306: do {
				while (true) {
					@Pc(32) int local32;
					@Pc(263) int local263;
					@Pc(267) int local267;
					while (arg3.aByteArray90.length > arg3.anInt9739) {
						local32 = arg3.method7954();
						if (local32 == 0) {
							local13 = new Class382(arg3);
						} else {
							if (local32 == 1) {
								local46 = arg3.method7954();
								continue label306;
							}
							if (local32 == 2) {
								if (local13 == null) {
									local13 = new Class382();
								}
								local13.method8763(arg3);
							} else if (local32 != 128) {
								if (local32 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray7 == null) {
									super.aByteArrayArrayArray7 = new byte[4][][];
								}
								for (local46 = 0; local46 < 4; local46++) {
									@Pc(221) byte local221 = arg3.method7960();
									if (local221 == 0 && super.aByteArrayArrayArray7[local46] != null) {
										local263 = arg1;
										local267 = arg1 + 64;
										local98 = arg0;
										if (local267 < 0) {
											local267 = 0;
										} else if (super.anInt1373 <= local267) {
											local267 = super.anInt1373;
										}
										local107 = arg0 + 64;
										if (arg0 < 0) {
											local98 = 0;
										} else if (arg0 >= super.anInt1379) {
											local98 = super.anInt1379;
										}
										if (arg1 < 0) {
											local263 = 0;
										} else if (arg1 >= super.anInt1373) {
											local263 = super.anInt1373;
										}
										if (local107 < 0) {
											local107 = 0;
										} else if (local107 >= super.anInt1379) {
											local107 = super.anInt1379;
										}
										while (local267 > local263) {
											while (local107 > local98) {
												super.aByteArrayArrayArray7[local46][local263][local98] = 0;
												local98++;
											}
											local263++;
										}
									} else if (local221 == 1) {
										if (super.aByteArrayArrayArray7[local46] == null) {
											super.aByteArrayArrayArray7[local46] = new byte[super.anInt1373 + 1][super.anInt1379 + 1];
										}
										for (local263 = 0; local263 < 64; local263 += 4) {
											for (local267 = 0; local267 < 64; local267 += 4) {
												@Pc(404) byte local404 = arg3.method7960();
												for (local107 = local263 + arg1; local107 < local263 + arg1 + 4; local107++) {
													for (local111 = arg0 + local267; local111 < arg0 + local267 + 4; local111++) {
														if (local107 >= 0 && super.anInt1373 > local107 && local111 >= 0 && super.anInt1379 > local111) {
															super.aByteArrayArrayArray7[local46][local107][local111] = local404;
														}
													}
												}
											}
										}
									} else if (local221 == 2) {
										if (super.aByteArrayArrayArray7[local46] == null) {
											super.aByteArrayArrayArray7[local46] = new byte[super.anInt1373 + 1][super.anInt1379 + 1];
										}
										if (local46 > 0) {
											local263 = arg1;
											local267 = arg1 + 64;
											local98 = arg0;
											local107 = arg0 + 64;
											if (arg1 < 0) {
												local263 = 0;
											} else if (arg1 >= super.anInt1373) {
												local263 = super.anInt1373;
											}
											if (local267 < 0) {
												local267 = 0;
											} else if (super.anInt1373 <= local267) {
												local267 = super.anInt1373;
											}
											if (arg0 < 0) {
												local98 = 0;
											} else if (super.anInt1379 <= arg0) {
												local98 = super.anInt1379;
											}
											if (local107 < 0) {
												local107 = 0;
											} else if (super.anInt1379 <= local107) {
												local107 = super.anInt1379;
											}
											while (local267 > local263) {
												while (local98 < local107) {
													super.aByteArrayArrayArray7[local46][local263][local98] = super.aByteArrayArrayArray7[local46 - 1][local263][local98];
													local98++;
												}
												local263++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg4 == null) {
								arg3.anInt9739 += 10;
							} else {
								arg4[0] = arg3.method7951();
								arg4[1] = arg3.method7918();
								arg4[2] = arg3.method7918();
								arg4[3] = arg3.method7918();
								arg4[4] = arg3.method7951();
							}
						}
					}
					if (local13 != null) {
						for (local32 = 0; local32 < 8; local32++) {
							for (local46 = 0; local46 < 8; local46++) {
								local53 = (arg1 >> 3) + local32;
								local263 = (arg0 >> 3) + local46;
								if (local53 >= 0 && local53 < super.anInt1373 >> 3 && local263 >= 0 && local263 < super.anInt1379 >> 3) {
									Static39.method751(local53, local13, local263);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray7 != null) {
						for (local32 = 0; local32 < 4; local32++) {
							if (super.aByteArrayArrayArray7[local32] != null) {
								for (local46 = 0; local46 < 16; local46++) {
									for (local53 = 0; local53 < 16; local53++) {
										local263 = (arg1 >> 2) + local46;
										local267 = (arg0 >> 2) + local53;
										if (local263 >= 0 && local263 < 26 && local267 >= 0 && local267 < 26) {
											super.aByteArrayArrayArray7[local32][local263][local267] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local46 <= 0);
			for (local53 = 0; local53 < local46; local53++) {
				@Pc(62) Class165 local62 = new Class165(arg2, arg3, 2);
				if (local62.anInt4509 == 31) {
					@Pc(73) Class363 local73 = Static148.aClass320_1.method7002(arg3.method7951());
					local62.method3853(local73.anInt10267, local73.anInt10268, local73.anInt10262, local73.anInt10261);
				}
				if (arg2.method8026() > 0) {
					@Pc(90) Class3_Sub13 local90 = local62.aClass3_Sub13_1;
					local98 = (arg1 << 9) + local90.method5958();
					local107 = local90.method5960() + (arg0 << 9);
					local111 = local98 >> 9;
					@Pc(115) int local115 = local107 >> 9;
					if (local111 >= 0 && local115 >= 0 && local111 < super.anInt1373 && local115 < super.anInt1379) {
						local90.method5964(local98, super.anIntArrayArrayArray9[local62.anInt4514][local111][local115] - local90.method5963(), local107);
						Static185.method2896(local62);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!eq;ILclient!ha;IIIIIIII)V")
	public void method1222(@OriginalArg(0) Class110 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class95 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (Static336.aClass3_Sub41_18.aClass14_Sub25_1.method6576() == 0 && !Static647.method8700(arg7, Static566.anInt9142, arg6, arg5)) {
			return;
		}
		if (arg3 < this.anInt1385) {
			this.anInt1385 = arg3;
		}
		@Pc(33) Class216 local33 = Static466.aClass340_6.method7665(arg4);
		if (Static336.aClass3_Sub41_18.aClass14_Sub8_1.method2916() == 0 && local33.aBoolean400) {
			return;
		}
		@Pc(54) int local54;
		@Pc(51) int local51;
		if (arg8 == 1 || arg8 == 3) {
			local51 = local33.anInt5947;
			local54 = local33.anInt5949;
		} else {
			local51 = local33.anInt5949;
			local54 = local33.anInt5947;
		}
		@Pc(75) int local75;
		@Pc(83) int local83;
		if (super.anInt1373 >= local54 + arg5) {
			local75 = arg5 + (local54 >> 1);
			local83 = arg5 + (local54 + 1 >> 1);
		} else {
			local83 = arg5 + 1;
			local75 = arg5;
		}
		@Pc(107) int local107;
		@Pc(115) int local115;
		if (arg7 + local51 <= super.anInt1379) {
			local107 = (local51 >> 1) + arg7;
			local115 = arg7 + (local51 + 1 >> 1);
		} else {
			local115 = arg7 + 1;
			local107 = arg7;
		}
		@Pc(135) Class35 local135 = Static582.aClass35Array3[arg6];
		@Pc(162) int local162 = local135.method7461(local107, local75) + local135.method7461(local107, local83) + local135.method7461(local115, local75) + local135.method7461(local115, local83) >> 2;
		@Pc(170) int local170 = (local54 << 8) + (arg5 << 9);
		@Pc(179) int local179 = (arg7 << 9) + (local51 << 8);
		@Pc(191) boolean local191 = Static335.aBoolean359 && !super.aBoolean98 && local33.aBoolean408;
		if (local33.method5042()) {
			Static266.method3928(arg8, arg3, local33, arg5, (Class34_Sub1_Sub1_Sub2_Sub2) null, arg7, (Class34_Sub1_Sub1_Sub2_Sub1) null);
		}
		@Pc(228) boolean local228 = arg1 == -1 && local33.anInt5942 == -1 && local33.anIntArray324 == null && local33.anIntArray325 == null && !local33.aBoolean406 && !local33.aBoolean399;
		if (Static36.aBoolean54 && (Static124.method1852(arg9) && local33.anInt5945 != 1 || !(!Static331.method4723(arg9) || local33.anInt5945 != 0))) {
			return;
		}
		if (arg9 != 22) {
			@Pc(374) Class34_Sub1_Sub1 local374;
			@Pc(342) Class34_Sub1_Sub1_Sub1 local342;
			@Pc(346) int local346;
			@Pc(440) int local440;
			if (arg9 == 10 || arg9 == 11) {
				local342 = null;
				if (local228) {
					@Pc(404) Class34_Sub1_Sub1_Sub1 local404 = new Class34_Sub1_Sub1_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg5, local54 + arg5 - 1, arg7, arg7 + local51 - 1, arg9, arg8, local191);
					local346 = local404.method933();
					local342 = local404;
					local374 = local404;
				} else {
					local346 = 15;
					local374 = new Class34_Sub1_Sub1_Sub4(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg5, local54 + arg5 - 1, arg7, local51 + arg7 - 1, arg9, arg8, arg1);
				}
				if (Static92.method1530(local374, false)) {
					if (local342 != null && local342.method6657()) {
						local342.method6663(arg2);
					}
					if (local33.aBoolean404 && Static335.aBoolean359) {
						if (local346 > 30) {
							local346 = 30;
						}
						for (local440 = 0; local440 <= local54; local440++) {
							for (@Pc(444) int local444 = 0; local444 <= local51; local444++) {
								local135.ka(arg5 + local440, arg7 + local444, local346);
							}
						}
					}
				}
				if (local33.anInt5972 != 0 && arg0 != null) {
					arg0.method2371(arg5, !local33.aBoolean412, local33.aBoolean401, arg7, local51, local54);
				}
			} else if (arg9 >= 12 && arg9 <= 17 || arg9 >= 18 && arg9 <= 21) {
				if (local228) {
					local342 = new Class34_Sub1_Sub1_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg5, arg5 + local54 - 1, arg7, local51 + arg7 - 1, arg9, arg8, local191);
					local374 = local342;
					if (local342.method6657()) {
						local342.method6663(arg2);
					}
				} else {
					local374 = new Class34_Sub1_Sub1_Sub4(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg5, arg5 + local54 - 1, arg7, local51 + arg7 - 1, arg9, arg8, arg1);
				}
				Static92.method1530(local374, false);
				if (Static335.aBoolean359 && !super.aBoolean98 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg3 > 0 && local33.anInt5945 != 0) {
					super.aByteArrayArrayArray9[arg3][arg5][arg7] = (byte) (super.aByteArrayArrayArray9[arg3][arg5][arg7] | 0x4);
				}
				if (local33.anInt5972 != 0 && arg0 != null) {
					arg0.method2371(arg5, !local33.aBoolean412, local33.aBoolean401, arg7, local51, local54);
				}
			} else {
				@Pc(680) Class34_Sub1_Sub5 local680;
				if (arg9 == 0) {
					@Pc(652) int local652 = local33.anInt5945;
					if (Static394.aBoolean452 && local33.anInt5945 == -1) {
						local652 = 1;
					}
					if (local228) {
						@Pc(678) Class34_Sub1_Sub5_Sub2 local678 = new Class34_Sub1_Sub5_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg9, arg8, local191);
						local680 = local678;
						if (local678.method6657()) {
							local678.method6663(arg2);
						}
					} else {
						local680 = new Class34_Sub1_Sub5_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg9, arg8, arg1);
					}
					Static627.method8479(arg3, arg5, arg7, local680, (Class34_Sub1_Sub5) null);
					if (arg8 == 0) {
						if (Static335.aBoolean359 && local33.aBoolean404) {
							local135.ka(arg5, arg7, 50);
							local135.ka(arg5, arg7 + 1, 50);
						}
						if (local652 == 1 && !super.aBoolean98) {
							Static277.method4060(local33.anInt5959, local33.anInt5984, arg5, arg7, 1, arg3);
						}
					} else if (arg8 == 1) {
						if (Static335.aBoolean359 && local33.aBoolean404) {
							local135.ka(arg5, arg7 + 1, 50);
							local135.ka(arg5 + 1, arg7 + 1, 50);
						}
						if (local652 == 1 && !super.aBoolean98) {
							Static277.method4060(-local33.anInt5959, local33.anInt5984, arg5, arg7 + 1, 2, arg3);
						}
					} else if (arg8 == 2) {
						if (Static335.aBoolean359 && local33.aBoolean404) {
							local135.ka(arg5 + 1, arg7, 50);
							local135.ka(arg5 + 1, arg7 + 1, 50);
						}
						if (local652 == 1 && !super.aBoolean98) {
							Static277.method4060(-local33.anInt5959, local33.anInt5984, arg5 + 1, arg7, 1, arg3);
						}
					} else if (arg8 == 3) {
						if (Static335.aBoolean359 && local33.aBoolean404) {
							local135.ka(arg5, arg7, 50);
							local135.ka(arg5 + 1, arg7, 50);
						}
						if (local652 == 1 && !super.aBoolean98) {
							Static277.method4060(local33.anInt5959, local33.anInt5984, arg5, arg7, 2, arg3);
						}
					}
					if (local33.anInt5972 != 0 && arg0 != null) {
						arg0.method2368(arg7, !local33.aBoolean412, arg9, arg5, arg8, local33.aBoolean401);
					}
					if (local33.anInt5974 != 64) {
						Static347.method5035(arg3, arg5, arg7, local33.anInt5974);
					}
				} else {
					@Pc(942) Class34_Sub1_Sub5 local942;
					@Pc(940) Class34_Sub1_Sub5_Sub2 local940;
					if (arg9 == 1) {
						if (local228) {
							local940 = new Class34_Sub1_Sub5_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg9, arg8, local191);
							local942 = local940;
							if (local940.method6657()) {
								local940.method6663(arg2);
							}
						} else {
							local942 = new Class34_Sub1_Sub5_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg9, arg8, arg1);
						}
						Static627.method8479(arg3, arg5, arg7, local942, (Class34_Sub1_Sub5) null);
						if (local33.aBoolean404 && Static335.aBoolean359) {
							if (arg8 == 0) {
								local135.ka(arg5, arg7 + 1, 50);
							} else if (arg8 == 1) {
								local135.ka(arg5 + 1, arg7 + 1, 50);
							} else if (arg8 == 2) {
								local135.ka(arg5 + 1, arg7, 50);
							} else if (arg8 == 3) {
								local135.ka(arg5, arg7, 50);
							}
						}
						if (local33.anInt5972 != 0 && arg0 != null) {
							arg0.method2368(arg7, !local33.aBoolean412, arg9, arg5, arg8, local33.aBoolean401);
						}
					} else if (arg9 == 2) {
						local346 = arg8 + 1 & 0x3;
						if (local228) {
							@Pc(1079) Class34_Sub1_Sub5_Sub2 local1079 = new Class34_Sub1_Sub5_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg9, arg8 + 4, local191);
							@Pc(1095) Class34_Sub1_Sub5_Sub2 local1095 = new Class34_Sub1_Sub5_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg9, local346, local191);
							if (local1079.method6657()) {
								local1079.method6663(arg2);
							}
							local680 = local1095;
							if (local1095.method6657()) {
								local1095.method6663(arg2);
							}
							local942 = local1079;
						} else {
							local942 = new Class34_Sub1_Sub5_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg9, arg8 + 4, arg1);
							local680 = new Class34_Sub1_Sub5_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg9, local346, arg1);
						}
						Static627.method8479(arg3, arg5, arg7, local942, local680);
						if ((local33.anInt5945 == 1 || Static394.aBoolean452 && local33.anInt5945 == -1) && !super.aBoolean98) {
							if (arg8 == 0) {
								Static277.method4060(local33.anInt5959, local33.anInt5984, arg5, arg7, 1, arg3);
								Static277.method4060(local33.anInt5959, local33.anInt5984, arg5, arg7 + 1, 2, arg3);
							} else if (arg8 == 1) {
								Static277.method4060(local33.anInt5959, local33.anInt5984, arg5 + 1, arg7, 1, arg3);
								Static277.method4060(local33.anInt5959, local33.anInt5984, arg5, arg7 + 1, 2, arg3);
							} else if (arg8 == 2) {
								Static277.method4060(local33.anInt5959, local33.anInt5984, arg5 + 1, arg7, 1, arg3);
								Static277.method4060(local33.anInt5959, local33.anInt5984, arg5, arg7, 2, arg3);
							} else if (arg8 == 3) {
								Static277.method4060(local33.anInt5959, local33.anInt5984, arg5, arg7, 1, arg3);
								Static277.method4060(local33.anInt5959, local33.anInt5984, arg5, arg7, 2, arg3);
							}
						}
						if (local33.anInt5972 != 0 && arg0 != null) {
							arg0.method2368(arg7, !local33.aBoolean412, arg9, arg5, arg8, local33.aBoolean401);
						}
						if (local33.anInt5974 != 64) {
							Static347.method5035(arg3, arg5, arg7, local33.anInt5974);
						}
					} else if (arg9 == 3) {
						if (local228) {
							local940 = new Class34_Sub1_Sub5_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg9, arg8, local191);
							local942 = local940;
							if (local940.method6657()) {
								local940.method6663(arg2);
							}
						} else {
							local942 = new Class34_Sub1_Sub5_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg9, arg8, arg1);
						}
						Static627.method8479(arg3, arg5, arg7, local942, (Class34_Sub1_Sub5) null);
						if (local33.aBoolean404 && Static335.aBoolean359) {
							if (arg8 == 0) {
								local135.ka(arg5, arg7 + 1, 50);
							} else if (arg8 == 1) {
								local135.ka(arg5 + 1, arg7 + 1, 50);
							} else if (arg8 == 2) {
								local135.ka(arg5 + 1, arg7, 50);
							} else if (arg8 == 3) {
								local135.ka(arg5, arg7, 50);
							}
						}
						if (local33.anInt5972 != 0 && arg0 != null) {
							arg0.method2368(arg7, !local33.aBoolean412, arg9, arg5, arg8, local33.aBoolean401);
						}
					} else if (arg9 == 9) {
						if (local228) {
							local342 = new Class34_Sub1_Sub1_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg5, arg5, arg7, arg7, arg9, arg8, local191);
							local374 = local342;
							if (local342.method6657()) {
								local342.method6663(arg2);
							}
						} else {
							local374 = new Class34_Sub1_Sub1_Sub4(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg5, arg5 + local54 - 1, arg7, local51 + arg7 - 1, arg9, arg8, arg1);
						}
						Static92.method1530(local374, false);
						if (local33.anInt5945 == 1 && !super.aBoolean98) {
							@Pc(1531) byte local1531;
							if ((arg8 & 0x1) == 0) {
								local1531 = 8;
							} else {
								local1531 = 16;
							}
							Static277.method4060(0, local33.anInt5984, arg5, arg7, local1531, arg3);
						}
						if (local33.anInt5972 != 0 && arg0 != null) {
							arg0.method2371(arg5, !local33.aBoolean412, local33.aBoolean401, arg7, local51, local54);
						}
						if (local33.anInt5974 != 64) {
							Static347.method5035(arg3, arg5, arg7, local33.anInt5974);
						}
					} else {
						@Pc(1612) Class34_Sub1_Sub3 local1612;
						if (arg9 == 4) {
							if (local228) {
								@Pc(1602) Class34_Sub1_Sub3_Sub1 local1602 = new Class34_Sub1_Sub3_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, 0, 0, arg9, arg8);
								if (local1602.method6657()) {
									local1602.method6663(arg2);
								}
								local1612 = local1602;
							} else {
								local1612 = new Class34_Sub1_Sub3_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, 0, 0, arg9, arg8, arg1);
							}
							Static663.method8842(arg3, arg5, arg7, local1612, (Class34_Sub1_Sub3) null);
						} else {
							@Pc(1646) int local1646;
							@Pc(1652) Interface17 local1652;
							@Pc(1719) Class34_Sub1_Sub3_Sub1 local1719;
							if (arg9 == 5) {
								local1646 = 65;
								local1652 = (Interface17) Static454.method6134(arg3, arg5, arg7);
								if (local1652 != null) {
									local1646 = Static466.aClass340_6.method7665(local1652.method6661()).anInt5974 + 1;
								}
								if (local228) {
									local1719 = new Class34_Sub1_Sub3_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, local1646 * Static164.anIntArray156[arg8], local1646 * Static167.anIntArray157[arg8], arg9, arg8);
									local1612 = local1719;
									if (local1719.method6657()) {
										local1719.method6663(arg2);
									}
								} else {
									local1612 = new Class34_Sub1_Sub3_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, local1646 * Static164.anIntArray156[arg8], Static167.anIntArray157[arg8] * local1646, arg9, arg8, arg1);
								}
								Static663.method8842(arg3, arg5, arg7, local1612, (Class34_Sub1_Sub3) null);
							} else if (arg9 == 6) {
								local1646 = 33;
								local1652 = (Interface17) Static454.method6134(arg3, arg5, arg7);
								if (local1652 != null) {
									local1646 = Static466.aClass340_6.method7665(local1652.method6661()).anInt5974 / 2 + 1;
								}
								if (local228) {
									local1719 = new Class34_Sub1_Sub3_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, local1646 * Static164.anIntArray156[arg8], local1646 * Static167.anIntArray157[arg8], arg9, arg8 + 4);
									local1612 = local1719;
									if (local1719.method6657()) {
										local1719.method6663(arg2);
									}
								} else {
									local1612 = new Class34_Sub1_Sub3_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, Static129.anIntArray563[arg8] * local1646, Static577.anIntArray503[arg8] * local1646, arg9, arg8 + 4, arg1);
								}
								Static663.method8842(arg3, arg5, arg7, local1612, (Class34_Sub1_Sub3) null);
							} else if (arg9 == 7) {
								local1646 = arg8 + 2 & 0x3;
								if (local228) {
									@Pc(1867) Class34_Sub1_Sub3_Sub1 local1867 = new Class34_Sub1_Sub3_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, 0, 0, arg9, local1646 + 4);
									if (local1867.method6657()) {
										local1867.method6663(arg2);
									}
									local1612 = local1867;
								} else {
									local1612 = new Class34_Sub1_Sub3_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, 0, 0, arg9, local1646 + 4, arg1);
								}
								Static663.method8842(arg3, arg5, arg7, local1612, (Class34_Sub1_Sub3) null);
							} else if (arg9 == 8) {
								local346 = arg8 + 2 & 0x3;
								local440 = 33;
								@Pc(1925) Interface17 local1925 = (Interface17) Static454.method6134(arg3, arg5, arg7);
								if (local1925 != null) {
									local440 = Static466.aClass340_6.method7665(local1925.method6661()).anInt5974 / 2 + 1;
								}
								@Pc(1968) Class34_Sub1_Sub3 local1968;
								@Pc(1987) Class34_Sub1_Sub3 local1987;
								if (local228) {
									local1968 = new Class34_Sub1_Sub3_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, Static129.anIntArray563[arg8] * local440, local440 * Static577.anIntArray503[arg8], arg9, arg8 + 4);
									local1987 = new Class34_Sub1_Sub3_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, 0, 0, arg9, local346 + 4);
									if (local1968.method6657()) {
										local1968.method6663(arg2);
									}
									if (local1987.method6657()) {
										local1987.method6663(arg2);
									}
								} else {
									local1968 = new Class34_Sub1_Sub3_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, Static129.anIntArray563[arg8] * local440, Static577.anIntArray503[arg8] * local440, arg9, arg8 + 4, arg1);
									local1987 = new Class34_Sub1_Sub3_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, 0, 0, arg9, local346 + 4, arg1);
								}
								Static663.method8842(arg3, arg5, arg7, local1968, local1987);
							}
						}
					}
				}
			}
		} else if (Static336.aClass3_Sub41_18.aClass14_Sub23_1.method6428() != 0 || local33.anInt5978 != 0 || local33.anInt5972 == 1 || local33.aBoolean407) {
			@Pc(300) Class34_Sub1_Sub2 local300;
			if (local228) {
				@Pc(290) Class34_Sub1_Sub2_Sub1 local290 = new Class34_Sub1_Sub2_Sub1(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg8, local191);
				if (local290.method6657()) {
					local290.method6663(arg2);
				}
				local300 = local290;
			} else {
				local300 = new Class34_Sub1_Sub2_Sub2(arg2, local33, arg3, arg6, local170, local162, local179, super.aBoolean98, arg8, arg1);
			}
			Static544.method6988(arg3, arg5, arg7, local300);
			if (local33.anInt5972 == 1 && arg0 != null) {
				arg0.method2372(arg7, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(III[BLclient!ha;[Lclient!eq;IIIII)V")
	public void method1224(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class95 arg3, @OriginalArg(5) Class110[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class3_Sub4 local15 = new Class3_Sub4(arg2);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method7930();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method7896();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local15.method7954();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (local58 == arg9 && local54 >= arg8 && arg8 + 8 > local54 && arg0 <= local48 && local48 < arg0 + 8) {
					@Pc(106) Class216 local106 = Static466.aClass340_6.method7665(local17);
					@Pc(124) int local124 = arg1 + Static134.method2253(local106.anInt5949, arg7, local48 & 0x7, local106.anInt5947, local70, local54 & 0x7);
					@Pc(142) int local142 = arg5 + Static154.method5199(local106.anInt5947, local70, local106.anInt5949, local54 & 0x7, local48 & 0x7, arg7);
					if (local124 > 0 && local142 > 0 && local124 < super.anInt1373 - 1 && super.anInt1379 - 1 > local142) {
						@Pc(167) Class110 local167 = null;
						if (!super.aBoolean98) {
							@Pc(172) int local172 = arg6;
							if ((Static315.aByteArrayArrayArray13[1][local124][local142] & 0x2) == 2) {
								local172 = arg6 - 1;
							}
							if (local172 >= 0) {
								local167 = arg4[local172];
							}
						}
						this.method1222(local167, -1, arg3, arg6, local17, local124, arg6, local142, arg7 + local70 & 0x3, local66);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZBLclient!ha;)V")
	public void method1225(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class95 arg1) {
		Static632.method8578();
		if (!arg0) {
			@Pc(21) int local21;
			@Pc(25) int local25;
			if (super.anInt1366 > 1) {
				for (local21 = 0; local21 < super.anInt1373; local21++) {
					for (local25 = 0; super.anInt1379 > local25; local25++) {
						if ((Static315.aByteArrayArrayArray13[1][local21][local25] & 0x2) == 2) {
							Static262.method3911(local21, local25);
						}
					}
				}
			}
			for (local21 = 0; local21 < super.anInt1366; local21++) {
				for (local25 = 0; super.anInt1379 >= local25; local25++) {
					for (@Pc(67) int local67 = 0; super.anInt1373 >= local67; local67++) {
						if ((super.aByteArrayArrayArray9[local21][local67][local25] & 0x4) != 0) {
							@Pc(82) int local82 = local67;
							@Pc(84) int local84 = local67;
							@Pc(86) int local86 = local25;
							@Pc(88) int local88 = local25;
							while (local86 > 0 && (super.aByteArrayArrayArray9[local21][local67][local86 - 1] & 0x4) != 0 && local25 - local86 < 10) {
								local86--;
							}
							while (super.anInt1379 > local88 && (super.aByteArrayArrayArray9[local21][local67][local88 + 1] & 0x4) != 0 && local88 - local86 < 10) {
								local88++;
							}
							@Pc(151) int local151;
							label111: while (local82 > 0 && local67 - local82 < 10) {
								for (local151 = local86; local151 <= local88; local151++) {
									if ((super.aByteArrayArrayArray9[local21][local82 - 1][local151] & 0x4) == 0) {
										break label111;
									}
								}
								local82--;
							}
							label98: while (super.anInt1373 > local84 && local84 - local82 < 10) {
								for (local151 = local86; local151 <= local88; local151++) {
									if ((super.aByteArrayArrayArray9[local21][local84 + 1][local151] & 0x4) == 0) {
										break label98;
									}
								}
								local84++;
							}
							if ((local84 + 1 - local82) * (local88 + 1 - local86) >= 4) {
								local151 = super.anIntArrayArrayArray9[local21][local82][local86];
								Static329.method4683(local21, local86 << 9, (local88 << 9) + 512, local151, local151, (local84 << 9) + 512, local82 << 9);
								for (@Pc(274) int local274 = local82; local274 <= local84; local274++) {
									for (@Pc(278) int local278 = local86; local278 <= local88; local278++) {
										super.aByteArrayArrayArray9[local21][local274][local278] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static456.method6139();
		}
		super.aByteArrayArrayArray9 = null;
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "([BII[Lclient!eq;ILclient!ha;)V")
	public void method1227(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class110[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class95 arg4) {
		@Pc(20) Class3_Sub4 local20 = new Class3_Sub4(arg0);
		@Pc(22) int local22 = -1;
		while (true) {
			@Pc(26) int local26 = local20.method7930();
			if (local26 == 0) {
				return;
			}
			local22 += local26;
			@Pc(34) int local34 = 0;
			while (true) {
				@Pc(38) int local38 = local20.method7896();
				if (local38 == 0) {
					break;
				}
				local34 += local38 - 1;
				@Pc(53) int local53 = local34 & 0x3F;
				@Pc(59) int local59 = local34 >> 6 & 0x3F;
				@Pc(63) int local63 = local34 >> 12;
				@Pc(67) int local67 = local20.method7954();
				@Pc(71) int local71 = local67 >> 2;
				@Pc(75) int local75 = local67 & 0x3;
				@Pc(79) int local79 = arg1 + local59;
				@Pc(84) int local84 = local53 + arg3;
				if (local79 > 0 && local84 > 0 && super.anInt1373 - 1 > local79 && super.anInt1379 - 1 > local84) {
					@Pc(106) Class110 local106 = null;
					if (!super.aBoolean98) {
						@Pc(111) int local111 = local63;
						if ((Static315.aByteArrayArrayArray13[1][local79][local84] & 0x2) == 2) {
							local111 = local63 - 1;
						}
						if (local111 >= 0) {
							local106 = arg2[local111];
						}
					}
					this.method1222(local106, -1, arg4, local63, local22, local79, local63, local84, local75, local71);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!ha;IBIIII[IIILclient!dt;)V")
	public void method1228(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class3_Sub4 arg9) {
		if (super.aBoolean98) {
			return;
		}
		if (arg6 != null) {
			arg6[0] = -1;
		}
		@Pc(24) Class382 local24 = null;
		@Pc(30) int local30 = (arg1 & 0x7) * 8;
		@Pc(36) int local36 = (arg4 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(41) int local41;
						@Pc(73) int local73;
						@Pc(415) int local415;
						@Pc(109) int local109;
						while (arg9.anInt9739 < arg9.aByteArray90.length) {
							local41 = arg9.method7954();
							if (local41 == 0) {
								local24 = new Class382(arg9);
							} else {
								@Pc(243) int local243;
								@Pc(128) int local128;
								@Pc(132) int local132;
								@Pc(166) int local166;
								if (local41 == 1) {
									local73 = arg9.method7954();
									if (local73 > 0) {
										for (local415 = 0; local415 < local73; local415++) {
											@Pc(424) Class165 local424 = new Class165(arg0, arg9, 2);
											if (local424.anInt4509 == 31) {
												@Pc(437) Class363 local437 = Static148.aClass320_1.method7002(arg9.method7951());
												local424.method3853(local437.anInt10267, local437.anInt10268, local437.anInt10262, local437.anInt10261);
											}
											if (arg0.method8026() > 0) {
												@Pc(454) Class3_Sub13 local454 = local424.aClass3_Sub13_1;
												local243 = local454.method5958() >> 9;
												local128 = local454.method5960() >> 9;
												if (local424.anInt4514 == arg8 && local30 <= local243 && local30 + 8 > local243 && local36 <= local128 && local36 + 8 > local128) {
													local132 = Static44.method792(local454.method5958() & 0xFFF, arg7, local454.method5960() & 0xFFF) + (arg2 << 9);
													local243 = local132 >> 9;
													local166 = Static340.method4971(local454.method5958() & 0xFFF, arg7, local454.method5960() & 0xFFF) + (arg5 << 9);
													local128 = local166 >> 9;
													if (local243 >= 0 && local128 >= 0 && super.anInt1373 > local243 && local128 < super.anInt1379) {
														local454.method5964(local132, super.anIntArrayArrayArray9[arg8][local243][local128] - local454.method5963(), local166);
														Static185.method2896(local424);
													}
												}
											}
										}
									}
								} else if (local41 == 2) {
									if (local24 == null) {
										local24 = new Class382();
									}
									local24.method8763(arg9);
								} else if (local41 != 128) {
									if (local41 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray7 == null) {
										super.aByteArrayArrayArray7 = new byte[4][][];
									}
									for (local73 = 0; local73 < 4; local73++) {
										@Pc(79) byte local79 = arg9.method7960();
										@Pc(113) int local113;
										if (local79 == 0 && super.aByteArrayArrayArray7[arg3] != null) {
											if (arg8 >= local73) {
												local109 = arg2;
												local113 = arg2 + 7;
												local243 = arg5;
												if (local113 < 0) {
													local113 = 0;
												} else if (local113 >= super.anInt1373) {
													local113 = super.anInt1373;
												}
												if (arg2 < 0) {
													local109 = 0;
												} else if (arg2 >= super.anInt1373) {
													local109 = super.anInt1373;
												}
												local128 = arg5 + 7;
												if (arg5 < 0) {
													local243 = 0;
												} else if (arg5 >= super.anInt1379) {
													local243 = super.anInt1379;
												}
												if (local128 < 0) {
													local128 = 0;
												} else if (super.anInt1379 <= local128) {
													local128 = super.anInt1379;
												}
												while (local113 > local109) {
													while (local243 < local128) {
														super.aByteArrayArrayArray7[arg3][local109][local243] = 0;
														local243++;
													}
													local109++;
												}
											}
										} else if (local79 == 1) {
											if (super.aByteArrayArrayArray7[arg3] == null) {
												super.aByteArrayArrayArray7[arg3] = new byte[super.anInt1373 + 1][super.anInt1379 + 1];
											}
											for (local109 = 0; local109 < 64; local109 += 4) {
												for (local113 = 0; local113 < 64; local113 += 4) {
													@Pc(119) byte local119 = arg9.method7960();
													if (arg8 >= local73) {
														for (local128 = local109; local128 < local109 + 4; local128++) {
															for (local132 = local113; local132 < local113 + 4; local132++) {
																if (local128 >= local30 && local128 < local30 + 8 && local36 <= local132 && local36 + 8 > local36) {
																	local166 = arg2 + Static265.method3917(local128 & 0x7, arg7, local132 & 0x7);
																	@Pc(178) int local178 = Static351.method5104(local132 & 0x7, local128 & 0x7, arg7) + arg5;
																	if (local166 >= 0 && super.anInt1373 > local166 && local178 >= 0 && super.anInt1379 > local178) {
																		super.aByteArrayArrayArray7[arg3][local166][local178] = local119;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								} else if (arg6 == null) {
									arg9.anInt9739 += 10;
								} else {
									arg6[0] = arg9.method7951();
									arg6[1] = arg9.method7918();
									arg6[2] = arg9.method7918();
									arg6[3] = arg9.method7918();
									arg6[4] = arg9.method7951();
								}
							}
						}
						if (local24 != null) {
							Static39.method751(arg2 >> 3, local24, arg5 >> 3);
						}
						if (super.aByteArrayArrayArray7 != null && super.aByteArrayArrayArray7[arg3] != null) {
							local41 = arg2 + 7;
							local73 = arg5 + 7;
							for (local415 = arg2; local415 < local41; local415++) {
								for (local109 = arg5; local109 < local73; local109++) {
									super.aByteArrayArrayArray7[arg3][local415][local109] = 0;
								}
							}
							return;
						}
						return;
					}
				}
			}
		}
	}
}
