import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static318 {

	@OriginalMember(owner = "client!lw", name = "L", descriptor = "I")
	public static final int anInt5356 = 1337;

	@OriginalMember(owner = "client!lw", name = "Q", descriptor = "[I")
	public static final int[] anIntArray366 = new int[3];

	@OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)Z")
	public static boolean method4634(@OriginalArg(0) int arg0) {
		return arg0 == 7 || arg0 == 9;
	}

	@OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lclient!dc;IBLclient!r;I)V")
	public static void method4635(@OriginalArg(0) Class70 arg0, @OriginalArg(3) Class162 arg1) {
		Static177.aClass70_9.method1265();
		if (Static138.aBoolean159) {
			return;
		}
		for (@Pc(20) Class2_Sub20 local20 = (Class2_Sub20) arg0.method1264(); local20 != null; local20 = (Class2_Sub20) arg0.method1261()) {
			@Pc(28) Class142 local28 = Static476.aClass360_4.method7576(local20.anInt2970);
			if (Static113.method1671(local28)) {
				@Pc(40) boolean local40 = Static241.method3439(local28, local20, arg1);
				if (local40) {
					Static448.method1159(arg1, local20, local28);
				}
			}
		}
	}
}
