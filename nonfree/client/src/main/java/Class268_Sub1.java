import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rfa")
public final class Class268_Sub1 extends Class268 {

	@OriginalMember(owner = "client!rfa", name = "Q", descriptor = "I")
	public int anInt8005 = 99;

	@OriginalMember(owner = "client!rfa", name = "<init>", descriptor = "(IIIZ)V")
	public Class268_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static98.aClass171_1, Static436.aClass71_4);
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ILclient!r;ILclient!nc;III)V")
	public void method6300(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class220 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) Interface14 local5 = null;
		if (arg0 == 0) {
			local5 = (Interface14) Static597.method8185(arg5, arg4, arg2);
		}
		if (arg0 == 1) {
			local5 = (Interface14) Static542.method7423(arg5, arg4, arg2);
		}
		if (arg0 == 2) {
			local5 = (Interface14) Static13.method122(arg5, arg4, arg2, ofa.class);
		}
		if (arg0 == 3) {
			local5 = (Interface14) Static134.method2611(arg5, arg4, arg2);
		}
		if (local5 == null) {
			return;
		}
		@Pc(71) Class194 local71 = Static536.aClass146_4.method3721(local5.method4958());
		@Pc(75) int local75 = local5.method4959();
		@Pc(79) int local79 = local5.method4961();
		if (local71.method4704()) {
			Static99.method2047(local71, arg4, arg5, arg2);
		}
		if (local5.method4957()) {
			local5.method4960(arg1);
		}
		if (arg0 == 0) {
			Static97.method2032(arg5, arg4, arg2);
			if (local71.anInt5839 != 0) {
				arg3.method5075(arg4, !local71.aBoolean394, arg2, local79, local71.aBoolean405, local75);
			}
			if (local71.anInt5832 == 1) {
				if (local79 != 0) {
					if (local79 != 1) {
						if (local79 == 2) {
							Static223.method3699(arg2, 1, arg5, arg4 + 1);
						} else if (local79 == 3) {
							Static223.method3699(arg2, 2, arg5, arg4);
							return;
						}
						return;
					}
					Static223.method3699(arg2 + 1, 2, arg5, arg4);
					return;
				}
				Static223.method3699(arg2, 1, arg5, arg4);
				return;
			}
		} else if (arg0 == 1) {
			Static145.method2771(arg5, arg4, arg2);
		} else if (arg0 == 2) {
			Static363.method4393(arg5, arg4, arg2, ofa.class);
			if (local71.anInt5839 != 0 && super.anInt7982 > local71.anInt5845 + arg4 && super.anInt7981 > local71.anInt5845 + arg2 && local71.anInt5830 + arg4 < super.anInt7982 && super.anInt7981 > arg2 + local71.anInt5830) {
				arg3.method5085(arg2, local71.aBoolean405, !local71.aBoolean394, local71.anInt5830, arg4, local71.anInt5845, local79);
				return;
			}
			return;
		} else if (arg0 == 3) {
			Static36.method1018(arg5, arg4, arg2);
			if (local71.anInt5839 == 1) {
				arg3.method5073(arg4, arg2);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "([BIILclient!r;[Lclient!nc;B)V")
	public void method6303(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) Class220[] arg4) {
		@Pc(15) Class3_Sub26 local15 = new Class3_Sub26(arg0);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method6804();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local15.method6832();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local15.method6814();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = local54 + arg1;
				@Pc(79) int local79 = local48 + arg2;
				if (local74 > 0 && local79 > 0 && local74 < super.anInt7982 - 1 && local79 < super.anInt7981 - 1) {
					@Pc(104) Class220 local104 = null;
					if (!super.aBoolean552) {
						@Pc(109) int local109 = local58;
						if ((Static428.aByteArrayArrayArray4[1][local74][local79] & 0x2) == 2) {
							local109 = local58 - 1;
						}
						if (local109 >= 0) {
							local104 = arg4[local109];
						}
					}
					this.method6305(local104, local17, -1, local58, local74, local79, arg3, local58, local70, local66);
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!ie;ILclient!r;[IBI)V")
	public void method6304(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class31 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean552) {
			return;
		}
		@Pc(16) boolean local16 = false;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(24) Class263 local24 = null;
		while (true) {
			while (true) {
				while (true) {
					@Pc(29) int local29;
					@Pc(119) int local119;
					@Pc(527) int local527;
					@Pc(137) int local137;
					@Pc(141) int local141;
					while (arg0.aByteArray213.length > arg0.anInt8703) {
						local29 = arg0.method6814();
						if (local29 == 0) {
							local24 = new Class263(arg0);
						} else {
							@Pc(143) int local143;
							@Pc(147) int local147;
							@Pc(439) int local439;
							if (local29 == 1) {
								local119 = arg0.method6814();
								if (local119 > 0) {
									for (local527 = 0; local527 < local119; local527++) {
										@Pc(536) Class235 local536 = new Class235(arg2, arg0, 2);
										if (local536.anInt6518 == 31) {
											@Pc(549) Class292 local549 = Static517.aClass261_1.method5826(arg0.method6811());
											local536.method5259(local549.anInt8189, local549.anInt8187, local549.anInt8186, local549.anInt8185);
										}
										if (arg2.method8026() > 0) {
											@Pc(566) Class3_Sub9 local566 = local536.aClass3_Sub9_2;
											local143 = (arg1 << 9) + local566.method5997();
											local147 = local566.method5999() + (arg4 << 9);
											local439 = local143 >> 9;
											@Pc(591) int local591 = local147 >> 9;
											if (local439 >= 0 && local591 >= 0 && super.anInt7982 > local439 && super.anInt7981 > local591) {
												local566.method5991(local147, super.anIntArrayArrayArray12[local536.anInt6525][local439][local591] - local566.method5990(), local143);
												Static108.method4747(local536);
											}
										}
									}
								}
							} else if (local29 == 2) {
								if (local24 == null) {
									local24 = new Class263();
								}
								local24.method5841(arg0);
							} else if (local29 != 128) {
								if (local29 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray17 == null) {
									super.aByteArrayArrayArray17 = new byte[4][][];
								}
								local16 = true;
								for (local119 = 0; local119 < 4; local119++) {
									@Pc(125) byte local125 = arg0.method6825();
									if (local125 == 0 && super.aByteArrayArrayArray17[local119] != null) {
										local137 = arg1;
										local141 = arg1 + 64;
										local143 = arg4;
										local147 = arg4 + 64;
										if (local141 < 0) {
											local141 = 0;
										} else if (super.anInt7982 <= local141) {
											local141 = super.anInt7982;
										}
										if (arg1 < 0) {
											local137 = 0;
										} else if (arg1 >= super.anInt7982) {
											local137 = super.anInt7982;
										}
										if (arg4 < 0) {
											local143 = 0;
										} else if (arg4 >= super.anInt7981) {
											local143 = super.anInt7981;
										}
										if (local147 < 0) {
											local147 = 0;
										} else if (super.anInt7981 <= local147) {
											local147 = super.anInt7981;
										}
										while (local141 > local137) {
											while (local143 < local147) {
												super.aByteArrayArrayArray17[local119][local137][local143] = 0;
												local143++;
											}
											local137++;
										}
									} else if (local125 == 1) {
										if (super.aByteArrayArrayArray17[local119] == null) {
											super.aByteArrayArrayArray17[local119] = new byte[super.anInt7982 + 1][super.anInt7981 + 1];
										}
										for (local137 = 0; local137 < 64; local137 += 4) {
											for (local141 = 0; local141 < 64; local141 += 4) {
												@Pc(429) byte local429 = arg0.method6825();
												for (local147 = arg1 + local137; local147 < arg1 + local137 + 4; local147++) {
													for (local439 = arg4 + local141; local439 < local141 + arg4 + 4; local439++) {
														if (local147 >= 0 && super.anInt7982 > local147 && local439 >= 0 && super.anInt7981 > local439) {
															super.aByteArrayArrayArray17[local119][local147][local439] = local429;
														}
													}
												}
											}
										}
									} else if (local125 == 2) {
										if (super.aByteArrayArrayArray17[local119] == null) {
											super.aByteArrayArrayArray17[local119] = new byte[super.anInt7982 + 1][super.anInt7981 + 1];
										}
										if (local119 > 0) {
											local137 = arg1;
											local141 = arg1 + 64;
											local143 = arg4;
											if (local141 < 0) {
												local141 = 0;
											} else if (super.anInt7982 <= local141) {
												local141 = super.anInt7982;
											}
											if (arg1 < 0) {
												local137 = 0;
											} else if (super.anInt7982 <= arg1) {
												local137 = super.anInt7982;
											}
											local147 = arg4 + 64;
											if (arg4 < 0) {
												local143 = 0;
											} else if (super.anInt7981 <= arg4) {
												local143 = super.anInt7981;
											}
											if (local147 < 0) {
												local147 = 0;
											} else if (local147 >= super.anInt7981) {
												local147 = super.anInt7981;
											}
											while (local137 < local141) {
												while (local143 < local147) {
													super.aByteArrayArrayArray17[local119][local137][local143] = super.aByteArrayArrayArray17[local119 - 1][local137][local143];
													local143++;
												}
												local137++;
											}
										}
									}
								}
							} else if (arg3 == null) {
								arg0.anInt8703 += 10;
							} else {
								arg3[0] = arg0.method6811();
								arg3[1] = arg0.method6789();
								arg3[2] = arg0.method6789();
								arg3[3] = arg0.method6789();
								arg3[4] = arg0.method6811();
							}
						}
					}
					if (local24 != null) {
						for (local29 = 0; local29 < 8; local29++) {
							for (local119 = 0; local119 < 8; local119++) {
								local527 = local29 + (arg1 >> 3);
								local137 = local119 + (arg4 >> 3);
								if (local527 >= 0 && local527 < super.anInt7982 >> 3 && local137 >= 0 && local137 < super.anInt7981 >> 3) {
									Static39.method1072(local24, local527, local137);
								}
							}
						}
					}
					if (!local16 && super.aByteArrayArrayArray17 != null) {
						for (local29 = 0; local29 < 4; local29++) {
							if (super.aByteArrayArrayArray17[local29] != null) {
								for (local119 = 0; local119 < 16; local119++) {
									for (local527 = 0; local527 < 16; local527++) {
										local137 = local119 + (arg1 >> 2);
										local141 = local527 + (arg4 >> 2);
										if (local137 >= 0 && local137 < 26 && local141 >= 0 && local141 < 26) {
											super.aByteArrayArrayArray17[local29][local137][local141] = 0;
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

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(Lclient!nc;IIIIILclient!r;IIII)V")
	public void method6305(@OriginalArg(0) Class220 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class31 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (!Static348.aClass3_Sub51_Sub1_5.method7837(Static37.anInt1122) && !Static321.method4740(arg5, Static286.anInt5361, arg3, arg4)) {
			return;
		}
		if (this.anInt8005 > arg7) {
			this.anInt8005 = arg7;
		}
		@Pc(36) Class194 local36 = Static536.aClass146_4.method3721(arg1);
		if (arg6.method8040() && Static348.aClass3_Sub51_Sub1_5.aBoolean678 && local36.aBoolean398) {
			return;
		}
		@Pc(62) int local62;
		@Pc(59) int local59;
		if (arg8 == 1 || arg8 == 3) {
			local59 = local36.anInt5845;
			local62 = local36.anInt5830;
		} else {
			local59 = local36.anInt5830;
			local62 = local36.anInt5845;
		}
		@Pc(82) int local82;
		@Pc(80) int local80;
		if (local62 + arg4 > super.anInt7982) {
			local80 = arg4 + 1;
			local82 = arg4;
		} else {
			local82 = (local62 >> 1) + arg4;
			local80 = arg4 + (local62 + 1 >> 1);
		}
		@Pc(114) int local114;
		@Pc(122) int local122;
		if (super.anInt7981 >= arg5 + local59) {
			local114 = arg5 + (local59 >> 1);
			local122 = arg5 + (local59 + 1 >> 1);
		} else {
			local122 = arg5 + 1;
			local114 = arg5;
		}
		@Pc(134) Class127 local134 = Static256.aClass127Array3[arg3];
		@Pc(167) int local167 = local134.method7862(local114, local82) + local134.method7862(local114, local80) + local134.method7862(local122, local82) + local134.method7862(local122, local80) >> 2;
		@Pc(175) int local175 = (arg4 << 9) + (local62 << 8);
		@Pc(183) int local183 = (local59 << 8) + (arg5 << 9);
		@Pc(195) boolean local195 = Static465.aBoolean558 && !super.aBoolean552 && local36.aBoolean403;
		if (local36.method4704()) {
			Static138.method2725(arg5, local36, null, arg4, arg8, arg7, null);
		}
		@Pc(228) boolean local228 = arg2 == -1 && local36.anInt5818 == -1 && local36.anIntArray285 == null && local36.anIntArray286 == null && !local36.aBoolean399;
		if (Static300.aBoolean381 && (Static63.method1566(arg9) && local36.anInt5832 != 1 || !(!Static290.method4346(arg9) || local36.anInt5832 != 0))) {
			return;
		}
		if (arg9 != 22) {
			@Pc(373) Class25_Sub2_Sub2 local373;
			@Pc(343) Class25_Sub2_Sub2_Sub4 local343;
			@Pc(375) int local375;
			@Pc(443) int local443;
			if (arg9 == 10 || arg9 == 11) {
				local343 = null;
				if (local228) {
					@Pc(405) Class25_Sub2_Sub2_Sub4 local405 = new Class25_Sub2_Sub2_Sub4(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg4, local62 + arg4 - 1, arg5, local59 + arg5 - 1, arg9, arg8, local195);
					local373 = local405;
					local343 = local405;
					local375 = local405.method4144();
				} else {
					local373 = new Class25_Sub2_Sub2_Sub3(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg4, local62 + arg4 - 1, arg5, local59 + arg5 - 1, arg9, arg8, arg2);
					local375 = 15;
				}
				if (Static492.method6621(local373, false)) {
					if (local343 != null && local343.method4957()) {
						local343.method4962(arg6);
					}
					if (local36.aBoolean408 && Static465.aBoolean558) {
						if (local375 > 30) {
							local375 = 30;
						}
						for (local443 = 0; local443 <= local62; local443++) {
							for (@Pc(447) int local447 = 0; local447 <= local59; local447++) {
								local134.a(local443 + arg4, local447 + arg5, local375);
							}
						}
					}
				}
				if (local36.anInt5839 != 0 && arg0 != null) {
					arg0.method5084(local36.aBoolean405, local62, arg4, !local36.aBoolean394, arg5, local59);
				}
			} else if (arg9 >= 12 && arg9 <= 17 || arg9 >= 18 && arg9 <= 21) {
				if (local228) {
					local343 = new Class25_Sub2_Sub2_Sub4(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg4, local62 + arg4 - 1, arg5, arg5 + local59 - 1, arg9, arg8, local195);
					if (local343.method4957()) {
						local343.method4962(arg6);
					}
					local373 = local343;
				} else {
					local373 = new Class25_Sub2_Sub2_Sub3(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg4, local62 + arg4 - 1, arg5, arg5 + local59 - 1, arg9, arg8, arg2);
				}
				Static492.method6621(local373, false);
				if (Static465.aBoolean558 && !super.aBoolean552 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg7 > 0 && local36.anInt5832 != 0) {
					super.aByteArrayArrayArray16[arg7][arg4][arg5] = (byte) (super.aByteArrayArrayArray16[arg7][arg4][arg5] | 0x4);
				}
				if (local36.anInt5839 != 0 && arg0 != null) {
					arg0.method5084(local36.aBoolean405, local62, arg4, !local36.aBoolean394, arg5, local59);
				}
			} else {
				@Pc(697) Class25_Sub2_Sub3 local697;
				if (arg9 == 0) {
					@Pc(659) int local659 = local36.anInt5832;
					if (Static443.aBoolean546 && local36.anInt5832 == -1) {
						local659 = 1;
					}
					if (local228) {
						@Pc(685) Class25_Sub2_Sub3_Sub1 local685 = new Class25_Sub2_Sub3_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg9, arg8, local195);
						if (local685.method4957()) {
							local685.method4962(arg6);
						}
						local697 = local685;
					} else {
						local697 = new Class25_Sub2_Sub3_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg9, arg8, arg2);
					}
					Static332.method1386(arg7, arg4, arg5, local697, null);
					if (arg8 == 0) {
						if (Static465.aBoolean558 && local36.aBoolean408) {
							local134.a(arg4, arg5, 50);
							local134.a(arg4, arg5 + 1, 50);
						}
						if (local659 == 1 && !super.aBoolean552) {
							Static516.method6951(1, local36.anInt5817, arg4, arg5, arg7, local36.lb);
						}
					} else if (arg8 == 1) {
						if (Static465.aBoolean558 && local36.aBoolean408) {
							local134.a(arg4, arg5 + 1, 50);
							local134.a(arg4 + 1, arg5 - -1, 50);
						}
						if (local659 == 1 && !super.aBoolean552) {
							Static516.method6951(2, -local36.anInt5817, arg4, arg5 + 1, arg7, local36.lb);
						}
					} else if (arg8 == 2) {
						if (Static465.aBoolean558 && local36.aBoolean408) {
							local134.a(arg4 + 1, arg5, 50);
							local134.a(arg4 + 1, arg5 + 1, 50);
						}
						if (local659 == 1 && !super.aBoolean552) {
							Static516.method6951(1, -local36.anInt5817, arg4 + 1, arg5, arg7, local36.lb);
						}
					} else if (arg8 == 3) {
						if (Static465.aBoolean558 && local36.aBoolean408) {
							local134.a(arg4, arg5, 50);
							local134.a(arg4 + 1, arg5, 50);
						}
						if (local659 == 1 && !super.aBoolean552) {
							Static516.method6951(2, local36.anInt5817, arg4, arg5, arg7, local36.lb);
						}
					}
					if (local36.anInt5839 != 0 && arg0 != null) {
						arg0.method5074(!local36.aBoolean394, arg8, arg9, arg4, local36.aBoolean405, arg5);
					}
					if (local36.anInt5792 != 64) {
						Static348.method3098(arg7, arg4, arg5, local36.anInt5792);
					}
				} else {
					@Pc(966) Class25_Sub2_Sub3_Sub1 local966;
					@Pc(948) Class25_Sub2_Sub3 local948;
					if (arg9 == 1) {
						if (local228) {
							local966 = new Class25_Sub2_Sub3_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg9, arg8, local195);
							if (local966.method4957()) {
								local966.method4962(arg6);
							}
							local948 = local966;
						} else {
							local948 = new Class25_Sub2_Sub3_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg9, arg8, arg2);
						}
						Static332.method1386(arg7, arg4, arg5, local948, null);
						if (local36.aBoolean408 && Static465.aBoolean558) {
							if (arg8 == 0) {
								local134.a(arg4, arg5 + 1, 50);
							} else if (arg8 == 1) {
								local134.a(arg4 + 1, arg5 + 1, 50);
							} else if (arg8 == 2) {
								local134.a(arg4 + 1, arg5, 50);
							} else if (arg8 == 3) {
								local134.a(arg4, arg5, 50);
							}
						}
						if (local36.anInt5839 != 0 && arg0 != null) {
							arg0.method5074(!local36.aBoolean394, arg8, arg9, arg4, local36.aBoolean405, arg5);
						}
					} else if (arg9 == 2) {
						local375 = arg8 + 1 & 0x3;
						if (local228) {
							@Pc(1125) Class25_Sub2_Sub3_Sub1 local1125 = new Class25_Sub2_Sub3_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg9, arg8 + 4, local195);
							@Pc(1141) Class25_Sub2_Sub3_Sub1 local1141 = new Class25_Sub2_Sub3_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg9, local375, local195);
							if (local1125.method4957()) {
								local1125.method4962(arg6);
							}
							local697 = local1141;
							local948 = local1125;
							if (local1141.method4957()) {
								local1141.method4962(arg6);
							}
						} else {
							local948 = new Class25_Sub2_Sub3_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg9, arg8 + 4, arg2);
							local697 = new Class25_Sub2_Sub3_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg9, local375, arg2);
						}
						Static332.method1386(arg7, arg4, arg5, local948, local697);
						if ((local36.anInt5832 == 1 || Static443.aBoolean546 && local36.anInt5832 == -1) && !super.aBoolean552) {
							if (arg8 == 0) {
								Static516.method6951(1, local36.anInt5817, arg4, arg5, arg7, local36.lb);
								Static516.method6951(2, local36.anInt5817, arg4, arg5 + 1, arg7, local36.lb);
							} else if (arg8 == 1) {
								Static516.method6951(1, local36.anInt5817, arg4 + 1, arg5, arg7, local36.lb);
								Static516.method6951(2, local36.anInt5817, arg4, arg5 + 1, arg7, local36.lb);
							} else if (arg8 == 2) {
								Static516.method6951(1, local36.anInt5817, arg4 + 1, arg5, arg7, local36.lb);
								Static516.method6951(2, local36.anInt5817, arg4, arg5, arg7, local36.lb);
							} else if (arg8 == 3) {
								Static516.method6951(1, local36.anInt5817, arg4, arg5, arg7, local36.lb);
								Static516.method6951(2, local36.anInt5817, arg4, arg5, arg7, local36.lb);
							}
						}
						if (local36.anInt5839 != 0 && arg0 != null) {
							arg0.method5074(!local36.aBoolean394, arg8, arg9, arg4, local36.aBoolean405, arg5);
						}
						if (local36.anInt5792 != 64) {
							Static348.method3098(arg7, arg4, arg5, local36.anInt5792);
						}
					} else if (arg9 == 3) {
						if (local228) {
							local966 = new Class25_Sub2_Sub3_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg9, arg8, local195);
							local948 = local966;
							if (local966.method4957()) {
								local966.method4962(arg6);
							}
						} else {
							local948 = new Class25_Sub2_Sub3_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg9, arg8, arg2);
						}
						Static332.method1386(arg7, arg4, arg5, local948, null);
						if (local36.aBoolean408 && Static465.aBoolean558) {
							if (arg8 == 0) {
								local134.a(arg4, arg5 + 1, 50);
							} else if (arg8 == 1) {
								local134.a(arg4 + 1, arg5 + 1, 50);
							} else if (arg8 == 2) {
								local134.a(arg4 + 1, arg5, 50);
							} else if (arg8 == 3) {
								local134.a(arg4, arg5, 50);
							}
						}
						if (local36.anInt5839 != 0 && arg0 != null) {
							arg0.method5074(!local36.aBoolean394, arg8, arg9, arg4, local36.aBoolean405, arg5);
						}
					} else if (arg9 == 9) {
						if (local228) {
							local343 = new Class25_Sub2_Sub2_Sub4(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg4, arg4, arg5, arg5, arg9, arg8, local195);
							if (local343.method4957()) {
								local343.method4962(arg6);
							}
							local373 = local343;
						} else {
							local373 = new Class25_Sub2_Sub2_Sub3(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg4, arg4 + local62 - 1, arg5, local59 + arg5 - 1, arg9, arg8, arg2);
						}
						Static492.method6621(local373, false);
						if (local36.anInt5839 != 0 && arg0 != null) {
							arg0.method5084(local36.aBoolean405, local62, arg4, !local36.aBoolean394, arg5, local59);
						}
						if (local36.anInt5792 != 64) {
							Static348.method3098(arg7, arg4, arg5, local36.anInt5792);
						}
					} else {
						@Pc(1601) Class25_Sub2_Sub1 local1601;
						if (arg9 == 4) {
							if (local228) {
								@Pc(1599) Class25_Sub2_Sub1_Sub1 local1599 = new Class25_Sub2_Sub1_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, 0, 0, arg9, arg8);
								local1601 = local1599;
								if (local1599.method4957()) {
									local1599.method4962(arg6);
								}
							} else {
								local1601 = new Class25_Sub2_Sub1_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, 0, 0, arg9, arg8, arg2);
							}
							Static596.method8175(arg7, arg4, arg5, local1601, null);
						} else {
							@Pc(1641) int local1641;
							@Pc(1647) Interface14 local1647;
							@Pc(1686) Class25_Sub2_Sub1_Sub1 local1686;
							if (arg9 == 5) {
								local1641 = 65;
								local1647 = (Interface14) Static597.method8185(arg7, arg4, arg5);
								if (local1647 != null) {
									local1641 = Static536.aClass146_4.method3721(local1647.method4958()).anInt5792 + 1;
								}
								if (local228) {
									local1686 = new Class25_Sub2_Sub1_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, Static360.anIntArray594[arg8] * local1641, local1641 * Static205.anIntArray197[arg8], arg9, arg8);
									if (local1686.method4957()) {
										local1686.method4962(arg6);
									}
									local1601 = local1686;
								} else {
									local1601 = new Class25_Sub2_Sub1_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, Static360.anIntArray594[arg8] * local1641, Static205.anIntArray197[arg8] * local1641, arg9, arg8, arg2);
								}
								Static596.method8175(arg7, arg4, arg5, local1601, null);
							} else if (arg9 == 6) {
								local1641 = 33;
								local1647 = (Interface14) Static597.method8185(arg7, arg4, arg5);
								if (local1647 != null) {
									local1641 = Static536.aClass146_4.method3721(local1647.method4958()).anInt5792 / 2 + 1;
								}
								if (local228) {
									local1686 = new Class25_Sub2_Sub1_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, local1641 * Static360.anIntArray594[arg8], local1641 * Static205.anIntArray197[arg8], arg9, arg8 + 4);
									if (local1686.method4957()) {
										local1686.method4962(arg6);
									}
									local1601 = local1686;
								} else {
									local1601 = new Class25_Sub2_Sub1_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, local1641 * Static63.anIntArray53[arg8], local1641 * Static163.anIntArray35[arg8], arg9, arg8 + 4, arg2);
								}
								Static596.method8175(arg7, arg4, arg5, local1601, null);
							} else if (arg9 == 7) {
								local1641 = arg8 + 2 & 0x3;
								if (local228) {
									@Pc(1870) Class25_Sub2_Sub1_Sub1 local1870 = new Class25_Sub2_Sub1_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, 0, 0, arg9, local1641 + 4);
									if (local1870.method4957()) {
										local1870.method4962(arg6);
									}
									local1601 = local1870;
								} else {
									local1601 = new Class25_Sub2_Sub1_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, 0, 0, arg9, local1641 + 4, arg2);
								}
								Static596.method8175(arg7, arg4, arg5, local1601, null);
							} else if (arg9 == 8) {
								local375 = arg8 + 2 & 0x3;
								local443 = 33;
								@Pc(1928) Interface14 local1928 = (Interface14) Static597.method8185(arg7, arg4, arg5);
								if (local1928 != null) {
									local443 = Static536.aClass146_4.method3721(local1928.method4958()).anInt5792 / 2 + 1;
								}
								@Pc(1972) Class25_Sub2_Sub1 local1972;
								@Pc(1992) Class25_Sub2_Sub1 local1992;
								if (local228) {
									local1972 = new Class25_Sub2_Sub1_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, local443 * Static63.anIntArray53[arg8], Static163.anIntArray35[arg8] * local443, arg9, arg8 + 4);
									local1992 = new Class25_Sub2_Sub1_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, 0, 0, arg9, local375 + 4);
									if (local1972.method4957()) {
										local1972.method4962(arg6);
									}
									if (local1992.method4957()) {
										local1992.method4962(arg6);
									}
								} else {
									local1972 = new Class25_Sub2_Sub1_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, Static63.anIntArray53[arg8] * local443, local443 * Static163.anIntArray35[arg8], arg9, arg8 + 4, arg2);
									local1992 = new Class25_Sub2_Sub1_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, 0, 0, arg9, local375 + 4, arg2);
								}
								Static596.method8175(arg7, arg4, arg5, local1972, local1992);
							}
						}
					}
				}
			}
		} else if (Static348.aClass3_Sub51_Sub1_5.aBoolean682 || local36.anInt5831 != 0 || local36.anInt5839 == 1 || local36.aBoolean396) {
			@Pc(297) Class25_Sub2_Sub5 local297;
			if (local228) {
				@Pc(287) Class25_Sub2_Sub5_Sub1 local287 = new Class25_Sub2_Sub5_Sub1(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg8, local195);
				if (local287.method4957()) {
					local287.method4962(arg6);
				}
				local297 = local287;
			} else {
				local297 = new Class25_Sub2_Sub5_Sub2(arg6, local36, arg7, arg3, local175, local167, local183, super.aBoolean552, arg8, arg2);
			}
			Static163.method1107(arg7, arg4, arg5, local297);
			if (local36.anInt5839 == 1 && arg0 != null) {
				arg0.method5076(arg5, arg4);
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(IIILclient!r;III[Lclient!nc;II[B)V")
	public void method6307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class31 arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class220[] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte[] arg9) {
		@Pc(18) Class3_Sub26 local18 = new Class3_Sub26(arg9);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method6804();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method6832();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(51) int local51 = local35 & 0x3F;
				@Pc(57) int local57 = local35 >> 6 & 0x3F;
				@Pc(61) int local61 = local35 >> 12;
				@Pc(65) int local65 = local18.method6814();
				@Pc(69) int local69 = local65 >> 2;
				@Pc(73) int local73 = local65 & 0x3;
				if (local61 == arg0 && arg2 <= local57 && local57 < arg2 + 8 && arg1 <= local51 && local51 < arg1 + 8) {
					@Pc(101) Class194 local101 = Static536.aClass146_4.method3721(local20);
					@Pc(118) int local118 = Static552.method7566(local73, local101.anInt5830, local101.anInt5845, local51 & 0x7, local57 & 0x7, arg5) + arg4;
					@Pc(135) int local135 = Static54.method1341(local101.anInt5830, arg5, local101.anInt5845, local51 & 0x7, local73, local57 & 0x7) + arg7;
					if (local118 > 0 && local135 > 0 && local118 < super.anInt7982 - 1 && local135 < super.anInt7981 - 1) {
						@Pc(160) Class220 local160 = null;
						if (!super.aBoolean552) {
							@Pc(165) int local165 = arg8;
							if ((Static428.aByteArrayArrayArray4[1][local118][local135] & 0x2) == 2) {
								local165 = arg8 - 1;
							}
							if (local165 >= 0) {
								local160 = arg6[local165];
							}
						}
						this.method6305(local160, local20, -1, arg8, local118, local135, arg3, arg8, local73 + arg5 & 0x3, local69);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(ZLclient!r;Z)V")
	public void method6308(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class31 arg1) {
		Static576.method7811();
		if (!arg0) {
			@Pc(20) int local20;
			@Pc(24) int local24;
			if (super.anInt7987 > 1) {
				for (local20 = 0; super.anInt7982 > local20; local20++) {
					for (local24 = 0; super.anInt7981 > local24; local24++) {
						if ((Static428.aByteArrayArrayArray4[1][local20][local24] & 0x2) == 2) {
							Static130.method6159(local20, local24);
						}
					}
				}
			}
			for (local20 = 0; super.anInt7987 > local20; local20++) {
				for (local24 = 0; local24 <= super.anInt7981; local24++) {
					for (@Pc(70) int local70 = 0; super.anInt7982 >= local70; local70++) {
						if ((super.aByteArrayArrayArray16[local20][local70][local24] & 0x4) != 0) {
							@Pc(88) int local88 = local70;
							@Pc(90) int local90 = local70;
							@Pc(92) int local92 = local24;
							@Pc(94) int local94 = local24;
							while (local92 > 0 && (super.aByteArrayArrayArray16[local20][local70][local92 - 1] & 0x4) != 0 && local24 - local92 < 10) {
								local92--;
							}
							while (super.anInt7981 > local94 && (super.aByteArrayArrayArray16[local20][local70][local94 + 1] & 0x4) != 0 && local94 - local92 < 10) {
								local94++;
							}
							@Pc(156) int local156;
							label111: while (local88 > 0 && local70 - local88 < 10) {
								for (local156 = local92; local156 <= local94; local156++) {
									if ((super.aByteArrayArrayArray16[local20][local88 - 1][local156] & 0x4) == 0) {
										break label111;
									}
								}
								local88--;
							}
							label98: while (super.anInt7982 > local90 && local90 - local88 < 10) {
								for (local156 = local92; local156 <= local94; local156++) {
									if ((super.aByteArrayArrayArray16[local20][local90 + 1][local156] & 0x4) == 0) {
										break label98;
									}
								}
								local90++;
							}
							if ((local94 + 1 - local92) * (local90 + -local88 + 1) >= 4) {
								local156 = super.anIntArrayArrayArray12[local20][local88][local92];
								Static178.method3179(local156, local88 << 9, local92 << 9, local20, local156, (local94 << 9) + 512, (local90 << 9) - -512);
								for (@Pc(278) int local278 = local88; local278 <= local90; local278++) {
									for (@Pc(282) int local282 = local92; local282 <= local94; local282++) {
										super.aByteArrayArrayArray16[local20][local278][local282] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static87.method6550();
		}
		super.aByteArrayArrayArray16 = null;
	}

	@OriginalMember(owner = "client!rfa", name = "a", descriptor = "(I[IIIIILclient!r;Lclient!ie;III)V")
	public void method6309(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class31 arg5, @OriginalArg(7) Class3_Sub26 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean552) {
			return;
		}
		@Pc(19) Class263 local19 = null;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(31) int local31 = (arg9 & 0x7) * 8;
		@Pc(37) int local37 = (arg8 & 0x7) * 8;
		while (true) {
			@Pc(42) int local42;
			@Pc(60) int local60;
			@Pc(318) int local318;
			@Pc(64) int local64;
			while (arg6.anInt8703 < arg6.aByteArray213.length) {
				local42 = arg6.method6814();
				if (local42 == 0) {
					local19 = new Class263(arg6);
				} else {
					@Pc(113) int local113;
					@Pc(159) int local159;
					@Pc(177) int local177;
					@Pc(107) int local107;
					if (local42 == 1) {
						local60 = arg6.method6814();
						if (local60 > 0) {
							for (local64 = 0; local64 < local60; local64++) {
								@Pc(73) Class235 local73 = new Class235(arg5, arg6, 2);
								if (local73.anInt6518 == 31) {
									@Pc(84) Class292 local84 = Static517.aClass261_1.method5826(arg6.method6811());
									local73.method5259(local84.anInt8189, local84.anInt8187, local84.anInt8186, local84.anInt8185);
								}
								if (arg5.method8026() > 0) {
									@Pc(101) Class3_Sub9 local101 = local73.aClass3_Sub9_2;
									local107 = local101.method5997() >> 9;
									local113 = local101.method5999() >> 9;
									if (local73.anInt6525 == arg4 && local107 >= local31 && local107 < local31 + 8 && local113 >= local37 && local113 < local37 + 8) {
										local159 = Static576.method7810(arg2, local101.method5999() & 0xFFF, local101.method5997() & 0xFFF) + (arg0 << 9);
										local177 = Static298.method4527(arg2, local101.method5999() & 0xFFF, local101.method5997() & 0xFFF) + (arg3 << 9);
										local107 = local159 >> 9;
										local113 = local177 >> 9;
										if (local107 >= 0 && local113 >= 0 && local107 < super.anInt7982 && super.anInt7981 > local113) {
											local101.method5991(local177, super.anIntArrayArrayArray12[arg4][local107][local113] - local101.method5990(), local159);
											Static108.method4747(local73);
										}
									}
								}
							}
						}
					} else if (local42 == 2) {
						if (local19 == null) {
							local19 = new Class263();
						}
						local19.method5841(arg6);
					} else if (local42 != 128) {
						if (local42 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray17 == null) {
							super.aByteArrayArrayArray17 = new byte[4][][];
						}
						for (local60 = 0; local60 < 4; local60++) {
							@Pc(306) byte local306 = arg6.method6825();
							@Pc(322) int local322;
							if (local306 == 0 && super.aByteArrayArrayArray17[arg7] != null) {
								if (local60 <= arg4) {
									local318 = arg0;
									local322 = arg0 + 7;
									local107 = arg3;
									if (arg0 < 0) {
										local318 = 0;
									} else if (arg0 >= super.anInt7982) {
										local318 = super.anInt7982;
									}
									if (arg3 < 0) {
										local107 = 0;
									} else if (super.anInt7981 <= arg3) {
										local107 = super.anInt7981;
									}
									if (local322 < 0) {
										local322 = 0;
									} else if (local322 >= super.anInt7982) {
										local322 = super.anInt7982;
									}
									local113 = arg3 + 7;
									if (local113 < 0) {
										local113 = 0;
									} else if (local113 >= super.anInt7981) {
										local113 = super.anInt7981;
									}
									while (local318 < local322) {
										while (local107 < local113) {
											super.aByteArrayArrayArray17[arg7][local318][local107] = 0;
											local107++;
										}
										local318++;
									}
								}
							} else if (local306 == 1) {
								if (super.aByteArrayArrayArray17[arg7] == null) {
									super.aByteArrayArrayArray17[arg7] = new byte[super.anInt7982 + 1][super.anInt7981 + 1];
								}
								for (local318 = 0; local318 < 64; local318 += 4) {
									for (local322 = 0; local322 < 64; local322 += 4) {
										@Pc(464) byte local464 = arg6.method6825();
										if (local60 <= arg4) {
											for (local113 = local318; local113 < local318 + 4; local113++) {
												for (local159 = local322; local159 < local322 + 4; local159++) {
													if (local113 >= local31 && local31 + 8 > local113 && local159 >= local37 && local37 < local37 + 8) {
														local177 = Static137.method2668(arg2, local113 & 0x7, local159 & 0x7) + arg0;
														@Pc(527) int local527 = Static511.method6874(arg2, local113 & 0x7, local159 & 0x7) + arg3;
														if (local177 >= 0 && super.anInt7982 > local177 && local527 >= 0 && local527 < super.anInt7981) {
															super.aByteArrayArrayArray17[arg7][local177][local527] = local464;
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
						arg6.anInt8703 += 10;
					} else {
						arg1[0] = arg6.method6811();
						arg1[1] = arg6.method6789();
						arg1[2] = arg6.method6789();
						arg1[3] = arg6.method6789();
						arg1[4] = arg6.method6811();
					}
				}
			}
			if (local19 != null) {
				Static39.method1072(local19, arg0 >> 3, arg3 >> 3);
			}
			if (super.aByteArrayArrayArray17 != null && super.aByteArrayArrayArray17[arg7] != null) {
				local42 = arg0 + 7;
				local60 = arg3 + 7;
				for (local64 = arg0; local64 < local42; local64++) {
					for (local318 = arg3; local318 < local60; local318++) {
						super.aByteArrayArrayArray17[arg7][local64][local318] = 0;
					}
				}
				return;
			}
			return;
		}
	}
}
