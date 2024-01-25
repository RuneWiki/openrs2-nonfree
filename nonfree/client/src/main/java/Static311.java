import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static311 {

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_161 = new Class151("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "I")
	public static int anInt5171 = 0;

	@OriginalMember(owner = "client!pl", name = "l", descriptor = "I")
	public static int anInt5172 = 0;

	@OriginalMember(owner = "client!pl", name = "n", descriptor = "[I")
	public static final int[] anIntArray310 = new int[25];

	@OriginalMember(owner = "client!pl", name = "o", descriptor = "[[I")
	public static final int[][] anIntArrayArray130 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIII)V")
	public static void method4037(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(15) int local15 = arg4 - arg0;
		@Pc(20) int local20 = arg1 - arg3;
		if (local20 == 0) {
			if (local15 != 0) {
				Static339.method4305(arg0, arg2, arg3, arg4);
			}
		} else if (local15 == 0) {
			Static97.method1395(arg2, arg1, arg0, arg3);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local20 < 0) {
				local20 = -local20;
			}
			@Pc(70) boolean local70 = local20 < local15;
			@Pc(74) int local74;
			@Pc(78) int local78;
			if (local70) {
				local74 = arg3;
				arg3 = arg0;
				local78 = arg1;
				arg0 = local74;
				arg1 = arg4;
				arg4 = local78;
			}
			if (arg3 > arg1) {
				local74 = arg3;
				local78 = arg0;
				arg3 = arg1;
				arg0 = arg4;
				arg1 = local74;
				arg4 = local78;
			}
			local74 = arg0;
			local78 = arg1 - arg3;
			@Pc(109) int local109 = arg4 - arg0;
			@Pc(114) int local114 = -(local78 >> 1);
			@Pc(121) int local121 = arg0 < arg4 ? 1 : -1;
			if (local109 < 0) {
				local109 = -local109;
			}
			@Pc(133) int local133;
			if (local70) {
				for (local133 = arg3; local133 <= arg1; local133++) {
					local114 += local109;
					Static106.anIntArrayArray46[local133][local74] = arg2;
					if (local114 > 0) {
						local114 -= local78;
						local74 += local121;
					}
				}
			} else {
				for (local133 = arg3; local133 <= arg1; local133++) {
					local114 += local109;
					Static106.anIntArrayArray46[local74][local133] = arg2;
					if (local114 > 0) {
						local74 += local121;
						local114 -= local78;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)I")
	public static int method4038(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I")
	public static int method4040() {
		return 16;
	}
}
