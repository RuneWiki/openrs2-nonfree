import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class309_Sub1 extends Class309 {

	@OriginalMember(owner = "client!sa", name = "M", descriptor = "I")
	public int anInt8275 = 99;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(IIIZ)V")
	public Class309_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static49.aClass216_1, Static400.aClass270_5);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ha;[IIIIIIIILclient!sl;I)V")
	public void method7104(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class2_Sub17 arg9) {
		if (super.aBoolean603) {
			return;
		}
		@Pc(13) Class299 local13 = null;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(25) int local25 = (arg2 & 0x7) * 8;
		@Pc(36) int local36 = (arg4 & 0x7) * 8;
		while (true) {
			@Pc(53) int local53;
			@Pc(112) int local112;
			@Pc(158) int local158;
			@Pc(176) int local176;
			@Pc(60) int local60;
			@Pc(106) int local106;
			label233: do {
				while (true) {
					@Pc(41) int local41;
					@Pc(344) int local344;
					while (arg9.aByteArray26.length > arg9.anInt3378) {
						local41 = arg9.method2859();
						if (local41 == 0) {
							local13 = new Class299(arg9);
						} else {
							if (local41 == 1) {
								local53 = arg9.method2859();
								continue label233;
							}
							if (local41 == 2) {
								if (local13 == null) {
									local13 = new Class299();
								}
								local13.method6912(arg9);
							} else if (local41 != 128) {
								if (local41 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray10 == null) {
									super.aByteArrayArrayArray10 = new byte[4][][];
								}
								for (local53 = 0; local53 < 4; local53++) {
									@Pc(309) byte local309 = arg9.method2860();
									@Pc(348) int local348;
									if (local309 == 0 && super.aByteArrayArrayArray10[arg7] != null) {
										if (arg5 >= local53) {
											local344 = arg6;
											local348 = arg6 + 7;
											local106 = arg8;
											if (arg8 < 0) {
												local106 = 0;
											} else if (arg8 >= super.anInt8259) {
												local106 = super.anInt8259;
											}
											if (arg6 < 0) {
												local344 = 0;
											} else if (arg6 >= super.anInt8252) {
												local344 = super.anInt8252;
											}
											if (local348 < 0) {
												local348 = 0;
											} else if (local348 >= super.anInt8252) {
												local348 = super.anInt8252;
											}
											local112 = arg8 + 7;
											if (local112 < 0) {
												local112 = 0;
											} else if (local112 >= super.anInt8259) {
												local112 = super.anInt8259;
											}
											while (local344 < local348) {
												while (local112 > local106) {
													super.aByteArrayArrayArray10[arg7][local344][local106] = 0;
													local106++;
												}
												local344++;
											}
										}
									} else if (local309 == 1) {
										if (super.aByteArrayArrayArray10[arg7] == null) {
											super.aByteArrayArrayArray10[arg7] = new byte[super.anInt8252 + 1][super.anInt8259 + 1];
										}
										for (local344 = 0; local344 < 64; local344 += 4) {
											for (local348 = 0; local348 < 64; local348 += 4) {
												@Pc(354) byte local354 = arg9.method2860();
												if (arg5 >= local53) {
													for (local112 = local344; local112 < local344 + 4; local112++) {
														for (local158 = local348; local158 < local348 + 4; local158++) {
															if (local112 >= local25 && local112 < local25 + 8 && local158 >= local36 && local36 + 8 > local36) {
																local176 = Static535.method7427(local158 & 0x7, local112 & 0x7, arg3) + arg6;
																@Pc(414) int local414 = arg8 + Static501.method6963(local112 & 0x7, arg3, local158 & 0x7);
																if (local176 >= 0 && super.anInt8252 > local176 && local414 >= 0 && local414 < super.anInt8259) {
																	super.aByteArrayArrayArray10[arg7][local176][local414] = local354;
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
								arg9.anInt3378 += 10;
							} else {
								arg1[0] = arg9.method2825();
								arg1[1] = arg9.method2836();
								arg1[2] = arg9.method2836();
								arg1[3] = arg9.method2836();
								arg1[4] = arg9.method2825();
							}
						}
					}
					if (local13 != null) {
						Static35.method850(arg6 >> 3, arg8 >> 3, local13);
					}
					if (super.aByteArrayArrayArray10 != null && super.aByteArrayArrayArray10[arg7] != null) {
						local41 = arg6 + 7;
						local53 = arg8 + 7;
						for (local60 = arg6; local60 < local41; local60++) {
							for (local344 = arg8; local344 < local53; local344++) {
								super.aByteArrayArrayArray10[arg7][local60][local344] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local53 <= 0);
			for (local60 = 0; local60 < local53; local60++) {
				@Pc(69) Class342 local69 = new Class342(arg0, arg9, 2);
				if (local69.anInt9284 == 31) {
					@Pc(80) Class359 local80 = Static341.aClass147_1.method3535(arg9.method2825());
					local69.method7897(local80.anInt9919, local80.anInt9921, local80.anInt9926, local80.anInt9922);
				}
				if (arg0.method8089() > 0) {
					@Pc(100) Class2_Sub12 local100 = local69.aClass2_Sub12_1;
					local106 = local100.method7415() >> 9;
					local112 = local100.method7421() >> 9;
					if (local69.anInt9281 == arg5 && local25 <= local106 && local25 + 8 > local106 && local36 <= local112 && local36 + 8 > local112) {
						local158 = (arg6 << 9) + Static458.method4354(local100.method7415() & 0xFFF, arg3, local100.method7421() & 0xFFF);
						local176 = (arg8 << 9) + Static599.method8435(arg3, local100.method7421() & 0xFFF, local100.method7415() & 0xFFF);
						local106 = local158 >> 9;
						local112 = local176 >> 9;
						if (local106 >= 0 && local112 >= 0 && super.anInt8252 > local106 && local112 < super.anInt8259) {
							local100.method7419(super.anIntArrayArrayArray17[arg5][local106][local112] - local100.method7420(), local176, local158);
							Static470.method6668(local69);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIBLclient!ha;Lclient!je;I)V")
	public void method7105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class13 arg3, @OriginalArg(5) Class175 arg4, @OriginalArg(6) int arg5) {
		@Pc(13) Interface25 local13 = this.method7107(arg1, arg0, arg5, arg2);
		if (local13 == null) {
			return;
		}
		@Pc(22) Class5 local22 = Static79.aClass304_2.method6956(local13.method6207());
		@Pc(26) int local26 = local13.method6212();
		@Pc(30) int local30 = local13.method6210();
		if (local22.method80()) {
			Static129.method2294(arg1, arg2, local22, arg5);
		}
		if (local13.method6211()) {
			local13.method6213(arg3);
		}
		if (arg0 == 0) {
			Static333.method5064(arg2, arg5, arg1);
			if (local22.anInt102 != 0) {
				arg4.method4285(local30, arg1, !local22.aBoolean4, arg5, local26, local22.aBoolean8);
			}
			if (local22.anInt82 == 1) {
				if (local30 == 0) {
					Static548.method7572(arg2, 1, arg5, arg1);
				} else if (local30 == 1) {
					Static548.method7572(arg2, 2, arg5, arg1 + 1);
				} else if (local30 == 2) {
					Static548.method7572(arg2, 1, arg5 + 1, arg1);
				} else if (local30 == 3) {
					Static548.method7572(arg2, 2, arg5, arg1);
				}
			}
		} else if (arg0 == 1) {
			Static171.method2967(arg2, arg5, arg1);
		} else if (arg0 == 2) {
			Static298.method4713(arg2, arg5, arg1, rca.class);
			if (local22.anInt102 != 0 && local22.anInt67 + arg5 < super.anInt8252 && local22.anInt67 + arg1 < super.anInt8259 && super.anInt8252 > local22.anInt72 + arg5 && super.anInt8259 > arg1 + local22.anInt72) {
				arg4.method4290(local22.anInt67, arg1, local30, !local22.aBoolean4, local22.aBoolean8, arg5, local22.anInt72);
			}
			if (local26 == 9) {
				if ((local30 & 0x1) == 0) {
					Static548.method7572(arg2, 8, arg5, arg1);
				} else {
					Static548.method7572(arg2, 16, arg5, arg1);
				}
			}
		} else if (arg0 == 3) {
			Static165.method2814(arg2, arg5, arg1);
			if (local22.anInt102 == 1) {
				arg4.method4293(arg5, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(BIIII)Lclient!rca;")
	public Interface25 method7107(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(5) Interface25 local5 = null;
		if (arg1 == 0) {
			local5 = (Interface25) Static587.method8331(arg3, arg2, arg0);
		}
		if (arg1 == 1) {
			local5 = (Interface25) Static212.method3540(arg3, arg2, arg0);
		}
		if (arg1 == 2) {
			local5 = (Interface25) Static22.method567(arg3, arg2, arg0, rca.class);
		}
		if (arg1 == 3) {
			local5 = (Interface25) Static366.method5446(arg3, arg2, arg0);
		}
		return local5;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lclient!ha;IIIIZI[Lclient!je;II[B)V")
	public void method7108(@OriginalArg(0) Class13 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class175[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(10) Class2_Sub17 local10 = new Class2_Sub17(arg9);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(27) int local27 = local10.method2880();
			if (local27 == 0) {
				return;
			}
			local12 += local27;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(42) int local42 = local10.method2853();
				if (local42 == 0) {
					break;
				}
				local38 += local42 - 1;
				@Pc(57) int local57 = local38 & 0x3F;
				@Pc(63) int local63 = local38 >> 6 & 0x3F;
				@Pc(67) int local67 = local38 >> 12;
				@Pc(71) int local71 = local10.method2859();
				@Pc(75) int local75 = local71 >> 2;
				@Pc(79) int local79 = local71 & 0x3;
				if (arg2 == local67 && local63 >= arg7 && arg7 + 8 > local63 && arg8 <= local57 && arg8 + 8 > local57) {
					@Pc(107) Class5 local107 = Static79.aClass304_2.method6956(local12);
					@Pc(124) int local124 = Static215.method3553(local79, local63 & 0x7, local107.anInt72, local57 & 0x7, arg1, local107.anInt67) + arg4;
					@Pc(141) int local141 = Static162.method2782(local79, local57 & 0x7, local107.anInt72, local107.anInt67, local63 & 0x7, arg1) + arg3;
					if (local124 > 0 && local141 > 0 && local124 < super.anInt8252 - 1 && super.anInt8259 - 1 > local141) {
						@Pc(166) Class175 local166 = null;
						if (!super.aBoolean603) {
							@Pc(171) int local171 = arg5;
							if ((Static372.aByteArrayArrayArray3[1][local124][local141] & 0x2) == 2) {
								local171 = arg5 - 1;
							}
							if (local171 >= 0) {
								local166 = arg6[local171];
							}
						}
						this.method7109(-1, local124, arg5, local166, local79 + arg1 & 0x3, local141, arg5, local75, arg0, local12);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIILclient!je;IBIIILclient!ha;I)V")
	public void method7109(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class175 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class13 arg8, @OriginalArg(10) int arg9) {
		if (Static305.aClass2_Sub49_15.aClass33_Sub27_1.method8670() == 0 && !Static168.method2928(arg6, arg1, arg5, Static245.anInt4753)) {
			return;
		}
		if (this.anInt8275 > arg2) {
			this.anInt8275 = arg2;
		}
		@Pc(32) Class5 local32 = Static79.aClass304_2.method6956(arg9);
		if (Static305.aClass2_Sub49_15.aClass33_Sub2_1.method1432() == 0 && local32.aBoolean16) {
			return;
		}
		@Pc(50) int local50;
		@Pc(53) int local53;
		if (arg4 == 1 || arg4 == 3) {
			local50 = local32.anInt72;
			local53 = local32.anInt67;
		} else {
			local50 = local32.anInt67;
			local53 = local32.anInt72;
		}
		@Pc(78) int local78;
		@Pc(76) int local76;
		if (arg1 + local50 > super.anInt8252) {
			local76 = arg1 + 1;
			local78 = arg1;
		} else {
			local78 = (local50 >> 1) + arg1;
			local76 = arg1 + (local50 + 1 >> 1);
		}
		@Pc(114) int local114;
		@Pc(108) int local108;
		if (super.anInt8259 >= local53 + arg5) {
			local108 = arg5 + (local53 + 1 >> 1);
			local114 = (local53 >> 1) + arg5;
		} else {
			local114 = arg5;
			local108 = arg5 + 1;
		}
		@Pc(126) Class91 local126 = Static511.aClass91Array3[arg6];
		@Pc(153) int local153 = local126.method7447(local114, local78) + local126.method7447(local114, local76) + local126.method7447(local108, local78) + local126.method7447(local108, local76) >> 2;
		@Pc(162) int local162 = (arg1 << 9) + (local50 << 8);
		@Pc(171) int local171 = (arg5 << 9) + (local53 << 8);
		@Pc(183) boolean local183 = Static169.aBoolean264 && !super.aBoolean603 && local32.aBoolean10;
		if (local32.method80()) {
			Static264.method4366((Class16_Sub1_Sub1_Sub3_Sub2) null, local32, (Class16_Sub1_Sub1_Sub3_Sub1) null, arg4, arg2, arg5, arg1);
		}
		@Pc(221) boolean local221 = arg0 == -1 && local32.lb == -1 && local32.anIntArray11 == null && local32.anIntArray9 == null && !local32.aBoolean14 && !local32.aBoolean5;
		if (Static144.aBoolean236 && (Static275.method4478(arg7) && local32.anInt82 != 1 || !(!Static418.method6112(arg7) || local32.anInt82 != 0))) {
			return;
		}
		if (arg7 != 22) {
			@Pc(384) Class16_Sub1_Sub1 local384;
			@Pc(345) Class16_Sub1_Sub1_Sub1 local345;
			@Pc(382) int local382;
			@Pc(443) int local443;
			if (arg7 == 10 || arg7 == 11) {
				local345 = null;
				if (local221) {
					@Pc(376) Class16_Sub1_Sub1_Sub1 local376 = new Class16_Sub1_Sub1_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg1, local50 + arg1 - 1, arg5, arg5 + local53 - 1, arg7, arg4, local183);
					local345 = local376;
					local382 = local376.method513();
					local384 = local376;
				} else {
					local382 = 15;
					local384 = new Class16_Sub1_Sub1_Sub4(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg1, arg1 + local50 - 1, arg5, local53 + arg5 - 1, arg7, arg4, arg0);
				}
				if (Static196.method3387(local384, false)) {
					if (local345 != null && local345.method6211()) {
						local345.method6208(arg8);
					}
					if (local32.aBoolean9 && Static169.aBoolean264) {
						if (local382 > 30) {
							local382 = 30;
						}
						for (local443 = 0; local443 <= local50; local443++) {
							for (@Pc(447) int local447 = 0; local447 <= local53; local447++) {
								local126.ka(local443 + arg1, local447 + arg5, local382);
							}
						}
					}
				}
				if (local32.anInt102 != 0 && arg3 != null) {
					arg3.method4302(local53, arg5, local32.aBoolean8, !local32.aBoolean4, arg1, local50);
				}
			} else if (arg7 >= 12 && arg7 <= 17 || arg7 >= 18 && arg7 <= 21) {
				if (local221) {
					local345 = new Class16_Sub1_Sub1_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg1, arg1 + local50 - 1, arg5, arg5 + local53 - 1, arg7, arg4, local183);
					if (local345.method6211()) {
						local345.method6208(arg8);
					}
					local384 = local345;
				} else {
					local384 = new Class16_Sub1_Sub1_Sub4(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg1, local50 + arg1 - 1, arg5, local53 + arg5 - 1, arg7, arg4, arg0);
				}
				Static196.method3387(local384, false);
				if (Static169.aBoolean264 && !super.aBoolean603 && arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg2 > 0 && local32.anInt82 != 0) {
					super.aByteArrayArrayArray13[arg2][arg1][arg5] = (byte) (super.aByteArrayArrayArray13[arg2][arg1][arg5] | 0x4);
				}
				if (local32.anInt102 != 0 && arg3 != null) {
					arg3.method4302(local53, arg5, local32.aBoolean8, !local32.aBoolean4, arg1, local50);
				}
			} else {
				@Pc(690) Class16_Sub1_Sub2 local690;
				if (arg7 == 0) {
					@Pc(662) int local662 = local32.anInt82;
					if (Static228.aBoolean310 && local32.anInt82 == -1) {
						local662 = 1;
					}
					if (local221) {
						@Pc(688) Class16_Sub1_Sub2_Sub2 local688 = new Class16_Sub1_Sub2_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg7, arg4, local183);
						local690 = local688;
						if (local688.method6211()) {
							local688.method6208(arg8);
						}
					} else {
						local690 = new Class16_Sub1_Sub2_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg7, arg4, arg0);
					}
					Static526.method7307(arg2, arg1, arg5, local690, (Class16_Sub1_Sub2) null);
					if (arg4 == 0) {
						if (Static169.aBoolean264 && local32.aBoolean9) {
							local126.ka(arg1, arg5, 50);
							local126.ka(arg1, arg5 + 1, 50);
						}
						if (local662 == 1 && !super.aBoolean603) {
							Static50.method1210(arg5, local32.anInt77, arg2, 1, local32.anInt91, arg1);
						}
					} else if (arg4 == 1) {
						if (Static169.aBoolean264 && local32.aBoolean9) {
							local126.ka(arg1, arg5 + 1, 50);
							local126.ka(arg1 + 1, arg5 + 1, 50);
						}
						if (local662 == 1 && !super.aBoolean603) {
							Static50.method1210(arg5 + 1, -local32.anInt77, arg2, 2, local32.anInt91, arg1);
						}
					} else if (arg4 == 2) {
						if (Static169.aBoolean264 && local32.aBoolean9) {
							local126.ka(arg1 + 1, arg5, 50);
							local126.ka(arg1 + 1, arg5 + 1, 50);
						}
						if (local662 == 1 && !super.aBoolean603) {
							Static50.method1210(arg5, -local32.anInt77, arg2, 1, local32.anInt91, arg1 + 1);
						}
					} else if (arg4 == 3) {
						if (Static169.aBoolean264 && local32.aBoolean9) {
							local126.ka(arg1, arg5, 50);
							local126.ka(arg1 + 1, arg5, 50);
						}
						if (local662 == 1 && !super.aBoolean603) {
							Static50.method1210(arg5, local32.anInt77, arg2, 2, local32.anInt91, arg1);
						}
					}
					if (local32.anInt102 != 0 && arg3 != null) {
						arg3.method4296(arg4, !local32.aBoolean4, local32.aBoolean8, arg1, arg7, arg5);
					}
					if (local32.anInt58 != 64) {
						Static290.method4607(arg2, arg1, arg5, local32.anInt58);
					}
				} else {
					@Pc(945) Class16_Sub1_Sub2 local945;
					@Pc(963) Class16_Sub1_Sub2_Sub2 local963;
					if (arg7 == 1) {
						if (local221) {
							local963 = new Class16_Sub1_Sub2_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg7, arg4, local183);
							if (local963.method6211()) {
								local963.method6208(arg8);
							}
							local945 = local963;
						} else {
							local945 = new Class16_Sub1_Sub2_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg7, arg4, arg0);
						}
						Static526.method7307(arg2, arg1, arg5, local945, (Class16_Sub1_Sub2) null);
						if (local32.aBoolean9 && Static169.aBoolean264) {
							if (arg4 == 0) {
								local126.ka(arg1, arg5 + 1, 50);
							} else if (arg4 == 1) {
								local126.ka(arg1 + 1, arg5 + 1, 50);
							} else if (arg4 == 2) {
								local126.ka(arg1 + 1, arg5, 50);
							} else if (arg4 == 3) {
								local126.ka(arg1, arg5, 50);
							}
						}
						if (local32.anInt102 != 0 && arg3 != null) {
							arg3.method4296(arg4, !local32.aBoolean4, local32.aBoolean8, arg1, arg7, arg5);
						}
					} else if (arg7 == 2) {
						local382 = arg4 + 1 & 0x3;
						if (local221) {
							@Pc(1124) Class16_Sub1_Sub2_Sub2 local1124 = new Class16_Sub1_Sub2_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg7, arg4 + 4, local183);
							@Pc(1140) Class16_Sub1_Sub2_Sub2 local1140 = new Class16_Sub1_Sub2_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg7, local382, local183);
							if (local1124.method6211()) {
								local1124.method6208(arg8);
							}
							local945 = local1124;
							if (local1140.method6211()) {
								local1140.method6208(arg8);
							}
							local690 = local1140;
						} else {
							local945 = new Class16_Sub1_Sub2_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg7, arg4 + 4, arg0);
							local690 = new Class16_Sub1_Sub2_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg7, local382, arg0);
						}
						Static526.method7307(arg2, arg1, arg5, local945, local690);
						if ((local32.anInt82 == 1 || Static228.aBoolean310 && local32.anInt82 == -1) && !super.aBoolean603) {
							if (arg4 == 0) {
								Static50.method1210(arg5, local32.anInt77, arg2, 1, local32.anInt91, arg1);
								Static50.method1210(arg5 + 1, local32.anInt77, arg2, 2, local32.anInt91, arg1);
							} else if (arg4 == 1) {
								Static50.method1210(arg5, local32.anInt77, arg2, 1, local32.anInt91, arg1 + 1);
								Static50.method1210(arg5 + 1, local32.anInt77, arg2, 2, local32.anInt91, arg1);
							} else if (arg4 == 2) {
								Static50.method1210(arg5, local32.anInt77, arg2, 1, local32.anInt91, arg1 + 1);
								Static50.method1210(arg5, local32.anInt77, arg2, 2, local32.anInt91, arg1);
							} else if (arg4 == 3) {
								Static50.method1210(arg5, local32.anInt77, arg2, 1, local32.anInt91, arg1);
								Static50.method1210(arg5, local32.anInt77, arg2, 2, local32.anInt91, arg1);
							}
						}
						if (local32.anInt102 != 0 && arg3 != null) {
							arg3.method4296(arg4, !local32.aBoolean4, local32.aBoolean8, arg1, arg7, arg5);
						}
						if (local32.anInt58 != 64) {
							Static290.method4607(arg2, arg1, arg5, local32.anInt58);
						}
					} else if (arg7 == 3) {
						if (local221) {
							local963 = new Class16_Sub1_Sub2_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg7, arg4, local183);
							if (local963.method6211()) {
								local963.method6208(arg8);
							}
							local945 = local963;
						} else {
							local945 = new Class16_Sub1_Sub2_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg7, arg4, arg0);
						}
						Static526.method7307(arg2, arg1, arg5, local945, (Class16_Sub1_Sub2) null);
						if (local32.aBoolean9 && Static169.aBoolean264) {
							if (arg4 == 0) {
								local126.ka(arg1, arg5 + 1, 50);
							} else if (arg4 == 1) {
								local126.ka(arg1 + 1, arg5 + 1, 50);
							} else if (arg4 == 2) {
								local126.ka(arg1 + 1, arg5, 50);
							} else if (arg4 == 3) {
								local126.ka(arg1, arg5, 50);
							}
						}
						if (local32.anInt102 != 0 && arg3 != null) {
							arg3.method4296(arg4, !local32.aBoolean4, local32.aBoolean8, arg1, arg7, arg5);
						}
					} else if (arg7 == 9) {
						if (local221) {
							local345 = new Class16_Sub1_Sub1_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg1, arg1, arg5, arg5, arg7, arg4, local183);
							if (local345.method6211()) {
								local345.method6208(arg8);
							}
							local384 = local345;
						} else {
							local384 = new Class16_Sub1_Sub1_Sub4(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg1, arg1 + local50 - 1, arg5, local53 + arg5 - 1, arg7, arg4, arg0);
						}
						Static196.method3387(local384, false);
						if (local32.anInt82 == 1 && !super.aBoolean603) {
							@Pc(1549) byte local1549;
							if ((arg4 & 0x1) == 0) {
								local1549 = 8;
							} else {
								local1549 = 16;
							}
							Static50.method1210(arg5, 0, arg2, local1549, local32.anInt91, arg1);
						}
						if (local32.anInt102 != 0 && arg3 != null) {
							arg3.method4302(local53, arg5, local32.aBoolean8, !local32.aBoolean4, arg1, local50);
						}
						if (local32.anInt58 != 64) {
							Static290.method4607(arg2, arg1, arg5, local32.anInt58);
						}
					} else {
						@Pc(1617) Class16_Sub1_Sub4 local1617;
						if (arg7 == 4) {
							if (local221) {
								@Pc(1615) Class16_Sub1_Sub4_Sub1 local1615 = new Class16_Sub1_Sub4_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, 0, 0, arg7, arg4);
								local1617 = local1615;
								if (local1615.method6211()) {
									local1615.method6208(arg8);
								}
							} else {
								local1617 = new Class16_Sub1_Sub4_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, 0, 0, arg7, arg4, arg0);
							}
							Static62.method6049(arg2, arg1, arg5, local1617, (Class16_Sub1_Sub4) null);
						} else {
							@Pc(1657) int local1657;
							@Pc(1663) Interface25 local1663;
							@Pc(1702) Class16_Sub1_Sub4_Sub1 local1702;
							if (arg7 == 5) {
								local1657 = 65;
								local1663 = (Interface25) Static587.method8331(arg2, arg1, arg5);
								if (local1663 != null) {
									local1657 = Static79.aClass304_2.method6956(local1663.method6207()).anInt58 + 1;
								}
								if (local221) {
									local1702 = new Class16_Sub1_Sub4_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, Static389.anIntArray442[arg4] * local1657, Static540.anIntArray647[arg4] * local1657, arg7, arg4);
									local1617 = local1702;
									if (local1702.method6211()) {
										local1702.method6208(arg8);
									}
								} else {
									local1617 = new Class16_Sub1_Sub4_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, Static389.anIntArray442[arg4] * local1657, local1657 * Static540.anIntArray647[arg4], arg7, arg4, arg0);
								}
								Static62.method6049(arg2, arg1, arg5, local1617, (Class16_Sub1_Sub4) null);
							} else if (arg7 == 6) {
								local1657 = 33;
								local1663 = (Interface25) Static587.method8331(arg2, arg1, arg5);
								if (local1663 != null) {
									local1657 = Static79.aClass304_2.method6956(local1663.method6207()).anInt58 / 2 + 1;
								}
								if (local221) {
									local1702 = new Class16_Sub1_Sub4_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, local1657 * Static389.anIntArray442[arg4], Static540.anIntArray647[arg4] * local1657, arg7, arg4 + 4);
									if (local1702.method6211()) {
										local1702.method6208(arg8);
									}
									local1617 = local1702;
								} else {
									local1617 = new Class16_Sub1_Sub4_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, local1657 * Static524.anIntArray626[arg4], Static108.anIntArray176[arg4] * local1657, arg7, arg4 + 4, arg0);
								}
								Static62.method6049(arg2, arg1, arg5, local1617, (Class16_Sub1_Sub4) null);
							} else if (arg7 == 7) {
								local1657 = arg4 + 2 & 0x3;
								if (local221) {
									@Pc(1904) Class16_Sub1_Sub4_Sub1 local1904 = new Class16_Sub1_Sub4_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, 0, 0, arg7, local1657 + 4);
									if (local1904.method6211()) {
										local1904.method6208(arg8);
									}
									local1617 = local1904;
								} else {
									local1617 = new Class16_Sub1_Sub4_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, 0, 0, arg7, local1657 + 4, arg0);
								}
								Static62.method6049(arg2, arg1, arg5, local1617, (Class16_Sub1_Sub4) null);
							} else if (arg7 == 8) {
								local382 = arg4 + 2 & 0x3;
								local443 = 33;
								@Pc(1940) Interface25 local1940 = (Interface25) Static587.method8331(arg2, arg1, arg5);
								if (local1940 != null) {
									local443 = Static79.aClass304_2.method6956(local1940.method6207()).anInt58 / 2 + 1;
								}
								@Pc(1984) Class16_Sub1_Sub4 local1984;
								@Pc(2006) Class16_Sub1_Sub4 local2006;
								if (local221) {
									local1984 = new Class16_Sub1_Sub4_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, local443 * Static524.anIntArray626[arg4], local443 * Static108.anIntArray176[arg4], arg7, arg4 + 4);
									local2006 = new Class16_Sub1_Sub4_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, 0, 0, arg7, local382 + 4);
									if (local1984.method6211()) {
										local1984.method6208(arg8);
									}
									if (local2006.method6211()) {
										local2006.method6208(arg8);
									}
								} else {
									local1984 = new Class16_Sub1_Sub4_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, local443 * Static524.anIntArray626[arg4], Static108.anIntArray176[arg4] * local443, arg7, arg4 + 4, arg0);
									local2006 = new Class16_Sub1_Sub4_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, 0, 0, arg7, local382 + 4, arg0);
								}
								Static62.method6049(arg2, arg1, arg5, local1984, local2006);
							}
						}
					}
				}
			}
		} else if (Static305.aClass2_Sub49_15.aClass33_Sub21_1.method5680() != 0 || local32.anInt81 != 0 || local32.anInt102 == 1 || local32.aBoolean2) {
			@Pc(287) Class16_Sub1_Sub3 local287;
			if (local221) {
				@Pc(304) Class16_Sub1_Sub3_Sub1 local304 = new Class16_Sub1_Sub3_Sub1(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg4, local183);
				if (local304.method6211()) {
					local304.method6208(arg8);
				}
				local287 = local304;
			} else {
				local287 = new Class16_Sub1_Sub3_Sub2(arg8, local32, arg2, arg6, local162, local153, local171, super.aBoolean603, arg4, arg0);
			}
			Static439.method6314(arg2, arg1, arg5, local287);
			if (local32.anInt102 == 1 && arg3 != null) {
				arg3.method4295(arg1, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "([IIILclient!ha;ILclient!sl;)V")
	public void method7110(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class13 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class2_Sub17 arg4) {
		if (super.aBoolean603) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(23) Class299 local23 = null;
		while (true) {
			@Pc(28) int local28;
			@Pc(49) int local49;
			@Pc(254) int local254;
			@Pc(258) int local258;
			@Pc(53) int local53;
			while (arg4.anInt3378 < arg4.aByteArray26.length) {
				local28 = arg4.method2859();
				if (local28 == 0) {
					local23 = new Class299(arg4);
				} else {
					@Pc(112) int local112;
					@Pc(116) int local116;
					@Pc(103) int local103;
					if (local28 == 1) {
						local49 = arg4.method2859();
						if (local49 > 0) {
							for (local53 = 0; local53 < local49; local53++) {
								@Pc(62) Class342 local62 = new Class342(arg2, arg4, 2);
								if (local62.anInt9284 == 31) {
									@Pc(75) Class359 local75 = Static341.aClass147_1.method3535(arg4.method2825());
									local62.method7897(local75.anInt9919, local75.anInt9921, local75.anInt9926, local75.anInt9922);
								}
								if (arg2.method8089() > 0) {
									@Pc(95) Class2_Sub12 local95 = local62.aClass2_Sub12_1;
									local103 = (arg1 << 9) + local95.method7415();
									local112 = local95.method7421() + (arg3 << 9);
									local116 = local103 >> 9;
									@Pc(120) int local120 = local112 >> 9;
									if (local116 >= 0 && local120 >= 0 && local116 < super.anInt8252 && local120 < super.anInt8259) {
										local95.method7419(super.anIntArrayArrayArray17[local62.anInt9281][local116][local120] - local95.method7420(), local112, local103);
										Static470.method6668(local62);
									}
								}
							}
						}
					} else if (local28 == 2) {
						if (local23 == null) {
							local23 = new Class299();
						}
						local23.method6912(arg4);
					} else if (local28 != 128) {
						if (local28 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray10 == null) {
							super.aByteArrayArrayArray10 = new byte[4][][];
						}
						for (local49 = 0; local49 < 4; local49++) {
							@Pc(242) byte local242 = arg4.method2860();
							if (local242 == 0 && super.aByteArrayArrayArray10[local49] != null) {
								local254 = arg1;
								local258 = arg1 + 64;
								local103 = arg3;
								if (local258 < 0) {
									local258 = 0;
								} else if (local258 >= super.anInt8252) {
									local258 = super.anInt8252;
								}
								if (arg3 < 0) {
									local103 = 0;
								} else if (super.anInt8259 <= arg3) {
									local103 = super.anInt8259;
								}
								if (arg1 < 0) {
									local254 = 0;
								} else if (super.anInt8252 <= arg1) {
									local254 = super.anInt8252;
								}
								local112 = arg3 + 64;
								if (local112 < 0) {
									local112 = 0;
								} else if (super.anInt8259 <= local112) {
									local112 = super.anInt8259;
								}
								while (local254 < local258) {
									while (local112 > local103) {
										super.aByteArrayArrayArray10[local49][local254][local103] = 0;
										local103++;
									}
									local254++;
								}
							} else if (local242 == 1) {
								if (super.aByteArrayArrayArray10[local49] == null) {
									super.aByteArrayArrayArray10[local49] = new byte[super.anInt8252 + 1][super.anInt8259 + 1];
								}
								for (local254 = 0; local254 < 64; local254 += 4) {
									for (local258 = 0; local258 < 64; local258 += 4) {
										@Pc(521) byte local521 = arg4.method2860();
										for (local112 = local254 + arg1; local112 < local254 + arg1 + 4; local112++) {
											for (local116 = local258 + arg3; local116 < local258 + arg3 + 4; local116++) {
												if (local112 >= 0 && local112 < super.anInt8252 && local116 >= 0 && local116 < super.anInt8259) {
													super.aByteArrayArrayArray10[local49][local112][local116] = local521;
												}
											}
										}
									}
								}
							} else if (local242 == 2) {
								if (super.aByteArrayArrayArray10[local49] == null) {
									super.aByteArrayArrayArray10[local49] = new byte[super.anInt8252 + 1][super.anInt8259 + 1];
								}
								if (local49 > 0) {
									local254 = arg1;
									local258 = arg1 + 64;
									local103 = arg3;
									if (local258 < 0) {
										local258 = 0;
									} else if (local258 >= super.anInt8252) {
										local258 = super.anInt8252;
									}
									local112 = arg3 + 64;
									if (arg1 < 0) {
										local254 = 0;
									} else if (super.anInt8252 <= arg1) {
										local254 = super.anInt8252;
									}
									if (arg3 < 0) {
										local103 = 0;
									} else if (arg3 >= super.anInt8259) {
										local103 = super.anInt8259;
									}
									if (local112 < 0) {
										local112 = 0;
									} else if (local112 >= super.anInt8259) {
										local112 = super.anInt8259;
									}
									while (local258 > local254) {
										while (local112 > local103) {
											super.aByteArrayArrayArray10[local49][local254][local103] = super.aByteArrayArrayArray10[local49 - 1][local254][local103];
											local103++;
										}
										local254++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg0 == null) {
						arg4.anInt3378 += 10;
					} else {
						arg0[0] = arg4.method2825();
						arg0[1] = arg4.method2836();
						arg0[2] = arg4.method2836();
						arg0[3] = arg4.method2836();
						arg0[4] = arg4.method2825();
					}
				}
			}
			if (local23 != null) {
				for (local28 = 0; local28 < 8; local28++) {
					for (local49 = 0; local49 < 8; local49++) {
						local53 = local28 + (arg1 >> 3);
						local254 = local49 + (arg3 >> 3);
						if (local53 >= 0 && super.anInt8252 >> 3 > local53 && local254 >= 0 && local254 < super.anInt8259 >> 3) {
							Static35.method850(local53, local254, local23);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray10 != null) {
				for (local28 = 0; local28 < 4; local28++) {
					if (super.aByteArrayArrayArray10[local28] != null) {
						for (local49 = 0; local49 < 16; local49++) {
							for (local53 = 0; local53 < 16; local53++) {
								local254 = local49 + (arg1 >> 2);
								local258 = (arg3 >> 2) + local53;
								if (local254 >= 0 && local254 < 26 && local258 >= 0 && local258 < 26) {
									super.aByteArrayArrayArray10[local28][local254][local258] = 0;
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

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLclient!ha;[Lclient!je;[BII)V")
	public void method7111(@OriginalArg(1) Class13 arg0, @OriginalArg(2) Class175[] arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class2_Sub17 local10 = new Class2_Sub17(arg2);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method2880();
			if (local20 == 0) {
				return;
			}
			local12 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method2853();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local10.method2859();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = arg3 + local53;
				@Pc(77) int local77 = arg4 + local47;
				if (local73 > 0 && local77 > 0 && local73 < super.anInt8252 - 1 && super.anInt8259 - 1 > local77) {
					@Pc(105) Class175 local105 = null;
					if (!super.aBoolean603) {
						@Pc(110) int local110 = local57;
						if ((Static372.aByteArrayArrayArray3[1][local73][local77] & 0x2) == 2) {
							local110 = local57 - 1;
						}
						if (local110 >= 0) {
							local105 = arg1[local110];
						}
					}
					this.method7109(-1, local73, local57, local105, local69, local77, local57, local65, arg0, local12);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZBLclient!ha;)V")
	public void method7112(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class13 arg1) {
		Static355.method5323();
		if (!arg0) {
			@Pc(20) int local20;
			@Pc(24) int local24;
			if (super.anInt8255 > 1) {
				for (local20 = 0; local20 < super.anInt8252; local20++) {
					for (local24 = 0; super.anInt8259 > local24; local24++) {
						if ((Static372.aByteArrayArrayArray3[1][local20][local24] & 0x2) == 2) {
							Static618.method8595(local20, local24);
						}
					}
				}
			}
			for (local20 = 0; super.anInt8255 > local20; local20++) {
				for (local24 = 0; super.anInt8259 >= local24; local24++) {
					for (@Pc(64) int local64 = 0; local64 <= super.anInt8252; local64++) {
						if ((super.aByteArrayArrayArray13[local20][local64][local24] & 0x4) != 0) {
							@Pc(82) int local82 = local64;
							@Pc(84) int local84 = local64;
							@Pc(86) int local86 = local24;
							@Pc(88) int local88 = local24;
							while (local86 > 0 && (super.aByteArrayArrayArray13[local20][local64][local86 - 1] & 0x4) != 0 && local24 - local86 < 10) {
								local86--;
							}
							while (super.anInt8259 > local88 && (super.aByteArrayArrayArray13[local20][local64][local88 + 1] & 0x4) != 0 && local88 - local86 < 10) {
								local88++;
							}
							@Pc(153) int local153;
							label111: while (local82 > 0 && local64 - local82 < 10) {
								for (local153 = local86; local153 <= local88; local153++) {
									if ((super.aByteArrayArrayArray13[local20][local82 - 1][local153] & 0x4) == 0) {
										break label111;
									}
								}
								local82--;
							}
							label98: while (super.anInt8252 > local84 && local84 - local82 < 10) {
								for (local153 = local86; local153 <= local88; local153++) {
									if ((super.aByteArrayArrayArray13[local20][local84 + 1][local153] & 0x4) == 0) {
										break label98;
									}
								}
								local84++;
							}
							if ((local84 + 1 - local82) * ((local88 - local86) + 1) >= 4) {
								local153 = super.anIntArrayArrayArray17[local20][local82][local86];
								Static135.method2477(local82 << 9, local153, (local84 << 9) + 512, (local88 << 9) - -512, local86 << 9, local20, local153);
								for (@Pc(275) int local275 = local82; local275 <= local84; local275++) {
									for (@Pc(279) int local279 = local86; local279 <= local88; local279++) {
										super.aByteArrayArrayArray13[local20][local275][local279] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static462.method6523();
		}
		super.aByteArrayArrayArray13 = null;
	}
}
