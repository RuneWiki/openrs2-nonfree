import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!rp", name = "j", descriptor = "[Lclient!g;")
	public static final Class83[] aClass83Array2 = new Class83[8];

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIBII)I")
	public static int method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24 = 65536 - Class183.anIntArray434[arg2 * 8192 / arg3] >> 1;
		return (local24 * arg0 >> 16) + (arg1 * (65536 - local24) >> 16);
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(Lclient!cg;IIII)V")
	public static void method5924(@OriginalArg(0) Class37 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		if (arg1 == 1 && arg3 > 0) {
			Static238.method3601(arg0, arg2, arg3 - 1, arg4);
		} else if (arg1 == 4 && arg3 <= Static132.anInt2639) {
			Static238.method3601(arg0, arg2, arg3 + 1, arg4);
		} else if (arg1 == 8 && arg4 > 0) {
			Static238.method3601(arg0, arg2, arg3, arg4 - 1);
		} else if (arg1 == 2 && arg4 <= Static87.anInt1875) {
			Static238.method3601(arg0, arg2, arg3, arg4 + 1);
		} else if (arg1 == 16 && arg3 > 0 && arg4 <= Static87.anInt1875) {
			Static238.method3601(arg0, arg2, arg3 - 1, arg4 + 1);
		} else if (arg1 == 32 && arg3 <= Static132.anInt2639 && arg4 <= Static87.anInt1875) {
			Static238.method3601(arg0, arg2, arg3 + 1, arg4 + 1);
		} else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
			Static238.method3601(arg0, arg2, arg3 - 1, arg4 - 1);
		} else if (arg1 == 64 && arg3 <= Static132.anInt2639 && arg4 > 0) {
			Static238.method3601(arg0, arg2, arg3 + 1, arg4 - 1);
		} else {
			throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
		}
	}

	@OriginalMember(owner = "client!rp", name = "a", descriptor = "(IIIIB)V")
	public static void method5925(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(13) int local13 = arg2;
		@Pc(16) int local16 = -arg2;
		@Pc(18) int local18 = -1;
		@Pc(26) int local26 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg1 + arg2);
		@Pc(35) int local35 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg1 - arg2);
		Static59.method1261(Static163.anIntArrayArray35[arg0], local26, local35, arg3);
		while (local7 < local13) {
			local18 += 2;
			local16 += local18;
			@Pc(67) int local67;
			@Pc(71) int local71;
			@Pc(85) int local85;
			@Pc(94) int local94;
			if (local16 > 0) {
				local13--;
				local16 -= local13 << 1;
				local67 = arg0 - local13;
				local71 = arg0 + local13;
				if (Static108.anInt2276 <= local71 && local67 <= Static173.anInt3208) {
					local85 = Static87.method1619(Static125.anInt2545, Static28.anInt644, local7 + arg1);
					local94 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg1 - local7);
					if (local71 <= Static173.anInt3208) {
						Static59.method1261(Static163.anIntArrayArray35[local71], local85, local94, arg3);
					}
					if (local67 >= Static108.anInt2276) {
						Static59.method1261(Static163.anIntArrayArray35[local67], local85, local94, arg3);
					}
				}
			}
			local7++;
			local67 = arg0 - local7;
			local71 = local7 + arg0;
			if (local71 >= Static108.anInt2276 && local67 <= Static173.anInt3208) {
				local85 = Static87.method1619(Static125.anInt2545, Static28.anInt644, local13 + arg1);
				local94 = Static87.method1619(Static125.anInt2545, Static28.anInt644, arg1 - local13);
				if (Static173.anInt3208 >= local71) {
					Static59.method1261(Static163.anIntArrayArray35[local71], local85, local94, arg3);
				}
				if (Static108.anInt2276 <= local67) {
					Static59.method1261(Static163.anIntArrayArray35[local67], local85, local94, arg3);
				}
			}
		}
	}
}
