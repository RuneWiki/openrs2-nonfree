import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static316 {

	@OriginalMember(owner = "client!kl", name = "u", descriptor = "I")
	public static int anInt5278;

	@OriginalMember(owner = "client!kl", name = "v", descriptor = "F")
	public static float aFloat108;

	@OriginalMember(owner = "client!kl", name = "B", descriptor = "Lclient!ha;")
	public static Class13 aClass13_10;

	@OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
	public static int anInt5288 = 0;

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(Z)Z")
	public static boolean method4828() {
		return Static57.aBoolean88;
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIIIIIIII)V")
	public static void method4829(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3, @OriginalArg(7) int arg4, @OriginalArg(8) int arg5) {
		Static113.method2113(arg0, arg3, arg5, arg1, arg4, 0, arg2);
	}

	@OriginalMember(owner = "client!kl", name = "d", descriptor = "(B)V")
	public static void method4830() {
		if (Static506.aClass81_6 == null) {
			return;
		}
		if (Static506.aClass81_6.anInt2532 == 1) {
			Static506.aClass81_6 = null;
			return;
		}
		if (Static506.aClass81_6.anInt2532 == 2) {
			Static442.method6277(Static257.aClass291_2, Static270.aString45, 2);
			Static506.aClass81_6 = null;
			return;
		}
	}
}
