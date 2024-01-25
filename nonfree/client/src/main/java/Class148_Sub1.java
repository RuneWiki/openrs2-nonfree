import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class148_Sub1 extends Class148 {

	@OriginalMember(owner = "client!td", name = "W", descriptor = "I")
	public int anInt6362 = 99;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(IIIZ)V")
	public Class148_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static2.aClass28_4, Static139.aClass18_2);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!qa;B)V")
	public void method4882(@OriginalArg(0) Class128 arg0) {
		Static117.method1608(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt6342 > 1) {
			for (local13 = 0; local13 < super.anInt6333; local13++) {
				for (local17 = 0; super.anInt6341 > local17; local17++) {
					if ((Static357.aByteArrayArrayArray11[1][local13][local17] & 0x2) == 2) {
						Static259.method3354(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; local13 < super.anInt6342; local13++) {
			for (local17 = 0; local17 <= super.anInt6341; local17++) {
				for (@Pc(65) int local65 = 0; super.anInt6333 >= local65; local65++) {
					@Pc(80) int local80;
					@Pc(82) int local82;
					@Pc(84) int local84;
					@Pc(131) int local131;
					@Pc(135) int local135;
					@Pc(233) int local233;
					@Pc(242) int local242;
					@Pc(262) int local262;
					@Pc(266) int local266;
					if ((super.aByteArrayArrayArray15[local13][local65][local17] & 0x1) != 0) {
						local80 = local17;
						local82 = local17;
						local84 = local13;
						while (local82 < super.anInt6341 && (super.aByteArrayArrayArray15[local13][local65][local82 + 1] & 0x1) != 0) {
							local82++;
						}
						while (local80 > 0 && (super.aByteArrayArrayArray15[local13][local65][local80 - 1] & 0x1) != 0) {
							local80--;
						}
						local131 = local13;
						label164: while (local84 > 0) {
							for (local135 = local80; local135 <= local82; local135++) {
								if ((super.aByteArrayArrayArray15[local84 - 1][local65][local135] & 0x1) == 0) {
									break label164;
								}
							}
							local84--;
						}
						label153: while (local131 < 3) {
							for (local135 = local80; local135 <= local82; local135++) {
								if ((super.aByteArrayArrayArray15[local131 + 1][local65][local135] & 0x1) == 0) {
									break label153;
								}
							}
							local131++;
						}
						local135 = (local131 + 1 - local84) * (local82 + 1 - local80);
						if (local135 >= 2) {
							local233 = super.anIntArrayArrayArray14[local131][local65][local80] - 240;
							local242 = super.anIntArrayArrayArray14[local84][local65][local80];
							Static20.method388(1, local65 << 7, local65 << 7, local80 << 7, (local82 << 7) + 128, local233, local242);
							for (local262 = local84; local262 <= local131; local262++) {
								for (local266 = local80; local266 <= local82; local266++) {
									super.aByteArrayArrayArray15[local262][local65][local266] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray15[local13][local65][local17] & 0x2) != 0) {
						local80 = local65;
						local82 = local65;
						local84 = local13;
						while (local82 < super.anInt6333 && (super.aByteArrayArrayArray15[local13][local82 + 1][local17] & 0x2) != 0) {
							local82++;
						}
						while (local80 > 0 && (super.aByteArrayArrayArray15[local13][local80 - 1][local17] & 0x2) != 0) {
							local80--;
						}
						local131 = local13;
						label218: while (local84 > 0) {
							for (local135 = local80; local135 <= local82; local135++) {
								if ((super.aByteArrayArrayArray15[local84 - 1][local135][local17] & 0x2) == 0) {
									break label218;
								}
							}
							local84--;
						}
						label207: while (local131 < 3) {
							for (local135 = local80; local135 <= local82; local135++) {
								if ((super.aByteArrayArrayArray15[local131 + 1][local135][local17] & 0x2) == 0) {
									break label207;
								}
							}
							local131++;
						}
						local135 = (local82 + 1 - local80) * (local131 + 1 - local84);
						if (local135 >= 2) {
							local233 = super.anIntArrayArrayArray14[local131][local80][local17] - 240;
							local242 = super.anIntArrayArrayArray14[local84][local80][local17];
							Static20.method388(2, local80 << 7, (local82 << 7) + 128, local17 << 7, local17 << 7, local233, local242);
							for (local262 = local84; local262 <= local131; local262++) {
								for (local266 = local80; local266 <= local82; local266++) {
									super.aByteArrayArrayArray15[local262][local266][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray15[local13][local65][local17] & 0x4) != 0) {
						local80 = local65;
						local82 = local65;
						local84 = local17;
						local131 = local17;
						while (local84 > 0 && (super.aByteArrayArrayArray15[local13][local65][local84 - 1] & 0x4) != 0) {
							local84--;
						}
						while (local131 < super.anInt6341 && (super.aByteArrayArrayArray15[local13][local65][local131 + 1] & 0x4) != 0) {
							local131++;
						}
						label272: while (local80 > 0) {
							for (local135 = local84; local135 <= local131; local135++) {
								if ((super.aByteArrayArrayArray15[local13][local80 - 1][local135] & 0x4) == 0) {
									break label272;
								}
							}
							local80--;
						}
						label261: while (local82 < super.anInt6333) {
							for (local135 = local84; local135 <= local131; local135++) {
								if ((super.aByteArrayArrayArray15[local13][local82 + 1][local135] & 0x4) == 0) {
									break label261;
								}
							}
							local82++;
						}
						if ((local82 + 1 - local80) * (local131 + 1 - local84) >= 4) {
							local135 = super.anIntArrayArrayArray14[local13][local80][local84];
							Static20.method388(4, local80 << 7, (local82 << 7) + 128, local84 << 7, (local131 << 7) + 128, local135, local135);
							for (@Pc(710) int local710 = local80; local710 <= local82; local710++) {
								for (local233 = local84; local233 <= local131; local233++) {
									super.aByteArrayArrayArray15[local13][local710][local233] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray15 = null;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([BLclient!qa;II[Lclient!vb;B)V")
	public void method4883(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class247[] arg4) {
		@Pc(10) Class1_Sub11 local10 = new Class1_Sub11(arg0);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local10.method4457();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local10.method4469();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local10.method4463();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = arg2 + local54;
				@Pc(78) int local78 = arg3 + local48;
				if (local74 > 0 && local78 > 0 && local74 < super.anInt6333 - 1 && local78 < super.anInt6341 - 1) {
					@Pc(100) Class247 local100 = null;
					if (!super.aBoolean521) {
						@Pc(105) int local105 = local58;
						if ((Static357.aByteArrayArrayArray11[1][local74][local78] & 0x2) == 2) {
							local105 = local58 - 1;
						}
						if (local105 >= 0) {
							local100 = arg4[local105];
						}
					}
					this.method4892(local66, local58, local74, arg1, local17, local100, local78, -1, local70, local58);
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(ILclient!qa;ZLclient!dh;[II)V")
	public void method4884(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(3) Class1_Sub11 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean521) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class210 local13 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(29) int local29;
						@Pc(101) int local101;
						@Pc(512) int local512;
						@Pc(116) int local116;
						@Pc(120) int local120;
						while (arg2.aByteArray64.length > arg2.anInt5766) {
							local29 = arg2.method4463();
							if (local29 == 0) {
								local13 = new Class210(arg2);
							} else {
								@Pc(122) int local122;
								@Pc(183) int local183;
								@Pc(277) int local277;
								if (local29 == 1) {
									local101 = arg2.method4463();
									if (local101 > 0) {
										for (local512 = 0; local512 < local101; local512++) {
											@Pc(521) Class71 local521 = new Class71(arg1, arg2, 0);
											if (local521.anInt1820 == 31) {
												@Pc(534) Class193 local534 = Static337.aClass120_2.method2414(arg2.method4485());
												local521.method1473(local534.anInt5184, local534.anInt5182, local534.anInt5180, local534.anInt5185);
											}
											if (arg1.method3558() > 0) {
												@Pc(551) Class1_Sub24 local551 = local521.aClass1_Sub24_1;
												local122 = (arg4 << 7) + local551.method4367();
												local183 = (arg0 << 7) + local551.method4369();
												local277 = local122 >> 7;
												@Pc(575) int local575 = local183 >> 7;
												if (local277 >= 0 && local575 >= 0 && super.anInt6333 > local277 && local575 < super.anInt6341) {
													local551.method4370(local183, local122, super.anIntArrayArrayArray14[local521.anInt1818][local277][local575] - local551.method4376());
													if (arg1.method3558() > 0) {
														Static266.method2729(local521);
													}
												}
											}
										}
									}
								} else if (local29 == 2) {
									if (local13 == null) {
										local13 = new Class210();
									}
									local13.method4346(arg2);
								} else if (local29 != 128) {
									if (local29 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray12 == null) {
										super.aByteArrayArrayArray12 = new byte[4][][];
									}
									for (local101 = 0; local101 < 4; local101++) {
										@Pc(107) byte local107 = arg2.method4452();
										if (local107 == 0 && super.aByteArrayArrayArray12[local101] != null) {
											local116 = arg4;
											local120 = arg4 + 64;
											local122 = arg0;
											if (arg4 < 0) {
												local116 = 0;
											} else if (super.anInt6333 <= arg4) {
												local116 = super.anInt6333;
											}
											if (arg0 < 0) {
												local122 = 0;
											} else if (super.anInt6341 <= arg0) {
												local122 = super.anInt6341;
											}
											if (local120 < 0) {
												local120 = 0;
											} else if (local120 >= super.anInt6333) {
												local120 = super.anInt6333;
											}
											local183 = arg0 + 64;
											if (local183 < 0) {
												local183 = 0;
											} else if (super.anInt6341 <= local183) {
												local183 = super.anInt6341;
											}
											while (local120 > local116) {
												while (local122 < local183) {
													super.aByteArrayArrayArray12[local101][local116][local122] = 0;
													local122++;
												}
												local116++;
											}
										} else if (local107 == 1) {
											if (super.aByteArrayArrayArray12[local101] == null) {
												super.aByteArrayArrayArray12[local101] = new byte[super.anInt6333 + 1][super.anInt6341 + 1];
											}
											for (local116 = 0; local116 < 64; local116 += 4) {
												for (local120 = 0; local120 < 64; local120 += 4) {
													@Pc(266) byte local266 = arg2.method4452();
													for (local183 = local116 + arg4; local183 < arg4 + local116 + 4; local183++) {
														for (local277 = arg0 + local120; local277 < local120 + arg0 + 4; local277++) {
															if (local183 >= 0 && local183 < super.anInt6333 && local277 >= 0 && local277 < super.anInt6341) {
																super.aByteArrayArrayArray12[local101][local183][local277] = local266;
															}
														}
													}
												}
											}
										} else if (local107 == 2) {
											if (super.aByteArrayArrayArray12[local101] == null) {
												super.aByteArrayArrayArray12[local101] = new byte[super.anInt6333 + 1][super.anInt6341 + 1];
											}
											if (local101 > 0) {
												local116 = arg4;
												local120 = arg4 + 64;
												local122 = arg0;
												if (arg4 < 0) {
													local116 = 0;
												} else if (super.anInt6333 <= arg4) {
													local116 = super.anInt6333;
												}
												if (arg0 < 0) {
													local122 = 0;
												} else if (super.anInt6341 <= arg0) {
													local122 = super.anInt6341;
												}
												if (local120 < 0) {
													local120 = 0;
												} else if (super.anInt6333 <= local120) {
													local120 = super.anInt6333;
												}
												local183 = arg0 + 64;
												if (local183 < 0) {
													local183 = 0;
												} else if (local183 >= super.anInt6341) {
													local183 = super.anInt6341;
												}
												while (local116 < local120) {
													while (local122 < local183) {
														super.aByteArrayArrayArray12[local101][local116][local122] = super.aByteArrayArrayArray12[local101 - 1][local116][local122];
														local122++;
													}
													local116++;
												}
											}
										}
									}
									local11 = true;
								} else if (arg3 == null) {
									arg2.anInt5766 += 10;
								} else {
									arg3[0] = arg2.method4485();
									arg3[1] = arg2.method4482();
									arg3[2] = arg2.method4482();
									arg3[3] = arg2.method4482();
									arg3[4] = arg2.method4485();
								}
							}
						}
						if (local13 != null) {
							for (local29 = 0; local29 < 8; local29++) {
								for (local101 = 0; local101 < 8; local101++) {
									local512 = local29 + (arg4 >> 3);
									local116 = local101 + (arg0 >> 3);
									if (local512 >= 0 && local512 < super.anInt6333 >> 3 && local116 >= 0 && super.anInt6341 >> 3 > local116) {
										Static429.method5401(local13, local512, local116);
									}
								}
							}
						}
						if (!local11 && super.aByteArrayArrayArray12 != null) {
							for (local29 = 0; local29 < 4; local29++) {
								if (super.aByteArrayArrayArray12[local29] != null) {
									for (local101 = 0; local101 < 16; local101++) {
										for (local512 = 0; local512 < 16; local512++) {
											local116 = (arg4 >> 2) + local101;
											local120 = local512 + (arg0 >> 2);
											if (local116 >= 0 && local116 < 26 && local120 >= 0 && local120 < 26) {
												super.aByteArrayArrayArray12[local29][local116][local120] = 0;
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

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!dh;IIIZ[IILclient!qa;III)V")
	public void method4885(@OriginalArg(0) Class1_Sub11 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class128 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean521) {
			return;
		}
		@Pc(13) Class210 local13 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(30) int local30 = (arg2 & 0x7) * 8;
		@Pc(36) int local36 = (arg9 & 0x7) * 8;
		while (true) {
			@Pc(55) int local55;
			@Pc(114) int local114;
			@Pc(164) int local164;
			@Pc(187) int local187;
			@Pc(62) int local62;
			@Pc(108) int local108;
			label235: do {
				while (true) {
					@Pc(41) int local41;
					@Pc(368) int local368;
					while (arg0.aByteArray64.length > arg0.anInt5766) {
						local41 = arg0.method4463();
						if (local41 == 0) {
							local13 = new Class210(arg0);
						} else {
							if (local41 == 1) {
								local55 = arg0.method4463();
								continue label235;
							}
							if (local41 == 2) {
								if (local13 == null) {
									local13 = new Class210();
								}
								local13.method4346(arg0);
							} else if (local41 != 128) {
								if (local41 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray12 == null) {
									super.aByteArrayArrayArray12 = new byte[4][][];
								}
								for (local55 = 0; local55 < 4; local55++) {
									@Pc(333) byte local333 = arg0.method4452();
									@Pc(372) int local372;
									if (local333 == 0 && super.aByteArrayArrayArray12[arg3] != null) {
										if (local55 <= arg8) {
											local368 = arg1;
											local372 = arg1 + 7;
											local108 = arg7;
											if (arg1 < 0) {
												local368 = 0;
											} else if (super.anInt6333 <= arg1) {
												local368 = super.anInt6333;
											}
											if (local372 < 0) {
												local372 = 0;
											} else if (super.anInt6333 <= local372) {
												local372 = super.anInt6333;
											}
											if (arg7 < 0) {
												local108 = 0;
											} else if (arg7 >= super.anInt6341) {
												local108 = super.anInt6341;
											}
											local114 = arg7 + 7;
											if (local114 < 0) {
												local114 = 0;
											} else if (local114 >= super.anInt6341) {
												local114 = super.anInt6341;
											}
											while (local368 < local372) {
												while (local114 > local108) {
													super.aByteArrayArrayArray12[arg3][local368][local108] = 0;
													local108++;
												}
												local368++;
											}
										}
									} else if (local333 == 1) {
										if (super.aByteArrayArrayArray12[arg3] == null) {
											super.aByteArrayArrayArray12[arg3] = new byte[super.anInt6333 + 1][super.anInt6341 + 1];
										}
										for (local368 = 0; local368 < 64; local368 += 4) {
											for (local372 = 0; local372 < 64; local372 += 4) {
												@Pc(378) byte local378 = arg0.method4452();
												if (arg8 >= local55) {
													for (local114 = local368; local114 < local368 + 4; local114++) {
														for (local164 = local372; local164 < local372 + 4; local164++) {
															if (local30 <= local114 && local30 + 8 > local114 && local164 >= local36 && local36 < local36 + 8) {
																local187 = arg1 + Static81.method1239(local164 & 0x7, local114 & 0x7, arg5);
																@Pc(434) int local434 = Static404.method5028(local164 & 0x7, local114 & 0x7, arg5) + arg7;
																if (local187 >= 0 && super.anInt6333 > local187 && local434 >= 0 && local434 < super.anInt6341) {
																	super.aByteArrayArrayArray12[arg3][local187][local434] = local378;
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
								arg0.anInt5766 += 10;
							} else {
								arg4[0] = arg0.method4485();
								arg4[1] = arg0.method4482();
								arg4[2] = arg0.method4482();
								arg4[3] = arg0.method4482();
								arg4[4] = arg0.method4485();
							}
						}
					}
					if (local13 != null) {
						Static429.method5401(local13, arg1 >> 3, arg7 >> 3);
					}
					if (super.aByteArrayArrayArray12 != null && super.aByteArrayArrayArray12[arg3] != null) {
						local41 = arg1 + 7;
						local55 = arg7 + 7;
						for (local62 = arg1; local62 < local41; local62++) {
							for (local368 = arg7; local368 < local55; local368++) {
								super.aByteArrayArrayArray12[arg3][local62][local368] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local55 <= 0);
			for (local62 = 0; local62 < local55; local62++) {
				@Pc(71) Class71 local71 = new Class71(arg6, arg0, 0);
				if (local71.anInt1820 == 31) {
					@Pc(82) Class193 local82 = Static337.aClass120_2.method2414(arg0.method4485());
					local71.method1473(local82.anInt5184, local82.anInt5182, local82.anInt5180, local82.anInt5185);
				}
				if (arg6.method3558() > 0) {
					@Pc(102) Class1_Sub24 local102 = local71.aClass1_Sub24_1;
					local108 = local102.method4367() >> 7;
					local114 = local102.method4369() >> 7;
					if (local71.anInt1818 == arg8 && local108 >= local30 && local30 + 8 > local108 && local114 >= local36 && local36 + 8 > local114) {
						local164 = (arg1 << 7) + Static108.method1519(local102.method4367() & 0x3FF, local102.method4369() & 0x3FF, arg5);
						local108 = local164 >> 7;
						local187 = (arg7 << 7) + Static14.method213(local102.method4369() & 0x3FF, arg5, local102.method4367() & 0x3FF);
						local114 = local187 >> 7;
						if (local108 >= 0 && local114 >= 0 && local108 < super.anInt6333 && super.anInt6341 > local114) {
							local102.method4370(local187, local164, super.anIntArrayArrayArray14[arg8][local108][local114] - local102.method4376());
							if (arg6.method3558() > 0) {
								Static266.method2729(local71);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIILclient!vb;Lclient!qa;)V")
	public void method4889(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class247 arg4, @OriginalArg(6) Class128 arg5) {
		@Pc(7) Interface9 local7 = null;
		if (arg1 == 0) {
			local7 = (Interface9) Static336.method4293(arg0, arg3, arg2);
		}
		if (arg1 == 1) {
			local7 = (Interface9) Static246.method3212(arg0, arg3, arg2);
		}
		if (arg1 == 2) {
			local7 = (Interface9) Static422.method5254(arg0, arg3, arg2, mq.class);
		}
		if (arg1 == 3) {
			local7 = (Interface9) Static261.method3366(arg0, arg3, arg2);
		}
		if (local7 == null) {
			return;
		}
		@Pc(63) Class141 local63 = Static259.aClass95_3.method1821(local7.method5124());
		@Pc(67) int local67 = local7.method5125();
		@Pc(73) int local73 = local7.method5122();
		if (local63.method2820()) {
			Static244.method3190(arg2, arg0, local63, arg3);
		}
		if (local7.method5128()) {
			local7.method5121(arg5);
		}
		if (arg1 == 0) {
			@Pc(101) Class20_Sub1 local101 = Static336.method4293(arg0, arg3, arg2);
			if (local101 instanceof Class20_Sub1_Sub2) {
				((Class20_Sub1_Sub2) local101).aClass20_Sub1_1 = null;
			} else {
				Static213.method2838(arg0, arg3, arg2);
			}
			if (local63.anInt3428 != 0) {
				arg4.method5265(local73, !local63.aBoolean259, local67, arg2, local63.aBoolean260, arg3);
				return;
			}
		} else if (arg1 == 1) {
			@Pc(285) Class20_Sub4 local285 = Static246.method3212(arg0, arg3, arg2);
			if (!(local285 instanceof Class20_Sub4_Sub2)) {
				Static241.method3139(arg0, arg3, arg2);
				return;
			}
			((Class20_Sub4_Sub2) local285).aClass20_Sub4_3 = null;
		} else {
			if (arg1 == 2) {
				@Pc(156) Class20_Sub3 local156 = Static422.method5254(arg0, arg3, arg2, mq.class);
				if (local156 instanceof Class20_Sub3_Sub5 && local156.aShort85 == arg3 && local156.aShort88 == arg2) {
					((Class20_Sub3_Sub5) local156).aClass20_Sub3_2 = null;
				} else {
					Static377.method4840(arg0, arg3, arg2, mq.class);
				}
				if (local63.anInt3428 != 0 && local63.anInt3423 + arg3 < super.anInt6333 && super.anInt6341 > arg2 + local63.anInt3423 && super.anInt6333 > local63.anInt3403 + arg3 && local63.anInt3403 + arg2 < super.anInt6341) {
					arg4.method5270(!local63.aBoolean259, local63.anInt3423, local73, arg2, local63.anInt3403, arg3, local63.aBoolean260);
					return;
				}
			} else if (arg1 == 3) {
				@Pc(255) Class20_Sub2 local255 = Static261.method3366(arg0, arg3, arg2);
				if (local255 instanceof Class20_Sub2_Sub3) {
					((Class20_Sub2_Sub3) local255).aClass20_Sub2_2 = null;
				} else {
					Static447.method5583(arg0, arg3, arg2);
				}
				if (local63.anInt3428 != 1) {
					return;
				}
				arg4.method5267(arg3, arg2);
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(I[Lclient!vb;[BIIILclient!qa;IBII)V")
	public void method4890(@OriginalArg(0) int arg0, @OriginalArg(1) Class247[] arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class128 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(16) Class1_Sub11 local16 = new Class1_Sub11(arg2);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local16.method4457();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(39) int local39 = local16.method4469();
				if (local39 == 0) {
					break;
				}
				local33 += local39 - 1;
				@Pc(51) int local51 = local33 & 0x3F;
				@Pc(57) int local57 = local33 >> 6 & 0x3F;
				@Pc(61) int local61 = local33 >> 12;
				@Pc(67) int local67 = local16.method4463();
				@Pc(71) int local71 = local67 >> 2;
				@Pc(75) int local75 = local67 & 0x3;
				if (local61 == arg8 && local57 >= arg9 && local57 < arg9 + 8 && local51 >= arg5 && local51 < arg5 + 8) {
					@Pc(115) Class141 local115 = Static259.aClass95_3.method1821(local18);
					@Pc(132) int local132 = Static97.method1397(arg0, local115.anInt3423, local75, local51 & 0x7, local57 & 0x7, local115.anInt3403) + arg4;
					@Pc(149) int local149 = Static264.method3381(arg0, local115.anInt3423, local115.anInt3403, local75, local57 & 0x7, local51 & 0x7) + arg7;
					if (local132 > 0 && local149 > 0 && local132 < super.anInt6333 - 1 && local149 < super.anInt6341 - 1) {
						@Pc(174) Class247 local174 = null;
						if (!super.aBoolean521) {
							@Pc(179) int local179 = arg3;
							if ((Static357.aByteArrayArrayArray11[1][local132][local149] & 0x2) == 2) {
								local179 = arg3 - 1;
							}
							if (local179 >= 0) {
								local174 = arg1[local179];
							}
						}
						this.method4892(local71, arg3, local132, arg6, local18, local174, local149, -1, local75 + arg0 & 0x3, arg3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIILclient!qa;ILclient!vb;IIIII)V")
	public void method4892(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class128 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class247 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (!Static336.aClass106_Sub1_1.method4438(Static410.anInt6680) && !Static66.method997(arg6, Static257.anInt6933, arg9, arg2)) {
			return;
		}
		if (arg1 < this.anInt6362) {
			this.anInt6362 = arg1;
		}
		@Pc(38) Class141 local38 = Static259.aClass95_3.method1821(arg4);
		if (arg3.method3545() && Static336.aClass106_Sub1_1.aBoolean463 && local38.aBoolean261) {
			return;
		}
		@Pc(65) int local65;
		@Pc(68) int local68;
		if (arg8 == 1 || arg8 == 3) {
			local65 = local38.anInt3403;
			local68 = local38.anInt3423;
		} else {
			local65 = local38.anInt3423;
			local68 = local38.anInt3403;
		}
		@Pc(88) int local88;
		@Pc(86) int local86;
		if (local65 + arg2 > super.anInt6333) {
			local86 = arg2 + 1;
			local88 = arg2;
		} else {
			local86 = (local65 + 1 >> 1) + arg2;
			local88 = (local65 >> 1) + arg2;
		}
		@Pc(128) int local128;
		@Pc(122) int local122;
		if (local68 + arg6 <= super.anInt6341) {
			local122 = arg6 + (local68 + 1 >> 1);
			local128 = (local68 >> 1) + arg6;
		} else {
			local128 = arg6;
			local122 = arg6 + 1;
		}
		@Pc(140) Class163 local140 = Static202.aClass163Array2[arg9];
		@Pc(163) int local163 = local140.I(local88, local128) + local140.I(local86, local128) + local140.I(local88, local122) + local140.I(local86, local122) >> 2;
		@Pc(172) int local172 = (arg2 << 7) + (local65 << 6);
		@Pc(180) int local180 = (arg6 << 7) + (local68 << 6);
		@Pc(192) boolean local192 = Static364.aBoolean508 && !super.aBoolean521 && local38.aBoolean264;
		if (local38.method2820()) {
			Static62.method970(local38, null, arg8, arg6, null, arg2, arg1);
		}
		@Pc(226) boolean local226 = arg7 == -1 && local38.lb == -1 && local38.anIntArray185 == null && local38.anIntArray184 == null && !local38.aBoolean267;
		if (Static341.aBoolean450 && (Static401.method2974(arg0) && local38.anInt3381 != 1 || !(!Static207.method2801(arg0) || local38.anInt3381 != 0))) {
			return;
		}
		if (arg0 != 22) {
			@Pc(387) Class20_Sub3 local387;
			@Pc(355) Class20_Sub3_Sub1 local355;
			@Pc(359) int local359;
			if (arg0 == 10 || arg0 == 11) {
				local355 = null;
				if (local226) {
					@Pc(417) Class20_Sub3_Sub1 local417 = new Class20_Sub3_Sub1(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg2, local65 + arg2 - 1, arg6, local68 + arg6 - 1, arg0, arg8, local192);
					local359 = local417.method1171();
					local387 = local417;
					local355 = local417;
				} else {
					local359 = 15;
					local387 = new Class20_Sub3_Sub6(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg2, local65 + arg2 - 1, arg6, local68 + arg6 - 1, arg0, arg8, arg7);
				}
				@Pc(438) Class20_Sub3 local438 = Static422.method5254(arg1, arg2, arg6, mq.class);
				@Pc(440) boolean local440 = false;
				if (local438 instanceof Class20_Sub3_Sub5 && local438.aShort85 == arg2 && arg6 == local438.aShort88) {
					local440 = true;
					((Class20_Sub3_Sub5) local438).aClass20_Sub3_2 = local387;
				}
				if (local440 || Static222.method2947(local387, false)) {
					if (local355 != null && local355.method5128()) {
						local355.method5126(arg3);
					}
					if (local38.aBoolean266 && Static364.aBoolean508) {
						if (local359 > 30) {
							local359 = 30;
						}
						for (@Pc(485) int local485 = 0; local485 <= local65; local485++) {
							for (@Pc(489) int local489 = 0; local489 <= local68; local489++) {
								local140.QA(local485 + arg2, arg6 + local489, local359);
							}
						}
					}
				}
				if (local38.anInt3428 != 0 && arg5 != null) {
					arg5.method5271(local68, local65, !local38.aBoolean259, arg2, arg6, local38.aBoolean260);
				}
			} else {
				@Pc(636) Class20_Sub3 local636;
				if (arg0 >= 12 && arg0 <= 17 || arg0 >= 18 && arg0 <= 21) {
					if (local226) {
						local355 = new Class20_Sub3_Sub1(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg2, local65 + arg2 - 1, arg6, local68 + arg6 - 1, arg0, arg8, local192);
						if (local355.method5128()) {
							local355.method5126(arg3);
						}
						local387 = local355;
					} else {
						local387 = new Class20_Sub3_Sub6(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg2, local65 + arg2 - 1, arg6, arg6 + local68 - 1, arg0, arg8, arg7);
					}
					local636 = Static422.method5254(arg1, arg2, arg6, mq.class);
					if (local636 instanceof Class20_Sub3_Sub5 && arg2 == local636.aShort85 && local636.aShort88 == arg6) {
						((Class20_Sub3_Sub5) local636).aClass20_Sub3_2 = local387;
					} else {
						Static222.method2947(local387, false);
					}
					if (Static364.aBoolean508 && !super.aBoolean521 && arg0 >= 12 && arg0 <= 17 && arg0 != 13 && arg1 > 0 && local38.anInt3381 != 0) {
						super.aByteArrayArrayArray15[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray15[arg1][arg2][arg6] | 0x4);
					}
					if (local38.anInt3428 != 0 && arg5 != null) {
						arg5.method5271(local68, local65, !local38.aBoolean259, arg2, arg6, local38.aBoolean260);
					}
				} else {
					@Pc(768) Class20_Sub1 local768;
					if (arg0 == 0) {
						@Pc(740) int local740 = local38.anInt3381;
						if (Static57.aBoolean84 && local38.anInt3381 == -1) {
							local740 = 1;
						}
						if (local226) {
							@Pc(766) Class20_Sub1_Sub3 local766 = new Class20_Sub1_Sub3(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, arg0, arg8, local192);
							local768 = local766;
							if (local766.method5128()) {
								local766.method5126(arg3);
							}
						} else {
							local768 = new Class20_Sub1_Sub1(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg0, arg8, arg7);
						}
						@Pc(799) Class20_Sub1 local799 = Static336.method4293(arg1, arg2, arg6);
						if (local799 instanceof Class20_Sub1_Sub2) {
							((Class20_Sub1_Sub2) local799).aClass20_Sub1_1 = local768;
						} else {
							Static204.method2781(arg1, arg2, arg6, local768, null);
						}
						if (Static364.aBoolean508) {
							if (arg8 == 0) {
								if (local38.aBoolean266) {
									local140.QA(arg2, arg6, 50);
									local140.QA(arg2, arg6 + 1, 50);
								}
								if (local740 == 1 && !super.aBoolean521) {
									super.aByteArrayArrayArray15[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray15[arg1][arg2][arg6] | 0x1);
								}
							} else if (arg8 == 1) {
								if (local38.aBoolean266) {
									local140.QA(arg2, arg6 + 1, 50);
									local140.QA(arg2 + 1, arg6 - -1, 50);
								}
								if (local740 == 1 && !super.aBoolean521) {
									super.aByteArrayArrayArray15[arg1][arg2][arg6 + 1] = (byte) (super.aByteArrayArrayArray15[arg1][arg2][arg6 + 1] | 0x2);
								}
							} else if (arg8 == 2) {
								if (local38.aBoolean266) {
									local140.QA(arg2 + 1, arg6, 50);
									local140.QA(arg2 + 1, arg6 + 1, 50);
								}
								if (local740 == 1 && !super.aBoolean521) {
									super.aByteArrayArrayArray15[arg1][arg2 + 1][arg6] = (byte) (super.aByteArrayArrayArray15[arg1][arg2 + 1][arg6] | 0x1);
								}
							} else if (arg8 == 3) {
								if (local38.aBoolean266) {
									local140.QA(arg2, arg6, 50);
									local140.QA(arg2 + 1, arg6, 50);
								}
								if (local740 == 1 && !super.aBoolean521) {
									super.aByteArrayArrayArray15[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray15[arg1][arg2][arg6] | 0x2);
								}
							}
						}
						if (local38.anInt3428 != 0 && arg5 != null) {
							arg5.method5269(!local38.aBoolean259, arg6, arg0, local38.aBoolean260, arg2, arg8);
						}
						if (local38.anInt3407 != 16) {
							Static60.method950(arg1, arg2, arg6, local38.anInt3407);
						}
					} else {
						@Pc(1090) Class20_Sub1_Sub3 local1090;
						@Pc(1073) Class20_Sub1 local1073;
						if (arg0 == 1) {
							if (local226) {
								local1090 = new Class20_Sub1_Sub3(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, arg0, arg8, local192);
								if (local1090.method5128()) {
									local1090.method5126(arg3);
								}
								local1073 = local1090;
							} else {
								local1073 = new Class20_Sub1_Sub1(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg0, arg8, arg7);
							}
							local768 = Static336.method4293(arg1, arg2, arg6);
							if (local768 instanceof Class20_Sub1_Sub2) {
								((Class20_Sub1_Sub2) local768).aClass20_Sub1_1 = local1073;
							} else {
								Static204.method2781(arg1, arg2, arg6, local1073, null);
							}
							if (local38.aBoolean266 && Static364.aBoolean508) {
								if (arg8 == 0) {
									local140.QA(arg2, arg6 + 1, 50);
								} else if (arg8 == 1) {
									local140.QA(arg2 + 1, arg6 - -1, 50);
								} else if (arg8 == 2) {
									local140.QA(arg2 + 1, arg6, 50);
								} else if (arg8 == 3) {
									local140.QA(arg2, arg6, 50);
								}
							}
							if (local38.anInt3428 != 0 && arg5 != null) {
								arg5.method5269(!local38.aBoolean259, arg6, arg0, local38.aBoolean260, arg2, arg8);
							}
						} else if (arg0 == 2) {
							local359 = arg8 + 1 & 0x3;
							if (local226) {
								@Pc(1264) Class20_Sub1_Sub3 local1264 = new Class20_Sub1_Sub3(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, arg0, arg8 + 4, local192);
								@Pc(1279) Class20_Sub1_Sub3 local1279 = new Class20_Sub1_Sub3(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, arg0, local359, local192);
								if (local1264.method5128()) {
									local1264.method5126(arg3);
								}
								if (local1279.method5128()) {
									local1279.method5126(arg3);
								}
								local1073 = local1264;
								local768 = local1279;
							} else {
								local1073 = new Class20_Sub1_Sub1(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg0, arg8 + 4, arg7);
								local768 = new Class20_Sub1_Sub1(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg0, local359, arg7);
							}
							Static204.method2781(arg1, arg2, arg6, local1073, local768);
							if (local38.anInt3381 == 1 && Static364.aBoolean508 && !super.aBoolean521) {
								if (arg8 == 0) {
									super.aByteArrayArrayArray15[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray15[arg1][arg2][arg6] | 0x1);
									super.aByteArrayArrayArray15[arg1][arg2][arg6 + 1] = (byte) (super.aByteArrayArrayArray15[arg1][arg2][arg6 + 1] | 0x2);
								} else if (arg8 == 1) {
									super.aByteArrayArrayArray15[arg1][arg2][arg6 + 1] = (byte) (super.aByteArrayArrayArray15[arg1][arg2][arg6 + 1] | 0x2);
									super.aByteArrayArrayArray15[arg1][arg2 + 1][arg6] = (byte) (super.aByteArrayArrayArray15[arg1][arg2 + 1][arg6] | 0x1);
								} else if (arg8 == 2) {
									super.aByteArrayArrayArray15[arg1][arg2 + 1][arg6] = (byte) (super.aByteArrayArrayArray15[arg1][arg2 + 1][arg6] | 0x1);
									super.aByteArrayArrayArray15[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray15[arg1][arg2][arg6] | 0x2);
								} else if (arg8 == 3) {
									super.aByteArrayArrayArray15[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray15[arg1][arg2][arg6] | 0x2);
									super.aByteArrayArrayArray15[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray15[arg1][arg2][arg6] | 0x1);
								}
							}
							if (local38.anInt3428 != 0 && arg5 != null) {
								arg5.method5269(!local38.aBoolean259, arg6, arg0, local38.aBoolean260, arg2, arg8);
							}
							if (local38.anInt3407 != 16) {
								Static60.method950(arg1, arg2, arg6, local38.anInt3407);
							}
						} else if (arg0 == 3) {
							if (local226) {
								local1090 = new Class20_Sub1_Sub3(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, arg0, arg8, local192);
								local1073 = local1090;
								if (local1090.method5128()) {
									local1090.method5126(arg3);
								}
							} else {
								local1073 = new Class20_Sub1_Sub1(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg0, arg8, arg7);
							}
							local768 = Static336.method4293(arg1, arg2, arg6);
							if (local768 instanceof Class20_Sub1_Sub2) {
								((Class20_Sub1_Sub2) local768).aClass20_Sub1_1 = local1073;
							} else {
								Static204.method2781(arg1, arg2, arg6, local1073, null);
							}
							if (local38.aBoolean266 && Static364.aBoolean508) {
								if (arg8 == 0) {
									local140.QA(arg2, arg6 + 1, 50);
								} else if (arg8 == 1) {
									local140.QA(arg2 + 1, arg6 + 1, 50);
								} else if (arg8 == 2) {
									local140.QA(arg2 + 1, arg6, 50);
								} else if (arg8 == 3) {
									local140.QA(arg2, arg6, 50);
								}
							}
							if (local38.anInt3428 != 0 && arg5 != null) {
								arg5.method5269(!local38.aBoolean259, arg6, arg0, local38.aBoolean260, arg2, arg8);
							}
						} else if (arg0 == 9) {
							if (local226) {
								local355 = new Class20_Sub3_Sub1(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg2, arg2, arg6, arg6, arg0, arg8, local192);
								if (local355.method5128()) {
									local355.method5126(arg3);
								}
								local387 = local355;
							} else {
								local387 = new Class20_Sub3_Sub6(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg2, local65 + arg2 - 1, arg6, local68 + arg6 - 1, arg0, arg8, arg7);
							}
							local636 = Static422.method5254(arg1, arg2, arg6, mq.class);
							if (local636 instanceof Class20_Sub3_Sub5 && arg2 == local636.aShort85 && arg6 == local636.aShort88) {
								((Class20_Sub3_Sub5) local636).aClass20_Sub3_2 = local387;
							} else {
								Static222.method2947(local387, false);
							}
							if (local38.anInt3428 != 0 && arg5 != null) {
								arg5.method5271(local68, local65, !local38.aBoolean259, arg2, arg6, local38.aBoolean260);
							}
							if (local38.anInt3407 != 16) {
								Static60.method950(arg1, arg2, arg6, local38.anInt3407);
							}
						} else {
							@Pc(1849) Class20_Sub4 local1849;
							if (arg0 == 4) {
								if (local226) {
									@Pc(1868) Class20_Sub4_Sub1 local1868 = new Class20_Sub4_Sub1(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, 0, 0, 0, arg0, arg8);
									local1849 = local1868;
									if (local1868.method5128()) {
										local1868.method5126(arg3);
									}
								} else {
									local1849 = new Class20_Sub4_Sub3(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, 0, 0, 0, arg0, arg8, arg7);
								}
								@Pc(1883) Class20_Sub4 local1883 = Static246.method3212(arg1, arg2, arg6);
								if (local1883 instanceof Class20_Sub4_Sub2) {
									((Class20_Sub4_Sub2) local1883).aClass20_Sub4_3 = local1849;
								} else {
									Static445.method5569(arg1, arg2, arg6, local1849, null);
								}
							} else {
								@Pc(1903) int local1903;
								@Pc(1909) Interface9 local1909;
								@Pc(1977) Class20_Sub4_Sub1 local1977;
								@Pc(1992) Class20_Sub4 local1992;
								if (arg0 == 5) {
									local1903 = 17;
									local1909 = (Interface9) Static336.method4293(arg1, arg2, arg6);
									if (local1909 != null) {
										local1903 = Static259.aClass95_3.method1821(local1909.method5124()).anInt3407 + 1;
									}
									if (local226) {
										local1977 = new Class20_Sub4_Sub1(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, 0, local1903 * Static170.anIntArray143[arg8], local1903 * Static336.anIntArray333[arg8], arg0, arg8);
										if (local1977.method5128()) {
											local1977.method5126(arg3);
										}
										local1849 = local1977;
									} else {
										local1849 = new Class20_Sub4_Sub3(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, 0, local1903 * Static170.anIntArray143[arg8], local1903 * Static336.anIntArray333[arg8], arg0, arg8, arg7);
									}
									local1992 = Static246.method3212(arg1, arg2, arg6);
									if (local1992 instanceof Class20_Sub4_Sub2) {
										((Class20_Sub4_Sub2) local1992).aClass20_Sub4_3 = local1849;
									} else {
										Static445.method5569(arg1, arg2, arg6, local1849, null);
									}
								} else if (arg0 == 6) {
									local1903 = 9;
									local1909 = (Interface9) Static336.method4293(arg1, arg2, arg6);
									if (local1909 != null) {
										local1903 = Static259.aClass95_3.method1821(local1909.method5124()).anInt3407 / 2 + 1;
									}
									if (local226) {
										local1977 = new Class20_Sub4_Sub1(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, arg8, local1903 * Static170.anIntArray143[arg8], Static336.anIntArray333[arg8] * local1903, arg0, arg8 + 4);
										if (local1977.method5128()) {
											local1977.method5126(arg3);
										}
										local1849 = local1977;
									} else {
										local1849 = new Class20_Sub4_Sub3(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg8, Static182.anIntArray162[arg8] * local1903, Static238.anIntArray203[arg8] * local1903, arg0, arg8 + 4, arg7);
									}
									local1992 = Static246.method3212(arg1, arg2, arg6);
									if (local1992 instanceof Class20_Sub4_Sub2) {
										((Class20_Sub4_Sub2) local1992).aClass20_Sub4_3 = local1849;
									} else {
										Static445.method5569(arg1, arg2, arg6, local1849, null);
									}
								} else if (arg0 == 7) {
									local1903 = arg8 + 2 & 0x3;
									if (local226) {
										@Pc(2179) Class20_Sub4_Sub1 local2179 = new Class20_Sub4_Sub1(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, local1903, 0, 0, arg0, local1903 + 4);
										local1849 = local2179;
										if (local2179.method5128()) {
											local2179.method5126(arg3);
										}
									} else {
										local1849 = new Class20_Sub4_Sub3(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, local1903, 0, 0, arg0, local1903 + 4, arg7);
									}
									@Pc(2194) Class20_Sub4 local2194 = Static246.method3212(arg1, arg2, arg6);
									if (local2194 instanceof Class20_Sub4_Sub2) {
										((Class20_Sub4_Sub2) local2194).aClass20_Sub4_3 = local1849;
									} else {
										Static445.method5569(arg1, arg2, arg6, local1849, null);
									}
								} else if (arg0 == 8) {
									local359 = arg8 + 2 & 0x3;
									@Pc(2222) int local2222 = 9;
									@Pc(2228) Interface9 local2228 = (Interface9) Static336.method4293(arg1, arg2, arg6);
									if (local2228 != null) {
										local2222 = Static259.aClass95_3.method1821(local2228.method5124()).anInt3407 / 2 + 1;
									}
									@Pc(2275) Class20_Sub4 local2275;
									@Pc(2296) Class20_Sub4 local2296;
									if (local226) {
										local2275 = new Class20_Sub4_Sub1(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, arg8, Static182.anIntArray162[arg8] * local2222, Static238.anIntArray203[arg8] * local2222, arg0, arg8 + 4);
										local2296 = new Class20_Sub4_Sub1(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, arg8, 0, 0, arg0, local359 + 4);
										if (local2275.method5128()) {
											local2275.method5126(arg3);
										}
										if (local2296.method5128()) {
											local2296.method5126(arg3);
										}
									} else {
										local2275 = new Class20_Sub4_Sub3(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg8, local2222 * Static182.anIntArray162[arg8], Static238.anIntArray203[arg8] * local2222, arg0, arg8 + 4, arg7);
										local2296 = new Class20_Sub4_Sub3(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg8, 0, 0, arg0, local359 + 4, arg7);
									}
									Static445.method5569(arg1, arg2, arg6, local2275, local2296);
								}
							}
						}
					}
				}
			}
		} else if (Static336.aClass106_Sub1_1.aBoolean465 || local38.anInt3379 != 0 || local38.anInt3428 == 1 || local38.aBoolean272) {
			@Pc(284) Class20_Sub2 local284;
			if (local226) {
				@Pc(300) Class20_Sub2_Sub2 local300 = new Class20_Sub2_Sub2(arg3, local38, arg9, local172, local163, local180, super.aBoolean521, arg8, local192);
				if (local300.method5128()) {
					local300.method5126(arg3);
				}
				local284 = local300;
			} else {
				local284 = new Class20_Sub2_Sub1(arg3, local38, arg1, arg9, local172, local163, local180, super.aBoolean521, arg8, arg7);
			}
			@Pc(315) Class20_Sub2 local315 = Static261.method3366(arg1, arg2, arg6);
			if (local315 instanceof Class20_Sub2_Sub3) {
				((Class20_Sub2_Sub3) local315).aClass20_Sub2_2 = local284;
			} else {
				Static400.method4915(arg1, arg2, arg6, local284);
			}
			if (local38.anInt3428 == 1 && arg5 != null) {
				arg5.method5275(arg6, arg2);
			}
		}
	}
}
