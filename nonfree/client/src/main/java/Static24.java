import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!db", name = "c", descriptor = "I")
	public static int anInt761;

	@OriginalMember(owner = "client!db", name = "t", descriptor = "Lclient!kb;")
	public static Class41 aClass41_2;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "Lclient!af;")
	private static Class5 aClass5_345 = Static45.method1937("scroll:");

	@OriginalMember(owner = "client!db", name = "e", descriptor = "Lclient!af;")
	public static Class5 aClass5_346 = Static45.method1937(": ");

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!af;")
	public static Class5 aClass5_347 = aClass5_345;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "Lclient!af;")
	public static Class5 aClass5_348 = Static45.method1937("m");

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!af;")
	public static Class5 aClass5_349 = Static45.method1937("T");

	@OriginalMember(owner = "client!db", name = "m", descriptor = "Lclient!af;")
	public static Class5 aClass5_350 = aClass5_345;

	@OriginalMember(owner = "client!db", name = "q", descriptor = "[I")
	public static int[] anIntArray87 = new int[50];

	@OriginalMember(owner = "client!db", name = "r", descriptor = "Lclient!af;")
	public static Class5 aClass5_351 = Static45.method1937("Bitte warten Sie eine Minute");

	@OriginalMember(owner = "client!db", name = "s", descriptor = "Lclient!af;")
	public static Class5 aClass5_352 = Static45.method1937("scape main");

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!kb;Lclient!kb;I)V")
	public static void method536(@OriginalArg(0) Class41 arg0, @OriginalArg(1) Class41 arg1) {
		Static120.aClass41_17 = arg1;
		Static120.aClass41_16 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ILclient!md;IIZIILclient!rf;II)V")
	public static void method537(@OriginalArg(0) int arg0, @OriginalArg(1) Class49 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class68 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(9) int local9 = Static95.anIntArrayArrayArray2[arg4][arg2][arg3];
		@Pc(23) int local23 = Static95.anIntArrayArrayArray2[arg4][arg2 + 1][arg3];
		@Pc(35) int local35 = Static95.anIntArrayArrayArray2[arg4][arg2 + 1][arg3 + 1];
		@Pc(45) int local45 = Static95.anIntArrayArrayArray2[arg4][arg2][arg3 + 1];
		@Pc(56) int local56 = local35 + local23 + local9 + local45 >> 2;
		@Pc(60) Class1_Sub3_Sub10 local60 = Static131.method2263(arg8);
		@Pc(72) int local72 = (arg8 << 14) + (arg3 << 7) + arg2 + 1073741824;
		if (local60.anInt1702 == 0) {
			local72 += Integer.MIN_VALUE;
		}
		@Pc(86) int local86 = (arg7 << 6) + arg5;
		if (local60.anInt1670 == 1) {
			local86 += 256;
		}
		@Pc(121) Class1_Sub3_Sub4 local121;
		if (arg5 == 22) {
			if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
				local121 = local60.method1265(arg7, local45, local23, local35, 22, local9);
			} else {
				local121 = new Class1_Sub3_Sub4_Sub5(arg8, 22, arg7, local9, local23, local35, local45, local60.anInt1704, true, null);
			}
			arg6.method1859(arg0, arg2, arg3, local56, local121, local72, local86);
			if (local60.anInt1681 == 1) {
				arg1.method1318(arg2, arg3);
			}
			return;
		}
		@Pc(210) int local210;
		if (arg5 == 10 || arg5 == 11) {
			if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
				local121 = local60.method1265(arg7, local45, local23, local35, 10, local9);
			} else {
				local121 = new Class1_Sub3_Sub4_Sub5(arg8, 10, arg7, local9, local23, local35, local45, local60.anInt1704, true, null);
			}
			if (local121 != null) {
				@Pc(207) int local207;
				if (arg7 == 1 || arg7 == 3) {
					local210 = local60.anInt1693;
					local207 = local60.anInt1696;
				} else {
					local207 = local60.anInt1693;
					local210 = local60.anInt1696;
				}
				@Pc(220) int local220 = 0;
				if (arg5 == 11) {
					local220 += 256;
				}
				arg6.method1849(arg0, arg2, arg3, local56, local210, local207, local121, local220, local72, local86);
			}
			if (local60.anInt1681 != 0) {
				arg1.method1317(arg2, arg7, arg3, local60.anInt1693, local60.anInt1696, local60.aBoolean58);
			}
		} else if (arg5 >= 12) {
			if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
				local121 = local60.method1265(arg7, local45, local23, local35, arg5, local9);
			} else {
				local121 = new Class1_Sub3_Sub4_Sub5(arg8, arg5, arg7, local9, local23, local35, local45, local60.anInt1704, true, null);
			}
			arg6.method1849(arg0, arg2, arg3, local56, 1, 1, local121, 0, local72, local86);
			if (local60.anInt1681 != 0) {
				arg1.method1317(arg2, arg7, arg3, local60.anInt1693, local60.anInt1696, local60.aBoolean58);
			}
		} else if (arg5 == 0) {
			if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
				local121 = local60.method1265(arg7, local45, local23, local35, 0, local9);
			} else {
				local121 = new Class1_Sub3_Sub4_Sub5(arg8, 0, arg7, local9, local23, local35, local45, local60.anInt1704, true, null);
			}
			arg6.method1844(arg0, arg2, arg3, local56, local121, null, Static96.anIntArray366[arg7], 0, local72, local86);
			if (local60.anInt1681 != 0) {
				arg1.method1325(arg3, arg5, arg7, local60.aBoolean58, arg2);
			}
		} else if (arg5 == 1) {
			if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
				local121 = local60.method1265(arg7, local45, local23, local35, 1, local9);
			} else {
				local121 = new Class1_Sub3_Sub4_Sub5(arg8, 1, arg7, local9, local23, local35, local45, local60.anInt1704, true, null);
			}
			arg6.method1844(arg0, arg2, arg3, local56, local121, null, Static40.anIntArray183[arg7], 0, local72, local86);
			if (local60.anInt1681 != 0) {
				arg1.method1325(arg3, arg5, arg7, local60.aBoolean58, arg2);
			}
		} else {
			@Pc(468) int local468;
			@Pc(507) Class1_Sub3_Sub4 local507;
			if (arg5 == 2) {
				local468 = arg7 + 1 & 0x3;
				@Pc(492) Class1_Sub3_Sub4 local492;
				if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
					local492 = local60.method1265(arg7 + 4, local45, local23, local35, 2, local9);
					local507 = local60.method1265(local468, local45, local23, local35, 2, local9);
				} else {
					local492 = new Class1_Sub3_Sub4_Sub5(arg8, 2, arg7 + 4, local9, local23, local35, local45, local60.anInt1704, true, null);
					local507 = new Class1_Sub3_Sub4_Sub5(arg8, 2, local468, local9, local23, local35, local45, local60.anInt1704, true, null);
				}
				arg6.method1844(arg0, arg2, arg3, local56, local492, local507, Static96.anIntArray366[arg7], Static96.anIntArray366[local468], local72, local86);
				if (local60.anInt1681 != 0) {
					arg1.method1325(arg3, arg5, arg7, local60.aBoolean58, arg2);
				}
			} else if (arg5 == 3) {
				if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
					local121 = local60.method1265(arg7, local45, local23, local35, 3, local9);
				} else {
					local121 = new Class1_Sub3_Sub4_Sub5(arg8, 3, arg7, local9, local23, local35, local45, local60.anInt1704, true, null);
				}
				arg6.method1844(arg0, arg2, arg3, local56, local121, null, Static40.anIntArray183[arg7], 0, local72, local86);
				if (local60.anInt1681 != 0) {
					arg1.method1325(arg3, arg5, arg7, local60.aBoolean58, arg2);
				}
			} else if (arg5 == 9) {
				if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
					local121 = local60.method1265(arg7, local45, local23, local35, arg5, local9);
				} else {
					local121 = new Class1_Sub3_Sub4_Sub5(arg8, arg5, arg7, local9, local23, local35, local45, local60.anInt1704, true, null);
				}
				arg6.method1849(arg0, arg2, arg3, local56, 1, 1, local121, 0, local72, local86);
				if (local60.anInt1681 != 0) {
					arg1.method1317(arg2, arg7, arg3, local60.anInt1693, local60.anInt1696, local60.aBoolean58);
				}
			} else {
				if (local60.aBoolean53) {
					if (arg7 == 1) {
						local468 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local9;
						local9 = local468;
					} else if (arg7 == 2) {
						local468 = local45;
						local45 = local23;
						local23 = local468;
						@Pc(733) int local733 = local35;
						local35 = local9;
						local9 = local733;
					} else if (arg7 == 3) {
						local468 = local45;
						local45 = local9;
						local9 = local23;
						local23 = local35;
						local35 = local468;
					}
				}
				if (arg5 == 4) {
					if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
						local121 = local60.method1265(0, local45, local23, local35, 4, local9);
					} else {
						local121 = new Class1_Sub3_Sub4_Sub5(arg8, 4, 0, local9, local23, local35, local45, local60.anInt1704, true, null);
					}
					arg6.method1845(arg0, arg2, arg3, local56, local121, Static96.anIntArray366[arg7], arg7 * 512, 0, 0, local72, local86);
				} else if (arg5 == 5) {
					local468 = 16;
					local210 = arg6.method1875(arg0, arg2, arg3);
					if (local210 != 0) {
						local468 = Static131.method2263(local210 >> 14 & 0x7FFF).anInt1690;
					}
					if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
						local507 = local60.method1265(0, local45, local23, local35, 4, local9);
					} else {
						local507 = new Class1_Sub3_Sub4_Sub5(arg8, 4, 0, local9, local23, local35, local45, local60.anInt1704, true, null);
					}
					arg6.method1845(arg0, arg2, arg3, local56, local507, Static96.anIntArray366[arg7], arg7 * 512, local468 * Static72.anIntArray277[arg7], local468 * Static49.anIntArray200[arg7], local72, local86);
				} else if (arg5 == 6) {
					if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
						local121 = local60.method1265(0, local45, local23, local35, 4, local9);
					} else {
						local121 = new Class1_Sub3_Sub4_Sub5(arg8, 4, 0, local9, local23, local35, local45, local60.anInt1704, true, null);
					}
					arg6.method1845(arg0, arg2, arg3, local56, local121, 256, arg7, 0, 0, local72, local86);
				} else if (arg5 == 7) {
					if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
						local121 = local60.method1265(0, local45, local23, local35, 4, local9);
					} else {
						local121 = new Class1_Sub3_Sub4_Sub5(arg8, 4, 0, local9, local23, local35, local45, local60.anInt1704, true, null);
					}
					arg6.method1845(arg0, arg2, arg3, local56, local121, 512, arg7, 0, 0, local72, local86);
				} else if (arg5 == 8) {
					if (local60.anInt1704 == -1 && local60.anIntArray283 == null) {
						local121 = local60.method1265(0, local45, local23, local35, 4, local9);
					} else {
						local121 = new Class1_Sub3_Sub4_Sub5(arg8, 4, 0, local9, local23, local35, local45, local60.anInt1704, true, null);
					}
					arg6.method1845(arg0, arg2, arg3, local56, local121, 768, arg7, 0, 0, local72, local86);
				}
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
	public static void method538() {
		if (Static93.aClass18_1 != null) {
			@Pc(3) Class18 local3 = Static93.aClass18_1;
			synchronized (Static93.aClass18_1) {
				Static93.aClass18_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
	public static void method539() {
		aClass5_346 = null;
		aClass5_345 = null;
		aClass5_349 = null;
		aClass5_348 = null;
		aClass5_351 = null;
		aClass5_347 = null;
		anIntArray87 = null;
		aClass5_350 = null;
		aClass41_2 = null;
		aClass5_352 = null;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(ZLclient!of;)Z")
	public static boolean method540(@OriginalArg(1) Class1_Sub17 arg0) {
		if (Static93.aBoolean91) {
			if (Static6.method221(arg0) != 0) {
				return false;
			}
			if (arg0.anInt2271 == 0) {
				return false;
			}
		}
		return arg0.aBoolean86;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Lclient!af;ILclient!af;Lclient!kb;)[Lclient!qc;")
	public static Class1_Sub3_Sub1_Sub3[] method541(@OriginalArg(0) Class5 arg0, @OriginalArg(2) Class5 arg1, @OriginalArg(3) Class41 arg2) {
		@Pc(8) int local8 = arg2.method1724(arg1);
		@Pc(19) int local19 = arg2.method1698(arg0, local8);
		return Static69.method1211(arg2, local8, local19);
	}
}
