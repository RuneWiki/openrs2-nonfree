import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!db", name = "w", descriptor = "I")
	public static int anInt4486;

	@OriginalMember(owner = "client!db", name = "r", descriptor = "I")
	public static int anInt4482 = 0;

	@OriginalMember(owner = "client!db", name = "H", descriptor = "I")
	public static int anInt4494 = -1;

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIIIIILclient!rh;I)V")
	public static void method3168(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class82 arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class3_Sub1_Sub1 local9 = Static162.method2627(arg1);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (arg0 == 1 || arg0 == 3) {
			local20 = local9.anInt150;
			local23 = local9.anInt145;
		} else {
			local20 = local9.anInt145;
			local23 = local9.anInt150;
		}
		@Pc(35) int[][] local35 = Static42.anIntArrayArrayArray1[arg2];
		@Pc(43) int local43;
		@Pc(47) int local47;
		if (arg4 + local20 > 104) {
			local43 = arg4;
			local47 = arg4 + 1;
		} else {
			local47 = arg4 + (local20 + 1 >> 1);
			local43 = (local20 >> 1) + arg4;
		}
		@Pc(76) int local76;
		@Pc(84) int local84;
		if (arg5 + local23 <= 104) {
			local76 = arg5 + (local23 >> 1);
			local84 = arg5 + (local23 + 1 >> 1);
		} else {
			local76 = arg5;
			local84 = arg5 + 1;
		}
		@Pc(100) int local100 = (local20 << 6) + (arg4 << 7);
		@Pc(126) int local126 = local35[local47][local84] + local35[local43][local84] + local35[local47][local76] + local35[local43][local76] >> 2;
		@Pc(134) int local134 = (local23 << 6) + (arg5 << 7);
		@Pc(164) long local164 = (long) ((arg7 | 0x10000) << 14 | arg5 << 7 | arg4 | arg0 << 20);
		if (local9.anInt159 == 0) {
			local164 |= Long.MIN_VALUE;
		}
		if (local9.anInt130 == 1) {
			local164 |= 0x400000L;
		}
		local164 |= (long) arg1 << 32;
		@Pc(211) Class3_Sub1_Sub5 local211;
		if (arg7 == 22) {
			if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
				local211 = local9.method117(arg0, local126, 22, local134, local100, local35);
			} else {
				local211 = new Class3_Sub1_Sub5_Sub6(arg1, 22, arg0, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
			}
			Static137.method2077(arg3, arg4, arg5, local126, local211, local164, local9.aBoolean10);
			if (local9.anInt134 == 1) {
				arg6.method2515(arg4, arg5);
			}
		} else if (arg7 == 10 || arg7 == 11) {
			if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
				local211 = local9.method117(arg0, local126, 10, local134, local100, local35);
			} else {
				local211 = new Class3_Sub1_Sub5_Sub6(arg1, 10, arg0, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
			}
			if (local211 != null) {
				Static93.method1424(arg3, arg4, arg5, local126, local20, local23, local211, arg7 == 11 ? 256 : 0, local164);
			}
			if (local9.anInt134 != 0) {
				arg6.method2510(arg5, local23, local20, local9.aBoolean14, arg4);
			}
		} else if (arg7 >= 12) {
			if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
				local211 = local9.method117(arg0, local126, arg7, local134, local100, local35);
			} else {
				local211 = new Class3_Sub1_Sub5_Sub6(arg1, arg7, arg0, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
			}
			Static93.method1424(arg3, arg4, arg5, local126, 1, 1, local211, 0, local164);
			if (local9.anInt134 != 0) {
				arg6.method2510(arg5, local23, local20, local9.aBoolean14, arg4);
			}
		} else if (arg7 == 0) {
			if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
				local211 = local9.method117(arg0, local126, 0, local134, local100, local35);
			} else {
				local211 = new Class3_Sub1_Sub5_Sub6(arg1, 0, arg0, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
			}
			Static75.method1110(arg3, arg4, arg5, local126, local211, null, Static28.anIntArray88[arg0], 0, local164);
			if (local9.anInt134 != 0) {
				arg6.method2505(arg5, arg7, local9.aBoolean14, arg0, arg4);
			}
		} else if (arg7 == 1) {
			if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
				local211 = local9.method117(arg0, local126, 1, local134, local100, local35);
			} else {
				local211 = new Class3_Sub1_Sub5_Sub6(arg1, 1, arg0, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
			}
			Static75.method1110(arg3, arg4, arg5, local126, local211, null, Static64.anIntArray180[arg0], 0, local164);
			if (local9.anInt134 != 0) {
				arg6.method2505(arg5, arg7, local9.aBoolean14, arg0, arg4);
			}
		} else {
			@Pc(529) int local529;
			if (arg7 == 2) {
				local529 = arg0 + 1 & 0x3;
				@Pc(570) Class3_Sub1_Sub5 local570;
				@Pc(555) Class3_Sub1_Sub5 local555;
				if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
					local555 = local9.method117(arg0 + 4, local126, 2, local134, local100, local35);
					local570 = local9.method117(local529, local126, 2, local134, local100, local35);
				} else {
					local555 = new Class3_Sub1_Sub5_Sub6(arg1, 2, arg0 + 4, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
					local570 = new Class3_Sub1_Sub5_Sub6(arg1, 2, local529, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
				}
				Static75.method1110(arg3, arg4, arg5, local126, local555, local570, Static28.anIntArray88[arg0], Static28.anIntArray88[local529], local164);
				if (local9.anInt134 != 0) {
					arg6.method2505(arg5, arg7, local9.aBoolean14, arg0, arg4);
				}
			} else if (arg7 == 3) {
				if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
					local211 = local9.method117(arg0, local126, 3, local134, local100, local35);
				} else {
					local211 = new Class3_Sub1_Sub5_Sub6(arg1, 3, arg0, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
				}
				Static75.method1110(arg3, arg4, arg5, local126, local211, null, Static64.anIntArray180[arg0], 0, local164);
				if (local9.anInt134 != 0) {
					arg6.method2505(arg5, arg7, local9.aBoolean14, arg0, arg4);
				}
			} else if (arg7 == 9) {
				if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
					local211 = local9.method117(arg0, local126, arg7, local134, local100, local35);
				} else {
					local211 = new Class3_Sub1_Sub5_Sub6(arg1, arg7, arg0, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
				}
				Static93.method1424(arg3, arg4, arg5, local126, 1, 1, local211, 0, local164);
				if (local9.anInt134 != 0) {
					arg6.method2510(arg5, local23, local20, local9.aBoolean14, arg4);
				}
			} else if (arg7 == 4) {
				if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
					local211 = local9.method117(arg0, local126, 4, local134, local100, local35);
				} else {
					local211 = new Class3_Sub1_Sub5_Sub6(arg1, 4, arg0, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
				}
				Static32.method3053(arg3, arg4, arg5, local126, local211, null, Static28.anIntArray88[arg0], 0, 0, 0, local164);
			} else {
				@Pc(817) long local817;
				@Pc(851) Class3_Sub1_Sub5 local851;
				if (arg7 == 5) {
					local529 = 16;
					local817 = Static11.method218(arg3, arg4, arg5);
					if (local817 != 0L) {
						local529 = Static162.method2627((int) (local817 >>> 32) & Integer.MAX_VALUE).anInt163;
					}
					if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
						local851 = local9.method117(arg0, local126, 4, local134, local100, local35);
					} else {
						local851 = new Class3_Sub1_Sub5_Sub6(arg1, 4, arg0, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
					}
					Static32.method3053(arg3, arg4, arg5, local126, local851, null, Static28.anIntArray88[arg0], 0, local529 * Static95.anIntArray455[arg0], local529 * Static88.anIntArray223[arg0], local164);
				} else if (arg7 == 6) {
					local529 = 8;
					local817 = Static11.method218(arg3, arg4, arg5);
					if (local817 != 0L) {
						local529 = Static162.method2627((int) (local817 >>> 32) & Integer.MAX_VALUE).anInt163 / 2;
					}
					if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
						local851 = local9.method117(arg0 + 4, local126, 4, local134, local100, local35);
					} else {
						local851 = new Class3_Sub1_Sub5_Sub6(arg1, 4, arg0 + 4, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
					}
					Static32.method3053(arg3, arg4, arg5, local126, local851, null, 256, arg0, Static103.anIntArray297[arg0] * local529, local529 * Static53.anIntArray164[arg0], local164);
				} else if (arg7 == 7) {
					@Pc(992) int local992 = arg0 + 2 & 0x3;
					if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
						local211 = local9.method117(local992 + 4, local126, 4, local134, local100, local35);
					} else {
						local211 = new Class3_Sub1_Sub5_Sub6(arg1, 4, local992 + 4, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
					}
					Static32.method3053(arg3, arg4, arg5, local126, local211, null, 256, local992, 0, 0, local164);
				} else if (arg7 == 8) {
					local529 = 8;
					local817 = Static11.method218(arg3, arg4, arg5);
					if (local817 != 0L) {
						local529 = Static162.method2627((int) (local817 >>> 32) & Integer.MAX_VALUE).anInt163 / 2;
					}
					@Pc(1078) int local1078 = arg0 + 2 & 0x3;
					@Pc(1110) Class3_Sub1_Sub5 local1110;
					if (local9.anInt142 == -1 && local9.anIntArray23 == null) {
						local851 = local9.method117(arg0 + 4, local126, 4, local134, local100, local35);
						local1110 = local9.method117(local1078 + 4, local126, 4, local134, local100, local35);
					} else {
						local851 = new Class3_Sub1_Sub5_Sub6(arg1, 4, arg0 + 4, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
						local1110 = new Class3_Sub1_Sub5_Sub6(arg1, 4, local1078 + 4, arg2, arg4, arg5, local9.anInt142, local9.aBoolean8, null);
					}
					Static32.method3053(arg3, arg4, arg5, local126, local851, local1110, 256, arg0, local529 * Static103.anIntArray297[arg0], local529 * Static53.anIntArray164[arg0], local164);
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(IIB)I")
	public static int method3171(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > 22050) {
			arg1 = arg0;
			arg0 = 22050;
		}
		while (arg0 != 0) {
			@Pc(29) int local29 = arg1 % arg0;
			arg1 = arg0;
			arg0 = local29;
		}
		return arg1;
	}
}
