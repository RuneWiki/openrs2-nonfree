import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!fea", name = "N", descriptor = "I")
	public int anInt2543 = 99;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(IIIZ)V")
	public Class104_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static19.aClass289_1, Static533.aClass23_5);
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I[IILclient!ofa;ILclient!ha;)V")
	public void method2163(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class5_Sub22 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class133 arg4) {
		if (super.aBoolean199) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(19) Class48 local19 = null;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(24) int local24;
						@Pc(58) int local58;
						@Pc(491) int local491;
						@Pc(99) int local99;
						@Pc(103) int local103;
						while (arg2.anInt6629 < arg2.aByteArray71.length) {
							local24 = arg2.method5966();
							if (local24 == 0) {
								local19 = new Class48(arg2);
							} else {
								@Pc(218) int local218;
								@Pc(115) int local115;
								@Pc(122) int local122;
								if (local24 == 1) {
									local58 = arg2.method5966();
									if (local58 > 0) {
										for (local491 = 0; local491 < local58; local491++) {
											@Pc(500) Class174 local500 = new Class174(arg4, arg2, 2);
											if (local500.anInt4609 == 31) {
												@Pc(513) Class215 local513 = Static124.aClass84_1.method1739(arg2.method5968());
												local500.method4178(local513.anInt5426, local513.anInt5429, local513.anInt5427, local513.anInt5424);
											}
											if (arg4.method7245() > 0) {
												@Pc(533) Class5_Sub11 local533 = local500.aClass5_Sub11_2;
												local218 = local533.method8103() + (arg1 << 9);
												local115 = local533.method8098() + (arg3 << 9);
												local122 = local218 >> 9;
												@Pc(558) int local558 = local115 >> 9;
												if (local122 >= 0 && local558 >= 0 && super.anInt2531 > local122 && super.anInt2535 > local558) {
													local533.method8094(local218, local115, super.anIntArrayArrayArray2[local500.anInt4603][local122][local558] - local533.method8096());
													Static606.method8670(local500);
												}
											}
										}
									}
								} else if (local24 == 2) {
									if (local19 == null) {
										local19 = new Class48();
									}
									local19.method1050(arg2);
								} else if (local24 != 128) {
									if (local24 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray14 == null) {
										super.aByteArrayArrayArray14 = new byte[4][][];
									}
									local11 = true;
									for (local58 = 0; local58 < 4; local58++) {
										@Pc(64) byte local64 = arg2.method5963();
										if (local64 == 0 && super.aByteArrayArrayArray14[local58] != null) {
											local99 = arg1;
											local103 = arg1 + 64;
											local218 = arg3;
											if (arg1 < 0) {
												local99 = 0;
											} else if (arg1 >= super.anInt2531) {
												local99 = super.anInt2531;
											}
											local115 = arg3 + 64;
											if (arg3 < 0) {
												local218 = 0;
											} else if (arg3 >= super.anInt2535) {
												local218 = super.anInt2535;
											}
											if (local103 < 0) {
												local103 = 0;
											} else if (local103 >= super.anInt2531) {
												local103 = super.anInt2531;
											}
											if (local115 < 0) {
												local115 = 0;
											} else if (local115 >= super.anInt2535) {
												local115 = super.anInt2535;
											}
											while (local103 > local99) {
												while (local115 > local218) {
													super.aByteArrayArrayArray14[local58][local99][local218] = 0;
													local218++;
												}
												local99++;
											}
										} else if (local64 == 1) {
											if (super.aByteArrayArrayArray14[local58] == null) {
												super.aByteArrayArrayArray14[local58] = new byte[super.anInt2531 + 1][super.anInt2535 + 1];
											}
											for (local99 = 0; local99 < 64; local99 += 4) {
												for (local103 = 0; local103 < 64; local103 += 4) {
													@Pc(111) byte local111 = arg2.method5963();
													for (local115 = arg1 + local99; local115 < arg1 + local99 + 4; local115++) {
														for (local122 = local103 + arg3; local122 < local103 + arg3 + 4; local122++) {
															if (local115 >= 0 && local115 < super.anInt2531 && local122 >= 0 && super.anInt2535 > local122) {
																super.aByteArrayArrayArray14[local58][local115][local122] = local111;
															}
														}
													}
												}
											}
										} else if (local64 == 2) {
											if (super.aByteArrayArrayArray14[local58] == null) {
												super.aByteArrayArrayArray14[local58] = new byte[super.anInt2531 + 1][super.anInt2535 + 1];
											}
											if (local58 > 0) {
												local99 = arg1;
												local103 = arg1 + 64;
												local218 = arg3;
												if (arg1 < 0) {
													local99 = 0;
												} else if (super.anInt2531 <= arg1) {
													local99 = super.anInt2531;
												}
												if (local103 < 0) {
													local103 = 0;
												} else if (super.anInt2531 <= local103) {
													local103 = super.anInt2531;
												}
												if (arg3 < 0) {
													local218 = 0;
												} else if (arg3 >= super.anInt2535) {
													local218 = super.anInt2535;
												}
												local115 = arg3 + 64;
												if (local115 < 0) {
													local115 = 0;
												} else if (super.anInt2535 <= local115) {
													local115 = super.anInt2535;
												}
												while (local103 > local99) {
													while (local115 > local218) {
														super.aByteArrayArrayArray14[local58][local99][local218] = super.aByteArrayArrayArray14[local58 - 1][local99][local218];
														local218++;
													}
													local99++;
												}
											}
										}
									}
								} else if (arg0 == null) {
									arg2.anInt6629 += 10;
								} else {
									arg0[0] = arg2.method5968();
									arg0[1] = arg2.method5956();
									arg0[2] = arg2.method5956();
									arg0[3] = arg2.method5956();
									arg0[4] = arg2.method5968();
								}
							}
						}
						if (local19 != null) {
							for (local24 = 0; local24 < 8; local24++) {
								for (local58 = 0; local58 < 8; local58++) {
									local491 = local24 + (arg1 >> 3);
									local99 = (arg3 >> 3) + local58;
									if (local491 >= 0 && local491 < super.anInt2531 >> 3 && local99 >= 0 && super.anInt2535 >> 3 > local99) {
										Static147.method2183(local491, local19, local99);
									}
								}
							}
						}
						if (!local11 && super.aByteArrayArrayArray14 != null) {
							for (local24 = 0; local24 < 4; local24++) {
								if (super.aByteArrayArrayArray14[local24] != null) {
									for (local58 = 0; local58 < 16; local58++) {
										for (local491 = 0; local491 < 16; local491++) {
											local99 = (arg1 >> 2) + local58;
											local103 = (arg3 >> 2) + local491;
											if (local99 >= 0 && local99 < 26 && local103 >= 0 && local103 < 26) {
												super.aByteArrayArrayArray14[local24][local99][local103] = 0;
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

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIILclient!ha;IIILclient!up;ZI)V")
	public void method2164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class133 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class352 arg8, @OriginalArg(10) int arg9) {
		if (Static97.aClass5_Sub25_8.aClass6_Sub6_2.method1639() == 0 && !Static601.method8613(arg7, Static173.anInt3110, arg2, arg1)) {
			return;
		}
		if (this.anInt2543 > arg0) {
			this.anInt2543 = arg0;
		}
		@Pc(34) Class181 local34 = Static61.aClass246_7.method5497(arg6);
		if (Static97.aClass5_Sub25_8.aClass6_Sub16_1.method4732() == 0 && local34.aBoolean346) {
			return;
		}
		@Pc(60) int local60;
		@Pc(57) int local57;
		if (arg3 == 1 || arg3 == 3) {
			local57 = local34.anInt4756;
			local60 = local34.anInt4781;
		} else {
			local60 = local34.anInt4756;
			local57 = local34.anInt4781;
		}
		@Pc(80) int local80;
		@Pc(88) int local88;
		if (local60 + arg1 <= super.anInt2531) {
			local80 = arg1 + (local60 >> 1);
			local88 = (local60 + 1 >> 1) + arg1;
		} else {
			local80 = arg1;
			local88 = arg1 + 1;
		}
		@Pc(108) int local108;
		@Pc(112) int local112;
		if (arg7 + local57 > super.anInt2535) {
			local108 = arg7;
			local112 = arg7 + 1;
		} else {
			local112 = arg7 + (local57 + 1 >> 1);
			local108 = arg7 + (local57 >> 1);
		}
		@Pc(133) Class61 local133 = Static11.aClass61Array1[arg2];
		@Pc(161) int local161 = local133.method8580(local108, local80) + local133.method8580(local108, local88) + local133.method8580(local112, local80) + local133.method8580(local112, local88) >> 2;
		@Pc(170) int local170 = (arg1 << 9) + (local60 << 8);
		@Pc(178) int local178 = (local57 << 8) + (arg7 << 9);
		@Pc(190) boolean local190 = Static623.aBoolean741 && !super.aBoolean199 && local34.aBoolean345;
		if (local34.method4281()) {
			Static475.method7020(null, arg0, arg1, local34, arg3, null, arg7);
		}
		@Pc(229) boolean local229 = arg9 == -1 && local34.anInt4784 == -1 && local34.anIntArray236 == null && local34.anIntArray235 == null && !local34.aBoolean353;
		if (Static77.aBoolean116 && (Static643.method9016(arg5) && local34.anInt4775 != 1 || !(!Static382.method5614(arg5) || local34.anInt4775 != 0))) {
			return;
		}
		if (arg5 != 22) {
			@Pc(374) Class4_Sub2_Sub1 local374;
			@Pc(341) Class4_Sub2_Sub1_Sub3 local341;
			@Pc(380) int local380;
			@Pc(440) int local440;
			if (arg5 == 10 || arg5 == 11) {
				local341 = null;
				if (local229) {
					@Pc(372) Class4_Sub2_Sub1_Sub3 local372 = new Class4_Sub2_Sub1_Sub3(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg1, arg1 + local60 - 1, arg7, arg7 + local57 - 1, arg5, arg3, local190);
					local374 = local372;
					local341 = local372;
					local380 = local372.method6628();
				} else {
					local374 = new Class4_Sub2_Sub1_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg1, local60 + arg1 - 1, arg7, arg7 + local57 - 1, arg5, arg3, arg9);
					local380 = 15;
				}
				if (Static37.method569(local374, false)) {
					if (local341 != null && local341.method8491()) {
						local341.method8494(arg4);
					}
					if (local34.aBoolean347 && Static623.aBoolean741) {
						if (local380 > 30) {
							local380 = 30;
						}
						for (local440 = 0; local440 <= local60; local440++) {
							for (@Pc(444) int local444 = 0; local444 <= local57; local444++) {
								local133.ka(arg1 + local440, arg7 + local444, local380);
							}
						}
					}
				}
				if (local34.anInt4744 != 0 && arg8 != null) {
					arg8.method8338(local60, arg7, arg1, !local34.aBoolean351, local34.aBoolean344, local57);
				}
			} else if ((arg5 < 12 || arg5 > 17) && (arg5 < 18 || arg5 > 21)) {
				@Pc(699) Class4_Sub2_Sub4 local699;
				if (arg5 == 0) {
					@Pc(658) int local658 = local34.anInt4775;
					if (Static573.aBoolean200 && local34.anInt4775 == -1) {
						local658 = 1;
					}
					if (local229) {
						@Pc(685) Class4_Sub2_Sub4_Sub1 local685 = new Class4_Sub2_Sub4_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg5, arg3, local190);
						if (local685.method8491()) {
							local685.method8494(arg4);
						}
						local699 = local685;
					} else {
						local699 = new Class4_Sub2_Sub4_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg5, arg3, arg9);
					}
					Static643.method9015(arg0, arg1, arg7, local699, null);
					if (arg3 == 0) {
						if (Static623.aBoolean741 && local34.aBoolean347) {
							local133.ka(arg1, arg7, 50);
							local133.ka(arg1, arg7 + 1, 50);
						}
						if (local658 == 1 && !super.aBoolean199) {
							Static265.method4292(1, arg1, local34.anInt4788, arg0, local34.anInt4734, arg7);
						}
					} else if (arg3 == 1) {
						if (Static623.aBoolean741 && local34.aBoolean347) {
							local133.ka(arg1, arg7 + 1, 50);
							local133.ka(arg1 + 1, arg7 - -1, 50);
						}
						if (local658 == 1 && !super.aBoolean199) {
							Static265.method4292(2, arg1, local34.anInt4788, arg0, -local34.anInt4734, arg7 + 1);
						}
					} else if (arg3 == 2) {
						if (Static623.aBoolean741 && local34.aBoolean347) {
							local133.ka(arg1 + 1, arg7, 50);
							local133.ka(arg1 + 1, arg7 + 1, 50);
						}
						if (local658 == 1 && !super.aBoolean199) {
							Static265.method4292(1, arg1 + 1, local34.anInt4788, arg0, -local34.anInt4734, arg7);
						}
					} else if (arg3 == 3) {
						if (Static623.aBoolean741 && local34.aBoolean347) {
							local133.ka(arg1, arg7, 50);
							local133.ka(arg1 + 1, arg7, 50);
						}
						if (local658 == 1 && !super.aBoolean199) {
							Static265.method4292(2, arg1, local34.anInt4788, arg0, local34.anInt4734, arg7);
						}
					}
					if (local34.anInt4744 != 0 && arg8 != null) {
						arg8.method8340(arg1, arg7, !local34.aBoolean351, local34.aBoolean344, arg3, arg5);
					}
					if (local34.anInt4745 != 64) {
						Static360.method5379(arg0, arg1, arg7, local34.anInt4745);
					}
				} else {
					@Pc(945) Class4_Sub2_Sub4 local945;
					@Pc(963) Class4_Sub2_Sub4_Sub1 local963;
					if (arg5 == 1) {
						if (local229) {
							local963 = new Class4_Sub2_Sub4_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg5, arg3, local190);
							if (local963.method8491()) {
								local963.method8494(arg4);
							}
							local945 = local963;
						} else {
							local945 = new Class4_Sub2_Sub4_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg5, arg3, arg9);
						}
						Static643.method9015(arg0, arg1, arg7, local945, null);
						if (local34.aBoolean347 && Static623.aBoolean741) {
							if (arg3 == 0) {
								local133.ka(arg1, arg7 + 1, 50);
							} else if (arg3 == 1) {
								local133.ka(arg1 + 1, arg7 + 1, 50);
							} else if (arg3 == 2) {
								local133.ka(arg1 + 1, arg7, 50);
							} else if (arg3 == 3) {
								local133.ka(arg1, arg7, 50);
							}
						}
						if (local34.anInt4744 != 0 && arg8 != null) {
							arg8.method8340(arg1, arg7, !local34.aBoolean351, local34.aBoolean344, arg3, arg5);
						}
					} else if (arg5 == 2) {
						local380 = arg3 + 1 & 0x3;
						if (local229) {
							@Pc(1086) Class4_Sub2_Sub4_Sub1 local1086 = new Class4_Sub2_Sub4_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg5, arg3 + 4, local190);
							@Pc(1102) Class4_Sub2_Sub4_Sub1 local1102 = new Class4_Sub2_Sub4_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg5, local380, local190);
							if (local1086.method8491()) {
								local1086.method8494(arg4);
							}
							local945 = local1086;
							if (local1102.method8491()) {
								local1102.method8494(arg4);
							}
							local699 = local1102;
						} else {
							local945 = new Class4_Sub2_Sub4_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg5, arg3 + 4, arg9);
							local699 = new Class4_Sub2_Sub4_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg5, local380, arg9);
						}
						Static643.method9015(arg0, arg1, arg7, local945, local699);
						if ((local34.anInt4775 == 1 || Static573.aBoolean200 && local34.anInt4775 == -1) && !super.aBoolean199) {
							if (arg3 == 0) {
								Static265.method4292(1, arg1, local34.anInt4788, arg0, local34.anInt4734, arg7);
								Static265.method4292(2, arg1, local34.anInt4788, arg0, local34.anInt4734, arg7 + 1);
							} else if (arg3 == 1) {
								Static265.method4292(1, arg1 + 1, local34.anInt4788, arg0, local34.anInt4734, arg7);
								Static265.method4292(2, arg1, local34.anInt4788, arg0, local34.anInt4734, arg7 + 1);
							} else if (arg3 == 2) {
								Static265.method4292(1, arg1 + 1, local34.anInt4788, arg0, local34.anInt4734, arg7);
								Static265.method4292(2, arg1, local34.anInt4788, arg0, local34.anInt4734, arg7);
							} else if (arg3 == 3) {
								Static265.method4292(1, arg1, local34.anInt4788, arg0, local34.anInt4734, arg7);
								Static265.method4292(2, arg1, local34.anInt4788, arg0, local34.anInt4734, arg7);
							}
						}
						if (local34.anInt4744 != 0 && arg8 != null) {
							arg8.method8340(arg1, arg7, !local34.aBoolean351, local34.aBoolean344, arg3, arg5);
						}
						if (local34.anInt4745 != 64) {
							Static360.method5379(arg0, arg1, arg7, local34.anInt4745);
						}
					} else if (arg5 == 3) {
						if (local229) {
							local963 = new Class4_Sub2_Sub4_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg5, arg3, local190);
							local945 = local963;
							if (local963.method8491()) {
								local963.method8494(arg4);
							}
						} else {
							local945 = new Class4_Sub2_Sub4_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg5, arg3, arg9);
						}
						Static643.method9015(arg0, arg1, arg7, local945, null);
						if (local34.aBoolean347 && Static623.aBoolean741) {
							if (arg3 == 0) {
								local133.ka(arg1, arg7 + 1, 50);
							} else if (arg3 == 1) {
								local133.ka(arg1 + 1, arg7 + 1, 50);
							} else if (arg3 == 2) {
								local133.ka(arg1 + 1, arg7, 50);
							} else if (arg3 == 3) {
								local133.ka(arg1, arg7, 50);
							}
						}
						if (local34.anInt4744 != 0 && arg8 != null) {
							arg8.method8340(arg1, arg7, !local34.aBoolean351, local34.aBoolean344, arg3, arg5);
						}
					} else if (arg5 == 9) {
						if (local229) {
							local341 = new Class4_Sub2_Sub1_Sub3(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg1, arg1, arg7, arg7, arg5, arg3, local190);
							if (local341.method8491()) {
								local341.method8494(arg4);
							}
							local374 = local341;
						} else {
							local374 = new Class4_Sub2_Sub1_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg1, arg1 + local60 - 1, arg7, arg7 + local57 - 1, arg5, arg3, arg9);
						}
						Static37.method569(local374, false);
						if (local34.anInt4775 == 1 && !super.aBoolean199) {
							@Pc(1536) byte local1536;
							if ((arg3 & 0x1) == 0) {
								local1536 = 8;
							} else {
								local1536 = 16;
							}
							Static265.method4292(local1536, arg1, local34.anInt4788, arg0, 0, arg7);
						}
						if (local34.anInt4744 != 0 && arg8 != null) {
							arg8.method8338(local60, arg7, arg1, !local34.aBoolean351, local34.aBoolean344, local57);
						}
						if (local34.anInt4745 != 64) {
							Static360.method5379(arg0, arg1, arg7, local34.anInt4745);
						}
					} else {
						@Pc(1607) Class4_Sub2_Sub3 local1607;
						if (arg5 == 4) {
							if (local229) {
								@Pc(1626) Class4_Sub2_Sub3_Sub2 local1626 = new Class4_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, 0, 0, arg5, arg3);
								if (local1626.method8491()) {
									local1626.method8494(arg4);
								}
								local1607 = local1626;
							} else {
								local1607 = new Class4_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, 0, 0, arg5, arg3, arg9);
							}
							Static587.method8495(arg0, arg1, arg7, local1607, null);
						} else {
							@Pc(1650) int local1650;
							@Pc(1656) Interface22 local1656;
							@Pc(1695) Class4_Sub2_Sub3_Sub2 local1695;
							if (arg5 == 5) {
								local1650 = 65;
								local1656 = (Interface22) Static71.method1202(arg0, arg1, arg7);
								if (local1656 != null) {
									local1650 = Static61.aClass246_7.method5497(local1656.method8490()).anInt4745 + 1;
								}
								if (local229) {
									local1695 = new Class4_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, Static549.anIntArray509[arg3] * local1650, Static52.anIntArray71[arg3] * local1650, arg5, arg3);
									if (local1695.method8491()) {
										local1695.method8494(arg4);
									}
									local1607 = local1695;
								} else {
									local1607 = new Class4_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, Static549.anIntArray509[arg3] * local1650, Static52.anIntArray71[arg3] * local1650, arg5, arg3, arg9);
								}
								Static587.method8495(arg0, arg1, arg7, local1607, null);
							} else if (arg5 == 6) {
								local1650 = 33;
								local1656 = (Interface22) Static71.method1202(arg0, arg1, arg7);
								if (local1656 != null) {
									local1650 = Static61.aClass246_7.method5497(local1656.method8490()).anInt4745 / 2 + 1;
								}
								if (local229) {
									local1695 = new Class4_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, Static549.anIntArray509[arg3] * local1650, Static52.anIntArray71[arg3] * local1650, arg5, arg3 + 4);
									local1607 = local1695;
									if (local1695.method8491()) {
										local1695.method8494(arg4);
									}
								} else {
									local1607 = new Class4_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, local1650 * Static527.anIntArray498[arg3], Static43.anIntArray64[arg3] * local1650, arg5, arg3 + 4, arg9);
								}
								Static587.method8495(arg0, arg1, arg7, local1607, null);
							} else if (arg5 == 7) {
								local1650 = arg3 + 2 & 0x3;
								if (local229) {
									@Pc(1893) Class4_Sub2_Sub3_Sub2 local1893 = new Class4_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, 0, 0, arg5, local1650 + 4);
									if (local1893.method8491()) {
										local1893.method8494(arg4);
									}
									local1607 = local1893;
								} else {
									local1607 = new Class4_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, 0, 0, arg5, local1650 + 4, arg9);
								}
								Static587.method8495(arg0, arg1, arg7, local1607, null);
							} else if (arg5 == 8) {
								local380 = arg3 + 2 & 0x3;
								local440 = 33;
								@Pc(1931) Interface22 local1931 = (Interface22) Static71.method1202(arg0, arg1, arg7);
								if (local1931 != null) {
									local440 = Static61.aClass246_7.method5497(local1931.method8490()).anInt4745 / 2 + 1;
								}
								@Pc(1975) Class4_Sub2_Sub3 local1975;
								@Pc(1997) Class4_Sub2_Sub3 local1997;
								if (local229) {
									local1975 = new Class4_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, Static527.anIntArray498[arg3] * local440, local440 * Static43.anIntArray64[arg3], arg5, arg3 + 4);
									local1997 = new Class4_Sub2_Sub3_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, 0, 0, arg5, local380 + 4);
									if (local1975.method8491()) {
										local1975.method8494(arg4);
									}
									if (local1997.method8491()) {
										local1997.method8494(arg4);
									}
								} else {
									local1975 = new Class4_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, local440 * Static527.anIntArray498[arg3], Static43.anIntArray64[arg3] * local440, arg5, arg3 + 4, arg9);
									local1997 = new Class4_Sub2_Sub3_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, 0, 0, arg5, local380 + 4, arg9);
								}
								Static587.method8495(arg0, arg1, arg7, local1975, local1997);
							}
						}
					}
				}
			} else {
				if (local229) {
					local341 = new Class4_Sub2_Sub1_Sub3(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg1, local60 + arg1 - 1, arg7, local57 + arg7 - 1, arg5, arg3, local190);
					local374 = local341;
					if (local341.method8491()) {
						local341.method8494(arg4);
					}
				} else {
					local374 = new Class4_Sub2_Sub1_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg1, local60 + arg1 - 1, arg7, arg7 + local57 - 1, arg5, arg3, arg9);
				}
				Static37.method569(local374, false);
				if (Static623.aBoolean741 && !super.aBoolean199 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg0 > 0 && local34.anInt4775 != 0) {
					super.aByteArrayArrayArray13[arg0][arg1][arg7] = (byte) (super.aByteArrayArrayArray13[arg0][arg1][arg7] | 0x4);
				}
				if (local34.anInt4744 != 0 && arg8 != null) {
					arg8.method8338(local60, arg7, arg1, !local34.aBoolean351, local34.aBoolean344, local57);
				}
			}
		} else if (Static97.aClass5_Sub25_8.aClass6_Sub20_1.method6668() != 0 || local34.anInt4779 != 0 || local34.anInt4744 == 1 || local34.aBoolean343) {
			@Pc(287) Class4_Sub2_Sub2 local287;
			if (local229) {
				@Pc(304) Class4_Sub2_Sub2_Sub2 local304 = new Class4_Sub2_Sub2_Sub2(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg3, local190);
				local287 = local304;
				if (local304.method8491()) {
					local304.method8494(arg4);
				}
			} else {
				local287 = new Class4_Sub2_Sub2_Sub1(arg4, local34, arg0, arg2, local170, local161, local178, super.aBoolean199, arg3, arg9);
			}
			Static138.method2023(arg0, arg1, arg7, local287);
			if (local34.anInt4744 == 1 && arg8 != null) {
				arg8.method8344(arg7, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIILclient!up;IILclient!ha;)V")
	public void method2165(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class352 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class133 arg5) {
		@Pc(16) Interface22 local16 = this.method2167(arg4, arg3, arg0, arg1);
		if (local16 == null) {
			return;
		}
		@Pc(25) Class181 local25 = Static61.aClass246_7.method5497(local16.method8490());
		@Pc(29) int local29 = local16.method8493();
		@Pc(33) int local33 = local16.method8488();
		if (local25.method4281()) {
			Static630.method8904(arg4, arg1, local25, arg3);
		}
		if (local16.method8491()) {
			local16.method8489(arg5);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				Static623.method8835(arg4, arg1, arg3);
			} else if (arg0 == 2) {
				Static584.method8440(arg4, arg1, arg3, tw.class);
				if (local25.anInt4744 != 0 && local25.anInt4756 + arg1 < super.anInt2531 && local25.anInt4756 + arg3 < super.anInt2535 && super.anInt2531 > local25.anInt4781 + arg1 && local25.anInt4781 + arg3 < super.anInt2535) {
					arg2.method8339(arg1, arg3, local25.anInt4756, local33, local25.aBoolean344, !local25.aBoolean351, local25.anInt4781);
				}
				if (local29 == 9) {
					if ((local33 & 0x1) == 0) {
						Static178.method2713(arg4, arg1, arg3, 8);
						return;
					}
					Static178.method2713(arg4, arg1, arg3, 16);
					return;
				}
			} else {
				if (arg0 == 3) {
					Static113.method1737(arg4, arg1, arg3);
					if (local25.anInt4744 == 1) {
						arg2.method8346(arg3, arg1);
						return;
					}
				}
				return;
			}
			return;
		}
		Static116.method4811(arg4, arg1, arg3);
		if (local25.anInt4744 != 0) {
			arg2.method8335(!local25.aBoolean351, arg1, local29, local33, local25.aBoolean344, arg3);
		}
		if (local25.anInt4775 != 1) {
			return;
		}
		if (local33 == 0) {
			Static178.method2713(arg4, arg1, arg3, 1);
		} else if (local33 == 1) {
			Static178.method2713(arg4, arg1, arg3 + 1, 2);
			return;
		} else if (local33 == 2) {
			Static178.method2713(arg4, arg1 + 1, arg3, 1);
			return;
		} else if (local33 == 3) {
			Static178.method2713(arg4, arg1, arg3, 2);
			return;
		}
		return;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IZLclient!ha;)V")
	public void method2166(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class133 arg1) {
		Static479.method7067();
		if (!arg0) {
			@Pc(18) int local18;
			@Pc(22) int local22;
			if (super.anInt2524 > 1) {
				for (local18 = 0; super.anInt2531 > local18; local18++) {
					for (local22 = 0; local22 < super.anInt2535; local22++) {
						if ((Static305.aByteArrayArrayArray18[1][local18][local22] & 0x2) == 2) {
							Static228.method3853(local18, local22);
						}
					}
				}
			}
			for (local18 = 0; super.anInt2524 > local18; local18++) {
				for (local22 = 0; local22 <= super.anInt2535; local22++) {
					for (@Pc(62) int local62 = 0; local62 <= super.anInt2531; local62++) {
						if ((super.aByteArrayArrayArray13[local18][local62][local22] & 0x4) != 0) {
							@Pc(77) int local77 = local62;
							@Pc(79) int local79 = local62;
							@Pc(81) int local81 = local22;
							@Pc(83) int local83 = local22;
							while (local81 > 0 && (super.aByteArrayArrayArray13[local18][local62][local81 - 1] & 0x4) != 0 && local22 - local81 < 10) {
								local81--;
							}
							while (super.anInt2535 > local83 && (super.aByteArrayArrayArray13[local18][local62][local83 + 1] & 0x4) != 0 && local83 - local81 < 10) {
								local83++;
							}
							@Pc(142) int local142;
							label111: while (local77 > 0 && local62 - local77 < 10) {
								for (local142 = local81; local142 <= local83; local142++) {
									if ((super.aByteArrayArrayArray13[local18][local77 - 1][local142] & 0x4) == 0) {
										break label111;
									}
								}
								local77--;
							}
							label98: while (local79 < super.anInt2531 && local79 - local77 < 10) {
								for (local142 = local81; local142 <= local83; local142++) {
									if ((super.aByteArrayArrayArray13[local18][local79 + 1][local142] & 0x4) == 0) {
										break label98;
									}
								}
								local79++;
							}
							if ((local79 + 1 - local77) * (local83 - (local81 - 1)) >= 4) {
								local142 = super.anIntArrayArrayArray2[local18][local77][local81];
								Static483.method7167((local83 << 9) + 512, local81 << 9, local77 << 9, local18, local142, local142, (local79 << 9) + 512);
								for (@Pc(270) int local270 = local77; local270 <= local79; local270++) {
									for (@Pc(274) int local274 = local81; local274 <= local83; local274++) {
										super.aByteArrayArrayArray13[local18][local270][local274] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static542.method7942();
		}
		super.aByteArrayArrayArray13 = null;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIZ)Lclient!tw;")
	private Interface22 method2167(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(5) Interface22 local5 = null;
		if (arg2 == 0) {
			local5 = (Interface22) Static71.method1202(arg0, arg3, arg1);
		}
		if (arg2 == 1) {
			local5 = (Interface22) Static214.method3665(arg0, arg3, arg1);
		}
		if (arg2 == 2) {
			local5 = (Interface22) Static217.method3700(arg0, arg3, arg1, tw.class);
		}
		if (arg2 == 3) {
			local5 = (Interface22) Static614.method8756(arg0, arg3, arg1);
		}
		return local5;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(BIIIILclient!ofa;Lclient!ha;III[I)V")
	public void method2168(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class5_Sub22 arg4, @OriginalArg(6) Class133 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int[] arg9) {
		if (super.aBoolean199) {
			return;
		}
		@Pc(13) Class48 local13 = null;
		if (arg9 != null) {
			arg9[0] = -1;
		}
		@Pc(25) int local25 = (arg2 & 0x7) * 8;
		@Pc(31) int local31 = (arg0 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(63) int local63;
						@Pc(409) int local409;
						@Pc(102) int local102;
						@Pc(106) int local106;
						while (arg4.anInt6629 < arg4.aByteArray71.length) {
							@Pc(36) int local36 = arg4.method5966();
							if (local36 == 0) {
								local13 = new Class48(arg4);
							} else {
								@Pc(238) int local238;
								@Pc(117) int local117;
								@Pc(121) int local121;
								@Pc(160) int local160;
								if (local36 == 1) {
									local63 = arg4.method5966();
									if (local63 > 0) {
										for (local409 = 0; local409 < local63; local409++) {
											@Pc(418) Class174 local418 = new Class174(arg5, arg4, 2);
											if (local418.anInt4609 == 31) {
												@Pc(431) Class215 local431 = Static124.aClass84_1.method1739(arg4.method5968());
												local418.method4178(local431.anInt5426, local431.anInt5429, local431.anInt5427, local431.anInt5424);
											}
											if (arg5.method7245() > 0) {
												@Pc(448) Class5_Sub11 local448 = local418.aClass5_Sub11_2;
												local238 = local448.method8103() >> 9;
												local117 = local448.method8098() >> 9;
												if (arg1 == local418.anInt4603 && local238 >= local25 && local238 < local25 + 8 && local117 >= local31 && local31 + 8 > local117) {
													local121 = (arg7 << 9) + Static292.method4582(local448.method8098() & 0xFFF, local448.method8103() & 0xFFF, arg8);
													local160 = (arg6 << 9) + Static182.method2793(local448.method8098() & 0xFFF, arg8, local448.method8103() & 0xFFF);
													local238 = local121 >> 9;
													local117 = local160 >> 9;
													if (local238 >= 0 && local117 >= 0 && local238 < super.anInt2531 && super.anInt2535 > local117) {
														local448.method8094(local121, local160, super.anIntArrayArrayArray2[arg1][local238][local117] - local448.method8096());
														Static606.method8670(local418);
													}
												}
											}
										}
									}
								} else if (local36 == 2) {
									if (local13 == null) {
										local13 = new Class48();
									}
									local13.method1050(arg4);
								} else if (local36 != 128) {
									if (local36 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray14 == null) {
										super.aByteArrayArrayArray14 = new byte[4][][];
									}
									for (local63 = 0; local63 < 4; local63++) {
										@Pc(69) byte local69 = arg4.method5963();
										if (local69 == 0 && super.aByteArrayArrayArray14[arg3] != null) {
											if (local63 <= arg1) {
												local102 = arg7;
												local106 = arg7 + 7;
												local238 = arg6;
												if (arg7 < 0) {
													local102 = 0;
												} else if (arg7 >= super.anInt2531) {
													local102 = super.anInt2531;
												}
												if (arg6 < 0) {
													local238 = 0;
												} else if (super.anInt2535 <= arg6) {
													local238 = super.anInt2535;
												}
												if (local106 < 0) {
													local106 = 0;
												} else if (local106 >= super.anInt2531) {
													local106 = super.anInt2531;
												}
												local117 = arg6 + 7;
												if (local117 < 0) {
													local117 = 0;
												} else if (super.anInt2535 <= local117) {
													local117 = super.anInt2535;
												}
												while (local106 > local102) {
													while (local117 > local238) {
														super.aByteArrayArrayArray14[arg3][local102][local238] = 0;
														local238++;
													}
													local102++;
												}
											}
										} else if (local69 == 1) {
											if (super.aByteArrayArrayArray14[arg3] == null) {
												super.aByteArrayArrayArray14[arg3] = new byte[super.anInt2531 + 1][super.anInt2535 + 1];
											}
											for (local102 = 0; local102 < 64; local102 += 4) {
												for (local106 = 0; local106 < 64; local106 += 4) {
													@Pc(112) byte local112 = arg4.method5963();
													if (local63 <= arg1) {
														for (local117 = local102; local117 < local102 + 4; local117++) {
															for (local121 = local106; local121 < local106 + 4; local121++) {
																if (local25 <= local117 && local117 < local25 + 8 && local31 <= local121 && local31 + 8 > local31) {
																	local160 = arg7 + Static337.method5087(local117 & 0x7, local121 & 0x7, arg8);
																	@Pc(172) int local172 = Static442.method6692(local121 & 0x7, local117 & 0x7, arg8) + arg6;
																	if (local160 >= 0 && local160 < super.anInt2531 && local172 >= 0 && super.anInt2535 > local172) {
																		super.aByteArrayArrayArray14[arg3][local160][local172] = local112;
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								} else if (arg9 == null) {
									arg4.anInt6629 += 10;
								} else {
									arg9[0] = arg4.method5968();
									arg9[1] = arg4.method5956();
									arg9[2] = arg4.method5956();
									arg9[3] = arg4.method5956();
									arg9[4] = arg4.method5968();
								}
							}
						}
						if (local13 != null) {
							Static147.method2183(arg7 >> 3, local13, arg6 >> 3);
						}
						if (super.aByteArrayArrayArray14 != null && super.aByteArrayArrayArray14[arg3] != null) {
							local63 = arg7 + 7;
							local409 = arg6 + 7;
							for (local102 = arg7; local102 < local63; local102++) {
								for (local106 = arg6; local106 < local409; local106++) {
									super.aByteArrayArrayArray14[arg3][local102][local106] = 0;
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

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "([Lclient!up;ILclient!ha;I[BI)V")
	public void method2169(@OriginalArg(0) Class352[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class5_Sub22 local10 = new Class5_Sub22(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(18) int local18 = local10.method5920();
			if (local18 == 0) {
				return;
			}
			local12 += local18;
			@Pc(26) int local26 = 0;
			while (true) {
				@Pc(30) int local30 = local10.method5947();
				if (local30 == 0) {
					break;
				}
				local26 += local30 - 1;
				@Pc(45) int local45 = local26 & 0x3F;
				@Pc(51) int local51 = local26 >> 6 & 0x3F;
				@Pc(55) int local55 = local26 >> 12;
				@Pc(61) int local61 = local10.method5966();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = arg4 + local51;
				@Pc(77) int local77 = local45 + arg1;
				if (local73 > 0 && local77 > 0 && super.anInt2531 - 1 > local73 && local77 < super.anInt2535 - 1) {
					@Pc(102) Class352 local102 = null;
					if (!super.aBoolean199) {
						@Pc(107) int local107 = local55;
						if ((Static305.aByteArrayArrayArray18[1][local73][local77] & 0x2) == 2) {
							local107 = local55 - 1;
						}
						if (local107 >= 0) {
							local102 = arg0[local107];
						}
					}
					this.method2164(local55, local73, local55, local69, arg2, local65, local12, local77, local102, -1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIII[BLclient!ha;II[Lclient!up;I)V")
	public void method2171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) Class133 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class352[] arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class5_Sub22 local10 = new Class5_Sub22(arg4);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method5920();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method5947();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(43) int local43 = local24 & 0x3F;
				@Pc(49) int local49 = local24 >> 6 & 0x3F;
				@Pc(53) int local53 = local24 >> 12;
				@Pc(57) int local57 = local10.method5966();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (arg1 == local53 && arg6 <= local49 && local49 < arg6 + 8 && arg0 <= local43 && arg0 + 8 > local43) {
					@Pc(99) Class181 local99 = Static61.aClass246_7.method5497(local12);
					@Pc(117) int local117 = arg9 + Static10.method202(local99.anInt4781, local49 & 0x7, arg2, local43 & 0x7, local65, local99.anInt4756);
					@Pc(135) int local135 = arg7 + Static79.method1358(local49 & 0x7, local65, local43 & 0x7, local99.anInt4756, arg2, local99.anInt4781);
					if (local117 > 0 && local135 > 0 && super.anInt2531 - 1 > local117 && local135 < super.anInt2535 - 1) {
						@Pc(164) Class352 local164 = null;
						if (!super.aBoolean199) {
							@Pc(169) int local169 = arg3;
							if ((Static305.aByteArrayArrayArray18[1][local117][local135] & 0x2) == 2) {
								local169 = arg3 - 1;
							}
							if (local169 >= 0) {
								local164 = arg8[local169];
							}
						}
						this.method2164(arg3, local117, arg3, local65 + arg2 & 0x3, arg5, local61, local12, local135, local164, -1);
					}
				}
			}
		}
	}
}
