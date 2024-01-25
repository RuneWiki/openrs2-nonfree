import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static54 {

	@OriginalMember(owner = "client!cc", name = "F", descriptor = "I")
	public static int anInt1078;

	@OriginalMember(owner = "client!cc", name = "E", descriptor = "Z")
	public static boolean aBoolean69 = false;

	@OriginalMember(owner = "client!cc", name = "G", descriptor = "I")
	public static int anInt1079 = -1;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(Lclient!qa;IIIIIIII)V")
	public static void method1057(@OriginalArg(0) Class122 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(24) Interface18 local24 = (Interface18) Static453.method6441(arg6, arg4, arg3);
		@Pc(35) Class36 local35;
		@Pc(41) int local41;
		@Pc(45) int local45;
		@Pc(62) int local62;
		if (local24 != null) {
			local35 = Static308.aClass96_4.method2274(local24.method7467());
			local41 = local24.method7469() & 0x3;
			local45 = local24.method7465();
			if (local35.lb == -1) {
				local62 = arg7;
				if (local35.anInt992 > 0) {
					local62 = arg1;
				}
				if (local45 == 0 || local45 == 2) {
					if (local41 == 0) {
						arg0.method7285(local62, 4, arg2, arg5);
					} else if (local41 == 1) {
						arg0.method7259(arg5, local62, arg2, 4);
					} else if (local41 == 2) {
						arg0.method7285(local62, 4, arg2 + 3, arg5);
					} else if (local41 == 3) {
						arg0.method7259(arg5 + 3, local62, arg2, 4);
					}
				}
				if (local45 == 3) {
					if (local41 == 0) {
						arg0.method7265(local62, 1, arg2, 1, arg5);
					} else if (local41 == 1) {
						arg0.method7265(local62, 1, arg2 + 3, 1, arg5);
					} else if (local41 == 2) {
						arg0.method7265(local62, 1, arg2 + 3, 1, arg5 + 3);
					} else if (local41 == 3) {
						arg0.method7265(local62, 1, arg2, 1, arg5 + 3);
					}
				}
				if (local45 == 2) {
					if (local41 == 0) {
						arg0.method7259(arg5, local62, arg2, 4);
					} else if (local41 == 1) {
						arg0.method7285(local62, 4, arg2 + 3, arg5);
					} else if (local41 == 2) {
						arg0.method7259(arg5 + 3, local62, arg2, 4);
					} else if (local41 == 3) {
						arg0.method7285(local62, 4, arg2, arg5);
					}
				}
			} else {
				Static182.method2887(local41, arg5, arg2, local35, arg0);
			}
		}
		local24 = (Interface18) Static156.method2467(arg6, arg4, arg3, vaa.class);
		if (local24 != null) {
			local35 = Static308.aClass96_4.method2274(local24.method7467());
			local41 = local24.method7469() & 0x3;
			local45 = local24.method7465();
			if (local35.lb != -1) {
				Static182.method2887(local41, arg5, arg2, local35, arg0);
			} else if (local45 == 9) {
				local62 = -1118482;
				if (local35.anInt992 > 0) {
					local62 = -1179648;
				}
				if (local41 == 0 || local41 == 2) {
					arg0.method7209(arg2 + 3, arg2, arg5, local62, arg5 + 3);
				} else {
					arg0.method7209(arg2 + 3, arg2, arg5 + 3, local62, arg5);
				}
			}
		}
		local24 = (Interface18) Static117.method1983(arg6, arg4, arg3);
		if (local24 == null) {
			return;
		}
		local35 = Static308.aClass96_4.method2274(local24.method7467());
		local41 = local24.method7469() & 0x3;
		if (local35.lb != -1) {
			Static182.method2887(local41, arg5, arg2, local35, arg0);
			return;
		}
	}
}
