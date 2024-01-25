import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static473 {

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "D")
	public static double aDouble19;

	@OriginalMember(owner = "client!qf", name = "b", descriptor = "(III)V")
	public static void method7003(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class5_Sub2_Sub4 local13 = Static257.method3597(13, (long) arg1);
		local13.method2438();
		local13.anInt2749 = arg0;
	}
}
