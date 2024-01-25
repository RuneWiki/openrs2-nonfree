import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vk", name = "j", descriptor = "[I")
	public static final int[] anIntArray529 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "([Lclient!hh;IILclient!uo;IIZIII[BB)[I")
	public static int[] method5481(@OriginalArg(0) Class92[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class129 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) byte[] arg10) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg9 & 0x7) * 8;
		@Pc(25) int local25;
		@Pc(29) int local29;
		if (!arg6) {
			@Pc(23) Class92 local23 = arg0[arg7];
			for (local25 = 0; local25 < 8; local25++) {
				for (local29 = 0; local29 < 8; local29++) {
					@Pc(43) int local43 = arg2 + Static98.method1459(local25 & 0x7, arg8, local29 & 0x7);
					@Pc(56) int local56 = arg1 + Static89.method1292(local25 & 0x7, local29 & 0x7, arg8);
					if (local43 > 0 && local43 < Static24.anInt454 - 1 && local56 > 0 && local56 < Static240.anInt4832 - 1) {
						local23.method1755(local56, local43);
					}
				}
			}
		}
		@Pc(90) byte local90;
		if (arg6) {
			local90 = 1;
		} else {
			local90 = 4;
		}
		@Pc(104) Class11_Sub25 local104 = new Class11_Sub25(arg10);
		local25 = (arg4 & 0xFFFFFFF8) << 3;
		local29 = (arg9 & 0x1FFFFFF8) << 3;
		@Pc(118) byte local118 = 0;
		@Pc(120) byte local120 = 0;
		if (arg8 == 1) {
			local120 = 1;
		} else if (arg8 == 2) {
			local120 = 1;
			local118 = 1;
		} else if (arg8 == 3) {
			local118 = 1;
		}
		@Pc(220) int local220;
		@Pc(233) int local233;
		@Pc(267) int local267;
		@Pc(274) int local274;
		@Pc(297) int local297;
		@Pc(290) int local290;
		for (@Pc(143) int local143 = 0; local143 < local90; local143++) {
			for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
				for (@Pc(151) int local151 = 0; local151 < 64; local151++) {
					if (local143 != arg5 || local147 < local11 || local11 + 8 < local147 || local151 < local17 || local17 + 8 < local151) {
						Static300.method5112(-1, 0, 0, 0, 0, 0, false, 0, -1, local104, arg6);
					} else if (local11 + 8 == local147 || local151 == local17 + 8) {
						if (arg8 == 0) {
							local233 = local151 + arg1 - local17;
							local220 = local147 + arg2 - local11;
						} else if (arg8 == 1) {
							local220 = local151 + arg2 - local17;
							local233 = arg1 + local11 + 8 - local147;
						} else if (arg8 == 2) {
							local233 = local17 + arg1 + 8 - local151;
							local220 = arg2 + local11 + 8 - local147;
						} else {
							local233 = arg1 + local147 - local11;
							local220 = arg2 + local17 + 8 - local151;
						}
						Static300.method5112(local233, 0, arg7, local147 + local25, 0, 0, true, local29 + local151, local220, local104, arg6);
					} else {
						local220 = arg2 + Static98.method1459(local147 & 0x7, arg8, local151 & 0x7);
						local233 = arg1 + Static89.method1292(local147 & 0x7, local151 & 0x7, arg8);
						Static300.method5112(local233, arg8, arg7, local25 + local147, local120, local118, false, local151 + local29, local220, local104, arg6);
						if (local147 == 63 || local151 == 63) {
							local267 = local147 == 63 ? 64 : local147;
							local274 = local151 == 63 ? 64 : local151;
							if (arg8 == 0) {
								local290 = arg1 + local274 - local17;
								local297 = local267 + arg2 - local11;
							} else if (arg8 == 1) {
								local290 = local11 + arg1 + 8 - local267;
								local297 = local274 + arg2 - local17;
							} else if (arg8 == 2) {
								local290 = local17 + arg1 + 8 - local274;
								local297 = local11 + arg2 + 8 - local267;
							} else {
								local290 = arg1 + local267 - local11;
								local297 = arg2 + local17 + 8 - local274;
							}
							if (local297 >= 0 && Static24.anInt454 > local297 && local290 >= 0 && Static240.anInt4832 > local290) {
								Static263.anIntArrayArrayArray13[arg7][local297][local290] = Static263.anIntArrayArrayArray13[arg7][local118 + local220][local233 + local120];
							}
						}
					}
				}
			}
		}
		@Pc(515) boolean local515 = false;
		@Pc(620) int local620;
		@Pc(704) int local704;
		@Pc(747) int local747;
		while (local104.anInt6076 < local104.aByteArray93.length) {
			local220 = local104.method5185();
			if (local220 == 128) {
				Static193.anIntArray304[0] = local104.method5187();
				Static193.anIntArray304[1] = local104.method5220();
				Static193.anIntArray304[2] = local104.method5220();
				Static193.anIntArray304[3] = local104.method5220();
				local515 = true;
				Static193.anIntArray304[4] = local104.method5187();
			} else {
				if (local220 != 129) {
					local104.anInt6076--;
					break;
				}
				if (Static128.aByteArrayArrayArray4 == null) {
					Static128.aByteArrayArrayArray4 = new byte[4][][];
				}
				for (local233 = 0; local233 < 4; local233++) {
					@Pc(552) byte local552 = local104.method5175();
					if (local552 == 0 && Static128.aByteArrayArrayArray4[arg7] != null) {
						if (arg5 >= local233) {
							local274 = arg2;
							local297 = arg2 + 7;
							local290 = arg1;
							if (local297 < 0) {
								local297 = 0;
							} else if (local297 >= Static24.anInt454) {
								local297 = Static24.anInt454;
							}
							if (arg1 < 0) {
								local290 = 0;
							} else if (Static240.anInt4832 <= arg1) {
								local290 = Static240.anInt4832;
							}
							if (arg2 < 0) {
								local274 = 0;
							} else if (arg2 >= Static24.anInt454) {
								local274 = Static24.anInt454;
							}
							local620 = arg1 + 7;
							if (local620 < 0) {
								local620 = 0;
							} else if (local620 >= Static240.anInt4832) {
								local620 = Static240.anInt4832;
							}
							while (local297 > local274) {
								while (local290 < local620) {
									Static128.aByteArrayArrayArray4[arg7][local274][local290] = 0;
									local290++;
								}
								local274++;
							}
						}
					} else if (local552 == 1) {
						if (Static128.aByteArrayArrayArray4[arg7] == null) {
							Static128.aByteArrayArrayArray4[arg7] = new byte[Static24.anInt454 + 1][Static240.anInt4832 + 1];
						}
						for (local274 = 0; local274 < 64; local274 += 4) {
							for (local297 = 0; local297 < 64; local297 += 4) {
								@Pc(691) byte local691 = local104.method5175();
								if (arg5 >= local233) {
									for (local620 = local274; local620 < local274 + 4; local620++) {
										for (local704 = local297; local704 < local297 + 4; local704++) {
											if (local620 >= local11 && local620 < local11 + 8 && local17 <= local704 && local17 < local17 + 8) {
												local747 = arg2 + Static98.method1459(local620 & 0x7, arg8, local704 & 0x7);
												@Pc(759) int local759 = Static89.method1292(local620 & 0x7, local704 & 0x7, arg8) + arg1;
												if (local747 >= 0 && local747 < Static24.anInt454 && local759 >= 0 && Static240.anInt4832 > local759) {
													Static128.aByteArrayArrayArray4[arg7][local747][local759] = local691;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
		if (!arg6) {
			@Pc(859) Class214 local859 = null;
			while (true) {
				while (local104.aByteArray93.length > local104.anInt6076) {
					local233 = local104.method5185();
					if (local233 == 0) {
						local859 = new Class214(local104);
					} else if (local233 == 1) {
						local267 = local104.method5185();
						if (local267 > 0) {
							for (local274 = 0; local274 < local267; local274++) {
								@Pc(891) Class11_Sub5_Sub1 local891 = new Class11_Sub5_Sub1(local104);
								if (local891.anInt1302 == 31) {
									@Pc(901) Class13 local901 = Static208.method5453(local104.method5187());
									local891.method1044(local901.anInt222, local901.anInt220, local901.anInt225, local901.anInt226);
								}
								local290 = local891.anInt1285 >> 7;
								local620 = local891.anInt1286 >> 7;
								if (arg5 == local891.anInt1306 && local11 <= local290 && local290 < local11 + 8 && local17 <= local620 && local17 + 8 > local620) {
									local704 = Static48.method705(arg8, local891.anInt1285 & 0x3FF, local891.anInt1286 & 0x3FF) + (arg2 << 7);
									local747 = (arg1 << 7) + method5482(arg8, local891.anInt1285 & 0x3FF, local891.anInt1286 & 0x3FF);
									local891.anInt1286 = local747;
									local891.anInt1285 = local704;
									local290 = local891.anInt1285 >> 7;
									local620 = local891.anInt1286 >> 7;
									if (local290 >= 0 && local620 >= 0 && local290 < Static24.anInt454 && local620 < Static240.anInt4832) {
										local891.anInt1287 = Static263.anIntArrayArrayArray13[arg5][local290][local620] - local891.anInt1287;
										if (arg3.method5000() > 0) {
											Static267.method4624(local891);
										}
									}
								}
							}
						}
					} else if (local233 == 2) {
						if (local859 == null) {
							local859 = new Class214();
						}
						local859.method5662(local104);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local859 != null) {
					Static225.method4019(local859, arg2 >> 3, arg1 >> 3);
				}
				break;
			}
		}
		if (Static128.aByteArrayArrayArray4 != null && Static128.aByteArrayArrayArray4[arg7] != null) {
			local220 = arg2 + 7;
			local233 = arg1 + 7;
			for (local267 = arg2; local267 < local220; local267++) {
				for (local274 = arg1; local274 < local233; local274++) {
					Static128.aByteArrayArrayArray4[arg7][local267][local274] = 0;
				}
			}
		}
		if (local515) {
			return Static193.anIntArray304;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIII)I")
	private static int method5482(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 & 0x3;
		if (local7 == 0) {
			return arg2;
		} else if (local7 == 1) {
			return 1023 - arg1;
		} else if (local7 == 2) {
			return 1023 - arg2;
		} else {
			return arg1;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V")
	public static void method5483() {
		if (Static270.anInt5491 == -1) {
			return;
		}
		@Pc(12) int local12 = Static214.aClass29_1.method384();
		@Pc(16) int local16 = Static214.aClass29_1.method381();
		if (Static182.aClass11_Sub39_1 != null) {
			local12 = Static182.aClass11_Sub39_1.method5601();
			local16 = Static182.aClass11_Sub39_1.method5598();
		}
		Static306.method5149(Static79.anInt5259, 0, Static270.anInt5491, local16, 0, 0, local12, 0, Static164.anInt3090);
		if (Static238.aClass137_14 != null) {
			Static214.method3861(local12, local16);
		}
	}
}
