import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "Lclient!d;")
	public static Class15 aClass15_1;

	@OriginalMember(owner = "client!hc", name = "f", descriptor = "Lclient!u;")
	public static Class76 aClass76_58;

	@OriginalMember(owner = "client!hc", name = "p", descriptor = "Lclient!ib;")
	public static Class38 aClass38_1;

	@OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
	public static int anInt2094;

	@OriginalMember(owner = "client!hc", name = "r", descriptor = "Lclient!ue;")
	public static Class76_Sub1 aClass76_Sub1_6;

	@OriginalMember(owner = "client!hc", name = "d", descriptor = "Lclient!fc;")
	public static Class25 aClass25_11 = new Class25(64);

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "Lclient!rf;")
	private static Class70 aClass70_647 = Static49.method1293("Hidden");

	@OriginalMember(owner = "client!hc", name = "g", descriptor = "Lclient!rf;")
	public static Class70 aClass70_646 = aClass70_647;

	@OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
	public static final int anInt2088 = 0;

	@OriginalMember(owner = "client!hc", name = "u", descriptor = "I")
	public static int anInt2096 = 0;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIII)V")
	public static void method1546(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(10) int local10 = 2048 - arg3 & 0x7FF;
		@Pc(16) int local16 = 2048 - arg2 & 0x7FF;
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = arg1;
		@Pc(22) int local22 = 0;
		@Pc(36) int local36;
		@Pc(32) int local32;
		@Pc(47) int local47;
		if (local16 != 0) {
			local32 = Class1_Sub1_Sub1_Sub1.anIntArray8[local16];
			local36 = Class1_Sub1_Sub1_Sub1.anIntArray11[local16];
			local47 = local32 * 0 - arg1 * local36 >> 16;
			local20 = arg1 * local32 + local36 * 0 >> 16;
			local22 = local47;
		}
		if (local10 != 0) {
			local36 = Class1_Sub1_Sub1_Sub1.anIntArray11[local10];
			local32 = Class1_Sub1_Sub1_Sub1.anIntArray8[local10];
			local47 = local32 * 0 + local36 * local20 >> 16;
			local20 = local32 * local20 - local36 * 0 >> 16;
			local18 = local47;
		}
		Static33.anInt1073 = arg5 - local22;
		Static60.anInt1934 = arg3;
		Static79.anInt2448 = arg4 - local18;
		Static83.anInt4536 = arg0 - local20;
		Static42.anInt1424 = arg2;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
	public static void method1547() {
		aClass15_1 = null;
		aClass38_1 = null;
		aClass25_11 = null;
		aClass70_646 = null;
		aClass76_Sub1_6 = null;
		aClass76_58 = null;
		aClass70_647 = null;
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIILclient!oa;III)V")
	public static void method1548(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class59 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(9) Class1_Sub1_Sub7 local9 = Static176.method3433(arg1);
		@Pc(18) int local18;
		@Pc(21) int local21;
		if (arg7 == 1 || arg7 == 3) {
			local21 = local9.anInt1818;
			local18 = local9.anInt1813;
		} else {
			local18 = local9.anInt1818;
			local21 = local9.anInt1813;
		}
		@Pc(41) int local41;
		@Pc(49) int local49;
		if (arg6 + local18 <= 104) {
			local41 = (local18 >> 1) + arg6;
			local49 = (local18 + 1 >> 1) + arg6;
		} else {
			local41 = arg6;
			local49 = arg6 + 1;
		}
		@Pc(61) int[][] local61 = Static142.anIntArrayArrayArray8[arg0];
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (local21 + arg3 > 104) {
			local70 = arg3;
			local74 = arg3 + 1;
		} else {
			local70 = arg3 + (local21 >> 1);
			local74 = (local21 + 1 >> 1) + arg3;
		}
		@Pc(117) int local117 = local61[local41][local74] + local61[local49][local70] + local61[local41][local70] + local61[local49][local74] >> 2;
		@Pc(134) long local134 = (long) ((arg7 | 0x400) << 20 | arg3 << 7 | arg6 | arg2 << 14);
		@Pc(143) int local143 = (arg6 << 7) + (local18 << 6);
		@Pc(151) int local151 = (local21 << 6) + (arg3 << 7);
		if (local9.anInt1809 == 0) {
			local134 |= Long.MIN_VALUE;
		}
		if (local9.anInt1843 == 1) {
			local134 |= 0x400000L;
		}
		local134 |= (long) arg1 << 32;
		@Pc(198) Class1_Sub1_Sub4 local198;
		if (arg2 == 22) {
			if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
				local198 = local9.method1397(local143, 22, local117, local61, local151, arg7);
			} else {
				local198 = new Class1_Sub1_Sub4_Sub4(arg1, 22, arg7, arg0, arg6, arg3, local9.anInt1832, true, null);
			}
			Static154.method3109(arg4, arg6, arg3, local117, local198, local134);
			if (local9.anInt1842 == 1) {
				arg5.method2475(arg3, arg6);
			}
		} else if (arg2 == 10 || arg2 == 11) {
			if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
				local198 = local9.method1397(local143, 10, local117, local61, local151, arg7);
			} else {
				local198 = new Class1_Sub1_Sub4_Sub4(arg1, 10, arg7, arg0, arg6, arg3, local9.anInt1832, true, null);
			}
			if (local198 != null) {
				Static5.method187(arg4, arg6, arg3, local117, local18, local21, local198, arg2 == 11 ? 256 : 0, local134);
			}
			if (local9.anInt1842 != 0) {
				arg5.method2469(local9.aBoolean67, arg6, arg3, local18, local21);
			}
		} else if (arg2 >= 12) {
			if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
				local198 = local9.method1397(local143, arg2, local117, local61, local151, arg7);
			} else {
				local198 = new Class1_Sub1_Sub4_Sub4(arg1, arg2, arg7, arg0, arg6, arg3, local9.anInt1832, true, null);
			}
			Static5.method187(arg4, arg6, arg3, local117, 1, 1, local198, 0, local134);
			if (local9.anInt1842 != 0) {
				arg5.method2469(local9.aBoolean67, arg6, arg3, local18, local21);
			}
		} else if (arg2 == 0) {
			if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
				local198 = local9.method1397(local143, 0, local117, local61, local151, arg7);
			} else {
				local198 = new Class1_Sub1_Sub4_Sub4(arg1, 0, arg7, arg0, arg6, arg3, local9.anInt1832, true, null);
			}
			Static53.method1334(arg4, arg6, arg3, local117, local198, null, Static61.anIntArray191[arg7], 0, local134);
			if (local9.anInt1842 != 0) {
				arg5.method2479(arg2, arg7, arg3, local9.aBoolean67, arg6);
			}
		} else if (arg2 == 1) {
			if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
				local198 = local9.method1397(local143, 1, local117, local61, local151, arg7);
			} else {
				local198 = new Class1_Sub1_Sub4_Sub4(arg1, 1, arg7, arg0, arg6, arg3, local9.anInt1832, true, null);
			}
			Static53.method1334(arg4, arg6, arg3, local117, local198, null, Static69.anIntArray205[arg7], 0, local134);
			if (local9.anInt1842 != 0) {
				arg5.method2479(arg2, arg7, arg3, local9.aBoolean67, arg6);
			}
		} else {
			@Pc(515) int local515;
			if (arg2 == 2) {
				local515 = arg7 + 1 & 0x3;
				@Pc(552) Class1_Sub1_Sub4 local552;
				@Pc(538) Class1_Sub1_Sub4 local538;
				if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
					local538 = local9.method1397(local143, 2, local117, local61, local151, arg7 + 4);
					local552 = local9.method1397(local143, 2, local117, local61, local151, local515);
				} else {
					local538 = new Class1_Sub1_Sub4_Sub4(arg1, 2, arg7 + 4, arg0, arg6, arg3, local9.anInt1832, true, null);
					local552 = new Class1_Sub1_Sub4_Sub4(arg1, 2, local515, arg0, arg6, arg3, local9.anInt1832, true, null);
				}
				Static53.method1334(arg4, arg6, arg3, local117, local538, local552, Static61.anIntArray191[arg7], Static61.anIntArray191[local515], local134);
				if (local9.anInt1842 != 0) {
					arg5.method2479(arg2, arg7, arg3, local9.aBoolean67, arg6);
				}
			} else if (arg2 == 3) {
				if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
					local198 = local9.method1397(local143, 3, local117, local61, local151, arg7);
				} else {
					local198 = new Class1_Sub1_Sub4_Sub4(arg1, 3, arg7, arg0, arg6, arg3, local9.anInt1832, true, null);
				}
				Static53.method1334(arg4, arg6, arg3, local117, local198, null, Static69.anIntArray205[arg7], 0, local134);
				if (local9.anInt1842 != 0) {
					arg5.method2479(arg2, arg7, arg3, local9.aBoolean67, arg6);
				}
			} else if (arg2 == 9) {
				if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
					local198 = local9.method1397(local143, arg2, local117, local61, local151, arg7);
				} else {
					local198 = new Class1_Sub1_Sub4_Sub4(arg1, arg2, arg7, arg0, arg6, arg3, local9.anInt1832, true, null);
				}
				Static5.method187(arg4, arg6, arg3, local117, 1, 1, local198, 0, local134);
				if (local9.anInt1842 != 0) {
					arg5.method2469(local9.aBoolean67, arg6, arg3, local18, local21);
				}
			} else if (arg2 == 4) {
				if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
					local198 = local9.method1397(local143, 4, local117, local61, local151, arg7);
				} else {
					local198 = new Class1_Sub1_Sub4_Sub4(arg1, 4, arg7, arg0, arg6, arg3, local9.anInt1832, true, null);
				}
				Static31.method791(arg4, arg6, arg3, local117, local198, null, Static61.anIntArray191[arg7], 0, 0, 0, local134);
			} else {
				@Pc(797) long local797;
				@Pc(828) Class1_Sub1_Sub4 local828;
				if (arg2 == 5) {
					local515 = 16;
					local797 = Static5.method186(arg4, arg6, arg3);
					if (local797 != 0L) {
						local515 = Static176.method3433(Integer.MAX_VALUE & (int) (local797 >>> 32)).anInt1806;
					}
					if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
						local828 = local9.method1397(local143, 4, local117, local61, local151, arg7);
					} else {
						local828 = new Class1_Sub1_Sub4_Sub4(arg1, 4, arg7, arg0, arg6, arg3, local9.anInt1832, true, null);
					}
					Static31.method791(arg4, arg6, arg3, local117, local828, null, Static61.anIntArray191[arg7], 0, local515 * Static172.anIntArray422[arg7], Static42.anIntArray133[arg7] * local515, local134);
				} else if (arg2 == 6) {
					local515 = 8;
					local797 = Static5.method186(arg4, arg6, arg3);
					if (local797 != 0L) {
						local515 = Static176.method3433((int) (local797 >>> 32) & Integer.MAX_VALUE).anInt1806 / 2;
					}
					if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
						local828 = local9.method1397(local143, 4, local117, local61, local151, arg7 + 4);
					} else {
						local828 = new Class1_Sub1_Sub4_Sub4(arg1, 4, arg7 + 4, arg0, arg6, arg3, local9.anInt1832, true, null);
					}
					Static31.method791(arg4, arg6, arg3, local117, local828, null, 256, arg7, Static44.anIntArray150[arg7] * local515, local515 * Static165.anIntArray409[arg7], local134);
				} else if (arg2 == 7) {
					@Pc(963) int local963 = arg7 + 2 & 0x3;
					if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
						local198 = local9.method1397(local143, 4, local117, local61, local151, local963 + 4);
					} else {
						local198 = new Class1_Sub1_Sub4_Sub4(arg1, 4, local963 + 4, arg0, arg6, arg3, local9.anInt1832, true, null);
					}
					Static31.method791(arg4, arg6, arg3, local117, local198, null, 256, local963, 0, 0, local134);
				} else if (arg2 == 8) {
					local797 = Static5.method186(arg4, arg6, arg3);
					local515 = 8;
					if (local797 != 0L) {
						local515 = Static176.method3433((int) (local797 >>> 32) & Integer.MAX_VALUE).anInt1806 / 2;
					}
					@Pc(1048) int local1048 = arg7 + 2 & 0x3;
					@Pc(1088) Class1_Sub1_Sub4 local1088;
					if (local9.anInt1832 == -1 && local9.anIntArray186 == null) {
						local828 = local9.method1397(local143, 4, local117, local61, local151, arg7 + 4);
						local1088 = local9.method1397(local143, 4, local117, local61, local151, local1048 + 4);
					} else {
						local828 = new Class1_Sub1_Sub4_Sub4(arg1, 4, arg7 + 4, arg0, arg6, arg3, local9.anInt1832, true, null);
						local1088 = new Class1_Sub1_Sub4_Sub4(arg1, 4, local1048 + 4, arg0, arg6, arg3, local9.anInt1832, true, null);
					}
					Static31.method791(arg4, arg6, arg3, local117, local828, local1088, 256, arg7, local515 * Static44.anIntArray150[arg7], Static165.anIntArray409[arg7] * local515, local134);
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIB)V")
	public static void method1549(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static131.aClass1_Sub9_Sub1_3.method1283(116);
		Static131.aClass1_Sub9_Sub1_3.method1254(arg1);
		Static131.aClass1_Sub9_Sub1_3.method1276(arg0);
	}
}
