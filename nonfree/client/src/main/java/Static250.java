import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static250 {

	@OriginalMember(owner = "client!mg", name = "n", descriptor = "Lclient!wm;")
	public static final Class267 aClass267_43 = new Class267(4);

	@OriginalMember(owner = "client!mg", name = "o", descriptor = "[I")
	public static final int[] anIntArray450 = new int[] { 2047, 16383, 65535 };

	@OriginalMember(owner = "client!mg", name = "p", descriptor = "Lclient!s;")
	public static final Class217 aClass217_101 = new Class217(62, 6);

	@OriginalMember(owner = "client!mg", name = "q", descriptor = "Lclient!bj;")
	public static final Class27 aClass27_71 = new Class27(4, -1);

	@OriginalMember(owner = "client!mg", name = "r", descriptor = "I")
	public static int anInt4507 = 0;

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(IZIIII)V")
	public static void method3631(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(19) int local19 = arg4 - 334;
		if (local19 < 0) {
			local19 = 0;
		} else if (local19 > 100) {
			local19 = 100;
		}
		@Pc(45) int local45 = Static180.aShort59 + (Static345.aShort79 - Static180.aShort59) * local19 / 100;
		if (Static153.aShort42 > local45) {
			local45 = Static153.aShort42;
		} else if (local45 > Static321.aShort77) {
			local45 = Static321.aShort77;
		}
		@Pc(75) int local75 = local45 * 512 * arg4 / (arg1 * 334);
		@Pc(119) int local119;
		@Pc(126) int local126;
		@Pc(94) short local94;
		if (local75 < Static396.aShort93) {
			local94 = Static396.aShort93;
			local45 = arg1 * 334 * local94 / (arg4 * 512);
			if (local45 > Static321.aShort77) {
				local45 = Static321.aShort77;
				local119 = arg4 * local45 * 512 / (local94 * 334);
				local126 = (arg1 - local119) / 2;
				if (arg0) {
					Static412.aClass50_8.va();
					Static412.aClass50_8.method5853(arg3, arg2, -16777216, arg4, local126);
					Static412.aClass50_8.method5853(arg3, arg2 + arg1 - local126, -16777216, arg4, local126);
				}
				arg1 -= local126 * 2;
				arg2 += local126;
			}
		} else if (Static132.aShort24 < local75) {
			local94 = Static132.aShort24;
			local45 = arg1 * local94 * 334 / (arg4 * 512);
			if (Static153.aShort42 > local45) {
				local45 = Static153.aShort42;
				local119 = arg1 * local94 * 334 / (local45 * 512);
				local126 = (arg4 - local119) / 2;
				if (arg0) {
					Static412.aClass50_8.va();
					Static412.aClass50_8.method5853(arg3, arg2, -16777216, local126, arg1);
					Static412.aClass50_8.method5853(arg3 + arg4 - local126, arg2, -16777216, local126, arg1);
				}
				arg4 -= local126 * 2;
				arg3 += local126;
			}
		}
		Static18.anInt317 = (short) arg1;
		Static182.anInt3705 = arg2;
		Static139.anInt2875 = arg4 * local45 / 334;
		Static110.anInt2209 = arg3;
		Static269.anInt4734 = (short) arg4;
	}
}
