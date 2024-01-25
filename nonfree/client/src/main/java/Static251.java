import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "Lclient!bd;")
	public static Class26_Sub1 aClass26_Sub1_4;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(III)V")
	public static void method7506(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static246.aClass195_2 == Static586.aClass195_4) {
			if (!Static136.method2083(arg1, 1, -2, arg0, false, 1, 0, 0)) {
				Static136.method2083(arg1, 1, -3, arg0, false, 1, 0, 0);
			}
		} else if (!Static136.method2083(arg1, 1, -3, arg0, false, 1, 0, 0)) {
			Static136.method2083(arg1, 1, -2, arg0, false, 1, 0, 0);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZ)Z")
	public static boolean method7511(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class1_Sub51 local10 = (Class1_Sub51) Static310.aClass353_32.method7677(); local10 != null; local10 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
			if (Static416.method5728(local10.anInt9638) && (long) arg0 == local10.aLong302) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "(III)Ljava/lang/String;")
	public static String method7515(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg0 - arg1;
		if (local8 < -9) {
			return "<col=ff0000>";
		} else if (local8 < -6) {
			return "<col=ff3000>";
		} else if (local8 < -3) {
			return "<col=ff7000>";
		} else if (local8 < 0) {
			return "<col=ffb000>";
		} else if (local8 > 9) {
			return "<col=00ff00>";
		} else if (local8 > 6) {
			return "<col=40ff00>";
		} else if (local8 > 3) {
			return "<col=80ff00>";
		} else if (local8 > 0) {
			return "<col=c0ff00>";
		} else {
			return "<col=ffff00>";
		}
	}
}
