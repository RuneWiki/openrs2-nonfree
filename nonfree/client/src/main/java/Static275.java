import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static275 {

	@OriginalMember(owner = "client!jc", name = "Fh", descriptor = "[Lclient!eo;")
	public static final Class106[] aClass106Array1 = new Class106[4];

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IIIIB)V")
	public static void method4483(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(18) int local18;
		if (arg2 >= arg3) {
			for (local18 = arg3; local18 < arg2; local18++) {
				Static16.anIntArrayArray2[local18][arg1] = arg0;
			}
		} else {
			for (local18 = arg2; local18 < arg3; local18++) {
				Static16.anIntArrayArray2[local18][arg1] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "([SII)[S")
	public static short[] method4487(@OriginalArg(0) short[] arg0, @OriginalArg(1) int arg1) {
		@Pc(6) short[] local6 = new short[arg1];
		Static686.method4965(arg0, 0, local6, 0, arg1);
		return local6;
	}
}
