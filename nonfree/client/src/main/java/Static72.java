import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static72 {

	@OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
	public static int anInt1059;

	@OriginalMember(owner = "client!dh", name = "n", descriptor = "I")
	public static int anInt1049 = -1;

	@OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
	public static final int anInt1053 = 2;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!hm;IILclient!ta;Lclient!o;II)V")
	public static void method928(@OriginalArg(0) int arg0, @OriginalArg(1) Class107 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class73 arg3, @OriginalArg(5) Class85 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg4 == null) {
			return;
		}
		@Pc(27) int local27;
		if (Static139.anInt2147 == 4) {
			local27 = (int) Static99.aFloat9 & 0x3FFF;
		} else {
			local27 = (int) Static99.aFloat9 + Static20.anInt301 & 0x3FFF;
		}
		@Pc(49) int local49 = Math.max(arg1.anInt2648 / 2, arg1.anInt2606 / 2) + 10;
		@Pc(58) int local58 = arg0 * arg0 + arg6 * arg6;
		if (local58 > local49 * local49) {
			return;
		}
		@Pc(72) int local72 = Class1_Sub29.anIntArray537[local27];
		@Pc(76) int local76 = Class1_Sub29.anIntArray536[local27];
		if (Static139.anInt2147 != 4) {
			local72 = local72 * 256 / (Static265.anInt4616 + 256);
			local76 = local76 * 256 / (Static265.anInt4616 + 256);
		}
		@Pc(105) int local105 = local76 * arg0 + arg6 * local72 >> 15;
		@Pc(115) int local115 = arg6 * local76 - arg0 * local72 >> 15;
		arg4.method5403(local105 + arg1.anInt2648 / 2 + arg2 - arg4.RA() / 2, -local115 + arg1.anInt2606 / 2 + (arg5 - arg4.Q() / 2), arg3, arg2, arg5);
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIIIZ)V")
	public static void method929(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(14) int local14 = arg2 - arg4;
		@Pc(19) int local19 = arg0 - arg1;
		if (local19 == 0) {
			if (local14 != 0) {
				Static434.method5490(arg3, arg1, arg2, arg4);
			}
		} else if (local14 == 0) {
			Static446.method5650(arg0, arg3, arg1, arg4);
		} else {
			if (local19 < 0) {
				local19 = -local19;
			}
			if (local14 < 0) {
				local14 = -local14;
			}
			@Pc(69) boolean local69 = local19 < local14;
			@Pc(73) int local73;
			@Pc(75) int local75;
			if (local69) {
				local73 = arg1;
				local75 = arg0;
				arg1 = arg4;
				arg0 = arg2;
				arg4 = local73;
				arg2 = local75;
			}
			if (arg0 < arg1) {
				local73 = arg1;
				local75 = arg4;
				arg1 = arg0;
				arg0 = local73;
				arg4 = arg2;
				arg2 = local75;
			}
			local73 = arg4;
			local75 = arg0 - arg1;
			@Pc(110) int local110 = arg2 - arg4;
			@Pc(115) int local115 = -(local75 >> 1);
			if (local110 < 0) {
				local110 = -local110;
			}
			@Pc(130) int local130 = arg4 >= arg2 ? -1 : 1;
			@Pc(134) int local134;
			if (local69) {
				for (local134 = arg1; local134 <= arg0; local134++) {
					Static194.anIntArrayArray28[local134][local73] = arg3;
					local115 += local110;
					if (local115 > 0) {
						local73 += local130;
						local115 -= local75;
					}
				}
			} else {
				for (local134 = arg1; local134 <= arg0; local134++) {
					Static194.anIntArrayArray28[local73][local134] = arg3;
					local115 += local110;
					if (local115 > 0) {
						local73 += local130;
						local115 -= local75;
					}
				}
			}
		}
	}
}
