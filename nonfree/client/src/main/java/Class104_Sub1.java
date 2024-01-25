import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class104_Sub1 extends Class104 {

	@OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
	public int anInt4721 = 99;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(IIIZ)V")
	public Class104_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static31.aClass204_1, Static425.aClass60_5);
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[BIIIII[Lclient!mk;Lclient!za;I)V")
	public void method3726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class158[] arg7, @OriginalArg(9) Class117 arg8, @OriginalArg(10) int arg9) {
		@Pc(15) Class1_Sub19 local15 = new Class1_Sub19(arg2);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method2897();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method2883();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local15.method2915();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (local55 == arg1 && arg9 <= local51 && arg9 + 8 > local51 && local45 >= arg0 && local45 < arg0 + 8) {
					@Pc(103) Class87 local103 = Static86.aClass248_7.method5246(local17);
					@Pc(121) int local121 = arg4 + Static144.method5813(local51 & 0x7, local67, local45 & 0x7, local103.anInt1959, local103.anInt1916, arg6);
					@Pc(138) int local138 = Static109.method1378(local103.anInt1959, local103.anInt1916, local51 & 0x7, arg6, local67, local45 & 0x7) + arg5;
					if (local121 > 0 && local138 > 0 && super.anInt4702 - 1 > local121 && local138 < super.anInt4711 - 1) {
						@Pc(163) Class158 local163 = null;
						if (!super.aBoolean425) {
							@Pc(168) int local168 = arg3;
							if ((Static278.aByteArrayArrayArray16[1][local121][local138] & 0x2) == 2) {
								local168 = arg3 - 1;
							}
							if (local168 >= 0) {
								local163 = arg7[local168];
							}
						}
						this.method3730(local67 + arg6 & 0x3, local163, arg3, local121, -1, local63, arg3, arg8, local17, local138);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[B[Lclient!mk;Lclient!za;I)V")
	public void method3727(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class158[] arg2, @OriginalArg(4) Class117 arg3, @OriginalArg(5) int arg4) {
		@Pc(15) Class1_Sub19 local15 = new Class1_Sub19(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method2897();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method2883();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(45) int local45 = local29 & 0x3F;
				@Pc(51) int local51 = local29 >> 6 & 0x3F;
				@Pc(55) int local55 = local29 >> 12;
				@Pc(59) int local59 = local15.method2915();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				@Pc(71) int local71 = arg4 + local51;
				@Pc(75) int local75 = local45 + arg0;
				if (local71 > 0 && local75 > 0 && super.anInt4702 - 1 > local71 && super.anInt4711 - 1 > local75) {
					@Pc(104) Class158 local104 = null;
					if (!super.aBoolean425) {
						@Pc(109) int local109 = local55;
						if ((Static278.aByteArrayArrayArray16[1][local71][local75] & 0x2) == 2) {
							local109 = local55 - 1;
						}
						if (local109 >= 0) {
							local104 = arg2[local109];
						}
					}
					this.method3730(local67, local104, local55, local71, -1, local63, local55, arg3, local17, local75);
				}
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!za;Lclient!wm;[II)V")
	public void method3728(@OriginalArg(0) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) Class1_Sub19 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean425) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(19) Class160 local19 = null;
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(24) int local24;
						@Pc(102) int local102;
						@Pc(489) int local489;
						@Pc(146) int local146;
						@Pc(150) int local150;
						while (arg2.anInt3698 < arg2.aByteArray38.length) {
							local24 = arg2.method2915();
							if (local24 == 0) {
								local19 = new Class160(arg2);
							} else {
								@Pc(152) int local152;
								@Pc(156) int local156;
								@Pc(298) int local298;
								if (local24 == 1) {
									local102 = arg2.method2915();
									if (local102 > 0) {
										for (local489 = 0; local489 < local102; local489++) {
											@Pc(498) Class93 local498 = new Class93(arg1, arg2, 0);
											if (local498.anInt2077 == 31) {
												@Pc(511) Class129 local511 = Static331.aClass42_1.method812(arg2.method2896());
												local498.method1705(local511.anInt3571, local511.anInt3574, local511.anInt3572, local511.anInt3579);
											}
											if (arg1.method5710() > 0) {
												@Pc(531) Class1_Sub29 local531 = local498.aClass1_Sub29_2;
												local152 = (arg0 << 7) + local531.method5837();
												local156 = local531.method5838() + (arg4 << 7);
												local298 = local152 >> 7;
												@Pc(555) int local555 = local156 >> 7;
												if (local298 >= 0 && local555 >= 0 && local298 < super.anInt4702 && local555 < super.anInt4711) {
													local531.method5839(local156, local152, super.anIntArrayArrayArray5[local498.anInt2079][local298][local555] - local531.method5834());
													Static429.method5448(local498);
												}
											}
										}
									}
								} else if (local24 == 2) {
									if (local19 == null) {
										local19 = new Class160();
									}
									local19.method3638(arg2);
								} else if (local24 != 128) {
									if (local24 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray14 == null) {
										super.aByteArrayArrayArray14 = new byte[4][][];
									}
									for (local102 = 0; local102 < 4; local102++) {
										@Pc(108) byte local108 = arg2.method2917();
										if (local108 == 0 && super.aByteArrayArrayArray14[local102] != null) {
											local146 = arg0;
											local150 = arg0 + 64;
											local152 = arg4;
											if (arg0 < 0) {
												local146 = 0;
											} else if (arg0 >= super.anInt4702) {
												local146 = super.anInt4702;
											}
											if (local150 < 0) {
												local150 = 0;
											} else if (local150 >= super.anInt4702) {
												local150 = super.anInt4702;
											}
											if (arg4 < 0) {
												local152 = 0;
											} else if (arg4 >= super.anInt4711) {
												local152 = super.anInt4711;
											}
											local156 = arg4 + 64;
											if (local156 < 0) {
												local156 = 0;
											} else if (super.anInt4711 <= local156) {
												local156 = super.anInt4711;
											}
											while (local150 > local146) {
												while (local152 < local156) {
													super.aByteArrayArrayArray14[local102][local146][local152] = 0;
													local152++;
												}
												local146++;
											}
										} else if (local108 == 1) {
											if (super.aByteArrayArrayArray14[local102] == null) {
												super.aByteArrayArrayArray14[local102] = new byte[super.anInt4702 + 1][super.anInt4711 + 1];
											}
											for (local146 = 0; local146 < 64; local146 += 4) {
												for (local150 = 0; local150 < 64; local150 += 4) {
													@Pc(288) byte local288 = arg2.method2917();
													for (local156 = arg0 + local146; local156 < arg0 + local146 + 4; local156++) {
														for (local298 = arg4 + local150; local298 < local150 + arg4 + 4; local298++) {
															if (local156 >= 0 && super.anInt4702 > local156 && local298 >= 0 && local298 < super.anInt4711) {
																super.aByteArrayArrayArray14[local102][local156][local298] = local288;
															}
														}
													}
												}
											}
										} else if (local108 == 2) {
											if (super.aByteArrayArrayArray14[local102] == null) {
												super.aByteArrayArrayArray14[local102] = new byte[super.anInt4702 + 1][super.anInt4711 + 1];
											}
											if (local102 > 0) {
												local146 = arg0;
												local150 = arg0 + 64;
												local152 = arg4;
												local156 = arg4 + 64;
												if (arg4 < 0) {
													local152 = 0;
												} else if (super.anInt4711 <= arg4) {
													local152 = super.anInt4711;
												}
												if (arg0 < 0) {
													local146 = 0;
												} else if (arg0 >= super.anInt4702) {
													local146 = super.anInt4702;
												}
												if (local150 < 0) {
													local150 = 0;
												} else if (local150 >= super.anInt4702) {
													local150 = super.anInt4702;
												}
												if (local156 < 0) {
													local156 = 0;
												} else if (local156 >= super.anInt4711) {
													local156 = super.anInt4711;
												}
												while (local150 > local146) {
													while (local152 < local156) {
														super.aByteArrayArrayArray14[local102][local146][local152] = super.aByteArrayArrayArray14[local102 - 1][local146][local152];
														local152++;
													}
													local146++;
												}
											}
										}
									}
									local11 = true;
								} else if (arg3 == null) {
									arg2.anInt3698 += 10;
								} else {
									arg3[0] = arg2.method2896();
									arg3[1] = arg2.method2929();
									arg3[2] = arg2.method2929();
									arg3[3] = arg2.method2929();
									arg3[4] = arg2.method2896();
								}
							}
						}
						if (local19 != null) {
							for (local24 = 0; local24 < 8; local24++) {
								for (local102 = 0; local102 < 8; local102++) {
									local489 = local24 + (arg0 >> 3);
									local146 = local102 + (arg4 >> 3);
									if (local489 >= 0 && super.anInt4702 >> 3 > local489 && local146 >= 0 && super.anInt4711 >> 3 > local146) {
										Static291.method3889(local489, local19, local146);
									}
								}
							}
						}
						if (!local11 && super.aByteArrayArrayArray14 != null) {
							for (local24 = 0; local24 < 4; local24++) {
								if (super.aByteArrayArrayArray14[local24] != null) {
									for (local102 = 0; local102 < 16; local102++) {
										for (local489 = 0; local489 < 16; local489++) {
											local146 = (arg0 >> 2) + local102;
											local150 = local489 + (arg4 >> 2);
											if (local146 >= 0 && local146 < 26 && local150 >= 0 && local150 < 26) {
												super.aByteArrayArrayArray14[local24][local146][local150] = 0;
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

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IILclient!wm;[IIBILclient!za;III)V")
	public void method3729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub19 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class117 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean425) {
			return;
		}
		@Pc(13) Class160 local13 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(25) int local25 = (arg7 & 0x7) * 8;
		@Pc(36) int local36 = (arg0 & 0x7) * 8;
		while (true) {
			@Pc(41) int local41;
			@Pc(78) int local78;
			@Pc(116) int local116;
			@Pc(429) int local429;
			while (arg2.anInt3698 < arg2.aByteArray38.length) {
				local41 = arg2.method2915();
				if (local41 == 0) {
					local13 = new Class160(arg2);
				} else {
					@Pc(135) int local135;
					@Pc(139) int local139;
					@Pc(178) int local178;
					@Pc(264) int local264;
					if (local41 == 1) {
						local78 = arg2.method2915();
						if (local78 > 0) {
							for (local429 = 0; local429 < local78; local429++) {
								@Pc(438) Class93 local438 = new Class93(arg6, arg2, 0);
								if (local438.anInt2077 == 31) {
									@Pc(453) Class129 local453 = Static331.aClass42_1.method812(arg2.method2896());
									local438.method1705(local453.anInt3571, local453.anInt3574, local453.anInt3572, local453.anInt3579);
								}
								if (arg6.method5710() > 0) {
									@Pc(473) Class1_Sub29 local473 = local438.aClass1_Sub29_2;
									local264 = local473.method5837() >> 7;
									local135 = local473.method5838() >> 7;
									if (arg1 == local438.anInt2079 && local25 <= local264 && local25 + 8 > local264 && local135 >= local36 && local36 + 8 > local135) {
										local139 = Static151.method1902(arg5, local473.method5837() & 0x3FF, local473.method5838() & 0x3FF) + (arg4 << 7);
										local178 = Static1.method11(arg5, local473.method5837() & 0x3FF, local473.method5838() & 0x3FF) + (arg9 << 7);
										local264 = local139 >> 7;
										local135 = local178 >> 7;
										if (local264 >= 0 && local135 >= 0 && super.anInt4702 > local264 && super.anInt4711 > local135) {
											local473.method5839(local178, local139, super.anIntArrayArrayArray5[arg1][local264][local135] - local473.method5834());
											Static429.method5448(local438);
										}
									}
								}
							}
						}
					} else if (local41 == 2) {
						if (local13 == null) {
							local13 = new Class160();
						}
						local13.method3638(arg2);
					} else if (local41 != 128) {
						if (local41 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray14 == null) {
							super.aByteArrayArrayArray14 = new byte[4][][];
						}
						for (local78 = 0; local78 < 4; local78++) {
							@Pc(84) byte local84 = arg2.method2917();
							@Pc(120) int local120;
							if (local84 == 0 && super.aByteArrayArrayArray14[arg8] != null) {
								if (arg1 >= local78) {
									local116 = arg4;
									local120 = arg4 + 7;
									local264 = arg9;
									if (arg4 < 0) {
										local116 = 0;
									} else if (super.anInt4702 <= arg4) {
										local116 = super.anInt4702;
									}
									if (arg9 < 0) {
										local264 = 0;
									} else if (arg9 >= super.anInt4711) {
										local264 = super.anInt4711;
									}
									local135 = arg9 + 7;
									if (local120 < 0) {
										local120 = 0;
									} else if (super.anInt4702 <= local120) {
										local120 = super.anInt4702;
									}
									if (local135 < 0) {
										local135 = 0;
									} else if (super.anInt4711 <= local135) {
										local135 = super.anInt4711;
									}
									while (local116 < local120) {
										while (local135 > local264) {
											super.aByteArrayArrayArray14[arg8][local116][local264] = 0;
											local264++;
										}
										local116++;
									}
								}
							} else if (local84 == 1) {
								if (super.aByteArrayArrayArray14[arg8] == null) {
									super.aByteArrayArrayArray14[arg8] = new byte[super.anInt4702 + 1][super.anInt4711 + 1];
								}
								for (local116 = 0; local116 < 64; local116 += 4) {
									for (local120 = 0; local120 < 64; local120 += 4) {
										@Pc(126) byte local126 = arg2.method2917();
										if (arg1 >= local78) {
											for (local135 = local116; local135 < local116 + 4; local135++) {
												for (local139 = local120; local139 < local120 + 4; local139++) {
													if (local25 <= local135 && local25 + 8 > local135 && local139 >= local36 && local36 + 8 > local36) {
														local178 = arg4 + Static197.method2823(local139 & 0x7, arg5, local135 & 0x7);
														@Pc(190) int local190 = Static129.method1586(local139 & 0x7, local135 & 0x7, arg5) + arg9;
														if (local178 >= 0 && super.anInt4702 > local178 && local190 >= 0 && local190 < super.anInt4711) {
															super.aByteArrayArrayArray14[arg8][local178][local190] = local126;
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
						arg2.anInt3698 += 10;
					} else {
						arg3[0] = arg2.method2896();
						arg3[1] = arg2.method2929();
						arg3[2] = arg2.method2929();
						arg3[3] = arg2.method2929();
						arg3[4] = arg2.method2896();
					}
				}
			}
			if (local13 != null) {
				Static291.method3889(arg4 >> 3, local13, arg9 >> 3);
			}
			if (super.aByteArrayArrayArray14 != null && super.aByteArrayArrayArray14[arg8] != null) {
				local41 = arg4 + 7;
				local78 = arg9 + 7;
				for (local429 = arg4; local429 < local41; local429++) {
					for (local116 = arg9; local116 < local78; local116++) {
						super.aByteArrayArrayArray14[arg8][local429][local116] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!mk;IZIIIILclient!za;II)V")
	public void method3730(@OriginalArg(0) int arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class117 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static126.aClass19_Sub1_1.method3353(Static214.anInt3968) && !Static140.method1765(Static130.anInt2040, arg3, arg9, arg6)) {
			return;
		}
		if (this.anInt4721 > arg2) {
			this.anInt4721 = arg2;
		}
		@Pc(34) Class87 local34 = Static86.aClass248_7.method5246(arg8);
		if (arg7.method5655() && Static126.aClass19_Sub1_1.aBoolean376 && local34.aBoolean209) {
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg0 == 1 || arg0 == 3) {
			local53 = local34.anInt1959;
			local56 = local34.anInt1916;
		} else {
			local56 = local34.anInt1959;
			local53 = local34.anInt1916;
		}
		@Pc(84) int local84;
		@Pc(78) int local78;
		if (super.anInt4702 >= arg3 + local53) {
			local78 = (local53 + 1 >> 1) + arg3;
			local84 = (local53 >> 1) + arg3;
		} else {
			local84 = arg3;
			local78 = arg3 + 1;
		}
		@Pc(109) int local109;
		@Pc(117) int local117;
		if (super.anInt4711 >= arg9 + local56) {
			local109 = arg9 + (local56 >> 1);
			local117 = (local56 + 1 >> 1) + arg9;
		} else {
			local109 = arg9;
			local117 = arg9 + 1;
		}
		@Pc(129) Class139 local129 = Static452.aClass139Array3[arg6];
		@Pc(152) int local152 = local129.ua(local84, local109) + local129.ua(local78, local109) + local129.ua(local84, local117) + local129.ua(local78, local117) >> 2;
		@Pc(160) int local160 = (local53 << 6) + (arg3 << 7);
		@Pc(169) int local169 = (arg9 << 7) + (local56 << 6);
		@Pc(181) boolean local181 = Static155.aBoolean247 && !super.aBoolean425 && local34.aBoolean206;
		if (local34.method1567()) {
			Static123.method1515(arg0, arg3, null, arg9, arg2, null, local34);
		}
		@Pc(215) boolean local215 = arg4 == -1 && local34.anInt1927 == -1 && local34.anIntArray169 == null && local34.anIntArray170 == null && !local34.aBoolean208;
		if (Static99.aBoolean154 && (Static295.method3916(arg5) && local34.anInt1923 != 1 || !(!Static47.method629(arg5) || local34.anInt1923 != 0))) {
			return;
		}
		if (arg5 != 22) {
			@Pc(385) Class11_Sub1 local385;
			@Pc(345) Class11_Sub1_Sub2 local345;
			@Pc(383) int local383;
			if (arg5 == 10 || arg5 == 11) {
				local345 = null;
				if (local215) {
					@Pc(377) Class11_Sub1_Sub2 local377 = new Class11_Sub1_Sub2(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg3, arg3 + local53 - 1, arg9, arg9 + local56 - 1, arg5, arg0, local181);
					local345 = local377;
					local383 = local377.method450();
					local385 = local377;
				} else {
					local383 = 15;
					local385 = new Class11_Sub1_Sub4(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg3, arg3 + local53 - 1, arg9, local56 + arg9 - 1, arg5, arg0, arg4);
				}
				@Pc(430) Class11_Sub1 local430 = Static423.method5398(arg2, arg3, arg9, nc.class);
				@Pc(432) boolean local432 = false;
				if (local430 instanceof Class11_Sub1_Sub1 && local430.aShort103 == arg3 && local430.aShort101 == arg9) {
					((Class11_Sub1_Sub1) local430).aClass11_Sub1_1 = local385;
					local432 = true;
				}
				if (local432 || Static95.method5201(local385, false)) {
					if (local345 != null && local345.method4898()) {
						local345.method4902(arg7);
					}
					if (local34.aBoolean203 && Static155.aBoolean247) {
						if (local383 > 30) {
							local383 = 30;
						}
						for (@Pc(479) int local479 = 0; local479 <= local53; local479++) {
							for (@Pc(483) int local483 = 0; local483 <= local56; local483++) {
								local129.qa(arg3 + local479, local483 + arg9, local383);
							}
						}
					}
				}
				if (local34.lb != 0 && arg1 != null) {
					arg1.method3620(local53, arg3, local34.aBoolean215, arg9, !local34.aBoolean201, local56);
				}
			} else {
				@Pc(634) Class11_Sub1 local634;
				if (arg5 >= 12 && arg5 <= 17 || arg5 >= 18 && arg5 <= 21) {
					if (local215) {
						local345 = new Class11_Sub1_Sub2(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg3, local53 + arg3 - 1, arg9, local56 + arg9 - 1, arg5, arg0, local181);
						if (local345.method4898()) {
							local345.method4902(arg7);
						}
						local385 = local345;
					} else {
						local385 = new Class11_Sub1_Sub4(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg3, arg3 + local53 - 1, arg9, arg9 + local56 - 1, arg5, arg0, arg4);
					}
					local634 = Static423.method5398(arg2, arg3, arg9, nc.class);
					if (local634 instanceof Class11_Sub1_Sub1 && arg3 == local634.aShort103 && local634.aShort101 == arg9) {
						((Class11_Sub1_Sub1) local634).aClass11_Sub1_1 = local385;
					} else {
						Static95.method5201(local385, false);
					}
					if (Static155.aBoolean247 && !super.aBoolean425 && arg5 >= 12 && arg5 <= 17 && arg5 != 13 && arg2 > 0 && local34.anInt1923 != 0) {
						super.aByteArrayArrayArray12[arg2][arg3][arg9] = (byte) (super.aByteArrayArrayArray12[arg2][arg3][arg9] | 0x4);
					}
					if (local34.lb != 0 && arg1 != null) {
						arg1.method3620(local53, arg3, local34.aBoolean215, arg9, !local34.aBoolean201, local56);
					}
				} else {
					@Pc(767) Class11_Sub3 local767;
					if (arg5 == 0) {
						@Pc(740) int local740 = local34.anInt1923;
						if (Static453.aBoolean628 && local34.anInt1923 == -1) {
							local740 = 1;
						}
						if (local215) {
							@Pc(784) Class11_Sub3_Sub2 local784 = new Class11_Sub3_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, arg5, arg0, local181);
							if (local784.method4898()) {
								local784.method4902(arg7);
							}
							local767 = local784;
						} else {
							local767 = new Class11_Sub3_Sub3(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg5, arg0, arg4);
						}
						@Pc(799) Class11_Sub3 local799 = Static464.method5366(arg2, arg3, arg9);
						if (local799 instanceof Class11_Sub3_Sub1) {
							((Class11_Sub3_Sub1) local799).aClass11_Sub3_1 = local767;
						} else {
							Static176.method2561(arg2, arg3, arg9, local767, null);
						}
						if (Static155.aBoolean247) {
							if (arg0 == 0) {
								if (local34.aBoolean203) {
									local129.qa(arg3, arg9, 50);
									local129.qa(arg3, arg9 + 1, 50);
								}
								if (local740 == 1 && !super.aBoolean425) {
									super.aByteArrayArrayArray12[arg2][arg3][arg9] = (byte) (super.aByteArrayArrayArray12[arg2][arg3][arg9] | 0x1);
								}
							} else if (arg0 == 1) {
								if (local34.aBoolean203) {
									local129.qa(arg3, arg9 + 1, 50);
									local129.qa(arg3 + 1, arg9 + 1, 50);
								}
								if (local740 == 1 && !super.aBoolean425) {
									super.aByteArrayArrayArray12[arg2][arg3][arg9 + 1] = (byte) (super.aByteArrayArrayArray12[arg2][arg3][arg9 + 1] | 0x2);
								}
							} else if (arg0 == 2) {
								if (local34.aBoolean203) {
									local129.qa(arg3 + 1, arg9, 50);
									local129.qa(arg3 + 1, arg9 - -1, 50);
								}
								if (local740 == 1 && !super.aBoolean425) {
									super.aByteArrayArrayArray12[arg2][arg3 + 1][arg9] = (byte) (super.aByteArrayArrayArray12[arg2][arg3 + 1][arg9] | 0x1);
								}
							} else if (arg0 == 3) {
								if (local34.aBoolean203) {
									local129.qa(arg3, arg9, 50);
									local129.qa(arg3 + 1, arg9, 50);
								}
								if (local740 == 1 && !super.aBoolean425) {
									super.aByteArrayArrayArray12[arg2][arg3][arg9] = (byte) (super.aByteArrayArrayArray12[arg2][arg3][arg9] | 0x2);
								}
							}
						}
						if (local34.lb != 0 && arg1 != null) {
							arg1.method3611(arg9, arg3, arg0, local34.aBoolean215, !local34.aBoolean201, arg5);
						}
						if (local34.anInt1962 != 16) {
							Static208.method3015(arg2, arg3, arg9, local34.anInt1962);
						}
					} else {
						@Pc(1072) Class11_Sub3_Sub2 local1072;
						@Pc(1082) Class11_Sub3 local1082;
						if (arg5 == 1) {
							if (local215) {
								local1072 = new Class11_Sub3_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, arg5, arg0, local181);
								if (local1072.method4898()) {
									local1072.method4902(arg7);
								}
								local1082 = local1072;
							} else {
								local1082 = new Class11_Sub3_Sub3(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg5, arg0, arg4);
							}
							local767 = Static464.method5366(arg2, arg3, arg9);
							if (local767 instanceof Class11_Sub3_Sub1) {
								((Class11_Sub3_Sub1) local767).aClass11_Sub3_1 = local1082;
							} else {
								Static176.method2561(arg2, arg3, arg9, local1082, null);
							}
							if (local34.aBoolean203 && Static155.aBoolean247) {
								if (arg0 == 0) {
									local129.qa(arg3, arg9 + 1, 50);
								} else if (arg0 == 1) {
									local129.qa(arg3 + 1, arg9 + 1, 50);
								} else if (arg0 == 2) {
									local129.qa(arg3 + 1, arg9, 50);
								} else if (arg0 == 3) {
									local129.qa(arg3, arg9, 50);
								}
							}
							if (local34.lb != 0 && arg1 != null) {
								arg1.method3611(arg9, arg3, arg0, local34.aBoolean215, !local34.aBoolean201, arg5);
							}
						} else if (arg5 == 2) {
							local383 = arg0 + 1 & 0x3;
							if (local215) {
								@Pc(1266) Class11_Sub3_Sub2 local1266 = new Class11_Sub3_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, arg5, arg0 + 4, local181);
								@Pc(1281) Class11_Sub3_Sub2 local1281 = new Class11_Sub3_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, arg5, local383, local181);
								if (local1266.method4898()) {
									local1266.method4902(arg7);
								}
								local767 = local1281;
								local1082 = local1266;
								if (local1281.method4898()) {
									local1281.method4902(arg7);
								}
							} else {
								local1082 = new Class11_Sub3_Sub3(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg5, arg0 + 4, arg4);
								local767 = new Class11_Sub3_Sub3(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg5, local383, arg4);
							}
							Static176.method2561(arg2, arg3, arg9, local1082, local767);
							if (local34.anInt1923 == 1 && Static155.aBoolean247 && !super.aBoolean425) {
								if (arg0 == 0) {
									super.aByteArrayArrayArray12[arg2][arg3][arg9] = (byte) (super.aByteArrayArrayArray12[arg2][arg3][arg9] | 0x1);
									super.aByteArrayArrayArray12[arg2][arg3][arg9 + 1] = (byte) (super.aByteArrayArrayArray12[arg2][arg3][arg9 + 1] | 0x2);
								} else if (arg0 == 1) {
									super.aByteArrayArrayArray12[arg2][arg3][arg9 + 1] = (byte) (super.aByteArrayArrayArray12[arg2][arg3][arg9 + 1] | 0x2);
									super.aByteArrayArrayArray12[arg2][arg3 + 1][arg9] = (byte) (super.aByteArrayArrayArray12[arg2][arg3 + 1][arg9] | 0x1);
								} else if (arg0 == 2) {
									super.aByteArrayArrayArray12[arg2][arg3 + 1][arg9] = (byte) (super.aByteArrayArrayArray12[arg2][arg3 + 1][arg9] | 0x1);
									super.aByteArrayArrayArray12[arg2][arg3][arg9] = (byte) (super.aByteArrayArrayArray12[arg2][arg3][arg9] | 0x2);
								} else if (arg0 == 3) {
									super.aByteArrayArrayArray12[arg2][arg3][arg9] = (byte) (super.aByteArrayArrayArray12[arg2][arg3][arg9] | 0x2);
									super.aByteArrayArrayArray12[arg2][arg3][arg9] = (byte) (super.aByteArrayArrayArray12[arg2][arg3][arg9] | 0x1);
								}
							}
							if (local34.lb != 0 && arg1 != null) {
								arg1.method3611(arg9, arg3, arg0, local34.aBoolean215, !local34.aBoolean201, arg5);
							}
							if (local34.anInt1962 != 16) {
								Static208.method3015(arg2, arg3, arg9, local34.anInt1962);
							}
						} else if (arg5 == 3) {
							if (local215) {
								local1072 = new Class11_Sub3_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, arg5, arg0, local181);
								if (local1072.method4898()) {
									local1072.method4902(arg7);
								}
								local1082 = local1072;
							} else {
								local1082 = new Class11_Sub3_Sub3(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg5, arg0, arg4);
							}
							local767 = Static464.method5366(arg2, arg3, arg9);
							if (local767 instanceof Class11_Sub3_Sub1) {
								((Class11_Sub3_Sub1) local767).aClass11_Sub3_1 = local1082;
							} else {
								Static176.method2561(arg2, arg3, arg9, local1082, null);
							}
							if (local34.aBoolean203 && Static155.aBoolean247) {
								if (arg0 == 0) {
									local129.qa(arg3, arg9 + 1, 50);
								} else if (arg0 == 1) {
									local129.qa(arg3 + 1, arg9 + 1, 50);
								} else if (arg0 == 2) {
									local129.qa(arg3 + 1, arg9, 50);
								} else if (arg0 == 3) {
									local129.qa(arg3, arg9, 50);
								}
							}
							if (local34.lb != 0 && arg1 != null) {
								arg1.method3611(arg9, arg3, arg0, local34.aBoolean215, !local34.aBoolean201, arg5);
							}
						} else if (arg5 == 9) {
							if (local215) {
								local345 = new Class11_Sub1_Sub2(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg3, arg3, arg9, arg9, arg5, arg0, local181);
								local385 = local345;
								if (local345.method4898()) {
									local345.method4902(arg7);
								}
							} else {
								local385 = new Class11_Sub1_Sub4(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg3, arg3 + local53 - 1, arg9, arg9 + local56 - 1, arg5, arg0, arg4);
							}
							local634 = Static423.method5398(arg2, arg3, arg9, nc.class);
							if (local634 instanceof Class11_Sub1_Sub1 && local634.aShort103 == arg3 && arg9 == local634.aShort101) {
								((Class11_Sub1_Sub1) local634).aClass11_Sub1_1 = local385;
							} else {
								Static95.method5201(local385, false);
							}
							if (local34.lb != 0 && arg1 != null) {
								arg1.method3620(local53, arg3, local34.aBoolean215, arg9, !local34.aBoolean201, local56);
							}
							if (local34.anInt1962 != 16) {
								Static208.method3015(arg2, arg3, arg9, local34.anInt1962);
							}
						} else {
							@Pc(1842) Class11_Sub4 local1842;
							if (arg5 == 4) {
								if (local215) {
									@Pc(1840) Class11_Sub4_Sub2 local1840 = new Class11_Sub4_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, 0, 0, 0, arg5, arg0);
									local1842 = local1840;
									if (local1840.method4898()) {
										local1840.method4902(arg7);
									}
								} else {
									local1842 = new Class11_Sub4_Sub1(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, 0, 0, 0, arg5, arg0, arg4);
								}
								@Pc(1876) Class11_Sub4 local1876 = Static282.method3773(arg2, arg3, arg9);
								if (local1876 instanceof Class11_Sub4_Sub3) {
									((Class11_Sub4_Sub3) local1876).aClass11_Sub4_3 = local1842;
								} else {
									Static406.method5231(arg2, arg3, arg9, local1842, null);
								}
							} else {
								@Pc(1896) int local1896;
								@Pc(1902) Interface7 local1902;
								@Pc(1970) Class11_Sub4_Sub2 local1970;
								@Pc(1985) Class11_Sub4 local1985;
								if (arg5 == 5) {
									local1896 = 17;
									local1902 = (Interface7) Static464.method5366(arg2, arg3, arg9);
									if (local1902 != null) {
										local1896 = Static86.aClass248_7.method5246(local1902.method4895()).anInt1962 + 1;
									}
									if (local215) {
										local1970 = new Class11_Sub4_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, 0, local1896 * Static400.anIntArray466[arg0], Static443.anIntArray509[arg0] * local1896, arg5, arg0);
										local1842 = local1970;
										if (local1970.method4898()) {
											local1970.method4902(arg7);
										}
									} else {
										local1842 = new Class11_Sub4_Sub1(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, 0, Static400.anIntArray466[arg0] * local1896, Static443.anIntArray509[arg0] * local1896, arg5, arg0, arg4);
									}
									local1985 = Static282.method3773(arg2, arg3, arg9);
									if (local1985 instanceof Class11_Sub4_Sub3) {
										((Class11_Sub4_Sub3) local1985).aClass11_Sub4_3 = local1842;
									} else {
										Static406.method5231(arg2, arg3, arg9, local1842, null);
									}
								} else if (arg5 == 6) {
									local1896 = 9;
									local1902 = (Interface7) Static464.method5366(arg2, arg3, arg9);
									if (local1902 != null) {
										local1896 = Static86.aClass248_7.method5246(local1902.method4895()).anInt1962 / 2 + 1;
									}
									if (local215) {
										local1970 = new Class11_Sub4_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, arg0, Static400.anIntArray466[arg0] * local1896, local1896 * Static443.anIntArray509[arg0], arg5, arg0 + 4);
										local1842 = local1970;
										if (local1970.method4898()) {
											local1970.method4902(arg7);
										}
									} else {
										local1842 = new Class11_Sub4_Sub1(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg0, Static178.anIntArray238[arg0] * local1896, local1896 * Static54.anIntArray109[arg0], arg5, arg0 + 4, arg4);
									}
									local1985 = Static282.method3773(arg2, arg3, arg9);
									if (local1985 instanceof Class11_Sub4_Sub3) {
										((Class11_Sub4_Sub3) local1985).aClass11_Sub4_3 = local1842;
									} else {
										Static406.method5231(arg2, arg3, arg9, local1842, null);
									}
								} else if (arg5 == 7) {
									local1896 = arg0 + 2 & 0x3;
									if (local215) {
										@Pc(2170) Class11_Sub4_Sub2 local2170 = new Class11_Sub4_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, local1896, 0, 0, arg5, local1896 + 4);
										local1842 = local2170;
										if (local2170.method4898()) {
											local2170.method4902(arg7);
										}
									} else {
										local1842 = new Class11_Sub4_Sub1(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, local1896, 0, 0, arg5, local1896 + 4, arg4);
									}
									@Pc(2185) Class11_Sub4 local2185 = Static282.method3773(arg2, arg3, arg9);
									if (local2185 instanceof Class11_Sub4_Sub3) {
										((Class11_Sub4_Sub3) local2185).aClass11_Sub4_3 = local1842;
									} else {
										Static406.method5231(arg2, arg3, arg9, local1842, null);
									}
								} else if (arg5 == 8) {
									local383 = arg0 + 2 & 0x3;
									@Pc(2213) int local2213 = 9;
									@Pc(2219) Interface7 local2219 = (Interface7) Static464.method5366(arg2, arg3, arg9);
									if (local2219 != null) {
										local2213 = Static86.aClass248_7.method5246(local2219.method4895()).anInt1962 / 2 + 1;
									}
									@Pc(2264) Class11_Sub4 local2264;
									@Pc(2287) Class11_Sub4 local2287;
									if (local215) {
										local2264 = new Class11_Sub4_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, arg0, Static178.anIntArray238[arg0] * local2213, local2213 * Static54.anIntArray109[arg0], arg5, arg0 + 4);
										local2287 = new Class11_Sub4_Sub2(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, arg0, 0, 0, arg5, local383 + 4);
										if (local2264.method4898()) {
											local2264.method4902(arg7);
										}
										if (local2287.method4898()) {
											local2287.method4902(arg7);
										}
									} else {
										local2264 = new Class11_Sub4_Sub1(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg0, local2213 * Static178.anIntArray238[arg0], local2213 * Static54.anIntArray109[arg0], arg5, arg0 + 4, arg4);
										local2287 = new Class11_Sub4_Sub1(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg0, 0, 0, arg5, local383 + 4, arg4);
									}
									Static406.method5231(arg2, arg3, arg9, local2264, local2287);
								}
							}
						}
					}
				}
			}
		} else if (Static126.aClass19_Sub1_1.aBoolean387 || local34.anInt1928 != 0 || local34.lb == 1 || local34.aBoolean205) {
			@Pc(283) Class11_Sub2 local283;
			if (local215) {
				@Pc(273) Class11_Sub2_Sub3 local273 = new Class11_Sub2_Sub3(arg7, local34, arg6, local160, local152, local169, super.aBoolean425, arg0, local181);
				if (local273.method4898()) {
					local273.method4902(arg7);
				}
				local283 = local273;
			} else {
				local283 = new Class11_Sub2_Sub2(arg7, local34, arg2, arg6, local160, local152, local169, super.aBoolean425, arg0, arg4);
			}
			@Pc(305) Class11_Sub2 local305 = Static168.method2856(arg2, arg3, arg9);
			if (local305 instanceof Class11_Sub2_Sub1) {
				((Class11_Sub2_Sub1) local305).aClass11_Sub2_1 = local283;
			} else {
				Static24.method353(arg2, arg3, arg9, local283);
			}
			if (local34.lb == 1 && arg1 != null) {
				arg1.method3609(arg9, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(BLclient!za;)V")
	public void method3732(@OriginalArg(1) Class117 arg0) {
		Static27.method391(arg0);
		@Pc(19) int local19;
		if (super.anInt4713 > 1) {
			for (@Pc(15) int local15 = 0; super.anInt4702 > local15; local15++) {
				for (local19 = 0; local19 < super.anInt4711; local19++) {
					if ((Static278.aByteArrayArrayArray16[1][local15][local19] & 0x2) == 2) {
						Static291.method3890(local15, local19);
					}
				}
			}
		}
		for (local19 = 0; local19 < super.anInt4713; local19++) {
			for (@Pc(61) int local61 = 0; local61 <= super.anInt4711; local61++) {
				for (@Pc(65) int local65 = 0; super.anInt4702 >= local65; local65++) {
					@Pc(80) int local80;
					@Pc(82) int local82;
					@Pc(84) int local84;
					@Pc(130) int local130;
					@Pc(134) int local134;
					@Pc(235) int local235;
					@Pc(244) int local244;
					@Pc(264) int local264;
					@Pc(268) int local268;
					if ((super.aByteArrayArrayArray12[local19][local65][local61] & 0x1) != 0) {
						local80 = local61;
						local82 = local61;
						local84 = local19;
						while (local82 < super.anInt4711 && (super.aByteArrayArrayArray12[local19][local65][local82 + 1] & 0x1) != 0) {
							local82++;
						}
						while (local80 > 0 && (super.aByteArrayArrayArray12[local19][local65][local80 - 1] & 0x1) != 0) {
							local80--;
						}
						local130 = local19;
						label164: while (local84 > 0) {
							for (local134 = local80; local134 <= local82; local134++) {
								if ((super.aByteArrayArrayArray12[local84 - 1][local65][local134] & 0x1) == 0) {
									break label164;
								}
							}
							local84--;
						}
						label153: while (local130 < 3) {
							for (local134 = local80; local134 <= local82; local134++) {
								if ((super.aByteArrayArrayArray12[local130 + 1][local65][local134] & 0x1) == 0) {
									break label153;
								}
							}
							local130++;
						}
						local134 = (local130 + 1 - local84) * (local82 + 1 - local80);
						if (local134 >= 2) {
							local235 = super.anIntArrayArrayArray5[local130][local65][local80] - 240;
							local244 = super.anIntArrayArrayArray5[local84][local65][local80];
							Static170.method2262(1, local65 << 7, local65 << 7, local80 << 7, (local82 << 7) + 128, local235, local244);
							for (local264 = local84; local264 <= local130; local264++) {
								for (local268 = local80; local268 <= local82; local268++) {
									super.aByteArrayArrayArray12[local264][local65][local268] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local19][local65][local61] & 0x2) != 0) {
						local80 = local65;
						local82 = local65;
						local84 = local19;
						while (super.anInt4702 > local82 && (super.aByteArrayArrayArray12[local19][local82 + 1][local61] & 0x2) != 0) {
							local82++;
						}
						while (local80 > 0 && (super.aByteArrayArrayArray12[local19][local80 - 1][local61] & 0x2) != 0) {
							local80--;
						}
						local130 = local19;
						label218: while (local84 > 0) {
							for (local134 = local80; local134 <= local82; local134++) {
								if ((super.aByteArrayArrayArray12[local84 - 1][local134][local61] & 0x2) == 0) {
									break label218;
								}
							}
							local84--;
						}
						label207: while (local130 < 3) {
							for (local134 = local80; local134 <= local82; local134++) {
								if ((super.aByteArrayArrayArray12[local130 + 1][local134][local61] & 0x2) == 0) {
									break label207;
								}
							}
							local130++;
						}
						local134 = (local82 + 1 - local80) * (local130 + 1 - local84);
						if (local134 >= 2) {
							local235 = super.anIntArrayArrayArray5[local130][local80][local61] - 240;
							local244 = super.anIntArrayArrayArray5[local84][local80][local61];
							Static170.method2262(2, local80 << 7, (local82 << 7) + 128, local61 << 7, local61 << 7, local235, local244);
							for (local264 = local84; local264 <= local130; local264++) {
								for (local268 = local80; local268 <= local82; local268++) {
									super.aByteArrayArrayArray12[local264][local268][local61] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local19][local65][local61] & 0x4) != 0) {
						local80 = local65;
						local82 = local65;
						for (local84 = local61; local84 > 0 && (super.aByteArrayArrayArray12[local19][local65][local84 - 1] & 0x4) != 0; local84--) {
						}
						for (local130 = local61; local130 < super.anInt4711 && (super.aByteArrayArrayArray12[local19][local65][local130 + 1] & 0x4) != 0; local130++) {
						}
						label272: while (local80 > 0) {
							for (local134 = local84; local134 <= local130; local134++) {
								if ((super.aByteArrayArrayArray12[local19][local80 - 1][local134] & 0x4) == 0) {
									break label272;
								}
							}
							local80--;
						}
						label261: while (super.anInt4702 > local82) {
							for (local134 = local84; local134 <= local130; local134++) {
								if ((super.aByteArrayArrayArray12[local19][local82 + 1][local134] & 0x4) == 0) {
									break label261;
								}
							}
							local82++;
						}
						if ((local82 + 1 - local80) * (-local84 + 1 + local130) >= 4) {
							local134 = super.anIntArrayArrayArray5[local19][local80][local84];
							Static170.method2262(4, local80 << 7, (local82 << 7) + 128, local84 << 7, (local130 << 7) + 128, local134, local134);
							for (@Pc(714) int local714 = local80; local714 <= local82; local714++) {
								for (local235 = local84; local235 <= local130; local235++) {
									super.aByteArrayArrayArray12[local19][local714][local235] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!za;Lclient!mk;IIIII)V")
	public void method3733(@OriginalArg(0) Class117 arg0, @OriginalArg(1) Class158 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface7 local7 = null;
		if (arg5 == 0) {
			local7 = (Interface7) Static464.method5366(arg2, arg4, arg3);
		}
		if (arg5 == 1) {
			local7 = (Interface7) Static282.method3773(arg2, arg4, arg3);
		}
		if (arg5 == 2) {
			local7 = (Interface7) Static423.method5398(arg2, arg4, arg3, nc.class);
		}
		if (arg5 == 3) {
			local7 = (Interface7) Static168.method2856(arg2, arg4, arg3);
		}
		if (local7 == null) {
			return;
		}
		@Pc(72) Class87 local72 = Static86.aClass248_7.method5246(local7.method4895());
		@Pc(76) int local76 = local7.method4897();
		@Pc(80) int local80 = local7.method4899();
		if (local72.method1567()) {
			Static229.method3280(arg3, arg2, arg4, local72);
		}
		if (local7.method4898()) {
			local7.method4896(arg0);
		}
		if (arg5 == 0) {
			@Pc(108) Class11_Sub3 local108 = Static464.method5366(arg2, arg4, arg3);
			if (local108 instanceof Class11_Sub3_Sub1) {
				((Class11_Sub3_Sub1) local108).aClass11_Sub3_1 = null;
			} else {
				Static371.method4828(arg2, arg4, arg3);
			}
			if (local72.lb != 0) {
				arg1.method3621(local80, !local72.aBoolean201, arg4, local72.aBoolean215, local76, arg3);
				return;
			}
			return;
		}
		if (arg5 == 1) {
			@Pc(148) Class11_Sub4 local148 = Static282.method3773(arg2, arg4, arg3);
			if (!(local148 instanceof Class11_Sub4_Sub3)) {
				Static355.method4660(arg2, arg4, arg3);
				return;
			}
			((Class11_Sub4_Sub3) local148).aClass11_Sub4_3 = null;
			return;
		}
		if (arg5 != 2) {
			if (arg5 == 3) {
				@Pc(172) Class11_Sub2 local172 = Static168.method2856(arg2, arg4, arg3);
				if (local172 instanceof Class11_Sub2_Sub1) {
					((Class11_Sub2_Sub1) local172).aClass11_Sub2_1 = null;
				} else {
					Static216.method3114(arg2, arg4, arg3);
				}
				if (local72.lb == 1) {
					arg1.method3619(arg3, arg4);
					return;
				}
			}
			return;
		}
		@Pc(210) Class11_Sub1 local210 = Static423.method5398(arg2, arg4, arg3, nc.class);
		if (local210 instanceof Class11_Sub1_Sub1 && local210.aShort103 == arg4 && local210.aShort101 == arg3) {
			((Class11_Sub1_Sub1) local210).aClass11_Sub1_1 = null;
		} else {
			Static371.method4830(arg2, arg4, arg3, nc.class);
		}
		if (local72.lb != 0 && local72.anInt1916 + arg4 < super.anInt4702 && arg3 + local72.anInt1916 < super.anInt4711 && arg4 + local72.anInt1959 < super.anInt4702 && super.anInt4711 > local72.anInt1959 + arg3) {
			arg1.method3617(local80, local72.anInt1916, !local72.aBoolean201, local72.anInt1959, arg3, arg4, local72.aBoolean215);
			return;
		}
	}
}
