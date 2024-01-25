import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static315 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "I")
	public static int anInt5489;

	@OriginalMember(owner = "client!qb", name = "f", descriptor = "[S")
	public static short[] aShortArray85;

	@OriginalMember(owner = "client!qb", name = "g", descriptor = "[I")
	public static int[] anIntArray368;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBII)V")
	public static void method4590(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(16) Class6_Sub2_Sub7 local16 = Static212.method3218(arg2, 11);
		local16.method3088();
		local16.anInt3744 = arg0;
		local16.anInt3749 = arg1;
	}
}
