import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static333 {

	@OriginalMember(owner = "client!mr", name = "d", descriptor = "[I")
	public static int[] anIntArray353;

	@OriginalMember(owner = "client!mr", name = "i", descriptor = "Lclient!fa;")
	public static Interface7 anInterface7_7;

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "Z")
	public static boolean aBoolean440 = false;

	@OriginalMember(owner = "client!mr", name = "h", descriptor = "[I")
	public static int[] anIntArray354 = new int[2];

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "(III)Ljava/lang/String;")
	public static String method5094(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 - arg0;
		if (local7 < -9) {
			return "<col=ff0000>";
		} else if (local7 < -6) {
			return "<col=ff3000>";
		} else if (local7 < -3) {
			return "<col=ff7000>";
		} else if (local7 < 0) {
			return "<col=ffb000>";
		} else if (local7 > 9) {
			return "<col=00ff00>";
		} else if (local7 > 6) {
			return "<col=40ff00>";
		} else if (local7 > 3) {
			return "<col=80ff00>";
		} else if (local7 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}

	@OriginalMember(owner = "client!mr", name = "a", descriptor = "([ILclient!kfa;IZIIII)Lclient!bb;")
	public static Class3_Sub2_Sub1 method5095(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class7_Sub2 arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (arg1.aBoolean377 || Static32.method1002(arg3) && Static32.method1002(arg5)) {
			return new Class3_Sub2_Sub1(arg1, 3553, arg3, arg5, false, arg0, arg4, 0);
		} else if (arg1.aBoolean381) {
			return new Class3_Sub2_Sub1(arg1, 34037, arg3, arg5, false, arg0, arg4, 0);
		} else {
			return new Class3_Sub2_Sub1(arg1, arg3, arg5, Static488.method7100(arg3), Static488.method7100(arg5), arg0);
		}
	}
}
