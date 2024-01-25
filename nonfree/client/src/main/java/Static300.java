import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!pk", name = "z", descriptor = "I")
	public static int anInt5372;

	@OriginalMember(owner = "client!pk", name = "B", descriptor = "I")
	public static int anInt5373;

	@OriginalMember(owner = "client!pk", name = "y", descriptor = "Lclient!wv;")
	public static final Class269 aClass269_9 = new Class269("LOCAL", 4);

	@OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
	public static int anInt5375 = 0;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIIIZII)V")
	public static void method4358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg2;
		@Pc(11) int local11 = 0;
		@Pc(16) int local16 = arg5 - arg6;
		@Pc(20) int local20 = arg2 - arg6;
		@Pc(24) int local24 = arg5 * arg5;
		@Pc(28) int local28 = arg2 * arg2;
		@Pc(37) int local37 = local16 * local16;
		@Pc(41) int local41 = local20 * local20;
		@Pc(45) int local45 = local28 << 1;
		@Pc(49) int local49 = local24 << 1;
		@Pc(53) int local53 = local41 << 1;
		@Pc(57) int local57 = local37 << 1;
		@Pc(61) int local61 = arg2 << 1;
		@Pc(65) int local65 = local20 << 1;
		@Pc(74) int local74 = local45 + (1 - local61) * local24;
		@Pc(83) int local83 = local28 - local49 * (local61 - 1);
		@Pc(92) int local92 = local53 + local37 * (1 - local65);
		@Pc(101) int local101 = local41 - local57 * (local65 - 1);
		@Pc(105) int local105 = local24 << 2;
		@Pc(109) int local109 = local28 << 2;
		@Pc(113) int local113 = local37 << 2;
		@Pc(117) int local117 = local41 << 2;
		@Pc(121) int local121 = local45 * 3;
		@Pc(127) int local127 = local49 * (local61 - 3);
		@Pc(131) int local131 = local53 * 3;
		@Pc(137) int local137 = (local65 - 3) * local57;
		@Pc(139) int local139 = local109;
		@Pc(145) int local145 = local105 * (arg2 - 1);
		@Pc(147) int local147 = local117;
		@Pc(170) int local170;
		@Pc(178) int local178;
		@Pc(186) int local186;
		@Pc(195) int local195;
		if (arg1 >= Static75.anInt1858 && Static175.anInt3399 >= arg1) {
			@Pc(161) int[] local161 = Static277.anIntArrayArray40[arg1];
			local170 = Static440.method5950(arg0 - arg5, Static351.anInt6176, Static331.anInt5894);
			local178 = Static440.method5950(arg5 + arg0, Static351.anInt6176, Static331.anInt5894);
			local186 = Static440.method5950(arg0 - local16, Static351.anInt6176, Static331.anInt5894);
			local195 = Static440.method5950(arg0 + local16, Static351.anInt6176, Static331.anInt5894);
			Static49.method990(local161, local186, local170, arg3);
			Static49.method990(local161, local195, local186, arg4);
			Static49.method990(local161, local178, local195, arg3);
		}
		@Pc(219) int local219 = local113 * (local20 - 1);
		while (local9 > 0) {
			@Pc(232) boolean local232 = local9 <= local20;
			if (local232) {
				if (local92 < 0) {
					while (local92 < 0) {
						local92 += local131;
						local101 += local147;
						local131 += local117;
						local147 += local117;
						local11++;
					}
				}
				if (local101 < 0) {
					local101 += local147;
					local92 += local131;
					local11++;
					local131 += local117;
					local147 += local117;
				}
				local92 += -local219;
				local101 += -local137;
				local137 -= local113;
				local219 -= local113;
			}
			if (local74 < 0) {
				while (local74 < 0) {
					local83 += local139;
					local74 += local121;
					local7++;
					local139 += local109;
					local121 += local109;
				}
			}
			if (local83 < 0) {
				local83 += local139;
				local74 += local121;
				local7++;
				local121 += local109;
				local139 += local109;
			}
			local83 += -local127;
			local74 += -local145;
			local9--;
			local127 -= local105;
			local145 -= local105;
			local170 = arg1 - local9;
			local178 = local9 + arg1;
			if (local178 >= Static75.anInt1858 && local170 <= Static175.anInt3399) {
				local186 = Static440.method5950(local7 + arg0, Static351.anInt6176, Static331.anInt5894);
				local195 = Static440.method5950(arg0 - local7, Static351.anInt6176, Static331.anInt5894);
				if (local232) {
					@Pc(410) int local410 = Static440.method5950(local11 + arg0, Static351.anInt6176, Static331.anInt5894);
					@Pc(419) int local419 = Static440.method5950(arg0 - local11, Static351.anInt6176, Static331.anInt5894);
					@Pc(426) int[] local426;
					if (Static75.anInt1858 <= local170) {
						local426 = Static277.anIntArrayArray40[local170];
						Static49.method990(local426, local419, local195, arg3);
						Static49.method990(local426, local410, local419, arg4);
						Static49.method990(local426, local186, local410, arg3);
					}
					if (local178 <= Static175.anInt3399) {
						local426 = Static277.anIntArrayArray40[local178];
						Static49.method990(local426, local419, local195, arg3);
						Static49.method990(local426, local410, local419, arg4);
						Static49.method990(local426, local186, local410, arg3);
					}
				} else {
					if (local170 >= Static75.anInt1858) {
						Static49.method990(Static277.anIntArrayArray40[local170], local186, local195, arg3);
					}
					if (Static175.anInt3399 >= local178) {
						Static49.method990(Static277.anIntArrayArray40[local178], local186, local195, arg3);
					}
				}
			}
		}
	}
}
