import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static384 {

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "Lclient!jp;")
	public static final Class129 aClass129_185 = new Class129(84, 0);

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V")
	public static void method5636(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		if (arg3 <= arg1) {
			Static291.method3606(arg1, Static133.anIntArrayArray15[arg2], arg0, arg3);
		} else {
			Static291.method3606(arg3, Static133.anIntArrayArray15[arg2], arg0, arg1);
		}
	}
}
