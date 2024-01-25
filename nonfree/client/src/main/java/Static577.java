import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "F")
	public static float aFloat134;

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!rq;B)V")
	public static void method5077(@OriginalArg(0) Class29_Sub2_Sub1 arg0) {
		@Pc(5) boolean local5 = false;
		if (Static358.anInt6263 == arg0.anInt8567 || arg0.anInt8538 == -1 || arg0.anInt8563 != 0) {
			local5 = true;
		} else {
			@Pc(27) Class108 local27 = Static31.aClass345_1.method7798(arg0.anInt8538);
			if (local27.aBoolean177 || arg0.anInt8577 + 1 > local27.anIntArray313[arg0.anInt8536]) {
				local5 = true;
			}
		}
		if (local5) {
			@Pc(59) int local59 = arg0.anInt8567 - arg0.anInt8507;
			@Pc(65) int local65 = Static358.anInt6263 - arg0.anInt8507;
			@Pc(77) int local77 = arg0.anInt8506 * 512 + arg0.method7008() * 256;
			@Pc(89) int local89 = arg0.anInt8547 * 512 + arg0.method7008() * 256;
			@Pc(101) int local101 = arg0.anInt8570 * 512 + arg0.method7008() * 256;
			@Pc(113) int local113 = arg0.anInt8559 * 512 + arg0.method7008() * 256;
			arg0.anInt9218 = ((local59 - local65) * local89 + local113 * local65) / local59;
			arg0.anInt9222 = ((local59 - local65) * local77 + local65 * local101) / local59;
		}
		arg0.anInt8584 = 0;
		if (arg0.anInt8552 == 0) {
			arg0.method7007(8192, false);
		}
		if (arg0.anInt8552 == 1) {
			arg0.method7007(12288, false);
		}
		if (arg0.anInt8552 == 2) {
			arg0.method7007(0, false);
		}
		if (arg0.anInt8552 == 3) {
			arg0.method7007(4096, false);
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(ILclient!dw;)V")
	public static void method5078(@OriginalArg(1) Class29_Sub2_Sub1_Sub1 arg0) {
		for (@Pc(16) Class6_Sub22 local16 = (Class6_Sub22) Static292.aClass275_101.method6366(); local16 != null; local16 = (Class6_Sub22) Static292.aClass275_101.method6364()) {
			if (local16.aClass29_Sub2_Sub1_Sub1_1 == arg0) {
				if (local16.aClass6_Sub19_Sub2_2 != null) {
					Static144.aClass6_Sub19_Sub3_2.method6424(local16.aClass6_Sub19_Sub2_2);
					local16.aClass6_Sub19_Sub2_2 = null;
				}
				local16.method7849();
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lclient!cr;ZLjava/lang/String;ZI)V")
	public static void method5079(@OriginalArg(0) Class57 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) String arg2, @OriginalArg(3) boolean arg3) {
		if (!arg3) {
			Static546.method7523(arg2, 3, arg0);
			return;
		}
		@Pc(14) String local14;
		if (Static70.aString18.startsWith("win") && arg0.aBoolean74) {
			local14 = null;
			if (Static189.anApplet4 != null) {
				local14 = Static189.anApplet4.getParameter("haveie6");
			}
			if (local14 == null || !local14.equals("1")) {
				@Pc(32) Class278 local32 = Static546.method7523(arg2, 0, arg0);
				Static396.aString85 = arg2;
				Static454.aClass278_9 = local32;
				Static150.aClass57_3 = arg0;
				return;
			}
		}
		if (Static70.aString18.startsWith("mac")) {
			local14 = null;
			if (Static189.anApplet4 != null) {
				local14 = Static189.anApplet4.getParameter("havefirefox");
			}
			if (local14 != null && local14.equals("1") && arg1) {
				Static546.method7523(arg2, 1, arg0);
				return;
			}
		}
		Static546.method7523(arg2, 2, arg0);
	}

	@OriginalMember(owner = "client!wt", name = "a", descriptor = "(IFZFF)F")
	public static float method5080(@OriginalArg(0) int arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3) {
		@Pc(17) float[] local17 = Static570.aFloatArrayArray15[arg0];
		return arg2 * local17[2] + local17[0] * arg3 + local17[1] * arg1;
	}
}
