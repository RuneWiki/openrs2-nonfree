import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!s", name = "v", descriptor = "I")
	public static int anInt212 = 0;

	@OriginalMember(owner = "client!s", name = "D", descriptor = "Z")
	public static boolean aBoolean11 = true;

	@OriginalMember(owner = "client!s", name = "E", descriptor = "I")
	public static int anInt219 = 0;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IIBIIIII)V")
	public static void method162(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 < 0 || arg2 < 0 || Static24.anInt454 - 1 <= arg1 || arg2 >= Static240.anInt4832 - 1) {
			return;
		}
		if (Static212.aClass106ArrayArrayArray2 == null) {
			return;
		}
		@Pc(48) Interface7 local48;
		if (arg5 != 0) {
			if (arg5 == 1) {
				local48 = (Interface7) Static74.method1139(arg0, arg1, arg2);
				if (local48 != null) {
					if (local48 instanceof Class67_Sub1_Sub1) {
						((Class67_Sub1_Sub1) local48).aClass25_2.method309(arg4);
					} else {
						@Pc(57) int local57 = local48.method5410();
						if (arg3 == 4 || arg3 == 5) {
							Static90.method4108(arg5, arg4, arg2, arg6, local57, arg1, 4, arg0);
							return;
						}
						if (arg3 == 6) {
							Static90.method4108(arg5, arg4, arg2, arg6 + 4, local57, arg1, 4, arg0);
							return;
						}
						if (arg3 == 7) {
							Static90.method4108(arg5, arg4, arg2, (arg6 + 2 & 0x3) + 4, local57, arg1, 4, arg0);
							return;
						}
						if (arg3 == 8) {
							Static90.method4108(arg5, arg4, arg2, arg6 + 4, local57, arg1, 4, arg0);
							Static90.method4108(arg5, arg4, arg2, (arg6 + 2 & 0x3) + 4, local57, arg1, 4, arg0);
							return;
						}
					}
					return;
				}
				return;
			}
			if (arg5 == 2) {
				local48 = (Interface7) Static284.method4725(arg0, arg1, arg2, sc.class);
				if (local48 != null) {
					if (arg3 == 11) {
						arg3 = 10;
					}
					if (!(local48 instanceof Class67_Sub3_Sub1)) {
						Static90.method4108(arg5, arg4, arg2, arg6, local48.method5410(), arg1, arg3, arg0);
						return;
					}
					((Class67_Sub3_Sub1) local48).aClass25_1.method309(arg4);
					return;
				}
				return;
			}
			if (arg5 == 3) {
				local48 = (Interface7) Static136.method5506(arg0, arg1, arg2);
				if (local48 != null) {
					if (!(local48 instanceof Class67_Sub4_Sub2)) {
						Static90.method4108(arg5, arg4, arg2, arg6, local48.method5410(), arg1, arg3, arg0);
						return;
					}
					((Class67_Sub4_Sub2) local48).aClass25_4.method309(arg4);
					return;
				}
			}
			return;
		}
		local48 = (Interface7) Static3.method15(arg0, arg1, arg2);
		@Pc(248) Interface7 local248 = (Interface7) Static90.method4105(arg0, arg1, arg2);
		if (local48 != null && arg3 != 2) {
			if (local48 instanceof Class67_Sub2_Sub2) {
				((Class67_Sub2_Sub2) local48).aClass25_3.method309(arg4);
			} else {
				Static90.method4108(arg5, arg4, arg2, arg6, local48.method5410(), arg1, arg3, arg0);
			}
		}
		if (local248 == null) {
			return;
		}
		if (local248 instanceof Class67_Sub2_Sub2) {
			((Class67_Sub2_Sub2) local248).aClass25_3.method309(arg4);
			return;
		}
		Static90.method4108(arg5, arg4, arg2, arg6, local248.method5410(), arg1, arg3, arg0);
		return;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Z[B)Z")
	public static boolean method164(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class11_Sub25 local8 = new Class11_Sub25(arg0);
		@Pc(12) int local12 = local8.method5185();
		if (local12 != 1) {
			return false;
		}
		@Pc(26) boolean local26 = local8.method5185() == 1;
		if (local26) {
			Static244.method4312(local8);
		}
		Static210.method3761(local8);
		return true;
	}
}
