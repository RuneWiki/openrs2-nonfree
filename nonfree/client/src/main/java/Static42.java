import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static42 {

	@OriginalMember(owner = "client!ea", name = "ob", descriptor = "I")
	public static int anInt254;

	@OriginalMember(owner = "client!ea", name = "z", descriptor = "I")
	public static volatile int anInt217 = 0;

	@OriginalMember(owner = "client!ea", name = "C", descriptor = "Lclient!i;")
	private static Class41 aClass41_47 = Static184.method2923("Loading title screen )2 ");

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "Lclient!i;")
	public static Class41 aClass41_48 = aClass41_47;

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
	public static int anInt229 = 0;

	@OriginalMember(owner = "client!ea", name = "Z", descriptor = "I")
	public static volatile int anInt241 = 0;

	@OriginalMember(owner = "client!ea", name = "lb", descriptor = "[I")
	public static int[] anIntArray11 = new int[200];

	@OriginalMember(owner = "client!ea", name = "zb", descriptor = "I")
	public static int anInt265 = 0;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!nb;ILclient!nb;ZB)Lclient!li;")
	public static Class2_Sub2_Sub13 method171(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class15 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(12) int[] local12 = arg2.method396(arg1);
		for (@Pc(23) int local23 = 0; local23 < local12.length; local23++) {
			@Pc(33) byte[] local33 = arg2.method395(local12[local23], arg1);
			if (local33 == null) {
				local7 = false;
			} else {
				@Pc(53) int local53 = local33[1] & 0xFF | (local33[0] & 0xFF) << 8;
				@Pc(61) byte[] local61 = arg0.method395(0, local53);
				if (local61 == null) {
					local7 = false;
				}
			}
		}
		if (!local7) {
			return null;
		}
		try {
			return new Class2_Sub2_Sub13(arg2, arg0, arg1, false);
		} catch (@Pc(95) Exception local95) {
			return null;
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBI)V")
	public static void method172(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 <= arg1) {
			Static204.method3147(arg2, arg3, arg1, Static3.anIntArrayArray1[arg0]);
		} else {
			Static204.method3147(arg1, arg3, arg2, Static3.anIntArrayArray1[arg0]);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V")
	public static void method180(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(16) int local16 = -arg2;
		@Pc(24) int local24 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg1 + arg2);
		@Pc(26) int local26 = -1;
		@Pc(35) int local35 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg1 - arg2);
		Static204.method3147(local35, arg0, local24, Static3.anIntArrayArray1[arg3]);
		while (local13 > local11) {
			local26 += 2;
			local16 += local26;
			@Pc(64) int local64;
			@Pc(68) int local68;
			@Pc(87) int local87;
			@Pc(96) int local96;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local64 = arg3 - local13;
				local68 = arg3 + local13;
				if (Static45.anInt1337 <= local68 && local64 <= Static17.anInt457) {
					local87 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg1 + local11);
					local96 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg1 - local11);
					if (local68 <= Static17.anInt457) {
						Static204.method3147(local96, arg0, local87, Static3.anIntArrayArray1[local68]);
					}
					if (local64 >= Static45.anInt1337) {
						Static204.method3147(local96, arg0, local87, Static3.anIntArrayArray1[local64]);
					}
				}
			}
			local11++;
			local68 = local11 + arg3;
			local64 = arg3 - local11;
			if (Static45.anInt1337 <= local68 && Static17.anInt457 >= local64) {
				local87 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg1 + local13);
				local96 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg1 - local13);
				if (local68 <= Static17.anInt457) {
					Static204.method3147(local96, arg0, local87, Static3.anIntArrayArray1[local68]);
				}
				if (local64 >= Static45.anInt1337) {
					Static204.method3147(local96, arg0, local87, Static3.anIntArrayArray1[local64]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!nb;BLclient!nb;)I")
	public static int method192(@OriginalArg(0) Class15 arg0, @OriginalArg(2) Class15 arg1) {
		@Pc(1) int local1 = 0;
		if (arg0.method401(Static96.anInt2364)) {
			local1++;
		}
		if (arg1.method401(Static136.anInt3160)) {
			local1++;
		}
		if (arg1.method401(Static91.anInt2268)) {
			local1++;
		}
		if (arg1.method401(Static142.anInt3255)) {
			local1++;
		}
		if (arg1.method401(Static217.anInt4760)) {
			local1++;
		}
		if (arg1.method401(Static135.anInt3150)) {
			local1++;
		}
		arg1.method401(Static13.anInt408);
		arg1.method401(Static7.anInt319);
		arg1.method401(Static84.anInt2160);
		arg1.method401(Static106.anInt2584);
		arg1.method401(Static200.anInt4495);
		return local1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method210(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(10) int local10 = arg6 - arg5;
		@Pc(14) int local14 = arg4 - arg7;
		@Pc(22) int local22 = (arg1 - arg2 << 16) / local10;
		if (Static95.anInt2353 > arg6) {
			local10++;
		}
		@Pc(39) int local39 = (arg0 - arg3 << 16) / local14;
		if (Static40.anInt1214 > arg4) {
			local14++;
		}
		@Pc(61) int local61;
		@Pc(55) int local55;
		@Pc(66) int local66;
		@Pc(86) int local86;
		@Pc(112) int local112;
		@Pc(120) int local120;
		for (@Pc(45) int local45 = 0; local45 < local10; local45++) {
			local55 = local22 * (local45 + 1) >> 16;
			local61 = local45 * local22 >> 16;
			local66 = local55 - local61;
			if (local66 > 0) {
				local55 += arg2;
				local61 += arg2;
				local86 = local45 + arg5 >> 6;
				@Pc(90) int[][] local90 = Static92.anIntArrayArrayArray11[local86];
				@Pc(94) byte[][] local94 = Static84.aByteArrayArrayArray4[local86];
				@Pc(98) byte[][] local98 = Static6.aByteArrayArrayArray1[local86];
				@Pc(102) byte[][] local102 = Static195.aByteArrayArrayArray12[local86];
				@Pc(106) byte[][] local106 = Static184.aByteArrayArrayArray10[local86];
				@Pc(110) byte[][] local110 = Static191.aByteArrayArrayArray11[local86];
				for (local112 = 0; local112 < local14; local112++) {
					local120 = local112 * local39 >> 16;
					@Pc(128) int local128 = local39 * (local112 + 1) >> 16;
					@Pc(133) int local133 = local128 - local120;
					if (local133 > 0) {
						local120 += arg3;
						@Pc(145) int local145 = local112 + arg7 >> 6;
						@Pc(151) int local151 = arg7 + local112 & 0x3F;
						local128 += arg3;
						@Pc(161) int local161 = local45 + arg5 & 0x3F;
						@Pc(167) int local167 = local161 + (local151 << 6);
						@Pc(177) int local177;
						@Pc(186) int local186;
						@Pc(193) int local193;
						if (local90[local145] == null) {
							local186 = local45 + arg5 & 0x4;
							local193 = local112 + arg7 & 0x4;
							if (local186 < 2 && local193 > 2 || local186 > 2 && local193 < 2) {
								local177 = 4936552;
							} else {
								local177 = Static49.anIntArray133[Static118.anInt2860 + 1];
							}
						} else {
							local177 = local90[local145][local167];
						}
						if (local177 == 0) {
							local177 = 1;
						}
						local186 = local98[local145] == null ? 0 : Static49.anIntArray133[local98[local145][local167] & 0xFF];
						local193 = local106[local145] == null ? 0 : Static49.anIntArray133[local106[local145][local167] & 0xFF];
						@Pc(291) int local291;
						if (local186 == 0 && local193 == 0) {
							Static64.method1164(local61, local120, local66, local133, local177);
						} else {
							@Pc(287) byte local287;
							if (local186 != 0) {
								local287 = local94[local145] == null ? 0 : local94[local145][local167];
								local291 = local287 & 0xFC;
								if (local186 == -1) {
									local186 = 1;
								}
								if (local291 == 0 || local66 <= 1 || local133 <= 1) {
									Static64.method1164(local61, local120, local66, local133, local186);
								} else {
									Static194.method3308(true, local133, local177, local287 & 0x3, local120, local186, local291 >> 2, local61, local66, Static64.anIntArray163);
								}
							}
							if (local193 != 0) {
								if (local193 == -1) {
									local193 = local177;
								}
								local287 = local102[local145][local167];
								local291 = local287 & 0xFC;
								if (local291 == 0 || local66 <= 1 || local133 <= 1) {
									Static64.method1164(local61, local120, local66, local133, local193);
								}
								Static194.method3308(local186 == 0, local133, 0, local287 & 0x3, local120, local193, local291 >> 2, local61, local66, Static64.anIntArray163);
							}
						}
						if (local110[local145] != null) {
							@Pc(400) int local400 = local110[local145][local167] & 0xFF;
							if (local400 != 0) {
								if (local66 == 1) {
									local291 = local61;
								} else {
									local291 = local55 - 1;
								}
								@Pc(418) int local418;
								if (local133 == 1) {
									local418 = local120;
								} else {
									local418 = local128 - 1;
								}
								@Pc(426) int local426 = 13421772;
								if (local400 >= 5 && local400 <= 8 || local400 >= 13 && local400 <= 16 || local400 >= 21 && local400 <= 24 || local400 == 27 || local400 == 28) {
									local400 -= 4;
									local426 = 13369344;
								}
								if (local400 == 1) {
									Static64.method1173(local61, local120, local133, local426);
								} else if (local400 == 2) {
									Static64.method1175(local61, local120, local66, local426);
								} else if (local400 == 3) {
									Static64.method1173(local291, local120, local133, local426);
								} else if (local400 == 4) {
									Static64.method1175(local61, local418, local66, local426);
								} else if (local400 == 9) {
									Static64.method1173(local61, local120, local133, 16777215);
									Static64.method1175(local61, local120, local66, local426);
								} else if (local400 == 10) {
									Static64.method1173(local291, local120, local133, 16777215);
									Static64.method1175(local61, local120, local66, local426);
								} else if (local400 == 11) {
									Static64.method1173(local291, local120, local133, 16777215);
									Static64.method1175(local61, local418, local66, local426);
								} else if (local400 == 12) {
									Static64.method1173(local61, local120, local133, 16777215);
									Static64.method1175(local61, local418, local66, local426);
								} else if (local400 == 17) {
									Static64.method1175(local61, local120, 1, local426);
								} else if (local400 == 18) {
									Static64.method1175(local291, local120, 1, local426);
								} else if (local400 == 19) {
									Static64.method1175(local291, local418, 1, local426);
								} else if (local400 == 20) {
									Static64.method1175(local61, local418, 1, local426);
								} else {
									@Pc(580) int local580;
									if (local400 == 25) {
										for (local580 = 0; local580 < local133; local580++) {
											Static64.method1175(local580 + local61, -local580 + local418, 1, local426);
										}
									} else if (local400 == 26) {
										for (local580 = 0; local580 < local133; local580++) {
											Static64.method1175(local61 + local580, local580 + local120, 1, local426);
										}
									}
								}
							}
						}
					}
				}
			}
		}
		for (local61 = 0; local61 < local10; local61++) {
			local55 = local61 * local22 >> 16;
			local66 = (local61 + 1) * local22 >> 16;
			local86 = local66 - local55;
			if (local86 > 0) {
				local55 += arg2;
				@Pc(724) byte[][] local724 = Static103.aByteArrayArrayArray8[arg5 + local61 >> 6];
				for (@Pc(726) int local726 = 0; local726 < local14; local726++) {
					@Pc(734) int local734 = local726 * local39 >> 16;
					@Pc(742) int local742 = (local726 + 1) * local39 >> 16;
					@Pc(747) int local747 = local742 - local734;
					if (local747 > 0) {
						local112 = (arg5 + local61 & 0x3F) + ((local726 + arg7 & 0x3F) << 6);
						@Pc(770) int local770 = local726 + arg7 >> 6;
						local734 += arg3;
						if (local724[local770] != null) {
							local120 = local724[local770][local112] & 0xFF;
							if (local120 != 0) {
								if (local120 == 47 || local120 == 53) {
									Static213.aClass60_Sub1Array2[local120 - 1].method2747(local55, local734, local86 * 2 + 1, local747 * 2 + 1);
								} else {
									Static213.aClass60_Sub1Array2[local120 - 1].method2747(local55 - local86 / 2, local734 + -(local747 / 2), local86 * 2, local747 * 2);
								}
							}
						}
					}
				}
			}
		}
	}
}
