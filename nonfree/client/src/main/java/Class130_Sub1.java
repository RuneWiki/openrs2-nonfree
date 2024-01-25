import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class130_Sub1 extends Class130 {

	@OriginalMember(owner = "client!od", name = "M", descriptor = "I")
	public int anInt6556 = 99;

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(IIIZ)V")
	public Class130_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static230.aClass307_2, Static27.aClass38_1);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!co;[IILclient!qa;I)V")
	public void method5428(@OriginalArg(1) Class5_Sub3 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class62 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean453) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(19) Class227 local19 = null;
		while (true) {
			@Pc(35) int local35;
			@Pc(87) int local87;
			@Pc(96) int local96;
			@Pc(100) int local100;
			@Pc(42) int local42;
			label308: do {
				while (true) {
					@Pc(24) int local24;
					@Pc(256) int local256;
					@Pc(260) int local260;
					while (arg0.anInt4960 < arg0.aByteArray66.length) {
						local24 = arg0.method4220();
						if (local24 == 0) {
							local19 = new Class227(arg0);
						} else {
							if (local24 == 1) {
								local35 = arg0.method4220();
								continue label308;
							}
							if (local24 == 2) {
								if (local19 == null) {
									local19 = new Class227();
								}
								local19.method5610(arg0);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray12 == null) {
									super.aByteArrayArrayArray12 = new byte[4][][];
								}
								for (local35 = 0; local35 < 4; local35++) {
									@Pc(223) byte local223 = arg0.method4196();
									if (local223 == 0 && super.aByteArrayArrayArray12[local35] != null) {
										local256 = arg2;
										local260 = arg2 + 64;
										local87 = arg4;
										if (local260 < 0) {
											local260 = 0;
										} else if (super.anInt6536 <= local260) {
											local260 = super.anInt6536;
										}
										local96 = arg4 + 64;
										if (arg4 < 0) {
											local87 = 0;
										} else if (arg4 >= super.anInt6543) {
											local87 = super.anInt6543;
										}
										if (arg2 < 0) {
											local256 = 0;
										} else if (super.anInt6536 <= arg2) {
											local256 = super.anInt6536;
										}
										if (local96 < 0) {
											local96 = 0;
										} else if (local96 >= super.anInt6543) {
											local96 = super.anInt6543;
										}
										while (local256 < local260) {
											while (local96 > local87) {
												super.aByteArrayArrayArray12[local35][local256][local87] = 0;
												local87++;
											}
											local256++;
										}
									} else if (local223 == 1) {
										if (super.aByteArrayArrayArray12[local35] == null) {
											super.aByteArrayArrayArray12[local35] = new byte[super.anInt6536 + 1][super.anInt6543 + 1];
										}
										for (local256 = 0; local256 < 64; local256 += 4) {
											for (local260 = 0; local260 < 64; local260 += 4) {
												@Pc(266) byte local266 = arg0.method4196();
												for (local96 = arg2 + local256; local96 < arg2 + local256 + 4; local96++) {
													for (local100 = arg4 + local260; local100 < arg4 + local260 + 4; local100++) {
														if (local96 >= 0 && local96 < super.anInt6536 && local100 >= 0 && local100 < super.anInt6543) {
															super.aByteArrayArrayArray12[local35][local96][local100] = local266;
														}
													}
												}
											}
										}
									} else if (local223 == 2) {
										if (super.aByteArrayArrayArray12[local35] == null) {
											super.aByteArrayArrayArray12[local35] = new byte[super.anInt6536 + 1][super.anInt6543 + 1];
										}
										if (local35 > 0) {
											local256 = arg2;
											local260 = arg2 + 64;
											local87 = arg4;
											if (arg2 < 0) {
												local256 = 0;
											} else if (arg2 >= super.anInt6536) {
												local256 = super.anInt6536;
											}
											if (arg4 < 0) {
												local87 = 0;
											} else if (arg4 >= super.anInt6543) {
												local87 = super.anInt6543;
											}
											local96 = arg4 + 64;
											if (local260 < 0) {
												local260 = 0;
											} else if (super.anInt6536 <= local260) {
												local260 = super.anInt6536;
											}
											if (local96 < 0) {
												local96 = 0;
											} else if (super.anInt6543 <= local96) {
												local96 = super.anInt6543;
											}
											while (local256 < local260) {
												while (local87 < local96) {
													super.aByteArrayArrayArray12[local35][local256][local87] = super.aByteArrayArrayArray12[local35 - 1][local256][local87];
													local87++;
												}
												local256++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg1 == null) {
								arg0.anInt4960 += 10;
							} else {
								arg1[0] = arg0.method4227();
								arg1[1] = arg0.method4212();
								arg1[2] = arg0.method4212();
								arg1[3] = arg0.method4212();
								arg1[4] = arg0.method4227();
							}
						}
					}
					if (local19 != null) {
						for (local24 = 0; local24 < 8; local24++) {
							for (local35 = 0; local35 < 8; local35++) {
								local42 = (arg2 >> 3) + local24;
								local256 = (arg4 >> 3) + local35;
								if (local42 >= 0 && super.anInt6536 >> 3 > local42 && local256 >= 0 && local256 < super.anInt6543 >> 3) {
									Static328.method5199(local19, local42, local256);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray12 != null) {
						for (local24 = 0; local24 < 4; local24++) {
							if (super.aByteArrayArrayArray12[local24] != null) {
								for (local35 = 0; local35 < 16; local35++) {
									for (local42 = 0; local42 < 16; local42++) {
										local256 = local35 + (arg2 >> 2);
										local260 = (arg4 >> 2) + local42;
										if (local256 >= 0 && local256 < 26 && local260 >= 0 && local260 < 26) {
											super.aByteArrayArrayArray12[local24][local256][local260] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local35 <= 0);
			for (local42 = 0; local42 < local35; local42++) {
				@Pc(51) Class250 local51 = new Class250(arg3, arg0, 0);
				if (local51.anInt7361 == 31) {
					@Pc(62) Class268 local62 = Static307.aClass139_1.method3296(arg0.method4227());
					local51.method5998(local62.anInt7823, local62.anInt7829, local62.anInt7826, local62.anInt7825);
				}
				if (arg3.method7034() > 0) {
					@Pc(79) Class5_Sub10 local79 = local51.aClass5_Sub10_3;
					local87 = (arg2 << 7) + local79.method5189();
					local96 = local79.method5183() + (arg4 << 7);
					local100 = local87 >> 7;
					@Pc(104) int local104 = local96 >> 7;
					if (local100 >= 0 && local104 >= 0 && local100 < super.anInt6536 && super.anInt6543 > local104) {
						local79.method5188(super.anIntArrayArrayArray9[local51.anInt7363][local100][local104] - local79.method5190(), local87, local96);
						Static232.method3827(local51);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZLclient!qa;)V")
	public void method5431(@OriginalArg(1) Class62 arg0) {
		Static277.method4519(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt6544 > 1) {
			for (local13 = 0; local13 < super.anInt6536; local13++) {
				for (local17 = 0; super.anInt6543 > local17; local17++) {
					if ((Static429.aByteArrayArrayArray17[1][local13][local17] & 0x2) == 2) {
						Static6.method264(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; local13 < super.anInt6544; local13++) {
			for (local17 = 0; super.anInt6543 >= local17; local17++) {
				for (@Pc(69) int local69 = 0; local69 <= super.anInt6536; local69++) {
					@Pc(87) int local87;
					@Pc(89) int local89;
					@Pc(91) int local91;
					@Pc(113) int local113;
					@Pc(138) int local138;
					@Pc(230) int local230;
					@Pc(239) int local239;
					@Pc(259) int local259;
					@Pc(263) int local263;
					if ((super.aByteArrayArrayArray10[local13][local69][local17] & 0x1) != 0) {
						local87 = local17;
						local89 = local17;
						local91 = local13;
						while (super.anInt6543 > local89 && (super.aByteArrayArrayArray10[local13][local69][local89 + 1] & 0x1) != 0) {
							local89++;
						}
						local113 = local13;
						while (local87 > 0 && (super.aByteArrayArrayArray10[local13][local69][local87 - 1] & 0x1) != 0) {
							local87--;
						}
						label164: while (local91 > 0) {
							for (local138 = local87; local138 <= local89; local138++) {
								if ((super.aByteArrayArrayArray10[local91 - 1][local69][local138] & 0x1) == 0) {
									break label164;
								}
							}
							local91--;
						}
						label153: while (local113 < 3) {
							for (local138 = local87; local138 <= local89; local138++) {
								if ((super.aByteArrayArrayArray10[local113 + 1][local69][local138] & 0x1) == 0) {
									break label153;
								}
							}
							local113++;
						}
						local138 = (local113 + 1 - local91) * (local89 + 1 - local87);
						if (local138 >= 2) {
							local230 = super.anIntArrayArrayArray9[local113][local69][local87] - 240;
							local239 = super.anIntArrayArrayArray9[local91][local69][local87];
							Static144.method2727(1, local69 << 7, local69 << 7, local87 << 7, (local89 << 7) + 128, local230, local239);
							for (local259 = local91; local259 <= local113; local259++) {
								for (local263 = local87; local263 <= local89; local263++) {
									super.aByteArrayArrayArray10[local259][local69][local263] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray10[local13][local69][local17] & 0x2) != 0) {
						local87 = local69;
						local89 = local69;
						local91 = local13;
						local113 = local13;
						while (local87 > 0 && (super.aByteArrayArrayArray10[local13][local87 - 1][local17] & 0x2) != 0) {
							local87--;
						}
						while (super.anInt6536 > local89 && (super.aByteArrayArrayArray10[local13][local89 + 1][local17] & 0x2) != 0) {
							local89++;
						}
						label218: while (local91 > 0) {
							for (local138 = local87; local138 <= local89; local138++) {
								if ((super.aByteArrayArrayArray10[local91 - 1][local138][local17] & 0x2) == 0) {
									break label218;
								}
							}
							local91--;
						}
						label207: while (local113 < 3) {
							for (local138 = local87; local138 <= local89; local138++) {
								if ((super.aByteArrayArrayArray10[local113 + 1][local138][local17] & 0x2) == 0) {
									break label207;
								}
							}
							local113++;
						}
						local138 = (local89 + 1 - local87) * (local113 + 1 - local91);
						if (local138 >= 2) {
							local230 = super.anIntArrayArrayArray9[local113][local87][local17] - 240;
							local239 = super.anIntArrayArrayArray9[local91][local87][local17];
							Static144.method2727(2, local87 << 7, (local89 << 7) + 128, local17 << 7, local17 << 7, local230, local239);
							for (local259 = local91; local259 <= local113; local259++) {
								for (local263 = local87; local263 <= local89; local263++) {
									super.aByteArrayArrayArray10[local259][local263][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray10[local13][local69][local17] & 0x4) != 0) {
						local87 = local69;
						local89 = local69;
						for (local91 = local17; local91 > 0 && (super.aByteArrayArrayArray10[local13][local69][local91 - 1] & 0x4) != 0; local91--) {
						}
						for (local113 = local17; super.anInt6543 > local113 && (super.aByteArrayArrayArray10[local13][local69][local113 + 1] & 0x4) != 0; local113++) {
						}
						label271: while (local87 > 0) {
							for (local138 = local91; local138 <= local113; local138++) {
								if ((super.aByteArrayArrayArray10[local13][local87 - 1][local138] & 0x4) == 0) {
									break label271;
								}
							}
							local87--;
						}
						label260: while (local89 < super.anInt6536) {
							for (local138 = local91; local138 <= local113; local138++) {
								if ((super.aByteArrayArrayArray10[local13][local89 + 1][local138] & 0x4) == 0) {
									break label260;
								}
							}
							local89++;
						}
						if ((local113 + 1 - local91) * ((local89 - local87) + 1) >= 4) {
							local138 = super.anIntArrayArrayArray9[local13][local87][local91];
							Static144.method2727(4, local87 << 7, (local89 << 7) + 128, local91 << 7, (local113 << 7) + 128, local138, local138);
							for (@Pc(708) int local708 = local87; local708 <= local89; local708++) {
								for (local230 = local91; local230 <= local113; local230++) {
									super.aByteArrayArrayArray10[local13][local708][local230] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!qa;ILclient!aea;III)V")
	public void method5432(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class10 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) Interface10 local7 = null;
		if (arg0 == 0) {
			local7 = (Interface10) Static490.method6780(arg4, arg2, arg5);
		}
		if (arg0 == 1) {
			local7 = (Interface10) Static475.method6634(arg4, arg2, arg5);
		}
		if (arg0 == 2) {
			local7 = (Interface10) Static188.method3173(arg4, arg2, arg5, p.class);
		}
		if (arg0 == 3) {
			local7 = (Interface10) Static469.method6581(arg4, arg2, arg5);
		}
		if (local7 == null) {
			return;
		}
		@Pc(65) Class283 local65 = Static453.aClass88_3.method2294(local7.method6868());
		@Pc(69) int local69 = local7.method6867();
		@Pc(73) int local73 = local7.method6866();
		if (local65.method6615()) {
			Static428.method6111(arg2, arg5, local65, arg4);
		}
		if (local7.method6871()) {
			local7.method6869(arg1);
		}
		if (arg0 == 0) {
			@Pc(98) Class15_Sub3 local98 = Static490.method6780(arg4, arg2, arg5);
			if (local98 instanceof Class15_Sub3_Sub1) {
				((Class15_Sub3_Sub1) local98).aClass15_Sub3_1 = null;
			} else {
				Static335.method5242(arg4, arg2, arg5);
			}
			if (local65.anInt8165 != 0) {
				arg3.method306(arg5, arg2, local69, !local65.aBoolean585, local73, local65.aBoolean583);
				return;
			}
		} else if (arg0 == 1) {
			@Pc(285) Class15_Sub1 local285 = Static475.method6634(arg4, arg2, arg5);
			if (!(local285 instanceof Class15_Sub1_Sub1)) {
				Static471.method6593(arg4, arg2, arg5);
				return;
			}
			((Class15_Sub1_Sub1) local285).aClass15_Sub1_1 = null;
		} else {
			if (arg0 == 2) {
				@Pc(151) Class15_Sub2 local151 = Static188.method3173(arg4, arg2, arg5, p.class);
				if (local151 instanceof Class15_Sub2_Sub4 && local151.aShort110 == arg2 && local151.aShort109 == arg5) {
					((Class15_Sub2_Sub4) local151).aClass15_Sub2_2 = null;
				} else {
					Static4.method5497(arg4, arg2, arg5, p.class);
				}
				if (local65.anInt8165 != 0 && local65.anInt8184 + arg2 < super.anInt6536 && super.anInt6543 > arg5 + local65.anInt8184 && super.anInt6536 > local65.anInt8153 + arg2 && super.anInt6543 > local65.anInt8153 + arg5) {
					arg3.method307(arg2, !local65.aBoolean585, arg5, local65.anInt8184, local73, local65.anInt8153, local65.aBoolean583);
					return;
				}
			} else if (arg0 == 3) {
				@Pc(255) Class15_Sub5 local255 = Static469.method6581(arg4, arg2, arg5);
				if (local255 instanceof Class15_Sub5_Sub3) {
					((Class15_Sub5_Sub3) local255).aClass15_Sub5_2 = null;
				} else {
					Static521.method7147(arg4, arg2, arg5);
				}
				if (local65.anInt8165 != 1) {
					return;
				}
				arg3.method308(arg2, arg5);
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!qa;IIIBLclient!aea;IIII)V")
	public void method5433(@OriginalArg(0) int arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class10 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static300.aClass5_Sub28_Sub1_1.method4118(Static17.anInt459) && !Static189.method4028(arg2, arg3, Static283.anInt5784, arg8)) {
			return;
		}
		if (this.anInt6556 > arg0) {
			this.anInt6556 = arg0;
		}
		@Pc(46) Class283 local46 = Static453.aClass88_3.method2294(arg6);
		if (arg1.method7028() && Static300.aClass5_Sub28_Sub1_1.aBoolean327 && local46.aBoolean579) {
			return;
		}
		@Pc(68) int local68;
		@Pc(65) int local65;
		if (arg7 == 1 || arg7 == 3) {
			local68 = local46.anInt8153;
			local65 = local46.anInt8184;
		} else {
			local65 = local46.anInt8153;
			local68 = local46.anInt8184;
		}
		@Pc(101) int local101;
		@Pc(94) int local94;
		if (super.anInt6536 >= local68 + arg3) {
			local94 = arg3 + (local68 + 1 >> 1);
			local101 = arg3 + (local68 >> 1);
		} else {
			local101 = arg3;
			local94 = arg3 + 1;
		}
		@Pc(121) int local121;
		@Pc(129) int local129;
		if (super.anInt6543 >= local65 + arg2) {
			local121 = (local65 >> 1) + arg2;
			local129 = arg2 + (local65 + 1 >> 1);
		} else {
			local129 = arg2 + 1;
			local121 = arg2;
		}
		@Pc(141) Class131 local141 = Static248.aClass131Array4[arg8];
		@Pc(165) int local165 = local141.ba(local101, local121) + local141.ba(local94, local121) + local141.ba(local101, local129) + local141.ba(local94, local129) >> 2;
		@Pc(173) int local173 = (arg3 << 7) + (local68 << 6);
		@Pc(182) int local182 = (arg2 << 7) + (local65 << 6);
		@Pc(194) boolean local194 = Static409.aBoolean517 && !super.aBoolean453 && local46.aBoolean587;
		if (local46.method6615()) {
			Static160.method2898(arg3, arg7, local46, arg2, arg0, null, null);
		}
		@Pc(230) boolean local230 = arg9 == -1 && local46.anInt8156 == -1 && local46.anIntArray636 == null && local46.anIntArray632 == null && !local46.aBoolean582;
		if (Static250.aBoolean348 && (Static284.method4809(arg4) && local46.anInt8162 != 1 || !(!Static158.method2884(arg4) || local46.anInt8162 != 0))) {
			return;
		}
		if (arg4 != 22) {
			@Pc(395) Class15_Sub2 local395;
			@Pc(356) Class15_Sub2_Sub6 local356;
			@Pc(393) int local393;
			if (arg4 == 10 || arg4 == 11) {
				local356 = null;
				if (local230) {
					@Pc(387) Class15_Sub2_Sub6 local387 = new Class15_Sub2_Sub6(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg3, arg3 + local68 - 1, arg2, arg2 + local65 - 1, arg4, arg7, local194);
					local356 = local387;
					local393 = local387.method6874();
					local395 = local387;
				} else {
					local395 = new Class15_Sub2_Sub2(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg3, local68 + arg3 - 1, arg2, local65 + arg2 - 1, arg4, arg7, arg9);
					local393 = 15;
				}
				@Pc(439) Class15_Sub2 local439 = Static188.method3173(arg0, arg3, arg2, p.class);
				@Pc(441) boolean local441 = false;
				if (local439 instanceof Class15_Sub2_Sub4 && local439.aShort110 == arg3 && local439.aShort109 == arg2) {
					local441 = true;
					((Class15_Sub2_Sub4) local439).aClass15_Sub2_2 = local395;
				}
				if (local441 || Static68.method1297(local395, false)) {
					if (local356 != null && local356.method6871()) {
						local356.method6872(arg1);
					}
					if (local46.aBoolean588 && Static409.aBoolean517) {
						if (local393 > 30) {
							local393 = 30;
						}
						for (@Pc(490) int local490 = 0; local490 <= local68; local490++) {
							for (@Pc(494) int local494 = 0; local494 <= local65; local494++) {
								local141.Q(arg3 + local490, arg2 - -local494, local393);
							}
						}
					}
				}
				if (local46.anInt8165 != 0 && arg5 != null) {
					arg5.method313(arg3, arg2, local65, local68, !local46.aBoolean585, local46.aBoolean583);
				}
			} else {
				@Pc(641) Class15_Sub2 local641;
				if (arg4 >= 12 && arg4 <= 17 || arg4 >= 18 && arg4 <= 21) {
					if (local230) {
						local356 = new Class15_Sub2_Sub6(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg3, arg3 + local68 - 1, arg2, local65 + arg2 - 1, arg4, arg7, local194);
						local395 = local356;
						if (local356.method6871()) {
							local356.method6872(arg1);
						}
					} else {
						local395 = new Class15_Sub2_Sub2(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg3, arg3 + local68 - 1, arg2, local65 + arg2 - 1, arg4, arg7, arg9);
					}
					local641 = Static188.method3173(arg0, arg3, arg2, p.class);
					if (local641 instanceof Class15_Sub2_Sub4 && local641.aShort110 == arg3 && local641.aShort109 == arg2) {
						((Class15_Sub2_Sub4) local641).aClass15_Sub2_2 = local395;
					} else {
						Static68.method1297(local395, false);
					}
					if (Static409.aBoolean517 && !super.aBoolean453 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg0 > 0 && local46.anInt8162 != 0) {
						super.aByteArrayArrayArray10[arg0][arg3][arg2] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg2] | 0x4);
					}
					if (local46.anInt8165 != 0 && arg5 != null) {
						arg5.method313(arg3, arg2, local65, local68, !local46.aBoolean585, local46.aBoolean583);
					}
				} else {
					@Pc(765) Class15_Sub3 local765;
					if (arg4 == 0) {
						@Pc(739) int local739 = local46.anInt8162;
						if (Static307.aBoolean415 && local46.anInt8162 == -1) {
							local739 = 1;
						}
						if (local230) {
							@Pc(782) Class15_Sub3_Sub2 local782 = new Class15_Sub3_Sub2(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, arg4, arg7, local194);
							if (local782.method6871()) {
								local782.method6872(arg1);
							}
							local765 = local782;
						} else {
							local765 = new Class15_Sub3_Sub3(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg4, arg7, arg9);
						}
						@Pc(799) Class15_Sub3 local799 = Static490.method6780(arg0, arg3, arg2);
						if (local799 instanceof Class15_Sub3_Sub1) {
							((Class15_Sub3_Sub1) local799).aClass15_Sub3_1 = local765;
						} else {
							Static241.method4094(arg0, arg3, arg2, local765, null);
						}
						if (Static409.aBoolean517) {
							if (arg7 == 0) {
								if (local46.aBoolean588) {
									local141.Q(arg3, arg2, 50);
									local141.Q(arg3, arg2 + 1, 50);
								}
								if (local739 == 1 && !super.aBoolean453) {
									super.aByteArrayArrayArray10[arg0][arg3][arg2] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg2] | 0x1);
								}
							} else if (arg7 == 1) {
								if (local46.aBoolean588) {
									local141.Q(arg3, arg2 + 1, 50);
									local141.Q(arg3 + 1, arg2 + 1, 50);
								}
								if (local739 == 1 && !super.aBoolean453) {
									super.aByteArrayArrayArray10[arg0][arg3][arg2 + 1] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg2 + 1] | 0x2);
								}
							} else if (arg7 == 2) {
								if (local46.aBoolean588) {
									local141.Q(arg3 + 1, arg2, 50);
									local141.Q(arg3 + 1, arg2 + 1, 50);
								}
								if (local739 == 1 && !super.aBoolean453) {
									super.aByteArrayArrayArray10[arg0][arg3 + 1][arg2] = (byte) (super.aByteArrayArrayArray10[arg0][arg3 + 1][arg2] | 0x1);
								}
							} else if (arg7 == 3) {
								if (local46.aBoolean588) {
									local141.Q(arg3, arg2, 50);
									local141.Q(arg3 + 1, arg2, 50);
								}
								if (local739 == 1 && !super.aBoolean453) {
									super.aByteArrayArrayArray10[arg0][arg3][arg2] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg2] | 0x2);
								}
							}
						}
						if (local46.anInt8165 != 0 && arg5 != null) {
							arg5.method310(arg3, arg7, !local46.aBoolean585, arg2, local46.aBoolean583, arg4);
						}
						if (local46.anInt8144 != 16) {
							Static364.method5568(arg0, arg3, arg2, local46.anInt8144);
						}
					} else {
						@Pc(1068) Class15_Sub3_Sub2 local1068;
						@Pc(1078) Class15_Sub3 local1078;
						if (arg4 == 1) {
							if (local230) {
								local1068 = new Class15_Sub3_Sub2(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, arg4, arg7, local194);
								if (local1068.method6871()) {
									local1068.method6872(arg1);
								}
								local1078 = local1068;
							} else {
								local1078 = new Class15_Sub3_Sub3(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg4, arg7, arg9);
							}
							local765 = Static490.method6780(arg0, arg3, arg2);
							if (local765 instanceof Class15_Sub3_Sub1) {
								((Class15_Sub3_Sub1) local765).aClass15_Sub3_1 = local1078;
							} else {
								Static241.method4094(arg0, arg3, arg2, local1078, null);
							}
							if (local46.aBoolean588 && Static409.aBoolean517) {
								if (arg7 == 0) {
									local141.Q(arg3, arg2 + 1, 50);
								} else if (arg7 == 1) {
									local141.Q(arg3 + 1, arg2 + 1, 50);
								} else if (arg7 == 2) {
									local141.Q(arg3 + 1, arg2, 50);
								} else if (arg7 == 3) {
									local141.Q(arg3, arg2, 50);
								}
							}
							if (local46.anInt8165 != 0 && arg5 != null) {
								arg5.method310(arg3, arg7, !local46.aBoolean585, arg2, local46.aBoolean583, arg4);
							}
						} else if (arg4 == 2) {
							local393 = arg7 + 1 & 0x3;
							if (local230) {
								@Pc(1224) Class15_Sub3_Sub2 local1224 = new Class15_Sub3_Sub2(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, arg4, arg7 + 4, local194);
								@Pc(1239) Class15_Sub3_Sub2 local1239 = new Class15_Sub3_Sub2(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, arg4, local393, local194);
								if (local1224.method6871()) {
									local1224.method6872(arg1);
								}
								local765 = local1239;
								local1078 = local1224;
								if (local1239.method6871()) {
									local1239.method6872(arg1);
								}
							} else {
								local1078 = new Class15_Sub3_Sub3(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg4, arg7 + 4, arg9);
								local765 = new Class15_Sub3_Sub3(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg4, local393, arg9);
							}
							Static241.method4094(arg0, arg3, arg2, local1078, local765);
							if (local46.anInt8162 == 1 && Static409.aBoolean517 && !super.aBoolean453) {
								if (arg7 == 0) {
									super.aByteArrayArrayArray10[arg0][arg3][arg2] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg2] | 0x1);
									super.aByteArrayArrayArray10[arg0][arg3][arg2 + 1] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg2 + 1] | 0x2);
								} else if (arg7 == 1) {
									super.aByteArrayArrayArray10[arg0][arg3][arg2 + 1] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg2 + 1] | 0x2);
									super.aByteArrayArrayArray10[arg0][arg3 + 1][arg2] = (byte) (super.aByteArrayArrayArray10[arg0][arg3 + 1][arg2] | 0x1);
								} else if (arg7 == 2) {
									super.aByteArrayArrayArray10[arg0][arg3 + 1][arg2] = (byte) (super.aByteArrayArrayArray10[arg0][arg3 + 1][arg2] | 0x1);
									super.aByteArrayArrayArray10[arg0][arg3][arg2] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg2] | 0x2);
								} else if (arg7 == 3) {
									super.aByteArrayArrayArray10[arg0][arg3][arg2] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg2] | 0x2);
									super.aByteArrayArrayArray10[arg0][arg3][arg2] = (byte) (super.aByteArrayArrayArray10[arg0][arg3][arg2] | 0x1);
								}
							}
							if (local46.anInt8165 != 0 && arg5 != null) {
								arg5.method310(arg3, arg7, !local46.aBoolean585, arg2, local46.aBoolean583, arg4);
							}
							if (local46.anInt8144 != 16) {
								Static364.method5568(arg0, arg3, arg2, local46.anInt8144);
							}
						} else if (arg4 == 3) {
							if (local230) {
								local1068 = new Class15_Sub3_Sub2(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, arg4, arg7, local194);
								local1078 = local1068;
								if (local1068.method6871()) {
									local1068.method6872(arg1);
								}
							} else {
								local1078 = new Class15_Sub3_Sub3(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg4, arg7, arg9);
							}
							local765 = Static490.method6780(arg0, arg3, arg2);
							if (local765 instanceof Class15_Sub3_Sub1) {
								((Class15_Sub3_Sub1) local765).aClass15_Sub3_1 = local1078;
							} else {
								Static241.method4094(arg0, arg3, arg2, local1078, null);
							}
							if (local46.aBoolean588 && Static409.aBoolean517) {
								if (arg7 == 0) {
									local141.Q(arg3, arg2 + 1, 50);
								} else if (arg7 == 1) {
									local141.Q(arg3 + 1, arg2 + 1, 50);
								} else if (arg7 == 2) {
									local141.Q(arg3 + 1, arg2, 50);
								} else if (arg7 == 3) {
									local141.Q(arg3, arg2, 50);
								}
							}
							if (local46.anInt8165 != 0 && arg5 != null) {
								arg5.method310(arg3, arg7, !local46.aBoolean585, arg2, local46.aBoolean583, arg4);
							}
						} else if (arg4 == 9) {
							if (local230) {
								local356 = new Class15_Sub2_Sub6(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg3, arg3, arg2, arg2, arg4, arg7, local194);
								local395 = local356;
								if (local356.method6871()) {
									local356.method6872(arg1);
								}
							} else {
								local395 = new Class15_Sub2_Sub2(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg3, arg3 + local68 - 1, arg2, arg2 + local65 - 1, arg4, arg7, arg9);
							}
							local641 = Static188.method3173(arg0, arg3, arg2, p.class);
							if (local641 instanceof Class15_Sub2_Sub4 && local641.aShort110 == arg3 && arg2 == local641.aShort109) {
								((Class15_Sub2_Sub4) local641).aClass15_Sub2_2 = local395;
							} else {
								Static68.method1297(local395, false);
							}
							if (local46.anInt8165 != 0 && arg5 != null) {
								arg5.method313(arg3, arg2, local65, local68, !local46.aBoolean585, local46.aBoolean583);
							}
							if (local46.anInt8144 != 16) {
								Static364.method5568(arg0, arg3, arg2, local46.anInt8144);
							}
						} else {
							@Pc(1850) Class15_Sub1 local1850;
							if (arg4 == 4) {
								if (local230) {
									@Pc(1848) Class15_Sub1_Sub3 local1848 = new Class15_Sub1_Sub3(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, 0, 0, 0, arg4, arg7);
									local1850 = local1848;
									if (local1848.method6871()) {
										local1848.method6872(arg1);
									}
								} else {
									local1850 = new Class15_Sub1_Sub2(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, 0, 0, 0, arg4, arg7, arg9);
								}
								@Pc(1884) Class15_Sub1 local1884 = Static475.method6634(arg0, arg3, arg2);
								if (local1884 instanceof Class15_Sub1_Sub1) {
									((Class15_Sub1_Sub1) local1884).aClass15_Sub1_1 = local1850;
								} else {
									Static285.method4818(arg0, arg3, arg2, local1850, null);
								}
							} else {
								@Pc(1904) int local1904;
								@Pc(1910) Interface10 local1910;
								@Pc(1980) Class15_Sub1_Sub3 local1980;
								@Pc(1997) Class15_Sub1 local1997;
								if (arg4 == 5) {
									local1904 = 17;
									local1910 = (Interface10) Static490.method6780(arg0, arg3, arg2);
									if (local1910 != null) {
										local1904 = Static453.aClass88_3.method2294(local1910.method6868()).anInt8144 + 1;
									}
									if (local230) {
										local1980 = new Class15_Sub1_Sub3(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, 0, Static481.anIntArray651[arg7] * local1904, Static359.anIntArray505[arg7] * local1904, arg4, arg7);
										local1850 = local1980;
										if (local1980.method6871()) {
											local1980.method6872(arg1);
										}
									} else {
										local1850 = new Class15_Sub1_Sub2(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, 0, local1904 * Static481.anIntArray651[arg7], Static359.anIntArray505[arg7] * local1904, arg4, arg7, arg9);
									}
									local1997 = Static475.method6634(arg0, arg3, arg2);
									if (local1997 instanceof Class15_Sub1_Sub1) {
										((Class15_Sub1_Sub1) local1997).aClass15_Sub1_1 = local1850;
									} else {
										Static285.method4818(arg0, arg3, arg2, local1850, null);
									}
								} else if (arg4 == 6) {
									local1904 = 9;
									local1910 = (Interface10) Static490.method6780(arg0, arg3, arg2);
									if (local1910 != null) {
										local1904 = Static453.aClass88_3.method2294(local1910.method6868()).anInt8144 / 2 + 1;
									}
									if (local230) {
										local1980 = new Class15_Sub1_Sub3(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, arg7, local1904 * Static481.anIntArray651[arg7], Static359.anIntArray505[arg7] * local1904, arg4, arg7 + 4);
										local1850 = local1980;
										if (local1980.method6871()) {
											local1980.method6872(arg1);
										}
									} else {
										local1850 = new Class15_Sub1_Sub2(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg7, Static281.anIntArray393[arg7] * local1904, local1904 * Static180.anIntArray262[arg7], arg4, arg7 + 4, arg9);
									}
									local1997 = Static475.method6634(arg0, arg3, arg2);
									if (local1997 instanceof Class15_Sub1_Sub1) {
										((Class15_Sub1_Sub1) local1997).aClass15_Sub1_1 = local1850;
									} else {
										Static285.method4818(arg0, arg3, arg2, local1850, null);
									}
								} else if (arg4 == 7) {
									local1904 = arg7 + 2 & 0x3;
									if (local230) {
										@Pc(2161) Class15_Sub1_Sub3 local2161 = new Class15_Sub1_Sub3(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, local1904, 0, 0, arg4, local1904 + 4);
										local1850 = local2161;
										if (local2161.method6871()) {
											local2161.method6872(arg1);
										}
									} else {
										local1850 = new Class15_Sub1_Sub2(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, local1904, 0, 0, arg4, local1904 + 4, arg9);
									}
									@Pc(2199) Class15_Sub1 local2199 = Static475.method6634(arg0, arg3, arg2);
									if (local2199 instanceof Class15_Sub1_Sub1) {
										((Class15_Sub1_Sub1) local2199).aClass15_Sub1_1 = local1850;
									} else {
										Static285.method4818(arg0, arg3, arg2, local1850, null);
									}
								} else if (arg4 == 8) {
									local393 = arg7 + 2 & 0x3;
									@Pc(2227) int local2227 = 9;
									@Pc(2233) Interface10 local2233 = (Interface10) Static490.method6780(arg0, arg3, arg2);
									if (local2233 != null) {
										local2227 = Static453.aClass88_3.method2294(local2233.method6868()).anInt8144 / 2 + 1;
									}
									@Pc(2278) Class15_Sub1 local2278;
									@Pc(2297) Class15_Sub1 local2297;
									if (local230) {
										local2278 = new Class15_Sub1_Sub3(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, arg7, Static281.anIntArray393[arg7] * local2227, Static180.anIntArray262[arg7] * local2227, arg4, arg7 + 4);
										local2297 = new Class15_Sub1_Sub3(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, arg7, 0, 0, arg4, local393 + 4);
										if (local2278.method6871()) {
											local2278.method6872(arg1);
										}
										if (local2297.method6871()) {
											local2297.method6872(arg1);
										}
									} else {
										local2278 = new Class15_Sub1_Sub2(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg7, Static281.anIntArray393[arg7] * local2227, local2227 * Static180.anIntArray262[arg7], arg4, arg7 + 4, arg9);
										local2297 = new Class15_Sub1_Sub2(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg7, 0, 0, arg4, local393 + 4, arg9);
									}
									Static285.method4818(arg0, arg3, arg2, local2278, local2297);
								}
							}
						}
					}
				}
			}
		} else if (Static300.aClass5_Sub28_Sub1_1.aBoolean333 || local46.anInt8152 != 0 || local46.anInt8165 == 1 || local46.aBoolean586) {
			@Pc(287) Class15_Sub5 local287;
			if (local230) {
				@Pc(303) Class15_Sub5_Sub1 local303 = new Class15_Sub5_Sub1(arg1, local46, arg8, local173, local165, local182, super.aBoolean453, arg7, local194);
				if (local303.method6871()) {
					local303.method6872(arg1);
				}
				local287 = local303;
			} else {
				local287 = new Class15_Sub5_Sub2(arg1, local46, arg0, arg8, local173, local165, local182, super.aBoolean453, arg7, arg9);
			}
			@Pc(318) Class15_Sub5 local318 = Static469.method6581(arg0, arg3, arg2);
			if (local318 instanceof Class15_Sub5_Sub3) {
				((Class15_Sub5_Sub3) local318).aClass15_Sub5_2 = local287;
			} else {
				Static167.method2949(arg0, arg3, arg2, local287);
			}
			if (local46.anInt8165 == 1 && arg5 != null) {
				arg5.method305(arg3, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([Lclient!aea;Lclient!qa;I[BBI)V")
	public void method5434(@OriginalArg(0) Class10[] arg0, @OriginalArg(1) Class62 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class5_Sub3 local10 = new Class5_Sub3(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(22) int local22 = local10.method4199();
			if (local22 == 0) {
				return;
			}
			local12 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local10.method4231();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(52) int local52 = local33 & 0x3F;
				@Pc(58) int local58 = local33 >> 6 & 0x3F;
				@Pc(62) int local62 = local33 >> 12;
				@Pc(68) int local68 = local10.method4220();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				@Pc(80) int local80 = local58 + arg2;
				@Pc(85) int local85 = local52 + arg4;
				if (local80 > 0 && local85 > 0 && local80 < super.anInt6536 - 1 && local85 < super.anInt6543 - 1) {
					@Pc(106) Class10 local106 = null;
					if (!super.aBoolean453) {
						@Pc(111) int local111 = local62;
						if ((Static429.aByteArrayArrayArray17[1][local80][local85] & 0x2) == 2) {
							local111 = local62 - 1;
						}
						if (local111 >= 0) {
							local106 = arg0[local111];
						}
					}
					this.method5433(local62, arg1, local85, local80, local72, local106, local12, local76, local62, -1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIILclient!co;[ILclient!qa;IIBI)V")
	public void method5435(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class5_Sub3 arg4, @OriginalArg(5) int[] arg5, @OriginalArg(6) Class62 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean453) {
			return;
		}
		@Pc(17) Class227 local17 = null;
		if (arg5 != null) {
			arg5[0] = -1;
		}
		@Pc(29) int local29 = (arg2 & 0x7) * 8;
		@Pc(35) int local35 = (arg7 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(40) int local40;
						@Pc(72) int local72;
						@Pc(410) int local410;
						@Pc(90) int local90;
						while (arg4.anInt4960 < arg4.aByteArray66.length) {
							local40 = arg4.method4220();
							if (local40 == 0) {
								local17 = new Class227(arg4);
							} else {
								@Pc(96) int local96;
								@Pc(130) int local130;
								@Pc(230) int local230;
								@Pc(273) int local273;
								if (local40 == 1) {
									local72 = arg4.method4220();
									if (local72 > 0) {
										for (local410 = 0; local410 < local72; local410++) {
											@Pc(419) Class250 local419 = new Class250(arg6, arg4, 0);
											if (local419.anInt7361 == 31) {
												@Pc(430) Class268 local430 = Static307.aClass139_1.method3296(arg4.method4227());
												local419.method5998(local430.anInt7823, local430.anInt7829, local430.anInt7826, local430.anInt7825);
											}
											if (arg6.method7034() > 0) {
												@Pc(447) Class5_Sub10 local447 = local419.aClass5_Sub10_3;
												local96 = local447.method5189() >> 7;
												local130 = local447.method5183() >> 7;
												if (arg1 == local419.anInt7363 && local96 >= local29 && local96 < local29 + 8 && local130 >= local35 && local130 < local35 + 8) {
													local230 = Static412.method5987(arg8, local447.method5189() & 0x3FF, local447.method5183() & 0x3FF) + (arg0 << 7);
													local273 = Static176.method3052(local447.method5183() & 0x3FF, local447.method5189() & 0x3FF, arg8) + (arg9 << 7);
													local96 = local230 >> 7;
													local130 = local273 >> 7;
													if (local96 >= 0 && local130 >= 0 && local96 < super.anInt6536 && super.anInt6543 > local130) {
														local447.method5188(super.anIntArrayArrayArray9[arg1][local96][local130] - local447.method5190(), local230, local273);
														Static232.method3827(local419);
													}
												}
											}
										}
									}
								} else if (local40 == 2) {
									if (local17 == null) {
										local17 = new Class227();
									}
									local17.method5610(arg4);
								} else if (local40 != 128) {
									if (local40 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray12 == null) {
										super.aByteArrayArrayArray12 = new byte[4][][];
									}
									for (local72 = 0; local72 < 4; local72++) {
										@Pc(78) byte local78 = arg4.method4196();
										@Pc(94) int local94;
										if (local78 == 0 && super.aByteArrayArrayArray12[arg3] != null) {
											if (local72 <= arg1) {
												local90 = arg0;
												local94 = arg0 + 7;
												local96 = arg9;
												if (arg9 < 0) {
													local96 = 0;
												} else if (super.anInt6543 <= arg9) {
													local96 = super.anInt6543;
												}
												if (arg0 < 0) {
													local90 = 0;
												} else if (arg0 >= super.anInt6536) {
													local90 = super.anInt6536;
												}
												local130 = arg9 + 7;
												if (local94 < 0) {
													local94 = 0;
												} else if (super.anInt6536 <= local94) {
													local94 = super.anInt6536;
												}
												if (local130 < 0) {
													local130 = 0;
												} else if (super.anInt6543 <= local130) {
													local130 = super.anInt6543;
												}
												while (local94 > local90) {
													while (local130 > local96) {
														super.aByteArrayArrayArray12[arg3][local90][local96] = 0;
														local96++;
													}
													local90++;
												}
											}
										} else if (local78 == 1) {
											if (super.aByteArrayArrayArray12[arg3] == null) {
												super.aByteArrayArrayArray12[arg3] = new byte[super.anInt6536 + 1][super.anInt6543 + 1];
											}
											for (local90 = 0; local90 < 64; local90 += 4) {
												for (local94 = 0; local94 < 64; local94 += 4) {
													@Pc(217) byte local217 = arg4.method4196();
													if (arg1 >= local72) {
														for (local130 = local90; local130 < local90 + 4; local130++) {
															for (local230 = local94; local230 < local94 + 4; local230++) {
																if (local29 <= local130 && local29 + 8 > local130 && local230 >= local35 && local35 + 8 > local35) {
																	local273 = arg0 + Static283.method4801(local130 & 0x7, local230 & 0x7, arg8);
																	@Pc(286) int local286 = arg9 + Static186.method3141(local130 & 0x7, local230 & 0x7, arg8);
																	if (local273 >= 0 && local273 < super.anInt6536 && local286 >= 0 && super.anInt6543 > local286) {
																		super.aByteArrayArrayArray12[arg3][local273][local286] = local217;
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
									arg4.anInt4960 += 10;
								} else {
									arg5[0] = arg4.method4227();
									arg5[1] = arg4.method4212();
									arg5[2] = arg4.method4212();
									arg5[3] = arg4.method4212();
									arg5[4] = arg4.method4227();
								}
							}
						}
						if (local17 != null) {
							Static328.method5199(local17, arg0 >> 3, arg9 >> 3);
						}
						if (super.aByteArrayArrayArray12 != null && super.aByteArrayArrayArray12[arg3] != null) {
							local40 = arg0 + 7;
							local72 = arg9 + 7;
							for (local410 = arg0; local410 < local40; local410++) {
								for (local90 = arg9; local90 < local72; local90++) {
									super.aByteArrayArrayArray12[arg3][local410][local90] = 0;
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

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IILclient!qa;IIII[Lclient!aea;[BII)V")
	public void method5436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class10[] arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(9) int arg9) {
		@Pc(16) Class5_Sub3 local16 = new Class5_Sub3(arg8);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local16.method4199();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local16.method4231();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(52) int local52 = local33 & 0x3F;
				@Pc(58) int local58 = local33 >> 6 & 0x3F;
				@Pc(62) int local62 = local33 >> 12;
				@Pc(66) int local66 = local16.method4220();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				if (arg1 == local62 && local58 >= arg0 && arg0 + 8 > local58 && arg6 <= local52 && local52 < arg6 + 8) {
					@Pc(118) Class283 local118 = Static453.aClass88_3.method2294(local18);
					@Pc(135) int local135 = Static18.method599(arg9, local58 & 0x7, local52 & 0x7, local74, local118.anInt8184, local118.anInt8153) + arg4;
					@Pc(152) int local152 = Static14.method523(local58 & 0x7, local118.anInt8153, local118.anInt8184, local74, local52 & 0x7, arg9) + arg3;
					if (local135 > 0 && local152 > 0 && local135 < super.anInt6536 - 1 && local152 < super.anInt6543 - 1) {
						@Pc(173) Class10 local173 = null;
						if (!super.aBoolean453) {
							@Pc(178) int local178 = arg5;
							if ((Static429.aByteArrayArrayArray17[1][local135][local152] & 0x2) == 2) {
								local178 = arg5 - 1;
							}
							if (local178 >= 0) {
								local173 = arg7[local178];
							}
						}
						this.method5433(arg5, arg2, local152, local135, local70, local173, local18, arg9 + local74 & 0x3, arg5, -1);
					}
				}
			}
		}
	}
}
