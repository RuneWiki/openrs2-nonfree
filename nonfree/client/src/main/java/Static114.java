import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static114 {

	@OriginalMember(owner = "client!gu", name = "u", descriptor = "[I")
	public static int[] anIntArray156;

	@OriginalMember(owner = "client!gu", name = "x", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!gu", name = "y", descriptor = "Lclient!kk;")
	public static Class127 aClass127_4;

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)I", line = 5)
	public static int method2395(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(IIIIIIIII)V", line = 30)
	public static void method2396(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static301.method5542(arg3, arg2, arg0, 0, arg1, arg5, arg4);
	}

	@OriginalMember(owner = "client!gu", name = "b", descriptor = "(I)V", line = 53)
	public static void method2398() {
		if (Class98.aBoolean187) {
			return;
		}
		if (Static203.aClass177_Sub1_2.aBoolean351) {
			Class28.aFloat27 = (int) Class28.aFloat27 - 17 & 0xFFFFFFF0;
		} else {
			Class198.aFloat67 += (-Class198.aFloat67 - 12.0F) / 2.0F;
		}
		Class98.aBoolean187 = true;
		Class2_Sub13.aBoolean156 = true;
	}
}
