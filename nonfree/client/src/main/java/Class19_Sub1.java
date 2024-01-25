import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class19_Sub1 extends Class19 {

	@OriginalMember(owner = "client!fca", name = "L", descriptor = "I")
	public int anInt3650 = 99;

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(IIIZ)V")
	public Class19_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static566.aClass369_6, Static627.aClass107_5);
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ILclient!ha;I[Lclient!caa;[BI)V")
	public void method3002(@OriginalArg(0) int arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) Class48[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class8_Sub8 local10 = new Class8_Sub8(arg3);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method8537();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method8565();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local10.method8525();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				@Pc(71) int local71 = local50 + arg0;
				@Pc(75) int local75 = local44 + arg4;
				if (local71 > 0 && local75 > 0 && local71 < super.anInt3633 - 1 && super.anInt3641 - 1 > local75) {
					@Pc(96) Class48 local96 = null;
					if (!super.aBoolean269) {
						@Pc(101) int local101 = local54;
						if ((Static118.aByteArrayArrayArray20[1][local71][local75] & 0x2) == 2) {
							local101 = local54 - 1;
						}
						if (local101 >= 0) {
							local96 = arg2[local101];
						}
					}
					this.method3006(local54, local96, local62, local66, local16, -1, local75, arg1, local71, local54);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILclient!ha;IIILclient!ig;[IIBI)V")
	public void method3003(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class16 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class8_Sub8 arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean269) {
			return;
		}
		if (arg7 != null) {
			arg7[0] = -1;
		}
		@Pc(35) Class216 local35 = null;
		@Pc(41) int local41 = (arg3 & 0x7) * 8;
		@Pc(47) int local47 = (arg0 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(52) int local52;
						@Pc(86) int local86;
						@Pc(422) int local422;
						@Pc(125) int local125;
						while (arg6.anInt10588 < arg6.aByteArray107.length) {
							local52 = arg6.method8525();
							if (local52 == 0) {
								local35 = new Class216(arg6);
							} else {
								@Pc(256) int local256;
								@Pc(140) int local140;
								@Pc(144) int local144;
								@Pc(182) int local182;
								if (local52 == 1) {
									local86 = arg6.method8525();
									if (local86 > 0) {
										for (local422 = 0; local422 < local86; local422++) {
											@Pc(431) Class204 local431 = new Class204(arg2, arg6, 2);
											if (local431.anInt6625 == 31) {
												@Pc(442) Class261 local442 = Static543.aClass364_1.method8372(arg6.method8578());
												local431.method5429(local442.anInt8177, local442.anInt8179, local442.anInt8172, local442.anInt8175);
											}
											if (arg2.method6074() > 0) {
												@Pc(459) Class8_Sub1 local459 = local431.aClass8_Sub1_3;
												local256 = local459.method5206() >> 9;
												local140 = local459.method5207() >> 9;
												if (local431.anInt6626 == arg9 && local256 >= local41 && local256 < local41 + 8 && local47 <= local140 && local140 < local47 + 8) {
													local144 = (arg5 << 9) + Static32.method1188(local459.method5207() & 0xFFF, arg8, local459.method5206() & 0xFFF);
													local182 = (arg1 << 9) + Static74.method1946(local459.method5206() & 0xFFF, arg8, local459.method5207() & 0xFFF);
													local256 = local144 >> 9;
													local140 = local182 >> 9;
													if (local256 >= 0 && local140 >= 0 && super.anInt3633 > local256 && super.anInt3641 > local140) {
														local459.method5204(local182, super.anIntArrayArrayArray8[arg9][local256][local140] - local459.method5198(), local144);
														Static393.method6274(local431);
													}
												}
											}
										}
									}
								} else if (local52 == 2) {
									if (local35 == null) {
										local35 = new Class216();
									}
									local35.method5608(arg6);
								} else if (local52 != 128) {
									if (local52 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray12 == null) {
										super.aByteArrayArrayArray12 = new byte[4][][];
									}
									for (local86 = 0; local86 < 4; local86++) {
										@Pc(92) byte local92 = arg6.method8550();
										@Pc(129) int local129;
										if (local92 == 0 && super.aByteArrayArrayArray12[arg4] != null) {
											if (arg9 >= local86) {
												local125 = arg5;
												local129 = arg5 + 7;
												local256 = arg1;
												if (local129 < 0) {
													local129 = 0;
												} else if (local129 >= super.anInt3633) {
													local129 = super.anInt3633;
												}
												if (arg5 < 0) {
													local125 = 0;
												} else if (arg5 >= super.anInt3633) {
													local125 = super.anInt3633;
												}
												local140 = arg1 + 7;
												if (arg1 < 0) {
													local256 = 0;
												} else if (super.anInt3641 <= arg1) {
													local256 = super.anInt3641;
												}
												if (local140 < 0) {
													local140 = 0;
												} else if (super.anInt3641 <= local140) {
													local140 = super.anInt3641;
												}
												while (local125 < local129) {
													while (local140 > local256) {
														super.aByteArrayArrayArray12[arg4][local125][local256] = 0;
														local256++;
													}
													local125++;
												}
											}
										} else if (local92 == 1) {
											if (super.aByteArrayArrayArray12[arg4] == null) {
												super.aByteArrayArrayArray12[arg4] = new byte[super.anInt3633 + 1][super.anInt3641 + 1];
											}
											for (local125 = 0; local125 < 64; local125 += 4) {
												for (local129 = 0; local129 < 64; local129 += 4) {
													@Pc(135) byte local135 = arg6.method8550();
													if (arg9 >= local86) {
														for (local140 = local125; local140 < local125 + 4; local140++) {
															for (local144 = local129; local144 < local129 + 4; local144++) {
																if (local41 <= local140 && local140 < local41 + 8 && local144 >= local47 && local47 + 8 > local47) {
																	local182 = Static215.method4065(local144 & 0x7, local140 & 0x7, arg8) + arg5;
																	@Pc(195) int local195 = arg1 + Static149.method3041(local140 & 0x7, arg8, local144 & 0x7);
																	if (local182 >= 0 && super.anInt3633 > local182 && local195 >= 0 && local195 < super.anInt3641) {
																		super.aByteArrayArrayArray12[arg4][local182][local195] = local135;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								} else if (arg7 == null) {
									arg6.anInt10588 += 10;
								} else {
									arg7[0] = arg6.method8578();
									arg7[1] = arg6.method8568();
									arg7[2] = arg6.method8568();
									arg7[3] = arg6.method8568();
									arg7[4] = arg6.method8578();
								}
							}
						}
						if (local35 != null) {
							Static523.method7449(arg1 >> 3, local35, arg5 >> 3);
						}
						if (super.aByteArrayArrayArray12 != null && super.aByteArrayArrayArray12[arg4] != null) {
							local52 = arg5 + 7;
							local86 = arg1 + 7;
							for (local422 = arg5; local422 < local52; local422++) {
								for (local125 = arg1; local125 < local86; local125++) {
									super.aByteArrayArrayArray12[arg4][local422][local125] = 0;
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

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IIB[BIIILclient!ha;I[Lclient!caa;I)V")
	public void method3004(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class16 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class48[] arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class8_Sub8 local10 = new Class8_Sub8(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method8537();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method8565();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(46) int local46 = local27 & 0x3F;
				@Pc(52) int local52 = local27 >> 6 & 0x3F;
				@Pc(56) int local56 = local27 >> 12;
				@Pc(60) int local60 = local10.method8525();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				if (local56 == arg0 && arg3 <= local52 && local52 < arg3 + 8 && local46 >= arg1 && arg1 + 8 > local46) {
					@Pc(100) Class352 local100 = Static437.aClass199_3.method5342(local12);
					@Pc(117) int local117 = Static601.method8270(local68, local100.anInt10116, local46 & 0x7, local52 & 0x7, arg7, local100.anInt10132) + arg5;
					@Pc(135) int local135 = arg4 + Static123.method2787(local52 & 0x7, arg7, local100.anInt10116, local100.anInt10132, local68, local46 & 0x7);
					if (local117 > 0 && local135 > 0 && super.anInt3633 - 1 > local117 && local135 < super.anInt3641 - 1) {
						@Pc(167) Class48 local167 = null;
						if (!super.aBoolean269) {
							@Pc(172) int local172 = arg9;
							if ((Static118.aByteArrayArrayArray20[1][local117][local135] & 0x2) == 2) {
								local172 = arg9 - 1;
							}
							if (local172 >= 0) {
								local167 = arg8[local172];
							}
						}
						this.method3006(arg9, local167, local64, local68 + arg7 & 0x3, local12, -1, local135, arg6, local117, arg9);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!ig;[IIIBLclient!ha;)V")
	public void method3005(@OriginalArg(0) Class8_Sub8 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class16 arg4) {
		if (super.aBoolean269) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class216 local13 = null;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					@Pc(36) int local36;
					@Pc(124) int local124;
					@Pc(508) int local508;
					@Pc(139) int local139;
					@Pc(143) int local143;
					while (arg0.anInt10588 < arg0.aByteArray107.length) {
						local36 = arg0.method8525();
						if (local36 == 0) {
							local13 = new Class216(arg0);
						} else {
							@Pc(145) int local145;
							@Pc(166) int local166;
							@Pc(426) int local426;
							if (local36 == 1) {
								local124 = arg0.method8525();
								if (local124 > 0) {
									for (local508 = 0; local508 < local124; local508++) {
										@Pc(517) Class204 local517 = new Class204(arg4, arg0, 2);
										if (local517.anInt6625 == 31) {
											@Pc(528) Class261 local528 = Static543.aClass364_1.method8372(arg0.method8578());
											local517.method5429(local528.anInt8177, local528.anInt8179, local528.anInt8172, local528.anInt8175);
										}
										if (arg4.method6074() > 0) {
											@Pc(545) Class8_Sub1 local545 = local517.aClass8_Sub1_3;
											local145 = local545.method5206() + (arg2 << 9);
											local166 = local545.method5207() + (arg3 << 9);
											local426 = local145 >> 9;
											@Pc(570) int local570 = local166 >> 9;
											if (local426 >= 0 && local570 >= 0 && local426 < super.anInt3633 && super.anInt3641 > local570) {
												local545.method5204(local166, super.anIntArrayArrayArray8[local517.anInt6626][local426][local570] - local545.method5198(), local145);
												Static393.method6274(local517);
											}
										}
									}
								}
							} else if (local36 == 2) {
								if (local13 == null) {
									local13 = new Class216();
								}
								local13.method5608(arg0);
							} else if (local36 != 128) {
								if (local36 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray12 == null) {
									super.aByteArrayArrayArray12 = new byte[4][][];
								}
								local11 = true;
								for (local124 = 0; local124 < 4; local124++) {
									@Pc(130) byte local130 = arg0.method8550();
									if (local130 == 0 && super.aByteArrayArrayArray12[local124] != null) {
										local139 = arg2;
										local143 = arg2 + 64;
										local145 = arg3;
										if (arg2 < 0) {
											local139 = 0;
										} else if (super.anInt3633 <= arg2) {
											local139 = super.anInt3633;
										}
										local166 = arg3 + 64;
										if (local143 < 0) {
											local143 = 0;
										} else if (super.anInt3633 <= local143) {
											local143 = super.anInt3633;
										}
										if (arg3 < 0) {
											local145 = 0;
										} else if (arg3 >= super.anInt3641) {
											local145 = super.anInt3641;
										}
										if (local166 < 0) {
											local166 = 0;
										} else if (local166 >= super.anInt3641) {
											local166 = super.anInt3641;
										}
										while (local139 < local143) {
											while (local166 > local145) {
												super.aByteArrayArrayArray12[local124][local139][local145] = 0;
												local145++;
											}
											local139++;
										}
									} else if (local130 == 1) {
										if (super.aByteArrayArrayArray12[local124] == null) {
											super.aByteArrayArrayArray12[local124] = new byte[super.anInt3633 + 1][super.anInt3641 + 1];
										}
										for (local139 = 0; local139 < 64; local139 += 4) {
											for (local143 = 0; local143 < 64; local143 += 4) {
												@Pc(415) byte local415 = arg0.method8550();
												for (local166 = local139 + arg2; local166 < arg2 + local139 + 4; local166++) {
													for (local426 = arg3 + local143; local426 < local143 + arg3 + 4; local426++) {
														if (local166 >= 0 && local166 < super.anInt3633 && local426 >= 0 && super.anInt3641 > local426) {
															super.aByteArrayArrayArray12[local124][local166][local426] = local415;
														}
													}
												}
											}
										}
									} else if (local130 == 2) {
										if (super.aByteArrayArrayArray12[local124] == null) {
											super.aByteArrayArrayArray12[local124] = new byte[super.anInt3633 + 1][super.anInt3641 + 1];
										}
										if (local124 > 0) {
											local139 = arg2;
											local143 = arg2 + 64;
											local145 = arg3;
											if (arg3 < 0) {
												local145 = 0;
											} else if (arg3 >= super.anInt3641) {
												local145 = super.anInt3641;
											}
											if (arg2 < 0) {
												local139 = 0;
											} else if (super.anInt3633 <= arg2) {
												local139 = super.anInt3633;
											}
											if (local143 < 0) {
												local143 = 0;
											} else if (local143 >= super.anInt3633) {
												local143 = super.anInt3633;
											}
											local166 = arg3 + 64;
											if (local166 < 0) {
												local166 = 0;
											} else if (local166 >= super.anInt3641) {
												local166 = super.anInt3641;
											}
											while (local139 < local143) {
												while (local145 < local166) {
													super.aByteArrayArrayArray12[local124][local139][local145] = super.aByteArrayArrayArray12[local124 - 1][local139][local145];
													local145++;
												}
												local139++;
											}
										}
									}
								}
							} else if (arg1 == null) {
								arg0.anInt10588 += 10;
							} else {
								arg1[0] = arg0.method8578();
								arg1[1] = arg0.method8568();
								arg1[2] = arg0.method8568();
								arg1[3] = arg0.method8568();
								arg1[4] = arg0.method8578();
							}
						}
					}
					if (local13 != null) {
						for (local36 = 0; local36 < 8; local36++) {
							for (local124 = 0; local124 < 8; local124++) {
								local508 = (arg2 >> 3) + local36;
								local139 = local124 + (arg3 >> 3);
								if (local508 >= 0 && super.anInt3633 >> 3 > local508 && local139 >= 0 && local139 < super.anInt3641 >> 3) {
									Static523.method7449(local139, local13, local508);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray12 != null) {
						for (local36 = 0; local36 < 4; local36++) {
							if (super.aByteArrayArrayArray12[local36] != null) {
								for (local124 = 0; local124 < 16; local124++) {
									for (local508 = 0; local508 < 16; local508++) {
										local139 = (arg2 >> 2) + local124;
										local143 = (arg3 >> 2) + local508;
										if (local139 >= 0 && local139 < 26 && local143 >= 0 && local143 < 26) {
											super.aByteArrayArrayArray12[local36][local139][local143] = 0;
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
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(IILclient!caa;IIIIILclient!ha;II)V")
	public void method3006(@OriginalArg(0) int arg0, @OriginalArg(2) Class48 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class16 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (Static155.aClass8_Sub25_6.aClass36_Sub13_1.method4838() == 0 && !Static116.method2609(Static591.anInt10125, arg0, arg8, arg6)) {
			return;
		}
		if (arg9 < this.anInt3650) {
			this.anInt3650 = arg9;
		}
		@Pc(37) Class352 local37 = Static437.aClass199_3.method5342(arg4);
		if (Static155.aClass8_Sub25_6.aClass36_Sub17_1.method5459() == 0 && local37.aBoolean715) {
			return;
		}
		@Pc(63) int local63;
		@Pc(60) int local60;
		if (arg3 == 1 || arg3 == 3) {
			local60 = local37.anInt10116;
			local63 = local37.anInt10132;
		} else {
			local60 = local37.anInt10132;
			local63 = local37.anInt10116;
		}
		@Pc(96) int local96;
		@Pc(90) int local90;
		if (arg8 + local63 <= super.anInt3633) {
			local90 = (local63 + 1 >> 1) + arg8;
			local96 = (local63 >> 1) + arg8;
		} else {
			local96 = arg8;
			local90 = arg8 + 1;
		}
		@Pc(116) int local116;
		@Pc(114) int local114;
		if (super.anInt3641 < local60 + arg6) {
			local114 = arg6 + 1;
			local116 = arg6;
		} else {
			local114 = arg6 + (local60 + 1 >> 1);
			local116 = (local60 >> 1) + arg6;
		}
		@Pc(136) Class86 local136 = Static34.aClass86Array5[arg0];
		@Pc(163) int local163 = local136.method8086(local116, local96) + local136.method8086(local116, local90) + local136.method8086(local114, local96) + local136.method8086(local114, local90) >> 2;
		@Pc(171) int local171 = (arg8 << 9) + (local63 << 8);
		@Pc(179) int local179 = (local60 << 8) + (arg6 << 9);
		@Pc(191) boolean local191 = Static582.aBoolean711 && !super.aBoolean269 && local37.aBoolean727;
		if (local37.method8165()) {
			Static586.method8144(null, arg6, arg3, null, arg9, local37, arg8);
		}
		@Pc(225) boolean local225 = arg5 == -1 && local37.anInt10078 == -1 && local37.anIntArray588 == null && local37.anIntArray591 == null && !local37.aBoolean720;
		if (Static382.aBoolean539 && (Static31.method1116(arg2) && local37.anInt10082 != 1 || !(!Static182.method3468(arg2) || local37.anInt10082 != 0))) {
			return;
		}
		if (arg2 != 22) {
			@Pc(381) Class15_Sub1_Sub2 local381;
			@Pc(343) Class15_Sub1_Sub2_Sub3 local343;
			@Pc(377) int local377;
			@Pc(442) int local442;
			@Pc(438) int local438;
			if (arg2 == 10 || arg2 == 11) {
				local343 = null;
				if (local225) {
					@Pc(373) Class15_Sub1_Sub2_Sub3 local373 = new Class15_Sub1_Sub2_Sub3(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg8, local63 + arg8 - 1, arg6, local60 + arg6 - 1, arg2, arg3, local191);
					local377 = local373.method3576();
					local343 = local373;
					local381 = local373;
				} else {
					local377 = 15;
					local381 = new Class15_Sub1_Sub2_Sub4(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg8, local63 + arg8 - 1, arg6, local60 + arg6 - 1, arg2, arg3, arg5);
				}
				if (Static333.method5408(local381, false)) {
					if (local343 != null && local343.method8339()) {
						local343.method8340(arg7);
					}
					if (local37.aBoolean716 && Static582.aBoolean711) {
						if (local377 > 30) {
							local377 = 30;
						}
						for (local438 = 0; local438 <= local63; local438++) {
							for (local442 = 0; local442 <= local60; local442++) {
								local136.ka(local438 + arg8, arg6 - -local442, local377);
							}
						}
					}
				}
				if (local37.anInt10130 != 0 && arg1 != null) {
					arg1.method1633(local63, local37.aBoolean717, arg8, local60, !local37.aBoolean726, arg6);
				}
			} else if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && arg2 <= 21) {
				if (local225) {
					local343 = new Class15_Sub1_Sub2_Sub3(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg8, arg8 + local63 - 1, arg6, local60 + arg6 - 1, arg2, arg3, local191);
					if (local343.method8339()) {
						local343.method8340(arg7);
					}
					local381 = local343;
				} else {
					local381 = new Class15_Sub1_Sub2_Sub4(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg8, arg8 + local63 - 1, arg6, arg6 + local60 - 1, arg2, arg3, arg5);
				}
				Static333.method5408(local381, false);
				if (Static582.aBoolean711 && !super.aBoolean269 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg9 > 0 && local37.anInt10082 != 0) {
					super.aByteArrayArrayArray13[arg9][arg8][arg6] = (byte) (super.aByteArrayArrayArray13[arg9][arg8][arg6] | 0x4);
				}
				if (local37.anInt10130 != 0 && arg1 != null) {
					arg1.method1633(local63, local37.aBoolean717, arg8, local60, !local37.aBoolean726, arg6);
				}
			} else {
				@Pc(678) Class15_Sub1_Sub4 local678;
				if (arg2 == 0) {
					@Pc(642) int local642 = local37.anInt10082;
					if (Static56.aBoolean129 && local37.anInt10082 == -1) {
						local642 = 1;
					}
					if (local225) {
						@Pc(668) Class15_Sub1_Sub4_Sub2 local668 = new Class15_Sub1_Sub4_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg2, arg3, local191);
						if (local668.method8339()) {
							local668.method8340(arg7);
						}
						local678 = local668;
					} else {
						local678 = new Class15_Sub1_Sub4_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg2, arg3, arg5);
					}
					Static317.method7580(arg9, arg8, arg6, local678, null);
					if (arg3 == 0) {
						if (Static582.aBoolean711 && local37.aBoolean716) {
							local136.ka(arg8, arg6, 50);
							local136.ka(arg8, arg6 + 1, 50);
						}
						if (local642 == 1 && !super.aBoolean269) {
							Static642.method8625(local37.anInt10092, arg8, local37.anInt10104, 1, arg6, arg9);
						}
					} else if (arg3 == 1) {
						if (Static582.aBoolean711 && local37.aBoolean716) {
							local136.ka(arg8, arg6 + 1, 50);
							local136.ka(arg8 + 1, arg6 - -1, 50);
						}
						if (local642 == 1 && !super.aBoolean269) {
							Static642.method8625(local37.anInt10092, arg8, -local37.anInt10104, 2, arg6 + 1, arg9);
						}
					} else if (arg3 == 2) {
						if (Static582.aBoolean711 && local37.aBoolean716) {
							local136.ka(arg8 + 1, arg6, 50);
							local136.ka(arg8 + 1, arg6 + 1, 50);
						}
						if (local642 == 1 && !super.aBoolean269) {
							Static642.method8625(local37.anInt10092, arg8 + 1, -local37.anInt10104, 1, arg6, arg9);
						}
					} else if (arg3 == 3) {
						if (Static582.aBoolean711 && local37.aBoolean716) {
							local136.ka(arg8, arg6, 50);
							local136.ka(arg8 + 1, arg6, 50);
						}
						if (local642 == 1 && !super.aBoolean269) {
							Static642.method8625(local37.anInt10092, arg8, local37.anInt10104, 2, arg6, arg9);
						}
					}
					if (local37.anInt10130 != 0 && arg1 != null) {
						arg1.method1638(arg2, local37.aBoolean717, !local37.aBoolean726, arg6, arg8, arg3);
					}
					if (local37.anInt10084 != 64) {
						Static435.method6735(arg9, arg8, arg6, local37.anInt10084);
					}
				} else {
					@Pc(930) Class15_Sub1_Sub4 local930;
					@Pc(928) Class15_Sub1_Sub4_Sub2 local928;
					if (arg2 == 1) {
						if (local225) {
							local928 = new Class15_Sub1_Sub4_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg2, arg3, local191);
							local930 = local928;
							if (local928.method8339()) {
								local928.method8340(arg7);
							}
						} else {
							local930 = new Class15_Sub1_Sub4_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg2, arg3, arg5);
						}
						Static317.method7580(arg9, arg8, arg6, local930, null);
						if (local37.aBoolean716 && Static582.aBoolean711) {
							if (arg3 == 0) {
								local136.ka(arg8, arg6 + 1, 50);
							} else if (arg3 == 1) {
								local136.ka(arg8 + 1, arg6 + 1, 50);
							} else if (arg3 == 2) {
								local136.ka(arg8 + 1, arg6, 50);
							} else if (arg3 == 3) {
								local136.ka(arg8, arg6, 50);
							}
						}
						if (local37.anInt10130 != 0 && arg1 != null) {
							arg1.method1638(arg2, local37.aBoolean717, !local37.aBoolean726, arg6, arg8, arg3);
						}
					} else if (arg2 == 2) {
						local377 = arg3 + 1 & 0x3;
						if (local225) {
							@Pc(1105) Class15_Sub1_Sub4_Sub2 local1105 = new Class15_Sub1_Sub4_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg2, arg3 + 4, local191);
							@Pc(1121) Class15_Sub1_Sub4_Sub2 local1121 = new Class15_Sub1_Sub4_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg2, local377, local191);
							if (local1105.method8339()) {
								local1105.method8340(arg7);
							}
							if (local1121.method8339()) {
								local1121.method8340(arg7);
							}
							local930 = local1105;
							local678 = local1121;
						} else {
							local930 = new Class15_Sub1_Sub4_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg2, arg3 + 4, arg5);
							local678 = new Class15_Sub1_Sub4_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg2, local377, arg5);
						}
						Static317.method7580(arg9, arg8, arg6, local930, local678);
						if ((local37.anInt10082 == 1 || Static56.aBoolean129 && local37.anInt10082 == -1) && !super.aBoolean269) {
							if (arg3 == 0) {
								Static642.method8625(local37.anInt10092, arg8, local37.anInt10104, 1, arg6, arg9);
								Static642.method8625(local37.anInt10092, arg8, local37.anInt10104, 2, arg6 + 1, arg9);
							} else if (arg3 == 1) {
								Static642.method8625(local37.anInt10092, arg8 + 1, local37.anInt10104, 1, arg6, arg9);
								Static642.method8625(local37.anInt10092, arg8, local37.anInt10104, 2, arg6 + 1, arg9);
							} else if (arg3 == 2) {
								Static642.method8625(local37.anInt10092, arg8 + 1, local37.anInt10104, 1, arg6, arg9);
								Static642.method8625(local37.anInt10092, arg8, local37.anInt10104, 2, arg6, arg9);
							} else if (arg3 == 3) {
								Static642.method8625(local37.anInt10092, arg8, local37.anInt10104, 1, arg6, arg9);
								Static642.method8625(local37.anInt10092, arg8, local37.anInt10104, 2, arg6, arg9);
							}
						}
						if (local37.anInt10130 != 0 && arg1 != null) {
							arg1.method1638(arg2, local37.aBoolean717, !local37.aBoolean726, arg6, arg8, arg3);
						}
						if (local37.anInt10084 != 64) {
							Static435.method6735(arg9, arg8, arg6, local37.anInt10084);
						}
					} else if (arg2 == 3) {
						if (local225) {
							local928 = new Class15_Sub1_Sub4_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg2, arg3, local191);
							local930 = local928;
							if (local928.method8339()) {
								local928.method8340(arg7);
							}
						} else {
							local930 = new Class15_Sub1_Sub4_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg2, arg3, arg5);
						}
						Static317.method7580(arg9, arg8, arg6, local930, null);
						if (local37.aBoolean716 && Static582.aBoolean711) {
							if (arg3 == 0) {
								local136.ka(arg8, arg6 + 1, 50);
							} else if (arg3 == 1) {
								local136.ka(arg8 + 1, arg6 + 1, 50);
							} else if (arg3 == 2) {
								local136.ka(arg8 + 1, arg6, 50);
							} else if (arg3 == 3) {
								local136.ka(arg8, arg6, 50);
							}
						}
						if (local37.anInt10130 != 0 && arg1 != null) {
							arg1.method1638(arg2, local37.aBoolean717, !local37.aBoolean726, arg6, arg8, arg3);
						}
					} else if (arg2 == 9) {
						if (local225) {
							local343 = new Class15_Sub1_Sub2_Sub3(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg8, arg8, arg6, arg6, arg2, arg3, local191);
							local381 = local343;
							if (local343.method8339()) {
								local343.method8340(arg7);
							}
						} else {
							local381 = new Class15_Sub1_Sub2_Sub4(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg8, arg8 + local63 - 1, arg6, arg6 + local60 - 1, arg2, arg3, arg5);
						}
						Static333.method5408(local381, false);
						if (local37.anInt10082 == 1 && !super.aBoolean269) {
							@Pc(1531) byte local1531;
							if ((arg3 & 0x1) == 0) {
								local1531 = 8;
							} else {
								local1531 = 16;
							}
							Static642.method8625(local37.anInt10092, arg8, 0, local1531, arg6, arg9);
						}
						if (local37.anInt10130 != 0 && arg1 != null) {
							arg1.method1633(local63, local37.aBoolean717, arg8, local60, !local37.aBoolean726, arg6);
						}
						if (local37.anInt10084 != 64) {
							Static435.method6735(arg9, arg8, arg6, local37.anInt10084);
						}
					} else {
						@Pc(1612) Class15_Sub1_Sub5 local1612;
						if (arg2 == 4) {
							if (local225) {
								@Pc(1602) Class15_Sub1_Sub5_Sub2 local1602 = new Class15_Sub1_Sub5_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, 0, 0, arg2, arg3);
								if (local1602.method8339()) {
									local1602.method8340(arg7);
								}
								local1612 = local1602;
							} else {
								local1612 = new Class15_Sub1_Sub5_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, 0, 0, arg2, arg3, arg5);
							}
							Static507.method7331(arg9, arg8, arg6, local1612, null);
						} else {
							@Pc(1646) int local1646;
							@Pc(1652) Interface27 local1652;
							@Pc(1719) Class15_Sub1_Sub5_Sub2 local1719;
							if (arg2 == 5) {
								local1646 = 65;
								local1652 = (Interface27) Static418.method6567(arg9, arg8, arg6);
								if (local1652 != null) {
									local1646 = Static437.aClass199_3.method5342(local1652.method8342()).anInt10084 + 1;
								}
								if (local225) {
									local1719 = new Class15_Sub1_Sub5_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, Static518.anIntArray502[arg3] * local1646, local1646 * Static491.anIntArray490[arg3], arg2, arg3);
									if (local1719.method8339()) {
										local1719.method8340(arg7);
									}
									local1612 = local1719;
								} else {
									local1612 = new Class15_Sub1_Sub5_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, local1646 * Static518.anIntArray502[arg3], local1646 * Static491.anIntArray490[arg3], arg2, arg3, arg5);
								}
								Static507.method7331(arg9, arg8, arg6, local1612, null);
							} else if (arg2 == 6) {
								local1646 = 33;
								local1652 = (Interface27) Static418.method6567(arg9, arg8, arg6);
								if (local1652 != null) {
									local1646 = Static437.aClass199_3.method5342(local1652.method8342()).anInt10084 / 2 + 1;
								}
								if (local225) {
									local1719 = new Class15_Sub1_Sub5_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, local1646 * Static518.anIntArray502[arg3], local1646 * Static491.anIntArray490[arg3], arg2, arg3 + 4);
									local1612 = local1719;
									if (local1719.method8339()) {
										local1719.method8340(arg7);
									}
								} else {
									local1612 = new Class15_Sub1_Sub5_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, local1646 * Static89.anIntArray110[arg3], local1646 * Static431.anIntArray437[arg3], arg2, arg3 + 4, arg5);
								}
								Static507.method7331(arg9, arg8, arg6, local1612, null);
							} else if (arg2 == 7) {
								local377 = arg3 + 2 & 0x3;
								@Pc(1885) Class15_Sub1_Sub5 local1885;
								if (local225) {
									local1719 = new Class15_Sub1_Sub5_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, 0, 0, arg2, local377 + 4);
									if (local1719.method8339()) {
										local1719.method8340(arg7);
									}
									local1885 = local1719;
								} else {
									local1885 = new Class15_Sub1_Sub5_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, 0, 0, arg2, local377 + 4, arg5);
								}
								Static507.method7331(arg9, arg8, arg6, local1885, null);
							} else if (arg2 == 8) {
								local438 = arg3 + 2 & 0x3;
								local442 = 33;
								@Pc(1931) Interface27 local1931 = (Interface27) Static418.method6567(arg9, arg8, arg6);
								if (local1931 != null) {
									local442 = Static437.aClass199_3.method5342(local1931.method8342()).anInt10084 / 2 + 1;
								}
								@Pc(1975) Class15_Sub1_Sub5 local1975;
								@Pc(1997) Class15_Sub1_Sub5 local1997;
								if (local225) {
									local1975 = new Class15_Sub1_Sub5_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, Static89.anIntArray110[arg3] * local442, local442 * Static431.anIntArray437[arg3], arg2, arg3 + 4);
									local1997 = new Class15_Sub1_Sub5_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, 0, 0, arg2, local438 + 4);
									if (local1975.method8339()) {
										local1975.method8340(arg7);
									}
									if (local1997.method8339()) {
										local1997.method8340(arg7);
									}
								} else {
									local1975 = new Class15_Sub1_Sub5_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, local442 * Static89.anIntArray110[arg3], local442 * Static431.anIntArray437[arg3], arg2, arg3 + 4, arg5);
									local1997 = new Class15_Sub1_Sub5_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, 0, 0, arg2, local438 + 4, arg5);
								}
								Static507.method7331(arg9, arg8, arg6, local1975, local1997);
							}
						}
					}
				}
			}
		} else if (Static155.aClass8_Sub25_6.aClass36_Sub1_1.method1349() != 0 || local37.anInt10102 != 0 || local37.anInt10130 == 1 || local37.aBoolean728) {
			@Pc(285) Class15_Sub1_Sub3 local285;
			if (local225) {
				@Pc(302) Class15_Sub1_Sub3_Sub1 local302 = new Class15_Sub1_Sub3_Sub1(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg3, local191);
				if (local302.method8339()) {
					local302.method8340(arg7);
				}
				local285 = local302;
			} else {
				local285 = new Class15_Sub1_Sub3_Sub2(arg7, local37, arg9, arg0, local171, local163, local179, super.aBoolean269, arg3, arg5);
			}
			Static367.method5730(arg9, arg8, arg6, local285);
			if (local37.anInt10130 == 1 && arg1 != null) {
				arg1.method1640(arg6, arg8);
			}
		}
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(IIIII)Lclient!wha;")
	private Interface27 method3007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface27 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface27) Static418.method6567(arg2, arg1, arg3);
		}
		if (arg0 == 1) {
			local5 = (Interface27) Static408.method6467(arg2, arg1, arg3);
		}
		if (arg0 == 2) {
			local5 = (Interface27) Static575.method7984(arg2, arg1, arg3, wha.class);
		}
		if (arg0 == 3) {
			local5 = (Interface27) Static484.method7154(arg2, arg1, arg3);
		}
		return local5;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLclient!ha;B)V")
	public void method3009(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class16 arg1) {
		Static613.method8354();
		if (!arg0) {
			@Pc(24) int local24;
			@Pc(28) int local28;
			if (super.anInt3635 > 1) {
				for (local24 = 0; super.anInt3633 > local24; local24++) {
					for (local28 = 0; super.anInt3641 > local28; local28++) {
						if ((Static118.aByteArrayArrayArray20[1][local24][local28] & 0x2) == 2) {
							Static195.method3645(local24, local28);
						}
					}
				}
			}
			for (local24 = 0; local24 < super.anInt3635; local24++) {
				for (local28 = 0; local28 <= super.anInt3641; local28++) {
					for (@Pc(74) int local74 = 0; local74 <= super.anInt3633; local74++) {
						if ((super.aByteArrayArrayArray13[local24][local74][local28] & 0x4) != 0) {
							@Pc(89) int local89 = local74;
							@Pc(91) int local91 = local74;
							@Pc(93) int local93 = local28;
							@Pc(95) int local95 = local28;
							while (local93 > 0 && (super.aByteArrayArrayArray13[local24][local74][local93 - 1] & 0x4) != 0 && local28 - local93 < 10) {
								local93--;
							}
							while (super.anInt3641 > local95 && (super.aByteArrayArrayArray13[local24][local74][local95 + 1] & 0x4) != 0 && local95 - local93 < 10) {
								local95++;
							}
							@Pc(151) int local151;
							label111: while (local89 > 0 && local74 - local89 < 10) {
								for (local151 = local93; local151 <= local95; local151++) {
									if ((super.aByteArrayArrayArray13[local24][local89 - 1][local151] & 0x4) == 0) {
										break label111;
									}
								}
								local89--;
							}
							label98: while (super.anInt3633 > local91 && local91 - local89 < 10) {
								for (local151 = local93; local151 <= local95; local151++) {
									if ((super.aByteArrayArrayArray13[local24][local91 + 1][local151] & 0x4) == 0) {
										break label98;
									}
								}
								local91++;
							}
							if ((local95 + 1 - local93) * (local91 + -local89 - -1) >= 4) {
								local151 = super.anIntArrayArrayArray8[local24][local89][local93];
								Static400.method6357(local151, local89 << 9, local24, (local91 << 9) + 512, local151, local93 << 9, (local95 << 9) + 512);
								for (@Pc(288) int local288 = local89; local288 <= local91; local288++) {
									for (@Pc(292) int local292 = local93; local292 <= local95; local292++) {
										super.aByteArrayArrayArray13[local24][local288][local292] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static434.method6727();
		}
		super.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!ha;IILclient!caa;III)V")
	public void method3011(@OriginalArg(0) Class16 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class48 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(20) Interface27 local20 = this.method3007(arg2, arg4, arg1, arg5);
		if (local20 == null) {
			return;
		}
		@Pc(29) Class352 local29 = Static437.aClass199_3.method5342(local20.method8342());
		@Pc(33) int local33 = local20.method8343();
		@Pc(37) int local37 = local20.method8337();
		if (local29.method8165()) {
			Static302.method4925(arg4, arg5, local29, arg1);
		}
		if (local20.method8339()) {
			local20.method8341(arg0);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				Static478.method7070(arg1, arg4, arg5);
			} else if (arg2 == 2) {
				Static81.method2077(arg1, arg4, arg5, wha.class);
				if (local29.anInt10130 != 0 && arg4 + local29.anInt10116 < super.anInt3633 && super.anInt3641 > local29.anInt10116 + arg5 && super.anInt3633 > arg4 + local29.anInt10132 && local29.anInt10132 + arg5 < super.anInt3641) {
					arg3.method1647(arg4, local29.anInt10116, !local29.aBoolean726, local37, local29.anInt10132, local29.aBoolean717, arg5);
				}
				if (local33 == 9) {
					if ((local37 & 0x1) == 0) {
						Static228.method4244(arg4, 8, arg5, arg1);
						return;
					}
					Static228.method4244(arg4, 16, arg5, arg1);
					return;
				}
			} else {
				if (arg2 == 3) {
					Static548.method7712(arg1, arg4, arg5);
					if (local29.anInt10130 == 1) {
						arg3.method1637(arg5, arg4);
						return;
					}
				}
				return;
			}
			return;
		}
		Static568.method7886(arg1, arg4, arg5);
		if (local29.anInt10130 != 0) {
			arg3.method1648(local29.aBoolean717, arg4, arg5, !local29.aBoolean726, local37, local33);
		}
		if (local29.anInt10082 != 1) {
			return;
		}
		if (local37 != 0) {
			if (local37 == 1) {
				Static228.method4244(arg4, 2, arg5 + 1, arg1);
			} else if (local37 == 2) {
				Static228.method4244(arg4 + 1, 1, arg5, arg1);
				return;
			} else if (local37 == 3) {
				Static228.method4244(arg4, 2, arg5, arg1);
				return;
			}
			return;
		}
		Static228.method4244(arg4, 1, arg5, arg1);
		return;
	}
}
