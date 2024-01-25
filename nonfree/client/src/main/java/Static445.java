import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static445 {

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Z")
	public static boolean aBoolean569 = false;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
	public static void method6622(@OriginalArg(1) int arg0) {
		@Pc(11) Class5_Sub2_Sub4 local11 = Static257.method3597(10, (long) arg0);
		local11.method2440();
	}
}
