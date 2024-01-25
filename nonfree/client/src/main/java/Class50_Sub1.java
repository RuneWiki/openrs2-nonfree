import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cea")
public final class Class50_Sub1 extends Class50 {

	@OriginalMember(owner = "client!cea", name = "S", descriptor = "I")
	public int anInt1122 = 99;

	@OriginalMember(owner = "client!cea", name = "<init>", descriptor = "(IIIZ)V")
	public Class50_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static401.aClass309_4, Static380.aClass211_7);
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "([BLclient!r;III[Lclient!wg;)V")
	public void method1057(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class362[] arg4) {
		@Pc(14) Class2_Sub7 local14 = new Class2_Sub7(arg0);
		@Pc(16) int local16 = -1;
		while (true) {
			@Pc(20) int local20 = local14.method4523();
			if (local20 == 0) {
				return;
			}
			local16 += local20;
			@Pc(31) int local31 = 0;
			while (true) {
				@Pc(35) int local35 = local14.method4458();
				if (local35 == 0) {
					break;
				}
				local31 += local35 - 1;
				@Pc(47) int local47 = local31 & 0x3F;
				@Pc(53) int local53 = local31 >> 6 & 0x3F;
				@Pc(57) int local57 = local31 >> 12;
				@Pc(61) int local61 = local14.method4464();
				@Pc(65) int local65 = local61 >> 2;
				@Pc(69) int local69 = local61 & 0x3;
				@Pc(73) int local73 = arg2 + local53;
				@Pc(77) int local77 = arg3 + local47;
				if (local73 > 0 && local77 > 0 && super.anInt1106 - 1 > local73 && super.anInt1100 - 1 > local77) {
					@Pc(106) Class362 local106 = null;
					if (!super.aBoolean61) {
						@Pc(111) int local111 = local57;
						if ((Static433.aByteArrayArrayArray15[1][local73][local77] & 0x2) == 2) {
							local111 = local57 - 1;
						}
						if (local111 >= 0) {
							local106 = arg4[local111];
						}
					}
					this.method1064(arg1, local57, local73, local65, local57, -1, local77, local106, local16, local69);
				}
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[BII[Lclient!wg;IIIILclient!r;I)V")
	public void method1058(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class362[] arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) Class162 arg9) {
		@Pc(15) Class2_Sub7 local15 = new Class2_Sub7(arg1);
		@Pc(17) int local17 = -1;
		while (true) {
			@Pc(21) int local21 = local15.method4523();
			if (local21 == 0) {
				return;
			}
			local17 += local21;
			@Pc(29) int local29 = 0;
			while (true) {
				@Pc(33) int local33 = local15.method4458();
				if (local33 == 0) {
					break;
				}
				local29 += local33 - 1;
				@Pc(48) int local48 = local29 & 0x3F;
				@Pc(54) int local54 = local29 >> 6 & 0x3F;
				@Pc(58) int local58 = local29 >> 12;
				@Pc(62) int local62 = local15.method4464();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				if (arg7 == local58 && arg5 <= local54 && local54 < arg5 + 8 && arg6 <= local48 && arg6 + 8 > local48) {
					@Pc(106) Class216 local106 = Static362.aClass290_2.method5799(local17);
					@Pc(123) int local123 = Static208.method2576(local106.anInt5287, local54 & 0x7, local106.anInt5244, local70, local48 & 0x7, arg8) + arg2;
					@Pc(140) int local140 = Static397.method5453(local70, local106.anInt5244, local48 & 0x7, local106.anInt5287, arg8, local54 & 0x7) + arg3;
					if (local123 > 0 && local140 > 0 && local123 < super.anInt1106 - 1 && super.anInt1100 - 1 > local140) {
						@Pc(162) Class362 local162 = null;
						if (!super.aBoolean61) {
							@Pc(167) int local167 = arg0;
							if ((Static433.aByteArrayArrayArray15[1][local123][local140] & 0x2) == 2) {
								local167 = arg0 - 1;
							}
							if (local167 >= 0) {
								local162 = arg4[local167];
							}
						}
						this.method1064(arg9, arg0, local123, local66, arg0, -1, local140, local162, local17, arg8 + local70 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ILclient!wg;BLclient!r;III)V")
	public void method1059(@OriginalArg(0) int arg0, @OriginalArg(1) Class362 arg1, @OriginalArg(3) Class162 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) Interface14 local10 = null;
		if (arg4 == 0) {
			local10 = (Interface14) Static389.method5373(arg3, arg0, arg5);
		}
		if (arg4 == 1) {
			local10 = (Interface14) Static552.method7232(arg3, arg0, arg5);
		}
		if (arg4 == 2) {
			local10 = (Interface14) Static32.method551(arg3, arg0, arg5, je.class);
		}
		if (arg4 == 3) {
			local10 = (Interface14) Static347.method5019(arg3, arg0, arg5);
		}
		if (local10 == null) {
			return;
		}
		@Pc(69) Class216 local69 = Static362.aClass290_2.method5799(local10.method7094());
		@Pc(73) int local73 = local10.method7091();
		@Pc(77) int local77 = local10.method7093();
		if (local69.method4547()) {
			Static189.method2393(arg0, arg3, local69, arg5);
		}
		if (local10.method7092()) {
			local10.method7089(arg2);
		}
		if (arg4 == 0) {
			Static78.method1222(arg3, arg0, arg5);
			if (local69.anInt5290 != 0) {
				arg1.method7596(local77, !local69.aBoolean407, arg0, local73, local69.aBoolean409, arg5);
			}
			if (local69.anInt5271 == 1) {
				if (local77 != 0) {
					if (local77 == 1) {
						Static69.method4389(2, arg5 + 1, arg0, arg3);
						return;
					}
					if (local77 == 2) {
						Static69.method4389(1, arg5, arg0 + 1, arg3);
					} else if (local77 == 3) {
						Static69.method4389(2, arg5, arg0, arg3);
						return;
					}
					return;
				}
				Static69.method4389(1, arg5, arg0, arg3);
				return;
			}
		} else if (arg4 == 1) {
			Static20.method294(arg3, arg0, arg5);
		} else if (arg4 == 2) {
			Static414.method5576(arg3, arg0, arg5, je.class);
			if (local69.anInt5290 != 0 && local69.anInt5287 + arg0 < super.anInt1106 && arg5 + local69.anInt5287 < super.anInt1100 && local69.anInt5244 + arg0 < super.anInt1106 && super.anInt1100 > arg5 + local69.anInt5244) {
				arg1.method7595(local69.aBoolean409, !local69.aBoolean407, arg0, local77, arg5, local69.anInt5244, local69.anInt5287);
				return;
			}
		} else {
			if (arg4 == 3) {
				Static215.method2636(arg3, arg0, arg5);
				if (local69.anInt5290 == 1) {
					arg1.method7593(arg5, arg0);
					return;
				}
			}
			return;
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(ZILclient!r;)V")
	public void method1060(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class162 arg1) {
		Static90.method1358();
		if (!arg0) {
			@Pc(25) int local25;
			@Pc(29) int local29;
			if (super.anInt1101 > 1) {
				for (local25 = 0; super.anInt1106 > local25; local25++) {
					for (local29 = 0; super.anInt1100 > local29; local29++) {
						if ((Static433.aByteArrayArrayArray15[1][local25][local29] & 0x2) == 2) {
							Static569.method7427(local25, local29);
						}
					}
				}
			}
			for (local25 = 0; local25 < super.anInt1101; local25++) {
				for (local29 = 0; local29 <= super.anInt1100; local29++) {
					for (@Pc(69) int local69 = 0; super.anInt1106 >= local69; local69++) {
						if ((super.aByteArrayArrayArray9[local25][local69][local29] & 0x4) != 0) {
							@Pc(87) int local87 = local69;
							@Pc(89) int local89 = local69;
							@Pc(91) int local91 = local29;
							@Pc(93) int local93 = local29;
							while (local91 > 0 && (super.aByteArrayArrayArray9[local25][local69][local91 - 1] & 0x4) != 0 && local29 - local91 < 10) {
								local91--;
							}
							while (super.anInt1100 > local93 && (super.aByteArrayArrayArray9[local25][local69][local93 + 1] & 0x4) != 0 && local93 - local91 < 10) {
								local93++;
							}
							@Pc(155) int local155;
							label111: while (local87 > 0 && local69 - local87 < 10) {
								for (local155 = local91; local155 <= local93; local155++) {
									if ((super.aByteArrayArrayArray9[local25][local87 - 1][local155] & 0x4) == 0) {
										break label111;
									}
								}
								local87--;
							}
							label98: while (super.anInt1106 > local89 && local89 - local87 < 10) {
								for (local155 = local91; local155 <= local93; local155++) {
									if ((super.aByteArrayArrayArray9[local25][local89 + 1][local155] & 0x4) == 0) {
										break label98;
									}
								}
								local89++;
							}
							if ((local89 + 1 - local87) * (-local91 + local93 + 1) >= 4) {
								local155 = super.anIntArrayArrayArray3[local25][local87][local91];
								Static370.method5185(local25, local91 << 9, local87 << 9, (local93 << 9) + 512, local155, (local89 << 9) + 512, local155);
								for (@Pc(289) int local289 = local87; local289 <= local89; local289++) {
									for (@Pc(293) int local293 = local91; local293 <= local93; local293++) {
										super.aByteArrayArrayArray9[local25][local289][local293] &= 0xFFFFFFFB;
									}
								}
							}
						}
					}
				}
			}
			Static328.method4755();
		}
		super.aByteArrayArrayArray9 = null;
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(BILclient!gk;Lclient!r;[II)V")
	public void method1061(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub7 arg1, @OriginalArg(3) Class162 arg2, @OriginalArg(4) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean61) {
			return;
		}
		@Pc(14) boolean local14 = false;
		@Pc(16) Class75 local16 = null;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		while (true) {
			while (true) {
				while (true) {
					while (true) {
						@Pc(27) int local27;
						@Pc(57) int local57;
						@Pc(480) int local480;
						@Pc(95) int local95;
						@Pc(99) int local99;
						while (arg1.aByteArray52.length > arg1.anInt5186) {
							local27 = arg1.method4464();
							if (local27 == 0) {
								local16 = new Class75(arg1);
							} else {
								@Pc(212) int local212;
								@Pc(109) int local109;
								@Pc(115) int local115;
								if (local27 == 1) {
									local57 = arg1.method4464();
									if (local57 > 0) {
										for (local480 = 0; local480 < local57; local480++) {
											@Pc(489) Class141 local489 = new Class141(arg2, arg1, 2);
											if (local489.anInt2905 == 31) {
												@Pc(504) Class60 local504 = Static304.aClass304_1.method6145(arg1.method4518());
												local489.method2500(local504.anInt1290, local504.anInt1287, local504.anInt1288, local504.anInt1285);
											}
											if (arg2.method6851() > 0) {
												@Pc(521) Class2_Sub11 local521 = local489.aClass2_Sub11_1;
												local212 = local521.method7276() + (arg4 << 9);
												local109 = local521.method7271() + (arg0 << 9);
												local115 = local212 >> 9;
												@Pc(546) int local546 = local109 >> 9;
												if (local115 >= 0 && local546 >= 0 && local115 < super.anInt1106 && super.anInt1100 > local546) {
													local521.method7278(super.anIntArrayArrayArray3[local489.anInt2907][local115][local546] - local521.method7270(), local109, local212);
													Static82.method1253(local489);
												}
											}
										}
									}
								} else if (local27 == 2) {
									if (local16 == null) {
										local16 = new Class75();
									}
									local16.method1455(arg1);
								} else if (local27 != 128) {
									if (local27 != 129) {
										throw new IllegalStateException("");
									}
									if (super.aByteArrayArrayArray11 == null) {
										super.aByteArrayArrayArray11 = new byte[4][][];
									}
									for (local57 = 0; local57 < 4; local57++) {
										@Pc(63) byte local63 = arg1.method4477();
										if (local63 == 0 && super.aByteArrayArrayArray11[local57] != null) {
											local95 = arg4;
											local99 = arg4 + 64;
											local212 = arg0;
											if (local99 < 0) {
												local99 = 0;
											} else if (super.anInt1106 <= local99) {
												local99 = super.anInt1106;
											}
											if (arg4 < 0) {
												local95 = 0;
											} else if (arg4 >= super.anInt1106) {
												local95 = super.anInt1106;
											}
											local109 = arg0 + 64;
											if (arg0 < 0) {
												local212 = 0;
											} else if (arg0 >= super.anInt1100) {
												local212 = super.anInt1100;
											}
											if (local109 < 0) {
												local109 = 0;
											} else if (super.anInt1100 <= local109) {
												local109 = super.anInt1100;
											}
											while (local99 > local95) {
												while (local109 > local212) {
													super.aByteArrayArrayArray11[local57][local95][local212] = 0;
													local212++;
												}
												local95++;
											}
										} else if (local63 == 1) {
											if (super.aByteArrayArrayArray11[local57] == null) {
												super.aByteArrayArrayArray11[local57] = new byte[super.anInt1106 + 1][super.anInt1100 + 1];
											}
											for (local95 = 0; local95 < 64; local95 += 4) {
												for (local99 = 0; local99 < 64; local99 += 4) {
													@Pc(105) byte local105 = arg1.method4477();
													for (local109 = arg4 + local95; local109 < local95 + arg4 + 4; local109++) {
														for (local115 = arg0 + local99; local115 < local99 + arg0 + 4; local115++) {
															if (local109 >= 0 && super.anInt1106 > local109 && local115 >= 0 && super.anInt1100 > local115) {
																super.aByteArrayArrayArray11[local57][local109][local115] = local105;
															}
														}
													}
												}
											}
										} else if (local63 == 2) {
											if (super.aByteArrayArrayArray11[local57] == null) {
												super.aByteArrayArrayArray11[local57] = new byte[super.anInt1106 + 1][super.anInt1100 + 1];
											}
											if (local57 > 0) {
												local95 = arg4;
												local99 = arg4 + 64;
												local212 = arg0;
												if (arg0 < 0) {
													local212 = 0;
												} else if (super.anInt1100 <= arg0) {
													local212 = super.anInt1100;
												}
												if (local99 < 0) {
													local99 = 0;
												} else if (local99 >= super.anInt1106) {
													local99 = super.anInt1106;
												}
												local109 = arg0 + 64;
												if (arg4 < 0) {
													local95 = 0;
												} else if (super.anInt1106 <= arg4) {
													local95 = super.anInt1106;
												}
												if (local109 < 0) {
													local109 = 0;
												} else if (local109 >= super.anInt1100) {
													local109 = super.anInt1100;
												}
												while (local99 > local95) {
													while (local109 > local212) {
														super.aByteArrayArrayArray11[local57][local95][local212] = super.aByteArrayArrayArray11[local57 - 1][local95][local212];
														local212++;
													}
													local95++;
												}
											}
										}
									}
									local14 = true;
								} else if (arg3 == null) {
									arg1.anInt5186 += 10;
								} else {
									arg3[0] = arg1.method4518();
									arg3[1] = arg1.method4478();
									arg3[2] = arg1.method4478();
									arg3[3] = arg1.method4478();
									arg3[4] = arg1.method4518();
								}
							}
						}
						if (local16 != null) {
							for (local27 = 0; local27 < 8; local27++) {
								for (local57 = 0; local57 < 8; local57++) {
									local480 = local27 + (arg4 >> 3);
									local95 = local57 + (arg0 >> 3);
									if (local480 >= 0 && super.anInt1106 >> 3 > local480 && local95 >= 0 && local95 < super.anInt1100 >> 3) {
										Static17.method4058(local480, local95, local16);
									}
								}
							}
						}
						if (!local14 && super.aByteArrayArrayArray11 != null) {
							for (local27 = 0; local27 < 4; local27++) {
								if (super.aByteArrayArrayArray11[local27] != null) {
									for (local57 = 0; local57 < 16; local57++) {
										for (local480 = 0; local480 < 16; local480++) {
											local95 = local57 + (arg4 >> 2);
											local99 = (arg0 >> 2) + local480;
											if (local95 >= 0 && local95 < 26 && local99 >= 0 && local99 < 26) {
												super.aByteArrayArrayArray11[local27][local95][local99] = 0;
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

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(Lclient!r;IIIIBIILclient!wg;II)V")
	public void method1064(@OriginalArg(0) Class162 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class362 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static257.aClass2_Sub35_Sub1_1.method6053(Static226.anInt3318) && !Static470.method6060(arg6, Static487.anInt7738, arg2, arg4)) {
			return;
		}
		if (arg1 < this.anInt1122) {
			this.anInt1122 = arg1;
		}
		@Pc(34) Class216 local34 = Static362.aClass290_2.method5799(arg8);
		if (arg0.method6818() && Static257.aClass2_Sub35_Sub1_1.aBoolean624 && local34.aBoolean410) {
			return;
		}
		@Pc(53) int local53;
		@Pc(56) int local56;
		if (arg9 == 1 || arg9 == 3) {
			local53 = local34.anInt5244;
			local56 = local34.anInt5287;
		} else {
			local56 = local34.anInt5244;
			local53 = local34.anInt5287;
		}
		@Pc(80) int local80;
		@Pc(78) int local78;
		if (local53 + arg2 > super.anInt1106) {
			local78 = arg2 + 1;
			local80 = arg2;
		} else {
			local80 = (local53 >> 1) + arg2;
			local78 = (local53 + 1 >> 1) + arg2;
		}
		@Pc(117) int local117;
		@Pc(110) int local110;
		if (super.anInt1100 >= local56 + arg6) {
			local110 = (local56 + 1 >> 1) + arg6;
			local117 = arg6 + (local56 >> 1);
		} else {
			local117 = arg6;
			local110 = arg6 + 1;
		}
		@Pc(129) Class151 local129 = Static114.aClass151Array1[arg4];
		@Pc(158) int local158 = local129.method7676(local117, local80) + local129.method7676(local117, local78) + local129.method7676(local110, local80) + local129.method7676(local110, local78) >> 2;
		@Pc(167) int local167 = (arg2 << 9) + (local53 << 8);
		@Pc(175) int local175 = (local56 << 8) + (arg6 << 9);
		@Pc(187) boolean local187 = Static494.aBoolean666 && !super.aBoolean61 && local34.lb;
		if (local34.method4547()) {
			Static169.method2211(arg2, null, arg9, arg6, arg1, local34, null);
		}
		@Pc(229) boolean local229 = arg5 == -1 && local34.anInt5255 == -1 && local34.anIntArray363 == null && local34.anIntArray362 == null && !local34.aBoolean415;
		if (Static154.aBoolean172 && (Static319.method4643(arg3) && local34.anInt5271 != 1 || !(!Static13.method5461(arg3) || local34.anInt5271 != 0))) {
			return;
		}
		if (arg3 != 22) {
			@Pc(374) Class12_Sub2_Sub1 local374;
			@Pc(344) Class12_Sub2_Sub1_Sub3 local344;
			@Pc(376) int local376;
			@Pc(442) int local442;
			if (arg3 == 10 || arg3 == 11) {
				local344 = null;
				if (local229) {
					@Pc(406) Class12_Sub2_Sub1_Sub3 local406 = new Class12_Sub2_Sub1_Sub3(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg2, local53 + arg2 - 1, arg6, local56 + arg6 - 1, arg3, arg9, local187);
					local376 = local406.method4637();
					local374 = local406;
					local344 = local406;
				} else {
					local374 = new Class12_Sub2_Sub1_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg2, local53 + arg2 - 1, arg6, arg6 + local56 - 1, arg3, arg9, arg5);
					local376 = 15;
				}
				if (Static526.method7745(local374, false)) {
					if (local344 != null && local344.method7092()) {
						local344.method7090(arg0);
					}
					if (local34.aBoolean411 && Static494.aBoolean666) {
						if (local376 > 30) {
							local376 = 30;
						}
						for (local442 = 0; local442 <= local53; local442++) {
							for (@Pc(446) int local446 = 0; local446 <= local56; local446++) {
								local129.a(local442 + arg2, arg6 - -local446, local376);
							}
						}
					}
				}
				if (local34.anInt5290 != 0 && arg7 != null) {
					arg7.method7604(!local34.aBoolean407, arg6, local53, arg2, local56, local34.aBoolean409);
				}
			} else if (arg3 >= 12 && arg3 <= 17 || arg3 >= 18 && arg3 <= 21) {
				if (local229) {
					local344 = new Class12_Sub2_Sub1_Sub3(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg2, local53 + arg2 - 1, arg6, local56 + arg6 - 1, arg3, arg9, local187);
					if (local344.method7092()) {
						local344.method7090(arg0);
					}
					local374 = local344;
				} else {
					local374 = new Class12_Sub2_Sub1_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg2, arg2 + local53 - 1, arg6, arg6 + local56 - 1, arg3, arg9, arg5);
				}
				Static526.method7745(local374, false);
				if (Static494.aBoolean666 && !super.aBoolean61 && arg3 >= 12 && arg3 <= 17 && arg3 != 13 && arg1 > 0 && local34.anInt5271 != 0) {
					super.aByteArrayArrayArray9[arg1][arg2][arg6] = (byte) (super.aByteArrayArrayArray9[arg1][arg2][arg6] | 0x4);
				}
				if (local34.anInt5290 != 0 && arg7 != null) {
					arg7.method7604(!local34.aBoolean407, arg6, local53, arg2, local56, local34.aBoolean409);
				}
			} else {
				@Pc(694) Class12_Sub2_Sub5 local694;
				if (arg3 == 0) {
					@Pc(658) int local658 = local34.anInt5271;
					if (Static520.aBoolean702 && local34.anInt5271 == -1) {
						local658 = 1;
					}
					if (local229) {
						@Pc(684) Class12_Sub2_Sub5_Sub2 local684 = new Class12_Sub2_Sub5_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg3, arg9, local187);
						if (local684.method7092()) {
							local684.method7090(arg0);
						}
						local694 = local684;
					} else {
						local694 = new Class12_Sub2_Sub5_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg3, arg9, arg5);
					}
					Static40.method689(arg1, arg2, arg6, local694, null);
					if (arg9 == 0) {
						if (Static494.aBoolean666 && local34.aBoolean411) {
							local129.a(arg2, arg6, 50);
							local129.a(arg2, arg6 + 1, 50);
						}
						if (local658 == 1 && !super.aBoolean61) {
							Static141.method1946(arg1, arg2, 1, local34.anInt5266, local34.anInt5272, arg6);
						}
					} else if (arg9 == 1) {
						if (Static494.aBoolean666 && local34.aBoolean411) {
							local129.a(arg2, arg6 + 1, 50);
							local129.a(arg2 + 1, arg6 - -1, 50);
						}
						if (local658 == 1 && !super.aBoolean61) {
							Static141.method1946(arg1, arg2, 2, local34.anInt5266, -local34.anInt5272, arg6 + 1);
						}
					} else if (arg9 == 2) {
						if (Static494.aBoolean666 && local34.aBoolean411) {
							local129.a(arg2 + 1, arg6, 50);
							local129.a(arg2 + 1, arg6 + 1, 50);
						}
						if (local658 == 1 && !super.aBoolean61) {
							Static141.method1946(arg1, arg2 + 1, 1, local34.anInt5266, -local34.anInt5272, arg6);
						}
					} else if (arg9 == 3) {
						if (Static494.aBoolean666 && local34.aBoolean411) {
							local129.a(arg2, arg6, 50);
							local129.a(arg2 + 1, arg6, 50);
						}
						if (local658 == 1 && !super.aBoolean61) {
							Static141.method1946(arg1, arg2, 2, local34.anInt5266, local34.anInt5272, arg6);
						}
					}
					if (local34.anInt5290 != 0 && arg7 != null) {
						arg7.method7597(arg2, arg3, !local34.aBoolean407, local34.aBoolean409, arg9, arg6);
					}
					if (local34.anInt5286 != 64) {
						Static280.method4040(arg1, arg2, arg6, local34.anInt5286);
					}
				} else {
					@Pc(965) Class12_Sub2_Sub5_Sub2 local965;
					@Pc(947) Class12_Sub2_Sub5 local947;
					if (arg3 == 1) {
						if (local229) {
							local965 = new Class12_Sub2_Sub5_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg3, arg9, local187);
							if (local965.method7092()) {
								local965.method7090(arg0);
							}
							local947 = local965;
						} else {
							local947 = new Class12_Sub2_Sub5_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg3, arg9, arg5);
						}
						Static40.method689(arg1, arg2, arg6, local947, null);
						if (local34.aBoolean411 && Static494.aBoolean666) {
							if (arg9 == 0) {
								local129.a(arg2, arg6 + 1, 50);
							} else if (arg9 == 1) {
								local129.a(arg2 + 1, arg6 + 1, 50);
							} else if (arg9 == 2) {
								local129.a(arg2 + 1, arg6, 50);
							} else if (arg9 == 3) {
								local129.a(arg2, arg6, 50);
							}
						}
						if (local34.anInt5290 != 0 && arg7 != null) {
							arg7.method7597(arg2, arg3, !local34.aBoolean407, local34.aBoolean409, arg9, arg6);
						}
					} else if (arg3 == 2) {
						local376 = arg9 + 1 & 0x3;
						if (local229) {
							@Pc(1125) Class12_Sub2_Sub5_Sub2 local1125 = new Class12_Sub2_Sub5_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg3, arg9 + 4, local187);
							@Pc(1141) Class12_Sub2_Sub5_Sub2 local1141 = new Class12_Sub2_Sub5_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg3, local376, local187);
							if (local1125.method7092()) {
								local1125.method7090(arg0);
							}
							local947 = local1125;
							if (local1141.method7092()) {
								local1141.method7090(arg0);
							}
							local694 = local1141;
						} else {
							local947 = new Class12_Sub2_Sub5_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg3, arg9 + 4, arg5);
							local694 = new Class12_Sub2_Sub5_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg3, local376, arg5);
						}
						Static40.method689(arg1, arg2, arg6, local947, local694);
						if ((local34.anInt5271 == 1 || Static520.aBoolean702 && local34.anInt5271 == -1) && !super.aBoolean61) {
							if (arg9 == 0) {
								Static141.method1946(arg1, arg2, 1, local34.anInt5266, local34.anInt5272, arg6);
								Static141.method1946(arg1, arg2, 2, local34.anInt5266, local34.anInt5272, arg6 + 1);
							} else if (arg9 == 1) {
								Static141.method1946(arg1, arg2 + 1, 1, local34.anInt5266, local34.anInt5272, arg6);
								Static141.method1946(arg1, arg2, 2, local34.anInt5266, local34.anInt5272, arg6 + 1);
							} else if (arg9 == 2) {
								Static141.method1946(arg1, arg2 + 1, 1, local34.anInt5266, local34.anInt5272, arg6);
								Static141.method1946(arg1, arg2, 2, local34.anInt5266, local34.anInt5272, arg6);
							} else if (arg9 == 3) {
								Static141.method1946(arg1, arg2, 1, local34.anInt5266, local34.anInt5272, arg6);
								Static141.method1946(arg1, arg2, 2, local34.anInt5266, local34.anInt5272, arg6);
							}
						}
						if (local34.anInt5290 != 0 && arg7 != null) {
							arg7.method7597(arg2, arg3, !local34.aBoolean407, local34.aBoolean409, arg9, arg6);
						}
						if (local34.anInt5286 != 64) {
							Static280.method4040(arg1, arg2, arg6, local34.anInt5286);
						}
					} else if (arg3 == 3) {
						if (local229) {
							local965 = new Class12_Sub2_Sub5_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg3, arg9, local187);
							local947 = local965;
							if (local965.method7092()) {
								local965.method7090(arg0);
							}
						} else {
							local947 = new Class12_Sub2_Sub5_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg3, arg9, arg5);
						}
						Static40.method689(arg1, arg2, arg6, local947, null);
						if (local34.aBoolean411 && Static494.aBoolean666) {
							if (arg9 == 0) {
								local129.a(arg2, arg6 + 1, 50);
							} else if (arg9 == 1) {
								local129.a(arg2 + 1, arg6 - -1, 50);
							} else if (arg9 == 2) {
								local129.a(arg2 + 1, arg6, 50);
							} else if (arg9 == 3) {
								local129.a(arg2, arg6, 50);
							}
						}
						if (local34.anInt5290 != 0 && arg7 != null) {
							arg7.method7597(arg2, arg3, !local34.aBoolean407, local34.aBoolean409, arg9, arg6);
						}
					} else if (arg3 == 9) {
						if (local229) {
							local344 = new Class12_Sub2_Sub1_Sub3(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg2, arg2, arg6, arg6, arg3, arg9, local187);
							if (local344.method7092()) {
								local344.method7090(arg0);
							}
							local374 = local344;
						} else {
							local374 = new Class12_Sub2_Sub1_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg2, arg2 + local53 - 1, arg6, local56 + arg6 - 1, arg3, arg9, arg5);
						}
						Static526.method7745(local374, false);
						if (local34.anInt5290 != 0 && arg7 != null) {
							arg7.method7604(!local34.aBoolean407, arg6, local53, arg2, local56, local34.aBoolean409);
						}
						if (local34.anInt5286 != 64) {
							Static280.method4040(arg1, arg2, arg6, local34.anInt5286);
						}
					} else {
						@Pc(1582) Class12_Sub2_Sub4 local1582;
						if (arg3 == 4) {
							if (local229) {
								@Pc(1601) Class12_Sub2_Sub4_Sub2 local1601 = new Class12_Sub2_Sub4_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, 0, 0, arg3, arg9);
								if (local1601.method7092()) {
									local1601.method7090(arg0);
								}
								local1582 = local1601;
							} else {
								local1582 = new Class12_Sub2_Sub4_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, 0, 0, arg3, arg9, arg5);
							}
							Static30.method395(arg1, arg2, arg6, local1582, null);
						} else {
							@Pc(1625) int local1625;
							@Pc(1631) Interface14 local1631;
							@Pc(1670) Class12_Sub2_Sub4_Sub2 local1670;
							if (arg3 == 5) {
								local1625 = 65;
								local1631 = (Interface14) Static389.method5373(arg1, arg2, arg6);
								if (local1631 != null) {
									local1625 = Static362.aClass290_2.method5799(local1631.method7094()).anInt5286 + 1;
								}
								if (local229) {
									local1670 = new Class12_Sub2_Sub4_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, Static42.anIntArray93[arg9] * local1625, local1625 * Static583.anIntArray612[arg9], arg3, arg9);
									if (local1670.method7092()) {
										local1670.method7090(arg0);
									}
									local1582 = local1670;
								} else {
									local1582 = new Class12_Sub2_Sub4_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, Static42.anIntArray93[arg9] * local1625, local1625 * Static583.anIntArray612[arg9], arg3, arg9, arg5);
								}
								Static30.method395(arg1, arg2, arg6, local1582, null);
							} else if (arg3 == 6) {
								local1625 = 33;
								local1631 = (Interface14) Static389.method5373(arg1, arg2, arg6);
								if (local1631 != null) {
									local1625 = Static362.aClass290_2.method5799(local1631.method7094()).anInt5286 / 2 + 1;
								}
								if (local229) {
									local1670 = new Class12_Sub2_Sub4_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, local1625 * Static42.anIntArray93[arg9], Static583.anIntArray612[arg9] * local1625, arg3, arg9 + 4);
									if (local1670.method7092()) {
										local1670.method7090(arg0);
									}
									local1582 = local1670;
								} else {
									local1582 = new Class12_Sub2_Sub4_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, local1625 * Static401.anIntArray420[arg9], Static222.anIntArray268[arg9] * local1625, arg3, arg9 + 4, arg5);
								}
								Static30.method395(arg1, arg2, arg6, local1582, null);
							} else if (arg3 == 7) {
								local1625 = arg9 + 2 & 0x3;
								if (local229) {
									@Pc(1848) Class12_Sub2_Sub4_Sub2 local1848 = new Class12_Sub2_Sub4_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, 0, 0, arg3, local1625 + 4);
									if (local1848.method7092()) {
										local1848.method7090(arg0);
									}
									local1582 = local1848;
								} else {
									local1582 = new Class12_Sub2_Sub4_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, 0, 0, arg3, local1625 + 4, arg5);
								}
								Static30.method395(arg1, arg2, arg6, local1582, null);
							} else if (arg3 == 8) {
								local376 = arg9 + 2 & 0x3;
								local442 = 33;
								@Pc(1906) Interface14 local1906 = (Interface14) Static389.method5373(arg1, arg2, arg6);
								if (local1906 != null) {
									local442 = Static362.aClass290_2.method5799(local1906.method7094()).anInt5286 / 2 + 1;
								}
								@Pc(1949) Class12_Sub2_Sub4 local1949;
								@Pc(1968) Class12_Sub2_Sub4 local1968;
								if (local229) {
									local1949 = new Class12_Sub2_Sub4_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, local442 * Static401.anIntArray420[arg9], Static222.anIntArray268[arg9] * local442, arg3, arg9 + 4);
									local1968 = new Class12_Sub2_Sub4_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, 0, 0, arg3, local376 + 4);
									if (local1949.method7092()) {
										local1949.method7090(arg0);
									}
									if (local1968.method7092()) {
										local1968.method7090(arg0);
									}
								} else {
									local1949 = new Class12_Sub2_Sub4_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, Static401.anIntArray420[arg9] * local442, Static222.anIntArray268[arg9] * local442, arg3, arg9 + 4, arg5);
									local1968 = new Class12_Sub2_Sub4_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, 0, 0, arg3, local376 + 4, arg5);
								}
								Static30.method395(arg1, arg2, arg6, local1949, local1968);
							}
						}
					}
				}
			}
		} else if (Static257.aClass2_Sub35_Sub1_1.aBoolean630 || local34.anInt5275 != 0 || local34.anInt5290 == 1 || local34.aBoolean403) {
			@Pc(290) Class12_Sub2_Sub2 local290;
			if (local229) {
				@Pc(288) Class12_Sub2_Sub2_Sub1 local288 = new Class12_Sub2_Sub2_Sub1(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg9, local187);
				local290 = local288;
				if (local288.method7092()) {
					local288.method7090(arg0);
				}
			} else {
				local290 = new Class12_Sub2_Sub2_Sub2(arg0, local34, arg1, arg4, local167, local158, local175, super.aBoolean61, arg9, arg5);
			}
			Static379.method5276(arg1, arg2, arg6, local290);
			if (local34.anInt5290 == 1 && arg7 != null) {
				arg7.method7601(arg2, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!cea", name = "a", descriptor = "(I[ILclient!gk;ILclient!r;IIIIII)V")
	public void method1065(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) Class2_Sub7 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class162 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean61) {
			return;
		}
		if (arg1 != null) {
			arg1[0] = -1;
		}
		@Pc(24) Class75 local24 = null;
		@Pc(30) int local30 = (arg8 & 0x7) * 8;
		@Pc(36) int local36 = (arg6 & 0x7) * 8;
		while (true) {
			while (true) {
				while (true) {
					@Pc(41) int local41;
					@Pc(86) int local86;
					@Pc(427) int local427;
					@Pc(104) int local104;
					while (arg2.aByteArray52.length > arg2.anInt5186) {
						local41 = arg2.method4464();
						if (local41 == 0) {
							local24 = new Class75(arg2);
						} else {
							@Pc(110) int local110;
							@Pc(165) int local165;
							@Pc(252) int local252;
							@Pc(290) int local290;
							if (local41 == 1) {
								local86 = arg2.method4464();
								if (local86 > 0) {
									for (local427 = 0; local427 < local86; local427++) {
										@Pc(436) Class141 local436 = new Class141(arg4, arg2, 2);
										if (local436.anInt2905 == 31) {
											@Pc(449) Class60 local449 = Static304.aClass304_1.method6145(arg2.method4518());
											local436.method2500(local449.anInt1290, local449.anInt1287, local449.anInt1288, local449.anInt1285);
										}
										if (arg4.method6851() > 0) {
											@Pc(466) Class2_Sub11 local466 = local436.aClass2_Sub11_1;
											local110 = local466.method7276() >> 9;
											local165 = local466.method7271() >> 9;
											if (arg9 == local436.anInt2907 && local30 <= local110 && local110 < local30 + 8 && local36 <= local165 && local165 < local36 + 8) {
												local252 = (arg7 << 9) + Static268.method3727(local466.method7271() & 0xFFF, arg5, local466.method7276() & 0xFFF);
												local110 = local252 >> 9;
												local290 = Static242.method3443(arg5, local466.method7276() & 0xFFF, local466.method7271() & 0xFFF) + (arg3 << 9);
												local165 = local290 >> 9;
												if (local110 >= 0 && local165 >= 0 && local110 < super.anInt1106 && local165 < super.anInt1100) {
													local466.method7278(super.anIntArrayArrayArray3[arg9][local110][local165] - local466.method7270(), local290, local252);
													Static82.method1253(local436);
												}
											}
										}
									}
								}
							} else if (local41 == 2) {
								if (local24 == null) {
									local24 = new Class75();
								}
								local24.method1455(arg2);
							} else if (local41 != 128) {
								if (local41 != 129) {
									throw new IllegalStateException("");
								}
								if (super.aByteArrayArrayArray11 == null) {
									super.aByteArrayArrayArray11 = new byte[4][][];
								}
								for (local86 = 0; local86 < 4; local86++) {
									@Pc(92) byte local92 = arg2.method4477();
									@Pc(108) int local108;
									if (local92 == 0 && super.aByteArrayArrayArray11[arg0] != null) {
										if (arg9 >= local86) {
											local104 = arg7;
											local108 = arg7 + 7;
											local110 = arg3;
											if (arg3 < 0) {
												local110 = 0;
											} else if (arg3 >= super.anInt1100) {
												local110 = super.anInt1100;
											}
											if (local108 < 0) {
												local108 = 0;
											} else if (local108 >= super.anInt1106) {
												local108 = super.anInt1106;
											}
											if (arg7 < 0) {
												local104 = 0;
											} else if (super.anInt1106 <= arg7) {
												local104 = super.anInt1106;
											}
											local165 = arg3 + 7;
											if (local165 < 0) {
												local165 = 0;
											} else if (super.anInt1100 <= local165) {
												local165 = super.anInt1100;
											}
											while (local104 < local108) {
												while (local110 < local165) {
													super.aByteArrayArrayArray11[arg0][local104][local110] = 0;
													local110++;
												}
												local104++;
											}
										}
									} else if (local92 == 1) {
										if (super.aByteArrayArrayArray11[arg0] == null) {
											super.aByteArrayArrayArray11[arg0] = new byte[super.anInt1106 + 1][super.anInt1100 + 1];
										}
										for (local104 = 0; local104 < 64; local104 += 4) {
											for (local108 = 0; local108 < 64; local108 += 4) {
												@Pc(239) byte local239 = arg2.method4477();
												if (local86 <= arg9) {
													for (local165 = local104; local165 < local104 + 4; local165++) {
														for (local252 = local108; local252 < local108 + 4; local252++) {
															if (local165 >= local30 && local30 + 8 > local165 && local252 >= local36 && local36 + 8 > local36) {
																local290 = Static278.method3511(local165 & 0x7, arg5, local252 & 0x7) + arg7;
																@Pc(303) int local303 = arg3 + Static136.method1876(local165 & 0x7, arg5, local252 & 0x7);
																if (local290 >= 0 && local290 < super.anInt1106 && local303 >= 0 && local303 < super.anInt1100) {
																	super.aByteArrayArrayArray11[arg0][local290][local303] = local239;
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
								arg2.anInt5186 += 10;
							} else {
								arg1[0] = arg2.method4518();
								arg1[1] = arg2.method4478();
								arg1[2] = arg2.method4478();
								arg1[3] = arg2.method4478();
								arg1[4] = arg2.method4518();
							}
						}
					}
					if (local24 != null) {
						Static17.method4058(arg7 >> 3, arg3 >> 3, local24);
					}
					if (super.aByteArrayArrayArray11 != null && super.aByteArrayArrayArray11[arg0] != null) {
						local41 = arg7 + 7;
						local86 = arg3 + 7;
						for (local427 = arg7; local427 < local41; local427++) {
							for (local104 = arg3; local104 < local86; local104++) {
								super.aByteArrayArrayArray11[arg0][local427][local104] = 0;
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
