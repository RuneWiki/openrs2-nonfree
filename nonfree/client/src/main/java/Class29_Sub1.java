import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dv")
public final class Class29_Sub1 extends Class29 {

	@OriginalMember(owner = "client!dv", name = "L", descriptor = "I")
	public int anInt2067 = 99;

	@OriginalMember(owner = "client!dv", name = "<init>", descriptor = "(IIIZ)V")
	public Class29_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static365.aClass251_6, Static331.aClass191_5);
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!za;)V")
	public void method1548(@OriginalArg(1) Class106 arg0) {
		Static322.method4580(arg0);
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (super.anInt2050 > 1) {
			for (local11 = 0; local11 < super.anInt2055; local11++) {
				for (local14 = 0; local14 < super.anInt2062; local14++) {
					if ((Static110.aByteArrayArrayArray20[1][local11][local14] & 0x2) == 2) {
						Static276.method4086(local11, local14);
					}
				}
			}
		}
		for (local11 = 0; super.anInt2050 > local11; local11++) {
			for (local14 = 0; local14 <= super.anInt2062; local14++) {
				for (@Pc(53) int local53 = 0; super.anInt2055 >= local53; local53++) {
					@Pc(67) int local67;
					@Pc(69) int local69;
					@Pc(71) int local71;
					@Pc(112) int local112;
					@Pc(115) int local115;
					@Pc(202) int local202;
					@Pc(211) int local211;
					@Pc(231) int local231;
					@Pc(234) int local234;
					if ((super.aByteArrayArrayArray8[local11][local53][local14] & 0x1) != 0) {
						local67 = local14;
						local69 = local14;
						local71 = local11;
						while (local67 > 0 && (super.aByteArrayArrayArray8[local11][local53][local67 - 1] & 0x1) != 0) {
							local67--;
						}
						while (super.anInt2062 > local69 && (super.aByteArrayArrayArray8[local11][local53][local69 + 1] & 0x1) != 0) {
							local69++;
						}
						local112 = local11;
						label164: while (local71 > 0) {
							for (local115 = local67; local115 <= local69; local115++) {
								if ((super.aByteArrayArrayArray8[local71 - 1][local53][local115] & 0x1) == 0) {
									break label164;
								}
							}
							local71--;
						}
						label153: while (local112 < 3) {
							for (local115 = local67; local115 <= local69; local115++) {
								if ((super.aByteArrayArrayArray8[local112 + 1][local53][local115] & 0x1) == 0) {
									break label153;
								}
							}
							local112++;
						}
						local115 = (local69 + 1 - local67) * (local112 + 1 - local71);
						if (local115 >= 2) {
							local202 = super.anIntArrayArrayArray3[local112][local53][local67] - 240;
							local211 = super.anIntArrayArrayArray3[local71][local53][local67];
							Static234.method3562(1, local53 << 7, local53 << 7, local67 << 7, (local69 << 7) + 128, local202, local211);
							for (local231 = local71; local231 <= local112; local231++) {
								for (local234 = local67; local234 <= local69; local234++) {
									super.aByteArrayArrayArray8[local231][local53][local234] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray8[local11][local53][local14] & 0x2) != 0) {
						local67 = local53;
						local69 = local53;
						local71 = local11;
						while (super.anInt2055 > local69 && (super.aByteArrayArrayArray8[local11][local69 + 1][local14] & 0x2) != 0) {
							local69++;
						}
						while (local67 > 0 && (super.aByteArrayArrayArray8[local11][local67 - 1][local14] & 0x2) != 0) {
							local67--;
						}
						local112 = local11;
						label218: while (local71 > 0) {
							for (local115 = local67; local115 <= local69; local115++) {
								if ((super.aByteArrayArrayArray8[local71 - 1][local115][local14] & 0x2) == 0) {
									break label218;
								}
							}
							local71--;
						}
						label207: while (local112 < 3) {
							for (local115 = local67; local115 <= local69; local115++) {
								if ((super.aByteArrayArrayArray8[local112 + 1][local115][local14] & 0x2) == 0) {
									break label207;
								}
							}
							local112++;
						}
						local115 = (local69 + 1 - local67) * (local112 + 1 - local71);
						if (local115 >= 2) {
							local202 = super.anIntArrayArrayArray3[local112][local67][local14] - 240;
							local211 = super.anIntArrayArrayArray3[local71][local67][local14];
							Static234.method3562(2, local67 << 7, (local69 << 7) + 128, local14 << 7, local14 << 7, local202, local211);
							for (local231 = local71; local231 <= local112; local231++) {
								for (local234 = local67; local234 <= local69; local234++) {
									super.aByteArrayArrayArray8[local231][local234][local14] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray8[local11][local53][local14] & 0x4) != 0) {
						local67 = local53;
						local69 = local53;
						for (local71 = local14; local71 > 0 && (super.aByteArrayArrayArray8[local11][local53][local71 - 1] & 0x4) != 0; local71--) {
						}
						for (local112 = local14; local112 < super.anInt2062 && (super.aByteArrayArrayArray8[local11][local53][local112 + 1] & 0x4) != 0; local112++) {
						}
						label272: while (local67 > 0) {
							for (local115 = local71; local115 <= local112; local115++) {
								if ((super.aByteArrayArrayArray8[local11][local67 - 1][local115] & 0x4) == 0) {
									break label272;
								}
							}
							local67--;
						}
						label261: while (local69 < super.anInt2055) {
							for (local115 = local71; local115 <= local112; local115++) {
								if ((super.aByteArrayArrayArray8[local11][local69 + 1][local115] & 0x4) == 0) {
									break label261;
								}
							}
							local69++;
						}
						if ((local112 + 1 - local71) * (local69 + 1 - local67) >= 4) {
							local115 = super.anIntArrayArrayArray3[local11][local67][local71];
							Static234.method3562(4, local67 << 7, (local69 << 7) + 128, local71 << 7, (local112 << 7) + 128, local115, local115);
							for (@Pc(657) int local657 = local67; local657 <= local69; local657++) {
								for (local202 = local71; local202 <= local112; local202++) {
									super.aByteArrayArrayArray8[local11][local657][local202] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray8 = null;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!za;I[IILclient!ia;I)V")
	public void method1549(@OriginalArg(0) Class106 arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub3 arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean128) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) Class108 local16 = null;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(27) int local27;
						@Pc(105) int local105;
						@Pc(480) int local480;
						@Pc(152) int local152;
						@Pc(156) int local156;
						while (arg3.aByteArray14.length > arg3.anInt1710) {
							local27 = arg3.method1171();
							if (local27 == 0) {
								local16 = new Class108(arg3);
							} else {
								@Pc(158) int local158;
								@Pc(162) int local162;
								@Pc(302) int local302;
								if (local27 == 1) {
									local105 = arg3.method1171();
									if (local105 > 0) {
										for (local480 = 0; local480 < local105; local480++) {
											@Pc(488) Class75 local488 = new Class75(arg0, arg3, 0);
											if (local488.anInt2346 == 31) {
												@Pc(501) Class206 local501 = Static447.aClass270_1.method6169(arg3.method1177());
												local488.method1704(local501.anInt6067, local501.anInt6069, local501.anInt6065, local501.anInt6068);
											}
											if (arg0.method5928() > 0) {
												@Pc(518) Class1_Sub4 local518 = local488.aClass1_Sub4_2;
												local158 = (arg4 << 7) + local518.method3813();
												local162 = local518.method3809() + (arg2 << 7);
												local302 = local158 >> 7;
												@Pc(543) int local543 = local162 >> 7;
												if (local302 >= 0 && local543 >= 0 && local302 < super.anInt2055 && local543 < super.anInt2062) {
													local518.method3806(local162, super.anIntArrayArrayArray3[local488.anInt2355][local302][local543] - local518.method3810(), local158);
													Static293.method3597(local488);
												}
											}
										}
									}
								} else if (local27 == 2) {
									if (local16 == null) {
										local16 = new Class108();
									}
									local16.method2633(arg3);
								} else if (local27 != 128) {
									if (local27 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray7 == null) {
										super.aByteArrayArrayArray7 = new byte[4][][];
									}
									local14 = true;
									for (local105 = 0; local105 < 4; local105++) {
										@Pc(110) byte local110 = arg3.method1212();
										if (local110 == 0 && super.aByteArrayArrayArray7[local105] != null) {
											local152 = arg4;
											local156 = arg4 + 64;
											local158 = arg2;
											if (arg4 < 0) {
												local152 = 0;
											} else if (super.anInt2055 <= arg4) {
												local152 = super.anInt2055;
											}
											if (local156 < 0) {
												local156 = 0;
											} else if (local156 >= super.anInt2055) {
												local156 = super.anInt2055;
											}
											local162 = arg2 + 64;
											if (arg2 < 0) {
												local158 = 0;
											} else if (arg2 >= super.anInt2062) {
												local158 = super.anInt2062;
											}
											if (local162 < 0) {
												local162 = 0;
											} else if (super.anInt2062 <= local162) {
												local162 = super.anInt2062;
											}
											while (local152 < local156) {
												while (local162 > local158) {
													super.aByteArrayArrayArray7[local105][local152][local158] = 0;
													local158++;
												}
												local152++;
											}
										} else if (local110 == 1) {
											if (super.aByteArrayArrayArray7[local105] == null) {
												super.aByteArrayArrayArray7[local105] = new byte[super.anInt2055 + 1][super.anInt2062 + 1];
											}
											for (local152 = 0; local152 < 64; local152 += 4) {
												for (local156 = 0; local156 < 64; local156 += 4) {
													@Pc(292) byte local292 = arg3.method1212();
													for (local162 = local152 + arg4; local162 < local152 + arg4 + 4; local162++) {
														for (local302 = local156 + arg2; local302 < arg2 + local156 + 4; local302++) {
															if (local162 >= 0 && super.anInt2055 > local162 && local302 >= 0 && local302 < super.anInt2062) {
																super.aByteArrayArrayArray7[local105][local162][local302] = local292;
															}
														}
													}
												}
											}
										} else if (local110 == 2) {
											if (super.aByteArrayArrayArray7[local105] == null) {
												super.aByteArrayArrayArray7[local105] = new byte[super.anInt2055 + 1][super.anInt2062 + 1];
											}
											if (local105 > 0) {
												local152 = arg4;
												local156 = arg4 + 64;
												local158 = arg2;
												local162 = arg2 + 64;
												if (arg2 < 0) {
													local158 = 0;
												} else if (super.anInt2062 <= arg2) {
													local158 = super.anInt2062;
												}
												if (local156 < 0) {
													local156 = 0;
												} else if (super.anInt2055 <= local156) {
													local156 = super.anInt2055;
												}
												if (arg4 < 0) {
													local152 = 0;
												} else if (arg4 >= super.anInt2055) {
													local152 = super.anInt2055;
												}
												if (local162 < 0) {
													local162 = 0;
												} else if (super.anInt2062 <= local162) {
													local162 = super.anInt2062;
												}
												while (local152 < local156) {
													while (local162 > local158) {
														super.aByteArrayArrayArray7[local105][local152][local158] = super.aByteArrayArrayArray7[local105 - 1][local152][local158];
														local158++;
													}
													local152++;
												}
											}
										}
									}
								} else if (arg1 == null) {
									arg3.anInt1710 += 10;
								} else {
									arg1[0] = arg3.method1177();
									arg1[1] = arg3.method1215();
									arg1[2] = arg3.method1215();
									arg1[3] = arg3.method1215();
									arg1[4] = arg3.method1177();
								}
							}
						}
						if (local16 != null) {
							for (local27 = 0; local27 < 8; local27++) {
								for (local105 = 0; local105 < 8; local105++) {
									local480 = local27 + (arg4 >> 3);
									local152 = (arg2 >> 3) + local105;
									if (local480 >= 0 && super.anInt2055 >> 3 > local480 && local152 >= 0 && super.anInt2062 >> 3 > local152) {
										Static251.method3738(local16, local152, local480);
									}
								}
							}
						}
						if (!local14 && super.aByteArrayArrayArray7 != null) {
							for (local27 = 0; local27 < 4; local27++) {
								if (super.aByteArrayArrayArray7[local27] != null) {
									for (local105 = 0; local105 < 16; local105++) {
										for (local480 = 0; local480 < 16; local480++) {
											local152 = local105 + (arg4 >> 2);
											local156 = local480 + (arg2 >> 2);
											if (local152 >= 0 && local152 < 26 && local156 >= 0 && local156 < 26) {
												super.aByteArrayArrayArray7[local27][local152][local156] = 0;
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

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(ILclient!za;[BII[Lclient!ir;)V")
	public void method1550(@OriginalArg(0) int arg0, @OriginalArg(1) Class106 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class120[] arg4) {
		@Pc(13) Class1_Sub3 local13 = new Class1_Sub3(arg2);
		@Pc(15) int local15 = -1;
		while (true) {
			@Pc(19) int local19 = local13.method1224();
			if (local19 == 0) {
				return;
			}
			local15 += local19;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local13.method1168();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(49) int local49 = local30 & 0x3F;
				@Pc(55) int local55 = local30 >> 6 & 0x3F;
				@Pc(59) int local59 = local30 >> 12;
				@Pc(63) int local63 = local13.method1171();
				@Pc(67) int local67 = local63 >> 2;
				@Pc(71) int local71 = local63 & 0x3;
				@Pc(76) int local76 = local55 + arg3;
				@Pc(80) int local80 = arg0 + local49;
				if (local76 > 0 && local80 > 0 && local76 < super.anInt2055 - 1 && local80 < super.anInt2062 - 1) {
					@Pc(101) Class120 local101 = null;
					if (!super.aBoolean128) {
						@Pc(106) int local106 = local59;
						if ((Static110.aByteArrayArrayArray20[1][local76][local80] & 0x2) == 2) {
							local106 = local59 - 1;
						}
						if (local106 >= 0) {
							local101 = arg4[local106];
						}
					}
					this.method1555(local59, local15, local71, -1, local67, local80, arg1, local76, local101, local59);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(III[Lclient!ir;Lclient!za;IIIII[B)V")
	public void method1552(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120[] arg3, @OriginalArg(4) Class106 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(24) Class1_Sub3 local24 = new Class1_Sub3(arg9);
		@Pc(26) int local26 = -1;
		while (true) {
			@Pc(30) int local30 = local24.method1224();
			if (local30 == 0) {
				return;
			}
			local26 += local30;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(42) int local42 = local24.method1168();
				if (local42 == 0) {
					break;
				}
				local38 += local42 - 1;
				@Pc(54) int local54 = local38 & 0x3F;
				@Pc(60) int local60 = local38 >> 6 & 0x3F;
				@Pc(64) int local64 = local38 >> 12;
				@Pc(68) int local68 = local24.method1171();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				if (local64 == arg1 && local60 >= arg0 && local60 < arg0 + 8 && arg8 <= local54 && local54 < arg8 + 8) {
					@Pc(112) Class192 local112 = Static455.aClass161_4.method3628(local26);
					@Pc(129) int local129 = Static277.method4098(arg7, local112.anInt5661, local60 & 0x7, local76, local54 & 0x7, local112.anInt5679) + arg5;
					@Pc(146) int local146 = Static349.method4945(local112.anInt5679, local76, local112.anInt5661, local60 & 0x7, arg7, local54 & 0x7) + arg6;
					if (local129 > 0 && local146 > 0 && local129 < super.anInt2055 - 1 && super.anInt2062 - 1 > local146) {
						@Pc(167) Class120 local167 = null;
						if (!super.aBoolean128) {
							@Pc(172) int local172 = arg2;
							if ((Static110.aByteArrayArrayArray20[1][local129][local146] & 0x2) == 2) {
								local172 = arg2 - 1;
							}
							if (local172 >= 0) {
								local167 = arg3[local172];
							}
						}
						this.method1555(arg2, local26, arg7 + local76 & 0x3, -1, local72, local146, arg4, local129, local167, arg2);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Lclient!za;IILclient!ir;ZII)V")
	public void method1553(@OriginalArg(0) Class106 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class120 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) Interface5 local5 = null;
		if (arg1 == 0) {
			local5 = (Interface5) Static232.method3536(arg5, arg2, arg4);
		}
		if (arg1 == 1) {
			local5 = (Interface5) Static392.method5433(arg5, arg2, arg4);
		}
		if (arg1 == 2) {
			local5 = (Interface5) Static461.method5974(arg5, arg2, arg4, jg.class);
		}
		if (arg1 == 3) {
			local5 = (Interface5) Static454.method6163(arg5, arg2, arg4);
		}
		if (local5 == null) {
			return;
		}
		@Pc(77) Class192 local77 = Static455.aClass161_4.method3628(local5.method5730());
		@Pc(81) int local81 = local5.method5727();
		@Pc(85) int local85 = local5.method5729();
		if (local77.method4370()) {
			Static112.method1801(arg2, local77, arg5, arg4);
		}
		if (local5.method5731()) {
			local5.method5728(arg0);
		}
		if (arg1 == 0) {
			@Pc(110) Class30_Sub3 local110 = Static232.method3536(arg5, arg2, arg4);
			if (local110 instanceof Class30_Sub3_Sub1) {
				((Class30_Sub3_Sub1) local110).aClass30_Sub3_1 = null;
			} else {
				Static52.method976(arg5, arg2, arg4);
			}
			if (local77.anInt5664 != 0) {
				arg3.method3045(!local77.aBoolean357, local77.aBoolean360, local81, arg2, local85, arg4);
				return;
			}
		} else if (arg1 == 1) {
			@Pc(303) Class30_Sub2 local303 = Static392.method5433(arg5, arg2, arg4);
			if (!(local303 instanceof Class30_Sub2_Sub1)) {
				Static163.method2685(arg5, arg2, arg4);
				return;
			}
			((Class30_Sub2_Sub1) local303).aClass30_Sub2_1 = null;
		} else {
			if (arg1 == 2) {
				@Pc(199) Class30_Sub1 local199 = Static461.method5974(arg5, arg2, arg4, jg.class);
				if (local199 instanceof Class30_Sub1_Sub5 && local199.aShort104 == arg2 && arg4 == local199.aShort103) {
					((Class30_Sub1_Sub5) local199).aClass30_Sub1_2 = null;
				} else {
					Static17.method332(arg5, arg2, arg4, jg.class);
				}
				if (local77.anInt5664 == 0 || super.anInt2055 <= arg2 + local77.anInt5661 || local77.anInt5661 + arg4 >= super.anInt2062 || super.anInt2055 <= arg2 + local77.anInt5679 || arg4 + local77.anInt5679 >= super.anInt2062) {
					return;
				}
				arg3.method3047(local85, local77.aBoolean360, arg2, arg4, !local77.aBoolean357, local77.anInt5679, local77.anInt5661);
			} else if (arg1 == 3) {
				@Pc(162) Class30_Sub4 local162 = Static454.method6163(arg5, arg2, arg4);
				if (local162 instanceof Class30_Sub4_Sub2) {
					((Class30_Sub4_Sub2) local162).aClass30_Sub4_1 = null;
				} else {
					Static263.method3900(arg5, arg2, arg4);
				}
				if (local77.anInt5664 == 1) {
					arg3.method3040(arg2, arg4);
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIIIIILclient!za;ILclient!ir;I)V")
	public void method1555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class106 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class120 arg8, @OriginalArg(10) int arg9) {
		if (!Static12.aClass34_Sub1_1.method5471(Static262.anInt2805) && !Static318.method4536(arg9, arg7, Static313.anInt5847, arg5)) {
			return;
		}
		if (this.anInt2067 > arg0) {
			this.anInt2067 = arg0;
		}
		@Pc(28) Class192 local28 = Static455.aClass161_4.method3628(arg1);
		if (arg6.method5910() && Static12.aClass34_Sub1_1.aBoolean458 && local28.aBoolean352) {
			return;
		}
		@Pc(49) int local49;
		@Pc(52) int local52;
		if (arg2 == 1 || arg2 == 3) {
			local52 = local28.anInt5661;
			local49 = local28.anInt5679;
		} else {
			local49 = local28.anInt5661;
			local52 = local28.anInt5679;
		}
		@Pc(71) int local71;
		@Pc(79) int local79;
		if (super.anInt2055 >= local49 + arg7) {
			local71 = (local49 >> 1) + arg7;
			local79 = (local49 + 1 >> 1) + arg7;
		} else {
			local71 = arg7;
			local79 = arg7 + 1;
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		if (arg5 + local52 <= super.anInt2062) {
			local103 = (local52 >> 1) + arg5;
			local111 = (local52 + 1 >> 1) + arg5;
		} else {
			local111 = arg5 + 1;
			local103 = arg5;
		}
		@Pc(122) Class96 local122 = Static396.aClass96Array5[arg9];
		@Pc(145) int local145 = local122.ua(local71, local103) + local122.ua(local79, local103) + local122.ua(local71, local111) + local122.ua(local79, local111) >> 2;
		@Pc(153) int local153 = (local49 << 6) + (arg7 << 7);
		@Pc(161) int local161 = (local52 << 6) + (arg5 << 7);
		@Pc(173) boolean local173 = Static332.aBoolean408 && !super.aBoolean128 && local28.aBoolean358;
		if (local28.method4370()) {
			Static418.method5683(arg0, null, arg2, local28, arg7, null, arg5);
		}
		@Pc(207) boolean local207 = arg3 == -1 && local28.anInt5688 == -1 && local28.anIntArray533 == null && local28.anIntArray532 == null && !local28.aBoolean349;
		if (Static166.aBoolean205 && (Static1.method36(arg4) && local28.anInt5647 != 1 || !(!Static303.method4391(arg4) || local28.anInt5647 != 0))) {
			return;
		}
		if (arg4 != 22) {
			@Pc(368) Class30_Sub1 local368;
			@Pc(335) Class30_Sub1_Sub4 local335;
			@Pc(339) int local339;
			if (arg4 == 10 || arg4 == 11) {
				local335 = null;
				if (local207) {
					@Pc(397) Class30_Sub1_Sub4 local397 = new Class30_Sub1_Sub4(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg7, local49 + arg7 - 1, arg5, local52 + arg5 - 1, arg4, arg2, local173);
					local368 = local397;
					local335 = local397;
					local339 = local397.method4718();
				} else {
					local339 = 15;
					local368 = new Class30_Sub1_Sub6(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg7, arg7 + local49 - 1, arg5, local52 + arg5 - 1, arg4, arg2, arg3);
				}
				@Pc(418) Class30_Sub1 local418 = Static461.method5974(arg0, arg7, arg5, jg.class);
				@Pc(420) boolean local420 = false;
				if (local418 instanceof Class30_Sub1_Sub5 && local418.aShort104 == arg7 && arg5 == local418.aShort103) {
					local420 = true;
					((Class30_Sub1_Sub5) local418).aClass30_Sub1_2 = local368;
				}
				if (local420 || Static193.method3130(local368, false)) {
					if (local335 != null && local335.method5731()) {
						local335.method5732(arg6);
					}
					if (local28.aBoolean363 && Static332.aBoolean408) {
						if (local339 > 30) {
							local339 = 30;
						}
						for (@Pc(469) int local469 = 0; local469 <= local49; local469++) {
							for (@Pc(472) int local472 = 0; local472 <= local52; local472++) {
								local122.qa(local469 + arg7, local472 + arg5, local339);
							}
						}
					}
				}
				if (local28.anInt5664 != 0 && arg8 != null) {
					arg8.method3048(!local28.aBoolean357, local28.aBoolean360, local52, arg7, local49, arg5);
				}
			} else {
				@Pc(617) Class30_Sub1 local617;
				if (arg4 >= 12 && arg4 <= 17 || arg4 >= 18 && arg4 <= 21) {
					if (local207) {
						local335 = new Class30_Sub1_Sub4(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg7, local49 + arg7 - 1, arg5, local52 + arg5 - 1, arg4, arg2, local173);
						if (local335.method5731()) {
							local335.method5732(arg6);
						}
						local368 = local335;
					} else {
						local368 = new Class30_Sub1_Sub6(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg7, arg7 + local49 - 1, arg5, local52 + arg5 - 1, arg4, arg2, arg3);
					}
					local617 = Static461.method5974(arg0, arg7, arg5, jg.class);
					if (local617 instanceof Class30_Sub1_Sub5 && local617.aShort104 == arg7 && arg5 == local617.aShort103) {
						((Class30_Sub1_Sub5) local617).aClass30_Sub1_2 = local368;
					} else {
						Static193.method3130(local368, false);
					}
					if (Static332.aBoolean408 && !super.aBoolean128 && arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg0 > 0 && local28.anInt5647 != 0) {
						super.aByteArrayArrayArray8[arg0][arg7][arg5] = (byte) (super.aByteArrayArrayArray8[arg0][arg7][arg5] | 0x4);
					}
					if (local28.anInt5664 != 0 && arg8 != null) {
						arg8.method3048(!local28.aBoolean357, local28.aBoolean360, local52, arg7, local49, arg5);
					}
				} else {
					@Pc(753) Class30_Sub3 local753;
					if (arg4 == 0) {
						@Pc(718) int local718 = local28.anInt5647;
						if (Static153.aBoolean324 && local28.anInt5647 == -1) {
							local718 = 1;
						}
						if (local207) {
							@Pc(743) Class30_Sub3_Sub2 local743 = new Class30_Sub3_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, arg4, arg2, local173);
							if (local743.method5731()) {
								local743.method5732(arg6);
							}
							local753 = local743;
						} else {
							local753 = new Class30_Sub3_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg4, arg2, arg3);
						}
						@Pc(775) Class30_Sub3 local775 = Static232.method3536(arg0, arg7, arg5);
						if (local775 instanceof Class30_Sub3_Sub1) {
							((Class30_Sub3_Sub1) local775).aClass30_Sub3_1 = local753;
						} else {
							Static454.method6164(arg0, arg7, arg5, local753, null);
						}
						if (Static332.aBoolean408) {
							if (arg2 == 0) {
								if (local28.aBoolean363) {
									local122.qa(arg7, arg5, 50);
									local122.qa(arg7, arg5 + 1, 50);
								}
								if (local718 == 1 && !super.aBoolean128) {
									super.aByteArrayArrayArray8[arg0][arg7][arg5] = (byte) (super.aByteArrayArrayArray8[arg0][arg7][arg5] | 0x1);
								}
							} else if (arg2 == 1) {
								if (local28.aBoolean363) {
									local122.qa(arg7, arg5 + 1, 50);
									local122.qa(arg7 + 1, arg5 + 1, 50);
								}
								if (local718 == 1 && !super.aBoolean128) {
									super.aByteArrayArrayArray8[arg0][arg7][arg5 + 1] = (byte) (super.aByteArrayArrayArray8[arg0][arg7][arg5 + 1] | 0x2);
								}
							} else if (arg2 == 2) {
								if (local28.aBoolean363) {
									local122.qa(arg7 + 1, arg5, 50);
									local122.qa(arg7 + 1, arg5 + 1, 50);
								}
								if (local718 == 1 && !super.aBoolean128) {
									super.aByteArrayArrayArray8[arg0][arg7 + 1][arg5] = (byte) (super.aByteArrayArrayArray8[arg0][arg7 + 1][arg5] | 0x1);
								}
							} else if (arg2 == 3) {
								if (local28.aBoolean363) {
									local122.qa(arg7, arg5, 50);
									local122.qa(arg7 + 1, arg5, 50);
								}
								if (local718 == 1 && !super.aBoolean128) {
									super.aByteArrayArrayArray8[arg0][arg7][arg5] = (byte) (super.aByteArrayArrayArray8[arg0][arg7][arg5] | 0x2);
								}
							}
						}
						if (local28.anInt5664 != 0 && arg8 != null) {
							arg8.method3052(!local28.aBoolean357, arg7, arg5, arg4, local28.aBoolean360, arg2);
						}
						if (local28.anInt5668 != 16) {
							Static153.method3990(arg0, arg7, arg5, local28.anInt5668);
						}
					} else {
						@Pc(1060) Class30_Sub3_Sub2 local1060;
						@Pc(1044) Class30_Sub3 local1044;
						if (arg4 == 1) {
							if (local207) {
								local1060 = new Class30_Sub3_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, arg4, arg2, local173);
								local1044 = local1060;
								if (local1060.method5731()) {
									local1060.method5732(arg6);
								}
							} else {
								local1044 = new Class30_Sub3_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg4, arg2, arg3);
							}
							local753 = Static232.method3536(arg0, arg7, arg5);
							if (local753 instanceof Class30_Sub3_Sub1) {
								((Class30_Sub3_Sub1) local753).aClass30_Sub3_1 = local1044;
							} else {
								Static454.method6164(arg0, arg7, arg5, local1044, null);
							}
							if (local28.aBoolean363 && Static332.aBoolean408) {
								if (arg2 == 0) {
									local122.qa(arg7, arg5 + 1, 50);
								} else if (arg2 == 1) {
									local122.qa(arg7 + 1, arg5 + 1, 50);
								} else if (arg2 == 2) {
									local122.qa(arg7 + 1, arg5, 50);
								} else if (arg2 == 3) {
									local122.qa(arg7, arg5, 50);
								}
							}
							if (local28.anInt5664 != 0 && arg8 != null) {
								arg8.method3052(!local28.aBoolean357, arg7, arg5, arg4, local28.aBoolean360, arg2);
							}
						} else {
							@Pc(1173) int local1173;
							if (arg4 == 2) {
								local1173 = arg2 + 1 & 0x3;
								if (local207) {
									@Pc(1227) Class30_Sub3_Sub2 local1227 = new Class30_Sub3_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, arg4, arg2 + 4, local173);
									@Pc(1242) Class30_Sub3_Sub2 local1242 = new Class30_Sub3_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, arg4, local1173, local173);
									if (local1227.method5731()) {
										local1227.method5732(arg6);
									}
									if (local1242.method5731()) {
										local1242.method5732(arg6);
									}
									local1044 = local1227;
									local753 = local1242;
								} else {
									local1044 = new Class30_Sub3_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg4, arg2 + 4, arg3);
									local753 = new Class30_Sub3_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg4, local1173, arg3);
								}
								Static454.method6164(arg0, arg7, arg5, local1044, local753);
								if (local28.anInt5647 == 1 && Static332.aBoolean408 && !super.aBoolean128) {
									if (arg2 == 0) {
										super.aByteArrayArrayArray8[arg0][arg7][arg5] = (byte) (super.aByteArrayArrayArray8[arg0][arg7][arg5] | 0x1);
										super.aByteArrayArrayArray8[arg0][arg7][arg5 + 1] = (byte) (super.aByteArrayArrayArray8[arg0][arg7][arg5 + 1] | 0x2);
									} else if (arg2 == 1) {
										super.aByteArrayArrayArray8[arg0][arg7][arg5 + 1] = (byte) (super.aByteArrayArrayArray8[arg0][arg7][arg5 + 1] | 0x2);
										super.aByteArrayArrayArray8[arg0][arg7 + 1][arg5] = (byte) (super.aByteArrayArrayArray8[arg0][arg7 + 1][arg5] | 0x1);
									} else if (arg2 == 2) {
										super.aByteArrayArrayArray8[arg0][arg7 + 1][arg5] = (byte) (super.aByteArrayArrayArray8[arg0][arg7 + 1][arg5] | 0x1);
										super.aByteArrayArrayArray8[arg0][arg7][arg5] = (byte) (super.aByteArrayArrayArray8[arg0][arg7][arg5] | 0x2);
									} else if (arg2 == 3) {
										super.aByteArrayArrayArray8[arg0][arg7][arg5] = (byte) (super.aByteArrayArrayArray8[arg0][arg7][arg5] | 0x2);
										super.aByteArrayArrayArray8[arg0][arg7][arg5] = (byte) (super.aByteArrayArrayArray8[arg0][arg7][arg5] | 0x1);
									}
								}
								if (local28.anInt5664 != 0 && arg8 != null) {
									arg8.method3052(!local28.aBoolean357, arg7, arg5, arg4, local28.aBoolean360, arg2);
								}
								if (local28.anInt5668 != 16) {
									Static153.method3990(arg0, arg7, arg5, local28.anInt5668);
								}
							} else if (arg4 == 3) {
								if (local207) {
									local1060 = new Class30_Sub3_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, arg4, arg2, local173);
									if (local1060.method5731()) {
										local1060.method5732(arg6);
									}
									local1044 = local1060;
								} else {
									local1044 = new Class30_Sub3_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg4, arg2, arg3);
								}
								local753 = Static232.method3536(arg0, arg7, arg5);
								if (local753 instanceof Class30_Sub3_Sub1) {
									((Class30_Sub3_Sub1) local753).aClass30_Sub3_1 = local1044;
								} else {
									Static454.method6164(arg0, arg7, arg5, local1044, null);
								}
								if (local28.aBoolean363 && Static332.aBoolean408) {
									if (arg2 == 0) {
										local122.qa(arg7, arg5 + 1, 50);
									} else if (arg2 == 1) {
										local122.qa(arg7 + 1, arg5 - -1, 50);
									} else if (arg2 == 2) {
										local122.qa(arg7 + 1, arg5, 50);
									} else if (arg2 == 3) {
										local122.qa(arg7, arg5, 50);
									}
								}
								if (local28.anInt5664 != 0 && arg8 != null) {
									arg8.method3052(!local28.aBoolean357, arg7, arg5, arg4, local28.aBoolean360, arg2);
								}
							} else if (arg4 == 9) {
								if (local207) {
									@Pc(1661) Class30_Sub1_Sub4 local1661 = new Class30_Sub1_Sub4(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg7, arg7, arg5, arg5, arg4, arg2, local173);
									local617 = local1661;
									if (local1661.method5731()) {
										local1661.method5732(arg6);
									}
								} else {
									local617 = new Class30_Sub1_Sub6(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg7, arg7 + local49 - 1, arg5, local52 + arg5 - 1, arg4, arg2, arg3);
								}
								@Pc(1714) Class30_Sub1 local1714 = Static461.method5974(arg0, arg7, arg5, jg.class);
								if (local1714 instanceof Class30_Sub1_Sub5 && local1714.aShort104 == arg7 && arg5 == local1714.aShort103) {
									((Class30_Sub1_Sub5) local1714).aClass30_Sub1_2 = local617;
								} else {
									Static193.method3130(local617, false);
								}
								if (local28.anInt5664 != 0 && arg8 != null) {
									arg8.method3048(!local28.aBoolean357, local28.aBoolean360, local52, arg7, local49, arg5);
								}
								if (local28.anInt5668 != 16) {
									Static153.method3990(arg0, arg7, arg5, local28.anInt5668);
								}
							} else {
								@Pc(1798) Class30_Sub2 local1798;
								if (arg4 == 4) {
									if (local207) {
										@Pc(1816) Class30_Sub2_Sub2 local1816 = new Class30_Sub2_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, 0, 0, 0, arg4, arg2);
										local1798 = local1816;
										if (local1816.method5731()) {
											local1816.method5732(arg6);
										}
									} else {
										local1798 = new Class30_Sub2_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, 0, 0, 0, arg4, arg2, arg3);
									}
									@Pc(1831) Class30_Sub2 local1831 = Static392.method5433(arg0, arg7, arg5);
									if (local1831 instanceof Class30_Sub2_Sub1) {
										((Class30_Sub2_Sub1) local1831).aClass30_Sub2_1 = local1798;
									} else {
										Static70.method1337(arg0, arg7, arg5, local1798, null);
									}
								} else {
									@Pc(1857) Interface5 local1857;
									@Pc(1896) Class30_Sub2_Sub2 local1896;
									@Pc(1939) Class30_Sub2 local1939;
									if (arg4 == 5) {
										local339 = 17;
										local1857 = (Interface5) Static232.method3536(arg0, arg7, arg5);
										if (local1857 != null) {
											local339 = Static455.aClass161_4.method3628(local1857.method5730()).anInt5668 + 1;
										}
										if (local207) {
											local1896 = new Class30_Sub2_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, 0, local339 * Static182.anIntArray380[arg2], local339 * Static260.anIntArray477[arg2], arg4, arg2);
											local1798 = local1896;
											if (local1896.method5731()) {
												local1896.method5732(arg6);
											}
										} else {
											local1798 = new Class30_Sub2_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, 0, Static182.anIntArray380[arg2] * local339, local339 * Static260.anIntArray477[arg2], arg4, arg2, arg3);
										}
										local1939 = Static392.method5433(arg0, arg7, arg5);
										if (local1939 instanceof Class30_Sub2_Sub1) {
											((Class30_Sub2_Sub1) local1939).aClass30_Sub2_1 = local1798;
										} else {
											Static70.method1337(arg0, arg7, arg5, local1798, null);
										}
									} else if (arg4 == 6) {
										local339 = 9;
										local1857 = (Interface5) Static232.method3536(arg0, arg7, arg5);
										if (local1857 != null) {
											local339 = Static455.aClass161_4.method3628(local1857.method5730()).anInt5668 / 2 + 1;
										}
										if (local207) {
											local1896 = new Class30_Sub2_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, arg2, Static182.anIntArray380[arg2] * local339, Static260.anIntArray477[arg2] * local339, arg4, arg2 + 4);
											if (local1896.method5731()) {
												local1896.method5732(arg6);
											}
											local1798 = local1896;
										} else {
											local1798 = new Class30_Sub2_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg2, Static200.anIntArray393[arg2] * local339, Static236.anIntArray439[arg2] * local339, arg4, arg2 + 4, arg3);
										}
										local1939 = Static392.method5433(arg0, arg7, arg5);
										if (local1939 instanceof Class30_Sub2_Sub1) {
											((Class30_Sub2_Sub1) local1939).aClass30_Sub2_1 = local1798;
										} else {
											Static70.method1337(arg0, arg7, arg5, local1798, null);
										}
									} else if (arg4 == 7) {
										local339 = arg2 + 2 & 0x3;
										if (local207) {
											@Pc(2102) Class30_Sub2_Sub2 local2102 = new Class30_Sub2_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, local339, 0, 0, arg4, local339 + 4);
											local1798 = local2102;
											if (local2102.method5731()) {
												local2102.method5732(arg6);
											}
										} else {
											local1798 = new Class30_Sub2_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, local339, 0, 0, arg4, local339 + 4, arg3);
										}
										@Pc(2139) Class30_Sub2 local2139 = Static392.method5433(arg0, arg7, arg5);
										if (local2139 instanceof Class30_Sub2_Sub1) {
											((Class30_Sub2_Sub1) local2139).aClass30_Sub2_1 = local1798;
										} else {
											Static70.method1337(arg0, arg7, arg5, local1798, null);
										}
									} else if (arg4 == 8) {
										local1173 = arg2 + 2 & 0x3;
										@Pc(2165) int local2165 = 9;
										@Pc(2171) Interface5 local2171 = (Interface5) Static232.method3536(arg0, arg7, arg5);
										if (local2171 != null) {
											local2165 = Static455.aClass161_4.method3628(local2171.method5730()).anInt5668 / 2 + 1;
										}
										@Pc(2239) Class30_Sub2 local2239;
										@Pc(2216) Class30_Sub2 local2216;
										if (local207) {
											local2216 = new Class30_Sub2_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, arg2, local2165 * Static200.anIntArray393[arg2], local2165 * Static236.anIntArray439[arg2], arg4, arg2 + 4);
											local2239 = new Class30_Sub2_Sub2(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, arg2, 0, 0, arg4, local1173 + 4);
											if (local2216.method5731()) {
												local2216.method5732(arg6);
											}
											if (local2239.method5731()) {
												local2239.method5732(arg6);
											}
										} else {
											local2216 = new Class30_Sub2_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg2, Static200.anIntArray393[arg2] * local2165, local2165 * Static236.anIntArray439[arg2], arg4, arg2 + 4, arg3);
											local2239 = new Class30_Sub2_Sub3(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg2, 0, 0, arg4, local1173 + 4, arg3);
										}
										Static70.method1337(arg0, arg7, arg5, local2216, local2239);
									}
								}
							}
						}
					}
				}
			}
		} else if (Static12.aClass34_Sub1_1.aBoolean455 || local28.anInt5666 != 0 || local28.anInt5664 == 1 || local28.aBoolean356) {
			@Pc(277) Class30_Sub4 local277;
			if (local207) {
				@Pc(267) Class30_Sub4_Sub3 local267 = new Class30_Sub4_Sub3(arg6, local28, arg9, local153, local145, local161, super.aBoolean128, arg2, local173);
				if (local267.method5731()) {
					local267.method5732(arg6);
				}
				local277 = local267;
			} else {
				local277 = new Class30_Sub4_Sub1(arg6, local28, arg0, arg9, local153, local145, local161, super.aBoolean128, arg2, arg3);
			}
			@Pc(298) Class30_Sub4 local298 = Static454.method6163(arg0, arg7, arg5);
			if (local298 instanceof Class30_Sub4_Sub2) {
				((Class30_Sub4_Sub2) local298).aClass30_Sub4_1 = local277;
			} else {
				Static379.method5243(arg0, arg7, arg5, local277);
			}
			if (local28.anInt5664 == 1 && arg8 != null) {
				arg8.method3051(arg7, arg5);
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "([IIILclient!za;IIIILclient!ia;IB)V")
	public void method1556(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class106 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class1_Sub3 arg8, @OriginalArg(9) int arg9) {
		if (super.aBoolean128) {
			return;
		}
		@Pc(11) Class108 local11 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(23) int local23 = (arg6 & 0x7) * 8;
		@Pc(29) int local29 = (arg9 & 0x7) * 8;
		while (true) {
			@Pc(34) int local34;
			@Pc(127) int local127;
			@Pc(164) int local164;
			@Pc(395) int local395;
			while (arg8.aByteArray14.length > arg8.anInt1710) {
				local34 = arg8.method1171();
				if (local34 == 0) {
					local11 = new Class108(arg8);
				} else {
					@Pc(179) int local179;
					@Pc(182) int local182;
					@Pc(211) int local211;
					@Pc(294) int local294;
					if (local34 == 1) {
						local127 = arg8.method1171();
						if (local127 > 0) {
							for (local395 = 0; local395 < local127; local395++) {
								@Pc(403) Class75 local403 = new Class75(arg3, arg8, 0);
								if (local403.anInt2346 == 31) {
									@Pc(414) Class206 local414 = Static447.aClass270_1.method6169(arg8.method1177());
									local403.method1704(local414.anInt6067, local414.anInt6069, local414.anInt6065, local414.anInt6068);
								}
								if (arg3.method5928() > 0) {
									@Pc(431) Class1_Sub4 local431 = local403.aClass1_Sub4_2;
									local294 = local431.method3813() >> 7;
									local179 = local431.method3809() >> 7;
									if (arg4 == local403.anInt2355 && local23 <= local294 && local23 + 8 > local294 && local29 <= local179 && local179 < local29 + 8) {
										local182 = (arg2 << 7) + Static2.method39(local431.method3813() & 0x3FF, arg7, local431.method3809() & 0x3FF);
										local211 = (arg1 << 7) + Static198.method6176(arg7, local431.method3809() & 0x3FF, local431.method3813() & 0x3FF);
										local294 = local182 >> 7;
										local179 = local211 >> 7;
										if (local294 >= 0 && local179 >= 0 && super.anInt2055 > local294 && local179 < super.anInt2062) {
											local431.method3806(local211, super.anIntArrayArrayArray3[arg4][local294][local179] - local431.method3810(), local182);
											Static293.method3597(local403);
										}
									}
								}
							}
						}
					} else if (local34 == 2) {
						if (local11 == null) {
							local11 = new Class108();
						}
						local11.method2633(arg8);
					} else if (local34 != 128) {
						if (local34 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray7 == null) {
							super.aByteArrayArrayArray7 = new byte[4][][];
						}
						for (local127 = 0; local127 < 4; local127++) {
							@Pc(134) byte local134 = arg8.method1212();
							@Pc(167) int local167;
							if (local134 == 0 && super.aByteArrayArrayArray7[arg5] != null) {
								if (local127 <= arg4) {
									local164 = arg2;
									local167 = arg2 + 7;
									local294 = arg1;
									if (arg1 < 0) {
										local294 = 0;
									} else if (super.anInt2062 <= arg1) {
										local294 = super.anInt2062;
									}
									local179 = arg1 + 7;
									if (local167 < 0) {
										local167 = 0;
									} else if (local167 >= super.anInt2055) {
										local167 = super.anInt2055;
									}
									if (arg2 < 0) {
										local164 = 0;
									} else if (super.anInt2055 <= arg2) {
										local164 = super.anInt2055;
									}
									if (local179 < 0) {
										local179 = 0;
									} else if (local179 >= super.anInt2062) {
										local179 = super.anInt2062;
									}
									while (local164 < local167) {
										while (local294 < local179) {
											super.aByteArrayArrayArray7[arg5][local164][local294] = 0;
											local294++;
										}
										local164++;
									}
								}
							} else if (local134 == 1) {
								if (super.aByteArrayArrayArray7[arg5] == null) {
									super.aByteArrayArrayArray7[arg5] = new byte[super.anInt2055 + 1][super.anInt2062 + 1];
								}
								for (local164 = 0; local164 < 64; local164 += 4) {
									for (local167 = 0; local167 < 64; local167 += 4) {
										@Pc(174) byte local174 = arg8.method1212();
										if (arg4 >= local127) {
											for (local179 = local164; local179 < local164 + 4; local179++) {
												for (local182 = local167; local182 < local167 + 4; local182++) {
													if (local23 <= local179 && local179 < local23 + 8 && local29 <= local182 && local29 < local29 + 8) {
														local211 = arg2 + Static102.method1725(local182 & 0x7, arg7, local179 & 0x7);
														@Pc(223) int local223 = arg1 + Static446.method6043(arg7, local179 & 0x7, local182 & 0x7);
														if (local211 >= 0 && super.anInt2055 > local211 && local223 >= 0 && local223 < super.anInt2062) {
															super.aByteArrayArrayArray7[arg5][local211][local223] = local174;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg0 == null) {
						arg8.anInt1710 += 10;
					} else {
						arg0[0] = arg8.method1177();
						arg0[1] = arg8.method1215();
						arg0[2] = arg8.method1215();
						arg0[3] = arg8.method1215();
						arg0[4] = arg8.method1177();
					}
				}
			}
			if (local11 != null) {
				Static251.method3738(local11, arg1 >> 3, arg2 >> 3);
			}
			if (super.aByteArrayArrayArray7 != null && super.aByteArrayArrayArray7[arg5] != null) {
				local34 = arg2 + 7;
				local127 = arg1 + 7;
				for (local395 = arg2; local395 < local34; local395++) {
					for (local164 = arg1; local164 < local127; local164++) {
						super.aByteArrayArrayArray7[arg5][local395][local164] = 0;
					}
				}
				return;
			}
			return;
		}
	}
}
