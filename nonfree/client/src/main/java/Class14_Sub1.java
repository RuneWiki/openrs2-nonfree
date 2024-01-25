import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!js", name = "U", descriptor = "I")
	public int anInt3482 = 99;

	static {
		new Class7("Please close the interface you have open before using 'Report Abuse'.", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
	}

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIZ)V")
	public Class14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static344.aClass42_5, Static396.aClass205_5);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IZLclient!ya;IIIII[Lclient!pd;I[B)V")
	public void method3005(@OriginalArg(0) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class188[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(10) Class1_Sub5 local10 = new Class1_Sub5(arg9);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method5384();
			if (local20 == 0) {
				return;
			}
			local12 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method5361();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(44) int local44 = local28 & 0x3F;
				@Pc(50) int local50 = local28 >> 6 & 0x3F;
				@Pc(54) int local54 = local28 >> 12;
				@Pc(58) int local58 = local10.method5366();
				@Pc(62) int local62 = local58 >> 2;
				@Pc(66) int local66 = local58 & 0x3;
				if (arg0 == local54 && local50 >= arg6 && arg6 + 8 > local50 && arg2 <= local44 && local44 < arg2 + 8) {
					@Pc(90) Class129 local90 = Static349.aClass115_4.method2766(local12);
					@Pc(107) int local107 = Static247.method5816(local66, local90.anInt3517, arg8, local90.anInt3507, local50 & 0x7, local44 & 0x7) + arg4;
					@Pc(124) int local124 = arg5 + Static270.method3989(local90.anInt3507, arg8, local90.anInt3517, local66, local44 & 0x7, local50 & 0x7);
					if (local107 > 0 && local124 > 0 && super.anInt3470 - 1 > local107 && super.anInt3460 - 1 > local124) {
						@Pc(149) Class188 local149 = null;
						if (!super.aBoolean210) {
							@Pc(154) int local154 = arg3;
							if ((Static2.aByteArrayArrayArray1[1][local107][local124] & 0x2) == 2) {
								local154 = arg3 - 1;
							}
							if (local154 >= 0) {
								local149 = arg7[local154];
							}
						}
						this.method3012(local66 + arg8 & 0x3, local62, arg3, -1, local149, local124, arg1, local107, local12, arg3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!ya;IIILclient!pd;I)V")
	public void method3006(@OriginalArg(0) int arg0, @OriginalArg(1) Class39 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class188 arg5) {
		@Pc(7) Interface5 local7 = null;
		if (arg4 == 0) {
			local7 = (Interface5) Static110.method1983(arg2, arg0, arg3);
		}
		if (arg4 == 1) {
			local7 = (Interface5) Static198.method3177(arg2, arg0, arg3);
		}
		if (arg4 == 2) {
			local7 = (Interface5) Static357.method4896(arg2, arg0, arg3, ig.class);
		}
		if (arg4 == 3) {
			local7 = (Interface5) Static393.method5258(arg2, arg0, arg3);
		}
		if (local7 == null) {
			return;
		}
		@Pc(66) Class129 local66 = Static349.aClass115_4.method2766(local7.method5176());
		@Pc(70) int local70 = local7.method5172();
		@Pc(74) int local74 = local7.method5169();
		if (local66.method3019()) {
			Static184.method2901(arg0, arg2, arg3, local66);
		}
		if (local7.method5175()) {
			local7.method5173(arg1);
		}
		if (arg4 != 0) {
			if (arg4 == 1) {
				@Pc(104) Class31_Sub4 local104 = Static198.method3177(arg2, arg0, arg3);
				if (!(local104 instanceof Class31_Sub4_Sub2)) {
					Static72.method1431(arg2, arg0, arg3);
					return;
				}
				((Class31_Sub4_Sub2) local104).aClass31_Sub4_3 = null;
				return;
			}
			if (arg4 == 2) {
				@Pc(170) Class31_Sub2 local170 = Static357.method4896(arg2, arg0, arg3, ig.class);
				if (local170 instanceof Class31_Sub2_Sub5 && local170.aShort103 == arg0 && local170.aShort102 == arg3) {
					((Class31_Sub2_Sub5) local170).aClass31_Sub2_2 = null;
				} else {
					Static83.method1584(arg2, arg0, arg3, ig.class);
				}
				if (local66.anInt3506 == 0 || arg0 + local66.anInt3517 >= super.anInt3470 || local66.anInt3517 + arg3 >= super.anInt3460 || arg0 + local66.anInt3507 >= super.anInt3470 || super.anInt3460 <= local66.anInt3507 + arg3) {
					return;
				}
				arg5.method4323(arg0, !local66.aBoolean224, local74, local66.anInt3517, local66.aBoolean215, arg3, local66.anInt3507);
			} else if (arg4 == 3) {
				@Pc(132) Class31_Sub1 local132 = Static393.method5258(arg2, arg0, arg3);
				if (local132 instanceof Class31_Sub1_Sub1) {
					((Class31_Sub1_Sub1) local132).aClass31_Sub1_1 = null;
				} else {
					Static351.method4859(arg2, arg0, arg3);
				}
				if (local66.anInt3506 == 1) {
					arg5.method4314(arg3, arg0);
					return;
				}
			}
			return;
		}
		@Pc(276) Class31_Sub3 local276 = Static110.method1983(arg2, arg0, arg3);
		if (local276 instanceof Class31_Sub3_Sub2) {
			((Class31_Sub3_Sub2) local276).aClass31_Sub3_1 = null;
		} else {
			Static98.method1758(arg2, arg0, arg3);
		}
		if (local66.anInt3506 != 0) {
			arg5.method4316(local70, local74, local66.aBoolean215, !local66.aBoolean224, arg3, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!ya;B)V")
	public void method3007(@OriginalArg(0) Class39 arg0) {
		Static169.method2683(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt3467 > 1) {
			for (local13 = 0; super.anInt3470 > local13; local13++) {
				for (local17 = 0; super.anInt3460 > local17; local17++) {
					if ((Static2.aByteArrayArrayArray1[1][local13][local17] & 0x2) == 2) {
						Static359.method4940(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; super.anInt3467 > local13; local13++) {
			for (local17 = 0; local17 <= super.anInt3460; local17++) {
				for (@Pc(59) int local59 = 0; super.anInt3470 >= local59; local59++) {
					@Pc(77) int local77;
					@Pc(79) int local79;
					@Pc(81) int local81;
					@Pc(107) int local107;
					@Pc(135) int local135;
					@Pc(235) int local235;
					@Pc(244) int local244;
					@Pc(264) int local264;
					@Pc(268) int local268;
					if ((super.aByteArrayArrayArray16[local13][local59][local17] & 0x1) != 0) {
						local77 = local17;
						local79 = local17;
						local81 = local13;
						while (super.anInt3460 > local79 && (super.aByteArrayArrayArray16[local13][local59][local79 + 1] & 0x1) != 0) {
							local79++;
						}
						local107 = local13;
						while (local77 > 0 && (super.aByteArrayArrayArray16[local13][local59][local77 - 1] & 0x1) != 0) {
							local77--;
						}
						label164: while (local81 > 0) {
							for (local135 = local77; local135 <= local79; local135++) {
								if ((super.aByteArrayArrayArray16[local81 - 1][local59][local135] & 0x1) == 0) {
									break label164;
								}
							}
							local81--;
						}
						label153: while (local107 < 3) {
							for (local135 = local77; local135 <= local79; local135++) {
								if ((super.aByteArrayArrayArray16[local107 + 1][local59][local135] & 0x1) == 0) {
									break label153;
								}
							}
							local107++;
						}
						local135 = (local107 + 1 - local81) * (local79 + 1 - local77);
						if (local135 >= 2) {
							local235 = super.anIntArrayArrayArray4[local107][local59][local77] - 240;
							local244 = super.anIntArrayArrayArray4[local81][local59][local77];
							Static302.method4327(1, local59 << 7, local59 << 7, local77 << 7, (local79 << 7) + 128, local235, local244);
							for (local264 = local81; local264 <= local107; local264++) {
								for (local268 = local77; local268 <= local79; local268++) {
									super.aByteArrayArrayArray16[local264][local59][local268] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray16[local13][local59][local17] & 0x2) != 0) {
						local77 = local59;
						local79 = local59;
						local81 = local13;
						while (local79 < super.anInt3470 && (super.aByteArrayArrayArray16[local13][local79 + 1][local17] & 0x2) != 0) {
							local79++;
						}
						while (local77 > 0 && (super.aByteArrayArrayArray16[local13][local77 - 1][local17] & 0x2) != 0) {
							local77--;
						}
						local107 = local13;
						label218: while (local81 > 0) {
							for (local135 = local77; local135 <= local79; local135++) {
								if ((super.aByteArrayArrayArray16[local81 - 1][local135][local17] & 0x2) == 0) {
									break label218;
								}
							}
							local81--;
						}
						label207: while (local107 < 3) {
							for (local135 = local77; local135 <= local79; local135++) {
								if ((super.aByteArrayArrayArray16[local107 + 1][local135][local17] & 0x2) == 0) {
									break label207;
								}
							}
							local107++;
						}
						local135 = (local107 + 1 - local81) * (local79 + 1 - local77);
						if (local135 >= 2) {
							local235 = super.anIntArrayArrayArray4[local107][local77][local17] - 240;
							local244 = super.anIntArrayArrayArray4[local81][local77][local17];
							Static302.method4327(2, local77 << 7, (local79 << 7) + 128, local17 << 7, local17 << 7, local235, local244);
							for (local264 = local81; local264 <= local107; local264++) {
								for (local268 = local77; local268 <= local79; local268++) {
									super.aByteArrayArrayArray16[local264][local268][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray16[local13][local59][local17] & 0x4) != 0) {
						local77 = local59;
						local79 = local59;
						for (local81 = local17; local81 > 0 && (super.aByteArrayArrayArray16[local13][local59][local81 - 1] & 0x4) != 0; local81--) {
						}
						for (local107 = local17; super.anInt3460 > local107 && (super.aByteArrayArrayArray16[local13][local59][local107 + 1] & 0x4) != 0; local107++) {
						}
						label272: while (local77 > 0) {
							for (local135 = local81; local135 <= local107; local135++) {
								if ((super.aByteArrayArrayArray16[local13][local77 - 1][local135] & 0x4) == 0) {
									break label272;
								}
							}
							local77--;
						}
						label261: while (super.anInt3470 > local79) {
							for (local135 = local81; local135 <= local107; local135++) {
								if ((super.aByteArrayArrayArray16[local13][local79 + 1][local135] & 0x4) == 0) {
									break label261;
								}
							}
							local79++;
						}
						if ((local79 + 1 - local77) * (local107 + 1 - local81) >= 4) {
							local135 = super.anIntArrayArrayArray4[local13][local77][local81];
							Static302.method4327(4, local77 << 7, (local79 << 7) + 128, local81 << 7, (local107 << 7) + 128, local135, local135);
							for (@Pc(715) int local715 = local77; local715 <= local79; local715++) {
								for (local235 = local81; local235 <= local107; local235++) {
									super.aByteArrayArrayArray16[local13][local715][local235] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray16 = null;
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIILclient!hp;II[ILclient!ya;III)V")
	public void method3008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub5 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) Class39 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean210) {
			return;
		}
		if (arg5 != null) {
			arg5[0] = -1;
		}
		@Pc(19) Class93 local19 = null;
		@Pc(25) int local25 = (arg3 & 0x7) * 8;
		@Pc(31) int local31 = (arg8 & 0x7) * 8;
		while (true) {
			@Pc(45) int local45;
			@Pc(103) int local103;
			@Pc(145) int local145;
			@Pc(163) int local163;
			@Pc(52) int local52;
			@Pc(97) int local97;
			label235: do {
				while (true) {
					@Pc(36) int local36;
					@Pc(259) int local259;
					while (arg2.aByteArray89.length > arg2.anInt6475) {
						local36 = arg2.method5366();
						if (local36 == 0) {
							local19 = new Class93(arg2);
						} else {
							if (local36 == 1) {
								local45 = arg2.method5366();
								continue label235;
							}
							if (local36 == 2) {
								if (local19 == null) {
									local19 = new Class93();
								}
								local19.method2325(arg2);
							} else if (local36 != 128) {
								if (local36 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray14 == null) {
									super.aByteArrayArrayArray14 = new byte[4][][];
								}
								for (local45 = 0; local45 < 4; local45++) {
									@Pc(247) byte local247 = arg2.method5416();
									@Pc(263) int local263;
									if (local247 == 0 && super.aByteArrayArrayArray14[arg0] != null) {
										if (local45 <= arg1) {
											local259 = arg4;
											local263 = arg4 + 7;
											local97 = arg9;
											if (local263 < 0) {
												local263 = 0;
											} else if (local263 >= super.anInt3470) {
												local263 = super.anInt3470;
											}
											if (arg9 < 0) {
												local97 = 0;
											} else if (super.anInt3460 <= arg9) {
												local97 = super.anInt3460;
											}
											if (arg4 < 0) {
												local259 = 0;
											} else if (arg4 >= super.anInt3470) {
												local259 = super.anInt3470;
											}
											local103 = arg9 + 7;
											if (local103 < 0) {
												local103 = 0;
											} else if (local103 >= super.anInt3460) {
												local103 = super.anInt3460;
											}
											while (local259 < local263) {
												while (local97 < local103) {
													super.aByteArrayArrayArray14[arg0][local259][local97] = 0;
													local97++;
												}
												local259++;
											}
										}
									} else if (local247 == 1) {
										if (super.aByteArrayArrayArray14[arg0] == null) {
											super.aByteArrayArrayArray14[arg0] = new byte[super.anInt3470 + 1][super.anInt3460 + 1];
										}
										for (local259 = 0; local259 < 64; local259 += 4) {
											for (local263 = 0; local263 < 64; local263 += 4) {
												@Pc(385) byte local385 = arg2.method5416();
												if (arg1 >= local45) {
													for (local103 = local259; local103 < local259 + 4; local103++) {
														for (local145 = local263; local145 < local263 + 4; local145++) {
															if (local103 >= local25 && local103 < local25 + 8 && local31 <= local145 && local31 < local31 + 8) {
																local163 = Static272.method4011(local103 & 0x7, arg7, local145 & 0x7) + arg4;
																@Pc(437) int local437 = arg9 + Static298.method5255(local103 & 0x7, arg7, local145 & 0x7);
																if (local163 >= 0 && local163 < super.anInt3470 && local437 >= 0 && super.anInt3460 > local437) {
																	super.aByteArrayArrayArray14[arg0][local163][local437] = local385;
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
								arg2.anInt6475 += 10;
							} else {
								arg5[0] = arg2.method5362();
								arg5[1] = arg2.method5380();
								arg5[2] = arg2.method5380();
								arg5[3] = arg2.method5380();
								arg5[4] = arg2.method5362();
							}
						}
					}
					if (local19 != null) {
						Static43.method808(arg9 >> 3, local19, arg4 >> 3);
					}
					if (super.aByteArrayArrayArray14 != null && super.aByteArrayArrayArray14[arg0] != null) {
						local36 = arg4 + 7;
						local45 = arg9 + 7;
						for (local52 = arg4; local52 < local36; local52++) {
							for (local259 = arg9; local259 < local45; local259++) {
								super.aByteArrayArrayArray14[arg0][local52][local259] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local45 <= 0);
			for (local52 = 0; local52 < local45; local52++) {
				@Pc(61) Class243 local61 = new Class243(arg6, arg2, 0);
				if (local61.anInt6522 == 31) {
					@Pc(74) Class216 local74 = Static316.aClass167_1.method3836(arg2.method5362());
					local61.method5436(local74.anInt5871, local74.anInt5872, local74.anInt5875, local74.anInt5873);
				}
				if (arg6.method4520() > 0) {
					@Pc(91) Class1_Sub31 local91 = local61.aClass1_Sub31_2;
					local97 = local91.method5906() >> 7;
					local103 = local91.method5904() >> 7;
					if (local61.anInt6518 == arg1 && local97 >= local25 && local97 < local25 + 8 && local103 >= local31 && local31 + 8 > local103) {
						local145 = Static314.method4465(arg7, local91.method5906() & 0x3FF, local91.method5904() & 0x3FF) + (arg4 << 7);
						local163 = (arg9 << 7) + Static450.method5914(arg7, local91.method5904() & 0x3FF, local91.method5906() & 0x3FF);
						local97 = local145 >> 7;
						local103 = local163 >> 7;
						if (local97 >= 0 && local103 >= 0 && local97 < super.anInt3470 && super.anInt3460 > local103) {
							local91.method5908(local163, super.anIntArrayArrayArray4[arg1][local97][local103] - local91.method5902(), local145);
							if (arg6.method4520() > 0) {
								Static244.method3711(local61);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!hp;ILclient!ya;I[I)V")
	public void method3009(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class39 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4) {
		if (super.aBoolean210) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class93 local13 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		while (true) {
			@Pc(54) int local54;
			@Pc(110) int local110;
			@Pc(118) int local118;
			@Pc(122) int local122;
			@Pc(58) int local58;
			label308: do {
				while (true) {
					@Pc(40) int local40;
					@Pc(269) int local269;
					@Pc(273) int local273;
					while (arg0.anInt6475 < arg0.aByteArray89.length) {
						local40 = arg0.method5366();
						if (local40 == 0) {
							local13 = new Class93(arg0);
						} else {
							if (local40 == 1) {
								local54 = arg0.method5366();
								continue label308;
							}
							if (local40 == 2) {
								if (local13 == null) {
									local13 = new Class93();
								}
								local13.method2325(arg0);
							} else if (local40 != 128) {
								if (local40 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray14 == null) {
									super.aByteArrayArrayArray14 = new byte[4][][];
								}
								for (local54 = 0; local54 < 4; local54++) {
									@Pc(257) byte local257 = arg0.method5416();
									if (local257 == 0 && super.aByteArrayArrayArray14[local54] != null) {
										local269 = arg1;
										local273 = arg1 + 64;
										local110 = arg3;
										local118 = arg3 + 64;
										if (arg3 < 0) {
											local110 = 0;
										} else if (arg3 >= super.anInt3460) {
											local110 = super.anInt3460;
										}
										if (arg1 < 0) {
											local269 = 0;
										} else if (super.anInt3470 <= arg1) {
											local269 = super.anInt3470;
										}
										if (local273 < 0) {
											local273 = 0;
										} else if (local273 >= super.anInt3470) {
											local273 = super.anInt3470;
										}
										if (local118 < 0) {
											local118 = 0;
										} else if (super.anInt3460 <= local118) {
											local118 = super.anInt3460;
										}
										while (local269 < local273) {
											while (local118 > local110) {
												super.aByteArrayArrayArray14[local54][local269][local110] = 0;
												local110++;
											}
											local269++;
										}
									} else if (local257 == 1) {
										if (super.aByteArrayArrayArray14[local54] == null) {
											super.aByteArrayArrayArray14[local54] = new byte[super.anInt3470 + 1][super.anInt3460 + 1];
										}
										for (local269 = 0; local269 < 64; local269 += 4) {
											for (local273 = 0; local273 < 64; local273 += 4) {
												@Pc(407) byte local407 = arg0.method5416();
												for (local118 = arg1 + local269; local118 < arg1 + local269 + 4; local118++) {
													for (local122 = arg3 + local273; local122 < local273 + arg3 + 4; local122++) {
														if (local118 >= 0 && super.anInt3470 > local118 && local122 >= 0 && local122 < super.anInt3460) {
															super.aByteArrayArrayArray14[local54][local118][local122] = local407;
														}
													}
												}
											}
										}
									} else if (local257 == 2) {
										if (super.aByteArrayArrayArray14[local54] == null) {
											super.aByteArrayArrayArray14[local54] = new byte[super.anInt3470 + 1][super.anInt3460 + 1];
										}
										if (local54 > 0) {
											local269 = arg1;
											local273 = arg1 + 64;
											local110 = arg3;
											if (local273 < 0) {
												local273 = 0;
											} else if (super.anInt3470 <= local273) {
												local273 = super.anInt3470;
											}
											if (arg1 < 0) {
												local269 = 0;
											} else if (super.anInt3470 <= arg1) {
												local269 = super.anInt3470;
											}
											if (arg3 < 0) {
												local110 = 0;
											} else if (arg3 >= super.anInt3460) {
												local110 = super.anInt3460;
											}
											local118 = arg3 + 64;
											if (local118 < 0) {
												local118 = 0;
											} else if (super.anInt3460 <= local118) {
												local118 = super.anInt3460;
											}
											while (local273 > local269) {
												while (local110 < local118) {
													super.aByteArrayArrayArray14[local54][local269][local110] = super.aByteArrayArrayArray14[local54 - 1][local269][local110];
													local110++;
												}
												local269++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg4 == null) {
								arg0.anInt6475 += 10;
							} else {
								arg4[0] = arg0.method5362();
								arg4[1] = arg0.method5380();
								arg4[2] = arg0.method5380();
								arg4[3] = arg0.method5380();
								arg4[4] = arg0.method5362();
							}
						}
					}
					if (local13 != null) {
						for (local40 = 0; local40 < 8; local40++) {
							for (local54 = 0; local54 < 8; local54++) {
								local58 = (arg1 >> 3) + local40;
								local269 = (arg3 >> 3) + local54;
								if (local58 >= 0 && super.anInt3470 >> 3 > local58 && local269 >= 0 && super.anInt3460 >> 3 > local269) {
									Static43.method808(local269, local13, local58);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray14 != null) {
						for (local40 = 0; local40 < 4; local40++) {
							if (super.aByteArrayArrayArray14[local40] != null) {
								for (local54 = 0; local54 < 16; local54++) {
									for (local58 = 0; local58 < 16; local58++) {
										local269 = local54 + (arg1 >> 2);
										local273 = (arg3 >> 2) + local58;
										if (local269 >= 0 && local269 < 26 && local273 >= 0 && local273 < 26) {
											super.aByteArrayArrayArray14[local40][local269][local273] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local54 <= 0);
			for (local58 = 0; local58 < local54; local58++) {
				@Pc(67) Class243 local67 = new Class243(arg2, arg0, 0);
				if (local67.anInt6522 == 31) {
					@Pc(82) Class216 local82 = Static316.aClass167_1.method3836(arg0.method5362());
					local67.method5436(local82.anInt5871, local82.anInt5872, local82.anInt5875, local82.anInt5873);
				}
				if (arg2.method4520() > 0) {
					@Pc(102) Class1_Sub31 local102 = local67.aClass1_Sub31_2;
					local110 = (arg1 << 7) + local102.method5906();
					local118 = (arg3 << 7) + local102.method5904();
					local122 = local110 >> 7;
					@Pc(126) int local126 = local118 >> 7;
					if (local122 >= 0 && local126 >= 0 && local122 < super.anInt3470 && local126 < super.anInt3460) {
						local102.method5908(local118, super.anIntArrayArrayArray4[local67.anInt6518][local122][local126] - local102.method5902(), local110);
						if (arg2.method4520() > 0) {
							Static244.method3711(local67);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIILclient!pd;ILclient!ya;IBII)V")
	public void method3012(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class188 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class39 arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static38.aClass135_Sub1_1.method4244(Static143.anInt2766) && !Static412.method5522(arg7, arg2, Static170.anInt3116, arg5)) {
			return;
		}
		if (arg9 < this.anInt3482) {
			this.anInt3482 = arg9;
		}
		@Pc(34) Class129 local34 = Static349.aClass115_4.method2766(arg8);
		if (arg6.method4535() && Static38.aClass135_Sub1_1.aBoolean357 && local34.aBoolean222) {
			return;
		}
		@Pc(55) int local55;
		@Pc(58) int local58;
		if (arg0 == 1 || arg0 == 3) {
			local55 = local34.anInt3507;
			local58 = local34.anInt3517;
		} else {
			local55 = local34.anInt3517;
			local58 = local34.anInt3507;
		}
		@Pc(74) int local74;
		@Pc(78) int local78;
		if (local55 + arg7 > super.anInt3470) {
			local74 = arg7;
			local78 = arg7 + 1;
		} else {
			local74 = arg7 + (local55 >> 1);
			local78 = (local55 + 1 >> 1) + arg7;
		}
		@Pc(108) int local108;
		@Pc(112) int local112;
		if (super.anInt3460 < arg5 + local58) {
			local108 = arg5;
			local112 = arg5 + 1;
		} else {
			local108 = arg5 + (local58 >> 1);
			local112 = (local58 + 1 >> 1) + arg5;
		}
		@Pc(133) Class149 local133 = Static105.aClass149Array1[arg2];
		@Pc(162) int local162 = local133.l(local74, local108) + local133.l(local78, local108) + local133.l(local74, local112) + local133.l(local78, local112) >> 2;
		@Pc(170) int local170 = (local55 << 6) + (arg7 << 7);
		@Pc(178) int local178 = (local58 << 6) + (arg5 << 7);
		@Pc(190) boolean local190 = Static336.aBoolean405 && !super.aBoolean210 && local34.aBoolean217;
		if (local34.method3019()) {
			Static84.method1594(arg5, local34, arg9, null, arg0, arg7, null);
		}
		@Pc(224) boolean local224 = arg3 == -1 && local34.anInt3496 == -1 && local34.anIntArray312 == null && local34.anIntArray310 == null && !local34.lb;
		if (Static429.aBoolean485 && (Static46.method825(arg1) && local34.anInt3529 != 1 || !(!Static19.method495(arg1) || local34.anInt3529 != 0))) {
			return;
		}
		if (arg1 != 22) {
			@Pc(383) Class31_Sub2 local383;
			@Pc(351) Class31_Sub2_Sub3 local351;
			@Pc(355) int local355;
			if (arg1 == 10 || arg1 == 11) {
				local351 = null;
				if (local224) {
					@Pc(413) Class31_Sub2_Sub3 local413 = new Class31_Sub2_Sub3(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg7, local55 + arg7 - 1, arg5, arg5 + local58 - 1, arg1, arg0, local190);
					local355 = local413.method1562();
					local351 = local413;
					local383 = local413;
				} else {
					local355 = 15;
					local383 = new Class31_Sub2_Sub4(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg7, arg7 + local55 - 1, arg5, local58 + arg5 - 1, arg1, arg0, arg3);
				}
				@Pc(434) Class31_Sub2 local434 = Static357.method4896(arg9, arg7, arg5, ig.class);
				@Pc(436) boolean local436 = false;
				if (local434 instanceof Class31_Sub2_Sub5 && local434.aShort103 == arg7 && local434.aShort102 == arg5) {
					((Class31_Sub2_Sub5) local434).aClass31_Sub2_2 = local383;
					local436 = true;
				}
				if (local436 || Static162.method2630(local383, false)) {
					if (local351 != null && local351.method5175()) {
						local351.method5170(arg6);
					}
					if (local34.aBoolean218 && Static336.aBoolean405) {
						if (local355 > 30) {
							local355 = 30;
						}
						for (@Pc(483) int local483 = 0; local483 <= local55; local483++) {
							for (@Pc(487) int local487 = 0; local487 <= local58; local487++) {
								local133.i(local483 + arg7, arg5 + local487, local355);
							}
						}
					}
				}
				if (local34.anInt3506 != 0 && arg4 != null) {
					arg4.method4324(local34.aBoolean215, !local34.aBoolean224, arg5, arg7, local55, local58);
				}
			} else {
				@Pc(632) Class31_Sub2 local632;
				if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
					if (local224) {
						local351 = new Class31_Sub2_Sub3(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg7, local55 + arg7 - 1, arg5, local58 + arg5 - 1, arg1, arg0, local190);
						local383 = local351;
						if (local351.method5175()) {
							local351.method5170(arg6);
						}
					} else {
						local383 = new Class31_Sub2_Sub4(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg7, local55 + arg7 - 1, arg5, arg5 + local58 - 1, arg1, arg0, arg3);
					}
					local632 = Static357.method4896(arg9, arg7, arg5, ig.class);
					if (local632 instanceof Class31_Sub2_Sub5 && arg7 == local632.aShort103 && arg5 == local632.aShort102) {
						((Class31_Sub2_Sub5) local632).aClass31_Sub2_2 = local383;
					} else {
						Static162.method2630(local383, false);
					}
					if (Static336.aBoolean405 && !super.aBoolean210 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg9 > 0 && local34.anInt3529 != 0) {
						super.aByteArrayArrayArray16[arg9][arg7][arg5] = (byte) (super.aByteArrayArrayArray16[arg9][arg7][arg5] | 0x4);
					}
					if (local34.anInt3506 != 0 && arg4 != null) {
						arg4.method4324(local34.aBoolean215, !local34.aBoolean224, arg5, arg7, local55, local58);
					}
				} else {
					@Pc(759) Class31_Sub3 local759;
					if (arg1 == 0) {
						@Pc(733) int local733 = local34.anInt3529;
						if (Static443.aBoolean492 && local34.anInt3529 == -1) {
							local733 = 1;
						}
						if (local224) {
							@Pc(776) Class31_Sub3_Sub3 local776 = new Class31_Sub3_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, arg1, arg0, local190);
							if (local776.method5175()) {
								local776.method5170(arg6);
							}
							local759 = local776;
						} else {
							local759 = new Class31_Sub3_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg1, arg0, arg3);
						}
						@Pc(791) Class31_Sub3 local791 = Static110.method1983(arg9, arg7, arg5);
						if (local791 instanceof Class31_Sub3_Sub2) {
							((Class31_Sub3_Sub2) local791).aClass31_Sub3_1 = local759;
						} else {
							Static131.method2282(arg9, arg7, arg5, local759, null);
						}
						if (Static336.aBoolean405) {
							if (arg0 == 0) {
								if (local34.aBoolean218) {
									local133.i(arg7, arg5, 50);
									local133.i(arg7, arg5 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean210) {
									super.aByteArrayArrayArray16[arg9][arg7][arg5] = (byte) (super.aByteArrayArrayArray16[arg9][arg7][arg5] | 0x1);
								}
							} else if (arg0 == 1) {
								if (local34.aBoolean218) {
									local133.i(arg7, arg5 + 1, 50);
									local133.i(arg7 + 1, arg5 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean210) {
									super.aByteArrayArrayArray16[arg9][arg7][arg5 + 1] = (byte) (super.aByteArrayArrayArray16[arg9][arg7][arg5 + 1] | 0x2);
								}
							} else if (arg0 == 2) {
								if (local34.aBoolean218) {
									local133.i(arg7 + 1, arg5, 50);
									local133.i(arg7 + 1, arg5 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean210) {
									super.aByteArrayArrayArray16[arg9][arg7 + 1][arg5] = (byte) (super.aByteArrayArrayArray16[arg9][arg7 + 1][arg5] | 0x1);
								}
							} else if (arg0 == 3) {
								if (local34.aBoolean218) {
									local133.i(arg7, arg5, 50);
									local133.i(arg7 + 1, arg5, 50);
								}
								if (local733 == 1 && !super.aBoolean210) {
									super.aByteArrayArrayArray16[arg9][arg7][arg5] = (byte) (super.aByteArrayArrayArray16[arg9][arg7][arg5] | 0x2);
								}
							}
						}
						if (local34.anInt3506 != 0 && arg4 != null) {
							arg4.method4318(arg5, !local34.aBoolean224, arg0, arg1, arg7, local34.aBoolean215);
						}
						if (local34.anInt3535 != 16) {
							Static259.method3866(arg9, arg7, arg5, local34.anInt3535);
						}
					} else {
						@Pc(1088) Class31_Sub3_Sub3 local1088;
						@Pc(1071) Class31_Sub3 local1071;
						if (arg1 == 1) {
							if (local224) {
								local1088 = new Class31_Sub3_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, arg1, arg0, local190);
								if (local1088.method5175()) {
									local1088.method5170(arg6);
								}
								local1071 = local1088;
							} else {
								local1071 = new Class31_Sub3_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg1, arg0, arg3);
							}
							local759 = Static110.method1983(arg9, arg7, arg5);
							if (local759 instanceof Class31_Sub3_Sub2) {
								((Class31_Sub3_Sub2) local759).aClass31_Sub3_1 = local1071;
							} else {
								Static131.method2282(arg9, arg7, arg5, local1071, null);
							}
							if (local34.aBoolean218 && Static336.aBoolean405) {
								if (arg0 == 0) {
									local133.i(arg7, arg5 + 1, 50);
								} else if (arg0 == 1) {
									local133.i(arg7 + 1, arg5 + 1, 50);
								} else if (arg0 == 2) {
									local133.i(arg7 + 1, arg5, 50);
								} else if (arg0 == 3) {
									local133.i(arg7, arg5, 50);
								}
							}
							if (local34.anInt3506 != 0 && arg4 != null) {
								arg4.method4318(arg5, !local34.aBoolean224, arg0, arg1, arg7, local34.aBoolean215);
							}
						} else if (arg1 == 2) {
							local355 = arg0 + 1 & 0x3;
							if (local224) {
								@Pc(1262) Class31_Sub3_Sub3 local1262 = new Class31_Sub3_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, arg1, arg0 + 4, local190);
								@Pc(1277) Class31_Sub3_Sub3 local1277 = new Class31_Sub3_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, arg1, local355, local190);
								if (local1262.method5175()) {
									local1262.method5170(arg6);
								}
								local759 = local1277;
								local1071 = local1262;
								if (local1277.method5175()) {
									local1277.method5170(arg6);
								}
							} else {
								local1071 = new Class31_Sub3_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg1, arg0 + 4, arg3);
								local759 = new Class31_Sub3_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg1, local355, arg3);
							}
							Static131.method2282(arg9, arg7, arg5, local1071, local759);
							if (local34.anInt3529 == 1 && Static336.aBoolean405 && !super.aBoolean210) {
								if (arg0 == 0) {
									super.aByteArrayArrayArray16[arg9][arg7][arg5] = (byte) (super.aByteArrayArrayArray16[arg9][arg7][arg5] | 0x1);
									super.aByteArrayArrayArray16[arg9][arg7][arg5 + 1] = (byte) (super.aByteArrayArrayArray16[arg9][arg7][arg5 + 1] | 0x2);
								} else if (arg0 == 1) {
									super.aByteArrayArrayArray16[arg9][arg7][arg5 + 1] = (byte) (super.aByteArrayArrayArray16[arg9][arg7][arg5 + 1] | 0x2);
									super.aByteArrayArrayArray16[arg9][arg7 + 1][arg5] = (byte) (super.aByteArrayArrayArray16[arg9][arg7 + 1][arg5] | 0x1);
								} else if (arg0 == 2) {
									super.aByteArrayArrayArray16[arg9][arg7 + 1][arg5] = (byte) (super.aByteArrayArrayArray16[arg9][arg7 + 1][arg5] | 0x1);
									super.aByteArrayArrayArray16[arg9][arg7][arg5] = (byte) (super.aByteArrayArrayArray16[arg9][arg7][arg5] | 0x2);
								} else if (arg0 == 3) {
									super.aByteArrayArrayArray16[arg9][arg7][arg5] = (byte) (super.aByteArrayArrayArray16[arg9][arg7][arg5] | 0x2);
									super.aByteArrayArrayArray16[arg9][arg7][arg5] = (byte) (super.aByteArrayArrayArray16[arg9][arg7][arg5] | 0x1);
								}
							}
							if (local34.anInt3506 != 0 && arg4 != null) {
								arg4.method4318(arg5, !local34.aBoolean224, arg0, arg1, arg7, local34.aBoolean215);
							}
							if (local34.anInt3535 != 16) {
								Static259.method3866(arg9, arg7, arg5, local34.anInt3535);
							}
						} else if (arg1 == 3) {
							if (local224) {
								local1088 = new Class31_Sub3_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, arg1, arg0, local190);
								if (local1088.method5175()) {
									local1088.method5170(arg6);
								}
								local1071 = local1088;
							} else {
								local1071 = new Class31_Sub3_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg1, arg0, arg3);
							}
							local759 = Static110.method1983(arg9, arg7, arg5);
							if (local759 instanceof Class31_Sub3_Sub2) {
								((Class31_Sub3_Sub2) local759).aClass31_Sub3_1 = local1071;
							} else {
								Static131.method2282(arg9, arg7, arg5, local1071, null);
							}
							if (local34.aBoolean218 && Static336.aBoolean405) {
								if (arg0 == 0) {
									local133.i(arg7, arg5 + 1, 50);
								} else if (arg0 == 1) {
									local133.i(arg7 + 1, arg5 - -1, 50);
								} else if (arg0 == 2) {
									local133.i(arg7 + 1, arg5, 50);
								} else if (arg0 == 3) {
									local133.i(arg7, arg5, 50);
								}
							}
							if (local34.anInt3506 != 0 && arg4 != null) {
								arg4.method4318(arg5, !local34.aBoolean224, arg0, arg1, arg7, local34.aBoolean215);
							}
						} else if (arg1 == 9) {
							if (local224) {
								local351 = new Class31_Sub2_Sub3(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg7, arg7, arg5, arg5, arg1, arg0, local190);
								if (local351.method5175()) {
									local351.method5170(arg6);
								}
								local383 = local351;
							} else {
								local383 = new Class31_Sub2_Sub4(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg7, arg7 + local55 - 1, arg5, local58 + arg5 - 1, arg1, arg0, arg3);
							}
							local632 = Static357.method4896(arg9, arg7, arg5, ig.class);
							if (local632 instanceof Class31_Sub2_Sub5 && local632.aShort103 == arg7 && local632.aShort102 == arg5) {
								((Class31_Sub2_Sub5) local632).aClass31_Sub2_2 = local383;
							} else {
								Static162.method2630(local383, false);
							}
							if (local34.anInt3506 != 0 && arg4 != null) {
								arg4.method4324(local34.aBoolean215, !local34.aBoolean224, arg5, arg7, local55, local58);
							}
							if (local34.anInt3535 != 16) {
								Static259.method3866(arg9, arg7, arg5, local34.anInt3535);
							}
						} else {
							@Pc(1853) Class31_Sub4 local1853;
							if (arg1 == 4) {
								if (local224) {
									@Pc(1843) Class31_Sub4_Sub3 local1843 = new Class31_Sub4_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, 0, 0, 0, arg1, arg0);
									if (local1843.method5175()) {
										local1843.method5170(arg6);
									}
									local1853 = local1843;
								} else {
									local1853 = new Class31_Sub4_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, 0, 0, 0, arg1, arg0, arg3);
								}
								@Pc(1879) Class31_Sub4 local1879 = Static198.method3177(arg9, arg7, arg5);
								if (local1879 instanceof Class31_Sub4_Sub2) {
									((Class31_Sub4_Sub2) local1879).aClass31_Sub4_3 = local1853;
								} else {
									Static237.method4962(arg9, arg7, arg5, local1853, null);
								}
							} else {
								@Pc(1901) int local1901;
								@Pc(1907) Interface5 local1907;
								@Pc(1975) Class31_Sub4_Sub3 local1975;
								@Pc(1990) Class31_Sub4 local1990;
								if (arg1 == 5) {
									local1901 = 17;
									local1907 = (Interface5) Static110.method1983(arg9, arg7, arg5);
									if (local1907 != null) {
										local1901 = Static349.aClass115_4.method2766(local1907.method5176()).anInt3535 + 1;
									}
									if (local224) {
										local1975 = new Class31_Sub4_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, 0, local1901 * Static51.anIntArray664[arg0], Static398.anIntArray591[arg0] * local1901, arg1, arg0);
										if (local1975.method5175()) {
											local1975.method5170(arg6);
										}
										local1853 = local1975;
									} else {
										local1853 = new Class31_Sub4_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, 0, Static51.anIntArray664[arg0] * local1901, local1901 * Static398.anIntArray591[arg0], arg1, arg0, arg3);
									}
									local1990 = Static198.method3177(arg9, arg7, arg5);
									if (local1990 instanceof Class31_Sub4_Sub2) {
										((Class31_Sub4_Sub2) local1990).aClass31_Sub4_3 = local1853;
									} else {
										Static237.method4962(arg9, arg7, arg5, local1853, null);
									}
								} else if (arg1 == 6) {
									local1901 = 9;
									local1907 = (Interface5) Static110.method1983(arg9, arg7, arg5);
									if (local1907 != null) {
										local1901 = Static349.aClass115_4.method2766(local1907.method5176()).anInt3535 / 2 + 1;
									}
									if (local224) {
										local1975 = new Class31_Sub4_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, arg0, local1901 * Static51.anIntArray664[arg0], Static398.anIntArray591[arg0] * local1901, arg1, arg0 + 4);
										if (local1975.method5175()) {
											local1975.method5170(arg6);
										}
										local1853 = local1975;
									} else {
										local1853 = new Class31_Sub4_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg0, Static156.anIntArray269[arg0] * local1901, local1901 * Static127.anIntArray204[arg0], arg1, arg0 + 4, arg3);
									}
									local1990 = Static198.method3177(arg9, arg7, arg5);
									if (local1990 instanceof Class31_Sub4_Sub2) {
										((Class31_Sub4_Sub2) local1990).aClass31_Sub4_3 = local1853;
									} else {
										Static237.method4962(arg9, arg7, arg5, local1853, null);
									}
								} else if (arg1 == 7) {
									local1901 = arg0 + 2 & 0x3;
									if (local224) {
										@Pc(2173) Class31_Sub4_Sub3 local2173 = new Class31_Sub4_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, local1901, 0, 0, arg1, local1901 + 4);
										local1853 = local2173;
										if (local2173.method5175()) {
											local2173.method5170(arg6);
										}
									} else {
										local1853 = new Class31_Sub4_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, local1901, 0, 0, arg1, local1901 + 4, arg3);
									}
									@Pc(2188) Class31_Sub4 local2188 = Static198.method3177(arg9, arg7, arg5);
									if (local2188 instanceof Class31_Sub4_Sub2) {
										((Class31_Sub4_Sub2) local2188).aClass31_Sub4_3 = local1853;
									} else {
										Static237.method4962(arg9, arg7, arg5, local1853, null);
									}
								} else if (arg1 == 8) {
									local355 = arg0 + 2 & 0x3;
									@Pc(2214) int local2214 = 9;
									@Pc(2220) Interface5 local2220 = (Interface5) Static110.method1983(arg9, arg7, arg5);
									if (local2220 != null) {
										local2214 = Static349.aClass115_4.method2766(local2220.method5176()).anInt3535 / 2 + 1;
									}
									@Pc(2263) Class31_Sub4 local2263;
									@Pc(2282) Class31_Sub4 local2282;
									if (local224) {
										local2263 = new Class31_Sub4_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, arg0, Static156.anIntArray269[arg0] * local2214, Static127.anIntArray204[arg0] * local2214, arg1, arg0 + 4);
										local2282 = new Class31_Sub4_Sub3(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, arg0, 0, 0, arg1, local355 + 4);
										if (local2263.method5175()) {
											local2263.method5170(arg6);
										}
										if (local2282.method5175()) {
											local2282.method5170(arg6);
										}
									} else {
										local2263 = new Class31_Sub4_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg0, local2214 * Static156.anIntArray269[arg0], Static127.anIntArray204[arg0] * local2214, arg1, arg0 + 4, arg3);
										local2282 = new Class31_Sub4_Sub1(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg0, 0, 0, arg1, local355 + 4, arg3);
									}
									Static237.method4962(arg9, arg7, arg5, local2263, local2282);
								}
							}
						}
					}
				}
			}
		} else if (Static38.aClass135_Sub1_1.aBoolean356 || local34.anInt3504 != 0 || local34.anInt3506 == 1 || local34.aBoolean226) {
			@Pc(284) Class31_Sub1 local284;
			if (local224) {
				@Pc(300) Class31_Sub1_Sub2 local300 = new Class31_Sub1_Sub2(arg6, local34, arg2, local170, local162, local178, super.aBoolean210, arg0, local190);
				if (local300.method5175()) {
					local300.method5170(arg6);
				}
				local284 = local300;
			} else {
				local284 = new Class31_Sub1_Sub3(arg6, local34, arg9, arg2, local170, local162, local178, super.aBoolean210, arg0, arg3);
			}
			@Pc(315) Class31_Sub1 local315 = Static393.method5258(arg9, arg7, arg5);
			if (local315 instanceof Class31_Sub1_Sub1) {
				((Class31_Sub1_Sub1) local315).aClass31_Sub1_1 = local284;
			} else {
				Static428.method5679(arg9, arg7, arg5, local284);
			}
			if (local34.anInt3506 == 1 && arg4 != null) {
				arg4.method4309(arg5, arg7);
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "([BI[Lclient!pd;Lclient!ya;II)V")
	public void method3013(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class188[] arg2, @OriginalArg(3) Class39 arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class1_Sub5 local10 = new Class1_Sub5(arg0);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method5384();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(33) int local33 = local10.method5361();
				if (local33 == 0) {
					break;
				}
				local27 += local33 - 1;
				@Pc(45) int local45 = local27 & 0x3F;
				@Pc(51) int local51 = local27 >> 6 & 0x3F;
				@Pc(55) int local55 = local27 >> 12;
				@Pc(59) int local59 = local10.method5366();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(71) int local71 = arg1 + local51;
				@Pc(75) int local75 = local45 + arg4;
				if (local71 > 0 && local75 > 0 && local71 < super.anInt3470 - 1 && local75 < super.anInt3460 - 1) {
					@Pc(100) Class188 local100 = null;
					if (!super.aBoolean210) {
						@Pc(105) int local105 = local55;
						if ((Static2.aByteArrayArrayArray1[1][local71][local75] & 0x2) == 2) {
							local105 = local55 - 1;
						}
						if (local105 >= 0) {
							local100 = arg2[local105];
						}
					}
					this.method3012(local67, local63, local55, -1, local100, local75, arg3, local71, local12, local55);
				}
			}
		}
	}
}
