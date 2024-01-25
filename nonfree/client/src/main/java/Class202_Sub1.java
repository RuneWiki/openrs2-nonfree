import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class202_Sub1 extends Class202 {

	@OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
	public int anInt6810 = 99;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(IIIZ)V")
	public Class202_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static539.aClass339_6, Static165.aClass25_3);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!iaa;Lclient!oa;II[II)V")
	public void method5736(@OriginalArg(0) Class6_Sub26 arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (super.aBoolean511) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class348 local13 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			@Pc(41) int local41;
			@Pc(101) int local101;
			@Pc(105) int local105;
			@Pc(45) int local45;
			@Pc(93) int local93;
			label307: do {
				while (true) {
					@Pc(29) int local29;
					@Pc(244) int local244;
					@Pc(248) int local248;
					while (arg0.aByteArray65.length > arg0.anInt5769) {
						local29 = arg0.method4966();
						if (local29 == 0) {
							local13 = new Class348(arg0);
						} else {
							if (local29 == 1) {
								local41 = arg0.method4966();
								continue label307;
							}
							if (local29 == 2) {
								if (local13 == null) {
									local13 = new Class348();
								}
								local13.method8091(arg0);
							} else if (local29 != 128) {
								if (local29 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray15 == null) {
									super.aByteArrayArrayArray15 = new byte[4][][];
								}
								for (local41 = 0; local41 < 4; local41++) {
									@Pc(232) byte local232 = arg0.method4972();
									if (local232 == 0 && super.aByteArrayArrayArray15[local41] != null) {
										local244 = arg2;
										local248 = arg2 + 64;
										local93 = arg3;
										local101 = arg3 + 64;
										if (arg3 < 0) {
											local93 = 0;
										} else if (arg3 >= super.anInt6805) {
											local93 = super.anInt6805;
										}
										if (local248 < 0) {
											local248 = 0;
										} else if (super.anInt6791 <= local248) {
											local248 = super.anInt6791;
										}
										if (arg2 < 0) {
											local244 = 0;
										} else if (super.anInt6791 <= arg2) {
											local244 = super.anInt6791;
										}
										if (local101 < 0) {
											local101 = 0;
										} else if (super.anInt6805 <= local101) {
											local101 = super.anInt6805;
										}
										while (local248 > local244) {
											while (local101 > local93) {
												super.aByteArrayArrayArray15[local41][local244][local93] = 0;
												local93++;
											}
											local244++;
										}
									} else if (local232 == 1) {
										if (super.aByteArrayArrayArray15[local41] == null) {
											super.aByteArrayArrayArray15[local41] = new byte[super.anInt6791 + 1][super.anInt6805 + 1];
										}
										for (local244 = 0; local244 < 64; local244 += 4) {
											for (local248 = 0; local248 < 64; local248 += 4) {
												@Pc(519) byte local519 = arg0.method4972();
												for (local101 = local244 + arg2; local101 < local244 + arg2 + 4; local101++) {
													for (local105 = arg3 + local248; local105 < arg3 + local248 + 4; local105++) {
														if (local101 >= 0 && local101 < super.anInt6791 && local105 >= 0 && local105 < super.anInt6805) {
															super.aByteArrayArrayArray15[local41][local101][local105] = local519;
														}
													}
												}
											}
										}
									} else if (local232 == 2) {
										if (super.aByteArrayArrayArray15[local41] == null) {
											super.aByteArrayArrayArray15[local41] = new byte[super.anInt6791 + 1][super.anInt6805 + 1];
										}
										if (local41 > 0) {
											local244 = arg2;
											local248 = arg2 + 64;
											local93 = arg3;
											if (arg3 < 0) {
												local93 = 0;
											} else if (super.anInt6805 <= arg3) {
												local93 = super.anInt6805;
											}
											if (arg2 < 0) {
												local244 = 0;
											} else if (arg2 >= super.anInt6791) {
												local244 = super.anInt6791;
											}
											local101 = arg3 + 64;
											if (local248 < 0) {
												local248 = 0;
											} else if (local248 >= super.anInt6791) {
												local248 = super.anInt6791;
											}
											if (local101 < 0) {
												local101 = 0;
											} else if (local101 >= super.anInt6805) {
												local101 = super.anInt6805;
											}
											while (local248 > local244) {
												while (local93 < local101) {
													super.aByteArrayArrayArray15[local41][local244][local93] = super.aByteArrayArrayArray15[local41 - 1][local244][local93];
													local93++;
												}
												local244++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg4 == null) {
								arg0.anInt5769 += 10;
							} else {
								arg4[0] = arg0.method4999();
								arg4[1] = arg0.method4974();
								arg4[2] = arg0.method4974();
								arg4[3] = arg0.method4974();
								arg4[4] = arg0.method4999();
							}
						}
					}
					if (local13 != null) {
						for (local29 = 0; local29 < 8; local29++) {
							for (local41 = 0; local41 < 8; local41++) {
								local45 = (arg2 >> 3) + local29;
								local244 = (arg3 >> 3) + local41;
								if (local45 >= 0 && local45 < super.anInt6791 >> 3 && local244 >= 0 && local244 < super.anInt6805 >> 3) {
									Static88.method1971(local244, local45, local13);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray15 != null) {
						for (local29 = 0; local29 < 4; local29++) {
							if (super.aByteArrayArrayArray15[local29] != null) {
								for (local41 = 0; local41 < 16; local41++) {
									for (local45 = 0; local45 < 16; local45++) {
										local244 = local41 + (arg2 >> 2);
										local248 = local45 + (arg3 >> 2);
										if (local244 >= 0 && local244 < 26 && local248 >= 0 && local248 < 26) {
											super.aByteArrayArrayArray15[local29][local244][local248] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local41 <= 0);
			for (local45 = 0; local45 < local41; local45++) {
				@Pc(54) Class342 local54 = new Class342(arg1, arg0, 2);
				if (local54.anInt9577 == 31) {
					@Pc(65) Class167 local65 = Static116.aClass110_1.method2921(arg0.method4999());
					local54.method7986(local65.anInt5120, local65.anInt5114, local65.anInt5111, local65.anInt5112);
				}
				if (arg1.method5427() > 0) {
					@Pc(85) Class6_Sub29 local85 = local54.aClass6_Sub29_2;
					local93 = local85.method6164() + (arg2 << 9);
					local101 = (arg3 << 9) + local85.method6165();
					local105 = local93 >> 9;
					@Pc(109) int local109 = local101 >> 9;
					if (local105 >= 0 && local109 >= 0 && local105 < super.anInt6791 && super.anInt6805 > local109) {
						local85.method6162(local93, super.anIntArrayArrayArray15[local54.anInt9576][local105][local109] - local85.method6161(), local101);
						Static569.method8024(local54);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIILclient!oa;[B[Lclient!le;III)V")
	public void method5738(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class9 arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) Class194[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class6_Sub26 local10 = new Class6_Sub26(arg5);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method4947();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method4973();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local10.method4966();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (local58 == arg1 && local54 >= arg2 && local54 < arg2 + 8 && local48 >= arg0 && local48 < arg0 + 8) {
					@Pc(106) Class31 local106 = Static480.aClass57_11.method1469(local17);
					@Pc(123) int local123 = Static448.method6875(arg3, local54 & 0x7, local106.anInt1109, local70, local106.anInt1058, local48 & 0x7) + arg7;
					@Pc(140) int local140 = Static240.method4629(local70, local106.anInt1109, local48 & 0x7, local106.anInt1058, local54 & 0x7, arg3) + arg8;
					if (local123 > 0 && local140 > 0 && local123 < super.anInt6791 - 1 && super.anInt6805 - 1 > local140) {
						@Pc(162) Class194 local162 = null;
						if (!super.aBoolean511) {
							@Pc(167) int local167 = arg9;
							if ((Static356.aByteArrayArrayArray17[1][local123][local140] & 0x2) == 2) {
								local167 = arg9 - 1;
							}
							if (local167 >= 0) {
								local162 = arg6[local167];
							}
						}
						this.method5739(arg9, local162, arg9, local17, local140, local66, -1, arg4, arg3 + local70 & 0x3, local123);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZILclient!le;IIIIILclient!oa;II)V")
	public void method5739(@OriginalArg(1) int arg0, @OriginalArg(2) Class194 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class9 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static104.aClass6_Sub6_Sub1_4.method1075(Static5.anInt145) && !Static400.method6292(arg4, arg9, arg0, Static410.anInt7667)) {
			return;
		}
		if (arg2 < this.anInt6810) {
			this.anInt6810 = arg2;
		}
		@Pc(30) Class31 local30 = Static480.aClass57_11.method1469(arg3);
		if (arg7.method5447() && Static104.aClass6_Sub6_Sub1_4.aBoolean135 && local30.aBoolean92) {
			return;
		}
		@Pc(49) int local49;
		@Pc(52) int local52;
		if (arg8 == 1 || arg8 == 3) {
			local49 = local30.anInt1058;
			local52 = local30.anInt1109;
		} else {
			local49 = local30.anInt1109;
			local52 = local30.anInt1058;
		}
		@Pc(69) int local69;
		@Pc(73) int local73;
		if (super.anInt6791 < arg9 + local49) {
			local69 = arg9;
			local73 = arg9 + 1;
		} else {
			local73 = arg9 + (local49 + 1 >> 1);
			local69 = (local49 >> 1) + arg9;
		}
		@Pc(105) int local105;
		@Pc(103) int local103;
		if (local52 + arg4 > super.anInt6805) {
			local103 = arg4 + 1;
			local105 = arg4;
		} else {
			local105 = arg4 + (local52 >> 1);
			local103 = arg4 + (local52 + 1 >> 1);
		}
		@Pc(125) Class62 local125 = Static47.aClass62Array1[arg0];
		@Pc(149) int local149 = local125.JA(local69, local105) + local125.JA(local73, local105) + local125.JA(local69, local103) + local125.JA(local73, local103) >> 2;
		@Pc(158) int local158 = (arg9 << 9) + (local49 << 8);
		@Pc(166) int local166 = (local52 << 8) + (arg4 << 9);
		@Pc(178) boolean local178 = Static6.aBoolean17 && !super.aBoolean511 && local30.aBoolean98;
		if (local30.method1036()) {
			Static503.method7509(arg8, arg4, local30, arg9, arg2, null, null);
		}
		@Pc(212) boolean local212 = arg6 == -1 && local30.anInt1101 == -1 && local30.anIntArray73 == null && local30.anIntArray69 == null && !local30.aBoolean99;
		if (Static490.aBoolean665 && (Static498.method7457(arg5) && local30.anInt1081 != 1 || !(!Static492.method7381(arg5) || local30.anInt1081 != 0))) {
			return;
		}
		if (arg5 != 22) {
			@Pc(374) Class11_Sub1 local374;
			@Pc(341) Class11_Sub1_Sub3 local341;
			@Pc(380) int local380;
			if (arg5 == 10 || arg5 == 11) {
				local341 = null;
				if (local212) {
					@Pc(372) Class11_Sub1_Sub3 local372 = new Class11_Sub1_Sub3(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg9, local49 + arg9 - 1, arg4, arg4 + local52 - 1, arg5, arg8, local178);
					local374 = local372;
					local341 = local372;
					local380 = local372.method3758();
				} else {
					local374 = new Class11_Sub1_Sub6(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg9, local49 + arg9 - 1, arg4, arg4 + local52 - 1, arg5, arg8, arg6);
					local380 = 15;
				}
				@Pc(424) Class11_Sub1 local424 = Static178.method3532(arg2, arg9, arg4, ql.class);
				@Pc(426) boolean local426 = false;
				if (local424 instanceof Class11_Sub1_Sub4 && arg9 == local424.aShort78 && local424.aShort80 == arg4) {
					((Class11_Sub1_Sub4) local424).aClass11_Sub1_1 = local374;
					local426 = true;
				}
				if (local426 || Static88.method1973(local374, false)) {
					if (local341 != null && local341.method8116()) {
						local341.method8120(arg7);
					}
					if (local30.aBoolean97 && Static6.aBoolean17) {
						if (local380 > 30) {
							local380 = 30;
						}
						for (@Pc(479) int local479 = 0; local479 <= local49; local479++) {
							for (@Pc(483) int local483 = 0; local483 <= local52; local483++) {
								local125.EA(arg9 + local479, arg4 - -local483, local380);
							}
						}
					}
				}
				if (local30.anInt1093 != 0 && arg1 != null) {
					arg1.method4810(local30.aBoolean101, arg9, local49, arg4, local52, !local30.aBoolean87);
				}
			} else {
				@Pc(640) Class11_Sub1 local640;
				if (arg5 >= 12 && arg5 <= 17 || arg5 >= 18 && arg5 <= 21) {
					if (local212) {
						local341 = new Class11_Sub1_Sub3(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg9, arg9 + local49 - 1, arg4, arg4 + local52 - 1, arg5, arg8, local178);
						local374 = local341;
						if (local341.method8116()) {
							local341.method8120(arg7);
						}
					} else {
						local374 = new Class11_Sub1_Sub6(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg9, arg9 + local49 - 1, arg4, local52 + arg4 - 1, arg5, arg8, arg6);
					}
					local640 = Static178.method3532(arg2, arg9, arg4, ql.class);
					if (local640 instanceof Class11_Sub1_Sub4 && arg9 == local640.aShort78 && arg4 == local640.aShort80) {
						((Class11_Sub1_Sub4) local640).aClass11_Sub1_1 = local374;
					} else {
						Static88.method1973(local374, false);
					}
					if (Static6.aBoolean17 && !super.aBoolean511 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg2 > 0 && local30.anInt1081 != 0) {
						super.aByteArrayArrayArray14[arg2][arg9][arg4] = (byte) (super.aByteArrayArrayArray14[arg2][arg9][arg4] | 0x4);
					}
					if (local30.anInt1093 != 0 && arg1 != null) {
						arg1.method4810(local30.aBoolean101, arg9, local49, arg4, local52, !local30.aBoolean87);
					}
				} else {
					@Pc(764) Class11_Sub4 local764;
					if (arg5 == 0) {
						@Pc(737) int local737 = local30.anInt1081;
						if (Static149.aBoolean473 && local30.anInt1081 == -1) {
							local737 = 1;
						}
						if (local212) {
							@Pc(781) Class11_Sub4_Sub2 local781 = new Class11_Sub4_Sub2(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, arg5, arg8, local178);
							if (local781.method8116()) {
								local781.method8120(arg7);
							}
							local764 = local781;
						} else {
							local764 = new Class11_Sub4_Sub1(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg5, arg8, arg6);
						}
						@Pc(796) Class11_Sub4 local796 = Static298.method4853(arg2, arg9, arg4);
						if (local796 instanceof Class11_Sub4_Sub3) {
							((Class11_Sub4_Sub3) local796).aClass11_Sub4_1 = local764;
						} else {
							Static253.method4433(arg2, arg9, arg4, local764, null);
						}
						if (Static6.aBoolean17) {
							if (arg8 == 0) {
								if (local30.aBoolean97) {
									local125.EA(arg9, arg4, 50);
									local125.EA(arg9, arg4 + 1, 50);
								}
								if (local737 == 1 && !super.aBoolean511) {
									super.aByteArrayArrayArray14[arg2][arg9][arg4] = (byte) (super.aByteArrayArrayArray14[arg2][arg9][arg4] | 0x1);
								}
							} else if (arg8 == 1) {
								if (local30.aBoolean97) {
									local125.EA(arg9, arg4 + 1, 50);
									local125.EA(arg9 + 1, arg4 - -1, 50);
								}
								if (local737 == 1 && !super.aBoolean511) {
									super.aByteArrayArrayArray14[arg2][arg9][arg4 + 1] = (byte) (super.aByteArrayArrayArray14[arg2][arg9][arg4 + 1] | 0x2);
								}
							} else if (arg8 == 2) {
								if (local30.aBoolean97) {
									local125.EA(arg9 + 1, arg4, 50);
									local125.EA(arg9 + 1, arg4 + 1, 50);
								}
								if (local737 == 1 && !super.aBoolean511) {
									super.aByteArrayArrayArray14[arg2][arg9 + 1][arg4] = (byte) (super.aByteArrayArrayArray14[arg2][arg9 + 1][arg4] | 0x1);
								}
							} else if (arg8 == 3) {
								if (local30.aBoolean97) {
									local125.EA(arg9, arg4, 50);
									local125.EA(arg9 + 1, arg4, 50);
								}
								if (local737 == 1 && !super.aBoolean511) {
									super.aByteArrayArrayArray14[arg2][arg9][arg4] = (byte) (super.aByteArrayArrayArray14[arg2][arg9][arg4] | 0x2);
								}
							}
						}
						if (local30.anInt1093 != 0 && arg1 != null) {
							arg1.method4798(arg9, arg8, !local30.aBoolean87, arg4, local30.aBoolean101, arg5);
						}
						if (local30.anInt1065 != 64) {
							Static141.method2649(arg2, arg9, arg4, local30.anInt1065);
						}
					} else {
						@Pc(1070) Class11_Sub4_Sub2 local1070;
						@Pc(1080) Class11_Sub4 local1080;
						if (arg5 == 1) {
							if (local212) {
								local1070 = new Class11_Sub4_Sub2(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, arg5, arg8, local178);
								if (local1070.method8116()) {
									local1070.method8120(arg7);
								}
								local1080 = local1070;
							} else {
								local1080 = new Class11_Sub4_Sub1(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg5, arg8, arg6);
							}
							local764 = Static298.method4853(arg2, arg9, arg4);
							if (local764 instanceof Class11_Sub4_Sub3) {
								((Class11_Sub4_Sub3) local764).aClass11_Sub4_1 = local1080;
							} else {
								Static253.method4433(arg2, arg9, arg4, local1080, null);
							}
							if (local30.aBoolean97 && Static6.aBoolean17) {
								if (arg8 == 0) {
									local125.EA(arg9, arg4 + 1, 50);
								} else if (arg8 == 1) {
									local125.EA(arg9 + 1, arg4 - -1, 50);
								} else if (arg8 == 2) {
									local125.EA(arg9 + 1, arg4, 50);
								} else if (arg8 == 3) {
									local125.EA(arg9, arg4, 50);
								}
							}
							if (local30.anInt1093 != 0 && arg1 != null) {
								arg1.method4798(arg9, arg8, !local30.aBoolean87, arg4, local30.aBoolean101, arg5);
							}
						} else if (arg5 == 2) {
							local380 = arg8 + 1 & 0x3;
							if (local212) {
								@Pc(1262) Class11_Sub4_Sub2 local1262 = new Class11_Sub4_Sub2(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, arg5, arg8 + 4, local178);
								@Pc(1277) Class11_Sub4_Sub2 local1277 = new Class11_Sub4_Sub2(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, arg5, local380, local178);
								if (local1262.method8116()) {
									local1262.method8120(arg7);
								}
								local764 = local1277;
								if (local1277.method8116()) {
									local1277.method8120(arg7);
								}
								local1080 = local1262;
							} else {
								local1080 = new Class11_Sub4_Sub1(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg5, arg8 + 4, arg6);
								local764 = new Class11_Sub4_Sub1(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg5, local380, arg6);
							}
							Static253.method4433(arg2, arg9, arg4, local1080, local764);
							if (local30.anInt1081 == 1 && Static6.aBoolean17 && !super.aBoolean511) {
								if (arg8 == 0) {
									super.aByteArrayArrayArray14[arg2][arg9][arg4] = (byte) (super.aByteArrayArrayArray14[arg2][arg9][arg4] | 0x1);
									super.aByteArrayArrayArray14[arg2][arg9][arg4 + 1] = (byte) (super.aByteArrayArrayArray14[arg2][arg9][arg4 + 1] | 0x2);
								} else if (arg8 == 1) {
									super.aByteArrayArrayArray14[arg2][arg9][arg4 + 1] = (byte) (super.aByteArrayArrayArray14[arg2][arg9][arg4 + 1] | 0x2);
									super.aByteArrayArrayArray14[arg2][arg9 + 1][arg4] = (byte) (super.aByteArrayArrayArray14[arg2][arg9 + 1][arg4] | 0x1);
								} else if (arg8 == 2) {
									super.aByteArrayArrayArray14[arg2][arg9 + 1][arg4] = (byte) (super.aByteArrayArrayArray14[arg2][arg9 + 1][arg4] | 0x1);
									super.aByteArrayArrayArray14[arg2][arg9][arg4] = (byte) (super.aByteArrayArrayArray14[arg2][arg9][arg4] | 0x2);
								} else if (arg8 == 3) {
									super.aByteArrayArrayArray14[arg2][arg9][arg4] = (byte) (super.aByteArrayArrayArray14[arg2][arg9][arg4] | 0x2);
									super.aByteArrayArrayArray14[arg2][arg9][arg4] = (byte) (super.aByteArrayArrayArray14[arg2][arg9][arg4] | 0x1);
								}
							}
							if (local30.anInt1093 != 0 && arg1 != null) {
								arg1.method4798(arg9, arg8, !local30.aBoolean87, arg4, local30.aBoolean101, arg5);
							}
							if (local30.anInt1065 != 64) {
								Static141.method2649(arg2, arg9, arg4, local30.anInt1065);
							}
						} else if (arg5 == 3) {
							if (local212) {
								local1070 = new Class11_Sub4_Sub2(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, arg5, arg8, local178);
								if (local1070.method8116()) {
									local1070.method8120(arg7);
								}
								local1080 = local1070;
							} else {
								local1080 = new Class11_Sub4_Sub1(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg5, arg8, arg6);
							}
							local764 = Static298.method4853(arg2, arg9, arg4);
							if (local764 instanceof Class11_Sub4_Sub3) {
								((Class11_Sub4_Sub3) local764).aClass11_Sub4_1 = local1080;
							} else {
								Static253.method4433(arg2, arg9, arg4, local1080, null);
							}
							if (local30.aBoolean97 && Static6.aBoolean17) {
								if (arg8 == 0) {
									local125.EA(arg9, arg4 + 1, 50);
								} else if (arg8 == 1) {
									local125.EA(arg9 + 1, arg4 + 1, 50);
								} else if (arg8 == 2) {
									local125.EA(arg9 + 1, arg4, 50);
								} else if (arg8 == 3) {
									local125.EA(arg9, arg4, 50);
								}
							}
							if (local30.anInt1093 != 0 && arg1 != null) {
								arg1.method4798(arg9, arg8, !local30.aBoolean87, arg4, local30.aBoolean101, arg5);
							}
						} else if (arg5 == 9) {
							if (local212) {
								local341 = new Class11_Sub1_Sub3(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg9, arg9, arg4, arg4, arg5, arg8, local178);
								if (local341.method8116()) {
									local341.method8120(arg7);
								}
								local374 = local341;
							} else {
								local374 = new Class11_Sub1_Sub6(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg9, local49 + arg9 - 1, arg4, local52 + arg4 - 1, arg5, arg8, arg6);
							}
							local640 = Static178.method3532(arg2, arg9, arg4, ql.class);
							if (local640 instanceof Class11_Sub1_Sub4 && arg9 == local640.aShort78 && arg4 == local640.aShort80) {
								((Class11_Sub1_Sub4) local640).aClass11_Sub1_1 = local374;
							} else {
								Static88.method1973(local374, false);
							}
							if (local30.anInt1093 != 0 && arg1 != null) {
								arg1.method4810(local30.aBoolean101, arg9, local49, arg4, local52, !local30.aBoolean87);
							}
							if (local30.anInt1065 != 64) {
								Static141.method2649(arg2, arg9, arg4, local30.anInt1065);
							}
						} else {
							@Pc(1846) Class11_Sub3 local1846;
							if (arg5 == 4) {
								if (local212) {
									@Pc(1844) Class11_Sub3_Sub1 local1844 = new Class11_Sub3_Sub1(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, 0, 0, 0, arg5, arg8);
									local1846 = local1844;
									if (local1844.method8116()) {
										local1844.method8120(arg7);
									}
								} else {
									local1846 = new Class11_Sub3_Sub2(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, 0, 0, 0, arg5, arg8, arg6);
								}
								@Pc(1880) Class11_Sub3 local1880 = Static541.method7782(arg2, arg9, arg4);
								if (local1880 instanceof Class11_Sub3_Sub3) {
									((Class11_Sub3_Sub3) local1880).aClass11_Sub3_3 = local1846;
								} else {
									Static163.method3315(arg2, arg9, arg4, local1846, null);
								}
							} else {
								@Pc(1900) int local1900;
								@Pc(1906) Interface17 local1906;
								@Pc(1974) Class11_Sub3_Sub1 local1974;
								@Pc(1989) Class11_Sub3 local1989;
								if (arg5 == 5) {
									local1900 = 65;
									local1906 = (Interface17) Static298.method4853(arg2, arg9, arg4);
									if (local1906 != null) {
										local1900 = Static480.aClass57_11.method1469(local1906.method8114()).anInt1065 + 1;
									}
									if (local212) {
										local1974 = new Class11_Sub3_Sub1(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, 0, local1900 * Static17.anIntArray53[arg8], Static300.anIntArray423[arg8] * local1900, arg5, arg8);
										if (local1974.method8116()) {
											local1974.method8120(arg7);
										}
										local1846 = local1974;
									} else {
										local1846 = new Class11_Sub3_Sub2(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, 0, Static17.anIntArray53[arg8] * local1900, local1900 * Static300.anIntArray423[arg8], arg5, arg8, arg6);
									}
									local1989 = Static541.method7782(arg2, arg9, arg4);
									if (local1989 instanceof Class11_Sub3_Sub3) {
										((Class11_Sub3_Sub3) local1989).aClass11_Sub3_3 = local1846;
									} else {
										Static163.method3315(arg2, arg9, arg4, local1846, null);
									}
								} else if (arg5 == 6) {
									local1900 = 33;
									local1906 = (Interface17) Static298.method4853(arg2, arg9, arg4);
									if (local1906 != null) {
										local1900 = Static480.aClass57_11.method1469(local1906.method8114()).anInt1065 / 2 + 1;
									}
									if (local212) {
										local1974 = new Class11_Sub3_Sub1(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, arg8, local1900 * Static17.anIntArray53[arg8], Static300.anIntArray423[arg8] * local1900, arg5, arg8 + 4);
										if (local1974.method8116()) {
											local1974.method8120(arg7);
										}
										local1846 = local1974;
									} else {
										local1846 = new Class11_Sub3_Sub2(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg8, local1900 * Static163.anIntArray243[arg8], Static566.anIntArray825[arg8] * local1900, arg5, arg8 + 4, arg6);
									}
									local1989 = Static541.method7782(arg2, arg9, arg4);
									if (local1989 instanceof Class11_Sub3_Sub3) {
										((Class11_Sub3_Sub3) local1989).aClass11_Sub3_3 = local1846;
									} else {
										Static163.method3315(arg2, arg9, arg4, local1846, null);
									}
								} else if (arg5 == 7) {
									local1900 = arg8 + 2 & 0x3;
									if (local212) {
										@Pc(2149) Class11_Sub3_Sub1 local2149 = new Class11_Sub3_Sub1(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, local1900, 0, 0, arg5, local1900 + 4);
										if (local2149.method8116()) {
											local2149.method8120(arg7);
										}
										local1846 = local2149;
									} else {
										local1846 = new Class11_Sub3_Sub2(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, local1900, 0, 0, arg5, local1900 + 4, arg6);
									}
									@Pc(2187) Class11_Sub3 local2187 = Static541.method7782(arg2, arg9, arg4);
									if (local2187 instanceof Class11_Sub3_Sub3) {
										((Class11_Sub3_Sub3) local2187).aClass11_Sub3_3 = local1846;
									} else {
										Static163.method3315(arg2, arg9, arg4, local1846, null);
									}
								} else if (arg5 == 8) {
									local380 = arg8 + 2 & 0x3;
									@Pc(2213) int local2213 = 33;
									@Pc(2219) Interface17 local2219 = (Interface17) Static298.method4853(arg2, arg9, arg4);
									if (local2219 != null) {
										local2213 = Static480.aClass57_11.method1469(local2219.method8114()).anInt1065 / 2 + 1;
									}
									@Pc(2262) Class11_Sub3 local2262;
									@Pc(2281) Class11_Sub3 local2281;
									if (local212) {
										local2262 = new Class11_Sub3_Sub1(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, arg8, local2213 * Static163.anIntArray243[arg8], Static566.anIntArray825[arg8] * local2213, arg5, arg8 + 4);
										local2281 = new Class11_Sub3_Sub1(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, arg8, 0, 0, arg5, local380 + 4);
										if (local2262.method8116()) {
											local2262.method8120(arg7);
										}
										if (local2281.method8116()) {
											local2281.method8120(arg7);
										}
									} else {
										local2262 = new Class11_Sub3_Sub2(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg8, local2213 * Static163.anIntArray243[arg8], Static566.anIntArray825[arg8] * local2213, arg5, arg8 + 4, arg6);
										local2281 = new Class11_Sub3_Sub2(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg8, 0, 0, arg5, local380 + 4, arg6);
									}
									Static163.method3315(arg2, arg9, arg4, local2262, local2281);
								}
							}
						}
					}
				}
			}
		} else if (Static104.aClass6_Sub6_Sub1_4.aBoolean121 || local30.anInt1107 != 0 || local30.anInt1093 == 1 || local30.aBoolean91) {
			@Pc(272) Class11_Sub5 local272;
			if (local212) {
				@Pc(288) Class11_Sub5_Sub1 local288 = new Class11_Sub5_Sub1(arg7, local30, arg0, local158, local149, local166, super.aBoolean511, arg8, local178);
				if (local288.method8116()) {
					local288.method8120(arg7);
				}
				local272 = local288;
			} else {
				local272 = new Class11_Sub5_Sub3(arg7, local30, arg2, arg0, local158, local149, local166, super.aBoolean511, arg8, arg6);
			}
			@Pc(303) Class11_Sub5 local303 = Static216.method3980(arg2, arg9, arg4);
			if (local303 instanceof Class11_Sub5_Sub2) {
				((Class11_Sub5_Sub2) local303).aClass11_Sub5_1 = local272;
			} else {
				Static248.method4389(arg2, arg9, arg4, local272);
			}
			if (local30.anInt1093 == 1 && arg1 != null) {
				arg1.method4802(arg4, arg9);
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "([IILclient!oa;ILclient!iaa;IIIIII)V")
	public void method5740(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class9 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class6_Sub26 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean511) {
			return;
		}
		@Pc(21) Class348 local21 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(33) int local33 = (arg3 & 0x7) * 8;
		@Pc(39) int local39 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(44) int local44;
			@Pc(81) int local81;
			@Pc(102) int local102;
			@Pc(418) int local418;
			while (arg4.anInt5769 < arg4.aByteArray65.length) {
				local44 = arg4.method4966();
				if (local44 == 0) {
					local21 = new Class348(arg4);
				} else {
					@Pc(112) int local112;
					@Pc(249) int local249;
					@Pc(283) int local283;
					@Pc(108) int local108;
					if (local44 == 1) {
						local81 = arg4.method4966();
						if (local81 > 0) {
							for (local418 = 0; local418 < local81; local418++) {
								@Pc(427) Class342 local427 = new Class342(arg2, arg4, 2);
								if (local427.anInt9577 == 31) {
									@Pc(438) Class167 local438 = Static116.aClass110_1.method2921(arg4.method4999());
									local427.method7986(local438.anInt5120, local438.anInt5114, local438.anInt5111, local438.anInt5112);
								}
								if (arg2.method5427() > 0) {
									@Pc(458) Class6_Sub29 local458 = local427.aClass6_Sub29_2;
									local108 = local458.method6164() >> 9;
									local112 = local458.method6165() >> 9;
									if (local427.anInt9576 == arg5 && local33 <= local108 && local108 < local33 + 8 && local112 >= local39 && local112 < local39 + 8) {
										local249 = (arg8 << 9) + Static240.method4639(local458.method6164() & 0xFFF, local458.method6165() & 0xFFF, arg9);
										local108 = local249 >> 9;
										local283 = Static120.method2377(local458.method6164() & 0xFFF, arg9, local458.method6165() & 0xFFF) + (arg1 << 9);
										local112 = local283 >> 9;
										if (local108 >= 0 && local112 >= 0 && local108 < super.anInt6791 && super.anInt6805 > local112) {
											local458.method6162(local249, super.anIntArrayArrayArray15[arg5][local108][local112] - local458.method6161(), local283);
											Static569.method8024(local427);
										}
									}
								}
							}
						}
					} else if (local44 == 2) {
						if (local21 == null) {
							local21 = new Class348();
						}
						local21.method8091(arg4);
					} else if (local44 != 128) {
						if (local44 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						for (local81 = 0; local81 < 4; local81++) {
							@Pc(87) byte local87 = arg4.method4972();
							@Pc(106) int local106;
							if (local87 == 0 && super.aByteArrayArrayArray15[arg6] != null) {
								if (local81 <= arg5) {
									local102 = arg8;
									local106 = arg8 + 7;
									local108 = arg1;
									local112 = arg1 + 7;
									if (local106 < 0) {
										local106 = 0;
									} else if (super.anInt6791 <= local106) {
										local106 = super.anInt6791;
									}
									if (arg1 < 0) {
										local108 = 0;
									} else if (arg1 >= super.anInt6805) {
										local108 = super.anInt6805;
									}
									if (arg8 < 0) {
										local102 = 0;
									} else if (super.anInt6791 <= arg8) {
										local102 = super.anInt6791;
									}
									if (local112 < 0) {
										local112 = 0;
									} else if (super.anInt6805 <= local112) {
										local112 = super.anInt6805;
									}
									while (local102 < local106) {
										while (local112 > local108) {
											super.aByteArrayArrayArray15[arg6][local102][local108] = 0;
											local108++;
										}
										local102++;
									}
								}
							} else if (local87 == 1) {
								if (super.aByteArrayArrayArray15[arg6] == null) {
									super.aByteArrayArrayArray15[arg6] = new byte[super.anInt6791 + 1][super.anInt6805 + 1];
								}
								for (local102 = 0; local102 < 64; local102 += 4) {
									for (local106 = 0; local106 < 64; local106 += 4) {
										@Pc(240) byte local240 = arg4.method4972();
										if (local81 <= arg5) {
											for (local112 = local102; local112 < local102 + 4; local112++) {
												for (local249 = local106; local249 < local106 + 4; local249++) {
													if (local33 <= local112 && local33 + 8 > local112 && local39 <= local249 && local39 < local39 + 8) {
														local283 = Static466.method7187(arg9, local249 & 0x7, local112 & 0x7) + arg8;
														@Pc(295) int local295 = Static66.method1375(local112 & 0x7, arg9, local249 & 0x7) + arg1;
														if (local283 >= 0 && local283 < super.anInt6791 && local295 >= 0 && local295 < super.anInt6805) {
															super.aByteArrayArrayArray15[arg6][local283][local295] = local240;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg0 == null) {
						arg4.anInt5769 += 10;
					} else {
						arg0[0] = arg4.method4999();
						arg0[1] = arg4.method4974();
						arg0[2] = arg4.method4974();
						arg0[3] = arg4.method4974();
						arg0[4] = arg4.method4999();
					}
				}
			}
			if (local21 != null) {
				Static88.method1971(arg1 >> 3, arg8 >> 3, local21);
			}
			if (super.aByteArrayArrayArray15 != null && super.aByteArrayArrayArray15[arg6] != null) {
				local44 = arg8 + 7;
				local81 = arg1 + 7;
				for (local418 = arg8; local418 < local44; local418++) {
					for (local102 = arg1; local102 < local81; local102++) {
						super.aByteArrayArrayArray15[arg6][local418][local102] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method5741(@OriginalArg(0) Class9 arg0) {
		Static380.method5985(arg0);
		@Pc(26) int local26;
		@Pc(30) int local30;
		if (super.anInt6804 > 1) {
			for (local26 = 0; super.anInt6791 > local26; local26++) {
				for (local30 = 0; super.anInt6805 > local30; local30++) {
					if ((Static356.aByteArrayArrayArray17[1][local26][local30] & 0x2) == 2) {
						Static402.method8051(local26, local30);
					}
				}
			}
		}
		for (local26 = 0; local26 < super.anInt6804; local26++) {
			for (local30 = 0; local30 <= super.anInt6805; local30++) {
				for (@Pc(68) int local68 = 0; super.anInt6791 >= local68; local68++) {
					@Pc(86) int local86;
					@Pc(88) int local88;
					@Pc(90) int local90;
					@Pc(92) int local92;
					@Pc(143) int local143;
					@Pc(234) int local234;
					@Pc(243) int local243;
					@Pc(263) int local263;
					@Pc(267) int local267;
					if ((super.aByteArrayArrayArray14[local26][local68][local30] & 0x1) != 0) {
						local86 = local30;
						local88 = local30;
						local90 = local26;
						local92 = local26;
						while (super.anInt6805 > local88 && (super.aByteArrayArrayArray14[local26][local68][local88 + 1] & 0x1) != 0) {
							local88++;
						}
						while (local86 > 0 && (super.aByteArrayArrayArray14[local26][local68][local86 - 1] & 0x1) != 0) {
							local86--;
						}
						label164: while (local90 > 0) {
							for (local143 = local86; local143 <= local88; local143++) {
								if ((super.aByteArrayArrayArray14[local90 - 1][local68][local143] & 0x1) == 0) {
									break label164;
								}
							}
							local90--;
						}
						label153: while (local92 < 3) {
							for (local143 = local86; local143 <= local88; local143++) {
								if ((super.aByteArrayArrayArray14[local92 + 1][local68][local143] & 0x1) == 0) {
									break label153;
								}
							}
							local92++;
						}
						local143 = (local92 + 1 - local90) * ((local88 + 1) - local86);
						if (local143 >= 2) {
							local234 = super.anIntArrayArrayArray15[local92][local68][local86] - 960;
							local243 = super.anIntArrayArrayArray15[local90][local68][local86];
							Static448.method6873(1, local68 << 9, local68 << 9, local86 << 9, (local88 << 9) + 512, local234, local243);
							for (local263 = local90; local263 <= local92; local263++) {
								for (local267 = local86; local267 <= local88; local267++) {
									super.aByteArrayArrayArray14[local263][local68][local267] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local26][local68][local30] & 0x2) != 0) {
						local86 = local68;
						local88 = local68;
						local90 = local26;
						while (local88 < super.anInt6791 && (super.aByteArrayArrayArray14[local26][local88 + 1][local30] & 0x2) != 0) {
							local88++;
						}
						local92 = local26;
						while (local86 > 0 && (super.aByteArrayArrayArray14[local26][local86 - 1][local30] & 0x2) != 0) {
							local86--;
						}
						label217: while (local90 > 0) {
							for (local143 = local86; local143 <= local88; local143++) {
								if ((super.aByteArrayArrayArray14[local90 - 1][local143][local30] & 0x2) == 0) {
									break label217;
								}
							}
							local90--;
						}
						label206: while (local92 < 3) {
							for (local143 = local86; local143 <= local88; local143++) {
								if ((super.aByteArrayArrayArray14[local92 + 1][local143][local30] & 0x2) == 0) {
									break label206;
								}
							}
							local92++;
						}
						local143 = (local92 + 1 - local90) * (local88 + 1 - local86);
						if (local143 >= 2) {
							local234 = super.anIntArrayArrayArray15[local92][local86][local30] - 960;
							local243 = super.anIntArrayArrayArray15[local90][local86][local30];
							Static448.method6873(2, local86 << 9, (local88 << 9) + 512, local30 << 9, local30 << 9, local234, local243);
							for (local263 = local90; local263 <= local92; local263++) {
								for (local267 = local86; local267 <= local88; local267++) {
									super.aByteArrayArrayArray14[local263][local267][local30] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local26][local68][local30] & 0x4) != 0) {
						local86 = local68;
						local88 = local68;
						local90 = local30;
						local92 = local30;
						while (local90 > 0 && (super.aByteArrayArrayArray14[local26][local68][local90 - 1] & 0x4) != 0) {
							local90--;
						}
						while (local92 < super.anInt6805 && (super.aByteArrayArrayArray14[local26][local68][local92 + 1] & 0x4) != 0) {
							local92++;
						}
						label271: while (local86 > 0) {
							for (local143 = local90; local143 <= local92; local143++) {
								if ((super.aByteArrayArrayArray14[local26][local86 - 1][local143] & 0x4) == 0) {
									break label271;
								}
							}
							local86--;
						}
						label260: while (super.anInt6791 > local88) {
							for (local143 = local90; local143 <= local92; local143++) {
								if ((super.aByteArrayArrayArray14[local26][local88 + 1][local143] & 0x4) == 0) {
									break label260;
								}
							}
							local88++;
						}
						if ((local92 + 1 - local90) * (local88 + 1 - local86) >= 4) {
							local143 = super.anIntArrayArrayArray15[local26][local86][local90];
							Static448.method6873(4, local86 << 9, (local88 << 9) + 512, local90 << 9, (local92 << 9) + 512, local143, local143);
							for (@Pc(721) int local721 = local86; local721 <= local88; local721++) {
								for (local234 = local90; local234 <= local92; local234++) {
									super.aByteArrayArrayArray14[local26][local721][local234] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!oa;[B[Lclient!le;II)V")
	public void method5742(@OriginalArg(0) int arg0, @OriginalArg(1) Class9 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class194[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class6_Sub26 local10 = new Class6_Sub26(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(18) int local18 = local10.method4947();
			if (local18 == 0) {
				return;
			}
			local12 += local18;
			@Pc(26) int local26 = 0;
			while (true) {
				@Pc(30) int local30 = local10.method4973();
				if (local30 == 0) {
					break;
				}
				local26 += local30 - 1;
				@Pc(42) int local42 = local26 & 0x3F;
				@Pc(48) int local48 = local26 >> 6 & 0x3F;
				@Pc(52) int local52 = local26 >> 12;
				@Pc(56) int local56 = local10.method4966();
				@Pc(60) int local60 = local56 >> 2;
				@Pc(64) int local64 = local56 & 0x3;
				@Pc(68) int local68 = arg0 + local48;
				@Pc(73) int local73 = local42 + arg4;
				if (local68 > 0 && local73 > 0 && super.anInt6791 - 1 > local68 && local73 < super.anInt6805 - 1) {
					@Pc(98) Class194 local98 = null;
					if (!super.aBoolean511) {
						@Pc(103) int local103 = local52;
						if ((Static356.aByteArrayArrayArray17[1][local68][local73] & 0x2) == 2) {
							local103 = local52 - 1;
						}
						if (local103 >= 0) {
							local98 = arg3[local103];
						}
					}
					this.method5739(local52, local98, local52, local12, local73, local60, -1, arg1, local64, local68);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILclient!le;IILclient!oa;II)V")
	public void method5743(@OriginalArg(0) int arg0, @OriginalArg(1) Class194 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface17 local7 = null;
		if (arg0 == 0) {
			local7 = (Interface17) Static298.method4853(arg4, arg2, arg5);
		}
		if (arg0 == 1) {
			local7 = (Interface17) Static541.method7782(arg4, arg2, arg5);
		}
		if (arg0 == 2) {
			local7 = (Interface17) Static178.method3532(arg4, arg2, arg5, ql.class);
		}
		if (arg0 == 3) {
			local7 = (Interface17) Static216.method3980(arg4, arg2, arg5);
		}
		if (local7 == null) {
			return;
		}
		@Pc(64) Class31 local64 = Static480.aClass57_11.method1469(local7.method8114());
		@Pc(68) int local68 = local7.method8119();
		@Pc(72) int local72 = local7.method8121();
		if (local64.method1036()) {
			Static465.method7167(arg4, arg5, arg2, local64);
		}
		if (local7.method8116()) {
			local7.method8118(arg3);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				@Pc(105) Class11_Sub3 local105 = Static541.method7782(arg4, arg2, arg5);
				if (local105 instanceof Class11_Sub3_Sub3) {
					((Class11_Sub3_Sub3) local105).aClass11_Sub3_3 = null;
					return;
				}
				Static438.method6671(arg4, arg2, arg5);
				return;
			}
			if (arg0 == 2) {
				@Pc(169) Class11_Sub1 local169 = Static178.method3532(arg4, arg2, arg5, ql.class);
				if (local169 instanceof Class11_Sub1_Sub4 && local169.aShort78 == arg2 && arg5 == local169.aShort80) {
					((Class11_Sub1_Sub4) local169).aClass11_Sub1_1 = null;
				} else {
					Static66.method1374(arg4, arg2, arg5, ql.class);
				}
				if (local64.anInt1093 == 0 || arg2 + local64.anInt1109 >= super.anInt6791 || super.anInt6805 <= local64.anInt1109 + arg5 || local64.anInt1058 + arg2 >= super.anInt6791 || super.anInt6805 <= local64.anInt1058 + arg5) {
					return;
				}
				arg1.method4809(!local64.aBoolean87, local72, arg2, local64.aBoolean101, local64.anInt1058, arg5, local64.anInt1109);
			} else if (arg0 == 3) {
				@Pc(133) Class11_Sub5 local133 = Static216.method3980(arg4, arg2, arg5);
				if (local133 instanceof Class11_Sub5_Sub2) {
					((Class11_Sub5_Sub2) local133).aClass11_Sub5_1 = null;
				} else {
					Static551.method7861(arg4, arg2, arg5);
				}
				if (local64.anInt1093 == 1) {
					arg1.method4811(arg2, arg5);
					return;
				}
			}
			return;
		}
		@Pc(269) Class11_Sub4 local269 = Static298.method4853(arg4, arg2, arg5);
		if (local269 instanceof Class11_Sub4_Sub3) {
			((Class11_Sub4_Sub3) local269).aClass11_Sub4_1 = null;
		} else {
			Static222.method4000(arg4, arg2, arg5);
		}
		if (local64.anInt1093 != 0) {
			arg1.method4801(local72, arg5, local64.aBoolean101, arg2, local68, !local64.aBoolean87);
			return;
		}
	}
}
