import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static147 {

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "I")
	public static int anInt3204;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "Lclient!wo;")
	public static Class216 aClass216_53;

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "Lclient!hq;")
	public static final Class87 aClass87_28 = new Class87(4);

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIIIIZII)V")
	public static void method2934(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3, @OriginalArg(7) int arg4) {
		Static47.method1288(arg0, arg4, arg2, arg3, arg1, 0);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(II)Lclient!rd;")
	public static Class177 method2935(@OriginalArg(0) int arg0) {
		@Pc(10) Class177 local10 = (Class177) Static301.aClass87_51.method2482((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static72.aClass216_26.method5648(0, arg0);
		local10 = new Class177();
		if (local20 != null) {
			local10.method4706(new Class1_Sub8(local20));
		}
		local10.method4707();
		Static301.aClass87_51.method2481(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ILclient!tf;)V")
	public static void method2936(@OriginalArg(1) Class1_Sub1 arg0) {
		arg0.aBoolean566 = false;
		if (arg0.aClass1_Sub15_5 != null) {
			arg0.aClass1_Sub15_5.anInt6344 = 0;
		}
		for (@Pc(24) Class1_Sub1 local24 = arg0.method5029(); local24 != null; local24 = arg0.method5033()) {
			method2936(local24);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)V")
	public static void method2937(@OriginalArg(0) int arg0) {
		if (Static279.method4856(arg0)) {
			Static210.method4009(Static348.aClass12ArrayArray1[arg0], -1);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "([BI[Lclient!g;IIIZILclient!uo;III)[I")
	public static int[] method2938(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class71[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) boolean arg6, @OriginalArg(7) int arg7, @OriginalArg(8) Class32 arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11 = (arg4 & 0x7) * 8;
		@Pc(17) int local17 = (arg7 & 0x7) * 8;
		@Pc(21) byte local21;
		if (arg6) {
			local21 = 1;
		} else {
			local21 = 4;
		}
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (!arg6) {
			@Pc(31) Class71 local31 = arg2[arg5];
			for (local33 = 0; local33 < 8; local33++) {
				for (local37 = 0; local37 < 8; local37++) {
					@Pc(51) int local51 = Static296.method4976(local33 & 0x7, arg9, local37 & 0x7) + arg1;
					@Pc(63) int local63 = arg10 + Static70.method1628(local37 & 0x7, local33 & 0x7, arg9);
					if (local51 > 0 && Static233.anInt5573 - 1 > local51 && local63 > 0 && local63 < Static134.anInt2971 - 1) {
						local31.method1946(local51, local63);
					}
				}
			}
		}
		@Pc(104) Class1_Sub8 local104 = new Class1_Sub8(arg0);
		local33 = (arg4 & 0x1FFFFFF8) << 3;
		local37 = (arg7 & 0xFFFFFFF8) << 3;
		@Pc(118) byte local118 = 0;
		@Pc(120) byte local120 = 0;
		if (arg9 == 1) {
			local120 = 1;
		} else if (arg9 == 2) {
			local118 = 1;
			local120 = 1;
		} else if (arg9 == 3) {
			local118 = 1;
		}
		@Pc(212) int local212;
		@Pc(225) int local225;
		@Pc(257) int local257;
		@Pc(266) int local266;
		@Pc(299) int local299;
		@Pc(289) int local289;
		for (@Pc(149) int local149 = 0; local149 < local21; local149++) {
			for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
				for (@Pc(157) int local157 = 0; local157 < 64; local157++) {
					if (local149 != arg3 || local153 < local11 || local11 + 8 < local153 || local157 < local17 || local157 > local17 + 8) {
						Static80.method1808(0, -1, arg6, 0, false, 0, 0, local104, 0, -1, 0);
					} else if (local11 + 8 == local153 || local17 + 8 == local157) {
						if (arg9 == 0) {
							local212 = arg1 + local153 - local11;
							local225 = local157 + arg10 - local17;
						} else if (arg9 == 1) {
							local225 = arg10 + local11 + 8 - local153;
							local212 = local157 + arg1 - local17;
						} else if (arg9 == 2) {
							local212 = local11 + arg1 + 8 - local153;
							local225 = local17 + arg10 + 8 - local157;
						} else {
							local212 = local17 + arg1 + 8 - local157;
							local225 = arg10 + local153 - local11;
						}
						Static80.method1808(0, local212, arg6, arg5, true, local33 + local153, 0, local104, local157 + local37, local225, 0);
					} else {
						local212 = Static296.method4976(local153 & 0x7, arg9, local157 & 0x7) + arg1;
						local225 = arg10 + Static70.method1628(local157 & 0x7, local153 & 0x7, arg9);
						Static80.method1808(arg9, local212, arg6, arg5, false, local153 + local33, local120, local104, local157 + local37, local225, local118);
						if (local153 == 63 || local157 == 63) {
							local257 = local153 == 63 ? 64 : local153;
							local266 = local157 == 63 ? 64 : local157;
							if (arg9 == 0) {
								local299 = arg1 + local257 - local11;
								local289 = arg10 + local266 - local17;
							} else if (arg9 == 1) {
								local299 = local266 + arg1 - local17;
								local289 = arg10 + local11 + 8 - local257;
							} else if (arg9 == 2) {
								local289 = local17 + arg10 + 8 - local266;
								local299 = arg1 + local11 + 8 - local257;
							} else {
								local289 = arg10 + local257 - local11;
								local299 = arg1 + local17 + 8 - local266;
							}
							if (local299 >= 0 && local299 < Static233.anInt5573 && local289 >= 0 && Static134.anInt2971 > local289) {
								Static251.anIntArrayArrayArray15[arg5][local299][local289] = Static251.anIntArrayArrayArray15[arg5][local118 + local212][local120 + local225];
							}
						}
					}
				}
			}
		}
		@Pc(523) boolean local523 = false;
		@Pc(604) int local604;
		@Pc(608) int local608;
		@Pc(646) int local646;
		while (local104.anInt5182 < local104.aByteArray81.length) {
			local212 = local104.method4532();
			if (local212 == 128) {
				Static3.anIntArray17[0] = local104.method4556();
				Static3.anIntArray17[1] = local104.method4551();
				Static3.anIntArray17[2] = local104.method4551();
				Static3.anIntArray17[3] = local104.method4551();
				local523 = true;
				Static3.anIntArray17[4] = local104.method4556();
			} else {
				if (local212 != 129) {
					local104.anInt5182--;
					break;
				}
				if (Static37.aByteArrayArrayArray1 == null) {
					Static37.aByteArrayArrayArray1 = new byte[4][][];
				}
				for (local225 = 0; local225 < 4; local225++) {
					@Pc(558) byte local558 = local104.method4558();
					if (local558 == 0 && Static37.aByteArrayArrayArray1[arg5] != null) {
						if (arg3 >= local225) {
							local266 = arg1;
							local299 = arg1 + 7;
							local289 = arg10;
							if (arg10 < 0) {
								local289 = 0;
							} else if (Static134.anInt2971 <= arg10) {
								local289 = Static134.anInt2971;
							}
							if (arg1 < 0) {
								local266 = 0;
							} else if (arg1 >= Static233.anInt5573) {
								local266 = Static233.anInt5573;
							}
							local604 = arg10 + 7;
							if (local299 < 0) {
								local299 = 0;
							} else if (local299 >= Static233.anInt5573) {
								local299 = Static233.anInt5573;
							}
							if (local604 < 0) {
								local604 = 0;
							} else if (Static134.anInt2971 <= local604) {
								local604 = Static134.anInt2971;
							}
							while (local266 < local299) {
								while (local604 > local289) {
									Static37.aByteArrayArrayArray1[arg5][local266][local289] = 0;
									local289++;
								}
								local266++;
							}
						}
					} else if (local558 == 1) {
						if (Static37.aByteArrayArrayArray1[arg5] == null) {
							Static37.aByteArrayArrayArray1[arg5] = new byte[Static233.anInt5573 + 1][Static134.anInt2971 + 1];
						}
						for (local266 = 0; local266 < 64; local266 += 4) {
							for (local299 = 0; local299 < 64; local299 += 4) {
								@Pc(595) byte local595 = local104.method4558();
								if (local225 <= arg3) {
									for (local604 = local266; local604 < local266 + 4; local604++) {
										for (local608 = local299; local608 < local299 + 4; local608++) {
											if (local604 >= local11 && local11 + 8 > local604 && local608 >= local17 && local17 + 8 > local17) {
												local646 = arg1 + Static296.method4976(local604 & 0x7, arg9, local608 & 0x7);
												@Pc(658) int local658 = Static70.method1628(local608 & 0x7, local604 & 0x7, arg9) + arg10;
												if (local646 >= 0 && Static233.anInt5573 > local646 && local658 >= 0 && Static134.anInt2971 > local658) {
													Static37.aByteArrayArrayArray1[arg5][local646][local658] = local595;
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
			@Pc(862) Class165 local862 = null;
			while (true) {
				while (local104.aByteArray81.length > local104.anInt5182) {
					local225 = local104.method4532();
					if (local225 == 0) {
						local862 = new Class165(local104);
					} else if (local225 == 1) {
						local257 = local104.method4532();
						if (local257 > 0) {
							for (local266 = 0; local266 < local257; local266++) {
								@Pc(917) Class1_Sub30_Sub1 local917 = new Class1_Sub30_Sub1(local104);
								if (local917.anInt5307 == 31) {
									@Pc(927) Class205 local927 = Static127.method2622(local104.method4556());
									local917.method4623(local927.anInt6226, local927.anInt6230, local927.anInt6229, local927.anInt6224);
								}
								local289 = local917.anInt5299 >> 7;
								local604 = local917.anInt5297 >> 7;
								if (arg3 == local917.anInt5311 && local11 <= local289 && local11 + 8 > local289 && local604 >= local17 && local17 + 8 > local604) {
									local608 = Static104.method2137(local917.anInt5299 & 0x3FF, arg9, local917.anInt5297 & 0x3FF) + (arg1 << 7);
									local646 = (arg10 << 7) + Static321.method5245(local917.anInt5299 & 0x3FF, arg9, local917.anInt5297 & 0x3FF);
									local917.anInt5299 = local608;
									local917.anInt5297 = local646;
									local289 = local917.anInt5299 >> 7;
									local604 = local917.anInt5297 >> 7;
									if (local289 >= 0 && local604 >= 0 && local289 < Static233.anInt5573 && local604 < Static134.anInt2971) {
										local917.anInt5298 = Static251.anIntArrayArrayArray15[arg3][local289][local604] - local917.anInt5298;
										if (arg8.method2240() > 0) {
											Static74.method1708(local917);
										}
									}
								}
							}
						}
					} else if (local225 == 2) {
						if (local862 == null) {
							local862 = new Class165();
						}
						local862.method4378(local104);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local862 != null) {
					Static326.method2232(arg10 >> 3, arg1 >> 3, local862);
				}
				break;
			}
		}
		if (Static37.aByteArrayArrayArray1 != null && Static37.aByteArrayArrayArray1[arg5] != null) {
			local212 = arg1 + 7;
			local225 = arg10 + 7;
			for (local257 = arg1; local257 < local212; local257++) {
				for (local266 = arg10; local266 < local225; local266++) {
					Static37.aByteArrayArrayArray1[arg5][local257][local266] = 0;
				}
			}
		}
		if (local523) {
			return Static3.anIntArray17;
		} else {
			return null;
		}
	}
}
