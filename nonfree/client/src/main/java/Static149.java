import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!fea", name = "h", descriptor = "Lclient!hl;")
	public static final Class156 aClass156_48 = new Class156(124, -2);

	@OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
	public static int anInt2925 = 0;

	@OriginalMember(owner = "client!fea", name = "g", descriptor = "[[I")
	public static final int[][] anIntArrayArray21 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

	@OriginalMember(owner = "client!fea", name = "d", descriptor = "Z")
	public static boolean aBoolean219 = true;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIIZ)V")
	public static void method2750(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(10) int local10 = arg0 - arg1;
		@Pc(15) int local15 = arg2 - arg3;
		if (local15 == 0) {
			if (local10 != 0) {
				Static135.method1998(arg3, arg4, arg1, arg0);
			}
		} else if (local10 == 0) {
			Static590.method8143(arg2, arg3, arg1, arg4);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local15 < 0) {
				local15 = -local15;
			}
			@Pc(74) boolean local74 = local10 > local15;
			@Pc(78) int local78;
			@Pc(80) int local80;
			if (local74) {
				local78 = arg3;
				local80 = arg2;
				arg3 = arg1;
				arg1 = local78;
				arg2 = arg0;
				arg0 = local80;
			}
			if (arg3 > arg2) {
				local78 = arg3;
				arg3 = arg2;
				local80 = arg1;
				arg1 = arg0;
				arg2 = local78;
				arg0 = local80;
			}
			local78 = arg1;
			local80 = arg2 - arg3;
			@Pc(115) int local115 = arg0 - arg1;
			@Pc(127) int local127 = -(local80 >> 1);
			@Pc(135) int local135 = arg1 < arg0 ? 1 : -1;
			if (local115 < 0) {
				local115 = -local115;
			}
			@Pc(144) int local144;
			if (local74) {
				for (local144 = arg3; local144 <= arg2; local144++) {
					Static120.anIntArrayArray18[local144][local78] = arg4;
					local127 += local115;
					if (local127 > 0) {
						local78 += local135;
						local127 -= local80;
					}
				}
			} else {
				for (local144 = arg3; local144 <= arg2; local144++) {
					local127 += local115;
					Static120.anIntArrayArray18[local78][local144] = arg4;
					if (local127 > 0) {
						local78 += local135;
						local127 -= local80;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)V")
	public static void method2753() {
		Static11.aClass168_2.method3862();
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIB)V")
	public static void method2757(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static214.method8571(arg0, arg1);
	}
}
