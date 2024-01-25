import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static107 {

	@OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
	public static int anInt2045;

	@OriginalMember(owner = "client!gs", name = "g", descriptor = "[I")
	public static final int[] anIntArray177 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "([Ljava/lang/String;I)[Ljava/lang/String;")
	public static String[] method1702(@OriginalArg(0) String[] arg0) {
		@Pc(8) String[] local8 = new String[5];
		for (@Pc(10) int local10 = 0; local10 < 5; local10++) {
			local8[local10] = local10 + ": ";
			if (arg0 != null && arg0[local10] != null) {
				local8[local10] = local8[local10] + arg0[local10];
			}
		}
		return local8;
	}

	@OriginalMember(owner = "client!gs", name = "b", descriptor = "(I)V")
	public static void method1706() {
		Static303.aClass37_101.method919();
		Static123.aClass37_81.method919();
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lclient!ps;I)Ljava/lang/String;")
	public static String method1708(@OriginalArg(0) Class163 arg0) {
		if (Static40.method857(arg0).method1086() == 0) {
			return null;
		} else if (arg0.aString190 == null || arg0.aString190.trim().length() == 0) {
			return Static173.aBoolean279 ? "Hidden-use" : null;
		} else {
			return arg0.aString190;
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(IIIIILclient!ii;III)V")
	public static void method1710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class105 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface4 local11 = (Interface4) method1713(arg0, arg2, arg6);
		@Pc(19) Class79 local19;
		@Pc(25) int local25;
		@Pc(29) int local29;
		@Pc(44) int local44;
		if (local11 != null) {
			local19 = Static129.method2097(local11.method5445());
			local25 = local11.method5449() & 0x3;
			local29 = local11.method5452();
			if (local19.lb == -1) {
				local44 = arg1;
				if (local19.anInt1863 > 0) {
					local44 = arg4;
				}
				if (local29 == 0 || local29 == 2) {
					if (local25 == 0) {
						arg5.method4255(local44, 4, arg7, arg3);
					} else if (local25 == 1) {
						arg5.method4248(arg3, local44, arg7, 4);
					} else if (local25 == 2) {
						arg5.method4255(local44, 4, arg7, arg3 + 3);
					} else if (local25 == 3) {
						arg5.method4248(arg3, local44, arg7 + 3, 4);
					}
				}
				if (local29 == 3) {
					if (local25 == 0) {
						arg5.method4225(1, local44, 1, arg3, arg7);
					} else if (local25 == 1) {
						arg5.method4225(1, local44, 1, arg3 + 3, arg7);
					} else if (local25 == 2) {
						arg5.method4225(1, local44, 1, arg3 + 3, arg7 + 3);
					} else if (local25 == 3) {
						arg5.method4225(1, local44, 1, arg3, arg7 + 3);
					}
				}
				if (local29 == 2) {
					if (local25 == 0) {
						arg5.method4248(arg3, local44, arg7, 4);
					} else if (local25 == 1) {
						arg5.method4255(local44, 4, arg7, arg3 + 3);
					} else if (local25 == 2) {
						arg5.method4248(arg3, local44, arg7 + 3, 4);
					} else if (local25 == 3) {
						arg5.method4255(local44, 4, arg7, arg3);
					}
				}
			} else {
				Static101.method1598(arg5, arg7, local19, local25, arg3);
			}
		}
		local11 = (Interface4) Static183.method3234(arg0, arg2, arg6, jb.class);
		if (local11 != null) {
			local19 = Static129.method2097(local11.method5445());
			local25 = local11.method5449() & 0x3;
			local29 = local11.method5452();
			if (local19.lb != -1) {
				Static101.method1598(arg5, arg7, local19, local25, arg3);
			} else if (local29 == 9) {
				local44 = -1118482;
				if (local19.anInt1863 > 0) {
					local44 = -1179648;
				}
				if (local25 == 0 || local25 == 2) {
					arg5.method4252(arg3 + 3, arg7 + 3, arg3, arg7, local44);
				} else {
					arg5.method4252(arg3 + 3, arg7, arg3, arg7 + 3, local44);
				}
			}
		}
		local11 = (Interface4) Static137.method4969(arg0, arg2, arg6);
		if (local11 == null) {
			return;
		}
		local19 = Static129.method2097(local11.method5445());
		local25 = local11.method5449() & 0x3;
		if (local19.lb != -1) {
			Static101.method1598(arg5, arg7, local19, local25, arg3);
		}
	}

	@OriginalMember(owner = "client!gs", name = "a", descriptor = "(III)Lclient!e;")
	public static Class10_Sub2 method1713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class83 local7 = Static347.aClass83ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass10_Sub2_1;
	}
}
