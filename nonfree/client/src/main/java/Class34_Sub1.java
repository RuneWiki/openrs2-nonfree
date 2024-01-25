import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bg", name = "K", descriptor = "I")
	public int anInt577 = 99;

	@OriginalMember(owner = "client!bg", name = "<init>", descriptor = "(IIIZ)V")
	public Class34_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static404.aClass3_6, Static247.aClass269_3);
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(III[Lclient!mja;[BLclient!ha;)V")
	public void method536(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class234[] arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class143 arg4) {
		@Pc(15) Class5_Sub15 local15 = new Class5_Sub15(arg3);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method3663();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method3690();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local15.method3642();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = arg1 + local54;
				@Pc(79) int local79 = local48 + arg0;
				if (local74 > 0 && local79 > 0 && local74 < super.anInt563 - 1 && super.anInt567 - 1 > local79) {
					@Pc(107) Class234 local107 = null;
					if (!super.aBoolean26) {
						@Pc(112) int local112 = local58;
						if ((Static317.aByteArrayArrayArray13[1][local74][local79] & 0x2) == 2) {
							local112 = local58 - 1;
						}
						if (local112 >= 0) {
							local107 = arg2[local112];
						}
					}
					this.method543(local79, local66, local70, local58, local107, local58, -1, local17, arg4, local74);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "([BIIIIIII[Lclient!mja;ILclient!ha;)V")
	public void method537(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class234[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class143 arg9) {
		@Pc(10) Class5_Sub15 local10 = new Class5_Sub15(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method3663();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method3690();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(40) int local40 = local24 & 0x3F;
				@Pc(46) int local46 = local24 >> 6 & 0x3F;
				@Pc(50) int local50 = local24 >> 12;
				@Pc(54) int local54 = local10.method3642();
				@Pc(58) int local58 = local54 >> 2;
				@Pc(62) int local62 = local54 & 0x3;
				if (local50 == arg3 && arg4 <= local46 && local46 < arg4 + 8 && arg5 <= local40 && arg5 + 8 > local40) {
					@Pc(104) Class81 local104 = Static400.aClass140_4.method2839(local12);
					@Pc(123) int local123 = Static148.method2216(local104.anInt1897, local40 & 0x7, local62, local46 & 0x7, arg1, local104.anInt1910) + arg8;
					@Pc(141) int local141 = arg2 + Static493.method7180(arg1, local62, local104.anInt1897, local40 & 0x7, local104.anInt1910, local46 & 0x7);
					if (local123 > 0 && local141 > 0 && super.anInt563 - 1 > local123 && super.anInt567 - 1 > local141) {
						@Pc(166) Class234 local166 = null;
						if (!super.aBoolean26) {
							@Pc(171) int local171 = arg6;
							if ((Static317.aByteArrayArrayArray13[1][local123][local141] & 0x2) == 2) {
								local171 = arg6 - 1;
							}
							if (local171 >= 0) {
								local166 = arg7[local171];
							}
						}
						this.method543(local141, local58, arg1 + local62 & 0x3, arg6, local166, arg6, -1, local12, arg9, local123);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIII)Lclient!ija;")
	public Interface10 method538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Interface10 local10 = null;
		if (arg1 == 0) {
			local10 = (Interface10) Static322.method5015(arg0, arg2, arg3);
		}
		if (arg1 == 1) {
			local10 = (Interface10) Static295.method4024(arg0, arg2, arg3);
		}
		if (arg1 == 2) {
			local10 = (Interface10) Static156.method2369(arg0, arg2, arg3, ija.class);
		}
		if (arg1 == 3) {
			local10 = (Interface10) Static198.method2808(arg0, arg2, arg3);
		}
		return local10;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ZLclient!ha;I)V")
	public void method539(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class143 arg1) {
		Static609.method8193();
		if (!arg0) {
			@Pc(20) int local20;
			@Pc(24) int local24;
			if (super.anInt566 > 1) {
				for (local20 = 0; super.anInt563 > local20; local20++) {
					for (local24 = 0; local24 < super.anInt567; local24++) {
						if ((Static317.aByteArrayArrayArray13[1][local20][local24] & 0x2) == 2) {
							Static409.method5975(local20, local24);
						}
					}
				}
			}
			for (local20 = 0; local20 < super.anInt566; local20++) {
				for (local24 = 0; super.anInt567 >= local24; local24++) {
					for (@Pc(62) int local62 = 0; super.anInt563 >= local62; local62++) {
						if ((super.aByteArrayArrayArray8[local20][local62][local24] & 0x4) != 0) {
							@Pc(80) int local80 = local62;
							@Pc(82) int local82 = local62;
							@Pc(84) int local84 = local24;
							@Pc(86) int local86 = local24;
							while (local84 > 0 && (super.aByteArrayArrayArray8[local20][local62][local84 - 1] & 0x4) != 0 && local24 - local84 < 10) {
								local84--;
							}
							while (local86 < super.anInt567 && (super.aByteArrayArrayArray8[local20][local62][local86 + 1] & 0x4) != 0 && local86 - local84 < 10) {
								local86++;
							}
							@Pc(143) int local143;
							label111: while (local80 > 0 && local62 - local80 < 10) {
								for (local143 = local84; local143 <= local86; local143++) {
									if ((super.aByteArrayArrayArray8[local20][local80 - 1][local143] & 0x4) == 0) {
										break label111;
									}
								}
								local80--;
							}
							label98: while (super.anInt563 > local82 && local82 - local80 < 10) {
								for (local143 = local84; local143 <= local86; local143++) {
									if ((super.aByteArrayArrayArray8[local20][local82 + 1][local143] & 0x4) == 0) {
										break label98;
									}
								}
								local82++;
							}
							if ((local82 + 1 - local80) * (local86 + 1 + -local84) >= 4) {
								local143 = super.anIntArrayArrayArray2[local20][local80][local84];
								Static179.method2636(local80 << 9, local20, (local82 << 9) + 512, local84 << 9, local143, (local86 << 9) + 512, local143);
								for (@Pc(272) int local272 = local80; local272 <= local82; local272++) {
									for (@Pc(276) int local276 = local84; local276 <= local86; local276++) {
										super.aByteArrayArrayArray8[local20][local272][local276] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static423.method6424();
		}
		super.aByteArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIII[ILclient!rv;ILclient!ha;III)V")
	public void method540(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) Class5_Sub15 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class143 arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean26) {
			return;
		}
		@Pc(13) Class378 local13 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(25) int local25 = (arg3 & 0x7) * 8;
		@Pc(31) int local31 = (arg1 & 0x7) * 8;
		while (true) {
			@Pc(36) int local36;
			@Pc(57) int local57;
			@Pc(344) int local344;
			@Pc(64) int local64;
			while (arg5.aByteArray45.length > arg5.anInt4144) {
				local36 = arg5.method3642();
				if (local36 == 0) {
					local13 = new Class378(arg5);
				} else {
					@Pc(113) int local113;
					@Pc(159) int local159;
					@Pc(178) int local178;
					@Pc(107) int local107;
					if (local36 == 1) {
						local57 = arg5.method3642();
						if (local57 > 0) {
							for (local64 = 0; local64 < local57; local64++) {
								@Pc(73) Class371 local73 = new Class371(arg7, arg5, 2);
								if (local73.anInt10047 == 31) {
									@Pc(84) Class302 local84 = Static80.aClass118_1.method2463(arg5.method3698());
									local73.method8369(local84.anInt8512, local84.anInt8504, local84.anInt8505, local84.anInt8507);
								}
								if (arg7.method6237() > 0) {
									@Pc(101) Class5_Sub3 local101 = local73.aClass5_Sub3_3;
									local107 = local101.method8317() >> 9;
									local113 = local101.method8323() >> 9;
									if (arg9 == local73.anInt10052 && local107 >= local25 && local107 < local25 + 8 && local113 >= local31 && local113 < local31 + 8) {
										local159 = Static235.method3365(arg2, local101.method8317() & 0xFFF, local101.method8323() & 0xFFF) + (arg0 << 9);
										local178 = (arg8 << 9) + Static45.method620(local101.method8323() & 0xFFF, local101.method8317() & 0xFFF, arg2);
										local107 = local159 >> 9;
										local113 = local178 >> 9;
										if (local107 >= 0 && local113 >= 0 && super.anInt563 > local107 && local113 < super.anInt567) {
											local101.method8316(super.anIntArrayArrayArray2[arg9][local107][local113] - local101.method8313(), local178, local159);
											Static388.method5678(local73);
										}
									}
								}
							}
						}
					} else if (local36 == 2) {
						if (local13 == null) {
							local13 = new Class378();
						}
						local13.method8434(arg5);
					} else if (local36 != 128) {
						if (local36 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray11 == null) {
							super.aByteArrayArrayArray11 = new byte[4][][];
						}
						for (local57 = 0; local57 < 4; local57++) {
							@Pc(309) byte local309 = arg5.method3677();
							@Pc(348) int local348;
							if (local309 == 0 && super.aByteArrayArrayArray11[arg6] != null) {
								if (arg9 >= local57) {
									local344 = arg0;
									local348 = arg0 + 7;
									local107 = arg8;
									if (arg0 < 0) {
										local344 = 0;
									} else if (arg0 >= super.anInt563) {
										local344 = super.anInt563;
									}
									local113 = arg8 + 7;
									if (arg8 < 0) {
										local107 = 0;
									} else if (super.anInt567 <= arg8) {
										local107 = super.anInt567;
									}
									if (local348 < 0) {
										local348 = 0;
									} else if (super.anInt563 <= local348) {
										local348 = super.anInt563;
									}
									if (local113 < 0) {
										local113 = 0;
									} else if (local113 >= super.anInt567) {
										local113 = super.anInt567;
									}
									while (local344 < local348) {
										while (local107 < local113) {
											super.aByteArrayArrayArray11[arg6][local344][local107] = 0;
											local107++;
										}
										local344++;
									}
								}
							} else if (local309 == 1) {
								if (super.aByteArrayArrayArray11[arg6] == null) {
									super.aByteArrayArrayArray11[arg6] = new byte[super.anInt563 + 1][super.anInt567 + 1];
								}
								for (local344 = 0; local344 < 64; local344 += 4) {
									for (local348 = 0; local348 < 64; local348 += 4) {
										@Pc(354) byte local354 = arg5.method3677();
										if (arg9 >= local57) {
											for (local113 = local344; local113 < local344 + 4; local113++) {
												for (local159 = local348; local159 < local348 + 4; local159++) {
													if (local25 <= local113 && local25 + 8 > local113 && local31 <= local159 && local31 < local31 + 8) {
														local178 = arg0 + Static330.method5111(local113 & 0x7, local159 & 0x7, arg2);
														@Pc(413) int local413 = Static541.method7491(local159 & 0x7, arg2, local113 & 0x7) + arg8;
														if (local178 >= 0 && super.anInt563 > local178 && local413 >= 0 && super.anInt567 > local413) {
															super.aByteArrayArrayArray11[arg6][local178][local413] = local354;
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
						arg5.anInt4144 += 10;
					} else {
						arg4[0] = arg5.method3698();
						arg4[1] = arg5.method3638();
						arg4[2] = arg5.method3638();
						arg4[3] = arg5.method3638();
						arg4[4] = arg5.method3698();
					}
				}
			}
			if (local13 != null) {
				Static188.method2731(arg0 >> 3, local13, arg8 >> 3);
			}
			if (super.aByteArrayArrayArray11 != null && super.aByteArrayArrayArray11[arg6] != null) {
				local36 = arg0 + 7;
				local57 = arg8 + 7;
				for (local64 = arg0; local64 < local36; local64++) {
					for (local344 = arg8; local344 < local57; local344++) {
						super.aByteArrayArrayArray11[arg6][local64][local344] = 0;
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lclient!ha;ILclient!rv;I[II)V")
	public void method541(@OriginalArg(0) Class143 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub15 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean26) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class378 local13 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		while (true) {
			@Pc(30) int local30;
			@Pc(48) int local48;
			@Pc(257) int local257;
			@Pc(261) int local261;
			@Pc(52) int local52;
			while (arg2.anInt4144 < arg2.aByteArray45.length) {
				local30 = arg2.method3642();
				if (local30 == 0) {
					local13 = new Class378(arg2);
				} else {
					@Pc(100) int local100;
					@Pc(108) int local108;
					@Pc(112) int local112;
					if (local30 == 1) {
						local48 = arg2.method3642();
						if (local48 > 0) {
							for (local52 = 0; local52 < local48; local52++) {
								@Pc(61) Class371 local61 = new Class371(arg0, arg2, 2);
								if (local61.anInt10047 == 31) {
									@Pc(72) Class302 local72 = Static80.aClass118_1.method2463(arg2.method3698());
									local61.method8369(local72.anInt8512, local72.anInt8504, local72.anInt8505, local72.anInt8507);
								}
								if (arg0.method6237() > 0) {
									@Pc(92) Class5_Sub3 local92 = local61.aClass5_Sub3_3;
									local100 = (arg1 << 9) + local92.method8317();
									local108 = (arg4 << 9) + local92.method8323();
									local112 = local100 >> 9;
									@Pc(116) int local116 = local108 >> 9;
									if (local112 >= 0 && local116 >= 0 && super.anInt563 > local112 && local116 < super.anInt567) {
										local92.method8316(super.anIntArrayArrayArray2[local61.anInt10052][local112][local116] - local92.method8313(), local108, local100);
										Static388.method5678(local61);
									}
								}
							}
						}
					} else if (local30 == 2) {
						if (local13 == null) {
							local13 = new Class378();
						}
						local13.method8434(arg2);
					} else if (local30 != 128) {
						if (local30 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray11 == null) {
							super.aByteArrayArrayArray11 = new byte[4][][];
						}
						local11 = true;
						for (local48 = 0; local48 < 4; local48++) {
							@Pc(248) byte local248 = arg2.method3677();
							if (local248 == 0 && super.aByteArrayArrayArray11[local48] != null) {
								local257 = arg1;
								local261 = arg1 + 64;
								local100 = arg4;
								if (local261 < 0) {
									local261 = 0;
								} else if (super.anInt563 <= local261) {
									local261 = super.anInt563;
								}
								if (arg4 < 0) {
									local100 = 0;
								} else if (super.anInt567 <= arg4) {
									local100 = super.anInt567;
								}
								local108 = arg4 + 64;
								if (arg1 < 0) {
									local257 = 0;
								} else if (super.anInt563 <= arg1) {
									local257 = super.anInt563;
								}
								if (local108 < 0) {
									local108 = 0;
								} else if (super.anInt567 <= local108) {
									local108 = super.anInt567;
								}
								while (local257 < local261) {
									while (local100 < local108) {
										super.aByteArrayArrayArray11[local48][local257][local100] = 0;
										local100++;
									}
									local257++;
								}
							} else if (local248 == 1) {
								if (super.aByteArrayArrayArray11[local48] == null) {
									super.aByteArrayArrayArray11[local48] = new byte[super.anInt563 + 1][super.anInt567 + 1];
								}
								for (local257 = 0; local257 < 64; local257 += 4) {
									for (local261 = 0; local261 < 64; local261 += 4) {
										@Pc(390) byte local390 = arg2.method3677();
										for (local108 = arg1 + local257; local108 < arg1 + local257 + 4; local108++) {
											for (local112 = local261 + arg4; local112 < arg4 + local261 + 4; local112++) {
												if (local108 >= 0 && super.anInt563 > local108 && local112 >= 0 && super.anInt567 > local112) {
													super.aByteArrayArrayArray11[local48][local108][local112] = local390;
												}
											}
										}
									}
								}
							} else if (local248 == 2) {
								if (super.aByteArrayArrayArray11[local48] == null) {
									super.aByteArrayArrayArray11[local48] = new byte[super.anInt563 + 1][super.anInt567 + 1];
								}
								if (local48 > 0) {
									local257 = arg1;
									local261 = arg1 + 64;
									local100 = arg4;
									if (arg1 < 0) {
										local257 = 0;
									} else if (super.anInt563 <= arg1) {
										local257 = super.anInt563;
									}
									if (local261 < 0) {
										local261 = 0;
									} else if (super.anInt563 <= local261) {
										local261 = super.anInt563;
									}
									local108 = arg4 + 64;
									if (arg4 < 0) {
										local100 = 0;
									} else if (super.anInt567 <= arg4) {
										local100 = super.anInt567;
									}
									if (local108 < 0) {
										local108 = 0;
									} else if (super.anInt567 <= local108) {
										local108 = super.anInt567;
									}
									while (local261 > local257) {
										while (local108 > local100) {
											super.aByteArrayArrayArray11[local48][local257][local100] = super.aByteArrayArrayArray11[local48 - 1][local257][local100];
											local100++;
										}
										local257++;
									}
								}
							}
						}
					} else if (arg3 == null) {
						arg2.anInt4144 += 10;
					} else {
						arg3[0] = arg2.method3698();
						arg3[1] = arg2.method3638();
						arg3[2] = arg2.method3638();
						arg3[3] = arg2.method3638();
						arg3[4] = arg2.method3698();
					}
				}
			}
			if (local13 != null) {
				for (local30 = 0; local30 < 8; local30++) {
					for (local48 = 0; local48 < 8; local48++) {
						local52 = (arg1 >> 3) + local30;
						local257 = local48 + (arg4 >> 3);
						if (local52 >= 0 && super.anInt563 >> 3 > local52 && local257 >= 0 && local257 < super.anInt567 >> 3) {
							Static188.method2731(local52, local13, local257);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray11 != null) {
				for (local30 = 0; local30 < 4; local30++) {
					if (super.aByteArrayArrayArray11[local30] != null) {
						for (local48 = 0; local48 < 16; local48++) {
							for (local52 = 0; local52 < 16; local52++) {
								local257 = (arg1 >> 2) + local48;
								local261 = (arg4 >> 2) + local52;
								if (local257 >= 0 && local257 < 26 && local261 >= 0 && local261 < 26) {
									super.aByteArrayArrayArray11[local30][local257][local261] = 0;
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

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILclient!mja;Lclient!ha;IIII)V")
	public void method542(@OriginalArg(0) int arg0, @OriginalArg(1) Class234 arg1, @OriginalArg(2) Class143 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(15) Interface10 local15 = this.method538(arg4, arg0, arg3, arg5);
		if (local15 == null) {
			return;
		}
		@Pc(24) Class81 local24 = Static400.aClass140_4.method2839(local15.method8668());
		@Pc(28) int local28 = local15.method8670();
		@Pc(32) int local32 = local15.method8671();
		if (local24.method1757()) {
			Static282.method3898(arg3, arg4, local24, arg5);
		}
		if (local15.method8669()) {
			local15.method8667(arg2);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				Static262.method3627(arg4, arg3, arg5);
				return;
			}
			if (arg0 == 2) {
				Static75.method1105(arg4, arg3, arg5, ija.class);
				if (local24.anInt1881 != 0 && arg3 + local24.anInt1910 < super.anInt563 && local24.anInt1910 + arg5 < super.anInt567 && local24.anInt1897 + arg3 < super.anInt563 && super.anInt567 > arg5 + local24.anInt1897) {
					arg1.method5456(local24.aBoolean131, !local24.aBoolean127, local24.anInt1910, local32, arg5, local24.anInt1897, arg3);
				}
				if (local28 == 9) {
					if ((local32 & 0x1) == 0) {
						Static532.method7416(arg4, arg5, arg3, 8);
						return;
					}
					Static532.method7416(arg4, arg5, arg3, 16);
					return;
				}
			} else if (arg0 == 3) {
				Static446.method6635(arg4, arg3, arg5);
				if (local24.anInt1881 != 1) {
					return;
				}
				arg1.method5460(arg3, arg5);
			} else {
				return;
			}
			return;
		}
		Static523.method8746(arg4, arg3, arg5);
		if (local24.anInt1881 != 0) {
			arg1.method5450(arg3, arg5, local28, !local24.aBoolean127, local32, local24.aBoolean131);
		}
		if (local24.anInt1896 != 1) {
			return;
		}
		if (local32 == 0) {
			Static532.method7416(arg4, arg5, arg3, 1);
		} else if (local32 == 1) {
			Static532.method7416(arg4, arg5 + 1, arg3, 2);
			return;
		} else if (local32 == 2) {
			Static532.method7416(arg4, arg5, arg3 + 1, 1);
			return;
		} else if (local32 == 3) {
			Static532.method7416(arg4, arg5, arg3, 2);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(IIIIILclient!mja;IIILclient!ha;I)V")
	public void method543(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class234 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class143 arg8, @OriginalArg(10) int arg9) {
		if (Static655.aClass5_Sub36_29.aClass2_Sub19_1.method7172() == 0 && !Static71.method1044(arg5, arg9, arg0, Static326.anInt5965)) {
			return;
		}
		if (arg3 < this.anInt577) {
			this.anInt577 = arg3;
		}
		@Pc(28) Class81 local28 = Static400.aClass140_4.method2839(arg7);
		if (Static655.aClass5_Sub36_29.aClass2_Sub10_1.method3819() == 0 && local28.aBoolean137) {
			return;
		}
		@Pc(53) int local53;
		@Pc(50) int local50;
		if (arg2 == 1 || arg2 == 3) {
			local50 = local28.anInt1910;
			local53 = local28.anInt1897;
		} else {
			local50 = local28.anInt1897;
			local53 = local28.anInt1910;
		}
		@Pc(72) int local72;
		@Pc(70) int local70;
		if (super.anInt563 < local53 + arg9) {
			local70 = arg9 + 1;
			local72 = arg9;
		} else {
			local70 = (local53 + 1 >> 1) + arg9;
			local72 = arg9 + (local53 >> 1);
		}
		@Pc(96) int local96;
		@Pc(100) int local100;
		if (super.anInt567 < arg0 + local50) {
			local96 = arg0;
			local100 = arg0 + 1;
		} else {
			local96 = (local50 >> 1) + arg0;
			local100 = (local50 + 1 >> 1) + arg0;
		}
		@Pc(119) Class88 local119 = Static298.aClass88Array3[arg5];
		@Pc(147) int local147 = local119.method8749(local72, local96) + local119.method8749(local70, local96) + local119.method8749(local72, local100) + local119.method8749(local70, local100) >> 2;
		@Pc(155) int local155 = (arg9 << 9) + (local53 << 8);
		@Pc(163) int local163 = (local50 << 8) + (arg0 << 9);
		@Pc(179) boolean local179 = Static8.aBoolean1 && !super.aBoolean26 && local28.aBoolean134;
		if (local28.method1757()) {
			Static578.method7881(arg0, arg2, (Class41_Sub1_Sub1_Sub3_Sub2) null, (Class41_Sub1_Sub1_Sub3_Sub1) null, arg3, arg9, local28);
		}
		@Pc(216) boolean local216 = arg6 == -1 && local28.anInt1909 == -1 && local28.anIntArray99 == null && local28.anIntArray100 == null && !local28.lb && !local28.aBoolean132;
		if (Static520.aBoolean632 && (Static335.method5147(arg1) && local28.anInt1896 != 1 || !(!Static384.method5634(arg1) || local28.anInt1896 != 0))) {
			return;
		}
		if (arg1 != 22) {
			@Pc(364) Class41_Sub1_Sub1 local364;
			@Pc(327) Class41_Sub1_Sub1_Sub1 local327;
			@Pc(362) int local362;
			@Pc(423) int local423;
			if (arg1 == 10 || arg1 == 11) {
				local327 = null;
				if (local216) {
					@Pc(358) Class41_Sub1_Sub1_Sub1 local358 = new Class41_Sub1_Sub1_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg9, local53 + arg9 - 1, arg0, arg0 + local50 - 1, arg1, arg2, local179);
					local362 = local358.method724();
					local364 = local358;
					local327 = local358;
				} else {
					local364 = new Class41_Sub1_Sub1_Sub4(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg9, arg9 + local53 - 1, arg0, arg0 + local50 - 1, arg1, arg2, arg6);
					local362 = 15;
				}
				if (Static213.method3080(local364, false)) {
					if (local327 != null && local327.method8669()) {
						local327.method8666(arg8);
					}
					if (local28.aBoolean139 && Static8.aBoolean1) {
						if (local362 > 30) {
							local362 = 30;
						}
						for (local423 = 0; local423 <= local53; local423++) {
							for (@Pc(426) int local426 = 0; local426 <= local50; local426++) {
								local119.ka(arg9 + local423, arg0 + local426, local362);
							}
						}
					}
				}
				if (local28.anInt1881 != 0 && arg4 != null) {
					arg4.method5444(arg9, local50, local53, arg0, local28.aBoolean131, !local28.aBoolean127);
				}
			} else if ((arg1 < 12 || arg1 > 17) && (arg1 < 18 || arg1 > 21)) {
				@Pc(653) Class41_Sub1_Sub3 local653;
				if (arg1 == 0) {
					@Pc(627) int local627 = local28.anInt1896;
					if (Static477.aBoolean252 && local28.anInt1896 == -1) {
						local627 = 1;
					}
					if (local216) {
						@Pc(670) Class41_Sub1_Sub3_Sub1 local670 = new Class41_Sub1_Sub3_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg1, arg2, local179);
						if (local670.method8669()) {
							local670.method8666(arg8);
						}
						local653 = local670;
					} else {
						local653 = new Class41_Sub1_Sub3_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg1, arg2, arg6);
					}
					Static509.method5085(arg3, arg9, arg0, local653, (Class41_Sub1_Sub3) null);
					if (arg2 == 0) {
						if (Static8.aBoolean1 && local28.aBoolean139) {
							local119.ka(arg9, arg0, 50);
							local119.ka(arg9, arg0 + 1, 50);
						}
						if (local627 == 1 && !super.aBoolean26) {
							Static494.method7187(arg0, local28.anInt1886, arg9, 1, arg3, local28.anInt1925);
						}
					} else if (arg2 == 1) {
						if (Static8.aBoolean1 && local28.aBoolean139) {
							local119.ka(arg9, arg0 + 1, 50);
							local119.ka(arg9 + 1, arg0 + 1, 50);
						}
						if (local627 == 1 && !super.aBoolean26) {
							Static494.method7187(arg0 + 1, local28.anInt1886, arg9, 2, arg3, -local28.anInt1925);
						}
					} else if (arg2 == 2) {
						if (Static8.aBoolean1 && local28.aBoolean139) {
							local119.ka(arg9 + 1, arg0, 50);
							local119.ka(arg9 + 1, arg0 + 1, 50);
						}
						if (local627 == 1 && !super.aBoolean26) {
							Static494.method7187(arg0, local28.anInt1886, arg9 + 1, 1, arg3, -local28.anInt1925);
						}
					} else if (arg2 == 3) {
						if (Static8.aBoolean1 && local28.aBoolean139) {
							local119.ka(arg9, arg0, 50);
							local119.ka(arg9 + 1, arg0, 50);
						}
						if (local627 == 1 && !super.aBoolean26) {
							Static494.method7187(arg0, local28.anInt1886, arg9, 2, arg3, local28.anInt1925);
						}
					}
					if (local28.anInt1881 != 0 && arg4 != null) {
						arg4.method5451(arg9, arg2, local28.aBoolean131, arg1, !local28.aBoolean127, arg0);
					}
					if (local28.anInt1915 != 64) {
						Static545.method7531(arg3, arg9, arg0, local28.anInt1915);
					}
				} else {
					@Pc(912) Class41_Sub1_Sub3 local912;
					@Pc(929) Class41_Sub1_Sub3_Sub1 local929;
					if (arg1 == 1) {
						if (local216) {
							local929 = new Class41_Sub1_Sub3_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg1, arg2, local179);
							if (local929.method8669()) {
								local929.method8666(arg8);
							}
							local912 = local929;
						} else {
							local912 = new Class41_Sub1_Sub3_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg1, arg2, arg6);
						}
						Static509.method5085(arg3, arg9, arg0, local912, (Class41_Sub1_Sub3) null);
						if (local28.aBoolean139 && Static8.aBoolean1) {
							if (arg2 == 0) {
								local119.ka(arg9, arg0 + 1, 50);
							} else if (arg2 == 1) {
								local119.ka(arg9 + 1, arg0 + 1, 50);
							} else if (arg2 == 2) {
								local119.ka(arg9 + 1, arg0, 50);
							} else if (arg2 == 3) {
								local119.ka(arg9, arg0, 50);
							}
						}
						if (local28.anInt1881 != 0 && arg4 != null) {
							arg4.method5451(arg9, arg2, local28.aBoolean131, arg1, !local28.aBoolean127, arg0);
						}
					} else if (arg1 == 2) {
						local362 = arg2 + 1 & 0x3;
						if (local216) {
							@Pc(1089) Class41_Sub1_Sub3_Sub1 local1089 = new Class41_Sub1_Sub3_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg1, arg2 + 4, local179);
							@Pc(1105) Class41_Sub1_Sub3_Sub1 local1105 = new Class41_Sub1_Sub3_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg1, local362, local179);
							if (local1089.method8669()) {
								local1089.method8666(arg8);
							}
							if (local1105.method8669()) {
								local1105.method8666(arg8);
							}
							local653 = local1105;
							local912 = local1089;
						} else {
							local912 = new Class41_Sub1_Sub3_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg1, arg2 + 4, arg6);
							local653 = new Class41_Sub1_Sub3_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg1, local362, arg6);
						}
						Static509.method5085(arg3, arg9, arg0, local912, local653);
						if ((local28.anInt1896 == 1 || Static477.aBoolean252 && local28.anInt1896 == -1) && !super.aBoolean26) {
							if (arg2 == 0) {
								Static494.method7187(arg0, local28.anInt1886, arg9, 1, arg3, local28.anInt1925);
								Static494.method7187(arg0 + 1, local28.anInt1886, arg9, 2, arg3, local28.anInt1925);
							} else if (arg2 == 1) {
								Static494.method7187(arg0, local28.anInt1886, arg9 + 1, 1, arg3, local28.anInt1925);
								Static494.method7187(arg0 + 1, local28.anInt1886, arg9, 2, arg3, local28.anInt1925);
							} else if (arg2 == 2) {
								Static494.method7187(arg0, local28.anInt1886, arg9 + 1, 1, arg3, local28.anInt1925);
								Static494.method7187(arg0, local28.anInt1886, arg9, 2, arg3, local28.anInt1925);
							} else if (arg2 == 3) {
								Static494.method7187(arg0, local28.anInt1886, arg9, 1, arg3, local28.anInt1925);
								Static494.method7187(arg0, local28.anInt1886, arg9, 2, arg3, local28.anInt1925);
							}
						}
						if (local28.anInt1881 != 0 && arg4 != null) {
							arg4.method5451(arg9, arg2, local28.aBoolean131, arg1, !local28.aBoolean127, arg0);
						}
						if (local28.anInt1915 != 64) {
							Static545.method7531(arg3, arg9, arg0, local28.anInt1915);
						}
					} else if (arg1 == 3) {
						if (local216) {
							local929 = new Class41_Sub1_Sub3_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg1, arg2, local179);
							if (local929.method8669()) {
								local929.method8666(arg8);
							}
							local912 = local929;
						} else {
							local912 = new Class41_Sub1_Sub3_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg1, arg2, arg6);
						}
						Static509.method5085(arg3, arg9, arg0, local912, (Class41_Sub1_Sub3) null);
						if (local28.aBoolean139 && Static8.aBoolean1) {
							if (arg2 == 0) {
								local119.ka(arg9, arg0 + 1, 50);
							} else if (arg2 == 1) {
								local119.ka(arg9 + 1, arg0 - -1, 50);
							} else if (arg2 == 2) {
								local119.ka(arg9 + 1, arg0, 50);
							} else if (arg2 == 3) {
								local119.ka(arg9, arg0, 50);
							}
						}
						if (local28.anInt1881 != 0 && arg4 != null) {
							arg4.method5451(arg9, arg2, local28.aBoolean131, arg1, !local28.aBoolean127, arg0);
						}
					} else if (arg1 == 9) {
						if (local216) {
							local327 = new Class41_Sub1_Sub1_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg9, arg9, arg0, arg0, arg1, arg2, local179);
							if (local327.method8669()) {
								local327.method8666(arg8);
							}
							local364 = local327;
						} else {
							local364 = new Class41_Sub1_Sub1_Sub4(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg9, arg9 + local53 - 1, arg0, local50 + arg0 - 1, arg1, arg2, arg6);
						}
						Static213.method3080(local364, false);
						if (local28.anInt1896 == 1 && !super.aBoolean26) {
							@Pc(1502) byte local1502;
							if ((arg2 & 0x1) == 0) {
								local1502 = 8;
							} else {
								local1502 = 16;
							}
							Static494.method7187(arg0, local28.anInt1886, arg9, local1502, arg3, 0);
						}
						if (local28.anInt1881 != 0 && arg4 != null) {
							arg4.method5444(arg9, local50, local53, arg0, local28.aBoolean131, !local28.aBoolean127);
						}
						if (local28.anInt1915 != 64) {
							Static545.method7531(arg3, arg9, arg0, local28.anInt1915);
						}
					} else {
						@Pc(1570) Class41_Sub1_Sub5 local1570;
						if (arg1 == 4) {
							if (local216) {
								@Pc(1588) Class41_Sub1_Sub5_Sub1 local1588 = new Class41_Sub1_Sub5_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, 0, 0, arg1, arg2);
								if (local1588.method8669()) {
									local1588.method8666(arg8);
								}
								local1570 = local1588;
							} else {
								local1570 = new Class41_Sub1_Sub5_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, 0, 0, arg1, arg2, arg6);
							}
							Static135.method2041(arg3, arg9, arg0, local1570, (Class41_Sub1_Sub5) null);
						} else {
							@Pc(1610) int local1610;
							@Pc(1616) Interface10 local1616;
							@Pc(1682) Class41_Sub1_Sub5_Sub1 local1682;
							if (arg1 == 5) {
								local1610 = 65;
								local1616 = (Interface10) Static322.method5015(arg3, arg9, arg0);
								if (local1616 != null) {
									local1610 = Static400.aClass140_4.method2839(local1616.method8668()).anInt1915 + 1;
								}
								if (local216) {
									local1682 = new Class41_Sub1_Sub5_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, Static598.anIntArray552[arg2] * local1610, Static243.anIntArray239[arg2] * local1610, arg1, arg2);
									if (local1682.method8669()) {
										local1682.method8666(arg8);
									}
									local1570 = local1682;
								} else {
									local1570 = new Class41_Sub1_Sub5_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, Static598.anIntArray552[arg2] * local1610, Static243.anIntArray239[arg2] * local1610, arg1, arg2, arg6);
								}
								Static135.method2041(arg3, arg9, arg0, local1570, (Class41_Sub1_Sub5) null);
							} else if (arg1 == 6) {
								local1610 = 33;
								local1616 = (Interface10) Static322.method5015(arg3, arg9, arg0);
								if (local1616 != null) {
									local1610 = Static400.aClass140_4.method2839(local1616.method8668()).anInt1915 / 2 + 1;
								}
								if (local216) {
									local1682 = new Class41_Sub1_Sub5_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, local1610 * Static598.anIntArray552[arg2], Static243.anIntArray239[arg2] * local1610, arg1, arg2 + 4);
									if (local1682.method8669()) {
										local1682.method8666(arg8);
									}
									local1570 = local1682;
								} else {
									local1570 = new Class41_Sub1_Sub5_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, Static673.anIntArray614[arg2] * local1610, Static464.anIntArray450[arg2] * local1610, arg1, arg2 + 4, arg6);
								}
								Static135.method2041(arg3, arg9, arg0, local1570, (Class41_Sub1_Sub5) null);
							} else if (arg1 == 7) {
								local1610 = arg2 + 2 & 0x3;
								if (local216) {
									@Pc(1831) Class41_Sub1_Sub5_Sub1 local1831 = new Class41_Sub1_Sub5_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, 0, 0, arg1, local1610 + 4);
									local1570 = local1831;
									if (local1831.method8669()) {
										local1831.method8666(arg8);
									}
								} else {
									local1570 = new Class41_Sub1_Sub5_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, 0, 0, arg1, local1610 + 4, arg6);
								}
								Static135.method2041(arg3, arg9, arg0, local1570, (Class41_Sub1_Sub5) null);
							} else if (arg1 == 8) {
								local362 = arg2 + 2 & 0x3;
								local423 = 33;
								@Pc(1888) Interface10 local1888 = (Interface10) Static322.method5015(arg3, arg9, arg0);
								if (local1888 != null) {
									local423 = Static400.aClass140_4.method2839(local1888.method8668()).anInt1915 / 2 + 1;
								}
								@Pc(1932) Class41_Sub1_Sub5 local1932;
								@Pc(1952) Class41_Sub1_Sub5 local1952;
								if (local216) {
									local1932 = new Class41_Sub1_Sub5_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, Static673.anIntArray614[arg2] * local423, local423 * Static464.anIntArray450[arg2], arg1, arg2 + 4);
									local1952 = new Class41_Sub1_Sub5_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, 0, 0, arg1, local362 + 4);
									if (local1932.method8669()) {
										local1932.method8666(arg8);
									}
									if (local1952.method8669()) {
										local1952.method8666(arg8);
									}
								} else {
									local1932 = new Class41_Sub1_Sub5_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, local423 * Static673.anIntArray614[arg2], local423 * Static464.anIntArray450[arg2], arg1, arg2 + 4, arg6);
									local1952 = new Class41_Sub1_Sub5_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, 0, 0, arg1, local362 + 4, arg6);
								}
								Static135.method2041(arg3, arg9, arg0, local1932, local1952);
							}
						}
					}
				}
			} else {
				if (local216) {
					local327 = new Class41_Sub1_Sub1_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg9, arg9 + local53 - 1, arg0, arg0 + local50 - 1, arg1, arg2, local179);
					local364 = local327;
					if (local327.method8669()) {
						local327.method8666(arg8);
					}
				} else {
					local364 = new Class41_Sub1_Sub1_Sub4(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg9, local53 + arg9 - 1, arg0, arg0 + local50 - 1, arg1, arg2, arg6);
				}
				Static213.method3080(local364, false);
				if (Static8.aBoolean1 && !super.aBoolean26 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg3 > 0 && local28.anInt1896 != 0) {
					super.aByteArrayArrayArray8[arg3][arg9][arg0] = (byte) (super.aByteArrayArrayArray8[arg3][arg9][arg0] | 0x4);
				}
				if (local28.anInt1881 != 0 && arg4 != null) {
					arg4.method5444(arg9, local50, local53, arg0, local28.aBoolean131, !local28.aBoolean127);
				}
			}
		} else if (Static655.aClass5_Sub36_29.aClass2_Sub3_1.method2012() != 0 || local28.anInt1885 != 0 || local28.anInt1881 == 1 || local28.aBoolean130) {
			@Pc(274) Class41_Sub1_Sub4 local274;
			if (local216) {
				@Pc(290) Class41_Sub1_Sub4_Sub2 local290 = new Class41_Sub1_Sub4_Sub2(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg2, local179);
				if (local290.method8669()) {
					local290.method8666(arg8);
				}
				local274 = local290;
			} else {
				local274 = new Class41_Sub1_Sub4_Sub1(arg8, local28, arg3, arg5, local155, local147, local163, super.aBoolean26, arg2, arg6);
			}
			Static213.method3081(arg3, arg9, arg0, local274);
			if (local28.anInt1881 == 1 && arg4 != null) {
				arg4.method5459(arg0, arg9);
			}
		}
	}
}
