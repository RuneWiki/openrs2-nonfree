import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iaa")
public final class Class152_Sub1 extends Class152 {

	@OriginalMember(owner = "client!iaa", name = "Q", descriptor = "I")
	public int anInt4319 = 99;

	@OriginalMember(owner = "client!iaa", name = "<init>", descriptor = "(IIIZ)V")
	public Class152_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static283.aClass209_5, Static393.aClass131_5);
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIIII[Lclient!wca;[BLclient!oa;I)V")
	public void method3662(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class350[] arg6, @OriginalArg(8) byte[] arg7, @OriginalArg(9) Class15 arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class3_Sub7 local10 = new Class3_Sub7(arg7);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(16) int local16 = local10.method6557();
			if (local16 == 0) {
				return;
			}
			local12 += local16;
			@Pc(27) int local27 = 0;
			while (true) {
				@Pc(31) int local31 = local10.method6542();
				if (local31 == 0) {
					break;
				}
				local27 += local31 - 1;
				@Pc(43) int local43 = local27 & 0x3F;
				@Pc(49) int local49 = local27 >> 6 & 0x3F;
				@Pc(53) int local53 = local27 >> 12;
				@Pc(57) int local57 = local10.method6538();
				@Pc(61) int local61 = local57 >> 2;
				@Pc(65) int local65 = local57 & 0x3;
				if (arg1 == local53 && local49 >= arg2 && local49 < arg2 + 8 && arg4 <= local43 && arg4 + 8 > local43) {
					@Pc(107) Class292 local107 = Static253.aClass146_2.method3356(local12);
					@Pc(124) int local124 = Static126.method2520(arg3, local43 & 0x7, local107.anInt8734, local65, local107.anInt8775, local49 & 0x7) + arg5;
					@Pc(141) int local141 = arg0 + Static353.method5875(local107.anInt8775, local49 & 0x7, local107.anInt8734, local65, local43 & 0x7, arg3);
					if (local124 > 0 && local141 > 0 && super.anInt4301 - 1 > local124 && super.anInt4297 - 1 > local141) {
						@Pc(163) Class350 local163 = null;
						if (!super.aBoolean335) {
							@Pc(168) int local168 = arg9;
							if ((Static576.aByteArrayArrayArray21[1][local124][local141] & 0x2) == 2) {
								local168 = arg9 - 1;
							}
							if (local168 >= 0) {
								local163 = arg6[local168];
							}
						}
						this.method3668(local124, arg9, local141, arg9, local163, -1, arg3 + local65 & 0x3, local12, local61, arg8);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(III[Lclient!wca;Lclient!oa;[B)V")
	public void method3664(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class350[] arg2, @OriginalArg(4) Class15 arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(18) Class3_Sub7 local18 = new Class3_Sub7(arg4);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method6557();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(35) int local35 = 0;
			while (true) {
				@Pc(39) int local39 = local18.method6542();
				if (local39 == 0) {
					break;
				}
				local35 += local39 - 1;
				@Pc(54) int local54 = local35 & 0x3F;
				@Pc(60) int local60 = local35 >> 6 & 0x3F;
				@Pc(64) int local64 = local35 >> 12;
				@Pc(68) int local68 = local18.method6538();
				@Pc(72) int local72 = local68 >> 2;
				@Pc(76) int local76 = local68 & 0x3;
				@Pc(81) int local81 = local60 + arg0;
				@Pc(85) int local85 = arg1 + local54;
				if (local81 > 0 && local85 > 0 && local81 < super.anInt4301 - 1 && local85 < super.anInt4297 - 1) {
					@Pc(113) Class350 local113 = null;
					if (!super.aBoolean335) {
						@Pc(118) int local118 = local64;
						if ((Static576.aByteArrayArrayArray21[1][local81][local85] & 0x2) == 2) {
							local118 = local64 - 1;
						}
						if (local118 >= 0) {
							local113 = arg2[local118];
						}
					}
					this.method3668(local81, local64, local85, local64, local113, -1, local76, local20, local72, arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIILclient!fd;IIILclient!oa;[II)V")
	public void method3666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class3_Sub7 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) Class15 arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean335) {
			return;
		}
		if (arg8 != null) {
			arg8[0] = -1;
		}
		@Pc(25) Class167 local25 = null;
		@Pc(31) int local31 = (arg0 & 0x7) * 8;
		@Pc(37) int local37 = (arg1 & 0x7) * 8;
		while (true) {
			@Pc(42) int local42;
			@Pc(58) int local58;
			@Pc(289) int local289;
			@Pc(65) int local65;
			while (arg4.anInt7869 < arg4.aByteArray86.length) {
				local42 = arg4.method6538();
				if (local42 == 0) {
					local25 = new Class167(arg4);
				} else {
					@Pc(121) int local121;
					@Pc(165) int local165;
					@Pc(183) int local183;
					@Pc(113) int local113;
					if (local42 == 1) {
						local58 = arg4.method6538();
						if (local58 > 0) {
							for (local65 = 0; local65 < local58; local65++) {
								@Pc(74) Class212 local74 = new Class212(arg7, arg4, 2);
								if (local74.anInt6619 == 31) {
									@Pc(87) Class293 local87 = Static93.aClass246_1.method6137(arg4.method6535());
									local74.method5543(local87.anInt8807, local87.anInt8802, local87.anInt8808, local87.anInt8803);
								}
								if (arg7.method5329() > 0) {
									@Pc(107) Class3_Sub28 local107 = local74.aClass3_Sub28_2;
									local113 = local107.method8156() >> 9;
									local121 = local107.method8158() >> 9;
									if (arg9 == local74.anInt6629 && local113 >= local31 && local31 + 8 > local113 && local121 >= local37 && local37 + 8 > local121) {
										local165 = (arg2 << 9) + Static379.method6126(arg5, local107.method8158() & 0xFFF, local107.method8156() & 0xFFF);
										local183 = Static595.method8403(local107.method8156() & 0xFFF, arg5, local107.method8158() & 0xFFF) + (arg3 << 9);
										local113 = local165 >> 9;
										local121 = local183 >> 9;
										if (local113 >= 0 && local121 >= 0 && local113 < super.anInt4301 && super.anInt4297 > local121) {
											local107.method8157(local183, local165, super.anIntArrayArrayArray8[arg9][local113][local121] - local107.method8155());
											Static360.method1686(local74);
										}
									}
								}
							}
						}
					} else if (local42 == 2) {
						if (local25 == null) {
							local25 = new Class167();
						}
						local25.method4126(arg4);
					} else if (local42 != 128) {
						if (local42 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray18 == null) {
							super.aByteArrayArrayArray18 = new byte[4][][];
						}
						for (local58 = 0; local58 < 4; local58++) {
							@Pc(273) byte local273 = arg4.method6529();
							@Pc(293) int local293;
							if (local273 == 0 && super.aByteArrayArrayArray18[arg6] != null) {
								if (arg9 >= local58) {
									local289 = arg2;
									local293 = arg2 + 7;
									local113 = arg3;
									if (local293 < 0) {
										local293 = 0;
									} else if (local293 >= super.anInt4301) {
										local293 = super.anInt4301;
									}
									local121 = arg3 + 7;
									if (arg2 < 0) {
										local289 = 0;
									} else if (arg2 >= super.anInt4301) {
										local289 = super.anInt4301;
									}
									if (arg3 < 0) {
										local113 = 0;
									} else if (super.anInt4297 <= arg3) {
										local113 = super.anInt4297;
									}
									if (local121 < 0) {
										local121 = 0;
									} else if (local121 >= super.anInt4297) {
										local121 = super.anInt4297;
									}
									while (local293 > local289) {
										while (local113 < local121) {
											super.aByteArrayArrayArray18[arg6][local289][local113] = 0;
											local113++;
										}
										local289++;
									}
								}
							} else if (local273 == 1) {
								if (super.aByteArrayArrayArray18[arg6] == null) {
									super.aByteArrayArrayArray18[arg6] = new byte[super.anInt4301 + 1][super.anInt4297 + 1];
								}
								for (local289 = 0; local289 < 64; local289 += 4) {
									for (local293 = 0; local293 < 64; local293 += 4) {
										@Pc(425) byte local425 = arg4.method6529();
										if (local58 <= arg9) {
											for (local121 = local289; local121 < local289 + 4; local121++) {
												for (local165 = local293; local165 < local293 + 4; local165++) {
													if (local121 >= local31 && local121 < local31 + 8 && local165 >= local37 && local37 < local37 + 8) {
														local183 = arg2 + Static420.method6746(arg5, local121 & 0x7, local165 & 0x7);
														@Pc(483) int local483 = arg3 + Static48.method1241(arg5, local165 & 0x7, local121 & 0x7);
														if (local183 >= 0 && local183 < super.anInt4301 && local483 >= 0 && super.anInt4297 > local483) {
															super.aByteArrayArrayArray18[arg6][local183][local483] = local425;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg8 == null) {
						arg4.anInt7869 += 10;
					} else {
						arg8[0] = arg4.method6535();
						arg8[1] = arg4.method6525();
						arg8[2] = arg4.method6525();
						arg8[3] = arg4.method6525();
						arg8[4] = arg4.method6535();
					}
				}
			}
			if (local25 != null) {
				Static27.method951(local25, arg2 >> 3, arg3 >> 3);
			}
			if (super.aByteArrayArrayArray18 != null && super.aByteArrayArrayArray18[arg6] != null) {
				local42 = arg2 + 7;
				local58 = arg3 + 7;
				for (local65 = arg2; local65 < local42; local65++) {
					for (local289 = arg3; local289 < local58; local289++) {
						super.aByteArrayArrayArray18[arg6][local65][local289] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IILclient!oa;IILclient!wca;I)V")
	public void method3667(@OriginalArg(1) int arg0, @OriginalArg(2) Class15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class350 arg4, @OriginalArg(6) int arg5) {
		@Pc(11) Interface22 local11 = null;
		if (arg0 == 0) {
			local11 = (Interface22) Static496.method7511(arg5, arg2, arg3);
		}
		if (arg0 == 1) {
			local11 = (Interface22) Static563.method8123(arg5, arg2, arg3);
		}
		if (arg0 == 2) {
			local11 = (Interface22) Static200.method3364(arg5, arg2, arg3, ut.class);
		}
		if (arg0 == 3) {
			local11 = (Interface22) Static86.method1922(arg5, arg2, arg3);
		}
		if (local11 == null) {
			return;
		}
		@Pc(65) Class292 local65 = Static253.aClass146_2.method3356(local11.method8398());
		@Pc(69) int local69 = local11.method8399();
		@Pc(73) int local73 = local11.method8402();
		if (local65.method7191()) {
			Static158.method3019(arg2, local65, arg5, arg3);
		}
		if (local11.method8401()) {
			local11.method8397(arg1);
		}
		if (arg0 == 0) {
			@Pc(102) Class2_Sub4 local102 = Static496.method7511(arg5, arg2, arg3);
			if (local102 instanceof Class2_Sub4_Sub3) {
				((Class2_Sub4_Sub3) local102).aClass2_Sub4_3 = null;
			} else {
				Static216.method3757(arg5, arg2, arg3);
			}
			if (local65.anInt8782 != 0) {
				arg4.method8212(local65.aBoolean726, arg3, local73, !local65.aBoolean732, arg2, local69);
				return;
			}
		} else if (arg0 == 1) {
			@Pc(289) Class2_Sub3 local289 = Static563.method8123(arg5, arg2, arg3);
			if (!(local289 instanceof Class2_Sub3_Sub1)) {
				Static78.method1786(arg5, arg2, arg3);
				return;
			}
			((Class2_Sub3_Sub1) local289).aClass2_Sub3_3 = null;
		} else {
			if (arg0 == 2) {
				@Pc(159) Class2_Sub2 local159 = Static200.method3364(arg5, arg2, arg3, ut.class);
				if (local159 instanceof Class2_Sub2_Sub6 && arg2 == local159.aShort120 && local159.aShort122 == arg3) {
					((Class2_Sub2_Sub6) local159).aClass2_Sub2_2 = null;
				} else {
					Static44.method1169(arg5, arg2, arg3, ut.class);
				}
				if (local65.anInt8782 != 0 && super.anInt4301 > arg2 + local65.anInt8734 && super.anInt4297 > local65.anInt8734 + arg3 && local65.anInt8775 + arg2 < super.anInt4301 && super.anInt4297 > local65.anInt8775 + arg3) {
					arg4.method8209(local65.anInt8734, !local65.aBoolean732, local65.aBoolean726, local65.anInt8775, arg3, local73, arg2);
					return;
				}
			} else if (arg0 == 3) {
				@Pc(260) Class2_Sub1 local260 = Static86.method1922(arg5, arg2, arg3);
				if (local260 instanceof Class2_Sub1_Sub3) {
					((Class2_Sub1_Sub3) local260).aClass2_Sub1_2 = null;
				} else {
					Static56.method1329(arg5, arg2, arg3);
				}
				if (local65.anInt8782 != 1) {
					return;
				}
				arg4.method8208(arg2, arg3);
			} else {
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IIIIILclient!wca;IIIILclient!oa;)V")
	public void method3668(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class350 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class15 arg9) {
		if (!Static455.aClass3_Sub27_Sub1_1.method4040(Static275.anInt5823) && !Static194.method3317(arg1, Static96.anInt2320, arg2, arg0)) {
			return;
		}
		if (arg3 < this.anInt4319) {
			this.anInt4319 = arg3;
		}
		@Pc(28) Class292 local28 = Static253.aClass146_2.method3356(arg7);
		if (arg9.method5288() && Static455.aClass3_Sub27_Sub1_1.aBoolean391 && local28.aBoolean725) {
			return;
		}
		@Pc(52) int local52;
		@Pc(49) int local49;
		if (arg6 == 1 || arg6 == 3) {
			local49 = local28.anInt8734;
			local52 = local28.anInt8775;
		} else {
			local52 = local28.anInt8734;
			local49 = local28.anInt8775;
		}
		@Pc(84) int local84;
		@Pc(78) int local78;
		if (arg0 + local52 <= super.anInt4301) {
			local78 = (local52 + 1 >> 1) + arg0;
			local84 = (local52 >> 1) + arg0;
		} else {
			local78 = arg0 + 1;
			local84 = arg0;
		}
		@Pc(109) int local109;
		@Pc(107) int local107;
		if (arg2 + local49 > super.anInt4297) {
			local107 = arg2 + 1;
			local109 = arg2;
		} else {
			local109 = (local49 >> 1) + arg2;
			local107 = (local49 + 1 >> 1) + arg2;
		}
		@Pc(128) Class4 local128 = Static224.aClass4Array3[arg1];
		@Pc(151) int local151 = local128.JA(local84, local109) + local128.JA(local78, local109) + local128.JA(local84, local107) + local128.JA(local78, local107) >> 2;
		@Pc(159) int local159 = (local52 << 8) + (arg0 << 9);
		@Pc(167) int local167 = (local49 << 8) + (arg2 << 9);
		@Pc(179) boolean local179 = Static362.aBoolean542 && !super.aBoolean335 && local28.aBoolean730;
		if (local28.method7191()) {
			Static93.method2098(arg0, local28, null, arg6, null, arg3, arg2);
		}
		@Pc(213) boolean local213 = arg5 == -1 && local28.anInt8765 == -1 && local28.anIntArray573 == null && local28.anIntArray571 == null && !local28.aBoolean723;
		if (Static151.aBoolean259 && (Static59.method1501(arg8) && local28.anInt8767 != 1 || !(!Static445.method6951(arg8) || local28.anInt8767 != 0))) {
			return;
		}
		if (arg8 != 22) {
			@Pc(375) Class2_Sub2 local375;
			@Pc(340) Class2_Sub2_Sub4 local340;
			@Pc(379) int local379;
			if (arg8 == 10 || arg8 == 11) {
				local340 = null;
				if (local213) {
					@Pc(371) Class2_Sub2_Sub4 local371 = new Class2_Sub2_Sub4(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg0, arg0 + local52 - 1, arg2, local49 + arg2 - 1, arg8, arg6, local179);
					local340 = local371;
					local375 = local371;
					local379 = local371.method6187();
				} else {
					local375 = new Class2_Sub2_Sub2(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg0, local52 + arg0 - 1, arg2, local49 + arg2 - 1, arg8, arg6, arg5);
					local379 = 15;
				}
				@Pc(423) Class2_Sub2 local423 = Static200.method3364(arg3, arg0, arg2, ut.class);
				@Pc(425) boolean local425 = false;
				if (local423 instanceof Class2_Sub2_Sub6 && local423.aShort120 == arg0 && arg2 == local423.aShort122) {
					local425 = true;
					((Class2_Sub2_Sub6) local423).aClass2_Sub2_2 = local375;
				}
				if (local425 || Static319.method5520(local375, false)) {
					if (local340 != null && local340.method8401()) {
						local340.method8396(arg9);
					}
					if (local28.aBoolean733 && Static362.aBoolean542) {
						if (local379 > 30) {
							local379 = 30;
						}
						for (@Pc(480) int local480 = 0; local480 <= local52; local480++) {
							for (@Pc(483) int local483 = 0; local483 <= local49; local483++) {
								local128.EA(arg0 + local480, arg2 - -local483, local379);
							}
						}
					}
				}
				if (local28.anInt8782 != 0 && arg4 != null) {
					arg4.method8220(local49, arg0, !local28.aBoolean732, local52, arg2, local28.aBoolean726);
				}
			} else {
				@Pc(630) Class2_Sub2 local630;
				if (arg8 >= 12 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
					if (local213) {
						local340 = new Class2_Sub2_Sub4(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg0, arg0 + local52 - 1, arg2, local49 + arg2 - 1, arg8, arg6, local179);
						if (local340.method8401()) {
							local340.method8396(arg9);
						}
						local375 = local340;
					} else {
						local375 = new Class2_Sub2_Sub2(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg0, local52 + arg0 - 1, arg2, arg2 + local49 - 1, arg8, arg6, arg5);
					}
					local630 = Static200.method3364(arg3, arg0, arg2, ut.class);
					if (local630 instanceof Class2_Sub2_Sub6 && local630.aShort120 == arg0 && arg2 == local630.aShort122) {
						((Class2_Sub2_Sub6) local630).aClass2_Sub2_2 = local375;
					} else {
						Static319.method5520(local375, false);
					}
					if (Static362.aBoolean542 && !super.aBoolean335 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg3 > 0 && local28.anInt8767 != 0) {
						super.aByteArrayArrayArray14[arg3][arg0][arg2] = (byte) (super.aByteArrayArrayArray14[arg3][arg0][arg2] | 0x4);
					}
					if (local28.anInt8782 != 0 && arg4 != null) {
						arg4.method8220(local49, arg0, !local28.aBoolean732, local52, arg2, local28.aBoolean726);
					}
				} else {
					@Pc(758) Class2_Sub4 local758;
					if (arg8 == 0) {
						@Pc(732) int local732 = local28.anInt8767;
						if (Static509.aBoolean789 && local28.anInt8767 == -1) {
							local732 = 1;
						}
						if (local213) {
							@Pc(774) Class2_Sub4_Sub2 local774 = new Class2_Sub4_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, arg8, arg6, local179);
							local758 = local774;
							if (local774.method8401()) {
								local774.method8396(arg9);
							}
						} else {
							local758 = new Class2_Sub4_Sub1(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg8, arg6, arg5);
						}
						@Pc(789) Class2_Sub4 local789 = Static496.method7511(arg3, arg0, arg2);
						if (local789 instanceof Class2_Sub4_Sub3) {
							((Class2_Sub4_Sub3) local789).aClass2_Sub4_3 = local758;
						} else {
							Static194.method3314(arg3, arg0, arg2, local758, null);
						}
						if (Static362.aBoolean542) {
							if (arg6 == 0) {
								if (local28.aBoolean733) {
									local128.EA(arg0, arg2, 50);
									local128.EA(arg0, arg2 + 1, 50);
								}
								if (local732 == 1 && !super.aBoolean335) {
									super.aByteArrayArrayArray14[arg3][arg0][arg2] = (byte) (super.aByteArrayArrayArray14[arg3][arg0][arg2] | 0x1);
								}
							} else if (arg6 == 1) {
								if (local28.aBoolean733) {
									local128.EA(arg0, arg2 + 1, 50);
									local128.EA(arg0 + 1, arg2 - -1, 50);
								}
								if (local732 == 1 && !super.aBoolean335) {
									super.aByteArrayArrayArray14[arg3][arg0][arg2 + 1] = (byte) (super.aByteArrayArrayArray14[arg3][arg0][arg2 + 1] | 0x2);
								}
							} else if (arg6 == 2) {
								if (local28.aBoolean733) {
									local128.EA(arg0 + 1, arg2, 50);
									local128.EA(arg0 + 1, arg2 - -1, 50);
								}
								if (local732 == 1 && !super.aBoolean335) {
									super.aByteArrayArrayArray14[arg3][arg0 + 1][arg2] = (byte) (super.aByteArrayArrayArray14[arg3][arg0 + 1][arg2] | 0x1);
								}
							} else if (arg6 == 3) {
								if (local28.aBoolean733) {
									local128.EA(arg0, arg2, 50);
									local128.EA(arg0 + 1, arg2, 50);
								}
								if (local732 == 1 && !super.aBoolean335) {
									super.aByteArrayArrayArray14[arg3][arg0][arg2] = (byte) (super.aByteArrayArrayArray14[arg3][arg0][arg2] | 0x2);
								}
							}
						}
						if (local28.anInt8782 != 0 && arg4 != null) {
							arg4.method8206(local28.aBoolean726, arg8, !local28.aBoolean732, arg6, arg2, arg0);
						}
						if (local28.anInt8740 != 64) {
							Static532.method7860(arg3, arg0, arg2, local28.anInt8740);
						}
					} else {
						@Pc(1056) Class2_Sub4_Sub2 local1056;
						@Pc(1058) Class2_Sub4 local1058;
						if (arg8 == 1) {
							if (local213) {
								local1056 = new Class2_Sub4_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, arg8, arg6, local179);
								local1058 = local1056;
								if (local1056.method8401()) {
									local1056.method8396(arg9);
								}
							} else {
								local1058 = new Class2_Sub4_Sub1(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg8, arg6, arg5);
							}
							local758 = Static496.method7511(arg3, arg0, arg2);
							if (local758 instanceof Class2_Sub4_Sub3) {
								((Class2_Sub4_Sub3) local758).aClass2_Sub4_3 = local1058;
							} else {
								Static194.method3314(arg3, arg0, arg2, local1058, null);
							}
							if (local28.aBoolean733 && Static362.aBoolean542) {
								if (arg6 == 0) {
									local128.EA(arg0, arg2 + 1, 50);
								} else if (arg6 == 1) {
									local128.EA(arg0 + 1, arg2 - -1, 50);
								} else if (arg6 == 2) {
									local128.EA(arg0 + 1, arg2, 50);
								} else if (arg6 == 3) {
									local128.EA(arg0, arg2, 50);
								}
							}
							if (local28.anInt8782 != 0 && arg4 != null) {
								arg4.method8206(local28.aBoolean726, arg8, !local28.aBoolean732, arg6, arg2, arg0);
							}
						} else if (arg8 == 2) {
							local379 = arg6 + 1 & 0x3;
							if (local213) {
								@Pc(1206) Class2_Sub4_Sub2 local1206 = new Class2_Sub4_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, arg8, arg6 + 4, local179);
								@Pc(1221) Class2_Sub4_Sub2 local1221 = new Class2_Sub4_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, arg8, local379, local179);
								if (local1206.method8401()) {
									local1206.method8396(arg9);
								}
								if (local1221.method8401()) {
									local1221.method8396(arg9);
								}
								local1058 = local1206;
								local758 = local1221;
							} else {
								local1058 = new Class2_Sub4_Sub1(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg8, arg6 + 4, arg5);
								local758 = new Class2_Sub4_Sub1(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg8, local379, arg5);
							}
							Static194.method3314(arg3, arg0, arg2, local1058, local758);
							if (local28.anInt8767 == 1 && Static362.aBoolean542 && !super.aBoolean335) {
								if (arg6 == 0) {
									super.aByteArrayArrayArray14[arg3][arg0][arg2] = (byte) (super.aByteArrayArrayArray14[arg3][arg0][arg2] | 0x1);
									super.aByteArrayArrayArray14[arg3][arg0][arg2 + 1] = (byte) (super.aByteArrayArrayArray14[arg3][arg0][arg2 + 1] | 0x2);
								} else if (arg6 == 1) {
									super.aByteArrayArrayArray14[arg3][arg0][arg2 + 1] = (byte) (super.aByteArrayArrayArray14[arg3][arg0][arg2 + 1] | 0x2);
									super.aByteArrayArrayArray14[arg3][arg0 + 1][arg2] = (byte) (super.aByteArrayArrayArray14[arg3][arg0 + 1][arg2] | 0x1);
								} else if (arg6 == 2) {
									super.aByteArrayArrayArray14[arg3][arg0 + 1][arg2] = (byte) (super.aByteArrayArrayArray14[arg3][arg0 + 1][arg2] | 0x1);
									super.aByteArrayArrayArray14[arg3][arg0][arg2] = (byte) (super.aByteArrayArrayArray14[arg3][arg0][arg2] | 0x2);
								} else if (arg6 == 3) {
									super.aByteArrayArrayArray14[arg3][arg0][arg2] = (byte) (super.aByteArrayArrayArray14[arg3][arg0][arg2] | 0x2);
									super.aByteArrayArrayArray14[arg3][arg0][arg2] = (byte) (super.aByteArrayArrayArray14[arg3][arg0][arg2] | 0x1);
								}
							}
							if (local28.anInt8782 != 0 && arg4 != null) {
								arg4.method8206(local28.aBoolean726, arg8, !local28.aBoolean732, arg6, arg2, arg0);
							}
							if (local28.anInt8740 != 64) {
								Static532.method7860(arg3, arg0, arg2, local28.anInt8740);
							}
						} else if (arg8 == 3) {
							if (local213) {
								local1056 = new Class2_Sub4_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, arg8, arg6, local179);
								local1058 = local1056;
								if (local1056.method8401()) {
									local1056.method8396(arg9);
								}
							} else {
								local1058 = new Class2_Sub4_Sub1(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg8, arg6, arg5);
							}
							local758 = Static496.method7511(arg3, arg0, arg2);
							if (local758 instanceof Class2_Sub4_Sub3) {
								((Class2_Sub4_Sub3) local758).aClass2_Sub4_3 = local1058;
							} else {
								Static194.method3314(arg3, arg0, arg2, local1058, null);
							}
							if (local28.aBoolean733 && Static362.aBoolean542) {
								if (arg6 == 0) {
									local128.EA(arg0, arg2 + 1, 50);
								} else if (arg6 == 1) {
									local128.EA(arg0 + 1, arg2 - -1, 50);
								} else if (arg6 == 2) {
									local128.EA(arg0 + 1, arg2, 50);
								} else if (arg6 == 3) {
									local128.EA(arg0, arg2, 50);
								}
							}
							if (local28.anInt8782 != 0 && arg4 != null) {
								arg4.method8206(local28.aBoolean726, arg8, !local28.aBoolean732, arg6, arg2, arg0);
							}
						} else if (arg8 == 9) {
							if (local213) {
								local340 = new Class2_Sub2_Sub4(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg0, arg0, arg2, arg2, arg8, arg6, local179);
								local375 = local340;
								if (local340.method8401()) {
									local340.method8396(arg9);
								}
							} else {
								local375 = new Class2_Sub2_Sub2(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg0, local52 + arg0 - 1, arg2, local49 + arg2 - 1, arg8, arg6, arg5);
							}
							local630 = Static200.method3364(arg3, arg0, arg2, ut.class);
							if (local630 instanceof Class2_Sub2_Sub6 && local630.aShort120 == arg0 && local630.aShort122 == arg2) {
								((Class2_Sub2_Sub6) local630).aClass2_Sub2_2 = local375;
							} else {
								Static319.method5520(local375, false);
							}
							if (local28.anInt8782 != 0 && arg4 != null) {
								arg4.method8220(local49, arg0, !local28.aBoolean732, local52, arg2, local28.aBoolean726);
							}
							if (local28.anInt8740 != 64) {
								Static532.method7860(arg3, arg0, arg2, local28.anInt8740);
							}
						} else {
							@Pc(1816) Class2_Sub3 local1816;
							if (arg8 == 4) {
								if (local213) {
									@Pc(1834) Class2_Sub3_Sub2 local1834 = new Class2_Sub3_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, 0, 0, 0, arg8, arg6);
									if (local1834.method8401()) {
										local1834.method8396(arg9);
									}
									local1816 = local1834;
								} else {
									local1816 = new Class2_Sub3_Sub3(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, 0, 0, 0, arg8, arg6, arg5);
								}
								@Pc(1849) Class2_Sub3 local1849 = Static563.method8123(arg3, arg0, arg2);
								if (local1849 instanceof Class2_Sub3_Sub1) {
									((Class2_Sub3_Sub1) local1849).aClass2_Sub3_3 = local1816;
								} else {
									Static165.method3091(arg3, arg0, arg2, local1816, null);
								}
							} else {
								@Pc(1869) int local1869;
								@Pc(1875) Interface22 local1875;
								@Pc(1914) Class2_Sub3_Sub2 local1914;
								@Pc(1957) Class2_Sub3 local1957;
								if (arg8 == 5) {
									local1869 = 65;
									local1875 = (Interface22) Static496.method7511(arg3, arg0, arg2);
									if (local1875 != null) {
										local1869 = Static253.aClass146_2.method3356(local1875.method8398()).anInt8740 + 1;
									}
									if (local213) {
										local1914 = new Class2_Sub3_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, 0, local1869 * Static45.anIntArray69[arg6], local1869 * Static443.anIntArray515[arg6], arg8, arg6);
										local1816 = local1914;
										if (local1914.method8401()) {
											local1914.method8396(arg9);
										}
									} else {
										local1816 = new Class2_Sub3_Sub3(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, 0, Static45.anIntArray69[arg6] * local1869, local1869 * Static443.anIntArray515[arg6], arg8, arg6, arg5);
									}
									local1957 = Static563.method8123(arg3, arg0, arg2);
									if (local1957 instanceof Class2_Sub3_Sub1) {
										((Class2_Sub3_Sub1) local1957).aClass2_Sub3_3 = local1816;
									} else {
										Static165.method3091(arg3, arg0, arg2, local1816, null);
									}
								} else if (arg8 == 6) {
									local1869 = 33;
									local1875 = (Interface22) Static496.method7511(arg3, arg0, arg2);
									if (local1875 != null) {
										local1869 = Static253.aClass146_2.method3356(local1875.method8398()).anInt8740 / 2 + 1;
									}
									if (local213) {
										local1914 = new Class2_Sub3_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, arg6, Static45.anIntArray69[arg6] * local1869, Static443.anIntArray515[arg6] * local1869, arg8, arg6 + 4);
										local1816 = local1914;
										if (local1914.method8401()) {
											local1914.method8396(arg9);
										}
									} else {
										local1816 = new Class2_Sub3_Sub3(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg6, Static21.anIntArray21[arg6] * local1869, Static533.anIntArray644[arg6] * local1869, arg8, arg6 + 4, arg5);
									}
									local1957 = Static563.method8123(arg3, arg0, arg2);
									if (local1957 instanceof Class2_Sub3_Sub1) {
										((Class2_Sub3_Sub1) local1957).aClass2_Sub3_3 = local1816;
									} else {
										Static165.method3091(arg3, arg0, arg2, local1816, null);
									}
								} else if (arg8 == 7) {
									local1869 = arg6 + 2 & 0x3;
									if (local213) {
										@Pc(2120) Class2_Sub3_Sub2 local2120 = new Class2_Sub3_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, local1869, 0, 0, arg8, local1869 + 4);
										local1816 = local2120;
										if (local2120.method8401()) {
											local2120.method8396(arg9);
										}
									} else {
										local1816 = new Class2_Sub3_Sub3(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, local1869, 0, 0, arg8, local1869 + 4, arg5);
									}
									@Pc(2157) Class2_Sub3 local2157 = Static563.method8123(arg3, arg0, arg2);
									if (local2157 instanceof Class2_Sub3_Sub1) {
										((Class2_Sub3_Sub1) local2157).aClass2_Sub3_3 = local1816;
									} else {
										Static165.method3091(arg3, arg0, arg2, local1816, null);
									}
								} else if (arg8 == 8) {
									local379 = arg6 + 2 & 0x3;
									@Pc(2183) int local2183 = 33;
									@Pc(2189) Interface22 local2189 = (Interface22) Static496.method7511(arg3, arg0, arg2);
									if (local2189 != null) {
										local2183 = Static253.aClass146_2.method3356(local2189.method8398()).anInt8740 / 2 + 1;
									}
									@Pc(2232) Class2_Sub3 local2232;
									@Pc(2251) Class2_Sub3 local2251;
									if (local213) {
										local2232 = new Class2_Sub3_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, arg6, local2183 * Static21.anIntArray21[arg6], Static533.anIntArray644[arg6] * local2183, arg8, arg6 + 4);
										local2251 = new Class2_Sub3_Sub2(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, arg6, 0, 0, arg8, local379 + 4);
										if (local2232.method8401()) {
											local2232.method8396(arg9);
										}
										if (local2251.method8401()) {
											local2251.method8396(arg9);
										}
									} else {
										local2232 = new Class2_Sub3_Sub3(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg6, Static21.anIntArray21[arg6] * local2183, local2183 * Static533.anIntArray644[arg6], arg8, arg6 + 4, arg5);
										local2251 = new Class2_Sub3_Sub3(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg6, 0, 0, arg8, local379 + 4, arg5);
									}
									Static165.method3091(arg3, arg0, arg2, local2232, local2251);
								}
							}
						}
					}
				}
			}
		} else if (Static455.aClass3_Sub27_Sub1_1.aBoolean382 || local28.anInt8778 != 0 || local28.anInt8782 == 1 || local28.aBoolean736) {
			@Pc(273) Class2_Sub1 local273;
			if (local213) {
				@Pc(288) Class2_Sub1_Sub1 local288 = new Class2_Sub1_Sub1(arg9, local28, arg1, local159, local151, local167, super.aBoolean335, arg6, local179);
				if (local288.method8401()) {
					local288.method8396(arg9);
				}
				local273 = local288;
			} else {
				local273 = new Class2_Sub1_Sub2(arg9, local28, arg3, arg1, local159, local151, local167, super.aBoolean335, arg6, arg5);
			}
			@Pc(303) Class2_Sub1 local303 = Static86.method1922(arg3, arg0, arg2);
			if (local303 instanceof Class2_Sub1_Sub3) {
				((Class2_Sub1_Sub3) local303).aClass2_Sub1_2 = local273;
			} else {
				Static526.method7773(arg3, arg0, arg2, local273);
			}
			if (local28.anInt8782 == 1 && arg4 != null) {
				arg4.method8210(arg0, arg2);
			}
		}
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ZLclient!oa;)V")
	public void method3669(@OriginalArg(1) Class15 arg0) {
		Static3.method210(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt4295 > 1) {
			for (local13 = 0; super.anInt4301 > local13; local13++) {
				for (local17 = 0; local17 < super.anInt4297; local17++) {
					if ((Static576.aByteArrayArrayArray21[1][local13][local17] & 0x2) == 2) {
						Static586.method6312(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; super.anInt4295 > local13; local13++) {
			for (local17 = 0; local17 <= super.anInt4297; local17++) {
				for (@Pc(55) int local55 = 0; local55 <= super.anInt4301; local55++) {
					@Pc(70) int local70;
					@Pc(72) int local72;
					@Pc(74) int local74;
					@Pc(124) int local124;
					@Pc(128) int local128;
					@Pc(229) int local229;
					@Pc(238) int local238;
					@Pc(258) int local258;
					@Pc(262) int local262;
					if ((super.aByteArrayArrayArray14[local13][local55][local17] & 0x1) != 0) {
						local70 = local17;
						local72 = local17;
						local74 = local13;
						while (local72 < super.anInt4297 && (super.aByteArrayArrayArray14[local13][local55][local72 + 1] & 0x1) != 0) {
							local72++;
						}
						while (local70 > 0 && (super.aByteArrayArrayArray14[local13][local55][local70 - 1] & 0x1) != 0) {
							local70--;
						}
						local124 = local13;
						label164: while (local74 > 0) {
							for (local128 = local70; local128 <= local72; local128++) {
								if ((super.aByteArrayArrayArray14[local74 - 1][local55][local128] & 0x1) == 0) {
									break label164;
								}
							}
							local74--;
						}
						label153: while (local124 < 3) {
							for (local128 = local70; local128 <= local72; local128++) {
								if ((super.aByteArrayArrayArray14[local124 + 1][local55][local128] & 0x1) == 0) {
									break label153;
								}
							}
							local124++;
						}
						local128 = (local124 + 1 - local74) * ((local72 + 1) - local70);
						if (local128 >= 2) {
							local229 = super.anIntArrayArrayArray8[local124][local55][local70] - 960;
							local238 = super.anIntArrayArrayArray8[local74][local55][local70];
							Static420.method6747(1, local55 << 9, local55 << 9, local70 << 9, (local72 << 9) + 512, local229, local238);
							for (local258 = local74; local258 <= local124; local258++) {
								for (local262 = local70; local262 <= local72; local262++) {
									super.aByteArrayArrayArray14[local258][local55][local262] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local13][local55][local17] & 0x2) != 0) {
						local70 = local55;
						local72 = local55;
						local74 = local13;
						while (local72 < super.anInt4301 && (super.aByteArrayArrayArray14[local13][local72 + 1][local17] & 0x2) != 0) {
							local72++;
						}
						local124 = local13;
						while (local70 > 0 && (super.aByteArrayArrayArray14[local13][local70 - 1][local17] & 0x2) != 0) {
							local70--;
						}
						label218: while (local74 > 0) {
							for (local128 = local70; local128 <= local72; local128++) {
								if ((super.aByteArrayArrayArray14[local74 - 1][local128][local17] & 0x2) == 0) {
									break label218;
								}
							}
							local74--;
						}
						label207: while (local124 < 3) {
							for (local128 = local70; local128 <= local72; local128++) {
								if ((super.aByteArrayArrayArray14[local124 + 1][local128][local17] & 0x2) == 0) {
									break label207;
								}
							}
							local124++;
						}
						local128 = (local124 + 1 - local74) * (local72 + 1 - local70);
						if (local128 >= 2) {
							local229 = super.anIntArrayArrayArray8[local124][local70][local17] - 960;
							local238 = super.anIntArrayArrayArray8[local74][local70][local17];
							Static420.method6747(2, local70 << 9, (local72 << 9) + 512, local17 << 9, local17 << 9, local229, local238);
							for (local258 = local74; local258 <= local124; local258++) {
								for (local262 = local70; local262 <= local72; local262++) {
									super.aByteArrayArrayArray14[local258][local262][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray14[local13][local55][local17] & 0x4) != 0) {
						local70 = local55;
						local72 = local55;
						for (local74 = local17; local74 > 0 && (super.aByteArrayArrayArray14[local13][local55][local74 - 1] & 0x4) != 0; local74--) {
						}
						for (local124 = local17; super.anInt4297 > local124 && (super.aByteArrayArrayArray14[local13][local55][local124 + 1] & 0x4) != 0; local124++) {
						}
						label272: while (local70 > 0) {
							for (local128 = local74; local128 <= local124; local128++) {
								if ((super.aByteArrayArrayArray14[local13][local70 - 1][local128] & 0x4) == 0) {
									break label272;
								}
							}
							local70--;
						}
						label261: while (super.anInt4301 > local72) {
							for (local128 = local74; local128 <= local124; local128++) {
								if ((super.aByteArrayArrayArray14[local13][local72 + 1][local128] & 0x4) == 0) {
									break label261;
								}
							}
							local72++;
						}
						if ((local72 + 1 - local70) * (local124 + 1 - local74) >= 4) {
							local128 = super.anIntArrayArrayArray8[local13][local70][local74];
							Static420.method6747(4, local70 << 9, (local72 << 9) + 512, local74 << 9, (local124 << 9) + 512, local128, local128);
							for (@Pc(681) int local681 = local70; local681 <= local72; local681++) {
								for (local229 = local74; local229 <= local124; local229++) {
									super.aByteArrayArrayArray14[local13][local681][local229] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray14 = null;
	}

	@OriginalMember(owner = "client!iaa", name = "a", descriptor = "(B[IILclient!fd;ILclient!oa;)V")
	public void method3670(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class15 arg4) {
		if (super.aBoolean335) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(17) Class167 local17 = null;
		if (arg0 != null) {
			arg0[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(28) int local28;
						@Pc(62) int local62;
						@Pc(494) int local494;
						@Pc(80) int local80;
						@Pc(84) int local84;
						while (arg2.aByteArray86.length > arg2.anInt7869) {
							local28 = arg2.method6538();
							if (local28 == 0) {
								local17 = new Class167(arg2);
							} else {
								@Pc(86) int local86;
								@Pc(136) int local136;
								@Pc(219) int local219;
								if (local28 == 1) {
									local62 = arg2.method6538();
									if (local62 > 0) {
										for (local494 = 0; local494 < local62; local494++) {
											@Pc(503) Class212 local503 = new Class212(arg4, arg2, 2);
											if (local503.anInt6619 == 31) {
												@Pc(516) Class293 local516 = Static93.aClass246_1.method6137(arg2.method6535());
												local503.method5543(local516.anInt8807, local516.anInt8802, local516.anInt8808, local516.anInt8803);
											}
											if (arg4.method5329() > 0) {
												@Pc(533) Class3_Sub28 local533 = local503.aClass3_Sub28_2;
												local86 = (arg3 << 9) + local533.method8156();
												local136 = (arg1 << 9) + local533.method8158();
												local219 = local86 >> 9;
												@Pc(559) int local559 = local136 >> 9;
												if (local219 >= 0 && local559 >= 0 && super.anInt4301 > local219 && super.anInt4297 > local559) {
													local533.method8157(local136, local86, super.anIntArrayArrayArray8[local503.anInt6629][local219][local559] - local533.method8155());
													Static360.method1686(local503);
												}
											}
										}
									}
								} else if (local28 == 2) {
									if (local17 == null) {
										local17 = new Class167();
									}
									local17.method4126(arg2);
								} else if (local28 != 128) {
									if (local28 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray18 == null) {
										super.aByteArrayArrayArray18 = new byte[4][][];
									}
									for (local62 = 0; local62 < 4; local62++) {
										@Pc(68) byte local68 = arg2.method6529();
										if (local68 == 0 && super.aByteArrayArrayArray18[local62] != null) {
											local80 = arg3;
											local84 = arg3 + 64;
											local86 = arg1;
											if (arg3 < 0) {
												local80 = 0;
											} else if (super.anInt4301 <= arg3) {
												local80 = super.anInt4301;
											}
											if (local84 < 0) {
												local84 = 0;
											} else if (super.anInt4301 <= local84) {
												local84 = super.anInt4301;
											}
											if (arg1 < 0) {
												local86 = 0;
											} else if (super.anInt4297 <= arg1) {
												local86 = super.anInt4297;
											}
											local136 = arg1 + 64;
											if (local136 < 0) {
												local136 = 0;
											} else if (local136 >= super.anInt4297) {
												local136 = super.anInt4297;
											}
											while (local80 < local84) {
												while (local86 < local136) {
													super.aByteArrayArrayArray18[local62][local80][local86] = 0;
													local86++;
												}
												local80++;
											}
										} else if (local68 == 1) {
											if (super.aByteArrayArrayArray18[local62] == null) {
												super.aByteArrayArrayArray18[local62] = new byte[super.anInt4301 + 1][super.anInt4297 + 1];
											}
											for (local80 = 0; local80 < 64; local80 += 4) {
												for (local84 = 0; local84 < 64; local84 += 4) {
													@Pc(209) byte local209 = arg2.method6529();
													for (local136 = local80 + arg3; local136 < local80 + arg3 + 4; local136++) {
														for (local219 = arg1 + local84; local219 < local84 + arg1 + 4; local219++) {
															if (local136 >= 0 && super.anInt4301 > local136 && local219 >= 0 && super.anInt4297 > local219) {
																super.aByteArrayArrayArray18[local62][local136][local219] = local209;
															}
														}
													}
												}
											}
										} else if (local68 == 2) {
											if (super.aByteArrayArrayArray18[local62] == null) {
												super.aByteArrayArrayArray18[local62] = new byte[super.anInt4301 + 1][super.anInt4297 + 1];
											}
											if (local62 > 0) {
												local80 = arg3;
												local84 = arg3 + 64;
												local86 = arg1;
												if (arg3 < 0) {
													local80 = 0;
												} else if (super.anInt4301 <= arg3) {
													local80 = super.anInt4301;
												}
												if (local84 < 0) {
													local84 = 0;
												} else if (super.anInt4301 <= local84) {
													local84 = super.anInt4301;
												}
												if (arg1 < 0) {
													local86 = 0;
												} else if (arg1 >= super.anInt4297) {
													local86 = super.anInt4297;
												}
												local136 = arg1 + 64;
												if (local136 < 0) {
													local136 = 0;
												} else if (local136 >= super.anInt4297) {
													local136 = super.anInt4297;
												}
												while (local80 < local84) {
													while (local136 > local86) {
														super.aByteArrayArrayArray18[local62][local80][local86] = super.aByteArrayArrayArray18[local62 - 1][local80][local86];
														local86++;
													}
													local80++;
												}
											}
										}
									}
									local11 = true;
								} else if (arg0 == null) {
									arg2.anInt7869 += 10;
								} else {
									arg0[0] = arg2.method6535();
									arg0[1] = arg2.method6525();
									arg0[2] = arg2.method6525();
									arg0[3] = arg2.method6525();
									arg0[4] = arg2.method6535();
								}
							}
						}
						if (local17 != null) {
							for (local28 = 0; local28 < 8; local28++) {
								for (local62 = 0; local62 < 8; local62++) {
									local494 = (arg3 >> 3) + local28;
									local80 = local62 + (arg1 >> 3);
									if (local494 >= 0 && super.anInt4301 >> 3 > local494 && local80 >= 0 && super.anInt4297 >> 3 > local80) {
										Static27.method951(local17, local494, local80);
									}
								}
							}
						}
						if (!local11 && super.aByteArrayArrayArray18 != null) {
							for (local28 = 0; local28 < 4; local28++) {
								if (super.aByteArrayArrayArray18[local28] != null) {
									for (local62 = 0; local62 < 16; local62++) {
										for (local494 = 0; local494 < 16; local494++) {
											local80 = local62 + (arg3 >> 2);
											local84 = local494 + (arg1 >> 2);
											if (local80 >= 0 && local80 < 26 && local84 >= 0 && local84 < 26) {
												super.aByteArrayArrayArray18[local28][local80][local84] = 0;
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
}
