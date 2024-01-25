import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static121 {

	@OriginalMember(owner = "client!he", name = "a", descriptor = "I")
	public static int anInt2556;

	@OriginalMember(owner = "client!he", name = "l", descriptor = "[Z")
	public static boolean[] aBooleanArray10;

	@OriginalMember(owner = "client!he", name = "m", descriptor = "[Lclient!s;")
	public static Class105[] aClass105Array3;

	@OriginalMember(owner = "client!he", name = "q", descriptor = "[[B")
	public static byte[][] aByteArrayArray8;

	@OriginalMember(owner = "client!he", name = "d", descriptor = "Z")
	public static boolean aBoolean244 = false;

	@OriginalMember(owner = "client!he", name = "h", descriptor = "I")
	public static int anInt2558 = 0;

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public static void method2358(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class2 local14 = Static135.aClass41_15.method896(); local14 != null; local14 = Static135.aClass41_15.method904()) {
			if ((local14.aLong219 >> 48 & 0xFFFFL) == (long) arg0) {
				local14.method5723();
			}
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZLclient!ei;)V")
	public static void method2359(@OriginalArg(1) Class57_Sub3 arg0) {
		arg0.aClass1_Sub2_Sub3_1 = null;
		if (Static234.anInt5029 < 20) {
			Static286.aClass193_8.method5222(arg0);
			Static234.anInt5029++;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIB)V")
	public static void method2360(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg0 == 0) {
			Static300.method5057(Static68.aClass157_42);
		}
		if (arg0 == 1) {
			Static300.method5057(Static55.aClass157_33);
		}
		Static197.aClass2_Sub12_Sub2_2.method3158(Static150.anInt3453 + arg1);
		Static197.aClass2_Sub12_Sub2_2.method3133(Static166.aClass25_1.method398(82) ? 1 : 0);
		Static197.aClass2_Sub12_Sub2_2.method3121(Static287.anInt5776 + arg2);
		Static57.anInt1013 = arg1;
		Static360.anInt6858 = arg2;
		Static100.aBoolean187 = false;
		Static107.method2099();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(ZZ[Lclient!ek;IIIIILclient!dr;[BII)[I")
	public static int[] method2361(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class61[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class37 arg7, @OriginalArg(9) byte[] arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10) {
		@Pc(11) int local11 = (arg10 & 0x7) * 8;
		@Pc(17) int local17 = (arg2 & 0x7) * 8;
		@Pc(21) byte local21;
		if (arg0) {
			local21 = 1;
		} else {
			local21 = 4;
		}
		@Pc(33) int local33;
		@Pc(37) int local37;
		if (!arg0) {
			@Pc(31) Class61 local31 = arg1[arg5];
			for (local33 = 0; local33 < 8; local33++) {
				for (local37 = 0; local37 < 8; local37++) {
					@Pc(51) int local51 = Static200.method3771(local33 & 0x7, arg3, local37 & 0x7) + arg4;
					@Pc(63) int local63 = Static112.method2176(local33 & 0x7, arg3, local37 & 0x7) + arg6;
					if (local51 > 0 && Static66.anInt1177 - 1 > local51 && local63 > 0 && Static12.anInt213 - 1 > local63) {
						local31.method1601(local51, local63);
					}
				}
			}
		}
		@Pc(101) Class2_Sub12 local101 = new Class2_Sub12(arg8);
		local33 = (arg10 & 0x1FFFFFF8) << 3;
		local37 = (arg2 & 0x1FFFFFF8) << 3;
		@Pc(115) byte local115 = 0;
		@Pc(117) byte local117 = 0;
		if (arg3 == 1) {
			local117 = 1;
		} else if (arg3 == 2) {
			local117 = 1;
			local115 = 1;
		} else if (arg3 == 3) {
			local115 = 1;
		}
		@Pc(205) int local205;
		@Pc(217) int local217;
		@Pc(251) int local251;
		@Pc(258) int local258;
		@Pc(275) int local275;
		@Pc(284) int local284;
		for (@Pc(142) int local142 = 0; local142 < local21; local142++) {
			for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
				for (@Pc(150) int local150 = 0; local150 < 64; local150++) {
					if (local142 != arg9 || local146 < local11 || local146 > local11 + 8 || local17 > local150 || local17 + 8 < local150) {
						Static281.method4797(arg0, 0, -1, 0, -1, local101, false, 0, 0, 0, 0);
					} else if (local11 + 8 == local146 || local17 + 8 == local150) {
						if (arg3 == 0) {
							local217 = local150 + arg6 - local17;
							local205 = local146 + arg4 - local11;
						} else if (arg3 == 1) {
							local205 = local150 + arg4 - local17;
							local217 = local11 + arg6 + 8 - local146;
						} else if (arg3 == 2) {
							local217 = local17 + arg6 + 8 - local150;
							local205 = local11 + arg4 + 8 - local146;
						} else {
							local217 = arg6 + local146 - local11;
							local205 = local17 + arg4 + 8 - local150;
						}
						Static281.method4797(arg0, arg5, local205, local146 + local33, local217, local101, true, 0, 0, 0, local150 + local37);
					} else {
						local205 = Static200.method3771(local146 & 0x7, arg3, local150 & 0x7) + arg4;
						local217 = arg6 + Static112.method2176(local146 & 0x7, arg3, local150 & 0x7);
						Static281.method4797(arg0, arg5, local205, local33 + local146, local217, local101, false, local117, arg3, local115, local37 + local150);
						if (local146 == 63 || local150 == 63) {
							local251 = local146 == 63 ? 64 : local146;
							local258 = local150 == 63 ? 64 : local150;
							if (arg3 == 0) {
								local284 = arg6 + local258 - local17;
								local275 = local251 + arg4 - local11;
							} else if (arg3 == 1) {
								local275 = arg4 + local258 - local17;
								local284 = arg6 + local11 + 8 - local251;
							} else if (arg3 == 2) {
								local275 = arg4 + local11 + 8 - local251;
								local284 = local17 + arg6 + 8 - local258;
							} else {
								local284 = local251 + arg6 - local11;
								local275 = arg4 + local17 + 8 - local258;
							}
							if (local275 >= 0 && local275 < Static66.anInt1177 && local284 >= 0 && local284 < Static12.anInt213) {
								Static327.anIntArrayArrayArray12[arg5][local275][local284] = Static327.anIntArrayArrayArray12[arg5][local205 + local115][local117 + local217];
							}
						}
					}
				}
			}
		}
		@Pc(513) boolean local513 = false;
		@Pc(599) int local599;
		@Pc(603) int local603;
		@Pc(641) int local641;
		while (local101.aByteArray30.length > local101.anInt3606) {
			local205 = local101.method3124();
			if (local205 == 128) {
				Static311.anIntArray475[0] = local101.method3104();
				Static311.anIntArray475[1] = local101.method3108();
				Static311.anIntArray475[2] = local101.method3108();
				Static311.anIntArray475[3] = local101.method3108();
				Static311.anIntArray475[4] = local101.method3104();
				local513 = true;
			} else {
				if (local205 != 129) {
					local101.anInt3606--;
					break;
				}
				if (Static126.aByteArrayArrayArray4 == null) {
					Static126.aByteArrayArrayArray4 = new byte[4][][];
				}
				for (local217 = 0; local217 < 4; local217++) {
					@Pc(552) byte local552 = local101.method3122();
					if (local552 == 0 && Static126.aByteArrayArrayArray4[arg5] != null) {
						if (local217 <= arg9) {
							local258 = arg4;
							local275 = arg4 + 7;
							local284 = arg6;
							if (local275 < 0) {
								local275 = 0;
							} else if (Static66.anInt1177 <= local275) {
								local275 = Static66.anInt1177;
							}
							if (arg4 < 0) {
								local258 = 0;
							} else if (arg4 >= Static66.anInt1177) {
								local258 = Static66.anInt1177;
							}
							local599 = arg6 + 7;
							if (arg6 < 0) {
								local284 = 0;
							} else if (arg6 >= Static12.anInt213) {
								local284 = Static12.anInt213;
							}
							if (local599 < 0) {
								local599 = 0;
							} else if (Static12.anInt213 <= local599) {
								local599 = Static12.anInt213;
							}
							while (local258 < local275) {
								while (local599 > local284) {
									Static126.aByteArrayArrayArray4[arg5][local258][local284] = 0;
									local284++;
								}
								local258++;
							}
						}
					} else if (local552 == 1) {
						if (Static126.aByteArrayArrayArray4[arg5] == null) {
							Static126.aByteArrayArrayArray4[arg5] = new byte[Static66.anInt1177 + 1][Static12.anInt213 + 1];
						}
						for (local258 = 0; local258 < 64; local258 += 4) {
							for (local275 = 0; local275 < 64; local275 += 4) {
								@Pc(590) byte local590 = local101.method3122();
								if (arg9 >= local217) {
									for (local599 = local258; local599 < local258 + 4; local599++) {
										for (local603 = local275; local603 < local275 + 4; local603++) {
											if (local11 <= local599 && local11 + 8 > local599 && local603 >= local17 && local17 + 8 > local17) {
												local641 = Static200.method3771(local599 & 0x7, arg3, local603 & 0x7) + arg4;
												@Pc(654) int local654 = arg6 + Static112.method2176(local599 & 0x7, arg3, local603 & 0x7);
												if (local641 >= 0 && local641 < Static66.anInt1177 && local654 >= 0 && Static12.anInt213 > local654) {
													Static126.aByteArrayArrayArray4[arg5][local641][local654] = local590;
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
		if (!arg0) {
			@Pc(864) Class191 local864 = null;
			while (true) {
				while (local101.aByteArray30.length > local101.anInt3606) {
					local217 = local101.method3124();
					if (local217 == 0) {
						local864 = new Class191(local101);
					} else if (local217 == 1) {
						local251 = local101.method3124();
						if (local251 > 0) {
							for (local258 = 0; local258 < local251; local258++) {
								@Pc(923) Class2_Sub10_Sub1 local923 = new Class2_Sub10_Sub1(local101);
								if (local923.anInt4060 == 31) {
									@Pc(933) Class126 local933 = Static357.method5712(local101.method3104());
									local923.method3478(local933.anInt4025, local933.anInt4026, local933.anInt4027, local933.anInt4030);
								}
								local284 = local923.anInt4039 >> 7;
								local599 = local923.anInt4043 >> 7;
								if (arg9 == local923.anInt4052 && local284 >= local11 && local11 + 8 > local284 && local17 <= local599 && local599 < local17 + 8) {
									local603 = (arg4 << 7) + Static280.method4787(local923.anInt4039 & 0x3FF, arg3, local923.anInt4043 & 0x3FF);
									local641 = Static329.method5353(arg3, local923.anInt4043 & 0x3FF, local923.anInt4039 & 0x3FF) + (arg6 << 7);
									local923.anInt4043 = local641;
									local923.anInt4039 = local603;
									local284 = local923.anInt4039 >> 7;
									local599 = local923.anInt4043 >> 7;
									if (local284 >= 0 && local599 >= 0 && Static66.anInt1177 > local284 && Static12.anInt213 > local599) {
										local923.anInt4045 = Static327.anIntArrayArrayArray12[arg9][local284][local599] - local923.anInt4045;
										if (arg7.method3740() > 0) {
											Static319.method5305(local923);
										}
									}
								}
							}
						}
					} else if (local217 == 2) {
						if (local864 == null) {
							local864 = new Class191();
						}
						local864.method5156(local101);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local864 != null) {
					Static123.method2393(local864, arg4 >> 3, arg6 >> 3);
				}
				break;
			}
		}
		if (Static126.aByteArrayArrayArray4 != null && Static126.aByteArrayArrayArray4[arg5] != null) {
			local205 = arg4 + 7;
			local217 = arg6 + 7;
			for (local251 = arg4; local251 < local205; local251++) {
				for (local258 = arg6; local258 < local217; local258++) {
					Static126.aByteArrayArrayArray4[arg5][local251][local258] = 0;
				}
			}
		}
		if (local513) {
			return Static311.anIntArray475;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(III)I")
	public static int method2363(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg0 >>> 31;
		return (local15 + arg0) / arg1 - local15;
	}
}
