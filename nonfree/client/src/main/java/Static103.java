import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!t", name = "o", descriptor = "Lclient!nb;")
	public static Class24 aClass24_21;

	@OriginalMember(owner = "client!t", name = "c", descriptor = "[I")
	public static int[] anIntArray260 = new int[4000];

	@OriginalMember(owner = "client!t", name = "d", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1201 = Static38.method736(" hat sich ausgeloggt)3");

	@OriginalMember(owner = "client!t", name = "e", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1202 = Static38.method736("@cya@");

	@OriginalMember(owner = "client!t", name = "k", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1203 = Static38.method736("scrollbar");

	@OriginalMember(owner = "client!t", name = "l", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1204 = Static38.method736(" weitere Optionen");

	@OriginalMember(owner = "client!t", name = "m", descriptor = "Lclient!vc;")
	private static Class71 aClass71_1205 = Static38.method736("Create a free account");

	@OriginalMember(owner = "client!t", name = "n", descriptor = "Lclient!vc;")
	public static Class71 aClass71_1206 = aClass71_1205;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public static void method1648() {
		aClass71_1203 = null;
		aClass71_1204 = null;
		aClass71_1202 = null;
		anIntArray260 = null;
		aClass71_1201 = null;
		aClass71_1206 = null;
		aClass71_1205 = null;
		aClass24_21 = null;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIZ[B)V")
	public static void method1649(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte[] arg3) {
		if (Static119.aClass11_1 == null) {
			return;
		}
		if (Static118.anInt2916 >= 0) {
			Static50.anInt1406 = arg1;
			if (Static118.anInt2916 == 0) {
				Static40.anInt717 = 1;
			} else {
				@Pc(25) int local25 = Static23.method551(Static118.anInt2916);
				@Pc(29) int local29 = local25 - Static9.anInt293;
				Static40.anInt717 = (local29 + 3600) / arg1;
				if (Static40.anInt717 < 1) {
					Static40.anInt717 = 1;
				}
			}
			Static9.aByteArray1 = arg3;
			Static108.aBoolean118 = arg2;
			Static102.anInt2389 = arg0;
		} else if (Static40.anInt717 == 0) {
			Static90.method2005(arg3, arg2, arg0);
		} else {
			Static108.aBoolean118 = arg2;
			Static102.anInt2389 = arg0;
			Static9.aByteArray1 = arg3;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!ke;I)V")
	public static void method1650(@OriginalArg(0) Class5_Sub6 arg0) {
		@Pc(5) int local5 = -1;
		@Pc(7) int local7 = 0;
		if (arg0.anInt1579 == 0) {
			local7 = Static7.aClass43_1.method1072(arg0.anInt1578, arg0.anInt1580, arg0.anInt1587);
		}
		@Pc(24) int local24 = 0;
		if (arg0.anInt1579 == 1) {
			local7 = Static7.aClass43_1.method1068(arg0.anInt1578, arg0.anInt1580, arg0.anInt1587);
		}
		@Pc(43) int local43 = 0;
		if (arg0.anInt1579 == 2) {
			local7 = Static7.aClass43_1.method1079(arg0.anInt1578, arg0.anInt1580, arg0.anInt1587);
		}
		if (arg0.anInt1579 == 3) {
			local7 = Static7.aClass43_1.method1098(arg0.anInt1578, arg0.anInt1580, arg0.anInt1587);
		}
		if (local7 != 0) {
			local5 = local7 >> 14 & 0x7FFF;
			@Pc(91) int local91 = Static7.aClass43_1.method1059(arg0.anInt1578, arg0.anInt1580, arg0.anInt1587, local7);
			local24 = local91 & 0x1F;
			local43 = local91 >> 6 & 0x3;
		}
		arg0.anInt1574 = local43;
		arg0.anInt1583 = local24;
		arg0.anInt1584 = local5;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIII)V")
	public static void method1651(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg1 & 0x7FF;
		@Pc(17) int local17 = 2048 - arg0 & 0x7FF;
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		@Pc(23) int local23 = arg3;
		@Pc(36) int local36;
		@Pc(32) int local32;
		@Pc(47) int local47;
		if (local10 != 0) {
			local32 = Class5_Sub1_Sub10_Sub2.anIntArray240[local10];
			local36 = Class5_Sub1_Sub10_Sub2.anIntArray241[local10];
			local47 = local32 * 0 - local36 * arg3 >> 16;
			local23 = local32 * arg3 + local36 * 0 >> 16;
			local21 = local47;
		}
		if (local17 != 0) {
			local36 = Class5_Sub1_Sub10_Sub2.anIntArray241[local17];
			local32 = Class5_Sub1_Sub10_Sub2.anIntArray240[local17];
			local47 = local36 * local23 + local32 * 0 >> 16;
			local23 = local23 * local32 - local36 * 0 >> 16;
			local19 = local47;
		}
		Static1.anInt1 = arg2 - local23;
		Static37.anInt572 = arg4 - local19;
		Static4.anInt171 = arg0;
		Static5.anInt202 = arg5 - local21;
		Static31.anInt815 = arg1;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!l;IILclient!ic;IIII)V")
	public static void method1652(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class43 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class33 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static51.anIntArrayArrayArray3[arg7][arg0][arg6];
		@Pc(28) int local28 = Static51.anIntArrayArrayArray3[arg7][arg0 + 1][arg6];
		@Pc(38) int local38 = Static51.anIntArrayArrayArray3[arg7][arg0][arg6 + 1];
		@Pc(50) int local50 = Static51.anIntArrayArrayArray3[arg7][arg0 + 1][arg6 + 1];
		@Pc(62) int local62 = local38 + local13 + local28 + local50 >> 2;
		@Pc(66) Class5_Sub1_Sub15 local66 = Static97.method1606(arg5);
		@Pc(72) int local72 = (arg1 << 6) + arg3;
		@Pc(84) int local84 = (arg6 << 7) + arg0 + (arg5 << 14) + 1073741824;
		if (local66.anInt2576 == 0) {
			local84 += Integer.MIN_VALUE;
		}
		if (local66.anInt2551 == 1) {
			local72 += 256;
		}
		@Pc(126) Class5_Sub1_Sub1 local126;
		if (arg3 == 22) {
			if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
				local126 = local66.method1710(22, local13, local38, local28, arg1, local50);
			} else {
				local126 = new Class5_Sub1_Sub1_Sub1(arg5, 22, arg1, local13, local28, local50, local38, local66.anInt2574, true, null);
			}
			arg2.method1080(arg8, arg0, arg6, local62, local126, local84, local72);
			if (local66.aBoolean111 && local66.anInt2576 == 1) {
				arg4.method950(arg0, arg6);
			}
			return;
		}
		@Pc(218) int local218;
		if (arg3 == 10 || arg3 == 11) {
			if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
				local126 = local66.method1710(10, local13, local38, local28, arg1, local50);
			} else {
				local126 = new Class5_Sub1_Sub1_Sub1(arg5, 10, arg1, local13, local28, local50, local38, local66.anInt2574, true, null);
			}
			if (local126 != null) {
				@Pc(215) int local215;
				if (arg1 == 1 || arg1 == 3) {
					local215 = local66.anInt2559;
					local218 = local66.anInt2572;
				} else {
					local218 = local66.anInt2559;
					local215 = local66.anInt2572;
				}
				@Pc(228) int local228 = 0;
				if (arg3 == 11) {
					local228 += 256;
				}
				arg2.method1066(arg8, arg0, arg6, local62, local218, local215, local126, local228, local84, local72);
			}
			if (local66.aBoolean111) {
				arg4.method952(local66.aBoolean109, arg0, local66.anInt2559, arg1, arg6, local66.anInt2572);
			}
		} else if (arg3 >= 12) {
			if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
				local126 = local66.method1710(arg3, local13, local38, local28, arg1, local50);
			} else {
				local126 = new Class5_Sub1_Sub1_Sub1(arg5, arg3, arg1, local13, local28, local50, local38, local66.anInt2574, true, null);
			}
			arg2.method1066(arg8, arg0, arg6, local62, 1, 1, local126, 0, local84, local72);
			if (local66.aBoolean111) {
				arg4.method952(local66.aBoolean109, arg0, local66.anInt2559, arg1, arg6, local66.anInt2572);
			}
		} else if (arg3 == 0) {
			if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
				local126 = local66.method1710(0, local13, local38, local28, arg1, local50);
			} else {
				local126 = new Class5_Sub1_Sub1_Sub1(arg5, 0, arg1, local13, local28, local50, local38, local66.anInt2574, true, null);
			}
			arg2.method1086(arg8, arg0, arg6, local62, local126, null, Static3.anIntArray5[arg1], 0, local84, local72);
			if (local66.aBoolean111) {
				arg4.method946(arg3, arg1, arg6, local66.aBoolean109, arg0);
			}
		} else if (arg3 == 1) {
			if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
				local126 = local66.method1710(1, local13, local38, local28, arg1, local50);
			} else {
				local126 = new Class5_Sub1_Sub1_Sub1(arg5, 1, arg1, local13, local28, local50, local38, local66.anInt2574, true, null);
			}
			arg2.method1086(arg8, arg0, arg6, local62, local126, null, Static81.anIntArray246[arg1], 0, local84, local72);
			if (local66.aBoolean111) {
				arg4.method946(arg3, arg1, arg6, local66.aBoolean109, arg0);
			}
		} else {
			@Pc(467) int local467;
			@Pc(506) Class5_Sub1_Sub1 local506;
			if (arg3 == 2) {
				local467 = arg1 + 1 & 0x3;
				@Pc(491) Class5_Sub1_Sub1 local491;
				if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
					local491 = local66.method1710(2, local13, local38, local28, arg1 + 4, local50);
					local506 = local66.method1710(2, local13, local38, local28, local467, local50);
				} else {
					local491 = new Class5_Sub1_Sub1_Sub1(arg5, 2, arg1 + 4, local13, local28, local50, local38, local66.anInt2574, true, null);
					local506 = new Class5_Sub1_Sub1_Sub1(arg5, 2, local467, local13, local28, local50, local38, local66.anInt2574, true, null);
				}
				arg2.method1086(arg8, arg0, arg6, local62, local491, local506, Static3.anIntArray5[arg1], Static3.anIntArray5[local467], local84, local72);
				if (local66.aBoolean111) {
					arg4.method946(arg3, arg1, arg6, local66.aBoolean109, arg0);
				}
			} else if (arg3 == 3) {
				if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
					local126 = local66.method1710(3, local13, local38, local28, arg1, local50);
				} else {
					local126 = new Class5_Sub1_Sub1_Sub1(arg5, 3, arg1, local13, local28, local50, local38, local66.anInt2574, true, null);
				}
				arg2.method1086(arg8, arg0, arg6, local62, local126, null, Static81.anIntArray246[arg1], 0, local84, local72);
				if (local66.aBoolean111) {
					arg4.method946(arg3, arg1, arg6, local66.aBoolean109, arg0);
				}
			} else if (arg3 == 9) {
				if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
					local126 = local66.method1710(arg3, local13, local38, local28, arg1, local50);
				} else {
					local126 = new Class5_Sub1_Sub1_Sub1(arg5, arg3, arg1, local13, local28, local50, local38, local66.anInt2574, true, null);
				}
				arg2.method1066(arg8, arg0, arg6, local62, 1, 1, local126, 0, local84, local72);
				if (local66.aBoolean111) {
					arg4.method952(local66.aBoolean109, arg0, local66.anInt2559, arg1, arg6, local66.anInt2572);
				}
			} else {
				if (local66.aBoolean114) {
					if (arg1 == 1) {
						local467 = local38;
						local38 = local50;
						local50 = local28;
						local28 = local13;
						local13 = local467;
					} else if (arg1 == 2) {
						local467 = local38;
						local38 = local28;
						local28 = local467;
						local467 = local50;
						local50 = local13;
						local13 = local467;
					} else if (arg1 == 3) {
						local467 = local38;
						local38 = local13;
						local13 = local28;
						local28 = local50;
						local50 = local467;
					}
				}
				if (arg3 == 4) {
					if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
						local126 = local66.method1710(4, local13, local38, local28, 0, local50);
					} else {
						local126 = new Class5_Sub1_Sub1_Sub1(arg5, 4, 0, local13, local28, local50, local38, local66.anInt2574, true, null);
					}
					arg2.method1095(arg8, arg0, arg6, local62, local126, Static3.anIntArray5[arg1], arg1 * 512, 0, 0, local84, local72);
				} else if (arg3 == 5) {
					local467 = 16;
					local218 = arg2.method1072(arg8, arg0, arg6);
					if (local218 != 0) {
						local467 = Static97.method1606(local218 >> 14 & 0x7FFF).anInt2544;
					}
					if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
						local506 = local66.method1710(4, local13, local38, local28, 0, local50);
					} else {
						local506 = new Class5_Sub1_Sub1_Sub1(arg5, 4, 0, local13, local28, local50, local38, local66.anInt2574, true, null);
					}
					arg2.method1095(arg8, arg0, arg6, local62, local506, Static3.anIntArray5[arg1], arg1 * 512, local467 * Static35.anIntArray119[arg1], local467 * Static30.anIntArray101[arg1], local84, local72);
				} else if (arg3 == 6) {
					if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
						local126 = local66.method1710(4, local13, local38, local28, 0, local50);
					} else {
						local126 = new Class5_Sub1_Sub1_Sub1(arg5, 4, 0, local13, local28, local50, local38, local66.anInt2574, true, null);
					}
					arg2.method1095(arg8, arg0, arg6, local62, local126, 256, arg1, 0, 0, local84, local72);
				} else if (arg3 == 7) {
					if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
						local126 = local66.method1710(4, local13, local38, local28, 0, local50);
					} else {
						local126 = new Class5_Sub1_Sub1_Sub1(arg5, 4, 0, local13, local28, local50, local38, local66.anInt2574, true, null);
					}
					arg2.method1095(arg8, arg0, arg6, local62, local126, 512, arg1, 0, 0, local84, local72);
				} else if (arg3 == 8) {
					if (local66.anInt2574 == -1 && local66.anIntArray267 == null) {
						local126 = local66.method1710(4, local13, local38, local28, 0, local50);
					} else {
						local126 = new Class5_Sub1_Sub1_Sub1(arg5, 4, 0, local13, local28, local50, local38, local66.anInt2574, true, null);
					}
					arg2.method1095(arg8, arg0, arg6, local62, local126, 768, arg1, 0, 0, local84, local72);
				}
			}
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public static void method1653() {
		Static90.method2005(null, false, 0);
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BLclient!nb;Lclient!nb;)V")
	public static void method1654(@OriginalArg(1) Class24 arg0, @OriginalArg(2) Class24 arg1) {
		Static33.aClass24_11 = arg0;
		Static5.aClass24_2 = arg1;
	}
}
