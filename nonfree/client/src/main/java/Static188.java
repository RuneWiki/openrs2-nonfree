import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "[Lclient!xa;")
	public static Class58[] aClass58Array8;

	@OriginalMember(owner = "client!hi", name = "e", descriptor = "Lclient!gca;")
	public static Class105 aClass105_3;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "Lclient!hg;")
	public static final Class132 aClass132_1 = new Class132(1);

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	public static int anInt3896 = -1;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIZII)V")
	public static void method3420(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 - arg4;
		@Pc(15) int local15 = arg3 - arg1;
		if (local15 == 0) {
			if (local10 != 0) {
				Static54.method1199(arg1, arg2, arg4, arg0);
			}
		} else if (local10 == 0) {
			Static589.method7802(arg4, arg2, arg3, arg1);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(56) boolean local56 = local10 > local15;
			@Pc(60) int local60;
			@Pc(64) int local64;
			if (local56) {
				local60 = arg1;
				arg1 = arg4;
				local64 = arg3;
				arg3 = arg0;
				arg4 = local60;
				arg0 = local64;
			}
			if (arg1 > arg3) {
				local60 = arg1;
				arg1 = arg3;
				local64 = arg4;
				arg3 = local60;
				arg4 = arg0;
				arg0 = local64;
			}
			local60 = arg4;
			local64 = arg3 - arg1;
			@Pc(105) int local105 = arg0 - arg4;
			@Pc(110) int local110 = -(local64 >> 1);
			@Pc(117) int local117 = arg0 <= arg4 ? -1 : 1;
			if (local105 < 0) {
				local105 = -local105;
			}
			@Pc(129) int local129;
			if (local56) {
				for (local129 = arg1; local129 <= arg3; local129++) {
					Static454.anIntArrayArray71[local129][local60] = arg2;
					local110 += local105;
					if (local110 > 0) {
						local110 -= local64;
						local60 += local117;
					}
				}
			} else {
				for (local129 = arg1; local129 <= arg3; local129++) {
					local110 += local105;
					Static454.anIntArrayArray71[local60][local129] = arg2;
					if (local110 > 0) {
						local60 += local117;
						local110 -= local64;
					}
				}
			}
		}
	}
}
