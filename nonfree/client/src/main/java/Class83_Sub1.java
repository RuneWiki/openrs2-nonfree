import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tga")
public final class Class83_Sub1 extends Class83 {

	@OriginalMember(owner = "client!tga", name = "I", descriptor = "I")
	public int anInt9104 = 99;

	@OriginalMember(owner = "client!tga", name = "<init>", descriptor = "(IIIZ)V")
	public Class83_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static503.aClass32_5, Static371.aClass263_4);
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(B[BI[Lclient!nfa;Lclient!ha;I)V")
	public void method7810(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class237[] arg2, @OriginalArg(4) Class82 arg3, @OriginalArg(5) int arg4) {
		@Pc(18) Class3_Sub9 local18 = new Class3_Sub9(arg0);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method5587();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method5606();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local18.method5633();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				@Pc(78) int local78 = local57 + arg4;
				@Pc(82) int local82 = local51 + arg1;
				if (local78 > 0 && local82 > 0 && super.anInt9098 - 1 > local78 && super.anInt9096 - 1 > local82) {
					@Pc(110) Class237 local110 = null;
					if (!super.aBoolean675) {
						@Pc(115) int local115 = local61;
						if ((Static546.aByteArrayArrayArray18[1][local78][local82] & 0x2) == 2) {
							local115 = local61 - 1;
						}
						if (local115 >= 0) {
							local110 = arg2[local115];
						}
					}
					this.method7817(local61, local78, local61, local82, arg3, local73, local20, local110, local69, -1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(I[ILclient!ha;Lclient!dc;IB)V")
	public void method7811(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class82 arg2, @OriginalArg(3) Class3_Sub9 arg3, @OriginalArg(4) int arg4) {
		if (super.aBoolean675) {
			return;
		}
		@Pc(27) boolean local27 = false;
		@Pc(29) Class291 local29 = null;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					@Pc(40) int local40;
					@Pc(135) int local135;
					@Pc(506) int local506;
					@Pc(150) int local150;
					@Pc(154) int local154;
					while (arg3.anInt6453 < arg3.aByteArray51.length) {
						local40 = arg3.method5633();
						if (local40 == 0) {
							local29 = new Class291(arg3);
						} else {
							@Pc(156) int local156;
							@Pc(160) int local160;
							@Pc(427) int local427;
							if (local40 == 1) {
								local135 = arg3.method5633();
								if (local135 > 0) {
									for (local506 = 0; local506 < local135; local506++) {
										@Pc(515) Class339 local515 = new Class339(arg2, arg3, 2);
										if (local515.anInt9461 == 31) {
											@Pc(526) Class292 local526 = Static498.aClass362_1.method8372(arg3.method5610());
											local515.method8105(local526.anInt8344, local526.anInt8349, local526.anInt8352, local526.anInt8348);
										}
										if (arg2.method6131() > 0) {
											@Pc(546) Class3_Sub22 local546 = local515.aClass3_Sub22_3;
											local156 = (arg4 << 9) + local546.method8391();
											local160 = (arg0 << 9) + local546.method8386();
											local427 = local156 >> 9;
											@Pc(570) int local570 = local160 >> 9;
											if (local427 >= 0 && local570 >= 0 && local427 < super.anInt9098 && super.anInt9096 > local570) {
												local546.method8388(local156, super.anIntArrayArrayArray36[local515.anInt9470][local427][local570] - local546.method8383(), local160);
												Static644.method8651(local515);
											}
										}
									}
								}
							} else if (local40 == 2) {
								if (local29 == null) {
									local29 = new Class291();
								}
								local29.method7196(arg3);
							} else if (local40 != 128) {
								if (local40 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray13 == null) {
									super.aByteArrayArrayArray13 = new byte[4][][];
								}
								for (local135 = 0; local135 < 4; local135++) {
									@Pc(141) byte local141 = arg3.method5619();
									if (local141 == 0 && super.aByteArrayArrayArray13[local135] != null) {
										local150 = arg4;
										local154 = arg4 + 64;
										local156 = arg0;
										local160 = arg0 + 64;
										if (local154 < 0) {
											local154 = 0;
										} else if (super.anInt9098 <= local154) {
											local154 = super.anInt9098;
										}
										if (arg0 < 0) {
											local156 = 0;
										} else if (super.anInt9096 <= arg0) {
											local156 = super.anInt9096;
										}
										if (arg4 < 0) {
											local150 = 0;
										} else if (super.anInt9098 <= arg4) {
											local150 = super.anInt9098;
										}
										if (local160 < 0) {
											local160 = 0;
										} else if (super.anInt9096 <= local160) {
											local160 = super.anInt9096;
										}
										while (local150 < local154) {
											while (local156 < local160) {
												super.aByteArrayArrayArray13[local135][local150][local156] = 0;
												local156++;
											}
											local150++;
										}
									} else if (local141 == 1) {
										if (super.aByteArrayArrayArray13[local135] == null) {
											super.aByteArrayArrayArray13[local135] = new byte[super.anInt9098 + 1][super.anInt9096 + 1];
										}
										for (local150 = 0; local150 < 64; local150 += 4) {
											for (local154 = 0; local154 < 64; local154 += 4) {
												@Pc(416) byte local416 = arg3.method5619();
												for (local160 = local150 + arg4; local160 < arg4 + local150 + 4; local160++) {
													for (local427 = arg0 + local154; local427 < local154 + arg0 + 4; local427++) {
														if (local160 >= 0 && local160 < super.anInt9098 && local427 >= 0 && local427 < super.anInt9096) {
															super.aByteArrayArrayArray13[local135][local160][local427] = local416;
														}
													}
												}
											}
										}
									} else if (local141 == 2) {
										if (super.aByteArrayArrayArray13[local135] == null) {
											super.aByteArrayArrayArray13[local135] = new byte[super.anInt9098 + 1][super.anInt9096 + 1];
										}
										if (local135 > 0) {
											local150 = arg4;
											local154 = arg4 + 64;
											local156 = arg0;
											if (local154 < 0) {
												local154 = 0;
											} else if (super.anInt9098 <= local154) {
												local154 = super.anInt9098;
											}
											if (arg0 < 0) {
												local156 = 0;
											} else if (super.anInt9096 <= arg0) {
												local156 = super.anInt9096;
											}
											local160 = arg0 + 64;
											if (arg4 < 0) {
												local150 = 0;
											} else if (super.anInt9098 <= arg4) {
												local150 = super.anInt9098;
											}
											if (local160 < 0) {
												local160 = 0;
											} else if (local160 >= super.anInt9096) {
												local160 = super.anInt9096;
											}
											while (local150 < local154) {
												while (local160 > local156) {
													super.aByteArrayArrayArray13[local135][local150][local156] = super.aByteArrayArrayArray13[local135 - 1][local150][local156];
													local156++;
												}
												local150++;
											}
										}
									}
								}
								local27 = true;
							} else if (arg1 == null) {
								arg3.anInt6453 += 10;
							} else {
								arg1[0] = arg3.method5610();
								arg1[1] = arg3.method5624();
								arg1[2] = arg3.method5624();
								arg1[3] = arg3.method5624();
								arg1[4] = arg3.method5610();
							}
						}
					}
					if (local29 != null) {
						for (local40 = 0; local40 < 8; local40++) {
							for (local135 = 0; local135 < 8; local135++) {
								local506 = local40 + (arg4 >> 3);
								local150 = local135 + (arg0 >> 3);
								if (local506 >= 0 && super.anInt9098 >> 3 > local506 && local150 >= 0 && super.anInt9096 >> 3 > local150) {
									Static513.method7470(local150, local29, local506);
								}
							}
						}
					}
					if (!local27 && super.aByteArrayArrayArray13 != null) {
						for (local40 = 0; local40 < 4; local40++) {
							if (super.aByteArrayArrayArray13[local40] != null) {
								for (local135 = 0; local135 < 16; local135++) {
									for (local506 = 0; local506 < 16; local506++) {
										local150 = local135 + (arg4 >> 2);
										local154 = (arg0 >> 2) + local506;
										if (local150 >= 0 && local150 < 26 && local154 >= 0 && local154 < 26) {
											super.aByteArrayArrayArray13[local40][local150][local154] = 0;
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

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIII[Lclient!nfa;B[BLclient!ha;II)V")
	public void method7814(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class237[] arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) Class82 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class3_Sub9 local15 = new Class3_Sub9(arg6);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(23) int local23 = local15.method5587();
			if (local23 == 0) {
				return;
			}
			local17 += local23;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local15.method5606();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local15.method5633();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				if (local57 == arg0 && arg2 <= local53 && local53 < arg2 + 8 && local47 >= arg4 && local47 < arg4 + 8) {
					@Pc(111) Class330 local111 = Static370.aClass284_3.method6915(local17);
					@Pc(130) int local130 = Static312.method5230(local111.anInt9193, local69, local47 & 0x7, local111.anInt9221, arg3, local53 & 0x7) + arg1;
					@Pc(148) int local148 = arg8 + Static439.method7997(local69, local53 & 0x7, local47 & 0x7, arg3, local111.anInt9221, local111.anInt9193);
					if (local130 > 0 && local148 > 0 && local130 < super.anInt9098 - 1 && local148 < super.anInt9096 - 1) {
						@Pc(169) Class237 local169 = null;
						if (!super.aBoolean675) {
							@Pc(174) int local174 = arg9;
							if ((Static546.aByteArrayArrayArray18[1][local130][local148] & 0x2) == 2) {
								local174 = arg9 - 1;
							}
							if (local174 >= 0) {
								local169 = arg5[local174];
							}
						}
						this.method7817(arg9, local130, arg9, local148, arg7, arg3 + local69 & 0x3, local17, local169, local65, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(II[IILclient!dc;IILclient!ha;III)V")
	public void method7815(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) Class3_Sub9 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class82 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean675) {
			return;
		}
		@Pc(17) Class291 local17 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(29) int local29 = (arg8 & 0x7) * 8;
		@Pc(35) int local35 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(40) int local40;
			@Pc(56) int local56;
			@Pc(285) int local285;
			@Pc(63) int local63;
			while (arg3.aByteArray51.length > arg3.anInt6453) {
				local40 = arg3.method5633();
				if (local40 == 0) {
					local17 = new Class291(arg3);
				} else {
					@Pc(116) int local116;
					@Pc(158) int local158;
					@Pc(176) int local176;
					@Pc(110) int local110;
					if (local40 == 1) {
						local56 = arg3.method5633();
						if (local56 > 0) {
							for (local63 = 0; local63 < local56; local63++) {
								@Pc(72) Class339 local72 = new Class339(arg6, arg3, 2);
								if (local72.anInt9461 == 31) {
									@Pc(85) Class292 local85 = Static498.aClass362_1.method8372(arg3.method5610());
									local72.method8105(local85.anInt8344, local85.anInt8349, local85.anInt8352, local85.anInt8348);
								}
								if (arg6.method6131() > 0) {
									@Pc(104) Class3_Sub22 local104 = local72.aClass3_Sub22_3;
									local110 = local104.method8391() >> 9;
									local116 = local104.method8386() >> 9;
									if (arg9 == local72.anInt9470 && local110 >= local29 && local29 + 8 > local110 && local116 >= local35 && local35 + 8 > local116) {
										local158 = Static565.method6917(arg4, local104.method8391() & 0xFFF, local104.method8386() & 0xFFF) + (arg5 << 9);
										local176 = (arg0 << 9) + Static409.method6362(local104.method8386() & 0xFFF, local104.method8391() & 0xFFF, arg4);
										local110 = local158 >> 9;
										local116 = local176 >> 9;
										if (local110 >= 0 && local116 >= 0 && local110 < super.anInt9098 && local116 < super.anInt9096) {
											local104.method8388(local158, super.anIntArrayArrayArray36[arg9][local110][local116] - local104.method8383(), local176);
											Static644.method8651(local72);
										}
									}
								}
							}
						}
					} else if (local40 == 2) {
						if (local17 == null) {
							local17 = new Class291();
						}
						local17.method7196(arg3);
					} else if (local40 != 128) {
						if (local40 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray13 == null) {
							super.aByteArrayArrayArray13 = new byte[4][][];
						}
						for (local56 = 0; local56 < 4; local56++) {
							@Pc(270) byte local270 = arg3.method5619();
							@Pc(289) int local289;
							if (local270 == 0 && super.aByteArrayArrayArray13[arg1] != null) {
								if (local56 <= arg9) {
									local285 = arg5;
									local289 = arg5 + 7;
									local110 = arg0;
									local116 = arg0 + 7;
									if (arg0 < 0) {
										local110 = 0;
									} else if (arg0 >= super.anInt9096) {
										local110 = super.anInt9096;
									}
									if (arg5 < 0) {
										local285 = 0;
									} else if (arg5 >= super.anInt9098) {
										local285 = super.anInt9098;
									}
									if (local289 < 0) {
										local289 = 0;
									} else if (super.anInt9098 <= local289) {
										local289 = super.anInt9098;
									}
									if (local116 < 0) {
										local116 = 0;
									} else if (super.anInt9096 <= local116) {
										local116 = super.anInt9096;
									}
									while (local289 > local285) {
										while (local116 > local110) {
											super.aByteArrayArrayArray13[arg1][local285][local110] = 0;
											local110++;
										}
										local285++;
									}
								}
							} else if (local270 == 1) {
								if (super.aByteArrayArrayArray13[arg1] == null) {
									super.aByteArrayArrayArray13[arg1] = new byte[super.anInt9098 + 1][super.anInt9096 + 1];
								}
								for (local285 = 0; local285 < 64; local285 += 4) {
									for (local289 = 0; local289 < 64; local289 += 4) {
										@Pc(427) byte local427 = arg3.method5619();
										if (arg9 >= local56) {
											for (local116 = local285; local116 < local285 + 4; local116++) {
												for (local158 = local289; local158 < local289 + 4; local158++) {
													if (local29 <= local116 && local116 < local29 + 8 && local158 >= local35 && local35 + 8 > local35) {
														local176 = Static267.method4470(local158 & 0x7, arg4, local116 & 0x7) + arg5;
														@Pc(482) int local482 = arg0 + Static267.method4467(arg4, local116 & 0x7, local158 & 0x7);
														if (local176 >= 0 && local176 < super.anInt9098 && local482 >= 0 && local482 < super.anInt9096) {
															super.aByteArrayArrayArray13[arg1][local176][local482] = local427;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg2 == null) {
						arg3.anInt6453 += 10;
					} else {
						arg2[0] = arg3.method5610();
						arg2[1] = arg3.method5624();
						arg2[2] = arg3.method5624();
						arg2[3] = arg3.method5624();
						arg2[4] = arg3.method5610();
					}
				}
			}
			if (local17 != null) {
				Static513.method7470(arg0 >> 3, local17, arg5 >> 3);
			}
			if (super.aByteArrayArrayArray13 != null && super.aByteArrayArrayArray13[arg1] != null) {
				local40 = arg5 + 7;
				local56 = arg0 + 7;
				for (local63 = arg5; local63 < local40; local63++) {
					for (local285 = arg0; local285 < local56; local285++) {
						super.aByteArrayArrayArray13[arg1][local63][local285] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tga", name = "b", descriptor = "(IIIII)Lclient!bda;")
	public Interface2 method7816(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface2 local5 = null;
		if (arg3 == 0) {
			local5 = (Interface2) Static380.method5991(arg0, arg1, arg2);
		}
		if (arg3 == 1) {
			local5 = (Interface2) Static483.method7129(arg0, arg1, arg2);
		}
		if (arg3 == 2) {
			local5 = (Interface2) Static137.method2371(arg0, arg1, arg2, bda.class);
		}
		if (arg3 == 3) {
			local5 = (Interface2) Static279.method4563(arg0, arg1, arg2);
		}
		return local5;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIIILclient!ha;IILclient!nfa;IBI)V")
	public void method7817(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class82 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class237 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (Static32.aClass3_Sub41_3.aClass7_Sub13_2.method5385() == 0 && !Static168.method2814(arg3, arg2, Static282.anInt5422, arg1)) {
			return;
		}
		if (arg0 < this.anInt9104) {
			this.anInt9104 = arg0;
		}
		@Pc(34) Class330 local34 = Static370.aClass284_3.method6915(arg6);
		if (Static32.aClass3_Sub41_3.aClass7_Sub28_1.method8245() == 0 && local34.aBoolean689) {
			return;
		}
		@Pc(56) int local56;
		@Pc(59) int local59;
		if (arg5 == 1 || arg5 == 3) {
			local59 = local34.anInt9221;
			local56 = local34.anInt9193;
		} else {
			local56 = local34.anInt9221;
			local59 = local34.anInt9193;
		}
		@Pc(84) int local84;
		@Pc(82) int local82;
		if (arg1 + local56 > super.anInt9098) {
			local82 = arg1 + 1;
			local84 = arg1;
		} else {
			local84 = arg1 + (local56 >> 1);
			local82 = (local56 + 1 >> 1) + arg1;
		}
		@Pc(112) int local112;
		@Pc(120) int local120;
		if (local59 + arg3 <= super.anInt9096) {
			local112 = (local59 >> 1) + arg3;
			local120 = arg3 + (local59 + 1 >> 1);
		} else {
			local112 = arg3;
			local120 = arg3 + 1;
		}
		@Pc(132) Class91 local132 = Static637.aClass91Array4[arg2];
		@Pc(160) int local160 = local132.method7724(local112, local84) + local132.method7724(local112, local82) + local132.method7724(local120, local84) + local132.method7724(local120, local82) >> 2;
		@Pc(168) int local168 = (local56 << 8) + (arg1 << 9);
		@Pc(176) int local176 = (local59 << 8) + (arg3 << 9);
		@Pc(188) boolean local188 = Static634.aBoolean765 && !super.aBoolean675 && local34.aBoolean693;
		if (local34.method7894()) {
			Static280.method4567((Class9_Sub2_Sub1_Sub2_Sub1) null, arg5, (Class9_Sub2_Sub1_Sub2_Sub2) null, arg1, arg0, local34, arg3);
		}
		@Pc(224) boolean local224 = arg9 == -1 && local34.anInt9222 == -1 && local34.anIntArray580 == null && local34.anIntArray581 == null && !local34.aBoolean690 && !local34.aBoolean691;
		if (Static19.aBoolean16 && (Static151.method2597(arg8) && local34.anInt9226 != 1 || !(!Static496.method779(arg8) || local34.anInt9226 != 0))) {
			return;
		}
		if (arg8 != 22) {
			@Pc(372) Class9_Sub2_Sub1 local372;
			@Pc(340) Class9_Sub2_Sub1_Sub3 local340;
			@Pc(344) int local344;
			@Pc(439) int local439;
			if (arg8 == 10 || arg8 == 11) {
				local340 = null;
				if (local224) {
					@Pc(403) Class9_Sub2_Sub1_Sub3 local403 = new Class9_Sub2_Sub1_Sub3(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg1, arg1 + local56 - 1, arg3, local59 + arg3 - 1, arg8, arg5, local188);
					local372 = local403;
					local340 = local403;
					local344 = local403.method3026();
				} else {
					local344 = 15;
					local372 = new Class9_Sub2_Sub1_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg1, arg1 + local56 - 1, arg3, arg3 + local59 - 1, arg8, arg5, arg9);
				}
				if (Static627.method8508(local372, false)) {
					if (local340 != null && local340.method7499()) {
						local340.method7501(arg4);
					}
					if (local34.lb && Static634.aBoolean765) {
						if (local344 > 30) {
							local344 = 30;
						}
						for (local439 = 0; local439 <= local56; local439++) {
							for (@Pc(443) int local443 = 0; local443 <= local59; local443++) {
								local132.ka(local439 + arg1, arg3 + local443, local344);
							}
						}
					}
				}
				if (local34.anInt9191 != 0 && arg7 != null) {
					arg7.method5914(local34.aBoolean680, !local34.aBoolean684, local56, arg1, local59, arg3);
				}
			} else if (arg8 >= 12 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
				if (local224) {
					local340 = new Class9_Sub2_Sub1_Sub3(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg1, arg1 + local56 - 1, arg3, local59 + arg3 - 1, arg8, arg5, local188);
					local372 = local340;
					if (local340.method7499()) {
						local340.method7501(arg4);
					}
				} else {
					local372 = new Class9_Sub2_Sub1_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg1, local56 + arg1 - 1, arg3, arg3 + local59 - 1, arg8, arg5, arg9);
				}
				Static627.method8508(local372, false);
				if (Static634.aBoolean765 && !super.aBoolean675 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg0 > 0 && local34.anInt9226 != 0) {
					super.aByteArrayArrayArray14[arg0][arg1][arg3] = (byte) (super.aByteArrayArrayArray14[arg0][arg1][arg3] | 0x4);
				}
				if (local34.anInt9191 != 0 && arg7 != null) {
					arg7.method5914(local34.aBoolean680, !local34.aBoolean684, local56, arg1, local59, arg3);
				}
			} else {
				@Pc(691) Class9_Sub2_Sub3 local691;
				if (arg8 == 0) {
					@Pc(654) int local654 = local34.anInt9226;
					if (Static365.aBoolean484 && local34.anInt9226 == -1) {
						local654 = 1;
					}
					if (local224) {
						@Pc(681) Class9_Sub2_Sub3_Sub1 local681 = new Class9_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg8, arg5, local188);
						if (local681.method7499()) {
							local681.method7501(arg4);
						}
						local691 = local681;
					} else {
						local691 = new Class9_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg8, arg5, arg9);
					}
					Static53.method972(arg0, arg1, arg3, local691, (Class9_Sub2_Sub3) null);
					if (arg5 == 0) {
						if (Static634.aBoolean765 && local34.lb) {
							local132.ka(arg1, arg3, 50);
							local132.ka(arg1, arg3 + 1, 50);
						}
						if (local654 == 1 && !super.aBoolean675) {
							Static226.method3936(arg3, 1, local34.anInt9200, arg0, local34.anInt9192, arg1);
						}
					} else if (arg5 == 1) {
						if (Static634.aBoolean765 && local34.lb) {
							local132.ka(arg1, arg3 + 1, 50);
							local132.ka(arg1 + 1, arg3 - -1, 50);
						}
						if (local654 == 1 && !super.aBoolean675) {
							Static226.method3936(arg3 + 1, 2, local34.anInt9200, arg0, -local34.anInt9192, arg1);
						}
					} else if (arg5 == 2) {
						if (Static634.aBoolean765 && local34.lb) {
							local132.ka(arg1 + 1, arg3, 50);
							local132.ka(arg1 + 1, arg3 + 1, 50);
						}
						if (local654 == 1 && !super.aBoolean675) {
							Static226.method3936(arg3, 1, local34.anInt9200, arg0, -local34.anInt9192, arg1 + 1);
						}
					} else if (arg5 == 3) {
						if (Static634.aBoolean765 && local34.lb) {
							local132.ka(arg1, arg3, 50);
							local132.ka(arg1 + 1, arg3, 50);
						}
						if (local654 == 1 && !super.aBoolean675) {
							Static226.method3936(arg3, 2, local34.anInt9200, arg0, local34.anInt9192, arg1);
						}
					}
					if (local34.anInt9191 != 0 && arg7 != null) {
						arg7.method5906(arg5, local34.aBoolean680, arg3, arg8, arg1, !local34.aBoolean684);
					}
					if (local34.anInt9218 != 64) {
						Static208.method3264(arg0, arg1, arg3, local34.anInt9218);
					}
				} else {
					@Pc(942) Class9_Sub2_Sub3 local942;
					@Pc(960) Class9_Sub2_Sub3_Sub1 local960;
					if (arg8 == 1) {
						if (local224) {
							local960 = new Class9_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg8, arg5, local188);
							if (local960.method7499()) {
								local960.method7501(arg4);
							}
							local942 = local960;
						} else {
							local942 = new Class9_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg8, arg5, arg9);
						}
						Static53.method972(arg0, arg1, arg3, local942, (Class9_Sub2_Sub3) null);
						if (local34.lb && Static634.aBoolean765) {
							if (arg5 == 0) {
								local132.ka(arg1, arg3 + 1, 50);
							} else if (arg5 == 1) {
								local132.ka(arg1 + 1, arg3 + 1, 50);
							} else if (arg5 == 2) {
								local132.ka(arg1 + 1, arg3, 50);
							} else if (arg5 == 3) {
								local132.ka(arg1, arg3, 50);
							}
						}
						if (local34.anInt9191 != 0 && arg7 != null) {
							arg7.method5906(arg5, local34.aBoolean680, arg3, arg8, arg1, !local34.aBoolean684);
						}
					} else if (arg8 == 2) {
						local344 = arg5 + 1 & 0x3;
						if (local224) {
							@Pc(1116) Class9_Sub2_Sub3_Sub1 local1116 = new Class9_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg8, arg5 + 4, local188);
							@Pc(1132) Class9_Sub2_Sub3_Sub1 local1132 = new Class9_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg8, local344, local188);
							if (local1116.method7499()) {
								local1116.method7501(arg4);
							}
							if (local1132.method7499()) {
								local1132.method7501(arg4);
							}
							local942 = local1116;
							local691 = local1132;
						} else {
							local942 = new Class9_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg8, arg5 + 4, arg9);
							local691 = new Class9_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg8, local344, arg9);
						}
						Static53.method972(arg0, arg1, arg3, local942, local691);
						if ((local34.anInt9226 == 1 || Static365.aBoolean484 && local34.anInt9226 == -1) && !super.aBoolean675) {
							if (arg5 == 0) {
								Static226.method3936(arg3, 1, local34.anInt9200, arg0, local34.anInt9192, arg1);
								Static226.method3936(arg3 + 1, 2, local34.anInt9200, arg0, local34.anInt9192, arg1);
							} else if (arg5 == 1) {
								Static226.method3936(arg3, 1, local34.anInt9200, arg0, local34.anInt9192, arg1 + 1);
								Static226.method3936(arg3 + 1, 2, local34.anInt9200, arg0, local34.anInt9192, arg1);
							} else if (arg5 == 2) {
								Static226.method3936(arg3, 1, local34.anInt9200, arg0, local34.anInt9192, arg1 + 1);
								Static226.method3936(arg3, 2, local34.anInt9200, arg0, local34.anInt9192, arg1);
							} else if (arg5 == 3) {
								Static226.method3936(arg3, 1, local34.anInt9200, arg0, local34.anInt9192, arg1);
								Static226.method3936(arg3, 2, local34.anInt9200, arg0, local34.anInt9192, arg1);
							}
						}
						if (local34.anInt9191 != 0 && arg7 != null) {
							arg7.method5906(arg5, local34.aBoolean680, arg3, arg8, arg1, !local34.aBoolean684);
						}
						if (local34.anInt9218 != 64) {
							Static208.method3264(arg0, arg1, arg3, local34.anInt9218);
						}
					} else if (arg8 == 3) {
						if (local224) {
							local960 = new Class9_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg8, arg5, local188);
							if (local960.method7499()) {
								local960.method7501(arg4);
							}
							local942 = local960;
						} else {
							local942 = new Class9_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg8, arg5, arg9);
						}
						Static53.method972(arg0, arg1, arg3, local942, (Class9_Sub2_Sub3) null);
						if (local34.lb && Static634.aBoolean765) {
							if (arg5 == 0) {
								local132.ka(arg1, arg3 + 1, 50);
							} else if (arg5 == 1) {
								local132.ka(arg1 + 1, arg3 + 1, 50);
							} else if (arg5 == 2) {
								local132.ka(arg1 + 1, arg3, 50);
							} else if (arg5 == 3) {
								local132.ka(arg1, arg3, 50);
							}
						}
						if (local34.anInt9191 != 0 && arg7 != null) {
							arg7.method5906(arg5, local34.aBoolean680, arg3, arg8, arg1, !local34.aBoolean684);
						}
					} else if (arg8 == 9) {
						if (local224) {
							local340 = new Class9_Sub2_Sub1_Sub3(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg1, arg1, arg3, arg3, arg8, arg5, local188);
							local372 = local340;
							if (local340.method7499()) {
								local340.method7501(arg4);
							}
						} else {
							local372 = new Class9_Sub2_Sub1_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg1, local56 + arg1 - 1, arg3, local59 + arg3 - 1, arg8, arg5, arg9);
						}
						Static627.method8508(local372, false);
						if (local34.anInt9226 == 1 && !super.aBoolean675) {
							@Pc(1534) byte local1534;
							if ((arg5 & 0x1) == 0) {
								local1534 = 8;
							} else {
								local1534 = 16;
							}
							Static226.method3936(arg3, local1534, local34.anInt9200, arg0, 0, arg1);
						}
						if (local34.anInt9191 != 0 && arg7 != null) {
							arg7.method5914(local34.aBoolean680, !local34.aBoolean684, local56, arg1, local59, arg3);
						}
						if (local34.anInt9218 != 64) {
							Static208.method3264(arg0, arg1, arg3, local34.anInt9218);
						}
					} else {
						@Pc(1623) Class9_Sub2_Sub5 local1623;
						if (arg8 == 4) {
							if (local224) {
								@Pc(1611) Class9_Sub2_Sub5_Sub2 local1611 = new Class9_Sub2_Sub5_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, 0, 0, arg8, arg5);
								if (local1611.method7499()) {
									local1611.method7501(arg4);
								}
								local1623 = local1611;
							} else {
								local1623 = new Class9_Sub2_Sub5_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, 0, 0, arg8, arg5, arg9);
							}
							Static90.method7199(arg0, arg1, arg3, local1623, (Class9_Sub2_Sub5) null);
						} else {
							@Pc(1655) int local1655;
							@Pc(1661) Interface2 local1661;
							@Pc(1700) Class9_Sub2_Sub5_Sub2 local1700;
							if (arg8 == 5) {
								local1655 = 65;
								local1661 = (Interface2) Static380.method5991(arg0, arg1, arg3);
								if (local1661 != null) {
									local1655 = Static370.aClass284_3.method6915(local1661.method7500()).anInt9218 + 1;
								}
								if (local224) {
									local1700 = new Class9_Sub2_Sub5_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, local1655 * Static203.anIntArray219[arg5], Static66.anIntArray97[arg5] * local1655, arg8, arg5);
									if (local1700.method7499()) {
										local1700.method7501(arg4);
									}
									local1623 = local1700;
								} else {
									local1623 = new Class9_Sub2_Sub5_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, local1655 * Static203.anIntArray219[arg5], local1655 * Static66.anIntArray97[arg5], arg8, arg5, arg9);
								}
								Static90.method7199(arg0, arg1, arg3, local1623, (Class9_Sub2_Sub5) null);
							} else if (arg8 == 6) {
								local1655 = 33;
								local1661 = (Interface2) Static380.method5991(arg0, arg1, arg3);
								if (local1661 != null) {
									local1655 = Static370.aClass284_3.method6915(local1661.method7500()).anInt9218 / 2 + 1;
								}
								if (local224) {
									local1700 = new Class9_Sub2_Sub5_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, local1655 * Static203.anIntArray219[arg5], Static66.anIntArray97[arg5] * local1655, arg8, arg5 + 4);
									local1623 = local1700;
									if (local1700.method7499()) {
										local1700.method7501(arg4);
									}
								} else {
									local1623 = new Class9_Sub2_Sub5_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, Static3.anIntArray1[arg5] * local1655, local1655 * Static218.anIntArray245[arg5], arg8, arg5 + 4, arg9);
								}
								Static90.method7199(arg0, arg1, arg3, local1623, (Class9_Sub2_Sub5) null);
							} else if (arg8 == 7) {
								local1655 = arg5 + 2 & 0x3;
								if (local224) {
									@Pc(1882) Class9_Sub2_Sub5_Sub2 local1882 = new Class9_Sub2_Sub5_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, 0, 0, arg8, local1655 + 4);
									if (local1882.method7499()) {
										local1882.method7501(arg4);
									}
									local1623 = local1882;
								} else {
									local1623 = new Class9_Sub2_Sub5_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, 0, 0, arg8, local1655 + 4, arg9);
								}
								Static90.method7199(arg0, arg1, arg3, local1623, (Class9_Sub2_Sub5) null);
							} else if (arg8 == 8) {
								local344 = arg5 + 2 & 0x3;
								local439 = 33;
								@Pc(1945) Interface2 local1945 = (Interface2) Static380.method5991(arg0, arg1, arg3);
								if (local1945 != null) {
									local439 = Static370.aClass284_3.method6915(local1945.method7500()).anInt9218 / 2 + 1;
								}
								@Pc(1988) Class9_Sub2_Sub5 local1988;
								@Pc(2007) Class9_Sub2_Sub5 local2007;
								if (local224) {
									local1988 = new Class9_Sub2_Sub5_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, local439 * Static3.anIntArray1[arg5], local439 * Static218.anIntArray245[arg5], arg8, arg5 + 4);
									local2007 = new Class9_Sub2_Sub5_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, 0, 0, arg8, local344 + 4);
									if (local1988.method7499()) {
										local1988.method7501(arg4);
									}
									if (local2007.method7499()) {
										local2007.method7501(arg4);
									}
								} else {
									local1988 = new Class9_Sub2_Sub5_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, local439 * Static3.anIntArray1[arg5], Static218.anIntArray245[arg5] * local439, arg8, arg5 + 4, arg9);
									local2007 = new Class9_Sub2_Sub5_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, 0, 0, arg8, local344 + 4, arg9);
								}
								Static90.method7199(arg0, arg1, arg3, local1988, local2007);
							}
						}
					}
				}
			}
		} else if (Static32.aClass3_Sub41_3.aClass7_Sub29_1.method8579() != 0 || local34.anInt9228 != 0 || local34.anInt9191 == 1 || local34.aBoolean686) {
			@Pc(286) Class9_Sub2_Sub4 local286;
			if (local224) {
				@Pc(303) Class9_Sub2_Sub4_Sub2 local303 = new Class9_Sub2_Sub4_Sub2(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg5, local188);
				local286 = local303;
				if (local303.method7499()) {
					local303.method7501(arg4);
				}
			} else {
				local286 = new Class9_Sub2_Sub4_Sub1(arg4, local34, arg0, arg2, local168, local160, local176, super.aBoolean675, arg5, arg9);
			}
			Static147.method2554(arg0, arg1, arg3, local286);
			if (local34.anInt9191 == 1 && arg7 != null) {
				arg7.method5899(arg1, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(ZLclient!ha;I)V")
	public void method7820(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class82 arg1) {
		Static187.method3050();
		if (!arg0) {
			@Pc(18) int local18;
			@Pc(22) int local22;
			if (super.anInt9095 > 1) {
				for (local18 = 0; super.anInt9098 > local18; local18++) {
					for (local22 = 0; super.anInt9096 > local22; local22++) {
						if ((Static546.aByteArrayArrayArray18[1][local18][local22] & 0x2) == 2) {
							Static397.method6265(local18, local22);
						}
					}
				}
			}
			for (local18 = 0; local18 < super.anInt9095; local18++) {
				for (local22 = 0; super.anInt9096 >= local22; local22++) {
					for (@Pc(60) int local60 = 0; super.anInt9098 >= local60; local60++) {
						if ((super.aByteArrayArrayArray14[local18][local60][local22] & 0x4) != 0) {
							@Pc(78) int local78 = local60;
							@Pc(80) int local80 = local60;
							@Pc(82) int local82 = local22;
							@Pc(84) int local84 = local22;
							while (local82 > 0 && (super.aByteArrayArrayArray14[local18][local60][local82 - 1] & 0x4) != 0 && local22 - local82 < 10) {
								local82--;
							}
							while (super.anInt9096 > local84 && (super.aByteArrayArrayArray14[local18][local60][local84 + 1] & 0x4) != 0 && local84 - local82 < 10) {
								local84++;
							}
							@Pc(144) int local144;
							label111: while (local78 > 0 && local60 - local78 < 10) {
								for (local144 = local82; local144 <= local84; local144++) {
									if ((super.aByteArrayArrayArray14[local18][local78 - 1][local144] & 0x4) == 0) {
										break label111;
									}
								}
								local78--;
							}
							label98: while (super.anInt9098 > local80 && local80 - local78 < 10) {
								for (local144 = local82; local144 <= local84; local144++) {
									if ((super.aByteArrayArrayArray14[local18][local80 + 1][local144] & 0x4) == 0) {
										break label98;
									}
								}
								local80++;
							}
							if ((local80 + 1 - local78) * (local84 + 1 - local82) >= 4) {
								local144 = super.anIntArrayArrayArray36[local18][local78][local82];
								Static88.method1485(local18, (local84 << 9) + 512, (local80 << 9) + 512, local82 << 9, local144, local78 << 9, local144);
								for (@Pc(275) int local275 = local78; local275 <= local80; local275++) {
									for (@Pc(279) int local279 = local82; local279 <= local84; local279++) {
										super.aByteArrayArrayArray14[local18][local275][local279] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static187.method3048();
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!tga", name = "a", descriptor = "(IIILclient!ha;Lclient!nfa;II)V")
	public void method7821(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class82 arg3, @OriginalArg(4) Class237 arg4, @OriginalArg(6) int arg5) {
		@Pc(23) Interface2 local23 = this.method7816(arg1, arg0, arg5, arg2);
		if (local23 == null) {
			return;
		}
		@Pc(32) Class330 local32 = Static370.aClass284_3.method6915(local23.method7500());
		@Pc(36) int local36 = local23.method7495();
		@Pc(40) int local40 = local23.method7496();
		if (local32.method7894()) {
			Static446.method6668(arg0, arg5, arg1, local32);
		}
		if (local23.method7499()) {
			local23.method7498(arg3);
		}
		if (arg2 == 0) {
			Static329.method5389(arg1, arg0, arg5);
			if (local32.anInt9191 != 0) {
				arg4.method5913(local40, local32.aBoolean680, !local32.aBoolean684, arg0, arg5, local36);
			}
			if (local32.anInt9226 == 1) {
				if (local40 == 0) {
					Static544.method7829(arg5, arg1, arg0, 1);
					return;
				}
				if (local40 == 1) {
					Static544.method7829(arg5 + 1, arg1, arg0, 2);
					return;
				}
				if (local40 == 2) {
					Static544.method7829(arg5, arg1, arg0 + 1, 1);
					return;
				}
				if (local40 == 3) {
					Static544.method7829(arg5, arg1, arg0, 2);
					return;
				}
			}
		} else if (arg2 == 1) {
			Static394.method6217(arg1, arg0, arg5);
		} else if (arg2 == 2) {
			Static12.method216(arg1, arg0, arg5, bda.class);
			if (local32.anInt9191 != 0 && arg0 + local32.anInt9221 < super.anInt9098 && super.anInt9096 > local32.anInt9221 + arg5 && local32.anInt9193 + arg0 < super.anInt9098 && arg5 + local32.anInt9193 < super.anInt9096) {
				arg4.method5901(local40, local32.aBoolean680, arg5, !local32.aBoolean684, local32.anInt9221, arg0, local32.anInt9193);
			}
			if (local36 == 9) {
				if ((local40 & 0x1) == 0) {
					Static544.method7829(arg5, arg1, arg0, 8);
					return;
				}
				Static544.method7829(arg5, arg1, arg0, 16);
				return;
			}
		} else {
			if (arg2 == 3) {
				Static408.method6348(arg1, arg0, arg5);
				if (local32.anInt9191 == 1) {
					arg4.method5905(arg5, arg0);
					return;
				}
			}
			return;
		}
	}
}
