import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static377 {

	@OriginalMember(owner = "client!tf", name = "h", descriptor = "[Lclient!fg;")
	public static Class82[] aClass82Array1;

	@OriginalMember(owner = "client!tf", name = "b", descriptor = "[I")
	public static final int[] anIntArray442 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZIII)I")
	public static int method5264(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class2_Sub44 local8 = Static432.method5828(arg0, arg1);
		if (local8 == null) {
			return 0;
		} else if (arg2 >= 0 && local8.anIntArray498.length > arg2) {
			return local8.anIntArray498[arg2];
		} else {
			return 0;
		}
	}
}
