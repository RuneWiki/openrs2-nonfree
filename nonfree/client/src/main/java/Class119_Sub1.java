import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gn")
public final class Class119_Sub1 extends Class119 {

	@OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
	public int anInt3807 = 99;

	@OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(IIIZ)V")
	public Class119_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static464.aClass220_6, Static73.aClass47_2);
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(BIILclient!qa;Lclient!daa;[I)V")
	public void method3340(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class42 arg2, @OriginalArg(4) Class12_Sub8 arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean312) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(18) Class240 local18 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					@Pc(29) int local29;
					@Pc(64) int local64;
					@Pc(485) int local485;
					@Pc(112) int local112;
					@Pc(116) int local116;
					while (arg3.anInt6217 < arg3.aByteArray82.length) {
						local29 = arg3.method5216();
						if (local29 == 0) {
							local18 = new Class240(arg3);
						} else {
							@Pc(118) int local118;
							@Pc(155) int local155;
							@Pc(258) int local258;
							if (local29 == 1) {
								local64 = arg3.method5216();
								if (local64 > 0) {
									for (local485 = 0; local485 < local64; local485++) {
										@Pc(494) Class97 local494 = new Class97(arg2, arg3, 0);
										if (local494.anInt2943 == 31) {
											@Pc(505) Class36 local505 = Static367.aClass156_1.method4102(arg3.method5199());
											local494.method2694(local505.anInt840, local505.anInt841, local505.anInt837, local505.anInt843);
										}
										if (arg2.method5825() > 0) {
											@Pc(522) Class12_Sub7 local522 = local494.aClass12_Sub7_1;
											local118 = (arg1 << 7) + local522.method5124();
											local155 = local522.method5117() + (arg0 << 7);
											local258 = local118 >> 7;
											@Pc(547) int local547 = local155 >> 7;
											if (local258 >= 0 && local547 >= 0 && local258 < super.anInt3784 && super.anInt3786 > local547) {
												local522.method5119(local118, local155, super.anIntArrayArrayArray4[local494.anInt2937][local258][local547] - local522.method5120());
												Static357.method5569(local494);
											}
										}
									}
								}
							} else if (local29 == 2) {
								if (local18 == null) {
									local18 = new Class240();
								}
								local18.method5765(arg3);
							} else if (local29 != 128) {
								if (local29 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray15 == null) {
									super.aByteArrayArrayArray15 = new byte[4][][];
								}
								for (local64 = 0; local64 < 4; local64++) {
									@Pc(70) byte local70 = arg3.method5173();
									if (local70 == 0 && super.aByteArrayArrayArray15[local64] != null) {
										local112 = arg1;
										local116 = arg1 + 64;
										local118 = arg0;
										if (arg1 < 0) {
											local112 = 0;
										} else if (arg1 >= super.anInt3784) {
											local112 = super.anInt3784;
										}
										if (arg0 < 0) {
											local118 = 0;
										} else if (arg0 >= super.anInt3786) {
											local118 = super.anInt3786;
										}
										if (local116 < 0) {
											local116 = 0;
										} else if (super.anInt3784 <= local116) {
											local116 = super.anInt3784;
										}
										local155 = arg0 + 64;
										if (local155 < 0) {
											local155 = 0;
										} else if (super.anInt3786 <= local155) {
											local155 = super.anInt3786;
										}
										while (local116 > local112) {
											while (local118 < local155) {
												super.aByteArrayArrayArray15[local64][local112][local118] = 0;
												local118++;
											}
											local112++;
										}
									} else if (local70 == 1) {
										if (super.aByteArrayArrayArray15[local64] == null) {
											super.aByteArrayArrayArray15[local64] = new byte[super.anInt3784 + 1][super.anInt3786 + 1];
										}
										for (local112 = 0; local112 < 64; local112 += 4) {
											for (local116 = 0; local116 < 64; local116 += 4) {
												@Pc(248) byte local248 = arg3.method5173();
												for (local155 = arg1 + local112; local155 < local112 + arg1 + 4; local155++) {
													for (local258 = arg0 + local116; local258 < arg0 + local116 + 4; local258++) {
														if (local155 >= 0 && super.anInt3784 > local155 && local258 >= 0 && super.anInt3786 > local258) {
															super.aByteArrayArrayArray15[local64][local155][local258] = local248;
														}
													}
												}
											}
										}
									} else if (local70 == 2) {
										if (super.aByteArrayArrayArray15[local64] == null) {
											super.aByteArrayArrayArray15[local64] = new byte[super.anInt3784 + 1][super.anInt3786 + 1];
										}
										if (local64 > 0) {
											local112 = arg1;
											local116 = arg1 + 64;
											local118 = arg0;
											if (arg1 < 0) {
												local112 = 0;
											} else if (arg1 >= super.anInt3784) {
												local112 = super.anInt3784;
											}
											if (arg0 < 0) {
												local118 = 0;
											} else if (super.anInt3786 <= arg0) {
												local118 = super.anInt3786;
											}
											local155 = arg0 + 64;
											if (local116 < 0) {
												local116 = 0;
											} else if (local116 >= super.anInt3784) {
												local116 = super.anInt3784;
											}
											if (local155 < 0) {
												local155 = 0;
											} else if (local155 >= super.anInt3786) {
												local155 = super.anInt3786;
											}
											while (local116 > local112) {
												while (local155 > local118) {
													super.aByteArrayArrayArray15[local64][local112][local118] = super.aByteArrayArrayArray15[local64 - 1][local112][local118];
													local118++;
												}
												local112++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg4 == null) {
								arg3.anInt6217 += 10;
							} else {
								arg4[0] = arg3.method5199();
								arg4[1] = arg3.method5217();
								arg4[2] = arg3.method5217();
								arg4[3] = arg3.method5217();
								arg4[4] = arg3.method5199();
							}
						}
					}
					if (local18 != null) {
						for (local29 = 0; local29 < 8; local29++) {
							for (local64 = 0; local64 < 8; local64++) {
								local485 = (arg1 >> 3) + local29;
								local112 = local64 + (arg0 >> 3);
								if (local485 >= 0 && super.anInt3784 >> 3 > local485 && local112 >= 0 && super.anInt3786 >> 3 > local112) {
									Static259.method4400(local18, local485, local112);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray15 != null) {
						for (local29 = 0; local29 < 4; local29++) {
							if (super.aByteArrayArrayArray15[local29] != null) {
								for (local64 = 0; local64 < 16; local64++) {
									for (local485 = 0; local485 < 16; local485++) {
										local112 = (arg1 >> 2) + local64;
										local116 = (arg0 >> 2) + local485;
										if (local112 >= 0 && local112 < 26 && local116 >= 0 && local116 < 26) {
											super.aByteArrayArrayArray15[local29][local112][local116] = 0;
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

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!daa;IIIIII[IILclient!qa;I)V")
	public void method3341(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class42 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean312) {
			return;
		}
		@Pc(20) Class240 local20 = null;
		if (arg6 != null) {
			arg6[0] = -1;
		}
		@Pc(32) int local32 = (arg3 & 0x7) * 8;
		@Pc(38) int local38 = (arg9 & 0x7) * 8;
		while (true) {
			@Pc(43) int local43;
			@Pc(115) int local115;
			@Pc(153) int local153;
			@Pc(432) int local432;
			while (arg0.aByteArray82.length > arg0.anInt6217) {
				local43 = arg0.method5216();
				if (local43 == 0) {
					local20 = new Class240(arg0);
				} else {
					@Pc(172) int local172;
					@Pc(176) int local176;
					@Pc(221) int local221;
					@Pc(306) int local306;
					if (local43 == 1) {
						local115 = arg0.method5216();
						if (local115 > 0) {
							for (local432 = 0; local432 < local115; local432++) {
								@Pc(441) Class97 local441 = new Class97(arg8, arg0, 0);
								if (local441.anInt2943 == 31) {
									@Pc(456) Class36 local456 = Static367.aClass156_1.method4102(arg0.method5199());
									local441.method2694(local456.anInt840, local456.anInt841, local456.anInt837, local456.anInt843);
								}
								if (arg8.method5825() > 0) {
									@Pc(476) Class12_Sub7 local476 = local441.aClass12_Sub7_1;
									local306 = local476.method5124() >> 7;
									local172 = local476.method5117() >> 7;
									if (local441.anInt2937 == arg7 && local306 >= local32 && local32 + 8 > local306 && local38 <= local172 && local38 + 8 > local172) {
										local176 = Static401.method6306(local476.method5124() & 0x3FF, arg5, local476.method5117() & 0x3FF) + (arg1 << 7);
										local306 = local176 >> 7;
										local221 = Static17.method411(local476.method5124() & 0x3FF, local476.method5117() & 0x3FF, arg5) + (arg4 << 7);
										local172 = local221 >> 7;
										if (local306 >= 0 && local172 >= 0 && super.anInt3784 > local306 && super.anInt3786 > local172) {
											local476.method5119(local176, local221, super.anIntArrayArrayArray4[arg7][local306][local172] - local476.method5120());
											Static357.method5569(local441);
										}
									}
								}
							}
						}
					} else if (local43 == 2) {
						if (local20 == null) {
							local20 = new Class240();
						}
						local20.method5765(arg0);
					} else if (local43 != 128) {
						if (local43 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						for (local115 = 0; local115 < 4; local115++) {
							@Pc(121) byte local121 = arg0.method5173();
							@Pc(157) int local157;
							if (local121 == 0 && super.aByteArrayArrayArray15[arg2] != null) {
								if (arg7 >= local115) {
									local153 = arg1;
									local157 = arg1 + 7;
									local306 = arg4;
									local172 = arg4 + 7;
									if (arg4 < 0) {
										local306 = 0;
									} else if (super.anInt3786 <= arg4) {
										local306 = super.anInt3786;
									}
									if (arg1 < 0) {
										local153 = 0;
									} else if (arg1 >= super.anInt3784) {
										local153 = super.anInt3784;
									}
									if (local157 < 0) {
										local157 = 0;
									} else if (super.anInt3784 <= local157) {
										local157 = super.anInt3784;
									}
									if (local172 < 0) {
										local172 = 0;
									} else if (local172 >= super.anInt3786) {
										local172 = super.anInt3786;
									}
									while (local153 < local157) {
										while (local306 < local172) {
											super.aByteArrayArrayArray15[arg2][local153][local306] = 0;
											local306++;
										}
										local153++;
									}
								}
							} else if (local121 == 1) {
								if (super.aByteArrayArrayArray15[arg2] == null) {
									super.aByteArrayArrayArray15[arg2] = new byte[super.anInt3784 + 1][super.anInt3786 + 1];
								}
								for (local153 = 0; local153 < 64; local153 += 4) {
									for (local157 = 0; local157 < 64; local157 += 4) {
										@Pc(163) byte local163 = arg0.method5173();
										if (arg7 >= local115) {
											for (local172 = local153; local172 < local153 + 4; local172++) {
												for (local176 = local157; local176 < local157 + 4; local176++) {
													if (local172 >= local32 && local32 + 8 > local172 && local176 >= local38 && local38 < local38 + 8) {
														local221 = arg1 + Static317.method5060(local172 & 0x7, arg5, local176 & 0x7);
														@Pc(234) int local234 = arg4 + Static429.method6588(arg5, local176 & 0x7, local172 & 0x7);
														if (local221 >= 0 && local221 < super.anInt3784 && local234 >= 0 && local234 < super.anInt3786) {
															super.aByteArrayArrayArray15[arg2][local221][local234] = local163;
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
						arg0.anInt6217 += 10;
					} else {
						arg6[0] = arg0.method5199();
						arg6[1] = arg0.method5217();
						arg6[2] = arg0.method5217();
						arg6[3] = arg0.method5217();
						arg6[4] = arg0.method5199();
					}
				}
			}
			if (local20 != null) {
				Static259.method4400(local20, arg1 >> 3, arg4 >> 3);
			}
			if (super.aByteArrayArrayArray15 != null && super.aByteArrayArrayArray15[arg2] != null) {
				local43 = arg1 + 7;
				local115 = arg4 + 7;
				for (local432 = arg1; local432 < local43; local432++) {
					for (local153 = arg4; local153 < local115; local153++) {
						super.aByteArrayArrayArray15[arg2][local432][local153] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!qa;IILclient!ld;IIIIIII)V")
	public void method3342(@OriginalArg(0) Class42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class184 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static208.aClass12_Sub10_Sub1_1.method2057(Static148.anInt6867) && !Static87.method1914(arg6, Static415.anInt3783, arg8, arg5)) {
			return;
		}
		if (this.anInt3807 > arg1) {
			this.anInt3807 = arg1;
		}
		@Pc(34) Class279 local34 = Static49.aClass155_2.method4063(arg7);
		if (arg0.method5819() && Static208.aClass12_Sub10_Sub1_1.aBoolean180 && local34.aBoolean584) {
			return;
		}
		@Pc(55) int local55;
		@Pc(58) int local58;
		if (arg2 == 1 || arg2 == 3) {
			local58 = local34.anInt8293;
			local55 = local34.anInt8303;
		} else {
			local55 = local34.anInt8293;
			local58 = local34.anInt8303;
		}
		@Pc(82) int local82;
		@Pc(91) int local91;
		if (super.anInt3784 >= arg6 + local55) {
			local82 = (local55 >> 1) + arg6;
			local91 = arg6 + (local55 + 1 >> 1);
		} else {
			local91 = arg6 + 1;
			local82 = arg6;
		}
		@Pc(123) int local123;
		@Pc(127) int local127;
		if (arg8 + local58 > super.anInt3786) {
			local123 = arg8;
			local127 = arg8 + 1;
		} else {
			local123 = (local58 >> 1) + arg8;
			local127 = arg8 + (local58 + 1 >> 1);
		}
		@Pc(148) Class215 local148 = Static51.aClass215Array6[arg5];
		@Pc(171) int local171 = local148.ba(local82, local123) + local148.ba(local91, local123) + local148.ba(local82, local127) + local148.ba(local91, local127) >> 2;
		@Pc(179) int local179 = (local55 << 6) + (arg6 << 7);
		@Pc(187) int local187 = (local58 << 6) + (arg8 << 7);
		@Pc(199) boolean local199 = Static330.aBoolean466 && !super.aBoolean312 && local34.aBoolean577;
		if (local34.method6873()) {
			Static402.method6312(null, arg6, arg2, null, arg1, arg8, local34);
		}
		@Pc(233) boolean local233 = arg4 == -1 && local34.anInt8287 == -1 && local34.anIntArray622 == null && local34.anIntArray620 == null && !local34.aBoolean576;
		if (Static103.aBoolean198 && (Static535.method7883(arg9) && local34.anInt8310 != 1 || !(!Static382.method6051(arg9) || local34.anInt8310 != 0))) {
			return;
		}
		if (arg9 != 22) {
			@Pc(394) Class30_Sub1 local394;
			@Pc(360) Class30_Sub1_Sub6 local360;
			@Pc(364) int local364;
			if (arg9 == 10 || arg9 == 11) {
				local360 = null;
				if (local233) {
					@Pc(426) Class30_Sub1_Sub6 local426 = new Class30_Sub1_Sub6(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg6, arg6 + local55 - 1, arg8, arg8 + local58 - 1, arg9, arg2, local199);
					local394 = local426;
					local364 = local426.method7827();
					local360 = local426;
				} else {
					local364 = 15;
					local394 = new Class30_Sub1_Sub3(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg6, arg6 + local55 - 1, arg8, arg8 + local58 - 1, arg9, arg2, arg4);
				}
				@Pc(447) Class30_Sub1 local447 = Static531.method7866(arg1, arg6, arg8, wf.class);
				@Pc(449) boolean local449 = false;
				if (local447 instanceof Class30_Sub1_Sub2 && arg6 == local447.aShort115 && arg8 == local447.aShort112) {
					local449 = true;
					((Class30_Sub1_Sub2) local447).aClass30_Sub1_1 = local394;
				}
				if (local449 || Static135.method2775(local394, false)) {
					if (local360 != null && local360.method7920()) {
						local360.method7916(arg0);
					}
					if (local34.aBoolean587 && Static330.aBoolean466) {
						if (local364 > 30) {
							local364 = 30;
						}
						for (@Pc(502) int local502 = 0; local502 <= local55; local502++) {
							for (@Pc(506) int local506 = 0; local506 <= local58; local506++) {
								local148.Q(local502 + arg6, arg8 + local506, local364);
							}
						}
					}
				}
				if (local34.anInt8282 != 0 && arg3 != null) {
					arg3.method4583(local34.aBoolean588, !local34.aBoolean586, arg8, local58, local55, arg6);
				}
			} else {
				@Pc(651) Class30_Sub1 local651;
				if (arg9 >= 12 && arg9 <= 17 || arg9 >= 18 && arg9 <= 21) {
					if (local233) {
						local360 = new Class30_Sub1_Sub6(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg6, arg6 + local55 - 1, arg8, arg8 + local58 - 1, arg9, arg2, local199);
						if (local360.method7920()) {
							local360.method7916(arg0);
						}
						local394 = local360;
					} else {
						local394 = new Class30_Sub1_Sub3(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg6, local55 + arg6 - 1, arg8, arg8 + local58 - 1, arg9, arg2, arg4);
					}
					local651 = Static531.method7866(arg1, arg6, arg8, wf.class);
					if (local651 instanceof Class30_Sub1_Sub2 && arg6 == local651.aShort115 && local651.aShort112 == arg8) {
						((Class30_Sub1_Sub2) local651).aClass30_Sub1_1 = local394;
					} else {
						Static135.method2775(local394, false);
					}
					if (Static330.aBoolean466 && !super.aBoolean312 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg1 > 0 && local34.anInt8310 != 0) {
						super.aByteArrayArrayArray12[arg1][arg6][arg8] = (byte) (super.aByteArrayArrayArray12[arg1][arg6][arg8] | 0x4);
					}
					if (local34.anInt8282 != 0 && arg3 != null) {
						arg3.method4583(local34.aBoolean588, !local34.aBoolean586, arg8, local58, local55, arg6);
					}
				} else {
					@Pc(776) Class30_Sub2 local776;
					if (arg9 == 0) {
						@Pc(749) int local749 = local34.anInt8310;
						if (Static197.aBoolean347 && local34.anInt8310 == -1) {
							local749 = 1;
						}
						if (local233) {
							@Pc(793) Class30_Sub2_Sub1 local793 = new Class30_Sub2_Sub1(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, arg9, arg2, local199);
							local776 = local793;
							if (local793.method7920()) {
								local793.method7916(arg0);
							}
						} else {
							local776 = new Class30_Sub2_Sub3(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg9, arg2, arg4);
						}
						@Pc(808) Class30_Sub2 local808 = Static324.method5105(arg1, arg6, arg8);
						if (local808 instanceof Class30_Sub2_Sub2) {
							((Class30_Sub2_Sub2) local808).aClass30_Sub2_3 = local776;
						} else {
							Static327.method5156(arg1, arg6, arg8, local776, null);
						}
						if (Static330.aBoolean466) {
							if (arg2 == 0) {
								if (local34.aBoolean587) {
									local148.Q(arg6, arg8, 50);
									local148.Q(arg6, arg8 + 1, 50);
								}
								if (local749 == 1 && !super.aBoolean312) {
									super.aByteArrayArrayArray12[arg1][arg6][arg8] = (byte) (super.aByteArrayArrayArray12[arg1][arg6][arg8] | 0x1);
								}
							} else if (arg2 == 1) {
								if (local34.aBoolean587) {
									local148.Q(arg6, arg8 + 1, 50);
									local148.Q(arg6 + 1, arg8 - -1, 50);
								}
								if (local749 == 1 && !super.aBoolean312) {
									super.aByteArrayArrayArray12[arg1][arg6][arg8 + 1] = (byte) (super.aByteArrayArrayArray12[arg1][arg6][arg8 + 1] | 0x2);
								}
							} else if (arg2 == 2) {
								if (local34.aBoolean587) {
									local148.Q(arg6 + 1, arg8, 50);
									local148.Q(arg6 + 1, arg8 + 1, 50);
								}
								if (local749 == 1 && !super.aBoolean312) {
									super.aByteArrayArrayArray12[arg1][arg6 + 1][arg8] = (byte) (super.aByteArrayArrayArray12[arg1][arg6 + 1][arg8] | 0x1);
								}
							} else if (arg2 == 3) {
								if (local34.aBoolean587) {
									local148.Q(arg6, arg8, 50);
									local148.Q(arg6 + 1, arg8, 50);
								}
								if (local749 == 1 && !super.aBoolean312) {
									super.aByteArrayArrayArray12[arg1][arg6][arg8] = (byte) (super.aByteArrayArrayArray12[arg1][arg6][arg8] | 0x2);
								}
							}
						}
						if (local34.anInt8282 != 0 && arg3 != null) {
							arg3.method4589(arg8, local34.aBoolean588, !local34.aBoolean586, arg2, arg6, arg9);
						}
						if (local34.anInt8309 != 16) {
							Static197.method3729(arg1, arg6, arg8, local34.anInt8309);
						}
					} else {
						@Pc(1085) Class30_Sub2_Sub1 local1085;
						@Pc(1095) Class30_Sub2 local1095;
						if (arg9 == 1) {
							if (local233) {
								local1085 = new Class30_Sub2_Sub1(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, arg9, arg2, local199);
								if (local1085.method7920()) {
									local1085.method7916(arg0);
								}
								local1095 = local1085;
							} else {
								local1095 = new Class30_Sub2_Sub3(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg9, arg2, arg4);
							}
							local776 = Static324.method5105(arg1, arg6, arg8);
							if (local776 instanceof Class30_Sub2_Sub2) {
								((Class30_Sub2_Sub2) local776).aClass30_Sub2_3 = local1095;
							} else {
								Static327.method5156(arg1, arg6, arg8, local1095, null);
							}
							if (local34.aBoolean587 && Static330.aBoolean466) {
								if (arg2 == 0) {
									local148.Q(arg6, arg8 + 1, 50);
								} else if (arg2 == 1) {
									local148.Q(arg6 + 1, arg8 + 1, 50);
								} else if (arg2 == 2) {
									local148.Q(arg6 + 1, arg8, 50);
								} else if (arg2 == 3) {
									local148.Q(arg6, arg8, 50);
								}
							}
							if (local34.anInt8282 != 0 && arg3 != null) {
								arg3.method4589(arg8, local34.aBoolean588, !local34.aBoolean586, arg2, arg6, arg9);
							}
						} else if (arg9 == 2) {
							local364 = arg2 + 1 & 0x3;
							if (local233) {
								@Pc(1273) Class30_Sub2_Sub1 local1273 = new Class30_Sub2_Sub1(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, arg9, arg2 + 4, local199);
								@Pc(1288) Class30_Sub2_Sub1 local1288 = new Class30_Sub2_Sub1(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, arg9, local364, local199);
								if (local1273.method7920()) {
									local1273.method7916(arg0);
								}
								local1095 = local1273;
								local776 = local1288;
								if (local1288.method7920()) {
									local1288.method7916(arg0);
								}
							} else {
								local1095 = new Class30_Sub2_Sub3(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg9, arg2 + 4, arg4);
								local776 = new Class30_Sub2_Sub3(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg9, local364, arg4);
							}
							Static327.method5156(arg1, arg6, arg8, local1095, local776);
							if (local34.anInt8310 == 1 && Static330.aBoolean466 && !super.aBoolean312) {
								if (arg2 == 0) {
									super.aByteArrayArrayArray12[arg1][arg6][arg8] = (byte) (super.aByteArrayArrayArray12[arg1][arg6][arg8] | 0x1);
									super.aByteArrayArrayArray12[arg1][arg6][arg8 + 1] = (byte) (super.aByteArrayArrayArray12[arg1][arg6][arg8 + 1] | 0x2);
								} else if (arg2 == 1) {
									super.aByteArrayArrayArray12[arg1][arg6][arg8 + 1] = (byte) (super.aByteArrayArrayArray12[arg1][arg6][arg8 + 1] | 0x2);
									super.aByteArrayArrayArray12[arg1][arg6 + 1][arg8] = (byte) (super.aByteArrayArrayArray12[arg1][arg6 + 1][arg8] | 0x1);
								} else if (arg2 == 2) {
									super.aByteArrayArrayArray12[arg1][arg6 + 1][arg8] = (byte) (super.aByteArrayArrayArray12[arg1][arg6 + 1][arg8] | 0x1);
									super.aByteArrayArrayArray12[arg1][arg6][arg8] = (byte) (super.aByteArrayArrayArray12[arg1][arg6][arg8] | 0x2);
								} else if (arg2 == 3) {
									super.aByteArrayArrayArray12[arg1][arg6][arg8] = (byte) (super.aByteArrayArrayArray12[arg1][arg6][arg8] | 0x2);
									super.aByteArrayArrayArray12[arg1][arg6][arg8] = (byte) (super.aByteArrayArrayArray12[arg1][arg6][arg8] | 0x1);
								}
							}
							if (local34.anInt8282 != 0 && arg3 != null) {
								arg3.method4589(arg8, local34.aBoolean588, !local34.aBoolean586, arg2, arg6, arg9);
							}
							if (local34.anInt8309 != 16) {
								Static197.method3729(arg1, arg6, arg8, local34.anInt8309);
							}
						} else if (arg9 == 3) {
							if (local233) {
								local1085 = new Class30_Sub2_Sub1(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, arg9, arg2, local199);
								if (local1085.method7920()) {
									local1085.method7916(arg0);
								}
								local1095 = local1085;
							} else {
								local1095 = new Class30_Sub2_Sub3(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg9, arg2, arg4);
							}
							local776 = Static324.method5105(arg1, arg6, arg8);
							if (local776 instanceof Class30_Sub2_Sub2) {
								((Class30_Sub2_Sub2) local776).aClass30_Sub2_3 = local1095;
							} else {
								Static327.method5156(arg1, arg6, arg8, local1095, null);
							}
							if (local34.aBoolean587 && Static330.aBoolean466) {
								if (arg2 == 0) {
									local148.Q(arg6, arg8 + 1, 50);
								} else if (arg2 == 1) {
									local148.Q(arg6 + 1, arg8 + 1, 50);
								} else if (arg2 == 2) {
									local148.Q(arg6 + 1, arg8, 50);
								} else if (arg2 == 3) {
									local148.Q(arg6, arg8, 50);
								}
							}
							if (local34.anInt8282 != 0 && arg3 != null) {
								arg3.method4589(arg8, local34.aBoolean588, !local34.aBoolean586, arg2, arg6, arg9);
							}
						} else if (arg9 == 9) {
							if (local233) {
								local360 = new Class30_Sub1_Sub6(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg6, arg6, arg8, arg8, arg9, arg2, local199);
								if (local360.method7920()) {
									local360.method7916(arg0);
								}
								local394 = local360;
							} else {
								local394 = new Class30_Sub1_Sub3(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg6, arg6 + local55 - 1, arg8, local58 + arg8 - 1, arg9, arg2, arg4);
							}
							local651 = Static531.method7866(arg1, arg6, arg8, wf.class);
							if (local651 instanceof Class30_Sub1_Sub2 && local651.aShort115 == arg6 && arg8 == local651.aShort112) {
								((Class30_Sub1_Sub2) local651).aClass30_Sub1_1 = local394;
							} else {
								Static135.method2775(local394, false);
							}
							if (local34.anInt8282 != 0 && arg3 != null) {
								arg3.method4583(local34.aBoolean588, !local34.aBoolean586, arg8, local58, local55, arg6);
							}
							if (local34.anInt8309 != 16) {
								Static197.method3729(arg1, arg6, arg8, local34.anInt8309);
							}
						} else {
							@Pc(1864) Class30_Sub4 local1864;
							if (arg9 == 4) {
								if (local233) {
									@Pc(1862) Class30_Sub4_Sub3 local1862 = new Class30_Sub4_Sub3(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, 0, 0, 0, arg9, arg2);
									local1864 = local1862;
									if (local1862.method7920()) {
										local1862.method7916(arg0);
									}
								} else {
									local1864 = new Class30_Sub4_Sub2(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, 0, 0, 0, arg9, arg2, arg4);
								}
								@Pc(1898) Class30_Sub4 local1898 = Static533.method7882(arg1, arg6, arg8);
								if (local1898 instanceof Class30_Sub4_Sub1) {
									((Class30_Sub4_Sub1) local1898).aClass30_Sub4_3 = local1864;
								} else {
									Static163.method3348(arg1, arg6, arg8, local1864, null);
								}
							} else {
								@Pc(1920) int local1920;
								@Pc(1926) Interface19 local1926;
								@Pc(1965) Class30_Sub4_Sub3 local1965;
								@Pc(2009) Class30_Sub4 local2009;
								if (arg9 == 5) {
									local1920 = 17;
									local1926 = (Interface19) Static324.method5105(arg1, arg6, arg8);
									if (local1926 != null) {
										local1920 = Static49.aClass155_2.method4063(local1926.method7915()).anInt8309 + 1;
									}
									if (local233) {
										local1965 = new Class30_Sub4_Sub3(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, 0, local1920 * Static146.anIntArray237[arg2], local1920 * Static45.anIntArray122[arg2], arg9, arg2);
										local1864 = local1965;
										if (local1965.method7920()) {
											local1965.method7916(arg0);
										}
									} else {
										local1864 = new Class30_Sub4_Sub2(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, 0, local1920 * Static146.anIntArray237[arg2], Static45.anIntArray122[arg2] * local1920, arg9, arg2, arg4);
									}
									local2009 = Static533.method7882(arg1, arg6, arg8);
									if (local2009 instanceof Class30_Sub4_Sub1) {
										((Class30_Sub4_Sub1) local2009).aClass30_Sub4_3 = local1864;
									} else {
										Static163.method3348(arg1, arg6, arg8, local1864, null);
									}
								} else if (arg9 == 6) {
									local1920 = 9;
									local1926 = (Interface19) Static324.method5105(arg1, arg6, arg8);
									if (local1926 != null) {
										local1920 = Static49.aClass155_2.method4063(local1926.method7915()).anInt8309 / 2 + 1;
									}
									if (local233) {
										local1965 = new Class30_Sub4_Sub3(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, arg2, Static146.anIntArray237[arg2] * local1920, Static45.anIntArray122[arg2] * local1920, arg9, arg2 + 4);
										local1864 = local1965;
										if (local1965.method7920()) {
											local1965.method7916(arg0);
										}
									} else {
										local1864 = new Class30_Sub4_Sub2(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg2, Static60.anIntArray138[arg2] * local1920, Static331.anIntArray436[arg2] * local1920, arg9, arg2 + 4, arg4);
									}
									local2009 = Static533.method7882(arg1, arg6, arg8);
									if (local2009 instanceof Class30_Sub4_Sub1) {
										((Class30_Sub4_Sub1) local2009).aClass30_Sub4_3 = local1864;
									} else {
										Static163.method3348(arg1, arg6, arg8, local1864, null);
									}
								} else if (arg9 == 7) {
									local1920 = arg2 + 2 & 0x3;
									if (local233) {
										@Pc(2198) Class30_Sub4_Sub3 local2198 = new Class30_Sub4_Sub3(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, local1920, 0, 0, arg9, local1920 + 4);
										if (local2198.method7920()) {
											local2198.method7916(arg0);
										}
										local1864 = local2198;
									} else {
										local1864 = new Class30_Sub4_Sub2(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, local1920, 0, 0, arg9, local1920 + 4, arg4);
									}
									@Pc(2215) Class30_Sub4 local2215 = Static533.method7882(arg1, arg6, arg8);
									if (local2215 instanceof Class30_Sub4_Sub1) {
										((Class30_Sub4_Sub1) local2215).aClass30_Sub4_3 = local1864;
									} else {
										Static163.method3348(arg1, arg6, arg8, local1864, null);
									}
								} else if (arg9 == 8) {
									local364 = arg2 + 2 & 0x3;
									@Pc(2241) int local2241 = 9;
									@Pc(2247) Interface19 local2247 = (Interface19) Static324.method5105(arg1, arg6, arg8);
									if (local2247 != null) {
										local2241 = Static49.aClass155_2.method4063(local2247.method7915()).anInt8309 / 2 + 1;
									}
									@Pc(2292) Class30_Sub4 local2292;
									@Pc(2313) Class30_Sub4 local2313;
									if (local233) {
										local2292 = new Class30_Sub4_Sub3(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, arg2, Static60.anIntArray138[arg2] * local2241, local2241 * Static331.anIntArray436[arg2], arg9, arg2 + 4);
										local2313 = new Class30_Sub4_Sub3(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, arg2, 0, 0, arg9, local364 + 4);
										if (local2292.method7920()) {
											local2292.method7916(arg0);
										}
										if (local2313.method7920()) {
											local2313.method7916(arg0);
										}
									} else {
										local2292 = new Class30_Sub4_Sub2(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg2, Static60.anIntArray138[arg2] * local2241, Static331.anIntArray436[arg2] * local2241, arg9, arg2 + 4, arg4);
										local2313 = new Class30_Sub4_Sub2(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg2, 0, 0, arg9, local364 + 4, arg4);
									}
									Static163.method3348(arg1, arg6, arg8, local2292, local2313);
								}
							}
						}
					}
				}
			}
		} else if (Static208.aClass12_Sub10_Sub1_1.aBoolean183 || local34.anInt8276 != 0 || local34.anInt8282 == 1 || local34.aBoolean581) {
			@Pc(298) Class30_Sub3 local298;
			if (local233) {
				@Pc(288) Class30_Sub3_Sub3 local288 = new Class30_Sub3_Sub3(arg0, local34, arg5, local179, local171, local187, super.aBoolean312, arg2, local199);
				if (local288.method7920()) {
					local288.method7916(arg0);
				}
				local298 = local288;
			} else {
				local298 = new Class30_Sub3_Sub1(arg0, local34, arg1, arg5, local179, local171, local187, super.aBoolean312, arg2, arg4);
			}
			@Pc(320) Class30_Sub3 local320 = Static160.method3298(arg1, arg6, arg8);
			if (local320 instanceof Class30_Sub3_Sub2) {
				((Class30_Sub3_Sub2) local320).aClass30_Sub3_2 = local298;
			} else {
				Static111.method2306(arg1, arg6, arg8, local298);
			}
			if (local34.anInt8282 == 1 && arg3 != null) {
				arg3.method4597(arg8, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "([Lclient!ld;BLclient!qa;II[B)V")
	public void method3343(@OriginalArg(0) Class184[] arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(15) Class12_Sub8 local15 = new Class12_Sub8(arg4);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method5188();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method5218();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local15.method5216();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(71) int local71 = arg2 + local51;
				@Pc(75) int local75 = arg3 + local45;
				if (local71 > 0 && local75 > 0 && super.anInt3784 - 1 > local71 && super.anInt3786 - 1 > local75) {
					@Pc(97) Class184 local97 = null;
					if (!super.aBoolean312) {
						@Pc(102) int local102 = local55;
						if ((Static387.aByteArrayArrayArray18[1][local71][local75] & 0x2) == 2) {
							local102 = local55 - 1;
						}
						if (local102 >= 0) {
							local97 = arg0[local102];
						}
					}
					this.method3342(arg1, local55, local67, local97, -1, local55, local71, local17, local75, local63);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILclient!qa;ILclient!ld;II)V")
	public void method3344(@OriginalArg(1) int arg0, @OriginalArg(2) Class42 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class184 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface19 local7 = null;
		if (arg2 == 0) {
			local7 = (Interface19) Static324.method5105(arg4, arg5, arg0);
		}
		if (arg2 == 1) {
			local7 = (Interface19) Static533.method7882(arg4, arg5, arg0);
		}
		if (arg2 == 2) {
			local7 = (Interface19) Static531.method7866(arg4, arg5, arg0, wf.class);
		}
		if (arg2 == 3) {
			local7 = (Interface19) Static160.method3298(arg4, arg5, arg0);
		}
		if (local7 == null) {
			return;
		}
		@Pc(73) Class279 local73 = Static49.aClass155_2.method4063(local7.method7915());
		@Pc(77) int local77 = local7.method7918();
		@Pc(81) int local81 = local7.method7919();
		if (local73.method6873()) {
			Static216.method3991(arg5, arg4, arg0, local73);
		}
		if (local7.method7920()) {
			local7.method7921(arg1);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				@Pc(265) Class30_Sub4 local265 = Static533.method7882(arg4, arg5, arg0);
				if (local265 instanceof Class30_Sub4_Sub1) {
					((Class30_Sub4_Sub1) local265).aClass30_Sub4_3 = null;
					return;
				}
				Static200.method3788(arg4, arg5, arg0);
			} else if (arg2 == 2) {
				@Pc(128) Class30_Sub1 local128 = Static531.method7866(arg4, arg5, arg0, wf.class);
				if (local128 instanceof Class30_Sub1_Sub2 && local128.aShort115 == arg5 && local128.aShort112 == arg0) {
					((Class30_Sub1_Sub2) local128).aClass30_Sub1_1 = null;
				} else {
					Static82.method1831(arg4, arg5, arg0, wf.class);
				}
				if (local73.anInt8282 != 0 && super.anInt3784 > local73.anInt8293 + arg5 && super.anInt3786 > local73.anInt8293 + arg0 && super.anInt3784 > arg5 + local73.anInt8303 && arg0 + local73.anInt8303 < super.anInt3786) {
					arg3.method4584(local73.aBoolean588, local81, arg5, local73.anInt8293, !local73.aBoolean586, arg0, local73.anInt8303);
					return;
				}
				return;
			} else if (arg2 == 3) {
				@Pc(235) Class30_Sub3 local235 = Static160.method3298(arg4, arg5, arg0);
				if (local235 instanceof Class30_Sub3_Sub2) {
					((Class30_Sub3_Sub2) local235).aClass30_Sub3_2 = null;
				} else {
					Static225.method4070(arg4, arg5, arg0);
				}
				if (local73.anInt8282 == 1) {
					arg3.method4593(arg0, arg5);
					return;
				}
			}
			return;
		}
		@Pc(283) Class30_Sub2 local283 = Static324.method5105(arg4, arg5, arg0);
		if (local283 instanceof Class30_Sub2_Sub2) {
			((Class30_Sub2_Sub2) local283).aClass30_Sub2_3 = null;
		} else {
			Static347.method5470(arg4, arg5, arg0);
		}
		if (local73.anInt8282 != 0) {
			arg3.method4595(!local73.aBoolean586, local73.aBoolean588, arg0, local81, local77, arg5);
			return;
		}
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(Lclient!qa;B)V")
	public void method3347(@OriginalArg(0) Class42 arg0) {
		Static190.method3665(arg0);
		@Pc(20) int local20;
		@Pc(24) int local24;
		if (super.anInt3799 > 1) {
			for (local20 = 0; super.anInt3784 > local20; local20++) {
				for (local24 = 0; local24 < super.anInt3786; local24++) {
					if ((Static387.aByteArrayArrayArray18[1][local20][local24] & 0x2) == 2) {
						Static355.method5552(local20, local24);
					}
				}
			}
		}
		for (local20 = 0; super.anInt3799 > local20; local20++) {
			for (local24 = 0; super.anInt3786 >= local24; local24++) {
				for (@Pc(64) int local64 = 0; local64 <= super.anInt3784; local64++) {
					@Pc(82) int local82;
					@Pc(84) int local84;
					@Pc(86) int local86;
					@Pc(88) int local88;
					@Pc(133) int local133;
					@Pc(231) int local231;
					@Pc(240) int local240;
					@Pc(260) int local260;
					@Pc(264) int local264;
					if ((super.aByteArrayArrayArray12[local20][local64][local24] & 0x1) != 0) {
						local82 = local24;
						local84 = local24;
						local86 = local20;
						local88 = local20;
						while (local84 < super.anInt3786 && (super.aByteArrayArrayArray12[local20][local64][local84 + 1] & 0x1) != 0) {
							local84++;
						}
						while (local82 > 0 && (super.aByteArrayArrayArray12[local20][local64][local82 - 1] & 0x1) != 0) {
							local82--;
						}
						label164: while (local86 > 0) {
							for (local133 = local82; local133 <= local84; local133++) {
								if ((super.aByteArrayArrayArray12[local86 - 1][local64][local133] & 0x1) == 0) {
									break label164;
								}
							}
							local86--;
						}
						label153: while (local88 < 3) {
							for (local133 = local82; local133 <= local84; local133++) {
								if ((super.aByteArrayArrayArray12[local88 + 1][local64][local133] & 0x1) == 0) {
									break label153;
								}
							}
							local88++;
						}
						local133 = (local88 + 1 - local86) * (local84 + 1 - local82);
						if (local133 >= 2) {
							local231 = super.anIntArrayArrayArray4[local88][local64][local82] - 240;
							local240 = super.anIntArrayArrayArray4[local86][local64][local82];
							Static304.method4951(1, local64 << 7, local64 << 7, local82 << 7, (local84 << 7) + 128, local231, local240);
							for (local260 = local86; local260 <= local88; local260++) {
								for (local264 = local82; local264 <= local84; local264++) {
									super.aByteArrayArrayArray12[local260][local64][local264] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local20][local64][local24] & 0x2) != 0) {
						local82 = local64;
						local84 = local64;
						local86 = local20;
						while (local82 > 0 && (super.aByteArrayArrayArray12[local20][local82 - 1][local24] & 0x2) != 0) {
							local82--;
						}
						while (local84 < super.anInt3784 && (super.aByteArrayArrayArray12[local20][local84 + 1][local24] & 0x2) != 0) {
							local84++;
						}
						local88 = local20;
						label217: while (local86 > 0) {
							for (local133 = local82; local133 <= local84; local133++) {
								if ((super.aByteArrayArrayArray12[local86 - 1][local133][local24] & 0x2) == 0) {
									break label217;
								}
							}
							local86--;
						}
						label206: while (local88 < 3) {
							for (local133 = local82; local133 <= local84; local133++) {
								if ((super.aByteArrayArrayArray12[local88 + 1][local133][local24] & 0x2) == 0) {
									break label206;
								}
							}
							local88++;
						}
						local133 = (local88 + 1 - local86) * (local84 + 1 - local82);
						if (local133 >= 2) {
							local231 = super.anIntArrayArrayArray4[local88][local82][local24] - 240;
							local240 = super.anIntArrayArrayArray4[local86][local82][local24];
							Static304.method4951(2, local82 << 7, (local84 << 7) + 128, local24 << 7, local24 << 7, local231, local240);
							for (local260 = local86; local260 <= local88; local260++) {
								for (local264 = local82; local264 <= local84; local264++) {
									super.aByteArrayArrayArray12[local260][local264][local24] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local20][local64][local24] & 0x4) != 0) {
						local82 = local64;
						local84 = local64;
						for (local86 = local24; local86 > 0 && (super.aByteArrayArrayArray12[local20][local64][local86 - 1] & 0x4) != 0; local86--) {
						}
						for (local88 = local24; local88 < super.anInt3786 && (super.aByteArrayArrayArray12[local20][local64][local88 + 1] & 0x4) != 0; local88++) {
						}
						label271: while (local82 > 0) {
							for (local133 = local86; local133 <= local88; local133++) {
								if ((super.aByteArrayArrayArray12[local20][local82 - 1][local133] & 0x4) == 0) {
									break label271;
								}
							}
							local82--;
						}
						label260: while (local84 < super.anInt3784) {
							for (local133 = local86; local133 <= local88; local133++) {
								if ((super.aByteArrayArrayArray12[local20][local84 + 1][local133] & 0x4) == 0) {
									break label260;
								}
							}
							local84++;
						}
						if ((local84 + 1 - local82) * (local88 + (1 - local86)) >= 4) {
							local133 = super.anIntArrayArrayArray4[local20][local82][local86];
							Static304.method4951(4, local82 << 7, (local84 << 7) + 128, local86 << 7, (local88 << 7) + 128, local133, local133);
							for (@Pc(708) int local708 = local82; local708 <= local84; local708++) {
								for (local231 = local86; local231 <= local88; local231++) {
									super.aByteArrayArrayArray12[local20][local708][local231] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!gn", name = "a", descriptor = "(II[BIIIZLclient!qa;[Lclient!ld;II)V")
	public void method3349(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class42 arg6, @OriginalArg(8) Class184[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(16) Class12_Sub8 local16 = new Class12_Sub8(arg2);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local16.method5188();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local16.method5218();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(46) int local46 = local30 & 0x3F;
				@Pc(52) int local52 = local30 >> 6 & 0x3F;
				@Pc(56) int local56 = local30 >> 12;
				@Pc(60) int local60 = local16.method5216();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				if (local56 == arg4 && local52 >= arg1 && local52 < arg1 + 8 && local46 >= arg8 && arg8 + 8 > local46) {
					@Pc(100) Class279 local100 = Static49.aClass155_2.method4063(local18);
					@Pc(117) int local117 = Static14.method360(local100.anInt8303, local68, local52 & 0x7, local100.anInt8293, arg0, local46 & 0x7) + arg9;
					@Pc(134) int local134 = Static367.method5708(local46 & 0x7, local68, arg0, local100.anInt8303, local100.anInt8293, local52 & 0x7) + arg5;
					if (local117 > 0 && local134 > 0 && super.anInt3784 - 1 > local117 && local134 < super.anInt3786 - 1) {
						@Pc(155) Class184 local155 = null;
						if (!super.aBoolean312) {
							@Pc(160) int local160 = arg3;
							if ((Static387.aByteArrayArrayArray18[1][local117][local134] & 0x2) == 2) {
								local160 = arg3 - 1;
							}
							if (local160 >= 0) {
								local155 = arg7[local160];
							}
						}
						this.method3342(arg6, arg3, arg0 + local68 & 0x3, local155, -1, arg3, local117, local18, local134, local64);
					}
				}
			}
		}
	}
}
