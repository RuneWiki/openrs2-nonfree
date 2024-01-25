import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jda")
public final class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!jda", name = "S", descriptor = "I")
	public int anInt5139 = 99;

	@OriginalMember(owner = "client!jda", name = "<init>", descriptor = "(IIIZ)V")
	public Class96_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static587.aClass136_6, Static154.aClass321_2);
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!tea;IIIILclient!ha;I)V")
	public void method4575(@OriginalArg(0) Class319 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class100 arg4, @OriginalArg(6) int arg5) {
		@Pc(16) Interface12 local16 = this.method4583(arg1, arg2, arg3, arg5);
		if (local16 == null) {
			return;
		}
		@Pc(27) Class312 local27 = Static283.aClass210_2.method5629(local16.method9026());
		@Pc(31) int local31 = local16.method9032();
		@Pc(35) int local35 = local16.method9029();
		if (local27.method7863()) {
			Static191.method3392(arg2, arg3, local27, arg5);
		}
		if (local16.method9027()) {
			local16.method9028(arg4);
		}
		if (arg1 != 0) {
			if (arg1 == 1) {
				Static588.method8288(arg5, arg3, arg2);
				return;
			}
			if (arg1 == 2) {
				Static235.method4077(arg5, arg3, arg2, jn.class);
				if (local27.anInt9233 != 0 && arg3 + local27.anInt9244 < super.anInt5127 && super.anInt5126 > arg2 + local27.anInt9244 && super.anInt5127 > local27.anInt9235 + arg3 && local27.anInt9235 + arg2 < super.anInt5126) {
					arg0.method7941(local27.anInt9235, local27.anInt9244, local35, arg3, !local27.aBoolean628, local27.aBoolean631, arg2);
				}
				if (local31 != 9) {
					return;
				}
				if ((local35 & 0x1) != 0) {
					Static51.method884(arg5, arg2, 16, arg3);
					return;
				}
				Static51.method884(arg5, arg2, 8, arg3);
			} else if (arg1 == 3) {
				Static477.method7160(arg5, arg3, arg2);
				if (local27.anInt9233 == 1) {
					arg0.method7942(arg3, arg2);
					return;
				}
			}
			return;
		}
		Static126.method2053(arg5, arg3, arg2);
		if (local27.anInt9233 != 0) {
			arg0.method7925(arg2, local27.aBoolean631, arg3, local31, local35, !local27.aBoolean628);
		}
		if (local27.anInt9200 != 1) {
			return;
		}
		if (local35 != 0) {
			if (local35 == 1) {
				Static51.method884(arg5, arg2 + 1, 2, arg3);
				return;
			}
			if (local35 == 2) {
				Static51.method884(arg5, arg2, 1, arg3 + 1);
			} else if (local35 == 3) {
				Static51.method884(arg5, arg2, 2, arg3);
				return;
			}
			return;
		}
		Static51.method884(arg5, arg2, 1, arg3);
		return;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "([Lclient!tea;[BILclient!ha;IB)V")
	public void method4579(@OriginalArg(0) Class319[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4) {
		@Pc(15) Class6_Sub40 local15 = new Class6_Sub40(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method8597();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method8587();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(48) int local48 = local29 & 0x3F;
				@Pc(54) int local54 = local29 >> 6 & 0x3F;
				@Pc(58) int local58 = local29 >> 12;
				@Pc(62) int local62 = local15.method8604();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = local54 + arg2;
				@Pc(79) int local79 = local48 + arg4;
				if (local74 > 0 && local79 > 0 && local74 < super.anInt5127 - 1 && super.anInt5126 - 1 > local79) {
					@Pc(97) Class319 local97 = null;
					if (!super.aBoolean353) {
						@Pc(102) int local102 = local58;
						if ((Static197.aByteArrayArrayArray24[1][local74][local79] & 0x2) == 2) {
							local102 = local58 - 1;
						}
						if (local102 >= 0) {
							local97 = arg0[local102];
						}
					}
					this.method4584(local58, local66, local58, local74, local17, local70, -1, arg3, local79, local97);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(ILclient!ha;Z)V")
	public void method4580(@OriginalArg(1) Class100 arg0, @OriginalArg(2) boolean arg1) {
		Static486.method7255();
		if (!arg1) {
			@Pc(14) int local14;
			@Pc(18) int local18;
			if (super.anInt5123 > 1) {
				for (local14 = 0; super.anInt5127 > local14; local14++) {
					for (local18 = 0; super.anInt5126 > local18; local18++) {
						if ((Static197.aByteArrayArrayArray24[1][local14][local18] & 0x2) == 2) {
							Static306.method5183(local14, local18);
						}
					}
				}
			}
			for (local14 = 0; local14 < super.anInt5123; local14++) {
				for (local18 = 0; local18 <= super.anInt5126; local18++) {
					for (@Pc(58) int local58 = 0; super.anInt5127 >= local58; local58++) {
						if ((super.aByteArrayArrayArray13[local14][local58][local18] & 0x4) != 0) {
							@Pc(73) int local73 = local58;
							@Pc(75) int local75 = local58;
							@Pc(77) int local77 = local18;
							@Pc(79) int local79 = local18;
							while (local77 > 0 && (super.aByteArrayArrayArray13[local14][local58][local77 - 1] & 0x4) != 0 && local18 - local77 < 10) {
								local77--;
							}
							while (super.anInt5126 > local79 && (super.aByteArrayArrayArray13[local14][local58][local79 + 1] & 0x4) != 0 && local79 - local77 < 10) {
								local79++;
							}
							@Pc(143) int local143;
							label111: while (local73 > 0 && local58 - local73 < 10) {
								for (local143 = local77; local143 <= local79; local143++) {
									if ((super.aByteArrayArrayArray13[local14][local73 - 1][local143] & 0x4) == 0) {
										break label111;
									}
								}
								local73--;
							}
							label98: while (local75 < super.anInt5127 && local75 - local73 < 10) {
								for (local143 = local77; local143 <= local79; local143++) {
									if ((super.aByteArrayArrayArray13[local14][local75 + 1][local143] & 0x4) == 0) {
										break label98;
									}
								}
								local75++;
							}
							if ((local79 + 1 - local77) * (local75 + 1 - local73) >= 4) {
								local143 = super.anIntArrayArrayArray3[local14][local73][local77];
								Static527.method7820(local73 << 9, local77 << 9, local143, local143, local14, (local79 << 9) + 512, (local75 << 9) + 512);
								for (@Pc(265) int local265 = local73; local265 <= local75; local265++) {
									for (@Pc(269) int local269 = local77; local269 <= local79; local269++) {
										super.aByteArrayArrayArray13[local14][local265][local269] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static186.method3362();
		}
		super.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIILclient!rg;III[IIILclient!ha;)V")
	public void method4581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class6_Sub40 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class100 arg9) {
		if (super.aBoolean353) {
			return;
		}
		if (arg7 != null) {
			arg7[0] = -1;
		}
		@Pc(25) Class274 local25 = null;
		@Pc(31) int local31 = (arg4 & 0x7) * 8;
		@Pc(37) int local37 = (arg2 & 0x7) * 8;
		while (true) {
			@Pc(56) int local56;
			@Pc(117) int local117;
			@Pc(165) int local165;
			@Pc(183) int local183;
			@Pc(63) int local63;
			@Pc(109) int local109;
			label233: do {
				while (true) {
					@Pc(42) int local42;
					@Pc(331) int local331;
					while (arg3.anInt10169 < arg3.aByteArray113.length) {
						local42 = arg3.method8604();
						if (local42 == 0) {
							local25 = new Class274(arg3);
						} else {
							if (local42 == 1) {
								local56 = arg3.method8604();
								continue label233;
							}
							if (local42 == 2) {
								if (local25 == null) {
									local25 = new Class274();
								}
								local25.method7073(arg3);
							} else if (local42 != 128) {
								if (local42 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray15 == null) {
									super.aByteArrayArrayArray15 = new byte[4][][];
								}
								for (local56 = 0; local56 < 4; local56++) {
									@Pc(315) byte local315 = arg3.method8602();
									@Pc(335) int local335;
									if (local315 == 0 && super.aByteArrayArrayArray15[arg8] != null) {
										if (arg6 >= local56) {
											local331 = arg5;
											local335 = arg5 + 7;
											local109 = arg0;
											if (arg0 < 0) {
												local109 = 0;
											} else if (super.anInt5126 <= arg0) {
												local109 = super.anInt5126;
											}
											local117 = arg0 + 7;
											if (arg5 < 0) {
												local331 = 0;
											} else if (arg5 >= super.anInt5127) {
												local331 = super.anInt5127;
											}
											if (local335 < 0) {
												local335 = 0;
											} else if (local335 >= super.anInt5127) {
												local335 = super.anInt5127;
											}
											if (local117 < 0) {
												local117 = 0;
											} else if (super.anInt5126 <= local117) {
												local117 = super.anInt5126;
											}
											while (local335 > local331) {
												while (local117 > local109) {
													super.aByteArrayArrayArray15[arg8][local331][local109] = 0;
													local109++;
												}
												local331++;
											}
										}
									} else if (local315 == 1) {
										if (super.aByteArrayArrayArray15[arg8] == null) {
											super.aByteArrayArrayArray15[arg8] = new byte[super.anInt5127 + 1][super.anInt5126 + 1];
										}
										for (local331 = 0; local331 < 64; local331 += 4) {
											for (local335 = 0; local335 < 64; local335 += 4) {
												@Pc(456) byte local456 = arg3.method8602();
												if (local56 <= arg6) {
													for (local117 = local331; local117 < local331 + 4; local117++) {
														for (local165 = local335; local165 < local335 + 4; local165++) {
															if (local31 <= local117 && local31 + 8 > local117 && local165 >= local37 && local37 + 8 > local37) {
																local183 = Static83.method1430(arg1, local117 & 0x7, local165 & 0x7) + arg5;
																@Pc(515) int local515 = Static51.method885(local117 & 0x7, local165 & 0x7, arg1) + arg0;
																if (local183 >= 0 && local183 < super.anInt5127 && local515 >= 0 && local515 < super.anInt5126) {
																	super.aByteArrayArrayArray15[arg8][local183][local515] = local456;
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
								arg3.anInt10169 += 10;
							} else {
								arg7[0] = arg3.method8571();
								arg7[1] = arg3.method8615();
								arg7[2] = arg3.method8615();
								arg7[3] = arg3.method8615();
								arg7[4] = arg3.method8571();
							}
						}
					}
					if (local25 != null) {
						Static283.method5438(arg0 >> 3, arg5 >> 3, local25);
					}
					if (super.aByteArrayArrayArray15 != null && super.aByteArrayArrayArray15[arg8] != null) {
						local42 = arg5 + 7;
						local56 = arg0 + 7;
						for (local63 = arg5; local63 < local42; local63++) {
							for (local331 = arg0; local331 < local56; local331++) {
								super.aByteArrayArrayArray15[arg8][local63][local331] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local56 <= 0);
			for (local63 = 0; local63 < local56; local63++) {
				@Pc(72) Class68 local72 = new Class68(arg9, arg3, 2);
				if (local72.anInt2176 == 31) {
					@Pc(83) Class383 local83 = Static595.aClass92_1.method2341(arg3.method8571());
					local72.method1829(local83.anInt10698, local83.anInt10696, local83.anInt10699, local83.anInt10694);
				}
				if (arg9.method8780() > 0) {
					@Pc(103) Class6_Sub1 local103 = local72.aClass6_Sub1_1;
					local109 = local103.method8264() >> 9;
					local117 = local103.method8260() >> 9;
					if (local72.anInt2166 == arg6 && local109 >= local31 && local109 < local31 + 8 && local37 <= local117 && local117 < local37 + 8) {
						local165 = (arg5 << 9) + Static31.method552(local103.method8260() & 0xFFF, arg1, local103.method8264() & 0xFFF);
						local183 = Static30.method3898(local103.method8264() & 0xFFF, arg1, local103.method8260() & 0xFFF) + (arg0 << 9);
						local109 = local165 >> 9;
						local117 = local183 >> 9;
						if (local109 >= 0 && local117 >= 0 && super.anInt5127 > local109 && local117 < super.anInt5126) {
							local103.method8262(local165, local183, super.anIntArrayArrayArray3[arg6][local109][local117] - local103.method8267());
							Static321.method5343(local72);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(Lclient!ha;IBILclient!rg;[I)V")
	public void method4582(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class6_Sub40 arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean353) {
			return;
		}
		@Pc(27) boolean local27 = false;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(35) Class274 local35 = null;
		while (true) {
			@Pc(40) int local40;
			@Pc(61) int local61;
			@Pc(226) int local226;
			@Pc(230) int local230;
			@Pc(68) int local68;
			while (arg3.anInt10169 < arg3.aByteArray113.length) {
				local40 = arg3.method8604();
				if (local40 == 0) {
					local35 = new Class274(arg3);
				} else {
					@Pc(116) int local116;
					@Pc(124) int local124;
					@Pc(128) int local128;
					if (local40 == 1) {
						local61 = arg3.method8604();
						if (local61 > 0) {
							for (local68 = 0; local68 < local61; local68++) {
								@Pc(77) Class68 local77 = new Class68(arg0, arg3, 2);
								if (local77.anInt2176 == 31) {
									@Pc(88) Class383 local88 = Static595.aClass92_1.method2341(arg3.method8571());
									local77.method1829(local88.anInt10698, local88.anInt10696, local88.anInt10699, local88.anInt10694);
								}
								if (arg0.method8780() > 0) {
									@Pc(108) Class6_Sub1 local108 = local77.aClass6_Sub1_1;
									local116 = local108.method8264() + (arg2 << 9);
									local124 = (arg1 << 9) + local108.method8260();
									local128 = local116 >> 9;
									@Pc(132) int local132 = local124 >> 9;
									if (local128 >= 0 && local132 >= 0 && local128 < super.anInt5127 && local132 < super.anInt5126) {
										local108.method8262(local116, local124, super.anIntArrayArrayArray3[local77.anInt2166][local128][local132] - local108.method8267());
										Static321.method5343(local77);
									}
								}
							}
						}
					} else if (local40 == 2) {
						if (local35 == null) {
							local35 = new Class274();
						}
						local35.method7073(arg3);
					} else if (local40 != 128) {
						if (local40 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						for (local61 = 0; local61 < 4; local61++) {
							@Pc(217) byte local217 = arg3.method8602();
							if (local217 == 0 && super.aByteArrayArrayArray15[local61] != null) {
								local226 = arg2;
								local230 = arg2 + 64;
								local116 = arg1;
								if (local230 < 0) {
									local230 = 0;
								} else if (local230 >= super.anInt5127) {
									local230 = super.anInt5127;
								}
								if (arg1 < 0) {
									local116 = 0;
								} else if (super.anInt5126 <= arg1) {
									local116 = super.anInt5126;
								}
								if (arg2 < 0) {
									local226 = 0;
								} else if (super.anInt5127 <= arg2) {
									local226 = super.anInt5127;
								}
								local124 = arg1 + 64;
								if (local124 < 0) {
									local124 = 0;
								} else if (super.anInt5126 <= local124) {
									local124 = super.anInt5126;
								}
								while (local226 < local230) {
									while (local116 < local124) {
										super.aByteArrayArrayArray15[local61][local226][local116] = 0;
										local116++;
									}
									local226++;
								}
							} else if (local217 == 1) {
								if (super.aByteArrayArrayArray15[local61] == null) {
									super.aByteArrayArrayArray15[local61] = new byte[super.anInt5127 + 1][super.anInt5126 + 1];
								}
								for (local226 = 0; local226 < 64; local226 += 4) {
									for (local230 = 0; local230 < 64; local230 += 4) {
										@Pc(345) byte local345 = arg3.method8602();
										for (local124 = arg2 + local226; local124 < local226 + arg2 + 4; local124++) {
											for (local128 = local230 + arg1; local128 < local230 + arg1 + 4; local128++) {
												if (local124 >= 0 && super.anInt5127 > local124 && local128 >= 0 && local128 < super.anInt5126) {
													super.aByteArrayArrayArray15[local61][local124][local128] = local345;
												}
											}
										}
									}
								}
							} else if (local217 == 2) {
								if (super.aByteArrayArrayArray15[local61] == null) {
									super.aByteArrayArrayArray15[local61] = new byte[super.anInt5127 + 1][super.anInt5126 + 1];
								}
								if (local61 > 0) {
									local226 = arg2;
									local230 = arg2 + 64;
									local116 = arg1;
									if (arg2 < 0) {
										local226 = 0;
									} else if (super.anInt5127 <= arg2) {
										local226 = super.anInt5127;
									}
									if (local230 < 0) {
										local230 = 0;
									} else if (super.anInt5127 <= local230) {
										local230 = super.anInt5127;
									}
									if (arg1 < 0) {
										local116 = 0;
									} else if (super.anInt5126 <= arg1) {
										local116 = super.anInt5126;
									}
									local124 = arg1 + 64;
									if (local124 < 0) {
										local124 = 0;
									} else if (super.anInt5126 <= local124) {
										local124 = super.anInt5126;
									}
									while (local226 < local230) {
										while (local124 > local116) {
											super.aByteArrayArrayArray15[local61][local226][local116] = super.aByteArrayArrayArray15[local61 - 1][local226][local116];
											local116++;
										}
										local226++;
									}
								}
							}
						}
						local27 = true;
					} else if (arg4 == null) {
						arg3.anInt10169 += 10;
					} else {
						arg4[0] = arg3.method8571();
						arg4[1] = arg3.method8615();
						arg4[2] = arg3.method8615();
						arg4[3] = arg3.method8615();
						arg4[4] = arg3.method8571();
					}
				}
			}
			if (local35 != null) {
				for (local40 = 0; local40 < 8; local40++) {
					for (local61 = 0; local61 < 8; local61++) {
						local68 = (arg2 >> 3) + local40;
						local226 = (arg1 >> 3) + local61;
						if (local68 >= 0 && super.anInt5127 >> 3 > local68 && local226 >= 0 && local226 < super.anInt5126 >> 3) {
							Static283.method5438(local226, local68, local35);
						}
					}
				}
			}
			if (!local27 && super.aByteArrayArrayArray15 != null) {
				for (local40 = 0; local40 < 4; local40++) {
					if (super.aByteArrayArrayArray15[local40] != null) {
						for (local61 = 0; local61 < 16; local61++) {
							for (local68 = 0; local68 < 16; local68++) {
								local226 = local61 + (arg2 >> 2);
								local230 = local68 + (arg1 >> 2);
								if (local226 >= 0 && local226 < 26 && local230 >= 0 && local230 < 26) {
									super.aByteArrayArrayArray15[local40][local226][local230] = 0;
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

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIZII)Lclient!jn;")
	public Interface12 method4583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface12 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface12) Static245.method5549(arg3, arg2, arg1);
		}
		if (arg0 == 1) {
			local5 = (Interface12) Static578.method5708(arg3, arg2, arg1);
		}
		if (arg0 == 2) {
			local5 = (Interface12) Static366.method5797(arg3, arg2, arg1, jn.class);
		}
		if (arg0 == 3) {
			local5 = (Interface12) Static158.method2999(arg3, arg2, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(IIBIIIIILclient!ha;ILclient!tea;)V")
	public void method4584(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class100 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class319 arg9) {
		if (Static348.aClass6_Sub22_19.aClass15_Sub28_2.method8677() == 0 && !Static510.method7565(Static110.anInt2165, arg8, arg0, arg3)) {
			return;
		}
		if (arg2 < this.anInt5139) {
			this.anInt5139 = arg2;
		}
		@Pc(30) Class312 local30 = Static283.aClass210_2.method5629(arg4);
		if (Static348.aClass6_Sub22_19.aClass15_Sub27_1.method8659() == 0 && local30.aBoolean626) {
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg5 == 1 || arg5 == 3) {
			local56 = local30.anInt9244;
			local53 = local30.anInt9235;
		} else {
			local53 = local30.anInt9244;
			local56 = local30.anInt9235;
		}
		@Pc(85) int local85;
		@Pc(79) int local79;
		if (arg3 + local53 <= super.anInt5127) {
			local79 = (local53 + 1 >> 1) + arg3;
			local85 = (local53 >> 1) + arg3;
		} else {
			local85 = arg3;
			local79 = arg3 + 1;
		}
		@Pc(119) int local119;
		@Pc(112) int local112;
		if (arg8 + local56 <= super.anInt5126) {
			local112 = arg8 + (local56 + 1 >> 1);
			local119 = arg8 + (local56 >> 1);
		} else {
			local112 = arg8 + 1;
			local119 = arg8;
		}
		@Pc(131) Class199 local131 = Static195.aClass199Array1[arg0];
		@Pc(157) int local157 = local131.method8532(local85, local119) + local131.method8532(local79, local119) + local131.method8532(local85, local112) + local131.method8532(local79, local112) >> 2;
		@Pc(165) int local165 = (local53 << 8) + (arg3 << 9);
		@Pc(174) int local174 = (arg8 << 9) + (local56 << 8);
		@Pc(186) boolean local186 = Static592.aBoolean676 && !super.aBoolean353 && local30.aBoolean617;
		if (local30.method7863()) {
			Static474.method7154((Class20_Sub2_Sub2_Sub1_Sub1) null, arg3, arg8, arg5, (Class20_Sub2_Sub2_Sub1_Sub2) null, arg2, local30);
		}
		@Pc(223) boolean local223 = arg6 == -1 && local30.anInt9196 == -1 && local30.anIntArray566 == null && local30.anIntArray565 == null && !local30.aBoolean622 && !local30.aBoolean619;
		if (Static280.aBoolean381 && (Static350.method5636(arg1) && local30.anInt9200 != 1 || !(!Static506.method7510(arg1) || local30.anInt9200 != 0))) {
			return;
		}
		if (arg1 != 22) {
			@Pc(373) Class20_Sub2_Sub2 local373;
			@Pc(340) Class20_Sub2_Sub2_Sub2 local340;
			@Pc(379) int local379;
			@Pc(439) int local439;
			if (arg1 == 10 || arg1 == 11) {
				local340 = null;
				if (local223) {
					@Pc(371) Class20_Sub2_Sub2_Sub2 local371 = new Class20_Sub2_Sub2_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg3, arg3 + local53 - 1, arg8, arg8 + local56 - 1, arg1, arg5, local186);
					local373 = local371;
					local340 = local371;
					local379 = local371.method1572();
				} else {
					local373 = new Class20_Sub2_Sub2_Sub5(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg3, local53 + arg3 - 1, arg8, arg8 + local56 - 1, arg1, arg5, arg6);
					local379 = 15;
				}
				if (Static152.method4562(local373, false)) {
					if (local340 != null && local340.method9027()) {
						local340.method9030(arg7);
					}
					if (local30.aBoolean630 && Static592.aBoolean676) {
						if (local379 > 30) {
							local379 = 30;
						}
						for (local439 = 0; local439 <= local53; local439++) {
							for (@Pc(443) int local443 = 0; local443 <= local56; local443++) {
								local131.ka(local439 + arg3, local443 + arg8, local379);
							}
						}
					}
				}
				if (local30.anInt9233 != 0 && arg9 != null) {
					arg9.method7928(local30.aBoolean631, arg3, local53, arg8, local56, !local30.aBoolean628);
				}
			} else if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
				if (local223) {
					local340 = new Class20_Sub2_Sub2_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg3, local53 + arg3 - 1, arg8, local56 + arg8 - 1, arg1, arg5, local186);
					local373 = local340;
					if (local340.method9027()) {
						local340.method9030(arg7);
					}
				} else {
					local373 = new Class20_Sub2_Sub2_Sub5(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg3, local53 + arg3 - 1, arg8, local56 + arg8 - 1, arg1, arg5, arg6);
				}
				Static152.method4562(local373, false);
				if (Static592.aBoolean676 && !super.aBoolean353 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg2 > 0 && local30.anInt9200 != 0) {
					super.aByteArrayArrayArray13[arg2][arg3][arg8] = (byte) (super.aByteArrayArrayArray13[arg2][arg3][arg8] | 0x4);
				}
				if (local30.anInt9233 != 0 && arg9 != null) {
					arg9.method7928(local30.aBoolean631, arg3, local53, arg8, local56, !local30.aBoolean628);
				}
			} else {
				@Pc(682) Class20_Sub2_Sub1 local682;
				if (arg1 == 0) {
					@Pc(646) int local646 = local30.anInt9200;
					if (Static472.aBoolean560 && local30.anInt9200 == -1) {
						local646 = 1;
					}
					if (local223) {
						@Pc(672) Class20_Sub2_Sub1_Sub2 local672 = new Class20_Sub2_Sub1_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg1, arg5, local186);
						if (local672.method9027()) {
							local672.method9030(arg7);
						}
						local682 = local672;
					} else {
						local682 = new Class20_Sub2_Sub1_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg1, arg5, arg6);
					}
					Static270.method4794(arg2, arg3, arg8, local682, (Class20_Sub2_Sub1) null);
					if (arg5 == 0) {
						if (Static592.aBoolean676 && local30.aBoolean630) {
							local131.ka(arg3, arg8, 50);
							local131.ka(arg3, arg8 + 1, 50);
						}
						if (local646 == 1 && !super.aBoolean353) {
							Static647.method8996(arg2, local30.anInt9247, arg8, 1, arg3, local30.anInt9193);
						}
					} else if (arg5 == 1) {
						if (Static592.aBoolean676 && local30.aBoolean630) {
							local131.ka(arg3, arg8 + 1, 50);
							local131.ka(arg3 + 1, arg8 + 1, 50);
						}
						if (local646 == 1 && !super.aBoolean353) {
							Static647.method8996(arg2, local30.anInt9247, arg8 + 1, 2, arg3, -local30.anInt9193);
						}
					} else if (arg5 == 2) {
						if (Static592.aBoolean676 && local30.aBoolean630) {
							local131.ka(arg3 + 1, arg8, 50);
							local131.ka(arg3 + 1, arg8 - -1, 50);
						}
						if (local646 == 1 && !super.aBoolean353) {
							Static647.method8996(arg2, local30.anInt9247, arg8, 1, arg3 + 1, -local30.anInt9193);
						}
					} else if (arg5 == 3) {
						if (Static592.aBoolean676 && local30.aBoolean630) {
							local131.ka(arg3, arg8, 50);
							local131.ka(arg3 + 1, arg8, 50);
						}
						if (local646 == 1 && !super.aBoolean353) {
							Static647.method8996(arg2, local30.anInt9247, arg8, 2, arg3, local30.anInt9193);
						}
					}
					if (local30.anInt9233 != 0 && arg9 != null) {
						arg9.method7944(arg3, arg1, !local30.aBoolean628, arg8, local30.aBoolean631, arg5);
					}
					if (local30.anInt9218 != 64) {
						Static477.method7161(arg2, arg3, arg8, local30.anInt9218);
					}
				} else {
					@Pc(945) Class20_Sub2_Sub1 local945;
					@Pc(935) Class20_Sub2_Sub1_Sub2 local935;
					if (arg1 == 1) {
						if (local223) {
							local935 = new Class20_Sub2_Sub1_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg1, arg5, local186);
							if (local935.method9027()) {
								local935.method9030(arg7);
							}
							local945 = local935;
						} else {
							local945 = new Class20_Sub2_Sub1_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg1, arg5, arg6);
						}
						Static270.method4794(arg2, arg3, arg8, local945, (Class20_Sub2_Sub1) null);
						if (local30.aBoolean630 && Static592.aBoolean676) {
							if (arg5 == 0) {
								local131.ka(arg3, arg8 + 1, 50);
							} else if (arg5 == 1) {
								local131.ka(arg3 + 1, arg8 + 1, 50);
							} else if (arg5 == 2) {
								local131.ka(arg3 + 1, arg8, 50);
							} else if (arg5 == 3) {
								local131.ka(arg3, arg8, 50);
							}
						}
						if (local30.anInt9233 != 0 && arg9 != null) {
							arg9.method7944(arg3, arg1, !local30.aBoolean628, arg8, local30.aBoolean631, arg5);
						}
					} else if (arg1 == 2) {
						local379 = arg5 + 1 & 0x3;
						if (local223) {
							@Pc(1078) Class20_Sub2_Sub1_Sub2 local1078 = new Class20_Sub2_Sub1_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg1, arg5 + 4, local186);
							@Pc(1094) Class20_Sub2_Sub1_Sub2 local1094 = new Class20_Sub2_Sub1_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg1, local379, local186);
							if (local1078.method9027()) {
								local1078.method9030(arg7);
							}
							local945 = local1078;
							if (local1094.method9027()) {
								local1094.method9030(arg7);
							}
							local682 = local1094;
						} else {
							local945 = new Class20_Sub2_Sub1_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg1, arg5 + 4, arg6);
							local682 = new Class20_Sub2_Sub1_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg1, local379, arg6);
						}
						Static270.method4794(arg2, arg3, arg8, local945, local682);
						if ((local30.anInt9200 == 1 || Static472.aBoolean560 && local30.anInt9200 == -1) && !super.aBoolean353) {
							if (arg5 == 0) {
								Static647.method8996(arg2, local30.anInt9247, arg8, 1, arg3, local30.anInt9193);
								Static647.method8996(arg2, local30.anInt9247, arg8 + 1, 2, arg3, local30.anInt9193);
							} else if (arg5 == 1) {
								Static647.method8996(arg2, local30.anInt9247, arg8, 1, arg3 + 1, local30.anInt9193);
								Static647.method8996(arg2, local30.anInt9247, arg8 + 1, 2, arg3, local30.anInt9193);
							} else if (arg5 == 2) {
								Static647.method8996(arg2, local30.anInt9247, arg8, 1, arg3 + 1, local30.anInt9193);
								Static647.method8996(arg2, local30.anInt9247, arg8, 2, arg3, local30.anInt9193);
							} else if (arg5 == 3) {
								Static647.method8996(arg2, local30.anInt9247, arg8, 1, arg3, local30.anInt9193);
								Static647.method8996(arg2, local30.anInt9247, arg8, 2, arg3, local30.anInt9193);
							}
						}
						if (local30.anInt9233 != 0 && arg9 != null) {
							arg9.method7944(arg3, arg1, !local30.aBoolean628, arg8, local30.aBoolean631, arg5);
						}
						if (local30.anInt9218 != 64) {
							Static477.method7161(arg2, arg3, arg8, local30.anInt9218);
						}
					} else if (arg1 == 3) {
						if (local223) {
							local935 = new Class20_Sub2_Sub1_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg1, arg5, local186);
							local945 = local935;
							if (local935.method9027()) {
								local935.method9030(arg7);
							}
						} else {
							local945 = new Class20_Sub2_Sub1_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg1, arg5, arg6);
						}
						Static270.method4794(arg2, arg3, arg8, local945, (Class20_Sub2_Sub1) null);
						if (local30.aBoolean630 && Static592.aBoolean676) {
							if (arg5 == 0) {
								local131.ka(arg3, arg8 + 1, 50);
							} else if (arg5 == 1) {
								local131.ka(arg3 + 1, arg8 - -1, 50);
							} else if (arg5 == 2) {
								local131.ka(arg3 + 1, arg8, 50);
							} else if (arg5 == 3) {
								local131.ka(arg3, arg8, 50);
							}
						}
						if (local30.anInt9233 != 0 && arg9 != null) {
							arg9.method7944(arg3, arg1, !local30.aBoolean628, arg8, local30.aBoolean631, arg5);
						}
					} else if (arg1 == 9) {
						if (local223) {
							local340 = new Class20_Sub2_Sub2_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg3, arg3, arg8, arg8, arg1, arg5, local186);
							local373 = local340;
							if (local340.method9027()) {
								local340.method9030(arg7);
							}
						} else {
							local373 = new Class20_Sub2_Sub2_Sub5(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg3, local53 + arg3 - 1, arg8, local56 + arg8 - 1, arg1, arg5, arg6);
						}
						Static152.method4562(local373, false);
						if (local30.anInt9200 == 1 && !super.aBoolean353) {
							@Pc(1532) byte local1532;
							if ((arg5 & 0x1) == 0) {
								local1532 = 8;
							} else {
								local1532 = 16;
							}
							Static647.method8996(arg2, local30.anInt9247, arg8, local1532, arg3, 0);
						}
						if (local30.anInt9233 != 0 && arg9 != null) {
							arg9.method7928(local30.aBoolean631, arg3, local53, arg8, local56, !local30.aBoolean628);
						}
						if (local30.anInt9218 != 64) {
							Static477.method7161(arg2, arg3, arg8, local30.anInt9218);
						}
					} else {
						@Pc(1604) Class20_Sub2_Sub3 local1604;
						if (arg1 == 4) {
							if (local223) {
								@Pc(1623) Class20_Sub2_Sub3_Sub2 local1623 = new Class20_Sub2_Sub3_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, 0, 0, arg1, arg5);
								local1604 = local1623;
								if (local1623.method9027()) {
									local1623.method9030(arg7);
								}
							} else {
								local1604 = new Class20_Sub2_Sub3_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, 0, 0, arg1, arg5, arg6);
							}
							Static617.method8628(arg2, arg3, arg8, local1604, (Class20_Sub2_Sub3) null);
						} else {
							@Pc(1645) int local1645;
							@Pc(1651) Interface12 local1651;
							@Pc(1690) Class20_Sub2_Sub3_Sub2 local1690;
							if (arg1 == 5) {
								local1645 = 65;
								local1651 = (Interface12) Static245.method5549(arg2, arg3, arg8);
								if (local1651 != null) {
									local1645 = Static283.aClass210_2.method5629(local1651.method9026()).anInt9218 + 1;
								}
								if (local223) {
									local1690 = new Class20_Sub2_Sub3_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, local1645 * Static582.anIntArray594[arg5], local1645 * Static28.anIntArray324[arg5], arg1, arg5);
									if (local1690.method9027()) {
										local1690.method9030(arg7);
									}
									local1604 = local1690;
								} else {
									local1604 = new Class20_Sub2_Sub3_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, Static582.anIntArray594[arg5] * local1645, local1645 * Static28.anIntArray324[arg5], arg1, arg5, arg6);
								}
								Static617.method8628(arg2, arg3, arg8, local1604, (Class20_Sub2_Sub3) null);
							} else if (arg1 == 6) {
								local1645 = 33;
								local1651 = (Interface12) Static245.method5549(arg2, arg3, arg8);
								if (local1651 != null) {
									local1645 = Static283.aClass210_2.method5629(local1651.method9026()).anInt9218 / 2 + 1;
								}
								if (local223) {
									local1690 = new Class20_Sub2_Sub3_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, local1645 * Static582.anIntArray594[arg5], local1645 * Static28.anIntArray324[arg5], arg1, arg5 + 4);
									local1604 = local1690;
									if (local1690.method9027()) {
										local1690.method9030(arg7);
									}
								} else {
									local1604 = new Class20_Sub2_Sub3_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, Static625.anIntArray629[arg5] * local1645, Static616.anIntArray650[arg5] * local1645, arg1, arg5 + 4, arg6);
								}
								Static617.method8628(arg2, arg3, arg8, local1604, (Class20_Sub2_Sub3) null);
							} else if (arg1 == 7) {
								local1645 = arg5 + 2 & 0x3;
								if (local223) {
									@Pc(1874) Class20_Sub2_Sub3_Sub2 local1874 = new Class20_Sub2_Sub3_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, 0, 0, arg1, local1645 + 4);
									local1604 = local1874;
									if (local1874.method9027()) {
										local1874.method9030(arg7);
									}
								} else {
									local1604 = new Class20_Sub2_Sub3_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, 0, 0, arg1, local1645 + 4, arg6);
								}
								Static617.method8628(arg2, arg3, arg8, local1604, (Class20_Sub2_Sub3) null);
							} else if (arg1 == 8) {
								local379 = arg5 + 2 & 0x3;
								local439 = 33;
								@Pc(1930) Interface12 local1930 = (Interface12) Static245.method5549(arg2, arg3, arg8);
								if (local1930 != null) {
									local439 = Static283.aClass210_2.method5629(local1930.method9026()).anInt9218 / 2 + 1;
								}
								@Pc(1974) Class20_Sub2_Sub3 local1974;
								@Pc(1994) Class20_Sub2_Sub3 local1994;
								if (local223) {
									local1974 = new Class20_Sub2_Sub3_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, Static625.anIntArray629[arg5] * local439, local439 * Static616.anIntArray650[arg5], arg1, arg5 + 4);
									local1994 = new Class20_Sub2_Sub3_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, 0, 0, arg1, local379 + 4);
									if (local1974.method9027()) {
										local1974.method9030(arg7);
									}
									if (local1994.method9027()) {
										local1994.method9030(arg7);
									}
								} else {
									local1974 = new Class20_Sub2_Sub3_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, Static625.anIntArray629[arg5] * local439, Static616.anIntArray650[arg5] * local439, arg1, arg5 + 4, arg6);
									local1994 = new Class20_Sub2_Sub3_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, 0, 0, arg1, local379 + 4, arg6);
								}
								Static617.method8628(arg2, arg3, arg8, local1974, local1994);
							}
						}
					}
				}
			}
		} else if (Static348.aClass6_Sub22_19.aClass15_Sub2_1.method484() != 0 || local30.anInt9207 != 0 || local30.anInt9233 == 1 || local30.aBoolean627) {
			@Pc(284) Class20_Sub2_Sub5 local284;
			if (local223) {
				@Pc(301) Class20_Sub2_Sub5_Sub2 local301 = new Class20_Sub2_Sub5_Sub2(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg5, local186);
				if (local301.method9027()) {
					local301.method9030(arg7);
				}
				local284 = local301;
			} else {
				local284 = new Class20_Sub2_Sub5_Sub1(arg7, local30, arg2, arg0, local165, local157, local174, super.aBoolean353, arg5, arg6);
			}
			Static633.method8865(arg2, arg3, arg8, local284);
			if (local30.anInt9233 == 1 && arg9 != null) {
				arg9.method7936(arg3, arg8);
			}
		}
	}

	@OriginalMember(owner = "client!jda", name = "a", descriptor = "(II[BIIIIZ[Lclient!tea;Lclient!ha;I)V")
	public void method4585(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class319[] arg7, @OriginalArg(9) Class100 arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class6_Sub40 local10 = new Class6_Sub40(arg2);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local10.method8597();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(40) int local40 = 0;
			while (true) {
				@Pc(44) int local44 = local10.method8587();
				if (local44 == 0) {
					break;
				}
				local40 += local44 - 1;
				@Pc(56) int local56 = local40 & 0x3F;
				@Pc(62) int local62 = local40 >> 6 & 0x3F;
				@Pc(66) int local66 = local40 >> 12;
				@Pc(70) int local70 = local10.method8604();
				@Pc(74) int local74 = local70 >> 2;
				@Pc(78) int local78 = local70 & 0x3;
				if (arg5 == local66 && local62 >= arg9 && local62 < arg9 + 8 && arg4 <= local56 && local56 < arg4 + 8) {
					@Pc(110) Class312 local110 = Static283.aClass210_2.method5629(local28);
					@Pc(127) int local127 = Static245.method5550(local78, local62 & 0x7, local110.anInt9244, arg6, local110.anInt9235, local56 & 0x7) + arg0;
					@Pc(144) int local144 = Static547.method7961(local110.anInt9235, arg6, local78, local110.anInt9244, local62 & 0x7, local56 & 0x7) + arg3;
					if (local127 > 0 && local144 > 0 && local127 < super.anInt5127 - 1 && super.anInt5126 - 1 > local144) {
						@Pc(165) Class319 local165 = null;
						if (!super.aBoolean353) {
							@Pc(170) int local170 = arg1;
							if ((Static197.aByteArrayArrayArray24[1][local127][local144] & 0x2) == 2) {
								local170 = arg1 - 1;
							}
							if (local170 >= 0) {
								local165 = arg7[local170];
							}
						}
						this.method4584(arg1, local74, arg1, local127, local28, local78 + arg6 & 0x3, -1, arg8, local144, local165);
					}
				}
			}
		}
	}
}
