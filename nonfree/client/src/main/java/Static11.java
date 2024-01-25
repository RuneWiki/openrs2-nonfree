import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static11 {

	@OriginalMember(owner = "client!ag", name = "q", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "J")
	public static long aLong1 = -1L;

	@OriginalMember(owner = "client!ag", name = "t", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_1 = new Class77(42, 3);

	@OriginalMember(owner = "client!ag", name = "u", descriptor = "[I")
	public static final int[] anIntArray16 = new int[1024];

	@OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V")
	public static void method295() {
		if (Static121.aClass55_5 == null) {
			return;
		}
		if (Static121.aClass55_5.anInt1481 == 1) {
			Static121.aClass55_5 = null;
			return;
		}
		if (Static121.aClass55_5.anInt1481 == 2) {
			Static116.method2387(Static445.aClass71_4, 2, Static385.aString100);
			Static121.aClass55_5 = null;
			return;
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIII)V")
	public static void method296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg4 < 0 || Static37.anInt7512 - 1 <= arg3 || Static329.anInt6247 - 1 <= arg4) {
			return;
		}
		if (Static120.aClass37ArrayArrayArray1 == null) {
			return;
		}
		@Pc(64) Interface19 local64;
		if (arg6 != 0) {
			if (arg6 != 1) {
				if (arg6 == 2) {
					local64 = (Interface19) Static531.method7866(arg1, arg3, arg4, wf.class);
					if (local64 == null) {
						return;
					}
					if (arg0 == 11) {
						arg0 = 10;
					}
					if (local64 instanceof Class30_Sub1_Sub3) {
						((Class30_Sub1_Sub3) local64).aClass311_2.method7855(arg5);
						return;
					}
					Static252.method4354(arg0, arg1, arg3, arg4, arg6, arg2, local64.method7915(), arg5);
				} else if (arg6 == 3) {
					local64 = (Interface19) Static160.method3298(arg1, arg3, arg4);
					if (local64 != null) {
						if (!(local64 instanceof Class30_Sub3_Sub1)) {
							Static252.method4354(arg0, arg1, arg3, arg4, arg6, arg2, local64.method7915(), arg5);
							return;
						}
						((Class30_Sub3_Sub1) local64).aClass311_1.method7855(arg5);
						return;
					}
				}
				return;
			}
			local64 = (Interface19) Static533.method7882(arg1, arg3, arg4);
			if (local64 != null) {
				if (local64 instanceof Class30_Sub4_Sub2) {
					((Class30_Sub4_Sub2) local64).aClass311_3.method7855(arg5);
					return;
				}
				@Pc(155) int local155 = local64.method7915();
				if (arg0 != 4 && arg0 != 5) {
					if (arg0 == 6) {
						Static252.method4354(4, arg1, arg3, arg4, arg6, arg2 + 4, local155, arg5);
					} else if (arg0 == 7) {
						Static252.method4354(4, arg1, arg3, arg4, arg6, (arg2 + 2 & 0x3) + 4, local155, arg5);
						return;
					} else if (arg0 == 8) {
						Static252.method4354(4, arg1, arg3, arg4, arg6, arg2 + 4, local155, arg5);
						Static252.method4354(4, arg1, arg3, arg4, arg6, (arg2 + 2 & 0x3) + 4, local155, arg5);
						return;
					}
					return;
				}
				Static252.method4354(4, arg1, arg3, arg4, arg6, arg2, local155, arg5);
				return;
			}
			return;
		}
		local64 = (Interface19) Static324.method5105(arg1, arg3, arg4);
		@Pc(254) Interface19 local254 = (Interface19) Static422.method6540(arg1, arg3, arg4);
		if (local64 != null && arg0 != 2) {
			if (local64 instanceof Class30_Sub2_Sub3) {
				((Class30_Sub2_Sub3) local64).aClass311_4.method7855(arg5);
			} else {
				Static252.method4354(arg0, arg1, arg3, arg4, arg6, arg2, local64.method7915(), arg5);
			}
		}
		if (local254 == null) {
			return;
		}
		if (local254 instanceof Class30_Sub2_Sub3) {
			((Class30_Sub2_Sub3) local254).aClass311_4.method7855(arg5);
			return;
		}
		Static252.method4354(arg0, arg1, arg3, arg4, arg6, arg2, local254.method7915(), arg5);
		return;
	}
}
