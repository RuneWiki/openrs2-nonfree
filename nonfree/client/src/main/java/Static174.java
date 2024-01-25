import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!fs", name = "E", descriptor = "[I")
	public static final int[] anIntArray170 = new int[14];

	@OriginalMember(owner = "client!fs", name = "J", descriptor = "[I")
	public static final int[] anIntArray171 = new int[1000];

	@OriginalMember(owner = "client!fs", name = "M", descriptor = "Lclient!saa;")
	public static final Class327 aClass327_1 = new Class327();

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZI)Z")
	public static boolean method3414(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static404.method6624(arg0, arg1) & Static401.method6613(arg1, arg0);
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!km;")
	public static Class15_Sub3_Sub3 method3415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class27 local14 = local7.aClass27_3; local14 != null; local14 = local14.aClass27_1) {
			@Pc(18) Class15_Sub3_Sub3 local18 = local14.aClass15_Sub3_Sub3_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort62 == arg1 && local18.aShort64 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
