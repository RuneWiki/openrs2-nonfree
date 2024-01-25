import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public final class Class117_Sub1 extends Class117 {

	@OriginalMember(owner = "client!ir", name = "O", descriptor = "I")
	public int anInt2851 = 99;

	@OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(IIIZ)V")
	public Class117_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static125.aClass134_3, Static147.aClass210_3);
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIBLclient!np;[B[Lclient!ee;)V")
	public void method2440(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class155 arg2, @OriginalArg(4) byte[] arg3, @OriginalArg(5) Class67[] arg4) {
		@Pc(18) Class3_Sub5 local18 = new Class3_Sub5(arg3);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(26) int local26 = local18.method2777();
			if (local26 == 0) {
				return;
			}
			local20 += local26;
			@Pc(37) int local37 = 0;
			while (true) {
				@Pc(41) int local41 = local18.method2750();
				if (local41 == 0) {
					break;
				}
				local37 += local41 - 1;
				@Pc(53) int local53 = local37 & 0x3F;
				@Pc(59) int local59 = local37 >> 6 & 0x3F;
				@Pc(63) int local63 = local37 >> 12;
				@Pc(67) int local67 = local18.method2739();
				@Pc(71) int local71 = local67 >> 2;
				@Pc(75) int local75 = local67 & 0x3;
				@Pc(79) int local79 = local59 + arg0;
				@Pc(83) int local83 = local53 + arg1;
				if (local79 > 0 && local83 > 0 && super.anInt2825 - 1 > local79 && local83 < super.anInt2839 - 1) {
					@Pc(112) Class67 local112 = null;
					if (!super.aBoolean215) {
						@Pc(117) int local117 = local63;
						if ((Static13.aByteArrayArrayArray17[1][local79][local83] & 0x2) == 2) {
							local117 = local63 - 1;
						}
						if (local117 >= 0) {
							local112 = arg4[local117];
						}
					}
					this.method2446(local83, local20, local63, local79, local75, arg2, local63, local112, local71, -1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(ILclient!np;IIZ[IIILclient!rp;II)V")
	public void method2442(@OriginalArg(0) int arg0, @OriginalArg(1) Class155 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class3_Sub5 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean215) {
			return;
		}
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(19) Class102 local19 = null;
		@Pc(25) int local25 = (arg9 & 0x7) * 8;
		@Pc(31) int local31 = (arg8 & 0x7) * 8;
		while (true) {
			@Pc(36) int local36;
			@Pc(52) int local52;
			@Pc(314) int local314;
			@Pc(56) int local56;
			while (arg7.anInt3121 < arg7.aByteArray42.length) {
				local36 = arg7.method2739();
				if (local36 == 0) {
					local19 = new Class102(arg7);
				} else {
					@Pc(92) int local92;
					@Pc(146) int local146;
					@Pc(163) int local163;
					@Pc(97) int local97;
					if (local36 == 1) {
						local52 = arg7.method2739();
						if (local52 > 0) {
							for (local56 = 0; local56 < local52; local56++) {
								@Pc(63) Class3_Sub12_Sub1 local63 = new Class3_Sub12_Sub1(arg7);
								if (local63.anInt6134 == 31) {
									@Pc(76) Class15 local76 = Static13.aClass97_3.method2012(arg7.method2767());
									local63.method5445(local76.anInt210, local76.anInt205, local76.anInt209, local76.anInt207);
								}
								local92 = local63.anInt6127 >> 7;
								local97 = local63.anInt6122 >> 7;
								if (arg5 == local63.anInt6145 && local92 >= local25 && local92 < local25 + 8 && local31 <= local97 && local97 < local31 + 8) {
									local146 = (arg3 << 7) + Static319.method4840(arg0, local63.anInt6127 & 0x3FF, local63.anInt6122 & 0x3FF);
									local163 = (arg2 << 7) + Static71.method1194(local63.anInt6127 & 0x3FF, local63.anInt6122 & 0x3FF, arg0);
									local63.anInt6127 = local146;
									local63.anInt6122 = local163;
									local92 = local63.anInt6127 >> 7;
									local97 = local63.anInt6122 >> 7;
									if (local92 >= 0 && local97 >= 0 && super.anInt2825 > local92 && local97 < super.anInt2839) {
										local63.anInt6123 = super.anIntArrayArrayArray13[arg5][local92][local97] - local63.anInt6123;
										if (arg1.method4943() > 0) {
											Static23.method287(local63);
										}
									}
								}
							}
						}
					} else if (local36 == 2) {
						if (local19 == null) {
							local19 = new Class102();
						}
						local19.method2095(arg7);
					} else if (local36 != 128) {
						if (local36 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray11 == null) {
							super.aByteArrayArrayArray11 = new byte[4][][];
						}
						for (local52 = 0; local52 < 4; local52++) {
							@Pc(299) byte local299 = arg7.method2753();
							if (local299 == 0 && super.aByteArrayArrayArray11[arg6] != null) {
								if (local52 <= arg5) {
									local314 = arg3;
									local92 = arg3 + 7;
									local97 = arg2;
									if (arg2 < 0) {
										local97 = 0;
									} else if (arg2 >= super.anInt2839) {
										local97 = super.anInt2839;
									}
									if (local92 < 0) {
										local92 = 0;
									} else if (super.anInt2825 <= local92) {
										local92 = super.anInt2825;
									}
									local146 = arg2 + 7;
									if (arg3 < 0) {
										local314 = 0;
									} else if (arg3 >= super.anInt2825) {
										local314 = super.anInt2825;
									}
									if (local146 < 0) {
										local146 = 0;
									} else if (local146 >= super.anInt2839) {
										local146 = super.anInt2839;
									}
									while (local314 < local92) {
										while (local97 < local146) {
											super.aByteArrayArrayArray11[arg6][local314][local97] = 0;
											local97++;
										}
										local314++;
									}
								}
							} else if (local299 == 1) {
								if (super.aByteArrayArrayArray11[arg6] == null) {
									super.aByteArrayArrayArray11[arg6] = new byte[super.anInt2825 + 1][super.anInt2839 + 1];
								}
								for (local314 = 0; local314 < 64; local314 += 4) {
									for (local92 = 0; local92 < 64; local92 += 4) {
										@Pc(454) byte local454 = arg7.method2753();
										if (arg5 >= local52) {
											for (local146 = local314; local146 < local314 + 4; local146++) {
												for (local163 = local92; local163 < local92 + 4; local163++) {
													if (local146 >= local25 && local25 + 8 > local146 && local163 >= local31 && local31 + 8 > local31) {
														@Pc(517) int local517 = Static165.method2519(local146 & 0x7, local163 & 0x7, arg0) + arg3;
														@Pc(529) int local529 = arg2 + Static256.method4151(local146 & 0x7, arg0, local163 & 0x7);
														if (local517 >= 0 && local517 < super.anInt2825 && local529 >= 0 && super.anInt2839 > local529) {
															super.aByteArrayArrayArray11[arg6][local517][local529] = local454;
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
						arg7.anInt3121 += 10;
					} else {
						arg4[0] = arg7.method2767();
						arg4[1] = arg7.method2740();
						arg4[2] = arg7.method2740();
						arg4[3] = arg7.method2740();
						arg4[4] = arg7.method2767();
					}
				}
			}
			if (local19 != null) {
				Static274.method4282(arg3 >> 3, local19, arg2 >> 3);
			}
			if (super.aByteArrayArrayArray11 != null && super.aByteArrayArrayArray11[arg6] != null) {
				local36 = arg3 + 7;
				local52 = arg2 + 7;
				for (local56 = arg3; local56 < local36; local56++) {
					for (local314 = arg2; local314 < local52; local314++) {
						super.aByteArrayArrayArray11[arg6][local56][local314] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I[Lclient!ee;IIIIBLclient!np;II[B)V")
	public void method2443(@OriginalArg(0) int arg0, @OriginalArg(1) Class67[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class155 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(21) Class3_Sub5 local21 = new Class3_Sub5(arg9);
		@Pc(23) int local23 = -1;
		while (true) {
			@Pc(27) int local27 = local21.method2777();
			if (local27 == 0) {
				return;
			}
			local23 += local27;
			@Pc(38) int local38 = 0;
			while (true) {
				@Pc(42) int local42 = local21.method2750();
				if (local42 == 0) {
					break;
				}
				local38 += local42 - 1;
				@Pc(57) int local57 = local38 & 0x3F;
				@Pc(63) int local63 = local38 >> 6 & 0x3F;
				@Pc(67) int local67 = local38 >> 12;
				@Pc(71) int local71 = local21.method2739();
				@Pc(75) int local75 = local71 >> 2;
				@Pc(79) int local79 = local71 & 0x3;
				if (arg4 == local67 && local63 >= arg2 && arg2 + 8 > local63 && local57 >= arg5 && arg5 + 8 > local57) {
					@Pc(109) Class60 local109 = Static97.aClass217_4.method5007(local23);
					@Pc(126) int local126 = Static230.method3806(local109.anInt1427, local109.anInt1390, arg0, local79, local57 & 0x7, local63 & 0x7) + arg8;
					@Pc(145) int local145 = Static100.method1659(local79, local63 & 0x7, local57 & 0x7, arg0, local109.anInt1427, local109.anInt1390) + arg7;
					if (local126 > 0 && local145 > 0 && local126 < super.anInt2825 - 1 && super.anInt2839 - 1 > local145) {
						@Pc(177) Class67 local177 = null;
						if (!super.aBoolean215) {
							@Pc(182) int local182 = arg3;
							if ((Static13.aByteArrayArrayArray17[1][local126][local145] & 0x2) == 2) {
								local182 = arg3 - 1;
							}
							if (local182 >= 0) {
								local177 = arg1[local182];
							}
						}
						this.method2446(local145, local23, arg3, local126, arg0 + local79 & 0x3, arg6, arg3, local177, local75, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!np;BII[ILclient!rp;)V")
	public void method2444(@OriginalArg(0) Class155 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) Class3_Sub5 arg4) {
		if (super.aBoolean215) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class102 local13 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		while (true) {
			@Pc(35) int local35;
			@Pc(91) int local91;
			@Pc(39) int local39;
			@Pc(96) int local96;
			label306: do {
				while (true) {
					@Pc(24) int local24;
					@Pc(220) int local220;
					while (arg4.anInt3121 < arg4.aByteArray42.length) {
						local24 = arg4.method2739();
						if (local24 == 0) {
							local13 = new Class102(arg4);
						} else {
							if (local24 == 1) {
								local35 = arg4.method2739();
								continue label306;
							}
							if (local24 == 2) {
								if (local13 == null) {
									local13 = new Class102();
								}
								local13.method2095(arg4);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException((String) null);
								}
								if (super.aByteArrayArrayArray11 == null) {
									super.aByteArrayArrayArray11 = new byte[4][][];
								}
								local11 = true;
								for (local35 = 0; local35 < 4; local35++) {
									@Pc(180) byte local180 = arg4.method2753();
									@Pc(262) int local262;
									if (local180 == 0 && super.aByteArrayArrayArray11[local35] != null) {
										local220 = arg2;
										local91 = arg2 + 64;
										local96 = arg1;
										if (arg1 < 0) {
											local96 = 0;
										} else if (super.anInt2839 <= arg1) {
											local96 = super.anInt2839;
										}
										if (arg2 < 0) {
											local220 = 0;
										} else if (super.anInt2825 <= arg2) {
											local220 = super.anInt2825;
										}
										if (local91 < 0) {
											local91 = 0;
										} else if (super.anInt2825 <= local91) {
											local91 = super.anInt2825;
										}
										local262 = arg1 + 64;
										if (local262 < 0) {
											local262 = 0;
										} else if (super.anInt2839 <= local262) {
											local262 = super.anInt2839;
										}
										while (local220 < local91) {
											while (local262 > local96) {
												super.aByteArrayArrayArray11[local35][local220][local96] = 0;
												local96++;
											}
											local220++;
										}
									} else if (local180 == 1) {
										if (super.aByteArrayArrayArray11[local35] == null) {
											super.aByteArrayArrayArray11[local35] = new byte[super.anInt2825 + 1][super.anInt2839 + 1];
										}
										for (local220 = 0; local220 < 64; local220 += 4) {
											for (local91 = 0; local91 < 64; local91 += 4) {
												@Pc(359) byte local359 = arg4.method2753();
												for (local262 = arg2 + local220; local262 < arg2 + local220 + 4; local262++) {
													for (@Pc(369) int local369 = arg1 + local91; local369 < local91 + arg1 + 4; local369++) {
														if (local262 >= 0 && super.anInt2825 > local262 && local369 >= 0 && super.anInt2839 > local369) {
															super.aByteArrayArrayArray11[local35][local262][local369] = local359;
														}
													}
												}
											}
										}
									} else if (local180 == 2) {
										if (super.aByteArrayArrayArray11[local35] == null) {
											super.aByteArrayArrayArray11[local35] = new byte[super.anInt2825 + 1][super.anInt2839 + 1];
										}
										if (local35 > 0) {
											local220 = arg2;
											local91 = arg2 + 64;
											local96 = arg1;
											if (arg1 < 0) {
												local96 = 0;
											} else if (arg1 >= super.anInt2839) {
												local96 = super.anInt2839;
											}
											if (arg2 < 0) {
												local220 = 0;
											} else if (arg2 >= super.anInt2825) {
												local220 = super.anInt2825;
											}
											local262 = arg1 + 64;
											if (local91 < 0) {
												local91 = 0;
											} else if (local91 >= super.anInt2825) {
												local91 = super.anInt2825;
											}
											if (local262 < 0) {
												local262 = 0;
											} else if (local262 >= super.anInt2839) {
												local262 = super.anInt2839;
											}
											while (local220 < local91) {
												while (local262 > local96) {
													super.aByteArrayArrayArray11[local35][local220][local96] = super.aByteArrayArrayArray11[local35 - 1][local220][local96];
													local96++;
												}
												local220++;
											}
										}
									}
								}
							} else if (arg3 == null) {
								arg4.anInt3121 += 10;
							} else {
								arg3[0] = arg4.method2767();
								arg3[1] = arg4.method2740();
								arg3[2] = arg4.method2740();
								arg3[3] = arg4.method2740();
								arg3[4] = arg4.method2767();
							}
						}
					}
					if (local13 != null) {
						for (local24 = 0; local24 < 8; local24++) {
							for (local35 = 0; local35 < 8; local35++) {
								local39 = local24 + (arg2 >> 3);
								local220 = local35 + (arg1 >> 3);
								if (local39 >= 0 && super.anInt2825 >> 3 > local39 && local220 >= 0 && super.anInt2839 >> 3 > local220) {
									Static274.method4282(local39, local13, local220);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray11 != null) {
						for (local24 = 0; local24 < 4; local24++) {
							if (super.aByteArrayArrayArray11[local24] != null) {
								for (local35 = 0; local35 < 16; local35++) {
									for (local39 = 0; local39 < 16; local39++) {
										local220 = local35 + (arg2 >> 2);
										local91 = local39 + (arg1 >> 2);
										if (local220 >= 0 && local220 < 26 && local91 >= 0 && local91 < 26) {
											super.aByteArrayArrayArray11[local24][local220][local91] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local35 <= 0);
			for (local39 = 0; local39 < local35; local39++) {
				@Pc(46) Class3_Sub12_Sub1 local46 = new Class3_Sub12_Sub1(arg4);
				if (local46.anInt6134 == 31) {
					@Pc(59) Class15 local59 = Static13.aClass97_3.method2012(arg4.method2767());
					local46.method5445(local59.anInt210, local59.anInt205, local59.anInt209, local59.anInt207);
				}
				local46.anInt6122 += arg1 << 7;
				local46.anInt6127 += arg2 << 7;
				local91 = local46.anInt6127 >> 7;
				local96 = local46.anInt6122 >> 7;
				if (local91 >= 0 && local96 >= 0 && local91 < super.anInt2825 && super.anInt2839 > local96) {
					local46.anInt6123 = super.anIntArrayArrayArray13[local46.anInt6145][local91][local96] - local46.anInt6123;
					if (arg0.method4943() > 0) {
						Static23.method287(local46);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZIIIILclient!np;ILclient!ee;II)V")
	public void method2446(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class155 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class67 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static164.aClass154_Sub1_1.method5400(Static2.anInt68) && !Static11.method5237(Static24.anInt332, arg0, arg6, arg3)) {
			return;
		}
		if (arg2 < this.anInt2851) {
			this.anInt2851 = arg2;
		}
		@Pc(30) Class60 local30 = Static97.aClass217_4.method5007(arg1);
		if (Static2.anInt68 == 1 && local30.aBoolean97) {
			return;
		}
		@Pc(48) int local48;
		@Pc(51) int local51;
		if (arg4 == 1 || arg4 == 3) {
			local48 = local30.anInt1427;
			local51 = local30.anInt1390;
		} else {
			local48 = local30.anInt1390;
			local51 = local30.anInt1427;
		}
		@Pc(67) int local67;
		@Pc(71) int local71;
		if (arg3 + local48 > super.anInt2825) {
			local67 = arg3;
			local71 = arg3 + 1;
		} else {
			local71 = arg3 + (local48 + 1 >> 1);
			local67 = (local48 >> 1) + arg3;
		}
		@Pc(108) int local108;
		@Pc(102) int local102;
		if (super.anInt2839 >= arg0 + local51) {
			local102 = arg0 + (local51 + 1 >> 1);
			local108 = arg0 + (local51 >> 1);
		} else {
			local108 = arg0;
			local102 = arg0 + 1;
		}
		@Pc(120) Class7 local120 = Static337.aClass7Array3[arg6];
		@Pc(144) int local144 = local120.method5648(local67, local108) + local120.method5648(local71, local108) + local120.method5648(local67, local102) + local120.method5648(local71, local102) >> 2;
		@Pc(153) int local153 = (arg3 << 7) + (local48 << 6);
		@Pc(161) int local161 = (arg0 << 7) + (local51 << 6);
		@Pc(173) boolean local173 = Static113.aBoolean163 && !super.aBoolean215 && local30.aBoolean88;
		if (local30.method1195()) {
			Static329.method5022(arg0, arg4, null, arg2, null, arg3, local30);
		}
		@Pc(208) boolean local208 = arg9 == -1 && local30.anInt1396 == -1 && local30.anIntArray138 == null && local30.anIntArray134 == null && !local30.aBoolean93;
		if (Static305.aBoolean410 && local30.anInt1411 != 1) {
			return;
		}
		if (arg8 != 22) {
			@Pc(346) Class28_Sub1 local346;
			@Pc(316) Class28_Sub1_Sub3 local316;
			@Pc(348) int local348;
			if (arg8 == 10 || arg8 == 11) {
				local316 = null;
				if (local208) {
					@Pc(378) Class28_Sub1_Sub3 local378 = new Class28_Sub1_Sub3(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg3, local48 + arg3 - 1, arg0, local51 + arg0 - 1, arg8, arg4, local173);
					local346 = local378;
					local316 = local378;
					local348 = local378.method4459();
				} else {
					local346 = new Class28_Sub1_Sub6(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg3, arg3 + local48 - 1, arg0, local51 + arg0 - 1, arg8, arg4, arg9);
					local348 = 15;
				}
				@Pc(399) Class28_Sub1 local399 = Static30.method472(arg2, arg3, arg0, gg.class);
				@Pc(401) boolean local401 = false;
				if (local399 instanceof Class28_Sub1_Sub2 && arg3 == local399.aShort89 && arg0 == local399.aShort87) {
					local401 = true;
					((Class28_Sub1_Sub2) local399).aClass28_Sub1_2 = local346;
				}
				if (local401 || Static202.method3149(local346, false)) {
					if (local316 != null && local316.method5427()) {
						local316.method5426(arg5);
					}
					if (local30.aBoolean96 && Static113.aBoolean163) {
						if (local348 > 30) {
							local348 = 30;
						}
						for (@Pc(450) int local450 = 0; local450 <= local48; local450++) {
							for (@Pc(454) int local454 = 0; local454 <= local51; local454++) {
								local120.method5637(arg3 + local450, local454 + arg0, local348);
							}
						}
					}
				}
				if (local30.anInt1418 != 0 && arg7 != null) {
					arg7.method1332(local51, arg0, arg3, !local30.aBoolean87, local30.aBoolean90, local48);
				}
			} else {
				@Pc(605) Class28_Sub1 local605;
				if (arg8 >= 12 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
					if (local208) {
						local316 = new Class28_Sub1_Sub3(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg3, arg3 + local48 - 1, arg0, arg0 + local51 - 1, arg8, arg4, local173);
						local346 = local316;
						if (local316.method5427()) {
							local316.method5426(arg5);
						}
					} else {
						local346 = new Class28_Sub1_Sub6(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg3, arg3 + local48 - 1, arg0, arg0 + local51 - 1, arg8, arg4, arg9);
					}
					local605 = Static30.method472(arg2, arg3, arg0, gg.class);
					if (local605 instanceof Class28_Sub1_Sub2 && local605.aShort89 == arg3 && arg0 == local605.aShort87) {
						((Class28_Sub1_Sub2) local605).aClass28_Sub1_2 = local346;
					} else {
						Static202.method3149(local346, false);
					}
					if (Static113.aBoolean163 && !super.aBoolean215 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg2 > 0 && local30.anInt1411 != 0) {
						super.aByteArrayArrayArray16[arg2][arg3][arg0] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg0] | 0x4);
					}
					if (local30.anInt1418 != 0 && arg7 != null) {
						arg7.method1332(local51, arg0, arg3, !local30.aBoolean87, local30.aBoolean90, local48);
					}
				} else {
					@Pc(733) Class28_Sub3 local733;
					if (arg8 == 0) {
						@Pc(706) int local706 = local30.anInt1411;
						if (Static102.aBoolean153 && local30.anInt1411 == -1) {
							local706 = 1;
						}
						if (local208) {
							@Pc(731) Class28_Sub3_Sub1 local731 = new Class28_Sub3_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, arg8, arg4, local173);
							local733 = local731;
							if (local731.method5427()) {
								local731.method5426(arg5);
							}
						} else {
							local733 = new Class28_Sub3_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg8, arg4, arg9);
						}
						@Pc(764) Class28_Sub3 local764 = Static343.method5200(arg2, arg3, arg0);
						if (local764 instanceof Class28_Sub3_Sub3) {
							((Class28_Sub3_Sub3) local764).aClass28_Sub3_3 = local733;
						} else {
							Static45.method703(arg2, arg3, arg0, local733, null);
						}
						if (Static113.aBoolean163) {
							if (arg4 == 0) {
								if (local30.aBoolean96) {
									local120.method5637(arg3, arg0, 50);
									local120.method5637(arg3, arg0 + 1, 50);
								}
								if (local706 == 1 && !super.aBoolean215) {
									super.aByteArrayArrayArray16[arg2][arg3][arg0] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg0] | 0x1);
								}
							} else if (arg4 == 1) {
								if (local30.aBoolean96) {
									local120.method5637(arg3, arg0 + 1, 50);
									local120.method5637(arg3 + 1, arg0 + 1, 50);
								}
								if (local706 == 1 && !super.aBoolean215) {
									super.aByteArrayArrayArray16[arg2][arg3][arg0 + 1] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg0 + 1] | 0x2);
								}
							} else if (arg4 == 2) {
								if (local30.aBoolean96) {
									local120.method5637(arg3 + 1, arg0, 50);
									local120.method5637(arg3 + 1, arg0 - -1, 50);
								}
								if (local706 == 1 && !super.aBoolean215) {
									super.aByteArrayArrayArray16[arg2][arg3 + 1][arg0] = (byte) (super.aByteArrayArrayArray16[arg2][arg3 + 1][arg0] | 0x1);
								}
							} else if (arg4 == 3) {
								if (local30.aBoolean96) {
									local120.method5637(arg3, arg0, 50);
									local120.method5637(arg3 + 1, arg0, 50);
								}
								if (local706 == 1 && !super.aBoolean215) {
									super.aByteArrayArrayArray16[arg2][arg3][arg0] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg0] | 0x2);
								}
							}
						}
						if (local30.anInt1418 != 0 && arg7 != null) {
							arg7.method1328(arg8, arg0, arg4, !local30.aBoolean87, arg3, local30.aBoolean90);
						}
						if (local30.anInt1392 != 16) {
							Static61.method1096(arg2, arg3, arg0, local30.anInt1392);
						}
					} else {
						@Pc(1041) Class28_Sub3_Sub1 local1041;
						@Pc(1051) Class28_Sub3 local1051;
						if (arg8 == 1) {
							if (local208) {
								local1041 = new Class28_Sub3_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, arg8, arg4, local173);
								if (local1041.method5427()) {
									local1041.method5426(arg5);
								}
								local1051 = local1041;
							} else {
								local1051 = new Class28_Sub3_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg8, arg4, arg9);
							}
							local733 = Static343.method5200(arg2, arg3, arg0);
							if (local733 instanceof Class28_Sub3_Sub3) {
								((Class28_Sub3_Sub3) local733).aClass28_Sub3_3 = local1051;
							} else {
								Static45.method703(arg2, arg3, arg0, local1051, null);
							}
							if (local30.aBoolean96 && Static113.aBoolean163) {
								if (arg4 == 0) {
									local120.method5637(arg3, arg0 + 1, 50);
								} else if (arg4 == 1) {
									local120.method5637(arg3 + 1, arg0 + 1, 50);
								} else if (arg4 == 2) {
									local120.method5637(arg3 + 1, arg0, 50);
								} else if (arg4 == 3) {
									local120.method5637(arg3, arg0, 50);
								}
							}
							if (local30.anInt1418 != 0 && arg7 != null) {
								arg7.method1328(arg8, arg0, arg4, !local30.aBoolean87, arg3, local30.aBoolean90);
							}
						} else if (arg8 == 2) {
							local348 = arg4 + 1 & 0x3;
							if (local208) {
								@Pc(1233) Class28_Sub3_Sub1 local1233 = new Class28_Sub3_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, arg8, arg4 + 4, local173);
								@Pc(1248) Class28_Sub3_Sub1 local1248 = new Class28_Sub3_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, arg8, local348, local173);
								if (local1233.method5427()) {
									local1233.method5426(arg5);
								}
								local1051 = local1233;
								local733 = local1248;
								if (local1248.method5427()) {
									local1248.method5426(arg5);
								}
							} else {
								local1051 = new Class28_Sub3_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg8, arg4 + 4, arg9);
								local733 = new Class28_Sub3_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg8, local348, arg9);
							}
							Static45.method703(arg2, arg3, arg0, local1051, local733);
							if (local30.anInt1411 == 1 && Static113.aBoolean163 && !super.aBoolean215) {
								if (arg4 == 0) {
									super.aByteArrayArrayArray16[arg2][arg3][arg0] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg0] | 0x1);
									super.aByteArrayArrayArray16[arg2][arg3][arg0 + 1] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg0 + 1] | 0x2);
								} else if (arg4 == 1) {
									super.aByteArrayArrayArray16[arg2][arg3][arg0 + 1] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg0 + 1] | 0x2);
									super.aByteArrayArrayArray16[arg2][arg3 + 1][arg0] = (byte) (super.aByteArrayArrayArray16[arg2][arg3 + 1][arg0] | 0x1);
								} else if (arg4 == 2) {
									super.aByteArrayArrayArray16[arg2][arg3 + 1][arg0] = (byte) (super.aByteArrayArrayArray16[arg2][arg3 + 1][arg0] | 0x1);
									super.aByteArrayArrayArray16[arg2][arg3][arg0] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg0] | 0x2);
								} else if (arg4 == 3) {
									super.aByteArrayArrayArray16[arg2][arg3][arg0] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg0] | 0x2);
									super.aByteArrayArrayArray16[arg2][arg3][arg0] = (byte) (super.aByteArrayArrayArray16[arg2][arg3][arg0] | 0x1);
								}
							}
							if (local30.anInt1418 != 0 && arg7 != null) {
								arg7.method1328(arg8, arg0, arg4, !local30.aBoolean87, arg3, local30.aBoolean90);
							}
							if (local30.anInt1392 != 16) {
								Static61.method1096(arg2, arg3, arg0, local30.anInt1392);
							}
						} else if (arg8 == 3) {
							if (local208) {
								local1041 = new Class28_Sub3_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, arg8, arg4, local173);
								if (local1041.method5427()) {
									local1041.method5426(arg5);
								}
								local1051 = local1041;
							} else {
								local1051 = new Class28_Sub3_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg8, arg4, arg9);
							}
							local733 = Static343.method5200(arg2, arg3, arg0);
							if (local733 instanceof Class28_Sub3_Sub3) {
								((Class28_Sub3_Sub3) local733).aClass28_Sub3_3 = local1051;
							} else {
								Static45.method703(arg2, arg3, arg0, local1051, null);
							}
							if (local30.aBoolean96 && Static113.aBoolean163) {
								if (arg4 == 0) {
									local120.method5637(arg3, arg0 + 1, 50);
								} else if (arg4 == 1) {
									local120.method5637(arg3 + 1, arg0 + 1, 50);
								} else if (arg4 == 2) {
									local120.method5637(arg3 + 1, arg0, 50);
								} else if (arg4 == 3) {
									local120.method5637(arg3, arg0, 50);
								}
							}
							if (local30.anInt1418 != 0 && arg7 != null) {
								arg7.method1328(arg8, arg0, arg4, !local30.aBoolean87, arg3, local30.aBoolean90);
							}
						} else if (arg8 == 9) {
							if (local208) {
								local316 = new Class28_Sub1_Sub3(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg3, arg3, arg0, arg0, arg8, arg4, local173);
								local346 = local316;
								if (local316.method5427()) {
									local316.method5426(arg5);
								}
							} else {
								local346 = new Class28_Sub1_Sub6(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg3, arg3 + local48 - 1, arg0, arg0 + local51 - 1, arg8, arg4, arg9);
							}
							local605 = Static30.method472(arg2, arg3, arg0, gg.class);
							if (local605 instanceof Class28_Sub1_Sub2 && local605.aShort89 == arg3 && arg0 == local605.aShort87) {
								((Class28_Sub1_Sub2) local605).aClass28_Sub1_2 = local346;
							} else {
								Static202.method3149(local346, false);
							}
							if (local30.anInt1418 != 0 && arg7 != null) {
								arg7.method1332(local51, arg0, arg3, !local30.aBoolean87, local30.aBoolean90, local48);
							}
							if (local30.anInt1392 != 16) {
								Static61.method1096(arg2, arg3, arg0, local30.anInt1392);
							}
						} else {
							@Pc(1811) Class28_Sub4 local1811;
							if (arg8 == 4) {
								if (local208) {
									@Pc(1830) Class28_Sub4_Sub1 local1830 = new Class28_Sub4_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, 0, 0, 0, arg8, arg4);
									if (local1830.method5427()) {
										local1830.method5426(arg5);
									}
									local1811 = local1830;
								} else {
									local1811 = new Class28_Sub4_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, 0, 0, 0, arg8, arg4, arg9);
								}
								@Pc(1845) Class28_Sub4 local1845 = Static202.method3148(arg2, arg3, arg0);
								if (local1845 instanceof Class28_Sub4_Sub3) {
									((Class28_Sub4_Sub3) local1845).aClass28_Sub4_3 = local1811;
								} else {
									Static289.method4516(arg2, arg3, arg0, local1811, null);
								}
							} else {
								@Pc(1867) int local1867;
								@Pc(1873) Interface3 local1873;
								@Pc(1939) Class28_Sub4_Sub1 local1939;
								@Pc(1954) Class28_Sub4 local1954;
								if (arg8 == 5) {
									local1867 = 16;
									local1873 = (Interface3) Static343.method5200(arg2, arg3, arg0);
									if (local1873 != null) {
										local1867 = Static97.aClass217_4.method5007(local1873.method5420()).anInt1392;
									}
									if (local208) {
										local1939 = new Class28_Sub4_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, 0, Static196.anIntArray575[arg4] * local1867, local1867 * Static250.anIntArray576[arg4], arg8, arg4);
										if (local1939.method5427()) {
											local1939.method5426(arg5);
										}
										local1811 = local1939;
									} else {
										local1811 = new Class28_Sub4_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, 0, Static196.anIntArray575[arg4] * local1867, local1867 * Static250.anIntArray576[arg4], arg8, arg4, arg9);
									}
									local1954 = Static202.method3148(arg2, arg3, arg0);
									if (local1954 instanceof Class28_Sub4_Sub3) {
										((Class28_Sub4_Sub3) local1954).aClass28_Sub4_3 = local1811;
									} else {
										Static289.method4516(arg2, arg3, arg0, local1811, null);
									}
								} else if (arg8 == 6) {
									local1867 = 8;
									local1873 = (Interface3) Static343.method5200(arg2, arg3, arg0);
									if (local1873 != null) {
										local1867 = Static97.aClass217_4.method5007(local1873.method5420()).anInt1392 / 2;
									}
									if (local208) {
										local1939 = new Class28_Sub4_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, arg4, local1867 * Static196.anIntArray575[arg4], Static250.anIntArray576[arg4] * local1867, arg8, arg4 + 4);
										if (local1939.method5427()) {
											local1939.method5426(arg5);
										}
										local1811 = local1939;
									} else {
										local1811 = new Class28_Sub4_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg4, Static387.anIntArray702[arg4] * local1867, Static46.anIntArray88[arg4] * local1867, arg8, arg4 + 4, arg9);
									}
									local1954 = Static202.method3148(arg2, arg3, arg0);
									if (local1954 instanceof Class28_Sub4_Sub3) {
										((Class28_Sub4_Sub3) local1954).aClass28_Sub4_3 = local1811;
									} else {
										Static289.method4516(arg2, arg3, arg0, local1811, null);
									}
								} else if (arg8 == 7) {
									local1867 = arg4 + 2 & 0x3;
									if (local208) {
										@Pc(2116) Class28_Sub4_Sub1 local2116 = new Class28_Sub4_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, local1867, 0, 0, arg8, local1867 + 4);
										local1811 = local2116;
										if (local2116.method5427()) {
											local2116.method5426(arg5);
										}
									} else {
										local1811 = new Class28_Sub4_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, local1867, 0, 0, arg8, local1867 + 4, arg9);
									}
									@Pc(2154) Class28_Sub4 local2154 = Static202.method3148(arg2, arg3, arg0);
									if (local2154 instanceof Class28_Sub4_Sub3) {
										((Class28_Sub4_Sub3) local2154).aClass28_Sub4_3 = local1811;
									} else {
										Static289.method4516(arg2, arg3, arg0, local1811, null);
									}
								} else if (arg8 == 8) {
									local348 = arg4 + 2 & 0x3;
									@Pc(2186) int local2186 = 8;
									@Pc(2192) Interface3 local2192 = (Interface3) Static343.method5200(arg2, arg3, arg0);
									if (local2192 != null) {
										local2186 = Static97.aClass217_4.method5007(local2192.method5420()).anInt1392 / 2;
									}
									@Pc(2235) Class28_Sub4 local2235;
									@Pc(2258) Class28_Sub4 local2258;
									if (local208) {
										local2235 = new Class28_Sub4_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, arg4, Static387.anIntArray702[arg4] * local2186, local2186 * Static46.anIntArray88[arg4], arg8, arg4 + 4);
										local2258 = new Class28_Sub4_Sub1(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, arg4, 0, 0, arg8, local348 + 4);
										if (local2235.method5427()) {
											local2235.method5426(arg5);
										}
										if (local2258.method5427()) {
											local2258.method5426(arg5);
										}
									} else {
										local2235 = new Class28_Sub4_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg4, Static387.anIntArray702[arg4] * local2186, local2186 * Static46.anIntArray88[arg4], arg8, arg4 + 4, arg9);
										local2258 = new Class28_Sub4_Sub2(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg4, 0, 0, arg8, local348 + 4, arg9);
									}
									Static289.method4516(arg2, arg3, arg0, local2235, local2258);
								}
							}
						}
					}
				}
			}
		} else if (Static164.aClass154_Sub1_1.aBoolean475 || local30.anInt1415 != 0 || local30.anInt1418 == 1 || local30.aBoolean94) {
			@Pc(251) Class28_Sub2 local251;
			if (local208) {
				@Pc(267) Class28_Sub2_Sub2 local267 = new Class28_Sub2_Sub2(arg5, local30, arg6, local153, local144, local161, super.aBoolean215, arg4, local173);
				if (local267.method5427()) {
					local267.method5426(arg5);
				}
				local251 = local267;
			} else {
				local251 = new Class28_Sub2_Sub3(arg5, local30, arg2, arg6, local153, local144, local161, super.aBoolean215, arg4, arg9);
			}
			@Pc(282) Class28_Sub2 local282 = Static277.method4347(arg2, arg3, arg0);
			if (local282 instanceof Class28_Sub2_Sub1) {
				((Class28_Sub2_Sub1) local282).aClass28_Sub2_1 = local251;
			} else {
				Static187.method2963(arg2, arg3, arg0, local251);
			}
			if (local30.anInt1418 == 1 && arg7 != null) {
				arg7.method1325(arg3, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!np;I)V")
	public void method2447(@OriginalArg(0) Class155 arg0) {
		Static118.method1899(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt2835 > 1) {
			for (local13 = 0; local13 < super.anInt2825; local13++) {
				for (local17 = 0; local17 < super.anInt2839; local17++) {
					if ((Static13.aByteArrayArrayArray17[1][local13][local17] & 0x2) == 2) {
						Static165.method2521(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; super.anInt2835 > local13; local13++) {
			for (local17 = 0; local17 <= super.anInt2839; local17++) {
				for (@Pc(65) int local65 = 0; super.anInt2825 >= local65; local65++) {
					@Pc(80) int local80;
					@Pc(82) int local82;
					@Pc(84) int local84;
					@Pc(86) int local86;
					@Pc(131) int local131;
					@Pc(222) int local222;
					@Pc(231) int local231;
					@Pc(251) int local251;
					@Pc(255) int local255;
					if ((super.aByteArrayArrayArray16[local13][local65][local17] & 0x1) != 0) {
						local80 = local17;
						local82 = local17;
						local84 = local13;
						local86 = local13;
						while (local80 > 0 && (super.aByteArrayArrayArray16[local13][local65][local80 - 1] & 0x1) != 0) {
							local80--;
						}
						while (super.anInt2839 > local82 && (super.aByteArrayArrayArray16[local13][local65][local82 + 1] & 0x1) != 0) {
							local82++;
						}
						label164: while (local84 > 0) {
							for (local131 = local80; local131 <= local82; local131++) {
								if ((super.aByteArrayArrayArray16[local84 - 1][local65][local131] & 0x1) == 0) {
									break label164;
								}
							}
							local84--;
						}
						label153: while (local86 < 3) {
							for (local131 = local80; local131 <= local82; local131++) {
								if ((super.aByteArrayArrayArray16[local86 + 1][local65][local131] & 0x1) == 0) {
									break label153;
								}
							}
							local86++;
						}
						local131 = (local86 + 1 - local84) * (local82 + 1 - local80);
						if (local131 >= 2) {
							local222 = super.anIntArrayArrayArray13[local86][local65][local80] - 240;
							local231 = super.anIntArrayArrayArray13[local84][local65][local80];
							Static272.method4268(1, local65 * 128, local65 * 128, local80 * 128, local82 * 128 + 128, local222, local231);
							for (local251 = local84; local251 <= local86; local251++) {
								for (local255 = local80; local255 <= local82; local255++) {
									super.aByteArrayArrayArray16[local251][local65][local255] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray16[local13][local65][local17] & 0x2) != 0) {
						local80 = local65;
						local82 = local65;
						local84 = local13;
						while (local80 > 0 && (super.aByteArrayArrayArray16[local13][local80 - 1][local17] & 0x2) != 0) {
							local80--;
						}
						local86 = local13;
						while (local82 < super.anInt2825 && (super.aByteArrayArrayArray16[local13][local82 + 1][local17] & 0x2) != 0) {
							local82++;
						}
						label217: while (local84 > 0) {
							for (local131 = local80; local131 <= local82; local131++) {
								if ((super.aByteArrayArrayArray16[local84 - 1][local131][local17] & 0x2) == 0) {
									break label217;
								}
							}
							local84--;
						}
						label206: while (local86 < 3) {
							for (local131 = local80; local131 <= local82; local131++) {
								if ((super.aByteArrayArrayArray16[local86 + 1][local131][local17] & 0x2) == 0) {
									break label206;
								}
							}
							local86++;
						}
						local131 = (local86 + 1 - local84) * (local82 + 1 - local80);
						if (local131 >= 2) {
							local222 = super.anIntArrayArrayArray13[local86][local80][local17] - 240;
							local231 = super.anIntArrayArrayArray13[local84][local80][local17];
							Static272.method4268(2, local80 * 128, local82 * 128 + 128, local17 * 128, local17 * 128, local222, local231);
							for (local251 = local84; local251 <= local86; local251++) {
								for (local255 = local80; local255 <= local82; local255++) {
									super.aByteArrayArrayArray16[local251][local255][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray16[local13][local65][local17] & 0x4) != 0) {
						local80 = local65;
						local82 = local65;
						for (local84 = local17; local84 > 0 && (super.aByteArrayArrayArray16[local13][local65][local84 - 1] & 0x4) != 0; local84--) {
						}
						for (local86 = local17; local86 < super.anInt2839 && (super.aByteArrayArrayArray16[local13][local65][local86 + 1] & 0x4) != 0; local86++) {
						}
						label271: while (local80 > 0) {
							for (local131 = local84; local131 <= local86; local131++) {
								if ((super.aByteArrayArrayArray16[local13][local80 - 1][local131] & 0x4) == 0) {
									break label271;
								}
							}
							local80--;
						}
						label260: while (super.anInt2825 > local82) {
							for (local131 = local84; local131 <= local86; local131++) {
								if ((super.aByteArrayArrayArray16[local13][local82 + 1][local131] & 0x4) == 0) {
									break label260;
								}
							}
							local82++;
						}
						if ((local86 + 1 - local84) * ((local82 - local80) + 1) >= 4) {
							local131 = super.anIntArrayArrayArray13[local13][local80][local84];
							Static272.method4268(4, local80 * 128, local82 * 128 + 128, local84 * 128, local86 * 128 + 128, local131, local131);
							for (@Pc(695) int local695 = local80; local695 <= local82; local695++) {
								for (local222 = local84; local222 <= local86; local222++) {
									super.aByteArrayArrayArray16[local13][local695][local222] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray16 = null;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIILclient!ee;IILclient!np;)V")
	public void method2448(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class67 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class155 arg5) {
		@Pc(12) Interface3 local12 = null;
		if (arg0 == 0) {
			local12 = (Interface3) Static343.method5200(arg4, arg3, arg1);
		}
		if (arg0 == 1) {
			local12 = (Interface3) Static202.method3148(arg4, arg3, arg1);
		}
		if (arg0 == 2) {
			local12 = (Interface3) Static30.method472(arg4, arg3, arg1, gg.class);
		}
		if (arg0 == 3) {
			local12 = (Interface3) Static277.method4347(arg4, arg3, arg1);
		}
		if (local12 == null) {
			return;
		}
		@Pc(64) Class60 local64 = Static97.aClass217_4.method5007(local12.method5420());
		@Pc(68) int local68 = local12.method5425();
		@Pc(72) int local72 = local12.method5423();
		if (local64.method1195()) {
			Static178.method2812(arg3, local64, arg1, arg4);
		}
		if (local12.method5427()) {
			local12.method5424(arg5);
		}
		if (arg0 != 0) {
			if (arg0 == 1) {
				@Pc(242) Class28_Sub4 local242 = Static202.method3148(arg4, arg3, arg1);
				if (!(local242 instanceof Class28_Sub4_Sub3)) {
					Static358.method5348(arg4, arg3, arg1);
					return;
				}
				((Class28_Sub4_Sub3) local242).aClass28_Sub4_3 = null;
			} else if (arg0 == 2) {
				@Pc(149) Class28_Sub1 local149 = Static30.method472(arg4, arg3, arg1, gg.class);
				if (local149 instanceof Class28_Sub1_Sub2 && arg3 == local149.aShort89 && local149.aShort87 == arg1) {
					((Class28_Sub1_Sub2) local149).aClass28_Sub1_2 = null;
				} else {
					Static196.method4651(arg4, arg3, arg1, gg.class);
				}
				if (local64.anInt1418 != 0 && super.anInt2825 > arg3 + local64.anInt1390 && arg1 + local64.anInt1390 < super.anInt2839 && super.anInt2825 > arg3 + local64.anInt1427 && super.anInt2839 > arg1 + local64.anInt1427) {
					arg2.method1329(arg3, local72, !local64.aBoolean87, local64.anInt1390, arg1, local64.anInt1427, local64.aBoolean90);
					return;
				}
			} else {
				if (arg0 == 3) {
					@Pc(111) Class28_Sub2 local111 = Static277.method4347(arg4, arg3, arg1);
					if (local111 instanceof Class28_Sub2_Sub1) {
						((Class28_Sub2_Sub1) local111).aClass28_Sub2_1 = null;
					} else {
						Static319.method4844(arg4, arg3, arg1);
					}
					if (local64.anInt1418 == 1) {
						arg2.method1336(arg1, arg3);
						return;
					}
				}
				return;
			}
			return;
		}
		@Pc(260) Class28_Sub3 local260 = Static343.method5200(arg4, arg3, arg1);
		if (local260 instanceof Class28_Sub3_Sub3) {
			((Class28_Sub3_Sub3) local260).aClass28_Sub3_3 = null;
		} else {
			Static139.method2218(arg4, arg3, arg1);
		}
		if (local64.anInt1418 != 0) {
			arg2.method1327(!local64.aBoolean87, arg1, local72, local68, local64.aBoolean90, arg3);
			return;
		}
	}
}
