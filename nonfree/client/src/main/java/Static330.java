import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static330 {

	@OriginalMember(owner = "client!ml", name = "d", descriptor = "[Lclient!f;")
	public static Class46[] aClass46Array12;

	@OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
	public static int anInt5903;

	@OriginalMember(owner = "client!ml", name = "f", descriptor = "Lclient!rb;")
	public static Class279 aClass279_2;

	@OriginalMember(owner = "client!ml", name = "c", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_126 = new Class298(50, 3);

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(BII)Z")
	public static boolean method5099(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (Static215.method3769(arg1, arg0)) {
			return (arg1 & 0x9000) != 0 | Static447.method6264(arg1, arg0) | Static442.method7196(arg1, arg0) ? true : ((arg1 & 0x2000) != 0 | Static188.method3226(arg1, arg0) | Static8.method111(arg0, arg1)) & (arg0 & 0x37) == 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lclient!qh;I)Ljava/lang/String;")
	public static String method5100(@OriginalArg(0) Class3_Sub11 arg0) {
		return Static441.method6206(arg0);
	}
}
