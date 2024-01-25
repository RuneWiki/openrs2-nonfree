import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static402 {

	@OriginalMember(owner = "client!of", name = "y", descriptor = "I")
	public static final int anInt6427 = 1406;

	@OriginalMember(owner = "client!of", name = "z", descriptor = "Z")
	public static boolean aBoolean478 = true;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V")
	public static void method5416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(10) Class2_Sub5_Sub10 local10 = Static594.method8175(arg2, 9);
		local10.method4393();
		local10.anInt5255 = arg1;
		local10.anInt5246 = arg0;
	}
}
