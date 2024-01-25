import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static194 {

	@OriginalMember(owner = "client!mf", name = "gb", descriptor = "Z")
	public static boolean aBoolean299;

	@OriginalMember(owner = "client!mf", name = "A", descriptor = "Z")
	public static boolean aBoolean297 = false;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(I)V")
	public static void method3442() {
		Static308.anInt6006 = 0;
		Static325.anInt6278 = 0;
		Static299.anInt6792 = 0;
		Static183.anInt3674 = 0;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIBIII)V")
	public static void method3446(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2 < 0 || arg5 < 0 || arg2 >= Static22.anInt481 - 1 || arg5 >= Static269.anInt5281 - 1) {
			return;
		}
		if (Static178.aClass174ArrayArrayArray3 == null) {
			return;
		}
		@Pc(42) Interface5 local42;
		if (arg3 == 0) {
			local42 = (Interface5) Static330.method5730(arg4, arg2, arg5);
			@Pc(48) Interface5 local48 = (Interface5) Static19.method354(arg4, arg2, arg5);
			if (local42 != null && arg6 != 2) {
				if (local42 instanceof Class4_Sub3_Sub1) {
					((Class4_Sub3_Sub1) local42).aClass133_2.method3489(arg0);
				} else {
					Static170.method3100(local42.method5910(), arg2, arg1, arg3, arg5, arg4, arg6, arg0);
				}
			}
			if (local48 != null) {
				if (local48 instanceof Class4_Sub3_Sub1) {
					((Class4_Sub3_Sub1) local48).aClass133_2.method3489(arg0);
					return;
				}
				Static170.method3100(local48.method5910(), arg2, arg1, arg3, arg5, arg4, arg6, arg0);
				return;
			}
			return;
		}
		if (arg3 != 1) {
			if (arg3 == 2) {
				local42 = (Interface5) Static259.method4533(arg4, arg2, arg5, iq.class);
				if (local42 != null) {
					if (arg6 == 11) {
						arg6 = 10;
					}
					if (local42 instanceof Class4_Sub5_Sub5) {
						((Class4_Sub5_Sub5) local42).aClass133_4.method3489(arg0);
						return;
					}
					Static170.method3100(local42.method5910(), arg2, arg1, arg3, arg5, arg4, arg6, arg0);
					return;
				}
			} else if (arg3 == 3) {
				local42 = (Interface5) Static101.method1810(arg4, arg2, arg5);
				if (local42 == null) {
					return;
				}
				if (!(local42 instanceof Class4_Sub4_Sub2)) {
					Static170.method3100(local42.method5910(), arg2, arg1, arg3, arg5, arg4, arg6, arg0);
					return;
				}
				((Class4_Sub4_Sub2) local42).aClass133_3.method3489(arg0);
			} else {
				return;
			}
			return;
		}
		local42 = (Interface5) Static241.method4296(arg4, arg2, arg5);
		if (local42 == null) {
			return;
		}
		if (!(local42 instanceof Class4_Sub1_Sub1)) {
			@Pc(204) int local204 = local42.method5910();
			if (arg6 != 4 && arg6 != 5) {
				if (arg6 != 6) {
					if (arg6 == 7) {
						Static170.method3100(local204, arg2, (arg1 + 2 & 0x3) + 4, arg3, arg5, arg4, 4, arg0);
					} else if (arg6 == 8) {
						Static170.method3100(local204, arg2, arg1 + 4, arg3, arg5, arg4, 4, arg0);
						Static170.method3100(local204, arg2, (arg1 + 2 & 0x3) + 4, arg3, arg5, arg4, 4, arg0);
						return;
					}
					return;
				}
				Static170.method3100(local204, arg2, arg1 + 4, arg3, arg5, arg4, 4, arg0);
				return;
			}
			Static170.method3100(local204, arg2, arg1, arg3, arg5, arg4, 4, arg0);
			return;
		}
		((Class4_Sub1_Sub1) local42).aClass133_1.method3489(arg0);
		return;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIII)V")
	public static void method3451(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8;
		for (@Pc(5) int local5 = arg0; local5 < arg0 + arg4; local5++) {
			for (local8 = arg2; local8 < arg2 + arg3; local8++) {
				if (local8 >= 0 && local8 < Static22.anInt481 && local5 >= 0 && local5 < Static269.anInt5281) {
					Static217.anIntArrayArrayArray8[arg1][local8][local5] = arg1 <= 0 ? 0 : Static217.anIntArrayArrayArray8[arg1 - 1][local8][local5] - 240;
				}
			}
		}
		if (arg2 > 0 && arg2 < Static22.anInt481) {
			for (local8 = arg0 + 1; local8 < arg0 + arg4; local8++) {
				if (local8 >= 0 && Static269.anInt5281 > local8) {
					Static217.anIntArrayArrayArray8[arg1][arg2][local8] = Static217.anIntArrayArrayArray8[arg1][arg2 - 1][local8];
				}
			}
		}
		if (arg0 > 0 && arg0 < Static269.anInt5281) {
			for (local8 = arg2 + 1; local8 < arg2 + arg3; local8++) {
				if (local8 >= 0 && Static22.anInt481 > local8) {
					Static217.anIntArrayArrayArray8[arg1][local8][arg0] = Static217.anIntArrayArrayArray8[arg1][local8][arg0 - 1];
				}
			}
		}
		if (arg2 < 0 || arg0 < 0 || Static22.anInt481 <= arg2 || Static269.anInt5281 <= arg0) {
			return;
		}
		if (arg1 != 0) {
			if (arg2 > 0 && Static217.anIntArrayArrayArray8[arg1][arg2 - 1][arg0] != Static217.anIntArrayArrayArray8[arg1 - 1][arg2 - 1][arg0]) {
				Static217.anIntArrayArrayArray8[arg1][arg2][arg0] = Static217.anIntArrayArrayArray8[arg1][arg2 - 1][arg0];
				return;
			}
			if (arg0 > 0 && Static217.anIntArrayArrayArray8[arg1 - 1][arg2][arg0 - 1] != Static217.anIntArrayArrayArray8[arg1][arg2][arg0 - 1]) {
				Static217.anIntArrayArrayArray8[arg1][arg2][arg0] = Static217.anIntArrayArrayArray8[arg1][arg2][arg0 - 1];
				return;
			}
			if (arg2 > 0 && arg0 > 0 && Static217.anIntArrayArrayArray8[arg1][arg2 - 1][arg0 - 1] != Static217.anIntArrayArrayArray8[arg1 - 1][arg2 - 1][arg0 - 1]) {
				Static217.anIntArrayArrayArray8[arg1][arg2][arg0] = Static217.anIntArrayArrayArray8[arg1][arg2 - 1][arg0 - 1];
				return;
			}
			return;
		}
		if (arg2 > 0 && Static217.anIntArrayArrayArray8[arg1][arg2 - 1][arg0] != 0) {
			Static217.anIntArrayArrayArray8[arg1][arg2][arg0] = Static217.anIntArrayArrayArray8[arg1][arg2 - 1][arg0];
			return;
		}
		if (arg0 > 0 && Static217.anIntArrayArrayArray8[arg1][arg2][arg0 - 1] != 0) {
			Static217.anIntArrayArrayArray8[arg1][arg2][arg0] = Static217.anIntArrayArrayArray8[arg1][arg2][arg0 - 1];
			return;
		}
		if (arg2 > 0 && arg0 > 0 && Static217.anIntArrayArrayArray8[arg1][arg2 - 1][arg0 - 1] != 0) {
			Static217.anIntArrayArrayArray8[arg1][arg2][arg0] = Static217.anIntArrayArrayArray8[arg1][arg2 - 1][arg0 - 1];
			return;
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(ILclient!ea;ILclient!cc;IIII)Lclient!wn;")
	public static Class95 method3452(@OriginalArg(0) int arg0, @OriginalArg(1) Class55 arg1, @OriginalArg(3) Class31 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static338.aClass153_123.aBoolean380 = arg2 != null;
		Static338.aClass153_123.anInt4661 = arg6;
		Static338.aClass153_123.anInt4658 = arg0;
		Static338.aClass153_123.anInt4659 = arg4;
		Static338.aClass153_123.anInt4662 = arg5;
		Static338.aClass153_123.anInt4660 = arg3;
		Static338.aClass153_123.anInt4668 = arg1.anInt5811;
		return (Class95) Static311.aClass120_2.method3163(Static338.aClass153_123);
	}
}
