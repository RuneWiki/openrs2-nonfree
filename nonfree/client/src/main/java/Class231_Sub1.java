import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sca")
public final class Class231_Sub1 extends Class231 {

	@OriginalMember(owner = "client!sca", name = "K", descriptor = "I")
	public int anInt8044 = 99;

	@OriginalMember(owner = "client!sca", name = "<init>", descriptor = "(IIIZ)V")
	public Class231_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static349.aClass206_3, Static396.aClass56_4);
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!r;I[B[Lclient!ev;IIIBIII)V")
	public void method6693(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class94[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class1_Sub20 local15 = new Class1_Sub20(arg2);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method4373();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method4427();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(48) int local48 = local29 & 0x3F;
				@Pc(54) int local54 = local29 >> 6 & 0x3F;
				@Pc(58) int local58 = local29 >> 12;
				@Pc(62) int local62 = local15.method4393();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (local58 == arg7 && local54 >= arg5 && local54 < arg5 + 8 && local48 >= arg1 && arg1 + 8 > local48) {
					@Pc(106) Class306 local106 = Static146.aClass214_1.method4897(local17);
					@Pc(124) int local124 = arg8 + Static202.method3448(local54 & 0x7, arg9, local70, local48 & 0x7, local106.anInt8414, local106.anInt8385);
					@Pc(141) int local141 = Static388.method5567(local54 & 0x7, local70, local48 & 0x7, local106.anInt8385, local106.anInt8414, arg9) + arg4;
					if (local124 > 0 && local141 > 0 && local124 < super.anInt8031 - 1 && local141 < super.anInt8039 - 1) {
						@Pc(162) Class94 local162 = null;
						if (!super.aBoolean576) {
							@Pc(167) int local167 = arg6;
							if ((Static511.aByteArrayArrayArray19[1][local124][local141] & 0x2) == 2) {
								local167 = arg6 - 1;
							}
							if (local167 >= 0) {
								local162 = arg3[local167];
							}
						}
						this.method6700(-1, arg6, local124, local70 + arg9 & 0x3, local162, arg0, local141, local17, arg6, local66);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(I[IIILclient!io;Lclient!r;IIIBI)V")
	public void method6694(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class1_Sub20 arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean576) {
			return;
		}
		@Pc(13) Class278 local13 = null;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(25) int local25 = (arg7 & 0x7) * 8;
		@Pc(31) int local31 = (arg9 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(80) int local80;
			@Pc(121) int local121;
			@Pc(422) int local422;
			while (arg4.aByteArray52.length > arg4.anInt5238) {
				local39 = arg4.method4393();
				if (local39 == 0) {
					local13 = new Class278(arg4);
				} else {
					@Pc(140) int local140;
					@Pc(144) int local144;
					@Pc(183) int local183;
					@Pc(257) int local257;
					if (local39 == 1) {
						local80 = arg4.method4393();
						if (local80 > 0) {
							for (local422 = 0; local422 < local80; local422++) {
								@Pc(431) Class237 local431 = new Class237(arg5, arg4, 2);
								if (local431.anInt6640 == 31) {
									@Pc(448) Class364 local448 = Static395.aClass335_1.method7409(arg4.method4426());
									local431.method5468(local448.anInt9564, local448.anInt9560, local448.anInt9561, local448.anInt9559);
								}
								if (arg5.method6406() > 0) {
									@Pc(465) Class1_Sub5 local465 = local431.aClass1_Sub5_1;
									local257 = local465.method4159() >> 9;
									local140 = local465.method4158() >> 9;
									if (arg3 == local431.anInt6651 && local25 <= local257 && local257 < local25 + 8 && local140 >= local31 && local31 + 8 > local140) {
										local144 = Static54.method1286(local465.method4159() & 0xFFF, arg6, local465.method4158() & 0xFFF) + (arg2 << 9);
										local257 = local144 >> 9;
										local183 = Static584.method7818(local465.method4159() & 0xFFF, local465.method4158() & 0xFFF, arg6) + (arg8 << 9);
										local140 = local183 >> 9;
										if (local257 >= 0 && local140 >= 0 && super.anInt8031 > local257 && local140 < super.anInt8039) {
											local465.method4161(super.anIntArrayArrayArray17[arg3][local257][local140] - local465.method4163(), local144, local183);
											Static567.method7643(local431);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class278();
						}
						local13.method6376(arg4);
					} else if (local39 != 128) {
						if (local39 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray18 == null) {
							super.aByteArrayArrayArray18 = new byte[4][][];
						}
						for (local80 = 0; local80 < 4; local80++) {
							@Pc(86) byte local86 = arg4.method4432();
							@Pc(125) int local125;
							if (local86 == 0 && super.aByteArrayArrayArray18[arg0] != null) {
								if (arg3 >= local80) {
									local121 = arg2;
									local125 = arg2 + 7;
									local257 = arg8;
									if (local125 < 0) {
										local125 = 0;
									} else if (local125 >= super.anInt8031) {
										local125 = super.anInt8031;
									}
									if (arg8 < 0) {
										local257 = 0;
									} else if (super.anInt8039 <= arg8) {
										local257 = super.anInt8039;
									}
									if (arg2 < 0) {
										local121 = 0;
									} else if (super.anInt8031 <= arg2) {
										local121 = super.anInt8031;
									}
									local140 = arg8 + 7;
									if (local140 < 0) {
										local140 = 0;
									} else if (super.anInt8039 <= local140) {
										local140 = super.anInt8039;
									}
									while (local125 > local121) {
										while (local257 < local140) {
											super.aByteArrayArrayArray18[arg0][local121][local257] = 0;
											local257++;
										}
										local121++;
									}
								}
							} else if (local86 == 1) {
								if (super.aByteArrayArrayArray18[arg0] == null) {
									super.aByteArrayArrayArray18[arg0] = new byte[super.anInt8031 + 1][super.anInt8039 + 1];
								}
								for (local121 = 0; local121 < 64; local121 += 4) {
									for (local125 = 0; local125 < 64; local125 += 4) {
										@Pc(131) byte local131 = arg4.method4432();
										if (arg3 >= local80) {
											for (local140 = local121; local140 < local121 + 4; local140++) {
												for (local144 = local125; local144 < local125 + 4; local144++) {
													if (local140 >= local25 && local140 < local25 + 8 && local31 <= local144 && local31 < local31 + 8) {
														local183 = arg2 + Static254.method4031(local140 & 0x7, arg6, local144 & 0x7);
														@Pc(195) int local195 = arg8 + Static117.method2021(local144 & 0x7, local140 & 0x7, arg6);
														if (local183 >= 0 && super.anInt8031 > local183 && local195 >= 0 && super.anInt8039 > local195) {
															super.aByteArrayArrayArray18[arg0][local183][local195] = local131;
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
						arg4.anInt5238 += 10;
					} else {
						arg1[0] = arg4.method4426();
						arg1[1] = arg4.method4391();
						arg1[2] = arg4.method4391();
						arg1[3] = arg4.method4391();
						arg1[4] = arg4.method4426();
					}
				}
			}
			if (local13 != null) {
				Static292.method4581(arg2 >> 3, local13, arg8 >> 3);
			}
			if (super.aByteArrayArrayArray18 != null && super.aByteArrayArrayArray18[arg0] != null) {
				local39 = arg2 + 7;
				local80 = arg8 + 7;
				for (local422 = arg2; local422 < local39; local422++) {
					for (local121 = arg8; local121 < local80; local121++) {
						super.aByteArrayArrayArray18[arg0][local422][local121] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIILclient!ev;ILclient!r;)V")
	public void method6695(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class94 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class12 arg5) {
		@Pc(5) Interface7 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface7) Static387.method5565(arg2, arg1, arg4);
		}
		if (arg0 == 1) {
			local5 = (Interface7) Static89.method1752(arg2, arg1, arg4);
		}
		if (arg0 == 2) {
			local5 = (Interface7) Static18.method537(arg2, arg1, arg4, ge.class);
		}
		if (arg0 == 3) {
			local5 = (Interface7) Static17.method507(arg2, arg1, arg4);
		}
		if (local5 == null) {
			return;
		}
		@Pc(64) Class306 local64 = Static146.aClass214_1.method4897(local5.method7276());
		@Pc(68) int local68 = local5.method7279();
		@Pc(72) int local72 = local5.method7278();
		if (local64.method6964()) {
			Static179.method2714(local64, arg4, arg2, arg1);
		}
		if (local5.method7275()) {
			local5.method7274(arg5);
		}
		if (arg0 == 0) {
			Static292.method4582(arg2, arg1, arg4);
			if (local64.anInt8406 != 0) {
				arg3.method2226(local64.aBoolean620, local68, local72, arg1, arg4, !local64.aBoolean621);
			}
			if (local64.anInt8374 == 1) {
				if (local72 != 0) {
					if (local72 != 1) {
						if (local72 == 2) {
							Static382.method5522(arg1 + 1, 1, arg4, arg2);
						} else if (local72 == 3) {
							Static382.method5522(arg1, 2, arg4, arg2);
							return;
						}
						return;
					}
					Static382.method5522(arg1, 2, arg4 + 1, arg2);
					return;
				}
				Static382.method5522(arg1, 1, arg4, arg2);
				return;
			}
			return;
		}
		if (arg0 == 1) {
			Static136.method2286(arg2, arg1, arg4);
			return;
		}
		if (arg0 == 2) {
			Static9.method134(arg2, arg1, arg4, ge.class);
			if (local64.anInt8406 != 0 && arg1 + local64.anInt8385 < super.anInt8031 && super.anInt8039 > local64.anInt8385 + arg4 && local64.anInt8414 + arg1 < super.anInt8031 && local64.anInt8414 + arg4 < super.anInt8039) {
				arg3.method2213(local64.anInt8414, local64.aBoolean620, local64.anInt8385, arg4, arg1, !local64.aBoolean621, local72);
				return;
			}
			return;
		}
		if (arg0 != 3) {
			return;
		}
		Static446.method6354(arg2, arg1, arg4);
		if (local64.anInt8406 == 1) {
			arg3.method2216(arg4, arg1);
			return;
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(BILclient!r;Lclient!io;[II)V")
	public void method6696(@OriginalArg(1) int arg0, @OriginalArg(2) Class12 arg1, @OriginalArg(3) Class1_Sub20 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean576) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(19) Class278 local19 = null;
		while (true) {
			@Pc(24) int local24;
			@Pc(63) int local63;
			@Pc(101) int local101;
			@Pc(105) int local105;
			@Pc(498) int local498;
			while (arg2.anInt5238 < arg2.aByteArray52.length) {
				local24 = arg2.method4393();
				if (local24 == 0) {
					local19 = new Class278(arg2);
				} else {
					@Pc(217) int local217;
					@Pc(115) int local115;
					@Pc(121) int local121;
					if (local24 == 1) {
						local63 = arg2.method4393();
						if (local63 > 0) {
							for (local498 = 0; local498 < local63; local498++) {
								@Pc(507) Class237 local507 = new Class237(arg1, arg2, 2);
								if (local507.anInt6640 == 31) {
									@Pc(518) Class364 local518 = Static395.aClass335_1.method7409(arg2.method4426());
									local507.method5468(local518.anInt9564, local518.anInt9560, local518.anInt9561, local518.anInt9559);
								}
								if (arg1.method6406() > 0) {
									@Pc(538) Class1_Sub5 local538 = local507.aClass1_Sub5_1;
									local217 = local538.method4159() + (arg4 << 9);
									local115 = local538.method4158() + (arg0 << 9);
									local121 = local217 >> 9;
									@Pc(564) int local564 = local115 >> 9;
									if (local121 >= 0 && local564 >= 0 && local121 < super.anInt8031 && local564 < super.anInt8039) {
										local538.method4161(super.anIntArrayArrayArray17[local507.anInt6651][local121][local564] - local538.method4163(), local217, local115);
										Static567.method7643(local507);
									}
								}
							}
						}
					} else if (local24 == 2) {
						if (local19 == null) {
							local19 = new Class278();
						}
						local19.method6376(arg2);
					} else if (local24 != 128) {
						if (local24 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray18 == null) {
							super.aByteArrayArrayArray18 = new byte[4][][];
						}
						for (local63 = 0; local63 < 4; local63++) {
							@Pc(69) byte local69 = arg2.method4432();
							if (local69 == 0 && super.aByteArrayArrayArray18[local63] != null) {
								local101 = arg4;
								local105 = arg4 + 64;
								local217 = arg0;
								local115 = arg0 + 64;
								if (local105 < 0) {
									local105 = 0;
								} else if (super.anInt8031 <= local105) {
									local105 = super.anInt8031;
								}
								if (arg0 < 0) {
									local217 = 0;
								} else if (arg0 >= super.anInt8039) {
									local217 = super.anInt8039;
								}
								if (arg4 < 0) {
									local101 = 0;
								} else if (arg4 >= super.anInt8031) {
									local101 = super.anInt8031;
								}
								if (local115 < 0) {
									local115 = 0;
								} else if (local115 >= super.anInt8039) {
									local115 = super.anInt8039;
								}
								while (local105 > local101) {
									while (local217 < local115) {
										super.aByteArrayArrayArray18[local63][local101][local217] = 0;
										local217++;
									}
									local101++;
								}
							} else if (local69 == 1) {
								if (super.aByteArrayArrayArray18[local63] == null) {
									super.aByteArrayArrayArray18[local63] = new byte[super.anInt8031 + 1][super.anInt8039 + 1];
								}
								for (local101 = 0; local101 < 64; local101 += 4) {
									for (local105 = 0; local105 < 64; local105 += 4) {
										@Pc(111) byte local111 = arg2.method4432();
										for (local115 = arg4 + local101; local115 < local101 + arg4 + 4; local115++) {
											for (local121 = arg0 + local105; local121 < arg0 + local105 + 4; local121++) {
												if (local115 >= 0 && local115 < super.anInt8031 && local121 >= 0 && local121 < super.anInt8039) {
													super.aByteArrayArrayArray18[local63][local115][local121] = local111;
												}
											}
										}
									}
								}
							} else if (local69 == 2) {
								if (super.aByteArrayArrayArray18[local63] == null) {
									super.aByteArrayArrayArray18[local63] = new byte[super.anInt8031 + 1][super.anInt8039 + 1];
								}
								if (local63 > 0) {
									local101 = arg4;
									local105 = arg4 + 64;
									local217 = arg0;
									local115 = arg0 + 64;
									if (local105 < 0) {
										local105 = 0;
									} else if (super.anInt8031 <= local105) {
										local105 = super.anInt8031;
									}
									if (arg0 < 0) {
										local217 = 0;
									} else if (super.anInt8039 <= arg0) {
										local217 = super.anInt8039;
									}
									if (arg4 < 0) {
										local101 = 0;
									} else if (super.anInt8031 <= arg4) {
										local101 = super.anInt8031;
									}
									if (local115 < 0) {
										local115 = 0;
									} else if (super.anInt8039 <= local115) {
										local115 = super.anInt8039;
									}
									while (local101 < local105) {
										while (local217 < local115) {
											super.aByteArrayArrayArray18[local63][local101][local217] = super.aByteArrayArrayArray18[local63 - 1][local101][local217];
											local217++;
										}
										local101++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg3 == null) {
						arg2.anInt5238 += 10;
					} else {
						arg3[0] = arg2.method4426();
						arg3[1] = arg2.method4391();
						arg3[2] = arg2.method4391();
						arg3[3] = arg2.method4391();
						arg3[4] = arg2.method4426();
					}
				}
			}
			if (local19 != null) {
				for (local24 = 0; local24 < 8; local24++) {
					for (local63 = 0; local63 < 8; local63++) {
						local498 = local24 + (arg4 >> 3);
						local101 = (arg0 >> 3) + local63;
						if (local498 >= 0 && super.anInt8031 >> 3 > local498 && local101 >= 0 && super.anInt8039 >> 3 > local101) {
							Static292.method4581(local498, local19, local101);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray18 != null) {
				for (local24 = 0; local24 < 4; local24++) {
					if (super.aByteArrayArrayArray18[local24] != null) {
						for (local63 = 0; local63 < 16; local63++) {
							for (local498 = 0; local498 < 16; local498++) {
								local101 = (arg4 >> 2) + local63;
								local105 = (arg0 >> 2) + local498;
								if (local101 >= 0 && local101 < 26 && local105 >= 0 && local105 < 26) {
									super.aByteArrayArrayArray18[local24][local101][local105] = 0;
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

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IZLclient!r;)V")
	public void method6697(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class12 arg1) {
		Static3.method70();
		if (!arg0) {
			@Pc(22) int local22;
			@Pc(26) int local26;
			if (super.anInt8038 > 1) {
				for (local22 = 0; local22 < super.anInt8031; local22++) {
					for (local26 = 0; super.anInt8039 > local26; local26++) {
						if ((Static511.aByteArrayArrayArray19[1][local22][local26] & 0x2) == 2) {
							Static11.method203(local22, local26);
						}
					}
				}
			}
			for (local22 = 0; local22 < super.anInt8038; local22++) {
				for (local26 = 0; local26 <= super.anInt8039; local26++) {
					for (@Pc(64) int local64 = 0; super.anInt8031 >= local64; local64++) {
						if ((super.aByteArrayArrayArray16[local22][local64][local26] & 0x4) != 0) {
							@Pc(79) int local79 = local64;
							@Pc(81) int local81 = local64;
							@Pc(83) int local83;
							for (local83 = local26; local83 > 0 && (super.aByteArrayArrayArray16[local22][local64][local83 - 1] & 0x4) != 0; local83--) {
							}
							@Pc(106) int local106;
							for (local106 = local26; local106 < super.anInt8039 && (super.aByteArrayArrayArray16[local22][local64][local106 + 1] & 0x4) != 0; local106++) {
							}
							@Pc(137) int local137;
							label103: while (local79 > 0) {
								for (local137 = local83; local137 <= local106; local137++) {
									if ((super.aByteArrayArrayArray16[local22][local79 - 1][local137] & 0x4) == 0) {
										break label103;
									}
								}
								local79--;
							}
							label92: while (super.anInt8031 > local81) {
								for (local137 = local83; local137 <= local106; local137++) {
									if ((super.aByteArrayArrayArray16[local22][local81 + 1][local137] & 0x4) == 0) {
										break label92;
									}
								}
								local81++;
							}
							if ((local81 + 1 - local79) * (local106 + 1 - local83) >= 4) {
								local137 = super.anIntArrayArrayArray17[local22][local79][local83];
								Static142.method2309(local137, local137, (local81 << 9) + 512, local79 << 9, local83 << 9, (local106 << 9) + 512, local22);
								for (@Pc(241) int local241 = local79; local241 <= local81; local241++) {
									for (@Pc(245) int local245 = local83; local245 <= local106; local245++) {
										super.aByteArrayArrayArray16[local22][local241][local245] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static534.method7302();
		}
		super.aByteArrayArrayArray16 = null;
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(Lclient!r;I[B[Lclient!ev;II)V")
	public void method6699(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class94[] arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class1_Sub20 local15 = new Class1_Sub20(arg2);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method4373();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method4427();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local15.method4393();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = arg1 + local54;
				@Pc(78) int local78 = local48 + arg4;
				if (local74 > 0 && local78 > 0 && local74 < super.anInt8031 - 1 && super.anInt8039 - 1 > local78) {
					@Pc(110) Class94 local110 = null;
					if (!super.aBoolean576) {
						@Pc(115) int local115 = local58;
						if ((Static511.aByteArrayArrayArray19[1][local74][local78] & 0x2) == 2) {
							local115 = local58 - 1;
						}
						if (local115 >= 0) {
							local110 = arg3[local115];
						}
					}
					this.method6700(-1, local58, local74, local70, local110, arg0, local78, local17, local58, local66);
				}
			}
		}
	}

	@OriginalMember(owner = "client!sca", name = "a", descriptor = "(IIIILclient!ev;Lclient!r;IIIII)V")
	public void method6700(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class94 arg4, @OriginalArg(5) Class12 arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static479.aClass1_Sub7_Sub1_1.method2625(Static375.anInt6609) && !Static484.method6767(Static296.anInt5478, arg6, arg1, arg2)) {
			return;
		}
		if (arg8 < this.anInt8044) {
			this.anInt8044 = arg8;
		}
		@Pc(30) Class306 local30 = Static146.aClass214_1.method4897(arg7);
		if (arg5.method6397() && Static479.aClass1_Sub7_Sub1_1.aBoolean223 && local30.aBoolean611) {
			return;
		}
		@Pc(54) int local54;
		@Pc(57) int local57;
		if (arg3 == 1 || arg3 == 3) {
			local54 = local30.anInt8414;
			local57 = local30.anInt8385;
		} else {
			local54 = local30.anInt8385;
			local57 = local30.anInt8414;
		}
		@Pc(91) int local91;
		@Pc(84) int local84;
		if (arg2 + local54 <= super.anInt8031) {
			local84 = (local54 + 1 >> 1) + arg2;
			local91 = arg2 + (local54 >> 1);
		} else {
			local91 = arg2;
			local84 = arg2 + 1;
		}
		@Pc(111) int local111;
		@Pc(119) int local119;
		if (super.anInt8039 >= local57 + arg6) {
			local111 = arg6 + (local57 >> 1);
			local119 = arg6 + (local57 + 1 >> 1);
		} else {
			local111 = arg6;
			local119 = arg6 + 1;
		}
		@Pc(131) Class17 local131 = Static20.aClass17Array1[arg1];
		@Pc(160) int local160 = local131.method6642(local91, local111) + local131.method6642(local84, local111) + local131.method6642(local91, local119) + local131.method6642(local84, local119) >> 2;
		@Pc(168) int local168 = (local54 << 8) + (arg2 << 9);
		@Pc(176) int local176 = (local57 << 8) + (arg6 << 9);
		@Pc(188) boolean local188 = Static506.aBoolean624 && !super.aBoolean576 && local30.aBoolean615;
		if (local30.method6964()) {
			Static140.method2298(arg8, null, null, arg3, arg2, arg6, local30);
		}
		@Pc(222) boolean local222 = arg0 == -1 && local30.anInt8397 == -1 && local30.anIntArray571 == null && local30.anIntArray570 == null && !local30.aBoolean610;
		if (Static292.aBoolean405 && (Static140.method2296(arg9) && local30.anInt8374 != 1 || !(!Static554.method7511(arg9) || local30.anInt8374 != 0))) {
			return;
		}
		if (arg9 != 22) {
			@Pc(374) Class20_Sub2_Sub4 local374;
			@Pc(342) Class20_Sub2_Sub4_Sub5 local342;
			@Pc(346) int local346;
			@Pc(439) int local439;
			if (arg9 == 10 || arg9 == 11) {
				local342 = null;
				if (local222) {
					@Pc(405) Class20_Sub2_Sub4_Sub5 local405 = new Class20_Sub2_Sub4_Sub5(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg2, arg2 + local54 - 1, arg6, arg6 + local57 - 1, arg9, arg3, local188);
					local342 = local405;
					local346 = local405.method7211();
					local374 = local405;
				} else {
					local346 = 15;
					local374 = new Class20_Sub2_Sub4_Sub3(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg2, arg2 + local54 - 1, arg6, local57 + arg6 - 1, arg9, arg3, arg0);
				}
				if (Static567.method7645(local374, false)) {
					if (local342 != null && local342.method7275()) {
						local342.method7277(arg5);
					}
					if (local30.aBoolean614 && Static506.aBoolean624) {
						if (local346 > 30) {
							local346 = 30;
						}
						for (local439 = 0; local439 <= local54; local439++) {
							for (@Pc(443) int local443 = 0; local443 <= local57; local443++) {
								local131.a(arg2 + local439, local443 + arg6, local346);
							}
						}
					}
				}
				if (local30.anInt8406 != 0 && arg4 != null) {
					arg4.method2219(!local30.aBoolean621, arg2, arg6, local57, local54, local30.aBoolean620);
				}
			} else if ((arg9 < 12 || arg9 > 17) && (arg9 < 18 || arg9 > 21)) {
				@Pc(692) Class20_Sub2_Sub2 local692;
				if (arg9 == 0) {
					@Pc(656) int local656 = local30.anInt8374;
					if (Static304.aBoolean414 && local30.anInt8374 == -1) {
						local656 = 1;
					}
					if (local222) {
						@Pc(682) Class20_Sub2_Sub2_Sub1 local682 = new Class20_Sub2_Sub2_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg9, arg3, local188);
						if (local682.method7275()) {
							local682.method7277(arg5);
						}
						local692 = local682;
					} else {
						local692 = new Class20_Sub2_Sub2_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg9, arg3, arg0);
					}
					Static460.method6541(arg8, arg2, arg6, local692, null);
					if (arg3 == 0) {
						if (Static506.aBoolean624 && local30.aBoolean614) {
							local131.a(arg2, arg6, 50);
							local131.a(arg2, arg6 + 1, 50);
						}
						if (local656 == 1 && !super.aBoolean576) {
							Static410.method5765(arg8, arg6, 1, local30.anInt8388, arg2, local30.anInt8378);
						}
					} else if (arg3 == 1) {
						if (Static506.aBoolean624 && local30.aBoolean614) {
							local131.a(arg2, arg6 + 1, 50);
							local131.a(arg2 + 1, arg6 + 1, 50);
						}
						if (local656 == 1 && !super.aBoolean576) {
							Static410.method5765(arg8, arg6 + 1, 2, local30.anInt8388, arg2, -local30.anInt8378);
						}
					} else if (arg3 == 2) {
						if (Static506.aBoolean624 && local30.aBoolean614) {
							local131.a(arg2 + 1, arg6, 50);
							local131.a(arg2 + 1, arg6 - -1, 50);
						}
						if (local656 == 1 && !super.aBoolean576) {
							Static410.method5765(arg8, arg6, 1, local30.anInt8388, arg2 + 1, -local30.anInt8378);
						}
					} else if (arg3 == 3) {
						if (Static506.aBoolean624 && local30.aBoolean614) {
							local131.a(arg2, arg6, 50);
							local131.a(arg2 + 1, arg6, 50);
						}
						if (local656 == 1 && !super.aBoolean576) {
							Static410.method5765(arg8, arg6, 2, local30.anInt8388, arg2, local30.anInt8378);
						}
					}
					if (local30.anInt8406 != 0 && arg4 != null) {
						arg4.method2224(local30.aBoolean620, arg6, arg2, !local30.aBoolean621, arg9, arg3);
					}
					if (local30.lb != 64) {
						Static213.method3550(arg8, arg2, arg6, local30.lb);
					}
				} else {
					@Pc(946) Class20_Sub2_Sub2_Sub1 local946;
					@Pc(948) Class20_Sub2_Sub2 local948;
					if (arg9 == 1) {
						if (local222) {
							local946 = new Class20_Sub2_Sub2_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg9, arg3, local188);
							local948 = local946;
							if (local946.method7275()) {
								local946.method7277(arg5);
							}
						} else {
							local948 = new Class20_Sub2_Sub2_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg9, arg3, arg0);
						}
						Static460.method6541(arg8, arg2, arg6, local948, null);
						if (local30.aBoolean614 && Static506.aBoolean624) {
							if (arg3 == 0) {
								local131.a(arg2, arg6 + 1, 50);
							} else if (arg3 == 1) {
								local131.a(arg2 + 1, arg6 - -1, 50);
							} else if (arg3 == 2) {
								local131.a(arg2 + 1, arg6, 50);
							} else if (arg3 == 3) {
								local131.a(arg2, arg6, 50);
							}
						}
						if (local30.anInt8406 != 0 && arg4 != null) {
							arg4.method2224(local30.aBoolean620, arg6, arg2, !local30.aBoolean621, arg9, arg3);
						}
					} else if (arg9 == 2) {
						local346 = arg3 + 1 & 0x3;
						if (local222) {
							@Pc(1123) Class20_Sub2_Sub2_Sub1 local1123 = new Class20_Sub2_Sub2_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg9, arg3 + 4, local188);
							@Pc(1139) Class20_Sub2_Sub2_Sub1 local1139 = new Class20_Sub2_Sub2_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg9, local346, local188);
							if (local1123.method7275()) {
								local1123.method7277(arg5);
							}
							if (local1139.method7275()) {
								local1139.method7277(arg5);
							}
							local692 = local1139;
							local948 = local1123;
						} else {
							local948 = new Class20_Sub2_Sub2_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg9, arg3 + 4, arg0);
							local692 = new Class20_Sub2_Sub2_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg9, local346, arg0);
						}
						Static460.method6541(arg8, arg2, arg6, local948, local692);
						if ((local30.anInt8374 == 1 || Static304.aBoolean414 && local30.anInt8374 == -1) && !super.aBoolean576) {
							if (arg3 == 0) {
								Static410.method5765(arg8, arg6, 1, local30.anInt8388, arg2, local30.anInt8378);
								Static410.method5765(arg8, arg6 + 1, 2, local30.anInt8388, arg2, local30.anInt8378);
							} else if (arg3 == 1) {
								Static410.method5765(arg8, arg6, 1, local30.anInt8388, arg2 + 1, local30.anInt8378);
								Static410.method5765(arg8, arg6 + 1, 2, local30.anInt8388, arg2, local30.anInt8378);
							} else if (arg3 == 2) {
								Static410.method5765(arg8, arg6, 1, local30.anInt8388, arg2 + 1, local30.anInt8378);
								Static410.method5765(arg8, arg6, 2, local30.anInt8388, arg2, local30.anInt8378);
							} else if (arg3 == 3) {
								Static410.method5765(arg8, arg6, 1, local30.anInt8388, arg2, local30.anInt8378);
								Static410.method5765(arg8, arg6, 2, local30.anInt8388, arg2, local30.anInt8378);
							}
						}
						if (local30.anInt8406 != 0 && arg4 != null) {
							arg4.method2224(local30.aBoolean620, arg6, arg2, !local30.aBoolean621, arg9, arg3);
						}
						if (local30.lb != 64) {
							Static213.method3550(arg8, arg2, arg6, local30.lb);
						}
					} else if (arg9 == 3) {
						if (local222) {
							local946 = new Class20_Sub2_Sub2_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg9, arg3, local188);
							local948 = local946;
							if (local946.method7275()) {
								local946.method7277(arg5);
							}
						} else {
							local948 = new Class20_Sub2_Sub2_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg9, arg3, arg0);
						}
						Static460.method6541(arg8, arg2, arg6, local948, null);
						if (local30.aBoolean614 && Static506.aBoolean624) {
							if (arg3 == 0) {
								local131.a(arg2, arg6 + 1, 50);
							} else if (arg3 == 1) {
								local131.a(arg2 + 1, arg6 + 1, 50);
							} else if (arg3 == 2) {
								local131.a(arg2 + 1, arg6, 50);
							} else if (arg3 == 3) {
								local131.a(arg2, arg6, 50);
							}
						}
						if (local30.anInt8406 != 0 && arg4 != null) {
							arg4.method2224(local30.aBoolean620, arg6, arg2, !local30.aBoolean621, arg9, arg3);
						}
					} else if (arg9 == 9) {
						if (local222) {
							local342 = new Class20_Sub2_Sub4_Sub5(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg2, arg2, arg6, arg6, arg9, arg3, local188);
							local374 = local342;
							if (local342.method7275()) {
								local342.method7277(arg5);
							}
						} else {
							local374 = new Class20_Sub2_Sub4_Sub3(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg2, arg2 + local54 - 1, arg6, arg6 + local57 - 1, arg9, arg3, arg0);
						}
						Static567.method7645(local374, false);
						if (local30.anInt8406 != 0 && arg4 != null) {
							arg4.method2219(!local30.aBoolean621, arg2, arg6, local57, local54, local30.aBoolean620);
						}
						if (local30.lb != 64) {
							Static213.method3550(arg8, arg2, arg6, local30.lb);
						}
					} else {
						@Pc(1609) Class20_Sub2_Sub1 local1609;
						if (arg9 == 4) {
							if (local222) {
								@Pc(1607) Class20_Sub2_Sub1_Sub1 local1607 = new Class20_Sub2_Sub1_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, 0, 0, arg9, arg3);
								local1609 = local1607;
								if (local1607.method7275()) {
									local1607.method7277(arg5);
								}
							} else {
								local1609 = new Class20_Sub2_Sub1_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, 0, 0, arg9, arg3, arg0);
							}
							Static502.method6984(arg8, arg2, arg6, local1609, null);
						} else {
							@Pc(1653) int local1653;
							@Pc(1659) Interface7 local1659;
							@Pc(1726) Class20_Sub2_Sub1_Sub1 local1726;
							if (arg9 == 5) {
								local1653 = 65;
								local1659 = (Interface7) Static387.method5565(arg8, arg2, arg6);
								if (local1659 != null) {
									local1653 = Static146.aClass214_1.method4897(local1659.method7276()).lb + 1;
								}
								if (local222) {
									local1726 = new Class20_Sub2_Sub1_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, Static247.anIntArray283[arg3] * local1653, Static380.anIntArray449[arg3] * local1653, arg9, arg3);
									local1609 = local1726;
									if (local1726.method7275()) {
										local1726.method7277(arg5);
									}
								} else {
									local1609 = new Class20_Sub2_Sub1_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, local1653 * Static247.anIntArray283[arg3], local1653 * Static380.anIntArray449[arg3], arg9, arg3, arg0);
								}
								Static502.method6984(arg8, arg2, arg6, local1609, null);
							} else if (arg9 == 6) {
								local1653 = 33;
								local1659 = (Interface7) Static387.method5565(arg8, arg2, arg6);
								if (local1659 != null) {
									local1653 = Static146.aClass214_1.method4897(local1659.method7276()).lb / 2 + 1;
								}
								if (local222) {
									local1726 = new Class20_Sub2_Sub1_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, local1653 * Static247.anIntArray283[arg3], Static380.anIntArray449[arg3] * local1653, arg9, arg3 + 4);
									if (local1726.method7275()) {
										local1726.method7277(arg5);
									}
									local1609 = local1726;
								} else {
									local1609 = new Class20_Sub2_Sub1_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, Static444.anIntArray356[arg3] * local1653, local1653 * Static423.anIntArray492[arg3], arg9, arg3 + 4, arg0);
								}
								Static502.method6984(arg8, arg2, arg6, local1609, null);
							} else if (arg9 == 7) {
								local1653 = arg3 + 2 & 0x3;
								if (local222) {
									@Pc(1900) Class20_Sub2_Sub1_Sub1 local1900 = new Class20_Sub2_Sub1_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, 0, 0, arg9, local1653 + 4);
									if (local1900.method7275()) {
										local1900.method7277(arg5);
									}
									local1609 = local1900;
								} else {
									local1609 = new Class20_Sub2_Sub1_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, 0, 0, arg9, local1653 + 4, arg0);
								}
								Static502.method6984(arg8, arg2, arg6, local1609, null);
							} else if (arg9 == 8) {
								local346 = arg3 + 2 & 0x3;
								local439 = 33;
								@Pc(1938) Interface7 local1938 = (Interface7) Static387.method5565(arg8, arg2, arg6);
								if (local1938 != null) {
									local439 = Static146.aClass214_1.method4897(local1938.method7276()).lb / 2 + 1;
								}
								@Pc(1983) Class20_Sub2_Sub1 local1983;
								@Pc(2002) Class20_Sub2_Sub1 local2002;
								if (local222) {
									local1983 = new Class20_Sub2_Sub1_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, Static444.anIntArray356[arg3] * local439, local439 * Static423.anIntArray492[arg3], arg9, arg3 + 4);
									local2002 = new Class20_Sub2_Sub1_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, 0, 0, arg9, local346 + 4);
									if (local1983.method7275()) {
										local1983.method7277(arg5);
									}
									if (local2002.method7275()) {
										local2002.method7277(arg5);
									}
								} else {
									local1983 = new Class20_Sub2_Sub1_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, local439 * Static444.anIntArray356[arg3], Static423.anIntArray492[arg3] * local439, arg9, arg3 + 4, arg0);
									local2002 = new Class20_Sub2_Sub1_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, 0, 0, arg9, local346 + 4, arg0);
								}
								Static502.method6984(arg8, arg2, arg6, local1983, local2002);
							}
						}
					}
				}
			} else {
				if (local222) {
					local342 = new Class20_Sub2_Sub4_Sub5(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg2, arg2 + local54 - 1, arg6, local57 + arg6 - 1, arg9, arg3, local188);
					local374 = local342;
					if (local342.method7275()) {
						local342.method7277(arg5);
					}
				} else {
					local374 = new Class20_Sub2_Sub4_Sub3(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg2, local54 + arg2 - 1, arg6, arg6 + local57 - 1, arg9, arg3, arg0);
				}
				Static567.method7645(local374, false);
				if (Static506.aBoolean624 && !super.aBoolean576 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg8 > 0 && local30.anInt8374 != 0) {
					super.aByteArrayArrayArray16[arg8][arg2][arg6] = (byte) (super.aByteArrayArrayArray16[arg8][arg2][arg6] | 0x4);
				}
				if (local30.anInt8406 != 0 && arg4 != null) {
					arg4.method2219(!local30.aBoolean621, arg2, arg6, local57, local54, local30.aBoolean620);
				}
			}
		} else if (Static479.aClass1_Sub7_Sub1_1.aBoolean220 || local30.anInt8387 != 0 || local30.anInt8406 == 1 || local30.aBoolean608) {
			@Pc(282) Class20_Sub2_Sub3 local282;
			if (local222) {
				@Pc(299) Class20_Sub2_Sub3_Sub1 local299 = new Class20_Sub2_Sub3_Sub1(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg3, local188);
				local282 = local299;
				if (local299.method7275()) {
					local299.method7277(arg5);
				}
			} else {
				local282 = new Class20_Sub2_Sub3_Sub2(arg5, local30, arg8, arg1, local168, local160, local176, super.aBoolean576, arg3, arg0);
			}
			Static267.method4196(arg8, arg2, arg6, local282);
			if (local30.anInt8406 == 1 && arg4 != null) {
				arg4.method2217(arg2, arg6);
			}
		}
	}
}
