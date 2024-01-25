import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static294 {

	@OriginalMember(owner = "client!ou", name = "v", descriptor = "Z")
	public static boolean aBoolean383 = false;

	@OriginalMember(owner = "client!ou", name = "W", descriptor = "[I")
	public static final int[] anIntArray424 = new int[32];

	@OriginalMember(owner = "client!ou", name = "a", descriptor = "(IIIII)V")
	public static void method4238(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(10) Class2_Sub5_Sub13 local10 = Static208.method3306(arg0, 10);
		local10.method4547();
		local10.anInt5643 = arg2;
		local10.anInt5644 = arg3;
		local10.anInt5641 = arg1;
	}
}
