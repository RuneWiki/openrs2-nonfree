import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!maa", name = "m", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_88 = new Class100(32, 3);

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(IIZIII)V")
	public static void method5354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg4 < 1) {
			arg4 = 1;
		}
		if (arg3 < 1) {
			arg3 = 1;
		}
		@Pc(23) int local23 = arg4 - 334;
		if (local23 < 0) {
			local23 = 0;
		} else if (local23 > 100) {
			local23 = 100;
		}
		@Pc(45) int local45 = Static677.aShort125 + (Static146.aShort34 - Static677.aShort125) * local23 / 100;
		if (local45 < Static177.aShort46) {
			local45 = Static177.aShort46;
		} else if (Static657.aShort118 < local45) {
			local45 = Static657.aShort118;
		}
		@Pc(71) int local71 = arg4 * 512 * local45 / (arg3 * 334);
		@Pc(105) int local105;
		@Pc(112) int local112;
		@Pc(80) short local80;
		if (Static132.aShort27 > local71) {
			local80 = Static132.aShort27;
			local45 = local80 * 334 * arg3 / (arg4 * 512);
			if (Static657.aShort118 < local45) {
				local45 = Static657.aShort118;
				local105 = local45 * 512 * arg4 / (local80 * 334);
				local112 = (arg3 - local105) / 2;
				if (arg2) {
					Static677.aClass137_47.la();
					Static677.aClass137_47.method7869(arg1, local112, -16777216, arg0, arg4);
					Static677.aClass137_47.method7869(arg3 + arg1 - local112, local112, -16777216, arg0, arg4);
				}
				arg3 -= local112 * 2;
				arg1 += local112;
			}
		} else if (Static452.aShort83 < local71) {
			local80 = Static452.aShort83;
			local45 = local80 * arg3 * 334 / (arg4 * 512);
			if (local45 < Static177.aShort46) {
				local45 = Static177.aShort46;
				local105 = local80 * 334 * arg3 / (local45 * 512);
				local112 = (arg4 - local105) / 2;
				if (arg2) {
					Static677.aClass137_47.la();
					Static677.aClass137_47.method7869(arg1, arg3, -16777216, arg0, local112);
					Static677.aClass137_47.method7869(arg1, arg3, -16777216, arg0 + arg4 - local112, local112);
				}
				arg4 -= local112 * 2;
				arg0 += local112;
			}
		}
		Static625.anInt10537 = arg4 * local45 / 334;
		Static286.anInt4890 = (short) arg3;
		Static324.anInt6153 = arg0;
		Static240.anInt4355 = arg1;
		Static568.anInt9799 = (short) arg4;
	}

	@OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)V")
	public static void method5355(@OriginalArg(1) int arg0) {
		@Pc(11) Class14_Sub3_Sub9 local11 = Static142.method2219((long) arg0, 8);
		local11.method2822();
	}
}
