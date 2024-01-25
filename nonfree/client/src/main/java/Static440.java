import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static440 {

	@OriginalMember(owner = "client!pm", name = "c", descriptor = "Lclient!uu;")
	public static Class343 aClass343_208;

	@OriginalMember(owner = "client!pm", name = "o", descriptor = "[I")
	public static int[] anIntArray460;

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIILclient!uv;)V")
	public static void method6623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class344 arg2) {
		@Pc(14) Class1 local14 = arg2.method8166(Static266.aClass82_8);
		if (local14 == null) {
			return;
		}
		Static266.aClass82_8.KA(arg1, arg0, arg1 + arg2.anInt9546, arg0 + arg2.anInt9602);
		if (Static322.anInt6163 < 3) {
			Static355.aClass103_47.method7463((float) arg1 + (float) arg2.anInt9546 / 2.0F, (float) arg0 + (float) arg2.anInt9602 / 2.0F, ((int) -Static170.aFloat71 & 0x3FFF) << 2, local14, arg1, arg0);
		} else {
			Static266.aClass82_8.A(-16777216, local14, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[Ljava/lang/String;)V")
	public static void method6626(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static73.aString8 = Static73.aString8 + arg0[0];
			Static412.anInt7257 += arg0[0].length();
			return;
		}
		for (@Pc(43) int local43 = 0; local43 < arg0.length; local43++) {
			if (arg0[local43].startsWith("pause")) {
				@Pc(62) int local62 = 5;
				try {
					local62 = Integer.parseInt(arg0[local43].substring(6));
				} catch (@Pc(71) Exception local71) {
				}
				Static8.method147("Pausing for " + local62 + " seconds...");
				Static337.anInt6290 = local43 + 1;
				Static619.aStringArray79 = arg0;
				Static580.aLong259 = Static191.method3071() + (long) (local62 * 1000);
				return;
			}
			Static73.aString8 = arg0[local43];
			Static422.method6656(false);
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(IC)Z")
	public static boolean method6628(@OriginalArg(1) char arg0) {
		return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lclient!ha;IIIIIIII)V")
	public static void method6629(@OriginalArg(0) Class82 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface2 local11 = (Interface2) Static380.method5991(arg1, arg6, arg7);
		@Pc(20) Class330 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(46) int local46;
		if (local11 != null) {
			local20 = Static370.aClass284_3.method6915(local11.method7500());
			local26 = local11.method7496() & 0x3;
			local30 = local11.method7495();
			if (local20.anInt9201 == -1) {
				local46 = arg4;
				if (local20.anInt9228 > 0) {
					local46 = arg2;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg0.method6154(4, local46, arg5, arg3);
					} else if (local26 == 1) {
						arg0.method6108(arg3, arg5, local46, 4);
					} else if (local26 == 2) {
						arg0.method6154(4, local46, arg5, arg3 + 3);
					} else if (local26 == 3) {
						arg0.method6108(arg3, arg5 + 3, local46, 4);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg0.method6134(arg3, 1, 1, local46, arg5);
					} else if (local26 == 1) {
						arg0.method6134(arg3 + 3, 1, 1, local46, arg5);
					} else if (local26 == 2) {
						arg0.method6134(arg3 + 3, 1, 1, local46, arg5 + 3);
					} else if (local26 == 3) {
						arg0.method6134(arg3, 1, 1, local46, arg5 + 3);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg0.method6108(arg3, arg5, local46, 4);
					} else if (local26 == 1) {
						arg0.method6154(4, local46, arg5, arg3 + 3);
					} else if (local26 == 2) {
						arg0.method6108(arg3, arg5 + 3, local46, 4);
					} else if (local26 == 3) {
						arg0.method6154(4, local46, arg5, arg3);
					}
				}
			} else {
				Static462.method6842(arg5, arg0, local26, arg3, local20);
			}
		}
		local11 = (Interface2) Static137.method2371(arg1, arg6, arg7, bda.class);
		if (local11 != null) {
			local20 = Static370.aClass284_3.method6915(local11.method7500());
			local26 = local11.method7496() & 0x3;
			local30 = local11.method7495();
			if (local20.anInt9201 != -1) {
				Static462.method6842(arg5, arg0, local26, arg3, local20);
			} else if (local30 == 9) {
				local46 = -1118482;
				if (local20.anInt9228 > 0) {
					local46 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg0.method6097(arg5, arg3 + 3, arg5 + 3, arg3, local46);
				} else {
					arg0.method6097(arg5 + 3, arg3 + 3, arg5, arg3, local46);
				}
			}
		}
		local11 = (Interface2) Static279.method4563(arg1, arg6, arg7);
		if (local11 == null) {
			return;
		}
		local20 = Static370.aClass284_3.method6915(local11.method7500());
		local26 = local11.method7496() & 0x3;
		if (local20.anInt9201 != -1) {
			Static462.method6842(arg5, arg0, local26, arg3, local20);
		}
	}
}
