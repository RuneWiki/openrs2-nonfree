import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static444 {

	@OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIIIB)V")
	public static void method6492(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static212.method3218(arg2, 4);
		local8.method3088();
		local8.anInt3749 = arg1;
		local8.anInt3746 = arg0;
		local8.anInt3744 = arg3;
	}
}
