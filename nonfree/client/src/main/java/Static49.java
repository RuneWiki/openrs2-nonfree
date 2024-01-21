import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!i", name = "g", descriptor = "Lclient!rf;")
	public static Class69 aClass69_3;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Lclient!jf;")
	public static Class42 aClass42_7 = new Class42(32);

	@OriginalMember(owner = "client!i", name = "c", descriptor = "[I")
	public static int[] anIntArray136 = new int[500];

	@OriginalMember(owner = "client!i", name = "d", descriptor = "Lclient!ja;")
	public static Class39 aClass39_730 = Static28.method504("scape main");

	@OriginalMember(owner = "client!i", name = "e", descriptor = "Lclient!c;")
	public static Class12 aClass12_33 = new Class12(64);

	@OriginalMember(owner = "client!i", name = "f", descriptor = "I")
	public static int anInt1278 = -1;

	@OriginalMember(owner = "client!i", name = "j", descriptor = "I")
	public static int anInt1281 = 0;

	@OriginalMember(owner = "client!i", name = "k", descriptor = "I")
	public static int anInt1282 = 2;

	@OriginalMember(owner = "client!i", name = "l", descriptor = "I")
	public static int anInt1283 = 1;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
	public static int[] anIntArray137 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!ja;")
	public static Class39 aClass39_731 = Static28.method504("l");

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	public static void method797() {
		aClass69_3 = null;
		aClass12_33 = null;
		aClass39_730 = null;
		aClass42_7 = null;
		anIntArray136 = null;
		aClass39_731 = null;
		anIntArray137 = null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BI)I")
	public static int method798(@OriginalArg(1) int arg0) {
		@Pc(14) int local14 = arg0 - 1;
		@Pc(20) int local20 = local14 | local14 >>> 1;
		@Pc(26) int local26 = local20 | local20 >>> 2;
		@Pc(36) int local36 = local26 | local26 >>> 4;
		@Pc(42) int local42 = local36 | local36 >>> 8;
		@Pc(48) int local48 = local42 | local42 >>> 16;
		return local48 + 1;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIIBIILclient!we;ILclient!ka;)V")
	public static void method799(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class81 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) Class43 arg8) {
		@Pc(13) int local13 = Static6.anIntArrayArrayArray1[arg1][arg7][arg2];
		@Pc(29) int local29 = Static6.anIntArrayArrayArray1[arg1][arg7 + 1][arg2];
		@Pc(41) int local41 = Static6.anIntArrayArrayArray1[arg1][arg7 + 1][arg2 + 1];
		@Pc(51) int local51 = Static6.anIntArrayArrayArray1[arg1][arg7][arg2 + 1];
		@Pc(61) int local61 = local41 + local29 + local13 + local51 >> 2;
		@Pc(74) int local74 = (arg3 << 14) + arg7 + (arg2 << 7) + 1073741824;
		@Pc(80) int local80 = arg0 + (arg4 << 6);
		@Pc(84) Class4_Sub2_Sub10 local84 = Static73.method1207(arg3);
		if (local84.anInt1404 == 0) {
			local74 += Integer.MIN_VALUE;
		}
		if (local84.anInt1396 == 1) {
			local80 += 256;
		}
		@Pc(126) Class4_Sub2_Sub1 local126;
		if (arg0 == 22) {
			if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
				local126 = local84.method926(22, local29, local51, local41, arg4, local13);
			} else {
				local126 = new Class4_Sub2_Sub1_Sub2(arg3, 22, arg4, local13, local29, local41, local51, local84.anInt1428, true, null);
			}
			arg8.method1102(arg5, arg7, arg2, local61, local126, local74, local80);
			if (local84.anInt1407 == 1) {
				arg6.method2225(arg7, arg2);
			}
			return;
		}
		@Pc(217) int local217;
		if (arg0 == 10 || arg0 == 11) {
			if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
				local126 = local84.method926(10, local29, local51, local41, arg4, local13);
			} else {
				local126 = new Class4_Sub2_Sub1_Sub2(arg3, 10, arg4, local13, local29, local41, local51, local84.anInt1428, true, null);
			}
			if (local126 != null) {
				@Pc(206) int local206 = 0;
				@Pc(220) int local220;
				if (arg4 == 1 || arg4 == 3) {
					local217 = local84.anInt1413;
					local220 = local84.anInt1410;
				} else {
					local217 = local84.anInt1410;
					local220 = local84.anInt1413;
				}
				if (arg0 == 11) {
					local206 += 256;
				}
				arg8.method1092(arg5, arg7, arg2, local61, local217, local220, local126, local206, local74, local80);
			}
			if (local84.anInt1407 != 0) {
				arg6.method2226(local84.anInt1413, arg4, local84.anInt1410, local84.aBoolean75, arg7, arg2);
			}
		} else if (arg0 >= 12) {
			if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
				local126 = local84.method926(arg0, local29, local51, local41, arg4, local13);
			} else {
				local126 = new Class4_Sub2_Sub1_Sub2(arg3, arg0, arg4, local13, local29, local41, local51, local84.anInt1428, true, null);
			}
			arg8.method1092(arg5, arg7, arg2, local61, 1, 1, local126, 0, local74, local80);
			if (local84.anInt1407 != 0) {
				arg6.method2226(local84.anInt1413, arg4, local84.anInt1410, local84.aBoolean75, arg7, arg2);
			}
		} else if (arg0 == 0) {
			if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
				local126 = local84.method926(0, local29, local51, local41, arg4, local13);
			} else {
				local126 = new Class4_Sub2_Sub1_Sub2(arg3, 0, arg4, local13, local29, local41, local51, local84.anInt1428, true, null);
			}
			arg8.method1114(arg5, arg7, arg2, local61, local126, null, Static99.anIntArray279[arg4], 0, local74, local80);
			if (local84.anInt1407 != 0) {
				arg6.method2224(arg4, arg2, arg0, local84.aBoolean75, arg7);
			}
		} else if (arg0 == 1) {
			if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
				local126 = local84.method926(1, local29, local51, local41, arg4, local13);
			} else {
				local126 = new Class4_Sub2_Sub1_Sub2(arg3, 1, arg4, local13, local29, local41, local51, local84.anInt1428, true, null);
			}
			arg8.method1114(arg5, arg7, arg2, local61, local126, null, Static131.anIntArray367[arg4], 0, local74, local80);
			if (local84.anInt1407 != 0) {
				arg6.method2224(arg4, arg2, arg0, local84.aBoolean75, arg7);
			}
		} else {
			@Pc(473) int local473;
			@Pc(503) Class4_Sub2_Sub1 local503;
			if (arg0 == 2) {
				local473 = arg4 + 1 & 0x3;
				@Pc(493) Class4_Sub2_Sub1 local493;
				if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
					local493 = local84.method926(2, local29, local51, local41, arg4 + 4, local13);
					local503 = local84.method926(2, local29, local51, local41, local473, local13);
				} else {
					local493 = new Class4_Sub2_Sub1_Sub2(arg3, 2, arg4 + 4, local13, local29, local41, local51, local84.anInt1428, true, null);
					local503 = new Class4_Sub2_Sub1_Sub2(arg3, 2, local473, local13, local29, local41, local51, local84.anInt1428, true, null);
				}
				arg8.method1114(arg5, arg7, arg2, local61, local493, local503, Static99.anIntArray279[arg4], Static99.anIntArray279[local473], local74, local80);
				if (local84.anInt1407 != 0) {
					arg6.method2224(arg4, arg2, arg0, local84.aBoolean75, arg7);
				}
			} else if (arg0 == 3) {
				if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
					local126 = local84.method926(3, local29, local51, local41, arg4, local13);
				} else {
					local126 = new Class4_Sub2_Sub1_Sub2(arg3, 3, arg4, local13, local29, local41, local51, local84.anInt1428, true, null);
				}
				arg8.method1114(arg5, arg7, arg2, local61, local126, null, Static131.anIntArray367[arg4], 0, local74, local80);
				if (local84.anInt1407 != 0) {
					arg6.method2224(arg4, arg2, arg0, local84.aBoolean75, arg7);
				}
			} else if (arg0 == 9) {
				if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
					local126 = local84.method926(arg0, local29, local51, local41, arg4, local13);
				} else {
					local126 = new Class4_Sub2_Sub1_Sub2(arg3, arg0, arg4, local13, local29, local41, local51, local84.anInt1428, true, null);
				}
				arg8.method1092(arg5, arg7, arg2, local61, 1, 1, local126, 0, local74, local80);
				if (local84.anInt1407 != 0) {
					arg6.method2226(local84.anInt1413, arg4, local84.anInt1410, local84.aBoolean75, arg7, arg2);
				}
			} else {
				if (local84.aBoolean72) {
					if (arg4 == 1) {
						local473 = local51;
						local51 = local41;
						local41 = local29;
						local29 = local13;
						local13 = local473;
					} else if (arg4 == 2) {
						local473 = local51;
						local51 = local29;
						local29 = local473;
						local473 = local41;
						local41 = local13;
						local13 = local473;
					} else if (arg4 == 3) {
						local473 = local51;
						local51 = local13;
						local13 = local29;
						local29 = local41;
						local41 = local473;
					}
				}
				if (arg0 == 4) {
					if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
						local126 = local84.method926(4, local29, local51, local41, 0, local13);
					} else {
						local126 = new Class4_Sub2_Sub1_Sub2(arg3, 4, 0, local13, local29, local41, local51, local84.anInt1428, true, null);
					}
					arg8.method1118(arg5, arg7, arg2, local61, local126, Static99.anIntArray279[arg4], arg4 * 512, 0, 0, local74, local80);
				} else if (arg0 == 5) {
					local473 = 16;
					local217 = arg8.method1099(arg5, arg7, arg2);
					if (local217 != 0) {
						local473 = Static73.method1207(local217 >> 14 & 0x7FFF).anInt1412;
					}
					if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
						local503 = local84.method926(4, local29, local51, local41, 0, local13);
					} else {
						local503 = new Class4_Sub2_Sub1_Sub2(arg3, 4, 0, local13, local29, local41, local51, local84.anInt1428, true, null);
					}
					arg8.method1118(arg5, arg7, arg2, local61, local503, Static99.anIntArray279[arg4], arg4 * 512, local473 * Static130.anIntArray364[arg4], Static25.anIntArray363[arg4] * local473, local74, local80);
				} else if (arg0 == 6) {
					if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
						local126 = local84.method926(4, local29, local51, local41, 0, local13);
					} else {
						local126 = new Class4_Sub2_Sub1_Sub2(arg3, 4, 0, local13, local29, local41, local51, local84.anInt1428, true, null);
					}
					arg8.method1118(arg5, arg7, arg2, local61, local126, 256, arg4, 0, 0, local74, local80);
				} else if (arg0 == 7) {
					if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
						local126 = local84.method926(4, local29, local51, local41, 0, local13);
					} else {
						local126 = new Class4_Sub2_Sub1_Sub2(arg3, 4, 0, local13, local29, local41, local51, local84.anInt1428, true, null);
					}
					arg8.method1118(arg5, arg7, arg2, local61, local126, 512, arg4, 0, 0, local74, local80);
				} else if (arg0 == 8) {
					if (local84.anInt1428 == -1 && local84.anIntArray144 == null) {
						local126 = local84.method926(4, local29, local51, local41, 0, local13);
					} else {
						local126 = new Class4_Sub2_Sub1_Sub2(arg3, 4, 0, local13, local29, local41, local51, local84.anInt1428, true, null);
					}
					arg8.method1118(arg5, arg7, arg2, local61, local126, 768, arg4, 0, 0, local74, local80);
				}
			}
		}
	}
}
