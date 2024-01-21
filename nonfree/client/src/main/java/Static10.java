import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static10 {

	@OriginalMember(owner = "client!ba", name = "U", descriptor = "Lclient!ud;")
	public static Class62_Sub1 aClass62_Sub1_9;

	@OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
	public static int anInt355;

	@OriginalMember(owner = "client!ba", name = "ab", descriptor = "Z")
	public static boolean aBoolean21 = false;

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIIII)V")
	public static void method211(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(3) Class8 local3 = new Class8();
		local3.anInt371 = arg2 / 128;
		local3.anInt375 = arg3 / 128;
		local3.anInt364 = arg4 / 128;
		local3.anInt377 = arg5 / 128;
		local3.anInt378 = arg1;
		local3.anInt376 = arg2;
		local3.anInt360 = arg3;
		local3.anInt373 = arg4;
		local3.anInt366 = arg5;
		local3.anInt365 = arg6;
		local3.anInt379 = arg7;
		Static30.aClass8ArrayArray1[arg0][Static30.anIntArray65[arg0]++] = local3;
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILclient!mb;ZIIIII)V")
	public static void method212(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class58 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(9) Class4_Sub1_Sub19 local9 = Static113.method2090(arg7);
		@Pc(13) int[][] local13 = Static112.anIntArrayArrayArray42[arg1];
		@Pc(29) int local29;
		@Pc(26) int local26;
		if (arg6 == 1 || arg6 == 3) {
			local26 = local9.anInt4191;
			local29 = local9.anInt4187;
		} else {
			local29 = local9.anInt4191;
			local26 = local9.anInt4187;
		}
		@Pc(50) int local50;
		@Pc(58) int local58;
		if (arg0 + local29 <= 104) {
			local50 = arg0 + (local29 >> 1);
			local58 = (local29 + 1 >> 1) + arg0;
		} else {
			local50 = arg0;
			local58 = arg0 + 1;
		}
		@Pc(77) int local77;
		@Pc(75) int local75;
		if (arg4 + local26 > 104) {
			local75 = arg4 + 1;
			local77 = arg4;
		} else {
			local75 = (local26 + 1 >> 1) + arg4;
			local77 = (local26 >> 1) + arg4;
		}
		@Pc(120) int local120 = local13[local58][local75] + local13[local50][local77] + local13[local58][local77] + local13[local50][local75] >> 2;
		@Pc(129) int local129 = (arg0 << 7) + (local29 << 6);
		@Pc(146) long local146 = (long) ((arg6 | 0x400) << 20 | arg0 | arg4 << 7 | arg3 << 14);
		if (local9.anInt4175 == 0) {
			local146 |= Long.MIN_VALUE;
		}
		@Pc(161) int local161 = (local26 << 6) + (arg4 << 7);
		if (local9.anInt4164 == 1) {
			local146 |= 0x400000L;
		}
		local146 |= (long) arg7 << 32;
		@Pc(201) Class4_Sub1_Sub1 local201;
		if (arg3 == 22) {
			if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
				local201 = local9.method3190(arg6, local129, local161, 22, local120, local13);
			} else {
				local201 = new Class4_Sub1_Sub1_Sub2(arg7, 22, arg6, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
			}
			Static43.method731(arg5, arg0, arg4, local120, local201, local146, local9.aBoolean174);
			if (local9.anInt4156 == 1) {
				arg2.method1989(arg0, arg4);
			}
		} else if (arg3 == 10 || arg3 == 11) {
			if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
				local201 = local9.method3190(arg6, local129, local161, 10, local120, local13);
			} else {
				local201 = new Class4_Sub1_Sub1_Sub2(arg7, 10, arg6, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
			}
			if (local201 != null) {
				Static102.method1955(arg5, arg0, arg4, local120, local29, local26, local201, arg3 == 11 ? 256 : 0, local146);
			}
			if (local9.anInt4156 != 0) {
				arg2.method1990(local9.aBoolean177, arg0, local29, local26, arg4);
			}
		} else if (arg3 >= 12) {
			if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
				local201 = local9.method3190(arg6, local129, local161, arg3, local120, local13);
			} else {
				local201 = new Class4_Sub1_Sub1_Sub2(arg7, arg3, arg6, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
			}
			Static102.method1955(arg5, arg0, arg4, local120, 1, 1, local201, 0, local146);
			if (local9.anInt4156 != 0) {
				arg2.method1990(local9.aBoolean177, arg0, local29, local26, arg4);
			}
		} else if (arg3 == 0) {
			if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
				local201 = local9.method3190(arg6, local129, local161, 0, local120, local13);
			} else {
				local201 = new Class4_Sub1_Sub1_Sub2(arg7, 0, arg6, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
			}
			Static1.method5(arg5, arg0, arg4, local120, local201, null, Static38.anIntArray89[arg6], 0, local146);
			if (local9.anInt4156 != 0) {
				arg2.method1991(arg3, arg4, local9.aBoolean177, arg6, arg0);
			}
		} else if (arg3 == 1) {
			if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
				local201 = local9.method3190(arg6, local129, local161, 1, local120, local13);
			} else {
				local201 = new Class4_Sub1_Sub1_Sub2(arg7, 1, arg6, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
			}
			Static1.method5(arg5, arg0, arg4, local120, local201, null, Static96.anIntArray230[arg6], 0, local146);
			if (local9.anInt4156 != 0) {
				arg2.method1991(arg3, arg4, local9.aBoolean177, arg6, arg0);
			}
		} else {
			@Pc(516) int local516;
			if (arg3 == 2) {
				local516 = arg6 + 1 & 0x3;
				@Pc(545) Class4_Sub1_Sub1 local545;
				@Pc(535) Class4_Sub1_Sub1 local535;
				if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
					local535 = local9.method3190(arg6 + 4, local129, local161, 2, local120, local13);
					local545 = local9.method3190(local516, local129, local161, 2, local120, local13);
				} else {
					local535 = new Class4_Sub1_Sub1_Sub2(arg7, 2, arg6 + 4, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
					local545 = new Class4_Sub1_Sub1_Sub2(arg7, 2, local516, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
				}
				Static1.method5(arg5, arg0, arg4, local120, local535, local545, Static38.anIntArray89[arg6], Static38.anIntArray89[local516], local146);
				if (local9.anInt4156 != 0) {
					arg2.method1991(arg3, arg4, local9.aBoolean177, arg6, arg0);
				}
			} else if (arg3 == 3) {
				if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
					local201 = local9.method3190(arg6, local129, local161, 3, local120, local13);
				} else {
					local201 = new Class4_Sub1_Sub1_Sub2(arg7, 3, arg6, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
				}
				Static1.method5(arg5, arg0, arg4, local120, local201, null, Static96.anIntArray230[arg6], 0, local146);
				if (local9.anInt4156 != 0) {
					arg2.method1991(arg3, arg4, local9.aBoolean177, arg6, arg0);
				}
			} else if (arg3 == 9) {
				if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
					local201 = local9.method3190(arg6, local129, local161, arg3, local120, local13);
				} else {
					local201 = new Class4_Sub1_Sub1_Sub2(arg7, arg3, arg6, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
				}
				Static102.method1955(arg5, arg0, arg4, local120, 1, 1, local201, 0, local146);
				if (local9.anInt4156 != 0) {
					arg2.method1990(local9.aBoolean177, arg0, local29, local26, arg4);
				}
			} else if (arg3 == 4) {
				if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
					local201 = local9.method3190(arg6, local129, local161, 4, local120, local13);
				} else {
					local201 = new Class4_Sub1_Sub1_Sub2(arg7, 4, arg6, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
				}
				Static53.method1029(arg5, arg0, arg4, local120, local201, null, Static38.anIntArray89[arg6], 0, 0, 0, local146);
			} else {
				@Pc(800) long local800;
				@Pc(833) Class4_Sub1_Sub1 local833;
				if (arg3 == 5) {
					local516 = 16;
					local800 = Static111.method2060(arg5, arg0, arg4);
					if (local800 != 0L) {
						local516 = Static113.method2090((int) (local800 >>> 32) & Integer.MAX_VALUE).anInt4168;
					}
					if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
						local833 = local9.method3190(arg6, local129, local161, 4, local120, local13);
					} else {
						local833 = new Class4_Sub1_Sub1_Sub2(arg7, 4, arg6, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
					}
					Static53.method1029(arg5, arg0, arg4, local120, local833, null, Static38.anIntArray89[arg6], 0, local516 * Static69.anIntArray172[arg6], local516 * Static110.anIntArray251[arg6], local146);
				} else if (arg3 == 6) {
					local800 = Static111.method2060(arg5, arg0, arg4);
					local516 = 8;
					if (local800 != 0L) {
						local516 = Static113.method2090((int) (local800 >>> 32) & Integer.MAX_VALUE).anInt4168 / 2;
					}
					if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
						local833 = local9.method3190(arg6 + 4, local129, local161, 4, local120, local13);
					} else {
						local833 = new Class4_Sub1_Sub1_Sub2(arg7, 4, arg6 + 4, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
					}
					Static53.method1029(arg5, arg0, arg4, local120, local833, null, 256, arg6, local516 * Static8.anIntArray28[arg6], Static100.anIntArray237[arg6] * local516, local146);
				} else if (arg3 == 7) {
					@Pc(983) int local983 = arg6 + 2 & 0x3;
					if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
						local201 = local9.method3190(local983 + 4, local129, local161, 4, local120, local13);
					} else {
						local201 = new Class4_Sub1_Sub1_Sub2(arg7, 4, local983 + 4, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
					}
					Static53.method1029(arg5, arg0, arg4, local120, local201, null, 256, local983, 0, 0, local146);
				} else if (arg3 == 8) {
					local516 = 8;
					local800 = Static111.method2060(arg5, arg0, arg4);
					if (local800 != 0L) {
						local516 = Static113.method2090((int) (local800 >>> 32) & Integer.MAX_VALUE).anInt4168 / 2;
					}
					@Pc(1067) int local1067 = arg6 + 2 & 0x3;
					@Pc(1098) Class4_Sub1_Sub1 local1098;
					if (local9.anInt4185 == -1 && local9.anIntArray442 == null) {
						local833 = local9.method3190(arg6 + 4, local129, local161, 4, local120, local13);
						local1098 = local9.method3190(local1067 + 4, local129, local161, 4, local120, local13);
					} else {
						local833 = new Class4_Sub1_Sub1_Sub2(arg7, 4, arg6 + 4, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
						local1098 = new Class4_Sub1_Sub1_Sub2(arg7, 4, local1067 + 4, arg1, arg0, arg4, local9.anInt4185, local9.aBoolean178, null);
					}
					Static53.method1029(arg5, arg0, arg4, local120, local833, local1098, 256, arg6, Static8.anIntArray28[arg6] * local516, local516 * Static100.anIntArray237[arg6], local146);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ba", name = "b", descriptor = "(II)V")
	public static void method213() {
		Static140.aClass62_35 = null;
		Static134.anInt3187 = -1;
		Static99.anInt2522 = 0;
		Static30.anInt765 = 2;
		Static135.aBoolean135 = false;
		Static135.anInt3221 = -1;
		Static71.anInt1861 = 1;
	}

	@OriginalMember(owner = "client!ba", name = "c", descriptor = "(II)I")
	public static int method214(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}
}
