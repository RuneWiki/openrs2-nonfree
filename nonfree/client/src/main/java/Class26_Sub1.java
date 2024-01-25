import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class26_Sub1 extends Class26 {

	@OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
	public int anInt499 = 99;

	@OriginalMember(owner = "client!bd", name = "<init>", descriptor = "(IIIZ)V")
	public Class26_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static151.aClass181_3, Static474.aClass322_7);
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II[IIILclient!mo;Lclient!r;BIII)V")
	public void method415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class1_Sub35 arg5, @OriginalArg(6) Class134 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean48) {
			return;
		}
		@Pc(13) Class119 local13 = null;
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(25) int local25 = (arg3 & 0x7) * 8;
		@Pc(39) int local39 = (arg0 & 0x7) * 8;
		while (true) {
			@Pc(44) int local44;
			@Pc(128) int local128;
			@Pc(153) int local153;
			@Pc(428) int local428;
			while (arg5.aByteArray85.length > arg5.anInt7214) {
				local44 = arg5.method5750();
				if (local44 == 0) {
					local13 = new Class119(arg5);
				} else {
					@Pc(212) int local212;
					@Pc(290) int local290;
					@Pc(324) int local324;
					@Pc(159) int local159;
					if (local44 == 1) {
						local128 = arg5.method5750();
						if (local128 > 0) {
							for (local428 = 0; local428 < local128; local428++) {
								@Pc(437) Class79 local437 = new Class79(arg6, arg5, 2);
								if (local437.anInt2029 == 31) {
									@Pc(448) Class188 local448 = Static252.aClass205_3.method4125(arg5.method5771());
									local437.method1666(local448.anInt4709, local448.anInt4708, local448.anInt4703, local448.anInt4707);
								}
								if (arg6.method6955() > 0) {
									@Pc(468) Class1_Sub18 local468 = local437.aClass1_Sub18_2;
									local159 = local468.method4107() >> 9;
									local212 = local468.method4098() >> 9;
									if (arg4 == local437.anInt2033 && local25 <= local159 && local25 + 8 > local159 && local212 >= local39 && local39 + 8 > local212) {
										local290 = Static286.method6616(local468.method4107() & 0xFFF, arg7, local468.method4098() & 0xFFF) + (arg9 << 9);
										local159 = local290 >> 9;
										local324 = Static167.method2395(arg7, local468.method4098() & 0xFFF, local468.method4107() & 0xFFF) + (arg8 << 9);
										local212 = local324 >> 9;
										if (local159 >= 0 && local212 >= 0 && super.anInt480 > local159 && super.anInt493 > local212) {
											local468.method4108(local290, local324, super.anIntArrayArrayArray2[arg4][local159][local212] - local468.method4101());
											Static550.method7490(local437);
										}
									}
								}
							}
						}
					} else if (local44 == 2) {
						if (local13 == null) {
							local13 = new Class119();
						}
						local13.method2370(arg5);
					} else if (local44 != 128) {
						if (local44 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray10 == null) {
							super.aByteArrayArrayArray10 = new byte[4][][];
						}
						for (local128 = 0; local128 < 4; local128++) {
							@Pc(134) byte local134 = arg5.method5751();
							@Pc(157) int local157;
							if (local134 == 0 && super.aByteArrayArrayArray10[arg1] != null) {
								if (arg4 >= local128) {
									local153 = arg9;
									local157 = arg9 + 7;
									local159 = arg8;
									if (arg9 < 0) {
										local153 = 0;
									} else if (super.anInt480 <= arg9) {
										local153 = super.anInt480;
									}
									if (local157 < 0) {
										local157 = 0;
									} else if (local157 >= super.anInt480) {
										local157 = super.anInt480;
									}
									if (arg8 < 0) {
										local159 = 0;
									} else if (arg8 >= super.anInt493) {
										local159 = super.anInt493;
									}
									local212 = arg8 + 7;
									if (local212 < 0) {
										local212 = 0;
									} else if (local212 >= super.anInt493) {
										local212 = super.anInt493;
									}
									while (local153 < local157) {
										while (local159 < local212) {
											super.aByteArrayArrayArray10[arg1][local153][local159] = 0;
											local159++;
										}
										local153++;
									}
								}
							} else if (local134 == 1) {
								if (super.aByteArrayArrayArray10[arg1] == null) {
									super.aByteArrayArrayArray10[arg1] = new byte[super.anInt480 + 1][super.anInt493 + 1];
								}
								for (local153 = 0; local153 < 64; local153 += 4) {
									for (local157 = 0; local157 < 64; local157 += 4) {
										@Pc(281) byte local281 = arg5.method5751();
										if (local128 <= arg4) {
											for (local212 = local153; local212 < local153 + 4; local212++) {
												for (local290 = local157; local290 < local157 + 4; local290++) {
													if (local212 >= local25 && local25 + 8 > local212 && local39 <= local290 && local39 + 8 > local39) {
														local324 = Static300.method4187(arg7, local212 & 0x7, local290 & 0x7) + arg9;
														@Pc(337) int local337 = arg8 + Static451.method6231(arg7, local212 & 0x7, local290 & 0x7);
														if (local324 >= 0 && local324 < super.anInt480 && local337 >= 0 && super.anInt493 > local337) {
															super.aByteArrayArrayArray10[arg1][local324][local337] = local281;
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
						arg5.anInt7214 += 10;
					} else {
						arg2[0] = arg5.method5771();
						arg2[1] = arg5.method5738();
						arg2[2] = arg5.method5738();
						arg2[3] = arg5.method5738();
						arg2[4] = arg5.method5771();
					}
				}
			}
			if (local13 != null) {
				Static376.method5048(arg9 >> 3, local13, arg8 >> 3);
			}
			if (super.aByteArrayArrayArray10 != null && super.aByteArrayArrayArray10[arg1] != null) {
				local44 = arg9 + 7;
				local128 = arg8 + 7;
				for (local428 = arg9; local428 < local44; local428++) {
					for (local153 = arg8; local153 < local128; local153++) {
						super.aByteArrayArrayArray10[arg1][local428][local153] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "([B[Lclient!cp;IILclient!r;B)V")
	public void method416(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class59[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class134 arg4) {
		@Pc(10) Class1_Sub35 local10 = new Class1_Sub35(arg0);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local10.method5746();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(28) int local28 = 0;
			while (true) {
				@Pc(32) int local32 = local10.method5739();
				if (local32 == 0) {
					break;
				}
				local28 += local32 - 1;
				@Pc(47) int local47 = local28 & 0x3F;
				@Pc(53) int local53 = local28 >> 6 & 0x3F;
				@Pc(57) int local57 = local28 >> 12;
				@Pc(61) int local61 = local10.method5750();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = local53 + arg2;
				@Pc(77) int local77 = arg3 + local47;
				if (local73 > 0 && local77 > 0 && super.anInt480 - 1 > local73 && local77 < super.anInt493 - 1) {
					@Pc(106) Class59 local106 = null;
					if (!super.aBoolean48) {
						@Pc(111) int local111 = local57;
						if ((Static455.aByteArrayArrayArray17[1][local73][local77] & 0x2) == 2) {
							local111 = local57 - 1;
						}
						if (local111 >= 0) {
							local106 = arg1[local111];
						}
					}
					this.method425(local106, local69, local57, local77, local16, -1, arg4, local57, local65, local73);
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[BIIIILclient!r;I[Lclient!cp;II)V")
	public void method417(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class134 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class59[] arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(13) Class1_Sub35 local13 = new Class1_Sub35(arg1);
		@Pc(15) int local15 = -1;
		while (true) {
			@Pc(19) int local19 = local13.method5746();
			if (local19 == 0) {
				return;
			}
			local15 += local19;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(33) int local33 = local13.method5739();
				if (local33 == 0) {
					break;
				}
				local27 += local33 - 1;
				@Pc(45) int local45 = local27 & 0x3F;
				@Pc(51) int local51 = local27 >> 6 & 0x3F;
				@Pc(55) int local55 = local27 >> 12;
				@Pc(59) int local59 = local13.method5750();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (arg9 == local55 && arg6 <= local51 && arg6 + 8 > local51 && arg4 <= local45 && arg4 + 8 > local45) {
					@Pc(95) Class95 local95 = Static518.aClass96_4.method1925(local15);
					@Pc(112) int local112 = Static533.method7309(local67, arg8, local51 & 0x7, local45 & 0x7, local95.anInt2403, local95.anInt2387) + arg2;
					@Pc(129) int local129 = arg0 + Static72.method1234(local95.anInt2387, local51 & 0x7, arg8, local95.anInt2403, local67, local45 & 0x7);
					if (local112 > 0 && local129 > 0 && super.anInt480 - 1 > local112 && local129 < super.anInt493 - 1) {
						@Pc(151) Class59 local151 = null;
						if (!super.aBoolean48) {
							@Pc(156) int local156 = arg3;
							if ((Static455.aByteArrayArrayArray17[1][local112][local129] & 0x2) == 2) {
								local156 = arg3 - 1;
							}
							if (local156 >= 0) {
								local151 = arg7[local156];
							}
						}
						this.method425(local151, arg8 + local67 & 0x3, arg3, local129, local15, -1, arg5, arg3, local63, local112);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I[IIILclient!mo;Lclient!r;)V")
	public void method419(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class1_Sub35 arg3, @OriginalArg(5) Class134 arg4) {
		if (super.aBoolean48) {
			return;
		}
		@Pc(11) boolean local11 = false;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(19) Class119 local19 = null;
		while (true) {
			@Pc(36) int local36;
			@Pc(102) int local102;
			@Pc(106) int local106;
			@Pc(43) int local43;
			@Pc(94) int local94;
			label308: do {
				while (true) {
					@Pc(24) int local24;
					@Pc(226) int local226;
					@Pc(230) int local230;
					while (arg3.aByteArray85.length > arg3.anInt7214) {
						local24 = arg3.method5750();
						if (local24 == 0) {
							local19 = new Class119(arg3);
						} else {
							if (local24 == 1) {
								local36 = arg3.method5750();
								continue label308;
							}
							if (local24 == 2) {
								if (local19 == null) {
									local19 = new Class119();
								}
								local19.method2370(arg3);
							} else if (local24 != 128) {
								if (local24 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray10 == null) {
									super.aByteArrayArrayArray10 = new byte[4][][];
								}
								for (local36 = 0; local36 < 4; local36++) {
									@Pc(188) byte local188 = arg3.method5751();
									if (local188 == 0 && super.aByteArrayArrayArray10[local36] != null) {
										local226 = arg2;
										local230 = arg2 + 64;
										local94 = arg0;
										local102 = arg0 + 64;
										if (local230 < 0) {
											local230 = 0;
										} else if (local230 >= super.anInt480) {
											local230 = super.anInt480;
										}
										if (arg0 < 0) {
											local94 = 0;
										} else if (super.anInt493 <= arg0) {
											local94 = super.anInt493;
										}
										if (arg2 < 0) {
											local226 = 0;
										} else if (super.anInt480 <= arg2) {
											local226 = super.anInt480;
										}
										if (local102 < 0) {
											local102 = 0;
										} else if (local102 >= super.anInt493) {
											local102 = super.anInt493;
										}
										while (local226 < local230) {
											while (local94 < local102) {
												super.aByteArrayArrayArray10[local36][local226][local94] = 0;
												local94++;
											}
											local226++;
										}
									} else if (local188 == 1) {
										if (super.aByteArrayArrayArray10[local36] == null) {
											super.aByteArrayArrayArray10[local36] = new byte[super.anInt480 + 1][super.anInt493 + 1];
										}
										for (local226 = 0; local226 < 64; local226 += 4) {
											for (local230 = 0; local230 < 64; local230 += 4) {
												@Pc(378) byte local378 = arg3.method5751();
												for (local102 = arg2 + local226; local102 < arg2 + local226 + 4; local102++) {
													for (local106 = local230 + arg0; local106 < arg0 + local230 + 4; local106++) {
														if (local102 >= 0 && local102 < super.anInt480 && local106 >= 0 && super.anInt493 > local106) {
															super.aByteArrayArrayArray10[local36][local102][local106] = local378;
														}
													}
												}
											}
										}
									} else if (local188 == 2) {
										if (super.aByteArrayArrayArray10[local36] == null) {
											super.aByteArrayArrayArray10[local36] = new byte[super.anInt480 + 1][super.anInt493 + 1];
										}
										if (local36 > 0) {
											local226 = arg2;
											local230 = arg2 + 64;
											local94 = arg0;
											local102 = arg0 + 64;
											if (local230 < 0) {
												local230 = 0;
											} else if (local230 >= super.anInt480) {
												local230 = super.anInt480;
											}
											if (arg2 < 0) {
												local226 = 0;
											} else if (arg2 >= super.anInt480) {
												local226 = super.anInt480;
											}
											if (arg0 < 0) {
												local94 = 0;
											} else if (super.anInt493 <= arg0) {
												local94 = super.anInt493;
											}
											if (local102 < 0) {
												local102 = 0;
											} else if (super.anInt493 <= local102) {
												local102 = super.anInt493;
											}
											while (local230 > local226) {
												while (local94 < local102) {
													super.aByteArrayArrayArray10[local36][local226][local94] = super.aByteArrayArrayArray10[local36 - 1][local226][local94];
													local94++;
												}
												local226++;
											}
										}
									}
								}
								local11 = true;
							} else if (arg1 == null) {
								arg3.anInt7214 += 10;
							} else {
								arg1[0] = arg3.method5771();
								arg1[1] = arg3.method5738();
								arg1[2] = arg3.method5738();
								arg1[3] = arg3.method5738();
								arg1[4] = arg3.method5771();
							}
						}
					}
					if (local19 != null) {
						for (local24 = 0; local24 < 8; local24++) {
							for (local36 = 0; local36 < 8; local36++) {
								local43 = (arg2 >> 3) + local24;
								local226 = (arg0 >> 3) + local36;
								if (local43 >= 0 && super.anInt480 >> 3 > local43 && local226 >= 0 && super.anInt493 >> 3 > local226) {
									Static376.method5048(local43, local19, local226);
								}
							}
						}
					}
					if (!local11 && super.aByteArrayArrayArray10 != null) {
						for (local24 = 0; local24 < 4; local24++) {
							if (super.aByteArrayArrayArray10[local24] != null) {
								for (local36 = 0; local36 < 16; local36++) {
									for (local43 = 0; local43 < 16; local43++) {
										local226 = local36 + (arg2 >> 2);
										local230 = (arg0 >> 2) + local43;
										if (local226 >= 0 && local226 < 26 && local230 >= 0 && local230 < 26) {
											super.aByteArrayArrayArray10[local24][local226][local230] = 0;
										}
									}
								}
							}
						}
						return;
					}
					return;
				}
			} while (local36 <= 0);
			for (local43 = 0; local43 < local36; local43++) {
				@Pc(52) Class79 local52 = new Class79(arg4, arg3, 2);
				if (local52.anInt2029 == 31) {
					@Pc(65) Class188 local65 = Static252.aClass205_3.method4125(arg3.method5771());
					local52.method1666(local65.anInt4709, local65.anInt4708, local65.anInt4703, local65.anInt4707);
				}
				if (arg4.method6955() > 0) {
					@Pc(85) Class1_Sub18 local85 = local52.aClass1_Sub18_2;
					local94 = local85.method4107() + (arg2 << 9);
					local102 = (arg0 << 9) + local85.method4098();
					local106 = local94 >> 9;
					@Pc(110) int local110 = local102 >> 9;
					if (local106 >= 0 && local110 >= 0 && super.anInt480 > local106 && local110 < super.anInt493) {
						local85.method4108(local94, local102, super.anIntArrayArrayArray2[local52.anInt2033][local106][local110] - local85.method4101());
						Static550.method7490(local52);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!cp;ILclient!r;III)V")
	public void method423(@OriginalArg(0) int arg0, @OriginalArg(1) Class59 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class134 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(5) Interface19 local5 = null;
		if (arg2 == 0) {
			local5 = (Interface19) Static82.method1473(arg5, arg4, arg0);
		}
		if (arg2 == 1) {
			local5 = (Interface19) Static29.method345(arg5, arg4, arg0);
		}
		if (arg2 == 2) {
			local5 = (Interface19) Static14.method147(arg5, arg4, arg0, rda.class);
		}
		if (arg2 == 3) {
			local5 = (Interface19) Static308.method4292(arg5, arg4, arg0);
		}
		if (local5 == null) {
			return;
		}
		@Pc(58) Class95 local58 = Static518.aClass96_4.method1925(local5.method7640());
		@Pc(62) int local62 = local5.method7638();
		@Pc(66) int local66 = local5.method7637();
		if (local58.method1917()) {
			Static451.method6222(arg4, arg5, arg0, local58);
		}
		if (local5.method7641()) {
			local5.method7642(arg3);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				Static594.method7870(arg5, arg4, arg0);
				return;
			}
			if (arg2 == 2) {
				Static462.method6382(arg5, arg4, arg0, rda.class);
				if (local58.anInt2428 == 0 || super.anInt480 <= local58.anInt2403 + arg4 || local58.anInt2403 + arg0 >= super.anInt493 || super.anInt480 <= arg4 + local58.anInt2387 || super.anInt493 <= local58.anInt2387 + arg0) {
					return;
				}
				arg1.method1188(arg0, local58.anInt2403, local58.aBoolean178, arg4, local66, !local58.aBoolean186, local58.anInt2387);
			} else if (arg2 == 3) {
				Static451.method6221(arg5, arg4, arg0);
				if (local58.anInt2428 == 1) {
					arg1.method1198(arg4, arg0);
					return;
				}
			}
			return;
		}
		Static472.method6448(arg5, arg4, arg0);
		if (local58.anInt2428 != 0) {
			arg1.method1187(local58.aBoolean178, local62, local66, arg0, !local58.aBoolean186, arg4);
		}
		if (local58.anInt2417 != 1) {
			return;
		}
		if (local66 != 0) {
			if (local66 == 1) {
				Static555.method7565(arg5, 2, arg0 + 1, arg4);
			} else if (local66 == 2) {
				Static555.method7565(arg5, 1, arg0, arg4 + 1);
				return;
			} else if (local66 == 3) {
				Static555.method7565(arg5, 2, arg0, arg4);
				return;
			}
			return;
		}
		Static555.method7565(arg5, 1, arg0, arg4);
		return;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!cp;IIIIIILclient!r;III)V")
	public void method425(@OriginalArg(0) Class59 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class134 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static348.aClass1_Sub30_Sub1_1.method3917(Static113.anInt2222) && !Static53.method976(arg2, arg3, Static42.anInt691, arg9)) {
			return;
		}
		if (arg7 < this.anInt499) {
			this.anInt499 = arg7;
		}
		@Pc(30) Class95 local30 = Static518.aClass96_4.method1925(arg4);
		if (arg6.method6931() && Static348.aClass1_Sub30_Sub1_1.aBoolean397 && local30.aBoolean177) {
			return;
		}
		@Pc(52) int local52;
		@Pc(49) int local49;
		if (arg1 == 1 || arg1 == 3) {
			local52 = local30.anInt2387;
			local49 = local30.anInt2403;
		} else {
			local49 = local30.anInt2387;
			local52 = local30.anInt2403;
		}
		@Pc(82) int local82;
		@Pc(80) int local80;
		if (arg9 + local52 > super.anInt480) {
			local80 = arg9 + 1;
			local82 = arg9;
		} else {
			local82 = (local52 >> 1) + arg9;
			local80 = arg9 + (local52 + 1 >> 1);
		}
		@Pc(117) int local117;
		@Pc(125) int local125;
		if (arg3 + local49 <= super.anInt493) {
			local117 = arg3 + (local49 >> 1);
			local125 = (local49 + 1 >> 1) + arg3;
		} else {
			local117 = arg3;
			local125 = arg3 + 1;
		}
		@Pc(137) Class47 local137 = Static199.aClass47Array1[arg2];
		@Pc(165) int local165 = local137.method7545(local82, local117) + local137.method7545(local80, local117) + local137.method7545(local82, local125) + local137.method7545(local80, local125) >> 2;
		@Pc(173) int local173 = (arg9 << 9) + (local52 << 8);
		@Pc(182) int local182 = (arg3 << 9) + (local49 << 8);
		@Pc(194) boolean local194 = Static345.aBoolean454 && !super.aBoolean48 && local30.aBoolean180;
		if (local30.method1917()) {
			Static229.method3478(arg9, null, arg7, arg3, local30, arg1, null);
		}
		@Pc(228) boolean local228 = arg5 == -1 && local30.anInt2406 == -1 && local30.anIntArray209 == null && local30.anIntArray208 == null && !local30.aBoolean181;
		if (Static496.aBoolean661 && (Static556.method7580(arg8) && local30.anInt2417 != 1 || !(!Static336.method4665(arg8) || local30.anInt2417 != 0))) {
			return;
		}
		if (arg8 != 22) {
			@Pc(375) Class8_Sub3_Sub3 local375;
			@Pc(344) Class8_Sub3_Sub3_Sub4 local344;
			@Pc(377) int local377;
			@Pc(441) int local441;
			if (arg8 == 10 || arg8 == 11) {
				local344 = null;
				if (local228) {
					@Pc(407) Class8_Sub3_Sub3_Sub4 local407 = new Class8_Sub3_Sub3_Sub4(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg9, local52 + arg9 - 1, arg3, local49 + arg3 - 1, arg8, arg1, local194);
					local344 = local407;
					local377 = local407.method5490();
					local375 = local407;
				} else {
					local375 = new Class8_Sub3_Sub3_Sub5(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg9, arg9 + local52 - 1, arg3, local49 + arg3 - 1, arg8, arg1, arg5);
					local377 = 15;
				}
				if (Static227.method3465(local375, false)) {
					if (local344 != null && local344.method7641()) {
						local344.method7636(arg6);
					}
					if (local30.aBoolean183 && Static345.aBoolean454) {
						if (local377 > 30) {
							local377 = 30;
						}
						for (local441 = 0; local441 <= local52; local441++) {
							for (@Pc(445) int local445 = 0; local445 <= local49; local445++) {
								local137.a(local441 + arg9, local445 + arg3, local377);
							}
						}
					}
				}
				if (local30.anInt2428 != 0 && arg0 != null) {
					arg0.method1190(!local30.aBoolean186, local30.aBoolean178, arg9, local49, arg3, local52);
				}
			} else if ((arg8 < 12 || arg8 > 17) && (arg8 < 18 || arg8 > 21)) {
				@Pc(685) Class8_Sub3_Sub4 local685;
				if (arg8 == 0) {
					@Pc(658) int local658 = local30.anInt2417;
					if (Static143.aBoolean203 && local30.anInt2417 == -1) {
						local658 = 1;
					}
					if (local228) {
						@Pc(703) Class8_Sub3_Sub4_Sub2 local703 = new Class8_Sub3_Sub4_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg8, arg1, local194);
						local685 = local703;
						if (local703.method7641()) {
							local703.method7636(arg6);
						}
					} else {
						local685 = new Class8_Sub3_Sub4_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg8, arg1, arg5);
					}
					Static311.method4313(arg7, arg9, arg3, local685, null);
					if (arg1 == 0) {
						if (Static345.aBoolean454 && local30.aBoolean183) {
							local137.a(arg9, arg3, 50);
							local137.a(arg9, arg3 + 1, 50);
						}
						if (local658 == 1 && !super.aBoolean48) {
							Static43.method636(arg9, arg3, local30.anInt2419, local30.anInt2381, arg7, 1);
						}
					} else if (arg1 == 1) {
						if (Static345.aBoolean454 && local30.aBoolean183) {
							local137.a(arg9, arg3 + 1, 50);
							local137.a(arg9 + 1, arg3 - -1, 50);
						}
						if (local658 == 1 && !super.aBoolean48) {
							Static43.method636(arg9, arg3 + 1, -local30.anInt2419, local30.anInt2381, arg7, 2);
						}
					} else if (arg1 == 2) {
						if (Static345.aBoolean454 && local30.aBoolean183) {
							local137.a(arg9 + 1, arg3, 50);
							local137.a(arg9 + 1, arg3 + 1, 50);
						}
						if (local658 == 1 && !super.aBoolean48) {
							Static43.method636(arg9 + 1, arg3, -local30.anInt2419, local30.anInt2381, arg7, 1);
						}
					} else if (arg1 == 3) {
						if (Static345.aBoolean454 && local30.aBoolean183) {
							local137.a(arg9, arg3, 50);
							local137.a(arg9 + 1, arg3, 50);
						}
						if (local658 == 1 && !super.aBoolean48) {
							Static43.method636(arg9, arg3, local30.anInt2419, local30.anInt2381, arg7, 2);
						}
					}
					if (local30.anInt2428 != 0 && arg0 != null) {
						arg0.method1182(arg1, arg3, arg8, !local30.aBoolean186, arg9, local30.aBoolean178);
					}
					if (local30.anInt2427 != 64) {
						Static52.method935(arg7, arg9, arg3, local30.anInt2427);
					}
				} else {
					@Pc(961) Class8_Sub3_Sub4_Sub2 local961;
					@Pc(943) Class8_Sub3_Sub4 local943;
					if (arg8 == 1) {
						if (local228) {
							local961 = new Class8_Sub3_Sub4_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg8, arg1, local194);
							if (local961.method7641()) {
								local961.method7636(arg6);
							}
							local943 = local961;
						} else {
							local943 = new Class8_Sub3_Sub4_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg8, arg1, arg5);
						}
						Static311.method4313(arg7, arg9, arg3, local943, null);
						if (local30.aBoolean183 && Static345.aBoolean454) {
							if (arg1 == 0) {
								local137.a(arg9, arg3 + 1, 50);
							} else if (arg1 == 1) {
								local137.a(arg9 + 1, arg3 - -1, 50);
							} else if (arg1 == 2) {
								local137.a(arg9 + 1, arg3, 50);
							} else if (arg1 == 3) {
								local137.a(arg9, arg3, 50);
							}
						}
						if (local30.anInt2428 != 0 && arg0 != null) {
							arg0.method1182(arg1, arg3, arg8, !local30.aBoolean186, arg9, local30.aBoolean178);
						}
					} else if (arg8 == 2) {
						local377 = arg1 + 1 & 0x3;
						if (local228) {
							@Pc(1115) Class8_Sub3_Sub4_Sub2 local1115 = new Class8_Sub3_Sub4_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg8, arg1 + 4, local194);
							@Pc(1131) Class8_Sub3_Sub4_Sub2 local1131 = new Class8_Sub3_Sub4_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg8, local377, local194);
							if (local1115.method7641()) {
								local1115.method7636(arg6);
							}
							if (local1131.method7641()) {
								local1131.method7636(arg6);
							}
							local943 = local1115;
							local685 = local1131;
						} else {
							local943 = new Class8_Sub3_Sub4_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg8, arg1 + 4, arg5);
							local685 = new Class8_Sub3_Sub4_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg8, local377, arg5);
						}
						Static311.method4313(arg7, arg9, arg3, local943, local685);
						if ((local30.anInt2417 == 1 || Static143.aBoolean203 && local30.anInt2417 == -1) && !super.aBoolean48) {
							if (arg1 == 0) {
								Static43.method636(arg9, arg3, local30.anInt2419, local30.anInt2381, arg7, 1);
								Static43.method636(arg9, arg3 + 1, local30.anInt2419, local30.anInt2381, arg7, 2);
							} else if (arg1 == 1) {
								Static43.method636(arg9 + 1, arg3, local30.anInt2419, local30.anInt2381, arg7, 1);
								Static43.method636(arg9, arg3 + 1, local30.anInt2419, local30.anInt2381, arg7, 2);
							} else if (arg1 == 2) {
								Static43.method636(arg9 + 1, arg3, local30.anInt2419, local30.anInt2381, arg7, 1);
								Static43.method636(arg9, arg3, local30.anInt2419, local30.anInt2381, arg7, 2);
							} else if (arg1 == 3) {
								Static43.method636(arg9, arg3, local30.anInt2419, local30.anInt2381, arg7, 1);
								Static43.method636(arg9, arg3, local30.anInt2419, local30.anInt2381, arg7, 2);
							}
						}
						if (local30.anInt2428 != 0 && arg0 != null) {
							arg0.method1182(arg1, arg3, arg8, !local30.aBoolean186, arg9, local30.aBoolean178);
						}
						if (local30.anInt2427 != 64) {
							Static52.method935(arg7, arg9, arg3, local30.anInt2427);
						}
					} else if (arg8 == 3) {
						if (local228) {
							local961 = new Class8_Sub3_Sub4_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg8, arg1, local194);
							if (local961.method7641()) {
								local961.method7636(arg6);
							}
							local943 = local961;
						} else {
							local943 = new Class8_Sub3_Sub4_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg8, arg1, arg5);
						}
						Static311.method4313(arg7, arg9, arg3, local943, null);
						if (local30.aBoolean183 && Static345.aBoolean454) {
							if (arg1 == 0) {
								local137.a(arg9, arg3 + 1, 50);
							} else if (arg1 == 1) {
								local137.a(arg9 + 1, arg3 - -1, 50);
							} else if (arg1 == 2) {
								local137.a(arg9 + 1, arg3, 50);
							} else if (arg1 == 3) {
								local137.a(arg9, arg3, 50);
							}
						}
						if (local30.anInt2428 != 0 && arg0 != null) {
							arg0.method1182(arg1, arg3, arg8, !local30.aBoolean186, arg9, local30.aBoolean178);
						}
					} else if (arg8 == 9) {
						if (local228) {
							local344 = new Class8_Sub3_Sub3_Sub4(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg9, arg9, arg3, arg3, arg8, arg1, local194);
							local375 = local344;
							if (local344.method7641()) {
								local344.method7636(arg6);
							}
						} else {
							local375 = new Class8_Sub3_Sub3_Sub5(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg9, local52 + arg9 - 1, arg3, local49 + arg3 - 1, arg8, arg1, arg5);
						}
						Static227.method3465(local375, false);
						if (local30.anInt2428 != 0 && arg0 != null) {
							arg0.method1190(!local30.aBoolean186, local30.aBoolean178, arg9, local49, arg3, local52);
						}
						if (local30.anInt2427 != 64) {
							Static52.method935(arg7, arg9, arg3, local30.anInt2427);
						}
					} else {
						@Pc(1574) Class8_Sub3_Sub2 local1574;
						if (arg8 == 4) {
							if (local228) {
								@Pc(1593) Class8_Sub3_Sub2_Sub2 local1593 = new Class8_Sub3_Sub2_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, 0, 0, arg8, arg1);
								if (local1593.method7641()) {
									local1593.method7636(arg6);
								}
								local1574 = local1593;
							} else {
								local1574 = new Class8_Sub3_Sub2_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, 0, 0, arg8, arg1, arg5);
							}
							Static534.method7312(arg7, arg9, arg3, local1574, null);
						} else {
							@Pc(1615) int local1615;
							@Pc(1621) Interface19 local1621;
							@Pc(1688) Class8_Sub3_Sub2_Sub2 local1688;
							if (arg8 == 5) {
								local1615 = 65;
								local1621 = (Interface19) Static82.method1473(arg7, arg9, arg3);
								if (local1621 != null) {
									local1615 = Static518.aClass96_4.method1925(local1621.method7640()).anInt2427 + 1;
								}
								if (local228) {
									local1688 = new Class8_Sub3_Sub2_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, local1615 * Static298.anIntArray398[arg1], Static223.anIntArray336[arg1] * local1615, arg8, arg1);
									local1574 = local1688;
									if (local1688.method7641()) {
										local1688.method7636(arg6);
									}
								} else {
									local1574 = new Class8_Sub3_Sub2_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, local1615 * Static298.anIntArray398[arg1], local1615 * Static223.anIntArray336[arg1], arg8, arg1, arg5);
								}
								Static534.method7312(arg7, arg9, arg3, local1574, null);
							} else if (arg8 == 6) {
								local1615 = 33;
								local1621 = (Interface19) Static82.method1473(arg7, arg9, arg3);
								if (local1621 != null) {
									local1615 = Static518.aClass96_4.method1925(local1621.method7640()).anInt2427 / 2 + 1;
								}
								if (local228) {
									local1688 = new Class8_Sub3_Sub2_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, Static298.anIntArray398[arg1] * local1615, local1615 * Static223.anIntArray336[arg1], arg8, arg1 + 4);
									local1574 = local1688;
									if (local1688.method7641()) {
										local1688.method7636(arg6);
									}
								} else {
									local1574 = new Class8_Sub3_Sub2_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, Static224.anIntArray566[arg1] * local1615, local1615 * Static312.anIntArray418[arg1], arg8, arg1 + 4, arg5);
								}
								Static534.method7312(arg7, arg9, arg3, local1574, null);
							} else if (arg8 == 7) {
								local1615 = arg1 + 2 & 0x3;
								if (local228) {
									@Pc(1860) Class8_Sub3_Sub2_Sub2 local1860 = new Class8_Sub3_Sub2_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, 0, 0, arg8, local1615 + 4);
									if (local1860.method7641()) {
										local1860.method7636(arg6);
									}
									local1574 = local1860;
								} else {
									local1574 = new Class8_Sub3_Sub2_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, 0, 0, arg8, local1615 + 4, arg5);
								}
								Static534.method7312(arg7, arg9, arg3, local1574, null);
							} else if (arg8 == 8) {
								local377 = arg1 + 2 & 0x3;
								local441 = 33;
								@Pc(1896) Interface19 local1896 = (Interface19) Static82.method1473(arg7, arg9, arg3);
								if (local1896 != null) {
									local441 = Static518.aClass96_4.method1925(local1896.method7640()).anInt2427 / 2 + 1;
								}
								@Pc(1940) Class8_Sub3_Sub2 local1940;
								@Pc(1960) Class8_Sub3_Sub2 local1960;
								if (local228) {
									local1940 = new Class8_Sub3_Sub2_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, Static224.anIntArray566[arg1] * local441, Static312.anIntArray418[arg1] * local441, arg8, arg1 + 4);
									local1960 = new Class8_Sub3_Sub2_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, 0, 0, arg8, local377 + 4);
									if (local1940.method7641()) {
										local1940.method7636(arg6);
									}
									if (local1960.method7641()) {
										local1960.method7636(arg6);
									}
								} else {
									local1940 = new Class8_Sub3_Sub2_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, local441 * Static224.anIntArray566[arg1], Static312.anIntArray418[arg1] * local441, arg8, arg1 + 4, arg5);
									local1960 = new Class8_Sub3_Sub2_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, 0, 0, arg8, local377 + 4, arg5);
								}
								Static534.method7312(arg7, arg9, arg3, local1940, local1960);
							}
						}
					}
				}
			} else {
				if (local228) {
					local344 = new Class8_Sub3_Sub3_Sub4(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg9, local52 + arg9 - 1, arg3, local49 + arg3 - 1, arg8, arg1, local194);
					local375 = local344;
					if (local344.method7641()) {
						local344.method7636(arg6);
					}
				} else {
					local375 = new Class8_Sub3_Sub3_Sub5(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg9, local52 + arg9 - 1, arg3, local49 + arg3 - 1, arg8, arg1, arg5);
				}
				Static227.method3465(local375, false);
				if (Static345.aBoolean454 && !super.aBoolean48 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg7 > 0 && local30.anInt2417 != 0) {
					super.aByteArrayArrayArray9[arg7][arg9][arg3] = (byte) (super.aByteArrayArrayArray9[arg7][arg9][arg3] | 0x4);
				}
				if (local30.anInt2428 != 0 && arg0 != null) {
					arg0.method1190(!local30.aBoolean186, local30.aBoolean178, arg9, local49, arg3, local52);
				}
			}
		} else if (Static348.aClass1_Sub30_Sub1_1.aBoolean392 || local30.anInt2399 != 0 || local30.anInt2428 == 1 || local30.aBoolean173) {
			@Pc(290) Class8_Sub3_Sub1 local290;
			if (local228) {
				@Pc(307) Class8_Sub3_Sub1_Sub1 local307 = new Class8_Sub3_Sub1_Sub1(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg1, local194);
				if (local307.method7641()) {
					local307.method7636(arg6);
				}
				local290 = local307;
			} else {
				local290 = new Class8_Sub3_Sub1_Sub2(arg6, local30, arg7, arg2, local173, local165, local182, super.aBoolean48, arg1, arg5);
			}
			Static533.method7307(arg7, arg9, arg3, local290);
			if (local30.anInt2428 == 1 && arg0 != null) {
				arg0.method1189(arg9, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!r;ZI)V")
	public void method426(@OriginalArg(0) Class134 arg0, @OriginalArg(1) boolean arg1) {
		Static558.method7588();
		if (!arg1) {
			@Pc(18) int local18;
			@Pc(22) int local22;
			if (super.anInt490 > 1) {
				for (local18 = 0; super.anInt480 > local18; local18++) {
					for (local22 = 0; super.anInt493 > local22; local22++) {
						if ((Static455.aByteArrayArrayArray17[1][local18][local22] & 0x2) == 2) {
							Static248.method3690(local18, local22);
						}
					}
				}
			}
			for (local18 = 0; local18 < super.anInt490; local18++) {
				for (local22 = 0; local22 <= super.anInt493; local22++) {
					for (@Pc(60) int local60 = 0; local60 <= super.anInt480; local60++) {
						if ((super.aByteArrayArrayArray9[local18][local60][local22] & 0x4) != 0) {
							@Pc(78) int local78 = local60;
							@Pc(80) int local80 = local60;
							@Pc(82) int local82 = local22;
							@Pc(84) int local84 = local22;
							while (local82 > 0 && (super.aByteArrayArrayArray9[local18][local60][local82 - 1] & 0x4) != 0) {
								local82--;
							}
							while (local84 < super.anInt493 && (super.aByteArrayArrayArray9[local18][local60][local84 + 1] & 0x4) != 0) {
								local84++;
							}
							@Pc(133) int local133;
							label103: while (local78 > 0) {
								for (local133 = local82; local133 <= local84; local133++) {
									if ((super.aByteArrayArrayArray9[local18][local78 - 1][local133] & 0x4) == 0) {
										break label103;
									}
								}
								local78--;
							}
							label92: while (local80 < super.anInt480) {
								for (local133 = local82; local133 <= local84; local133++) {
									if ((super.aByteArrayArrayArray9[local18][local80 + 1][local133] & 0x4) == 0) {
										break label92;
									}
								}
								local80++;
							}
							if ((local80 + 1 - local78) * (local84 + 1 - local82) >= 4) {
								local133 = super.anIntArrayArrayArray2[local18][local78][local82];
								Static591.method7852(local18, (local80 << 9) + 512, local133, (local84 << 9) + 512, local78 << 9, local82 << 9, local133);
								for (@Pc(252) int local252 = local78; local252 <= local80; local252++) {
									for (@Pc(256) int local256 = local82; local256 <= local84; local256++) {
										super.aByteArrayArrayArray9[local18][local252][local256] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static162.method2373();
		}
		super.aByteArrayArrayArray9 = null;
	}
}
