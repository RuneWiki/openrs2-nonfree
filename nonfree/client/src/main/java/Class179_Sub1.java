import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!js")
public final class Class179_Sub1 extends Class179 {

	@OriginalMember(owner = "client!js", name = "R", descriptor = "I")
	public int anInt4648 = 99;

	@OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIIZ)V")
	public Class179_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static228.aClass189_4, Static407.aClass360_5);
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IILclient!un;Lclient!r;[IIIIIII)V")
	public void method4069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class4_Sub11 arg2, @OriginalArg(3) Class44 arg3, @OriginalArg(4) int[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean331) {
			return;
		}
		@Pc(13) Class112 local13 = null;
		if (arg4 != null) {
			arg4[0] = -1;
		}
		@Pc(25) int local25 = (arg7 & 0x7) * 8;
		@Pc(39) int local39 = (arg5 & 0x7) * 8;
		while (true) {
			@Pc(44) int local44;
			@Pc(65) int local65;
			@Pc(320) int local320;
			@Pc(69) int local69;
			while (arg2.aByteArray68.length > arg2.anInt5831) {
				local44 = arg2.method4905();
				if (local44 == 0) {
					local13 = new Class112(arg2);
				} else {
					@Pc(123) int local123;
					@Pc(161) int local161;
					@Pc(179) int local179;
					@Pc(117) int local117;
					if (local44 == 1) {
						local65 = arg2.method4905();
						if (local65 > 0) {
							for (local69 = 0; local69 < local65; local69++) {
								@Pc(78) Class177 local78 = new Class177(arg3, arg2, 2);
								if (local78.anInt4596 == 31) {
									@Pc(91) Class115 local91 = Static565.aClass188_1.method4461(arg2.method4936());
									local78.method4033(local91.anInt3318, local91.anInt3314, local91.anInt3316, local91.anInt3315);
								}
								if (arg3.method4972() > 0) {
									@Pc(111) Class4_Sub24 local111 = local78.aClass4_Sub24_1;
									local117 = local111.method7145() >> 9;
									local123 = local111.method7142() >> 9;
									if (local78.anInt4590 == arg0 && local25 <= local117 && local117 < local25 + 8 && local123 >= local39 && local123 < local39 + 8) {
										local161 = (arg1 << 9) + Static88.method2068(arg9, local111.method7142() & 0xFFF, local111.method7145() & 0xFFF);
										local179 = (arg8 << 9) + Static139.method2732(arg9, local111.method7142() & 0xFFF, local111.method7145() & 0xFFF);
										local117 = local161 >> 9;
										local123 = local179 >> 9;
										if (local117 >= 0 && local123 >= 0 && local117 < super.anInt4632 && local123 < super.anInt4639) {
											local111.method7146(super.anIntArrayArrayArray12[arg0][local117][local123] - local111.method7147(), local161, local179);
											Static417.method6529(local78);
										}
									}
								}
							}
						}
					} else if (local44 == 2) {
						if (local13 == null) {
							local13 = new Class112();
						}
						local13.method2910(arg2);
					} else if (local44 != 128) {
						if (local44 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray12 == null) {
							super.aByteArrayArrayArray12 = new byte[4][][];
						}
						for (local65 = 0; local65 < 4; local65++) {
							@Pc(301) byte local301 = arg2.method4925();
							@Pc(324) int local324;
							if (local301 == 0 && super.aByteArrayArrayArray12[arg6] != null) {
								if (arg0 >= local65) {
									local320 = arg1;
									local324 = arg1 + 7;
									local117 = arg8;
									if (arg8 < 0) {
										local117 = 0;
									} else if (arg8 >= super.anInt4639) {
										local117 = super.anInt4639;
									}
									local123 = arg8 + 7;
									if (local324 < 0) {
										local324 = 0;
									} else if (local324 >= super.anInt4632) {
										local324 = super.anInt4632;
									}
									if (arg1 < 0) {
										local320 = 0;
									} else if (arg1 >= super.anInt4632) {
										local320 = super.anInt4632;
									}
									if (local123 < 0) {
										local123 = 0;
									} else if (super.anInt4639 <= local123) {
										local123 = super.anInt4639;
									}
									while (local324 > local320) {
										while (local117 < local123) {
											super.aByteArrayArrayArray12[arg6][local320][local117] = 0;
											local117++;
										}
										local320++;
									}
								}
							} else if (local301 == 1) {
								if (super.aByteArrayArrayArray12[arg6] == null) {
									super.aByteArrayArrayArray12[arg6] = new byte[super.anInt4632 + 1][super.anInt4639 + 1];
								}
								for (local320 = 0; local320 < 64; local320 += 4) {
									for (local324 = 0; local324 < 64; local324 += 4) {
										@Pc(457) byte local457 = arg2.method4925();
										if (local65 <= arg0) {
											for (local123 = local320; local123 < local320 + 4; local123++) {
												for (local161 = local324; local161 < local324 + 4; local161++) {
													if (local123 >= local25 && local25 + 8 > local123 && local161 >= local39 && local39 + 8 > local39) {
														local179 = Static456.method6973(arg9, local161 & 0x7, local123 & 0x7) + arg1;
														@Pc(516) int local516 = Static79.method1260(local161 & 0x7, arg9, local123 & 0x7) + arg8;
														if (local179 >= 0 && local179 < super.anInt4632 && local516 >= 0 && local516 < super.anInt4639) {
															super.aByteArrayArrayArray12[arg6][local179][local516] = local457;
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
						arg2.anInt5831 += 10;
					} else {
						arg4[0] = arg2.method4936();
						arg4[1] = arg2.method4946();
						arg4[2] = arg2.method4946();
						arg4[3] = arg2.method4946();
						arg4[4] = arg2.method4936();
					}
				}
			}
			if (local13 != null) {
				Static271.method4720(local13, arg8 >> 3, arg1 >> 3);
			}
			if (super.aByteArrayArrayArray12 != null && super.aByteArrayArrayArray12[arg6] != null) {
				local44 = arg1 + 7;
				local65 = arg8 + 7;
				for (local69 = arg1; local69 < local44; local69++) {
					for (local320 = arg8; local320 < local65; local320++) {
						super.aByteArrayArrayArray12[arg6][local69][local320] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(IIB[ILclient!r;Lclient!un;)V")
	public void method4070(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class44 arg3, @OriginalArg(5) Class4_Sub11 arg4) {
		if (super.aBoolean331) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(19) Class112 local19 = null;
		while (true) {
			@Pc(33) int local33;
			@Pc(94) int local94;
			@Pc(98) int local98;
			@Pc(40) int local40;
			@Pc(86) int local86;
			label308: do {
				while (true) {
					@Pc(187) int local187;
					@Pc(191) int local191;
					while (arg4.anInt5831 < arg4.aByteArray68.length) {
						@Pc(24) int local24 = arg4.method4905();
						if (local24 == 0) {
							local19 = new Class112(arg4);
						} else {
							if (local24 == 1) {
								local33 = arg4.method4905();
								continue label308;
							}
							if (local24 == 2) {
								if (local19 == null) {
									local19 = new Class112();
								}
								local19.method2910(arg4);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray12 == null) {
									super.aByteArrayArrayArray12 = new byte[4][][];
								}
								for (local33 = 0; local33 < 4; local33++) {
									@Pc(175) byte local175 = arg4.method4925();
									if (local175 == 0 && super.aByteArrayArrayArray12[local33] != null) {
										local187 = arg0;
										local191 = arg0 + 64;
										local86 = arg1;
										if (local191 < 0) {
											local191 = 0;
										} else if (super.anInt4632 <= local191) {
											local191 = super.anInt4632;
										}
										if (arg1 < 0) {
											local86 = 0;
										} else if (super.anInt4639 <= arg1) {
											local86 = super.anInt4639;
										}
										if (arg0 < 0) {
											local187 = 0;
										} else if (arg0 >= super.anInt4632) {
											local187 = super.anInt4632;
										}
										local94 = arg1 + 64;
										if (local94 < 0) {
											local94 = 0;
										} else if (super.anInt4639 <= local94) {
											local94 = super.anInt4639;
										}
										while (local191 > local187) {
											while (local86 < local94) {
												super.aByteArrayArrayArray12[local33][local187][local86] = 0;
												local86++;
											}
											local187++;
										}
									} else if (local175 == 1) {
										if (super.aByteArrayArrayArray12[local33] == null) {
											super.aByteArrayArrayArray12[local33] = new byte[super.anInt4632 + 1][super.anInt4639 + 1];
										}
										for (local187 = 0; local187 < 64; local187 += 4) {
											for (local191 = 0; local191 < 64; local191 += 4) {
												@Pc(465) byte local465 = arg4.method4925();
												for (local94 = local187 + arg0; local94 < arg0 + local187 + 4; local94++) {
													for (local98 = arg1 + local191; local98 < local191 + arg1 + 4; local98++) {
														if (local94 >= 0 && local94 < super.anInt4632 && local98 >= 0 && super.anInt4639 > local98) {
															super.aByteArrayArrayArray12[local33][local94][local98] = local465;
														}
													}
												}
											}
										}
									} else if (local175 == 2) {
										if (super.aByteArrayArrayArray12[local33] == null) {
											super.aByteArrayArrayArray12[local33] = new byte[super.anInt4632 + 1][super.anInt4639 + 1];
										}
										if (local33 > 0) {
											local187 = arg0;
											local191 = arg0 + 64;
											local86 = arg1;
											if (arg0 < 0) {
												local187 = 0;
											} else if (arg0 >= super.anInt4632) {
												local187 = super.anInt4632;
											}
											if (local191 < 0) {
												local191 = 0;
											} else if (local191 >= super.anInt4632) {
												local191 = super.anInt4632;
											}
											if (arg1 < 0) {
												local86 = 0;
											} else if (super.anInt4639 <= arg1) {
												local86 = super.anInt4639;
											}
											local94 = arg1 + 64;
											if (local94 < 0) {
												local94 = 0;
											} else if (local94 >= super.anInt4639) {
												local94 = super.anInt4639;
											}
											while (local187 < local191) {
												while (local94 > local86) {
													super.aByteArrayArrayArray12[local33][local187][local86] = super.aByteArrayArrayArray12[local33 - 1][local187][local86];
													local86++;
												}
												local187++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg2 == null) {
								arg4.anInt5831 += 10;
							} else {
								arg2[0] = arg4.method4936();
								arg2[1] = arg4.method4946();
								arg2[2] = arg4.method4946();
								arg2[3] = arg4.method4946();
								arg2[4] = arg4.method4936();
							}
						}
					}
					if (local19 != null) {
						for (local33 = 0; local33 < 8; local33++) {
							for (local40 = 0; local40 < 8; local40++) {
								local187 = (arg0 >> 3) + local33;
								local191 = (arg1 >> 3) + local40;
								if (local187 >= 0 && local187 < super.anInt4632 >> 3 && local191 >= 0 && super.anInt4639 >> 3 > local191) {
									Static271.method4720(local19, local191, local187);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray12 != null) {
						for (local33 = 0; local33 < 4; local33++) {
							if (super.aByteArrayArrayArray12[local33] != null) {
								for (local40 = 0; local40 < 16; local40++) {
									for (local187 = 0; local187 < 16; local187++) {
										local191 = local40 + (arg0 >> 2);
										local86 = local187 + (arg1 >> 2);
										if (local191 >= 0 && local191 < 26 && local86 >= 0 && local86 < 26) {
											super.aByteArrayArrayArray12[local33][local191][local86] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local33 <= 0);
			for (local40 = 0; local40 < local33; local40++) {
				@Pc(49) Class177 local49 = new Class177(arg3, arg4, 2);
				if (local49.anInt4596 == 31) {
					@Pc(60) Class115 local60 = Static565.aClass188_1.method4461(arg4.method4936());
					local49.method4033(local60.anInt3318, local60.anInt3314, local60.anInt3316, local60.anInt3315);
				}
				if (arg3.method4972() > 0) {
					@Pc(77) Class4_Sub24 local77 = local49.aClass4_Sub24_1;
					local86 = local77.method7145() + (arg0 << 9);
					local94 = local77.method7142() + (arg1 << 9);
					local98 = local86 >> 9;
					@Pc(102) int local102 = local94 >> 9;
					if (local98 >= 0 && local102 >= 0 && local98 < super.anInt4632 && local102 < super.anInt4639) {
						local77.method7146(super.anIntArrayArrayArray12[local49.anInt4590][local98][local102] - local77.method7147(), local86, local94);
						Static417.method6529(local49);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!ga;IIIILclient!r;)V")
	public void method4071(@OriginalArg(0) int arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class44 arg5) {
		@Pc(5) Interface19 local5 = null;
		if (arg4 == 0) {
			local5 = (Interface19) Static353.method5714(arg3, arg0, arg2);
		}
		if (arg4 == 1) {
			local5 = (Interface19) Static135.method2682(arg3, arg0, arg2);
		}
		if (arg4 == 2) {
			local5 = (Interface19) Static397.method6277(arg3, arg0, arg2, pn.class);
		}
		if (arg4 == 3) {
			local5 = (Interface19) Static460.method7015(arg3, arg0, arg2);
		}
		if (local5 == null) {
			return;
		}
		@Pc(64) Class101 local64 = Static204.aClass139_8.method3309(local5.method7827());
		@Pc(70) int local70 = local5.method7825();
		@Pc(74) int local74 = local5.method7829();
		if (local64.method2713()) {
			Static239.method7071(arg0, arg2, local64, arg3);
		}
		if (local5.method7826()) {
			local5.method7824(arg5);
		}
		if (arg4 == 0) {
			Static321.method5322(arg3, arg0, arg2);
			if (local64.anInt2916 != 0) {
				arg1.method2863(local74, local64.aBoolean222, arg2, arg0, local70, !local64.aBoolean218);
			}
			if (local64.anInt2930 == 1) {
				if (local74 != 0) {
					if (local74 != 1) {
						if (local74 == 2) {
							Static582.method8266(1, arg0 + 1, arg2, arg3);
						} else if (local74 == 3) {
							Static582.method8266(2, arg0, arg2, arg3);
							return;
						}
						return;
					}
					Static582.method8266(2, arg0, arg2 + 1, arg3);
					return;
				}
				Static582.method8266(1, arg0, arg2, arg3);
				return;
			}
			return;
		}
		if (arg4 == 1) {
			Static208.method3462(arg3, arg0, arg2);
			return;
		}
		if (arg4 == 2) {
			Static361.method5835(arg3, arg0, arg2, pn.class);
			if (local64.anInt2916 != 0 && super.anInt4632 > arg0 + local64.anInt2946 && arg2 + local64.anInt2946 < super.anInt4639 && local64.anInt2969 + arg0 < super.anInt4632 && arg2 + local64.anInt2969 < super.anInt4639) {
				arg1.method2858(arg2, local64.anInt2946, local64.anInt2969, !local64.aBoolean218, local74, local64.aBoolean222, arg0);
				return;
			}
			return;
		}
		if (arg4 != 3) {
			return;
		}
		Static196.method3383(arg3, arg0, arg2);
		if (local64.anInt2916 == 1) {
			arg1.method2864(arg2, arg0);
			return;
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!r;[Lclient!ga;III[B)V")
	public void method4072(@OriginalArg(0) Class44 arg0, @OriginalArg(1) Class111[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(15) Class4_Sub11 local15 = new Class4_Sub11(arg4);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method4924();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method4942();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local15.method4905();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(72) int local72 = local51 + arg3;
				@Pc(77) int local77 = local45 + arg2;
				if (local72 > 0 && local77 > 0 && local72 < super.anInt4632 - 1 && super.anInt4639 - 1 > local77) {
					@Pc(95) Class111 local95 = null;
					if (!super.aBoolean331) {
						@Pc(100) int local100 = local55;
						if ((Static262.aByteArrayArrayArray16[1][local72][local77] & 0x2) == 2) {
							local100 = local55 - 1;
						}
						if (local100 >= 0) {
							local95 = arg1[local100];
						}
					}
					this.method4077(local95, local67, local72, local63, local17, arg0, local77, local55, local55, -1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(II[Lclient!ga;[BILclient!r;IIIII)V")
	public void method4075(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class111[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class44 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		@Pc(10) Class4_Sub11 local10 = new Class4_Sub11(arg3);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method4924();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method4942();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 >> 12;
				@Pc(57) int local57 = local10.method4905();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (arg7 == local53 && arg1 <= local49 && local49 < arg1 + 8 && local43 >= arg6 && local43 < arg6 + 8) {
					@Pc(101) Class101 local101 = Static204.aClass139_8.method3309(local12);
					@Pc(121) int local121 = arg0 + Static396.method6276(local43 & 0x7, arg4, local65, local101.anInt2969, local49 & 0x7, local101.anInt2946);
					@Pc(139) int local139 = arg9 + Static247.method3959(local43 & 0x7, local101.anInt2946, local49 & 0x7, local65, arg4, local101.anInt2969);
					if (local121 > 0 && local139 > 0 && super.anInt4632 - 1 > local121 && super.anInt4639 - 1 > local139) {
						@Pc(161) Class111 local161 = null;
						if (!super.aBoolean331) {
							@Pc(166) int local166 = arg8;
							if ((Static262.aByteArrayArrayArray16[1][local121][local139] & 0x2) == 2) {
								local166 = arg8 - 1;
							}
							if (local166 >= 0) {
								local161 = arg2[local166];
							}
						}
						this.method4077(local161, local65 + arg4 & 0x3, local121, local61, local12, arg5, local139, arg8, arg8, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(Lclient!ga;IIIIILclient!r;IIII)V")
	public void method4077(@OriginalArg(0) Class111 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class44 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static214.aClass4_Sub19_Sub1_1.method2784(Static495.anInt9000) && !Static560.method8056(arg2, Static223.anInt4078, arg8, arg6)) {
			return;
		}
		if (this.anInt4648 > arg7) {
			this.anInt4648 = arg7;
		}
		@Pc(32) Class101 local32 = Static204.aClass139_8.method3309(arg4);
		if (arg5.method5022() && Static214.aClass4_Sub19_Sub1_1.aBoolean256 && local32.aBoolean223) {
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg1 == 1 || arg1 == 3) {
			local53 = local32.anInt2969;
			local56 = local32.anInt2946;
		} else {
			local53 = local32.anInt2946;
			local56 = local32.anInt2969;
		}
		@Pc(80) int local80;
		@Pc(89) int local89;
		if (local53 + arg2 <= super.anInt4632) {
			local80 = (local53 >> 1) + arg2;
			local89 = arg2 + (local53 + 1 >> 1);
		} else {
			local89 = arg2 + 1;
			local80 = arg2;
		}
		@Pc(113) int local113;
		@Pc(111) int local111;
		if (super.anInt4639 < arg6 + local56) {
			local111 = arg6 + 1;
			local113 = arg6;
		} else {
			local111 = (local56 + 1 >> 1) + arg6;
			local113 = (local56 >> 1) + arg6;
		}
		@Pc(133) Class83 local133 = Static499.aClass83Array3[arg8];
		@Pc(164) int local164 = local133.method7217(local113, local80) + local133.method7217(local113, local89) + local133.method7217(local111, local80) + local133.method7217(local111, local89) >> 2;
		@Pc(173) int local173 = (arg2 << 9) + (local53 << 8);
		@Pc(181) int local181 = (local56 << 8) + (arg6 << 9);
		@Pc(193) boolean local193 = Static537.aBoolean647 && !super.aBoolean331 && local32.aBoolean219;
		if (local32.method2713()) {
			Static57.method963(arg2, arg1, null, arg7, arg6, local32, null);
		}
		@Pc(227) boolean local227 = arg9 == -1 && local32.anInt2962 == -1 && local32.anIntArray137 == null && local32.anIntArray140 == null && !local32.aBoolean225;
		if (Static550.aBoolean686 && (Static226.method3711(arg3) && local32.anInt2930 != 1 || !(!Static51.method668(arg3) || local32.anInt2930 != 0))) {
			return;
		}
		if (arg3 != 22) {
			@Pc(376) Class1_Sub4_Sub2 local376;
			@Pc(337) Class1_Sub4_Sub2_Sub3 local337;
			@Pc(374) int local374;
			@Pc(435) int local435;
			if (arg3 == 10 || arg3 == 11) {
				local337 = null;
				if (local227) {
					@Pc(368) Class1_Sub4_Sub2_Sub3 local368 = new Class1_Sub4_Sub2_Sub3(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg2, arg2 + local53 - 1, arg6, local56 + arg6 - 1, arg3, arg1, local193);
					local337 = local368;
					local374 = local368.method7741();
					local376 = local368;
				} else {
					local374 = 15;
					local376 = new Class1_Sub4_Sub2_Sub4(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg2, arg2 + local53 - 1, arg6, arg6 + local56 - 1, arg3, arg1, arg9);
				}
				if (Static101.method2202(local376, false)) {
					if (local337 != null && local337.method7826()) {
						local337.method7830(arg5);
					}
					if (local32.aBoolean217 && Static537.aBoolean647) {
						if (local374 > 30) {
							local374 = 30;
						}
						for (local435 = 0; local435 <= local53; local435++) {
							for (@Pc(439) int local439 = 0; local439 <= local56; local439++) {
								local133.a(local435 + arg2, arg6 + local439, local374);
							}
						}
					}
				}
				if (local32.anInt2916 != 0 && arg0 != null) {
					arg0.method2861(local56, local53, !local32.aBoolean218, arg2, arg6, local32.aBoolean222);
				}
			} else if (arg3 >= 12 && arg3 <= 17 || arg3 >= 18 && arg3 <= 21) {
				if (local227) {
					local337 = new Class1_Sub4_Sub2_Sub3(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg2, arg2 + local53 - 1, arg6, arg6 + local56 - 1, arg3, arg1, local193);
					if (local337.method7826()) {
						local337.method7830(arg5);
					}
					local376 = local337;
				} else {
					local376 = new Class1_Sub4_Sub2_Sub4(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg2, arg2 + local53 - 1, arg6, local56 + arg6 - 1, arg3, arg1, arg9);
				}
				Static101.method2202(local376, false);
				if (Static537.aBoolean647 && !super.aBoolean331 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg7 > 0 && local32.anInt2930 != 0) {
					super.aByteArrayArrayArray15[arg7][arg2][arg6] = (byte) (super.aByteArrayArrayArray15[arg7][arg2][arg6] | 0x4);
				}
				if (local32.anInt2916 != 0 && arg0 != null) {
					arg0.method2861(local56, local53, !local32.aBoolean218, arg2, arg6, local32.aBoolean222);
				}
			} else {
				@Pc(679) Class1_Sub4_Sub5 local679;
				if (arg3 == 0) {
					@Pc(653) int local653 = local32.anInt2930;
					if (Static400.aBoolean524 && local32.anInt2930 == -1) {
						local653 = 1;
					}
					if (local227) {
						@Pc(697) Class1_Sub4_Sub5_Sub2 local697 = new Class1_Sub4_Sub5_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg3, arg1, local193);
						if (local697.method7826()) {
							local697.method7830(arg5);
						}
						local679 = local697;
					} else {
						local679 = new Class1_Sub4_Sub5_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg3, arg1, arg9);
					}
					Static28.method363(arg7, arg2, arg6, local679, null);
					if (arg1 == 0) {
						if (Static537.aBoolean647 && local32.aBoolean217) {
							local133.a(arg2, arg6, 50);
							local133.a(arg2, arg6 + 1, 50);
						}
						if (local653 == 1 && !super.aBoolean331) {
							Static516.method7523(1, arg2, local32.anInt2928, local32.anInt2971, arg6, arg7);
						}
					} else if (arg1 == 1) {
						if (Static537.aBoolean647 && local32.aBoolean217) {
							local133.a(arg2, arg6 + 1, 50);
							local133.a(arg2 + 1, arg6 + 1, 50);
						}
						if (local653 == 1 && !super.aBoolean331) {
							Static516.method7523(2, arg2, -local32.anInt2928, local32.anInt2971, arg6 + 1, arg7);
						}
					} else if (arg1 == 2) {
						if (Static537.aBoolean647 && local32.aBoolean217) {
							local133.a(arg2 + 1, arg6, 50);
							local133.a(arg2 + 1, arg6 - -1, 50);
						}
						if (local653 == 1 && !super.aBoolean331) {
							Static516.method7523(1, arg2 + 1, -local32.anInt2928, local32.anInt2971, arg6, arg7);
						}
					} else if (arg1 == 3) {
						if (Static537.aBoolean647 && local32.aBoolean217) {
							local133.a(arg2, arg6, 50);
							local133.a(arg2 + 1, arg6, 50);
						}
						if (local653 == 1 && !super.aBoolean331) {
							Static516.method7523(2, arg2, local32.anInt2928, local32.anInt2971, arg6, arg7);
						}
					}
					if (local32.anInt2916 != 0 && arg0 != null) {
						arg0.method2851(arg3, !local32.aBoolean218, arg2, arg6, local32.aBoolean222, arg1);
					}
					if (local32.anInt2950 != 64) {
						Static157.method2914(arg7, arg2, arg6, local32.anInt2950);
					}
				} else {
					@Pc(965) Class1_Sub4_Sub5_Sub2 local965;
					@Pc(947) Class1_Sub4_Sub5 local947;
					if (arg3 == 1) {
						if (local227) {
							local965 = new Class1_Sub4_Sub5_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg3, arg1, local193);
							if (local965.method7826()) {
								local965.method7830(arg5);
							}
							local947 = local965;
						} else {
							local947 = new Class1_Sub4_Sub5_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg3, arg1, arg9);
						}
						Static28.method363(arg7, arg2, arg6, local947, null);
						if (local32.aBoolean217 && Static537.aBoolean647) {
							if (arg1 == 0) {
								local133.a(arg2, arg6 + 1, 50);
							} else if (arg1 == 1) {
								local133.a(arg2 + 1, arg6 + 1, 50);
							} else if (arg1 == 2) {
								local133.a(arg2 + 1, arg6, 50);
							} else if (arg1 == 3) {
								local133.a(arg2, arg6, 50);
							}
						}
						if (local32.anInt2916 != 0 && arg0 != null) {
							arg0.method2851(arg3, !local32.aBoolean218, arg2, arg6, local32.aBoolean222, arg1);
						}
					} else if (arg3 == 2) {
						local374 = arg1 + 1 & 0x3;
						if (local227) {
							@Pc(1128) Class1_Sub4_Sub5_Sub2 local1128 = new Class1_Sub4_Sub5_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg3, arg1 + 4, local193);
							@Pc(1144) Class1_Sub4_Sub5_Sub2 local1144 = new Class1_Sub4_Sub5_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg3, local374, local193);
							if (local1128.method7826()) {
								local1128.method7830(arg5);
							}
							local947 = local1128;
							local679 = local1144;
							if (local1144.method7826()) {
								local1144.method7830(arg5);
							}
						} else {
							local947 = new Class1_Sub4_Sub5_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg3, arg1 + 4, arg9);
							local679 = new Class1_Sub4_Sub5_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg3, local374, arg9);
						}
						Static28.method363(arg7, arg2, arg6, local947, local679);
						if ((local32.anInt2930 == 1 || Static400.aBoolean524 && local32.anInt2930 == -1) && !super.aBoolean331) {
							if (arg1 == 0) {
								Static516.method7523(1, arg2, local32.anInt2928, local32.anInt2971, arg6, arg7);
								Static516.method7523(2, arg2, local32.anInt2928, local32.anInt2971, arg6 + 1, arg7);
							} else if (arg1 == 1) {
								Static516.method7523(1, arg2 + 1, local32.anInt2928, local32.anInt2971, arg6, arg7);
								Static516.method7523(2, arg2, local32.anInt2928, local32.anInt2971, arg6 + 1, arg7);
							} else if (arg1 == 2) {
								Static516.method7523(1, arg2 + 1, local32.anInt2928, local32.anInt2971, arg6, arg7);
								Static516.method7523(2, arg2, local32.anInt2928, local32.anInt2971, arg6, arg7);
							} else if (arg1 == 3) {
								Static516.method7523(1, arg2, local32.anInt2928, local32.anInt2971, arg6, arg7);
								Static516.method7523(2, arg2, local32.anInt2928, local32.anInt2971, arg6, arg7);
							}
						}
						if (local32.anInt2916 != 0 && arg0 != null) {
							arg0.method2851(arg3, !local32.aBoolean218, arg2, arg6, local32.aBoolean222, arg1);
						}
						if (local32.anInt2950 != 64) {
							Static157.method2914(arg7, arg2, arg6, local32.anInt2950);
						}
					} else if (arg3 == 3) {
						if (local227) {
							local965 = new Class1_Sub4_Sub5_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg3, arg1, local193);
							if (local965.method7826()) {
								local965.method7830(arg5);
							}
							local947 = local965;
						} else {
							local947 = new Class1_Sub4_Sub5_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg3, arg1, arg9);
						}
						Static28.method363(arg7, arg2, arg6, local947, null);
						if (local32.aBoolean217 && Static537.aBoolean647) {
							if (arg1 == 0) {
								local133.a(arg2, arg6 + 1, 50);
							} else if (arg1 == 1) {
								local133.a(arg2 + 1, arg6 + 1, 50);
							} else if (arg1 == 2) {
								local133.a(arg2 + 1, arg6, 50);
							} else if (arg1 == 3) {
								local133.a(arg2, arg6, 50);
							}
						}
						if (local32.anInt2916 != 0 && arg0 != null) {
							arg0.method2851(arg3, !local32.aBoolean218, arg2, arg6, local32.aBoolean222, arg1);
						}
					} else if (arg3 == 9) {
						if (local227) {
							local337 = new Class1_Sub4_Sub2_Sub3(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg2, arg2, arg6, arg6, arg3, arg1, local193);
							if (local337.method7826()) {
								local337.method7830(arg5);
							}
							local376 = local337;
						} else {
							local376 = new Class1_Sub4_Sub2_Sub4(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg2, arg2 + local53 - 1, arg6, local56 + arg6 - 1, arg3, arg1, arg9);
						}
						Static101.method2202(local376, false);
						if (local32.anInt2916 != 0 && arg0 != null) {
							arg0.method2861(local56, local53, !local32.aBoolean218, arg2, arg6, local32.aBoolean222);
						}
						if (local32.anInt2950 != 64) {
							Static157.method2914(arg7, arg2, arg6, local32.anInt2950);
						}
					} else {
						@Pc(1603) Class1_Sub4_Sub1 local1603;
						if (arg3 == 4) {
							if (local227) {
								@Pc(1622) Class1_Sub4_Sub1_Sub2 local1622 = new Class1_Sub4_Sub1_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, 0, 0, arg3, arg1);
								local1603 = local1622;
								if (local1622.method7826()) {
									local1622.method7830(arg5);
								}
							} else {
								local1603 = new Class1_Sub4_Sub1_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, 0, 0, arg3, arg1, arg9);
							}
							Static536.method7778(arg7, arg2, arg6, local1603, null);
						} else {
							@Pc(1648) int local1648;
							@Pc(1654) Interface19 local1654;
							@Pc(1723) Class1_Sub4_Sub1_Sub2 local1723;
							if (arg3 == 5) {
								local1648 = 65;
								local1654 = (Interface19) Static353.method5714(arg7, arg2, arg6);
								if (local1654 != null) {
									local1648 = Static204.aClass139_8.method3309(local1654.method7827()).anInt2950 + 1;
								}
								if (local227) {
									local1723 = new Class1_Sub4_Sub1_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, local1648 * Static368.anIntArray366[arg1], Static519.anIntArray502[arg1] * local1648, arg3, arg1);
									local1603 = local1723;
									if (local1723.method7826()) {
										local1723.method7830(arg5);
									}
								} else {
									local1603 = new Class1_Sub4_Sub1_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, local1648 * Static368.anIntArray366[arg1], Static519.anIntArray502[arg1] * local1648, arg3, arg1, arg9);
								}
								Static536.method7778(arg7, arg2, arg6, local1603, null);
							} else if (arg3 == 6) {
								local1648 = 33;
								local1654 = (Interface19) Static353.method5714(arg7, arg2, arg6);
								if (local1654 != null) {
									local1648 = Static204.aClass139_8.method3309(local1654.method7827()).anInt2950 / 2 + 1;
								}
								if (local227) {
									local1723 = new Class1_Sub4_Sub1_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, Static368.anIntArray366[arg1] * local1648, local1648 * Static519.anIntArray502[arg1], arg3, arg1 + 4);
									if (local1723.method7826()) {
										local1723.method7830(arg5);
									}
									local1603 = local1723;
								} else {
									local1603 = new Class1_Sub4_Sub1_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, Static595.anIntArray557[arg1] * local1648, Static468.anIntArray108[arg1] * local1648, arg3, arg1 + 4, arg9);
								}
								Static536.method7778(arg7, arg2, arg6, local1603, null);
							} else if (arg3 == 7) {
								local1648 = arg1 + 2 & 0x3;
								if (local227) {
									@Pc(1875) Class1_Sub4_Sub1_Sub2 local1875 = new Class1_Sub4_Sub1_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, 0, 0, arg3, local1648 + 4);
									if (local1875.method7826()) {
										local1875.method7830(arg5);
									}
									local1603 = local1875;
								} else {
									local1603 = new Class1_Sub4_Sub1_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, 0, 0, arg3, local1648 + 4, arg9);
								}
								Static536.method7778(arg7, arg2, arg6, local1603, null);
							} else if (arg3 == 8) {
								local374 = arg1 + 2 & 0x3;
								local435 = 33;
								@Pc(1933) Interface19 local1933 = (Interface19) Static353.method5714(arg7, arg2, arg6);
								if (local1933 != null) {
									local435 = Static204.aClass139_8.method3309(local1933.method7827()).anInt2950 / 2 + 1;
								}
								@Pc(1976) Class1_Sub4_Sub1 local1976;
								@Pc(1995) Class1_Sub4_Sub1 local1995;
								if (local227) {
									local1976 = new Class1_Sub4_Sub1_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, Static595.anIntArray557[arg1] * local435, Static468.anIntArray108[arg1] * local435, arg3, arg1 + 4);
									local1995 = new Class1_Sub4_Sub1_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, 0, 0, arg3, local374 + 4);
									if (local1976.method7826()) {
										local1976.method7830(arg5);
									}
									if (local1995.method7826()) {
										local1995.method7830(arg5);
									}
								} else {
									local1976 = new Class1_Sub4_Sub1_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, local435 * Static595.anIntArray557[arg1], Static468.anIntArray108[arg1] * local435, arg3, arg1 + 4, arg9);
									local1995 = new Class1_Sub4_Sub1_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, 0, 0, arg3, local374 + 4, arg9);
								}
								Static536.method7778(arg7, arg2, arg6, local1976, local1995);
							}
						}
					}
				}
			}
		} else if (Static214.aClass4_Sub19_Sub1_1.aBoolean264 || local32.anInt2924 != 0 || local32.anInt2916 == 1 || local32.lb) {
			@Pc(283) Class1_Sub4_Sub4 local283;
			if (local227) {
				@Pc(300) Class1_Sub4_Sub4_Sub1 local300 = new Class1_Sub4_Sub4_Sub1(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg1, local193);
				if (local300.method7826()) {
					local300.method7830(arg5);
				}
				local283 = local300;
			} else {
				local283 = new Class1_Sub4_Sub4_Sub2(arg5, local32, arg7, arg8, local173, local164, local181, super.aBoolean331, arg1, arg9);
			}
			Static567.method8139(arg7, arg2, arg6, local283);
			if (local32.anInt2916 == 1 && arg0 != null) {
				arg0.method2862(arg6, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!js", name = "a", descriptor = "(ILclient!r;Z)V")
	public void method4078(@OriginalArg(1) Class44 arg0, @OriginalArg(2) boolean arg1) {
		Static146.method2802();
		if (!arg1) {
			@Pc(21) int local21;
			@Pc(25) int local25;
			if (super.anInt4634 > 1) {
				for (local21 = 0; local21 < super.anInt4632; local21++) {
					for (local25 = 0; local25 < super.anInt4639; local25++) {
						if ((Static262.aByteArrayArrayArray16[1][local21][local25] & 0x2) == 2) {
							Static594.method8376(local21, local25);
						}
					}
				}
			}
			for (local21 = 0; local21 < super.anInt4634; local21++) {
				for (local25 = 0; local25 <= super.anInt4639; local25++) {
					for (@Pc(61) int local61 = 0; super.anInt4632 >= local61; local61++) {
						if ((super.aByteArrayArrayArray15[local21][local61][local25] & 0x4) != 0) {
							@Pc(76) int local76 = local61;
							@Pc(78) int local78 = local61;
							@Pc(80) int local80 = local25;
							@Pc(82) int local82 = local25;
							while (local80 > 0 && (super.aByteArrayArrayArray15[local21][local61][local80 - 1] & 0x4) != 0 && local25 - local80 < 10) {
								local80--;
							}
							while (super.anInt4639 > local82 && (super.aByteArrayArrayArray15[local21][local61][local82 + 1] & 0x4) != 0 && local82 - local80 < 10) {
								local82++;
							}
							@Pc(142) int local142;
							label111: while (local76 > 0 && local61 - local76 < 10) {
								for (local142 = local80; local142 <= local82; local142++) {
									if ((super.aByteArrayArrayArray15[local21][local76 - 1][local142] & 0x4) == 0) {
										break label111;
									}
								}
								local76--;
							}
							label98: while (super.anInt4632 > local78 && local78 - local76 < 10) {
								for (local142 = local80; local142 <= local82; local142++) {
									if ((super.aByteArrayArrayArray15[local21][local78 + 1][local142] & 0x4) == 0) {
										break label98;
									}
								}
								local78++;
							}
							if ((local82 + 1 - local80) * (-local76 + 1 + local78) >= 4) {
								local142 = super.anIntArrayArrayArray12[local21][local76][local80];
								Static209.method3503((local82 << 9) + 512, local76 << 9, local21, local80 << 9, local142, (local78 << 9) + 512, local142);
								for (@Pc(271) int local271 = local76; local271 <= local78; local271++) {
									for (@Pc(275) int local275 = local80; local275 <= local82; local275++) {
										super.aByteArrayArrayArray15[local21][local271][local275] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static80.method7921();
		}
		super.aByteArrayArrayArray15 = null;
	}
}
