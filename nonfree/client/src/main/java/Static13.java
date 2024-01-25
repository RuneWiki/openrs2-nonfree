import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
	public static int anInt229;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "[I")
	public static final int[] anIntArray22 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };

	@OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
	public static int anInt232 = 0;

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIII)V")
	public static void method225(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(15) int local15 = arg3 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static225.method3953(arg2, arg4, arg1, arg0);
			}
		} else if (local10 == 0) {
			Static270.method4577(arg4, arg0, arg3, arg1);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(67) boolean local67 = local15 < local10;
			@Pc(71) int local71;
			@Pc(75) int local75;
			if (local67) {
				local71 = arg1;
				arg1 = arg0;
				local75 = arg3;
				arg0 = local71;
				arg3 = arg2;
				arg2 = local75;
			}
			if (arg3 < arg1) {
				local71 = arg1;
				local75 = arg0;
				arg1 = arg3;
				arg0 = arg2;
				arg3 = local71;
				arg2 = local75;
			}
			local71 = arg0;
			local75 = arg3 - arg1;
			@Pc(112) int local112 = arg2 - arg0;
			@Pc(117) int local117 = -(local75 >> 1);
			@Pc(128) int local128 = arg0 >= arg2 ? -1 : 1;
			if (local112 < 0) {
				local112 = -local112;
			}
			@Pc(140) int local140;
			if (local67) {
				for (local140 = arg1; local140 <= arg3; local140++) {
					Static11.anIntArrayArray11[local140][local71] = arg4;
					local117 += local112;
					if (local117 > 0) {
						local71 += local128;
						local117 -= local75;
					}
				}
			} else {
				for (local140 = arg1; local140 <= arg3; local140++) {
					Static11.anIntArrayArray11[local71][local140] = arg4;
					local117 += local112;
					if (local117 > 0) {
						local71 += local128;
						local117 -= local75;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIZII)V")
	public static void method227(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static31.method490(arg0)) {
			Static329.method5492(arg2, arg3, -1, arg1, Static81.aClass132ArrayArray1[arg0]);
		}
	}
}
