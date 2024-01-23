import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
	public static int anInt3542;

	@OriginalMember(owner = "client!lj", name = "d", descriptor = "Lclient!tl;")
	public static Class155 aClass155_30 = new Class155(64);

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "Z")
	public static boolean aBoolean183 = true;

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
	public static int anInt3543 = 0;

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
	public static int anInt3544 = 0;

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "[I")
	public static int[] anIntArray326 = new int[500];

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)I")
	public static int method2855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg1 > 0) {
			local7 = arg0 & 0x1 | local7 << 1;
			arg1--;
			arg0 >>>= 0x1;
		}
		return local7;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(BI)I")
	public static int method2856(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "([BIIIIIIZB[Lclient!de;I)[I")
	public static int[] method2859(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7, @OriginalArg(9) Class36[] arg8, @OriginalArg(10) int arg9) {
		@Pc(11) int local11 = (arg2 & 0x7) * 8;
		@Pc(17) int local17 = (arg3 & 0x7) * 8;
		@Pc(29) int local29;
		@Pc(46) int local46;
		if (!arg7) {
			for (@Pc(22) int local22 = 0; local22 < 8; local22++) {
				for (local29 = 0; local29 < 8; local29++) {
					local46 = arg6 + Static251.method4278(arg9, local22 & 0x7, local29 & 0x7);
					@Pc(58) int local58 = Static252.method4306(local22 & 0x7, local29 & 0x7, arg9) + arg5;
					if (local46 > 0 && local46 < 103 && local58 > 0 && local58 < 103) {
						arg8[arg1].anIntArrayArray7[local46][local58] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(103) byte local103;
		if (arg7) {
			local103 = 1;
		} else {
			local103 = 4;
		}
		local29 = (arg2 & 0xFFFFFFF8) << 3;
		local46 = (arg3 & 0xFFFFFFF8) << 3;
		@Pc(129) Class1_Sub16 local129 = new Class1_Sub16(arg0);
		@Pc(131) byte local131 = 0;
		@Pc(133) byte local133 = 0;
		if (arg9 == 1) {
			local133 = 1;
		} else if (arg9 == 2) {
			local131 = 1;
			local133 = 1;
		} else if (arg9 == 3) {
			local131 = 1;
		}
		@Pc(167) int local167;
		@Pc(224) int local224;
		@Pc(230) int local230;
		@Pc(382) int local382;
		@Pc(373) int local373;
		@Pc(394) int local394;
		@Pc(400) int local400;
		for (@Pc(157) int local157 = 0; local157 < local103; local157++) {
			for (@Pc(162) int local162 = 0; local162 < 64; local162++) {
				for (local167 = 0; local167 < 64; local167++) {
					if (arg4 != local157 || local11 > local162 || local11 + 8 < local162 || local17 > local167 || local17 + 8 < local167) {
						Static196.method3523(arg7, 0, local129, 0, 0, 0, -1, 0, 0, -1, false);
					} else if (local162 == local11 + 8 || local17 + 8 == local167) {
						if (arg9 == 0) {
							local224 = arg6 + local162 - local11;
							local230 = arg5 + local167 - local17;
						} else if (arg9 == 1) {
							local230 = arg5 + local11 + 8 - local162;
							local224 = local167 + arg6 - local17;
						} else if (arg9 == 2) {
							local224 = arg6 + local11 + 8 - local162;
							local230 = local17 + arg5 + 8 - local167;
						} else {
							local224 = arg6 + local17 + 8 - local167;
							local230 = local162 + arg5 - local11;
						}
						Static196.method3523(arg7, 0, local129, local29 + local162, 0, 0, local230, arg1, local46 + local167, local224, true);
					} else {
						local224 = Static251.method4278(arg9, local162 & 0x7, local167 & 0x7) + arg6;
						local230 = arg5 + Static252.method4306(local162 & 0x7, local167 & 0x7, arg9);
						Static196.method3523(arg7, local131, local129, local162 + local29, local133, arg9, local230, arg1, local167 + local46, local224, false);
						if (local162 == 63 || local167 == 63) {
							local373 = local167 == 63 ? 64 : local167;
							local382 = local162 == 63 ? 64 : local162;
							if (arg9 == 0) {
								local394 = local382 + arg6 - local11;
								local400 = local373 + arg5 - local17;
							} else if (arg9 == 1) {
								local394 = local373 + arg6 - local17;
								local400 = arg5 + local11 + 8 - local382;
							} else if (arg9 == 2) {
								local400 = arg5 + local17 + 8 - local373;
								local394 = local11 + arg6 + 8 - local382;
							} else {
								local400 = arg5 + local382 - local11;
								local394 = arg6 + local17 + 8 - local373;
							}
							if (local394 >= 0 && local394 < 104 && local400 >= 0 && local400 < 104) {
								Static287.anIntArrayArrayArray18[arg1][local394][local400] = Static287.anIntArrayArrayArray18[arg1][local224 + local131][local230 + local133];
							}
						}
					}
				}
			}
		}
		@Pc(528) boolean local528 = false;
		@Pc(714) int local714;
		@Pc(760) int local760;
		while (local129.aByteArray39.length > local129.anInt3328) {
			local167 = local129.method2655();
			if (local167 == 128) {
				Static225.anIntArray515[0] = local129.method2652();
				Static225.anIntArray515[1] = local129.method2645();
				local528 = true;
				Static225.anIntArray515[2] = local129.method2645();
				Static225.anIntArray515[3] = local129.method2645();
				Static225.anIntArray515[4] = local129.method2652();
			} else {
				if (local167 != 129) {
					local129.anInt3328--;
					break;
				}
				for (local224 = 0; local224 < 4; local224++) {
					@Pc(561) byte local561 = local129.method2633();
					if (local561 == 0) {
						if (local224 <= arg4) {
							local373 = arg6 + 7;
							if (local373 < 0) {
								local373 = 0;
							} else if (local373 >= 104) {
								local373 = 104;
							}
							local382 = arg6;
							local400 = arg5 + 7;
							if (local400 < 0) {
								local400 = 0;
							} else if (local400 >= 104) {
								local400 = 104;
							}
							if (arg6 < 0) {
								local382 = 0;
							} else if (arg6 >= 104) {
								local382 = 104;
							}
							local394 = arg5;
							if (arg5 < 0) {
								local394 = 0;
							} else if (arg5 >= 104) {
								local394 = 104;
							}
							while (local373 > local382) {
								while (local400 > local394) {
									Static75.aByteArrayArrayArray11[arg1][local382][local394] = 0;
									local394++;
								}
								local382++;
							}
						}
					} else if (local561 == 1) {
						for (local382 = 0; local382 < 64; local382 += 4) {
							for (local373 = 0; local373 < 64; local373 += 4) {
								@Pc(698) byte local698 = local129.method2633();
								if (arg4 >= local224) {
									for (local400 = local382; local400 < local382 + 4; local400++) {
										for (local714 = local373; local714 < local373 + 4; local714++) {
											if (local11 <= local400 && local11 + 8 > local400 && local714 >= local17 && local17 < local17 + 8) {
												local760 = Static251.method4278(arg9, local400 & 0x7, local714 & 0x7) + arg6;
												@Pc(772) int local772 = arg5 + Static252.method4306(local400 & 0x7, local714 & 0x7, arg9);
												if (local760 >= 0 && local760 < 104 && local772 >= 0 && local772 < 104) {
													Static75.aByteArrayArrayArray11[arg1][local760][local772] = local698;
												}
											}
										}
									}
								}
							}
						}
					} else if (local561 == 2) {
					}
				}
			}
		}
		if (Static296.aBoolean335 && !arg7) {
			@Pc(859) Class59 local859 = null;
			while (true) {
				while (local129.aByteArray39.length > local129.anInt3328) {
					local224 = local129.method2655();
					if (local224 == 0) {
						local859 = new Class59(local129);
					} else if (local224 == 1) {
						local230 = local129.method2655();
						if (local230 > 0) {
							for (local382 = 0; local382 < local230; local382++) {
								@Pc(904) Class103 local904 = new Class103(local129);
								if (local904.anInt3865 == 31) {
									@Pc(915) Class93 local915 = Static258.method4393(local129.method2652());
									local904.method3139(local915.anInt3539, local915.anInt3538, local915.anInt3546, local915.anInt3547);
								}
								local394 = local904.anInt3861 >> 7;
								local400 = local904.anInt3854 >> 7;
								if (arg4 == local904.anInt3848 && local394 >= local11 && local11 + 8 > local394 && local400 >= local17 && local400 < local17 + 8) {
									local714 = (arg6 << 7) + Static182.method3510(arg9, local904.anInt3861 & 0x3FF, local904.anInt3854 & 0x3FF);
									local760 = Static286.method4700(local904.anInt3861 & 0x3FF, local904.anInt3854 & 0x3FF, arg9) + (arg5 << 7);
									local904.anInt3854 = local760;
									local904.anInt3861 = local714;
									local400 = local904.anInt3854 >> 7;
									local394 = local904.anInt3861 >> 7;
									if (local394 >= 0 && local400 >= 0 && local394 < 104 && local400 < 104) {
										local904.aBoolean197 = (Static126.aByteArrayArrayArray24[1][local394][local400] & 0x2) != 0;
										local904.anInt3849 = Static287.anIntArrayArrayArray18[local904.anInt3848][local394][local400] - local904.anInt3849;
										Static67.method1282(local904);
									}
								}
							}
						}
					} else if (local224 == 2) {
						if (local859 == null) {
							local859 = new Class59();
						}
						local859.method1455(local129);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local859 == null) {
					local859 = new Class59();
				}
				Static112.aClass59ArrayArray1[arg6 >> 3][arg5 >> 3] = local859;
				break;
			}
		}
		local167 = arg6 + 7;
		local224 = arg5 + 7;
		for (local230 = arg6; local230 < local167; local230++) {
			for (local382 = arg5; local382 < local224; local382++) {
				Static75.aByteArrayArrayArray11[arg1][local230][local382] = 0;
			}
		}
		return local528 ? Static225.anIntArray515 : null;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIB)V")
	public static void method2861(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (arg1 >= arg0) {
			Static89.method1538(Static57.anIntArrayArray9[arg2], arg1, arg0, arg3);
		} else {
			Static89.method1538(Static57.anIntArrayArray9[arg2], arg0, arg1, arg3);
		}
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!ok;III)V")
	public static void method2862(@OriginalArg(0) Class116 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (Static111.anInt2398 < 2 && Static272.anInt5854 == 0 && !Static16.aBoolean22) {
			return;
		}
		@Pc(19) String local19 = Static22.method393();
		if (arg0 == null) {
			@Pc(88) int local88 = Static156.aClass1_Sub2_Sub16_3.method3979(local19, arg2 + 4, arg1 - -15, Static73.aRandom1, Static173.anInt3931);
			Static205.method3644(Static156.aClass1_Sub2_Sub16_3.method3966(local19) + local88, arg2 + 4, 15, arg1);
			return;
		}
		@Pc(31) Class1_Sub2_Sub16 local31 = arg0.method3428(Static216.aClass7Array3);
		if (local31 == null) {
			local31 = Static156.aClass1_Sub2_Sub16_3;
		}
		local31.method3976(local19, arg2, arg1, arg0.anInt4299, arg0.anInt4363, arg0.anInt4294, arg0.anInt4341, arg0.anInt4378, arg0.anInt4358, Static73.aRandom1, Static173.anInt3931, Static261.anIntArray567);
		Static205.method3644(Static261.anIntArray567[2], Static261.anIntArray567[0], Static261.anIntArray567[3], Static261.anIntArray567[1]);
	}
}
