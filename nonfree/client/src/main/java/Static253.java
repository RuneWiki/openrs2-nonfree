import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static253 {

	@OriginalMember(owner = "client!mr", name = "g", descriptor = "Lclient!jd;")
	public static Class66 aClass66_2;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "[I")
	public static final int[] anIntArray386 = new int[14];

	@OriginalMember(owner = "client!mr", name = "r", descriptor = "[I")
	public static final int[] anIntArray387 = new int[14];

	@OriginalMember(owner = "client!mr", name = "t", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[] { "en", "de", "fr", "pt", "nl" };

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Lclient!ba;III[Z)Z")
	public static boolean method3786(@OriginalArg(0) Class1_Sub2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static105.aClass149Array1 != Static277.aClass149Array3) {
			@Pc(11) int local11 = Static269.aClass149Array2[arg1].a(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class149 local18 = Static269.aClass149Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.a(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method3567(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.b(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method3792(@OriginalArg(0) String arg0) {
		if (!arg0.equals("")) {
			Static193.method2984(Static210.aClass179_47);
			Static92.aClass1_Sub5_Sub1_1.method5396(Static119.method747(arg0));
			Static92.aClass1_Sub5_Sub1_1.method5385(arg0);
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILclient!ya;BIIIII)V")
	public static void method3796(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class39 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface5 local11 = (Interface5) Static110.method1983(arg5, arg7, arg6);
		@Pc(20) Class129 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(46) int local46;
		if (local11 != null) {
			local20 = Static349.aClass115_4.method2766(local11.method5176());
			local26 = local11.method5169() & 0x3;
			local30 = local11.method5172();
			if (local20.anInt3493 == -1) {
				local46 = arg4;
				if (local20.anInt3504 > 0) {
					local46 = arg1;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg2.method4500(arg3, 4, arg0, local46);
					} else if (local26 == 1) {
						arg2.method4501(arg0, 4, local46, arg3);
					} else if (local26 == 2) {
						arg2.method4500(arg3, 4, arg0 + 3, local46);
					} else if (local26 == 3) {
						arg2.method4501(arg0, 4, local46, arg3 + 3);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg2.method4563(arg3, local46, 1, arg0, 1);
					} else if (local26 == 1) {
						arg2.method4563(arg3, local46, 1, arg0 + 3, 1);
					} else if (local26 == 2) {
						arg2.method4563(arg3 + 3, local46, 1, arg0 + 3, 1);
					} else if (local26 == 3) {
						arg2.method4563(arg3 + 3, local46, 1, arg0, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg2.method4501(arg0, 4, local46, arg3);
					} else if (local26 == 1) {
						arg2.method4500(arg3, 4, arg0 + 3, local46);
					} else if (local26 == 2) {
						arg2.method4501(arg0, 4, local46, arg3 + 3);
					} else if (local26 == 3) {
						arg2.method4500(arg3, 4, arg0, local46);
					}
				}
			} else {
				Static158.method2569(arg2, arg0, local20, local26, arg3);
			}
		}
		local11 = (Interface5) Static357.method4896(arg5, arg7, arg6, ig.class);
		if (local11 != null) {
			local20 = Static349.aClass115_4.method2766(local11.method5176());
			local26 = local11.method5169() & 0x3;
			local30 = local11.method5172();
			if (local20.anInt3493 != -1) {
				Static158.method2569(arg2, arg0, local20, local26, arg3);
			} else if (local30 == 9) {
				local46 = -1118482;
				if (local20.anInt3504 > 0) {
					local46 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg2.method4529(arg3 + 3, arg0, arg3, local46, arg0 + 3);
				} else {
					arg2.method4529(arg3, arg0, arg3 + 3, local46, arg0 + 3);
				}
			}
		}
		local11 = (Interface5) Static393.method5258(arg5, arg7, arg6);
		if (local11 == null) {
			return;
		}
		local20 = Static349.aClass115_4.method2766(local11.method5176());
		local26 = local11.method5169() & 0x3;
		if (local20.anInt3493 != -1) {
			Static158.method2569(arg2, arg0, local20, local26, arg3);
			return;
		}
	}
}
