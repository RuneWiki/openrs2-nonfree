import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static222 {

	@OriginalMember(owner = "client!hh", name = "B", descriptor = "I")
	public static int anInt3544;

	@OriginalMember(owner = "client!hh", name = "A", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_133 = new Class196(37, -2);

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(IIIII)V")
	public static void method3158(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 > arg1) {
			Static343.method5202(arg1, Static286.anIntArrayArray42[arg0], arg3, arg2);
		} else {
			Static343.method5202(arg2, Static286.anIntArrayArray42[arg0], arg3, arg1);
		}
	}
}
