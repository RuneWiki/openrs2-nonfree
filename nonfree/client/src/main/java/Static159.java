import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static159 {

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "[I")
	public static final int[] anIntArray609 = new int[32];

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
	public static int anInt3048 = 0;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)V")
	public static void method2865(@OriginalArg(1) int arg0) {
		@Pc(12) Class2_Sub10_Sub2 local12 = Static217.method3611(arg0, 1);
		local12.method859();
	}
}
