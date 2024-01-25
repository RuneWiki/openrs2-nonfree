import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dw")
public final class Class70_Sub1 extends Class70 {

	@OriginalMember(owner = "client!dw", name = "K", descriptor = "I")
	public int anInt2476 = 99;

	@OriginalMember(owner = "client!dw", name = "<init>", descriptor = "(IIIZ)V")
	public Class70_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static31.aClass305_1, Static545.aClass201_5);
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!qh;IIZLclient!r;[I)V")
	public void method2212(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class43 arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean202) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class217 local13 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			@Pc(24) int local24;
			@Pc(68) int local68;
			@Pc(83) int local83;
			@Pc(87) int local87;
			@Pc(508) int local508;
			while (arg0.aByteArray36.length > arg0.anInt3520) {
				local24 = arg0.method3118();
				if (local24 == 0) {
					local13 = new Class217(arg0);
				} else {
					@Pc(113) int local113;
					@Pc(377) int local377;
					@Pc(89) int local89;
					if (local24 == 1) {
						local68 = arg0.method3118();
						if (local68 > 0) {
							for (local508 = 0; local508 < local68; local508++) {
								@Pc(517) Class258 local517 = new Class258(arg3, arg0, 2);
								if (local517.anInt6855 == 31) {
									@Pc(530) Class44 local530 = Static483.aClass2_1.method9(arg0.method3109());
									local517.method5869(local530.anInt1708, local530.anInt1709, local530.anInt1710, local530.anInt1711);
								}
								if (arg3.method7159() > 0) {
									@Pc(550) Class3_Sub22 local550 = local517.aClass3_Sub22_2;
									local89 = (arg2 << 9) + local550.method6731();
									local113 = (arg1 << 9) + local550.method6725();
									local377 = local89 >> 9;
									@Pc(574) int local574 = local113 >> 9;
									if (local377 >= 0 && local574 >= 0 && local377 < super.anInt2463 && local574 < super.anInt2468) {
										local550.method6727(super.anIntArrayArrayArray5[local517.anInt6859][local377][local574] - local550.method6728(), local89, local113);
										Static51.method841(local517);
									}
								}
							}
						}
					} else if (local24 == 2) {
						if (local13 == null) {
							local13 = new Class217();
						}
						local13.method5139(arg0);
					} else if (local24 != 128) {
						if (local24 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray14 == null) {
							super.aByteArrayArrayArray14 = new byte[4][][];
						}
						local11 = true;
						for (local68 = 0; local68 < 4; local68++) {
							@Pc(74) byte local74 = arg0.method3096();
							if (local74 == 0 && super.aByteArrayArrayArray14[local68] != null) {
								local83 = arg2;
								local87 = arg2 + 64;
								local89 = arg1;
								if (arg1 < 0) {
									local89 = 0;
								} else if (arg1 >= super.anInt2468) {
									local89 = super.anInt2468;
								}
								local113 = arg1 + 64;
								if (arg2 < 0) {
									local83 = 0;
								} else if (arg2 >= super.anInt2463) {
									local83 = super.anInt2463;
								}
								if (local87 < 0) {
									local87 = 0;
								} else if (super.anInt2463 <= local87) {
									local87 = super.anInt2463;
								}
								if (local113 < 0) {
									local113 = 0;
								} else if (super.anInt2468 <= local113) {
									local113 = super.anInt2468;
								}
								while (local83 < local87) {
									while (local113 > local89) {
										super.aByteArrayArrayArray14[local68][local83][local89] = 0;
										local89++;
									}
									local83++;
								}
							} else if (local74 == 1) {
								if (super.aByteArrayArrayArray14[local68] == null) {
									super.aByteArrayArrayArray14[local68] = new byte[super.anInt2463 + 1][super.anInt2468 + 1];
								}
								for (local83 = 0; local83 < 64; local83 += 4) {
									for (local87 = 0; local87 < 64; local87 += 4) {
										@Pc(365) byte local365 = arg0.method3096();
										for (local113 = local83 + arg2; local113 < arg2 + local83 + 4; local113++) {
											for (local377 = local87 + arg1; local377 < local87 + arg1 + 4; local377++) {
												if (local113 >= 0 && local113 < super.anInt2463 && local377 >= 0 && local377 < super.anInt2468) {
													super.aByteArrayArrayArray14[local68][local113][local377] = local365;
												}
											}
										}
									}
								}
							} else if (local74 == 2) {
								if (super.aByteArrayArrayArray14[local68] == null) {
									super.aByteArrayArrayArray14[local68] = new byte[super.anInt2463 + 1][super.anInt2468 + 1];
								}
								if (local68 > 0) {
									local83 = arg2;
									local87 = arg2 + 64;
									local89 = arg1;
									if (arg2 < 0) {
										local83 = 0;
									} else if (super.anInt2463 <= arg2) {
										local83 = super.anInt2463;
									}
									if (arg1 < 0) {
										local89 = 0;
									} else if (super.anInt2468 <= arg1) {
										local89 = super.anInt2468;
									}
									local113 = arg1 + 64;
									if (local87 < 0) {
										local87 = 0;
									} else if (super.anInt2463 <= local87) {
										local87 = super.anInt2463;
									}
									if (local113 < 0) {
										local113 = 0;
									} else if (local113 >= super.anInt2468) {
										local113 = super.anInt2468;
									}
									while (local87 > local83) {
										while (local113 > local89) {
											super.aByteArrayArrayArray14[local68][local83][local89] = super.aByteArrayArrayArray14[local68 - 1][local83][local89];
											local89++;
										}
										local83++;
									}
								}
							}
						}
					} else if (arg4 == null) {
						arg0.anInt3520 += 10;
					} else {
						arg4[0] = arg0.method3109();
						arg4[1] = arg0.method3107();
						arg4[2] = arg0.method3107();
						arg4[3] = arg0.method3107();
						arg4[4] = arg0.method3109();
					}
				}
			}
			if (local13 != null) {
				for (local24 = 0; local24 < 8; local24++) {
					for (local68 = 0; local68 < 8; local68++) {
						local508 = local24 + (arg2 >> 3);
						local83 = local68 + (arg1 >> 3);
						if (local508 >= 0 && super.anInt2463 >> 3 > local508 && local83 >= 0 && local83 < super.anInt2468 >> 3) {
							Static241.method4005(local13, local508, local83);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray14 != null) {
				for (local24 = 0; local24 < 4; local24++) {
					if (super.aByteArrayArrayArray14[local24] != null) {
						for (local68 = 0; local68 < 16; local68++) {
							for (local508 = 0; local508 < 16; local508++) {
								local83 = (arg2 >> 2) + local68;
								local87 = (arg1 >> 2) + local508;
								if (local83 >= 0 && local83 < 26 && local87 >= 0 && local87 < 26) {
									super.aByteArrayArrayArray14[local24][local83][local87] = 0;
								}
							}
						}
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IILclient!r;IILclient!fh;I)V")
	public void method2214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class95 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface22 local7 = null;
		if (arg1 == 0) {
			local7 = (Interface22) Static247.method4031(arg3, arg5, arg0);
		}
		if (arg1 == 1) {
			local7 = (Interface22) Static339.method5173(arg3, arg5, arg0);
		}
		if (arg1 == 2) {
			local7 = (Interface22) Static417.method5998(arg3, arg5, arg0, qu.class);
		}
		if (arg1 == 3) {
			local7 = (Interface22) Static168.method7472(arg3, arg5, arg0);
		}
		if (local7 == null) {
			return;
		}
		@Pc(62) Class23 local62 = Static476.aClass69_5.method2181(local7.method7088());
		@Pc(66) int local66 = local7.method7091();
		@Pc(70) int local70 = local7.method7093();
		if (local62.method577()) {
			Static548.method7333(local62, arg3, arg5, arg0);
		}
		if (local7.method7092()) {
			local7.method7089(arg2);
		}
		if (arg1 == 0) {
			Static168.method7476(arg3, arg5, arg0);
			if (local62.anInt770 != 0) {
				arg4.method2741(local62.aBoolean63, !local62.aBoolean69, arg5, arg0, local70, local66);
			}
			if (local62.anInt774 == 1) {
				if (local70 == 0) {
					Static350.method6849(arg3, arg0, arg5, 1);
				} else if (local70 == 1) {
					Static350.method6849(arg3, arg0 + 1, arg5, 2);
				} else if (local70 == 2) {
					Static350.method6849(arg3, arg0, arg5 + 1, 1);
				} else if (local70 == 3) {
					Static350.method6849(arg3, arg0, arg5, 2);
				}
			}
		} else if (arg1 == 1) {
			Static12.method130(arg3, arg5, arg0);
		} else if (arg1 == 2) {
			Static523.method7823(arg3, arg5, arg0, qu.class);
			if (local62.anInt770 != 0 && arg5 + local62.anInt739 < super.anInt2463 && arg0 + local62.anInt739 < super.anInt2468 && super.anInt2463 > local62.anInt744 + arg5 && local62.anInt744 + arg0 < super.anInt2468) {
				arg4.method2736(local62.anInt744, local70, !local62.aBoolean69, local62.aBoolean63, local62.anInt739, arg5, arg0);
			}
		} else if (arg1 == 3) {
			Static212.method3742(arg3, arg5, arg0);
			if (local62.anInt770 == 1) {
				arg4.method2738(arg5, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!r;[BIII[Lclient!fh;IIII)V")
	public void method2215(@OriginalArg(1) Class43 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class95[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class3_Sub11 local10 = new Class3_Sub11(arg1);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method3089();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method3138();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(46) int local46 = local27 & 0x3F;
				@Pc(52) int local52 = local27 >> 6 & 0x3F;
				@Pc(56) int local56 = local27 >> 12;
				@Pc(60) int local60 = local10.method3118();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				if (arg2 == local56 && local52 >= arg4 && arg4 + 8 > local52 && arg7 <= local46 && arg7 + 8 > local46) {
					@Pc(100) Class23 local100 = Static476.aClass69_5.method2181(local12);
					@Pc(120) int local120 = arg3 + Static21.method438(local46 & 0x7, arg6, local100.anInt739, local68, local100.anInt744, local52 & 0x7);
					@Pc(137) int local137 = arg8 + Static490.method6753(local46 & 0x7, arg6, local100.anInt739, local68, local100.anInt744, local52 & 0x7);
					if (local120 > 0 && local137 > 0 && local120 < super.anInt2463 - 1 && super.anInt2468 - 1 > local137) {
						@Pc(165) Class95 local165 = null;
						if (!super.aBoolean202) {
							@Pc(170) int local170 = arg9;
							if ((Static154.aByteArrayArrayArray15[1][local120][local137] & 0x2) == 2) {
								local170 = arg9 - 1;
							}
							if (local170 >= 0) {
								local165 = arg5[local170];
							}
						}
						this.method2216(arg9, local165, arg0, local120, local137, local12, local68 + arg6 & 0x3, local64, -1, arg9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(ILclient!fh;Lclient!r;IIIIIIII)V")
	public void method2216(@OriginalArg(0) int arg0, @OriginalArg(1) Class95 arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static278.aClass3_Sub13_Sub1_1.method4485(Static260.anInt4932) && !Static1.method6(Static65.anInt1778, arg9, arg4, arg3)) {
			return;
		}
		if (this.anInt2476 > arg0) {
			this.anInt2476 = arg0;
		}
		@Pc(30) Class23 local30 = Static476.aClass69_5.method2181(arg5);
		if (arg2.method7166() && Static278.aClass3_Sub13_Sub1_1.aBoolean410 && local30.aBoolean65) {
			return;
		}
		@Pc(51) int local51;
		@Pc(54) int local54;
		if (arg6 == 1 || arg6 == 3) {
			local54 = local30.anInt739;
			local51 = local30.anInt744;
		} else {
			local51 = local30.anInt739;
			local54 = local30.anInt744;
		}
		@Pc(83) int local83;
		@Pc(77) int local77;
		if (super.anInt2463 >= local51 + arg3) {
			local77 = arg3 + (local51 + 1 >> 1);
			local83 = (local51 >> 1) + arg3;
		} else {
			local77 = arg3 + 1;
			local83 = arg3;
		}
		@Pc(104) int local104;
		@Pc(108) int local108;
		if (arg4 + local54 > super.anInt2468) {
			local104 = arg4;
			local108 = arg4 + 1;
		} else {
			local104 = (local54 >> 1) + arg4;
			local108 = arg4 + (local54 + 1 >> 1);
		}
		@Pc(128) Class139 local128 = Static29.aClass139Array6[arg9];
		@Pc(155) int local155 = local128.method6889(local83, local104) + local128.method6889(local77, local104) + local128.method6889(local83, local108) + local128.method6889(local77, local108) >> 2;
		@Pc(163) int local163 = (arg3 << 9) + (local51 << 8);
		@Pc(171) int local171 = (local54 << 8) + (arg4 << 9);
		@Pc(183) boolean local183 = Static132.aBoolean242 && !super.aBoolean202 && local30.aBoolean64;
		if (local30.method577()) {
			Static238.method3980(arg0, null, arg3, arg6, null, local30, arg4);
		}
		@Pc(223) boolean local223 = arg8 == -1 && local30.anInt773 == -1 && local30.anIntArray77 == null && local30.anIntArray78 == null && !local30.aBoolean57;
		if (Static522.aBoolean640 && (Static292.method4652(arg7) && local30.anInt774 != 1 || !(!Static213.method3763(arg7) || local30.anInt774 != 0))) {
			return;
		}
		if (arg7 != 22) {
			@Pc(372) Class9_Sub1_Sub1 local372;
			@Pc(342) Class9_Sub1_Sub1_Sub1 local342;
			@Pc(374) int local374;
			@Pc(442) int local442;
			if (arg7 == 10 || arg7 == 11) {
				local342 = null;
				if (local223) {
					@Pc(404) Class9_Sub1_Sub1_Sub1 local404 = new Class9_Sub1_Sub1_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg3, local51 + arg3 - 1, arg4, local54 + arg4 - 1, arg7, arg6, local183);
					local342 = local404;
					local372 = local404;
					local374 = local404.method231();
				} else {
					local372 = new Class9_Sub1_Sub1_Sub5(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg3, local51 + arg3 - 1, arg4, local54 + arg4 - 1, arg7, arg6, arg8);
					local374 = 15;
				}
				if (Static216.method3774(local372, false)) {
					if (local342 != null && local342.method7092()) {
						local342.method7087(arg2);
					}
					if (local30.aBoolean56 && Static132.aBoolean242) {
						if (local374 > 30) {
							local374 = 30;
						}
						for (local442 = 0; local442 <= local51; local442++) {
							for (@Pc(446) int local446 = 0; local446 <= local54; local446++) {
								local128.a(arg3 + local442, local446 + arg4, local374);
							}
						}
					}
				}
				if (local30.anInt770 != 0 && arg1 != null) {
					arg1.method2746(local54, !local30.aBoolean69, local30.aBoolean63, local51, arg4, arg3);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local223) {
					local342 = new Class9_Sub1_Sub1_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg3, arg3 + local51 - 1, arg4, arg4 + local54 - 1, arg7, arg6, local183);
					if (local342.method7092()) {
						local342.method7087(arg2);
					}
					local372 = local342;
				} else {
					local372 = new Class9_Sub1_Sub1_Sub5(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg3, local51 + arg3 - 1, arg4, local54 + arg4 - 1, arg7, arg6, arg8);
				}
				Static216.method3774(local372, false);
				if (Static132.aBoolean242 && !super.aBoolean202 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg0 > 0 && local30.anInt774 != 0) {
					super.aByteArrayArrayArray10[arg0][arg3][arg4] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg4] | 0x4);
				}
				if (local30.anInt770 != 0 && arg1 != null) {
					arg1.method2746(local54, !local30.aBoolean69, local30.aBoolean63, local51, arg4, arg3);
				}
			} else {
				@Pc(687) Class9_Sub1_Sub4 local687;
				if (arg7 == 0) {
					@Pc(661) int local661 = local30.anInt774;
					if (Static270.aBoolean393 && local30.anInt774 == -1) {
						local661 = 1;
					}
					if (local223) {
						@Pc(705) Class9_Sub1_Sub4_Sub2 local705 = new Class9_Sub1_Sub4_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg7, arg6, local183);
						if (local705.method7092()) {
							local705.method7087(arg2);
						}
						local687 = local705;
					} else {
						local687 = new Class9_Sub1_Sub4_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg7, arg6, arg8);
					}
					Static127.method2546(arg0, arg3, arg4, local687, null);
					if (arg6 == 0) {
						if (Static132.aBoolean242 && local30.aBoolean56) {
							local128.a(arg3, arg4, 50);
							local128.a(arg3, arg4 + 1, 50);
						}
						if (local661 == 1 && !super.aBoolean202) {
							Static533.method6859(arg0, 1, arg3, local30.anInt779, arg4, local30.anInt782);
						}
					} else if (arg6 == 1) {
						if (Static132.aBoolean242 && local30.aBoolean56) {
							local128.a(arg3, arg4 + 1, 50);
							local128.a(arg3 + 1, arg4 + 1, 50);
						}
						if (local661 == 1 && !super.aBoolean202) {
							Static533.method6859(arg0, 2, arg3, local30.anInt779, arg4 + 1, -local30.anInt782);
						}
					} else if (arg6 == 2) {
						if (Static132.aBoolean242 && local30.aBoolean56) {
							local128.a(arg3 + 1, arg4, 50);
							local128.a(arg3 + 1, arg4 - -1, 50);
						}
						if (local661 == 1 && !super.aBoolean202) {
							Static533.method6859(arg0, 1, arg3 + 1, local30.anInt779, arg4, -local30.anInt782);
						}
					} else if (arg6 == 3) {
						if (Static132.aBoolean242 && local30.aBoolean56) {
							local128.a(arg3, arg4, 50);
							local128.a(arg3 + 1, arg4, 50);
						}
						if (local661 == 1 && !super.aBoolean202) {
							Static533.method6859(arg0, 2, arg3, local30.anInt779, arg4, local30.anInt782);
						}
					}
					if (local30.anInt770 != 0 && arg1 != null) {
						arg1.method2728(arg3, arg6, arg7, !local30.aBoolean69, arg4, local30.aBoolean63);
					}
					if (local30.anInt755 != 64) {
						Static300.method4728(arg0, arg3, arg4, local30.anInt755);
					}
				} else {
					@Pc(954) Class9_Sub1_Sub4_Sub2 local954;
					@Pc(956) Class9_Sub1_Sub4 local956;
					if (arg7 == 1) {
						if (local223) {
							local954 = new Class9_Sub1_Sub4_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg7, arg6, local183);
							local956 = local954;
							if (local954.method7092()) {
								local954.method7087(arg2);
							}
						} else {
							local956 = new Class9_Sub1_Sub4_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg7, arg6, arg8);
						}
						Static127.method2546(arg0, arg3, arg4, local956, null);
						if (local30.aBoolean56 && Static132.aBoolean242) {
							if (arg6 == 0) {
								local128.a(arg3, arg4 + 1, 50);
							} else if (arg6 == 1) {
								local128.a(arg3 + 1, arg4 + 1, 50);
							} else if (arg6 == 2) {
								local128.a(arg3 + 1, arg4, 50);
							} else if (arg6 == 3) {
								local128.a(arg3, arg4, 50);
							}
						}
						if (local30.anInt770 != 0 && arg1 != null) {
							arg1.method2728(arg3, arg6, arg7, !local30.aBoolean69, arg4, local30.aBoolean63);
						}
					} else if (arg7 == 2) {
						local374 = arg6 + 1 & 0x3;
						if (local223) {
							@Pc(1100) Class9_Sub1_Sub4_Sub2 local1100 = new Class9_Sub1_Sub4_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg7, arg6 + 4, local183);
							@Pc(1116) Class9_Sub1_Sub4_Sub2 local1116 = new Class9_Sub1_Sub4_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg7, local374, local183);
							if (local1100.method7092()) {
								local1100.method7087(arg2);
							}
							if (local1116.method7092()) {
								local1116.method7087(arg2);
							}
							local687 = local1116;
							local956 = local1100;
						} else {
							local956 = new Class9_Sub1_Sub4_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg7, arg6 + 4, arg8);
							local687 = new Class9_Sub1_Sub4_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg7, local374, arg8);
						}
						Static127.method2546(arg0, arg3, arg4, local956, local687);
						if ((local30.anInt774 == 1 || Static270.aBoolean393 && local30.anInt774 == -1) && !super.aBoolean202) {
							if (arg6 == 0) {
								Static533.method6859(arg0, 1, arg3, local30.anInt779, arg4, local30.anInt782);
								Static533.method6859(arg0, 2, arg3, local30.anInt779, arg4 + 1, local30.anInt782);
							} else if (arg6 == 1) {
								Static533.method6859(arg0, 1, arg3 + 1, local30.anInt779, arg4, local30.anInt782);
								Static533.method6859(arg0, 2, arg3, local30.anInt779, arg4 + 1, local30.anInt782);
							} else if (arg6 == 2) {
								Static533.method6859(arg0, 1, arg3 + 1, local30.anInt779, arg4, local30.anInt782);
								Static533.method6859(arg0, 2, arg3, local30.anInt779, arg4, local30.anInt782);
							} else if (arg6 == 3) {
								Static533.method6859(arg0, 1, arg3, local30.anInt779, arg4, local30.anInt782);
								Static533.method6859(arg0, 2, arg3, local30.anInt779, arg4, local30.anInt782);
							}
						}
						if (local30.anInt770 != 0 && arg1 != null) {
							arg1.method2728(arg3, arg6, arg7, !local30.aBoolean69, arg4, local30.aBoolean63);
						}
						if (local30.anInt755 != 64) {
							Static300.method4728(arg0, arg3, arg4, local30.anInt755);
						}
					} else if (arg7 == 3) {
						if (local223) {
							local954 = new Class9_Sub1_Sub4_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg7, arg6, local183);
							if (local954.method7092()) {
								local954.method7087(arg2);
							}
							local956 = local954;
						} else {
							local956 = new Class9_Sub1_Sub4_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg7, arg6, arg8);
						}
						Static127.method2546(arg0, arg3, arg4, local956, null);
						if (local30.aBoolean56 && Static132.aBoolean242) {
							if (arg6 == 0) {
								local128.a(arg3, arg4 + 1, 50);
							} else if (arg6 == 1) {
								local128.a(arg3 + 1, arg4 + 1, 50);
							} else if (arg6 == 2) {
								local128.a(arg3 + 1, arg4, 50);
							} else if (arg6 == 3) {
								local128.a(arg3, arg4, 50);
							}
						}
						if (local30.anInt770 != 0 && arg1 != null) {
							arg1.method2728(arg3, arg6, arg7, !local30.aBoolean69, arg4, local30.aBoolean63);
						}
					} else if (arg7 == 9) {
						if (local223) {
							local342 = new Class9_Sub1_Sub1_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg3, arg3, arg4, arg4, arg7, arg6, local183);
							if (local342.method7092()) {
								local342.method7087(arg2);
							}
							local372 = local342;
						} else {
							local372 = new Class9_Sub1_Sub1_Sub5(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg3, local51 + arg3 - 1, arg4, arg4 + local54 - 1, arg7, arg6, arg8);
						}
						Static216.method3774(local372, false);
						if (local30.anInt770 != 0 && arg1 != null) {
							arg1.method2746(local54, !local30.aBoolean69, local30.aBoolean63, local51, arg4, arg3);
						}
						if (local30.anInt755 != 64) {
							Static300.method4728(arg0, arg3, arg4, local30.anInt755);
						}
					} else {
						@Pc(1601) Class9_Sub1_Sub2 local1601;
						if (arg7 == 4) {
							if (local223) {
								@Pc(1620) Class9_Sub1_Sub2_Sub2 local1620 = new Class9_Sub1_Sub2_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, 0, 0, arg7, arg6);
								local1601 = local1620;
								if (local1620.method7092()) {
									local1620.method7087(arg2);
								}
							} else {
								local1601 = new Class9_Sub1_Sub2_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, 0, 0, arg7, arg6, arg8);
							}
							Static523.method7825(arg0, arg3, arg4, local1601, null);
						} else {
							@Pc(1642) int local1642;
							@Pc(1648) Interface22 local1648;
							@Pc(1687) Class9_Sub1_Sub2_Sub2 local1687;
							if (arg7 == 5) {
								local1642 = 65;
								local1648 = (Interface22) Static247.method4031(arg0, arg3, arg4);
								if (local1648 != null) {
									local1642 = Static476.aClass69_5.method2181(local1648.method7088()).anInt755 + 1;
								}
								if (local223) {
									local1687 = new Class9_Sub1_Sub2_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, Static133.anIntArray244[arg6] * local1642, local1642 * Static263.anIntArray375[arg6], arg7, arg6);
									local1601 = local1687;
									if (local1687.method7092()) {
										local1687.method7087(arg2);
									}
								} else {
									local1601 = new Class9_Sub1_Sub2_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, Static133.anIntArray244[arg6] * local1642, Static263.anIntArray375[arg6] * local1642, arg7, arg6, arg8);
								}
								Static523.method7825(arg0, arg3, arg4, local1601, null);
							} else if (arg7 == 6) {
								local1642 = 33;
								local1648 = (Interface22) Static247.method4031(arg0, arg3, arg4);
								if (local1648 != null) {
									local1642 = Static476.aClass69_5.method2181(local1648.method7088()).anInt755 / 2 + 1;
								}
								if (local223) {
									local1687 = new Class9_Sub1_Sub2_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, Static133.anIntArray244[arg6] * local1642, Static263.anIntArray375[arg6] * local1642, arg7, arg6 + 4);
									if (local1687.method7092()) {
										local1687.method7087(arg2);
									}
									local1601 = local1687;
								} else {
									local1601 = new Class9_Sub1_Sub2_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, local1642 * Static140.anIntArray613[arg6], Static98.anIntArray165[arg6] * local1642, arg7, arg6 + 4, arg8);
								}
								Static523.method7825(arg0, arg3, arg4, local1601, null);
							} else if (arg7 == 7) {
								local1642 = arg6 + 2 & 0x3;
								if (local223) {
									@Pc(1865) Class9_Sub1_Sub2_Sub2 local1865 = new Class9_Sub1_Sub2_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, 0, 0, arg7, local1642 + 4);
									if (local1865.method7092()) {
										local1865.method7087(arg2);
									}
									local1601 = local1865;
								} else {
									local1601 = new Class9_Sub1_Sub2_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, 0, 0, arg7, local1642 + 4, arg8);
								}
								Static523.method7825(arg0, arg3, arg4, local1601, null);
							} else if (arg7 == 8) {
								local374 = arg6 + 2 & 0x3;
								local442 = 33;
								@Pc(1921) Interface22 local1921 = (Interface22) Static247.method4031(arg0, arg3, arg4);
								if (local1921 != null) {
									local442 = Static476.aClass69_5.method2181(local1921.method7088()).anInt755 / 2 + 1;
								}
								@Pc(1967) Class9_Sub1_Sub2 local1967;
								@Pc(1987) Class9_Sub1_Sub2 local1987;
								if (local223) {
									local1967 = new Class9_Sub1_Sub2_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, local442 * Static140.anIntArray613[arg6], local442 * Static98.anIntArray165[arg6], arg7, arg6 + 4);
									local1987 = new Class9_Sub1_Sub2_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, 0, 0, arg7, local374 + 4);
									if (local1967.method7092()) {
										local1967.method7087(arg2);
									}
									if (local1987.method7092()) {
										local1987.method7087(arg2);
									}
								} else {
									local1967 = new Class9_Sub1_Sub2_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, local442 * Static140.anIntArray613[arg6], Static98.anIntArray165[arg6] * local442, arg7, arg6 + 4, arg8);
									local1987 = new Class9_Sub1_Sub2_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, 0, 0, arg7, local374 + 4, arg8);
								}
								Static523.method7825(arg0, arg3, arg4, local1967, local1987);
							}
						}
					}
				}
			}
		} else if (Static278.aClass3_Sub13_Sub1_1.aBoolean413 || local30.anInt772 != 0 || local30.anInt770 == 1 || local30.aBoolean67) {
			@Pc(284) Class9_Sub1_Sub3 local284;
			if (local223) {
				@Pc(301) Class9_Sub1_Sub3_Sub2 local301 = new Class9_Sub1_Sub3_Sub2(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg6, local183);
				local284 = local301;
				if (local301.method7092()) {
					local301.method7087(arg2);
				}
			} else {
				local284 = new Class9_Sub1_Sub3_Sub1(arg2, local30, arg0, arg9, local163, local155, local171, super.aBoolean202, arg6, arg8);
			}
			Static197.method3572(arg0, arg3, arg4, local284);
			if (local30.anInt770 == 1 && arg1 != null) {
				arg1.method2730(arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(IIILclient!r;I[IILclient!qh;III)V")
	public void method2217(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class43 arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class3_Sub11 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean202) {
			return;
		}
		@Pc(18) Class217 local18 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(30) int local30 = (arg1 & 0x7) * 8;
		@Pc(36) int local36 = (arg5 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					@Pc(41) int local41;
					@Pc(83) int local83;
					@Pc(415) int local415;
					@Pc(104) int local104;
					while (arg6.anInt3520 < arg6.aByteArray36.length) {
						local41 = arg6.method3118();
						if (local41 == 0) {
							local18 = new Class217(arg6);
						} else {
							@Pc(110) int local110;
							@Pc(159) int local159;
							@Pc(252) int local252;
							@Pc(290) int local290;
							if (local41 == 1) {
								local83 = arg6.method3118();
								if (local83 > 0) {
									for (local415 = 0; local415 < local83; local415++) {
										@Pc(424) Class258 local424 = new Class258(arg3, arg6, 2);
										if (local424.anInt6855 == 31) {
											@Pc(435) Class44 local435 = Static483.aClass2_1.method9(arg6.method3109());
											local424.method5869(local435.anInt1708, local435.anInt1709, local435.anInt1710, local435.anInt1711);
										}
										if (arg3.method7159() > 0) {
											@Pc(455) Class3_Sub22 local455 = local424.aClass3_Sub22_2;
											local110 = local455.method6731() >> 9;
											local159 = local455.method6725() >> 9;
											if (arg2 == local424.anInt6859 && local110 >= local30 && local110 < local30 + 8 && local36 <= local159 && local159 < local36 + 8) {
												local252 = (arg7 << 9) + Static275.method4410(local455.method6731() & 0xFFF, arg8, local455.method6725() & 0xFFF);
												local110 = local252 >> 9;
												local290 = (arg0 << 9) + Static57.method1107(local455.method6731() & 0xFFF, arg8, local455.method6725() & 0xFFF);
												local159 = local290 >> 9;
												if (local110 >= 0 && local159 >= 0 && local110 < super.anInt2463 && super.anInt2468 > local159) {
													local455.method6727(super.anIntArrayArrayArray5[arg2][local110][local159] - local455.method6728(), local252, local290);
													Static51.method841(local424);
												}
											}
										}
									}
								}
							} else if (local41 == 2) {
								if (local18 == null) {
									local18 = new Class217();
								}
								local18.method5139(arg6);
							} else if (local41 != 128) {
								if (local41 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray14 == null) {
									super.aByteArrayArrayArray14 = new byte[4][][];
								}
								for (local83 = 0; local83 < 4; local83++) {
									@Pc(89) byte local89 = arg6.method3096();
									@Pc(108) int local108;
									if (local89 == 0 && super.aByteArrayArrayArray14[arg9] != null) {
										if (local83 <= arg2) {
											local104 = arg7;
											local108 = arg7 + 7;
											local110 = arg0;
											if (arg7 < 0) {
												local104 = 0;
											} else if (arg7 >= super.anInt2463) {
												local104 = super.anInt2463;
											}
											if (arg0 < 0) {
												local110 = 0;
											} else if (arg0 >= super.anInt2468) {
												local110 = super.anInt2468;
											}
											if (local108 < 0) {
												local108 = 0;
											} else if (local108 >= super.anInt2463) {
												local108 = super.anInt2463;
											}
											local159 = arg0 + 7;
											if (local159 < 0) {
												local159 = 0;
											} else if (super.anInt2468 <= local159) {
												local159 = super.anInt2468;
											}
											while (local108 > local104) {
												while (local159 > local110) {
													super.aByteArrayArrayArray14[arg9][local104][local110] = 0;
													local110++;
												}
												local104++;
											}
										}
									} else if (local89 == 1) {
										if (super.aByteArrayArrayArray14[arg9] == null) {
											super.aByteArrayArrayArray14[arg9] = new byte[super.anInt2463 + 1][super.anInt2468 + 1];
										}
										for (local104 = 0; local104 < 64; local104 += 4) {
											for (local108 = 0; local108 < 64; local108 += 4) {
												@Pc(239) byte local239 = arg6.method3096();
												if (local83 <= arg2) {
													for (local159 = local104; local159 < local104 + 4; local159++) {
														for (local252 = local108; local252 < local108 + 4; local252++) {
															if (local30 <= local159 && local159 < local30 + 8 && local36 <= local252 && local36 + 8 > local36) {
																local290 = arg7 + Static131.method2570(local159 & 0x7, arg8, local252 & 0x7);
																@Pc(303) int local303 = arg0 + Static189.method3257(local159 & 0x7, local252 & 0x7, arg8);
																if (local290 >= 0 && local290 < super.anInt2463 && local303 >= 0 && local303 < super.anInt2468) {
																	super.aByteArrayArrayArray14[arg9][local290][local303] = local239;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg4 == null) {
								arg6.anInt3520 += 10;
							} else {
								arg4[0] = arg6.method3109();
								arg4[1] = arg6.method3107();
								arg4[2] = arg6.method3107();
								arg4[3] = arg6.method3107();
								arg4[4] = arg6.method3109();
							}
						}
					}
					if (local18 != null) {
						Static241.method4005(local18, arg7 >> 3, arg0 >> 3);
					}
					if (super.aByteArrayArrayArray14 != null && super.aByteArrayArrayArray14[arg9] != null) {
						local41 = arg7 + 7;
						local83 = arg0 + 7;
						for (local415 = arg7; local415 < local41; local415++) {
							for (local104 = arg0; local104 < local83; local104++) {
								super.aByteArrayArrayArray14[arg9][local415][local104] = 0;
							}
						}
						return;
					}
					return;
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "([BII[Lclient!fh;Lclient!r;I)V")
	public void method2218(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class95[] arg3, @OriginalArg(4) Class43 arg4) {
		@Pc(10) Class3_Sub11 local10 = new Class3_Sub11(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(22) int local22 = local10.method3089();
			if (local22 == 0) {
				return;
			}
			local12 += local22;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method3138();
				if (local36 == 0) {
					break;
				}
				local30 += local36 - 1;
				@Pc(48) int local48 = local30 & 0x3F;
				@Pc(54) int local54 = local30 >> 6 & 0x3F;
				@Pc(58) int local58 = local30 >> 12;
				@Pc(64) int local64 = local10.method3118();
				@Pc(68) int local68 = local64 >> 2;
				@Pc(72) int local72 = local64 & 0x3;
				@Pc(77) int local77 = local54 + arg1;
				@Pc(81) int local81 = arg2 + local48;
				if (local77 > 0 && local81 > 0 && local77 < super.anInt2463 - 1 && local81 < super.anInt2468 - 1) {
					@Pc(110) Class95 local110 = null;
					if (!super.aBoolean202) {
						@Pc(115) int local115 = local58;
						if ((Static154.aByteArrayArrayArray15[1][local77][local81] & 0x2) == 2) {
							local115 = local58 - 1;
						}
						if (local115 >= 0) {
							local110 = arg3[local115];
						}
					}
					this.method2216(local58, local110, arg4, local77, local81, local12, local72, local68, -1, local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dw", name = "a", descriptor = "(Lclient!r;ZB)V")
	public void method2220(@OriginalArg(0) Class43 arg0, @OriginalArg(1) boolean arg1) {
		Static29.method540();
		if (!arg1) {
			@Pc(20) int local20;
			@Pc(24) int local24;
			if (super.anInt2459 > 1) {
				for (local20 = 0; super.anInt2463 > local20; local20++) {
					for (local24 = 0; local24 < super.anInt2468; local24++) {
						if ((Static154.aByteArrayArrayArray15[1][local20][local24] & 0x2) == 2) {
							Static253.method4069(local20, local24);
						}
					}
				}
			}
			for (local20 = 0; super.anInt2459 > local20; local20++) {
				for (local24 = 0; super.anInt2468 >= local24; local24++) {
					for (@Pc(66) int local66 = 0; local66 <= super.anInt2463; local66++) {
						if ((super.aByteArrayArrayArray10[local20][local66][local24] & 0x4) != 0) {
							@Pc(81) int local81 = local66;
							@Pc(83) int local83 = local66;
							@Pc(85) int local85 = local24;
							@Pc(87) int local87 = local24;
							while (local85 > 0 && (super.aByteArrayArrayArray10[local20][local66][local85 - 1] & 0x4) != 0 && local24 - local85 < 10) {
								local85--;
							}
							while (super.anInt2468 > local87 && (super.aByteArrayArrayArray10[local20][local66][local87 + 1] & 0x4) != 0 && local87 - local85 < 10) {
								local87++;
							}
							@Pc(146) int local146;
							label111: while (local81 > 0 && local66 - local81 < 10) {
								for (local146 = local85; local146 <= local87; local146++) {
									if ((super.aByteArrayArrayArray10[local20][local81 - 1][local146] & 0x4) == 0) {
										break label111;
									}
								}
								local81--;
							}
							label98: while (super.anInt2463 > local83 && local83 - local81 < 10) {
								for (local146 = local85; local146 <= local87; local146++) {
									if ((super.aByteArrayArrayArray10[local20][local83 + 1][local146] & 0x4) == 0) {
										break label98;
									}
								}
								local83++;
							}
							if ((local87 + 1 - local85) * (-local81 + 1 + local83) >= 4) {
								local146 = super.anIntArrayArrayArray5[local20][local81][local85];
								Static3.method53(local81 << 9, local146, (local87 << 9) + 512, local146, local20, local85 << 9, (local83 << 9) + 512);
								for (@Pc(275) int local275 = local81; local275 <= local83; local275++) {
									for (@Pc(279) int local279 = local85; local279 <= local87; local279++) {
										super.aByteArrayArrayArray10[local20][local275][local279] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static50.method828();
		}
		super.aByteArrayArrayArray10 = null;
	}
}
