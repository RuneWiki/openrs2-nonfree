import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static74 {

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
	public static int anInt1911;

	@OriginalMember(owner = "client!mf", name = "s", descriptor = "[S")
	public static short[] aShortArray17;

	@OriginalMember(owner = "client!mf", name = "u", descriptor = "Lclient!ab;")
	public static Class3 aClass3_2;

	@OriginalMember(owner = "client!mf", name = "x", descriptor = "[Lclient!ue;")
	public static Class4_Sub4_Sub5_Sub4[] aClass4_Sub4_Sub5_Sub4Array10;

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!ne;")
	public static Class4_Sub10 aClass4_Sub10_6 = new Class4_Sub10(8);

	@OriginalMember(owner = "client!mf", name = "v", descriptor = "Lclient!v;")
	public static Class76 aClass76_816 = Static134.method2017("W-=hlen Sie eine Option");

	@OriginalMember(owner = "client!mf", name = "z", descriptor = "Lclient!v;")
	private static Class76 aClass76_818 = Static134.method2017("Connection lost");

	@OriginalMember(owner = "client!mf", name = "y", descriptor = "Lclient!v;")
	public static Class76 aClass76_817 = aClass76_818;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "[I")
	public static int[] anIntArray259 = new int[4000];

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ZI)Z")
	public static boolean method1365(@OriginalArg(1) int arg0) {
		if (arg0 < 32) {
			return false;
		} else if (arg0 == 127) {
			return false;
		} else {
			return arg0 < 129 || arg0 > 159;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!na;IIIBIIIILclient!wc;)V")
	public static void method1366(@OriginalArg(0) Class50 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class81 arg8) {
		@Pc(9) Class4_Sub4_Sub8 local9 = Static104.method1600(arg3);
		@Pc(20) int local20;
		@Pc(23) int local23;
		if (arg2 == 1 || arg2 == 3) {
			local20 = local9.anInt1505;
			local23 = local9.anInt1498;
		} else {
			local20 = local9.anInt1498;
			local23 = local9.anInt1505;
		}
		@Pc(42) int local42;
		@Pc(50) int local50;
		if (local20 + arg7 <= 104) {
			local42 = arg7 + (local20 >> 1);
			local50 = (local20 + 1 >> 1) + arg7;
		} else {
			local50 = arg7 + 1;
			local42 = arg7;
		}
		@Pc(62) int[][] local62 = Static66.anIntArrayArrayArray3[arg4];
		@Pc(75) int local75;
		@Pc(73) int local73;
		if (local23 + arg5 > 104) {
			local73 = arg5 + 1;
			local75 = arg5;
		} else {
			local73 = arg5 + (local23 + 1 >> 1);
			local75 = arg5 + (local23 >> 1);
		}
		@Pc(117) int local117 = local62[local50][local73] + local62[local42][local73] + local62[local42][local75] + local62[local50][local75] >> 2;
		@Pc(125) int local125 = (local20 << 6) + (arg7 << 7);
		@Pc(131) int local131 = arg1 + (arg2 << 6);
		@Pc(143) int local143 = (arg3 << 14) + (arg5 << 7) + arg7 + 1073741824;
		if (local9.anInt1511 == 0) {
			local143 += Integer.MIN_VALUE;
		}
		if (local9.anInt1520 == 1) {
			local131 += 256;
		}
		@Pc(166) int local166 = (local23 << 6) + (arg5 << 7);
		@Pc(191) Class4_Sub4_Sub3 local191;
		if (arg1 == 22) {
			if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
				local191 = local9.method1007(local125, local62, arg2, local166, 22, local117);
			} else {
				local191 = new Class4_Sub4_Sub3_Sub6(arg3, 22, arg2, arg4, arg7, arg5, local9.anInt1487, true, null);
			}
			arg8.method1993(arg6, arg7, arg5, local117, local191, local143, local131);
			if (local9.anInt1500 == 1) {
				arg0.method1387(arg5, arg7);
			}
		} else if (arg1 == 10 || arg1 == 11) {
			if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
				local191 = local9.method1007(local125, local62, arg2, local166, 10, local117);
			} else {
				local191 = new Class4_Sub4_Sub3_Sub6(arg3, 10, arg2, arg4, arg7, arg5, local9.anInt1487, true, null);
			}
			if (local191 != null) {
				arg8.method1959(arg6, arg7, arg5, local117, local20, local23, local191, arg1 == 11 ? 256 : 0, local143, local131);
			}
			if (local9.anInt1500 != 0) {
				arg0.method1374(local20, local9.aBoolean89, arg5, arg7, local23);
			}
		} else if (arg1 >= 12) {
			if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
				local191 = local9.method1007(local125, local62, arg2, local166, arg1, local117);
			} else {
				local191 = new Class4_Sub4_Sub3_Sub6(arg3, arg1, arg2, arg4, arg7, arg5, local9.anInt1487, true, null);
			}
			arg8.method1959(arg6, arg7, arg5, local117, 1, 1, local191, 0, local143, local131);
			if (local9.anInt1500 != 0) {
				arg0.method1374(local20, local9.aBoolean89, arg5, arg7, local23);
			}
		} else if (arg1 == 0) {
			if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
				local191 = local9.method1007(local125, local62, arg2, local166, 0, local117);
			} else {
				local191 = new Class4_Sub4_Sub3_Sub6(arg3, 0, arg2, arg4, arg7, arg5, local9.anInt1487, true, null);
			}
			arg8.method1995(arg6, arg7, arg5, local117, local191, null, Static69.anIntArray238[arg2], 0, local143, local131);
			if (local9.anInt1500 != 0) {
				arg0.method1376(arg7, local9.aBoolean89, arg5, arg2, arg1);
			}
		} else if (arg1 == 1) {
			if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
				local191 = local9.method1007(local125, local62, arg2, local166, 1, local117);
			} else {
				local191 = new Class4_Sub4_Sub3_Sub6(arg3, 1, arg2, arg4, arg7, arg5, local9.anInt1487, true, null);
			}
			arg8.method1995(arg6, arg7, arg5, local117, local191, null, Static40.anIntArray128[arg2], 0, local143, local131);
			if (local9.anInt1500 != 0) {
				arg0.method1376(arg7, local9.aBoolean89, arg5, arg2, arg1);
			}
		} else {
			@Pc(531) Class4_Sub4_Sub3 local531;
			@Pc(502) int local502;
			if (arg1 == 2) {
				local502 = arg2 + 1 & 0x3;
				@Pc(521) Class4_Sub4_Sub3 local521;
				if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
					local521 = local9.method1007(local125, local62, arg2 + 4, local166, 2, local117);
					local531 = local9.method1007(local125, local62, local502, local166, 2, local117);
				} else {
					local521 = new Class4_Sub4_Sub3_Sub6(arg3, 2, arg2 + 4, arg4, arg7, arg5, local9.anInt1487, true, null);
					local531 = new Class4_Sub4_Sub3_Sub6(arg3, 2, local502, arg4, arg7, arg5, local9.anInt1487, true, null);
				}
				arg8.method1995(arg6, arg7, arg5, local117, local521, local531, Static69.anIntArray238[arg2], Static69.anIntArray238[local502], local143, local131);
				if (local9.anInt1500 != 0) {
					arg0.method1376(arg7, local9.aBoolean89, arg5, arg2, arg1);
				}
			} else if (arg1 == 3) {
				if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
					local191 = local9.method1007(local125, local62, arg2, local166, 3, local117);
				} else {
					local191 = new Class4_Sub4_Sub3_Sub6(arg3, 3, arg2, arg4, arg7, arg5, local9.anInt1487, true, null);
				}
				arg8.method1995(arg6, arg7, arg5, local117, local191, null, Static40.anIntArray128[arg2], 0, local143, local131);
				if (local9.anInt1500 != 0) {
					arg0.method1376(arg7, local9.aBoolean89, arg5, arg2, arg1);
				}
			} else if (arg1 == 9) {
				if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
					local191 = local9.method1007(local125, local62, arg2, local166, arg1, local117);
				} else {
					local191 = new Class4_Sub4_Sub3_Sub6(arg3, arg1, arg2, arg4, arg7, arg5, local9.anInt1487, true, null);
				}
				arg8.method1959(arg6, arg7, arg5, local117, 1, 1, local191, 0, local143, local131);
				if (local9.anInt1500 != 0) {
					arg0.method1374(local20, local9.aBoolean89, arg5, arg7, local23);
				}
			} else if (arg1 == 4) {
				if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
					local191 = local9.method1007(local125, local62, arg2, local166, 4, local117);
				} else {
					local191 = new Class4_Sub4_Sub3_Sub6(arg3, 4, arg2, arg4, arg7, arg5, local9.anInt1487, true, null);
				}
				arg8.method1969(arg6, arg7, arg5, local117, local191, null, Static69.anIntArray238[arg2], 0, 0, 0, local143, local131);
			} else {
				@Pc(787) int local787;
				if (arg1 == 5) {
					local502 = 16;
					local787 = arg8.method1954(arg6, arg7, arg5);
					if (local787 != 0) {
						local502 = Static104.method1600(local787 >> 14 & 0x7FFF).anInt1503;
					}
					if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
						local531 = local9.method1007(local125, local62, arg2, local166, 4, local117);
					} else {
						local531 = new Class4_Sub4_Sub3_Sub6(arg3, 4, arg2, arg4, arg7, arg5, local9.anInt1487, true, null);
					}
					arg8.method1969(arg6, arg7, arg5, local117, local531, null, Static69.anIntArray238[arg2], 0, Static2.anIntArray10[arg2] * local502, Static66.anIntArray228[arg2] * local502, local143, local131);
				} else if (arg1 == 6) {
					local502 = 8;
					local787 = arg8.method1954(arg6, arg7, arg5);
					if (local787 != 0) {
						local502 = Static104.method1600(local787 >> 14 & 0x7FFF).anInt1503 / 2;
					}
					if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
						local531 = local9.method1007(local125, local62, arg2 + 4, local166, 4, local117);
					} else {
						local531 = new Class4_Sub4_Sub3_Sub6(arg3, 4, arg2 + 4, arg4, arg7, arg5, local9.anInt1487, true, null);
					}
					arg8.method1969(arg6, arg7, arg5, local117, local531, null, 256, arg2, Static18.anIntArray46[arg2] * local502, local502 * Static77.anIntArray264[arg2], local143, local131);
				} else if (arg1 == 7) {
					local787 = arg2 + 2 & 0x3;
					if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
						local191 = local9.method1007(local125, local62, local787 + 4, local166, 4, local117);
					} else {
						local191 = new Class4_Sub4_Sub3_Sub6(arg3, 4, local787 + 4, arg4, arg7, arg5, local9.anInt1487, true, null);
					}
					arg8.method1969(arg6, arg7, arg5, local117, local191, null, 256, local787, 0, 0, local143, local131);
				} else if (arg1 == 8) {
					local502 = 8;
					local787 = arg8.method1954(arg6, arg7, arg5);
					if (local787 != 0) {
						local502 = Static104.method1600(local787 >> 14 & 0x7FFF).anInt1503 / 2;
					}
					@Pc(1038) int local1038 = arg2 + 2 & 0x3;
					@Pc(1078) Class4_Sub4_Sub3 local1078;
					if (local9.anInt1487 == -1 && local9.anIntArray192 == null) {
						local531 = local9.method1007(local125, local62, arg2 + 4, local166, 4, local117);
						local1078 = local9.method1007(local125, local62, local1038 + 4, local166, 4, local117);
					} else {
						local531 = new Class4_Sub4_Sub3_Sub6(arg3, 4, arg2 + 4, arg4, arg7, arg5, local9.anInt1487, true, null);
						local1078 = new Class4_Sub4_Sub3_Sub6(arg3, 4, local1038 + 4, arg4, arg7, arg5, local9.anInt1487, true, null);
					}
					arg8.method1969(arg6, arg7, arg5, local117, local531, local1078, 256, arg2, local502 * Static18.anIntArray46[arg2], local502 * Static77.anIntArray264[arg2], local143, local131);
				}
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V")
	public static void method1367(@OriginalArg(0) int arg0) {
		@Pc(12) Class4_Sub21 local12 = (Class4_Sub21) Static104.aClass28_9.method770((long) arg0);
		if (local12 != null) {
			for (@Pc(22) int local22 = 0; local22 < local12.anIntArray325.length; local22++) {
				local12.anIntArray325[local22] = -1;
				local12.anIntArray326[local22] = 0;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(II)I")
	public static int method1368(@OriginalArg(1) int arg0) {
		@Pc(4) int local4 = arg0 - 1;
		@Pc(24) int local24 = local4 | local4 >>> 1;
		@Pc(30) int local30 = local24 | local24 >>> 2;
		@Pc(36) int local36 = local30 | local30 >>> 4;
		@Pc(42) int local42 = local36 | local36 >>> 8;
		@Pc(48) int local48 = local42 | local42 >>> 16;
		return local48 + 1;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method1369() {
		aShortArray17 = null;
		aClass76_817 = null;
		aClass4_Sub10_6 = null;
		aClass76_818 = null;
		aClass3_2 = null;
		aClass76_816 = null;
		aClass4_Sub4_Sub5_Sub4Array10 = null;
		anIntArray259 = null;
	}
}
