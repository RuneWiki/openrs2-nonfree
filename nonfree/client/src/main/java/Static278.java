import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static278 {

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!bt;")
	public static Class26_Sub2 method5819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class211 local7 = Static268.aClass211ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class125 local14 = local7.aClass125_3; local14 != null; local14 = local14.aClass125_1) {
			@Pc(18) Class26_Sub2 local18 = local14.aClass26_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort93 == arg1 && local18.aShort94 == arg2) {
				return local18;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(Lclient!qa;IIIIIIBI)V")
	public static void method5822(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(15) Interface6 local15 = (Interface6) Static259.method5039(arg3, arg2, arg6);
		@Pc(24) Class182 local24;
		@Pc(30) int local30;
		@Pc(34) int local34;
		@Pc(41) int local41;
		if (local15 != null) {
			local24 = Static71.aClass105_6.method2336(local15.method4665());
			local30 = local15.method4670() & 0x3;
			local34 = local15.method4666();
			if (local24.anInt5491 == -1) {
				local41 = arg1;
				if (local24.anInt5468 > 0) {
					local41 = arg4;
				}
				if (local34 == 0 || local34 == 2) {
					if (local30 == 0) {
						arg0.method4720(arg7, 4, local41, arg5);
					} else if (local30 == 1) {
						arg0.method4689(arg7, local41, arg5, 4);
					} else if (local30 == 2) {
						arg0.method4720(arg7, 4, local41, arg5 + 3);
					} else if (local30 == 3) {
						arg0.method4689(arg7 + 3, local41, arg5, 4);
					}
				}
				if (local34 == 3) {
					if (local30 == 0) {
						arg0.method4743(arg5, local41, arg7, 1, 1);
					} else if (local30 == 1) {
						arg0.method4743(arg5 + 3, local41, arg7, 1, 1);
					} else if (local30 == 2) {
						arg0.method4743(arg5 + 3, local41, arg7 + 3, 1, 1);
					} else if (local30 == 3) {
						arg0.method4743(arg5, local41, arg7 + 3, 1, 1);
					}
				}
				if (local34 == 2) {
					if (local30 == 0) {
						arg0.method4689(arg7, local41, arg5, 4);
					} else if (local30 == 1) {
						arg0.method4720(arg7, 4, local41, arg5 + 3);
					} else if (local30 == 2) {
						arg0.method4689(arg7 + 3, local41, arg5, 4);
					} else if (local30 == 3) {
						arg0.method4720(arg7, 4, local41, arg5);
					}
				}
			} else {
				Static61.method1099(arg5, local24, local30, arg0, arg7);
			}
		}
		local15 = (Interface6) method5819(arg3, arg2, arg6, jv.class);
		if (local15 != null) {
			local24 = Static71.aClass105_6.method2336(local15.method4665());
			local30 = local15.method4670() & 0x3;
			local34 = local15.method4666();
			if (local24.anInt5491 != -1) {
				Static61.method1099(arg5, local24, local30, arg0, arg7);
			} else if (local34 == 9) {
				local41 = -1118482;
				if (local24.anInt5468 > 0) {
					local41 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method4751(arg7, arg7 + 3, arg5 + 3, local41, arg5);
				} else {
					arg0.method4751(arg7 + 3, arg7, arg5 + 3, local41, arg5);
				}
			}
		}
		local15 = (Interface6) Static366.method4342(arg3, arg2, arg6);
		if (local15 == null) {
			return;
		}
		local24 = Static71.aClass105_6.method2336(local15.method4665());
		local30 = local15.method4670() & 0x3;
		if (local24.anInt5491 != -1) {
			Static61.method1099(arg5, local24, local30, arg0, arg7);
			return;
		}
	}
}
