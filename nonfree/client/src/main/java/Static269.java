import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static269 {

	@OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
	public static int anInt4756 = -1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIIIIII)V")
	public static void method4024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		if (arg6 < 0 || arg4 < 0 || arg6 >= Static18.anInt5706 - 1 || Static80.anInt1367 - 1 <= arg4) {
			return;
		}
		if (Static113.aClass133ArrayArrayArray1 == null) {
			return;
		}
		@Pc(38) Interface22 local38;
		if (arg0 == 0) {
			local38 = (Interface22) Static556.method7726(arg2, arg6, arg4);
			@Pc(44) Interface22 local44 = (Interface22) Static127.method1957(arg2, arg6, arg4);
			if (local38 != null && arg1 != 2) {
				if (local38 instanceof Class15_Sub1_Sub3) {
					((Class15_Sub1_Sub3) local38).aClass286_2.method6449(arg5);
				} else {
					Static349.method5297(arg5, local38.method7171(), arg2, arg4, arg1, arg3, arg0, arg6);
				}
			}
			if (local44 != null) {
				if (local44 instanceof Class15_Sub1_Sub3) {
					((Class15_Sub1_Sub3) local44).aClass286_2.method6449(arg5);
					return;
				}
				Static349.method5297(arg5, local44.method7171(), arg2, arg4, arg1, arg3, arg0, arg6);
				return;
			}
			return;
		}
		if (arg0 == 1) {
			local38 = (Interface22) Static533.method7261(arg2, arg6, arg4);
			if (local38 != null) {
				if (!(local38 instanceof Class15_Sub4_Sub2)) {
					@Pc(115) int local115 = local38.method7171();
					if (arg1 != 4 && arg1 != 5) {
						if (arg1 == 6) {
							Static349.method5297(arg5, local115, arg2, arg4, 4, arg3 + 4, arg0, arg6);
							return;
						}
						if (arg1 == 7) {
							Static349.method5297(arg5, local115, arg2, arg4, 4, (arg3 + 2 & 0x3) + 4, arg0, arg6);
						} else if (arg1 == 8) {
							Static349.method5297(arg5, local115, arg2, arg4, 4, arg3 + 4, arg0, arg6);
							Static349.method5297(arg5, local115, arg2, arg4, 4, (arg3 + 2 & 0x3) + 4, arg0, arg6);
							return;
						}
						return;
					}
					Static349.method5297(arg5, local115, arg2, arg4, 4, arg3, arg0, arg6);
					return;
				}
				((Class15_Sub4_Sub2) local38).aClass286_3.method6449(arg5);
				return;
			}
			return;
		}
		if (arg0 == 2) {
			local38 = (Interface22) Static406.method5850(arg2, arg6, arg4, uq.class);
			if (local38 != null) {
				if (arg1 == 11) {
					arg1 = 10;
				}
				if (!(local38 instanceof Class15_Sub2_Sub3)) {
					Static349.method5297(arg5, local38.method7171(), arg2, arg4, arg1, arg3, arg0, arg6);
					return;
				}
				((Class15_Sub2_Sub3) local38).aClass286_1.method6449(arg5);
				return;
			}
			return;
		}
		if (arg0 != 3) {
			return;
		}
		local38 = (Interface22) Static361.method5373(arg2, arg6, arg4);
		if (local38 == null) {
			return;
		}
		if (!(local38 instanceof Class15_Sub3_Sub3)) {
			Static349.method5297(arg5, local38.method7171(), arg2, arg4, arg1, arg3, arg0, arg6);
			return;
		}
		((Class15_Sub3_Sub3) local38).aClass286_4.method6449(arg5);
		return;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(IIZIIII)V")
	public static void method4025(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(11) int local11 = Static502.method6952(Static52.anInt1226, arg4, Static133.anInt2531);
		@Pc(17) int local17 = Static502.method6952(Static52.anInt1226, arg1, Static133.anInt2531);
		@Pc(23) int local23 = Static502.method6952(Static205.anInt3906, arg5, Static529.anInt9806);
		@Pc(29) int local29 = Static502.method6952(Static205.anInt3906, arg2, Static529.anInt9806);
		@Pc(37) int local37 = Static502.method6952(Static52.anInt1226, arg0 + arg4, Static133.anInt2531);
		@Pc(46) int local46 = Static502.method6952(Static52.anInt1226, arg1 - arg0, Static133.anInt2531);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static264.method4006(local29, arg3, local23, Static155.anIntArrayArray32[local48]);
		}
		for (@Pc(64) int local64 = local17; local64 > local46; local64--) {
			Static264.method4006(local29, arg3, local23, Static155.anIntArrayArray32[local64]);
		}
		@Pc(87) int local87 = Static502.method6952(Static205.anInt3906, arg5 + arg0, Static529.anInt9806);
		@Pc(96) int local96 = Static502.method6952(Static205.anInt3906, arg2 - arg0, Static529.anInt9806);
		for (@Pc(103) int local103 = local37; local103 <= local46; local103++) {
			@Pc(109) int[] local109 = Static155.anIntArrayArray32[local103];
			Static264.method4006(local87, arg3, local23, local109);
			Static264.method4006(local29, arg3, local96, local109);
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V")
	public static void method4026() {
		if (!Static540.aBoolean580) {
			return;
		}
		@Pc(11) Class97 local11 = Static76.method1088(Static152.anInt1934, Static96.anInt7891);
		if (local11 != null && local11.anObjectArray6 != null) {
			@Pc(20) Class6_Sub1 local20 = new Class6_Sub1();
			local20.anObjectArray1 = local11.anObjectArray6;
			local20.aClass97_2 = local11;
			Static199.method3316(local20);
		}
		Static208.anInt3948 = -1;
		Static427.anInt7590 = -1;
		Static540.aBoolean580 = false;
		if (local11 != null) {
			Static479.method6666(local11);
		}
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V")
	public static void method4027() {
		for (@Pc(22) Class6_Sub44 local22 = (Class6_Sub44) Static24.aClass298_14.method6809(); local22 != null; local22 = (Class6_Sub44) Static24.aClass298_14.method6821()) {
			if (local22.anInt8221 > 0) {
				local22.anInt8221--;
			}
			if (local22.anInt8221 != 0) {
				if (local22.anInt8231 > 0) {
					local22.anInt8231--;
				}
				if (local22.anInt8231 == 0 && local22.anInt8222 >= 1 && local22.anInt8228 >= 1 && local22.anInt8222 <= Static18.anInt5706 - 2 && Static80.anInt1367 - 2 >= local22.anInt8228 && (local22.anInt8232 < 0 || Static95.method1411(local22.anInt8232, local22.anInt8223))) {
					Static349.method5297(-1, local22.anInt8232, local22.anInt8227, local22.anInt8228, local22.anInt8223, local22.anInt8225, local22.anInt8230, local22.anInt8222);
					local22.anInt8231 = -1;
					if (local22.anInt8226 == local22.anInt8232 && local22.anInt8226 == -1) {
						local22.method7948();
					} else if (local22.anInt8226 == local22.anInt8232 && local22.anInt8225 == local22.anInt8224 && local22.anInt8223 == local22.anInt8233) {
						local22.method7948();
					}
				}
			} else if (local22.anInt8226 < 0 || Static95.method1411(local22.anInt8226, local22.anInt8233)) {
				Static349.method5297(-1, local22.anInt8226, local22.anInt8227, local22.anInt8228, local22.anInt8233, local22.anInt8224, local22.anInt8230, local22.anInt8222);
				local22.method7948();
			}
		}
	}
}
