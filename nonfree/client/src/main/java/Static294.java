import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!sn", name = "k", descriptor = "I")
	public static int anInt3990;

	@OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
	public static int anInt3998;

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "I")
	public static int anInt3994 = 0;

	@OriginalMember(owner = "client!sn", name = "p", descriptor = "I")
	public static int anInt3995 = 0;

	@OriginalMember(owner = "client!sn", name = "v", descriptor = "Z")
	public static boolean aBoolean330 = false;

	@OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
	public static int anInt4001 = 0;

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IIIBII)V")
	public static void method3380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(11) int local11 = (arg3 - 32) * arg3 / arg2;
		if (local11 < 8) {
			local11 = 8;
		}
		Static54.aClass60Array3[0].method5675(arg4, arg0);
		@Pc(38) int local38 = (arg3 - local11 - 32) * arg1 / (arg2 - arg3);
		Static54.aClass60Array3[1].method5675(arg4, arg0 + arg3 - 16);
		Static164.aClass92_7.method4502(arg0 + 16, 16, arg4, arg3 - 32, Static195.anInt4211);
		Static164.aClass92_7.method4502(local38 + arg0 + 16, 16, arg4, local11, Static52.anInt1182);
		Static164.aClass92_7.method4509(arg0 + local38 + 16, Static342.anInt6701, local11, arg4);
		Static164.aClass92_7.method4509(local38 + arg0 + 16, Static342.anInt6701, local11, arg4 + 1);
		Static164.aClass92_7.method4481(local38 + arg0 + 16, Static342.anInt6701, 16, arg4);
		Static164.aClass92_7.method4481(local38 + arg0 + 17, Static342.anInt6701, 16, arg4);
		Static164.aClass92_7.method4509(local38 + arg0 + 16, Static239.anInt6167, local11, arg4 + 15);
		Static164.aClass92_7.method4509(arg0 + local38 + 17, Static239.anInt6167, local11 - 1, arg4 - -14);
		Static164.aClass92_7.method4481(local11 + arg0 + local38 + 15, Static239.anInt6167, 16, arg4);
		Static164.aClass92_7.method4481(arg0 + local38 + local11 + 14, Static239.anInt6167, 15, arg4 + 1);
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(IB)I")
	public static int method3381(@OriginalArg(0) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "([[II)V")
	public static void method3382(@OriginalArg(0) int[][] arg0) {
		Static30.anIntArrayArray10 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "d", descriptor = "(I)V")
	public static void method3383() {
		if (Static36.aClass39_1 != null) {
			Static36.aClass39_1.method4807();
		}
		if (Static320.aClass39_2 != null) {
			Static320.aClass39_2.method4807();
		}
	}
}
