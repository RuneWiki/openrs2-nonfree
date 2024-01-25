import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!iw", name = "Fb", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!iw", name = "Ab", descriptor = "I")
	public static int anInt5035 = -1;

	@OriginalMember(owner = "client!iw", name = "Cb", descriptor = "Lclient!kh;")
	public static Class208 aClass208_5 = null;

	@OriginalMember(owner = "client!iw", name = "Db", descriptor = "I")
	public static int anInt5037 = -1;

	@OriginalMember(owner = "client!iw", name = "e", descriptor = "(Z)V")
	public static void method4225() {
		Static538.aClass62_46.method1683();
		Static136.aClass258_2.method5933();
		Static610.aClass258_8.method5933();
	}

	@OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lclient!r;III[Z)Z")
	public static boolean method4227(@OriginalArg(0) Class3_Sub6_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static343.aClass104Array2 != Static605.aClass104Array3) {
			@Pc(12) int local12 = Static239.aClass104Array1[arg1].method8286(arg2, arg3);
			for (@Pc(14) int local14 = 0; local14 <= arg1; local14++) {
				@Pc(19) Class104 local19 = Static239.aClass104Array1[local14];
				if (local19 != null) {
					@Pc(29) int local29 = local12 - local19.method8286(arg2, arg3);
					if (arg4 != null) {
						arg4[local14] = local19.method8283(arg0, arg2, local29, arg3);
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
