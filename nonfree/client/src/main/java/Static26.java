import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!at", name = "u", descriptor = "I")
	public static int anInt392;

	@OriginalMember(owner = "client!at", name = "x", descriptor = "F")
	public static float aFloat6;

	@OriginalMember(owner = "client!at", name = "y", descriptor = "Lclient!sg;")
	public static Class305 aClass305_2;

	@OriginalMember(owner = "client!at", name = "s", descriptor = "[I")
	public static final int[] anIntArray31 = new int[] { 1, 4, 1, 2 };

	@OriginalMember(owner = "client!at", name = "z", descriptor = "[I")
	public static final int[] anIntArray32 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIIIIII)V")
	public static void method364(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg5 < 0 || arg2 < 0 || Static399.anInt7121 - 1 <= arg5 || Static24.anInt345 - 1 <= arg2) {
			return;
		}
		if (Static567.aClass351ArrayArrayArray4 == null) {
			return;
		}
		@Pc(43) Interface2 local43;
		if (arg3 == 0) {
			local43 = (Interface2) Static380.method5991(arg1, arg5, arg2);
			@Pc(49) Interface2 local49 = (Interface2) Static577.method8082(arg1, arg5, arg2);
			if (local43 != null && arg0 != 2) {
				if (local43 instanceof Class9_Sub2_Sub3_Sub2) {
					((Class9_Sub2_Sub3_Sub2) local43).aClass71_3.method1698(arg6);
				} else {
					Static233.method3996(arg6, local43.method7500(), arg1, arg4, arg5, arg2, arg3, arg0);
				}
			}
			if (local49 != null) {
				if (!(local49 instanceof Class9_Sub2_Sub3_Sub2)) {
					Static233.method3996(arg6, local49.method7500(), arg1, arg4, arg5, arg2, arg3, arg0);
					return;
				}
				((Class9_Sub2_Sub3_Sub2) local49).aClass71_3.method1698(arg6);
				return;
			}
			return;
		}
		if (arg3 != 1) {
			if (arg3 == 2) {
				local43 = (Interface2) Static137.method2371(arg1, arg5, arg2, bda.class);
				if (local43 == null) {
					return;
				}
				if (arg0 == 11) {
					arg0 = 10;
				}
				if (local43 instanceof Class9_Sub2_Sub1_Sub1) {
					((Class9_Sub2_Sub1_Sub1) local43).aClass71_1.method1698(arg6);
					return;
				}
				Static233.method3996(arg6, local43.method7500(), arg1, arg4, arg5, arg2, arg3, arg0);
			} else if (arg3 == 3) {
				local43 = (Interface2) Static279.method4563(arg1, arg5, arg2);
				if (local43 != null) {
					if (!(local43 instanceof Class9_Sub2_Sub4_Sub1)) {
						Static233.method3996(arg6, local43.method7500(), arg1, arg4, arg5, arg2, arg3, arg0);
						return;
					}
					((Class9_Sub2_Sub4_Sub1) local43).aClass71_2.method1698(arg6);
					return;
				}
			}
			return;
		}
		local43 = (Interface2) Static483.method7129(arg1, arg5, arg2);
		if (local43 == null) {
			return;
		}
		if (!(local43 instanceof Class9_Sub2_Sub5_Sub1)) {
			@Pc(203) int local203 = local43.method7500();
			if (arg0 == 4 || arg0 == 5) {
				Static233.method3996(arg6, local203, arg1, arg4, arg5, arg2, arg3, 4);
			} else if (arg0 == 6) {
				Static233.method3996(arg6, local203, arg1, arg4 + 4, arg5, arg2, arg3, 4);
				return;
			} else if (arg0 == 7) {
				Static233.method3996(arg6, local203, arg1, (arg4 + 2 & 0x3) + 4, arg5, arg2, arg3, 4);
				return;
			} else if (arg0 == 8) {
				Static233.method3996(arg6, local203, arg1, arg4 + 4, arg5, arg2, arg3, 4);
				Static233.method3996(arg6, local203, arg1, (arg4 + 2 & 0x3) + 4, arg5, arg2, arg3, 4);
				return;
			}
			return;
		}
		((Class9_Sub2_Sub5_Sub1) local43).aClass71_4.method1698(arg6);
		return;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "([BBII)Ljava/lang/String;")
	public static String method365(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(13) char[] local13 = new char[arg1];
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = arg2;
		@Pc(21) int local21 = arg1 + arg2;
		while (local21 > local17) {
			@Pc(30) int local30 = arg0[local17++] & 0xFF;
			@Pc(39) int local39;
			if (local30 < 128) {
				if (local30 == 0) {
					local39 = 65533;
				} else {
					local39 = local30;
				}
			} else if (local30 < 192) {
				local39 = 65533;
			} else if (local30 < 224) {
				if (local17 < local21 && (arg0[local17] & 0xC0) == 128) {
					local39 = arg0[local17++] & 0x3F | (local30 & 0x1F) << 6;
					if (local39 < 128) {
						local39 = 65533;
					}
				} else {
					local39 = 65533;
				}
			} else if (local30 < 240) {
				if (local21 > local17 + 1 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128) {
					local39 = (local30 & 0xF) << 12 | arg0[local17++] << 6 & 0xFC0 | arg0[local17++] & 0x3F;
					if (local39 < 2048) {
						local39 = 65533;
					}
				} else {
					local39 = 65533;
				}
			} else if (local30 >= 248) {
				local39 = 65533;
			} else if (local17 + 2 < local21 && (arg0[local17] & 0xC0) == 128 && (arg0[local17 + 1] & 0xC0) == 128 && (arg0[local17 + 2] & 0xC0) == 128) {
				local39 = (local30 & 0x7) << 18 | (arg0[local17++] & 0x3F) << 12 | (arg0[local17++] & 0x3F) << 6 | arg0[local17++] & 0x3F;
				if (local39 >= 65536 && local39 <= 1114111) {
					local39 = 65533;
				} else {
					local39 = 65533;
				}
			} else {
				local39 = 65533;
			}
			local13[local15++] = (char) local39;
		}
		return new String(local13, 0, local15);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!co;I)V")
	public static void method366(@OriginalArg(0) Class3_Sub3 arg0) {
		if (arg0.aClass3_Sub18_6 != null) {
			arg0.aClass3_Sub18_6.anInt10131 = 0;
		}
		arg0.aBoolean399 = false;
		for (@Pc(22) Class3_Sub3 local22 = arg0.method4680(); local22 != null; local22 = arg0.method4679()) {
			method366(local22);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(BLclient!ni;III)V")
	public static void method367(@OriginalArg(1) Class9_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(13) Class176 local13 = arg0.method8633();
		@Pc(23) int local23 = arg0.anInt10232 - arg0.aClass191_7.anInt5877 & 0x3FFF;
		if (arg2 == -1) {
			if (local23 != 0 || arg0.anInt10217 > 25) {
				if (arg3 < 0 && local13.anInt5231 != -1) {
					arg0.aBoolean773 = false;
					arg0.anInt10211 = local13.anInt5231;
				} else if (arg3 <= 0 || local13.anInt5203 == -1) {
					arg0.anInt10211 = local13.anInt5215;
				} else {
					arg0.anInt10211 = local13.anInt5203;
				}
				arg0.aBoolean773 = false;
			} else if (!arg0.aBoolean773 || !local13.method4477(arg0.anInt10211)) {
				arg0.anInt10211 = local13.method4481();
				arg0.aBoolean773 = arg0.anInt10211 != -1;
			}
		} else if (arg0.anInt10185 != -1 && (local23 >= 10240 || local23 <= 2048)) {
			@Pc(122) int local122 = Static195.anIntArray215[arg1] - arg0.aClass191_7.anInt5877 & 0x3FFF;
			if (arg2 == 2 && local13.anInt5222 != -1) {
				if (local122 > 2048 && local122 <= 6144 && local13.anInt5204 != -1) {
					arg0.anInt10211 = local13.anInt5204;
				} else if (local122 >= 10240 && local122 < 14336 && local13.anInt5217 != -1) {
					arg0.anInt10211 = local13.anInt5217;
				} else if (local122 <= 6144 || local122 >= 10240 || local13.anInt5188 == -1) {
					arg0.anInt10211 = local13.anInt5222;
				} else {
					arg0.anInt10211 = local13.anInt5188;
				}
			} else if (arg2 == 0 && local13.anInt5210 != -1) {
				if (local122 > 2048 && local122 <= 6144 && local13.anInt5221 != -1) {
					arg0.anInt10211 = local13.anInt5221;
				} else if (local122 >= 10240 && local122 < 14336 && local13.anInt5223 != -1) {
					arg0.anInt10211 = local13.anInt5223;
				} else if (local122 <= 6144 || local122 >= 10240 || local13.anInt5218 == -1) {
					arg0.anInt10211 = local13.anInt5210;
				} else {
					arg0.anInt10211 = local13.anInt5218;
				}
			} else if (local122 > 2048 && local122 <= 6144 && local13.anInt5212 != -1) {
				arg0.anInt10211 = local13.anInt5212;
			} else if (local122 >= 10240 && local122 < 14336 && local13.anInt5206 != -1) {
				arg0.anInt10211 = local13.anInt5206;
			} else if (local122 <= 6144 || local122 >= 10240 || local13.anInt5193 == -1) {
				arg0.anInt10211 = local13.anInt5215;
			} else {
				arg0.anInt10211 = local13.anInt5193;
			}
			arg0.aBoolean773 = false;
		} else if (local23 == 0 && arg0.anInt10217 <= 25) {
			arg0.aBoolean773 = false;
			if (arg2 == 2 && local13.anInt5222 != -1) {
				arg0.anInt10211 = local13.anInt5222;
			} else if (arg2 == 0 && local13.anInt5210 != -1) {
				arg0.anInt10211 = local13.anInt5210;
			} else {
				arg0.anInt10211 = local13.anInt5215;
			}
		} else {
			arg0.aBoolean773 = false;
			if (arg2 == 2 && local13.anInt5222 != -1) {
				if (arg3 < 0 && local13.anInt5196 != -1) {
					arg0.anInt10211 = local13.anInt5196;
				} else if (arg3 <= 0 || local13.anInt5209 == -1) {
					arg0.anInt10211 = local13.anInt5222;
				} else {
					arg0.anInt10211 = local13.anInt5209;
				}
			} else if (arg2 == 0 && local13.anInt5210 != -1) {
				if (arg3 < 0 && local13.anInt5192 != -1) {
					arg0.anInt10211 = local13.anInt5192;
				} else if (arg3 <= 0 || local13.anInt5190 == -1) {
					arg0.anInt10211 = local13.anInt5210;
				} else {
					arg0.anInt10211 = local13.anInt5190;
				}
			} else if (arg3 < 0 && local13.anInt5220 != -1) {
				arg0.anInt10211 = local13.anInt5220;
			} else if (arg3 <= 0 || local13.anInt5191 == -1) {
				arg0.anInt10211 = local13.anInt5215;
			} else {
				arg0.anInt10211 = local13.anInt5191;
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(II)Z")
	public static boolean method368(@OriginalArg(1) int arg0) {
		return arg0 == 10 || arg0 == 11 || arg0 == 12;
	}
}
