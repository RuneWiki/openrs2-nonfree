import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static337 {

	@OriginalMember(owner = "client!tn", name = "i", descriptor = "[Lclient!pl;")
	public static Class7[] aClass7Array3;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "I")
	public static int anInt5692 = 0;

	@OriginalMember(owner = "client!tn", name = "c", descriptor = "Lclient!wf;")
	public static final Class244 aClass244_79 = new Class244(15, 8);

	@OriginalMember(owner = "client!tn", name = "e", descriptor = "Lclient!dt;")
	public static Class62 aClass62_16 = null;

	@OriginalMember(owner = "client!tn", name = "a", descriptor = "(IIIII)V")
	public static void method5117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(18) int local18;
		if (arg3 > arg1) {
			for (local18 = arg1; local18 < arg3; local18++) {
				Static325.anIntArrayArray50[local18][arg2] = arg0;
			}
		} else {
			for (local18 = arg3; local18 < arg1; local18++) {
				Static325.anIntArrayArray50[local18][arg2] = arg0;
			}
		}
	}
}
