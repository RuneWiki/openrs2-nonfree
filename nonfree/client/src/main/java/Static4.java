import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[Lclient!f;")
	public static Class8[] aClass8Array3;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BIIIIIII)V")
	public static void method24(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static452.anInt7626 <= arg6 && Static82.anInt3956 >= arg3 && Static341.anInt5789 <= arg2 && Static309.anInt5495 >= arg5) {
			Static207.method3208(arg0, arg6, arg5, arg4, arg3, arg1, arg2);
		} else {
			Static279.method3497(arg4, arg0, arg1, arg3, arg5, arg2, arg6);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method25(@OriginalArg(0) String arg0) {
		System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
		System.exit(1);
	}
}
