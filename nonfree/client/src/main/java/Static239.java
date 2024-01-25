import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static239 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "Lclient!wb;")
	public static Class263 aClass263_2;

	@OriginalMember(owner = "client!lu", name = "c", descriptor = "[I")
	public static int[] anIntArray106;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(II)I")
	public static int method1376(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static267.aByteArrayArray12 == null ? 0 : (Static267.aByteArrayArray12[arg0][arg1] & 0xFF) << 3;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V")
	public static void method1377() {
		Static46.aClass243_7 = new Class243();
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!qf;IIII)V")
	public static void method1378(@OriginalArg(0) Class34 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static454.method5983(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static405.anInt6684) {
			Static454.method5983(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static454.method5983(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static37.anInt1025) {
			Static454.method5983(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static37.anInt1025) {
			Static454.method5983(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static405.anInt6684 && arg4 <= Static37.anInt1025) {
			Static454.method5983(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static454.method5983(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static405.anInt6684 && arg4 > 0) {
			Static454.method5983(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIILclient!qa;II)Lclient!c;")
	public static Class9 method1379(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class172 arg4, @OriginalArg(5) int arg5) {
		@Pc(6) long local6 = (long) arg5;
		@Pc(12) Class9 local12 = (Class9) Static167.aClass126_20.method3141(local6);
		if (local12 == null) {
			@Pc(22) Class161 local22 = Static302.method4236(Static104.aClass32_35, arg5);
			if (local22 == null) {
				return null;
			}
			if (local22.anInt4979 < 13) {
				local22.method3832();
			}
			local12 = arg4.method5537(local22, 2055, Static2.anInt53, 64, 768);
			Static167.aClass126_20.method3132(local6, local12);
		}
		local12 = local12.method5699((byte) 2, 2055, true);
		if (arg3 != 0) {
			local12.k(arg3);
		}
		if (arg2 != 0) {
			local12.WA(arg2);
		}
		if (arg1 != 0) {
			local12.o(arg1);
		}
		if (arg0 != 0) {
			local12.ja(0, arg0, 0);
		}
		return local12;
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIZIII)I")
	public static int method1380(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(12) int local12 = arg1;
			arg1 = arg5;
			arg5 = local12;
		}
		@Pc(20) int local20 = arg3 & 0x3;
		if (local20 == 0) {
			return arg4;
		} else if (local20 == 1) {
			return 1 + 7 - arg1 - arg2;
		} else if (local20 == 2) {
			return 7 + 1 - arg4 - arg5;
		} else {
			return arg2;
		}
	}
}
