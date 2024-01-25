import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class105_Sub1 extends Class105 {

	@OriginalMember(owner = "client!hu", name = "I", descriptor = "I")
	public int anInt3310 = 99;

	static {
		new Class189("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "(IIIZ)V")
	public Class105_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static124.aClass226_15, Static26.aClass106_1);
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!br;Lclient!qa;IIBI)V")
	public void method2676(@OriginalArg(0) int arg0, @OriginalArg(1) Class29 arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) Interface8 local5 = null;
		if (arg3 == 0) {
			local5 = (Interface8) Static321.method4376(arg0, arg5, arg4);
		}
		if (arg3 == 1) {
			local5 = (Interface8) Static113.method4396(arg0, arg5, arg4);
		}
		if (arg3 == 2) {
			local5 = (Interface8) Static314.method4348(arg0, arg5, arg4, pa.class);
		}
		if (arg3 == 3) {
			local5 = (Interface8) Static166.method2721(arg0, arg5, arg4);
		}
		if (local5 == null) {
			return;
		}
		@Pc(64) Class93 local64 = Static435.aClass30_4.method769(local5.method4808());
		@Pc(68) int local68 = local5.method4810();
		@Pc(72) int local72 = local5.method4807();
		if (local64.method2062()) {
			Static158.method2546(arg0, local64, arg5, arg4);
		}
		if (local5.method4809()) {
			local5.method4804(arg2);
		}
		if (arg3 == 0) {
			@Pc(267) Class7_Sub4 local267 = Static321.method4376(arg0, arg5, arg4);
			if (local267 instanceof Class7_Sub4_Sub3) {
				((Class7_Sub4_Sub3) local267).aClass7_Sub4_3 = null;
			} else {
				Static143.method1462(arg0, arg5, arg4);
			}
			if (local64.anInt2780 != 0) {
				arg1.method750(arg5, arg4, local68, local72, local64.aBoolean256, !local64.aBoolean254);
			}
		} else if (arg3 == 1) {
			@Pc(249) Class7_Sub3 local249 = Static113.method4396(arg0, arg5, arg4);
			if (local249 instanceof Class7_Sub3_Sub2) {
				((Class7_Sub3_Sub2) local249).aClass7_Sub3_1 = null;
			} else {
				Static451.method5939(arg0, arg5, arg4);
			}
		} else if (arg3 == 2) {
			@Pc(147) Class7_Sub2 local147 = Static314.method4348(arg0, arg5, arg4, pa.class);
			if (local147 instanceof Class7_Sub2_Sub1 && local147.aShort71 == arg5 && local147.aShort73 == arg4) {
				((Class7_Sub2_Sub1) local147).aClass7_Sub2_1 = null;
			} else {
				Static169.method4554(arg0, arg5, arg4, pa.class);
			}
			if (local64.anInt2780 != 0 && super.anInt3307 > arg5 + local64.anInt2762 && local64.anInt2762 + arg4 < super.anInt3306 && super.anInt3307 > local64.anInt2782 + arg5 && super.anInt3306 > local64.anInt2782 + arg4) {
				arg1.method756(!local64.aBoolean254, local64.aBoolean256, local72, arg5, local64.anInt2762, local64.anInt2782, arg4);
			}
		} else if (arg3 == 3) {
			@Pc(110) Class7_Sub1 local110 = Static166.method2721(arg0, arg5, arg4);
			if (local110 instanceof Class7_Sub1_Sub2) {
				((Class7_Sub1_Sub2) local110).aClass7_Sub1_2 = null;
			} else {
				Static30.method642(arg0, arg5, arg4);
			}
			if (local64.anInt2780 == 1) {
				arg1.method745(arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method2677(@OriginalArg(0) Class172 arg0) {
		Static356.method4746(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt3293 > 1) {
			for (local13 = 0; local13 < super.anInt3307; local13++) {
				for (local17 = 0; super.anInt3306 > local17; local17++) {
					if ((Static9.aByteArrayArrayArray1[1][local13][local17] & 0x2) == 2) {
						Static254.method3766(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; local13 < super.anInt3293; local13++) {
			for (local17 = 0; local17 <= super.anInt3306; local17++) {
				for (@Pc(59) int local59 = 0; super.anInt3307 >= local59; local59++) {
					@Pc(74) int local74;
					@Pc(76) int local76;
					@Pc(78) int local78;
					@Pc(124) int local124;
					@Pc(128) int local128;
					@Pc(217) int local217;
					@Pc(226) int local226;
					@Pc(246) int local246;
					@Pc(250) int local250;
					if ((super.aByteArrayArrayArray10[local13][local59][local17] & 0x1) != 0) {
						local74 = local17;
						local76 = local17;
						local78 = local13;
						while (local74 > 0 && (super.aByteArrayArrayArray10[local13][local59][local74 - 1] & 0x1) != 0) {
							local74--;
						}
						while (local76 < super.anInt3306 && (super.aByteArrayArrayArray10[local13][local59][local76 + 1] & 0x1) != 0) {
							local76++;
						}
						local124 = local13;
						label164: while (local78 > 0) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray10[local78 - 1][local59][local128] & 0x1) == 0) {
									break label164;
								}
							}
							local78--;
						}
						label153: while (local124 < 3) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray10[local124 + 1][local59][local128] & 0x1) == 0) {
									break label153;
								}
							}
							local124++;
						}
						local128 = (local124 + 1 - local78) * (local76 + 1 - local74);
						if (local128 >= 2) {
							local217 = super.anIntArrayArrayArray5[local124][local59][local74] - 240;
							local226 = super.anIntArrayArrayArray5[local78][local59][local74];
							Static195.method3113(1, local59 << 7, local59 << 7, local74 << 7, (local76 << 7) + 128, local217, local226);
							for (local246 = local78; local246 <= local124; local246++) {
								for (local250 = local74; local250 <= local76; local250++) {
									super.aByteArrayArrayArray10[local246][local59][local250] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray10[local13][local59][local17] & 0x2) != 0) {
						local74 = local59;
						local76 = local59;
						local78 = local13;
						while (super.anInt3307 > local76 && (super.aByteArrayArrayArray10[local13][local76 + 1][local17] & 0x2) != 0) {
							local76++;
						}
						while (local74 > 0 && (super.aByteArrayArrayArray10[local13][local74 - 1][local17] & 0x2) != 0) {
							local74--;
						}
						local124 = local13;
						label218: while (local78 > 0) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray10[local78 - 1][local128][local17] & 0x2) == 0) {
									break label218;
								}
							}
							local78--;
						}
						label207: while (local124 < 3) {
							for (local128 = local74; local128 <= local76; local128++) {
								if ((super.aByteArrayArrayArray10[local124 + 1][local128][local17] & 0x2) == 0) {
									break label207;
								}
							}
							local124++;
						}
						local128 = (local76 + 1 - local74) * (local124 + 1 - local78);
						if (local128 >= 2) {
							local217 = super.anIntArrayArrayArray5[local124][local74][local17] - 240;
							local226 = super.anIntArrayArrayArray5[local78][local74][local17];
							Static195.method3113(2, local74 << 7, (local76 << 7) + 128, local17 << 7, local17 << 7, local217, local226);
							for (local246 = local78; local246 <= local124; local246++) {
								for (local250 = local74; local250 <= local76; local250++) {
									super.aByteArrayArrayArray10[local246][local250][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray10[local13][local59][local17] & 0x4) != 0) {
						local74 = local59;
						local76 = local59;
						local78 = local17;
						local124 = local17;
						while (local78 > 0 && (super.aByteArrayArrayArray10[local13][local59][local78 - 1] & 0x4) != 0) {
							local78--;
						}
						while (local124 < super.anInt3306 && (super.aByteArrayArrayArray10[local13][local59][local124 + 1] & 0x4) != 0) {
							local124++;
						}
						label272: while (local74 > 0) {
							for (local128 = local78; local128 <= local124; local128++) {
								if ((super.aByteArrayArrayArray10[local13][local74 - 1][local128] & 0x4) == 0) {
									break label272;
								}
							}
							local74--;
						}
						label261: while (super.anInt3307 > local76) {
							for (local128 = local78; local128 <= local124; local128++) {
								if ((super.aByteArrayArrayArray10[local13][local76 + 1][local128] & 0x4) == 0) {
									break label261;
								}
							}
							local76++;
						}
						if ((local124 + 1 - local78) * (-local74 + local76 + 1) >= 4) {
							local128 = super.anIntArrayArrayArray5[local13][local74][local78];
							Static195.method3113(4, local74 << 7, (local76 << 7) + 128, local78 << 7, (local124 << 7) + 128, local128, local128);
							for (@Pc(711) int local711 = local74; local711 <= local76; local711++) {
								for (local217 = local78; local217 <= local124; local217++) {
									super.aByteArrayArrayArray10[local13][local711][local217] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray10 = null;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "([IIBILclient!cu;Lclient!qa;)V")
	public void method2678(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class3_Sub7 arg3, @OriginalArg(5) Class172 arg4) {
		if (super.aBoolean286) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class163 local13 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		while (true) {
			@Pc(42) int local42;
			@Pc(96) int local96;
			@Pc(104) int local104;
			@Pc(108) int local108;
			@Pc(49) int local49;
			label309: do {
				while (true) {
					@Pc(30) int local30;
					@Pc(217) int local217;
					@Pc(221) int local221;
					while (arg3.anInt3235 < arg3.aByteArray46.length) {
						local30 = arg3.method2582();
						if (local30 == 0) {
							local13 = new Class163(arg3);
						} else {
							if (local30 == 1) {
								local42 = arg3.method2582();
								continue label309;
							}
							if (local30 == 2) {
								if (local13 == null) {
									local13 = new Class163();
								}
								local13.method3846(arg3);
							} else if (local30 != 128) {
								if (local30 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray12 == null) {
									super.aByteArrayArrayArray12 = new byte[4][][];
								}
								for (local42 = 0; local42 < 4; local42++) {
									@Pc(208) byte local208 = arg3.method2612();
									if (local208 == 0 && super.aByteArrayArrayArray12[local42] != null) {
										local217 = arg2;
										local221 = arg2 + 64;
										local96 = arg1;
										if (arg1 < 0) {
											local96 = 0;
										} else if (arg1 >= super.anInt3306) {
											local96 = super.anInt3306;
										}
										local104 = arg1 + 64;
										if (local221 < 0) {
											local221 = 0;
										} else if (super.anInt3307 <= local221) {
											local221 = super.anInt3307;
										}
										if (arg2 < 0) {
											local217 = 0;
										} else if (super.anInt3307 <= arg2) {
											local217 = super.anInt3307;
										}
										if (local104 < 0) {
											local104 = 0;
										} else if (local104 >= super.anInt3306) {
											local104 = super.anInt3306;
										}
										while (local217 < local221) {
											while (local96 < local104) {
												super.aByteArrayArrayArray12[local42][local217][local96] = 0;
												local96++;
											}
											local217++;
										}
									} else if (local208 == 1) {
										if (super.aByteArrayArrayArray12[local42] == null) {
											super.aByteArrayArrayArray12[local42] = new byte[super.anInt3307 + 1][super.anInt3306 + 1];
										}
										for (local217 = 0; local217 < 64; local217 += 4) {
											for (local221 = 0; local221 < 64; local221 += 4) {
												@Pc(344) byte local344 = arg3.method2612();
												for (local104 = arg2 + local217; local104 < local217 + arg2 + 4; local104++) {
													for (local108 = local221 + arg1; local108 < local221 + arg1 + 4; local108++) {
														if (local104 >= 0 && local104 < super.anInt3307 && local108 >= 0 && local108 < super.anInt3306) {
															super.aByteArrayArrayArray12[local42][local104][local108] = local344;
														}
													}
												}
											}
										}
									} else if (local208 == 2) {
										if (super.aByteArrayArrayArray12[local42] == null) {
											super.aByteArrayArrayArray12[local42] = new byte[super.anInt3307 + 1][super.anInt3306 + 1];
										}
										if (local42 > 0) {
											local217 = arg2;
											local221 = arg2 + 64;
											local96 = arg1;
											if (arg2 < 0) {
												local217 = 0;
											} else if (super.anInt3307 <= arg2) {
												local217 = super.anInt3307;
											}
											if (arg1 < 0) {
												local96 = 0;
											} else if (super.anInt3306 <= arg1) {
												local96 = super.anInt3306;
											}
											local104 = arg1 + 64;
											if (local221 < 0) {
												local221 = 0;
											} else if (super.anInt3307 <= local221) {
												local221 = super.anInt3307;
											}
											if (local104 < 0) {
												local104 = 0;
											} else if (local104 >= super.anInt3306) {
												local104 = super.anInt3306;
											}
											while (local221 > local217) {
												while (local96 < local104) {
													super.aByteArrayArrayArray12[local42][local217][local96] = super.aByteArrayArrayArray12[local42 - 1][local217][local96];
													local96++;
												}
												local217++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg0 == null) {
								arg3.anInt3235 += 10;
							} else {
								arg0[0] = arg3.method2588();
								arg0[1] = arg3.method2641();
								arg0[2] = arg3.method2641();
								arg0[3] = arg3.method2641();
								arg0[4] = arg3.method2588();
							}
						}
					}
					if (local13 != null) {
						for (local30 = 0; local30 < 8; local30++) {
							for (local42 = 0; local42 < 8; local42++) {
								local49 = local30 + (arg2 >> 3);
								local217 = local42 + (arg1 >> 3);
								if (local49 >= 0 && super.anInt3307 >> 3 > local49 && local217 >= 0 && local217 < super.anInt3306 >> 3) {
									Static89.method1676(local217, local13, local49);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray12 != null) {
						for (local30 = 0; local30 < 4; local30++) {
							if (super.aByteArrayArrayArray12[local30] != null) {
								for (local42 = 0; local42 < 16; local42++) {
									for (local49 = 0; local49 < 16; local49++) {
										local217 = (arg2 >> 2) + local42;
										local221 = (arg1 >> 2) + local49;
										if (local217 >= 0 && local217 < 26 && local221 >= 0 && local221 < 26) {
											super.aByteArrayArrayArray12[local30][local217][local221] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local42 <= 0);
			for (local49 = 0; local49 < local42; local49++) {
				@Pc(58) Class191 local58 = new Class191(arg4, arg3, 0);
				if (local58.anInt5459 == 31) {
					@Pc(69) Class178 local69 = Static36.aClass242_1.method5196(arg3.method2588());
					local58.method4286(local69.anInt5235, local69.anInt5234, local69.anInt5237, local69.anInt5231);
				}
				if (arg4.method5531() > 0) {
					@Pc(86) Class3_Sub8 local86 = local58.aClass3_Sub8_2;
					local96 = local86.method4404() + (arg2 << 7);
					local104 = (arg1 << 7) + local86.method4395();
					local108 = local96 >> 7;
					@Pc(112) int local112 = local104 >> 7;
					if (local108 >= 0 && local112 >= 0 && local108 < super.anInt3307 && local112 < super.anInt3306) {
						local86.method4405(local96, local104, super.anIntArrayArrayArray5[local58.anInt5456][local108][local112] - local86.method4397());
						if (arg4.method5531() > 0) {
							Static369.method4839(local58);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(II[B[Lclient!br;ILclient!qa;)V")
	public void method2679(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class29[] arg3, @OriginalArg(5) Class172 arg4) {
		@Pc(14) Class3_Sub7 local14 = new Class3_Sub7(arg2);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method2592();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method2638();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local14.method2582();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = arg0 + local53;
				@Pc(77) int local77 = local47 + arg1;
				if (local73 > 0 && local77 > 0 && super.anInt3307 - 1 > local73 && local77 < super.anInt3306 - 1) {
					@Pc(99) Class29 local99 = null;
					if (!super.aBoolean286) {
						@Pc(104) int local104 = local57;
						if ((Static9.aByteArrayArrayArray1[1][local73][local77] & 0x2) == 2) {
							local104 = local57 - 1;
						}
						if (local104 >= 0) {
							local99 = arg3[local104];
						}
					}
					this.method2682(local77, arg4, local69, local65, -1, local99, local73, local57, local16, local57);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!cu;II[ILclient!qa;IIIII)V")
	public void method2681(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class172 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean286) {
			return;
		}
		@Pc(13) Class163 local13 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(25) int local25 = (arg2 & 0x7) * 8;
		@Pc(31) int local31 = (arg0 & 0x7) * 8;
		while (true) {
			@Pc(47) int local47;
			@Pc(106) int local106;
			@Pc(160) int local160;
			@Pc(178) int local178;
			@Pc(54) int local54;
			@Pc(100) int local100;
			label235: do {
				while (true) {
					@Pc(36) int local36;
					@Pc(301) int local301;
					while (arg1.aByteArray46.length > arg1.anInt3235) {
						local36 = arg1.method2582();
						if (local36 == 0) {
							local13 = new Class163(arg1);
						} else {
							if (local36 == 1) {
								local47 = arg1.method2582();
								continue label235;
							}
							if (local36 == 2) {
								if (local13 == null) {
									local13 = new Class163();
								}
								local13.method3846(arg1);
							} else if (local36 != 128) {
								if (local36 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray12 == null) {
									super.aByteArrayArrayArray12 = new byte[4][][];
								}
								for (local47 = 0; local47 < 4; local47++) {
									@Pc(282) byte local282 = arg1.method2612();
									@Pc(305) int local305;
									if (local282 == 0 && super.aByteArrayArrayArray12[arg6] != null) {
										if (arg7 >= local47) {
											local301 = arg8;
											local305 = arg8 + 7;
											local100 = arg5;
											if (arg5 < 0) {
												local100 = 0;
											} else if (arg5 >= super.anInt3306) {
												local100 = super.anInt3306;
											}
											if (arg8 < 0) {
												local301 = 0;
											} else if (super.anInt3307 <= arg8) {
												local301 = super.anInt3307;
											}
											if (local305 < 0) {
												local305 = 0;
											} else if (super.anInt3307 <= local305) {
												local305 = super.anInt3307;
											}
											local106 = arg5 + 7;
											if (local106 < 0) {
												local106 = 0;
											} else if (local106 >= super.anInt3306) {
												local106 = super.anInt3306;
											}
											while (local305 > local301) {
												while (local100 < local106) {
													super.aByteArrayArrayArray12[arg6][local301][local100] = 0;
													local100++;
												}
												local301++;
											}
										}
									} else if (local282 == 1) {
										if (super.aByteArrayArrayArray12[arg6] == null) {
											super.aByteArrayArrayArray12[arg6] = new byte[super.anInt3307 + 1][super.anInt3306 + 1];
										}
										for (local301 = 0; local301 < 64; local301 += 4) {
											for (local305 = 0; local305 < 64; local305 += 4) {
												@Pc(440) byte local440 = arg1.method2612();
												if (arg7 >= local47) {
													for (local106 = local301; local106 < local301 + 4; local106++) {
														for (local160 = local305; local160 < local305 + 4; local160++) {
															if (local25 <= local106 && local25 + 8 > local106 && local160 >= local31 && local31 < local31 + 8) {
																local178 = Static373.method4872(local160 & 0x7, local106 & 0x7, arg9) + arg8;
																@Pc(507) int local507 = Static262.method3811(arg9, local106 & 0x7, local160 & 0x7) + arg5;
																if (local178 >= 0 && local178 < super.anInt3307 && local507 >= 0 && local507 < super.anInt3306) {
																	super.aByteArrayArrayArray12[arg6][local178][local507] = local440;
																}
															}
														}
													}
												}
											}
										}
									}
								}
							} else if (arg3 == null) {
								arg1.anInt3235 += 10;
							} else {
								arg3[0] = arg1.method2588();
								arg3[1] = arg1.method2641();
								arg3[2] = arg1.method2641();
								arg3[3] = arg1.method2641();
								arg3[4] = arg1.method2588();
							}
						}
					}
					if (local13 != null) {
						Static89.method1676(arg5 >> 3, local13, arg8 >> 3);
					}
					if (super.aByteArrayArrayArray12 != null && super.aByteArrayArrayArray12[arg6] != null) {
						local36 = arg8 + 7;
						local47 = arg5 + 7;
						for (local54 = arg8; local54 < local36; local54++) {
							for (local301 = arg5; local301 < local47; local301++) {
								super.aByteArrayArrayArray12[arg6][local54][local301] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local47 <= 0);
			for (local54 = 0; local54 < local47; local54++) {
				@Pc(63) Class191 local63 = new Class191(arg4, arg1, 0);
				if (local63.anInt5459 == 31) {
					@Pc(74) Class178 local74 = Static36.aClass242_1.method5196(arg1.method2588());
					local63.method4286(local74.anInt5235, local74.anInt5234, local74.anInt5237, local74.anInt5231);
				}
				if (arg4.method5531() > 0) {
					@Pc(94) Class3_Sub8 local94 = local63.aClass3_Sub8_2;
					local100 = local94.method4404() >> 7;
					local106 = local94.method4395() >> 7;
					if (local63.anInt5456 == arg7 && local100 >= local25 && local100 < local25 + 8 && local31 <= local106 && local106 < local31 + 8) {
						local160 = (arg8 << 7) + Static207.method3206(local94.method4395() & 0x3FF, arg9, local94.method4404() & 0x3FF);
						local178 = Static162.method2687(arg9, local94.method4404() & 0x3FF, local94.method4395() & 0x3FF) + (arg5 << 7);
						local100 = local160 >> 7;
						local106 = local178 >> 7;
						if (local100 >= 0 && local106 >= 0 && local100 < super.anInt3307 && super.anInt3306 > local106) {
							local94.method4405(local160, local178, super.anIntArrayArrayArray5[arg7][local100][local106] - local94.method4397());
							if (arg4.method5531() > 0) {
								Static369.method4839(local63);
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ILclient!qa;IIIILclient!br;IIII)V")
	public void method2682(@OriginalArg(0) int arg0, @OriginalArg(1) Class172 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class29 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static374.aClass20_Sub1_1.method1814(Static105.anInt2382) && !Static222.method3354(arg0, arg6, arg7, Static228.anInt4246)) {
			return;
		}
		if (this.anInt3310 > arg9) {
			this.anInt3310 = arg9;
		}
		@Pc(28) Class93 local28 = Static435.aClass30_4.method769(arg8);
		if (arg1.method5482() && Static374.aClass20_Sub1_1.aBoolean193 && local28.aBoolean244) {
			return;
		}
		@Pc(51) int local51;
		@Pc(54) int local54;
		if (arg2 == 1 || arg2 == 3) {
			local54 = local28.anInt2762;
			local51 = local28.anInt2782;
		} else {
			local51 = local28.anInt2762;
			local54 = local28.anInt2782;
		}
		@Pc(74) int local74;
		@Pc(83) int local83;
		if (super.anInt3307 >= arg6 + local51) {
			local74 = arg6 + (local51 >> 1);
			local83 = arg6 + (local51 + 1 >> 1);
		} else {
			local74 = arg6;
			local83 = arg6 + 1;
		}
		@Pc(102) int local102;
		@Pc(110) int local110;
		if (local54 + arg0 <= super.anInt3306) {
			local102 = (local54 >> 1) + arg0;
			local110 = (local54 + 1 >> 1) + arg0;
		} else {
			local110 = arg0 + 1;
			local102 = arg0;
		}
		@Pc(121) Class159 local121 = Static444.aClass159Array3[arg7];
		@Pc(145) int local145 = local121.I(local74, local102) + local121.I(local83, local102) + local121.I(local74, local110) + local121.I(local83, local110) >> 2;
		@Pc(153) int local153 = (arg6 << 7) + (local51 << 6);
		@Pc(161) int local161 = (local54 << 6) + (arg0 << 7);
		@Pc(173) boolean local173 = Static113.aBoolean482 && !super.aBoolean286 && local28.aBoolean247;
		if (local28.method2062()) {
			Static387.method5032(arg9, arg2, local28, arg0, null, null, arg6);
		}
		@Pc(207) boolean local207 = arg4 == -1 && local28.anInt2763 == -1 && local28.anIntArray169 == null && local28.anIntArray171 == null && !local28.aBoolean251;
		if (Static451.aBoolean655 && (Static15.method333(arg3) && local28.anInt2786 != 1 || !(!Static283.method4036(arg3) || local28.anInt2786 != 0))) {
			return;
		}
		if (arg3 != 22) {
			@Pc(361) Class7_Sub2 local361;
			@Pc(329) Class7_Sub2_Sub2 local329;
			@Pc(365) int local365;
			if (arg3 == 10 || arg3 == 11) {
				local329 = null;
				if (local207) {
					@Pc(359) Class7_Sub2_Sub2 local359 = new Class7_Sub2_Sub2(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg6, arg6 + local51 - 1, arg0, local54 + arg0 - 1, arg3, arg2, local173);
					local361 = local359;
					local365 = local359.method365();
					local329 = local359;
				} else {
					local361 = new Class7_Sub2_Sub4(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg6, local51 + arg6 - 1, arg0, local54 + arg0 - 1, arg3, arg2, arg4);
					local365 = 15;
				}
				@Pc(411) Class7_Sub2 local411 = Static314.method4348(arg9, arg6, arg0, pa.class);
				@Pc(413) boolean local413 = false;
				if (local411 instanceof Class7_Sub2_Sub1 && local411.aShort71 == arg6 && arg0 == local411.aShort73) {
					((Class7_Sub2_Sub1) local411).aClass7_Sub2_1 = local361;
					local413 = true;
				}
				if (local413 || Static149.method2419(local361, false)) {
					if (local329 != null && local329.method4809()) {
						local329.method4806(arg1);
					}
					if (local28.aBoolean246 && Static113.aBoolean482) {
						if (local365 > 30) {
							local365 = 30;
						}
						for (@Pc(458) int local458 = 0; local458 <= local51; local458++) {
							for (@Pc(461) int local461 = 0; local461 <= local54; local461++) {
								local121.QA(local458 + arg6, local461 + arg0, local365);
							}
						}
					}
				}
				if (local28.anInt2780 != 0 && arg5 != null) {
					arg5.method759(!local28.aBoolean254, local54, local51, arg0, local28.aBoolean256, arg6);
				}
			} else {
				@Pc(611) Class7_Sub2 local611;
				if (arg3 >= 12 && arg3 <= 17 || arg3 >= 18 && arg3 <= 21) {
					if (local207) {
						local329 = new Class7_Sub2_Sub2(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg6, arg6 + local51 - 1, arg0, arg0 + local54 - 1, arg3, arg2, local173);
						if (local329.method4809()) {
							local329.method4806(arg1);
						}
						local361 = local329;
					} else {
						local361 = new Class7_Sub2_Sub4(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg6, arg6 + local51 - 1, arg0, arg0 + local54 - 1, arg3, arg2, arg4);
					}
					local611 = Static314.method4348(arg9, arg6, arg0, pa.class);
					if (local611 instanceof Class7_Sub2_Sub1 && local611.aShort71 == arg6 && local611.aShort73 == arg0) {
						((Class7_Sub2_Sub1) local611).aClass7_Sub2_1 = local361;
					} else {
						Static149.method2419(local361, false);
					}
					if (Static113.aBoolean482 && !super.aBoolean286 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg9 > 0 && local28.anInt2786 != 0) {
						super.aByteArrayArrayArray10[arg9][arg6][arg0] = (byte) (super.aByteArrayArrayArray10[arg9][arg6][arg0] | 0x4);
					}
					if (local28.anInt2780 != 0 && arg5 != null) {
						arg5.method759(!local28.aBoolean254, local54, local51, arg0, local28.aBoolean256, arg6);
					}
				} else {
					@Pc(741) Class7_Sub4 local741;
					if (arg3 == 0) {
						@Pc(714) int local714 = local28.anInt2786;
						if (Static231.aBoolean373 && local28.anInt2786 == -1) {
							local714 = 1;
						}
						if (local207) {
							@Pc(757) Class7_Sub4_Sub2 local757 = new Class7_Sub4_Sub2(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, arg3, arg2, local173);
							if (local757.method4809()) {
								local757.method4806(arg1);
							}
							local741 = local757;
						} else {
							local741 = new Class7_Sub4_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg3, arg2, arg4);
						}
						@Pc(772) Class7_Sub4 local772 = Static321.method4376(arg9, arg6, arg0);
						if (local772 instanceof Class7_Sub4_Sub3) {
							((Class7_Sub4_Sub3) local772).aClass7_Sub4_3 = local741;
						} else {
							Static6.method41(arg9, arg6, arg0, local741, null);
						}
						if (Static113.aBoolean482) {
							if (arg2 == 0) {
								if (local28.aBoolean246) {
									local121.QA(arg6, arg0, 50);
									local121.QA(arg6, arg0 + 1, 50);
								}
								if (local714 == 1 && !super.aBoolean286) {
									super.aByteArrayArrayArray10[arg9][arg6][arg0] = (byte) (super.aByteArrayArrayArray10[arg9][arg6][arg0] | 0x1);
								}
							} else if (arg2 == 1) {
								if (local28.aBoolean246) {
									local121.QA(arg6, arg0 + 1, 50);
									local121.QA(arg6 + 1, arg0 - -1, 50);
								}
								if (local714 == 1 && !super.aBoolean286) {
									super.aByteArrayArrayArray10[arg9][arg6][arg0 + 1] = (byte) (super.aByteArrayArrayArray10[arg9][arg6][arg0 + 1] | 0x2);
								}
							} else if (arg2 == 2) {
								if (local28.aBoolean246) {
									local121.QA(arg6 + 1, arg0, 50);
									local121.QA(arg6 + 1, arg0 + 1, 50);
								}
								if (local714 == 1 && !super.aBoolean286) {
									super.aByteArrayArrayArray10[arg9][arg6 + 1][arg0] = (byte) (super.aByteArrayArrayArray10[arg9][arg6 + 1][arg0] | 0x1);
								}
							} else if (arg2 == 3) {
								if (local28.aBoolean246) {
									local121.QA(arg6, arg0, 50);
									local121.QA(arg6 + 1, arg0, 50);
								}
								if (local714 == 1 && !super.aBoolean286) {
									super.aByteArrayArrayArray10[arg9][arg6][arg0] = (byte) (super.aByteArrayArrayArray10[arg9][arg6][arg0] | 0x2);
								}
							}
						}
						if (local28.anInt2780 != 0 && arg5 != null) {
							arg5.method749(arg2, arg6, arg3, !local28.aBoolean254, arg0, local28.aBoolean256);
						}
						if (local28.anInt2756 != 16) {
							Static284.method4041(arg9, arg6, arg0, local28.anInt2756);
						}
					} else {
						@Pc(1040) Class7_Sub4_Sub2 local1040;
						@Pc(1042) Class7_Sub4 local1042;
						if (arg3 == 1) {
							if (local207) {
								local1040 = new Class7_Sub4_Sub2(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, arg3, arg2, local173);
								local1042 = local1040;
								if (local1040.method4809()) {
									local1040.method4806(arg1);
								}
							} else {
								local1042 = new Class7_Sub4_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg3, arg2, arg4);
							}
							local741 = Static321.method4376(arg9, arg6, arg0);
							if (local741 instanceof Class7_Sub4_Sub3) {
								((Class7_Sub4_Sub3) local741).aClass7_Sub4_3 = local1042;
							} else {
								Static6.method41(arg9, arg6, arg0, local1042, null);
							}
							if (local28.aBoolean246 && Static113.aBoolean482) {
								if (arg2 == 0) {
									local121.QA(arg6, arg0 + 1, 50);
								} else if (arg2 == 1) {
									local121.QA(arg6 + 1, arg0 + 1, 50);
								} else if (arg2 == 2) {
									local121.QA(arg6 + 1, arg0, 50);
								} else if (arg2 == 3) {
									local121.QA(arg6, arg0, 50);
								}
							}
							if (local28.anInt2780 != 0 && arg5 != null) {
								arg5.method749(arg2, arg6, arg3, !local28.aBoolean254, arg0, local28.aBoolean256);
							}
						} else if (arg3 == 2) {
							local365 = arg2 + 1 & 0x3;
							if (local207) {
								@Pc(1195) Class7_Sub4_Sub2 local1195 = new Class7_Sub4_Sub2(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, arg3, arg2 + 4, local173);
								@Pc(1210) Class7_Sub4_Sub2 local1210 = new Class7_Sub4_Sub2(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, arg3, local365, local173);
								if (local1195.method4809()) {
									local1195.method4806(arg1);
								}
								if (local1210.method4809()) {
									local1210.method4806(arg1);
								}
								local1042 = local1195;
								local741 = local1210;
							} else {
								local1042 = new Class7_Sub4_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg3, arg2 + 4, arg4);
								local741 = new Class7_Sub4_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg3, local365, arg4);
							}
							Static6.method41(arg9, arg6, arg0, local1042, local741);
							if (local28.anInt2786 == 1 && Static113.aBoolean482 && !super.aBoolean286) {
								if (arg2 == 0) {
									super.aByteArrayArrayArray10[arg9][arg6][arg0] = (byte) (super.aByteArrayArrayArray10[arg9][arg6][arg0] | 0x1);
									super.aByteArrayArrayArray10[arg9][arg6][arg0 + 1] = (byte) (super.aByteArrayArrayArray10[arg9][arg6][arg0 + 1] | 0x2);
								} else if (arg2 == 1) {
									super.aByteArrayArrayArray10[arg9][arg6][arg0 + 1] = (byte) (super.aByteArrayArrayArray10[arg9][arg6][arg0 + 1] | 0x2);
									super.aByteArrayArrayArray10[arg9][arg6 + 1][arg0] = (byte) (super.aByteArrayArrayArray10[arg9][arg6 + 1][arg0] | 0x1);
								} else if (arg2 == 2) {
									super.aByteArrayArrayArray10[arg9][arg6 + 1][arg0] = (byte) (super.aByteArrayArrayArray10[arg9][arg6 + 1][arg0] | 0x1);
									super.aByteArrayArrayArray10[arg9][arg6][arg0] = (byte) (super.aByteArrayArrayArray10[arg9][arg6][arg0] | 0x2);
								} else if (arg2 == 3) {
									super.aByteArrayArrayArray10[arg9][arg6][arg0] = (byte) (super.aByteArrayArrayArray10[arg9][arg6][arg0] | 0x2);
									super.aByteArrayArrayArray10[arg9][arg6][arg0] = (byte) (super.aByteArrayArrayArray10[arg9][arg6][arg0] | 0x1);
								}
							}
							if (local28.anInt2780 != 0 && arg5 != null) {
								arg5.method749(arg2, arg6, arg3, !local28.aBoolean254, arg0, local28.aBoolean256);
							}
							if (local28.anInt2756 != 16) {
								Static284.method4041(arg9, arg6, arg0, local28.anInt2756);
							}
						} else if (arg3 == 3) {
							if (local207) {
								local1040 = new Class7_Sub4_Sub2(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, arg3, arg2, local173);
								local1042 = local1040;
								if (local1040.method4809()) {
									local1040.method4806(arg1);
								}
							} else {
								local1042 = new Class7_Sub4_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg3, arg2, arg4);
							}
							local741 = Static321.method4376(arg9, arg6, arg0);
							if (local741 instanceof Class7_Sub4_Sub3) {
								((Class7_Sub4_Sub3) local741).aClass7_Sub4_3 = local1042;
							} else {
								Static6.method41(arg9, arg6, arg0, local1042, null);
							}
							if (local28.aBoolean246 && Static113.aBoolean482) {
								if (arg2 == 0) {
									local121.QA(arg6, arg0 + 1, 50);
								} else if (arg2 == 1) {
									local121.QA(arg6 + 1, arg0 + 1, 50);
								} else if (arg2 == 2) {
									local121.QA(arg6 + 1, arg0, 50);
								} else if (arg2 == 3) {
									local121.QA(arg6, arg0, 50);
								}
							}
							if (local28.anInt2780 != 0 && arg5 != null) {
								arg5.method749(arg2, arg6, arg3, !local28.aBoolean254, arg0, local28.aBoolean256);
							}
						} else if (arg3 == 9) {
							if (local207) {
								local329 = new Class7_Sub2_Sub2(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg6, arg6, arg0, arg0, arg3, arg2, local173);
								local361 = local329;
								if (local329.method4809()) {
									local329.method4806(arg1);
								}
							} else {
								local361 = new Class7_Sub2_Sub4(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg6, local51 + arg6 - 1, arg0, local54 + arg0 - 1, arg3, arg2, arg4);
							}
							local611 = Static314.method4348(arg9, arg6, arg0, pa.class);
							if (local611 instanceof Class7_Sub2_Sub1 && local611.aShort71 == arg6 && local611.aShort73 == arg0) {
								((Class7_Sub2_Sub1) local611).aClass7_Sub2_1 = local361;
							} else {
								Static149.method2419(local361, false);
							}
							if (local28.anInt2780 != 0 && arg5 != null) {
								arg5.method759(!local28.aBoolean254, local54, local51, arg0, local28.aBoolean256, arg6);
							}
							if (local28.anInt2756 != 16) {
								Static284.method4041(arg9, arg6, arg0, local28.anInt2756);
							}
						} else {
							@Pc(1803) Class7_Sub3 local1803;
							if (arg3 == 4) {
								if (local207) {
									@Pc(1821) Class7_Sub3_Sub3 local1821 = new Class7_Sub3_Sub3(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, 0, 0, 0, arg3, arg2);
									if (local1821.method4809()) {
										local1821.method4806(arg1);
									}
									local1803 = local1821;
								} else {
									local1803 = new Class7_Sub3_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, 0, 0, 0, arg3, arg2, arg4);
								}
								@Pc(1836) Class7_Sub3 local1836 = Static113.method4396(arg9, arg6, arg0);
								if (local1836 instanceof Class7_Sub3_Sub2) {
									((Class7_Sub3_Sub2) local1836).aClass7_Sub3_1 = local1803;
								} else {
									Static455.method5994(arg9, arg6, arg0, local1803, null);
								}
							} else {
								@Pc(1856) int local1856;
								@Pc(1862) Interface8 local1862;
								@Pc(1929) Class7_Sub3_Sub3 local1929;
								@Pc(1944) Class7_Sub3 local1944;
								if (arg3 == 5) {
									local1856 = 17;
									local1862 = (Interface8) Static321.method4376(arg9, arg6, arg0);
									if (local1862 != null) {
										local1856 = Static435.aClass30_4.method769(local1862.method4808()).anInt2756 + 1;
									}
									if (local207) {
										local1929 = new Class7_Sub3_Sub3(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, 0, local1856 * Static294.anIntArray358[arg2], local1856 * Static195.anIntArray245[arg2], arg3, arg2);
										local1803 = local1929;
										if (local1929.method4809()) {
											local1929.method4806(arg1);
										}
									} else {
										local1803 = new Class7_Sub3_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, 0, Static294.anIntArray358[arg2] * local1856, local1856 * Static195.anIntArray245[arg2], arg3, arg2, arg4);
									}
									local1944 = Static113.method4396(arg9, arg6, arg0);
									if (local1944 instanceof Class7_Sub3_Sub2) {
										((Class7_Sub3_Sub2) local1944).aClass7_Sub3_1 = local1803;
									} else {
										Static455.method5994(arg9, arg6, arg0, local1803, null);
									}
								} else if (arg3 == 6) {
									local1856 = 9;
									local1862 = (Interface8) Static321.method4376(arg9, arg6, arg0);
									if (local1862 != null) {
										local1856 = Static435.aClass30_4.method769(local1862.method4808()).anInt2756 / 2 + 1;
									}
									if (local207) {
										local1929 = new Class7_Sub3_Sub3(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, arg2, Static294.anIntArray358[arg2] * local1856, Static195.anIntArray245[arg2] * local1856, arg3, arg2 + 4);
										local1803 = local1929;
										if (local1929.method4809()) {
											local1929.method4806(arg1);
										}
									} else {
										local1803 = new Class7_Sub3_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg2, Static347.anIntArray389[arg2] * local1856, Static420.anIntArray499[arg2] * local1856, arg3, arg2 + 4, arg4);
									}
									local1944 = Static113.method4396(arg9, arg6, arg0);
									if (local1944 instanceof Class7_Sub3_Sub2) {
										((Class7_Sub3_Sub2) local1944).aClass7_Sub3_1 = local1803;
									} else {
										Static455.method5994(arg9, arg6, arg0, local1803, null);
									}
								} else if (arg3 == 7) {
									local1856 = arg2 + 2 & 0x3;
									if (local207) {
										@Pc(2129) Class7_Sub3_Sub3 local2129 = new Class7_Sub3_Sub3(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, local1856, 0, 0, arg3, local1856 + 4);
										if (local2129.method4809()) {
											local2129.method4806(arg1);
										}
										local1803 = local2129;
									} else {
										local1803 = new Class7_Sub3_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, local1856, 0, 0, arg3, local1856 + 4, arg4);
									}
									@Pc(2144) Class7_Sub3 local2144 = Static113.method4396(arg9, arg6, arg0);
									if (local2144 instanceof Class7_Sub3_Sub2) {
										((Class7_Sub3_Sub2) local2144).aClass7_Sub3_1 = local1803;
									} else {
										Static455.method5994(arg9, arg6, arg0, local1803, null);
									}
								} else if (arg3 == 8) {
									local365 = arg2 + 2 & 0x3;
									@Pc(2170) int local2170 = 9;
									@Pc(2176) Interface8 local2176 = (Interface8) Static321.method4376(arg9, arg6, arg0);
									if (local2176 != null) {
										local2170 = Static435.aClass30_4.method769(local2176.method4808()).anInt2756 / 2 + 1;
									}
									@Pc(2219) Class7_Sub3 local2219;
									@Pc(2238) Class7_Sub3 local2238;
									if (local207) {
										local2219 = new Class7_Sub3_Sub3(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, arg2, local2170 * Static347.anIntArray389[arg2], Static420.anIntArray499[arg2] * local2170, arg3, arg2 + 4);
										local2238 = new Class7_Sub3_Sub3(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, arg2, 0, 0, arg3, local365 + 4);
										if (local2219.method4809()) {
											local2219.method4806(arg1);
										}
										if (local2238.method4809()) {
											local2238.method4806(arg1);
										}
									} else {
										local2219 = new Class7_Sub3_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg2, local2170 * Static347.anIntArray389[arg2], local2170 * Static420.anIntArray499[arg2], arg3, arg2 + 4, arg4);
										local2238 = new Class7_Sub3_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg2, 0, 0, arg3, local365 + 4, arg4);
									}
									Static455.method5994(arg9, arg6, arg0, local2219, local2238);
								}
							}
						}
					}
				}
			}
		} else if (Static374.aClass20_Sub1_1.aBoolean183 || local28.anInt2768 != 0 || local28.anInt2780 == 1 || local28.aBoolean258) {
			@Pc(262) Class7_Sub1 local262;
			if (local207) {
				@Pc(277) Class7_Sub1_Sub3 local277 = new Class7_Sub1_Sub3(arg1, local28, arg7, local153, local145, local161, super.aBoolean286, arg2, local173);
				if (local277.method4809()) {
					local277.method4806(arg1);
				}
				local262 = local277;
			} else {
				local262 = new Class7_Sub1_Sub1(arg1, local28, arg9, arg7, local153, local145, local161, super.aBoolean286, arg2, arg4);
			}
			@Pc(292) Class7_Sub1 local292 = Static166.method2721(arg9, arg6, arg0);
			if (local292 instanceof Class7_Sub1_Sub2) {
				((Class7_Sub1_Sub2) local292).aClass7_Sub1_2 = local262;
			} else {
				Static135.method2143(arg9, arg6, arg0, local262);
			}
			if (local28.anInt2780 == 1 && arg5 != null) {
				arg5.method752(arg6, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I[Lclient!br;II[BIIILclient!qa;II)V")
	public void method2683(@OriginalArg(0) int arg0, @OriginalArg(1) Class29[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class172 arg8, @OriginalArg(9) int arg9) {
		@Pc(8) Class3_Sub7 local8 = new Class3_Sub7(arg4);
		@Pc(10) int local10 = -1;
		while (true) {
			@Pc(14) int local14 = local8.method2592();
			if (local14 == 0) {
				return;
			}
			local10 += local14;
			@Pc(22) int local22 = 0;
			while (true) {
				@Pc(26) int local26 = local8.method2638();
				if (local26 == 0) {
					break;
				}
				local22 += local26 - 1;
				@Pc(38) int local38 = local22 & 0x3F;
				@Pc(44) int local44 = local22 >> 6 & 0x3F;
				@Pc(48) int local48 = local22 >> 12;
				@Pc(52) int local52 = local8.method2582();
				@Pc(56) int local56 = local52 >> 2;
				@Pc(60) int local60 = local52 & 0x3;
				if (arg0 == local48 && local44 >= arg2 && arg2 + 8 > local44 && arg6 <= local38 && local38 < arg6 + 8) {
					@Pc(100) Class93 local100 = Static435.aClass30_4.method769(local10);
					@Pc(117) int local117 = arg3 + Static385.method5002(arg5, local100.anInt2762, local44 & 0x7, local100.anInt2782, local60, local38 & 0x7);
					@Pc(134) int local134 = Static239.method1380(local60, local100.anInt2762, local44 & 0x7, arg5, local38 & 0x7, local100.anInt2782) + arg7;
					if (local117 > 0 && local134 > 0 && super.anInt3307 - 1 > local117 && super.anInt3306 - 1 > local134) {
						@Pc(152) Class29 local152 = null;
						if (!super.aBoolean286) {
							@Pc(157) int local157 = arg9;
							if ((Static9.aByteArrayArrayArray1[1][local117][local134] & 0x2) == 2) {
								local157 = arg9 - 1;
							}
							if (local157 >= 0) {
								local152 = arg1[local157];
							}
						}
						this.method2682(local134, arg8, arg5 + local60 & 0x3, local56, -1, local152, local117, arg9, local10, arg9);
					}
				}
			}
		}
	}
}
