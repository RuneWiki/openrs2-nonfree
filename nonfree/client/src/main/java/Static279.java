import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static279 {

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "[[Lclient!ep;")
	public static Class93[][] aClass93ArrayArray1;

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "I")
	public static int anInt5385;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_100 = new Class254(14, 1);

	@OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
	public static int anInt5384 = 0;

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "Lclient!pr;")
	public static final Class254 aClass254_101 = new Class254(106, 6);

	@OriginalMember(owner = "client!ko", name = "E", descriptor = "Lclient!pca;")
	public static final Class245 aClass245_43 = new Class245(20);

	@OriginalMember(owner = "client!ko", name = "G", descriptor = "Lclient!hv;")
	public static final Class143 aClass143_3 = new Class143();

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!w;III[Z)Z")
	public static boolean method4617(@OriginalArg(0) Class6_Sub4_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		@Pc(1) boolean local1 = false;
		if (Static47.aClass62Array1 != Static369.aClass62Array3) {
			@Pc(11) int local11 = Static53.aClass62Array2[arg1].sa(arg2, arg3);
			for (@Pc(13) int local13 = 0; local13 <= arg1; local13++) {
				@Pc(18) Class62 local18 = Static53.aClass62Array2[local13];
				if (local18 != null) {
					@Pc(27) int local27 = local11 - local18.sa(arg2, arg3);
					if (arg4 != null) {
						arg4[local13] = local18.method8207(arg0, arg2, local27, arg3);
						if (!arg4[local13]) {
							continue;
						}
					}
					local18.aa(arg0, arg2, local27, arg3, 0, false);
					local1 = true;
				}
			}
		}
		return local1;
	}
}
