import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static50 {

	@OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
	public static int anInt1518 = 0;

	@OriginalMember(owner = "client!ia", name = "h", descriptor = "Lclient!rd;")
	public static Class63 aClass63_806 = Static80.method1463("Duell akzeptieren");

	@OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
	public static int anInt1523 = 0;

	@OriginalMember(owner = "client!ia", name = "k", descriptor = "Lclient!bf;")
	public static Class6_Sub4 aClass6_Sub4_1 = new Class6_Sub4(new byte[5000]);

	@OriginalMember(owner = "client!ia", name = "n", descriptor = "Lclient!rd;")
	public static Class63 aClass63_807 = null;

	@OriginalMember(owner = "client!ia", name = "p", descriptor = "Lclient!mb;")
	public static Class49 aClass49_14 = new Class49(30);

	@OriginalMember(owner = "client!ia", name = "q", descriptor = "Lclient!rd;")
	private static Class63 aClass63_808 = Static80.method1463("Loaded gamescreen");

	@OriginalMember(owner = "client!ia", name = "r", descriptor = "Lclient!rd;")
	public static Class63 aClass63_809 = aClass63_808;

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BI)Lclient!pc;")
	public static Class6_Sub3_Sub14 method1040(@OriginalArg(1) int arg0) {
		@Pc(15) Class6_Sub3_Sub14 local15 = (Class6_Sub3_Sub14) Static41.aClass49_12.method1397((long) arg0);
		if (local15 != null) {
			return local15;
		}
		@Pc(25) byte[] local25 = Static114.aClass7_56.method110(4, arg0);
		local15 = new Class6_Sub3_Sub14();
		if (local25 != null) {
			local15.method1592(arg0, new Class6_Sub4(local25));
		}
		local15.method1598();
		Static41.aClass49_12.method1396((long) arg0, local15);
		return local15;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
	public static void method1041() {
		aClass63_807 = null;
		aClass6_Sub4_1 = null;
		aClass49_14 = null;
		aClass63_809 = null;
		aClass63_806 = null;
		aClass63_808 = null;
	}

	@OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLclient!ea;Lclient!hc;IIIIIII)V")
	public static void method1042(@OriginalArg(1) Class19 arg0, @OriginalArg(2) Class30 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(13) int local13 = Static11.anIntArrayArrayArray6[arg3][arg4][arg7];
		@Pc(23) int local23 = Static11.anIntArrayArrayArray6[arg3][arg4 + 1][arg7];
		@Pc(35) int local35 = Static11.anIntArrayArrayArray6[arg3][arg4 + 1][arg7 + 1];
		@Pc(45) int local45 = Static11.anIntArrayArrayArray6[arg3][arg4][arg7 + 1];
		@Pc(49) Class6_Sub3_Sub10 local49 = Static123.method2172(arg6);
		@Pc(65) int local65 = arg4 + (arg7 << 7) + (arg6 << 14) + 1073741824;
		@Pc(76) int local76 = local35 + local13 + local23 + local45 >> 2;
		@Pc(82) int local82 = arg2 + (arg8 << 6);
		if (local49.anInt1682 == 0) {
			local65 += Integer.MIN_VALUE;
		}
		if (local49.anInt1696 == 1) {
			local82 += 256;
		}
		@Pc(117) Class6_Sub3_Sub1 local117;
		if (arg2 == 22) {
			if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
				local117 = local49.method1113(local23, local35, local13, local45, 22, arg8);
			} else {
				local117 = new Class6_Sub3_Sub1_Sub5(arg6, 22, arg8, local13, local23, local35, local45, local49.anInt1681, true, null);
			}
			arg0.method658(arg5, arg4, arg7, local76, local117, local65, local82);
			if (local49.aBoolean83 && local49.anInt1682 == 1) {
				arg1.method998(arg7, arg4);
			}
			return;
		}
		@Pc(218) int local218;
		if (arg2 == 10 || arg2 == 11) {
			if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
				local117 = local49.method1113(local23, local35, local13, local45, 10, arg8);
			} else {
				local117 = new Class6_Sub3_Sub1_Sub5(arg6, 10, arg8, local13, local23, local35, local45, local49.anInt1681, true, null);
			}
			if (local117 != null) {
				@Pc(215) int local215;
				if (arg8 == 1 || arg8 == 3) {
					local215 = local49.anInt1672;
					local218 = local49.anInt1683;
				} else {
					local218 = local49.anInt1672;
					local215 = local49.anInt1683;
				}
				@Pc(228) int local228 = 0;
				if (arg2 == 11) {
					local228 += 256;
				}
				arg0.method702(arg5, arg4, arg7, local76, local218, local215, local117, local228, local65, local82);
			}
			if (local49.aBoolean83) {
				arg1.method989(arg4, local49.anInt1672, arg8, local49.anInt1683, arg7, local49.aBoolean88);
			}
		} else if (arg2 >= 12) {
			if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
				local117 = local49.method1113(local23, local35, local13, local45, arg2, arg8);
			} else {
				local117 = new Class6_Sub3_Sub1_Sub5(arg6, arg2, arg8, local13, local23, local35, local45, local49.anInt1681, true, null);
			}
			arg0.method702(arg5, arg4, arg7, local76, 1, 1, local117, 0, local65, local82);
			if (local49.aBoolean83) {
				arg1.method989(arg4, local49.anInt1672, arg8, local49.anInt1683, arg7, local49.aBoolean88);
			}
		} else if (arg2 == 0) {
			if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
				local117 = local49.method1113(local23, local35, local13, local45, 0, arg8);
			} else {
				local117 = new Class6_Sub3_Sub1_Sub5(arg6, 0, arg8, local13, local23, local35, local45, local49.anInt1681, true, null);
			}
			arg0.method668(arg5, arg4, arg7, local76, local117, null, Static109.anIntArray350[arg8], 0, local65, local82);
			if (local49.aBoolean83) {
				arg1.method993(arg7, arg4, arg2, local49.aBoolean88, arg8);
			}
		} else if (arg2 == 1) {
			if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
				local117 = local49.method1113(local23, local35, local13, local45, 1, arg8);
			} else {
				local117 = new Class6_Sub3_Sub1_Sub5(arg6, 1, arg8, local13, local23, local35, local45, local49.anInt1681, true, null);
			}
			arg0.method668(arg5, arg4, arg7, local76, local117, null, Static19.anIntArray63[arg8], 0, local65, local82);
			if (local49.aBoolean83) {
				arg1.method993(arg7, arg4, arg2, local49.aBoolean88, arg8);
			}
		} else {
			@Pc(468) int local468;
			@Pc(498) Class6_Sub3_Sub1 local498;
			if (arg2 == 2) {
				local468 = arg8 + 1 & 0x3;
				@Pc(488) Class6_Sub3_Sub1 local488;
				if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
					local488 = local49.method1113(local23, local35, local13, local45, 2, arg8 + 4);
					local498 = local49.method1113(local23, local35, local13, local45, 2, local468);
				} else {
					local488 = new Class6_Sub3_Sub1_Sub5(arg6, 2, arg8 + 4, local13, local23, local35, local45, local49.anInt1681, true, null);
					local498 = new Class6_Sub3_Sub1_Sub5(arg6, 2, local468, local13, local23, local35, local45, local49.anInt1681, true, null);
				}
				arg0.method668(arg5, arg4, arg7, local76, local488, local498, Static109.anIntArray350[arg8], Static109.anIntArray350[local468], local65, local82);
				if (local49.aBoolean83) {
					arg1.method993(arg7, arg4, arg2, local49.aBoolean88, arg8);
				}
			} else if (arg2 == 3) {
				if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
					local117 = local49.method1113(local23, local35, local13, local45, 3, arg8);
				} else {
					local117 = new Class6_Sub3_Sub1_Sub5(arg6, 3, arg8, local13, local23, local35, local45, local49.anInt1681, true, null);
				}
				arg0.method668(arg5, arg4, arg7, local76, local117, null, Static19.anIntArray63[arg8], 0, local65, local82);
				if (local49.aBoolean83) {
					arg1.method993(arg7, arg4, arg2, local49.aBoolean88, arg8);
				}
			} else if (arg2 == 9) {
				if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
					local117 = local49.method1113(local23, local35, local13, local45, arg2, arg8);
				} else {
					local117 = new Class6_Sub3_Sub1_Sub5(arg6, arg2, arg8, local13, local23, local35, local45, local49.anInt1681, true, null);
				}
				arg0.method702(arg5, arg4, arg7, local76, 1, 1, local117, 0, local65, local82);
				if (local49.aBoolean83) {
					arg1.method989(arg4, local49.anInt1672, arg8, local49.anInt1683, arg7, local49.aBoolean88);
				}
			} else {
				if (local49.aBoolean91) {
					if (arg8 == 1) {
						local468 = local45;
						local45 = local35;
						local35 = local23;
						local23 = local13;
						local13 = local468;
					} else if (arg8 == 2) {
						local468 = local45;
						local45 = local23;
						local23 = local468;
						local468 = local35;
						local35 = local13;
						local13 = local468;
					} else if (arg8 == 3) {
						local468 = local45;
						local45 = local13;
						local13 = local23;
						local23 = local35;
						local35 = local468;
					}
				}
				if (arg2 == 4) {
					if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
						local117 = local49.method1113(local23, local35, local13, local45, 4, 0);
					} else {
						local117 = new Class6_Sub3_Sub1_Sub5(arg6, 4, 0, local13, local23, local35, local45, local49.anInt1681, true, null);
					}
					arg0.method666(arg5, arg4, arg7, local76, local117, Static109.anIntArray350[arg8], arg8 * 512, 0, 0, local65, local82);
				} else if (arg2 == 5) {
					local468 = 16;
					local218 = arg0.method689(arg5, arg4, arg7);
					if (local218 != 0) {
						local468 = Static123.method2172(local218 >> 14 & 0x7FFF).anInt1669;
					}
					if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
						local498 = local49.method1113(local23, local35, local13, local45, 4, 0);
					} else {
						local498 = new Class6_Sub3_Sub1_Sub5(arg6, 4, 0, local13, local23, local35, local45, local49.anInt1681, true, null);
					}
					arg0.method666(arg5, arg4, arg7, local76, local498, Static109.anIntArray350[arg8], arg8 * 512, local468 * Static72.anIntArray233[arg8], local468 * Static97.anIntArray293[arg8], local65, local82);
				} else if (arg2 == 6) {
					if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
						local117 = local49.method1113(local23, local35, local13, local45, 4, 0);
					} else {
						local117 = new Class6_Sub3_Sub1_Sub5(arg6, 4, 0, local13, local23, local35, local45, local49.anInt1681, true, null);
					}
					arg0.method666(arg5, arg4, arg7, local76, local117, 256, arg8, 0, 0, local65, local82);
				} else if (arg2 == 7) {
					if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
						local117 = local49.method1113(local23, local35, local13, local45, 4, 0);
					} else {
						local117 = new Class6_Sub3_Sub1_Sub5(arg6, 4, 0, local13, local23, local35, local45, local49.anInt1681, true, null);
					}
					arg0.method666(arg5, arg4, arg7, local76, local117, 512, arg8, 0, 0, local65, local82);
				} else if (arg2 == 8) {
					if (local49.anInt1681 == -1 && local49.anIntArray185 == null) {
						local117 = local49.method1113(local23, local35, local13, local45, 4, 0);
					} else {
						local117 = new Class6_Sub3_Sub1_Sub5(arg6, 4, 0, local13, local23, local35, local45, local49.anInt1681, true, null);
					}
					arg0.method666(arg5, arg4, arg7, local76, local117, 768, arg8, 0, 0, local65, local82);
				}
			}
		}
	}
}
