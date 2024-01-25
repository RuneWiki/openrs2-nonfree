import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class193_Sub1 extends Class193 {

	@OriginalMember(owner = "client!m", name = "O", descriptor = "I")
	public int anInt4876 = 99;

	@OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIZ)V")
	public Class193_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, Static451.aClass327_5, Static261.aClass318_1);
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!sl;ZIIILclient!oa;IIII)V")
	public void method4184(@OriginalArg(0) int arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class121 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (!Static480.aClass6_Sub37_Sub1_1.method5165(Static567.anInt9503) && !Static355.method5298(arg3, arg6, arg2, Static356.anInt6242)) {
			return;
		}
		if (arg7 < this.anInt4876) {
			this.anInt4876 = arg7;
		}
		@Pc(34) Class313 local34 = Static260.aClass100_1.method2008(arg0);
		if (arg5.method7143() && Static480.aClass6_Sub37_Sub1_1.aBoolean401 && local34.aBoolean590) {
			return;
		}
		@Pc(58) int local58;
		@Pc(55) int local55;
		if (arg9 == 1 || arg9 == 3) {
			local55 = local34.anInt8478;
			local58 = local34.anInt8463;
		} else {
			local58 = local34.anInt8478;
			local55 = local34.anInt8463;
		}
		@Pc(91) int local91;
		@Pc(85) int local85;
		if (local58 + arg6 <= super.anInt4863) {
			local85 = arg6 + (local58 + 1 >> 1);
			local91 = arg6 + (local58 >> 1);
		} else {
			local85 = arg6 + 1;
			local91 = arg6;
		}
		@Pc(111) int local111;
		@Pc(109) int local109;
		if (super.anInt4865 < local55 + arg2) {
			local109 = arg2 + 1;
			local111 = arg2;
		} else {
			local109 = (local55 + 1 >> 1) + arg2;
			local111 = arg2 + (local55 >> 1);
		}
		@Pc(132) Class60 local132 = Static285.aClass60Array8[arg3];
		@Pc(155) int local155 = local132.JA(local91, local111) + local132.JA(local85, local111) + local132.JA(local91, local109) + local132.JA(local85, local109) >> 2;
		@Pc(163) int local163 = (local58 << 8) + (arg6 << 9);
		@Pc(171) int local171 = (local55 << 8) + (arg2 << 9);
		@Pc(183) boolean local183 = Static400.aBoolean553 && !super.aBoolean293 && local34.aBoolean585;
		if (local34.method6962()) {
			Static176.method2703(null, arg7, null, arg6, local34, arg9, arg2);
		}
		@Pc(217) boolean local217 = arg4 == -1 && local34.anInt8466 == -1 && local34.anIntArray651 == null && local34.anIntArray650 == null && !local34.aBoolean594;
		if (Static469.aBoolean541 && (Static173.method2672(arg8) && local34.anInt8464 != 1 || !(!Static425.method7753(arg8) || local34.anInt8464 != 0))) {
			return;
		}
		if (arg8 != 22) {
			@Pc(372) Class29_Sub2 local372;
			@Pc(341) Class29_Sub2_Sub3 local341;
			@Pc(374) int local374;
			if (arg8 == 10 || arg8 == 11) {
				local341 = null;
				if (local217) {
					@Pc(404) Class29_Sub2_Sub3 local404 = new Class29_Sub2_Sub3(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg6, local58 + arg6 - 1, arg2, local55 + arg2 - 1, arg8, arg9, local183);
					local374 = local404.method6247();
					local341 = local404;
					local372 = local404;
				} else {
					local372 = new Class29_Sub2_Sub6(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg6, arg6 + local58 - 1, arg2, arg2 + local55 - 1, arg8, arg9, arg4);
					local374 = 15;
				}
				@Pc(425) Class29_Sub2 local425 = Static134.method1995(arg7, arg6, arg2, dda.class);
				@Pc(427) boolean local427 = false;
				if (local425 instanceof Class29_Sub2_Sub5 && local425.aShort122 == arg6 && local425.aShort121 == arg2) {
					((Class29_Sub2_Sub5) local425).aClass29_Sub2_2 = local372;
					local427 = true;
				}
				if (local427 || Static280.method3996(local372, false)) {
					if (local341 != null && local341.method7550()) {
						local341.method7556(arg5);
					}
					if (local34.aBoolean588 && Static400.aBoolean553) {
						if (local374 > 30) {
							local374 = 30;
						}
						for (@Pc(472) int local472 = 0; local472 <= local58; local472++) {
							for (@Pc(476) int local476 = 0; local476 <= local55; local476++) {
								local132.EA(arg6 + local472, arg2 - -local476, local374);
							}
						}
					}
				}
				if (local34.anInt8469 != 0 && arg1 != null) {
					arg1.method6551(arg2, local58, local55, local34.aBoolean586, arg6, !local34.aBoolean583);
				}
			} else {
				@Pc(625) Class29_Sub2 local625;
				if (arg8 >= 12 && arg8 <= 17 || arg8 >= 18 && arg8 <= 21) {
					if (local217) {
						local341 = new Class29_Sub2_Sub3(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg6, local58 + arg6 - 1, arg2, arg2 + local55 - 1, arg8, arg9, local183);
						local372 = local341;
						if (local341.method7550()) {
							local341.method7556(arg5);
						}
					} else {
						local372 = new Class29_Sub2_Sub6(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg6, arg6 + local58 - 1, arg2, local55 + arg2 - 1, arg8, arg9, arg4);
					}
					local625 = Static134.method1995(arg7, arg6, arg2, dda.class);
					if (local625 instanceof Class29_Sub2_Sub5 && arg6 == local625.aShort122 && arg2 == local625.aShort121) {
						((Class29_Sub2_Sub5) local625).aClass29_Sub2_2 = local372;
					} else {
						Static280.method3996(local372, false);
					}
					if (Static400.aBoolean553 && !super.aBoolean293 && arg8 >= 12 && arg8 <= 17 && arg8 != 13 && arg7 > 0 && local34.anInt8464 != 0) {
						super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x4);
					}
					if (local34.anInt8469 != 0 && arg1 != null) {
						arg1.method6551(arg2, local58, local55, local34.aBoolean586, arg6, !local34.aBoolean583);
					}
				} else {
					@Pc(761) Class29_Sub5 local761;
					if (arg8 == 0) {
						@Pc(726) int local726 = local34.anInt8464;
						if (Static2.aBoolean3 && local34.anInt8464 == -1) {
							local726 = 1;
						}
						if (local217) {
							@Pc(751) Class29_Sub5_Sub3 local751 = new Class29_Sub5_Sub3(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, arg8, arg9, local183);
							if (local751.method7550()) {
								local751.method7556(arg5);
							}
							local761 = local751;
						} else {
							local761 = new Class29_Sub5_Sub1(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg8, arg9, arg4);
						}
						@Pc(784) Class29_Sub5 local784 = Static120.method1814(arg7, arg6, arg2);
						if (local784 instanceof Class29_Sub5_Sub2) {
							((Class29_Sub5_Sub2) local784).aClass29_Sub5_3 = local761;
						} else {
							Static470.method6576(arg7, arg6, arg2, local761, null);
						}
						if (Static400.aBoolean553) {
							if (arg9 == 0) {
								if (local34.aBoolean588) {
									local132.EA(arg6, arg2, 50);
									local132.EA(arg6, arg2 + 1, 50);
								}
								if (local726 == 1 && !super.aBoolean293) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x1);
								}
							} else if (arg9 == 1) {
								if (local34.aBoolean588) {
									local132.EA(arg6, arg2 + 1, 50);
									local132.EA(arg6 + 1, arg2 + 1, 50);
								}
								if (local726 == 1 && !super.aBoolean293) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] | 0x2);
								}
							} else if (arg9 == 2) {
								if (local34.aBoolean588) {
									local132.EA(arg6 + 1, arg2, 50);
									local132.EA(arg6 + 1, arg2 - -1, 50);
								}
								if (local726 == 1 && !super.aBoolean293) {
									super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] | 0x1);
								}
							} else if (arg9 == 3) {
								if (local34.aBoolean588) {
									local132.EA(arg6, arg2, 50);
									local132.EA(arg6 + 1, arg2, 50);
								}
								if (local726 == 1 && !super.aBoolean293) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x2);
								}
							}
						}
						if (local34.anInt8469 != 0 && arg1 != null) {
							arg1.method6564(arg6, local34.aBoolean586, arg8, arg9, arg2, !local34.aBoolean583);
						}
						if (local34.anInt8479 != 64) {
							Static281.method4012(arg7, arg6, arg2, local34.anInt8479);
						}
					} else {
						@Pc(1057) Class29_Sub5_Sub3 local1057;
						@Pc(1067) Class29_Sub5 local1067;
						if (arg8 == 1) {
							if (local217) {
								local1057 = new Class29_Sub5_Sub3(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, arg8, arg9, local183);
								if (local1057.method7550()) {
									local1057.method7556(arg5);
								}
								local1067 = local1057;
							} else {
								local1067 = new Class29_Sub5_Sub1(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg8, arg9, arg4);
							}
							local761 = Static120.method1814(arg7, arg6, arg2);
							if (local761 instanceof Class29_Sub5_Sub2) {
								((Class29_Sub5_Sub2) local761).aClass29_Sub5_3 = local1067;
							} else {
								Static470.method6576(arg7, arg6, arg2, local1067, null);
							}
							if (local34.aBoolean588 && Static400.aBoolean553) {
								if (arg9 == 0) {
									local132.EA(arg6, arg2 + 1, 50);
								} else if (arg9 == 1) {
									local132.EA(arg6 + 1, arg2 + 1, 50);
								} else if (arg9 == 2) {
									local132.EA(arg6 + 1, arg2, 50);
								} else if (arg9 == 3) {
									local132.EA(arg6, arg2, 50);
								}
							}
							if (local34.anInt8469 != 0 && arg1 != null) {
								arg1.method6564(arg6, local34.aBoolean586, arg8, arg9, arg2, !local34.aBoolean583);
							}
						} else if (arg8 == 2) {
							local374 = arg9 + 1 & 0x3;
							if (local217) {
								@Pc(1243) Class29_Sub5_Sub3 local1243 = new Class29_Sub5_Sub3(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, arg8, arg9 + 4, local183);
								@Pc(1258) Class29_Sub5_Sub3 local1258 = new Class29_Sub5_Sub3(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, arg8, local374, local183);
								if (local1243.method7550()) {
									local1243.method7556(arg5);
								}
								if (local1258.method7550()) {
									local1258.method7556(arg5);
								}
								local761 = local1258;
								local1067 = local1243;
							} else {
								local1067 = new Class29_Sub5_Sub1(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg8, arg9 + 4, arg4);
								local761 = new Class29_Sub5_Sub1(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg8, local374, arg4);
							}
							Static470.method6576(arg7, arg6, arg2, local1067, local761);
							if (local34.anInt8464 == 1 && Static400.aBoolean553 && !super.aBoolean293) {
								if (arg9 == 0) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x1);
									super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] | 0x2);
								} else if (arg9 == 1) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2 + 1] | 0x2);
									super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] | 0x1);
								} else if (arg9 == 2) {
									super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6 + 1][arg2] | 0x1);
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x2);
								} else if (arg9 == 3) {
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x2);
									super.aByteArrayArrayArray12[arg7][arg6][arg2] = (byte) (super.aByteArrayArrayArray12[arg7][arg6][arg2] | 0x1);
								}
							}
							if (local34.anInt8469 != 0 && arg1 != null) {
								arg1.method6564(arg6, local34.aBoolean586, arg8, arg9, arg2, !local34.aBoolean583);
							}
							if (local34.anInt8479 != 64) {
								Static281.method4012(arg7, arg6, arg2, local34.anInt8479);
							}
						} else if (arg8 == 3) {
							if (local217) {
								local1057 = new Class29_Sub5_Sub3(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, arg8, arg9, local183);
								local1067 = local1057;
								if (local1057.method7550()) {
									local1057.method7556(arg5);
								}
							} else {
								local1067 = new Class29_Sub5_Sub1(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg8, arg9, arg4);
							}
							local761 = Static120.method1814(arg7, arg6, arg2);
							if (local761 instanceof Class29_Sub5_Sub2) {
								((Class29_Sub5_Sub2) local761).aClass29_Sub5_3 = local1067;
							} else {
								Static470.method6576(arg7, arg6, arg2, local1067, null);
							}
							if (local34.aBoolean588 && Static400.aBoolean553) {
								if (arg9 == 0) {
									local132.EA(arg6, arg2 + 1, 50);
								} else if (arg9 == 1) {
									local132.EA(arg6 + 1, arg2 - -1, 50);
								} else if (arg9 == 2) {
									local132.EA(arg6 + 1, arg2, 50);
								} else if (arg9 == 3) {
									local132.EA(arg6, arg2, 50);
								}
							}
							if (local34.anInt8469 != 0 && arg1 != null) {
								arg1.method6564(arg6, local34.aBoolean586, arg8, arg9, arg2, !local34.aBoolean583);
							}
						} else if (arg8 == 9) {
							if (local217) {
								local341 = new Class29_Sub2_Sub3(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg6, arg6, arg2, arg2, arg8, arg9, local183);
								if (local341.method7550()) {
									local341.method7556(arg5);
								}
								local372 = local341;
							} else {
								local372 = new Class29_Sub2_Sub6(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg6, arg6 + local58 - 1, arg2, arg2 + local55 - 1, arg8, arg9, arg4);
							}
							local625 = Static134.method1995(arg7, arg6, arg2, dda.class);
							if (local625 instanceof Class29_Sub2_Sub5 && local625.aShort122 == arg6 && local625.aShort121 == arg2) {
								((Class29_Sub2_Sub5) local625).aClass29_Sub2_2 = local372;
							} else {
								Static280.method3996(local372, false);
							}
							if (local34.anInt8469 != 0 && arg1 != null) {
								arg1.method6551(arg2, local58, local55, local34.aBoolean586, arg6, !local34.aBoolean583);
							}
							if (local34.anInt8479 != 64) {
								Static281.method4012(arg7, arg6, arg2, local34.anInt8479);
							}
						} else {
							@Pc(1828) Class29_Sub1 local1828;
							if (arg8 == 4) {
								if (local217) {
									@Pc(1826) Class29_Sub1_Sub1 local1826 = new Class29_Sub1_Sub1(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, 0, 0, 0, arg8, arg9);
									local1828 = local1826;
									if (local1826.method7550()) {
										local1826.method7556(arg5);
									}
								} else {
									local1828 = new Class29_Sub1_Sub2(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, 0, 0, 0, arg8, arg9, arg4);
								}
								@Pc(1862) Class29_Sub1 local1862 = Static178.method5953(arg7, arg6, arg2);
								if (local1862 instanceof Class29_Sub1_Sub3) {
									((Class29_Sub1_Sub3) local1862).aClass29_Sub1_3 = local1828;
								} else {
									Static163.method2393(arg7, arg6, arg2, local1828, null);
								}
							} else {
								@Pc(1884) int local1884;
								@Pc(1890) Interface6 local1890;
								@Pc(1958) Class29_Sub1_Sub1 local1958;
								@Pc(1973) Class29_Sub1 local1973;
								if (arg8 == 5) {
									local1884 = 65;
									local1890 = (Interface6) Static120.method1814(arg7, arg6, arg2);
									if (local1890 != null) {
										local1884 = Static260.aClass100_1.method2008(local1890.method7555()).anInt8479 + 1;
									}
									if (local217) {
										local1958 = new Class29_Sub1_Sub1(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, 0, Static288.anIntArray454[arg9] * local1884, local1884 * Static302.anIntArray469[arg9], arg8, arg9);
										if (local1958.method7550()) {
											local1958.method7556(arg5);
										}
										local1828 = local1958;
									} else {
										local1828 = new Class29_Sub1_Sub2(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, 0, local1884 * Static288.anIntArray454[arg9], Static302.anIntArray469[arg9] * local1884, arg8, arg9, arg4);
									}
									local1973 = Static178.method5953(arg7, arg6, arg2);
									if (local1973 instanceof Class29_Sub1_Sub3) {
										((Class29_Sub1_Sub3) local1973).aClass29_Sub1_3 = local1828;
									} else {
										Static163.method2393(arg7, arg6, arg2, local1828, null);
									}
								} else if (arg8 == 6) {
									local1884 = 33;
									local1890 = (Interface6) Static120.method1814(arg7, arg6, arg2);
									if (local1890 != null) {
										local1884 = Static260.aClass100_1.method2008(local1890.method7555()).anInt8479 / 2 + 1;
									}
									if (local217) {
										local1958 = new Class29_Sub1_Sub1(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, arg9, local1884 * Static288.anIntArray454[arg9], local1884 * Static302.anIntArray469[arg9], arg8, arg9 + 4);
										local1828 = local1958;
										if (local1958.method7550()) {
											local1958.method7556(arg5);
										}
									} else {
										local1828 = new Class29_Sub1_Sub2(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg9, Static377.anIntArray549[arg9] * local1884, Static40.anIntArray54[arg9] * local1884, arg8, arg9 + 4, arg4);
									}
									local1973 = Static178.method5953(arg7, arg6, arg2);
									if (local1973 instanceof Class29_Sub1_Sub3) {
										((Class29_Sub1_Sub3) local1973).aClass29_Sub1_3 = local1828;
									} else {
										Static163.method2393(arg7, arg6, arg2, local1828, null);
									}
								} else if (arg8 == 7) {
									local1884 = arg9 + 2 & 0x3;
									if (local217) {
										@Pc(2133) Class29_Sub1_Sub1 local2133 = new Class29_Sub1_Sub1(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, local1884, 0, 0, arg8, local1884 + 4);
										if (local2133.method7550()) {
											local2133.method7556(arg5);
										}
										local1828 = local2133;
									} else {
										local1828 = new Class29_Sub1_Sub2(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, local1884, 0, 0, arg8, local1884 + 4, arg4);
									}
									@Pc(2171) Class29_Sub1 local2171 = Static178.method5953(arg7, arg6, arg2);
									if (local2171 instanceof Class29_Sub1_Sub3) {
										((Class29_Sub1_Sub3) local2171).aClass29_Sub1_3 = local1828;
									} else {
										Static163.method2393(arg7, arg6, arg2, local1828, null);
									}
								} else if (arg8 == 8) {
									local374 = arg9 + 2 & 0x3;
									@Pc(2199) int local2199 = 33;
									@Pc(2205) Interface6 local2205 = (Interface6) Static120.method1814(arg7, arg6, arg2);
									if (local2205 != null) {
										local2199 = Static260.aClass100_1.method2008(local2205.method7555()).anInt8479 / 2 + 1;
									}
									@Pc(2248) Class29_Sub1 local2248;
									@Pc(2267) Class29_Sub1 local2267;
									if (local217) {
										local2248 = new Class29_Sub1_Sub1(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, arg9, local2199 * Static377.anIntArray549[arg9], local2199 * Static40.anIntArray54[arg9], arg8, arg9 + 4);
										local2267 = new Class29_Sub1_Sub1(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, arg9, 0, 0, arg8, local374 + 4);
										if (local2248.method7550()) {
											local2248.method7556(arg5);
										}
										if (local2267.method7550()) {
											local2267.method7556(arg5);
										}
									} else {
										local2248 = new Class29_Sub1_Sub2(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg9, local2199 * Static377.anIntArray549[arg9], local2199 * Static40.anIntArray54[arg9], arg8, arg9 + 4, arg4);
										local2267 = new Class29_Sub1_Sub2(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg9, 0, 0, arg8, local374 + 4, arg4);
									}
									Static163.method2393(arg7, arg6, arg2, local2248, local2267);
								}
							}
						}
					}
				}
			}
		} else if (Static480.aClass6_Sub37_Sub1_1.aBoolean402 || local34.lb != 0 || local34.anInt8469 == 1 || local34.aBoolean581) {
			@Pc(275) Class29_Sub3 local275;
			if (local217) {
				@Pc(273) Class29_Sub3_Sub1 local273 = new Class29_Sub3_Sub1(arg5, local34, arg3, local163, local155, local171, super.aBoolean293, arg9, local183);
				local275 = local273;
				if (local273.method7550()) {
					local273.method7556(arg5);
				}
			} else {
				local275 = new Class29_Sub3_Sub2(arg5, local34, arg7, arg3, local163, local155, local171, super.aBoolean293, arg9, arg4);
			}
			@Pc(305) Class29_Sub3 local305 = Static315.method4904(arg7, arg6, arg2);
			if (local305 instanceof Class29_Sub3_Sub3) {
				((Class29_Sub3_Sub3) local305).aClass29_Sub3_2 = local275;
			} else {
				Static97.method1504(arg7, arg6, arg2, local275);
			}
			if (local34.anInt8469 == 1 && arg1 != null) {
				arg1.method6555(arg2, arg6);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!oa;B)V")
	public void method4185(@OriginalArg(0) Class121 arg0) {
		Static412.method6043(arg0);
		@Pc(15) int local15;
		@Pc(19) int local19;
		if (super.anInt4861 > 1) {
			for (local15 = 0; local15 < super.anInt4863; local15++) {
				for (local19 = 0; super.anInt4865 > local19; local19++) {
					if ((Static303.aByteArrayArrayArray13[1][local15][local19] & 0x2) == 2) {
						Static110.method1749(local15, local19);
					}
				}
			}
		}
		for (local15 = 0; local15 < super.anInt4861; local15++) {
			for (local19 = 0; local19 <= super.anInt4865; local19++) {
				for (@Pc(65) int local65 = 0; super.anInt4863 >= local65; local65++) {
					@Pc(83) int local83;
					@Pc(85) int local85;
					@Pc(87) int local87;
					@Pc(89) int local89;
					@Pc(144) int local144;
					@Pc(234) int local234;
					@Pc(243) int local243;
					@Pc(263) int local263;
					@Pc(267) int local267;
					if ((super.aByteArrayArrayArray12[local15][local65][local19] & 0x1) != 0) {
						local83 = local19;
						local85 = local19;
						local87 = local15;
						local89 = local15;
						while (local85 < super.anInt4865 && (super.aByteArrayArrayArray12[local15][local65][local85 + 1] & 0x1) != 0) {
							local85++;
						}
						while (local83 > 0 && (super.aByteArrayArrayArray12[local15][local65][local83 - 1] & 0x1) != 0) {
							local83--;
						}
						label164: while (local87 > 0) {
							for (local144 = local83; local144 <= local85; local144++) {
								if ((super.aByteArrayArrayArray12[local87 - 1][local65][local144] & 0x1) == 0) {
									break label164;
								}
							}
							local87--;
						}
						label153: while (local89 < 3) {
							for (local144 = local83; local144 <= local85; local144++) {
								if ((super.aByteArrayArrayArray12[local89 + 1][local65][local144] & 0x1) == 0) {
									break label153;
								}
							}
							local89++;
						}
						local144 = (local89 + 1 - local87) * ((local85 - local83) + 1);
						if (local144 >= 2) {
							local234 = super.anIntArrayArrayArray17[local89][local65][local83] - 960;
							local243 = super.anIntArrayArrayArray17[local87][local65][local83];
							Static33.method464(1, local65 << 9, local65 << 9, local83 << 9, (local85 << 9) + 512, local234, local243);
							for (local263 = local87; local263 <= local89; local263++) {
								for (local267 = local83; local267 <= local85; local267++) {
									super.aByteArrayArrayArray12[local263][local65][local267] &= 0xFFFFFFFE;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local15][local65][local19] & 0x2) != 0) {
						local83 = local65;
						local85 = local65;
						local87 = local15;
						while (local85 < super.anInt4863 && (super.aByteArrayArrayArray12[local15][local85 + 1][local19] & 0x2) != 0) {
							local85++;
						}
						local89 = local15;
						while (local83 > 0 && (super.aByteArrayArrayArray12[local15][local83 - 1][local19] & 0x2) != 0) {
							local83--;
						}
						label217: while (local87 > 0) {
							for (local144 = local83; local144 <= local85; local144++) {
								if ((super.aByteArrayArrayArray12[local87 - 1][local144][local19] & 0x2) == 0) {
									break label217;
								}
							}
							local87--;
						}
						label206: while (local89 < 3) {
							for (local144 = local83; local144 <= local85; local144++) {
								if ((super.aByteArrayArrayArray12[local89 + 1][local144][local19] & 0x2) == 0) {
									break label206;
								}
							}
							local89++;
						}
						local144 = (local89 + 1 - local87) * (local85 + 1 - local83);
						if (local144 >= 2) {
							local234 = super.anIntArrayArrayArray17[local89][local83][local19] - 960;
							local243 = super.anIntArrayArrayArray17[local87][local83][local19];
							Static33.method464(2, local83 << 9, (local85 << 9) + 512, local19 << 9, local19 << 9, local234, local243);
							for (local263 = local87; local263 <= local89; local263++) {
								for (local267 = local83; local267 <= local85; local267++) {
									super.aByteArrayArrayArray12[local263][local267][local19] &= 0xFFFFFFFD;
								}
							}
						}
					}
					if ((super.aByteArrayArrayArray12[local15][local65][local19] & 0x4) != 0) {
						local83 = local65;
						local85 = local65;
						for (local87 = local19; local87 > 0 && (super.aByteArrayArrayArray12[local15][local65][local87 - 1] & 0x4) != 0; local87--) {
						}
						for (local89 = local19; super.anInt4865 > local89 && (super.aByteArrayArrayArray12[local15][local65][local89 + 1] & 0x4) != 0; local89++) {
						}
						label271: while (local83 > 0) {
							for (local144 = local87; local144 <= local89; local144++) {
								if ((super.aByteArrayArrayArray12[local15][local83 - 1][local144] & 0x4) == 0) {
									break label271;
								}
							}
							local83--;
						}
						label260: while (super.anInt4863 > local85) {
							for (local144 = local87; local144 <= local89; local144++) {
								if ((super.aByteArrayArrayArray12[local15][local85 + 1][local144] & 0x4) == 0) {
									break label260;
								}
							}
							local85++;
						}
						if ((local85 + 1 - local83) * (local89 + 1 + -local87) >= 4) {
							local144 = super.anIntArrayArrayArray17[local15][local83][local87];
							Static33.method464(4, local83 << 9, (local85 << 9) + 512, local87 << 9, (local89 << 9) + 512, local144, local144);
							for (@Pc(713) int local713 = local83; local713 <= local85; local713++) {
								for (local234 = local87; local234 <= local89; local234++) {
									super.aByteArrayArrayArray12[local15][local713][local234] &= 0xFFFFFFFB;
								}
							}
						}
					}
				}
			}
		}
		super.aByteArrayArrayArray12 = null;
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "([Lclient!sl;ILclient!oa;BI[B)V")
	public void method4188(@OriginalArg(0) Class295[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) byte[] arg4) {
		@Pc(18) Class6_Sub14 local18 = new Class6_Sub14(arg4);
		@Pc(20) int local20 = -1;
		while (true) {
			@Pc(24) int local24 = local18.method6029();
			if (local24 == 0) {
				return;
			}
			local20 += local24;
			@Pc(32) int local32 = 0;
			while (true) {
				@Pc(36) int local36 = local18.method5998();
				if (local36 == 0) {
					break;
				}
				local32 += local36 - 1;
				@Pc(48) int local48 = local32 & 0x3F;
				@Pc(54) int local54 = local32 >> 6 & 0x3F;
				@Pc(58) int local58 = local32 >> 12;
				@Pc(62) int local62 = local18.method6041();
				@Pc(66) int local66 = local62 >> 2;
				@Pc(70) int local70 = local62 & 0x3;
				@Pc(74) int local74 = arg3 + local54;
				@Pc(79) int local79 = local48 + arg1;
				if (local74 > 0 && local79 > 0 && local74 < super.anInt4863 - 1 && local79 < super.anInt4865 - 1) {
					@Pc(104) Class295 local104 = null;
					if (!super.aBoolean293) {
						@Pc(109) int local109 = local58;
						if ((Static303.aByteArrayArrayArray13[1][local74][local79] & 0x2) == 2) {
							local109 = local58 - 1;
						}
						if (local109 >= 0) {
							local104 = arg0[local109];
						}
					}
					this.method4184(local20, local104, local79, local58, -1, arg2, local74, local58, local66, local70);
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII[BILclient!oa;[Lclient!sl;)V")
	public void method4190(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[] arg7, @OriginalArg(9) Class121 arg8, @OriginalArg(10) Class295[] arg9) {
		@Pc(10) Class6_Sub14 local10 = new Class6_Sub14(arg7);
		@Pc(12) int local12 = -1;
		while (true) {
			@Pc(18) int local18 = local10.method6029();
			if (local18 == 0) {
				return;
			}
			local12 += local18;
			@Pc(26) int local26 = 0;
			while (true) {
				@Pc(30) int local30 = local10.method5998();
				if (local30 == 0) {
					break;
				}
				local26 += local30 - 1;
				@Pc(45) int local45 = local26 & 0x3F;
				@Pc(51) int local51 = local26 >> 6 & 0x3F;
				@Pc(55) int local55 = local26 >> 12;
				@Pc(59) int local59 = local10.method6041();
				@Pc(63) int local63 = local59 >> 2;
				@Pc(67) int local67 = local59 & 0x3;
				if (arg1 == local55 && local51 >= arg4 && arg4 + 8 > local51 && local45 >= arg3 && arg3 + 8 > local45) {
					@Pc(107) Class313 local107 = Static260.aClass100_1.method2008(local12);
					@Pc(124) int local124 = arg5 + Static487.method6720(local51 & 0x7, local107.anInt8478, local67, arg0, local107.anInt8463, local45 & 0x7);
					@Pc(141) int local141 = Static82.method1311(arg0, local107.anInt8463, local67, local107.anInt8478, local45 & 0x7, local51 & 0x7) + arg2;
					if (local124 > 0 && local141 > 0 && local124 < super.anInt4863 - 1 && local141 < super.anInt4865 - 1) {
						@Pc(166) Class295 local166 = null;
						if (!super.aBoolean293) {
							@Pc(171) int local171 = arg6;
							if ((Static303.aByteArrayArrayArray13[1][local124][local141] & 0x2) == 2) {
								local171 = arg6 - 1;
							}
							if (local171 >= 0) {
								local166 = arg9[local171];
							}
						}
						this.method4184(local12, local166, local141, arg6, -1, arg8, local124, arg6, local63, local67 + arg0 & 0x3);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!sl;ILclient!oa;III)V")
	public void method4191(@OriginalArg(0) int arg0, @OriginalArg(1) Class295 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class121 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) Interface6 local7 = null;
		if (arg5 == 0) {
			local7 = (Interface6) Static120.method1814(arg0, arg4, arg2);
		}
		if (arg5 == 1) {
			local7 = (Interface6) Static178.method5953(arg0, arg4, arg2);
		}
		if (arg5 == 2) {
			local7 = (Interface6) Static134.method1995(arg0, arg4, arg2, dda.class);
		}
		if (arg5 == 3) {
			local7 = (Interface6) Static315.method4904(arg0, arg4, arg2);
		}
		if (local7 == null) {
			return;
		}
		@Pc(61) Class313 local61 = Static260.aClass100_1.method2008(local7.method7555());
		@Pc(65) int local65 = local7.method7551();
		@Pc(69) int local69 = local7.method7553();
		if (local61.method6962()) {
			Static334.method5102(arg0, arg4, arg2, local61);
		}
		if (local7.method7550()) {
			local7.method7552(arg3);
		}
		if (arg5 == 0) {
			@Pc(97) Class29_Sub5 local97 = Static120.method1814(arg0, arg4, arg2);
			if (local97 instanceof Class29_Sub5_Sub2) {
				((Class29_Sub5_Sub2) local97).aClass29_Sub5_3 = null;
			} else {
				Static428.method6252(arg0, arg4, arg2);
			}
			if (local61.anInt8469 != 0) {
				arg1.method6562(local69, arg2, arg4, local65, !local61.aBoolean583, local61.aBoolean586);
				return;
			}
			return;
		}
		if (arg5 == 1) {
			@Pc(137) Class29_Sub1 local137 = Static178.method5953(arg0, arg4, arg2);
			if (!(local137 instanceof Class29_Sub1_Sub3)) {
				Static230.method3381(arg0, arg4, arg2);
				return;
			}
			((Class29_Sub1_Sub3) local137).aClass29_Sub1_3 = null;
			return;
		}
		if (arg5 == 2) {
			@Pc(166) Class29_Sub2 local166 = Static134.method1995(arg0, arg4, arg2, dda.class);
			if (local166 instanceof Class29_Sub2_Sub5 && local166.aShort122 == arg4 && local166.aShort121 == arg2) {
				((Class29_Sub2_Sub5) local166).aClass29_Sub2_2 = null;
			} else {
				Static23.method302(arg0, arg4, arg2, dda.class);
			}
			if (local61.anInt8469 != 0 && arg4 + local61.anInt8478 < super.anInt4863 && local61.anInt8478 + arg2 < super.anInt4865 && super.anInt4863 > arg4 + local61.anInt8463 && local61.anInt8463 + arg2 < super.anInt4865) {
				arg1.method6548(local61.aBoolean586, !local61.aBoolean583, arg2, local61.anInt8463, local69, arg4, local61.anInt8478);
				return;
			}
			return;
		}
		if (arg5 != 3) {
			return;
		}
		@Pc(256) Class29_Sub3 local256 = Static315.method4904(arg0, arg4, arg2);
		if (local256 instanceof Class29_Sub3_Sub3) {
			((Class29_Sub3_Sub3) local256).aClass29_Sub3_2 = null;
		} else {
			Static556.method7615(arg0, arg4, arg2);
		}
		if (local61.anInt8469 == 1) {
			arg1.method6556(arg4, arg2);
			return;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!oa;Lclient!dga;[III)V")
	public void method4192(@OriginalArg(0) int arg0, @OriginalArg(1) Class121 arg1, @OriginalArg(2) Class6_Sub14 arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4) {
		if (super.aBoolean293) {
			return;
		}
		@Pc(18) boolean local18 = false;
		if (arg3 != null) {
			arg3[0] = -1;
		}
		@Pc(26) Class171 local26 = null;
		while (true) {
			@Pc(31) int local31;
			@Pc(47) int local47;
			@Pc(237) int local237;
			@Pc(241) int local241;
			@Pc(51) int local51;
			while (arg2.anInt7244 < arg2.aByteArray88.length) {
				local31 = arg2.method6041();
				if (local31 == 0) {
					local26 = new Class171(arg2);
				} else {
					@Pc(109) int local109;
					@Pc(113) int local113;
					@Pc(101) int local101;
					if (local31 == 1) {
						local47 = arg2.method6041();
						if (local47 > 0) {
							for (local51 = 0; local51 < local47; local51++) {
								@Pc(60) Class178 local60 = new Class178(arg1, arg2, 2);
								if (local60.anInt4470 == 31) {
									@Pc(73) Class167 local73 = Static266.aClass294_1.method6542(arg2.method6006());
									local60.method3838(local73.anInt4115, local73.anInt4116, local73.anInt4113, local73.anInt4112);
								}
								if (arg1.method7085() > 0) {
									@Pc(93) Class6_Sub7 local93 = local60.aClass6_Sub7_2;
									local101 = (arg4 << 9) + local93.method3490();
									local109 = (arg0 << 9) + local93.method3492();
									local113 = local101 >> 9;
									@Pc(117) int local117 = local109 >> 9;
									if (local113 >= 0 && local117 >= 0 && local113 < super.anInt4863 && local117 < super.anInt4865) {
										local93.method3488(local101, super.anIntArrayArrayArray17[local60.anInt4479][local113][local117] - local93.method3493(), local109);
										Static137.method2055(local60);
									}
								}
							}
						}
					} else if (local31 == 2) {
						if (local26 == null) {
							local26 = new Class171();
						}
						local26.method3640(arg2);
					} else if (local31 != 128) {
						if (local31 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray11 == null) {
							super.aByteArrayArrayArray11 = new byte[4][][];
						}
						local18 = true;
						for (local47 = 0; local47 < 4; local47++) {
							@Pc(195) byte local195 = arg2.method6034();
							if (local195 == 0 && super.aByteArrayArrayArray11[local47] != null) {
								local237 = arg4;
								local241 = arg4 + 64;
								local101 = arg0;
								if (arg0 < 0) {
									local101 = 0;
								} else if (arg0 >= super.anInt4865) {
									local101 = super.anInt4865;
								}
								if (arg4 < 0) {
									local237 = 0;
								} else if (arg4 >= super.anInt4863) {
									local237 = super.anInt4863;
								}
								local109 = arg0 + 64;
								if (local241 < 0) {
									local241 = 0;
								} else if (super.anInt4863 <= local241) {
									local241 = super.anInt4863;
								}
								if (local109 < 0) {
									local109 = 0;
								} else if (local109 >= super.anInt4865) {
									local109 = super.anInt4865;
								}
								while (local241 > local237) {
									while (local109 > local101) {
										super.aByteArrayArrayArray11[local47][local237][local101] = 0;
										local101++;
									}
									local237++;
								}
							} else if (local195 == 1) {
								if (super.aByteArrayArrayArray11[local47] == null) {
									super.aByteArrayArrayArray11[local47] = new byte[super.anInt4863 + 1][super.anInt4865 + 1];
								}
								for (local237 = 0; local237 < 64; local237 += 4) {
									for (local241 = 0; local241 < 64; local241 += 4) {
										@Pc(382) byte local382 = arg2.method6034();
										for (local109 = arg4 + local237; local109 < local237 + arg4 + 4; local109++) {
											for (local113 = local241 + arg0; local113 < local241 + arg0 + 4; local113++) {
												if (local109 >= 0 && super.anInt4863 > local109 && local113 >= 0 && local113 < super.anInt4865) {
													super.aByteArrayArrayArray11[local47][local109][local113] = local382;
												}
											}
										}
									}
								}
							} else if (local195 == 2) {
								if (super.aByteArrayArrayArray11[local47] == null) {
									super.aByteArrayArrayArray11[local47] = new byte[super.anInt4863 + 1][super.anInt4865 + 1];
								}
								if (local47 > 0) {
									local237 = arg4;
									local241 = arg4 + 64;
									local101 = arg0;
									local109 = arg0 + 64;
									if (arg0 < 0) {
										local101 = 0;
									} else if (arg0 >= super.anInt4865) {
										local101 = super.anInt4865;
									}
									if (arg4 < 0) {
										local237 = 0;
									} else if (super.anInt4863 <= arg4) {
										local237 = super.anInt4863;
									}
									if (local241 < 0) {
										local241 = 0;
									} else if (local241 >= super.anInt4863) {
										local241 = super.anInt4863;
									}
									if (local109 < 0) {
										local109 = 0;
									} else if (super.anInt4865 <= local109) {
										local109 = super.anInt4865;
									}
									while (local237 < local241) {
										while (local101 < local109) {
											super.aByteArrayArrayArray11[local47][local237][local101] = super.aByteArrayArrayArray11[local47 - 1][local237][local101];
											local101++;
										}
										local237++;
									}
								}
							}
						}
					} else if (arg3 == null) {
						arg2.anInt7244 += 10;
					} else {
						arg3[0] = arg2.method6006();
						arg3[1] = arg2.method6008();
						arg3[2] = arg2.method6008();
						arg3[3] = arg2.method6008();
						arg3[4] = arg2.method6006();
					}
				}
			}
			if (local26 != null) {
				for (local31 = 0; local31 < 8; local31++) {
					for (local47 = 0; local47 < 8; local47++) {
						local51 = local31 + (arg4 >> 3);
						local237 = (arg0 >> 3) + local47;
						if (local51 >= 0 && local51 < super.anInt4863 >> 3 && local237 >= 0 && local237 < super.anInt4865 >> 3) {
							Static443.method6359(local51, local26, local237);
						}
					}
				}
			}
			if (!local18 && super.aByteArrayArrayArray11 != null) {
				for (local31 = 0; local31 < 4; local31++) {
					if (super.aByteArrayArrayArray11[local31] != null) {
						for (local47 = 0; local47 < 16; local47++) {
							for (local51 = 0; local51 < 16; local51++) {
								local237 = (arg4 >> 2) + local47;
								local241 = local51 + (arg0 >> 2);
								if (local237 >= 0 && local237 < 26 && local241 >= 0 && local241 < 26) {
									super.aByteArrayArrayArray11[local31][local237][local241] = 0;
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

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II[IILclient!oa;IZLclient!dga;III)V")
	public void method4193(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class121 arg4, @OriginalArg(5) int arg5, @OriginalArg(7) Class6_Sub14 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		if (super.aBoolean293) {
			return;
		}
		if (arg2 != null) {
			arg2[0] = -1;
		}
		@Pc(19) Class171 local19 = null;
		@Pc(25) int local25 = (arg0 & 0x7) * 8;
		@Pc(31) int local31 = (arg9 & 0x7) * 8;
		while (true) {
			@Pc(36) int local36;
			@Pc(54) int local54;
			@Pc(325) int local325;
			@Pc(58) int local58;
			while (arg6.aByteArray88.length > arg6.anInt7244) {
				local36 = arg6.method6041();
				if (local36 == 0) {
					local19 = new Class171(arg6);
				} else {
					@Pc(107) int local107;
					@Pc(161) int local161;
					@Pc(183) int local183;
					@Pc(101) int local101;
					if (local36 == 1) {
						local54 = arg6.method6041();
						if (local54 > 0) {
							for (local58 = 0; local58 < local54; local58++) {
								@Pc(67) Class178 local67 = new Class178(arg4, arg6, 2);
								if (local67.anInt4470 == 31) {
									@Pc(78) Class167 local78 = Static266.aClass294_1.method6542(arg6.method6006());
									local67.method3838(local78.anInt4115, local78.anInt4116, local78.anInt4113, local78.anInt4112);
								}
								if (arg4.method7085() > 0) {
									@Pc(95) Class6_Sub7 local95 = local67.aClass6_Sub7_2;
									local101 = local95.method3490() >> 9;
									local107 = local95.method3492() >> 9;
									if (local67.anInt4479 == arg7 && local101 >= local25 && local25 + 8 > local101 && local107 >= local31 && local31 + 8 > local107) {
										local161 = Static264.method3743(local95.method3492() & 0xFFF, arg8, local95.method3490() & 0xFFF) + (arg5 << 9);
										local101 = local161 >> 9;
										local183 = Static379.method5527(local95.method3492() & 0xFFF, arg8, local95.method3490() & 0xFFF) + (arg3 << 9);
										local107 = local183 >> 9;
										if (local101 >= 0 && local107 >= 0 && local101 < super.anInt4863 && super.anInt4865 > local107) {
											local95.method3488(local161, super.anIntArrayArrayArray17[arg7][local101][local107] - local95.method3493(), local183);
											Static137.method2055(local67);
										}
									}
								}
							}
						}
					} else if (local36 == 2) {
						if (local19 == null) {
							local19 = new Class171();
						}
						local19.method3640(arg6);
					} else if (local36 != 128) {
						if (local36 != 129) {
							throw new IllegalStateException("");
						}
						if (super.aByteArrayArrayArray11 == null) {
							super.aByteArrayArrayArray11 = new byte[4][][];
						}
						for (local54 = 0; local54 < 4; local54++) {
							@Pc(306) byte local306 = arg6.method6034();
							@Pc(329) int local329;
							if (local306 == 0 && super.aByteArrayArrayArray11[arg1] != null) {
								if (local54 <= arg7) {
									local325 = arg5;
									local329 = arg5 + 7;
									local101 = arg3;
									local107 = arg3 + 7;
									if (local329 < 0) {
										local329 = 0;
									} else if (super.anInt4863 <= local329) {
										local329 = super.anInt4863;
									}
									if (arg5 < 0) {
										local325 = 0;
									} else if (super.anInt4863 <= arg5) {
										local325 = super.anInt4863;
									}
									if (arg3 < 0) {
										local101 = 0;
									} else if (super.anInt4865 <= arg3) {
										local101 = super.anInt4865;
									}
									if (local107 < 0) {
										local107 = 0;
									} else if (super.anInt4865 <= local107) {
										local107 = super.anInt4865;
									}
									while (local329 > local325) {
										while (local107 > local101) {
											super.aByteArrayArrayArray11[arg1][local325][local101] = 0;
											local101++;
										}
										local325++;
									}
								}
							} else if (local306 == 1) {
								if (super.aByteArrayArrayArray11[arg1] == null) {
									super.aByteArrayArrayArray11[arg1] = new byte[super.anInt4863 + 1][super.anInt4865 + 1];
								}
								for (local325 = 0; local325 < 64; local325 += 4) {
									for (local329 = 0; local329 < 64; local329 += 4) {
										@Pc(464) byte local464 = arg6.method6034();
										if (local54 <= arg7) {
											for (local107 = local325; local107 < local325 + 4; local107++) {
												for (local161 = local329; local161 < local329 + 4; local161++) {
													if (local107 >= local25 && local25 + 8 > local107 && local161 >= local31 && local31 < local31 + 8) {
														local183 = arg5 + Static468.method6554(local107 & 0x7, local161 & 0x7, arg8);
														@Pc(532) int local532 = Static131.method1965(arg8, local107 & 0x7, local161 & 0x7) + arg3;
														if (local183 >= 0 && local183 < super.anInt4863 && local532 >= 0 && local532 < super.anInt4865) {
															super.aByteArrayArrayArray11[arg1][local183][local532] = local464;
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
						arg6.anInt7244 += 10;
					} else {
						arg2[0] = arg6.method6006();
						arg2[1] = arg6.method6008();
						arg2[2] = arg6.method6008();
						arg2[3] = arg6.method6008();
						arg2[4] = arg6.method6006();
					}
				}
			}
			if (local19 != null) {
				Static443.method6359(arg5 >> 3, local19, arg3 >> 3);
			}
			if (super.aByteArrayArrayArray11 != null && super.aByteArrayArrayArray11[arg1] != null) {
				local36 = arg5 + 7;
				local54 = arg3 + 7;
				for (local58 = arg5; local58 < local36; local58++) {
					for (local325 = arg3; local325 < local54; local325++) {
						super.aByteArrayArrayArray11[arg1][local58][local325] = 0;
					}
				}
				return;
			}
			return;
		}
	}
}
