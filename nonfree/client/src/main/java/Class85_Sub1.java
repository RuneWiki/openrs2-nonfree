import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fda")
public final class Class85_Sub1 extends Class85 {

	@OriginalMember(owner = "client!fda", name = "F", descriptor = "I")
	public int anInt2729 = 99;

	static {
		new Class91("", 73);
	}

	@OriginalMember(owner = "client!fda", name = "<init>", descriptor = "(IIIZ)V")
	public Class85_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static68.aClass233_2, Static236.aClass58_3);
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "([IIBILclient!oa;Lclient!rt;)V")
	public void method2290(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class5 arg3, @OriginalArg(5) Class3_Sub27 arg4) {
		if (super.aBoolean202) {
			return;
		}
		@Pc(23) boolean local23 = false;
		@Pc(25) Class92 local25 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(36) int local36;
						@Pc(63) int local63;
						@Pc(513) int local513;
						@Pc(81) int local81;
						@Pc(85) int local85;
						while (arg4.anInt9191 < arg4.aByteArray114.length) {
							local36 = arg4.method7548();
							if (local36 == 0) {
								local25 = new Class92(arg4);
							} else {
								@Pc(87) int local87;
								@Pc(111) int local111;
								@Pc(375) int local375;
								if (local36 == 1) {
									local63 = arg4.method7548();
									if (local63 > 0) {
										for (local513 = 0; local513 < local63; local513++) {
											@Pc(522) Class103 local522 = new Class103(arg3, arg4, 2);
											if (local522.anInt3138 == 31) {
												@Pc(533) Class28 local533 = Static92.aClass316_1.method7632(arg4.method7591());
												local522.method2645(local533.anInt874, local533.anInt876, local533.anInt873, local533.anInt877);
											}
											if (arg3.method7479() > 0) {
												@Pc(550) Class3_Sub30 local550 = local522.aClass3_Sub30_1;
												local87 = local550.method5386() + (arg1 << 9);
												local111 = (arg2 << 9) + local550.method5388();
												local375 = local87 >> 9;
												@Pc(575) int local575 = local111 >> 9;
												if (local375 >= 0 && local575 >= 0 && super.anInt2712 > local375 && super.anInt2714 > local575) {
													local550.method5385(local87, local111, super.anIntArrayArrayArray6[local522.anInt3141][local375][local575] - local550.method5390());
													Static171.method3263(local522);
												}
											}
										}
									}
								} else if (local36 == 2) {
									if (local25 == null) {
										local25 = new Class92();
									}
									local25.method2463(arg4);
								} else if (local36 != 128) {
									if (local36 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray11 == null) {
										super.aByteArrayArrayArray11 = new byte[4][][];
									}
									local23 = true;
									for (local63 = 0; local63 < 4; local63++) {
										@Pc(69) byte local69 = arg4.method7584();
										if (local69 == 0 && super.aByteArrayArrayArray11[local63] != null) {
											local81 = arg1;
											local85 = arg1 + 64;
											local87 = arg2;
											if (local85 < 0) {
												local85 = 0;
											} else if (local85 >= super.anInt2712) {
												local85 = super.anInt2712;
											}
											local111 = arg2 + 64;
											if (arg1 < 0) {
												local81 = 0;
											} else if (arg1 >= super.anInt2712) {
												local81 = super.anInt2712;
											}
											if (arg2 < 0) {
												local87 = 0;
											} else if (arg2 >= super.anInt2714) {
												local87 = super.anInt2714;
											}
											if (local111 < 0) {
												local111 = 0;
											} else if (local111 >= super.anInt2714) {
												local111 = super.anInt2714;
											}
											while (local85 > local81) {
												while (local111 > local87) {
													super.aByteArrayArrayArray11[local63][local81][local87] = 0;
													local87++;
												}
												local81++;
											}
										} else if (local69 == 1) {
											if (super.aByteArrayArrayArray11[local63] == null) {
												super.aByteArrayArrayArray11[local63] = new byte[super.anInt2712 + 1][super.anInt2714 + 1];
											}
											for (local81 = 0; local81 < 64; local81 += 4) {
												for (local85 = 0; local85 < 64; local85 += 4) {
													@Pc(365) byte local365 = arg4.method7584();
													for (local111 = local81 + arg1; local111 < arg1 + local81 + 4; local111++) {
														for (local375 = arg2 + local85; local375 < local85 + arg2 + 4; local375++) {
															if (local111 >= 0 && local111 < super.anInt2712 && local375 >= 0 && local375 < super.anInt2714) {
																super.aByteArrayArrayArray11[local63][local111][local375] = local365;
															}
														}
													}
												}
											}
										} else if (local69 == 2) {
											if (super.aByteArrayArrayArray11[local63] == null) {
												super.aByteArrayArrayArray11[local63] = new byte[super.anInt2712 + 1][super.anInt2714 + 1];
											}
											if (local63 > 0) {
												local81 = arg1;
												local85 = arg1 + 64;
												local87 = arg2;
												if (arg1 < 0) {
													local81 = 0;
												} else if (arg1 >= super.anInt2712) {
													local81 = super.anInt2712;
												}
												if (arg2 < 0) {
													local87 = 0;
												} else if (super.anInt2714 <= arg2) {
													local87 = super.anInt2714;
												}
												local111 = arg2 + 64;
												if (local85 < 0) {
													local85 = 0;
												} else if (local85 >= super.anInt2712) {
													local85 = super.anInt2712;
												}
												if (local111 < 0) {
													local111 = 0;
												} else if (local111 >= super.anInt2714) {
													local111 = super.anInt2714;
												}
												while (local85 > local81) {
													while (local87 < local111) {
														super.aByteArrayArrayArray11[local63][local81][local87] = super.aByteArrayArrayArray11[local63 - 1][local81][local87];
														local87++;
													}
													local81++;
												}
											}
										}
									}
								} else if (arg0 == null) {
									arg4.anInt9191 += 10;
								} else {
									arg0[0] = arg4.method7591();
									arg0[1] = arg4.method7604();
									arg0[2] = arg4.method7604();
									arg0[3] = arg4.method7604();
									arg0[4] = arg4.method7591();
								}
							}
						}
						if (local25 != null) {
							for (local36 = 0; local36 < 8; local36++) {
								for (local63 = 0; local63 < 8; local63++) {
									local513 = (arg1 >> 3) + local36;
									local81 = (arg2 >> 3) + local63;
									if (local513 >= 0 && local513 < super.anInt2712 >> 3 && local81 >= 0 && local81 < super.anInt2714 >> 3) {
										Static471.method7029(local81, local513, local25);
									}
								}
							}
						}
						if (!local23 && super.aByteArrayArrayArray11 != null) {
							for (local36 = 0; local36 < 4; local36++) {
								if (super.aByteArrayArrayArray11[local36] != null) {
									for (local63 = 0; local63 < 16; local63++) {
										for (local513 = 0; local513 < 16; local513++) {
											local81 = (arg1 >> 2) + local63;
											local85 = local513 + (arg2 >> 2);
											if (local81 >= 0 && local81 < 26 && local85 >= 0 && local85 < 26) {
												super.aByteArrayArrayArray11[local36][local81][local85] = 0;
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
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!oa;I)V")
	public void method2291(@OriginalArg(0) Class5 arg0) {
		Static416.method1069(arg0);
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (super.anInt2722 > 1) {
			for (local21 = 0; super.anInt2712 > local21; local21++) {
				for (local25 = 0; super.anInt2714 > local25; local25++) {
					if ((Static232.aByteArrayArrayArray18[1][local21][local25] & 0x2) == 2) {
						Static422.method7130(local21, local25);
					}
				}
			}
		}
		for (local21 = 0; local21 < super.anInt2722; local21++) {
			for (local25 = 0; local25 <= super.anInt2714; local25++) {
				for (@Pc(65) int local65 = 0; local65 <= super.anInt2712; local65++) {
					@Pc(80) int local80;
					@Pc(82) int local82;
					@Pc(84) int local84;
					@Pc(86) int local86;
					@Pc(132) int local132;
					@Pc(230) int local230;
					@Pc(239) int local239;
					@Pc(259) int local259;
					@Pc(263) int local263;
					if ((super.aByteArrayArrayArray13[local21][local65][local25] & 0x1) != 0) {
						local80 = local25;
						local82 = local25;
						local84 = local21;
						local86 = local21;
						while (super.anInt2714 > local82 && (super.aByteArrayArrayArray13[local21][local65][local82 + 1] & 0x1) != 0) {
							local82++;
						}
						while (local80 > 0 && (super.aByteArrayArrayArray13[local21][local65][local80 - 1] & 0x1) != 0) {
							local80--;
						}
						label164: while (local84 > 0) {
							for (local132 = local80; local132 <= local82; local132++) {
								if ((super.aByteArrayArrayArray13[local84 - 1][local65][local132] & 0x1) == 0) {
									break label164;
								}
							}
							local84--;
						}
						label153: while (local86 < 3) {
							for (local132 = local80; local132 <= local82; local132++) {
								if ((super.aByteArrayArrayArray13[local86 + 1][local65][local132] & 0x1) == 0) {
									break label153;
								}
							}
							local86++;
						}
						local132 = (local82 + 1 - local80) * (local86 + 1 - local84);
						if (local132 >= 2) {
							local230 = super.anIntArrayArrayArray6[local86][local65][local80] - 960;
							local239 = super.anIntArrayArrayArray6[local84][local65][local80];
							Static294.method4932(1, local65 << 9, local65 << 9, local80 << 9, (local82 << 9) + 512, local230, local239);
							for (local259 = local84; local259 <= local86; local259++) {
								for (local263 = local80; local263 <= local82; local263++) {
									super.aByteArrayArrayArray13[local259][local65][local263] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray13[local21][local65][local25] & 0x2) != 0) {
						local80 = local65;
						local82 = local65;
						local84 = local21;
						while (super.anInt2712 > local82 && (super.aByteArrayArrayArray13[local21][local82 + 1][local25] & 0x2) != 0) {
							local82++;
						}
						local86 = local21;
						while (local80 > 0 && (super.aByteArrayArrayArray13[local21][local80 - 1][local25] & 0x2) != 0) {
							local80--;
						}
						label217: while (local84 > 0) {
							for (local132 = local80; local132 <= local82; local132++) {
								if ((super.aByteArrayArrayArray13[local84 - 1][local132][local25] & 0x2) == 0) {
									break label217;
								}
							}
							local84--;
						}
						label206: while (local86 < 3) {
							for (local132 = local80; local132 <= local82; local132++) {
								if ((super.aByteArrayArrayArray13[local86 + 1][local132][local25] & 0x2) == 0) {
									break label206;
								}
							}
							local86++;
						}
						local132 = (local86 + 1 - local84) * (local82 + 1 - local80);
						if (local132 >= 2) {
							local230 = super.anIntArrayArrayArray6[local86][local80][local25] - 960;
							local239 = super.anIntArrayArrayArray6[local84][local80][local25];
							Static294.method4932(2, local80 << 9, (local82 << 9) + 512, local25 << 9, local25 << 9, local230, local239);
							for (local259 = local84; local259 <= local86; local259++) {
								for (local263 = local80; local263 <= local82; local263++) {
									super.aByteArrayArrayArray13[local259][local263][local25] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray13[local21][local65][local25] & 0x4) != 0) {
						local80 = local65;
						local82 = local65;
						for (local84 = local25; local84 > 0 && (super.aByteArrayArrayArray13[local21][local65][local84 - 1] & 0x4) != 0; local84--) {
						}
						for (local86 = local25; super.anInt2714 > local86 && (super.aByteArrayArrayArray13[local21][local65][local86 + 1] & 0x4) != 0; local86++) {
						}
						label271: while (local80 > 0) {
							for (local132 = local84; local132 <= local86; local132++) {
								if ((super.aByteArrayArrayArray13[local21][local80 - 1][local132] & 0x4) == 0) {
									break label271;
								}
							}
							local80--;
						}
						label260: while (super.anInt2712 > local82) {
							for (local132 = local84; local132 <= local86; local132++) {
								if ((super.aByteArrayArrayArray13[local21][local82 + 1][local132] & 0x4) == 0) {
									break label260;
								}
							}
							local82++;
						}
						if ((local82 + 1 - local80) * (local86 + -local84 - -1) >= 4) {
							local132 = super.anIntArrayArrayArray6[local21][local80][local84];
							Static294.method4932(4, local80 << 9, (local82 << 9) + 512, local84 << 9, (local86 << 9) + 512, local132, local132);
							for (@Pc(713) int local713 = local80; local713 <= local82; local713++) {
								for (local230 = local84; local230 <= local86; local230++) {
									super.aByteArrayArrayArray13[local21][local713][local230] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IZ[ILclient!oa;IILclient!rt;IIII)V")
	public void method2292(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) Class5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class3_Sub27 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean202) {
			return;
		}
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(19) Class92 local19 = null;
		@Pc(25) int local25 = (arg9 & 0x7) * 8;
		@Pc(31) int local31 = (arg6 & 0x7) * 8;
		while (true) {
			@Pc(48) int local48;
			@Pc(106) int local106;
			@Pc(156) int local156;
			@Pc(182) int local182;
			@Pc(52) int local52;
			@Pc(100) int local100;
			label233: do {
				while (true) {
					@Pc(36) int local36;
					@Pc(346) int local346;
					while (arg5.anInt9191 < arg5.aByteArray114.length) {
						local36 = arg5.method7548();
						if (local36 == 0) {
							local19 = new Class92(arg5);
						} else {
							if (local36 == 1) {
								local48 = arg5.method7548();
								continue label233;
							}
							if (local36 == 2) {
								if (local19 == null) {
									local19 = new Class92();
								}
								local19.method2463(arg5);
							} else if (local36 != 128) {
								if (local36 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray11 == null) {
									super.aByteArrayArrayArray11 = new byte[4][][];
								}
								for (local48 = 0; local48 < 4; local48++) {
									@Pc(311) byte local311 = arg5.method7584();
									@Pc(350) int local350;
									if (local311 == 0 && super.aByteArrayArrayArray11[arg4] != null) {
										if (local48 <= arg3) {
											local346 = arg0;
											local350 = arg0 + 7;
											local100 = arg8;
											local106 = arg8 + 7;
											if (arg8 < 0) {
												local100 = 0;
											} else if (arg8 >= super.anInt2714) {
												local100 = super.anInt2714;
											}
											if (arg0 < 0) {
												local346 = 0;
											} else if (super.anInt2712 <= arg0) {
												local346 = super.anInt2712;
											}
											if (local350 < 0) {
												local350 = 0;
											} else if (local350 >= super.anInt2712) {
												local350 = super.anInt2712;
											}
											if (local106 < 0) {
												local106 = 0;
											} else if (super.anInt2714 <= local106) {
												local106 = super.anInt2714;
											}
											while (local350 > local346) {
												while (local106 > local100) {
													super.aByteArrayArrayArray11[arg4][local346][local100] = 0;
													local100++;
												}
												local346++;
											}
										}
									} else if (local311 == 1) {
										if (super.aByteArrayArrayArray11[arg4] == null) {
											super.aByteArrayArrayArray11[arg4] = new byte[super.anInt2712 + 1][super.anInt2714 + 1];
										}
										for (local346 = 0; local346 < 64; local346 += 4) {
											for (local350 = 0; local350 < 64; local350 += 4) {
												@Pc(356) byte local356 = arg5.method7584();
												if (arg3 >= local48) {
													for (local106 = local346; local106 < local346 + 4; local106++) {
														for (local156 = local350; local156 < local350 + 4; local156++) {
															if (local25 <= local106 && local106 < local25 + 8 && local156 >= local31 && local31 < local31 + 8) {
																local182 = arg0 + Static356.method5588(local106 & 0x7, local156 & 0x7, arg7);
																@Pc(411) int local411 = arg8 + Static239.method4179(arg7, local106 & 0x7, local156 & 0x7);
																if (local182 >= 0 && local182 < super.anInt2712 && local411 >= 0 && local411 < super.anInt2714) {
																	super.aByteArrayArrayArray11[arg4][local182][local411] = local356;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg1 == null) {
								arg5.anInt9191 += 10;
							} else {
								arg1[0] = arg5.method7591();
								arg1[1] = arg5.method7604();
								arg1[2] = arg5.method7604();
								arg1[3] = arg5.method7604();
								arg1[4] = arg5.method7591();
							}
						}
					}
					if (local19 != null) {
						Static471.method7029(arg8 >> 3, arg0 >> 3, local19);
					}
					if (super.aByteArrayArrayArray11 != null && super.aByteArrayArrayArray11[arg4] != null) {
						local36 = arg0 + 7;
						local48 = arg8 + 7;
						for (local52 = arg0; local52 < local36; local52++) {
							for (local346 = arg8; local346 < local48; local346++) {
								super.aByteArrayArrayArray11[arg4][local52][local346] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local48 <= 0);
			for (local52 = 0; local52 < local48; local52++) {
				@Pc(61) Class103 local61 = new Class103(arg2, arg5, 2);
				if (local61.anInt3138 == 31) {
					@Pc(74) Class28 local74 = Static92.aClass316_1.method7632(arg5.method7591());
					local61.method2645(local74.anInt874, local74.anInt876, local74.anInt873, local74.anInt877);
				}
				if (arg2.method7479() > 0) {
					@Pc(94) Class3_Sub30 local94 = local61.aClass3_Sub30_1;
					local100 = local94.method5386() >> 9;
					local106 = local94.method5388() >> 9;
					if (local61.anInt3141 == arg3 && local100 >= local25 && local100 < local25 + 8 && local106 >= local31 && local106 < local31 + 8) {
						local156 = Static383.method4807(local94.method5386() & 0xFFF, local94.method5388() & 0xFFF, arg7) + (arg0 << 9);
						local100 = local156 >> 9;
						local182 = Static490.method7170(local94.method5386() & 0xFFF, local94.method5388() & 0xFFF, arg7) + (arg8 << 9);
						local106 = local182 >> 9;
						if (local100 >= 0 && local106 >= 0 && local100 < super.anInt2712 && local106 < super.anInt2714) {
							local94.method5385(local156, local182, super.anIntArrayArrayArray6[arg3][local100][local106] - local94.method5390());
							Static171.method3263(local61);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!oa;Lclient!vi;IIIII)V")
	public void method2294(@OriginalArg(0) Class5 arg0, @OriginalArg(1) Class306 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface15 local7 = null;
		if (arg5 == 0) {
			local7 = (Interface15) Static542.method7740(arg3, arg4, arg2);
		}
		if (arg5 == 1) {
			local7 = (Interface15) Static183.method4959(arg3, arg4, arg2);
		}
		if (arg5 == 2) {
			local7 = (Interface15) Static420.method6482(arg3, arg4, arg2, qn.class);
		}
		if (arg5 == 3) {
			local7 = (Interface15) Static72.method1464(arg3, arg4, arg2);
		}
		if (local7 == null) {
			return;
		}
		@Pc(61) Class242 local61 = Static454.aClass298_3.method7185(local7.method7758());
		@Pc(65) int local65 = local7.method7761();
		@Pc(69) int local69 = local7.method7764();
		if (local61.method5989()) {
			Static362.method5702(arg3, local61, arg4, arg2);
		}
		if (local7.method7757()) {
			local7.method7759(arg0);
		}
		if (arg5 != 0) {
			if (arg5 == 1) {
				@Pc(100) Class6_Sub4 local100 = Static183.method4959(arg3, arg4, arg2);
				if (local100 instanceof Class6_Sub4_Sub2) {
					((Class6_Sub4_Sub2) local100).aClass6_Sub4_1 = null;
					return;
				}
				Static488.method7162(arg3, arg4, arg2);
				return;
			}
			if (arg5 == 2) {
				@Pc(160) Class6_Sub1 local160 = Static420.method6482(arg3, arg4, arg2, qn.class);
				if (local160 instanceof Class6_Sub1_Sub4 && arg4 == local160.aShort123 && arg2 == local160.aShort120) {
					((Class6_Sub1_Sub4) local160).aClass6_Sub1_2 = null;
				} else {
					Static146.method2510(arg3, arg4, arg2, qn.class);
				}
				if (local61.anInt7176 == 0 || super.anInt2712 <= arg4 + local61.anInt7195 || local61.anInt7195 + arg2 >= super.anInt2714 || arg4 + local61.anInt7193 >= super.anInt2712 || super.anInt2714 <= arg2 + local61.anInt7193) {
					return;
				}
				arg1.method7359(local61.anInt7193, local69, local61.anInt7195, !local61.aBoolean484, arg2, arg4, local61.aBoolean478);
			} else if (arg5 == 3) {
				@Pc(124) Class6_Sub3 local124 = Static72.method1464(arg3, arg4, arg2);
				if (local124 instanceof Class6_Sub3_Sub1) {
					((Class6_Sub3_Sub1) local124).aClass6_Sub3_1 = null;
				} else {
					Static509.method7293(arg3, arg4, arg2);
				}
				if (local61.anInt7176 == 1) {
					arg1.method7370(arg2, arg4);
					return;
				}
			}
			return;
		}
		@Pc(264) Class6_Sub2 local264 = Static542.method7740(arg3, arg4, arg2);
		if (local264 instanceof Class6_Sub2_Sub1) {
			((Class6_Sub2_Sub1) local264).aClass6_Sub2_1 = null;
		} else {
			Static296.method4950(arg3, arg4, arg2);
		}
		if (local61.anInt7176 != 0) {
			arg1.method7360(arg4, local61.aBoolean478, arg2, local69, local65, !local61.aBoolean484);
			return;
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!oa;I[Lclient!vi;I[BI)V")
	public void method2297(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class306[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class3_Sub27 local10 = new Class3_Sub27(arg3);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method7601();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local10.method7547();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local10.method7548();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(71) int local71 = arg2 + local51;
				@Pc(75) int local75 = arg4 + local45;
				if (local71 > 0 && local75 > 0 && local71 < super.anInt2712 - 1 && super.anInt2714 - 1 > local75) {
					@Pc(107) Class306 local107 = null;
					if (!super.aBoolean202) {
						@Pc(112) int local112 = local55;
						if ((Static232.aByteArrayArrayArray18[1][local71][local75] & 0x2) == 2) {
							local112 = local55 - 1;
						}
						if (local112 >= 0) {
							local107 = arg1[local112];
						}
					}
					this.method2299(arg0, local55, -1, local17, local63, local75, local71, local67, local107, local55);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(IIZ[Lclient!vi;IIII[BILclient!oa;)V")
	public void method2298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class306[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class5 arg9) {
		@Pc(14) Class3_Sub27 local14 = new Class3_Sub27(arg7);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method7601();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method7547();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local14.method7548();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				if (arg8 == local57 && arg6 <= local53 && arg6 + 8 > local53 && arg3 <= local47 && arg3 + 8 > local47) {
					@Pc(97) Class242 local97 = Static454.aClass298_3.method7185(local16);
					@Pc(114) int local114 = Static172.method3280(local53 & 0x7, arg0, local97.anInt7193, local47 & 0x7, local69, local97.anInt7195) + arg1;
					@Pc(131) int local131 = arg5 + Static223.method4044(arg0, local97.anInt7193, local47 & 0x7, local53 & 0x7, local69, local97.anInt7195);
					if (local114 > 0 && local131 > 0 && super.anInt2712 - 1 > local114 && local131 < super.anInt2714 - 1) {
						@Pc(156) Class306 local156 = null;
						if (!super.aBoolean202) {
							@Pc(161) int local161 = arg4;
							if ((Static232.aByteArrayArrayArray18[1][local114][local131] & 0x2) == 2) {
								local161 = arg4 - 1;
							}
							if (local161 >= 0) {
								local156 = arg2[local161];
							}
						}
						this.method2299(arg9, arg4, -1, local16, local65, local131, local114, local69 + arg0 & 0x3, local156, arg4);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fda", name = "a", descriptor = "(Lclient!oa;IIIIIIIILclient!vi;I)V")
	public void method2299(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class306 arg8, @OriginalArg(10) int arg9) {
		if (!Static7.aClass3_Sub15_Sub1_1.method6954(Static382.anInt7091) && !Static151.method2599(arg6, arg5, Static445.anInt8174, arg1)) {
			return;
		}
		if (this.anInt2729 > arg9) {
			this.anInt2729 = arg9;
		}
		@Pc(38) Class242 local38 = Static454.aClass298_3.method7185(arg3);
		if (arg0.method7421() && Static7.aClass3_Sub15_Sub1_1.aBoolean602 && local38.aBoolean477) {
			return;
		}
		@Pc(59) int local59;
		@Pc(62) int local62;
		if (arg7 == 1 || arg7 == 3) {
			local59 = local38.anInt7193;
			local62 = local38.anInt7195;
		} else {
			local59 = local38.anInt7195;
			local62 = local38.anInt7193;
		}
		@Pc(83) int local83;
		@Pc(87) int local87;
		if (arg6 + local59 > super.anInt2712) {
			local83 = arg6;
			local87 = arg6 + 1;
		} else {
			local83 = (local59 >> 1) + arg6;
			local87 = (local59 + 1 >> 1) + arg6;
		}
		@Pc(115) int local115;
		@Pc(119) int local119;
		if (local62 + arg5 > super.anInt2714) {
			local115 = arg5;
			local119 = arg5 + 1;
		} else {
			local119 = arg5 + (local62 + 1 >> 1);
			local115 = arg5 + (local62 >> 1);
		}
		@Pc(140) Class52 local140 = Static511.aClass52Array3[arg1];
		@Pc(162) int local162 = local140.JA(local83, local115) + local140.JA(local87, local115) + local140.JA(local83, local119) + local140.JA(local87, local119) >> 2;
		@Pc(170) int local170 = (arg6 << 9) + (local59 << 8);
		@Pc(179) int local179 = (arg5 << 9) + (local62 << 8);
		@Pc(191) boolean local191 = Static485.aBoolean644 && !super.aBoolean202 && local38.aBoolean482;
		if (local38.method5989()) {
			Static100.method1935(arg9, local38, arg6, arg5, arg7, null, null);
		}
		@Pc(228) boolean local228 = arg2 == -1 && local38.anInt7183 == -1 && local38.anIntArray633 == null && local38.anIntArray632 == null && !local38.aBoolean487;
		if (Static160.aBoolean278 && (Static533.method5631(arg4) && local38.anInt7163 != 1 || !(!Static29.method807(arg4) || local38.anInt7163 != 0))) {
			return;
		}
		if (arg4 != 22) {
			@Pc(392) Class6_Sub1 local392;
			@Pc(354) Class6_Sub1_Sub5 local354;
			@Pc(388) int local388;
			if (arg4 == 10 || arg4 == 11) {
				local354 = null;
				if (local228) {
					@Pc(384) Class6_Sub1_Sub5 local384 = new Class6_Sub1_Sub5(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg6, arg6 + local59 - 1, arg5, local62 + arg5 - 1, arg4, arg7, local191);
					local388 = local384.method5323();
					local354 = local384;
					local392 = local384;
				} else {
					local388 = 15;
					local392 = new Class6_Sub1_Sub6(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg6, arg6 + local59 - 1, arg5, local62 + arg5 - 1, arg4, arg7, arg2);
				}
				@Pc(437) Class6_Sub1 local437 = Static420.method6482(arg9, arg6, arg5, qn.class);
				@Pc(439) boolean local439 = false;
				if (local437 instanceof Class6_Sub1_Sub4 && arg6 == local437.aShort123 && local437.aShort120 == arg5) {
					((Class6_Sub1_Sub4) local437).aClass6_Sub1_2 = local392;
					local439 = true;
				}
				if (local439 || Static483.method7135(local392, false)) {
					if (local354 != null && local354.method7757()) {
						local354.method7762(arg0);
					}
					if (local38.aBoolean486 && Static485.aBoolean644) {
						if (local388 > 30) {
							local388 = 30;
						}
						for (@Pc(486) int local486 = 0; local486 <= local59; local486++) {
							for (@Pc(490) int local490 = 0; local490 <= local62; local490++) {
								local140.EA(local486 + arg6, arg5 - -local490, local388);
							}
						}
					}
				}
				if (local38.anInt7176 != 0 && arg8 != null) {
					arg8.method7358(arg5, local62, local59, local38.aBoolean478, arg6, !local38.aBoolean484);
				}
			} else {
				@Pc(636) Class6_Sub1 local636;
				if (arg4 >= 12 && arg4 <= 17 || arg4 >= 18 && arg4 <= 21) {
					if (local228) {
						local354 = new Class6_Sub1_Sub5(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg6, local59 + arg6 - 1, arg5, local62 + arg5 - 1, arg4, arg7, local191);
						if (local354.method7757()) {
							local354.method7762(arg0);
						}
						local392 = local354;
					} else {
						local392 = new Class6_Sub1_Sub6(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg6, arg6 + local59 - 1, arg5, local62 + arg5 - 1, arg4, arg7, arg2);
					}
					local636 = Static420.method6482(arg9, arg6, arg5, qn.class);
					if (local636 instanceof Class6_Sub1_Sub4 && arg6 == local636.aShort123 && local636.aShort120 == arg5) {
						((Class6_Sub1_Sub4) local636).aClass6_Sub1_2 = local392;
					} else {
						Static483.method7135(local392, false);
					}
					if (Static485.aBoolean644 && !super.aBoolean202 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg9 > 0 && local38.anInt7163 != 0) {
						super.aByteArrayArrayArray13[arg9][arg6][arg5] = (byte) (super.aByteArrayArrayArray13[arg9][arg6][arg5] | 0x4);
					}
					if (local38.anInt7176 != 0 && arg8 != null) {
						arg8.method7358(arg5, local62, local59, local38.aBoolean478, arg6, !local38.aBoolean484);
					}
				} else {
					@Pc(767) Class6_Sub2 local767;
					if (arg4 == 0) {
						@Pc(732) int local732 = local38.anInt7163;
						if (Static367.aBoolean436 && local38.anInt7163 == -1) {
							local732 = 1;
						}
						if (local228) {
							@Pc(757) Class6_Sub2_Sub2 local757 = new Class6_Sub2_Sub2(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, arg4, arg7, local191);
							if (local757.method7757()) {
								local757.method7762(arg0);
							}
							local767 = local757;
						} else {
							local767 = new Class6_Sub2_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg4, arg7, arg2);
						}
						@Pc(790) Class6_Sub2 local790 = Static542.method7740(arg9, arg6, arg5);
						if (local790 instanceof Class6_Sub2_Sub1) {
							((Class6_Sub2_Sub1) local790).aClass6_Sub2_1 = local767;
						} else {
							Static314.method5091(arg9, arg6, arg5, local767, null);
						}
						if (Static485.aBoolean644) {
							if (arg7 == 0) {
								if (local38.aBoolean486) {
									local140.EA(arg6, arg5, 50);
									local140.EA(arg6, arg5 + 1, 50);
								}
								if (local732 == 1 && !super.aBoolean202) {
									super.aByteArrayArrayArray13[arg9][arg6][arg5] = (byte) (super.aByteArrayArrayArray13[arg9][arg6][arg5] | 0x1);
								}
							} else if (arg7 == 1) {
								if (local38.aBoolean486) {
									local140.EA(arg6, arg5 + 1, 50);
									local140.EA(arg6 + 1, arg5 + 1, 50);
								}
								if (local732 == 1 && !super.aBoolean202) {
									super.aByteArrayArrayArray13[arg9][arg6][arg5 + 1] = (byte) (super.aByteArrayArrayArray13[arg9][arg6][arg5 + 1] | 0x2);
								}
							} else if (arg7 == 2) {
								if (local38.aBoolean486) {
									local140.EA(arg6 + 1, arg5, 50);
									local140.EA(arg6 + 1, arg5 - -1, 50);
								}
								if (local732 == 1 && !super.aBoolean202) {
									super.aByteArrayArrayArray13[arg9][arg6 + 1][arg5] = (byte) (super.aByteArrayArrayArray13[arg9][arg6 + 1][arg5] | 0x1);
								}
							} else if (arg7 == 3) {
								if (local38.aBoolean486) {
									local140.EA(arg6, arg5, 50);
									local140.EA(arg6 + 1, arg5, 50);
								}
								if (local732 == 1 && !super.aBoolean202) {
									super.aByteArrayArrayArray13[arg9][arg6][arg5] = (byte) (super.aByteArrayArrayArray13[arg9][arg6][arg5] | 0x2);
								}
							}
						}
						if (local38.anInt7176 != 0 && arg8 != null) {
							arg8.method7357(local38.aBoolean478, arg6, !local38.aBoolean484, arg5, arg7, arg4);
						}
						if (local38.anInt7167 != 64) {
							Static473.method6744(arg9, arg6, arg5, local38.anInt7167);
						}
					} else {
						@Pc(1080) Class6_Sub2_Sub2 local1080;
						@Pc(1063) Class6_Sub2 local1063;
						if (arg4 == 1) {
							if (local228) {
								local1080 = new Class6_Sub2_Sub2(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, arg4, arg7, local191);
								local1063 = local1080;
								if (local1080.method7757()) {
									local1080.method7762(arg0);
								}
							} else {
								local1063 = new Class6_Sub2_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg4, arg7, arg2);
							}
							local767 = Static542.method7740(arg9, arg6, arg5);
							if (local767 instanceof Class6_Sub2_Sub1) {
								((Class6_Sub2_Sub1) local767).aClass6_Sub2_1 = local1063;
							} else {
								Static314.method5091(arg9, arg6, arg5, local1063, null);
							}
							if (local38.aBoolean486 && Static485.aBoolean644) {
								if (arg7 == 0) {
									local140.EA(arg6, arg5 + 1, 50);
								} else if (arg7 == 1) {
									local140.EA(arg6 + 1, arg5 + 1, 50);
								} else if (arg7 == 2) {
									local140.EA(arg6 + 1, arg5, 50);
								} else if (arg7 == 3) {
									local140.EA(arg6, arg5, 50);
								}
							}
							if (local38.anInt7176 != 0 && arg8 != null) {
								arg8.method7357(local38.aBoolean478, arg6, !local38.aBoolean484, arg5, arg7, arg4);
							}
						} else if (arg4 == 2) {
							local388 = arg7 + 1 & 0x3;
							if (local228) {
								@Pc(1220) Class6_Sub2_Sub2 local1220 = new Class6_Sub2_Sub2(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, arg4, arg7 + 4, local191);
								@Pc(1235) Class6_Sub2_Sub2 local1235 = new Class6_Sub2_Sub2(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, arg4, local388, local191);
								if (local1220.method7757()) {
									local1220.method7762(arg0);
								}
								local1063 = local1220;
								local767 = local1235;
								if (local1235.method7757()) {
									local1235.method7762(arg0);
								}
							} else {
								local1063 = new Class6_Sub2_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg4, arg7 + 4, arg2);
								local767 = new Class6_Sub2_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg4, local388, arg2);
							}
							Static314.method5091(arg9, arg6, arg5, local1063, local767);
							if (local38.anInt7163 == 1 && Static485.aBoolean644 && !super.aBoolean202) {
								if (arg7 == 0) {
									super.aByteArrayArrayArray13[arg9][arg6][arg5] = (byte) (super.aByteArrayArrayArray13[arg9][arg6][arg5] | 0x1);
									super.aByteArrayArrayArray13[arg9][arg6][arg5 + 1] = (byte) (super.aByteArrayArrayArray13[arg9][arg6][arg5 + 1] | 0x2);
								} else if (arg7 == 1) {
									super.aByteArrayArrayArray13[arg9][arg6][arg5 + 1] = (byte) (super.aByteArrayArrayArray13[arg9][arg6][arg5 + 1] | 0x2);
									super.aByteArrayArrayArray13[arg9][arg6 + 1][arg5] = (byte) (super.aByteArrayArrayArray13[arg9][arg6 + 1][arg5] | 0x1);
								} else if (arg7 == 2) {
									super.aByteArrayArrayArray13[arg9][arg6 + 1][arg5] = (byte) (super.aByteArrayArrayArray13[arg9][arg6 + 1][arg5] | 0x1);
									super.aByteArrayArrayArray13[arg9][arg6][arg5] = (byte) (super.aByteArrayArrayArray13[arg9][arg6][arg5] | 0x2);
								} else if (arg7 == 3) {
									super.aByteArrayArrayArray13[arg9][arg6][arg5] = (byte) (super.aByteArrayArrayArray13[arg9][arg6][arg5] | 0x2);
									super.aByteArrayArrayArray13[arg9][arg6][arg5] = (byte) (super.aByteArrayArrayArray13[arg9][arg6][arg5] | 0x1);
								}
							}
							if (local38.anInt7176 != 0 && arg8 != null) {
								arg8.method7357(local38.aBoolean478, arg6, !local38.aBoolean484, arg5, arg7, arg4);
							}
							if (local38.anInt7167 != 64) {
								Static473.method6744(arg9, arg6, arg5, local38.anInt7167);
							}
						} else if (arg4 == 3) {
							if (local228) {
								local1080 = new Class6_Sub2_Sub2(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, arg4, arg7, local191);
								local1063 = local1080;
								if (local1080.method7757()) {
									local1080.method7762(arg0);
								}
							} else {
								local1063 = new Class6_Sub2_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg4, arg7, arg2);
							}
							local767 = Static542.method7740(arg9, arg6, arg5);
							if (local767 instanceof Class6_Sub2_Sub1) {
								((Class6_Sub2_Sub1) local767).aClass6_Sub2_1 = local1063;
							} else {
								Static314.method5091(arg9, arg6, arg5, local1063, null);
							}
							if (local38.aBoolean486 && Static485.aBoolean644) {
								if (arg7 == 0) {
									local140.EA(arg6, arg5 + 1, 50);
								} else if (arg7 == 1) {
									local140.EA(arg6 + 1, arg5 - -1, 50);
								} else if (arg7 == 2) {
									local140.EA(arg6 + 1, arg5, 50);
								} else if (arg7 == 3) {
									local140.EA(arg6, arg5, 50);
								}
							}
							if (local38.anInt7176 != 0 && arg8 != null) {
								arg8.method7357(local38.aBoolean478, arg6, !local38.aBoolean484, arg5, arg7, arg4);
							}
						} else if (arg4 == 9) {
							if (local228) {
								local354 = new Class6_Sub1_Sub5(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg6, arg6, arg5, arg5, arg4, arg7, local191);
								if (local354.method7757()) {
									local354.method7762(arg0);
								}
								local392 = local354;
							} else {
								local392 = new Class6_Sub1_Sub6(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg6, arg6 + local59 - 1, arg5, local62 + arg5 - 1, arg4, arg7, arg2);
							}
							local636 = Static420.method6482(arg9, arg6, arg5, qn.class);
							if (local636 instanceof Class6_Sub1_Sub4 && arg6 == local636.aShort123 && local636.aShort120 == arg5) {
								((Class6_Sub1_Sub4) local636).aClass6_Sub1_2 = local392;
							} else {
								Static483.method7135(local392, false);
							}
							if (local38.anInt7176 != 0 && arg8 != null) {
								arg8.method7358(arg5, local62, local59, local38.aBoolean478, arg6, !local38.aBoolean484);
							}
							if (local38.anInt7167 != 64) {
								Static473.method6744(arg9, arg6, arg5, local38.anInt7167);
							}
						} else {
							@Pc(1842) Class6_Sub4 local1842;
							if (arg4 == 4) {
								if (local228) {
									@Pc(1840) Class6_Sub4_Sub1 local1840 = new Class6_Sub4_Sub1(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, 0, 0, 0, arg4, arg7);
									local1842 = local1840;
									if (local1840.method7757()) {
										local1840.method7762(arg0);
									}
								} else {
									local1842 = new Class6_Sub4_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, 0, 0, 0, arg4, arg7, arg2);
								}
								@Pc(1876) Class6_Sub4 local1876 = Static183.method4959(arg9, arg6, arg5);
								if (local1876 instanceof Class6_Sub4_Sub2) {
									((Class6_Sub4_Sub2) local1876).aClass6_Sub4_1 = local1842;
								} else {
									Static509.method7291(arg9, arg6, arg5, local1842, null);
								}
							} else {
								@Pc(1896) int local1896;
								@Pc(1902) Interface15 local1902;
								@Pc(1941) Class6_Sub4_Sub1 local1941;
								@Pc(1985) Class6_Sub4 local1985;
								if (arg4 == 5) {
									local1896 = 65;
									local1902 = (Interface15) Static542.method7740(arg9, arg6, arg5);
									if (local1902 != null) {
										local1896 = Static454.aClass298_3.method7185(local1902.method7758()).anInt7167 + 1;
									}
									if (local228) {
										local1941 = new Class6_Sub4_Sub1(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, 0, local1896 * Static485.anIntArray739[arg7], local1896 * Static228.anIntArray439[arg7], arg4, arg7);
										if (local1941.method7757()) {
											local1941.method7762(arg0);
										}
										local1842 = local1941;
									} else {
										local1842 = new Class6_Sub4_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, 0, local1896 * Static485.anIntArray739[arg7], Static228.anIntArray439[arg7] * local1896, arg4, arg7, arg2);
									}
									local1985 = Static183.method4959(arg9, arg6, arg5);
									if (local1985 instanceof Class6_Sub4_Sub2) {
										((Class6_Sub4_Sub2) local1985).aClass6_Sub4_1 = local1842;
									} else {
										Static509.method7291(arg9, arg6, arg5, local1842, null);
									}
								} else if (arg4 == 6) {
									local1896 = 33;
									local1902 = (Interface15) Static542.method7740(arg9, arg6, arg5);
									if (local1902 != null) {
										local1896 = Static454.aClass298_3.method7185(local1902.method7758()).anInt7167 / 2 + 1;
									}
									if (local228) {
										local1941 = new Class6_Sub4_Sub1(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, arg7, Static485.anIntArray739[arg7] * local1896, local1896 * Static228.anIntArray439[arg7], arg4, arg7 + 4);
										if (local1941.method7757()) {
											local1941.method7762(arg0);
										}
										local1842 = local1941;
									} else {
										local1842 = new Class6_Sub4_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg7, Static323.anIntArray543[arg7] * local1896, local1896 * Static227.anIntArray438[arg7], arg4, arg7 + 4, arg2);
									}
									local1985 = Static183.method4959(arg9, arg6, arg5);
									if (local1985 instanceof Class6_Sub4_Sub2) {
										((Class6_Sub4_Sub2) local1985).aClass6_Sub4_1 = local1842;
									} else {
										Static509.method7291(arg9, arg6, arg5, local1842, null);
									}
								} else if (arg4 == 7) {
									local1896 = arg7 + 2 & 0x3;
									if (local228) {
										@Pc(2168) Class6_Sub4_Sub1 local2168 = new Class6_Sub4_Sub1(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, local1896, 0, 0, arg4, local1896 + 4);
										local1842 = local2168;
										if (local2168.method7757()) {
											local2168.method7762(arg0);
										}
									} else {
										local1842 = new Class6_Sub4_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, local1896, 0, 0, arg4, local1896 + 4, arg2);
									}
									@Pc(2183) Class6_Sub4 local2183 = Static183.method4959(arg9, arg6, arg5);
									if (local2183 instanceof Class6_Sub4_Sub2) {
										((Class6_Sub4_Sub2) local2183).aClass6_Sub4_1 = local1842;
									} else {
										Static509.method7291(arg9, arg6, arg5, local1842, null);
									}
								} else if (arg4 == 8) {
									local388 = arg7 + 2 & 0x3;
									@Pc(2209) int local2209 = 33;
									@Pc(2215) Interface15 local2215 = (Interface15) Static542.method7740(arg9, arg6, arg5);
									if (local2215 != null) {
										local2209 = Static454.aClass298_3.method7185(local2215.method7758()).anInt7167 / 2 + 1;
									}
									@Pc(2258) Class6_Sub4 local2258;
									@Pc(2277) Class6_Sub4 local2277;
									if (local228) {
										local2258 = new Class6_Sub4_Sub1(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, arg7, local2209 * Static323.anIntArray543[arg7], Static227.anIntArray438[arg7] * local2209, arg4, arg7 + 4);
										local2277 = new Class6_Sub4_Sub1(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, arg7, 0, 0, arg4, local388 + 4);
										if (local2258.method7757()) {
											local2258.method7762(arg0);
										}
										if (local2277.method7757()) {
											local2277.method7762(arg0);
										}
									} else {
										local2258 = new Class6_Sub4_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg7, local2209 * Static323.anIntArray543[arg7], Static227.anIntArray438[arg7] * local2209, arg4, arg7 + 4, arg2);
										local2277 = new Class6_Sub4_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg7, 0, 0, arg4, local388 + 4, arg2);
									}
									Static509.method7291(arg9, arg6, arg5, local2258, local2277);
								}
							}
						}
					}
				}
			}
		} else if (Static7.aClass3_Sub15_Sub1_1.aBoolean605 || local38.anInt7164 != 0 || local38.anInt7176 == 1 || local38.aBoolean491) {
			@Pc(288) Class6_Sub3 local288;
			if (local228) {
				@Pc(286) Class6_Sub3_Sub2 local286 = new Class6_Sub3_Sub2(arg0, local38, arg1, local170, local162, local179, super.aBoolean202, arg7, local191);
				local288 = local286;
				if (local286.method7757()) {
					local286.method7762(arg0);
				}
			} else {
				local288 = new Class6_Sub3_Sub3(arg0, local38, arg9, arg1, local170, local162, local179, super.aBoolean202, arg7, arg2);
			}
			@Pc(318) Class6_Sub3 local318 = Static72.method1464(arg9, arg6, arg5);
			if (local318 instanceof Class6_Sub3_Sub1) {
				((Class6_Sub3_Sub1) local318).aClass6_Sub3_1 = local288;
			} else {
				Static266.method4658(arg9, arg6, arg5, local288);
			}
			if (local38.anInt7176 == 1 && arg8 != null) {
				arg8.method7367(arg6, arg5);
			}
		}
	}
}
