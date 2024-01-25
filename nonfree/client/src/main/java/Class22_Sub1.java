import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qq")
public final class Class22_Sub1 extends Class22 {

	@OriginalMember(owner = "client!qq", name = "O", descriptor = "I")
	public int anInt5780 = 99;

	static {
		new Class174("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(IIIZ)V")
	public Class22_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static301.aClass237_5, Static178.aClass231_4);
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!qa;B[B[Lclient!kg;I)V")
	public void method4791(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) Class128[] arg3, @OriginalArg(5) int arg4) {
		@Pc(16) Class3_Sub25 local16 = new Class3_Sub25(arg2);
		@Pc(18) int local18 = -1;
		while (true) {
			@Pc(22) int local22 = local16.method4072();
			if (local22 == 0) {
				return;
			}
			local18 += local22;
			@Pc(33) int local33 = 0;
			while (true) {
				@Pc(37) int local37 = local16.method4086();
				if (local37 == 0) {
					break;
				}
				local33 += local37 - 1;
				@Pc(52) int local52 = local33 & 0x3F;
				@Pc(58) int local58 = local33 >> 6 & 0x3F;
				@Pc(62) int local62 = local33 >> 12;
				@Pc(66) int local66 = local16.method4096();
				@Pc(70) int local70 = local66 >> 2;
				@Pc(74) int local74 = local66 & 0x3;
				@Pc(78) int local78 = local58 + arg0;
				@Pc(83) int local83 = local52 + arg4;
				if (local78 > 0 && local83 > 0 && super.anInt5756 - 1 > local78 && local83 < super.anInt5758 - 1) {
					@Pc(115) Class128 local115 = null;
					if (!super.aBoolean407) {
						@Pc(120) int local120 = local62;
						if ((Static360.aByteArrayArrayArray16[1][local78][local83] & 0x2) == 2) {
							local120 = local62 - 1;
						}
						if (local120 >= 0) {
							local115 = arg3[local120];
						}
					}
					this.method4794(-1, local83, local62, arg1, local74, local62, local18, local115, local70, local78);
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[IILclient!nj;Lclient!qa;B)V")
	public void method4793(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class3_Sub25 arg3, @OriginalArg(4) Class167 arg4) {
		if (super.aBoolean407) {
			return;
		}
		@Pc(11) boolean local11 = false;
		@Pc(13) Class57 local13 = null;
		if (arg1 != null) {
			arg1[0] = -1;
		}
		while (true) {
			@Pc(24) int local24;
			@Pc(77) int local77;
			@Pc(95) int local95;
			@Pc(99) int local99;
			@Pc(484) int local484;
			while (arg3.anInt4974 < arg3.aByteArray88.length) {
				local24 = arg3.method4096();
				if (local24 == 0) {
					local13 = new Class57(arg3);
				} else {
					@Pc(101) int local101;
					@Pc(122) int local122;
					@Pc(235) int local235;
					if (local24 == 1) {
						local77 = arg3.method4096();
						if (local77 > 0) {
							for (local484 = 0; local484 < local77; local484++) {
								@Pc(493) Class226 local493 = new Class226(arg4, arg3, 0);
								if (local493.anInt6364 == 31) {
									@Pc(504) Class228 local504 = Static84.aClass87_3.method2045(arg3.method4083());
									local493.method5244(local504.anInt6422, local504.anInt6424, local504.anInt6420, local504.anInt6423);
								}
								if (arg4.method5986() > 0) {
									@Pc(526) Class3_Sub7 local526 = local493.aClass3_Sub7_2;
									local101 = local526.method2483() + (arg2 << 7);
									local122 = (arg0 << 7) + local526.method2481();
									local235 = local101 >> 7;
									@Pc(552) int local552 = local122 >> 7;
									if (local235 >= 0 && local552 >= 0 && local235 < super.anInt5756 && super.anInt5758 > local552) {
										local526.method2485(local101, local122, super.anIntArrayArrayArray11[local493.anInt6363][local235][local552] - local526.method2476());
										Static197.method3055(local493);
									}
								}
							}
						}
					} else if (local24 == 2) {
						if (local13 == null) {
							local13 = new Class57();
						}
						local13.method1540(arg3);
					} else if (local24 != 128) {
						if (local24 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray14 == null) {
							super.aByteArrayArrayArray14 = new byte[4][][];
						}
						local11 = true;
						for (local77 = 0; local77 < 4; local77++) {
							@Pc(83) byte local83 = arg3.method4097();
							if (local83 == 0 && super.aByteArrayArrayArray14[local77] != null) {
								local95 = arg2;
								local99 = arg2 + 64;
								local101 = arg0;
								if (local99 < 0) {
									local99 = 0;
								} else if (super.anInt5756 <= local99) {
									local99 = super.anInt5756;
								}
								local122 = arg0 + 64;
								if (arg0 < 0) {
									local101 = 0;
								} else if (super.anInt5758 <= arg0) {
									local101 = super.anInt5758;
								}
								if (arg2 < 0) {
									local95 = 0;
								} else if (arg2 >= super.anInt5756) {
									local95 = super.anInt5756;
								}
								if (local122 < 0) {
									local122 = 0;
								} else if (super.anInt5758 <= local122) {
									local122 = super.anInt5758;
								}
								while (local95 < local99) {
									while (local101 < local122) {
										super.aByteArrayArrayArray14[local77][local95][local101] = 0;
										local101++;
									}
									local95++;
								}
							} else if (local83 == 1) {
								if (super.aByteArrayArrayArray14[local77] == null) {
									super.aByteArrayArrayArray14[local77] = new byte[super.anInt5756 + 1][super.anInt5758 + 1];
								}
								for (local95 = 0; local95 < 64; local95 += 4) {
									for (local99 = 0; local99 < 64; local99 += 4) {
										@Pc(225) byte local225 = arg3.method4097();
										for (local122 = local95 + arg2; local122 < arg2 + local95 + 4; local122++) {
											for (local235 = arg0 + local99; local235 < local99 + arg0 + 4; local235++) {
												if (local122 >= 0 && super.anInt5756 > local122 && local235 >= 0 && super.anInt5758 > local235) {
													super.aByteArrayArrayArray14[local77][local122][local235] = local225;
												}
											}
										}
									}
								}
							} else if (local83 == 2) {
								if (super.aByteArrayArrayArray14[local77] == null) {
									super.aByteArrayArrayArray14[local77] = new byte[super.anInt5756 + 1][super.anInt5758 + 1];
								}
								if (local77 > 0) {
									local95 = arg2;
									local99 = arg2 + 64;
									local101 = arg0;
									if (arg0 < 0) {
										local101 = 0;
									} else if (super.anInt5758 <= arg0) {
										local101 = super.anInt5758;
									}
									if (arg2 < 0) {
										local95 = 0;
									} else if (arg2 >= super.anInt5756) {
										local95 = super.anInt5756;
									}
									if (local99 < 0) {
										local99 = 0;
									} else if (local99 >= super.anInt5756) {
										local99 = super.anInt5756;
									}
									local122 = arg0 + 64;
									if (local122 < 0) {
										local122 = 0;
									} else if (local122 >= super.anInt5758) {
										local122 = super.anInt5758;
									}
									while (local99 > local95) {
										while (local122 > local101) {
											super.aByteArrayArrayArray14[local77][local95][local101] = super.aByteArrayArrayArray14[local77 - 1][local95][local101];
											local101++;
										}
										local95++;
									}
								}
							}
						}
					} else if (arg1 == null) {
						arg3.anInt4974 += 10;
					} else {
						arg1[0] = arg3.method4083();
						arg1[1] = arg3.method4065();
						arg1[2] = arg3.method4065();
						arg1[3] = arg3.method4065();
						arg1[4] = arg3.method4083();
					}
				}
			}
			if (local13 != null) {
				for (local24 = 0; local24 < 8; local24++) {
					for (local77 = 0; local77 < 8; local77++) {
						local484 = (arg2 >> 3) + local24;
						local95 = local77 + (arg0 >> 3);
						if (local484 >= 0 && super.anInt5756 >> 3 > local484 && local95 >= 0 && local95 < super.anInt5758 >> 3) {
							Static253.method3565(local13, local484, local95);
						}
					}
				}
			}
			if (!local11 && super.aByteArrayArrayArray14 != null) {
				for (local24 = 0; local24 < 4; local24++) {
					if (super.aByteArrayArrayArray14[local24] != null) {
						for (local77 = 0; local77 < 16; local77++) {
							for (local484 = 0; local484 < 16; local484++) {
								local95 = (arg2 >> 2) + local77;
								local99 = (arg0 >> 2) + local484;
								if (local95 >= 0 && local95 < 26 && local99 >= 0 && local99 < 26) {
									super.aByteArrayArrayArray14[local24][local95][local99] = 0;
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

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIIILclient!qa;IIILclient!kg;II)V")
	public void method4794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class167 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class128 arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static39.aClass79_Sub1_1.method1948(Static402.anInt6656) && !Static58.method1107(arg1, Static436.anInt7298, arg9, arg5)) {
			return;
		}
		if (this.anInt5780 > arg2) {
			this.anInt5780 = arg2;
		}
		@Pc(30) Class31 local30 = Static9.aClass149_1.method3573(arg6);
		if (arg3.method5990() && Static39.aClass79_Sub1_1.aBoolean161 && local30.aBoolean50) {
			return;
		}
		@Pc(51) int local51;
		@Pc(54) int local54;
		if (arg4 == 1 || arg4 == 3) {
			local51 = local30.anInt784;
			local54 = local30.anInt786;
		} else {
			local54 = local30.anInt784;
			local51 = local30.anInt786;
		}
		@Pc(78) int local78;
		@Pc(76) int local76;
		if (arg9 + local51 > super.anInt5756) {
			local76 = arg9 + 1;
			local78 = arg9;
		} else {
			local76 = (local51 + 1 >> 1) + arg9;
			local78 = arg9 + (local51 >> 1);
		}
		@Pc(116) int local116;
		@Pc(110) int local110;
		if (local54 + arg1 <= super.anInt5758) {
			local110 = arg1 + (local54 + 1 >> 1);
			local116 = (local54 >> 1) + arg1;
		} else {
			local110 = arg1 + 1;
			local116 = arg1;
		}
		@Pc(128) Class55 local128 = Static178.aClass55Array1[arg5];
		@Pc(153) int local153 = local128.oa(local78, local116) + local128.oa(local76, local116) + local128.oa(local78, local110) + local128.oa(local76, local110) >> 2;
		@Pc(162) int local162 = (arg9 << 7) + (local51 << 6);
		@Pc(170) int local170 = (arg1 << 7) + (local54 << 6);
		@Pc(182) boolean local182 = Static95.aBoolean108 && !super.aBoolean407 && local30.aBoolean49;
		if (local30.method871()) {
			Static331.method5981(arg4, arg1, null, arg2, local30, arg9, null);
		}
		@Pc(219) boolean local219 = arg0 == -1 && local30.anInt780 == -1 && local30.anIntArray45 == null && local30.anIntArray44 == null && !local30.aBoolean51;
		if (Static260.aBoolean426 && (Static180.method2862(arg8) && local30.anInt800 != 1 || !(!Static353.method6074(arg8) || local30.anInt800 != 0))) {
			return;
		}
		if (arg8 != 22) {
			@Pc(388) Class1_Sub2 local388;
			@Pc(349) Class1_Sub2_Sub2 local349;
			@Pc(386) int local386;
			if (arg8 == 10 || arg8 == 11) {
				local349 = null;
				if (local219) {
					@Pc(380) Class1_Sub2_Sub2 local380 = new Class1_Sub2_Sub2(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg9, arg9 + local51 - 1, arg1, local54 + arg1 - 1, arg8, arg4, local182);
					local386 = local380.method1529();
					local388 = local380;
					local349 = local380;
				} else {
					local388 = new Class1_Sub2_Sub3(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg9, local51 + arg9 - 1, arg1, arg1 + local54 - 1, arg8, arg4, arg0);
					local386 = 15;
				}
				@Pc(435) Class1_Sub2 local435 = Static313.method4388(arg2, arg9, arg1, jt.class);
				@Pc(437) boolean local437 = false;
				if (local435 instanceof Class1_Sub2_Sub4 && arg9 == local435.aShort108 && arg1 == local435.aShort107) {
					((Class1_Sub2_Sub4) local435).aClass1_Sub2_2 = local388;
					local437 = true;
				}
				if (local437 || Static114.method1845(local388, false)) {
					if (local349 != null && local349.method6260()) {
						local349.method6259(arg3);
					}
					if (local30.aBoolean48 && Static95.aBoolean108) {
						if (local386 > 30) {
							local386 = 30;
						}
						for (@Pc(492) int local492 = 0; local492 <= local51; local492++) {
							for (@Pc(496) int local496 = 0; local496 <= local54; local496++) {
								local128.m(local492 + arg9, local496 + arg1, local386);
							}
						}
					}
				}
				if (local30.anInt776 != 0 && arg7 != null) {
					arg7.method3193(!local30.aBoolean44, local51, local54, arg9, local30.aBoolean52, arg1);
				}
			} else {
				@Pc(647) Class1_Sub2 local647;
				if (arg8 >= 12 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
					if (local219) {
						local349 = new Class1_Sub2_Sub2(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg9, arg9 + local51 - 1, arg1, arg1 + local54 - 1, arg8, arg4, local182);
						if (local349.method6260()) {
							local349.method6259(arg3);
						}
						local388 = local349;
					} else {
						local388 = new Class1_Sub2_Sub3(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg9, arg9 + local51 - 1, arg1, local54 + arg1 - 1, arg8, arg4, arg0);
					}
					local647 = Static313.method4388(arg2, arg9, arg1, jt.class);
					if (local647 instanceof Class1_Sub2_Sub4 && arg9 == local647.aShort108 && local647.aShort107 == arg1) {
						((Class1_Sub2_Sub4) local647).aClass1_Sub2_2 = local388;
					} else {
						Static114.method1845(local388, false);
					}
					if (Static95.aBoolean108 && !super.aBoolean407 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg2 > 0 && local30.anInt800 != 0) {
						super.aByteArrayArrayArray15[arg2][arg9][arg1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9][arg1] | 0x4);
					}
					if (local30.anInt776 != 0 && arg7 != null) {
						arg7.method3193(!local30.aBoolean44, local51, local54, arg9, local30.aBoolean52, arg1);
					}
				} else {
					@Pc(773) Class1_Sub3 local773;
					if (arg8 == 0) {
						@Pc(746) int local746 = local30.anInt800;
						if (Static301.aBoolean378 && local30.anInt800 == -1) {
							local746 = 1;
						}
						if (local219) {
							@Pc(771) Class1_Sub3_Sub3 local771 = new Class1_Sub3_Sub3(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, arg8, arg4, local182);
							local773 = local771;
							if (local771.method6260()) {
								local771.method6259(arg3);
							}
						} else {
							local773 = new Class1_Sub3_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg8, arg4, arg0);
						}
						@Pc(806) Class1_Sub3 local806 = Static392.method5427(arg2, arg9, arg1);
						if (local806 instanceof Class1_Sub3_Sub2) {
							((Class1_Sub3_Sub2) local806).aClass1_Sub3_1 = local773;
						} else {
							Static389.method2922(arg2, arg9, arg1, local773, null);
						}
						if (Static95.aBoolean108) {
							if (arg4 == 0) {
								if (local30.aBoolean48) {
									local128.m(arg9, arg1, 50);
									local128.m(arg9, arg1 + 1, 50);
								}
								if (local746 == 1 && !super.aBoolean407) {
									super.aByteArrayArrayArray15[arg2][arg9][arg1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9][arg1] | 0x1);
								}
							} else if (arg4 == 1) {
								if (local30.aBoolean48) {
									local128.m(arg9, arg1 + 1, 50);
									local128.m(arg9 + 1, arg1 + 1, 50);
								}
								if (local746 == 1 && !super.aBoolean407) {
									super.aByteArrayArrayArray15[arg2][arg9][arg1 + 1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9][arg1 + 1] | 0x2);
								}
							} else if (arg4 == 2) {
								if (local30.aBoolean48) {
									local128.m(arg9 + 1, arg1, 50);
									local128.m(arg9 + 1, arg1 - -1, 50);
								}
								if (local746 == 1 && !super.aBoolean407) {
									super.aByteArrayArrayArray15[arg2][arg9 + 1][arg1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9 + 1][arg1] | 0x1);
								}
							} else if (arg4 == 3) {
								if (local30.aBoolean48) {
									local128.m(arg9, arg1, 50);
									local128.m(arg9 + 1, arg1, 50);
								}
								if (local746 == 1 && !super.aBoolean407) {
									super.aByteArrayArrayArray15[arg2][arg9][arg1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9][arg1] | 0x2);
								}
							}
						}
						if (local30.anInt776 != 0 && arg7 != null) {
							arg7.method3179(arg4, arg1, local30.aBoolean52, arg9, arg8, !local30.aBoolean44);
						}
						if (local30.anInt810 != 16) {
							Static109.method1804(arg2, arg9, arg1, local30.anInt810);
						}
					} else {
						@Pc(1097) Class1_Sub3_Sub3 local1097;
						@Pc(1080) Class1_Sub3 local1080;
						if (arg8 == 1) {
							if (local219) {
								local1097 = new Class1_Sub3_Sub3(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, arg8, arg4, local182);
								if (local1097.method6260()) {
									local1097.method6259(arg3);
								}
								local1080 = local1097;
							} else {
								local1080 = new Class1_Sub3_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg8, arg4, arg0);
							}
							local773 = Static392.method5427(arg2, arg9, arg1);
							if (local773 instanceof Class1_Sub3_Sub2) {
								((Class1_Sub3_Sub2) local773).aClass1_Sub3_1 = local1080;
							} else {
								Static389.method2922(arg2, arg9, arg1, local1080, null);
							}
							if (local30.aBoolean48 && Static95.aBoolean108) {
								if (arg4 == 0) {
									local128.m(arg9, arg1 + 1, 50);
								} else if (arg4 == 1) {
									local128.m(arg9 + 1, arg1 + 1, 50);
								} else if (arg4 == 2) {
									local128.m(arg9 + 1, arg1, 50);
								} else if (arg4 == 3) {
									local128.m(arg9, arg1, 50);
								}
							}
							if (local30.anInt776 != 0 && arg7 != null) {
								arg7.method3179(arg4, arg1, local30.aBoolean52, arg9, arg8, !local30.aBoolean44);
							}
						} else if (arg8 == 2) {
							local386 = arg4 + 1 & 0x3;
							if (local219) {
								@Pc(1233) Class1_Sub3_Sub3 local1233 = new Class1_Sub3_Sub3(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, arg8, arg4 + 4, local182);
								@Pc(1248) Class1_Sub3_Sub3 local1248 = new Class1_Sub3_Sub3(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, arg8, local386, local182);
								if (local1233.method6260()) {
									local1233.method6259(arg3);
								}
								local773 = local1248;
								local1080 = local1233;
								if (local1248.method6260()) {
									local1248.method6259(arg3);
								}
							} else {
								local1080 = new Class1_Sub3_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg8, arg4 + 4, arg0);
								local773 = new Class1_Sub3_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg8, local386, arg0);
							}
							Static389.method2922(arg2, arg9, arg1, local1080, local773);
							if (local30.anInt800 == 1 && Static95.aBoolean108 && !super.aBoolean407) {
								if (arg4 == 0) {
									super.aByteArrayArrayArray15[arg2][arg9][arg1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9][arg1] | 0x1);
									super.aByteArrayArrayArray15[arg2][arg9][arg1 + 1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9][arg1 + 1] | 0x2);
								} else if (arg4 == 1) {
									super.aByteArrayArrayArray15[arg2][arg9][arg1 + 1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9][arg1 + 1] | 0x2);
									super.aByteArrayArrayArray15[arg2][arg9 + 1][arg1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9 + 1][arg1] | 0x1);
								} else if (arg4 == 2) {
									super.aByteArrayArrayArray15[arg2][arg9 + 1][arg1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9 + 1][arg1] | 0x1);
									super.aByteArrayArrayArray15[arg2][arg9][arg1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9][arg1] | 0x2);
								} else if (arg4 == 3) {
									super.aByteArrayArrayArray15[arg2][arg9][arg1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9][arg1] | 0x2);
									super.aByteArrayArrayArray15[arg2][arg9][arg1] = (byte) (super.aByteArrayArrayArray15[arg2][arg9][arg1] | 0x1);
								}
							}
							if (local30.anInt776 != 0 && arg7 != null) {
								arg7.method3179(arg4, arg1, local30.aBoolean52, arg9, arg8, !local30.aBoolean44);
							}
							if (local30.anInt810 != 16) {
								Static109.method1804(arg2, arg9, arg1, local30.anInt810);
							}
						} else if (arg8 == 3) {
							if (local219) {
								local1097 = new Class1_Sub3_Sub3(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, arg8, arg4, local182);
								if (local1097.method6260()) {
									local1097.method6259(arg3);
								}
								local1080 = local1097;
							} else {
								local1080 = new Class1_Sub3_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg8, arg4, arg0);
							}
							local773 = Static392.method5427(arg2, arg9, arg1);
							if (local773 instanceof Class1_Sub3_Sub2) {
								((Class1_Sub3_Sub2) local773).aClass1_Sub3_1 = local1080;
							} else {
								Static389.method2922(arg2, arg9, arg1, local1080, null);
							}
							if (local30.aBoolean48 && Static95.aBoolean108) {
								if (arg4 == 0) {
									local128.m(arg9, arg1 + 1, 50);
								} else if (arg4 == 1) {
									local128.m(arg9 + 1, arg1 + 1, 50);
								} else if (arg4 == 2) {
									local128.m(arg9 + 1, arg1, 50);
								} else if (arg4 == 3) {
									local128.m(arg9, arg1, 50);
								}
							}
							if (local30.anInt776 != 0 && arg7 != null) {
								arg7.method3179(arg4, arg1, local30.aBoolean52, arg9, arg8, !local30.aBoolean44);
							}
						} else if (arg8 == 9) {
							if (local219) {
								local349 = new Class1_Sub2_Sub2(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg9, arg9, arg1, arg1, arg8, arg4, local182);
								if (local349.method6260()) {
									local349.method6259(arg3);
								}
								local388 = local349;
							} else {
								local388 = new Class1_Sub2_Sub3(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg9, local51 + arg9 - 1, arg1, arg1 + local54 - 1, arg8, arg4, arg0);
							}
							local647 = Static313.method4388(arg2, arg9, arg1, jt.class);
							if (local647 instanceof Class1_Sub2_Sub4 && arg9 == local647.aShort108 && arg1 == local647.aShort107) {
								((Class1_Sub2_Sub4) local647).aClass1_Sub2_2 = local388;
							} else {
								Static114.method1845(local388, false);
							}
							if (local30.anInt776 != 0 && arg7 != null) {
								arg7.method3193(!local30.aBoolean44, local51, local54, arg9, local30.aBoolean52, arg1);
							}
							if (local30.anInt810 != 16) {
								Static109.method1804(arg2, arg9, arg1, local30.anInt810);
							}
						} else {
							@Pc(1849) Class1_Sub1 local1849;
							if (arg8 == 4) {
								if (local219) {
									@Pc(1868) Class1_Sub1_Sub2 local1868 = new Class1_Sub1_Sub2(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, 0, 0, 0, arg8, arg4);
									local1849 = local1868;
									if (local1868.method6260()) {
										local1868.method6259(arg3);
									}
								} else {
									local1849 = new Class1_Sub1_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, 0, 0, 0, arg8, arg4, arg0);
								}
								@Pc(1883) Class1_Sub1 local1883 = Static222.method4446(arg2, arg9, arg1);
								if (local1883 instanceof Class1_Sub1_Sub3) {
									((Class1_Sub1_Sub3) local1883).aClass1_Sub1_3 = local1849;
								} else {
									Static270.method3758(arg2, arg9, arg1, local1849, null);
								}
							} else {
								@Pc(1905) int local1905;
								@Pc(1911) Interface5 local1911;
								@Pc(1979) Class1_Sub1_Sub2 local1979;
								@Pc(1994) Class1_Sub1 local1994;
								if (arg8 == 5) {
									local1905 = 17;
									local1911 = (Interface5) Static392.method5427(arg2, arg9, arg1);
									if (local1911 != null) {
										local1905 = Static9.aClass149_1.method3573(local1911.method6263()).anInt810 + 1;
									}
									if (local219) {
										local1979 = new Class1_Sub1_Sub2(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, 0, Static238.anIntArray265[arg4] * local1905, local1905 * Static132.anIntArray121[arg4], arg8, arg4);
										if (local1979.method6260()) {
											local1979.method6259(arg3);
										}
										local1849 = local1979;
									} else {
										local1849 = new Class1_Sub1_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, 0, local1905 * Static238.anIntArray265[arg4], Static132.anIntArray121[arg4] * local1905, arg8, arg4, arg0);
									}
									local1994 = Static222.method4446(arg2, arg9, arg1);
									if (local1994 instanceof Class1_Sub1_Sub3) {
										((Class1_Sub1_Sub3) local1994).aClass1_Sub1_3 = local1849;
									} else {
										Static270.method3758(arg2, arg9, arg1, local1849, null);
									}
								} else if (arg8 == 6) {
									local1905 = 9;
									local1911 = (Interface5) Static392.method5427(arg2, arg9, arg1);
									if (local1911 != null) {
										local1905 = Static9.aClass149_1.method3573(local1911.method6263()).anInt810 / 2 + 1;
									}
									if (local219) {
										local1979 = new Class1_Sub1_Sub2(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, arg4, Static238.anIntArray265[arg4] * local1905, local1905 * Static132.anIntArray121[arg4], arg8, arg4 + 4);
										local1849 = local1979;
										if (local1979.method6260()) {
											local1979.method6259(arg3);
										}
									} else {
										local1849 = new Class1_Sub1_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg4, Static148.anIntArray139[arg4] * local1905, local1905 * Static114.anIntArray99[arg4], arg8, arg4 + 4, arg0);
									}
									local1994 = Static222.method4446(arg2, arg9, arg1);
									if (local1994 instanceof Class1_Sub1_Sub3) {
										((Class1_Sub1_Sub3) local1994).aClass1_Sub1_3 = local1849;
									} else {
										Static270.method3758(arg2, arg9, arg1, local1849, null);
									}
								} else if (arg8 == 7) {
									local1905 = arg4 + 2 & 0x3;
									if (local219) {
										@Pc(2156) Class1_Sub1_Sub2 local2156 = new Class1_Sub1_Sub2(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, local1905, 0, 0, arg8, local1905 + 4);
										local1849 = local2156;
										if (local2156.method6260()) {
											local2156.method6259(arg3);
										}
									} else {
										local1849 = new Class1_Sub1_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, local1905, 0, 0, arg8, local1905 + 4, arg0);
									}
									@Pc(2194) Class1_Sub1 local2194 = Static222.method4446(arg2, arg9, arg1);
									if (local2194 instanceof Class1_Sub1_Sub3) {
										((Class1_Sub1_Sub3) local2194).aClass1_Sub1_3 = local1849;
									} else {
										Static270.method3758(arg2, arg9, arg1, local1849, null);
									}
								} else if (arg8 == 8) {
									local386 = arg4 + 2 & 0x3;
									@Pc(2220) int local2220 = 9;
									@Pc(2226) Interface5 local2226 = (Interface5) Static392.method5427(arg2, arg9, arg1);
									if (local2226 != null) {
										local2220 = Static9.aClass149_1.method3573(local2226.method6263()).anInt810 / 2 + 1;
									}
									@Pc(2269) Class1_Sub1 local2269;
									@Pc(2288) Class1_Sub1 local2288;
									if (local219) {
										local2269 = new Class1_Sub1_Sub2(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, arg4, local2220 * Static148.anIntArray139[arg4], Static114.anIntArray99[arg4] * local2220, arg8, arg4 + 4);
										local2288 = new Class1_Sub1_Sub2(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, arg4, 0, 0, arg8, local386 + 4);
										if (local2269.method6260()) {
											local2269.method6259(arg3);
										}
										if (local2288.method6260()) {
											local2288.method6259(arg3);
										}
									} else {
										local2269 = new Class1_Sub1_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg4, local2220 * Static148.anIntArray139[arg4], local2220 * Static114.anIntArray99[arg4], arg8, arg4 + 4, arg0);
										local2288 = new Class1_Sub1_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg4, 0, 0, arg8, local386 + 4, arg0);
									}
									Static270.method3758(arg2, arg9, arg1, local2269, local2288);
								}
							}
						}
					}
				}
			}
		} else if (Static39.aClass79_Sub1_1.aBoolean152 || local30.anInt788 != 0 || local30.anInt776 == 1 || local30.aBoolean43) {
			@Pc(281) Class1_Sub4 local281;
			if (local219) {
				@Pc(279) Class1_Sub4_Sub2 local279 = new Class1_Sub4_Sub2(arg3, local30, arg5, local162, local153, local170, super.aBoolean407, arg4, local182);
				local281 = local279;
				if (local279.method6260()) {
					local279.method6259(arg3);
				}
			} else {
				local281 = new Class1_Sub4_Sub1(arg3, local30, arg2, arg5, local162, local153, local170, super.aBoolean407, arg4, arg0);
			}
			@Pc(313) Class1_Sub4 local313 = Static112.method1824(arg2, arg9, arg1);
			if (local313 instanceof Class1_Sub4_Sub3) {
				((Class1_Sub4_Sub3) local313).aClass1_Sub4_1 = local281;
			} else {
				Static361.method5052(arg2, arg9, arg1, local281);
			}
			if (local30.anInt776 == 1 && arg7 != null) {
				arg7.method3176(arg9, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(IIILclient!qa;IIII[ILclient!nj;I)V")
	public void method4795(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class167 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int[] arg7, @OriginalArg(9) Class3_Sub25 arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean407) {
			return;
		}
		@Pc(13) Class57 local13 = null;
		if (arg7 != null) {
			arg7[0] = -1;
		}
		@Pc(25) int local25 = (arg6 & 0x7) * 8;
		@Pc(31) int local31 = (arg5 & 0x7) * 8;
		while (true) {
			@Pc(39) int local39;
			@Pc(77) int local77;
			@Pc(98) int local98;
			@Pc(427) int local427;
			while (arg8.aByteArray88.length > arg8.anInt4974) {
				local39 = arg8.method4096();
				if (local39 == 0) {
					local13 = new Class57(arg8);
				} else {
					@Pc(168) int local168;
					@Pc(259) int local259;
					@Pc(297) int local297;
					@Pc(104) int local104;
					if (local39 == 1) {
						local77 = arg8.method4096();
						if (local77 > 0) {
							for (local427 = 0; local427 < local77; local427++) {
								@Pc(436) Class226 local436 = new Class226(arg2, arg8, 0);
								if (local436.anInt6364 == 31) {
									@Pc(447) Class228 local447 = Static84.aClass87_3.method2045(arg8.method4083());
									local436.method5244(local447.anInt6422, local447.anInt6424, local447.anInt6420, local447.anInt6423);
								}
								if (arg2.method5986() > 0) {
									@Pc(467) Class3_Sub7 local467 = local436.aClass3_Sub7_2;
									local104 = local467.method2483() >> 7;
									local168 = local467.method2481() >> 7;
									if (arg4 == local436.anInt6363 && local25 <= local104 && local25 + 8 > local104 && local168 >= local31 && local31 + 8 > local168) {
										local259 = Static156.method2447(arg9, local467.method2481() & 0x3FF, local467.method2483() & 0x3FF) + (arg1 << 7);
										local297 = Static285.method4132(local467.method2481() & 0x3FF, arg9, local467.method2483() & 0x3FF) + (arg3 << 7);
										local104 = local259 >> 7;
										local168 = local297 >> 7;
										if (local104 >= 0 && local168 >= 0 && local104 < super.anInt5756 && local168 < super.anInt5758) {
											local467.method2485(local259, local297, super.anIntArrayArrayArray11[arg4][local104][local168] - local467.method2476());
											Static197.method3055(local436);
										}
									}
								}
							}
						}
					} else if (local39 == 2) {
						if (local13 == null) {
							local13 = new Class57();
						}
						local13.method1540(arg8);
					} else if (local39 != 128) {
						if (local39 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray14 == null) {
							super.aByteArrayArrayArray14 = new byte[4][][];
						}
						for (local77 = 0; local77 < 4; local77++) {
							@Pc(83) byte local83 = arg8.method4097();
							@Pc(102) int local102;
							if (local83 == 0 && super.aByteArrayArrayArray14[arg0] != null) {
								if (local77 <= arg4) {
									local98 = arg1;
									local102 = arg1 + 7;
									local104 = arg3;
									if (arg1 < 0) {
										local98 = 0;
									} else if (arg1 >= super.anInt5756) {
										local98 = super.anInt5756;
									}
									if (local102 < 0) {
										local102 = 0;
									} else if (super.anInt5756 <= local102) {
										local102 = super.anInt5756;
									}
									if (arg3 < 0) {
										local104 = 0;
									} else if (super.anInt5758 <= arg3) {
										local104 = super.anInt5758;
									}
									local168 = arg3 + 7;
									if (local168 < 0) {
										local168 = 0;
									} else if (local168 >= super.anInt5758) {
										local168 = super.anInt5758;
									}
									while (local98 < local102) {
										while (local168 > local104) {
											super.aByteArrayArrayArray14[arg0][local98][local104] = 0;
											local104++;
										}
										local98++;
									}
								}
							} else if (local83 == 1) {
								if (super.aByteArrayArrayArray14[arg0] == null) {
									super.aByteArrayArrayArray14[arg0] = new byte[super.anInt5756 + 1][super.anInt5758 + 1];
								}
								for (local98 = 0; local98 < 64; local98 += 4) {
									for (local102 = 0; local102 < 64; local102 += 4) {
										@Pc(250) byte local250 = arg8.method4097();
										if (arg4 >= local77) {
											for (local168 = local98; local168 < local98 + 4; local168++) {
												for (local259 = local102; local259 < local102 + 4; local259++) {
													if (local168 >= local25 && local168 < local25 + 8 && local31 <= local259 && local31 + 8 > local31) {
														local297 = Static379.method5264(arg9, local168 & 0x7, local259 & 0x7) + arg1;
														@Pc(309) int local309 = Static451.method6149(arg9, local168 & 0x7, local259 & 0x7) + arg3;
														if (local297 >= 0 && super.anInt5756 > local297 && local309 >= 0 && local309 < super.anInt5758) {
															super.aByteArrayArrayArray14[arg0][local297][local309] = local250;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					} else if (arg7 == null) {
						arg8.anInt4974 += 10;
					} else {
						arg7[0] = arg8.method4083();
						arg7[1] = arg8.method4065();
						arg7[2] = arg8.method4065();
						arg7[3] = arg8.method4065();
						arg7[4] = arg8.method4083();
					}
				}
			}
			if (local13 != null) {
				Static253.method3565(local13, arg1 >> 3, arg3 >> 3);
			}
			if (super.aByteArrayArrayArray14 != null && super.aByteArrayArrayArray14[arg0] != null) {
				local39 = arg1 + 7;
				local77 = arg3 + 7;
				for (local427 = arg1; local427 < local39; local427++) {
					for (local98 = arg3; local98 < local77; local98++) {
						super.aByteArrayArrayArray14[arg0][local427][local98] = 0;
					}
				}
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!qa;II[Lclient!kg;IIII[BII)V")
	public void method4796(@OriginalArg(0) Class167 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class128[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) byte[] arg8, @OriginalArg(10) int arg9) {
		@Pc(10) Class3_Sub25 local10 = new Class3_Sub25(arg8);
		@Pc(28) int local28 = -1;
		while (true) {
			@Pc(32) int local32 = local10.method4072();
			if (local32 == 0) {
				return;
			}
			local28 += local32;
			@Pc(43) int local43 = 0;
			while (true) {
				@Pc(47) int local47 = local10.method4086();
				if (local47 == 0) {
					break;
				}
				local43 += local47 - 1;
				@Pc(62) int local62 = local43 & 0x3F;
				@Pc(68) int local68 = local43 >> 6 & 0x3F;
				@Pc(72) int local72 = local43 >> 12;
				@Pc(76) int local76 = local10.method4096();
				@Pc(80) int local80 = local76 >> 2;
				@Pc(84) int local84 = local76 & 0x3;
				if (arg7 == local72 && arg4 <= local68 && local68 < arg4 + 8 && local62 >= arg5 && arg5 + 8 > local62) {
					@Pc(120) Class31 local120 = Static9.aClass149_1.method3573(local28);
					@Pc(137) int local137 = Static218.method6142(local68 & 0x7, local120.anInt786, local84, local62 & 0x7, local120.anInt784, arg9) + arg1;
					@Pc(154) int local154 = Static168.method2579(local68 & 0x7, local120.anInt784, local120.anInt786, arg9, local62 & 0x7, local84) + arg2;
					if (local137 > 0 && local154 > 0 && local137 < super.anInt5756 - 1 && local154 < super.anInt5758 - 1) {
						@Pc(175) Class128 local175 = null;
						if (!super.aBoolean407) {
							@Pc(180) int local180 = arg6;
							if ((Static360.aByteArrayArrayArray16[1][local137][local154] & 0x2) == 2) {
								local180 = arg6 - 1;
							}
							if (local180 >= 0) {
								local175 = arg3[local180];
							}
						}
						this.method4794(-1, local154, arg6, arg0, local84 + arg9 & 0x3, arg6, local28, local175, local80, local137);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(ILclient!kg;IIBLclient!qa;I)V")
	public void method4797(@OriginalArg(0) int arg0, @OriginalArg(1) Class128 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class167 arg4, @OriginalArg(6) int arg5) {
		@Pc(7) Interface5 local7 = null;
		if (arg2 == 0) {
			local7 = (Interface5) Static392.method5427(arg5, arg3, arg0);
		}
		if (arg2 == 1) {
			local7 = (Interface5) Static222.method4446(arg5, arg3, arg0);
		}
		if (arg2 == 2) {
			local7 = (Interface5) Static313.method4388(arg5, arg3, arg0, jt.class);
		}
		if (arg2 == 3) {
			local7 = (Interface5) Static112.method1824(arg5, arg3, arg0);
		}
		if (local7 == null) {
			return;
		}
		@Pc(70) Class31 local70 = Static9.aClass149_1.method3573(local7.method6263());
		@Pc(74) int local74 = local7.method6261();
		@Pc(78) int local78 = local7.method6262();
		if (local70.method871()) {
			Static314.method4405(arg5, local70, arg3, arg0);
		}
		if (local7.method6260()) {
			local7.method6265(arg4);
		}
		if (arg2 != 0) {
			if (arg2 == 1) {
				@Pc(253) Class1_Sub1 local253 = Static222.method4446(arg5, arg3, arg0);
				if (!(local253 instanceof Class1_Sub1_Sub3)) {
					Static396.method5463(arg5, arg3, arg0);
					return;
				}
				((Class1_Sub1_Sub3) local253).aClass1_Sub1_3 = null;
			} else if (arg2 == 2) {
				@Pc(119) Class1_Sub2 local119 = Static313.method4388(arg5, arg3, arg0, jt.class);
				if (local119 instanceof Class1_Sub2_Sub4 && local119.aShort108 == arg3 && local119.aShort107 == arg0) {
					((Class1_Sub2_Sub4) local119).aClass1_Sub2_2 = null;
				} else {
					Static17.method329(arg5, arg3, arg0, jt.class);
				}
				if (local70.anInt776 != 0 && super.anInt5756 > local70.anInt786 + arg3 && super.anInt5758 > arg0 + local70.anInt786 && arg3 + local70.anInt784 < super.anInt5756 && arg0 + local70.anInt784 < super.anInt5758) {
					arg1.method3181(local70.aBoolean52, !local70.aBoolean44, arg3, local78, local70.anInt784, local70.anInt786, arg0);
					return;
				}
				return;
			} else if (arg2 == 3) {
				@Pc(225) Class1_Sub4 local225 = Static112.method1824(arg5, arg3, arg0);
				if (local225 instanceof Class1_Sub4_Sub3) {
					((Class1_Sub4_Sub3) local225).aClass1_Sub4_1 = null;
				} else {
					Static419.method5742(arg5, arg3, arg0);
				}
				if (local70.anInt776 == 1) {
					arg1.method3185(arg3, arg0);
					return;
				}
			}
			return;
		}
		@Pc(271) Class1_Sub3 local271 = Static392.method5427(arg5, arg3, arg0);
		if (local271 instanceof Class1_Sub3_Sub2) {
			((Class1_Sub3_Sub2) local271).aClass1_Sub3_1 = null;
		} else {
			Static396.method5460(arg5, arg3, arg0);
		}
		if (local70.anInt776 != 0) {
			arg1.method3190(arg0, local78, arg3, !local70.aBoolean44, local70.aBoolean52, local74);
			return;
		}
	}

	@OriginalMember(owner = "client!qq", name = "a", descriptor = "(Lclient!qa;I)V")
	public void method4801(@OriginalArg(0) Class167 arg0) {
		Static67.method1250(arg0);
		@Pc(13) int local13;
		@Pc(17) int local17;
		if (super.anInt5763 > 1) {
			for (local13 = 0; local13 < super.anInt5756; local13++) {
				for (local17 = 0; super.anInt5758 > local17; local17++) {
					if ((Static360.aByteArrayArrayArray16[1][local13][local17] & 0x2) == 2) {
						Static427.method5823(local13, local17);
					}
				}
			}
		}
		for (local13 = 0; local13 < super.anInt5763; local13++) {
			for (local17 = 0; local17 <= super.anInt5758; local17++) {
				for (@Pc(59) int local59 = 0; local59 <= super.anInt5756; local59++) {
					@Pc(74) int local74;
					@Pc(76) int local76;
					@Pc(78) int local78;
					@Pc(125) int local125;
					@Pc(129) int local129;
					@Pc(222) int local222;
					@Pc(231) int local231;
					@Pc(251) int local251;
					@Pc(255) int local255;
					if ((super.aByteArrayArrayArray15[local13][local59][local17] & 0x1) != 0) {
						local74 = local17;
						local76 = local17;
						local78 = local13;
						while (local74 > 0 && (super.aByteArrayArrayArray15[local13][local59][local74 - 1] & 0x1) != 0) {
							local74--;
						}
						while (super.anInt5758 > local76 && (super.aByteArrayArrayArray15[local13][local59][local76 + 1] & 0x1) != 0) {
							local76++;
						}
						local125 = local13;
						label164: while (local78 > 0) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray15[local78 - 1][local59][local129] & 0x1) == 0) {
									break label164;
								}
							}
							local78--;
						}
						label153: while (local125 < 3) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray15[local125 + 1][local59][local129] & 0x1) == 0) {
									break label153;
								}
							}
							local125++;
						}
						local129 = (local125 + 1 - local78) * (local76 + 1 - local74);
						if (local129 >= 2) {
							local222 = super.anIntArrayArrayArray11[local125][local59][local74] - 240;
							local231 = super.anIntArrayArrayArray11[local78][local59][local74];
							Static337.method4671(1, local59 << 7, local59 << 7, local74 << 7, (local76 << 7) + 128, local222, local231);
							for (local251 = local78; local251 <= local125; local251++) {
								for (local255 = local74; local255 <= local76; local255++) {
									super.aByteArrayArrayArray15[local251][local59][local255] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray15[local13][local59][local17] & 0x2) != 0) {
						local74 = local59;
						local76 = local59;
						local78 = local13;
						local125 = local13;
						while (super.anInt5756 > local76 && (super.aByteArrayArrayArray15[local13][local76 + 1][local17] & 0x2) != 0) {
							local76++;
						}
						while (local74 > 0 && (super.aByteArrayArrayArray15[local13][local74 - 1][local17] & 0x2) != 0) {
							local74--;
						}
						label218: while (local78 > 0) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray15[local78 - 1][local129][local17] & 0x2) == 0) {
									break label218;
								}
							}
							local78--;
						}
						label207: while (local125 < 3) {
							for (local129 = local74; local129 <= local76; local129++) {
								if ((super.aByteArrayArrayArray15[local125 + 1][local129][local17] & 0x2) == 0) {
									break label207;
								}
							}
							local125++;
						}
						local129 = (local76 + 1 - local74) * (local125 + 1 - local78);
						if (local129 >= 2) {
							local222 = super.anIntArrayArrayArray11[local125][local74][local17] - 240;
							local231 = super.anIntArrayArrayArray11[local78][local74][local17];
							Static337.method4671(2, local74 << 7, (local76 << 7) + 128, local17 << 7, local17 << 7, local222, local231);
							for (local251 = local78; local251 <= local125; local251++) {
								for (local255 = local74; local255 <= local76; local255++) {
									super.aByteArrayArrayArray15[local251][local255][local17] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray15[local13][local59][local17] & 0x4) != 0) {
						local74 = local59;
						local76 = local59;
						for (local78 = local17; local78 > 0 && (super.aByteArrayArrayArray15[local13][local59][local78 - 1] & 0x4) != 0; local78--) {
						}
						for (local125 = local17; local125 < super.anInt5758 && (super.aByteArrayArrayArray15[local13][local59][local125 + 1] & 0x4) != 0; local125++) {
						}
						label271: while (local74 > 0) {
							for (local129 = local78; local129 <= local125; local129++) {
								if ((super.aByteArrayArrayArray15[local13][local74 - 1][local129] & 0x4) == 0) {
									break label271;
								}
							}
							local74--;
						}
						label260: while (local76 < super.anInt5756) {
							for (local129 = local78; local129 <= local125; local129++) {
								if ((super.aByteArrayArrayArray15[local13][local76 + 1][local129] & 0x4) == 0) {
									break label260;
								}
							}
							local76++;
						}
						if ((local76 + 1 - local74) * (local125 + -local78 - -1) >= 4) {
							local129 = super.anIntArrayArrayArray11[local13][local74][local78];
							Static337.method4671(4, local74 << 7, (local76 << 7) + 128, local78 << 7, (local125 << 7) + 128, local129, local129);
							for (@Pc(709) int local709 = local74; local709 <= local76; local709++) {
								for (local222 = local78; local222 <= local125; local222++) {
									super.aByteArrayArrayArray15[local13][local709][local222] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray15 = null;
	}
}
