import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static561 {

	@OriginalMember(owner = "client!vg", name = "c", descriptor = "Lclient!lh;")
	public static final Class194 aClass194_6 = new Class194("WTRC", 1);

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZIIIII)Z")
	public static boolean method7567(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(12) int local12 = arg4; local12 <= arg2; local12++) {
			for (@Pc(16) int local16 = arg3; local16 <= arg1; local16++) {
				if (Static181.anIntArrayArray23[local12][local16] == arg0 && Static86.anIntArrayArray14[local12][local16] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)V")
	public static void method7569(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class6_Sub2_Sub7 local8 = Static401.method5861(arg0, 5);
		local8.method2582();
		local8.anInt2944 = arg1;
	}
}
