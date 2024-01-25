import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class134_Sub1 extends Class134 {

	@OriginalMember(owner = "client!tf", name = "R", descriptor = "I")
	public int anInt6644 = 99;

	@OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(IIIZ)V")
	public Class134_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static62.aClass112_1, Static339.aClass23_4);
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!qa;)V")
	public void method5156(@OriginalArg(1) Class30 arg0) {
		Static97.method1572(arg0);
		@Pc(21) int local21;
		@Pc(25) int local25;
		if (super.anInt6621 > 1) {
			for (local21 = 0; super.anInt6630 > local21; local21++) {
				for (local25 = 0; local25 < super.anInt6620; local25++) {
					if ((Static327.aByteArrayArrayArray11[1][local21][local25] & 0x2) == 2) {
						Static265.method2591(local21, local25);
					}
				}
			}
		}
		for (local21 = 0; super.anInt6621 > local21; local21++) {
			for (local25 = 0; super.anInt6620 >= local25; local25++) {
				for (@Pc(65) int local65 = 0; super.anInt6630 >= local65; local65++) {
					@Pc(80) int local80;
					@Pc(82) int local82;
					@Pc(84) int local84;
					@Pc(130) int local130;
					@Pc(134) int local134;
					@Pc(227) int local227;
					@Pc(236) int local236;
					@Pc(256) int local256;
					@Pc(260) int local260;
					if ((super.aByteArrayArrayArray17[local21][local65][local25] & 0x1) != 0) {
						local80 = local25;
						local82 = local25;
						local84 = local21;
						while (local80 > 0 && (super.aByteArrayArrayArray17[local21][local65][local80 - 1] & 0x1) != 0) {
							local80--;
						}
						while (local82 < super.anInt6620 && (super.aByteArrayArrayArray17[local21][local65][local82 + 1] & 0x1) != 0) {
							local82++;
						}
						local130 = local21;
						label164: while (local84 > 0) {
							for (local134 = local80; local134 <= local82; local134++) {
								if ((super.aByteArrayArrayArray17[local84 - 1][local65][local134] & 0x1) == 0) {
									break label164;
								}
							}
							local84--;
						}
						label153: while (local130 < 3) {
							for (local134 = local80; local134 <= local82; local134++) {
								if ((super.aByteArrayArrayArray17[local130 + 1][local65][local134] & 0x1) == 0) {
									break label153;
								}
							}
							local130++;
						}
						local134 = (local82 + 1 - local80) * (local130 + 1 - local84);
						if (local134 >= 2) {
							local227 = super.anIntArrayArrayArray15[local130][local65][local80] - 240;
							local236 = super.anIntArrayArrayArray15[local84][local65][local80];
							Static122.method1871(1, local65 << 7, local65 << 7, local80 << 7, (local82 << 7) + 128, local227, local236);
							for (local256 = local84; local256 <= local130; local256++) {
								for (local260 = local80; local260 <= local82; local260++) {
									super.aByteArrayArrayArray17[local256][local65][local260] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray17[local21][local65][local25] & 0x2) != 0) {
						local80 = local65;
						local82 = local65;
						local84 = local21;
						while (super.anInt6630 > local82 && (super.aByteArrayArrayArray17[local21][local82 + 1][local25] & 0x2) != 0) {
							local82++;
						}
						local130 = local21;
						while (local80 > 0 && (super.aByteArrayArrayArray17[local21][local80 - 1][local25] & 0x2) != 0) {
							local80--;
						}
						label218: while (local84 > 0) {
							for (local134 = local80; local134 <= local82; local134++) {
								if ((super.aByteArrayArrayArray17[local84 - 1][local134][local25] & 0x2) == 0) {
									break label218;
								}
							}
							local84--;
						}
						label207: while (local130 < 3) {
							for (local134 = local80; local134 <= local82; local134++) {
								if ((super.aByteArrayArrayArray17[local130 + 1][local134][local25] & 0x2) == 0) {
									break label207;
								}
							}
							local130++;
						}
						local134 = (local82 + 1 - local80) * (local130 + 1 - local84);
						if (local134 >= 2) {
							local227 = super.anIntArrayArrayArray15[local130][local80][local25] - 240;
							local236 = super.anIntArrayArrayArray15[local84][local80][local25];
							Static122.method1871(2, local80 << 7, (local82 << 7) + 128, local25 << 7, local25 << 7, local227, local236);
							for (local256 = local84; local256 <= local130; local256++) {
								for (local260 = local80; local260 <= local82; local260++) {
									super.aByteArrayArrayArray17[local256][local260][local25] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray17[local21][local65][local25] & 0x4) != 0) {
						local80 = local65;
						local82 = local65;
						local84 = local25;
						local130 = local25;
						while (local84 > 0 && (super.aByteArrayArrayArray17[local21][local65][local84 - 1] & 0x4) != 0) {
							local84--;
						}
						while (local130 < super.anInt6620 && (super.aByteArrayArrayArray17[local21][local65][local130 + 1] & 0x4) != 0) {
							local130++;
						}
						label272: while (local80 > 0) {
							for (local134 = local84; local134 <= local130; local134++) {
								if ((super.aByteArrayArrayArray17[local21][local80 - 1][local134] & 0x4) == 0) {
									break label272;
								}
							}
							local80--;
						}
						label261: while (super.anInt6630 > local82) {
							for (local134 = local84; local134 <= local130; local134++) {
								if ((super.aByteArrayArrayArray17[local21][local82 + 1][local134] & 0x4) == 0) {
									break label261;
								}
							}
							local82++;
						}
						if ((local82 + 1 - local80) * (local130 + 1 - local84) >= 4) {
							local134 = super.anIntArrayArrayArray15[local21][local80][local84];
							Static122.method1871(4, local80 << 7, (local82 << 7) + 128, local84 << 7, (local130 << 7) + 128, local134, local134);
							for (@Pc(699) int local699 = local80; local699 <= local82; local699++) {
								for (local227 = local84; local227 <= local130; local227++) {
									super.aByteArrayArrayArray17[local21][local699][local227] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray17 = null;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!wq;Lclient!qa;IIIIZ)V")
	public void method5157(@OriginalArg(0) Class268 arg0, @OriginalArg(1) Class30 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) Interface11 local7 = null;
		if (arg2 == 0) {
			local7 = (Interface11) Static138.method1998(arg4, arg3, arg5);
		}
		if (arg2 == 1) {
			local7 = (Interface11) Static351.method4929(arg4, arg3, arg5);
		}
		if (arg2 == 2) {
			local7 = (Interface11) Static134.method1950(arg4, arg3, arg5, ou.class);
		}
		if (arg2 == 3) {
			local7 = (Interface11) Static40.method729(arg4, arg3, arg5);
		}
		if (local7 == null) {
			return;
		}
		@Pc(73) Class71 local73 = Static2.aClass74_13.method1683(local7.method5648());
		@Pc(77) int local77 = local7.method5644();
		@Pc(81) int local81 = local7.method5649();
		if (local73.method1631()) {
			Static453.method5623(arg3, arg4, arg5, local73);
		}
		if (local7.method5645()) {
			local7.method5642(arg1);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				@Pc(263) Class6_Sub3 local263 = Static351.method4929(arg4, arg3, arg5);
				if (local263 instanceof Class6_Sub3_Sub3) {
					((Class6_Sub3_Sub3) local263).aClass6_Sub3_3 = null;
					return;
				}
				Static304.method4195(arg4, arg3, arg5);
			} else if (arg2 == 2) {
				@Pc(158) Class6_Sub2 local158 = Static134.method1950(arg4, arg3, arg5, ou.class);
				if (local158 instanceof Class6_Sub2_Sub2 && local158.aShort82 == arg3 && local158.aShort85 == arg5) {
					((Class6_Sub2_Sub2) local158).aClass6_Sub2_1 = null;
				} else {
					Static262.method3575(arg4, arg3, arg5, ou.class);
				}
				if (local73.anInt2197 != 0 && super.anInt6630 > arg3 + local73.anInt2169 && super.anInt6620 > local73.anInt2169 + arg5 && super.anInt6630 > arg3 + local73.anInt2198 && super.anInt6620 > local73.anInt2198 + arg5) {
					arg0.method5799(arg5, arg3, local81, local73.anInt2198, local73.aBoolean166, !local73.aBoolean171, local73.anInt2169);
					return;
				}
			} else {
				if (arg2 == 3) {
					@Pc(122) Class6_Sub4 local122 = Static40.method729(arg4, arg3, arg5);
					if (local122 instanceof Class6_Sub4_Sub3) {
						((Class6_Sub4_Sub3) local122).aClass6_Sub4_2 = null;
					} else {
						Static33.method628(arg4, arg3, arg5);
					}
					if (local73.anInt2197 == 1) {
						arg0.method5803(arg5, arg3);
						return;
					}
				}
				return;
			}
			return;
		}
		@Pc(281) Class6_Sub1 local281 = Static138.method1998(arg4, arg3, arg5);
		if (local281 instanceof Class6_Sub1_Sub3) {
			((Class6_Sub1_Sub3) local281).aClass6_Sub1_3 = null;
		} else {
			Static310.method4277(arg4, arg3, arg5);
		}
		if (local73.anInt2197 != 0) {
			arg0.method5805(arg5, local73.aBoolean166, local77, arg3, local81, !local73.aBoolean171);
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!qa;I[IIIIIIIILclient!tl;)V")
	public void method5158(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) Class4_Sub30 arg9) {
		if (super.aBoolean442) {
			return;
		}
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(24) Class31 local24 = null;
		@Pc(30) int local30 = (arg3 & 0x7) * 8;
		@Pc(36) int local36 = (arg7 & 0x7) * 8;
		while (true) {
			@Pc(41) int local41;
			@Pc(119) int local119;
			@Pc(155) int local155;
			@Pc(419) int local419;
			while (arg9.anInt6244 < arg9.aByteArray79.length) {
				local41 = arg9.method4864();
				if (local41 == 0) {
					local24 = new Class31(arg9);
				} else {
					@Pc(170) int local170;
					@Pc(174) int local174;
					@Pc(216) int local216;
					@Pc(290) int local290;
					if (local41 == 1) {
						local119 = arg9.method4864();
						if (local119 > 0) {
							for (local419 = 0; local419 < local119; local419++) {
								@Pc(428) Class169 local428 = new Class169(arg0, arg9, 0);
								if (local428.anInt4889 == 31) {
									@Pc(439) Class172 local439 = Static419.aClass81_1.method1850(arg9.method4877());
									local428.method3730(local439.anInt5192, local439.anInt5186, local439.anInt5193, local439.anInt5194);
								}
								if (arg0.method4657() > 0) {
									@Pc(456) Class4_Sub8 local456 = local428.aClass4_Sub8_1;
									local290 = local456.method5676() >> 7;
									local170 = local456.method5682() >> 7;
									if (local428.anInt4885 == arg1 && local290 >= local30 && local30 + 8 > local290 && local170 >= local36 && local36 + 8 > local170) {
										local174 = (arg4 << 7) + Static62.method1209(local456.method5676() & 0x3FF, arg8, local456.method5682() & 0x3FF);
										local216 = Static296.method4101(local456.method5682() & 0x3FF, local456.method5676() & 0x3FF, arg8) + (arg5 << 7);
										local290 = local174 >> 7;
										local170 = local216 >> 7;
										if (local290 >= 0 && local170 >= 0 && local290 < super.anInt6630 && local170 < super.anInt6620) {
											local456.method5680(local174, local216, super.anIntArrayArrayArray15[arg1][local290][local170] - local456.method5674());
											if (arg0.method4657() > 0) {
												Static104.method1656(local428);
											}
										}
									}
								}
							}
						}
					} else if (local41 == 2) {
						if (local24 == null) {
							local24 = new Class31();
						}
						local24.method980(arg9);
					} else if (local41 != 128) {
						if (local41 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray16 == null) {
							super.aByteArrayArrayArray16 = new byte[4][][];
						}
						for (local119 = 0; local119 < 4; local119++) {
							@Pc(125) byte local125 = arg9.method4865();
							@Pc(159) int local159;
							if (local125 == 0 && super.aByteArrayArrayArray16[arg6] != null) {
								if (local119 <= arg1) {
									local155 = arg4;
									local159 = arg4 + 7;
									local290 = arg5;
									if (arg4 < 0) {
										local155 = 0;
									} else if (super.anInt6630 <= arg4) {
										local155 = super.anInt6630;
									}
									if (local159 < 0) {
										local159 = 0;
									} else if (local159 >= super.anInt6630) {
										local159 = super.anInt6630;
									}
									if (arg5 < 0) {
										local290 = 0;
									} else if (super.anInt6620 <= arg5) {
										local290 = super.anInt6620;
									}
									local170 = arg5 + 7;
									if (local170 < 0) {
										local170 = 0;
									} else if (super.anInt6620 <= local170) {
										local170 = super.anInt6620;
									}
									while (local159 > local155) {
										while (local290 < local170) {
											super.aByteArrayArrayArray16[arg6][local155][local290] = 0;
											local290++;
										}
										local155++;
									}
								}
							} else if (local125 == 1) {
								if (super.aByteArrayArrayArray16[arg6] == null) {
									super.aByteArrayArrayArray16[arg6] = new byte[super.anInt6630 + 1][super.anInt6620 + 1];
								}
								for (local155 = 0; local155 < 64; local155 += 4) {
									for (local159 = 0; local159 < 64; local159 += 4) {
										@Pc(165) byte local165 = arg9.method4865();
										if (arg1 >= local119) {
											for (local170 = local155; local170 < local155 + 4; local170++) {
												for (local174 = local159; local174 < local159 + 4; local174++) {
													if (local30 <= local170 && local30 + 8 > local170 && local174 >= local36 && local36 < local36 + 8) {
														local216 = Static236.method3283(local174 & 0x7, local170 & 0x7, arg8) + arg4;
														@Pc(228) int local228 = Static333.method4505(arg8, local174 & 0x7, local170 & 0x7) + arg5;
														if (local216 >= 0 && super.anInt6630 > local216 && local228 >= 0 && super.anInt6620 > local228) {
															super.aByteArrayArrayArray16[arg6][local216][local228] = local165;
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
						arg9.anInt6244 += 10;
					} else {
						arg2[0] = arg9.method4877();
						arg2[1] = arg9.method4889();
						arg2[2] = arg9.method4889();
						arg2[3] = arg9.method4889();
						arg2[4] = arg9.method4877();
					}
				}
			}
			if (local24 != null) {
				Static425.method5497(local24, arg4 >> 3, arg5 >> 3);
			}
			if (super.aByteArrayArrayArray16 != null && super.aByteArrayArrayArray16[arg6] != null) {
				local41 = arg4 + 7;
				local119 = arg5 + 7;
				for (local419 = arg4; local419 < local41; local419++) {
					for (local155 = arg5; local155 < local119; local155++) {
						super.aByteArrayArrayArray16[arg6][local419][local155] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IILclient!qa;[Lclient!wq;[BI)V")
	public void method5159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class30 arg2, @OriginalArg(3) Class268[] arg3, @OriginalArg(4) byte[] arg4) {
		@Pc(14) Class4_Sub30 local14 = new Class4_Sub30(arg4);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method4827();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local14.method4844();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local14.method4864();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = local53 + arg0;
				@Pc(77) int local77 = local47 + arg1;
				if (local73 > 0 && local77 > 0 && super.anInt6630 - 1 > local73 && local77 < super.anInt6620 - 1) {
					@Pc(98) Class268 local98 = null;
					if (!super.aBoolean442) {
						@Pc(103) int local103 = local57;
						if ((Static327.aByteArrayArrayArray11[1][local73][local77] & 0x2) == 2) {
							local103 = local57 - 1;
						}
						if (local103 >= 0) {
							local98 = arg3[local103];
						}
					}
					this.method5165(arg2, local57, local73, local57, local69, local65, local77, local16, local98, -1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(I[ILclient!qa;IILclient!tl;)V")
	public void method5162(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class4_Sub30 arg4) {
		if (super.aBoolean442) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class31 local13 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(24) int local24;
						@Pc(97) int local97;
						@Pc(485) int local485;
						@Pc(112) int local112;
						@Pc(116) int local116;
						while (arg4.anInt6244 < arg4.aByteArray79.length) {
							local24 = arg4.method4864();
							if (local24 == 0) {
								local13 = new Class31(arg4);
							} else {
								@Pc(118) int local118;
								@Pc(152) int local152;
								@Pc(255) int local255;
								if (local24 == 1) {
									local97 = arg4.method4864();
									if (local97 > 0) {
										for (local485 = 0; local485 < local97; local485++) {
											@Pc(494) Class169 local494 = new Class169(arg1, arg4, 0);
											if (local494.anInt4889 == 31) {
												@Pc(507) Class172 local507 = Static419.aClass81_1.method1850(arg4.method4877());
												local494.method3730(local507.anInt5192, local507.anInt5186, local507.anInt5193, local507.anInt5194);
											}
											if (arg1.method4657() > 0) {
												@Pc(524) Class4_Sub8 local524 = local494.aClass4_Sub8_1;
												local118 = (arg2 << 7) + local524.method5676();
												local152 = local524.method5682() + (arg3 << 7);
												local255 = local118 >> 7;
												@Pc(553) int local553 = local152 >> 7;
												if (local255 >= 0 && local553 >= 0 && super.anInt6630 > local255 && local553 < super.anInt6620) {
													local524.method5680(local118, local152, super.anIntArrayArrayArray15[local494.anInt4885][local255][local553] - local524.method5674());
													if (arg1.method4657() > 0) {
														Static104.method1656(local494);
													}
												}
											}
										}
									}
								} else if (local24 == 2) {
									if (local13 == null) {
										local13 = new Class31();
									}
									local13.method980(arg4);
								} else if (local24 != 128) {
									if (local24 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray16 == null) {
										super.aByteArrayArrayArray16 = new byte[4][][];
									}
									local11 = true;
									for (local97 = 0; local97 < 4; local97++) {
										@Pc(103) byte local103 = arg4.method4865();
										if (local103 == 0 && super.aByteArrayArrayArray16[local97] != null) {
											local112 = arg2;
											local116 = arg2 + 64;
											local118 = arg3;
											if (arg2 < 0) {
												local112 = 0;
											} else if (arg2 >= super.anInt6630) {
												local112 = super.anInt6630;
											}
											if (arg3 < 0) {
												local118 = 0;
											} else if (super.anInt6620 <= arg3) {
												local118 = super.anInt6620;
											}
											local152 = arg3 + 64;
											if (local116 < 0) {
												local116 = 0;
											} else if (super.anInt6630 <= local116) {
												local116 = super.anInt6630;
											}
											if (local152 < 0) {
												local152 = 0;
											} else if (local152 >= super.anInt6620) {
												local152 = super.anInt6620;
											}
											while (local116 > local112) {
												while (local152 > local118) {
													super.aByteArrayArrayArray16[local97][local112][local118] = 0;
													local118++;
												}
												local112++;
											}
										} else if (local103 == 1) {
											if (super.aByteArrayArrayArray16[local97] == null) {
												super.aByteArrayArrayArray16[local97] = new byte[super.anInt6630 + 1][super.anInt6620 + 1];
											}
											for (local112 = 0; local112 < 64; local112 += 4) {
												for (local116 = 0; local116 < 64; local116 += 4) {
													@Pc(245) byte local245 = arg4.method4865();
													for (local152 = arg2 + local112; local152 < arg2 + local112 + 4; local152++) {
														for (local255 = arg3 + local116; local255 < local116 + arg3 + 4; local255++) {
															if (local152 >= 0 && local152 < super.anInt6630 && local255 >= 0 && local255 < super.anInt6620) {
																super.aByteArrayArrayArray16[local97][local152][local255] = local245;
															}
														}
													}
												}
											}
										} else if (local103 == 2) {
											if (super.aByteArrayArrayArray16[local97] == null) {
												super.aByteArrayArrayArray16[local97] = new byte[super.anInt6630 + 1][super.anInt6620 + 1];
											}
											if (local97 > 0) {
												local112 = arg2;
												local116 = arg2 + 64;
												local118 = arg3;
												if (arg3 < 0) {
													local118 = 0;
												} else if (arg3 >= super.anInt6620) {
													local118 = super.anInt6620;
												}
												if (local116 < 0) {
													local116 = 0;
												} else if (super.anInt6630 <= local116) {
													local116 = super.anInt6630;
												}
												local152 = arg3 + 64;
												if (arg2 < 0) {
													local112 = 0;
												} else if (super.anInt6630 <= arg2) {
													local112 = super.anInt6630;
												}
												if (local152 < 0) {
													local152 = 0;
												} else if (super.anInt6620 <= local152) {
													local152 = super.anInt6620;
												}
												while (local116 > local112) {
													while (local118 < local152) {
														super.aByteArrayArrayArray16[local97][local112][local118] = super.aByteArrayArrayArray16[local97 - 1][local112][local118];
														local118++;
													}
													local112++;
												}
											}
										}
									}
								} else if (arg0 == null) {
									arg4.anInt6244 += 10;
								} else {
									arg0[0] = arg4.method4877();
									arg0[1] = arg4.method4889();
									arg0[2] = arg4.method4889();
									arg0[3] = arg4.method4889();
									arg0[4] = arg4.method4877();
								}
							}
						}
						if (local13 != null) {
							for (local24 = 0; local24 < 8; local24++) {
								for (local97 = 0; local97 < 8; local97++) {
									local485 = (arg2 >> 3) + local24;
									local112 = local97 + (arg3 >> 3);
									if (local485 >= 0 && local485 < super.anInt6630 >> 3 && local112 >= 0 && super.anInt6620 >> 3 > local112) {
										Static425.method5497(local13, local485, local112);
									}
								}
							}
						}
						if (!local11 && super.aByteArrayArrayArray16 != null) {
							for (local24 = 0; local24 < 4; local24++) {
								if (super.aByteArrayArrayArray16[local24] != null) {
									for (local97 = 0; local97 < 16; local97++) {
										for (local485 = 0; local485 < 16; local485++) {
											local112 = (arg2 >> 2) + local97;
											local116 = local485 + (arg3 >> 2);
											if (local112 >= 0 && local112 < 26 && local116 >= 0 && local116 < 26) {
												super.aByteArrayArrayArray16[local24][local112][local116] = 0;
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

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "([Lclient!wq;[BIIIIIIIILclient!qa;)V")
	public void method5164(@OriginalArg(0) Class268[] arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class30 arg9) {
		@Pc(10) Class4_Sub30 local10 = new Class4_Sub30(arg1);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method4827();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(24) int local24 = 0;
			while (true) {
				@Pc(28) int local28 = local10.method4844();
				if (local28 == 0) {
					break;
				}
				local24 += local28 - 1;
				@Pc(43) int local43 = local24 & 0x3F;
				@Pc(49) int local49 = local24 >> 6 & 0x3F;
				@Pc(53) int local53 = local24 >> 12;
				@Pc(57) int local57 = local10.method4864();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (arg4 == local53 && local49 >= arg7 && local49 < arg7 + 8 && local43 >= arg5 && arg5 + 8 > local43) {
					@Pc(89) Class71 local89 = Static2.aClass74_13.method1683(local12);
					@Pc(107) int local107 = arg6 + Static138.method2001(local89.anInt2198, local65, arg3, local89.anInt2169, local49 & 0x7, local43 & 0x7);
					@Pc(125) int local125 = arg2 + Static178.method2597(local89.anInt2198, local49 & 0x7, local65, local43 & 0x7, local89.anInt2169, arg3);
					if (local107 > 0 && local125 > 0 && super.anInt6630 - 1 > local107 && super.anInt6620 - 1 > local125) {
						@Pc(146) Class268 local146 = null;
						if (!super.aBoolean442) {
							@Pc(151) int local151 = arg8;
							if ((Static327.aByteArrayArrayArray11[1][local107][local125] & 0x2) == 2) {
								local151 = arg8 - 1;
							}
							if (local151 >= 0) {
								local146 = arg0[local151];
							}
						}
						this.method5165(arg9, arg8, local107, arg8, local65 + arg3 & 0x3, local61, local125, local12, local146, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lclient!qa;IIIBIIIILclient!wq;I)V")
	public void method5165(@OriginalArg(0) Class30 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class268 arg8, @OriginalArg(10) int arg9) {
		if (!Static126.aClass67_Sub1_1.method4531(Static286.anInt5207) && !Static123.method5297(arg3, Static107.anInt2257, arg2, arg6)) {
			return;
		}
		if (arg1 < this.anInt6644) {
			this.anInt6644 = arg1;
		}
		@Pc(34) Class71 local34 = Static2.aClass74_13.method1683(arg7);
		if (arg0.method4660() && Static126.aClass67_Sub1_1.aBoolean396 && local34.aBoolean160) {
			return;
		}
		@Pc(57) int local57;
		@Pc(60) int local60;
		if (arg4 == 1 || arg4 == 3) {
			local57 = local34.anInt2198;
			local60 = local34.anInt2169;
		} else {
			local57 = local34.anInt2169;
			local60 = local34.anInt2198;
		}
		@Pc(80) int local80;
		@Pc(78) int local78;
		if (super.anInt6630 < arg2 + local57) {
			local78 = arg2 + 1;
			local80 = arg2;
		} else {
			local80 = (local57 >> 1) + arg2;
			local78 = (local57 + 1 >> 1) + arg2;
		}
		@Pc(122) int local122;
		@Pc(115) int local115;
		if (local60 + arg6 <= super.anInt6620) {
			local115 = (local60 + 1 >> 1) + arg6;
			local122 = arg6 + (local60 >> 1);
		} else {
			local122 = arg6;
			local115 = arg6 + 1;
		}
		@Pc(134) Class146 local134 = Static346.aClass146Array2[arg3];
		@Pc(158) int local158 = local134.I(local80, local122) + local134.I(local78, local122) + local134.I(local80, local115) + local134.I(local78, local115) >> 2;
		@Pc(166) int local166 = (arg2 << 7) + (local57 << 6);
		@Pc(174) int local174 = (local60 << 6) + (arg6 << 7);
		@Pc(186) boolean local186 = Static289.aBoolean358 && !super.aBoolean442 && local34.aBoolean165;
		if (local34.method1631()) {
			Static242.method4046(null, arg2, arg6, local34, arg4, null, arg1);
		}
		@Pc(220) boolean local220 = arg9 == -1 && local34.anInt2173 == -1 && local34.anIntArray140 == null && local34.anIntArray138 == null && !local34.aBoolean169;
		if (Static81.aBoolean126 && (Static222.method3110(arg5) && local34.anInt2175 != 1 || !(!Static76.method1367(arg5) || local34.anInt2175 != 0))) {
			return;
		}
		if (arg5 != 22) {
			@Pc(382) Class6_Sub2 local382;
			@Pc(350) Class6_Sub2_Sub3 local350;
			@Pc(354) int local354;
			if (arg5 == 10 || arg5 == 11) {
				local350 = null;
				if (local220) {
					@Pc(413) Class6_Sub2_Sub3 local413 = new Class6_Sub2_Sub3(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg2, arg2 + local57 - 1, arg6, local60 + arg6 - 1, arg5, arg4, local186);
					local350 = local413;
					local382 = local413;
					local354 = local413.method1207();
				} else {
					local354 = 15;
					local382 = new Class6_Sub2_Sub5(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg2, local57 + arg2 - 1, arg6, arg6 + local60 - 1, arg5, arg4, arg9);
				}
				@Pc(434) Class6_Sub2 local434 = Static134.method1950(arg1, arg2, arg6, ou.class);
				@Pc(436) boolean local436 = false;
				if (local434 instanceof Class6_Sub2_Sub2 && local434.aShort82 == arg2 && local434.aShort85 == arg6) {
					local436 = true;
					((Class6_Sub2_Sub2) local434).aClass6_Sub2_1 = local382;
				}
				if (local436 || Static235.method3268(local382, false)) {
					if (local350 != null && local350.method5645()) {
						local350.method5643(arg0);
					}
					if (local34.aBoolean170 && Static289.aBoolean358) {
						if (local354 > 30) {
							local354 = 30;
						}
						for (@Pc(489) int local489 = 0; local489 <= local57; local489++) {
							for (@Pc(493) int local493 = 0; local493 <= local60; local493++) {
								local134.QA(local489 + arg2, local493 + arg6, local354);
							}
						}
					}
				}
				if (local34.anInt2197 != 0 && arg8 != null) {
					arg8.method5808(arg6, !local34.aBoolean171, local34.aBoolean166, local57, arg2, local60);
				}
			} else {
				@Pc(641) Class6_Sub2 local641;
				if (arg5 >= 12 && arg5 <= 17 || arg5 >= 18 && arg5 <= 21) {
					if (local220) {
						local350 = new Class6_Sub2_Sub3(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg2, local57 + arg2 - 1, arg6, local60 + arg6 - 1, arg5, arg4, local186);
						if (local350.method5645()) {
							local350.method5643(arg0);
						}
						local382 = local350;
					} else {
						local382 = new Class6_Sub2_Sub5(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg2, local57 + arg2 - 1, arg6, local60 + arg6 - 1, arg5, arg4, arg9);
					}
					local641 = Static134.method1950(arg1, arg2, arg6, ou.class);
					if (local641 instanceof Class6_Sub2_Sub2 && local641.aShort82 == arg2 && arg6 == local641.aShort85) {
						((Class6_Sub2_Sub2) local641).aClass6_Sub2_1 = local382;
					} else {
						Static235.method3268(local382, false);
					}
					if (Static289.aBoolean358 && !super.aBoolean442 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg1 > 0 && local34.anInt2175 != 0) {
						super.aByteArrayArrayArray17[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray17[arg1][arg2][arg6] | 0x4);
					}
					if (local34.anInt2197 != 0 && arg8 != null) {
						arg8.method5808(arg6, !local34.aBoolean171, local34.aBoolean166, local57, arg2, local60);
					}
				} else {
					@Pc(769) Class6_Sub1 local769;
					if (arg5 == 0) {
						@Pc(733) int local733 = local34.anInt2175;
						if (Static286.aBoolean356 && local34.anInt2175 == -1) {
							local733 = 1;
						}
						if (local220) {
							@Pc(759) Class6_Sub1_Sub2 local759 = new Class6_Sub1_Sub2(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, arg5, arg4, local186);
							if (local759.method5645()) {
								local759.method5643(arg0);
							}
							local769 = local759;
						} else {
							local769 = new Class6_Sub1_Sub1(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg5, arg4, arg9);
						}
						@Pc(792) Class6_Sub1 local792 = Static138.method1998(arg1, arg2, arg6);
						if (local792 instanceof Class6_Sub1_Sub3) {
							((Class6_Sub1_Sub3) local792).aClass6_Sub1_3 = local769;
						} else {
							Static206.method2947(arg1, arg2, arg6, local769, null);
						}
						if (Static289.aBoolean358) {
							if (arg4 == 0) {
								if (local34.aBoolean170) {
									local134.QA(arg2, arg6, 50);
									local134.QA(arg2, arg6 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean442) {
									super.aByteArrayArrayArray17[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray17[arg1][arg2][arg6] | 0x1);
								}
							} else if (arg4 == 1) {
								if (local34.aBoolean170) {
									local134.QA(arg2, arg6 + 1, 50);
									local134.QA(arg2 + 1, arg6 - -1, 50);
								}
								if (local733 == 1 && !super.aBoolean442) {
									super.aByteArrayArrayArray17[arg1][arg2][arg6 + 1] = (byte) (super.aByteArrayArrayArray17[arg1][arg2][arg6 + 1] | 0x2);
								}
							} else if (arg4 == 2) {
								if (local34.aBoolean170) {
									local134.QA(arg2 + 1, arg6, 50);
									local134.QA(arg2 + 1, arg6 - -1, 50);
								}
								if (local733 == 1 && !super.aBoolean442) {
									super.aByteArrayArrayArray17[arg1][arg2 + 1][arg6] = (byte) (super.aByteArrayArrayArray17[arg1][arg2 + 1][arg6] | 0x1);
								}
							} else if (arg4 == 3) {
								if (local34.aBoolean170) {
									local134.QA(arg2, arg6, 50);
									local134.QA(arg2 + 1, arg6, 50);
								}
								if (local733 == 1 && !super.aBoolean442) {
									super.aByteArrayArrayArray17[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray17[arg1][arg2][arg6] | 0x2);
								}
							}
						}
						if (local34.anInt2197 != 0 && arg8 != null) {
							arg8.method5809(arg4, arg2, local34.aBoolean166, arg5, !local34.aBoolean171, arg6);
						}
						if (local34.anInt2199 != 16) {
							Static205.method2943(arg1, arg2, arg6, local34.anInt2199);
						}
					} else {
						@Pc(1077) Class6_Sub1_Sub2 local1077;
						@Pc(1060) Class6_Sub1 local1060;
						if (arg5 == 1) {
							if (local220) {
								local1077 = new Class6_Sub1_Sub2(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, arg5, arg4, local186);
								local1060 = local1077;
								if (local1077.method5645()) {
									local1077.method5643(arg0);
								}
							} else {
								local1060 = new Class6_Sub1_Sub1(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg5, arg4, arg9);
							}
							local769 = Static138.method1998(arg1, arg2, arg6);
							if (local769 instanceof Class6_Sub1_Sub3) {
								((Class6_Sub1_Sub3) local769).aClass6_Sub1_3 = local1060;
							} else {
								Static206.method2947(arg1, arg2, arg6, local1060, null);
							}
							if (local34.aBoolean170 && Static289.aBoolean358) {
								if (arg4 == 0) {
									local134.QA(arg2, arg6 + 1, 50);
								} else if (arg4 == 1) {
									local134.QA(arg2 + 1, arg6 + 1, 50);
								} else if (arg4 == 2) {
									local134.QA(arg2 + 1, arg6, 50);
								} else if (arg4 == 3) {
									local134.QA(arg2, arg6, 50);
								}
							}
							if (local34.anInt2197 != 0 && arg8 != null) {
								arg8.method5809(arg4, arg2, local34.aBoolean166, arg5, !local34.aBoolean171, arg6);
							}
						} else if (arg5 == 2) {
							local354 = arg4 + 1 & 0x3;
							if (local220) {
								@Pc(1220) Class6_Sub1_Sub2 local1220 = new Class6_Sub1_Sub2(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, arg5, arg4 + 4, local186);
								@Pc(1235) Class6_Sub1_Sub2 local1235 = new Class6_Sub1_Sub2(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, arg5, local354, local186);
								if (local1220.method5645()) {
									local1220.method5643(arg0);
								}
								local769 = local1235;
								local1060 = local1220;
								if (local1235.method5645()) {
									local1235.method5643(arg0);
								}
							} else {
								local1060 = new Class6_Sub1_Sub1(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg5, arg4 + 4, arg9);
								local769 = new Class6_Sub1_Sub1(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg5, local354, arg9);
							}
							Static206.method2947(arg1, arg2, arg6, local1060, local769);
							if (local34.anInt2175 == 1 && Static289.aBoolean358 && !super.aBoolean442) {
								if (arg4 == 0) {
									super.aByteArrayArrayArray17[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray17[arg1][arg2][arg6] | 0x1);
									super.aByteArrayArrayArray17[arg1][arg2][arg6 + 1] = (byte) (super.aByteArrayArrayArray17[arg1][arg2][arg6 + 1] | 0x2);
								} else if (arg4 == 1) {
									super.aByteArrayArrayArray17[arg1][arg2][arg6 + 1] = (byte) (super.aByteArrayArrayArray17[arg1][arg2][arg6 + 1] | 0x2);
									super.aByteArrayArrayArray17[arg1][arg2 + 1][arg6] = (byte) (super.aByteArrayArrayArray17[arg1][arg2 + 1][arg6] | 0x1);
								} else if (arg4 == 2) {
									super.aByteArrayArrayArray17[arg1][arg2 + 1][arg6] = (byte) (super.aByteArrayArrayArray17[arg1][arg2 + 1][arg6] | 0x1);
									super.aByteArrayArrayArray17[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray17[arg1][arg2][arg6] | 0x2);
								} else if (arg4 == 3) {
									super.aByteArrayArrayArray17[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray17[arg1][arg2][arg6] | 0x2);
									super.aByteArrayArrayArray17[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray17[arg1][arg2][arg6] | 0x1);
								}
							}
							if (local34.anInt2197 != 0 && arg8 != null) {
								arg8.method5809(arg4, arg2, local34.aBoolean166, arg5, !local34.aBoolean171, arg6);
							}
							if (local34.anInt2199 != 16) {
								Static205.method2943(arg1, arg2, arg6, local34.anInt2199);
							}
						} else if (arg5 == 3) {
							if (local220) {
								local1077 = new Class6_Sub1_Sub2(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, arg5, arg4, local186);
								local1060 = local1077;
								if (local1077.method5645()) {
									local1077.method5643(arg0);
								}
							} else {
								local1060 = new Class6_Sub1_Sub1(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg5, arg4, arg9);
							}
							local769 = Static138.method1998(arg1, arg2, arg6);
							if (local769 instanceof Class6_Sub1_Sub3) {
								((Class6_Sub1_Sub3) local769).aClass6_Sub1_3 = local1060;
							} else {
								Static206.method2947(arg1, arg2, arg6, local1060, null);
							}
							if (local34.aBoolean170 && Static289.aBoolean358) {
								if (arg4 == 0) {
									local134.QA(arg2, arg6 + 1, 50);
								} else if (arg4 == 1) {
									local134.QA(arg2 + 1, arg6 + 1, 50);
								} else if (arg4 == 2) {
									local134.QA(arg2 + 1, arg6, 50);
								} else if (arg4 == 3) {
									local134.QA(arg2, arg6, 50);
								}
							}
							if (local34.anInt2197 != 0 && arg8 != null) {
								arg8.method5809(arg4, arg2, local34.aBoolean166, arg5, !local34.aBoolean171, arg6);
							}
						} else if (arg5 == 9) {
							if (local220) {
								local350 = new Class6_Sub2_Sub3(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg2, arg2, arg6, arg6, arg5, arg4, local186);
								if (local350.method5645()) {
									local350.method5643(arg0);
								}
								local382 = local350;
							} else {
								local382 = new Class6_Sub2_Sub5(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg2, local57 + arg2 - 1, arg6, arg6 + local60 - 1, arg5, arg4, arg9);
							}
							local641 = Static134.method1950(arg1, arg2, arg6, ou.class);
							if (local641 instanceof Class6_Sub2_Sub2 && local641.aShort82 == arg2 && arg6 == local641.aShort85) {
								((Class6_Sub2_Sub2) local641).aClass6_Sub2_1 = local382;
							} else {
								Static235.method3268(local382, false);
							}
							if (local34.anInt2197 != 0 && arg8 != null) {
								arg8.method5808(arg6, !local34.aBoolean171, local34.aBoolean166, local57, arg2, local60);
							}
							if (local34.anInt2199 != 16) {
								Static205.method2943(arg1, arg2, arg6, local34.anInt2199);
							}
						} else {
							@Pc(1856) Class6_Sub3 local1856;
							if (arg5 == 4) {
								if (local220) {
									@Pc(1846) Class6_Sub3_Sub1 local1846 = new Class6_Sub3_Sub1(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, 0, 0, 0, arg5, arg4);
									if (local1846.method5645()) {
										local1846.method5643(arg0);
									}
									local1856 = local1846;
								} else {
									local1856 = new Class6_Sub3_Sub2(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, 0, 0, 0, arg5, arg4, arg9);
								}
								@Pc(1882) Class6_Sub3 local1882 = Static351.method4929(arg1, arg2, arg6);
								if (local1882 instanceof Class6_Sub3_Sub3) {
									((Class6_Sub3_Sub3) local1882).aClass6_Sub3_3 = local1856;
								} else {
									Static441.method3961(arg1, arg2, arg6, local1856, null);
								}
							} else {
								@Pc(1904) int local1904;
								@Pc(1910) Interface11 local1910;
								@Pc(1978) Class6_Sub3_Sub1 local1978;
								@Pc(1993) Class6_Sub3 local1993;
								if (arg5 == 5) {
									local1904 = 17;
									local1910 = (Interface11) Static138.method1998(arg1, arg2, arg6);
									if (local1910 != null) {
										local1904 = Static2.aClass74_13.method1683(local1910.method5648()).anInt2199 + 1;
									}
									if (local220) {
										local1978 = new Class6_Sub3_Sub1(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, 0, Static352.anIntArray557[arg4] * local1904, local1904 * Static313.anIntArray483[arg4], arg5, arg4);
										local1856 = local1978;
										if (local1978.method5645()) {
											local1978.method5643(arg0);
										}
									} else {
										local1856 = new Class6_Sub3_Sub2(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, 0, local1904 * Static352.anIntArray557[arg4], local1904 * Static313.anIntArray483[arg4], arg5, arg4, arg9);
									}
									local1993 = Static351.method4929(arg1, arg2, arg6);
									if (local1993 instanceof Class6_Sub3_Sub3) {
										((Class6_Sub3_Sub3) local1993).aClass6_Sub3_3 = local1856;
									} else {
										Static441.method3961(arg1, arg2, arg6, local1856, null);
									}
								} else if (arg5 == 6) {
									local1904 = 9;
									local1910 = (Interface11) Static138.method1998(arg1, arg2, arg6);
									if (local1910 != null) {
										local1904 = Static2.aClass74_13.method1683(local1910.method5648()).anInt2199 / 2 + 1;
									}
									if (local220) {
										local1978 = new Class6_Sub3_Sub1(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, arg4, local1904 * Static352.anIntArray557[arg4], Static313.anIntArray483[arg4] * local1904, arg5, arg4 + 4);
										if (local1978.method5645()) {
											local1978.method5643(arg0);
										}
										local1856 = local1978;
									} else {
										local1856 = new Class6_Sub3_Sub2(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg4, local1904 * Static149.anIntArray237[arg4], Static401.anIntArray608[arg4] * local1904, arg5, arg4 + 4, arg9);
									}
									local1993 = Static351.method4929(arg1, arg2, arg6);
									if (local1993 instanceof Class6_Sub3_Sub3) {
										((Class6_Sub3_Sub3) local1993).aClass6_Sub3_3 = local1856;
									} else {
										Static441.method3961(arg1, arg2, arg6, local1856, null);
									}
								} else if (arg5 == 7) {
									local1904 = arg4 + 2 & 0x3;
									if (local220) {
										@Pc(2157) Class6_Sub3_Sub1 local2157 = new Class6_Sub3_Sub1(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, local1904, 0, 0, arg5, local1904 + 4);
										local1856 = local2157;
										if (local2157.method5645()) {
											local2157.method5643(arg0);
										}
									} else {
										local1856 = new Class6_Sub3_Sub2(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, local1904, 0, 0, arg5, local1904 + 4, arg9);
									}
									@Pc(2195) Class6_Sub3 local2195 = Static351.method4929(arg1, arg2, arg6);
									if (local2195 instanceof Class6_Sub3_Sub3) {
										((Class6_Sub3_Sub3) local2195).aClass6_Sub3_3 = local1856;
									} else {
										Static441.method3961(arg1, arg2, arg6, local1856, null);
									}
								} else if (arg5 == 8) {
									local354 = arg4 + 2 & 0x3;
									@Pc(2221) int local2221 = 9;
									@Pc(2227) Interface11 local2227 = (Interface11) Static138.method1998(arg1, arg2, arg6);
									if (local2227 != null) {
										local2221 = Static2.aClass74_13.method1683(local2227.method5648()).anInt2199 / 2 + 1;
									}
									@Pc(2270) Class6_Sub3 local2270;
									@Pc(2289) Class6_Sub3 local2289;
									if (local220) {
										local2270 = new Class6_Sub3_Sub1(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, arg4, Static149.anIntArray237[arg4] * local2221, local2221 * Static401.anIntArray608[arg4], arg5, arg4 + 4);
										local2289 = new Class6_Sub3_Sub1(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, arg4, 0, 0, arg5, local354 + 4);
										if (local2270.method5645()) {
											local2270.method5643(arg0);
										}
										if (local2289.method5645()) {
											local2289.method5643(arg0);
										}
									} else {
										local2270 = new Class6_Sub3_Sub2(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg4, Static149.anIntArray237[arg4] * local2221, local2221 * Static401.anIntArray608[arg4], arg5, arg4 + 4, arg9);
										local2289 = new Class6_Sub3_Sub2(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg4, 0, 0, arg5, local354 + 4, arg9);
									}
									Static441.method3961(arg1, arg2, arg6, local2270, local2289);
								}
							}
						}
					}
				}
			}
		} else if (Static126.aClass67_Sub1_1.aBoolean389 || local34.anInt2194 != 0 || local34.anInt2197 == 1 || local34.aBoolean164) {
			@Pc(279) Class6_Sub4 local279;
			if (local220) {
				@Pc(295) Class6_Sub4_Sub2 local295 = new Class6_Sub4_Sub2(arg0, local34, arg3, local166, local158, local174, super.aBoolean442, arg4, local186);
				local279 = local295;
				if (local295.method5645()) {
					local295.method5643(arg0);
				}
			} else {
				local279 = new Class6_Sub4_Sub1(arg0, local34, arg1, arg3, local166, local158, local174, super.aBoolean442, arg4, arg9);
			}
			@Pc(310) Class6_Sub4 local310 = Static40.method729(arg1, arg2, arg6);
			if (local310 instanceof Class6_Sub4_Sub3) {
				((Class6_Sub4_Sub3) local310).aClass6_Sub4_2 = local279;
			} else {
				Static139.method2007(arg1, arg2, arg6, local279);
			}
			if (local34.anInt2197 == 1 && arg8 != null) {
				arg8.method5814(arg2, arg6);
			}
		}
	}
}
