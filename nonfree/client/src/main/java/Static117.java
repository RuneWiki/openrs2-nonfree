import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static117 {

	@OriginalMember(owner = "client!m", name = "M", descriptor = "[I")
	public static final int[] anIntArray207 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!m", name = "P", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_777 = Static81.method1507("Sie haben gerade eine andere Welt verlassen)3");

	@OriginalMember(owner = "client!m", name = "Q", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_778 = Static81.method1507("::gc");

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "[I")
	public static final int[] anIntArray209 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!wd;III)V")
	public static void method2006(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class1_Sub8 local12;
		if (arg2 < Static60.anInt3602) {
			local12 = Static29.aClass1_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3];
			if (local12 != null && local12.aClass96_1 != null && local12.aClass96_1.aClass5_11.method3166()) {
				arg0.method3165(local12.aClass96_1.aClass5_11, 128, 0, 0, true);
			}
		}
		if (arg3 < Static60.anInt3602) {
			local12 = Static29.aClass1_Sub8ArrayArrayArray1[arg1][arg2][arg3 + 1];
			if (local12 != null && local12.aClass96_1 != null && local12.aClass96_1.aClass5_11.method3166()) {
				arg0.method3165(local12.aClass96_1.aClass5_11, 0, 0, 128, true);
			}
		}
		if (arg2 < Static60.anInt3602 && arg3 < Static18.anInt3874) {
			local12 = Static29.aClass1_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3 + 1];
			if (local12 != null && local12.aClass96_1 != null && local12.aClass96_1.aClass5_11.method3166()) {
				arg0.method3165(local12.aClass96_1.aClass5_11, 128, 0, 128, true);
			}
		}
		if (arg2 < Static60.anInt3602 && arg3 > 0) {
			local12 = Static29.aClass1_Sub8ArrayArrayArray1[arg1][arg2 + 1][arg3 - 1];
			if (local12 != null && local12.aClass96_1 != null && local12.aClass96_1.aClass5_11.method3166()) {
				arg0.method3165(local12.aClass96_1.aClass5_11, 128, 0, -128, true);
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V")
	public static void method2008(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg0;
		@Pc(24) int local24 = arg1 - arg4;
		if (local24 == 0) {
			if (local10 != 0) {
				Static5.method106(arg4, arg3, arg0, arg2);
			}
		} else if (local10 == 0) {
			Static110.method1907(arg0, arg1, arg4, arg3);
		} else {
			if (local10 < 0) {
				local10 = -local10;
			}
			if (local24 < 0) {
				local24 = -local24;
			}
			@Pc(69) boolean local69 = local10 > local24;
			@Pc(73) int local73;
			@Pc(75) int local75;
			if (local69) {
				local73 = arg4;
				local75 = arg1;
				arg1 = arg2;
				arg4 = arg0;
				arg2 = local75;
				arg0 = local73;
			}
			if (arg1 < arg4) {
				local73 = arg4;
				local75 = arg0;
				arg4 = arg1;
				arg0 = arg2;
				arg2 = local75;
				arg1 = local73;
			}
			local73 = arg0;
			local75 = arg1 - arg4;
			@Pc(110) int local110 = -(local75 >> 1);
			@Pc(115) int local115 = arg2 - arg0;
			if (local115 < 0) {
				local115 = -local115;
			}
			@Pc(131) int local131 = arg0 >= arg2 ? -1 : 1;
			@Pc(135) int local135;
			if (local69) {
				for (local135 = arg4; local135 <= arg1; local135++) {
					Static98.anIntArrayArray16[local135][local73] = arg3;
					local110 += local115;
					if (local110 > 0) {
						local110 -= local75;
						local73 += local131;
					}
				}
			} else {
				for (local135 = arg4; local135 <= arg1; local135++) {
					local110 += local115;
					Static98.anIntArrayArray16[local73][local135] = arg3;
					if (local110 > 0) {
						local110 -= local75;
						local73 += local131;
					}
				}
			}
		}
	}
}
