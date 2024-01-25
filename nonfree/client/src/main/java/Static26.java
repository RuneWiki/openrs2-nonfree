import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static26 {

	@OriginalMember(owner = "client!bh", name = "O", descriptor = "I")
	public static int anInt586;

	@OriginalMember(owner = "client!bh", name = "N", descriptor = "[I")
	public static final int[] anIntArray115 = new int[1000];

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(III)V")
	public static void method489(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class2_Sub10_Sub2 local8 = Static217.method3611(arg1, 12);
		local8.method864();
		local8.anInt1037 = arg0;
	}
}
