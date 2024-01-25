import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static562 {

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "I")
	public static int anInt9362;

	@OriginalMember(owner = "client!tda", name = "g", descriptor = "Lclient!sha;")
	public static Class321 aClass321_46;

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "[I")
	public static final int[] anIntArray627 = new int[13];

	@OriginalMember(owner = "client!tda", name = "d", descriptor = "Z")
	public static final boolean aBoolean681 = false;

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "Lclient!jn;")
	public static final Class179 aClass179_323 = new Class179(9, -1);

	@OriginalMember(owner = "client!tda", name = "f", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_134 = new Class289(39, 15);

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IIIII)V")
	public static void method7898(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg1 >= arg0) {
			for (local14 = arg0; local14 < arg1; local14++) {
				Static173.anIntArrayArray15[local14][arg3] = arg2;
			}
		} else {
			for (local14 = arg1; local14 < arg0; local14++) {
				Static173.anIntArrayArray15[local14][arg3] = arg2;
			}
		}
	}
}
