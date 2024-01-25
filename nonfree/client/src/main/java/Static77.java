import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static77 {

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "[I")
	public static int[] anIntArray142;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "D")
	public static double aDouble1 = -1.0D;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIIIII)Lclient!pv;")
	public static Class78 method1345(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(33) long local33 = (long) arg5 * 986053L ^ (long) arg4 * 475427L ^ (long) arg3 * 67481L ^ (long) arg2 * 97549L ^ (long) arg1 * 32147369L ^ (long) arg0 * 76724863L;
		@Pc(39) Class78 local39 = (Class78) Static320.aClass83_45.method1658(local33);
		if (local39 == null) {
			local39 = Static269.aClass109_9.method4695(arg3, arg2, arg4, arg5, arg1, arg0);
			Static320.aClass83_45.method1675(local33, local39);
			return local39;
		} else {
			return local39;
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public static int method1346(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return -1;
		}
		for (@Pc(11) int local11 = 0; local11 < Static193.anInt1026; local11++) {
			if (arg0.equalsIgnoreCase(Static397.aStringArray53[local11])) {
				return local11;
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZIIIB)V")
	public static void method1347(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static130.method1891(arg3)) {
			Static163.method2624(arg2, Static448.aClass219ArrayArray2[arg3], -1, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IBIF[FIIIFIIIF)V")
	public static void method1349(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) float arg7, @OriginalArg(9) int arg8, @OriginalArg(10) int arg9, @OriginalArg(11) int arg10, @OriginalArg(12) float arg11) {
		@Pc(5) int local5 = arg4 - arg1;
		@Pc(14) int local14 = arg9 - arg6;
		@Pc(22) int local22 = arg5 - arg0;
		@Pc(43) float local43 = arg3[1] * (float) local14 + (float) local22 * arg3[0] + (float) local5 * arg3[2];
		@Pc(64) float local64 = arg3[3] * (float) local22 + (float) local14 * arg3[4] + arg3[5] * (float) local5;
		@Pc(85) float local85 = arg3[8] * (float) local5 + (float) local14 * arg3[7] + (float) local22 * arg3[6];
		@Pc(96) float local96;
		@Pc(103) float local103;
		if (arg10 == 0) {
			local96 = arg2 + local43 + 0.5F;
			local103 = arg7 + 0.5F - local85;
		} else if (arg10 == 1) {
			local96 = arg2 + local43 + 0.5F;
			local103 = arg7 + local85 + 0.5F;
		} else if (arg10 == 2) {
			local103 = arg11 + 0.5F - local64;
			local96 = arg2 + 0.5F - local43;
		} else if (arg10 == 3) {
			local96 = local43 + arg2 + 0.5F;
			local103 = arg11 + 0.5F - local64;
		} else if (arg10 == 4) {
			local103 = arg11 + 0.5F - local64;
			local96 = arg7 + local85 + 0.5F;
		} else {
			local96 = arg7 + 0.5F - local85;
			local103 = arg11 + 0.5F - local64;
		}
		@Pc(204) float local204;
		if (arg8 == 1) {
			local204 = local96;
			local96 = -local103;
			local103 = local204;
		} else if (arg8 == 2) {
			local103 = -local103;
			local96 = -local96;
		} else if (arg8 == 3) {
			local204 = local96;
			local96 = local103;
			local103 = -local204;
		}
		Static424.aFloat93 = local103;
		Static45.aFloat24 = local96;
	}
}
