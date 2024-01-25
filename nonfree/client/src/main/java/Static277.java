import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static277 {

	@OriginalMember(owner = "client!ji", name = "f", descriptor = "I")
	public static int anInt4345;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "Z")
	public static boolean aBoolean287 = true;

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_56 = new Class187(85, -1);

	@OriginalMember(owner = "client!ji", name = "e", descriptor = "Lclient!tga;")
	public static final Class335 aClass335_21 = new Class335(16);

	@OriginalMember(owner = "client!ji", name = "g", descriptor = "Lclient!pa;")
	public static final Class265 aClass265_27 = new Class265(10);

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
	public static void method3848(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg1 - arg0;
		@Pc(12) int local12 = arg2 - arg3;
		if (local12 == 0) {
			if (local7 != 0) {
				Static4.method47(arg4, arg1, arg0, arg3);
			}
		} else if (local7 == 0) {
			Static222.method3158(arg0, arg2, arg3, arg4);
		} else {
			if (local7 < 0) {
				local7 = -local7;
			}
			if (local12 < 0) {
				local12 = -local12;
			}
			@Pc(59) boolean local59 = local12 < local7;
			@Pc(63) int local63;
			@Pc(67) int local67;
			if (local59) {
				local63 = arg3;
				arg3 = arg0;
				local67 = arg2;
				arg2 = arg1;
				arg0 = local63;
				arg1 = local67;
			}
			if (arg2 < arg3) {
				local63 = arg3;
				local67 = arg0;
				arg3 = arg2;
				arg2 = local63;
				arg0 = arg1;
				arg1 = local67;
			}
			local63 = arg0;
			local67 = arg2 - arg3;
			@Pc(106) int local106 = arg1 - arg0;
			@Pc(111) int local111 = -(local67 >> 1);
			if (local106 < 0) {
				local106 = -local106;
			}
			@Pc(123) int local123 = arg0 < arg1 ? 1 : -1;
			@Pc(127) int local127;
			if (local59) {
				for (local127 = arg3; local127 <= arg2; local127++) {
					local111 += local106;
					Static286.anIntArrayArray42[local127][local63] = arg4;
					if (local111 > 0) {
						local63 += local123;
						local111 -= local67;
					}
				}
			} else {
				for (local127 = arg3; local127 <= arg2; local127++) {
					local111 += local106;
					Static286.anIntArrayArray42[local63][local127] = arg4;
					if (local111 > 0) {
						local111 -= local67;
						local63 += local123;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
	public static void method3849(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == Static617.anInt9945 && arg0 == Static171.anInt2824 && Static288.anInt4507 == arg2) {
			return;
		}
		Static677.aBoolean794 = true;
		Static617.anInt9945 = arg1;
		Static171.anInt2824 = arg0;
		Static288.anInt4507 = arg2;
		@Pc(39) double local39 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(49) double local49 = -((double) (arg0 * 2) * 3.141592653589793D) / 16384.0D;
		@Pc(52) double local52 = Math.cos(local49);
		@Pc(55) double local55 = Math.sin(local49);
		@Pc(58) double local58 = Math.cos(local39);
		@Pc(61) double local61 = Math.sin(local39);
		Static143.aDouble8 = local58 * -local55;
		Static131.aDouble7 = local61;
		Static97.aDouble6 = local52;
		Static423.aDouble16 = local55;
		Static561.aDouble20 = 0.0D;
		Static56.aDouble5 = local52 * local58;
		Static181.aDouble9 = local58;
		Static420.aDouble15 = local61 * -local52;
		Static28.aDouble1 = local55 * local61;
	}
}
