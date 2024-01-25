import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static430 {

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
	public static int anInt7688;

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "Z")
	public static boolean aBoolean581 = false;

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "[I")
	public static final int[] anIntArray463 = new int[14];

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Lclient!em;")
	public static final Class83 aClass83_163 = new Class83(21, 2);

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "Lclient!lh;")
	public static final Class208 aClass208_94 = new Class208(63, 0);

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BFIFF)F")
	public static float method6138(@OriginalArg(1) float arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(7) float[] local7 = Static186.aFloatArrayArray4[arg1];
		return arg2 * local7[2] + local7[1] * arg3 + arg0 * local7[0];
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!jg;)I")
	public static int method6139(@OriginalArg(1) Class172 arg0) {
		if (arg0 == Static243.aClass172_6) {
			return 5120;
		} else if (Static243.aClass172_7 == arg0) {
			return 5122;
		} else if (arg0 == Static243.aClass172_8) {
			return 5124;
		} else if (Static243.aClass172_9 == arg0) {
			return 5121;
		} else if (Static243.aClass172_10 == arg0) {
			return 5123;
		} else if (Static243.aClass172_11 == arg0) {
			return 5125;
		} else if (arg0 == Static243.aClass172_12) {
			return 5131;
		} else if (arg0 == Static243.aClass172_13) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIIZII)V")
	public static void method6140(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 > Static71.anInt1350 || arg1 < Static120.anInt2491) {
			return;
		}
		@Pc(31) boolean local31;
		if (arg0 < Static330.anInt6025) {
			arg0 = Static330.anInt6025;
			local31 = false;
		} else if (arg0 > Static194.anInt3788) {
			arg0 = Static194.anInt3788;
			local31 = false;
		} else {
			local31 = true;
		}
		@Pc(52) boolean local52;
		if (Static330.anInt6025 > arg2) {
			arg2 = Static330.anInt6025;
			local52 = false;
		} else if (Static194.anInt3788 < arg2) {
			local52 = false;
			arg2 = Static194.anInt3788;
		} else {
			local52 = true;
		}
		if (arg4 >= Static120.anInt2491) {
			Static329.method4871(arg0, arg2, Static280.anIntArrayArray25[arg4++], arg3);
		} else {
			arg4 = Static120.anInt2491;
		}
		if (Static71.anInt1350 < arg1) {
			arg1 = Static71.anInt1350;
		} else {
			Static329.method4871(arg0, arg2, Static280.anIntArrayArray25[arg1--], arg3);
		}
		@Pc(107) int local107;
		if (local31 && local52) {
			for (local107 = arg4; local107 <= arg1; local107++) {
				@Pc(113) int[] local113 = Static280.anIntArrayArray25[local107];
				local113[arg0] = local113[arg2] = arg3;
			}
		} else if (local31) {
			for (local107 = arg4; local107 <= arg1; local107++) {
				Static280.anIntArrayArray25[local107][arg0] = arg3;
			}
		} else if (local52) {
			for (local107 = arg4; local107 <= arg1; local107++) {
				Static280.anIntArrayArray25[local107][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(BII)I")
	public static int method6142(@OriginalArg(2) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(47) int local47 = (arg0 & 0x7F) * 96 >> 7;
			if (local47 < 2) {
				local47 = 2;
			} else if (local47 > 126) {
				local47 = 126;
			}
			return (arg0 & 0xFF80) + local47;
		}
	}
}
