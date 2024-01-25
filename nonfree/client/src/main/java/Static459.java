import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static459 {

	@OriginalMember(owner = "client!ok", name = "y", descriptor = "I")
	public static int anInt2357;

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBIII)V")
	public static void method2096(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class3_Sub4_Sub2 local14 = Static502.method7211(18, (long) arg2 | (long) arg0 << 32);
		local14.method630();
		local14.anInt803 = arg1;
		local14.anInt805 = arg3;
	}
}
