import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class310_Sub1 extends Class310 {

	@OriginalMember(owner = "client!tf", name = "L", descriptor = "I")
	public int anInt9408 = 99;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IIIZ)V")
	public Class310_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static294.aClass375_10, Static89.aClass391_9);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!ha;Lclient!gga;[II)V")
	public void method7925(@OriginalArg(1) int arg0, @OriginalArg(2) Class132 arg1, @OriginalArg(3) Class6_Sub23 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean682) {
			return;
		}
		@Pc(16) boolean local16 = false;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(24) Class283 local24 = null;
		while (true) {
			@Pc(40) int local40;
			@Pc(108) int local108;
			@Pc(112) int local112;
			@Pc(44) int local44;
			@Pc(99) int local99;
			label308: do {
				while (true) {
					@Pc(29) int local29;
					@Pc(238) int local238;
					@Pc(242) int local242;
					while (arg2.aByteArray101.length > arg2.anInt9901) {
						local29 = arg2.method8374();
						if (local29 == 0) {
							local24 = new Class283(arg2);
						} else {
							if (local29 == 1) {
								local40 = arg2.method8374();
								continue label308;
							}
							if (local29 == 2) {
								if (local24 == null) {
									local24 = new Class283();
								}
								local24.method6970(arg2);
							} else if (local29 != 128) {
								if (local29 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray15 == null) {
									super.aByteArrayArrayArray15 = new byte[4][][];
								}
								local16 = true;
								for (local40 = 0; local40 < 4; local40++) {
									@Pc(229) byte local229 = arg2.method8391();
									if (local229 == 0 && super.aByteArrayArrayArray15[local40] != null) {
										local238 = arg0;
										local242 = arg0 + 64;
										local99 = arg4;
										local108 = arg4 + 64;
										if (arg4 < 0) {
											local99 = 0;
										} else if (super.anInt9395 <= arg4) {
											local99 = super.anInt9395;
										}
										if (local242 < 0) {
											local242 = 0;
										} else if (local242 >= super.anInt9390) {
											local242 = super.anInt9390;
										}
										if (arg0 < 0) {
											local238 = 0;
										} else if (arg0 >= super.anInt9390) {
											local238 = super.anInt9390;
										}
										if (local108 < 0) {
											local108 = 0;
										} else if (local108 >= super.anInt9395) {
											local108 = super.anInt9395;
										}
										while (local242 > local238) {
											while (local99 < local108) {
												super.aByteArrayArrayArray15[local40][local238][local99] = 0;
												local99++;
											}
											local238++;
										}
									} else if (local229 == 1) {
										if (super.aByteArrayArrayArray15[local40] == null) {
											super.aByteArrayArrayArray15[local40] = new byte[super.anInt9390 + 1][super.anInt9395 + 1];
										}
										for (local238 = 0; local238 < 64; local238 += 4) {
											for (local242 = 0; local242 < 64; local242 += 4) {
												@Pc(521) byte local521 = arg2.method8391();
												for (local108 = arg0 + local238; local108 < arg0 + local238 + 4; local108++) {
													for (local112 = local242 + arg4; local112 < arg4 + local242 + 4; local112++) {
														if (local108 >= 0 && local108 < super.anInt9390 && local112 >= 0 && super.anInt9395 > local112) {
															super.aByteArrayArrayArray15[local40][local108][local112] = local521;
														}
													}
												}
											}
										}
									} else if (local229 == 2) {
										if (super.aByteArrayArrayArray15[local40] == null) {
											super.aByteArrayArrayArray15[local40] = new byte[super.anInt9390 + 1][super.anInt9395 + 1];
										}
										if (local40 > 0) {
											local238 = arg0;
											local242 = arg0 + 64;
											local99 = arg4;
											if (arg4 < 0) {
												local99 = 0;
											} else if (super.anInt9395 <= arg4) {
												local99 = super.anInt9395;
											}
											if (local242 < 0) {
												local242 = 0;
											} else if (super.anInt9390 <= local242) {
												local242 = super.anInt9390;
											}
											if (arg0 < 0) {
												local238 = 0;
											} else if (arg0 >= super.anInt9390) {
												local238 = super.anInt9390;
											}
											local108 = arg4 + 64;
											if (local108 < 0) {
												local108 = 0;
											} else if (local108 >= super.anInt9395) {
												local108 = super.anInt9395;
											}
											while (local242 > local238) {
												while (local99 < local108) {
													super.aByteArrayArrayArray15[local40][local238][local99] = super.aByteArrayArrayArray15[local40 - 1][local238][local99];
													local99++;
												}
												local238++;
											}
										}
									}
								}
							} else if (arg3 == null) {
								arg2.anInt9901 += 10;
							} else {
								arg3[0] = arg2.method8363();
								arg3[1] = arg2.method8395();
								arg3[2] = arg2.method8395();
								arg3[3] = arg2.method8395();
								arg3[4] = arg2.method8363();
							}
						}
					}
					if (local24 != null) {
						for (local29 = 0; local29 < 8; local29++) {
							for (local40 = 0; local40 < 8; local40++) {
								local44 = (arg0 >> 3) + local29;
								local238 = (arg4 >> 3) + local40;
								if (local44 >= 0 && local44 < super.anInt9390 >> 3 && local238 >= 0 && local238 < super.anInt9395 >> 3) {
									Static364.method5251(local44, local238, local24);
								}
							}
						}
					}
					if (!local16 && super.aByteArrayArrayArray15 != null) {
						for (local29 = 0; local29 < 4; local29++) {
							if (super.aByteArrayArrayArray15[local29] != null) {
								for (local40 = 0; local40 < 16; local40++) {
									for (local44 = 0; local44 < 16; local44++) {
										local238 = (arg0 >> 2) + local40;
										local242 = local44 + (arg4 >> 2);
										if (local238 >= 0 && local238 < 26 && local242 >= 0 && local242 < 26) {
											super.aByteArrayArrayArray15[local29][local238][local242] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local40 <= 0);
			for (local44 = 0; local44 < local40; local44++) {
				@Pc(53) Class394 local53 = new Class394(arg1, arg2, 2);
				if (local53.anInt10791 == 31) {
					@Pc(68) Class328 local68 = Static534.aClass162_1.method3622(arg2.method8363());
					local53.method9109(local68.anInt9302, local68.anInt9296, local68.anInt9294, local68.anInt9301);
				}
				if (arg1.method7511() > 0) {
					@Pc(88) Class6_Sub17 local88 = local53.aClass6_Sub17_3;
					local99 = local88.method8518() + (arg0 << 9);
					local108 = local88.method8521() + (arg4 << 9);
					local112 = local99 >> 9;
					@Pc(116) int local116 = local108 >> 9;
					if (local112 >= 0 && local116 >= 0 && local112 < super.anInt9390 && super.anInt9395 > local116) {
						local88.method8526(local99, local108, super.anIntArrayArrayArray20[local53.anInt10794][local112][local116] - local88.method8522());
						Static399.method5765(local53);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ha;Lclient!gga;II[IIIIZII)V")
	public void method7926(@OriginalArg(0) Class132 arg0, @OriginalArg(1) Class6_Sub23 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean682) {
			return;
		}
		@Pc(13) Class283 local13 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(25) int local25 = (arg6 & 0x7) * 8;
		@Pc(31) int local31 = (arg3 & 0x7) * 8;
		while (true) {
			@Pc(36) int local36;
			@Pc(55) int local55;
			@Pc(285) int local285;
			@Pc(62) int local62;
			while (arg1.anInt9901 < arg1.aByteArray101.length) {
				local36 = arg1.method8374();
				if (local36 == 0) {
					local13 = new Class283(arg1);
				} else {
					@Pc(111) int local111;
					@Pc(161) int local161;
					@Pc(179) int local179;
					@Pc(105) int local105;
					if (local36 == 1) {
						local55 = arg1.method8374();
						if (local55 > 0) {
							for (local62 = 0; local62 < local55; local62++) {
								@Pc(71) Class394 local71 = new Class394(arg0, arg1, 2);
								if (local71.anInt10791 == 31) {
									@Pc(82) Class328 local82 = Static534.aClass162_1.method3622(arg1.method8363());
									local71.method9109(local82.anInt9302, local82.anInt9296, local82.anInt9294, local82.anInt9301);
								}
								if (arg0.method7511() > 0) {
									@Pc(99) Class6_Sub17 local99 = local71.aClass6_Sub17_3;
									local105 = local99.method8518() >> 9;
									local111 = local99.method8521() >> 9;
									if (arg5 == local71.anInt10794 && local105 >= local25 && local25 + 8 > local105 && local31 <= local111 && local31 + 8 > local111) {
										local161 = Static649.method8841(local99.method8521() & 0xFFF, local99.method8518() & 0xFFF, arg9) + (arg2 << 9);
										local179 = Static154.method2178(local99.method8521() & 0xFFF, local99.method8518() & 0xFFF, arg9) + (arg7 << 9);
										local105 = local161 >> 9;
										local111 = local179 >> 9;
										if (local105 >= 0 && local111 >= 0 && super.anInt9390 > local105 && local111 < super.anInt9395) {
											local99.method8526(local161, local179, super.anIntArrayArrayArray20[arg5][local105][local111] - local99.method8522());
											Static399.method5765(local71);
										}
									}
								}
							}
						}
					} else if (local36 == 2) {
						if (local13 == null) {
							local13 = new Class283();
						}
						local13.method6970(arg1);
					} else if (local36 != 128) {
						if (local36 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray15 == null) {
							super.aByteArrayArrayArray15 = new byte[4][][];
						}
						for (local55 = 0; local55 < 4; local55++) {
							@Pc(253) byte local253 = arg1.method8391();
							@Pc(289) int local289;
							if (local253 == 0 && super.aByteArrayArrayArray15[arg8] != null) {
								if (local55 <= arg5) {
									local285 = arg2;
									local289 = arg2 + 7;
									local105 = arg7;
									local111 = arg7 + 7;
									if (arg7 < 0) {
										local105 = 0;
									} else if (super.anInt9395 <= arg7) {
										local105 = super.anInt9395;
									}
									if (local289 < 0) {
										local289 = 0;
									} else if (super.anInt9390 <= local289) {
										local289 = super.anInt9390;
									}
									if (arg2 < 0) {
										local285 = 0;
									} else if (super.anInt9390 <= arg2) {
										local285 = super.anInt9390;
									}
									if (local111 < 0) {
										local111 = 0;
									} else if (local111 >= super.anInt9395) {
										local111 = super.anInt9395;
									}
									while (local289 > local285) {
										while (local105 < local111) {
											super.aByteArrayArrayArray15[arg8][local285][local105] = 0;
											local105++;
										}
										local285++;
									}
								}
							} else if (local253 == 1) {
								if (super.aByteArrayArrayArray15[arg8] == null) {
									super.aByteArrayArrayArray15[arg8] = new byte[super.anInt9390 + 1][super.anInt9395 + 1];
								}
								for (local285 = 0; local285 < 64; local285 += 4) {
									for (local289 = 0; local289 < 64; local289 += 4) {
										@Pc(295) byte local295 = arg1.method8391();
										if (local55 <= arg5) {
											for (local111 = local285; local111 < local285 + 4; local111++) {
												for (local161 = local289; local161 < local289 + 4; local161++) {
													if (local25 <= local111 && local111 < local25 + 8 && local161 >= local31 && local31 + 8 > local31) {
														local179 = Static645.method8799(local161 & 0x7, local111 & 0x7, arg9) + arg2;
														@Pc(362) int local362 = Static231.method3392(local161 & 0x7, local111 & 0x7, arg9) + arg7;
														if (local179 >= 0 && super.anInt9390 > local179 && local362 >= 0 && super.anInt9395 > local362) {
															super.aByteArrayArrayArray15[arg8][local179][local362] = local295;
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
						arg1.anInt9901 += 10;
					} else {
						arg4[0] = arg1.method8363();
						arg4[1] = arg1.method8395();
						arg4[2] = arg1.method8395();
						arg4[3] = arg1.method8395();
						arg4[4] = arg1.method8363();
					}
				}
			}
			if (local13 != null) {
				Static364.method5251(arg2 >> 3, arg7 >> 3, local13);
			}
			if (super.aByteArrayArrayArray15 != null && super.aByteArrayArrayArray15[arg8] != null) {
				local36 = arg2 + 7;
				local55 = arg7 + 7;
				for (local62 = arg2; local62 < local36; local62++) {
					for (local285 = arg7; local285 < local55; local285++) {
						super.aByteArrayArrayArray15[arg8][local62][local285] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBIII)Lclient!oc;")
	public Interface18 method7927(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Interface18 local10 = null;
		if (arg3 == 0) {
			local10 = (Interface18) Static401.method5788(arg0, arg2, arg1);
		}
		if (arg3 == 1) {
			local10 = (Interface18) Static567.method7938(arg0, arg2, arg1);
		}
		if (arg3 == 2) {
			local10 = (Interface18) Static486.method7064(arg0, arg2, arg1, oc.class);
		}
		if (arg3 == 3) {
			local10 = (Interface18) Static82.method1398(arg0, arg2, arg1);
		}
		return local10;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([Lclient!sn;ZII[BLclient!ha;)V")
	public void method7929(@OriginalArg(0) Class324[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class132 arg4) {
		@Pc(10) Class6_Sub23 local10 = new Class6_Sub23(arg3);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local10.method8402();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(40) int local40 = 0;
			while (true) {
				@Pc(44) int local44 = local10.method8404();
				if (local44 == 0) {
					break;
				}
				local40 += local44 - 1;
				@Pc(56) int local56 = local40 & 0x3F;
				@Pc(62) int local62 = local40 >> 6 & 0x3F;
				@Pc(66) int local66 = local40 >> 12;
				@Pc(70) int local70 = local10.method8374();
				@Pc(74) int local74 = local70 >> 2;
				@Pc(78) int local78 = local70 & 0x3;
				@Pc(82) int local82 = arg2 + local62;
				@Pc(86) int local86 = arg1 + local56;
				if (local82 > 0 && local86 > 0 && local82 < super.anInt9390 - 1 && local86 < super.anInt9395 - 1) {
					@Pc(111) Class324 local111 = null;
					if (!super.aBoolean682) {
						@Pc(116) int local116 = local66;
						if ((Static90.aByteArrayArrayArray2[1][local82][local86] & 0x2) == 2) {
							local116 = local66 - 1;
						}
						if (local116 >= 0) {
							local111 = arg0[local116];
						}
					}
					this.method7930(local78, local66, -1, local66, local28, arg4, local82, local86, local111, local74);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIILclient!ha;IIILclient!sn;I)V")
	public void method7930(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class132 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class324 arg8, @OriginalArg(10) int arg9) {
		if (Static96.aClass6_Sub22_7.aClass29_Sub4_2.method1492() == 0 && !Static369.method5324(arg1, Static216.anInt3669, arg7, arg6)) {
			return;
		}
		if (this.anInt9408 > arg3) {
			this.anInt9408 = arg3;
		}
		@Pc(30) Class308 local30 = Static411.aClass88_3.method2024(arg4);
		if (Static96.aClass6_Sub22_7.aClass29_Sub12_1.method4082() == 0 && local30.aBoolean598) {
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg0 == 1 || arg0 == 3) {
			local53 = local30.anInt8589;
			local56 = local30.anInt8587;
		} else {
			local53 = local30.anInt8587;
			local56 = local30.anInt8589;
		}
		@Pc(72) int local72;
		@Pc(76) int local76;
		if (super.anInt9390 < local53 + arg6) {
			local72 = arg6;
			local76 = arg6 + 1;
		} else {
			local76 = arg6 + (local53 + 1 >> 1);
			local72 = (local53 >> 1) + arg6;
		}
		@Pc(105) int local105;
		@Pc(103) int local103;
		if (super.anInt9395 < local56 + arg7) {
			local103 = arg7 + 1;
			local105 = arg7;
		} else {
			local105 = (local56 >> 1) + arg7;
			local103 = (local56 + 1 >> 1) + arg7;
		}
		@Pc(125) Class12 local125 = Static289.aClass12Array3[arg1];
		@Pc(153) int local153 = local125.method7846(local72, local105) + local125.method7846(local76, local105) + local125.method7846(local72, local103) + local125.method7846(local76, local103) >> 2;
		@Pc(162) int local162 = (arg6 << 9) + (local53 << 8);
		@Pc(170) int local170 = (local56 << 8) + (arg7 << 9);
		@Pc(182) boolean local182 = Static346.aBoolean393 && !super.aBoolean682 && local30.aBoolean599;
		if (local30.method7293()) {
			Static513.method7270((Class2_Sub1_Sub1_Sub3_Sub2) null, local30, arg6, arg7, (Class2_Sub1_Sub1_Sub3_Sub1) null, arg0, arg3);
		}
		@Pc(219) boolean local219 = arg2 == -1 && local30.anInt8618 == -1 && local30.anIntArray568 == null && local30.anIntArray566 == null && !local30.aBoolean603 && !local30.aBoolean604;
		if (Static49.aBoolean53 && (Static289.method4159(arg9) && local30.anInt8567 != 1 || !(!Static40.method7251(arg9) || local30.anInt8567 != 0))) {
			return;
		}
		if (arg9 != 22) {
			@Pc(370) Class2_Sub1_Sub1 local370;
			@Pc(336) Class2_Sub1_Sub1_Sub5 local336;
			@Pc(374) int local374;
			@Pc(434) int local434;
			if (arg9 == 10 || arg9 == 11) {
				local336 = null;
				if (local219) {
					@Pc(366) Class2_Sub1_Sub1_Sub5 local366 = new Class2_Sub1_Sub1_Sub5(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg6, local53 + arg6 - 1, arg7, local56 + arg7 - 1, arg9, arg0, local182);
					local336 = local366;
					local370 = local366;
					local374 = local366.method8476();
				} else {
					local370 = new Class2_Sub1_Sub1_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg6, local53 + arg6 - 1, arg7, arg7 + local56 - 1, arg9, arg0, arg2);
					local374 = 15;
				}
				if (Static23.method582(local370, false)) {
					if (local336 != null && local336.method8474()) {
						local336.method8471(arg5);
					}
					if (local30.aBoolean597 && Static346.aBoolean393) {
						if (local374 > 30) {
							local374 = 30;
						}
						for (local434 = 0; local434 <= local53; local434++) {
							for (@Pc(438) int local438 = 0; local438 <= local56; local438++) {
								local125.ka(local434 + arg6, arg7 + local438, local374);
							}
						}
					}
				}
				if (local30.anInt8581 != 0 && arg8 != null) {
					arg8.method7778(!local30.aBoolean596, local56, arg6, local30.aBoolean602, local53, arg7);
				}
			} else if (arg9 >= 12 && arg9 <= 17 || arg9 >= 18 && arg9 <= 21) {
				if (local219) {
					local336 = new Class2_Sub1_Sub1_Sub5(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg6, local53 + arg6 - 1, arg7, arg7 + local56 - 1, arg9, arg0, local182);
					if (local336.method8474()) {
						local336.method8471(arg5);
					}
					local370 = local336;
				} else {
					local370 = new Class2_Sub1_Sub1_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg6, local53 + arg6 - 1, arg7, arg7 + local56 - 1, arg9, arg0, arg2);
				}
				Static23.method582(local370, false);
				if (Static346.aBoolean393 && !super.aBoolean682 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg3 > 0 && local30.anInt8567 != 0) {
					super.aByteArrayArrayArray16[arg3][arg6][arg7] = (byte) (super.aByteArrayArrayArray16[arg3][arg6][arg7] | 0x4);
				}
				if (local30.anInt8581 != 0 && arg8 != null) {
					arg8.method7778(!local30.aBoolean596, local56, arg6, local30.aBoolean602, local53, arg7);
				}
			} else {
				@Pc(679) Class2_Sub1_Sub2 local679;
				if (arg9 == 0) {
					@Pc(652) int local652 = local30.anInt8567;
					if (Static562.aBoolean681 && local30.anInt8567 == -1) {
						local652 = 1;
					}
					if (local219) {
						@Pc(697) Class2_Sub1_Sub2_Sub1 local697 = new Class2_Sub1_Sub2_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg9, arg0, local182);
						if (local697.method8474()) {
							local697.method8471(arg5);
						}
						local679 = local697;
					} else {
						local679 = new Class2_Sub1_Sub2_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg9, arg0, arg2);
					}
					Static358.method5185(arg3, arg6, arg7, local679, (Class2_Sub1_Sub2) null);
					if (arg0 == 0) {
						if (Static346.aBoolean393 && local30.aBoolean597) {
							local125.ka(arg6, arg7, 50);
							local125.ka(arg6, arg7 + 1, 50);
						}
						if (local652 == 1 && !super.aBoolean682) {
							Static586.method8116(1, arg6, local30.anInt8615, arg3, arg7, local30.anInt8572);
						}
					} else if (arg0 == 1) {
						if (Static346.aBoolean393 && local30.aBoolean597) {
							local125.ka(arg6, arg7 + 1, 50);
							local125.ka(arg6 + 1, arg7 - -1, 50);
						}
						if (local652 == 1 && !super.aBoolean682) {
							Static586.method8116(2, arg6, -local30.anInt8615, arg3, arg7 + 1, local30.anInt8572);
						}
					} else if (arg0 == 2) {
						if (Static346.aBoolean393 && local30.aBoolean597) {
							local125.ka(arg6 + 1, arg7, 50);
							local125.ka(arg6 + 1, arg7 + 1, 50);
						}
						if (local652 == 1 && !super.aBoolean682) {
							Static586.method8116(1, arg6 + 1, -local30.anInt8615, arg3, arg7, local30.anInt8572);
						}
					} else if (arg0 == 3) {
						if (Static346.aBoolean393 && local30.aBoolean597) {
							local125.ka(arg6, arg7, 50);
							local125.ka(arg6 + 1, arg7, 50);
						}
						if (local652 == 1 && !super.aBoolean682) {
							Static586.method8116(2, arg6, local30.anInt8615, arg3, arg7, local30.anInt8572);
						}
					}
					if (local30.anInt8581 != 0 && arg8 != null) {
						arg8.method7781(arg9, !local30.aBoolean596, arg7, local30.aBoolean602, arg0, arg6);
					}
					if (local30.anInt8579 != 64) {
						Static318.method4577(arg3, arg6, arg7, local30.anInt8579);
					}
				} else {
					@Pc(943) Class2_Sub1_Sub2 local943;
					@Pc(961) Class2_Sub1_Sub2_Sub1 local961;
					if (arg9 == 1) {
						if (local219) {
							local961 = new Class2_Sub1_Sub2_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg9, arg0, local182);
							local943 = local961;
							if (local961.method8474()) {
								local961.method8471(arg5);
							}
						} else {
							local943 = new Class2_Sub1_Sub2_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg9, arg0, arg2);
						}
						Static358.method5185(arg3, arg6, arg7, local943, (Class2_Sub1_Sub2) null);
						if (local30.aBoolean597 && Static346.aBoolean393) {
							if (arg0 == 0) {
								local125.ka(arg6, arg7 + 1, 50);
							} else if (arg0 == 1) {
								local125.ka(arg6 + 1, arg7 + 1, 50);
							} else if (arg0 == 2) {
								local125.ka(arg6 + 1, arg7, 50);
							} else if (arg0 == 3) {
								local125.ka(arg6, arg7, 50);
							}
						}
						if (local30.anInt8581 != 0 && arg8 != null) {
							arg8.method7781(arg9, !local30.aBoolean596, arg7, local30.aBoolean602, arg0, arg6);
						}
					} else if (arg9 == 2) {
						local374 = arg0 + 1 & 0x3;
						if (local219) {
							@Pc(1121) Class2_Sub1_Sub2_Sub1 local1121 = new Class2_Sub1_Sub2_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg9, arg0 + 4, local182);
							@Pc(1137) Class2_Sub1_Sub2_Sub1 local1137 = new Class2_Sub1_Sub2_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg9, local374, local182);
							if (local1121.method8474()) {
								local1121.method8471(arg5);
							}
							local679 = local1137;
							if (local1137.method8474()) {
								local1137.method8471(arg5);
							}
							local943 = local1121;
						} else {
							local943 = new Class2_Sub1_Sub2_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg9, arg0 + 4, arg2);
							local679 = new Class2_Sub1_Sub2_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg9, local374, arg2);
						}
						Static358.method5185(arg3, arg6, arg7, local943, local679);
						if ((local30.anInt8567 == 1 || Static562.aBoolean681 && local30.anInt8567 == -1) && !super.aBoolean682) {
							if (arg0 == 0) {
								Static586.method8116(1, arg6, local30.anInt8615, arg3, arg7, local30.anInt8572);
								Static586.method8116(2, arg6, local30.anInt8615, arg3, arg7 + 1, local30.anInt8572);
							} else if (arg0 == 1) {
								Static586.method8116(1, arg6 + 1, local30.anInt8615, arg3, arg7, local30.anInt8572);
								Static586.method8116(2, arg6, local30.anInt8615, arg3, arg7 + 1, local30.anInt8572);
							} else if (arg0 == 2) {
								Static586.method8116(1, arg6 + 1, local30.anInt8615, arg3, arg7, local30.anInt8572);
								Static586.method8116(2, arg6, local30.anInt8615, arg3, arg7, local30.anInt8572);
							} else if (arg0 == 3) {
								Static586.method8116(1, arg6, local30.anInt8615, arg3, arg7, local30.anInt8572);
								Static586.method8116(2, arg6, local30.anInt8615, arg3, arg7, local30.anInt8572);
							}
						}
						if (local30.anInt8581 != 0 && arg8 != null) {
							arg8.method7781(arg9, !local30.aBoolean596, arg7, local30.aBoolean602, arg0, arg6);
						}
						if (local30.anInt8579 != 64) {
							Static318.method4577(arg3, arg6, arg7, local30.anInt8579);
						}
					} else if (arg9 == 3) {
						if (local219) {
							local961 = new Class2_Sub1_Sub2_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg9, arg0, local182);
							local943 = local961;
							if (local961.method8474()) {
								local961.method8471(arg5);
							}
						} else {
							local943 = new Class2_Sub1_Sub2_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg9, arg0, arg2);
						}
						Static358.method5185(arg3, arg6, arg7, local943, (Class2_Sub1_Sub2) null);
						if (local30.aBoolean597 && Static346.aBoolean393) {
							if (arg0 == 0) {
								local125.ka(arg6, arg7 + 1, 50);
							} else if (arg0 == 1) {
								local125.ka(arg6 + 1, arg7 + 1, 50);
							} else if (arg0 == 2) {
								local125.ka(arg6 + 1, arg7, 50);
							} else if (arg0 == 3) {
								local125.ka(arg6, arg7, 50);
							}
						}
						if (local30.anInt8581 != 0 && arg8 != null) {
							arg8.method7781(arg9, !local30.aBoolean596, arg7, local30.aBoolean602, arg0, arg6);
						}
					} else if (arg9 == 9) {
						if (local219) {
							local336 = new Class2_Sub1_Sub1_Sub5(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg6, arg6, arg7, arg7, arg9, arg0, local182);
							local370 = local336;
							if (local336.method8474()) {
								local336.method8471(arg5);
							}
						} else {
							local370 = new Class2_Sub1_Sub1_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg6, arg6 + local53 - 1, arg7, local56 + arg7 - 1, arg9, arg0, arg2);
						}
						Static23.method582(local370, false);
						if (local30.anInt8567 == 1 && !super.aBoolean682) {
							@Pc(1539) byte local1539;
							if ((arg0 & 0x1) == 0) {
								local1539 = 8;
							} else {
								local1539 = 16;
							}
							Static586.method8116(local1539, arg6, 0, arg3, arg7, local30.anInt8572);
						}
						if (local30.anInt8581 != 0 && arg8 != null) {
							arg8.method7778(!local30.aBoolean596, local56, arg6, local30.aBoolean602, local53, arg7);
						}
						if (local30.anInt8579 != 64) {
							Static318.method4577(arg3, arg6, arg7, local30.anInt8579);
						}
					} else {
						@Pc(1615) Class2_Sub1_Sub4 local1615;
						if (arg9 == 4) {
							if (local219) {
								@Pc(1634) Class2_Sub1_Sub4_Sub2 local1634 = new Class2_Sub1_Sub4_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, 0, 0, arg9, arg0);
								local1615 = local1634;
								if (local1634.method8474()) {
									local1634.method8471(arg5);
								}
							} else {
								local1615 = new Class2_Sub1_Sub4_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, 0, 0, arg9, arg0, arg2);
							}
							Static262.method5237(arg3, arg6, arg7, local1615, (Class2_Sub1_Sub4) null);
						} else {
							@Pc(1658) int local1658;
							@Pc(1664) Interface18 local1664;
							@Pc(1705) Class2_Sub1_Sub4_Sub2 local1705;
							if (arg9 == 5) {
								local1658 = 65;
								local1664 = (Interface18) Static401.method5788(arg3, arg6, arg7);
								if (local1664 != null) {
									local1658 = Static411.aClass88_3.method2024(local1664.method8469()).anInt8579 + 1;
								}
								if (local219) {
									local1705 = new Class2_Sub1_Sub4_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, local1658 * Static274.anIntArray267[arg0], Static586.anIntArray648[arg0] * local1658, arg9, arg0);
									local1615 = local1705;
									if (local1705.method8474()) {
										local1705.method8471(arg5);
									}
								} else {
									local1615 = new Class2_Sub1_Sub4_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, Static274.anIntArray267[arg0] * local1658, local1658 * Static586.anIntArray648[arg0], arg9, arg0, arg2);
								}
								Static262.method5237(arg3, arg6, arg7, local1615, (Class2_Sub1_Sub4) null);
							} else if (arg9 == 6) {
								local1658 = 33;
								local1664 = (Interface18) Static401.method5788(arg3, arg6, arg7);
								if (local1664 != null) {
									local1658 = Static411.aClass88_3.method2024(local1664.method8469()).anInt8579 / 2 + 1;
								}
								if (local219) {
									local1705 = new Class2_Sub1_Sub4_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, local1658 * Static274.anIntArray267[arg0], Static586.anIntArray648[arg0] * local1658, arg9, arg0 + 4);
									local1615 = local1705;
									if (local1705.method8474()) {
										local1705.method8471(arg5);
									}
								} else {
									local1615 = new Class2_Sub1_Sub4_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, Static324.anIntArray327[arg0] * local1658, Static177.anIntArray163[arg0] * local1658, arg9, arg0 + 4, arg2);
								}
								Static262.method5237(arg3, arg6, arg7, local1615, (Class2_Sub1_Sub4) null);
							} else if (arg9 == 7) {
								local1658 = arg0 + 2 & 0x3;
								if (local219) {
									@Pc(1905) Class2_Sub1_Sub4_Sub2 local1905 = new Class2_Sub1_Sub4_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, 0, 0, arg9, local1658 + 4);
									if (local1905.method8474()) {
										local1905.method8471(arg5);
									}
									local1615 = local1905;
								} else {
									local1615 = new Class2_Sub1_Sub4_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, 0, 0, arg9, local1658 + 4, arg2);
								}
								Static262.method5237(arg3, arg6, arg7, local1615, (Class2_Sub1_Sub4) null);
							} else if (arg9 == 8) {
								local374 = arg0 + 2 & 0x3;
								local434 = 33;
								@Pc(1939) Interface18 local1939 = (Interface18) Static401.method5788(arg3, arg6, arg7);
								if (local1939 != null) {
									local434 = Static411.aClass88_3.method2024(local1939.method8469()).anInt8579 / 2 + 1;
								}
								@Pc(1985) Class2_Sub1_Sub4 local1985;
								@Pc(2007) Class2_Sub1_Sub4 local2007;
								if (local219) {
									local1985 = new Class2_Sub1_Sub4_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, Static324.anIntArray327[arg0] * local434, local434 * Static177.anIntArray163[arg0], arg9, arg0 + 4);
									local2007 = new Class2_Sub1_Sub4_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, 0, 0, arg9, local374 + 4);
									if (local1985.method8474()) {
										local1985.method8471(arg5);
									}
									if (local2007.method8474()) {
										local2007.method8471(arg5);
									}
								} else {
									local1985 = new Class2_Sub1_Sub4_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, Static324.anIntArray327[arg0] * local434, local434 * Static177.anIntArray163[arg0], arg9, arg0 + 4, arg2);
									local2007 = new Class2_Sub1_Sub4_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, 0, 0, arg9, local374 + 4, arg2);
								}
								Static262.method5237(arg3, arg6, arg7, local1985, local2007);
							}
						}
					}
				}
			}
		} else if (Static96.aClass6_Sub22_7.aClass29_Sub9_1.method2300() != 0 || local30.anInt8580 != 0 || local30.anInt8581 == 1 || local30.aBoolean607) {
			@Pc(278) Class2_Sub1_Sub3 local278;
			if (local219) {
				@Pc(295) Class2_Sub1_Sub3_Sub1 local295 = new Class2_Sub1_Sub3_Sub1(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg0, local182);
				local278 = local295;
				if (local295.method8474()) {
					local295.method8471(arg5);
				}
			} else {
				local278 = new Class2_Sub1_Sub3_Sub2(arg5, local30, arg3, arg1, local162, local153, local170, super.aBoolean682, arg0, arg2);
			}
			Static100.method1652(arg3, arg6, arg7, local278);
			if (local30.anInt8581 == 1 && arg8 != null) {
				arg8.method7780(arg6, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIILclient!sn;Lclient!ha;I)V")
	public void method7931(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class324 arg4, @OriginalArg(5) Class132 arg5) {
		@Pc(16) Interface18 local16 = this.method7927(arg0, arg1, arg3, arg2);
		if (local16 == null) {
			return;
		}
		@Pc(27) Class308 local27 = Static411.aClass88_3.method2024(local16.method8469());
		@Pc(31) int local31 = local16.method8473();
		@Pc(35) int local35 = local16.method8472();
		if (local27.method7293()) {
			Static150.method2159(arg3, local27, arg0, arg1);
		}
		if (local16.method8474()) {
			local16.method8470(arg5);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				Static509.method7242(arg0, arg3, arg1);
				return;
			}
			if (arg2 == 2) {
				Static397.method5729(arg0, arg3, arg1, oc.class);
				if (local27.anInt8581 != 0 && super.anInt9390 > arg3 + local27.anInt8587 && arg1 + local27.anInt8587 < super.anInt9395 && local27.anInt8589 + arg3 < super.anInt9390 && local27.anInt8589 + arg1 < super.anInt9395) {
					arg4.method7789(arg3, arg1, local27.anInt8587, local27.anInt8589, local27.aBoolean602, local35, !local27.aBoolean596);
				}
				if (local31 == 9) {
					if ((local35 & 0x1) != 0) {
						Static541.method5286(arg0, 16, arg3, arg1);
						return;
					}
					Static541.method5286(arg0, 8, arg3, arg1);
					return;
				}
			} else if (arg2 == 3) {
				Static481.method7020(arg0, arg3, arg1);
				if (local27.anInt8581 != 1) {
					return;
				}
				arg4.method7785(arg1, arg3);
			} else {
				return;
			}
			return;
		}
		Static387.method5523(arg0, arg3, arg1);
		if (local27.anInt8581 != 0) {
			arg4.method7774(arg3, local27.aBoolean602, local31, local35, !local27.aBoolean596, arg1);
		}
		if (local27.anInt8567 != 1) {
			return;
		}
		if (local35 == 0) {
			Static541.method5286(arg0, 1, arg3, arg1);
			return;
		}
		if (local35 == 1) {
			Static541.method5286(arg0, 2, arg3, arg1 + 1);
		} else if (local35 == 2) {
			Static541.method5286(arg0, 1, arg3 + 1, arg1);
			return;
		} else if (local35 == 3) {
			Static541.method5286(arg0, 2, arg3, arg1);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZILclient!ha;III[BI[Lclient!sn;I)V")
	public void method7932(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class132 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) byte[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class324[] arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class6_Sub23 local10 = new Class6_Sub23(arg6);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method8402();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local10.method8404();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local10.method8374();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (local55 == arg7 && local51 >= arg3 && arg3 + 8 > local51 && local45 >= arg0 && local45 < arg0 + 8) {
					@Pc(99) Class308 local99 = Static411.aClass88_3.method2024(local17);
					@Pc(116) int local116 = Static430.method8460(local51 & 0x7, local99.anInt8587, local99.anInt8589, local67, local45 & 0x7, arg1) + arg4;
					@Pc(133) int local133 = Static200.method2917(local51 & 0x7, local99.anInt8589, arg1, local99.anInt8587, local45 & 0x7, local67) + arg5;
					if (local116 > 0 && local133 > 0 && local116 < super.anInt9390 - 1 && local133 < super.anInt9395 - 1) {
						@Pc(151) Class324 local151 = null;
						if (!super.aBoolean682) {
							@Pc(156) int local156 = arg9;
							if ((Static90.aByteArrayArrayArray2[1][local116][local133] & 0x2) == 2) {
								local156 = arg9 - 1;
							}
							if (local156 >= 0) {
								local151 = arg8[local156];
							}
						}
						this.method7930(arg1 + local67 & 0x3, arg9, -1, arg9, local17, arg2, local116, local133, local151, local63);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!ha;ZB)V")
	public void method7934(@OriginalArg(0) Class132 arg0, @OriginalArg(1) boolean arg1) {
		Static377.method5352();
		if (!arg1) {
			@Pc(22) int local22;
			@Pc(26) int local26;
			if (super.anInt9399 > 1) {
				for (local22 = 0; local22 < super.anInt9390; local22++) {
					for (local26 = 0; local26 < super.anInt9395; local26++) {
						if ((Static90.aByteArrayArrayArray2[1][local22][local26] & 0x2) == 2) {
							Static425.method6300(local22, local26);
						}
					}
				}
			}
			for (local22 = 0; super.anInt9399 > local22; local22++) {
				for (local26 = 0; local26 <= super.anInt9395; local26++) {
					for (@Pc(72) int local72 = 0; super.anInt9390 >= local72; local72++) {
						if ((super.aByteArrayArrayArray16[local22][local72][local26] & 0x4) != 0) {
							@Pc(87) int local87 = local72;
							@Pc(89) int local89 = local72;
							@Pc(91) int local91 = local26;
							@Pc(93) int local93 = local26;
							while (local91 > 0 && (super.aByteArrayArrayArray16[local22][local72][local91 - 1] & 0x4) != 0 && local26 - local91 < 10) {
								local91--;
							}
							while (super.anInt9395 > local93 && (super.aByteArrayArrayArray16[local22][local72][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(155) int local155;
							label111: while (local87 > 0 && local72 - local87 < 10) {
								for (local155 = local91; local155 <= local93; local155++) {
									if ((super.aByteArrayArrayArray16[local22][local87 - 1][local155] & 0x4) == 0) {
										break label111;
									}
								}
								local87--;
							}
							label98: while (super.anInt9390 > local89 && local89 - local87 < 10) {
								for (local155 = local91; local155 <= local93; local155++) {
									if ((super.aByteArrayArrayArray16[local22][local89 + 1][local155] & 0x4) == 0) {
										break label98;
									}
								}
								local89++;
							}
							if ((local89 + 1 - local87) * (local93 + (1 - local91)) >= 4) {
								local155 = super.anIntArrayArrayArray20[local22][local87][local91];
								Static401.method5791(local155, (local89 << 9) + 512, (local93 << 9) + 512, local91 << 9, local22, local87 << 9, local155);
								for (@Pc(283) int local283 = local87; local283 <= local89; local283++) {
									for (@Pc(287) int local287 = local91; local287 <= local93; local287++) {
										super.aByteArrayArrayArray16[local22][local283][local287] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static589.method8148();
		}
		super.aByteArrayArrayArray16 = null;
	}
}
