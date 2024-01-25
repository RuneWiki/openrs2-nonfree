import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!gl", name = "L", descriptor = "I")
	public int anInt3648 = 99;

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(IIIZ)V")
	public Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static109.aClass59_4, Static116.aClass173_4);
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IZLclient!r;I[B[Lclient!wd;)V")
	public void method3005(@OriginalArg(0) int arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class355[] arg4) {
		@Pc(10) Class2_Sub15 local10 = new Class2_Sub15(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(32) int local32 = local10.method4340();
			if (local32 == 0) {
				return;
			}
			local12 += local32;
			@Pc(43) int local43 = 0;
			while (true) {
				@Pc(47) int local47 = local10.method4328();
				if (local47 == 0) {
					break;
				}
				local43 += local47 - 1;
				@Pc(59) int local59 = local43 & 0x3F;
				@Pc(65) int local65 = local43 >> 6 & 0x3F;
				@Pc(69) int local69 = local43 >> 12;
				@Pc(73) int local73 = local10.method4325();
				@Pc(77) int local77 = local73 >> 2;
				@Pc(81) int local81 = local73 & 0x3;
				@Pc(85) int local85 = arg0 + local65;
				@Pc(89) int local89 = arg2 + local59;
				if (local85 > 0 && local89 > 0 && super.anInt3632 - 1 > local85 && super.anInt3639 - 1 > local89) {
					@Pc(111) Class355 local111 = null;
					if (!super.aBoolean301) {
						@Pc(116) int local116 = local69;
						if ((Static521.aByteArrayArrayArray45[1][local85][local89] & 0x2) == 2) {
							local116 = local69 - 1;
						}
						if (local116 >= 0) {
							local111 = arg4[local116];
						}
					}
					this.method3013(local81, local111, local77, arg1, -1, local69, local12, local89, local69, local85);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!wd;IIIILclient!r;)V")
	public void method3006(@OriginalArg(0) int arg0, @OriginalArg(1) Class355 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class100 arg5) {
		@Pc(5) Interface24 local5 = null;
		if (arg3 == 0) {
			local5 = (Interface24) Static353.method5256(arg2, arg0, arg4);
		}
		if (arg3 == 1) {
			local5 = (Interface24) Static122.method1787(arg2, arg0, arg4);
		}
		if (arg3 == 2) {
			local5 = (Interface24) Static224.method3516(arg2, arg0, arg4, vda.class);
		}
		if (arg3 == 3) {
			local5 = (Interface24) Static317.method4928(arg2, arg0, arg4);
		}
		if (local5 == null) {
			return;
		}
		@Pc(67) Class32 local67 = Static541.aClass97_4.method1794(local5.method7337());
		@Pc(71) int local71 = local5.method7336();
		@Pc(75) int local75 = local5.method7340();
		if (local67.method550()) {
			Static495.method6920(arg4, arg2, arg0, local67);
		}
		if (local5.method7339()) {
			local5.method7338(arg5);
		}
		if (arg3 != 0) {
			if (arg3 == 1) {
				Static292.method4380(arg2, arg0, arg4);
			} else if (arg3 == 2) {
				Static551.method7472(arg2, arg0, arg4, vda.class);
				if (local67.anInt803 != 0 && local67.anInt788 + arg0 < super.anInt3632 && local67.anInt788 + arg4 < super.anInt3639 && local67.anInt793 + arg0 < super.anInt3632 && arg4 + local67.anInt793 < super.anInt3639) {
					arg1.method7817(local67.anInt793, local75, local67.anInt788, local67.aBoolean53, arg0, !local67.aBoolean41, arg4);
					return;
				}
			} else {
				if (arg3 == 3) {
					Static339.method2373(arg2, arg0, arg4);
					if (local67.anInt803 == 1) {
						arg1.method7820(arg0, arg4);
						return;
					}
				}
				return;
			}
			return;
		}
		Static36.method636(arg2, arg0, arg4);
		if (local67.anInt803 != 0) {
			arg1.method7818(!local67.aBoolean41, local71, arg4, arg0, local67.aBoolean53, local75);
		}
		if (local67.anInt813 != 1) {
			return;
		}
		if (local75 != 0) {
			if (local75 == 1) {
				Static45.method783(arg4 + 1, arg0, 2, arg2);
				return;
			}
			if (local75 == 2) {
				Static45.method783(arg4, arg0 + 1, 1, arg2);
			} else if (local75 == 3) {
				Static45.method783(arg4, arg0, 2, arg2);
				return;
			}
			return;
		}
		Static45.method783(arg4, arg0, 1, arg2);
		return;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZBLclient!r;)V")
	public void method3008(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class100 arg1) {
		Static237.method6643();
		if (!arg0) {
			@Pc(16) int local16;
			@Pc(20) int local20;
			if (super.anInt3634 > 1) {
				for (local16 = 0; local16 < super.anInt3632; local16++) {
					for (local20 = 0; local20 < super.anInt3639; local20++) {
						if ((Static521.aByteArrayArrayArray45[1][local16][local20] & 0x2) == 2) {
							Static208.method3345(local16, local20);
						}
					}
				}
			}
			for (local16 = 0; local16 < super.anInt3634; local16++) {
				for (local20 = 0; local20 <= super.anInt3639; local20++) {
					for (@Pc(60) int local60 = 0; local60 <= super.anInt3632; local60++) {
						if ((super.aByteArrayArrayArray27[local16][local60][local20] & 0x4) != 0) {
							@Pc(75) int local75 = local60;
							@Pc(77) int local77 = local60;
							@Pc(79) int local79 = local20;
							@Pc(81) int local81 = local20;
							while (local79 > 0 && (super.aByteArrayArrayArray27[local16][local60][local79 - 1] & 0x4) != 0 && local20 - local79 < 10) {
								local79--;
							}
							while (local81 < super.anInt3639 && (super.aByteArrayArrayArray27[local16][local60][local81 + 1] & 0x4) != 0 && local81 - local79 < 10) {
								local81++;
							}
							@Pc(142) int local142;
							label111: while (local75 > 0 && local60 - local75 < 10) {
								for (local142 = local79; local142 <= local81; local142++) {
									if ((super.aByteArrayArrayArray27[local16][local75 - 1][local142] & 0x4) == 0) {
										break label111;
									}
								}
								local75--;
							}
							label98: while (super.anInt3632 > local77 && local77 - local75 < 10) {
								for (local142 = local79; local142 <= local81; local142++) {
									if ((super.aByteArrayArrayArray27[local16][local77 + 1][local142] & 0x4) == 0) {
										break label98;
									}
								}
								local77++;
							}
							if ((local77 + 1 - local75) * (local81 + (1 - local79)) >= 4) {
								local142 = super.anIntArrayArrayArray17[local16][local75][local79];
								Static564.method7658(local75 << 9, local16, (local81 << 9) + 512, local79 << 9, (local77 << 9) + 512, local142, local142);
								for (@Pc(268) int local268 = local75; local268 <= local77; local268++) {
									for (@Pc(272) int local272 = local79; local272 <= local81; local272++) {
										super.aByteArrayArrayArray27[local16][local268][local272] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static441.method6376();
		}
		super.aByteArrayArrayArray27 = null;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(Lclient!r;ILclient!es;[III)V")
	public void method3009(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub15 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean301) {
			return;
		}
		@Pc(22) boolean local22 = false;
		@Pc(24) Class216 local24 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		while (true) {
			@Pc(37) int local37;
			@Pc(56) int local56;
			@Pc(268) int local268;
			@Pc(272) int local272;
			@Pc(60) int local60;
			while (arg2.aByteArray62.length > arg2.anInt5241) {
				local37 = arg2.method4325();
				if (local37 == 0) {
					local24 = new Class216(arg2);
				} else {
					@Pc(108) int local108;
					@Pc(116) int local116;
					@Pc(120) int local120;
					if (local37 == 1) {
						local56 = arg2.method4325();
						if (local56 > 0) {
							for (local60 = 0; local60 < local56; local60++) {
								@Pc(69) Class265 local69 = new Class265(arg0, arg2, 2);
								if (local69.anInt7291 == 31) {
									@Pc(82) Class75 local82 = Static317.aClass41_1.method790(arg2.method4294());
									local69.method6112(local82.anInt1845, local82.anInt1844, local82.anInt1846, local82.anInt1841);
								}
								if (arg0.method6185() > 0) {
									@Pc(99) Class2_Sub14 local99 = local69.aClass2_Sub14_3;
									local108 = local99.method7694() + (arg4 << 9);
									local116 = local99.method7693() + (arg1 << 9);
									local120 = local108 >> 9;
									@Pc(124) int local124 = local116 >> 9;
									if (local120 >= 0 && local124 >= 0 && super.anInt3632 > local120 && local124 < super.anInt3639) {
										local99.method7690(local108, local116, super.anIntArrayArrayArray17[local69.anInt7293][local120][local124] - local99.method7696());
										Static417.method6035(local69);
									}
								}
							}
						}
					} else if (local37 == 2) {
						if (local24 == null) {
							local24 = new Class216();
						}
						local24.method5009(arg2);
					} else if (local37 != 128) {
						if (local37 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray28 == null) {
							super.aByteArrayArrayArray28 = new byte[4][][];
						}
						for (local56 = 0; local56 < 4; local56++) {
							@Pc(259) byte local259 = arg2.method4304();
							if (local259 == 0 && super.aByteArrayArrayArray28[local56] != null) {
								local268 = arg4;
								local272 = arg4 + 64;
								local108 = arg1;
								if (arg4 < 0) {
									local268 = 0;
								} else if (arg4 >= super.anInt3632) {
									local268 = super.anInt3632;
								}
								if (arg1 < 0) {
									local108 = 0;
								} else if (arg1 >= super.anInt3639) {
									local108 = super.anInt3639;
								}
								if (local272 < 0) {
									local272 = 0;
								} else if (super.anInt3632 <= local272) {
									local272 = super.anInt3632;
								}
								local116 = arg1 + 64;
								if (local116 < 0) {
									local116 = 0;
								} else if (super.anInt3639 <= local116) {
									local116 = super.anInt3639;
								}
								while (local268 < local272) {
									while (local108 < local116) {
										super.aByteArrayArrayArray28[local56][local268][local108] = 0;
										local108++;
									}
									local268++;
								}
							} else if (local259 == 1) {
								if (super.aByteArrayArrayArray28[local56] == null) {
									super.aByteArrayArrayArray28[local56] = new byte[super.anInt3632 + 1][super.anInt3639 + 1];
								}
								for (local268 = 0; local268 < 64; local268 += 4) {
									for (local272 = 0; local272 < 64; local272 += 4) {
										@Pc(408) byte local408 = arg2.method4304();
										for (local116 = arg4 + local268; local116 < arg4 + local268 + 4; local116++) {
											for (local120 = local272 + arg1; local120 < arg1 + local272 + 4; local120++) {
												if (local116 >= 0 && local116 < super.anInt3632 && local120 >= 0 && super.anInt3639 > local120) {
													super.aByteArrayArrayArray28[local56][local116][local120] = local408;
												}
											}
										}
									}
								}
							} else if (local259 == 2) {
								if (super.aByteArrayArrayArray28[local56] == null) {
									super.aByteArrayArrayArray28[local56] = new byte[super.anInt3632 + 1][super.anInt3639 + 1];
								}
								if (local56 > 0) {
									local268 = arg4;
									local272 = arg4 + 64;
									local108 = arg1;
									if (local272 < 0) {
										local272 = 0;
									} else if (super.anInt3632 <= local272) {
										local272 = super.anInt3632;
									}
									if (arg4 < 0) {
										local268 = 0;
									} else if (super.anInt3632 <= arg4) {
										local268 = super.anInt3632;
									}
									if (arg1 < 0) {
										local108 = 0;
									} else if (super.anInt3639 <= arg1) {
										local108 = super.anInt3639;
									}
									local116 = arg1 + 64;
									if (local116 < 0) {
										local116 = 0;
									} else if (super.anInt3639 <= local116) {
										local116 = super.anInt3639;
									}
									while (local272 > local268) {
										while (local108 < local116) {
											super.aByteArrayArrayArray28[local56][local268][local108] = super.aByteArrayArrayArray28[local56 - 1][local268][local108];
											local108++;
										}
										local268++;
									}
								}
							}
						}
						local22 = true;
					} else if (arg3 == null) {
						arg2.anInt5241 += 10;
					} else {
						arg3[0] = arg2.method4294();
						arg3[1] = arg2.method4334();
						arg3[2] = arg2.method4334();
						arg3[3] = arg2.method4334();
						arg3[4] = arg2.method4294();
					}
				}
			}
			if (local24 != null) {
				for (local37 = 0; local37 < 8; local37++) {
					for (local56 = 0; local56 < 8; local56++) {
						local60 = local37 + (arg4 >> 3);
						local268 = local56 + (arg1 >> 3);
						if (local60 >= 0 && local60 < super.anInt3632 >> 3 && local268 >= 0 && local268 < super.anInt3639 >> 3) {
							Static153.method2485(local60, local268, local24);
						}
					}
				}
			}
			if (!local22 && super.aByteArrayArrayArray28 != null) {
				for (local37 = 0; local37 < 4; local37++) {
					if (super.aByteArrayArrayArray28[local37] != null) {
						for (local56 = 0; local56 < 16; local56++) {
							for (local60 = 0; local60 < 16; local60++) {
								local268 = local56 + (arg4 >> 2);
								local272 = local60 + (arg1 >> 2);
								if (local268 >= 0 && local268 < 26 && local272 >= 0 && local272 < 26) {
									super.aByteArrayArrayArray28[local37][local268][local272] = 0;
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

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!r;I[Lclient!wd;II[BIIII)V")
	public void method3010(@OriginalArg(0) int arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(3) Class355[] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) byte[] arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(13) Class2_Sub15 local13 = new Class2_Sub15(arg5);
		@Pc(15) int local15 = -1;
		while (true) {
			@Pc(19) int local19 = local13.method4340();
			if (local19 == 0) {
				return;
			}
			local15 += local19;
			@Pc(30) int local30 = 0;
			while (true) {
				@Pc(34) int local34 = local13.method4328();
				if (local34 == 0) {
					break;
				}
				local30 += local34 - 1;
				@Pc(49) int local49 = local30 & 0x3F;
				@Pc(55) int local55 = local30 >> 6 & 0x3F;
				@Pc(59) int local59 = local30 >> 12;
				@Pc(63) int local63 = local13.method4325();
				@Pc(67) int local67 = local63 >> 2;
				@Pc(71) int local71 = local63 & 0x3;
				if (arg3 == local59 && local55 >= arg4 && local55 < arg4 + 8 && local49 >= arg9 && arg9 + 8 > local49) {
					@Pc(115) Class32 local115 = Static541.aClass97_4.method1794(local15);
					@Pc(132) int local132 = Static31.method562(arg8, local115.anInt793, local49 & 0x7, local55 & 0x7, local115.anInt788, local71) + arg6;
					@Pc(150) int local150 = arg7 + Static309.method4627(local55 & 0x7, local49 & 0x7, arg8, local71, local115.anInt788, local115.anInt793);
					if (local132 > 0 && local150 > 0 && local132 < super.anInt3632 - 1 && local150 < super.anInt3639 - 1) {
						@Pc(175) Class355 local175 = null;
						if (!super.aBoolean301) {
							@Pc(180) int local180 = arg0;
							if ((Static521.aByteArrayArrayArray45[1][local132][local150] & 0x2) == 2) {
								local180 = arg0 - 1;
							}
							if (local180 >= 0) {
								local175 = arg2[local180];
							}
						}
						this.method3013(local71 + arg8 & 0x3, local175, local67, arg1, -1, arg0, local15, local150, arg0, local132);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "([ILclient!r;IZIIIIIILclient!es;)V")
	public void method3012(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class100 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class2_Sub15 arg9) {
		if (super.aBoolean301) {
			return;
		}
		@Pc(29) Class216 local29 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		@Pc(41) int local41 = (arg5 & 0x7) * 8;
		@Pc(47) int local47 = (arg2 & 0x7) * 8;
		while (true) {
			@Pc(52) int local52;
			@Pc(104) int local104;
			@Pc(143) int local143;
			@Pc(430) int local430;
			while (arg9.aByteArray62.length > arg9.anInt5241) {
				local52 = arg9.method4325();
				if (local52 == 0) {
					local29 = new Class216(arg9);
				} else {
					@Pc(162) int local162;
					@Pc(166) int local166;
					@Pc(204) int local204;
					@Pc(282) int local282;
					if (local52 == 1) {
						local104 = arg9.method4325();
						if (local104 > 0) {
							for (local430 = 0; local430 < local104; local430++) {
								@Pc(439) Class265 local439 = new Class265(arg1, arg9, 2);
								if (local439.anInt7291 == 31) {
									@Pc(452) Class75 local452 = Static317.aClass41_1.method790(arg9.method4294());
									local439.method6112(local452.anInt1845, local452.anInt1844, local452.anInt1846, local452.anInt1841);
								}
								if (arg1.method6185() > 0) {
									@Pc(472) Class2_Sub14 local472 = local439.aClass2_Sub14_3;
									local282 = local472.method7694() >> 9;
									local162 = local472.method7693() >> 9;
									if (local439.anInt7293 == arg7 && local41 <= local282 && local282 < local41 + 8 && local47 <= local162 && local47 + 8 > local162) {
										local166 = (arg4 << 9) + Static158.method2596(local472.method7693() & 0xFFF, local472.method7694() & 0xFFF, arg3);
										local204 = Static350.method5214(local472.method7693() & 0xFFF, arg3, local472.method7694() & 0xFFF) + (arg6 << 9);
										local282 = local166 >> 9;
										local162 = local204 >> 9;
										if (local282 >= 0 && local162 >= 0 && super.anInt3632 > local282 && local162 < super.anInt3639) {
											local472.method7690(local166, local204, super.anIntArrayArrayArray17[arg7][local282][local162] - local472.method7696());
											Static417.method6035(local439);
										}
									}
								}
							}
						}
					} else if (local52 == 2) {
						if (local29 == null) {
							local29 = new Class216();
						}
						local29.method5009(arg9);
					} else if (local52 != 128) {
						if (local52 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray28 == null) {
							super.aByteArrayArrayArray28 = new byte[4][][];
						}
						for (local104 = 0; local104 < 4; local104++) {
							@Pc(110) byte local110 = arg9.method4304();
							@Pc(147) int local147;
							if (local110 == 0 && super.aByteArrayArrayArray28[arg8] != null) {
								if (local104 <= arg7) {
									local143 = arg4;
									local147 = arg4 + 7;
									local282 = arg6;
									local162 = arg6 + 7;
									if (local147 < 0) {
										local147 = 0;
									} else if (super.anInt3632 <= local147) {
										local147 = super.anInt3632;
									}
									if (arg6 < 0) {
										local282 = 0;
									} else if (super.anInt3639 <= arg6) {
										local282 = super.anInt3639;
									}
									if (arg4 < 0) {
										local143 = 0;
									} else if (super.anInt3632 <= arg4) {
										local143 = super.anInt3632;
									}
									if (local162 < 0) {
										local162 = 0;
									} else if (local162 >= super.anInt3639) {
										local162 = super.anInt3639;
									}
									while (local147 > local143) {
										while (local162 > local282) {
											super.aByteArrayArrayArray28[arg8][local143][local282] = 0;
											local282++;
										}
										local143++;
									}
								}
							} else if (local110 == 1) {
								if (super.aByteArrayArrayArray28[arg8] == null) {
									super.aByteArrayArrayArray28[arg8] = new byte[super.anInt3632 + 1][super.anInt3639 + 1];
								}
								for (local143 = 0; local143 < 64; local143 += 4) {
									for (local147 = 0; local147 < 64; local147 += 4) {
										@Pc(153) byte local153 = arg9.method4304();
										if (local104 <= arg7) {
											for (local162 = local143; local162 < local143 + 4; local162++) {
												for (local166 = local147; local166 < local147 + 4; local166++) {
													if (local41 <= local162 && local41 + 8 > local162 && local47 <= local166 && local47 + 8 > local47) {
														local204 = arg4 + Static475.method6744(local166 & 0x7, arg3, local162 & 0x7);
														@Pc(216) int local216 = arg6 + Static529.method7843(local162 & 0x7, arg3, local166 & 0x7);
														if (local204 >= 0 && super.anInt3632 > local204 && local216 >= 0 && super.anInt3639 > local216) {
															super.aByteArrayArrayArray28[arg8][local204][local216] = local153;
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
						arg9.anInt5241 += 10;
					} else {
						arg0[0] = arg9.method4294();
						arg0[1] = arg9.method4334();
						arg0[2] = arg9.method4334();
						arg0[3] = arg9.method4334();
						arg0[4] = arg9.method4294();
					}
				}
			}
			if (local29 != null) {
				Static153.method2485(arg4 >> 3, arg6 >> 3, local29);
			}
			if (super.aByteArrayArrayArray28 != null && super.aByteArrayArrayArray28[arg8] != null) {
				local52 = arg4 + 7;
				local104 = arg6 + 7;
				for (local430 = arg4; local430 < local52; local430++) {
					for (local143 = arg6; local143 < local104; local143++) {
						super.aByteArrayArrayArray28[arg8][local430][local143] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ILclient!wd;ILclient!r;IIIIIII)V")
	public void method3013(@OriginalArg(0) int arg0, @OriginalArg(1) Class355 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846) && !Static199.method3279(arg5, Static426.anInt7278, arg9, arg7)) {
			return;
		}
		if (this.anInt3648 > arg8) {
			this.anInt3648 = arg8;
		}
		@Pc(34) Class32 local34 = Static541.aClass97_4.method1794(arg6);
		if (arg3.method6194() && Static72.aClass2_Sub12_Sub1_1.aBoolean150 && local34.aBoolean45) {
			return;
		}
		@Pc(63) int local63;
		@Pc(60) int local60;
		if (arg0 == 1 || arg0 == 3) {
			local60 = local34.anInt788;
			local63 = local34.anInt793;
		} else {
			local60 = local34.anInt793;
			local63 = local34.anInt788;
		}
		@Pc(83) int local83;
		@Pc(81) int local81;
		if (arg9 + local63 > super.anInt3632) {
			local81 = arg9 + 1;
			local83 = arg9;
		} else {
			local83 = (local63 >> 1) + arg9;
			local81 = (local63 + 1 >> 1) + arg9;
		}
		@Pc(112) int local112;
		@Pc(120) int local120;
		if (super.anInt3639 >= arg7 + local60) {
			local112 = (local60 >> 1) + arg7;
			local120 = (local60 + 1 >> 1) + arg7;
		} else {
			local120 = arg7 + 1;
			local112 = arg7;
		}
		@Pc(132) Class67 local132 = Static421.aClass67Array7[arg5];
		@Pc(159) int local159 = local132.method6707(local112, local83) + local132.method6707(local112, local81) + local132.method6707(local120, local83) + local132.method6707(local120, local81) >> 2;
		@Pc(167) int local167 = (arg9 << 9) + (local63 << 8);
		@Pc(176) int local176 = (arg7 << 9) + (local60 << 8);
		@Pc(188) boolean local188 = Static388.aBoolean530 && !super.aBoolean301 && local34.aBoolean51;
		if (local34.method550()) {
			Static276.method3101(null, local34, arg0, null, arg9, arg7, arg8);
		}
		@Pc(223) boolean local223 = arg4 == -1 && local34.anInt816 == -1 && local34.anIntArray48 == null && local34.anIntArray50 == null && !local34.aBoolean42;
		if (Static226.aBoolean391 && (Static87.method1360(arg2) && local34.anInt813 != 1 || !(!Static301.method4542(arg2) || local34.anInt813 != 0))) {
			return;
		}
		if (arg2 != 22) {
			@Pc(377) Class6_Sub1_Sub1 local377;
			@Pc(338) Class6_Sub1_Sub1_Sub4 local338;
			@Pc(375) int local375;
			@Pc(436) int local436;
			if (arg2 == 10 || arg2 == 11) {
				local338 = null;
				if (local223) {
					@Pc(369) Class6_Sub1_Sub1_Sub4 local369 = new Class6_Sub1_Sub1_Sub4(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg9, local63 + arg9 - 1, arg7, arg7 + local60 - 1, arg2, arg0, local188);
					local338 = local369;
					local375 = local369.method4998();
					local377 = local369;
				} else {
					local375 = 15;
					local377 = new Class6_Sub1_Sub1_Sub3(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg9, local63 + arg9 - 1, arg7, local60 + arg7 - 1, arg2, arg0, arg4);
				}
				if (Static516.method7139(local377, false)) {
					if (local338 != null && local338.method7339()) {
						local338.method7335(arg3);
					}
					if (local34.aBoolean48 && Static388.aBoolean530) {
						if (local375 > 30) {
							local375 = 30;
						}
						for (local436 = 0; local436 <= local63; local436++) {
							for (@Pc(440) int local440 = 0; local440 <= local60; local440++) {
								local132.a(local436 + arg9, local440 + arg7, local375);
							}
						}
					}
				}
				if (local34.anInt803 != 0 && arg1 != null) {
					arg1.method7816(local63, local34.aBoolean53, local60, arg9, !local34.aBoolean41, arg7);
				}
			} else if ((arg2 < 12 || arg2 > 17) && (arg2 < 18 || arg2 > 21)) {
				@Pc(675) Class6_Sub1_Sub3 local675;
				if (arg2 == 0) {
					@Pc(646) int local646 = local34.anInt813;
					if (Static487.aBoolean645 && local34.anInt813 == -1) {
						local646 = 1;
					}
					if (local223) {
						@Pc(673) Class6_Sub1_Sub3_Sub1 local673 = new Class6_Sub1_Sub3_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg2, arg0, local188);
						local675 = local673;
						if (local673.method7339()) {
							local673.method7335(arg3);
						}
					} else {
						local675 = new Class6_Sub1_Sub3_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg2, arg0, arg4);
					}
					Static122.method1784(arg8, arg9, arg7, local675, null);
					if (arg0 == 0) {
						if (Static388.aBoolean530 && local34.aBoolean48) {
							local132.a(arg9, arg7, 50);
							local132.a(arg9, arg7 + 1, 50);
						}
						if (local646 == 1 && !super.aBoolean301) {
							Static395.method5767(1, local34.anInt809, arg7, arg9, arg8, local34.anInt789);
						}
					} else if (arg0 == 1) {
						if (Static388.aBoolean530 && local34.aBoolean48) {
							local132.a(arg9, arg7 + 1, 50);
							local132.a(arg9 + 1, arg7 + 1, 50);
						}
						if (local646 == 1 && !super.aBoolean301) {
							Static395.method5767(2, local34.anInt809, arg7 + 1, arg9, arg8, -local34.anInt789);
						}
					} else if (arg0 == 2) {
						if (Static388.aBoolean530 && local34.aBoolean48) {
							local132.a(arg9 + 1, arg7, 50);
							local132.a(arg9 + 1, arg7 + 1, 50);
						}
						if (local646 == 1 && !super.aBoolean301) {
							Static395.method5767(1, local34.anInt809, arg7, arg9 + 1, arg8, -local34.anInt789);
						}
					} else if (arg0 == 3) {
						if (Static388.aBoolean530 && local34.aBoolean48) {
							local132.a(arg9, arg7, 50);
							local132.a(arg9 + 1, arg7, 50);
						}
						if (local646 == 1 && !super.aBoolean301) {
							Static395.method5767(2, local34.anInt809, arg7, arg9, arg8, local34.anInt789);
						}
					}
					if (local34.anInt803 != 0 && arg1 != null) {
						arg1.method7813(local34.aBoolean53, arg2, arg7, arg9, !local34.aBoolean41, arg0);
					}
					if (local34.anInt812 != 64) {
						Static149.method2446(arg8, arg9, arg7, local34.anInt812);
					}
				} else {
					@Pc(956) Class6_Sub1_Sub3_Sub1 local956;
					@Pc(938) Class6_Sub1_Sub3 local938;
					if (arg2 == 1) {
						if (local223) {
							local956 = new Class6_Sub1_Sub3_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg2, arg0, local188);
							local938 = local956;
							if (local956.method7339()) {
								local956.method7335(arg3);
							}
						} else {
							local938 = new Class6_Sub1_Sub3_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg2, arg0, arg4);
						}
						Static122.method1784(arg8, arg9, arg7, local938, null);
						if (local34.aBoolean48 && Static388.aBoolean530) {
							if (arg0 == 0) {
								local132.a(arg9, arg7 + 1, 50);
							} else if (arg0 == 1) {
								local132.a(arg9 + 1, arg7 + 1, 50);
							} else if (arg0 == 2) {
								local132.a(arg9 + 1, arg7, 50);
							} else if (arg0 == 3) {
								local132.a(arg9, arg7, 50);
							}
						}
						if (local34.anInt803 != 0 && arg1 != null) {
							arg1.method7813(local34.aBoolean53, arg2, arg7, arg9, !local34.aBoolean41, arg0);
						}
					} else if (arg2 == 2) {
						local375 = arg0 + 1 & 0x3;
						if (local223) {
							@Pc(1076) Class6_Sub1_Sub3_Sub1 local1076 = new Class6_Sub1_Sub3_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg2, arg0 + 4, local188);
							@Pc(1092) Class6_Sub1_Sub3_Sub1 local1092 = new Class6_Sub1_Sub3_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg2, local375, local188);
							if (local1076.method7339()) {
								local1076.method7335(arg3);
							}
							local675 = local1092;
							if (local1092.method7339()) {
								local1092.method7335(arg3);
							}
							local938 = local1076;
						} else {
							local938 = new Class6_Sub1_Sub3_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg2, arg0 + 4, arg4);
							local675 = new Class6_Sub1_Sub3_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg2, local375, arg4);
						}
						Static122.method1784(arg8, arg9, arg7, local938, local675);
						if ((local34.anInt813 == 1 || Static487.aBoolean645 && local34.anInt813 == -1) && !super.aBoolean301) {
							if (arg0 == 0) {
								Static395.method5767(1, local34.anInt809, arg7, arg9, arg8, local34.anInt789);
								Static395.method5767(2, local34.anInt809, arg7 + 1, arg9, arg8, local34.anInt789);
							} else if (arg0 == 1) {
								Static395.method5767(1, local34.anInt809, arg7, arg9 + 1, arg8, local34.anInt789);
								Static395.method5767(2, local34.anInt809, arg7 + 1, arg9, arg8, local34.anInt789);
							} else if (arg0 == 2) {
								Static395.method5767(1, local34.anInt809, arg7, arg9 + 1, arg8, local34.anInt789);
								Static395.method5767(2, local34.anInt809, arg7, arg9, arg8, local34.anInt789);
							} else if (arg0 == 3) {
								Static395.method5767(1, local34.anInt809, arg7, arg9, arg8, local34.anInt789);
								Static395.method5767(2, local34.anInt809, arg7, arg9, arg8, local34.anInt789);
							}
						}
						if (local34.anInt803 != 0 && arg1 != null) {
							arg1.method7813(local34.aBoolean53, arg2, arg7, arg9, !local34.aBoolean41, arg0);
						}
						if (local34.anInt812 != 64) {
							Static149.method2446(arg8, arg9, arg7, local34.anInt812);
						}
					} else if (arg2 == 3) {
						if (local223) {
							local956 = new Class6_Sub1_Sub3_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg2, arg0, local188);
							local938 = local956;
							if (local956.method7339()) {
								local956.method7335(arg3);
							}
						} else {
							local938 = new Class6_Sub1_Sub3_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg2, arg0, arg4);
						}
						Static122.method1784(arg8, arg9, arg7, local938, null);
						if (local34.aBoolean48 && Static388.aBoolean530) {
							if (arg0 == 0) {
								local132.a(arg9, arg7 + 1, 50);
							} else if (arg0 == 1) {
								local132.a(arg9 + 1, arg7 - -1, 50);
							} else if (arg0 == 2) {
								local132.a(arg9 + 1, arg7, 50);
							} else if (arg0 == 3) {
								local132.a(arg9, arg7, 50);
							}
						}
						if (local34.anInt803 != 0 && arg1 != null) {
							arg1.method7813(local34.aBoolean53, arg2, arg7, arg9, !local34.aBoolean41, arg0);
						}
					} else if (arg2 == 9) {
						if (local223) {
							local338 = new Class6_Sub1_Sub1_Sub4(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg9, arg9, arg7, arg7, arg2, arg0, local188);
							if (local338.method7339()) {
								local338.method7335(arg3);
							}
							local377 = local338;
						} else {
							local377 = new Class6_Sub1_Sub1_Sub3(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg9, arg9 + local63 - 1, arg7, arg7 + local60 - 1, arg2, arg0, arg4);
						}
						Static516.method7139(local377, false);
						if (local34.anInt803 != 0 && arg1 != null) {
							arg1.method7816(local63, local34.aBoolean53, local60, arg9, !local34.aBoolean41, arg7);
						}
						if (local34.anInt812 != 64) {
							Static149.method2446(arg8, arg9, arg7, local34.anInt812);
						}
					} else {
						@Pc(1579) Class6_Sub1_Sub5 local1579;
						if (arg2 == 4) {
							if (local223) {
								@Pc(1598) Class6_Sub1_Sub5_Sub2 local1598 = new Class6_Sub1_Sub5_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, 0, 0, arg2, arg0);
								local1579 = local1598;
								if (local1598.method7339()) {
									local1598.method7335(arg3);
								}
							} else {
								local1579 = new Class6_Sub1_Sub5_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, 0, 0, arg2, arg0, arg4);
							}
							Static93.method1456(arg8, arg9, arg7, local1579, null);
						} else {
							@Pc(1622) int local1622;
							@Pc(1628) Interface24 local1628;
							@Pc(1695) Class6_Sub1_Sub5_Sub2 local1695;
							if (arg2 == 5) {
								local1622 = 65;
								local1628 = (Interface24) Static353.method5256(arg8, arg9, arg7);
								if (local1628 != null) {
									local1622 = Static541.aClass97_4.method1794(local1628.method7337()).anInt812 + 1;
								}
								if (local223) {
									local1695 = new Class6_Sub1_Sub5_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, local1622 * Static249.anIntArray313[arg0], local1622 * Static481.anIntArray584[arg0], arg2, arg0);
									local1579 = local1695;
									if (local1695.method7339()) {
										local1695.method7335(arg3);
									}
								} else {
									local1579 = new Class6_Sub1_Sub5_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, local1622 * Static249.anIntArray313[arg0], Static481.anIntArray584[arg0] * local1622, arg2, arg0, arg4);
								}
								Static93.method1456(arg8, arg9, arg7, local1579, null);
							} else if (arg2 == 6) {
								local1622 = 33;
								local1628 = (Interface24) Static353.method5256(arg8, arg9, arg7);
								if (local1628 != null) {
									local1622 = Static541.aClass97_4.method1794(local1628.method7337()).anInt812 / 2 + 1;
								}
								if (local223) {
									local1695 = new Class6_Sub1_Sub5_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, Static249.anIntArray313[arg0] * local1622, local1622 * Static481.anIntArray584[arg0], arg2, arg0 + 4);
									if (local1695.method7339()) {
										local1695.method7335(arg3);
									}
									local1579 = local1695;
								} else {
									local1579 = new Class6_Sub1_Sub5_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, Static478.anIntArray580[arg0] * local1622, Static100.anIntArray107[arg0] * local1622, arg2, arg0 + 4, arg4);
								}
								Static93.method1456(arg8, arg9, arg7, local1579, null);
							} else if (arg2 == 7) {
								local1622 = arg0 + 2 & 0x3;
								if (local223) {
									@Pc(1849) Class6_Sub1_Sub5_Sub2 local1849 = new Class6_Sub1_Sub5_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, 0, 0, arg2, local1622 + 4);
									if (local1849.method7339()) {
										local1849.method7335(arg3);
									}
									local1579 = local1849;
								} else {
									local1579 = new Class6_Sub1_Sub5_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, 0, 0, arg2, local1622 + 4, arg4);
								}
								Static93.method1456(arg8, arg9, arg7, local1579, null);
							} else if (arg2 == 8) {
								local375 = arg0 + 2 & 0x3;
								local436 = 33;
								@Pc(1905) Interface24 local1905 = (Interface24) Static353.method5256(arg8, arg9, arg7);
								if (local1905 != null) {
									local436 = Static541.aClass97_4.method1794(local1905.method7337()).anInt812 / 2 + 1;
								}
								@Pc(1949) Class6_Sub1_Sub5 local1949;
								@Pc(1969) Class6_Sub1_Sub5 local1969;
								if (local223) {
									local1949 = new Class6_Sub1_Sub5_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, local436 * Static478.anIntArray580[arg0], local436 * Static100.anIntArray107[arg0], arg2, arg0 + 4);
									local1969 = new Class6_Sub1_Sub5_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, 0, 0, arg2, local375 + 4);
									if (local1949.method7339()) {
										local1949.method7335(arg3);
									}
									if (local1969.method7339()) {
										local1969.method7335(arg3);
									}
								} else {
									local1949 = new Class6_Sub1_Sub5_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, Static478.anIntArray580[arg0] * local436, local436 * Static100.anIntArray107[arg0], arg2, arg0 + 4, arg4);
									local1969 = new Class6_Sub1_Sub5_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, 0, 0, arg2, local375 + 4, arg4);
								}
								Static93.method1456(arg8, arg9, arg7, local1949, local1969);
							}
						}
					}
				}
			} else {
				if (local223) {
					local338 = new Class6_Sub1_Sub1_Sub4(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg9, arg9 + local63 - 1, arg7, arg7 + local60 - 1, arg2, arg0, local188);
					local377 = local338;
					if (local338.method7339()) {
						local338.method7335(arg3);
					}
				} else {
					local377 = new Class6_Sub1_Sub1_Sub3(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg9, local63 + arg9 - 1, arg7, local60 + arg7 - 1, arg2, arg0, arg4);
				}
				Static516.method7139(local377, false);
				if (Static388.aBoolean530 && !super.aBoolean301 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg8 > 0 && local34.anInt813 != 0) {
					super.aByteArrayArrayArray27[arg8][arg9][arg7] = (byte) (super.aByteArrayArrayArray27[arg8][arg9][arg7] | 0x4);
				}
				if (local34.anInt803 != 0 && arg1 != null) {
					arg1.method7816(local63, local34.aBoolean53, local60, arg9, !local34.aBoolean41, arg7);
				}
			}
		} else if (Static72.aClass2_Sub12_Sub1_1.aBoolean167 || local34.anInt807 != 0 || local34.anInt803 == 1 || local34.aBoolean44) {
			@Pc(284) Class6_Sub1_Sub2 local284;
			if (local223) {
				@Pc(282) Class6_Sub1_Sub2_Sub2 local282 = new Class6_Sub1_Sub2_Sub2(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg0, local188);
				local284 = local282;
				if (local282.method7339()) {
					local282.method7335(arg3);
				}
			} else {
				local284 = new Class6_Sub1_Sub2_Sub1(arg3, local34, arg8, arg5, local167, local159, local176, super.aBoolean301, arg0, arg4);
			}
			Static21.method421(arg8, arg9, arg7, local284);
			if (local34.anInt803 == 1 && arg1 != null) {
				arg1.method7809(arg7, arg9);
			}
		}
	}
}
