import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uu")
public final class Class114_Sub1 extends Class114 {

	@OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
	public int anInt10218 = 99;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(IIIZ)V")
	public Class114_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static87.aClass286_3, Static461.aClass143_4);
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZIIII)Lclient!et;")
	public Interface9 method8689(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(12) Interface9 local12 = null;
		if (arg1 == 0) {
			local12 = (Interface9) Static518.method6967(arg0, arg2, arg3);
		}
		if (arg1 == 1) {
			local12 = (Interface9) Static233.method3389(arg0, arg2, arg3);
		}
		if (arg1 == 2) {
			local12 = (Interface9) Static405.method5449(arg0, arg2, arg3, Static667.aClass29 == null ? (Static667.aClass29 = a("et")) : Static667.aClass29);
		}
		if (arg1 == 3) {
			local12 = (Interface9) Static198.method3049(arg0, arg2, arg3);
		}
		return local12;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IILclient!ika;Lclient!ha;I)V")
	public void method8691(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub2 arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) int arg3) {
		if (super.aBoolean680) {
			return;
		}
		@Pc(30) boolean local30 = false;
		@Pc(32) Class208 local32 = null;
		while (true) {
			@Pc(50) int local50;
			@Pc(108) int local108;
			@Pc(112) int local112;
			@Pc(54) int local54;
			@Pc(99) int local99;
			label308: do {
				while (true) {
					@Pc(39) int local39;
					@Pc(258) int local258;
					@Pc(262) int local262;
					while (arg1.anInt2178 < arg1.aByteArray20.length) {
						local39 = arg1.method2048(255);
						if (local39 != 0) {
							if (local39 == 1) {
								local50 = arg1.method2048(255);
								continue label308;
							}
							if (local39 == 2) {
								if (local32 == null) {
									local32 = new Class208();
								}
								local32.method4841(arg1);
							} else if (local39 == 128) {
								if (local32 == null) {
									local32 = new Class208();
								}
								local32.method4843(arg1);
							} else if (local39 == 129) {
								if (super.aByteArrayArrayArray14 == null) {
									super.aByteArrayArrayArray14 = new byte[4][][];
								}
								for (local50 = 0; local50 < 4; local50++) {
									@Pc(244) byte local244 = arg1.method2022();
									if (local244 == 0 && super.aByteArrayArrayArray14[local50] != null) {
										local258 = arg3;
										local262 = arg3 + 64;
										local99 = arg0;
										if (local262 < 0) {
											local262 = 0;
										} else if (super.anInt10206 <= local262) {
											local262 = super.anInt10206;
										}
										local108 = arg0 + 64;
										if (arg3 < 0) {
											local258 = 0;
										} else if (arg3 >= super.anInt10206) {
											local258 = super.anInt10206;
										}
										if (arg0 < 0) {
											local99 = 0;
										} else if (arg0 >= super.anInt10203) {
											local99 = super.anInt10203;
										}
										if (local108 < 0) {
											local108 = 0;
										} else if (local108 >= super.anInt10203) {
											local108 = super.anInt10203;
										}
										while (local262 > local258) {
											while (local99 < local108) {
												super.aByteArrayArrayArray14[local50][local258][local99] = 0;
												local99++;
											}
											local258++;
										}
									} else if (local244 == 1) {
										if (super.aByteArrayArrayArray14[local50] == null) {
											super.aByteArrayArrayArray14[local50] = new byte[super.anInt10206 + 1][super.anInt10203 + 1];
										}
										for (local258 = 0; local258 < 64; local258 += 4) {
											for (local262 = 0; local262 < 64; local262 += 4) {
												@Pc(574) byte local574 = arg1.method2022();
												for (local108 = local258 + arg3; local108 < arg3 + local258 + 4; local108++) {
													for (local112 = arg0 + local262; local112 < arg0 + local262 + 4; local112++) {
														if (local108 >= 0 && super.anInt10206 > local108 && local112 >= 0 && local112 < super.anInt10203) {
															super.aByteArrayArrayArray14[local50][local108][local112] = local574;
														}
													}
												}
											}
										}
									} else if (local244 == 2) {
										if (super.aByteArrayArrayArray14[local50] == null) {
											super.aByteArrayArrayArray14[local50] = new byte[super.anInt10206 + 1][super.anInt10203 + 1];
										}
										if (local50 > 0) {
											local258 = arg3;
											local262 = arg3 + 64;
											local99 = arg0;
											if (arg0 < 0) {
												local99 = 0;
											} else if (arg0 >= super.anInt10203) {
												local99 = super.anInt10203;
											}
											if (local262 < 0) {
												local262 = 0;
											} else if (super.anInt10206 <= local262) {
												local262 = super.anInt10206;
											}
											if (arg3 < 0) {
												local258 = 0;
											} else if (super.anInt10206 <= arg3) {
												local258 = super.anInt10206;
											}
											local108 = arg0 + 64;
											if (local108 < 0) {
												local108 = 0;
											} else if (local108 >= super.anInt10203) {
												local108 = super.anInt10203;
											}
											while (local258 < local262) {
												while (local108 > local99) {
													super.aByteArrayArrayArray14[local50][local258][local99] = super.aByteArrayArrayArray14[local50 - 1][local258][local99];
													local99++;
												}
												local258++;
											}
										}
									}
								}
								local30 = true;
							} else {
								throw new IllegalStateException("");
							}
						} else if (local32 == null) {
							local32 = new Class208(arg1);
						} else {
							local32.method4838(arg1);
						}
					}
					if (local32 != null) {
						for (local39 = 0; local39 < 8; local39++) {
							for (local50 = 0; local50 < 8; local50++) {
								local54 = local39 + (arg3 >> 3);
								local258 = local50 + (arg0 >> 3);
								if (local54 >= 0 && local54 < super.anInt10206 >> 3 && local258 >= 0 && local258 < super.anInt10203 >> 3) {
									Static134.method2371(local258, local54, local32);
								}
							}
						}
					}
					if (!local30 && super.aByteArrayArrayArray14 != null) {
						for (local39 = 0; local39 < 4; local39++) {
							if (super.aByteArrayArrayArray14[local39] != null) {
								for (local50 = 0; local50 < 16; local50++) {
									for (local54 = 0; local54 < 16; local54++) {
										local258 = (arg3 >> 2) + local50;
										local262 = (arg0 >> 2) + local54;
										if (local258 >= 0 && local258 < 26 && local262 >= 0 && local262 < 26) {
											super.aByteArrayArrayArray14[local39][local258][local262] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local50 <= 0);
			for (local54 = 0; local54 < local50; local54++) {
				@Pc(63) Class8 local63 = new Class8(arg2, arg1, 2);
				if (local63.anInt250 == 31) {
					@Pc(74) Class327 local74 = Static242.aClass205_1.method4781(arg1.method2028(-14795));
					local63.method257(local74.anInt8605, local74.anInt8604, local74.anInt8598, local74.anInt8606);
				}
				if (arg2.method9362() > 0) {
					@Pc(91) Class3_Sub5 local91 = local63.aClass3_Sub5_1;
					local99 = (arg3 << 9) + local91.method7174();
					local108 = local91.method7177() + (arg0 << 9);
					local112 = local99 >> 9;
					@Pc(116) int local116 = local108 >> 9;
					if (local112 >= 0 && local116 >= 0 && local112 < super.anInt10206 && super.anInt10203 > local116) {
						local91.method7178(local108, super.anIntArrayArrayArray14[local63.anInt245][local112][local116] - local91.method7175(), local99);
						Static81.method1779(local63);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IILclient!ika;Lclient!ha;IIIIII)V")
	public void method8692(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub2 arg2, @OriginalArg(3) Class22 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (super.aBoolean680) {
			return;
		}
		@Pc(12) boolean local12 = false;
		@Pc(27) Class208 local27 = null;
		@Pc(33) int local33 = (arg8 & 0x7) * 8;
		@Pc(39) int local39 = (arg0 & 0x7) * 8;
		while (true) {
			@Pc(44) int local44;
			@Pc(76) int local76;
			@Pc(337) int local337;
			@Pc(80) int local80;
			while (arg2.anInt2178 < arg2.aByteArray20.length) {
				local44 = arg2.method2048(255);
				if (local44 != 0) {
					@Pc(134) int local134;
					@Pc(188) int local188;
					@Pc(206) int local206;
					@Pc(128) int local128;
					if (local44 == 1) {
						local76 = arg2.method2048(255);
						if (local76 > 0) {
							for (local80 = 0; local80 < local76; local80++) {
								@Pc(89) Class8 local89 = new Class8(arg3, arg2, 2);
								if (local89.anInt250 == 31) {
									@Pc(102) Class327 local102 = Static242.aClass205_1.method4781(arg2.method2028(-14795));
									local89.method257(local102.anInt8605, local102.anInt8604, local102.anInt8598, local102.anInt8606);
								}
								if (arg3.method9362() > 0) {
									@Pc(122) Class3_Sub5 local122 = local89.aClass3_Sub5_1;
									local128 = local122.method7174() >> 9;
									local134 = local122.method7177() >> 9;
									if (arg4 == local89.anInt245 && local128 >= local33 && local128 < local33 + 8 && local134 >= local39 && local134 < local39 + 8) {
										local188 = Static250.method3522(local122.method7174() & 0xFFF, arg5, local122.method7177() & 0xFFF) + (arg6 << 9);
										local206 = Static320.method4668(local122.method7177() & 0xFFF, local122.method7174() & 0xFFF, arg5) + (arg1 << 9);
										local128 = local188 >> 9;
										local134 = local206 >> 9;
										if (local128 >= 0 && local134 >= 0 && super.anInt10206 > local128 && super.anInt10203 > local134) {
											local122.method7178(local206, super.anIntArrayArrayArray14[arg4][local128][local134] - local122.method7175(), local188);
											Static81.method1779(local89);
										}
									}
								}
							}
						}
					} else if (local44 == 2) {
						if (local27 == null) {
							local27 = new Class208();
						}
						local27.method4841(arg2);
					} else if (local44 == 128) {
						if (local27 == null) {
							local27 = new Class208();
						}
						local27.method4843(arg2);
					} else if (local44 == 129) {
						if (super.aByteArrayArrayArray14 == null) {
							super.aByteArrayArrayArray14 = new byte[4][][];
						}
						for (local76 = 0; local76 < 4; local76++) {
							@Pc(321) byte local321 = arg2.method2022();
							@Pc(341) int local341;
							if (local321 == 0 && super.aByteArrayArrayArray14[arg7] != null) {
								if (local76 <= arg4) {
									local337 = arg6;
									local341 = arg6 + 7;
									local128 = arg1;
									local134 = arg1 + 7;
									if (arg1 < 0) {
										local128 = 0;
									} else if (arg1 >= super.anInt10203) {
										local128 = super.anInt10203;
									}
									if (arg6 < 0) {
										local337 = 0;
									} else if (super.anInt10206 <= arg6) {
										local337 = super.anInt10206;
									}
									if (local341 < 0) {
										local341 = 0;
									} else if (local341 >= super.anInt10206) {
										local341 = super.anInt10206;
									}
									if (local134 < 0) {
										local134 = 0;
									} else if (local134 >= super.anInt10203) {
										local134 = super.anInt10203;
									}
									while (local341 > local337) {
										while (local134 > local128) {
											super.aByteArrayArrayArray14[arg7][local337][local128] = 0;
											local128++;
										}
										local337++;
									}
								}
							} else if (local321 == 1) {
								if (super.aByteArrayArrayArray14[arg7] == null) {
									super.aByteArrayArrayArray14[arg7] = new byte[super.anInt10206 + 1][super.anInt10203 + 1];
								}
								for (local337 = 0; local337 < 64; local337 += 4) {
									for (local341 = 0; local341 < 64; local341 += 4) {
										@Pc(489) byte local489 = arg2.method2022();
										if (local76 <= arg4) {
											for (local134 = local337; local134 < local337 + 4; local134++) {
												for (local188 = local341; local188 < local341 + 4; local188++) {
													if (local33 <= local134 && local134 < local33 + 8 && local39 <= local188 && local39 + 8 > local188) {
														local206 = Static566.method7352(local188 & 0x7, arg5, local134 & 0x7) + arg6;
														@Pc(569) int local569 = arg1 + Static597.method7696(arg5, local134 & 0x7, local188 & 0x7);
														if (local206 >= 0 && local206 < super.anInt10206 && local569 >= 0 && local569 < super.anInt10203) {
															super.aByteArrayArrayArray14[arg7][local206][local569] = local489;
															local12 = true;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else {
						throw new IllegalStateException("");
					}
				} else if (local27 == null) {
					local27 = new Class208(arg2);
				} else {
					local27.method4838(arg2);
				}
			}
			if (local27 != null) {
				Static134.method2371(arg1 >> 3, arg6 >> 3, local27);
			}
			if (!local12 && super.aByteArrayArrayArray14 != null && super.aByteArrayArrayArray14[arg7] != null) {
				local44 = arg6 + 7;
				local76 = arg1 + 7;
				for (local80 = arg6; local80 < local44; local80++) {
					for (local337 = arg1; local337 < local76; local337++) {
						super.aByteArrayArrayArray14[arg7][local80][local337] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILclient!ha;[B[Lclient!fe;BI)V")
	public void method8693(@OriginalArg(0) int arg0, @OriginalArg(1) Class22 arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) Class109[] arg3, @OriginalArg(5) int arg4) {
		@Pc(18) Class3_Sub2 local18 = new Class3_Sub2(arg2);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method2013();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method2054();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 & 0x3F;
				@Pc(60) int local60 = local35 >> 6 & 0x3F;
				@Pc(64) int local64 = local35 >> 12;
				@Pc(68) int local68 = local18.method2048(255);
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				@Pc(80) int local80 = arg4 + local60;
				@Pc(84) int local84 = local54 + arg0;
				if (local80 > 0 && local84 > 0 && super.anInt10206 - 1 > local80 && local84 < super.anInt10203 - 1) {
					@Pc(111) Class109 local111 = null;
					if (!super.aBoolean680) {
						@Pc(116) int local116 = local64;
						if ((Static510.aByteArrayArrayArray11[1][local80][local84] & 0x2) == 2) {
							local116 = local64 - 1;
						}
						if (local116 >= 0) {
							local111 = arg3[local116];
						}
					}
					this.method8697(-1, local76, local72, local80, local84, arg1, local64, local64, local111, local20);
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIZLclient!fe;Lclient!ha;II)V")
	public void method8694(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class109 arg2, @OriginalArg(4) Class22 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Interface9 local11 = this.method8689(arg5, arg1, arg4, arg0);
		if (local11 == null) {
			return;
		}
		@Pc(20) Class247 local20 = Static216.aClass53_3.method1523(local11.method9107());
		@Pc(24) int local24 = local11.method9102();
		@Pc(28) int local28 = local11.method9105();
		if (local20.method5426()) {
			Static146.method6876(arg0, arg5, arg4, local20);
		}
		if (local11.method9104()) {
			local11.method9106(arg3);
		}
		if (arg1 != 0) {
			if (arg1 == 1) {
				Static253.method3538(arg5, arg4, arg0);
			} else if (arg1 == 2) {
				Static110.method2160(arg5, arg4, arg0, Static667.aClass29 == null ? (Static667.aClass29 = a("et")) : Static667.aClass29);
				if (local20.anInt6289 != 0 && arg4 + local20.anInt6246 < super.anInt10206 && arg0 + local20.anInt6246 < super.anInt10203 && super.anInt10206 > arg4 + local20.anInt6242 && local20.anInt6242 + arg0 < super.anInt10203) {
					arg2.method2732(local20.anInt6246, arg4, local20.anInt6242, !local20.aBoolean415, local28, arg0, local20.aBoolean416);
				}
				if (local24 == 9) {
					if ((local28 & 0x1) != 0) {
						Static379.method5121(arg5, arg4, arg0, 16);
						return;
					}
					Static379.method5121(arg5, arg4, arg0, 8);
					return;
				}
				return;
			} else if (arg1 == 3) {
				Static475.method6472(arg5, arg4, arg0);
				if (local20.anInt6289 == 1) {
					arg2.method2719(arg0, arg4);
					return;
				}
			}
			return;
		}
		Static109.method2139(arg5, arg4, arg0);
		if (local20.anInt6289 != 0) {
			arg2.method2715(local28, !local20.aBoolean415, local20.aBoolean416, arg0, local24, arg4);
		}
		if (local20.anInt6280 != 1) {
			return;
		}
		if (local28 != 0) {
			if (local28 == 1) {
				Static379.method5121(arg5, arg4, arg0 + 1, 2);
				return;
			}
			if (local28 == 2) {
				Static379.method5121(arg5, arg4 + 1, arg0, 1);
			} else if (local28 == 3) {
				Static379.method5121(arg5, arg4, arg0, 2);
				return;
			}
			return;
		}
		Static379.method5121(arg5, arg4, arg0, 1);
		return;
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "([BI[Lclient!fe;IIIILclient!ha;III)V")
	public void method8695(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class109[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class22 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(28) Class3_Sub2 local28 = new Class3_Sub2(arg0);
		@Pc(30) int local30 = -1;
		while (true) {
			@Pc(34) int local34 = local28.method2013();
			if (local34 == 0) {
				return;
			}
			local30 += local34;
			@Pc(45) int local45 = 0;
			while (true) {
				@Pc(49) int local49 = local28.method2054();
				if (local49 == 0) {
					break;
				}
				local45 += local49 - 1;
				@Pc(64) int local64 = local45 & 0x3F;
				@Pc(70) int local70 = local45 >> 6 & 0x3F;
				@Pc(74) int local74 = local45 >> 12;
				@Pc(78) int local78 = local28.method2048(255);
				@Pc(82) int local82 = local78 >> 2;
				@Pc(86) int local86 = local78 & 0x3;
				if (arg5 == local74 && arg3 <= local70 && local70 < arg3 + 8 && arg8 <= local64 && local64 < arg8 + 8) {
					@Pc(124) Class247 local124 = Static216.aClass53_3.method1523(local30);
					@Pc(142) int local142 = arg4 + Static269.method3823(local124.anInt6246, local70 & 0x7, local86, local64 & 0x7, arg1, local124.anInt6242);
					@Pc(159) int local159 = Static7.method241(local86, local124.anInt6246, local64 & 0x7, local70 & 0x7, local124.anInt6242, arg1) + arg7;
					if (local142 > 0 && local159 > 0 && local142 < super.anInt10206 - 1 && super.anInt10203 - 1 > local159) {
						@Pc(184) Class109 local184 = null;
						if (!super.aBoolean680) {
							@Pc(189) int local189 = arg9;
							if ((Static510.aByteArrayArrayArray11[1][local142][local159] & 0x2) == 2) {
								local189 = arg9 - 1;
							}
							if (local189 >= 0) {
								local184 = arg2[local189];
							}
						}
						this.method8697(-1, local86 + arg1 & 0x3, local82, local142, local159, arg6, arg9, arg9, local184, local30);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIIIILclient!ha;IIZLclient!fe;I)V")
	public void method8697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class22 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) Class109 arg8, @OriginalArg(10) int arg9) {
		if (Static580.aClass3_Sub22_24.aClass21_Sub15_2.method5064() == 0 && !Static268.method3817(arg4, arg6, arg3, Static606.anInt9196)) {
			return;
		}
		if (arg7 < this.anInt10218) {
			this.anInt10218 = arg7;
		}
		@Pc(39) Class247 local39 = Static216.aClass53_3.method1523(arg9);
		if (Static580.aClass3_Sub22_24.aClass21_Sub27_1.method8320() == 0 && local39.aBoolean409) {
			return;
		}
		@Pc(67) int local67;
		@Pc(70) int local70;
		if (arg1 == 1 || arg1 == 3) {
			local70 = local39.anInt6246;
			local67 = local39.anInt6242;
		} else {
			local67 = local39.anInt6246;
			local70 = local39.anInt6242;
		}
		@Pc(90) int local90;
		@Pc(94) int local94;
		if (super.anInt10206 < arg3 + local67) {
			local90 = arg3;
			local94 = arg3 + 1;
		} else {
			local94 = (local67 + 1 >> 1) + arg3;
			local90 = (local67 >> 1) + arg3;
		}
		@Pc(126) int local126;
		@Pc(134) int local134;
		if (arg4 + local70 <= super.anInt10203) {
			local126 = (local70 >> 1) + arg4;
			local134 = (local70 + 1 >> 1) + arg4;
		} else {
			local126 = arg4;
			local134 = arg4 + 1;
		}
		@Pc(151) Class259 local151 = Static477.aClass259Array3[arg6];
		@Pc(178) int local178 = local151.method9295(local126, local90) + local151.method9295(local126, local94) + local151.method9295(local134, local90) + local151.method9295(local134, local94) >> 2;
		@Pc(186) int local186 = (arg3 << 9) + (local67 << 8);
		@Pc(194) int local194 = (local70 << 8) + (arg4 << 9);
		@Pc(211) boolean local211 = Static469.aBoolean496 && !super.aBoolean680 && local39.aBoolean421;
		if (local39.method5426()) {
			Static296.method4149(arg3, (Class9_Sub1_Sub1_Sub2_Sub1) null, arg1, local39, (Class9_Sub1_Sub1_Sub2_Sub2) null, arg7, arg4);
		}
		@Pc(256) boolean local256 = arg0 == -1 && !local39.method5433() && local39.anIntArray477 == null && !local39.aBoolean413 && !local39.aBoolean408;
		if (Static529.aBoolean553 && (Static675.method9005(arg2) && local39.anInt6280 != 1 || !(!Static182.method2887(arg2) || local39.anInt6280 != 0))) {
			return;
		}
		if (arg2 != 22) {
			@Pc(438) Class9_Sub1_Sub1 local438;
			@Pc(400) Class9_Sub1_Sub1_Sub1 local400;
			@Pc(434) int local434;
			@Pc(508) int local508;
			if (arg2 == 10 || arg2 == 11) {
				local400 = null;
				if (local256) {
					@Pc(430) Class9_Sub1_Sub1_Sub1 local430 = new Class9_Sub1_Sub1_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg3, arg3 + local67 - 1, arg4, arg4 + local70 - 1, arg2, arg1, local211);
					local434 = local430.method362();
					local400 = local430;
					local438 = local430;
				} else {
					local434 = 15;
					local438 = new Class9_Sub1_Sub1_Sub5(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg3, arg3 + local67 - 1, arg4, arg4 + local70 - 1, arg2, arg1, arg0);
				}
				if (Static507.method6900(local438, false)) {
					if (local400 != null && local400.method9104()) {
						local400.method9108(arg5);
					}
					if (local39.aBoolean417 && Static469.aBoolean496) {
						if (local434 > 30) {
							local434 = 30;
						}
						for (local508 = 0; local508 <= local67; local508++) {
							for (@Pc(512) int local512 = 0; local512 <= local70; local512++) {
								local151.ka(arg3 + local508, arg4 - -local512, local434);
							}
						}
					}
				}
				if (local39.anInt6289 != 0 && arg8 != null) {
					arg8.method2723(arg4, arg3, local39.aBoolean416, local67, !local39.aBoolean415, local70);
				}
			} else if (arg2 >= 12 && arg2 <= 17 || arg2 >= 18 && arg2 <= 21) {
				if (local256) {
					local400 = new Class9_Sub1_Sub1_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg3, local67 + arg3 - 1, arg4, local70 + arg4 - 1, arg2, arg1, local211);
					local438 = local400;
					if (local400.method9104()) {
						local400.method9108(arg5);
					}
				} else {
					local438 = new Class9_Sub1_Sub1_Sub5(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg3, local67 + arg3 - 1, arg4, local70 + arg4 - 1, arg2, arg1, arg0);
				}
				Static507.method6900(local438, false);
				if (Static469.aBoolean496 && !super.aBoolean680 && arg2 >= 12 && arg2 <= 17 && arg2 != 13 && arg7 > 0 && local39.anInt6280 != 0) {
					super.aByteArrayArrayArray18[arg7][arg3][arg4] = (byte) (super.aByteArrayArrayArray18[arg7][arg3][arg4] | 0x4);
				}
				if (local39.anInt6289 != 0 && arg8 != null) {
					arg8.method2723(arg4, arg3, local39.aBoolean416, local67, !local39.aBoolean415, local70);
				}
			} else {
				@Pc(789) Class9_Sub1_Sub2 local789;
				if (arg2 == 0) {
					@Pc(761) int local761 = local39.anInt6280;
					if (Static196.aBoolean239 && local39.anInt6280 == -1) {
						local761 = 1;
					}
					if (local256) {
						@Pc(807) Class9_Sub1_Sub2_Sub1 local807 = new Class9_Sub1_Sub2_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg2, arg1, local211);
						local789 = local807;
						if (local807.method9104()) {
							local807.method9108(arg5);
						}
					} else {
						local789 = new Class9_Sub1_Sub2_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg2, arg1, arg0);
					}
					Static609.method7806(arg7, arg3, arg4, local789, (Class9_Sub1_Sub2) null);
					if (arg1 == 0) {
						if (Static469.aBoolean496 && local39.aBoolean417) {
							local151.ka(arg3, arg4, 50);
							local151.ka(arg3, arg4 + 1, 50);
						}
						if (local761 == 1 && !super.aBoolean680) {
							Static410.method2598(1, local39.anInt6279, arg4, local39.anInt6283, arg7, arg3);
						}
					} else if (arg1 == 1) {
						if (Static469.aBoolean496 && local39.aBoolean417) {
							local151.ka(arg3, arg4 + 1, 50);
							local151.ka(arg3 + 1, arg4 + 1, 50);
						}
						if (local761 == 1 && !super.aBoolean680) {
							Static410.method2598(2, local39.anInt6279, arg4 + 1, -local39.anInt6283, arg7, arg3);
						}
					} else if (arg1 == 2) {
						if (Static469.aBoolean496 && local39.aBoolean417) {
							local151.ka(arg3 + 1, arg4, 50);
							local151.ka(arg3 + 1, arg4 + 1, 50);
						}
						if (local761 == 1 && !super.aBoolean680) {
							Static410.method2598(1, local39.anInt6279, arg4, -local39.anInt6283, arg7, arg3 + 1);
						}
					} else if (arg1 == 3) {
						if (Static469.aBoolean496 && local39.aBoolean417) {
							local151.ka(arg3, arg4, 50);
							local151.ka(arg3 + 1, arg4, 50);
						}
						if (local761 == 1 && !super.aBoolean680) {
							Static410.method2598(2, local39.anInt6279, arg4, local39.anInt6283, arg7, arg3);
						}
					}
					if (local39.anInt6289 != 0 && arg8 != null) {
						arg8.method2726(arg3, arg4, arg2, arg1, local39.aBoolean416, !local39.aBoolean415);
					}
					if (local39.anInt6240 != 64) {
						Static587.method7585(arg7, arg3, arg4, local39.anInt6240);
					}
				} else {
					@Pc(1108) Class9_Sub1_Sub2 local1108;
					@Pc(1106) Class9_Sub1_Sub2_Sub1 local1106;
					if (arg2 == 1) {
						if (local256) {
							local1106 = new Class9_Sub1_Sub2_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg2, arg1, local211);
							local1108 = local1106;
							if (local1106.method9104()) {
								local1106.method9108(arg5);
							}
						} else {
							local1108 = new Class9_Sub1_Sub2_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg2, arg1, arg0);
						}
						Static609.method7806(arg7, arg3, arg4, local1108, (Class9_Sub1_Sub2) null);
						if (local39.aBoolean417 && Static469.aBoolean496) {
							if (arg1 == 0) {
								local151.ka(arg3, arg4 + 1, 50);
							} else if (arg1 == 1) {
								local151.ka(arg3 + 1, arg4 + 1, 50);
							} else if (arg1 == 2) {
								local151.ka(arg3 + 1, arg4, 50);
							} else if (arg1 == 3) {
								local151.ka(arg3, arg4, 50);
							}
						}
						if (local39.anInt6289 != 0 && arg8 != null) {
							arg8.method2726(arg3, arg4, arg2, arg1, local39.aBoolean416, !local39.aBoolean415);
						}
					} else if (arg2 == 2) {
						local434 = arg1 + 1 & 0x3;
						if (local256) {
							@Pc(1310) Class9_Sub1_Sub2_Sub1 local1310 = new Class9_Sub1_Sub2_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg2, arg1 + 4, local211);
							@Pc(1326) Class9_Sub1_Sub2_Sub1 local1326 = new Class9_Sub1_Sub2_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg2, local434, local211);
							if (local1310.method9104()) {
								local1310.method9108(arg5);
							}
							local789 = local1326;
							if (local1326.method9104()) {
								local1326.method9108(arg5);
							}
							local1108 = local1310;
						} else {
							local1108 = new Class9_Sub1_Sub2_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg2, arg1 + 4, arg0);
							local789 = new Class9_Sub1_Sub2_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg2, local434, arg0);
						}
						Static609.method7806(arg7, arg3, arg4, local1108, local789);
						if ((local39.anInt6280 == 1 || Static196.aBoolean239 && local39.anInt6280 == -1) && !super.aBoolean680) {
							if (arg1 == 0) {
								Static410.method2598(1, local39.anInt6279, arg4, local39.anInt6283, arg7, arg3);
								Static410.method2598(2, local39.anInt6279, arg4 + 1, local39.anInt6283, arg7, arg3);
							} else if (arg1 == 1) {
								Static410.method2598(1, local39.anInt6279, arg4, local39.anInt6283, arg7, arg3 + 1);
								Static410.method2598(2, local39.anInt6279, arg4 + 1, local39.anInt6283, arg7, arg3);
							} else if (arg1 == 2) {
								Static410.method2598(1, local39.anInt6279, arg4, local39.anInt6283, arg7, arg3 + 1);
								Static410.method2598(2, local39.anInt6279, arg4, local39.anInt6283, arg7, arg3);
							} else if (arg1 == 3) {
								Static410.method2598(1, local39.anInt6279, arg4, local39.anInt6283, arg7, arg3);
								Static410.method2598(2, local39.anInt6279, arg4, local39.anInt6283, arg7, arg3);
							}
						}
						if (local39.anInt6289 != 0 && arg8 != null) {
							arg8.method2726(arg3, arg4, arg2, arg1, local39.aBoolean416, !local39.aBoolean415);
						}
						if (local39.anInt6240 != 64) {
							Static587.method7585(arg7, arg3, arg4, local39.anInt6240);
						}
					} else if (arg2 == 3) {
						if (local256) {
							local1106 = new Class9_Sub1_Sub2_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg2, arg1, local211);
							local1108 = local1106;
							if (local1106.method9104()) {
								local1106.method9108(arg5);
							}
						} else {
							local1108 = new Class9_Sub1_Sub2_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg2, arg1, arg0);
						}
						Static609.method7806(arg7, arg3, arg4, local1108, (Class9_Sub1_Sub2) null);
						if (local39.aBoolean417 && Static469.aBoolean496) {
							if (arg1 == 0) {
								local151.ka(arg3, arg4 + 1, 50);
							} else if (arg1 == 1) {
								local151.ka(arg3 + 1, arg4 + 1, 50);
							} else if (arg1 == 2) {
								local151.ka(arg3 + 1, arg4, 50);
							} else if (arg1 == 3) {
								local151.ka(arg3, arg4, 50);
							}
						}
						if (local39.anInt6289 != 0 && arg8 != null) {
							arg8.method2726(arg3, arg4, arg2, arg1, local39.aBoolean416, !local39.aBoolean415);
						}
					} else if (arg2 == 9) {
						if (local256) {
							local400 = new Class9_Sub1_Sub1_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg3, arg3, arg4, arg4, arg2, arg1, local211);
							local438 = local400;
							if (local400.method9104()) {
								local400.method9108(arg5);
							}
						} else {
							local438 = new Class9_Sub1_Sub1_Sub5(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg3, local67 + arg3 - 1, arg4, arg4 + local70 - 1, arg2, arg1, arg0);
						}
						Static507.method6900(local438, false);
						if (local39.anInt6280 == 1 && !super.aBoolean680) {
							@Pc(1799) byte local1799;
							if ((arg1 & 0x1) == 0) {
								local1799 = 8;
							} else {
								local1799 = 16;
							}
							Static410.method2598(local1799, local39.anInt6279, arg4, 0, arg7, arg3);
						}
						if (local39.anInt6289 != 0 && arg8 != null) {
							arg8.method2723(arg4, arg3, local39.aBoolean416, local67, !local39.aBoolean415, local70);
						}
						if (local39.anInt6240 != 64) {
							Static587.method7585(arg7, arg3, arg4, local39.anInt6240);
						}
					} else {
						@Pc(1893) Class9_Sub1_Sub3 local1893;
						if (arg2 == 4) {
							if (local256) {
								@Pc(1881) Class9_Sub1_Sub3_Sub1 local1881 = new Class9_Sub1_Sub3_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, 0, 0, arg2, arg1);
								if (local1881.method9104()) {
									local1881.method9108(arg5);
								}
								local1893 = local1881;
							} else {
								local1893 = new Class9_Sub1_Sub3_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, 0, 0, arg2, arg1, arg0);
							}
							Static420.method5563(arg7, arg3, arg4, local1893, (Class9_Sub1_Sub3) null);
						} else {
							@Pc(1927) int local1927;
							@Pc(1933) Interface9 local1933;
							@Pc(1972) Class9_Sub1_Sub3_Sub1 local1972;
							if (arg2 == 5) {
								local1927 = 65;
								local1933 = (Interface9) Static518.method6967(arg7, arg3, arg4);
								if (local1933 != null) {
									local1927 = Static216.aClass53_3.method1523(local1933.method9107()).anInt6240 + 1;
								}
								if (local256) {
									local1972 = new Class9_Sub1_Sub3_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, Static670.anIntArray758[arg1] * local1927, local1927 * Static27.anIntArray58[arg1], arg2, arg1);
									if (local1972.method9104()) {
										local1972.method9108(arg5);
									}
									local1893 = local1972;
								} else {
									local1893 = new Class9_Sub1_Sub3_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, Static670.anIntArray758[arg1] * local1927, Static27.anIntArray58[arg1] * local1927, arg2, arg1, arg0);
								}
								Static420.method5563(arg7, arg3, arg4, local1893, (Class9_Sub1_Sub3) null);
							} else if (arg2 == 6) {
								local1927 = 33;
								local1933 = (Interface9) Static518.method6967(arg7, arg3, arg4);
								if (local1933 != null) {
									local1927 = Static216.aClass53_3.method1523(local1933.method9107()).anInt6240 / 2 + 1;
								}
								if (local256) {
									local1972 = new Class9_Sub1_Sub3_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, Static670.anIntArray758[arg1] * local1927, Static27.anIntArray58[arg1] * local1927, arg2, arg1 + 4);
									if (local1972.method9104()) {
										local1972.method9108(arg5);
									}
									local1893 = local1972;
								} else {
									local1893 = new Class9_Sub1_Sub3_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, Static667.anIntArray749[arg1] * local1927, local1927 * Static27.anIntArray59[arg1], arg2, arg1 + 4, arg0);
								}
								Static420.method5563(arg7, arg3, arg4, local1893, (Class9_Sub1_Sub3) null);
							} else if (arg2 == 7) {
								local1927 = arg1 + 2 & 0x3;
								if (local256) {
									@Pc(2176) Class9_Sub1_Sub3_Sub1 local2176 = new Class9_Sub1_Sub3_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, 0, 0, arg2, local1927 + 4);
									local1893 = local2176;
									if (local2176.method9104()) {
										local2176.method9108(arg5);
									}
								} else {
									local1893 = new Class9_Sub1_Sub3_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, 0, 0, arg2, local1927 + 4, arg0);
								}
								Static420.method5563(arg7, arg3, arg4, local1893, (Class9_Sub1_Sub3) null);
							} else if (arg2 == 8) {
								local434 = arg1 + 2 & 0x3;
								local508 = 33;
								@Pc(2214) Interface9 local2214 = (Interface9) Static518.method6967(arg7, arg3, arg4);
								if (local2214 != null) {
									local508 = Static216.aClass53_3.method1523(local2214.method9107()).anInt6240 / 2 + 1;
								}
								@Pc(2257) Class9_Sub1_Sub3 local2257;
								@Pc(2276) Class9_Sub1_Sub3 local2276;
								if (local256) {
									local2257 = new Class9_Sub1_Sub3_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, Static667.anIntArray749[arg1] * local508, Static27.anIntArray59[arg1] * local508, arg2, arg1 + 4);
									local2276 = new Class9_Sub1_Sub3_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, 0, 0, arg2, local434 + 4);
									if (local2257.method9104()) {
										local2257.method9108(arg5);
									}
									if (local2276.method9104()) {
										local2276.method9108(arg5);
									}
								} else {
									local2257 = new Class9_Sub1_Sub3_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, local508 * Static667.anIntArray749[arg1], Static27.anIntArray59[arg1] * local508, arg2, arg1 + 4, arg0);
									local2276 = new Class9_Sub1_Sub3_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, 0, 0, arg2, local434 + 4, arg0);
								}
								Static420.method5563(arg7, arg3, arg4, local2257, local2276);
							}
						}
					}
				}
			}
		} else if (Static580.aClass3_Sub22_24.aClass21_Sub5_1.method2407() != 0 || local39.anInt6278 != 0 || local39.anInt6289 == 1 || local39.aBoolean418) {
			@Pc(338) Class9_Sub1_Sub4 local338;
			if (local256) {
				@Pc(355) Class9_Sub1_Sub4_Sub2 local355 = new Class9_Sub1_Sub4_Sub2(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg1, local211);
				if (local355.method9104()) {
					local355.method9108(arg5);
				}
				local338 = local355;
			} else {
				local338 = new Class9_Sub1_Sub4_Sub1(arg5, local39, arg7, arg6, local186, local178, local194, super.aBoolean680, arg1, arg0);
			}
			Static139.method2389(arg7, arg3, arg4, local338);
			if (local39.anInt6289 == 1 && arg8 != null) {
				arg8.method2730(arg4, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZLclient!ha;I)V")
	public void method8698(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class22 arg1) {
		Static690.method9130();
		if (!arg0) {
			@Pc(18) int local18;
			@Pc(22) int local22;
			if (super.anInt10214 > 1) {
				for (local18 = 0; super.anInt10206 > local18; local18++) {
					for (local22 = 0; local22 < super.anInt10203; local22++) {
						if ((Static510.aByteArrayArrayArray11[1][local18][local22] & 0x2) == 2) {
							Static334.method4815(local18, local22);
						}
					}
				}
			}
			for (local18 = 0; super.anInt10214 > local18; local18++) {
				for (local22 = 0; local22 <= super.anInt10203; local22++) {
					for (@Pc(72) int local72 = 0; local72 <= super.anInt10206; local72++) {
						if ((super.aByteArrayArrayArray18[local18][local72][local22] & 0x4) != 0) {
							@Pc(92) int local92 = local72;
							@Pc(94) int local94 = local72;
							@Pc(96) int local96 = local22;
							@Pc(98) int local98 = local22;
							while (local96 > 0 && (super.aByteArrayArrayArray18[local18][local72][local96 - 1] & 0x4) != 0 && local22 - local96 < 10) {
								local96--;
							}
							while (local98 < super.anInt10203 && (super.aByteArrayArrayArray18[local18][local72][local98 + 1] & 0x4) != 0 && local98 - local96 < 10) {
								local98++;
							}
							@Pc(187) int local187;
							label111: while (local92 > 0 && local72 - local92 < 10) {
								for (local187 = local96; local187 <= local98; local187++) {
									if ((super.aByteArrayArrayArray18[local18][local92 - 1][local187] & 0x4) == 0) {
										break label111;
									}
								}
								local92--;
							}
							label98: while (local94 < super.anInt10206 && local94 - local92 < 10) {
								for (local187 = local96; local187 <= local98; local187++) {
									if ((super.aByteArrayArrayArray18[local18][local94 + 1][local187] & 0x4) == 0) {
										break label98;
									}
								}
								local94++;
							}
							if ((local94 + 1 - local92) * (-local96 + 1 + local98) >= 4) {
								local187 = super.anIntArrayArrayArray14[local18][local92][local96];
								Static284.method4010(local187, (local98 << 9) + 512, (local94 << 9) + 512, local187, local92 << 9, local96 << 9, local18);
								for (@Pc(339) int local339 = local92; local339 <= local94; local339++) {
									for (@Pc(343) int local343 = local96; local343 <= local98; local343++) {
										super.aByteArrayArrayArray18[local18][local339][local343] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static154.method2522();
		}
		super.aByteArrayArrayArray18 = null;
	}
}
