import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tha")
public final class Class132_Sub1 extends Class132 {

	@OriginalMember(owner = "client!tha", name = "N", descriptor = "I")
	public int anInt9355 = 99;

	@OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(IIIZ)V")
	public Class132_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static392.aClass258_4, Static265.aClass310_4);
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "([BI[Lclient!rl;Lclient!ha;II)V")
	public void method7715(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class291[] arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class3_Sub15 local10 = new Class3_Sub15(arg0);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local10.method8458();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local10.method8465();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(52) int local52 = local33 & 0x3F;
				@Pc(58) int local58 = local33 >> 6 & 0x3F;
				@Pc(62) int local62 = local33 >> 12;
				@Pc(68) int local68 = local10.method8401();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				@Pc(80) int local80 = arg3 + local58;
				@Pc(84) int local84 = arg4 + local52;
				if (local80 > 0 && local84 > 0 && local80 < super.anInt9341 - 1 && local84 < super.anInt9338 - 1) {
					@Pc(112) Class291 local112 = null;
					if (!super.aBoolean787) {
						@Pc(117) int local117 = local62;
						if ((Static244.aByteArrayArrayArray10[1][local80][local84] & 0x2) == 2) {
							local117 = local62 - 1;
						}
						if (local117 >= 0) {
							local112 = arg1[local117];
						}
					}
					this.method7721(arg2, local18, local62, local84, local76, -1, local72, local80, local112, local62);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IILclient!rl;IBLclient!ha;I)V")
	public void method7717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class291 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class33 arg4, @OriginalArg(6) int arg5) {
		@Pc(19) Interface18 local19 = this.method7718(arg5, arg0, arg3, arg1);
		if (local19 == null) {
			return;
		}
		@Pc(28) Class272 local28 = Static541.aClass349_4.method8123(local19.method8587());
		@Pc(32) int local32 = local19.method8588();
		@Pc(36) int local36 = local19.method8586();
		if (local28.method6860()) {
			Static145.method8499(arg1, arg5, arg3, local28);
		}
		if (local19.method8584()) {
			local19.method8585(arg4);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				Static146.method3248(arg5, arg3, arg1);
				return;
			}
			if (arg0 == 2) {
				Static62.method1337(arg5, arg3, arg1, op.class);
				if (local28.anInt8293 != 0 && local28.anInt8263 + arg3 < super.anInt9341 && arg1 + local28.anInt8263 < super.anInt9338 && super.anInt9341 > local28.anInt8284 + arg3 && arg1 + local28.anInt8284 < super.anInt9338) {
					arg2.method7193(arg3, local28.anInt8263, !local28.aBoolean705, local28.anInt8284, local28.aBoolean702, local36, arg1);
				}
				if (local32 == 9) {
					if ((local36 & 0x1) == 0) {
						Static612.method8325(arg3, 8, arg1, arg5);
						return;
					}
					Static612.method8325(arg3, 16, arg1, arg5);
					return;
				}
			} else if (arg0 == 3) {
				Static615.method8356(arg5, arg3, arg1);
				if (local28.anInt8293 != 1) {
					return;
				}
				arg2.method7198(arg3, arg1);
			} else {
				return;
			}
			return;
		}
		Static28.method491(arg5, arg3, arg1);
		if (local28.anInt8293 != 0) {
			arg2.method7197(arg3, local36, local32, !local28.aBoolean705, arg1, local28.aBoolean702);
		}
		if (local28.anInt8269 != 1) {
			return;
		}
		if (local36 != 0) {
			if (local36 != 1) {
				if (local36 == 2) {
					Static612.method8325(arg3 + 1, 1, arg1, arg5);
				} else if (local36 == 3) {
					Static612.method8325(arg3, 2, arg1, arg5);
					return;
				}
				return;
			}
			Static612.method8325(arg3, 2, arg1 + 1, arg5);
			return;
		}
		Static612.method8325(arg3, 1, arg1, arg5);
		return;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIIII)Lclient!op;")
	private Interface18 method7718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface18 local5 = null;
		if (arg1 == 0) {
			local5 = (Interface18) Static639.method8624(arg0, arg2, arg3);
		}
		if (arg1 == 1) {
			local5 = (Interface18) Static359.method7955(arg0, arg2, arg3);
		}
		if (arg1 == 2) {
			local5 = (Interface18) Static17.method258(arg0, arg2, arg3, op.class);
		}
		if (arg1 == 3) {
			local5 = (Interface18) Static439.method6676(arg0, arg2, arg3);
		}
		return local5;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!tn;ILclient!ha;I[IIIIII)V")
	public void method7719(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub15 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class33 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean787) {
			return;
		}
		@Pc(13) Class260 local13 = null;
		if (arg5 != null) {
			arg5[0] = -1;
		}
		@Pc(25) int local25 = (arg2 & 0x7) * 8;
		@Pc(31) int local31 = (arg4 & 0x7) * 8;
		while (true) {
			@Pc(36) int local36;
			@Pc(108) int local108;
			@Pc(133) int local133;
			@Pc(428) int local428;
			while (arg1.anInt10282 < arg1.aByteArray106.length) {
				local36 = arg1.method8401();
				if (local36 == 0) {
					local13 = new Class260(arg1);
				} else {
					@Pc(196) int local196;
					@Pc(287) int local287;
					@Pc(329) int local329;
					@Pc(139) int local139;
					if (local36 == 1) {
						local108 = arg1.method8401();
						if (local108 > 0) {
							for (local428 = 0; local428 < local108; local428++) {
								@Pc(437) Class93 local437 = new Class93(arg3, arg1, 2);
								if (local437.anInt3599 == 31) {
									@Pc(450) Class337 local450 = Static461.aClass220_1.method5815(arg1.method8414());
									local437.method3169(local450.anInt9696, local450.anInt9698, local450.anInt9697, local450.anInt9700);
								}
								if (arg3.method6226() > 0) {
									@Pc(467) Class3_Sub27 local467 = local437.aClass3_Sub27_2;
									local139 = local467.method5627() >> 9;
									local196 = local467.method5630() >> 9;
									if (arg6 == local437.anInt3588 && local25 <= local139 && local25 + 8 > local139 && local31 <= local196 && local31 + 8 > local196) {
										local287 = Static529.method7518(arg9, local467.method5630() & 0xFFF, local467.method5627() & 0xFFF) + (arg7 << 9);
										local139 = local287 >> 9;
										local329 = (arg0 << 9) + Static278.method6292(local467.method5630() & 0xFFF, local467.method5627() & 0xFFF, arg9);
										local196 = local329 >> 9;
										if (local139 >= 0 && local196 >= 0 && super.anInt9341 > local139 && local196 < super.anInt9338) {
											local467.method5629(local329, super.anIntArrayArrayArray12[arg6][local139][local196] - local467.method5628(), local287);
											Static2.method34(local437);
										}
									}
								}
							}
						}
					} else if (local36 == 2) {
						if (local13 == null) {
							local13 = new Class260();
						}
						local13.method6583(arg1);
					} else if (local36 != 128) {
						if (local36 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray17 == null) {
							super.aByteArrayArrayArray17 = new byte[4][][];
						}
						for (local108 = 0; local108 < 4; local108++) {
							@Pc(114) byte local114 = arg1.method8440();
							@Pc(137) int local137;
							if (local114 == 0 && super.aByteArrayArrayArray17[arg8] != null) {
								if (arg6 >= local108) {
									local133 = arg7;
									local137 = arg7 + 7;
									local139 = arg0;
									if (arg0 < 0) {
										local139 = 0;
									} else if (arg0 >= super.anInt9338) {
										local139 = super.anInt9338;
									}
									if (arg7 < 0) {
										local133 = 0;
									} else if (super.anInt9341 <= arg7) {
										local133 = super.anInt9341;
									}
									if (local137 < 0) {
										local137 = 0;
									} else if (local137 >= super.anInt9341) {
										local137 = super.anInt9341;
									}
									local196 = arg0 + 7;
									if (local196 < 0) {
										local196 = 0;
									} else if (super.anInt9338 <= local196) {
										local196 = super.anInt9338;
									}
									while (local133 < local137) {
										while (local139 < local196) {
											super.aByteArrayArrayArray17[arg8][local133][local139] = 0;
											local139++;
										}
										local133++;
									}
								}
							} else if (local114 == 1) {
								if (super.aByteArrayArrayArray17[arg8] == null) {
									super.aByteArrayArrayArray17[arg8] = new byte[super.anInt9341 + 1][super.anInt9338 + 1];
								}
								for (local133 = 0; local133 < 64; local133 += 4) {
									for (local137 = 0; local137 < 64; local137 += 4) {
										@Pc(274) byte local274 = arg1.method8440();
										if (local108 <= arg6) {
											for (local196 = local133; local196 < local133 + 4; local196++) {
												for (local287 = local137; local287 < local137 + 4; local287++) {
													if (local196 >= local25 && local196 < local25 + 8 && local287 >= local31 && local31 + 8 > local31) {
														local329 = Static122.method2840(arg9, local287 & 0x7, local196 & 0x7) + arg7;
														@Pc(341) int local341 = Static158.method3379(local196 & 0x7, arg9, local287 & 0x7) + arg0;
														if (local329 >= 0 && local329 < super.anInt9341 && local341 >= 0 && local341 < super.anInt9338) {
															super.aByteArrayArrayArray17[arg8][local329][local341] = local274;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg5 == null) {
						arg1.anInt10282 += 10;
					} else {
						arg5[0] = arg1.method8414();
						arg5[1] = arg1.method8444();
						arg5[2] = arg1.method8444();
						arg5[3] = arg1.method8444();
						arg5[4] = arg1.method8414();
					}
				}
			}
			if (local13 != null) {
				Static406.method6409(arg7 >> 3, arg0 >> 3, local13);
			}
			if (super.aByteArrayArrayArray17 != null && super.aByteArrayArrayArray17[arg8] != null) {
				local36 = arg7 + 7;
				local108 = arg0 + 7;
				for (local428 = arg7; local428 < local36; local428++) {
					for (local133 = arg0; local133 < local108; local133++) {
						super.aByteArrayArrayArray17[arg8][local428][local133] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZLclient!ha;I)V")
	public void method7720(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class33 arg1) {
		Static507.method7380();
		if (!arg0) {
			@Pc(24) int local24;
			@Pc(28) int local28;
			if (super.anInt9342 > 1) {
				for (local24 = 0; super.anInt9341 > local24; local24++) {
					for (local28 = 0; super.anInt9338 > local28; local28++) {
						if ((Static244.aByteArrayArrayArray10[1][local24][local28] & 0x2) == 2) {
							Static349.method5730(local24, local28);
						}
					}
				}
			}
			for (local24 = 0; super.anInt9342 > local24; local24++) {
				for (local28 = 0; super.anInt9338 >= local28; local28++) {
					for (@Pc(70) int local70 = 0; super.anInt9341 >= local70; local70++) {
						if ((super.aByteArrayArrayArray13[local24][local70][local28] & 0x4) != 0) {
							@Pc(85) int local85 = local70;
							@Pc(87) int local87 = local70;
							@Pc(89) int local89 = local28;
							@Pc(91) int local91 = local28;
							while (local89 > 0 && (super.aByteArrayArrayArray13[local24][local70][local89 - 1] & 0x4) != 0 && local28 - local89 < 10) {
								local89--;
							}
							while (local91 < super.anInt9338 && (super.aByteArrayArrayArray13[local24][local70][local91 + 1] & 0x4) != 0 && local91 - local89 < 10) {
								local91++;
							}
							@Pc(157) int local157;
							label111: while (local85 > 0 && local70 - local85 < 10) {
								for (local157 = local89; local157 <= local91; local157++) {
									if ((super.aByteArrayArrayArray13[local24][local85 - 1][local157] & 0x4) == 0) {
										break label111;
									}
								}
								local85--;
							}
							label98: while (local87 < super.anInt9341 && local87 - local85 < 10) {
								for (local157 = local89; local157 <= local91; local157++) {
									if ((super.aByteArrayArrayArray13[local24][local87 + 1][local157] & 0x4) == 0) {
										break label98;
									}
								}
								local87++;
							}
							if ((local91 + 1 - local89) * (-local85 + 1 + local87) >= 4) {
								local157 = super.anIntArrayArrayArray12[local24][local85][local89];
								Static402.method6828(local85 << 9, (local91 << 9) + 512, local89 << 9, local157, local157, local24, (local87 << 9) + 512);
								for (@Pc(279) int local279 = local85; local279 <= local87; local279++) {
									for (@Pc(283) int local283 = local89; local283 <= local91; local283++) {
										super.aByteArrayArrayArray13[local24][local279][local283] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static611.method8304();
		}
		super.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!ha;IIIIIIIILclient!rl;I)V")
	public void method7721(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class291 arg8, @OriginalArg(10) int arg9) {
		if (Static552.aClass3_Sub48_30.aClass23_Sub14_1.method4252() == 0 && !Static394.method6311(arg7, Static630.anInt10396, arg2, arg3)) {
			return;
		}
		if (this.anInt9355 > arg9) {
			this.anInt9355 = arg9;
		}
		@Pc(37) Class272 local37 = Static541.aClass349_4.method8123(arg1);
		if (Static552.aClass3_Sub48_30.aClass23_Sub4_1.method1180() == 0 && local37.aBoolean712) {
			return;
		}
		@Pc(57) int local57;
		@Pc(60) int local60;
		if (arg4 == 1 || arg4 == 3) {
			local60 = local37.anInt8263;
			local57 = local37.anInt8284;
		} else {
			local57 = local37.anInt8263;
			local60 = local37.anInt8284;
		}
		@Pc(85) int local85;
		@Pc(94) int local94;
		if (super.anInt9341 >= local57 + arg7) {
			local85 = arg7 + (local57 >> 1);
			local94 = arg7 + (local57 + 1 >> 1);
		} else {
			local94 = arg7 + 1;
			local85 = arg7;
		}
		@Pc(110) int local110;
		@Pc(114) int local114;
		if (super.anInt9338 < arg3 + local60) {
			local110 = arg3;
			local114 = arg3 + 1;
		} else {
			local114 = arg3 + (local60 + 1 >> 1);
			local110 = arg3 + (local60 >> 1);
		}
		@Pc(134) Class274 local134 = Static500.aClass274Array2[arg2];
		@Pc(163) int local163 = local134.method8041(local85, local110) + local134.method8041(local94, local110) + local134.method8041(local85, local114) + local134.method8041(local94, local114) >> 2;
		@Pc(172) int local172 = (arg7 << 9) + (local57 << 8);
		@Pc(180) int local180 = (local60 << 8) + (arg3 << 9);
		@Pc(192) boolean local192 = Static572.aBoolean807 && !super.aBoolean787 && local37.aBoolean709;
		if (local37.method6860()) {
			Static493.method7238(arg7, null, arg3, arg9, local37, arg4, null);
		}
		@Pc(231) boolean local231 = arg5 == -1 && local37.lb == -1 && local37.anIntArray525 == null && local37.anIntArray523 == null && !local37.aBoolean707;
		if (Static588.aBoolean810 && (Static286.method4983(arg6) && local37.anInt8269 != 1 || !(!Static613.method8342(arg6) || local37.anInt8269 != 0))) {
			return;
		}
		if (arg6 != 22) {
			@Pc(386) Class2_Sub3_Sub1 local386;
			@Pc(348) Class2_Sub3_Sub1_Sub5 local348;
			@Pc(382) int local382;
			@Pc(445) int local445;
			if (arg6 == 10 || arg6 == 11) {
				local348 = null;
				if (local231) {
					@Pc(378) Class2_Sub3_Sub1_Sub5 local378 = new Class2_Sub3_Sub1_Sub5(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg7, arg7 + local57 - 1, arg3, local60 + arg3 - 1, arg6, arg4, local192);
					local382 = local378.method8593();
					local348 = local378;
					local386 = local378;
				} else {
					local382 = 15;
					local386 = new Class2_Sub3_Sub1_Sub4(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg7, local57 + arg7 - 1, arg3, arg3 + local60 - 1, arg6, arg4, arg5);
				}
				if (Static286.method4985(local386, false)) {
					if (local348 != null && local348.method8584()) {
						local348.method8583(arg0);
					}
					if (local37.aBoolean713 && Static572.aBoolean807) {
						if (local382 > 30) {
							local382 = 30;
						}
						for (local445 = 0; local445 <= local57; local445++) {
							for (@Pc(449) int local449 = 0; local449 <= local60; local449++) {
								local134.ka(local445 + arg7, arg3 - -local449, local382);
							}
						}
					}
				}
				if (local37.anInt8293 != 0 && arg8 != null) {
					arg8.method7195(local60, local37.aBoolean702, arg7, arg3, local57, !local37.aBoolean705);
				}
			} else if (arg6 >= 12 && arg6 <= 17 || arg6 >= 18 && arg6 <= 21) {
				if (local231) {
					local348 = new Class2_Sub3_Sub1_Sub5(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg7, arg7 + local57 - 1, arg3, arg3 + local60 - 1, arg6, arg4, local192);
					local386 = local348;
					if (local348.method8584()) {
						local348.method8583(arg0);
					}
				} else {
					local386 = new Class2_Sub3_Sub1_Sub4(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg7, local57 + arg7 - 1, arg3, local60 + arg3 - 1, arg6, arg4, arg5);
				}
				Static286.method4985(local386, false);
				if (Static572.aBoolean807 && !super.aBoolean787 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg9 > 0 && local37.anInt8269 != 0) {
					super.aByteArrayArrayArray13[arg9][arg7][arg3] = (byte) (super.aByteArrayArrayArray13[arg9][arg7][arg3] | 0x4);
				}
				if (local37.anInt8293 != 0 && arg8 != null) {
					arg8.method7195(local60, local37.aBoolean702, arg7, arg3, local57, !local37.aBoolean705);
				}
			} else {
				@Pc(687) Class2_Sub3_Sub2 local687;
				if (arg6 == 0) {
					@Pc(661) int local661 = local37.anInt8269;
					if (Static91.aBoolean199 && local37.anInt8269 == -1) {
						local661 = 1;
					}
					if (local231) {
						@Pc(705) Class2_Sub3_Sub2_Sub1 local705 = new Class2_Sub3_Sub2_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg6, arg4, local192);
						local687 = local705;
						if (local705.method8584()) {
							local705.method8583(arg0);
						}
					} else {
						local687 = new Class2_Sub3_Sub2_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg6, arg4, arg5);
					}
					Static426.method6561(arg9, arg7, arg3, local687, null);
					if (arg4 == 0) {
						if (Static572.aBoolean807 && local37.aBoolean713) {
							local134.ka(arg7, arg3, 50);
							local134.ka(arg7, arg3 + 1, 50);
						}
						if (local661 == 1 && !super.aBoolean787) {
							Static145.method8505(1, arg9, arg3, local37.anInt8295, local37.anInt8279, arg7);
						}
					} else if (arg4 == 1) {
						if (Static572.aBoolean807 && local37.aBoolean713) {
							local134.ka(arg7, arg3 + 1, 50);
							local134.ka(arg7 + 1, arg3 + 1, 50);
						}
						if (local661 == 1 && !super.aBoolean787) {
							Static145.method8505(2, arg9, arg3 + 1, local37.anInt8295, -local37.anInt8279, arg7);
						}
					} else if (arg4 == 2) {
						if (Static572.aBoolean807 && local37.aBoolean713) {
							local134.ka(arg7 + 1, arg3, 50);
							local134.ka(arg7 + 1, arg3 + 1, 50);
						}
						if (local661 == 1 && !super.aBoolean787) {
							Static145.method8505(1, arg9, arg3, local37.anInt8295, -local37.anInt8279, arg7 + 1);
						}
					} else if (arg4 == 3) {
						if (Static572.aBoolean807 && local37.aBoolean713) {
							local134.ka(arg7, arg3, 50);
							local134.ka(arg7 + 1, arg3, 50);
						}
						if (local661 == 1 && !super.aBoolean787) {
							Static145.method8505(2, arg9, arg3, local37.anInt8295, local37.anInt8279, arg7);
						}
					}
					if (local37.anInt8293 != 0 && arg8 != null) {
						arg8.method7192(!local37.aBoolean705, arg6, arg3, arg7, local37.aBoolean702, arg4);
					}
					if (local37.anInt8267 != 64) {
						Static6.method95(arg9, arg7, arg3, local37.anInt8267);
					}
				} else {
					@Pc(962) Class2_Sub3_Sub2 local962;
					@Pc(952) Class2_Sub3_Sub2_Sub1 local952;
					if (arg6 == 1) {
						if (local231) {
							local952 = new Class2_Sub3_Sub2_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg6, arg4, local192);
							if (local952.method8584()) {
								local952.method8583(arg0);
							}
							local962 = local952;
						} else {
							local962 = new Class2_Sub3_Sub2_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg6, arg4, arg5);
						}
						Static426.method6561(arg9, arg7, arg3, local962, null);
						if (local37.aBoolean713 && Static572.aBoolean807) {
							if (arg4 == 0) {
								local134.ka(arg7, arg3 + 1, 50);
							} else if (arg4 == 1) {
								local134.ka(arg7 + 1, arg3 + 1, 50);
							} else if (arg4 == 2) {
								local134.ka(arg7 + 1, arg3, 50);
							} else if (arg4 == 3) {
								local134.ka(arg7, arg3, 50);
							}
						}
						if (local37.anInt8293 != 0 && arg8 != null) {
							arg8.method7192(!local37.aBoolean705, arg6, arg3, arg7, local37.aBoolean702, arg4);
						}
					} else if (arg6 == 2) {
						local382 = arg4 + 1 & 0x3;
						if (local231) {
							@Pc(1100) Class2_Sub3_Sub2_Sub1 local1100 = new Class2_Sub3_Sub2_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg6, arg4 + 4, local192);
							@Pc(1116) Class2_Sub3_Sub2_Sub1 local1116 = new Class2_Sub3_Sub2_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg6, local382, local192);
							if (local1100.method8584()) {
								local1100.method8583(arg0);
							}
							if (local1116.method8584()) {
								local1116.method8583(arg0);
							}
							local962 = local1100;
							local687 = local1116;
						} else {
							local962 = new Class2_Sub3_Sub2_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg6, arg4 + 4, arg5);
							local687 = new Class2_Sub3_Sub2_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg6, local382, arg5);
						}
						Static426.method6561(arg9, arg7, arg3, local962, local687);
						if ((local37.anInt8269 == 1 || Static91.aBoolean199 && local37.anInt8269 == -1) && !super.aBoolean787) {
							if (arg4 == 0) {
								Static145.method8505(1, arg9, arg3, local37.anInt8295, local37.anInt8279, arg7);
								Static145.method8505(2, arg9, arg3 + 1, local37.anInt8295, local37.anInt8279, arg7);
							} else if (arg4 == 1) {
								Static145.method8505(1, arg9, arg3, local37.anInt8295, local37.anInt8279, arg7 + 1);
								Static145.method8505(2, arg9, arg3 + 1, local37.anInt8295, local37.anInt8279, arg7);
							} else if (arg4 == 2) {
								Static145.method8505(1, arg9, arg3, local37.anInt8295, local37.anInt8279, arg7 + 1);
								Static145.method8505(2, arg9, arg3, local37.anInt8295, local37.anInt8279, arg7);
							} else if (arg4 == 3) {
								Static145.method8505(1, arg9, arg3, local37.anInt8295, local37.anInt8279, arg7);
								Static145.method8505(2, arg9, arg3, local37.anInt8295, local37.anInt8279, arg7);
							}
						}
						if (local37.anInt8293 != 0 && arg8 != null) {
							arg8.method7192(!local37.aBoolean705, arg6, arg3, arg7, local37.aBoolean702, arg4);
						}
						if (local37.anInt8267 != 64) {
							Static6.method95(arg9, arg7, arg3, local37.anInt8267);
						}
					} else if (arg6 == 3) {
						if (local231) {
							local952 = new Class2_Sub3_Sub2_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg6, arg4, local192);
							if (local952.method8584()) {
								local952.method8583(arg0);
							}
							local962 = local952;
						} else {
							local962 = new Class2_Sub3_Sub2_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg6, arg4, arg5);
						}
						Static426.method6561(arg9, arg7, arg3, local962, null);
						if (local37.aBoolean713 && Static572.aBoolean807) {
							if (arg4 == 0) {
								local134.ka(arg7, arg3 + 1, 50);
							} else if (arg4 == 1) {
								local134.ka(arg7 + 1, arg3 - -1, 50);
							} else if (arg4 == 2) {
								local134.ka(arg7 + 1, arg3, 50);
							} else if (arg4 == 3) {
								local134.ka(arg7, arg3, 50);
							}
						}
						if (local37.anInt8293 != 0 && arg8 != null) {
							arg8.method7192(!local37.aBoolean705, arg6, arg3, arg7, local37.aBoolean702, arg4);
						}
					} else if (arg6 == 9) {
						if (local231) {
							local348 = new Class2_Sub3_Sub1_Sub5(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg7, arg7, arg3, arg3, arg6, arg4, local192);
							local386 = local348;
							if (local348.method8584()) {
								local348.method8583(arg0);
							}
						} else {
							local386 = new Class2_Sub3_Sub1_Sub4(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg7, arg7 + local57 - 1, arg3, arg3 + local60 - 1, arg6, arg4, arg5);
						}
						Static286.method4985(local386, false);
						if (local37.anInt8269 == 1 && !super.aBoolean787) {
							@Pc(1554) byte local1554;
							if ((arg4 & 0x1) == 0) {
								local1554 = 8;
							} else {
								local1554 = 16;
							}
							Static145.method8505(local1554, arg9, arg3, local37.anInt8295, 0, arg7);
						}
						if (local37.anInt8293 != 0 && arg8 != null) {
							arg8.method7195(local60, local37.aBoolean702, arg7, arg3, local57, !local37.aBoolean705);
						}
						if (local37.anInt8267 != 64) {
							Static6.method95(arg9, arg7, arg3, local37.anInt8267);
						}
					} else {
						@Pc(1626) Class2_Sub3_Sub3 local1626;
						if (arg6 == 4) {
							if (local231) {
								@Pc(1645) Class2_Sub3_Sub3_Sub2 local1645 = new Class2_Sub3_Sub3_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, 0, 0, arg6, arg4);
								if (local1645.method8584()) {
									local1645.method8583(arg0);
								}
								local1626 = local1645;
							} else {
								local1626 = new Class2_Sub3_Sub3_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, 0, 0, arg6, arg4, arg5);
							}
							Static356.method5814(arg9, arg7, arg3, local1626, null);
						} else {
							@Pc(1669) int local1669;
							@Pc(1675) Interface18 local1675;
							@Pc(1714) Class2_Sub3_Sub3_Sub2 local1714;
							if (arg6 == 5) {
								local1669 = 65;
								local1675 = (Interface18) Static639.method8624(arg9, arg7, arg3);
								if (local1675 != null) {
									local1669 = Static541.aClass349_4.method8123(local1675.method8587()).anInt8267 + 1;
								}
								if (local231) {
									local1714 = new Class2_Sub3_Sub3_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, local1669 * Static55.anIntArray63[arg4], Static547.anIntArray502[arg4] * local1669, arg6, arg4);
									local1626 = local1714;
									if (local1714.method8584()) {
										local1714.method8583(arg0);
									}
								} else {
									local1626 = new Class2_Sub3_Sub3_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, Static55.anIntArray63[arg4] * local1669, Static547.anIntArray502[arg4] * local1669, arg6, arg4, arg5);
								}
								Static356.method5814(arg9, arg7, arg3, local1626, null);
							} else if (arg6 == 6) {
								local1669 = 33;
								local1675 = (Interface18) Static639.method8624(arg9, arg7, arg3);
								if (local1675 != null) {
									local1669 = Static541.aClass349_4.method8123(local1675.method8587()).anInt8267 / 2 + 1;
								}
								if (local231) {
									local1714 = new Class2_Sub3_Sub3_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, Static55.anIntArray63[arg4] * local1669, Static547.anIntArray502[arg4] * local1669, arg6, arg4 + 4);
									local1626 = local1714;
									if (local1714.method8584()) {
										local1714.method8583(arg0);
									}
								} else {
									local1626 = new Class2_Sub3_Sub3_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, local1669 * Static344.anIntArray397[arg4], local1669 * Static525.anIntArray569[arg4], arg6, arg4 + 4, arg5);
								}
								Static356.method5814(arg9, arg7, arg3, local1626, null);
							} else if (arg6 == 7) {
								local1669 = arg4 + 2 & 0x3;
								if (local231) {
									@Pc(1894) Class2_Sub3_Sub3_Sub2 local1894 = new Class2_Sub3_Sub3_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, 0, 0, arg6, local1669 + 4);
									if (local1894.method8584()) {
										local1894.method8583(arg0);
									}
									local1626 = local1894;
								} else {
									local1626 = new Class2_Sub3_Sub3_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, 0, 0, arg6, local1669 + 4, arg5);
								}
								Static356.method5814(arg9, arg7, arg3, local1626, null);
							} else if (arg6 == 8) {
								local382 = arg4 + 2 & 0x3;
								local445 = 33;
								@Pc(1952) Interface18 local1952 = (Interface18) Static639.method8624(arg9, arg7, arg3);
								if (local1952 != null) {
									local445 = Static541.aClass349_4.method8123(local1952.method8587()).anInt8267 / 2 + 1;
								}
								@Pc(1995) Class2_Sub3_Sub3 local1995;
								@Pc(2014) Class2_Sub3_Sub3 local2014;
								if (local231) {
									local1995 = new Class2_Sub3_Sub3_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, Static344.anIntArray397[arg4] * local445, Static525.anIntArray569[arg4] * local445, arg6, arg4 + 4);
									local2014 = new Class2_Sub3_Sub3_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, 0, 0, arg6, local382 + 4);
									if (local1995.method8584()) {
										local1995.method8583(arg0);
									}
									if (local2014.method8584()) {
										local2014.method8583(arg0);
									}
								} else {
									local1995 = new Class2_Sub3_Sub3_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, local445 * Static344.anIntArray397[arg4], Static525.anIntArray569[arg4] * local445, arg6, arg4 + 4, arg5);
									local2014 = new Class2_Sub3_Sub3_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, 0, 0, arg6, local382 + 4, arg5);
								}
								Static356.method5814(arg9, arg7, arg3, local1995, local2014);
							}
						}
					}
				}
			}
		} else if (Static552.aClass3_Sub48_30.aClass23_Sub12_1.method3750() != 0 || local37.anInt8270 != 0 || local37.anInt8293 == 1 || local37.aBoolean701) {
			@Pc(292) Class2_Sub3_Sub5 local292;
			if (local231) {
				@Pc(309) Class2_Sub3_Sub5_Sub2 local309 = new Class2_Sub3_Sub5_Sub2(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg4, local192);
				if (local309.method8584()) {
					local309.method8583(arg0);
				}
				local292 = local309;
			} else {
				local292 = new Class2_Sub3_Sub5_Sub1(arg0, local37, arg9, arg2, local172, local163, local180, super.aBoolean787, arg4, arg5);
			}
			Static351.method5757(arg9, arg7, arg3, local292);
			if (local37.anInt8293 == 1 && arg8 != null) {
				arg8.method7208(arg7, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(ILclient!ha;I[BIII[Lclient!rl;III)V")
	public void method7722(@OriginalArg(0) int arg0, @OriginalArg(1) Class33 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class291[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class3_Sub15 local10 = new Class3_Sub15(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method8458();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(30) int local30 = local10.method8465();
				if (local30 == 0) {
					break;
				}
				local24 += local30 - 1;
				@Pc(45) int local45 = local24 & 0x3F;
				@Pc(51) int local51 = local24 >> 6 & 0x3F;
				@Pc(55) int local55 = local24 >> 12;
				@Pc(61) int local61 = local10.method8401();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				if (local55 == arg5 && arg8 <= local51 && arg8 + 8 > local51 && arg0 <= local45 && arg0 + 8 > local45) {
					@Pc(101) Class272 local101 = Static541.aClass349_4.method8123(local12);
					@Pc(118) int local118 = Static295.method5064(arg3, local45 & 0x7, local101.anInt8284, local101.anInt8263, local69, local51 & 0x7) + arg4;
					@Pc(135) int local135 = Static274.method4940(local69, local51 & 0x7, local101.anInt8263, arg3, local101.anInt8284, local45 & 0x7) + arg9;
					if (local118 > 0 && local135 > 0 && local118 < super.anInt9341 - 1 && local135 < super.anInt9338 - 1) {
						@Pc(167) Class291 local167 = null;
						if (!super.aBoolean787) {
							@Pc(172) int local172 = arg7;
							if ((Static244.aByteArrayArrayArray10[1][local118][local135] & 0x2) == 2) {
								local172 = arg7 - 1;
							}
							if (local172 >= 0) {
								local167 = arg6[local172];
							}
						}
						this.method7721(arg1, local12, arg7, local135, local69 + arg3 & 0x3, -1, local65, local118, local167, arg7);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!tn;II[ILclient!ha;I)V")
	public void method7723(@OriginalArg(0) Class3_Sub15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class33 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean787) {
			return;
		}
		@Pc(17) boolean local17 = false;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(25) Class260 local25 = null;
		while (true) {
			@Pc(32) int local32;
			@Pc(51) int local51;
			@Pc(249) int local249;
			@Pc(253) int local253;
			@Pc(55) int local55;
			while (arg0.anInt10282 < arg0.aByteArray106.length) {
				local32 = arg0.method8401();
				if (local32 == 0) {
					local25 = new Class260(arg0);
				} else {
					@Pc(100) int local100;
					@Pc(108) int local108;
					@Pc(112) int local112;
					if (local32 == 1) {
						local51 = arg0.method8401();
						if (local51 > 0) {
							for (local55 = 0; local55 < local51; local55++) {
								@Pc(64) Class93 local64 = new Class93(arg3, arg0, 2);
								if (local64.anInt3599 == 31) {
									@Pc(75) Class337 local75 = Static461.aClass220_1.method5815(arg0.method8414());
									local64.method3169(local75.anInt9696, local75.anInt9698, local75.anInt9697, local75.anInt9700);
								}
								if (arg3.method6226() > 0) {
									@Pc(92) Class3_Sub27 local92 = local64.aClass3_Sub27_2;
									local100 = (arg4 << 9) + local92.method5627();
									local108 = local92.method5630() + (arg1 << 9);
									local112 = local100 >> 9;
									@Pc(116) int local116 = local108 >> 9;
									if (local112 >= 0 && local116 >= 0 && super.anInt9341 > local112 && super.anInt9338 > local116) {
										local92.method5629(local108, super.anIntArrayArrayArray12[local64.anInt3588][local112][local116] - local92.method5628(), local100);
										Static2.method34(local64);
									}
								}
							}
						}
					} else if (local32 == 2) {
						if (local25 == null) {
							local25 = new Class260();
						}
						local25.method6583(arg0);
					} else if (local32 != 128) {
						if (local32 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray17 == null) {
							super.aByteArrayArrayArray17 = new byte[4][][];
						}
						local17 = true;
						for (local51 = 0; local51 < 4; local51++) {
							@Pc(240) byte local240 = arg0.method8440();
							if (local240 == 0 && super.aByteArrayArrayArray17[local51] != null) {
								local249 = arg4;
								local253 = arg4 + 64;
								local100 = arg1;
								if (arg4 < 0) {
									local249 = 0;
								} else if (arg4 >= super.anInt9341) {
									local249 = super.anInt9341;
								}
								if (local253 < 0) {
									local253 = 0;
								} else if (local253 >= super.anInt9341) {
									local253 = super.anInt9341;
								}
								local108 = arg1 + 64;
								if (arg1 < 0) {
									local100 = 0;
								} else if (arg1 >= super.anInt9338) {
									local100 = super.anInt9338;
								}
								if (local108 < 0) {
									local108 = 0;
								} else if (super.anInt9338 <= local108) {
									local108 = super.anInt9338;
								}
								while (local253 > local249) {
									while (local108 > local100) {
										super.aByteArrayArrayArray17[local51][local249][local100] = 0;
										local100++;
									}
									local249++;
								}
							} else if (local240 == 1) {
								if (super.aByteArrayArrayArray17[local51] == null) {
									super.aByteArrayArrayArray17[local51] = new byte[super.anInt9341 + 1][super.anInt9338 + 1];
								}
								for (local249 = 0; local249 < 64; local249 += 4) {
									for (local253 = 0; local253 < 64; local253 += 4) {
										@Pc(392) byte local392 = arg0.method8440();
										for (local108 = local249 + arg4; local108 < local249 + arg4 + 4; local108++) {
											for (local112 = arg1 + local253; local112 < arg1 + local253 + 4; local112++) {
												if (local108 >= 0 && local108 < super.anInt9341 && local112 >= 0 && local112 < super.anInt9338) {
													super.aByteArrayArrayArray17[local51][local108][local112] = local392;
												}
											}
										}
									}
								}
							} else if (local240 == 2) {
								if (super.aByteArrayArrayArray17[local51] == null) {
									super.aByteArrayArrayArray17[local51] = new byte[super.anInt9341 + 1][super.anInt9338 + 1];
								}
								if (local51 > 0) {
									local249 = arg4;
									local253 = arg4 + 64;
									local100 = arg1;
									if (local253 < 0) {
										local253 = 0;
									} else if (super.anInt9341 <= local253) {
										local253 = super.anInt9341;
									}
									if (arg4 < 0) {
										local249 = 0;
									} else if (super.anInt9341 <= arg4) {
										local249 = super.anInt9341;
									}
									local108 = arg1 + 64;
									if (arg1 < 0) {
										local100 = 0;
									} else if (super.anInt9338 <= arg1) {
										local100 = super.anInt9338;
									}
									if (local108 < 0) {
										local108 = 0;
									} else if (local108 >= super.anInt9338) {
										local108 = super.anInt9338;
									}
									while (local253 > local249) {
										while (local108 > local100) {
											super.aByteArrayArrayArray17[local51][local249][local100] = super.aByteArrayArrayArray17[local51 - 1][local249][local100];
											local100++;
										}
										local249++;
									}
								}
							}
						}
					} else if (arg2 == null) {
						arg0.anInt10282 += 10;
					} else {
						arg2[0] = arg0.method8414();
						arg2[1] = arg0.method8444();
						arg2[2] = arg0.method8444();
						arg2[3] = arg0.method8444();
						arg2[4] = arg0.method8414();
					}
				}
			}
			if (local25 != null) {
				for (local32 = 0; local32 < 8; local32++) {
					for (local51 = 0; local51 < 8; local51++) {
						local55 = (arg4 >> 3) + local32;
						local249 = local51 + (arg1 >> 3);
						if (local55 >= 0 && super.anInt9341 >> 3 > local55 && local249 >= 0 && super.anInt9338 >> 3 > local249) {
							Static406.method6409(local55, local249, local25);
						}
					}
				}
			}
			if (!local17 && super.aByteArrayArrayArray17 != null) {
				for (local32 = 0; local32 < 4; local32++) {
					if (super.aByteArrayArrayArray17[local32] != null) {
						for (local51 = 0; local51 < 16; local51++) {
							for (local55 = 0; local55 < 16; local55++) {
								local249 = (arg4 >> 2) + local51;
								local253 = (arg1 >> 2) + local55;
								if (local249 >= 0 && local249 < 26 && local253 >= 0 && local253 < 26) {
									super.aByteArrayArrayArray17[local32][local249][local253] = 0;
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
}
