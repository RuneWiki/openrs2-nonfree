import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!le", name = "j", descriptor = "I")
	public static int anInt3129;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Z")
	public static boolean aBoolean256 = false;

	@OriginalMember(owner = "client!le", name = "b", descriptor = "I")
	public static int anInt3123 = -1;

	@OriginalMember(owner = "client!le", name = "e", descriptor = "Z")
	public static boolean aBoolean257 = false;

	@OriginalMember(owner = "client!le", name = "g", descriptor = "Lclient!ef;")
	public static Class49 aClass49_1 = Static65.method1257();

	@OriginalMember(owner = "client!le", name = "k", descriptor = "Z")
	public static boolean aBoolean258 = false;

	@OriginalMember(owner = "client!le", name = "m", descriptor = "I")
	public static int anInt3131 = 3353893;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
	public static void method2554(@OriginalArg(0) int arg0) {
		for (@Pc(9) Class2 local9 = Static293.aClass79_23.method1992(); local9 != null; local9 = Static293.aClass79_23.method1991()) {
			if ((local9.aLong315 >> 48 & 0xFFFFL) == (long) arg0) {
				local9.method4926();
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method2555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static253.anIntArrayArrayArray13[arg0][local16][local20] == -Static183.anInt3890) {
						return false;
					}
				}
			}
			local16 = (arg1 << 7) + 1;
			local20 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static141.anIntArrayArrayArray4[arg0][arg1][arg3] + arg5;
			if (!Static113.method2086(local16, local156, local20)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static113.method2086(local169, local156, local20)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static113.method2086(local16, local156, local182)) {
				return false;
			} else if (Static113.method2086(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static217.method3664(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static113.method2086(local16 + 1, Static141.anIntArrayArrayArray4[arg0][arg1][arg3] + arg5, local20 + 1) && Static113.method2086(local16 + 128 - 1, Static141.anIntArrayArrayArray4[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static113.method2086(local16 + 128 - 1, Static141.anIntArrayArrayArray4[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static113.method2086(local16 + 1, Static141.anIntArrayArrayArray4[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II[BI[Lclient!f;IIZIII)[I")
	public static int[] method2556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class52[] arg4, @OriginalArg(6) int arg5, @OriginalArg(7) boolean arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9) {
		@Pc(7) int local7 = (arg0 & 0x7) * 8;
		@Pc(20) int local20;
		@Pc(36) int local36;
		if (!arg6) {
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				for (local20 = 0; local20 < 8; local20++) {
					local36 = arg3 + Static188.method3181(local15 & 0x7, arg1, local20 & 0x7);
					@Pc(49) int local49 = arg7 + Static106.method1982(arg1, local20 & 0x7, local15 & 0x7);
					if (local36 > 0 && local36 < 103 && local49 > 0 && local49 < 103) {
						arg4[arg5].anIntArrayArray14[local36][local49] &= 0xFFDFFFFF;
					}
				}
			}
		}
		@Pc(93) int local93 = (arg8 & 0x7) * 8;
		@Pc(98) Class2_Sub26 local98 = new Class2_Sub26(arg2);
		local20 = (arg0 & 0xFFFFFFF8) << 3;
		local36 = (arg8 & 0x1FFFFFF8) << 3;
		@Pc(118) byte local118 = 0;
		@Pc(120) byte local120 = 0;
		@Pc(124) byte local124;
		if (arg6) {
			local124 = 1;
		} else {
			local124 = 4;
		}
		if (arg1 == 1) {
			local120 = 1;
		} else if (arg1 == 2) {
			local118 = 1;
			local120 = 1;
		} else if (arg1 == 3) {
			local118 = 1;
		}
		@Pc(172) int local172;
		@Pc(230) int local230;
		@Pc(242) int local242;
		@Pc(280) int local280;
		@Pc(287) int local287;
		@Pc(303) int local303;
		@Pc(312) int local312;
		for (@Pc(156) int local156 = 0; local156 < local124; local156++) {
			for (@Pc(165) int local165 = 0; local165 < 64; local165++) {
				for (local172 = 0; local172 < 64; local172++) {
					if (local156 != arg9 || local165 < local7 || local165 > local7 + 8 || local172 < local93 || local172 > local93 + 8) {
						Static96.method1838(-1, arg6, 0, 0, local98, false, 0, 0, -1, 0, 0);
					} else if (local165 == local7 + 8 || local93 + 8 == local172) {
						if (arg1 == 0) {
							local242 = local172 + arg7 - local93;
							local230 = local165 + arg3 - local7;
						} else if (arg1 == 1) {
							local230 = local172 + arg3 - local93;
							local242 = local7 + arg7 + 8 - local165;
						} else if (arg1 == 2) {
							local242 = arg7 + local93 + 8 - local172;
							local230 = local7 + arg3 + 8 - local165;
						} else {
							local242 = arg7 + local165 - local7;
							local230 = local93 + arg3 + 8 - local172;
						}
						Static96.method1838(local230, arg6, 0, 0, local98, true, arg5, local20 + local165, local242, 0, local36 + local172);
					} else {
						local230 = arg3 + Static188.method3181(local165 & 0x7, arg1, local172 & 0x7);
						local242 = arg7 + Static106.method1982(arg1, local172 & 0x7, local165 & 0x7);
						Static96.method1838(local230, arg6, arg1, local118, local98, false, arg5, local165 + local20, local242, local120, local36 + local172);
						if (local165 == 63 || local172 == 63) {
							local280 = local165 == 63 ? 64 : local165;
							local287 = local172 == 63 ? 64 : local172;
							if (arg1 == 0) {
								local312 = local287 + arg7 - local93;
								local303 = local280 + arg3 - local7;
							} else if (arg1 == 1) {
								local303 = local287 + arg3 - local93;
								local312 = arg7 + local7 + 8 - local280;
							} else if (arg1 == 2) {
								local312 = local93 + arg7 + 8 - local287;
								local303 = local7 + arg3 + 8 - local280;
							} else {
								local312 = arg7 + local280 - local7;
								local303 = local93 + arg3 + 8 - local287;
							}
							if (local303 >= 0 && local303 < 104 && local312 >= 0 && local312 < 104) {
								Static141.anIntArrayArrayArray4[arg5][local303][local312] = Static141.anIntArrayArrayArray4[arg5][local230 + local118][local120 + local242];
							}
						}
					}
				}
			}
		}
		@Pc(534) boolean local534 = false;
		@Pc(635) int local635;
		@Pc(681) int local681;
		while (local98.anInt5328 < local98.aByteArray72.length) {
			local172 = local98.method4261();
			if (local172 == 128) {
				local534 = true;
				Static287.anIntArray512[0] = local98.method4242();
				Static287.anIntArray512[1] = local98.method4255();
				Static287.anIntArray512[2] = local98.method4255();
				Static287.anIntArray512[3] = local98.method4255();
				Static287.anIntArray512[4] = local98.method4242();
			} else {
				if (local172 != 129) {
					local98.anInt5328--;
					break;
				}
				for (local230 = 0; local230 < 4; local230++) {
					@Pc(597) byte local597 = local98.method4220();
					if (local597 == 0) {
						if (arg9 >= local230) {
							local287 = arg3 + 7;
							local303 = arg7;
							if (local287 < 0) {
								local287 = 0;
							} else if (local287 >= 104) {
								local287 = 104;
							}
							local280 = arg3;
							if (arg7 < 0) {
								local303 = 0;
							} else if (arg7 >= 104) {
								local303 = 104;
							}
							if (arg3 < 0) {
								local280 = 0;
							} else if (arg3 >= 104) {
								local280 = 104;
							}
							local312 = arg7 + 7;
							if (local312 < 0) {
								local312 = 0;
							} else if (local312 >= 104) {
								local312 = 104;
							}
							while (local287 > local280) {
								while (local312 > local303) {
									Static157.aByteArrayArrayArray10[arg5][local280][local303] = 0;
									local303++;
								}
								local280++;
							}
						}
					} else if (local597 == 1) {
						for (local280 = 0; local280 < 64; local280 += 4) {
							for (local287 = 0; local287 < 64; local287 += 4) {
								@Pc(623) byte local623 = local98.method4220();
								if (local230 <= arg9) {
									for (local312 = local280; local312 < local280 + 4; local312++) {
										for (local635 = local287; local635 < local287 + 4; local635++) {
											if (local312 >= local7 && local7 + 8 > local312 && local93 <= local635 && local93 < local93 + 8) {
												local681 = arg3 + Static188.method3181(local312 & 0x7, arg1, local635 & 0x7);
												@Pc(693) int local693 = Static106.method1982(arg1, local635 & 0x7, local312 & 0x7) + arg7;
												if (local681 >= 0 && local681 < 104 && local693 >= 0 && local693 < 104) {
													Static157.aByteArrayArrayArray10[arg5][local681][local693] = local623;
												}
											}
										}
									}
								}
							}
						}
					} else if (local597 == 2) {
					}
				}
			}
		}
		if (Static60.aBoolean106 && !arg6) {
			@Pc(857) Class147 local857 = null;
			while (true) {
				while (local98.anInt5328 < local98.aByteArray72.length) {
					local230 = local98.method4261();
					if (local230 == 0) {
						local857 = new Class147(local98);
					} else if (local230 == 1) {
						local242 = local98.method4261();
						if (local242 > 0) {
							for (local280 = 0; local280 < local242; local280++) {
								@Pc(901) Class90 local901 = new Class90(local98);
								if (local901.anInt2634 == 31) {
									@Pc(912) Class159 local912 = Static283.method4716(local98.method4242());
									local901.method2254(local912.anInt4883, local912.anInt4882, local912.anInt4875, local912.anInt4874);
								}
								local312 = local901.anInt2649 >> 7;
								local303 = local901.anInt2635 >> 7;
								if (local901.anInt2654 == arg9 && local7 <= local303 && local7 + 8 > local303 && local93 <= local312 && local312 < local93 + 8) {
									local635 = Static76.method1379(local901.anInt2635 & 0x3FF, local901.anInt2649 & 0x3FF, arg1) + (arg3 << 7);
									local681 = Static292.method4848(local901.anInt2649 & 0x3FF, local901.anInt2635 & 0x3FF, arg1) + (arg7 << 7);
									local901.anInt2649 = local681;
									local312 = local901.anInt2649 >> 7;
									local901.anInt2635 = local635;
									local303 = local901.anInt2635 >> 7;
									if (local303 >= 0 && local312 >= 0 && local303 < 104 && local312 < 104) {
										local901.aBoolean212 = (Static134.aByteArrayArrayArray9[1][local303][local312] & 0x2) != 0;
										local901.anInt2644 = Static141.anIntArrayArrayArray4[local901.anInt2654][local303][local312] - local901.anInt2644;
										Static128.method2274(local901);
									}
								}
							}
						}
					} else if (local230 == 2) {
						if (local857 == null) {
							local857 = new Class147();
						}
						local857.method3712(local98);
					} else {
						throw new IllegalStateException();
					}
				}
				if (local857 == null) {
					local857 = new Class147();
				}
				Static96.aClass147ArrayArray1[arg3 >> 3][arg7 >> 3] = local857;
				break;
			}
		}
		local172 = arg3 + 7;
		local230 = arg7 + 7;
		for (local242 = arg3; local242 < local172; local242++) {
			for (local280 = arg7; local280 < local230; local280++) {
				Static157.aByteArrayArrayArray10[arg5][local242][local280] = 0;
			}
		}
		return local534 ? Static287.anIntArray512 : null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(IIIIIII)V")
	public static void method2558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg2 >= Static68.anInt1509 && Static43.anInt1054 >= arg1 && arg0 >= Static127.anInt2664 && Static290.anInt6021 >= arg5) {
			if (arg4 == 1) {
				Static90.method1694(arg1, arg0, arg5, arg2, arg3);
			} else {
				Static180.method3128(arg2, arg4, arg1, arg0, arg5, arg3);
			}
		} else if (arg4 == 1) {
			Static38.method733(arg1, arg5, arg3, arg0, arg2);
		} else {
			Static159.method2769(arg0, arg1, arg5, arg2, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(I)V")
	public static void method2559() {
		if (Static165.aClass128_1 != null) {
			@Pc(12) Class128 local12 = Static165.aClass128_1;
			synchronized (Static165.aClass128_1) {
				Static165.aClass128_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BILclient!vl;Ljava/awt/Component;I)Lclient!wn;")
	public static Class3 method2560(@OriginalArg(1) int arg0, @OriginalArg(2) Class177 arg1, @OriginalArg(3) Component arg2, @OriginalArg(4) int arg3) {
		if (Static110.anInt2380 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(44) Class3 local44 = (Class3) Class.forName("Class3_Sub2").getDeclaredConstructor().newInstance();
			local44.anIntArray172 = new int[(Static82.aBoolean465 ? 2 : 1) * 256];
			local44.anInt2619 = arg3;
			local44.method2227(arg2);
			local44.anInt2623 = (arg3 & 0xFFFFFC00) + 1024;
			if (local44.anInt2623 > 16384) {
				local44.anInt2623 = 16384;
			}
			local44.method2238(local44.anInt2623);
			if (Static66.anInt1488 > 0 && Static260.aClass89_1 == null) {
				Static260.aClass89_1 = new Class89();
				Static260.aClass89_1.aClass177_6 = arg1;
				arg1.method4678(Static260.aClass89_1, Static66.anInt1488);
			}
			if (Static260.aClass89_1 != null) {
				if (Static260.aClass89_1.aClass3Array1[arg0] != null) {
					throw new IllegalArgumentException();
				}
				Static260.aClass89_1.aClass3Array1[arg0] = local44;
			}
			return local44;
		} catch (@Pc(121) Throwable local121) {
			try {
				@Pc(127) Class3_Sub1 local127 = new Class3_Sub1(arg1, arg0);
				local127.anIntArray172 = new int[(Static82.aBoolean465 ? 2 : 1) * 256];
				local127.anInt2619 = arg3;
				local127.method2227(arg2);
				local127.anInt2623 = 16384;
				local127.method2238(local127.anInt2623);
				if (Static66.anInt1488 > 0 && Static260.aClass89_1 == null) {
					Static260.aClass89_1 = new Class89();
					Static260.aClass89_1.aClass177_6 = arg1;
					arg1.method4678(Static260.aClass89_1, Static66.anInt1488);
				}
				if (Static260.aClass89_1 != null) {
					if (Static260.aClass89_1.aClass3Array1[arg0] != null) {
						throw new IllegalArgumentException();
					}
					Static260.aClass89_1.aClass3Array1[arg0] = local127;
				}
				return local127;
			} catch (@Pc(189) Throwable local189) {
				return new Class3();
			}
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public static void method2561() {
		Static50.aClass79_4 = new Class79(32);
	}
}
