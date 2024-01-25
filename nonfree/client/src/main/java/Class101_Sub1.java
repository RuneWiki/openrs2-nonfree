import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!h")
public final class Class101_Sub1 extends Class101 {

	@OriginalMember(owner = "client!h", name = "D", descriptor = "I")
	public int anInt2939 = 99;

	@OriginalMember(owner = "client!h", name = "<init>", descriptor = "(IIIZ)V")
	public Class101_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static173.aClass43_5, Static297.aClass207_5);
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(Lclient!za;Lclient!sd;IIIII)V")
	public void method2440(@OriginalArg(0) Class50 arg0, @OriginalArg(1) Class220 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface10 local7 = null;
		if (arg2 == 0) {
			local7 = (Interface10) Static96.method1755(arg4, arg3, arg5);
		}
		if (arg2 == 1) {
			local7 = (Interface10) Static137.method2391(arg4, arg3, arg5);
		}
		if (arg2 == 2) {
			local7 = (Interface10) Static106.method1867(arg4, arg3, arg5, rj.class);
		}
		if (arg2 == 3) {
			local7 = (Interface10) Static447.method5138(arg4, arg3, arg5);
		}
		if (local7 == null) {
			return;
		}
		@Pc(67) Class126 local67 = Static342.aClass237_4.method5212(local7.method5706());
		@Pc(71) int local71 = local7.method5702();
		@Pc(75) int local75 = local7.method5705();
		if (local67.method3005()) {
			Static208.method3234(arg4, arg3, local67, arg5);
		}
		if (local7.method5701()) {
			local7.method5704(arg0);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				@Pc(255) Class24_Sub1 local255 = Static137.method2391(arg4, arg3, arg5);
				if (!(local255 instanceof Class24_Sub1_Sub2)) {
					Static125.method2189(arg4, arg3, arg5);
					return;
				}
				((Class24_Sub1_Sub2) local255).aClass24_Sub1_3 = null;
			} else if (arg2 == 2) {
				@Pc(119) Class24_Sub3 local119 = Static106.method1867(arg4, arg3, arg5, rj.class);
				if (local119 instanceof Class24_Sub3_Sub3 && arg3 == local119.aShort107 && arg5 == local119.aShort105) {
					((Class24_Sub3_Sub3) local119).aClass24_Sub3_2 = null;
				} else {
					Static425.method5654(arg4, arg3, arg5, rj.class);
				}
				if (local67.anInt3791 != 0 && local67.anInt3785 + arg3 < super.anInt2929 && arg5 + local67.anInt3785 < super.anInt2924 && local67.anInt3782 + arg3 < super.anInt2929 && arg5 + local67.anInt3782 < super.anInt2924) {
					arg1.method4887(local67.anInt3782, local75, arg5, !local67.aBoolean250, local67.aBoolean247, arg3, local67.anInt3785);
					return;
				}
				return;
			} else if (arg2 == 3) {
				@Pc(225) Class24_Sub4 local225 = Static447.method5138(arg4, arg3, arg5);
				if (local225 instanceof Class24_Sub4_Sub3) {
					((Class24_Sub4_Sub3) local225).aClass24_Sub4_2 = null;
				} else {
					Static191.method3042(arg4, arg3, arg5);
				}
				if (local67.anInt3791 == 1) {
					arg1.method4890(arg3, arg5);
					return;
				}
			}
			return;
		}
		@Pc(273) Class24_Sub5 local273 = Static96.method1755(arg4, arg3, arg5);
		if (local273 instanceof Class24_Sub5_Sub1) {
			((Class24_Sub5_Sub1) local273).aClass24_Sub5_3 = null;
		} else {
			Static45.method5775(arg4, arg3, arg5);
		}
		if (local67.anInt3791 != 0) {
			arg1.method4878(!local67.aBoolean250, local67.aBoolean247, arg3, arg5, local75, local71);
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[IIILclient!za;Lclient!nn;)V")
	public void method2441(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) Class10_Sub8 arg4) {
		if (super.aBoolean213) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(19) Class184 local19 = null;
		while (true) {
			@Pc(24) int local24;
			@Pc(45) int local45;
			@Pc(244) int local244;
			@Pc(248) int local248;
			@Pc(49) int local49;
			while (arg4.anInt2989 < arg4.aByteArray44.length) {
				local24 = arg4.method2502();
				if (local24 == 0) {
					local19 = new Class184(arg4);
				} else {
					@Pc(102) int local102;
					@Pc(106) int local106;
					@Pc(94) int local94;
					if (local24 == 1) {
						local45 = arg4.method2502();
						if (local45 > 0) {
							for (local49 = 0; local49 < local45; local49++) {
								@Pc(58) Class225 local58 = new Class225(arg3, arg4, 0);
								if (local58.anInt6422 == 31) {
									@Pc(69) Class176 local69 = Static120.aClass128_1.method3041(arg4.method2485());
									local58.method4986(local69.anInt4976, local69.anInt4975, local69.anInt4978, local69.anInt4973);
								}
								if (arg3.method5854() > 0) {
									@Pc(86) Class10_Sub4 local86 = local58.aClass10_Sub4_1;
									local94 = local86.method5354() + (arg0 << 7);
									local102 = (arg2 << 7) + local86.method5362();
									local106 = local94 >> 7;
									@Pc(110) int local110 = local102 >> 7;
									if (local106 >= 0 && local110 >= 0 && super.anInt2929 > local106 && local110 < super.anInt2924) {
										local86.method5358(local94, local102, super.anIntArrayArrayArray3[local58.anInt6417][local106][local110] - local86.method5365());
										Static253.method3684(local58);
									}
								}
							}
						}
					} else if (local24 == 2) {
						if (local19 == null) {
							local19 = new Class184();
						}
						local19.method4241(arg4);
					} else if (local24 != 128) {
						if (local24 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray10 == null) {
							super.aByteArrayArrayArray10 = new byte[4][][];
						}
						for (local45 = 0; local45 < 4; local45++) {
							@Pc(232) byte local232 = arg4.method2460();
							if (local232 == 0 && super.aByteArrayArrayArray10[local45] != null) {
								local244 = arg0;
								local248 = arg0 + 64;
								local94 = arg2;
								if (arg0 < 0) {
									local244 = 0;
								} else if (super.anInt2929 <= arg0) {
									local244 = super.anInt2929;
								}
								if (local248 < 0) {
									local248 = 0;
								} else if (local248 >= super.anInt2929) {
									local248 = super.anInt2929;
								}
								local102 = arg2 + 64;
								if (arg2 < 0) {
									local94 = 0;
								} else if (arg2 >= super.anInt2924) {
									local94 = super.anInt2924;
								}
								if (local102 < 0) {
									local102 = 0;
								} else if (local102 >= super.anInt2924) {
									local102 = super.anInt2924;
								}
								while (local248 > local244) {
									while (local94 < local102) {
										super.aByteArrayArrayArray10[local45][local244][local94] = 0;
										local94++;
									}
									local244++;
								}
							} else if (local232 == 1) {
								if (super.aByteArrayArrayArray10[local45] == null) {
									super.aByteArrayArrayArray10[local45] = new byte[super.anInt2929 + 1][super.anInt2924 + 1];
								}
								for (local244 = 0; local244 < 64; local244 += 4) {
									for (local248 = 0; local248 < 64; local248 += 4) {
										@Pc(517) byte local517 = arg4.method2460();
										for (local102 = arg0 + local244; local102 < arg0 + local244 + 4; local102++) {
											for (local106 = arg2 + local248; local106 < local248 + arg2 + 4; local106++) {
												if (local102 >= 0 && local102 < super.anInt2929 && local106 >= 0 && local106 < super.anInt2924) {
													super.aByteArrayArrayArray10[local45][local102][local106] = local517;
												}
											}
										}
									}
								}
							} else if (local232 == 2) {
								if (super.aByteArrayArrayArray10[local45] == null) {
									super.aByteArrayArrayArray10[local45] = new byte[super.anInt2929 + 1][super.anInt2924 + 1];
								}
								if (local45 > 0) {
									local244 = arg0;
									local248 = arg0 + 64;
									local94 = arg2;
									local102 = arg2 + 64;
									if (arg0 < 0) {
										local244 = 0;
									} else if (super.anInt2929 <= arg0) {
										local244 = super.anInt2929;
									}
									if (arg2 < 0) {
										local94 = 0;
									} else if (arg2 >= super.anInt2924) {
										local94 = super.anInt2924;
									}
									if (local248 < 0) {
										local248 = 0;
									} else if (super.anInt2929 <= local248) {
										local248 = super.anInt2929;
									}
									if (local102 < 0) {
										local102 = 0;
									} else if (super.anInt2924 <= local102) {
										local102 = super.anInt2924;
									}
									while (local244 < local248) {
										while (local94 < local102) {
											super.aByteArrayArrayArray10[local45][local244][local94] = super.aByteArrayArrayArray10[local45 - 1][local244][local94];
											local94++;
										}
										local244++;
									}
								}
							}
						}
						local11 = true;
					} else if (arg1 == null) {
						arg4.anInt2989 += 10;
					} else {
						arg1[0] = arg4.method2485();
						arg1[1] = arg4.method2492();
						arg1[2] = arg4.method2492();
						arg1[3] = arg4.method2492();
						arg1[4] = arg4.method2485();
					}
				}
			}
			if (local19 != null) {
				for (local24 = 0; local24 < 8; local24++) {
					for (local45 = 0; local45 < 8; local45++) {
						local49 = (arg0 >> 3) + local24;
						local244 = local45 + (arg2 >> 3);
						if (local49 >= 0 && super.anInt2929 >> 3 > local49 && local244 >= 0 && local244 < super.anInt2924 >> 3) {
							Static265.method3796(local19, local49, local244);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray10 != null) {
				for (local24 = 0; local24 < 4; local24++) {
					if (super.aByteArrayArrayArray10[local24] != null) {
						for (local45 = 0; local45 < 16; local45++) {
							for (local49 = 0; local49 < 16; local49++) {
								local244 = (arg0 >> 2) + local45;
								local248 = (arg2 >> 2) + local49;
								if (local244 >= 0 && local244 < 26 && local248 >= 0 && local248 < 26) {
									super.aByteArrayArrayArray10[local24][local244][local248] = 0;
								}
							}
						}
					}
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[BLclient!za;II[Lclient!sd;IIIII)V")
	public void method2442(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class50 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class220[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(16) Class10_Sub8 local16 = new Class10_Sub8(arg1);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(24) int local24 = local16.method2463();
			if (local24 == 0) {
				return;
			}
			local18 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local16.method2469();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local16.method2502();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local61 == arg7 && arg3 <= local57 && arg3 + 8 > local57 && arg0 <= local51 && local51 < arg0 + 8) {
					@Pc(101) Class126 local101 = Static342.aClass237_4.method5212(local18);
					@Pc(119) int local119 = arg9 + Static114.method1978(local51 & 0x7, local57 & 0x7, local101.anInt3782, local73, arg8, local101.anInt3785);
					@Pc(137) int local137 = arg6 + Static108.method1895(local101.anInt3785, local73, local101.anInt3782, local51 & 0x7, arg8, local57 & 0x7);
					if (local119 > 0 && local137 > 0 && local119 < super.anInt2929 - 1 && super.anInt2924 - 1 > local137) {
						@Pc(162) Class220 local162 = null;
						if (!super.aBoolean213) {
							@Pc(167) int local167 = arg4;
							if ((Static181.aByteArrayArrayArray15[1][local119][local137] & 0x2) == 2) {
								local167 = arg4 - 1;
							}
							if (local167 >= 0) {
								local162 = arg5[local167];
							}
						}
						this.method2448(local137, local69, local162, local18, local119, arg4, arg8 + local73 & 0x3, arg2, -1, arg4);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(I[IIILclient!za;IIIILclient!nn;I)V")
	public void method2446(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class50 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class10_Sub8 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean213) {
			return;
		}
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(19) Class184 local19 = null;
		@Pc(25) int local25 = (arg5 & 0x7) * 8;
		@Pc(35) int local35 = (arg4 & 0x7) * 8;
		while (true) {
			@Pc(49) int local49;
			@Pc(102) int local102;
			@Pc(153) int local153;
			@Pc(171) int local171;
			@Pc(53) int local53;
			@Pc(96) int local96;
			label233: do {
				while (true) {
					@Pc(40) int local40;
					@Pc(335) int local335;
					while (arg8.aByteArray44.length > arg8.anInt2989) {
						local40 = arg8.method2502();
						if (local40 == 0) {
							local19 = new Class184(arg8);
						} else {
							if (local40 == 1) {
								local49 = arg8.method2502();
								continue label233;
							}
							if (local40 == 2) {
								if (local19 == null) {
									local19 = new Class184();
								}
								local19.method4241(arg8);
							} else if (local40 != 128) {
								if (local40 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray10 == null) {
									super.aByteArrayArrayArray10 = new byte[4][][];
								}
								for (local49 = 0; local49 < 4; local49++) {
									@Pc(303) byte local303 = arg8.method2460();
									@Pc(339) int local339;
									if (local303 == 0 && super.aByteArrayArrayArray10[arg7] != null) {
										if (arg9 >= local49) {
											local335 = arg1;
											local339 = arg1 + 7;
											local96 = arg6;
											if (local339 < 0) {
												local339 = 0;
											} else if (local339 >= super.anInt2929) {
												local339 = super.anInt2929;
											}
											if (arg6 < 0) {
												local96 = 0;
											} else if (arg6 >= super.anInt2924) {
												local96 = super.anInt2924;
											}
											local102 = arg6 + 7;
											if (arg1 < 0) {
												local335 = 0;
											} else if (super.anInt2929 <= arg1) {
												local335 = super.anInt2929;
											}
											if (local102 < 0) {
												local102 = 0;
											} else if (super.anInt2924 <= local102) {
												local102 = super.anInt2924;
											}
											while (local339 > local335) {
												while (local96 < local102) {
													super.aByteArrayArrayArray10[arg7][local335][local96] = 0;
													local96++;
												}
												local335++;
											}
										}
									} else if (local303 == 1) {
										if (super.aByteArrayArrayArray10[arg7] == null) {
											super.aByteArrayArrayArray10[arg7] = new byte[super.anInt2929 + 1][super.anInt2924 + 1];
										}
										for (local335 = 0; local335 < 64; local335 += 4) {
											for (local339 = 0; local339 < 64; local339 += 4) {
												@Pc(345) byte local345 = arg8.method2460();
												if (arg9 >= local49) {
													for (local102 = local335; local102 < local335 + 4; local102++) {
														for (local153 = local339; local153 < local339 + 4; local153++) {
															if (local25 <= local102 && local25 + 8 > local102 && local153 >= local35 && local35 < local35 + 8) {
																local171 = arg1 + Static420.method5522(local102 & 0x7, local153 & 0x7, arg2);
																@Pc(405) int local405 = arg6 + Static314.method4328(local153 & 0x7, arg2, local102 & 0x7);
																if (local171 >= 0 && local171 < super.anInt2929 && local405 >= 0 && super.anInt2924 > local405) {
																	super.aByteArrayArrayArray10[arg7][local171][local405] = local345;
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
								arg8.anInt2989 += 10;
							} else {
								arg0[0] = arg8.method2485();
								arg0[1] = arg8.method2492();
								arg0[2] = arg8.method2492();
								arg0[3] = arg8.method2492();
								arg0[4] = arg8.method2485();
							}
						}
					}
					if (local19 != null) {
						Static265.method3796(local19, arg1 >> 3, arg6 >> 3);
					}
					if (super.aByteArrayArrayArray10 != null && super.aByteArrayArrayArray10[arg7] != null) {
						local40 = arg1 + 7;
						local49 = arg6 + 7;
						for (local53 = arg1; local53 < local40; local53++) {
							for (local335 = arg6; local335 < local49; local335++) {
								super.aByteArrayArrayArray10[arg7][local53][local335] = 0;
							}
						}
						return;
					}
					return;
				}
			} while (local49 <= 0);
			for (local53 = 0; local53 < local49; local53++) {
				@Pc(62) Class225 local62 = new Class225(arg3, arg8, 0);
				if (local62.anInt6422 == 31) {
					@Pc(73) Class176 local73 = Static120.aClass128_1.method3041(arg8.method2485());
					local62.method4986(local73.anInt4976, local73.anInt4975, local73.anInt4978, local73.anInt4973);
				}
				if (arg3.method5854() > 0) {
					@Pc(90) Class10_Sub4 local90 = local62.aClass10_Sub4_1;
					local96 = local90.method5354() >> 7;
					local102 = local90.method5362() >> 7;
					if (local62.anInt6417 == arg9 && local25 <= local96 && local96 < local25 + 8 && local35 <= local102 && local35 + 8 > local102) {
						local153 = (arg1 << 7) + Static401.method5903(local90.method5354() & 0x3FF, local90.method5362() & 0x3FF, arg2);
						local171 = Static31.method448(arg2, local90.method5354() & 0x3FF, local90.method5362() & 0x3FF) + (arg6 << 7);
						local96 = local153 >> 7;
						local102 = local171 >> 7;
						if (local96 >= 0 && local102 >= 0 && local96 < super.anInt2929 && super.anInt2924 > local102) {
							local90.method5358(local153, local171, super.anIntArrayArrayArray3[arg9][local96][local102] - local90.method5365());
							Static253.method3684(local62);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "([BLclient!za;B[Lclient!sd;II)V")
	public void method2447(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class50 arg1, @OriginalArg(3) Class220[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) Class10_Sub8 local10 = new Class10_Sub8(arg0);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local10.method2463();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local10.method2469();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(46) int local46 = local30 & 0x3F;
				@Pc(52) int local52 = local30 >> 6 & 0x3F;
				@Pc(56) int local56 = local30 >> 12;
				@Pc(60) int local60 = local10.method2502();
				@Pc(64) int local64 = local60 >> 2;
				@Pc(68) int local68 = local60 & 0x3;
				@Pc(72) int local72 = arg4 + local52;
				@Pc(76) int local76 = arg3 + local46;
				if (local72 > 0 && local76 > 0 && super.anInt2929 - 1 > local72 && super.anInt2924 - 1 > local76) {
					@Pc(101) Class220 local101 = null;
					if (!super.aBoolean213) {
						@Pc(106) int local106 = local56;
						if ((Static181.aByteArrayArrayArray15[1][local72][local76] & 0x2) == 2) {
							local106 = local56 - 1;
						}
						if (local106 >= 0) {
							local101 = arg2[local106];
						}
					}
					this.method2448(local76, local64, local101, local18, local72, local56, local68, arg1, -1, local56);
				}
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BIILclient!sd;IIIILclient!za;II)V")
	public void method2448(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class220 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class50 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static361.aClass85_Sub1_1.method2113(Static423.anInt7114) && !Static28.method367(arg9, Static166.anInt3284, arg0, arg4)) {
			return;
		}
		if (this.anInt2939 > arg5) {
			this.anInt2939 = arg5;
		}
		@Pc(34) Class126 local34 = Static342.aClass237_4.method5212(arg3);
		if (arg7.method5843() && Static361.aClass85_Sub1_1.aBoolean167 && local34.aBoolean248) {
			return;
		}
		@Pc(55) int local55;
		@Pc(58) int local58;
		if (arg6 == 1 || arg6 == 3) {
			local55 = local34.anInt3782;
			local58 = local34.anInt3785;
		} else {
			local55 = local34.anInt3785;
			local58 = local34.anInt3782;
		}
		@Pc(90) int local90;
		@Pc(84) int local84;
		if (local55 + arg4 <= super.anInt2929) {
			local84 = arg4 + (local55 + 1 >> 1);
			local90 = (local55 >> 1) + arg4;
		} else {
			local90 = arg4;
			local84 = arg4 + 1;
		}
		@Pc(110) int local110;
		@Pc(108) int local108;
		if (super.anInt2924 < local58 + arg0) {
			local108 = arg0 + 1;
			local110 = arg0;
		} else {
			local110 = (local58 >> 1) + arg0;
			local108 = (local58 + 1 >> 1) + arg0;
		}
		@Pc(130) Class154 local130 = Static332.aClass154Array3[arg9];
		@Pc(153) int local153 = local130.ua(local90, local110) + local130.ua(local84, local110) + local130.ua(local90, local108) + local130.ua(local84, local108) >> 2;
		@Pc(169) int local169 = (local55 << 6) + (arg4 << 7);
		@Pc(177) int local177 = (local58 << 6) + (arg0 << 7);
		@Pc(189) boolean local189 = Static142.aBoolean211 && !super.aBoolean213 && local34.aBoolean254;
		if (local34.method3005()) {
			Static129.method2264(arg0, null, local34, arg4, arg6, arg5, null);
		}
		@Pc(223) boolean local223 = arg8 == -1 && local34.anInt3761 == -1 && local34.anIntArray382 == null && local34.anIntArray380 == null && !local34.aBoolean244;
		if (Static261.aBoolean314 && (Static382.method5565(arg1) && local34.anInt3772 != 1 || !(!Static374.method4990(arg1) || local34.anInt3772 != 0))) {
			return;
		}
		if (arg1 != 22) {
			@Pc(387) Class24_Sub3 local387;
			@Pc(352) Class24_Sub3_Sub4 local352;
			@Pc(391) int local391;
			if (arg1 == 10 || arg1 == 11) {
				local352 = null;
				if (local223) {
					@Pc(383) Class24_Sub3_Sub4 local383 = new Class24_Sub3_Sub4(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg4, local55 + arg4 - 1, arg0, arg0 + local58 - 1, arg1, arg6, local189);
					local352 = local383;
					local387 = local383;
					local391 = local383.method5320();
				} else {
					local391 = 15;
					local387 = new Class24_Sub3_Sub6(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg4, local55 + arg4 - 1, arg0, arg0 + local58 - 1, arg1, arg6, arg8);
				}
				@Pc(436) Class24_Sub3 local436 = Static106.method1867(arg5, arg4, arg0, rj.class);
				@Pc(438) boolean local438 = false;
				if (local436 instanceof Class24_Sub3_Sub3 && local436.aShort107 == arg4 && local436.aShort105 == arg0) {
					((Class24_Sub3_Sub3) local436).aClass24_Sub3_2 = local387;
					local438 = true;
				}
				if (local438 || Static10.method119(local387, false)) {
					if (local352 != null && local352.method5701()) {
						local352.method5699(arg7);
					}
					if (local34.aBoolean246 && Static142.aBoolean211) {
						if (local391 > 30) {
							local391 = 30;
						}
						for (@Pc(483) int local483 = 0; local483 <= local55; local483++) {
							for (@Pc(487) int local487 = 0; local487 <= local58; local487++) {
								local130.qa(local483 + arg4, local487 + arg0, local391);
							}
						}
					}
				}
				if (local34.anInt3791 != 0 && arg2 != null) {
					arg2.method4873(local34.aBoolean247, local55, arg4, !local34.aBoolean250, arg0, local58);
				}
			} else {
				@Pc(630) Class24_Sub3 local630;
				if (arg1 >= 12 && arg1 <= 17 || arg1 >= 18 && arg1 <= 21) {
					if (local223) {
						local352 = new Class24_Sub3_Sub4(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg4, arg4 + local55 - 1, arg0, local58 + arg0 - 1, arg1, arg6, local189);
						if (local352.method5701()) {
							local352.method5699(arg7);
						}
						local387 = local352;
					} else {
						local387 = new Class24_Sub3_Sub6(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg4, arg4 + local55 - 1, arg0, arg0 + local58 - 1, arg1, arg6, arg8);
					}
					local630 = Static106.method1867(arg5, arg4, arg0, rj.class);
					if (local630 instanceof Class24_Sub3_Sub3 && arg4 == local630.aShort107 && local630.aShort105 == arg0) {
						((Class24_Sub3_Sub3) local630).aClass24_Sub3_2 = local387;
					} else {
						Static10.method119(local387, false);
					}
					if (Static142.aBoolean211 && !super.aBoolean213 && arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg5 > 0 && local34.anInt3772 != 0) {
						super.aByteArrayArrayArray13[arg5][arg4][arg0] = (byte) (super.aByteArrayArrayArray13[arg5][arg4][arg0] | 0x4);
					}
					if (local34.anInt3791 != 0 && arg2 != null) {
						arg2.method4873(local34.aBoolean247, local55, arg4, !local34.aBoolean250, arg0, local58);
					}
				} else {
					@Pc(760) Class24_Sub5 local760;
					if (arg1 == 0) {
						@Pc(733) int local733 = local34.anInt3772;
						if (Static342.aBoolean374 && local34.anInt3772 == -1) {
							local733 = 1;
						}
						if (local223) {
							@Pc(777) Class24_Sub5_Sub2 local777 = new Class24_Sub5_Sub2(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, arg1, arg6, local189);
							local760 = local777;
							if (local777.method5701()) {
								local777.method5699(arg7);
							}
						} else {
							local760 = new Class24_Sub5_Sub3(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg1, arg6, arg8);
						}
						@Pc(792) Class24_Sub5 local792 = Static96.method1755(arg5, arg4, arg0);
						if (local792 instanceof Class24_Sub5_Sub1) {
							((Class24_Sub5_Sub1) local792).aClass24_Sub5_3 = local760;
						} else {
							Static327.method3799(arg5, arg4, arg0, local760, null);
						}
						if (Static142.aBoolean211) {
							if (arg6 == 0) {
								if (local34.aBoolean246) {
									local130.qa(arg4, arg0, 50);
									local130.qa(arg4, arg0 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean213) {
									super.aByteArrayArrayArray13[arg5][arg4][arg0] = (byte) (super.aByteArrayArrayArray13[arg5][arg4][arg0] | 0x1);
								}
							} else if (arg6 == 1) {
								if (local34.aBoolean246) {
									local130.qa(arg4, arg0 + 1, 50);
									local130.qa(arg4 + 1, arg0 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean213) {
									super.aByteArrayArrayArray13[arg5][arg4][arg0 + 1] = (byte) (super.aByteArrayArrayArray13[arg5][arg4][arg0 + 1] | 0x2);
								}
							} else if (arg6 == 2) {
								if (local34.aBoolean246) {
									local130.qa(arg4 + 1, arg0, 50);
									local130.qa(arg4 + 1, arg0 + 1, 50);
								}
								if (local733 == 1 && !super.aBoolean213) {
									super.aByteArrayArrayArray13[arg5][arg4 + 1][arg0] = (byte) (super.aByteArrayArrayArray13[arg5][arg4 + 1][arg0] | 0x1);
								}
							} else if (arg6 == 3) {
								if (local34.aBoolean246) {
									local130.qa(arg4, arg0, 50);
									local130.qa(arg4 + 1, arg0, 50);
								}
								if (local733 == 1 && !super.aBoolean213) {
									super.aByteArrayArrayArray13[arg5][arg4][arg0] = (byte) (super.aByteArrayArrayArray13[arg5][arg4][arg0] | 0x2);
								}
							}
						}
						if (local34.anInt3791 != 0 && arg2 != null) {
							arg2.method4884(!local34.aBoolean250, arg0, arg4, arg1, arg6, local34.aBoolean247);
						}
						if (local34.anInt3770 != 16) {
							Static233.method3450(arg5, arg4, arg0, local34.anInt3770);
						}
					} else {
						@Pc(1080) Class24_Sub5_Sub2 local1080;
						@Pc(1063) Class24_Sub5 local1063;
						if (arg1 == 1) {
							if (local223) {
								local1080 = new Class24_Sub5_Sub2(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, arg1, arg6, local189);
								if (local1080.method5701()) {
									local1080.method5699(arg7);
								}
								local1063 = local1080;
							} else {
								local1063 = new Class24_Sub5_Sub3(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg1, arg6, arg8);
							}
							local760 = Static96.method1755(arg5, arg4, arg0);
							if (local760 instanceof Class24_Sub5_Sub1) {
								((Class24_Sub5_Sub1) local760).aClass24_Sub5_3 = local1063;
							} else {
								Static327.method3799(arg5, arg4, arg0, local1063, null);
							}
							if (local34.aBoolean246 && Static142.aBoolean211) {
								if (arg6 == 0) {
									local130.qa(arg4, arg0 + 1, 50);
								} else if (arg6 == 1) {
									local130.qa(arg4 + 1, arg0 + 1, 50);
								} else if (arg6 == 2) {
									local130.qa(arg4 + 1, arg0, 50);
								} else if (arg6 == 3) {
									local130.qa(arg4, arg0, 50);
								}
							}
							if (local34.anInt3791 != 0 && arg2 != null) {
								arg2.method4884(!local34.aBoolean250, arg0, arg4, arg1, arg6, local34.aBoolean247);
							}
						} else if (arg1 == 2) {
							local391 = arg6 + 1 & 0x3;
							if (local223) {
								@Pc(1250) Class24_Sub5_Sub2 local1250 = new Class24_Sub5_Sub2(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, arg1, arg6 + 4, local189);
								@Pc(1265) Class24_Sub5_Sub2 local1265 = new Class24_Sub5_Sub2(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, arg1, local391, local189);
								if (local1250.method5701()) {
									local1250.method5699(arg7);
								}
								local760 = local1265;
								if (local1265.method5701()) {
									local1265.method5699(arg7);
								}
								local1063 = local1250;
							} else {
								local1063 = new Class24_Sub5_Sub3(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg1, arg6 + 4, arg8);
								local760 = new Class24_Sub5_Sub3(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg1, local391, arg8);
							}
							Static327.method3799(arg5, arg4, arg0, local1063, local760);
							if (local34.anInt3772 == 1 && Static142.aBoolean211 && !super.aBoolean213) {
								if (arg6 == 0) {
									super.aByteArrayArrayArray13[arg5][arg4][arg0] = (byte) (super.aByteArrayArrayArray13[arg5][arg4][arg0] | 0x1);
									super.aByteArrayArrayArray13[arg5][arg4][arg0 + 1] = (byte) (super.aByteArrayArrayArray13[arg5][arg4][arg0 + 1] | 0x2);
								} else if (arg6 == 1) {
									super.aByteArrayArrayArray13[arg5][arg4][arg0 + 1] = (byte) (super.aByteArrayArrayArray13[arg5][arg4][arg0 + 1] | 0x2);
									super.aByteArrayArrayArray13[arg5][arg4 + 1][arg0] = (byte) (super.aByteArrayArrayArray13[arg5][arg4 + 1][arg0] | 0x1);
								} else if (arg6 == 2) {
									super.aByteArrayArrayArray13[arg5][arg4 + 1][arg0] = (byte) (super.aByteArrayArrayArray13[arg5][arg4 + 1][arg0] | 0x1);
									super.aByteArrayArrayArray13[arg5][arg4][arg0] = (byte) (super.aByteArrayArrayArray13[arg5][arg4][arg0] | 0x2);
								} else if (arg6 == 3) {
									super.aByteArrayArrayArray13[arg5][arg4][arg0] = (byte) (super.aByteArrayArrayArray13[arg5][arg4][arg0] | 0x2);
									super.aByteArrayArrayArray13[arg5][arg4][arg0] = (byte) (super.aByteArrayArrayArray13[arg5][arg4][arg0] | 0x1);
								}
							}
							if (local34.anInt3791 != 0 && arg2 != null) {
								arg2.method4884(!local34.aBoolean250, arg0, arg4, arg1, arg6, local34.aBoolean247);
							}
							if (local34.anInt3770 != 16) {
								Static233.method3450(arg5, arg4, arg0, local34.anInt3770);
							}
						} else if (arg1 == 3) {
							if (local223) {
								local1080 = new Class24_Sub5_Sub2(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, arg1, arg6, local189);
								local1063 = local1080;
								if (local1080.method5701()) {
									local1080.method5699(arg7);
								}
							} else {
								local1063 = new Class24_Sub5_Sub3(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg1, arg6, arg8);
							}
							local760 = Static96.method1755(arg5, arg4, arg0);
							if (local760 instanceof Class24_Sub5_Sub1) {
								((Class24_Sub5_Sub1) local760).aClass24_Sub5_3 = local1063;
							} else {
								Static327.method3799(arg5, arg4, arg0, local1063, null);
							}
							if (local34.aBoolean246 && Static142.aBoolean211) {
								if (arg6 == 0) {
									local130.qa(arg4, arg0 + 1, 50);
								} else if (arg6 == 1) {
									local130.qa(arg4 + 1, arg0 + 1, 50);
								} else if (arg6 == 2) {
									local130.qa(arg4 + 1, arg0, 50);
								} else if (arg6 == 3) {
									local130.qa(arg4, arg0, 50);
								}
							}
							if (local34.anInt3791 != 0 && arg2 != null) {
								arg2.method4884(!local34.aBoolean250, arg0, arg4, arg1, arg6, local34.aBoolean247);
							}
						} else if (arg1 == 9) {
							if (local223) {
								local352 = new Class24_Sub3_Sub4(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg4, arg4, arg0, arg0, arg1, arg6, local189);
								if (local352.method5701()) {
									local352.method5699(arg7);
								}
								local387 = local352;
							} else {
								local387 = new Class24_Sub3_Sub6(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg4, arg4 + local55 - 1, arg0, local58 + arg0 - 1, arg1, arg6, arg8);
							}
							local630 = Static106.method1867(arg5, arg4, arg0, rj.class);
							if (local630 instanceof Class24_Sub3_Sub3 && arg4 == local630.aShort107 && local630.aShort105 == arg0) {
								((Class24_Sub3_Sub3) local630).aClass24_Sub3_2 = local387;
							} else {
								Static10.method119(local387, false);
							}
							if (local34.anInt3791 != 0 && arg2 != null) {
								arg2.method4873(local34.aBoolean247, local55, arg4, !local34.aBoolean250, arg0, local58);
							}
							if (local34.anInt3770 != 16) {
								Static233.method3450(arg5, arg4, arg0, local34.anInt3770);
							}
						} else {
							@Pc(1831) Class24_Sub1 local1831;
							if (arg1 == 4) {
								if (local223) {
									@Pc(1829) Class24_Sub1_Sub3 local1829 = new Class24_Sub1_Sub3(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, 0, 0, 0, arg1, arg6);
									local1831 = local1829;
									if (local1829.method5701()) {
										local1829.method5699(arg7);
									}
								} else {
									local1831 = new Class24_Sub1_Sub1(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, 0, 0, 0, arg1, arg6, arg8);
								}
								@Pc(1865) Class24_Sub1 local1865 = Static137.method2391(arg5, arg4, arg0);
								if (local1865 instanceof Class24_Sub1_Sub2) {
									((Class24_Sub1_Sub2) local1865).aClass24_Sub1_3 = local1831;
								} else {
									Static267.method3810(arg5, arg4, arg0, local1831, null);
								}
							} else {
								@Pc(1885) int local1885;
								@Pc(1891) Interface10 local1891;
								@Pc(1930) Class24_Sub1_Sub3 local1930;
								@Pc(1974) Class24_Sub1 local1974;
								if (arg1 == 5) {
									local1885 = 17;
									local1891 = (Interface10) Static96.method1755(arg5, arg4, arg0);
									if (local1891 != null) {
										local1885 = Static342.aClass237_4.method5212(local1891.method5706()).anInt3770 + 1;
									}
									if (local223) {
										local1930 = new Class24_Sub1_Sub3(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, 0, Static287.anIntArray493[arg6] * local1885, Static51.anIntArray74[arg6] * local1885, arg1, arg6);
										local1831 = local1930;
										if (local1930.method5701()) {
											local1930.method5699(arg7);
										}
									} else {
										local1831 = new Class24_Sub1_Sub1(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, 0, Static287.anIntArray493[arg6] * local1885, Static51.anIntArray74[arg6] * local1885, arg1, arg6, arg8);
									}
									local1974 = Static137.method2391(arg5, arg4, arg0);
									if (local1974 instanceof Class24_Sub1_Sub2) {
										((Class24_Sub1_Sub2) local1974).aClass24_Sub1_3 = local1831;
									} else {
										Static267.method3810(arg5, arg4, arg0, local1831, null);
									}
								} else if (arg1 == 6) {
									local1885 = 9;
									local1891 = (Interface10) Static96.method1755(arg5, arg4, arg0);
									if (local1891 != null) {
										local1885 = Static342.aClass237_4.method5212(local1891.method5706()).anInt3770 / 2 + 1;
									}
									if (local223) {
										local1930 = new Class24_Sub1_Sub3(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, arg6, local1885 * Static287.anIntArray493[arg6], Static51.anIntArray74[arg6] * local1885, arg1, arg6 + 4);
										local1831 = local1930;
										if (local1930.method5701()) {
											local1930.method5699(arg7);
										}
									} else {
										local1831 = new Class24_Sub1_Sub1(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg6, local1885 * Static38.anIntArray57[arg6], Static243.anIntArray444[arg6] * local1885, arg1, arg6 + 4, arg8);
									}
									local1974 = Static137.method2391(arg5, arg4, arg0);
									if (local1974 instanceof Class24_Sub1_Sub2) {
										((Class24_Sub1_Sub2) local1974).aClass24_Sub1_3 = local1831;
									} else {
										Static267.method3810(arg5, arg4, arg0, local1831, null);
									}
								} else if (arg1 == 7) {
									local1885 = arg6 + 2 & 0x3;
									if (local223) {
										@Pc(2138) Class24_Sub1_Sub3 local2138 = new Class24_Sub1_Sub3(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, local1885, 0, 0, arg1, local1885 + 4);
										local1831 = local2138;
										if (local2138.method5701()) {
											local2138.method5699(arg7);
										}
									} else {
										local1831 = new Class24_Sub1_Sub1(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, local1885, 0, 0, arg1, local1885 + 4, arg8);
									}
									@Pc(2176) Class24_Sub1 local2176 = Static137.method2391(arg5, arg4, arg0);
									if (local2176 instanceof Class24_Sub1_Sub2) {
										((Class24_Sub1_Sub2) local2176).aClass24_Sub1_3 = local1831;
									} else {
										Static267.method3810(arg5, arg4, arg0, local1831, null);
									}
								} else if (arg1 == 8) {
									local391 = arg6 + 2 & 0x3;
									@Pc(2202) int local2202 = 9;
									@Pc(2208) Interface10 local2208 = (Interface10) Static96.method1755(arg5, arg4, arg0);
									if (local2208 != null) {
										local2202 = Static342.aClass237_4.method5212(local2208.method5706()).anInt3770 / 2 + 1;
									}
									@Pc(2253) Class24_Sub1 local2253;
									@Pc(2274) Class24_Sub1 local2274;
									if (local223) {
										local2253 = new Class24_Sub1_Sub3(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, arg6, local2202 * Static38.anIntArray57[arg6], local2202 * Static243.anIntArray444[arg6], arg1, arg6 + 4);
										local2274 = new Class24_Sub1_Sub3(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, arg6, 0, 0, arg1, local391 + 4);
										if (local2253.method5701()) {
											local2253.method5699(arg7);
										}
										if (local2274.method5701()) {
											local2274.method5699(arg7);
										}
									} else {
										local2253 = new Class24_Sub1_Sub1(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg6, Static38.anIntArray57[arg6] * local2202, local2202 * Static243.anIntArray444[arg6], arg1, arg6 + 4, arg8);
										local2274 = new Class24_Sub1_Sub1(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg6, 0, 0, arg1, local391 + 4, arg8);
									}
									Static267.method3810(arg5, arg4, arg0, local2253, local2274);
								}
							}
						}
					}
				}
			}
		} else if (Static361.aClass85_Sub1_1.aBoolean165 || local34.anInt3778 != 0 || local34.anInt3791 == 1 || local34.aBoolean251) {
			@Pc(286) Class24_Sub4 local286;
			if (local223) {
				@Pc(284) Class24_Sub4_Sub1 local284 = new Class24_Sub4_Sub1(arg7, local34, arg9, local169, local153, local177, super.aBoolean213, arg6, local189);
				local286 = local284;
				if (local284.method5701()) {
					local284.method5699(arg7);
				}
			} else {
				local286 = new Class24_Sub4_Sub2(arg7, local34, arg5, arg9, local169, local153, local177, super.aBoolean213, arg6, arg8);
			}
			@Pc(316) Class24_Sub4 local316 = Static447.method5138(arg5, arg4, arg0);
			if (local316 instanceof Class24_Sub4_Sub3) {
				((Class24_Sub4_Sub3) local316).aClass24_Sub4_2 = local286;
			} else {
				Static191.method3040(arg5, arg4, arg0, local286);
			}
			if (local34.anInt3791 == 1 && arg2 != null) {
				arg2.method4877(arg0, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!h", name = "a", descriptor = "(BLclient!za;)V")
	public void method2449(@OriginalArg(1) Class50 arg0) {
		Static361.method4858(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt2932 > 1) {
			for (local13 = 0; super.anInt2929 > local13; local13++) {
				for (local17 = 0; super.anInt2924 > local17; local17++) {
					if ((Static181.aByteArrayArrayArray15[1][local13][local17] & 0x2) == 2) {
						Static390.method5202(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; super.anInt2932 > local13; local13++) {
			for (local17 = 0; local17 <= super.anInt2924; local17++) {
				for (@Pc(61) int local61 = 0; local61 <= super.anInt2929; local61++) {
					@Pc(76) int local76;
					@Pc(78) int local78;
					@Pc(80) int local80;
					@Pc(105) int local105;
					@Pc(130) int local130;
					@Pc(221) int local221;
					@Pc(230) int local230;
					@Pc(250) int local250;
					@Pc(254) int local254;
					if ((super.aByteArrayArrayArray13[local13][local61][local17] & 0x1) != 0) {
						local76 = local17;
						local78 = local17;
						local80 = local13;
						while (super.anInt2924 > local78 && (super.aByteArrayArrayArray13[local13][local61][local78 + 1] & 0x1) != 0) {
							local78++;
						}
						local105 = local13;
						while (local76 > 0 && (super.aByteArrayArrayArray13[local13][local61][local76 - 1] & 0x1) != 0) {
							local76--;
						}
						label164: while (local80 > 0) {
							for (local130 = local76; local130 <= local78; local130++) {
								if ((super.aByteArrayArrayArray13[local80 - 1][local61][local130] & 0x1) == 0) {
									break label164;
								}
							}
							local80--;
						}
						label153: while (local105 < 3) {
							for (local130 = local76; local130 <= local78; local130++) {
								if ((super.aByteArrayArrayArray13[local105 + 1][local61][local130] & 0x1) == 0) {
									break label153;
								}
							}
							local105++;
						}
						local130 = (local105 + 1 - local80) * (local78 + 1 - local76);
						if (local130 >= 2) {
							local221 = super.anIntArrayArrayArray3[local105][local61][local76] - 240;
							local230 = super.anIntArrayArrayArray3[local80][local61][local76];
							Static7.method79(1, local61 << 7, local61 << 7, local76 << 7, (local78 << 7) + 128, local221, local230);
							for (local250 = local80; local250 <= local105; local250++) {
								for (local254 = local76; local254 <= local78; local254++) {
									super.aByteArrayArrayArray13[local250][local61][local254] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray13[local13][local61][local17] & 0x2) != 0) {
						local76 = local61;
						local78 = local61;
						local80 = local13;
						local105 = local13;
						while (super.anInt2929 > local78 && (super.aByteArrayArrayArray13[local13][local78 + 1][local17] & 0x2) != 0) {
							local78++;
						}
						while (local76 > 0 && (super.aByteArrayArrayArray13[local13][local76 - 1][local17] & 0x2) != 0) {
							local76--;
						}
						label218: while (local80 > 0) {
							for (local130 = local76; local130 <= local78; local130++) {
								if ((super.aByteArrayArrayArray13[local80 - 1][local130][local17] & 0x2) == 0) {
									break label218;
								}
							}
							local80--;
						}
						label207: while (local105 < 3) {
							for (local130 = local76; local130 <= local78; local130++) {
								if ((super.aByteArrayArrayArray13[local105 + 1][local130][local17] & 0x2) == 0) {
									break label207;
								}
							}
							local105++;
						}
						local130 = (local105 + 1 - local80) * ((local78 - local76) + 1);
						if (local130 >= 2) {
							local221 = super.anIntArrayArrayArray3[local105][local76][local17] - 240;
							local230 = super.anIntArrayArrayArray3[local80][local76][local17];
							Static7.method79(2, local76 << 7, (local78 << 7) + 128, local17 << 7, local17 << 7, local221, local230);
							for (local250 = local80; local250 <= local105; local250++) {
								for (local254 = local76; local254 <= local78; local254++) {
									super.aByteArrayArrayArray13[local250][local254][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray13[local13][local61][local17] & 0x4) != 0) {
						local76 = local61;
						local78 = local61;
						for (local80 = local17; local80 > 0 && (super.aByteArrayArrayArray13[local13][local61][local80 - 1] & 0x4) != 0; local80--) {
						}
						for (local105 = local17; super.anInt2924 > local105 && (super.aByteArrayArrayArray13[local13][local61][local105 + 1] & 0x4) != 0; local105++) {
						}
						label271: while (local76 > 0) {
							for (local130 = local80; local130 <= local105; local130++) {
								if ((super.aByteArrayArrayArray13[local13][local76 - 1][local130] & 0x4) == 0) {
									break label271;
								}
							}
							local76--;
						}
						label260: while (local78 < super.anInt2929) {
							for (local130 = local80; local130 <= local105; local130++) {
								if ((super.aByteArrayArrayArray13[local13][local78 + 1][local130] & 0x4) == 0) {
									break label260;
								}
							}
							local78++;
						}
						if ((local105 + 1 - local80) * (local78 + -local76 - -1) >= 4) {
							local130 = super.anIntArrayArrayArray3[local13][local76][local80];
							Static7.method79(4, local76 << 7, (local78 << 7) + 128, local80 << 7, (local105 << 7) + 128, local130, local130);
							for (@Pc(688) int local688 = local76; local688 <= local78; local688++) {
								for (local221 = local80; local221 <= local105; local221++) {
									super.aByteArrayArrayArray13[local13][local688][local221] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray13 = null;
	}
}
