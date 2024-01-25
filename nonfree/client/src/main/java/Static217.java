import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static217 {

	@OriginalMember(owner = "client!ida", name = "i", descriptor = "[Lclient!sw;")
	public static Class311[] aClass311Array1;

	@OriginalMember(owner = "client!ida", name = "k", descriptor = "I")
	public static int anInt4149;

	@OriginalMember(owner = "client!ida", name = "m", descriptor = "I")
	public static int anInt4150;

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "Lclient!wp;")
	public static final Class363 aClass363_110 = new Class363(18, 4);

	@OriginalMember(owner = "client!ida", name = "h", descriptor = "[I")
	public static final int[] anIntArray260 = new int[] { 104, 120, 136, 168 };

	@OriginalMember(owner = "client!ida", name = "l", descriptor = "Lclient!il;")
	public static Class162 aClass162_20 = new Class162(8);

	@OriginalMember(owner = "client!ida", name = "n", descriptor = "[I")
	public static final int[] anIntArray261 = new int[32];

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIIZII)V")
	public static void method3480(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(9) int local9 = arg0 - arg2;
		@Pc(14) int local14 = arg1 - arg4;
		if (local14 == 0) {
			if (local9 != 0) {
				Static339.method2372(arg3, arg0, arg4, arg2);
			}
		} else if (local9 == 0) {
			Static359.method5310(arg2, arg1, arg3, arg4);
		} else {
			if (local9 < 0) {
				local9 = -local9;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(61) boolean local61 = local9 > local14;
			@Pc(65) int local65;
			@Pc(69) int local69;
			if (local61) {
				local65 = arg4;
				arg4 = arg2;
				local69 = arg1;
				arg2 = local65;
				arg1 = arg0;
				arg0 = local69;
			}
			if (arg4 > arg1) {
				local65 = arg4;
				local69 = arg2;
				arg4 = arg1;
				arg2 = arg0;
				arg1 = local65;
				arg0 = local69;
			}
			local65 = arg2;
			local69 = arg1 - arg4;
			@Pc(106) int local106 = arg0 - arg2;
			@Pc(111) int local111 = -(local69 >> 1);
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(126) int local126 = arg2 < arg0 ? 1 : -1;
			@Pc(130) int local130;
			if (local61) {
				for (local130 = arg4; local130 <= arg1; local130++) {
					Static582.anIntArrayArray69[local130][local65] = arg3;
					local111 += local106;
					if (local111 > 0) {
						local111 -= local69;
						local65 += local126;
					}
				}
			} else {
				for (local130 = arg4; local130 <= arg1; local130++) {
					Static582.anIntArrayArray69[local65][local130] = arg3;
					local111 += local106;
					if (local111 > 0) {
						local111 -= local69;
						local65 += local126;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ida", name = "b", descriptor = "(Z)V")
	public static void method3482() {
		Static312.aClass100_7.pa(Static534.anInt8750, Static72.aClass2_Sub12_Sub1_1.aBoolean153 ? Static428.anInt7334 + 256 << 2 : -1, 0);
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(BI)V")
	public static void method3483(@OriginalArg(1) int arg0) {
		@Pc(16) Class2_Sub3_Sub13 local16 = Static382.method5650(1, arg0);
		local16.method6095();
	}

	@OriginalMember(owner = "client!ida", name = "a", descriptor = "(IIB)Lclient!kp;")
	public static Class196 method3485(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class196 local7 = Static117.method1748(arg0);
		if (arg1 == -1) {
			return local7;
		} else if (local7 == null || local7.aClass196Array2 == null || arg1 >= local7.aClass196Array2.length) {
			return null;
		} else {
			return local7.aClass196Array2[arg1];
		}
	}
}
