import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static378 {

	@OriginalMember(owner = "client!t", name = "u", descriptor = "I")
	public static int anInt6480;

	@OriginalMember(owner = "client!t", name = "v", descriptor = "Lclient!f;")
	public static Class80 aClass80_18;

	@OriginalMember(owner = "client!t", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray183 = new int[128][128];

	@OriginalMember(owner = "client!t", name = "s", descriptor = "Lclient!uf;")
	public static final Class237 aClass237_110 = new Class237(55, 0);

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(BLclient!tf;)V")
	public static void method5173(@OriginalArg(1) Class26_Sub2_Sub2_Sub1 arg0) {
		@Pc(11) Class1_Sub29 local11 = (Class1_Sub29) Static51.aClass27_9.method553((long) arg0.anInt7097);
		if (local11 == null) {
			return;
		}
		if (local11.aClass1_Sub7_Sub4_3 != null) {
			Static38.aClass1_Sub7_Sub1_1.method3979(local11.aClass1_Sub7_Sub4_3);
			local11.aClass1_Sub7_Sub4_3 = null;
		}
		local11.method6071();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(ZI)V")
	public static void method5174(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub2_Sub1 local13 = Static258.method5559(arg0, 1);
		local13.method195();
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IBI)I")
	public static int method5175(@OriginalArg(2) int arg0) {
		if (arg0 == -1) {
			return 12345678;
		}
		@Pc(21) int local21 = (arg0 & 0x7F) * 96 >> 7;
		if (local21 < 2) {
			local21 = 2;
		} else if (local21 > 126) {
			local21 = 126;
		}
		return (arg0 & 0xFF80) + local21;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IIIIIIII)V")
	public static void method5177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 < 0 || arg1 < 0 || Static135.anInt2314 - 1 <= arg4 || Static352.anInt6022 - 1 <= arg1) {
			return;
		}
		if (Static268.aClass211ArrayArrayArray4 == null) {
			return;
		}
		@Pc(48) Interface6 local48;
		if (arg6 != 0) {
			if (arg6 == 1) {
				local48 = (Interface6) Static81.method1400(arg0, arg4, arg1);
				if (local48 != null) {
					if (local48 instanceof Class26_Sub3_Sub1) {
						((Class26_Sub3_Sub1) local48).aClass72_2.method1502(arg2);
						return;
					}
					@Pc(64) int local64 = local48.method4665();
					if (arg5 != 4 && arg5 != 5) {
						if (arg5 == 6) {
							Static405.method5578(arg0, arg4, 4, local64, arg1, arg3 + 4, arg2, arg6);
							return;
						}
						if (arg5 == 7) {
							Static405.method5578(arg0, arg4, 4, local64, arg1, (arg3 + 2 & 0x3) + 4, arg2, arg6);
						} else if (arg5 == 8) {
							Static405.method5578(arg0, arg4, 4, local64, arg1, arg3 + 4, arg2, arg6);
							Static405.method5578(arg0, arg4, 4, local64, arg1, (arg3 + 2 & 0x3) + 4, arg2, arg6);
							return;
						}
						return;
					}
					Static405.method5578(arg0, arg4, 4, local64, arg1, arg3, arg2, arg6);
					return;
				}
				return;
			}
			if (arg6 != 2) {
				if (arg6 == 3) {
					local48 = (Interface6) Static366.method4342(arg0, arg4, arg1);
					if (local48 != null) {
						if (!(local48 instanceof Class26_Sub4_Sub1)) {
							Static405.method5578(arg0, arg4, arg5, local48.method4665(), arg1, arg3, arg2, arg6);
							return;
						}
						((Class26_Sub4_Sub1) local48).aClass72_3.method1502(arg2);
						return;
					}
				}
				return;
			}
			local48 = (Interface6) Static278.method5819(arg0, arg4, arg1, jv.class);
			if (local48 != null) {
				if (arg5 == 11) {
					arg5 = 10;
				}
				if (local48 instanceof Class26_Sub2_Sub1) {
					((Class26_Sub2_Sub1) local48).aClass72_4.method1502(arg2);
					return;
				}
				Static405.method5578(arg0, arg4, arg5, local48.method4665(), arg1, arg3, arg2, arg6);
				return;
			}
			return;
		}
		local48 = (Interface6) Static259.method5039(arg0, arg4, arg1);
		@Pc(248) Interface6 local248 = (Interface6) Static359.method4949(arg0, arg4, arg1);
		if (local48 != null && arg5 != 2) {
			if (local48 instanceof Class26_Sub1_Sub2) {
				((Class26_Sub1_Sub2) local48).aClass72_1.method1502(arg2);
			} else {
				Static405.method5578(arg0, arg4, arg5, local48.method4665(), arg1, arg3, arg2, arg6);
			}
		}
		if (local248 == null) {
			return;
		}
		if (local248 instanceof Class26_Sub1_Sub2) {
			((Class26_Sub1_Sub2) local248).aClass72_1.method1502(arg2);
			return;
		}
		Static405.method5578(arg0, arg4, arg5, local248.method4665(), arg1, arg3, arg2, arg6);
		return;
	}
}
