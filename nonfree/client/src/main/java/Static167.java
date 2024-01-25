import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!fm", name = "m", descriptor = "Lclient!lga;")
	public static Class223 aClass223_30;

	@OriginalMember(owner = "client!fm", name = "l", descriptor = "Lclient!qp;")
	public static Class304 aClass304_1;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "J")
	public static long aLong100 = -1L;

	@OriginalMember(owner = "client!fm", name = "p", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray12 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
	public static void method3307() {
		Static208.anInt4167 = -1;
		Static494.anInt4033 = -1;
		Static378.anInt6595 = 0;
		Static97.anInt1434 = -1;
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method3308(@OriginalArg(0) Class6_Sub2_Sub18 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static555.aClass96Array3 != Static216.aClass96Array1) {
			@Pc(12) int local12 = Static524.aClass96Array2[arg1].method8077(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class96 local19 = Static524.aClass96Array2[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8077(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method8072(arg0, arg2, local29, arg3);
						if (!arg4[local14]) {
							continue;
						}
					}
					local19.CA(arg0, arg2, local29, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
